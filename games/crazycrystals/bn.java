/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static am field_h;
    private db field_d;
    private db field_e;
    static String field_f;
    private fc field_b;
    static wb field_i;
    static int field_c;
    static lg field_g;
    private fc field_a;

    private final ko a(int param0, int param1, int[] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ko var8 = null;
        ha var9 = null;
        ko var10 = null;
        ko stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        ko stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        ko stackOut_15_0 = null;
        Object stackOut_10_0 = null;
        ko stackOut_3_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var5_int = (param1 >>> -1881471156 | 65527 & param1 << 375687716) ^ param0;
              var5_int = var5_int | param1 << -1108238544;
              if (param3) {
                break L1;
              } else {
                this.field_a = (fc) null;
                break L1;
              }
            }
            var6 = (long)var5_int;
            var8 = (ko) ((Object) this.field_a.a(var6, 0));
            if (var8 == null) {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if (-1 > (param2[0] ^ -1)) {
                    break L2;
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = ha.a(this.field_d, param1, param0);
              if (var9 != null) {
                L3: {
                  var10 = var9.b();
                  var8 = var10;
                  this.field_a.a(-22072, var6, var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var10.field_k.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_15_0 = (ko) (var8);
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_10_0 = null;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_3_0 = (ko) (var8);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("bn.C(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ko) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ko) ((Object) stackIn_11_0);
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final ko a(int param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        ko stackIn_2_0 = null;
        ko stackIn_5_0 = null;
        ko stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ko stackOut_7_0 = null;
        ko stackOut_4_0 = null;
        ko stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (this.field_e.a(122) != 1) {
              if (!param1) {
                if (1 != this.field_e.a(param0, 0)) {
                  throw new RuntimeException();
                } else {
                  stackOut_7_0 = this.a(param0, -76, 0, param2);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = (ko) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = this.a(0, -101, param0, param2);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("bn.B(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        if (param0 != -3) {
          bn.a((byte) 80);
          field_f = null;
          field_i = null;
          return;
        } else {
          field_f = null;
          field_i = null;
          return;
        }
    }

    private final ko a(int param0, int param1, int param2, int[] param3) {
        ko discarded$1 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        long var6 = 0L;
        ko var8 = null;
        bl var9 = null;
        int[] var10 = null;
        ko stackIn_4_0 = null;
        ko stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ko stackOut_18_0 = null;
        ko stackOut_3_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -20) {
                break L1;
              } else {
                var10 = (int[]) null;
                discarded$1 = this.a(89, -15, (int[]) null, true);
                break L1;
              }
            }
            var5_int = (param0 >>> 1867718860 | (536875007 & param0) << -1601173980) ^ param2;
            var5_int = var5_int | param0 << 640620720;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (ko) ((Object) this.field_a.a(var6, 0));
            if (var8 == null) {
              L2: {
                if (param3 == null) {
                  break L2;
                } else {
                  if ((param3[0] ^ -1) < -1) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              L3: {
                var9 = (bl) ((Object) this.field_b.a(var6, 0));
                if (var9 == null) {
                  var9 = bl.a(this.field_e, param0, param2);
                  if (var9 != null) {
                    this.field_b.a(-22072, var6, var9);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param3);
              if (var8 != null) {
                var9.a(false);
                this.field_a.a(-22072, var6, var8);
                stackOut_18_0 = (ko) (var8);
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_3_0 = (ko) (var8);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("bn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_19_0;
        }
    }

    final ko a(int[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int[] stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int[] stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        ko stackIn_5_0 = null;
        ko stackIn_9_0 = null;
        ko stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ko stackOut_8_0 = null;
        ko stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int[] stackOut_1_3 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int[] stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int[] stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        ko stackOut_4_0 = null;
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
            if (-2 != (this.field_d.a(105) ^ -1)) {
              if (this.field_d.a(param2, 0) == 1) {
                stackOut_8_0 = this.a(0, param2, param0, true);
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param1) {
                  throw new RuntimeException();
                } else {
                  stackOut_11_0 = (ko) null;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              L1: {
                stackOut_1_0 = this;
                stackOut_1_1 = param2;
                stackOut_1_2 = 0;
                stackOut_1_3 = (int[]) (param0);
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                stackIn_2_2 = stackOut_1_2;
                stackIn_2_3 = stackOut_1_3;
                if (param1) {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = stackIn_3_2;
                  stackOut_3_3 = (int[]) ((Object) stackIn_3_3);
                  stackOut_3_4 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  break L1;
                } else {
                  stackOut_2_0 = this;
                  stackOut_2_1 = stackIn_2_1;
                  stackOut_2_2 = stackIn_2_2;
                  stackOut_2_3 = (int[]) ((Object) stackIn_2_3);
                  stackOut_2_4 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  stackIn_4_3 = stackOut_2_3;
                  stackIn_4_4 = stackOut_2_4;
                  break L1;
                }
              }
              stackOut_4_0 = this.a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("bn.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    bn(db param0, db param1) {
        this.field_b = new fc(256);
        this.field_a = new fc(256);
        try {
            this.field_e = param1;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
