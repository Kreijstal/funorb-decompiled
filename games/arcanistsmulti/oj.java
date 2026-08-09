/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static String field_c;
    static String[] field_f;
    static boolean field_i;
    static boolean field_h;
    static String field_b;
    static String field_a;
    static String field_g;
    static int field_e;
    static String field_d;

    final static ql a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ql[] var3 = null;
        int var4 = 0;
        ql var5 = null;
        int var6 = 0;
        ql stackIn_3_0 = null;
        ql stackIn_6_0 = null;
        ql stackIn_11_0 = null;
        ql stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2 = fd.a(28, param1, "jagex-last-login-method");
            if (var2 != null) {
              var3 = rm.b(1283220456);
              if (param0 > 106) {
                var4 = 0;
                L1: while (true) {
                  if (var3.length <= var4) {
                    stackIn_14_0 = vh.field_f;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (!var5.a(var2, -90)) {
                      var4++;
                      continue L1;
                    } else {
                      stackIn_11_0 = (ql) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_6_0 = (ql) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = vh.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("oj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 1) {
            return;
        }
        field_a = null;
        field_g = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static ho a(int param0, boolean param1) {
        ho var2;
        ho stackIn_3_0 = null;
        ho stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        if (param0 != 32517) {
          return (ho) null;
        } else {
          L0: {
            var2 = new ho(true);
            stackIn_3_0 = (ho) (var2);

            if (!param1) {
              stackIn_4_0 = (ho) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L0;
            } else {
              stackIn_4_0 = (ho) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L0;
            }
          }
          stackIn_4_0.field_h = stackIn_4_1 != 0;
          return var2;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
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
        java.applet.Applet var14 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4 + param2;
              var6 = param1 + param3;
              if (de.field_i < param2) {
                stackIn_4_0 = param2;
                break L1;
              } else {
                stackIn_4_0 = de.field_i;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (de.field_c < param1) {
                stackIn_7_0 = param1;
                break L2;
              } else {
                stackIn_7_0 = de.field_c;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int < de.field_h) {
                stackIn_10_0 = var5_int;
                break L3;
              } else {
                stackIn_10_0 = de.field_h;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (de.field_k <= var6) {
                stackIn_13_0 = de.field_k;
                break L4;
              } else {
                stackIn_13_0 = var6;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (param2 < de.field_i) {
                break L5;
              } else {
                if (param2 >= de.field_h) {
                  break L5;
                } else {
                  var11 = param2 + var8 * de.field_e;
                  var12 = 1 + var10 + -var8 >> 197833953;
                  L6: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L5;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 = var11 + de.field_e * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (param1 < de.field_c) {
                break L7;
              } else {
                if (de.field_k <= var6) {
                  break L7;
                } else {
                  var11 = var7 + de.field_e * param1;
                  var12 = 1 - -var9 + -var7 >> -450354335;
                  L8: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L7;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (param0 == -32171) {
                break L9;
              } else {
                var14 = (java.applet.Applet) null;
                oj.a(82, (java.applet.Applet) null);
                break L9;
              }
            }
            L10: {
              if (var5_int < de.field_i) {
                break L10;
              } else {
                if (var5_int < de.field_h) {
                  var11 = de.field_e * ((-param2 + var5_int & 1) + var8) + var5_int;
                  var12 = -var8 + 1 - -var10 >> 357107169;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 = var11 + de.field_e * 2;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (param1 < de.field_c) {
                break L12;
              } else {
                if (de.field_k <= var6) {
                  break L12;
                } else {
                  var11 = (1 & -param1 + var6) + de.field_e * var6 - -var7;
                  var12 = var9 + (1 + -var7) >> 2063391585;
                  L13: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L12;
                    } else {
                      de.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "oj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_i = false;
        field_c = "Your request to join has been declined.";
        field_e = 25;
        field_b = "Email address is unavailable";
        field_g = "Full screen";
        field_d = "Invite more players, or alternatively try changing the following settings:  ";
        field_a = "Home in and explode. Click to select the target destination, then hold the mouse to increase the velocity of the attack.";
    }
}
