/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends oj {
    static String field_Q;
    static bd field_P;
    static int field_R;
    static float field_O;

    final static pg a(String param0, int param1, String param2, gb param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pg stackIn_2_0 = null;
        pg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a((byte) -2, param0);
          if (param1 != 0) {
            stackIn_2_0 = (pg) null;
            return stackIn_2_0;
          }
          var5 = param3.a(var4_int, param2, -1);
          stackIn_4_0 = hf.a((byte) 119, param3, var4_int, var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("qm.BA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_P = null;
        field_Q = null;
        int var1 = -80 % ((param0 - 55) / 38);
    }

    final static void a(boolean param0) {
        gf.field_e = wl.c(11);
        if (!param0) {
          im.field_e = new gg();
          pc.a(true, true, param0);
          return;
        }
        qm.h(46);
        im.field_e = new gg();
        pc.a(true, true, param0);
    }

    qm() {
    }

    qm(id param0, oc param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param5, param4, 21963, param2, param3, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("qm.<init>(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static gb b(int param0, int param1) {
        if (param0 == 1) {
          return bf.a(false, true, param1, 1, false, 84);
        }
        field_P = (bd) null;
        return bf.a(false, true, param1, 1, false, 84);
    }

    static {
        field_O = 0.0f;
        field_Q = "This entry doesn't match";
    }
}
