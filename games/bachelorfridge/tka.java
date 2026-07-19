/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tka extends kj {
    private int field_f;
    private int field_h;
    private int field_g;

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.a(-2, -15, 5);
        }
    }

    final boolean b(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param0 >= 21) {
          if (-61 != (this.field_f ^ -1)) {
            fieldTemp$4 = this.field_f - 1;
            this.field_f = this.field_f - 1;
            if ((fieldTemp$4 ^ -1) > -1) {
              this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            jja.a(192, -1, 25);
            fieldTemp$5 = this.field_f - 1;
            this.field_f = this.field_f - 1;
            if ((fieldTemp$5 ^ -1) > -1) {
              this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          }
        } else {
          this.a(-95, false, 52);
          if (-61 == (this.field_f ^ -1)) {
            jja.a(192, -1, 25);
            fieldTemp$6 = this.field_f - 1;
            this.field_f = this.field_f - 1;
            if ((fieldTemp$6 ^ -1) > -1) {
              this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            fieldTemp$7 = this.field_f - 1;
            this.field_f = this.field_f - 1;
            if ((fieldTemp$7 ^ -1) > -1) {
              this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        ee var8 = null;
        ee var9 = null;
        if (param1 != 0) {
          this.a(-106, -128, -74);
          var4 = ((655360 * (-this.field_f + 80) >> 377409296) + 400) * this.field_f / 80;
          var8 = pfa.field_g;
          var6 = -(this.field_g * this.field_f / 80) + param2;
          var7 = param0 - var4 + -(this.field_f * this.field_h / 80);
          var8.a(var6, var7 + -64);
          return;
        } else {
          var4 = ((655360 * (-this.field_f + 80) >> 377409296) + 400) * this.field_f / 80;
          var9 = pfa.field_g;
          var6 = -(this.field_g * this.field_f / 80) + param2;
          var7 = param0 - var4 + -(this.field_f * this.field_h / 80);
          var9.a(var6, var7 + -64);
          return;
        }
    }

    tka(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            this.field_f = 80;
            this.field_g = kla.a(129, m.field_a, -2147483648) - 64;
            this.field_h = kla.a(65, m.field_a, -2147483648) - 32;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "tka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
