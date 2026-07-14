/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ol extends cd {
    private int field_eb;
    static bf field_E;
    private ed field_Z;
    private int field_H;
    private int field_gb;
    private ed[] field_w;
    static String field_K;
    private int field_C;
    private ed[] field_A;
    private int field_R;
    static ij[] field_N;
    private ed field_x;
    private int field_bb;
    private boolean field_ib;
    private int field_G;
    private int field_T;
    private int field_F;
    private int field_D;
    private ed[] field_jb;
    private ed[] field_V;
    private String field_cb;
    private int field_M;
    private boolean field_B;
    private String field_S;
    private int field_P;
    private boolean field_y;
    private ed field_O;
    private ed field_z;
    private ed[] field_fb;
    private int field_U;
    private int field_Y;
    private boolean field_W;
    private wl field_Q;
    private int field_X;
    private int field_kb;
    static int[] field_ab;
    private int field_L;
    private ed field_db;
    private boolean field_I;
    private boolean field_J;
    private int field_hb;

    final static byte[][] a(int param0, mf param1, int[] param2, int param3, mf param4) {
        int var5 = 0;
        byte[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        var10 = EscapeVector.field_A;
        var5 = je.a(false, param3);
        if (0 >= var5) {
          return null;
        } else {
          var6 = new byte[var5][];
          var7 = 0;
          var8 = 103 / ((75 - param0) / 49);
          L0: while (true) {
            if (var5 <= var7) {
              return var6;
            } else {
              var9 = hf.a(param1, param2, var7, param3, param4, (byte) 97);
              var6[var7] = var9;
              var7++;
              continue L0;
            }
          }
        }
    }

    ol(long param0, ol param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void g(int param0) {
        field_E = null;
        field_ab = null;
        if (param0 != 4095) {
            return;
        }
        field_N = null;
        field_K = null;
    }

    final static boolean a(byte param0, String param1) {
        L0: {
          if (param0 == -7) {
            break L0;
          } else {
            field_N = null;
            break L0;
          }
        }
        if (param1 != null) {
          if (param1.length() >= oa.field_v) {
            if (param1.length() > p.field_a) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    private final void a(int param0, ol param1) {
        L0: {
          if (param0 == -1680) {
            break L0;
          } else {
            ol.g(-110);
            break L0;
          }
        }
        L1: {
          if (param1 == null) {
            break L1;
          } else {
            L2: {
              if (param1.field_W) {
                break L2;
              } else {
                ((ol) this).field_W = param1.field_W;
                break L2;
              }
            }
            L3: {
              if (null == param1.field_V) {
                break L3;
              } else {
                ((ol) this).field_V = param1.field_V;
                break L3;
              }
            }
            L4: {
              if (-2147483648 == param1.field_C) {
                break L4;
              } else {
                ((ol) this).field_C = param1.field_C;
                break L4;
              }
            }
            L5: {
              if (param1.field_gb == 256) {
                break L5;
              } else {
                ((ol) this).field_gb = param1.field_gb;
                break L5;
              }
            }
            L6: {
              if (param1.field_J) {
                ((ol) this).field_J = param1.field_J;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (null == param1.field_A) {
                break L7;
              } else {
                ((ol) this).field_A = param1.field_A;
                break L7;
              }
            }
            L8: {
              if (null == param1.field_x) {
                break L8;
              } else {
                ((ol) this).field_x = param1.field_x;
                break L8;
              }
            }
            L9: {
              if (param1.field_X != 0) {
                ((ol) this).field_X = param1.field_X;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param1.field_R == 0) {
                break L10;
              } else {
                ((ol) this).field_R = param1.field_R;
                break L10;
              }
            }
            L11: {
              if (-2147483648 != param1.field_U) {
                ((ol) this).field_U = param1.field_U;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param1.field_O != null) {
                ((ol) this).field_O = param1.field_O;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (param1.field_G != 0) {
                ((ol) this).field_G = param1.field_G;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (-1 != (param1.field_D ^ -1)) {
                ((ol) this).field_D = param1.field_D;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (null != param1.field_Q) {
                ((ol) this).field_Q = param1.field_Q;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-1 >= (param1.field_kb ^ -1)) {
                ((ol) this).field_kb = param1.field_kb;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (param1.field_S != null) {
                ((ol) this).field_S = param1.field_S;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (-2147483648 != param1.field_H) {
                ((ol) this).field_H = param1.field_H;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (0 != param1.field_L) {
                ((ol) this).field_L = param1.field_L;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (2147483647 != (param1.field_P ^ -1)) {
                ((ol) this).field_P = param1.field_P;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (null == param1.field_w) {
                break L21;
              } else {
                ((ol) this).field_w = param1.field_w;
                break L21;
              }
            }
            L22: {
              if (!param1.field_B) {
                break L22;
              } else {
                ((ol) this).field_B = param1.field_B;
                break L22;
              }
            }
            L23: {
              if (param1.field_eb >= 0) {
                ((ol) this).field_eb = param1.field_eb;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (!param1.field_ib) {
                break L24;
              } else {
                ((ol) this).field_ib = param1.field_ib;
                break L24;
              }
            }
            L25: {
              if (-1 >= (param1.field_Y ^ -1)) {
                ((ol) this).field_Y = param1.field_Y;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (param1.field_y) {
                ((ol) this).field_y = param1.field_y;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (null == param1.field_db) {
                break L27;
              } else {
                ((ol) this).field_db = param1.field_db;
                break L27;
              }
            }
            L28: {
              if (!param1.field_I) {
                break L28;
              } else {
                ((ol) this).field_I = param1.field_I;
                break L28;
              }
            }
            L29: {
              if (2147483647 == (param1.field_T ^ -1)) {
                break L29;
              } else {
                ((ol) this).field_T = param1.field_T;
                break L29;
              }
            }
            L30: {
              if (param1.field_Z != null) {
                ((ol) this).field_Z = param1.field_Z;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (-1 == (param1.field_F ^ -1)) {
                break L31;
              } else {
                ((ol) this).field_F = param1.field_F;
                break L31;
              }
            }
            L32: {
              if (null != param1.field_fb) {
                ((ol) this).field_fb = param1.field_fb;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (param1.field_jb == null) {
                break L33;
              } else {
                ((ol) this).field_jb = param1.field_jb;
                break L33;
              }
            }
            L34: {
              if (0 == param1.field_bb) {
                break L34;
              } else {
                ((ol) this).field_bb = param1.field_bb;
                break L34;
              }
            }
            L35: {
              if (null != param1.field_z) {
                ((ol) this).field_z = param1.field_z;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (0 <= param1.field_hb) {
                ((ol) this).field_hb = param1.field_hb;
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              if (null == param1.field_cb) {
                break L37;
              } else {
                ((ol) this).field_cb = param1.field_cb;
                break L37;
              }
            }
            if (2147483647 != (param1.field_M ^ -1)) {
              ((ol) this).field_M = param1.field_M;
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    private ol(long param0, ol param1, int param2, int param3, int param4, int param5, String param6) {
        ((ol) this).field_H = -2147483648;
        ((ol) this).field_eb = -1;
        ((ol) this).field_gb = 256;
        ((ol) this).field_T = -2147483648;
        ((ol) this).field_P = -2147483648;
        ((ol) this).field_M = -2147483648;
        ((ol) this).field_Y = -1;
        ((ol) this).field_C = -2147483648;
        ((ol) this).field_kb = -1;
        ((ol) this).field_W = true;
        ((ol) this).field_I = false;
        ((ol) this).field_U = -2147483648;
        ((ol) this).field_hb = -1;
        ((ol) this).field_e = param0;
        this.a(-1680, param1);
        if (param6 != null) {
            ((ol) this).field_S = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_ab = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
