/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uw {
    static String[] field_b;
    static wb field_a;
    static String[] field_c;

    final int b(int param0, long param1) {
        if (param0 != 4007) {
            field_c = null;
        }
        long var4 = ((uw) this).a((byte) -52);
        if ((var4 ^ -1L) < -1L) {
            tg.a(var4, (byte) 110);
        }
        return ((uw) this).a(0, param1);
    }

    abstract void b(byte param0);

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
        int var19 = 0;
        L0: {
          var19 = Sumoblitz.field_L ? 1 : 0;
          if (0 > param3) {
            break L0;
          } else {
            if (param2 < nk.field_c) {
              L1: {
                if (param7 >= 0) {
                  break L1;
                } else {
                  if (param5 >= 0) {
                    break L1;
                  } else {
                    if (param1 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param7 < nk.field_i) {
                  break L2;
                } else {
                  if (nk.field_i > param5) {
                    break L2;
                  } else {
                    if (nk.field_i > param1) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param6 == 1955582416) {
                  break L3;
                } else {
                  field_a = null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = param3 - param2;
                  if (param8 == param2) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param7 << -520295248;
                        var9 = param7 << -520295248;
                        var15 = param8 - param2;
                        var12 = (-param7 + param1 << -1716209648) / var14;
                        var11 = (-param7 + param5 << 42362672) / var15;
                        if (var11 < var12) {
                          break L7;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = 0;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param2 < 0) {
                          L10: {
                            if (param8 >= 0) {
                              break L10;
                            } else {
                              param2 = param8 - param2;
                              var10 = var10 + param2 * var12;
                              var9 = var9 + param2 * var11;
                              param2 = param8;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2 = -param2;
                          var10 = var10 + var12 * param2;
                          var9 = var9 + param2 * var11;
                          param2 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var16 = nk.field_d[param2];
                      L11: while (true) {
                        if (param2 >= param8) {
                          break L8;
                        } else {
                          L12: {
                            var17 = var9 >> 476688272;
                            if (nk.field_i <= var17) {
                              break L12;
                            } else {
                              L13: {
                                var18 = (var10 >> -170956752) - (var9 >> 1829009776);
                                if (0 == var18) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var18 + var17 < nk.field_i) {
                                      break L14;
                                    } else {
                                      var18 = nk.field_i + -var17 - 1;
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (0 > var17) {
                                      break L15;
                                    } else {
                                      wm.a(-1, var17 - -var16, param4, var18, param0);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  wm.a(-1, var16, param4, var18 - -var17, param0);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var17 < 0) {
                                break L12;
                              } else {
                                if (nk.field_i > var17) {
                                  wm.a(-1, var17 - -var16, param4, var18, param0);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          param2++;
                          if (nk.field_c <= param2) {
                            return;
                          } else {
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            var16 = var16 + lk.field_b;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var16 = -param8 + param3;
                        if (var16 != 0) {
                          break L17;
                        } else {
                          var11 = 0;
                          var12 = 0;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        L19: {
                          if (var13 == 0) {
                            break L19;
                          } else {
                            var10 = param5 << -973254384;
                            if (0 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var9 = param5 << 1488190256;
                        break L18;
                      }
                      var17 = param1 << -395036784;
                      var12 = (-var10 + var17) / var16;
                      var11 = (var17 - var9) / var16;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param2 == param3) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          var15 = param3 + -param8;
                          if (param7 >= param5) {
                            break L23;
                          } else {
                            var9 = param7 << 1791519120;
                            var10 = param5 << -1481087792;
                            var11 = (param1 - param7 << 376192240) / var14;
                            var12 = (-param5 + param1 << -1538448272) / var15;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var9 = param5 << 1791554960;
                        var11 = (param1 - param5 << -1828057040) / var15;
                        var10 = param7 << 1294097136;
                        var12 = (param1 + -param7 << -151453840) / var14;
                        break L22;
                      }
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var12 = 0;
                  var9 = param7 << 210787856;
                  var10 = param5 << 1955582416;
                  var11 = 0;
                  break L20;
                }
                var13 = 0;
                if (0 <= param2) {
                  break L4;
                } else {
                  param2 = Math.min(-param2, param8 - param2);
                  var9 = var9 + param2 * var11;
                  var10 = var10 + param2 * var12;
                  param2 = 0;
                  break L4;
                }
              }
              L24: {
                if (0 > param2) {
                  param2 = -param2;
                  var10 = var10 + param2 * var12;
                  var9 = var9 + param2 * var11;
                  param2 = 0;
                  break L24;
                } else {
                  break L24;
                }
              }
              var15 = nk.field_d[param2];
              if (param3 > param2) {
                L25: {
                  var16 = var9 >> 2085428848;
                  if (var16 >= nk.field_i) {
                    break L25;
                  } else {
                    L26: {
                      var17 = (var10 >> -60135696) - (var9 >> 47860144);
                      if (var17 != 0) {
                        break L26;
                      } else {
                        if (0 > var16) {
                          break L25;
                        } else {
                          if (nk.field_i <= var16) {
                            break L25;
                          } else {
                            wm.a(-1, var15 + var16, param4, var17, param0);
                            if (0 == 0) {
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                    }
                    L27: {
                      if (nk.field_i > var17 + var16) {
                        break L27;
                      } else {
                        var17 = -1 + (nk.field_i - var16);
                        break L27;
                      }
                    }
                    L28: {
                      if (0 <= var16) {
                        break L28;
                      } else {
                        wm.a(-1, var15, param4, var17 - -var16, param0);
                        if (0 == 0) {
                          break L25;
                        } else {
                          break L28;
                        }
                      }
                    }
                    wm.a(param6 ^ -1955582417, var15 + var16, param4, var17, param0);
                    break L25;
                  }
                }
                param2++;
                if (nk.field_c <= param2) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var15 = var15 + lk.field_b;
                  var9 = var9 + var11;
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

    abstract int a(int param0, long param1);

    public static void c(byte param0) {
        if (param0 != 96) {
            field_b = null;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    abstract long a(byte param0);

    static {
    }
}
