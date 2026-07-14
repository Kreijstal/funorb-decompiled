/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oha {
    int field_a;
    String field_k;
    int field_b;
    static String field_e;
    int field_j;
    int field_l;
    static int field_i;
    String field_f;
    int field_c;
    int field_g;
    static String[] field_d;
    int field_h;

    public static void b(int param0) {
        field_e = null;
        if (param0 != -256) {
            return;
        }
        field_d = null;
    }

    final boolean a(int param0) {
        int var2 = -107 % ((param0 - -79) / 38);
        return ((oha) this).field_a == 4 ? true : false;
    }

    final static void b(byte param0) {
        int var1 = 0;
        qc var2 = null;
        int var3 = 0;
        int var4 = 0;
        kv var5 = null;
        String var6 = null;
        int var7 = 0;
        uu var8 = null;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        mda.field_b = new sna();
        var1 = 100;
        var2 = jfa.field_q[baa.field_Q];
        var3 = 0;
        L0: while (true) {
          if (var2.field_d <= var3) {
            if (param0 != -34) {
              oha.b((byte) -125);
              return;
            } else {
              return;
            }
          } else {
            var4 = var2.field_a[var3].field_b;
            var5 = dc.field_y[var4];
            var6 = var2.field_a[var3].field_h;
            var7 = var2.field_a[var3].field_f;
            var8 = new uu(var5, var4, var6, var7);
            var8.field_rb = var1 * var3;
            var8.a(cb.field_m, param0 ^ -127);
            mda.field_b.a(param0 ^ 33, (sna) (Object) var8);
            var3++;
            continue L0;
          }
        }
    }

    final String a(byte param0) {
        if (param0 != 37) {
            return null;
        }
        return ((oha) this).field_f;
    }

    final static void a(String[] args, int param1, int param2, String param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var5 = BachelorFridge.field_y;
        dka.field_G = ki.field_w;
        if (param1 == -256) {
          L0: {
            stackOut_15_0 = 120;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (13 <= fga.field_f) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L0;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L0;
            }
          }
          vo.field_d = nna.a((byte) stackIn_18_0, stackIn_18_1 != 0);
          var6 = null;
          wr.a((String[]) null, (byte) -38);
          if (param2 != 4) {
            field_e = null;
            return;
          } else {
            return;
          }
        } else {
          if (param1 < 100) {
            vo.field_d = wu.a(param1, (byte) -56, param3);
            if (param2 == 4) {
              return;
            } else {
              field_e = null;
              return;
            }
          } else {
            if (-106 < param1) {
              vo.field_d = wu.a(param1, (byte) -56, param3);
              if (param2 != 4) {
                field_e = null;
                return;
              } else {
                return;
              }
            } else {
              var4 = args;
              wr.a(var4, (byte) -38);
              vo.field_d = kw.a(false, args);
              if (param2 == 4) {
                return;
              } else {
                field_e = null;
                return;
              }
            }
          }
        }
    }

    oha(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((oha) this).field_a = param0;
        ((oha) this).field_l = param4;
        ((oha) this).field_j = param1;
        ((oha) this).field_g = param5;
        ((oha) this).field_h = param2;
        ((oha) this).field_b = param3;
    }

    oha(int param0, String param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((oha) this).field_h = param6;
        ((oha) this).field_k = param2;
        ((oha) this).field_a = param3;
        ((oha) this).field_c = param4;
        ((oha) this).field_f = param1;
        ((oha) this).field_b = param7;
        ((oha) this).field_j = param0;
        ((oha) this).field_l = param5;
        ((oha) this).field_g = param8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Status";
        field_d = new String[]{"Movement is slowed.", "No special effects.", "This surface is slippery!", "No special effects.", "Don't stay here too long...", "No special effects", "Your stamina is increased.", "Your stamina is decreased.", "Your speed is increased.", "Your speed is decreased.", "Your fisticuffs is increased", "Your fisticuffs is decreased", "Your flingstuff is increased", "Your flingstuff is decreased", "Health is regenerated by 5 every turn you are on this square", "You are damaged by 5 every turn you remain on this square", "A random status effect will be inflicted upon you", "When this reaches 0, it'll explode!", "You are invincible! Nothing can touch you", "This tile has limited exits", "Capture this for victory!", "Don't fall in!", "You can't stand on this tile!", "", "", "", "", "Movement is slowed depending on how deep the snow is. Tread carefully!", "You can't stand on this tile, but you can destroy it!", "This milk is so sour that it's poisonous", "If you're caught in this, you won't be able to move until you've got rid of the stickiness...", "", "", "There's an invisible cloud of destructive radiation around here...", "I wouldn't hit this if I were you...", "When the timer reaches zero, don't be standing anywhere near here.", "Stand next to this for free healing.", "Clams are very volatile!", "Tasty pizza - or is it?", "Hit me!"};
        field_i = 250;
    }
}
