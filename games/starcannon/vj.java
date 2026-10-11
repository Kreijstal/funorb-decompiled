/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends kc implements ga {
    private dk field_Z;
    static boolean field_X;
    static int field_ab;
    static String field_W;
    static volatile boolean field_Y;
    static boolean field_V;

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param2) {
            field_Y = true;
          }
          if (param0 == this.field_Z) {
            this.l(-14064);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("vj.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1, java.math.BigInteger param2, rb param3, int param4, byte param5, java.math.BigInteger param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int var9Lifetime1;
        try {
          var7_int = ek.a(23201, param4);
          if (bd.field_e == null) {
            bd.field_e = new java.security.SecureRandom();
          }
          var12 = new int[4];
          var11 = var12;
          var8 = var11;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = bd.field_e.nextInt();
          }
          if (param5 != 99) {
            vj.e(false);
          }
          if (null == dd.field_a ||
            !(dd.field_a.field_f.length >= var7_int)) {
            dd.field_a = new rb(var7_int);
          }
          dd.field_a.field_g = 0;
          dd.field_a.a(param0, param4, param5 - 20243, param1);
          dd.field_a.a(var7_int, true);
          dd.field_a.a((byte) -81, var12);
          if (th.field_d == null ||
            !(th.field_d.field_f.length >= 100)) {
            th.field_d = new rb(100);
          }
          th.field_d.field_g = 0;
          th.field_d.a(10, param5 - 224);
          var10 = 0;
          var9Lifetime1 = var10;
          while (var10 < 4) {
            th.field_d.c((byte) -106, var12[var10]);
            var10++;
          }
          th.field_d.c(param4, -306);
          th.field_d.a(param2, param6, param5 - 8498);
          param3.a(th.field_d.field_f, th.field_d.field_g, -20144, 0);
          param3.a(dd.field_a.field_f, dd.field_a.field_g, -20144, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("vj.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    private final void l(int param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        if (param0 != -14064) {
          field_ab = 33;
        }
    }

    public static void e(boolean param0) {
        field_W = null;
        if (!param0) {
          field_V = false;
        }
    }

    vj(tc param0, ae param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj var4 = null;
        try {
          var3 = null;
          if (param1 == oj.field_j) {
            var3 = wc.field_h;
          } else {
            if (cb.field_d == param1) {
              var3 = kd.field_D;
              this.field_f = this.field_f + 10;
              if (wi.a(-10214)) {
                var3 = cf.field_m;
                this.field_f = this.field_f + 20;
              }
            } else {
              if (param1 == wk.field_b) {
                var3 = mc.field_a;
                this.field_f = this.field_f + 30;
              }
            }
          }
          var4 = new uj((String) (var3), (qg) null);
          var4.field_s = 0;
          var4.field_f = 80;
          var4.field_j = 50;
          var4.field_i = this.field_i;
          var4.field_o = (de) ((Object) new hd(nb.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(true, var4);
          this.field_Z = this.a(mc.field_e, (qg) (this), true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vj.<init>(");
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
          throw sd.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final dk a(String param0, qg param1, boolean param2) {
        dk var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        dk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new dk(param0, param1);
          var4.field_o = (de) ((Object) new gb());
          var5 = -6 + this.field_f;
          this.field_f = this.field_f + 38;
          var4.a(15, -16 + (this.field_i - 14), (byte) 124, 30, var5);
          this.a(param2, var4);
          this.d((byte) -30);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("vj.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_Y = false;
        field_X = false;
        field_W = "Names should contain a maximum of 12 characters";
        field_V = false;
    }
}
