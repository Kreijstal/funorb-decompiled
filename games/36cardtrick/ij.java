/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static bk field_h;
    static String[] field_a;
    static String field_d;
    static boolean field_g;
    static nc field_i;
    static int field_e;
    static int[] field_c;
    static String field_b;
    static vg field_f;

    final static String a(byte param0) {
        java.awt.Component var2 = null;
        if (jc.field_P != hh.field_g) {
          if (hh.field_g == ei.field_d) {
            return dj.field_e;
          } else {
            if (wh.field_a.a(640)) {
              if (param0 <= 109) {
                var2 = (java.awt.Component) null;
                kh discarded$2 = ij.a(-89, (java.awt.Component) null, 47, 123);
                return ng.field_y;
              } else {
                return ng.field_y;
              }
            } else {
              return dj.field_e;
            }
          }
        } else {
          return ji.field_b;
        }
    }

    final static kh a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            kh var5 = null;
            jf var5_ref = null;
            kh stackIn_2_0 = null;
            kh stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            kh stackOut_1_0 = null;
            kh stackOut_3_0 = null;
            try {
              var4 = Class.forName("el");
              if (param0 <= -49) {
                return (kh) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = (kh) null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var5 = (kh) var4.newInstance();
              var5.a(param1, param2, (byte) 68, param3);
              stackOut_3_0 = (kh) var5;
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(int param0) {
        field_c = null;
        field_i = null;
        if (param0 != 3) {
          return;
        } else {
          field_a = null;
          field_f = null;
          field_h = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(kc param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        if (-1 != (3 & (((kc) param0).field_n | (((kc) param0).field_q | (((kc) param0).field_p | ((kc) param0).field_o))) ^ -1)) {
          var2 = (3 & ((kc) param0).field_q) + ((kc) param0).field_p;
          var3 = ((kc) param0).field_o + (3 & ((kc) param0).field_n);
          var2 = 4 - (3 & var2) + var2;
          if (param1 < 113) {
            return;
          } else {
            var3 = var3 - (3 & var3) - -4;
            var4 = new int[var2 * var3];
            var5 = 0;
            var6 = (3 & ((kc) param0).field_q) - -((((kc) param0).field_n & 3) * var2);
            var7 = 0;
            L0: while (true) {
              if (((kc) param0).field_o <= var7) {
                ((kc) param0).field_n = ((kc) param0).field_n & -4;
                param0.field_p = var2;
                param0.field_r = var4;
                param0.field_o = var3;
                ((kc) param0).field_q = ((kc) param0).field_q & -4;
                return;
              } else {
                var8 = 0;
                L1: while (true) {
                  if (((kc) param0).field_p <= var8) {
                    var6 = var6 + (-((kc) param0).field_p + var2);
                    var7++;
                    continue L0;
                  } else {
                    var6++;
                    var5++;
                    var4[var6] = ((kc) param0).field_r[var5];
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new bk();
        field_a = new String[16];
        field_d = "Friends can be added in multiplayer<nbsp>games";
        field_e = 0;
        field_g = false;
        field_b = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_i = new nc();
    }
}
