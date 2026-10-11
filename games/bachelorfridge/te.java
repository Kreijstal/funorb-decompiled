/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class te extends kj {
    private int field_i;
    private int field_g;
    static String field_f;
    private int field_h;

    final static void c(byte param0) {
        try {
          int var1_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var1 = null;
          RuntimeException var1_ref = null;
          IOException var2 = null;
          int var3 = 0;
          var3 = BachelorFridge.field_y;
          try {
            if (aka.field_G != null) {
              aka.field_G.c(20);
            }
            if (param0 <= 39) {
              te.c(26);
            }
            if (null != oea.field_q) {
              oea.field_q.a((byte) -36);
            }
            if (null != f.field_a) {
              try {
                f.field_a.d(-120);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null == fr.field_m) {
              return;
            }
            for (var1_int = 0; fr.field_m.length > var1_int; var1_int++) {
              if (fr.field_m[var1_int] != null) {
                try {
                  fr.field_m[var1_int].d(-7);
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                }
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw pe.a((Throwable) ((Object) var1_ref), "te.J(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        if (param0 != 35) {
          te.c((byte) -70);
          field_f = null;
          return;
        }
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        int var3 = 70 % ((18 - param1) / 42);
        String var2 = lka.field_E[param0][7];
        var2 = var2.trim();
        var2 = var2.toLowerCase();
        if (!var2.equals("")) {
          return ((ji) (dl.field_h.a(true, (long)var2.hashCode()))).field_h;
        }
        return 0;
    }

    final boolean b(int param0) {
        if (this.field_g == 60) {
          jja.a(192, -1, 25);
        }
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        if (fieldTemp$0 < 0) {
          this.field_e.field_h.b((byte) 106, 35, this.field_d, this.field_c);
          jja.a(128, -1, 24);
          return true;
        }
        if (param0 > 21) {
          return false;
        }
        this.b(1);
        return false;
    }

    final static int d(byte param0) {
        if (param0 != 89) {
          field_f = (String) null;
          return dfa.field_b - rs.field_a;
        }
        return dfa.field_b - rs.field_a;
    }

    final void a(int param0, int param1, int param2) {
        ee var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var4 = this.field_g * ((-(this.field_g * 655360) + 52428800 >> 16) + 400) / 80;
        ee var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param1 == 0) {
          var5 = sv.field_c;
          var6 = -(this.field_g * this.field_i / 80) + param2;
          var7 = -var4 + (param0 - this.field_h * this.field_g / 80);
          var5.a(var6, var7 - 64);
          return;
        }
        this.field_h = -112;
        var5Lifetime1 = sv.field_c;
        var6Lifetime1 = -(this.field_g * this.field_i / 80) + param2;
        var7Lifetime1 = -var4 + (param0 - this.field_h * this.field_g / 80);
        var5Lifetime1.a(var6Lifetime1, var7Lifetime1 - 64);
    }

    te(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
          this.field_g = 80;
          this.field_i = kla.a(129, m.field_a, -2147483648) - 64;
          this.field_h = -32 + kla.a(65, m.field_a, -2147483648);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          te.c((byte) 59);
        }
    }

    static {
        field_f = "Location";
    }
}
