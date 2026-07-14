/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rm extends n {
    static String field_E;
    private boolean field_C;
    private boolean field_F;
    boolean field_B;
    static uf field_A;
    boolean field_D;

    final void e(int param0) {
        if (((rm) this).field_C) {
          L0: {
            ((rm) this).field_C = false;
            if (null == ((rm) this).field_t) {
              break L0;
            } else {
              if (((rm) this).field_t instanceof mh) {
                ((mh) (Object) ((rm) this).field_t).a((n) this, 30154, ((rm) this).field_C);
                break L0;
              } else {
                if (param0 >= 15) {
                  return;
                } else {
                  rm.h(-3);
                  return;
                }
              }
            }
          }
          if (param0 < 15) {
            rm.h(-3);
            return;
          } else {
            return;
          }
        } else {
          if (param0 >= 15) {
            return;
          } else {
            rm.h(-3);
            return;
          }
        }
    }

    rm(String param0, dh param1, tb param2) {
        super(param0, param1, param2);
        ((rm) this).field_C = false;
        ((rm) this).field_F = true;
        ((rm) this).field_D = true;
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        if (param2 == -78) {
          if (((rm) this).c((byte) -20)) {
            if (param1 != 84) {
              if (param1 != 83) {
                return false;
              } else {
                ((rm) this).a(1, -1, true, -1);
                return true;
              }
            } else {
              ((rm) this).a(1, -1, true, -1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((rm) this).field_F = true;
          if (((rm) this).c((byte) -20)) {
            if (param1 != 84) {
              if (param1 == 83) {
                ((rm) this).a(1, -1, true, -1);
                return true;
              } else {
                return false;
              }
            } else {
              ((rm) this).a(1, -1, true, -1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        if (param4 == -9) {
          if (null != ((rm) this).field_t) {
            if (!(((rm) this).field_t instanceof un)) {
              ((rm) this).field_v = 0;
              return;
            } else {
              ((un) (Object) ((rm) this).field_t).a(param5, param0, param2, (rm) this, (byte) -71, param3);
              ((rm) this).field_v = 0;
              return;
            }
          } else {
            ((rm) this).field_v = 0;
            return;
          }
        } else {
          ((rm) this).e(45);
          if (null != ((rm) this).field_t) {
            if (!(((rm) this).field_t instanceof un)) {
              ((rm) this).field_v = 0;
              return;
            } else {
              ((un) (Object) ((rm) this).field_t).a(param5, param0, param2, (rm) this, (byte) -71, param3);
              ((rm) this).field_v = 0;
              return;
            }
          } else {
            ((rm) this).field_v = 0;
            return;
          }
        }
    }

    public static void i(int param0) {
        field_E = null;
        if (param0 != -5531) {
            return;
        }
        field_A = null;
    }

    void a(int param0, n param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (0 != ((rm) this).field_v) {
          if (((rm) this).field_v != rd.field_f) {
            if (!((rm) this).b(param0, (byte) -105, nc.field_g, param2, rf.field_X)) {
              ((rm) this).a(nc.field_g, param1, param2, param0, (byte) -9, rf.field_X);
              return;
            } else {
              if (-1 == (rd.field_f ^ -1)) {
                ((rm) this).a(((rm) this).field_v, -param2 + rf.field_X, true, nc.field_g - param0);
                ((rm) this).a(nc.field_g, param1, param2, param0, (byte) -9, rf.field_X);
                return;
              } else {
                ((rm) this).a(nc.field_g, param1, param2, param0, (byte) -9, rf.field_X);
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

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        if (((rm) this).field_D) {
          if (((rm) this).b(param0, (byte) -105, param5, param2, param1)) {
            boolean discarded$2 = ((rm) this).a(param3, param4 ^ 25781);
            ((rm) this).field_v = param6;
            if (null != ((rm) this).field_t) {
              if (!(((rm) this).field_t instanceof un)) {
                return true;
              } else {
                ((un) (Object) ((rm) this).field_t).a((byte) -68, (rm) this, param0, param5, param2, param6, param1);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param4 != -108) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          if (param4 != -108) {
            return true;
          } else {
            return false;
          }
        }
    }

    final static void h(int param0) {
        Object var2 = null;
        if (param0 != 84) {
          rm.h(-35);
          var2 = null;
          ag.a((String) null, false, "");
          return;
        } else {
          var2 = null;
          ag.a((String) null, false, "");
          return;
        }
    }

    void a(int param0, int param1, boolean param2, int param3) {
        L0: {
          if (null == ((rm) this).field_t) {
            break L0;
          } else {
            if (((rm) this).field_t instanceof pi) {
              ((pi) (Object) ((rm) this).field_t).a(param0, (rm) this, -4, param3, param1);
              break L0;
            } else {
              if (param2) {
                return;
              } else {
                field_E = null;
                return;
              }
            }
          }
        }
        if (!param2) {
          field_E = null;
          return;
        } else {
          return;
        }
    }

    rm(String param0, tb param1) {
        this(param0, pc.field_b.field_p, param1);
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5 = 0;
        var5 = -66 % ((param1 - 0) / 49);
        if (((rm) this).a(20720, param2, param3, param0)) {
          ((rm) this).a(param2, param0, true, param3);
          if (!((rm) this).field_B) {
            if (!((rm) this).field_D) {
              StringBuilder discarded$10 = param3.append(" disabled");
              return param3;
            } else {
              return param3;
            }
          } else {
            StringBuilder discarded$11 = param3.append(" active");
            if (((rm) this).field_D) {
              return param3;
            } else {
              StringBuilder discarded$12 = param3.append(" disabled");
              return param3;
            }
          }
        } else {
          return param3;
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
            return true;
        }
        return ((rm) this).field_C;
    }

    boolean a(n param0, int param1) {
        if (((rm) this).field_D) {
          if (((rm) this).field_F) {
            param0.e(50);
            ((rm) this).field_C = true;
            if (param1 == -25823) {
              if (null != ((rm) this).field_t) {
                if (!(((rm) this).field_t instanceof mh)) {
                  return true;
                } else {
                  ((mh) (Object) ((rm) this).field_t).a((n) this, 30154, ((rm) this).field_C);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              rm.i(17);
              if (null != ((rm) this).field_t) {
                if (!(((rm) this).field_t instanceof mh)) {
                  return true;
                } else {
                  ((mh) (Object) ((rm) this).field_t).a((n) this, 30154, ((rm) this).field_C);
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

    protected rm() {
        ((rm) this).field_C = false;
        ((rm) this).field_F = true;
        ((rm) this).field_D = true;
        ((rm) this).field_l = pc.field_b.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Waiting for levels";
    }
}
