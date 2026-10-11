/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends lw {
    static String field_o;
    static String field_l;
    static int[] field_m;
    static ee field_n;

    public static void d(byte param0) {
        field_l = null;
        field_o = null;
        field_m = null;
        field_n = null;
        if (param0 >= -54) {
          wa.e((byte) -49);
        }
    }

    final static sba a(int param0, byte[] param1) {
        sba var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        Object stackIn_4_0 = null;
        sba stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -21231) {
            var3 = (byte[]) null;
            wa.a(-91, (byte[]) null);
          }
          if (param1 == null) {
            stackIn_4_0 = null;
            return (sba) (stackIn_4_0);
          }
          var2 = new sba(param1, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
          al.b(-18073);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("wa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (param0 <= 103) {
          wa.e((byte) -22);
        }
    }

    final void a(int param0, byte param1) {
        if (param0 != 34) {
          if (param1 != 73) {
            field_o = (String) null;
          }
          return;
        }
        this.b(1);
        if (this.c((byte) 95)) {
          this.b((byte) 112);
          fla.b(23621);
          return;
        }
        if (param1 != 73) {
          field_o = (String) null;
        }
    }

    wa() {
        super(true, new String[]{qca.field_p}, jla.field_f);
        this.field_c = new int[][]{new int[]{160, 180}, new int[]{160, 180}};
    }

    final static void e(byte param0) {
        kr var1 = null;
        int var2 = BachelorFridge.field_y;
        try {
          if (param0 > -85) {
            wa.d((byte) -63);
          }
          if (qg.field_b.field_z != null) {
            var1 = (kr) (qg.field_b.field_z.b((byte) 90));
            while (var1 != null) {
              if (var1.field_R == 1) {
                qm.a(7, 7758);
                var1.field_yb.c((byte) -80);
                if (var1.field_yb.field_g == 0) {
                  var1.field_yb.a(false);
                  var1.a(false);
                }
                gu.field_d = gu.field_d - 1;
              }
              var1 = (kr) (qg.field_b.field_z.c(0));
            }
          }
          qf.e(20434);
          iaa.a(-119);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "wa.F(" + param0 + ')');
        }
    }

    static {
        field_m = new int[1024];
        field_o = "This is <%0>'s RuneScape clan if they have one.";
        field_l = "Rankings";
    }
}
