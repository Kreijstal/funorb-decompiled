/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sd {
    static volatile boolean field_a;
    static int field_c;
    static int[] field_b;

    abstract void a(int param0, th param1);

    abstract kb a(boolean param0);

    public static void a(byte param0) {
        if (param0 != -123) {
            sd.a((byte) 102);
        }
        field_b = null;
    }

    final static String a(String param0, String[] param1, boolean param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3_int = param0.length();
              var4 = var3_int;
              var5 = 0;
              if (param2) {
                break L1;
              } else {
                field_c = 69;
                break L1;
              }
            }
            L2: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if ((var6_int ^ -1) > -1) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L3: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (-1 >= (var8 ^ -1)) {
                    var5 = 2 + var8;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if (!ii.a(48, param0.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (ik.a((CharSequence) ((Object) var9), true)) {
                        if (var3_int <= var5) {
                          continue L3;
                        } else {
                          if (param0.charAt(var5) != 62) {
                            continue L3;
                          } else {
                            var5++;
                            var10 = mo.a((CharSequence) ((Object) var9), (byte) -116);
                            discarded$0 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            discarded$1 = var6.append(param1[var10]);
                            continue L3;
                          }
                        }
                      } else {
                        continue L3;
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param0.substring(var7));
                    stackIn_26_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!ii.a(48, param0.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (!ik.a((CharSequence) ((Object) var7_ref_String), true)) {
                    continue L2;
                  } else {
                    if (var3_int <= var5) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = mo.a((CharSequence) ((Object) var7_ref_String), (byte) -116);
                        var4 = var4 + (param1[var8].length() + (-var5 - -var6_int));
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("sd.I(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), stackIn_33_2 + ',' + param2 + ')');
        }
        return stackIn_26_0;
    }

    final static int a(byte param0, io param1, io param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -29 / ((-76 - param0) / 48);
            var4 = (String) null;
            stackIn_1_0 = cc.a(65500, 0, 0, param2, false, (String) null, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("sd.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!dg.a((byte) 78, param0)) {
                var6 = rg.field_h;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = nn.field_f;
                    if (param1 <= -48) {
                      var7 = 0;
                      var3 = var7;
                      L2: while (true) {
                        if (var2.length <= var7) {
                          stackIn_25_0 = 0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          var4 = var2[var7];
                          if (var4 != param0) {
                            var7++;
                            continue L2;
                          } else {
                            stackIn_22_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    var4 = var6[var3];
                    if ((param0 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L1;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2_ref), "sd.J(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0 != 0;
              } else {
                return stackIn_25_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_a = false;
        field_b = new int[8192];
    }
}
