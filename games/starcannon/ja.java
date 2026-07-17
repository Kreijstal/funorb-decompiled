/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static hl field_e;
    static int field_d;
    private ue field_h;
    private ue field_b;
    static String field_g;
    private ih field_f;
    static n field_c;
    private ih field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = 0;
            var4 = nd.field_m;
            if (param2 > 91) {
              L1: while (true) {
                if (var3_int >= uh.field_h.length) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  L2: {
                    var5 = eg.field_a[var3_int];
                    if (0 > var5) {
                      var4 = var4 + sg.field_e;
                      break L2;
                    } else {
                      var6 = fb.a(uh.field_h[var3_int], (byte) 26, true);
                      var4 = var4 + mc.field_h;
                      var7 = ee.field_b + -(var6 >> 1);
                      int discarded$23 = -89;
                      if (!rh.a(pk.field_c - -(kc.field_S << 1), param1, (rh.field_i << 1) + var6, -rh.field_i + var7, var4, param0)) {
                        var4 = var4 + (pk.field_c + mc.field_h + (kc.field_S << 1));
                        break L2;
                      } else {
                        stackOut_6_0 = var5;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_1_0 = 72;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "ja.B(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    private final ud a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        aj var9 = null;
        ud var10 = null;
        ud stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        ud stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        ud stackOut_12_0 = null;
        ud stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = (param3 >>> 12 | (param3 & -805302273) << 4) ^ param1;
            var5_int = var5_int | param3 << 16;
            var6 = (long)var5_int;
            var8 = (ud) (Object) ((ja) this).field_a.a(var6, (byte) 111);
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0[0] > 0) {
                    break L1;
                  } else {
                    stackOut_5_0 = null;
                    stackIn_6_0 = stackOut_5_0;
                    return (ud) (Object) stackIn_6_0;
                  }
                }
              }
              var9 = aj.a(((ja) this).field_h, param3, param1);
              if (var9 != null) {
                L2: {
                  var10 = var9.a();
                  var8 = var10;
                  ((ja) this).field_a.a(var6, (byte) -100, (rf) (Object) var8);
                  if (param0 == null) {
                    break L2;
                  } else {
                    param0[0] = param0[0] - var10.field_i.length;
                    break L2;
                  }
                }
                stackOut_12_0 = (ud) var8;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (ud) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ja.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + 0 + 44 + param3 + 41);
        }
        return stackIn_13_0;
    }

    final ud a(int param0, int param1, byte param2) {
        if (param2 != 41) {
            return null;
        }
        return this.a(param1, (byte) 127, param0, (int[]) null);
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_g = null;
    }

    private final ud a(int param0, byte param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        nj var9 = null;
        ud stackIn_2_0 = null;
        ud stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_17_0 = null;
        ud stackOut_1_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var5_int = param0 ^ (param2 >>> 12 | 65521 & param2 << 4);
            var5_int = var5_int | param2 << 16;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (ud) (Object) ((ja) this).field_a.a(var6, (byte) 60);
            if (var8 == null) {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (0 < param3[0]) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var9 = (nj) (Object) ((ja) this).field_f.a(var6, (byte) 42);
                if (var9 == null) {
                  var9 = nj.a(((ja) this).field_b, param2, param0);
                  if (var9 != null) {
                    ((ja) this).field_f.a(var6, (byte) -100, (rf) (Object) var9);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              var8 = var9.a(param3);
              if (var8 != null) {
                var9.b(4);
                ((ja) this).field_a.a(var6, (byte) -100, (rf) (Object) var8);
                stackOut_17_0 = (ud) var8;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (ud) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("ja.C(").append(param0).append(44).append(127).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    final ud b(int param0, int param1, int param2) {
        if (param2 < 87) {
            field_g = null;
        }
        return this.a((int[]) null, param0, 0, param1);
    }

    ja(ue param0, ue param1) {
        ((ja) this).field_f = new ih(256);
        ((ja) this).field_a = new ih(256);
        try {
            ((ja) this).field_b = param1;
            ((ja) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ja.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Orb coins: <%0>";
        field_c = new n(1);
    }
}
