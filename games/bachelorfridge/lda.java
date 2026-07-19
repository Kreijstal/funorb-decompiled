/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lda {
    static String field_d;
    static String field_b;
    static int field_a;
    private kv[] field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        String discarded$2 = null;
        String var7 = null;
        if (param1 <= 8) {
          var7 = (String) null;
          discarded$2 = lda.a(26, 32, (String) null);
          hp.a(param4, param2, (byte) 108, param0, this.field_c, param3);
          return;
        } else {
          hp.a(param4, param2, (byte) 108, param0, this.field_c, param3);
          return;
        }
    }

    final static rma a(String param0, int param1, byte param2) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        dm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dm stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new dm();
              if (param2 < -111) {
                break L1;
              } else {
                field_a = -15;
                break L1;
              }
            }
            ((rma) ((Object) var3)).field_a = param0;
            ((rma) ((Object) var3)).field_b = param1;
            stackOut_2_0 = (dm) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("lda.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (rma) ((Object) stackIn_3_0);
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -15) {
            return -52;
        }
        return param0 & 255;
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        pf var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        String stackOut_15_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_26_0 = null;
        String stackOut_24_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (wc.a(0, var6)) {
              if (-3 == (um.field_c ^ -1)) {
                if (!wb.a((byte) 52, param2)) {
                  if (gl.a(3, param2)) {
                    stackOut_11_0 = lga.a(true, new String[]{param2}, rt.field_c);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (maa.field_v < 100) {
                        break L1;
                      } else {
                        if (0 < dm.field_f) {
                          break L1;
                        } else {
                          stackOut_15_0 = he.field_m;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    L2: {
                      if (param0 == -26181) {
                        break L2;
                      } else {
                        field_d = (String) null;
                        break L2;
                      }
                    }
                    if (-201 >= (maa.field_v ^ -1)) {
                      stackOut_21_0 = he.field_m;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (!bna.a((byte) 5, param2)) {
                        var5 = sja.field_fb;
                        var5.c(param1, (byte) 116);
                        var5.field_g = var5.field_g + 1;
                        var4 = var5.field_g;
                        var5.d(0, 0);
                        var5.a((byte) -50, param2);
                        var5.b((byte) 124, -var4 + var5.field_g);
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackOut_24_0 = lga.a(true, new String[]{param2}, bda.field_p);
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_7_0 = cea.field_a;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = ama.field_l;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = mk.field_f;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("lda.B(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L3;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      return (String) ((Object) stackIn_27_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 90 % ((-75 - param0) / 49);
        field_d = null;
        field_b = null;
    }

    lda(kv[] param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "lda.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Unfortunately you are not eligible to create an account.";
        field_d = "You have entered another game.";
    }
}
