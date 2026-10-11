/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gf extends kj {
    static String field_h;
    private eaa field_j;
    static String field_i;
    static int field_l;
    private int field_f;
    private kv[][] field_g;
    static int field_k;

    gf(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        int var5 = 0;
        kv[] array$2 = null;
        int var7 = 0;
        int var4_int = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_j = new eaa();
          this.field_f = 300;
          var4_int = aw.field_v.length;
          this.field_g = new kv[var4_int][];
          for (var5 = 0; var5 < var4_int; var5++) {
            var6 = aw.field_v[var5].length;
            array$2 = new kv[var6];
            this.field_g[var5] = array$2;
            for (var7 = 0; var6 > var7; var7++) {
              this.field_g[var5][var7] = aw.field_v[var5][var7].a();
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gf.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int var2 = kla.a(1024, sma.field_I, -2147483648);
        int var3 = kla.a(1024, sma.field_I, -2147483648);
        if (param0 >= -97) {
          this.a(114, true, -46);
        }
        int var4 = var3 + var2;
        int var5 = -var3 + var2 >> 1;
        int var6 = 200;
        mia var7 = new mia(var4, var6 << 4, var5, kla.a(aw.field_v.length, sma.field_I, -2147483648), kla.a(20, sma.field_I, -2147483648) + 5);
        this.field_j.a(var7, true);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.a(4, true, -18);
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_i = null;
        if (param0) {
          field_h = (String) null;
        }
    }

    final boolean b(int param0) {
        int stackIn_23_0 = 0;
        boolean stackIn_41_0 = false;
        Object var2;
        int var2_int;
        mia var2_ref;
        int var3;
        mia var2_refLifetime1;
        var2 = null;
        var3 = BachelorFridge.field_y;
        this.field_f = this.field_f - 1;
        if (this.field_f == 270) {
          wf.a(14, (byte) 126);
        }
        if (param0 <= 21) {
          return true;
        }
        if (50 < this.field_f &&
          this.field_f < 270) {
          if (this.field_f % 79 == 0) {
            wf.a(14, (byte) 127);
          }
          if (this.field_f % 31 == 0) {
            wf.a(15, (byte) 24);
          }
          if (0 == this.field_f % 109) {
            wf.a(16, (byte) 127);
          }
        }
        if (50 <= this.field_f) {
          if (this.field_f >= 75) {
            if (100 > this.field_f) {
              stackIn_23_0 = 15;
            } else {
              stackIn_23_0 = (this.field_f >= 150) ? 3 : 7;
            }
          } else {
            stackIn_23_0 = 31;
          }
          var2_int = stackIn_23_0;
          if (0 == (var2_int & this.field_f)) {
            this.c((byte) -121);
          }
        }
        if (this.field_f == 0) {
          var2_ref = (mia) (this.field_j.b((byte) 90));
          while (var2_ref != null) {
            var2_ref.field_m = -(4 + kla.a(8, m.field_a, -2147483648));
            var2_ref = (mia) (this.field_j.c(0));
          }
        }
        var2_refLifetime1 = (mia) (this.field_j.b((byte) 90));
        while (var2_refLifetime1 != null) {
          var2_refLifetime1.b(true);
          if (var2_refLifetime1.field_h < 0) {
            var2_refLifetime1.field_k = 0;
            var2_refLifetime1.field_h = 0;
          }
          var2_refLifetime1 = (mia) (this.field_j.c(0));
        }
        stackIn_41_0 = (this.field_f < 0) && (this.field_j.e(12917));
        return stackIn_41_0;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kv var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.c((byte) 63);
        }
        mia var4 = (mia) (this.field_j.b((byte) 90));
        while (var4 != null) {
          var5 = param2 + (var4.field_i >> 4);
          var6 = (var4.field_q >> 4) + (-(var4.field_h >> 4) + param0);
          var7 = vr.field_b / var4.field_s % 3;
          var8 = this.field_g[var4.field_r][var7];
          var9 = var8.field_n >> 1;
          var10 = var8.field_o >> 1;
          var8.c(-(var9 >> 1) + var5, -(var10 >> 1) + (var6 + 30), var9, var10, var4.field_o);
          var4 = (mia) (this.field_j.c(0));
        }
    }

    final static ema a(long param0, boolean param1) {
        if (param1) {
          field_k = 23;
        }
        return (ema) (iga.field_c.a(param0, (byte) -87));
    }

    static {
        field_h = "Playing";
        field_i = "This option cannot be combined with the current settings for:  ";
        field_l = 2;
    }
}
