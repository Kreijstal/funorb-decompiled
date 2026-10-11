/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vga {
    static int field_b;
    private fh field_c;
    static int field_d;
    private fh field_a;

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = VoidHunters.field_G;
        if (param0 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param0) {
          return null;
        }
        if (param1 >= -108) {
          return (String) null;
        }
        if (param0 % 37L != 0L) {
          var3 = 0;
          var4 = param0;
          while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
          }
          var6 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = ks.field_q[(int)(var7 - 37L * param0)];
            if (var9 == 95) {
              var10 = -1 + var6.length();
              var9 = 160;
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return null;
    }

    final int c(int param0) {
        int var4 = VoidHunters.field_G;
        int var2 = param0;
        fh var3 = this.field_c.field_e;
        while (var3 != this.field_c) {
          var2++;
          var3 = var3.field_e;
        }
        return var2;
    }

    final static void a(int param0, byte param1, String param2, long param3, int param4, boolean param5) {
        dpa.field_p.h(24335, param4);
        dpa.field_p.field_e = dpa.field_p.field_e + 1;
        int var7_int = dpa.field_p.field_e;
        dpa.field_p.a(param3, 108);
        dpa.field_p.a(true, param2);
        if (param1 >= -94) {
          return;
        }
        try {
          dpa.field_p.c(0, param0);
          dpa.field_p.c(0, !param5 ? 0 : 1);
          dpa.field_p.e(-var7_int + dpa.field_p.field_e, -129);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vga.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final fh a(byte param0) {
        fh var2 = this.field_c.field_e;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_e;
        if (param0 == -54) {
          return var2;
        }
        this.a(77);
        return var2;
    }

    final void a(fh param0, byte param1) {
        if (param1 != -22) {
          return;
        }
        try {
          if (param0.field_d != null) {
            param0.d((byte) -35);
          }
          param0.field_e = this.field_c.field_e;
          param0.field_d = this.field_c;
          param0.field_d.field_e = param0;
          param0.field_e.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vga.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final fh b(int param0) {
        fh var2 = this.field_c.field_d;
        if (var2 == this.field_c) {
          return null;
        }
        if (param0 == 1) {
          var2.d((byte) -35);
          return var2;
        }
        this.a((byte) 3);
        var2.d((byte) -35);
        return var2;
    }

    final static int a(boolean param0) {
        if (param0) {
          return 1900 + new Date().getYear();
        }
        field_d = 59;
        return 1900 + new Date().getYear();
    }

    final fh a(int param0) {
        fh var2 = null;
        fh var2Lifetime1;
        if (param0 != 1900) {
          vga.a(-33L, 30);
          var2 = this.field_a;
          if (this.field_c == var2) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_e;
          return var2;
        }
        var2Lifetime1 = this.field_a;
        if (this.field_c == var2Lifetime1) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_e;
        return var2Lifetime1;
    }

    final fh b(byte param0) {
        fh var2 = this.field_c.field_e;
        if (this.field_c != var2) {
          var2.d((byte) -35);
          int var3 = 25 % ((param0 + 18) / 58);
          return var2;
        }
        return null;
    }

    final void a(fh param0, int param1) {
        if (param0.field_d != null) {
          param0.d((byte) -35);
        }
        if (param1 >= -64) {
          return;
        }
        try {
          param0.field_e = this.field_c;
          param0.field_d = this.field_c.field_d;
          param0.field_d.field_e = param0;
          param0.field_e.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vga.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public vga() {
        this.field_c = new fh();
        this.field_c.field_d = this.field_c;
        this.field_c.field_e = this.field_c;
    }

    static {
    }
}
