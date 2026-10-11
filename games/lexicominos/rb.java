/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ng field_b;
    static byte[][] field_c;
    static dg field_d;
    static String field_e;
    static int field_a;

    final static void a(byte param0, String param1) {
        try {
          sa.a((byte) 68, param1);
          int var2_int = -34 / ((-25 - param0) / 58);
          m.a(ca.field_o, -127, false);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "rb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static db[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int var9 = 0;
        db[] var10 = null;
        db[] var11_ref_db__ = null;
        int var11 = 0;
        int var12 = 0;
        db var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = Lexicominos.field_L ? 1 : 0;
        var9 = param1 + (param0 + param3);
        var10 = new db[]{new db(var9, var9), new db(param7, var9), new db(var9, var9), new db(var9, param7), new db(64, 64), new db(var9, param7), new db(var9, var9), new db(param7, var9), new db(var9, var9)};
        var11_ref_db__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 < var11_ref_db__.length) {
            var13 = var11_ref_db__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break L0;
            }
            var14 = stackIn_11_0;
            while (var14 < var13.field_y.length) {
              var13.field_y[var14] = param2;
              var14++;
            }
            var12++;
            continue L0;
          }
          stackIn_11_0 = 0;
          break;
        }
        var11 = stackIn_11_0;
        L6: while (true) {
          if (param0 > var11) {
            stackIn_22_0 = 0;
            if (var15 != 0) {
              break L6;
            }
            var12Lifetime1 = stackIn_22_0;
            while (var9 > var12Lifetime1) {
              var10[6].field_y[var9 * (-var11 + (var9 - 1)) + var12Lifetime1] = param6;
              var10[8].field_y[var9 * (-1 + var9 - var11) + var12Lifetime1] = param6;
              var10[2].field_y[-var11 - (1 - var9 - var9 * var12Lifetime1)] = param6;
              var10[8].field_y[var9 - 1 - var11 + var12Lifetime1 * var9] = param6;
              var12Lifetime1++;
            }
            var11++;
            continue L6;
          }
          stackIn_22_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_22_0;
        while (true) {
          stackIn_24_0 = param0;
          stackIn_24_1 = var11Lifetime1;
          if (stackIn_24_0 > stackIn_24_1) {
            stackIn_34_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_34_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_y[var12Lifetime2 + var9 * var11Lifetime1] = param4;
                var10[0].field_y[var11Lifetime1 + var9 * var12Lifetime2] = param4;
                stackIn_24_0 = ~var12Lifetime2;
                stackIn_24_1 = ~(-var11Lifetime1 + var9);
                if (stackIn_24_0 > stackIn_24_1) {
                  var10[2].field_y[var9 * var11Lifetime1 + var12Lifetime2] = param4;
                  var10[6].field_y[var12Lifetime2 * var9 + var11Lifetime1] = param4;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_34_0 = 0;
          }
          var11Lifetime1 = stackIn_34_0;
          L19: while (true) {
            if (param7 > var11Lifetime1) {
              stackIn_45_0 = 0;
              if (var15 != 0) {
                break L19;
              }
              var12Lifetime2Lifetime1 = stackIn_45_0;
              while (param0 > var12Lifetime2Lifetime1) {
                var10[7].field_y[var11Lifetime1 + (-1 - var12Lifetime2Lifetime1 + var9) * param7] = param6;
                var10[5].field_y[-var12Lifetime2Lifetime1 - 1 + var9 + var9 * var11Lifetime1] = param6;
                var10[1].field_y[var11Lifetime1 + var12Lifetime2Lifetime1 * param7] = param4;
                var10[3].field_y[var12Lifetime2Lifetime1 + var11Lifetime1 * var9] = param4;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue L19;
            }
            stackIn_45_0 = param5;
            break;
          }
          if (stackIn_45_0 != 1) {
            return (db[]) null;
          }
          var11Lifetime1 = 0;
          L25: while (param7 >> 1 > var11Lifetime1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (param1 > var12Lifetime2Lifetime2) {
                var10[1].field_y[var11Lifetime1 + param7 * (var9 + (-var12Lifetime2Lifetime2 - 1))] = param8;
                var10[3].field_y[-var12Lifetime2Lifetime2 + (var9 - (1 - var11Lifetime1 * var9))] = param8;
                var10[7].field_y[var11Lifetime1 + var12Lifetime2Lifetime2 * param7] = param8;
                var10[5].field_y[var11Lifetime1 * var9 + var12Lifetime2Lifetime2] = param8;
                var12Lifetime2Lifetime2++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var11Lifetime1++;
              }
              break;
            }
            if (var15 == 0) {
              continue L25;
            }
            break;
          }
          return var10;
        }
    }

    final static void a(boolean param0) {
        cg var1 = (cg) (ca.field_n.a(true));
        if (var1 == null) {
          ck.$cfr$intArgs$b$e683eeaaf5b5(-120);
          return;
        }
        th var2 = ig.field_a;
        if (param0) {
          String var3 = (String) null;
          rb.a((byte) -12, (String) null);
        }
        var2.d((byte) 19);
        var2.d((byte) 19);
        var2.d((byte) 19);
        var2.d((byte) 19);
        var1.b((byte) -121);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != 50) {
          field_b = (ng) null;
        }
        field_e = null;
        field_c = (byte[][]) null;
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        wj.c(param3 ^ -8662);
        if (param3 != 14635) {
          return;
        }
        try {
          ug.field_A.h(0);
          eb.field_b = new ti(dd.field_d, (String) null, ca.field_k, param2, param1);
          di.field_x = new qj(ug.field_A, eb.field_b);
          ug.field_A.a(-14579, di.field_x);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "rb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = new byte[250][];
        field_b = new ng();
        field_d = new dg();
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
