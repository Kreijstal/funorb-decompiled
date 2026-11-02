/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HomingMissileAnimation extends EventAnimation {
    private int field_D;
    private HomingMissileEvent field_C;
    private ActorAnimation field_v;
    private cf field_z;
    private Sprite field_B;
    private dda field_A;
    static vr field_w;
    static Sprite field_E;
    static vm field_G;
    static String field_y;
    static lda field_x;

    public static void e(byte param0) {
        field_G = null;
        field_y = null;
        field_w = null;
        field_E = null;
        field_x = null;
        if (param0 >= -91) {
          HomingMissileAnimation.a(-64, -126, 88, (byte) 79);
        }
    }

    final boolean isFinished(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        CreatureActor var3;
        if (this.field_v.isLinked((byte) -106)) {
          return false;
        }
        if (li.field_l == this.field_z) {
          if (!this.field_A.field_h) {
            this.field_A.a(0);
            return false;
          }
          this.field_z = fn.field_m;
          MartyrAnimation.a(28, (byte) 3);
        }
        if (this.field_z == fn.field_m) {
          if (this.field_A.field_h) {
            return false;
          }
          if (75 == this.field_l) {
            var3 = this.field_C.creature.a(-27449, this.screen);
            var3.field_s.j(-105);
            var3.field_s.field_A = false;
            var3.field_j = 0;
          }
        }
        fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 > 0) {
          return false;
        }
        if (fn.field_m == this.field_z) {
          this.field_v = new ActorAnimation(this.screen, this.field_C.field_q, this.field_C.field_r);
          this.addChild(27799, this.field_v);
          this.field_z = qn.field_i;
          this.field_l = 40;
          return false;
        }
        if (this.field_z == qn.field_i) {
          this.field_z = sv.field_a;
          this.field_A.c((byte) -19);
        }
        if (this.field_D >= MassPoisonSpecial.field_q.length) {
          this.d(14481);
          return true;
        }
        fieldTemp$1 = this.field_D;
        this.field_D = this.field_D + 1;
        this.a(-1, fieldTemp$1);
        this.field_l = this.field_l + 30;
        var2 = 96 % ((71 - param0) / 47);
        return false;
    }

    private final void a(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        int var4;
        int var5;
        CreatureActor var6;
        int var7;
        int var8;
        int var11;
        int var12;
        int var13;
        Object var14;
        int var15;
        BattleState var16;
        var15 = BachelorFridge.field_y;
        var16 = this.screen.field_h;
        var4 = var16.width;
        var5 = var16.height;
        var6 = this.field_C.creature.a(-27449, this.screen);
        var7 = sj.field_l[param1];
        var8 = MassPoisonSpecial.field_q.length + param0;
        for (var9 = -var8; var8 >= var9; var9++) {
          for (var10 = -var8; var10 <= var8; var10++) {
            var11 = var9 + this.field_C.field_q;
            var12 = this.field_C.field_r + var10;
            if (0 <= var11 &&
              var4 > var11 &&
              var12 >= 0 &&
              var5 > var12) {
              if (var9 < 0) {
                stackIn_19_0 = -var9;
              } else {
                stackIn_19_0 = var9;
              }
              if (var10 >= 0) {
                stackIn_22_1 = var10;
              } else {
                stackIn_22_1 = -var10;
              }
              var13 = stackIn_19_0 + stackIn_22_1;
              if (var13 == param1) {
                if (var13 != 0) {
                  var14 = new uea(this.screen, var11, var12, var7);
                } else {
                  var14 = new dw(this.screen, var11, var12);
                }
                ((TileEffect) (var14)).a(param0 + 1);
                this.a(var11, var12, var6, param0 + 1);
              }
            }
          }
        }
    }

    private final void d(int param0) {
        if (param0 != 14481) {
          this.a(-47, -111);
        }
    }

    final void c(int param0) {
        int var2 = 0;
        CreatureActor var3_ref_ad = null;
        aj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        aj var10 = null;
        int var3 = 0;
        int var9 = BachelorFridge.field_y;
        if (fn.field_m == this.field_z) {
          var2 = this.field_l;
          var3_ref_ad = this.field_C.creature.a(-27449, this.screen);
          var4 = this.screen.field_s.a(var3_ref_ad.field_s.tileY, (byte) 33, var3_ref_ad.field_s.tileX);
          var5 = (-var2 + 150) * ((150 - var2) * 400) / 22500;
          SoftwareRasterizer.saveClip(fr.field_p);
          var6 = 32 + var4.field_a;
          SoftwareRasterizer.setClip(0, 0, 640, var6);
          this.field_B.drawVerticalFlip(var4.field_c, 30 + (var4.field_a - var5));
          var7 = new int[]{35, 35, 36, 37, 38, 39, 41, 43, 45, 48, 52, 56};
          for (var8 = 0; var8 < var7.length; var8++) {
            SoftwareRasterizer.setClip(var4.field_c + var7[var8], var6 + var8, var4.field_c - (-128 + var7[var8]), 1 + (var8 + var6));
            this.field_B.drawVerticalFlip(var4.field_c, 30 + (var4.field_a - var5));
          }
          SoftwareRasterizer.restoreClip(fr.field_p);
          return;
        }
        if (this.field_z == qn.field_i) {
          var10 = this.screen.field_s.a(this.field_C.field_r, (byte) -112, this.field_C.field_q);
          var3 = 400 * this.field_l / 40;
          this.field_B.draw(var10.field_c, 60 - this.field_B.field_o - var3 + var10.field_a);
        }
        if (param0 > -10) {
          this.d(53);
        }
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (param3 > -80) {
          HomingMissileAnimation.a(22, 90, 31, (byte) -58);
        }
        return nv.a(param1, param2, -106, param0);
    }

    HomingMissileAnimation(BattleScreen param0, HomingMissileEvent param1) {
        super(param0, param1);
        BattleCreature var3 = null;
        try {
          this.field_C = param1;
          this.field_v = this.field_m;
          this.field_z = li.field_l;
          this.field_B = de.field_F.toRgbSprite();
          this.field_l = 150;
          var3 = this.field_C.creature.a(34, this.screen.field_h);
          this.field_A = new dda(this.screen, var3.tileX, var3.tileY);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "aka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = "Offline";
    }
}
