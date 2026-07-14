/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static um field_a;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        if (param1 == 0) {
          if (null != vh.field_h) {
            var3 = vh.field_h.a((byte) -63, param0);
            if (var3 != 0) {
              if ((var3 ^ -1) == -3) {
                if (null != vh.field_h.field_Y) {
                  if (!vh.field_h.field_Y.equals((Object) (Object) "")) {
                    L0: {
                      if (vh.field_h.field_Y.charAt(0) != 91) {
                        var7 = (CharSequence) (Object) vh.field_h.field_Y;
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
                      var6 = null;
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
                    field_a = null;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        ig[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        ac var13_ref = null;
        int var14 = 0;
        int var15 = 0;
        me var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int[] var22 = null;
        char[] var23 = null;
        int[] var24 = null;
        char[] var25 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var17 = client.field_A ? 1 : 0;
        if (param2 != null) {
          L0: {
            if (param2.field_C == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = param2.field_C.length;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var5 = stackIn_5_0;
            if (null != param2.field_E) {
              stackOut_7_0 = param2.field_E.length;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          var6 = stackIn_8_0;
          var7 = var5 + var6;
          var8 = new String[var7];
          if (param4 == 0) {
            var25 = new char[var7];
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var9 = var19;
            var24 = new int[var7];
            var22 = var24;
            var20 = var22;
            var18 = var20;
            var10 = var18;
            var11 = new ig[var7];
            if (null != param2.field_C) {
              var12 = 0;
              L2: while (true) {
                if (param2.field_C.length <= var12) {
                  if (param2.field_E == null) {
                    return new ig(0L, param0, param3, param1, var11, var24, var8, var25);
                  } else {
                    var12 = var5;
                    var13 = 49;
                    var14 = 0;
                    L3: while (true) {
                      if (param2.field_E.length <= var14) {
                        return new ig(0L, param0, param3, param1, var11, var24, var8, var25);
                      } else {
                        var15 = param2.field_E[var14];
                        if (-1 == var15) {
                          var8[var14 + var12] = gk.field_Gb;
                          var9[var12 + var14] = param2.field_y[var14];
                          var10[var12 + var14] = param2.field_E[var14];
                          var14++;
                          var14++;
                          continue L3;
                        } else {
                          L4: {
                            var16 = wj.field_Qb.a(126, var15);
                            var8[var14 + var12] = var16.f((byte) -81);
                            var9[var12 + var14] = param2.field_y[var14];
                            if (var9[var12 - -var14] > 0) {
                              break L4;
                            } else {
                              var13 = (char)(var13 + 1);
                              var9[var14 + var12] = (char)var13;
                              break L4;
                            }
                          }
                          var10[var12 - -var14] = param2.field_E[var14];
                          var14++;
                          var14++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var13_ref = oi.field_a.a(-126, param2.field_C[var12]);
                  var8[var12] = var13_ref.field_H;
                  var9[var12] = param2.field_G[var12];
                  var11[var12] = ll.a(param0, param1, var13_ref, param3, 0);
                  var12++;
                  continue L2;
                }
              }
            } else {
              if (param2.field_E != null) {
                var12 = var5;
                var13 = 49;
                var14 = 0;
                L5: while (true) {
                  if (param2.field_E.length > var14) {
                    var15 = param2.field_E[var14];
                    if (-1 == var15) {
                      var8[var14 + var12] = gk.field_Gb;
                      var9[var12 + var14] = param2.field_y[var14];
                      var10[var12 + var14] = param2.field_E[var14];
                      var14++;
                      var14++;
                      continue L5;
                    } else {
                      L6: {
                        var16 = wj.field_Qb.a(126, var15);
                        var8[var14 + var12] = var16.f((byte) -81);
                        var9[var12 + var14] = param2.field_y[var14];
                        if (var9[var12 - -var14] > 0) {
                          break L6;
                        } else {
                          var13 = (char)(var13 + 1);
                          var9[var14 + var12] = (char)var13;
                          break L6;
                        }
                      }
                      var10[var12 - -var14] = param2.field_E[var14];
                      var14++;
                      var14++;
                      continue L5;
                    }
                  } else {
                    return new ig(0L, param0, param3, param1, var11, var24, var8, var25);
                  }
                }
              } else {
                return new ig(0L, param0, param3, param1, var11, var24, var8, var25);
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 29) {
            field_a = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new um();
    }
}
