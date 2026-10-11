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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (param0 < 21) {
          this.a(-95, false, 52);
          if (this.field_f != 60) {
            fieldTemp$0 = this.field_f - 1;
            this.field_f = this.field_f - 1;
            if (fieldTemp$0 >= 0) {
              return false;
            }
            this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
            jja.a(64, -1, 24);
            return true;
          }
          jja.a(192, -1, 25);
          fieldTemp$1 = this.field_f - 1;
          this.field_f = this.field_f - 1;
          if (fieldTemp$1 >= 0) {
            return false;
          }
          this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
          jja.a(64, -1, 24);
          return true;
        }
        if (this.field_f == 60) {
          jja.a(192, -1, 25);
          fieldTemp$2 = this.field_f - 1;
          this.field_f = this.field_f - 1;
          if (fieldTemp$2 >= 0) {
            return false;
          }
          this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
          jja.a(64, -1, 24);
          return true;
        }
        int fieldTemp$3 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        if (fieldTemp$3 >= 0) {
          return false;
        }
        this.field_e.field_h.b((byte) 68, 36, this.field_d, this.field_c);
        jja.a(64, -1, 24);
        return true;
    }

    final void a(int param0, int param1, int param2) {
        ee var9 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param1 == 0) {
          var4 = ((655360 * (-this.field_f + 80) >> 16) + 400) * this.field_f / 80;
          var9 = pfa.field_g;
          var6 = -(this.field_g * this.field_f / 80) + param2;
          var7 = param0 - var4 - this.field_f * this.field_h / 80;
          var9.a(var6, var7 - 64);
          return;
        }
        this.a(-106, -128, -74);
        var4Lifetime1 = ((655360 * (-this.field_f + 80) >> 16) + 400) * this.field_f / 80;
        ee var8 = pfa.field_g;
        var6Lifetime1 = -(this.field_g * this.field_f / 80) + param2;
        var7Lifetime1 = param0 - var4Lifetime1 - this.field_f * this.field_h / 80;
        var8.a(var6Lifetime1, var7Lifetime1 - 64);
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
