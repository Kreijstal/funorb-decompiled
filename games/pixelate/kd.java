/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd {
    static String field_a;
    static String[] field_c;
    static String field_d;
    mn[] field_b;

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        mn var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          if (null == this.field_b) {
            break L0;
          } else {
            if (0 == this.field_b.length) {
              break L0;
            } else {
              if (this.field_b[0].field_b <= param0) {
                if (this.field_b[this.field_b.length - 1].field_d < param0) {
                  return -1;
                } else {
                  if (this.field_b.length != 1) {
                    var4 = 0;
                    if (param1 > 116) {
                      var5 = 0;
                      L1: while (true) {
                        if (this.field_b.length <= var5) {
                          return -1;
                        } else {
                          L2: {
                            var6 = this.field_b[var5];
                            if (param0 < var6.field_b) {
                              break L2;
                            } else {
                              if (param0 > var6.field_d) {
                                break L2;
                              } else {
                                var7 = var6.a(param2, 27760);
                                if (var7 != -1) {
                                  return var4 - -var7;
                                } else {
                                  return -1;
                                }
                              }
                            }
                          }
                          var4 = var4 + (var6.field_g.length + -1);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return 63;
                    }
                  } else {
                    return this.field_b[0].a(param2, 27760);
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final static void c(boolean param0, int param1) {
        if (null != ri.field_f) {
            t.a(t.field_e, t.field_f, -t.field_e + t.field_h, t.field_a - t.field_f);
            ri.field_f.a(param0, 0);
        }
        if (param1 != -24721) {
            field_c = (String[]) null;
        }
    }

    final int b(boolean param0, int param1) {
        int var4 = 0;
        mn var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        mn[] var7 = this.field_b;
        mn[] var3 = var7;
        if (!param0) {
            this.field_b = (mn[]) null;
        }
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param1 >= var5.field_g.length)) {
                return var5.field_g[param1];
            }
            param1 = param1 - (-1 + var5.field_g.length);
        }
        return 0;
    }

    final static void a(boolean param0, eq param1, byte param2, we param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        eq stackIn_7_0 = null;
        eq stackIn_8_0 = null;
        eq stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        eq stackIn_10_0 = null;
        eq stackIn_11_0 = null;
        eq stackIn_12_0 = null;
        eq stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        eq stackIn_14_0 = null;
        eq stackIn_15_0 = null;
        eq stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        eq stackIn_17_0 = null;
        eq stackIn_18_0 = null;
        eq stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        eq stackIn_20_0 = null;
        eq stackIn_21_0 = null;
        eq stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        eq stackIn_23_0 = null;
        eq stackIn_24_0 = null;
        eq stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        eq stackOut_6_0 = null;
        eq stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        eq stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        eq stackOut_9_0 = null;
        eq stackOut_10_0 = null;
        eq stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        eq stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        eq stackOut_13_0 = null;
        eq stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        eq stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        eq stackOut_16_0 = null;
        eq stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        eq stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        eq stackOut_19_0 = null;
        eq stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        eq stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        eq stackOut_22_0 = null;
        eq stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        eq stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                param1.field_mc = param3.f(param2 ^ 135);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.field_ec = param3.f(255);
              if (param2 == 120) {
                break L2;
              } else {
                field_d = (String) null;
                break L2;
              }
            }
            L3: {
              param1.field_Ib = param3.f(param2 + 135);
              var4_int = param3.f(param2 + 135);
              stackOut_6_0 = (eq) (param1);
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (0 == (128 & var4_int)) {
                stackOut_8_0 = (eq) ((Object) stackIn_8_0);
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = (eq) ((Object) stackIn_7_0);
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              L5: {
                stackIn_9_0.field_Pb = stackIn_9_1 != 0;
                stackOut_9_0 = (eq) (param1);
                stackIn_12_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (!param1.field_Pb) {
                  break L5;
                } else {
                  stackOut_10_0 = (eq) ((Object) stackIn_10_0);
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (param1.field_ec <= param1.field_mc) {
                    break L5;
                  } else {
                    stackOut_11_0 = (eq) ((Object) stackIn_11_0);
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L4;
                  }
                }
              }
              stackOut_12_0 = (eq) ((Object) stackIn_12_0);
              stackOut_12_1 = 0;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L4;
            }
            L6: {
              stackIn_13_0.field_hc = stackIn_13_1 != 0;
              stackOut_13_0 = (eq) (param1);
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (0 == (var4_int & 64)) {
                stackOut_15_0 = (eq) ((Object) stackIn_15_0);
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L6;
              } else {
                stackOut_14_0 = (eq) ((Object) stackIn_14_0);
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L6;
              }
            }
            L7: {
              stackIn_16_0.field_dc = stackIn_16_1 != 0;
              stackOut_16_0 = (eq) (param1);
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (-1 == (var4_int & 32 ^ -1)) {
                stackOut_18_0 = (eq) ((Object) stackIn_18_0);
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L7;
              } else {
                stackOut_17_0 = (eq) ((Object) stackIn_17_0);
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L7;
              }
            }
            L8: {
              stackIn_19_0.field_oc = stackIn_19_1 != 0;
              stackOut_19_0 = (eq) (param1);
              stackIn_21_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (0 == (8 & var4_int)) {
                stackOut_21_0 = (eq) ((Object) stackIn_21_0);
                stackOut_21_1 = 0;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L8;
              } else {
                stackOut_20_0 = (eq) ((Object) stackIn_20_0);
                stackOut_20_1 = 1;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_Mb = stackIn_22_1 != 0;
              stackOut_22_0 = (eq) (param1);
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (-1 != (16 & var4_int ^ -1)) {
                stackOut_24_0 = (eq) ((Object) stackIn_24_0);
                stackOut_24_1 = 2;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L9;
              } else {
                stackOut_23_0 = (eq) ((Object) stackIn_23_0);
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L9;
              }
            }
            L10: {
              stackIn_25_0.field_Tb = stackIn_25_1;
              if (0 == (4 & var4_int)) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L10;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_28_0;
              if ((2 & var4_int) == 0) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L11;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L11;
              }
            }
            L12: {
              var6 = stackIn_31_0;
              param3.a(param1.field_Eb, 0, -77, param1.field_Eb.length);
              param1.field_bc = param3.a((byte) -11);
              param1.field_Lb = hm.a(64) + -(long)param3.k(param2 + -120);
              if (var5 == 0) {
                param1.field_nc = -1;
                break L12;
              } else {
                param1.field_nc = param3.k(param2 + -120);
                break L12;
              }
            }
            L13: {
              param1.field_kc = param3.a(false);
              var7 = param3.field_m;
              param1.field_pc = param3.h(5);
              if (var6 == 0) {
                param1.field_Ub = null;
                break L13;
              } else {
                param1.field_Ub = new String[param1.field_mc];
                param3.field_m = var7;
                var8 = 0;
                L14: while (true) {
                  if (var8 >= param1.field_mc) {
                    break L13;
                  } else {
                    param1.field_Ub[var8] = param3.h(param2 + -115);
                    var8++;
                    continue L14;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var4);
            stackOut_40_1 = new StringBuilder().append("kd.D(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L15;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L15;
            }
          }
          L16: {
            stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param2).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L16;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L16;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            field_d = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_b) {
              break L2;
            } else {
              if (-1 > (this.field_b.length ^ -1)) {
                stackOut_6_0 = -this.field_b[0].field_b + this.field_b[this.field_b.length - 1].field_d;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        mn[] var3 = null;
        int var4 = 0;
        mn var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            discarded$2 = this.a(-37);
            break L0;
          }
        }
        L1: {
          var2 = -1;
          if (this.field_b != null) {
            var3 = this.field_b;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) 86);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        mn var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        for (var3 = 0; this.field_b.length > var3; var3++) {
            var4 = this.field_b[var3];
            if (!(var4.field_g.length <= param1)) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_g.length);
        }
        if (param0) {
            field_a = (String) null;
        }
        return this.field_b.length;
    }

    final int a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param0.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                L2: {
                  if (param3 == 60) {
                    break L2;
                  } else {
                    field_a = (String) null;
                    break L2;
                  }
                }
                if (0 >= var5_int) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_16_0 = (param1 + -param2 << -1036826808) / var5_int;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param0.charAt(var8);
                  if (var9 != 60) {
                    if (var9 != 62) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  } else {
                    var6 = 1;
                    break L3;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("kd.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    public static void c(int param0) {
        if (param0 >= -115) {
            field_c = (String[]) null;
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_d = "Please enter a year between <%0> and <%1>";
    }
}
