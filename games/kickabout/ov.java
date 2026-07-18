/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ov implements Iterator {
    static String field_a;
    private ht field_d;
    private gn field_g;
    static String field_c;
    private int field_f;
    static int field_b;
    private gn field_e;

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Kickabout.field_G;
        if (((ov) this).field_d.field_e[-1 + ((ov) this).field_f] == ((ov) this).field_e) {
          L0: while (true) {
            if (((ov) this).field_d.field_d > ((ov) this).field_f) {
              int fieldTemp$1 = ((ov) this).field_f;
              ((ov) this).field_f = ((ov) this).field_f + 1;
              if (((ov) this).field_d.field_e[fieldTemp$1].field_d != ((ov) this).field_d.field_e[-1 + ((ov) this).field_f]) {
                ((ov) this).field_e = ((ov) this).field_d.field_e[-1 + ((ov) this).field_f].field_d;
                return true;
              } else {
                ((ov) this).field_e = ((ov) this).field_d.field_e[((ov) this).field_f - 1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(tf param0, int param1) {
        Object var2 = null;
        gn var2_ref = null;
        RuntimeException var2_ref2 = null;
        gn var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: while (true) {
              if (jo.a(param0, false)) {
                break L0;
              } else {
                var2_ref = param0.g(24009);
                L2: while (true) {
                  if (!(var2_ref instanceof ak)) {
                    continue L1;
                  } else {
                    if (!(var2_ref.field_d instanceof ak)) {
                      continue L1;
                    } else {
                      L3: {
                        var3 = var2_ref.field_d;
                        if (((ak) (Object) var2_ref).a((byte) 120) < ((ak) (Object) var3).a((byte) -73)) {
                          var2_ref.c((byte) -109);
                          pa.a(var2_ref, var3, (byte) 127);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2_ref = var3;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref2;
            stackOut_11_1 = new StringBuilder().append("ov.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        int var3 = 31;
        var2.b(11, (byte) 120);
        var2.a(106, 1);
        var2.a(119, 0);
    }

    public final Object next() {
        gn var1 = null;
        int var2 = 0;
        var2 = Kickabout.field_G;
        if (((ov) this).field_d.field_e[((ov) this).field_f - 1] == ((ov) this).field_e) {
          L0: while (true) {
            if (((ov) this).field_d.field_d > ((ov) this).field_f) {
              int fieldTemp$2 = ((ov) this).field_f;
              ((ov) this).field_f = ((ov) this).field_f + 1;
              var1 = ((ov) this).field_d.field_e[fieldTemp$2].field_d;
              if (var1 == ((ov) this).field_d.field_e[((ov) this).field_f + -1]) {
                continue L0;
              } else {
                ((ov) this).field_e = var1.field_d;
                ((ov) this).field_g = var1;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((ov) this).field_e;
          ((ov) this).field_e = var1.field_d;
          ((ov) this).field_g = var1;
          return (Object) (Object) var1;
        }
    }

    public final void remove() {
        if (!(((ov) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((ov) this).field_g.c((byte) -109);
        ((ov) this).field_g = null;
    }

    private final void b(int param0) {
        ((ov) this).field_e = ((ov) this).field_d.field_e[0].field_d;
        ((ov) this).field_f = 1;
        ((ov) this).field_g = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (cc.field_e == 13) {
            hq.b((byte) 124);
            return true;
        }
        if (!(cc.field_e != 102)) {
            dr.field_g.a(5075);
            return true;
        }
        if (null == dr.field_g) {
            return false;
        }
        if (!dr.field_g.a(15, 13, (byte) -101)) {
            return false;
        }
        return true;
    }

    ov(ht param0) {
        ((ov) this).field_g = null;
        try {
            ((ov) this).field_d = param0;
            this.b(0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ov.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = 0;
        field_c = "Spend EXP";
    }
}
