/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p implements eb {
    short field_o;
    static String field_k;
    short field_p;
    static String field_n;
    static String field_b;
    static int[] field_c;
    private nc field_j;
    short field_f;
    short field_h;
    short field_m;
    short field_a;
    static vh field_i;
    private byte field_e;
    int[] field_l;
    static String field_g;
    private byte field_d;

    public final int b(int[] param0, int param1) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -27) {
                break L1;
              } else {
                var4 = (int[]) null;
                this.b(121, (int[]) null);
                break L1;
              }
            }
            stackIn_3_0 = param0[9] * (this.field_l[0] + -param0[0]) + ((-param0[1] + this.field_l[1]) * param0[10] - -(param0[11] * (this.field_l[2] - param0[2])));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("p.C(");

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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1) {
        if (!(null == sa.field_f)) {
            if (!(!sa.field_f.b((byte) -52, param0))) {
                sa.field_f = null;
            }
        }
        int var2 = 20 / ((param1 - -42) / 48);
    }

    final static String a(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        char[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        char[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        char[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int var5;
        char[] var6;
        String var7;
        char[] var8;
        char[] var9;
        var7 = new String(jk.field_k);
        if (param2 == 45) {
          L0: {
            var5 = var7.indexOf("hh");
            var9 = var7.toCharArray();
            var8 = var9;
            var6 = var8;
            if (param3 > 100) {
              incrementValue$0 = var5;
              var5++;
              var6[incrementValue$0] = (char)58;
              incrementValue$1 = var5;
              var5++;
              var6[incrementValue$1] = (char)40;
              break L0;
            } else {
              L1: {
                incrementValue$2 = var5;
                var5++;
                stackIn_5_0 = (char[]) (var6);

                stackIn_5_1 = incrementValue$2;

                if (-1 < (param3 ^ -1)) {
                  stackIn_6_0 = (char[]) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = 45;
                  break L1;
                } else {
                  stackIn_6_0 = (char[]) ((Object) stackIn_5_0);
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = param3 / 10 + 48;
                  break L1;
                }
              }
              L2: {
                stackIn_6_0[stackIn_6_1] = (char)stackIn_6_2;
                incrementValue$3 = var5;
                var5++;
                stackIn_8_0 = (char[]) (var6);

                stackIn_8_1 = incrementValue$3;

                if (0 <= param3) {
                  stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 48 + param3 % 10;
                  break L2;
                } else {
                  stackIn_9_0 = (char[]) ((Object) stackIn_8_0);
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 45;
                  break L2;
                }
              }
              stackIn_9_0[stackIn_9_1] = (char)stackIn_9_2;
              break L0;
            }
          }
          L3: {
            var5 = var7.indexOf("mm");
            incrementValue$4 = var5;
            var5++;
            stackIn_13_0 = (char[]) (var6);

            stackIn_13_1 = incrementValue$4;

            if (0 <= param0) {
              stackIn_14_0 = (char[]) ((Object) stackIn_13_0);
              stackIn_14_1 = stackIn_13_1;
              stackIn_14_2 = 48 + param0 / 10;
              break L3;
            } else {
              stackIn_14_0 = (char[]) ((Object) stackIn_13_0);
              stackIn_14_1 = stackIn_13_1;
              stackIn_14_2 = 45;
              break L3;
            }
          }
          L4: {
            stackIn_14_0[stackIn_14_1] = (char)stackIn_14_2;
            incrementValue$5 = var5;
            var5++;
            stackIn_16_0 = (char[]) (var6);

            stackIn_16_1 = incrementValue$5;

            if (param0 >= 0) {
              stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
              stackIn_17_1 = stackIn_16_1;
              stackIn_17_2 = param0 % 10 + 48;
              break L4;
            } else {
              stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
              stackIn_17_1 = stackIn_16_1;
              stackIn_17_2 = 45;
              break L4;
            }
          }
          L5: {
            stackIn_17_0[stackIn_17_1] = (char)stackIn_17_2;
            var5 = var7.indexOf("ss");
            incrementValue$6 = var5;
            var5++;
            stackIn_19_0 = (char[]) (var6);

            stackIn_19_1 = incrementValue$6;

            if ((param1 ^ -1) > -1) {
              stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
              stackIn_20_1 = stackIn_19_1;
              stackIn_20_2 = 45;
              break L5;
            } else {
              stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
              stackIn_20_1 = stackIn_19_1;
              stackIn_20_2 = param1 / 10 + 48;
              break L5;
            }
          }
          L6: {
            stackIn_20_0[stackIn_20_1] = (char)stackIn_20_2;
            incrementValue$7 = var5;
            var5++;
            stackIn_22_0 = (char[]) (var6);

            stackIn_22_1 = incrementValue$7;

            if ((param1 ^ -1) <= -1) {
              stackIn_23_0 = (char[]) ((Object) stackIn_22_0);
              stackIn_23_1 = stackIn_22_1;
              stackIn_23_2 = 48 + param1 % 10;
              break L6;
            } else {
              stackIn_23_0 = (char[]) ((Object) stackIn_22_0);
              stackIn_23_1 = stackIn_22_1;
              stackIn_23_2 = 45;
              break L6;
            }
          }
          stackIn_23_0[stackIn_23_1] = (char)stackIn_23_2;
          return new String(var9);
        } else {
          return (String) null;
        }
    }

    public final void a(int[] param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_j.b(param0, this.field_l);
              if (param1 == -32215) {
                break L1;
              } else {
                this.field_m = (short) -26;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("p.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_e = (byte)(-param1 > this.field_l[0] ? 1 : this.field_l[0] <= param1 ? 0 : -1);
        this.field_d = (byte)(this.field_l[1] < -param0 ? 1 : this.field_l[1] <= param0 ? 0 : -1);
        if (param2 > -71) {
            this.field_e = (byte) 71;
        }
    }

    final int b(int param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = this.field_l[0] + -param1[0];
            var4 = -param1[1] + this.field_l[1];
            if (param0 == -13025) {
              var5 = this.field_l[2] - param1[2];
              stackIn_4_0 = var3_int * var3_int + (var4 * var4 + var5 * var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 3;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("p.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int[] var3 = null;
        if (null == this.field_l) {
            this.field_l = pn.field_r;
        } else {
            if (!(-13 >= (this.field_l.length ^ -1))) {
                var2 = 0;
                var3 = this.field_l;
                this.field_l = new int[12];
                while (var2 < var3.length) {
                    this.field_l[var2] = var3[var2];
                    var2++;
                }
                while (var2 < this.field_l.length) {
                    this.field_l[var2] = pn.field_r[var2];
                    var2++;
                }
            }
        }
        if (param0 < 118) {
            int[] var4 = (int[]) null;
            this.a(-115, (String) null, (int[]) null);
        }
    }

    final static java.net.URL a(byte param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        java.net.URL stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = 50 / ((param0 - 20) / 37);
              var3 = null;
              var4 = null;
              if (null == ar.field_g) {
                break L1;
              } else {
                if (ar.field_g.equals(param2.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = ar.field_g;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              if (null == om.field_y) {
                break L2;
              } else {
                if (om.field_y.equals(param2.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = om.field_y;
                  break L2;
                }
              }
            }
            stackIn_7_0 = pr.a(-1, param1, (String) (var3), (byte) 63, (String) (var4));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = var3;

            stackIn_10_1 = new StringBuilder().append("p.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {

              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {

              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, String param1, int[] param2) {
        float[] var5 = null;
        float[] var6 = null;
        try {
            var5 = new float[]{(float)(this.field_h + this.field_p) / 2.0f, (float)(this.field_m + this.field_a) / 2.0f, (float)(this.field_o - -this.field_f) / 2.0f};
            var6 = var5;
            ag.a(param2, var6, 9);
            if (param0 <= 20) {
                this.a(-74, 99, 4);
            }
            sa.field_h.b(param1, (int)(0.5f + var5[0]), (int)(0.5f + var5[1]), 16764142, 1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "p.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        field_c = null;
        if (param0 < 20) {
            field_c = (int[]) null;
        }
        field_n = null;
        field_g = null;
        field_i = null;
        field_b = null;
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            if (param0 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param0.length();
              if (1 > var3_int) {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = hq.a(param1 ^ -12, param0);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if ((var4.length() ^ -1) > -2) {
                        break L1;
                      } else {
                        L2: {
                          if (qd.a(0, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!qd.a(0, var4.charAt(var4.length() + -1))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param0.length()) {
                                  L4: {
                                    if (param1 == -113) {
                                      break L4;
                                    } else {
                                      field_n = (String) null;
                                      break L4;
                                    }
                                  }
                                  if (-1 <= (var5 ^ -1)) {
                                    stackIn_35_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_33_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param0.charAt(var6);
                                    if (!qd.a(param1 + 113, (char) var7)) {
                                      var5 = 0;
                                      break L5;
                                    } else {
                                      var5++;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 < 2) {
                                      break L6;
                                    } else {
                                      if (param2) {
                                        break L6;
                                      } else {
                                        stackIn_27_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("p.G(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L7;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L7;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_27_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    return stackIn_35_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final void c(int param0, int[] param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_j.a() << -1428015231 > nc.field_Y.length) {
                this.a(6710886, param1);
                this.a(112, "Model too big - radixsize:" + (this.field_j.a() << -819209503) + " maxmodelsize:" + nc.field_Y.length, param1);
                break L1;
              } else {
                this.field_j.a(param1, this.field_l);
                break L1;
              }
            }
            L2: {
              if (param0 == 6710886) {
                break L2;
              } else {
                field_k = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("p.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(boolean param0, int[] param1) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var4 = (int[]) null;
                this.a((int[]) null, 86);
                break L1;
              }
            }
            L2: {
              if (0 >= this.field_e * (this.field_l[0] + -param1[0]) + this.field_d * (-param1[1] + this.field_l[1])) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("p.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int[][] var5;
        int var6;
        int var7;
        short dupTemp$0 = (short)this.field_l[1];
        this.field_m = dupTemp$0;
        this.field_a = dupTemp$0;
        short dupTemp$1 = (short)this.field_l[2];
        this.field_f = dupTemp$1;
        this.field_o = dupTemp$1;
        short dupTemp$2 = (short)this.field_l[0];
        this.field_p = dupTemp$2;
        this.field_h = dupTemp$2;
        var5 = new int[][]{this.field_j.field_j, this.field_j.field_T, this.field_j.field_R};
        var6 = 0;
        L0: while (true) {
          if (this.field_j.field_P <= var6) {
            L1: {
              if (param0 == 16775) {
                break L1;
              } else {
                this.field_p = (short) 97;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (null == this.field_j.field_J) {
                break L2;
              } else {
                if (-2 != this.field_j.field_J[var6]) {
                  break L2;
                } else {
                  var6++;
                  continue L0;
                }
              }
            }
            var7 = 0;
            L3: while (true) {
              if (var7 < 3) {
                L4: {
                  var2 = (this.field_l[5] * this.field_j.field_D[var5[var7][var6]] + this.field_l[4] * this.field_j.field_Q[var5[var7][var6]] + this.field_j.field_t[var5[var7][var6]] * this.field_l[3] >> 487587920) + this.field_l[0];
                  var4 = this.field_l[2] + (this.field_l[11] * this.field_j.field_D[var5[var7][var6]] + (this.field_j.field_t[var5[var7][var6]] * this.field_l[9] + this.field_l[10] * this.field_j.field_Q[var5[var7][var6]]) >> 1459585456);
                  var3 = (this.field_l[8] * this.field_j.field_D[var5[var7][var6]] + (this.field_j.field_t[var5[var7][var6]] * this.field_l[6] + this.field_l[7] * this.field_j.field_Q[var5[var7][var6]]) >> -1829345392) + this.field_l[1];
                  if (var4 >= this.field_o) {
                    if (this.field_f < var4) {
                      this.field_f = (short)var4;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    this.field_o = (short)var4;
                    break L4;
                  }
                }
                L5: {
                  if (this.field_h <= var2) {
                    if (var2 <= this.field_p) {
                      break L5;
                    } else {
                      this.field_p = (short)var2;
                      break L5;
                    }
                  } else {
                    this.field_h = (short)var2;
                    break L5;
                  }
                }
                if (var3 < this.field_a) {
                  this.field_a = (short)var3;
                  var7++;
                  continue L3;
                } else {
                  if (var3 > this.field_m) {
                    this.field_m = (short)var3;
                    var7++;
                    continue L3;
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int[] param1) {
        try {
            bb.a((int) this.field_a, param1, (int) this.field_h, -28361, 6697779, (int) this.field_p, (int) this.field_a, (int) this.field_o, (int) this.field_o);
            bb.a((int) this.field_a, param1, (int) this.field_h, -28361, param0, (int) this.field_p, (int) this.field_a, (int) this.field_f, (int) this.field_f);
            bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 6710886, (int) this.field_p, (int) this.field_m, (int) this.field_o, (int) this.field_o);
            bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 6710886, (int) this.field_p, (int) this.field_m, (int) this.field_f, (int) this.field_f);
            bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 3368499, (int) this.field_h, (int) this.field_a, (int) this.field_o, (int) this.field_o);
            bb.a((int) this.field_m, param1, (int) this.field_h, -28361, 6710886, (int) this.field_h, (int) this.field_a, (int) this.field_f, (int) this.field_f);
            bb.a((int) this.field_m, param1, (int) this.field_p, -28361, 6710886, (int) this.field_p, (int) this.field_a, (int) this.field_o, (int) this.field_o);
            bb.a((int) this.field_m, param1, (int) this.field_p, param0 + -6739247, 6710886, (int) this.field_p, (int) this.field_a, (int) this.field_f, (int) this.field_f);
            bb.a((int) this.field_a, param1, (int) this.field_h, -28361, 3355494, (int) this.field_h, (int) this.field_a, (int) this.field_o, (int) this.field_f);
            bb.a((int) this.field_m, param1, (int) this.field_h, param0 ^ -6686895, 6710886, (int) this.field_h, (int) this.field_m, (int) this.field_o, (int) this.field_f);
            bb.a((int) this.field_a, param1, (int) this.field_p, -28361, 6710886, (int) this.field_p, (int) this.field_a, (int) this.field_o, (int) this.field_f);
            bb.a((int) this.field_m, param1, (int) this.field_p, -28361, 6710886, (int) this.field_p, (int) this.field_m, (int) this.field_o, (int) this.field_f);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "p.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    p(nc param0, int[] param1) {
        this.field_l = new int[]{0, 0, 0};
        try {
            this.field_j = param0;
            this.field_l = param1;
            this.c(126);
            this.a(16775);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "p.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "<%0> is offering a rematch.";
        field_b = "Real-life threats";
        field_n = "Time: <%0>";
        field_g = "Invalid name";
    }
}
