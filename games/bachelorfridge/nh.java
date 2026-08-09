/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends td {
    static String field_p;

    final static hba a(lu param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        hba stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 116 % ((param2 - 31) / 60);
            stackIn_1_0 = new hba(param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("nh.E(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, jc param1) {
        try {
            param1.field_o = new char[]{(char)63};
            if (param0 != 0) {
                lu var3 = (lu) null;
                nh.a((lu) null, 9, (byte) 2);
            }
            param1.field_q = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != 98) {
            return;
        }
        field_p = null;
    }

    final static void b(int param0) {
        nla.field_f = false;
        int var1 = 50 % ((param0 - -71) / 47);
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        lk var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        lk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var9 = this.field_h.a(25, param0);
              var4 = new lk(this.field_g, new nq(var9));
              var5 = 0;
              if (param1 == 3) {
                break L1;
              } else {
                nh.c((byte) 56);
                break L1;
              }
            }
            L2: while (true) {
              if (var5 >= param0.field_z) {
                stackIn_12_0 = (lk) (var4);
                break L0;
              } else {
                var6 = 0;
                L3: while (true) {
                  if (var6 >= param0.field_B) {
                    var5++;
                    continue L2;
                  } else {
                    L4: {
                      if (null != param0.field_a[var5][var6].field_l) {
                        var7 = param0.field_a[var5][var6].field_l;
                        var4.field_o.a(new iv(new nq(var7), false, 1, 0, 17), true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("nh.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_12_0);
    }

    nh(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        field_p = "Enter name of player to add to list";
    }
}
