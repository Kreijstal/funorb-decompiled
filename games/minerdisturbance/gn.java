/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    static String field_b;
    static String field_c;
    static String field_a;

    final static int a(int param0, byte[] param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            gn.a(4);
          }
          stackIn_3_0 = qn.a(-1648911295, 0, param0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ea[] a(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          byte[] var5 = (byte[]) null;
          gn.a(-10, (byte[]) null, false);
        }
        return lc.a(param2, 1, param1, param0, (byte) 127);
    }

    final static vk[] a(int param0, vf param1) {
        int var5 = 0;
        vk[] stackIn_4_0 = null;
        vk[] stackIn_12_0 = null;
        vk[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        vk[] var4 = null;
        vk var6 = null;
        int var7 = 0;
        ia var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          if (!param1.b((byte) 104)) {
            stackIn_4_0 = new vk[]{};
            return stackIn_4_0;
          }
          var8 = param1.a((byte) -114);
          if (param0 != -591) {
            field_b = (String) null;
          }
          while (var8.field_c == 0) {
            gf.a(10L, param0 - 9718);
          }
          if (var8.field_c == 2) {
            stackIn_12_0 = new vk[]{};
            return stackIn_12_0;
          }
          var10 = (int[]) (var8.field_a);
          var9 = var10;
          var3 = var9;
          var4 = new vk[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new vk();
            var4[var5] = var6;
            var6.field_f = var3[var5 << 2];
            var6.field_c = var3[(var5 << 2) + 1];
            var6.field_h = var3[2 + (var5 << 2)];
            var6.field_b = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("gn.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 28808) {
          bj var2 = (bj) null;
          gn.a((bj) null, (byte) 33);
        }
    }

    final static void a(bj param0, byte param1) {
        b var3 = null;
        try {
          int var2_int = 86 % ((param1 + 42) / 57);
          b.a(param0.a("", 0, "headers.packvorbis"));
          var3 = b.a(param0, "jagex logo2.packvorbis", "");
          var3.a();
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Ranking: Worm Chow";
        field_c = "Unfortunately you are not eligible to create an account.";
        field_a = "Volcano";
    }
}
