/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ct {
    static gj field_a;
    static String field_b;

    final static int a(int param0, int param1) {
        if (param0 != 19143) {
            ij var3 = (ij) null;
            ct.a((ml) null, 95, (ij) null);
        }
        if (li.field_i) {
            return mmb.field_d[param1].a();
        }
        return 100;
    }

    final static void a(ml param0, int param1, ij param2) {
        int var3_int = 0;
        int var4 = 0;
        imb var5 = null;
        int var6 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 > 30) {
                break L1;
              } else {
                field_a = (gj) null;
                break L1;
              }
            }
            L2: {
              param2.b(-10258, new hua(param0.field_j));
              if (null == param0.field_d) {
                break L2;
              } else {
                if (0 < param0.field_d.length) {
                  var3_int = 0;
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= param0.field_d.length) {
                      if (var3_int == 0) {
                        param2.b(-10258, new hua(-1));
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        var5 = param0.field_d[var4];
                        if (0 != (var5.field_c ^ -1)) {
                          param2.b(-10258, new hua(var4));
                          ct.a(param0.field_f[var5.field_c], 108, param2);
                          if (-1 + param0.field_d.length == var4) {
                            var3_int = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ct.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 100 % ((param0 - 79) / 38);
        field_b = null;
        field_a = null;
    }

    static {
        field_a = new gj();
        field_b = " KEYS";
    }
}
