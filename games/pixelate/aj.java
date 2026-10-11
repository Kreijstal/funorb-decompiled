/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends fa {
    int[] field_r;
    static gp field_k;
    static long field_m;
    static int field_t;
    int[] field_u;
    int field_p;
    static int field_n;
    int field_s;
    ei[] field_v;
    byte[][][] field_w;
    int[] field_q;
    ei[] field_l;
    static int[] field_o;

    final static Object a(boolean param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bh var4 = null;
        Object stackIn_2_0 = null;
        bh stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          var3_int = -39 / ((param2 + 35) / 52);
          if (param1.length > 136) {
            var4 = new bh();
            ((gf) ((Object) var4)).a(param1, true);
            stackIn_5_0 = var4;
            return stackIn_5_0;
          }
          if (param0) {
            stackIn_10_0 = re.a(true, param1);
            return stackIn_10_0;
          }
          stackIn_8_0 = (byte[]) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("aj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_o = null;
        if (param0 != -38) {
          return;
        }
        field_k = null;
    }

    final static void a(fm param0, fm param1, boolean param2, int param3) {
        try {
          nk.a(eg.field_k, c.field_Y, ug.field_s, sc.field_g, (byte) 125, kj.field_l, dn.field_c, bl.field_d, qk.field_d, param2, mg.field_h, l.field_q);
          h.field_V = eh.a("chatfilter", "lobby", (byte) 47, param1);
          rg.field_a[1] = a.field_J;
          int var4_int = -115 % ((param3 - 44) / 59);
          rg.field_a[0] = kc.field_m;
          rg.field_a[2] = wd.field_e;
          ck.a(65793, ig.field_d, param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "aj.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 > -42) {
          byte[] var2 = (byte[]) null;
          aj.a(false, (byte[]) null, -36);
          if (!ik.field_a) {
            return jg.a((byte) 78) ? true : false;
          }
          if (!db.field_U) {
            return jg.a((byte) 78) ? true : false;
          }
          return true;
        }
        if (ik.field_a) {
          if (db.field_U) {
            return true;
          }
          return jg.a((byte) 78) ? true : false;
        }
        if (!jg.a((byte) 78)) {
          return false;
        }
        return true;
    }

    aj() {
    }

    static {
        field_o = new int[]{303, 375, 440, 498, 560};
    }
}
