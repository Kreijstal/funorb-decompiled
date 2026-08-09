/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends ah {
    static int[] field_cb;
    private oi field_bb;

    final void a(mn param0, byte param1) {
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        try {
            var13 = new double[12];
            var12 = var13;
            var11 = var12;
            double[] var3 = var11;
            int var4 = 21 % ((param1 - -2) / 62);
            this.field_ab.a((byte) 33, var13);
            var5 = var13[9];
            var7 = var13[10];
            this.field_bb.field_o = -(var7 * this.field_C) + this.field_t;
            this.field_bb.field_t = this.field_E - var5 * this.field_C;
            var9 = var13[11];
            this.field_bb.field_w = true;
            this.field_bb.field_x = -var7;
            this.field_bb.field_u = 30.0;
            this.field_bb.field_p = -(this.field_C * var9) + this.field_D;
            this.field_bb.field_v = -var9;
            this.field_bb.field_m = -var5;
            param0.a((rk) (this.field_bb), (byte) 99);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ik.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(boolean param0) {
        field_cb = null;
        if (!param0) {
            field_cb = (int[]) null;
        }
    }

    final static va a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        va stackIn_5_0 = null;
        va stackIn_8_0 = null;
        va stackIn_17_0 = null;
        va stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -126) {
                break L1;
              } else {
                field_cb = (int[]) null;
                break L1;
              }
            }
            var2_int = param1.length();
            if (-1 != (var2_int ^ -1)) {
              if (-64 <= (var2_int ^ -1)) {
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param1.charAt(var3);
                      if (var4 != 45) {
                        if (-1 == kh.field_W.indexOf(var4)) {
                          stackIn_21_0 = ql.field_k;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      } else {
                        L4: {
                          if (0 == var3) {
                            break L4;
                          } else {
                            if (var2_int + -1 == var3) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_17_0 = ql.field_k;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_8_0 = m.field_g;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = vf.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ik.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    ik(hn param0, dj param1) {
        super(param0, param1, 0.4, 0.02, 64.0, un.field_h);
        this.field_bb = new oi((pm) (this));
        try {
            kj.a(pe.field_o, 96, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (df.field_f.startsWith("win")) {
                  L2: {
                    if (param1 == -1) {
                      break L2;
                    } else {
                      var5 = (String) null;
                      ik.a((String) null, 56);
                      break L2;
                    }
                  }
                  L3: {
                    if (param0.startsWith("http://")) {
                      break L3;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L3;
                      } else {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= param0.length()) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                        var3++;
                        continue L4;
                      } else {
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_19_0 = 0;
              return stackIn_19_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref2);

            stackIn_22_1 = new StringBuilder().append("ik.J(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    ik(hn param0, ee param1, double[] param2, double param3, double param4, double param5) {
        super(param0, param1, 0.4, 0.02, 16.0, param2, param3, param4, param5, un.field_h);
        this.field_bb = new oi((pm) (this));
        try {
            kj.a(pe.field_o, 96, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        try {
          L0: {
            if (!this.field_N) {
              var17 = new double[12];
              var16 = var17;
              var15 = var16;
              var7 = var15;
              this.field_ab.a((byte) 89, var17);
              var8 = var17[9];
              if (param2 <= -5) {
                L1: {
                  var10 = var17[10];
                  var12 = var17[11];
                  if (param3.field_N * var12 + (param3.field_H * var10 + param3.field_P * var8) <= 0.0) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  var14 = stackIn_7_0;
                  if (var14 == 0) {
                    break L2;
                  } else {
                    this.a(hn.field_f, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
                    break L2;
                  }
                }
                L3: {
                  pa.a(-(this.field_C * var8) + this.field_E, 0.4 * this.field_C, (byte) -11, 256, -(this.field_C * var12) + this.field_D, this.field_t - this.field_C * var10, wb.field_a, param1, param3);
                  if (var14 == 0) {
                    this.a(hn.field_f, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("ik.QA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        fl.a(this.a((byte) 108, ib.field_J, 1.5), 4);
        this.a(mg.field_b, false);
        for (var2 = 0; (var2 ^ -1) > -6; var2++) {
            ri.a((rk) (this), param0 + -26402, new mm(this.field_A, (ee) (this), this.field_ab, mg.field_b[var2]));
        }
        if (param0 != 26402) {
            mn var4 = (mn) null;
            this.a((mn) null, (byte) 88);
        }
    }

    static {
    }
}
