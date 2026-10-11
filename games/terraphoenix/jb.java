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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3 = bk.a((byte) 92, param1);
        int var4 = im.a(param1, true);
        int var5 = bk.a((byte) 92, param0);
        int var6 = im.a(param0, true);
        if (param2 == 0) {
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var3 * (long)var6 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        field_e = (java.awt.Frame) null;
        var7 = (int)((long)var5 * (long)var3 >> 16);
        var8 = (int)((long)var3 * (long)var6 >> 16);
        var9 = (int)((long)var4 * (long)var5 >> 16);
        var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static ck a(int param0, int param1, int param2, int param3, byte param4, he param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ck var7 = null;
        java.awt.Frame var8 = null;
        ck stackIn_5_0 = null;
        ck stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ph.a(param5, param1, param3, param0, 10, param2);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new ck();
          if (param4 <= 82) {
            stackIn_5_0 = (ck) null;
            return stackIn_5_0;
          }
          var7.field_e = var8;
          var7.field_e.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param1, param0);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("jb.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    abstract int a(int param0);

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0) {
          field_a = true;
        }
    }

    final static void a(byte param0) {
        uc var2 = null;
        ji var1 = (ji) (vc.field_d.d(9272));
        if (var1 == null) {
          gb.g(-17464);
          return;
        }
        if (param0 < -125) {
          var2 = mk.field_j;
          var2.f((byte) -107);
          var2.f((byte) -107);
          var2.f((byte) -107);
          var2.f((byte) -107);
          var1.b((byte) 12);
          return;
        }
    }

    static {
        field_b = 0;
        field_c = "FINAL SCORE";
        field_d = new long[32];
        field_a = true;
    }
}
