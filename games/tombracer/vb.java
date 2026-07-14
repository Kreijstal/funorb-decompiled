/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends vg {
    int field_g;
    qia field_f;
    vg field_h;
    static int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
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
        int var19 = 0;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          if (param7 < 0) {
            break L0;
          } else {
            if (uoa.field_b > param3) {
              L1: {
                if (0 <= param5) {
                  break L1;
                } else {
                  if (param1 >= 0) {
                    break L1;
                  } else {
                    if (param4 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (uoa.field_e > param5) {
                  break L2;
                } else {
                  if (uoa.field_e > param1) {
                    break L2;
                  } else {
                    if (param4 >= uoa.field_e) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param0 == -922437200) {
                  break L3;
                } else {
                  field_i = -119;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = param7 - param3;
                  if (param3 != param6) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (param7 == param3) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              var15 = param7 + -param6;
                              if (param1 <= param5) {
                                break L9;
                              } else {
                                var11 = (-param5 + param4 << -1273376176) / var14;
                                var12 = (-param1 + param4 << -383989488) / var15;
                                var9 = param5 << -681285424;
                                var10 = param1 << -1850749680;
                                if (0 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var11 = (param4 - param1 << 286772368) / var15;
                            var12 = (-param5 + param4 << -922437200) / var14;
                            var9 = param1 << -958730128;
                            var10 = param5 << 1634223536;
                            break L8;
                          }
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = 0;
                      var12 = 0;
                      var9 = param5 << 668297648;
                      var10 = param1 << -1421477072;
                      break L6;
                    }
                    L10: {
                      if (param3 >= 0) {
                        break L10;
                      } else {
                        param3 = Math.min(-param3, param6 + -param3);
                        var9 = var9 + param3 * var11;
                        var10 = var10 + param3 * var12;
                        param3 = 0;
                        break L10;
                      }
                    }
                    var13 = 0;
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L11: {
                  L12: {
                    var10 = param5 << -196705808;
                    var9 = param5 << -196705808;
                    var15 = param6 + -param3;
                    var11 = (param1 - param5 << 817570224) / var15;
                    var12 = (param4 + -param5 << -790418512) / var14;
                    if (var11 < var12) {
                      break L12;
                    } else {
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      var13 = 1;
                      if (0 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var13 = 0;
                  break L11;
                }
                L13: {
                  L14: {
                    if (param3 < 0) {
                      L15: {
                        if (param6 >= 0) {
                          break L15;
                        } else {
                          param3 = param6 + -param3;
                          var10 = var10 + var12 * param3;
                          var9 = var9 + param3 * var11;
                          param3 = param6;
                          if (0 == 0) {
                            break L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                      param3 = -param3;
                      var10 = var10 + var12 * param3;
                      var9 = var9 + var11 * param3;
                      param3 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var16 = uoa.field_d[param3];
                  L16: while (true) {
                    if (param6 <= param3) {
                      break L13;
                    } else {
                      L17: {
                        var17 = var9 >> -1432215504;
                        if ((uoa.field_e ^ -1) < (var17 ^ -1)) {
                          L18: {
                            var18 = -(var9 >> -1015013456) + (var10 >> -1843848112);
                            if (0 == var18) {
                              break L18;
                            } else {
                              L19: {
                                if (uoa.field_e > var17 - -var18) {
                                  break L19;
                                } else {
                                  var18 = -var17 + (uoa.field_e + -1);
                                  break L19;
                                }
                              }
                              L20: {
                                if (var17 >= 0) {
                                  break L20;
                                } else {
                                  tl.a(var16, var18 + var17, param2, 1535993377, param8);
                                  if (0 == 0) {
                                    break L17;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              tl.a(var16 + var17, var18, param2, 1535993377, param8);
                              if (0 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (var17 < 0) {
                            break L17;
                          } else {
                            if (var17 < uoa.field_e) {
                              tl.a(var16 + var17, var18, param2, 1535993377, param8);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param3++;
                      if (param3 >= uoa.field_b) {
                        return;
                      } else {
                        var9 = var9 + var11;
                        var10 = var10 + var12;
                        var16 = var16 + bea.field_g;
                        if (0 == 0) {
                          continue L16;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
                L21: {
                  var16 = -param6 + param7;
                  if (0 == var16) {
                    break L21;
                  } else {
                    L22: {
                      L23: {
                        if (var13 != 0) {
                          break L23;
                        } else {
                          var9 = param1 << 1223450128;
                          if (0 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var10 = param1 << -1321228528;
                      break L22;
                    }
                    var17 = param4 << 25206640;
                    var11 = (-var9 + var17) / var16;
                    var12 = (-var10 + var17) / var16;
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L21;
                    }
                  }
                }
                var11 = 0;
                var12 = 0;
                break L4;
              }
              L24: {
                if (param3 >= 0) {
                  break L24;
                } else {
                  param3 = -param3;
                  var9 = var9 + param3 * var11;
                  var10 = var10 + param3 * var12;
                  param3 = 0;
                  break L24;
                }
              }
              var15 = uoa.field_d[param3];
              if (param7 > param3) {
                L25: {
                  var16 = var9 >> 690310000;
                  if (uoa.field_e <= var16) {
                    break L25;
                  } else {
                    L26: {
                      var17 = (var10 >> 1602494576) + -(var9 >> 1313026800);
                      if (var17 == 0) {
                        break L26;
                      } else {
                        L27: {
                          if (uoa.field_e <= var16 + var17) {
                            var17 = -1 + (-var16 + uoa.field_e);
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (var16 < 0) {
                            break L28;
                          } else {
                            tl.a(var15 + var16, var17, param2, 1535993377, param8);
                            if (0 == 0) {
                              break L25;
                            } else {
                              break L28;
                            }
                          }
                        }
                        tl.a(var15, var17 + var16, param2, 1535993377, param8);
                        if (0 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L25;
                    } else {
                      if (var16 >= uoa.field_e) {
                        break L25;
                      } else {
                        tl.a(var15 + var16, var17, param2, 1535993377, param8);
                        break L25;
                      }
                    }
                  }
                }
                param3++;
                if (uoa.field_b <= param3) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  var15 = var15 + bea.field_g;
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        param0 = param0 << 6;
        param1 = param1 << 6;
        if (param2 != -21) {
            field_i = 102;
        }
        ((vb) this).field_g = param1;
        ((vb) this).field_f.a(128 + param1 * ot.field_v >> 104662632, param0);
    }

    vb(qia param0, vg param1) {
        ((vb) this).field_f = param0;
        ((vb) this).field_g = param0.l();
        ((vb) this).field_h = param1;
        ((vb) this).field_f.e(128 + ot.field_v * ((vb) this).field_g >> 1339526184);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 2;
    }
}
