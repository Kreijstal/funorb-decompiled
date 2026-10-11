/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends rk {
    int field_B;
    static int[] field_G;
    static boolean field_E;
    static String[] field_J;
    qh field_F;
    static String field_I;
    static si field_D;
    byte[] field_L;
    static String field_K;

    final static void a(int param0, int[] param1, int param2, int[] param3, int[] param4, byte[] param5, int[] param6, int[] param7, int[] param8, int[] param9, int[] param10, int param11, int[] param12, int param13, int param14, int param15, int param16, int[] param17, int[] param18, int param19, lg param20, int param21, int param22, int[] param23) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        byte[] fieldTemp$24 = null;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        short dupTemp$31 = 0;
        short dupTemp$32 = 0;
        short dupTemp$33 = 0;
        byte[] fieldTemp$34 = null;
        short[] fieldTemp$35 = null;
        byte[] fieldTemp$36 = null;
        byte[] fieldTemp$37 = null;
        short[] fieldTemp$38 = null;
        short[] fieldTemp$39 = null;
        byte[] fieldTemp$40 = null;
        byte[] fieldTemp$41 = null;
        int fieldTemp$42 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        int stackIn_116_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_259_0 = 0;
        lg stackIn_312_0 = null;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        String stackIn_355_2 = null;
        StringBuilder stackIn_358_1 = null;
        String stackIn_359_2 = null;
        StringBuilder stackIn_362_1 = null;
        String stackIn_363_2 = null;
        StringBuilder stackIn_366_1 = null;
        String stackIn_367_2 = null;
        StringBuilder stackIn_370_1 = null;
        String stackIn_371_2 = null;
        StringBuilder stackIn_374_1 = null;
        String stackIn_375_2 = null;
        StringBuilder stackIn_378_1 = null;
        String stackIn_379_2 = null;
        StringBuilder stackIn_382_1 = null;
        String stackIn_383_2 = null;
        StringBuilder stackIn_386_1 = null;
        String stackIn_387_2 = null;
        StringBuilder stackIn_390_1 = null;
        String stackIn_391_2 = null;
        StringBuilder stackIn_394_1 = null;
        String stackIn_395_2 = null;
        StringBuilder stackIn_398_1 = null;
        String stackIn_399_2 = null;
        StringBuilder stackIn_402_1 = null;
        String stackIn_403_2 = null;
        StringBuilder stackIn_406_1 = null;
        String stackIn_407_2 = null;
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
        int var54 = 0;
        int[] var55 = null;
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
        int var66 = 0;
        int[] var55Lifetime1;
        int[] var55Lifetime2;
        int[] var55Lifetime3;
        int[] var55Lifetime4;
        int[] var55Lifetime5;
        int[] var55Lifetime1Lifetime1;
        int[] var55Lifetime1Lifetime2;
        int[] var55Lifetime2Lifetime1;
        int[] var55Lifetime2Lifetime2;
        int[] var55Lifetime2Lifetime3;
        int[] var55Lifetime3Lifetime1;
        int[] var55Lifetime3Lifetime2;
        int[] var55Lifetime3Lifetime3;
        int var35Lifetime1;
        int var39Lifetime1;
        int var60Lifetime1;
        int var60Lifetime2;
        int var61Lifetime1;
        int var61Lifetime2;
        int var62Lifetime1;
        int var62Lifetime2;
        int var63Lifetime1;
        int var63Lifetime2;
        int var64Lifetime1;
        int var64Lifetime2;
        int var24_intLifetime1;
        int var35Lifetime1Lifetime1;
        int var39Lifetime1Lifetime1;
        var66 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null == pq.field_c ||
            !(pq.field_c.length >= param14)) {
            var24_int = param14 + 100;
            r.field_c = new int[var24_int];
            pq.field_c = new int[var24_int];
          }
          if (ba.field_e == null ||
            !(2 * param0 <= ba.field_e.length)) {
            var24_intLifetime1 = 100 + 2 * param0;
            ba.field_e = new int[var24_intLifetime1];
            la.field_d = new int[var24_intLifetime1];
          }
          var24 = pq.field_c;
          if (wb.field_E == null) {
            wb.field_E = new int[16];
          }
          var25 = r.field_c;
          var26 = wb.field_E;
          var27 = ba.field_e;
          no.field_b = 0;
          jd.field_d = 0;
          rm.field_y = 0;
          eb.field_b = 0;
          var28 = la.field_d;
          if (null == kh.field_c ||
            !(param14 <= kh.field_c.length)) {
            kh.field_c = new int[param14 + 100];
            sa.field_c = new int[100 + param14];
            hk.field_q = new int[param14 + 100];
          }
          if (vm.field_a == null ||
            !(vm.field_a.length >= param0)) {
            hm.field_C = new int[param0 + 100];
            vm.field_a = new int[100 + param0];
            al.field_s = new int[100 + param0];
          }
          var29 = -113 / ((-19 - param19) / 47);
          if (param9 != null && (null == or.field_e ||
            !(param0 <= or.field_e.length))) {
            vp.field_d = new int[100 + param0];
            or.field_e = new int[100 + param0];
            kc.field_e = new int[100 + param0];
          }
          if (lf.field_z == null ||
            !(param14 <= lf.field_z.length)) {
            ga.field_hb = new int[100 + param14];
            rn.field_z = new int[param14 + 100];
            lf.field_z = new int[param14 + 100];
          }
          if (null == b.field_m ||
            !(b.field_m.length >= param0)) {
            vj.field_f = new int[param0 + 100];
            b.field_m = new int[100 + param0];
            tf.field_p = new int[100 + param0];
          }
          if (null != param9 && (null == vf.field_y ||
            !(param0 <= vf.field_y.length))) {
            vf.field_y = new int[100 + param0];
            jr.field_f = new int[param0 + 100];
            hn.field_s = new int[100 + param0];
          }
          var30 = 0;
          var31 = 0;
          var32 = 0;
          var33 = 0;
          var34 = 0;
          do {
            if (var34 >= param14) {
              var34 = 0;
              break;
            }
            var24[var34] = -1;
            var34++;
          } while (var66 == 0);
          while (var34 < param14) {
            var25[var34] = -1;
            var34++;
            if (var66 == 0) {
              continue;
            }
            break;
          }
          var36 = 0;
          var37 = 0;
          var38 = 0;
          var39 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var39 >= param0))) {
            var40 = param18[var39];
            var41 = param23[var39];
            var42 = param3[var39];
            var43 = param17[var40];
            var44 = param1[var40];
            var45 = param6[var40];
            var46 = param17[var41];
            var47 = param1[var41];
            var48 = param6[var41];
            var49 = param17[var42];
            var50 = param1[var42];
            var51 = param6[var42];
            var52 = param15 * (-param13 + var45) + ((-param21 + var43) * param16 + param2 * (var44 - param22));
            var53 = (var47 - param22) * param2 + ((var46 - param21) * param16 + param15 * (var48 - param13));
            var54 = (var51 - param13) * param15 + (param2 * (var50 - param22) + param16 * (var49 - param21));
            stackIn_259_0 = var54 | (var52 | var53);
            if (var66 == 0) {
              if (stackIn_259_0 >= 0) {
                fieldTemp$0 = eb.field_b;
                eb.field_b = eb.field_b + 1;
                var34 = fieldTemp$0;
                var35 = var24[var40];
                if (var35 < 0) {
                  fieldTemp$1 = jd.field_d;
                  jd.field_d = jd.field_d + 1;
                  var35 = fieldTemp$1;
                  var24[var40] = fieldTemp$1;
                  kh.field_c[var35] = var43;
                  hk.field_q[var35] = var44;
                  sa.field_c[var35] = var45;
                }
                vm.field_a[var34] = var35;
                var35 = var24[var41];
                if (var35 < 0) {
                  fieldTemp$2 = jd.field_d;
                  jd.field_d = jd.field_d + 1;
                  var35 = fieldTemp$2;
                  var24[var41] = fieldTemp$2;
                  kh.field_c[var35] = var46;
                  hk.field_q[var35] = var47;
                  sa.field_c[var35] = var48;
                }
                al.field_s[var34] = var35;
                var35 = var24[var42];
                if (var35 < 0) {
                  fieldTemp$3 = jd.field_d;
                  jd.field_d = jd.field_d + 1;
                  var35 = fieldTemp$3;
                  var24[var42] = fieldTemp$3;
                  kh.field_c[var35] = var49;
                  hk.field_q[var35] = var50;
                  sa.field_c[var35] = var51;
                }
                hm.field_C[var34] = var35;
                if (param9 != null) {
                  or.field_e[var34] = param9[var39];
                  kc.field_e[var34] = param10[var39];
                  vp.field_d[var34] = param7[var39];
                }
                var27[var34] = var39;
              } else if ((-var54 | (-var53 | -var52)) < 0) {
                if (kh.field_c.length < (param14 + var30 + 4)) {
                  var55 = new int[param14 + var30 + 104];
                  qq.a(kh.field_c, 0, var55, 0, jd.field_d);
                  kh.field_c = var55;
                  var55Lifetime4 = new int[var30 + param14 + 104];
                  qq.a(hk.field_q, 0, var55Lifetime4, 0, jd.field_d);
                  hk.field_q = var55Lifetime4;
                  var55Lifetime5 = new int[104 + param14 + var30];
                  qq.a(sa.field_c, 0, var55Lifetime5, 0, jd.field_d);
                  sa.field_c = var55Lifetime5;
                }
                if (4 + param14 + var32 > lf.field_z.length) {
                  var55Lifetime1 = new int[param14 - (-var32 - 104)];
                  qq.a(lf.field_z, 0, var55Lifetime1, 0, no.field_b);
                  lf.field_z = var55Lifetime1;
                  var55Lifetime1Lifetime1 = new int[var32 + param14 + 104];
                  qq.a(ga.field_hb, 0, var55Lifetime1Lifetime1, 0, no.field_b);
                  ga.field_hb = var55Lifetime1Lifetime1;
                  var55Lifetime1Lifetime2 = new int[104 + (var32 + param14)];
                  qq.a(rn.field_z, 0, var55Lifetime1Lifetime2, 0, no.field_b);
                  rn.field_z = var55Lifetime1Lifetime2;
                }
                var56 = jd.field_d;
                var57 = no.field_b;
                var58 = 0;
                var59 = 0;
                if (null == param5) {
                  if (param7 != null) {
                    if (-1 != param7[var39] &&
                      param7[var39] != -2) {
                      stackIn_116_0 = 1;
                    } else {
                      stackIn_116_0 = 0;
                    }
                    var65 = stackIn_116_0;
                  } else {
                    var65 = 1;
                  }
                } else {
                  stackIn_124_0 = (0 != (1 & param5[var39])) ? 0 : 1;
                  var65 = stackIn_124_0;
                }
                if (param9 != null) {
                  if (var65 == 0) {
                    var36 = param9[var39];
                    var38 = param7[var39];
                    var37 = param10[var39];
                  } else {
                    var36 = 65535 & param9[var39];
                    var38 = 65535 & param7[var39];
                    var37 = param10[var39] & 65535;
                  }
                }
                if (0 <= var52) {
                  var35 = var24[var40];
                  if (0 > var35) {
                    incrementValue$4 = var56;
                    var56++;
                    var35 = incrementValue$4;
                    var24[var40] = incrementValue$4;
                    kh.field_c[var35] = var43;
                    hk.field_q[var35] = var44;
                    sa.field_c[var35] = var45;
                  }
                  var26[0 + var58] = var35;
                  var26[8 + var58] = var36;
                  var58++;
                }
                if (var52 <= 0) {
                  var35 = var25[var40];
                  if (var35 < 0) {
                    incrementValue$5 = var57;
                    var57++;
                    var35 = incrementValue$5;
                    var25[var40] = incrementValue$5;
                    lf.field_z[var35] = var43;
                    ga.field_hb[var35] = var44;
                    rn.field_z[var35] = var45;
                  }
                  var26[var59 + 4] = var35;
                  var26[var59 + 12] = var36;
                  var59++;
                }
                if (var52 != 0 &&
                  var53 != 0 &&
                  (var53 ^ var52) < 0) {
                  var64 = -var52 + var53;
                  var60 = (-(var52 * var46) + var53 * var43) / var64;
                  incrementValue$6 = var56;
                  var56++;
                  var35 = incrementValue$6;
                  var63 = (-(var37 * var52) + var36 * var53) / var64;
                  var62 = (var45 * var53 - var48 * var52) / var64;
                  var61 = (var44 * var53 - var52 * var47) / var64;
                  kh.field_c[var35] = var60;
                  hk.field_q[var35] = var61;
                  sa.field_c[var35] = var62;
                  var26[var58 + 0] = var35;
                  var26[var58 + 8] = var63;
                  var58++;
                  incrementValue$7 = var57;
                  var57++;
                  var35 = incrementValue$7;
                  lf.field_z[var35] = var60;
                  ga.field_hb[var35] = var61;
                  rn.field_z[var35] = var62;
                  var26[4 + var59] = var35;
                  var26[12 + var59] = var63;
                  var59++;
                }
                if (0 <= var53) {
                  var35 = var24[var41];
                  if (0 > var35) {
                    incrementValue$8 = var56;
                    var56++;
                    var35 = incrementValue$8;
                    var24[var41] = incrementValue$8;
                    kh.field_c[var35] = var46;
                    hk.field_q[var35] = var47;
                    sa.field_c[var35] = var48;
                  }
                  var26[var58 + 0] = var35;
                  var26[var58 + 8] = var37;
                  var58++;
                }
                if (var53 <= 0) {
                  var35 = var25[var41];
                  if (var35 < 0) {
                    incrementValue$9 = var57;
                    var57++;
                    var35 = incrementValue$9;
                    var25[var41] = incrementValue$9;
                    lf.field_z[var35] = var46;
                    ga.field_hb[var35] = var47;
                    rn.field_z[var35] = var48;
                  }
                  var26[4 + var59] = var35;
                  var26[var59 + 12] = var37;
                  var59++;
                }
                if (var53 != 0 &&
                  0 != var54 &&
                  (var54 ^ var53) < 0) {
                  var64Lifetime1 = -var53 + var54;
                  var61Lifetime1 = (var54 * var47 - var50 * var53) / var64Lifetime1;
                  incrementValue$10 = var56;
                  var56++;
                  var35 = incrementValue$10;
                  var63Lifetime1 = (var37 * var54 - var53 * var38) / var64Lifetime1;
                  var62Lifetime1 = (var48 * var54 - var53 * var51) / var64Lifetime1;
                  var60Lifetime1 = (var46 * var54 - var53 * var49) / var64Lifetime1;
                  kh.field_c[var35] = var60Lifetime1;
                  hk.field_q[var35] = var61Lifetime1;
                  sa.field_c[var35] = var62Lifetime1;
                  var26[var58 + 0] = var35;
                  var26[var58 + 8] = var63Lifetime1;
                  incrementValue$11 = var57;
                  var57++;
                  var35 = incrementValue$11;
                  var58++;
                  lf.field_z[var35] = var60Lifetime1;
                  ga.field_hb[var35] = var61Lifetime1;
                  rn.field_z[var35] = var62Lifetime1;
                  var26[var59 + 4] = var35;
                  var26[var59 + 12] = var63Lifetime1;
                  var59++;
                }
                if (var54 >= 0) {
                  var35 = var24[var42];
                  if (var35 < 0) {
                    incrementValue$12 = var56;
                    var56++;
                    var35 = incrementValue$12;
                    var24[var42] = incrementValue$12;
                    kh.field_c[var35] = var49;
                    hk.field_q[var35] = var50;
                    sa.field_c[var35] = var51;
                  }
                  var26[var58 + 0] = var35;
                  var26[var58 + 8] = var38;
                  var58++;
                }
                if (0 >= var54) {
                  var35 = var25[var42];
                  if (var35 < 0) {
                    incrementValue$13 = var57;
                    var57++;
                    var35 = incrementValue$13;
                    var25[var42] = incrementValue$13;
                    lf.field_z[var35] = var49;
                    ga.field_hb[var35] = var50;
                    rn.field_z[var35] = var51;
                  }
                  var26[4 + var59] = var35;
                  var26[12 + var59] = var38;
                  var59++;
                }
                if ((var52 | var54) != 0 &&
                  (var52 ^ var54) < 0) {
                  var64Lifetime2 = -var54 + var52;
                  var63Lifetime2 = (-(var36 * var54) + var52 * var38) / var64Lifetime2;
                  incrementValue$14 = var56;
                  var56++;
                  var35 = incrementValue$14;
                  var61Lifetime2 = (-(var54 * var44) + var52 * var50) / var64Lifetime2;
                  var62Lifetime2 = (var52 * var51 - var54 * var45) / var64Lifetime2;
                  var60Lifetime2 = (var52 * var49 - var43 * var54) / var64Lifetime2;
                  kh.field_c[var35] = var60Lifetime2;
                  hk.field_q[var35] = var61Lifetime2;
                  sa.field_c[var35] = var62Lifetime2;
                  var26[var58 + 0] = var35;
                  var26[var58 + 8] = var63Lifetime2;
                  var58++;
                  incrementValue$15 = var57;
                  var57++;
                  var35 = incrementValue$15;
                  lf.field_z[var35] = var60Lifetime2;
                  ga.field_hb[var35] = var61Lifetime2;
                  rn.field_z[var35] = var62Lifetime2;
                  var26[var59 + 4] = var35;
                  var26[12 + var59] = var63Lifetime2;
                  var59++;
                }
                var30 = var30 + (var56 - jd.field_d);
                jd.field_d = var56;
                var34 = eb.field_b;
                if ((param0 + (var31 + var58) - 2) > vm.field_a.length) {
                  var55Lifetime2 = new int[var58 + var31 + (param0 + 98)];
                  qq.a(vm.field_a, 0, var55Lifetime2, 0, var34);
                  vm.field_a = var55Lifetime2;
                  var55Lifetime2Lifetime1 = new int[98 + (var58 + var31) + param0];
                  qq.a(al.field_s, 0, var55Lifetime2Lifetime1, 0, var34);
                  al.field_s = var55Lifetime2Lifetime1;
                  var55Lifetime2Lifetime2 = new int[98 + var31 + (param0 + var58)];
                  qq.a(hm.field_C, 0, var55Lifetime2Lifetime2, 0, var34);
                  hm.field_C = var55Lifetime2Lifetime2;
                  if (param9 != null) {
                    var55Lifetime2Lifetime3 = new int[98 + var58 + (var31 + param0)];
                    qq.a(or.field_e, 0, var55Lifetime2Lifetime3, 0, var34);
                    or.field_e = var55Lifetime2Lifetime3;
                    var55Lifetime2Lifetime3 = new int[98 + param0 + var31 + var58];
                    qq.a(kc.field_e, 0, var55Lifetime2Lifetime3, 0, var34);
                    kc.field_e = var55Lifetime2Lifetime3;
                    var55Lifetime2Lifetime3 = new int[var58 + var31 + param0 + 98];
                    qq.a(vp.field_d, 0, var55Lifetime2Lifetime3, 0, var34);
                    vp.field_d = var55Lifetime2Lifetime3;
                  }
                }
                vm.field_a[var34] = var26[0];
                al.field_s[var34] = var26[1];
                hm.field_C[var34] = var26[2];
                if (param9 != null) {
                  if (var65 == 0) {
                    or.field_e[var34] = var36;
                    vp.field_d[var34] = var38;
                  } else {
                    or.field_e[var34] = var26[8];
                    kc.field_e[var34] = var26[9];
                    vp.field_d[var34] = var26[10];
                  }
                }
                var27[var34++] = var39;
                if (var58 == 4) {
                  vm.field_a[var34] = var26[2];
                  al.field_s[var34] = var26[3];
                  hm.field_C[var34] = var26[0];
                  if (null != param9) {
                    if (var65 != 0) {
                      or.field_e[var34] = var26[10];
                      kc.field_e[var34] = var26[11];
                      vp.field_d[var34] = var26[8];
                    } else {
                      or.field_e[var34] = var36;
                      vp.field_d[var34] = var38;
                    }
                  }
                  var27[var34++] = var39;
                  var31++;
                }
                var32 = var32 + (var57 - no.field_b);
                eb.field_b = var34;
                var34 = rm.field_y;
                no.field_b = var57;
                if ((var59 + (param0 + var33 - 2)) > b.field_m.length) {
                  var55Lifetime3 = new int[98 + (param0 + var33) + var59];
                  qq.a(b.field_m, 0, var55Lifetime3, 0, var34);
                  b.field_m = var55Lifetime3;
                  var55Lifetime3Lifetime1 = new int[param0 + var33 + (var59 + 98)];
                  qq.a(tf.field_p, 0, var55Lifetime3Lifetime1, 0, var34);
                  tf.field_p = var55Lifetime3Lifetime1;
                  var55Lifetime3Lifetime2 = new int[var59 + param0 + (var33 + 98)];
                  qq.a(vj.field_f, 0, var55Lifetime3Lifetime2, 0, var34);
                  vj.field_f = var55Lifetime3Lifetime2;
                  if (param9 != null) {
                    var55Lifetime3Lifetime3 = new int[98 + var59 + (var33 + param0)];
                    qq.a(vf.field_y, 0, var55Lifetime3Lifetime3, 0, var34);
                    vf.field_y = var55Lifetime3Lifetime3;
                    var55Lifetime3Lifetime3 = new int[98 + param0 + (var33 + var59)];
                    qq.a(hn.field_s, 0, var55Lifetime3Lifetime3, 0, var34);
                    hn.field_s = var55Lifetime3Lifetime3;
                    var55Lifetime3Lifetime3 = new int[98 + (param0 + var33) + var59];
                    qq.a(jr.field_f, 0, var55Lifetime3Lifetime3, 0, var34);
                    jr.field_f = var55Lifetime3Lifetime3;
                  }
                }
                b.field_m[var34] = var26[4];
                tf.field_p[var34] = var26[5];
                vj.field_f[var34] = var26[6];
                if (param9 != null) {
                  if (var65 != 0) {
                    vf.field_y[var34] = var26[12];
                    hn.field_s[var34] = var26[13];
                    jr.field_f[var34] = var26[14];
                  } else {
                    vf.field_y[var34] = var36;
                    jr.field_f[var34] = var38;
                  }
                }
                var28[var34++] = var39;
                if (var59 == 4) {
                  b.field_m[var34] = var26[6];
                  tf.field_p[var34] = var26[7];
                  vj.field_f[var34] = var26[4];
                  if (param9 != null) {
                    if (var65 == 0) {
                      vf.field_y[var34] = var36;
                      jr.field_f[var34] = var38;
                    } else {
                      vf.field_y[var34] = var26[14];
                      hn.field_s[var34] = var26[15];
                      jr.field_f[var34] = var26[12];
                    }
                  }
                  var28[var34++] = var39;
                  var33++;
                }
                rm.field_y = var34;
              } else {
                fieldTemp$20 = rm.field_y;
                rm.field_y = rm.field_y + 1;
                var34 = fieldTemp$20;
                var35 = var25[var40];
                if (var35 < 0) {
                  fieldTemp$21 = no.field_b;
                  no.field_b = no.field_b + 1;
                  var35 = fieldTemp$21;
                  var25[var40] = fieldTemp$21;
                  lf.field_z[var35] = var43;
                  ga.field_hb[var35] = var44;
                  rn.field_z[var35] = var45;
                }
                b.field_m[var34] = var35;
                var35 = var25[var41];
                if (0 > var35) {
                  fieldTemp$22 = no.field_b;
                  no.field_b = no.field_b + 1;
                  var35 = fieldTemp$22;
                  var25[var41] = fieldTemp$22;
                  lf.field_z[var35] = var46;
                  ga.field_hb[var35] = var47;
                  rn.field_z[var35] = var48;
                }
                tf.field_p[var34] = var35;
                var35 = var25[var42];
                if (var35 < 0) {
                  fieldTemp$23 = no.field_b;
                  no.field_b = no.field_b + 1;
                  var35 = fieldTemp$23;
                  var25[var42] = fieldTemp$23;
                  lf.field_z[var35] = var49;
                  ga.field_hb[var35] = var50;
                  rn.field_z[var35] = var51;
                }
                vj.field_f[var34] = var35;
                if (null != param9) {
                  vf.field_y[var34] = param9[var39];
                  hn.field_s[var34] = param10[var39];
                  jr.field_f[var34] = param7[var39];
                }
                var28[var34] = var39;
              }
              var39++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            wc.field_n = jd.field_d;
            qn.field_u = param11;
            br.field_T = param11;
            vo.field_x = no.field_b;
            stackIn_259_0 = -1;
          }
          if (stackIn_259_0 > ~param11) {
            if (null != param20) {
              fieldTemp$24 = param20.field_E;
              hb.field_A.field_E = param20.field_E;
              qn.field_p.field_E = fieldTemp$24;
              if (qn.field_p.field_M == null ||
                !(param11 <= qn.field_p.field_M.length)) {
                qn.field_p.field_F = new short[param11];
                qn.field_p.field_P = new short[param11];
                qn.field_p.field_M = new short[param11];
              }
              if (null == hb.field_A.field_M ||
                !(param11 <= hb.field_A.field_M.length)) {
                hb.field_A.field_M = new short[param11];
                hb.field_A.field_P = new short[param11];
                hb.field_A.field_F = new short[param11];
              }
              var39Lifetime1 = 0;
              while (true) {
                if (var39Lifetime1 < param11) {
                  stackIn_312_0 = (lg) (param20);
                  if (var66 == 0) {
                    if (stackIn_312_0.field_E[var39Lifetime1] == 0) {
                      var34 = param20.field_M[var39Lifetime1];
                      var35Lifetime1 = var24[var34];
                      if (var35Lifetime1 < 0) {
                        fieldTemp$25 = jd.field_d;
                        jd.field_d = jd.field_d + 1;
                        var35Lifetime1 = fieldTemp$25;
                        var24[var34] = fieldTemp$25;
                        kh.field_c[var35Lifetime1] = param17[var34];
                        hk.field_q[var35Lifetime1] = param1[var34];
                        sa.field_c[var35Lifetime1] = param6[var34];
                      }
                      qn.field_p.field_M[var39Lifetime1] = (short)var35Lifetime1;
                      var35Lifetime1 = var25[var34];
                      if (var35Lifetime1 < 0) {
                        fieldTemp$26 = no.field_b;
                        no.field_b = no.field_b + 1;
                        var35Lifetime1 = fieldTemp$26;
                        var25[var34] = fieldTemp$26;
                        lf.field_z[var35Lifetime1] = param17[var34];
                        ga.field_hb[var35Lifetime1] = param1[var34];
                        rn.field_z[var35Lifetime1] = param6[var34];
                      }
                      hb.field_A.field_M[var39Lifetime1] = (short)var35Lifetime1;
                      var34 = param20.field_P[var39Lifetime1];
                      var35Lifetime1 = var24[var34];
                      if (var35Lifetime1 < 0) {
                        fieldTemp$27 = jd.field_d;
                        jd.field_d = jd.field_d + 1;
                        var35Lifetime1 = fieldTemp$27;
                        var24[var34] = fieldTemp$27;
                        kh.field_c[var35Lifetime1] = param17[var34];
                        hk.field_q[var35Lifetime1] = param1[var34];
                        sa.field_c[var35Lifetime1] = param6[var34];
                      }
                      qn.field_p.field_P[var39Lifetime1] = (short)var35Lifetime1;
                      var35Lifetime1 = var25[var34];
                      if (var35Lifetime1 < 0) {
                        fieldTemp$28 = no.field_b;
                        no.field_b = no.field_b + 1;
                        var35Lifetime1 = fieldTemp$28;
                        var25[var34] = fieldTemp$28;
                        lf.field_z[var35Lifetime1] = param17[var34];
                        ga.field_hb[var35Lifetime1] = param1[var34];
                        rn.field_z[var35Lifetime1] = param6[var34];
                      }
                      hb.field_A.field_P[var39Lifetime1] = (short)var35Lifetime1;
                      var34 = param20.field_F[var39Lifetime1];
                      var35Lifetime1 = var24[var34];
                      if (0 > var35Lifetime1) {
                        fieldTemp$29 = jd.field_d;
                        jd.field_d = jd.field_d + 1;
                        var35Lifetime1 = fieldTemp$29;
                        var24[var34] = fieldTemp$29;
                        kh.field_c[var35Lifetime1] = param17[var34];
                        hk.field_q[var35Lifetime1] = param1[var34];
                        sa.field_c[var35Lifetime1] = param6[var34];
                      }
                      qn.field_p.field_F[var39Lifetime1] = (short)var35Lifetime1;
                      var35Lifetime1 = var25[var34];
                      if (var35Lifetime1 < 0) {
                        fieldTemp$30 = no.field_b;
                        no.field_b = no.field_b + 1;
                        var35Lifetime1 = fieldTemp$30;
                        var25[var34] = fieldTemp$30;
                        lf.field_z[var35Lifetime1] = param17[var34];
                        ga.field_hb[var35Lifetime1] = param1[var34];
                        rn.field_z[var35Lifetime1] = param6[var34];
                      }
                      hb.field_A.field_F[var39Lifetime1] = (short)var35Lifetime1;
                    } else {
                      dupTemp$31 = param20.field_M[var39Lifetime1];
                      hb.field_A.field_M[var39Lifetime1] = dupTemp$31;
                      qn.field_p.field_M[var39Lifetime1] = dupTemp$31;
                      dupTemp$32 = param20.field_P[var39Lifetime1];
                      hb.field_A.field_P[var39Lifetime1] = dupTemp$32;
                      qn.field_p.field_P[var39Lifetime1] = dupTemp$32;
                      dupTemp$33 = param20.field_F[var39Lifetime1];
                      hb.field_A.field_F[var39Lifetime1] = dupTemp$33;
                      qn.field_p.field_F[var39Lifetime1] = dupTemp$33;
                    }
                    var39Lifetime1++;
                    continue;
                  }
                } else {
                  fieldTemp$34 = param20.field_a;
                  hb.field_A.field_a = param20.field_a;
                  qn.field_p.field_a = fieldTemp$34;
                  fieldTemp$35 = param20.field_m;
                  hb.field_A.field_m = param20.field_m;
                  qn.field_p.field_m = fieldTemp$35;
                  fieldTemp$36 = param20.field_I;
                  hb.field_A.field_I = param20.field_I;
                  qn.field_p.field_I = fieldTemp$36;
                  fieldTemp$37 = param20.field_h;
                  hb.field_A.field_h = param20.field_h;
                  qn.field_p.field_h = fieldTemp$37;
                  fieldTemp$38 = param20.field_t;
                  hb.field_A.field_t = param20.field_t;
                  qn.field_p.field_t = fieldTemp$38;
                  fieldTemp$39 = param20.field_b;
                  hb.field_A.field_b = param20.field_b;
                  qn.field_p.field_b = fieldTemp$39;
                  fieldTemp$40 = param20.field_J;
                  hb.field_A.field_J = param20.field_J;
                  qn.field_p.field_J = fieldTemp$40;
                  stackIn_312_0 = qn.field_p;
                }
                break;
              }
              fieldTemp$41 = param20.field_y;
              hb.field_A.field_y = param20.field_y;
              stackIn_312_0.field_y = fieldTemp$41;
              if (var66 == 0) {
                return;
              }
            }
            if (qp.field_g == null ||
              !(param11 <= qp.field_g.length)) {
              pd.field_a = new int[param11];
              da.field_k = new int[param11];
              qp.field_g = new int[param11];
            }
            if (null == ga.field_jb ||
              !(ga.field_jb.length >= param11)) {
              cg.field_e = new int[param11];
              ga.field_jb = new int[param11];
              ln.field_g = new int[param11];
            }
            var39Lifetime1Lifetime1 = 0;
            while (var39Lifetime1Lifetime1 < param11) {
              var34 = param4[var39Lifetime1Lifetime1];
              var35Lifetime1Lifetime1 = var24[var34];
              if (var66 != 0) {
                return;
              }
              if (0 > var35Lifetime1Lifetime1) {
                fieldTemp$42 = jd.field_d;
                jd.field_d = jd.field_d + 1;
                var35Lifetime1Lifetime1 = fieldTemp$42;
                var24[var34] = fieldTemp$42;
                kh.field_c[var35Lifetime1Lifetime1] = param17[var34];
                hk.field_q[var35Lifetime1Lifetime1] = param1[var34];
                sa.field_c[var35Lifetime1Lifetime1] = param6[var34];
              }
              qp.field_g[var39Lifetime1Lifetime1] = var35Lifetime1Lifetime1;
              var35Lifetime1Lifetime1 = var25[var34];
              if (0 > var35Lifetime1Lifetime1) {
                fieldTemp$43 = no.field_b;
                no.field_b = no.field_b + 1;
                var35Lifetime1Lifetime1 = fieldTemp$43;
                var25[var34] = fieldTemp$43;
                lf.field_z[var35Lifetime1Lifetime1] = param17[var34];
                ga.field_hb[var35Lifetime1Lifetime1] = param1[var34];
                rn.field_z[var35Lifetime1Lifetime1] = param6[var34];
              }
              ga.field_jb[var39Lifetime1Lifetime1] = var35Lifetime1Lifetime1;
              var34 = param8[var39Lifetime1Lifetime1];
              var35Lifetime1Lifetime1 = var24[var34];
              if (var35Lifetime1Lifetime1 < 0) {
                fieldTemp$44 = jd.field_d;
                jd.field_d = jd.field_d + 1;
                var35Lifetime1Lifetime1 = fieldTemp$44;
                var24[var34] = fieldTemp$44;
                kh.field_c[var35Lifetime1Lifetime1] = param17[var34];
                hk.field_q[var35Lifetime1Lifetime1] = param1[var34];
                sa.field_c[var35Lifetime1Lifetime1] = param6[var34];
              }
              pd.field_a[var39Lifetime1Lifetime1] = var35Lifetime1Lifetime1;
              var35Lifetime1Lifetime1 = var25[var34];
              if (var35Lifetime1Lifetime1 < 0) {
                fieldTemp$45 = no.field_b;
                no.field_b = no.field_b + 1;
                var35Lifetime1Lifetime1 = fieldTemp$45;
                var25[var34] = fieldTemp$45;
                lf.field_z[var35Lifetime1Lifetime1] = param17[var34];
                ga.field_hb[var35Lifetime1Lifetime1] = param1[var34];
                rn.field_z[var35Lifetime1Lifetime1] = param6[var34];
              }
              ln.field_g[var39Lifetime1Lifetime1] = var35Lifetime1Lifetime1;
              var34 = param12[var39Lifetime1Lifetime1];
              var35Lifetime1Lifetime1 = var24[var34];
              if (0 > var35Lifetime1Lifetime1) {
                fieldTemp$46 = jd.field_d;
                jd.field_d = jd.field_d + 1;
                var35Lifetime1Lifetime1 = fieldTemp$46;
                var24[var34] = fieldTemp$46;
                kh.field_c[var35Lifetime1Lifetime1] = param17[var34];
                hk.field_q[var35Lifetime1Lifetime1] = param1[var34];
                sa.field_c[var35Lifetime1Lifetime1] = param6[var34];
              }
              da.field_k[var39Lifetime1Lifetime1] = var35Lifetime1Lifetime1;
              var35Lifetime1Lifetime1 = var25[var34];
              if (var35Lifetime1Lifetime1 < 0) {
                fieldTemp$47 = no.field_b;
                no.field_b = no.field_b + 1;
                var35Lifetime1Lifetime1 = fieldTemp$47;
                var25[var34] = fieldTemp$47;
                lf.field_z[var35Lifetime1Lifetime1] = param17[var34];
                ga.field_hb[var35Lifetime1Lifetime1] = param1[var34];
                rn.field_z[var35Lifetime1Lifetime1] = param6[var34];
              }
              cg.field_e[var39Lifetime1Lifetime1] = var35Lifetime1Lifetime1;
              var39Lifetime1Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var24_ref = decompiledCaughtException;
          stackIn_354_0 = var24_ref;
          stackIn_354_1 = new StringBuilder().append("nq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_355_2 = "null";
          } else {
            stackIn_355_2 = "{...}";
          }
          stackIn_358_1 = ((StringBuilder) (Object) stackIn_354_1).append(stackIn_355_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_359_2 = "null";
          } else {
            stackIn_359_2 = "{...}";
          }
          stackIn_362_1 = ((StringBuilder) (Object) stackIn_358_1).append(stackIn_359_2).append(',');
          if (param4 == null) {
            stackIn_363_2 = "null";
          } else {
            stackIn_363_2 = "{...}";
          }
          stackIn_366_1 = ((StringBuilder) (Object) stackIn_362_1).append(stackIn_363_2).append(',');
          if (param5 == null) {
            stackIn_367_2 = "null";
          } else {
            stackIn_367_2 = "{...}";
          }
          stackIn_370_1 = ((StringBuilder) (Object) stackIn_366_1).append(stackIn_367_2).append(',');
          if (param6 == null) {
            stackIn_371_2 = "null";
          } else {
            stackIn_371_2 = "{...}";
          }
          stackIn_374_1 = ((StringBuilder) (Object) stackIn_370_1).append(stackIn_371_2).append(',');
          if (param7 == null) {
            stackIn_375_2 = "null";
          } else {
            stackIn_375_2 = "{...}";
          }
          stackIn_378_1 = ((StringBuilder) (Object) stackIn_374_1).append(stackIn_375_2).append(',');
          if (param8 == null) {
            stackIn_379_2 = "null";
          } else {
            stackIn_379_2 = "{...}";
          }
          stackIn_382_1 = ((StringBuilder) (Object) stackIn_378_1).append(stackIn_379_2).append(',');
          if (param9 == null) {
            stackIn_383_2 = "null";
          } else {
            stackIn_383_2 = "{...}";
          }
          stackIn_386_1 = ((StringBuilder) (Object) stackIn_382_1).append(stackIn_383_2).append(',');
          if (param10 == null) {
            stackIn_387_2 = "null";
          } else {
            stackIn_387_2 = "{...}";
          }
          stackIn_390_1 = ((StringBuilder) (Object) stackIn_386_1).append(stackIn_387_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_391_2 = "null";
          } else {
            stackIn_391_2 = "{...}";
          }
          stackIn_394_1 = ((StringBuilder) (Object) stackIn_390_1).append(stackIn_391_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_395_2 = "null";
          } else {
            stackIn_395_2 = "{...}";
          }
          stackIn_398_1 = ((StringBuilder) (Object) stackIn_394_1).append(stackIn_395_2).append(',');
          if (param18 == null) {
            stackIn_399_2 = "null";
          } else {
            stackIn_399_2 = "{...}";
          }
          stackIn_402_1 = ((StringBuilder) (Object) stackIn_398_1).append(stackIn_399_2).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_403_2 = "null";
          } else {
            stackIn_403_2 = "{...}";
          }
          stackIn_406_1 = ((StringBuilder) (Object) stackIn_402_1).append(stackIn_403_2).append(',').append(param21).append(',').append(param22).append(',');
          if (param23 == null) {
            stackIn_407_2 = "null";
          } else {
            stackIn_407_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_354_0), ((StringBuilder) (Object) stackIn_406_1).append(stackIn_407_2).append(')').toString());
        }
    }

    final byte[] a(byte param0) {
        RuntimeException var2 = null;
        byte[] stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_z) {
            throw new RuntimeException();
          }
          if (param0 == -106) {
            stackIn_7_0 = this.field_L;
            return stackIn_7_0;
          }
          stackIn_5_0 = (byte[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "nq.F(" + param0 + ')');
        }
    }

    final static cr a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, cc param7, int param8, int param9, int param10, int param11, int param12) {
        cr var13 = null;
        RuntimeException var13_ref = null;
        cr stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param10 < 68) {
            nq.a(-57, (int[]) null, 62, (int[]) null, (int[]) null, (byte[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -30, (int[]) null, 85, 74, -104, -52, (int[]) null, (int[]) null, -25, (lg) null, -20, 0, (int[]) null);
          }
          var13 = new cr(0L, (cr) null);
          var13.field_Bb = fk.c(-127, param5, param9);
          var13.field_Q = fk.c(-127, param12, param2);
          var13.field_cb = fk.c(-127, param3, param6);
          var13.field_T = fk.c(-128, param0, param4);
          var13.field_gb = fk.c(-127, param11, param8);
          var13.field_A = param1;
          var13.field_z = param7;
          stackIn_4_0 = var13;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_8_0 = var13_ref;
          stackIn_8_1 = new StringBuilder().append("nq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    public static void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_I = null;
          field_J = null;
          if (param0 > -120) {
            nq.a(57, -73, 44, 92, 52, -107, 58, (cc) null, -88, 65, 75, 44, 36);
          }
          field_G = null;
          field_K = null;
          field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "nq.B(" + param0 + ')');
        }
    }

    final int i(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_z) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param0 < 100) {
            this.field_L = (byte[]) null;
          }
          stackIn_9_0 = 100;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "nq.D(" + param0 + ')');
        }
    }

    nq() {
    }

    static {
        field_G = new int[]{17, 18, 7};
        field_J = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_I = "Players: <%0>/<%1>";
        field_K = "Create";
    }
}
