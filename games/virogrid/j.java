/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j implements Iterator {
    static float field_i;
    private l field_f;
    static int field_e;
    private l field_d;
    static boolean field_g;
    private int field_c;
    static mg[] field_k;
    static e field_h;
    static int field_l;
    static int field_b;
    static String field_a;
    private gk field_j;

    public static void b(int param0) {
        field_k = null;
        int var1 = 97 % ((-32 - param0) / 44);
        field_a = null;
        field_h = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Virogrid.field_F ? 1 : 0;
        if (this.field_j.field_h[this.field_c - 1] != this.field_d) {
          return true;
        }
        while (true) {
          if (this.field_c >= this.field_j.field_a) {
            return false;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          if (this.field_j.field_h[fieldTemp$0].field_f == this.field_j.field_h[-1 + this.field_c]) {
            this.field_d = this.field_j.field_h[-1 + this.field_c];
            continue;
          }
          break;
        }
        this.field_d = this.field_j.field_h[this.field_c - 1].field_f;
        return true;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        l var3;
        l var4;
        var2 = Virogrid.field_F ? 1 : 0;
        if (this.field_d != this.field_j.field_h[-1 + this.field_c]) {
          var4 = this.field_d;
          this.field_d = var4.field_f;
          this.field_f = var4;
          return var4;
        }
        do {
          if (this.field_c >= this.field_j.field_a) {
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var3 = this.field_j.field_h[fieldTemp$0].field_f;
        } while (var3 == this.field_j.field_h[this.field_c - 1]);
        this.field_d = var3.field_f;
        this.field_f = var3;
        return var3;
    }

    final static gh a(int param0, String param1) {
        String var2 = null;
        gh var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        gh stackIn_13_0 = null;
        gh stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          if (null == oa.field_h) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_7_0 = null;
            return (gh) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = c.a(var6, true);
          if (var2 == null) {
            return null;
          }
          if (param0 != 0) {
            stackIn_13_0 = (gh) null;
            return stackIn_13_0;
          }
          var3 = (gh) (oa.field_h.a((long)var2.hashCode(), (byte) 82));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_Hb);
            var4 = c.a(var7, true);
            if (!var4.equals(var2)) {
              var3 = (gh) (oa.field_h.c(48));
              continue;
            }
            break;
          }
          stackIn_19_0 = var3;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("j.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        if (param0) {
          return;
        }
        this.field_d = this.field_j.field_h[0].field_f;
        this.field_c = 1;
        this.field_f = null;
    }

    final static void a(boolean param0, int param1) {
        vc.a(false, param0, -16113);
        if (param1 <= -124) {
          return;
        }
        j.a(true, 95);
    }

    final static hh a(String param0, int param1) {
        hh stackIn_4_0 = null;
        hh stackIn_7_0 = null;
        hh stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        hh stackIn_25_0 = null;
        hh stackIn_39_0 = null;
        hh stackIn_43_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = a.field_H;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = cb.field_a;
            return stackIn_7_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_13_0 = jj.field_f;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 != 92) {
                if (34 == var5 &&
                  var3 == 0) {
                  stackIn_25_0 = jj.field_f;
                  return stackIn_25_0;
                }
                var3 = 0;
              } else {
                stackIn_21_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_21_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = param1; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_39_0 = jj.field_f;
                return stackIn_39_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (nf.field_b.indexOf(var5Lifetime1) == -1) {
                stackIn_43_0 = jj.field_f;
                return stackIn_43_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_50_0 = var2;
          stackIn_50_1 = new StringBuilder().append("j.F(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void remove() {
        if (null == this.field_f) {
          throw new IllegalStateException();
        }
        this.field_f.a(false);
        this.field_f = null;
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
          j.a(true, -78);
          if (dj.field_n < 20) {
            return true;
          }
          if (!me.b(9)) {
            return true;
          }
          if (mf.field_h <= 0) {
            return false;
          }
          if (!md.a(11265)) {
            return true;
          }
          return false;
        }
        if (dj.field_n < 20) {
          return true;
        }
        if (!me.b(9)) {
          return true;
        }
        if (mf.field_h <= 0) {
          return false;
        }
        if (!md.a(11265)) {
          return true;
        }
        return false;
    }

    j(gk param0) {
        this.field_f = null;
        try {
          this.field_j = param0;
          this.a(false);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "j.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        field_a = "Rankings";
    }
}
