/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static tk field_f;
    static km field_c;
    static km field_a;
    static String field_e;
    static String field_b;
    static int field_d;

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 62) {
            field_f = (tk) null;
          }
          stackIn_3_0 = da.a(param1, -2, 0, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 >= -85) {
          return;
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static boolean a(byte param0) {
        int var1 = 11 % ((param0 - 1) / 44);
        return true;
    }

    final static void a(int param0, boolean param1, boolean param2, byte param3) {
        ci stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        ci stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        ci stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        ci stackIn_46_0 = null;
        boolean stackIn_47_1 = false;
        ci stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        ci stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        int var4;
        var4 = 48 % ((param3 + 48) / 44);
        tf.a(90);
        if (0 > fm.field_W) {
          fe.field_h.field_db = null;
          stackIn_7_0 = ql.field_d;
          stackIn_8_1 = (param2) && (!param1) && (!fm.field_V) && (pd.field_Rb == null) && (ib.field_d == null);
          ((ci) (Object) stackIn_7_0).a(stackIn_8_1, (byte) 88);
          stackIn_14_0 = rb.field_c;
          stackIn_15_1 = (param2) && (!param1) && (!fm.field_V) && (pd.field_Rb == null) && (null == ib.field_d);
          ((ci) (Object) stackIn_14_0).a(stackIn_15_1, (byte) 88);
          stackIn_19_0 = la.field_c;
          stackIn_20_1 = (param2) && (!param1) && (fm.field_V);
          ((ci) (Object) stackIn_19_0).a(stackIn_20_1, (byte) 88);
          wf.field_W.field_a.f((byte) 109);
          if (ln.field_cc.field_L != 0) {
            tg.field_p = true;
          }
          if (0 != si.field_l.field_L && (lf.field_U ||
            !(0 >= cl.field_d) ||
            !(sk.field_t < 2) &&
            ok.field_Jb[12])) {
            rh.a(0, param0);
          }
          if (wj.field_g.field_L != 0) {
            if (1 == wn.field_d.length &&
              mk.field_c != wn.field_d[0]) {
              mk.field_c = wn.field_d[0];
            }
            cd.a(0, mc.field_a, true, param0, mk.field_c, 121);
          }
          if (of.field_i.field_L != 0) {
            fm.field_V = false;
          }
          return;
        }
        fe.field_h.field_db = oc.a(hh.field_m, new String[]{Integer.toString(fm.field_W)}, (byte) -108);
        stackIn_46_0 = ql.field_d;
        stackIn_47_1 = (param2) && (!param1) && (!fm.field_V) && (pd.field_Rb == null) && (ib.field_d == null);
        ((ci) (Object) stackIn_46_0).a(stackIn_47_1, (byte) 88);
        stackIn_53_0 = rb.field_c;
        stackIn_54_1 = (param2) && (!param1) && (!fm.field_V) && (pd.field_Rb == null) && (null == ib.field_d);
        ((ci) (Object) stackIn_53_0).a(stackIn_54_1, (byte) 88);
        stackIn_58_0 = la.field_c;
        stackIn_59_1 = (param2) && (!param1) && (fm.field_V);
        ((ci) (Object) stackIn_58_0).a(stackIn_59_1, (byte) 88);
        wf.field_W.field_a.f((byte) 109);
        if (ln.field_cc.field_L != 0) {
          tg.field_p = true;
        }
        if (0 != si.field_l.field_L) {
          if (lf.field_U) {
            rh.a(0, param0);
          } else {
            if (0 < cl.field_d) {
              rh.a(0, param0);
            } else {
              if (sk.field_t >= 2 &&
                ok.field_Jb[12]) {
                rh.a(0, param0);
              }
            }
          }
        }
        if (wj.field_g.field_L != 0) {
          if (1 == wn.field_d.length &&
            mk.field_c != wn.field_d[0]) {
            mk.field_c = wn.field_d[0];
            cd.a(0, mc.field_a, true, param0, mk.field_c, 121);
            if (of.field_i.field_L != 0) {
              fm.field_V = false;
            }
            return;
          }
          cd.a(0, mc.field_a, true, param0, mk.field_c, 121);
        }
        if (of.field_i.field_L == 0) {
          return;
        }
        fm.field_V = false;
    }

    final static void a(int param0, lh param1, int param2, km[] param3, lh param4, int param5, km[] param6, int param7, int param8, int param9, int param10, km[] param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          if (param2 != -26472) {
            return;
          }
          wj.a(new le(param11), param13, param17, new le(param6), param18, param8, param7, param15, param14, param10, param5, param4, param9, new le(param3), param2 ^ 26425, param19, param0, param12, param1, param20, param16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("tb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    static {
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_b = "Remove <%0> from ignore list";
        field_d = 0;
    }
}
