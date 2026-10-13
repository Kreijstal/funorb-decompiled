/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class go {
    static char currentKeyCharacter;
    static String field_f;
    static int field_c;
    static int field_e;
    static RgbSprite field_d;
    static jg field_a;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 != -7393) {
          currentKeyCharacter = '￾';
        }
    }

    final static String a(byte param0) {
        int var1 = -46 % ((53 - param0) / 63);
        return jl.field_e.readCp1252String(-1);
    }

    final static ResourceArchive a(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveSource var8 = null;
          ResourceArchive stackIn_14_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (ec.field_P.field_q != null) {
              oc.field_k = new jg(ec.field_P.field_q, 5200, 0);
              ec.field_P.field_q = null;
              var6 = new FileCacheStore(255, oc.field_k, new jg(ec.field_P.field_m, 12000, 0), 2097152);
            }
            if (oc.field_k != null) {
              if (ClientException.field_g == null) {
                ClientException.field_g = new jg[ec.field_P.field_s.length];
              }
              if (ClientException.field_g[param1] == null) {
                ClientException.field_g[param1] = new jg(ec.field_P.field_s[param1], 12000, 0);
                ec.field_P.field_s[param1] = null;
              }
              var7 = new FileCacheStore(param1, oc.field_k, ClientException.field_g[param1], 2097152);
            }
            if (!param5) {
              go.a(78);
            }
            var8 = dp.field_v.a(81, param2, (FileCacheStore) (var6), param1, (FileCacheStore) (var7));
            if (param0) {
              var8.startPrefetch(-10476);
            }
            stackIn_14_0 = new ResourceArchive(var8, param4, param3);
            return stackIn_14_0;
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

    static {
        field_e = 0;
        field_f = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
