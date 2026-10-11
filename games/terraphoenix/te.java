/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class te {
    int field_b;
    static String field_e;
    int field_f;
    static String[] field_a;
    int[] field_c;
    java.awt.Image field_d;
    static kf field_g;

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        uc var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        eg var11 = null;
        uc var12 = null;
        ok var13 = null;
        int[] var14 = null;
        ok var15 = null;
        int[] var16 = null;
        var8 = Terraphoenix.field_V;
        try {
          var12 = mk.field_j;
          if (param0 != 67) {
            field_e = (String) null;
          }
          var2 = var12.a(-16384);
          if (0 == var2) {
            var10 = a.b(3922);
            var16 = var10;
            var14 = var16;
            var3 = var14;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((dh) ((Object) var5)).a(-16384);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((dh) ((Object) var5)).f((byte) -107);
            }
            var15 = (ok) (vc.field_g.d(9272));
            if (var15 == null) {
              gb.g(-17464);
              return;
            }
            var15.field_l = var3;
            var15.field_m = var16[0];
            var15.field_k = true;
            var15.b((byte) 12);
            return;
          }
          if (var2 == 1) {
            var11 = (eg) (ic.field_s.d(9272));
            if (var11 == null) {
              gb.g(-17464);
              return;
            }
            var11.b((byte) 12);
          } else {
            if (var2 != 2) {
              bd.a((Throwable) null, "A1: " + r.i(-15465), -87);
              gb.g(-17464);
            } else {
              var13 = (ok) (vc.field_g.d(9272));
              if (var13 == null) {
                gb.g(param0 - 17531);
                return;
              }
              var13.field_l = a.b(3922);
              var13.field_k = true;
              var13.field_m = var13.field_l[0];
              var13.b((byte) 12);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "te.A(" + param0 + ')');
        }
    }

    final static void a(long param0, int param1) {
        try {
          try {
            Thread.sleep(param0);
          } catch (InterruptedException interruptedException) {
          }
          if (param1 != 0) {
            te.b((byte) -85);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = bk.a((byte) 120, true, 10, param0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("te.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        CharSequence var24 = null;
        int var25 = 0;
        int var7_intLifetime1;
        int var10Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        var23 = Terraphoenix.field_V;
        try {
          var9 = param3;
          param3 = param3 - param4;
          if (param1 == 0) {
            l.a(param2, param3, param5);
            return;
          }
          if (0 > param1) {
            param1 = -param1;
          }
          var11 = -param1 + param3;
          if (l.field_d > var11) {
            var11 = l.field_d;
          }
          var12 = param3 + param1 + 1;
          if (var12 > l.field_c) {
            var12 = l.field_c;
          }
          var13 = var11;
          var14 = param1 * param1;
          var15 = 0;
          var16 = -var13 + param3;
          var17 = var16 * var16;
          var8 = var13;
          var18 = -var16 + var17;
          if (var12 < param3) {
            param3 = var12;
          }
          while (var13 < param3) {
            {
              while ((!(var18 > var14) ||
                !(var17 > var14))) {
                var17 = var17 + (var15 + var15);
                incrementValue$5 = var15;
                var15++;
                var18 = var18 + (incrementValue$5 + var15);
              }
              {
                var19 = param2 - var15 + 1;
                if (var19 < l.field_b) {
                  var19 = l.field_b;
                }
                var20 = param2 + var15;
                if (l.field_f < var20) {
                  var20 = l.field_f;
                }
                var7_int = var19;
                var21 = l.field_k * var13 + var19;
                for (var22 = var19; var20 > var22; var22++) {
                  var10 = (int)((double)var9 + Math.sqrt((double)(-((-param3 + var8) * (var8 - param3)) - (var7_int - param2) * (var7_int - param2) + param1 * param1)));
                  if (var10 >= gd.field_a[var7_int][var8]) {
                    if (param6) {
                      gd.field_a[var7_int][var8] = var10;
                    }
                    incrementValue$4 = var21;
                    var21++;
                    l.field_i[incrementValue$4] = param5;
                  } else {
                    var21++;
                  }
                  var7_int++;
                }
                var13++;
                var8++;
                incrementValue$3 = var16;
                var16--;
                var17 = var17 - (incrementValue$3 + var16);
                var18 = var18 - (var16 + var16);
              }
            }
          }
          var15Lifetime1 = param1;
          var16Lifetime1 = -param3 + var13;
          if (param0 != 99) {
            var24 = (CharSequence) null;
            te.a((CharSequence) null, false);
          }
          var18Lifetime1 = var16Lifetime1 * var16Lifetime1 + var14;
          var17Lifetime1 = var18Lifetime1 - var15Lifetime1;
          var18Lifetime1 = var18Lifetime1 - var16Lifetime1;
          while (var12 > var13) {
            while (var14 < var18Lifetime1) {
              if (var14 < var17Lifetime1) {
                incrementValue$0 = var15Lifetime1;
                var15Lifetime1--;
                var18Lifetime1 = var18Lifetime1 - (incrementValue$0 + var15Lifetime1);
                var17Lifetime1 = var17Lifetime1 - (var15Lifetime1 + var15Lifetime1);
                continue;
              }
              break;
            }
            var19Lifetime1 = -var15Lifetime1 + param2;
            if (var19Lifetime1 < l.field_b) {
              var19Lifetime1 = l.field_b;
            }
            var20Lifetime1 = var15Lifetime1 + param2;
            if (l.field_f - 1 < var20Lifetime1) {
              var20Lifetime1 = l.field_f - 1;
            }
            var21Lifetime1 = var13 * l.field_k + var19Lifetime1;
            var25 = var19Lifetime1;
            var7_intLifetime1 = var25;
            for (var22Lifetime1 = var19Lifetime1; var20Lifetime1 > var22Lifetime1; var22Lifetime1++) {
              var10Lifetime1 = (int)(Math.sqrt((double)(-((-param2 + var25) * (var25 - param2)) - (-param3 + var8) * (-param3 + var8) + param1 * param1)) + (double)var9);
              if (gd.field_a[var25][var8] <= var10Lifetime1) {
                if (param6) {
                  gd.field_a[var25][var8] = var10Lifetime1;
                }
                incrementValue$2 = var21Lifetime1;
                var21Lifetime1++;
                l.field_i[incrementValue$2] = param5;
              } else {
                var21Lifetime1++;
              }
              var25++;
            }
            var18Lifetime1 = var18Lifetime1 + (var16Lifetime1 + var16Lifetime1);
            var13++;
            var8++;
            incrementValue$1 = var16Lifetime1;
            var16Lifetime1++;
            var17Lifetime1 = var17Lifetime1 + (incrementValue$1 + var16Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var7), "te.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0) {
        if (param0 != 0) {
          return;
        }
        l.a(this.field_c, this.field_b, this.field_f);
    }

    abstract void a(int param0, int param1, byte param2, java.awt.Component param3);

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 > -51) {
          return;
        }
        field_g = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    static {
        field_e = "Close";
        field_g = new kf("email");
    }
}
