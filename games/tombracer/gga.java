/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends ofa implements tsa {
    private rj field_N;
    static jpa[] field_O;
    static ur field_M;
    static String field_L;

    public static void f(int param0) {
        field_M = null;
        field_O = null;
        field_L = null;
        if (param0 != 0) {
          field_L = (String) null;
        }
    }

    private final rj a(String param0, qc param1, int param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new rj(param0, param1);
          var4.field_r = (isa) ((Object) new td());
          var5 = this.field_p - 6;
          this.field_p = this.field_p + 38;
          if (param2 >= -82) {
            gga.f(16);
          }
          var4.a((byte) -31, -16 + (this.field_m - 14), 30, 15, var5);
          this.a(var4, -1);
          this.c((byte) -75);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("gga.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0, int param1, byte param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = TombRacer.field_G ? 1 : 0;
        if (tl.field_r < 0) {
          return;
        }
        var3 = -135 + param0;
        var4 = -35 + param1;
        if (param2 <= 81) {
          gga.f(45);
        }
        var5 = 256;
        if (tl.field_r < 75) {
          var5 = (tl.field_r << 8) / 75;
        }
        if (tl.field_r > 200) {
          var5 = (250 - tl.field_r << 8) / 50;
        }
        nm.a(vha.field_a, (byte) 108);
        uoa.b();
        bea.a();
        uw.a(false);
        if (var5 < 256) {
          bea.c(0, 0, bea.field_g, bea.field_a, 0, 256 - var5);
        }
        pfa.a(1);
        if (tl.field_r >= 150) {
          bra.field_O.c(var3 + 15, var4 + 10, var5);
        } else {
          vha.field_a.c(var3, var4);
        }
        var6 = -125 + tl.field_r;
        if (var6 > 0 &&
          50 > var6) {
          if (var6 < 20) {
            var7 = var6 * 256 / 20;
            bw.field_a.a(var3, var4, var7);
          } else {
            if (var6 < 30) {
              bw.field_a.a(var3, var4, 256);
            } else {
              var7 = (50 - var6) * 256 / 20;
              bw.field_a.a(var3, var4, var7);
            }
          }
        }
        var6Lifetime1 = -140 + tl.field_r;
        if (0 < var6Lifetime1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          hca.field_W.c(15 + var3, 10 + var4, var5 * var7Lifetime1 >> 8);
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2 == this.field_N) {
            this.g(256);
          }
          if (param4 < 44) {
            gga.f(-123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("gga.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    gga(jta param0, nt param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae var4 = null;
        try {
          var3 = null;
          if (gj.field_o == param1) {
            var3 = jma.field_o;
          } else {
            if (or.field_j == param1) {
              this.field_p = this.field_p + 10;
              var3 = vca.field_b;
              if (sta.g((byte) 97)) {
                var3 = tj.field_h;
                this.field_p = this.field_p + 20;
              }
            } else {
              if (param1 == uq.field_b) {
                var3 = th.field_s;
                this.field_p = this.field_p + 30;
              }
            }
          }
          var4 = new ae((String) (var3), (qc) null);
          var4.field_p = 80;
          var4.field_m = this.field_m;
          var4.field_n = 50;
          var4.field_i = 0;
          var4.field_r = (isa) ((Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(var4, -1);
          this.field_N = this.a(kh.field_j, (qc) (this), -93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gga.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        if (!this.field_B) {
          return;
        }
        if (param0 == 256) {
          this.field_B = false;
          return;
        }
        rj var3 = (rj) null;
        this.a(14, -50, (rj) null, -113, (byte) -27);
        this.field_B = false;
    }

    static {
        field_M = new ur(8);
        field_L = "Perpetually spinning discs";
    }
}
