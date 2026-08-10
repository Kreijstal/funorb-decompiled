/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik implements Iterable {
    ec field_f;
    static kb field_e;
    static String field_d;
    static java.applet.Applet field_c;
    static nj field_b;
    static String field_a;

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        if (param0 != -61) {
          field_a = (String) null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static o[] a(da param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.c(91, param3);
              var5 = param0.a(param2, -1, var4_int);
              if (param1 == -18362) {
                break L1;
              } else {
                ik.b((byte) -114);
                break L1;
              }
            }
            stackIn_3_0 = ik.a(param0, param1 + -6521, var5, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ik.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        lc var4 = null;
        fj var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (lc) ((Object) hc.field_a.a((byte) 51));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1 == 18897) {
                    break L2;
                  } else {
                    field_c = (java.applet.Applet) null;
                    break L2;
                  }
                }
                var5 = (fj) ((Object) ti.field_b.a((byte) 51));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    h.a(param0, var5, (byte) 78);
                    var5 = (fj) ((Object) ti.field_b.b(param1 ^ -18853));
                    continue L3;
                  }
                }
              } else {
                ud.a((byte) -109, var4, param0);
                var4 = (lc) ((Object) hc.field_a.b(param1 + -18934));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "ik.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final static o[] a(da param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        o[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -24883) {
                break L1;
              } else {
                ik.b((byte) -114);
                break L1;
              }
            }
            if (l.a(param1 ^ -24921, param2, param3, param0)) {
              stackIn_6_0 = fi.b(255);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ik.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (o[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0, ec param1) {
        try {
            if (null != param1.field_k) {
                param1.a(97);
            }
            param1.field_i = this.field_f;
            int var3_int = -27 / ((-58 - param0) / 51);
            param1.field_k = this.field_f.field_k;
            param1.field_k.field_i = param1;
            param1.field_i.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ik.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ec a(byte param0) {
        ec var2;
        ec var3;
        var2 = this.field_f.field_i;
        if (this.field_f != var2) {
          if (param0 > -105) {
            var3 = (ec) null;
            this.a(-40, (ec) null);
            var2.a(97);
            return var2;
          } else {
            var2.a(97);
            return var2;
          }
        } else {
          return null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new jl((ik) (this)));
    }

    private ik() throws Throwable {
        throw new Error();
    }

    static {
        field_e = new kb();
        field_d = "To Customer Support";
        field_a = "Password is valid";
    }
}
