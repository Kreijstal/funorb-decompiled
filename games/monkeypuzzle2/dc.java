/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc implements Iterable {
    ug[] field_f;
    private ug field_a;
    static int field_e;
    int field_d;
    static String field_b;
    static int field_c;

    final static lg a(int param0, String param1, String param2, ud param3, ad param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        lg stackIn_2_0 = null;
        lg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2570) {
            stackIn_2_0 = (lg) null;
            return stackIn_2_0;
          }
          var5_int = param4.c(param2, (byte) -105);
          var6 = param4.a(param1, var5_int, -28459);
          stackIn_4_0 = ei.a(param4, (byte) 115, param3, var6, var5_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("dc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wc(this));
    }

    final static void a(int param0) {
        nf.field_F = new bg();
        if (param0 == 0) {
          jh.field_C.c((byte) 121, nf.field_F);
          return;
        }
        ad var2 = (ad) null;
        dc.a(54, (String) null, (String) null, (ud) null, (ad) null);
        jh.field_C.c((byte) 121, nf.field_F);
    }

    private dc() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var5 = hb.field_l;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 == 114) {
            return;
          }
          field_c = -18;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "dc.E(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 < 16) {
          dc.a(24);
        }
    }

    final void a(long param0, boolean param1, ug param2) {
        ug var5 = null;
        try {
          if (!param1) {
            dc.a(27);
          }
          if (param2.field_c != null) {
            param2.c(-19822);
          }
          var5 = this.field_f[(int)(param0 & (long)(this.field_d - 1))];
          param2.field_c = var5.field_c;
          param2.field_d = var5;
          param2.field_c.field_d = param2;
          param2.field_d.field_c = param2;
          param2.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "dc.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ug a(byte param0, long param1) {
        ug var4;
        ug var5;
        int var6;
        ug var5Lifetime1;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = this.field_f[(int)((long)(-1 + this.field_d) & param1)];
        if (param0 <= -70) {
          this.field_a = var4.field_d;
          while (true) {
            if (this.field_a == var4) {
              this.field_a = null;
              return null;
            }
            if (~this.field_a.field_a != ~param1) {
              this.field_a = this.field_a.field_d;
              continue;
            }
            break;
          }
          var5 = this.field_a;
          this.field_a = this.field_a.field_d;
          return var5;
        }
        this.iterator();
        this.field_a = var4.field_d;
        while (true) {
          if (this.field_a == var4) {
            this.field_a = null;
            return null;
          }
          if (~this.field_a.field_a != ~param1) {
            this.field_a = this.field_a.field_d;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_a;
        this.field_a = this.field_a.field_d;
        return var5Lifetime1;
    }

    static {
        field_b = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_c = 0;
    }
}
