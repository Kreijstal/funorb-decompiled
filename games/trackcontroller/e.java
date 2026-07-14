/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != -1102) {
            field_a = null;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
          var19 = TrackController.field_F ? 1 : 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (ig.field_d > param8) {
              L1: {
                if (param0 >= 0) {
                  break L1;
                } else {
                  if (param4 >= 0) {
                    break L1;
                  } else {
                    if (0 <= param5) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param7 == -26361) {
                  break L2;
                } else {
                  int discarded$1 = e.a(64, -25, 3);
                  break L2;
                }
              }
              L3: {
                if (ig.field_g > param0) {
                  break L3;
                } else {
                  if (param4 < ig.field_g) {
                    break L3;
                  } else {
                    if (ig.field_g > param5) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
              }
              L4: {
                L5: {
                  var14 = param1 + -param8;
                  if (param8 == param3) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param0 << -508436624;
                        var9 = param0 << -508436624;
                        var15 = -param8 + param3;
                        var11 = (param4 - param0 << 802930896) / var15;
                        var12 = (param5 - param0 << -927902960) / var14;
                        if (var12 > var11) {
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
                        if (param8 >= 0) {
                          var16 = ig.field_i[param8];
                          L10: while (true) {
                            if (param3 <= param8) {
                              break L8;
                            } else {
                              L11: {
                                var17 = var9 >> -1065438224;
                                if ((var17 ^ -1) <= (ig.field_g ^ -1)) {
                                  break L11;
                                } else {
                                  L12: {
                                    var18 = (var10 >> 1217462736) - (var9 >> 285256432);
                                    if (var18 == 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (ig.field_g <= var17 + var18) {
                                          var18 = -1 + -var17 + ig.field_g;
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (0 <= var17) {
                                          break L14;
                                        } else {
                                          ta.a(param6, 11650, param2, var16, var17 + var18);
                                          if (0 == 0) {
                                            break L11;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      ta.a(param6, 11650, param2, var16 + var17, var18);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (var17 < ig.field_g) {
                                      ta.a(param6, param7 ^ -19323, param2, var17 + var16, var18);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              param8++;
                              if (ig.field_d > param8) {
                                var16 = var16 + ll.field_d;
                                var9 = var9 + var11;
                                var10 = var10 + var12;
                                if (0 == 0) {
                                  continue L10;
                                } else {
                                  break L9;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        } else {
                          L15: {
                            if (param3 >= 0) {
                              break L15;
                            } else {
                              param8 = -param8 + param3;
                              var10 = var10 + param8 * var12;
                              var9 = var9 + param8 * var11;
                              param8 = param3;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L15;
                              }
                            }
                          }
                          param8 = -param8;
                          var10 = var10 + var12 * param8;
                          var9 = var9 + var11 * param8;
                          param8 = 0;
                          break L9;
                        }
                      }
                      var16 = ig.field_i[param8];
                      L16: while (true) {
                        if (param3 <= param8) {
                          break L8;
                        } else {
                          L17: {
                            var17 = var9 >> -1065438224;
                            if ((var17 ^ -1) <= (ig.field_g ^ -1)) {
                              break L17;
                            } else {
                              L18: {
                                var18 = (var10 >> 1217462736) - (var9 >> 285256432);
                                if (var18 == 0) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (ig.field_g <= var17 + var18) {
                                      var18 = -1 + -var17 + ig.field_g;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (0 <= var17) {
                                      break L20;
                                    } else {
                                      ta.a(param6, 11650, param2, var16, var17 + var18);
                                      if (0 == 0) {
                                        break L17;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  ta.a(param6, 11650, param2, var16 + var17, var18);
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
                                if (var17 < ig.field_g) {
                                  ta.a(param6, param7 ^ -19323, param2, var17 + var16, var18);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          param8++;
                          if (ig.field_d > param8) {
                            var16 = var16 + ll.field_d;
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        var16 = param1 + -param3;
                        if (0 != var16) {
                          break L22;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        L24: {
                          if (var13 == 0) {
                            break L24;
                          } else {
                            var10 = param4 << -2005729872;
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var9 = param4 << 1734676976;
                        break L23;
                      }
                      var17 = param5 << 1126796592;
                      var11 = (-var9 + var17) / var16;
                      var12 = (var17 - var10) / var16;
                      break L21;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L25: {
                  L26: {
                    if (param1 != param8) {
                      break L26;
                    } else {
                      var10 = param4 << -2101196944;
                      var11 = 0;
                      var9 = param0 << -1274111120;
                      var12 = 0;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    var15 = param1 - param3;
                    if (param0 < param4) {
                      break L27;
                    } else {
                      var10 = param0 << 355144816;
                      var11 = (-param4 + param5 << 1669895312) / var15;
                      var9 = param4 << -145674064;
                      var12 = (param5 + -param0 << 1997827632) / var14;
                      if (0 == 0) {
                        break L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var12 = (-param4 + param5 << -1658295600) / var15;
                  var9 = param0 << 713277712;
                  var11 = (param5 - param0 << 1487843632) / var14;
                  var10 = param4 << -1932340400;
                  break L25;
                }
                L28: {
                  if (param8 < 0) {
                    param8 = Math.min(-param8, -param8 + param3);
                    var10 = var10 + var12 * param8;
                    var9 = var9 + param8 * var11;
                    param8 = 0;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                var13 = 0;
                break L4;
              }
              L29: {
                if (0 > param8) {
                  param8 = -param8;
                  var9 = var9 + param8 * var11;
                  var10 = var10 + var12 * param8;
                  param8 = 0;
                  break L29;
                } else {
                  break L29;
                }
              }
              var15 = ig.field_i[param8];
              if (param1 > param8) {
                L30: {
                  var16 = var9 >> 1548997680;
                  if (ig.field_g <= var16) {
                    break L30;
                  } else {
                    L31: {
                      var17 = (var10 >> 1747374640) - (var9 >> -362690576);
                      if (var17 != 0) {
                        break L31;
                      } else {
                        if (0 > var16) {
                          break L30;
                        } else {
                          if (var16 >= ig.field_g) {
                            break L30;
                          } else {
                            ta.a(param6, param7 + 38011, param2, var15 + var16, var17);
                            if (0 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                    }
                    L32: {
                      if (ig.field_g <= var17 + var16) {
                        var17 = -1 + (ig.field_g - var16);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      if (var16 >= 0) {
                        break L33;
                      } else {
                        ta.a(param6, 11650, param2, var15, var17 + var16);
                        if (0 == 0) {
                          break L30;
                        } else {
                          break L33;
                        }
                      }
                    }
                    ta.a(param6, 11650, param2, var16 + var15, var17);
                    break L30;
                  }
                }
                param8++;
                if (param8 >= ig.field_d) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  var15 = var15 + ll.field_d;
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

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 == -1932340400) {
          var3 = param2;
          if (512 == var3) {
            if ((1 & field_a[param0]) != 0) {
              return 4096;
            } else {
              L0: {
                if ((field_a[param0] & 8) == 0) {
                  stackOut_12_0 = 16384;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_11_0 = 2048;
                  stackIn_13_0 = stackOut_11_0;
                  break L0;
                }
              }
              return stackIn_13_0;
            }
          } else {
            if (var3 != -1025) {
              if (-129 == var3) {
                return 4096;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              L1: {
                if ((16 & field_a[param0]) != 0) {
                  stackOut_18_0 = 4096;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 2048;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0;
            }
          }
        } else {
          return 21;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[38];
        field_a[19] = 17;
        field_a[24] = 1;
        field_a[15] = 4;
        field_a[16] = 9;
        field_a[28] = 26;
        field_a[11] = 36;
        field_a[33] = 49;
        field_a[14] = 8;
        field_a[36] = 7;
        field_a[30] = 13;
        field_a[13] = 32;
        field_a[23] = 34;
        field_a[12] = 16;
        field_a[34] = 35;
        field_a[32] = 42;
        field_a[10] = 24;
        field_a[20] = 6;
        field_a[8] = 2;
        field_a[21] = 18;
        field_a[29] = 38;
        field_a[7] = 1;
        field_a[26] = 37;
        field_a[37] = 19;
        field_a[27] = 25;
        field_a[17] = 5;
        field_a[9] = 3;
        field_a[25] = 2;
        field_a[18] = 33;
        field_a[35] = 11;
        field_a[31] = 22;
        field_a[22] = 10;
    }
}
