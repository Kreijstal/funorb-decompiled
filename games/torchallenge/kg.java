/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kg extends rc {
    static String field_P;
    private int field_C;
    private int field_y;
    private boolean field_J;
    private ka field_Y;
    private boolean field_kb;
    private int field_Z;
    private int field_jb;
    private eg field_S;
    private ka[] field_A;
    private int field_z;
    private ka field_X;
    private int field_bb;
    static String field_db;
    private int field_I;
    private int field_D;
    private int field_N;
    private int field_ab;
    private int field_V;
    private int field_M;
    private int field_B;
    private ka[] field_gb;
    private int field_x;
    private ka[] field_G;
    private ka[] field_O;
    private boolean field_K;
    private ka field_fb;
    private boolean field_w;
    private int field_Q;
    private String field_v;
    private String field_T;
    private int field_U;
    private ka field_hb;
    private boolean field_H;
    private int field_ib;
    private int field_E;
    private ka field_L;
    static String field_eb;
    private ka[] field_R;
    private boolean field_W;
    static String field_cb;

    kg(long param0, kg param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void e(int param0) {
        field_db = null;
        field_P = null;
        field_cb = null;
        field_eb = null;
        if (param0 != -8796) {
            kg.e(53);
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (param3 > param4) {
              break L1;
            } else {
              if (param4 >= param3 + param2) {
                break L1;
              } else {
                if (param5 < param1) {
                  break L1;
                } else {
                  if (param6 + param1 <= param5) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final void a(byte param0, kg param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                L2: {
                  if (-1 == param1.field_I) {
                    break L2;
                  } else {
                    ((kg) this).field_I = param1.field_I;
                    break L2;
                  }
                }
                L3: {
                  if (2147483647 == param1.field_B) {
                    break L3;
                  } else {
                    ((kg) this).field_B = param1.field_B;
                    break L3;
                  }
                }
                L4: {
                  if (0 <= param1.field_Z) {
                    ((kg) this).field_Z = param1.field_Z;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_M == 0) {
                    break L5;
                  } else {
                    ((kg) this).field_M = param1.field_M;
                    break L5;
                  }
                }
                L6: {
                  if (null == param1.field_hb) {
                    break L6;
                  } else {
                    ((kg) this).field_hb = param1.field_hb;
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_fb == null) {
                    break L7;
                  } else {
                    ((kg) this).field_fb = param1.field_fb;
                    break L7;
                  }
                }
                L8: {
                  if (!param1.field_K) {
                    break L8;
                  } else {
                    ((kg) this).field_K = param1.field_K;
                    break L8;
                  }
                }
                L9: {
                  if (null != param1.field_T) {
                    ((kg) this).field_T = param1.field_T;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_bb < 0) {
                    break L10;
                  } else {
                    ((kg) this).field_bb = param1.field_bb;
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_gb == null) {
                    break L11;
                  } else {
                    ((kg) this).field_gb = param1.field_gb;
                    break L11;
                  }
                }
                L12: {
                  if (param1.field_U == 0) {
                    break L12;
                  } else {
                    ((kg) this).field_U = param1.field_U;
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_G == null) {
                    break L13;
                  } else {
                    ((kg) this).field_G = param1.field_G;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_A == null) {
                    break L14;
                  } else {
                    ((kg) this).field_A = param1.field_A;
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_S == null) {
                    break L15;
                  } else {
                    ((kg) this).field_S = param1.field_S;
                    break L15;
                  }
                }
                L16: {
                  if (2147483647 != param1.field_ib) {
                    ((kg) this).field_ib = param1.field_ib;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (-257 == param1.field_C) {
                    break L17;
                  } else {
                    ((kg) this).field_C = param1.field_C;
                    break L17;
                  }
                }
                L18: {
                  if (!param1.field_w) {
                    break L18;
                  } else {
                    ((kg) this).field_w = param1.field_w;
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_x >= 0) {
                    ((kg) this).field_x = param1.field_x;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_E == -2147483648) {
                    break L20;
                  } else {
                    ((kg) this).field_E = param1.field_E;
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_D == 0) {
                    break L21;
                  } else {
                    ((kg) this).field_D = param1.field_D;
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_W) {
                    break L22;
                  } else {
                    ((kg) this).field_W = param1.field_W;
                    break L22;
                  }
                }
                L23: {
                  if (0 == param1.field_N) {
                    break L23;
                  } else {
                    ((kg) this).field_N = param1.field_N;
                    break L23;
                  }
                }
                L24: {
                  if (null == param1.field_v) {
                    break L24;
                  } else {
                    ((kg) this).field_v = param1.field_v;
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_Q < 0) {
                    break L25;
                  } else {
                    ((kg) this).field_Q = param1.field_Q;
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_Y != null) {
                    ((kg) this).field_Y = param1.field_Y;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != param1.field_R) {
                    ((kg) this).field_R = param1.field_R;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (param1.field_H) {
                    ((kg) this).field_H = param1.field_H;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_J) {
                    ((kg) this).field_J = param1.field_J;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param1.field_V == -2147483648) {
                    break L30;
                  } else {
                    ((kg) this).field_V = param1.field_V;
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_L != null) {
                    ((kg) this).field_L = param1.field_L;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_O != null) {
                    ((kg) this).field_O = param1.field_O;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_ab == -2147483648) {
                    break L33;
                  } else {
                    ((kg) this).field_ab = param1.field_ab;
                    break L33;
                  }
                }
                L34: {
                  if (!param1.field_kb) {
                    break L34;
                  } else {
                    ((kg) this).field_kb = param1.field_kb;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_jb == 0) {
                    break L35;
                  } else {
                    ((kg) this).field_jb = param1.field_jb;
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_y != -2147483648) {
                    ((kg) this).field_y = param1.field_y;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (0 != param1.field_z) {
                    ((kg) this).field_z = param1.field_z;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                if (param1.field_X == null) {
                  break L1;
                } else {
                  ((kg) this).field_X = param1.field_X;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3_int = -3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var3 = decompiledCaughtException;
            stackOut_90_0 = (RuntimeException) var3;
            stackOut_90_1 = new StringBuilder().append("kg.H(").append(122).append(44);
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param1 == null) {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L38;
            } else {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L38;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_93_0, stackIn_93_2 + 41);
        }
    }

    private kg(long param0, kg param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((kg) this).field_y = -2147483648;
        ((kg) this).field_x = -1;
        ((kg) this).field_Z = -1;
        ((kg) this).field_V = -2147483648;
        ((kg) this).field_Q = -1;
        ((kg) this).field_B = -2147483648;
        ((kg) this).field_bb = -1;
        ((kg) this).field_W = true;
        ((kg) this).field_ab = -2147483648;
        ((kg) this).field_w = false;
        ((kg) this).field_E = -2147483648;
        ((kg) this).field_C = 256;
        ((kg) this).field_ib = -2147483648;
        try {
          L0: {
            L1: {
              ((kg) this).field_d = param0;
              this.a((byte) 122, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((kg) this).field_T = param6;
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
            stackOut_4_1 = new StringBuilder().append("kg.<init>(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = null;
        field_eb = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_cb = "Email address is unavailable";
    }
}
