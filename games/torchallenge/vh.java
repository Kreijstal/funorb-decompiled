/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private boolean field_f;
    static int field_h;
    private boolean field_e;
    static vi field_b;
    static String field_g;
    private String field_c;
    static tc[] field_d;
    static boolean field_a;

    final static void a(int param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        o var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 > -26) {
            var4 = (CharSequence) null;
            vh.a((byte) -81, false, -106, (CharSequence) null);
          }
          var5 = (o) (ve.field_c.c((byte) -72));
          while (var5 != null) {
            te.a(param0, 9082, var5);
            var5 = (o) (ve.field_c.c(-270));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "vh.H(" + param0 + ',' + param1 + ')');
        }
    }

    final String a(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return this.field_c;
    }

    final void a(byte param0, boolean param1) {
        this.field_f = true;
        this.field_e = param1 ? true : false;
        if (param0 < 39) {
          vh.a(32, -4);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          return true;
        }
        return this.field_e;
    }

    final static int a(byte param0, boolean param1, int param2, CharSequence param3) {
        int var9 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 >= 2 &&
            36 >= param2) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = -95 % ((param0 + 60) / 47);
            for (var9 = 0; var9 < var7; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = param3.charAt(var9);
              if ((var9 == 0) &&
                (var10 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var9 != 0 || (var10 != 43 ||
                !param1))) {
                if (var10 >= 48 &&
                  57 >= var10) {
                  var10 -= 48;
                } else if (var10 >= 65 &&
                  90 >= var10) {
                  var10 -= 55;
                } else if (var10 >= 97 &&
                  var10 <= 122) {
                  var10 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var10 >= param2) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var10 = -var10;
                }
                var11 = param2 * var6 + var10;
                if (var6 != var11 / param2) {
                  throw new NumberFormatException();
                }
                var6 = var11;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_38_0 = var6;
            return stackIn_38_0;
          }
          throw new IllegalArgumentException("" + param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("vh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static rh a(ge[] param0, int param1, int param2, byte[] param3, int param4, int param5) {
        int var16_int = 0;
        byte[] array$0 = null;
        int var26 = 0;
        int incrementValue$2 = 0;
        rh stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        byte[][] var11 = null;
        int var13 = 0;
        int var14 = 0;
        rh var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var27 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        int[] var44 = null;
        int[] var45 = null;
        int var23Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        var27 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0.length != 256) {
            throw new IllegalArgumentException();
          }
          var38 = new int[256];
          var31 = var38;
          var6 = var31;
          var39 = new int[256];
          var32 = var39;
          var7 = var32;
          var36 = new int[256];
          var29 = var36;
          var8 = var29;
          var37 = new int[256];
          var30 = var37;
          var9 = var30;
          var10 = new int[]{0, param4, param5};
          var40 = new byte[256][];
          var33 = var40;
          var11 = var33;
          var45 = qg.field_i;
          var13 = qg.field_g;
          var14 = qg.field_f;
          var44 = new int[4];
          qg.a(var44);
          for (var16_int = 0; var16_int < 256; var16_int++) {
            var6[var16_int] = -param1 + param0[var16_int].field_f;
            var7[var16_int] = param0[var16_int].field_g - param1;
            var8[var16_int] = param0[var16_int].field_b + (param1 << 1);
            var9[var16_int] = param0[var16_int].field_a + (param1 << 1);
            array$0 = new byte[var36[var16_int] * var37[var16_int]];
            var11[var16_int] = array$0;
            var17 = array$0;
            var18 = param0[var16_int].field_k;
            var19 = param0[var16_int].field_b;
            var20 = param0[var16_int].field_a;
            var21 = var36[var16_int];
            var22 = -var19 + var21;
            qg.a(new int[var36[var16_int] * var37[var16_int]], var36[var16_int], var37[var16_int]);
            var23 = 0;
            for (var24 = 0; var20 > var24; var24++) {
              for (var25 = 0; var19 > var25; var25++) {
                if (var18[var23++] != 0) {
                  qg.e(param1 + var25, var24 + param1, param1, 2);
                }
              }
            }
            for (var24Lifetime1 = 0; var24Lifetime1 < var17.length; var24Lifetime1++) {
              var17[var24Lifetime1] = (byte)qg.field_i[var24Lifetime1];
            }
            var23Lifetime1 = 0;
            var24Lifetime2 = (var36[var16_int] + 1) * param1;
            for (var25Lifetime1 = 0; var20 > var25Lifetime1; var25Lifetime1++) {
              for (var26 = 0; var26 < var19; var26++) {
                if (var18[var23Lifetime1++] == 0) {
                  var24Lifetime2++;
                } else {
                  incrementValue$2 = var24Lifetime2;
                  var24Lifetime2++;
                  var17[incrementValue$2] = (byte) 1;
                }
              }
              var24Lifetime2 = var24Lifetime2 + var22;
            }
          }
          var16 = new rh(param3, var38, var39, var36, var37, var10, var40);
          var16.field_t = var16.field_t - param1;
          var16.field_K = var16.field_K - param1;
          var16.field_x = var16.field_x - param1;
          qg.a(var45, var13, var14);
          qg.b(var44);
          if (param2 < 24) {
            field_h = -21;
          }
          stackIn_30_0 = var16;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_33_0 = var6_ref;
          stackIn_33_1 = new StringBuilder().append("vh.A(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          CharSequence var3 = (CharSequence) null;
          vh.a((byte) 57, true, 84, (CharSequence) null);
        }
        return this.field_f;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != -44) {
          return;
        }
        field_d = null;
        field_g = null;
    }

    vh(String param0) {
        this.field_f = false;
        this.field_e = false;
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = null;
        field_b = new vi();
        field_a = false;
    }
}
