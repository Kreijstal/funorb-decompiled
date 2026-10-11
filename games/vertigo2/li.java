/*
 * Decompiled by CFR-JS 0.4.0.
 */
class li {
    long field_k;
    li field_a;
    static int[] field_g;
    li field_c;
    static ej field_j;
    static int field_f;
    static co field_e;
    static String field_h;
    static String field_b;
    static fe[] field_i;
    static int field_d;
    static er field_m;
    static int[] field_l;

    public static void d(int param0) {
        field_e = null;
        field_h = null;
        field_i = null;
        field_b = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_m = null;
        if (param0 != 55) {
          li.d(-58);
        }
    }

    final static ve a(int param0, int param1) {
        int var3 = 0;
        ve[] var2;
        int var4;
        ve[] var5;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= -21) {
          field_g = (int[]) null;
        }
        var5 = k.a(-15922);
        var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
          if (var5[var3].field_e == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    final boolean b(int param0) {
        if (param0 < 76) {
          this.field_a = (li) null;
        }
        if (this.field_a != null) {
          return true;
        }
        return false;
    }

    final static int a(int param0, boolean param1, CharSequence param2, boolean param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 >= 2 &&
            36 >= param0) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (!param3) {
              field_b = (String) null;
            }
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param0 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param0 * var6 + var9;
                if (var6 != var10 / param0) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("li.RB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0) {
        if (param0 != 2) {
          li.a(true, -15);
        }
        if (null == this.field_a) {
          return;
        }
        this.field_a.field_c = this.field_c;
        this.field_c.field_a = this.field_a;
        this.field_a = null;
        this.field_c = null;
    }

    final static void a(boolean param0, int param1) {
        ap.field_g = pn.field_Q[param1];
        eb.field_a = f.field_I[param1];
        bq.field_A = Vertigo2.field_H[param1];
        if (!param0) {
          field_d = 61;
        }
    }

    static {
        field_j = new ej("email");
        field_b = "Your rating is <%0>";
        field_d = 0;
        field_f = 12;
        field_l = new int[256];
    }
}
