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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            ml.a(param4, param3, (byte) 95, param13);
            if (param0 >= 85) {
              e.b(1, param8, param12, param1, param2);
              td.a(true, param17, param5);
              rc.a(param14, 120, param16, param15, param19, param18);
              lj.a(param10, param11, param7, 69);
              vi.a(-1, param6, param20, param9);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("ug.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');

            if (param19 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param20 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        L0: {
          fieldTemp$0 = this.field_i + 1;
          this.field_i = this.field_i + 1;
          this.field_j = this.field_j + fieldTemp$0;
          var2 = 0;
          if (!param0) {
            break L0;
          } else {
            this.b(false);
            break L0;
          }
        }
        L1: while (true) {
          if ((var2 ^ -1) <= -257) {
            return;
          } else {
            L2: {
              var3 = this.field_g[var2];
              if (-1 == (2 & var2 ^ -1)) {
                if (-1 != (1 & var2 ^ -1)) {
                  this.field_a = this.field_a ^ this.field_a >>> -965374842;
                  break L2;
                } else {
                  this.field_a = this.field_a ^ this.field_a << 619261165;
                  break L2;
                }
              } else {
                if ((var2 & 1) != 0) {
                  this.field_a = this.field_a ^ this.field_a >>> 1648616368;
                  break L2;
                } else {
                  this.field_a = this.field_a ^ this.field_a << -56508126;
                  break L2;
                }
              }
            }
            this.field_a = this.field_a + this.field_g[255 & var2 - -128];
            dupTemp$1 = this.field_a + (this.field_g[dg.a(var3 >> -1170177854, 255)] - -this.field_j);
            var4 = dupTemp$1;
            this.field_g[var2] = dupTemp$1;
            dupTemp$2 = var3 + this.field_g[dg.a(var4, 261203) >> -1588828664 >> 1085753954];
            this.field_j = dupTemp$2;
            this.field_e[var2] = dupTemp$2;
            var2++;
            continue L1;
          }
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
        for (var2 = 0; -5 < (var2 ^ -1); var2++) {
            var3 = var3 ^ var4 << 107899019;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1908760674;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 977064808;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 1286021328;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 964885642;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 1189930884;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 160580232;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> -36095831;
            var3 = var3 + var4;
            var5 = var5 + var10;
        }
        for (var2 = 0; var2 < 256; var2 += 8) {
            var8 = var8 + this.field_e[var2 + 5];
            var6 = var6 + this.field_e[3 + var2];
            var9 = var9 + this.field_e[var2 - -6];
            var3 = var3 + this.field_e[var2];
            var10 = var10 + this.field_e[var2 + 7];
            var7 = var7 + this.field_e[4 + var2];
            var4 = var4 + this.field_e[1 + var2];
            var5 = var5 + this.field_e[2 + var2];
            var3 = var3 ^ var4 << -600765813;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -851064030;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 1195279688;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -823930128;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -2124314102;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 1514288100;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 317657288;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 1779230889;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_g[var2] = var3;
            this.field_g[var2 - -1] = var4;
            this.field_g[2 + var2] = var5;
            this.field_g[var2 - -3] = var6;
            this.field_g[var2 + 4] = var7;
            this.field_g[var2 + 5] = var8;
            this.field_g[6 + var2] = var9;
            this.field_g[7 + var2] = var10;
        }
        if (param0 <= 124) {
            this.a(false);
        }
        for (var2 = 0; -257 < (var2 ^ -1); var2 += 8) {
            var7 = var7 + this.field_g[var2 + 4];
            var6 = var6 + this.field_g[3 + var2];
            var5 = var5 + this.field_g[2 + var2];
            var8 = var8 + this.field_g[var2 - -5];
            var10 = var10 + this.field_g[var2 + 7];
            var3 = var3 + this.field_g[var2];
            var4 = var4 + this.field_g[1 + var2];
            var9 = var9 + this.field_g[6 + var2];
            var3 = var3 ^ var4 << -1061714549;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -1533129022;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 1980359016;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -2017757264;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -1427019062;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> 1818626756;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -250798200;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 748186889;
            var3 = var3 + var4;
            var5 = var5 + var10;
            this.field_g[var2] = var3;
            this.field_g[var2 + 1] = var4;
            this.field_g[var2 + 2] = var5;
            this.field_g[var2 + 3] = var6;
            this.field_g[4 + var2] = var7;
            this.field_g[var2 + 5] = var8;
            this.field_g[6 + var2] = var9;
            this.field_g[7 + var2] = var10;
        }
        this.b(false);
        this.field_b = 256;
    }

    final int a(boolean param0) {
        if (param0) {
            return -76;
        }
        if (!(this.field_b != 0)) {
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
