/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BattleUpdate extends IntrusiveNode {
    static volatile int field_f;
    int field_h;
    static int field_i;
    int field_j;
    static String field_g;

    abstract void write(PacketBuffer param0, int param1);

    final static boolean b(boolean param0) {
        if (!param0) {
          BattleUpdate.a(47, 23);
          if (!dma.field_a) {
            return AttackUpAllAnimation.e(-29919) ? true : false;
          }
          return true;
        }
        if (dma.field_a) {
          return true;
        }
        if (!AttackUpAllAnimation.e(-29919)) {
          return false;
        }
        return true;
    }

    abstract AnimationNode createAnimation(int param0, BattleScreen param1);

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        BagpipeSpecial.field_p = null;
        RaiseEvent.field_s = null;
        ds.field_m = 0;
        var2 = nj.field_f;
        nj.field_f = DreamsAnimation.field_x;
        DreamsAnimation.field_x = var2;
        if (51 == param0) {
          HomingMissileAnimation.field_G.field_k = 2;
          HomingMissileAnimation.field_G.field_e = HomingMissileAnimation.field_G.field_e + 1;
          if (param1 != 1) {
            return -49;
          }
          if (HomingMissileAnimation.field_G.field_e >= 2 &&
            param0 == 51) {
            return 2;
          }
          if (2 <= HomingMissileAnimation.field_G.field_e &&
            param0 == 50) {
            return 5;
          }
        } else {
          if (param0 == 50) {
            HomingMissileAnimation.field_G.field_k = 5;
            HomingMissileAnimation.field_G.field_e = HomingMissileAnimation.field_G.field_e + 1;
            if (param1 != 1) {
              return -49;
            }
            if (HomingMissileAnimation.field_G.field_e >= 2 &&
              param0 == 51) {
              return 2;
            }
            if (2 <= HomingMissileAnimation.field_G.field_e &&
              param0 == 50) {
              return 5;
            }
            if (4 > HomingMissileAnimation.field_G.field_e) {
              return -1;
            }
            return 1;
          }
          HomingMissileAnimation.field_G.field_k = 1;
          HomingMissileAnimation.field_G.field_e = HomingMissileAnimation.field_G.field_e + 1;
          if (param1 != 1) {
            return -49;
          }
          if (HomingMissileAnimation.field_G.field_e < 2) {
            if (2 > HomingMissileAnimation.field_G.field_e) {
              if (4 <= HomingMissileAnimation.field_G.field_e) {
                return 1;
              }
              return -1;
            }
            if (param0 == 50) {
              return 5;
            }
            if (4 > HomingMissileAnimation.field_G.field_e) {
              return -1;
            }
            return 1;
          }
          if (param0 == 51) {
            return 2;
          }
          if (2 > HomingMissileAnimation.field_G.field_e) {
            if (4 > HomingMissileAnimation.field_G.field_e) {
              return -1;
            }
            return 1;
          }
          if (param0 == 50) {
            return 5;
          }
        }
        if (4 <= HomingMissileAnimation.field_G.field_e) {
          return 1;
        }
        return -1;
    }

    abstract void apply(BattleState param0, boolean param1);

    BattleUpdate(int param0) {
        this.field_h = param0;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 != -51) {
          BattleUpdate.releaseStatics(45);
        }
    }

    static {
        field_i = 0;
        field_f = 0;
        field_g = "to keep fullscreen or";
    }
}
