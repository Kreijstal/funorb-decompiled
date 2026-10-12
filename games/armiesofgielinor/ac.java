/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ac extends IntrusiveNode {
    private int field_z;
    private int field_y;
    static String field_u;
    private int field_q;
    private int field_w;
    static String field_x;
    private int field_v;
    static int field_p;
    static IndexedSprite[] activeTerrainSprites;
    private int field_l;
    static boolean field_n;
    static int field_m;
    static String field_s;
    private int field_t;
    private int field_r;
    private int field_o;

    final void a(Battlefield param0, int param1) {
        int dupTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -12614) {
            field_x = (String) null;
          }
          param0.playerMana[this.field_q] = param0.playerMana[this.field_q] + this.field_w;
          if (1000000000 < param0.playerMana[this.field_q]) {
            param0.playerMana[this.field_q] = 1000000000;
          }
          if (this.field_y != 3) {
            if (this.field_y != 4) {
              dupTemp$1 = param0.getPlayerTeamIndex(this.field_q, -1);
              param0.teamManaCollected[dupTemp$1] = param0.teamManaCollected[dupTemp$1] + this.field_w;
              if (param0.teamManaCollected[param0.getPlayerTeamIndex(this.field_q, param1 + 12613)] > 1000000000) {
                param0.teamManaCollected[param0.getPlayerTeamIndex(this.field_q, -1)] = 1000000000;
              }
            }
            this.unlink(96);
          } else {
            this.unlink(96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ac.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        activeTerrainSprites = null;
        field_x = null;
        field_u = null;
        field_s = null;
        if (param0 <= 19) {
          ac.a((byte) 70);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4 = -param0 + (this.field_v >> 4);
        int var5Lifetime1;
        if (param2 > -6) {
          this.field_o = 62;
          var5 = -param1 + (this.field_l >> 4);
          if (this.field_o > 100) {
            var4 = 210;
            var5 = 30;
            if (this.field_o >= 0) {
              MusicPatchUsage.manaStarSprites[this.field_t].g(-8 + var4, -8 + var5);
              return;
            }
            return;
          }
          if (this.field_o < 0) {
            if (this.field_o >= 0) {
              MusicPatchUsage.manaStarSprites[this.field_t].g(-8 + var4, -8 + var5);
              return;
            }
            return;
          }
          var5 = (this.field_o * 30 + var5 * (-this.field_o + 100)) / 100;
          var4 = (var4 * (100 - this.field_o) + 210 * this.field_o) / 100;
          if (this.field_o >= 0) {
            MusicPatchUsage.manaStarSprites[this.field_t].g(-8 + var4, -8 + var5);
            return;
          }
          return;
        }
        var5Lifetime1 = -param1 + (this.field_l >> 4);
        if (this.field_o > 100) {
          var4 = 210;
          var5Lifetime1 = 30;
          if (this.field_o >= 0) {
            MusicPatchUsage.manaStarSprites[this.field_t].g(-8 + var4, -8 + var5Lifetime1);
            return;
          }
          return;
        }
        if (this.field_o < 0) {
          if (this.field_o < 0) {
            return;
          }
          MusicPatchUsage.manaStarSprites[this.field_t].g(-8 + var4, -8 + var5Lifetime1);
          return;
        }
        var5Lifetime1 = (this.field_o * 30 + var5Lifetime1 * (-this.field_o + 100)) / 100;
        var4 = (var4 * (100 - this.field_o) + 210 * this.field_o) / 100;
        if (this.field_o < 0) {
          return;
        }
        MusicPatchUsage.manaStarSprites[this.field_t].g(-8 + var4, -8 + var5Lifetime1);
    }

    final void b(Battlefield param0, int param1) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Battlefield var4 = null;
        try {
          if (this.field_o >= 0) {
            this.field_l = this.field_l + this.field_z;
            this.field_v = this.field_v + this.field_r;
            this.field_r = this.field_r + 1;
            if (1600 >= this.field_l) {
              this.field_z = this.field_z + 1;
            } else {
              this.field_z = this.field_z - 1;
            }
          }
          this.field_o = this.field_o + 1;
          if (this.field_o == 0) {
            if (this.field_y == 0 &&
              !uu.field_b) {
              RadialSummonMenu.playDefaultSoundWithIntGuard(29, el.field_b[0]);
              ep.field_f = false;
              uu.field_b = true;
            }
            if (this.field_y == 1 &&
              !et.field_d) {
              RadialSummonMenu.playDefaultSoundWithIntGuard(50, el.field_b[0]);
              ep.field_f = false;
              et.field_d = true;
            }
            if (this.field_y == 2 &&
              !wt.field_G) {
              RadialSummonMenu.playDefaultSoundWithIntGuard(113, el.field_b[0]);
              ep.field_f = false;
              wt.field_G = true;
            }
            if (this.field_y == 3 &&
              !ep.field_f) {
              RadialSummonMenu.playDefaultSoundWithIntGuard(57, el.field_b[0]);
              et.field_d = false;
              wt.field_G = false;
              uu.field_b = false;
              ep.field_f = true;
            }
          }
          if (this.field_o >= 0) {
            this.field_o = this.field_o + 1;
          }
          if (param1 != 100) {
            var4 = (Battlefield) null;
            this.b((Battlefield) null, -123);
          }
          if (this.field_o < 100) {
            return;
          }
          this.a(param0, -12614);
          RadialSummonMenu.playDefaultSoundWithIntGuard(91, el.field_b[1 + AttackEvent.nextBoundedInt(false, 8, li.field_n)]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ac.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final static RgbSprite[] a(ResourceArchive param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.getGroupId(param3, 124);
          if (param2 != -4) {
            ac.a((byte) -15);
          }
          var5 = param0.getFileId((byte) -20, var4_int, param1);
          stackIn_3_0 = nk.a(var4_int, (byte) 28, var5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ac.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ac(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_v = param0 << 4;
        this.field_l = param1 << 4;
        this.field_r = param2 + ((int)(-80.0 + 161.0 * Math.random()) >> 1);
        this.field_z = param3 + ((int)(Math.random() * 161.0 - 80.0) >> 1);
        this.field_q = param4;
        this.field_w = param6;
        this.field_o = -param5;
        this.field_t = AttackEvent.nextBoundedInt(false, MusicPatchUsage.manaStarSprites.length, li.field_n);
        this.field_y = param7;
    }

    static {
        field_u = "End tutorial";
        field_x = "Accept <%0> into this game";
        field_s = "Cancel";
        field_n = false;
    }
}
