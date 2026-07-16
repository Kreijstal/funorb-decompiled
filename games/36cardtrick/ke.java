/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static qa field_c;
    private int[] field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = Main.field_T;
        param11 = (16711935 & param3 * (param11 & 16711935) >> -574526776) - -((16711925 & (param11 & 65280) * param3) >> -703331480);
        param3 = -param3 + 256;
        var13 = param2;
        var14 = 37 % ((param4 - -19) / 61);
        var15 = -param0;
        L0: while (true) {
          if ((var15 ^ -1) <= -1) {
            return;
          } else {
            int incrementValue$2 = param9;
            param9++;
            if ((incrementValue$2 ^ -1) != (param10 ^ -1)) {
              param2 = var13;
              var16 = -param7;
              L1: while (true) {
                if ((var16 ^ -1) <= -1) {
                  var15++;
                  param6 = param6 + param1;
                  continue L0;
                } else {
                  int incrementValue$3 = param2;
                  param2++;
                  if ((incrementValue$3 ^ -1) != (param10 ^ -1)) {
                    L2: {
                      var17 = param8[param6];
                      if ((param5 ^ -1) != (var17 ^ -1)) {
                        param8[param6] = bc.a(param3 * bc.a(var17, 65280) >> 1542353864, 65280) + bc.a(bc.a(16711935, var17) * param3 >> 1595916328, 16711935) + param11;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var16++;
                    param6++;
                    continue L1;
                  } else {
                    L3: {
                      var17 = param12;
                      if (-1 > (var16 - -param12 ^ -1)) {
                        var17 = -var16;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    param6 = param6 + var17;
                    param2 = 0;
                    var16 = var16 + var17;
                    continue L1;
                  }
                }
              }
            } else {
              param9 = 0;
              var15 = var15 + param12;
              param6 = param6 + param12 * vj.field_l;
              continue L0;
            }
          }
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        if (param0 == -100) {
          var3 = (((ke) this).field_a.length >> 434476833) + -1;
          var4 = var3 & param1;
          L0: while (true) {
            var5 = ((ke) this).field_a[var4 + (var4 - -1)];
            if (var5 != -1) {
              if (((ke) this).field_a[var4 + var4] == param1) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return 73;
        }
    }

    public static void a(byte param0) {
        if (param0 > -6) {
            field_c = null;
        }
        field_b = null;
        field_c = null;
    }

    final static void a(dh param0, int param1, int param2) {
        w var5 = na.field_r;
        var5.h(param1, 0);
        var5.field_i = var5.field_i + 1;
        int var4 = var5.field_i;
        if (param2 != 21719) {
            field_c = null;
        }
        var5.b(param2 ^ -28716, 1);
        var5.b(param2 ^ -28716, param0.field_n);
        var5.b(-9469, param0.field_l);
        var5.a(-246, param0.field_j);
        var5.a(-246, param0.field_i);
        var5.a(-246, param0.field_p);
        var5.a(-246, param0.field_h);
        int discarded$0 = var5.b(var4, (byte) 5);
        var5.f(-var4 + var5.field_i, param2 ^ 19366);
    }

    ke(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while (var2 <= (param0.length >> -2061894111) + param0.length) {
            var2 = var2 << 1;
        }
        ((ke) this).field_a = new int[var2 + var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((ke) this).field_a[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = param0[var3] & -1 + var2;
            while (-1 != ((ke) this).field_a[var4 + var4 - -1]) {
                var4 = var2 - 1 & var4 - -1;
            }
            ((ke) this).field_a[var4 + var4] = param0[var3];
            ((ke) this).field_a[var4 + (var4 - -1)] = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new qa("email");
        field_b = "Names should contain a maximum of 12 characters";
    }
}
