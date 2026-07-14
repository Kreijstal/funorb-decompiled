/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rg extends fj {
    private boolean field_H;
    static int field_M;
    boolean field_L;
    boolean field_O;
    static String field_J;
    static boolean field_K;
    static int[] field_I;
    private boolean field_N;

    boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        if (param2 == 91) {
          if (((rg) this).field_L) {
            if (((rg) this).a(param1, (byte) 126, param0, param5, param3)) {
              boolean discarded$2 = ((rg) this).a(param4, 418);
              ((rg) this).field_o = param6;
              if (((rg) this).field_t != null) {
                if (!(((rg) this).field_t instanceof nc)) {
                  return true;
                } else {
                  ((nc) (Object) ((rg) this).field_t).a(param0, param5, (rg) this, param3, (byte) -115, param1, param6);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          rg.g((byte) 85);
          if (((rg) this).field_L) {
            if (((rg) this).a(param1, (byte) 126, param0, param5, param3)) {
              boolean discarded$3 = ((rg) this).a(param4, 418);
              ((rg) this).field_o = param6;
              if (((rg) this).field_t != null) {
                if (!(((rg) this).field_t instanceof nc)) {
                  return true;
                } else {
                  ((nc) (Object) ((rg) this).field_t).a(param0, param5, (rg) this, param3, (byte) -115, param1, param6);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == 25124) {
          if (null != ((rg) this).field_t) {
            if (!(((rg) this).field_t instanceof el)) {
              return;
            } else {
              ((el) (Object) ((rg) this).field_t).a(98, param3, param1, (rg) this, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    rg(String param0, uk param1) {
        this(param0, bg.field_d.field_h, param1);
    }

    boolean a(fj param0, int param1) {
        if (((rg) this).field_L) {
          if (((rg) this).field_N) {
            param0.b(param1 + -334);
            if (param1 == 418) {
              ((rg) this).field_H = true;
              if (null != ((rg) this).field_t) {
                if (!(((rg) this).field_t instanceof vi)) {
                  return true;
                } else {
                  ((vi) (Object) ((rg) this).field_t).a((fj) this, ((rg) this).field_H, (byte) -85);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              field_M = 32;
              ((rg) this).field_H = true;
              if (null != ((rg) this).field_t) {
                if (!(((rg) this).field_t instanceof vi)) {
                  return true;
                } else {
                  ((vi) (Object) ((rg) this).field_t).a((fj) this, ((rg) this).field_H, (byte) -85);
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void g(byte param0) {
        if (param0 != 17) {
            return;
        }
        field_J = null;
        field_I = null;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        if (((rg) this).a((byte) -13, param1, param2, param0)) {
          ((rg) this).a(param0, param2, (byte) -63, param1);
          if (!((rg) this).field_O) {
            if (!((rg) this).field_L) {
              StringBuilder discarded$27 = param0.append(" disabled");
              if (param3) {
                boolean discarded$28 = ((rg) this).e((byte) 17);
                return param0;
              } else {
                return param0;
              }
            } else {
              if (param3) {
                boolean discarded$29 = ((rg) this).e((byte) 17);
                return param0;
              } else {
                return param0;
              }
            }
          } else {
            L0: {
              StringBuilder discarded$30 = param0.append(" active");
              if (!((rg) this).field_L) {
                StringBuilder discarded$31 = param0.append(" disabled");
                break L0;
              } else {
                break L0;
              }
            }
            if (!param3) {
              return param0;
            } else {
              boolean discarded$32 = ((rg) this).e((byte) 17);
              return param0;
            }
          }
        } else {
          if (!param3) {
            return param0;
          } else {
            boolean discarded$33 = ((rg) this).e((byte) 17);
            return param0;
          }
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != ((rg) this).field_o) {
          if (((rg) this).field_o != Confined.field_I) {
            if (!((rg) this).a(ld.field_l, (byte) 124, param2, jh.field_R, param3)) {
              ((rg) this).a(-38, param3, ld.field_l, param0, jh.field_R, param2);
              return;
            } else {
              if (Confined.field_I == 0) {
                ((rg) this).a(25124, jh.field_R + -param3, ld.field_l - param2, ((rg) this).field_o);
                ((rg) this).a(-38, param3, ld.field_l, param0, jh.field_R, param2);
                return;
              } else {
                ((rg) this).a(-38, param3, ld.field_l, param0, jh.field_R, param2);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    rg(String param0, fe param1, uk param2) {
        super(param0, param1, param2);
        ((rg) this).field_L = true;
        ((rg) this).field_H = false;
        ((rg) this).field_N = true;
    }

    final void b(int param0) {
        if (param0 == 84) {
          if (((rg) this).field_H) {
            ((rg) this).field_H = false;
            if (((rg) this).field_t != null) {
              if (!(((rg) this).field_t instanceof vi)) {
                return;
              } else {
                ((vi) (Object) ((rg) this).field_t).a((fj) this, ((rg) this).field_H, (byte) -110);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((rg) this).field_H = true;
          if (((rg) this).field_H) {
            ((rg) this).field_H = false;
            if (((rg) this).field_t != null) {
              if (!(((rg) this).field_t instanceof vi)) {
                return;
              } else {
                ((vi) (Object) ((rg) this).field_t).a((fj) this, ((rg) this).field_H, (byte) -110);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5 = 0;
        if (((rg) this).e((byte) 60)) {
          if (-85 != (param2 ^ -1)) {
            if ((param2 ^ -1) == -84) {
              ((rg) this).a(25124, -1, -1, 1);
              return true;
            } else {
              var5 = 0 / ((47 - param1) / 43);
              return false;
            }
          } else {
            ((rg) this).a(25124, -1, -1, 1);
            return true;
          }
        } else {
          var5 = 0 / ((47 - param1) / 43);
          return false;
        }
    }

    final boolean e(byte param0) {
        int var2 = -119 % ((param0 - -74) / 49);
        return ((rg) this).field_H;
    }

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        Object var8 = null;
        if (param0 < -18) {
          if (((rg) this).field_t != null) {
            if (!(((rg) this).field_t instanceof nc)) {
              ((rg) this).field_o = 0;
              return;
            } else {
              ((nc) (Object) ((rg) this).field_t).a((rg) this, -126, param2, param1, param4, param5);
              ((rg) this).field_o = 0;
              return;
            }
          } else {
            ((rg) this).field_o = 0;
            return;
          }
        } else {
          var8 = null;
          ((rg) this).a((fj) null, 87, -34, -5);
          if (((rg) this).field_t == null) {
            ((rg) this).field_o = 0;
            return;
          } else {
            L0: {
              if (((rg) this).field_t instanceof nc) {
                ((nc) (Object) ((rg) this).field_t).a((rg) this, -126, param2, param1, param4, param5);
                break L0;
              } else {
                break L0;
              }
            }
            ((rg) this).field_o = 0;
            return;
          }
        }
    }

    protected rg() {
        ((rg) this).field_L = true;
        ((rg) this).field_H = false;
        ((rg) this).field_N = true;
        ((rg) this).field_n = bg.field_d.field_w;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Mouse over an icon for details";
    }
}
