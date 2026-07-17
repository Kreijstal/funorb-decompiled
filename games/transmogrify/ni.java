/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ni extends h {
    static sh field_o;

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        sj[] var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            of.field_e.setLength(0);
            if (param0 < -107) {
              if (null == od.field_g.field_e[0]) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                if (!qi.field_c.a(-1, od.field_g.field_e)) {
                  stackOut_21_0 = -1;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0;
                } else {
                  var1_int = 0;
                  var2 = 0;
                  var9 = od.field_g.field_e;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      if (var4 >= var9.length) {
                        break L2;
                      } else {
                        var5 = var9[var4];
                        if (var5 != null) {
                          StringBuilder discarded$2 = of.field_e.append((char)(255 & var5.field_i));
                          var2 = var2 != 0 | var5.field_x ? 1 : 0;
                          var1_int = var1_int + (var5.field_v + (var5.field_h << 1));
                          var4++;
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var7 = of.field_e.toString();
                    var8 = 0;
                    var4 = var8;
                    L3: while (true) {
                      if (var8 >= n.field_a) {
                        if (var2 != 0) {
                          stackOut_19_0 = var1_int << 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          return var1_int;
                        }
                      } else {
                        if (!var7.equalsIgnoreCase(vi.field_g[var8].toString())) {
                          var8++;
                          continue L3;
                        } else {
                          stackOut_14_0 = -1;
                          stackIn_15_0 = stackOut_14_0;
                          return stackIn_15_0;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 87;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "ni.D(" + param0 + 41);
        }
        return stackIn_24_0;
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        try {
            int var6_int = -104 / ((param3 - 51) / 47);
            if (!(!param2)) {
                jl.a(param0 + param4.field_p, param4.field_n + param1, 13612, param4.field_l, param4.field_h);
            }
            super.a(param0, param1, param2, (byte) 107, param4);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ni.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(int param0) {
        field_o = null;
        if (param0 != 255) {
            field_o = null;
        }
    }

    ni(kg param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_y, -1, 2147483647, false);
    }

    ni(int param0) {
        this(vd.field_h, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new sh();
    }
}
