/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    int field_a;
    int field_h;
    int field_c;
    static uf field_e;
    int field_d;
    int field_b;
    int field_j;
    static volatile boolean field_i;
    static String field_g;
    static String field_f;

    final static void a(int param0) {
        if (param0 < 21) {
            return;
        }
        uh.a((byte) -99);
        jc.a((byte) 100, 4);
    }

    abstract void a(int param0, int param1);

    final static uf a(java.applet.Applet param0, byte param1) {
        int var4 = 0;
        uf var5 = null;
        int var6 = wizardrun.field_H;
        String var2 = sg.a("jagex-last-login-method", param0, 0);
        if (!(var2 != null)) {
            return ra.field_j;
        }
        if (param1 != 48) {
            field_i = true;
        }
        uf[] var3 = p.l((byte) 100);
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(!var5.b(var2, 126))) {
                return var5;
            }
        }
        return ra.field_j;
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var4 = param1.getCodeBase();
                  if (param0 > 5) {
                    break L1;
                  } else {
                    field_g = null;
                    break L1;
                  }
                }
                var3 = jl.a(-101, var4, param1).getFile();
                Object discarded$6 = cl.a(new Object[2], "updatelinks", 30383, param1);
                Object discarded$7 = cl.a(new Object[2], "updatelinks", 30383, param1);
                Object discarded$8 = cl.a(new Object[2], "updatelinks", 30383, param1);
                Object discarded$9 = cl.a(new Object[2], "updatelinks", 30383, param1);
                Object discarded$10 = cl.a(new Object[2], "updatelinks", 30383, param1);
                Object discarded$11 = cl.a(new Object[2], "updatelinks", 30383, param1);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            jf.a(-100);
        }
        field_f = null;
        field_e = null;
        field_g = null;
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (param0) {
            return;
        }
        kl.a(0, (java.awt.Component) (Object) param1);
        gj.a((java.awt.Component) (Object) param1, 98);
        if (vc.field_K != null) {
            vc.field_K.b((java.awt.Component) (Object) param1, -1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_e = new uf("usename");
        field_g = "Waiting for instruments";
    }
}
