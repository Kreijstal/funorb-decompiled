/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    int field_C;
    static ha field_v;
    boolean[] field_n;
    byte[][] field_e;
    int field_f;
    byte[] field_B;
    int field_m;
    int[] field_A;
    int field_h;
    byte[] field_c;
    int field_o;
    int field_i;
    int field_b;
    byte[] field_G;
    int field_E;
    int[] field_g;
    int field_F;
    int field_u;
    int field_w;
    int field_l;
    byte[] field_a;
    int[][] field_p;
    int[] field_k;
    int[][] field_j;
    int field_t;
    boolean[] field_d;
    byte[] field_r;
    int[][] field_y;
    byte[] field_q;
    byte field_z;
    static int field_s;
    int field_D;
    int field_x;
    int[] field_H;

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            Object stackOut_2_0 = null;
            var8 = Bounce.field_N;
            try {
              L0: {
                var9 = param1.getParameter("cookieprefix");
                if (param0) {
                  var3 = var9 + "settings";
                  var4 = (String) ac.a(param1, "getcookies", -31185);
                  var5 = di.a(-116, ';', var4);
                  var6 = 0;
                  L1: while (true) {
                    if (var6 >= var5.length) {
                      break L0;
                    } else {
                      L2: {
                        var7 = var5[var6].indexOf('=');
                        if ((var7 ^ -1) > -1) {
                          break L2;
                        } else {
                          if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                            break L2;
                          } else {
                            stackOut_8_0 = var5[var6].substring(var7 + 1).trim();
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          }
                        }
                      }
                      var6++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_2_0 = null;
                  stackIn_3_0 = stackOut_2_0;
                  return (String) (Object) stackIn_3_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2 = decompiledCaughtException;
                break L3;
              }
            }
            if (jg.field_B == null) {
              return param1.getParameter("settings");
            } else {
              return jg.field_B;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_v = null;
        if (param0 <= 36) {
            field_s = -35;
        }
    }

    uj() {
        ((uj) this).field_n = new boolean[16];
        ((uj) this).field_G = new byte[4096];
        ((uj) this).field_c = new byte[18002];
        ((uj) this).field_B = new byte[18002];
        ((uj) this).field_e = new byte[6][258];
        ((uj) this).field_g = new int[6];
        ((uj) this).field_j = new int[6][258];
        ((uj) this).field_a = new byte[256];
        ((uj) this).field_p = new int[6][258];
        ((uj) this).field_y = new int[6][258];
        ((uj) this).field_t = 0;
        ((uj) this).field_d = new boolean[256];
        ((uj) this).field_k = new int[16];
        ((uj) this).field_H = new int[257];
        ((uj) this).field_A = new int[256];
        ((uj) this).field_C = 0;
    }

    static {
    }
}
