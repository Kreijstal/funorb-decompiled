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
            ((tka) this).a(-2, -15, 5);
        }
    }

    final boolean b(int param0) {
        if (param0 >= 21) {
          if (((tka) this).field_f != 60) {
            int fieldTemp$4 = ((tka) this).field_f - 1;
            ((tka) this).field_f = ((tka) this).field_f - 1;
            if (fieldTemp$4 < 0) {
              ((tka) this).field_e.field_h.b((byte) 68, 36, ((tka) this).field_d, ((tka) this).field_c);
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            jja.a(192, -1, 25);
            int fieldTemp$5 = ((tka) this).field_f - 1;
            ((tka) this).field_f = ((tka) this).field_f - 1;
            if (fieldTemp$5 < 0) {
              ((tka) this).field_e.field_h.b((byte) 68, 36, ((tka) this).field_d, ((tka) this).field_c);
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          }
        } else {
          ((tka) this).a(-95, false, 52);
          if (((tka) this).field_f == 60) {
            jja.a(192, -1, 25);
            int fieldTemp$6 = ((tka) this).field_f - 1;
            ((tka) this).field_f = ((tka) this).field_f - 1;
            if (fieldTemp$6 < 0) {
              ((tka) this).field_e.field_h.b((byte) 68, 36, ((tka) this).field_d, ((tka) this).field_c);
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            int fieldTemp$7 = ((tka) this).field_f - 1;
            ((tka) this).field_f = ((tka) this).field_f - 1;
            if (fieldTemp$7 < 0) {
              ((tka) this).field_e.field_h.b((byte) 68, 36, ((tka) this).field_d, ((tka) this).field_c);
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
          ((tka) this).a(-106, -128, -74);
          var4 = ((655360 * (-((tka) this).field_f + 80) >> 16) + 400) * ((tka) this).field_f / 80;
          var8 = pfa.field_g;
          var6 = -(((tka) this).field_g * ((tka) this).field_f / 80) + param2;
          var7 = param0 - var4 + -(((tka) this).field_f * ((tka) this).field_h / 80);
          var8.a(var6, var7 + -64);
          return;
        } else {
          var4 = ((655360 * (-((tka) this).field_f + 80) >> 16) + 400) * ((tka) this).field_f / 80;
          var9 = pfa.field_g;
          var6 = -(((tka) this).field_g * ((tka) this).field_f / 80) + param2;
          var7 = param0 - var4 + -(((tka) this).field_f * ((tka) this).field_h / 80);
          var9.a(var6, var7 + -64);
          return;
        }
    }

    tka(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            ((tka) this).field_f = 80;
            ((tka) this).field_g = kla.a(129, m.field_a, -2147483648) - 64;
            ((tka) this).field_h = kla.a(65, m.field_a, -2147483648) - 32;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
