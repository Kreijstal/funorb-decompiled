/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    static bi field_k;
    static nf[] field_l;
    private int field_j;
    nf field_d;
    private int field_m;
    nf[] field_g;
    private int field_f;
    private int field_c;
    static double field_h;
    static String field_b;
    private boolean field_i;
    static ce field_a;
    private int field_e;

    final pn d(int param0, int param1) {
        if (param1 != -2) {
            this.field_c = 70;
        }
        this.field_c = param0;
        return (pn) (this);
    }

    final pn c(int param0, int param1) {
        if (param1 <= 58) {
            return (pn) null;
        }
        this.field_m = param0;
        return (pn) (this);
    }

    final pn a(int param0, nf[] param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.field_f = 74;
                break L1;
              }
            }
            this.field_g = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("pn.I(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (pn) (this);
    }

    final pn a(int param0, int param1) {
        if (param0 != 1918) {
            qh var4 = (qh) null;
            this.a(6, -47, (fj) null, (byte) -120, (qh) null);
        }
        this.field_f = param1;
        return (pn) (this);
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        if (param0 >= -74) {
            field_h = 1.4272429316816215;
        }
        field_a = null;
        field_b = null;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6 = (String) null;
                pn.a(31, (String) null);
                break L1;
              }
            }
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[-var4 + -1 + var2_int] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("pn.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final void a(boolean param0, pn param1) {
        try {
            param1.field_d = this.field_d;
            param1.field_f = this.field_f;
            param1.field_i = this.field_i;
            param1.field_m = this.field_m;
            param1.field_j = this.field_j;
            param1.field_c = this.field_c;
            param1.field_e = this.field_e;
            param1.field_g = this.field_g;
            if (param0) {
                field_h = 0.5523327335770317;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "pn.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        this.field_g = null;
        this.field_f = 0;
        this.field_m = -1;
        this.field_d = null;
        this.field_e = 0;
        this.field_j = 256;
        if (param0 != 2585) {
            return;
        }
        this.field_c = 0;
    }

    final pn a(boolean param0, int param1) {
        if (param1 != 0) {
            field_k = (bi) null;
        }
        this.field_i = param0 ? true : false;
        return (pn) (this);
    }

    final void a(int param0, int param1, fj param2, byte param3, qh param4) {
        ok stackIn_21_0 = null;
        String stackIn_21_1 = null;
        ok stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              di.a(param2.field_z, this.field_g, (byte) -116, param0 + param2.field_q, param2.field_F, param1 + param2.field_m);
              if (this.field_d != null) {
                L2: {
                  var6_int = this.field_e + param2.field_q + param0;
                  if (1 == param4.field_p) {
                    var6_int = var6_int + (-this.field_d.field_t + param2.field_F) / 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_c + param1 - -param2.field_m;
                  if (-2 != (param4.field_k ^ -1)) {
                    break L3;
                  } else {
                    var7 = var7 + (-this.field_d.field_x + param2.field_z) / 2;
                    break L3;
                  }
                }
                L4: {
                  if (2 == param4.field_p) {
                    var6_int = var6_int + (-this.field_d.field_t + param2.field_F);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param4.field_k) {
                    var7 = var7 + (param2.field_z - this.field_d.field_x);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_d.d(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            var6 = param4.b(param2, -2);
            if (param3 >= 43) {
              L6: {
                if (var6 == null) {
                  break L6;
                } else {
                  if (param4.field_a == null) {
                    break L6;
                  } else {
                    if ((this.field_f ^ -1) > -1) {
                      break L6;
                    } else {
                      L7: {
                        stackIn_21_0 = param4.field_a;

                        stackIn_21_1 = (String) (var6);

                        if (2147483647 == (this.field_e ^ -1)) {
                          stackIn_22_0 = (ok) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = 0;
                          break L7;
                        } else {
                          stackIn_22_0 = (ok) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = this.field_e;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_24_2 = stackIn_22_2 + (param0 + param2.field_q) - -param4.field_h;

                        stackIn_24_3 = param2.field_m + param1;

                        stackIn_24_4 = -param4.field_b;

                        if (this.field_c == -2147483648) {
                          stackIn_22_0 = (ok) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = 0;
                          break L8;
                        } else {
                          stackIn_22_0 = (ok) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = this.field_c;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_27_3 = stackIn_25_3 - (stackIn_25_4 - stackIn_25_5);

                        stackIn_27_4 = param2.field_F - (param4.field_h - -param4.field_r);

                        stackIn_27_5 = -param4.field_b + (param2.field_z + -param4.field_j);

                        stackIn_27_6 = this.field_f;

                        stackIn_27_7 = this.field_m;

                        if (2147483647 != (this.field_j ^ -1)) {
                          stackIn_22_0 = (ok) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = this.field_j;
                          break L9;
                        } else {
                          stackIn_22_0 = (ok) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = 256;
                          break L9;
                        }
                      }
                      ((ok) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param4.field_p, param4.field_k, param4.field_s);
                      break L6;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("pn.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, pn param1, int param2, int param3, fj param4, qh param5) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_i) {
                break L1;
              } else {
                param1.a(param2, param0, param4, (byte) 52, param5);
                param1.b(param3 ^ 2147481062);
                break L1;
              }
            }
            L2: {
              if (this.field_e == -2147483648) {
                break L2;
              } else {
                param1.field_e = this.field_e;
                break L2;
              }
            }
            L3: {
              if (null != this.field_d) {
                param1.field_d = this.field_d;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_g == null) {
                break L4;
              } else {
                param1.field_g = this.field_g;
                break L4;
              }
            }
            L5: {
              if (2147483647 == (this.field_j ^ -1)) {
                break L5;
              } else {
                param1.field_j = this.field_j;
                break L5;
              }
            }
            L6: {
              if (-1 > this.field_f) {
                break L6;
              } else {
                param1.field_f = this.field_f;
                break L6;
              }
            }
            L7: {
              if ((this.field_c ^ -1) == param3) {
                break L7;
              } else {
                param1.field_c = this.field_c;
                break L7;
              }
            }
            L8: {
              if (0 >= (this.field_m ^ -1)) {
                param1.field_m = this.field_m;
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var7);

            stackIn_21_1 = new StringBuilder().append("pn.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (wm.field_jb == null) {
                break L1;
              } else {
                if (wm.field_jb.equals(param2.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = wm.field_jb;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              if (gk.field_v == null) {
                break L2;
              } else {
                if (!gk.field_v.equals(param2.getParameter("session"))) {
                  var4 = gk.field_v;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param1 == -33) {
              stackIn_11_0 = ec.a(-1, (String) (var4), param0, (String) (var3), -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = var3;

            stackIn_14_1 = new StringBuilder().append("pn.D(");

            if (param0 == null) {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final pn b(int param0, int param1) {
        if (param1 != -2147483648) {
            this.field_f = -14;
        }
        this.field_e = param0;
        return (pn) (this);
    }

    pn() {
        this.field_m = -2;
        this.field_d = null;
        this.field_f = -2;
        this.field_g = null;
        this.field_j = -2147483648;
        this.field_i = false;
        this.field_c = -2147483648;
        this.field_e = -2147483648;
    }

    static {
        field_b = "Basic energy weapon";
    }
}
