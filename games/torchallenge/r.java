/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static boolean[][][] field_i;
    static int[][] field_h;
    private int field_g;
    String field_c;
    private int field_f;
    float field_d;
    static int[] field_a;
    private int field_b;
    private ni[] field_e;

    final static String a(int param0, int param1, byte[] param2, byte param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        byte[] var10 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var12 = new char[param0];
          var11 = var12;
          var4 = var11;
          var5 = 0;
          for (var6 = 0; var6 < param0; var6++) {
            var7 = 255 & param2[var6 + param1];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = ae.field_p[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var4[incrementValue$0] = (char)var7;
            }
          }
          if (param3 != 8) {
            var10 = (byte[]) null;
            r.a(-89, -120, (byte[]) null, (byte) -36);
          }
          stackIn_16_0 = new String(var12, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("r.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_i = (boolean[][][]) null;
        if (param0 <= 22) {
          field_i = (boolean[][][]) null;
        }
        field_h = (int[][]) null;
        field_a = null;
    }

    private final void a(int param0, int param1, ni param2) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)(this.field_b + param1) + (float)param0 / 100.0f;
          if (param0 != 0) {
            this.field_c = param2.field_j + " - " + param0 + "%";
          } else {
            this.field_c = param2.field_g;
          }
          this.field_d = var4_float * (float)this.field_f / (float)(1 + this.field_g);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "r.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        int var3;
        ni var4;
        var3 = TorChallenge.field_F ? 1 : 0;
        while (this.field_b < this.field_g) {
          var4 = this.field_e[this.field_b];
          if (!var4.field_a.b(-7957)) {
            this.a(0, 1, var4);
            return false;
          }
          if (0 <= var4.field_c &&
            !var4.field_a.a(true, var4.field_c)) {
            this.a(var4.field_a.a(var4.field_c, (byte) 12), 1, var4);
            return false;
          }
          if (null != var4.field_e &&
            !var4.field_a.b(5, var4.field_e)) {
            this.a(var4.field_a.a(118, var4.field_e), param0 ^ 1, var4);
            return false;
          }
          if (var4.field_c < 0 &&
            var4.field_e == null &&
            var4.field_j != null &&
            !var4.field_a.b((byte) 79)) {
            this.a(var4.field_a.c(53), 1, var4);
            return false;
          }
          this.field_b = this.field_b + 1;
        }
        if (param0 == 0) {
          return true;
        }
        field_a = (int[]) null;
        return true;
    }

    private r() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new boolean[][][]{new boolean[][]{new boolean[]{false, true, false}, new boolean[]{true, false}, new boolean[]{true, false}, new boolean[]{true, false, false, false, false, false}, new boolean[]{true, false}, new boolean[]{false}, new boolean[]{true, false, false, false, false, false}}, new boolean[][]{new boolean[]{true, false}, new boolean[]{false, false, true, false}, new boolean[]{false, false, true, false, false, false}, new boolean[]{false, true, false, false, false, false}, new boolean[]{false, false, true, false, false}, new boolean[]{false, true, false, false, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, true, false}, new boolean[]{false, true}, new boolean[]{false, false, true, false}, new boolean[]{false, false, false, true, false, false}, new boolean[]{false, true, false}, new boolean[]{false}, new boolean[]{false, false, false, true, false, false}}};
        field_a = new int[]{10, 20, 30};
    }
}
