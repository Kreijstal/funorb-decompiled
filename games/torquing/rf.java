/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends pc {
    static int[][] field_q;
    private int field_y;
    static boolean[] field_x;
    private int field_v;
    private t[] field_s;
    private int field_w;
    static String field_u;
    static ei field_t;
    static int[] field_r;

    final static sm[] a(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        if (param0 != 66) {
          return (sm[]) null;
        }
        sm[] var1 = new sm[ti.field_g];
        for (var2 = 0; ti.field_g > var2; var2++) {
          var1[var2] = new sm(fm.field_E, rh.field_d, fj.field_o[var2], na.field_G[var2], vo.field_b[var2], ij.field_o[var2], pn.field_b[var2], cq.field_y);
        }
        go.b(0);
        return var1;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        try {
          if (!param4.field_s) {
            stackIn_6_0 = (param4.g(2)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param0 <= 89) {
            var9 = (gm) null;
            this.a(-79, -81, -76, false, (gm) null);
          }
          if (param4 instanceof lg) {
            param3 = param3 & ((lg) (param4)).field_x;
          }
          if (param3) {
            if (var6_int != 0) {
              stackIn_15_0 = this.field_v;
            } else {
              stackIn_15_0 = this.field_w;
            }
          } else {
            stackIn_15_0 = this.field_y;
          }
          var7 = stackIn_15_0;
          stackIn_18_0 = (!param3) ? 7105644 : 16777215;
          var8 = stackIn_18_0;
          wp.a(param1 + (param4.field_k + (-this.field_s[0].field_u + param4.field_o >> 1)), var7, param4.field_p, false, param4.field_w + param2, this.field_s);
          this.field_m.a(param4.field_m, param2 + param4.field_w, -2 + (param1 + param4.field_k), param4.field_p, param4.field_o, var8, -1, 1, 1, this.field_m.field_x);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("rf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_x = null;
        field_q = (int[][]) null;
        field_r = null;
        field_t = null;
        if (param0 < 59) {
          field_r = (int[]) null;
        }
        field_u = null;
    }

    final static int a(String[] args, uc param1, int param2, int param3, String param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Torquing.field_u;
        try {
          var5_int = param1.a(param4);
          if (param2 >= var5_int &&
            -1 == param4.indexOf("<br>")) {
            args[0] = param4;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (-1 + param2 + var5_int) / param2;
          param2 = var5_int / var6;
          var6Lifetime1 = 0;
          if (param3 < 51) {
            field_u = (String) null;
          }
          var7 = 0;
          var8 = param4.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param4.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param4.substring(var7, var9 + 1).trim();
              var12 = param1.a(var11);
              if (param2 <= var12) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = var11;
                var7 = var9 + 1;
              }
            }
            if (var10 == 62 &&
              param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              args[incrementValue$2] = param4.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$0] = param4.substring(var7, var8).trim();
          }
          stackIn_30_0 = var6Lifetime1;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("rf.D(");
          if (args == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    public rf() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, int param1) {
        if (param1 <= 35) {
          field_r = (int[]) null;
        }
        qp.field_j = (param0 & 63) >> 4;
        if (qp.field_j > 2) {
          qp.field_j = 2;
        }
        fj.field_k = param0 >> 2 & 3;
        if (fj.field_k > 2) {
          fj.field_k = 2;
        }
        m.field_l = param0 & 3;
        if (m.field_l > 2) {
          m.field_l = 2;
        }
    }

    private rf(int param0, int param1, int param2) {
        this.field_s = dg.field_g;
        this.field_y = param2;
        this.field_v = param1;
        this.field_w = param0;
        this.field_m = pe.field_E;
    }

    static {
        field_q = new int[][]{new int[]{0, 11, 2, 13, 6, 10, 3, 16, 21}, new int[]{4, 2, 13, 10, 11, 5}, new int[]{14, 12}, new int[]{8, 9, 14}, new int[]{22, 12, 23}, new int[]{}, new int[]{14, 1}, new int[]{14, 15}, new int[]{3, 12}, new int[]{18, 19, 17, 14, 12}, new int[]{12}, new int[]{1, 24}};
        field_x = new boolean[field_q.length];
        field_x[4] = true;
        field_x[11] = true;
        field_x[3] = true;
        field_t = new ei();
    }
}
