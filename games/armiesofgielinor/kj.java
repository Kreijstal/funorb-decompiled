/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends bd {
    static wk[] field_s;
    static String field_t;

    final void a(int param0, ha param1) {
        try {
            if (param0 != 64) {
                kj.a(true, -124);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "kj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        qc.field_d = new dl(2);
        qc.field_d.a(-1, param0, vf.a(sm.field_d, -1, ko.field_b), param1);
    }

    final static byte[] a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              if (param1 == 31732) {
                break L1;
              } else {
                kj.a((byte) -52);
                break L1;
              }
            }
            var3 = new byte[var2_int];
            vm.a(param0, 0, var3, 0, var2_int);
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("kj.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    kj(int param0, int param1) {
        this.field_m = param0;
        this.field_n = new int[param1];
        this.field_n[this.field_m] = 8192;
    }

    public static void a(boolean param0) {
        field_t = null;
        if (param0) {
            kj.a((byte) 66);
            field_s = null;
            return;
        }
        field_s = null;
    }

    final static String a(byte param0) {
        String var1;
        byte[] var2;
        if (param0 <= 26) {
          var2 = (byte[]) null;
          kj.a((byte[]) null, -39);
          var1 = ah.field_a.a((byte) -109);
          System.out.println(var1);
          return var1;
        } else {
          var1 = ah.field_a.a((byte) -109);
          System.out.println(var1);
          return var1;
        }
    }

    static {
        field_t = "Hide objective";
    }
}
