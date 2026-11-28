/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends AcceleratingProjectile {
    static BitmapFont field_cb;
    static int[] field_bb;
    private DynamicLight field_db;
    private TunnelEntity field_eb;

    gm(GameSession param0, MovingTunnelEntity param1, double[] param2, double param3, double param4, double param5) {
        super(param0, param1, 0.4, 0.02, 8.0, param2, param3, param4, param5, fj.field_G);
        this.field_db = new DynamicLight((TunnelEntity) (this));
        try {
          this.field_eb = (TunnelEntity) ((Object) param0.field_B);
          this.field_eb.h(17086);
          kj.a(EditableTextField.field_P, 96, param1);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void updateForTunnelSegment(int param0, int param1) {
        double var3;
        double var5;
        double var7;
        double var9;
        if (this.field_eb != null) {
          var3 = Math.sqrt(this.field_L * this.field_L + (this.field_K * this.field_K + this.field_G * this.field_G));
          if (var3 < 0.001) {
            var3 = 0.001;
          }
          var5 = this.field_K / var3;
          var7 = this.field_G / var3;
          var9 = this.field_L / var3;
          if (!this.a(var9, this.field_eb, var5, 1, var7)) {
            this.b(this.field_eb, (byte) 106);
            this.a(this.field_ab, true);
          } else {
            this.field_eb.f((byte) -119);
            this.field_eb = this.a(var5, var7, var9, false);
            if (null != this.field_eb) {
              this.field_eb.h(17086);
              this.b(this.field_eb, (byte) 106);
              this.a(this.field_ab, true);
            }
          }
        }
        super.updateForTunnelSegment(param0, param1);
        if (!this.field_z) {
          return;
        }
        if (this.field_eb == null) {
          return;
        }
        this.field_eb.f((byte) -123);
        this.field_eb = null;
    }

    final void collectEntityLights(PrimaryNodeDeque param0, byte param1) {
        double[] var13 = null;
        double[] var12 = null;
        double[] var11 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        try {
          var13 = new double[12];
          var12 = var13;
          var11 = var12;
          double[] var3 = var11;
          this.field_ab.a((byte) 112, var13);
          var4 = var13[9];
          var6 = var13[10];
          this.field_db.field_t = -(this.field_C * var4 * 0.8) + this.field_E;
          var8 = var13[11];
          int var10 = 117 / ((-2 - param1) / 62);
          this.field_db.field_o = this.field_t - 0.8 * (var6 * this.field_C);
          this.field_db.field_v = -var8;
          this.field_db.field_w = true;
          this.field_db.field_u = 15.0;
          this.field_db.field_m = -var4;
          this.field_db.field_x = -var6;
          this.field_db.field_p = -(var8 * this.field_C * 0.8) + this.field_D;
          param0.addLast((IntrusiveNode) (this.field_db), (byte) -88);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "gm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void handleDestruction(int param0) {
        if (param0 != 26402) {
          DynamicLight var3 = (DynamicLight) null;
          this.drawInTunnel((PrimaryNodeDeque) null, 0.183731807417079, -74, (TunnelCamera) null, (DynamicLight) null);
          if (null != this.field_eb) {
            this.field_eb.f((byte) -125);
            fl.a(this.a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
            return;
          }
          fl.a(this.a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
          return;
        }
        if (null == this.field_eb) {
          fl.a(this.a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
          return;
        }
        this.field_eb.f((byte) -125);
        fl.a(this.a(-2384, bn.field_b, 1.5, 0.002, 0.5), 4);
    }

    gm(GameSession param0, PlayerShip param1) {
        super(param0, param1, 0.4, 0.02, 64.0, fj.field_G);
        double[] var4 = null;
        this.field_db = new DynamicLight((TunnelEntity) (this));
        try {
          var4 = new double[12];
          double[] var3 = var4;
          this.field_ab.a((byte) 81, var4);
          this.field_eb = param1.a(var4[9], var4[10], var4[11], false);
          if (null != this.field_eb) {
            this.field_eb.h(17086);
          }
          kj.a(EditableTextField.field_P, 96, param1);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 != 15) {
          gm.clearDeclaredStaticReferences(-41);
          field_cb = null;
          field_bb = null;
          return;
        }
        field_cb = null;
        field_bb = null;
    }

    final static void i(byte param0) {
        if (!ka.k(-58)) {
          return;
        }
        if (param0 != -29) {
          return;
        }
        NanoFrameTimer.a(4, false, (byte) -101);
    }

    final void drawInTunnel(PrimaryNodeDeque param0, double param1, int param2, TunnelCamera param3, DynamicLight param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        double[] var15 = null;
        double[] var16 = null;
        double[] var17 = null;
        try {
          if (param2 > -5) {
            return;
          }
          if (this.field_N) {
            return;
          }
          var17 = new double[12];
          var16 = var17;
          var15 = var16;
          var7 = var15;
          this.field_ab.a((byte) 123, var17);
          var8 = var17[9];
          var10 = var17[10];
          var12 = var17[11];
          stackIn_7_0 = (!(var12 * param3.field_N + (param3.field_H * var10 + param3.field_P * var8) > 0.0)) ? 0 : 1;
          var14 = stackIn_7_0;
          if (var14 != 0) {
            this.a(WingPod.field_Y, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
          }
          pa.a(-(this.field_C * var8 * 0.8) + this.field_E, 0.2 * this.field_C, (byte) -11, 256, this.field_D - var12 * this.field_C * 0.8, this.field_t - 0.8 * (var10 * this.field_C), wb.field_a, param1, param3);
          if (var14 != 0) {
            return;
          }
          this.a(WingPod.field_Y, this.field_ab, param4, (byte) 64, param1, param0, param3, 512);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_16_0 = var7_ref;
          stackIn_16_1 = new StringBuilder().append("gm.QA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_bb = new int[8192];
    }
}
