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
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = Kickabout.field_G;
        if (this.field_d.field_e[-1 + this.field_f] == this.field_e) {
          L0: while (true) {
            if (this.field_d.field_d > this.field_f) {
              fieldTemp$1 = this.field_f;
              this.field_f = this.field_f + 1;
              if (this.field_d.field_e[fieldTemp$1].field_d != this.field_d.field_e[-1 + this.field_f]) {
                this.field_e = this.field_d.field_e[-1 + this.field_f].field_d;
                return true;
              } else {
                this.field_e = this.field_d.field_e[this.field_f - 1];
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_b = -112;
                break L1;
              }
            }
            L2: while (true) {
              if (jo.a(param0, false)) {
                break L0;
              } else {
                var2_ref = param0.g(24009);
                L3: while (true) {
                  if (!(var2_ref instanceof ak)) {
                    continue L2;
                  } else {
                    if (!(var2_ref.field_d instanceof ak)) {
                      continue L2;
                    } else {
                      L4: {
                        var3 = var2_ref.field_d;
                        if (((ak) ((Object) var2_ref)).a((byte) 120) < ((ak) ((Object) var3)).a((byte) -73)) {
                          var2_ref.c((byte) -109);
                          pa.a(var2_ref, var3, (byte) 127);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var2_ref = var3;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2_ref2);
            stackOut_12_1 = new StringBuilder().append("ov.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        if (param0 != 1) {
            discarded$0 = ov.a(-70, -86, -1);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        int var3 = -31 / ((param0 - 40) / 56);
        var2.b(param1, (byte) 120);
        var2.a(106, 1);
        var2.a(119, 0);
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        gn var1 = null;
        int var2 = 0;
        var2 = Kickabout.field_G;
        if (this.field_d.field_e[this.field_f - 1] == this.field_e) {
          L0: while (true) {
            if (this.field_d.field_d > this.field_f) {
              fieldTemp$2 = this.field_f;
              this.field_f = this.field_f + 1;
              var1 = this.field_d.field_e[fieldTemp$2].field_d;
              if (var1 == this.field_d.field_e[this.field_f + -1]) {
                continue L0;
              } else {
                this.field_e = var1.field_d;
                this.field_g = var1;
                return var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_e;
          this.field_e = var1.field_d;
          this.field_g = var1;
          return var1;
        }
    }

    public final void remove() {
        if (!(this.field_g != null)) {
            throw new IllegalStateException();
        }
        this.field_g.c((byte) -109);
        this.field_g = null;
    }

    private final void b(int param0) {
        this.field_e = this.field_d.field_e[param0].field_d;
        this.field_f = 1;
        this.field_g = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if ((cc.field_e ^ -1) != param1) {
          if (-103 == (cc.field_e ^ -1)) {
            dr.field_g.a(5075);
            return true;
          } else {
            if (null != dr.field_g) {
              if (!dr.field_g.a(param0, param2, (byte) -101)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          hq.b((byte) 124);
          return true;
        }
    }

    ov(ht param0) {
        this.field_g = null;
        try {
            this.field_d = param0;
            this.b(0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ov.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = 0;
        field_c = "Spend EXP";
    }
}
