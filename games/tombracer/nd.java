/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nd implements Iterator {
    private int field_b;
    private vg field_d;
    private vg field_a;
    private sk field_c;

    final static boolean b(byte param0) {
        if (param0 > -88) {
            return true;
        }
        return !gva.field_b.b(52) ? true : false;
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (this.field_c.field_e[-1 + this.field_b] == this.field_a) {
          L0: while (true) {
            if (this.field_c.field_g > this.field_b) {
              fieldTemp$1 = this.field_b;
              this.field_b = this.field_b + 1;
              if (this.field_c.field_e[fieldTemp$1].field_a == this.field_c.field_e[this.field_b - 1]) {
                this.field_a = this.field_c.field_e[-1 + this.field_b];
                if (var2 == 0) {
                  continue L0;
                } else {
                  return false;
                }
              } else {
                this.field_a = this.field_c.field_e[-1 + this.field_b].field_a;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(boolean param0) {
        this.field_d = null;
        if (!param0) {
          this.field_b = -88;
          this.field_a = this.field_c.field_e[0].field_a;
          this.field_b = 1;
          return;
        } else {
          this.field_a = this.field_c.field_e[0].field_a;
          this.field_b = 1;
          return;
        }
    }

    final static void a(byte param0) {
        if (param0 != 55) {
            nd.a((byte) -67);
            gt.a((byte) 46);
            return;
        }
        gt.a((byte) 46);
    }

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            if (param1 == -1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("nd.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void remove() {
        if (!(this.field_d != null)) {
            throw new IllegalStateException();
        }
        this.field_d.p(105);
        this.field_d = null;
    }

    final static void a(int param0, boolean param1) {
        qha.a(0, param1);
        jo.a(true, param1);
        if (param0 != -1) {
            return;
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        vg var3 = null;
        vg var4 = null;
        var2 = TombRacer.field_G ? 1 : 0;
        if (this.field_a == this.field_c.field_e[this.field_b - 1]) {
          L0: while (true) {
            if (this.field_b < this.field_c.field_g) {
              fieldTemp$1 = this.field_b;
              this.field_b = this.field_b + 1;
              var3 = this.field_c.field_e[fieldTemp$1].field_a;
              if (var3 != this.field_c.field_e[-1 + this.field_b]) {
                this.field_a = var3.field_a;
                this.field_d = var3;
                return var3;
              } else {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_a;
          this.field_d = var4;
          this.field_a = var4.field_a;
          return var4;
        }
    }

    nd(sk param0) {
        this.field_d = null;
        try {
            this.field_c = param0;
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
