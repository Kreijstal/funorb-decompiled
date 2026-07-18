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
        tf stackIn_5_0 = null;
        tf stackIn_10_0 = null;
        tf stackIn_18_0 = null;
        tf stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_9_0 = null;
        tf stackOut_17_0 = null;
        tf stackOut_19_0 = null;
        tf stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1) {
                break L1;
              } else {
                if (param1.length() != 0) {
                  var2_int = param1.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_9_0 = w.field_k;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    L2: {
                      if (param0 == -100) {
                        break L2;
                      } else {
                        field_w = null;
                        break L2;
                      }
                    }
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = ah.a(var3, (byte) 111);
                    if (var5 != null) {
                      stackOut_17_0 = (tf) var5;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      stackOut_19_0 = e.a(var4, -101);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = fd.field_e;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ui.S(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_20_0;
    }

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        try {
          L0: {
            if (sh.d(param1, (byte) 50)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (!hd.a(param1, 17)) {
                if (ph.a((byte) 107, param1)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                } else {
                  if (param0.length() == 0) {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    if (!bi.a((byte) -126, param0, param1)) {
                      if (pd.a(param0, param1, 95)) {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        if (param2 == -118) {
                          if (ni.a((byte) 120, param1, param0)) {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
                          } else {
                            stackOut_34_0 = 1;
                            stackIn_35_0 = stackOut_34_0;
                            break L0;
                          }
                        } else {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        }
                      }
                    } else {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("ui.V(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L1;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L1;
            }
          }
          L2: {
            stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
            stackOut_40_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L2;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param2 + ')');
        }
        return stackIn_35_0 != 0;
    }

    final static wf a(int param0, byte[] param1, int param2) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        wf stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        wf stackOut_16_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3 = new wf(param1.length);
            var4 = param1.length / param0;
            if (param2 == -29165) {
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 >= ~var5) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L2;
                      } else {
                        var6 = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (param0 <= var6) {
                                break L6;
                              } else {
                                var3.field_j[var6 * var4 + var5] = param1[param0 * var5 + var6];
                                var6++;
                                if (var7 != 0) {
                                  break L5;
                                } else {
                                  if (var7 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var5++;
                            break L5;
                          }
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  var3.field_h = param1.length;
                  break L2;
                }
                stackOut_16_0 = (wf) var3;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (wf) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("ui.U(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    final static void d(int param0) {
        try {
            vg.a(113);
            ni.a(param0 ^ -122, param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ui.W(" + param0 + ')');
        }
    }

    private final void a(byte param0, ui param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_141_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        String stackOut_140_2 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1) {
                break L1;
              } else {
                L2: {
                  if (0 != param1.field_ab) {
                    ((ui) this).field_ab = param1.field_ab;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param1.field_U) {
                    break L3;
                  } else {
                    ((ui) this).field_U = param1.field_U;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_z != 256) {
                    ((ui) this).field_z = param1.field_z;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_W == null) {
                    break L5;
                  } else {
                    ((ui) this).field_W = param1.field_W;
                    break L5;
                  }
                }
                L6: {
                  if (null != param1.field_x) {
                    ((ui) this).field_x = param1.field_x;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-2147483648 == param1.field_y) {
                    break L7;
                  } else {
                    ((ui) this).field_y = param1.field_y;
                    break L7;
                  }
                }
                L8: {
                  if (param1.field_q >= 0) {
                    ((ui) this).field_q = param1.field_q;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_X == 0) {
                    break L9;
                  } else {
                    ((ui) this).field_X = param1.field_X;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_r != null) {
                    ((ui) this).field_r = param1.field_r;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_bb == -2147483648) {
                    break L11;
                  } else {
                    ((ui) this).field_bb = param1.field_bb;
                    break L11;
                  }
                }
                L12: {
                  if (-2147483648 == param1.field_J) {
                    break L12;
                  } else {
                    ((ui) this).field_J = param1.field_J;
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_u != -2147483648) {
                    ((ui) this).field_u = param1.field_u;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (null == param1.field_E) {
                    break L14;
                  } else {
                    ((ui) this).field_E = param1.field_E;
                    break L14;
                  }
                }
                L15: {
                  if (null == param1.field_N) {
                    break L15;
                  } else {
                    ((ui) this).field_N = param1.field_N;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_v != 0) {
                    ((ui) this).field_v = param1.field_v;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_K == null) {
                    break L17;
                  } else {
                    ((ui) this).field_K = param1.field_K;
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_G == 0) {
                    break L18;
                  } else {
                    ((ui) this).field_G = param1.field_G;
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_F == null) {
                    break L19;
                  } else {
                    ((ui) this).field_F = param1.field_F;
                    break L19;
                  }
                }
                L20: {
                  if (0 != param1.field_Q) {
                    ((ui) this).field_Q = param1.field_Q;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null != param1.field_B) {
                    ((ui) this).field_B = param1.field_B;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_V != null) {
                    ((ui) this).field_V = param1.field_V;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_S != 0) {
                    ((ui) this).field_S = param1.field_S;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_Z) {
                    ((ui) this).field_Z = param1.field_Z;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_s) {
                    ((ui) this).field_s = param1.field_s;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_A) {
                    ((ui) this).field_A = param1.field_A;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null == param1.field_O) {
                    break L27;
                  } else {
                    ((ui) this).field_O = param1.field_O;
                    break L27;
                  }
                }
                L28: {
                  if (-2147483648 == param1.field_H) {
                    break L28;
                  } else {
                    ((ui) this).field_H = param1.field_H;
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_cb == -2147483648) {
                    break L29;
                  } else {
                    ((ui) this).field_cb = param1.field_cb;
                    break L29;
                  }
                }
                L30: {
                  if (0 <= param1.field_C) {
                    ((ui) this).field_C = param1.field_C;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (0 <= param1.field_I) {
                    ((ui) this).field_I = param1.field_I;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (!param1.field_P) {
                    break L32;
                  } else {
                    ((ui) this).field_P = param1.field_P;
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_L != 0) {
                    ((ui) this).field_L = param1.field_L;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (param1.field_p < 0) {
                    break L34;
                  } else {
                    ((ui) this).field_p = param1.field_p;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_Y == null) {
                    break L35;
                  } else {
                    ((ui) this).field_Y = param1.field_Y;
                    break L35;
                  }
                }
                L36: {
                  if (!param1.field_M) {
                    ((ui) this).field_M = param1.field_M;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_t == null) {
                    break L37;
                  } else {
                    ((ui) this).field_t = param1.field_t;
                    break L37;
                  }
                }
                if (null != param1.field_T) {
                  ((ui) this).field_T = param1.field_T;
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
                wf discarded$1 = ui.a(-111, (byte[]) null, 17);
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_137_0 = (RuntimeException) var3;
            stackOut_137_1 = new StringBuilder().append("ui.T(").append(param0).append(',');
            stackIn_140_0 = stackOut_137_0;
            stackIn_140_1 = stackOut_137_1;
            stackIn_138_0 = stackOut_137_0;
            stackIn_138_1 = stackOut_137_1;
            if (param1 == null) {
              stackOut_140_0 = (RuntimeException) (Object) stackIn_140_0;
              stackOut_140_1 = (StringBuilder) (Object) stackIn_140_1;
              stackOut_140_2 = "null";
              stackIn_141_0 = stackOut_140_0;
              stackIn_141_1 = stackOut_140_1;
              stackIn_141_2 = stackOut_140_2;
              break L39;
            } else {
              stackOut_138_0 = (RuntimeException) (Object) stackIn_138_0;
              stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
              stackOut_138_2 = "{...}";
              stackIn_141_0 = stackOut_138_0;
              stackIn_141_1 = stackOut_138_1;
              stackIn_141_2 = stackOut_138_2;
              break L39;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_141_0, stackIn_141_2 + ')');
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
        try {
            field_w = null;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ui.R(" + param0 + ')');
        }
    }

    private ui(long param0, ui param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((ui) this).field_p = -1;
        ((ui) this).field_J = -2147483648;
        ((ui) this).field_bb = -2147483648;
        ((ui) this).field_z = 256;
        ((ui) this).field_I = -1;
        ((ui) this).field_H = -2147483648;
        ((ui) this).field_C = -1;
        ((ui) this).field_y = -2147483648;
        ((ui) this).field_cb = -2147483648;
        ((ui) this).field_M = true;
        ((ui) this).field_q = -1;
        ((ui) this).field_u = -2147483648;
        ((ui) this).field_s = false;
        try {
          L0: {
            L1: {
              ((ui) this).field_d = param0;
              this.a((byte) -74, param1);
              if (null == param6) {
                break L1;
              } else {
                ((ui) this).field_O = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ui.<init>(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    static {
    }
}
