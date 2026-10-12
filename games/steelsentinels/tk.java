/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends ia {
    private jf field_o;
    static String field_q;
    static String field_r;
    static String field_s;
    static RgbSprite[] field_t;
    static ak field_p;
    static String field_n;

    final String a(int param0, String param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 100) {
            var4 = (String) null;
            this.a((String) null, -43);
          }
          if (this.field_o instanceof qn) {
            var3 = ((qn) ((Object) this.field_o)).a(false);
            if (var3 != null) {
              if (var3.a((byte) 21) == vf.field_b &&
                !param1.equals(this.field_o.field_y)) {
                stackIn_9_0 = hh.field_h;
                return stackIn_9_0;
              }
              stackIn_11_0 = var3.a(true);
              return stackIn_11_0;
            }
          }
          if (param1.equals(this.field_o.field_y)) {
            return null;
          }
          stackIn_15_0 = hh.field_h;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, RgbSprite param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var9_intLifetime1;
        int var10Lifetime1;
        try {
          var9_int = -param3 + (param7 + param6.field_D) + param8;
          var10 = param6.field_D + param7 + (param8 + param2);
          var11 = (param6.field_F >> 1) + param0 + param6.field_H;
          SoftwareRaster.h(var9_int, 0, var10, var11 + param4);
          param6.a(-1 + param7, param0 - 1, param1);
          param6.a(param7 - 1, 1 + param0, param1);
          SoftwareRaster.a(ti.field_n);
          SoftwareRaster.h(1 + var9_int, 0, 1 + var10, param4 + var11);
          param6.a(param7 + 1, param0 - 1, param1);
          param6.a(param7 + 1, 1 + param0, param1);
          SoftwareRaster.a(ti.field_n);
          if (param5 != -30456) {
            tk.$cfr$intArgs$f$20d51497949f(-117);
          }
          var9_intLifetime1 = param6.field_A + param6.field_D + (param7 + (-param8 - param2));
          var10Lifetime1 = param6.field_A + param6.field_D + param7 - (param8 + param3);
          SoftwareRaster.h(var9_intLifetime1, -param4 + var11, var10Lifetime1, 480);
          param6.a(param7 - 1, param0 - 1, param1);
          param6.a(param7 - 1, 1 + param0, param1);
          SoftwareRaster.a(ti.field_n);
          SoftwareRaster.h(1 + var9_intLifetime1, var11 - param4, 1 + var10Lifetime1, 480);
          param6.a(1 + param7, -1 + param0, param1);
          param6.a(param7 + 1, param0 + 1, param1);
          SoftwareRaster.a(ti.field_n);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "tk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    tk(jf param0, jf param1) {
        super(param0);
        try {
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void f(byte param0) {
        aj var1 = (aj) (ff.field_qb.c(-6533));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRaster.a(var1.field_q, var1.field_z, var1.field_w);
        if (param0 > 96) {
          SoftwareRaster.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
          var1.field_q = null;
          sl.field_b.addLast(3, var1);
          return;
        }
        field_t = (RgbSprite[]) null;
        SoftwareRaster.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
        var1.field_q = null;
        sl.field_b.addLast(3, var1);
    }

    public static void d(byte param0) {
        field_t = null;
        field_p = null;
        field_r = null;
        field_s = null;
        field_q = null;
        field_n = null;
        if (param0 >= -105) {
          field_n = (String) null;
        }
    }

    final vd a(String param0, int param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        vd stackIn_7_0 = null;
        vd stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            tk.e((byte) 84);
          }
          if (this.field_o instanceof qn) {
            var3 = ((qn) ((Object) this.field_o)).a(false);
            if (var3 != null &&
              var3.a((byte) 21) != vf.field_b) {
              stackIn_7_0 = ArchiveProvider.field_d;
              return stackIn_7_0;
            }
          }
          if (!param0.equals(this.field_o.field_y)) {
            stackIn_11_0 = ArchiveProvider.field_d;
          } else {
            stackIn_11_0 = vf.field_b;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("tk.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void e(byte param0) {
        if (param0 < 22) {
          field_t = (RgbSprite[]) null;
        }
    }

    static {
        field_s = "Firing arc";
        field_q = "Inviting <%0>";
        field_r = "<%0> might change the options - wait and see.";
        field_n = "Create a free Account";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$f$20d51497949f(int param0) {
        aj var1 = (aj) (ff.field_qb.c(-6533));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRaster.a(var1.field_q, var1.field_z, var1.field_w);
        if (param0 > 96) {
          SoftwareRaster.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
          var1.field_q = null;
          sl.field_b.addLast(3, var1);
          return;
        }
        field_t = (RgbSprite[]) null;
        SoftwareRaster.a(var1.field_p, var1.field_o, var1.field_y, var1.field_t);
        var1.field_q = null;
        sl.field_b.addLast(3, var1);
    }
}
