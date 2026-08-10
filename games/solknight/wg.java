/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static da field_g;
    String field_d;
    boolean field_c;
    String[] field_a;
    boolean field_f;
    int field_b;
    static int field_e;

    final static void a(byte param0) {
        if (param0 != -128) {
            wg.a(false);
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
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
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            StringBuilder stackIn_52_1 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            StringBuilder stackIn_55_1 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                var5 = param4.getFile();
                if (param1 == -7362) {
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5.regionMatches(var6, "/l=", 0, 3)) {
                          var7_int = var5.indexOf('/', var6 + 1);
                          if (0 <= var7_int) {
                            if ((param3 ^ -1) > -1) {
                              break L2;
                            } else {
                              var5 = var5.substring(0, var6) + var5.substring(var7_int);
                              continue L1;
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (var5.regionMatches(var6, "/a=", 0, 3)) {
                          var7_int = var5.indexOf('/', 1 + var6);
                          if (0 <= var7_int) {
                            break L2;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                          break L5;
                        } else {
                          var7_int = var5.indexOf('/', 1 + var6);
                          if (-1 >= (var7_int ^ -1)) {
                            if (param0 == null) {
                              break L2;
                            } else {
                              var5 = var5.substring(0, var6) + var5.substring(var7_int);
                              continue L1;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          if (var5.regionMatches(var6, "/s=", 0, 3)) {
                            break L7;
                          } else {
                            if (var5.regionMatches(var6, "/c=", 0, 3)) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int = var5.indexOf('/', var6 + 1);
                        if (var7_int >= 0) {
                          if (param2 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L6;
                        }
                      }
                      L8: {
                        var7 = new StringBuilder(var6);
                        discarded$0 = var7.append(var5.substring(0, var6));
                        if ((param3 ^ -1) >= -1) {
                          break L8;
                        } else {
                          discarded$1 = var7.append("/l=");
                          discarded$2 = var7.append(Integer.toString(param3));
                          break L8;
                        }
                      }
                      L9: {
                        if (param0 == null) {
                          break L9;
                        } else {
                          if (-1 > (param0.length() ^ -1)) {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param0);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param2 == null) {
                          break L10;
                        } else {
                          if (0 >= param2.length()) {
                            break L10;
                          } else {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param2);
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var5.length() <= var6) {
                          discarded$7 = var7.append('/');
                          break L11;
                        } else {
                          discarded$8 = var7.append(var5.substring(var6, var5.length()));
                          break L11;
                        }
                      }
                      try {
                        L12: {
                          stackIn_44_0 = new java.net.URL(param4, var7.toString());
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_46_0 = (java.net.URL) (param4);
                        return stackIn_46_0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                    var6 = var7_int;
                    continue L1;
                  }
                } else {
                  stackIn_3_0 = (java.net.URL) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_49_0 = (RuntimeException) (var5_ref);

                stackIn_49_1 = new StringBuilder().append("wg.B(");

                if (param0 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "null";
                  break L13;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "null";
                  break L14;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "null";
                  break L15;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "{...}";
                  break L15;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_50_0), stackIn_56_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_44_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od a(byte param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        od stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (l.a(param0 + 62, param3, param2, param1)) {
              L1: {
                if (param0 == 47) {
                  break L1;
                } else {
                  wg.a('￧', (byte) -104);
                  break L1;
                }
              }
              stackIn_6_0 = ea.e((byte) 113);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("wg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (od) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (param1 <= -104) {
            if (!gb.a(param0, 121)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (param0 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            field_e = 70;
            if (!gb.a(param0, 121)) {
              if (param0 != 45) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    wg(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    public static void a(boolean param0) {
        java.net.URL var2;
        if (!param0) {
          var2 = (java.net.URL) null;
          wg.a((String) null, -62, (String) null, -119, (java.net.URL) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    static {
        field_e = -480;
    }
}
