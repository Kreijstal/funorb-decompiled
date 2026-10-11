/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class una implements ntb {
    static String field_f;
    int field_g;
    private int field_c;
    private bba[] field_b;
    static String field_a;
    private int[] field_d;
    int field_e;

    final void f(byte param0) {
        bba var3 = null;
        bba var4 = null;
        int var2 = 19 / ((param0 - 35) / 63);
        if (null != this.field_b &&
          (this.field_g > 0 && this.field_b.length > this.field_g)) {
          var3 = this.field_b[-1 + this.field_g];
          var4 = this.field_b[this.field_g];
          this.field_b[-1 + this.field_g] = var4;
          this.field_b[this.field_g] = var3;
          this.field_g = this.field_g - 1;
        }
    }

    final boolean a(int param0, byte param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (null == this.field_d) {
          return true;
        }
        int var3 = 64 % ((-33 - param1) / 32);
        for (var4 = 0; var4 < this.field_d.length; var4++) {
          if (param0 == this.field_d[var4]) {
            return false;
          }
        }
        return true;
    }

    final void b(byte param0) {
        bba var2 = null;
        wm[] var3 = null;
        rna[] var4 = null;
        int var5 = 0;
        if (this.field_b != null &&
          this.field_g >= 0 &&
          this.field_b.length > this.field_g) {
          var2 = this.field_b[this.field_g];
          var3 = var2.a((byte) -125);
          var4 = var2.c((byte) -42);
          var5 = (var4 != null ? var4.length : 0) + (var3 == null ? 0 : var3.length);
          this.field_e = (this.field_e + 1) % var5;
        }
        if (param0 > -123) {
          this.field_d = (int[]) null;
        }
    }

    final void e(byte param0) {
        bba var2 = null;
        if (this.field_b != null && this.field_g >= 0 &&
          this.field_g < this.field_b.length) {
          var2 = this.field_b[this.field_g];
          var2.a(this.field_e, (byte) -79);
          this.field_e = this.field_e - 1;
          if (this.field_e < 0) {
            this.field_e = 0;
          }
        }
        if (param0 != -99) {
          this.g((byte) -104);
        }
    }

    final void a(byte param0, wm param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_b != null &&
            this.field_g >= 0 &&
            this.field_b.length > this.field_g) {
            this.field_b[this.field_g].a((byte) -105, param1);
          }
          if (param0 > -112) {
            this.a(121, (byte) -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("una.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            tv var4 = (tv) null;
            this.b((byte) -44, (tv) null);
          }
          this.field_b = (bba[]) (kcb.a(8, vtb.field_o, param0, 1, -115, this.field_b));
          this.field_g = param0.i(0, 32);
          this.field_e = param0.i(0, 32);
          this.field_d = wkb.a((byte) 37, this.field_d, param0, 8);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "una.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        faa var10 = null;
        faa var3 = null;
        bba[] var4 = null;
        int var5 = 0;
        bba[] var6 = null;
        int var7 = 0;
        bba var8 = null;
        int var9 = VoidHunters.field_G;
        if (param1 >= -109) {
          return;
        }
        try {
          var10 = param0;
          var3 = var10;
          var4 = this.field_b;
          var5 = var4 != null ? var4.length : 0;
          var10.a(-632, var5, 8);
          if (var5 != 0) {
            var6 = var4;
            for (var7 = 0; var7 < var6.length; var7++) {
              var8 = var6[var7];
              if (vq.a(var3, -126, var8 != null ? true : false)) {
                stb.a(2, 1, var10, var8);
              }
            }
          }
          param0.a(-632, this.field_g, 32);
          param0.a(-632, this.field_e, 32);
          pgb.a(8, null == this.field_d ? 0 : this.field_d.length, -120, param0, this.field_d);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "una.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, rsb param1) {
        int var4 = VoidHunters.field_G;
        try {
          qha.b(false);
          if (param0 != -2374) {
            this.field_e = 104;
          }
          if (null != this.field_b) {
            this.field_c = 0;
            while (this.field_b.length > this.field_c) {
              this.field_b[this.field_c].a(param1, -40);
              this.field_c = this.field_c + 1;
            }
            this.field_c = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "una.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, kb param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -29328) {
            field_f = (String) null;
          }
          if (ep.field_o == param1) {
            stackIn_19_0 = 6407;
            return stackIn_19_0;
          }
          if (param1 == qua.field_d) {
            stackIn_17_0 = 6408;
            return stackIn_17_0;
          }
          if (nw.field_p == param1) {
            stackIn_15_0 = 6406;
            return stackIn_15_0;
          }
          if (param1 == gka.field_p) {
            stackIn_7_0 = 6409;
            return stackIn_7_0;
          }
          if (wh.field_o == param1) {
            stackIn_10_0 = 6410;
            return stackIn_10_0;
          }
          if (qf.field_o != param1) {
            throw new IllegalStateException();
          }
          stackIn_13_0 = 6145;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("una.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, pe param2) {
        bba var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (null != this.field_b &&
            this.field_g >= 0 &&
            this.field_b.length > this.field_g) {
            var4 = this.field_b[this.field_g];
            var5 = var4.a((byte) 127, this.field_e, param1);
            var4.a(var5 - 1, -61, param1, this.field_e, param2);
          }
          if (param0 != 1) {
            field_f = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("una.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        una var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 26 % ((22 - param0) / 59);
          var3 = (una) (param1);
          stackIn_7_0 = (dn.a(var3.field_b, false, 1, this.field_b, 119)) || (var3.field_g != this.field_g) || (this.field_e != var3.field_e) || (wpb.a(var3.field_d, this.field_d, (byte) 28));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("una.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        una var3 = null;
        try {
          var3 = (una) (param1);
          var3.field_b = (bba[]) (sqb.a(var3.field_b, this.field_b, 1, vtb.field_o, false));
          var3.field_e = this.field_e;
          if (param0 <= 54) {
            this.field_d = (int[]) null;
          }
          var3.field_g = this.field_g;
          var3.field_d = dob.a(var3.field_d, (byte) -59, this.field_d);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "una.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(rna param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_b != null &&
            0 <= this.field_g &&
            this.field_b.length > this.field_g) {
            this.field_b[this.field_g].a(param0, true);
          }
          if (param1 != 0) {
            una.a((byte) 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("una.R(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void g(byte param0) {
        if (param0 != 82) {
          return;
        }
        if (this.field_b != null) {
          this.field_g = (1 + this.field_g) % this.field_b.length;
          this.field_e = 0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -98) {
          field_f = (String) null;
        }
        field_a = null;
        field_f = null;
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        una var5 = null;
        try {
          var5 = (una) (param0);
          tja.a(var5.field_b, 1, this.field_b, false, 5547);
          var4 = 0;
          if (dn.a(var5.field_b, false, 1, this.field_b, 115)) {
            var4 = 1;
            System.out.println("MissionEvent[] events has changed. ");
          }
          if (var5.field_g != this.field_g) {
            System.out.println("int selected_event has changed. before=" + var5.field_g + ", now=" + this.field_g);
            var4 = 1;
          }
          if (this.field_e != var5.field_e) {
            System.out.println("int selected_condition_or_action has changed. before=" + var5.field_e + ", now=" + this.field_e);
            var4 = 1;
          }
          if (ikb.a(this.field_d, var5.field_d, false)) {
            var4 = 1;
            System.out.println("int[] reserved_ids has changed. ");
          }
          if (param1 > -19) {
            return;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionControl has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("una.F(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0) {
        bba var2 = new bba();
        this.field_b = (bba[]) (ija.a(var2, this.field_b, param0, vtb.field_o));
        this.field_g = -1 + this.field_b.length;
    }

    final void c(byte param0) {
        tv var3;
        if (param0 != 55) {
          var3 = (tv) null;
          this.a((byte) -25, (tv) null);
        }
        if (this.field_c >= 0) {
          this.field_b = (bba[]) (dt.a(vtb.field_o, this.field_c, param0 ^ 15620, this.field_b));
          this.field_c = this.field_c - 1;
        } else {
          this.field_b = (bba[]) (dt.a(vtb.field_o, this.field_g, 15667, this.field_b));
          if (null != this.field_b &&
            this.field_b.length <= this.field_g) {
            this.field_g = -1 + this.field_b.length;
          }
          if (null == this.field_b ||
            this.field_b.length == 0) {
            this.field_g = 0;
          }
        }
    }

    final void a(boolean param0, pe param1, int param2) {
        bba var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (null != this.field_b &&
            0 <= this.field_g &&
            this.field_b.length > this.field_g) {
            var4 = this.field_b[this.field_g];
            var5 = var4.a((byte) -82, this.field_e, param2);
            var4.a(1 + var5, 118, param2, this.field_e, param1);
          }
          if (param0) {
            this.field_e = 56;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("una.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var4 = 0;
        int var2;
        bba[] var3;
        bba var5;
        wm[] var6;
        rna[] var7;
        int var9;
        wm var10;
        rna var10_ref;
        int var12;
        wm[] var13;
        rna[] var14;
        int var15;
        wm var16;
        Object var17;
        rna var18;
        Object var19;
        hd var20;
        hd var21;
        int var9Lifetime1;
        var17 = null;
        var19 = null;
        var12 = VoidHunters.field_G;
        var2 = 43 / ((-7 - param0) / 55);
        this.field_d = null;
        if (this.field_b != null) {
          var3 = this.field_b;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var6 = var5.a((byte) -115);
            var7 = var5.c((byte) -42);
            if (var6 != null) {
              var13 = var6;
              for (var9 = 0; var9 < var13.length; var9++) {
                var16 = var13[var9];
                var10 = var16;
                if (var10 instanceof hd) {
                  var20 = (hd) ((Object) var16);
                  this.field_d = var20.a(121, this.field_d);
                }
              }
            }
            if (var7 != null) {
              var14 = var7;
              var15 = 0;
              var9Lifetime1 = var15;
              while (var14.length > var15) {
                var18 = var14[var15];
                var10_ref = var18;
                if (var10_ref instanceof hd) {
                  var21 = (hd) ((Object) var18);
                  this.field_d = var21.a(114, this.field_d);
                }
                var15++;
              }
            }
          }
        }
    }

    final bba[] b(int param0) {
        if (param0 != 1) {
          rsb var3 = (rsb) null;
          this.a(23, (rsb) null);
        }
        return this.field_b;
    }

    public una() {
        this.field_c = -1;
    }

    final void a(int param0) {
        bba var2 = null;
        if (param0 != -828) {
          this.field_g = 33;
        }
        if (null != this.field_b &&
          (this.field_g >= 0 && this.field_g < this.field_b.length)) {
          var2 = this.field_b[this.field_g];
          var2.a(this.field_e, -1);
        }
    }

    final void a(int param0, bba param1) {
        try {
          this.field_b = (bba[]) (ija.a(param1, this.field_b, param0, vtb.field_o));
          this.d((byte) -111);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "una.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "Maximum ship size reached";
    }
}
