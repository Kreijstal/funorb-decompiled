/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Vector2f {
    float y;
    static int field_i;
    static Random field_c;
    static int field_e;
    static uf field_b;
    float x;
    static volatile int field_f;
    static int field_a;
    static String field_d;
    static int field_h;

    final Vector2f perpendicular(byte param0) {
        int var2 = -72 / ((param0 - 9) / 49);
        return new Vector2f(this.y, -this.x);
    }

    public static void clearSharedReferences(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -1) {
          field_h = 44;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final void subtract(Vector2f param0, int param1) {
        try {
          this.x = this.x - param0.x;
          this.y = this.y - param0.y;
          if (param1 != 1180) {
            this.x = 0.05897929519414902f;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "in.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final float dot(Vector2f param0, byte param1) {
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
          stackIn_3_0 = param0.y * this.y + param0.x * this.x;
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    Vector2f(float param0, float param1) {
        this.y = param1;
        this.x = param0;
    }

    final float cross(Vector2f param0, boolean param1) {
        RuntimeException var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.scale(-0.7947180271148682f, 38);
          }
          stackIn_3_0 = param0.y * this.x - this.y * param0.x;
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void normalize(int param0) {
        float var2 = 0.0f;
        float var2Lifetime1;
        if (param0 == -1) {
          var2 = (float)Math.sqrt((double)(this.x * this.x + this.y * this.y));
          this.x = this.x / var2;
          this.y = this.y / var2;
          return;
        }
        field_f = 38;
        var2Lifetime1 = (float)Math.sqrt((double)(this.x * this.x + this.y * this.y));
        this.x = this.x / var2Lifetime1;
        this.y = this.y / var2Lifetime1;
    }

    final void scale(float param0, int param1) {
        this.y = this.y * param0;
        if (param1 != -1) {
          return;
        }
        this.x = this.x * param0;
    }

    Vector2f(Point2i param0, Point2i param1) {
        try {
          this.y = (float)(param1.y - param0.y);
          this.x = (float)(-param0.x + param1.x);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    Vector2f(Vector2f param0) {
        try {
          this.y = param0.y;
          this.x = param0.x;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void setDirectionFromAngle(float param0, byte param1) {
        this.x = (float)Math.cos((double)param0);
        this.y = -(float)Math.sin((double)param0);
        if (param1 != -54) {
          field_a = 45;
        }
    }

    Vector2f(float param0) {
        this.setDirectionFromAngle(param0, (byte) -54);
    }

    static {
        field_f = -1;
        field_a = 0;
        field_c = new Random(42L);
        field_d = "Waiting for graphics";
    }
}
