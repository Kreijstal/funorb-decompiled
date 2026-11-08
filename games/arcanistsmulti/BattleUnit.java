/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BattleUnit extends DualLinkNode {
    private int field_o;
    int subpixelY;
    BattleUnit linkedUnit;
    int largestDamageSourceId;
    boolean field_D;
    static SceneWidget field_V;
    int y;
    int unitId;
    int velocityX;
    int field_p;
    private int field_N;
    private int field_y;
    int x;
    boolean field_U;
    int unitType;
    double bobPhase;
    private int field_r;
    int subpixelX;
    int largestDamage;
    private int field_O;
    private int field_n;
    boolean field_J;
    private Sprite field_B;
    SpellProjectile attachedProjectile;
    int facing;
    int ownerPlayer;
    static IndexedSprite[] field_v;
    private Sprite field_cb;
    private Sprite field_bb;
    int field_M;
    static byte[] field_m;
    private boolean field_hb;
    int field_q;
    int field_P;
    private int field_t;
    private int field_ab;
    private Battle battle;
    Sprite maskSprite;
    int velocityY;
    private int bounceCount;
    int health;
    private Sprite field_Q;
    private Sprite field_fb;
    static SceneWidget field_S;
    private int field_Z;
    int pendingDamage;
    Sprite field_I;
    boolean moving;
    static String field_K;
    int size;
    static ContextActionMenu field_H;

    final boolean isDead(int obfuscationGuard) {
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != -1) {
            this.isAirborneOrHovering(99);
          }
          stackIn_8_0 = !(this.health > 0) || !(this.isLinked((byte) -81));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.MB(" + obfuscationGuard + ')');
        }
    }

    final int getStatusTimer(int obfuscationGuard) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -110) {
            discarded$1 = this.applyPendingDamage(true);
          }
          stackIn_3_0 = this.field_q;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.JA(" + obfuscationGuard + ')');
        }
    }

    final static int stringHash(CharSequence text, int obfuscationGuard) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = text.length();
          var3 = 0;
          var4 = -72 / ((obfuscationGuard - 4) / 62);
          for (var5 = 0; var2_int > var5; var5++) {
            var3 = PendingTask.encodeCp1252Char((byte) 74, text.charAt(var5)) + ((var3 << 5) - var3);
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ml.C(");
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getTeam(boolean obfuscationGuard) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            this.velocityY = -102;
          }
          stackIn_3_0 = this.ownerPlayer;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.IB(" + obfuscationGuard + ')');
        }
    }

    private final void updateSpecialAbility(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        double var3 = 0.0;
        int var4_int = 0;
        SpellProjectile var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        SpellProjectile var7 = null;
        int var8 = 0;
        SpellProjectile var9 = null;
        SpellProjectile var10 = null;
        int var2_intLifetime1;
        int var3_intLifetime1;
        double var3Lifetime1;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (obfuscationGuard != -5445) {
            this.hasNoLinkedUnit(22);
          }
          if (2 == this.field_ab &&
            null == this.linkedUnit) {
            var2_int = this.battle.arenaWidth * this.unitId / 6;
            var3_int = -var2_int + this.x;
            var4_int = this.y + (-(this.size >> 1) + 480);
            if (var4_int > 0) {
              var5 = Math.abs(var4_int);
              if (Math.abs(var3_int) > Math.abs(var4_int)) {
                var5 = Math.abs(var3_int);
              }
              var6 = 1;
              var7_int = var5;
              while (true) {
                if (var7_int > 0) {
                  BitHelpers.field_b = false;
                  if (this.battle.isSolidAt(-(this.size >> 1) + (this.y - var4_int * var7_int / var5), -(var7_int * var3_int / var5) + this.x, (byte) -83) &&
                    !BitHelpers.field_b) {
                    var6 = 0;
                  } else {
                    var7_int--;
                    continue;
                  }
                }
                if (var6 == 0) {
                  break;
                }
                var7 = GameOptionType.spawnProjectile(this, -480, false, 114, this.battle, var2_int);
                var7.velocityY = var4_int;
                var7.velocityX = var3_int;
                this.battle.onProjectileFinished(52, var7);
                break;
              }
            }
          }
          if (this.unitType == 12 &&
            Math.random() * 75.0 < (double)this.health) {
            var2_intLifetime1 = (int)(Math.random() * (double)this.maskSprite.field_q);
            var3_intLifetime1 = (int)(Math.random() * (double)this.maskSprite.field_y);
            if (this.maskSprite.field_A[var3_intLifetime1 * this.maskSprite.field_q + var2_intLifetime1] != 0) {
              var4 = GameOptionType.spawnProjectile((BattleUnit) null, -256 + (var3_intLifetime1 + this.y) + this.maskSprite.field_o, false, 109, this.battle, -128 + this.maskSprite.field_x + (var2_intLifetime1 + this.x));
              this.battle.onProjectileFinished(52, var4);
            }
          }
          if (this.unitType == 25) {
            var9 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - (this.size >> 1), false, 100, this.battle, this.x);
            var3 = Math.random() * 6.28;
            var9.velocityX = (int)((double)(12 * -this.facing) + 16.0 * Math.sin(var3));
            var9.velocityY = (int)(Math.cos(var3) * 16.0);
            this.battle.onProjectileFinished(52, var9);
          }
          if (this.unitType == 19) {
            var10 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 100, this.battle, this.x);
            var3Lifetime1 = Math.random() * 6.28;
            var10.velocityY = (int)(8.0 + Math.sin(var3Lifetime1) * 12.0);
            var10.velocityX = (int)(16.0 * Math.cos(var3Lifetime1));
            this.battle.onProjectileFinished(obfuscationGuard + 5497, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.HA(" + obfuscationGuard + ')');
        }
    }

    final int getSize(int obfuscationGuard) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == -8323) {
            stackIn_4_0 = this.size;
            return stackIn_4_0;
          }
          stackIn_2_0 = -90;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.WA(" + obfuscationGuard + ')');
        }
    }

    final void initializeAppearance(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (20 == this.unitType) {
            this.field_q = 25;
            this.size = ScreenDisplayMode.field_i[0].field_w;
            this.maskSprite = new Sprite(this.size, this.size);
            this.maskSprite.makeRasterTarget();
            ScreenDisplayMode.field_i[0].drawSilhouette(this.size / 2 - ScreenDisplayMode.field_i[0].field_n / 2, 0, 16777215);
          }
          if (this.unitType == 22) {
            this.field_q = 75;
            this.size = ScreenDisplayMode.field_i[1].field_w;
            this.maskSprite = new Sprite(this.size, this.size);
            this.maskSprite.makeRasterTarget();
            ScreenDisplayMode.field_i[1].drawSilhouette(-(ScreenDisplayMode.field_i[1].field_n / 2) + this.size / 2, 0, 16777215);
          }
          if (obfuscationGuard != 6) {
            this.attachedProjectile = (SpellProjectile) null;
          }
          if (this.unitType == 38) {
            this.size = ScreenDisplayMode.field_i[6].field_w;
            this.field_q = 75;
            this.maskSprite = new Sprite(this.size, this.size);
            this.maskSprite.makeRasterTarget();
            ScreenDisplayMode.field_i[6].drawSilhouette(-(ScreenDisplayMode.field_i[6].field_n / 2) + this.size / 2, 0, 16777215);
          }
          if (this.unitType == 21) {
            this.field_q = 100;
            this.size = ScreenDisplayMode.field_i[2].field_w;
            this.maskSprite = new Sprite(this.size, this.size);
            this.maskSprite.makeRasterTarget();
            ScreenDisplayMode.field_i[2].drawSilhouette(this.size / 2 - ScreenDisplayMode.field_i[2].field_n / 2, 0, 16777215);
          }
          if (this.unitType == 23) {
            this.size = ScreenDisplayMode.field_i[3].field_w;
            this.field_q = 75;
            this.maskSprite = new Sprite(this.size, this.size);
            this.maskSprite.makeRasterTarget();
            ScreenDisplayMode.field_i[3].drawSilhouette(-(ScreenDisplayMode.field_i[3].field_n / 2) + this.size / 2, 0, 16777215);
          }
          if (this.unitType == 24) {
            this.size = ScreenDisplayMode.field_i[4].field_w;
            this.field_q = 75;
            this.maskSprite = new Sprite(this.size, this.size);
            this.maskSprite.makeRasterTarget();
            ScreenDisplayMode.field_i[4].drawSilhouette(-(ScreenDisplayMode.field_i[4].field_n / 2) + this.size / 2, 0, 16777215);
          }
          if (this.unitType == 35) {
            this.size = -16 + (80 + ScreenDisplayMode.field_i[5].field_w);
            this.field_q = 75;
            this.maskSprite = new Sprite(this.size, this.size);
            this.maskSprite.makeRasterTarget();
            ScreenDisplayMode.field_i[5].drawSilhouette(this.size / 2 - ScreenDisplayMode.field_i[5].field_n / 2, 64, 16777215);
            SoftwareRasterizer.fillCircle(this.size / 2, 80, 16, 16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.EA(" + obfuscationGuard + ')');
        }
    }

    final boolean isTower(byte obfuscationGuard) {
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard < 88) {
            this.field_N = 58;
          }
          stackIn_13_0 = (this.unitType == 20) || (22 == this.unitType) || (this.unitType == 21) || (this.unitType == 23) || (this.unitType == 24) || (this.unitType == 35) || (this.unitType == 38);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.AB(" + obfuscationGuard + ')');
        }
    }

    final void updateAuras(boolean param0, boolean obfuscationGuard) {
        int stackIn_53_1 = 0;
        boolean stackIn_54_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        BattleUnit var7 = null;
        SpellProjectile var7_ref = null;
        int var9 = 0;
        SpellProjectile var10 = null;
        SpellProjectile var11 = null;
        SpellProjectile var12 = null;
        SpellProjectile var13 = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3_intLifetime1Lifetime1;
        int var4Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var6 = 16384;
          RequestQueueHelpers.field_b.setDeque((byte) 95, this.battle.units);
          var7 = (BattleUnit) (RequestQueueHelpers.field_b.first(-83));
          while (var7 != null) {
            if (var7.unitType == 19) {
              var4 = -var7.y + (-48 + this.y);
              var3_int = -var7.x + this.x;
              var5 = var3_int * var3_int + var4 * var4;
              if (var5 < var6) {
                var7.moving = true;
                var7.unitType = 0;
              }
            }
            var7 = (BattleUnit) (RequestQueueHelpers.field_b.next(-18502));
          }
          RequestQueueHelpers.field_b.setDeque((byte) 91, this.battle.projectiles);
          var7_ref = (SpellProjectile) (RequestQueueHelpers.field_b.first(-58));
          if (!obfuscationGuard) {
            this.heal(-6, -62);
          }
          while (var7_ref != null) {
            if (var7_ref.spellType == 55 ||
              157 == var7_ref.spellType ||
              var7_ref.spellType == 168 ||
              111 == var7_ref.spellType ||
              var7_ref.spellType == 68 ||
              var7_ref.spellType == 69 ||
              var7_ref.spellType == 70 ||
              var7_ref.spellType == 56 ||
              var7_ref.spellType == 106 ||
              var7_ref.spellType == 107 ||
              var7_ref.spellType == 117 ||
              var7_ref.spellType == 3 ||
              121 == var7_ref.spellType ||
              var7_ref.spellType == 149) {
              var3_intLifetime1 = -var7_ref.x + this.x;
              var4Lifetime1 = -var7_ref.y + this.y - 48;
              var5Lifetime1 = var3_intLifetime1 * var3_intLifetime1 + var4Lifetime1 * var4Lifetime1;
              if (var5Lifetime1 < var6) {
                if (this != var7_ref.owner &&
                  117 != var7_ref.spellType &&
                  var7_ref.spellType != 3 &&
                  149 != var7_ref.spellType) {
                }
                if (param0) {
                  var10 = GameOptionType.spawnProjectile(this, var7_ref.y, false, 154, this.battle, var7_ref.x);
                  this.battle.onProjectileFinished(52, var10);
                  var11 = GameOptionType.spawnProjectile(this, -48 + this.y, false, 108, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var11);
                }
                if (var7_ref.spellType != 157 &&
                  var7_ref.spellType != 168) {
                  var7_ref.remove(0);
                } else {
                  var7_ref.ageTicks = -1;
                  var7_ref.updateMotion(this.battle.getRound((byte) -75), (byte) -83, this.battle.field_t, this.battle.field_mb);
                }
              }
            }
            if (var7_ref.spellType == 149) {
              var3_intLifetime1Lifetime1 = -var7_ref.velocityX + (-var7_ref.x + this.x);
              var4Lifetime1Lifetime1 = -var7_ref.y + (-48 + (this.y - var7_ref.velocityY));
              var5Lifetime1Lifetime1 = var3_intLifetime1Lifetime1 * var3_intLifetime1Lifetime1 + var4Lifetime1Lifetime1 * var4Lifetime1Lifetime1;
              if (var6 > var5Lifetime1Lifetime1) {
                if (param0) {
                  stackIn_53_1 = var7_ref.y;
                  stackIn_54_2 = !(obfuscationGuard);
                  var12 = GameOptionType.spawnProjectile(this, stackIn_53_1, stackIn_54_2, 154, this.battle, var7_ref.x);
                  this.battle.onProjectileFinished(52, var12);
                  var13 = GameOptionType.spawnProjectile(this, this.y - 48, false, 108, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var13);
                }
                var7_ref.remove(0);
              }
            }
            var7_ref = (SpellProjectile) (RequestQueueHelpers.field_b.next(-18502));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "ml.K(" + param0 + ',' + obfuscationGuard + ')');
        }
    }

    final boolean isWithinArena(int obfuscationGuard) {
        boolean stackIn_28_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.subpixelX >> 4 >= this.size / 2 &&
            this.subpixelX >> 4 <= -(this.size / 2) + this.battle.arenaWidth) {
            if (obfuscationGuard != -1) {
              this.field_t = 29;
            }
            if (null != this.attachedProjectile &&
              this.attachedProjectile.spellType == 121) {
              return false;
            }
            boolean decompiledFrameRemainder0 = true;
            if (!this.isAirborne((byte) -107) &&
              8 != this.unitType &&
              this.unitType != 6 &&
              this.unitType != 25 &&
              10 != this.unitType && (this.x < 0 ||
              !(this.x <= this.battle.arenaWidth) ||
              this.unitType != 19 &&
              (18 != this.unitType ||
              this.pendingDamage > 0))) {
              stackIn_28_0 = false;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_28_0 = true;
            }
            return stackIn_28_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.DA(" + obfuscationGuard + ')');
        }
    }

    private final boolean isAirborne(byte obfuscationGuard) {
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != -107) {
            return false;
          }
          stackIn_9_0 = (this.isFlyingType(obfuscationGuard + 81)) || (this.unitType == 17);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.LB(" + obfuscationGuard + ')');
        }
    }

    final boolean hasNoLinkedUnit(int obfuscationGuard) {
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard >= 25) {
            stackIn_7_0 = (this.linkedUnit == null);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.H(" + obfuscationGuard + ')');
        }
    }

    final void draw(int offsetY, int offsetX, int obfuscationGuard) {
        IndexedSprite[] stackIn_143_0 = null;
        int stackIn_144_1 = 0;
        IndexedSprite[] stackIn_148_0 = null;
        int stackIn_149_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Sprite var8_ref_qb = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Sprite var12_ref_qb = null;
        int var13_int = 0;
        Object var13 = null;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        Sprite var21 = null;
        int var21_int = 0;
        int[] var22 = null;
        int var22_int = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        Sprite var31 = null;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        SpellProjectile var36 = null;
        SpellProjectile var37 = null;
        SpellProjectile var38 = null;
        SpellProjectile var39 = null;
        SpellProjectile var40 = null;
        int[] var41 = null;
        Sprite var42 = null;
        Sprite var43 = null;
        Sprite var44 = null;
        Sprite var45 = null;
        SpellProjectile var46 = null;
        SpellProjectile var47 = null;
        Sprite var12_ref_qbLifetime1;
        Sprite var12_ref_qbLifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var11Lifetime2;
        int var12Lifetime2;
        int var14Lifetime2;
        var34 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!this.field_J) {
            this.buildSprites(12, false);
          }
          var35 = new int[]{offsetX + this.x, this.y + offsetY};
          var41 = var35;
          if ((28 == this.unitType ||
            this.unitType == 29 ||
            this.unitType == 30 ||
            this.unitType == 32) && -16 + this.battle.arenaHeight <= this.y) {
            var35[1] = (int)((double)var35[1] - (8.0 * Math.sin(3.141592653589793 * (double)BattleAction.field_r / 64.0) + 2.0));
          }
          var5 = NameCheckHelpers.field_n[this.ownerPlayer];
          if (this.unitType == 39 &&
            this.bobPhase > 2.5) {
            var36 = GameOptionType.spawnProjectile((BattleUnit) null, this.y + (-(this.getSize(-8323) / 2) + 13), false, 166, this.battle, -(42 * this.facing) + this.x);
            var36.velocityX = 20 * -this.facing;
            var36.velocityY = (int)(-5.0 + 15.0 * Math.random());
            this.battle.onProjectileFinished(52, var36);
          }
          var6 = 0;
          if (this.unitType == 38 &&
            this.bobPhase > 0.0) {
            if (!(1.0 > this.bobPhase)) {
              if (2.0 > this.bobPhase) {
                var40 = GameOptionType.spawnProjectile((BattleUnit) null, -30 + this.y - (this.getSize(-8323) / 2 - 13), false, 166, this.battle, this.x + this.facing * 22);
                var40.velocityX = 30 * this.facing;
                var40.velocityY = (int)(15.0 * Math.random() - 15.0);
                this.battle.onProjectileFinished(52, var40);
              } else {
                if (!(this.bobPhase < 3.0)) {
                  if (4.0 > this.bobPhase) {
                    var39 = GameOptionType.spawnProjectile((BattleUnit) null, this.y + (-(this.getSize(obfuscationGuard ^ -1703912164) / 2) + 13 - 5), false, 166, this.battle, this.x + this.facing * 22);
                    var39.velocityX = 30 * this.facing;
                    var39.velocityY = (int)(Math.random() * 15.0);
                    this.battle.onProjectileFinished(52, var39);
                  }
                } else {
                  var38 = GameOptionType.spawnProjectile((BattleUnit) null, -12 + (this.y - this.getSize(-8323) / 2), false, 166, this.battle, this.x - this.facing * 22);
                  var38.velocityX = 10 * -this.facing;
                  var38.velocityY = (int)(15.0 * Math.random() - 10.0);
                  this.battle.onProjectileFinished(52, var38);
                }
              }
            } else {
              var37 = GameOptionType.spawnProjectile((BattleUnit) null, 13 + this.y - this.getSize(obfuscationGuard ^ -1703912164) / 2, false, 166, this.battle, -(this.facing * 22) + this.x);
              var37.velocityX = -this.facing * 10;
              var37.velocityY = (int)(-5.0 + 15.0 * Math.random());
              this.battle.onProjectileFinished(52, var37);
            }
          }
          if (12 == this.unitType) {
            SoftwareRasterizer.setClip(offsetX, offsetY, this.battle.arenaWidth + offsetX, EmailLoginCredentials.field_j);
            SocketConnector.field_j[29].draw(-128 + var35[0], var35[1] - 256);
            SoftwareRasterizer.resetClip();
          }
          regionExit1: {
            if (this.unitType == 40) {
              var7 = (int)(4.0 * Math.sin(this.bobPhase * 2.0) + 18.0);
              var8 = (int)(32.0 + 4.0 * Math.cos(2.0 * this.bobPhase));
              var9 = (int)(Math.cos(this.bobPhase) * 4.0);
              for (var10 = -8; 8 > var10; var10++) {
                SoftwareRasterizer.drawLine(var10 / 4 + var41[0], var41[1], var9 + (var41[0] + var10), var41[1] - var8, 6303744);
              }
              SoftwareRasterizer.drawLine(var41[0] - 2, var41[1], var9 + (var41[0] - 8), var41[1] - var8, 0);
              SoftwareRasterizer.drawLine(2 + var41[0], var41[1], 8 + var9 + var41[0], var41[1] - var8, 0);
              SoftwareRasterizer.drawLine(var41[0] + 2, var41[1], var41[0] - 2, var41[1], 0);
              SoftwareRasterizer.fillCircle(var41[0] + var9, -var8 + var41[1], var7, 16777215);
              SoftwareRasterizer.drawCircleOutline(var41[0] + var9, -var8 + var41[1], var7, 0);
              SoftwareRasterizer.fillCircle(var9 + var41[0], -var8 + var41[1], (int)((double)var7 * 0.66), 255);
              SoftwareRasterizer.fillCircle(var41[0] + var9, var41[1] - var8, (int)(0.33 * (double)var7), 16711680);
            } else {
              if (this.unitType == 20) {
                ScreenDisplayMode.field_i[0].drawTransparent(-(ScreenDisplayMode.field_i[0].field_n / 2) + var41[0], var41[1] - this.size);
                if (this.field_I != null) {
                  this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + var41[1] + (-(this.size >> 1) - 32));
                }
              } else {
                if (this.unitType == 22) {
                  ScreenDisplayMode.field_i[1].drawTransparent(-(ScreenDisplayMode.field_i[1].field_n / 2) + var35[0], -this.size + var35[1]);
                  if (this.field_I != null) {
                    this.field_I.drawHorizontalFlip(var35[0] - 16, var6 + (-32 + (var35[1] - (this.size >> 1))));
                  }
                } else {
                  if (this.unitType != 38) {
                    if (this.unitType != 21) {
                      if (this.unitType != 23) {
                        if (24 != this.unitType) {
                          if (this.unitType == 35) {
                            ScreenDisplayMode.field_i[5].drawTransparent(-(ScreenDisplayMode.field_i[5].field_n / 2) + var41[0], -this.size + var41[1] + 64);
                            if (this.facing == -1) {
                              if (null != this.field_B) {
                                this.field_B.drawHorizontalFlip(-16 + (var41[0] - 8), -16 + (var41[1] - (this.size >> 1)) + var6);
                              }
                              if (this.field_bb != null) {
                                this.field_bb.drawHorizontalFlip(var41[0] - 16, -16 + var41[1] - (this.size >> 1) + var6);
                              }
                              if (null != this.field_fb) {
                                this.field_fb.drawHorizontalFlip(8 + (-16 + var41[0]), var41[1] - (this.size >> 1) + (-16 + var6));
                              }
                              if (null != this.field_I) {
                                this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + (-32 + (var41[1] - (this.size >> 1))));
                              }
                            } else {
                              if (this.field_B != null) {
                                this.field_B.drawTransparent(8 + (-16 + var41[0]), var41[1] - (this.size >> 1) - (16 - var6));
                              }
                              if (null != this.field_bb) {
                                this.field_bb.drawTransparent(var41[0] - 16, -16 + (var41[1] - ((this.size >> 1) - var6)));
                              }
                              if (null != this.field_fb) {
                                this.field_fb.drawTransparent(var41[0] - 24, -(this.size >> 1) + var41[1] - 16 + var6);
                              }
                              if (null != this.field_I) {
                                this.field_I.drawTransparent(-16 + var41[0], var6 + (var41[1] - (this.size >> 1) - 32));
                              }
                            }
                            var7 = 255 & SpriteState.field_v;
                            if (128 < var7) {
                              var7 = 256 - var7;
                            }
                            QuickChatPhraseCache.fillCircleMasked(128, (byte) 114, -320 - var7, var41[0], -48 + var41[1]);
                          } else {
                            if (this.unitType == 26 &&
                              FrameAndQuickChatHelpers.field_b != null) {
                              var7 = 0;
                              if (this.bobPhase > 1.5) {
                                var7 = 1;
                              }
                              if (this.bobPhase > 3.0) {
                                var7 = 2;
                              }
                              if (4.5 < this.bobPhase) {
                                var7 = 3;
                              }
                              if (0.0 > this.bobPhase) {
                                var7 = 4;
                                if (this.bobPhase > -2.0) {
                                  var7 = 5;
                                }
                                if (this.bobPhase > -1.0) {
                                  var7 = 6;
                                }
                              }
                              if (this.facing != -1) {
                                FrameAndQuickChatHelpers.field_b[var7].draw(var41[0] - (this.size >> 1), var41[1] - this.size);
                              } else {
                                FrameAndQuickChatHelpers.field_b[var7].drawFlippedHorizontal(var41[0] - (this.size >> 1), var41[1] - this.size);
                              }
                              break regionExit1;
                            }
                            if (this.unitType == 39 &&
                              StatsSendHelpers.field_e != null) {
                              var7 = 0;
                              if (this.bobPhase > 1.5) {
                                var7 = 1;
                              }
                              if (this.bobPhase > 3.0) {
                                var7 = 2;
                              }
                              if (4.5 < this.bobPhase) {
                                var7 = 3;
                              }
                              if (0.0 > this.bobPhase) {
                                var7 = 4;
                                if (-2.0 < this.bobPhase) {
                                  var7 = 5;
                                }
                                if (this.bobPhase > -1.0) {
                                  var7 = 6;
                                }
                              }
                              if (-1 == this.facing) {
                                StatsSendHelpers.field_e[var7].drawFlippedHorizontal(-(this.size >> 1) + var41[0], var41[1] - this.size);
                              } else {
                                StatsSendHelpers.field_e[var7].draw(var41[0] - (this.size >> 1), -this.size + var41[1]);
                              }
                              break regionExit1;
                            }
                            if (13 == this.unitType &&
                              LoadingTracker.field_d != null) {
                              var7 = 0;
                              if (1.5 < this.bobPhase) {
                                var7 = 1;
                              }
                              if (this.bobPhase > 3.0) {
                                var7 = 2;
                              }
                              if (this.bobPhase > 4.5) {
                                var7 = 3;
                              }
                              if (0.0 > this.bobPhase) {
                                var7 = 4;
                                if (-2.0 < this.bobPhase) {
                                  var7 = 5;
                                }
                                if (this.bobPhase > -1.0) {
                                  var7 = 6;
                                }
                              }
                              if (this.facing != -1) {
                                LoadingTracker.field_d[var7].draw(-(this.size >> 1) + var41[0], -this.size + var41[1]);
                              } else {
                                LoadingTracker.field_d[var7].drawFlippedHorizontal(-(this.size >> 1) + var41[0], var41[1] - this.size);
                              }
                              break regionExit1;
                            }
                            if (15 == this.unitType &&
                              Checkbox.field_L != null) {
                              var7 = 0;
                              if (this.bobPhase > 1.5) {
                                var7 = 1;
                              }
                              if (3.0 < this.bobPhase) {
                                var7 = 2;
                              }
                              if (4.5 < this.bobPhase) {
                                var7 = 3;
                              }
                              if (this.bobPhase < 0.0) {
                                var7 = 4;
                                if (-2.0 < this.bobPhase) {
                                  var7 = 5;
                                }
                                if (-1.0 < this.bobPhase) {
                                  var7 = 6;
                                }
                              }
                              if (this.facing != -1) {
                                Checkbox.field_L[var7].draw(-(this.size >> 1) + var41[0], var41[1] - this.size);
                              } else {
                                Checkbox.field_L[var7].drawFlippedHorizontal(var41[0] - (this.size >> 1), var41[1] - this.size);
                              }
                              break regionExit1;
                            }
                            if (14 == this.unitType &&
                              null != ArchiveIndex.field_m) {
                              var7 = 0;
                              if (this.bobPhase > 1.5) {
                                var7 = 1;
                              }
                              if (this.bobPhase > 3.0) {
                                var7 = 2;
                              }
                              if (this.bobPhase > 4.5) {
                                var7 = 3;
                              }
                              if (0.0 > this.bobPhase) {
                                var7 = 4;
                                if (-2.0 < this.bobPhase) {
                                  var7 = 5;
                                }
                                if (-1.0 < this.bobPhase) {
                                  var7 = 6;
                                }
                              }
                              if (-1 == this.facing) {
                                ArchiveIndex.field_m[var7].drawFlippedHorizontal(-(this.size >> 1) + var41[0], var41[1] - this.size);
                              } else {
                                ArchiveIndex.field_m[var7].draw(var41[0] - (this.size >> 1), var41[1] - this.size);
                              }
                              break regionExit1;
                            }
                            if (17 == this.unitType &&
                              null != DateHelpers.field_c) {
                              var7 = 0;
                              if (this.bobPhase > 1.5) {
                                var7 = 1;
                              }
                              if (3.0 < this.bobPhase) {
                                var7 = 2;
                              }
                              if (4.5 < this.bobPhase) {
                                var7 = 3;
                              }
                              if (-1 == this.facing) {
                                stackIn_148_0 = DateHelpers.field_c;
                                if (!this.field_U) {
                                  stackIn_149_1 = 0;
                                } else {
                                  stackIn_149_1 = 4;
                                }
                                ((IndexedSprite) (Object) stackIn_148_0[stackIn_149_1 + var7]).drawFlippedHorizontal(-(this.size >> 1) + var41[0], var41[1] - this.size);
                              } else {
                                stackIn_143_0 = DateHelpers.field_c;
                                if (!this.field_U) {
                                  stackIn_144_1 = 0;
                                } else {
                                  stackIn_144_1 = 4;
                                }
                                ((IndexedSprite) (Object) stackIn_143_0[stackIn_144_1 + var7]).draw(var41[0] - (this.size >> 1), var41[1] - this.size);
                              }
                              break regionExit1;
                            }
                            if (this.unitType == 6 &&
                              null != NumericDateInputWidget.field_U) {
                              var7 = 0;
                              if (0.75 < this.bobPhase) {
                                var7 = 1;
                              }
                              if (this.bobPhase > 1.5) {
                                var7 = 2;
                              }
                              if (this.bobPhase > 2.25) {
                                var7 = 3;
                              }
                              if (3.0 < this.bobPhase) {
                                var7 = 4;
                              }
                              if (this.bobPhase > 3.75) {
                                var7 = 5;
                              }
                              if (4.5 < this.bobPhase) {
                                var7 = 6;
                              }
                              if (5.25 < this.bobPhase) {
                                var7 = 7;
                              }
                              if (-1 != this.facing) {
                                NumericDateInputWidget.field_U[var7].draw(var41[0] - 24, -36 + var41[1]);
                              } else {
                                NumericDateInputWidget.field_U[var7].drawFlippedHorizontal(var41[0] - 24, -36 + var41[1]);
                              }
                              break regionExit1;
                            }
                            if (this.unitType != 7 &&
                              this.unitType != 9 &&
                              this.unitType != 2 &&
                              this.unitType != 5 &&
                              28 != this.unitType &&
                              this.unitType != 29 &&
                              this.unitType != 30) {
                              if (this.field_ab == 3) {
                                if (this.facing != -1) {
                                  this.field_bb.drawCenteredRotatedScaledBilinear(var41[0], -(this.size >> 1) + var41[1], (int)(-this.bobPhase * 65536.0 / 6.28), 4096);
                                } else {
                                  this.field_bb.copyFlippedHorizontal().drawCenteredRotatedScaledBilinear(var41[0], var41[1] - (this.size >> 1), (int)(this.bobPhase * 65536.0 / 6.28), 4096);
                                }
                              } else {
                                var7 = this.size;
                                if (this.facing != -1) {
                                  if (null != this.field_B) {
                                    this.field_B.drawTransparent(this.field_r + var41[0] - (var7 >> 2), var41[1] - var7 - (-this.field_O - var6));
                                  }
                                  if (this.field_cb != null) {
                                    this.field_cb.drawTransparent(-(var7 >> 1) + (var41[0] + this.field_t), this.field_Z + (-var7 + var41[1]));
                                  }
                                  if (null != this.field_bb) {
                                    this.field_bb.drawTransparent(-(var7 >> 1) + var41[0], var41[1] - var7 + var6);
                                  }
                                  if (this.unitType != 32) {
                                    if (this.unitType != 37) {
                                      if (null != this.field_I) {
                                        this.field_I.drawTransparent(-(var7 >> 1) + var41[0], var6 + (-(3 * var7 / 2) + var41[1]));
                                      }
                                    } else {
                                      if (this.field_I != null) {
                                        this.field_I.drawTransparent(var41[0] - (var7 >> 1), var41[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                      }
                                    }
                                  } else {
                                    if (this.field_I != null) {
                                      this.field_I.drawTransparent(var41[0] - (var7 >> 1) + 12, var6 + (var41[1] - var7 * 3 / 2));
                                    }
                                  }
                                  if (this.field_Q != null) {
                                    this.field_Q.drawTransparent(var41[0] - (var7 >> 1) + this.field_y, this.field_o + var41[1] - var7);
                                  }
                                  if (this.field_ab == 0) {
                                    var8 = 0;
                                    if (this.battle.field_N != null) {
                                      var8 = this.battle.field_N[this.unitId][5] | (this.battle.field_N[this.unitId][3] << 16 | this.battle.field_N[this.unitId][4] << 8);
                                    }
                                    var9 = -4 + (this.field_n + var41[0]) - (var7 >> 2);
                                    var10 = this.field_N + (var41[1] - this.size + (8 + var6));
                                    var11 = SpriteState.field_v & 255;
                                    if (var11 >= 128) {
                                      var11 = 256 - var11;
                                    }
                                    var11 += 64;
                                    SoftwareRasterizer.fillCircleAlpha(var9, var10, 12, var8, var11);
                                    SoftwareRasterizer.fillCircleAlpha(var9, var10, 10, var8, var11);
                                    SoftwareRasterizer.fillCircleAlpha(var9, var10, 8, var8, var11);
                                    for (var12 = 0; var12 < 7; var12++) {
                                      var13_int = (int)(9.0 * Math.sin(3.14 * (0.1 * (double)SpriteState.field_v + (double)var12) / 3.5)) + var9;
                                      var14 = var10 + (int)(9.0 * Math.cos(3.14 * ((double)var12 + 0.1 * (double)SpriteState.field_v) / 3.5));
                                      ChatLine.field_c[var12].drawQuarterSize(-2 + var13_int, -2 + var14);
                                      SoftwareRasterizer.fillCircleAlpha(var13_int, var14, 4, var8, 32);
                                    }
                                  }
                                  if (this.field_ab == 1) {
                                    QuickChatPhraseCache.fillCircleMasked(12, (byte) 73, 128, -4 + (this.field_n - (var7 >> 2)) + var41[0], var6 + this.field_N + var41[1] + (-this.size + 8));
                                    var8 = -4 - (var7 >> 2) + (this.field_n + (int)(-6.0 + 13.0 * Math.random()));
                                    var9 = -this.size + 8 + this.field_N - (-var6 - (int)(-18.0 + 13.0 * Math.random()) - (-6 + Math.abs(-this.field_n + var8 + (var7 >> 2) + 4)));
                                    var47 = GameOptionType.spawnProjectile((BattleUnit) null, this.y + var9, false, 109, this.battle, this.x + var8);
                                    var47.ageTicks = 16;
                                    this.battle.onProjectileFinished(52, var47);
                                  }
                                  if (this.field_fb != null) {
                                    this.field_fb.drawTransparent(this.field_n - (var7 >> 2) + var41[0] - (var7 >> 1), var6 - var7 + (var41[1] + this.field_N));
                                  }
                                  if (((this.unitType == 18)) &&
                                    ((null != SoundCache.field_m))) {
                                    var8 = 0;
                                    if (this.bobPhase > 1.5) {
                                      var8 = 1;
                                    }
                                    if (3.0 < this.bobPhase) {
                                      var8 = 2;
                                    }
                                    if (4.5 < this.bobPhase) {
                                      var8 = 3;
                                    }
                                    SoundCache.field_m[var8].draw(-48 + var41[0], -48 + var41[1]);
                                  }
                                  break regionExit1;
                                }
                                if (null != this.field_B) {
                                  this.field_B.drawHorizontalFlip(-(var7 >> 2) + (-(var7 >> 1) + var41[0]) - this.field_r, this.field_O + (-var7 + var41[1]) + var6);
                                }
                                if (this.field_cb != null) {
                                  this.field_cb.drawHorizontalFlip(-(var7 >> 1) + var41[0] - this.field_t, this.field_Z + (-var7 + var41[1]));
                                }
                                if (this.field_bb != null) {
                                  this.field_bb.drawHorizontalFlip(var41[0] - (var7 >> 1), var6 + (-var7 + var41[1]));
                                }
                                if (this.unitType == 32) {
                                  if (this.field_I != null) {
                                    this.field_I.drawHorizontalFlip(-12 - (var7 >> 1) + var41[0], var6 + (-(3 * var7 / 2) + var41[1]));
                                  }
                                } else {
                                  if (37 == this.unitType) {
                                    if (this.field_I != null) {
                                      this.field_I.drawHorizontalFlip(var41[0] - (var7 >> 1), var41[1] + (-(var7 * 3 / 2) + (var6 - 10)));
                                    }
                                  } else {
                                    if (null != this.field_I) {
                                      this.field_I.drawHorizontalFlip(-(var7 >> 1) + var41[0], var6 - 3 * var7 / 2 + var41[1]);
                                    }
                                  }
                                }
                                if (null != this.field_Q) {
                                  this.field_Q.drawHorizontalFlip(-this.field_y - (var7 >> 1) + var41[0], this.field_o + (-var7 + var41[1]));
                                }
                                if (this.field_ab == 1) {
                                  QuickChatPhraseCache.fillCircleMasked(12, (byte) 117, 128, var41[0] + ((var7 >> 2) - this.field_n + 4), this.field_N + (8 + var41[1] + (-this.size + var6)));
                                  var8 = -this.field_n + (var7 >> 2) - (-4 - (int)(13.0 * Math.random() - 6.0));
                                  var9 = this.field_N - this.size + 8 - (-var6 - (int)(Math.random() * 13.0 - 18.0) - (-6 + Math.abs(-4 + (var8 - (var7 >> 2)) + this.field_n)));
                                  var46 = GameOptionType.spawnProjectile((BattleUnit) null, this.y + var9, false, 109, this.battle, this.x + var8);
                                  var46.ageTicks = 16;
                                  this.battle.onProjectileFinished(52, var46);
                                }
                                if (this.field_ab == 0) {
                                  var8 = 0;
                                  if (this.battle.field_N != null) {
                                    var8 = this.battle.field_N[this.unitId][5] | (this.battle.field_N[this.unitId][3] << 16 | this.battle.field_N[this.unitId][4] << 8);
                                  }
                                  var9 = 4 + ((var7 >> 2) + var41[0] - this.field_n);
                                  var10 = this.field_N + (-this.size + var41[1]) - (-8 - var6);
                                  var11 = 255 & SpriteState.field_v;
                                  if (var11 >= 128) {
                                    var11 = -var11 + 256;
                                  }
                                  var11 += 64;
                                  SoftwareRasterizer.fillCircleAlpha(var9, var10, 12, var8, var11);
                                  SoftwareRasterizer.fillCircleAlpha(var9, var10, 10, var8, var11);
                                  SoftwareRasterizer.fillCircleAlpha(var9, var10, 8, var8, var11);
                                  for (var12 = 0; var12 < 7; var12++) {
                                    var13_intLifetime1 = var9 + (int)(9.0 * Math.sin(3.14 * ((double)var12 + 0.1 * (double)SpriteState.field_v) / 3.5));
                                    var14Lifetime2 = (int)(9.0 * Math.cos(((double)SpriteState.field_v * 0.1 + (double)var12) * 3.14 / 3.5)) + var10;
                                    ChatLine.field_c[var12].drawQuarterSize(-2 + var13_intLifetime1, var14Lifetime2 - 2);
                                    SoftwareRasterizer.fillCircleAlpha(var13_intLifetime1, var14Lifetime2, 4, var8, 32);
                                  }
                                }
                                if (null != this.field_fb) {
                                  this.field_fb.drawHorizontalFlip(-(var7 >> 2) + (var41[0] - this.field_n), this.field_N + (var41[1] - var7 + var6));
                                }
                                if (((this.unitType == 18)) &&
                                  ((SoundCache.field_m != null))) {
                                  var8 = 0;
                                  if (this.bobPhase > 1.5) {
                                    var8 = 1;
                                  }
                                  if (3.0 < this.bobPhase) {
                                    var8 = 2;
                                  }
                                  if (this.bobPhase > 4.5) {
                                    var8 = 3;
                                  }
                                  SoundCache.field_m[var8].drawFlippedHorizontal(-32 + (var41[0] + 16), var41[1] - 48);
                                }
                              }
                              break regionExit1;
                            }
                            var7 = this.size;
                            if (this.unitType == 7 ||
                              this.unitType == 9) {
                              var7 = 64;
                            }
                            var42 = this.field_fb;
                            var8_ref_qb = var42;
                            var9 = -(var7 >> 2) + var41[0] - this.field_n;
                            if (-1 != this.facing) {
                              var9 = -(var7 >> 2) + (var41[0] - (var7 >> 1) + this.field_n);
                            }
                            var10 = var41[1] - var7 + (this.field_O + var6);
                            if (this.facing == -1) {
                              var8_ref_qb = var42.copyFlippedHorizontal();
                            }
                            boolean decompiledFrameRemainder0 = true;
                            var11Lifetime2 = 0;
                            if (this.attachedProjectile != null &&
                              121 != this.attachedProjectile.spellType) {
                              if (this.attachedProjectile.spellType == 138) {
                                var11Lifetime2 = 1;
                              } else {
                                if (2 != this.unitType) {
                                  if (30 == this.unitType) {
                                    if (this.attachedProjectile.ageTicks >= 12) {
                                      var9 = var9 - (25 - this.attachedProjectile.ageTicks) * 5 * this.attachedProjectile.velocityX / 50;
                                      var10 = var10 - (25 - this.attachedProjectile.ageTicks) * 5 * this.attachedProjectile.velocityY / 50;
                                    } else {
                                      var10 = var10 - 5 * this.attachedProjectile.velocityY * this.attachedProjectile.ageTicks / 50;
                                      var9 = var9 - this.attachedProjectile.ageTicks * this.attachedProjectile.velocityX * 5 / 50;
                                    }
                                  } else {
                                    if (this.unitType != 9 &&
                                      this.unitType != 5) {
                                      if (this.unitType != 28 &&
                                        this.unitType != 29) {
                                        if ((this.unitType == 7)) {
                                          var9 = var9 + this.attachedProjectile.velocityX / 2;
                                          var10 = var10 + this.attachedProjectile.velocityY / 2;
                                          var12_ref_qb = var8_ref_qb;
                                          var44 = new Sprite(128, 128);
                                          var8_ref_qb = var44;
                                          var10 -= 32;
                                          var9 -= 32;
                                          var44.makeRasterTarget();
                                          var12_ref_qb.drawRotatedAboutPivot(512, 768, 1024, 1024, this.facing * -this.attachedProjectile.ageTicks * 8000, 4096);
                                          GameSelectionHelpers.field_m.makeRasterTarget(true);
                                        }
                                      } else {
                                        var10 = var10 - this.attachedProjectile.ageTicks * this.attachedProjectile.velocityY / 100;
                                        var9 = var9 - this.attachedProjectile.ageTicks * this.attachedProjectile.velocityX / 100;
                                        var12_ref_qbLifetime2 = var8_ref_qb;
                                        var43 = new Sprite(2 * this.size, this.size * 2);
                                        var8_ref_qb = var43;
                                        var9 = var9 - this.size / 2;
                                        var10 = var10 - this.size / 2;
                                        var43.makeRasterTarget();
                                        var12_ref_qbLifetime2.drawRotatedAboutPivot(this.size / 2 << 4, 3 * this.size / 4 << 4, this.size << 4, this.size << 4, this.facing * 4000 * -this.attachedProjectile.ageTicks, 4096);
                                        GameSelectionHelpers.field_m.makeRasterTarget(true);
                                      }
                                      decompiledFrameRemainder0 = false;
                                    }
                                    else {
                                      var9 = var9 + this.attachedProjectile.velocityX * this.attachedProjectile.ageTicks / 200;
                                      var10 = var10 + this.attachedProjectile.ageTicks * this.attachedProjectile.velocityY / 200;
                                      var12_ref_qbLifetime1 = var8_ref_qb;
                                      var9 -= 32;
                                      var10 -= 32;
                                      var45 = new Sprite(128, 128);
                                      var8_ref_qb = var45;
                                      var45.makeRasterTarget();
                                      var12_ref_qbLifetime1.drawRotatedAboutPivot(512, 768, 1024, 1024, this.facing * 4000 * -this.attachedProjectile.ageTicks, 4096);
                                      GameSelectionHelpers.field_m.makeRasterTarget(true);
                                    }
                                  }
                                } else {
                                  if (this.attachedProjectile.ageTicks < 12) {
                                    var9 = var9 + this.attachedProjectile.ageTicks * this.attachedProjectile.velocityX / 100;
                                    var10 = var10 + this.attachedProjectile.ageTicks * this.attachedProjectile.velocityY / 100;
                                  } else {
                                    var10 = var10 + (-this.attachedProjectile.ageTicks + 25) * this.attachedProjectile.velocityY / 100;
                                    var9 = var9 + this.attachedProjectile.velocityX * (-this.attachedProjectile.ageTicks + 25) / 100;
                                  }
                                }
                              }
                            }
                            if (-1 == this.facing) {
                              if (this.field_B != null) {
                                this.field_B.drawHorizontalFlip(-this.field_r + var41[0] - (var7 >> 1) - (var7 >> 2), this.field_O + (-var7 + (var41[1] + var6)));
                              }
                              if (this.field_cb != null) {
                                this.field_cb.drawHorizontalFlip(var41[0] - (var7 >> 1) - this.field_t, -var7 + (var41[1] + this.field_Z));
                              }
                              if (this.field_bb != null) {
                                this.field_bb.drawHorizontalFlip(var41[0] - (var7 >> 1), -var7 + (var41[1] + var6));
                              }
                              if (this.field_I != null) {
                                if (var11Lifetime2 == 0) {
                                  this.field_I.drawHorizontalFlip(var41[0] - (var7 >> 1), var41[1] - var7 * 3 / 2 + var6);
                                } else {
                                  var12Lifetime2 = (int)(Math.sin(0.2 * (double)SpriteState.field_v) * (500.0 * Math.random() + 1000.0));
                                  this.field_I.copyFlippedHorizontal().drawRotatedQuarterScale(4096, var41[1] + (-(var7 * 3 / 4) + var6), 19, var41[0], var12Lifetime2);
                                }
                              }
                              if (this.field_Q != null) {
                                this.field_Q.drawHorizontalFlip(-this.field_y + (var41[0] - (var7 >> 1)), this.field_o + (var41[1] - var7));
                              }
                              if (this.field_fb != null) {
                                var8_ref_qb.drawTransparent(var9, var10);
                              }
                            } else {
                              if (this.field_B != null) {
                                this.field_B.drawTransparent(-(var7 >> 2) + (var41[0] + this.field_r), var6 + (var41[1] - var7 + this.field_O));
                              }
                              if (this.field_cb != null) {
                                this.field_cb.drawTransparent(-(var7 >> 1) + var41[0] + this.field_t, this.field_Z + (var41[1] - var7));
                              }
                              if (this.field_bb != null) {
                                this.field_bb.drawTransparent(var41[0] - (var7 >> 1), var6 - var7 + var41[1]);
                              }
                              if (this.field_I != null) {
                                if (var11Lifetime2 == 0) {
                                  this.field_I.drawTransparent(var41[0] - (var7 >> 1), var6 - var7 * 3 / 2 + var41[1]);
                                } else {
                                  var12Lifetime2 = -(int)(Math.sin((double)SpriteState.field_v * 0.2) * (500.0 * Math.random() + 1000.0));
                                  this.field_I.drawRotatedQuarterScale(4096, -(3 * var7 / 4) + (var41[1] + var6), obfuscationGuard ^ 1703903772, var41[0], var12Lifetime2);
                                }
                              }
                              if (null != this.field_Q) {
                                this.field_Q.drawTransparent(-(var7 >> 1) + var41[0] + this.field_y, this.field_o + (-var7 + var41[1]));
                              }
                              if (this.field_fb != null) {
                                var8_ref_qb.drawTransparent(var9, var10);
                              }
                            }
                          }
                        } else {
                          ScreenDisplayMode.field_i[4].drawTransparent(var41[0] - ScreenDisplayMode.field_i[4].field_n / 2, -this.size + var41[1]);
                          if (this.field_I != null) {
                            this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + var41[1] - (this.size >> 1) - 32);
                          }
                        }
                      } else {
                        ScreenDisplayMode.field_i[3].drawTransparent(-(ScreenDisplayMode.field_i[3].field_n / 2) + var41[0], var41[1] - this.size);
                        if (this.field_I != null) {
                          this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + (-32 + var41[1] - (this.size >> 1)));
                        }
                      }
                    } else {
                      ScreenDisplayMode.field_i[2].drawTransparent(-(ScreenDisplayMode.field_i[2].field_n / 2) + var41[0], -this.size + var41[1]);
                      if (null != this.field_I) {
                        this.field_I.drawHorizontalFlip(-16 + var41[0], var41[1] - (this.size >> 1) + (-32 + var6));
                      }
                    }
                  } else {
                    ScreenDisplayMode.field_i[6].drawTransparent(-(ScreenDisplayMode.field_i[6].field_n / 2) + var35[0], -this.size + var35[1]);
                    if (null != this.field_I) {
                      this.field_I.drawHorizontalFlip(-16 + var35[0], var6 - (this.size >> 1) + var35[1] - 32);
                    }
                  }
                }
              }
            }
          }
          if (this.field_q <= 0 &&
            this.field_D &&
            this.unitType != 12 &&
            this.unitType != 40) {
            for (var7Lifetime1 = 0; var7Lifetime1 < 3; var7Lifetime1++) {
              var8Lifetime1 = var41[0] + (int)(Math.sin(3.14 * (double)var7Lifetime1 / 1.5 + 0.125 * (double)SpriteState.field_v) * 16.0);
              var9Lifetime1 = -this.size + (var41[1] - 10);
              var10Lifetime1 = (int)(Math.cos(3.14 * (double)var7Lifetime1 / 1.5 + 0.125 * (double)SpriteState.field_v) * 8.0);
              if (var10Lifetime1 <= 0) {
                LoginLoadingHelpers.field_g[(3 * var7Lifetime1 + SpriteState.field_v / 7 & 1) + 86].drawHorizontalFlip(var8Lifetime1 - 20, var9Lifetime1 - (-var10Lifetime1 + 20));
              } else {
                LoginLoadingHelpers.field_g[(1 & SpriteState.field_v / 7 + var7Lifetime1 * 3) + 86].drawTransparent(var8Lifetime1 - 20, -20 + (var9Lifetime1 + var10Lifetime1));
              }
            }
          }
          if (this.ownerPlayer == this.unitId) {
            var7Lifetime2 = this.battle.playerSpellbook[this.unitId];
            if (var7Lifetime2 != 10 &&
              this.battle.field_X[this.unitId] > 0) {
              var8Lifetime2 = this.battle.field_Ab[this.unitId];
              var9Lifetime2 = this.battle.field_o[this.unitId];
              var10Lifetime2 = var8Lifetime2 + offsetX;
              var11Lifetime1 = var9Lifetime2 + offsetY;
              var12Lifetime1 = 0;
              var13 = null;
              var14Lifetime1 = 10;
              if (0 == var7Lifetime2) {
                var12Lifetime1 = 1;
                var13 = ScreenTransitionHelpers.field_c;
              }
              if (var7Lifetime2 == 1) {
                var13 = DualLinkNode.field_j;
              }
              if (var7Lifetime2 == 2) {
                var12Lifetime1 = 1;
                var13 = SceneTabbedPanel.field_Pb;
              }
              if (3 == var7Lifetime2) {
                var13 = MessageCaptionGlobals.field_g;
              }
              if (var7Lifetime2 == 4) {
                var12Lifetime1 = 1;
                var13 = SpriteDecodeHelpers.field_e;
              }
              if (var7Lifetime2 == 5) {
                var13 = KeyboardInputHandler.field_h;
                var12Lifetime1 = 1;
              }
              if (var7Lifetime2 == 6) {
                var13 = LoadingTracker.field_k;
                var12Lifetime1 = 1;
              }
              if (var7Lifetime2 == 7) {
                var13 = PackedShortHelpers.field_a;
              }
              if (var7Lifetime2 == 8) {
                var14Lifetime1 = 3;
                var12Lifetime1 = 1;
                var13 = LobbyRequestHelpers.field_a;
              }
              var15 = new int[]{255, 0, 0};
              var16 = new int[]{0, 255, 0};
              var17 = new int[]{0, 0, 255};
              var18 = new int[]{255, 255, 255};
              var19 = this.ownerPlayer;
              if (var19 == 0 ||
                3 == var19 ||
                var19 == 4) {
                var15[2] = 255;
                var15[1] = 255;
              }
              if (var19 == 1 ||
                var19 == 3 ||
                var19 == 5) {
                var16[0] = 255;
                var16[2] = 255;
              }
              if (var19 == 2 ||
                var19 == 4 ||
                var19 == 5) {
                var17[2] = 255;
                var17[0] = 255;
              }
              if (this.battle.field_N != null) {
                var15[0] = this.battle.field_N[var19][0];
                var15[1] = this.battle.field_N[var19][1];
                var15[2] = this.battle.field_N[var19][2];
                var16[0] = this.battle.field_N[var19][3];
                var16[1] = this.battle.field_N[var19][4];
                var16[2] = this.battle.field_N[var19][5];
                var17[0] = this.battle.field_N[var19][6];
                var17[1] = this.battle.field_N[var19][7];
                var17[2] = this.battle.field_N[var19][8];
                var18[0] = this.battle.field_N[var19][9];
                var18[1] = this.battle.field_N[var19][10];
                var18[2] = this.battle.field_N[var19][11];
              }
              if (var12Lifetime1 != 0) {
                var20 = SpriteState.field_v / var14Lifetime1 % java.lang.reflect.Array.getLength(var13);
                var21 = new Sprite(((Sprite) (((Object[]) (var13))[0])).field_n, ((Sprite) (((Object[]) (var13))[0])).field_w);
                var22 = SoftwareRasterizer.field_l;
                var23 = SoftwareRasterizer.field_e;
                var24 = SoftwareRasterizer.field_j;
                var21.makeRasterTarget();
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var17, 0, var18, var15, 106, var16, (Sprite) (((Object[]) (var13))[var20]), 0);
                SoftwareRasterizer.field_e = var23;
                SoftwareRasterizer.field_j = var24;
                SoftwareRasterizer.field_l = var22;
                SoftwareRasterizer.resetClip();
                var25 = (int)(4.0 * Math.sin((double)(SpriteState.field_v >> 4)));
                if (var7Lifetime2 == 4 ||
                  var7Lifetime2 == 6) {
                  var25 = -1;
                }
                if (this.facing < 0 &&
                  var7Lifetime2 != 4) {
                  var21.drawHorizontalFlip(-(((Sprite) (((Object[]) (var13))[var20])).field_n / 2) + var10Lifetime2, -var25 - ((Sprite) (((Object[]) (var13))[var20])).field_w + var11Lifetime1);
                } else {
                  if (var7Lifetime2 != 4 ||
                    !((-1 + this.battle.field_X[this.ownerPlayer]) % 5 - (-1 + (this.battle.field_X[this.ownerPlayer] - 1) / 5) <= 0)) {
                    var21.drawTransparent(-(((Sprite) (((Object[]) (var13))[var20])).field_n / 2) + var10Lifetime2, -((Sprite) (((Object[]) (var13))[var20])).field_w + var11Lifetime1 - var25);
                  }
                }
              } else {
                var11Lifetime1 -= 24;
                var10Lifetime2 += 8;
                var20 = this.field_n;
                var21_int = this.field_r;
                var22_int = this.field_N;
                var23 = this.field_O;
                var24 = this.field_t;
                var25 = this.field_y;
                var26 = this.field_Z;
                var27 = this.field_o;
                if (0 < this.field_q) {
                  var20 = (int)(4.0 * Math.sin((double)(SpriteState.field_v >> 3)) + 4.0);
                  var21_int = -var20;
                  var22_int = (int)(Math.sin((double)(SpriteState.field_v >> 2)) * 4.0);
                  var23 = -var22_int;
                }
                var28 = SoftwareRasterizer.field_l;
                var29 = SoftwareRasterizer.field_e;
                var30 = SoftwareRasterizer.field_j;
                var31 = new Sprite(64, 64);
                var31.makeRasterTarget();
                var32 = 20;
                var33 = 32;
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var33 + var22_int, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -127, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var13))[5]), var32 + var20);
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var26 + var33, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -95, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var13))[4]), var24 + var32);
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var33, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 64, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var13))[3]), var32);
                var33 -= 3;
                var33 -= 6;
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var33, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 58, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var13))[2]), var32);
                var33 += 6;
                var33 -= 6;
                var33 += 3;
                var33 += 6;
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var33 + var27, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -91, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var13))[1]), var25 + var32);
                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var33 + var23, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 18, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var13))[0]), var32 + var21_int);
                SoftwareRasterizer.field_l = var28;
                SoftwareRasterizer.field_j = var30;
                SoftwareRasterizer.field_e = var29;
                SoftwareRasterizer.resetClip();
                if (0 > this.facing) {
                  var31.drawHorizontalFlip(var10Lifetime2 - 32, -32 + var11Lifetime1);
                } else {
                  var31.drawTransparent(var10Lifetime2 - 32, -32 + var11Lifetime1);
                }
              }
            }
          }
          if (!this.moving &&
            this.unitType != 12 &&
            this.unitType != 40) {
            var7Lifetime3 = this.health;
            if (this.unitType == 32 ||
              27 == this.unitType) {
              var7Lifetime3 = var7Lifetime3 * 2;
            }
            if (0 < this.field_q) {
              var7Lifetime3 = var7Lifetime3 + this.field_q;
            }
            var8Lifetime3 = CachedArchiveProvider.field_t.field_C / 2;
            SpellProjectile.field_B.drawParagraph(Integer.toString(var7Lifetime3), -var8Lifetime3 + offsetX + this.x, -(var8Lifetime3 * 2) + (offsetY + this.y) + (-this.size - 2), var8Lifetime3 * 2, var8Lifetime3 * 2, (var5 | 8421504) ^ 8421504, 0, 1, 1, CachedArchiveProvider.field_t.field_C);
            SpellProjectile.field_B.drawParagraph(Integer.toString(var7Lifetime3), -1 + (-var8Lifetime3 + (offsetX + this.x)), -this.size + offsetY + (this.y - var8Lifetime3 * 2 - 1), 2 * var8Lifetime3, var8Lifetime3 * 2, 8421504 ^ (var5 | 8421504), 0, 1, 1, CachedArchiveProvider.field_t.field_C);
            SpellProjectile.field_B.drawParagraph(Integer.toString(var7Lifetime3), offsetX + this.x - var8Lifetime3, -(2 * var8Lifetime3) + (this.y + offsetY) - (this.size + 1), var8Lifetime3 * 2, var8Lifetime3 * 2, var5, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
            if (null == this.linkedUnit &&
              this.unitId < this.battle.playerCount &&
              this.battle.field_S[this.unitId] > 0) {
              TimedMessage.field_o[-1 + this.battle.field_S[this.unitId]].drawTintedGrayscale(offsetX + (this.x - 15), -(var8Lifetime3 * 2) - this.size + (offsetY + this.y - 13), var5);
            }
          }
          if (obfuscationGuard != 1703903841) {
            this.battle = (Battle) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "ml.PA(" + offsetY + ',' + offsetX + ',' + obfuscationGuard + ')');
        }
    }

    final boolean hasPendingDamage(int obfuscationGuard) {
        int var2_int = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = -108 / ((33 - obfuscationGuard) / 56);
          stackIn_4_0 = !(this.pendingDamage <= 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.BB(" + obfuscationGuard + ')');
        }
    }

    private final boolean applyPendingDamage(boolean obfuscationGuard) {
        int dupTemp$0 = 0;
        int[] stackIn_15_0 = null;
        Battle stackIn_15_1 = null;
        boolean stackIn_16_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        BattleUnit var3 = null;
        try {
          if (this.pendingDamage > 0) {
            if (19 == this.unitType) {
              this.unitType = 0;
              this.moving = true;
            }
            this.playTypeSound((byte) 101, 2);
            if (this.field_q > 0) {
              var3 = this.battle.getUnitByOwner(this.battle.getCurrentPlayer(false), true);
              if (var3 != null &&
                var3.isTower((byte) 103)) {
                stackIn_15_0 = this.battle.field_R;
                stackIn_15_1 = this.battle;
                stackIn_16_2 = !(obfuscationGuard);
                dupTemp$0 = ((Battle) (Object) stackIn_15_1).getCurrentPlayer(stackIn_16_2);
                stackIn_15_0[dupTemp$0] = stackIn_15_0[dupTemp$0] + this.pendingDamage;
              }
              this.field_q = this.field_q - this.pendingDamage;
            } else {
              this.health = this.health - this.pendingDamage;
            }
            if (this.health <= 0) {
              this.field_M = 0;
              this.battle.eraseUnitMask(this, 0);
              this.updateTurnLogic(this.battle.getCurrentPlayer(false), 120);
              return true;
            }
          }
          if (this.pendingDamage < 0) {
            this.heal(-this.pendingDamage, -28922);
          }
          this.pendingDamage = 0;
          if (obfuscationGuard) {
            return false;
          }
          this.field_D = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.SA(" + obfuscationGuard + ')');
        }
    }

    final BattleUnit getLinkedUnit(int obfuscationGuard) {
        RuntimeException var2 = null;
        BattleUnit stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 24501) {
            this.field_bb = (Sprite) null;
          }
          stackIn_3_0 = this.linkedUnit;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.EB(" + obfuscationGuard + ')');
        }
    }

    final boolean getControlFlag(int obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > 12) {
            stackIn_4_0 = this.field_U;
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.KB(" + obfuscationGuard + ')');
        }
    }

    private final void updateSupport(int obfuscationGuard) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != -11) {
            discarded$0 = this.isAirborne((byte) 37);
          }
          stackIn_5_0 = (!this.isWithinArena(-1)) ? 0 : 1;
          var2_int = stackIn_5_0;
          if (12 == this.unitType) {
            var2_int = 1;
          }
          if (this.unitType != 22 &&
            this.unitType != 4 &&
            this.unitType != 5) {
            if ((this.battle.playerSpellbook[this.ownerPlayer] == 3) && (!(0 >= this.battle.field_X[this.ownerPlayer])) && (this.x >= 0 &&
              this.x <= this.battle.arenaWidth &&
              -32 + this.battle.arenaHeight < this.y && (this.health > 5 ||
              0 < this.field_q))) {
              this.y = -32 + this.battle.arenaHeight;
              this.battle.stampShape(-115, this.x - 24, ScreenSwitchHelpers.field_f[9], -ScreenSwitchHelpers.field_f[9].field_f + this.battle.arenaHeight - 32);
              this.battle.stampShape(obfuscationGuard ^ 117, -8 + this.x, ScreenSwitchHelpers.field_f[9], -ScreenSwitchHelpers.field_f[9].field_f - 32 + this.battle.arenaHeight);
              this.battle.stampShape(obfuscationGuard + 92, 8 + this.x, ScreenSwitchHelpers.field_f[9], this.battle.arenaHeight - 32 - ScreenSwitchHelpers.field_f[9].field_f);
              if (22 != this.unitType) {
                this.health = this.health - 5;
              }
            }
          } else {
            if (this.x >= 0 &&
              this.x <= this.battle.arenaWidth &&
              -32 + this.battle.arenaHeight < this.y && (this.health > 5 ||
              0 < this.field_q)) {
              this.y = -32 + this.battle.arenaHeight;
              this.battle.stampShape(-115, this.x - 24, ScreenSwitchHelpers.field_f[9], -ScreenSwitchHelpers.field_f[9].field_f + this.battle.arenaHeight - 32);
              this.battle.stampShape(obfuscationGuard ^ 117, -8 + this.x, ScreenSwitchHelpers.field_f[9], -ScreenSwitchHelpers.field_f[9].field_f - 32 + this.battle.arenaHeight);
              this.battle.stampShape(obfuscationGuard + 92, 8 + this.x, ScreenSwitchHelpers.field_f[9], this.battle.arenaHeight - 32 - ScreenSwitchHelpers.field_f[9].field_f);
              if (22 != this.unitType) {
                this.health = this.health - 5;
              }
            }
          }
          if (var2_int == 0) {
            this.updateBehaviour(-126);
          } else {
            this.updateAnimation(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.BA(" + obfuscationGuard + ')');
        }
    }

    final void processTurnStart(int obfuscationGuard) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_194_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        BattleUnit var5 = null;
        Object var6_ref = null;
        int var6 = 0;
        BattleUnit var6_ref_ml = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var3Lifetime3;
        int var4Lifetime3;
        var6_ref = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.unitId == this.ownerPlayer) {
            var2_int = this.battle.playerSpellbook[this.unitId];
            if (10 != var2_int &&
              this.battle.field_X[this.unitId] > 0) {
              var3 = this.battle.field_Ab[this.unitId];
              var4 = this.battle.field_o[this.unitId];
              var5_int = this.x - this.facing * this.size / 2;
              var6 = this.y - this.size / 2;
              if (var2_int == 1 ||
                var2_int == 7 ||
                3 == var2_int) {
                var6 = this.y;
                var5_int = -(this.facing * this.size / 2) + this.x;
                for (var7 = 0; var7 < 32; var7 += 2) {
                  if (!this.battle.isSolidAt(var6, var5_int, (byte) -83)) {
                    var6 += 2;
                  } else {
                    var6 -= 2;
                  }
                }
                if (!this.battle.isSolidAt(2 + var6, var5_int, (byte) -83)) {
                  var5_int = this.x - this.facing * this.size / 4;
                  var6 = this.y;
                }
                if (var6 > var4) {
                  var4++;
                }
                if (var4 > var6) {
                  var4--;
                }
              }
              if (var2_int == 6 &&
                null != LoadingTracker.field_k) {
                if (13 <= SpriteState.field_v / 10 % LoadingTracker.field_k.length &&
                  !this.moving) {
                  var5_int = this.x;
                  var3 = this.x;
                  var6 = this.y;
                  var4 = this.y;
                } else {
                  var5_int = var3;
                  var6 = var4;
                }
              }
              if (2 == var2_int &&
                null != LoadingTracker.field_k) {
                if (SpriteState.field_v / 10 % SceneTabbedPanel.field_Pb.length >= SceneTabbedPanel.field_Pb.length - 1 &&
                  !this.moving) {
                  var5_int = this.x;
                  var3 = this.x;
                  var6 = -16 - this.size + this.y;
                  var4 = -16 - this.size + this.y;
                } else {
                  var6 = var4;
                  var5_int = var3;
                }
              }
              if (var2_int == 4) {
                var5_int = var3;
                var6 = var4;
              }
              localTemp$0 = var3 * 15 + var5_int >> 4;
              var3Lifetime3 = localTemp$0;
              this.battle.field_Ab[this.unitId] = localTemp$0;
              localTemp$1 = 15 * var4 + var6 >> 4;
              var4Lifetime3 = localTemp$1;
              this.battle.field_o[this.unitId] = localTemp$1;
            }
          }
          if (0 < this.pendingDamage) {
            this.field_D = true;
          }
          if (this.field_D) {
            this.field_M = 0;
          }
          if (this.unitType == 17) {
            this.linkedUnit = this.battle.getUnitByOwner(this.ownerPlayer, true);
            var2_intLifetime1 = 65536;
            RequestQueueHelpers.field_b.setDeque((byte) 114, this.battle.units);
            var6_ref_ml = (BattleUnit) (RequestQueueHelpers.field_b.first(-31));
            while (var6_ref_ml != null) {
              if (~var6_ref_ml.ownerPlayer == ~this.ownerPlayer) {
                if (var6_ref_ml.linkedUnit != null &&
                  var6_ref_ml.unitType != 9 &&
                  var6_ref_ml.unitType != 7 &&
                  var6_ref_ml.unitType != 37) {
                  var6_ref_ml = (BattleUnit) (RequestQueueHelpers.field_b.next(-18502));
                  continue;
                }
                var5_intLifetime1 = -var6_ref_ml.y + this.y - this.size / 2;
                var4Lifetime1 = this.x - var6_ref_ml.x;
                var3Lifetime1 = var5_intLifetime1 * var5_intLifetime1 + var4Lifetime1 * var4Lifetime1;
                if (var2_intLifetime1 > var3Lifetime1) {
                  var2_intLifetime1 = var3Lifetime1;
                  this.linkedUnit = var6_ref_ml;
                }
              }
              var6_ref_ml = (BattleUnit) (RequestQueueHelpers.field_b.next(-18502));
            }
          } else {
            if (this.isAirborneOrHovering(32)) {
              this.linkedUnit = this.battle.getUnitByOwner(this.ownerPlayer, true);
              var2_intLifetime1 = 65536;
              RequestQueueHelpers.field_b.setDeque((byte) 99, this.battle.units);
              var6_ref_ml = (BattleUnit) (RequestQueueHelpers.field_b.first(-47));
              while (var6_ref_ml != null) {
                if (~var6_ref_ml.ownerPlayer == ~this.ownerPlayer && (null == var6_ref_ml.linkedUnit ||
                  var6_ref_ml.unitType == 37)) {
                  var5_intLifetime1 = this.y - (this.size / 2 + var6_ref_ml.y);
                  var4Lifetime1 = this.x - var6_ref_ml.x;
                  var3Lifetime1 = var4Lifetime1 * var4Lifetime1 + var5_intLifetime1 * var5_intLifetime1;
                  if (var2_intLifetime1 > var3Lifetime1) {
                    this.linkedUnit = var6_ref_ml;
                    var2_intLifetime1 = var3Lifetime1;
                  }
                }
                var6_ref_ml = (BattleUnit) (RequestQueueHelpers.field_b.next(-18502));
              }
            }
          }
          if (35 == this.unitType) {
            this.updateAuras(true, true);
          }
          this.updateSpecialAbility(obfuscationGuard - 5390);
          this.x = this.subpixelX >> 4;
          if (250 < this.health) {
            this.health = 250;
          }
          this.y = this.subpixelY >> 4;
          var2_intLifetime2 = this.x;
          var3Lifetime2 = this.y;
          var4Lifetime2 = 0;
          if (this.moving ||
            this.field_hb ||
            this.field_M != 0) {
            var4Lifetime2 = 1;
            this.battle.eraseUnitMask(this, 0);
          }
          if (null != this.linkedUnit &&
            0 >= this.linkedUnit.health &&
            null != this.linkedUnit.linkedUnit) {
            this.linkedUnit = this.linkedUnit.linkedUnit;
          }
          this.field_hb = false;
          var5 = this.battle.getUnitByOwner(this.ownerPlayer, true);
          if (this.linkedUnit != null && (var5 == null ||
            !(0 < var5.health))) {
            this.health = 0;
            if (var4Lifetime2 == 0) {
              this.battle.eraseUnitMask(this, 0);
            }
            this.updateTurnLogic(this.battle.getCurrentPlayer(false), 90);
            return;
          }
          if (this.health <= 0) {
            this.field_M = 0;
            if (var4Lifetime2 == 0) {
              this.battle.eraseUnitMask(this, obfuscationGuard ^ -55);
            }
            this.updateTurnLogic(this.battle.getCurrentPlayer(false), 72);
            return;
          }
          if (this.hasNoLinkedUnit(33) &&
            this.battle.playerSpellbook[this.ownerPlayer] == 4) {
            while (!this.battle.isSolidAt(this.battle.field_o[this.ownerPlayer] + 2, this.battle.field_Ab[this.ownerPlayer], (byte) -83)) {
              if (this.battle.field_X[this.ownerPlayer] <= 0) {
                break;
              }
              if (0 >= (this.battle.field_X[this.ownerPlayer] - 1) % 5 - (-1 + (-1 + this.battle.field_X[this.ownerPlayer]) / 5)) {
                break;
              }
              this.battle.field_o[this.ownerPlayer] = this.battle.field_o[this.ownerPlayer] + 2;
              if (this.battle.field_o[this.ownerPlayer] > this.battle.arenaHeight) {
                this.battle.field_X[this.ownerPlayer] = this.battle.field_X[this.ownerPlayer] + 5;
                if (this.battle.getCurrentPlayer(false) == this.ownerPlayer) {
                }
              }
              this.moving = true;
            }
          }
          if (this.y < -this.battle.arenaHeight * 10) {
            this.velocityY = 0;
            this.velocityX = 0;
            this.subpixelX = this.x << 4;
            this.y = 10 * -this.battle.arenaHeight;
            this.subpixelY = this.y << 4;
            this.battle.field_u[this.getTeam(false)] = true;
          }
          if (this.unitType != 22 &&
            this.unitType != 4 &&
            this.unitType != 5) {
            if ((this.battle.playerSpellbook[this.ownerPlayer] == 3) && (!(this.battle.field_X[this.ownerPlayer] <= 0)) && (this.x >= 0 &&
              this.battle.arenaWidth >= this.x &&
              this.velocityY >= 0 &&
              this.y > -33 + this.battle.arenaHeight && (this.health > 5 ||
              this.field_q > 0))) {
              this.velocityY = 0;
              this.y = -33 + this.battle.arenaHeight;
              this.subpixelY = this.y << 4;
              this.battle.stampShape(obfuscationGuard ^ -57, -24 + this.x, ScreenSwitchHelpers.field_f[9], -ScreenSwitchHelpers.field_f[9].field_f + (-33 + this.battle.arenaHeight));
              this.battle.stampShape(-25, -8 + this.x, ScreenSwitchHelpers.field_f[9], this.battle.arenaHeight - (33 + ScreenSwitchHelpers.field_f[9].field_f));
              this.battle.stampShape(89, this.x + 8, ScreenSwitchHelpers.field_f[9], -33 + (this.battle.arenaHeight - ScreenSwitchHelpers.field_f[9].field_f));
              if (this.unitType != 22) {
                this.health = this.health - 5;
              }
            }
          } else {
            if (this.x >= 0 &&
              this.battle.arenaWidth >= this.x &&
              this.velocityY >= 0 &&
              this.y > -33 + this.battle.arenaHeight && (this.health > 5 ||
              this.field_q > 0)) {
              this.velocityY = 0;
              this.y = -33 + this.battle.arenaHeight;
              this.subpixelY = this.y << 4;
              this.battle.stampShape(obfuscationGuard ^ -57, -24 + this.x, ScreenSwitchHelpers.field_f[9], -ScreenSwitchHelpers.field_f[9].field_f + (-33 + this.battle.arenaHeight));
              this.battle.stampShape(-25, -8 + this.x, ScreenSwitchHelpers.field_f[9], this.battle.arenaHeight - (33 + ScreenSwitchHelpers.field_f[9].field_f));
              this.battle.stampShape(89, this.x + 8, ScreenSwitchHelpers.field_f[9], -33 + (this.battle.arenaHeight - ScreenSwitchHelpers.field_f[9].field_f));
              if (this.unitType != 22) {
                this.health = this.health - 5;
              }
            }
          }
          if (this.y < this.battle.arenaHeight + 128 &&
            -640 - (this.size >> 1) <= this.x &&
            this.x <= this.battle.arenaWidth + 640 + (this.size >> 1)) {
            var6Lifetime1 = 0;
            if ((this.unitType == 28 ||
              this.unitType == 29 ||
              this.unitType == 30 ||
              this.unitType == 32 ||
              this.battle.playerSpellbook[this.ownerPlayer] == 7 &&
              !(this.battle.field_X[this.ownerPlayer] <= 0)) && (0 <= this.x &&
              this.battle.arenaWidth >= this.x)) {
              var6Lifetime1 = 1;
            }
            stackIn_162_0 = (this.y <= this.battle.arenaHeight - (32 - this.size / 2)) ? 0 : 1;
            var7Lifetime1 = stackIn_162_0;
            if (this.isWithinArena(-1)) {
              stackIn_168_0 = var7Lifetime1;
              if (this.y < this.battle.arenaHeight) {
                stackIn_169_1 = 0;
              } else {
                stackIn_169_1 = 1;
              }
              var7Lifetime1 = stackIn_168_0 | stackIn_169_1;
            }
            if (var7Lifetime1 != 0 &&
              var6Lifetime1 == 0) {
              if (this.unitType == 12) {
                if (var4Lifetime2 == 0) {
                  this.battle.eraseUnitMask(this, obfuscationGuard ^ -55);
                }
                this.updateTurnLogic(this.battle.getCurrentPlayer(false), 89);
                this.health = 0;
                return;
              }
              this.y = this.y + 1;
              this.subpixelY = this.y << 4;
              this.field_M = 0;
              this.velocityY = this.velocityY + 1;
              this.moving = true;
              var8 = -this.velocityY;
              if (var8 > this.size >> 1) {
                var8 = this.size >> 1;
              }
              if (var8 < -(this.size >> 1)) {
                var8 = -(this.size >> 1);
              }
              this.field_o = var8 >> 2;
              this.field_N = -(var8 >> 2);
              this.field_O = -(var8 >> 2);
              this.field_Z = var8 >> 2;
              return;
            }
            stackIn_194_0 = (!this.isTower((byte) 108)) ? 0 : 1;
            var8Lifetime1 = stackIn_194_0;
            if (var8Lifetime1 != 0 ||
              this.unitType == 12) {
              if (this.velocityY < 0) {
                this.velocityY = 0;
              }
              this.velocityX = 0;
            }
            if (obfuscationGuard != -55) {
              this.initializeAppearance((byte) 40);
            }
            if (!this.moving) {
              this.updateSupport(obfuscationGuard + 44);
            } else {
              this.updateMovement((byte) -120);
            }
            if (this.health <= 0 ||
              this.moving ||
              this.field_hb ||
              var2_intLifetime2 != this.x ||
              var3Lifetime2 != this.y ||
              var4Lifetime2 != 0) {
              var9 = this.x;
              this.x = var2_intLifetime2;
              var10 = this.y;
              this.y = var3Lifetime2;
              if (var4Lifetime2 == 0 && (this.unitType != 12 ||
                this.health > 0)) {
                this.battle.eraseUnitMask(this, obfuscationGuard ^ -55);
              }
              this.x = var9;
              this.y = var10;
              if (this.health > 0) {
                this.battle.stampUnitMask(-63, this);
                return;
              }
            }
            return;
          }
          this.updateStatusTimer(obfuscationGuard ^ -32759);
          this.field_M = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.MA(" + obfuscationGuard + ')');
        }
    }

    final void buildSprites(int obfuscationGuard, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[] var8 = null;
        Sprite[][] var9 = null;
        int var10 = 0;
        IndexedSprite[] var11 = null;
        int var12 = 0;
        Sprite[][] var13_ref_qb____ = null;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        Sprite var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        Sprite var26 = null;
        Sprite var27 = null;
        Sprite var28 = null;
        Sprite var29 = null;
        Sprite var30 = null;
        Sprite var31 = null;
        int[] var32 = null;
        Sprite var33 = null;
        Sprite var34 = null;
        Sprite var35 = null;
        Sprite var36 = null;
        Sprite var37 = null;
        Sprite var38 = null;
        Sprite var39 = null;
        Sprite var40 = null;
        Sprite var41 = null;
        Sprite var42 = null;
        Sprite var43 = null;
        Sprite var44 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_J) {
            return;
          }
          var17 = new int[]{255, 0, 0};
          var3 = var17;
          var18 = new int[]{0, 255, 0};
          var4 = var18;
          var19 = new int[]{0, 0, 255};
          var5 = var19;
          var32 = new int[]{255, 255, 255};
          var6 = var32;
          var7 = this.ownerPlayer;
          if (var7 == 0 ||
            3 == var7 ||
            var7 == 4) {
            var17[2] = 255;
            var17[1] = 255;
          }
          if (1 == var7 ||
            var7 == 3 ||
            var7 == 5) {
            var18[2] = 255;
            var18[0] = 255;
          }
          if (var7 == 2 ||
            var7 == 4 ||
            var7 == 5) {
            var19[0] = 255;
            var19[2] = 255;
          }
          if (null != this.battle.field_N) {
            var3[0] = this.battle.field_N[var7][0];
            var3[1] = this.battle.field_N[var7][1];
            var3[2] = this.battle.field_N[var7][2];
            var4[0] = this.battle.field_N[var7][3];
            var4[1] = this.battle.field_N[var7][4];
            var4[2] = this.battle.field_N[var7][5];
            var5[0] = this.battle.field_N[var7][6];
            var5[1] = this.battle.field_N[var7][7];
            var5[2] = this.battle.field_N[var7][8];
            var6[0] = this.battle.field_N[var7][9];
            var6[1] = this.battle.field_N[var7][10];
            var6[2] = this.battle.field_N[var7][11];
          }
          if (obfuscationGuard != 12) {
            return;
          }
          regionExit1: {
            var12 = this.unitType;
            if (var12 == 40) {
              this.size = 64;
              this.health = 10;
              this.field_J = true;
              this.maskSprite = new Sprite(this.size, this.size);
              this.maskSprite.makeRasterTarget();
              SoftwareRasterizer.fillCircle(32, 32, 10, 16777215);
              SoftwareRasterizer.fillCircle(32, 63, 1, 16777215);
            } else {
              if (var12 == 12) {
                this.field_J = true;
                this.health = 75;
                this.moving = true;
                this.size = 256;
                this.maskSprite = new Sprite(this.size, this.size);
                this.maskSprite.makeRasterTarget();
                SocketConnector.field_j[29].draw(0, 0);
                SoftwareRasterizer.fillRectangle(0, -2 + (SocketConnector.field_j[29].field_f + SocketConnector.field_j[29].field_c), this.size, this.size, 0);
              } else {
                if (var12 == 39) {
                  this.field_J = true;
                  this.size = 100;
                  this.health = 100;
                  this.maskSprite = new Sprite(this.size, this.size);
                  this.maskSprite.makeRasterTarget();
                  SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                } else {
                  if (var12 == 13) {
                    this.field_J = true;
                    this.health = 200;
                    this.size = 100;
                    this.maskSprite = new Sprite(this.size, this.size);
                    this.maskSprite.makeRasterTarget();
                    SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                  } else {
                    if (var12 != 15) {
                      if (var12 != 14) {
                        if (26 != var12) {
                          if (var12 != 17) {
                            if (27 == var12) {
                              this.size = 64;
                              if (param1) {
                                this.health = 250;
                              }
                              this.field_ab = 2;
                              if (param1) {
                                this.maskSprite = new Sprite(this.size, this.size);
                                this.maskSprite.makeRasterTarget();
                                SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                              }
                              var25 = new int[]{28, 0, 29, 33, 47, 50, var7, 0, 0};
                              var13_ref_qb____ = new Sprite[][]{SceneWidget.field_kb, IsaacRandom.field_j, DiskCacheRequest.field_u, QueuedPacket.field_i, JaggrabDownloader.field_d, CachedArchiveProvider.field_A, NameErrorHelpers.field_a, ModalPanelStack.field_I, GameListHelpers.field_b};
                              if (SceneWidget.field_kb != null) {
                                var23 = new int[]{204, 170, 238};
                                var3 = var23;
                                var21 = new int[]{32, 32, 32};
                                var5 = var21;
                                var22 = new int[]{128, 64, 128};
                                var6 = var22;
                                var24 = new int[]{255, 192, 255};
                                var4 = var24;
                                var20 = new Sprite(64, 96);
                                var20.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 16, var22, var23, -8, var24, var13_ref_qb____[0][var25[1]], 0);
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 32, var22, var23, -96, var24, var13_ref_qb____[4][var25[5]], 0);
                                if (53 != var25[5] &&
                                  var25[5] != 55) {
                                  TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 32, var22, var23, 74, var24, var13_ref_qb____[6][var25[6]], 0);
                                }
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 16, var22, var23, 25, var24, var13_ref_qb____[5][var25[4]], 0);
                                this.field_I = new Sprite(64, 96);
                                this.field_I.makeRasterTarget();
                                var20.drawCenteredRotatedScaledBilinear(32, 48, 0, 4096);
                                this.field_I.trimTransparentBorders();
                                var26 = new Sprite(64, 64);
                                var26.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 0, var22, var23, 49, var24, var13_ref_qb____[1][var25[0]], 0);
                                this.field_bb = new Sprite(64, 64);
                                this.field_bb.makeRasterTarget();
                                var26.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_bb.trimTransparentBorders();
                                var27 = new Sprite(64, 64);
                                var27.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -104, var24, var13_ref_qb____[7][0], 0);
                                this.field_Q = new Sprite(64, 64);
                                this.field_Q.makeRasterTarget();
                                var27.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_Q.trimTransparentBorders();
                                var28 = new Sprite(64, 64);
                                var28.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -124, var24, var13_ref_qb____[8][0], 0);
                                this.field_cb = new Sprite(64, 64);
                                this.field_cb.makeRasterTarget();
                                var28.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_cb.trimTransparentBorders();
                                var29 = new Sprite(64, 64);
                                var29.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -112, var24, var13_ref_qb____[2][var25[2]], 0);
                                this.field_fb = new Sprite(64, 64);
                                this.field_fb.makeRasterTarget();
                                var29.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_fb.trimTransparentBorders();
                                var30 = new Sprite(64, 64);
                                var30.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -79, var24, var13_ref_qb____[3][var25[3]], 0);
                                this.field_B = new Sprite(64, 64);
                                this.field_B.makeRasterTarget();
                                var30.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_B.trimTransparentBorders();
                                this.field_J = true;
                              } else {
                                this.field_J = false;
                              }
                            } else {
                              regionExit2: {
                                if (var12 != 22 &&
                                  23 != var12 &&
                                  var12 != 21 &&
                                  24 != var12 &&
                                  var12 != 35 &&
                                  var12 != 20 &&
                                  var12 != 0 &&
                                  var12 != 16 &&
                                  var12 != 18 &&
                                  var12 != 38) {
                                  if (var12 != 6 &&
                                    var12 != 25) {
                                    if (11 != var12 &&
                                      var12 != 4 &&
                                      var12 != 5 &&
                                      var12 != 1) {
                                      switch (var12) {
                                        default:
                                          break regionExit2;
                                        case 2:
                                        case 3:
                                        case 8:
                                        case 7:
                                        case 10:
                                        case 9:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 36:
                                        case 37:
                                          break;
                                      }
                                    }
                                    var10 = this.health;
                                    var11 = StringReplaceHelpers.field_a;
                                    this.health = 10;
                                    this.size = 24;
                                    if (11 == this.unitType &&
                                      this.battle.getUnitByOwner(this.ownerPlayer, true).unitType == 27) {
                                      this.health = 100;
                                    }
                                    if (4 == this.unitType) {
                                      this.size = 32;
                                      this.health = 50;
                                      var11 = ButtonMenuDialog.field_ob;
                                    }
                                    if (5 == this.unitType) {
                                      this.size = 64;
                                      var11 = DiskCacheRequest.field_v;
                                      this.health = 100;
                                    }
                                    if (1 == this.unitType) {
                                      this.size = 32;
                                      this.health = 50;
                                      var11 = SceneTextInput.field_Jb;
                                    }
                                    if (this.unitType == 33) {
                                      var11 = ArchiveIndex.field_n;
                                      this.size = 32;
                                      this.health = 40;
                                    }
                                    if (this.unitType == 36) {
                                      this.health = 25;
                                      this.size = 32;
                                      var11 = LoginPanel.field_I;
                                      if (Js5Transport.isFeatureEnabled(0, (byte) -127)) {
                                        this.field_U = true;
                                        this.health = 75;
                                      }
                                    }
                                    if (34 == this.unitType) {
                                      var11 = field_v;
                                      this.health = 25;
                                      this.size = 32;
                                    }
                                    if (this.unitType == 2) {
                                      this.size = 64;
                                      this.health = 100;
                                      var11 = ChatPanel.field_g;
                                    }
                                    if (this.unitType == 3) {
                                      this.size = 64;
                                      var11 = SecondaryNodeDeque.field_c;
                                      this.health = 75;
                                    }
                                    if (8 == this.unitType) {
                                      this.size = 48;
                                      this.health = 50;
                                      var11 = EmailValidationHelpers.field_d;
                                      this.field_U = true;
                                    }
                                    if (this.unitType == 7) {
                                      var11 = DateHelpers.field_j;
                                      this.size = 64;
                                      this.health = 100;
                                    }
                                    if (this.unitType == 10) {
                                      this.health = 25;
                                      var11 = CalendarHelpers.field_d;
                                      this.size = 16;
                                    }
                                    if (9 == this.unitType) {
                                      this.health = 100;
                                      var11 = TimeAndInputHelpers.field_d;
                                      this.size = 64;
                                    }
                                    if (this.unitType == 28) {
                                      this.size = 24;
                                      var11 = SupportPageHelpers.field_f;
                                      this.health = 40;
                                    }
                                    if (this.unitType == 29) {
                                      var11 = ChatPanelHelpers.field_a;
                                      this.size = 48;
                                      this.health = 100;
                                    }
                                    if (this.unitType == 30) {
                                      var11 = MouseStateHelpers.field_g;
                                      this.health = 200;
                                      this.size = 100;
                                    }
                                    if (this.unitType == 31) {
                                      this.size = 64;
                                      var11 = Js5NetworkRequest.field_w;
                                      this.health = 100;
                                    }
                                    if (this.unitType == 32) {
                                      this.health = 250;
                                      this.size = 128;
                                      var11 = NameCheckHelpers.field_k;
                                    }
                                    if (this.unitType == 37) {
                                      this.health = 50;
                                      var11 = PendingTask.field_h;
                                      this.size = 32;
                                    }
                                    if (param1) {
                                      if (this.unitType != 7 &&
                                        this.unitType != 9) {
                                        this.maskSprite = new Sprite(this.size, this.size);
                                        this.maskSprite.makeRasterTarget();
                                        SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                                      } else {
                                        this.maskSprite = new Sprite(48, 48);
                                        this.maskSprite.makeRasterTarget();
                                        SoftwareRasterizer.fillCircle(24, 24, 24, 16777215);
                                      }
                                    }
                                    if (var11 == null) {
                                      this.field_J = false;
                                    } else {
                                      var39 = new Sprite(this.size, 3 * this.size / 2);
                                      var39.makeRasterTarget();
                                      if (this.unitType != 11 &&
                                        this.unitType != 8 &&
                                        6 != this.unitType &&
                                        this.unitType != 25 &&
                                        this.field_U) {
                                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var5, this.size / 2, var6, var3, -111, var4, var11[6].toRgbSprite(), 0);
                                      } else {
                                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var5, this.size / 2, var6, var3, -85, var4, var11[2].toRgbSprite(), 0);
                                      }
                                      this.field_I = var39.copy();
                                      var40 = new Sprite(this.size, this.size);
                                      var40.makeRasterTarget();
                                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var5, 0, var6, var3, 70, var4, var11[3].toRgbSprite(), 0);
                                      this.field_bb = var40.copy();
                                      var41 = new Sprite(this.size, this.size);
                                      var41.makeRasterTarget();
                                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var5, 0, var6, var3, 33, var4, var11[1].toRgbSprite(), 0);
                                      this.field_Q = var41.copy();
                                      var42 = new Sprite(this.size, this.size);
                                      var42.makeRasterTarget();
                                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var5, 0, var6, var3, -127, var4, var11[4].toRgbSprite(), 0);
                                      this.field_cb = var42.copy();
                                      var43 = new Sprite(this.size, this.size);
                                      var43.makeRasterTarget();
                                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var5, 0, var6, var3, -4, var4, var11[0].toRgbSprite(), 0);
                                      this.field_fb = var43.copy();
                                      var44 = new Sprite(this.size, this.size);
                                      var44.makeRasterTarget();
                                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var5, 0, var6, var3, -86, var4, var11[5].toRgbSprite(), 0);
                                      this.field_B = var44.copy();
                                      this.field_J = true;
                                    }
                                    if (!(param1)) {
                                      this.health = var10;
                                    }
                                    break regionExit1;
                                  }
                                  this.field_J = true;
                                  this.size = 24;
                                  this.health = 25;
                                  this.maskSprite = new Sprite(this.size, this.size);
                                  this.maskSprite.makeRasterTarget();
                                  SoftwareRasterizer.fillCircle(12, 12, 12, 16777215);
                                  this.field_p = this.health;
                                  this.size = this.maskSprite.field_n;
                                  this.initializeAppearance((byte) 6);
                                  break regionExit1;
                                }
                              }
                              if (param1) {
                                this.health = 250;
                              }
                              this.size = 32;
                              if (param1) {
                                this.maskSprite = new Sprite(this.size, this.size);
                                this.maskSprite.makeRasterTarget();
                                SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                              }
                              var8 = new int[]{var7, var7, var7, var7, var7, var7, var7, 0, 0};
                              if (this.battle.field_N != null) {
                                var16 = 0;
                                var12 = var16;
                                while (var16 < 6) {
                                  var8[var16] = this.battle.field_N[var7][var16 + 12];
                                  var16++;
                                }
                              }
                              var9 = new Sprite[][]{SceneWidget.field_kb, IsaacRandom.field_j, DiskCacheRequest.field_u, QueuedPacket.field_i, JaggrabDownloader.field_d, CachedArchiveProvider.field_A, NameErrorHelpers.field_a, ModalPanelStack.field_I, GameListHelpers.field_b};
                              if (SceneWidget.field_kb == null) {
                                this.field_J = false;
                              } else {
                                var31 = new Sprite(64, 96);
                                var31.makeRasterTarget();
                                if (this.unitType != 16) {
                                  TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 16, var32, var17, 78, var18, var9[0][var8[1]], 0);
                                  TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 32, var32, var17, -91, var18, var9[4][var8[5]], 0);
                                  if (var8[5] != 53 &&
                                    var8[5] != 55) {
                                    TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 32, var32, var17, -90, var18, var9[6][var8[6]], 0);
                                  }
                                  TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 16, var32, var17, 13, var18, var9[5][var8[4]], 0);
                                } else {
                                  TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 16, var32, var17, 116, var18, QuickChatPhrase.field_x[2], 0);
                                }
                                this.field_I = new Sprite(32, 48);
                                this.field_I.makeRasterTarget();
                                var31.drawCenteredRotatedScaledBilinear(16, 24, 0, 2048);
                                this.field_I.trimTransparentBorders();
                                var33 = new Sprite(64, 64);
                                var33.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 91, var18, var9[1][var8[0]], 0);
                                this.field_bb = new Sprite(32, 32);
                                this.field_bb.makeRasterTarget();
                                var33.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                this.field_bb.trimTransparentBorders();
                                var34 = new Sprite(64, 64);
                                var34.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 123, var18, var9[7][0], 0);
                                this.field_Q = new Sprite(32, 32);
                                this.field_Q.makeRasterTarget();
                                if (var8[0] != 46) {
                                  var34.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                }
                                this.field_Q.trimTransparentBorders();
                                var35 = new Sprite(64, 64);
                                var35.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 0, var32, var17, -81, var18, var9[8][0], 0);
                                this.field_cb = new Sprite(32, 32);
                                this.field_cb.makeRasterTarget();
                                if (var8[0] != 46) {
                                  var35.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                }
                                this.field_cb.trimTransparentBorders();
                                var36 = new Sprite(64, 64);
                                var36.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 126, var18, var9[2][var8[2]], 0);
                                this.field_fb = new Sprite(32, 32);
                                this.field_fb.makeRasterTarget();
                                var36.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                this.field_fb.trimTransparentBorders();
                                var37 = new Sprite(64, 64);
                                var37.makeRasterTarget();
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 14, var18, var9[3][var8[3]], 0);
                                this.field_B = new Sprite(32, 32);
                                this.field_B.makeRasterTarget();
                                var37.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                this.field_B.trimTransparentBorders();
                                this.field_ab = -1;
                                if (var8[2] == 27) {
                                  this.field_ab = 0;
                                }
                                if (28 == var8[2]) {
                                  this.field_ab = 1;
                                }
                                if (var8[2] == 29) {
                                  this.field_ab = 2;
                                }
                                if (var8[2] == 54) {
                                  this.field_ab = 3;
                                  var38 = new Sprite(64, 64);
                                  var38.makeRasterTarget();
                                  var13 = 32;
                                  if (this.field_B != null) {
                                    this.field_B.drawTransparent(32 + (-(var13 >> 2) - 4), 48 - var13);
                                  }
                                  if (this.field_cb != null) {
                                    this.field_cb.drawTransparent(-(var13 >> 1) + 32, -var13 + 48);
                                  }
                                  if (this.field_bb != null) {
                                    this.field_bb.drawTransparent(-(var13 >> 1) + 32, -var13 + 48);
                                  }
                                  if (null != this.field_I) {
                                    this.field_I.drawTransparent(-(var13 >> 1) + 32, 48 - var13 * 3 / 2);
                                  }
                                  if (this.field_Q != null) {
                                    this.field_Q.drawTransparent(32 - (var13 >> 1), 48 - var13);
                                  }
                                  if (null != this.field_fb) {
                                    this.field_fb.drawTransparent(-4 - (var13 >> 1) + 32, 48 - var13);
                                  }
                                  this.field_cb = null;
                                  this.field_B = null;
                                  this.field_bb = var38;
                                  this.field_Q = null;
                                  this.field_fb = null;
                                }
                                this.field_J = true;
                              }
                            }
                          } else {
                            this.size = 80;
                            this.field_J = true;
                            this.health = 100;
                            this.maskSprite = new Sprite(this.size, this.size);
                            this.maskSprite.makeRasterTarget();
                            SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                          }
                        } else {
                          this.size = 100;
                          this.health = 150;
                          this.field_J = true;
                          this.maskSprite = new Sprite(this.size, this.size);
                          this.maskSprite.makeRasterTarget();
                          SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                        }
                      } else {
                        this.health = 150;
                        this.field_J = true;
                        this.size = 100;
                        this.maskSprite = new Sprite(this.size, this.size);
                        this.maskSprite.makeRasterTarget();
                        SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                      }
                    } else {
                      this.field_J = true;
                      this.size = 100;
                      this.health = 150;
                      this.maskSprite = new Sprite(this.size, this.size);
                      this.maskSprite.makeRasterTarget();
                      SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
                    }
                  }
                }
              }
            }
          }
          if (param1) {
            this.field_p = this.health;
            this.size = this.maskSprite.field_n;
            this.initializeAppearance((byte) 6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3_ref), "ml.W(" + obfuscationGuard + ',' + param1 + ')');
        }
    }

    final int getDisplayedHealth(int obfuscationGuard) {
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != -20357) {
            this.ownerPlayer = 27;
          }
          if (this.unitType == 27) {
            stackIn_6_0 = this.health * 2;
            return stackIn_6_0;
          }
          stackIn_8_0 = this.health;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.IA(" + obfuscationGuard + ')');
        }
    }

    final void setMarkerValue(int obfuscationGuard, int param1) {
        try {
          this.field_M = param1;
          if (obfuscationGuard != 0) {
            this.hasNoLinkedUnit(8);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ml.U(" + obfuscationGuard + ',' + param1 + ')');
        }
    }

    private final boolean canBeSelected(int obfuscationGuard) {
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard < 84) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_q <= 0 && (0 == this.unitType ||
            this.unitType == 18 ||
            this.unitType == 19 ||
            9 == this.unitType ||
            16 == this.unitType ||
            this.unitType == 7 ||
            this.unitType == 37)) {
            stackIn_15_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_15_0 = false;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.TA(" + obfuscationGuard + ')');
        }
    }

    final boolean isRemoving(int obfuscationGuard) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 118) {
            this.isMarkedForRemoval(false);
          }
          if (!this.moving &&
            !this.field_hb) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.FB(" + obfuscationGuard + ')');
        }
    }

    public static void releaseStatics(boolean obfuscationGuard) {
        try {
          field_H = null;
          field_m = null;
          field_v = null;
          field_S = null;
          field_K = null;
          if (obfuscationGuard) {
            BattleUnit.setFonts((BitmapFont) null, 88, (byte) 54, (BitmapFont) null);
          }
          field_V = null;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ml.NA(" + obfuscationGuard + ')');
        }
    }

    final int getSide(int obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.battle.teamMode) {
            stackIn_2_0 = this.ownerPlayer;
            return stackIn_2_0;
          }
          var2_int = -92 % ((obfuscationGuard + 4) / 53);
          stackIn_4_0 = 1 & this.ownerPlayer;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.A(" + obfuscationGuard + ')');
        }
    }

    final int getType(int obfuscationGuard) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -22625) {
            this.largestDamage = 1;
          }
          stackIn_3_0 = this.unitType;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.LA(" + obfuscationGuard + ')');
        }
    }

    final void updateTurnLogic(int killerPlayer, int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        SpellProjectile var8 = null;
        SpellProjectile var9 = null;
        SpellProjectile var10 = null;
        SpellProjectile var11 = null;
        SpellProjectile var12 = null;
        SpellProjectile var13 = null;
        SpellProjectile var14 = null;
        SpellProjectile var15 = null;
        SpellProjectile var16 = null;
        SpellProjectile var17 = null;
        SpellProjectile var18 = null;
        SpellProjectile var19 = null;
        SpellProjectile var20 = null;
        SpellProjectile var21 = null;
        SpellProjectile var22 = null;
        SpellProjectile var23 = null;
        SpellProjectile var24 = null;
        SpellProjectile var25 = null;
        SpellProjectile var26 = null;
        SpellProjectile var27 = null;
        SpellProjectile var28 = null;
        SpellProjectile var29 = null;
        SpellProjectile var30 = null;
        SpellProjectile var31 = null;
        SpellProjectile var32 = null;
        SpellProjectile var33 = null;
        SpellProjectile var34 = null;
        SpellProjectile var35 = null;
        SpellProjectile var36 = null;
        SpellProjectile var38 = null;
        SpellProjectile var39 = null;
        SpellProjectile var40 = null;
        SpellProjectile var41 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.hasNoLinkedUnit(57) &&
            this.battle.playerSpellbook[this.ownerPlayer] == 4 &&
            this.battle.field_X[this.ownerPlayer] > 0 &&
            0 < 1 + (-1 + this.battle.field_X[this.ownerPlayer]) % 5 - (this.battle.field_X[this.ownerPlayer] - 1) / 5) {
            this.health = 20 * ((this.battle.field_X[this.ownerPlayer] - 1) % 5 + 1 - (-1 + this.battle.field_X[this.ownerPlayer]) / 5);
            this.pendingDamage = 0;
            var8 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 103, this.battle, this.x);
            this.battle.onProjectileFinished(52, var8);
            this.battle.eraseUnitMask(this, 0);
            this.x = this.battle.field_Ab[this.ownerPlayer];
            this.y = this.battle.field_o[this.ownerPlayer];
            this.subpixelX = this.x << 4;
            this.subpixelY = this.y << 4;
            var9 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 103, this.battle, this.x);
            this.battle.onProjectileFinished(52, var9);
            while ((this.battle.field_X[this.ownerPlayer] - 1) % 5 + (1 - (-1 + this.battle.field_X[this.ownerPlayer]) / 5) > 0) {
              this.battle.field_X[this.ownerPlayer] = this.battle.field_X[this.ownerPlayer] + 5;
            }
            this.moving = true;
            return;
          }
          if (this.unitType != 27) {
          }
          if (this.hasNoLinkedUnit(109)) {
            if (null != this.battle.field_Ib) {
              this.battle.field_Ib.isEntryAvailable(0, this.unitId);
              var4_ref_String = this.battle.field_Ib.getEntryName((byte) 127, killerPlayer);
              this.battle.field_Ib.setEntryText(0, 0, var4_ref_String, this.unitId);
              var5 = this.largestDamageSourceId;
              var6 = null;
              if (var5 >= 0 &&
                PasswordFieldPainter.field_w.length > var5) {
                var6 = PasswordFieldPainter.field_w[var5];
              }
              if (var6 == null) {
                var6 = "(unknown" + var5 + ")";
              }
              this.battle.field_Ib.setEntryText(1, 0, (String) (var6), this.unitId);
            }
            if (this.unitId == killerPlayer) {
              this.battle.field_U[killerPlayer] = this.battle.field_U[killerPlayer] - 1;
            } else {
              this.battle.field_U[killerPlayer] = this.battle.field_U[killerPlayer] + 1;
            }
          }
          if (this.unitType == 36 &&
            this.battle.arenaHeight > this.y) {
            this.battle.field_b[killerPlayer] = this.battle.field_b[killerPlayer] + 1;
          }
          this.playTypeSound((byte) 89, 1);
          this.battle.eraseUnitMask(this, 0);
          if (obfuscationGuard < 4) {
            return;
          }
          regionExit1: {
            var4 = this.unitType;
            if (var4 == 40) {
              var10 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 101, this.battle, this.x);
              this.battle.onProjectileFinished(52, var10);
            } else {
              if (var4 != 0 &&
                var4 != 27) {
                switch (var4) {
                  case 3:
                    var12 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 99, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var12);
                    break regionExit1;
                  case 7:
                    var13 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 103, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var13);
                    break regionExit1;
                  case 1:
                    var14 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 89, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var14);
                    break regionExit1;
                  case 5:
                    var15 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 94, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var15);
                    break regionExit1;
                  case 2:
                    var16 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 89, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var16);
                    break regionExit1;
                  case 11:
                    var17 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 101, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var17);
                    break regionExit1;
                  case 9:
                    var18 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 108, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var18);
                    break regionExit1;
                  case 17:
                    if (this.field_U) {
                      var20 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 103, this.battle, this.x);
                      this.battle.onProjectileFinished(52, var20);
                      break regionExit1;
                    }
                    var19 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 108, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var19);
                    break regionExit1;
                  case 10:
                    var21 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 108, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var21);
                    break regionExit1;
                  case 6:
                    var22 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 103, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var22);
                    break regionExit1;
                  case 25:
                    var23 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 99, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var23);
                    break regionExit1;
                  case 4:
                    var24 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 94, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var24);
                    break regionExit1;
                  case 8:
                    var25 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 103, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var25);
                    break regionExit1;
                  case 13:
                    var26 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 85, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var26);
                    break regionExit1;
                  case 37:
                    var27 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 163, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var27);
                    break regionExit1;
                  case 39:
                    var28 = GameOptionType.spawnProjectile(this.linkedUnit, -10 + (-(this.size / 2) + this.y), false, 159, this.battle, -10 + this.x);
                    this.battle.onProjectileFinished(52, var28);
                    var28.velocityX = -20;
                    var28.velocityY = -20;
                    var29 = GameOptionType.spawnProjectile(this.linkedUnit, -(this.size / 2) + this.y - 10, false, 159, this.battle, this.x + 10);
                    this.battle.onProjectileFinished(52, var29);
                    var29.velocityX = 20;
                    var29.velocityY = -20;
                    var30 = GameOptionType.spawnProjectile(this.linkedUnit, this.y - this.size / 2 + 10, false, 159, this.battle, this.x + 10);
                    this.battle.onProjectileFinished(52, var30);
                    var30.velocityX = 20;
                    var30.velocityY = 20;
                    var31 = GameOptionType.spawnProjectile(this.linkedUnit, 10 + (this.y - this.size / 2), false, 159, this.battle, -10 + this.x);
                    this.battle.onProjectileFinished(52, var31);
                    var31.velocityX = -20;
                    var31.velocityY = 20;
                    var32 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 163, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var32);
                    break regionExit1;
                  case 15:
                    var33 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 94, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var33);
                    break regionExit1;
                  case 14:
                    var34 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 99, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var34);
                    break regionExit1;
                  case 26:
                    var35 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 103, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var35);
                    break regionExit1;
                  case 12:
                    this.battle.carveTerrainAndSprite(this.y - 256, -60, this.x - 128, SocketConnector.field_j[29].toRgbSprite());
                    break regionExit1;
                  case 28:
                  case 32:
                  case 34:
                  case 36:
                  default:
                    if (var4 != 33 &&
                      var4 != 31) {
                      if (var4 != 29 &&
                        var4 != 30) {
                        switch (var4) {
                          case 28:
                            var40 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 130, this.battle, this.x);
                            this.battle.onProjectileFinished(52, var40);
                            break regionExit1;
                          case 34:
                            var38 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 146, this.battle, this.x);
                            this.battle.onProjectileFinished(52, var38);
                            var38.ageTicks = 250;
                            break regionExit1;
                          default:
                            break regionExit1;
                          case 36:
                            var39 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 128, this.battle, this.x);
                            this.battle.onProjectileFinished(52, var39);
                            break regionExit1;
                          case 32:
                            break;
                        }
                      }
                      var41 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 130, this.battle, this.x);
                      this.battle.onProjectileFinished(52, var41);
                      break regionExit1;
                    }
                    var36 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 154, this.battle, this.x);
                    this.battle.onProjectileFinished(52, var36);
                    break regionExit1;
                }
              }
              this.playSound(-30225, 53);
              var11 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 101, this.battle, this.x);
              this.battle.onProjectileFinished(52, var11);
            }
          }
          this.unlink(true);
          this.unlinkSecondary((byte) 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "ml.RA(" + killerPlayer + ',' + obfuscationGuard + ')');
        }
    }

    private final void playSampleAtVolume(byte obfuscationGuard, int param1, int soundId) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (obfuscationGuard > -35) {
            this.field_n = -119;
          }
          if (null != this.battle.unitSamples &&
            null != this.battle.unitSamples[soundId]) {
            IconHighlightPainter.playSample(param1, false, this.battle.unitSamples[soundId], 100 * IntensityTableHelpers.field_a[soundId] / param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "ml.CB(" + obfuscationGuard + ',' + param1 + ',' + soundId + ')');
        }
    }

    final boolean isAirborneOrHovering(int obfuscationGuard) {
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != 32) {
            this.largestDamage = 61;
          }
          stackIn_8_0 = (this.isAirborne((byte) -107)) || (this.unitType == 32);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.OA(" + obfuscationGuard + ')');
        }
    }

    private final void castTypeSpell(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        SpellProjectile var5 = null;
        SpellProjectile var6 = null;
        SpellProjectile var7 = null;
        SpellProjectile var8 = null;
        SpellProjectile var9 = null;
        SpellProjectile var10 = null;
        SpellProjectile var11 = null;
        SpellProjectile var12 = null;
        SpellProjectile var13 = null;
        SpellProjectile var14 = null;
        SpellProjectile var15 = null;
        SpellProjectile var16 = null;
        SpellProjectile var17 = null;
        SpellProjectile var18 = null;
        SpellProjectile var19 = null;
        SpellProjectile var20 = null;
        SpellProjectile var21 = null;
        SpellProjectile var22 = null;
        SpellProjectile var23 = null;
        SpellProjectile var24 = null;
        SpellProjectile var25 = null;
        SpellProjectile var26 = null;
        SpellProjectile var27 = null;
        SpellProjectile var28 = null;
        SpellProjectile var29 = null;
        SpellProjectile var30 = null;
        SpellProjectile var31 = null;
        SpellProjectile var32 = null;
        SpellProjectile var33 = null;
        SpellProjectile var34 = null;
        SpellProjectile var35 = null;
        SpellProjectile var36 = null;
        SpellProjectile var37 = null;
        SpellProjectile var38 = null;
        SpellProjectile var39 = null;
        SpellProjectile var40 = null;
        SpellProjectile var41 = null;
        SpellProjectile var42 = null;
        SpellProjectile var43 = null;
        SpellProjectile var44 = null;
        SpellProjectile var45 = null;
        SpellProjectile var46 = null;
        SpellProjectile var47 = null;
        SpellProjectile var48 = null;
        SpellProjectile var49 = null;
        SpellProjectile var50 = null;
        SpellProjectile var51 = null;
        SpellProjectile var52 = null;
        SpellProjectile var53 = null;
        SpellProjectile var54 = null;
        SpellProjectile var55 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          {
            var3 = this.unitType;
            if (var3 != 0 &&
              27 != var3) {
              switch (var3) {
                case 3:
                  var6 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 99, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var6);
                  break;
                case 7:
                  var7 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 103, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var7);
                  var8 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 103, this.battle, this.x - this.size / 2);
                  this.battle.onProjectileFinished(52, var8);
                  var9 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 103, this.battle, this.x + this.size / 2);
                  this.battle.onProjectileFinished(52, var9);
                  break;
                case 1:
                  var10 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 89, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var10);
                  break;
                case 5:
                  var11 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 94, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var11);
                  var12 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 94, this.battle, this.x - this.size / 2);
                  this.battle.onProjectileFinished(52, var12);
                  var13 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 94, this.battle, this.size / 2 + this.x);
                  this.battle.onProjectileFinished(52, var13);
                  break;
                case 2:
                  var14 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 89, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var14);
                  var15 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 89, this.battle, -(this.size / 2) + this.x);
                  this.battle.onProjectileFinished(52, var15);
                  var16 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 89, this.battle, this.x + this.size / 2);
                  this.battle.onProjectileFinished(52, var16);
                  break;
                case 11:
                  var17 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 101, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var17);
                  break;
                case 9:
                  var18 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 108, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var18);
                  var19 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 108, this.battle, -(this.size / 2) + this.x);
                  this.battle.onProjectileFinished(52, var19);
                  var20 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 108, this.battle, this.x + this.size / 2);
                  this.battle.onProjectileFinished(52, var20);
                  break;
                case 17:
                  var21 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 108, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var21);
                  break;
                case 10:
                  var22 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 108, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var22);
                  break;
                case 6:
                  var23 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 103, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var23);
                  break;
                case 25:
                  var24 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 99, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var24);
                  break;
                case 4:
                  var25 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 94, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var25);
                  break;
                case 8:
                  var26 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 103, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var26);
                  break;
                case 37:
                  var27 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 163, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var27);
                  break;
                case 39:
                  var28 = GameOptionType.spawnProjectile((BattleUnit) null, -this.size + this.y, false, 163, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var28);
                  var29 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 163, this.battle, this.x - this.size / 2);
                  this.battle.onProjectileFinished(52, var29);
                  var30 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 163, this.battle, this.x + this.size / 2);
                  this.battle.onProjectileFinished(52, var30);
                  var31 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 163, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var31);
                  break;
                case 13:
                  var32 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 85, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var32);
                  var33 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 85, this.battle, -(this.size / 2) + this.x);
                  this.battle.onProjectileFinished(52, var33);
                  var34 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 85, this.battle, this.size / 2 + this.x);
                  this.battle.onProjectileFinished(52, var34);
                  var35 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 85, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var35);
                  break;
                case 15:
                  var36 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 94, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var36);
                  var37 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 94, this.battle, this.x - this.size / 2);
                  this.battle.onProjectileFinished(52, var37);
                  var38 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 94, this.battle, this.size / 2 + this.x);
                  this.battle.onProjectileFinished(52, var38);
                  var39 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 94, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var39);
                  break;
                case 14:
                  var40 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 99, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var40);
                  var41 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 99, this.battle, this.x - this.size / 2);
                  this.battle.onProjectileFinished(52, var41);
                  var42 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 99, this.battle, this.x + this.size / 2);
                  this.battle.onProjectileFinished(52, var42);
                  var43 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 99, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var43);
                  break;
                case 26:
                  var44 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 103, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var44);
                  break;
                case 12:
                  var45 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 108, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var45);
                  break;
                case 28:
                  var46 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 130, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var46);
                  break;
                case 32:
                  var47 = GameOptionType.spawnProjectile((BattleUnit) null, -this.size + this.y, false, 130, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var47);
                  var48 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 130, this.battle, this.x - this.size / 2);
                  this.battle.onProjectileFinished(52, var48);
                  var49 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 130, this.battle, this.x + this.size / 2);
                  this.battle.onProjectileFinished(52, var49);
                  var50 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 130, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var50);
                  break;
                case 33:
                  var51 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 128, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var51);
                  break;
                default:
                  break;
                case 34:
                  var55 = GameOptionType.spawnProjectile((BattleUnit) null, -(this.size / 2) + this.y, false, 131, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var55);
                  break;
                case 31:
                  var52 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size, false, 154, this.battle, this.x);
                  this.battle.onProjectileFinished(52, var52);
                  var53 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 154, this.battle, -(this.size / 2) + this.x);
                  this.battle.onProjectileFinished(52, var53);
                  var54 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 154, this.battle, this.size / 2 + this.x);
                  this.battle.onProjectileFinished(52, var54);
                  break;
              }
            } else {
              var5 = GameOptionType.spawnProjectile((BattleUnit) null, this.y - this.size / 2, false, 101, this.battle, this.x);
              this.battle.onProjectileFinished(52, var5);
            }
          }
          var3 = -106 / ((obfuscationGuard + 5) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.J(" + obfuscationGuard + ')');
        }
    }

    final void recordDamage(int obfuscationGuard, int damage, int damageSourceId) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (damage == 0) {
            return;
          }
          if (damage > 0 &&
            damage > this.largestDamage) {
            this.largestDamage = damage;
            this.largestDamageSourceId = damageSourceId;
          }
          var4_int = 79 % ((53 - obfuscationGuard) / 56);
          if (this.unitType == 32 ||
            this.unitType == 27) {
            damage = (damage - 1) / 2 + 1;
          }
          this.pendingDamage = this.pendingDamage + damage;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ml.CA(" + obfuscationGuard + ',' + damage + ',' + damageSourceId + ')');
        }
    }

    private final void playSound(int obfuscationGuard, int soundId) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (obfuscationGuard != -30225) {
            return;
          }
          if (this.battle.unitSamples != null &&
            null != this.battle.unitSamples[soundId]) {
            DropdownList.playSampleAtVolume((byte) -30, IntensityTableHelpers.field_a[soundId], this.battle.unitSamples[soundId]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "ml.S(" + obfuscationGuard + ',' + soundId + ')');
        }
    }

    private final void updateMovement(byte obfuscationGuard) {
        boolean stackIn_73_0 = false;
        int stackIn_74_1 = 0;
        int stackIn_132_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        BattleUnit var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        BattleUnit var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        SpellProjectile var15 = null;
        int var16 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9_intLifetime1;
        int var10Lifetime1;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = this.isAirborneOrHovering(32) ? 1 : 0;
          var3 = this.isWithinArena(-1) ? 1 : 0;
          var4 = 0;
          var5 = 0;
          if ((this.unitType == 28 ||
            this.unitType == 29 ||
            this.unitType == 30 ||
            32 == this.unitType ||
            7 == this.battle.playerSpellbook[this.ownerPlayer] &&
            !(this.battle.field_X[this.ownerPlayer] <= 0)) && (this.x >= 0 &&
            this.x <= this.battle.arenaWidth)) {
            var5 = 1;
          }
          if (this.field_q <= 0 && (this.unitType == 0 ||
            18 == this.unitType ||
            this.unitType == 19 ||
            this.unitType == 9 ||
            16 == this.unitType ||
            this.unitType == 7 ||
            this.unitType == 37)) {
            RequestQueueHelpers.field_b.setDeque((byte) 113, this.battle.units);
            var6_ref_ml = (BattleUnit) (RequestQueueHelpers.field_b.first(-51));
            while (var6_ref_ml != null) {
              if (var6_ref_ml.linkedUnit == this &&
                var6_ref_ml.isAirborneOrHovering(32)) {
                var4 = 1;
                this.battle.eraseUnitMask(var6_ref_ml, 0);
              }
              var6_ref_ml = (BattleUnit) (RequestQueueHelpers.field_b.next(-18502));
            }
          }
          this.field_hb = true;
          if (obfuscationGuard != -120) {
            return;
          }
          var6 = this.subpixelX;
          if (this.field_P <= 0) {
            this.subpixelX = this.subpixelX + this.velocityX;
          }
          var7 = this.subpixelY;
          this.subpixelY = this.subpixelY + this.velocityY;
          if (var3 == 0) {
            this.velocityY = this.velocityY + 4;
          } else {
            this.bobPhase = this.bobPhase + 0.4;
            if (this.bobPhase > 6.28) {
              this.bobPhase = this.bobPhase - 6.28;
            }
            this.velocityX = this.velocityX * 15 >> 4;
            this.velocityY = this.velocityY * 15 >> 4;
            if (0 < this.velocityX) {
              this.velocityX = this.velocityX - 1;
            }
            if (0 < this.velocityY) {
              this.velocityY = this.velocityY - 1;
            }
            if (this.velocityX < 0) {
              this.velocityX = this.velocityX + 1;
            }
            if (this.velocityY < 0) {
              this.velocityY = this.velocityY + 1;
            }
            if (0 == Math.abs(this.velocityX) &&
              Math.abs(this.velocityY) == 0) {
              this.velocityX = 0;
              this.velocityY = 0;
              this.moving = false;
            }
            if (this.size << 4 > this.subpixelY) {
              this.battle.field_G = 25;
              this.subpixelY = this.size << 4;
            }
            if (this.subpixelX < this.size << 3) {
              this.battle.field_G = 25;
              this.subpixelX = this.size << 3;
            }
            if (this.battle.arenaWidth - (this.size >> 1) << 4 < this.subpixelX) {
              this.subpixelX = -(this.size >> 1) + this.battle.arenaWidth << 4;
              this.battle.field_G = 25;
            }
          }
          if (var2_int != 0 &&
            this.linkedUnit.field_q <= 0) {
            this.battle.eraseUnitMask(this.linkedUnit, 0);
            var8 = -this.x + this.linkedUnit.x;
            var9_int = this.linkedUnit.y - this.y - (-(this.size / 2) + this.linkedUnit.size / 2);
            if (var9_int * var9_int + var8 * var8 < (this.linkedUnit.size + this.size) * (this.linkedUnit.size + this.size) >> 2) {
              if (this.linkedUnit.pendingDamage > 0) {
                stackIn_73_0 = this.linkedUnit.field_U;
                if (this.field_U) {
                  stackIn_74_1 = 0;
                } else {
                  stackIn_74_1 = 1;
                }
                if ((stackIn_73_0 ? 1 : 0) != stackIn_74_1) {
                  var10 = this.linkedUnit.pendingDamage;
                  if (this.health - this.pendingDamage < var10) {
                    var10 = this.health - this.pendingDamage;
                  }
                  if (var10 < 0) {
                    var10 = 0;
                  }
                  if (0 < var10) {
                    this.battle.field_cb[this.linkedUnit.ownerPlayer] = this.battle.field_cb[this.linkedUnit.ownerPlayer] + var10;
                    this.pendingDamage = this.pendingDamage + var10;
                    this.linkedUnit.pendingDamage = this.linkedUnit.pendingDamage - var10;
                  }
                }
              }
              if (!this.linkedUnit.moving ||
                !(this.linkedUnit.velocityY < 0)) {
                this.linkedUnit.subpixelY = this.subpixelY - (this.size << 3);
                this.linkedUnit.subpixelX = this.subpixelX - this.facing * (this.size << 1);
                if (this.linkedUnit.size > 32) {
                  this.linkedUnit.subpixelY = this.linkedUnit.subpixelY + 192;
                  this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + 0 * this.facing;
                }
                if (this.unitType == 32) {
                  this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + 448 * this.facing;
                  this.linkedUnit.subpixelY = this.linkedUnit.subpixelY - 480;
                }
                this.x = this.subpixelX >> 4;
                this.y = this.subpixelY >> 4;
                this.linkedUnit.y = this.linkedUnit.subpixelY >> 4;
                this.linkedUnit.facing = this.facing;
                this.linkedUnit.x = this.linkedUnit.subpixelX >> 4;
              }
            }
          }
          this.x = this.subpixelX >> 4;
          this.y = this.subpixelY >> 4;
          if (this.field_P > 0) {
            this.field_P = this.field_P - 1;
          }
          if (this.field_P <= 0 &&
            this.battle.spriteOverlapsTerrain(this.y - this.size, 2, -(this.size >> 1) + this.x, this.maskSprite)) {
            var10Lifetime1 = this.velocityX;
            var11 = this.velocityY;
            var9_intLifetime1 = this.y - GameSelectionHelpers.field_k + (this.size >> 1);
            var8Lifetime1 = this.x - NodeHashTable.field_m;
            var12 = ConnectionState.greatestCommonDivisor(var9_intLifetime1, var8Lifetime1, false);
            if (var12 < 1) {
              var8Lifetime1 = 0;
              var9_intLifetime1 = -1;
              var12 = 1;
            }
            var13 = (var8Lifetime1 * (this.velocityX << 8) + (this.velocityY << 8) * var9_intLifetime1) / var12;
            this.subpixelX = var6;
            var14 = (-((this.velocityY << 8) * var8Lifetime1) + (this.velocityX << 8) * var9_intLifetime1) / var12;
            if (this.field_P <= 0) {
              this.subpixelY = var7;
            }
            this.y = this.subpixelY >> 4;
            this.x = this.subpixelX >> 4;
            if (32768 >= var13 &&
              this.velocityY >= 0 &&
              Math.abs(var14) <= 8192) {
              var13 = 0;
              var14 = 0;
              this.playSound(-30225, 51);
              this.velocityY = 0;
              this.velocityX = 0;
            } else {
              var13 = -(var13 >> 2);
              var14 = var14 >> 2;
              if (var3 != 0) {
                var14 = 0;
                var13 = var13 << 1;
              }
              this.velocityY = (-(var8Lifetime1 * var14) + var13 * var9_intLifetime1) / var12 >> 8;
              this.velocityX = (var14 * var9_intLifetime1 + var13 * var8Lifetime1) / var12 >> 8;
            }
            this.bounceCount = this.bounceCount + 1;
            if (5 < this.bounceCount) {
              this.velocityY = 0;
              this.moving = false;
              this.bounceCount = 0;
              this.velocityX = 0;
            }
            if (Math.abs(var14 >> 8) < 16 &&
              Math.abs(var13 >> 8) < 16) {
              this.bounceCount = 0;
              this.moving = false;
            }
            if (0 > this.y - this.size &&
              this.unitType != 12 &&
              !this.isTower((byte) 109)) {
              this.velocityX = 2 * var10Lifetime1;
              if (this.velocityX > -5 &&
                this.velocityX < 5) {
                if (this.velocityX < 0) {
                  stackIn_132_1 = -5;
                } else {
                  stackIn_132_1 = 5;
                }
                this.velocityX = stackIn_132_1;
              }
              this.velocityY = -5 - Math.abs(var11);
              var15 = GameOptionType.spawnProjectile((BattleUnit) null, this.y, false, 101, this.battle, this.x);
              this.battle.onProjectileFinished(52, var15);
              this.battle.refreshTerrainArea(this.x, this.size * 2, (byte) 51, -(this.size / 2) + this.y);
              this.moving = true;
              if (this.pendingDamage < this.health) {
                this.pendingDamage = this.pendingDamage + 15;
              }
              this.battle.field_G = 25;
            }
          } else {
            this.bounceCount = 0;
          }
          this.field_M = 0;
          if (-16 + this.battle.arenaHeight <= this.y &&
            var5 != 0) {
            this.y = -16 + this.battle.arenaHeight;
            this.bounceCount = 0;
            this.subpixelY = this.y << 4;
            this.moving = false;
          }
          var8Lifetime2 = -this.velocityY;
          if (this.size >> 1 < var8Lifetime2) {
            var8Lifetime2 = this.size >> 1;
          }
          if (-(this.size >> 1) > var8Lifetime2) {
            var8Lifetime2 = -(this.size >> 1);
          }
          this.field_O = -(var8Lifetime2 >> 2);
          this.field_o = var8Lifetime2 >> 2;
          this.field_N = -(var8Lifetime2 >> 2);
          this.field_Z = var8Lifetime2 >> 2;
          if (var2_int != 0 &&
            0 < this.linkedUnit.health) {
            this.battle.stampUnitMask(-41, this.linkedUnit);
          }
          if (var4 != 0) {
            RequestQueueHelpers.field_b.setDeque((byte) 87, this.battle.units);
            var9 = (BattleUnit) (RequestQueueHelpers.field_b.first(-109));
            while (var9 != null) {
              if (this == var9.linkedUnit) {
                if (!var9.isAirborneOrHovering(32)) {
                  var9 = (BattleUnit) (RequestQueueHelpers.field_b.next(obfuscationGuard ^ 18482));
                  continue;
                }
                if (var9.health > 0) {
                  this.battle.stampUnitMask(-45, var9);
                }
              }
              var9 = (BattleUnit) (RequestQueueHelpers.field_b.next(obfuscationGuard ^ 18482));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.QA(" + obfuscationGuard + ')');
        }
    }

    final BattleUnit copyForBattle(Battle battle, byte obfuscationGuard) {
        BattleUnit var4 = null;
        BattleUnit stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var4 = new BattleUnit(battle);
          var4.unitId = this.unitId;
          var4.field_U = this.field_U;
          var4.ownerPlayer = this.ownerPlayer;
          var4.unitType = this.unitType;
          var4.buildSprites(12, true);
          if (this.pendingDamage != 0) {
            throw new IllegalStateException();
          }
          var4.field_q = this.field_q;
          var4.subpixelX = this.subpixelX;
          var4.subpixelY = this.subpixelY;
          var4.y = this.y;
          var4.x = this.x;
          var4.field_p = this.field_p;
          var4.health = this.health;
          var4.field_D = this.field_D;
          if (this.moving) {
            throw new IllegalStateException();
          }
          if (0 != this.field_M) {
            throw new IllegalStateException();
          }
          var4.field_O = this.field_O;
          var4.field_N = this.field_N;
          var4.field_t = this.field_t;
          var4.facing = this.facing;
          var4.field_o = this.field_o;
          var4.field_P = this.field_P;
          var4.field_y = this.field_y;
          if (obfuscationGuard != 59) {
            this.playSound(-34, 73);
          }
          var4.field_n = this.field_n;
          var4.bobPhase = this.bobPhase;
          var4.field_r = this.field_r;
          var4.bounceCount = this.bounceCount;
          var4.field_Z = this.field_Z;
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ml.G(");
          if (battle == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getOwnerId(int obfuscationGuard) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 17571) {
            this.field_D = true;
          }
          stackIn_3_0 = this.unitId;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.AA(" + obfuscationGuard + ')');
        }
    }

    final int getX(int obfuscationGuard) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 95 / ((obfuscationGuard + 11) / 35);
          stackIn_1_0 = this.x;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.B(" + obfuscationGuard + ')');
        }
    }

    final boolean getDisplayFlag(boolean obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            this.field_y = -31;
          }
          stackIn_3_0 = this.field_D;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.GB(" + obfuscationGuard + ')');
        }
    }

    private final void updateBehaviour(int obfuscationGuard) {
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = this.isTower((byte) 117) ? 1 : 0;
          var3 = this.isUnobstructed(-10265) ? 1 : 0;
          var4 = this.isAirborneOrHovering(32) ? 1 : 0;
          var5 = 0;
          if ((this.unitType == 28 ||
            29 == this.unitType ||
            this.unitType == 30 ||
            this.unitType == 32 ||
            this.battle.playerSpellbook[this.ownerPlayer] == 7 &&
            !(this.battle.field_X[this.ownerPlayer] <= 0)) && (0 <= this.x &&
            this.x <= this.battle.arenaWidth)) {
            var5 = 1;
          }
          if (var3 == 0 &&
            !this.battle.spriteHitsTerrain(61, this.maskSprite, -this.size + this.y + 1, -(this.size >> 1) + this.x, this.y - this.size) && (var5 == 0 ||
            !(this.y >= -16 + this.battle.arenaHeight))) {
            this.field_P = 0;
            this.velocityY = 0;
            this.velocityX = 0;
            this.moving = true;
          }
          if (-16 + this.battle.arenaHeight <= this.y &&
            var5 != 0) {
            this.y = -16 + this.battle.arenaHeight;
            this.bounceCount = 0;
            this.subpixelY = this.y << 4;
            this.moving = false;
          }
          if (this.applyPendingDamage(true)) {
            return;
          }
          if (this.moving) {
            this.field_M = 0;
          }
          stackIn_35_0 = (this.field_M != 0) ? 0 : 1;
          var6 = stackIn_35_0;
          if (this.field_M == 0) {
            if (this.unitType == 40) {
              this.bobPhase = this.bobPhase + 0.1;
              if (6.283185307179586 < this.bobPhase) {
                this.bobPhase = this.bobPhase - 6.283185307179586;
              }
            } else {
              if (this.field_ab == 3 &&
                this.unitType == 0) {
                this.bobPhase = this.bobPhase * 0.9;
              } else {
                this.bobPhase = 0.0;
              }
            }
          }
          if (var2_int != 0) {
            if (this.field_M == 2 ||
              this.field_M == 3 ||
              this.field_q <= 0) {
              this.y = this.y - this.size / 2;
              this.unitType = 0;
              this.subpixelY = this.y << 4;
              this.moving = true;
              this.field_q = 0;
              this.size = 32;
              this.maskSprite = new Sprite(this.size, this.size);
              this.maskSprite.makeRasterTarget();
              SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
            }
            if (this.unitType != 38) {
              this.field_M = 0;
            }
          }
          if (this.field_M == -1 ||
            1 == this.field_M) {
            this.facing = this.field_M;
            this.y = this.subpixelY >> 4;
            this.x = this.subpixelX >> 4;
            var7 = this.field_M + this.x;
            var8 = this.y;
            for (var9 = 0; 8 > var9; var9++) {
              if (this.battle.spriteOverlapsTerrain(-this.size + var8, 2, -(this.size >> 1) + var7, this.maskSprite)) {
                var8--;
              } else {
                var8++;
              }
            }
            if (this.battle.spriteOverlapsTerrain(this.y - this.size, 2, this.x - (this.size >> 1), this.maskSprite)) {
              var8--;
            }
            this.velocityX = 0;
            this.velocityY = 0;
            if (var5 != 0 &&
              -16 + this.battle.arenaHeight <= this.y &&
              this.y < var8) {
              var8 = this.y;
            }
            if (-this.size + var8 < 0) {
              var8 = -100;
              this.battle.field_G = 25;
            }
            boolean decompiledFrameRemainder0 = true;
            if (Math.abs(-this.y + var8) >= 5) {
              if (var8 > this.y &&
                this.unitType != 38) {
                this.velocityX = 16 * this.field_M;
                this.moving = true;
                this.velocityY = -16;
                if (((this.unitType == 36)) && ((!(this.field_U) ||
                  Js5Transport.isFeatureEnabled(0, (byte) -61)))) {
                  this.velocityX = 0;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (this.y < var8 &&
                  38 == this.unitType) {
                  this.x = var7;
                  this.bobPhase = this.bobPhase + 0.4;
                  if (90 < this.size ||
                    31 == this.unitType) {
                    this.bobPhase = this.bobPhase - 0.3;
                  }
                }
              }
            } else {
              if (var7 != this.x &&
                this.linkedUnit == null) {
                this.battle.field_Ob[this.unitId] = this.battle.field_Ob[this.unitId] + 1;
              }
              this.x = var7;
              if (this.field_ab == 3 &&
                this.unitType == 0) {
                this.bobPhase = this.bobPhase + 0.1;
              } else {
                this.bobPhase = this.bobPhase + 0.4;
              }
              this.y = var8;
              if (this.size > 90 ||
                this.unitType == 31) {
                this.bobPhase = this.bobPhase - 0.3;
              }
            }
            this.subpixelX = this.x << 4;
            this.subpixelY = this.y << 4;
            this.field_M = 0;
            if (var4 != 0 &&
              !(this.linkedUnit.field_q > 0)) {
              this.battle.eraseUnitMask(this.linkedUnit, 0);
              var9Lifetime3 = -this.x + this.linkedUnit.x;
              var10 = this.size / 2 + (-this.y + (this.linkedUnit.y - this.linkedUnit.size / 2));
              if ((!this.linkedUnit.moving ||
                !(0 > this.linkedUnit.velocityY)) && !((this.linkedUnit.size + this.size) * (this.linkedUnit.size + this.size) >> 2 <= var9Lifetime3 * var9Lifetime3 + var10 * var10)) {
                this.linkedUnit.subpixelX = -(this.facing * (this.size << 1)) + this.subpixelX;
                this.linkedUnit.subpixelY = -(this.size << 3) + this.subpixelY;
                if (32 < this.linkedUnit.size) {
                  this.linkedUnit.subpixelY = this.linkedUnit.subpixelY + 192;
                  this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + 0 * this.facing;
                }
                if (this.unitType == 32) {
                  this.linkedUnit.subpixelY = this.linkedUnit.subpixelY - 480;
                  this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + this.facing * 448;
                }
                this.x = this.subpixelX >> 4;
                this.y = this.subpixelY >> 4;
                this.linkedUnit.facing = this.facing;
                this.linkedUnit.y = this.linkedUnit.subpixelY >> 4;
                this.linkedUnit.x = this.linkedUnit.subpixelX >> 4;
              }
            }
          }
          if (2 == this.field_M) {
            if (null == this.linkedUnit) {
              this.battle.field_c[this.unitId] = this.battle.field_c[this.unitId] + 1;
            }
            this.velocityX = this.facing * 64;
            this.velocityY = -96;
            if (this.unitType == 4) {
              this.velocityY = -128;
              this.velocityX = 96 * this.facing;
            }
            if (5 == this.unitType ||
              this.unitType == 31) {
              this.velocityY = -64;
            }
            if (this.unitType == 1) {
              this.velocityX = 96 * this.facing;
              this.velocityY = -32;
            }
            if (this.unitType == 2 ||
              32 == this.unitType) {
              this.velocityY = -32;
            }
            if (7 == this.unitType ||
              this.unitType == 9) {
              this.velocityY = -32;
            }
            if (var3 != 0) {
              this.velocityY = -64;
            }
            if (this.battle.playerSpellbook[this.ownerPlayer] == 3) {
              var7Lifetime1 = this.battle.field_X[this.ownerPlayer] / 20;
              this.velocityX = this.velocityX + 8 * (var7Lifetime1 * this.facing);
              this.velocityY = this.velocityY - 8 * var7Lifetime1;
              if (96 < this.velocityX * this.facing) {
                this.velocityX = this.facing * 96;
              }
              if (this.velocityY < -128) {
                this.velocityY = -128;
              }
            }
            if (36 == this.unitType && (!this.field_U ||
              Js5Transport.isFeatureEnabled(0, (byte) -88))) {
              this.velocityX = 0;
              this.velocityY = -32;
            }
            this.field_M = 0;
            this.moving = true;
            this.field_P = 0;
            this.playSound(-30225, 49);
          }
          if (this.field_M == 3) {
            if (this.linkedUnit == null) {
              this.battle.field_c[this.unitId] = this.battle.field_c[this.unitId] + 1;
            }
            this.velocityX = this.facing * 16;
            this.velocityY = -128;
            if (4 == this.unitType) {
              this.velocityY = -148;
            }
            if (this.unitType == 5 ||
              this.unitType == 31) {
              this.velocityY = -96;
            }
            if (this.unitType == 1) {
              this.velocityY = -64;
            }
            if (2 == this.unitType) {
              this.velocityY = -48;
            }
            if (this.unitType == 7 ||
              this.unitType == 9) {
              this.velocityY = -64;
            }
            if (var3 != 0) {
              this.velocityX = 32 * this.facing;
              this.velocityY = -128;
            }
            if (this.battle.playerSpellbook[this.ownerPlayer] == 3) {
              var7Lifetime2 = this.battle.field_X[this.ownerPlayer] / 20;
              this.velocityY = this.velocityY - 8 * var7Lifetime2;
              this.velocityX = this.velocityX + this.facing * var7Lifetime2 * 4;
              if (this.velocityX * this.facing > 32) {
                this.velocityX = this.facing * 32;
              }
              if (-196 > this.velocityY) {
                this.velocityY = -196;
              }
            }
            if (this.unitType == 36 && (!this.field_U ||
              Js5Transport.isFeatureEnabled(0, (byte) -23))) {
              this.velocityY = -32;
              this.velocityX = 0;
            }
            this.field_M = 0;
            this.moving = true;
            this.field_P = 0;
            this.playSound(-30225, 50);
          }
          var7Lifetime3 = 117 % ((obfuscationGuard + 64) / 59);
          this.field_M = 0;
          if (this.bobPhase > 6.28) {
            this.bobPhase = this.bobPhase - 6.28;
            this.playSound(-30225, 48);
          }
          if (0.0 > this.bobPhase) {
            this.bobPhase = this.bobPhase + 6.28;
          }
          var8Lifetime1 = (int)(Math.cos(this.bobPhase) * (double)(this.size >> 2));
          var9Lifetime1 = (int)(Math.sin(this.bobPhase) * (double)(this.size >> 2));
          this.field_n = var8Lifetime1 >> 1;
          this.field_N = var9Lifetime1 >> 2;
          this.field_O = -(var9Lifetime1 >> 2);
          if (0 < var8Lifetime1) {
            this.field_Z = -var8Lifetime1;
          } else {
            this.field_Z = 0;
          }
          this.field_y = -var9Lifetime1;
          if (var8Lifetime1 >= 0) {
            this.field_o = 0;
          } else {
            this.field_o = var8Lifetime1;
          }
          this.field_t = var9Lifetime1;
          this.field_r = -(var8Lifetime1 >> 1);
          if (var6 != 0) {
            this.field_N = this.field_O;
            this.field_Z = this.field_o;
          }
          if (var4 != 0) {
            if (!this.linkedUnit.canBeSelected(92)) {
              return;
            }
            var8Lifetime2 = -this.x + this.linkedUnit.x;
            var9Lifetime2 = -this.y + this.linkedUnit.y;
            if (this.linkedUnit.moving &&
              this.linkedUnit.velocityY >= 0) {
              if ((this.size + this.linkedUnit.size) * (this.size + this.linkedUnit.size) >> 2 <= var8Lifetime2 * var8Lifetime2 + var9Lifetime2 * var9Lifetime2) {
                return;
              }
              this.battle.eraseUnitMask(this.linkedUnit, 0);
              this.linkedUnit.moving = false;
              this.linkedUnit.subpixelY = this.subpixelY - (this.size << 3);
              this.linkedUnit.velocityY = 0;
              this.linkedUnit.subpixelX = -(this.facing * (this.size << 1)) + this.subpixelX;
              this.linkedUnit.velocityX = 0;
              if (this.linkedUnit.size > 32) {
                this.linkedUnit.subpixelY = this.linkedUnit.subpixelY + 192;
                this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + 0 * this.facing;
              }
              if (32 == this.unitType) {
                this.linkedUnit.subpixelY = this.linkedUnit.subpixelY - 480;
                this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + this.facing * 448;
              }
              this.x = this.subpixelX >> 4;
              this.y = this.subpixelY >> 4;
              this.linkedUnit.x = this.linkedUnit.subpixelX >> 4;
              this.linkedUnit.facing = this.facing;
              this.linkedUnit.y = this.linkedUnit.subpixelY >> 4;
              if (0 < this.linkedUnit.health) {
                this.battle.stampUnitMask(-124, this.linkedUnit);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.VA(" + obfuscationGuard + ')');
        }
    }

    private final void updateAnimation(boolean obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2_int = this.isAirborne((byte) -107) ? 1 : 0;
          this.bobPhase = this.bobPhase + 0.1;
          if (this.bobPhase > 6.28) {
            this.bobPhase = this.bobPhase - 6.28;
          }
          if (this.applyPendingDamage(obfuscationGuard)) {
            return;
          }
          if (this.moving) {
            this.field_M = 0;
          }
          if (this.field_M == -1 &&
            this.subpixelX > this.battle.arenaWidth << 4) {
            this.field_M = 0;
          }
          if (this.field_M == 1 &&
            0 > this.subpixelX) {
            this.field_M = 0;
          }
          if (1 == this.field_M ||
            -1 == this.field_M) {
            if (this.field_M == this.facing) {
              this.facing = this.field_M;
              this.velocityX = this.facing * 96;
              this.moving = true;
              this.field_M = 0;
            } else {
              this.facing = this.field_M;
              this.field_M = 0;
              this.moving = true;
              this.velocityX = 32 * this.facing;
            }
          }
          if (this.field_M == 2) {
            this.velocityX = 32 * this.facing;
            this.velocityY = 96;
            this.field_M = 0;
            this.moving = true;
          }
          if (this.field_M == 3) {
            this.velocityX = this.facing * 32;
            this.field_M = 0;
            this.velocityY = -96;
            this.moving = true;
          }
          this.field_M = 0;
          if (var2_int != 0 &&
            this.linkedUnit.canBeSelected(101)) {
            var3 = this.linkedUnit.x - this.x;
            var4 = this.linkedUnit.y - this.y;
            if (this.linkedUnit.moving &&
              this.linkedUnit.velocityY >= 0 &&
              var4 * var4 + var3 * var3 < (this.size + this.linkedUnit.size) * (this.linkedUnit.size + this.size) >> 2) {
              this.battle.eraseUnitMask(this.linkedUnit, 0);
              this.linkedUnit.moving = false;
              this.linkedUnit.velocityX = 0;
              this.linkedUnit.velocityY = 0;
              this.linkedUnit.subpixelX = -((this.size << 1) * this.facing) + this.subpixelX;
              this.linkedUnit.subpixelY = -(this.size << 3) + this.subpixelY;
              if (this.linkedUnit.size > 32) {
                this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + 0 * this.facing;
                this.linkedUnit.subpixelY = this.linkedUnit.subpixelY + 192;
              }
              if (32 == this.unitType) {
                this.linkedUnit.subpixelX = this.linkedUnit.subpixelX + this.facing * 448;
                this.linkedUnit.subpixelY = this.linkedUnit.subpixelY - 480;
              }
              this.x = this.subpixelX >> 4;
              this.y = this.subpixelY >> 4;
              this.linkedUnit.x = this.linkedUnit.subpixelX >> 4;
              this.linkedUnit.y = this.linkedUnit.subpixelY >> 4;
              this.linkedUnit.facing = this.facing;
              if (this.linkedUnit.health <= 0) {
                return;
              }
              this.battle.stampUnitMask(-55, this.linkedUnit);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.UA(" + obfuscationGuard + ')');
        }
    }

    final boolean isMarkedForRemoval(boolean obfuscationGuard) {
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!obfuscationGuard) {
            this.field_B = (Sprite) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.isLinked((byte) -82) && (this.moving ||
            this.field_hb ||
            this.pendingDamage != 0 ||
            this.health <= 0)) {
            stackIn_11_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_11_0 = false;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.JB(" + obfuscationGuard + ')');
        }
    }

    final static void applyMusicVolume(boolean param0, int obfuscationGuard) {
        try {
          if (obfuscationGuard >= -100) {
            BattleUnit.setFonts((BitmapFont) null, -106, (byte) 51, (BitmapFont) null);
          }
          EmptyPainter.drawSceneAndTooltip(param0, -105);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ml.V(" + param0 + ',' + obfuscationGuard + ')');
        }
    }

    final boolean isFlyingType(int obfuscationGuard) {
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != -26) {
            this.playSound(28, -45);
          }
          stackIn_11_0 = (13 == this.unitType) || (this.unitType == 15) || (this.unitType == 14) || (this.unitType == 26) || (39 == this.unitType);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.T(" + obfuscationGuard + ')');
        }
    }

    final void playTypeSound(byte obfuscationGuard, int soundIndex) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (3 == this.unitType) {
            this.playSound(-30225, AlphaContainer.field_G[soundIndex]);
          }
          if (this.unitType == 7) {
            this.playSound(-30225, ViewControllerHelpers.field_f[soundIndex]);
          }
          if (this.unitType == 1) {
            this.playSound(-30225, StringReplaceHelpers.field_b[soundIndex]);
          }
          if (9 == this.unitType) {
            this.playSound(-30225, MainMenuDialog.field_Ib[soundIndex]);
          }
          if (2 == this.unitType) {
            this.playSound(-30225, PasswordFieldPainter.field_B[soundIndex]);
          }
          if (this.unitType == 4) {
            this.playSound(-30225, SceneScrollbar.field_Fb[soundIndex]);
          }
          if (this.unitType == 8) {
            this.playSound(-30225, IndexedSpriteState.field_i[soundIndex]);
          }
          if (this.unitType == 11) {
            this.playSound(-30225, NanoFrameClock.field_g[soundIndex]);
          }
          if (this.unitType == 5) {
            this.playSound(-30225, DropdownItemList.field_U[soundIndex]);
          }
          if (this.unitType == 14) {
            this.playSound(-30225, NanoFrameClock.field_n[soundIndex]);
          }
          if (this.unitType == 15) {
            this.playSound(-30225, LoadingProgressDialog.field_pb[soundIndex]);
          }
          if (this.unitType == 17) {
            this.playSound(-30225, AccountCreationHelpers.field_a[soundIndex]);
          }
          if (this.unitType == 6) {
            this.playSound(-30225, MeshModel.field_c[soundIndex]);
          }
          if (this.unitType == 13) {
            this.playSound(-30225, DecimalCheckHelpers.field_c[soundIndex]);
          }
          if (this.unitType == 10) {
            this.playSound(-30225, DecodedSpriteHelpers.field_j[soundIndex]);
          }
          if (this.unitType == 37) {
            this.playSound(-30225, CapsuleBar.field_B[soundIndex]);
          }
          if (this.unitType == 39) {
            this.playSound(-30225, HuffmanCodec.field_h[soundIndex]);
          }
          if (this.unitType == 33) {
            this.playSound(-30225, SoundEffectVoice.field_h[soundIndex]);
          }
          if (this.unitType == 31) {
            this.playSound(-30225, LobbyStateHelpers.field_a[soundIndex]);
          }
          if (this.unitType == 32) {
            this.playSound(-30225, CookieHelpers.field_h[soundIndex]);
          }
          if (this.unitType == 28) {
            this.playSampleAtVolume((byte) -49, 200, IconButtonPainter.field_p[soundIndex]);
          }
          if (this.unitType == 29) {
            this.playSampleAtVolume((byte) -72, 100, IconButtonPainter.field_p[soundIndex]);
          }
          if (this.unitType == 30) {
            this.playSampleAtVolume((byte) -91, 50, IconButtonPainter.field_p[soundIndex]);
          }
          if (this.unitType == 34) {
            this.playSound(-30225, CredentialParseHelpers.field_a[soundIndex]);
          }
          if (25 == this.unitType) {
            this.playSound(-30225, ScreenDisplayMode.field_c[soundIndex]);
          }
          var3_int = -17 / ((obfuscationGuard - 25) / 36);
          if (this.linkedUnit != null) {
          }
          if (this.unitType != 26) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "ml.D(" + obfuscationGuard + ',' + soundIndex + ')');
        }
    }

    final static void updateBrowserLinks(int obfuscationGuard, java.applet.Applet applet) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = applet.getCodeBase();
              if (obfuscationGuard >= -59) {
                return;
              }
              var3 = UrlHelpers.appendSessionParameters(applet, var4, -31843).getFile();
              JavaScriptBridge.callFunctionWithArgs("updatelinks", applet, (byte) 114, new Object[]{"home", var3 + "home.ws"});
              JavaScriptBridge.callFunctionWithArgs("updatelinks", applet, (byte) 114, new Object[]{"gamelist", var3 + "togamelist.ws"});
              JavaScriptBridge.callFunctionWithArgs("updatelinks", applet, (byte) 114, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              JavaScriptBridge.callFunctionWithArgs("updatelinks", applet, (byte) 114, new Object[]{"options", var3 + "options.ws"});
              JavaScriptBridge.callFunctionWithArgs("updatelinks", applet, (byte) 114, new Object[]{"terms", var3 + "terms.ws"});
              JavaScriptBridge.callFunctionWithArgs("updatelinks", applet, (byte) 114, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var2_ref;
            stackIn_9_1 = new StringBuilder().append("ml.KA(").append(obfuscationGuard).append(',');
            if (applet == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void updateStatusTimer(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = this.battle.getCurrentPlayer(false);
          if (this.field_q > 0) {
            this.field_q = this.field_q - this.pendingDamage;
            if (this.field_q <= 0 ||
              22 == this.unitType ||
              23 == this.unitType ||
              this.unitType == 21 ||
              24 == this.unitType ||
              35 == this.unitType ||
              this.unitType == 38) {
              if (this.field_q > 0) {
                this.pendingDamage = 0;
              } else {
                this.pendingDamage = -this.field_q;
              }
              this.y = this.y - this.size / 2;
              this.size = 32;
              this.unitType = 0;
              this.subpixelY = this.y << 4;
              this.field_q = 0;
              this.moving = true;
              this.maskSprite = new Sprite(this.size, this.size);
              this.maskSprite.makeRasterTarget();
              SoftwareRasterizer.fillCircle(this.size >> 1, this.size >> 1, this.size >> 1, 16777215);
            }
          }
          if (this.hasNoLinkedUnit(107) &&
            -this.pendingDamage + this.health > 1) {
            if (256 + this.battle.arenaHeight > this.y) {
              this.playSound(-30225, 54);
              this.battle.field_Eb[this.unitId] = this.battle.field_Eb[this.unitId] + 1;
              if (this.unitId == var2_int) {
                this.battle.animating = false;
              }
            }
            this.y = 256 + this.battle.arenaHeight;
            this.moving = false;
            this.subpixelY = this.y << 4;
            if (obfuscationGuard != 32704) {
              return;
            }
            this.field_q = 0;
            if (0 < this.pendingDamage) {
              if (this.unitType == 19) {
                this.moving = true;
                this.unitType = 0;
              }
              this.playTypeSound((byte) -76, 2);
              this.health = this.health - this.pendingDamage;
              if (this.health <= 0) {
                this.updateTurnLogic(var2_int, 68);
                if (!this.hasNoLinkedUnit(77)) {
                }
                return;
              }
            }
            if (0 > this.pendingDamage) {
              this.heal(-this.pendingDamage, -28922);
            }
            this.pendingDamage = 0;
            return;
          }
          this.playSound(-30225, 54);
          this.updateTurnLogic(var2_int, 70);
          if (this.hasNoLinkedUnit(49)) {
            this.battle.field_Eb[this.unitId] = this.battle.field_Eb[this.unitId] + 1;
          }
          this.health = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.HB(" + obfuscationGuard + ')');
        }
    }

    private final boolean isUnobstructed(int obfuscationGuard) {
        boolean discarded$0 = false;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        BattleUnit var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!this.canBeSelected(obfuscationGuard ^ -10366)) {
            return false;
          }
          if (obfuscationGuard != -10265) {
            discarded$0 = this.canBeSelected(87);
          }
          RequestQueueHelpers.field_b.setDeque((byte) 125, this.battle.units);
          var2_int = 0;
          var3 = (BattleUnit) (RequestQueueHelpers.field_b.first(obfuscationGuard + 10161));
          while (var3 != null) {
            if (this == var3.linkedUnit &&
              var3.isAirborneOrHovering(32)) {
              var4 = var3.x - this.x;
              var5 = var3.y + (-this.y - var3.size / 2) + this.size / 2;
              if ((this.size + var3.size) * (var3.size + this.size) >> 2 > var5 * var5 + var4 * var4) {
                if (1 == this.field_M ||
                  this.field_M == -1) {
                  this.facing = this.field_M;
                  this.field_M = 0;
                  this.subpixelY = var3.subpixelY - (var3.size << 3);
                  this.subpixelX = -((var3.size << 1) * var3.facing) + var3.subpixelX;
                  if (this.size > 32) {
                    this.subpixelX = this.subpixelX + 0 * var3.facing;
                    this.subpixelY = this.subpixelY + 192;
                  }
                  if (32 == var3.unitType) {
                    this.subpixelX = this.subpixelX + 448 * var3.facing;
                    this.subpixelY = this.subpixelY - 480;
                  }
                  this.x = this.subpixelX >> 4;
                  this.y = this.subpixelY >> 4;
                }
                var2_int = 1;
              }
            }
            var3 = (BattleUnit) (RequestQueueHelpers.field_b.next(-18502));
          }
          stackIn_27_0 = var2_int;
          return stackIn_27_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.F(" + obfuscationGuard + ')');
        }
    }

    final void drawSelectionHighlight(int obfuscationGuard, int offsetY, int offsetX) {
        int var4_int = 0;
        BattleUnit var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.unitType != 12 &&
            40 != this.unitType) {
            if (obfuscationGuard != 2) {
              this.field_P = -86;
            }
            var4_int = NameCheckHelpers.field_n[this.ownerPlayer];
            var5 = this.battle.getUnitByOwner(this.ownerPlayer, true);
            if (var5 != null &&
              var5.unitType == 27) {
              var4_int = 13417437;
            }
            var6 = 8421504 ^ (var4_int | 8421504);
            if (this.field_q > 0) {
              this.maskSprite.drawSilhouette(this.x - (this.size >> 1) - (1 - offsetX), -this.size + this.y + offsetY, var6);
              this.maskSprite.drawSilhouette(offsetX + (1 + this.x) - (this.size >> 1), offsetY + this.y - this.size, var6);
              this.maskSprite.drawSilhouette(offsetX + (this.x - (this.size >> 1)), -1 - this.size + this.y + offsetY, var6);
              this.maskSprite.drawSilhouette(offsetX + (-(this.size >> 1) + this.x), offsetY + (1 - this.size + this.y), var6);
              this.maskSprite.drawSilhouette(offsetX + (this.x - (this.size >> 1)), offsetY + (this.y - this.size), var4_int);
            } else {
              var7 = this.size;
              if (7 == this.unitType ||
                this.unitType == 9) {
                var7 = 48;
              }
              var8 = offsetX + this.x;
              var9 = offsetY + this.y - (var7 >> 1);
              SoftwareRasterizer.fillCircleAlpha(var8, var9, var7 >> 1, var4_int, 128);
              QuickChatPhraseCache.fillCircleMasked(var7 >> 1, (byte) 125, 128, var8, var9);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "ml.GA(" + obfuscationGuard + ',' + offsetY + ',' + offsetX + ')');
        }
    }

    final void setHealth(byte obfuscationGuard, int health) {
        try {
          this.health = health;
          if (obfuscationGuard > -79) {
            this.getOwnerId(111);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ml.DB(" + obfuscationGuard + ',' + health + ')');
        }
    }

    private BattleUnit(Battle battle) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.attachedProjectile = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
          this.battle = battle;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ml.<init>(");
          if (battle == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void setFonts(BitmapFont param0, int param1, byte obfuscationGuard, BitmapFont param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          EmptyPainter.field_a = param1;
          DateInputWidget.field_C = param3;
          if (obfuscationGuard < 76) {
            return;
          }
          ListEntryMenuHelpers.field_j = param0;
          ThreeButtonPanel.storeLayoutValues(true, SoftwareRasterizer.field_j / 2, SoftwareRasterizer.field_e / 2);
          LoginPanel.storeLoginLayout(1, param3.field_o, param0.field_m + param0.field_o, param0.field_o, param3.field_m + param3.field_o);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ml.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(obfuscationGuard).append(',');
          if (param3 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void heal(int amount, int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.health = this.health + amount;
          if (250 < this.health) {
            this.health = 250;
          }
          if (obfuscationGuard != -28922) {
            this.playTypeSound((byte) 113, -24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "ml.FA(" + amount + ',' + obfuscationGuard + ')');
        }
    }

    BattleUnit(int unitType, int x, int y, int unitId, Battle battle, int ownerPlayer) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.attachedProjectile = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
          this.x = x;
          this.y = y;
          this.battle = battle;
          this.unitId = unitId;
          this.facing = 1;
          this.subpixelY = this.y << 4;
          this.unitType = unitType;
          this.ownerPlayer = ownerPlayer;
          this.subpixelX = this.x << 4;
          this.linkedUnit = null;
          this.buildSprites(12, true);
          this.castTypeSpell(115);
          this.battle.stampUnitMask(-93, this);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ml.<init>(").append(unitType).append(',').append(x).append(',').append(y).append(',').append(unitId).append(',');
          if (battle == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(ownerPlayer).append(')').toString());
        }
    }

    final int getY(byte obfuscationGuard) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -107 % ((obfuscationGuard - 58) / 41);
          stackIn_1_0 = this.y;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "ml.E(" + obfuscationGuard + ')');
        }
    }

    BattleUnit(int unitType, int x, int y, int unitId, Battle battle, BattleUnit linkedUnit) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.attachedProjectile = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
          this.y = y;
          this.x = x;
          this.subpixelX = this.x << 4;
          this.linkedUnit = linkedUnit;
          this.battle = battle;
          this.facing = 1;
          this.unitId = unitId;
          this.subpixelY = this.y << 4;
          this.unitType = unitType;
          this.moving = true;
          this.ownerPlayer = this.linkedUnit.ownerPlayer;
          this.buildSprites(12, true);
          this.castTypeSpell(-80);
          this.buildSprites(12, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ml.<init>(").append(unitType).append(',').append(x).append(',').append(y).append(',').append(unitId).append(',');
          if (battle == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (linkedUnit == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_K = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available, you will lose a third of your health (<%1>). If you fail to do this within the time limit, you will forfeit the game!";
    }
}
