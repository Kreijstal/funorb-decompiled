/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ug extends ii {
    private boolean field_E;
    private int field_w;
    private boolean field_v;
    private qj[] field_S;
    private boolean field_U;
    private qj field_ab;
    private boolean field_H;
    private int field_z;
    private int field_F;
    private String field_L;
    private int field_bb;
    private int field_Z;
    static int field_Q;
    private int field_P;
    private int field_K;
    private int field_V;
    private qj[] field_Y;
    private boolean field_G;
    private int field_N;
    private int field_u;
    private int field_X;
    private qj[] field_C;
    private int field_x;
    private oh field_I;
    private qj[] field_eb;
    private qj field_M;
    private int field_db;
    private boolean field_hb;
    private qj[] field_D;
    static String field_t;
    private qj field_W;
    private int field_T;
    private String field_J;
    private int field_fb;
    private qj field_A;
    static bj field_cb;
    private int field_B;
    private qj field_O;
    private int field_gb;
    private int field_y;

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            int var2_int = -53 / ((-10 - param0) / 37);
            param1.addKeyListener(cj.field_o);
            param1.addFocusListener(cj.field_o);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ug.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(String param0, kk param1, int param2, String param3) {
        RuntimeException var4 = null;
        java.awt.Component var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 2147483647) {
                break L1;
              } else {
                var5 = (java.awt.Component) null;
                ug.a(26, (java.awt.Component) null);
                break L1;
              }
            }
            if (!param1.c(param2 ^ -2147483600)) {
              stackOut_4_0 = (String) (param0);
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_6_0 = param3 + " - " + param1.a(true) + "%";
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ug.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void g(int param0) {
        String discarded$0 = null;
        field_t = null;
        field_cb = null;
        if (param0 > -84) {
            String var2 = (String) null;
            discarded$0 = ug.a((String) null, (kk) null, -13, (String) null);
        }
    }

    ug(long param0, ug param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(ug param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                L2: {
                  if (-1 == (param0.field_fb ^ -1)) {
                    break L2;
                  } else {
                    this.field_fb = param0.field_fb;
                    break L2;
                  }
                }
                L3: {
                  if (null == param0.field_C) {
                    break L3;
                  } else {
                    this.field_C = param0.field_C;
                    break L3;
                  }
                }
                L4: {
                  if (2147483647 == (param0.field_T ^ -1)) {
                    break L4;
                  } else {
                    this.field_T = param0.field_T;
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_X >= 0) {
                    this.field_X = param0.field_X;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param0.field_N == 0) {
                    break L6;
                  } else {
                    this.field_N = param0.field_N;
                    break L6;
                  }
                }
                L7: {
                  if (param0.field_G) {
                    this.field_G = param0.field_G;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0.field_S == null) {
                    break L8;
                  } else {
                    this.field_S = param0.field_S;
                    break L8;
                  }
                }
                L9: {
                  if (param0.field_P != 256) {
                    this.field_P = param0.field_P;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0.field_O == null) {
                    break L10;
                  } else {
                    this.field_O = param0.field_O;
                    break L10;
                  }
                }
                L11: {
                  if (null == param0.field_eb) {
                    break L11;
                  } else {
                    this.field_eb = param0.field_eb;
                    break L11;
                  }
                }
                L12: {
                  if (null != param0.field_I) {
                    this.field_I = param0.field_I;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if ((param0.field_Z ^ -1) == 2147483647) {
                    break L13;
                  } else {
                    this.field_Z = param0.field_Z;
                    break L13;
                  }
                }
                L14: {
                  if (2147483647 == (param0.field_db ^ -1)) {
                    break L14;
                  } else {
                    this.field_db = param0.field_db;
                    break L14;
                  }
                }
                L15: {
                  if (param0.field_V < 0) {
                    break L15;
                  } else {
                    this.field_V = param0.field_V;
                    break L15;
                  }
                }
                L16: {
                  if (-2147483648 == param0.field_w) {
                    break L16;
                  } else {
                    this.field_w = param0.field_w;
                    break L16;
                  }
                }
                L17: {
                  if (!param0.field_E) {
                    break L17;
                  } else {
                    this.field_E = param0.field_E;
                    break L17;
                  }
                }
                L18: {
                  if (0 != param0.field_B) {
                    this.field_B = param0.field_B;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (param0.field_Y == null) {
                    break L19;
                  } else {
                    this.field_Y = param0.field_Y;
                    break L19;
                  }
                }
                L20: {
                  if (param0.field_M != null) {
                    this.field_M = param0.field_M;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (0 == param0.field_x) {
                    break L21;
                  } else {
                    this.field_x = param0.field_x;
                    break L21;
                  }
                }
                L22: {
                  if (null == param0.field_L) {
                    break L22;
                  } else {
                    this.field_L = param0.field_L;
                    break L22;
                  }
                }
                L23: {
                  if (!param0.field_H) {
                    break L23;
                  } else {
                    this.field_H = param0.field_H;
                    break L23;
                  }
                }
                L24: {
                  if (param0.field_K != 0) {
                    this.field_K = param0.field_K;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param0.field_U) {
                    this.field_U = param0.field_U;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param0.field_hb) {
                    break L26;
                  } else {
                    this.field_hb = param0.field_hb;
                    break L26;
                  }
                }
                L27: {
                  if (param0.field_D != null) {
                    this.field_D = param0.field_D;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if ((param0.field_F ^ -1) == 2147483647) {
                    break L28;
                  } else {
                    this.field_F = param0.field_F;
                    break L28;
                  }
                }
                L29: {
                  if (0 <= param0.field_u) {
                    this.field_u = param0.field_u;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (0 != param0.field_y) {
                    this.field_y = param0.field_y;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (!param0.field_v) {
                    break L31;
                  } else {
                    this.field_v = param0.field_v;
                    break L31;
                  }
                }
                L32: {
                  if (null == param0.field_A) {
                    break L32;
                  } else {
                    this.field_A = param0.field_A;
                    break L32;
                  }
                }
                L33: {
                  if (param0.field_gb >= 0) {
                    this.field_gb = param0.field_gb;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (param0.field_W != null) {
                    this.field_W = param0.field_W;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (param0.field_ab == null) {
                    break L35;
                  } else {
                    this.field_ab = param0.field_ab;
                    break L35;
                  }
                }
                L36: {
                  if (param0.field_bb != 0) {
                    this.field_bb = param0.field_bb;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (null == param0.field_J) {
                    break L37;
                  } else {
                    this.field_J = param0.field_J;
                    break L37;
                  }
                }
                if ((param0.field_z ^ -1) == 2147483647) {
                  break L1;
                } else {
                  this.field_z = param0.field_z;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L38: {
              if (param1 == 256) {
                break L38;
              } else {
                ug.g(103);
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) (var3);
            stackOut_93_1 = new StringBuilder().append("ug.G(");
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L39;
            } else {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L39;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_96_0), stackIn_96_2 + ',' + param1 + ')');
        }
    }

    private ug(long param0, ug param1, int param2, int param3, int param4, int param5, String param6) {
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
        this.field_w = -2147483648;
        this.field_P = 256;
        this.field_Z = -2147483648;
        this.field_V = -1;
        this.field_db = -2147483648;
        this.field_X = -1;
        this.field_v = false;
        this.field_F = -2147483648;
        this.field_u = -1;
        this.field_z = -2147483648;
        this.field_hb = true;
        this.field_T = -2147483648;
        this.field_gb = -1;
        try {
          L0: {
            L1: {
              this.field_b = param0;
              this.a(param1, 256);
              if (param6 == null) {
                break L1;
              } else {
                this.field_L = param6;
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
            stackOut_4_1 = new StringBuilder().append("ug.<init>(").append(param0).append(',');
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
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_t = "Loading extra data";
        field_Q = 0;
    }
}
