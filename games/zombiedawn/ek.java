/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ek extends fb {
    private int field_F;
    private int field_N;
    boolean field_G;
    static nk field_E;
    private int field_K;
    private int field_L;
    private int field_H;
    int field_M;
    private int field_D;
    static int field_I;
    static int field_J;

    final void j(int param0) {
        this.b(-27598);
        this.c((byte) -56);
        td.field_c.a((le) (this), 87);
        if (param0 != -18475) {
          ek.i(112);
        }
    }

    private final void f(byte param0) {
        this.field_H = pb.a(so.field_a, 127, 1) + 128;
        if (param0 == -8) {
          this.field_F = 0;
          this.field_y = this.field_N - (-pb.a(so.field_a, 24, param0 ^ -7) + 12) << 16;
          this.field_x = this.field_L - 12 + pb.a(so.field_a, 24, 1) << 16;
          return;
        }
        wk var3 = (wk) null;
        this.a((byte) 119, (wk) null);
        this.field_F = 0;
        this.field_y = this.field_N - (-pb.a(so.field_a, 24, param0 ^ -7) + 12) << 16;
        this.field_x = this.field_L - 12 + pb.a(so.field_a, 24, 1) << 16;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        this.field_L = param0;
        this.field_G = false;
        this.field_N = param1;
        if (param3 == 2011722288) {
          this.field_y = param1 << 16;
          this.field_x = param0 << 16;
          this.field_M = 0;
          this.f((byte) -8);
          var5 = bg.field_o.length;
          this.field_D = pb.a(so.field_a, 10, 1);
          this.field_K = pb.a(so.field_a, param2, 1);
          this.field_F = pb.a(so.field_a, var5, 1);
          return;
        }
    }

    final void a(byte param0, wk param1) {
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_G) {
            fieldTemp$2 = this.field_K - 1;
            this.field_K = this.field_K - 1;
            if (fieldTemp$2 <= 0) {
              if (param0 >= -76) {
                this.j(-76);
              }
              var3_int = param1.a(this.a(true), (byte) -59);
              var4 = param1.a(this.f(237239984), 0) - 24;
              if (!km.a(21405, var3_int, param1, var4)) {
                return;
              }
              if (!ng.field_e &&
                dj.field_e.field_H.field_b[this.f(237239984) / 24][this.a(true) / 24]) {
                return;
              }
              bg.field_o[this.field_F].e(var3_int, var4, this.field_H);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("ek.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
          return;
        }
        field_E = null;
    }

    final void g(int param0) {
        int fieldTemp$0 = this.field_D + 1;
        this.field_D = this.field_D + 1;
        if (fieldTemp$0 < 4) {
          if (param0 < 95) {
            this.a(-13, -95, -104, 35);
            return;
          }
          return;
        }
        this.field_D = 0;
        int fieldTemp$1 = this.field_F + 1;
        this.field_F = this.field_F + 1;
        if (fieldTemp$1 >= bg.field_o.length) {
          if (this.field_M != 1) {
            this.f((byte) -8);
            if (param0 < 95) {
              this.a(-13, -95, -104, 35);
              return;
            }
            return;
          }
          this.field_G = true;
          if (param0 >= 95) {
            return;
          }
          this.a(-13, -95, -104, 35);
          return;
        }
        if (param0 >= 95) {
          return;
        }
        this.a(-13, -95, -104, 35);
    }

    ek() {
        super(0, 0, 0);
        this.field_D = 0;
    }

    static {
        field_E = new nk(0);
        field_J = 5;
    }
}
