/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bn extends kj {
    private eaa field_g;
    static ee field_h;
    private int field_f;
    static ee field_i;

    public static void c(int param0) {
        field_i = null;
        field_h = null;
        if (param0 <= 93) {
          field_i = (ee) null;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          field_h = (ee) null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        java.awt.Canvas var5 = null;
        var4 = BachelorFridge.field_y;
        try {
          if (lk.field_r >= 10) {
            if (!ad.d((byte) 27)) {
              dg.d();
              rha.a(240, false, 320);
              av.a(0, -83, param1, 0);
            } else {
              if (0 == jv.field_j) {
                rda.a(0, param2, false);
                av.a(0, -76, param1, 0);
              } else {
                jq.a(param1, -128);
              }
            }
          } else {
            var3_int = 0;
            if (nf.field_K) {
              nf.field_K = false;
              var3_int = 1;
            }
            lha.a(kla.f(param0 - 10284), dea.field_o, wea.b(false), var3_int != 0, 3);
          }
          if (param0 != 0) {
            var5 = (java.awt.Canvas) null;
            bn.a(-46, (java.awt.Canvas) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    bn(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
          this.field_f = 128;
          this.field_g = new eaa();
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          this.a(34, true, 68);
        }
        rea.a(this.field_g, 65280, param2, (byte) 118, 10, param0);
    }

    final static kv a(vr param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        kv stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!g.a(param3, param2, -30744, param0)) {
            stackIn_2_0 = null;
            return (kv) (stackIn_2_0);
          }
          var4_int = -101 / ((-66 - param1) / 41);
          stackIn_4_0 = nja.a(true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("bn.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rea var9;
        int var10;
        java.awt.Canvas var11;
        var10 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        if (fieldTemp$0 == 0) {
          return true;
        }
        if (127 >= this.field_f &&
          64 <= this.field_f) {
          for (var2 = 0; var2 < 1; var2++) {
            var3 = this.field_f;
            var3 += 16;
            var4 = kla.a(96, this.field_e.field_h.field_w, -2147483648);
            var5 = kla.a(48, this.field_e.field_h.field_w, -2147483648);
            kla.a(50, this.field_e.field_h.field_w, -2147483648);
            var6 = 128 + var4;
            var7 = 64 + var5;
            var8 = (int)(Math.sin((double)var3 * 300.0) * 100.0) * 0;
            var9 = new rea(var6, var8, var7, kla.a(3, this.field_e.field_h.field_w, -2147483648));
            kla.a(3, this.field_e.field_h.field_w, -2147483648);
            kla.a(5000, this.field_e.field_h.field_w, -2147483648);
            var9.field_o = (double)(-kla.a(2, this.field_e.field_h.field_w, -2147483648) - 1);
            var9.field_n = 64;
            var9.field_h = -1;
            this.field_g.a(var9, true);
          }
        }
        dha.a(this.field_g, this.field_f, this.field_e.field_h.field_w, 75);
        if (param0 < 21) {
          var11 = (java.awt.Canvas) null;
          bn.a(101, (java.awt.Canvas) null, false);
        }
        return false;
    }

    static {
    }
}
