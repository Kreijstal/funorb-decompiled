/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String[] field_b;
    int[] field_g;
    static cf field_a;
    int field_d;
    int field_e;
    static int[] field_h;
    static int[][] field_f;
    static t field_c;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (this.field_g != null &&
          this.field_g.length != 0) {
          for (var3 = 1; var3 < this.field_g.length; var3++) {
            if (param1 < (this.field_g[var3] + this.field_g[-1 + var3] >> 1)) {
              return -1 + var3;
            }
          }
          if (param0 == 0) {
            return -1 + this.field_g.length;
          }
          return 118;
        }
        return 0;
    }

    final int b(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 <= 87) {
          qi.a(true);
        }
        if (this.field_g != null &&
          0 != this.field_g.length) {
          stackIn_7_0 = this.field_g[-1 + this.field_g.length];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = vj.field_c;
        int var3 = param0 ? 1 : 0;
        if (!gh.field_x) {
          var1 = ea.field_e;
          if ((ea.field_e + 1) % 2 == 0) {
            return;
          }
          var3 = 1;
        }
        if (gh.field_x) {
          var1 = -12 + 2 * ea.field_e + 2 - 1;
          var3 = 1;
        }
        if (var3 != 0) {
          ob.a(var2, var1, -7756);
        }
    }

    final static qj a(lj param0, String param1, lj param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        qj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.a(param1, -89);
          if (param4 != 0) {
            var7 = (String) null;
            qi.a((lj) null, (String) null, (lj) null, (String) null, 9);
          }
          var6 = param2.a(var5_int, param3, (byte) 123);
          stackIn_3_0 = dg.a(var5_int, param2, var6, param0, (byte) 69);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qi.C(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = (int[][]) null;
        field_a = null;
        field_b = null;
        int var1 = 6 % ((35 - param0) / 33);
        field_c = null;
    }

    qi(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_g = new int[param2 + 1];
        this.field_e = param1;
    }

    static {
        field_a = new cf();
        field_h = new int[8192];
        field_c = null;
        field_f = new int[][]{new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{8, 8, 8}, new int[]{8, 8, 8}, new int[]{8, 0, 0}, new int[]{4, 4, 4}, new int[]{12, 8, 16}, new int[]{0, 8, 0}, new int[]{0, 8, 0}, new int[]{6, 0, 0}, new int[]{0, 0, 6}, new int[]{6, 0, 0}, new int[]{0, 6, 0}, new int[]{0, 0, 6}};
    }
}
