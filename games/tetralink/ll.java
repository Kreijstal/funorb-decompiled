/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll extends gb {
    static oh[] field_u;
    boolean field_D;
    static hl field_A;
    static uf field_C;
    volatile boolean field_v;
    boolean field_B;
    static String[] field_y;
    static String field_t;
    static String field_E;
    static String field_w;
    static String field_z;
    static ah field_x;

    final static int a(int param0, byte param1, int param2) {
        if (param1 == -122) {
          if ((param0 ^ -1) > -3) {
            if (-6 >= (param2 ^ -1)) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          field_u = (oh[]) null;
          if ((param0 ^ -1) > -3) {
            if (-6 >= (param2 ^ -1)) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        }
    }

    final static void a(el param0, int param1) {
        el var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          param0.b(false);
          var2 = (el) ((Object) jl.field_a.c(false));
          L0: while (true) {
            L1: {
              if (var2 == null) {
                break L1;
              } else {
                if (!var2.a(-24, param0)) {
                  break L1;
                } else {
                  var2 = (el) ((Object) jl.field_a.a((byte) -70));
                  continue L0;
                }
              }
            }
            var3 = 107 % ((38 - param1) / 61);
            if (var2 == null) {
              jl.field_a.a(param0, false);
              return;
            } else {
              cl.a(var2, 99, param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("ll.H(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static String f(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        return kb.field_q.g((byte) 81);
    }

    final static void a(int param0, String param1) {
        if (param0 != -3) {
            return;
        }
        try {
            ng.a(param1, true);
            uf.a(ec.field_d, false, false);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ll.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract byte[] c(boolean param0);

    abstract int a(boolean param0);

    public static void b(byte param0) {
        field_y = null;
        field_u = null;
        field_E = null;
        field_w = null;
        int var1 = 100 / ((param0 - 44) / 57);
        field_C = null;
        field_t = null;
        field_z = null;
        field_x = null;
        field_A = null;
    }

    final static void a(boolean param0, java.awt.Component param1, int param2, ie param3, g param4, int param5, byte param6, int param7) {
        try {
            nk.a(param7, param0, 10);
            ch.field_q = nk.a(param3, param1, 0, param2);
            hc.field_v = nk.a(param3, param1, 1, param5);
            u.field_g = new fg();
            id.field_x = param5 * 1000 / param7;
            hc.field_v.a(u.field_g);
            if (param6 < 126) {
                g var9 = (g) null;
                ll.a(true, (java.awt.Component) null, -128, (ie) null, (g) null, 27, (byte) -4, -4);
            }
            ic.field_b = param4;
            ic.field_b.a((byte) 96, jj.field_a);
            ch.field_q.a(ic.field_b);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ll.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(int param0, oh[] param1, jb param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, oh[] param13, int param14, int param15, jb param16, int param17, int param18, oh[] param19, int param20) {
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
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        g var22 = null;
        try {
          L0: {
            L1: {
              fn.a(param12, param18, new ve(param19), param16, param2, true, param20, param9, new ve(param13), new ve(param1), param10, param6, param4, param0, param15, param17, param8, param11, param7, param3, param14);
              if (param5 == -11319) {
                break L1;
              } else {
                var22 = (g) null;
                ll.a(false, (java.awt.Component) null, -31, (ie) null, (g) null, -116, (byte) 29, 80);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var21);

            stackIn_5_1 = new StringBuilder().append("ll.B(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
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


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
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


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
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
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param17).append(',').append(param18).append(',');

            if (param19 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_18_2 + ',' + param20 + ')');
        }
    }

    ll() {
        this.field_v = true;
    }

    static {
        field_C = new uf();
        field_z = "You have <%0> unread messages!";
        field_E = "Average rating";
    }
}
