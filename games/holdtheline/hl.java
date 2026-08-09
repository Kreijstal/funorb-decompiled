/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hl {
    static hj field_d;
    long field_f;
    static qi field_g;
    static String field_e;
    static String field_c;
    hl field_h;
    hl field_a;
    static boolean field_b;

    final static boolean a(boolean param0, int param1, wc param2, qm param3) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        hn var11 = null;
        dd var12 = null;
        try {
          L0: {
            L1: {
              if (-2 > (-param2.field_k + param1 ^ -1)) {
                break L1;
              } else {
                if (0 < (param1 + -param2.field_k ^ -1)) {
                  break L1;
                } else {
                  if (!param0) {
                    if (param2 instanceof dd) {
                      L2: {
                        var12 = (dd) ((Object) param2);
                        var5 = (float)(-var12.field_R.field_h + param3.field_h);
                        var6 = (float)(param3.field_f - var12.field_R.field_f);
                        var7 = -(var6 * var12.field_D) + var5 * var12.field_B;
                        if (0.0f > var7) {
                          break L2;
                        } else {
                          if (var12.field_J < var7) {
                            break L2;
                          } else {
                            L3: {
                              L4: {
                                var8 = var7 / var12.field_J;
                                var9 = var12.field_D * var5 + var12.field_B * var6;
                                if ((float)var12.d(var8, 0) > var9) {
                                  break L4;
                                } else {
                                  if (var9 > (float)var12.c(95, var8)) {
                                    break L4;
                                  } else {
                                    stackIn_27_0 = 1;
                                    break L3;
                                  }
                                }
                              }
                              stackIn_27_0 = 0;
                              break L3;
                            }
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      stackIn_22_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L5: {
                        var11 = (hn) ((Object) param2);
                        var5 = (float)(param3.field_h + -var11.field_U.field_h);
                        var6 = (float)(param3.field_f + -var11.field_U.field_f);
                        var7 = (float)var11.field_D;
                        var8 = (float)var11.field_R;
                        if (var11.field_E <= var11.field_I) {
                          break L5;
                        } else {
                          var7 = (float)var11.field_R;
                          var8 = (float)var11.field_D;
                          break L5;
                        }
                      }
                      var9 = var6 * var6 + var5 * var5;
                      if (var7 * var7 > var9) {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (var8 * var8 >= var9) {
                          var10 = ha.a(var11.field_U, param3, param0);
                          stackIn_17_0 = var11.b((byte) -113, var10);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  } else {
                    stackIn_7_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("hl.SB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  return stackIn_27_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        String var2;
        if (param0 != -2) {
          var2 = (String) null;
          hl.a((String) null, 26, true, (String) null, (a) null, (String) null, 76);
          field_e = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final void d(int param0) {
        if (param0 != 0) {
            hl.c(47);
            if (!(null != this.field_a)) {
                return;
            }
            this.field_a.field_h = this.field_h;
            this.field_h.field_a = this.field_a;
            this.field_a = null;
            this.field_h = null;
            return;
        }
        if (!(null != this.field_a)) {
            return;
        }
        this.field_a.field_h = this.field_h;
        this.field_h.field_a = this.field_a;
        this.field_a = null;
        this.field_h = null;
    }

    final boolean b(int param0) {
        if (null == this.field_a) {
            return false;
        }
        if (param0 < 38) {
            return true;
        }
        return true;
    }

    final static boolean a(String param0, int param1, boolean param2, String param3, a param4, String param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        vm var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -23000) {
                break L1;
              } else {
                var8 = (String) null;
                hl.a((String) null, 49, true, (String) null, (a) null, (String) null, 51);
                break L1;
              }
            }
            if (gg.field_M != bb.field_a) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = new vm(ka.field_b, param4);
              ka.field_b.a(var9, false);
              if (!ma.a(0)) {
                L2: {
                  ij.field_k = param5;
                  qd.field_k = param0;
                  if (!param2) {
                    stackIn_11_0 = 0;
                    break L2;
                  } else {
                    stackIn_11_0 = 1;
                    break L2;
                  }
                }
                ff.field_b = stackIn_11_0 != 0;
                bb.field_a = sf.field_n;
                ol.field_a = param3;
                u.field_V = param6;
                bg.field_d = null;
                return true;
              } else {
                var9.q(-124);
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("hl.VB(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    static {
        field_e = "To use a <col=1>super powers</col> you must activate it. Doing so will scatter the three used powerups around the course.";
        field_c = "Back";
        field_b = false;
    }
}
