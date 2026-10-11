/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hoa extends rqa {
    static int field_o;
    static String field_p;

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_27_0 = false;
        if (param1) {
          return true;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (param0 >= 97 &&
              param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_27_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_27_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 >= 65 &&
          param0 <= 90) {
          return true;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(149, 62, param0[0].a(68));
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 72);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hoa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    hoa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(String param0, int param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = hp.field_b.field_R;
          var3 = var4;
          hp.field_b.field_R = param0;
          qw.field_l.b(param2, 80);
          hp.field_b.field_R = var4;
          if (param1 == 0) {
            return;
          }
          hoa.a(77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("hoa.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != -123) {
          hoa.a(-15);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    static {
        field_o = 0;
        field_p = "Seriously offensive language";
    }
}
