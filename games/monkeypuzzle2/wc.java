/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wc implements Iterator {
    static String field_g;
    private ug field_i;
    private int field_c;
    static le[] field_e;
    static le field_h;
    static ad field_d;
    private dc field_b;
    static String field_a;
    private ug field_f;

    private final void a(boolean param0) {
        this.field_f = this.field_b.field_f[0].field_d;
        if (!param0) {
          return;
        } else {
          this.field_i = null;
          this.field_c = 1;
          return;
        }
    }

    public final void remove() {
        if (!(null != this.field_i)) {
            throw new IllegalStateException();
        }
        this.field_i.c(-19822);
        this.field_i = null;
    }

    final static aj a(byte param0) {
        String var1 = null;
        L0: {
          var1 = lb.d((byte) -56);
          if (var1 == null) {
            break L0;
          } else {
            if (0 > var1.indexOf('@')) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 <= 90) {
          field_g = (String) null;
          return new aj(lb.d((byte) -56), uk.f(20));
        } else {
          return new aj(lb.d((byte) -56), uk.f(20));
        }
    }

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              hf.field_b = param0;
              qh.a(12, true);
              if (!param1) {
                break L1;
              } else {
                field_e = (le[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wc.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_g = null;
        if (param0 != 67) {
            return;
        }
        field_a = null;
        field_h = null;
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_b.field_f[-1 + this.field_c] == this.field_f) {
          L0: while (true) {
            if (this.field_c < this.field_b.field_d) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              if (this.field_b.field_f[fieldTemp$1].field_d == this.field_b.field_f[-1 + this.field_c]) {
                this.field_f = this.field_b.field_f[-1 + this.field_c];
                if (var2 == 0) {
                  continue L0;
                } else {
                  return false;
                }
              } else {
                this.field_f = this.field_b.field_f[-1 + this.field_c].field_d;
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

    public final Object next() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        ug var3 = null;
        ug var4 = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_f == this.field_b.field_f[this.field_c + -1]) {
          L0: while (true) {
            if (this.field_c < this.field_b.field_d) {
              fieldTemp$1 = this.field_c;
              this.field_c = this.field_c + 1;
              var3 = this.field_b.field_f[fieldTemp$1].field_d;
              if (var3 == this.field_b.field_f[-1 + this.field_c]) {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                this.field_f = var3.field_d;
                this.field_i = var3;
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_f;
          this.field_i = var4;
          this.field_f = var4.field_d;
          return var4;
        }
    }

    final static void a(int param0) {
        aj discarded$6 = null;
        aj discarded$7 = null;
        aj discarded$8 = null;
        if (224 <= re.field_e) {
          qb.a(256, 256);
          if (param0 == -17076) {
            return;
          } else {
            discarded$6 = wc.a((byte) -100);
            return;
          }
        } else {
          qb.a(param0 + 17332, re.field_e + 32);
          if (!MonkeyPuzzle2.field_F) {
            if (param0 == -17076) {
              return;
            } else {
              discarded$7 = wc.a((byte) -100);
              return;
            }
          } else {
            qb.a(256, 256);
            if (param0 == -17076) {
              return;
            } else {
              discarded$8 = wc.a((byte) -100);
              return;
            }
          }
        }
    }

    wc(dc param0) {
        this.field_i = null;
        try {
            this.field_b = param0;
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Reload game";
        field_a = "Waiting for music";
    }
}
