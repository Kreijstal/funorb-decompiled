/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp extends un {
    static cj field_u;
    static int field_r;
    static ja field_s;
    static String[] field_v;
    static cj field_w;
    static String field_t;
    static boolean field_q;

    final re a(boolean param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        re stackIn_2_0 = null;
        re stackIn_7_0 = null;
        re stackIn_10_0 = null;
        re stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!ti.a((byte) 57, var4)) {
            stackIn_2_0 = jq.field_b;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = md.a(var5, -9159);
          if (var3_int > 0 &&
            var3_int <= 130) {
            if (!param0) {
              stackIn_12_0 = db.field_b;
              return stackIn_12_0;
            }
            stackIn_10_0 = (re) null;
            return stackIn_10_0;
          }
          stackIn_7_0 = jq.field_b;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("bp.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(kj param0, boolean param1, int param2) {
        ga var7 = null;
        ga var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7 = ma.field_a;
          var8 = var7;
          var8.b((byte) -35, param2);
          var8.field_j = var8.field_j + 1;
          var4 = var8.field_j;
          var8.a(108, 1);
          var8.a(param0.field_i, (byte) -95);
          var8.a(param0.field_v, (byte) -76);
          var8.a(param0.field_t, (byte) -66);
          var8.b(-116, param0.field_w);
          var8.b(-99, param0.field_x);
          var8.b(122, param0.field_l);
          var8.b(-128, param0.field_k);
          var8.a(-83, param0.field_y.length);
          for (var5 = 0; var5 < param0.field_y.length; var5++) {
            var7.b(52, param0.field_y[var5]);
          }
          if (!param1) {
            field_u = (cj) null;
          }
          var8.f(var4, 118);
          var8.e(77, var8.field_j - var4);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    bp(pm param0) {
        super(param0);
    }

    public static void h(int param0) {
        field_s = null;
        if (param0 != -3) {
          field_q = true;
        }
        field_t = null;
        field_v = null;
        field_w = null;
        field_u = null;
    }

    final static void a(int param0, k param1, go param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          go var15 = null;
          String var16 = null;
          String var17 = null;
          int var18 = 0;
          lp var19 = null;
          byte[][] var20 = null;
          String var21 = null;
          String var22 = null;
          byte[][] var23 = null;
          int var13Lifetime1;
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            var19 = new lp();
            var19.field_n = param1.g(31365);
            var19.field_r = param1.i(param3 - 1478490340);
            var19.field_m = new di[var19.field_n];
            var19.field_o = new byte[var19.field_n][][];
            var19.field_g = new int[var19.field_n];
            var19.field_q = new int[var19.field_n];
            var19.field_l = new di[var19.field_n];
            var19.field_i = new int[var19.field_n];
            for (var5 = 0; var19.field_n > var5; var5++) {
              try {
                var6_int = param1.g(31365);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var21 = param1.f((byte) -32);
                    var22 = param1.f((byte) -55);
                    var9 = param1.g(31365);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param1.f((byte) -8);
                    }
                    var23 = new byte[var9][];
                    var20 = var23;
                    var11 = var20;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param1.i(-1478490344);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.a(0, param3 - 6347, var13, var23[var12_int]);
                      }
                    }
                    var19.field_i[var5] = var6_int;
                    var12 = new Class[var9];
                    var18 = 0;
                    var13Lifetime1 = var18;
                    while (var9 > var18) {
                      var12[var18] = mq.a(var10[var18], (byte) -119);
                      var18++;
                    }
                    var19.field_l[var5] = param2.a(var12, false, mq.a(var21, (byte) -123), var22);
                    var19.field_o[var5] = var23;
                  }
                } else {
                  var17 = param1.f((byte) -43);
                  var7 = var17;
                  var16 = param1.f((byte) -61);
                  var8 = var16;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param1.i(param3 - 1478490340);
                  }
                  var19.field_i[var5] = var6_int;
                  var19.field_q[var5] = var9;
                  var19.field_m[var5] = param2.a((byte) -89, var16, mq.a(var17, (byte) -29));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var19.field_g[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var19.field_g[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var19.field_g[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var19.field_g[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var19.field_g[var5] = -5;
              }
            }
            we.field_k.a(var19, false);
            if (param3 != -4) {
              var15 = (go) null;
              bp.a(-51, (k) null, (go) null, 59);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("bp.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
            if (param2 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(false, param0) == jq.field_b) {
            stackIn_3_0 = ob.field_z;
            return stackIn_3_0;
          }
          if (param1 == -1276425040) {
            return null;
          }
          stackIn_7_0 = (String) null;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bp.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_v = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_u = new cj();
    }
}
