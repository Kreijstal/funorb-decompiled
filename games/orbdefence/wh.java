/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static tl field_c;
    static int[] field_a;
    static String field_d;
    static int[] field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
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
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = OrbDefence.field_D ? 1 : 0;
          var5 = param2 + param0;
          var6 = param3 + param4;
          if (param2 <= ul.field_i) {
            stackOut_2_0 = ul.field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param4 <= ul.field_d) {
            stackOut_5_0 = ul.field_d;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (ul.field_e <= var5) {
            stackOut_8_0 = ul.field_e;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 < ul.field_a) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = ul.field_a;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (ul.field_i <= param2) {
          if (param2 < ul.field_e) {
            var11 = param2 + var8 * ul.field_f;
            var12 = 1 - -var10 + -var8 >> 2046957089;
            L4: while (true) {
              var12--;
              if ((var12 ^ -1) > -1) {
                if (!param1) {
                  L5: {
                    if (ul.field_d > param4) {
                      break L5;
                    } else {
                      if (ul.field_a > var6) {
                        var11 = var7 + param4 * ul.field_f;
                        var12 = var9 + 1 + -var7 >> -191030719;
                        L6: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L5;
                          } else {
                            ul.field_b[var11] = 16777215;
                            var11 += 2;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var5 < ul.field_i) {
                            break L7;
                          } else {
                            if (var5 >= ul.field_e) {
                              break L7;
                            } else {
                              var11 = ((var5 - param2 & 1) + var8) * ul.field_f - -var5;
                              var12 = -var8 + var10 + 1 >> 462028897;
                              L8: while (true) {
                                var12--;
                                if ((var12 ^ -1) > -1) {
                                  break L7;
                                } else {
                                  ul.field_b[var11] = 16777215;
                                  var11 = var11 + ul.field_f * 2;
                                  continue L8;
                                }
                              }
                            }
                          }
                        }
                        L9: {
                          if (ul.field_d > param4) {
                            break L9;
                          } else {
                            if (var6 < ul.field_a) {
                              var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                              var12 = -var7 + (1 - -var9) >> -553679807;
                              L10: while (true) {
                                var12--;
                                if (var12 < 0) {
                                  break L9;
                                } else {
                                  ul.field_b[var11] = 16777215;
                                  var11 += 2;
                                  continue L10;
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
                  L11: {
                    if (var5 < ul.field_i) {
                      break L11;
                    } else {
                      if (var5 >= ul.field_e) {
                        break L11;
                      } else {
                        var11 = ((var5 - param2 & 1) + var8) * ul.field_f - -var5;
                        var12 = -var8 + var10 + 1 >> 462028897;
                        L12: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L11;
                          } else {
                            ul.field_b[var11] = 16777215;
                            var11 = var11 + ul.field_f * 2;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (ul.field_d > param4) {
                      break L13;
                    } else {
                      if (var6 < ul.field_a) {
                        var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                        var12 = -var7 + (1 - -var9) >> -553679807;
                        L14: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L13;
                          } else {
                            ul.field_b[var11] = 16777215;
                            var11 += 2;
                            continue L14;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ul.field_b[var11] = 16777215;
                var11 = var11 + 2 * ul.field_f;
                continue L4;
              }
            }
          } else {
            if (!param1) {
              if (ul.field_d <= param4) {
                if (ul.field_a > var6) {
                  var11 = var7 + param4 * ul.field_f;
                  var12 = var9 + 1 + -var7 >> -191030719;
                  L15: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      L16: {
                        if (var5 < ul.field_i) {
                          break L16;
                        } else {
                          if (var5 >= ul.field_e) {
                            break L16;
                          } else {
                            var11 = ((var5 - param2 & 1) + var8) * ul.field_f - -var5;
                            var12 = -var8 + var10 + 1 >> 462028897;
                            L17: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L16;
                              } else {
                                ul.field_b[var11] = 16777215;
                                var11 = var11 + ul.field_f * 2;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                      if (ul.field_d <= param4) {
                        if (var6 >= ul.field_a) {
                          return;
                        } else {
                          var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                          var12 = -var7 + (1 - -var9) >> -553679807;
                          L18: while (true) {
                            var12--;
                            if (var12 < 0) {
                              return;
                            } else {
                              ul.field_b[var11] = 16777215;
                              var11 += 2;
                              continue L18;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      ul.field_b[var11] = 16777215;
                      var11 += 2;
                      continue L15;
                    }
                  }
                } else {
                  L19: {
                    if (var5 < ul.field_i) {
                      break L19;
                    } else {
                      if (var5 >= ul.field_e) {
                        break L19;
                      } else {
                        var11 = ((var5 - param2 & 1) + var8) * ul.field_f - -var5;
                        var12 = -var8 + var10 + 1 >> 462028897;
                        L20: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L19;
                          } else {
                            ul.field_b[var11] = 16777215;
                            var11 = var11 + ul.field_f * 2;
                            continue L20;
                          }
                        }
                      }
                    }
                  }
                  L21: {
                    if (ul.field_d > param4) {
                      break L21;
                    } else {
                      if (var6 < ul.field_a) {
                        var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                        var12 = -var7 + (1 - -var9) >> -553679807;
                        L22: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L21;
                          } else {
                            ul.field_b[var11] = 16777215;
                            var11 += 2;
                            continue L22;
                          }
                        }
                      } else {
                        break L21;
                      }
                    }
                  }
                  return;
                }
              } else {
                L23: {
                  if (var5 < ul.field_i) {
                    break L23;
                  } else {
                    if (var5 >= ul.field_e) {
                      break L23;
                    } else {
                      var11 = ((var5 - param2 & 1) + var8) * ul.field_f - -var5;
                      var12 = -var8 + var10 + 1 >> 462028897;
                      L24: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L23;
                        } else {
                          ul.field_b[var11] = 16777215;
                          var11 = var11 + ul.field_f * 2;
                          continue L24;
                        }
                      }
                    }
                  }
                }
                L25: {
                  if (ul.field_d > param4) {
                    break L25;
                  } else {
                    if (var6 < ul.field_a) {
                      var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                      var12 = -var7 + (1 - -var9) >> -553679807;
                      L26: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L25;
                        } else {
                          ul.field_b[var11] = 16777215;
                          var11 += 2;
                          continue L26;
                        }
                      }
                    } else {
                      break L25;
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (!param1) {
            L27: {
              if (ul.field_d > param4) {
                break L27;
              } else {
                if (ul.field_a > var6) {
                  var11 = var7 + param4 * ul.field_f;
                  var12 = var9 + 1 + -var7 >> -191030719;
                  L28: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L27;
                    } else {
                      ul.field_b[var11] = 16777215;
                      var11 += 2;
                      continue L28;
                    }
                  }
                } else {
                  L29: {
                    if (var5 < ul.field_i) {
                      break L29;
                    } else {
                      if (var5 >= ul.field_e) {
                        break L29;
                      } else {
                        var11 = ((var5 - param2 & 1) + var8) * ul.field_f - -var5;
                        var12 = -var8 + var10 + 1 >> 462028897;
                        L30: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L29;
                          } else {
                            ul.field_b[var11] = 16777215;
                            var11 = var11 + ul.field_f * 2;
                            continue L30;
                          }
                        }
                      }
                    }
                  }
                  L31: {
                    if (ul.field_d > param4) {
                      break L31;
                    } else {
                      if (var6 < ul.field_a) {
                        var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                        var12 = -var7 + (1 - -var9) >> -553679807;
                        L32: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L31;
                          } else {
                            ul.field_b[var11] = 16777215;
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
            }
            L33: {
              if (var5 < ul.field_i) {
                break L33;
              } else {
                if (var5 >= ul.field_e) {
                  break L33;
                } else {
                  var11 = ((var5 - param2 & 1) + var8) * ul.field_f - -var5;
                  var12 = -var8 + var10 + 1 >> 462028897;
                  L34: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L33;
                    } else {
                      ul.field_b[var11] = 16777215;
                      var11 = var11 + ul.field_f * 2;
                      continue L34;
                    }
                  }
                }
              }
            }
            if (ul.field_d <= param4) {
              if (var6 >= ul.field_a) {
                return;
              } else {
                var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                var12 = -var7 + (1 - -var9) >> -553679807;
                L35: while (true) {
                  var12--;
                  if (var12 < 0) {
                    return;
                  } else {
                    ul.field_b[var11] = 16777215;
                    var11 += 2;
                    continue L35;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        int var1 = 0 % ((param0 - -53) / 61);
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "start free game";
        field_a = new int[]{8, 5, 8, 10, 8, 8, 8, 10, 12, 8, 8, 6};
        field_c = new tl();
    }
}
