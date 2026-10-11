/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends qc {
    static long field_A;
    int field_y;
    bq field_B;
    static String field_z;
    static pd field_E;
    static int field_C;
    byte[] field_D;

    final byte[] e(int param0) {
        if (this.field_t) {
          throw new RuntimeException();
        }
        if (param0 == 0) {
          return this.field_D;
        }
        ga var3 = (ga) null;
        li.a((byte) 125, (ga) null);
        return this.field_D;
    }

    public static void g(int param0) {
        field_E = null;
        field_z = null;
        if (param0 <= 60) {
          ga var2 = (ga) null;
          li.a((byte) 126, (ga) null);
        }
    }

    final int f(int param0) {
        if (this.field_t) {
          return 0;
        }
        if (param0 != 100) {
          this.f(44);
          return 100;
        }
        return 100;
    }

    final static np a(byte param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        np stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          var4 = param1.g(31365);
          var5 = param1.i(-1478490344);
          var6 = param1.i(-1478490344);
          if (param0 != -119) {
            field_C = -55;
          }
          var7 = param1.i(-1478490344);
          var8 = param1.i(-1478490344);
          var9 = param1.i(-1478490344);
          stackIn_3_0 = new np(var2_int, var3, var4, var5, var6, var9, var7, var8);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("li.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    li() {
    }

    static {
        field_z = "Encouraging rule breaking";
    }
}
