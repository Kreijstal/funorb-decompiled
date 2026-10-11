/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static je field_a;
    static int field_b;
    static String field_e;
    static String field_d;
    static je field_c;

    final static void a(boolean param0, int param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (76 == param1) {
            return;
          }
          if (!param0) {
            if (16 == param1) {
              param1 = 78;
            }
            if (25 == param1) {
              param1 = 79;
            }
            if (param1 == 48) {
              param1 = 80;
            }
            if (param1 == 85) {
              param1 = 89;
            }
          }
          if (!param2) {
            return;
          }
          for (var3_int = 1; var3_int < mn.field_m[param1].length; var3_int++) {
            mn.field_k[param1][var3_int] = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "eb.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != 1) {
          field_c = (je) null;
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static int a(byte param0, int param1) {
        param1 = ((-1431655766 & param1) >>> 1) + (1431655765 & param1);
        param1 = (param1 & 858993459) + ((param1 & -858993458) >>> 2);
        param1 = 252645135 & (param1 >>> 4) + param1;
        if (param0 >= -70) {
          field_e = (String) null;
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    static {
        field_d = "Send private message";
        field_e = "Month";
        field_b = 5;
    }
}
