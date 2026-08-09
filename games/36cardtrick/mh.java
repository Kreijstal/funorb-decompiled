/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh {
    static nk field_a;
    static qk field_c;
    static ja field_d;
    static volatile int field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -41) {
            mh.a((byte) 58);
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        L0: {
          var3 = Main.field_T;
          if (d.field_c > param0) {
            L1: {
              if (wc.field_A != null) {
                gj.field_a = wc.field_A.c(-1);
                vd.a(2, -1);
                break L1;
              } else {
                gj.field_a = qa.a(0, 480, 0, 17651, jk.field_a, 640);
                break L1;
              }
            }
            if (gj.field_a != null) {
              tk.a(gj.field_a, -1);
              var2 = 2;
              break L0;
            } else {
              var2 = 3;
              break L0;
            }
          } else {
            if (!dl.d(0)) {
              var2 = 1;
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        L2: {
          if (null != wc.field_A) {
            break L2;
          } else {
            if (!rg.field_a) {
              break L2;
            } else {
              sc.a(var2, (byte) 116, param1);
              break L2;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, ee param2, String param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
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
        var13 = Main.field_T;
        try {
          L0: {
            L1: {
              var5_int = param2.a(param3);
              if (var5_int > param1) {
                break L1;
              } else {
                if (0 == (param3.indexOf("<br>") ^ -1)) {
                  param4[0] = param3;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (-1 + (param1 + var5_int)) / param1;
            param1 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param3.length();
            if (!param0) {
              var9 = 0;
              L2: while (true) {
                if (var9 >= var8) {
                  L3: {
                    if (var8 <= var7) {
                      break L3;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      param4[incrementValue$0] = param3.substring(var7, var8).trim();
                      break L3;
                    }
                  }
                  stackIn_27_0 = var6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param3.charAt(var9);
                      if (-33 == (var10 ^ -1)) {
                        break L5;
                      } else {
                        if (45 != var10) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = param3.substring(var7, var9 + 1).trim();
                    var12 = param2.a(var11);
                    if (param1 > var12) {
                      break L4;
                    } else {
                      var7 = 1 + var9;
                      incrementValue$1 = var6;
                      var6++;
                      param4[incrementValue$1] = var11;
                      break L4;
                    }
                  }
                  if (var10 == 62) {
                    L6: {
                      if (param3.regionMatches(var9 - 3, "<br>", 0, 4)) {
                        incrementValue$2 = var6;
                        var6++;
                        param4[incrementValue$2] = param3.substring(var7, -3 + var9).trim();
                        var7 = 1 + var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_8_0 = 69;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("mh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_27_0;
          }
        }
    }

    final static nk a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        nk stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                mh.a(125, true);
                break L1;
              }
            }
            if (ei.field_d != hh.field_g) {
              L2: {
                if (ei.field_d != gg.field_b) {
                  break L2;
                } else {
                  if (!param1.equals(dj.field_e)) {
                    break L2;
                  } else {
                    ei.field_d = tj.field_F;
                    stackIn_8_0 = tf.field_s;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              ei.field_d = hh.field_g;
              tf.field_s = null;
              dj.field_e = param1;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("mh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nk) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (nk) ((Object) stackIn_10_0);
          }
        }
    }

    static {
        field_b = 0;
    }
}
