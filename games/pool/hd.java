/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends ob {
    static int field_J;
    static int field_H;
    static String field_K;
    static int field_I;

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_K = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3;
        dd var4;
        var3 = Pool.field_O;
        pn.field_l.a(0, 0);
        if (cm.f((byte) 109)) {
          ae.a(-2);
          if (!ea.field_l) {
            for (var2 = 0; var2 < cr.field_m.field_D.length; var2++) {
              if ((cr.field_m.field_D[var2] & -16777216) == 0 &&
                0 != (cr.field_m.field_D[var2] & 16777215)) {
                cr.field_m.field_D[var2] = md.a(cr.field_m.field_D[var2], -16777216);
              }
            }
            ea.field_l = true;
            ae.a(-2);
          }
        }
        if (param0 <= 36) {
          var4 = (dd) null;
          hd.a(-122, -16, 103, (dd) null, 91, -103, -122, -85);
        }
    }

    final static void a(int param0, int param1, boolean param2, int[] param3, int[] param4, int[] param5, int[] param6) {
        int var7_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pool.field_O;
        try {
          if (!param2) {
            return;
          }
          for (var7_int = param1; param0 > var7_int; var7_int++) {
            var8 = param3[var7_int];
            var9 = param5[var7_int];
            var10 = param4[var7_int];
            param3[var7_int] = (var8 * param6[3] - (-(param6[4] * var9) - var10 * param6[5]) >> 16) + param6[0];
            param5[var7_int] = (param6[6] * var8 + param6[7] * var9 + var10 * param6[8] >> 16) + param6[1];
            param4[var7_int] = param6[2] + (param6[11] * var10 + (var9 * param6[10] + var8 * param6[9]) >> 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("hd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    hd(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super((dd) null, param0, param1, param2, param3, param4, param5);
    }

    final void d(int param0) {
        int var2 = 0;
        if (param0 == -1) {
          var2 = fd.a(!ue.a(11) ? true : false, (byte) 65);
        } else {
          hd.b(false);
          var2 = fd.a(!ue.a(11) ? true : false, (byte) 65);
        }
        if (3 == var2) {
          if (ne.field_u != null) {
            tq.d((byte) -106);
          }
          s.a(hk.d(58), 2056898529);
        }
        if (var2 == 1) {
          fq.a(-3405, 0, sq.field_b, false);
        }
        if (var2 == 2) {
          fq.a(-3405, 0, sq.field_b, true);
        }
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        dd var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = Pool.field_O;
        try {
          if (qh.field_b > param6) {
            param5 = param5 - (-param6 + qh.field_b);
            param6 = qh.field_b;
          }
          if (qh.field_j < param6 + param5) {
            param5 = qh.field_j - param6;
          }
          if (param7 < qh.field_c) {
            param2 = param2 - (qh.field_c - param7);
            param7 = qh.field_c;
          }
          if (param2 + param7 > qh.field_g) {
            param2 = qh.field_g - param7;
          }
          if (param5 > 0 &&
            0 < param2) {
            var21 = param3.d();
            var30 = qh.field_d;
            var10 = qh.field_l;
            var11 = qh.field_f;
            var29 = new int[param4];
            qh.a(var29);
            param3.e();
            qh.d(var29[0], var29[1], var29[2], var29[3]);
            var13 = param6 + param3.field_z * param7;
            var14 = param3.field_z - param5;
            var25 = var21.field_D;
            var22 = var25;
            var15 = var22;
            for (var16 = param7; var16 < param7 + param2; var16++) {
              for (var17 = param6; var17 < param5 + param6; var17++) {
                var18 = var25[var13];
                if (var18 != 0) {
                  if (var17 > 0 &&
                    0 == var15[-1 + var13]) {
                    qh.a(var17, var16, param1, param0);
                  } else {
                    if (var16 > 0 &&
                      var15[var13 - param3.field_z] == 0) {
                      qh.a(var17, var16, param1, param0);
                    } else {
                      if (var17 < param3.field_z - 1 &&
                        0 == var15[1 + var13]) {
                        qh.a(var17, var16, param1, param0);
                      } else {
                        if (var16 < param3.field_A - 1 &&
                          0 == var15[param3.field_z + var13]) {
                          qh.a(var17, var16, param1, param0);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.c(-param3.field_G, -param3.field_B);
            qh.a(var30, var10, var11);
            qh.b(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_42_0 = var8;
          stackIn_42_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_K = "Security";
    }
}
