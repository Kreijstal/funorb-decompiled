/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ih extends fd {
    private int field_W;
    private boolean field_x;
    private tg[] field_I;
    private boolean field_N;
    private tg field_t;
    private tg[] field_C;
    private int field_H;
    private int field_G;
    private boolean field_eb;
    private int field_L;
    static bc field_w;
    static String field_P;
    private int field_M;
    private int field_hb;
    private tg[] field_S;
    static int[] field_db;
    private tg field_F;
    private tg[] field_ab;
    private int field_r;
    private tg[] field_U;
    private int field_E;
    static oj field_Q;
    private int field_y;
    private String field_z;
    private int field_R;
    private int field_O;
    static int field_D;
    private String field_fb;
    static int[] field_V;
    private int field_J;
    private tg field_Z;
    static gk field_p;
    private boolean field_q;
    private boolean field_Y;
    static int field_X;
    private int field_A;
    private int field_ib;
    private int field_B;
    private int field_K;
    private boolean field_bb;
    private int field_s;
    static tg[] field_T;
    private int field_v;
    private tg field_gb;
    private tj field_u;
    private tg field_cb;

    public static void d(byte param0) {
        field_T = null;
        field_Q = null;
        field_V = null;
        field_P = null;
        field_p = null;
        if (param0 != -58) {
            ih.d((byte) -127);
        }
        field_w = null;
        field_db = null;
    }

    final static void a(int param0, int param1) {
        int var3 = Bounce.field_N;
        ke var4 = (ke) (Object) uk.field_d.a((byte) -107);
        while (var4 != null) {
            qh.a(var4, param0, -22762);
            var4 = (ke) (Object) uk.field_d.d((byte) -127);
        }
        if (param1 != -1) {
            field_X = -78;
        }
        ai var2 = ne.field_r.a((byte) -59);
        while (var2 != null) {
            ea.a(2, param0);
            var2 = ne.field_r.d((byte) -24);
        }
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        if (param1 != null) {
          L0: {
            var3 = param1.length();
            if (1 > var3) {
              break L0;
            } else {
              if (12 >= var3) {
                L1: {
                  var4 = ce.a(param1, 0);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) <= -2) {
                      L2: {
                        if (f.a(var4.charAt(0), param2)) {
                          break L2;
                        } else {
                          if (!f.a(var4.charAt(-1 + var4.length()), false)) {
                            var5 = 0;
                            var6 = 0;
                            L3: while (true) {
                              if (param1.length() <= var6) {
                                L4: {
                                  if (!param2) {
                                    break L4;
                                  } else {
                                    ih.d((byte) -38);
                                    break L4;
                                  }
                                }
                                if (var5 > 0) {
                                  return hi.field_a;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param1.charAt(var6);
                                  if (!f.a((char) var7, false)) {
                                    var5 = 0;
                                    break L5;
                                  } else {
                                    var5++;
                                    break L5;
                                  }
                                }
                                if ((var5 ^ -1) <= -3) {
                                  if (!param0) {
                                    return sg.field_c;
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return hi.field_a;
                    } else {
                      break L1;
                    }
                  }
                }
                return ub.field_e;
              } else {
                break L0;
              }
            }
          }
          return ub.field_e;
        } else {
          return ub.field_e;
        }
    }

    private final void a(int param0, ih param1) {
        L0: {
          if (param1 != null) {
            L1: {
              if (256 == param1.field_K) {
                break L1;
              } else {
                ((ih) this).field_K = param1.field_K;
                break L1;
              }
            }
            L2: {
              if (null == param1.field_cb) {
                break L2;
              } else {
                ((ih) this).field_cb = param1.field_cb;
                break L2;
              }
            }
            L3: {
              if (param1.field_x) {
                ((ih) this).field_x = param1.field_x;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 != (param1.field_R ^ -1)) {
                ((ih) this).field_R = param1.field_R;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((param1.field_hb ^ -1) > -1) {
                break L5;
              } else {
                ((ih) this).field_hb = param1.field_hb;
                break L5;
              }
            }
            L6: {
              if (0 != param1.field_r) {
                ((ih) this).field_r = param1.field_r;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!param1.field_eb) {
                break L7;
              } else {
                ((ih) this).field_eb = param1.field_eb;
                break L7;
              }
            }
            L8: {
              if (param1.field_A != -2147483648) {
                ((ih) this).field_A = param1.field_A;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param1.field_M ^ -1) != -1) {
                ((ih) this).field_M = param1.field_M;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param1.field_bb) {
                break L10;
              } else {
                ((ih) this).field_bb = param1.field_bb;
                break L10;
              }
            }
            L11: {
              if (-2147483648 == param1.field_W) {
                break L11;
              } else {
                ((ih) this).field_W = param1.field_W;
                break L11;
              }
            }
            L12: {
              if (-2147483648 == param1.field_ib) {
                break L12;
              } else {
                ((ih) this).field_ib = param1.field_ib;
                break L12;
              }
            }
            L13: {
              if ((param1.field_B ^ -1) == -1) {
                break L13;
              } else {
                ((ih) this).field_B = param1.field_B;
                break L13;
              }
            }
            L14: {
              if (param1.field_E == -2147483648) {
                break L14;
              } else {
                ((ih) this).field_E = param1.field_E;
                break L14;
              }
            }
            L15: {
              if (-2147483648 == param1.field_y) {
                break L15;
              } else {
                ((ih) this).field_y = param1.field_y;
                break L15;
              }
            }
            L16: {
              if (param1.field_U == null) {
                break L16;
              } else {
                ((ih) this).field_U = param1.field_U;
                break L16;
              }
            }
            L17: {
              if (-1 < (param1.field_s ^ -1)) {
                break L17;
              } else {
                ((ih) this).field_s = param1.field_s;
                break L17;
              }
            }
            L18: {
              if (param1.field_ab == null) {
                break L18;
              } else {
                ((ih) this).field_ab = param1.field_ab;
                break L18;
              }
            }
            L19: {
              if (null == param1.field_u) {
                break L19;
              } else {
                ((ih) this).field_u = param1.field_u;
                break L19;
              }
            }
            L20: {
              if (param1.field_F == null) {
                break L20;
              } else {
                ((ih) this).field_F = param1.field_F;
                break L20;
              }
            }
            L21: {
              if (null != param1.field_C) {
                ((ih) this).field_C = param1.field_C;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (param1.field_z != null) {
                ((ih) this).field_z = param1.field_z;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (null == param1.field_t) {
                break L23;
              } else {
                ((ih) this).field_t = param1.field_t;
                break L23;
              }
            }
            L24: {
              if (null == param1.field_fb) {
                break L24;
              } else {
                ((ih) this).field_fb = param1.field_fb;
                break L24;
              }
            }
            L25: {
              if (!param1.field_q) {
                break L25;
              } else {
                ((ih) this).field_q = param1.field_q;
                break L25;
              }
            }
            L26: {
              if (null != param1.field_gb) {
                ((ih) this).field_gb = param1.field_gb;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (0 != param1.field_J) {
                ((ih) this).field_J = param1.field_J;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (-1 >= (param1.field_v ^ -1)) {
                ((ih) this).field_v = param1.field_v;
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (!param1.field_N) {
                break L29;
              } else {
                ((ih) this).field_N = param1.field_N;
                break L29;
              }
            }
            L30: {
              if (param1.field_L != 0) {
                ((ih) this).field_L = param1.field_L;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (null == param1.field_I) {
                break L31;
              } else {
                ((ih) this).field_I = param1.field_I;
                break L31;
              }
            }
            L32: {
              if (param1.field_S != null) {
                ((ih) this).field_S = param1.field_S;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (!param1.field_Y) {
                break L33;
              } else {
                ((ih) this).field_Y = param1.field_Y;
                break L33;
              }
            }
            L34: {
              if (param1.field_Z != null) {
                ((ih) this).field_Z = param1.field_Z;
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if ((param1.field_G ^ -1) > -1) {
                break L35;
              } else {
                ((ih) this).field_G = param1.field_G;
                break L35;
              }
            }
            L36: {
              if (2147483647 != (param1.field_O ^ -1)) {
                ((ih) this).field_O = param1.field_O;
                break L36;
              } else {
                break L36;
              }
            }
            if ((param1.field_H ^ -1) == -1) {
              break L0;
            } else {
              ((ih) this).field_H = param1.field_H;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L37: {
          if (param0 == -1) {
            break L37;
          } else {
            ((ih) this).field_x = true;
            break L37;
          }
        }
    }

    ih(long param0, ih param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private ih(long param0, ih param1, int param2, int param3, int param4, int param5, String param6) {
        ((ih) this).field_W = -2147483648;
        ((ih) this).field_hb = -1;
        ((ih) this).field_G = -1;
        ((ih) this).field_O = -2147483648;
        ((ih) this).field_E = -2147483648;
        ((ih) this).field_y = -2147483648;
        ((ih) this).field_Y = false;
        ((ih) this).field_bb = true;
        ((ih) this).field_v = -1;
        ((ih) this).field_K = 256;
        ((ih) this).field_ib = -2147483648;
        ((ih) this).field_s = -1;
        ((ih) this).field_A = -2147483648;
        ((ih) this).field_d = param0;
        this.a(-1, param1);
        if (param6 != null) {
            ((ih) this).field_fb = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Unfortunately you are not eligible to create an account.";
        field_db = new int[8192];
    }
}
