/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ArchiveFactoryHelpers {
    static String field_c;
    static int field_b;
    static String field_d;
    static char[] field_e;
    static String field_f;
    static String field_a;

    final static Js5Archive createResourceArchive(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveSource var8 = null;
          Js5Archive stackIn_17_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (null != HuffmanCodec.field_a.field_c) {
              PlayerContextMenu.field_l = new BufferedFile(HuffmanCodec.field_a.field_c, 5200, 0);
              HuffmanCodec.field_a.field_c = null;
              var6 = new SectorCacheStore(255, PlayerContextMenu.field_l, new BufferedFile(HuffmanCodec.field_a.field_j, 12000, 0), 2097152);
            }
            if (param3 > -56) {
              field_f = (String) null;
            }
            if (PlayerContextMenu.field_l != null) {
              if (BackgroundParticle.field_n == null) {
                BackgroundParticle.field_n = new BufferedFile[HuffmanCodec.field_a.field_i.length];
              }
              if (BackgroundParticle.field_n[param2] == null) {
                BackgroundParticle.field_n[param2] = new BufferedFile(HuffmanCodec.field_a.field_i[param2], 12000, 0);
                HuffmanCodec.field_a.field_i[param2] = null;
              }
              var7 = new SectorCacheStore(param2, PlayerContextMenu.field_l, BackgroundParticle.field_n[param2], 2097152);
            }
            var8 = DialWidgetPainter.field_q.openProvider(72, param2, param1, (SectorCacheStore) (var6), (SectorCacheStore) (var7));
            if (param5) {
              var8.startPrefetch(true);
            }
            stackIn_17_0 = new Js5Archive(var8, param4, param0);
            return stackIn_17_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        field_c = null;
        if (param0 > -42) {
          return;
        }
        field_d = null;
        field_a = null;
    }

    final static void openAccountCreation(boolean param0) {
        UrlRewriteHelpers.field_b = new AccountCreationForm();
        UiWidget.field_t.transitionToContent(UrlRewriteHelpers.field_b, (byte) -53);
        if (param0) {
          field_d = (String) null;
        }
    }

    final static byte[] copyBytes(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length;
          var3 = new byte[var2_int];
          ArraySupport.copy(param0, param1, var3, 0, var2_int);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("va.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "<%0> has declined the invitation.";
        field_f = "Confirm Password: ";
        field_e = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_a = "Game options changed (<%0>)";
    }
}
