/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends RuntimeException {
    private static int field_k;
    static int field_b;
    static id field_a;
    static int field_e;
    static String field_d;
    static int field_h;
    static int[] field_g;
    String field_i;
    Throwable field_c;
    static long[] field_f;
    static boolean field_j;

    final static void a(boolean param0, byte param1) {
        if (param1 != 80) {
          return;
        }
        if (oj.c(param1 ^ 48)) {
          param0 = false;
        }
        jk.a(param0, 118);
        if (ji.field_f) {
          qh.g(na.field_e.field_i.field_qb, na.field_e.field_i.field_eb, na.field_e.field_i.field_gb, na.field_e.field_i.field_Db);
          na.field_e.field_i.a((byte) -79, param0);
        }
        tl.d(param1 ^ -5, param0);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          byte[] var2 = (byte[]) null;
          oa.a(0, -103, 105, (byte[]) null);
        }
        field_d = null;
        field_a = null;
        field_f = null;
        field_g = null;
    }

    final static void a(boolean param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        ge var16 = null;
        ge var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        try {
          var16 = new ge(param1);
          var17 = var16;
          var17.field_v = -2 + param1.length;
          wf.field_d = var17.d(-1034);
          wg.field_Sb = new byte[wf.field_d][];
          rc.field_f = new int[wf.field_d];
          v.field_b = new byte[wf.field_d][];
          pd.field_a = new int[wf.field_d];
          el.field_I = new int[wf.field_d];
          ih.field_d = new int[wf.field_d];
          gg.field_d = new boolean[wf.field_d];
          var17.field_v = param1.length - 7 - wf.field_d * 8;
          vd.field_c = var17.d(-1034);
          tq.field_r = var17.d(-1034);
          var3 = (var17.g(-97) & 255) + 1;
          for (var4 = 0; wf.field_d > var4; var4++) {
            el.field_I[var4] = var16.d(-1034);
          }
          for (var4Lifetime1 = 0; wf.field_d > var4Lifetime1; var4Lifetime1++) {
            ih.field_d[var4Lifetime1] = var16.d(-1034);
          }
          for (var4Lifetime2 = 0; wf.field_d > var4Lifetime2; var4Lifetime2++) {
            pd.field_a[var4Lifetime2] = var16.d(-1034);
          }
          for (var4Lifetime3 = 0; wf.field_d > var4Lifetime3; var4Lifetime3++) {
            rc.field_f[var4Lifetime3] = var16.d(-1034);
          }
          var17.field_v = -(3 * (-1 + var3)) + (-(8 * wf.field_d) + (-7 + param1.length));
          ma.field_h = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            ma.field_h[var4Lifetime4] = var16.f(99);
            if (0 == ma.field_h[var4Lifetime4]) {
              ma.field_h[var4Lifetime4] = 1;
            }
          }
          var17.field_v = 0;
          if (!param0) {
            var15 = (byte[]) null;
            oa.a(true, (byte[]) null);
          }
          for (var4Lifetime5 = 0; wf.field_d > var4Lifetime5; var4Lifetime5++) {
            var5 = pd.field_a[var4Lifetime5];
            var6 = rc.field_f[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            v.field_b[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            wg.field_Sb[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.g(-121);
            if ((1 & var11) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var16.e((byte) 105);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$0 = var16.e((byte) 105);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_48_0 = var10;
                  if (-1 == var13) {
                    stackIn_49_1 = 0;
                  } else {
                    stackIn_49_1 = 1;
                  }
                  var10 = stackIn_48_0 | stackIn_49_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var16.e((byte) 105);
                }
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var16.e((byte) 105);
                    var9[var12 + var13 * var5] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_36_0 = var10;
                    if (var14 == -1) {
                      stackIn_37_1 = 0;
                    } else {
                      stackIn_37_1 = 1;
                    }
                    var10 = stackIn_36_0 | stackIn_37_1;
                  }
                }
              }
            }
            gg.field_d[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("oa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -1;
          for (var5 = param0; var5 < param1; var5++) {
            var4_int = var4_int >>> 8 ^ fo.field_e[255 & (var4_int ^ param3[var5])];
          }
          var4_int = var4_int ^ param2;
          stackIn_4_0 = var4_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("oa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, pn param1) {
        int dupTemp$4 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$3 = 0;
        pn[] fieldTemp$1 = null;
        int fieldTemp$2 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            g.field_l[var2_int] = 0;
          }
          if (param0 > -30) {
            oa.a(-9);
          }
          for (var2_intLifetime1 = 0; aa.field_e > var2_intLifetime1; var2_intLifetime1++) {
            if (param1.field_p == wb.field_e[var2_intLifetime1].field_p) {
              dupTemp$4 = wb.field_e[var2_intLifetime1].b(14842);
              g.field_l[dupTemp$4] = g.field_l[dupTemp$4] + 1;
            }
          }
          dupTemp$0 = param1.b(14842);
          g.field_l[dupTemp$0] = g.field_l[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < aa.field_e; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (wb.field_e[var3].field_p == param1.field_p) {
              var4 = wb.field_e[var3].b(14842);
              if (g.field_l[var4] > ap.field_E) {
                g.field_l[var4] = g.field_l[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$3 = var2_intLifetime2;
              var2_intLifetime2++;
              wb.field_e[incrementValue$3] = wb.field_e[var3];
            }
          }
          aa.field_e = var2_intLifetime2;
          fieldTemp$1 = wb.field_e;
          fieldTemp$2 = aa.field_e;
          aa.field_e = aa.field_e + 1;
          fieldTemp$1[fieldTemp$2] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("oa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    oa(Throwable param0, String param1) {
        this.field_c = param0;
        this.field_i = param1;
    }

    static {
        field_k = 9;
        field_b = 1 << field_k;
        field_f = new long[32];
        field_d = null;
        field_j = false;
    }
}
