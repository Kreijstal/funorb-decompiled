/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id {
    static jk field_c;
    static int field_b;
    static String field_d;
    static dd[] field_a;

    abstract void a(java.awt.Component param0, int param1);

    final static vh a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, lr param9, int param10, int param11, int param12) {
        vh var13 = null;
        RuntimeException var13_ref = null;
        vh stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new vh((long)param1, (vh) null);
          var13.field_F = jr.a(param12, (byte) 20, param4);
          var13.field_Gb = jr.a(param7, (byte) 20, param10);
          var13.field_X = jr.a(param0, (byte) 20, param11);
          var13.field_Kb = jr.a(param3, (byte) 20, param6);
          var13.field_Y = jr.a(param5, (byte) 20, param8);
          var13.field_N = param2;
          var13.field_I = param9;
          stackIn_1_0 = var13;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_4_0 = var13_ref;
          stackIn_4_1 = new StringBuilder().append("id.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final static iq a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          iq var5 = null;
          jf var5_ref = null;
          iq stackIn_3_0 = null;
          jf stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("vo");
              var5 = (iq) (var4.newInstance());
              if (param2 >= -41) {
                field_c = (jk) null;
              }
              var5.a(param1, param0, -6980, param3);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new jf();
              ((iq) ((Object) var5_ref)).a(param1, param0, -6980, param3);
              stackIn_5_0 = var5_ref;
              return (iq) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("id.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= -8) {
          return;
        }
        ug.field_u = hj.field_l;
        uf.field_X = 0;
        rj.field_f = 0;
        li.field_d = 0;
        jc.field_j = new ia(2);
        jc.field_j.a(param1, -1, ho.a((byte) -84, wn.field_i, gg.field_f), true);
    }

    final static void c(int param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        eh var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        oj var6_ref_oj = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        oq var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Pool.field_O;
        try {
          if (param0 < 95) {
            id.a(33, true);
          }
          var27 = kn.field_e;
          var2 = var27.g(-107);
          if (var2 == 0) {
            var3 = var27.d(-1034);
            var4 = (eh) (wg.field_Lb.c((byte) -36));
            while (var4 != null) {
              if (var3 != var4.field_A) {
                var4 = (eh) (wg.field_Lb.f((byte) -5));
                continue;
              }
              break;
            }
            if (var4 == null) {
              dn.c(118);
              return;
            }
            var5 = var27.g(-79);
            if (0 != var5) {
              var6 = var4.field_r;
              rq.field_y[0].field_b = null;
              rq.field_y[0].field_c = false;
              rq.field_y[0].field_f = di.field_j;
              var7 = var4.field_v;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                rq.field_y[var8_int].field_f = var27.j(-76);
                rq.field_y[var8_int].field_c = false;
                if (1 != var27.g(-60)) {
                  rq.field_y[var8_int].field_b = null;
                } else {
                  rq.field_y[var8_int].field_b = var27.j(-126);
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_m = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_q = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_z = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.g(-112);
              if (0 < var18) {
                for (var19 = 0; var18 > var19; var19++) {
                  var20 = var27.g(-105);
                  var21 = rq.field_y[var20].field_f;
                  var22 = var27.h(-412303328);
                  var24 = var27.field_v;
                  if (var6 > var19) {
                    var8[0][var12] = var21;
                    var9[0][var12] = rq.field_y[var20].field_b;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var25 < var7; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.b(true);
                    }
                  }
                  if (var21 != null &&
                    or.a((byte) 3, var21)) {
                    var8[1][var13] = di.field_j;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var27.field_v = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.b(true);
                    }
                  }
                  if (var6 > var14 &&
                    !rq.field_y[var20].field_c) {
                    rq.field_y[var20].field_c = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = rq.field_y[var20].field_b;
                    var10[2][var14] = var22;
                    var27.field_v = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.b(true);
                    }
                  }
                }
              }
            }
            var4.field_u = true;
            var4.a((byte) -117);
            return;
          }
          if (1 == var2) {
            var3Lifetime1 = var27.d(-1034);
            var4_long = var27.h(-412303328);
            var6_ref_oj = (oj) (ta.field_i.c((byte) 71));
            while (var6_ref_oj != null) {
              if (var6_ref_oj.field_B != var3Lifetime1) {
                var6_ref_oj = (oj) (ta.field_i.f((byte) -5));
                continue;
              }
              break;
            }
            if (var6_ref_oj == null) {
              dn.c(-101);
              return;
            }
            var6_ref_oj.field_w = var4_long;
            var6_ref_oj.a((byte) -117);
            return;
          }
          tc.a((Throwable) null, "HS1: " + t.a(112), -8555);
          dn.c(-101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "id.F(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        lr var5 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pool.field_O;
        try {
          if (param0 != 127) {
            var5 = (lr) null;
            id.a(61, -54, 2, 71, 91, -21, -24, 76, 60, (lr) null, -98, -116, 30);
          }
          var1 = wn.field_a;
          synchronized (var1) {
            bl.field_s = ja.field_c;
            ti.field_e = ti.field_e + 1;
            if (0 > qq.field_xb) {
              for (var2 = 0; var2 < 112; var2++) {
                vj.field_c[var2] = false;
              }
              qq.field_xb = jq.field_g;
            } else {
              while (jq.field_g != qq.field_xb) {
                var2 = fo.field_b[jq.field_g];
                jq.field_g = 127 & 1 + jq.field_g;
                if (0 > var2) {
                  vj.field_c[~var2] = false;
                  continue;
                }
                vj.field_c[var2] = true;
              }
            }
            ja.field_c = op.field_h;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "id.C(" + param0 + ')');
        }
    }

    abstract int b(int param0);

    final static void a(int param0, int param1, dd[] param2, int param3, byte param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        try {
          if (param2 != null &&
            param1 > 0) {
            var5_int = param2[0].field_w;
            var6 = param2[2].field_w;
            var7 = param2[1].field_w;
            if (param4 != 23) {
              id.c(-44);
            }
            param2[0].c(param3, param0);
            param2[2].c(-var6 + (param1 + param3), param0);
            qh.a(sq.field_a);
            qh.d(param3 + var5_int, param0, -var6 + (param3 + param1), param0 + param2[1].field_y);
            var8 = param3 + var5_int;
            var9 = param1 + param3 - var6;
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
              param2[1].c(param3, param0);
            }
            qh.b(sq.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("id.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != 35) {
          id.c(109);
        }
        field_d = null;
    }

    static {
        field_b = -1;
        field_d = "Return to tutorial";
    }
}
