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
        return new in(((in) this).field_g, -((in) this).field_j);
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
        ((in) this).field_j = ((in) this).field_j - param0.field_j;
        ((in) this).field_g = ((in) this).field_g - param0.field_g;
        if (param1 != 1180) {
            ((in) this).field_j = 0.05897929519414902f;
        }
    }

    final float a(in param0, byte param1) {
        if (param1 != -10) {
          field_f = -46;
          return param0.field_g * ((in) this).field_g + param0.field_j * ((in) this).field_j;
        } else {
          return param0.field_g * ((in) this).field_g + param0.field_j * ((in) this).field_j;
        }
    }

    in(float param0, float param1) {
        ((in) this).field_g = param1;
        ((in) this).field_j = param0;
    }

    final float a(in param0, boolean param1) {
        if (!param1) {
          ((in) this).a(-0.7947180271148682f, 38);
          return param0.field_g * ((in) this).field_j - ((in) this).field_g * param0.field_j;
        } else {
          return param0.field_g * ((in) this).field_j - ((in) this).field_g * param0.field_j;
        }
    }

    final void a(int param0) {
        float var2 = 0.0f;
        if (param0 != -1) {
          field_f = 38;
          var2 = (float)Math.sqrt((double)(((in) this).field_j * ((in) this).field_j + ((in) this).field_g * ((in) this).field_g));
          ((in) this).field_j = ((in) this).field_j / var2;
          ((in) this).field_g = ((in) this).field_g / var2;
          return;
        } else {
          var2 = (float)Math.sqrt((double)(((in) this).field_j * ((in) this).field_j + ((in) this).field_g * ((in) this).field_g));
          ((in) this).field_j = ((in) this).field_j / var2;
          ((in) this).field_g = ((in) this).field_g / var2;
          return;
        }
    }

    final void a(float param0, int param1) {
        ((in) this).field_g = ((in) this).field_g * param0;
        if (param1 != -1) {
            return;
        }
        ((in) this).field_j = ((in) this).field_j * param0;
    }

    in(qm param0, qm param1) {
        ((in) this).field_g = (float)(param1.field_f + -param0.field_f);
        ((in) this).field_j = (float)(-param0.field_h + param1.field_h);
    }

    in(in param0) {
        ((in) this).field_g = param0.field_g;
        ((in) this).field_j = param0.field_j;
    }

    final void a(float param0, byte param1) {
        ((in) this).field_j = (float)Math.cos((double)param0);
        ((in) this).field_g = -(float)Math.sin((double)param0);
        if (param1 != -54) {
            field_a = 45;
        }
    }

    in(float param0) {
        ((in) this).a(param0, (byte) -54);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_a = 0;
        field_c = new Random(42L);
        field_d = "Waiting for graphics";
    }
}
