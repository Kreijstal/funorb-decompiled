/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class htb extends shb {
    static llb field_w;
    boolean field_x;
    private boolean field_t;
    static gj field_A;
    int field_z;
    private boolean field_y;
    static String field_v;
    boolean field_u;

    boolean a(int param0, shb param1) {
        if (((htb) this).field_x) {
          if (((htb) this).field_y) {
            param1.f((byte) -34);
            ((htb) this).field_t = true;
            if (param0 == 0) {
              if (((htb) this).field_l != null) {
                if (!(((htb) this).field_l instanceof dta)) {
                  return true;
                } else {
                  ((dta) (Object) ((htb) this).field_l).a(((htb) this).field_t, (shb) this, true);
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

    htb(String param0, sba param1) {
        this(param0, msa.field_s.field_a, param1);
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        int var7 = 0;
        if (((htb) this).field_l != null) {
          if (!(((htb) this).field_l instanceof sgb)) {
            ((htb) this).field_n = 0;
            var7 = -114 / ((52 - param0) / 52);
            return;
          } else {
            ((sgb) (Object) ((htb) this).field_l).a((byte) -127, (htb) this, param1, param3, param5, param2);
            ((htb) this).field_n = 0;
            var7 = -114 / ((52 - param0) / 52);
            return;
          }
        } else {
          ((htb) this).field_n = 0;
          var7 = -114 / ((52 - param0) / 52);
          return;
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        if (param0 == -15834) {
          if (((htb) this).e((byte) -120)) {
            if (84 != param1) {
              if (83 != param1) {
                return false;
              } else {
                ((htb) this).c(1, -1, 23015, -1);
                return true;
              }
            } else {
              ((htb) this).c(1, -1, 23015, -1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((htb) this).field_t = false;
          if (((htb) this).e((byte) -120)) {
            if (84 != param1) {
              if (83 != param1) {
                return false;
              } else {
                ((htb) this).c(1, -1, 23015, -1);
                return true;
              }
            } else {
              ((htb) this).c(1, -1, 23015, -1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        Object var9 = null;
        if (!((htb) this).field_x) {
          if (param6 > -17) {
            var9 = null;
            boolean discarded$3 = ((htb) this).a(-66, (shb) null);
            return false;
          } else {
            return false;
          }
        } else {
          if (((htb) this).a(param2, param1, param0, param5, (byte) 22)) {
            boolean discarded$4 = ((htb) this).a(0, param4);
            ((htb) this).field_n = param3;
            if (null != ((htb) this).field_l) {
              if (!(((htb) this).field_l instanceof sgb)) {
                return true;
              } else {
                ((sgb) (Object) ((htb) this).field_l).a(18095, (htb) this, param5, param3, param2, param1, param0);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param6 <= -17) {
              return false;
            } else {
              var9 = null;
              boolean discarded$5 = ((htb) this).a(-66, (shb) null);
              return false;
            }
          }
        }
    }

    final boolean e(byte param0) {
        if (param0 != -120) {
            return true;
        }
        return ((htb) this).field_t;
    }

    public static void d(int param0) {
        field_w = null;
        field_A = null;
        field_v = null;
        int var1 = 31 / ((48 - param0) / 43);
    }

    htb(String param0, wwa param1, sba param2) {
        super(param0, param1, param2);
        ((htb) this).field_x = true;
        ((htb) this).field_y = true;
        ((htb) this).field_t = false;
        ((htb) this).field_z = 0;
    }

    htb(int param0, int param1, int param2, int param3, wwa param4, sba param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((htb) this).field_x = true;
        ((htb) this).field_y = true;
        ((htb) this).field_t = false;
        ((htb) this).field_z = 0;
    }

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        L0: {
          if (!((htb) this).a(param1, param2, (byte) 116, param3)) {
            break L0;
          } else {
            L1: {
              ((htb) this).a(111, param2, param1, param3);
              if (((htb) this).field_u) {
                StringBuilder discarded$4 = param3.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (!((htb) this).field_x) {
              StringBuilder discarded$5 = param3.append(" disabled");
              break L0;
            } else {
              if (param0) {
                return null;
              } else {
                return param3;
              }
            }
          }
        }
        if (param0) {
          return null;
        } else {
          return param3;
        }
    }

    final void f(byte param0) {
        if (((htb) this).field_t) {
          ((htb) this).field_t = false;
          if (((htb) this).field_l != null) {
            if (!(((htb) this).field_l instanceof dta)) {
              if (param0 != -34) {
                ((htb) this).field_t = true;
                return;
              } else {
                return;
              }
            } else {
              ((dta) (Object) ((htb) this).field_l).a(((htb) this).field_t, (shb) this, true);
              if (param0 != -34) {
                ((htb) this).field_t = true;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -34) {
              ((htb) this).field_t = true;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -34) {
            ((htb) this).field_t = true;
            return;
          } else {
            return;
          }
        }
    }

    void c(int param0, int param1, int param2, int param3) {
        if (param2 == 23015) {
          ((htb) this).field_z = param0;
          if (null != ((htb) this).field_l) {
            if (!(((htb) this).field_l instanceof oo)) {
              return;
            } else {
              ((oo) (Object) ((htb) this).field_l).a(11, param0, param1, (htb) this, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          field_v = null;
          ((htb) this).field_z = param0;
          if (null != ((htb) this).field_l) {
            if (!(((htb) this).field_l instanceof oo)) {
              return;
            } else {
              ((oo) (Object) ((htb) this).field_l).a(11, param0, param1, (htb) this, param3);
              return;
            }
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        super.a(param0, param1, param2, param3);
        ((htb) this).field_z = 0;
        if (((htb) this).field_n == 0) {
            return;
        }
        if (hu.field_b == ((htb) this).field_n) {
            return;
        }
        if (!((htb) this).a(uia.field_b, param1, kc.field_b, param0, (byte) 22)) {
            ((htb) this).a((byte) -106, param1, uia.field_b, param0, param3, kc.field_b);
            return;
        }
        if (hu.field_b != 0) {
            ((htb) this).a((byte) -106, param1, uia.field_b, param0, param3, kc.field_b);
            return;
        }
        ((htb) this).c(((htb) this).field_n, -param1 + kc.field_b, 23015, uia.field_b + -param0);
        ((htb) this).a((byte) -106, param1, uia.field_b, param0, param3, kc.field_b);
    }

    public htb() {
        ((htb) this).field_x = true;
        ((htb) this).field_y = true;
        ((htb) this).field_t = false;
        ((htb) this).field_z = 0;
        ((htb) this).field_q = msa.field_s.field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "s";
        field_A = new gj();
    }
}
