/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf {
    static kg field_c;
    static boolean field_g;
    static volatile int field_f;
    static boolean field_e;
    static String field_d;
    static int[] field_a;
    static String field_b;

    abstract void a(byte param0, byte[] param1);

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
    }

    abstract byte[] a(int param0);

    final static boolean a(int param0, String param1, boolean param2, ke param3, String param4, String param5, int param6) {
        RuntimeException var7 = null;
        v var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ml.field_a != oe.field_Q) {
            return false;
          }
          if (param0 != 30692) {
            return true;
          }
          var8 = new v(vg.field_Z, param3);
          vg.field_Z.c(var8, 0);
          if (mf.c(109)) {
            var8.o(param0 - 30583);
            return true;
          }
          hd.field_d = param2;
          ji.field_d = null;
          oe.field_Q = wh.field_fb;
          wc.field_Ob = param6;
          kc.field_n = param4;
          rd.field_Jb = param1;
          jb.field_o = param5;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("qf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_f = 0;
        field_c = new kg(256);
        field_a = new int[8192];
        field_d = "Loading fonts";
        field_b = "You already have the charge cannon";
    }
}
