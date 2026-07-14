/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wi extends fd {
    static String field_x;
    private boolean field_D;
    static boolean field_B;
    private boolean field_w;
    static uv field_v;
    boolean field_y;
    static boolean[] field_z;
    static int field_C;
    boolean field_A;

    wi(String param0, gj param1, jv param2) {
        super(param0, param1, param2);
        ((wi) this).field_D = false;
        ((wi) this).field_w = true;
        ((wi) this).field_y = true;
    }

    final static void a(String param0, String param1, int param2, int param3, String param4, int param5) {
        if (param5 >= -112) {
            field_x = null;
        }
        tv var6 = new tv(param3, param1, param2, param0, param4);
        ec.a(true, var6);
    }

    boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        if (((wi) this).field_y) {
            if (((wi) this).a((byte) 47, param5, param1, param2, param4)) {
                boolean discarded$0 = ((wi) this).a(param3, 0);
                ((wi) this).field_p = param6;
                if (null != ((wi) this).field_k) {
                    if (!(((wi) this).field_k instanceof nf)) {
                        return true;
                    }
                    ((nf) (Object) ((wi) this).field_k).a(param4, param6, param2, param5, (wi) this, (byte) -32, param1);
                }
                return true;
            }
        }
        if (!param0) {
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 <= 40) {
            field_z = null;
        }
        field_x = null;
        field_v = null;
        field_z = null;
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        if (param1 >= -60) {
            ((wi) this).field_w = true;
        }
        if (((wi) this).b(97)) {
            if (param3 != 84) {
                if ((param3 ^ -1) != -84) {
                    return false;
                }
            }
            ((wi) this).b(1, -1, -1, -1);
            return true;
        }
        return false;
    }

    final boolean b(int param0) {
        if (param0 < 10) {
            return false;
        }
        return ((wi) this).field_D;
    }

    final void g(int param0) {
        if (((wi) this).field_D) {
            ((wi) this).field_D = false;
            if (null != ((wi) this).field_k) {
                if (!(!(((wi) this).field_k instanceof ab))) {
                    ((ab) (Object) ((wi) this).field_k).a(((wi) this).field_D, (fd) this, -9307);
                }
            }
        }
        if (param0 != 84) {
            Object var3 = null;
            boolean discarded$0 = ((wi) this).a('￱', (byte) 74, (fd) null, -102);
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        if (null != ((wi) this).field_k) {
            if (!(!(((wi) this).field_k instanceof nf))) {
                ((nf) (Object) ((wi) this).field_k).a((wi) this, param2, param4 + -31878, param1, param0, param5);
            }
        }
        if (param4 != -1) {
            ((wi) this).field_A = false;
        }
        ((wi) this).field_p = 0;
    }

    wi(String param0, jv param1) {
        this(param0, nb.field_i.field_l, param1);
    }

    void a(byte param0, fd param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (((wi) this).field_p != 0) {
            if (((wi) this).field_p != nl.field_p) {
                if (((wi) this).a((byte) -70, param2, param3, el.field_A, n.field_m)) {
                    if (!(0 != nl.field_p)) {
                        ((wi) this).b(((wi) this).field_p, -param2 + el.field_A, n.field_m + -param3, -1);
                    }
                }
                ((wi) this).a(param3, n.field_m, el.field_A, param1, param0 + -13, param2);
            }
        }
    }

    boolean a(fd param0, int param1) {
        if (((wi) this).field_y) {
            // ifeq L17
        } else {
            return false;
        }
        if (param1 != 0) {
            return true;
        }
        param0.g(84);
        ((wi) this).field_D = true;
        if (((wi) this).field_k != null) {
            if (!(((wi) this).field_k instanceof ab)) {
                return true;
            }
            ((ab) (Object) ((wi) this).field_k).a(((wi) this).field_D, (fd) this, param1 ^ -9307);
        }
        return true;
    }

    final static StringBuilder a(int param0, int[] param1) {
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = Kickabout.field_G;
          if (param0 == -31182) {
            break L0;
          } else {
            var5 = null;
            wi.a((String) null, (String) null, -61, -57, (String) null, 83);
            break L0;
          }
        }
        var2 = new StringBuilder("int[] {");
        var3 = 0;
        L1: while (true) {
          if (var3 >= param1.length) {
            return var2.append(125);
          } else {
            StringBuilder discarded$27 = var2.append(var3);
            if (-1 + param1.length > var3) {
              StringBuilder discarded$28 = var2.append(44);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
            ((wi) this).b(117, -8, -51, -115);
        }
        if (((wi) this).field_k != null) {
            if (!(!(((wi) this).field_k instanceof vh))) {
                ((vh) (Object) ((wi) this).field_k).a(param1, (wi) this, param2, (byte) 99, param0);
            }
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (!(!((wi) this).a(param0 + -17882, param3, param2, param1))) {
            ((wi) this).b(param1, param3, param2, -18568);
            if (!(!((wi) this).field_A)) {
                StringBuilder discarded$0 = param3.append(" active");
            }
            if (!(((wi) this).field_y)) {
                StringBuilder discarded$1 = param3.append(" disabled");
            }
        }
        if (param0 != 17883) {
            field_C = -75;
        }
        return param3;
    }

    protected wi() {
        ((wi) this).field_D = false;
        ((wi) this).field_w = true;
        ((wi) this).field_y = true;
        ((wi) this).field_r = nb.field_i.field_n;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "You are invited to <%0>'s game.";
        field_C = -1;
    }
}
