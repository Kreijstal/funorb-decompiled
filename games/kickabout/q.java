/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static int[] field_e;
    static String field_f;
    static int field_b;
    private lk[] field_g;
    int field_a;
    static String[] field_h;
    static uo field_d;
    static String field_c;

    final static void a(hd param0, int param1, int param2, int param3, hd param4, byte[] param5, hd param6, int param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = Kickabout.field_G;
        try {
          rp.field_x = param5;
          dd.field_c = -1L;
          qi.field_p = param8;
          ss.field_j = param5.length;
          hw.field_k = false;
          er.field_h = new byte[(7 + qi.field_p) / 8];
          uv.field_i = null;
          ow.field_b = null;
          var10_int = 0;
          for (var11 = 0; var11 < rp.field_x.length; var11++) {
            var10_int = var10_int + (rp.field_x[var11] & 255);
          }
          var10_int = (7 + var10_int) / 8;
          rf.field_d = new byte[var10_int];
          if (null == param0.field_jb) {
            param0.field_jb = new tf();
          }
          rp.field_B = param0.field_jb;
          rp.field_B.b(22997);
          pq.field_N = new em(param2);
          jm.field_h = 0;
          mi.field_d = -1;
          da.field_o = -1;
          fh.field_b = 0;
          if (param6.field_jb == null) {
            param6.field_jb = new tf();
          }
          kq.field_yb = param6.field_jb;
          kq.field_yb.b(22997);
          sr.field_f = new em(param9);
          if (param4.field_jb == null) {
            param4.field_jb = new tf();
          }
          lw.field_d = param4.field_jb;
          lw.field_d.b(22997);
          pu.field_Eb = new em(param3);
          mg.field_c = param7;
          vg.field_Ib = 0L;
          if (param1 <= 114) {
            q.a(123, 125, 58, -75, 34, -38, 61, 107, -70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_18_0 = var10;
          stackIn_18_1 = new StringBuilder().append("q.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final lk a(byte param0) {
        if (param0 <= 55) {
          return (lk) null;
        }
        int fieldTemp$0 = this.field_a;
        this.field_a = this.field_a + 1;
        return this.field_g[fieldTemp$0];
    }

    public static void b(int param0) {
        field_e = null;
        field_h = null;
        field_c = null;
        field_f = null;
        int var1 = 73 / ((-20 - param0) / 63);
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != 6) {
          field_e = (int[]) null;
        }
        return this.field_a >= this.field_g.length ? true : false;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        ut[] var10;
        ut[] var11_ref_ut__;
        int var11;
        int var12;
        ut var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = Kickabout.field_G;
        var9 = param1 + (param3 + param0);
        var10 = new ut[]{new ut(var9, var9), new ut(param4, var9), new ut(var9, var9), new ut(var9, param4), new ut(64, 64), new ut(var9, param4), new ut(var9, var9), new ut(param4, var9), new ut(var9, var9)};
        var11_ref_ut__ = var10;
        for (var12 = 0; var12 < var11_ref_ut__.length; var12++) {
          var13 = var11_ref_ut__[var12];
          for (var14 = 0; var14 < var13.field_y.length; var14++) {
            var13.field_y[var14] = param6;
          }
        }
        for (var11 = 0; param0 > var11; var11++) {
          for (var12Lifetime1 = 0; var12Lifetime1 < var9; var12Lifetime1++) {
            var10[6].field_y[(-1 - var11 + var9) * var9 + var12Lifetime1] = param2;
            var10[8].field_y[var12Lifetime1 + var9 * (-var11 + (var9 - 1))] = param2;
            var10[2].field_y[var12Lifetime1 * var9 + (-1 + (var9 - var11))] = param2;
            var10[8].field_y[-var11 + var9 - (1 - var12Lifetime1 * var9)] = param2;
          }
        }
        for (var11Lifetime1 = 0; param0 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_y[var12Lifetime2 + var11Lifetime1 * var9] = param8;
            var10[0].field_y[var9 * var12Lifetime2 + var11Lifetime1] = param8;
            if (var9 - var11Lifetime1 > var12Lifetime2) {
              var10[2].field_y[var11Lifetime1 * var9 + var12Lifetime2] = param8;
              var10[6].field_y[var9 * var12Lifetime2 + var11Lifetime1] = param8;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param4; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param0; var12Lifetime3++) {
            var10[7].field_y[param4 * (-var12Lifetime3 + (var9 - 1)) + var11Lifetime2] = param2;
            var10[5].field_y[-var12Lifetime3 - (-var9 + 1 - var9 * var11Lifetime2)] = param2;
            var10[1].field_y[var12Lifetime3 * param4 + var11Lifetime2] = param8;
            var10[3].field_y[var11Lifetime2 * var9 + var12Lifetime3] = param8;
          }
        }
        if (param5 != -1481) {
          return (ut[]) null;
        }
        for (var11Lifetime3 = 0; param4 >> 1 > var11Lifetime3; var11Lifetime3++) {
          for (var12Lifetime4 = 0; var12Lifetime4 < param1; var12Lifetime4++) {
            var10[1].field_y[(var9 - var12Lifetime4 - 1) * param4 + var11Lifetime3] = param7;
            var10[3].field_y[var9 - 1 + (-var12Lifetime4 + var9 * var11Lifetime3)] = param7;
            var10[7].field_y[var12Lifetime4 * param4 + var11Lifetime3] = param7;
            var10[5].field_y[var9 * var11Lifetime3 + var12Lifetime4] = param7;
          }
        }
        return var10;
    }

    q(tf param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        lk var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_a = 0;
        try {
          this.field_g = new lk[param0.a(false)];
          var2_int = 0;
          var3 = (lk) (param0.g(24009));
          while (var3 != null) {
            var3.c((byte) -109);
            incrementValue$2 = var2_int;
            var2_int++;
            this.field_g[incrementValue$2] = var3;
            var3 = (lk) (param0.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("q.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_e = new int[7];
        field_h = new String[]{"Amateur", "Pebble Playoffs", "Cobalt Conference", "Sandstone Series", "Quartz Qualifiers", "Crystal Circuit", "Diamond Division"};
        field_f = "Stats";
        field_e[5] = 11;
        field_e[2] = 8;
        field_e[4] = 10;
        field_e[6] = 19;
        field_e[1] = 7;
        field_e[0] = 6;
        field_e[3] = 9;
        field_c = "Username: ";
    }
}
