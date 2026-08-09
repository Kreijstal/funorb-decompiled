/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends mf {
    private boolean field_j;
    private String field_i;
    static pm[] field_k;
    static int field_h;

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        in var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            var3 = hc.a(-24682, var5);
            if (var3 == null) {
              L1: {
                if (!param0.equals(this.field_i)) {
                  var4 = c.a(param0, 78);
                  if (var4 != null) {
                    if (var4.field_f == null) {
                      this.field_i = param0;
                      this.field_j = var4.field_a;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              if (!this.field_j) {
                stackIn_14_0 = fh.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    this.field_i = (String) null;
                    break L2;
                  }
                }
                stackIn_18_0 = th.field_fb;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("qg.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    qg(ul param0) {
        super(param0);
        this.field_j = false;
    }

    public static void f(int param0) {
        if (param0 > -66) {
            return;
        }
        field_k = null;
    }

    final static void a(double param0, int param1, double[] param2, double param3, vg param4, dj param5, int param6) {
        double var9_double = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        try {
            var9_double = param2[9] * param5.field_C + param5.field_E;
            var11 = param5.field_C * param2[10] + param5.field_t;
            var13 = param5.field_D + param5.field_C * param2[11];
            var15 = 0.4 * param3;
            pa.a(var9_double, var15, (byte) -11, param6, var13, var11, cd.field_o[(param1 & 15) >> 639775169], param0, param4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "qg.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final void e(int param0) {
        this.field_i = null;
        if (param0 != 639775169) {
            dj var3 = (dj) null;
            qg.a(0.5264573121586292, 97, (double[]) null, -2.3170663679572066, (vg) null, (dj) null, -93);
        }
    }

    final fi a(byte param0, String param1) {
        in var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        CharSequence var5 = null;
        fi stackIn_4_0 = null;
        fi stackIn_11_0 = null;
        fi stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -44) {
                break L1;
              } else {
                var4 = (dj) null;
                qg.a(0.033002690553074567, -88, (double[]) null, 1.6640993038654757, (vg) null, (dj) null, -56);
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param1);
            if (lc.a(var5, 13684)) {
              L2: {
                if (!param1.equals(this.field_i)) {
                  L3: {
                    var3 = c.a(param1, 117);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_f == null) {
                        this.field_j = var3.field_a;
                        this.field_i = param1;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = qh.field_x;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (this.field_j) {
                  stackIn_16_0 = nn.field_q;
                  break L4;
                } else {
                  stackIn_16_0 = fb.field_e;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = fb.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("qg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    static {
        field_k = new pm[5];
    }
}
