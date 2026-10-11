/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class in {
    float field_g;
    static int field_i;
    static Random field_c;
    static int field_e;
    static uf field_b;
    float field_j;
    static volatile int field_f;
    static int field_a;
    static String field_d;
    static int field_h;

    final in a(byte param0) {
        int var2 = -72 / ((param0 - 9) / 49);
        return new in(this.field_g, -this.field_j);
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -1) {
          field_h = 44;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void a(in param0, int param1) {
        try {
          this.field_j = this.field_j - param0.field_j;
          this.field_g = this.field_g - param0.field_g;
          if (param1 != 1180) {
            this.field_j = 0.05897929519414902f;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "in.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final float a(in param0, byte param1) {
        RuntimeException var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -10) {
            field_f = -46;
          }
          stackIn_3_0 = param0.field_g * this.field_g + param0.field_j * this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("in.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    in(float param0, float param1) {
        this.field_g = param1;
        this.field_j = param0;
    }

    final float a(in param0, boolean param1) {
        RuntimeException var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.a(-0.7947180271148682f, 38);
          }
          stackIn_3_0 = param0.field_g * this.field_j - this.field_g * param0.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("in.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        float var2 = 0.0f;
        float var2Lifetime1;
        if (param0 == -1) {
          var2 = (float)Math.sqrt((double)(this.field_j * this.field_j + this.field_g * this.field_g));
          this.field_j = this.field_j / var2;
          this.field_g = this.field_g / var2;
          return;
        }
        field_f = 38;
        var2Lifetime1 = (float)Math.sqrt((double)(this.field_j * this.field_j + this.field_g * this.field_g));
        this.field_j = this.field_j / var2Lifetime1;
        this.field_g = this.field_g / var2Lifetime1;
    }

    final void a(float param0, int param1) {
        this.field_g = this.field_g * param0;
        if (param1 != -1) {
          return;
        }
        this.field_j = this.field_j * param0;
    }

    in(qm param0, qm param1) {
        try {
          this.field_g = (float)(param1.field_f - param0.field_f);
          this.field_j = (float)(-param0.field_h + param1.field_h);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    in(in param0) {
        try {
          this.field_g = param0.field_g;
          this.field_j = param0.field_j;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(float param0, byte param1) {
        this.field_j = (float)Math.cos((double)param0);
        this.field_g = -(float)Math.sin((double)param0);
        if (param1 != -54) {
          field_a = 45;
        }
    }

    in(float param0) {
        this.a(param0, (byte) -54);
    }

    static {
        field_f = -1;
        field_a = 0;
        field_c = new Random(42L);
        field_d = "Waiting for graphics";
    }
}
