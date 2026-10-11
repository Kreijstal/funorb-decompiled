/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tm implements Iterator {
    static String field_a;
    private jl field_c;
    private jl field_b;
    private lm field_d;
    static String field_e;

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var6_ref_byte__ = null;
        byte[] var7 = null;
        Object var8 = null;
        kg var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          var10 = new kg(param1);
          var3 = 94 % ((53 - param0) / 46);
          var4 = var10.c(32);
          var5 = var10.f((byte) 46);
          if (var5 >= 0 && (qk.field_a == 0 ||
            !(var5 > qk.field_a))) {
            if (var4 == 0) {
              var13 = new byte[var5];
              var11 = var13;
              var6_ref_byte__ = var11;
              var10.a(0, (byte) 122, var5, var13);
              stackIn_7_0 = var6_ref_byte__;
              return stackIn_7_0;
            }
            var6 = var10.f((byte) 51);
            if (var6 >= 0 && (qk.field_a == 0 ||
              !(qk.field_a < var6))) {
              var14 = new byte[var6];
              var12 = var14;
              var7 = var12;
              if (var4 != 1) {
                var8 = mc.field_d;
                synchronized (var8) {
                  mc.field_d.a(false, var14, var10);
                }
              } else {
                oa.a(var14, var6, param1, var5, 9);
              }
              stackIn_21_0 = var7;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("tm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final Object next() {
        Object var1 = this.field_c;
        if (var1 != this.field_d.field_b) {
          this.field_c = ((jl) (var1)).field_o;
        } else {
          this.field_c = null;
          var1 = null;
        }
        this.field_b = (jl) (var1);
        return var1;
    }

    final static al a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        al[] var3 = null;
        int var4 = 0;
        al var5 = null;
        int var6 = 0;
        al stackIn_3_0 = null;
        al stackIn_9_0 = null;
        al stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var2 = ml.a("jagex-last-login-method", (byte) 79, param0);
          if (var2 == null) {
            stackIn_3_0 = tk.field_f;
            return stackIn_3_0;
          }
          var3 = nn.b(68);
          var4 = 0;
          if (param1 > -3) {
            field_e = (String) null;
          }
          while (true) {
            if (var4 >= var3.length) {
              stackIn_12_0 = tk.field_f;
              return stackIn_12_0;
            }
            var5 = var3[var4];
            if (!var5.a(var2, -5851)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("tm.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void remove() {
        if (this.field_b == null) {
          throw new IllegalStateException();
        }
        this.field_b.b(true);
        this.field_b = null;
    }

    final static void a(int param0, int param1) {
        ue.field_t = param1 >> 4 & 3;
        g.field_m = (12 & param1) >> 2;
        if (param0 > -121) {
          field_e = (String) null;
        }
        if (!(ue.field_t <= 2)) {
          ue.field_t = 2;
        }
        if (2 < g.field_m) {
          g.field_m = 2;
        }
        wd.field_c = 3 & param1;
        if (!(wd.field_c <= 2)) {
          wd.field_c = 2;
        }
    }

    public final boolean hasNext() {
        return this.field_d.field_b != this.field_c;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -25 / ((param0 - 10) / 55);
        field_e = null;
    }

    tm(lm param0) {
        this.field_b = null;
        try {
          this.field_d = param0;
          this.field_b = null;
          this.field_c = this.field_d.field_b.field_o;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Press <%0> to fire homing missiles";
        field_a = "Try again";
    }
}
