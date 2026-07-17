/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    short[] field_h;
    int[] field_e;
    short[] field_g;
    int[] field_i;
    byte[] field_F;
    short[] field_m;
    short[] field_y;
    int[] field_I;
    short[] field_l;
    int field_E;
    short[] field_v;
    short field_c;
    short[] field_r;
    private boolean field_J;
    int[] field_j;
    int field_L;
    int[] field_D;
    short[] field_M;
    int field_o;
    int field_a;
    byte field_p;
    static String[] field_C;
    int[] field_N;
    static String field_u;
    short[] field_w;
    int[] field_t;
    short[] field_x;
    short[] field_B;
    short[] field_n;
    short field_f;
    short field_k;
    short[] field_O;
    short[] field_G;
    int[] field_z;
    short[] field_d;
    short[] field_q;
    int field_b;
    short[] field_K;
    int[] field_A;
    short[] field_H;
    int field_s;

    final static void a(int param0, int param1, int param2) {
        kj.field_c = param2;
        id.field_D = param2;
        rl.field_f = true;
        if (param1 != 32767) {
          gd.a((byte) -51);
          te.field_eb = param0;
          ul.field_d = param0;
          return;
        } else {
          te.field_eb = param0;
          ul.field_d = param0;
          return;
        }
    }

    final static long a(int param0) {
        if (param0 > -99) {
            gd.a((byte) -69);
            return pd.a(-22826) - pi.field_i;
        }
        return pd.a(-22826) - pi.field_i;
    }

    private final void a(boolean param0) {
        ((gd) this).field_J = false;
    }

    public static void a(byte param0) {
        if (param0 > -25) {
            return;
        }
        field_u = null;
        field_C = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        int var5 = 79 / ((-43 - param1) / 41);
        for (var6 = 0; ((gd) this).field_k > var6; var6++) {
            ((gd) this).field_G[var6] = (short)(((gd) this).field_G[var6] + param3);
            ((gd) this).field_B[var6] = (short)(((gd) this).field_B[var6] + param2);
            ((gd) this).field_m[var6] = (short)(((gd) this).field_m[var6] + param0);
        }
        this.a(true);
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawn.field_J;
        if (((gd) this).field_J) {
          return;
        } else {
          ((gd) this).field_J = true;
          var2 = 32767;
          var3 = param0;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (((gd) this).field_k <= var8) {
              ((gd) this).field_s = var5;
              ((gd) this).field_a = var4;
              ((gd) this).field_E = var3;
              ((gd) this).field_o = var2;
              ((gd) this).field_b = var7;
              ((gd) this).field_L = var6;
              return;
            } else {
              L1: {
                var9 = ((gd) this).field_G[var8];
                var10 = ((gd) this).field_B[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10 > var6) {
                  var6 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var11 = ((gd) this).field_m[var8];
                if (var5 >= var9) {
                  break L3;
                } else {
                  var5 = var9;
                  break L3;
                }
              }
              L4: {
                if (var3 <= var10) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                if (var4 > var11) {
                  var4 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                var8++;
                continue L0;
              } else {
                var8++;
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        var6 = 0;
        L0: while (true) {
          if (((gd) this).field_k <= var6) {
            if (param0 != 0) {
              return;
            } else {
              this.a(true);
              return;
            }
          } else {
            ((gd) this).field_G[var6] = (short)(((gd) this).field_G[var6] * param1 / param3);
            ((gd) this).field_B[var6] = (short)(param4 * ((gd) this).field_B[var6] / param3);
            ((gd) this).field_m[var6] = (short)(((gd) this).field_m[var6] * param2 / param3);
            var6++;
            continue L0;
          }
        }
    }

    gd() {
        ((gd) this).field_p = (byte) 0;
        ((gd) this).field_J = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new String[]{"Get a score of at least 2,000", "Get a score of at least 5,000", "Get a score of at least 10,000", "Assimilate all 250 humans on the Mall bonus level", "Get 50 zombies across the road on the Power Plant bonus level", "Assimilate all the humans on the Precinct bonus level", "Assimilate an army soldier ", "Complete the basic game", "Complete the Mall", "Complete the Power Plant on Hard", "Complete the Precinct on Hard", "Complete the White House on Hard", "Consume 100 pumpkin-heads in a single game during Halloween", "Get a score of at least 16,661", "Stealthily retrieve the Quake and Speed powerups in Touchdown, in that order, using the same zombie", "No pain, no gain. Keep a zombie healthy through exercise", "Finish the Terminal 5 bonus level with more than 400 zombies", "Zombify all the hunters in Hunting Grounds", "Herd at least 120 humans into the barn in the Countryside bonus level", "Open all doors in the Labs Entrance within 2 minutes", "Feed 20 victims (not including enemy zombies) to aliens in a single level", "Feed a man in black to an alien", "Get out of the Labs bonus level in less than one minute", "Open the doors to the Palace", "Take over the Palace", "Complete Terminal 5 on Hard", "Complete Countryside on Hard", "Complete the Labs on Hard", "Complete the Palace on Hard", "I hope Mr. Harris got to say his goodbyes.", "Doris should really stop placing powerups in the oven.", "Miss Potter thought she would be safe in there."};
    }
}
