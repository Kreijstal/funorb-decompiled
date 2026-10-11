/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static oj field_a;
    static String[] field_b;
    static int[][] field_c;

    public static void a(int param0) {
        if (param0 != 96) {
          hb var2 = (hb) null;
          jj.a((byte) 74, -122, (hb) null);
        }
        field_b = null;
        field_c = (int[][]) null;
        field_a = null;
    }

    final static od a(byte param0, int param1, hb param2) {
        RuntimeException var3 = null;
        od stackIn_2_0 = null;
        od stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 69) {
            stackIn_4_0 = ic.a(bb.b(param2, 100, 96, param1), 4);
            return stackIn_4_0;
          }
          stackIn_2_0 = (od) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          vg.a(param1, cg.field_l, true, true, ua.field_d, 0, rc.field_c);
          for (var2_int = 0; var2_int < cg.field_l; var2_int++) {
            lk.field_d[var2_int + param1] = var2_int;
          }
          vg.a(param1 + param1, param1 + cg.field_l, true, false, ue.field_a, param1, vb.field_a);
          var2_intLifetime1 = 60 / ((param0 - 80) / 34);
          if (cg.field_l > param1) {
            cg.field_l = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "jj.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        try {
          hd.field_b = param0;
          aa.field_g = true;
          wg.field_d = new ik(ci.field_f, rh.field_q, param1, lb.field_d, hd.field_b);
          ci.field_f.b((qg) (wg.field_d), (byte) -71);
          if (param2 != 1702) {
            field_c = (int[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "jj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
