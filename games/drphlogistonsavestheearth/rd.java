/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends wh {
    private Object field_I;
    static int[] field_J;
    static int field_G;
    static int field_D;
    static String field_E;
    static int field_F;
    static he[] field_A;
    static int field_z;
    static int[] field_y;
    static vd field_C;
    static int field_B;

    final boolean a(byte param0) {
        if (param0 != 28) {
          return false;
        }
        return false;
    }

    final Object b(byte param0) {
        if (param0 <= 57) {
          vj var3 = (vj) null;
          rd.a(-9, true, -89, (vj) null);
          return this.field_I;
        }
        return this.field_I;
    }

    final static he[] a(int param0, boolean param1, int param2, vj param3) {
        RuntimeException var4 = null;
        he[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (he[]) null;
            return stackIn_2_0;
          }
          if (fl.a(param0, param3, param2, (byte) -98)) {
            return ih.k(24782);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_y = null;
        field_C = null;
        field_J = null;
        field_E = null;
        field_A = null;
        if (param0 > -102) {
          rd.h(-77);
        }
    }

    final static void h(int param0) {
        if (param0 != 300) {
          rd.g(37);
          if (dg.field_e <= 10) {
            lc.a(0, (byte) 24);
            return;
          }
          lc.a(dg.field_e - 10, (byte) 24);
          return;
        }
        if (dg.field_e <= 10) {
          lc.a(0, (byte) 24);
          return;
        }
        lc.a(dg.field_e - 10, (byte) 24);
    }

    rd(Object param0, int param1) {
        super(param1);
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "rd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_E = "This password contains your email address, and would be easy to guess";
        field_J = new int[]{100, 100, 100, 100, 100, 300, 300, 200, 200, 100, 100, 200, 300, 200, 1000};
        ah.a((byte) 127, 50);
        field_y = new int[8192];
        field_C = new vd();
    }
}
