/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class bb extends qa {
    boolean field_G;
    static int field_C;
    boolean field_D;
    static String field_H;
    static String field_I;
    static String field_J;
    static int field_E;
    private boolean field_B;
    private boolean field_F;
    static Boolean field_A;

    final StringBuilder a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        if (param3 <= -47) {
          if (((bb) this).a(param1, 95, param0, param2)) {
            L0: {
              ((bb) this).a(param2, 96, param0, param1);
              if (((bb) this).field_G) {
                StringBuilder discarded$8 = param0.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (!((bb) this).field_D) {
              StringBuilder discarded$9 = param0.append(" disabled");
              return param0;
            } else {
              return param0;
            }
          } else {
            return param0;
          }
        } else {
          ((bb) this).field_D = true;
          if (((bb) this).a(param1, 95, param0, param2)) {
            L1: {
              ((bb) this).a(param2, 96, param0, param1);
              if (((bb) this).field_G) {
                StringBuilder discarded$10 = param0.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (((bb) this).field_D) {
              return param0;
            } else {
              StringBuilder discarded$11 = param0.append(" disabled");
              return param0;
            }
          } else {
            return param0;
          }
        }
    }

    bb(String param0, ch param1, kd param2) {
        super(param0, param1, param2);
        ((bb) this).field_D = true;
        ((bb) this).field_B = true;
        ((bb) this).field_F = false;
    }

    boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        if (param1) {
          if (((bb) this).field_D) {
            if (((bb) this).b(param0, param6, 0, param4, param2)) {
              boolean discarded$2 = ((bb) this).a(param3, -117);
              ((bb) this).field_v = param5;
              if (null != ((bb) this).field_s) {
                if (!(((bb) this).field_s instanceof dg)) {
                  return true;
                } else {
                  ((dg) (Object) ((bb) this).field_s).a(param2, (bb) this, param5, param4, 769, param0, param6);
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
          return false;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (((bb) this).field_s != null) {
          if (((bb) this).field_s instanceof da) {
            ((da) (Object) ((bb) this).field_s).a(param0, param2, param3, 248, (bb) this);
            if (param1 != 84) {
              ((bb) this).field_B = true;
              return;
            } else {
              return;
            }
          } else {
            if (param1 != 84) {
              ((bb) this).field_B = true;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != 84) {
            ((bb) this).field_B = true;
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        if (param3 <= -85) {
          L0: {
            super.a(param0, param1, param2, (byte) -94);
            if (-1 == (((bb) this).field_v ^ -1)) {
              break L0;
            } else {
              if (((bb) this).field_v != kc.field_f) {
                if (!((bb) this).b(param0, param1, 0, ag.field_f, kc.field_b)) {
                  ((bb) this).a((byte) 5, param2, param1, ag.field_f, kc.field_b, param0);
                  return;
                } else {
                  if (-1 == (kc.field_f ^ -1)) {
                    ((bb) this).a(kc.field_b + -param0, 84, -param1 + ag.field_f, ((bb) this).field_v);
                    ((bb) this).a((byte) 5, param2, param1, ag.field_f, kc.field_b, param0);
                    break L0;
                  } else {
                    ((bb) this).a((byte) 5, param2, param1, ag.field_f, kc.field_b, param0);
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, qa param2, char param3) {
        if (param0 == -2) {
          if (((bb) this).e(param0)) {
            if (84 != param1) {
              if (-84 != param1) {
                return false;
              } else {
                ((bb) this).a(-1, 84, -1, 1);
                return true;
              }
            } else {
              ((bb) this).a(-1, 84, -1, 1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    bb(String param0, kd param1) {
        this(param0, nf.field_M.field_p, param1);
    }

    boolean a(qa param0, int param1) {
        if (((bb) this).field_D) {
          if (((bb) this).field_B) {
            L0: {
              param0.f(-1);
              ((bb) this).field_F = true;
              if (((bb) this).field_s == null) {
                break L0;
              } else {
                if (((bb) this).field_s instanceof p) {
                  ((p) (Object) ((bb) this).field_s).a((qa) this, ((bb) this).field_F, (byte) -31);
                  break L0;
                } else {
                  if (param1 >= -26) {
                    ((bb) this).field_D = true;
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param1 >= -26) {
              ((bb) this).field_D = true;
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

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        Object var8 = null;
        if (param0 == 5) {
          if (((bb) this).field_s != null) {
            if (!(((bb) this).field_s instanceof dg)) {
              ((bb) this).field_v = 0;
              return;
            } else {
              ((dg) (Object) ((bb) this).field_s).a(param2, param5, true, (bb) this, param4, param3);
              ((bb) this).field_v = 0;
              return;
            }
          } else {
            ((bb) this).field_v = 0;
            return;
          }
        } else {
          var8 = null;
          boolean discarded$1 = ((bb) this).a((qa) null, 66);
          if (((bb) this).field_s == null) {
            ((bb) this).field_v = 0;
            return;
          } else {
            L0: {
              if (((bb) this).field_s instanceof dg) {
                ((dg) (Object) ((bb) this).field_s).a(param2, param5, true, (bb) this, param4, param3);
                break L0;
              } else {
                break L0;
              }
            }
            ((bb) this).field_v = 0;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_I = null;
        if (param0 != -1) {
          field_J = null;
          field_A = null;
          field_J = null;
          return;
        } else {
          field_A = null;
          field_J = null;
          return;
        }
    }

    final void f(int param0) {
        if (((bb) this).field_F) {
          ((bb) this).field_F = false;
          if (((bb) this).field_s != null) {
            if (((bb) this).field_s instanceof p) {
              ((p) (Object) ((bb) this).field_s).a((qa) this, ((bb) this).field_F, (byte) -31);
              if (param0 != -1) {
                field_A = null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != -1) {
                field_A = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -1) {
              field_A = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -1) {
            field_A = null;
            return;
          } else {
            return;
          }
        }
    }

    final boolean e(int param0) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          boolean discarded$2 = ((bb) this).a(-92, -95, (qa) null, '');
          return ((bb) this).field_F;
        } else {
          return ((bb) this).field_F;
        }
    }

    protected bb() {
        ((bb) this).field_D = true;
        ((bb) this).field_B = true;
        ((bb) this).field_F = false;
        ((bb) this).field_p = nf.field_M.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Show help";
        field_J = "Player names can be up to 12 letters, numbers and underscores";
        field_I = "Next";
    }
}
