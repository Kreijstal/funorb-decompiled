/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ma {
    static String[] field_o;
    int field_l;
    static int field_m;
    int field_n;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var13 = Pool.field_O;
        if (param4 == 2187) {
          L0: {
            var5 = param3 + param2;
            var6 = param0 - -param1;
            if (param3 > qh.field_b) {
              stackOut_4_0 = param3;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = qh.field_b;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_5_0;
            if (param0 > qh.field_c) {
              stackOut_7_0 = param0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = qh.field_c;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_8_0;
            if (qh.field_j > var5) {
              stackOut_10_0 = var5;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = qh.field_j;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_11_0;
            if (var6 >= qh.field_g) {
              stackOut_13_0 = qh.field_g;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = var6;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          var10 = stackIn_14_0;
          if (qh.field_b <= param3) {
            if (param3 < qh.field_j) {
              var11 = var8 * qh.field_l + param3;
              var12 = var10 + (1 - var8) >> 873940705;
              L4: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  if (param0 >= qh.field_c) {
                    if (var6 >= qh.field_g) {
                      L5: {
                        if (var5 < qh.field_b) {
                          break L5;
                        } else {
                          if (qh.field_j <= var5) {
                            break L5;
                          } else {
                            var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                            var12 = -var8 + 1 + var10 >> 2107416833;
                            L6: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L5;
                              } else {
                                qh.field_d[var11] = 16777215;
                                var11 = var11 + 2 * qh.field_l;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        if (param0 < qh.field_c) {
                          break L7;
                        } else {
                          if (var6 >= qh.field_g) {
                            break L7;
                          } else {
                            var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                            var12 = -var7 + 1 - -var9 >> -1897160799;
                            L8: while (true) {
                              var12--;
                              if (-1 < (var12 ^ -1)) {
                                break L7;
                              } else {
                                qh.field_d[var11] = 16777215;
                                var11 += 2;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      var11 = qh.field_l * param0 + var7;
                      var12 = 1 + (var9 + -var7) >> 885021473;
                      L9: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          L10: {
                            if (var5 < qh.field_b) {
                              break L10;
                            } else {
                              if (qh.field_j <= var5) {
                                break L10;
                              } else {
                                var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                                var12 = -var8 + 1 + var10 >> 2107416833;
                                L11: while (true) {
                                  var12--;
                                  if ((var12 ^ -1) > -1) {
                                    break L10;
                                  } else {
                                    qh.field_d[var11] = 16777215;
                                    var11 = var11 + 2 * qh.field_l;
                                    continue L11;
                                  }
                                }
                              }
                            }
                          }
                          L12: {
                            if (param0 < qh.field_c) {
                              break L12;
                            } else {
                              if (var6 >= qh.field_g) {
                                break L12;
                              } else {
                                var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                                var12 = -var7 + 1 - -var9 >> -1897160799;
                                L13: while (true) {
                                  var12--;
                                  if (-1 < (var12 ^ -1)) {
                                    break L12;
                                  } else {
                                    qh.field_d[var11] = 16777215;
                                    var11 += 2;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          qh.field_d[var11] = 16777215;
                          var11 += 2;
                          continue L9;
                        }
                      }
                    }
                  } else {
                    L14: {
                      if (var5 < qh.field_b) {
                        break L14;
                      } else {
                        if (qh.field_j <= var5) {
                          break L14;
                        } else {
                          var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                          var12 = -var8 + 1 + var10 >> 2107416833;
                          L15: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L14;
                            } else {
                              qh.field_d[var11] = 16777215;
                              var11 = var11 + 2 * qh.field_l;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (param0 < qh.field_c) {
                        break L16;
                      } else {
                        if (var6 >= qh.field_g) {
                          break L16;
                        } else {
                          var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                          var12 = -var7 + 1 - -var9 >> -1897160799;
                          L17: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              break L16;
                            } else {
                              qh.field_d[var11] = 16777215;
                              var11 += 2;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  qh.field_d[var11] = 16777215;
                  var11 = var11 + 2 * qh.field_l;
                  continue L4;
                }
              }
            } else {
              if (param0 >= qh.field_c) {
                if (var6 >= qh.field_g) {
                  if (var5 >= qh.field_b) {
                    L18: {
                      if (qh.field_j <= var5) {
                        break L18;
                      } else {
                        var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                        var12 = -var8 + 1 + var10 >> 2107416833;
                        L19: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L18;
                          } else {
                            qh.field_d[var11] = 16777215;
                            var11 = var11 + 2 * qh.field_l;
                            continue L19;
                          }
                        }
                      }
                    }
                    L20: {
                      if (param0 < qh.field_c) {
                        break L20;
                      } else {
                        if (var6 >= qh.field_g) {
                          break L20;
                        } else {
                          var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                          var12 = -var7 + 1 - -var9 >> -1897160799;
                          L21: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              break L20;
                            } else {
                              qh.field_d[var11] = 16777215;
                              var11 += 2;
                              continue L21;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L22: {
                      if (param0 < qh.field_c) {
                        break L22;
                      } else {
                        if (var6 >= qh.field_g) {
                          break L22;
                        } else {
                          var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                          var12 = -var7 + 1 - -var9 >> -1897160799;
                          L23: while (true) {
                            var12--;
                            if (-1 < var12) {
                              break L22;
                            } else {
                              qh.field_d[var11] = 16777215;
                              var11 += 2;
                              continue L23;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  var11 = qh.field_l * param0 + var7;
                  var12 = 1 + (var9 + -var7) >> 885021473;
                  L24: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      L25: {
                        if (var5 < qh.field_b) {
                          break L25;
                        } else {
                          if (qh.field_j <= var5) {
                            break L25;
                          } else {
                            var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                            var12 = -var8 + 1 + var10 >> 2107416833;
                            L26: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L25;
                              } else {
                                qh.field_d[var11] = 16777215;
                                var11 = var11 + 2 * qh.field_l;
                                continue L26;
                              }
                            }
                          }
                        }
                      }
                      L27: {
                        if (param0 < qh.field_c) {
                          break L27;
                        } else {
                          if (var6 >= qh.field_g) {
                            break L27;
                          } else {
                            var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                            var12 = -var7 + 1 - -var9 >> -1897160799;
                            L28: while (true) {
                              var12--;
                              if (-1 < (var12 ^ -1)) {
                                break L27;
                              } else {
                                qh.field_d[var11] = 16777215;
                                var11 += 2;
                                continue L28;
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      qh.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L24;
                    }
                  }
                }
              } else {
                L29: {
                  if (var5 < qh.field_b) {
                    break L29;
                  } else {
                    if (qh.field_j <= var5) {
                      break L29;
                    } else {
                      var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                      var12 = -var8 + 1 + var10 >> 2107416833;
                      L30: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L29;
                        } else {
                          qh.field_d[var11] = 16777215;
                          var11 = var11 + 2 * qh.field_l;
                          continue L30;
                        }
                      }
                    }
                  }
                }
                L31: {
                  if (param0 < qh.field_c) {
                    break L31;
                  } else {
                    if (var6 >= qh.field_g) {
                      break L31;
                    } else {
                      var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                      var12 = -var7 + 1 - -var9 >> -1897160799;
                      L32: while (true) {
                        var12--;
                        if (-1 < var12) {
                          break L31;
                        } else {
                          qh.field_d[var11] = 16777215;
                          var11 += 2;
                          continue L32;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            L33: {
              if (param0 < qh.field_c) {
                break L33;
              } else {
                if (var6 < qh.field_g) {
                  var11 = qh.field_l * param0 + var7;
                  var12 = 1 + (var9 + -var7) >> 885021473;
                  L34: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L33;
                    } else {
                      qh.field_d[var11] = 16777215;
                      var11 += 2;
                      continue L34;
                    }
                  }
                } else {
                  L35: {
                    if (var5 < qh.field_b) {
                      break L35;
                    } else {
                      if (qh.field_j <= var5) {
                        break L35;
                      } else {
                        var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                        var12 = -var8 + 1 + var10 >> 2107416833;
                        L36: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L35;
                          } else {
                            qh.field_d[var11] = 16777215;
                            var11 = var11 + 2 * qh.field_l;
                            continue L36;
                          }
                        }
                      }
                    }
                  }
                  L37: {
                    if (param0 < qh.field_c) {
                      break L37;
                    } else {
                      if (var6 >= qh.field_g) {
                        break L37;
                      } else {
                        var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                        var12 = -var7 + 1 - -var9 >> -1897160799;
                        L38: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L37;
                          } else {
                            qh.field_d[var11] = 16777215;
                            var11 += 2;
                            continue L38;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
            L39: {
              if (var5 < qh.field_b) {
                break L39;
              } else {
                if (qh.field_j <= var5) {
                  break L39;
                } else {
                  var11 = var5 + qh.field_l * (var8 - -(1 & -param3 + var5));
                  var12 = -var8 + 1 + var10 >> 2107416833;
                  L40: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L39;
                    } else {
                      qh.field_d[var11] = 16777215;
                      var11 = var11 + 2 * qh.field_l;
                      continue L40;
                    }
                  }
                }
              }
            }
            if (param0 >= qh.field_c) {
              if (var6 >= qh.field_g) {
                return;
              } else {
                var11 = qh.field_l * var6 - -var7 + (1 & -param0 + var6);
                var12 = -var7 + 1 - -var9 >> -1897160799;
                L41: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    return;
                  } else {
                    qh.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L41;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean c(int param0) {
        if (param0 != 1) {
            return false;
        }
        return lk.field_o;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -4303) {
            boolean discarded$0 = bj.c(-44);
        }
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
