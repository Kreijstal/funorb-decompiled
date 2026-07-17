/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class rj {
    static ti[] field_a;
    static boolean field_b;

    abstract int a(int param0);

    final static String a(ci param0, byte param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        String stackIn_3_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) -123)) {
              var9 = param0.a(false);
              var2 = var9;
              var3 = param0.b(79, "index");
              var4 = 0;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var5.length) {
                  stackOut_12_0 = ne.field_c + " - " + var4 / (-1 + var9.length) + "%";
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  L2: {
                    var7 = var5[var6];
                    if (var3 != var7) {
                      var4 = var4 + param0.a(true, var7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = bd.field_r;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2_ref;
            stackOut_14_1 = new StringBuilder().append("rj.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -38 + 41);
        }
        return stackIn_13_0;
    }

    final static h b(boolean param0) {
        if (null == eh.field_e) {
            eh.field_e = new h(al.field_i, 20, 0, 0, 0, 11579568, -1, 0, 0, al.field_i.field_y, -1, 2147483647, true);
        }
        if (!param0) {
            h discarded$0 = rj.b(false);
        }
        return eh.field_e;
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    abstract void a(boolean param0, java.awt.Component param1);

    abstract void a(byte param0, java.awt.Component param1);

    static {
    }
}
