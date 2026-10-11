/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static fj field_b;
    static int field_c;
    static id[] field_a;

    final static void a(bj param0, byte param1, bj param2) {
        try {
          uk.field_xb = param2;
          if (param1 <= 68) {
            im.a(-65);
          }
          wk.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "im.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6776) {
          return;
        }
        field_b = null;
    }

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        jn var4_ref_jn = null;
        int var4 = 0;
        jn var5 = null;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        try {
          if (qd.field_Q != pb.field_c) {
            return false;
          }
          var2_long = sf.a((byte) 116);
          if (qc.field_f != param1 &&
            qh.field_a < 0) {
            var4_ref_jn = (jn) (mc.field_m.b(74));
            if (var4_ref_jn != null &&
              var2_long > var4_ref_jn.field_o) {
              var4_ref_jn.b(34);
              rj.field_d = var4_ref_jn.field_s.length;
              kj.field_a.field_o = 0;
              for (var5_int = 0; rj.field_d > var5_int; var5_int++) {
                kj.field_a.field_u[var5_int] = var4_ref_jn.field_s[var5_int];
              }
              lc.field_s = rd.field_a;
              rd.field_a = ud.field_a;
              ud.field_a = oj.field_K;
              oj.field_K = var4_ref_jn.field_q;
              return true;
            }
          }
          while (true) {
            if (0 > qh.field_a) {
              kj.field_a.field_o = 0;
              if (!ta.a(param1 ^ 0, 1)) {
                return false;
              }
              qh.field_a = kj.field_a.e((byte) 0);
              kj.field_a.field_o = 0;
              rj.field_d = param0[qh.field_a];
            }
            if (!kj.b(-9319)) {
              return false;
            }
            if (0 == qc.field_f) {
              lc.field_s = rd.field_a;
              rd.field_a = ud.field_a;
              ud.field_a = oj.field_K;
              oj.field_K = qh.field_a;
              qh.field_a = -1;
              return true;
            }
            var4 = qc.field_f;
            if (ci.field_k != 0.0) {
              var4 = (int)((double)var4 + dk.field_a.nextGaussian() * ci.field_k);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new jn((long)var4 + var2_long, qh.field_a, new byte[rj.field_d]);
            for (var6 = 0; rj.field_d > var6; var6++) {
              var5.field_s[var6] = kj.field_a.field_u[var6];
            }
            mc.field_m.a((byte) 50, var5);
            qh.field_a = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("im.G(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        bd.field_c = sl.e(105);
        if (param0 != 79) {
          return;
        }
        mb.field_b = new hm();
        ie.a(true, true, -57);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = re.a(param2, 0);
          if (~param0.indexOf(param2) == param1 &&
            param0.indexOf(var3) == -1) {
            stackIn_12_0 = (param0.startsWith(param2)) || (param0.startsWith(var3)) || (param0.endsWith(param2)) || (param0.endsWith(var3));
            return stackIn_12_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("im.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static sj[] b(int param0) {
        if (param0 <= 103) {
          return (sj[]) null;
        }
        return new sj[]{ak.field_b, hj.field_e, li.field_d};
    }

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
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
        sb var16 = null;
        sb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = MinerDisturbance.field_ab;
        try {
          var16 = new sb(param1);
          var17 = var16;
          var17.field_o = -2 + param1.length;
          sc.field_d = var17.e(-120);
          db.field_b = new byte[sc.field_d][];
          jk.field_gb = new boolean[sc.field_d];
          oc.field_e = new int[sc.field_d];
          bg.field_d = new int[sc.field_d];
          ng.field_e = new int[sc.field_d];
          qk.field_b = new int[sc.field_d];
          ci.field_a = new byte[sc.field_d][];
          var17.field_o = -(8 * sc.field_d) + param1.length - 7;
          pf.field_c = var17.e(-72);
          wd.field_a = var17.e(-68);
          var3 = 1 + (var17.d((byte) -54) & 255);
          for (var4 = 0; sc.field_d > var4; var4++) {
            bg.field_d[var4] = var16.e(-89);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < sc.field_d; var4Lifetime1++) {
            oc.field_e[var4Lifetime1] = var17.e(-43);
          }
          if (param0 > -4) {
            field_a = (id[]) null;
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < sc.field_d; var4Lifetime2++) {
            qk.field_b[var4Lifetime2] = var17.e(-120);
          }
          for (var4Lifetime3 = 0; sc.field_d > var4Lifetime3; var4Lifetime3++) {
            ng.field_e[var4Lifetime3] = var17.e(-118);
          }
          var17.field_o = -(var3 * 3) + (3 + (-(sc.field_d * 8) + param1.length) - 7);
          af.field_p = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            af.field_p[var4Lifetime4] = var17.i(71);
            if (af.field_p[var4Lifetime4] == 0) {
              af.field_p[var4Lifetime4] = 1;
            }
          }
          var17.field_o = 0;
          for (var4Lifetime5 = 0; sc.field_d > var4Lifetime5; var4Lifetime5++) {
            var5 = qk.field_b[var4Lifetime5];
            var6 = ng.field_e[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            db.field_b[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            ci.field_a[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.d((byte) -54);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.m(4);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.m(4);
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
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var5 * var13] = var17.m(4);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var17.m(4);
                    var9[var5 * var13 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (var14 == -1) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            jk.field_gb[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("im.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_c = -1;
    }
}
