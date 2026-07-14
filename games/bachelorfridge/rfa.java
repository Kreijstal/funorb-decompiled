/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rfa {
    static kv field_a;
    static sna field_b;

    final static int a(boolean param0, int param1) {
        param1 = (param1 >>> -354958911 & 1431655765) + (1431655765 & param1);
        if (param0) {
          return -30;
        } else {
          param1 = (858993459 & param1) + (param1 >>> 1029475586 & -214748365);
          param1 = param1 + (param1 >>> 1273209220) & 252645135;
          param1 = param1 + (param1 >>> 566074472);
          param1 = param1 + (param1 >>> 750005616);
          return param1 & 255;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -101) {
            field_b = null;
        }
    }

    final static cj a(int param0, lu param1) {
        if (param0 != 29428) {
            rfa.a((byte) 60);
            return (cj) (Object) new rv(param1);
        }
        return (cj) (Object) new rv(param1);
    }

    static {
    }
}
