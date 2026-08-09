/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends ck {
    int field_D;
    int field_B;
    int field_I;
    static gi field_H;
    int field_M;
    static int field_F;
    int field_O;
    static int field_w;
    int field_K;
    int field_r;
    int field_L;
    sk field_q;
    int field_y;
    em field_A;
    int field_p;
    static String field_u;
    int field_t;
    int field_x;
    int field_C;
    bj field_E;
    int field_v;
    ca field_N;
    static String field_s;
    int field_o;
    int field_z;
    int field_J;

    public static void e(int param0) {
        field_s = null;
        field_u = null;
        if (param0 != 0) {
            return;
        }
        field_H = null;
    }

    final static wk[] a(byte param0, wk param1) {
        wk[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        wk[] var4 = null;
        wk[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new wk[9];
              var2 = var4;
              if (param0 == 26) {
                break L1;
              } else {
                var3 = (int[]) null;
                hj.a(87, false, (int[]) null, (int[]) null);
                break L1;
              }
            }
            var4[4] = param1;
            stackIn_3_0 = (wk[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("hj.B(").append(param0).append(',');

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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, m param1) {
        if (param0 <= 26) {
            return;
        }
        try {
            ob.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "hj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        this.field_A = null;
        this.field_N = null;
        if (param0 != 4096) {
            return;
        }
        this.field_q = null;
        this.field_E = null;
    }

    final static nk a(int param0, boolean param1, int[] param2, int[] param3) {
        int incrementValue$0 = 0;
        nk stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        nk stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nk var6 = null;
        nk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            if (param3 != null) {
              if (param3.length != 0) {
                var4_int = 0;
                incrementValue$0 = var4_int;
                var4_int++;
                var5 = param3[incrementValue$0];
                if (param0 == -24809) {
                  L1: {
                    var6 = ul.a(var5, (byte) 67);
                    if (var6 == null) {
                      break L1;
                    } else {
                      if (var6.field_Q == 1) {
                        var7 = new nk(var6, param1);
                        var4_int = var7.a(var4_int, param3, param1, 0);
                        var9 = 0;
                        L2: while (true) {
                          if ((var9 ^ -1) <= -9) {
                            var8 = var4_int;
                            var4_int = var8;
                            L3: while (true) {
                              if (param3.length <= var4_int) {
                                stackIn_24_0 = (nk) (var7);
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                if (-var8 + var4_int < 8) {
                                  param2[-var8 + var4_int] = param3[var4_int];
                                  var4_int++;
                                  continue L3;
                                } else {
                                  dh.a("Too much data", (byte) 121);
                                  stackIn_21_0 = null;
                                  decompiledRegionSelector0 = 2;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            param2[var9] = -1;
                            var9++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  dh.a(db.a("Chassis not correct id: ID=<%0>", -43, new String[]{Integer.toString(var5)}), (byte) 120);
                  stackIn_13_0 = null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = (nk) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4);

            stackIn_27_1 = new StringBuilder().append("hj.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L5;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (nk) ((Object) stackIn_13_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (nk) ((Object) stackIn_21_0);
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            try {
              L1: {
                if (!pn.field_w.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param1.startsWith("https://")) {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    if (param1.length() <= var3) {
                      L4: {
                        if (param0 == -9062) {
                          break L4;
                        } else {
                          field_s = (String) null;
                          break L4;
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if ((var2.indexOf((int) param1.charAt(var3)) ^ -1) != 0) {
                        var3++;
                        continue L3;
                      } else {
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_21_0 = 0;
              return stackIn_21_0 != 0;
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
            stackIn_24_0 = (RuntimeException) (var2_ref2);

            stackIn_24_1 = new StringBuilder().append("hj.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    hj() {
    }

    static {
        field_w = 4096;
        field_u = "Scamming";
    }
}
