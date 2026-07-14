/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hl extends lc {
    private int field_eb;
    private int field_Z;
    private int field_Q;
    private boolean field_E;
    private dd[] field_T;
    private dd field_fb;
    private int field_hb;
    private int field_H;
    private dd[] field_J;
    private int field_y;
    private boolean field_F;
    private String field_G;
    private int field_ab;
    private int field_L;
    private int field_M;
    private int field_S;
    private dd[] field_x;
    private int field_K;
    private int field_V;
    private int field_B;
    private dd field_R;
    private dd field_db;
    private boolean field_cb;
    private boolean field_w;
    private String field_A;
    private dd field_P;
    private int field_X;
    static int[] field_C;
    private fa field_W;
    private dd[] field_z;
    private int field_bb;
    private dd[] field_D;
    private boolean field_I;
    private boolean field_O;
    private dd field_U;
    private int field_gb;
    private int field_N;
    private int field_Y;

    hl(long param0, hl param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void g(int param0) {
        if (param0 != 0) {
            return;
        }
        if (!(db.field_J == null)) {
            db.field_J.d();
        }
        if (null != tg.field_i) {
            tg.field_i.d();
        }
    }

    final static int d(byte param0) {
        if (-3 < (ib.field_k ^ -1)) {
          return 0;
        } else {
          L0: {
            if (cg.field_y == 0) {
              if (rl.field_d.b((byte) -115)) {
                if (!rl.field_d.a("commonui", -114)) {
                  return 40;
                } else {
                  if (!oa.field_l.b((byte) -111)) {
                    return 50;
                  } else {
                    if (!oa.field_l.a("commonui", -106)) {
                      return 60;
                    } else {
                      if (!kc.field_d.b((byte) -122)) {
                        return 70;
                      } else {
                        if (!kc.field_d.a(-121)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                return 20;
              }
            } else {
              L1: {
                if (null == il.field_a) {
                  break L1;
                } else {
                  if (!il.field_a.b((byte) -103)) {
                    return 14;
                  } else {
                    if (!il.field_a.b("", 37)) {
                      return 29;
                    } else {
                      if (!il.field_a.a("", -128)) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              if (rl.field_d.b((byte) -120)) {
                if (!rl.field_d.a("commonui", -99)) {
                  return 57;
                } else {
                  if (oa.field_l.b((byte) -105)) {
                    if (oa.field_l.a("commonui", -95)) {
                      if (!kc.field_d.b((byte) -116)) {
                        return 82;
                      } else {
                        if (kc.field_d.a(-122)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                }
              } else {
                return 43;
              }
            }
          }
          if (param0 >= -48) {
            return 2;
          } else {
            return 100;
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_C = null;
    }

    private final void a(hl param0, boolean param1) {
        Object var4 = null;
        L0: {
          if (param0 != null) {
            L1: {
              if (param0.field_hb >= 0) {
                ((hl) this).field_hb = param0.field_hb;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0.field_z == null) {
                break L2;
              } else {
                ((hl) this).field_z = param0.field_z;
                break L2;
              }
            }
            L3: {
              if (param0.field_K == 0) {
                break L3;
              } else {
                ((hl) this).field_K = param0.field_K;
                break L3;
              }
            }
            L4: {
              if (param0.field_H == 0) {
                break L4;
              } else {
                ((hl) this).field_H = param0.field_H;
                break L4;
              }
            }
            L5: {
              if ((param0.field_y ^ -1) > -1) {
                break L5;
              } else {
                ((hl) this).field_y = param0.field_y;
                break L5;
              }
            }
            L6: {
              if (param0.field_F) {
                break L6;
              } else {
                ((hl) this).field_F = param0.field_F;
                break L6;
              }
            }
            L7: {
              if (!param0.field_w) {
                break L7;
              } else {
                ((hl) this).field_w = param0.field_w;
                break L7;
              }
            }
            L8: {
              if (param0.field_X != 0) {
                ((hl) this).field_X = param0.field_X;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param0.field_J != null) {
                ((hl) this).field_J = param0.field_J;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param0.field_V != -1) {
                ((hl) this).field_V = param0.field_V;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (2147483647 != param0.field_N) {
                ((hl) this).field_N = param0.field_N;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (param0.field_x == null) {
                break L12;
              } else {
                ((hl) this).field_x = param0.field_x;
                break L12;
              }
            }
            L13: {
              if (null != param0.field_R) {
                ((hl) this).field_R = param0.field_R;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (param0.field_M != 0) {
                ((hl) this).field_M = param0.field_M;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if ((param0.field_S ^ -1) > -1) {
                break L15;
              } else {
                ((hl) this).field_S = param0.field_S;
                break L15;
              }
            }
            L16: {
              if (null != param0.field_db) {
                ((hl) this).field_db = param0.field_db;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (param0.field_D != null) {
                ((hl) this).field_D = param0.field_D;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (param0.field_cb) {
                ((hl) this).field_cb = param0.field_cb;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (param0.field_T == null) {
                break L19;
              } else {
                ((hl) this).field_T = param0.field_T;
                break L19;
              }
            }
            L20: {
              if (-257 == (param0.field_ab ^ -1)) {
                break L20;
              } else {
                ((hl) this).field_ab = param0.field_ab;
                break L20;
              }
            }
            L21: {
              if (param0.field_O) {
                ((hl) this).field_O = param0.field_O;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param0.field_G != null) {
                ((hl) this).field_G = param0.field_G;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (-1 != (param0.field_L ^ -1)) {
                ((hl) this).field_L = param0.field_L;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (-2147483648 != param0.field_gb) {
                ((hl) this).field_gb = param0.field_gb;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (param0.field_A == null) {
                break L25;
              } else {
                ((hl) this).field_A = param0.field_A;
                break L25;
              }
            }
            L26: {
              if (param0.field_Y != -2147483648) {
                ((hl) this).field_Y = param0.field_Y;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (param0.field_bb < 0) {
                break L27;
              } else {
                ((hl) this).field_bb = param0.field_bb;
                break L27;
              }
            }
            L28: {
              if (null != param0.field_P) {
                ((hl) this).field_P = param0.field_P;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (param0.field_fb != null) {
                ((hl) this).field_fb = param0.field_fb;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (null != param0.field_U) {
                ((hl) this).field_U = param0.field_U;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param0.field_E) {
                ((hl) this).field_E = param0.field_E;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (2147483647 != (param0.field_B ^ -1)) {
                ((hl) this).field_B = param0.field_B;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (-2147483648 == param0.field_eb) {
                break L33;
              } else {
                ((hl) this).field_eb = param0.field_eb;
                break L33;
              }
            }
            L34: {
              if (!param0.field_I) {
                break L34;
              } else {
                ((hl) this).field_I = param0.field_I;
                break L34;
              }
            }
            L35: {
              if (param0.field_Q != 0) {
                ((hl) this).field_Q = param0.field_Q;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (param0.field_W != null) {
                ((hl) this).field_W = param0.field_W;
                break L36;
              } else {
                break L36;
              }
            }
            if (-2147483648 != param0.field_Z) {
              ((hl) this).field_Z = param0.field_Z;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            var4 = null;
            this.a((hl) null, false);
            break L37;
          }
        }
    }

    private hl(long param0, hl param1, int param2, int param3, int param4, int param5, String param6) {
        ((hl) this).field_B = -2147483648;
        ((hl) this).field_eb = -2147483648;
        ((hl) this).field_F = true;
        ((hl) this).field_bb = -1;
        ((hl) this).field_ab = 256;
        ((hl) this).field_hb = -1;
        ((hl) this).field_O = false;
        ((hl) this).field_y = -1;
        ((hl) this).field_gb = -2147483648;
        ((hl) this).field_N = -2147483648;
        ((hl) this).field_Z = -2147483648;
        ((hl) this).field_Y = -2147483648;
        ((hl) this).field_S = -1;
        ((hl) this).field_c = param0;
        this.a(param1, true);
        if (param6 != null) {
            ((hl) this).field_G = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[10];
    }
}
