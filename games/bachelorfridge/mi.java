/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mi extends at {
    private gj field_j;
    static String field_n;
    private int field_o;
    private int field_q;
    static int field_k;
    private aj[] field_m;
    static gu[] field_l;
    private int field_p;

    public static void d(byte param0) {
        field_n = null;
        field_l = null;
        int var1 = 17 / ((-49 - param0) / 54);
    }

    private final void b(boolean param0) {
        if (param0) {
          mi.d((byte) 97);
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$3 = 0;
        uea var3;
        int var4;
        aj var5;
        aj var6;
        int fieldTemp$2 = this.field_q - 1;
        this.field_q = this.field_q - 1;
        if (0 <= fieldTemp$2) {
          return false;
        }
        if (this.field_p <= this.field_o) {
          this.b(false);
          return true;
        }
        fieldTemp$3 = this.field_o;
        this.field_o = this.field_o + 1;
        var5 = this.field_m[fieldTemp$3];
        var6 = var5;
        var3 = new uea(this.field_j, var6.field_c, var6.field_a, 16777215);
        ((kj) ((Object) var3)).a(0);
        this.field_j.field_h.field_a[var5.field_c][var5.field_a].field_i = true;
        this.field_j.field_s.d(74);
        var4 = -120 / ((71 - param0) / 47);
        this.field_q = 200 / (this.field_j.field_h.field_B + this.field_j.field_h.field_z);
        if (1 > this.field_q) {
          this.field_q = 1;
        }
        if (this.field_o == 1) {
          wf.a(19, (byte) 126);
        } else {
          if (0 == this.field_o % (100 / this.field_q)) {
            wf.a(19, (byte) 126);
          }
        }
        return false;
    }

    mi(gj param0, bja param1) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        aj var6 = null;
        op var8 = null;
        op var9 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        try {
          this.field_j = param0;
          var8 = this.field_j.field_h;
          var9 = var8;
          this.field_p = 0;
          for (var4 = 0; var4 < var9.field_z; var4++) {
            for (var5 = 0; var5 < var9.field_B; var5++) {
              if (!var8.field_a[var4][var5].field_i &&
                var8.field_L.field_o[var4][var5].field_n == 1) {
                this.field_p = this.field_p + 1;
              }
            }
          }
          this.field_m = new aj[this.field_p];
          this.field_o = 0;
          for (var4Lifetime1 = 0; var9.field_z > var4Lifetime1; var4Lifetime1++) {
            for (var5Lifetime1 = 0; var5Lifetime1 < var9.field_B; var5Lifetime1++) {
              if (!var8.field_a[var4Lifetime1][var5Lifetime1].field_i &&
                1 == var8.field_L.field_o[var4Lifetime1][var5Lifetime1].field_n) {
                fieldTemp$0 = this.field_o;
                this.field_o = this.field_o + 1;
                this.field_m[fieldTemp$0] = new aj(var4Lifetime1, var5Lifetime1);
              }
            }
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < this.field_p; var4Lifetime2++) {
            var5Lifetime2 = kla.a(this.field_p, m.field_a, -2147483648);
            if (var5Lifetime2 != var4Lifetime2) {
              var6 = this.field_m[var4Lifetime2];
              this.field_m[var4Lifetime2] = this.field_m[var5Lifetime2];
              this.field_m[var5Lifetime2] = var6;
            }
          }
          this.field_o = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("mi.<init>(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_k = 480;
        field_n = "If you are not, please change your password to something more obscure!";
        field_l = new gu[255];
        for (var0 = 0; field_l.length > var0; var0++) {
          field_l[var0] = new gu();
        }
    }
}
