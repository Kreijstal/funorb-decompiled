/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt extends td {
    static int field_v;
    static sna field_q;
    static String field_t;
    static int[] field_u;
    static vr field_p;
    static int field_s;
    static int field_r;

    public static void b() {
        field_q = null;
        field_u = null;
        field_t = null;
        field_p = null;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        nb var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        nb stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        nb stackOut_15_0 = null;
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
              if (param1 == 3) {
                break L1;
              } else {
                field_s = 126;
                break L1;
              }
            }
            var9 = ((mt) this).field_h.a(param1 ^ 115, param0);
            var4 = new nb(((mt) this).field_g, new nq(var9));
            var5 = 0;
            L2: while (true) {
              if (var5 >= param0.field_d) {
                stackOut_15_0 = (nb) var4;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                var6 = 0;
                L3: while (true) {
                  if (var6 >= 7) {
                    var5++;
                    continue L2;
                  } else {
                    L4: {
                      if (param0.field_S[var5].field_b[var6] == null) {
                        break L4;
                      } else {
                        var7 = param0.field_S[var5].field_b[var6];
                        if (!var7.field_A) {
                          break L4;
                        } else {
                          if (!var7.i(-116)) {
                            break L4;
                          } else {
                            if (var9.field_x != var7.field_x) {
                              break L4;
                            } else {
                              if (var7.field_J != var9.field_J) {
                                break L4;
                              } else {
                                var4.field_o.a((bw) (Object) new iv(new nq(var9), false, 1, -var7.field_t, 0), true);
                                var4.field_o.a((bw) (Object) new pea(new nq(var7), var7.field_x, var7.field_J), true);
                                break L4;
                              }
                            }
                          }
                        }
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
            stackOut_17_1 = new StringBuilder().append("mt.A(");
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

    final static sna c() {
        return rba.field_a.field_wb;
    }

    mt(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
        field_t = "More suggestions";
    }
}
