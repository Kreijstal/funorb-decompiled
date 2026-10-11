/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static bd[] field_g;
    static int[] field_d;
    static String field_a;
    static String field_f;
    static int field_e;
    static bd field_c;
    static int field_b;

    final static bd[] a(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        bd[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var1 = new bd[sc.field_c];
        for (var2 = 0; var2 < sc.field_c; var2++) {
          var3 = hd.field_r[var2] * sf.field_X[var2];
          var21 = ja.field_e[var2];
          if (!qj.field_k[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = bf.field_d[ua.a((int) var21[var6], 255)];
            }
            var1[var2] = new bd(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], var22);
          } else {
            var15 = vh.field_a[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = ll.a(ua.a(-16777216, var15[var7] << 24), bf.field_d[ua.a((int) var21[var7], 255)]);
            }
            var1[var2] = (bd) ((Object) new gk(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], var17));
          }
        }
        if (param0 != 26627) {
          qa.a(-20, 98);
        }
        uj.d(param0 ^ -26740);
        return var1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var16 = 0;
        int var17 = 0;
        int var28 = 0;
        int var29 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        boolean[] var13 = null;
        boolean[] var14 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        bd var27 = null;
        int var30 = 0;
        String var31 = null;
        int[] var33 = null;
        int[] var35 = null;
        int[] var37 = null;
        int var20Lifetime1;
        int var25Lifetime1;
        int var25Lifetime1Lifetime1;
        int var25Lifetime1Lifetime2;
        int var25Lifetime1Lifetime3;
        int var25Lifetime1Lifetime4;
        int var25Lifetime1Lifetime5;
        int var25Lifetime1Lifetime6;
        int var25Lifetime1Lifetime7;
        int var25Lifetime1Lifetime8;
        var30 = HostileSpawn.field_I ? 1 : 0;
        try {
          var10 = uj.field_p.field_e;
          if (param1 <= 13) {
            var31 = (String) null;
            qa.a(true, (byte) -106, (String) null);
          }
          var11 = uj.field_p.field_g;
          var35 = ln.field_a.field_y;
          var33 = var35;
          var12 = var33;
          var13 = ln.field_a.field_B;
          var14 = ln.field_a.field_r;
          var37 = ln.field_a.field_o;
          for (var16 = param2; param4 >= var16; var16++) {
            var7_int = param5 * var16 + param0;
            var9 = var16 * 24 - var11;
            for (var17 = param0; param3 >= var17; var17++) {
              var8 = var17 * 24 - var10;
              var7_int++;
              var18 = sa.a((byte) -128, var7_int);
              var19 = var37[var7_int];
              var20 = 250 - var18 * 10;
              var23 = var18;
              var22 = var18;
              var21 = var18;
              var24 = var18;
              if (r.field_a != 0 &&
                var19 < 0) {
                var25 = ee.a(var18, -param5 + var7_int - 1, false);
                var21 = var21 + var25;
                var25 = ee.a(var18, var7_int + 0 - param5, false);
                var22 = var22 + var25;
                var21 = var21 + var25;
                var25 = ee.a(var18, 1 + (var7_int - param5), false);
                var22 = var22 + var25;
                var25 = ee.a(var18, -1 + var7_int, false);
                var23 = var23 + var25;
                var21 = var21 + var25;
                var25 = ee.a(var18, 1 + var7_int, false);
                var22 = var22 + var25;
                var24 = var24 + var25;
                var25 = ee.a(var18, var7_int + (-1 + param5), false);
                var23 = var23 + var25;
                var25 = ee.a(var18, param5 + var7_int - 0, false);
                var23 = var23 + var25;
                var24 = var24 + var25;
                var25 = ee.a(var18, param5 + (1 + var7_int), false);
                var24 = var24 + var25;
              } else {
                var25 = sa.a((byte) -128, var7_int - (1 + param5));
                var21 = var21 + var25;
                var25 = sa.a((byte) -126, -param5 + (var7_int - 0));
                var22 = var22 + var25;
                var21 = var21 + var25;
                var25 = sa.a((byte) -121, 1 + var7_int - param5);
                var22 = var22 + var25;
                var25 = sa.a((byte) -113, -1 + var7_int);
                var23 = var23 + var25;
                var21 = var21 + var25;
                var25 = sa.a((byte) -105, 1 + var7_int);
                var22 = var22 + var25;
                var24 = var24 + var25;
                var25 = sa.a((byte) -111, param5 + (var7_int - 1));
                var23 = var23 + var25;
                var25 = sa.a((byte) -117, 0 + var7_int + param5);
                var24 = var24 + var25;
                var23 = var23 + var25;
                var25 = sa.a((byte) -127, param5 + var7_int + 1);
                var24 = var24 + var25;
              }
              var21 = var21 >> 2;
              var22 = var22 >> 2;
              var24 = var24 >> 2;
              var23 = var23 >> 2;
              var21 = var21 * 10;
              var23 = var23 * 10;
              var22 = var22 * 10;
              var24 = var24 * 10;
              var27 = pi.field_a[2];
              if (var35[var7_int] >= 9 &&
                var35[var7_int] <= 13 ||
                var35[var7_int] >= 16 &&
                17 >= var35[var7_int] ||
                var35[var7_int] >= 22 &&
                var35[var7_int] <= 23 ||
                var35[var7_int] >= 30 &&
                var35[var7_int] <= 31 ||
                var35[var7_int] >= 38 &&
                39 >= var35[var7_int]) {
                var27 = fa.field_d[var35[var7_int]];
              }
              if (var21 <= 0 &&
                var22 <= 0 &&
                var23 <= 0 &&
                var24 <= 0) {
                si.a(var8, var9, 24, 24, 0, 255);
              } else if (var22 == var21 &&
                var21 == var23 &&
                var24 == var21) {
                si.a(var8, var9, 24, 24, 0, 256 - var21);
              } else {
                eh.a(var8, var9, var21, var22, var23, var24);
              }
              L14: {
                if (var19 >= 0 &&
                  ak.field_b[var19].field_a > 0) {
                  if (r.field_a != 0) {
                    break L14;
                  }
                  break L14;
                }
                if (!var13[var7_int] &&
                  rl.field_c >= 0 &&
                  rl.field_c <= 2 &&
                  bm.field_c == 0) {
                  if ((rl.field_c != 2 ||
                    var35[var7_int] == 0) &&
                    (var12[-1 + var7_int] == 0 &&
                    var12[1 + var7_int] == 0 &&
                    var12[var7_int - param5] == 0 &&
                    var12[var7_int + param5] == 0 &&
                    0 == var12[-1 + (var7_int - param5)] &&
                    0 == var12[var7_int + 1 - param5] &&
                    0 == var12[var7_int + param5 - 1] &&
                    var12[-param5 + 1 + var7_int] == 0)) {
                    break L14;
                  }
                  if (var18 != 0) {
                    break L14;
                  }
                  stackIn_72_0 = (var12[-param5 + (-1 + var7_int)] != 0) ? -25 : 25;
                  var25Lifetime1 = stackIn_72_0;
                  var24 = var18;
                  var22 = var18;
                  var23 = var18;
                  var21 = var18;
                  var21 = var21 + var25Lifetime1;
                  stackIn_75_0 = (var12[var7_int - 0 - param5] == 0) ? 25 : -25;
                  var25Lifetime1Lifetime1 = stackIn_75_0;
                  var22 = var22 + var25Lifetime1Lifetime1;
                  var21 = var21 + var25Lifetime1Lifetime1;
                  stackIn_78_0 = (var12[1 + (var7_int - param5)] == 0) ? 25 : -25;
                  var25Lifetime1Lifetime2 = stackIn_78_0;
                  var22 = var22 + var25Lifetime1Lifetime2;
                  stackIn_81_0 = (var12[-1 + var7_int] == 0) ? 25 : -25;
                  var25Lifetime1Lifetime3 = stackIn_81_0;
                  var23 = var23 + var25Lifetime1Lifetime3;
                  var21 = var21 + var25Lifetime1Lifetime3;
                  stackIn_84_0 = (var12[1 + var7_int] == 0) ? 25 : -25;
                  var25Lifetime1Lifetime4 = stackIn_84_0;
                  var24 = var24 + var25Lifetime1Lifetime4;
                  var22 = var22 + var25Lifetime1Lifetime4;
                  stackIn_87_0 = (var12[var7_int - (1 - param5)] == 0) ? 25 : -25;
                  var25Lifetime1Lifetime5 = stackIn_87_0;
                  var23 = var23 + var25Lifetime1Lifetime5;
                  stackIn_90_0 = (var12[0 + var7_int + param5] != 0) ? -25 : 25;
                  var25Lifetime1Lifetime6 = stackIn_90_0;
                  var24 = var24 + var25Lifetime1Lifetime6;
                  var23 = var23 + var25Lifetime1Lifetime6;
                  stackIn_93_0 = (0 == var12[var7_int + 1 + param5]) ? 25 : -25;
                  var25Lifetime1Lifetime7 = stackIn_93_0;
                  var24 = var24 + var25Lifetime1Lifetime7;
                  var23 = var23 >> 2;
                  var22 = var22 >> 2;
                  var21 = var21 >> 2;
                  var24 = var24 >> 2;
                  if (0 > var22) {
                    var22 = 0;
                  }
                  if (var23 < 0) {
                    var23 = 0;
                  }
                  if (var21 < 0) {
                    var21 = 0;
                  }
                  var21 = 250 - var21 * 10;
                  var22 = 250 - 10 * var22;
                  var23 = -(var23 * 10) + 250;
                  if (var24 < 0) {
                    var24 = 0;
                  }
                  var24 = 250 - var24 * 10;
                  if (var21 == var22 &&
                    var23 == var21 &&
                    var24 == var21) {
                    si.a(var8, var9, 24, 24, 0, var21);
                  } else {
                    for (var28 = 0; var28 < 24; var28 += 6) {
                      var26 = (24 - var28) * var23 + var28 * var24 >> 4;
                      var25Lifetime1Lifetime8 = var21 * (24 - var28) + var22 * var28 >> 4;
                      for (var29 = 0; 24 > var29; var29 += 6) {
                        var20Lifetime1 = (24 - var29) * var25Lifetime1Lifetime8 + var26 * var29 >> 4;
                        si.a(var8 + var28, var29 + var9, 6, 6, 0, var20Lifetime1);
                      }
                    }
                  }
                  break L14;
                }
                if (var21 == 0 &&
                  var22 == 0 &&
                  0 == var23 &&
                  var24 == 0 && (var13[var7_int] ||
                  var14[var7_int])) {
                  var27.a(var8, var9, 24, 24);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var7), "qa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        if (param1 != -1) {
          qa.a(-95, 16, -125, 100, -24, -56, 98);
        }
        param0 = param0 | param0 >>> 16;
        return 1 + param0;
    }

    final static void a(boolean param0, byte param1, String param2) {
        try {
          md.field_i = param0;
          eh.field_e = true;
          if (param1 > -19) {
            field_b = -46;
          }
          jj.field_d = new dg(im.field_e, pe.field_eb, param2, li.field_o, md.field_i);
          im.field_e.c(jj.field_d, 101);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "qa.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        if (-tk.field_d + 0 != tk.field_e &&
          tk.field_e != 250 - tk.field_d) {
        }
        tk.field_e = tk.field_e + 1;
        if (!param0) {
          int[] var2 = (int[]) null;
          qa.a((int[]) null, -44, true);
        }
    }

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        field_g = null;
        field_f = null;
        field_c = null;
        if (!param0) {
          field_g = (bd[]) null;
        }
    }

    final static boolean a(int[] param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            qa.a(true);
          }
          stackIn_5_0 = (0 == (param0[param1 >> 5] & 1 << (31 & param1)));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qa.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "If I find whoever is leaving all these crates here ...";
        field_b = 0;
    }
}
