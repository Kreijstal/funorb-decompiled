/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static Object field_b;
    static ts field_a;
    private fk field_d;
    static int[] field_c;

    final static void a(int param0) {
        if (param0 != 4) {
          ic.a(7);
          jk.field_b.field_d = 0;
          jk.field_b.field_j = 0;
          return;
        } else {
          jk.field_b.field_d = 0;
          jk.field_b.field_j = 0;
          return;
        }
    }

    final void a(fr param0, boolean param1) {
        try {
            if (param1) {
                field_b = null;
            }
            ((ic) this).field_d = param0.a(24, true, (byte) -23, 196584, (byte[]) null);
            jq discarded$0 = new jq(((ic) this).field_d, 5126, 2, 0);
            jq discarded$1 = new jq(((ic) this).field_d, 5126, 3, 8);
            jq discarded$2 = new jq(((ic) this).field_d, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ic.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void b(int param0) {
        int var1 = 0;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static int b(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        if (param0 < 4096) {
          L0: {
            if (param0 >= 2048) {
              stackOut_7_0 = ce.field_p[-param0 + 4096];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ce.field_p[param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 >= 6144) {
              stackOut_3_0 = -ce.field_p[8192 - param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -ce.field_p[-4096 + param0];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 <= var6_int) {
                var5 = var6_int + 2;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!ea.a((byte) -54, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int + 2, var5);
                  if (jf.a(-13181, (CharSequence) (Object) var7_ref_String)) {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = no.a((byte) -127, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (-var5 + var6_int + param1[var8].length());
                        continue L1;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var5 = 0;
                var7 = 0;
                L4: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (var8 < 0) {
                    StringBuilder discarded$3 = var6.append(param0.substring(var7));
                    stackOut_25_0 = var6.toString();
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    var5 = var8 - -2;
                    L5: while (true) {
                      L6: {
                        if (var3_int <= var5) {
                          break L6;
                        } else {
                          if (!ea.a((byte) -54, param0.charAt(var5))) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (jf.a(-13181, (CharSequence) (Object) var9)) {
                        if (var3_int <= var5) {
                          continue L4;
                        } else {
                          if (param0.charAt(var5) != 62) {
                            continue L4;
                          } else {
                            var5++;
                            var10 = no.a((byte) -128, (CharSequence) (Object) var9);
                            StringBuilder discarded$4 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            StringBuilder discarded$5 = var6.append(param1[var10]);
                            continue L4;
                          }
                        }
                      } else {
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("ic.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + -128 + 41);
        }
        return stackIn_26_0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            Exception var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    param1.getAppletContext().showDocument(td.a((byte) 126, param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (!param0) {
                  break L0;
                } else {
                  ic.a(111);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("ic.E(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ic() {
        cw discarded$0 = new cw(786336);
        int discarded$1 = mr.a(1600, (byte) -115);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ts(14, 0, 4, 1);
    }
}
