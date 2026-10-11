/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static String field_a;
    static int[][] field_c;
    static String field_g;
    static String field_d;
    static String field_e;
    static kl field_b;
    static int[] field_f;

    final static void a(int param0, String param1) {
        int var7 = 0;
        int var8 = 0;
        int var2_int = AiPlanningStrategy.field_d;
        int var3 = ko.field_b;
        int var4 = eq.field_h.field_Z.c(param1, 500);
        int var5 = 6 + eq.field_h.field_Z.a(param1, 500);
        int var6 = 2 + var4 * jn.field_d;
        if (param0 >= -105) {
          return;
        }
        try {
          var7 = jp.a(var2_int, 12, var5, -1);
          var8 = pd.a(var6, 0, var3, 20);
          SoftwareRaster.b(var7, var8, var5, var6, 0);
          SoftwareRaster.f(1 + var7, var8 + 1, var5 - 2, -2 + var6, 16777088);
          eq.field_h.field_Z.a(param1, 3 + var7, -eq.field_h.field_Z.field_H + is.field_b + (var8 + 1), 500, 1000, 0, -1, 0, 0, jn.field_d);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "op.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, nr param2, nr param3, int param4, int param5) {
        try {
          df.field_E = param1;
          ar.field_w = param0;
          ed.field_d = param3;
          rd.field_b = param5;
          int var6_int = -13 / ((53 - param4) / 48);
          ov.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "op.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        nr var4 = null;
        rs var5 = null;
        on var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = (rs) (gg.field_F.first((byte) 94));
          while (var5 != null) {
            IntrusiveNode.a(param0, var5, (byte) 105);
            var5 = (rs) (gg.field_F.next((byte) 123));
          }
          if (!param1) {
            var4 = (nr) null;
            op.a(108, -59, (nr) null, (nr) null, -23, 0);
          }
          var6 = (on) (StateChangeMarker.field_t.first((byte) 112));
          while (var6 != null) {
            s.a(127, param0, var6);
            var6 = (on) (StateChangeMarker.field_t.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "op.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(int param0, String param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        CharSequence var6 = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          if (!hg.a((byte) -18, var6)) {
            stackIn_2_0 = bc.field_d;
            return stackIn_2_0;
          }
          if (2 != th.field_a) {
            stackIn_6_0 = iv.field_c;
            return stackIn_6_0;
          }
          if (gt.a(param1, (byte) -89)) {
            stackIn_9_0 = MoveAttackRequest.field_F;
            return stackIn_9_0;
          }
          if (jj.a(param0 ^ 58, param1)) {
            stackIn_13_0 = fo.a(4800, i.field_Ob, new String[]{param1});
            return stackIn_13_0;
          }
          if (dj.field_a >= 100 &&
            df.field_M <= 0) {
            stackIn_18_0 = MapLayout.field_m;
            return stackIn_18_0;
          }
          if (dj.field_a >= 200) {
            stackIn_21_0 = MapLayout.field_m;
            return stackIn_21_0;
          }
          if (si.a(param1, -3404)) {
            stackIn_24_0 = fo.a(4800, km.field_a, new String[]{param1});
            return stackIn_24_0;
          }
          var5 = vl.field_n;
          var5.h(32161, param2);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.b(1, 0);
          if (param0 != 20) {
            stackIn_27_0 = (String) null;
            return stackIn_27_0;
          }
          var5.b(param1, 13851);
          var5.e(-var4 + var5.position, 5930);
          stackIn_29_0 = null;
          return (String) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("op.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_f = null;
        field_g = null;
        field_a = null;
        if (param0) {
          field_c = (int[][]) null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    static {
        field_g = "Need to move others first";
        field_c = new int[][]{new int[]{2718708, 13182994, 7325724, 13094936, 16351443, 39065, 11545598, 14322432}, new int[]{37119, 15400960, 1441791, 16737792, 1278598, 16763904, 10712575, 10240578}};
        field_a = "This is <%0>'s RuneScape clan if they have one.";
        field_e = "Ignore";
        field_d = "Security";
        field_f = new int[]{2, 17, 18, 36, 37, 38, 6, 43};
    }
}
