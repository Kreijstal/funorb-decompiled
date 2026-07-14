/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hf extends vg {
    private boolean field_F;
    static nh field_D;
    static int[] field_H;
    boolean field_E;
    private boolean field_B;
    static nh field_z;
    static int field_C;
    boolean field_A;
    static int[] field_G;

    final static String g(int param0) {
        if (param0 != -1) {
            field_D = null;
            if (em.field_c) {
                return null;
            }
            if (dd.field_l < qe.field_c) {
                return null;
            }
            if (!(dd.field_l >= je.field_j + qe.field_c)) {
                return ie.field_C;
            }
            return null;
        }
        if (em.field_c) {
            return null;
        }
        if (dd.field_l < qe.field_c) {
            return null;
        }
        if (!(dd.field_l >= je.field_j + qe.field_c)) {
            return ie.field_C;
        }
        return null;
    }

    hf(String param0, fd param1) {
        this(param0, ja.field_Q.field_b, param1);
    }

    final void c(byte param0) {
        int var2 = 0;
        var2 = 71 % ((param0 - -10) / 51);
        if (((hf) this).field_F) {
          ((hf) this).field_F = false;
          if (null != ((hf) this).field_u) {
            if (((hf) this).field_u instanceof pl) {
              ((pl) (Object) ((hf) this).field_u).a((vg) this, ((hf) this).field_F, false);
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

    public static void f(int param0) {
        if (param0 != 7966) {
            return;
        }
        field_D = null;
        field_G = null;
        field_H = null;
        field_z = null;
    }

    void a(vg param0, int param1, int param2, byte param3) {
        Object var6 = null;
        super.a(param0, param1, param2, (byte) -128);
        if (((hf) this).field_y != 0) {
          if (db.field_a != ((hf) this).field_y) {
            if (!((hf) this).a(param2, param1, false, ck.field_c, ob.field_g)) {
              ((hf) this).a(param1, param2, ob.field_g, param0, ck.field_c, false);
              if (param3 >= -127) {
                var6 = null;
                ((hf) this).a(-47, 85, 6, (vg) null, -99, true);
                return;
              } else {
                return;
              }
            } else {
              if (-1 != (db.field_a ^ -1)) {
                ((hf) this).a(param1, param2, ob.field_g, param0, ck.field_c, false);
                if (param3 >= -127) {
                  var6 = null;
                  ((hf) this).a(-47, 85, 6, (vg) null, -99, true);
                  return;
                } else {
                  return;
                }
              } else {
                ((hf) this).a(((hf) this).field_y, 26982, -param2 + ob.field_g, ck.field_c - param1);
                ((hf) this).a(param1, param2, ob.field_g, param0, ck.field_c, false);
                if (param3 >= -127) {
                  var6 = null;
                  ((hf) this).a(-47, 85, 6, (vg) null, -99, true);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param3 >= -127) {
              var6 = null;
              ((hf) this).a(-47, 85, 6, (vg) null, -99, true);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 >= -127) {
            var6 = null;
            ((hf) this).a(-47, 85, 6, (vg) null, -99, true);
            return;
          } else {
            return;
          }
        }
    }

    hf(String param0, cg param1, fd param2) {
        super(param0, param1, param2);
        ((hf) this).field_E = true;
        ((hf) this).field_B = true;
        ((hf) this).field_F = false;
    }

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        if (!param5) {
          if (null != ((hf) this).field_u) {
            if (!(((hf) this).field_u instanceof se)) {
              ((hf) this).field_y = 0;
              return;
            } else {
              ((se) (Object) ((hf) this).field_u).a(param2, param4, param0, 17437, (hf) this, param1);
              ((hf) this).field_y = 0;
              return;
            }
          } else {
            ((hf) this).field_y = 0;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(boolean param0, vg param1) {
        if (((hf) this).field_E) {
          if (((hf) this).field_B) {
            param1.c((byte) 122);
            if (!param0) {
              ((hf) this).field_F = true;
              if (null != ((hf) this).field_u) {
                if (!(((hf) this).field_u instanceof pl)) {
                  return true;
                } else {
                  ((pl) (Object) ((hf) this).field_u).a((vg) this, ((hf) this).field_F, false);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((hf) this).a(5, -103, -59, -102);
              ((hf) this).field_F = true;
              if (null != ((hf) this).field_u) {
                if (!(((hf) this).field_u instanceof pl)) {
                  return true;
                } else {
                  ((pl) (Object) ((hf) this).field_u).a((vg) this, ((hf) this).field_F, false);
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

    void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        L0: {
          if (null == ((hf) this).field_u) {
            break L0;
          } else {
            if (((hf) this).field_u instanceof ke) {
              ((ke) (Object) ((hf) this).field_u).a(param2, param3, true, (hf) this, param0);
              break L0;
            } else {
              if (param1 == 26982) {
                return;
              } else {
                var6 = null;
                ((hf) this).a((vg) null, -40, 15, (byte) 63);
                return;
              }
            }
          }
        }
        if (param1 != 26982) {
          var6 = null;
          ((hf) this).a((vg) null, -40, 15, (byte) 63);
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            hf.f(-19);
            return ((hf) this).field_F;
        }
        return ((hf) this).field_F;
    }

    boolean a(int param0, char param1, vg param2, int param3) {
        if (!((hf) this).a(true)) {
          if (param3 < 63) {
            String discarded$4 = hf.g(37);
            return false;
          } else {
            return false;
          }
        } else {
          if (param0 != -85) {
            if (-84 != param0) {
              if (param3 < 63) {
                String discarded$5 = hf.g(37);
                return false;
              } else {
                return false;
              }
            } else {
              ((hf) this).a(1, 26982, -1, -1);
              return true;
            }
          } else {
            ((hf) this).a(1, 26982, -1, -1);
            return true;
          }
        }
    }

    boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        if (((hf) this).field_E) {
          if (((hf) this).a(param6, param5, false, param4, param0)) {
            boolean discarded$2 = ((hf) this).a(false, param1);
            ((hf) this).field_y = param2;
            if (((hf) this).field_u != null) {
              if (!(((hf) this).field_u instanceof se)) {
                return true;
              } else {
                ((se) (Object) ((hf) this).field_u).a(param0, param6, 5708, param2, param5, param4, (hf) this);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param3 < 113) {
              field_H = null;
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param3 < 113) {
            field_H = null;
            return false;
          } else {
            return false;
          }
        }
    }

    protected hf() {
        ((hf) this).field_E = true;
        ((hf) this).field_B = true;
        ((hf) this).field_F = false;
        ((hf) this).field_l = ja.field_Q.field_a;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param3 == -10612) {
          if (((hf) this).a(param1, param2, param0, 101)) {
            ((hf) this).a(param2, (byte) 89, param0, param1);
            if (!((hf) this).field_A) {
              if (!((hf) this).field_E) {
                StringBuilder discarded$10 = param2.append(" disabled");
                return param2;
              } else {
                return param2;
              }
            } else {
              StringBuilder discarded$11 = param2.append(" active");
              if (((hf) this).field_E) {
                return param2;
              } else {
                StringBuilder discarded$12 = param2.append(" disabled");
                return param2;
              }
            }
          } else {
            return param2;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[]{0, 50, 50, 50, 50, 50, 150, 30, 50, 140, 70, -1, 50, 50};
        field_G = new int[8192];
    }
}
