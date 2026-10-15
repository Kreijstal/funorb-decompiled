/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ResourceArchiveFactory {
    static char currentKeyCharacter;
    static String field_f;
    static int field_c;
    static int field_e;
    static RgbSprite waterRaysSprite;
    static BufferedFile field_a;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        waterRaysSprite = null;
        if (param0 != -7393) {
          currentKeyCharacter = '￾';
        }
    }

    final static String readIncomingString(byte obfuscationGuard) {
        int var1 = -46 % ((53 - obfuscationGuard) / 63);
        return jl.incomingPackets.readCp1252String(-1);
    }

    final static ResourceArchive createResourceArchive(boolean prefetch, int archiveId, boolean cleanupEnabled, int decodedFilePolicy, boolean discardPackedGroups, boolean obfuscationGuard) {
        try {
          Object indexCacheOrFailure = null;
          Object groupCache = null;
          CachedArchiveSource source = null;
          ResourceArchive archiveResult = null;
          Throwable caughtFailure = null;
          try {
            indexCacheOrFailure = null;
            groupCache = null;
            if (DialogMessagePanel.field_P.field_q != null) {
              Widget.field_k = new BufferedFile(DialogMessagePanel.field_P.field_q, 5200, 0);
              DialogMessagePanel.field_P.field_q = null;
              indexCacheOrFailure = new FileCacheStore(255, Widget.field_k, new BufferedFile(DialogMessagePanel.field_P.field_m, 12000, 0), 2097152);
            }
            if (Widget.field_k != null) {
              if (ClientException.field_g == null) {
                ClientException.field_g = new BufferedFile[DialogMessagePanel.field_P.field_s.length];
              }
              if (ClientException.field_g[archiveId] == null) {
                ClientException.field_g[archiveId] = new BufferedFile(DialogMessagePanel.field_P.field_s[archiveId], 12000, 0);
                DialogMessagePanel.field_P.field_s[archiveId] = null;
              }
              groupCache = new FileCacheStore(archiveId, Widget.field_k, ClientException.field_g[archiveId], 2097152);
            }
            if (!obfuscationGuard) {
              ResourceArchiveFactory.a(78);
            }
            source = HalloweenBackground.archiveSourceManager.getArchiveSource(81, cleanupEnabled, (FileCacheStore) (indexCacheOrFailure), archiveId, (FileCacheStore) (groupCache));
            if (prefetch) {
              source.startPrefetch(-10476);
            }
            archiveResult = new ResourceArchive(source, discardPackedGroups, decodedFilePolicy);
            return archiveResult;
          } catch (java.io.IOException ioFailure) {
            caughtFailure = ioFailure;
            indexCacheOrFailure = (IOException) (Object) caughtFailure;
            throw new RuntimeException(((IOException) (indexCacheOrFailure)).toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    static {
        field_e = 0;
        field_f = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
