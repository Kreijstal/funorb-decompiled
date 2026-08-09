/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lha extends kl {
    int field_r;
    int field_q;
    private int field_n;
    static jpa field_l;
    int field_o;
    static String field_m;
    private int field_p;

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(this.field_n, this.field_p, this.field_e, 0, 0, 0);
        int var2 = -20 % ((14 - param0) / 56);
        this.field_n = -1;
        this.field_p = -1;
    }

    lha(cka param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        this.field_n = -1;
        this.field_p = -1;
        try {
            this.field_o = param4;
            this.field_r = param2;
            this.field_q = param3;
            this.field_h.a(true, (kl) (this));
            jaggl.OpenGL.glTexImage3Dub(this.field_e, 0, this.field_c, this.field_r, this.field_q, this.field_o, 0, sja.b(this.field_c, 20934), 5121, (byte[]) null, 0);
            this.b(true, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_h.a(true, (kl) (this));
        jaggl.OpenGL.glCopyTexSubImage3D(this.field_e, param6, param3, param0, param2, param1, param4, param5, param7);
        jaggl.OpenGL.glFlush();
    }

    lha(cka param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param4 * (param2 * param3), false);
        this.field_n = -1;
        this.field_p = -1;
        try {
            this.field_o = param4;
            this.field_r = param2;
            this.field_q = param3;
            this.field_h.a(true, (kl) (this));
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage3Dub(this.field_e, 0, this.field_c, this.field_r, this.field_q, this.field_o, 0, param6, 5121, param5, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            this.b(true, 3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 < 5) {
            lha.a((byte) 104);
        }
    }

    final static void a(String param0, String param1, byte param2, long param3, java.applet.Applet param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              try {
                L0: {
                  L1: {
                    var8 = param4.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (param2 >= 109) {
                      break L1;
                    } else {
                      lha.a((byte) -114);
                      break L1;
                    }
                  }
                  L2: {
                    if (0L <= param3) {
                      var7 = var9 + "; Expires=" + ida.a(param3 * 1000L + bva.b((byte) -107), -1) + "; Max-Age=" + param3;
                      break L2;
                    } else {
                      var7 = var9 + "; Discard;";
                      break L2;
                    }
                  }
                  lb.a(param4, 19467, "document.cookie=\"" + var7 + "\"");
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("lha.D(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = "You do not have a suitable number of players for the current options.";
    }
}
