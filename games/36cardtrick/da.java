/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private qk field_f;
    static boolean field_b;
    private vb field_a;
    static String[] field_c;
    private qk field_e;
    private vb field_d;

    private final ib a(byte param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ib var8 = null;
        uj var9 = null;
        ib var10 = null;
        ib stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        ib stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ib stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        ib stackOut_15_0 = null;
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
            var5_int = param2 ^ (param3 >>> -1703274388 | 65520 & param3 << -199808284);
            var5_int = var5_int | param3 << -211883632;
            var6 = (long)var5_int;
            var8 = (ib) ((Object) this.field_d.a(false, var6));
            if (var8 != null) {
              stackOut_2_0 = (ib) (var8);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1[0] > 0) {
                    break L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (param0 >= 100) {
                  break L2;
                } else {
                  da.a(60);
                  break L2;
                }
              }
              var9 = uj.a(this.field_f, param3, param2);
              if (var9 != null) {
                L3: {
                  var10 = var9.a();
                  var8 = var10;
                  this.field_d.a(var6, (byte) 44, var8);
                  if (param1 == null) {
                    break L3;
                  } else {
                    param1[0] = param1[0] - var10.field_h.length;
                    break L3;
                  }
                }
                stackOut_15_0 = (ib) (var8);
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("da.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ib) ((Object) stackIn_7_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final ib a(int param0, int param1, int param2) {
        ib discarded$2 = null;
        if (param1 != -1703274388) {
          discarded$2 = this.b(-108, 0, 54);
          return this.a((byte) 113, (int[]) null, param0, param2);
        } else {
          return this.a((byte) 113, (int[]) null, param0, param2);
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -1703274388) {
            da.a(-86);
        }
    }

    final ib b(int param0, int param1, int param2) {
        ib discarded$2 = null;
        int[] var5 = null;
        if (param2 != -14888) {
          var5 = (int[]) null;
          discarded$2 = this.a((byte) 18, (int[]) null, -97, 96);
          return this.a(0, (int[]) null, param1, param0);
        } else {
          return this.a(0, (int[]) null, param1, param0);
        }
    }

    private final ib a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ib var8 = null;
        ig var9 = null;
        ib stackIn_3_0 = null;
        Object stackIn_13_0 = null;
        ib stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ib stackOut_2_0 = null;
        Object stackOut_12_0 = null;
        ib stackOut_18_0 = null;
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
            var5_int = param2 ^ (param3 >>> 1670603980 | (param3 & -1610608641) << -1901073084);
            var5_int = var5_int | param3 << -1113209232;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (ib) ((Object) this.field_d.a(false, var6));
            if (var8 != null) {
              stackOut_2_0 = (ib) (var8);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if ((param1[0] ^ -1) < -1) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var9 = (ig) ((Object) this.field_a.a(false, var6));
                if (param0 == 0) {
                  break L2;
                } else {
                  field_b = true;
                  break L2;
                }
              }
              L3: {
                if (var9 != null) {
                  break L3;
                } else {
                  var9 = ig.a(this.field_e, param3, param2);
                  if (var9 != null) {
                    this.field_a.a(var6, (byte) 124, var9);
                    break L3;
                  } else {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var8 = var9.a(param1);
              if (var8 != null) {
                var9.c(104);
                this.field_d.a(var6, (byte) 118, var8);
                stackOut_18_0 = (ib) (var8);
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("da.C(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ib) ((Object) stackIn_13_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    da(qk param0, qk param1) {
        this.field_a = new vb(256);
        this.field_d = new vb(256);
        try {
            this.field_e = param1;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = true;
    }
}
