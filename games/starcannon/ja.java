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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 0;
            var4 = nd.field_m;
            if (param2 > 91) {
              L1: while (true) {
                if (var3_int >= uh.field_h.length) {
                  stackIn_12_0 = -1;
                  decompiledRegionSelector0 = 2;
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
                      var7 = ee.field_b + -(var6 >> -2037948255);
                      if (!rh.a(pk.field_c - -(kc.field_S << -798496127), param1, (rh.field_i << 919036801) + var6, -rh.field_i + var7, var4, param0, -89)) {
                        var4 = var4 + (pk.field_c + mc.field_h + (kc.field_S << 144335681));
                        break L2;
                      } else {
                        stackIn_7_0 = var5;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_2_0 = 72;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "ja.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    private final ud a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        aj var9 = null;
        ud var10 = null;
        ud stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        ud stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = (param3 >>> 660508620 | (param3 & -805302273) << -1695677948) ^ param1;
              var5_int = var5_int | param3 << -154911344;
              var6 = (long)var5_int;
              var8 = (ud) ((Object) this.field_a.a(var6, (byte) 111));
              if (param2 == 0) {
                break L1;
              } else {
                this.field_h = (ue) null;
                break L1;
              }
            }
            if (var8 == null) {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  if (-1 > (param0[0] ^ -1)) {
                    break L2;
                  } else {
                    stackIn_8_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = aj.a(this.field_h, param3, param1);
              if (var9 != null) {
                L3: {
                  var10 = var9.a();
                  var8 = var10;
                  this.field_a.a(var6, (byte) -100, var8);
                  if (param0 == null) {
                    break L3;
                  } else {
                    param0[0] = param0[0] - var10.field_i.length;
                    break L3;
                  }
                }
                stackIn_15_0 = (ud) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_4_0 = (ud) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ja.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_8_0);
          } else {
            return stackIn_15_0;
          }
        }
    }

    final ud a(int param0, int param1, byte param2) {
        if (param2 != 41) {
            return (ud) null;
        }
        return this.a(param1, (byte) 127, param0, (int[]) null);
    }

    public static void a(byte param0) {
        if (param0 <= 67) {
            return;
        }
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
        ud stackIn_15_0 = null;
        ud stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0 ^ (param2 >>> 251397644 | 65521 & param2 << 2095765188);
            var5_int = var5_int | param2 << 1082343472;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (ud) ((Object) this.field_a.a(var6, (byte) 60));
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
                var9 = (nj) ((Object) this.field_f.a(var6, (byte) 42));
                if (var9 == null) {
                  var9 = nj.a(this.field_b, param2, param0);
                  if (var9 != null) {
                    this.field_f.a(var6, (byte) -100, var9);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (param1 > 120) {
                var8 = var9.a(param3);
                if (var8 != null) {
                  var9.b(4);
                  this.field_a.a(var6, (byte) -100, var8);
                  stackIn_20_0 = (ud) (var8);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackIn_15_0 = (ud) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ud) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("ja.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final ud b(int param0, int param1, int param2) {
        if (param2 < 87) {
            field_g = (String) null;
        }
        return this.a((int[]) null, param0, 0, param1);
    }

    ja(ue param0, ue param1) {
        this.field_f = new ih(256);
        this.field_a = new ih(256);
        try {
            this.field_b = param1;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Orb coins: <%0>";
        field_c = new n(1);
    }
}
