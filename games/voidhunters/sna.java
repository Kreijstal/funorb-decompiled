/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sna extends le {
    private int field_i;

    final int[][] a(int param0, int param1) {
        int[] var30 = null;
        int[] var31 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var32 = null;
        int var17 = VoidHunters.field_G;
        if (param0 != 255) {
          sna.d(-89);
        }
        int[][] var23 = this.field_d.a(param1, (byte) -127);
        int[][] var19 = var23;
        int[][] var18 = var19;
        int[][] var3 = var18;
        if (this.field_d.field_g) {
          var30 = this.a(1, param1, 255);
          var31 = this.a(2, param1, 255);
          var6 = var23[0];
          var7 = var23[1];
          var8 = var23[2];
          for (var9 = 0; hob.field_d > var9; var9++) {
            var10 = var30[var9] * 255 >> 12 & 255;
            var11 = this.field_i * var31[var9] >> 12;
            var12 = jmb.field_q[var10] * var11 >> 12;
            var13 = qta.field_o[var10] * var11 >> 12;
            var14 = var9 + (var12 >> 12) & gbb.field_q;
            var15 = wf.field_d & param1 + (var13 >> 12);
            var32 = this.a((byte) 82, 0, var15);
            var6[var9] = var32[0][var14];
            var7[var9] = var32[1][var14];
            var8[var9] = var32[2][var14];
          }
        }
        return var18;
    }

    final static byte[] a(byte[] param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new byte[param1];
          var3 = var4;
          cua.a(param0, 0, var4, 0, param1);
          if (param2 == 5666) {
            stackIn_4_0 = var4;
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("sna.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static Class a(Object param0, byte param1) {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (Integer.class.isInstance(param0)) {
            stackIn_3_0 = Integer.TYPE;
            return stackIn_3_0;
          }
          if (Byte.class.isInstance(param0)) {
            stackIn_6_0 = Byte.TYPE;
            return stackIn_6_0;
          }
          if (Short.class.isInstance(param0)) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param1 <= 94) {
            stackIn_12_0 = (Class) null;
            return stackIn_12_0;
          }
          if (Long.class.isInstance(param0)) {
            stackIn_16_0 = Long.TYPE;
            return stackIn_16_0;
          }
          if (Boolean.class.isInstance(param0)) {
            stackIn_20_0 = Boolean.TYPE;
            return stackIn_20_0;
          }
          if (Float.class.isInstance(param0)) {
            stackIn_24_0 = Float.TYPE;
            return stackIn_24_0;
          }
          if (Double.class.isInstance(param0)) {
            stackIn_27_0 = Double.TYPE;
            return stackIn_27_0;
          }
          if (!Character.class.isInstance(param0)) {
            return null;
          }
          stackIn_31_0 = Character.TYPE;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("sna.K(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void d(int param0) {
        int var2 = VoidHunters.field_G;
        if ((1 << vqa.field_g.field_L & vqa.field_g.field_m.field_f) != 0) {
          ifa.field_g[8] = ut.field_a;
        } else {
          if (vqa.field_g.field_m.field_f != 0) {
            ifa.field_g[8] = ema.field_q;
          } else {
            ifa.field_g[8] = ds.field_f;
          }
        }
        if (param0 != -19057) {
          sna.d(80);
        }
    }

    public sna() {
        super(3, false);
        this.field_i = 32768;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 > -60) {
            this.field_i = -36;
          }
          var4_int = param0;
          if (var4_int != 0) {
            if (var4_int == 1) {
              stackIn_11_1 = (param2.e((byte) -121) == 1);
              this.field_g = stackIn_11_1;
            }
          } else {
            this.field_i = param2.e(1869) << 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("sna.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var25 = null;
        int[] var26 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var27 = null;
        int var14 = VoidHunters.field_G;
        int[] var15 = this.field_f.a((byte) -42, param0);
        int[] var3 = var15;
        if (this.field_f.field_e) {
          var25 = this.a(1, param0, 255);
          var26 = this.a(2, param0, 255);
          for (var6 = 0; var6 < hob.field_d; var6++) {
            var7 = (4084 & var25[var6]) >> 4;
            var8 = var26[var6] * this.field_i >> 12;
            var9 = var8 * jmb.field_q[var7] >> 12;
            var10 = var8 * qta.field_o[var7] >> 12;
            var11 = gbb.field_q & (var9 >> 12) + var6;
            var12 = wf.field_d & (var10 >> 12) + param0;
            var27 = this.a(0, var12, 255);
            var15[var6] = var27[var11];
          }
        }
        if (!param1) {
          return (int[]) null;
        }
        return var3;
    }

    final void c(byte param0) {
        taa.e((byte) 124);
        if (param0 >= -35) {
          this.field_i = 33;
        }
    }

    static {
    }
}
