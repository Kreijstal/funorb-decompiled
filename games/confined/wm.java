/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends HomingProjectile {
    static int field_db;
    static int field_bb;
    static byte[] field_gb;
    static String field_fb;
    static int field_ab;
    static int field_hb;
    static String field_jb;
    private double field_ib;
    private int field_eb;
    private DynamicLight field_kb;
    private LightningArc[] field_cb;

    final void drawInTunnel(PrimaryNodeDeque param0, double param1, int param2, TunnelCamera param3, DynamicLight param4) {
        try {
          this.a(-116, ImageProducerRasterBuffer.field_o[(this.field_eb & 15) >> 1], param1, param3);
          if (param2 >= -5) {
            field_bb = 59;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wm.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void onLightningArcContact(LightningArc param0, boolean param1) {
        int var3_int = 0;
        LightningArc var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          var3_int = 0;
          if (!param1) {
            field_hb = 92;
          }
          while (this.field_cb.length > var3_int) {
            var4 = this.field_cb[var3_int];
            if (!var4.isLinked((byte) 125)) {
              var4.a(8401151, 0, 50.0, 1.0);
              if (var4.a(this.field_cb, false, 15.0)) {
                this.field_A.field_B.field_Db = this.field_A.field_B.field_Db + 2.0;
                var4.field_Q.field_m = 96;
                this.field_A.field_F.addLast((IntrusiveNode) (var4), (byte) 72);
              }
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wm.CA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    wm(GameSession param0, PlayerShip param1, double[] param2, double param3, boolean param4) {
        super(param0, param1.field_E + param2[9] * param1.field_C, param1.field_t + param2[10] * param1.field_C, param1.field_D + param1.field_C * param2[11], 0.4 * param3, 0.2 * param3, param1, param3 * 128.0, 0.01);
        double var7_double = 0.0;
        this.field_eb = 0;
        this.field_kb = new DynamicLight((TunnelEntity) (this));
        this.field_cb = new LightningArc[]{new LightningArc((TunnelEntity) (this), ki.field_a), new LightningArc((TunnelEntity) (this), ki.field_a), new LightningArc((TunnelEntity) (this), ki.field_a)};
        try {
          this.field_G = param1.field_G + param2[10] * 0.4;
          this.field_K = 0.4 * param2[9] + param1.field_K;
          this.field_L = 0.4 * param2[11] + param1.field_L;
          if (param4) {
            var7_double = Math.sqrt(this.field_K * this.field_K + this.field_G * this.field_G + this.field_L * this.field_L);
            if (0.001 > var7_double) {
              var7_double = 0.001;
            }
            this.field_W = param1.a(this.field_K / var7_double, this.field_G / var7_double, this.field_L / var7_double, false);
          }
          gd.a((int)(param3 * 96.0), -125, vm.field_cb, param1);
          new gk((TunnelEntity) (this), pn.field_k).field_w = 8.0 * param3;
          this.field_ib = param3 * 32.0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean canBeHitByLightningArcFrom(TunnelEntity param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 72) {
            field_ab = 32;
          }
          stackIn_3_0 = param0.isAlliedWithPlayer(param1 ^ -61);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wm.WA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_fb = null;
        field_jb = null;
        field_gb = null;
        if (param0 != -30002) {
          wm.releaseDeclaredStaticReferences(103);
        }
    }

    final void b(MovingTunnelEntity param0, int param1) {
        LightningArc var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 == this.field_R &&
            this.field_Q > 0) {
            this.field_Q = this.field_Q + 1;
            return;
          }
          this.field_ib = param0.applyDamage(14170, true, this.field_ib);
          if (0.00001 > this.field_ib) {
            this.a(param0, 0.0, -101);
            param0.applyDamage(14170, false, this.field_V);
            this.d(10797);
          }
          if (param1 >= -122) {
            var4 = (LightningArc) null;
            this.onLightningArcContact((LightningArc) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wm.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void handleDestruction(int param0) {
        ShockwaveBlast var2 = new ShockwaveBlast((TunnelEntity) (this), 6.0, 0.3, 0.0003, jd.field_a);
        var2.field_M.field_w = this.field_C / 0.4 * 4.0;
        ri.a((IntrusiveNode) (this), 0, var2);
        if (param0 != 26402) {
          this.field_cb = (LightningArc[]) null;
        }
        this.field_z = true;
    }

    final void updateForTunnelSegment(int param0, int param1) {
        this.field_eb = this.field_eb + 1;
        super.updateForTunnelSegment(param0, param1);
        if (this.field_D >= this.field_A.field_x.field_r[-1 + this.field_A.field_x.field_a]) {
          this.field_z = true;
          this.field_s = 2;
        }
    }

    final static RgbSprite a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (!param1) {
          wm.a(-107, false, -49);
        }
        RgbSprite var6 = new RgbSprite(param0, param0);
        RgbSprite var3 = var6;
        for (var4 = 0; var4 < var3.field_z.length; var4++) {
          var6.field_z[var4] = param2;
        }
        return var3;
    }

    final void collectEntityLights(PrimaryNodeDeque param0, byte param1) {
        try {
          int var3_int = 111 % ((-2 - param1) / 62);
          this.field_kb.field_o = this.field_t;
          this.field_kb.field_p = this.field_D;
          this.field_kb.field_t = this.field_E;
          this.field_kb.field_u = 100.0 * this.field_C;
          param0.addLast((IntrusiveNode) (this.field_kb), (byte) -74);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 27) {
            field_hb = -83;
          }
          stackIn_3_0 = PrimaryNodeDeque.field_e.getFileByName(-98, "", param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wm.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_gb = new byte[240640];
        field_fb = "<col=FFFFFF>Rapid fire:</col> this radically increases your basic weapon's firing rate. Remember you can't fire continuously without your ready energy meter running out, so time your firing carefully.";
        field_hb = 0;
    }
}
