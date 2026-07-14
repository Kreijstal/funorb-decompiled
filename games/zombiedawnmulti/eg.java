/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends kk {
    private Object field_A;
    static cd field_B;
    static byte[] field_E;
    static String field_z;
    static ja field_D;
    static int field_C;

    final boolean f(int param0) {
        if (param0 != 1000) {
            return false;
        }
        return false;
    }

    final static ic a(int param0, long param1, String param2, boolean param3, String param4) {
        if (0L != param1) {
          if (param3) {
            return (ic) (Object) new wn(param1, param4);
          } else {
            if (param0 != 64) {
              field_B = null;
              return (ic) (Object) new pp(param1, param4);
            } else {
              return (ic) (Object) new pp(param1, param4);
            }
          }
        } else {
          if (param2 == null) {
            if (param3) {
              return (ic) (Object) new wn(param1, param4);
            } else {
              if (param0 == 64) {
                return (ic) (Object) new pp(param1, param4);
              } else {
                field_B = null;
                return (ic) (Object) new pp(param1, param4);
              }
            }
          } else {
            return (ic) (Object) new mn(param2, param4);
          }
        }
    }

    public static void c(byte param0) {
        field_E = null;
        field_z = null;
        field_D = null;
        if (param0 != 5) {
            return;
        }
        field_B = null;
    }

    eg(Object param0, int param1) {
        super(param1);
        ((eg) this).field_A = param0;
    }

    final Object e(int param0) {
        if (param0 > -32) {
            boolean discarded$0 = ((eg) this).f(-36);
            return ((eg) this).field_A;
        }
        return ((eg) this).field_A;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new byte[]{(byte)5};
        field_z = "Email address is unavailable";
        field_C = 64;
    }
}
