/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends uf {
    String[][] field_p;
    static int field_k;
    boolean field_m;
    int field_s;
    static int field_i;
    long[][] field_l;
    static String[] field_o;
    static String field_h;
    static int field_r;
    int field_n;
    int field_j;
    int[][] field_q;

    public static void c(int param0) {
        try {
          field_h = null;
          field_o = null;
          if (param0 <= 80) {
            field_r = 88;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "nd.B(" + param0 + ')');
        }
    }

    final static void a(ee param0, boolean param1, int[] param2, int param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_62_0Lifetime1;
        int stackIn_62_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var24Lifetime1Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        var30 = Terraphoenix.field_V;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param2[3] >> 2;
          var22 = param2[4] >> 2;
          var23 = param2[5] >> 2;
          var24 = param2[6] >> 2;
          var25 = param2[7] >> 2;
          if (param3 <= 34) {
            nd.c((byte) -54);
          }
          var26 = param2[8] >> 2;
          var27 = param2[9] >> 2;
          var28 = param2[10] >> 2;
          var12 = param5[3] * var21 - (-(var22 * param5[4]) - var23 * param5[5]) >> 14;
          var13 = var26 * param5[5] + (param5[3] * var24 + param5[4] * var25) >> 14;
          var29 = param2[11] >> 2;
          var15 = var22 * param5[7] + param5[6] * var21 + var23 * param5[8] >> 14;
          var19 = param5[10] * var25 + (var24 * param5[9] + param5[11] * var26) >> 14;
          var17 = param5[6] * var27 + (param5[7] * var28 + param5[8] * var29) >> 14;
          var20 = var28 * param5[10] + param5[9] * var27 + param5[11] * var29 >> 14;
          var16 = param5[8] * var26 + param5[6] * var24 + param5[7] * var25 >> 14;
          var18 = var23 * param5[11] + (param5[9] * var21 + param5[10] * var22) >> 14;
          var14 = var28 * param5[4] + var27 * param5[3] + param5[5] * var29 >> 14;
          var21Lifetime1 = -param2[0] + param5[0];
          var22Lifetime1 = -param2[1] + param5[1];
          var23Lifetime1 = -param2[2] + param5[2];
          var9 = var22Lifetime1 * param2[4] + param2[3] * var21Lifetime1 + param2[5] * var23Lifetime1 >> -hb.field_l + 16;
          var11 = param2[10] * var22Lifetime1 + (param2[9] * var21Lifetime1 + var23Lifetime1 * param2[11]) >> 16;
          var10 = var22Lifetime1 * param2[7] + var21Lifetime1 * param2[6] + var23Lifetime1 * param2[8] >> 16 - hb.field_l;
          var21Lifetime2 = ob.field_b;
          var22Lifetime2 = ob.field_c;
          var23Lifetime2 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param0.field_m) {
              var24Lifetime1 = param0.field_D[var23Lifetime2];
              var25Lifetime1 = param0.field_B[var23Lifetime2];
              var26Lifetime1 = param0.field_L[var23Lifetime2];
              var27Lifetime1 = var9 + (var18 * var26Lifetime1 + (var15 * var25Lifetime1 + var12 * var24Lifetime1) >> 16 - hb.field_l);
              var28Lifetime1 = var10 + (var24Lifetime1 * var13 + (var16 * var25Lifetime1 + var19 * var26Lifetime1) >> 16 - hb.field_l);
              var29Lifetime1 = (var20 * var26Lifetime1 + (var25Lifetime1 * var17 + var14 * var24Lifetime1) >> 16) + var11;
              stackIn_62_0 = -51;
              stackIn_62_1 = ~var29Lifetime1;
              if (var30 != 0) {
                if (stackIn_62_0 < stackIn_62_1) {
                  stackIn_71_0 = ~ph.field_m.length;
                  stackIn_71_1 = ~var18;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_62_0 < stackIn_62_1) {
                  gd.field_e[var23Lifetime2] = -2147483648;
                } else {
                  gm.field_l[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  nb.field_c[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  gd.field_e[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                }
                if (param6) {
                  ld.field_h[var23Lifetime2] = var27Lifetime1 >> hb.field_l;
                  jl.field_A[var23Lifetime2] = var28Lifetime1 >> hb.field_l;
                  qa.field_a[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledFrameCompleted0 = true;
              if (null != param0.field_Q &&
                param0.field_i != null &&
                param0.field_w != null &&
                param0.field_c != null &&
                null != param0.field_e &&
                param0.field_q != null &&
                param0.field_O != null &&
                null != param0.field_d &&
                param0.field_b != null) {
                var23Lifetime2 = 0;
                while (!(param0.field_l <= var23Lifetime2)) {
                  var24Lifetime1Lifetime1 = param0.field_Q[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_i[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_w[var23Lifetime2];
                  ec.field_a[var23Lifetime2] = var9 + (var12 * var24Lifetime1Lifetime1 + var15 * var25Lifetime1Lifetime1 + var18 * var26Lifetime1Lifetime1 >> 16);
                  dl.field_f[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + (var24Lifetime1Lifetime1 * var13 + var25Lifetime1Lifetime1 * var16) >> 16) + var10;
                  lm.field_a[var23Lifetime2] = (var26Lifetime1Lifetime1 * var20 + (var14 * var24Lifetime1Lifetime1 + var25Lifetime1Lifetime1 * var17) >> 16) + var11;
                  var24Lifetime1Lifetime1 = param0.field_c[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_e[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_q[var23Lifetime2];
                  ad.field_u[var23Lifetime2] = (var24Lifetime1Lifetime1 * var12 - (-(var15 * var25Lifetime1Lifetime1) - var18 * var26Lifetime1Lifetime1) >> 16) + var9;
                  nf.field_f[var23Lifetime2] = var10 + (var24Lifetime1Lifetime1 * var13 + var16 * var25Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var19 >> 16);
                  hj.field_J[var23Lifetime2] = (var17 * var25Lifetime1Lifetime1 + var24Lifetime1Lifetime1 * var14 + var26Lifetime1Lifetime1 * var20 >> 16) + var11;
                  var24Lifetime1Lifetime1 = param0.field_O[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param0.field_d[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param0.field_b[var23Lifetime2];
                  hl.field_c[var23Lifetime2] = (var25Lifetime1Lifetime1 * var15 + (var24Lifetime1Lifetime1 * var12 + var26Lifetime1Lifetime1 * var18) >> 16) + var9;
                  pj.field_a[var23Lifetime2] = (var19 * var26Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var16 + var24Lifetime1Lifetime1 * var13) >> 16) + var10;
                  t.field_a[var23Lifetime2] = (var26Lifetime1Lifetime1 * var20 + var24Lifetime1Lifetime1 * var14 + var25Lifetime1Lifetime1 * var17 >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0 = (param1))) {
                var9 = param5[3];
                var10 = param5[4];
                var11 = param5[5];
                var12 = param5[6];
                var13 = param5[7];
                var14 = param5[8];
                var15 = param5[9];
                var16 = param5[10];
                var17 = param5[11];
              }
              if (decompiledFrameRemainder0) {
                var18 = 0;
                while (true) {
                  stackIn_62_0Lifetime1 = var18;
                  stackIn_62_1Lifetime1 = param0.field_o;
                  if (stackIn_62_0Lifetime1 >= stackIn_62_1Lifetime1) {
                    break;
                  }
                  stackIn_71_0 = ~ph.field_m.length;
                  stackIn_71_1 = ~var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_71_0 >= stackIn_71_1) {
                    break;
                  }
                  var19 = param0.field_j[var18];
                  var20 = param0.field_P[var18];
                  var21Lifetime2 = param0.field_u[var18];
                  ph.field_m[var18] = var15 * var21Lifetime2 + (var20 * var12 + var9 * var19) >> 16;
                  k.field_e[var18] = var16 * var21Lifetime2 + var20 * var13 + var19 * var10 >> 16;
                  mg.field_p[var18] = var21Lifetime2 * var17 + var14 * var20 + var11 * var19 >> 16;
                  var18++;
                }
              }
            }
            stackIn_71_0 = var8;
            stackIn_71_1 = param4 ? 1 : 0;
            break;
          }
          ld.a(stackIn_71_0, stackIn_71_1 != 0, param0, var7_int, (byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_76_0 = var7;
          stackIn_76_1 = new StringBuilder().append("nd.C(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void c(byte param0) {
        vc.field_c = je.a(param0 ^ -16);
        jl.field_I = new d();
        if (param0 != -11) {
          return;
        }
        try {
          qc.a(true, true, 106);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "nd.E(" + param0 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 123) {
            field_o = (String[]) null;
          }
          stackIn_16_0 = ((!(param0 < 65) &&
            !(90 < param0)) ||
            (!(param0 < 97) &&
            !(param0 > 122)));
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "nd.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        String var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          if (!qi.field_b) {
            throw new IllegalStateException();
          }
          if (nb.field_b != null) {
            nb.field_b.h((byte) -126);
          }
          var1 = lk.c(-62);
          mb.field_s = new uh(var1, (String) null, true, false, false);
          var2 = -47 % ((-58 - param0) / 40);
          jl.field_I.a((gl) (bj.field_f), (byte) -1);
          bj.field_f.a(mb.field_s, -67);
          bj.field_f.j(-2065096856);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "nd.D(" + param0 + ')');
        }
    }

    nd() {
    }

    static {
        field_o = new String[]{"Equipment screen", "Select equipment group", "Equip buttons", "Soldier tabs", "Recruit button", "Primary weapon", "Armour", "Secondary weapon", "Grenades", "Portrait", "Health", "Speed", "Strength", "Firing accuracy", "Exit to mission select screen.", "On this screen you give your soldiers the latest equipment to fight the enemy. Take note of the strength bar, if it starts flashing, then the soldier is encumbered lowering their movement speed. Try giving the soldier smaller or fewer weapons. The basic pistol and jacket weigh nothing."};
        field_h = "Exit Equip Screen";
    }
}
