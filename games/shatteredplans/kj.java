/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static pf field_a;
    boolean field_h;
    boolean field_b;
    String[] field_d;
    static String field_e;
    static bi[] field_f;
    int field_c;
    static String field_i;
    String field_g;

    final static vr a(byte param0, ob param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        vr stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.j(-109);
          var3 = param1.j(-66);
          stackIn_3_0 = ((var3 & 1) == 0) ? 0 : 1;
          var4 = stackIn_3_0;
          stackIn_6_0 = ((2 & var3) == 0) ? 0 : 1;
          var5 = stackIn_6_0;
          stackIn_9_0 = ((var3 & 4) == 0) ? 0 : 1;
          var6 = stackIn_9_0;
          stackIn_12_0 = ((8 & var3) == 0) ? 0 : 1;
          var7 = stackIn_12_0;
          var9 = 72 / ((param0 + 12) / 62);
          stackIn_15_0 = (0 == (var3 & 16)) ? 0 : 1;
          var8 = stackIn_15_0;
          stackIn_18_0 = ((var3 & 32) == 0) ? 0 : 1;
          var10 = stackIn_18_0;
          stackIn_21_0 = (0 == (64 & var3)) ? 0 : 1;
          var11 = stackIn_21_0;
          stackIn_22_0 = new vr(var4 != 0, var5 != 0, var6 != 0, var7 != 0, var8 != 0, var10 != 0, var11 != 0, var2_int);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("kj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 == 1) {
          field_e = null;
          field_f = null;
          return;
        }
        kj.a(-84);
        field_e = null;
        field_f = null;
    }

    kj(boolean param0) {
        this.field_h = param0 ? true : false;
    }

    static {
        field_i = "Orb points: ";
        field_e = "Resource output";
    }
}
