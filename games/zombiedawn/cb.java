/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cb extends ce {
    private int field_L;
    private vn[] field_D;
    private int field_Y;
    private vn field_A;
    private boolean field_H;
    private vn field_F;
    private int field_S;
    private int field_K;
    private int field_P;
    private boolean field_E;
    private vn[] field_y;
    private String field_O;
    private rb field_bb;
    private boolean field_cb;
    private int field_J;
    private int field_x;
    static int[] field_N;
    private int field_V;
    private int field_Q;
    private vn field_R;
    private int field_fb;
    private int field_gb;
    private vn field_C;
    private boolean field_X;
    private int field_T;
    private boolean field_eb;
    private String field_Z;
    private int field_M;
    private boolean field_w;
    private vn[] field_db;
    private int field_z;
    private vn field_B;
    private int field_ab;
    private vn[] field_G;
    private int field_U;
    private int field_I;
    private int field_W;
    private vn[] field_hb;

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 < 59) {
          return false;
        } else {
          L0: {
            L1: {
              L2: {
                if (65 > param1) {
                  break L2;
                } else {
                  if (param1 <= 90) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 97) {
                  break L3;
                } else {
                  if (param1 > 122) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        }
    }

    public static void e(int param0) {
        field_N = null;
        if (param0 < 65) {
            boolean discarded$0 = cb.a(-56, 'N');
        }
    }

    final static String f(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        String stackIn_17_0 = null;
        String stackOut_6_0 = null;
        String stackOut_16_0 = null;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param0 == 3) {
            break L0;
          } else {
            boolean discarded$2 = cb.a(39, '￾');
            break L0;
          }
        }
        L1: {
          L2: {
            var1 = "(" + em.field_U + " " + wb.field_t + " " + e.field_P + ") " + l.field_d;
            if ((jd.field_b ^ -1) < -1) {
              var1 = var1 + ":";
              var2 = 0;
              L3: while (true) {
                if (jd.field_b <= var2) {
                  break L2;
                } else {
                  stackOut_6_0 = var1 + 32;
                  stackIn_17_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L4: {
                      L5: {
                        var1 = stackIn_7_0;
                        var3 = fj.field_g.field_h[var2] & 255;
                        var4 = var3 >> -1932707036;
                        var3 = var3 & 15;
                        if ((var4 ^ -1) <= -11) {
                          break L5;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4 += 55;
                      break L4;
                    }
                    L6: {
                      L7: {
                        if (10 <= var3) {
                          break L7;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3 += 55;
                      break L6;
                    }
                    var1 = var1 + (char)var4;
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
          stackOut_16_0 = (String) var1;
          stackIn_17_0 = stackOut_16_0;
          break L1;
        }
        return stackIn_17_0;
    }

    cb(long param0, cb param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, cb param1) {
        L0: {
          if (param1 != null) {
            L1: {
              if (param1.field_F == null) {
                break L1;
              } else {
                ((cb) this).field_F = param1.field_F;
                break L1;
              }
            }
            L2: {
              if (null == param1.field_G) {
                break L2;
              } else {
                ((cb) this).field_G = param1.field_G;
                break L2;
              }
            }
            L3: {
              if (-2147483648 == param1.field_M) {
                break L3;
              } else {
                ((cb) this).field_M = param1.field_M;
                break L3;
              }
            }
            L4: {
              if (null == param1.field_bb) {
                break L4;
              } else {
                ((cb) this).field_bb = param1.field_bb;
                break L4;
              }
            }
            L5: {
              if (param1.field_D == null) {
                break L5;
              } else {
                ((cb) this).field_D = param1.field_D;
                break L5;
              }
            }
            L6: {
              if (param1.field_gb == -2147483648) {
                break L6;
              } else {
                ((cb) this).field_gb = param1.field_gb;
                break L6;
              }
            }
            L7: {
              if (!param1.field_w) {
                break L7;
              } else {
                ((cb) this).field_w = param1.field_w;
                break L7;
              }
            }
            L8: {
              if (null != param1.field_A) {
                ((cb) this).field_A = param1.field_A;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1.field_X) {
                break L9;
              } else {
                ((cb) this).field_X = param1.field_X;
                break L9;
              }
            }
            L10: {
              if (!param1.field_E) {
                break L10;
              } else {
                ((cb) this).field_E = param1.field_E;
                break L10;
              }
            }
            L11: {
              if (-2147483648 == param1.field_Q) {
                break L11;
              } else {
                ((cb) this).field_Q = param1.field_Q;
                break L11;
              }
            }
            L12: {
              if (param1.field_O == null) {
                break L12;
              } else {
                ((cb) this).field_O = param1.field_O;
                break L12;
              }
            }
            L13: {
              if (param1.field_T != 0) {
                ((cb) this).field_T = param1.field_T;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (!param1.field_H) {
                break L14;
              } else {
                ((cb) this).field_H = param1.field_H;
                break L14;
              }
            }
            L15: {
              if (param1.field_Y != 0) {
                ((cb) this).field_Y = param1.field_Y;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (param1.field_Z != null) {
                ((cb) this).field_Z = param1.field_Z;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (param1.field_K >= 0) {
                ((cb) this).field_K = param1.field_K;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (-1 != (param1.field_ab ^ -1)) {
                ((cb) this).field_ab = param1.field_ab;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (0 == param1.field_fb) {
                break L19;
              } else {
                ((cb) this).field_fb = param1.field_fb;
                break L19;
              }
            }
            L20: {
              if (null == param1.field_R) {
                break L20;
              } else {
                ((cb) this).field_R = param1.field_R;
                break L20;
              }
            }
            L21: {
              if (!param1.field_cb) {
                break L21;
              } else {
                ((cb) this).field_cb = param1.field_cb;
                break L21;
              }
            }
            L22: {
              if (null != param1.field_B) {
                ((cb) this).field_B = param1.field_B;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if (param1.field_db != null) {
                ((cb) this).field_db = param1.field_db;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              if (param1.field_eb) {
                ((cb) this).field_eb = param1.field_eb;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (null != param1.field_y) {
                ((cb) this).field_y = param1.field_y;
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (-2147483648 == param1.field_V) {
                break L26;
              } else {
                ((cb) this).field_V = param1.field_V;
                break L26;
              }
            }
            L27: {
              if (2147483647 == (param1.field_z ^ -1)) {
                break L27;
              } else {
                ((cb) this).field_z = param1.field_z;
                break L27;
              }
            }
            L28: {
              if (param1.field_U == 0) {
                break L28;
              } else {
                ((cb) this).field_U = param1.field_U;
                break L28;
              }
            }
            L29: {
              if (null != param1.field_hb) {
                ((cb) this).field_hb = param1.field_hb;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (256 != param1.field_x) {
                ((cb) this).field_x = param1.field_x;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (param1.field_L != 0) {
                ((cb) this).field_L = param1.field_L;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              if (param1.field_S != -2147483648) {
                ((cb) this).field_S = param1.field_S;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (0 <= param1.field_J) {
                ((cb) this).field_J = param1.field_J;
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              if (0 > param1.field_I) {
                break L34;
              } else {
                ((cb) this).field_I = param1.field_I;
                break L34;
              }
            }
            L35: {
              if (null != param1.field_C) {
                ((cb) this).field_C = param1.field_C;
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              if (0 > param1.field_W) {
                break L36;
              } else {
                ((cb) this).field_W = param1.field_W;
                break L36;
              }
            }
            if (param1.field_P == 0) {
              break L0;
            } else {
              ((cb) this).field_P = param1.field_P;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L37: {
          if (param0 == -2147483648) {
            break L37;
          } else {
            ((cb) this).field_D = null;
            break L37;
          }
        }
    }

    private cb(long param0, cb param1, int param2, int param3, int param4, int param5, String param6) {
        ((cb) this).field_K = -1;
        ((cb) this).field_S = -2147483648;
        ((cb) this).field_x = 256;
        ((cb) this).field_Q = -2147483648;
        ((cb) this).field_V = -2147483648;
        ((cb) this).field_gb = -2147483648;
        ((cb) this).field_M = -2147483648;
        ((cb) this).field_J = -1;
        ((cb) this).field_H = false;
        ((cb) this).field_X = true;
        ((cb) this).field_I = -1;
        ((cb) this).field_z = -2147483648;
        ((cb) this).field_W = -1;
        ((cb) this).field_f = param0;
        this.a(-2147483648, param1);
        if (param6 != null) {
            ((cb) this).field_Z = param6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[]{1, 2, 3, 5, 5, 3, 5, 5, 1, 3, 5, 10, 5, 5, 2, 1, 3, 3, 3, 2, 2, 2, 3, 1, 5, 2, 3, 5, 10, 2, 2, 2};
    }
}
