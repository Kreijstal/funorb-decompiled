/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static ji field_e;
    static ae field_c;
    static rj field_d;
    static boolean field_a;
    static int field_b;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != -44) {
            Object var2 = null;
            ga.a((java.applet.Applet) null, (byte) -46);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var12 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (param1 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = -22 / ((-39 - param2) / 59);
                  var9 = 0;
                  L2: while (true) {
                    if (var7 <= var9) {
                      stackOut_40_0 = var5;
                      stackIn_41_0 = stackOut_40_0;
                      break L0;
                    } else {
                      L3: {
                        var10 = param0.charAt(var9);
                        if (var9 != 0) {
                          break L3;
                        } else {
                          if (var10 != 45) {
                            if (var10 != 43) {
                              break L3;
                            } else {
                              var9++;
                              var9++;
                              continue L2;
                            }
                          } else {
                            var4_int = 1;
                            var9++;
                            var9++;
                            continue L2;
                          }
                        }
                      }
                      L4: {
                        L5: {
                          if (var10 < 48) {
                            break L5;
                          } else {
                            if (var10 > 57) {
                              break L5;
                            } else {
                              var10 -= 48;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (var10 < 65) {
                            break L6;
                          } else {
                            if (var10 <= 90) {
                              var10 -= 55;
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var10 < 97) {
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0 != 0;
                        } else {
                          if (var10 <= 122) {
                            var10 -= 87;
                            break L4;
                          } else {
                            return false;
                          }
                        }
                      }
                      if (~var10 > ~param1) {
                        L7: {
                          if (var4_int != 0) {
                            var10 = -var10;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var11 = var10 + var6 * param1;
                        if (var6 == var11 / param1) {
                          var5 = 1;
                          var6 = var11;
                          var9++;
                          continue L2;
                        } else {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0 != 0;
                        }
                      } else {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        return stackIn_27_0 != 0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("ga.B(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L8;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param1 + 44 + param2 + 44 + 1 + 41);
        }
        return stackIn_41_0 != 0;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
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
                    if (param1 <= -28) {
                      break L1;
                    } else {
                      ga.a(40);
                      break L1;
                    }
                  }
                  L2: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (var3 < 0) {
                      break L2;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(jl.a(-122, var5, param0), "_self");
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
                stackOut_8_1 = new StringBuilder().append("ga.A(");
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
              throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ae();
        field_a = false;
        field_d = new rj(1);
    }
}
