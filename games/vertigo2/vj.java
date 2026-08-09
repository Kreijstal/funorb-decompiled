/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static er[] field_b;
    static nj field_d;
    static int field_c;
    static int[] field_f;
    static boolean field_h;
    static String field_a;
    static String field_e;
    static fe[] field_g;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Vertigo2.field_L ? 1 : 0;
        if (param0 <= param9) {
          if (param9 >= param15) {
            if (param0 >= param15) {
              pq.a(param10, param14, param11, param9, param7, param12, param2, param15, param5, param3, param13, param6, param8, bi.field_l, true, param4, param0);
              if (param1 == -122) {
                return;
              } else {
                field_d = (nj) null;
                return;
              }
            } else {
              pq.a(param14, param10, param8, param9, param7, param3, param4, param0, param5, param12, param13, param6, param11, bi.field_l, true, param2, param15);
              if (param1 == -122) {
                return;
              } else {
                field_d = (nj) null;
                return;
              }
            }
          } else {
            pq.a(param14, param6, param8, param15, param12, param3, param13, param0, param11, param7, param4, param10, param5, bi.field_l, true, param2, param9);
            if (param1 == -122) {
              return;
            } else {
              field_d = (nj) null;
              return;
            }
          }
        } else {
          if (param15 > param0) {
            pq.a(param6, param14, param5, param15, param12, param7, param2, param9, param11, param3, param4, param10, param8, bi.field_l, true, param13, param0);
            if (param1 == -122) {
              return;
            } else {
              field_d = (nj) null;
              return;
            }
          } else {
            if (param15 <= param9) {
              pq.a(param10, param6, param11, param0, param3, param12, param13, param15, param8, param7, param2, param14, param5, bi.field_l, true, param4, param9);
              if (param1 == -122) {
                return;
              } else {
                field_d = (nj) null;
                return;
              }
            } else {
              pq.a(param6, param10, param5, param0, param3, param7, param4, param9, param8, param12, param2, param14, param11, bi.field_l, true, param13, param15);
              if (param1 == -122) {
                return;
              } else {
                field_d = (nj) null;
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        CharSequence var2;
        field_b = null;
        field_a = null;
        field_g = null;
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 == -11590) {
          return;
        } else {
          var2 = (CharSequence) null;
          vj.a((CharSequence) null, (byte) 1);
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 8) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                vj.a((CharSequence) null, (byte) -56);
                break L1;
              }
            }
            L2: {
              var2 = eq.a(0, kq.a((byte) 85, param0));
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackIn_5_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("vj.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static java.net.URL a(int param0, String param1, int param2, String param3, java.net.URL param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_3_0 = null;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            StringBuilder stackIn_53_1 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                var5 = param4.getFile();
                var6 = 0;
                if (param2 <= -112) {
                  L1: while (true) {
                    L2: {
                      if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                        break L2;
                      } else {
                        var7_int = var5.indexOf('/', var6 + 1);
                        if (0 > var7_int) {
                          break L2;
                        } else {
                          if (-1 < (param0 ^ -1)) {
                            var6 = var7_int;
                            continue L1;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        }
                      }
                    }
                    L3: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (var7_int < 0) {
                          break L3;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                        break L4;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 <= var7_int) {
                          if (param3 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L6;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (-1 >= (var7_int ^ -1)) {
                        if (param1 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (-1 <= (param0 ^ -1)) {
                        break L7;
                      } else {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param0));
                        break L7;
                      }
                    }
                    L8: {
                      if (param3 == null) {
                        break L8;
                      } else {
                        if (-1 > (param3.length() ^ -1)) {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param3);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param1 == null) {
                        break L9;
                      } else {
                        if (0 >= param1.length()) {
                          break L9;
                        } else {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param1);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var6 < var5.length()) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L10;
                      } else {
                        discarded$8 = var7.append('/');
                        break L10;
                      }
                    }
                    try {
                      L11: {
                        stackIn_42_0 = new java.net.URL(param4, var7.toString());
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_44_0 = (java.net.URL) (param4);
                      return stackIn_44_0;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = (java.net.URL) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_47_0 = (RuntimeException) (var5_ref);

                stackIn_47_1 = new StringBuilder().append("vj.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L12;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L12;
                }
              }
              L13: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L13;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

                if (param4 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "null";
                  break L14;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "{...}";
                  break L14;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_48_0), stackIn_54_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_42_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -32) {
              L1: {
                if (null != vd.field_b) {
                  vd.field_b.field_V.a(param1, -1546);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (null != lj.field_m) {
                lj.field_m.field_K.a(param1, -1546);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("vj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_e = "Send private message";
        field_a = "Waiting for extra data";
    }
}
