/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static qj[] field_d;
    static volatile int field_f;
    static int field_b;
    private gb field_e;
    static String field_a;
    static int field_c;
    private gb field_g;

    final gb b(int param0) {
        gb var2 = this.field_e.field_k;
        if (this.field_e == var2) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.field_k;
        if (param0 != 48) {
          return (gb) null;
        }
        return var2;
    }

    final gb a(int param0) {
        gb var2 = this.field_e.field_k;
        if (this.field_e == var2) {
          return null;
        }
        var2.e(0);
        if (param0 != -58) {
          mb.a(-120, -63, -45, (byte) 19, 80);
        }
        return var2;
    }

    public static void b(byte param0) {
        if (param0 != -36) {
          field_a = (String) null;
        }
        field_d = null;
        field_a = null;
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
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
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (param2 >= 2 &&
            param2 <= 36) {
            var4_int = 0;
            if (param0 != 55) {
              field_c = -28;
            }
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (43 != var9 ||
                !param3))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else {
                  if (97 > var9) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param2 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param2 * var6 + var9;
                if (var10 / param2 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("mb.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        nk.b(false);
        ll.b(param0, param1, param4, param2);
        int var5 = -22 % ((param3 - 51) / 54);
    }

    final static void a(byte param0, qj param1) {
        try {
          int var2_int = 45 / ((64 - param0) / 53);
          nk.b(false);
          ll.a(param1.field_z, param1.field_s, param1.field_v);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "mb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(gb param0, boolean param1) {
        try {
          if (null != param0.field_j) {
            param0.e(0);
          }
          if (!param1) {
            field_a = (String) null;
          }
          param0.field_k = this.field_e;
          param0.field_j = this.field_e.field_j;
          param0.field_j.field_k = param0;
          param0.field_k.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "mb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final gb a(byte param0) {
        if (param0 <= 70) {
          gb var3 = (gb) null;
          this.a((gb) null, true);
        }
        gb var2 = this.field_g;
        if (var2 == this.field_e) {
          this.field_g = null;
          return null;
        }
        this.field_g = var2.field_k;
        return var2;
    }

    public mb() {
        this.field_e = new gb();
        this.field_e.field_j = this.field_e;
        this.field_e.field_k = this.field_e;
    }

    final int c(byte param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 > -42) {
          return -128;
        }
        gb var3 = this.field_e.field_k;
        while (var3 != this.field_e) {
          var2++;
          var3 = var3.field_k;
        }
        return var2;
    }

    static {
        field_d = new qj[104];
        field_f = 0;
        field_b = 0;
        field_a = "Achieved";
    }
}
