/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static String field_f;
    static volatile boolean field_d;
    static lh field_a;
    static String field_c;
    static String field_e;
    static String field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Chess.field_G;
        try {
          L0: {
            L1: {
              var5_int = param3 + param2;
              var6 = param4 - -param0;
              if (wb.field_i >= param2) {
                stackIn_4_0 = wb.field_i;
                break L1;
              } else {
                stackIn_4_0 = param2;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param4 <= wb.field_a) {
                stackIn_7_0 = wb.field_a;
                break L2;
              } else {
                stackIn_7_0 = param4;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int >= wb.field_j) {
                stackIn_10_0 = wb.field_j;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 < wb.field_b) {
                stackIn_13_0 = var6;
                break L4;
              } else {
                stackIn_13_0 = wb.field_b;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (wb.field_i > param2) {
                break L5;
              } else {
                if (param2 >= wb.field_j) {
                  break L5;
                } else {
                  var11 = param2 + wb.field_h * var8;
                  var12 = -var8 + 1 + var10 >> 85216097;
                  L6: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L5;
                    } else {
                      wb.field_d[var11] = 16777215;
                      var11 = var11 + 2 * wb.field_h;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (wb.field_a > param4) {
                break L7;
              } else {
                if (wb.field_b > var6) {
                  var11 = wb.field_h * param4 + var7;
                  var12 = var9 + (1 - var7) >> 84626305;
                  L8: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L7;
                    } else {
                      wb.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (var5_int < wb.field_i) {
                break L9;
              } else {
                if (var5_int >= wb.field_j) {
                  break L9;
                } else {
                  var11 = var5_int + (var8 + (-param2 + var5_int & 1)) * wb.field_h;
                  var12 = -var8 + (var10 + 1) >> -1140663615;
                  L10: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L9;
                    } else {
                      wb.field_d[var11] = 16777215;
                      var11 = var11 + 2 * wb.field_h;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (param4 < wb.field_a) {
                break L11;
              } else {
                if (var6 >= wb.field_b) {
                  break L11;
                } else {
                  var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
                  var12 = var9 + 1 + -var7 >> -184342687;
                  L12: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L11;
                    } else {
                      wb.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                }
              }
            }
            if (!param1) {
              break L0;
            } else {
              rc.a(-44, false, -98, -67, 79);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var5), "rc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static pm a(String param0, int param1, String param2, um param3, um param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        pm stackIn_2_0 = null;
        pm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 19131) {
              var5_int = param3.a(param0, 0);
              var6 = param3.a(param2, 7, var5_int);
              stackIn_4_0 = dn.a(var6, var5_int, (byte) 124, param3, param4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("rc.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(int param0) {
        an.field_c = false;
        if (null == tl.field_Fb) {
          if (param0 != vk.field_g) {
            ml.a(0);
            hf.field_g = 0;
            return;
          } else {
            hf.field_g = 0;
            return;
          }
        } else {
          tl.field_Fb.n(-116);
          if (param0 == vk.field_g) {
            hf.field_g = 0;
            return;
          } else {
            ml.a(0);
            hf.field_g = 0;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          rc.b(38);
          field_f = null;
          field_b = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    static {
        field_f = "<%0> to move";
        field_e = "Login: ";
        field_d = false;
        field_c = "You have <%0> unread messages!";
        field_b = "Quit";
    }
}
