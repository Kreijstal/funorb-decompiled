/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends hq {
    static ri field_u;
    private mk field_w;
    private mk[] field_s;
    static String field_v;
    static String field_t;

    private final void a(jl param0, boolean param1, byte param2) {
        int var4_int = 0;
        mk dupTemp$0 = null;
        mk stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mk stackIn_9_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        mk var5 = null;
        mk var6 = null;
        int var7 = 0;
        ja var8 = null;
        mk var6Lifetime1;
        mk var6Lifetime2;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          super.a(-3, param0);
          if (param1) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_s[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param0.field_s[var4_int];
                stackIn_8_0 = var5;
                stackIn_8_1 = 100;
                if (var6Lifetime2 != null) {
                  stackIn_9_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new mk();
                  param0.field_s[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                }
                ((mk) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
              } else {
                param0.field_s[var4_int] = null;
              }
            }
          } else {
            d.a(this.field_s, 0, param0.field_s, 0, 6);
          }
          if (param2 < -107) {
            return;
          }
          var8 = (ja) null;
          this.a((ja) null, (byte) -75);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("jl.H(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, fm param6, pd param7, pd param8, int param9, int param10, int param11, int param12, int param13, int param14, fm param15, int param16, int param17, pd param18, int param19, boolean param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          lj.a(param6, param4, param15, 61);
          ek.a(param16, param0, 1829947600, param9, param10);
          uo.a(param13, param1, 1633);
          if (!param20) {
            field_t = (String) null;
          }
          vl.a(param18, param8, 127, param2, param12, param11);
          qb.a(param17, (byte) -115, param7, param14);
          nn.a((byte) 55, param3, param19, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("jl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param7 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final mk a(int param0, byte param1) {
        mk dupTemp$0 = null;
        if (param1 == -36) {
          dupTemp$0 = new mk();
          this.field_s[param0] = dupTemp$0;
          return dupTemp$0;
        }
        jl var4 = (jl) null;
        this.a((jl) null, false, (byte) -31);
        mk dupTemp$1 = new mk();
        this.field_s[param0] = dupTemp$1;
        return dupTemp$1;
    }

    final void a(ja[] param0, int param1, boolean param2) {
        int var4_int = 0;
        if (param2) {
          return;
        }
        try {
          var4_int = param1;
          if (null == this.field_s[var4_int]) {
            this.field_s[var4_int] = new mk();
          }
          this.field_s[param1].field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "jl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    jl(jl param0, boolean param1) {
        this();
        try {
          param0.a(this, param1, (byte) -122);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static java.applet.Applet b(int param0) {
        if (null != fd.field_L) {
          return fd.field_L;
        }
        if (param0 != 0) {
          field_v = (String) null;
          return (java.applet.Applet) ((Object) tg.field_i);
        }
        return (java.applet.Applet) ((Object) tg.field_i);
    }

    public final void a(boolean param0, int param1, int param2, int param3, cf param4) {
        cf stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        mk var7 = null;
        mk var9 = null;
        jl var10 = null;
        gn var11 = null;
        mk var12 = null;
        mk var13 = null;
        mk var14 = null;
        mk var15 = null;
        try {
          if (param4 instanceof gn) {
            stackIn_3_0 = (cf) (param4);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (gn) (stackIn_3_0);
          nm.a(param3 + param4.field_y, param4.field_w + (param4.field_i + param1), (byte) 105, param3 + param4.field_y + param4.field_n, param1 + param4.field_i);
          if (var11 != null) {
            param0 = param0 & var11.field_F;
          }
          var7 = this.field_s[0];
          this.field_w.a((byte) 11);
          var7.a(-11108, param3, param1, this, param4, this.field_w);
          if (var11 != null) {
            if (var11.field_G) {
              var12 = this.field_s[1];
              if (var12 != null) {
                var12.a(param2 + 4004, param3, param1, this, param4, this.field_w);
              }
            }
            if (var11.field_l) {
              var13 = this.field_s[3];
              if (var11.field_u != 0 &&
                var13 != null) {
                var13.a(param2 ^ 4196, param3, param1, this, param4, this.field_w);
              } else {
                var9 = this.field_s[2];
                if (var9 != null) {
                  var9.a(param2 + 4004, param3, param1, this, param4, this.field_w);
                }
              }
            }
          }
          if (param4.c(126)) {
            var14 = this.field_s[5];
            if (var14 != null) {
              var14.a(-11108, param3, param1, this, param4, this.field_w);
            }
          }
          if (!param0) {
            var15 = this.field_s[4];
            if (var15 != null) {
              var15.a(-11108, param3, param1, this, param4, this.field_w);
            }
          }
          this.field_w.a(param3, false, this, param4, param1);
          ql.a(true);
          if (param2 == -15112) {
            return;
          }
          var10 = (jl) null;
          this.a((jl) null, false, (byte) -63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("jl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(ja param0, byte param1) {
        int var4 = 0;
        mk[] var3 = null;
        mk var5_ref_mk = null;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5_ref_mk = var7[var4];
            if (var5_ref_mk != null) {
              var5_ref_mk.field_k = param0;
            }
          }
          var5 = 3 % ((22 - param1) / 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("jl.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        if (va.field_a != 2) {
          var7 = pi.field_e;
        } else {
          var7 = nc.field_c;
        }
        gf.a(127, param2, param4, param5, var7, param6, param0, param3);
        if (param1 == -97) {
          return;
        }
        pd var8 = (pd) null;
        jl.a(-33, 72, 86, 111, -101, -58, (fm) null, (pd) null, (pd) null, -42, -100, -45, 56, 89, -124, (fm) null, -98, -113, (pd) null, -13, true);
    }

    final void a(ja[] param0, boolean param1) {
        int var4 = 0;
        mk[] var3 = null;
        mk var5 = null;
        int var6 = 0;
        mk[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7 = this.field_s;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_e = param0;
            }
          }
          if (!param1) {
            return;
          }
          this.field_w = (mk) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("jl.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public jl() {
        this.field_s = new mk[6];
        this.field_w = new mk();
        mk dupTemp$0 = new mk();
        this.field_s[0] = dupTemp$0;
        mk var1 = dupTemp$0;
        var1.a((byte) 11);
    }

    public static void a(boolean param0) {
        field_t = null;
        field_v = null;
        field_u = null;
        if (param0) {
          field_t = (String) null;
        }
    }

    static {
        field_t = "Average rating";
        field_v = "Logging in...";
    }
}
