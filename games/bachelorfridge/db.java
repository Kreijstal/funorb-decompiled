/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static vr field_a;
    static String[] field_b;

    final static pp a(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        qq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = qi.a(param0, (byte) 115);
          var3 = param0.b(true);
          var4 = param0.c((byte) -85);
          if (param1 != 95) {
            field_a = (vr) null;
          }
          stackIn_3_0 = new qq(var2, var3, var4);
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("db.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        fj var1 = (fj) (kma.field_o.a((byte) -124));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        dg.a(var1.field_o, var1.field_f, var1.field_n);
        dg.a(var1.field_l, var1.field_j, var1.field_k, var1.field_h);
        if (param0 > 60) {
          var1.field_o = null;
          ii.field_m.a(var1, true);
          return;
        }
        db.b(-65);
        var1.field_o = null;
        ii.field_m.a(var1, true);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = (String[]) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = jm.a((byte) 75, param0, '_', "");
          var3 = vm.a(param0, (byte) 106);
          if (param2) {
            var4 = (String) null;
            db.a((String) null, (String) null, false);
          }
          stackIn_7_0 = (param1.indexOf(param0) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("db.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_b = new String[16];
    }
}
