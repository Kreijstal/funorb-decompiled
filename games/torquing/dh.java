/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh implements Iterator {
    static String field_d;
    static String[] field_a;
    private int field_c;
    private q field_f;
    private vl field_e;
    private q field_b;

    public static void a(boolean param0) {
        if (!param0) {
          field_d = (String) null;
          field_a = null;
          field_d = null;
          return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(String param0, int param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Torquing.field_u;
        try {
          if (nd.field_a == -1 &&
            ad.field_n == -1) {
            ad.field_n = k.field_e;
            nd.field_a = n.field_t;
          }
          boolean decompiledFrameRemainder0 = true;
          lp.field_b = lp.field_b + 1;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(wb.field_t));
          } else {
            decompiledFrameRemainder0 = (wb.field_t == null);
          }
          if (decompiledFrameRemainder0) {
            if (!jd.field_E) {
              if (lp.field_b >= um.field_l) {
                stackIn_16_0 = (lp.field_b < uf.field_g + um.field_l) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param0 == null) {
              lp.field_b = 0;
            } else {
              if (jd.field_E) {
                lp.field_b = um.field_l;
              } else {
                if (var2_int != 0) {
                  lp.field_b = um.field_l;
                } else {
                  lp.field_b = 0;
                }
              }
            }
            ha.field_a = nd.field_a;
            ll.field_i = ad.field_n;
            if (param0 == null) {
              if (var2_int != 0) {
                jd.field_E = true;
              }
            } else {
              jd.field_E = false;
            }
          }
          wb.field_t = param0;
          if (!jd.field_E &&
            um.field_l > lp.field_b &&
            he.field_a) {
            ll.field_i = ad.field_n;
            lp.field_b = 0;
            ha.field_a = nd.field_a;
          }
          if (jd.field_E &&
            fj.field_m == lp.field_b) {
            jd.field_E = false;
            lp.field_b = 0;
          }
          nd.field_a = param1;
          ad.field_n = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("dh.C(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        q var1;
        int var2;
        var2 = Torquing.field_u;
        if (this.field_b != this.field_e.field_a[-1 + this.field_c]) {
          var1 = this.field_b;
          this.field_b = var1.field_e;
          this.field_f = var1;
          return var1;
        }
        do {
          if (this.field_c >= this.field_e.field_e) {
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var1 = this.field_e.field_a[fieldTemp$0].field_e;
        } while (this.field_e.field_a[-1 + this.field_c] == var1);
        this.field_b = var1.field_e;
        this.field_f = var1;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Torquing.field_u;
        if (this.field_e.field_a[-1 + this.field_c] != this.field_b) {
          return true;
        }
        while (true) {
          if (this.field_c >= this.field_e.field_e) {
            return false;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          if (this.field_e.field_a[fieldTemp$0].field_e == this.field_e.field_a[this.field_c - 1]) {
            this.field_b = this.field_e.field_a[-1 + this.field_c];
            continue;
          }
          break;
        }
        this.field_b = this.field_e.field_a[this.field_c - 1].field_e;
        return true;
    }

    public final void remove() {
        if (this.field_f == null) {
          throw new IllegalStateException();
        }
        this.field_f.f(0);
        this.field_f = null;
    }

    private final void a(int param0) {
        this.field_b = this.field_e.field_a[param0].field_e;
        this.field_c = 1;
        this.field_f = null;
    }

    dh(vl param0) {
        this.field_f = null;
        try {
          this.field_e = param0;
          this.a(0);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "OK";
    }
}
