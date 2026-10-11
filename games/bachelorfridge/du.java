/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du {
    int field_c;
    static js field_a;
    int field_d;
    static ee field_b;
    static int[] field_e;

    final static eq a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        Object stackIn_4_0 = null;
        eq stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -43) {
            var3 = (String) null;
            du.a((String) null, (byte) -83);
          }
          if (dka.field_G == kq.field_j) {
            stackIn_4_0 = null;
            return (eq) (stackIn_4_0);
          }
          if (dka.field_G == ki.field_w &&
            param0.equals(vh.field_w)) {
            dka.field_G = tn.field_a;
            stackIn_8_0 = vo.field_d;
            return stackIn_8_0;
          }
          vh.field_w = param0;
          dka.field_G = kq.field_j;
          vo.field_d = null;
          stackIn_10_0 = null;
          return (eq) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("du.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    du(int param0, int param1, int param2, int param3) {
        this.field_d = param3;
        this.field_c = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8192) {
          field_a = (js) null;
          field_a = null;
          field_e = null;
          return;
        }
        field_a = null;
        field_e = null;
    }

    static {
        field_e = new int[8192];
    }
}
