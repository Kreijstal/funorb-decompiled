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
            java.applet.AppletContext stackIn_4_0 = null;
            java.applet.AppletContext stackIn_4_1 = null;
            java.applet.AppletContext stackIn_5_0 = null;
            java.applet.AppletContext stackIn_5_1 = null;
            int stackIn_5_2 = 0;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
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
                    stackIn_4_0 = param0.getAppletContext();

                    stackIn_4_1 = (java.applet.AppletContext) ((Object) param0);

                    if (param1) {
                      stackIn_5_0 = (java.applet.AppletContext) ((Object) stackIn_4_0);
                      stackIn_5_1 = (java.applet.AppletContext) ((Object) stackIn_4_1);
                      stackIn_5_2 = 0;
                      break L2;
                    } else {
                      stackIn_5_0 = (java.applet.AppletContext) ((Object) stackIn_4_0);
                      stackIn_5_1 = (java.applet.AppletContext) ((Object) stackIn_4_1);
                      stackIn_5_2 = 1;
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
                stackIn_11_0 = (RuntimeException) (var2_ref2);

                stackIn_11_1 = new StringBuilder().append("cq.A(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                      stackIn_12_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return false;
                    }
                  }
                }
              }
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("cq.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
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
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_20_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_long = (long)param0;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var4 <= var5) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L4;
                      } else {
                        if (var6 > 90) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(-65 + (1 + var6));
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (97 > var6) {
                        break L5;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(-97 + (1 - -var6));
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (var6 > 57) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(-21 - -var6);
                        break L3;
                      }
                    }
                  }
                  if (-177917621779460414L >= (var2_long ^ -1L)) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (0L != var2_long % 37L) {
                    break L7;
                  } else {
                    if ((var2_long ^ -1L) == -1L) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackIn_20_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("cq.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
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
