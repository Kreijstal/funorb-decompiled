/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_c;
    static ok field_d;
    static String field_b;
    static String field_a;

    final static int a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = TetraLink.field_J;
        hd.field_x = null;
        on.field_b = 0;
        li.field_g = null;
        var2 = ud.field_Nb;
        ud.field_Nb = hk.field_d;
        if (51 == param0) {
          vh.field_e.field_d = 2;
          vh.field_e.field_h = vh.field_e.field_h + 1;
          hk.field_d = var2;
          if (vh.field_e.field_h < 2) {
            if (!param1) {
              field_b = (String) null;
            }
          } else {
            if (51 == param0) {
              return 2;
            }
            if (!param1) {
              field_b = (String) null;
            }
          }
        } else {
          if (50 != param0) {
            vh.field_e.field_d = 1;
          } else {
            vh.field_e.field_d = 5;
          }
          vh.field_e.field_h = vh.field_e.field_h + 1;
          hk.field_d = var2;
          if (vh.field_e.field_h >= 2 &&
            51 == param0) {
            return 2;
          }
          if (!param1) {
            field_b = (String) null;
          }
        }
        if (2 <= vh.field_e.field_h &&
          param0 == 50) {
          return 5;
        }
        if (4 <= vh.field_e.field_h) {
          return 1;
        }
        return -1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = TetraLink.field_J;
        int var16 = 62 / ((param1 - 71) / 49);
        if (param0 < param11) {
          if (param11 < param14) {
            wa.a(-1979588528, param8, param10, param13, param7, param12, param3, param5, param2, param14, param4, param0, param15, param6, param9, param11, ra.field_b);
            return;
          }
          if (param0 < param14) {
            wa.a(-1979588528, param10, param8, param15, param3, param5, param7, param12, param2, param11, param4, param0, param13, param6, param9, param14, ra.field_b);
            return;
          }
          wa.a(-1979588528, param2, param8, param6, param3, param5, param9, param4, param10, param11, param12, param14, param13, param15, param7, param0, ra.field_b);
          return;
        }
        if (param14 > param0) {
          wa.a(-1979588528, param2, param10, param6, param7, param12, param9, param4, param8, param14, param5, param11, param15, param13, param3, param0, ra.field_b);
          return;
        }
        if (param14 <= param11) {
          wa.a(-1979588528, param8, param2, param13, param9, param4, param3, param5, param10, param0, param12, param14, param6, param15, param7, param11, ra.field_b);
          return;
        }
        wa.a(-1979588528, param10, param2, param15, param9, param4, param7, param12, param8, param0, param5, param11, param6, param13, param3, param14, ra.field_b);
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -30581) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        cl stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        int stackIn_6_3 = 0;
        ei stackIn_30_0;
        int stackIn_30_1;
        oh stackIn_30_2;
        oh stackIn_30_3;
        boolean stackIn_31_4 = false;
        ei stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        ei stackIn_45_0;
        int stackIn_45_1;
        oh stackIn_45_2;
        oh stackIn_45_3;
        boolean stackIn_46_4 = false;
        ei stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        int var6;
        var6 = TetraLink.field_J;
        if (param4 != -1) {
          if (param4 == -2) {
            throw new RuntimeException();
          }
          bd.a(bl.field_Lb, param0 - 7224);
          stackIn_5_0 = kk.field_X[param4];
          stackIn_5_1 = false;
          stackIn_5_2 = param2;
          stackIn_6_3 = (!wk.field_i.field_n) ? 2 : 0;
          ((cl) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_6_3);
          if (param1 != -1) {
            pn.a(param1, 256, 16769381, false, false);
          }
          if (!wk.field_i.field_n) {
            rh.field_M.c();
            kk.field_X[param4].a(false, param2, 1);
            if (-1 != param1) {
              pn.a(param1, 256, 16769381, false, false);
            }
          }
          fh.a(true);
        } else {
          if (aa.field_bc != null) {
            if (!wk.field_i.field_n) {
              stackIn_45_0 = aa.field_bc;
              stackIn_45_1 = 2509;
              stackIn_45_2 = rh.field_M;
              stackIn_45_3 = bl.field_Lb;
              stackIn_46_4 = (!(ka.field_h[11] < 0.0)) ? false : true;
              ((ei) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_46_4);
            } else {
              stackIn_52_0 = aa.field_bc;
              stackIn_53_1 = (!(ka.field_h[11] < 0.0)) ? false : true;
              ((ei) (Object) stackIn_52_0).a(stackIn_53_1, bl.field_Lb, false);
            }
          } else {
            if (null != ud.field_Qb) {
              if (wk.field_i.field_n) {
                stackIn_37_0 = ud.field_Qb;
                stackIn_38_1 = (!(0.0 > ka.field_h[11])) ? false : true;
                ((ei) (Object) stackIn_37_0).a(stackIn_38_1, bl.field_Lb, false);
              } else {
                stackIn_30_0 = ud.field_Qb;
                stackIn_30_1 = 2509;
                stackIn_30_2 = rh.field_M;
                stackIn_30_3 = bl.field_Lb;
                stackIn_31_4 = (!(ka.field_h[11] < 0.0)) ? false : true;
                ((ei) (Object) stackIn_30_0).a(stackIn_30_1, stackIn_30_2, stackIn_30_3, stackIn_31_4);
              }
            }
          }
        }
        if (param0 == 7230) {
          return;
        }
        field_c = (String) null;
    }

    final static kh a(byte param0, ah param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        kh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 68) {
            field_a = (String) null;
          }
          var4_int = param1.a(-1, param2);
          var5 = param1.a(var4_int, false, param3);
          stackIn_3_0 = en.a(var5, (byte) -50, param1, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_c = "The '<%0>' setting needs to be changed.";
        field_b = "Only show lobby chat from my friends";
        field_a = "Play again";
        field_d = new ok();
    }
}
