/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static String field_d;
    static ak field_a;
    static int[] field_c;
    static fl field_e;
    static kk field_b;

    final static void a(jl param0, int param1, byte param2, mn param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          if (param2 == -92) {
            break L0;
          } else {
            an.a(-43);
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (param4.length() <= var7) {
            return;
          } else {
            L2: {
              var8 = param4.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = param3.field_g[0] + ((var5 >> -475583384) + param0.c(param4.substring(0, var7)));
                break L2;
              }
            }
            L3: {
              if (0 != (var6 ^ -1)) {
                param3.field_g[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (var8 != 32) {
                    break L4;
                  } else {
                    var5 = var5 + param1;
                    break L4;
                  }
                }
                param3.field_g[var7] = param3.field_g[0] + ((var5 >> -44774136) + param0.c(param4.substring(0, var7 + 1)) + -param0.a((char) var8));
                break L3;
              }
            }
            if (62 == var8) {
              var6 = -1;
              var7++;
              var7++;
              continue L1;
            } else {
              var7++;
              var7++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_d = null;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != -1) {
          field_b = null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> has declined the invitation.";
    }
}
