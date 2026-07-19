/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static int field_d;
    static boolean[] field_e;
    static String field_f;
    static tb field_a;
    static String field_c;
    static int[][] field_b;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            return;
        }
        field_b = (int[][]) null;
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(cm param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -48) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = param0.a(25);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("fc.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(mn param0, int param1) {
        try {
            param0.field_F = new char[]{(char)63};
            param0.field_A = new int[]{-1};
            int var2_int = -47 / ((param1 - 27) / 61);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "fc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static pc a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (qj.field_q != null) {
          if (qj.field_q[param1] != null) {
            if (param2 != -1) {
              var3 = 0;
              if (fk.field_i == null) {
                if (null == si.field_A) {
                  var4 = Math.max(64, -(192 * Math.abs(var3) / 1280) + 256);
                  var4 = cm.field_e[param1] * var4 / 256;
                  var5 = Math.max(0, Math.min(256, var3 / 10 + 128));
                  return fg.a(var4, var5, 248, qj.field_q[param1]);
                } else {
                  var3 = -320 + si.field_A.d(true, param2);
                  var4 = Math.max(64, -(192 * Math.abs(var3) / 1280) + 256);
                  var4 = cm.field_e[param1] * var4 / 256;
                  var5 = Math.max(0, Math.min(256, var3 / 10 + 128));
                  return fg.a(var4, var5, 248, qj.field_q[param1]);
                }
              } else {
                var3 = fk.field_i.d(true, param2) + -320;
                var4 = Math.max(64, -(192 * Math.abs(var3) / 1280) + 256);
                var4 = cm.field_e[param1] * var4 / 256;
                var5 = Math.max(0, Math.min(256, var3 / 10 + 128));
                return fg.a(var4, var5, 248, qj.field_q[param1]);
              }
            } else {
              return fl.a((byte) 41, qj.field_q[param1], cm.field_e[param1]);
            }
          } else {
            var3 = -3 % ((param0 - -20) / 47);
            return null;
          }
        } else {
          var3 = -3 % ((param0 - -20) / 47);
          return null;
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, String param3, int param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_43_0 = null;
            java.net.URL stackIn_45_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_42_0 = null;
            java.net.URL stackOut_44_0 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            var9 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  var5_ref = param1.getFile();
                  var6 = 0;
                  if (param0 == -19571) {
                    break L1;
                  } else {
                    fc.a(false);
                    break L1;
                  }
                }
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (var7_int >= 0) {
                          if (-1 < (param4 ^ -1)) {
                            break L3;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L2;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (var7_int < 0) {
                          break L5;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      }
                    }
                    L6: {
                      if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if ((var7_int ^ -1) <= -1) {
                          if (param2 == null) {
                            break L3;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L2;
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L8;
                        } else {
                          if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', var6 - -1);
                      if (var7_int >= 0) {
                        if (param3 != null) {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L2;
                        } else {
                          var6 = var7_int;
                          continue L2;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L9: {
                      var7 = new StringBuilder(var6);
                      discarded$9 = var7.append(var5_ref.substring(0, var6));
                      if (param4 > 0) {
                        discarded$10 = var7.append("/l=");
                        discarded$11 = var7.append(Integer.toString(param4));
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if (-1 > (param2.length() ^ -1)) {
                          discarded$12 = var7.append("/p=");
                          discarded$13 = var7.append(param2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param3 == null) {
                        break L11;
                      } else {
                        if (param3.length() > 0) {
                          discarded$14 = var7.append("/s=");
                          discarded$15 = var7.append(param3);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var6 < var5_ref.length()) {
                        discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L12;
                      } else {
                        discarded$17 = var7.append('/');
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackOut_42_0 = new java.net.URL(param1, var7.toString());
                        stackIn_43_0 = stackOut_42_0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_44_0 = (java.net.URL) (param1);
                      stackIn_45_0 = stackOut_44_0;
                      return stackIn_45_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L2;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_46_0 = (RuntimeException) (var5);
                stackOut_46_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param1 == null) {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L14;
                } else {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L14;
                }
              }
              L15: {
                stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param2 == null) {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L15;
                } else {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L15;
                }
              }
              L16: {
                stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                stackIn_53_0 = stackOut_52_0;
                stackIn_53_1 = stackOut_52_1;
                if (param3 == null) {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "null";
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  break L16;
                } else {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "{...}";
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  break L16;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param4 + ')');
            }
            return stackIn_43_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static e a(byte param0, String[] param1) {
        e var2 = null;
        RuntimeException var2_ref = null;
        mn var3 = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        e stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -76) {
                break L1;
              } else {
                var3 = (mn) null;
                fc.a((mn) null, 110);
                break L1;
              }
            }
            var2 = new e(false);
            var2.field_c = param1;
            stackOut_2_0 = (e) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("fc.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_e = new boolean[112];
        field_f = "Play rated game";
        field_d = 22;
        field_c = "SPACE";
    }
}
