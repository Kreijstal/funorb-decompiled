/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int[] field_a;
    static m field_b;
    static String field_d;
    static fc field_c;

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        if (param1 != 26) {
          field_b = (m) null;
        }
        int var2 = 255 & param0;
        if (0 == var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          160 > var2) {
          var3 = ne.field_d[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_c = (fc) null;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        if (param0 != -20075) {
          return -42;
        }
        var3 = (this.field_a.length >> 1) - 1;
        var4 = param1 & var3;
        while (true) {
          var5 = this.field_a[1 + (var4 + var4)];
          if (var5 == -1) {
            return -1;
          }
          if (param1 == this.field_a[var4 + var4]) {
            return var5;
          }
          var4 = var3 & 1 + var4;
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 1) {
          return false;
        }
        stackIn_6_0 = (null != jc.field_b) && (uf.field_m.b(~param0));
        return stackIn_6_0;
    }

    final static db[] a(int param0, db param1) {
        int var3 = 0;
        db[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        db[] var9 = null;
        db[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var9 = new db[32];
          var2 = var9;
          var9[param0] = param1;
          for (var3 = 1; var3 < 32; var3++) {
            var4 = var3 - 32;
            var5 = (double)var4 * 3.141592653589793 / 64.0;
            var7 = (int)(1.0 + Math.abs(Math.sin(var5)) * (double)param1.field_u + Math.abs(Math.cos(var5)) * (double)param1.field_p);
            var9[var3] = new db(var7, var7);
            var9[var3].b();
            param1.a(8 * param1.field_p, 8 * param1.field_u, var7 * 8, 8 * var7, var4 * 16384 / 32, 4096);
            var9[var3].h();
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("el.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    el(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & -1 + var2_int;
            while (-1 != this.field_a[var4 + (var4 + 1)]) {
              var4 = -1 + var2_int & 1 + var4;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("el.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static String b(int param0) {
        if (bk.field_c == ca.field_i) {
          return wa.field_k;
        }
        if (param0 != 1) {
          field_d = (String) null;
        }
        return rf.field_b;
    }

    static {
        field_b = new m("");
        field_d = "Unfortunately we are unable to create an account for you at this time.";
    }
}
