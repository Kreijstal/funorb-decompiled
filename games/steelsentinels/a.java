/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a {
    static int field_c;
    static BitmapFont field_a;
    static String field_f;
    static String field_e;
    static int[] field_h;
    static String[] field_d;
    static String[] field_g;
    static String field_b;

    final static boolean a(int param0) {
        if (param0 != 105) {
          return false;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RgbSprite[] var5 = null;
        RgbSprite[] var5Lifetime1;
        if (param3 >= 6) {
          var5 = eb.field_s;
          jm.a(param0, param2, var5, 1, param1, param4);
          return;
        }
        a.a(false);
        var5Lifetime1 = eb.field_s;
        jm.a(param0, param2, var5Lifetime1, 1, param1, param4);
    }

    public static void c(int param0) {
        field_g = null;
        field_b = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 >= 63) {
          field_e = null;
          field_f = null;
          return;
        }
        a.c(-126);
        field_e = null;
        field_f = null;
    }

    final static void a(byte param0, long param1) {
        if (0L >= param1) {
          return;
        }
        if (param1 % 10L == 0L) {
          tc.a(-1L + param1, (byte) 118);
          tc.a(1L, (byte) 119);
          if (param0 <= 116) {
            field_b = (String) null;
            return;
          }
          return;
        }
        tc.a(param1, (byte) 121);
        if (param0 <= 116) {
          field_b = (String) null;
          return;
        }
    }

    abstract void b(java.awt.Component param0, boolean param1);

    final static void a(String param0, byte param1, int param2, String[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        int var6 = 0;
        String[] var7 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var4_int = -56 % ((param1 - 65) / 35);
          jn.field_b = sn.field_p;
          if (255 == param2) {
            stackIn_10_0 = !(wi.field_y >= 13);
            vl.field_x = fn.a(stackIn_10_0, (byte) 69);
            var7 = (String[]) null;
            ki.a((byte) -54, (String[]) null);
            return;
          }
          if (100 > param2) {
            vl.field_x = CachedArchiveProvider.a(79, param0, param2);
            return;
          }
          if (105 < param2) {
            vl.field_x = CachedArchiveProvider.a(79, param0, param2);
            return;
          }
          var5 = param3;
          ki.a((byte) -101, var5);
          vl.field_x = fc.a((byte) -76, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("a.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    abstract int b(int param0);

    abstract void a(java.awt.Component param0, boolean param1);

    final static boolean a(boolean param0) {
        boolean stackIn_7_0 = false;
        if (param0) {
          return false;
        }
        if (qf.field_e != null) {
          stackIn_7_0 = true;
        } else {
          if (vb.field_e) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    static {
        field_f = "Your game";
        field_e = "If you are not, please change your password to something more obscure!";
        field_h = new int[]{-1, 28, -1, 7};
        field_d = new String[]{"<col=00a2ff>Engineered <img=23></col>", "<col=00d000>Cost to engineer: <img=21><%0></col>", "<col=d32626>Cost to engineer: <img=22><%0></col>", "<col=d32626>Too advanced to engineer</col>"};
        field_b = "War Mode";
    }
}
