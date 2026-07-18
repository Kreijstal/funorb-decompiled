/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends fb {
    private int field_H;
    static gi[] field_D;
    static int field_I;
    private int field_G;
    private int field_E;
    private int field_F;

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = fm.a(param1, -70);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          if (vi.a(31153, var4.charAt(0))) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0 != 0;
                          } else {
                            if (!vi.a(31153, var4.charAt(var4.length() - 1))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if (0 >= var5) {
                                    stackOut_32_0 = 1;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L0;
                                  } else {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    return stackIn_31_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (!vi.a(31153, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (var5 < 2) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_26_0 = 0;
                                    stackIn_27_0 = stackOut_26_0;
                                    return stackIn_27_0 != 0;
                                  }
                                }
                              }
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("vb.C(").append(0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L5;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + false + ')');
        }
        return stackIn_33_0 != 0;
    }

    final void g(int param0) {
        Object var3 = null;
        L0: {
          if (param0 >= 95) {
            break L0;
          } else {
            var3 = null;
            vb.a((byte) 55, (java.applet.Applet) null);
            break L0;
          }
        }
        L1: {
          int fieldTemp$4 = ((vb) this).field_F;
          ((vb) this).field_F = ((vb) this).field_F + 1;
          if (fieldTemp$4 <= 17) {
            break L1;
          } else {
            ((vb) this).field_F = 0;
            int fieldTemp$5 = ((vb) this).field_G + 1;
            ((vb) this).field_G = ((vb) this).field_G + 1;
            if (2 > fieldTemp$5) {
              break L1;
            } else {
              ((vb) this).field_G = 0;
              break L1;
            }
          }
        }
        L2: {
          L3: {
            ((vb) this).field_E = ((vb) this).field_E + ((vb) this).field_H;
            if (((vb) this).field_E > 160) {
              break L3;
            } else {
              if (((vb) this).field_E >= 80) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((vb) this).field_H = -((vb) this).field_H;
          break L2;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                      param1.getAppletContext().showDocument(rc.a(-1, param1, var2), "_top");
                      if (param0 == 50) {
                        break L2;
                      } else {
                        field_I = 97;
                        break L2;
                      }
                    }
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
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("vb.D(").append(param0).append(',');
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param1 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L4;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L4;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vb(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((vb) this).field_G = 0;
        ((vb) this).field_F = 0;
        ((vb) this).field_E = 96;
        ((vb) this).field_H = 3;
        ((vb) this).d((byte) 126);
    }

    public static void f(byte param0) {
        field_D = null;
        if (param0 > -72) {
            vb.f((byte) 11);
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        vn stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        vn stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        vn stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        vn stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        vn stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.a(((vb) this).a(true), (byte) -97) + -24;
              var4 = -48 + param1.a(((vb) this).f(237239984), 0);
              if (-48 > var3_int) {
                break L1;
              } else {
                if (-48 > var4) {
                  break L1;
                } else {
                  if (qj.field_d < var3_int) {
                    break L1;
                  } else {
                    if (var4 <= me.field_Bb) {
                      L2: {
                        if (param0 < -76) {
                          break L2;
                        } else {
                          var5 = null;
                          ((vb) this).a((byte) 89, (wk) null);
                          break L2;
                        }
                      }
                      L3: {
                        stackOut_8_0 = ad.field_g[((vb) this).field_t][((vb) this).field_G + 32];
                        stackOut_8_1 = 0;
                        stackOut_8_2 = 339;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        if (((vb) this).field_t != 0) {
                          stackOut_10_0 = (vn) (Object) stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = stackIn_10_2;
                          stackOut_10_3 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          stackIn_11_2 = stackOut_10_2;
                          stackIn_11_3 = stackOut_10_3;
                          break L3;
                        } else {
                          stackOut_9_0 = (vn) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = stackIn_9_2;
                          stackOut_9_3 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          stackIn_11_3 = stackOut_9_3;
                          break L3;
                        }
                      }
                      fj.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3 != 0).e(var3_int + -3, var4 - 3, ((vb) this).field_E);
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("vb.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new gi[155];
        field_I = 0;
    }
}
