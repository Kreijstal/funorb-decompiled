/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String[] field_b;
    static String field_e;
    int field_a;
    static int[] field_f;
    static String field_c;
    static String[] field_d;

    final static byte[] a(mg param0, byte[] param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var4 = param0.g(param2, -11719);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (var4 == param1.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param0.g(3, -11719);
            var6 = (byte)param0.g(8, -11719);
            if (0 >= var5) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param1[var7] = (byte)var6;
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (byte)(param0.g(var5, param3 + -11730) + var6);
                  var7++;
                  continue L4;
                }
              }
            }
          }
          if (param3 == 11) {
            return param1;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    sd(int param0) {
        ((sd) this).field_a = param0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            byte[] discarded$0 = sd.a((mg) null, (byte[]) null, 19, (byte) -77);
        }
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Jump into the captured enemies for larger crystals.";
        field_f = new int[8192];
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = "Logging in...";
    }
}
