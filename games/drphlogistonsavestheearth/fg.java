/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    int[] field_e;
    int field_g;
    private int field_k;
    private String field_b;
    private boolean field_f;
    static int field_h;
    String field_i;
    static int field_j;
    int field_d;
    int field_a;
    private long field_c;

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var9 = new char[var2_int];
          var8 = var9;
          var3 = var8;
          var4 = 0;
          var5 = 90 % ((param1 - 5) / 48);
          while (var2_int > var4) {
            var6 = param0.charAt(var4);
            if (var6 >= 65 &&
              var6 <= 90) {
              var3[var4] = (char)(var6 + 32);
            } else if ((var6 < 97 ||
              var6 > 122) &&
              (var6 < 48 ||
              var6 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var6;
            }
            var4++;
          }
          stackIn_18_0 = new String(var9);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("fg.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static sf a(int param0) {
        if (param0 == 1) {
          if (null == th.field_c) {
            th.field_c = new sf();
            th.field_c.a(42, uh.field_i);
            th.field_c.field_n = 5;
            th.field_c.field_g = u.field_d;
            th.field_c.field_s = 6;
            th.field_c.field_k = 2763306;
            th.field_c.field_t = 4;
            th.field_c.field_c = 0;
            th.field_c.field_r = 7697781;
            th.field_c.field_q = 14;
          }
          return th.field_c;
        }
        CharSequence var2 = (CharSequence) null;
        fg.a((CharSequence) null, 84);
        if (null == th.field_c) {
          th.field_c = new sf();
          th.field_c.a(42, uh.field_i);
          th.field_c.field_n = 5;
          th.field_c.field_g = u.field_d;
          th.field_c.field_s = 6;
          th.field_c.field_k = 2763306;
          th.field_c.field_t = 4;
          th.field_c.field_c = 0;
          th.field_c.field_r = 7697781;
          th.field_c.field_q = 14;
        }
        return th.field_c;
    }

    fg(boolean param0) {
        this.field_k = ib.field_o;
        this.field_i = am.field_m;
        this.field_f = td.field_f;
        this.field_a = kl.field_J;
        this.field_b = tf.field_kb;
        this.field_c = fm.field_j;
        this.field_g = dj.field_K;
        if (param0) {
          this.field_e = mf.field_x;
        } else {
          this.field_e = null;
        }
        this.field_d = ob.field_a;
    }

    final int a(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (this.field_f) {
          return 2;
        }
        if (this.field_a == 2) {
          if (0 < this.field_k) {
            return 2;
          }
          if (this.field_c == DrPhlogistonSavesTheEarth.field_I) {
            return 1;
          }
          var2 = 19 / ((param0 + 29) / 38);
          if (of.field_v != 2) {
            return 0;
          }
          if (!ik.a(this.field_b, (byte) -119)) {
            return 0;
          }
          return 1;
        }
        if (this.field_c == DrPhlogistonSavesTheEarth.field_I) {
          return 1;
        }
        var2Lifetime1 = 19 / ((param0 + 29) / 38);
        if (of.field_v != 2) {
          return 0;
        }
        if (!ik.a(this.field_b, (byte) -119)) {
          return 0;
        }
        return 1;
    }

    static {
    }
}
