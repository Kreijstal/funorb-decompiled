/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lk extends qb {
    static bk field_g;
    String field_n;
    int field_m;
    String field_r;
    int field_l;
    boolean field_j;
    int field_x;
    int field_q;
    int field_h;
    static boolean field_w;
    static String field_p;
    int field_i;
    static String field_t;
    ci field_v;
    static String[] field_u;
    mj field_s;
    pl field_k;
    int field_o;

    final boolean a(byte param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        qi var6 = null;
        int var7 = 0;
        L0: {
          var7 = Main.field_T;
          ((lk) this).a(param2, param1, (lk) this, 3);
          var5 = ((lk) this).d(82) ? 1 : 0;
          if (!param3) {
            if (var5 == 0) {
              break L0;
            } else {
              if (dl.field_h != 0) {
                ((lk) this).c((byte) 28);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            L1: {
              if (-1 == (eg.field_f ^ -1)) {
                break L1;
              } else {
                if (var5 == 0) {
                  break L1;
                } else {
                  boolean discarded$4 = ((lk) this).a(param1, eg.field_b, param2, ij.field_e, eg.field_f, -1, (lk) this);
                  break L1;
                }
              }
            }
            L2: {
              if (-1 == (dl.field_h ^ -1)) {
                break L2;
              } else {
                if (((lk) this).a(param1, param2, ag.field_a, param0 + 77, (lk) this, dl.field_h, jc.field_N)) {
                  param3 = false;
                  break L2;
                } else {
                  if (var5 == 0) {
                    break L2;
                  } else {
                    ((lk) this).c((byte) 39);
                    break L2;
                  }
                }
              }
            }
            if ((k.field_c ^ -1) != -1) {
              break L0;
            } else {
              if ((sa.field_c ^ -1) != -1) {
                L3: {
                  ((lk) this).a(false, (lk) this, eg.field_b, param1, param2, ij.field_e);
                  var6 = sh.field_i;
                  if (var6 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (var6.field_k instanceof wa) {
                        ((wa) (Object) var6.field_k).a((wc) null, 15254, var6);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    sh.field_i = null;
                    break L3;
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        sa.field_c = k.field_c;
        hi.a(((lk) this).b((byte) -79), (byte) -111);
        if (param0 == -116) {
          return param3;
        } else {
          return false;
        }
    }

    boolean d(int param0) {
        if (param0 < 44) {
            field_g = null;
            return false;
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var6 = 12 / ((29 - param0) / 53);
            if (param1 + ((lk) this).field_o > param3) {
              break L1;
            } else {
              if (param2 < ((lk) this).field_i + param4) {
                break L1;
              } else {
                if (((lk) this).field_h + ((lk) this).field_o + param1 <= param3) {
                  break L1;
                } else {
                  if (param4 - (-((lk) this).field_i + -((lk) this).field_q) <= param2) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    public final String toString() {
        return ((lk) this).a(new Hashtable(), false, 0, new StringBuilder()).toString();
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        if (param1 >= -99) {
            return true;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == (param3 ^ -1)) {
            if (!(((lk) this).field_v == null)) {
                ((lk) this).field_v.a(param0, (lk) this, param2 ^ -11448, param1, true);
            }
        }
    }

    StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        if (!(!((lk) this).a(param3, param2, param1, param0))) {
            ((lk) this).a(param0, (byte) -16, param3, param2);
        }
        return param3;
    }

    boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        if (param3 > -14) {
            ((lk) this).c((byte) -54);
        }
        if (((lk) this).a(104, param0, param6, param2, param1)) {
            ((lk) this).field_x = param5;
            return false;
        }
        return false;
    }

    void a(int param0, int param1, lk param2, int param3) {
        int var5 = ((lk) this).a(param3 + -31, param1, ij.field_e, eg.field_b, param0) ? 1 : 0;
        if ((var5 == 0 ? 1 : 0) != (!((lk) this).field_j ? 1 : 0)) {
            ((lk) this).field_j = var5 != 0 ? true : false;
            if (null != ((lk) this).field_k) {
                if (((lk) this).field_k instanceof qc) {
                    ((qc) (Object) ((lk) this).field_k).a(18686, var5 != 0, (lk) this);
                }
            }
        }
        if (param3 != 3) {
            String discarded$0 = ((lk) this).b((byte) -13);
        }
    }

    final boolean a(StringBuilder param0, int param1, boolean param2, Hashtable param3) {
        if (param2) {
            boolean discarded$0 = ((lk) this).a('M', (byte) 53, -34, (lk) null);
        }
        if (!param3.containsKey(this)) {
            Object discarded$1 = param3.put(this, this);
            return true;
        }
        StringBuilder discarded$2 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
        return false;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 34) {
            ((lk) this).field_v = null;
        }
        if (((lk) this).d(83)) {
            if (!(!((lk) this).a(param0, (byte) -112, param2, (lk) this))) {
                return true;
            }
        }
        int var4 = param2;
        if (var4 != 80) {
            return false;
        }
        return ((lk) this).a(98, (lk) this);
    }

    final void g(int param0) {
        ((lk) this).a(((lk) this).field_q, ((lk) this).field_i, ((lk) this).field_h, ((lk) this).field_o, true);
        if (param0 != 26947) {
            boolean discarded$0 = ((lk) this).a(-106, 85, -20, -95, (lk) null, 30, 45);
        }
    }

    final static wb[] a(String param0, String param1, byte param2, qk param3) {
        int var4 = param3.a(18659, param1);
        int var5 = param3.a(var4, param0, (byte) 7);
        if (param2 <= 4) {
            lk.a((java.applet.Applet) null, 118, (String) null);
        }
        return ol.a(var5, param3, var4, 505437496);
    }

    void c(byte param0) {
        if (param0 <= 27) {
            boolean discarded$0 = ((lk) this).a('j', (byte) -11, 35, (lk) null);
        }
    }

    public static void e(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_u = null;
        field_t = null;
        field_p = null;
    }

    int f(int param0) {
        if (param0 != -1) {
            return 126;
        }
        return 0;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            ni.field_a = param2;
            try {
                var3 = param0.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                if (param2.length() != param1) {
                    var5 = var5 + "; Expires=" + h.a(-117, 94608000000L + id.a(105)) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                vh.a(param0, "document.cookie=\"" + var5 + "\"", param1 ^ -12300);
            } catch (Throwable throwable) {
            }
            tj.a(true, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    lk(String param0, pl param1) {
        this(param0, pj.field_a.field_h, param1);
    }

    void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        ((lk) this).field_x = 0;
        if (param0) {
            boolean discarded$0 = ((lk) this).d(97);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, lk param6) {
        if (param5 != -1) {
            boolean discarded$0 = ((lk) this).a((StringBuilder) null, -28, false, (Hashtable) null);
            return false;
        }
        return false;
    }

    String b(byte param0) {
        if (param0 != -79) {
            StringBuilder discarded$0 = ((lk) this).a((Hashtable) null, true, 102, (StringBuilder) null);
        }
        if (!((lk) this).field_j) {
            return null;
        }
        return ((lk) this).field_n;
    }

    final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        int var6 = Main.field_T;
        StringBuilder discarded$64 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((lk) this).field_o).append(",").append(((lk) this).field_i).append(" ").append(((lk) this).field_h).append("x").append(((lk) this).field_q);
        if (!(null == ((lk) this).field_r)) {
            StringBuilder discarded$65 = param2.append(" text=\"").append(((lk) this).field_r).append(34);
        }
        if (param1 != -16) {
            return;
        }
        if (((lk) this).field_j) {
            StringBuilder discarded$66 = param2.append(" mouseover");
        }
        if (!(!((lk) this).d(86))) {
            StringBuilder discarded$67 = param2.append(" focused");
        }
        if (null == ((lk) this).field_v) {
        } else {
            StringBuilder discarded$76 = param2.append(" renderer=");
            if (!(((lk) this).field_v instanceof lk)) {
                StringBuilder discarded$78 = param2.append(((lk) this).field_v);
            } else {
                param2 = ((lk) this).a(param0, false, 1 + param3, param2);
            }
        }
        if (((lk) this).field_k != null) {
            StringBuilder discarded$88 = param2.append(" listener=");
            if (((lk) this).field_k instanceof lk) {
                param2 = ((lk) this).a(param0, false, 1 + param3, param2);
            } else {
                StringBuilder discarded$89 = param2.append(((lk) this).field_k);
            }
        }
    }

    void a(int param0, int param1, int param2, int param3, boolean param4) {
        ((lk) this).field_o = param3;
        ((lk) this).field_i = param1;
        ((lk) this).field_q = param0;
        ((lk) this).field_h = param2;
        if (!param4) {
            ((lk) this).field_q = -35;
        }
    }

    boolean a(int param0, lk param1) {
        if (param0 < 71) {
            return true;
        }
        return false;
    }

    protected lk() {
        ((lk) this).field_m = 0;
        ((lk) this).field_l = 0;
    }

    lk(String param0, ci param1, pl param2) {
        ne var4 = null;
        ((lk) this).field_m = 0;
        ((lk) this).field_l = 0;
        ((lk) this).field_r = param0;
        ((lk) this).field_k = param2;
        ((lk) this).field_v = param1;
        if (((lk) this).field_v instanceof ne) {
            var4 = (ne) (Object) ((lk) this).field_v;
            ((lk) this).field_h = var4.a((lk) this, (byte) 59);
            ((lk) this).field_q = var4.a(-2, (lk) this);
        }
    }

    lk(int param0, int param1, int param2, int param3, ci param4, pl param5) {
        ((lk) this).field_m = 0;
        ((lk) this).field_l = 0;
        ((lk) this).field_q = param3;
        ((lk) this).field_h = param2;
        ((lk) this).field_o = param0;
        ((lk) this).field_v = param4;
        ((lk) this).field_i = param1;
        ((lk) this).field_k = param5;
    }

    final void a(int param0, byte param1, int param2) {
        int var6_int = 0;
        int var7 = Main.field_T;
        int var4 = -127 / ((-39 - param1) / 62);
        int var5 = ((lk) this).f(-1);
        for (var6_int = 0; var6_int <= var5; var6_int++) {
            ((lk) this).a(param0, param2, -1, var6_int);
        }
        String var6 = wh.a((byte) -108);
        if (!(var6 == null)) {
            pj.field_a.a(p.field_k, (byte) -53, var6, ti.field_a);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new bk();
        field_p = "Connection lost. <%0>";
        field_t = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_u = new String[]{"Complete level<nbsp>1", "Complete level<nbsp>2", "Complete level<nbsp>3", "Complete level<nbsp>4", "Complete level<nbsp>5", "Complete a level with no more than 18<nbsp>misses", "Complete a level with no more than 12<nbsp>misses", "Complete a level with no more than 9<nbsp>misses", "Complete a level with 1:00 remaining", "Complete a level with 1:30 remaining", "Complete a level with 2:00 remaining", "Complete a level with 2:30 remaining", "Manage 3 hits in a row (not counting the last two of a<nbsp>level)", "Manage 4 hits in a row (not counting the last two of a<nbsp>level)", "Manage 5 hits in a row (not counting the last two of a<nbsp>level)"};
    }
}
