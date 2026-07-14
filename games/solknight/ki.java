/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ki extends rc implements oh {
    static int field_C;
    static String field_A;
    nc field_B;

    private final void c(boolean param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        ck var2 = new ck(((ki) this).field_B);
        if (!param0) {
            ki.d(false);
        }
        rc var3 = (rc) (Object) var2.a((byte) 114);
        while (var3 != null) {
            var3.d(1);
            var3 = (rc) (Object) var2.c(124);
        }
    }

    final int f(int param0) {
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        int var2 = 0;
        ck var3 = new ck(((ki) this).field_B);
        rc var4 = (rc) (Object) var3.a((byte) -59);
        int var5 = 21 / ((param0 - 17) / 43);
        while (var4 != null) {
            var6 = var4.f(74);
            if (!(var2 >= var6)) {
                var2 = var6;
            }
            var4 = (rc) (Object) var3.c(116);
        }
        return var2;
    }

    ki(int param0, int param1, int param2, int param3, j param4) {
        super(param0, param1, param2, param3, param4, (dg) null);
        ((ki) this).field_B = new nc();
    }

    final void a(rc param0, int param1) {
        if (param1 != 5411) {
            Object var4 = null;
            this.a(24, 112, (StringBuilder) null, (Hashtable) null);
        }
        ((ki) this).field_B.a((gg) (Object) param0, -7044);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != -1) {
                field_A = null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(kk.a(param1 ^ -89, var2, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od[] a(int param0, da param1, int param2, int param3) {
        if (!l.a(87, param2, param3, param1)) {
            return null;
        }
        if (param0 != 10) {
            Object var5 = null;
            ki.a((java.applet.Applet) null, 57);
        }
        return bl.b(false);
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        int var6 = 26 / ((param1 - 39) / 59);
        ck var5 = new ck(((ki) this).field_B);
        rc var7 = (rc) (Object) var5.a((byte) -99);
        while (var7 != null) {
            StringBuilder discarded$0 = param2.append(10);
            for (var8 = 0; var8 <= param0; var8++) {
                StringBuilder discarded$1 = param2.append(32);
            }
            StringBuilder discarded$2 = var7.a(-81, param3, param2, param0 - -1);
            var7 = (rc) (Object) var5.c(115);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = SolKnight.field_L ? 1 : 0;
        if (-1 == (param1 ^ -1)) {
            if (((ki) this).field_w != null) {
                ((ki) this).field_w.a((byte) 116, param0, true, param2, (rc) this);
            }
        }
        if (param3 != 0) {
            return;
        }
        ck var5 = new ck(((ki) this).field_B);
        rc var6 = (rc) (Object) var5.a(-25119);
        while (var6 != null) {
            var6.a(((ki) this).field_j + param0, param1, param2 - -((ki) this).field_m, 0);
            var6 = (rc) (Object) var5.b(640);
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        int var10 = SolKnight.field_L ? 1 : 0;
        ck var8 = new ck(((ki) this).field_B);
        rc var9 = (rc) (Object) var8.a((byte) 125);
        while (var9 != null) {
            // ifeq L92
            if (var9.a(param0, param1 - -((ki) this).field_m, false, param3, param4, param5 - -((ki) this).field_j, param6)) {
                return true;
            }
            var9 = (rc) (Object) var8.c(122);
        }
        if (param2) {
            rc discarded$0 = ((ki) this).d((byte) 97);
            return false;
        }
        return false;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return null != ((ki) this).d((byte) -48) ? true : false;
    }

    public static void d(boolean param0) {
        field_A = null;
        if (param0) {
            field_C = 53;
        }
    }

    final boolean b(int param0, rc param1) {
        ck var5 = null;
        rc var6 = null;
        int var7 = SolKnight.field_L ? 1 : 0;
        if (!(!((ki) this).field_B.c(-1))) {
            return false;
        }
        if (param0 <= 89) {
            ((ki) this).field_B = null;
        }
        ck var3 = new ck(((ki) this).field_B);
        rc var4 = (rc) (Object) var3.a((byte) 112);
        while (var4 != null) {
            if (var4.b(true)) {
                var5 = new ck(((ki) this).field_B);
                gg discarded$0 = var5.a(26229, (gg) (Object) var4);
                var6 = (rc) (Object) var5.c(121);
                while (var6 != null) {
                    if (var6.a(-1463, param1)) {
                        return true;
                    }
                    var6 = (rc) (Object) var5.c(125);
                }
            }
            var4 = (rc) (Object) var3.c(115);
        }
        return false;
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var7 = SolKnight.field_L ? 1 : 0;
        ck var9 = new ck(((ki) this).field_B);
        rc var8 = (rc) (Object) var9.a((byte) 77);
        while (var8 != null) {
            // ifeq L87
            if (var8.b(true)) {
                if (!(!var8.a(param0, (byte) 88, param2, param3))) {
                    return true;
                }
            }
            var8 = (rc) (Object) var9.c(115);
        }
        int var6 = param2;
        if (!(80 != var6)) {
            return !fh.field_d[81] ? ((ki) this).b(112, param3) : ((ki) this).a((byte) -105, param3);
        }
        var6 = 9 / ((param1 - 31) / 56);
        return false;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!(!((ki) this).a(param2, -1, param1, param3))) {
            ((ki) this).b(param2, -111, param1, param3);
            this.a(param3, -31, param2, param1);
        }
        if (param0 > -41) {
            Object var6 = null;
            boolean discarded$0 = ((ki) this).a('￯', (byte) 103, -3, (rc) null);
        }
        return param2;
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        int var9 = SolKnight.field_L ? 1 : 0;
        ck var7 = new ck(((ki) this).field_B);
        if (param1 != 0) {
            field_A = null;
        }
        rc var8 = (rc) (Object) var7.a((byte) 93);
        while (var8 != null) {
            // ifeq L101
            var8.a(param0, param1 + 0, param2, ((ki) this).field_j + param3, param4, ((ki) this).field_m + param5);
            var8 = (rc) (Object) var7.c(param1 ^ 127);
        }
    }

    final boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
        int var10 = SolKnight.field_L ? 1 : 0;
        ck var8 = new ck(((ki) this).field_B);
        rc var9 = (rc) (Object) var8.a((byte) 98);
        while (var9 != null) {
            // ifeq L89
            if (var9.b(true)) {
                if (var9.a(param0, param1, param2, param3, param4, param5, (byte) 50)) {
                    return true;
                }
            }
            var9 = (rc) (Object) var8.c(118);
        }
        if (param6 <= 33) {
            return false;
        }
        return false;
    }

    final String c(byte param0) {
        ck var2 = null;
        rc var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          var2 = new ck(((ki) this).field_B);
          if (param0 >= 14) {
            break L0;
          } else {
            String discarded$2 = ((ki) this).c((byte) 48);
            break L0;
          }
        }
        var3 = (rc) (Object) var2.a((byte) -122);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.c((byte) 106);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (rc) (Object) var2.c(117);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void g(int param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != 0) {
            Object var5 = null;
            boolean discarded$0 = ((ki) this).a((byte) 3, (rc) null);
        }
        ck var2 = new ck(((ki) this).field_B);
        rc var3 = (rc) (Object) var2.a((byte) 81);
        while (var3 != null) {
            var3.g(0);
            var3 = (rc) (Object) var2.c(115);
        }
    }

    final boolean a(int param0, rc param1) {
        int var5 = SolKnight.field_L ? 1 : 0;
        ck var3 = new ck(((ki) this).field_B);
        rc var4 = (rc) (Object) var3.a((byte) 92);
        while (var4 != null) {
            if (var4.a(-1463, param1)) {
                return true;
            }
            var4 = (rc) (Object) var3.c(121);
        }
        if (param0 != -1463) {
            ((ki) this).field_B = null;
            return false;
        }
        return false;
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        int var4 = -1;
        if (param0 != -27129) {
            return 75;
        }
        for (var5 = param3; param2 > var5; var5++) {
            var4 = var4 >>> 2021887144 ^ og.field_g[255 & (param1[var5] ^ var4)];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final static void a(int param0) {
        ne.field_g = te.field_N.h(92);
        if (param0 > -100) {
            return;
        }
        CharSequence var2 = (CharSequence) (Object) ne.field_g;
        kf.field_D = jg.a(var2, -2);
    }

    void a(int param0, int param1, int param2, rc param3) {
        int var7 = SolKnight.field_L ? 1 : 0;
        super.a(param0, param1, param2, param3);
        ck var5 = new ck(((ki) this).field_B);
        rc var6 = (rc) (Object) var5.a((byte) 117);
        while (var6 != null) {
            // ifeq L93
            var6.a(param0 + ((ki) this).field_m, 18874, param2 + ((ki) this).field_j, param3);
            var6 = (rc) (Object) var5.c(param1 ^ 18880);
        }
    }

    final boolean a(byte param0, rc param1) {
        ck var5 = null;
        rc var6 = null;
        int var7 = SolKnight.field_L ? 1 : 0;
        if (((ki) this).field_B.c(-1)) {
            return false;
        }
        ck var3 = new ck(((ki) this).field_B);
        if (param0 >= -104) {
            return false;
        }
        rc var4 = (rc) (Object) var3.a(-25119);
        while (var4 != null) {
            if (var4.b(true)) {
                var5 = new ck(((ki) this).field_B);
                gg discarded$0 = var5.a((gg) (Object) var4, 118);
                var6 = (rc) (Object) var5.b(640);
                while (var6 != null) {
                    if (!(!var6.a(-1463, param1))) {
                        return true;
                    }
                    var6 = (rc) (Object) var5.b(640);
                }
            }
            var4 = (rc) (Object) var3.b(640);
        }
        return false;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.c(true);
    }

    rc d(byte param0) {
        ck var2 = null;
        rc var3 = null;
        int var4 = 0;
        L0: {
          var4 = SolKnight.field_L ? 1 : 0;
          if (param0 == -48) {
            break L0;
          } else {
            ((ki) this).field_B = null;
            break L0;
          }
        }
        var2 = new ck(((ki) this).field_B);
        var3 = (rc) (Object) var2.a((byte) -119);
        L1: while (true) {
          if (var3 != null) {
            if (var3.b(true)) {
              return var3;
            } else {
              var3 = (rc) (Object) var2.c(121);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "members-only content";
    }
}
