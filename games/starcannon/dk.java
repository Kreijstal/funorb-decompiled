/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dk extends uj {
    static String field_x;
    boolean field_u;
    private boolean field_y;
    private boolean field_v;
    static String field_t;
    boolean field_z;
    static String field_w;

    void a(int param0, int param1, uj param2, int param3) {
        super.a(102, param1, param2, param3);
        if (0 != ((dk) this).field_l) {
            if (!(((dk) this).field_l == te.field_b)) {
                if (((dk) this).a(param3, param1, la.field_c, pe.field_d, -12790)) {
                    if (te.field_b == 0) {
                        ((dk) this).a(la.field_c + -param3, 67, -param1 + pe.field_d, ((dk) this).field_l);
                    }
                }
                ((dk) this).a(la.field_c, param3, param1, param2, (byte) -22, pe.field_d);
            }
        }
        if (param0 <= 27) {
            Object var6 = null;
            boolean discarded$0 = ((dk) this).a(-120, (uj) null);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (null != ((dk) this).field_g) {
            if (((dk) this).field_g instanceof ga) {
                ((ga) (Object) ((dk) this).field_g).a((dk) this, param2, false, param3, param0);
            }
        }
        if (param1 <= 59) {
            Object var6 = null;
            ((dk) this).a(86, 45, (uj) null, -120);
        }
    }

    final void b(byte param0) {
        if (((dk) this).field_v) {
            ((dk) this).field_v = false;
            if (null != ((dk) this).field_g) {
                if (!(!(((dk) this).field_g instanceof ei))) {
                    ((ei) (Object) ((dk) this).field_g).a((byte) -119, (uj) this, ((dk) this).field_v);
                }
            }
        }
        if (param0 > -72) {
            Object var3 = null;
            StringBuilder discarded$0 = ((dk) this).a((Hashtable) null, (StringBuilder) null, (byte) 61, -47);
        }
    }

    public static void a(int param0) {
        if (param0 >= -76) {
            return;
        }
        field_t = null;
        field_w = null;
        field_x = null;
    }

    dk(String param0, qg param1) {
        this(param0, eh.field_j.field_d, param1);
    }

    boolean a(int param0, uj param1) {
        if (((dk) this).field_u) {
            // ifeq L17
        } else {
            return false;
        }
        param1.b((byte) -100);
        ((dk) this).field_v = true;
        if (null != ((dk) this).field_g) {
            if (((dk) this).field_g instanceof ei) {
                ((ei) (Object) ((dk) this).field_g).a((byte) -119, (uj) this, ((dk) this).field_v);
            }
        }
        if (param0 != 0) {
            ((dk) this).field_v = true;
            return true;
        }
        return true;
    }

    final static boolean a(byte param0, char param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -117) {
            break L0;
          } else {
            boolean discarded$2 = dk.a((byte) -26, 'y');
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (param1 != 45) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    dk(String param0, de param1, qg param2) {
        super(param0, param1, param2);
        ((dk) this).field_y = true;
        ((dk) this).field_v = false;
        ((dk) this).field_u = true;
    }

    final static boolean a(char param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (!(!u.a(param1 ^ 9566, param0))) {
            return true;
        }
        char[] var10 = gj.field_d;
        char[] var8 = var10;
        char[] var5 = var8;
        char[] var2 = var5;
        for (var3 = 0; var3 < var10.length; var3++) {
            var4 = var10[var3];
            if (!(var4 != param0)) {
                return true;
            }
        }
        char[] var11 = ea.field_c;
        char[] var9 = var11;
        char[] var6 = var9;
        var2 = var6;
        if (param1 != 90) {
            field_t = null;
        }
        int var7 = 0;
        var3 = var7;
        while (var11.length > var7) {
            var4 = var11[var7];
            if (!(var4 != param0)) {
                return true;
            }
            var7++;
        }
        return false;
    }

    boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        if (((dk) this).field_u) {
            if (!(!((dk) this).a(param3, param2, param1, param5, param4 ^ 12799))) {
                boolean discarded$0 = ((dk) this).a(0, param0);
                ((dk) this).field_l = param6;
                if (((dk) this).field_g != null) {
                    if (((dk) this).field_g instanceof ke) {
                        ((ke) (Object) ((dk) this).field_g).a(param3, param2, param6, param5, param1, (dk) this, (byte) -103);
                    }
                }
                return true;
            }
        }
        if (param4 != -11) {
            return false;
        }
        return false;
    }

    final static byte[] a(byte param0, Object param1, boolean param2) {
        byte[] var4 = null;
        kk var5 = null;
        int var3 = 38 % ((param0 - 4) / 47);
        if (param1 == null) {
            return null;
        }
        if (param1 instanceof byte[]) {
            var4 = (byte[]) param1;
            if (!param2) {
                return var4;
            }
            return rg.a((byte) 10, var4);
        }
        if (param1 instanceof kk) {
            var5 = (kk) param1;
            return var5.a(4208);
        }
        throw new IllegalArgumentException();
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        if (!(!((dk) this).a(param0, 0, param1, param3))) {
            ((dk) this).a(param0, param1, param3, 19103);
            if (!(!((dk) this).field_z)) {
                StringBuilder discarded$0 = param1.append(" active");
            }
            if (!((dk) this).field_u) {
                StringBuilder discarded$1 = param1.append(" disabled");
            }
        }
        if (param2 != 39) {
            return null;
        }
        return param1;
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        if (((dk) this).d(true)) {
            if (84 != param3) {
                // if_icmpeq L25
            } else {
                ((dk) this).a(-1, 111, -1, 1);
                return true;
            }
        }
        if (param2 != -90) {
            field_w = null;
            return false;
        }
        return false;
    }

    final boolean d(boolean param0) {
        if (!param0) {
            field_t = null;
        }
        return ((dk) this).field_v;
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        if (null != ((dk) this).field_g) {
            if (((dk) this).field_g instanceof ke) {
                ((ke) (Object) ((dk) this).field_g).a((dk) this, param2, param5, 78, param1, param0);
            }
        }
        ((dk) this).field_l = 0;
        if (param4 != -22) {
            ((dk) this).field_u = true;
        }
    }

    protected dk() {
        ((dk) this).field_y = true;
        ((dk) this).field_v = false;
        ((dk) this).field_u = true;
        ((dk) this).field_o = eh.field_j.field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "You have <%0> unread messages!";
        field_t = "Back";
        field_w = "To Customer Support";
    }
}
