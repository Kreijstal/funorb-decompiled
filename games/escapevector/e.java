/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static boolean field_c;
    static boolean field_d;
    static String field_b;
    static boolean field_a;

    final static boolean a(AccountRegistrationPanel param0, boolean param1, String param2, int param3, String param4, boolean param5, String param6) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        try {
          if (dn.field_q != RasterBuffer.field_g) {
            return false;
          }
          qc var8 = new qc(bo.field_F, param0);
          bo.field_F.b(var8, 48);
          if (!ei.d(1000)) {
            gf.field_a = param3;
            hf.field_a = param5;
            SpriteState.field_y = null;
            ResourceArchive.field_b = param4;
            dn.field_q = EmailAvailabilityValidator.field_o;
            tf.field_h = param6;
            AgeValidator.field_o = param2;
          } else {
            var8.s(248);
          }
          if (!param1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var7;
          StringBuilder stackIn_17_1 = new StringBuilder().append("e.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_b = null;
        if (guard != 32153) {
          field_a = false;
        }
    }

    final static NameAvailabilityResult a(int param0) {
        if (param0 != -16055) {
          e.releaseStatics(108);
          if (dn.field_q == RasterBuffer.field_g) {
            throw new IllegalStateException();
          }
          if (ia.field_y == dn.field_q) {
            dn.field_q = RasterBuffer.field_g;
            return SpriteState.field_y;
          }
          return null;
        }
        if (dn.field_q == RasterBuffer.field_g) {
          throw new IllegalStateException();
        }
        if (ia.field_y == dn.field_q) {
          dn.field_q = RasterBuffer.field_g;
          return SpriteState.field_y;
        }
        return null;
    }

    static {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_d = true;
    }
}
