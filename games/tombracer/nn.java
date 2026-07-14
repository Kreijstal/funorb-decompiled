/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static int field_b;
    static vna field_a;
    static int field_c;

    public static void a(byte param0) {
        if (param0 < 8) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          var5 = param3 + param0;
          var6 = param1 - -param2;
          if (bea.field_b >= param0) {
            stackOut_2_0 = bea.field_b;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param1 > bea.field_h) {
            stackOut_5_0 = param1;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = bea.field_h;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (bea.field_d <= var5) {
            stackOut_8_0 = bea.field_d;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var9 = stackIn_9_0;
        if (!param4) {
          L3: {
            if (bea.field_k <= var6) {
              stackOut_13_0 = bea.field_k;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = var6;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          var10 = stackIn_14_0;
          if (param0 >= bea.field_b) {
            if (bea.field_d > param0) {
              var11 = param0 + var8 * bea.field_g;
              var12 = -var8 + var10 + 1 >> -1595865439;
              L4: while (true) {
                var12--;
                if (0 > var12) {
                  L5: {
                    if (bea.field_h > param1) {
                      break L5;
                    } else {
                      if (bea.field_k > var6) {
                        var11 = var7 + bea.field_g * param1;
                        var12 = -var7 + (var9 + 1) >> 734063105;
                        L6: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L5;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var5 < bea.field_b) {
                            break L7;
                          } else {
                            if (var5 < bea.field_d) {
                              var11 = var5 + (var8 + (-param0 + var5 & 1)) * bea.field_g;
                              var12 = var10 + 1 + -var8 >> -1323923199;
                              L8: while (true) {
                                var12--;
                                if ((var12 ^ -1) > -1) {
                                  break L7;
                                } else {
                                  bea.field_l[var11] = 16777215;
                                  var11 = var11 + 2 * bea.field_g;
                                  continue L8;
                                }
                              }
                            } else {
                              L9: {
                                if (bea.field_h > param1) {
                                  break L9;
                                } else {
                                  if (bea.field_k > var6) {
                                    var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                                    var12 = var9 + 1 + -var7 >> -2064929471;
                                    L10: while (true) {
                                      var12--;
                                      if (-1 < (var12 ^ -1)) {
                                        break L9;
                                      } else {
                                        bea.field_l[var11] = 16777215;
                                        var11 += 2;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        L11: {
                          if (bea.field_h > param1) {
                            break L11;
                          } else {
                            if (bea.field_k > var6) {
                              var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                              var12 = var9 + 1 + -var7 >> -2064929471;
                              L12: while (true) {
                                var12--;
                                if (-1 < (var12 ^ -1)) {
                                  break L11;
                                } else {
                                  bea.field_l[var11] = 16777215;
                                  var11 += 2;
                                  continue L12;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L13: {
                    if (var5 < bea.field_b) {
                      break L13;
                    } else {
                      if (var5 < bea.field_d) {
                        var11 = var5 + (var8 + (-param0 + var5 & 1)) * bea.field_g;
                        var12 = var10 + 1 + -var8 >> -1323923199;
                        L14: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L13;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 = var11 + 2 * bea.field_g;
                            continue L14;
                          }
                        }
                      } else {
                        L15: {
                          if (bea.field_h > param1) {
                            break L15;
                          } else {
                            if (bea.field_k > var6) {
                              var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                              var12 = var9 + 1 + -var7 >> -2064929471;
                              L16: while (true) {
                                var12--;
                                if (-1 < (var12 ^ -1)) {
                                  break L15;
                                } else {
                                  bea.field_l[var11] = 16777215;
                                  var11 += 2;
                                  continue L16;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L17: {
                    if (bea.field_h > param1) {
                      break L17;
                    } else {
                      if (bea.field_k > var6) {
                        var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                        var12 = var9 + 1 + -var7 >> -2064929471;
                        L18: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L17;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L18;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  bea.field_l[var11] = 16777215;
                  var11 = var11 + 2 * bea.field_g;
                  continue L4;
                }
              }
            } else {
              if (bea.field_h <= param1) {
                if (bea.field_k > var6) {
                  var11 = var7 + bea.field_g * param1;
                  var12 = -var7 + (var9 + 1) >> 734063105;
                  L19: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      L20: {
                        if (var5 < bea.field_b) {
                          break L20;
                        } else {
                          if (var5 < bea.field_d) {
                            var11 = var5 + (var8 + (-param0 + var5 & 1)) * bea.field_g;
                            var12 = var10 + 1 + -var8 >> -1323923199;
                            L21: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L20;
                              } else {
                                bea.field_l[var11] = 16777215;
                                var11 = var11 + 2 * bea.field_g;
                                continue L21;
                              }
                            }
                          } else {
                            L22: {
                              if (bea.field_h > param1) {
                                break L22;
                              } else {
                                if (bea.field_k > var6) {
                                  var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                                  var12 = var9 + 1 + -var7 >> -2064929471;
                                  L23: while (true) {
                                    var12--;
                                    if (-1 < (var12 ^ -1)) {
                                      break L22;
                                    } else {
                                      bea.field_l[var11] = 16777215;
                                      var11 += 2;
                                      continue L23;
                                    }
                                  }
                                } else {
                                  break L22;
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (bea.field_h <= param1) {
                        if (bea.field_k > var6) {
                          var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                          var12 = var9 + 1 + -var7 >> -2064929471;
                          L24: while (true) {
                            var12--;
                            if (-1 < (var12 ^ -1)) {
                              return;
                            } else {
                              bea.field_l[var11] = 16777215;
                              var11 += 2;
                              continue L24;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      bea.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L19;
                    }
                  }
                } else {
                  L25: {
                    if (var5 < bea.field_b) {
                      break L25;
                    } else {
                      if (var5 < bea.field_d) {
                        var11 = var5 + (var8 + (-param0 + var5 & 1)) * bea.field_g;
                        var12 = var10 + 1 + -var8 >> -1323923199;
                        L26: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L25;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 = var11 + 2 * bea.field_g;
                            continue L26;
                          }
                        }
                      } else {
                        break L25;
                      }
                    }
                  }
                  L27: {
                    if (bea.field_h > param1) {
                      break L27;
                    } else {
                      if (bea.field_k > var6) {
                        var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                        var12 = var9 + 1 + -var7 >> -2064929471;
                        L28: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L27;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L28;
                          }
                        }
                      } else {
                        break L27;
                      }
                    }
                  }
                  return;
                }
              } else {
                L29: {
                  if (var5 < bea.field_b) {
                    break L29;
                  } else {
                    if (var5 < bea.field_d) {
                      var11 = var5 + (var8 + (-param0 + var5 & 1)) * bea.field_g;
                      var12 = var10 + 1 + -var8 >> -1323923199;
                      L30: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L29;
                        } else {
                          bea.field_l[var11] = 16777215;
                          var11 = var11 + 2 * bea.field_g;
                          continue L30;
                        }
                      }
                    } else {
                      break L29;
                    }
                  }
                }
                L31: {
                  if (bea.field_h > param1) {
                    break L31;
                  } else {
                    if (bea.field_k > var6) {
                      var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                      var12 = var9 + 1 + -var7 >> -2064929471;
                      L32: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L31;
                        } else {
                          bea.field_l[var11] = 16777215;
                          var11 += 2;
                          continue L32;
                        }
                      }
                    } else {
                      break L31;
                    }
                  }
                }
                return;
              }
            }
          } else {
            L33: {
              if (bea.field_h > param1) {
                break L33;
              } else {
                if (bea.field_k > var6) {
                  var11 = var7 + bea.field_g * param1;
                  var12 = -var7 + (var9 + 1) >> 734063105;
                  L34: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L33;
                    } else {
                      bea.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L34;
                    }
                  }
                } else {
                  L35: {
                    if (var5 < bea.field_b) {
                      break L35;
                    } else {
                      if (var5 < bea.field_d) {
                        var11 = var5 + (var8 + (-param0 + var5 & 1)) * bea.field_g;
                        var12 = var10 + 1 + -var8 >> -1323923199;
                        L36: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L35;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 = var11 + 2 * bea.field_g;
                            continue L36;
                          }
                        }
                      } else {
                        break L35;
                      }
                    }
                  }
                  L37: {
                    if (bea.field_h > param1) {
                      break L37;
                    } else {
                      if (bea.field_k > var6) {
                        var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                        var12 = var9 + 1 + -var7 >> -2064929471;
                        L38: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L37;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L38;
                          }
                        }
                      } else {
                        break L37;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L39: {
              if (var5 < bea.field_b) {
                break L39;
              } else {
                if (var5 < bea.field_d) {
                  var11 = var5 + (var8 + (-param0 + var5 & 1)) * bea.field_g;
                  var12 = var10 + 1 + -var8 >> -1323923199;
                  L40: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L39;
                    } else {
                      bea.field_l[var11] = 16777215;
                      var11 = var11 + 2 * bea.field_g;
                      continue L40;
                    }
                  }
                } else {
                  L41: {
                    if (bea.field_h > param1) {
                      break L41;
                    } else {
                      if (bea.field_k > var6) {
                        var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                        var12 = var9 + 1 + -var7 >> -2064929471;
                        L42: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L41;
                          } else {
                            bea.field_l[var11] = 16777215;
                            var11 += 2;
                            continue L42;
                          }
                        }
                      } else {
                        break L41;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (bea.field_h <= param1) {
              if (bea.field_k <= var6) {
                return;
              } else {
                var11 = var7 + (var6 * bea.field_g + (-param1 + var6 & 1));
                var12 = var9 + 1 + -var7 >> -2064929471;
                L43: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    return;
                  } else {
                    bea.field_l[var11] = 16777215;
                    var11 += 2;
                    continue L43;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 3;
        field_a = new vna();
    }
}
