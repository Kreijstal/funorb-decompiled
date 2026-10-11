/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends tf {
    private int field_g;
    private long field_f;
    private long field_e;
    private int field_h;
    private long[] field_d;
    private long field_c;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = lm.a('_', param2 - 172, param1, "");
          var3 = ph.a(param0, 0);
          if (param2 != 52) {
            var4 = (String) null;
            cr.a((String) null, (String) null, (byte) -22);
          }
          stackIn_7_0 = (-1 != param1.indexOf(param0)) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("cr.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final long a(boolean param0) {
        this.field_c = this.field_c + this.b(-89);
        if (this.field_e > this.field_c) {
          return (-this.field_c + this.field_e) / 1000000L;
        }
        if (param0) {
          this.a(6);
        }
        return 0L;
    }

    final void a(int param0) {
        if (this.field_c < this.field_e) {
          this.field_c = this.field_c + (-this.field_c + this.field_e);
        }
        this.field_f = (long)param0;
    }

    final int a(long param0, int param1) {
        int var4;
        int var5;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param1 != 0) {
          return -42;
        }
        if (this.field_c < this.field_e) {
          this.field_f = this.field_f + (this.field_e - this.field_c);
          this.field_c = this.field_c + (this.field_e - this.field_c);
          this.field_e = this.field_e + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_e = this.field_e + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_e < this.field_c);
        if (this.field_c > this.field_e) {
          this.field_e = this.field_c;
        }
        return var4;
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = AceOfSkies.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_f;
        if (param0 >= -71) {
          return 93L;
        }
        this.field_f = var2;
        if (-5000000000L < var4 &&
          var4 < 5000000000L) {
          this.field_d[this.field_h] = var4;
          if (this.field_g < 1) {
            this.field_g = this.field_g + 1;
          }
          this.field_h = (1 + this.field_h) % 10;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_g; var8++) {
          var6 = var6 + this.field_d[(10 + this.field_h - var8) % 10];
        }
        return var6 / (long)this.field_g;
    }

    cr() {
        this.field_e = 0L;
        this.field_g = 1;
        this.field_d = new long[10];
        this.field_f = 0L;
        this.field_h = 0;
        this.field_c = 0L;
        this.field_c = System.nanoTime();
        this.field_e = System.nanoTime();
    }

    static {
    }
}
