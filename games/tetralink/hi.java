/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi {
    bk[] field_c;
    static double[] field_d;
    static String field_b;
    static boolean field_a;

    final static sj a(String param0, byte param1) {
        RuntimeException var2 = null;
        sj stackIn_2_0 = null;
        Object stackIn_10_0 = null;
        sj stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -80) {
            stackIn_2_0 = (sj) null;
            return stackIn_2_0;
          }
          if (pi.field_a == ll.field_C) {
            return null;
          }
          if (pi.field_a == ik.field_d &&
            param0.equals(ak.field_b)) {
            pi.field_a = fk.field_Q;
            stackIn_12_0 = pm.field_f;
            return stackIn_12_0;
          }
          pi.field_a = ll.field_C;
          pm.field_f = null;
          ak.field_b = param0;
          stackIn_10_0 = null;
          return (sj) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("hi.M(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        bk var6;
        int var7;
        int var8;
        var8 = TetraLink.field_J;
        if (this.field_c != null &&
          0 != this.field_c.length &&
          this.field_c[0].field_h <= param1) {
          if (param1 > this.field_c[this.field_c.length - 1].field_a) {
            return -1;
          }
          if (param2 != 12024) {
            this.field_c = (bk[]) null;
          }
          if (1 == this.field_c.length) {
            return this.field_c[0].a((byte) 109, param0);
          }
          var4 = 0;
          for (var5 = 0; var5 < this.field_c.length; var5++) {
            var6 = this.field_c[var5];
            if (param1 >= var6.field_h &&
              param1 <= var6.field_a) {
              var7 = var6.a((byte) 118, param0);
              if (var7 != -1) {
                return var7 + var4;
              }
              return -1;
            }
            var4 = var4 + (var6.field_j.length - 1);
          }
          return -1;
        }
        return -1;
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        bk[] var3;
        bk var5;
        int var7;
        int var6;
        var7 = TetraLink.field_J;
        var2 = -1;
        if (param0 < 29) {
          field_d = (double[]) null;
        }
        if (this.field_c != null) {
          var3 = this.field_c;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) -41);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        bk var5 = null;
        int var6 = TetraLink.field_J;
        bk[] var8 = this.field_c;
        bk[] var3 = var8;
        if (!param1) {
          String var7 = (String) null;
          hi.a((String) null, 'ﾎ', 23);
        }
        for (var4 = 0; var4 < var8.length; var4++) {
          var5 = var8[var4];
          if (!(var5.field_j.length <= param0)) {
            return var5.field_j[param0];
          }
          param0 = param0 - (var5.field_j.length - 1);
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        bk var4;
        int var5;
        var5 = TetraLink.field_J;
        for (var3 = 0; this.field_c.length > var3; var3++) {
          var4 = this.field_c[var3];
          if (param0 < var4.field_j.length) {
            return var3;
          }
          param0 = param0 - (var4.field_j.length - 1);
        }
        if (param1 < 94) {
          this.a(-30, -101);
        }
        return this.field_c.length;
    }

    final static String[] a(String param0, char param1, int param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TetraLink.field_J;
        try {
          var10 = (CharSequence) ((Object) param0);
          var3_int = en.a(param2 - 663, param1, var10);
          var4 = new String[var3_int + 1];
          var5 = 0;
          if (param2 != 783) {
            stackIn_3_0 = (String[]) null;
            return stackIn_3_0;
          }
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param1 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hi.O(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        io.field_h.setLength(0);
        sf.field_d = 0;
        if (param0 >= -33) {
          field_d = (double[]) null;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 55) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        int var1 = -124 % ((-60 - param0) / 55);
        kb.a(false, rh.field_F);
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        if (!param0) {
          field_a = false;
        }
        if (this.field_c != null &&
          0 < this.field_c.length) {
          stackIn_6_0 = this.field_c[this.field_c.length - 1].field_a - this.field_c[0].field_h;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1, int param2, String param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = TetraLink.field_J;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param3.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (62 != var9) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var5_int > 0) {
            stackIn_19_0 = (-param0 + param2 << 8) / var5_int;
            return stackIn_19_0;
          }
          if (param1 == -126) {
            stackIn_24_0 = 0;
            return stackIn_24_0;
          }
          stackIn_22_0 = -18;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("hi.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_b = "Drawn";
        field_a = false;
    }
}
