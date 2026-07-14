/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static va field_b;
    static int[] field_c;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 24009) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static oe a(boolean param0, float param1, oe param2) {
        oe var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var3 = new oe(param2.field_e * param1, param2.field_b, param2.field_c);
        gk.field_d[0] = (float)param2.field_k.field_h;
        gk.field_d[1] = (float)param2.field_l.field_h;
        gk.field_d[2] = (float)param2.field_m.field_h;
        var4 = (int)lk.a(gk.field_d, 0, 1, -1, param1);
        var5 = (int)lk.a(gk.field_d, 0, 2, -1, param1);
        gk.field_d[0] = (float)param2.field_k.field_f;
        gk.field_d[1] = (float)param2.field_l.field_f;
        gk.field_d[2] = (float)param2.field_m.field_f;
        if (param0) {
          return null;
        } else {
          var6 = (int)lk.a(gk.field_d, 0, 1, -1, param1);
          var7 = (int)lk.a(gk.field_d, 0, 2, -1, param1);
          var3.field_k = new qm(param2.field_k);
          var3.field_l = new qm(var4, var6);
          var3.field_m = new qm(var5, var7);
          return var3;
        }
    }

    final static String a(byte param0, char param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = HoldTheLine.field_D;
        var4 = param2.length();
        var5 = param3.length();
        var6 = var4;
        var7 = var5 + -1;
        if (var7 != 0) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param2.indexOf((int) param1, var8_int);
            if (var8_int >= 0) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              L1: {
                if (param0 >= 17) {
                  var8 = new StringBuilder(var6);
                  var9 = 0;
                  break L1;
                } else {
                  var12 = null;
                  oe discarded$8 = ua.a(false, -0.35584643483161926f, (oe) null);
                  var8 = new StringBuilder(var6);
                  var9 = 0;
                  break L1;
                }
              }
              L2: while (true) {
                var10 = param2.indexOf((int) param1, var9);
                if (var10 >= 0) {
                  StringBuilder discarded$9 = var8.append(param2.substring(var9, var10));
                  StringBuilder discarded$10 = var8.append(param3);
                  var9 = 1 + var10;
                  continue L2;
                } else {
                  StringBuilder discarded$11 = var8.append(param2.substring(var9));
                  return var8.toString();
                }
              }
            }
          }
        } else {
          L3: {
            if (param0 >= 17) {
              var8 = new StringBuilder(var6);
              var9 = 0;
              break L3;
            } else {
              var12 = null;
              oe discarded$12 = ua.a(false, -0.35584643483161926f, (oe) null);
              var8 = new StringBuilder(var6);
              var9 = 0;
              break L3;
            }
          }
          L4: while (true) {
            var10 = param2.indexOf((int) param1, var9);
            if (var10 >= 0) {
              StringBuilder discarded$13 = var8.append(param2.substring(var9, var10));
              StringBuilder discarded$14 = var8.append(param3);
              var9 = 1 + var10;
              continue L4;
            } else {
              StringBuilder discarded$15 = var8.append(param2.substring(var9));
              return var8.toString();
            }
          }
        }
    }

    static {
    }
}
