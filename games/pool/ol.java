/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static int field_d;
    static int field_a;
    static int field_e;
    static String field_b;
    static an field_c;

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        if (param6 >= 0) {
          if (param5 < fb.field_o) {
            L0: {
              if (param2 >= 0) {
                break L0;
              } else {
                if (param4 >= 0) {
                  break L0;
                } else {
                  if (param7 < 0) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L1: {
              if (param2 < fb.field_k) {
                break L1;
              } else {
                if (fb.field_k > param4) {
                  break L1;
                } else {
                  if (fb.field_k <= param7) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              var14 = param6 + -param5;
              if (param3 != param5) {
                L3: {
                  var10 = param2 << -161819888;
                  var9 = param2 << -161819888;
                  var15 = -param5 + param3;
                  var11 = (param4 + -param2 << -1052394480) / var15;
                  var12 = (-param2 + param7 << -81090800) / var14;
                  if (var11 < var12) {
                    var13 = 0;
                    break L3;
                  } else {
                    var13 = 1;
                    var16 = var11;
                    var11 = var12;
                    var12 = var16;
                    break L3;
                  }
                }
                L4: {
                  if (param5 >= 0) {
                    var16 = fb.field_m[param5];
                    L5: while (true) {
                      if (param3 <= param5) {
                        break L4;
                      } else {
                        L6: {
                          var17 = var9 >> -463446672;
                          if (var17 < fb.field_k) {
                            var18 = -(var9 >> -460888208) + (var10 >> -1098195152);
                            if (0 == var18) {
                              if (0 > var17) {
                                break L6;
                              } else {
                                if (var17 < fb.field_k) {
                                  fd.a(param0, param1, var16 + var17, var18, 2);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            } else {
                              L7: {
                                if (fb.field_k > var17 - -var18) {
                                  break L7;
                                } else {
                                  var18 = -1 + (fb.field_k + -var17);
                                  break L7;
                                }
                              }
                              if (var17 < 0) {
                                fd.a(param0, param1, var16, var17 + var18, param8 + -19545);
                                break L6;
                              } else {
                                fd.a(param0, param1, var16 + var17, var18, param8 ^ 19545);
                                break L6;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        param5++;
                        if (fb.field_o <= param5) {
                          return;
                        } else {
                          var10 = var10 + var12;
                          var9 = var9 + var11;
                          var16 = var16 + qh.field_l;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    if (0 <= param3) {
                      param5 = -param5;
                      var10 = var10 + param5 * var12;
                      var9 = var9 + var11 * param5;
                      param5 = 0;
                      var16 = fb.field_m[param5];
                      L8: while (true) {
                        if (param3 <= param5) {
                          break L4;
                        } else {
                          L9: {
                            var17 = var9 >> -463446672;
                            if (var17 < fb.field_k) {
                              var18 = -(var9 >> -460888208) + (var10 >> -1098195152);
                              if (0 == var18) {
                                if (0 > var17) {
                                  break L9;
                                } else {
                                  if (var17 < fb.field_k) {
                                    fd.a(param0, param1, var16 + var17, var18, 2);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                              } else {
                                L10: {
                                  if (fb.field_k > var17 - -var18) {
                                    break L10;
                                  } else {
                                    var18 = -1 + (fb.field_k + -var17);
                                    break L10;
                                  }
                                }
                                if (var17 < 0) {
                                  fd.a(param0, param1, var16, var17 + var18, param8 + -19545);
                                  break L9;
                                } else {
                                  fd.a(param0, param1, var16 + var17, var18, param8 ^ 19545);
                                  break L9;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                          param5++;
                          if (fb.field_o <= param5) {
                            return;
                          } else {
                            var10 = var10 + var12;
                            var9 = var9 + var11;
                            var16 = var16 + qh.field_l;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      param5 = -param5 + param3;
                      var9 = var9 + var11 * param5;
                      var10 = var10 + param5 * var12;
                      param5 = param3;
                      break L4;
                    }
                  }
                }
                var16 = -param3 + param6;
                if (var16 == 0) {
                  var11 = 0;
                  var12 = 0;
                  break L2;
                } else {
                  L11: {
                    var17 = param7 << 2045150064;
                    if (var13 != 0) {
                      var10 = param4 << 1156974096;
                      break L11;
                    } else {
                      var9 = param4 << 1236798832;
                      break L11;
                    }
                  }
                  var11 = (var17 - var9) / var16;
                  var12 = (-var10 + var17) / var16;
                  break L2;
                }
              } else {
                L12: {
                  if (param6 == param5) {
                    var9 = param2 << 1954610672;
                    var12 = 0;
                    var10 = param4 << -915913360;
                    var11 = 0;
                    break L12;
                  } else {
                    var15 = param6 + -param3;
                    if (param4 > param2) {
                      var12 = (-param4 + param7 << -570291504) / var15;
                      var9 = param2 << -1234640560;
                      var11 = (-param2 + param7 << -1046219824) / var14;
                      var10 = param4 << 1430775248;
                      break L12;
                    } else {
                      var11 = (param7 + -param4 << -138966960) / var15;
                      var9 = param4 << -1667536720;
                      var12 = (param7 - param2 << -2078298416) / var14;
                      var10 = param2 << 124986128;
                      break L12;
                    }
                  }
                }
                L13: {
                  if (param5 < 0) {
                    param5 = Math.min(-param5, param3 - param5);
                    var9 = var9 + param5 * var11;
                    var10 = var10 + var12 * param5;
                    param5 = 0;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var13 = 0;
                break L2;
              }
            }
            L14: {
              if (param5 >= 0) {
                break L14;
              } else {
                param5 = -param5;
                var10 = var10 + param5 * var12;
                var9 = var9 + param5 * var11;
                param5 = 0;
                break L14;
              }
            }
            L15: {
              var15 = fb.field_m[param5];
              if (param8 == 19547) {
                break L15;
              } else {
                field_c = null;
                break L15;
              }
            }
            L16: while (true) {
              if (param6 > param5) {
                L17: {
                  var16 = var9 >> -700793424;
                  if (fb.field_k > var16) {
                    var17 = (var10 >> 1311218480) - (var9 >> 1439674256);
                    if (var17 == 0) {
                      if (0 > var16) {
                        break L17;
                      } else {
                        if (fb.field_k > var16) {
                          fd.a(param0, param1, var16 + var15, var17, 2);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    } else {
                      L18: {
                        if (var16 + var17 >= fb.field_k) {
                          var17 = -1 + fb.field_k + -var16;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      if (var16 >= 0) {
                        fd.a(param0, param1, var16 - -var15, var17, 2);
                        break L17;
                      } else {
                        fd.a(param0, param1, var15, var17 - -var16, 2);
                        break L17;
                      }
                    }
                  } else {
                    break L17;
                  }
                }
                param5++;
                if (param5 >= fb.field_o) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  var15 = var15 + qh.field_l;
                  continue L16;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static float[] a(int[] param0, byte param1) {
        if (param1 != 1) {
            field_a = 96;
        }
        return op.a(16, param0, 97);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1430775248) {
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Average rating";
    }
}
