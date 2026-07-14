/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rh extends al {
    static boolean field_F;
    private boolean field_D;
    boolean field_G;
    private boolean field_C;
    boolean field_B;
    static String field_E;
    static String field_H;

    final boolean h(int param0) {
        if (param0 > -83) {
            ((rh) this).field_C = true;
            return ((rh) this).field_D;
        }
        return ((rh) this).field_D;
    }

    boolean a(byte param0, char param1, al param2, int param3) {
        int var5 = 0;
        if (((rh) this).h(-87)) {
          if (84 != param3) {
            if (-84 == (param3 ^ -1)) {
              ((rh) this).b(-1, -1, 0, 1);
              return true;
            } else {
              var5 = 38 / ((17 - param0) / 51);
              return false;
            }
          } else {
            ((rh) this).b(-1, -1, 0, 1);
            return true;
          }
        } else {
          var5 = 38 / ((17 - param0) / 51);
          return false;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
          if (((rh) this).field_l != null) {
            if (!(((rh) this).field_l instanceof m)) {
              return;
            } else {
              ((m) (Object) ((rh) this).field_l).a((rh) this, param3, param0, param1, -27322);
              return;
            }
          } else {
            return;
          }
        } else {
          ((rh) this).field_D = false;
          if (((rh) this).field_l == null) {
            return;
          } else {
            L0: {
              if (((rh) this).field_l instanceof m) {
                ((m) (Object) ((rh) this).field_l).a((rh) this, param3, param0, param1, -27322);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    rh(String param0, t param1, tg param2) {
        super(param0, param1, param2);
        ((rh) this).field_D = false;
        ((rh) this).field_C = true;
        ((rh) this).field_B = true;
    }

    boolean a(byte param0, al param1) {
        Object var4 = null;
        if (((rh) this).field_B) {
          if (((rh) this).field_C) {
            param1.f(-24174);
            ((rh) this).field_D = true;
            if (param0 <= -104) {
              if (((rh) this).field_l != null) {
                if (!(((rh) this).field_l instanceof ah)) {
                  return true;
                } else {
                  ((ah) (Object) ((rh) this).field_l).a(11477, (al) this, ((rh) this).field_D);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              var4 = null;
              boolean discarded$10 = ((rh) this).a((al) null, 111, -49, 100, -115, 115, 9);
              if (((rh) this).field_l != null) {
                if (!(((rh) this).field_l instanceof ah)) {
                  return true;
                } else {
                  ((ah) (Object) ((rh) this).field_l).a(11477, (al) this, ((rh) this).field_D);
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

    public static void i(int param0) {
        Object var2 = null;
        field_H = null;
        if (param0 >= -108) {
          var2 = null;
          boolean discarded$2 = rh.a(31, (String) null, (String) null);
          field_E = null;
          return;
        } else {
          field_E = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        CharSequence var3 = null;
        var2 = param0.getParameter("username");
        if (var2 != null) {
          var3 = (CharSequence) (Object) var2;
          if (0L == vh.a((byte) -84, var3)) {
            return;
          } else {
            L0: {
              if (param1 == 33) {
                break L0;
              } else {
                field_E = null;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        param1 = v.a('_', (byte) -31, "", param1);
        if (param0 == 19438) {
          var3 = rb.a(22479, param2);
          if (-1 == param1.indexOf(param2)) {
            if ((param1.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 == 0) {
          if (((rh) this).field_B) {
            if (((rh) this).a(param5, param6, param2, false, param1)) {
              boolean discarded$2 = ((rh) this).a((byte) -118, param0);
              ((rh) this).field_r = param3;
              if (((rh) this).field_l != null) {
                if (!(((rh) this).field_l instanceof gg)) {
                  return true;
                } else {
                  ((gg) (Object) ((rh) this).field_l).a(param2, param6, param5, param1, param3, -2278, (rh) this);
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

    final void f(int param0) {
        if (((rh) this).field_D) {
          ((rh) this).field_D = false;
          if (((rh) this).field_l != null) {
            if (((rh) this).field_l instanceof ah) {
              ((ah) (Object) ((rh) this).field_l).a(11477, (al) this, ((rh) this).field_D);
              if (param0 != -24174) {
                ((rh) this).field_D = false;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != -24174) {
                ((rh) this).field_D = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -24174) {
              ((rh) this).field_D = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -24174) {
            ((rh) this).field_D = false;
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, byte param2, al param3) {
        super.a(param0, param1, param2, param3);
        if (((rh) this).field_r != 0) {
          if (((rh) this).field_r != rj.field_a) {
            if (!((rh) this).a(param1, param0, kf.field_b, false, fg.field_a)) {
              ((rh) this).a(param3, false, fg.field_a, param0, kf.field_b, param1);
              return;
            } else {
              if (0 == rj.field_a) {
                ((rh) this).b(-param0 + fg.field_a, -param1 + kf.field_b, 0, ((rh) this).field_r);
                ((rh) this).a(param3, false, fg.field_a, param0, kf.field_b, param1);
                return;
              } else {
                ((rh) this).a(param3, false, fg.field_a, param0, kf.field_b, param1);
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

    final StringBuilder a(boolean param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!param0) {
          if (((rh) this).a((byte) 116, param3, param2, param1)) {
            ((rh) this).a(34, param2, param3, param1);
            if (!((rh) this).field_G) {
              if (((rh) this).field_B) {
                return param2;
              } else {
                StringBuilder discarded$25 = param2.append(" disabled");
                return param2;
              }
            } else {
              L0: {
                StringBuilder discarded$26 = param2.append(" active");
                if (!((rh) this).field_B) {
                  StringBuilder discarded$27 = param2.append(" disabled");
                  break L0;
                } else {
                  break L0;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          ((rh) this).field_G = true;
          if (((rh) this).a((byte) 116, param3, param2, param1)) {
            ((rh) this).a(34, param2, param3, param1);
            if (((rh) this).field_G) {
              StringBuilder discarded$28 = param2.append(" active");
              if (((rh) this).field_B) {
                return param2;
              } else {
                StringBuilder discarded$29 = param2.append(" disabled");
                return param2;
              }
            } else {
              L1: {
                if (!((rh) this).field_B) {
                  StringBuilder discarded$30 = param2.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    rh(String param0, tg param1) {
        this(param0, lb.field_O.field_h, param1);
    }

    final void a(al param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (!param1) {
          if (((rh) this).field_l != null) {
            if (!(((rh) this).field_l instanceof gg)) {
              ((rh) this).field_r = 0;
              return;
            } else {
              ((gg) (Object) ((rh) this).field_l).a(param3, param2, param5, (rh) this, param4, param1);
              ((rh) this).field_r = 0;
              return;
            }
          } else {
            ((rh) this).field_r = 0;
            return;
          }
        } else {
          return;
        }
    }

    protected rh() {
        ((rh) this).field_D = false;
        ((rh) this).field_C = true;
        ((rh) this).field_B = true;
        ((rh) this).field_y = lb.field_O.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = false;
        field_H = "Instructions";
        field_E = "Next Level";
    }
}
