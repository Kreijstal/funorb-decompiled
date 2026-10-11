/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk {
    static String field_b;
    static double field_a;

    abstract int a(int param0, int param1);

    abstract byte[] a(int param0, boolean param1);

    public static void a(byte param0) {
        if (param0 != -29) {
          return;
        }
        field_b = null;
    }

    final static void a(db param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        md var8 = null;
        int var9 = 0;
        md var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = CrazyCrystals.field_B;
        try {
          if (param1 < 26) {
            return;
          }
          var8 = new md(param0.a(7693, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.h(255);
          var10.f((byte) 50);
          ud.field_S = rd.a(var10, -95);
          je.field_d = new int[var3][];
          rn.field_o = new jg[var3];
          for (var4 = 0; var3 > var4; var4++) {
            rn.field_o[var4] = nh.a(-31741, var8);
          }
          var10.k(-2321);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = rn.field_o[var9];
            var5.a(-30866, 6, 6, 1, 6);
            var5.b(32767);
            var6 = new int[]{var5.field_j + var5.field_x >> 1, var5.field_C + var5.field_E >> 1, var5.field_p + var5.field_e >> 1};
            je.field_d[var9] = var6;
            var5.a(-var6[0], -var6[2], -var6[1], 0);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("lk.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract qg a(int param0);

    final static boolean b(int param0) {
        if (param0 != 6) {
          return true;
        }
        return sg.field_b == l.field_b ? true : false;
    }

    static {
        field_a = Math.atan2(1.0, 0.0);
    }
}
