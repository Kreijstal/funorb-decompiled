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
        if (param0 != 3) {
            return null;
        }
        return na.a(true, param1, false, false, true, 1);
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
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            na stackOut_0_0 = null;
            fa stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
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
                stackOut_4_1 = new StringBuilder().append("al.F(").append(param0).append(44).append(param1).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param2 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          field_e = null;
          field_a = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (2 == gf.field_b) {
            stackOut_2_0 = 23;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 24;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var1 = stackIn_3_0;
        ul.field_j[3] = new int[2];
        var2 = th.field_a[3].field_e.field_f;
        th.field_a[3] = new ld(3);
        if (param0 >= -24) {
          field_f = 16;
          th.field_a[3].field_e.field_f = var2;
          return;
        } else {
          th.field_a[3].field_e.field_f = var2;
          return;
        }
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_33_0 = null;
        String stackOut_22_0 = null;
        String stackOut_32_0 = null;
        String stackOut_7_0 = null;
        String stackOut_17_0 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var1 = "(" + l.field_q + " " + gg.field_l + " " + ek.field_h + ") " + t.field_b;
        if (param0 <= -43) {
          if (gf.field_C <= 0) {
            return var1;
          } else {
            var1 = var1 + ":";
            var2 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 >= gf.field_C) {
                    break L2;
                  } else {
                    stackOut_22_0 = var1 + 32;
                    stackIn_33_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          var1 = stackIn_23_0;
                          var3 = dh.field_N.field_h[var2] & 255;
                          var4 = var3 >> 4;
                          if (var4 < 10) {
                            break L4;
                          } else {
                            var4 += 55;
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4 += 48;
                        break L3;
                      }
                      L5: {
                        L6: {
                          var3 = var3 & 15;
                          var1 = var1 + (char)var4;
                          if (var3 >= 10) {
                            break L6;
                          } else {
                            var3 += 48;
                            if (var5 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var3 += 55;
                        break L5;
                      }
                      var1 = var1 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_32_0 = (String) var1;
                stackIn_33_0 = stackOut_32_0;
                break L1;
              }
              return stackIn_33_0;
            }
          }
        } else {
          L7: {
            L8: {
              field_d = null;
              if (gf.field_C > 0) {
                var1 = var1 + ":";
                var2 = 0;
                L9: while (true) {
                  if (var2 < gf.field_C) {
                    stackOut_7_0 = var1 + 32;
                    stackIn_18_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var5 != 0) {
                      break L7;
                    } else {
                      L10: {
                        L11: {
                          var1 = stackIn_8_0;
                          var3 = dh.field_N.field_h[var2] & 255;
                          var4 = var3 >> 4;
                          if (var4 < 10) {
                            break L11;
                          } else {
                            var4 += 55;
                            if (var5 == 0) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var4 += 48;
                        break L10;
                      }
                      L12: {
                        L13: {
                          var3 = var3 & 15;
                          var1 = var1 + (char)var4;
                          if (var3 >= 10) {
                            break L13;
                          } else {
                            var3 += 48;
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        var3 += 55;
                        break L12;
                      }
                      var1 = var1 + (char)var3;
                      var2++;
                      if (var5 == 0) {
                        continue L9;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    return var1;
                  }
                }
              } else {
                break L8;
              }
            }
            stackOut_17_0 = (String) var1;
            stackIn_18_0 = stackOut_17_0;
            break L7;
          }
          return stackIn_18_0;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
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
              if (param1 >= 56) {
                try {
                  L0: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(kk.a(var2, param0, 4767999), "_top");
                    break L0;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("al.C(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
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
