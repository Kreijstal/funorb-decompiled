/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    private int field_h;
    private long field_a;
    static String[] field_f;
    private long[][] field_c;
    private int field_g;
    static byte[][] field_e;
    private int field_b;
    private Object[][] field_d;

    final Object b(int param0) {
        int fieldTemp$0 = 0;
        Object[] var2;
        long[] var3;
        Object var4;
        int var5;
        Object[] var6;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (0 > this.field_g) {
          return null;
        }
        var6 = this.field_d[(int)((long)(-1 + this.field_b) & this.field_a)];
        var2 = var6;
        var3 = this.field_c[(int)(this.field_a & (long)(this.field_b - 1))];
        while (var6.length > this.field_g) {
          var4 = var6[this.field_g];
          if (var4 != null) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            if (~this.field_a == ~var3[fieldTemp$0]) {
              return var4;
            }
            continue;
          }
          break;
        }
        this.field_g = param0;
        return null;
    }

    final Object a(int param0, long param1) {
        if (param0 > -123) {
          field_f = (String[]) null;
        }
        this.field_a = param1;
        this.field_g = 0;
        return this.b(-1);
    }

    public static void a(int param0) {
        field_e = (byte[][]) null;
        field_f = null;
        if (param0 < 75) {
          field_f = (String[]) null;
        }
    }

    final void a(Object param0, byte param1, long param2) {
        Object[] array$0 = null;
        long[] array$1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object[] var5 = null;
        RuntimeException var5_ref = null;
        long[] var6 = null;
        int var7_int = 0;
        Object[] var7 = null;
        long[] var8 = null;
        int var9 = 0;
        Object[] var10 = null;
        long[] var11 = null;
        Object[] var5Lifetime1;
        long[] var6Lifetime1;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 == null) {
            throw new IllegalArgumentException();
          }
          var10 = this.field_d[(int)((long)(-1 + this.field_b) & param2)];
          var5 = var10;
          var11 = this.field_c[(int)((long)(this.field_b - 1) & param2)];
          var6 = var11;
          var7_int = 0;
          while (var7_int < var10.length) {
            if (var10[var7_int] != null) {
              var7_int++;
              continue;
            }
            var5[var7_int] = param0;
            var11[var7_int] = param2;
            return;
          }
          if (param1 != 26) {
            return;
          }
          var7 = var5;
          var8 = var6;
          array$0 = new Object[var7.length + this.field_h];
          var5Lifetime1 = array$0;
          this.field_d[(int)ej.a((long)(this.field_b - 1), param2)] = array$0;
          array$1 = new long[var8.length + this.field_h];
          var6Lifetime1 = array$1;
          this.field_c[(int)ej.a(param2, (long)(-1 + this.field_b))] = array$1;
          ji.a(var7, 0, var5Lifetime1, 0, var7.length);
          ji.a(var8, 0, var6Lifetime1, 0, var8.length);
          var5Lifetime1[var7.length] = param0;
          var6Lifetime1[var8.length] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("ld.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ld(int param0, int param1, int param2) {
        int var4 = 0;
        Object[] array$0 = null;
        long[] array$1 = null;
        this.field_h = param2;
        this.field_b = param0;
        this.field_d = new Object[this.field_b][];
        this.field_c = new long[this.field_b][];
        for (var4 = 0; this.field_b > var4; var4++) {
          array$0 = new Object[param1];
          this.field_d[var4] = array$0;
          array$1 = new long[param1];
          this.field_c[var4] = array$1;
        }
    }

    static {
        field_f = new String[]{"By rating", "By win percentage"};
    }
}
