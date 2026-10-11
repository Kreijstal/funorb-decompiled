/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    int field_b;
    int field_c;
    static wb field_d;
    int[] field_a;
    static boolean field_f;
    static oj field_e;

    final static int a(CharSequence param0, byte param1, int param2, boolean param3) {
        int var8 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = stellarshard.field_B;
        try {
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            if (param1 < 74) {
              field_e = (oj) null;
            }
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (97 <= var9 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param2 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + var6 * param2;
                if (var10 / param2 != var6) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_41_0 = var6;
            return stackIn_41_0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("uj.C(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_d = null;
        if (param0 != 0) {
          uj.b(-20);
        }
    }

    uj(int param0, int param1, int param2) {
        this.field_a = new int[1 + param2];
        this.field_c = param1;
        this.field_b = param0;
    }

    final int a(int param0) {
        int stackIn_7_0 = 0;
        if (param0 < 41) {
          return -77;
        }
        if (this.field_a != null &&
          0 != this.field_a.length) {
          stackIn_7_0 = this.field_a[this.field_a.length - 1];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = stellarshard.field_B;
        if (this.field_a != null &&
          this.field_a.length != 0) {
          var3 = 1;
          if (param1 > -121) {
            this.a(119);
          }
          while (var3 < this.field_a.length) {
            if (param0 < this.field_a[var3] + this.field_a[-1 + var3] >> 1) {
              return -1 + var3;
            }
            var3++;
          }
          return this.field_a.length - 1;
        }
        return 0;
    }

    static {
        field_d = new wb();
    }
}
