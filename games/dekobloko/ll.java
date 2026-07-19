/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static um field_a;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        CharSequence var7 = null;
        if (param1 == 0) {
          if (null != vh.field_h) {
            var3 = vh.field_h.a((byte) -63, param0);
            if (var3 != 0) {
              if ((var3 ^ -1) == -3) {
                if (null != vh.field_h.field_Y) {
                  if (!vh.field_h.field_Y.equals("")) {
                    L0: {
                      L1: {
                        if (vh.field_h.field_Y.charAt(0) != 91) {
                          break L1;
                        } else {
                          var4 = vh.field_h.field_Y;
                          if (!client.field_A) {
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      var7 = (CharSequence) ((Object) vh.field_h.field_Y);
                      var4 = kf.a(var7, (byte) 2);
                      var5 = var4;
                      var5 = var4;
                      break L0;
                    }
                    L2: {
                      var5 = null;
                      if (-1 == (of.field_d ^ -1)) {
                        var5 = rb.a(param2, param1 + 0, var4);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (of.field_d != 1) {
                        break L3;
                      } else {
                        var5 = md.a(param2, var4, false);
                        break L3;
                      }
                    }
                    L4: {
                      if (-3 == (of.field_d ^ -1)) {
                        var5 = dd.b(var4, 127, param2);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if ((of.field_d ^ -1) != -4) {
                        break L5;
                      } else {
                        var5 = sg.a(var4, var4, param2, (byte) 125);
                        break L5;
                      }
                    }
                    if (var5 != null) {
                      var6 = (String) null;
                      ca.a(var4, (String) null, var5, (byte) -37, 2, 0);
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
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (-1 < (param0 ^ -1)) {
          L0: {
            if (0 != (1 + param0) % 4) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          if (param0 < 1582) {
            L1: {
              if (param0 % 4 != 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
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
        RuntimeException var5 = null;
        int var5_int = 0;
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
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        ig stackIn_12_0 = null;
        ig stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        ig stackOut_31_0 = null;
        ig stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var17 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (param2.field_C == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = param2.field_C.length;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var5_int = stackIn_7_0;
                if (null != param2.field_E) {
                  stackOut_9_0 = param2.field_E.length;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var6 = stackIn_10_0;
              var7 = var5_int + var6;
              var8 = new String[var7];
              if (param4 == 0) {
                L3: {
                  L4: {
                    L5: {
                      var21 = new char[var7];
                      var19 = var21;
                      var9 = var19;
                      var20 = new int[var7];
                      var18 = var20;
                      var10 = var18;
                      var11 = new ig[var7];
                      if (null != param2.field_C) {
                        var12 = 0;
                        L6: while (true) {
                          if (param2.field_C.length <= var12) {
                            break L5;
                          } else {
                            var13_ref_ac = oi.field_a.a(-126, param2.field_C[var12]);
                            var8[var12] = var13_ref_ac.field_H;
                            var9[var12] = param2.field_G[var12];
                            var11[var12] = ll.a(param0, param1, var13_ref_ac, param3, 0);
                            var12++;
                            if (var17 != 0) {
                              break L4;
                            } else {
                              if (var17 == 0) {
                                continue L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    if (param2.field_E != null) {
                      var12 = var5_int;
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  var13 = 49;
                  var14 = 0;
                  L7: while (true) {
                    if (param2.field_E.length <= var14) {
                      break L3;
                    } else {
                      L8: {
                        L9: {
                          var15 = param2.field_E[var14];
                          if (-1 == var15) {
                            break L9;
                          } else {
                            L10: {
                              var16 = wj.field_Qb.a(126, var15);
                              var8[var14 + var12] = var16.f((byte) -81);
                              var9[var12 + var14] = param2.field_y[var14];
                              if (var9[var12 - -var14] > 0) {
                                break L10;
                              } else {
                                var13 = (char)(var13 + 1);
                                var9[var14 + var12] = (char)var13;
                                break L10;
                              }
                            }
                            var10[var12 - -var14] = param2.field_E[var14];
                            if (var17 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var8[var14 + var12] = gk.field_Gb;
                        var9[var12 + var14] = param2.field_y[var14];
                        var10[var12 + var14] = param2.field_E[var14];
                        break L8;
                      }
                      var14++;
                      if (var17 == 0) {
                        continue L7;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_31_0 = new ig(0L, param0, param3, param1, var11, var20, var8, var21);
                stackIn_32_0 = stackOut_31_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_11_0 = (ig) null;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var5);
            stackOut_33_1 = new StringBuilder().append("ll.A(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          L12: {
            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          L13: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L13;
            }
          }
          L14: {
            stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param3 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ig) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_32_0;
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
