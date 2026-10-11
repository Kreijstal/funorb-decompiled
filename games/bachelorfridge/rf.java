/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    int[] field_e;
    cr field_m;
    private int field_d;
    int field_b;
    static String[] field_h;
    int[][] field_c;
    int[] field_i;
    int field_f;
    private byte[] field_a;
    int[] field_o;
    byte[][] field_g;
    private int[][] field_n;
    int field_r;
    int[] field_j;
    cr[] field_l;
    static sna field_q;
    int[] field_p;
    static int field_k;
    private int[] field_s;

    final static void a(int param0) {
        vka.c((byte) 73);
        if (param0 >= -127) {
          field_k = 18;
        }
    }

    private final void a(int param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lu var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = BachelorFridge.field_y;
        try {
          var17 = new lu(td.a(-97, param1));
          var4 = var17.b(16711935);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_r = var17.f(-66);
            } else {
              this.field_r = 0;
            }
            if (param0 != 27062) {
              rf.a(12);
            }
            var5 = var17.b(16711935);
            stackIn_13_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_13_0;
            if (var4 < 7) {
              this.field_d = var17.e((byte) 100);
            } else {
              this.field_d = var17.f((byte) -127);
            }
            stackIn_19_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_19_0;
            var8 = 0;
            var9 = -1;
            this.field_o = new int[this.field_d];
            if (var4 < 7) {
              for (var10 = 0; this.field_d > var10; var10++) {
                dupTemp$0 = var8 + var17.e((byte) 107);
                var8 = dupTemp$0;
                this.field_o[var10] = dupTemp$0;
                if (this.field_o[var10] > var9) {
                  var9 = this.field_o[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_d; var10++) {
                dupTemp$1 = var8 + var17.f((byte) 103);
                var8 = dupTemp$1;
                this.field_o[var10] = dupTemp$1;
                if (this.field_o[var10] > var9) {
                  var9 = this.field_o[var10];
                }
              }
            }
            this.field_f = var9 + 1;
            this.field_p = new int[this.field_f];
            this.field_e = new int[this.field_f];
            this.field_i = new int[this.field_f];
            if (var7 != 0) {
              this.field_g = new byte[this.field_f][];
            }
            this.field_c = new int[this.field_f][];
            this.field_j = new int[this.field_f];
            if (var6 != 0) {
              this.field_s = new int[this.field_f];
              for (var10Lifetime1 = 0; this.field_f > var10Lifetime1; var10Lifetime1++) {
                this.field_s[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_d > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_s[this.field_o[var10Lifetime1Lifetime1]] = var17.f(lt.a(param0, 27083));
              }
              this.field_m = new cr(this.field_s);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_d; var10Lifetime2++) {
              this.field_p[this.field_o[var10Lifetime2]] = var17.f(lt.a(param0, 27103));
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; this.field_d > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(var21, 64, param0 - 26934, 0);
                this.field_g[this.field_o[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_d; var10Lifetime4++) {
              this.field_i[this.field_o[var10Lifetime4]] = var17.f(-67);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_d; var10Lifetime5++) {
                this.field_e[this.field_o[var10Lifetime5]] = var17.e((byte) 108);
              }
              for (var10Lifetime5 = 0; this.field_d > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_o[var10Lifetime5];
                var12 = this.field_e[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_c[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.e((byte) 57);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_c[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_j[var11] = var13 + 1;
                if (var13 + 1 == var12) {
                  this.field_c[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_d; var10Lifetime5++) {
                this.field_e[this.field_o[var10Lifetime5]] = var17.f((byte) -11);
              }
              for (var10Lifetime5 = 0; this.field_d > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_o[var10Lifetime5];
                var12 = this.field_e[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_c[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.f((byte) -124);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_c[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_j[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_c[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_n = new int[1 + var9][];
              this.field_l = new cr[1 + var9];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_d; var10Lifetime6++) {
                var11Lifetime1 = this.field_o[var10Lifetime6];
                var12Lifetime1 = this.field_e[var11Lifetime1];
                array$8 = new int[this.field_j[var11Lifetime1]];
                this.field_n[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_j[var11Lifetime1]; var13Lifetime1++) {
                  this.field_n[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.field_c[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_c[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_n[var11Lifetime1][var14Lifetime1] = var17.f(103);
                }
                this.field_l[var11Lifetime1] = new cr(this.field_n[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("rf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 >= -63) {
          rf.b(-64);
        }
        field_h = null;
    }

    rf(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_b = wc.a(param0, -31303, param0.length);
          if (this.field_b != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_a = ln.a(param0.length, param0, 0, 8);
            for (var4_int = 0; 64 > var4_int; var4_int++) {
              if (this.field_a[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(27062, param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new String[]{"MOVE_WALK", "MOVE_SPRINT", "MOVE_SPRINT2", "MOVE_SPRINT3", "MOVE_TELEPORT", "MOVE_LEVITATE", "ATTACK_ME_HIT", "ATTACK_ME_HIT2", "ATTACK_ME_HIT3", "ATTACK_DA_CONE", "ATTACK_DA_CONE2", "ATTACK_DA_CONE3", "ATTACK_DR_SPLASH", "ATTACK_DR_SPLASH2", "ATTACK_DR_SPLASH3", "ATTACK_BA_SHOVE", "ATTACK_BA_SHOVE2", "ATTACK_BA_SHOVE3", "ATTACK_FV_SPEAR", "ATTACK_FV_SPEAR2", "ATTACK_FV_SPEAR3", "ATTACK_FI_SWIPE", "ATTACK_FI_SWIPE2", "ATTACK_FI_SWIPE3", "ATTACK_ME_CHARGE", "ATTACK_ME_CHARGE2", "ATTACK_ME_CHARGE3", "ATTACK_ME_SHBARGE", "ATTACK_ME_SHBARGE2", "ATTACK_ME_SHBARGE3", "BUFF_ME_ATTACKUP", "ATTACK_DA_RANGE", "ATTACK_DA_RANGE2", "ATTACK_DA_RANGE3", "PASSIVE_DA_BUFFRNG", "PASSIVE_DA_BUFFRNG2", "PASSIVE_DA_BUFFRNG3", "BUFF_DA_SPEEDDOWN", "ATTACK_BA_SMASH", "ATTACK_BA_SMASH2", "ATTACK_BA_SMASH3", "ATTACK_BA_JUMPSHOVE", "ATTACK_BA_JUMPSHOVE2", "ATTACK_BA_JUMPSHOVE3", "BUFF_BA_GUARD", "BUFF_DR_SPEEDUP", "ATTACK_FV_FLYINGKICK", "ATTACK_FV_FLYINGKICK2", "ATTACK_FV_FLYINGKICK3", "ATTACK_FV_JUMP", "ATTACK_FV_JUMP2", "ATTACK_FV_JUMP3", "BUFF_FV_ATTACKDOWN", "PASSIVE_FI_BUFFSPLASH", "ATTACK_FI_RNGCONE", "ATTACK_FI_RNGCONE2", "ATTACK_FI_RNGCONE3", "BUFF_FI_POISON", "ATTACK_MI_POKE", "ATTACK_MI_POKE2", "ATTACK_MI_POKE3", "ATTACK_MI_HEAL", "ATTACK_MI_HEAL2", "ATTACK_MI_HEAL3", "ATTACK_MI_EXTEND", "ATTACK_MI_EXTEND2", "ATTACK_MI_EXTEND3", "BUFF_MI_SPATKUP", "ATTACK_RM_VAMPIRE", "ATTACK_RM_VAMPIRE2", "ATTACK_RM_VAMPIRE3", "ATTACK_RM_RNGSPLASH", "ATTACK_RM_RNGSPLASH2", "ATTACK_RM_RNGSPLASH3", "ATTACK_RM_FLSWIPE", "ATTACK_RM_FLSWIPE2", "ATTACK_RM_FLSWIPE3", "BUFF_RM_SPATKDOWN", "ATTACK_SWAP1", "ATTACK_SWAP2", "ATTACK_PIT", "ATTACK_BLOCK", "ATTACK_CONFUSE", "ATTACK_PANIC", "PASSIVE_HP", "PASSIVE_SPEED", "PASSIVE_ATTACK", "PASSIVE_SPATTACK", "SPECIAL_SNOW", "SPECIAL_SUPERSPEED", "SPECIAL_SLEEP", "SPECIAL_SHIELD", "SPECIAL_HAIL", "SPECIAL_RAISE", "SPECIAL_DBOMBER", "SPECIAL_MARTYR", "SPECIAL_INCOMING", "SPECIAL_SPILTMILK", "SPECIAL_DREAMS", "SPECIAL_SLOWALL", "SPECIAL_INSANOSAUCE", "SPECIAL_SUPERSPEEDALL", "SPECIAL_SHUFFLE", "SPECIAL_FLOOD", "SPECIAL_LEVITATE", "SPECIAL_FULLHEAL", "SPECIAL_INVINCIBLE", "SPECIAL_CLAMS", "SPECIAL_DISABLE", "SPECIAL_FISHRAIN", "SPECIAL_MASSPOISON", "SPECIAL_ZOMBIES", "SPECIAL_FLY", "SPECIAL_TBOMBER", "SPECIAL_STICKY", "SPECIAL_FLIRT", "SPECIAL_HMISSILE", "SPECIAL_BANANARANG", "SPECIAL_STAMPEDE", "SPECIAL_MYSTERY", "SPECIAL_SCAVENGER", "SPECIAL_ATTACKUPALL", "SPECIAL_SAUCEOFFLAME", "SPECIAL_SPLIT", "SPECIAL_CRANBERRY", "SPECIAL_BUFFVENDOR", "SPECIAL_HAZMAT", "SPECIAL_BAGPIPE", "SPECIAL_RESET", "SPECIAL_PETATTACK", "SPECIAL_TELEPORT", "SPECIAL_AIRSTRIKE", "SPECIAL_PIZZAPARTY", "SPECIAL_OHNO", "SPECIAL_REFRESHING", "SPECIAL_RAGE", "SPECIAL_GASCLOUD", "SPECIAL_ONE"};
    }
}
