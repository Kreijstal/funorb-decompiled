/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sf extends ie {
    private int field_w;
    private hj field_D;
    private int field_R;
    private int field_x;
    private int field_n;
    static int[] field_K;
    private int field_E;
    private int field_X;
    private int field_y;
    private hj field_v;
    private String field_N;
    private boolean field_l;
    private hj[] field_B;
    static ki field_q;
    private hj field_S;
    static int field_O;
    private hj[] field_J;
    private int field_H;
    private int field_s;
    private boolean field_U;
    private int field_m;
    private hj[] field_V;
    private hj[] field_t;
    private int field_p;
    private hj field_C;
    private int field_z;
    private kc field_A;
    private int field_Q;
    private int field_I;
    private boolean field_o;
    static int field_T;
    private int field_L;
    private int field_G;
    private hj field_M;
    private int field_u;
    private String field_r;
    private boolean field_Y;
    private int field_W;
    private hj[] field_k;
    private boolean field_P;
    private boolean field_F;

    sf(long param0, sf param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static wa a(String param0, ki param1, int param2, String param3, ki param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param4.a(param0, 0);
        var6 = param4.a(param3, 5187, var5);
        if (param2 != -1) {
          return null;
        } else {
          return pf.a(var5, -6, param1, param4, var6);
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, char param2, byte param3) {
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        int var5 = -73 / ((param3 - -32) / 42);
        int var4 = param1.length();
        param1.setLength(param0);
        for (var6 = var4; param0 > var6; var6++) {
            param1.setCharAt(var6, param2);
        }
        return param1;
    }

    private final void a(sf param0, byte param1) {
        L0: {
          if (param1 <= -111) {
            break L0;
          } else {
            ((sf) this).field_l = true;
            break L0;
          }
        }
        L1: {
          if (param0 != null) {
            L2: {
              if (-1 == (param0.field_R ^ -1)) {
                break L2;
              } else {
                ((sf) this).field_R = param0.field_R;
                break L2;
              }
            }
            L3: {
              if (param0.field_D == null) {
                break L3;
              } else {
                ((sf) this).field_D = param0.field_D;
                break L3;
              }
            }
            L4: {
              if (!param0.field_o) {
                break L4;
              } else {
                ((sf) this).field_o = param0.field_o;
                break L4;
              }
            }
            L5: {
              if (param0.field_L != 0) {
                ((sf) this).field_L = param0.field_L;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!param0.field_P) {
                ((sf) this).field_P = param0.field_P;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!param0.field_U) {
                break L7;
              } else {
                ((sf) this).field_U = param0.field_U;
                break L7;
              }
            }
            L8: {
              if (param0.field_v == null) {
                break L8;
              } else {
                ((sf) this).field_v = param0.field_v;
                break L8;
              }
            }
            L9: {
              if (0 == param0.field_p) {
                break L9;
              } else {
                ((sf) this).field_p = param0.field_p;
                break L9;
              }
            }
            L10: {
              if (null == param0.field_N) {
                break L10;
              } else {
                ((sf) this).field_N = param0.field_N;
                break L10;
              }
            }
            L11: {
              if ((param0.field_H ^ -1) == 2147483647) {
                break L11;
              } else {
                ((sf) this).field_H = param0.field_H;
                break L11;
              }
            }
            L12: {
              if ((param0.field_G ^ -1) <= -1) {
                ((sf) this).field_G = param0.field_G;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (param0.field_X == -1) {
                break L13;
              } else {
                ((sf) this).field_X = param0.field_X;
                break L13;
              }
            }
            L14: {
              if (-1 <= param0.field_z) {
                ((sf) this).field_z = param0.field_z;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (param0.field_k == null) {
                break L15;
              } else {
                ((sf) this).field_k = param0.field_k;
                break L15;
              }
            }
            L16: {
              if (null == param0.field_V) {
                break L16;
              } else {
                ((sf) this).field_V = param0.field_V;
                break L16;
              }
            }
            L17: {
              if (null == param0.field_B) {
                break L17;
              } else {
                ((sf) this).field_B = param0.field_B;
                break L17;
              }
            }
            L18: {
              if (param0.field_y != 0) {
                ((sf) this).field_y = param0.field_y;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (!param0.field_l) {
                break L19;
              } else {
                ((sf) this).field_l = param0.field_l;
                break L19;
              }
            }
            L20: {
              if (param0.field_m < 0) {
                break L20;
              } else {
                ((sf) this).field_m = param0.field_m;
                break L20;
              }
            }
            L21: {
              if (null != param0.field_t) {
                ((sf) this).field_t = param0.field_t;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param0.field_I != 0) {
                ((sf) this).field_I = param0.field_I;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (!param0.field_F) {
                break L23;
              } else {
                ((sf) this).field_F = param0.field_F;
                break L23;
              }
            }
            L24: {
              if (null != param0.field_M) {
                ((sf) this).field_M = param0.field_M;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (param0.field_J != null) {
                ((sf) this).field_J = param0.field_J;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if ((param0.field_Q ^ -1) != 2147483647) {
                ((sf) this).field_Q = param0.field_Q;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if ((param0.field_E ^ -1) != -257) {
                ((sf) this).field_E = param0.field_E;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (param0.field_W != -2147483648) {
                ((sf) this).field_W = param0.field_W;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (param0.field_n < 0) {
                break L29;
              } else {
                ((sf) this).field_n = param0.field_n;
                break L29;
              }
            }
            L30: {
              if (param0.field_C != null) {
                ((sf) this).field_C = param0.field_C;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param0.field_w == -2147483648) {
                break L31;
              } else {
                ((sf) this).field_w = param0.field_w;
                break L31;
              }
            }
            L32: {
              if (-2147483648 == param0.field_s) {
                break L32;
              } else {
                ((sf) this).field_s = param0.field_s;
                break L32;
              }
            }
            L33: {
              if (param0.field_u != 0) {
                ((sf) this).field_u = param0.field_u;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (null != param0.field_S) {
                ((sf) this).field_S = param0.field_S;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (null != param0.field_r) {
                ((sf) this).field_r = param0.field_r;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (param0.field_A != null) {
                ((sf) this).field_A = param0.field_A;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if ((param0.field_x ^ -1) != 2147483647) {
                ((sf) this).field_x = param0.field_x;
                break L37;
              } else {
                break L37;
              }
            }
            if (!param0.field_Y) {
              break L1;
            } else {
              ((sf) this).field_Y = param0.field_Y;
              break L1;
            }
          } else {
            break L1;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != 7) {
            Object var2 = null;
            StringBuilder discarded$0 = sf.a(-50, (StringBuilder) null, '}', (byte) -73);
        }
        field_q = null;
        field_K = null;
    }

    private sf(long param0, sf param1, int param2, int param3, int param4, int param5, String param6) {
        ((sf) this).field_x = -2147483648;
        ((sf) this).field_H = -2147483648;
        ((sf) this).field_m = -1;
        ((sf) this).field_w = -2147483648;
        ((sf) this).field_n = -1;
        ((sf) this).field_Q = -2147483648;
        ((sf) this).field_E = 256;
        ((sf) this).field_z = -1;
        ((sf) this).field_U = false;
        ((sf) this).field_G = -1;
        ((sf) this).field_s = -2147483648;
        ((sf) this).field_W = -2147483648;
        ((sf) this).field_P = true;
        ((sf) this).field_d = param0;
        this.a(param1, (byte) -117);
        if (param6 != null) {
            ((sf) this).field_r = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new int[4];
        field_O = 9;
    }
}
