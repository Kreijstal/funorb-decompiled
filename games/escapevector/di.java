/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    String field_a;
    static d field_g;
    static wc field_d;
    static String field_f;
    String field_h;
    static String field_b;
    static String field_c;
    boolean field_e;

    final static void a(int param0) {
        L0: {
          ri.a(param0 ^ -25124);
          if (null != of.field_d) {
            bo.a(of.field_d, (byte) 118);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          re.d(2);
          lb.c(true);
          ac.d(-16802);
          if (rn.a(-31879)) {
            om.field_c.a(1, true);
            rn.a(0, 30785);
            nm.a(16);
            return;
          } else {
            nm.a(16);
            return;
          }
        } else {
          field_c = (String) null;
          re.d(2);
          lb.c(true);
          ac.d(-16802);
          if (!rn.a(-31879)) {
            nm.a(16);
            return;
          } else {
            om.field_c.a(1, true);
            rn.a(0, 30785);
            nm.a(16);
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ll var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 < -75) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var4 = (ll) ((Object) jl.field_n.a(false));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                ma.a(-109, param1, var4);
                var4 = (ll) ((Object) jl.field_n.b((byte) 70));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "di.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_d = null;
        if (param0 != 0) {
          field_b = (String) null;
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static void a(ed[] param0, int param1, int param2, int param3, int param4, int param5, wl param6, int param7, ed[] param8, boolean param9, int param10, int param11, wl param12, byte param13, int param14) {
        RuntimeException runtimeException = null;
        ed[] var16 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var16 = (ed[]) null;
              ti.a(param8, param10, param1, param5, param11, 480, 0, param4, param3, lh.field_e, param12, pc.field_d, param2, param7, (ed[]) null, 2, param14, 0, gd.field_X, param6, param0);
              sm.a(false, param9);
              if (param13 <= -5) {
                break L1;
              } else {
                field_g = (d) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("di.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param13 + ',' + param14 + ')');
        }
    }

    static {
        field_b = "Fuel: ";
        field_c = "Warning! Auto-destruct timer initiated! Escape!";
    }
}
