/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tfa extends pp {
    public tfa() {
    }

    final void a(lu param0, byte param1) {
        try {
          super.a(param0, (byte) -57);
          int var3_int = -49 % ((34 - param1) / 58);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tfa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = param1.charAt(0);
          for (var3 = 1; var3 < param1.length(); var3++) {
            if (~var2_int != ~param1.charAt(var3)) {
              return false;
            }
          }
          var4 = -97 % ((param0 + 55) / 36);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("tfa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        String[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        String stackIn_64_2 = null;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_70_2 = null;
        boolean stackIn_91_0 = false;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = BachelorFridge.field_y;
        try {
          ub.field_j = param0;
          if (param1 != 1) {
            return;
          }
          fr.field_n = true;
          if (ub.field_j == 0) {
            var3_int = ut.a(ec.field_a, wfa.field_s, oa.field_wb, jk.field_o, -125);
            var4 = var3_int + 3;
            fr.field_l = new int[var4];
            mj.field_h = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              fr.field_l[var5] = -1;
            }
            mu.field_l = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              mj.field_h[var5] = ec.field_a[var5];
            }
            mj.field_h[-3 + var4] = "";
            mj.field_h[-2 + var4] = ko.field_h;
            fr.field_l[var4 - 2] = 0;
            mu.field_l[0] = 4;
            mj.field_h[-1 + var4] = ala.field_d;
            fr.field_l[-1 + var4] = 1;
            mu.field_l[1] = 5;
          } else if (ub.field_j == 1) {
            var3_int = ut.a(ec.field_a, wfa.field_s, oa.field_wb, jk.field_o, 125);
            var4 = var3_int + 2;
            fr.field_l = new int[var4];
            mj.field_h = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              fr.field_l[var5] = -1;
            }
            mu.field_l = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              mj.field_h[var5] = ec.field_a[var5];
            }
            mj.field_h[-2 + var4] = "";
            mj.field_h[-1 + var4] = ala.field_d;
            fr.field_l[-1 + var4] = 0;
            mu.field_l[0] = 5;
          } else if (2 != ub.field_j) {
            if (ub.field_j == 3) {
              if (!ju.field_r.field_k) {
                var3_int = ut.a(ec.field_a, wfa.field_s, qca.field_l, jk.field_o, -10);
              } else {
                var3_int = ut.a(ec.field_a, wfa.field_s, ej.field_o, jk.field_o, -5);
              }
              var4 = var3_int + 2;
              fr.field_l = new int[var4];
              mj.field_h = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                fr.field_l[var5] = -1;
              }
              mu.field_l = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                mj.field_h[var5] = ec.field_a[var5];
              }
              mj.field_h[var4 - 2] = "";
              mj.field_h[-1 + var4] = ala.field_d;
              fr.field_l[var4 - 1] = 0;
              mu.field_l[0] = 5;
            } else if (ub.field_j == 4) {
              var3_int = ut.a(ec.field_a, wfa.field_s, cn.field_k, jk.field_o, 2);
              var4 = var3_int + 2;
              mj.field_h = new String[var4];
              fr.field_l = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                fr.field_l[var5] = -1;
              }
              mu.field_l = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                mj.field_h[var5] = ec.field_a[var5];
              }
              mj.field_h[var4 - 2] = "";
              mj.field_h[-1 + var4] = ala.field_d;
              fr.field_l[-1 + var4] = 0;
              mu.field_l[0] = 5;
            } else {
              if (ub.field_j != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = ut.a(ec.field_a, wfa.field_s, jia.field_l, jk.field_o, -126);
              var4 = var3_int + 3;
              fr.field_l = new int[var4];
              mj.field_h = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                fr.field_l[var5] = -1;
              }
              mu.field_l = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                mj.field_h[var5] = ec.field_a[var5];
              }
              mj.field_h[var4 - 3] = "";
              mj.field_h[var4 - 2] = ifa.field_p;
              fr.field_l[-2 + var4] = 0;
              mu.field_l[0] = 3;
              mj.field_h[-1 + var4] = ala.field_d;
              fr.field_l[-1 + var4] = 1;
              mu.field_l[1] = 5;
            }
          } else {
            var3_int = ut.a(ec.field_a, wfa.field_s, lga.a(true, new String[]{"<br><%0><br>"}, vv.field_b), jk.field_o, param1 ^ 126);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(ec.field_a[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            vka.field_p = new String[var4];
            bl.a(ec.field_a, 0, vka.field_p, 0, var4);
            wba.field_a = new String[var3_int - var4 - 1];
            bl.a(ec.field_a, var4 + 1, wba.field_a, 0, var3_int - var4 - 1);
            var3_int = ut.a(ec.field_a, wfa.field_s, lga.a(true, new String[]{"<br><%0><br>"}, sc.field_l), jk.field_o, -54);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(ec.field_a[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            mq.field_a = new String[var4];
            bl.a(ec.field_a, 0, mq.field_a, 0, var4);
            ta.field_b = new String[-1 - var4 + var3_int];
            bl.a(ec.field_a, 1 + var4, ta.field_b, 0, -1 + var3_int - var4);
            if (vka.field_p.length >= mq.field_a.length) {
              stackIn_53_0 = vka.field_p.length;
            } else {
              stackIn_53_0 = mq.field_a.length;
            }
            var5 = stackIn_53_0;
            if (wba.field_a.length >= ta.field_b.length) {
              stackIn_56_0 = wba.field_a.length;
            } else {
              stackIn_56_0 = ta.field_b.length;
            }
            var6 = stackIn_56_0;
            var7 = var6 + 7 + var5;
            mj.field_h = new String[var7];
            fr.field_l = new int[var7];
            for (var8 = 0; var8 < var7; var8++) {
              fr.field_l[var8] = -1;
            }
            mj.field_h[0] = tla.field_s;
            fr.field_l[1] = 0;
            mj.field_h[1] = mja.field_r;
            mu.field_l = new int[2];
            mj.field_h[2] = cj.field_g;
            mu.field_l[0] = 5;
            mj.field_h[5] = "";
            fr.field_l[3] = 1;
            mj.field_h[4] = ck.field_e;
            mu.field_l[1] = 2;
            mj.field_h[3] = hk.field_b;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_63_0 = mj.field_h;
              stackIn_63_1 = var8Lifetime2 + 6;
              if (-var5 + var8Lifetime2 + mq.field_a.length >= 0) {
                stackIn_64_2 = mq.field_a[mq.field_a.length + (var8Lifetime2 - var5)];
              } else {
                stackIn_64_2 = "";
              }
              stackIn_63_0[stackIn_63_1] = stackIn_64_2;
            }
            mj.field_h[6 + var5] = null;
            fr.field_l[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_69_0 = mj.field_h;
              stackIn_69_1 = var8Lifetime3 + 7 + var5;
              if (ta.field_b.length > var8Lifetime3) {
                stackIn_70_2 = ta.field_b[var8Lifetime3];
              } else {
                stackIn_70_2 = "";
              }
              stackIn_69_0[stackIn_69_1] = stackIn_70_2;
            }
            ph.field_P = f.b((byte) 73);
          }
          dp.field_o.field_e = mu.field_l.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; mj.field_h.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_91_0 = !(fr.field_l[var4Lifetime1] < 0);
            var5Lifetime1 = gg.a(stackIn_91_0, -54, mj.field_h[var4Lifetime1]);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (ub.field_j == 2) {
            var10 = vka.field_p;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = gg.a(false, -46, var11);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = wba.field_a;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = gg.a(false, -120, var12);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          io.field_p = mg.field_k - (var3_intLifetime1 >> 1);
          qk.field_l = (um.field_d + cba.field_d << 1) * dp.field_o.field_e;
          rj.field_i = var3_intLifetime1 + mg.field_k - (var3_intLifetime1 >> 1);
          for (var4Lifetime2 = 0; mj.field_h.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_116_0 = qk.field_l;
            if (fr.field_l[var4Lifetime2] < 0) {
              stackIn_117_1 = mm.field_z;
            } else {
              stackIn_117_1 = hc.field_D;
            }
            qk.field_l = stackIn_116_0 + stackIn_117_1;
          }
          ql.field_s = qaa.field_c - (qk.field_l >> 1);
          a.field_m = new int[mj.field_h.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = ql.field_s;
          while (mj.field_h.length > var4Lifetime3) {
            var6Lifetime1 = fr.field_l[var4Lifetime3];
            if (0 > var6Lifetime1) {
              var5Lifetime3 = var5Lifetime3 + mm.field_z;
            } else {
              var7Lifetime2 = gg.a(true, -84, mj.field_h[var4Lifetime3]);
              var5Lifetime3 = var5Lifetime3 + cba.field_d;
              var8Lifetime1 = mg.field_k - (var7Lifetime2 >> 1);
              a.field_m[var4Lifetime3] = new int[4];
              a.field_m[var4Lifetime3][0] = -vt.field_k + var8Lifetime1;
              a.field_m[var4Lifetime3][1] = var5Lifetime3;
              a.field_m[var4Lifetime3][2] = var7Lifetime2 + (vt.field_k << 1);
              a.field_m[var4Lifetime3][3] = (um.field_d << 1) + hc.field_D;
              var5Lifetime3 = var5Lifetime3 + (hc.field_D + cba.field_d + (um.field_d << 1));
            }
            var4Lifetime3++;
          }
          if (2 == ub.field_j) {
            dp.field_o.a(param2, 46, -1, -1);
          } else {
            dp.field_o.a(param2, 90, rla.a(mk.field_p, gd.field_m, param1 ^ -128), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "tfa.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(aga param0, op param1, int param2) {
        try {
          param1.field_l = true;
          if (param2 != 12) {
            String var5 = (String) null;
            tfa.a(-11, (String) null);
          }
          param1.field_F = 0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "tfa.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
