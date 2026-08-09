/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur extends rqa {
    final static wma a(faa param0, byte param1) {
        wma stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wma var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var2_int = param0.i(0, 8);
            if (var2_int <= 0) {
              L1: {
                var3 = kv.a(false, param0) ? 1 : 0;
                var4 = kv.a(false, param0) ? 1 : 0;
                var5 = new wma();
                var5.field_J = (short)param0.i(0, 16);
                var5.field_r = et.a(param0, 16, 24, var5.field_r);
                var5.field_o = et.a(param0, 16, 24, var5.field_o);
                var5.field_p = et.a(param0, 16, 24, var5.field_p);
                var6 = -116 / ((-14 - param1) / 61);
                var5.field_y = (short)param0.i(0, 16);
                var5.field_w = et.a(param0, 16, 24, var5.field_w);
                var5.field_N = et.a(param0, 16, 24, var5.field_N);
                var5.field_D = et.a(param0, 16, 24, var5.field_D);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_L = (short)param0.i(0, 16);
                  var5.field_k = et.a(param0, 16, 24, var5.field_k);
                  var5.field_v = et.a(param0, 16, 24, var5.field_v);
                  var5.field_n = et.a(param0, 16, 24, var5.field_n);
                  var5.field_j = et.a(param0, 16, 24, var5.field_j);
                  var5.field_G = et.a(param0, 16, 24, var5.field_G);
                  var5.field_I = et.a(param0, 16, 24, var5.field_I);
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  param0.i(0, 16);
                  var5.field_b = et.a(param0, 16, 24, var5.field_b);
                  var5.field_m = et.a(param0, 16, 24, var5.field_m);
                  var5.field_f = et.a(param0, 16, 24, var5.field_f);
                  var5.field_i = et.a(param0, 16, 24, var5.field_i);
                  var5.field_c = et.a(param0, 16, 24, var5.field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (kv.a(false, param0)) {
                  var5.field_K = et.a(param0, 16, 24, var5.field_K);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (kv.a(false, param0)) {
                  var5.field_E = mca.a(false, 16, param0, var5.field_E);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    if (var5.field_E.length <= var8) {
                      if (var7 != 0) {
                        var5.field_z = (byte)(1 + var7);
                        break L4;
                      } else {
                        var5.field_E = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var7 ^ -1) > (255 & var5.field_E[var8] ^ -1)) {
                          var7 = 255 & var5.field_E[var8];
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackIn_25_0 = (wma) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("ur.B(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, 2);
                break L1;
              }
            }
            stackIn_3_0 = new nc(mbb.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ur.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ur(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
