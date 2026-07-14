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
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 >= -86) {
          return true;
        } else {
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
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        }
    }

    private final void a(byte param0, kg param1) {
        int var3 = 0;
        L0: {
          if (param1 != null) {
            L1: {
              if (-1 == param1.field_I) {
                break L1;
              } else {
                ((kg) this).field_I = param1.field_I;
                break L1;
              }
            }
            L2: {
              if (2147483647 == param1.field_B) {
                break L2;
              } else {
                ((kg) this).field_B = param1.field_B;
                break L2;
              }
            }
            L3: {
              if (0 <= param1.field_Z) {
                ((kg) this).field_Z = param1.field_Z;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1.field_M == 0) {
                break L4;
              } else {
                ((kg) this).field_M = param1.field_M;
                break L4;
              }
            }
            L5: {
              if (null == param1.field_hb) {
                break L5;
              } else {
                ((kg) this).field_hb = param1.field_hb;
                break L5;
              }
            }
            L6: {
              if (param1.field_fb == null) {
                break L6;
              } else {
                ((kg) this).field_fb = param1.field_fb;
                break L6;
              }
            }
            L7: {
              if (!param1.field_K) {
                break L7;
              } else {
                ((kg) this).field_K = param1.field_K;
                break L7;
              }
            }
            L8: {
              if (null != param1.field_T) {
                ((kg) this).field_T = param1.field_T;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (-1 < (param1.field_bb ^ -1)) {
                break L9;
              } else {
                ((kg) this).field_bb = param1.field_bb;
                break L9;
              }
            }
            L10: {
              if (param1.field_gb == null) {
                break L10;
              } else {
                ((kg) this).field_gb = param1.field_gb;
                break L10;
              }
            }
            L11: {
              if (-1 == (param1.field_U ^ -1)) {
                break L11;
              } else {
                ((kg) this).field_U = param1.field_U;
                break L11;
              }
            }
            L12: {
              if (param1.field_G == null) {
                break L12;
              } else {
                ((kg) this).field_G = param1.field_G;
                break L12;
              }
            }
            L13: {
              if (param1.field_A == null) {
                break L13;
              } else {
                ((kg) this).field_A = param1.field_A;
                break L13;
              }
            }
            L14: {
              if (param1.field_S == null) {
                break L14;
              } else {
                ((kg) this).field_S = param1.field_S;
                break L14;
              }
            }
            L15: {
              if (2147483647 != param1.field_ib) {
                ((kg) this).field_ib = param1.field_ib;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-257 == param1.field_C) {
                break L16;
              } else {
                ((kg) this).field_C = param1.field_C;
                break L16;
              }
            }
            L17: {
              if (!param1.field_w) {
                break L17;
              } else {
                ((kg) this).field_w = param1.field_w;
                break L17;
              }
            }
            L18: {
              if (param1.field_x >= 0) {
                ((kg) this).field_x = param1.field_x;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (param1.field_E == -2147483648) {
                break L19;
              } else {
                ((kg) this).field_E = param1.field_E;
                break L19;
              }
            }
            L20: {
              if (-1 == (param1.field_D ^ -1)) {
                break L20;
              } else {
                ((kg) this).field_D = param1.field_D;
                break L20;
              }
            }
            L21: {
              if (param1.field_W) {
                break L21;
              } else {
                ((kg) this).field_W = param1.field_W;
                break L21;
              }
            }
            L22: {
              if (0 == param1.field_N) {
                break L22;
              } else {
                ((kg) this).field_N = param1.field_N;
                break L22;
              }
            }
            L23: {
              if (null == param1.field_v) {
                break L23;
              } else {
                ((kg) this).field_v = param1.field_v;
                break L23;
              }
            }
            L24: {
              if ((param1.field_Q ^ -1) > -1) {
                break L24;
              } else {
                ((kg) this).field_Q = param1.field_Q;
                break L24;
              }
            }
            L25: {
              if (param1.field_Y != null) {
                ((kg) this).field_Y = param1.field_Y;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (null != param1.field_R) {
                ((kg) this).field_R = param1.field_R;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (param1.field_H) {
                ((kg) this).field_H = param1.field_H;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (param1.field_J) {
                ((kg) this).field_J = param1.field_J;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if ((param1.field_V ^ -1) == 2147483647) {
                break L29;
              } else {
                ((kg) this).field_V = param1.field_V;
                break L29;
              }
            }
            L30: {
              if (param1.field_L != null) {
                ((kg) this).field_L = param1.field_L;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param1.field_O != null) {
                ((kg) this).field_O = param1.field_O;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if ((param1.field_ab ^ -1) == 2147483647) {
                break L32;
              } else {
                ((kg) this).field_ab = param1.field_ab;
                break L32;
              }
            }
            L33: {
              if (!param1.field_kb) {
                break L33;
              } else {
                ((kg) this).field_kb = param1.field_kb;
                break L33;
              }
            }
            L34: {
              if (param1.field_jb == 0) {
                break L34;
              } else {
                ((kg) this).field_jb = param1.field_jb;
                break L34;
              }
            }
            L35: {
              if (2147483647 != (param1.field_y ^ -1)) {
                ((kg) this).field_y = param1.field_y;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (0 != param1.field_z) {
                ((kg) this).field_z = param1.field_z;
                break L36;
              } else {
                break L36;
              }
            }
            if (param1.field_X == null) {
              break L0;
            } else {
              ((kg) this).field_X = param1.field_X;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = -119 % ((param0 - -75) / 42);
    }

    private kg(long param0, kg param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((kg) this).field_d = param0;
        this.a((byte) 122, param1);
        if (param6 != null) {
            ((kg) this).field_T = param6;
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
