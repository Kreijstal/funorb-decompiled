/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends bca {
    static sna field_v;
    static jfa field_s;
    static String field_t;
    static byte[][] field_q;
    int field_r;
    static int field_u;

    final void a(byte param0, lu param1) {
        try {
          super.a((byte) -98, param1);
          param1.d(this.field_r, 0);
          if (param0 > -12) {
            field_s = (jfa) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rn(int param0, nq param1, int param2) {
        super(param0, param1);
        try {
          this.field_r = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        gj var4 = null;
        baa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (gj) null;
            this.a(-73, (gj) null);
          }
          stackIn_3_0 = new baa(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int c(int param0, int param1) {
        int var2 = param1 * (param1 * param1 >> 12) >> 12;
        int var3 = -61440 + 6 * param1;
        int var4 = param0 + (param1 * var3 >> 12);
        return var2 * var4 >> 12;
    }

    public static void d(int param0) {
        field_v = null;
        if (param0 < 83) {
          return;
        }
        field_t = null;
        field_s = null;
        field_q = (byte[][]) null;
    }

    final void a(op param0, int param1) {
        try {
          int var3_int = -54 % ((param1 - 12) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rn(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 50);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Congratulations, You have been awarded £5 to spend on more food in the shop. Click Continue to return to your fridge.";
        field_q = new byte[250][];
    }
}
