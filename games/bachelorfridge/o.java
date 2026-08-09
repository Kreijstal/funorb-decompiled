/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends pp {
    static String field_i;

    public static void e(byte param0) {
        field_i = null;
        if (param0 != -7) {
            o.e((byte) -68);
        }
    }

    final void a(lu param0, byte param1) {
        try {
            int var3_int = 33 / ((param1 - 34) / 58);
            super.a(param0, (byte) 95);
            param0.b(this.field_f, -115);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "o.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    o(int param0) {
        this.field_f = param0;
    }

    final static boolean d(byte param0) {
        if (param0 < 44) {
            field_i = (String) null;
        }
        return (wca.field_n ^ -1) <= -12 ? true : false;
    }

    final void a(aga param0, op param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        aga var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 == 12) {
                break L1;
              } else {
                o.d((byte) 28);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= param1.field_z) {
                break L0;
              } else {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= param1.field_B) {
                    var4_int++;
                    continue L2;
                  } else {
                    L4: {
                      var6 = param1.field_a[var4_int][var5].field_l;
                      if (var6 == null) {
                        break L4;
                      } else {
                        var6.g(-116, this.field_f);
                        break L4;
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("o.C(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Join <%0>'s game";
    }
}
