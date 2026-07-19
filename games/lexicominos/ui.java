/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ui extends cf {
    private int field_ab;
    private int field_bb;
    private boolean field_M;
    private int field_p;
    private int field_X;
    private int field_Q;
    private db[] field_W;
    private int field_q;
    static int[] field_D;
    private db[] field_N;
    private int field_y;
    private db field_F;
    private int field_u;
    private db field_Y;
    private String field_r;
    private int field_J;
    private db[] field_x;
    private db[] field_E;
    private db field_V;
    private int field_z;
    private int field_I;
    private db field_B;
    private int field_cb;
    static String field_w;
    private int field_C;
    private db[] field_T;
    private int field_H;
    private boolean field_s;
    private int field_L;
    private boolean field_P;
    private le field_K;
    private int field_S;
    private int field_v;
    private db field_t;
    private boolean field_Z;
    private boolean field_A;
    private boolean field_U;
    private String field_O;
    private int field_G;

    final static tf a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        tf var5 = null;
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        tf stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_7_0 = null;
        tf stackOut_13_0 = null;
        tf stackOut_3_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() != 0) {
                  var2_int = param1.indexOf('@');
                  if (0 == (var2_int ^ -1)) {
                    stackOut_7_0 = w.field_k;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (param0 == -100) {
                        break L2;
                      } else {
                        field_w = (String) null;
                        break L2;
                      }
                    }
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = ah.a(var3, (byte) 111);
                    if (var5 != null) {
                      stackOut_13_0 = (tf) (var5);
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return e.a(var4, -101);
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = fd.field_e;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("ui.S(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (sh.d(param1, (byte) 50)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!hd.a(param1, 17)) {
                if (ph.a((byte) 107, param1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.length() == 0) {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!bi.a((byte) -126, param0, param1)) {
                      if (pd.a(param0, param1, 95)) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param2 == -118) {
                          if (ni.a((byte) 120, param1, param0)) {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return true;
                          }
                        } else {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var3);
            stackOut_29_1 = new StringBuilder().append("ui.V(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          L2: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
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
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0 != 0;
                    } else {
                      return stackIn_28_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static wf a(int param0, byte[] param1, int param2) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wf stackIn_3_0 = null;
        wf stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wf stackOut_15_0 = null;
        wf stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3 = new wf(param1.length);
            var4 = param1.length / param0;
            if (param2 == -29165) {
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (var4 <= var5) {
                    var3.field_h = param1.length;
                    break L2;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      var6 = 0;
                      L3: while (true) {
                        L4: {
                          if (param0 <= var6) {
                            var5++;
                            break L4;
                          } else {
                            var3.field_j[var6 * var4 + var5] = param1[param0 * var5 + var6];
                            var6++;
                            if (var7 != 0) {
                              break L4;
                            } else {
                              continue L3;
                            }
                          }
                        }
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_15_0 = (wf) (var3);
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (wf) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("ui.U(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static void d(int param0) {
        vg.a(113);
        ni.a(param0 ^ -122, param0);
    }

    private final void a(byte param0, ui param1) {
        wf discarded$1 = null;
        RuntimeException var3 = null;
        byte[] var4 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                L2: {
                  if (0 != param1.field_ab) {
                    this.field_ab = param1.field_ab;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param1.field_U) {
                    break L3;
                  } else {
                    this.field_U = param1.field_U;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_z != 256) {
                    this.field_z = param1.field_z;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_W == null) {
                    break L5;
                  } else {
                    this.field_W = param1.field_W;
                    break L5;
                  }
                }
                L6: {
                  if (null != param1.field_x) {
                    this.field_x = param1.field_x;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-2147483648 == param1.field_y) {
                    break L7;
                  } else {
                    this.field_y = param1.field_y;
                    break L7;
                  }
                }
                L8: {
                  if (-1 >= (param1.field_q ^ -1)) {
                    this.field_q = param1.field_q;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (-1 == (param1.field_X ^ -1)) {
                    break L9;
                  } else {
                    this.field_X = param1.field_X;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_r != null) {
                    this.field_r = param1.field_r;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if ((param1.field_bb ^ -1) == 2147483647) {
                    break L11;
                  } else {
                    this.field_bb = param1.field_bb;
                    break L11;
                  }
                }
                L12: {
                  if (-2147483648 == param1.field_J) {
                    break L12;
                  } else {
                    this.field_J = param1.field_J;
                    break L12;
                  }
                }
                L13: {
                  if (2147483647 != (param1.field_u ^ -1)) {
                    this.field_u = param1.field_u;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null == param1.field_E) {
                    break L14;
                  } else {
                    this.field_E = param1.field_E;
                    break L14;
                  }
                }
                L15: {
                  if (null == param1.field_N) {
                    break L15;
                  } else {
                    this.field_N = param1.field_N;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_v != 0) {
                    this.field_v = param1.field_v;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_K == null) {
                    break L17;
                  } else {
                    this.field_K = param1.field_K;
                    break L17;
                  }
                }
                L18: {
                  if (-1 == (param1.field_G ^ -1)) {
                    break L18;
                  } else {
                    this.field_G = param1.field_G;
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_F == null) {
                    break L19;
                  } else {
                    this.field_F = param1.field_F;
                    break L19;
                  }
                }
                L20: {
                  if (0 != param1.field_Q) {
                    this.field_Q = param1.field_Q;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null != param1.field_B) {
                    this.field_B = param1.field_B;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_V != null) {
                    this.field_V = param1.field_V;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (-1 != (param1.field_S ^ -1)) {
                    this.field_S = param1.field_S;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_Z) {
                    this.field_Z = param1.field_Z;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_s) {
                    this.field_s = param1.field_s;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_A) {
                    this.field_A = param1.field_A;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null == param1.field_O) {
                    break L27;
                  } else {
                    this.field_O = param1.field_O;
                    break L27;
                  }
                }
                L28: {
                  if (-2147483648 == param1.field_H) {
                    break L28;
                  } else {
                    this.field_H = param1.field_H;
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_cb == -2147483648) {
                    break L29;
                  } else {
                    this.field_cb = param1.field_cb;
                    break L29;
                  }
                }
                L30: {
                  if (0 <= param1.field_C) {
                    this.field_C = param1.field_C;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (0 <= param1.field_I) {
                    this.field_I = param1.field_I;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (!param1.field_P) {
                    break L32;
                  } else {
                    this.field_P = param1.field_P;
                    break L32;
                  }
                }
                L33: {
                  if (-1 != (param1.field_L ^ -1)) {
                    this.field_L = param1.field_L;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (param1.field_p < 0) {
                    break L34;
                  } else {
                    this.field_p = param1.field_p;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_Y == null) {
                    break L35;
                  } else {
                    this.field_Y = param1.field_Y;
                    break L35;
                  }
                }
                L36: {
                  if (!param1.field_M) {
                    this.field_M = param1.field_M;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_t == null) {
                    break L37;
                  } else {
                    this.field_t = param1.field_t;
                    break L37;
                  }
                }
                if (null != param1.field_T) {
                  this.field_T = param1.field_T;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L38: {
              if (param0 == -74) {
                break L38;
              } else {
                var4 = (byte[]) null;
                discarded$1 = ui.a(-111, (byte[]) null, 17);
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) (var3);
            stackOut_97_1 = new StringBuilder().append("ui.T(").append(param0).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param1 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L39;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L39;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ')');
        }
    }

    ui(long param0, ui param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void e(int param0) {
        field_D = null;
        if (param0 != -1) {
            return;
        }
        field_w = null;
    }

    private ui(long param0, ui param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        this.field_p = -1;
        this.field_J = -2147483648;
        this.field_bb = -2147483648;
        this.field_z = 256;
        this.field_I = -1;
        this.field_H = -2147483648;
        this.field_C = -1;
        this.field_y = -2147483648;
        this.field_cb = -2147483648;
        this.field_M = true;
        this.field_q = -1;
        this.field_u = -2147483648;
        this.field_s = false;
        try {
          L0: {
            L1: {
              this.field_d = param0;
              this.a((byte) -74, param1);
              if (param6 == null) {
                break L1;
              } else {
                this.field_O = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("ui.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
    }
}
