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
        param1.setFocusTraversalKeysEnabled(false);
        int var2 = -53 / ((-10 - param0) / 37);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) cj.field_o);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) cj.field_o);
    }

    final static String a(String param0, kk param1, int param2, String param3) {
        if (param2 != 2147483647) {
            Object var5 = null;
            ug.a(26, (java.awt.Component) null);
        }
        if (!(param1.c(param2 ^ -2147483600))) {
            return param0;
        }
        return param3 + " - " + param1.a(true) + "%";
    }

    public static void g(int param0) {
        field_t = null;
        field_cb = null;
        if (param0 > -84) {
            Object var2 = null;
            String discarded$0 = ug.a((String) null, (kk) null, -13, (String) null);
        }
    }

    ug(long param0, ug param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(ug param0, int param1) {
        L0: {
          if (param0 != null) {
            L1: {
              if (-1 == (param0.field_fb ^ -1)) {
                break L1;
              } else {
                ((ug) this).field_fb = param0.field_fb;
                break L1;
              }
            }
            L2: {
              if (null == param0.field_C) {
                break L2;
              } else {
                ((ug) this).field_C = param0.field_C;
                break L2;
              }
            }
            L3: {
              if (2147483647 == (param0.field_T ^ -1)) {
                break L3;
              } else {
                ((ug) this).field_T = param0.field_T;
                break L3;
              }
            }
            L4: {
              if (param0.field_X >= 0) {
                ((ug) this).field_X = param0.field_X;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0.field_N == 0) {
                break L5;
              } else {
                ((ug) this).field_N = param0.field_N;
                break L5;
              }
            }
            L6: {
              if (param0.field_G) {
                ((ug) this).field_G = param0.field_G;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0.field_S == null) {
                break L7;
              } else {
                ((ug) this).field_S = param0.field_S;
                break L7;
              }
            }
            L8: {
              if (param0.field_P != 256) {
                ((ug) this).field_P = param0.field_P;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param0.field_O == null) {
                break L9;
              } else {
                ((ug) this).field_O = param0.field_O;
                break L9;
              }
            }
            L10: {
              if (null == param0.field_eb) {
                break L10;
              } else {
                ((ug) this).field_eb = param0.field_eb;
                break L10;
              }
            }
            L11: {
              if (null != param0.field_I) {
                ((ug) this).field_I = param0.field_I;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param0.field_Z == 2147483647) {
                break L12;
              } else {
                ((ug) this).field_Z = param0.field_Z;
                break L12;
              }
            }
            L13: {
              if (2147483647 == param0.field_db) {
                break L13;
              } else {
                ((ug) this).field_db = param0.field_db;
                break L13;
              }
            }
            L14: {
              if (param0.field_V < 0) {
                break L14;
              } else {
                ((ug) this).field_V = param0.field_V;
                break L14;
              }
            }
            L15: {
              if (-2147483648 == param0.field_w) {
                break L15;
              } else {
                ((ug) this).field_w = param0.field_w;
                break L15;
              }
            }
            L16: {
              if (!param0.field_E) {
                break L16;
              } else {
                ((ug) this).field_E = param0.field_E;
                break L16;
              }
            }
            L17: {
              if (0 != param0.field_B) {
                ((ug) this).field_B = param0.field_B;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (param0.field_Y == null) {
                break L18;
              } else {
                ((ug) this).field_Y = param0.field_Y;
                break L18;
              }
            }
            L19: {
              if (param0.field_M != null) {
                ((ug) this).field_M = param0.field_M;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (0 == param0.field_x) {
                break L20;
              } else {
                ((ug) this).field_x = param0.field_x;
                break L20;
              }
            }
            L21: {
              if (null == param0.field_L) {
                break L21;
              } else {
                ((ug) this).field_L = param0.field_L;
                break L21;
              }
            }
            L22: {
              if (!param0.field_H) {
                break L22;
              } else {
                ((ug) this).field_H = param0.field_H;
                break L22;
              }
            }
            L23: {
              if (param0.field_K != 0) {
                ((ug) this).field_K = param0.field_K;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (param0.field_U) {
                ((ug) this).field_U = param0.field_U;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (param0.field_hb) {
                break L25;
              } else {
                ((ug) this).field_hb = param0.field_hb;
                break L25;
              }
            }
            L26: {
              if (param0.field_D != null) {
                ((ug) this).field_D = param0.field_D;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if ((param0.field_F ^ -1) == 2147483647) {
                break L27;
              } else {
                ((ug) this).field_F = param0.field_F;
                break L27;
              }
            }
            L28: {
              if (0 <= param0.field_u) {
                ((ug) this).field_u = param0.field_u;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (0 != param0.field_y) {
                ((ug) this).field_y = param0.field_y;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (!param0.field_v) {
                break L30;
              } else {
                ((ug) this).field_v = param0.field_v;
                break L30;
              }
            }
            L31: {
              if (null == param0.field_A) {
                break L31;
              } else {
                ((ug) this).field_A = param0.field_A;
                break L31;
              }
            }
            L32: {
              if (param0.field_gb >= 0) {
                ((ug) this).field_gb = param0.field_gb;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (param0.field_W != null) {
                ((ug) this).field_W = param0.field_W;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (param0.field_ab == null) {
                break L34;
              } else {
                ((ug) this).field_ab = param0.field_ab;
                break L34;
              }
            }
            L35: {
              if (param0.field_bb != 0) {
                ((ug) this).field_bb = param0.field_bb;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (null == param0.field_J) {
                break L36;
              } else {
                ((ug) this).field_J = param0.field_J;
                break L36;
              }
            }
            if ((param0.field_z ^ -1) == 2147483647) {
              break L0;
            } else {
              ((ug) this).field_z = param0.field_z;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L37: {
          if (param1 == 256) {
            break L37;
          } else {
            ug.g(103);
            break L37;
          }
        }
    }

    private ug(long param0, ug param1, int param2, int param3, int param4, int param5, String param6) {
        ((ug) this).field_w = -2147483648;
        ((ug) this).field_P = 256;
        ((ug) this).field_Z = -2147483648;
        ((ug) this).field_V = -1;
        ((ug) this).field_db = -2147483648;
        ((ug) this).field_X = -1;
        ((ug) this).field_v = false;
        ((ug) this).field_F = -2147483648;
        ((ug) this).field_u = -1;
        ((ug) this).field_z = -2147483648;
        ((ug) this).field_hb = true;
        ((ug) this).field_T = -2147483648;
        ((ug) this).field_gb = -1;
        ((ug) this).field_b = param0;
        this.a(param1, 256);
        if (param6 != null) {
            ((ug) this).field_L = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Loading extra data";
        field_Q = 0;
    }
}
