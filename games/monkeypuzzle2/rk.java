/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_a;
    int field_c;
    String field_f;
    String field_i;
    static int field_d;
    static int field_h;
    ad field_e;
    static md field_g;
    String field_b;

    final static void a(md param0, java.awt.Frame param1, boolean param2) {
        ic var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          while (true) {
            var3 = param0.a(param1, -120);
            while (var3.field_g == 0) {
              em.a(10L, param2);
            }
            if (var3.field_g != 1) {
              em.a(100L, false);
              continue;
            }
            break;
          }
          param1.setVisible(param2);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("rk.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 10) {
          rk.a(-4);
          field_a = null;
          return;
        }
        field_a = null;
    }

    private rk() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Sound: ";
    }
}
