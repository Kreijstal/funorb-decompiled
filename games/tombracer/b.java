/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class b extends ae implements tpa {
    static String field_v;
    vna field_u;

    final boolean a(ae param0, byte param1) {
        uja var5 = null;
        ae var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (!(!((b) this).field_u.d((byte) 14))) {
            return false;
        }
        uja var9 = new uja(((b) this).field_u);
        if (param1 != -9) {
            Object var8 = null;
            boolean discarded$0 = ((b) this).b((ae) null, (byte) 90);
        }
        ae var4 = (ae) (Object) var9.a(true);
        while (var4 != null) {
            if (!(!var4.b((byte) -34))) {
                var5 = new uja(((b) this).field_u);
                vg discarded$1 = var5.a(0, (vg) (Object) var4);
                var6 = (ae) (Object) var5.a(-1);
                while (var6 != null) {
                    if (var6.a(param0, false)) {
                        return true;
                    }
                    var6 = (ae) (Object) var5.a(param1 ^ 8);
                }
            }
            var4 = (ae) (Object) var9.a(-1);
        }
        return false;
    }

    void f(byte param0) {
        int var5 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(((b) this).field_u);
        int var4 = -96 % ((param0 - -38) / 60);
        ae var3 = (ae) (Object) var2.a(true);
        while (var3 != null) {
            var3.f((byte) -115);
            var3 = (ae) (Object) var2.a(-1);
        }
    }

    final boolean b(ae param0, byte param1) {
        uja var5 = null;
        ae var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        if (!(!((b) this).field_u.d((byte) 14))) {
            return false;
        }
        if (param1 > -45) {
            Object var8 = null;
            ((b) this).a((byte) 112, (ae) null, 60, 11, -7, -44);
        }
        uja var9 = new uja(((b) this).field_u);
        ae var4 = (ae) (Object) var9.a((byte) 99);
        while (var4 != null) {
            if (var4.b((byte) -34)) {
                var5 = new uja(((b) this).field_u);
                vg discarded$0 = var5.a((vg) (Object) var4, (byte) -11);
                var6 = (ae) (Object) var5.c(60);
                while (var6 != null) {
                    if (!(!var6.a(param0, false))) {
                        return true;
                    }
                    var6 = (ae) (Object) var5.c(33);
                }
            }
            var4 = (ae) (Object) var9.c(62);
        }
        return false;
    }

    public static void h(byte param0) {
        field_v = null;
        int var1 = -18 / ((param0 - 38) / 48);
    }

    final static byte[] a(int param0, int param1, int param2, byte[] param3) {
        byte[] var5 = new byte[param0];
        byte[] var4 = var5;
        lua.a(param3, param2, var5, param1, param0);
        return var5;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!(!((b) this).a((byte) -115, param0, param1, param2))) {
            ((b) this).a(1, param2, param1, param0);
            this.b(param0, param1, param2, 23241);
        }
        if (param3 != 0) {
            field_v = null;
        }
        return param2;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = TombRacer.field_G ? 1 : 0;
        if (-1 == (param3 ^ -1)) {
            if (null != ((b) this).field_r) {
                ((b) this).field_r.a((ae) this, param0, param2 + 16777215, param1, true);
            }
        }
        uja var5 = new uja(((b) this).field_u);
        if (param2 != 0) {
            return;
        }
        ae var6 = (ae) (Object) var5.a((byte) 120);
        while (var6 != null) {
            var6.a(param0 - -((b) this).field_i, ((b) this).field_n + param1, 0, param3);
            var6 = (ae) (Object) var5.c(param2 ^ 46);
        }
    }

    final static lu a(String param0, int param1, String param2, boolean param3, long param4) {
        L0: {
          if (param4 != (long)param1) {
            break L0;
          } else {
            if (param2 != null) {
              return (lu) (Object) new wc(param2, param0);
            } else {
              break L0;
            }
          }
        }
        if (param3) {
          return (lu) (Object) new hda(param4, param0);
        } else {
          return (lu) (Object) new tc(param4, param0);
        }
    }

    String d(byte param0) {
        String var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(((b) this).field_u);
        ae var6 = (ae) (Object) var2.a(true);
        while (var6 != null) {
            var4 = var6.d((byte) 127);
            if (!(var4 == null)) {
                return var4;
            }
            var6 = (ae) (Object) var2.a(-1);
        }
        int var3 = 127 % ((param0 - -58) / 60);
        return null;
    }

    final int a(boolean param0) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        if (param0) {
            Object var7 = null;
            ((b) this).a((ae) null, -99);
        }
        uja var3 = new uja(((b) this).field_u);
        ae var4 = (ae) (Object) var3.a(true);
        while (var4 != null) {
            var5 = var4.a(false);
            if (!(var5 <= var2)) {
                var2 = var5;
            }
            var4 = (ae) (Object) var3.a(-1);
        }
        return var2;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int var10 = TombRacer.field_G ? 1 : 0;
        uja var8 = new uja(((b) this).field_u);
        if (param0 <= 70) {
            return false;
        }
        ae var9 = (ae) (Object) var8.a(true);
        while (var9 != null) {
            // ifeq L98
            if (var9.a(121, param1 + ((b) this).field_i, ((b) this).field_n + param2, param3, param4, param5, param6)) {
                return true;
            }
            var9 = (ae) (Object) var8.a(-1);
        }
        return false;
    }

    boolean b(byte param0) {
        if (param0 != -34) {
            return true;
        }
        return ((b) this).g((byte) 52) != null ? true : false;
    }

    ae g(byte param0) {
        uja var2 = null;
        ae var3 = null;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var2 = new uja(((b) this).field_u);
          if (param0 == 52) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        var3 = (ae) (Object) var2.a(true);
        L1: while (true) {
          if (var3 != null) {
            if (var3.b((byte) -34)) {
              return var3;
            } else {
              var3 = (ae) (Object) var2.a(-1);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        int var9 = TombRacer.field_G ? 1 : 0;
        uja var7 = new uja(((b) this).field_u);
        ae var8 = (ae) (Object) var7.a(true);
        while (var8 != null) {
            // ifeq L84
            var8.a((byte) 59, param1, param2, ((b) this).field_i + param3, param4 - -((b) this).field_n, param5);
            var8 = (ae) (Object) var7.a(-1);
        }
        if (param0 != 59) {
            ae discarded$0 = ((b) this).g((byte) 119);
        }
    }

    boolean a(ae param0, boolean param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        uja var3 = new uja(((b) this).field_u);
        if (param1) {
            return false;
        }
        ae var4 = (ae) (Object) var3.a(true);
        while (var4 != null) {
            if (var4.a(param0, false)) {
                return true;
            }
            var4 = (ae) (Object) var3.a(-1);
        }
        return false;
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> -184107711;
        var2 = var2 | var2 >>> 1181399777;
        var2 = var2 | var2 >>> 494055650;
        var2 = var2 | var2 >>> 1899775908;
        var2 = var2 | var2 >>> -1703889496;
        int var3 = 126 / ((param1 - -24) / 60);
        var2 = var2 | var2 >>> 1516036816;
        return (var2 ^ -1) & param0;
    }

    b(int param0, int param1, int param2, int param3, isa param4) {
        super(param0, param1, param2, param3, param4, (qc) null);
        ((b) this).field_u = new vna();
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        int var10 = TombRacer.field_G ? 1 : 0;
        uja var8 = new uja(((b) this).field_u);
        if (param6 != -1) {
            field_v = null;
        }
        ae var9 = (ae) (Object) var8.a(true);
        while (var9 != null) {
            // ifeq L104
            if (var9.b((byte) -34)) {
                if (var9.a(param0, param1, param2, param3, param4, param5, -1)) {
                    return true;
                }
            }
            var9 = (ae) (Object) var8.a(-1);
        }
        return false;
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        int var7 = TombRacer.field_G ? 1 : 0;
        uja var5 = new uja(((b) this).field_u);
        if (!param3) {
            return true;
        }
        ae var8 = (ae) (Object) var5.a(param3);
        while (var8 != null) {
            // ifeq L91
            if (var8.b((byte) -34)) {
                if (var8.a(param0, param1, param2, true)) {
                    return true;
                }
            }
            var8 = (ae) (Object) var5.a(-1);
        }
        int var6 = param2;
        if (-81 == (var6 ^ -1)) {
            return !oj.field_tb[81] ? ((b) this).a(param1, (byte) -9) : ((b) this).b(param1, (byte) -124);
        }
        return false;
    }

    private final void b(int param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        uja var2 = new uja(((b) this).field_u);
        ae var3 = (ae) (Object) var2.a(true);
        while (var3 != null) {
            var3.c((byte) -121);
            var3 = (ae) (Object) var2.a(-1);
        }
        if (param0 <= 110) {
            field_v = null;
        }
    }

    final void a(ae param0, int param1) {
        ((b) this).field_u.b((byte) -67, (vg) (Object) param0);
        if (param1 != -1) {
            this.b(64);
        }
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(param0 ^ -112);
    }

    private final void b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        uja var5 = new uja(((b) this).field_u);
        if (param3 != 23241) {
            ((b) this).field_u = null;
        }
        ae var6 = (ae) (Object) var5.a(true);
        while (var6 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var7 = 0; param0 >= var7; var7++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var6.a(param0 + 1, param1, param2, 0);
            var6 = (ae) (Object) var5.a(-1);
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        int var7 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2, param3);
        uja var5 = new uja(((b) this).field_u);
        ae var6 = (ae) (Object) var5.a(true);
        while (var6 != null) {
            // ifeq L89
            var6.a(((b) this).field_i + param0, 2097152, param2, param3 + ((b) this).field_n);
            var6 = (ae) (Object) var5.a(-1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Rankings";
    }
}
