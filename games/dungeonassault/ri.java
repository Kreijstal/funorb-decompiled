/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    private static int[] field_a;
    static cn field_g;
    static String field_c;
    static ab field_e;
    static cn[] field_d;
    static int field_b;
    static String field_f;

    final static hh a(byte param0) {
        if (param0 <= 25) {
          field_d = (cn[]) null;
          if (null == ne.field_b) {
            ne.field_b = new hh(ta.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, ta.field_e.field_H, -1, 2147483647, true);
            return ne.field_b;
          }
          return ne.field_b;
        }
        if (null != ne.field_b) {
          return ne.field_b;
        }
        ne.field_b = new hh(ta.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, ta.field_e.field_H, -1, 2147483647, true);
        return ne.field_b;
    }

    final static void a(String param0, String[] param1, int param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          if (param3 > -14) {
            ri.a((byte) 7);
          }
          wd.field_d = dh.field_b;
          if (param2 != 255) {
            if (param2 < 100) {
              ll.field_p = p.a(param2, param0, -28323);
              return;
            }
            if (param2 > 105) {
              ll.field_p = p.a(param2, param0, -28323);
              return;
            }
            var4 = param1;
            ok.a(2, var4);
            ll.field_p = em.a(param1, 8082);
            return;
          }
          stackIn_11_0 = -49;
          stackIn_12_1 = !(wk.field_g >= 13);
          ll.field_p = l.$cfr$intArgs$a$fb458fdecc21(stackIn_11_0, stackIn_12_1);
          var6 = (String[]) null;
          ok.a(2, (String[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("ri.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 < 63) {
          return;
        }
        field_d = null;
        field_g = null;
        field_e = null;
        field_c = null;
    }

    final static void a(String param0, int param1) {
        try {
          jn.field_c = true;
          ip.field_j = param0.trim();
          oh.field_s = 10;
          if (param1 >= -64) {
            CharSequence var3 = (CharSequence) null;
            ri.a((byte) -116, (CharSequence) null);
          }
          jm.a(-17573);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ri.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 10) {
            var3 = (String) null;
            ri.a((String) null, 93);
          }
          stackIn_3_0 = mm.a(param1, true, 10, 3703);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ri.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_c = "Raider attacks.";
        field_a = wa.b(-1);
        int[] var1 = field_a;
        var1[0] = mp.a(var1[0], 67108864);
        int[] var2 = field_a;
        var2[0] = mp.a(var2[0], 134217728);
        int[] var3 = field_a;
        var3[1] = mp.a(var3[1], 4);
        int[] var4 = field_a;
        var4[1] = mp.a(var4[1], 16);
        int[] var5 = field_a;
        var5[1] = mp.a(var5[1], 32);
        int[] var6 = field_a;
        var6[1] = mp.a(var6[1], 128);
        int[] var7 = field_a;
        var7[1] = mp.a(var7[1], 256);
        int[] var8 = field_a;
        var8[1] = mp.a(var8[1], 512);
        field_e = new ab();
    }
}
