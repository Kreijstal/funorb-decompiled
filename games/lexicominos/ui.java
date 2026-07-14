/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ui extends cf {
    private int field_ab;
    private int field_bb;
    private boolean field_M;
    private int field_p;
    private int field_X;
    private int field_Q;
    private db[] field_W;
    private int field_q;
    static int[] field_D;
    private db[] field_N;
    private int field_y;
    private db field_F;
    private int field_u;
    private db field_Y;
    private String field_r;
    private int field_J;
    private db[] field_x;
    private db[] field_E;
    private db field_V;
    private int field_z;
    private int field_I;
    private db field_B;
    private int field_cb;
    static String field_w;
    private int field_C;
    private db[] field_T;
    private int field_H;
    private boolean field_s;
    private int field_L;
    private boolean field_P;
    private le field_K;
    private int field_S;
    private int field_v;
    private db field_t;
    private boolean field_Z;
    private boolean field_A;
    private boolean field_U;
    private String field_O;
    private int field_G;

    final static tf a(byte param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        tf var5 = null;
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length() != -1) {
              var2 = param1.indexOf('@');
              if (0 == var2) {
                return w.field_k;
              } else {
                L1: {
                  if (param0 == -100) {
                    break L1;
                  } else {
                    field_w = null;
                    break L1;
                  }
                }
                var3 = param1.substring(0, var2);
                var4 = param1.substring(1 + var2);
                var5 = ah.a(var3, (byte) 111);
                if (var5 != null) {
                  return var5;
                } else {
                  return e.a(var4, -101);
                }
              }
            } else {
              break L0;
            }
          }
        }
        return fd.field_e;
    }

    final static boolean a(String param0, String param1, byte param2) {
        if (sh.d(param1, (byte) 50)) {
          return false;
        } else {
          if (!hd.a(param1, 17)) {
            if (ph.a((byte) 107, param1)) {
              return false;
            } else {
              if (param0.length() == 0) {
                return true;
              } else {
                if (!bi.a((byte) -126, param0, param1)) {
                  if (pd.a(param0, param1, 95)) {
                    return false;
                  } else {
                    if (param2 == -118) {
                      if (!ni.a((byte) 120, param1, param0)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static wf a(int param0, byte[] param1, int param2) {
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var3 = new wf(param1.length);
        var4 = param1.length / param0;
        if (param2 != -29165) {
          return null;
        } else {
          var5 = 0;
          L0: while (true) {
            if (var4 <= var5) {
              var3.field_h = param1.length;
              return var3;
            } else {
              var6 = 0;
              L1: while (true) {
                if (param0 <= var6) {
                  var5++;
                  continue L0;
                } else {
                  var3.field_j[var6 * var4 + var5] = param1[param0 * var5 + var6];
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void d(int param0) {
        vg.a(113);
        ni.a(param0 ^ -122, param0);
    }

    private final void a(byte param0, ui param1) {
        Object var4 = null;
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            L1: {
              if (0 != param1.field_ab) {
                ((ui) this).field_ab = param1.field_ab;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param1.field_U) {
                break L2;
              } else {
                ((ui) this).field_U = param1.field_U;
                break L2;
              }
            }
            L3: {
              if (param1.field_z != 256) {
                ((ui) this).field_z = param1.field_z;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1.field_W == null) {
                break L4;
              } else {
                ((ui) this).field_W = param1.field_W;
                break L4;
              }
            }
            L5: {
              if (null != param1.field_x) {
                ((ui) this).field_x = param1.field_x;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-2147483648 == param1.field_y) {
                break L6;
              } else {
                ((ui) this).field_y = param1.field_y;
                break L6;
              }
            }
            L7: {
              if (-1 >= param1.field_q) {
                ((ui) this).field_q = param1.field_q;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (-1 == param1.field_X) {
                break L8;
              } else {
                ((ui) this).field_X = param1.field_X;
                break L8;
              }
            }
            L9: {
              if (param1.field_r != null) {
                ((ui) this).field_r = param1.field_r;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if ((param1.field_bb ^ -1) == 2147483647) {
                break L10;
              } else {
                ((ui) this).field_bb = param1.field_bb;
                break L10;
              }
            }
            L11: {
              if (-2147483648 == param1.field_J) {
                break L11;
              } else {
                ((ui) this).field_J = param1.field_J;
                break L11;
              }
            }
            L12: {
              if (2147483647 != (param1.field_u ^ -1)) {
                ((ui) this).field_u = param1.field_u;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (null == param1.field_E) {
                break L13;
              } else {
                ((ui) this).field_E = param1.field_E;
                break L13;
              }
            }
            L14: {
              if (null == param1.field_N) {
                break L14;
              } else {
                ((ui) this).field_N = param1.field_N;
                break L14;
              }
            }
            L15: {
              if (param1.field_v != 0) {
                ((ui) this).field_v = param1.field_v;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1.field_K == null) {
                break L16;
              } else {
                ((ui) this).field_K = param1.field_K;
                break L16;
              }
            }
            L17: {
              if (-1 == (param1.field_G ^ -1)) {
                break L17;
              } else {
                ((ui) this).field_G = param1.field_G;
                break L17;
              }
            }
            L18: {
              if (param1.field_F == null) {
                break L18;
              } else {
                ((ui) this).field_F = param1.field_F;
                break L18;
              }
            }
            L19: {
              if (0 != param1.field_Q) {
                ((ui) this).field_Q = param1.field_Q;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (null != param1.field_B) {
                ((ui) this).field_B = param1.field_B;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (param1.field_V != null) {
                ((ui) this).field_V = param1.field_V;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (-1 != (param1.field_S ^ -1)) {
                ((ui) this).field_S = param1.field_S;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (param1.field_Z) {
                ((ui) this).field_Z = param1.field_Z;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (param1.field_s) {
                ((ui) this).field_s = param1.field_s;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (param1.field_A) {
                ((ui) this).field_A = param1.field_A;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (null == param1.field_O) {
                break L26;
              } else {
                ((ui) this).field_O = param1.field_O;
                break L26;
              }
            }
            L27: {
              if (-2147483648 == param1.field_H) {
                break L27;
              } else {
                ((ui) this).field_H = param1.field_H;
                break L27;
              }
            }
            L28: {
              if (param1.field_cb == -2147483648) {
                break L28;
              } else {
                ((ui) this).field_cb = param1.field_cb;
                break L28;
              }
            }
            L29: {
              if (0 <= param1.field_C) {
                ((ui) this).field_C = param1.field_C;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (0 <= param1.field_I) {
                ((ui) this).field_I = param1.field_I;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (!param1.field_P) {
                break L31;
              } else {
                ((ui) this).field_P = param1.field_P;
                break L31;
              }
            }
            L32: {
              if (-1 != (param1.field_L ^ -1)) {
                ((ui) this).field_L = param1.field_L;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (param1.field_p < 0) {
                break L33;
              } else {
                ((ui) this).field_p = param1.field_p;
                break L33;
              }
            }
            L34: {
              if (param1.field_Y == null) {
                break L34;
              } else {
                ((ui) this).field_Y = param1.field_Y;
                break L34;
              }
            }
            L35: {
              if (!param1.field_M) {
                ((ui) this).field_M = param1.field_M;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (param1.field_t == null) {
                break L36;
              } else {
                ((ui) this).field_t = param1.field_t;
                break L36;
              }
            }
            if (null != param1.field_T) {
              ((ui) this).field_T = param1.field_T;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L37: {
          if (param0 == -74) {
            break L37;
          } else {
            var4 = null;
            wf discarded$1 = ui.a(-111, (byte[]) null, 17);
            break L37;
          }
        }
    }

    ui(long param0, ui param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void e(int param0) {
        field_D = null;
        if (param0 != -1) {
            return;
        }
        field_w = null;
    }

    private ui(long param0, ui param1, int param2, int param3, int param4, int param5, String param6) {
        ((ui) this).field_p = -1;
        ((ui) this).field_J = -2147483648;
        ((ui) this).field_bb = -2147483648;
        ((ui) this).field_z = 256;
        ((ui) this).field_I = -1;
        ((ui) this).field_H = -2147483648;
        ((ui) this).field_C = -1;
        ((ui) this).field_y = -2147483648;
        ((ui) this).field_cb = -2147483648;
        ((ui) this).field_M = true;
        ((ui) this).field_q = -1;
        ((ui) this).field_u = -2147483648;
        ((ui) this).field_s = false;
        ((ui) this).field_d = param0;
        this.a((byte) -74, param1);
        if (param6 != null) {
            ((ui) this).field_O = param6;
        }
    }

    static {
    }
}
