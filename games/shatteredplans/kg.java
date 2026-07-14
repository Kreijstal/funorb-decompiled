/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kg extends vg {
    boolean field_z;
    private boolean field_A;
    private boolean field_B;
    static String field_C;
    boolean field_y;

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        int var5 = 0;
        var5 = 111 % ((64 - param0) / 61);
        if (((kg) this).a(false, param2, param3, param1)) {
          ((kg) this).a(param1, param2, false, param3);
          if (!((kg) this).field_z) {
            if (!((kg) this).field_y) {
              StringBuilder discarded$10 = param3.append(" disabled");
              return param3;
            } else {
              return param3;
            }
          } else {
            StringBuilder discarded$11 = param3.append(" active");
            if (((kg) this).field_y) {
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

    boolean a(byte param0, vg param1) {
        int var3 = 0;
        var3 = -88 / ((61 - param0) / 59);
        if (((kg) this).field_y) {
          if (((kg) this).field_B) {
            param1.e((byte) -122);
            ((kg) this).field_A = true;
            if (((kg) this).field_u != null) {
              if (!(((kg) this).field_u instanceof dj)) {
                return true;
              } else {
                ((dj) (Object) ((kg) this).field_u).a(10202, ((kg) this).field_A, (vg) this);
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

    final boolean f(int param0) {
        if (param0 != 1) {
            ((kg) this).field_y = false;
            return ((kg) this).field_A;
        }
        return ((kg) this).field_A;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        if (!((kg) this).field_y) {
          if (param2 < 95) {
            ((kg) this).field_A = false;
            return false;
          } else {
            return false;
          }
        } else {
          if (((kg) this).a(param1, 39, param3, param5, param4)) {
            boolean discarded$2 = ((kg) this).a((byte) 124, param6);
            ((kg) this).field_o = param0;
            if (null != ((kg) this).field_u) {
              if (((kg) this).field_u instanceof dr) {
                ((dr) (Object) ((kg) this).field_u).a((kg) this, param4, param3, param5, -237, param0, param1);
                return true;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param2 >= 95) {
              return false;
            } else {
              ((kg) this).field_A = false;
              return false;
            }
          }
        }
    }

    kg(String param0, iq param1, ko param2) {
        super(param0, param1, param2);
        ((kg) this).field_B = true;
        ((kg) this).field_A = false;
        ((kg) this).field_y = true;
    }

    kg(String param0, ko param1) {
        this(param0, qq.field_I.field_q, param1);
    }

    final void e(byte param0) {
        int var2 = 0;
        if (((kg) this).field_A) {
          ((kg) this).field_A = false;
          if (null != ((kg) this).field_u) {
            if (!(((kg) this).field_u instanceof dj)) {
              var2 = -38 % ((param0 - -84) / 33);
              return;
            } else {
              ((dj) (Object) ((kg) this).field_u).a(10202, ((kg) this).field_A, (vg) this);
              var2 = -38 % ((param0 - -84) / 33);
              return;
            }
          } else {
            var2 = -38 % ((param0 - -84) / 33);
            return;
          }
        } else {
          var2 = -38 % ((param0 - -84) / 33);
          return;
        }
    }

    final static void f(byte param0) {
        if (!(null == cb.field_h)) {
            cb.field_h.a(0);
        }
        if (param0 > -122) {
            field_C = null;
            return;
        }
    }

    final static void a(int param0, long param1, String param2) {
        CharSequence var5 = null;
        if (param0 >= -41) {
          return;
        } else {
          gi.field_a = param2;
          em.field_h = 2;
          var5 = (CharSequence) (Object) param2;
          nd.field_k = ji.a(var5, true);
          hd.field_k = param1;
          sr.field_h = true;
          return;
        }
    }

    void a(int param0, int param1, vg param2, byte param3) {
        super.a(param0, param1, param2, param3);
        if (((kg) this).field_o != 0) {
          if (rf.field_n != ((kg) this).field_o) {
            if (((kg) this).a(pd.field_k, 72, bb.field_b, param1, param0)) {
              if (rf.field_n == 0) {
                ((kg) this).a(((kg) this).field_o, pd.field_k - param0, -param1 + bb.field_b, (byte) -109);
                ((kg) this).a(pd.field_k, param1, param0, bb.field_b, -600269855, param2);
                return;
              } else {
                ((kg) this).a(pd.field_k, param1, param0, bb.field_b, -600269855, param2);
                return;
              }
            } else {
              ((kg) this).a(pd.field_k, param1, param0, bb.field_b, -600269855, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        if (param2 == 13) {
          if (((kg) this).f(1)) {
            if (param0 != 84) {
              if (param0 != 83) {
                return false;
              } else {
                ((kg) this).a(1, -1, -1, (byte) -109);
                return true;
              }
            } else {
              ((kg) this).a(1, -1, -1, (byte) -109);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    protected kg() {
        ((kg) this).field_B = true;
        ((kg) this).field_A = false;
        ((kg) this).field_y = true;
        ((kg) this).field_p = qq.field_I.field_o;
    }

    void a(int param0, int param1, int param2, byte param3) {
        if (((kg) this).field_u != null) {
          if (((kg) this).field_u instanceof bp) {
            ((bp) (Object) ((kg) this).field_u).a((kg) this, 6, param0, param2, param1);
            if (param3 != -109) {
              return;
            } else {
              return;
            }
          } else {
            if (param3 != -109) {
              return;
            } else {
              return;
            }
          }
        } else {
          if (param3 != -109) {
            return;
          } else {
            return;
          }
        }
    }

    public static void d(boolean param0) {
        field_C = null;
        if (!param0) {
            kg.f((byte) -56);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        if (param4 == -600269855) {
          if (((kg) this).field_u != null) {
            if (!(((kg) this).field_u instanceof dr)) {
              ((kg) this).field_o = 0;
              return;
            } else {
              ((dr) (Object) ((kg) this).field_u).a(param2, param0, param3, param1, (kg) this, (byte) -128);
              ((kg) this).field_o = 0;
              return;
            }
          } else {
            ((kg) this).field_o = 0;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Remove <%0> from friend list";
    }
}
