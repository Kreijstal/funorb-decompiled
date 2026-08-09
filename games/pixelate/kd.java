/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kd {
    static String field_a;
    static String[] field_c;
    static String field_d;
    mn[] field_b;

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        mn var6 = null;
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        if (null == this.field_b || 0 == this.field_b.length || this.field_b[0].field_b > param0) {
            return -1;
        }
        if (!(this.field_b[this.field_b.length - 1].field_d >= param0)) {
            return -1;
        }
        if (this.field_b.length == 1) {
            return this.field_b[0].a(param2, 27760);
        }
        int var4 = 0;
        if (param1 <= 116) {
            return 63;
        }
        for (var5 = 0; this.field_b.length > var5; var5++) {
            var6 = this.field_b[var5];
            if (param0 >= var6.field_b && param0 <= var6.field_d) {
                var7 = var6.a(param2, 27760);
                if (var7 == -1) {
                    return -1;
                }
                return var4 - -var7;
            }
            var4 = var4 + (var6.field_g.length + -1);
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
        eq stackIn_8_0 = null;
        eq stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        eq stackIn_12_0 = null;
        eq stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        eq stackIn_15_0 = null;
        eq stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        eq stackIn_18_0 = null;
        eq stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        eq stackIn_21_0 = null;
        eq stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        eq stackIn_24_0 = null;
        eq stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
              stackIn_8_0 = (eq) (param1);

              if (0 == (128 & var4_int)) {
                stackIn_9_0 = (eq) ((Object) stackIn_8_0);
                stackIn_9_1 = 0;
                break L3;
              } else {
                stackIn_9_0 = (eq) ((Object) stackIn_8_0);
                stackIn_9_1 = 1;
                break L3;
              }
            }
            L4: {
              L5: {
                stackIn_9_0.field_Pb = stackIn_9_1 != 0;
                stackIn_12_0 = (eq) (param1);

                if (!param1.field_Pb) {
                  break L5;
                } else {
                  stackIn_12_0 = (eq) ((Object) stackIn_12_0);

                  if (param1.field_ec <= param1.field_mc) {
                    break L5;
                  } else {
                    stackIn_13_0 = (eq) ((Object) stackIn_12_0);
                    stackIn_13_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_13_0 = (eq) ((Object) stackIn_12_0);
              stackIn_13_1 = 0;
              break L4;
            }
            L6: {
              stackIn_13_0.field_hc = stackIn_13_1 != 0;
              stackIn_15_0 = (eq) (param1);

              if (0 == (var4_int & 64)) {
                stackIn_16_0 = (eq) ((Object) stackIn_15_0);
                stackIn_16_1 = 0;
                break L6;
              } else {
                stackIn_16_0 = (eq) ((Object) stackIn_15_0);
                stackIn_16_1 = 1;
                break L6;
              }
            }
            L7: {
              stackIn_16_0.field_dc = stackIn_16_1 != 0;
              stackIn_18_0 = (eq) (param1);

              if (-1 == (var4_int & 32 ^ -1)) {
                stackIn_19_0 = (eq) ((Object) stackIn_18_0);
                stackIn_19_1 = 0;
                break L7;
              } else {
                stackIn_19_0 = (eq) ((Object) stackIn_18_0);
                stackIn_19_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_19_0.field_oc = stackIn_19_1 != 0;
              stackIn_21_0 = (eq) (param1);

              if (0 == (8 & var4_int)) {
                stackIn_22_0 = (eq) ((Object) stackIn_21_0);
                stackIn_22_1 = 0;
                break L8;
              } else {
                stackIn_22_0 = (eq) ((Object) stackIn_21_0);
                stackIn_22_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_22_0.field_Mb = stackIn_22_1 != 0;
              stackIn_24_0 = (eq) (param1);

              if (-1 != (16 & var4_int ^ -1)) {
                stackIn_25_0 = (eq) ((Object) stackIn_24_0);
                stackIn_25_1 = 2;
                break L9;
              } else {
                stackIn_25_0 = (eq) ((Object) stackIn_24_0);
                stackIn_25_1 = 1;
                break L9;
              }
            }
            L10: {
              stackIn_25_0.field_Tb = stackIn_25_1;
              if (0 == (4 & var4_int)) {
                stackIn_28_0 = 0;
                break L10;
              } else {
                stackIn_28_0 = 1;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_28_0;
              if ((2 & var4_int) == 0) {
                stackIn_31_0 = 0;
                break L11;
              } else {
                stackIn_31_0 = 1;
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
            stackIn_42_0 = (RuntimeException) (var4);

            stackIn_42_1 = new StringBuilder().append("kd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L15;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L16;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L16;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_43_0), stackIn_46_2 + ')');
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
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
                stackIn_7_0 = -this.field_b[0].field_b + this.field_b[this.field_b.length - 1].field_d;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0) {
        int var2;
        mn[] var3;
        int var4;
        mn var5;
        int var7;
        int var6;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            this.a(-37);
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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                  stackIn_21_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_19_0 = (param1 + -param2 << -1036826808) / var5_int;
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
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("kd.C(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
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
