/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nd {
    private RandomAccessFile field_b;
    static int[] field_h;
    static int field_g;
    static int field_c;
    private long field_d;
    static int field_e;
    private long field_f;
    static String field_a;

    final static void b(byte param0) {
        if (param0 != 116) {
            nd.a(80, -112L);
        }
        Object var2 = null;
        wk.a((String) null, -54, "");
    }

    final long a(boolean param0) throws IOException {
        if (!param0) {
            return 65L;
        }
        return ((nd) this).field_b.length();
    }

    final int a(int param0, int param1, boolean param2, byte[] param3) throws IOException {
        int var5 = ((nd) this).field_b.read(param3, param0, param1);
        if (param2) {
            return 117;
        }
        if (var5 > 0) {
            ((nd) this).field_d = ((nd) this).field_d + (long)var5;
        }
        return var5;
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param1) {
            field_e = -116;
        }
        ((nd) this).field_b.seek(param0);
        ((nd) this).field_d = param0;
    }

    final static void a(int param0, long param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        if (param0 >= 113) {
          try {
            Thread.sleep(param1);
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          var3 = (InterruptedException) (Object) decompiledCaughtException;
        } else {
          return;
        }
    }

    final void a(byte param0) throws IOException {
        if (((nd) this).field_b != null) {
            ((nd) this).field_b.close();
            ((nd) this).field_b = null;
        }
        if (param0 != 47) {
            nd.a(-44);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((nd) this).field_b == null)) {
            System.out.println("");
            ((nd) this).a((byte) 47);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_a = null;
        field_h = null;
    }

    nd(File param0, String param1, long param2) throws IOException {
        if (0L == (param2 ^ -1L)) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((nd) this).field_b = new RandomAccessFile(param0, param1);
        ((nd) this).field_f = param2;
        ((nd) this).field_d = 0L;
        int var5 = ((nd) this).field_b.read();
        if (0 != (var5 ^ -1)) {
            if (!param1.equals((Object) (Object) "r")) {
                ((nd) this).field_b.seek(0L);
                ((nd) this).field_b.write(var5);
            }
        }
        ((nd) this).field_b.seek(0L);
    }

    final static void a(boolean param0, String param1) {
        wl.a(param1, 10);
        if (!param0) {
            field_a = null;
        }
        gh.a((byte) -116, nk.field_c, false);
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        if (!(((nd) this).field_f >= (long)param2 + ((nd) this).field_d)) {
            ((nd) this).field_b.seek(((nd) this).field_f);
            ((nd) this).field_b.write(1);
            throw new EOFException();
        }
        if (param3 != -59) {
            return;
        }
        ((nd) this).field_b.write(param0, param1, param2);
        ((nd) this).field_d = ((nd) this).field_d + (long)param2;
    }

    final static void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var8 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = TorChallenge.field_F ? 1 : 0;
        int var3 = 32 + param1;
        int var4 = 32 + param2;
        if (null == qe.field_A) {
            qe.field_A = new int[256];
            for (var5 = 0; -257 < (var5 ^ -1); var5++) {
                qe.field_A[var5] = var5 * 65793;
            }
        }
        var5 = 0;
        var5 = 28 - -((32 - hc.field_S) / 8);
        qg.a(32 + var3 << -996593372, 32 + var4 << 1337378180, var5 << -1975178812, 255, qe.field_A);
        if (param0 != -996593372) {
            return;
        }
        for (var8 = 0; var8 < 10; var8++) {
            var6 = e.b((byte) 57, 2 * var5);
            var7 = e.b((byte) 57, 2 * var5);
            qg.a(var6 + (-var5 + var3 + 32) << 298013892, var7 + -var5 + (32 + var4) << -334925372, 64, 128, qe.field_A);
        }
    }

    final static vg a(pa param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        var2 = param0.e(8, -97);
        if (0 >= var2) {
          L0: {
            if (param1 == -25) {
              break L0;
            } else {
              nd.a(-79, 91L);
              break L0;
            }
          }
          L1: {
            var3 = fl.a(param0, (byte) 117) ? 1 : 0;
            var4 = fl.a(param0, (byte) 116) ? 1 : 0;
            var5 = new vg();
            var5.field_d = (short)param0.e(16, param1 + 144);
            var5.field_g = ui.a(param0, -119, var5.field_g, 16);
            var5.field_t = ui.a(param0, -103, var5.field_t, 16);
            var5.field_q = ui.a(param0, -101, var5.field_q, 16);
            var5.field_x = (short)param0.e(16, -39);
            var5.field_i = ui.a(param0, -95, var5.field_i, 16);
            var5.field_w = ui.a(param0, param1 ^ 127, var5.field_w, 16);
            var5.field_F = ui.a(param0, -126, var5.field_F, 16);
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_c = (short)param0.e(16, 117);
              var5.field_L = ui.a(param0, -118, var5.field_L, 16);
              var5.field_r = ui.a(param0, -122, var5.field_r, 16);
              var5.field_D = ui.a(param0, -121, var5.field_D, 16);
              var5.field_f = ui.a(param0, -97, var5.field_f, 16);
              var5.field_k = ui.a(param0, -100, var5.field_k, 16);
              var5.field_G = ui.a(param0, -104, var5.field_G, 16);
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              int discarded$1 = param0.e(16, -26);
              var5.field_I = ui.a(param0, -102, var5.field_I, 16);
              var5.field_H = ui.a(param0, param1 ^ 105, var5.field_H, 16);
              var5.field_m = ui.a(param0, -111, var5.field_m, 16);
              var5.field_n = ui.a(param0, -123, var5.field_n, 16);
              var5.field_j = ui.a(param0, -95, var5.field_j, 16);
              break L2;
            }
          }
          L3: {
            if (!fl.a(param0, (byte) 121)) {
              break L3;
            } else {
              var5.field_M = ui.a(param0, -92, var5.field_M, 16);
              break L3;
            }
          }
          L4: {
            if (!fl.a(param0, (byte) 107)) {
              break L4;
            } else {
              var5.field_z = hf.a(param1 + 24, var5.field_z, 16, param0);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_z.length) {
                  if (0 == var6) {
                    var5.field_z = null;
                    break L4;
                  } else {
                    var5.field_s = (byte)(1 + var6);
                    break L4;
                  }
                } else {
                  if ((var5.field_z[var7] & 255) > var6) {
                    var6 = 255 & var5.field_z[var7];
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_h = new int[]{32, 2048, 131072, 8388608, 536870912, 8};
        field_a = "Create a free Account";
    }
}
