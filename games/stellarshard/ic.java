/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ic implements w {
    static String field_b;
    private long field_c;
    static int field_a;
    static ej field_d;

    public final cg b(int param0) {
        if (this.a((byte) 28)) {
          return sf.field_a;
        }
        if (param0 != -28036) {
          return (cg) null;
        }
        if (350L + this.field_c <= ih.a((byte) -98)) {
          return this.c((byte) -119);
        }
        return eh.field_c;
    }

    abstract String b(byte param0);

    public static void d(byte param0) {
        if (param0 != 37) {
          ic.a(-25, 74);
          field_b = null;
          field_d = null;
          return;
        }
        field_b = null;
        field_d = null;
    }

    abstract cg c(byte param0);

    public final void a(int param0) {
        this.field_c = ih.a((byte) -98);
        if (param0 >= -81) {
          this.c(-83);
        }
    }

    final static void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var8_int = 0;
        String var8 = null;
        int var9 = stellarshard.field_B;
        param6 += 24;
        int var7_int = 48 + l.field_f.b(gf.field_b) + nj.field_f[param1];
        if (!(l.field_f.b(param0) <= -nj.field_f[param1] + (var7_int - 48))) {
          var7_int = 48 + (l.field_f.b(param0) + nj.field_f[param1]);
        }
        jf.field_n[0].e(param4 - var7_int / 2, -(jf.field_n[0].field_x / 2) + (2 + param6) + (-(l.field_f.field_N / 2) + 2));
        ti.d(-(var7_int / 2) + (param4 + jf.field_n[0].field_w), 0, -jf.field_n[2].field_w + param4 + var7_int / 2, 480);
        for (var8_int = jf.field_n[0].field_w + param4 - var7_int / 2; -jf.field_n[2].field_w + var7_int / 2 + param4 > var8_int; var8_int = var8_int + jf.field_n[1].field_w) {
          jf.field_n[1].e(var8_int, 2 + (2 + param6) + (-(l.field_f.field_N / 2) - jf.field_n[0].field_x / 2));
        }
        ti.b();
        jf.field_n[2].e(-jf.field_n[2].field_w + (param4 + var7_int / 2), 2 + (param6 - (-2 + l.field_f.field_N / 2)) - jf.field_n[0].field_x / 2);
        if (!(nj.field_f[param1] <= 0)) {
          ti.a(param4 - (var7_int / 2 - 12) << 4, param6 + 2 - (l.field_f.field_N / 2 - 2) << 4, 512, nj.field_f[param1] * 4, ei.field_I);
          ti.a(-14 + (var7_int / 2 + param4) << 4, -(l.field_f.field_N / 2) + 2 + param6 + 2 << 4, 512, nj.field_f[param1] * 4, ei.field_I);
          ti.a(param4 - (var7_int / 2 - 12) << 4, -(l.field_f.field_N / 2) + (2 + param6 + 2) << 4, 256, nj.field_f[param1] * 2, ei.field_B);
          ti.a(-14 + (var7_int / 2 + param4) << 4, 2 - l.field_f.field_N / 2 + (2 + param6) << 4, 256, nj.field_f[param1] * 2, ei.field_B);
        }
        if (param3) {
          return;
        }
        try {
          var8 = ai.a(param0, "<col", "<", -101);
          l.field_f.c(var8, -1 + param4, param6, 0, -1);
          l.field_f.c(var8, 1 + param4, param6, 0, -1);
          l.field_f.c(var8, param4 + 1, -1 + param6, 0, -1);
          l.field_f.c(var8, 1 + param4, param6 + 1, 0, -1);
          l.field_f.c(param0, param4, param6, param5, param2);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ic.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final String c(int param0) {
        if (param0 != -22773) {
          this.c((byte) -69);
          if (this.a((byte) 79)) {
            return null;
          }
          if (ih.a((byte) -98) >= (this.field_c + 350L)) {
            return this.b((byte) 36);
          }
          return null;
        }
        if (this.a((byte) 79)) {
          return null;
        }
        if (ih.a((byte) -98) >= (this.field_c + 350L)) {
          return this.b((byte) 36);
        }
        return null;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        fk var4 = null;
        af var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = stellarshard.field_B;
        try {
          var4 = (fk) (ib.field_c.b(-88));
          while (var4 != null) {
            th.a(param0, var4, 1);
            var4 = (fk) (ib.field_c.b((byte) 106));
          }
          if (param1 < 30) {
            return;
          }
          var5 = (af) (pf.field_b.b(-110));
          while (var5 != null) {
            kg.a(param0, var5, false);
            var5 = (af) (pf.field_b.b((byte) 87));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "ic.J(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Suggested names: ";
    }
}
