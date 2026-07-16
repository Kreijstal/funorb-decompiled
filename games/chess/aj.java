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
            Object var2 = null;
            ci discarded$0 = aj.a(-104, 12, 19, -21, -33, 26, (lh) null, 114, 23, (byte) 6, -99, -41, -16);
        }
    }

    final static void a(boolean param0, boolean param1) {
        id stackIn_3_0 = null;
        id stackOut_2_0 = null;
        id stackOut_1_0 = null;
        L0: {
          if (!param0) {
            stackOut_2_0 = new id(sg.field_b, de.field_d);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = new id(jf.field_d, ao.field_b);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        qa.field_f = stackIn_3_0;
        fm.field_T = new ci(0L, (ci) null);
        fm.field_T.a((byte) 127, (ci) (Object) qa.field_f.field_a);
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
        CharSequence var2 = null;
        CharSequence var3 = null;
        ci.field_J = tk.field_h.d(param0 ^ 49);
        if (param0 != 49) {
          field_d = null;
          var2 = (CharSequence) (Object) ci.field_J;
          cc.field_A = ad.a(var2, -2);
          return;
        } else {
          var3 = (CharSequence) (Object) ci.field_J;
          cc.field_A = ad.a(var3, -2);
          return;
        }
    }

    final static ci a(boolean param0) {
        if (param0) {
            return null;
        }
        return uc.b(-17260);
    }

    final static ci a(int param0, int param1, int param2, int param3, int param4, int param5, lh param6, int param7, int param8, byte param9, int param10, int param11, int param12) {
        ci var13 = new ci(0L, (ci) null);
        var13.field_Ab = tf.a(param0, (byte) -46, param1);
        int var14 = 38 % ((param9 - 54) / 62);
        var13.field_Q = tf.a(param11, (byte) -46, param10);
        var13.field_Z = tf.a(param2, (byte) -46, param12);
        var13.field_ab = tf.a(param5, (byte) -46, param7);
        var13.field_D = tf.a(param8, (byte) -46, param3);
        var13.field_xb = param6;
        var13.field_ib = param4;
        return var13;
    }

    aj(boolean param0) {
        ((aj) this).field_h = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Year";
        field_b = "Connection lost. <%0>";
    }
}
