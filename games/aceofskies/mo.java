/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    private jc field_b;
    int field_d;
    static int[] field_c;
    static w field_a;

    final static io a(int param0, jc param1, vj[] param2) {
        int var3_int = 0;
        int var5 = 0;
        byte[] var11 = null;
        int var7 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        for (var3_int = 0; var3_int < param2.length; var3_int++) {
            if (null == param2[var3_int]) {
                return null;
            }
            if (param2[var3_int].field_c <= 0L) {
                return null;
            }
        }
        long var3 = jaggl.OpenGL.glCreateProgramObjectARB();
        for (var5 = 0; param2.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3, param2[var5].field_c);
        }
        jaggl.OpenGL.glLinkProgramARB(var3);
        jaggl.OpenGL.glGetObjectParameterivARB(var3, 35714, ee.field_d, 0);
        if (!(ee.field_d[param0] != 0)) {
            if (!(ee.field_d[0] != 0)) {
                System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3, 35716, ee.field_d, 1);
            if (1 < ee.field_d[1]) {
                var11 = new byte[ee.field_d[1]];
                jaggl.OpenGL.glGetInfoLogARB(var3, ee.field_d[1], ee.field_d, 0, var11, 0);
                System.out.println(new String(var11));
            }
            if (-1 == (ee.field_d[0] ^ -1)) {
                var7 = 0;
                var5 = var7;
                while (var7 < param2.length) {
                    jaggl.OpenGL.glDetachObjectARB(var3, param2[var7].field_c);
                    var7++;
                }
                jaggl.OpenGL.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new io(param1, var3, param2);
    }

    final static void a(int param0) {
        if (!ks.field_b) {
            throw new IllegalStateException();
        }
        nq.field_a = true;
        ep.a(false, param0 ^ param0);
        ob.field_d = 0;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -16 / ((param0 - -33) / 39);
    }

    mo(jc param0, int param1, int param2) {
        ((mo) this).field_d = param2;
        ((mo) this).field_b = param0;
    }

    protected final void finalize() throws Throwable {
        ((mo) this).field_b.c(110, ((mo) this).field_d);
        this.finalize();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new w();
    }
}
