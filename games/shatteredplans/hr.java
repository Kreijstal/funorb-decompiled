/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hr {
    static String field_c;
    static java.math.BigInteger field_a;
    static String field_d;
    static int[] field_e;
    static String field_f;
    static String field_b;

    public static void a() {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_f = null;
        field_a = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            Object var6 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (var3 < 0) {
                      break L1;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L1;
                    }
                  }
                  L2: {
                    if (param1 <= -83) {
                      break L2;
                    } else {
                      var6 = null;
                      hr.a((java.applet.Applet) null, (byte) -44);
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(jg.a(param0, false, var5), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var2_ref2;
                stackOut_8_1 = new StringBuilder().append("hr.A(");
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
                  break L3;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param4 + 495 + param2 + 8;
              ad.field_c.a(var6_int + -6, -6 + tg.field_c.field_mb, (byte) 82, 3, 3);
              var7 = ad.field_c.field_mb - 5;
              hi.field_o.a(487 + (param2 - -param4), param1, (byte) 69, -param1 + var7, 5);
              uq.field_j.a(-cg.field_C.field_K + -param2 + hi.field_o.field_K, param1, (byte) 116, 0, param2);
              var7 = var7 - (param1 + 2);
              cg.field_C.a(cg.field_C.field_K, param1, (byte) 95, 0, param2 + uq.field_j.field_K);
              ji.field_I.a(485 + param2 - (-2 - param4), 5, 5, 2, -123, -5 + var7, param4);
              if (wi.field_c == null) {
                break L1;
              } else {
                wi.field_c.a(ji.field_I.field_db, ji.field_I.field_mb, (byte) 117, ji.field_I.field_hb, ji.field_I.field_K);
                break L1;
              }
            }
            var8 = -var6_int + -param2 + tg.field_c.field_K;
            var9 = var8 / 2;
            var10 = param2 + (param0 + var9);
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              if (var12 >= 6) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (var12 >= 5) {
                      break L4;
                    } else {
                      if (null != oq.field_b[var12]) {
                        break L4;
                      } else {
                        var12++;
                        break L3;
                      }
                    }
                  }
                  var13 = (-4 + tg.field_c.field_mb) * var11 / (gq.field_d + 1) + 3;
                  var11++;
                  var7 = -var13 + var11 * (-4 + tg.field_c.field_mb) / (1 + gq.field_d) + 1;
                  if (5 <= var12) {
                    pr.field_c.a(var8, var7, (byte) 46, var13, var6_int);
                    var12++;
                    break L3;
                  } else {
                    oq.field_b[var12].a(var8, var7, (byte) 115, var13, var6_int);
                    tb.field_a[var12].a(var9 - param2, var7, (byte) 118, 0, param2);
                    mr.field_d[var12].a(param0, -param5 + var7 - param5, (byte) 122, param5, var9);
                    n.field_n[var12].a(var8 - param2 + -var10, var7 + -param5 - param5, (byte) 52, param5, var10);
                    var12++;
                    break L3;
                  }
                }
                var12++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var6, "hr.B(" + param0 + ',' + param1 + ',' + param2 + ',' + 113 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = new java.math.BigInteger("65537");
        field_d = "Turns remaining: <%0>";
        field_f = "Please enter your age in years";
        field_e = new int[]{2, 21, 22, 7, 6, 13, 14};
    }
}
