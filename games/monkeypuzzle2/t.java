/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class t extends we {
    boolean field_w;
    private boolean field_A;
    private boolean field_x;
    boolean field_u;
    static pj field_v;
    static String field_y;
    static ta field_z;

    final void e(int param0) {
        Object var3 = null;
        if (param0 == 13104) {
          if (((t) this).field_A) {
            ((t) this).field_A = false;
            if (((t) this).field_o != null) {
              if (((t) this).field_o instanceof bj) {
                ((bj) (Object) ((t) this).field_o).a(false, (we) this, ((t) this).field_A);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = null;
          boolean discarded$6 = ((t) this).a(-78, 95, 39, 80, (we) null, -32, 69);
          if (((t) this).field_A) {
            ((t) this).field_A = false;
            if (((t) this).field_o != null) {
              if (((t) this).field_o instanceof bj) {
                ((bj) (Object) ((t) this).field_o).a(false, (we) this, ((t) this).field_A);
                return;
              } else {
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

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        if (!((t) this).field_w) {
          if (param3 != -1625) {
            ((t) this).field_A = false;
            return false;
          } else {
            return false;
          }
        } else {
          if (((t) this).a(param1, param0, param6, param5, (byte) 45)) {
            boolean discarded$2 = ((t) this).a(param4, false);
            ((t) this).field_t = param2;
            if (((t) this).field_o != null) {
              if (!(((t) this).field_o instanceof jb)) {
                return true;
              } else {
                ((jb) (Object) ((t) this).field_o).a(param6, param1, -29446, param2, param5, (t) this, param0);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param3 == -1625) {
              return false;
            } else {
              ((t) this).field_A = false;
              return false;
            }
          }
        }
    }

    t(String param0, ml param1, of param2) {
        super(param0, param1, param2);
        ((t) this).field_w = true;
        ((t) this).field_A = false;
        ((t) this).field_x = true;
    }

    final boolean b(byte param0) {
        if (param0 < 38) {
            return false;
        }
        return ((t) this).field_A;
    }

    t(String param0, of param1) {
        this(param0, hi.field_b.field_i, param1);
    }

    void a(we param0, int param1, int param2, byte param3) {
        L0: {
          super.a(param0, param1, param2, (byte) -48);
          if (((t) this).field_t == 0) {
            break L0;
          } else {
            if (((t) this).field_t != ni.field_a) {
              L1: {
                if (!((t) this).a(ei.field_a, param1, param2, p.field_a, (byte) 45)) {
                  break L1;
                } else {
                  if (0 == ni.field_a) {
                    ((t) this).b(-93, ei.field_a + -param2, -param1 + p.field_a, ((t) this).field_t);
                    break L1;
                  } else {
                    ((t) this).a(param1, ei.field_a, param0, p.field_a, 0, param2);
                    if (param3 < -13) {
                      return;
                    } else {
                      ((t) this).field_u = true;
                      return;
                    }
                  }
                }
              }
              ((t) this).a(param1, ei.field_a, param0, p.field_a, 0, param2);
              break L0;
            } else {
              if (param3 < -13) {
                return;
              } else {
                ((t) this).field_u = true;
                return;
              }
            }
          }
        }
        if (param3 >= -13) {
          ((t) this).field_u = true;
          return;
        } else {
          return;
        }
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        if (((t) this).a(param2, (byte) -125, param3, param1)) {
          L0: {
            ((t) this).a(param2, param3, param1, -108);
            if (((t) this).field_u) {
              StringBuilder discarded$8 = param1.append(" active");
              break L0;
            } else {
              break L0;
            }
          }
          if (!((t) this).field_w) {
            StringBuilder discarded$9 = param1.append(" disabled");
            if (param0) {
              return null;
            } else {
              return param1;
            }
          } else {
            if (param0) {
              return null;
            } else {
              return param1;
            }
          }
        } else {
          if (param0) {
            return null;
          } else {
            return param1;
          }
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        if (param0 <= -23) {
          if (null != ((t) this).field_o) {
            if (!(((t) this).field_o instanceof ql)) {
              return;
            } else {
              ((ql) (Object) ((t) this).field_o).a(param2, param3, param1, 7, (t) this);
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          ((t) this).a((we) null, 14, 64, (byte) 66);
          if (null != ((t) this).field_o) {
            if (!(((t) this).field_o instanceof ql)) {
              return;
            } else {
              ((ql) (Object) ((t) this).field_o).a(param2, param3, param1, 7, (t) this);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        if (((t) this).field_o != null) {
          if (!(((t) this).field_o instanceof jb)) {
            ((t) this).field_t = param4;
            return;
          } else {
            ((jb) (Object) ((t) this).field_o).a((byte) -14, param0, param1, param5, param3, (t) this);
            ((t) this).field_t = param4;
            return;
          }
        } else {
          ((t) this).field_t = param4;
          return;
        }
    }

    final static void i(int param0) {
        me var1 = null;
        int var2 = 0;
        hb var3 = null;
        var1 = (me) (Object) af.field_a.a((byte) -117);
        var2 = -29 % ((-53 - param0) / 58);
        if (var1 == null) {
          gk.a(-1);
          return;
        } else {
          var3 = MonkeyPuzzle2.field_D;
          int discarded$8 = var3.e(-86);
          int discarded$9 = var3.e(126);
          int discarded$10 = var3.e(-46);
          int discarded$11 = var3.e(127);
          var1.c(-19822);
          return;
        }
    }

    public static void j(int param0) {
        field_v = null;
        field_z = null;
        field_y = null;
        if (param0 > -26) {
            t.i(28);
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5 = 0;
        if (((t) this).b((byte) 96)) {
          if ((param2 ^ -1) != -85) {
            if (param2 == 83) {
              ((t) this).b(-64, -1, -1, 1);
              return true;
            } else {
              var5 = 58 % ((param3 - 37) / 50);
              return false;
            }
          } else {
            ((t) this).b(-64, -1, -1, 1);
            return true;
          }
        } else {
          var5 = 58 % ((param3 - 37) / 50);
          return false;
        }
    }

    boolean a(we param0, boolean param1) {
        if (((t) this).field_w) {
          if (((t) this).field_x) {
            if (!param1) {
              param0.e(13104);
              ((t) this).field_A = true;
              if (((t) this).field_o != null) {
                if (!(((t) this).field_o instanceof bj)) {
                  return true;
                } else {
                  ((bj) (Object) ((t) this).field_o).a(false, (we) this, ((t) this).field_A);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((t) this).e(-62);
              param0.e(13104);
              ((t) this).field_A = true;
              if (((t) this).field_o != null) {
                if (!(((t) this).field_o instanceof bj)) {
                  return true;
                } else {
                  ((bj) (Object) ((t) this).field_o).a(false, (we) this, ((t) this).field_A);
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

    protected t() {
        ((t) this).field_w = true;
        ((t) this).field_A = false;
        ((t) this).field_x = true;
        ((t) this).field_h = hi.field_b.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new pj();
        field_y = "Waiting for sound effects";
    }
}
