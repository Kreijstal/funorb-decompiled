/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_a;
    static bi[] field_b;

    public static void a(byte param0) {
        field_b = null;
        int var1 = 36 / ((-14 - param0) / 59);
    }

    final static bi a(boolean param0, ln param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        bi stackIn_6_0 = null;
        bi stackIn_22_0 = null;
        bi stackIn_24_0 = null;
        bi stackIn_26_0 = null;
        bi stackIn_28_0 = null;
        bi stackIn_30_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0) {
            field_b = (bi[]) null;
          }
          if (param1.field_I.equalsIgnoreCase("Sol")) {
            stackIn_6_0 = qe.field_j;
            return stackIn_6_0;
          }
          var2_int = param1.field_B;
          if (var2_int == 0) {
            stackIn_22_0 = bj.field_H;
            return stackIn_22_0;
          }
          if (1 == var2_int) {
            stackIn_24_0 = tk.field_x;
            return stackIn_24_0;
          }
          if (var2_int == 2) {
            stackIn_26_0 = ta.field_a;
            return stackIn_26_0;
          }
          if (3 == var2_int) {
            return be.field_k;
          }
          if (var2_int == 4) {
            return rl.field_c;
          }
          if (5 == var2_int) {
            stackIn_28_0 = kr.field_d;
            return stackIn_28_0;
          }
          if (var2_int == 6) {
            return rk.field_k;
          }
          if (var2_int == 7) {
            return ti.field_h;
          }
          if (var2_int != 8) {
            throw new RuntimeException("No image for this type of system: " + param1.field_B);
          }
          stackIn_30_0 = cp.field_t;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("uk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static l a(int param0, dc param1, ob param2, pf param3, fs[] param4, fs param5, byte param6, vr param7) throws jn, kr {
        int var17_int = 0;
        l stackIn_81_0 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15_int = 0;
        l var15 = null;
        ln[] var16_ref_ln__ = null;
        int var16 = 0;
        sd[] var17 = null;
        int var18 = 0;
        ln var18_ref_ln = null;
        lo[] var19 = null;
        fs var19_ref = null;
        int var20 = 0;
        ln var20_ref_ln = null;
        int var21 = 0;
        ln var21_ref_ln = null;
        sd var21_ref_sd = null;
        fs var21_ref_fs = null;
        int var22 = 0;
        ln var22_ref_ln = null;
        int var23 = 0;
        ln var23_ref_ln = null;
        int var24 = 0;
        fs var25 = null;
        cs var25_ref = null;
        int var26 = 0;
        ln var27 = null;
        fs var28 = null;
        ln var29 = null;
        fs var30 = null;
        ln var31 = null;
        lo[] var32 = null;
        ln var33 = null;
        ln var34 = null;
        ln var35 = null;
        fs[] var36 = null;
        fs var37 = null;
        ln var22_ref_lnLifetime1;
        ln var22_ref_lnLifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var21Lifetime5;
        int var22Lifetime1;
        int var22Lifetime2;
        int var24Lifetime1;
        int var24Lifetime2;
        int var18Lifetime1;
        var26 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var8_int = param2.a(16711680);
          var9 = param2.f(param6 - 20969);
          var10 = param2.f(param6 - 20969);
          var11 = param2.f(-20976);
          var12 = hl.a(-33, var9);
          var13 = sa.a(var10, -109);
          if (param6 != -7) {
            var27 = (ln) null;
            uk.a(false, (ln) null);
          }
          var15_int = param0;
          if (var15_int != 0 &&
            var15_int != 2) {
            if (var15_int == 1) {
              var14 = new sh(param2, var8_int);
            } else {
              if (3 != var15_int) {
                throw new RuntimeException("No Received MapGenerator for gametype " + param0);
              }
              var14 = new mr(param2, var8_int, var12, var13, var11, param4.length);
            }
          } else {
            var14 = new rd(param2, var8_int, var12, var13, var11);
          }
          var15 = ((fo) (var14)).a((byte) -115);
          var16_ref_ln__ = var15.field_e;
          for (var17_int = 0; var16_ref_ln__.length > var17_int; var17_int++) {
            var18_ref_ln = var16_ref_ln__[var17_int];
            var22_ref_ln = var18_ref_ln;
            var22_ref_lnLifetime2 = var18_ref_ln;
            var18_ref_ln.field_t = us.a(param2, param4, 2);
          }
          var16 = param2.j(-71);
          var17 = new sd[var16];
          for (var18 = 0; var16 > var18; var18++) {
            var28 = param4[param2.j(-123)];
            var19_ref = var28;
            var20_ref_ln = var15.field_e[param2.j(-123)];
            var17[var18] = new sd(var28, var20_ref_ln);
            var28.field_i.a((byte) -113, var17[var18]);
            var17[var18].a(param6 ^ 21772, var20_ref_ln);
            var20_ref_ln.field_R = var17[var18];
            var20_ref_ln.field_y = var19_ref;
            var21 = -1 + param2.j(-89);
            for (var22 = 0; var22 < var21; var22++) {
              var29 = var15.field_e[param2.j(-90)];
              var23_ref_ln = var29;
              var17[var18].a(-21771, var29);
              var23_ref_ln.field_R = var17[var18];
              var23_ref_ln.field_y = var19_ref;
            }
          }
          var18Lifetime1 = param2.j(param6 ^ 71);
          var32 = new lo[var18Lifetime1];
          var19 = var32;
          for (var20 = 0; var18Lifetime1 > var20; var20++) {
            var30 = param4[param2.j(-69)];
            var21_ref_fs = var30;
            var31 = var15.field_e[param2.j(-64)];
            var19[var20] = new lo(var30, var31);
            var21_ref_fs.field_m = var32[var20];
            var32[var20].a(-21771, var31);
            var23 = param2.j(-61) - 1;
            for (var24 = 0; var23 > var24; var24++) {
              var33 = var15.field_e[param2.j(-60)];
              var32[var20].a(-21771, var33);
            }
          }
          var15.b((byte) 80);
          for (var20Lifetime1 = 0; var20Lifetime1 < param4.length; var20Lifetime1++) {
            if (!param7.field_i) {
              var21_ref_sd = (sd) (param4[var20Lifetime1].field_i.d(0));
              while (var21_ref_sd != null) {
                vf.a(127, var21_ref_sd);
                sh.a(var21_ref_sd, -5);
                var22_ref_lnLifetime1 = var21_ref_sd.j(18229);
                while (var22_ref_lnLifetime1 != null) {
                  kd.a(param7, false, var22_ref_lnLifetime1, (byte) -2);
                  var22_ref_lnLifetime1 = var21_ref_sd.h(param6 ^ 23415);
                }
                var21_ref_sd = (sd) (param4[var20Lifetime1].field_i.a((byte) -71));
              }
            } else {
              if (null != param4[var20Lifetime1].field_m) {
                vf.a(123, param4[var20Lifetime1].field_m);
                sh.a(param4[var20Lifetime1].field_m, -5);
                var21_ref_ln = param4[var20Lifetime1].field_m.j(18229);
                while (var21_ref_ln != null) {
                  kd.a(param7, false, var21_ref_ln, (byte) -2);
                  var21_ref_ln = param4[var20Lifetime1].field_m.h(-23410);
                }
              }
            }
          }
          for (var20Lifetime2 = 0; var20Lifetime2 < param4.length; var20Lifetime2++) {
            for (var21Lifetime1 = 0; param4.length > var21Lifetime1; var21Lifetime1++) {
              param4[var20Lifetime2].field_h[var21Lifetime1] = false;
            }
          }
          for (var20Lifetime3 = 0; var20Lifetime3 < param4.length; var20Lifetime3++) {
            for (var21Lifetime2 = 1 + var20Lifetime3; param4.length > var21Lifetime2; var21Lifetime2++) {
              var22Lifetime1 = param2.g(-2852);
              if (127 != var22Lifetime1) {
                param4[var20Lifetime3].field_h[var21Lifetime2] = true;
                param4[var21Lifetime2].field_h[var20Lifetime3] = true;
                param4[var20Lifetime3].field_f[var21Lifetime2] = var22Lifetime1;
                param4[var21Lifetime2].field_f[var20Lifetime3] = var22Lifetime1;
              }
            }
          }
          if (param5 != null) {
            param5.field_w = param2.j(param6 ^ 98);
          }
          for (var20Lifetime4 = 0; param4.length > var20Lifetime4; var20Lifetime4++) {
            for (var21Lifetime3 = 0; var21Lifetime3 < 4; var21Lifetime3++) {
              param4[var20Lifetime4].field_u[var21Lifetime3] = param2.j(-115);
            }
          }
          param3.a(0);
          var20Lifetime5 = param2.j(-115);
          var21Lifetime4 = 0;
          while (var20Lifetime5 > var21Lifetime4) {
            var34 = gq.a(var15.field_e, -2284, param2);
            var35 = gq.a(var15.field_e, -2284, param2);
            if (var34 != null &&
              var35 != null) {
              var24Lifetime1 = param2.j(-73);
              var25_ref = new cs(var34, var35, var24Lifetime1);
              param3.a((byte) -113, var25_ref);
              var21Lifetime4++;
              continue;
            }
            throw new kr("Tannhauser Gate is unconnected at at least one end.");
          }
          param1.field_x.a(param2, (byte) -109);
          var21Lifetime5 = param2.j(param6 - 63);
          var22Lifetime2 = param2.j(param6 - 55);
          param1.a(var22Lifetime2, var21Lifetime5, false);
          var36 = param4;
          for (var24Lifetime2 = 0; var24Lifetime2 < var36.length; var24Lifetime2++) {
            var37 = var36[var24Lifetime2];
            var25 = var37;
            if (var37.field_m == null) {
              var25.field_m = new lo(var37, (ln) null);
            }
          }
          stackIn_81_0 = var15;
          return stackIn_81_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_84_0 = var8;
          stackIn_84_1 = new StringBuilder().append("uk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',');
          if (param2 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          stackIn_90_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',');
          if (param3 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_93_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',');
          if (param4 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          stackIn_96_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',');
          if (param5 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          stackIn_99_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_84_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(')').toString());
        }
    }

    static {
    }
}
