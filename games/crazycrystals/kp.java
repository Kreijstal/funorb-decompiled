/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends f implements Cloneable {
    private int field_o;
    private int field_i;
    static mk field_k;
    static int field_j;
    static dl field_n;
    static int field_m;
    static String field_l;

    final void b(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        if (this.field_o < 0) {
          return;
        }
        if (4 <= this.field_o) {
          return;
        }
        int var3 = vp.field_a[1 + this.field_o] - vp.field_a[this.field_o];
        int var4 = (int)(3.0 * ((double)var3 * Math.random()));
        if (var4 < 0) {
          return;
        }
        if (var4 < var3) {
          this.field_i = vp.field_a[this.field_o] + var4;
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
          this.a(-45, 64, -4, false, -34, -102);
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        il.field_h[this.field_o].a(128, param2, param1, 60, (byte) -111);
        if (param0 != -29660) {
          ea var5 = (ea) null;
          this.a(18, (f[][]) null, true, 111, -32, -11, (ea) null, 78);
        }
    }

    final static String a(String param0, String param1, String param2, int param3, db param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 3) {
            kp.b(false);
          }
          if (!param4.a((byte) 102)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param1 + " - " + param4.b(param2, -36) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("kp.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
          field_j = 58;
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        int var8;
        var7 = this.field_i;
        if (0 > var7) {
          var7 = this.field_o;
        } else {
          if (!jm.field_j) {
            var7 = this.field_o;
          }
        }
        if (0 <= var7) {
          if (param2 != 24) {
            tb.field_e[var7].b(param5, param4, param2 * 2, 2 * param0);
          } else {
            if (param0 != 24) {
              tb.field_e[var7].b(param5, param4, param2 * 2, 2 * param0);
            } else {
              tb.field_e[var7].c(param5, param4);
            }
          }
        }
        var8 = -39 % ((-70 - param1) / 33);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          this.field_o = 69;
          return 3;
        }
        return 3;
    }

    kp() {
        this(0);
    }

    final f a(int param0, byte param1, int param2) {
        wd.field_j = wd.field_j - 1;
        fn.field_j = fn.field_j + ob.field_l;
        if (param1 == -110) {
          return new pf(param2, param0, (f) (this)).a(param0, (byte) -110, param2);
        }
        kp.b(true);
        return new pf(param2, param0, (f) (this)).a(param0, (byte) -110, param2);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        ig stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ob.field_l = ob.field_l - 1;
          mb.field_g = mb.field_g - wd.field_j;
          fn.field_j = fn.field_j + wd.field_j;
          ob.field_l = ob.field_l - 1;
          if (param5 != -87) {
            field_l = (String) null;
          }
          b.field_a = b.field_a - 1;
          we.field_h = we.field_h - 2;
          fp.field_a = fp.field_a - 2;
          je.field_j = je.field_j - 1;
          if (param4 == null) {
            return (f) (this);
          }
          dd.field_c.a(32, param2 * 12, param1 * 12, 0, (byte) -111);
          stackIn_7_0 = new ig(param0, param4, (f) (this), false);
          return (f) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("kp.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16736352) {
            this.b(false, true);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("kp.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(')').toString());
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_n = null;
        field_l = null;
        if (param0) {
          field_m = -48;
          field_k = null;
          return;
        }
        field_k = null;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        dl[] var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -21) {
            return true;
          }
          var9 = (dl[]) null;
          this.a((f) null, 35, 9, (f[][]) null, (dl[]) null, (byte) -34);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("kp.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
          kp.b(true);
          this.field_o = param0;
          return;
        }
        this.field_o = param0;
    }

    kp(int param0) {
        this.field_i = -1;
        this.field_o = param0;
    }

    static {
        field_k = new mk();
        field_j = 33;
        field_l = "Killed a Friend";
    }
}
