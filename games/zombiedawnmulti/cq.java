/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static String field_b;
    static String field_d;
    static int field_f;
    static String field_a;
    static String[] field_e;
    static int[] field_c;

    final static boolean a(int param0) {
        q.field_e = true;
        dl.field_e = bl.a((byte) 115) + (long)param0;
        return -12 == (a.field_b ^ -1) ? true : false;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
        int var1 = -92 % ((param0 - -1) / 54);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            java.applet.AppletContext stackIn_3_0 = null;
            java.applet.AppletContext stackIn_3_1 = null;
            java.applet.AppletContext stackIn_4_0 = null;
            java.applet.AppletContext stackIn_4_1 = null;
            java.applet.AppletContext stackIn_5_0 = null;
            java.applet.AppletContext stackIn_5_1 = null;
            int stackIn_5_2 = 0;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            java.applet.AppletContext stackOut_2_0 = null;
            java.applet.AppletContext stackOut_2_1 = null;
            java.applet.AppletContext stackOut_4_0 = null;
            java.applet.AppletContext stackOut_4_1 = null;
            int stackOut_4_2 = 0;
            java.applet.AppletContext stackOut_3_0 = null;
            java.applet.AppletContext stackOut_3_1 = null;
            int stackOut_3_2 = 0;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    if (!param1) {
                      break L1;
                    } else {
                      field_c = (int[]) null;
                      break L1;
                    }
                  }
                  L2: {
                    var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                    stackOut_2_0 = param0.getAppletContext();
                    stackOut_2_1 = (java.applet.AppletContext) ((Object) param0);
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    if (param1) {
                      stackOut_4_0 = (java.applet.AppletContext) ((Object) stackIn_4_0);
                      stackOut_4_1 = (java.applet.AppletContext) ((Object) stackIn_4_1);
                      stackOut_4_2 = 0;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      break L2;
                    } else {
                      stackOut_3_0 = (java.applet.AppletContext) ((Object) stackIn_3_0);
                      stackOut_3_1 = (java.applet.AppletContext) ((Object) stackIn_3_1);
                      stackOut_3_2 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      break L2;
                    }
                  }
                  ((java.applet.AppletContext) (Object) stackIn_5_0).showDocument(gf.a((java.applet.Applet) ((Object) stackIn_5_1), stackIn_5_2 != 0, var2), "_top");
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
                stackOut_9_0 = (RuntimeException) (var2_ref2);
                stackOut_9_1 = new StringBuilder().append("cq.A(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 <= -117) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            if (sq.field_N) {
              L2: {
                if ((va.field_a ^ -1) != -3) {
                  break L2;
                } else {
                  if (null == ql.field_a) {
                    break L2;
                  } else {
                    var3 = (CharSequence) ((Object) param0);
                    if (ql.field_a.equals(tg.a(var3, false))) {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("cq.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static long a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        long stackIn_20_0 = 0L;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        long stackOut_19_0 = 0L;
        int stackOut_17_0 = 0;
        long stackOut_22_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_long = (long)param0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var4 <= var5) {
                      break L4;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      stackOut_3_0 = -66;
                      stackIn_18_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var7 != 0) {
                        L5: while (true) {
                          if (stackIn_18_0 != 0) {
                            break L3;
                          } else {
                            stackOut_19_0 = var2_long ^ -1L;
                            stackIn_23_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var7 != 0) {
                              break L2;
                            } else {
                              if (stackIn_20_0 == -1L) {
                                break L3;
                              } else {
                                var2_long = var2_long / 37L;
                                if (var7 == 0) {
                                  stackOut_17_0 = (0L < var2_long % 37L ? -1 : (0L == var2_long % 37L ? 0 : 1));
                                  stackIn_18_0 = stackOut_17_0;
                                  continue L5;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_4_0 < (var6 ^ -1)) {
                              break L7;
                            } else {
                              if (var6 > 90) {
                                break L7;
                              } else {
                                var2_long = var2_long + (long)(-65 + (1 + var6));
                                if (var7 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L8: {
                            L9: {
                              if (97 > var6) {
                                break L9;
                              } else {
                                if (var6 <= 122) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (var6 < 48) {
                              break L6;
                            } else {
                              if (var6 > 57) {
                                break L6;
                              } else {
                                var2_long = var2_long + (long)(-21 - -var6);
                                if (var7 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          var2_long = var2_long + (long)(-97 + (1 - -var6));
                          break L6;
                        }
                        if (-177917621779460414L >= (var2_long ^ -1L)) {
                          break L4;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  }
                  L10: while (true) {
                    stackOut_17_0 = (0L < var2_long % 37L ? -1 : (0L == var2_long % 37L ? 0 : 1));
                    stackIn_18_0 = stackOut_17_0;
                    if (stackIn_18_0 != 0) {
                      break L3;
                    } else {
                      stackOut_19_0 = var2_long ^ -1L;
                      stackIn_23_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (stackIn_20_0 == -1L) {
                          break L3;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L10;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_22_0 = var2_long;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("cq.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    static {
        field_b = "Imposed";
        ja discarded$0 = new ja(48, 48);
        field_d = "Confirm Email:";
        field_e = new String[16];
        field_f = 2;
        field_c = new int[]{38};
        field_a = "to keep fullscreen or";
    }
}
