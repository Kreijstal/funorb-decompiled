/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hna extends pca implements DiffableState {
    int mousey;
    int mousex;
    static int field_s;
    static int field_n;
    SpecialOrderSubmessage specialOrderSubmessage;
    int triggers;

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.b(param0, -123);
          if (param1 > -109) {
            this.mousey = 115;
          }
          param0.a(-632, this.triggers, 16);
          param0.a(-632, this.mousex, 32);
          param0.a(-632, this.mousey, 32);
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -126;
          stackIn_5_2 = (this.specialOrderSubmessage != null);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.specialOrderSubmessage.b(param0, -115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hna.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        hna var3 = null;
        hna var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = (hna) (param1);
          var3 = var4;
          super.b((byte) 88, param1);
          var4.mousex = this.mousex;
          if (param0 < 54) {
            field_n = 80;
          }
          var4.triggers = this.triggers;
          var4.mousey = this.mousey;
          if (null != this.specialOrderSubmessage) {
            if (var3.specialOrderSubmessage == null) {
              var3.specialOrderSubmessage = new SpecialOrderSubmessage();
            }
            this.specialOrderSubmessage.b((byte) 127, var3.specialOrderSubmessage);
          } else {
            var4.specialOrderSubmessage = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("hna.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(World param0, lta param1, boolean param2, byte param3) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        lta var13 = null;
        Random var14 = null;
        aja var15 = null;
        lta var16 = null;
        aja var17 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var8Lifetime1Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          var4_int = param0.getWidth((byte) -122) >> 1;
          if (param3 != -59) {
            return;
          }
          var5 = param0.m(1) >> 1;
          if (hbb.field_z > 0) {
            var14 = new Random(234890L);
            for (var7 = 0; var7 < hbb.field_z; var7++) {
              var8 = hob.a(var14, param0.getWidth((byte) -122), 127) - var4_int;
              var9 = -var5 + hob.a(var14, param0.m(1), param3 + 175);
              var10 = hob.a(var14, 800, param3 + 179) + 200;
              var11 = (int)(param1.field_a * (float)(var10 << 8));
              if (var11 > 255) {
                var11 = 255;
              }
              SetMissileLauncherEnergyUsed.a(8947865, (byte) 7, param1.b(true, var9), (float)(int)((float)var10 * param1.field_a), var11, param1.a(var8, (byte) 121));
            }
          }
          if (li.field_i &&
            AwardVictoryToWinnerAction.field_b == 1) {
            var13 = new lta();
            var16 = var13;
            var16.field_d = param1.field_d;
            var16.field_e = param1.field_e;
            if (1 == GetMissilesExplosionPower.field_p ||
              null == psb.field_b) {
              var16.field_b = param1.field_b;
              var16.field_a = param1.field_a / 32.0f + 0.00011081559932790697f;
              var13.field_c = param1.field_c;
              var15 = mmb.field_d[7];
              var8Lifetime1 = 4194304;
              lo.a(0, var8Lifetime1, var15, var16);
            }
            if (SetSalvoDamageMultiplier.field_o == 1) {
              var16.field_c = param1.field_c;
              var16.field_a = param1.field_a / 64.0f + 0.00005540779966395348f;
              var13.field_b = param1.field_b;
              var17 = mmb.field_d[6];
              var8Lifetime1Lifetime1 = 4194304;
              lo.a(0, var8Lifetime1Lifetime1, var17, var16);
            }
          }
          var6 = param1.a(-var4_int, (byte) 124) - 1;
          var7Lifetime1 = param1.a(var4_int, (byte) 123) + 1;
          var8Lifetime2 = -1 + param1.b(true, -var5);
          var9Lifetime1 = param1.b(true, var5) + 1;
          if (li.field_i) {
            if (GetLaserAimarc.field_p) {
              GetDebrisGroupColour.field_r.U(var6, var8Lifetime2, var7Lifetime1 - var6, 16777215, 0);
              GetDebrisGroupColour.field_r.U(var6, var9Lifetime1, -var6 + var7Lifetime1, 16777215, 0);
              GetDebrisGroupColour.field_r.P(var6, var8Lifetime2, -var8Lifetime2 + var9Lifetime1, 16777215, 0);
              GetDebrisGroupColour.field_r.P(var7Lifetime1, var8Lifetime2, -var8Lifetime2 + var9Lifetime1, 16777215, 0);
            }
          } else {
            dma.h(var6, var8Lifetime2, -var6 + var7Lifetime1, 16777215);
            dma.h(var6, var9Lifetime1, -var6 + var7Lifetime1, 16777215);
            dma.d(var6, var8Lifetime2, var9Lifetime1 - var8Lifetime2, 16777215);
            dma.d(var7Lifetime1, var8Lifetime2, var9Lifetime1 - var8Lifetime2, 16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("hna.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        hna var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3 = (hna) (param1);
          var4 = -118 / ((param0 - 22) / 59);
          if (!super.a((byte) 90, param1) &&
            this.triggers == var3.triggers &&
            this.mousex == var3.mousex &&
            var3.mousey == this.mousey) {
            stackIn_7_0 = (var3.specialOrderSubmessage != null) ? 0 : 1;
            if (this.specialOrderSubmessage != null) {
              stackIn_10_1 = 0;
            } else {
              stackIn_10_1 = 1;
            }
            if ((stackIn_7_0 ^ stackIn_10_1) == 0 && (this.specialOrderSubmessage == null ||
              !this.specialOrderSubmessage.a((byte) 94, var3.specialOrderSubmessage))) {
              stackIn_16_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_16_0 = true;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("hna.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, param1);
          this.triggers = param0.i(0, 16);
          this.mousex = param0.i(0, 32);
          this.mousey = param0.i(0, 32);
          if (kv.a(false, param0)) {
            if (this.specialOrderSubmessage == null) {
              this.specialOrderSubmessage = new SpecialOrderSubmessage();
            }
            this.specialOrderSubmessage.a(param0, false);
          } else {
            this.specialOrderSubmessage = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hna.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.specialOrderSubmessage = new SpecialOrderSubmessage();
        if (param2 != -30790) {
          this.specialOrderSubmessage = (SpecialOrderSubmessage) null;
        }
        this.specialOrderSubmessage.vote = new PlayerVote(param1, param0);
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        hna var5 = null;
        try {
          super.reportDifferences(other, -94);
          var5 = (hna) (other);
          if (null != this.specialOrderSubmessage &&
            null != var5.specialOrderSubmessage) {
            this.specialOrderSubmessage.reportDifferences(var5.specialOrderSubmessage, -51);
          }
          var4 = 0;
          if (this.triggers != var5.triggers) {
            System.out.println("int triggers has changed. before=" + var5.triggers + ", now=" + this.triggers);
            var4 = 1;
          }
          if (var5.mousex != this.mousex) {
            var4 = 1;
            System.out.println("int mousex has changed. before=" + var5.mousex + ", now=" + this.mousex);
          }
          if (obfuscationGuard > -19) {
            return;
          }
          if (this.mousey != var5.mousey) {
            System.out.println("int mousey has changed. before=" + var5.mousey + ", now=" + this.mousey);
            var4 = 1;
          }
          stackIn_15_0 = (this.specialOrderSubmessage != null) ? 0 : 1;
          if (null != var5.specialOrderSubmessage) {
            stackIn_18_1 = 0;
          } else {
            stackIn_18_1 = 1;
          }
          if ((stackIn_15_0 ^ stackIn_18_1) != 0 ||
            null != this.specialOrderSubmessage &&
            this.specialOrderSubmessage.a((byte) 84, var5.specialOrderSubmessage)) {
            System.out.println("SpecialOrderSubmessage special_order_submessage has changed. before=" + var5.specialOrderSubmessage + ", now=" + this.specialOrderSubmessage);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of PlayerAction has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("hna.F(");
          if (other == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(mfa param0, int param1, tja param2) {
        Player stackIn_26_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        Player var5 = null;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        GameSnapshot var9 = null;
        Ship var10 = null;
        Ship var11 = null;
        var8 = VoidHunters.field_G;
        try {
          if (this.c(-12)) {
            return;
          }
          if (param1 != 0) {
            return;
          }
          var9 = (GameSnapshot) (param2);
          if (null != this.specialOrderSubmessage &&
            null != this.specialOrderSubmessage.settingsChange) {
            var9.settings.a(param1 ^ 42, this.specialOrderSubmessage.settingsChange);
            return;
          }
          var5 = var9.a(this.field_k, (byte) 59);
          if (this.specialOrderSubmessage != null &&
            this.specialOrderSubmessage.spawnchoice != null) {
            if (var5.spawnChoice == this.specialOrderSubmessage.spawnchoice.choice) {
              var9.world.g(-1, this.field_k);
              return;
            }
            var5.spawnChoice = this.specialOrderSubmessage.spawnchoice.choice;
            return;
          }
          if (this.specialOrderSubmessage != null &&
            this.specialOrderSubmessage.vote != null) {
            if (this.specialOrderSubmessage.vote.unvote) {
              var5.a(this.specialOrderSubmessage.vote.option, (byte) -66);
              return;
            }
            var6 = var9.missionState.getMissionPhase(8);
            if (var6 == 1) {
              var5.a(13, this.specialOrderSubmessage.vote.option, 30024, 0, sl.field_a);
              return;
            }
            if (2 != var6) {
              return;
            }
            var5.a(30, this.specialOrderSubmessage.vote.option, 30024, 14, GetPhasedEnergyBeamReload.field_q);
            return;
          }
          if (this.specialOrderSubmessage != null &&
            this.specialOrderSubmessage.blueprint != null) {
            var11 = var9.world.d(this.field_k, 80);
            if (var11 != null) {
              var11.a((byte) 34, this.specialOrderSubmessage.blueprint);
              return;
            }
            if (!GetToggledScoreboard.a((byte) -128, var9.world.d(false))) {
              return;
            }
            var10 = new Ship();
            try {
              var10.chassis = SetSniperCannonProjectileLife.a(param1 + 1, this.specialOrderSubmessage.blueprint.description);
              var10.e((byte) 119);
              var10.chassis.a((byte) 0, (ShipBody) (var10));
              var5.savedShip = var10;
              var9.world.g(param1 - 1, this.field_k);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = (Exception) (Object) decompiledCaughtException;
              SetVelocitySustainMax.a((Throwable) ((Object) var7), true, "Invalid blueprint action from player " + this.field_k + " AKA " + param0.a(1, this.field_k));
            }
            return;
          }
          stackIn_26_0 = var5;
          if (this.specialOrderSubmessage == null) {
            stackIn_27_1 = -1;
          } else {
            stackIn_27_1 = this.specialOrderSubmessage.ordertype;
          }
          stackIn_26_0.specialorder = stackIn_27_1;
          var5.triggers = this.triggers;
          if (fra.field_a != 0 &&
            this.mousex == -2 &&
            this.mousey == -2) {
            return;
          }
          var5.aimtargety = this.mousey;
          var5.aimtargetx = this.mousex;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("hna.A(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    public final String toString() {
        return "Tick=" + this.field_e + ", system=" + this.field_d + ", playerid=" + this.field_k + ",triggers=" + this.triggers + ", mousex=" + this.mousex + ", mousey=" + this.mousey + " specialorder=" + this.specialOrderSubmessage;
    }

    public hna() {
    }

    static {
        field_s = 1;
        field_n = 88;
        qb discarded$0 = new qb();
    }
}
