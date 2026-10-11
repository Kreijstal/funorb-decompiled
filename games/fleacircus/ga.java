/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends r {
    static java.awt.Color field_p;
    static int[][] field_s;
    static int field_o;
    static String field_r;
    static String field_q;
    static String field_n;

    final wd a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        wd stackIn_3_0 = null;
        wd stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!ii.a(12969, var4)) {
            stackIn_3_0 = ml.field_K;
            return stackIn_3_0;
          }
          if (param0 != 160) {
            ga.c((byte) -73);
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = pl.a(var5, -9816);
          if (var3_int > 0 &&
            var3_int <= 130) {
            return hm.field_b;
          }
          stackIn_10_0 = ml.field_K;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ga.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(160, param1) == ml.field_K) {
            stackIn_2_0 = h.field_a;
            return stackIn_2_0;
          }
          var3_int = 83 % ((param0 - 24) / 46);
          stackIn_4_0 = null;
          return (String) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ga.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 > 111) {
          field_n = null;
          field_s = (int[][]) null;
          field_r = null;
          return;
        }
        field_o = 23;
        field_n = null;
        field_s = (int[][]) null;
        field_r = null;
    }

    ga(c param0) {
        super(param0);
    }

    static {
        field_p = new java.awt.Color(10040319);
        field_r = "<%0>Fans:<%1> These blow fleas to the sides.";
        field_n = "Play the game without logging in just yet";
        field_s = new int[][]{new int[]{153, 200, 245}, new int[]{153, 173, 193, 235, 255, 275, 305, 340}, new int[]{153, 196, 229, 262, 295, 338, 381}, new int[]{153, 196, 229, 250, 293, 326, 351, 376}, new int[]{153, 196, 239, 271, 303, 335, 367}, new int[]{153, 200, 245}, new int[]{153, 210, 278, 310}};
        field_q = "Sometimes you will find that you want to place a tile to keep the fleas on one side of a large area, but they are too spread out for this to work. When this happens, try shrinking the space gradually by placing tiles from the edge towards the middle.";
    }
}
