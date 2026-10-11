/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends hg {
    static int[] field_h;
    static qh[] field_k;
    static String[] field_j;
    String field_g;
    int field_i;

    public static void a(byte param0) {
        if (param0 != -85) {
          return;
        }
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          rb.a((byte) -76);
          if (pg.field_c == null) {
            return false;
          }
          if (al.field_d == ck.field_t) {
            return true;
          }
          return false;
        }
        if (pg.field_c == null) {
          return false;
        }
        if (al.field_d == ck.field_t) {
          return true;
        }
        return false;
    }

    final static void a(dk[] param0, int param1, int param2, byte param3) {
        int var5 = 0;
        dk[] var4 = null;
        dk var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dk[] var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var10 = EscapeVector.field_A;
        try {
          if (param0 == null) {
            return;
          }
          var11 = param0;
          var4 = var11;
          for (var5 = 0; var11.length > var5; var5++) {
            var6 = var11[var5];
            if (var6 != null) {
              var7 = var6.field_c;
              stackIn_9_0 = (param2 != var7) ? 0 : 1;
              var8 = stackIn_9_0;
              stackIn_12_0 = (var7 != param1) ? 0 : 1;
              var9 = stackIn_12_0;
              var6.a(var8 != 0, var9 != 0, (byte) 81);
            }
          }
          if (param3 > -5) {
            field_k = (qh[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("rb.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    rb(String param0, int param1) {
        try {
          this.field_g = param0;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = new String[]{"Congratulations on your success in the asteroid belt. Given your success thus far, we are extending your mission. You must now cripple the alien's mining operations.", "Target and eliminate their ore extraction machinery."};
    }
}
