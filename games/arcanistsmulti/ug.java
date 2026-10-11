/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    private int field_i;
    private int field_b;
    static String field_l;
    private int field_j;
    static String field_f;
    private int[] field_g;
    private int field_a;
    private int[] field_e;
    static String field_h;
    static dc field_k;
    static eh field_c;
    static int[][] field_d;

    final static void a(byte param0, int param1, int param2, int param3, dj param4, int param5, int param6, int param7, int param8, int param9, int param10, ec param11, int param12, dj param13, ec param14, int param15, int param16, int param17, int param18, ec param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          ml.a(param4, param3, (byte) 95, param13);
          if (param0 < 85) {
            return;
          }
          e.b(1, param8, param12, param1, param2);
          td.a(true, param17, param5);
          rc.a(param14, 120, param16, param15, param19, param18);
          lj.a(param10, param11, param7, 69);
          vi.a(-1, param6, param20, param9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("ug.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param14 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param20).append(')').toString());
        }
    }

    final static void a(int param0, m param1, eg param2, int param3) {
        try {
          sn.field_G = param0 * gm.b(-2) / 1000;
          ed.a((byte) -17, param2);
          ArcanistsMulti.a(param2, (byte) -80);
          int var4_int = 88 % ((81 - param3) / 36);
          fl.a(-2389, param2);
          tm.a(5968);
          h.j(0);
          gi.field_a = -sn.field_G + 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ug.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void b(boolean param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        this.field_j = this.field_j + fieldTemp$0;
        var2 = 0;
        if (param0) {
          this.b(false);
        }
        while (var2 < 256) {
          var3 = this.field_g[var2];
          if ((2 & var2) == 0) {
            if ((1 & var2) != 0) {
              this.field_a = this.field_a ^ this.field_a >>> 6;
            } else {
              this.field_a = this.field_a ^ this.field_a << 13;
            }
          } else {
            if ((var2 & 1) != 0) {
              this.field_a = this.field_a ^ this.field_a >>> 16;
            } else {
              this.field_a = this.field_a ^ this.field_a << 2;
            }
          }
          this.field_a = this.field_a + this.field_g[255 & var2 + 128];
          dupTemp$1 = this.field_a + (this.field_g[dg.a(var3 >> 2, 255)] + this.field_j);
          var4 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_g[dg.a(var4, 261203) >> 8 >> 2];
          this.field_j = dupTemp$2;
          this.field_e[var2] = dupTemp$2;
          var2++;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var11 = ArcanistsMulti.field_G ? 1 : 0;
        int var7 = -1640531527;
        int var3 = -1640531527;
        int var5 = -1640531527;
        int var9 = -1640531527;
        int var10 = -1640531527;
        int var8 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var8 = var8 + this.field_e[var2Lifetime1 + 5];
          var6 = var6 + this.field_e[3 + var2Lifetime1];
          var9 = var9 + this.field_e[var2Lifetime1 + 6];
          var3 = var3 + this.field_e[var2Lifetime1];
          var10 = var10 + this.field_e[var2Lifetime1 + 7];
          var7 = var7 + this.field_e[4 + var2Lifetime1];
          var4 = var4 + this.field_e[1 + var2Lifetime1];
          var5 = var5 + this.field_e[2 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_g[var2Lifetime1] = var3;
          this.field_g[var2Lifetime1 + 1] = var4;
          this.field_g[2 + var2Lifetime1] = var5;
          this.field_g[var2Lifetime1 + 3] = var6;
          this.field_g[var2Lifetime1 + 4] = var7;
          this.field_g[var2Lifetime1 + 5] = var8;
          this.field_g[6 + var2Lifetime1] = var9;
          this.field_g[7 + var2Lifetime1] = var10;
        }
        if (param0 <= 124) {
          this.a(false);
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var7 = var7 + this.field_g[var2Lifetime2 + 4];
          var6 = var6 + this.field_g[3 + var2Lifetime2];
          var5 = var5 + this.field_g[2 + var2Lifetime2];
          var8 = var8 + this.field_g[var2Lifetime2 + 5];
          var10 = var10 + this.field_g[var2Lifetime2 + 7];
          var3 = var3 + this.field_g[var2Lifetime2];
          var4 = var4 + this.field_g[1 + var2Lifetime2];
          var9 = var9 + this.field_g[6 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_g[var2Lifetime2] = var3;
          this.field_g[var2Lifetime2 + 1] = var4;
          this.field_g[var2Lifetime2 + 2] = var5;
          this.field_g[var2Lifetime2 + 3] = var6;
          this.field_g[4 + var2Lifetime2] = var7;
          this.field_g[var2Lifetime2 + 5] = var8;
          this.field_g[6 + var2Lifetime2] = var9;
          this.field_g[7 + var2Lifetime2] = var10;
        }
        this.b(false);
        this.field_b = 256;
    }

    final int a(boolean param0) {
        if (param0) {
          return -76;
        }
        if (this.field_b == 0) {
          this.b(param0);
          this.field_b = 256;
        }
        int fieldTemp$0 = this.field_b - 1;
        this.field_b = this.field_b - 1;
        return this.field_e[fieldTemp$0];
    }

    ug(int[] param0) {
        int var2_int = 0;
        try {
          this.field_e = new int[256];
          this.field_g = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_e[var2_int] = param0[var2_int];
          }
          this.a((byte) 126);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_c = null;
        field_f = null;
        field_h = null;
        if (param0 < 101) {
          field_l = (String) null;
        }
        field_d = (int[][]) null;
    }

    static {
        field_l = "Wands available:<nbsp>";
        field_f = "Show all game chat";
        field_k = null;
        field_h = "Players: <%0>/<%1>";
        field_c = new eh();
        field_d = new int[][]{new int[]{255, 255, 51}, new int[]{255, 153, 0}, new int[]{255, 0, 0}, new int[]{102, 51, 0}, new int[]{153, 0, 102}, new int[]{153, 102, 204}, new int[]{153, 204, 255}, new int[]{0, 204, 204}, new int[]{0, 102, 153}, new int[]{0, 51, 102}, new int[]{51, 204, 102}, new int[]{51, 153, 51}, new int[]{255, 255, 255}, new int[]{204, 204, 204}, new int[]{102, 102, 102}, new int[]{70, 70, 70}};
    }
}
