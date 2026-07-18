/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static boolean field_g;
    static String field_f;
    static String[] field_c;
    static co field_e;
    static String field_d;
    static char[] field_b;
    static boolean field_a;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        kj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        cf var12 = null;
        hl var13 = null;
        kj var14 = null;
        hl var15 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var14 = rf.field_d;
              var2 = var14.f((byte) -117);
              if (var2 != 0) {
                if (1 != var2) {
                  if (var2 != 2) {
                    int discarded$1 = 94;
                    sj.a("A1: " + ci.a(), -50, (Throwable) null);
                    pm.m(121);
                    break L1;
                  } else {
                    var15 = (hl) (Object) ic.field_D.e(13058);
                    if (var15 == null) {
                      pm.m(param0 ^ 117);
                      return;
                    } else {
                      var15.field_s = jg.a(true);
                      var15.field_t = true;
                      var15.b(4);
                      break L1;
                    }
                  }
                } else {
                  var12 = (cf) (Object) jb.field_A.e(13058);
                  if (var12 == null) {
                    pm.m(-22);
                    return;
                  } else {
                    var12.b(4);
                    break L1;
                  }
                }
              } else {
                var11 = jg.a(true);
                var3 = var11;
                var10 = var11;
                var4 = var10;
                var5 = var14;
                var6 = ((gi) (Object) var5).f((byte) -121);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var13 = (hl) (Object) ic.field_D.e(param0 ^ 13058);
                    if (var13 != null) {
                      var13.field_t = true;
                      var13.field_s = var3;
                      var13.b(4);
                      break L1;
                    } else {
                      pm.m(-116);
                      return;
                    }
                  } else {
                    var10[var7] = ((gi) (Object) var5).i(0);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                cd.a(-37);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "cd.A(" + param0 + ')');
        }
    }

    final static String a(gi param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        Exception var4 = null;
        byte[] var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          var3_int = 22;
          try {
            L0: {
              L1: {
                var4_int = param0.b(false);
                if (var4_int > 80) {
                  var4_int = 80;
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = new byte[var4_int];
              param0.field_p = param0.field_p + ob.field_r.a(var5, var4_int, 4408131, 0, param0.field_t, param0.field_p);
              var6 = ub.a((byte) 37, 0, var5, var4_int);
              stackOut_4_0 = (String) var6;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4 = (Exception) (Object) decompiledCaughtException;
            stackOut_6_0 = "Cabbage";
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("cd.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 80 + ',' + -100 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
        field_e = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Golem", "Slave", "Aquila", "Turtle", "Commando", "Hurricane", "Scorpion", "Crusher", "Bertha", "Orbital", "Valhalla", "Babel"};
        field_d = "to return to the normal view.";
        field_b = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_f = "Ask to join <%0>'s game";
    }
}
