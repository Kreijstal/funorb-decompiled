/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vga extends vpa {
    private ng[] field_o;
    static vna field_n;
    static boolean field_q;
    private ng field_p;

    public vga() {
        this.field_o = new ng[6];
        this.field_p = new ng();
        ng dupTemp$0 = new ng();
        this.field_o[0] = dupTemp$0;
        ng var1 = dupTemp$0;
        var1.a(true);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -96) {
            vga.b(91);
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (jm.a(var3, 19) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("vga.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, iu[] param1) {
        int var4 = 0;
        ng[] var3 = null;
        ng var5 = null;
        int var6 = 0;
        vga var7 = null;
        ng[] var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = this.field_o;
          var3 = var8;
          if (param0 != -18379) {
            var7 = (vga) null;
            this.a((byte) -79, (vga) null, false);
          }
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_i = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("vga.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(iu param0, byte param1) {
        int var4 = 0;
        ng[] var3 = null;
        int var5 = 0;
        ng var6 = null;
        int var7 = 0;
        ng[] var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var8 = this.field_o;
          var3 = var8;
          var5 = -107 / ((-39 - param1) / 62);
          for (var4 = 0; var8.length > var4; var4++) {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_c = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vga.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_n = null;
        if (param0 < 36) {
          field_q = true;
        }
    }

    final void a(int param0, int param1, iu[] param2) {
        int var4_int = 0;
        try {
          if (param0 != 0) {
            this.field_p = (ng) null;
          }
          var4_int = param1;
          if (null == this.field_o[var4_int]) {
            this.field_o[var4_int] = new ng();
          }
          this.field_o[param1].field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vga.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ng a(int param0, byte param1) {
        if (param1 < 40) {
          this.a(100, (byte) 15);
        }
        ng dupTemp$0 = new ng();
        this.field_o[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        ae stackIn_3_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        ng var7 = null;
        ng var9 = null;
        rj var10 = null;
        ng var11 = null;
        ng var12 = null;
        ng var13 = null;
        ng var14 = null;
        try {
          if (!(param0 instanceof rj)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (ae) (param0);
          }
          var10 = (rj) (stackIn_3_0);
          tga.a(param2 - 16799168, param0.field_i + param1, param1 + param0.field_i + param0.field_m, param0.field_n + param3, param0.field_n + param3 + param0.field_p);
          if (var10 != null) {
            param4 = param4 & var10.field_y;
          }
          var7 = this.field_o[0];
          this.field_p.a(true);
          if (param2 != 16777215) {
            this.field_o = (ng[]) null;
          }
          var7.a(this, param0, 123, param3, param1, this.field_p);
          if (var10 != null) {
            if (var10.field_w) {
              var11 = this.field_o[1];
              if (var11 != null) {
                var11.a(this, param0, 125, param3, param1, this.field_p);
              }
            }
            if (var10.field_f) {
              var12 = this.field_o[3];
              if (0 != var10.field_s &&
                var12 != null) {
                var12.a(this, param0, 123, param3, param1, this.field_p);
              } else {
                var9 = this.field_o[2];
                if (var9 != null) {
                  var9.a(this, param0, param2 ^ 16777092, param3, param1, this.field_p);
                }
              }
            }
          }
          if (param0.b((byte) -34)) {
            var13 = this.field_o[5];
            if (var13 != null) {
              var13.a(this, param0, 123, param3, param1, this.field_p);
            }
          }
          if (!param4) {
            var14 = this.field_o[4];
            if (var14 != null) {
              var14.a(this, param0, 126, param3, param1, this.field_p);
            }
          }
          this.field_p.a(-83, param1, this, param3, param0);
          pfa.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_36_0 = var6;
          stackIn_36_1 = new StringBuilder().append("vga.B(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(byte param0, vga param1, boolean param2) {
        int var4_int = 0;
        ng dupTemp$0 = null;
        ng stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        ng stackIn_11_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ng var5 = null;
        ng var6 = null;
        int var7 = 0;
        iu[] var8 = null;
        ng var6Lifetime1;
        ng var6Lifetime2;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -16) {
            var8 = (iu[]) null;
            this.a(-72, (iu[]) null);
          }
          super.a(param1, param0 - 64);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_o[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param1.field_o[var4_int];
                stackIn_10_0 = var5;
                stackIn_10_1 = true;
                if (var6Lifetime2 != null) {
                  stackIn_11_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new ng();
                  param1.field_o[var4_int] = dupTemp$0;
                  stackIn_11_2 = dupTemp$0;
                }
                ((ng) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_11_2);
              } else {
                param1.field_o[var4_int] = null;
              }
            }
            return;
          }
          lua.a(this.field_o, 0, param1.field_o, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("vga.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    vga(vga param0, boolean param1) {
        this();
        try {
          param0.a((byte) -16, this, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_n = new vna();
    }
}
