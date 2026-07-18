/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static he[] field_d;
    static fi field_e;
    static nh field_b;
    static he field_c;
    static he[] field_a;
    static int[] field_g;
    static int field_f;

    final static vj a(int param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        vj stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        vj stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 3) {
              stackOut_3_0 = na.a(true, param1, false, false, true, 1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "al.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static na a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            na var5 = null;
            fa var5_ref = null;
            int var6 = 0;
            na stackIn_1_0 = null;
            fa stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            na stackOut_0_0 = null;
            fa stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var6 = -16 / ((param0 - 42) / 58);
                var4 = Class.forName("rj");
                var5 = (na) var4.newInstance();
                var5.a(param1, param3, (byte) -49, param2);
                stackOut_0_0 = (na) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new fa();
                ((na) (Object) var5_ref).a(param1, param3, (byte) -35, param2);
                stackOut_2_0 = (fa) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (na) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("al.F(").append(param0).append(',').append(param1).append(',');
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param2 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_8_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              if (!param0) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            field_a = null;
            field_g = null;
            field_e = null;
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "al.E(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              if (2 == gf.field_b) {
                stackOut_3_0 = 23;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 24;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var1_int = stackIn_4_0;
              ul.field_j[3] = new int[2];
              var2 = th.field_a[3].field_e.field_f;
              th.field_a[3] = new ld(3);
              if (param0 < -24) {
                break L2;
              } else {
                field_f = 16;
                break L2;
              }
            }
            th.field_a[3].field_e.field_f = var2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "al.D(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = "(" + l.field_q + " " + gg.field_l + " " + ek.field_h + ") " + t.field_b;
              if (param0 <= -43) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (gf.field_C > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (var2 >= gf.field_C) {
                      break L3;
                    } else {
                      stackOut_9_0 = var1_ref + ' ';
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_10_0;
                            var3 = dh.field_N.field_h[var2] & 255;
                            var4 = var3 >> 1432982212;
                            if (var4 < 10) {
                              break L6;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 48;
                          break L5;
                        }
                        L7: {
                          L8: {
                            var3 = var3 & 15;
                            var1_ref = var1_ref + (char)var4;
                            if (var3 >= 10) {
                              break L8;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 55;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_23_0 = (String) var1_ref;
              stackIn_24_0 = stackOut_23_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "al.B(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                if (param1 >= 56) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                      param0.getAppletContext().showDocument(kk.a(var2, param0, 4767999), "_top");
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var2_ref.printStackTrace();
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("al.C(");
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_10_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
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
        field_a = new he[4];
        field_g = new int[20];
    }
}
