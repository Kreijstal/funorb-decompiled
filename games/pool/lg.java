/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends am {
    static String field_v;
    static String field_y;
    static sj field_s;
    private pf field_t;
    static int field_x;
    static String field_w;
    private pf[] field_u;
    static String field_r;

    private final void a(boolean param0, lg param1, byte param2) {
        int var4_int = 0;
        pf dupTemp$0 = null;
        pf stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pf stackIn_11_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        pf var5 = null;
        pf var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          super.a(-1177150015, param1);
          if (param2 < 59) {
            return;
          }
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_u[var4_int];
              if (var5 == null) {
                param1.field_u[var4_int] = null;
              } else {
                var6 = param1.field_u[var4_int];
                stackIn_10_0 = var5;
                stackIn_10_1 = 288;
                if (var6 == null) {
                  dupTemp$0 = new pf();
                  param1.field_u[var4_int] = dupTemp$0;
                  stackIn_11_2 = dupTemp$0;
                } else {
                  stackIn_11_2 = var6;
                }
                ((pf) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_11_2);
              }
            }
            return;
          }
          qn.a(this.field_u, 0, param1.field_u, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("lg.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public lg() {
        this.field_u = new pf[6];
        this.field_t = new pf();
        pf dupTemp$0 = new pf();
        this.field_u[0] = dupTemp$0;
        pf var1 = dupTemp$0;
        var1.a(-51);
    }

    final void a(dd param0, int param1) {
        int var4 = 0;
        pf[] var3 = null;
        int var5 = 0;
        pf var6 = null;
        int var7 = 0;
        pf[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Pool.field_O;
        try {
          var8 = this.field_u;
          var3 = var8;
          var5 = 78 / ((29 - param1) / 36);
          for (var4 = 0; var4 < var8.length; var4++) {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_b = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("lg.EA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, dd[] param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (this.field_u[var4_int] == null) {
            this.field_u[var4_int] = new pf();
          }
          if (param0 != -79) {
            lg.c(-45);
          }
          this.field_u[param1].field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "lg.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final pf b(int param0, int param1) {
        if (param1 != 0) {
          dd var4 = (dd) null;
          this.a((dd) null, -125);
        }
        pf dupTemp$0 = new pf();
        this.field_u[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void a(boolean param0) {
        field_v = null;
        if (!param0) {
          field_w = (String) null;
        }
        field_w = null;
        field_r = null;
        field_y = null;
        field_s = null;
    }

    final void a(dd[] param0, int param1) {
        int var4 = 0;
        pf[] var3 = null;
        pf var5 = null;
        int var6 = 0;
        pf[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Pool.field_O;
        try {
          var7 = this.field_u;
          var3 = var7;
          if (param1 != 6) {
            return;
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("lg.DA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        ei stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        pf var7 = null;
        int var8 = 0;
        pf var10 = null;
        fe var11 = null;
        pf var12 = null;
        pf var13 = null;
        pf var14 = null;
        pf var15 = null;
        try {
          if (!(param4 instanceof fe)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (ei) (param4);
          }
          var11 = (fe) (stackIn_3_0);
          wh.a(param1 + param4.field_C, param4.field_D + param3, param4.field_l + (param4.field_C + param1), (byte) 85, param4.field_y + (param4.field_D + param3));
          if (var11 != null) {
            param0 = param0 & var11.field_I;
          }
          var8 = -10 / ((param2 - 2) / 41);
          var7 = this.field_u[0];
          this.field_t.a(-107);
          var7.a(this, param3, this.field_t, -116, param4, param1);
          if (var11 != null) {
            if (var11.field_G) {
              var12 = this.field_u[1];
              if (var12 != null) {
                var12.a(this, param3, this.field_t, -103, param4, param1);
              }
            }
            if (var11.field_s) {
              var13 = this.field_u[3];
              if (var11.field_n != 0 &&
                var13 != null) {
                var13.a(this, param3, this.field_t, -113, param4, param1);
              } else {
                var10 = this.field_u[2];
                if (var10 != null) {
                  var10.a(this, param3, this.field_t, -108, param4, param1);
                }
              }
            }
          }
          if (param4.d(66)) {
            var14 = this.field_u[5];
            if (var14 != null) {
              var14.a(this, param3, this.field_t, -128, param4, param1);
            }
          }
          if (!param0) {
            var15 = this.field_u[4];
            if (var15 != null) {
              var15.a(this, param3, this.field_t, -112, param4, param1);
            }
          }
          this.field_t.a(param3, param1, param4, this, 110);
          oc.a(121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("lg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    lg(lg param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, (byte) 89);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "lg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ke c(int param0) {
        if (param0 != 5) {
          lg.c(-37);
        }
        return new ke(gd.a(true), mn.a(true));
    }

    static {
        field_y = "Change display name";
        field_v = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_w = "Play free version";
        field_r = "Names cannot start or end with space or underscore";
    }
}
