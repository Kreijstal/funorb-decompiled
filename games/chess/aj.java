/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static String field_b;
    static int field_c;
    boolean field_f;
    String[] field_a;
    boolean field_h;
    int field_g;
    static String field_d;
    String field_e;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 0) {
            lh var2 = (lh) null;
            aj.a(-104, 12, 19, -21, -33, 26, (lh) null, 114, 23, (byte) 6, -99, -41, -16);
        }
    }

    final static void a(boolean param0, boolean param1) {
        id stackIn_3_0 = null;
        L0: {
          if (!param0) {
            stackIn_3_0 = new id(sg.field_b, de.field_d);
            break L0;
          } else {
            stackIn_3_0 = new id(jf.field_d, ao.field_b);
            break L0;
          }
        }
        qa.field_f = stackIn_3_0;
        fm.field_T = new ci(0L, (ci) null);
        fm.field_T.a((byte) 127, qa.field_f.field_a);
        fm.field_T.a((byte) 123, sc.field_d);
        ah.field_i = new ci(0L, ki.field_P);
        if (!param1) {
          aj.a(false, true);
          dn.field_c = new ci(0L, (ci) null);
          ah.field_i.a((byte) 123, qf.field_f);
          ah.field_i.a((byte) 126, dn.field_c);
          dn.field_c.a((byte) 126, bh.field_G);
          dn.field_c.a((byte) 123, hn.field_d);
          cf.a(122, param0);
          return;
        } else {
          dn.field_c = new ci(0L, (ci) null);
          ah.field_i.a((byte) 123, qf.field_f);
          ah.field_i.a((byte) 126, dn.field_c);
          dn.field_c.a((byte) 126, bh.field_G);
          dn.field_c.a((byte) 123, hn.field_d);
          cf.a(122, param0);
          return;
        }
    }

    final static void a(byte param0) {
        CharSequence var2;
        CharSequence var3;
        ci.field_J = tk.field_h.d(param0 ^ 49);
        if (param0 != 49) {
          field_d = (String) null;
          var2 = (CharSequence) ((Object) ci.field_J);
          cc.field_A = ad.a(var2, -2);
          return;
        } else {
          var3 = (CharSequence) ((Object) ci.field_J);
          cc.field_A = ad.a(var3, -2);
          return;
        }
    }

    final static ci a(boolean param0) {
        if (param0) {
            return (ci) null;
        }
        return uc.b(-17260);
    }

    final static ci a(int param0, int param1, int param2, int param3, int param4, int param5, lh param6, int param7, int param8, byte param9, int param10, int param11, int param12) {
        ci var13 = null;
        RuntimeException var13_ref = null;
        int var14 = 0;
        ci stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var13 = new ci(0L, (ci) null);
            var13.field_Ab = tf.a(param0, (byte) -46, param1);
            var14 = 38 % ((param9 - 54) / 62);
            var13.field_Q = tf.a(param11, (byte) -46, param10);
            var13.field_Z = tf.a(param2, (byte) -46, param12);
            var13.field_ab = tf.a(param5, (byte) -46, param7);
            var13.field_D = tf.a(param8, (byte) -46, param3);
            var13.field_xb = param6;
            var13.field_ib = param4;
            stackIn_1_0 = (ci) (var13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var13_ref);

            stackIn_4_1 = new StringBuilder().append("aj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_1_0;
    }

    aj(boolean param0) {
        this.field_h = param0 ? true : false;
    }

    static {
        field_d = "Year";
        field_b = "Connection lost. <%0>";
    }
}
