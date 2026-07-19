/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ld {
    private boolean field_X;
    private String field_S;
    private boolean field_Z;
    private c field_Y;
    private String field_U;
    static String field_W;
    static int[] field_V;
    static String field_T;

    final void f(byte param0) {
        this.field_Z = true;
        int var2 = -94 % ((17 - param0) / 46);
        this.field_Y.field_B = false;
    }

    lb(i param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_S = param1;
            if (null != this.field_S) {
                var3_int = uc.field_g.b(this.field_S, 260, uc.field_g.field_F);
                this.b(300, -2038584927, 150 - -var3_int);
            }
            this.field_Y = new c(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Z = false;
            this.field_X = false;
            this.field_Y.field_B = true;
            this.a(this.field_Y, 5411);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean g(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -94) {
          L0: {
            field_W = (String) null;
            rh.field_f = true;
            kj.field_I = je.a(1) - -15000L;
            if (-12 != (fj.field_i ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            rh.field_f = true;
            kj.field_I = je.a(1) - -15000L;
            if (-12 != (fj.field_i ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void m(int param0) {
        field_T = null;
        field_W = null;
        if (param0 <= 118) {
            return;
        }
        field_V = null;
    }

    final static boolean b(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_21_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_19_0 = 0;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var7 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                if (me.field_g) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  L1: {
                    if (param1 == 6669) {
                      break L1;
                    } else {
                      lb.m(14);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      var2 = "tuhstatbut";
                      var3 = (String) (fd.a(param0, "getcookies", (byte) 94));
                      var4 = b.a(var3, ';', true);
                      var5 = 0;
                      L3: while (true) {
                        L4: {
                          if (var5 >= var4.length) {
                            break L4;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            stackOut_9_0 = 0;
                            stackIn_21_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var7 != 0) {
                              decompiledRegionSelector0 = 1;
                              break L2;
                            } else {
                              L5: {
                                if (stackIn_10_0 > var6) {
                                  break L5;
                                } else {
                                  if (var4[var5].substring(0, var6).trim().equals(var2)) {
                                    stackOut_13_0 = 1;
                                    stackIn_14_0 = stackOut_13_0;
                                    decompiledRegionSelector0 = 2;
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L6: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    if (decompiledRegionSelector0 == 0) {
                      if (param0.getParameter("tuhstatbut") == null) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L7;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L7;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L7;
                      } else {
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (var2_ref);
                stackOut_22_1 = new StringBuilder().append("lb.I(");
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param0 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L8;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L8;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_14_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static o a(int param0, o param1, int param2, int param3, int param4, int param5) {
        o var6 = null;
        RuntimeException var6_ref = null;
        o stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var6 = new o(0, param4);
            var6.field_t = param1.field_t;
            var6.field_p = param1.field_p;
            var6.field_r = param1.field_r - (-param5 + -param0);
            var6.field_n = param5 + param1.field_n;
            var6.field_q = param3 + param1.field_q - -param2;
            var6.field_v = param1.field_v;
            var6.field_s = param1.field_s - -param2;
            stackOut_0_0 = (o) (var6);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6_ref);
            stackOut_2_1 = new StringBuilder().append("lb.M(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, byte param1, int param2) {
        int discarded$0 = 0;
        int var4 = 90 / ((param1 - -55) / 39);
        super.a(param0, (byte) 52, param2);
        uc.field_g.a(this.field_U, (this.field_t >> 91607137) + param0, param2 - -103, 16777215, -1);
        if (!(this.field_S == null)) {
            mi.b(param0 + 20, -7 + (120 + param2), 260, 8421504);
            discarded$0 = uc.field_g.a(this.field_S, param0 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, uc.field_g.field_F);
        }
    }

    final void a(String param0, boolean param1, float param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (this.field_X ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                L4: {
                  ((lb) (this)).field_X = stackIn_8_1 != 0;
                  if (this.field_X) {
                    break L4;
                  } else {
                    this.field_Y.a((byte) -127, 4210752, 2113632);
                    if (this.field_Z) {
                      this.field_Y.field_B = false;
                      if (!SolKnight.field_L) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_Y.a((byte) 69, 4210752, 8405024);
                this.field_Y.field_B = true;
                break L2;
              } else {
                break L2;
              }
            }
            this.field_U = param0;
            this.field_Y.field_R = (int)(param2 / 100.0f * 65536.0f);
            if (param3 > 124) {
              break L0;
            } else {
              this.field_Y = (c) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("lb.OA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_T = "Resume Game";
        field_V = new int[128];
    }
}
