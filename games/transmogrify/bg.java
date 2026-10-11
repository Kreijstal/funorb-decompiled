/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends me {
    private rg field_o;
    private rg field_k;
    static int field_m;
    static int field_l;
    static int[] field_j;
    static boolean field_n;

    final rc a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        rc stackIn_2_0 = null;
        rc stackIn_5_0 = null;
        rc stackIn_9_0 = null;
        rc stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 95) {
            stackIn_2_0 = (rc) null;
            return stackIn_2_0;
          }
          var3 = this.field_o.field_k.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_5_0 = ec.field_d;
            return stackIn_5_0;
          }
          if (!be.a(var4, param0 - 95, var3)) {
            stackIn_9_0 = ec.field_d;
            return stackIn_9_0;
          }
          if (!this.b(param1, param0 ^ -8680)) {
            return hi.field_b;
          }
          stackIn_13_0 = ec.field_d;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_k.field_k.toLowerCase();
          if (param1 != -8633) {
            var8 = (CharSequence) null;
            bg.a(-22, true, (CharSequence) null, (byte) 13);
          }
          var4 = param0.toLowerCase();
          if (0 < var3.length()) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (0 > var4.indexOf(var6)) {
                stackIn_13_0 = (0 <= var4.indexOf(var7));
                return stackIn_13_0;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("bg.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    bg(rg param0, rg param1, rg param2) {
        super(param0);
        try {
          this.field_o = param1;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_o.field_k.toLowerCase();
          var4 = param1.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (vj.a(-23424, var5)) {
            stackIn_6_0 = ob.field_I;
            return stackIn_6_0;
          }
          if (ga.a(var5, 3336)) {
            stackIn_10_0 = qe.field_H;
            return stackIn_10_0;
          }
          if (ve.a(1, var5)) {
            stackIn_14_0 = ri.field_i;
            return stackIn_14_0;
          }
          if (this.b(param1, param0 ^ 8632)) {
            stackIn_18_0 = gb.field_d;
            return stackIn_18_0;
          }
          if (~var6.length() >= param0) {
            stackIn_33_0 = q.field_g;
            return stackIn_33_0;
          }
          if (fc.a((byte) 19, var5, var6)) {
            stackIn_22_0 = ae.field_b;
            return stackIn_22_0;
          }
          if (fk.a(var6, (byte) 34, var5)) {
            stackIn_26_0 = qj.field_c;
            return stackIn_26_0;
          }
          if (!me.a(var6, (byte) 119, var5)) {
            stackIn_31_0 = ob.field_I;
            return stackIn_31_0;
          }
          stackIn_29_0 = ae.field_b;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("bg.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, CharSequence param2, byte param3) {
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
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 >= 2 &&
            36 >= param0) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            if (param3 != 126) {
              field_l = 51;
            }
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
          stackIn_45_1 = new StringBuilder().append("bg.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        try {
          if (param0 > -99) {
            bg.b((byte) -60);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "bg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean g(int param0) {
        int var1 = -97 % ((18 - param0) / 49);
        return lb.field_d;
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 != 54) {
          bg.b((byte) -109);
        }
    }

    static {
        field_l = 0;
    }
}
