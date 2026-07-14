/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lg extends gm {
    static java.applet.Applet field_B;
    private boolean field_y;
    boolean field_x;
    boolean field_A;
    private boolean field_z;

    boolean a(int param0, gm param1, char param2, int param3) {
        int var5 = 0;
        if (((lg) this).g(2)) {
          if (param0 != -85) {
            if (-84 == param0) {
              ((lg) this).a(1, -1, -1, -1);
              return true;
            } else {
              var5 = 124 / ((-33 - param3) / 57);
              return false;
            }
          } else {
            ((lg) this).a(1, -1, -1, -1);
            return true;
          }
        } else {
          var5 = 124 / ((-33 - param3) / 57);
          return false;
        }
    }

    final boolean g(int param0) {
        if (param0 != 2) {
            boolean discarded$0 = ((lg) this).g(63);
            return ((lg) this).field_z;
        }
        return ((lg) this).field_z;
    }

    final void c(byte param0) {
        if (((lg) this).field_z) {
          ((lg) this).field_z = false;
          if (null != ((lg) this).field_t) {
            if (!(((lg) this).field_t instanceof ek)) {
              if (param0 < 89) {
                ((lg) this).c((byte) 22);
                return;
              } else {
                return;
              }
            } else {
              ((ek) (Object) ((lg) this).field_t).a(14381, ((lg) this).field_z, (gm) this);
              if (param0 < 89) {
                ((lg) this).c((byte) 22);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 < 89) {
              ((lg) this).c((byte) 22);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 < 89) {
            ((lg) this).c((byte) 22);
            return;
          } else {
            return;
          }
        }
    }

    lg(String param0, ca param1) {
        this(param0, ah.field_c.field_k, param1);
    }

    lg(String param0, el param1, ca param2) {
        super(param0, param1, param2);
        ((lg) this).field_y = true;
        ((lg) this).field_z = false;
        ((lg) this).field_x = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        if (param2 == -1) {
          if (null != ((lg) this).field_t) {
            if (!(((lg) this).field_t instanceof ng)) {
              return;
            } else {
              ((ng) (Object) ((lg) this).field_t).a((byte) -116, (lg) this, param0, param1, param3);
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          StringBuilder discarded$5 = ((lg) this).a((StringBuilder) null, (byte) -119, (Hashtable) null, -87);
          if (null == ((lg) this).field_t) {
            return;
          } else {
            L0: {
              if (((lg) this).field_t instanceof ng) {
                ((ng) (Object) ((lg) this).field_t).a((byte) -116, (lg) this, param0, param1, param3);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    boolean a(gm param0, boolean param1) {
        Object var4 = null;
        if (((lg) this).field_x) {
          if (((lg) this).field_y) {
            param0.c((byte) 91);
            ((lg) this).field_z = true;
            if (null != ((lg) this).field_t) {
              if (((lg) this).field_t instanceof ek) {
                ((ek) (Object) ((lg) this).field_t).a(14381, ((lg) this).field_z, (gm) this);
                if (param1) {
                  var4 = null;
                  ((lg) this).a(93, 79, 114, (byte) -114, (gm) null, -45);
                  return true;
                } else {
                  return true;
                }
              } else {
                if (param1) {
                  var4 = null;
                  ((lg) this).a(93, 79, 114, (byte) -114, (gm) null, -45);
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              if (param1) {
                var4 = null;
                ((lg) this).a(93, 79, 114, (byte) -114, (gm) null, -45);
                return true;
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

    final void a(int param0, int param1, int param2, byte param3, gm param4, int param5) {
        Object var8 = null;
        if (((lg) this).field_t != null) {
          if (((lg) this).field_t instanceof ck) {
            ((ck) (Object) ((lg) this).field_t).a(param1, (lg) this, param2, param5, param0, -710);
            if (param3 < 109) {
              var8 = null;
              boolean discarded$3 = ((lg) this).a((gm) null, true);
              ((lg) this).field_l = 0;
              return;
            } else {
              ((lg) this).field_l = 0;
              return;
            }
          } else {
            if (param3 < 109) {
              var8 = null;
              boolean discarded$4 = ((lg) this).a((gm) null, true);
              ((lg) this).field_l = 0;
              return;
            } else {
              ((lg) this).field_l = 0;
              return;
            }
          }
        } else {
          if (param3 < 109) {
            var8 = null;
            boolean discarded$5 = ((lg) this).a((gm) null, true);
            ((lg) this).field_l = 0;
            return;
          } else {
            ((lg) this).field_l = 0;
            return;
          }
        }
    }

    final static void h(int param0) {
        if (op.field_i == 10) {
          gq.a(114);
          op.field_i = 11;
          mh.field_g = true;
          if (param0 < -98) {
            return;
          } else {
            field_B = null;
            return;
          }
        } else {
          if (s.h((byte) 124)) {
            mh.field_g = true;
            if (param0 >= -98) {
              field_B = null;
              return;
            } else {
              return;
            }
          } else {
            gq.a(114);
            op.field_i = 11;
            mh.field_g = true;
            if (param0 < -98) {
              return;
            } else {
              field_B = null;
              return;
            }
          }
        }
    }

    void a(int param0, gm param1, int param2, int param3) {
        super.a(120, param1, param2, param3);
        int var5 = 5 % ((param0 - -28) / 43);
        if (((lg) this).field_l == 0) {
            return;
        }
        if (((lg) this).field_l == ul.field_d) {
            return;
        }
        if (!((lg) this).a(k.field_e, n.field_t, param3, param2, 119)) {
            ((lg) this).a(param2, param3, n.field_t, (byte) 120, param1, k.field_e);
            return;
        }
        if (-1 != (ul.field_d ^ -1)) {
            ((lg) this).a(param2, param3, n.field_t, (byte) 120, param1, k.field_e);
            return;
        }
        ((lg) this).a(((lg) this).field_l, -param2 + k.field_e, -1, n.field_t - param3);
        ((lg) this).a(param2, param3, n.field_t, (byte) 120, param1, k.field_e);
    }

    public static void i(int param0) {
        field_B = null;
        if (param0 < 2) {
            field_B = null;
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        if (!((lg) this).field_x) {
          if (param6 <= 5) {
            ((lg) this).field_A = false;
            return false;
          } else {
            return false;
          }
        } else {
          if (((lg) this).a(param3, param4, param1, param2, 81)) {
            boolean discarded$2 = ((lg) this).a(param5, false);
            ((lg) this).field_l = param0;
            if (null != ((lg) this).field_t) {
              if (((lg) this).field_t instanceof ck) {
                ((ck) (Object) ((lg) this).field_t).a(param0, param4, param3, param2, (lg) this, -78, param1);
                return true;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param6 > 5) {
              return false;
            } else {
              ((lg) this).field_A = false;
              return false;
            }
          }
        }
    }

    final static bp a(String param0, int param1) {
        if (param0 == null) {
            return rh.field_c;
        }
        if (param0.length() == 0) {
            return rh.field_c;
        }
        int var2 = param0.indexOf('@');
        if (-1 == var2) {
            return oj.field_l;
        }
        String var3 = param0.substring(0, var2);
        String var4 = param0.substring(1 + var2);
        int var5 = 15 / ((param1 - 64) / 33);
        bp var6 = ka.a(var3, (byte) -10);
        if (!(var6 == null)) {
            return var6;
        }
        return fi.a((byte) -97, var4);
    }

    final StringBuilder a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        if (param1 == 117) {
          if (((lg) this).a(-31866, param0, param2, param3)) {
            L0: {
              ((lg) this).a(param0, param3, true, param2);
              if (((lg) this).field_A) {
                StringBuilder discarded$8 = param0.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (!((lg) this).field_x) {
              StringBuilder discarded$9 = param0.append(" disabled");
              return param0;
            } else {
              return param0;
            }
          } else {
            return param0;
          }
        } else {
          ((lg) this).field_y = false;
          if (((lg) this).a(-31866, param0, param2, param3)) {
            L1: {
              ((lg) this).a(param0, param3, true, param2);
              if (((lg) this).field_A) {
                StringBuilder discarded$10 = param0.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (((lg) this).field_x) {
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

    protected lg() {
        ((lg) this).field_y = true;
        ((lg) this).field_z = false;
        ((lg) this).field_x = true;
        ((lg) this).field_q = ah.field_c.field_a;
    }

    static {
    }
}
