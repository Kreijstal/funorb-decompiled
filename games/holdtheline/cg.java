/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    int field_h;
    static volatile boolean field_a;
    static a field_b;
    int field_e;
    int field_k;
    int field_d;
    int field_c;
    static long field_g;
    static ll field_f;
    static int[] field_j;
    static int field_i;

    final static void a(byte param0, boolean param1, boolean param2) {
        String var4 = null;
        String var4Lifetime1;
        if (param0 < -87) {
          var4 = (String) null;
          pg.$cfr$intArgs$a$87b210a2f664(param1, 121, (String) null, param2);
          return;
        }
        field_i = -67;
        var4Lifetime1 = (String) null;
        pg.$cfr$intArgs$a$87b210a2f664(param1, 121, (String) null, param2);
    }

    public static void b(int param0) {
        field_b = null;
        field_j = null;
        field_f = null;
        if (param0 >= -16) {
          cg.a((byte) 29, true, false);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hj[] var5 = jc.field_h;
        hj var6 = ij.a(param3 - 8137, param2, var5, param4);
        if (param3 == 41) {
          param0 = param0 - (var6.field_s - param2 >> 1);
          param1 = param1 - (var6.field_y - param4 >> 1);
          var6.a(param0, param1);
          return;
        }
        cg.a(78, -110, -63, (byte) -36, 2);
        param0 = param0 - (var6.field_s - param2 >> 1);
        param1 = param1 - (var6.field_y - param4 >> 1);
        var6.a(param0, param1);
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2113942113) {
            field_f = (ll) null;
          }
          stackIn_5_0 = (ra.a(param1, 85) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("cg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ic.field_d;
        synchronized (var1) {
          rd.field_f = u.field_R;
          uf.field_a = uf.field_a + 1;
          nc.field_g = in.field_f;
          rf.field_X = g.field_m;
          na.field_k = sd.field_a;
          sd.field_a = false;
          gg.field_J = mi.field_a;
          lb.field_x = im.field_e;
          jb.field_U = nl.field_f;
          mi.field_a = 0;
        }
        if (param0 == 1983) {
          return;
        }
        field_j = (int[]) null;
    }

    static {
        field_a = true;
        field_f = new ll();
        field_i = 20;
        field_j = new int[8192];
    }
}
