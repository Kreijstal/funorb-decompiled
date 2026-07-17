/*
 * Decompiled by CFR-JS 0.4.0.
 */
class si extends bi {
    private int field_bb;
    private int field_W;
    static String field_I;
    static bd field_V;
    private boolean field_x;
    private int field_fb;
    private boolean field_A;
    private pb[] field_Q;
    private int field_J;
    private pb[] field_R;
    private boolean field_Y;
    private int field_E;
    private int field_lb;
    private pb[] field_ib;
    private int field_eb;
    private pb[] field_hb;
    private pb field_O;
    static int field_gb;
    static boolean[] field_jb;
    private boolean field_z;
    private pb field_U;
    private int field_L;
    private int field_H;
    private int field_N;
    private int field_ab;
    private int field_K;
    private int field_db;
    static String field_B;
    private String field_G;
    private pb field_w;
    private boolean field_kb;
    private int field_F;
    private boolean field_P;
    private int field_Z;
    private pb field_cb;
    private int field_T;
    private pb field_y;
    private pb[] field_S;
    private int field_C;
    private String field_D;
    private int field_M;
    private bd field_v;
    static int field_X;

    public static void f(int param0) {
        field_I = null;
        if (param0 != -16412) {
            si.f(-65);
        }
        field_B = null;
        field_jb = null;
        field_V = null;
    }

    si(long param0, si param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(byte param0, si param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                L2: {
                  if (param1.field_W != 0) {
                    ((si) this).field_W = param1.field_W;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_lb < 0) {
                    break L3;
                  } else {
                    ((si) this).field_lb = param1.field_lb;
                    break L3;
                  }
                }
                L4: {
                  if (!param1.field_z) {
                    break L4;
                  } else {
                    ((si) this).field_z = param1.field_z;
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_C < 0) {
                    break L5;
                  } else {
                    ((si) this).field_C = param1.field_C;
                    break L5;
                  }
                }
                L6: {
                  if (null != param1.field_ib) {
                    ((si) this).field_ib = param1.field_ib;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_db != -2147483648) {
                    ((si) this).field_db = param1.field_db;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param1.field_x) {
                    ((si) this).field_x = param1.field_x;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (-1 == param1.field_eb) {
                    break L9;
                  } else {
                    ((si) this).field_eb = param1.field_eb;
                    break L9;
                  }
                }
                L10: {
                  if (-257 != param1.field_ab) {
                    ((si) this).field_ab = param1.field_ab;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_T == 0) {
                    break L11;
                  } else {
                    ((si) this).field_T = param1.field_T;
                    break L11;
                  }
                }
                L12: {
                  if (param1.field_w != null) {
                    ((si) this).field_w = param1.field_w;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_D != null) {
                    ((si) this).field_D = param1.field_D;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_L != -2147483648) {
                    ((si) this).field_L = param1.field_L;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_J >= 0) {
                    ((si) this).field_J = param1.field_J;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_M != 0) {
                    ((si) this).field_M = param1.field_M;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_O != null) {
                    ((si) this).field_O = param1.field_O;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_F != -2147483648) {
                    ((si) this).field_F = param1.field_F;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (null == param1.field_hb) {
                    break L19;
                  } else {
                    ((si) this).field_hb = param1.field_hb;
                    break L19;
                  }
                }
                L20: {
                  if (null != param1.field_U) {
                    ((si) this).field_U = param1.field_U;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null == param1.field_v) {
                    break L21;
                  } else {
                    ((si) this).field_v = param1.field_v;
                    break L21;
                  }
                }
                L22: {
                  if (null != param1.field_S) {
                    ((si) this).field_S = param1.field_S;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_Y) {
                    ((si) this).field_Y = param1.field_Y;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (!param1.field_P) {
                    break L24;
                  } else {
                    ((si) this).field_P = param1.field_P;
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_cb == null) {
                    break L25;
                  } else {
                    ((si) this).field_cb = param1.field_cb;
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_bb == 0) {
                    break L26;
                  } else {
                    ((si) this).field_bb = param1.field_bb;
                    break L26;
                  }
                }
                L27: {
                  if (param1.field_R == null) {
                    break L27;
                  } else {
                    ((si) this).field_R = param1.field_R;
                    break L27;
                  }
                }
                L28: {
                  if (param1.field_A) {
                    break L28;
                  } else {
                    ((si) this).field_A = param1.field_A;
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_Z != 0) {
                    ((si) this).field_Z = param1.field_Z;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (null == param1.field_Q) {
                    break L30;
                  } else {
                    ((si) this).field_Q = param1.field_Q;
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_y != null) {
                    ((si) this).field_y = param1.field_y;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_N == 0) {
                    break L32;
                  } else {
                    ((si) this).field_N = param1.field_N;
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_K == -2147483648) {
                    break L33;
                  } else {
                    ((si) this).field_K = param1.field_K;
                    break L33;
                  }
                }
                L34: {
                  if (param1.field_fb != -2147483648) {
                    ((si) this).field_fb = param1.field_fb;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (!param1.field_kb) {
                    break L35;
                  } else {
                    ((si) this).field_kb = param1.field_kb;
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_H != -2147483648) {
                    ((si) this).field_H = param1.field_H;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_E >= 0) {
                    ((si) this).field_E = param1.field_E;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                if (param1.field_G != null) {
                  ((si) this).field_G = param1.field_G;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L38: {
              if (param0 == -62) {
                break L38;
              } else {
                si.f(75);
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var3;
            stackOut_99_1 = new StringBuilder().append("si.A(").append(param0).append(44);
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param1 == null) {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L39;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L39;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + 41);
        }
    }

    private si(long param0, si param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((si) this).field_J = -1;
        ((si) this).field_L = -2147483648;
        ((si) this).field_K = -2147483648;
        ((si) this).field_E = -1;
        ((si) this).field_A = true;
        ((si) this).field_F = -2147483648;
        ((si) this).field_fb = -2147483648;
        ((si) this).field_ab = 256;
        ((si) this).field_lb = -1;
        ((si) this).field_H = -2147483648;
        ((si) this).field_P = false;
        ((si) this).field_db = -2147483648;
        ((si) this).field_C = -1;
        try {
          L0: {
            L1: {
              ((si) this).field_j = param0;
              this.a((byte) -62, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((si) this).field_G = param6;
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
            stackOut_4_1 = new StringBuilder().append("si.<init>(").append(param0).append(44);
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Player Name: ";
        field_jb = new boolean[112];
        field_gb = 0;
        field_B = "Type your age in years";
    }
}
