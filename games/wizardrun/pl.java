/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pl extends ub {
    private boolean field_y;
    static ga field_E;
    static int field_A;
    boolean field_B;
    private boolean field_C;
    boolean field_z;
    static boolean field_D;

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        L0: {
          if (!((pl) this).a(param3, param0, param2, true)) {
            break L0;
          } else {
            ((pl) this).a(115, param2, param0, param3);
            if (!((pl) this).field_z) {
              if (!((pl) this).field_B) {
                StringBuilder discarded$15 = param3.append(" disabled");
                break L0;
              } else {
                if (param1 == 102) {
                  return param3;
                } else {
                  ((pl) this).field_C = true;
                  return param3;
                }
              }
            } else {
              L1: {
                StringBuilder discarded$16 = param3.append(" active");
                if (!((pl) this).field_B) {
                  StringBuilder discarded$17 = param3.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param1 == 102) {
                return param3;
              } else {
                ((pl) this).field_C = true;
                return param3;
              }
            }
          }
        }
        if (param1 != 102) {
          ((pl) this).field_C = true;
          return param3;
        } else {
          return param3;
        }
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        if (((pl) this).field_s != null) {
          if (!(((pl) this).field_s instanceof ja)) {
            ((pl) this).field_q = param5;
            return;
          } else {
            ((ja) (Object) ((pl) this).field_s).a(param0, (pl) this, param1, param2, true, param3);
            ((pl) this).field_q = param5;
            return;
          }
        } else {
          ((pl) this).field_q = param5;
          return;
        }
    }

    pl(String param0, ce param1) {
        this(param0, kc.field_H.field_c, param1);
    }

    final static wd a(int param0, String param1) {
        if (param0 == -1) {
          if (wc.field_j != field_E) {
            if (wc.field_j == mi.field_z) {
              if (!param1.equals((Object) (Object) qc.field_I)) {
                kd.field_a = null;
                qc.field_I = param1;
                wc.field_j = field_E;
                return null;
              } else {
                wc.field_j = ej.field_b;
                return kd.field_a;
              }
            } else {
              kd.field_a = null;
              qc.field_I = param1;
              wc.field_j = field_E;
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param0 < -45) {
          if (((pl) this).field_s != null) {
            if (!(((pl) this).field_s instanceof qd)) {
              return;
            } else {
              ((qd) (Object) ((pl) this).field_s).a(-18905, (pl) this, param3, param2, param1);
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$6 = ((pl) this).d((byte) -65);
          if (((pl) this).field_s == null) {
            return;
          } else {
            L0: {
              if (((pl) this).field_s instanceof qd) {
                ((qd) (Object) ((pl) this).field_s).a(-18905, (pl) this, param3, param2, param1);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    boolean a(ub param0, int param1) {
        if (((pl) this).field_B) {
          if (((pl) this).field_y) {
            L0: {
              param0.b(false);
              ((pl) this).field_C = true;
              if (((pl) this).field_s == null) {
                break L0;
              } else {
                if (((pl) this).field_s instanceof ma) {
                  ((ma) (Object) ((pl) this).field_s).a((ub) this, param1 ^ -19983, ((pl) this).field_C);
                  break L0;
                } else {
                  if (param1 != 8) {
                    String discarded$4 = pl.a(92);
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param1 != 8) {
              String discarded$5 = pl.a(92);
              return true;
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

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8 = 0;
        var8 = 16 / ((param1 - 12) / 36);
        if (((pl) this).field_B) {
          if (((pl) this).b(param5, param2, 0, param0, param3)) {
            boolean discarded$2 = ((pl) this).a(param6, 8);
            ((pl) this).field_q = param4;
            if (((pl) this).field_s != null) {
              if (!(((pl) this).field_s instanceof ja)) {
                return true;
              } else {
                ((ja) (Object) ((pl) this).field_s).a((pl) this, param4, param5, (byte) -17, param0, param2, param3);
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

    void a(int param0, int param1, int param2, ub param3) {
        super.a(param0, param1, param2, param3);
        if (-1 != (((pl) this).field_q ^ -1)) {
          if (sh.field_c != ((pl) this).field_q) {
            if (!((pl) this).b(fi.field_B, pg.field_n, 0, param2, param1)) {
              ((pl) this).a(param2, fi.field_B, param1, pg.field_n, param3, 0);
              return;
            } else {
              if (0 == sh.field_c) {
                ((pl) this).b(-88, pg.field_n - param2, -param1 + fi.field_B, ((pl) this).field_q);
                ((pl) this).a(param2, fi.field_B, param1, pg.field_n, param3, 0);
                return;
              } else {
                ((pl) this).a(param2, fi.field_B, param1, pg.field_n, param3, 0);
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

    final boolean d(byte param0) {
        if (param0 != 53) {
            String discarded$0 = pl.a(49);
            return ((pl) this).field_C;
        }
        return ((pl) this).field_C;
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
        if (param2 <= -96) {
          if (((pl) this).d((byte) 53)) {
            if (84 != param1) {
              if ((param1 ^ -1) != -84) {
                return false;
              } else {
                ((pl) this).b(-117, -1, -1, 1);
                return true;
              }
            } else {
              ((pl) this).b(-117, -1, -1, 1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (fi.field_y == field_E) {
            return sf.field_a;
        }
        return lb.field_e;
    }

    final void b(boolean param0) {
        if (!param0) {
          if (((pl) this).field_C) {
            ((pl) this).field_C = false;
            if (((pl) this).field_s != null) {
              if (!(((pl) this).field_s instanceof ma)) {
                return;
              } else {
                ((ma) (Object) ((pl) this).field_s).a((ub) this, -19975, ((pl) this).field_C);
                return;
              }
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

    public static void d(boolean param0) {
        field_E = null;
        if (!param0) {
            String discarded$0 = pl.a(68);
        }
    }

    protected pl() {
        ((pl) this).field_y = true;
        ((pl) this).field_B = true;
        ((pl) this).field_C = false;
        ((pl) this).field_w = kc.field_H.field_n;
    }

    pl(String param0, bf param1, ce param2) {
        super(param0, param1, param2);
        ((pl) this).field_y = true;
        ((pl) this).field_B = true;
        ((pl) this).field_C = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = 0;
        field_D = false;
        field_E = new ga();
    }
}
