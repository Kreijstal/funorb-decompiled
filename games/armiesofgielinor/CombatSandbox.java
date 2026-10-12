/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CombatSandbox {
    private int[] field_i;
    CombatPresentation combatPresentation;
    private RgbSprite[] field_f;
    private int field_c;
    static pf field_j;
    private ia field_d;
    private ia field_a;
    private r[] field_l;
    private tu field_m;
    private ia field_h;
    static String field_g;
    static String field_e;
    private RgbSprite[] field_b;

    private final void b(byte param0) {
        this.field_d = new ia(this.field_b, this.field_m, this.field_i, "Attacker", 0, 0);
        this.field_h = new ia(this.field_b, this.field_m, this.field_i, "Defender", 0, 0);
        this.field_a = new ia(this.field_b, this.field_m, this.field_i, "Run Attack", 0, 0);
        this.field_l = new r[6];
        this.field_l[0] = new r(this.field_b, this.field_f, this.field_m, this.field_i, af.field_a, 0, 0);
        this.field_l[1] = new r(this.field_b, this.field_f, this.field_m, this.field_i, af.field_a, 0, 0);
        this.field_l[2] = new r(this.field_b, this.field_f, this.field_m, this.field_i, ts.field_d, 0, 0);
        this.field_l[3] = new r(this.field_b, this.field_f, this.field_m, this.field_i, ts.field_d, 0, 0);
        this.field_l[4] = new r(this.field_b, this.field_f, this.field_m, this.field_i, PlayerProfile.field_i, 0, 0);
        if (param0 != -49) {
          this.field_a = (ia) null;
        }
        this.field_l[5] = new r(this.field_b, this.field_f, this.field_m, this.field_i, PlayerProfile.field_i, 0, 0);
    }

    private final int a(int param0, byte param1) {
        if (param0 == 0) {
          return this.field_d.c(-29408);
        }
        if (param1 != -42) {
          field_j = (pf) null;
        }
        if (param0 == 1) {
          return this.field_l[0].n(-18332);
        }
        if (param0 == 2) {
          return this.field_l[2].n(-18332);
        }
        if (param0 == 3) {
          return this.field_h.c(-29408);
        }
        if (4 == param0) {
          return this.field_l[1].n(-18332);
        }
        if (param0 == 5) {
          return this.field_l[3].n(-18332);
        }
        if (6 == param0) {
          return this.field_a.c(-29408);
        }
        if (param0 == 7) {
          return this.field_l[4].n(-18332);
        }
        if (param0 != 8) {
          return 0;
        }
        return this.field_l[5].n(-18332);
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = param0; this.field_l.length > var2; var2++) {
          if (!this.field_l[var2].g((byte) 97)) {
            this.field_l[var2].f((byte) 124);
          }
        }
        var4 = 0;
        var2Lifetime1 = var4;
        while (var4 < this.field_l.length) {
          if (this.field_l[var4].g((byte) 97)) {
            this.field_l[var4].f((byte) -55);
          }
          var4++;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param2 == 0) {
          this.field_d.a(param3, (byte) 55, param0);
        }
        if (param2 == 1) {
          this.field_l[0].e(-84, param0, param3);
        }
        if (param2 == 2) {
          this.field_l[2].e(-71, param0, param3);
        }
        if (param2 == 3) {
          this.field_h.a(param3, (byte) 127, param0);
        }
        if (param2 == 4) {
          this.field_l[1].e(-59, param0, param3);
        }
        if (param1 > -41) {
          this.a(-21);
        }
        if (param2 == 5) {
          this.field_l[3].e(87, param0, param3);
        }
        if (param2 == 6) {
          this.field_a.a(param3, (byte) 107, param0);
        }
        if (param2 == 7) {
          this.field_l[4].e(-57, param0, param3);
        }
        if (param2 == 8) {
          this.field_l[5].e(-87, param0, param3);
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4, boolean param5) {
        Unit stackIn_24_0;
        Unit stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        Unit stackIn_25_0 = null;
        Unit stackIn_25_1 = null;
        int stackIn_25_8 = 0;
        Unit stackIn_27_0;
        Unit stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        Unit stackIn_28_0 = null;
        Unit stackIn_28_1 = null;
        int stackIn_28_8 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        Unit var18;
        Unit var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var8Lifetime1;
        var24 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.a((byte) -121, param2, param4);
        var7 = param5 ? 1 : 0;
        for (var8 = 0; var8 < this.field_l.length; var8++) {
          this.field_l[var8].a(param0, -18596, param4, param2, param3, param1);
          var7 = var7 != 0 | this.field_l[var8].a((byte) 122) ? 1 : 0;
        }
        if (var7 != 0) {
          this.c((byte) -95);
        }
        if (this.field_a.a(param4, 0, param2) &&
          param0) {
          var8Lifetime1 = this.field_l[0].h(5);
          var9 = this.field_l[1].h(5);
          var10 = this.field_l[2].h(5);
          var11 = this.field_l[3].h(5);
          var12 = 0;
          var13 = 0;
          if (75 == var9) {
            var9 = 34;
            var12 = 1;
          }
          if (var9 == 76) {
            var12 = 1;
            var9 = 7;
          }
          if (var8Lifetime1 == 75) {
            var8Lifetime1 = 34;
            var13 = 1;
          }
          if (var8Lifetime1 == 76) {
            var13 = 1;
            var8Lifetime1 = 7;
          }
          var14 = bw.unitDefinitions[var8Lifetime1][4];
          var15 = var14 / (1 + this.field_l[4].h(5));
          var16 = bw.unitDefinitions[var9][4];
          var17 = var16 / (1 + this.field_l[5].h(5));
          if (var15 == 0) {
            var15++;
          }
          if (var17 == 0) {
            var17++;
          }
          stackIn_24_0 = null;
          stackIn_24_1 = null;
          stackIn_24_2 = 0;
          stackIn_24_3 = 0;
          stackIn_24_4 = var8Lifetime1;
          stackIn_24_5 = 0;
          stackIn_24_6 = var14;
          stackIn_24_7 = var15;
          if (var13 == 0) {
            stackIn_25_0 = null;
            stackIn_25_1 = null;
            stackIn_25_8 = 0;
          } else {
            stackIn_25_0 = null;
            stackIn_25_1 = null;
            stackIn_25_8 = 8;
          }
          var18 = new Unit(stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, 0, 0, (Battlefield) null, 0, 0, -1, true, 0);
          stackIn_27_0 = null;
          stackIn_27_1 = null;
          stackIn_27_2 = 0;
          stackIn_27_3 = 0;
          stackIn_27_4 = var9;
          stackIn_27_5 = 0;
          stackIn_27_6 = var16;
          stackIn_27_7 = var17;
          if (var12 == 0) {
            stackIn_28_0 = null;
            stackIn_28_1 = null;
            stackIn_28_8 = 0;
          } else {
            stackIn_28_0 = null;
            stackIn_28_1 = null;
            stackIn_28_8 = 8;
          }
          var19 = new Unit(stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, 0, 0, (Battlefield) null, 0, 0, -1, true, 0);
          var20 = bw.unitDefinitions[var8Lifetime1][0];
          var21 = bw.unitDefinitions[var9][0];
          var22 = ri.terrainDamageTakenPercent[var11] * (var15 * fk.matchupDamagePercent[var20][var21]) / 10000;
          if (var22 > var17) {
            var22 = var17;
          }
          var23 = (var17 - var22) * (fk.matchupDamagePercent[var21][var20] * ri.terrainDamageTakenPercent[var10]) / 10000;
          this.combatPresentation = new CombatPresentation((Battlefield) null, (BattleCamera) null, (EventPresenter) null);
          this.combatPresentation.a(var22, var19, var23, true, var18);
          le.field_b = new cg();
        }
    }

    final static void a(RgbSprite param0, int param1) {
        if (param1 != 3) {
          return;
        }
        try {
          rq.a((byte) -56);
          SoftwareRaster.a(param0.pixels, param0.canvasWidth, param0.canvasHeight);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "vn.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        int var2 = so.field_b.field_a >> 1;
        int var3 = -this.field_m.field_H + so.field_b.field_g - (this.field_m.field_L << 1);
        int var4 = this.field_i[param0];
        this.field_m.c("Press Esc to return to the main menu", var2, var3, var4, -1);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = 0;
        while (true) {
          if (var4 >= this.field_l.length) {
            var5 = 67 / ((-58 - param0) / 63);
            var7 = 0;
            var4 = var7;
            while (var7 < this.field_l.length) {
              if (var7 == 0) {
                this.field_l[var7].j(0);
              } else {
                this.field_l[var7].e(32);
              }
              var7++;
            }
            return;
          }
          if (!this.field_l[var4].b(param1, 2, param2)) {
            var4++;
            continue;
          }
          break;
        }
        for (var5Lifetime1 = 0; var5Lifetime1 < this.field_l.length; var5Lifetime1++) {
          if (var4 != var5Lifetime1) {
            this.field_l[var5Lifetime1].e(32);
          } else {
            this.field_l[var5Lifetime1].j(0);
          }
        }
        return;
    }

    CombatSandbox(RgbSprite[] param0, RgbSprite[] param1, tu param2, int[] param3, int param4, int param5) {
        this.field_c = 0;
        try {
          this.field_b = param0;
          this.field_m = param2;
          this.field_i = param3;
          this.field_f = param1;
          this.b((byte) -49);
          this.c((byte) -103);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void draw(int obfuscationGuard) {
        if (null != this.combatPresentation) {
          this.combatPresentation.drawBaseLayer((byte) -120);
        } else {
          this.field_d.a(113);
          this.field_h.a(71);
          this.field_a.a(53);
          this.b(0);
        }
        this.a(0);
        if (obfuscationGuard != 2) {
          return;
        }
        if (null != le.field_b) {
          le.field_b.a(8, this.field_c);
        }
    }

    private final int a(byte param0, int param1) {
        if (0 == param1) {
          return this.field_d.a((byte) -25);
        }
        if (param1 == 1) {
          return this.field_l[0].e(true);
        }
        if (param1 == 2) {
          return this.field_l[2].e(true);
        }
        if (param1 == 3) {
          return this.field_h.a((byte) -63);
        }
        if (param1 == 4) {
          return this.field_l[1].e(true);
        }
        if (param1 == 5) {
          return this.field_l[3].e(true);
        }
        if (6 == param1) {
          return this.field_a.a((byte) -127);
        }
        if (param1 == 7) {
          return this.field_l[4].e(true);
        }
        if (param0 != -101) {
          this.a(true, 53, -58, false, -8, false);
        }
        if (param1 == 8) {
          return this.field_l[5].e(true);
        }
        return 0;
    }

    private final void c(byte param0) {
        this.a(10, -50, 0, 10);
        this.a(10, -45, 1, this.a((byte) -101, 0) + 10);
        this.a(10, -44, 2, this.a((byte) -101, 0) + (10 + this.a((byte) -101, 1)));
        if (param0 > -56) {
          this.a(-9);
        }
        this.a(10, -82, 7, this.a((byte) -101, 0) + 10 - (-this.a((byte) -101, 1) - this.a((byte) -101, 3)));
        this.a(630 - this.a(3, (byte) -42), -64, 3, 10);
        this.a(-this.a(4, (byte) -42) + 630, -75, 4, this.a((byte) -101, 3) + 10);
        this.a(630 - this.a(5, (byte) -42), -112, 5, 10 - (-this.a((byte) -101, 3) - this.a((byte) -101, 4)));
        this.a(630 - this.a(8, (byte) -42), -100, 8, this.a((byte) -101, 3) + 10 + this.a((byte) -101, 4) + this.a((byte) -101, 5));
        this.a(320 - this.a(6, (byte) -42) / 2, -84, 6, 360);
    }

    final void advanceFrame(int inputValue, int obfuscationGuard, int screenY, boolean inputActive, int screenX, boolean secondaryInput) {
        if (obfuscationGuard != 5) {
          this.field_c = 0;
        }
        if (le.field_b != null) {
          this.field_c = this.field_c + 1;
          if (50 < this.field_c) {
            le.field_b = null;
            this.field_c = 0;
          }
        }
        if (null != this.combatPresentation) {
          this.combatPresentation.advanceFrame((GameEvent) null, (byte) -121);
          if (this.combatPresentation.isFinished(8865)) {
            this.combatPresentation = null;
            le.field_b = new cg();
          }
          return;
        }
        this.a(inputActive, inputValue, screenX, secondaryInput, screenY, false);
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -8) {
          field_e = (String) null;
        }
        field_e = null;
        field_g = null;
    }

    static {
        field_g = "Most kills";
        field_e = "Play the game without logging in just yet";
        field_j = new pf("email");
    }
}
