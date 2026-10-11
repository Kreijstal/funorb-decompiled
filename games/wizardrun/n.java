/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static int field_c;
    static boolean field_a;
    static mg field_b;

    final static ne a(byte param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 != 12) {
          field_c = -110;
          var1 = nf.a((byte) 123);
          if (var1 != null) {
            if (!(var1.indexOf('@') < 0)) {
              var1 = "";
            }
            return new ne(nf.a((byte) 122), pa.a((byte) -106));
          }
          return new ne(nf.a((byte) 122), pa.a((byte) -106));
        }
        var1Lifetime1 = nf.a((byte) 123);
        if (var1Lifetime1 == null) {
          return new ne(nf.a((byte) 122), pa.a((byte) -106));
        }
        if (var1Lifetime1.indexOf('@') >= 0) {
          var1Lifetime1 = "";
          return new ne(nf.a((byte) 122), pa.a((byte) -106));
        }
        return new ne(nf.a((byte) 122), pa.a((byte) -106));
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
          n.a(-8);
        }
    }

    final static ua a(int param0, kl param1, kl param2, int param3, int param4) {
        RuntimeException var5 = null;
        ua stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ua stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -114) {
            stackIn_2_0 = (ua) null;
            return stackIn_2_0;
          }
          if (h.a(param0, param4, param1, -114)) {
            stackIn_7_0 = mg.a(65, param2.a(param4, param0, 1));
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (ua) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("n.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
