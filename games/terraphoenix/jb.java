/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb {
    static int field_b;
    static java.awt.Frame field_e;
    static String field_c;
    static long[] field_d;
    static boolean field_a;

    abstract void a(int param0, java.awt.Component param1);

    abstract void a(java.awt.Component param0, byte param1);

    final static int[] a(int param0, int param1, int param2) {
        int var3 = bk.a((byte) 92, param1);
        int var4 = im.a(param1, true);
        int var5 = bk.a((byte) 92, param0);
        int var6 = im.a(param0, true);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static ck a(int param0, int param1, int param2, int param3, byte param4, he param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ck var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_5_0 = null;
        ck stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var8 = ph.a(param5, param1, 0, param0, 10, param2);
            var6 = var8;
            if (var8 != null) {
              var7 = new ck();
              if (param4 > 82) {
                var7.field_e = var8;
                java.awt.Component discarded$2 = var7.field_e.add((java.awt.Component) (Object) var7);
                var7.setBounds(0, 0, param1, param0);
                var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
                var7.requestFocus();
                stackOut_6_0 = (ck) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ck) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("jb.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(0).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    abstract int a(int param0);

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_e = null;
    }

    final static void a(byte param0) {
        ji var1 = (ji) (Object) vc.field_d.d(9272);
        if (!(var1 != null)) {
            gb.g(-17464);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "FINAL SCORE";
        field_d = new long[32];
        field_a = true;
    }
}
