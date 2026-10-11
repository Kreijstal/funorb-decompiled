/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cu extends ana {
    static String field_y;
    private ku field_x;
    private int field_A;
    private int field_w;
    private aj[] field_v;
    static String field_z;

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 <= fieldTemp$0) {
          return false;
        }
        if (this.field_w <= this.field_A) {
          this.e(19);
          return true;
        }
        int fieldTemp$1 = this.field_A;
        this.field_A = this.field_A + 1;
        aj var5 = this.field_v[fieldTemp$1];
        aj var6 = var5;
        pi var3 = new pi(this.field_q, var6.field_c, var6.field_a);
        ((kj) ((Object) var3)).a(0);
        this.field_q.field_h.field_a[var5.field_c][var5.field_a].field_i = false;
        int var4 = 75 % ((71 - param0) / 47);
        this.field_q.field_s.d(82);
        this.field_l = 200 / (this.field_q.field_h.field_z + this.field_q.field_h.field_B);
        if (this.field_l < 1) {
          this.field_l = 1;
        }
        if (this.field_A != 1 &&
          this.field_A % (60 / this.field_l) != 0) {
          return false;
        }
        wf.a(19, (byte) -77);
        return false;
    }

    public static void d(int param0) {
        field_y = null;
        field_z = null;
        int var1 = 64 / ((-34 - param0) / 33);
    }

    private final void e(int param0) {
        if (param0 != 19) {
          cu.d(92);
        }
        this.field_x.a(this.field_q.field_h, (byte) -2);
    }

    cu(gj param0, ku param1) {
        super(param0, param1);
        int fieldTemp$0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
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
          this.field_x = param1;
          this.field_w = 0;
          var8 = this.field_q.field_h;
          var9 = var8;
          for (var4 = 0; var4 < var9.field_z; var4++) {
            for (var5 = 0; var5 < var9.field_B; var5++) {
              if (var8.field_a[var4][var5].field_i) {
                this.field_w = this.field_w + 1;
              }
            }
          }
          this.field_A = 0;
          this.field_v = new aj[this.field_w];
          for (var4Lifetime1 = 0; var4Lifetime1 < var9.field_z; var4Lifetime1++) {
            for (var5Lifetime1 = 0; var5Lifetime1 < var9.field_B; var5Lifetime1++) {
              if (var8.field_a[var4Lifetime1][var5Lifetime1].field_i) {
                fieldTemp$0 = this.field_A;
                this.field_A = this.field_A + 1;
                this.field_v[fieldTemp$0] = new aj(var4Lifetime1, var5Lifetime1);
              }
            }
          }
          for (var4Lifetime2 = 0; this.field_w > var4Lifetime2; var4Lifetime2++) {
            var5Lifetime2 = kla.a(this.field_w, m.field_a, -2147483648);
            if (var4Lifetime2 != var5Lifetime2) {
              var6 = this.field_v[var4Lifetime2];
              this.field_v[var4Lifetime2] = this.field_v[var5Lifetime2];
              this.field_v[var5Lifetime2] = var6;
            }
          }
          this.field_A = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("cu.<init>(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
        field_z = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_y = "Asking for or providing contact information";
    }
}
