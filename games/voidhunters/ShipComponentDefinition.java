/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShipComponentDefinition {
    int maxHealth;
    int mass;
    int[][] field_A;
    WeaponBehaviour field_c;
    int energyCapacity;
    int field_a;
    ArmBehaviour field_e;
    boolean field_r;
    HardpointDefinition[] hardpoints;
    boolean field_k;
    GrappleLauncherBehaviour field_x;
    boolean field_s;
    int connectionY;
    ShieldBehaviour field_g;
    int field_q;
    int field_y;
    int field_h;
    int connectionX;
    int[][] field_w;
    ThrusterBehaviour field_t;
    int healthScale;
    private int encodedSpecialOrderId;
    boolean field_f;
    int field_B;
    int[] outline;
    boolean field_m;
    int boundingRadius;
    int field_d;

    final void setHealthScale(int param0, boolean param1) {
        this.healthScale = param0;
        if (!param1) {
          this.setSpecialOrderId((byte) -121, -90);
        }
        this.maxHealth = lw.a((byte) -73, this.mass) * this.healthScale;
    }

    final int getCategoryColor(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        var2 = this.field_a;
        if (var2 == 0) {
          return 14100520;
        }
        if (var2 == 1) {
          return 2640343;
        }
        if (var2 == 2) {
          return 14120488;
        }
        if (var2 == 3) {
          return 14474460;
        }
        if (4 == var2) {
          return 14100652;
        }
        if (var2 == 5) {
          return 4839208;
        }
        if (var2 == 6) {
          return 9382103;
        }
        if (param0 != 14951) {
          this.getCategoryColor(-100);
        }
        return 16711935;
    }

    final void scaleGeometry(int param0, int param1, boolean param2) {
        int var6 = 0;
        HardpointDefinition dupTemp$0 = null;
        HardpointDefinition dupTemp$1 = null;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var4Lifetime1;
        this.connectionX = this.connectionX << param0;
        this.connectionY = this.connectionY << param0;
        for (var4 = 0; var4 < this.outline.length; var4++) {
          this.outline[var4] = this.outline[var4] << param0;
        }
        if (param1 <= 57) {
          this.getCategoryColor(8);
        }
        if (this.hardpoints != null) {
          var6 = 0;
          var4Lifetime1 = var6;
          while (this.hardpoints.length > var6) {
            dupTemp$0 = this.hardpoints[var6];
            dupTemp$0.field_b = dupTemp$0.field_b << param0;
            dupTemp$1 = this.hardpoints[var6];
            dupTemp$1.field_c = dupTemp$1.field_c << param0;
            var6++;
          }
        }
        if (param2) {
          this.calculateMass(true);
        }
        this.calculateBoundingRadius((byte) 110);
    }

    private final void calculateBoundingRadius(byte param0) {
        int var2 = 0;
        int var3;
        int var4;
        HardpointDefinition var5;
        var4 = VoidHunters.field_G;
        if (param0 <= 85) {
          var5 = (HardpointDefinition) null;
          this.addHardpoint(-102, (HardpointDefinition) null);
        }
        this.boundingRadius = 0;
        for (var2 = 0; this.outline.length > var2; var2 += 2) {
          var3 = ar.a(this.outline[var2], (byte) 109, this.outline[var2 + 1]);
          if (var3 > this.boundingRadius) {
            this.boundingRadius = var3;
          }
        }
    }

    final void setSpecialOrderId(byte param0, int param1) {
        this.encodedSpecialOrderId = param1 + 1;
        if (param0 >= -100) {
          this.getSpecialOrderId(-15);
        }
    }

    private final void calculateMass(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        this.mass = 0;
        if (!param0) {
          this.field_e = (ArmBehaviour) null;
        }
        for (var2 = 0; this.outline.length - 2 > var2; var2 += 2) {
          var3 = this.outline[var2];
          var4 = this.outline[1 + var2];
          var5 = this.outline[var2 + 2];
          var6 = this.outline[var2 + 3];
          this.mass = this.mass + (-(var5 * var4) + var6 * var3);
        }
        this.mass = this.mass / 2;
        if (this.mass == 0) {
          this.mass = 1;
        }
        if (this.mass < 0) {
          this.mass = 2147483647;
        }
        this.maxHealth = lw.a((byte) -73, this.mass) * this.healthScale;
    }

    final void scaleMassDown(int param0, int param1) {
        this.mass = this.mass >> param1;
        this.maxHealth = lw.a((byte) -73, this.mass) * this.healthScale;
        if (param0 < 100) {
          this.field_A = (int[][]) null;
        }
    }

    final int getSpecialOrderId(int param0) {
        if (param0 != -1) {
          this.calculateBoundingRadius((byte) 101);
        }
        return -1 + this.encodedSpecialOrderId;
    }

    final void addHardpoint(int param0, HardpointDefinition param1) {
        int var5 = 0;
        int var3_int = 0;
        HardpointDefinition[] var4 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = VoidHunters.field_G;
        try {
          var3_int = 34 / ((-69 - param0) / 44);
          if (null != this.hardpoints) {
            var4 = new HardpointDefinition[this.hardpoints.length + 1];
            for (var5 = 0; this.hardpoints.length > var5; var5++) {
              var4[var5] = this.hardpoints[var5];
            }
            var4[this.hardpoints.length] = param1;
            this.hardpoints = var4;
            return;
          }
          this.hardpoints = new HardpointDefinition[1];
          this.hardpoints[0] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wfb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ShipComponentDefinition(int[] param0, int param1, int param2) {
        this.field_f = false;
        this.field_h = 256;
        this.field_r = false;
        try {
          this.outline = param0;
          this.connectionY = param2;
          this.field_s = false;
          this.healthScale = 256;
          this.field_y = 0;
          this.field_B = 256;
          this.field_d = 0;
          this.field_q = 256;
          this.connectionX = param1;
          this.calculateMass(true);
          this.calculateBoundingRadius((byte) 121);
          this.field_k = true;
          this.field_a = 6;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wfb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
