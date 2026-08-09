/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends tj implements nq, he {
    static String field_G;
    static int field_K;
    static mq field_I;
    private hv field_F;
    private oe field_H;
    private fw field_M;
    static String field_L;
    static String field_J;

    public static void k(int param0) {
        field_L = null;
        field_G = null;
        field_I = null;
        if (param0 != -15) {
            qd.k(71);
            field_J = null;
            return;
        }
        field_J = null;
    }

    private final String a(byte param0) {
        if (param0 != -117) {
            this.field_M = (fw) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, byte param2, hv param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (param0 ^ -1)) {
                if ((param0 ^ -1) == -2) {
                  ak.a("privacy.ws", (byte) -77);
                  break L1;
                } else {
                  if ((param0 ^ -1) != -3) {
                    break L1;
                  } else {
                    ak.a("conduct.ws", (byte) -117);
                    break L1;
                  }
                }
              } else {
                ak.a("terms.ws", (byte) -98);
                break L1;
              }
            }
            if (param2 > 102) {
              break L0;
            } else {
              this.field_F = (hv) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("qd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        uv var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
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
        try {
          L0: {
            if (ab.a(param0, 0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ph.a(param0, (byte) 123)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!pd.a(param0, 0)) {
                  if (-1 == (param1.length() ^ -1)) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!rb.a(param1, param0, 113)) {
                      if (e.a(86, param1, param0)) {
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L1: {
                          if (!param2) {
                            break L1;
                          } else {
                            var4 = (uv) null;
                            qd.a((kl) null, (byte) 120, (uv) null, -19);
                            break L1;
                          }
                        }
                        if (ha.a(param0, (byte) -26, param1)) {
                          stackIn_27_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("qd.B(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0 != 0;
                  } else {
                    return stackIn_27_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 == param1) {
                stackIn_6_0 = this.a(false, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param1 ^ -1) == -100) {
                  stackIn_10_0 = this.b((byte) -125, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("qd.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(kl param0, byte param1, uv param2, int param3) {
        try {
            fw.field_C = tp.b(-74) * param3 / 1000;
            ui.a((byte) -124, param0);
            jj.a(-93, param0);
            lg.a(32381, param0);
            gs.a(54);
            ng.b(true);
            if (param1 <= 70) {
                String var5 = (String) null;
                qd.a((String) null, (String) null, true);
            }
            ib.field_j = 0 - fw.field_C;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    qd(oe param0) {
        super(0, 0, 288, 0, (kh) null);
        String var7 = null;
        int var3 = 0;
        lk var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_H = param0;
            this.field_M = new fw(ro.field_kb, (qo) null);
            this.field_M.field_k = (kh) ((Object) new nu());
            var7 = fo.a(4800, ih.field_R, new String[]{this.a(-29442), this.a((byte) -117)});
            var3 = 20;
            var4 = new lk(ArmiesOfGielinor.field_J, 0, 0, 0, 0, 16777215, -1, 3, 0, ArmiesOfGielinor.field_J.field_H, -1, 2147483647, true);
            this.field_F = new hv(var7, var4);
            this.field_F.field_s = "";
            this.field_F.a(nh.field_I, false, 0);
            this.field_F.a(nh.field_I, false, 1);
            this.field_F.field_l = -40 + this.field_l;
            this.field_F.field_x = (qo) (this);
            this.field_F.a(this.field_l + -40, 9567, 26, var3);
            var3 = var3 + (this.field_F.field_w - -15);
            this.a((byte) 10, (kb) (this.field_F));
            var5 = 4;
            var6 = 200;
            this.field_M.a(-var6 + 300 >> -1548355359, var6, var3, 8192, 40);
            this.field_M.field_x = (qo) (this);
            this.a((byte) 10, (kb) (this.field_M));
            this.a(0, 300, 0, 8192, var5 + var3 + 55);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                field_L = (String) null;
                break L1;
              }
            }
            if (param4 == this.field_M) {
              bt.b(0);
              this.field_H.b(true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("qd.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final String a(int param0) {
        if (param0 != -29442) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_J = "Off";
    }
}
