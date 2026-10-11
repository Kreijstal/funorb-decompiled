/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static String field_i;
    static int[][] field_e;
    static int field_d;
    static int[][][] field_c;
    static int field_h;
    static String field_f;
    static boolean field_a;
    static String[] field_b;
    static ra field_g;

    final static int b(int param0) {
        if (param0 > -115) {
          return 44;
        }
        return (int)(1000000000L / cj.field_i);
    }

    public static void a(byte param0) {
        field_i = null;
        field_b = null;
        field_e = (int[][]) null;
        field_c = (int[][][]) null;
        field_f = null;
        field_g = null;
        if (param0 > -41) {
          field_i = (String) null;
        }
    }

    final static e a(int param0, fe param1, int param2) {
        RuntimeException var3 = null;
        fe var4 = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -116) {
            var4 = (fe) null;
            ol.a(-70, (fe) null, -27);
          }
          stackIn_3_0 = we.a(nc.a(param1, 100, param2), 6222);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ol.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(String param0, boolean param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          try {
            if (!uj.field_a.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            if (!param1) {
              ol.a((byte) -9);
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; var3 < param0.length(); var3++) {
              if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("ol.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, uj param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -119) {
            ol.b(-70);
          }
          stackIn_3_0 = param1.a((byte) -76);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ol.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (var1 < vk.field_f) {
          mh.field_f = mh.field_f + (-var1 + vk.field_f);
        }
        if (param0 != 256) {
          field_b = (String[]) null;
        }
        vk.field_f = var1;
        return var1 + mh.field_f;
    }

    static {
        field_i = "Password is valid";
        field_e = new int[][]{new int[]{192, 192}, new int[]{192, 192}, new int[]{256, 256}};
        field_h = 0;
        field_a = false;
        field_b = new String[]{"Fight your way to the top of the tower, defeating enemies and collecting seals along the way. You must collect 3 seals from 5 to unlock the exit. When you die, you start again at the last seal you collected. For every 5 seals collected, your monk's life force increases by 1 point. Passing over a collected seal will recharge your health.", "Choose one of the three brave young monks to play as. Each has their own special abilities.", null, null, "Each enemy that is defeated increases the monk's combo counter. When the monk's combo counter is full, it flashes for a short time before discharging. During this time, the monk's attacks will inflict extra damage.", null, "Collect coins to score points. There are a total of 3 jade coins hidden among the towers.", "Large bonus crystals are hidden among the towers. Collect one to reveal 10 small bonus crystals. Collect all 10 within the time limit to earn a score multiplier and an extra life.", "Health potions and extra lives are dotted around the towers.", "Help posts are located at important points to guide you in your quest. You can enable or disable the help posts from the menu."};
        field_c = new int[8][3][5];
    }
}
