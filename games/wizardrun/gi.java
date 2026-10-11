/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_d;
    static String field_e;
    static bh field_a;
    static int field_c;
    static boolean field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0) {
          uh var2 = (uh) null;
          gi.a(true, (uh) null, true, true, 25);
        }
    }

    final static void a(boolean param0, uh param1, boolean param2, boolean param3, int param4) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          uh.field_d[0] = oi.field_c.nextInt();
          uh.field_d[1] = oi.field_c.nextInt();
          uh.field_d[2] = (int)(tg.field_g >> 32);
          uh.field_d[3] = (int)tg.field_g;
          re.field_G.field_m = 0;
          re.field_G.f(uh.field_d[0], 613003928);
          re.field_G.f(uh.field_d[1], 613003928);
          re.field_G.f(uh.field_d[2], 613003928);
          re.field_G.f(uh.field_d[3], 613003928);
          u.a(re.field_G, -18);
          re.field_G.b(-1947079288, param4);
          param1.a(4, re.field_G);
          n.field_b.field_m = 0;
          if (!param3) {
            n.field_b.b((byte) 11, 16);
          } else {
            n.field_b.b((byte) 11, 18);
          }
          n.field_b.field_m = n.field_b.field_m + 2;
          var5_int = n.field_b.field_m;
          n.field_b.f(vk.field_G, 613003928);
          n.field_b.b(1290648728, bl.field_d);
          var6 = 0;
          if (pf.field_g) {
            var6 = var6 | 1;
          }
          if (cb.field_g) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (sf.field_b != null) {
            var6 = var6 | 16;
          }
          n.field_b.b((byte) 11, var6);
          if (!param2) {
            field_c = -6;
          }
          var7 = fb.a(jg.f(1), (byte) 102);
          if (var7 == null) {
            var7 = "";
          }
          n.field_b.a(var7, false);
          if (null != sf.field_b) {
            n.field_b.b(0, sf.field_b);
          }
          pa.a(ag.field_s, 0, ad.field_d, re.field_G, n.field_b);
          n.field_b.a(n.field_b.field_m - var5_int, (byte) -67);
          id.a((byte) -67, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("gi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_d = "This password is part of your Player Name, and would be easy to guess";
        field_e = null;
        field_a = new bh(11, 0, 1, 2);
    }
}
