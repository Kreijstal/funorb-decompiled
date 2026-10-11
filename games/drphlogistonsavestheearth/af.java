/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static he[] field_e;
    static int[] field_f;
    static tf field_g;
    static String field_c;
    static int field_d;
    static String field_a;
    static int field_b;

    final static bm a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        bm var3 = null;
        bm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -19 % ((param0 - 22) / 63);
          if (param1 == null) {
            return null;
          }
          var3 = new bm(param1, kh.field_i, vi.field_b, gf.field_o, qa.field_J, aj.field_a, a.field_e);
          oc.a((byte) -21);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("af.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != 6) {
          af.a(-44);
          if (null == df.field_l) {
            return;
          }
          hb.a(-5, df.field_l);
          df.field_l.a(sb.field_d, true);
          df.field_l = null;
          if (null != pi.field_V) {
            pi.field_V.b((byte) -7);
          }
          n.field_g.requestFocus();
          return;
        }
        if (null == df.field_l) {
          return;
        }
        hb.a(-5, df.field_l);
        df.field_l.a(sb.field_d, true);
        df.field_l = null;
        if (null != pi.field_V) {
          pi.field_V.b((byte) -7);
        }
        n.field_g.requestFocus();
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 == 4) {
          field_e = null;
          field_g = null;
          field_a = null;
          return;
        }
        field_c = (String) null;
        field_e = null;
        field_g = null;
        field_a = null;
    }

    final static void a(byte param0) {
        kc var1 = (kc) (rd.field_C.h(-11151));
        if (var1 == null) {
          eg.a((byte) 126);
          return;
        }
        lh var2 = dh.field_N;
        var2.h(23);
        var2.h(97);
        var2.h(-104);
        if (param0 == 59) {
          var2.h(param0 ^ 74);
          var1.a(-16175);
          return;
        }
        field_c = (String) null;
        var2.h(param0 ^ 74);
        var1.a(-16175);
    }

    final static nh[] a(int param0, int param1, int param2, byte param3, int param4) {
        nh[] var6 = new nh[9];
        nh[] var5 = var6;
        nh dupTemp$0 = mi.a(param1, (byte) -96, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        nh dupTemp$1 = mi.a(param1, (byte) -85, param2);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 == 32) {
          if (param4 != 0) {
            var6[4] = mi.a(64, (byte) -109, param4);
          }
          return var5;
        }
        return (nh[]) null;
    }

    static {
        field_c = " of ";
        field_a = "Click icon to start";
        field_f = new int[]{1, 0, 5, 0, 13, 2, 2, 0, 0, 0, 2, 30, 15, 15, 10, 10, 2, 2, 1, 3, 60, 1, 60, 200, 4, 5, 4, 1, 11, 1};
    }
}
