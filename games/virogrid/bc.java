/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static sb field_a;
    static int field_c;
    static long[] field_b;

    final synchronized static byte[] a(boolean param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2 = 0;
        int dupTemp$6 = 0;
        byte[][] arrayValue$7 = null;
        byte[] var2_ref_byte__;
        byte[] var3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        if (param1 == 100 &&
          hk.field_Hb > 0) {
          fieldTemp$3 = hk.field_Hb - 1;
          hk.field_Hb = hk.field_Hb - 1;
          var2_ref_byte__ = k.field_b[fieldTemp$3];
          k.field_b[hk.field_Hb] = null;
          return var2_ref_byte__;
        }
        if (param1 == 5000 &&
          te.field_i > 0) {
          fieldTemp$4 = te.field_i - 1;
          te.field_i = te.field_i - 1;
          var2_ref_byte__Lifetime1 = sm.field_b[fieldTemp$4];
          sm.field_b[te.field_i] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (30000 == param1 &&
          nm.field_b > 0) {
          fieldTemp$5 = nm.field_b - 1;
          nm.field_b = nm.field_b - 1;
          var2_ref_byte__Lifetime2 = bj.field_k[fieldTemp$5];
          bj.field_k[nm.field_b] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param0) {
          field_c = 50;
        }
        if (gk.field_c != null) {
          for (var2 = 0; var2 < a.field_E.length; var2++) {
            if (param1 == a.field_E[var2] &&
              nh.field_s[var2] > 0) {
              dupTemp$6 = nh.field_s[var2] - 1;
              arrayValue$7 = gk.field_c[var2];
              nh.field_s[var2] = dupTemp$6;
              var3 = arrayValue$7[dupTemp$6];
              gk.field_c[var2][nh.field_s[var2]] = null;
              return var3;
            }
          }
        }
        return new byte[param1];
    }

    final static void a(boolean param0, byte param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        boolean stackIn_9_5;
        boolean stackIn_9_6;
        int stackIn_9_7;
        boolean stackIn_11_8 = false;
        boolean stackIn_14_9 = false;
        pl.a(false);
        if (wl.field_d != null) {
          stackIn_6_0 = (ef.a((byte) 82, wl.field_d.field_ic)) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        stackIn_9_0 = 0;
        stackIn_9_1 = 13;
        stackIn_9_2 = -83;
        stackIn_9_3 = 15;
        stackIn_9_4 = og.field_b;
        stackIn_9_5 = param0;
        stackIn_9_6 = true;
        stackIn_9_7 = var2;
        stackIn_11_8 = (dd.field_a) || (on.field_d);
        stackIn_14_9 = (50 >= tl.field_l) ? false : true;
        dj.$cfr$intArgs$a$498b55a4266a(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7 != 0, stackIn_11_8, stackIn_14_9, 11, 14);
        if (param1 >= -101) {
          bc.a(true, (byte) 117);
        }
        if (ah.field_c) {
          gk.field_g.g(57, 8);
          ah.field_c = false;
        }
        if (af.field_c) {
          gk.field_g.g(10, 8);
          af.field_c = false;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -101) {
          bc.a(true, (byte) -43);
        }
    }

    static {
        field_b = new long[1000];
    }
}
