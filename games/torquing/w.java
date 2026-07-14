/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends to {
    private int field_u;
    private uc field_x;
    private boolean field_z;
    private boolean field_Q;
    private boolean field_U;
    private int field_ab;
    private int field_N;
    private int field_fb;
    private int field_E;
    private int field_Y;
    private int field_J;
    private int field_T;
    private t[] field_D;
    private t field_C;
    private t field_W;
    private int field_eb;
    private t field_R;
    private int field_M;
    private boolean field_S;
    private int field_bb;
    private t[] field_X;
    private t[] field_v;
    private t[] field_hb;
    private int field_I;
    private int field_P;
    static ln field_G;
    private String field_L;
    private int field_B;
    static ce field_cb;
    private int field_A;
    private t field_y;
    private int field_db;
    private boolean field_w;
    private t field_K;
    private String field_H;
    private int field_Z;
    private t[] field_t;
    private int field_O;
    private boolean field_V;
    static boolean field_F;
    static String field_gb;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int[] var15 = null;
        int var13 = Torquing.field_u;
        int var7 = param2 + param4;
        int var8 = -param2 + param5;
        for (var11 = param4; var11 < var7; var11++) {
            di.a(param1, (byte) 62, param6, qd.field_a[var11], param3);
        }
        int var9 = param2 + param1;
        int var10 = -param2 + param3;
        for (var11 = param5; var11 > var8; var11--) {
            di.a(param1, (byte) 6, param6, qd.field_a[var11], param3);
        }
        for (var11 = var7; var11 <= var8; var11++) {
            var15 = qd.field_a[var11];
            di.a(param1, (byte) -92, param6, var15, var9);
            di.a(var10, (byte) -96, param6, var15, param3);
        }
        int var12 = 36 / ((-33 - param0) / 63);
    }

    private final void a(int param0, w param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            L1: {
              if (!param1.field_S) {
                break L1;
              } else {
                ((w) this).field_S = param1.field_S;
                break L1;
              }
            }
            L2: {
              if ((param1.field_B ^ -1) != 2147483647) {
                ((w) this).field_B = param1.field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (0 == param1.field_db) {
                break L3;
              } else {
                ((w) this).field_db = param1.field_db;
                break L3;
              }
            }
            L4: {
              if (-1 < param1.field_J) {
                break L4;
              } else {
                ((w) this).field_J = param1.field_J;
                break L4;
              }
            }
            L5: {
              if (-1 <= param1.field_A) {
                ((w) this).field_A = param1.field_A;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1.field_t != null) {
                ((w) this).field_t = param1.field_t;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1.field_v == null) {
                break L7;
              } else {
                ((w) this).field_v = param1.field_v;
                break L7;
              }
            }
            L8: {
              if (-2147483648 != param1.field_Z) {
                ((w) this).field_Z = param1.field_Z;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1.field_W == null) {
                break L9;
              } else {
                ((w) this).field_W = param1.field_W;
                break L9;
              }
            }
            L10: {
              if ((param1.field_ab ^ -1) > -1) {
                break L10;
              } else {
                ((w) this).field_ab = param1.field_ab;
                break L10;
              }
            }
            L11: {
              if (null == param1.field_H) {
                break L11;
              } else {
                ((w) this).field_H = param1.field_H;
                break L11;
              }
            }
            L12: {
              if (param1.field_E != 0) {
                ((w) this).field_E = param1.field_E;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (param1.field_R == null) {
                break L13;
              } else {
                ((w) this).field_R = param1.field_R;
                break L13;
              }
            }
            L14: {
              if ((param1.field_I ^ -1) != 2147483647) {
                ((w) this).field_I = param1.field_I;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (param1.field_X != null) {
                ((w) this).field_X = param1.field_X;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1.field_bb != 0) {
                ((w) this).field_bb = param1.field_bb;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (param1.field_M == -2147483648) {
                break L17;
              } else {
                ((w) this).field_M = param1.field_M;
                break L17;
              }
            }
            L18: {
              if (null == param1.field_K) {
                break L18;
              } else {
                ((w) this).field_K = param1.field_K;
                break L18;
              }
            }
            L19: {
              if (param1.field_w) {
                ((w) this).field_w = param1.field_w;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (param1.field_Q) {
                break L20;
              } else {
                ((w) this).field_Q = param1.field_Q;
                break L20;
              }
            }
            L21: {
              if (-2147483648 != param1.field_P) {
                ((w) this).field_P = param1.field_P;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param1.field_V) {
                ((w) this).field_V = param1.field_V;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (0 <= param1.field_eb) {
                ((w) this).field_eb = param1.field_eb;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (!param1.field_z) {
                break L24;
              } else {
                ((w) this).field_z = param1.field_z;
                break L24;
              }
            }
            L25: {
              if (!param1.field_U) {
                break L25;
              } else {
                ((w) this).field_U = param1.field_U;
                break L25;
              }
            }
            L26: {
              if (null == param1.field_x) {
                break L26;
              } else {
                ((w) this).field_x = param1.field_x;
                break L26;
              }
            }
            L27: {
              if (param1.field_C != null) {
                ((w) this).field_C = param1.field_C;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (param1.field_y != null) {
                ((w) this).field_y = param1.field_y;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (param1.field_Y != 256) {
                ((w) this).field_Y = param1.field_Y;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (param1.field_u != 0) {
                ((w) this).field_u = param1.field_u;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param1.field_O == -2147483648) {
                break L31;
              } else {
                ((w) this).field_O = param1.field_O;
                break L31;
              }
            }
            L32: {
              if (null == param1.field_L) {
                break L32;
              } else {
                ((w) this).field_L = param1.field_L;
                break L32;
              }
            }
            L33: {
              if (-1 == param1.field_T) {
                break L33;
              } else {
                ((w) this).field_T = param1.field_T;
                break L33;
              }
            }
            L34: {
              if (-1 != param1.field_N) {
                ((w) this).field_N = param1.field_N;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (param1.field_D != null) {
                ((w) this).field_D = param1.field_D;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (param1.field_hb != null) {
                ((w) this).field_hb = param1.field_hb;
                break L36;
              } else {
                break L36;
              }
            }
            if (0 != param1.field_fb) {
              ((w) this).field_fb = param1.field_fb;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L37: {
          if (param0 == -1) {
            break L37;
          } else {
            w.a((byte) -63, 4, -50, -116, 122, 88, -38);
            break L37;
          }
        }
    }

    w(long param0, w param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void b(int param0) {
        field_G = null;
        if (param0 != -2147483648) {
            return;
        }
        field_cb = null;
        field_gb = null;
    }

    final static void c(byte param0) {
        int var1 = vo.a(-14225);
        int var2 = b.g((byte) 124);
        if (param0 < 14) {
            w.b(-77);
        }
        p.field_x.a(v.field_a + -dn.field_h, var2 + (wp.field_y << 1874487297), (dn.field_h << -625787199) + var1, (byte) 79, a.field_d - wp.field_y);
        jn.b((byte) 122);
    }

    private w(long param0, w param1, int param2, int param3, int param4, int param5, String param6) {
        ((w) this).field_Q = true;
        ((w) this).field_J = -1;
        ((w) this).field_ab = -1;
        ((w) this).field_B = -2147483648;
        ((w) this).field_A = -1;
        ((w) this).field_M = -2147483648;
        ((w) this).field_Y = 256;
        ((w) this).field_eb = -1;
        ((w) this).field_I = -2147483648;
        ((w) this).field_O = -2147483648;
        ((w) this).field_Z = -2147483648;
        ((w) this).field_P = -2147483648;
        ((w) this).field_w = false;
        ((w) this).field_f = param0;
        this.a(-1, param1);
        if (param6 != null) {
            ((w) this).field_L = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new ce();
        field_gb = "Amazing";
    }
}
