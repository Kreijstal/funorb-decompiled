/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    int field_j;
    int field_k;
    int field_c;
    static String field_i;
    private er field_h;
    static an field_b;
    cc field_f;
    static String field_d;
    private int[] field_a;
    int field_g;
    private boolean field_e;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 23744) {
          return;
        }
        field_d = null;
        field_i = null;
    }

    final static dg a(Throwable param0, String param1) {
        dg var2 = null;
        if (param0 instanceof dg) {
          var2 = (dg) ((Object) param0);
          var2.field_e = var2.field_e + ' ' + param1;
        } else {
          var2 = new dg(param0, param1);
        }
        return var2;
    }

    final static void c(int param0) {
        qh.a(-32739);
        if (param0 != -2618) {
          field_i = (String) null;
        }
        ha.a((byte) 112);
    }

    final void a(int param0, byte param1, int param2, int param3, String param4, int param5) {
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          var10 = bi.field_l;
          var7 = var10;
          var8 = bi.field_e;
          var9 = bi.field_j;
          bi.a(this.field_a);
          this.field_h.d();
          bi.b(this.field_a);
          this.field_f.b(param4, param3, param5, param0, param2);
          bi.a(var10, var8, var9);
          bi.b(this.field_a);
          this.field_e = true;
          if (param1 <= 51) {
            this.field_h = (er) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_5_0 = var7_ref;
          stackIn_5_1 = new StringBuilder().append("wn.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param5).append(')').toString());
        }
    }

    final void b(int param0) {
        int[] var2_ref_int__ = null;
        int var3 = 0;
        int var4 = 0;
        if (this.field_e) {
          var2_ref_int__ = bi.field_l;
          var3 = bi.field_e;
          var4 = bi.field_j;
          bi.a(this.field_a);
          this.field_h.d();
          an.a((byte) 41, 0, 640, 480, 0);
          bi.a(var2_ref_int__, var3, var4);
          bi.b(this.field_a);
          this.field_h.e(0, 0);
          this.field_h.d();
          bi.c();
          ro.field_g.a(-39);
          this.field_e = false;
        }
        int var2 = -117 % ((30 - param0) / 60);
    }

    final static void a(String[] args, byte[] param1, int[] param2, String[][] param3, u[] param4, r param5, r param6, byte param7, er[][] param8, String[][] param9, r param10, int param11, byte[] param12, er[][] param13, int param14, int[] param15, boolean param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int[] var18 = null;
        String[] var19 = null;
        try {
          var19 = (String[]) null;
          nk.a(param14, param9, param5, (byte) 58, param11, param1, param13, param3, args, param12, (String[]) null, param8, param10, param6, param2, 1, param16, param4, param15);
          if (param7 != -42) {
            var18 = (int[]) null;
            wn.a((String[]) null, (byte[]) null, (int[]) null, (String[][]) null, (u[]) null, (r) null, (r) null, (byte) -38, (er[][]) null, (String[][]) null, (r) null, 49, (byte[]) null, (er[][]) null, 77, (int[]) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("wn.N(");
          if (args == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param5 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param6 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param9 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param10 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param13 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param16).append(')').toString());
        }
    }

    final int a(int param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_4_0 = this.field_f.c(param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -4;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        try {
          this.a(param2, (byte) 52, param4, param0 - this.field_f.c(param5), param5, param3);
          if (param1 >= -7) {
            String var8 = (String) null;
            this.a(123, 84, -103, 23, -80, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wn.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, cr param1, cr param2) {
        try {
          if (param1.field_M == null) {
            param1.field_M = new nj();
          }
          if (param2.field_M == null) {
            param2.field_M = new nj();
          }
          if (se.field_A == null) {
            se.field_A = new fi(64);
          }
          if (param0 >= -43) {
            wn.c(-19);
          }
          if (jn.field_g == null) {
            jn.field_g = new fi(64);
          }
          vj.field_d = param2.field_M;
          tm.field_a = param1.field_M;
          lh.a((byte) -22);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          this.a(param1, (byte) 115, param2, param3 - this.field_f.c(param0) / param5, param0, param4);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == nb.field_A) {
            return false;
          }
          if (param1 == 0) {
            stackIn_10_0 = !(param0.toLowerCase().indexOf(nb.field_A.toLowerCase()) < 0);
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("wn.L(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        param7--;
        while (param7 >= 0) {
          for (var9 = param6 - 1; var9 >= 0; var9--) {
            if (param0[param1] > 1) {
              param2 = param1 - 1;
              param3 = param1 + 1;
              param4 = param1 - bi.field_e;
              param5 = param1 + bi.field_e;
              if (param0[param4 + 1] == 0) {
                param0[param4 + 1] = 1;
              }
              if (param0[param5 + 1] == 0) {
                param0[param5 + 1] = 1;
              }
              if (param0[param4 - 1] == 0) {
                param0[param4 - 1] = 1;
              }
              if (param0[param5 - 1] == 0) {
                param0[param5 - 1] = 1;
              }
              if (param0[param2] == 0) {
                param0[param2] = 1;
              }
              if (param0[param3] == 0) {
                param0[param3] = 1;
              }
              if (param0[param4] == 0) {
                param0[param4] = 1;
              }
              if (param0[param5] == 0) {
                param0[param5] = 1;
              }
              if (param0[param2 - 1] == 0) {
                param0[param2 - 1] = 1;
              }
              if (param0[param3 + 1] == 0) {
                param0[param3 + 1] = 1;
              }
              if (param0[param4 - bi.field_e] == 0) {
                param0[param4 - bi.field_e] = 1;
              }
              if (param0[param5 + bi.field_e] == 0) {
                param0[param5 + bi.field_e] = 1;
              }
            }
            param1++;
          }
          param1 = param1 + param8;
          param7--;
        }
    }

    final static int a(boolean param0, int param1, qj param2, int param3, String param4, boolean param5, qj param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        ed stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_17_2 = null;
        ed stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_20_2 = null;
        int stackIn_30_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          var14 = param2.a(param0);
          var8 = param6.a(param0);
          if (lo.field_k == null &&
            !ce.a((byte) 116, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (nn.field_w == rg.field_d) {
            mr.field_a = null;
            uh.field_Wb.field_u = 0;
            if (param4 == null) {
              iq.field_x.field_u = 0;
              iq.field_x.e(j.field_r.nextInt(), 0);
              iq.field_x.e(j.field_r.nextInt(), 0);
              stackIn_16_0 = iq.field_x;
              stackIn_16_1 = 684868900;
              if (!param2.a(113)) {
                stackIn_17_2 = "";
              } else {
                stackIn_17_2 = var14;
              }
              ((ed) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_17_2);
              stackIn_19_0 = iq.field_x;
              stackIn_19_1 = 684868900;
              if (param6.a(75)) {
                stackIn_20_2 = var8;
              } else {
                stackIn_20_2 = "";
              }
              ((ed) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_20_2);
              uh.field_Wb.f(16, -53);
              uh.field_Wb.field_u = uh.field_Wb.field_u + 1;
              var9 = uh.field_Wb.field_u;
              mq.a(jm.field_H, uh.field_Wb, lp.field_E, 12, iq.field_x);
              uh.field_Wb.b((byte) -97, uh.field_Wb.field_u - var9);
            } else {
              var9 = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              iq.field_x.field_u = 0;
              iq.field_x.e(j.field_r.nextInt(), 0);
              iq.field_x.e(j.field_r.nextInt(), 0);
              iq.field_x.a(684868900, var14);
              iq.field_x.a(684868900, var8);
              var15 = (CharSequence) ((Object) param4);
              iq.field_x.a(684868900, rr.a(-99, var15));
              iq.field_x.d(param1, -1783);
              iq.field_x.f(param3, 80);
              iq.field_x.f(var9, 100);
              uh.field_Wb.f(18, -93);
              uh.field_Wb.field_u = uh.field_Wb.field_u + 2;
              var10 = uh.field_Wb.field_u;
              var11_ref_String = vq.a(ob.e((byte) 74), (byte) 114);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              uh.field_Wb.a((byte) 0, var11_ref_String);
              mq.a(jm.field_H, uh.field_Wb, lp.field_E, 12, iq.field_x);
              uh.field_Wb.a((byte) -120, -var10 + uh.field_Wb.field_u);
            }
            lf.d(106, -1);
            rg.field_d = fi.field_b;
          }
          if (fi.field_b == rg.field_d &&
            c.a(1, (byte) -104)) {
            var9Lifetime1 = id.field_f.h(-11);
            id.field_f.field_u = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              rg.field_d = bj.field_f;
              na.field_m = new String[-100 + var9Lifetime1];
            } else {
              if (248 == var9Lifetime1) {
                fk.a(ob.e((byte) -77), 11514);
                nk.field_Kb = ql.field_K;
                rm.b((byte) 117);
                gn.field_d = false;
                stackIn_30_0 = var9Lifetime1;
                return stackIn_30_0;
              }
              if (99 != var9Lifetime1) {
                lc.field_f = var9Lifetime1;
                rg.field_d = ko.field_O;
                ca.field_b = -1;
              } else {
                c.a(tk.c(1), (byte) -104);
                mr.field_a = new Boolean(nr.a(id.field_f, 67));
                id.field_f.field_u = 0;
              }
            }
          }
          if (rg.field_d == bj.field_f) {
            var9Lifetime2 = 2;
            if (c.a(var9Lifetime2, (byte) -104)) {
              var10Lifetime1 = id.field_f.a((byte) -11);
              id.field_f.field_u = 0;
              if (c.a(var10Lifetime1, (byte) -104)) {
                var11 = na.field_m.length;
                for (var12 = 0; var12 < var11; var12++) {
                  na.field_m[var12] = id.field_f.c(true);
                }
                rm.b((byte) -106);
                gn.field_d = false;
                stackIn_44_0 = 100 + var11;
                return stackIn_44_0;
              }
            }
          }
          if (rg.field_d == ko.field_O &&
            dl.b((byte) -72)) {
            if (255 != lc.field_f) {
              nk.field_Kb = id.field_f.f(128);
            } else {
              var9_ref_String = id.field_f.k(-116);
              if (var9_ref_String != null) {
                be.a(var9_ref_String, -1, ob.e((byte) 106));
              }
            }
            rm.b((byte) 95);
            gn.field_d = false;
            stackIn_55_0 = lc.field_f;
            return stackIn_55_0;
          }
          if (null == lo.field_k) {
            if (gn.field_d) {
              if (qg.b(false) <= 30000L) {
                nk.field_Kb = ba.field_c;
              } else {
                nk.field_Kb = tf.field_m;
              }
              gn.field_d = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = cl.field_d;
            cl.field_d = ne.field_P;
            gn.field_d = true;
            ne.field_P = var9Lifetime3;
          }
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("wn.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var16 = bi.field_l;
        int[] var15 = var16;
        int[] var14 = var15;
        int[] var11 = var14;
        int var12 = bi.field_e;
        int var13 = bi.field_j;
        bi.a(this.field_a);
        this.field_h.d();
        if (param6 != 1) {
          return;
        }
        try {
          bi.b(this.field_a);
          this.field_f.a(param2, param5, param4, param7, param3, param9, param1, param0, param8, this.field_f.field_D + 4);
          bi.a(var16, var12, var13);
          bi.b(this.field_a);
          this.field_e = true;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wn.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    wn(cc param0) {
        try {
          this.field_f = param0;
          this.field_h = new er(640, 480);
          this.field_k = param0.field_D;
          this.field_g = param0.field_t;
          this.field_c = param0.field_M;
          this.field_a = new int[4];
          this.field_j = param0.field_z;
          this.field_e = false;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Cancel";
    }
}
