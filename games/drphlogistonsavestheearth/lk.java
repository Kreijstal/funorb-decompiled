/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk extends u {
    private long field_g;
    static String field_n;
    static he[] field_m;
    static String[] field_i;
    static volatile boolean field_j;
    static he field_k;
    static String field_l;
    private String field_h;

    final static int[] c(byte param0) {
        if (param0 != 8) {
          field_j = false;
        }
        return new int[8];
    }

    final static vj a(boolean param0, boolean param1, int param2, int param3, int param4) {
        if (param4 != 8) {
          field_k = (he) null;
        }
        return na.a(param1, param2, false, param0, true, param3);
    }

    db b(byte param0) {
        if (param0 != -98) {
          this.field_g = -35L;
        }
        return si.field_A;
    }

    final static void b(int param0) {
        qg.a(true, bg.field_q, ol.field_j, (byte) -11);
        hl.field_b = true;
        if (param0 != 1) {
          lk.c((byte) -37);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_n = null;
        field_i = null;
        field_k = null;
        field_m = null;
        if (param0 != -27996) {
          field_k = (he) null;
        }
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
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
        int var15 = 0;
        od var16 = null;
        od var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var16 = new od(param0);
          var17 = var16;
          var17.field_j = -2 + param0.length;
          bd.field_M = var17.j(-788751192);
          vi.field_b = new int[bd.field_M];
          a.field_e = new byte[bd.field_M][];
          bd.field_O = new boolean[bd.field_M];
          ll.field_o = new byte[bd.field_M][];
          kh.field_i = new int[bd.field_M];
          qa.field_J = new int[bd.field_M];
          gf.field_o = new int[bd.field_M];
          var17.field_j = -(bd.field_M * 8) + (-7 + param0.length);
          oe.field_b = var17.j(-788751192);
          ih.field_K = var17.j(-788751192);
          var3 = (var17.l(31760) & 255) + 1;
          for (var4 = 0; bd.field_M > var4; var4++) {
            kh.field_i[var4] = var16.j(-788751192);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < bd.field_M; var4Lifetime1++) {
            vi.field_b[var4Lifetime1] = var17.j(-788751192);
          }
          var5 = 35 % ((param1 + 12) / 63);
          for (var4Lifetime2 = 0; bd.field_M > var4Lifetime2; var4Lifetime2++) {
            gf.field_o[var4Lifetime2] = var17.j(-788751192);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < bd.field_M; var4Lifetime3++) {
            qa.field_J[var4Lifetime3] = var17.j(-788751192);
          }
          var17.field_j = -(3 * var3) + (3 + (-7 + param0.length) - bd.field_M * 8);
          aj.field_a = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            aj.field_a[var4Lifetime4] = var17.g(-1);
            if (aj.field_a[var4Lifetime4] == 0) {
              aj.field_a[var4Lifetime4] = 1;
            }
          }
          var17.field_j = 0;
          for (var4Lifetime5 = 0; bd.field_M > var4Lifetime5; var4Lifetime5++) {
            var5Lifetime1 = gf.field_o[var4Lifetime5];
            var6 = qa.field_J[var4Lifetime5];
            var7 = var5Lifetime1 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            a.field_e[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ll.field_o[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.l(31760);
            stackIn_23_0 = -1;
            stackIn_23_1 = ~(1 & var11);
            if (stackIn_23_0 == stackIn_23_1) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.n(-98);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.n(98);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_32_0 = var10;
                  if (var13 == -1) {
                    stackIn_33_1 = 0;
                  } else {
                    stackIn_33_1 = 1;
                  }
                  var10 = stackIn_32_0 | stackIn_33_1;
                }
              }
            } else {
              for (var12 = 0; var5Lifetime1 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5Lifetime1 + var12] = var17.n(-88);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5Lifetime1 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.n(99);
                    var9[var13 * var5Lifetime1 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (-1 == var14) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            bd.field_O[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("lk.O(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(od param0, int param1) {
        if (param1 <= 19) {
          return;
        }
        try {
          param0.a(this.field_g, (byte) 127);
          param0.b(1, this.field_h);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "lk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    lk(long param0, String param1) {
        try {
          this.field_g = param0;
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "lk.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Connection restored.";
        field_j = false;
        field_l = "Use this alternative as your account name";
    }
}
