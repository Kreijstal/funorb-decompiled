/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static String[] field_b;
    static boolean field_c;
    int field_a;
    static String field_d;

    final static void a(byte param0) {
        if (!ll.field_a) {
          if (null == go.field_k) {
            go.field_k = va.a((byte) -103, 4);
          }
          if (go.field_k.field_i) {
            ti.field_z = go.field_k.field_m;
            go.field_k = null;
            if (!ll.field_a) {
              ii.field_c = ii.field_c & ~ti.field_z;
            }
            ll.field_a = true;
          }
        }
        if (!ik.field_f) {
          if (null == wn.field_g) {
            wn.field_g = hi.a(6, -52);
          }
          if (wn.field_g.field_m) {
            j.a(param0 - 56, wn.field_g.field_l);
            if (ad.field_a) {
              tn.a(0);
            }
            ik.field_f = true;
            wn.field_g = null;
          }
        }
        if (param0 == 0) {
          return;
        }
        field_d = (String) null;
    }

    final static boolean a(int param0, int param1) {
        if (param1 == -1) {
          return true;
        }
        if (param0 == 16616) {
          return 0 != (ka.field_g & 1 << param1) ? true : false;
        }
        kb.a(113);
        return 0 != (ka.field_g & 1 << param1) ? true : false;
    }

    final static boolean b(int param0) {
        int var1 = 94 % ((param0 + 21) / 54);
        return oi.field_f;
    }

    public static void a(int param0) {
        int var1 = 76 % ((param0 - 71) / 40);
        field_b = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static va a(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        va stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -53) {
            var3 = (String) null;
            kb.a((String) null, (byte) -81);
          }
          stackIn_3_0 = new va(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kb.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    kb(int param0) {
        this.field_a = param0;
    }

    static {
        field_b = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_d = "Major shield";
    }
}
