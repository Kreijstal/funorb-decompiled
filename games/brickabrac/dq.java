/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_a;
    static String field_c;
    static int field_b;

    final static void a(wq param0, wq param1, java.math.BigInteger param2, byte param3, java.math.BigInteger param4) {
        tm.a(param0, param1.field_l, (byte) 126, param2, 0, param1.field_k, param4);
        if (param3 != -72) {
            dq.a((byte) -97);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 89) {
            return;
        }
        field_a = null;
    }

    final static int a(vl[] param0, boolean param1, wq param2, vl param3, kq param4, ga param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9_ref = null;
        int var9 = 0;
        on var9_ref_on = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        Object var14 = null;
        on var17 = null;
        on var18 = null;
        cl var20 = null;
        on var21 = null;
        on var22 = null;
        cl var23 = null;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_63_0;
        int stackOut_62_0;
        int stackOut_66_0;
        int stackOut_65_0;
        int stackOut_18_0;
        int stackOut_17_0;
        int stackOut_21_0;
        int stackOut_20_0;
        var9_ref = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (param0.length <= var6) {
            if (param1) {
              if (!param3.a(false)) {
                throw new IllegalArgumentException();
              } else {
                var6 = param2.e(255);
                if ((var6 ^ -1) < -6) {
                  throw new IllegalArgumentException();
                } else {
                  L1: {
                    var7 = param2.e(255);
                    if (3 < var6) {
                      param4.field_p = var7 >>> 519373480;
                      var7 = var7 & 255;
                      break L1;
                    } else {
                      param4.field_p = 0;
                      break L1;
                    }
                  }
                  L2: {
                    if (3 > var6) {
                      var8 = param2.e(255);
                      var9 = 0;
                      L3: while (true) {
                        if (var8 <= var9) {
                          var9_ref_on = (on) (Object) param0[0].d(-54);
                          L4: while (true) {
                            if (var9_ref_on == null) {
                              break L2;
                            } else {
                              L5: {
                                if (-1 == (var9_ref_on.field_N & 4 ^ -1)) {
                                  break L5;
                                } else {
                                  param0[1].a((nm) (Object) var9_ref_on, (byte) 3);
                                  break L5;
                                }
                              }
                              var9_ref_on = (on) (Object) param0[0].a((byte) 116);
                              continue L4;
                            }
                          }
                        } else {
                          L6: {
                            var22 = new on();
                            if (-1 != (var6 ^ -1)) {
                              if (-1 <= (var6 ^ -1)) {
                                break L6;
                              } else {
                                var22.a(101, param2);
                                break L6;
                              }
                            } else {
                              var22.field_j = param2.e(255);
                              var22.field_m = param2.e(255);
                              var22.field_k = param2.e(255);
                              var22.field_o = param2.e(255);
                              var22.field_i = param2.e(255);
                              var22.field_N = param2.e(255);
                              break L6;
                            }
                          }
                          param0[0].a((nm) (Object) var22, (byte) 3);
                          var9++;
                          continue L3;
                        }
                      }
                    } else {
                      L7: {
                        if ((1 & var7) != 0) {
                          stackOut_63_0 = 0;
                          stackIn_64_0 = stackOut_63_0;
                          break L7;
                        } else {
                          stackOut_62_0 = 1;
                          stackIn_64_0 = stackOut_62_0;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_64_0;
                        if (var8 != 0) {
                          stackOut_66_0 = 15;
                          stackIn_67_0 = stackOut_66_0;
                          break L8;
                        } else {
                          stackOut_65_0 = 9;
                          stackIn_67_0 = stackOut_65_0;
                          break L8;
                        }
                      }
                      kj.a(stackIn_67_0, param0[2], 16);
                      var9 = 0;
                      L9: while (true) {
                        if (param0.length <= var9) {
                          break L2;
                        } else {
                          var10 = param2.e(255);
                          var11 = 0;
                          L10: while (true) {
                            if (var10 <= var11) {
                              var9++;
                              var9++;
                              continue L9;
                            } else {
                              var21 = new on();
                              var21.a(91, param2);
                              param0[var9].a((nm) (Object) var21, (byte) 3);
                              var11++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    if (var6 > 1) {
                      var8 = param2.e(255);
                      var9 = 0;
                      L12: while (true) {
                        if (var8 <= var9) {
                          break L11;
                        } else {
                          var23 = new cl();
                          var23.a(90, param2);
                          param3.a((nm) (Object) var23, (byte) 3);
                          var9++;
                          continue L12;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  L13: {
                    if ((var6 ^ -1) < -5) {
                      String discarded$3 = param2.a((byte) 24);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return var7;
                }
              }
            } else {
              var14 = null;
              dq.a((wq) null, (wq) null, (java.math.BigInteger) null, (byte) 57, (java.math.BigInteger) null);
              if (!param3.a(false)) {
                throw new IllegalArgumentException();
              } else {
                var6 = param2.e(255);
                if ((var6 ^ -1) >= -6) {
                  L14: {
                    var7 = param2.e(255);
                    if (3 < var6) {
                      param4.field_p = var7 >>> 519373480;
                      var7 = var7 & 255;
                      break L14;
                    } else {
                      param4.field_p = 0;
                      break L14;
                    }
                  }
                  L15: {
                    if (3 > var6) {
                      var8 = param2.e(255);
                      var9 = 0;
                      L16: while (true) {
                        if (var8 <= var9) {
                          var9_ref_on = (on) (Object) param0[0].d(-54);
                          L17: while (true) {
                            if (var9_ref_on == null) {
                              break L15;
                            } else {
                              L18: {
                                if (-1 == (var9_ref_on.field_N & 4 ^ -1)) {
                                  break L18;
                                } else {
                                  param0[1].a((nm) (Object) var9_ref_on, (byte) 3);
                                  break L18;
                                }
                              }
                              var9_ref_on = (on) (Object) param0[0].a((byte) 116);
                              continue L17;
                            }
                          }
                        } else {
                          L19: {
                            var18 = new on();
                            if (-1 != (var6 ^ -1)) {
                              if (-1 <= (var6 ^ -1)) {
                                break L19;
                              } else {
                                var18.a(101, param2);
                                break L19;
                              }
                            } else {
                              var18.field_j = param2.e(255);
                              var18.field_m = param2.e(255);
                              var18.field_k = param2.e(255);
                              var18.field_o = param2.e(255);
                              var18.field_i = param2.e(255);
                              var18.field_N = param2.e(255);
                              break L19;
                            }
                          }
                          param0[0].a((nm) (Object) var18, (byte) 3);
                          var9++;
                          continue L16;
                        }
                      }
                    } else {
                      L20: {
                        if ((1 & var7) != 0) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L20;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L20;
                        }
                      }
                      L21: {
                        var8 = stackIn_19_0;
                        if (var8 != 0) {
                          stackOut_21_0 = 15;
                          stackIn_22_0 = stackOut_21_0;
                          break L21;
                        } else {
                          stackOut_20_0 = 9;
                          stackIn_22_0 = stackOut_20_0;
                          break L21;
                        }
                      }
                      kj.a(stackIn_22_0, param0[2], 16);
                      var9 = 0;
                      L22: while (true) {
                        if (param0.length <= var9) {
                          break L15;
                        } else {
                          var10 = param2.e(255);
                          var11 = 0;
                          L23: while (true) {
                            if (var10 <= var11) {
                              var9++;
                              var9++;
                              continue L22;
                            } else {
                              var17 = new on();
                              var17.a(91, param2);
                              param0[var9].a((nm) (Object) var17, (byte) 3);
                              var11++;
                              continue L23;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var6 <= 1) {
                    L24: {
                      if ((var6 ^ -1) < -5) {
                        String discarded$4 = param2.a((byte) 24);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    return var7;
                  } else {
                    var8 = param2.e(255);
                    var9 = 0;
                    L25: while (true) {
                      if (var8 <= var9) {
                        L26: {
                          if ((var6 ^ -1) < -5) {
                            String discarded$5 = param2.a((byte) 24);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        return var7;
                      } else {
                        var20 = new cl();
                        var20.a(90, param2);
                        param3.a((nm) (Object) var20, (byte) 3);
                        var9++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
          } else {
            if (!param0[var6].a(false)) {
              throw new IllegalArgumentException();
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You are on <%0>";
        field_b = 0;
    }
}
