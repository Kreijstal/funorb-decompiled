/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Weapon {
    int field_l;
    private int field_i;
    int field_t;
    boolean field_c;
    Effect effect;
    int field_h;
    static float field_u;
    int maxAmmo;
    private boolean field_j;
    int field_s;
    int field_o;
    boolean field_m;
    private int field_w;
    int field_k;
    private int cooldown;
    int field_d;
    int field_r;
    int ammo;
    int field_b;
    private boolean field_e;
    boolean field_y;
    private int field_g;
    int field_n;
    int field_a;
    boolean field_x;

    final int getCooldown(int param0) {
        if (param0 != 524288) {
          this.field_e = false;
          return this.cooldown;
        }
        return this.cooldown;
    }

    final int d(int param0) {
        if (param0 <= 18) {
          this.field_k = -112;
          return this.field_d;
        }
        return this.field_d;
    }

    final void a(BitPacketBuffer param0, byte param1) {
        boolean discarded$0 = false;
        try {
          param0.writeBits((byte) -127, this.field_r, 5);
          if (param1 <= 3) {
            discarded$0 = this.hasUnlimitedAmmo((byte) 22);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "roa.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setCooldown(int param0, byte param1) {
        if (param1 <= 11) {
          return;
        }
        this.cooldown = param0;
    }

    final Effect getEffect(byte param0) {
        if (param0 != -16) {
          this.refillAmmo(6, true);
          return this.effect;
        }
        return this.effect;
    }

    final void refillAmmo(int param0, boolean param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (param1) {
          this.ammo = -1;
          var3 = -22 / ((46 - param0) / 36);
          return;
        }
        this.ammo = this.maxAmmo;
        var3Lifetime1 = -22 / ((46 - param0) / 36);
    }

    final void c(int param0) {
        if (this.cooldown > 0) {
          this.cooldown = this.cooldown - 1;
        }
        if (param0 >= -1) {
          this.field_w = -55;
          return;
        }
    }

    final void b(int param0, boolean param1) {
        if (param1) {
          this.effect = (Effect) null;
          this.cooldown = param0;
          return;
        }
        this.cooldown = param0;
    }

    final boolean a(int param0) {
        if (param0 != 12111) {
          this.effect = (Effect) null;
          if (!this.hasUnlimitedAmmo((byte) 125)) {
            return this.ammo > 0 ? true : false;
          }
          return true;
        }
        if (this.hasUnlimitedAmmo((byte) 125)) {
          return true;
        }
        if (this.ammo <= 0) {
          return false;
        }
        return true;
    }

    final Weapon e(int param0) {
        if (param0 != -1) {
          return (Weapon) null;
        }
        return TextureOperator.a(this.field_r, -1);
    }

    final boolean a(int param0, int param1, WorldBody param2, int param3, int param4, Room param5, int param6, int param7, int param8, boolean param9) {
        int var16 = 0;
        Projectile stackIn_31_0 = null;
        boolean stackIn_32_1 = false;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        IsaacCipher var15 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Projectile var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 >= this.cooldown &&
            this.a(12111)) {
            var11_int = MouseInputHandler.sin2048((byte) 122, param0 >> 2);
            if (param9) {
              this.field_w = 123;
            }
            var12 = bua.cos2048(0, param0 >> 2);
            var13 = param3 + gqa.a(var11_int, (byte) 24, param8);
            var14 = param4 + gqa.a(var12, (byte) 24, param8);
            if (!this.field_m) {
              param7 = 0;
              param6 = 0;
            }
            var15 = param5.getRandom(-121);
            for (var16 = 0; this.field_g > var16; var16++) {
              var17 = param0;
              if (0 < this.field_s) {
                var17 = var17 + (var15.nextBounded(this.field_s, 0) - this.field_s / 2);
              }
              var18 = MouseInputHandler.sin2048((byte) 110, var17 >> 2);
              var19 = bua.cos2048(0, var17 >> 2);
              var20 = this.field_n;
              if (this.field_w > 0) {
                var20 = var20 + var15.nextBounded(this.field_w, 0);
              }
              var21 = param6 + gqa.a(var18, (byte) 24, var20);
              var22 = param7 + gqa.a(var19, (byte) 24, var20);
              var23 = param5.spawnProjectile(var14, var13, 127, param1);
              var23.init(this.field_a, param5, this.field_l, 66, this.field_b, this.field_k);
              var23.setVelocity(var21, var22, (byte) -92);
              var24 = var15.nextBounded(8192, 0);
              if (3 == this.field_b) {
                var25 = -512 + var15.nextBounded(1024, 0);
                var23.setSpinAndAngle(7, var25, var24);
              } else {
                if (this.field_b == 2) {
                  var23.setSpinAndAngle(7, 128, var24);
                }
              }
              var23.setEffect(-126, new Effect(param2, this.effect));
              if (this.field_i != -1) {
                var23.a(this.field_i, -38);
              }
              if (this.field_x) {
                var23.setHighCollision(true, 101);
              }
              if (this.field_c) {
                stackIn_31_0 = var23;
                stackIn_32_1 = !(param9);
                ((Projectile) (Object) stackIn_31_0).a(stackIn_32_1, true);
              }
              if (this.field_j) {
                var23.setExpandsOnImpact(true, true);
              }
              if (this.field_y) {
                var23.setPushesObjects(-1, true);
              }
              var23.field_m = this.field_t;
            }
            this.cooldown = this.field_h;
            if (this.ammo > 0) {
              this.ammo = this.ammo - 1;
            }
            if (this.field_e) {
              param5.getParticleEffects(false).spawnMuzzleFlash((byte) 89, param1, var14, var13, param0);
            }
            param5.queueSound(param4, param3, this.field_o, param1, (byte) 6);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_49_0 = var11;
          stackIn_49_1 = new StringBuilder().append("roa.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final boolean hasUnlimitedAmmo(byte param0) {
        if (param0 < 99) {
          return false;
        }
        return this.ammo == -1 ? true : false;
    }

    Weapon() {
        this.field_i = -1;
        this.field_o = -1;
        this.field_g = 1;
        this.field_t = -1;
        this.field_y = true;
        this.field_a = 524288;
        this.field_n = 524288;
        this.field_k = 100;
        this.field_l = 524288;
    }

    final int a(boolean param0) {
        if (!param0) {
          this.getEffect((byte) -20);
          return this.field_h;
        }
        return this.field_h;
    }

    static {
    }
}
