/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static String field_b;
    static int[] field_a;

    final static byte[] a(ga param0, byte[] param1, byte param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = param0.h(param3, 14862);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new byte[var4_int];
          }
          if (param2 >= -4) {
            dn.a(-49);
          }
          var5 = param0.h(3, 14862);
          var6 = (byte)param0.h(8, 14862);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (byte)(var6 + param0.h(var5, 14862));
            }
          }
          stackIn_18_0 = (byte[]) (param1);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("dn.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ml a(String param0, boolean param1) {
        String var2 = null;
        ml var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ml stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (ol.field_o == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (0 == param0.length()) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = tg.a(var6, param1);
          if (var2 == null) {
            return null;
          }
          var3 = (ml) (ol.field_o.a((long)var2.hashCode(), -22877));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_Hb);
            var4 = tg.a(var7, false);
            if (!var4.equals(var2)) {
              var3 = (ml) (ol.field_o.b((byte) 68));
              continue;
            }
            break;
          }
          stackIn_16_0 = var3;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("dn.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 16130) {
          String var2 = (String) null;
          dn.a((String) null, false);
        }
        field_a = null;
    }

    static {
        field_b = "Unpacking sound effects";
    }
}
