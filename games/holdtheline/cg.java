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
        if (param0 >= -87) {
          field_i = -67;
          var4 = (String) null;
          pg.a(param1, (byte) 121, (String) null, param2);
          return;
        } else {
          var4 = (String) null;
          pg.a(param1, (byte) 121, (String) null, param2);
          return;
        }
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
        hj[] var5 = null;
        hj var6 = null;
        var5 = jc.field_h;
        var6 = ij.a(param3 + -8137, param2, var5, param4);
        if (param3 != 41) {
          cg.a(78, -110, -63, (byte) -36, 2);
          param0 = param0 - (var6.field_s + -param2 >> 2113942113);
          param1 = param1 - (var6.field_y + -param4 >> -256842175);
          var6.a(param0, param1);
          return;
        } else {
          param0 = param0 - (var6.field_s + -param2 >> 2113942113);
          param1 = param1 - (var6.field_y + -param4 >> -256842175);
          var6.a(param0, param1);
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 2113942113) {
                break L1;
              } else {
                field_f = (ll) null;
                break L1;
              }
            }
            L2: {
              if (ra.a(param1, 85) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("cg.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = ic.field_d;
        synchronized (var1) {
          L0: {
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
            break L0;
          }
        }
        if (param0 != 1983) {
          field_j = (int[]) null;
          return;
        } else {
          return;
        }
    }

    static {
        field_a = true;
        field_f = new ll();
        field_i = 20;
        field_j = new int[8192];
    }
}
