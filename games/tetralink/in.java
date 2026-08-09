/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static hl field_g;
    static int[] field_c;
    static int field_d;
    ah field_b;
    String field_h;
    String field_a;
    String field_e;
    int field_f;

    final static void a(int param0) {
        t.a(4, param0 ^ param0);
    }

    public static void b(int param0) {
        field_c = null;
        field_g = null;
        if (param0 != -1) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            in.a((java.applet.Applet) null, -107);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param0.getDocumentBase().getFile();
                      var4 = var2;
                      var4 = var2;
                      var3 = var2.indexOf((int) (char)param1);
                      var4 = "reload.ws";
                      if (-1 < (var3 ^ -1)) {
                        break L2;
                      } else {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(ai.a(var5, (byte) -112, param0), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("in.C(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              ra.g(param0, param1, param3 - -1, 10000536);
              ra.g(param0, param4 + param1, 1 + param3, 12105912);
              var5_int = 1;
              if (ra.field_i > param1 - -var5_int) {
                var5_int = ra.field_i - param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var6 = param4;
              if (param1 + var6 <= ra.field_g) {
                break L2;
              } else {
                var6 = ra.field_g - param1;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                L4: {
                  if (param2 <= -33) {
                    break L4;
                  } else {
                    field_g = (hl) null;
                    break L4;
                  }
                }
                break L0;
              } else {
                var8 = 48 * var7 / param4 + 152;
                var9 = var8 << -646221016 | var8 << -1200424912 | var8;
                ra.field_b[param0 + (var7 + param1) * ra.field_f] = var9;
                ra.field_b[param0 + ra.field_f * (var7 + param1) - -param3] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "in.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            try {
              L1: {
                if (ie.field_l.startsWith("win")) {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param1.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_7_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    if (param0 == 18) {
                      break L3;
                    } else {
                      in.b(119);
                      break L3;
                    }
                  }
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= param1.length()) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_20_0 = 0;
              return stackIn_20_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref2);

            stackIn_23_1 = new StringBuilder().append("in.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    private in() throws Throwable {
        throw new Error();
    }

    static {
        field_d = 3;
        field_c = new int[]{2, 18, 14, 15, 6, 5, 16, 17, 9};
    }
}
