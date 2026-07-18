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
        field_d = null;
    }

    final boolean a(int param0) {
        int var2 = -107 % ((param0 - -79) / 38);
        return ((oha) this).field_a == 4 ? true : false;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        qc var2 = null;
        int var3 = 0;
        int var4 = 0;
        kv var5 = null;
        String var6 = null;
        int var7 = 0;
        uu var8 = null;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            mda.field_b = new sna();
            var1_int = 100;
            var2 = jfa.field_q[baa.field_Q];
            var3 = 0;
            L1: while (true) {
              if (var2.field_d <= var3) {
                if (param0 == -34) {
                  break L0;
                } else {
                  oha.b((byte) -125);
                  return;
                }
              } else {
                var4 = var2.field_a[var3].field_b;
                var5 = dc.field_y[var4];
                var6 = var2.field_a[var3].field_h;
                var7 = var2.field_a[var3].field_f;
                var8 = new uu(var5, var4, var6, var7);
                var8.field_rb = var1_int * var3;
                var8.a(cb.field_m, param0 ^ -127);
                mda.field_b.a(param0 ^ 33, (sna) (Object) var8);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "oha.B(" + param0 + ')');
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
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          dka.field_G = ki.field_w;
          if (param1 == 255) {
            L0: {
              stackOut_7_0 = 120;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (13 <= fga.field_f) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L0;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L0;
              }
            }
            vo.field_d = nna.a((byte) stackIn_10_0, stackIn_10_1 != 0);
            var6 = null;
            wr.a((String[]) null, (byte) -38);
            return;
          } else {
            if (param1 < 100) {
              vo.field_d = wu.a(param1, (byte) -56, param3);
              return;
            } else {
              if (param1 > 105) {
                vo.field_d = wu.a(param1, (byte) -56, param3);
                return;
              } else {
                var4 = args;
                wr.a(var4, (byte) -38);
                vo.field_d = kw.a(false, args);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("oha.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (args == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(4).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
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
        try {
            ((oha) this).field_h = param6;
            ((oha) this).field_k = param2;
            ((oha) this).field_a = param3;
            ((oha) this).field_c = param4;
            ((oha) this).field_f = param1;
            ((oha) this).field_b = param7;
            ((oha) this).field_j = param0;
            ((oha) this).field_l = param5;
            ((oha) this).field_g = param8;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "oha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
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
