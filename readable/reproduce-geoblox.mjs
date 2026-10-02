import fs from 'node:fs';
import os from 'node:os';
import path from 'node:path';
import crypto from 'node:crypto';
import {fileURLToPath} from 'node:url';
import {generateReadable} from './tools/readable-java.mjs';
import {captureProcess} from './tools/lib/capture-process.mjs';
import {validateManifest} from './build-geoblox-rules.mjs';
import {validateTextResourceEvidence} from './text-resource-evidence.mjs';

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
  const rules = validateManifest(JSON.parse(fs.readFileSync(rulesFile)));
  const publication = rules.publication;
  const classpath = path.join(root, 'funorb-stubs.jar');
  if (digest(fs.readFileSync(classpath)) !== publication.stubJarSha256)
    throw new Error('Frozen compilation dependency changed');
  const archive = path.join(temporary, 'input.tar');
  captureProcess('git', ['-C', repository, 'archive', '--format=tar', '--output=' + archive,
    rules.source.commit, rules.source.subdirectory]);
  captureProcess('tar', ['-xf', archive, '-C', temporary]);
  const input = path.join(temporary, rules.source.subdirectory);
  for (const item of publication.sourceEvidence)
    if (digest(fs.readFileSync(path.join(input, item.file))) !== item.sha256)
      throw new Error(`Reviewed source differs: ${item.file}`);
  const text = publication.textResources;
  if (!text) throw new Error('Missing current text-resource evidence');
  validateTextResourceEvidence(fs.readFileSync(path.join(input, 'wi.java'), 'utf8'), text, rules.renames);
  console.log(JSON.stringify(generateReadable({input, output, rulesFile, classpath, check})));
} catch (error) {
  console.error(error.stderr?.toString() || error.message);
  process.exitCode = 1;
} finally { fs.rmSync(temporary, {recursive: true, force: true}); }
