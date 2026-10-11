/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends qk {
    static int field_Ob;
    private boolean field_Nb;
    int field_Pb;

    final void w(int param0) {
        this.field_x = 9;
        this.field_y = param0;
        this.e(0, -6904);
    }

    final void g(int param0) {
        int var3;
        wk var4;
        var3 = ZombieDawn.field_J;
        if (param0 <= 95) {
          var4 = (wk) null;
          this.a((byte) -121, (wk) null);
        }
        if (this.field_Gb > 0) {
          this.field_Gb = this.field_Gb - 1;
        }
        if (this.field_F != 0) {
          if (this.field_F == 10 &&
            2 == this.field_G) {
            this.field_yb.z(0);
            this.e(0, -6904);
          }
        } else {
          if (this.field_Pb <= 0) {
            this.p((byte) -119);
          } else {
            this.field_Pb = this.field_Pb - 1;
          }
        }
        this.d(this.field_F, -26109);
    }

    final static void o(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (null != ea.field_c) {
          var1 = ea.field_c;
          synchronized (var1) {
            ea.field_c = null;
          }
        }
        if (param0 >= -72) {
          fc.o((byte) -40);
        }
    }

    final void a(byte param0, wk param1) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          var3_int = param1.a(this.a(true), (byte) -70);
          var4 = param1.a(this.f(237239984), 0);
          var5 = 0;
          if (this.field_F == 10 &&
            var5 == 0) {
            stackIn_6_0 = (this.field_Nb) ? 2 : 1;
            var5 = stackIn_6_0;
          }
          ld.field_l[this.field_t][var5].b(var3_int - 24, var4 - 48);
          if (0 < this.field_Gb) {
            var6 = var3_int - 3;
            if (!this.field_Nb) {
              var6 += 8;
            }
            this.b(var6, (byte) -104, var4);
          }
          if (param0 >= -76) {
            field_Ob = -119;
          }
          if (b.field_h) {
            bi.d(var3_int + 12, 24 + var4, 260, 16711680);
            bi.e(var3_int, var4, 260 + var3_int, 260 + var4, 16711680);
            bi.e(var3_int, var4, -260 + var3_int, 260 + var4, 16711680);
            bj.field_q.c(Integer.toString(var5), var3_int, var4, 16777215, 0);
            bj.field_q.c(Integer.toString(this.field_N), 20 + var3_int, var4, 16777215, 0);
            bj.field_q.c(Integer.toString(this.field_F), var3_int, -20 + var4, 16777215, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("fc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static on a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        on stackIn_9_0 = null;
        on stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          var2_int = 100;
          var3 = 100;
          var4 = new byte[8 + param0.length];
          for (var5 = 0; var5 < 6; var5++) {
            fb.a(var5, var4, (byte) 71, md.a(var5, param0, 72));
          }
          fb.a(6, var4, (byte) -108, var2_int);
          fb.a(7, var4, (byte) 57, var3);
          for (var5Lifetime1 = 6; var5Lifetime1 < param0.length / 4; var5Lifetime1++) {
            fb.a(var5Lifetime1 + 2, var4, (byte) 98, md.a(var5Lifetime1, param0, 105));
          }
          if (param1 >= 45) {
            stackIn_11_0 = gm.a(var4, -27);
            return stackIn_11_0;
          }
          stackIn_9_0 = (on) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("fc.OA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    fc(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Nb = false;
        this.field_Pb = 0;
        this.field_S = 2;
        ha.field_d = this;
    }

    private final void p(byte param0) {
        int var5;
        le var6;
        int var7;
        boolean stackIn_23_1 = false;
        int var2;
        int var3;
        int var4;
        var7 = ZombieDawn.field_J;
        if (this.field_yb != null) {
          this.field_yb = null;
        }
        var5 = -1;
        var6 = dj.field_e.field_R.b((byte) 26);
        while (var6 instanceof fb) {
          if (var6 instanceof kd) {
            if (!((kd) (var6)).x(91)) {
              var6 = var6.field_b;
              continue;
            }
            var2 = ((kd) (var6)).a(true) - this.a(true);
            var3 = ((kd) (var6)).f(237239984) - this.f(237239984);
            if (0 < var3 &&
              Math.abs(var2) < var3) {
              var4 = var2 * var2 + var3 * var3;
              if (var4 < var5 ||
                -1 == var5) {
                this.field_yb = (kd) (var6);
                var5 = var4;
              }
            }
          }
          var6 = var6.field_b;
        }
        if (var5 > 67600) {
          this.field_yb = null;
        }
        if (this.field_yb != null) {
          this.e(10, -6904);
          this.field_Gb = 10;
          this.field_U = dc.a((byte) 18, 44);
          stackIn_23_1 = !(this.field_Nb);
          this.field_Nb = stackIn_23_1;
        } else {
          this.field_Pb = 20;
        }
        if (param0 > -27) {
          fc.o((byte) 99);
        }
    }

    static {
    }
}
