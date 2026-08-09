/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lda {
    static String field_d;
    static String field_b;
    static int field_a;
    private kv[] field_c;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        String var7;
        if (param1 <= 8) {
          var7 = (String) null;
          lda.a(26, 32, (String) null);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = (dm) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("lda.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pf var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (wc.a(0, var6)) {
              if (-3 == (um.field_c ^ -1)) {
                if (!wb.a((byte) 52, param2)) {
                  if (gl.a(3, param2)) {
                    stackIn_12_0 = lga.a(true, new String[]{param2}, rt.field_c);
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
                          stackIn_16_0 = he.field_m;
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
                      stackIn_22_0 = he.field_m;
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
                        stackIn_27_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackIn_25_0 = lga.a(true, new String[]{param2}, bda.field_p);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_8_0 = cea.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = ama.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = mk.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("lda.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
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
