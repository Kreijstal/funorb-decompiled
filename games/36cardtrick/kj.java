/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kj extends cj {
    private boolean field_p;
    private kc field_V;
    private kc[] field_Q;
    private int field_K;
    private kc field_A;
    private int field_I;
    private int field_u;
    private int field_E;
    private int field_H;
    private boolean field_o;
    private static long[] field_z;
    private kc field_x;
    private int field_U;
    private int field_D;
    private int field_S;
    private kc[] field_w;
    static String field_q;
    private kc field_N;
    private boolean field_C;
    private int field_J;
    private int field_bb;
    private String field_Z;
    private boolean field_s;
    private boolean field_v;
    static int field_t;
    private kc field_B;
    private boolean field_F;
    private int field_r;
    private ee field_Y;
    private int field_ab;
    private kc[] field_T;
    private int field_R;
    private int field_G;
    private int field_n;
    private kc[] field_L;
    private String field_O;
    private kc[] field_X;
    static boolean field_P;
    private int field_M;
    private int field_W;
    private int field_y;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        sa.field_d = param1;
        mg.field_q = param4;
        if (param3 > -79) {
            return;
        }
        tl.field_b = param2;
        sj.field_c = param0;
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Main.field_T;
          var2 = 0;
          var3 = h.field_F;
          if ((var3 ^ -1) <= -6) {
            if (105 <= var3) {
              if (120 > var3) {
                var3 = -var3 + 120;
                var2 = 8192 - 8192 * var3 * var3 / 3300;
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = (var3 * 16384 + -40960) / 220;
              break L0;
            }
          } else {
            var2 = var3 * (var3 * 8192) / 1100;
            break L0;
          }
        }
        L1: {
          if (param0 == 104) {
            break L1;
          } else {
            field_q = (String) null;
            break L1;
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if (param1 != -4) {
            break L2;
          } else {
            var4 = -1;
            break L2;
          }
        }
        L3: {
          if (-2 != param1) {
            break L3;
          } else {
            var5 = 1;
            break L3;
          }
        }
        L4: {
          if (4 != param1) {
            break L4;
          } else {
            var4 = 1;
            var5 = 1;
            break L4;
          }
        }
        L5: {
          if (-6 == param1) {
            var4 = -1;
            var5 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param1 == 6) {
            var5 = -1;
            var4 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (-8 == param1) {
              break L8;
            } else {
              if (param1 == 8) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (11 == param1) {
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if ((param1 ^ -1) != -13) {
            break L10;
          } else {
            var4 = -1;
            var5 = -1;
            break L10;
          }
        }
        L11: {
          if (param1 == 13) {
            var5 = -1;
            var4 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (param1 == -15) {
            var4 = -1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (-16 == param1) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        nl.field_c = lf.a(var2 * var4, var5 * var2, true);
    }

    private final void a(kj param0, int param1) {
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            L1: {
              if (((kj) param0).field_H < 0) {
                break L1;
              } else {
                ((kj) this).field_H = ((kj) param0).field_H;
                break L1;
              }
            }
            L2: {
              if (0 == ((kj) param0).field_J) {
                break L2;
              } else {
                ((kj) this).field_J = ((kj) param0).field_J;
                break L2;
              }
            }
            L3: {
              if (((kj) param0).field_w != null) {
                ((kj) this).field_w = ((kj) param0).field_w;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 == (((kj) param0).field_U ^ -1)) {
                break L4;
              } else {
                ((kj) this).field_U = ((kj) param0).field_U;
                break L4;
              }
            }
            L5: {
              if (null != ((kj) param0).field_L) {
                ((kj) this).field_L = ((kj) param0).field_L;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == ((kj) param0).field_Q) {
                break L6;
              } else {
                ((kj) this).field_Q = ((kj) param0).field_Q;
                break L6;
              }
            }
            L7: {
              if (((kj) param0).field_y >= 0) {
                ((kj) this).field_y = ((kj) param0).field_y;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((kj) param0).field_B != null) {
                ((kj) this).field_B = ((kj) param0).field_B;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (!((kj) param0).field_o) {
                break L9;
              } else {
                ((kj) this).field_o = ((kj) param0).field_o;
                break L9;
              }
            }
            L10: {
              if (!((kj) param0).field_C) {
                ((kj) this).field_C = ((kj) param0).field_C;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (((kj) param0).field_M == -2147483648) {
                break L11;
              } else {
                ((kj) this).field_M = ((kj) param0).field_M;
                break L11;
              }
            }
            L12: {
              if (null != ((kj) param0).field_X) {
                ((kj) this).field_X = ((kj) param0).field_X;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((kj) param0).field_p) {
                ((kj) this).field_p = ((kj) param0).field_p;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if ((((kj) param0).field_n ^ -1) > -1) {
                break L14;
              } else {
                ((kj) this).field_n = ((kj) param0).field_n;
                break L14;
              }
            }
            L15: {
              if (((kj) param0).field_T == null) {
                break L15;
              } else {
                ((kj) this).field_T = ((kj) param0).field_T;
                break L15;
              }
            }
            L16: {
              if (((kj) param0).field_W != -2147483648) {
                ((kj) this).field_W = ((kj) param0).field_W;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (((kj) param0).field_Z == null) {
                break L17;
              } else {
                ((kj) this).field_Z = ((kj) param0).field_Z;
                break L17;
              }
            }
            L18: {
              if (!((kj) param0).field_s) {
                break L18;
              } else {
                ((kj) this).field_s = ((kj) param0).field_s;
                break L18;
              }
            }
            L19: {
              if (((kj) param0).field_v) {
                ((kj) this).field_v = ((kj) param0).field_v;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (2147483647 == (((kj) param0).field_r ^ -1)) {
                break L20;
              } else {
                ((kj) this).field_r = ((kj) param0).field_r;
                break L20;
              }
            }
            L21: {
              if (0 == ((kj) param0).field_u) {
                break L21;
              } else {
                ((kj) this).field_u = ((kj) param0).field_u;
                break L21;
              }
            }
            L22: {
              if (null != ((kj) param0).field_A) {
                ((kj) this).field_A = ((kj) param0).field_A;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (((kj) param0).field_R != 0) {
                ((kj) this).field_R = ((kj) param0).field_R;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (((kj) param0).field_D == 0) {
                break L24;
              } else {
                ((kj) this).field_D = ((kj) param0).field_D;
                break L24;
              }
            }
            L25: {
              if (((kj) param0).field_V != null) {
                ((kj) this).field_V = ((kj) param0).field_V;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (-1 != (((kj) param0).field_I ^ -1)) {
                ((kj) this).field_I = ((kj) param0).field_I;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (-2147483648 != ((kj) param0).field_S) {
                ((kj) this).field_S = ((kj) param0).field_S;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (((kj) param0).field_Y == null) {
                break L28;
              } else {
                ((kj) this).field_Y = ((kj) param0).field_Y;
                break L28;
              }
            }
            L29: {
              if (((kj) param0).field_O != null) {
                ((kj) this).field_O = ((kj) param0).field_O;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (-2147483648 != ((kj) param0).field_K) {
                ((kj) this).field_K = ((kj) param0).field_K;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (0 == ((kj) param0).field_E) {
                break L31;
              } else {
                ((kj) this).field_E = ((kj) param0).field_E;
                break L31;
              }
            }
            L32: {
              if (((kj) param0).field_x == null) {
                break L32;
              } else {
                ((kj) this).field_x = ((kj) param0).field_x;
                break L32;
              }
            }
            L33: {
              if (((kj) param0).field_N != null) {
                ((kj) this).field_N = ((kj) param0).field_N;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (((kj) param0).field_G >= 0) {
                ((kj) this).field_G = ((kj) param0).field_G;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (!((kj) param0).field_F) {
                break L35;
              } else {
                ((kj) this).field_F = ((kj) param0).field_F;
                break L35;
              }
            }
            L36: {
              if ((((kj) param0).field_ab ^ -1) != 2147483647) {
                ((kj) this).field_ab = ((kj) param0).field_ab;
                break L36;
              } else {
                break L36;
              }
            }
            if ((((kj) param0).field_bb ^ -1) != -257) {
              ((kj) this).field_bb = ((kj) param0).field_bb;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L37: {
          if (param1 == 1) {
            break L37;
          } else {
            kj.a(-106, 57, -95, 68, -64);
            break L37;
          }
        }
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 != 45) {
            field_q = (String) null;
        }
        field_z = null;
    }

    kj(long param0, kj param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private kj(long param0, kj param1, int param2, int param3, int param4, int param5, String param6) {
        ((kj) this).field_K = -2147483648;
        ((kj) this).field_p = false;
        ((kj) this).field_S = -2147483648;
        ((kj) this).field_bb = 256;
        ((kj) this).field_ab = -2147483648;
        ((kj) this).field_C = true;
        ((kj) this).field_n = -1;
        ((kj) this).field_H = -1;
        ((kj) this).field_M = -2147483648;
        ((kj) this).field_r = -2147483648;
        ((kj) this).field_W = -2147483648;
        ((kj) this).field_y = -1;
        ((kj) this).field_G = -1;
        ((kj) this).field_e = param0;
        this.a(param1, 1);
        if (param6 != null) {
            ((kj) this).field_Z = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_z = new long[256];
        field_q = "Logging in...";
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_z[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (-2L != (var0 & 1L ^ -1L)) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> -1691930367 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
