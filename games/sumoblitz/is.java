/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    private ki field_d;
    static boolean field_b;
    private sd field_f;
    private ki field_e;
    static jn field_c;
    static boolean field_a;

    final static void b(int param0) {
        lf.a(256, (byte) -58);
        if (param0 <= 56) {
          field_b = false;
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          return (param1 & 33) != 0 ? true : false;
        }
        field_a = true;
        return (param1 & 33) != 0 ? true : false;
    }

    final oq a(int param0, int param1) {
        byte[] var4 = null;
        oq var3 = (oq) (this.field_f.a((long)param0, 123));
        if (var3 == null) {
          if (param0 >= 32768) {
            var4 = this.field_d.a((byte) 115, param0 & 32767, 1);
          } else {
            var4 = this.field_e.a((byte) 109, param0, 1);
          }
          var3 = new oq();
          if (var4 != null) {
            var3.a(new fs(var4), true);
          }
          if (param1 >= ~param0) {
            var3.e(param1 ^ 32885);
          }
          this.field_f.a((long)param0, var3, (byte) 19);
          return var3;
        }
        return var3;
    }

    final static void a(int param0) {
        if (param0 >= 27) {
          pu.field_e.a((byte) 123);
          pu.field_e.a((byte) 112, new dd(pu.field_e));
          return;
        }
        String var2 = (String) null;
        is.a((byte) 10, (String) null);
        pu.field_e.a((byte) 123);
        pu.field_e.a((byte) 112, new dd(pu.field_e));
    }

    final static cn a(byte param0, String param1) {
        String var2 = null;
        cn var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        cn stackIn_6_0 = null;
        cn stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (io.field_b == null) {
            stackIn_3_0 = null;
            return (cn) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = uk.a(-1, var6);
          if (param0 < 89) {
            stackIn_6_0 = (cn) null;
            return stackIn_6_0;
          }
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (cn) (io.field_b.a((long)var2.hashCode(), -45));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_jb);
            var4 = uk.a(-1, var7);
            if (var4 == null) {
              var4 = var3.field_jb;
            }
            if (var4.equals(var2)) {
              stackIn_18_0 = var3;
              return stackIn_18_0;
            }
            var3 = (cn) (io.field_b.a(-109));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("is.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private is() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          String var2 = (String) null;
          is.a((byte) 3, (String) null);
        }
    }

    static {
        field_b = false;
    }
}
