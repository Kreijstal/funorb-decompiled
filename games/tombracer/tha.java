/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tha extends b implements tsa {
    static String field_A;
    static String field_B;
    private rj field_x;
    private rj field_z;
    private rj field_w;
    static String field_y;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_i + param0;
        int var6 = param1 + this.field_n;
        mj.field_J.a(bb.field_q, var5 + 20, 20 + var6, -40 + this.field_m, -50 + this.field_p, 16777215, -1, 1, param2, mj.field_J.field_w);
        super.a(param0, param1, 0, param3);
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        int var3 = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        double var18_double = 0.0;
        int var18 = 0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          if (cla.field_m != null) {
            return;
          }
          cla.field_m = new int[65536];
          var1_double = 0.7 + (Math.random() * 0.03 - 0.015);
          var3 = 0;
          if (param0 != 906) {
            field_y = (String) null;
          }
          while (var3 < 65536) {
            var4 = (double)(63 & var3 >> 10) / 64.0 + 0.0078125;
            var6 = 0.0625 + (double)((var3 & 906) >> 7) / 8.0;
            var8 = (double)(127 & var3) / 128.0;
            var10 = var8;
            var12 = var8;
            var14 = var8;
            if (var6 != 0.0) {
              if (!(var8 < 0.5)) {
                var16_double = -(var8 * var6) + (var6 + var8);
              } else {
                var16_double = (1.0 + var6) * var8;
              }
              var18_double = 2.0 * var8 - var16_double;
              var20 = var4 + 0.3333333333333333;
              if (var20 > 1.0) {
                var20 = var20 - 1.0;
              }
              var22 = var4;
              var24 = -0.3333333333333333 + var4;
              if (var24 < 0.0) {
                var24 = var24 + 1.0;
              }
              if (!(1.0 > var22 * 6.0)) {
                if (!(1.0 > 2.0 * var22)) {
                  if (!(2.0 > 3.0 * var22)) {
                    var12 = var18_double;
                  } else {
                    var12 = var18_double + 6.0 * ((-var22 + 0.6666666666666666) * (var16_double - var18_double));
                  }
                } else {
                  var12 = var16_double;
                }
              } else {
                var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
              }
              if (!(1.0 > var20 * 6.0)) {
                if (!(1.0 > var20 * 2.0)) {
                  if (!(3.0 * var20 < 2.0)) {
                    var10 = var18_double;
                  } else {
                    var10 = 6.0 * ((0.6666666666666666 - var20) * (-var18_double + var16_double)) + var18_double;
                  }
                } else {
                  var10 = var16_double;
                }
              } else {
                var10 = var18_double + (-var18_double + var16_double) * 6.0 * var20;
              }
              if (!(1.0 > var24 * 6.0)) {
                if (1.0 > var24 * 2.0) {
                  var14 = var16_double;
                } else {
                  if (2.0 > 3.0 * var24) {
                    var14 = (-var18_double + var16_double) * (0.6666666666666666 - var24) * 6.0 + var18_double;
                  } else {
                    var14 = var18_double;
                  }
                }
              } else {
                var14 = (var16_double - var18_double) * 6.0 * var24 + var18_double;
              }
              var10 = Math.pow(var10, var1_double);
              var12 = Math.pow(var12, var1_double);
              var14 = Math.pow(var14, var1_double);
              var16 = (int)(256.0 * var10);
              var17 = (int)(var12 * 256.0);
              var18 = (int)(var14 * 256.0);
              var19 = (var17 << 8) + (var16 << 16) + var18;
              cla.field_m[var3] = var19;
            } else {
              var10 = Math.pow(var10, var1_double);
              var12 = Math.pow(var12, var1_double);
              var14 = Math.pow(var14, var1_double);
              var16 = (int)(256.0 * var10);
              var17 = (int)(var12 * 256.0);
              var18 = (int)(var14 * 256.0);
              var19 = (var17 << 8) + (var16 << 16) + var18;
              cla.field_m[var3] = var19;
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "tha.D(" + param0 + ')');
        }
    }

    public tha() {
        super(0, 0, 476, 225, (isa) null);
        this.field_z = new rj(foa.field_a, (qc) null);
        this.field_w = new rj(kda.field_gd, (qc) null);
        this.field_x = new rj(fca.field_d, (qc) null);
        td var1 = new td();
        this.field_z.field_r = (isa) ((Object) var1);
        this.field_w.field_r = (isa) ((Object) var1);
        this.field_x.field_r = (isa) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_w.a((byte) -31, var4, 30, this.field_m - var3 >> 1, -var2 + (this.field_p - 48));
        this.field_x.a((byte) -31, var4, 30, var4 + (-var3 + this.field_m >> 1) + var2, -var2 + this.field_p - 48);
        this.field_z.a((byte) -31, var3, 30, this.field_m - var3 >> 1, this.field_p + (-78 - var2 * 2));
        this.field_w.field_h = (qc) (this);
        this.field_z.field_h = (qc) (this);
        this.field_z.field_q = hga.field_n;
        this.field_x.field_h = (qc) (this);
        this.field_x.field_q = tg.field_a;
        this.a(this.field_w, -1);
        this.a(this.field_z, -1);
        this.a(this.field_x, -1);
    }

    public static void c(int param0) {
        int var1 = -116 % ((43 - param0) / 38);
        field_y = null;
        field_B = null;
        field_A = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param4 < 44) {
            tha.a(-94);
          }
          if (param2 == this.field_w) {
            pn.f(-804227775);
            return;
          }
          if (this.field_z == param2) {
            qfa.a((byte) 6);
            return;
          }
          if (this.field_x != param2) {
            return;
          }
          aoa.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("tha.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_5_0 = this.b(param1, (byte) -118);
            return stackIn_5_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_8_0 = this.a(param1, (byte) -9);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("tha.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_B = "All games";
        field_y = "Machinegun";
        field_A = "You have died - but death is not the end. The room's traps will be reset and you'll start again from the entrance. You'll lose any treasure not yet banked.";
    }
}
