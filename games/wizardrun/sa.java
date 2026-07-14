/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    kl field_a;
    String field_f;
    String field_h;
    static String field_b;
    static java.awt.Color field_e;
    String field_d;
    static kd field_g;
    int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 != -118) {
            field_g = null;
        }
        field_g = null;
    }

    final static short[] a(int param0, byte param1, mg param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var4 = param2.g(param0, -11719);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param3.length == var4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          var5 = param2.g(4, -11719);
          var6 = (short)param2.g(16, -11719);
          if (param1 == -48) {
            L2: {
              if (-1 <= (var5 ^ -1)) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (short)var6;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param3[var7] = (short)(param2.g(var5, -11719) + var6);
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param3;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private sa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Connection timed out. Please try using a different server.";
        field_e = new java.awt.Color(10040319);
        field_g = new kd();
    }
}
