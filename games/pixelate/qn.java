/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends fa {
    static fm field_l;
    static int field_k;
    static String field_m;
    static int field_p;
    static jk[] field_q;
    static String field_n;
    byte[] field_r;
    static int field_o;

    final static int e(int param0) {
        ck.field_j.b((byte) -2);
        if (param0 != 59) {
            qn.a(-63);
        }
        if (pm.field_h.a(false)) {
            return 0;
        }
        return ph.e(param0 + 25901);
    }

    public static void a(int param0) {
        field_n = null;
        field_m = null;
        if (param0 != -1) {
            qn.e(52);
        }
        field_q = null;
        field_l = null;
    }

    final static String a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_20_1 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (cq.a("getcookies", (byte) -114, param0));
                    var4 = dd.a(var3, (byte) -61, ';');
                    if (param2 == -85) {
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                              break L3;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(param1)) {
                                break L3;
                              } else {
                                stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                                decompiledRegionSelector0 = 2;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    stackIn_14_0 = null;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (var3_ref2);

                stackIn_17_1 = new StringBuilder().append("qn.A(");

                if (param0 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

                if (param1 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_14_0);
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_9_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qn(byte[] param0) {
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(String param0, int param1, String[] param2, int param3, jl param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4.c(param0);
              if (var5_int > param1) {
                break L1;
              } else {
                if (param0.indexOf("<br>") == -1) {
                  param2[0] = param0;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (param1 + (var5_int - 1)) / param1;
              param1 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param0.length();
              if (param3 < -99) {
                break L2;
              } else {
                qn.e(-2);
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var8 > var7) {
                    incrementValue$0 = var6;
                    var6++;
                    param2[incrementValue$0] = param0.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_26_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param0.charAt(var9);
                    if (-33 == (var10 ^ -1)) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param0.substring(var7, var9 - -1).trim();
                  var12 = param4.c(var11);
                  if (param1 > var12) {
                    break L5;
                  } else {
                    var7 = var9 + 1;
                    incrementValue$1 = var6;
                    var6++;
                    param2[incrementValue$1] = var11;
                    break L5;
                  }
                }
                if (62 == var10) {
                  if (param0.regionMatches(var9 - 3, "<br>", 0, 4)) {
                    incrementValue$2 = var6;
                    var6++;
                    param2[incrementValue$2] = param0.substring(var7, -3 + var9).trim();
                    var7 = var9 + 1;
                    var9++;
                    continue L3;
                  } else {
                    var9++;
                    continue L3;
                  }
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("qn.B(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_26_0;
        }
    }

    static {
        field_m = "Name";
        field_p = 0;
        field_n = "Invalid name";
    }
}
