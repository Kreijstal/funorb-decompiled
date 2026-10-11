/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static ee field_a;

    final static void a(lu param0, int param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          gk.field_b = param0.e((byte) 93) << 5;
          var2_int = param0.b(param1 + 14647551);
          fe.field_k = var2_int << 18 & 1835008;
          gk.field_b = gk.field_b + (var2_int >> 3);
          fe.field_k = fe.field_k + (param0.e((byte) 117) << 2);
          var2_intLifetime1 = param0.b(param1 + 14647551);
          al.field_a = var2_intLifetime1 << 15 & param1;
          fe.field_k = fe.field_k + (var2_intLifetime1 >> 6);
          al.field_a = al.field_a + (param0.b(param1 + 14647551) << 7);
          var2_intLifetime2 = param0.b(16711935);
          al.field_a = al.field_a + (var2_intLifetime2 >> 1);
          kka.field_g = var2_intLifetime2 << 16 & 65536;
          kka.field_g = kka.field_g + param0.e((byte) 65);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ml.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -26 / ((-12 - param0) / 42);
        field_a = null;
    }

    final static boolean a(int param0, char param1) {
        if (param0 != -130697146) {
          field_a = (ee) null;
          if (param1 < 65) {
            if (97 > param1) {
              return false;
            }
            if (122 >= param1) {
              return true;
            }
            return false;
          }
          if (90 >= param1) {
            return true;
          }
          if (97 > param1) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (param1 >= 65) {
          if (90 >= param1) {
            return true;
          }
          if (97 > param1) {
            return false;
          }
          if (122 >= param1) {
            return true;
          }
          return false;
        }
        if (97 > param1) {
          return false;
        }
        if (122 >= param1) {
          return true;
        }
        return false;
    }

    static {
    }
}
