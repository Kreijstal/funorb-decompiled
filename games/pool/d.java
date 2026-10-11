/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static eg field_b;
    static qq field_d;
    static dd[] field_a;
    static vh field_e;
    static vh field_c;
    static vh field_f;

    public static void a(byte param0) {
        int var1 = -51 / ((param0 + 42) / 53);
        field_f = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static void a(eg param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        eg var16 = null;
        var15 = Pool.field_O;
        try {
          param0.a();
          var2_int = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          if (param1 != -23109) {
            var16 = (eg) null;
            d.a((eg) null, -11);
          }
          var6 = -32768;
          var7 = -32768;
          var8 = new int[][]{param0.field_N, param0.field_v, param0.field_X};
          for (var9 = 0; var9 < param0.field_K; var9++) {
            if (param0.field_Q == null ||
              param0.field_Q[var9] != 2) {
              for (var10 = 0; 3 > var10; var10++) {
                var11 = var8[var10][var9];
                var12 = param0.field_g[var11];
                var13 = param0.field_Y[var11];
                if (var12 < var2_int) {
                  var2_int = var12;
                }
                if (var5 < var12) {
                  var5 = var12;
                }
                if (var6 < var13) {
                  var6 = var13;
                }
                var14 = param0.field_q[var11];
                if (var3 > var13) {
                  var3 = var13;
                }
                if (var7 < var14) {
                  var7 = var14;
                }
                if (var14 < var4) {
                  var4 = var14;
                }
              }
            }
          }
          param0.field_S = (short)var6;
          param0.field_D = (short)var2_int;
          param0.field_w = (short)var5;
          param0.field_y = (short)var3;
          param0.field_x = (short)var7;
          param0.field_V = (short)var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("d.B(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        of stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        boolean stackIn_3_2 = false;
        vh stackIn_19_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ko var4 = null;
        Object var5_ref = null;
        int var5 = 0;
        eo var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        kn var16 = null;
        kn var17 = null;
        try {
          stackIn_2_0 = cp.field_c.field_Sb;
          stackIn_2_1 = param2;
          stackIn_3_2 = (cp.field_c.field_Sb == pf.field_c);
          var3_int = ((of) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_3_2, 2, (byte) 115, ad.field_x + 2, param0 * (3 * ad.field_x + 6)) ? 1 : 0;
          var4 = cp.field_c.field_Mb.field_T;
          if (th.field_a != 2 &&
            th.field_a != 1) {
            cp.field_c.field_pb = false;
            cp.field_c.field_Sb.field_Sb.field_nb = o.field_A;
            mq.a(cp.field_c.field_Mb, (byte) 109);
          } else {
            cp.field_c.field_pb = true;
            cp.field_c.field_Sb.field_Sb.field_nb = null;
            var5_ref = null;
            var6 = (eo) (var4.c((byte) -127));
            while (var6 != null) {
              var7 = 0;
              if (var6.field_T == null) {
                var6.field_Pb = new vh(0L, ge.field_s);
                var6.a(-99, var6.field_Pb);
                var6.field_Ob = new vh(0L, ge.field_s);
                var6.a(-120, var6.field_Ob);
                var6.d((byte) -127);
                var7 = 1;
              }
              var6.field_gb = cp.field_c.field_Mb.field_gb;
              var6.field_Pb.b(0, 2147483647, 0, var6.field_gb, ad.field_x);
              var8 = 0;
              if (var6.field_Sb != null &&
                !var6.field_Sb.equals("")) {
                var6.field_Ob.field_K = 16737894;
                var6.field_Ob.field_hb = oi.field_o;
                var8 = 1;
                var6.field_Ob.b(0, 2147483647, 0, oi.field_o.field_w + 3, ad.field_x);
              }
              var9 = 0;
              var10 = var6.field_gb;
              if (var8 != 0) {
                var9 = oi.field_o.field_w + 3;
                var10 = var10 - var9;
              }
              stackIn_19_0 = var6.field_Pb;
              if (var10 <= 0) {
                stackIn_20_1 = var6.field_Zb;
              } else {
                stackIn_20_1 = lr.a(var6.field_Pb.field_I, var6.field_Zb, var10);
              }
              stackIn_19_0.field_nb = stackIn_20_1;
              stackIn_23_0 = (var6.field_Pb.field_nb.equals(var6.field_Zb)) ? 0 : 1;
              var11 = stackIn_23_0;
              var6.field_Pb.b(0, 2147483647, var9, var10, ad.field_x);
              if (var3_int == 0) {
                var6.field_Cb = ad.field_x - var6.field_Db;
              }
              if (var7 != 0) {
                cp.field_c.field_Mb.a((vh) (var5_ref), 2, var6, -41);
              }
              if (var6.field_Ob != null &&
                var6.field_Ob.field_W) {
                kk.field_B = var6.field_Sb;
              } else {
                if (var6.field_Pb.field_W &&
                  var11 != 0) {
                  kk.field_B = var6.field_Zb;
                }
              }
              if (0 != var6.field_R) {
                dr.a(var6.field_Zb, -1, 0L, -1, cp.field_c.field_Sb, var6.field_Yb, 32540, var6, (int[]) null);
                var16 = vl.field_m;
                var13_ref_String = tp.field_f;
                var16.field_n.a(var13_ref_String, 17130, 7);
                var17 = vl.field_m;
                var13 = lq.field_W;
                var14 = ua.field_o;
                var17.field_n.c(0, 0, var13, 0, var14);
              }
              var5_ref = var6;
              var6 = (eo) (var4.f((byte) -5));
            }
            if (0 != cp.field_c.field_Ob.field_R) {
              sm.field_C = new aj(cp.field_c.field_Ob.field_sb, cp.field_c.field_Ob.field_ib, cp.field_c.field_Ob.field_gb, cp.field_c.field_Ob.field_Db, qf.field_l, wa.field_qb, uo.field_Lb, uo.field_Lb);
              ne.field_m = 2;
            }
            if (cp.field_c.field_Qb.field_R != 0) {
              sm.field_C = new aj(cp.field_c.field_Qb.field_sb, cp.field_c.field_Qb.field_ib, cp.field_c.field_Qb.field_gb, cp.field_c.field_Qb.field_Db, jj.field_R, wa.field_qb, uo.field_Lb, uo.field_Lb);
              ne.field_m = 3;
            }
          }
          var5 = 46 / ((-55 - param1) / 44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "d.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(kh param0, int param1, ge param2, boolean param3) {
        int var9 = 0;
        kh stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        kh stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        kh stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        kh stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        kh stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        kh stackIn_22_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        var10 = Pool.field_O;
        try {
          if (param3) {
            param0.field_mc = param2.g(-67);
          }
          param0.field_Nb = param2.g(-70);
          param0.field_ac = param2.g(-124);
          var4_int = param2.g(-124);
          var5 = 36 / ((63 - param1) / 46);
          stackIn_6_0 = (kh) (param0);
          stackIn_7_1 = ((128 & var4_int) != 0);
          stackIn_6_0.field_Qb = stackIn_7_1;
          stackIn_10_0 = (kh) (param0);
          stackIn_11_1 = (param0.field_Qb) && (param0.field_mc < param0.field_Nb);
          stackIn_10_0.field_ic = stackIn_11_1;
          stackIn_13_0 = (kh) (param0);
          stackIn_14_1 = ((32 & var4_int) != 0);
          stackIn_13_0.field_wc = stackIn_14_1;
          stackIn_16_0 = (kh) (param0);
          stackIn_17_1 = ((8 & var4_int) != 0);
          stackIn_16_0.field_Dc = stackIn_17_1;
          stackIn_19_0 = (kh) (param0);
          stackIn_20_1 = ((var4_int & 64) != 0);
          stackIn_19_0.field_ec = stackIn_20_1;
          stackIn_22_0 = (kh) (param0);
          if ((var4_int & 16) == 0) {
            stackIn_23_1 = 1;
          } else {
            stackIn_23_1 = 2;
          }
          stackIn_22_0.field_Yb = stackIn_23_1;
          stackIn_26_0 = (0 == (4 & var4_int)) ? 0 : 1;
          var6 = stackIn_26_0;
          param2.a(0, (byte) -127, param0.field_tc, param0.field_tc.length);
          stackIn_29_0 = ((var4_int & 2) == 0) ? 0 : 1;
          var7 = stackIn_29_0;
          param0.field_pc = param2.d(-1034);
          param0.field_sc = rl.a((byte) -95) - (long)param2.b(true);
          if (var6 != 0) {
            param0.field_qc = param2.b(true);
          } else {
            param0.field_qc = -1;
          }
          param0.field_Zb = param2.h(-412303328);
          var8 = param2.field_v;
          param0.field_Ob = param2.j(-57);
          if (var7 != 0) {
            param2.field_v = var8;
            param0.field_bc = new String[param0.field_mc];
            for (var9 = 0; param0.field_mc > var9; var9++) {
              param0.field_bc[var9] = param2.j(-72);
            }
            return;
          }
          param0.field_bc = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("d.D(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
