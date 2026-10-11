/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn extends IOException {
    static String field_a;
    static ve field_b;
    static r field_c;

    final static boolean a(int param0, int[] param1) {
        boolean stackIn_38_0 = false;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        tc var4_ref_tc = null;
        int var4 = 0;
        int var5_int = 0;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          if (li.field_a != qi.field_p) {
            return false;
          }
          var2_long = k.a(0);
          if (param0 != -19161) {
            bn.a(-56, 104);
          }
          if (i.field_f != 0 &&
            ti.field_e < 0) {
            var4_ref_tc = (tc) (v.field_z.c(false));
            if (null != var4_ref_tc &&
              var4_ref_tc.field_r < var2_long) {
              var4_ref_tc.b(false);
              rl.field_d = var4_ref_tc.field_o.length;
              kb.field_q.field_t = 0;
              var5_int = 0;
              do {
                if (!(rl.field_d > var5_int)) {
                  mh.field_g = lk.field_sb;
                  lk.field_sb = md.field_A;
                  md.field_A = ua.field_c;
                  ua.field_c = var4_ref_tc.field_u;
                  break;
                }
                kb.field_q.field_u[var5_int] = var4_ref_tc.field_o[var5_int];
                var5_int++;
              } while (var7 == 0);
              return true;
            }
          }
          L5: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (ti.field_e < 0) {
              kb.field_q.field_t = 0;
              stackIn_38_0 = en.b(97, 1);
              decompiledFrameRemainder0 = (var7 == 0);
              if (decompiledFrameRemainder0) {
                if (!stackIn_38_0) {
                  return false;
                }
                ti.field_e = kb.field_q.d(false);
                kb.field_q.field_t = 0;
                rl.field_d = param1[ti.field_e];
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_38_0 = ua.b(-73);
            }
            if (!stackIn_38_0) {
              return false;
            }
            if (i.field_f != 0) {
              var4 = i.field_f;
              if (0.0 != jg.field_f) {
                var4 = (int)((double)var4 + ca.field_i.nextGaussian() * jg.field_f);
                if (var4 < 0) {
                  var4 = 0;
                }
              }
              var5 = new tc(var2_long + (long)var4, ti.field_e, new byte[rl.field_d]);
              var6 = 0;
              while (true) {
                if (var6 < rl.field_d) {
                  var5.field_o[var6] = kb.field_q.field_u[var6];
                  var6++;
                  if (var7 == 0) {
                    continue;
                  }
                } else {
                  v.field_z.a(var5, false);
                  ti.field_e = -1;
                }
                break;
              }
              if (var7 == 0) {
                continue L5;
              }
            }
            break;
          }
          mh.field_g = lk.field_sb;
          lk.field_sb = md.field_A;
          md.field_A = ua.field_c;
          ua.field_c = ti.field_e;
          ti.field_e = -1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_61_0 = var2;
          stackIn_61_1 = new StringBuilder().append("bn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    bn(String param0) {
        super(param0);
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 21747) {
            bn.a(-95, 3, (int[]) null, -127, 20, (int[]) null, (kc) null, 45, (int[]) null, -111, -45, (int[]) null, (int[]) null, 93, -71, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 104, (byte[]) null, (int[]) null);
          }
          stackIn_4_0 = mb.field_u.a(param0 - 21738);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bn.E(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 0) {
            stackIn_7_0 = ((param1 + 1) % 4 == 0);
            return stackIn_7_0;
          }
          if (1582 > param1) {
            stackIn_15_0 = (param1 % 4 == 0);
            return stackIn_15_0;
          }
          if (param1 % 4 != 0) {
            return false;
          }
          if (param1 % 100 != 0) {
            return true;
          }
          if (param1 % 400 != 0) {
            return false;
          }
          if (param0 != 1) {
            field_b = (ve) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "bn.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -26623) {
            field_c = (r) null;
          }
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bn.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int[] param5, kc param6, int param7, int[] param8, int param9, int param10, int[] param11, int[] param12, int param13, int param14, int[] param15, int[] param16, int[] param17, int[] param18, int[] param19, int[] param20, int param21, byte[] param22, int[] param23) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        byte[] fieldTemp$24 = null;
        short dupTemp$25 = 0;
        short dupTemp$26 = 0;
        short dupTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        int fieldTemp$32 = 0;
        int fieldTemp$33 = 0;
        byte[] fieldTemp$34 = null;
        byte[] fieldTemp$35 = null;
        short[] fieldTemp$36 = null;
        byte[] fieldTemp$37 = null;
        byte[] fieldTemp$38 = null;
        byte[] fieldTemp$39 = null;
        short[] fieldTemp$40 = null;
        short[] fieldTemp$41 = null;
        int fieldTemp$42 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        int stackIn_98_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_249_1 = 0;
        RuntimeException stackIn_340_0 = null;
        StringBuilder stackIn_340_1 = null;
        String stackIn_341_2 = null;
        StringBuilder stackIn_344_1 = null;
        String stackIn_345_2 = null;
        StringBuilder stackIn_348_1 = null;
        String stackIn_349_2 = null;
        StringBuilder stackIn_352_1 = null;
        String stackIn_353_2 = null;
        StringBuilder stackIn_356_1 = null;
        String stackIn_357_2 = null;
        StringBuilder stackIn_360_1 = null;
        String stackIn_361_2 = null;
        StringBuilder stackIn_364_1 = null;
        String stackIn_365_2 = null;
        StringBuilder stackIn_368_1 = null;
        String stackIn_369_2 = null;
        StringBuilder stackIn_372_1 = null;
        String stackIn_373_2 = null;
        StringBuilder stackIn_376_1 = null;
        String stackIn_377_2 = null;
        StringBuilder stackIn_380_1 = null;
        String stackIn_381_2 = null;
        StringBuilder stackIn_384_1 = null;
        String stackIn_385_2 = null;
        StringBuilder stackIn_388_1 = null;
        String stackIn_389_2 = null;
        StringBuilder stackIn_392_1 = null;
        String stackIn_393_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var24_int = 0;
        int[] var24 = null;
        RuntimeException var24_ref = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int[] var54Lifetime1;
        int[] var54Lifetime2;
        int[] var54Lifetime3;
        int[] var54Lifetime4;
        int[] var54Lifetime5;
        int[] var54Lifetime1Lifetime1;
        int[] var54Lifetime1Lifetime2;
        int[] var54Lifetime2Lifetime1;
        int[] var54Lifetime2Lifetime2;
        int[] var54Lifetime2Lifetime3;
        int[] var54Lifetime3Lifetime1;
        int[] var54Lifetime3Lifetime2;
        int[] var54Lifetime3Lifetime3;
        int var33Lifetime1;
        int var33Lifetime2;
        int var33Lifetime3;
        int var34Lifetime1;
        int var38Lifetime1;
        int var59Lifetime1;
        int var59Lifetime2;
        int var60Lifetime1;
        int var60Lifetime2;
        int var61Lifetime1;
        int var61Lifetime2;
        int var62Lifetime1;
        int var62Lifetime2;
        int var63Lifetime1;
        int var63Lifetime2;
        int var24_intLifetime1;
        int var33Lifetime3Lifetime1;
        int var34Lifetime1Lifetime1;
        int var38Lifetime1Lifetime1;
        var65 = TetraLink.field_J;
        try {
          if (a.field_b == null ||
            !(param21 <= a.field_b.length)) {
            var24_int = 100 + param21;
            uj.field_q = new int[var24_int];
            a.field_b = new int[var24_int];
          }
          if (rl.field_c == null ||
            !(rl.field_c.length >= (param7 * 2))) {
            var24_intLifetime1 = 2 * param7 + 100;
            rl.field_c = new int[var24_intLifetime1];
            gm.field_b = new int[var24_intLifetime1];
          }
          var24 = a.field_b;
          if (lm.field_f == null) {
            lm.field_f = new int[16];
          }
          var25 = uj.field_q;
          var26 = lm.field_f;
          var27 = rl.field_c;
          mf.field_u = 0;
          var28 = gm.field_b;
          k.field_e = 0;
          fh.field_g = 0;
          le.field_Xb = 0;
          if (null == ic.field_c ||
            !(ic.field_c.length >= param21)) {
            ic.field_c = new int[param21 + 100];
            bd.field_a = new int[100 + param21];
            nn.field_S = new int[100 + param21];
          }
          if (null == ja.field_l ||
            !(ja.field_l.length >= param7)) {
            ja.field_l = new int[100 + param7];
            db.field_f = new int[param7 + 100];
            wk.field_b = new int[param7 + 100];
          }
          if (null != param18 && (mc.field_m == null ||
            !(mc.field_m.length >= param7))) {
            rk.field_b = new int[100 + param7];
            mc.field_m = new int[param7 + 100];
            tc.field_w = new int[100 + param7];
          }
          if (null == am.field_b ||
            !(param21 <= am.field_b.length)) {
            cm.field_q = new int[100 + param21];
            am.field_b = new int[100 + param21];
            gd.field_Zb = new int[param21 + 100];
          }
          if (null == ve.field_a ||
            !(ve.field_a.length >= param7)) {
            kj.field_d = new int[100 + param7];
            ve.field_a = new int[100 + param7];
            hd.field_D = new int[100 + param7];
          }
          if (null != param18 && (ga.field_b == null ||
            !(param7 <= ga.field_b.length))) {
            ga.field_b = new int[param7 + 100];
            fj.field_p = new int[param7 + 100];
            om.field_Yb = new int[param7 + 100];
          }
          var29 = 0;
          var30 = 0;
          var31 = 0;
          var33 = 0;
          while (param21 > var33) {
            var24[var33] = -1;
            var33++;
            if (var65 == 0) {
              continue;
            }
            break;
          }
          var32 = 0;
          if (param13 <= 18) {
            return;
          }
          var33Lifetime1 = 0;
          while (param21 > var33Lifetime1) {
            var25[var33Lifetime1] = -1;
            var33Lifetime1++;
            if (var65 == 0) {
              continue;
            }
            break;
          }
          var35 = 0;
          var36 = 0;
          var37 = 0;
          var38 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var38 >= param7))) {
            var39 = param2[var38];
            var40 = param23[var38];
            var41 = param20[var38];
            var42 = param12[var39];
            var43 = param5[var39];
            var44 = param11[var39];
            var45 = param12[var40];
            var46 = param5[var40];
            var47 = param11[var40];
            var48 = param12[var41];
            var49 = param5[var41];
            var50 = param11[var41];
            var51 = param3 * (-param14 + var44) + param4 * (-param1 + var42) + (-param0 + var43) * param9;
            var52 = param9 * (var46 - param0) + ((-param1 + var45) * param4 + param3 * (var47 - param14));
            var53 = param4 * (-param1 + var48) + param9 * (var49 - param0) + param3 * (-param14 + var50);
            stackIn_249_0 = ~(var53 | (var52 | var51));
            stackIn_249_1 = -1;
            if (var65 == 0) {
              if (stackIn_249_0 > stackIn_249_1) {
                if ((-var53 | (-var52 | -var51)) < 0) {
                  if (ic.field_c.length < (4 + (param21 + var29))) {
                    var54 = new int[param21 + var29 + 104];
                    rd.a(ic.field_c, 0, var54, 0, k.field_e);
                    ic.field_c = var54;
                    var54Lifetime4 = new int[var29 + (param21 + 104)];
                    rd.a(nn.field_S, 0, var54Lifetime4, 0, k.field_e);
                    nn.field_S = var54Lifetime4;
                    var54Lifetime5 = new int[104 + param21 + var29];
                    rd.a(bd.field_a, 0, var54Lifetime5, 0, k.field_e);
                    bd.field_a = var54Lifetime5;
                  }
                  if (am.field_b.length < (var31 + (param21 + 4))) {
                    var54Lifetime1 = new int[104 + param21 + var31];
                    rd.a(am.field_b, 0, var54Lifetime1, 0, mf.field_u);
                    am.field_b = var54Lifetime1;
                    var54Lifetime1Lifetime1 = new int[104 + param21 + var31];
                    rd.a(gd.field_Zb, 0, var54Lifetime1Lifetime1, 0, mf.field_u);
                    gd.field_Zb = var54Lifetime1Lifetime1;
                    var54Lifetime1Lifetime2 = new int[104 + (var31 + param21)];
                    rd.a(cm.field_q, 0, var54Lifetime1Lifetime2, 0, mf.field_u);
                    cm.field_q = var54Lifetime1Lifetime2;
                  }
                  var55 = k.field_e;
                  var56 = mf.field_u;
                  var57 = 0;
                  var58 = 0;
                  if (param22 == null) {
                    if (null == param17) {
                      var64 = 1;
                    } else {
                      if (param17[var38] != -1 &&
                        param17[var38] != -2) {
                        stackIn_98_0 = 1;
                      } else {
                        stackIn_98_0 = 0;
                      }
                      var64 = stackIn_98_0;
                    }
                  } else {
                    stackIn_105_0 = ((1 & param22[var38]) != 0) ? 0 : 1;
                    var64 = stackIn_105_0;
                  }
                  if (param18 != null) {
                    if (var64 != 0) {
                      var36 = 65535 & param8[var38];
                      var37 = 65535 & param17[var38];
                      var35 = param18[var38] & 65535;
                    } else {
                      var37 = param17[var38];
                      var36 = param8[var38];
                      var35 = param18[var38];
                    }
                  }
                  if (0 <= var51) {
                    var34 = var24[var39];
                    if (var34 < 0) {
                      incrementValue$0 = var55;
                      var55++;
                      var34 = incrementValue$0;
                      var24[var39] = incrementValue$0;
                      ic.field_c[var34] = var42;
                      nn.field_S[var34] = var43;
                      bd.field_a[var34] = var44;
                    }
                    var26[var57 + 0] = var34;
                    var26[8 + var57] = var35;
                    var57++;
                  }
                  if (0 >= var51) {
                    var34 = var25[var39];
                    if (var34 < 0) {
                      incrementValue$1 = var56;
                      var56++;
                      var34 = incrementValue$1;
                      var25[var39] = incrementValue$1;
                      am.field_b[var34] = var42;
                      gd.field_Zb[var34] = var43;
                      cm.field_q[var34] = var44;
                    }
                    var26[4 + var58] = var34;
                    var26[var58 + 12] = var35;
                    var58++;
                  }
                  if (var51 != 0 &&
                    var52 != 0 &&
                    (var52 ^ var51) < 0) {
                    var63 = -var51 + var52;
                    var61 = (var44 * var52 - var51 * var47) / var63;
                    incrementValue$2 = var55;
                    var55++;
                    var34 = incrementValue$2;
                    var60 = (var52 * var43 - var51 * var46) / var63;
                    var59 = (-(var51 * var45) + var42 * var52) / var63;
                    var62 = (var52 * var35 - var51 * var36) / var63;
                    ic.field_c[var34] = var59;
                    nn.field_S[var34] = var60;
                    bd.field_a[var34] = var61;
                    var26[0 + var57] = var34;
                    var26[var57 + 8] = var62;
                    var57++;
                    incrementValue$3 = var56;
                    var56++;
                    var34 = incrementValue$3;
                    am.field_b[var34] = var59;
                    gd.field_Zb[var34] = var60;
                    cm.field_q[var34] = var61;
                    var26[var58 + 4] = var34;
                    var26[12 + var58] = var62;
                    var58++;
                  }
                  if (var52 >= 0) {
                    var34 = var24[var40];
                    if (var34 < 0) {
                      incrementValue$4 = var55;
                      var55++;
                      var34 = incrementValue$4;
                      var24[var40] = incrementValue$4;
                      ic.field_c[var34] = var45;
                      nn.field_S[var34] = var46;
                      bd.field_a[var34] = var47;
                    }
                    var26[0 + var57] = var34;
                    var26[8 + var57] = var36;
                    var57++;
                  }
                  if (var52 <= 0) {
                    var34 = var25[var40];
                    if (var34 < 0) {
                      incrementValue$5 = var56;
                      var56++;
                      var34 = incrementValue$5;
                      var25[var40] = incrementValue$5;
                      am.field_b[var34] = var45;
                      gd.field_Zb[var34] = var46;
                      cm.field_q[var34] = var47;
                    }
                    var26[var58 + 4] = var34;
                    var26[12 + var58] = var36;
                    var58++;
                  }
                  if (0 != var52 &&
                    0 != var53 &&
                    (var52 ^ var53) < 0) {
                    var63Lifetime1 = -var52 + var53;
                    var59Lifetime1 = (var45 * var53 - var48 * var52) / var63Lifetime1;
                    var62Lifetime1 = (-(var52 * var37) + var53 * var36) / var63Lifetime1;
                    var60Lifetime1 = (var46 * var53 - var52 * var49) / var63Lifetime1;
                    var61Lifetime1 = (-(var50 * var52) + var47 * var53) / var63Lifetime1;
                    incrementValue$6 = var55;
                    var55++;
                    var34 = incrementValue$6;
                    ic.field_c[var34] = var59Lifetime1;
                    nn.field_S[var34] = var60Lifetime1;
                    bd.field_a[var34] = var61Lifetime1;
                    var26[0 + var57] = var34;
                    var26[var57 + 8] = var62Lifetime1;
                    var57++;
                    incrementValue$7 = var56;
                    var56++;
                    var34 = incrementValue$7;
                    am.field_b[var34] = var59Lifetime1;
                    gd.field_Zb[var34] = var60Lifetime1;
                    cm.field_q[var34] = var61Lifetime1;
                    var26[4 + var58] = var34;
                    var26[12 + var58] = var62Lifetime1;
                    var58++;
                  }
                  if (var53 >= 0) {
                    var34 = var24[var41];
                    if (var34 < 0) {
                      incrementValue$8 = var55;
                      var55++;
                      var34 = incrementValue$8;
                      var24[var41] = incrementValue$8;
                      ic.field_c[var34] = var48;
                      nn.field_S[var34] = var49;
                      bd.field_a[var34] = var50;
                    }
                    var26[0 + var57] = var34;
                    var26[8 + var57] = var37;
                    var57++;
                  }
                  if (var53 <= 0) {
                    var34 = var25[var41];
                    if (0 > var34) {
                      incrementValue$9 = var56;
                      var56++;
                      var34 = incrementValue$9;
                      var25[var41] = incrementValue$9;
                      am.field_b[var34] = var48;
                      gd.field_Zb[var34] = var49;
                      cm.field_q[var34] = var50;
                    }
                    var26[var58 + 4] = var34;
                    var26[var58 + 12] = var37;
                    var58++;
                  }
                  if (0 != (var51 | var53) &&
                    (var51 ^ var53) < 0) {
                    var63Lifetime2 = -var53 + var51;
                    var60Lifetime2 = (-(var53 * var43) + var51 * var49) / var63Lifetime2;
                    incrementValue$10 = var55;
                    var55++;
                    var34 = incrementValue$10;
                    var61Lifetime2 = (-(var53 * var44) + var50 * var51) / var63Lifetime2;
                    var62Lifetime2 = (-(var53 * var35) + var51 * var37) / var63Lifetime2;
                    var59Lifetime2 = (-(var53 * var42) + var51 * var48) / var63Lifetime2;
                    ic.field_c[var34] = var59Lifetime2;
                    nn.field_S[var34] = var60Lifetime2;
                    bd.field_a[var34] = var61Lifetime2;
                    var26[var57 + 0] = var34;
                    var26[8 + var57] = var62Lifetime2;
                    var57++;
                    incrementValue$11 = var56;
                    var56++;
                    var34 = incrementValue$11;
                    am.field_b[var34] = var59Lifetime2;
                    gd.field_Zb[var34] = var60Lifetime2;
                    cm.field_q[var34] = var61Lifetime2;
                    var26[var58 + 4] = var34;
                    var26[12 + var58] = var62Lifetime2;
                    var58++;
                  }
                  var29 = var29 + (-k.field_e + var55);
                  var33Lifetime2 = fh.field_g;
                  k.field_e = var55;
                  if (ja.field_l.length < (-2 + var57 + var30 + param7)) {
                    var54Lifetime2 = new int[param7 + var30 + (var57 + 98)];
                    rd.a(ja.field_l, 0, var54Lifetime2, 0, var33Lifetime2);
                    ja.field_l = var54Lifetime2;
                    var54Lifetime2Lifetime1 = new int[var57 + (param7 + var30) + 98];
                    rd.a(db.field_f, 0, var54Lifetime2Lifetime1, 0, var33Lifetime2);
                    db.field_f = var54Lifetime2Lifetime1;
                    var54Lifetime2Lifetime2 = new int[98 + var57 + (var30 + param7)];
                    rd.a(wk.field_b, 0, var54Lifetime2Lifetime2, 0, var33Lifetime2);
                    wk.field_b = var54Lifetime2Lifetime2;
                    if (null != param18) {
                      var54Lifetime2Lifetime3 = new int[98 + (var30 + (param7 + var57))];
                      rd.a(mc.field_m, 0, var54Lifetime2Lifetime3, 0, var33Lifetime2);
                      mc.field_m = var54Lifetime2Lifetime3;
                      var54Lifetime2Lifetime3 = new int[var30 + (param7 + var57 + 98)];
                      rd.a(tc.field_w, 0, var54Lifetime2Lifetime3, 0, var33Lifetime2);
                      tc.field_w = var54Lifetime2Lifetime3;
                      var54Lifetime2Lifetime3 = new int[98 + var57 + (var30 + param7)];
                      rd.a(rk.field_b, 0, var54Lifetime2Lifetime3, 0, var33Lifetime2);
                      rk.field_b = var54Lifetime2Lifetime3;
                    }
                  }
                  ja.field_l[var33Lifetime2] = var26[0];
                  db.field_f[var33Lifetime2] = var26[1];
                  wk.field_b[var33Lifetime2] = var26[2];
                  if (param18 != null) {
                    if (var64 == 0) {
                      mc.field_m[var33Lifetime2] = var35;
                      rk.field_b[var33Lifetime2] = var37;
                    } else {
                      mc.field_m[var33Lifetime2] = var26[8];
                      tc.field_w[var33Lifetime2] = var26[9];
                      rk.field_b[var33Lifetime2] = var26[10];
                    }
                  }
                  var27[var33Lifetime2++] = var38;
                  if (4 == var57) {
                    ja.field_l[var33Lifetime2] = var26[2];
                    db.field_f[var33Lifetime2] = var26[3];
                    wk.field_b[var33Lifetime2] = var26[0];
                    if (param18 != null) {
                      if (var64 != 0) {
                        mc.field_m[var33Lifetime2] = var26[10];
                        tc.field_w[var33Lifetime2] = var26[11];
                        rk.field_b[var33Lifetime2] = var26[8];
                      } else {
                        mc.field_m[var33Lifetime2] = var35;
                        rk.field_b[var33Lifetime2] = var37;
                      }
                    }
                    var30++;
                    var27[var33Lifetime2++] = var38;
                  }
                  fh.field_g = var33Lifetime2;
                  var31 = var31 + (-mf.field_u + var56);
                  mf.field_u = var56;
                  var33Lifetime2 = le.field_Xb;
                  if ((var58 + param7 - (-var32 + 2)) > ve.field_a.length) {
                    var54Lifetime3 = new int[var58 + (var32 + (param7 + 98))];
                    rd.a(ve.field_a, 0, var54Lifetime3, 0, var33Lifetime2);
                    ve.field_a = var54Lifetime3;
                    var54Lifetime3Lifetime1 = new int[98 + var58 + (param7 + var32)];
                    rd.a(hd.field_D, 0, var54Lifetime3Lifetime1, 0, var33Lifetime2);
                    hd.field_D = var54Lifetime3Lifetime1;
                    var54Lifetime3Lifetime2 = new int[param7 - (-var32 - var58) + 98];
                    rd.a(kj.field_d, 0, var54Lifetime3Lifetime2, 0, var33Lifetime2);
                    kj.field_d = var54Lifetime3Lifetime2;
                    if (null != param18) {
                      var54Lifetime3Lifetime3 = new int[param7 + var32 + (var58 + 98)];
                      rd.a(ga.field_b, 0, var54Lifetime3Lifetime3, 0, var33Lifetime2);
                      ga.field_b = var54Lifetime3Lifetime3;
                      var54Lifetime3Lifetime3 = new int[98 + var58 + (param7 + var32)];
                      rd.a(fj.field_p, 0, var54Lifetime3Lifetime3, 0, var33Lifetime2);
                      fj.field_p = var54Lifetime3Lifetime3;
                      var54Lifetime3Lifetime3 = new int[98 + (param7 + var32) + var58];
                      rd.a(om.field_Yb, 0, var54Lifetime3Lifetime3, 0, var33Lifetime2);
                      om.field_Yb = var54Lifetime3Lifetime3;
                    }
                  }
                  ve.field_a[var33Lifetime2] = var26[4];
                  hd.field_D[var33Lifetime2] = var26[5];
                  kj.field_d[var33Lifetime2] = var26[6];
                  if (null != param18) {
                    if (var64 != 0) {
                      ga.field_b[var33Lifetime2] = var26[12];
                      fj.field_p[var33Lifetime2] = var26[13];
                      om.field_Yb[var33Lifetime2] = var26[14];
                    } else {
                      ga.field_b[var33Lifetime2] = var35;
                      om.field_Yb[var33Lifetime2] = var37;
                    }
                  }
                  var28[var33Lifetime2++] = var38;
                  if (var58 == 4) {
                    ve.field_a[var33Lifetime2] = var26[6];
                    hd.field_D[var33Lifetime2] = var26[7];
                    kj.field_d[var33Lifetime2] = var26[4];
                    if (param18 != null) {
                      if (var64 == 0) {
                        ga.field_b[var33Lifetime2] = var35;
                        om.field_Yb[var33Lifetime2] = var37;
                      } else {
                        ga.field_b[var33Lifetime2] = var26[14];
                        fj.field_p[var33Lifetime2] = var26[15];
                        om.field_Yb[var33Lifetime2] = var26[12];
                      }
                    }
                    var28[var33Lifetime2++] = var38;
                    var32++;
                  }
                  le.field_Xb = var33Lifetime2;
                } else {
                  fieldTemp$16 = le.field_Xb;
                  le.field_Xb = le.field_Xb + 1;
                  var33Lifetime2 = fieldTemp$16;
                  var34 = var25[var39];
                  if (var34 < 0) {
                    fieldTemp$17 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$17;
                    var25[var39] = fieldTemp$17;
                    am.field_b[var34] = var42;
                    gd.field_Zb[var34] = var43;
                    cm.field_q[var34] = var44;
                  }
                  ve.field_a[var33Lifetime2] = var34;
                  var34 = var25[var40];
                  if (var34 < 0) {
                    fieldTemp$18 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$18;
                    var25[var40] = fieldTemp$18;
                    am.field_b[var34] = var45;
                    gd.field_Zb[var34] = var46;
                    cm.field_q[var34] = var47;
                  }
                  hd.field_D[var33Lifetime2] = var34;
                  var34 = var25[var41];
                  if (var34 < 0) {
                    fieldTemp$19 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$19;
                    var25[var41] = fieldTemp$19;
                    am.field_b[var34] = var48;
                    gd.field_Zb[var34] = var49;
                    cm.field_q[var34] = var50;
                  }
                  kj.field_d[var33Lifetime2] = var34;
                  if (param18 != null) {
                    ga.field_b[var33Lifetime2] = param18[var38];
                    fj.field_p[var33Lifetime2] = param8[var38];
                    om.field_Yb[var33Lifetime2] = param17[var38];
                  }
                  var28[var33Lifetime2] = var38;
                }
              } else {
                fieldTemp$20 = fh.field_g;
                fh.field_g = fh.field_g + 1;
                var33Lifetime2 = fieldTemp$20;
                var34 = var24[var39];
                if (var34 < 0) {
                  fieldTemp$21 = k.field_e;
                  k.field_e = k.field_e + 1;
                  var34 = fieldTemp$21;
                  var24[var39] = fieldTemp$21;
                  ic.field_c[var34] = var42;
                  nn.field_S[var34] = var43;
                  bd.field_a[var34] = var44;
                }
                ja.field_l[var33Lifetime2] = var34;
                var34 = var24[var40];
                if (0 > var34) {
                  fieldTemp$22 = k.field_e;
                  k.field_e = k.field_e + 1;
                  var34 = fieldTemp$22;
                  var24[var40] = fieldTemp$22;
                  ic.field_c[var34] = var45;
                  nn.field_S[var34] = var46;
                  bd.field_a[var34] = var47;
                }
                db.field_f[var33Lifetime2] = var34;
                var34 = var24[var41];
                if (var34 < 0) {
                  fieldTemp$23 = k.field_e;
                  k.field_e = k.field_e + 1;
                  var34 = fieldTemp$23;
                  var24[var41] = fieldTemp$23;
                  ic.field_c[var34] = var48;
                  nn.field_S[var34] = var49;
                  bd.field_a[var34] = var50;
                }
                wk.field_b[var33Lifetime2] = var34;
                if (null != param18) {
                  mc.field_m[var33Lifetime2] = param18[var38];
                  tc.field_w[var33Lifetime2] = param8[var38];
                  rk.field_b[var33Lifetime2] = param17[var38];
                }
                var27[var33Lifetime2] = var38;
              }
              var38++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            bm.field_p = param10;
            hb.field_d = param10;
            d.field_b = mf.field_u;
            ea.field_e = k.field_e;
            stackIn_249_0 = 0;
            stackIn_249_1 = param10;
          }
          if (stackIn_249_0 < stackIn_249_1) {
            if (null != param6) {
              fieldTemp$24 = param6.field_v;
              va.field_q.field_v = param6.field_v;
              fl.field_o.field_v = fieldTemp$24;
              if (fl.field_o.field_k == null ||
                !(fl.field_o.field_k.length >= param10)) {
                fl.field_o.field_Q = new short[param10];
                fl.field_o.field_k = new short[param10];
                fl.field_o.field_N = new short[param10];
              }
              if (va.field_q.field_k == null ||
                !(param10 <= va.field_q.field_k.length)) {
                va.field_q.field_Q = new short[param10];
                va.field_q.field_N = new short[param10];
                va.field_q.field_k = new short[param10];
              }
              var38Lifetime1 = 0;
              while (true) {
                if (param10 > var38Lifetime1) {
                  if (var65 == 0) {
                    if (param6.field_v[var38Lifetime1] != 0) {
                      dupTemp$25 = param6.field_k[var38Lifetime1];
                      va.field_q.field_k[var38Lifetime1] = dupTemp$25;
                      fl.field_o.field_k[var38Lifetime1] = dupTemp$25;
                      dupTemp$26 = param6.field_N[var38Lifetime1];
                      va.field_q.field_N[var38Lifetime1] = dupTemp$26;
                      fl.field_o.field_N[var38Lifetime1] = dupTemp$26;
                      dupTemp$27 = param6.field_Q[var38Lifetime1];
                      va.field_q.field_Q[var38Lifetime1] = dupTemp$27;
                      fl.field_o.field_Q[var38Lifetime1] = dupTemp$27;
                    } else {
                      var33Lifetime3 = param6.field_k[var38Lifetime1];
                      var34Lifetime1 = var24[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$28 = k.field_e;
                        k.field_e = k.field_e + 1;
                        var34Lifetime1 = fieldTemp$28;
                        var24[var33Lifetime3] = fieldTemp$28;
                        ic.field_c[var34Lifetime1] = param12[var33Lifetime3];
                        nn.field_S[var34Lifetime1] = param5[var33Lifetime3];
                        bd.field_a[var34Lifetime1] = param11[var33Lifetime3];
                      }
                      fl.field_o.field_k[var38Lifetime1] = (short)var34Lifetime1;
                      var34Lifetime1 = var25[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$29 = mf.field_u;
                        mf.field_u = mf.field_u + 1;
                        var34Lifetime1 = fieldTemp$29;
                        var25[var33Lifetime3] = fieldTemp$29;
                        am.field_b[var34Lifetime1] = param12[var33Lifetime3];
                        gd.field_Zb[var34Lifetime1] = param5[var33Lifetime3];
                        cm.field_q[var34Lifetime1] = param11[var33Lifetime3];
                      }
                      va.field_q.field_k[var38Lifetime1] = (short)var34Lifetime1;
                      var33Lifetime3 = param6.field_N[var38Lifetime1];
                      var34Lifetime1 = var24[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$30 = k.field_e;
                        k.field_e = k.field_e + 1;
                        var34Lifetime1 = fieldTemp$30;
                        var24[var33Lifetime3] = fieldTemp$30;
                        ic.field_c[var34Lifetime1] = param12[var33Lifetime3];
                        nn.field_S[var34Lifetime1] = param5[var33Lifetime3];
                        bd.field_a[var34Lifetime1] = param11[var33Lifetime3];
                      }
                      fl.field_o.field_N[var38Lifetime1] = (short)var34Lifetime1;
                      var34Lifetime1 = var25[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$31 = mf.field_u;
                        mf.field_u = mf.field_u + 1;
                        var34Lifetime1 = fieldTemp$31;
                        var25[var33Lifetime3] = fieldTemp$31;
                        am.field_b[var34Lifetime1] = param12[var33Lifetime3];
                        gd.field_Zb[var34Lifetime1] = param5[var33Lifetime3];
                        cm.field_q[var34Lifetime1] = param11[var33Lifetime3];
                      }
                      va.field_q.field_N[var38Lifetime1] = (short)var34Lifetime1;
                      var33Lifetime3 = param6.field_Q[var38Lifetime1];
                      var34Lifetime1 = var24[var33Lifetime3];
                      if (var34Lifetime1 < 0) {
                        fieldTemp$32 = k.field_e;
                        k.field_e = k.field_e + 1;
                        var34Lifetime1 = fieldTemp$32;
                        var24[var33Lifetime3] = fieldTemp$32;
                        ic.field_c[var34Lifetime1] = param12[var33Lifetime3];
                        nn.field_S[var34Lifetime1] = param5[var33Lifetime3];
                        bd.field_a[var34Lifetime1] = param11[var33Lifetime3];
                      }
                      fl.field_o.field_Q[var38Lifetime1] = (short)var34Lifetime1;
                      var34Lifetime1 = var25[var33Lifetime3];
                      if (0 > var34Lifetime1) {
                        fieldTemp$33 = mf.field_u;
                        mf.field_u = mf.field_u + 1;
                        var34Lifetime1 = fieldTemp$33;
                        var25[var33Lifetime3] = fieldTemp$33;
                        am.field_b[var34Lifetime1] = param12[var33Lifetime3];
                        gd.field_Zb[var34Lifetime1] = param5[var33Lifetime3];
                        cm.field_q[var34Lifetime1] = param11[var33Lifetime3];
                      }
                      va.field_q.field_Q[var38Lifetime1] = (short)var34Lifetime1;
                    }
                    var38Lifetime1++;
                    continue;
                  }
                } else {
                  fieldTemp$34 = param6.field_S;
                  va.field_q.field_S = param6.field_S;
                  fl.field_o.field_S = fieldTemp$34;
                  fieldTemp$35 = param6.field_x;
                  va.field_q.field_x = param6.field_x;
                  fl.field_o.field_x = fieldTemp$35;
                  fieldTemp$36 = param6.field_D;
                  va.field_q.field_D = param6.field_D;
                  fl.field_o.field_D = fieldTemp$36;
                  fieldTemp$37 = param6.field_n;
                  va.field_q.field_n = param6.field_n;
                  fl.field_o.field_n = fieldTemp$37;
                  fieldTemp$38 = param6.field_M;
                  va.field_q.field_M = param6.field_M;
                  fl.field_o.field_M = fieldTemp$38;
                  fieldTemp$39 = param6.field_F;
                  va.field_q.field_F = param6.field_F;
                  fl.field_o.field_F = fieldTemp$39;
                  fieldTemp$40 = param6.field_L;
                  va.field_q.field_L = param6.field_L;
                  fl.field_o.field_L = fieldTemp$40;
                  fieldTemp$41 = param6.field_l;
                  va.field_q.field_l = param6.field_l;
                  fl.field_o.field_l = fieldTemp$41;
                }
                break;
              }
              if (var65 == 0) {
                return;
              }
            }
            if (bg.field_f == null ||
              !(param10 <= bg.field_f.length)) {
              gb.field_r = new int[param10];
              bg.field_f = new int[param10];
              ch.field_s = new int[param10];
            }
            if (nh.field_Mb == null ||
              !(param10 <= nh.field_Mb.length)) {
              nh.field_Mb = new int[param10];
              li.field_m = new int[param10];
              gk.field_c = new int[param10];
            }
            var38Lifetime1Lifetime1 = 0;
            while (var38Lifetime1Lifetime1 < param10) {
              var33Lifetime3Lifetime1 = param19[var38Lifetime1Lifetime1];
              var34Lifetime1Lifetime1 = var24[var33Lifetime3Lifetime1];
              if (var65 != 0) {
                return;
              }
              if (0 > var34Lifetime1Lifetime1) {
                fieldTemp$42 = k.field_e;
                k.field_e = k.field_e + 1;
                var34Lifetime1Lifetime1 = fieldTemp$42;
                var24[var33Lifetime3Lifetime1] = fieldTemp$42;
                ic.field_c[var34Lifetime1Lifetime1] = param12[var33Lifetime3Lifetime1];
                nn.field_S[var34Lifetime1Lifetime1] = param5[var33Lifetime3Lifetime1];
                bd.field_a[var34Lifetime1Lifetime1] = param11[var33Lifetime3Lifetime1];
              }
              bg.field_f[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var34Lifetime1Lifetime1 = var25[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$43 = mf.field_u;
                mf.field_u = mf.field_u + 1;
                var34Lifetime1Lifetime1 = fieldTemp$43;
                var25[var33Lifetime3Lifetime1] = fieldTemp$43;
                am.field_b[var34Lifetime1Lifetime1] = param12[var33Lifetime3Lifetime1];
                gd.field_Zb[var34Lifetime1Lifetime1] = param5[var33Lifetime3Lifetime1];
                cm.field_q[var34Lifetime1Lifetime1] = param11[var33Lifetime3Lifetime1];
              }
              nh.field_Mb[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var33Lifetime3Lifetime1 = param16[var38Lifetime1Lifetime1];
              var34Lifetime1Lifetime1 = var24[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$44 = k.field_e;
                k.field_e = k.field_e + 1;
                var34Lifetime1Lifetime1 = fieldTemp$44;
                var24[var33Lifetime3Lifetime1] = fieldTemp$44;
                ic.field_c[var34Lifetime1Lifetime1] = param12[var33Lifetime3Lifetime1];
                nn.field_S[var34Lifetime1Lifetime1] = param5[var33Lifetime3Lifetime1];
                bd.field_a[var34Lifetime1Lifetime1] = param11[var33Lifetime3Lifetime1];
              }
              gb.field_r[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var34Lifetime1Lifetime1 = var25[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$45 = mf.field_u;
                mf.field_u = mf.field_u + 1;
                var34Lifetime1Lifetime1 = fieldTemp$45;
                var25[var33Lifetime3Lifetime1] = fieldTemp$45;
                am.field_b[var34Lifetime1Lifetime1] = param12[var33Lifetime3Lifetime1];
                gd.field_Zb[var34Lifetime1Lifetime1] = param5[var33Lifetime3Lifetime1];
                cm.field_q[var34Lifetime1Lifetime1] = param11[var33Lifetime3Lifetime1];
              }
              li.field_m[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var33Lifetime3Lifetime1 = param15[var38Lifetime1Lifetime1];
              var34Lifetime1Lifetime1 = var24[var33Lifetime3Lifetime1];
              if (0 > var34Lifetime1Lifetime1) {
                fieldTemp$46 = k.field_e;
                k.field_e = k.field_e + 1;
                var34Lifetime1Lifetime1 = fieldTemp$46;
                var24[var33Lifetime3Lifetime1] = fieldTemp$46;
                ic.field_c[var34Lifetime1Lifetime1] = param12[var33Lifetime3Lifetime1];
                nn.field_S[var34Lifetime1Lifetime1] = param5[var33Lifetime3Lifetime1];
                bd.field_a[var34Lifetime1Lifetime1] = param11[var33Lifetime3Lifetime1];
              }
              ch.field_s[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var34Lifetime1Lifetime1 = var25[var33Lifetime3Lifetime1];
              if (var34Lifetime1Lifetime1 < 0) {
                fieldTemp$47 = mf.field_u;
                mf.field_u = mf.field_u + 1;
                var34Lifetime1Lifetime1 = fieldTemp$47;
                var25[var33Lifetime3Lifetime1] = fieldTemp$47;
                am.field_b[var34Lifetime1Lifetime1] = param12[var33Lifetime3Lifetime1];
                gd.field_Zb[var34Lifetime1Lifetime1] = param5[var33Lifetime3Lifetime1];
                cm.field_q[var34Lifetime1Lifetime1] = param11[var33Lifetime3Lifetime1];
              }
              gk.field_c[var38Lifetime1Lifetime1] = var34Lifetime1Lifetime1;
              var38Lifetime1Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var24_ref = decompiledCaughtException;
          stackIn_340_0 = var24_ref;
          stackIn_340_1 = new StringBuilder().append("bn.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_341_2 = "null";
          } else {
            stackIn_341_2 = "{...}";
          }
          stackIn_344_1 = ((StringBuilder) (Object) stackIn_340_1).append(stackIn_341_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_345_2 = "null";
          } else {
            stackIn_345_2 = "{...}";
          }
          stackIn_348_1 = ((StringBuilder) (Object) stackIn_344_1).append(stackIn_345_2).append(',');
          if (param6 == null) {
            stackIn_349_2 = "null";
          } else {
            stackIn_349_2 = "{...}";
          }
          stackIn_352_1 = ((StringBuilder) (Object) stackIn_348_1).append(stackIn_349_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_353_2 = "null";
          } else {
            stackIn_353_2 = "{...}";
          }
          stackIn_356_1 = ((StringBuilder) (Object) stackIn_352_1).append(stackIn_353_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_357_2 = "null";
          } else {
            stackIn_357_2 = "{...}";
          }
          stackIn_360_1 = ((StringBuilder) (Object) stackIn_356_1).append(stackIn_357_2).append(',');
          if (param12 == null) {
            stackIn_361_2 = "null";
          } else {
            stackIn_361_2 = "{...}";
          }
          stackIn_364_1 = ((StringBuilder) (Object) stackIn_360_1).append(stackIn_361_2).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_365_2 = "null";
          } else {
            stackIn_365_2 = "{...}";
          }
          stackIn_368_1 = ((StringBuilder) (Object) stackIn_364_1).append(stackIn_365_2).append(',');
          if (param16 == null) {
            stackIn_369_2 = "null";
          } else {
            stackIn_369_2 = "{...}";
          }
          stackIn_372_1 = ((StringBuilder) (Object) stackIn_368_1).append(stackIn_369_2).append(',');
          if (param17 == null) {
            stackIn_373_2 = "null";
          } else {
            stackIn_373_2 = "{...}";
          }
          stackIn_376_1 = ((StringBuilder) (Object) stackIn_372_1).append(stackIn_373_2).append(',');
          if (param18 == null) {
            stackIn_377_2 = "null";
          } else {
            stackIn_377_2 = "{...}";
          }
          stackIn_380_1 = ((StringBuilder) (Object) stackIn_376_1).append(stackIn_377_2).append(',');
          if (param19 == null) {
            stackIn_381_2 = "null";
          } else {
            stackIn_381_2 = "{...}";
          }
          stackIn_384_1 = ((StringBuilder) (Object) stackIn_380_1).append(stackIn_381_2).append(',');
          if (param20 == null) {
            stackIn_385_2 = "null";
          } else {
            stackIn_385_2 = "{...}";
          }
          stackIn_388_1 = ((StringBuilder) (Object) stackIn_384_1).append(stackIn_385_2).append(',').append(param21).append(',');
          if (param22 == null) {
            stackIn_389_2 = "null";
          } else {
            stackIn_389_2 = "{...}";
          }
          stackIn_392_1 = ((StringBuilder) (Object) stackIn_388_1).append(stackIn_389_2).append(',');
          if (param23 == null) {
            stackIn_393_2 = "null";
          } else {
            stackIn_393_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_340_0), ((StringBuilder) (Object) stackIn_392_1).append(stackIn_393_2).append(')').toString());
        }
    }

    static {
    }
}
