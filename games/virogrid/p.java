/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int field_d;
    static km field_a;
    static int field_h;
    static ul field_b;
    static byte[] field_e;
    l field_i;
    private l field_c;
    static String field_g;
    static boolean field_f;

    final l b(boolean param0) {
        l var2 = null;
        l var2Lifetime1;
        if (param0) {
          field_a = (km) null;
          var2 = this.field_i.field_a;
          if (this.field_i == var2) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_i.field_a;
        if (this.field_i == var2Lifetime1) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final void a(boolean param0) {
        l var2;
        int var3;
        l var4;
        var3 = Virogrid.field_F ? 1 : 0;
        while (true) {
          var2 = this.field_i.field_f;
          if (var2 != this.field_i) {
            var2.a(false);
            continue;
          }
          break;
        }
        this.field_c = null;
        if (!param0) {
          return;
        }
        var4 = (l) null;
        this.a(-4, (l) null);
        return;
    }

    final void b(l param0, byte param1) {
        try {
          if (null != param0.field_a) {
            param0.a(false);
          }
          param0.field_a = this.field_i;
          param0.field_f = this.field_i.field_f;
          param0.field_a.field_f = param0;
          if (param1 != -45) {
            CharSequence var4 = (CharSequence) null;
            p.a(-77, -60, false, (CharSequence) null);
          }
          param0.field_f.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "p.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (df.field_f >= param1 + param3 + param2) {
          return param2 + param3;
        }
        if (~(-param1 + param2) <= param0) {
          return param2 - param1;
        }
        return -param1 + df.field_f;
    }

    final l d(int param0) {
        l var2 = this.field_i.field_f;
        if (this.field_i == var2) {
          return null;
        }
        if (param0 == -29889) {
          var2.a(false);
          return var2;
        }
        return (l) null;
    }

    final l b(int param0) {
        int var2 = -93 / ((-46 - param0) / 34);
        l var3 = this.field_i.field_a;
        if (this.field_i != var3) {
          var3.a(false);
          return var3;
        }
        return null;
    }

    final l e(int param0) {
        l var2 = null;
        l var2Lifetime1;
        if (param0 != 9003) {
          field_d = -121;
          var2 = this.field_c;
          if (this.field_i == var2) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_c;
        if (this.field_i == var2Lifetime1) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, lk param5, um param6) {
        dj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ai.a(-1, param6, (int[]) null, param5.field_Eb, param5.field_Ob, param5.field_Nb, -1, param5, 60);
        md.field_e.a(true, (byte) -126);
        md.field_e.a(4, (int[]) null, 0);
        md.field_e.a((byte) -110);
        if (param2) {
          return;
        }
        try {
          var7 = md.field_e;
          var8 = param1;
          var9 = param3;
          var10 = param4;
          var11 = param0;
          var7.field_a.a(var11, 0, var10, var8, var9);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "p.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final l a(int param0) {
        l var2 = this.field_c;
        if (var2 == this.field_i) {
          this.field_c = null;
          return null;
        }
        if (param0 == 16213) {
          this.field_c = var2.field_f;
          return var2;
        }
        this.b(true);
        this.field_c = var2.field_f;
        return var2;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = 1;
          if (param2 >= -95) {
            stackIn_3_0 = 81;
            return stackIn_3_0;
          }
          while (param0 > 1) {
            if ((param0 & 1) != 0) {
              var3_int = var3_int * param1;
            }
            param0 = param0 >> 1;
            param1 = param1 * param1;
          }
          if (param0 == 1) {
            stackIn_13_0 = var3_int * param1;
            return stackIn_13_0;
          }
          stackIn_15_0 = var3_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "p.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final l a(int param0, l param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        l stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 480) {
            field_h = 13;
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_i.field_f;
          }
          if (this.field_i != var3) {
            this.field_c = var3.field_f;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_c = null;
          stackIn_7_0 = null;
          return (l) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("p.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final l a(byte param0) {
        l var2 = this.field_i.field_f;
        if (var2 == this.field_i) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_f;
        if (param0 < -20) {
          return var2;
        }
        p.a(-111, 78, -112);
        return var2;
    }

    public static void c(int param0) {
        if (param0 <= -27) {
          field_g = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        p.a(-2, 62, false, (CharSequence) null);
        field_g = null;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    final void a(l param0, byte param1) {
        try {
          if (param0.field_a != null) {
            param0.a(false);
          }
          param0.field_a = this.field_i.field_a;
          param0.field_f = this.field_i;
          if (param1 > -30) {
            l var4 = (l) null;
            this.b((l) null, (byte) 27);
          }
          param0.field_a.field_f = param0;
          param0.field_f.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "p.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static eh a(int param0, int param1) {
        if (param0 >= 32) {
          return va.a(1, false, param1, -105, true, false);
        }
        field_e = (byte[]) null;
        return va.a(1, false, param1, -105, true, false);
    }

    final boolean b(byte param0) {
        if (param0 > 7) {
          return this.field_i.field_f == this.field_i ? true : false;
        }
        l var3 = (l) null;
        this.a(-30, (l) null);
        return this.field_i.field_f == this.field_i ? true : false;
    }

    final static int a(int param0, int param1, boolean param2, CharSequence param3) {
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
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          if (2 <= param0 &&
            param0 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            if (param1 != 4330) {
              field_f = false;
            }
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
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
                var10 = var9 + param0 * var6;
                if (var10 / param0 != var6) {
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
          stackIn_45_1 = new StringBuilder().append("p.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    public p() {
        this.field_i = new l();
        this.field_i.field_f = this.field_i;
        this.field_i.field_a = this.field_i;
    }

    static {
        field_h = 480;
        field_b = new ul(2);
        field_g = "Find opponents";
        field_f = false;
    }
}
