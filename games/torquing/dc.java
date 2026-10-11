/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_b;
    static long field_c;
    static ln field_a;

    final static li a(String param0, la param1, la param2, boolean param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.a(-1, param0);
          var6 = param1.a(param4, -107, var5_int);
          if (param3) {
            field_b = (String) null;
          }
          stackIn_3_0 = ao.a(-97, var5_int, var6, param1, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("dc.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          aq.field_c = false;
          cf.field_f = false;
          if (gn.field_m != null &&
            gn.field_m.field_D) {
            if (param0 == 8) {
              if (!ff.field_a) {
                param1 = cl.field_c;
              } else {
                param1 = un.field_a;
              }
              param0 = 2;
              un.field_k.a(-78, eo.field_a);
            }
            var3_int = 1;
            if (param0 == 10) {
              var3_int = 0;
              d.d((byte) -77);
            }
            if (var3_int != 0) {
              if (cf.field_f) {
                param1 = ff.a(new String[]{param1}, param2 ^ 2, jg.field_w);
              }
              if (nk.field_t) {
                param1 = pn.field_a;
              }
              gn.field_m.a(param0, param1, param2 ^ -259);
            }
            if (param0 != 256 &&
              param0 != 10 &&
              !ff.field_a) {
              un.field_k.h(16180);
            }
          }
          if (param2 == 2) {
            return;
          }
          field_a = (ln) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("dc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
          return kh.field_o == mg.field_b ? true : false;
        }
        field_b = (String) null;
        return kh.field_o == mg.field_b ? true : false;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          return;
        }
        field_b = null;
    }

    static {
        field_b = "To server list";
    }
}
