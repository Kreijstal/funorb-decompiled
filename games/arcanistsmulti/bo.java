/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static volatile int field_e;
    static qb[] field_a;
    static int field_d;
    static boolean field_c;
    static String field_b;

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ab var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!vn.a(var6, 0)) {
            stackIn_3_0 = fn.field_h;
            return stackIn_3_0;
          }
          if (jb.field_t != 2) {
            stackIn_6_0 = nm.field_e;
            return stackIn_6_0;
          }
          if (je.a(16, param0)) {
            stackIn_9_0 = sd.field_l;
            return stackIn_9_0;
          }
          if (kl.a(param0, 1)) {
            stackIn_13_0 = tj.a(-30, new String[]{param0}, gj.field_e);
            return stackIn_13_0;
          }
          if (rc.field_m >= 100 &&
            ah.field_c <= 0) {
            stackIn_17_0 = rg.field_e;
            return stackIn_17_0;
          }
          if (200 <= rc.field_m) {
            stackIn_21_0 = rg.field_e;
            return stackIn_21_0;
          }
          if (param1 != -26) {
            bo.a(9);
          }
          if (sa.a(param0, 320)) {
            stackIn_26_0 = tj.a(125, new String[]{param0}, r.field_a);
            return stackIn_26_0;
          }
          var5 = he.field_e;
          var5.b((byte) -63, param2);
          var5.field_g = var5.field_g + 1;
          var4 = var5.field_g;
          var5.f(0, (byte) -80);
          var5.a(param0, param1 ^ -23357);
          var5.b(-var4 + var5.field_g, (byte) 43);
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("bo.A(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime3;
        int var5Lifetime3;
        if (param0) {
          if (nf.field_z[param1] < nf.field_z[param3]) {
            return true;
          }
          if (nf.field_z[param1] > nf.field_z[param3]) {
            return false;
          }
          if (lm.field_i[param3] > lm.field_i[param1]) {
            return true;
          }
          if (lm.field_i[param3] < lm.field_i[param1]) {
            return false;
          }
          if (param2 < -32) {
            var4 = tj.field_u[param1] + (hc.field_e[param1] + ba.field_o[param1]);
            var5 = tj.field_u[param3] + hc.field_e[param3] + ba.field_o[param3];
            if (var5 > var4) {
              return true;
            }
            if (var4 > var5) {
              return false;
            }
            return !(param3 <= param1);
          }
          bo.a(true, 73, (byte) 32, -114);
          var4Lifetime3 = tj.field_u[param1] + (hc.field_e[param1] + ba.field_o[param1]);
          var5Lifetime3 = tj.field_u[param3] + hc.field_e[param3] + ba.field_o[param3];
          if (var5Lifetime3 > var4Lifetime3) {
            return true;
          }
          if (var4Lifetime3 > var5Lifetime3) {
            return false;
          }
          return !(param3 <= param1);
        }
        if (lm.field_i[param1] < lm.field_i[param3]) {
          return true;
        }
        if (lm.field_i[param3] < lm.field_i[param1]) {
          return false;
        }
        if (nf.field_z[param3] > nf.field_z[param1]) {
          return true;
        }
        if (nf.field_z[param1] > nf.field_z[param3]) {
          return false;
        }
        if (param2 < -32) {
          var4Lifetime1 = tj.field_u[param1] + (hc.field_e[param1] + ba.field_o[param1]);
          var5Lifetime1 = tj.field_u[param3] + hc.field_e[param3] + ba.field_o[param3];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(param3 <= param1);
        }
        bo.a(true, 73, (byte) 32, -114);
        var4Lifetime2 = tj.field_u[param1] + (hc.field_e[param1] + ba.field_o[param1]);
        var5Lifetime2 = tj.field_u[param3] + hc.field_e[param3] + ba.field_o[param3];
        if (var5Lifetime2 > var4Lifetime2) {
          return true;
        }
        if (var4Lifetime2 > var5Lifetime2) {
          return false;
        }
        if (param3 <= param1) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        int var1 = -126 % ((-64 - param0) / 53);
    }

    static {
        field_d = 100;
        field_e = 0;
        field_c = false;
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
