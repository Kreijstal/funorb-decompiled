/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class an extends ga {
    static dj field_B;
    private boolean field_A;
    static String field_y;
    boolean field_x;
    int field_z;
    private boolean field_D;
    boolean field_C;

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        Object var8 = null;
        if (param1 > 1) {
          if (null != ((an) this).field_v) {
            if (!(((an) this).field_v instanceof pe)) {
              ((an) this).field_m = 0;
              return;
            } else {
              ((pe) (Object) ((an) this).field_v).a(param0, param2, param4, param3, (an) this, (byte) -121);
              ((an) this).field_m = 0;
              return;
            }
          } else {
            ((an) this).field_m = 0;
            return;
          }
        } else {
          var8 = null;
          ((an) this).a((ga) null, (byte) -127, 26, -100);
          if (null == ((an) this).field_v) {
            ((an) this).field_m = 0;
            return;
          } else {
            L0: {
              if (((an) this).field_v instanceof pe) {
                ((pe) (Object) ((an) this).field_v).a(param0, param2, param4, param3, (an) this, (byte) -121);
                break L0;
              } else {
                break L0;
              }
            }
            ((an) this).field_m = 0;
            return;
          }
        }
    }

    void a(ga param0, byte param1, int param2, int param3) {
        int var5 = 0;
        super.a(param0, (byte) 104, param2, param3);
        ((an) this).field_z = 0;
        var5 = -49 % ((param1 - 46) / 42);
        if (((an) this).field_m != 0) {
          if (((an) this).field_m != kc.field_R) {
            if (!((an) this).b(ei.field_K, 21224, param2, param3, ha.field_b)) {
              ((an) this).a(param3, 25, ha.field_b, ei.field_K, param2, param0);
              return;
            } else {
              if (kc.field_R == 0) {
                ((an) this).b(-param3 + ha.field_b, 103, -param2 + ei.field_K, ((an) this).field_m);
                ((an) this).a(param3, 25, ha.field_b, ei.field_K, param2, param0);
                return;
              } else {
                ((an) this).a(param3, 25, ha.field_b, ei.field_K, param2, param0);
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

    public static void f(int param0) {
        field_y = null;
        field_B = null;
        if (param0 >= -110) {
            an.f(114);
        }
    }

    an(String param0, sk param1) {
        this(param0, se.field_j.field_a, param1);
    }

    final boolean e(int param0) {
        if (param0 != -17741) {
            return false;
        }
        return ((an) this).field_A;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        if (((an) this).field_C) {
          if (((an) this).b(param3, 21224, param2, param4, param0)) {
            boolean discarded$2 = ((an) this).a((byte) 107, param6);
            ((an) this).field_m = param5;
            if (null != ((an) this).field_v) {
              if (!(((an) this).field_v instanceof pe)) {
                return true;
              } else {
                ((pe) (Object) ((an) this).field_v).a(false, param2, (an) this, param0, param4, param5, param3);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param1 != 1) {
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param1 != 1) {
            return false;
          } else {
            return false;
          }
        }
    }

    final static vn[] a(int param0, int param1, int param2, dj param3) {
        if (param2 <= 118) {
            return null;
        }
        if (!ph.a(param0, 31043, param1, param3)) {
            return null;
        }
        return dn.f((byte) 43);
    }

    an(String param0, io param1, sk param2) {
        super(param0, param1, param2);
        ((an) this).field_A = false;
        ((an) this).field_z = 0;
        ((an) this).field_D = true;
        ((an) this).field_C = true;
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        var5 = -108 % ((-83 - param0) / 32);
        if (((an) this).e(-17741)) {
          if ((param1 ^ -1) != -85) {
            if (param1 != 83) {
              return false;
            } else {
              ((an) this).b(-1, -113, -1, 1);
              return true;
            }
          } else {
            ((an) this).b(-1, -113, -1, 1);
            return true;
          }
        } else {
          return false;
        }
    }

    boolean a(byte param0, ga param1) {
        if (((an) this).field_C) {
          if (((an) this).field_D) {
            param1.c((byte) 57);
            if (param0 > 67) {
              ((an) this).field_A = true;
              if (((an) this).field_v != null) {
                if (!(((an) this).field_v instanceof ef)) {
                  return true;
                } else {
                  ((ef) (Object) ((an) this).field_v).a(((an) this).field_A, (ga) this, (byte) 15);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((an) this).field_A = false;
              ((an) this).field_A = true;
              if (((an) this).field_v != null) {
                if (!(((an) this).field_v instanceof ef)) {
                  return true;
                } else {
                  ((ef) (Object) ((an) this).field_v).a(((an) this).field_A, (ga) this, (byte) 15);
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

    final static void a(int param0, ec param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        if (param1.field_x == null) {
          return;
        } else {
          var3_int = param0;
          L0: while (true) {
            L1: {
              if (-51 >= (var3_int ^ -1)) {
                break L1;
              } else {
                if (null == param1.field_x.peekEvent()) {
                  break L1;
                } else {
                  ld.a(1L, (byte) 71);
                  var3_int++;
                  continue L0;
                }
              }
            }
            try {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  param1.field_x.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                  break L2;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        }
    }

    final void c(byte param0) {
        Object var3 = null;
        if (((an) this).field_A) {
          ((an) this).field_A = false;
          if (((an) this).field_v != null) {
            if (!(((an) this).field_v instanceof ef)) {
              if (param0 != 57) {
                var3 = null;
                vn[] discarded$8 = an.a(-59, -128, -24, (dj) null);
                return;
              } else {
                return;
              }
            } else {
              ((ef) (Object) ((an) this).field_v).a(((an) this).field_A, (ga) this, (byte) 15);
              if (param0 != 57) {
                var3 = null;
                vn[] discarded$9 = an.a(-59, -128, -24, (dj) null);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 57) {
              var3 = null;
              vn[] discarded$10 = an.a(-59, -128, -24, (dj) null);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 57) {
            var3 = null;
            vn[] discarded$11 = an.a(-59, -128, -24, (dj) null);
            return;
          } else {
            return;
          }
        }
    }

    an(int param0, int param1, int param2, int param3, io param4, sk param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((an) this).field_A = false;
        ((an) this).field_z = 0;
        ((an) this).field_D = true;
        ((an) this).field_C = true;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, boolean param2, int param3) {
        if (param2) {
          if (((an) this).a(param0, param1, 11098, param3)) {
            L0: {
              ((an) this).a(param0, param3, 123, param1);
              if (((an) this).field_x) {
                StringBuilder discarded$4 = param1.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (((an) this).field_C) {
              return param1;
            } else {
              StringBuilder discarded$5 = param1.append(" disabled");
              return param1;
            }
          } else {
            return param1;
          }
        } else {
          return null;
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ((an) this).field_z = param3;
        if (null != ((an) this).field_v) {
          if (!(((an) this).field_v instanceof hh)) {
            var5 = -25 / ((-12 - param1) / 56);
            return;
          } else {
            ((hh) (Object) ((an) this).field_v).a(param2, -6, (an) this, param3, param0);
            var5 = -25 / ((-12 - param1) / 56);
            return;
          }
        } else {
          var5 = -25 / ((-12 - param1) / 56);
          return;
        }
    }

    public an() {
        ((an) this).field_A = false;
        ((an) this).field_z = 0;
        ((an) this).field_D = true;
        ((an) this).field_C = true;
        ((an) this).field_h = se.field_j.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "FROM ONLY";
    }
}
