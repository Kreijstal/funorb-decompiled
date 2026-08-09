/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv {
    static String field_a;
    static int[] field_b;

    final static java.net.URL a(String param0, String param1, int param2, int param3, java.net.URL param4) {
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
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            StringBuilder stackIn_48_1 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            StringBuilder stackIn_51_1 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                var5 = param4.getFile();
                var6 = param2;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          if (0 > param3) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 > var7_int) {
                          break L4;
                        } else {
                          break L2;
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
                        if (0 > var7_int) {
                          break L5;
                        } else {
                          if (param0 == null) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        if (param1 == null) {
                          break L2;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if ((param3 ^ -1) < -1) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param3));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if (param0.length() <= 0) {
                          break L9;
                        } else {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param0);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param1 == null) {
                        break L10;
                      } else {
                        if (param1.length() > 0) {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param1);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var6 >= var5.length()) {
                        discarded$7 = var7.append('/');
                        break L11;
                      } else {
                        discarded$8 = var7.append(var5.substring(var6, var5.length()));
                        break L11;
                      }
                    }
                    try {
                      L12: {
                        stackIn_40_0 = new java.net.URL(param4, var7.toString());
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_42_0 = (java.net.URL) (param4);
                      return stackIn_42_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_45_0 = (RuntimeException) (var5_ref);

                stackIn_45_1 = new StringBuilder().append("rv.A(");

                if (param0 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "null";
                  break L13;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

                if (param1 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "null";
                  break L14;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "null";
                  break L15;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "{...}";
                  break L15;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_46_0), stackIn_52_2 + ')');
            }
            return stackIn_40_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = (String) null;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4_int = 0;
        vb var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (gs.field_a) {
                L3: {
                  if (null == ro.field_lb) {
                    break L3;
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (var4_int >= ro.field_lb.length) {
                        break L3;
                      } else {
                        L5: {
                          if ((param3 ^ -1) != (ro.field_lb[var4_int] ^ -1)) {
                            break L5;
                          } else {
                            hh.field_d.d(param2, param1, 80, 40, (int)(64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) + 128.0));
                            break L5;
                          }
                        }
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                vv.a(param2, -96, false, param3, us.a(param3, (byte) 87), param1);
                var4 = (vb) ((Object) jf.field_C.field_pc.e((byte) 125));
                L6: while (true) {
                  if (var4 == null) {
                    break L2;
                  } else {
                    L7: {
                      if (param3 != var4.field_x) {
                        break L7;
                      } else {
                        var4.a(ug.field_b, 31785, true);
                        break L7;
                      }
                    }
                    var4 = (vb) ((Object) jf.field_C.field_pc.a((byte) 123));
                    continue L6;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4_ref), "rv.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "FROM ONLY";
    }
}
