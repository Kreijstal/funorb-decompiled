/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fb extends mf {
    boolean field_I;
    private boolean field_J;
    static String field_F;
    private boolean field_E;
    static String field_D;
    static jc field_L;
    boolean field_H;
    static String field_G;
    static int field_K;

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        if (null != ((fb) this).field_p) {
          if (!(((fb) this).field_p instanceof te)) {
            ((fb) this).field_q = param4;
            return;
          } else {
            ((te) (Object) ((fb) this).field_p).a((fb) this, param0, param5, 8563, param3, param2);
            ((fb) this).field_q = param4;
            return;
          }
        } else {
          ((fb) this).field_q = param4;
          return;
        }
    }

    void a(int param0, int param1, mf param2, int param3) {
        super.a(param0, -91, param2, param3);
        if (-1 != (((fb) this).field_q ^ -1)) {
          if (wh.field_f != ((fb) this).field_q) {
            if (!((fb) this).a(rf.field_b, param3, param0, (byte) -117, hn.field_k)) {
              ((fb) this).a(rf.field_b, param2, param0, hn.field_k, 0, param3);
              if (param1 >= -6) {
                ((fb) this).field_H = false;
                return;
              } else {
                return;
              }
            } else {
              if (-1 != (wh.field_f ^ -1)) {
                ((fb) this).a(rf.field_b, param2, param0, hn.field_k, 0, param3);
                if (param1 >= -6) {
                  ((fb) this).field_H = false;
                  return;
                } else {
                  return;
                }
              } else {
                ((fb) this).a(-param3 + rf.field_b, false, ((fb) this).field_q, -param0 + hn.field_k);
                ((fb) this).a(rf.field_b, param2, param0, hn.field_k, 0, param3);
                if (param1 >= -6) {
                  ((fb) this).field_H = false;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param1 >= -6) {
              ((fb) this).field_H = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 >= -6) {
            ((fb) this).field_H = false;
            return;
          } else {
            return;
          }
        }
    }

    boolean a(char param0, int param1, int param2, mf param3) {
        if (!((fb) this).d((byte) -67)) {
          if (param2 != -1) {
            return false;
          } else {
            return false;
          }
        } else {
          if (84 != param1) {
            if ((param1 ^ -1) != -84) {
              if (param2 != -1) {
                return false;
              } else {
                return false;
              }
            } else {
              ((fb) this).a(-1, false, 1, -1);
              return true;
            }
          } else {
            ((fb) this).a(-1, false, 1, -1);
            return true;
          }
        }
    }

    public static void h(int param0) {
        field_F = null;
        field_L = null;
        field_D = null;
        field_G = null;
        if (param0 != -1) {
            fb.h(-5);
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        if (param3 == 1) {
          if (((fb) this).a(param1, param0, param2, -119)) {
            L0: {
              ((fb) this).a(param0, param2, param1, false);
              if (((fb) this).field_I) {
                StringBuilder discarded$8 = param2.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (!((fb) this).field_H) {
              StringBuilder discarded$9 = param2.append(" disabled");
              return param2;
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          field_K = 55;
          if (((fb) this).a(param1, param0, param2, -119)) {
            L1: {
              ((fb) this).a(param0, param2, param1, false);
              if (((fb) this).field_I) {
                StringBuilder discarded$10 = param2.append(" active");
                break L1;
              } else {
                break L1;
              }
            }
            if (((fb) this).field_H) {
              return param2;
            } else {
              StringBuilder discarded$11 = param2.append(" disabled");
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    final boolean d(byte param0) {
        if (param0 != -67) {
            field_G = null;
            return ((fb) this).field_J;
        }
        return ((fb) this).field_J;
    }

    final void d(int param0) {
        int var2 = 0;
        if (((fb) this).field_J) {
          ((fb) this).field_J = false;
          if (null != ((fb) this).field_p) {
            if (((fb) this).field_p instanceof sd) {
              ((sd) (Object) ((fb) this).field_p).a((mf) this, ((fb) this).field_J, (byte) 34);
              var2 = 42 % ((34 - param0) / 57);
              return;
            } else {
              var2 = 42 % ((34 - param0) / 57);
              return;
            }
          } else {
            var2 = 42 % ((34 - param0) / 57);
            return;
          }
        } else {
          var2 = 42 % ((34 - param0) / 57);
          return;
        }
    }

    fb(String param0, rg param1) {
        this(param0, a.field_a.field_a, param1);
    }

    fb(String param0, jm param1, rg param2) {
        super(param0, param1, param2);
        ((fb) this).field_J = false;
        ((fb) this).field_H = true;
        ((fb) this).field_E = true;
    }

    boolean a(int param0, int param1, int param2, byte param3, mf param4, int param5, int param6) {
        Object var9 = null;
        if (param3 == 88) {
          if (((fb) this).field_H) {
            if (((fb) this).a(param2, param5, param6, (byte) -117, param1)) {
              boolean discarded$3 = ((fb) this).a(0, param4);
              ((fb) this).field_q = param0;
              if (null != ((fb) this).field_p) {
                if (!(((fb) this).field_p instanceof te)) {
                  return true;
                } else {
                  ((te) (Object) ((fb) this).field_p).a(param0, param2, param5, (byte) -79, param6, (fb) this, param1);
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
          var9 = null;
          boolean discarded$4 = ((fb) this).a(-48, (mf) null);
          if (((fb) this).field_H) {
            if (((fb) this).a(param2, param5, param6, (byte) -117, param1)) {
              boolean discarded$5 = ((fb) this).a(0, param4);
              ((fb) this).field_q = param0;
              if (null != ((fb) this).field_p) {
                if (!(((fb) this).field_p instanceof te)) {
                  return true;
                } else {
                  ((te) (Object) ((fb) this).field_p).a(param0, param2, param5, (byte) -79, param6, (fb) this, param1);
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

    boolean a(int param0, mf param1) {
        if (((fb) this).field_H) {
          if (((fb) this).field_E) {
            if (param0 == 0) {
              param1.d(param0 + 91);
              ((fb) this).field_J = true;
              if (((fb) this).field_p != null) {
                if (!(((fb) this).field_p instanceof sd)) {
                  return true;
                } else {
                  ((sd) (Object) ((fb) this).field_p).a((mf) this, ((fb) this).field_J, (byte) 34);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              field_D = null;
              param1.d(param0 + 91);
              ((fb) this).field_J = true;
              if (((fb) this).field_p != null) {
                if (!(((fb) this).field_p instanceof sd)) {
                  return true;
                } else {
                  ((sd) (Object) ((fb) this).field_p).a((mf) this, ((fb) this).field_J, (byte) 34);
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

    void a(int param0, boolean param1, int param2, int param3) {
        L0: {
          if (null == ((fb) this).field_p) {
            break L0;
          } else {
            if (((fb) this).field_p instanceof mj) {
              ((mj) (Object) ((fb) this).field_p).a((fb) this, param2, param0, param3, -24221);
              break L0;
            } else {
              if (!param1) {
                return;
              } else {
                ((fb) this).d(-101);
                return;
              }
            }
          }
        }
        if (param1) {
          ((fb) this).d(-101);
          return;
        } else {
          return;
        }
    }

    protected fb() {
        ((fb) this).field_J = false;
        ((fb) this).field_H = true;
        ((fb) this).field_E = true;
        ((fb) this).field_n = a.field_a.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "<%0>'s game";
        field_F = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_G = "Seriously offensive language";
        field_L = new jc();
        field_K = 0;
    }
}
