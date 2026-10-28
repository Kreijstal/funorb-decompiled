/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextLayout {
    static int field_d;
    static String field_e;
    static boolean field_b;
    static String field_f;
    vl[] field_a;
    static pj field_c;

    final int a(int param0, int param1) {
        int var5 = EscapeVector.obfuscationControl;
        for (int var3 = param1; var3 < this.field_a.length; var3++) {
          vl var4 = this.field_a[var3];
          if (param0 < var4.field_b.length) {
            return var3;
          }
          param0 = param0 - (var4.field_b.length - 1);
        }
        return this.field_a.length;
    }

    final int c(int param0) {
        int stackIn_7_0 = 0;
        if (param0 != 0) {
          return -63;
        }
        if (this.field_a != null &&
          this.field_a.length > 0) {
          stackIn_7_0 = this.field_a[-1 + this.field_a.length].field_a - this.field_a[0].field_d;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int a(byte param0) {
        int var7 = EscapeVector.obfuscationControl;
        if (param0 != -112) {
          TextLayout.a(72);
        }
        int var2 = -1;
        if (this.field_a != null) {
          vl[] var3 = this.field_a;
          for (int var4 = 0; var4 < var3.length; var4++) {
            vl var5 = var3[var4];
            if (var5 != null) {
              int var6 = var5.b(119);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, int param1, String param2, int param3) {
        String stackIn_24_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (param0 != -21446) {
            this.field_a = (vl[]) null;
          }
          int var5_int = 0;
          boolean var6 = false;
          int var7 = param2.length();
          for (int var8 = 0; var7 > var8; var8++) {
            int var9 = param2.charAt(var8);
            if (var9 == 60) {
              var6 = true;
            } else if (62 == var9) {
              var6 = false;
            } else if (!var6 &&
              var9 == 32) {
              var5_int++;
            }
          }
          if (var5_int <= 0) {
            return 0;
          }
          int stackIn_20_0 = (param3 - param1 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var5;
          StringBuilder stackIn_23_1 = new StringBuilder().append("pg.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          field_d = -128;
        }
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static java.awt.Container a(int param0) {
        if (param0 != -1) {
          return (java.awt.Container) null;
        }
        if (qj.field_i != null) {
          return (java.awt.Container) ((Object) qj.field_i);
        }
        return (java.awt.Container) ((Object) PointCloudEffect.d((byte) -119));
    }

    final int a(byte param0, int param1) {
        int var6 = EscapeVector.obfuscationControl;
        vl[] var7 = this.field_a;
        vl[] var3 = var7;
        for (int var4 = 0; var4 < var7.length; var4++) {
          vl var5 = var7[var4];
          if (param1 < var5.field_b.length) {
            return var5.field_b[param1];
          }
          param1 = param1 - (var5.field_b.length - 1);
        }
        int var4Lifetime1 = 79 % ((60 - param0) / 62);
        return 0;
    }

    final int a(byte param0, int param1, int param2) {
        int var8 = EscapeVector.obfuscationControl;
        if (null != this.field_a &&
          this.field_a.length != 0 &&
          this.field_a[0].field_d <= param2) {
          if (this.field_a[this.field_a.length - 1].field_a < param2) {
            return -1;
          }
          if (1 == this.field_a.length) {
            return this.field_a[0].a((byte) 52, param1);
          }
          int var4 = 0;
          if (param0 < 8) {
            this.a((byte) 53, -122, 65);
          }
          for (int var5 = 0; this.field_a.length > var5; var5++) {
            vl var6 = this.field_a[var5];
            if (param2 >= var6.field_d &&
              param2 <= var6.field_a) {
              int var7 = var6.a((byte) 52, param1);
              if (-1 == var7) {
                return -1;
              }
              return var7 + var4;
            }
            var4 = var4 + (-1 + var6.field_b.length);
          }
          return -1;
        }
        return -1;
    }

    static {
        field_f = "Unpacking graphics";
        field_e = null;
    }
}
