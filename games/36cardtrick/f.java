/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static kc field_a;

    public static void a(int param0) {
        if (param0 != -663255224) {
          String var2 = (String) null;
          f.a((String) null, 6, (String) null);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void b(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        dl var4 = null;
        int var4_int = 0;
        int var5 = 0;
        gh var5_ref_gh = null;
        int[] var6 = null;
        int var8 = 0;
        w var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Main.field_T;
        try {
          var9 = rd.field_j;
          var2 = var9.f(-98);
          var3 = var9.f(92);
          if (param0 == ~var2) {
            var4 = (dl) (tf.field_q.a((byte) 74));
            if (var4 == null) {
              mc.a((byte) -126);
              return;
            }
            var5 = -var9.field_i + al.field_a;
            var11 = var4.field_i;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.f(-126) << (bc.a(var7, 3) << 8));
            }
            var4.c(106);
            return;
          }
          if (1 != var2) {
            k.a((Throwable) null, (byte) 79, "LR1: " + aj.a((byte) 92));
            mc.a((byte) -127);
            return;
          }
          var4_int = var9.b((byte) 59);
          var5_ref_gh = (gh) (sj.field_a.a((byte) 74));
          while (var5_ref_gh != null) {
            if (var3 != var5_ref_gh.field_m ||
              var4_int != var5_ref_gh.field_l) {
              var5_ref_gh = (gh) (sj.field_a.b((byte) -106));
              continue;
            }
            break;
          }
          if (var5_ref_gh == null) {
            mc.a((byte) -128);
            return;
          }
          var5_ref_gh.c(param0 ^ -99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "f.C(" + param0 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hi.a(param0, 0)) {
            return false;
          }
          if (lc.a((byte) -33, param0)) {
            return false;
          }
          if (param1 <= 86) {
            return true;
          }
          if (te.a(false, param0)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (gi.a(param0, -123, param2)) {
            return false;
          }
          if (la.a(param2, (byte) -115, param0)) {
            return false;
          }
          if (!g.a(param2, param0, -1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("f.A(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    static {
    }
}
