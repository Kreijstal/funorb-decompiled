/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fl implements Iterator {
    static bi field_b;
    static int field_f;
    private oh field_c;
    private oh field_a;
    private rm field_g;
    static String field_e;
    private int field_d;
    static int field_h;

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != -1) {
          ln var2 = (ln) null;
          fl.a((ln) null, (byte) -77);
        }
    }

    public final void remove() {
        if (null == this.field_c) {
          throw new IllegalStateException();
        }
        this.field_c.b((byte) -90);
        this.field_c = null;
    }

    final static qr a(int param0) {
        int var1 = -56 % ((-22 - param0) / 48);
        return wg.field_a.field_Eb;
    }

    final static void a(ln param0, byte param1) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        mg var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        db var11 = null;
        mg var3Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == param0.field_s.c(-128)) {
            return;
          }
          if (param1 < 35) {
            var10 = (ln) null;
            fl.a((ln) null, (byte) -17);
          }
          var11 = new db();
          var11.a(param0.field_s.a(-123), 32);
          var3 = (mg) (param0.field_s.c(-128));
          while (var3 != null) {
            var4 = var3.field_y.field_A - var3.field_B.field_A;
            var5 = var3.field_y.field_S - var3.field_B.field_S;
            var6 = (mg) (var11.c(-127));
            while (var6 != null) {
              var7 = var6.field_y.field_A - var6.field_B.field_A;
              var8 = -var6.field_B.field_S + var6.field_y.field_S;
              if (!oo.a(var4, var5, var7, true, var8)) {
                var6 = (mg) (var11.b(32));
                continue;
              }
              el.a(var3, 0, var6);
              break;
            }
            if (var6 == null) {
              var11.a(var3, 32);
            }
            var3 = (mg) (param0.field_s.b(32));
          }
          var3Lifetime1 = (mg) (var11.c(-127));
          while (var3Lifetime1 != null) {
            param0.field_s.a(var3Lifetime1, 32);
            var3Lifetime1 = (mg) (var11.b(32));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("fl.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_g.field_f[-1 + this.field_d] != this.field_a) {
          return true;
        }
        while (true) {
          if (this.field_g.field_d <= this.field_d) {
            return false;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          if (this.field_g.field_f[fieldTemp$0].field_f == this.field_g.field_f[this.field_d - 1]) {
            this.field_a = this.field_g.field_f[-1 + this.field_d];
            continue;
          }
          break;
        }
        this.field_a = this.field_g.field_f[this.field_d - 1].field_f;
        return true;
    }

    final static void a(int param0, String param1) {
        try {
          aj.field_a.a((byte) -113, new de(param1));
          if (param0 != 0) {
            ln var3 = (ln) null;
            fl.a((ln) null, (byte) 103);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        oh var1;
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_g.field_f[-1 + this.field_d] != this.field_a) {
          var1 = this.field_a;
          this.field_a = var1.field_f;
          this.field_c = var1;
          return var1;
        }
        do {
          if (this.field_g.field_d <= this.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var1 = this.field_g.field_f[fieldTemp$0].field_f;
        } while (this.field_g.field_f[-1 + this.field_d] == var1);
        this.field_c = var1;
        this.field_a = var1.field_f;
        return var1;
    }

    fl(rm param0) {
        this.field_c = null;
        try {
          this.field_g = param0;
          this.c(-107);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        this.field_c = null;
        if (param0 > -77) {
          this.next();
        }
        this.field_d = 1;
        this.field_a = this.field_g.field_f[0].field_f;
    }

    static {
        field_f = 360;
        field_e = "Animations do not play automatically. Click to enable.";
    }
}
