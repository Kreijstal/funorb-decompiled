/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static um field_a;

    final static void a(boolean param0, int param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        if (param1 == 0) {
          if (null != vh.field_h) {
            var3 = vh.field_h.a((byte) -63, param0);
            if (var3 != 0) {
              if ((var3 ^ -1) == -3) {
                if (null != vh.field_h.field_Y) {
                  if (!vh.field_h.field_Y.equals("")) {
                    L0: {
                      if (vh.field_h.field_Y.charAt(0) != 91) {
                        var7 = (CharSequence) ((Object) vh.field_h.field_Y);
                        var4 = kf.a(var7, (byte) 2);
                        var5 = var4;
                        var5 = var4;
                        break L0;
                      } else {
                        var4 = vh.field_h.field_Y;
                        break L0;
                      }
                    }
                    L1: {
                      var5 = null;
                      if (-1 == (of.field_d ^ -1)) {
                        var5 = rb.a(param2, param1 + 0, var4);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (of.field_d != 1) {
                        break L2;
                      } else {
                        var5 = md.a(param2, var4, false);
                        break L2;
                      }
                    }
                    L3: {
                      if (-3 == (of.field_d ^ -1)) {
                        var5 = dd.b(var4, 127, param2);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if ((of.field_d ^ -1) != -4) {
                        break L4;
                      } else {
                        var5 = sg.a(var4, var4, param2, (byte) 125);
                        break L4;
                      }
                    }
                    if (var5 != null) {
                      var6 = (String) null;
                      ca.a(var4, (String) null, (String) (var5), (byte) -37, 2, 0);
                      vh.field_h = null;
                      of.field_d = -1;
                      return;
                    } else {
                      vh.field_h = null;
                      of.field_d = -1;
                      return;
                    }
                  } else {
                    vh.field_h = null;
                    of.field_d = -1;
                    return;
                  }
                } else {
                  vh.field_h = null;
                  of.field_d = -1;
                  return;
                }
              } else {
                vh.field_h = null;
                of.field_d = -1;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (-1 < (param0 ^ -1)) {
          L0: {
            if (0 != (1 + param0) % 4) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          if (param0 < 1582) {
            L1: {
              if (param0 % 4 != 0) {
                stackIn_11_0 = 0;
                break L1;
              } else {
                stackIn_11_0 = 1;
                break L1;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            if (param0 % 4 == 0) {
              if (param0 % 100 == 0) {
                if (0 == param0 % 400) {
                  if (param1 > -12) {
                    field_a = (um) null;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static ig a(w param0, w param1, ac param2, w param3, int param4) {
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        ig stackIn_12_0 = null;
        ig stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ig[] var11 = null;
        int var12 = 0;
        ac var13_ref_ac = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        me var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        var17 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param2.field_C == null) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = param2.field_C.length;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param2.field_E) {
                  stackIn_10_0 = param2.field_E.length;
                  break L2;
                } else {
                  stackIn_10_0 = 0;
                  break L2;
                }
              }
              var6 = stackIn_10_0;
              var7 = var5_int + var6;
              var8 = new String[var7];
              if (param4 == 0) {
                L3: {
                  var21 = new char[var7];
                  var19 = var21;
                  var9 = var19;
                  var20 = new int[var7];
                  var18 = var20;
                  var10 = var18;
                  var11 = new ig[var7];
                  if (null != param2.field_C) {
                    var12 = 0;
                    L4: while (true) {
                      if (param2.field_C.length <= var12) {
                        break L3;
                      } else {
                        var13_ref_ac = oi.field_a.a(-126, param2.field_C[var12]);
                        var8[var12] = var13_ref_ac.field_H;
                        var9[var12] = param2.field_G[var12];
                        var11[var12] = ll.a(param0, param1, var13_ref_ac, param3, 0);
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (param2.field_E != null) {
                    var12 = var5_int;
                    var13 = 49;
                    var14 = 0;
                    L6: while (true) {
                      if (param2.field_E.length <= var14) {
                        break L5;
                      } else {
                        L7: {
                          var15 = param2.field_E[var14];
                          if (-1 == var15) {
                            var8[var14 + var12] = gk.field_Gb;
                            var9[var12 + var14] = param2.field_y[var14];
                            var10[var12 + var14] = param2.field_E[var14];
                            break L7;
                          } else {
                            L8: {
                              var16 = wj.field_Qb.a(126, var15);
                              var8[var14 + var12] = var16.f((byte) -81);
                              var9[var12 + var14] = param2.field_y[var14];
                              if (var9[var12 - -var14] > 0) {
                                break L8;
                              } else {
                                var13 = (char)(var13 + 1);
                                var9[var14 + var12] = (char)var13;
                                break L8;
                              }
                            }
                            var10[var12 - -var14] = param2.field_E[var14];
                            break L7;
                          }
                        }
                        var14++;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackIn_30_0 = new ig(0L, param0, param3, param1, var11, var20, var8, var21);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_12_0 = (ig) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var5);

            stackIn_33_1 = new StringBuilder().append("ll.A(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L11;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param3 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L12;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_43_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ig) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_30_0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 29) {
            field_a = (um) null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
            return;
        }
        f.a(2, param1);
        fc.a(param0 + 6, param1);
    }

    static {
        field_a = new um();
    }
}
