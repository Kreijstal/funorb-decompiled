/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    static String field_e;
    private rca[] field_k;
    private int field_l;
    private int[][] field_a;
    static kv[] field_h;
    private int field_f;
    static int field_i;
    static vr field_j;
    private eaa field_d;
    private int field_g;
    static String field_c;
    private int field_b;
    boolean field_m;

    public static void a(int param0) {
        field_h = null;
        field_c = null;
        field_j = null;
        if (param0 >= -52) {
          pr.c(-93);
        }
        field_e = null;
    }

    final int[][] a(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (this.field_b != this.field_l) {
          throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; var2 < this.field_b; var2++) {
          this.field_k[var2] = jla.field_a;
        }
        if (param0) {
          this.field_k = (rca[]) null;
        }
        return this.field_a;
    }

    final static void a(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                aja.field_o = 1 + (int)(var3.longValue() / 1048576L);
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
          if (param0 != -21) {
            field_j = (vr) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[] a(int param0, int param1) {
        boolean stackIn_7_1 = false;
        boolean stackIn_18_1 = false;
        rca var3;
        rca var4;
        int var5;
        rca var4Lifetime1;
        rca var4Lifetime2;
        var5 = BachelorFridge.field_y;
        if (param1 != -1) {
          return (int[]) null;
        }
        if (this.field_l == this.field_b) {
          stackIn_18_1 = (this.field_k[param0] == null);
          this.field_m = stackIn_18_1;
          this.field_k[param0] = jla.field_a;
          return this.field_a[param0];
        }
        if (this.field_b == 1) {
          stackIn_7_1 = (this.field_f != param0);
          this.field_m = stackIn_7_1;
          this.field_f = param0;
          return this.field_a[0];
        }
        var3 = this.field_k[param0];
        var4 = var3;
        var4Lifetime1 = var3;
        if (var3 != null) {
          this.field_m = false;
        } else {
          this.field_m = true;
          if (this.field_b <= this.field_g) {
            var4Lifetime2 = (rca) (this.field_d.a(param1 ^ -7));
            var3 = new rca(param0, var4Lifetime2.field_f);
            this.field_k[var4Lifetime2.field_g] = null;
            var4Lifetime2.a(false);
          } else {
            var3 = new rca(param0, this.field_g);
            this.field_g = this.field_g + 1;
          }
          this.field_k[param0] = var3;
        }
        this.field_d.a(-59, var3);
        return this.field_a[var3.field_f];
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        for (var2 = param0; this.field_b > var2; var2++) {
          this.field_a[var2] = null;
        }
        this.field_k = null;
        this.field_a = (int[][]) null;
        this.field_d.d(73);
        this.field_d = null;
    }

    final static void c(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = BachelorFridge.field_y;
        try {
          jb.d();
          ima.field_s = 11;
          qk.field_m = new int[260];
          if (param0 > -21) {
            return;
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            qk.field_m[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (qk.field_m.length > var5) {
            qk.field_m[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "pr.E(" + param0 + ')');
        }
    }

    pr(int param0, int param1, int param2) {
        this.field_f = -1;
        this.field_g = 0;
        this.field_d = new eaa();
        this.field_m = false;
        this.field_b = param0;
        this.field_l = param1;
        this.field_k = new rca[this.field_l];
        this.field_a = new int[this.field_b][param2];
    }

    static {
        field_e = "Show all lobby chat";
        field_c = "To server list";
        field_i = 0;
    }
}
