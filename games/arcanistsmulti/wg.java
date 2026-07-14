/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends ag {
    private int field_K;
    int field_L;
    static qb[] field_J;
    private jl field_I;
    int field_H;

    final int g(byte param0) {
        if (param0 != -102) {
            Object var3 = null;
            boolean discarded$0 = ((wg) this).a(-7, 91, (qm) null, 21, -15, 11, 120);
        }
        return ((wg) this).field_K;
    }

    public static void d(boolean param0) {
        if (!param0) {
            return;
        }
        field_J = null;
    }

    final int c(boolean param0) {
        if (param0) {
            int discarded$0 = ((wg) this).c(true);
        }
        return ((wg) this).field_I.a(1);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
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
          var19 = ArcanistsMulti.field_G ? 1 : 0;
          if (param5 < 0) {
            break L0;
          } else {
            if (id.field_b > param7) {
              L1: {
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (param0 >= 0) {
                    break L1;
                  } else {
                    if (param8 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param2 < id.field_d) {
                  break L2;
                } else {
                  if (id.field_d > param0) {
                    break L2;
                  } else {
                    if (param8 < id.field_d) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                if (param1 == 2973) {
                  break L3;
                } else {
                  wg.d(false);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = param5 - param7;
                  if (param7 != param3) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        if (param7 == param5) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              var15 = -param3 + param5;
                              if (param0 > param2) {
                                break L9;
                              } else {
                                var12 = (param8 - param2 << 1329456784) / var14;
                                var10 = param2 << 1343523120;
                                var9 = param0 << -1915950736;
                                var11 = (-param0 + param8 << 2119191984) / var15;
                                if (0 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var10 = param0 << 171436080;
                            var11 = (param8 + -param2 << 454932592) / var14;
                            var12 = (param8 + -param0 << 1852669680) / var15;
                            var9 = param2 << -1487176688;
                            break L8;
                          }
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var10 = param0 << 1004326608;
                      var11 = 0;
                      var12 = 0;
                      var9 = param2 << 112688432;
                      break L6;
                    }
                    L10: {
                      if (0 > param7) {
                        param7 = Math.min(-param7, param3 + -param7);
                        var10 = var10 + param7 * var12;
                        var9 = var9 + var11 * param7;
                        param7 = 0;
                        break L10;
                      } else {
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
                    var10 = param2 << -2079577200;
                    var9 = param2 << -2079577200;
                    var15 = param3 + -param7;
                    var11 = (-param2 + param0 << -1005713008) / var15;
                    var12 = (-param2 + param8 << 692009488) / var14;
                    if (var11 >= var12) {
                      break L12;
                    } else {
                      var13 = 0;
                      if (0 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var13 = 1;
                  var16 = var11;
                  var11 = var12;
                  var12 = var16;
                  break L11;
                }
                L13: {
                  L14: {
                    if (param7 < 0) {
                      L15: {
                        if (param3 >= 0) {
                          break L15;
                        } else {
                          param7 = -param7 + param3;
                          var10 = var10 + var12 * param7;
                          var9 = var9 + var11 * param7;
                          param7 = param3;
                          if (0 == 0) {
                            break L13;
                          } else {
                            break L15;
                          }
                        }
                      }
                      param7 = -param7;
                      var10 = var10 + param7 * var12;
                      var9 = var9 + var11 * param7;
                      param7 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var16 = id.field_f[param7];
                  L16: while (true) {
                    if (param7 >= param3) {
                      break L13;
                    } else {
                      L17: {
                        var17 = var9 >> 58681648;
                        if ((id.field_d ^ -1) < (var17 ^ -1)) {
                          L18: {
                            var18 = -(var9 >> 1943165328) + (var10 >> -377843440);
                            if (var18 == 0) {
                              break L18;
                            } else {
                              L19: {
                                if (var17 + var18 >= id.field_d) {
                                  var18 = -1 + (id.field_d - var17);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (var17 >= 0) {
                                  break L20;
                                } else {
                                  ol.a(var16, param4, false, param6, var18 + var17);
                                  if (0 == 0) {
                                    break L17;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              ol.a(var17 + var16, param4, false, param6, var18);
                              if (0 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (0 > var17) {
                            break L17;
                          } else {
                            if (var17 < id.field_d) {
                              ol.a(var16 + var17, param4, false, param6, var18);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param7++;
                      if (param7 < id.field_b) {
                        var10 = var10 + var12;
                        var9 = var9 + var11;
                        var16 = var16 + de.field_e;
                        if (0 == 0) {
                          continue L16;
                        } else {
                          break L13;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L21: {
                  var16 = param5 + -param3;
                  if (var16 != 0) {
                    break L21;
                  } else {
                    var11 = 0;
                    var12 = 0;
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  L23: {
                    var17 = param8 << 1180424944;
                    if (var13 != 0) {
                      break L23;
                    } else {
                      var9 = param0 << -563956560;
                      if (0 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var10 = param0 << -724869392;
                  break L22;
                }
                var12 = (var17 + -var10) / var16;
                var11 = (var17 + -var9) / var16;
                break L4;
              }
              L24: {
                if (param7 >= 0) {
                  break L24;
                } else {
                  param7 = -param7;
                  var10 = var10 + param7 * var12;
                  var9 = var9 + var11 * param7;
                  param7 = 0;
                  break L24;
                }
              }
              L25: {
                var15 = id.field_f[param7];
                if (param7 >= param5) {
                  break L25;
                } else {
                  L26: {
                    var16 = var9 >> -1446405040;
                    if (var16 >= id.field_d) {
                      break L26;
                    } else {
                      L27: {
                        var17 = -(var9 >> 158942160) + (var10 >> -2104791312);
                        if (var17 == 0) {
                          break L27;
                        } else {
                          L28: {
                            if (var16 + var17 >= id.field_d) {
                              var17 = -var16 + id.field_d - 1;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          L29: {
                            if (var16 >= 0) {
                              break L29;
                            } else {
                              ol.a(var15, param4, false, param6, var16 + var17);
                              if (0 == 0) {
                                break L26;
                              } else {
                                break L29;
                              }
                            }
                          }
                          ol.a(var16 + var15, param4, false, param6, var17);
                          if (0 == 0) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      if (0 > var16) {
                        break L26;
                      } else {
                        if (var16 < id.field_d) {
                          ol.a(var16 - -var15, param4, false, param6, var17);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                  param7++;
                  if (param7 < id.field_b) {
                    var15 = var15 + de.field_e;
                    var10 = var10 + var12;
                    var9 = var9 + var11;
                    break L25;
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        var8 = -12 % ((param4 - -42) / 35);
        if (this.a(param0, param1, param2, param3, 94, param5, param6)) {
          L0: {
            var9 = -((wg) this).field_H + -param6 + param5;
            var10 = -(2 * ((wg) this).field_H) + ((wg) this).field_v;
            if (var10 < var9) {
              var9 = var10;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var9 >= 0) {
              break L1;
            } else {
              var9 = 0;
              break L1;
            }
          }
          L2: {
            var9 = ((wg) this).field_K * var9 / var10;
            if (1 != param1) {
              if ((param1 ^ -1) != -3) {
                break L2;
              } else {
                var11 = 2147483647;
                var12 = -1;
                var13 = 0;
                L3: while (true) {
                  if (var13 >= ((wg) this).field_I.a(1)) {
                    if (-1 >= (var12 ^ -1)) {
                      ((wg) this).field_I.b(var12, -11292);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var14 = -var9 + ((wg) this).field_I.c(31103, var13);
                    var14 = var14 * var14;
                    if (var14 < var11) {
                      var11 = var14;
                      var12 = var13;
                      var13++;
                      continue L3;
                    } else {
                      var13++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              ((wg) this).field_I.a(var9, 1);
              break L2;
            }
          }
          return true;
        } else {
          return false;
        }
    }

    final int a(int param0, int param1) {
        if (param0 <= param1) {
            // if_icmple L22
        } else {
            return -1;
        }
        return ((wg) this).field_I.c(31103, param1);
    }

    private wg() throws Throwable {
        throw new Error();
    }

    static {
    }
}
