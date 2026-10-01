import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';
import {generateReadable} from './tools/readable-java.mjs';
import {captureProcess} from './tools/lib/capture-process.mjs';

const root = fileURLToPath(new URL('./', import.meta.url));
const repository = path.resolve(root, '..');
const args = process.argv.slice(2);
const check = args.includes('--check');
const positional = args.filter(arg => arg !== '--check');
if (positional.length > 1 || positional.some(arg => arg.startsWith('--')))
  throw new Error('Usage: node readable/reproduce-geoblox.mjs [OUTPUT] [--check]');
const output = positional[0] ? path.resolve(positional[0]) : path.join(root, 'geoblox');
const digest = bytes => crypto.createHash('sha256').update(bytes).digest('hex');
const temporary = fs.mkdtempSync(path.join(os.tmpdir(), 'funorb-readable-input-'));
try {
  const rulesFile = path.join(root, 'geoblox-rules.json');
  const rules = JSON.parse(fs.readFileSync(rulesFile));
  const sourcePin = JSON.parse(fs.readFileSync(path.join(root, 'geoblox-source-pin.json')));
  if (rules.source.commit !== sourcePin.commit ||
      rules.source.repository !== sourcePin.sourceRepository ||
      rules.source.subdirectory !== sourcePin.subdirectory ||
      rules.inputTreeSha256 !== sourcePin.inputTreeSha256 ||
      !/^[a-f0-9]{40}$/.test(sourcePin.commit) || sourcePin.subdirectory !== 'games/geoblox')
    throw new Error('Rules do not match the frozen publication input');
  const toolRoot = path.join(root, 'tools');
  const toolPin = JSON.parse(fs.readFileSync(path.join(toolRoot, 'PIN.json')));
  for (const filename of ['readable-java.mjs', 'lib/ReadableJava.java', 'lib/capture-process.mjs'])
    if (digest(fs.readFileSync(path.join(toolRoot, filename))) !== toolPin.files[filename])
      throw new Error(`Frozen naming tool changed: ${filename}`);
  const classpath = path.join(root, 'funorb-stubs.jar');
  if (digest(fs.readFileSync(classpath)) !== sourcePin.stubJarSha256)
    throw new Error('Frozen compilation dependency changed');
  // Later changes under games/ must not change this export's pinned input.
  const archive = path.join(temporary, 'input.tar');
  captureProcess('git', ['-C', repository, 'archive', '--format=tar', '--output=' + archive,
    sourcePin.commit, sourcePin.subdirectory]);
  captureProcess('tar', ['-xf', archive, '-C', temporary]);
  console.log(JSON.stringify(generateReadable({
    input: path.join(temporary, sourcePin.subdirectory), output, rulesFile, classpath, check,
  })));
} catch (error) {
  console.error(error.stderr?.toString() || error.message);
  process.exitCode = 1;
} finally {
  fs.rmSync(temporary, {recursive: true, force: true});
}
