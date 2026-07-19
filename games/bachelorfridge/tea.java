/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tea extends mf implements lja {
    static String field_lb;
    private ue field_ob;
    private boolean field_nb;
    private boolean field_mb;

    final boolean a(int param0) {
        eq var2 = null;
        if (this.field_C) {
          if (!this.field_nb) {
            var2 = nea.f((byte) 94);
            if (var2 == null) {
              if (param0 > -32) {
                return false;
              } else {
                return super.a(-98);
              }
            } else {
              this.a(-12331, false, var2);
              if (param0 > -32) {
                return false;
              } else {
                return super.a(-98);
              }
            }
          } else {
            if (param0 > -32) {
              return false;
            } else {
              return super.a(-98);
            }
          }
        } else {
          if (param0 > -32) {
            return false;
          } else {
            return super.a(-98);
          }
        }
    }

    private final void a(int param0, boolean param1, eq param2) {
        hf discarded$2 = null;
        hf discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        hc var5 = null;
        int var6 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -12331) {
                break L1;
              } else {
                this.field_mb = false;
                break L1;
              }
            }
            L2: {
              this.field_nb = true;
              if (!param2.field_e) {
                if (param2.field_a == null) {
                  var4_ref = param2.field_g;
                  if (param2.field_d == 248) {
                    L3: {
                      if (param1) {
                        break L3;
                      } else {
                        sa.c(-103);
                        break L3;
                      }
                    }
                    var4_ref = lda.field_b;
                    this.field_mb = true;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = uga.field_A;
                  if (this.field_ob != null) {
                    this.field_ob.a(param0 + 26653);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4_ref = dla.field_m;
                break L2;
              }
            }
            L4: {
              var5 = new hc((mf) (this), qia.field_a, var4_ref);
              if (param2.field_e) {
                if (param2.field_h) {
                  this.e(new ar((tea) (this)), 33);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  discarded$2 = var5.a((pl) (this), tj.field_a, 19528);
                  break L4;
                }
              } else {
                L5: {
                  if (!this.field_mb) {
                    if (5 != param2.field_d) {
                      var5.a(7, ina.field_s, -1);
                      break L5;
                    } else {
                      var5.a(7, tt.field_h, 11);
                      var5.a(7, uda.field_ab, 17);
                      break L5;
                    }
                  } else {
                    discarded$3 = var5.a((pl) (this), tj.field_a, 19528);
                    break L5;
                  }
                }
                if ((param2.field_d ^ -1) != -4) {
                  if (-7 == (param2.field_d ^ -1)) {
                    var5.a(7, wha.field_b, 9);
                    break L4;
                  } else {
                    this.e(var5, 33);
                    return;
                  }
                } else {
                  var5.a(param0 ^ -12334, pr.field_c, 7);
                  break L4;
                }
              }
            }
            this.e(var5, 33);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("tea.NA(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void r(int param0) {
        if (param0 != -7) {
            return;
        }
        this.a(-12331, true, wu.a(248, (byte) 80, lda.field_b));
    }

    public static void q(int param0) {
        field_lb = null;
        if (param0 != 10462) {
            field_lb = (String) null;
        }
    }

    tea(rp param0, ue param1) {
        super(param0, qia.field_a, rma.field_c, false, false);
        try {
            this.field_ob = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "tea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (this.field_mb) {
              nw.a(true, false, (byte) 60);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                tr.a(-97);
                this.p(-120);
                if (param3 >= 50) {
                  break L1;
                } else {
                  field_lb = (String) null;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("tea.AA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(CharSequence param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.length();
            if (param2 > 10) {
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  stackOut_11_0 = var3_int;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (param1 == param0.charAt(var5)) {
                      var3_int++;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -33;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("tea.LA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_lb = "Your game";
    }
}
