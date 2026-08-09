/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va implements mh {
    private vn field_a;
    private int field_e;
    private int field_h;
    private int field_g;
    private int field_f;
    private int field_i;
    private int field_c;
    private int field_d;
    static int field_b;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        vb var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        try {
            var14 = param0 instanceof vb ? (vb) ((Object) param0) : null;
            if (var14 == null) {
            }
            lk.d(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, this.field_i);
            var7 = param4 - (-param0.field_r + -var14.field_G);
            var8 = var14.field_K + (param1 - -param0.field_v);
            lk.b(var7, var8, var14.field_F, this.field_e);
            if (-1 != var14.field_M) {
                var9 = 2.0 * (3.141592653589793 * (double)var14.field_M) / (double)var14.field_L;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
                var12 = (int)(Math.cos(var9) * (double)var14.field_F);
                lk.b(var7 - -var11, var8 + var12, 1, this.field_h);
            }
            lk.b(var7, var8, 2, 1);
            if (param2 != 5592405) {
                this.field_d = -11;
            }
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_H) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            lk.e(var7, var8, var7 + var11, var12 + var8, 1);
            if (null != this.field_a) {
                var13 = var14.field_F + (var14.field_G - -this.field_f);
                this.field_a.a(param0.field_m, param0.field_r + (param4 + var13), param0.field_v + (param1 + this.field_d), -this.field_f - var13 + param0.field_q, -(this.field_f << 1286328385) + param0.field_p, this.field_g, this.field_c, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "va.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.applet.Applet var4 = null;
            java.net.URL var5 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (!param0) {
                      break L1;
                    } else {
                      var4 = (java.applet.Applet) null;
                      va.a(true, (java.applet.Applet) null);
                      break L1;
                    }
                  }
                  var5 = param1.getCodeBase();
                  var3 = td.a((byte) 121, param1, var5).getFile();
                  tw.a(-105, param1, "updatelinks", new Object[]{"home", var3 + "home.ws"});
                  tw.a(-115, param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"});
                  tw.a(-111, param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"});
                  tw.a(-106, param1, "updatelinks", new Object[]{"options", var3 + "options.ws"});
                  tw.a(-126, param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"});
                  tw.a(-101, param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"});
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("va.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    va(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_i = param7;
            this.field_d = param2;
            this.field_h = param6;
            this.field_f = param1;
            this.field_e = param5;
            this.field_a = param0;
            this.field_g = param3;
            this.field_c = param4;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = 0;
    }
}
