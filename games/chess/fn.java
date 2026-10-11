/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static String field_d;
    static boolean field_a;
    static int field_b;
    static String field_e;
    int field_g;
    static String field_f;
    static int field_c;

    final static void a(byte param0, boolean param1) {
        if (lk.a((byte) 114)) {
          param1 = false;
        }
        if (param0 == -119) {
          lf.a(-1, param1);
          kb.f((byte) 100);
          return;
        }
        fn.a(108);
        lf.a(-1, param1);
        kb.f((byte) 100);
    }

    final static a a(int param0, int param1, int param2, int param3, int param4, jk param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        a var7 = null;
        CharSequence var8 = null;
        java.awt.Frame var9 = null;
        a stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 12) {
            var8 = (CharSequence) null;
            fn.a((CharSequence) null, -47);
          }
          var9 = in.a(param0, param4, param5, param2, 3160, param1);
          var6 = var9;
          if (var9 == null) {
            return null;
          }
          var7 = new a();
          var7.field_g = var9;
          var7.field_g.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param4, param1);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("fn.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = hd.a(10, (byte) 127, true, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -92;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fn.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 >= -3) {
          field_c = 55;
          field_e = null;
          field_d = null;
          return;
        }
        field_e = null;
        field_d = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (qf.field_b) {
          return ol.field_O.a(d.field_Ib, 73, vg.field_a);
        }
        if (an.field_c) {
          return vh.a(83, param3, param2);
        }
        if (pd.a(-26057, param3, param2)) {
          return true;
        }
        if (param1 != 23012) {
          field_f = (String) null;
          if (!kh.field_o) {
            return ba.b(param0, param2, -101);
          }
          return false;
        }
        if (!kh.field_o) {
          return ba.b(param0, param2, -101);
        }
        return false;
    }

    static {
        field_e = "Confirm Password: ";
        field_d = "Playing";
        field_a = false;
        field_f = "Day";
    }
}
