/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends pib {
    static String field_m;
    private int field_n;
    int field_h;
    static int field_j;
    private int field_o;
    static String[] field_l;
    int field_k;
    int field_i;

    public static void c(byte param0) {
        if (param0 != 42) {
            ob.c((byte) 67);
            field_l = null;
            field_m = null;
            return;
        }
        field_l = null;
        field_m = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        if (param5 != 115) {
          return;
        } else {
          ((ob) this).field_g.a(114, (pib) this);
          jaggl.OpenGL.glCopyTexSubImage3D(((ob) this).field_b, 0, param0, param7, param3, param1, param2, param6, param4);
          jaggl.OpenGL.glFlush();
          return;
        }
    }

    ob(qfa param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param2 * param3 * param4, false);
        ((ob) this).field_n = -1;
        ((ob) this).field_o = -1;
        try {
            ((ob) this).field_h = param4;
            ((ob) this).field_i = param2;
            ((ob) this).field_k = param3;
            ((ob) this).field_g.a(62, (pib) this);
            jaggl.OpenGL.glTexImage3Dub(((ob) this).field_b, 0, ((ob) this).field_d, ((ob) this).field_i, ((ob) this).field_k, ((ob) this).field_h, 0, fsb.a(((ob) this).field_d, false), 5121, (byte[]) null, 0);
            ((ob) this).a(-95, true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(((ob) this).field_o, ((ob) this).field_n, ((ob) this).field_b, 0, 0, 0);
        ((ob) this).field_o = -1;
        ((ob) this).field_n = -1;
        if (param0 != 31294) {
            ((ob) this).field_h = 45;
        }
    }

    ob(qfa param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param3 * (param2 * param4), false);
        ((ob) this).field_n = -1;
        ((ob) this).field_o = -1;
        try {
            ((ob) this).field_h = param4;
            ((ob) this).field_i = param2;
            ((ob) this).field_k = param3;
            ((ob) this).field_g.a(41, (pib) this);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(((ob) this).field_b, 0, ((ob) this).field_d, ((ob) this).field_i, ((ob) this).field_k, ((ob) this).field_h, 0, param6, 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            ((ob) this).a(99, true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static ufb a(int param0, eab param1, int param2, int param3) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ufb var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        ufb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ufb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var8 = jqb.a(11168, 0, param1, param3, 0, param2);
            var6 = var8;
            if (var8 != null) {
              var7 = new ufb();
              var7.field_b = var8;
              java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param2, param3);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              stackOut_3_0 = (ufb) var7;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ufb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("ob.N(").append(0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + 0 + ',' + 0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "More neutrals";
        field_j = 0;
        field_l = new String[16];
    }
}
