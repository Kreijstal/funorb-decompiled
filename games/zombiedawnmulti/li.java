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
        np discarded$2 = null;
        ga var3 = null;
        if (!this.field_t) {
          if (param0 != 0) {
            var3 = (ga) null;
            discarded$2 = li.a((byte) 125, (ga) null);
            return this.field_D;
          } else {
            return this.field_D;
          }
        } else {
          throw new RuntimeException();
        }
    }

    public static void g(int param0) {
        np discarded$0 = null;
        field_E = null;
        field_z = null;
        if (param0 <= 60) {
            ga var2 = (ga) null;
            discarded$0 = li.a((byte) 126, (ga) null);
        }
    }

    final int f(int param0) {
        int discarded$0 = 0;
        if (this.field_t) {
            return 0;
        }
        if (param0 != 100) {
            discarded$0 = this.f(44);
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        np stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.d((byte) 69);
              var3 = param1.d((byte) 69);
              var4 = param1.g(31365);
              var5 = param1.i(-1478490344);
              var6 = param1.i(-1478490344);
              if (param0 == -119) {
                break L1;
              } else {
                field_C = -55;
                break L1;
              }
            }
            var7 = param1.i(-1478490344);
            var8 = param1.i(-1478490344);
            var9 = param1.i(-1478490344);
            stackOut_2_0 = new np(var2_int, var3, var4, var5, var6, var9, var7, var8);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("li.I(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    li() {
    }

    static {
        field_z = "Encouraging rule breaking";
    }
}
