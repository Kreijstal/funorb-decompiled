/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends td {
    static eq field_p;
    static int[] field_q;
    static boolean field_r;

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        ps var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        Object var9 = null;
        aga var10 = null;
        ps stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ps stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var10 = ((sg) this).field_h.a(91, param0);
              var4 = new ps(((sg) this).field_g, new nq(var10));
              var5 = 0;
              if (param1 == 3) {
                break L1;
              } else {
                var9 = null;
                ii discarded$1 = ((sg) this).a((op) null, -50);
                break L1;
              }
            }
            L2: while (true) {
              if (var5 >= param0.field_d) {
                stackOut_15_0 = (ps) var4;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var6 = 0;
                L3: while (true) {
                  if (7 <= var6) {
                    var5++;
                    continue L2;
                  } else {
                    L4: {
                      if (null != param0.field_S[var5].field_b[var6]) {
                        var7 = param0.field_S[var5].field_b[var6];
                        if (!var7.field_A) {
                          break L4;
                        } else {
                          if (!var7.i(68)) {
                            break L4;
                          } else {
                            if (param0.field_a[var7.field_x][var7.field_J].field_l == null) {
                              var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, -10, 35), true);
                              var4.field_o.a((bw) (Object) new cn(new nq(var7), var7.field_x, var7.field_J), true);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
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
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("sg.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_16_0;
    }

    sg(int param0, aga param1) {
        super(param0, param1);
    }

    public static void c() {
        int var1 = 1;
        field_q = null;
        field_p = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 1816304479) {
            field_r = false;
        }
        int var3 = param2 >> 31 & -1 + param0;
        return var3 + ((param2 >>> 31) + param2) % param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = vv.a((byte) 121);
    }
}
