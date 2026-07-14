/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mi extends ea {
    static String field_r;
    private boolean field_t;
    boolean field_u;
    private boolean field_v;
    boolean field_s;

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        if (param1 != 32462) {
            boolean discarded$0 = ((mi) this).e(3);
        }
        if (!(!((mi) this).a(param0, param2, false, param3))) {
            ((mi) this).a(param0, 0, param3, param2);
            if (((mi) this).field_s) {
                StringBuilder discarded$1 = param0.append(" active");
            }
            if (!(((mi) this).field_u)) {
                StringBuilder discarded$2 = param0.append(" disabled");
            }
        }
        return param0;
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        int var5 = 63 / ((param0 - -53) / 33);
        if (((mi) this).e(28660)) {
            if (84 != param1) {
                if (83 != param1) {
                    return false;
                }
            }
            ((mi) this).a(0, -1, 1, -1);
            return true;
        }
        return false;
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (!ou.a(19069, param1, param2)) {
            return false;
        }
        for (var3 = 0; var3 < ((CharSequence) param1).length(); var3++) {
            if (!cg.a(((CharSequence) param1).charAt(var3), (byte) 117)) {
                return false;
            }
        }
        if (param0 > -31) {
            field_r = (String) null;
            return true;
        }
        return true;
    }

    mi(String param0, no param1) {
        this(param0, ag.field_n.field_c, param1);
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 != 22547) {
            field_r = (String) null;
            return false;
        }
        return false;
    }

    final void d(int param0) {
        if (param0 != 7398) {
            boolean discarded$0 = mi.b(45, -16, 2);
        }
        if (!(!((mi) this).field_t)) {
            ((mi) this).field_t = false;
            if (null != ((mi) this).field_o) {
                if (((mi) this).field_o instanceof ni) {
                    ((ni) ((mi) this).field_o).a(-119, ((mi) this).field_t, (ea) this);
                }
            }
        }
    }

    final boolean e(int param0) {
        if (param0 != 28660) {
            return true;
        }
        return ((mi) this).field_t;
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        if (((mi) this).field_o != null) {
            if (((mi) this).field_o instanceof uq) {
                ((uq) ((mi) this).field_o).a(param2, param0, param3, -8703, param1, (mi) this);
            }
        }
        ((mi) this).field_i = 0;
        if (param5 != 91) {
            boolean discarded$0 = mi.b(36, -2, 6);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        if (((mi) this).field_u) {
            if (!(!((mi) this).a(param6, param4, param0 ^ -83, param1, param2))) {
                boolean discarded$0 = ((mi) this).a(param5, (byte) -42);
                ((mi) this).field_i = param3;
                if (null != ((mi) this).field_o) {
                    if (((mi) this).field_o instanceof uq) {
                        ((uq) ((mi) this).field_o).a(param1, param2, param4, param3, param6, false, (mi) this);
                    }
                }
                return true;
            }
        }
        if (param0 != 34) {
            return true;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
            Hashtable var6 = (Hashtable) null;
            StringBuilder discarded$0 = ((mi) this).a((StringBuilder) null, 57, 30, (Hashtable) null);
        }
        if (((mi) this).field_o != null) {
            if (((mi) this).field_o instanceof dn) {
                ((dn) ((mi) this).field_o).a(param3, (mi) this, param1, param2, (byte) 58);
            }
        }
    }

    public static void g(int param0) {
        field_r = null;
        if (param0 < 82) {
            boolean discarded$0 = mi.b(-79, 25, 3);
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        if (param0 < 13) {
            ((mi) this).field_t = false;
        }
        this.a((byte) 115, param1, param2, param3);
        if (-1 != (((mi) this).field_i ^ -1)) {
            if (vu.field_f != ((mi) this).field_i) {
                if (((mi) this).a(cf.field_g, param2, -41, param3, ic.field_b)) {
                    if (0 == vu.field_f) {
                        ((mi) this).a(0, -param3 + ic.field_b, ((mi) this).field_i, -param2 + cf.field_g);
                    }
                }
                ((mi) this).a(param3, param2, cf.field_g, ic.field_b, param1, (byte) 91);
            }
        }
    }

    boolean a(ea param0, byte param1) {
        if (param1 == -42) {
          if (!((mi) this).field_u) {
            return false;
          } else {
            if (((mi) this).field_v) {
              L0: {
                param0.d(7398);
                ((mi) this).field_t = true;
                if (null == ((mi) this).field_o) {
                  break L0;
                } else {
                  if (!(((mi) this).field_o instanceof ni)) {
                    break L0;
                  } else {
                    ((ni) ((mi) this).field_o).a(-97, ((mi) this).field_t, (ea) this);
                    break L0;
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    mi(String param0, ir param1, no param2) {
        super(param0, param1, param2);
        ((mi) this).field_v = true;
        ((mi) this).field_t = false;
        ((mi) this).field_u = true;
    }

    protected mi() {
        ((mi) this).field_v = true;
        ((mi) this).field_t = false;
        ((mi) this).field_u = true;
        ((mi) this).field_e = ag.field_n.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "More suggestions";
    }
}
