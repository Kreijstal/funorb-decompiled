/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BattleUnit extends DualLinkNode {
    private int field_o;
    int field_R;
    BattleUnit field_s;
    int field_G;
    boolean field_D;
    static SceneWidget field_V;
    int field_db;
    int field_T;
    int field_kb;
    int field_p;
    private int field_N;
    private int field_y;
    int field_lb;
    boolean field_U;
    int field_jb;
    double field_F;
    private int field_r;
    int field_X;
    int field_W;
    private int field_O;
    private int field_n;
    boolean field_J;
    private Sprite field_B;
    SpellProjectile field_gb;
    int field_E;
    int field_u;
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
    private Battle field_L;
    Sprite field_w;
    int field_eb;
    private int field_A;
    int field_ib;
    private Sprite field_Q;
    private Sprite field_fb;
    static SceneWidget field_S;
    private int field_Z;
    int field_x;
    Sprite field_I;
    boolean field_z;
    static String field_K;
    int field_Y;
    static ContextActionMenu field_H;

    final boolean isDead(int param0) {
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -1) {
            this.isAirborneOrHovering(99);
          }
          stackIn_8_0 = !(this.field_ib > 0) || !(this.isLinked((byte) -81));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.MB(" + param0 + ')');
        }
    }

    final int getStatusTimer(int param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -110) {
            discarded$1 = this.applyPendingDamage(true);
          }
          stackIn_3_0 = this.field_q;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.JA(" + param0 + ')');
        }
    }

    final static int stringHash(CharSequence param0, int param1) {
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
          var2_int = param0.length();
          var3 = 0;
          var4 = -72 / ((param1 - 4) / 62);
          for (var5 = 0; var2_int > var5; var5++) {
            var3 = fe.a((byte) 74, param0.charAt(var5)) + ((var3 << 5) - var3);
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ml.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getTeam(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_eb = -102;
          }
          stackIn_3_0 = this.field_u;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.IB(" + param0 + ')');
        }
    }

    private final void updateSpecialAbility(int param0) {
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
          if (param0 != -5445) {
            this.hasNoLinkedUnit(22);
          }
          if (2 == this.field_ab &&
            null == this.field_s) {
            var2_int = this.field_L.field_y * this.field_T / 6;
            var3_int = -var2_int + this.field_lb;
            var4_int = this.field_db + (-(this.field_Y >> 1) + 480);
            if (var4_int > 0) {
              var5 = Math.abs(var4_int);
              if (Math.abs(var3_int) > Math.abs(var4_int)) {
                var5 = Math.abs(var3_int);
              }
              var6 = 1;
              var7_int = var5;
              while (true) {
                if (var7_int > 0) {
                  jo.field_b = false;
                  if (this.field_L.isSolidAt(-(this.field_Y >> 1) + (this.field_db - var4_int * var7_int / var5), -(var7_int * var3_int / var5) + this.field_lb, (byte) -83) &&
                    !jo.field_b) {
                    var6 = 0;
                  } else {
                    var7_int--;
                    continue;
                  }
                }
                if (var6 == 0) {
                  break;
                }
                var7 = aj.spawnProjectile(this, -480, false, 114, this.field_L, var2_int);
                var7.field_F = var4_int;
                var7.field_u = var3_int;
                this.field_L.onProjectileFinished(52, var7);
                break;
              }
            }
          }
          if (this.field_jb == 12 &&
            Math.random() * 75.0 < (double)this.field_ib) {
            var2_intLifetime1 = (int)(Math.random() * (double)this.field_w.field_q);
            var3_intLifetime1 = (int)(Math.random() * (double)this.field_w.field_y);
            if (this.field_w.field_A[var3_intLifetime1 * this.field_w.field_q + var2_intLifetime1] != 0) {
              var4 = aj.spawnProjectile((BattleUnit) null, -256 + (var3_intLifetime1 + this.field_db) + this.field_w.field_o, false, 109, this.field_L, -128 + this.field_w.field_x + (var2_intLifetime1 + this.field_lb));
              this.field_L.onProjectileFinished(52, var4);
            }
          }
          if (this.field_jb == 25) {
            var9 = aj.spawnProjectile((BattleUnit) null, this.field_db - (this.field_Y >> 1), false, 100, this.field_L, this.field_lb);
            var3 = Math.random() * 6.28;
            var9.field_u = (int)((double)(12 * -this.field_E) + 16.0 * Math.sin(var3));
            var9.field_F = (int)(Math.cos(var3) * 16.0);
            this.field_L.onProjectileFinished(52, var9);
          }
          if (this.field_jb == 19) {
            var10 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 100, this.field_L, this.field_lb);
            var3Lifetime1 = Math.random() * 6.28;
            var10.field_F = (int)(8.0 + Math.sin(var3Lifetime1) * 12.0);
            var10.field_u = (int)(16.0 * Math.cos(var3Lifetime1));
            this.field_L.onProjectileFinished(param0 + 5497, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.HA(" + param0 + ')');
        }
    }

    final int getSize(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -8323) {
            stackIn_4_0 = this.field_Y;
            return stackIn_4_0;
          }
          stackIn_2_0 = -90;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.WA(" + param0 + ')');
        }
    }

    final void initializeAppearance(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (20 == this.field_jb) {
            this.field_q = 25;
            this.field_Y = ScreenDisplayMode.field_i[0].field_w;
            this.field_w = new Sprite(this.field_Y, this.field_Y);
            this.field_w.makeRasterTarget();
            ScreenDisplayMode.field_i[0].drawSilhouette(this.field_Y / 2 - ScreenDisplayMode.field_i[0].field_n / 2, 0, 16777215);
          }
          if (this.field_jb == 22) {
            this.field_q = 75;
            this.field_Y = ScreenDisplayMode.field_i[1].field_w;
            this.field_w = new Sprite(this.field_Y, this.field_Y);
            this.field_w.makeRasterTarget();
            ScreenDisplayMode.field_i[1].drawSilhouette(-(ScreenDisplayMode.field_i[1].field_n / 2) + this.field_Y / 2, 0, 16777215);
          }
          if (param0 != 6) {
            this.field_gb = (SpellProjectile) null;
          }
          if (this.field_jb == 38) {
            this.field_Y = ScreenDisplayMode.field_i[6].field_w;
            this.field_q = 75;
            this.field_w = new Sprite(this.field_Y, this.field_Y);
            this.field_w.makeRasterTarget();
            ScreenDisplayMode.field_i[6].drawSilhouette(-(ScreenDisplayMode.field_i[6].field_n / 2) + this.field_Y / 2, 0, 16777215);
          }
          if (this.field_jb == 21) {
            this.field_q = 100;
            this.field_Y = ScreenDisplayMode.field_i[2].field_w;
            this.field_w = new Sprite(this.field_Y, this.field_Y);
            this.field_w.makeRasterTarget();
            ScreenDisplayMode.field_i[2].drawSilhouette(this.field_Y / 2 - ScreenDisplayMode.field_i[2].field_n / 2, 0, 16777215);
          }
          if (this.field_jb == 23) {
            this.field_Y = ScreenDisplayMode.field_i[3].field_w;
            this.field_q = 75;
            this.field_w = new Sprite(this.field_Y, this.field_Y);
            this.field_w.makeRasterTarget();
            ScreenDisplayMode.field_i[3].drawSilhouette(-(ScreenDisplayMode.field_i[3].field_n / 2) + this.field_Y / 2, 0, 16777215);
          }
          if (this.field_jb == 24) {
            this.field_Y = ScreenDisplayMode.field_i[4].field_w;
            this.field_q = 75;
            this.field_w = new Sprite(this.field_Y, this.field_Y);
            this.field_w.makeRasterTarget();
            ScreenDisplayMode.field_i[4].drawSilhouette(-(ScreenDisplayMode.field_i[4].field_n / 2) + this.field_Y / 2, 0, 16777215);
          }
          if (this.field_jb == 35) {
            this.field_Y = -16 + (80 + ScreenDisplayMode.field_i[5].field_w);
            this.field_q = 75;
            this.field_w = new Sprite(this.field_Y, this.field_Y);
            this.field_w.makeRasterTarget();
            ScreenDisplayMode.field_i[5].drawSilhouette(this.field_Y / 2 - ScreenDisplayMode.field_i[5].field_n / 2, 64, 16777215);
            SoftwareRasterizer.fillCircle(this.field_Y / 2, 80, 16, 16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.EA(" + param0 + ')');
        }
    }

    final boolean isTower(byte param0) {
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 88) {
            this.field_N = 58;
          }
          stackIn_13_0 = (this.field_jb == 20) || (22 == this.field_jb) || (this.field_jb == 21) || (this.field_jb == 23) || (this.field_jb == 24) || (this.field_jb == 35) || (this.field_jb == 38);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.AB(" + param0 + ')');
        }
    }

    final void updateAuras(boolean param0, boolean param1) {
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
          pi.field_b.setDeque((byte) 95, this.field_L.field_i);
          var7 = (BattleUnit) (pi.field_b.first(-83));
          while (var7 != null) {
            if (var7.field_jb == 19) {
              var4 = -var7.field_db + (-48 + this.field_db);
              var3_int = -var7.field_lb + this.field_lb;
              var5 = var3_int * var3_int + var4 * var4;
              if (var5 < var6) {
                var7.field_z = true;
                var7.field_jb = 0;
              }
            }
            var7 = (BattleUnit) (pi.field_b.next(-18502));
          }
          pi.field_b.setDeque((byte) 91, this.field_L.field_Kb);
          var7_ref = (SpellProjectile) (pi.field_b.first(-58));
          if (!param1) {
            this.heal(-6, -62);
          }
          while (var7_ref != null) {
            if (var7_ref.field_I == 55 ||
              157 == var7_ref.field_I ||
              var7_ref.field_I == 168 ||
              111 == var7_ref.field_I ||
              var7_ref.field_I == 68 ||
              var7_ref.field_I == 69 ||
              var7_ref.field_I == 70 ||
              var7_ref.field_I == 56 ||
              var7_ref.field_I == 106 ||
              var7_ref.field_I == 107 ||
              var7_ref.field_I == 117 ||
              var7_ref.field_I == 3 ||
              121 == var7_ref.field_I ||
              var7_ref.field_I == 149) {
              var3_intLifetime1 = -var7_ref.field_v + this.field_lb;
              var4Lifetime1 = -var7_ref.field_G + this.field_db - 48;
              var5Lifetime1 = var3_intLifetime1 * var3_intLifetime1 + var4Lifetime1 * var4Lifetime1;
              if (var5Lifetime1 < var6) {
                if (this != var7_ref.field_t &&
                  117 != var7_ref.field_I &&
                  var7_ref.field_I != 3 &&
                  149 != var7_ref.field_I) {
                }
                if (param0) {
                  var10 = aj.spawnProjectile(this, var7_ref.field_G, false, 154, this.field_L, var7_ref.field_v);
                  this.field_L.onProjectileFinished(52, var10);
                  var11 = aj.spawnProjectile(this, -48 + this.field_db, false, 108, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var11);
                }
                if (var7_ref.field_I != 157 &&
                  var7_ref.field_I != 168) {
                  var7_ref.remove(0);
                } else {
                  var7_ref.field_y = -1;
                  var7_ref.updateMotion(this.field_L.getRound((byte) -75), (byte) -83, this.field_L.field_t, this.field_L.field_mb);
                }
              }
            }
            if (var7_ref.field_I == 149) {
              var3_intLifetime1Lifetime1 = -var7_ref.field_u + (-var7_ref.field_v + this.field_lb);
              var4Lifetime1Lifetime1 = -var7_ref.field_G + (-48 + (this.field_db - var7_ref.field_F));
              var5Lifetime1Lifetime1 = var3_intLifetime1Lifetime1 * var3_intLifetime1Lifetime1 + var4Lifetime1Lifetime1 * var4Lifetime1Lifetime1;
              if (var6 > var5Lifetime1Lifetime1) {
                if (param0) {
                  stackIn_53_1 = var7_ref.field_G;
                  stackIn_54_2 = !(param1);
                  var12 = aj.spawnProjectile(this, stackIn_53_1, stackIn_54_2, 154, this.field_L, var7_ref.field_v);
                  this.field_L.onProjectileFinished(52, var12);
                  var13 = aj.spawnProjectile(this, this.field_db - 48, false, 108, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var13);
                }
                var7_ref.remove(0);
              }
            }
            var7_ref = (SpellProjectile) (pi.field_b.next(-18502));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "ml.K(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isWithinArena(int param0) {
        boolean stackIn_28_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_X >> 4 >= this.field_Y / 2 &&
            this.field_X >> 4 <= -(this.field_Y / 2) + this.field_L.field_y) {
            if (param0 != -1) {
              this.field_t = 29;
            }
            if (null != this.field_gb &&
              this.field_gb.field_I == 121) {
              return false;
            }
            boolean decompiledFrameRemainder0 = true;
            if (!this.isAirborne((byte) -107) &&
              8 != this.field_jb &&
              this.field_jb != 6 &&
              this.field_jb != 25 &&
              10 != this.field_jb && (this.field_lb < 0 ||
              !(this.field_lb <= this.field_L.field_y) ||
              this.field_jb != 19 &&
              (18 != this.field_jb ||
              this.field_x > 0))) {
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
          throw aa.wrapException((Throwable) ((Object) var2), "ml.DA(" + param0 + ')');
        }
    }

    private final boolean isAirborne(byte param0) {
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -107) {
            return false;
          }
          stackIn_9_0 = (this.isFlyingType(param0 + 81)) || (this.field_jb == 17);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.LB(" + param0 + ')');
        }
    }

    final boolean hasNoLinkedUnit(int param0) {
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= 25) {
            stackIn_7_0 = (this.field_s == null);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.H(" + param0 + ')');
        }
    }

    final void draw(int param0, int param1, int param2) {
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
          var35 = new int[]{param1 + this.field_lb, this.field_db + param0};
          var41 = var35;
          if ((28 == this.field_jb ||
            this.field_jb == 29 ||
            this.field_jb == 30 ||
            this.field_jb == 32) && -16 + this.field_L.field_H <= this.field_db) {
            var35[1] = (int)((double)var35[1] - (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 2.0));
          }
          var5 = nj.field_n[this.field_u];
          if (this.field_jb == 39 &&
            this.field_F > 2.5) {
            var36 = aj.spawnProjectile((BattleUnit) null, this.field_db + (-(this.getSize(-8323) / 2) + 13), false, 166, this.field_L, -(42 * this.field_E) + this.field_lb);
            var36.field_u = 20 * -this.field_E;
            var36.field_F = (int)(-5.0 + 15.0 * Math.random());
            this.field_L.onProjectileFinished(52, var36);
          }
          var6 = 0;
          if (this.field_jb == 38 &&
            this.field_F > 0.0) {
            if (!(1.0 > this.field_F)) {
              if (2.0 > this.field_F) {
                var40 = aj.spawnProjectile((BattleUnit) null, -30 + this.field_db - (this.getSize(-8323) / 2 - 13), false, 166, this.field_L, this.field_lb + this.field_E * 22);
                var40.field_u = 30 * this.field_E;
                var40.field_F = (int)(15.0 * Math.random() - 15.0);
                this.field_L.onProjectileFinished(52, var40);
              } else {
                if (!(this.field_F < 3.0)) {
                  if (4.0 > this.field_F) {
                    var39 = aj.spawnProjectile((BattleUnit) null, this.field_db + (-(this.getSize(param2 ^ -1703912164) / 2) + 13 - 5), false, 166, this.field_L, this.field_lb + this.field_E * 22);
                    var39.field_u = 30 * this.field_E;
                    var39.field_F = (int)(Math.random() * 15.0);
                    this.field_L.onProjectileFinished(52, var39);
                  }
                } else {
                  var38 = aj.spawnProjectile((BattleUnit) null, -12 + (this.field_db - this.getSize(-8323) / 2), false, 166, this.field_L, this.field_lb - this.field_E * 22);
                  var38.field_u = 10 * -this.field_E;
                  var38.field_F = (int)(15.0 * Math.random() - 10.0);
                  this.field_L.onProjectileFinished(52, var38);
                }
              }
            } else {
              var37 = aj.spawnProjectile((BattleUnit) null, 13 + this.field_db - this.getSize(param2 ^ -1703912164) / 2, false, 166, this.field_L, -(this.field_E * 22) + this.field_lb);
              var37.field_u = -this.field_E * 10;
              var37.field_F = (int)(-5.0 + 15.0 * Math.random());
              this.field_L.onProjectileFinished(52, var37);
            }
          }
          if (12 == this.field_jb) {
            SoftwareRasterizer.setClip(param1, param0, this.field_L.field_y + param1, EmailLoginCredentials.field_j);
            SocketConnector.field_j[29].draw(-128 + var35[0], var35[1] - 256);
            SoftwareRasterizer.resetClip();
          }
          regionExit1: {
            if (this.field_jb == 40) {
              var7 = (int)(4.0 * Math.sin(this.field_F * 2.0) + 18.0);
              var8 = (int)(32.0 + 4.0 * Math.cos(2.0 * this.field_F));
              var9 = (int)(Math.cos(this.field_F) * 4.0);
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
              if (this.field_jb == 20) {
                ScreenDisplayMode.field_i[0].drawTransparent(-(ScreenDisplayMode.field_i[0].field_n / 2) + var41[0], var41[1] - this.field_Y);
                if (this.field_I != null) {
                  this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + var41[1] + (-(this.field_Y >> 1) - 32));
                }
              } else {
                if (this.field_jb == 22) {
                  ScreenDisplayMode.field_i[1].drawTransparent(-(ScreenDisplayMode.field_i[1].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                  if (this.field_I != null) {
                    this.field_I.drawHorizontalFlip(var35[0] - 16, var6 + (-32 + (var35[1] - (this.field_Y >> 1))));
                  }
                } else {
                  if (this.field_jb != 38) {
                    if (this.field_jb != 21) {
                      if (this.field_jb != 23) {
                        if (24 != this.field_jb) {
                          if (this.field_jb == 35) {
                            ScreenDisplayMode.field_i[5].drawTransparent(-(ScreenDisplayMode.field_i[5].field_n / 2) + var41[0], -this.field_Y + var41[1] + 64);
                            if (this.field_E == -1) {
                              if (null != this.field_B) {
                                this.field_B.drawHorizontalFlip(-16 + (var41[0] - 8), -16 + (var41[1] - (this.field_Y >> 1)) + var6);
                              }
                              if (this.field_bb != null) {
                                this.field_bb.drawHorizontalFlip(var41[0] - 16, -16 + var41[1] - (this.field_Y >> 1) + var6);
                              }
                              if (null != this.field_fb) {
                                this.field_fb.drawHorizontalFlip(8 + (-16 + var41[0]), var41[1] - (this.field_Y >> 1) + (-16 + var6));
                              }
                              if (null != this.field_I) {
                                this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + (-32 + (var41[1] - (this.field_Y >> 1))));
                              }
                            } else {
                              if (this.field_B != null) {
                                this.field_B.drawTransparent(8 + (-16 + var41[0]), var41[1] - (this.field_Y >> 1) - (16 - var6));
                              }
                              if (null != this.field_bb) {
                                this.field_bb.drawTransparent(var41[0] - 16, -16 + (var41[1] - ((this.field_Y >> 1) - var6)));
                              }
                              if (null != this.field_fb) {
                                this.field_fb.drawTransparent(var41[0] - 24, -(this.field_Y >> 1) + var41[1] - 16 + var6);
                              }
                              if (null != this.field_I) {
                                this.field_I.drawTransparent(-16 + var41[0], var6 + (var41[1] - (this.field_Y >> 1) - 32));
                              }
                            }
                            var7 = 255 & SpriteState.field_v;
                            if (128 < var7) {
                              var7 = 256 - var7;
                            }
                            gn.a(128, (byte) 114, -320 - var7, var41[0], -48 + var41[1]);
                          } else {
                            if (this.field_jb == 26 &&
                              ff.field_b != null) {
                              var7 = 0;
                              if (this.field_F > 1.5) {
                                var7 = 1;
                              }
                              if (this.field_F > 3.0) {
                                var7 = 2;
                              }
                              if (4.5 < this.field_F) {
                                var7 = 3;
                              }
                              if (0.0 > this.field_F) {
                                var7 = 4;
                                if (this.field_F > -2.0) {
                                  var7 = 5;
                                }
                                if (this.field_F > -1.0) {
                                  var7 = 6;
                                }
                              }
                              if (this.field_E != -1) {
                                ff.field_b[var7].draw(var41[0] - (this.field_Y >> 1), var41[1] - this.field_Y);
                              } else {
                                ff.field_b[var7].drawFlippedHorizontal(var41[0] - (this.field_Y >> 1), var41[1] - this.field_Y);
                              }
                              break regionExit1;
                            }
                            if (this.field_jb == 39 &&
                              ub.field_e != null) {
                              var7 = 0;
                              if (this.field_F > 1.5) {
                                var7 = 1;
                              }
                              if (this.field_F > 3.0) {
                                var7 = 2;
                              }
                              if (4.5 < this.field_F) {
                                var7 = 3;
                              }
                              if (0.0 > this.field_F) {
                                var7 = 4;
                                if (-2.0 < this.field_F) {
                                  var7 = 5;
                                }
                                if (this.field_F > -1.0) {
                                  var7 = 6;
                                }
                              }
                              if (-1 == this.field_E) {
                                ub.field_e[var7].drawFlippedHorizontal(-(this.field_Y >> 1) + var41[0], var41[1] - this.field_Y);
                              } else {
                                ub.field_e[var7].draw(var41[0] - (this.field_Y >> 1), -this.field_Y + var41[1]);
                              }
                              break regionExit1;
                            }
                            if (13 == this.field_jb &&
                              LoadingTracker.field_d != null) {
                              var7 = 0;
                              if (1.5 < this.field_F) {
                                var7 = 1;
                              }
                              if (this.field_F > 3.0) {
                                var7 = 2;
                              }
                              if (this.field_F > 4.5) {
                                var7 = 3;
                              }
                              if (0.0 > this.field_F) {
                                var7 = 4;
                                if (-2.0 < this.field_F) {
                                  var7 = 5;
                                }
                                if (this.field_F > -1.0) {
                                  var7 = 6;
                                }
                              }
                              if (this.field_E != -1) {
                                LoadingTracker.field_d[var7].draw(-(this.field_Y >> 1) + var41[0], -this.field_Y + var41[1]);
                              } else {
                                LoadingTracker.field_d[var7].drawFlippedHorizontal(-(this.field_Y >> 1) + var41[0], var41[1] - this.field_Y);
                              }
                              break regionExit1;
                            }
                            if (15 == this.field_jb &&
                              Checkbox.field_L != null) {
                              var7 = 0;
                              if (this.field_F > 1.5) {
                                var7 = 1;
                              }
                              if (3.0 < this.field_F) {
                                var7 = 2;
                              }
                              if (4.5 < this.field_F) {
                                var7 = 3;
                              }
                              if (this.field_F < 0.0) {
                                var7 = 4;
                                if (-2.0 < this.field_F) {
                                  var7 = 5;
                                }
                                if (-1.0 < this.field_F) {
                                  var7 = 6;
                                }
                              }
                              if (this.field_E != -1) {
                                Checkbox.field_L[var7].draw(-(this.field_Y >> 1) + var41[0], var41[1] - this.field_Y);
                              } else {
                                Checkbox.field_L[var7].drawFlippedHorizontal(var41[0] - (this.field_Y >> 1), var41[1] - this.field_Y);
                              }
                              break regionExit1;
                            }
                            if (14 == this.field_jb &&
                              null != ArchiveIndex.field_m) {
                              var7 = 0;
                              if (this.field_F > 1.5) {
                                var7 = 1;
                              }
                              if (this.field_F > 3.0) {
                                var7 = 2;
                              }
                              if (this.field_F > 4.5) {
                                var7 = 3;
                              }
                              if (0.0 > this.field_F) {
                                var7 = 4;
                                if (-2.0 < this.field_F) {
                                  var7 = 5;
                                }
                                if (-1.0 < this.field_F) {
                                  var7 = 6;
                                }
                              }
                              if (-1 == this.field_E) {
                                ArchiveIndex.field_m[var7].drawFlippedHorizontal(-(this.field_Y >> 1) + var41[0], var41[1] - this.field_Y);
                              } else {
                                ArchiveIndex.field_m[var7].draw(var41[0] - (this.field_Y >> 1), var41[1] - this.field_Y);
                              }
                              break regionExit1;
                            }
                            if (17 == this.field_jb &&
                              null != ra.field_c) {
                              var7 = 0;
                              if (this.field_F > 1.5) {
                                var7 = 1;
                              }
                              if (3.0 < this.field_F) {
                                var7 = 2;
                              }
                              if (4.5 < this.field_F) {
                                var7 = 3;
                              }
                              if (-1 == this.field_E) {
                                stackIn_148_0 = ra.field_c;
                                if (!this.field_U) {
                                  stackIn_149_1 = 0;
                                } else {
                                  stackIn_149_1 = 4;
                                }
                                ((IndexedSprite) (Object) stackIn_148_0[stackIn_149_1 + var7]).drawFlippedHorizontal(-(this.field_Y >> 1) + var41[0], var41[1] - this.field_Y);
                              } else {
                                stackIn_143_0 = ra.field_c;
                                if (!this.field_U) {
                                  stackIn_144_1 = 0;
                                } else {
                                  stackIn_144_1 = 4;
                                }
                                ((IndexedSprite) (Object) stackIn_143_0[stackIn_144_1 + var7]).draw(var41[0] - (this.field_Y >> 1), var41[1] - this.field_Y);
                              }
                              break regionExit1;
                            }
                            if (this.field_jb == 6 &&
                              null != NumericDateInputWidget.field_U) {
                              var7 = 0;
                              if (0.75 < this.field_F) {
                                var7 = 1;
                              }
                              if (this.field_F > 1.5) {
                                var7 = 2;
                              }
                              if (this.field_F > 2.25) {
                                var7 = 3;
                              }
                              if (3.0 < this.field_F) {
                                var7 = 4;
                              }
                              if (this.field_F > 3.75) {
                                var7 = 5;
                              }
                              if (4.5 < this.field_F) {
                                var7 = 6;
                              }
                              if (5.25 < this.field_F) {
                                var7 = 7;
                              }
                              if (-1 != this.field_E) {
                                NumericDateInputWidget.field_U[var7].draw(var41[0] - 24, -36 + var41[1]);
                              } else {
                                NumericDateInputWidget.field_U[var7].drawFlippedHorizontal(var41[0] - 24, -36 + var41[1]);
                              }
                              break regionExit1;
                            }
                            if (this.field_jb != 7 &&
                              this.field_jb != 9 &&
                              this.field_jb != 2 &&
                              this.field_jb != 5 &&
                              28 != this.field_jb &&
                              this.field_jb != 29 &&
                              this.field_jb != 30) {
                              if (this.field_ab == 3) {
                                if (this.field_E != -1) {
                                  this.field_bb.drawCenteredRotatedScaledBilinear(var41[0], -(this.field_Y >> 1) + var41[1], (int)(-this.field_F * 65536.0 / 6.28), 4096);
                                } else {
                                  this.field_bb.copyFlippedHorizontal().drawCenteredRotatedScaledBilinear(var41[0], var41[1] - (this.field_Y >> 1), (int)(this.field_F * 65536.0 / 6.28), 4096);
                                }
                              } else {
                                var7 = this.field_Y;
                                if (this.field_E != -1) {
                                  if (null != this.field_B) {
                                    this.field_B.drawTransparent(this.field_r + var41[0] - (var7 >> 2), var41[1] - var7 - (-this.field_O - var6));
                                  }
                                  if (this.field_cb != null) {
                                    this.field_cb.drawTransparent(-(var7 >> 1) + (var41[0] + this.field_t), this.field_Z + (-var7 + var41[1]));
                                  }
                                  if (null != this.field_bb) {
                                    this.field_bb.drawTransparent(-(var7 >> 1) + var41[0], var41[1] - var7 + var6);
                                  }
                                  if (this.field_jb != 32) {
                                    if (this.field_jb != 37) {
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
                                    if (this.field_L.field_N != null) {
                                      var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << 16 | this.field_L.field_N[this.field_T][4] << 8);
                                    }
                                    var9 = -4 + (this.field_n + var41[0]) - (var7 >> 2);
                                    var10 = this.field_N + (var41[1] - this.field_Y + (8 + var6));
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
                                      jg.field_c[var12].drawQuarterSize(-2 + var13_int, -2 + var14);
                                      SoftwareRasterizer.fillCircleAlpha(var13_int, var14, 4, var8, 32);
                                    }
                                  }
                                  if (this.field_ab == 1) {
                                    gn.a(12, (byte) 73, 128, -4 + (this.field_n - (var7 >> 2)) + var41[0], var6 + this.field_N + var41[1] + (-this.field_Y + 8));
                                    var8 = -4 - (var7 >> 2) + (this.field_n + (int)(-6.0 + 13.0 * Math.random()));
                                    var9 = -this.field_Y + 8 + this.field_N - (-var6 - (int)(-18.0 + 13.0 * Math.random()) - (-6 + Math.abs(-this.field_n + var8 + (var7 >> 2) + 4)));
                                    var47 = aj.spawnProjectile((BattleUnit) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                                    var47.field_y = 16;
                                    this.field_L.onProjectileFinished(52, var47);
                                  }
                                  if (this.field_fb != null) {
                                    this.field_fb.drawTransparent(this.field_n - (var7 >> 2) + var41[0] - (var7 >> 1), var6 - var7 + (var41[1] + this.field_N));
                                  }
                                  if (((this.field_jb == 18)) &&
                                    ((null != SoundCache.field_m))) {
                                    var8 = 0;
                                    if (this.field_F > 1.5) {
                                      var8 = 1;
                                    }
                                    if (3.0 < this.field_F) {
                                      var8 = 2;
                                    }
                                    if (4.5 < this.field_F) {
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
                                if (this.field_jb == 32) {
                                  if (this.field_I != null) {
                                    this.field_I.drawHorizontalFlip(-12 - (var7 >> 1) + var41[0], var6 + (-(3 * var7 / 2) + var41[1]));
                                  }
                                } else {
                                  if (37 == this.field_jb) {
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
                                  gn.a(12, (byte) 117, 128, var41[0] + ((var7 >> 2) - this.field_n + 4), this.field_N + (8 + var41[1] + (-this.field_Y + var6)));
                                  var8 = -this.field_n + (var7 >> 2) - (-4 - (int)(13.0 * Math.random() - 6.0));
                                  var9 = this.field_N - this.field_Y + 8 - (-var6 - (int)(Math.random() * 13.0 - 18.0) - (-6 + Math.abs(-4 + (var8 - (var7 >> 2)) + this.field_n)));
                                  var46 = aj.spawnProjectile((BattleUnit) null, this.field_db + var9, false, 109, this.field_L, this.field_lb + var8);
                                  var46.field_y = 16;
                                  this.field_L.onProjectileFinished(52, var46);
                                }
                                if (this.field_ab == 0) {
                                  var8 = 0;
                                  if (this.field_L.field_N != null) {
                                    var8 = this.field_L.field_N[this.field_T][5] | (this.field_L.field_N[this.field_T][3] << 16 | this.field_L.field_N[this.field_T][4] << 8);
                                  }
                                  var9 = 4 + ((var7 >> 2) + var41[0] - this.field_n);
                                  var10 = this.field_N + (-this.field_Y + var41[1]) - (-8 - var6);
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
                                    jg.field_c[var12].drawQuarterSize(-2 + var13_intLifetime1, var14Lifetime2 - 2);
                                    SoftwareRasterizer.fillCircleAlpha(var13_intLifetime1, var14Lifetime2, 4, var8, 32);
                                  }
                                }
                                if (null != this.field_fb) {
                                  this.field_fb.drawHorizontalFlip(-(var7 >> 2) + (var41[0] - this.field_n), this.field_N + (var41[1] - var7 + var6));
                                }
                                if (((this.field_jb == 18)) &&
                                  ((SoundCache.field_m != null))) {
                                  var8 = 0;
                                  if (this.field_F > 1.5) {
                                    var8 = 1;
                                  }
                                  if (3.0 < this.field_F) {
                                    var8 = 2;
                                  }
                                  if (this.field_F > 4.5) {
                                    var8 = 3;
                                  }
                                  SoundCache.field_m[var8].drawFlippedHorizontal(-32 + (var41[0] + 16), var41[1] - 48);
                                }
                              }
                              break regionExit1;
                            }
                            var7 = this.field_Y;
                            if (this.field_jb == 7 ||
                              this.field_jb == 9) {
                              var7 = 64;
                            }
                            var42 = this.field_fb;
                            var8_ref_qb = var42;
                            var9 = -(var7 >> 2) + var41[0] - this.field_n;
                            if (-1 != this.field_E) {
                              var9 = -(var7 >> 2) + (var41[0] - (var7 >> 1) + this.field_n);
                            }
                            var10 = var41[1] - var7 + (this.field_O + var6);
                            if (this.field_E == -1) {
                              var8_ref_qb = var42.copyFlippedHorizontal();
                            }
                            boolean decompiledFrameRemainder0 = true;
                            var11Lifetime2 = 0;
                            if (this.field_gb != null &&
                              121 != this.field_gb.field_I) {
                              if (this.field_gb.field_I == 138) {
                                var11Lifetime2 = 1;
                              } else {
                                if (2 != this.field_jb) {
                                  if (30 == this.field_jb) {
                                    if (this.field_gb.field_y >= 12) {
                                      var9 = var9 - (25 - this.field_gb.field_y) * 5 * this.field_gb.field_u / 50;
                                      var10 = var10 - (25 - this.field_gb.field_y) * 5 * this.field_gb.field_F / 50;
                                    } else {
                                      var10 = var10 - 5 * this.field_gb.field_F * this.field_gb.field_y / 50;
                                      var9 = var9 - this.field_gb.field_y * this.field_gb.field_u * 5 / 50;
                                    }
                                  } else {
                                    if (this.field_jb != 9 &&
                                      this.field_jb != 5) {
                                      if (this.field_jb != 28 &&
                                        this.field_jb != 29) {
                                        if ((this.field_jb == 7)) {
                                          var9 = var9 + this.field_gb.field_u / 2;
                                          var10 = var10 + this.field_gb.field_F / 2;
                                          var12_ref_qb = var8_ref_qb;
                                          var44 = new Sprite(128, 128);
                                          var8_ref_qb = var44;
                                          var10 -= 32;
                                          var9 -= 32;
                                          var44.makeRasterTarget();
                                          var12_ref_qb.drawRotatedAboutPivot(512, 768, 1024, 1024, this.field_E * -this.field_gb.field_y * 8000, 4096);
                                          ce.field_m.a(true);
                                        }
                                      } else {
                                        var10 = var10 - this.field_gb.field_y * this.field_gb.field_F / 100;
                                        var9 = var9 - this.field_gb.field_y * this.field_gb.field_u / 100;
                                        var12_ref_qbLifetime2 = var8_ref_qb;
                                        var43 = new Sprite(2 * this.field_Y, this.field_Y * 2);
                                        var8_ref_qb = var43;
                                        var9 = var9 - this.field_Y / 2;
                                        var10 = var10 - this.field_Y / 2;
                                        var43.makeRasterTarget();
                                        var12_ref_qbLifetime2.drawRotatedAboutPivot(this.field_Y / 2 << 4, 3 * this.field_Y / 4 << 4, this.field_Y << 4, this.field_Y << 4, this.field_E * 4000 * -this.field_gb.field_y, 4096);
                                        ce.field_m.a(true);
                                      }
                                      decompiledFrameRemainder0 = false;
                                    }
                                    else {
                                      var9 = var9 + this.field_gb.field_u * this.field_gb.field_y / 200;
                                      var10 = var10 + this.field_gb.field_y * this.field_gb.field_F / 200;
                                      var12_ref_qbLifetime1 = var8_ref_qb;
                                      var9 -= 32;
                                      var10 -= 32;
                                      var45 = new Sprite(128, 128);
                                      var8_ref_qb = var45;
                                      var45.makeRasterTarget();
                                      var12_ref_qbLifetime1.drawRotatedAboutPivot(512, 768, 1024, 1024, this.field_E * 4000 * -this.field_gb.field_y, 4096);
                                      ce.field_m.a(true);
                                    }
                                  }
                                } else {
                                  if (this.field_gb.field_y < 12) {
                                    var9 = var9 + this.field_gb.field_y * this.field_gb.field_u / 100;
                                    var10 = var10 + this.field_gb.field_y * this.field_gb.field_F / 100;
                                  } else {
                                    var10 = var10 + (-this.field_gb.field_y + 25) * this.field_gb.field_F / 100;
                                    var9 = var9 + this.field_gb.field_u * (-this.field_gb.field_y + 25) / 100;
                                  }
                                }
                              }
                            }
                            if (-1 == this.field_E) {
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
                                  this.field_I.copyFlippedHorizontal().a(4096, var41[1] + (-(var7 * 3 / 4) + var6), 19, var41[0], var12Lifetime2);
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
                                  this.field_I.a(4096, -(3 * var7 / 4) + (var41[1] + var6), param2 ^ 1703903772, var41[0], var12Lifetime2);
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
                          ScreenDisplayMode.field_i[4].drawTransparent(var41[0] - ScreenDisplayMode.field_i[4].field_n / 2, -this.field_Y + var41[1]);
                          if (this.field_I != null) {
                            this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + var41[1] - (this.field_Y >> 1) - 32);
                          }
                        }
                      } else {
                        ScreenDisplayMode.field_i[3].drawTransparent(-(ScreenDisplayMode.field_i[3].field_n / 2) + var41[0], var41[1] - this.field_Y);
                        if (this.field_I != null) {
                          this.field_I.drawHorizontalFlip(var41[0] - 16, var6 + (-32 + var41[1] - (this.field_Y >> 1)));
                        }
                      }
                    } else {
                      ScreenDisplayMode.field_i[2].drawTransparent(-(ScreenDisplayMode.field_i[2].field_n / 2) + var41[0], -this.field_Y + var41[1]);
                      if (null != this.field_I) {
                        this.field_I.drawHorizontalFlip(-16 + var41[0], var41[1] - (this.field_Y >> 1) + (-32 + var6));
                      }
                    }
                  } else {
                    ScreenDisplayMode.field_i[6].drawTransparent(-(ScreenDisplayMode.field_i[6].field_n / 2) + var35[0], -this.field_Y + var35[1]);
                    if (null != this.field_I) {
                      this.field_I.drawHorizontalFlip(-16 + var35[0], var6 - (this.field_Y >> 1) + var35[1] - 32);
                    }
                  }
                }
              }
            }
          }
          if (this.field_q <= 0 &&
            this.field_D &&
            this.field_jb != 12 &&
            this.field_jb != 40) {
            for (var7Lifetime1 = 0; var7Lifetime1 < 3; var7Lifetime1++) {
              var8Lifetime1 = var41[0] + (int)(Math.sin(3.14 * (double)var7Lifetime1 / 1.5 + 0.125 * (double)SpriteState.field_v) * 16.0);
              var9Lifetime1 = -this.field_Y + (var41[1] - 10);
              var10Lifetime1 = (int)(Math.cos(3.14 * (double)var7Lifetime1 / 1.5 + 0.125 * (double)SpriteState.field_v) * 8.0);
              if (var10Lifetime1 <= 0) {
                bb.field_g[(3 * var7Lifetime1 + SpriteState.field_v / 7 & 1) + 86].drawHorizontalFlip(var8Lifetime1 - 20, var9Lifetime1 - (-var10Lifetime1 + 20));
              } else {
                bb.field_g[(1 & SpriteState.field_v / 7 + var7Lifetime1 * 3) + 86].drawTransparent(var8Lifetime1 - 20, -20 + (var9Lifetime1 + var10Lifetime1));
              }
            }
          }
          if (this.field_u == this.field_T) {
            var7Lifetime2 = this.field_L.field_x[this.field_T];
            if (var7Lifetime2 != 10 &&
              this.field_L.field_X[this.field_T] > 0) {
              var8Lifetime2 = this.field_L.field_Ab[this.field_T];
              var9Lifetime2 = this.field_L.field_o[this.field_T];
              var10Lifetime2 = var8Lifetime2 + param1;
              var11Lifetime1 = var9Lifetime2 + param0;
              var12Lifetime1 = 0;
              var13 = null;
              var14Lifetime1 = 10;
              if (0 == var7Lifetime2) {
                var12Lifetime1 = 1;
                var13 = lf.field_c;
              }
              if (var7Lifetime2 == 1) {
                var13 = DualLinkNode.field_j;
              }
              if (var7Lifetime2 == 2) {
                var12Lifetime1 = 1;
                var13 = SceneTabbedPanel.field_Pb;
              }
              if (3 == var7Lifetime2) {
                var13 = fo.field_g;
              }
              if (var7Lifetime2 == 4) {
                var12Lifetime1 = 1;
                var13 = fc.field_e;
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
                var13 = eo.field_a;
              }
              if (var7Lifetime2 == 8) {
                var14Lifetime1 = 3;
                var12Lifetime1 = 1;
                var13 = ae.field_a;
              }
              var15 = new int[]{255, 0, 0};
              var16 = new int[]{0, 255, 0};
              var17 = new int[]{0, 0, 255};
              var18 = new int[]{255, 255, 255};
              var19 = this.field_u;
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
              if (this.field_L.field_N != null) {
                var15[0] = this.field_L.field_N[var19][0];
                var15[1] = this.field_L.field_N[var19][1];
                var15[2] = this.field_L.field_N[var19][2];
                var16[0] = this.field_L.field_N[var19][3];
                var16[1] = this.field_L.field_N[var19][4];
                var16[2] = this.field_L.field_N[var19][5];
                var17[0] = this.field_L.field_N[var19][6];
                var17[1] = this.field_L.field_N[var19][7];
                var17[2] = this.field_L.field_N[var19][8];
                var18[0] = this.field_L.field_N[var19][9];
                var18[1] = this.field_L.field_N[var19][10];
                var18[2] = this.field_L.field_N[var19][11];
              }
              if (var12Lifetime1 != 0) {
                var20 = SpriteState.field_v / var14Lifetime1 % java.lang.reflect.Array.getLength(var13);
                var21 = new Sprite(((Sprite) (((Object[]) (var13))[0])).field_n, ((Sprite) (((Object[]) (var13))[0])).field_w);
                var22 = SoftwareRasterizer.field_l;
                var23 = SoftwareRasterizer.field_e;
                var24 = SoftwareRasterizer.field_j;
                var21.makeRasterTarget();
                pc.drawTexturedSpriteIntGuard(var17, 0, var18, var15, 106, var16, (Sprite) (((Object[]) (var13))[var20]), 0);
                SoftwareRasterizer.field_e = var23;
                SoftwareRasterizer.field_j = var24;
                SoftwareRasterizer.field_l = var22;
                SoftwareRasterizer.resetClip();
                var25 = (int)(4.0 * Math.sin((double)(SpriteState.field_v >> 4)));
                if (var7Lifetime2 == 4 ||
                  var7Lifetime2 == 6) {
                  var25 = -1;
                }
                if (this.field_E < 0 &&
                  var7Lifetime2 != 4) {
                  var21.drawHorizontalFlip(-(((Sprite) (((Object[]) (var13))[var20])).field_n / 2) + var10Lifetime2, -var25 - ((Sprite) (((Object[]) (var13))[var20])).field_w + var11Lifetime1);
                } else {
                  if (var7Lifetime2 != 4 ||
                    !((-1 + this.field_L.field_X[this.field_u]) % 5 - (-1 + (this.field_L.field_X[this.field_u] - 1) / 5) <= 0)) {
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
                pc.drawTexturedSpriteIntGuard(kg.field_d[2], var33 + var22_int, kg.field_d[3], kg.field_d[0], -127, kg.field_d[1], (Sprite) (((Object[]) (var13))[5]), var32 + var20);
                pc.drawTexturedSpriteIntGuard(kg.field_d[2], var26 + var33, kg.field_d[3], kg.field_d[0], -95, kg.field_d[1], (Sprite) (((Object[]) (var13))[4]), var24 + var32);
                pc.drawTexturedSpriteIntGuard(kg.field_d[2], var33, kg.field_d[3], kg.field_d[0], 64, kg.field_d[1], (Sprite) (((Object[]) (var13))[3]), var32);
                var33 -= 3;
                var33 -= 6;
                pc.drawTexturedSpriteIntGuard(kg.field_d[2], var33, kg.field_d[3], kg.field_d[0], 58, kg.field_d[1], (Sprite) (((Object[]) (var13))[2]), var32);
                var33 += 6;
                var33 -= 6;
                var33 += 3;
                var33 += 6;
                pc.drawTexturedSpriteIntGuard(kg.field_d[2], var33 + var27, kg.field_d[3], kg.field_d[0], -91, kg.field_d[1], (Sprite) (((Object[]) (var13))[1]), var25 + var32);
                pc.drawTexturedSpriteIntGuard(kg.field_d[2], var33 + var23, kg.field_d[3], kg.field_d[0], 18, kg.field_d[1], (Sprite) (((Object[]) (var13))[0]), var32 + var21_int);
                SoftwareRasterizer.field_l = var28;
                SoftwareRasterizer.field_j = var30;
                SoftwareRasterizer.field_e = var29;
                SoftwareRasterizer.resetClip();
                if (0 > this.field_E) {
                  var31.drawHorizontalFlip(var10Lifetime2 - 32, -32 + var11Lifetime1);
                } else {
                  var31.drawTransparent(var10Lifetime2 - 32, -32 + var11Lifetime1);
                }
              }
            }
          }
          if (!this.field_z &&
            this.field_jb != 12 &&
            this.field_jb != 40) {
            var7Lifetime3 = this.field_ib;
            if (this.field_jb == 32 ||
              27 == this.field_jb) {
              var7Lifetime3 = var7Lifetime3 * 2;
            }
            if (0 < this.field_q) {
              var7Lifetime3 = var7Lifetime3 + this.field_q;
            }
            var8Lifetime3 = CachedArchiveProvider.field_t.field_C / 2;
            SpellProjectile.field_B.drawParagraph(Integer.toString(var7Lifetime3), -var8Lifetime3 + param1 + this.field_lb, -(var8Lifetime3 * 2) + (param0 + this.field_db) + (-this.field_Y - 2), var8Lifetime3 * 2, var8Lifetime3 * 2, (var5 | 8421504) ^ 8421504, 0, 1, 1, CachedArchiveProvider.field_t.field_C);
            SpellProjectile.field_B.drawParagraph(Integer.toString(var7Lifetime3), -1 + (-var8Lifetime3 + (param1 + this.field_lb)), -this.field_Y + param0 + (this.field_db - var8Lifetime3 * 2 - 1), 2 * var8Lifetime3, var8Lifetime3 * 2, 8421504 ^ (var5 | 8421504), 0, 1, 1, CachedArchiveProvider.field_t.field_C);
            SpellProjectile.field_B.drawParagraph(Integer.toString(var7Lifetime3), param1 + this.field_lb - var8Lifetime3, -(2 * var8Lifetime3) + (this.field_db + param0) - (this.field_Y + 1), var8Lifetime3 * 2, var8Lifetime3 * 2, var5, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
            if (null == this.field_s &&
              this.field_T < this.field_L.field_q &&
              this.field_L.field_S[this.field_T] > 0) {
              rb.field_o[-1 + this.field_L.field_S[this.field_T]].drawTintedGrayscale(param1 + (this.field_lb - 15), -(var8Lifetime3 * 2) - this.field_Y + (param0 + this.field_db - 13), var5);
            }
          }
          if (param2 != 1703903841) {
            this.field_L = (Battle) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var4), "ml.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean hasPendingDamage(int param0) {
        int var2_int = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = -108 / ((33 - param0) / 56);
          stackIn_4_0 = !(this.field_x <= 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.BB(" + param0 + ')');
        }
    }

    private final boolean applyPendingDamage(boolean param0) {
        int dupTemp$0 = 0;
        int[] stackIn_15_0 = null;
        Battle stackIn_15_1 = null;
        boolean stackIn_16_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        BattleUnit var3 = null;
        try {
          if (this.field_x > 0) {
            if (19 == this.field_jb) {
              this.field_jb = 0;
              this.field_z = true;
            }
            this.playTypeSound((byte) 101, 2);
            if (this.field_q > 0) {
              var3 = this.field_L.getUnitByOwner(this.field_L.getCurrentPlayer(false), true);
              if (var3 != null &&
                var3.isTower((byte) 103)) {
                stackIn_15_0 = this.field_L.field_R;
                stackIn_15_1 = this.field_L;
                stackIn_16_2 = !(param0);
                dupTemp$0 = ((Battle) (Object) stackIn_15_1).getCurrentPlayer(stackIn_16_2);
                stackIn_15_0[dupTemp$0] = stackIn_15_0[dupTemp$0] + this.field_x;
              }
              this.field_q = this.field_q - this.field_x;
            } else {
              this.field_ib = this.field_ib - this.field_x;
            }
            if (this.field_ib <= 0) {
              this.field_M = 0;
              this.field_L.a(this, 0);
              this.updateTurnLogic(this.field_L.getCurrentPlayer(false), 120);
              return true;
            }
          }
          if (this.field_x < 0) {
            this.heal(-this.field_x, -28922);
          }
          this.field_x = 0;
          if (param0) {
            return false;
          }
          this.field_D = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.SA(" + param0 + ')');
        }
    }

    final BattleUnit getLinkedUnit(int param0) {
        RuntimeException var2 = null;
        BattleUnit stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 24501) {
            this.field_bb = (Sprite) null;
          }
          stackIn_3_0 = this.field_s;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.EB(" + param0 + ')');
        }
    }

    final boolean getControlFlag(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 12) {
            stackIn_4_0 = this.field_U;
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.KB(" + param0 + ')');
        }
    }

    private final void updateSupport(int param0) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (param0 != -11) {
            discarded$0 = this.isAirborne((byte) 37);
          }
          stackIn_5_0 = (!this.isWithinArena(-1)) ? 0 : 1;
          var2_int = stackIn_5_0;
          if (12 == this.field_jb) {
            var2_int = 1;
          }
          if (this.field_jb != 22 &&
            this.field_jb != 4 &&
            this.field_jb != 5) {
            if ((this.field_L.field_x[this.field_u] == 3) && (!(0 >= this.field_L.field_X[this.field_u])) && (this.field_lb >= 0 &&
              this.field_lb <= this.field_L.field_y &&
              -32 + this.field_L.field_H < this.field_db && (this.field_ib > 5 ||
              0 < this.field_q))) {
              this.field_db = -32 + this.field_L.field_H;
              this.field_L.stampShape(-115, this.field_lb - 24, gj.field_f[9], -gj.field_f[9].field_f + this.field_L.field_H - 32);
              this.field_L.stampShape(param0 ^ 117, -8 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f - 32 + this.field_L.field_H);
              this.field_L.stampShape(param0 + 92, 8 + this.field_lb, gj.field_f[9], this.field_L.field_H - 32 - gj.field_f[9].field_f);
              if (22 != this.field_jb) {
                this.field_ib = this.field_ib - 5;
              }
            }
          } else {
            if (this.field_lb >= 0 &&
              this.field_lb <= this.field_L.field_y &&
              -32 + this.field_L.field_H < this.field_db && (this.field_ib > 5 ||
              0 < this.field_q)) {
              this.field_db = -32 + this.field_L.field_H;
              this.field_L.stampShape(-115, this.field_lb - 24, gj.field_f[9], -gj.field_f[9].field_f + this.field_L.field_H - 32);
              this.field_L.stampShape(param0 ^ 117, -8 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f - 32 + this.field_L.field_H);
              this.field_L.stampShape(param0 + 92, 8 + this.field_lb, gj.field_f[9], this.field_L.field_H - 32 - gj.field_f[9].field_f);
              if (22 != this.field_jb) {
                this.field_ib = this.field_ib - 5;
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
          throw aa.wrapException((Throwable) ((Object) var2), "ml.BA(" + param0 + ')');
        }
    }

    final void processTurnStart(int param0) {
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
          if (this.field_T == this.field_u) {
            var2_int = this.field_L.field_x[this.field_T];
            if (10 != var2_int &&
              this.field_L.field_X[this.field_T] > 0) {
              var3 = this.field_L.field_Ab[this.field_T];
              var4 = this.field_L.field_o[this.field_T];
              var5_int = this.field_lb - this.field_E * this.field_Y / 2;
              var6 = this.field_db - this.field_Y / 2;
              if (var2_int == 1 ||
                var2_int == 7 ||
                3 == var2_int) {
                var6 = this.field_db;
                var5_int = -(this.field_E * this.field_Y / 2) + this.field_lb;
                for (var7 = 0; var7 < 32; var7 += 2) {
                  if (!this.field_L.isSolidAt(var6, var5_int, (byte) -83)) {
                    var6 += 2;
                  } else {
                    var6 -= 2;
                  }
                }
                if (!this.field_L.isSolidAt(2 + var6, var5_int, (byte) -83)) {
                  var5_int = this.field_lb - this.field_E * this.field_Y / 4;
                  var6 = this.field_db;
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
                  !this.field_z) {
                  var5_int = this.field_lb;
                  var3 = this.field_lb;
                  var6 = this.field_db;
                  var4 = this.field_db;
                } else {
                  var5_int = var3;
                  var6 = var4;
                }
              }
              if (2 == var2_int &&
                null != LoadingTracker.field_k) {
                if (SpriteState.field_v / 10 % SceneTabbedPanel.field_Pb.length >= SceneTabbedPanel.field_Pb.length - 1 &&
                  !this.field_z) {
                  var5_int = this.field_lb;
                  var3 = this.field_lb;
                  var6 = -16 - this.field_Y + this.field_db;
                  var4 = -16 - this.field_Y + this.field_db;
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
              this.field_L.field_Ab[this.field_T] = localTemp$0;
              localTemp$1 = 15 * var4 + var6 >> 4;
              var4Lifetime3 = localTemp$1;
              this.field_L.field_o[this.field_T] = localTemp$1;
            }
          }
          if (0 < this.field_x) {
            this.field_D = true;
          }
          if (this.field_D) {
            this.field_M = 0;
          }
          if (this.field_jb == 17) {
            this.field_s = this.field_L.getUnitByOwner(this.field_u, true);
            var2_intLifetime1 = 65536;
            pi.field_b.setDeque((byte) 114, this.field_L.field_i);
            var6_ref_ml = (BattleUnit) (pi.field_b.first(-31));
            while (var6_ref_ml != null) {
              if (~var6_ref_ml.field_u == ~this.field_u) {
                if (var6_ref_ml.field_s != null &&
                  var6_ref_ml.field_jb != 9 &&
                  var6_ref_ml.field_jb != 7 &&
                  var6_ref_ml.field_jb != 37) {
                  var6_ref_ml = (BattleUnit) (pi.field_b.next(-18502));
                  continue;
                }
                var5_intLifetime1 = -var6_ref_ml.field_db + this.field_db - this.field_Y / 2;
                var4Lifetime1 = this.field_lb - var6_ref_ml.field_lb;
                var3Lifetime1 = var5_intLifetime1 * var5_intLifetime1 + var4Lifetime1 * var4Lifetime1;
                if (var2_intLifetime1 > var3Lifetime1) {
                  var2_intLifetime1 = var3Lifetime1;
                  this.field_s = var6_ref_ml;
                }
              }
              var6_ref_ml = (BattleUnit) (pi.field_b.next(-18502));
            }
          } else {
            if (this.isAirborneOrHovering(32)) {
              this.field_s = this.field_L.getUnitByOwner(this.field_u, true);
              var2_intLifetime1 = 65536;
              pi.field_b.setDeque((byte) 99, this.field_L.field_i);
              var6_ref_ml = (BattleUnit) (pi.field_b.first(-47));
              while (var6_ref_ml != null) {
                if (~var6_ref_ml.field_u == ~this.field_u && (null == var6_ref_ml.field_s ||
                  var6_ref_ml.field_jb == 37)) {
                  var5_intLifetime1 = this.field_db - (this.field_Y / 2 + var6_ref_ml.field_db);
                  var4Lifetime1 = this.field_lb - var6_ref_ml.field_lb;
                  var3Lifetime1 = var4Lifetime1 * var4Lifetime1 + var5_intLifetime1 * var5_intLifetime1;
                  if (var2_intLifetime1 > var3Lifetime1) {
                    this.field_s = var6_ref_ml;
                    var2_intLifetime1 = var3Lifetime1;
                  }
                }
                var6_ref_ml = (BattleUnit) (pi.field_b.next(-18502));
              }
            }
          }
          if (35 == this.field_jb) {
            this.updateAuras(true, true);
          }
          this.updateSpecialAbility(param0 - 5390);
          this.field_lb = this.field_X >> 4;
          if (250 < this.field_ib) {
            this.field_ib = 250;
          }
          this.field_db = this.field_R >> 4;
          var2_intLifetime2 = this.field_lb;
          var3Lifetime2 = this.field_db;
          var4Lifetime2 = 0;
          if (this.field_z ||
            this.field_hb ||
            this.field_M != 0) {
            var4Lifetime2 = 1;
            this.field_L.a(this, 0);
          }
          if (null != this.field_s &&
            0 >= this.field_s.field_ib &&
            null != this.field_s.field_s) {
            this.field_s = this.field_s.field_s;
          }
          this.field_hb = false;
          var5 = this.field_L.getUnitByOwner(this.field_u, true);
          if (this.field_s != null && (var5 == null ||
            !(0 < var5.field_ib))) {
            this.field_ib = 0;
            if (var4Lifetime2 == 0) {
              this.field_L.a(this, 0);
            }
            this.updateTurnLogic(this.field_L.getCurrentPlayer(false), 90);
            return;
          }
          if (this.field_ib <= 0) {
            this.field_M = 0;
            if (var4Lifetime2 == 0) {
              this.field_L.a(this, param0 ^ -55);
            }
            this.updateTurnLogic(this.field_L.getCurrentPlayer(false), 72);
            return;
          }
          if (this.hasNoLinkedUnit(33) &&
            this.field_L.field_x[this.field_u] == 4) {
            while (!this.field_L.isSolidAt(this.field_L.field_o[this.field_u] + 2, this.field_L.field_Ab[this.field_u], (byte) -83)) {
              if (this.field_L.field_X[this.field_u] <= 0) {
                break;
              }
              if (0 >= (this.field_L.field_X[this.field_u] - 1) % 5 - (-1 + (-1 + this.field_L.field_X[this.field_u]) / 5)) {
                break;
              }
              this.field_L.field_o[this.field_u] = this.field_L.field_o[this.field_u] + 2;
              if (this.field_L.field_o[this.field_u] > this.field_L.field_H) {
                this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
                if (this.field_L.getCurrentPlayer(false) == this.field_u) {
                }
              }
              this.field_z = true;
            }
          }
          if (this.field_db < -this.field_L.field_H * 10) {
            this.field_eb = 0;
            this.field_kb = 0;
            this.field_X = this.field_lb << 4;
            this.field_db = 10 * -this.field_L.field_H;
            this.field_R = this.field_db << 4;
            this.field_L.field_u[this.getTeam(false)] = true;
          }
          if (this.field_jb != 22 &&
            this.field_jb != 4 &&
            this.field_jb != 5) {
            if ((this.field_L.field_x[this.field_u] == 3) && (!(this.field_L.field_X[this.field_u] <= 0)) && (this.field_lb >= 0 &&
              this.field_L.field_y >= this.field_lb &&
              this.field_eb >= 0 &&
              this.field_db > -33 + this.field_L.field_H && (this.field_ib > 5 ||
              this.field_q > 0))) {
              this.field_eb = 0;
              this.field_db = -33 + this.field_L.field_H;
              this.field_R = this.field_db << 4;
              this.field_L.stampShape(param0 ^ -57, -24 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f + (-33 + this.field_L.field_H));
              this.field_L.stampShape(-25, -8 + this.field_lb, gj.field_f[9], this.field_L.field_H - (33 + gj.field_f[9].field_f));
              this.field_L.stampShape(89, this.field_lb + 8, gj.field_f[9], -33 + (this.field_L.field_H - gj.field_f[9].field_f));
              if (this.field_jb != 22) {
                this.field_ib = this.field_ib - 5;
              }
            }
          } else {
            if (this.field_lb >= 0 &&
              this.field_L.field_y >= this.field_lb &&
              this.field_eb >= 0 &&
              this.field_db > -33 + this.field_L.field_H && (this.field_ib > 5 ||
              this.field_q > 0)) {
              this.field_eb = 0;
              this.field_db = -33 + this.field_L.field_H;
              this.field_R = this.field_db << 4;
              this.field_L.stampShape(param0 ^ -57, -24 + this.field_lb, gj.field_f[9], -gj.field_f[9].field_f + (-33 + this.field_L.field_H));
              this.field_L.stampShape(-25, -8 + this.field_lb, gj.field_f[9], this.field_L.field_H - (33 + gj.field_f[9].field_f));
              this.field_L.stampShape(89, this.field_lb + 8, gj.field_f[9], -33 + (this.field_L.field_H - gj.field_f[9].field_f));
              if (this.field_jb != 22) {
                this.field_ib = this.field_ib - 5;
              }
            }
          }
          if (this.field_db < this.field_L.field_H + 128 &&
            -640 - (this.field_Y >> 1) <= this.field_lb &&
            this.field_lb <= this.field_L.field_y + 640 + (this.field_Y >> 1)) {
            var6Lifetime1 = 0;
            if ((this.field_jb == 28 ||
              this.field_jb == 29 ||
              this.field_jb == 30 ||
              this.field_jb == 32 ||
              this.field_L.field_x[this.field_u] == 7 &&
              !(this.field_L.field_X[this.field_u] <= 0)) && (0 <= this.field_lb &&
              this.field_L.field_y >= this.field_lb)) {
              var6Lifetime1 = 1;
            }
            stackIn_162_0 = (this.field_db <= this.field_L.field_H - (32 - this.field_Y / 2)) ? 0 : 1;
            var7Lifetime1 = stackIn_162_0;
            if (this.isWithinArena(-1)) {
              stackIn_168_0 = var7Lifetime1;
              if (this.field_db < this.field_L.field_H) {
                stackIn_169_1 = 0;
              } else {
                stackIn_169_1 = 1;
              }
              var7Lifetime1 = stackIn_168_0 | stackIn_169_1;
            }
            if (var7Lifetime1 != 0 &&
              var6Lifetime1 == 0) {
              if (this.field_jb == 12) {
                if (var4Lifetime2 == 0) {
                  this.field_L.a(this, param0 ^ -55);
                }
                this.updateTurnLogic(this.field_L.getCurrentPlayer(false), 89);
                this.field_ib = 0;
                return;
              }
              this.field_db = this.field_db + 1;
              this.field_R = this.field_db << 4;
              this.field_M = 0;
              this.field_eb = this.field_eb + 1;
              this.field_z = true;
              var8 = -this.field_eb;
              if (var8 > this.field_Y >> 1) {
                var8 = this.field_Y >> 1;
              }
              if (var8 < -(this.field_Y >> 1)) {
                var8 = -(this.field_Y >> 1);
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
              this.field_jb == 12) {
              if (this.field_eb < 0) {
                this.field_eb = 0;
              }
              this.field_kb = 0;
            }
            if (param0 != -55) {
              this.initializeAppearance((byte) 40);
            }
            if (!this.field_z) {
              this.updateSupport(param0 + 44);
            } else {
              this.updateMovement((byte) -120);
            }
            if (this.field_ib <= 0 ||
              this.field_z ||
              this.field_hb ||
              var2_intLifetime2 != this.field_lb ||
              var3Lifetime2 != this.field_db ||
              var4Lifetime2 != 0) {
              var9 = this.field_lb;
              this.field_lb = var2_intLifetime2;
              var10 = this.field_db;
              this.field_db = var3Lifetime2;
              if (var4Lifetime2 == 0 && (this.field_jb != 12 ||
                this.field_ib > 0)) {
                this.field_L.a(this, param0 ^ -55);
              }
              this.field_lb = var9;
              this.field_db = var10;
              if (this.field_ib > 0) {
                this.field_L.stampUnitMask(-63, this);
                return;
              }
            }
            return;
          }
          this.updateStatusTimer(param0 ^ -32759);
          this.field_M = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.MA(" + param0 + ')');
        }
    }

    final void buildSprites(int param0, boolean param1) {
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
          var7 = this.field_u;
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
          if (null != this.field_L.field_N) {
            var3[0] = this.field_L.field_N[var7][0];
            var3[1] = this.field_L.field_N[var7][1];
            var3[2] = this.field_L.field_N[var7][2];
            var4[0] = this.field_L.field_N[var7][3];
            var4[1] = this.field_L.field_N[var7][4];
            var4[2] = this.field_L.field_N[var7][5];
            var5[0] = this.field_L.field_N[var7][6];
            var5[1] = this.field_L.field_N[var7][7];
            var5[2] = this.field_L.field_N[var7][8];
            var6[0] = this.field_L.field_N[var7][9];
            var6[1] = this.field_L.field_N[var7][10];
            var6[2] = this.field_L.field_N[var7][11];
          }
          if (param0 != 12) {
            return;
          }
          regionExit1: {
            var12 = this.field_jb;
            if (var12 == 40) {
              this.field_Y = 64;
              this.field_ib = 10;
              this.field_J = true;
              this.field_w = new Sprite(this.field_Y, this.field_Y);
              this.field_w.makeRasterTarget();
              SoftwareRasterizer.fillCircle(32, 32, 10, 16777215);
              SoftwareRasterizer.fillCircle(32, 63, 1, 16777215);
            } else {
              if (var12 == 12) {
                this.field_J = true;
                this.field_ib = 75;
                this.field_z = true;
                this.field_Y = 256;
                this.field_w = new Sprite(this.field_Y, this.field_Y);
                this.field_w.makeRasterTarget();
                SocketConnector.field_j[29].draw(0, 0);
                SoftwareRasterizer.fillRectangle(0, -2 + (SocketConnector.field_j[29].field_f + SocketConnector.field_j[29].field_c), this.field_Y, this.field_Y, 0);
              } else {
                if (var12 == 39) {
                  this.field_J = true;
                  this.field_Y = 100;
                  this.field_ib = 100;
                  this.field_w = new Sprite(this.field_Y, this.field_Y);
                  this.field_w.makeRasterTarget();
                  SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                } else {
                  if (var12 == 13) {
                    this.field_J = true;
                    this.field_ib = 200;
                    this.field_Y = 100;
                    this.field_w = new Sprite(this.field_Y, this.field_Y);
                    this.field_w.makeRasterTarget();
                    SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                  } else {
                    if (var12 != 15) {
                      if (var12 != 14) {
                        if (26 != var12) {
                          if (var12 != 17) {
                            if (27 == var12) {
                              this.field_Y = 64;
                              if (param1) {
                                this.field_ib = 250;
                              }
                              this.field_ab = 2;
                              if (param1) {
                                this.field_w = new Sprite(this.field_Y, this.field_Y);
                                this.field_w.makeRasterTarget();
                                SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                              }
                              var25 = new int[]{28, 0, 29, 33, 47, 50, var7, 0, 0};
                              var13_ref_qb____ = new Sprite[][]{SceneWidget.field_kb, IsaacRandom.field_j, DiskCacheRequest.field_u, qe.field_i, hn.field_d, CachedArchiveProvider.field_A, bo.field_a, ModalPanelStack.field_I, fn.field_b};
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
                                pc.drawTexturedSpriteIntGuard(var21, 16, var22, var23, -8, var24, var13_ref_qb____[0][var25[1]], 0);
                                pc.drawTexturedSpriteIntGuard(var21, 32, var22, var23, -96, var24, var13_ref_qb____[4][var25[5]], 0);
                                if (53 != var25[5] &&
                                  var25[5] != 55) {
                                  pc.drawTexturedSpriteIntGuard(var21, 32, var22, var23, 74, var24, var13_ref_qb____[6][var25[6]], 0);
                                }
                                pc.drawTexturedSpriteIntGuard(var21, 16, var22, var23, 25, var24, var13_ref_qb____[5][var25[4]], 0);
                                this.field_I = new Sprite(64, 96);
                                this.field_I.makeRasterTarget();
                                var20.drawCenteredRotatedScaledBilinear(32, 48, 0, 4096);
                                this.field_I.trimTransparentBorders();
                                var26 = new Sprite(64, 64);
                                var26.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var21, 0, var22, var23, 49, var24, var13_ref_qb____[1][var25[0]], 0);
                                this.field_bb = new Sprite(64, 64);
                                this.field_bb.makeRasterTarget();
                                var26.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_bb.trimTransparentBorders();
                                var27 = new Sprite(64, 64);
                                var27.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -104, var24, var13_ref_qb____[7][0], 0);
                                this.field_Q = new Sprite(64, 64);
                                this.field_Q.makeRasterTarget();
                                var27.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_Q.trimTransparentBorders();
                                var28 = new Sprite(64, 64);
                                var28.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -124, var24, var13_ref_qb____[8][0], 0);
                                this.field_cb = new Sprite(64, 64);
                                this.field_cb.makeRasterTarget();
                                var28.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_cb.trimTransparentBorders();
                                var29 = new Sprite(64, 64);
                                var29.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -112, var24, var13_ref_qb____[2][var25[2]], 0);
                                this.field_fb = new Sprite(64, 64);
                                this.field_fb.makeRasterTarget();
                                var29.drawCenteredRotatedScaledBilinear(32, 32, 0, 4096);
                                this.field_fb.trimTransparentBorders();
                                var30 = new Sprite(64, 64);
                                var30.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var21, 0, var22, var23, -79, var24, var13_ref_qb____[3][var25[3]], 0);
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
                                    var10 = this.field_ib;
                                    var11 = fb.field_a;
                                    this.field_ib = 10;
                                    this.field_Y = 24;
                                    if (11 == this.field_jb &&
                                      this.field_L.getUnitByOwner(this.field_u, true).field_jb == 27) {
                                      this.field_ib = 100;
                                    }
                                    if (4 == this.field_jb) {
                                      this.field_Y = 32;
                                      this.field_ib = 50;
                                      var11 = bj.field_ob;
                                    }
                                    if (5 == this.field_jb) {
                                      this.field_Y = 64;
                                      var11 = DiskCacheRequest.field_v;
                                      this.field_ib = 100;
                                    }
                                    if (1 == this.field_jb) {
                                      this.field_Y = 32;
                                      this.field_ib = 50;
                                      var11 = SceneTextInput.field_Jb;
                                    }
                                    if (this.field_jb == 33) {
                                      var11 = ArchiveIndex.field_n;
                                      this.field_Y = 32;
                                      this.field_ib = 40;
                                    }
                                    if (this.field_jb == 36) {
                                      this.field_ib = 25;
                                      this.field_Y = 32;
                                      var11 = LoginPanel.field_I;
                                      if (Js5Transport.isFeatureEnabled(0, (byte) -127)) {
                                        this.field_U = true;
                                        this.field_ib = 75;
                                      }
                                    }
                                    if (34 == this.field_jb) {
                                      var11 = field_v;
                                      this.field_ib = 25;
                                      this.field_Y = 32;
                                    }
                                    if (this.field_jb == 2) {
                                      this.field_Y = 64;
                                      this.field_ib = 100;
                                      var11 = i.field_g;
                                    }
                                    if (this.field_jb == 3) {
                                      this.field_Y = 64;
                                      var11 = SecondaryNodeDeque.field_c;
                                      this.field_ib = 75;
                                    }
                                    if (8 == this.field_jb) {
                                      this.field_Y = 48;
                                      this.field_ib = 50;
                                      var11 = pm.field_d;
                                      this.field_U = true;
                                    }
                                    if (this.field_jb == 7) {
                                      var11 = ra.field_j;
                                      this.field_Y = 64;
                                      this.field_ib = 100;
                                    }
                                    if (this.field_jb == 10) {
                                      this.field_ib = 25;
                                      var11 = oe.field_d;
                                      this.field_Y = 16;
                                    }
                                    if (9 == this.field_jb) {
                                      this.field_ib = 100;
                                      var11 = qj.field_d;
                                      this.field_Y = 64;
                                    }
                                    if (this.field_jb == 28) {
                                      this.field_Y = 24;
                                      var11 = g.field_f;
                                      this.field_ib = 40;
                                    }
                                    if (this.field_jb == 29) {
                                      var11 = c.field_a;
                                      this.field_Y = 48;
                                      this.field_ib = 100;
                                    }
                                    if (this.field_jb == 30) {
                                      var11 = vm.field_g;
                                      this.field_ib = 200;
                                      this.field_Y = 100;
                                    }
                                    if (this.field_jb == 31) {
                                      this.field_Y = 64;
                                      var11 = Js5NetworkRequest.field_w;
                                      this.field_ib = 100;
                                    }
                                    if (this.field_jb == 32) {
                                      this.field_ib = 250;
                                      this.field_Y = 128;
                                      var11 = nj.field_k;
                                    }
                                    if (this.field_jb == 37) {
                                      this.field_ib = 50;
                                      var11 = fe.field_h;
                                      this.field_Y = 32;
                                    }
                                    if (param1) {
                                      if (this.field_jb != 7 &&
                                        this.field_jb != 9) {
                                        this.field_w = new Sprite(this.field_Y, this.field_Y);
                                        this.field_w.makeRasterTarget();
                                        SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                                      } else {
                                        this.field_w = new Sprite(48, 48);
                                        this.field_w.makeRasterTarget();
                                        SoftwareRasterizer.fillCircle(24, 24, 24, 16777215);
                                      }
                                    }
                                    if (var11 == null) {
                                      this.field_J = false;
                                    } else {
                                      var39 = new Sprite(this.field_Y, 3 * this.field_Y / 2);
                                      var39.makeRasterTarget();
                                      if (this.field_jb != 11 &&
                                        this.field_jb != 8 &&
                                        6 != this.field_jb &&
                                        this.field_jb != 25 &&
                                        this.field_U) {
                                        pc.drawTexturedSpriteIntGuard(var5, this.field_Y / 2, var6, var3, -111, var4, var11[6].toRgbSprite(), 0);
                                      } else {
                                        pc.drawTexturedSpriteIntGuard(var5, this.field_Y / 2, var6, var3, -85, var4, var11[2].toRgbSprite(), 0);
                                      }
                                      this.field_I = var39.copy();
                                      var40 = new Sprite(this.field_Y, this.field_Y);
                                      var40.makeRasterTarget();
                                      pc.drawTexturedSpriteIntGuard(var5, 0, var6, var3, 70, var4, var11[3].toRgbSprite(), 0);
                                      this.field_bb = var40.copy();
                                      var41 = new Sprite(this.field_Y, this.field_Y);
                                      var41.makeRasterTarget();
                                      pc.drawTexturedSpriteIntGuard(var5, 0, var6, var3, 33, var4, var11[1].toRgbSprite(), 0);
                                      this.field_Q = var41.copy();
                                      var42 = new Sprite(this.field_Y, this.field_Y);
                                      var42.makeRasterTarget();
                                      pc.drawTexturedSpriteIntGuard(var5, 0, var6, var3, -127, var4, var11[4].toRgbSprite(), 0);
                                      this.field_cb = var42.copy();
                                      var43 = new Sprite(this.field_Y, this.field_Y);
                                      var43.makeRasterTarget();
                                      pc.drawTexturedSpriteIntGuard(var5, 0, var6, var3, -4, var4, var11[0].toRgbSprite(), 0);
                                      this.field_fb = var43.copy();
                                      var44 = new Sprite(this.field_Y, this.field_Y);
                                      var44.makeRasterTarget();
                                      pc.drawTexturedSpriteIntGuard(var5, 0, var6, var3, -86, var4, var11[5].toRgbSprite(), 0);
                                      this.field_B = var44.copy();
                                      this.field_J = true;
                                    }
                                    if (!(param1)) {
                                      this.field_ib = var10;
                                    }
                                    break regionExit1;
                                  }
                                  this.field_J = true;
                                  this.field_Y = 24;
                                  this.field_ib = 25;
                                  this.field_w = new Sprite(this.field_Y, this.field_Y);
                                  this.field_w.makeRasterTarget();
                                  SoftwareRasterizer.fillCircle(12, 12, 12, 16777215);
                                  this.field_p = this.field_ib;
                                  this.field_Y = this.field_w.field_n;
                                  this.initializeAppearance((byte) 6);
                                  break regionExit1;
                                }
                              }
                              if (param1) {
                                this.field_ib = 250;
                              }
                              this.field_Y = 32;
                              if (param1) {
                                this.field_w = new Sprite(this.field_Y, this.field_Y);
                                this.field_w.makeRasterTarget();
                                SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                              }
                              var8 = new int[]{var7, var7, var7, var7, var7, var7, var7, 0, 0};
                              if (this.field_L.field_N != null) {
                                var16 = 0;
                                var12 = var16;
                                while (var16 < 6) {
                                  var8[var16] = this.field_L.field_N[var7][var16 + 12];
                                  var16++;
                                }
                              }
                              var9 = new Sprite[][]{SceneWidget.field_kb, IsaacRandom.field_j, DiskCacheRequest.field_u, qe.field_i, hn.field_d, CachedArchiveProvider.field_A, bo.field_a, ModalPanelStack.field_I, fn.field_b};
                              if (SceneWidget.field_kb == null) {
                                this.field_J = false;
                              } else {
                                var31 = new Sprite(64, 96);
                                var31.makeRasterTarget();
                                if (this.field_jb != 16) {
                                  pc.drawTexturedSpriteIntGuard(var19, 16, var32, var17, 78, var18, var9[0][var8[1]], 0);
                                  pc.drawTexturedSpriteIntGuard(var19, 32, var32, var17, -91, var18, var9[4][var8[5]], 0);
                                  if (var8[5] != 53 &&
                                    var8[5] != 55) {
                                    pc.drawTexturedSpriteIntGuard(var19, 32, var32, var17, -90, var18, var9[6][var8[6]], 0);
                                  }
                                  pc.drawTexturedSpriteIntGuard(var19, 16, var32, var17, 13, var18, var9[5][var8[4]], 0);
                                } else {
                                  pc.drawTexturedSpriteIntGuard(var19, 16, var32, var17, 116, var18, tk.field_x[2], 0);
                                }
                                this.field_I = new Sprite(32, 48);
                                this.field_I.makeRasterTarget();
                                var31.drawCenteredRotatedScaledBilinear(16, 24, 0, 2048);
                                this.field_I.trimTransparentBorders();
                                var33 = new Sprite(64, 64);
                                var33.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 91, var18, var9[1][var8[0]], 0);
                                this.field_bb = new Sprite(32, 32);
                                this.field_bb.makeRasterTarget();
                                var33.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                this.field_bb.trimTransparentBorders();
                                var34 = new Sprite(64, 64);
                                var34.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 123, var18, var9[7][0], 0);
                                this.field_Q = new Sprite(32, 32);
                                this.field_Q.makeRasterTarget();
                                if (var8[0] != 46) {
                                  var34.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                }
                                this.field_Q.trimTransparentBorders();
                                var35 = new Sprite(64, 64);
                                var35.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var19, 0, var32, var17, -81, var18, var9[8][0], 0);
                                this.field_cb = new Sprite(32, 32);
                                this.field_cb.makeRasterTarget();
                                if (var8[0] != 46) {
                                  var35.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                }
                                this.field_cb.trimTransparentBorders();
                                var36 = new Sprite(64, 64);
                                var36.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 126, var18, var9[2][var8[2]], 0);
                                this.field_fb = new Sprite(32, 32);
                                this.field_fb.makeRasterTarget();
                                var36.drawCenteredRotatedScaledBilinear(16, 16, 0, 2048);
                                this.field_fb.trimTransparentBorders();
                                var37 = new Sprite(64, 64);
                                var37.makeRasterTarget();
                                pc.drawTexturedSpriteIntGuard(var19, 0, var32, var17, 14, var18, var9[3][var8[3]], 0);
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
                            this.field_Y = 80;
                            this.field_J = true;
                            this.field_ib = 100;
                            this.field_w = new Sprite(this.field_Y, this.field_Y);
                            this.field_w.makeRasterTarget();
                            SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                          }
                        } else {
                          this.field_Y = 100;
                          this.field_ib = 150;
                          this.field_J = true;
                          this.field_w = new Sprite(this.field_Y, this.field_Y);
                          this.field_w.makeRasterTarget();
                          SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                        }
                      } else {
                        this.field_ib = 150;
                        this.field_J = true;
                        this.field_Y = 100;
                        this.field_w = new Sprite(this.field_Y, this.field_Y);
                        this.field_w.makeRasterTarget();
                        SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                      }
                    } else {
                      this.field_J = true;
                      this.field_Y = 100;
                      this.field_ib = 150;
                      this.field_w = new Sprite(this.field_Y, this.field_Y);
                      this.field_w.makeRasterTarget();
                      SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
                    }
                  }
                }
              }
            }
          }
          if (param1) {
            this.field_p = this.field_ib;
            this.field_Y = this.field_w.field_n;
            this.initializeAppearance((byte) 6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3_ref), "ml.W(" + param0 + ',' + param1 + ')');
        }
    }

    final int getDisplayedHealth(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -20357) {
            this.field_u = 27;
          }
          if (this.field_jb == 27) {
            stackIn_6_0 = this.field_ib * 2;
            return stackIn_6_0;
          }
          stackIn_8_0 = this.field_ib;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.IA(" + param0 + ')');
        }
    }

    final void setMarkerValue(int param0, int param1) {
        try {
          this.field_M = param1;
          if (param0 != 0) {
            this.hasNoLinkedUnit(8);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ml.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean canBeSelected(int param0) {
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 84) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_q <= 0 && (0 == this.field_jb ||
            this.field_jb == 18 ||
            this.field_jb == 19 ||
            9 == this.field_jb ||
            16 == this.field_jb ||
            this.field_jb == 7 ||
            this.field_jb == 37)) {
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
          throw aa.wrapException((Throwable) ((Object) var2), "ml.TA(" + param0 + ')');
        }
    }

    final boolean isRemoving(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 118) {
            this.isMarkedForRemoval(false);
          }
          if (!this.field_z &&
            !this.field_hb) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.FB(" + param0 + ')');
        }
    }

    public static void h(boolean param0) {
        try {
          field_H = null;
          field_m = null;
          field_v = null;
          field_S = null;
          field_K = null;
          if (param0) {
            BattleUnit.setFonts((BitmapFont) null, 88, (byte) 54, (BitmapFont) null);
          }
          field_V = null;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ml.NA(" + param0 + ')');
        }
    }

    final int getSide(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_L.field_d) {
            stackIn_2_0 = this.field_u;
            return stackIn_2_0;
          }
          var2_int = -92 % ((param0 + 4) / 53);
          stackIn_4_0 = 1 & this.field_u;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.A(" + param0 + ')');
        }
    }

    final int getType(int param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -22625) {
            this.field_W = 1;
          }
          stackIn_3_0 = this.field_jb;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.LA(" + param0 + ')');
        }
    }

    final void updateTurnLogic(int param0, int param1) {
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
            this.field_L.field_x[this.field_u] == 4 &&
            this.field_L.field_X[this.field_u] > 0 &&
            0 < 1 + (-1 + this.field_L.field_X[this.field_u]) % 5 - (this.field_L.field_X[this.field_u] - 1) / 5) {
            this.field_ib = 20 * ((this.field_L.field_X[this.field_u] - 1) % 5 + 1 - (-1 + this.field_L.field_X[this.field_u]) / 5);
            this.field_x = 0;
            var8 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
            this.field_L.onProjectileFinished(52, var8);
            this.field_L.a(this, 0);
            this.field_lb = this.field_L.field_Ab[this.field_u];
            this.field_db = this.field_L.field_o[this.field_u];
            this.field_X = this.field_lb << 4;
            this.field_R = this.field_db << 4;
            var9 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
            this.field_L.onProjectileFinished(52, var9);
            while ((this.field_L.field_X[this.field_u] - 1) % 5 + (1 - (-1 + this.field_L.field_X[this.field_u]) / 5) > 0) {
              this.field_L.field_X[this.field_u] = this.field_L.field_X[this.field_u] + 5;
            }
            this.field_z = true;
            return;
          }
          if (this.field_jb != 27) {
          }
          if (this.hasNoLinkedUnit(109)) {
            if (null != this.field_L.field_Ib) {
              this.field_L.field_Ib.a(0, this.field_T);
              var4_ref_String = this.field_L.field_Ib.a((byte) 127, param0);
              this.field_L.field_Ib.a(0, 0, var4_ref_String, this.field_T);
              var5 = this.field_G;
              var6 = null;
              if (var5 >= 0 &&
                PasswordFieldPainter.field_w.length > var5) {
                var6 = PasswordFieldPainter.field_w[var5];
              }
              if (var6 == null) {
                var6 = "(unknown" + var5 + ")";
              }
              this.field_L.field_Ib.a(1, 0, (String) (var6), this.field_T);
            }
            if (this.field_T == param0) {
              this.field_L.field_U[param0] = this.field_L.field_U[param0] - 1;
            } else {
              this.field_L.field_U[param0] = this.field_L.field_U[param0] + 1;
            }
          }
          if (this.field_jb == 36 &&
            this.field_L.field_H > this.field_db) {
            this.field_L.field_b[param0] = this.field_L.field_b[param0] + 1;
          }
          this.playTypeSound((byte) 89, 1);
          this.field_L.a(this, 0);
          if (param1 < 4) {
            return;
          }
          regionExit1: {
            var4 = this.field_jb;
            if (var4 == 40) {
              var10 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 101, this.field_L, this.field_lb);
              this.field_L.onProjectileFinished(52, var10);
            } else {
              if (var4 != 0 &&
                var4 != 27) {
                switch (var4) {
                  case 3:
                    var12 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var12);
                    break regionExit1;
                  case 7:
                    var13 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var13);
                    break regionExit1;
                  case 1:
                    var14 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 89, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var14);
                    break regionExit1;
                  case 5:
                    var15 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var15);
                    break regionExit1;
                  case 2:
                    var16 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 89, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var16);
                    break regionExit1;
                  case 11:
                    var17 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var17);
                    break regionExit1;
                  case 9:
                    var18 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var18);
                    break regionExit1;
                  case 17:
                    if (this.field_U) {
                      var20 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                      this.field_L.onProjectileFinished(52, var20);
                      break regionExit1;
                    }
                    var19 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 108, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var19);
                    break regionExit1;
                  case 10:
                    var21 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var21);
                    break regionExit1;
                  case 6:
                    var22 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var22);
                    break regionExit1;
                  case 25:
                    var23 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var23);
                    break regionExit1;
                  case 4:
                    var24 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var24);
                    break regionExit1;
                  case 8:
                    var25 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var25);
                    break regionExit1;
                  case 13:
                    var26 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 85, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var26);
                    break regionExit1;
                  case 37:
                    var27 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var27);
                    break regionExit1;
                  case 39:
                    var28 = aj.spawnProjectile(this.field_s, -10 + (-(this.field_Y / 2) + this.field_db), false, 159, this.field_L, -10 + this.field_lb);
                    this.field_L.onProjectileFinished(52, var28);
                    var28.field_u = -20;
                    var28.field_F = -20;
                    var29 = aj.spawnProjectile(this.field_s, -(this.field_Y / 2) + this.field_db - 10, false, 159, this.field_L, this.field_lb + 10);
                    this.field_L.onProjectileFinished(52, var29);
                    var29.field_u = 20;
                    var29.field_F = -20;
                    var30 = aj.spawnProjectile(this.field_s, this.field_db - this.field_Y / 2 + 10, false, 159, this.field_L, this.field_lb + 10);
                    this.field_L.onProjectileFinished(52, var30);
                    var30.field_u = 20;
                    var30.field_F = 20;
                    var31 = aj.spawnProjectile(this.field_s, 10 + (this.field_db - this.field_Y / 2), false, 159, this.field_L, -10 + this.field_lb);
                    this.field_L.onProjectileFinished(52, var31);
                    var31.field_u = -20;
                    var31.field_F = 20;
                    var32 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var32);
                    break regionExit1;
                  case 15:
                    var33 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var33);
                    break regionExit1;
                  case 14:
                    var34 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var34);
                    break regionExit1;
                  case 26:
                    var35 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var35);
                    break regionExit1;
                  case 12:
                    this.field_L.carveTerrainAndSprite(this.field_db - 256, -60, this.field_lb - 128, SocketConnector.field_j[29].toRgbSprite());
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
                            var40 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb);
                            this.field_L.onProjectileFinished(52, var40);
                            break regionExit1;
                          case 34:
                            var38 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 146, this.field_L, this.field_lb);
                            this.field_L.onProjectileFinished(52, var38);
                            var38.field_y = 250;
                            break regionExit1;
                          default:
                            break regionExit1;
                          case 36:
                            var39 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 128, this.field_L, this.field_lb);
                            this.field_L.onProjectileFinished(52, var39);
                            break regionExit1;
                          case 32:
                            break;
                        }
                      }
                      var41 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb);
                      this.field_L.onProjectileFinished(52, var41);
                      break regionExit1;
                    }
                    var36 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 154, this.field_L, this.field_lb);
                    this.field_L.onProjectileFinished(52, var36);
                    break regionExit1;
                }
              }
              this.playSound(-30225, 53);
              var11 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
              this.field_L.onProjectileFinished(52, var11);
            }
          }
          this.unlink(true);
          this.unlinkSecondary((byte) 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "ml.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void playSampleAtVolume(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 > -35) {
            this.field_n = -119;
          }
          if (null != this.field_L.field_rb &&
            null != this.field_L.field_rb[param2]) {
            ii.playSample(param1, false, this.field_L.field_rb[param2], 100 * tm.field_a[param2] / param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var4), "ml.CB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean isAirborneOrHovering(int param0) {
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 32) {
            this.field_W = 61;
          }
          stackIn_8_0 = (this.isAirborne((byte) -107)) || (this.field_jb == 32);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.OA(" + param0 + ')');
        }
    }

    private final void castTypeSpell(int param0) {
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
            var3 = this.field_jb;
            if (var3 != 0 &&
              27 != var3) {
              switch (var3) {
                case 3:
                  var6 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var6);
                  break;
                case 7:
                  var7 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 103, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var7);
                  var8 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 103, this.field_L, this.field_lb - this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var8);
                  var9 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 103, this.field_L, this.field_lb + this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var9);
                  break;
                case 1:
                  var10 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 89, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var10);
                  break;
                case 5:
                  var11 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 94, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var11);
                  var12 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 94, this.field_L, this.field_lb - this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var12);
                  var13 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 94, this.field_L, this.field_Y / 2 + this.field_lb);
                  this.field_L.onProjectileFinished(52, var13);
                  break;
                case 2:
                  var14 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 89, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var14);
                  var15 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 89, this.field_L, -(this.field_Y / 2) + this.field_lb);
                  this.field_L.onProjectileFinished(52, var15);
                  var16 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 89, this.field_L, this.field_lb + this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var16);
                  break;
                case 11:
                  var17 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 101, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var17);
                  break;
                case 9:
                  var18 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 108, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var18);
                  var19 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 108, this.field_L, -(this.field_Y / 2) + this.field_lb);
                  this.field_L.onProjectileFinished(52, var19);
                  var20 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 108, this.field_L, this.field_lb + this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var20);
                  break;
                case 17:
                  var21 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var21);
                  break;
                case 10:
                  var22 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 108, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var22);
                  break;
                case 6:
                  var23 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var23);
                  break;
                case 25:
                  var24 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 99, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var24);
                  break;
                case 4:
                  var25 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 94, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var25);
                  break;
                case 8:
                  var26 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 103, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var26);
                  break;
                case 37:
                  var27 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var27);
                  break;
                case 39:
                  var28 = aj.spawnProjectile((BattleUnit) null, -this.field_Y + this.field_db, false, 163, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var28);
                  var29 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb - this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var29);
                  var30 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 163, this.field_L, this.field_lb + this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var30);
                  var31 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 163, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var31);
                  break;
                case 13:
                  var32 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 85, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var32);
                  var33 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 85, this.field_L, -(this.field_Y / 2) + this.field_lb);
                  this.field_L.onProjectileFinished(52, var33);
                  var34 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 85, this.field_L, this.field_Y / 2 + this.field_lb);
                  this.field_L.onProjectileFinished(52, var34);
                  var35 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 85, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var35);
                  break;
                case 15:
                  var36 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 94, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var36);
                  var37 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 94, this.field_L, this.field_lb - this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var37);
                  var38 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 94, this.field_L, this.field_Y / 2 + this.field_lb);
                  this.field_L.onProjectileFinished(52, var38);
                  var39 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 94, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var39);
                  break;
                case 14:
                  var40 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 99, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var40);
                  var41 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 99, this.field_L, this.field_lb - this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var41);
                  var42 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 99, this.field_L, this.field_lb + this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var42);
                  var43 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 99, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var43);
                  break;
                case 26:
                  var44 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 103, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var44);
                  break;
                case 12:
                  var45 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 108, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var45);
                  break;
                case 28:
                  var46 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var46);
                  break;
                case 32:
                  var47 = aj.spawnProjectile((BattleUnit) null, -this.field_Y + this.field_db, false, 130, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var47);
                  var48 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 130, this.field_L, this.field_lb - this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var48);
                  var49 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 130, this.field_L, this.field_lb + this.field_Y / 2);
                  this.field_L.onProjectileFinished(52, var49);
                  var50 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 130, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var50);
                  break;
                case 33:
                  var51 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 128, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var51);
                  break;
                default:
                  break;
                case 34:
                  var55 = aj.spawnProjectile((BattleUnit) null, -(this.field_Y / 2) + this.field_db, false, 131, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var55);
                  break;
                case 31:
                  var52 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y, false, 154, this.field_L, this.field_lb);
                  this.field_L.onProjectileFinished(52, var52);
                  var53 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 154, this.field_L, -(this.field_Y / 2) + this.field_lb);
                  this.field_L.onProjectileFinished(52, var53);
                  var54 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 154, this.field_L, this.field_Y / 2 + this.field_lb);
                  this.field_L.onProjectileFinished(52, var54);
                  break;
              }
            } else {
              var5 = aj.spawnProjectile((BattleUnit) null, this.field_db - this.field_Y / 2, false, 101, this.field_L, this.field_lb);
              this.field_L.onProjectileFinished(52, var5);
            }
          }
          var3 = -106 / ((param0 + 5) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.J(" + param0 + ')');
        }
    }

    final void recordDamage(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return;
          }
          if (param1 > 0 &&
            param1 > this.field_W) {
            this.field_W = param1;
            this.field_G = param2;
          }
          var4_int = 79 % ((53 - param0) / 56);
          if (this.field_jb == 32 ||
            this.field_jb == 27) {
            param1 = (param1 - 1) / 2 + 1;
          }
          this.field_x = this.field_x + param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ml.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void playSound(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -30225) {
            return;
          }
          if (this.field_L.field_rb != null &&
            null != this.field_L.field_rb[param1]) {
            DropdownList.playSampleAtVolume((byte) -30, tm.field_a[param1], this.field_L.field_rb[param1]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "ml.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void updateMovement(byte param0) {
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
          if ((this.field_jb == 28 ||
            this.field_jb == 29 ||
            this.field_jb == 30 ||
            32 == this.field_jb ||
            7 == this.field_L.field_x[this.field_u] &&
            !(this.field_L.field_X[this.field_u] <= 0)) && (this.field_lb >= 0 &&
            this.field_lb <= this.field_L.field_y)) {
            var5 = 1;
          }
          if (this.field_q <= 0 && (this.field_jb == 0 ||
            18 == this.field_jb ||
            this.field_jb == 19 ||
            this.field_jb == 9 ||
            16 == this.field_jb ||
            this.field_jb == 7 ||
            this.field_jb == 37)) {
            pi.field_b.setDeque((byte) 113, this.field_L.field_i);
            var6_ref_ml = (BattleUnit) (pi.field_b.first(-51));
            while (var6_ref_ml != null) {
              if (var6_ref_ml.field_s == this &&
                var6_ref_ml.isAirborneOrHovering(32)) {
                var4 = 1;
                this.field_L.a(var6_ref_ml, 0);
              }
              var6_ref_ml = (BattleUnit) (pi.field_b.next(-18502));
            }
          }
          this.field_hb = true;
          if (param0 != -120) {
            return;
          }
          var6 = this.field_X;
          if (this.field_P <= 0) {
            this.field_X = this.field_X + this.field_kb;
          }
          var7 = this.field_R;
          this.field_R = this.field_R + this.field_eb;
          if (var3 == 0) {
            this.field_eb = this.field_eb + 4;
          } else {
            this.field_F = this.field_F + 0.4;
            if (this.field_F > 6.28) {
              this.field_F = this.field_F - 6.28;
            }
            this.field_kb = this.field_kb * 15 >> 4;
            this.field_eb = this.field_eb * 15 >> 4;
            if (0 < this.field_kb) {
              this.field_kb = this.field_kb - 1;
            }
            if (0 < this.field_eb) {
              this.field_eb = this.field_eb - 1;
            }
            if (this.field_kb < 0) {
              this.field_kb = this.field_kb + 1;
            }
            if (this.field_eb < 0) {
              this.field_eb = this.field_eb + 1;
            }
            if (0 == Math.abs(this.field_kb) &&
              Math.abs(this.field_eb) == 0) {
              this.field_kb = 0;
              this.field_eb = 0;
              this.field_z = false;
            }
            if (this.field_Y << 4 > this.field_R) {
              this.field_L.field_G = 25;
              this.field_R = this.field_Y << 4;
            }
            if (this.field_X < this.field_Y << 3) {
              this.field_L.field_G = 25;
              this.field_X = this.field_Y << 3;
            }
            if (this.field_L.field_y - (this.field_Y >> 1) << 4 < this.field_X) {
              this.field_X = -(this.field_Y >> 1) + this.field_L.field_y << 4;
              this.field_L.field_G = 25;
            }
          }
          if (var2_int != 0 &&
            this.field_s.field_q <= 0) {
            this.field_L.a(this.field_s, 0);
            var8 = -this.field_lb + this.field_s.field_lb;
            var9_int = this.field_s.field_db - this.field_db - (-(this.field_Y / 2) + this.field_s.field_Y / 2);
            if (var9_int * var9_int + var8 * var8 < (this.field_s.field_Y + this.field_Y) * (this.field_s.field_Y + this.field_Y) >> 2) {
              if (this.field_s.field_x > 0) {
                stackIn_73_0 = this.field_s.field_U;
                if (this.field_U) {
                  stackIn_74_1 = 0;
                } else {
                  stackIn_74_1 = 1;
                }
                if ((stackIn_73_0 ? 1 : 0) != stackIn_74_1) {
                  var10 = this.field_s.field_x;
                  if (this.field_ib - this.field_x < var10) {
                    var10 = this.field_ib - this.field_x;
                  }
                  if (var10 < 0) {
                    var10 = 0;
                  }
                  if (0 < var10) {
                    this.field_L.field_cb[this.field_s.field_u] = this.field_L.field_cb[this.field_s.field_u] + var10;
                    this.field_x = this.field_x + var10;
                    this.field_s.field_x = this.field_s.field_x - var10;
                  }
                }
              }
              if (!this.field_s.field_z ||
                !(this.field_s.field_eb < 0)) {
                this.field_s.field_R = this.field_R - (this.field_Y << 3);
                this.field_s.field_X = this.field_X - this.field_E * (this.field_Y << 1);
                if (this.field_s.field_Y > 32) {
                  this.field_s.field_R = this.field_s.field_R + 192;
                  this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                }
                if (this.field_jb == 32) {
                  this.field_s.field_X = this.field_s.field_X + 448 * this.field_E;
                  this.field_s.field_R = this.field_s.field_R - 480;
                }
                this.field_lb = this.field_X >> 4;
                this.field_db = this.field_R >> 4;
                this.field_s.field_db = this.field_s.field_R >> 4;
                this.field_s.field_E = this.field_E;
                this.field_s.field_lb = this.field_s.field_X >> 4;
              }
            }
          }
          this.field_lb = this.field_X >> 4;
          this.field_db = this.field_R >> 4;
          if (this.field_P > 0) {
            this.field_P = this.field_P - 1;
          }
          if (this.field_P <= 0 &&
            this.field_L.spriteOverlapsTerrain(this.field_db - this.field_Y, 2, -(this.field_Y >> 1) + this.field_lb, this.field_w)) {
            var10Lifetime1 = this.field_kb;
            var11 = this.field_eb;
            var9_intLifetime1 = this.field_db - ce.field_k + (this.field_Y >> 1);
            var8Lifetime1 = this.field_lb - NodeHashTable.field_m;
            var12 = am.a(var9_intLifetime1, var8Lifetime1, false);
            if (var12 < 1) {
              var8Lifetime1 = 0;
              var9_intLifetime1 = -1;
              var12 = 1;
            }
            var13 = (var8Lifetime1 * (this.field_kb << 8) + (this.field_eb << 8) * var9_intLifetime1) / var12;
            this.field_X = var6;
            var14 = (-((this.field_eb << 8) * var8Lifetime1) + (this.field_kb << 8) * var9_intLifetime1) / var12;
            if (this.field_P <= 0) {
              this.field_R = var7;
            }
            this.field_db = this.field_R >> 4;
            this.field_lb = this.field_X >> 4;
            if (32768 >= var13 &&
              this.field_eb >= 0 &&
              Math.abs(var14) <= 8192) {
              var13 = 0;
              var14 = 0;
              this.playSound(-30225, 51);
              this.field_eb = 0;
              this.field_kb = 0;
            } else {
              var13 = -(var13 >> 2);
              var14 = var14 >> 2;
              if (var3 != 0) {
                var14 = 0;
                var13 = var13 << 1;
              }
              this.field_eb = (-(var8Lifetime1 * var14) + var13 * var9_intLifetime1) / var12 >> 8;
              this.field_kb = (var14 * var9_intLifetime1 + var13 * var8Lifetime1) / var12 >> 8;
            }
            this.field_A = this.field_A + 1;
            if (5 < this.field_A) {
              this.field_eb = 0;
              this.field_z = false;
              this.field_A = 0;
              this.field_kb = 0;
            }
            if (Math.abs(var14 >> 8) < 16 &&
              Math.abs(var13 >> 8) < 16) {
              this.field_A = 0;
              this.field_z = false;
            }
            if (0 > this.field_db - this.field_Y &&
              this.field_jb != 12 &&
              !this.isTower((byte) 109)) {
              this.field_kb = 2 * var10Lifetime1;
              if (this.field_kb > -5 &&
                this.field_kb < 5) {
                if (this.field_kb < 0) {
                  stackIn_132_1 = -5;
                } else {
                  stackIn_132_1 = 5;
                }
                this.field_kb = stackIn_132_1;
              }
              this.field_eb = -5 - Math.abs(var11);
              var15 = aj.spawnProjectile((BattleUnit) null, this.field_db, false, 101, this.field_L, this.field_lb);
              this.field_L.onProjectileFinished(52, var15);
              this.field_L.refreshTerrainArea(this.field_lb, this.field_Y * 2, (byte) 51, -(this.field_Y / 2) + this.field_db);
              this.field_z = true;
              if (this.field_x < this.field_ib) {
                this.field_x = this.field_x + 15;
              }
              this.field_L.field_G = 25;
            }
          } else {
            this.field_A = 0;
          }
          this.field_M = 0;
          if (-16 + this.field_L.field_H <= this.field_db &&
            var5 != 0) {
            this.field_db = -16 + this.field_L.field_H;
            this.field_A = 0;
            this.field_R = this.field_db << 4;
            this.field_z = false;
          }
          var8Lifetime2 = -this.field_eb;
          if (this.field_Y >> 1 < var8Lifetime2) {
            var8Lifetime2 = this.field_Y >> 1;
          }
          if (-(this.field_Y >> 1) > var8Lifetime2) {
            var8Lifetime2 = -(this.field_Y >> 1);
          }
          this.field_O = -(var8Lifetime2 >> 2);
          this.field_o = var8Lifetime2 >> 2;
          this.field_N = -(var8Lifetime2 >> 2);
          this.field_Z = var8Lifetime2 >> 2;
          if (var2_int != 0 &&
            0 < this.field_s.field_ib) {
            this.field_L.stampUnitMask(-41, this.field_s);
          }
          if (var4 != 0) {
            pi.field_b.setDeque((byte) 87, this.field_L.field_i);
            var9 = (BattleUnit) (pi.field_b.first(-109));
            while (var9 != null) {
              if (this == var9.field_s) {
                if (!var9.isAirborneOrHovering(32)) {
                  var9 = (BattleUnit) (pi.field_b.next(param0 ^ 18482));
                  continue;
                }
                if (var9.field_ib > 0) {
                  this.field_L.stampUnitMask(-45, var9);
                }
              }
              var9 = (BattleUnit) (pi.field_b.next(param0 ^ 18482));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.QA(" + param0 + ')');
        }
    }

    final BattleUnit copyForBattle(Battle param0, byte param1) {
        BattleUnit var4 = null;
        BattleUnit stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var4 = new BattleUnit(param0);
          var4.field_T = this.field_T;
          var4.field_U = this.field_U;
          var4.field_u = this.field_u;
          var4.field_jb = this.field_jb;
          var4.buildSprites(12, true);
          if (this.field_x != 0) {
            throw new IllegalStateException();
          }
          var4.field_q = this.field_q;
          var4.field_X = this.field_X;
          var4.field_R = this.field_R;
          var4.field_db = this.field_db;
          var4.field_lb = this.field_lb;
          var4.field_p = this.field_p;
          var4.field_ib = this.field_ib;
          var4.field_D = this.field_D;
          if (this.field_z) {
            throw new IllegalStateException();
          }
          if (0 != this.field_M) {
            throw new IllegalStateException();
          }
          var4.field_O = this.field_O;
          var4.field_N = this.field_N;
          var4.field_t = this.field_t;
          var4.field_E = this.field_E;
          var4.field_o = this.field_o;
          var4.field_P = this.field_P;
          var4.field_y = this.field_y;
          if (param1 != 59) {
            this.playSound(-34, 73);
          }
          var4.field_n = this.field_n;
          var4.field_F = this.field_F;
          var4.field_r = this.field_r;
          var4.field_A = this.field_A;
          var4.field_Z = this.field_Z;
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ml.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getOwnerId(int param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 17571) {
            this.field_D = true;
          }
          stackIn_3_0 = this.field_T;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.AA(" + param0 + ')');
        }
    }

    final int getX(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 95 / ((param0 + 11) / 35);
          stackIn_1_0 = this.field_lb;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.B(" + param0 + ')');
        }
    }

    final boolean getDisplayFlag(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_y = -31;
          }
          stackIn_3_0 = this.field_D;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.GB(" + param0 + ')');
        }
    }

    private final void updateBehaviour(int param0) {
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
          if ((this.field_jb == 28 ||
            29 == this.field_jb ||
            this.field_jb == 30 ||
            this.field_jb == 32 ||
            this.field_L.field_x[this.field_u] == 7 &&
            !(this.field_L.field_X[this.field_u] <= 0)) && (0 <= this.field_lb &&
            this.field_lb <= this.field_L.field_y)) {
            var5 = 1;
          }
          if (var3 == 0 &&
            !this.field_L.spriteHitsTerrain(61, this.field_w, -this.field_Y + this.field_db + 1, -(this.field_Y >> 1) + this.field_lb, this.field_db - this.field_Y) && (var5 == 0 ||
            !(this.field_db >= -16 + this.field_L.field_H))) {
            this.field_P = 0;
            this.field_eb = 0;
            this.field_kb = 0;
            this.field_z = true;
          }
          if (-16 + this.field_L.field_H <= this.field_db &&
            var5 != 0) {
            this.field_db = -16 + this.field_L.field_H;
            this.field_A = 0;
            this.field_R = this.field_db << 4;
            this.field_z = false;
          }
          if (this.applyPendingDamage(true)) {
            return;
          }
          if (this.field_z) {
            this.field_M = 0;
          }
          stackIn_35_0 = (this.field_M != 0) ? 0 : 1;
          var6 = stackIn_35_0;
          if (this.field_M == 0) {
            if (this.field_jb == 40) {
              this.field_F = this.field_F + 0.1;
              if (6.283185307179586 < this.field_F) {
                this.field_F = this.field_F - 6.283185307179586;
              }
            } else {
              if (this.field_ab == 3 &&
                this.field_jb == 0) {
                this.field_F = this.field_F * 0.9;
              } else {
                this.field_F = 0.0;
              }
            }
          }
          if (var2_int != 0) {
            if (this.field_M == 2 ||
              this.field_M == 3 ||
              this.field_q <= 0) {
              this.field_db = this.field_db - this.field_Y / 2;
              this.field_jb = 0;
              this.field_R = this.field_db << 4;
              this.field_z = true;
              this.field_q = 0;
              this.field_Y = 32;
              this.field_w = new Sprite(this.field_Y, this.field_Y);
              this.field_w.makeRasterTarget();
              SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
            }
            if (this.field_jb != 38) {
              this.field_M = 0;
            }
          }
          if (this.field_M == -1 ||
            1 == this.field_M) {
            this.field_E = this.field_M;
            this.field_db = this.field_R >> 4;
            this.field_lb = this.field_X >> 4;
            var7 = this.field_M + this.field_lb;
            var8 = this.field_db;
            for (var9 = 0; 8 > var9; var9++) {
              if (this.field_L.spriteOverlapsTerrain(-this.field_Y + var8, 2, -(this.field_Y >> 1) + var7, this.field_w)) {
                var8--;
              } else {
                var8++;
              }
            }
            if (this.field_L.spriteOverlapsTerrain(this.field_db - this.field_Y, 2, this.field_lb - (this.field_Y >> 1), this.field_w)) {
              var8--;
            }
            this.field_kb = 0;
            this.field_eb = 0;
            if (var5 != 0 &&
              -16 + this.field_L.field_H <= this.field_db &&
              this.field_db < var8) {
              var8 = this.field_db;
            }
            if (-this.field_Y + var8 < 0) {
              var8 = -100;
              this.field_L.field_G = 25;
            }
            boolean decompiledFrameRemainder0 = true;
            if (Math.abs(-this.field_db + var8) >= 5) {
              if (var8 > this.field_db &&
                this.field_jb != 38) {
                this.field_kb = 16 * this.field_M;
                this.field_z = true;
                this.field_eb = -16;
                if (((this.field_jb == 36)) && ((!(this.field_U) ||
                  Js5Transport.isFeatureEnabled(0, (byte) -61)))) {
                  this.field_kb = 0;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (this.field_db < var8 &&
                  38 == this.field_jb) {
                  this.field_lb = var7;
                  this.field_F = this.field_F + 0.4;
                  if (90 < this.field_Y ||
                    31 == this.field_jb) {
                    this.field_F = this.field_F - 0.3;
                  }
                }
              }
            } else {
              if (var7 != this.field_lb &&
                this.field_s == null) {
                this.field_L.field_Ob[this.field_T] = this.field_L.field_Ob[this.field_T] + 1;
              }
              this.field_lb = var7;
              if (this.field_ab == 3 &&
                this.field_jb == 0) {
                this.field_F = this.field_F + 0.1;
              } else {
                this.field_F = this.field_F + 0.4;
              }
              this.field_db = var8;
              if (this.field_Y > 90 ||
                this.field_jb == 31) {
                this.field_F = this.field_F - 0.3;
              }
            }
            this.field_X = this.field_lb << 4;
            this.field_R = this.field_db << 4;
            this.field_M = 0;
            if (var4 != 0 &&
              !(this.field_s.field_q > 0)) {
              this.field_L.a(this.field_s, 0);
              var9Lifetime3 = -this.field_lb + this.field_s.field_lb;
              var10 = this.field_Y / 2 + (-this.field_db + (this.field_s.field_db - this.field_s.field_Y / 2));
              if ((!this.field_s.field_z ||
                !(0 > this.field_s.field_eb)) && !((this.field_s.field_Y + this.field_Y) * (this.field_s.field_Y + this.field_Y) >> 2 <= var9Lifetime3 * var9Lifetime3 + var10 * var10)) {
                this.field_s.field_X = -(this.field_E * (this.field_Y << 1)) + this.field_X;
                this.field_s.field_R = -(this.field_Y << 3) + this.field_R;
                if (32 < this.field_s.field_Y) {
                  this.field_s.field_R = this.field_s.field_R + 192;
                  this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                }
                if (this.field_jb == 32) {
                  this.field_s.field_R = this.field_s.field_R - 480;
                  this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                }
                this.field_lb = this.field_X >> 4;
                this.field_db = this.field_R >> 4;
                this.field_s.field_E = this.field_E;
                this.field_s.field_db = this.field_s.field_R >> 4;
                this.field_s.field_lb = this.field_s.field_X >> 4;
              }
            }
          }
          if (2 == this.field_M) {
            if (null == this.field_s) {
              this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
            }
            this.field_kb = this.field_E * 64;
            this.field_eb = -96;
            if (this.field_jb == 4) {
              this.field_eb = -128;
              this.field_kb = 96 * this.field_E;
            }
            if (5 == this.field_jb ||
              this.field_jb == 31) {
              this.field_eb = -64;
            }
            if (this.field_jb == 1) {
              this.field_kb = 96 * this.field_E;
              this.field_eb = -32;
            }
            if (this.field_jb == 2 ||
              32 == this.field_jb) {
              this.field_eb = -32;
            }
            if (7 == this.field_jb ||
              this.field_jb == 9) {
              this.field_eb = -32;
            }
            if (var3 != 0) {
              this.field_eb = -64;
            }
            if (this.field_L.field_x[this.field_u] == 3) {
              var7Lifetime1 = this.field_L.field_X[this.field_u] / 20;
              this.field_kb = this.field_kb + 8 * (var7Lifetime1 * this.field_E);
              this.field_eb = this.field_eb - 8 * var7Lifetime1;
              if (96 < this.field_kb * this.field_E) {
                this.field_kb = this.field_E * 96;
              }
              if (this.field_eb < -128) {
                this.field_eb = -128;
              }
            }
            if (36 == this.field_jb && (!this.field_U ||
              Js5Transport.isFeatureEnabled(0, (byte) -88))) {
              this.field_kb = 0;
              this.field_eb = -32;
            }
            this.field_M = 0;
            this.field_z = true;
            this.field_P = 0;
            this.playSound(-30225, 49);
          }
          if (this.field_M == 3) {
            if (this.field_s == null) {
              this.field_L.field_c[this.field_T] = this.field_L.field_c[this.field_T] + 1;
            }
            this.field_kb = this.field_E * 16;
            this.field_eb = -128;
            if (4 == this.field_jb) {
              this.field_eb = -148;
            }
            if (this.field_jb == 5 ||
              this.field_jb == 31) {
              this.field_eb = -96;
            }
            if (this.field_jb == 1) {
              this.field_eb = -64;
            }
            if (2 == this.field_jb) {
              this.field_eb = -48;
            }
            if (this.field_jb == 7 ||
              this.field_jb == 9) {
              this.field_eb = -64;
            }
            if (var3 != 0) {
              this.field_kb = 32 * this.field_E;
              this.field_eb = -128;
            }
            if (this.field_L.field_x[this.field_u] == 3) {
              var7Lifetime2 = this.field_L.field_X[this.field_u] / 20;
              this.field_eb = this.field_eb - 8 * var7Lifetime2;
              this.field_kb = this.field_kb + this.field_E * var7Lifetime2 * 4;
              if (this.field_kb * this.field_E > 32) {
                this.field_kb = this.field_E * 32;
              }
              if (-196 > this.field_eb) {
                this.field_eb = -196;
              }
            }
            if (this.field_jb == 36 && (!this.field_U ||
              Js5Transport.isFeatureEnabled(0, (byte) -23))) {
              this.field_eb = -32;
              this.field_kb = 0;
            }
            this.field_M = 0;
            this.field_z = true;
            this.field_P = 0;
            this.playSound(-30225, 50);
          }
          var7Lifetime3 = 117 % ((param0 + 64) / 59);
          this.field_M = 0;
          if (this.field_F > 6.28) {
            this.field_F = this.field_F - 6.28;
            this.playSound(-30225, 48);
          }
          if (0.0 > this.field_F) {
            this.field_F = this.field_F + 6.28;
          }
          var8Lifetime1 = (int)(Math.cos(this.field_F) * (double)(this.field_Y >> 2));
          var9Lifetime1 = (int)(Math.sin(this.field_F) * (double)(this.field_Y >> 2));
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
            if (!this.field_s.canBeSelected(92)) {
              return;
            }
            var8Lifetime2 = -this.field_lb + this.field_s.field_lb;
            var9Lifetime2 = -this.field_db + this.field_s.field_db;
            if (this.field_s.field_z &&
              this.field_s.field_eb >= 0) {
              if ((this.field_Y + this.field_s.field_Y) * (this.field_Y + this.field_s.field_Y) >> 2 <= var8Lifetime2 * var8Lifetime2 + var9Lifetime2 * var9Lifetime2) {
                return;
              }
              this.field_L.a(this.field_s, 0);
              this.field_s.field_z = false;
              this.field_s.field_R = this.field_R - (this.field_Y << 3);
              this.field_s.field_eb = 0;
              this.field_s.field_X = -(this.field_E * (this.field_Y << 1)) + this.field_X;
              this.field_s.field_kb = 0;
              if (this.field_s.field_Y > 32) {
                this.field_s.field_R = this.field_s.field_R + 192;
                this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
              }
              if (32 == this.field_jb) {
                this.field_s.field_R = this.field_s.field_R - 480;
                this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
              }
              this.field_lb = this.field_X >> 4;
              this.field_db = this.field_R >> 4;
              this.field_s.field_lb = this.field_s.field_X >> 4;
              this.field_s.field_E = this.field_E;
              this.field_s.field_db = this.field_s.field_R >> 4;
              if (0 < this.field_s.field_ib) {
                this.field_L.stampUnitMask(-124, this.field_s);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.VA(" + param0 + ')');
        }
    }

    private final void updateAnimation(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2_int = this.isAirborne((byte) -107) ? 1 : 0;
          this.field_F = this.field_F + 0.1;
          if (this.field_F > 6.28) {
            this.field_F = this.field_F - 6.28;
          }
          if (this.applyPendingDamage(param0)) {
            return;
          }
          if (this.field_z) {
            this.field_M = 0;
          }
          if (this.field_M == -1 &&
            this.field_X > this.field_L.field_y << 4) {
            this.field_M = 0;
          }
          if (this.field_M == 1 &&
            0 > this.field_X) {
            this.field_M = 0;
          }
          if (1 == this.field_M ||
            -1 == this.field_M) {
            if (this.field_M == this.field_E) {
              this.field_E = this.field_M;
              this.field_kb = this.field_E * 96;
              this.field_z = true;
              this.field_M = 0;
            } else {
              this.field_E = this.field_M;
              this.field_M = 0;
              this.field_z = true;
              this.field_kb = 32 * this.field_E;
            }
          }
          if (this.field_M == 2) {
            this.field_kb = 32 * this.field_E;
            this.field_eb = 96;
            this.field_M = 0;
            this.field_z = true;
          }
          if (this.field_M == 3) {
            this.field_kb = this.field_E * 32;
            this.field_M = 0;
            this.field_eb = -96;
            this.field_z = true;
          }
          this.field_M = 0;
          if (var2_int != 0 &&
            this.field_s.canBeSelected(101)) {
            var3 = this.field_s.field_lb - this.field_lb;
            var4 = this.field_s.field_db - this.field_db;
            if (this.field_s.field_z &&
              this.field_s.field_eb >= 0 &&
              var4 * var4 + var3 * var3 < (this.field_Y + this.field_s.field_Y) * (this.field_s.field_Y + this.field_Y) >> 2) {
              this.field_L.a(this.field_s, 0);
              this.field_s.field_z = false;
              this.field_s.field_kb = 0;
              this.field_s.field_eb = 0;
              this.field_s.field_X = -((this.field_Y << 1) * this.field_E) + this.field_X;
              this.field_s.field_R = -(this.field_Y << 3) + this.field_R;
              if (this.field_s.field_Y > 32) {
                this.field_s.field_X = this.field_s.field_X + 0 * this.field_E;
                this.field_s.field_R = this.field_s.field_R + 192;
              }
              if (32 == this.field_jb) {
                this.field_s.field_X = this.field_s.field_X + this.field_E * 448;
                this.field_s.field_R = this.field_s.field_R - 480;
              }
              this.field_lb = this.field_X >> 4;
              this.field_db = this.field_R >> 4;
              this.field_s.field_lb = this.field_s.field_X >> 4;
              this.field_s.field_db = this.field_s.field_R >> 4;
              this.field_s.field_E = this.field_E;
              if (this.field_s.field_ib <= 0) {
                return;
              }
              this.field_L.stampUnitMask(-55, this.field_s);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.UA(" + param0 + ')');
        }
    }

    final boolean isMarkedForRemoval(boolean param0) {
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.field_B = (Sprite) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.isLinked((byte) -82) && (this.field_z ||
            this.field_hb ||
            this.field_x != 0 ||
            this.field_ib <= 0)) {
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
          throw aa.wrapException((Throwable) ((Object) var2), "ml.JB(" + param0 + ')');
        }
    }

    final static void applyMusicVolume(boolean param0, int param1) {
        try {
          if (param1 >= -100) {
            BattleUnit.setFonts((BitmapFont) null, -106, (byte) 51, (BitmapFont) null);
          }
          EmptyPainter.a(param0, -105);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ml.V(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isFlyingType(int param0) {
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -26) {
            this.playSound(28, -45);
          }
          stackIn_11_0 = (13 == this.field_jb) || (this.field_jb == 15) || (this.field_jb == 14) || (this.field_jb == 26) || (39 == this.field_jb);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.T(" + param0 + ')');
        }
    }

    final void playTypeSound(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (3 == this.field_jb) {
            this.playSound(-30225, dm.field_G[param1]);
          }
          if (this.field_jb == 7) {
            this.playSound(-30225, hi.field_f[param1]);
          }
          if (this.field_jb == 1) {
            this.playSound(-30225, fb.field_b[param1]);
          }
          if (9 == this.field_jb) {
            this.playSound(-30225, ed.field_Ib[param1]);
          }
          if (2 == this.field_jb) {
            this.playSound(-30225, PasswordFieldPainter.field_B[param1]);
          }
          if (this.field_jb == 4) {
            this.playSound(-30225, SceneScrollbar.field_Fb[param1]);
          }
          if (this.field_jb == 8) {
            this.playSound(-30225, IndexedSpriteState.field_i[param1]);
          }
          if (this.field_jb == 11) {
            this.playSound(-30225, NanoFrameClock.field_g[param1]);
          }
          if (this.field_jb == 5) {
            this.playSound(-30225, mb.field_U[param1]);
          }
          if (this.field_jb == 14) {
            this.playSound(-30225, NanoFrameClock.field_n[param1]);
          }
          if (this.field_jb == 15) {
            this.playSound(-30225, LoadingProgressDialog.field_pb[param1]);
          }
          if (this.field_jb == 17) {
            this.playSound(-30225, cj.field_a[param1]);
          }
          if (this.field_jb == 6) {
            this.playSound(-30225, vg.field_c[param1]);
          }
          if (this.field_jb == 13) {
            this.playSound(-30225, fi.field_c[param1]);
          }
          if (this.field_jb == 10) {
            this.playSound(-30225, gg.field_j[param1]);
          }
          if (this.field_jb == 37) {
            this.playSound(-30225, om.field_B[param1]);
          }
          if (this.field_jb == 39) {
            this.playSound(-30225, u.field_h[param1]);
          }
          if (this.field_jb == 33) {
            this.playSound(-30225, fk.field_h[param1]);
          }
          if (this.field_jb == 31) {
            this.playSound(-30225, jn.field_a[param1]);
          }
          if (this.field_jb == 32) {
            this.playSound(-30225, fd.field_h[param1]);
          }
          if (this.field_jb == 28) {
            this.playSampleAtVolume((byte) -49, 200, IconButtonPainter.field_p[param1]);
          }
          if (this.field_jb == 29) {
            this.playSampleAtVolume((byte) -72, 100, IconButtonPainter.field_p[param1]);
          }
          if (this.field_jb == 30) {
            this.playSampleAtVolume((byte) -91, 50, IconButtonPainter.field_p[param1]);
          }
          if (this.field_jb == 34) {
            this.playSound(-30225, cf.field_a[param1]);
          }
          if (25 == this.field_jb) {
            this.playSound(-30225, ScreenDisplayMode.field_c[param1]);
          }
          var3_int = -17 / ((param0 - 25) / 36);
          if (this.field_s != null) {
          }
          if (this.field_jb != 26) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "ml.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void updateBrowserLinks(int param0, java.applet.Applet param1) {
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
              var4 = param1.getCodeBase();
              if (param0 >= -59) {
                return;
              }
              var3 = nm.appendSessionParameters(param1, var4, -31843).getFile();
              ei.a("updatelinks", param1, (byte) 114, new Object[]{"home", var3 + "home.ws"});
              ei.a("updatelinks", param1, (byte) 114, new Object[]{"gamelist", var3 + "togamelist.ws"});
              ei.a("updatelinks", param1, (byte) 114, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              ei.a("updatelinks", param1, (byte) 114, new Object[]{"options", var3 + "options.ws"});
              ei.a("updatelinks", param1, (byte) 114, new Object[]{"terms", var3 + "terms.ws"});
              ei.a("updatelinks", param1, (byte) 114, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var2_ref;
            stackIn_9_1 = new StringBuilder().append("ml.KA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void updateStatusTimer(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = this.field_L.getCurrentPlayer(false);
          if (this.field_q > 0) {
            this.field_q = this.field_q - this.field_x;
            if (this.field_q <= 0 ||
              22 == this.field_jb ||
              23 == this.field_jb ||
              this.field_jb == 21 ||
              24 == this.field_jb ||
              35 == this.field_jb ||
              this.field_jb == 38) {
              if (this.field_q > 0) {
                this.field_x = 0;
              } else {
                this.field_x = -this.field_q;
              }
              this.field_db = this.field_db - this.field_Y / 2;
              this.field_Y = 32;
              this.field_jb = 0;
              this.field_R = this.field_db << 4;
              this.field_q = 0;
              this.field_z = true;
              this.field_w = new Sprite(this.field_Y, this.field_Y);
              this.field_w.makeRasterTarget();
              SoftwareRasterizer.fillCircle(this.field_Y >> 1, this.field_Y >> 1, this.field_Y >> 1, 16777215);
            }
          }
          if (this.hasNoLinkedUnit(107) &&
            -this.field_x + this.field_ib > 1) {
            if (256 + this.field_L.field_H > this.field_db) {
              this.playSound(-30225, 54);
              this.field_L.field_Eb[this.field_T] = this.field_L.field_Eb[this.field_T] + 1;
              if (this.field_T == var2_int) {
                this.field_L.field_D = false;
              }
            }
            this.field_db = 256 + this.field_L.field_H;
            this.field_z = false;
            this.field_R = this.field_db << 4;
            if (param0 != 32704) {
              return;
            }
            this.field_q = 0;
            if (0 < this.field_x) {
              if (this.field_jb == 19) {
                this.field_z = true;
                this.field_jb = 0;
              }
              this.playTypeSound((byte) -76, 2);
              this.field_ib = this.field_ib - this.field_x;
              if (this.field_ib <= 0) {
                this.updateTurnLogic(var2_int, 68);
                if (!this.hasNoLinkedUnit(77)) {
                }
                return;
              }
            }
            if (0 > this.field_x) {
              this.heal(-this.field_x, -28922);
            }
            this.field_x = 0;
            return;
          }
          this.playSound(-30225, 54);
          this.updateTurnLogic(var2_int, 70);
          if (this.hasNoLinkedUnit(49)) {
            this.field_L.field_Eb[this.field_T] = this.field_L.field_Eb[this.field_T] + 1;
          }
          this.field_ib = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.HB(" + param0 + ')');
        }
    }

    private final boolean isUnobstructed(int param0) {
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
          if (!this.canBeSelected(param0 ^ -10366)) {
            return false;
          }
          if (param0 != -10265) {
            discarded$0 = this.canBeSelected(87);
          }
          pi.field_b.setDeque((byte) 125, this.field_L.field_i);
          var2_int = 0;
          var3 = (BattleUnit) (pi.field_b.first(param0 + 10161));
          while (var3 != null) {
            if (this == var3.field_s &&
              var3.isAirborneOrHovering(32)) {
              var4 = var3.field_lb - this.field_lb;
              var5 = var3.field_db + (-this.field_db - var3.field_Y / 2) + this.field_Y / 2;
              if ((this.field_Y + var3.field_Y) * (var3.field_Y + this.field_Y) >> 2 > var5 * var5 + var4 * var4) {
                if (1 == this.field_M ||
                  this.field_M == -1) {
                  this.field_E = this.field_M;
                  this.field_M = 0;
                  this.field_R = var3.field_R - (var3.field_Y << 3);
                  this.field_X = -((var3.field_Y << 1) * var3.field_E) + var3.field_X;
                  if (this.field_Y > 32) {
                    this.field_X = this.field_X + 0 * var3.field_E;
                    this.field_R = this.field_R + 192;
                  }
                  if (32 == var3.field_jb) {
                    this.field_X = this.field_X + 448 * var3.field_E;
                    this.field_R = this.field_R - 480;
                  }
                  this.field_lb = this.field_X >> 4;
                  this.field_db = this.field_R >> 4;
                }
                var2_int = 1;
              }
            }
            var3 = (BattleUnit) (pi.field_b.next(-18502));
          }
          stackIn_27_0 = var2_int;
          return stackIn_27_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.F(" + param0 + ')');
        }
    }

    final void drawSelectionHighlight(int param0, int param1, int param2) {
        int var4_int = 0;
        BattleUnit var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_jb != 12 &&
            40 != this.field_jb) {
            if (param0 != 2) {
              this.field_P = -86;
            }
            var4_int = nj.field_n[this.field_u];
            var5 = this.field_L.getUnitByOwner(this.field_u, true);
            if (var5 != null &&
              var5.field_jb == 27) {
              var4_int = 13417437;
            }
            var6 = 8421504 ^ (var4_int | 8421504);
            if (this.field_q > 0) {
              this.field_w.drawSilhouette(this.field_lb - (this.field_Y >> 1) - (1 - param2), -this.field_Y + this.field_db + param1, var6);
              this.field_w.drawSilhouette(param2 + (1 + this.field_lb) - (this.field_Y >> 1), param1 + this.field_db - this.field_Y, var6);
              this.field_w.drawSilhouette(param2 + (this.field_lb - (this.field_Y >> 1)), -1 - this.field_Y + this.field_db + param1, var6);
              this.field_w.drawSilhouette(param2 + (-(this.field_Y >> 1) + this.field_lb), param1 + (1 - this.field_Y + this.field_db), var6);
              this.field_w.drawSilhouette(param2 + (this.field_lb - (this.field_Y >> 1)), param1 + (this.field_db - this.field_Y), var4_int);
            } else {
              var7 = this.field_Y;
              if (7 == this.field_jb ||
                this.field_jb == 9) {
                var7 = 48;
              }
              var8 = param2 + this.field_lb;
              var9 = param1 + this.field_db - (var7 >> 1);
              SoftwareRasterizer.fillCircleAlpha(var8, var9, var7 >> 1, var4_int, 128);
              gn.a(var7 >> 1, (byte) 125, 128, var8, var9);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var4), "ml.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void setHealth(byte param0, int param1) {
        try {
          this.field_ib = param1;
          if (param0 > -79) {
            this.getOwnerId(111);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ml.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private BattleUnit(Battle param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.field_gb = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
          this.field_L = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ml.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void setFonts(BitmapFont param0, int param1, byte param2, BitmapFont param3) {
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
          if (param2 < 76) {
            return;
          }
          ko.field_j = param0;
          td.a(true, SoftwareRasterizer.field_j / 2, SoftwareRasterizer.field_e / 2);
          LoginPanel.b(1, param3.field_o, param0.field_m + param0.field_o, param0.field_o, param3.field_m + param3.field_o);
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
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void heal(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_ib = this.field_ib + param0;
          if (250 < this.field_ib) {
            this.field_ib = 250;
          }
          if (param1 != -28922) {
            this.playTypeSound((byte) 113, -24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "ml.FA(" + param0 + ',' + param1 + ')');
        }
    }

    BattleUnit(int param0, int param1, int param2, int param3, Battle param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_N = 0;
        this.field_r = -4;
        this.field_gb = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
          this.field_lb = param1;
          this.field_db = param2;
          this.field_L = param4;
          this.field_T = param3;
          this.field_E = 1;
          this.field_R = this.field_db << 4;
          this.field_jb = param0;
          this.field_u = param5;
          this.field_X = this.field_lb << 4;
          this.field_s = null;
          this.buildSprites(12, true);
          this.castTypeSpell(115);
          this.field_L.stampUnitMask(-93, this);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    final int getY(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -107 % ((param0 - 58) / 41);
          stackIn_1_0 = this.field_db;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var2), "ml.E(" + param0 + ')');
        }
    }

    BattleUnit(int param0, int param1, int param2, int param3, Battle param4, BattleUnit param5) {
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
        this.field_gb = null;
        this.field_O = 0;
        this.field_y = 0;
        this.field_ab = -1;
        this.field_t = 0;
        this.field_n = 0;
        this.field_J = false;
        this.field_Z = 0;
        try {
          this.field_db = param2;
          this.field_lb = param1;
          this.field_X = this.field_lb << 4;
          this.field_s = param5;
          this.field_L = param4;
          this.field_E = 1;
          this.field_T = param3;
          this.field_R = this.field_db << 4;
          this.field_jb = param0;
          this.field_z = true;
          this.field_u = this.field_s.field_u;
          this.buildSprites(12, true);
          this.castTypeSpell(-80);
          this.buildSprites(12, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ml.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_K = "You have fallen into the water! Choose a location to teleport to. Since you don't have Arcane Gate available, you will lose a third of your health (<%1>). If you fail to do this within the time limit, you will forfeit the game!";
    }
}
