/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ri extends wf {
    long field_j;
    static cj field_k;
    ri field_h;
    ri field_g;
    static String field_i;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = -12 % ((-73 - param0) / 47);
        param1 = param1 & 8191;
        if ((param1 ^ -1) <= -4097) {
          L0: {
            if ((param1 ^ -1) <= -6145) {
              stackOut_7_0 = nj.field_r[-6144 + param1];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -nj.field_r[-param1 + 6144];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 2048) {
              stackOut_3_0 = -nj.field_r[-2048 + param1];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = nj.field_r[-param1 + 2048];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void b(byte param0) {
        if (((ri) this).field_g == null) {
          return;
        } else {
          if (param0 > -57) {
            return;
          } else {
            ((ri) this).field_g.field_h = ((ri) this).field_h;
            ((ri) this).field_h.field_g = ((ri) this).field_g;
            ((ri) this).field_h = null;
            ((ri) this).field_g = null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 35 / ((-82 - param0) / 43);
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        if (param4 >= -117) {
          int discarded$1 = ri.a(-105, -75);
          if (param5 < param6) {
            if (param6 >= param3) {
              if (param3 <= param5) {
                ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                return;
              } else {
                ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                return;
              }
            } else {
              ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
              return;
            }
          } else {
            if (param3 <= param5) {
              if (param6 < param3) {
                ca.a(param0, param3, param2, param1, param7, true, param6, param5, sb.field_h);
                return;
              } else {
                ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                return;
              }
            } else {
              ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
              return;
            }
          }
        } else {
          if (param5 < param6) {
            if (param6 >= param3) {
              if (param3 <= param5) {
                ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                return;
              } else {
                ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                return;
              }
            } else {
              ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
              return;
            }
          } else {
            if (param3 <= param5) {
              if (param6 < param3) {
                ca.a(param0, param3, param2, param1, param7, true, param6, param5, sb.field_h);
                return;
              } else {
                ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                return;
              }
            } else {
              ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
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
          var13 = Transmogrify.field_A ? 1 : 0;
          var5 = param0 + param1;
          var6 = param4 + param2;
          if (sb.field_d >= param1) {
            stackOut_2_0 = sb.field_d;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (sb.field_e >= param2) {
            stackOut_5_0 = sb.field_e;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 < sb.field_b) {
            stackOut_8_0 = var5;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = sb.field_b;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 < sb.field_f) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = sb.field_f;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (param1 >= sb.field_d) {
          if (sb.field_b > param1) {
            var11 = param1 + var8 * sb.field_c;
            var12 = -var8 + (1 - -var10) >> 521415233;
            L4: while (true) {
              var12--;
              if ((var12 ^ -1) > -1) {
                L5: {
                  if (sb.field_e > param2) {
                    break L5;
                  } else {
                    if (var6 < sb.field_f) {
                      var11 = var7 + param2 * sb.field_c;
                      var12 = var9 + (1 - var7) >> -1456379327;
                      L6: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L5;
                        } else {
                          sb.field_h[var11] = 16777215;
                          var11 += 2;
                          continue L6;
                        }
                      }
                    } else {
                      L7: {
                        if (sb.field_d > var5) {
                          break L7;
                        } else {
                          if (sb.field_b > var5) {
                            var11 = (var8 - -(1 & var5 + -param1)) * sb.field_c - -var5;
                            var12 = -var8 + var10 + 1 >> -586795711;
                            L8: while (true) {
                              var12--;
                              if ((var12 ^ -1) > -1) {
                                break L7;
                              } else {
                                sb.field_h[var11] = 16777215;
                                var11 = var11 + sb.field_c * 2;
                                continue L8;
                              }
                            }
                          } else {
                            if (param3 <= -9) {
                              L9: {
                                if (param2 < sb.field_e) {
                                  break L9;
                                } else {
                                  if (var6 < sb.field_f) {
                                    var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                                    var12 = 1 + (var9 - var7) >> -702428575;
                                    L10: while (true) {
                                      var12--;
                                      if (var12 < 0) {
                                        break L9;
                                      } else {
                                        sb.field_h[var11] = 16777215;
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
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      if (param3 <= -9) {
                        L11: {
                          if (param2 < sb.field_e) {
                            break L11;
                          } else {
                            if (var6 < sb.field_f) {
                              var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                              var12 = 1 + (var9 - var7) >> -702428575;
                              L12: while (true) {
                                var12--;
                                if (var12 < 0) {
                                  break L11;
                                } else {
                                  sb.field_h[var11] = 16777215;
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
                      } else {
                        return;
                      }
                    }
                  }
                }
                L13: {
                  if (sb.field_d > var5) {
                    break L13;
                  } else {
                    if (sb.field_b > var5) {
                      var11 = (var8 - -(1 & var5 + -param1)) * sb.field_c - -var5;
                      var12 = -var8 + var10 + 1 >> -586795711;
                      L14: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L13;
                        } else {
                          sb.field_h[var11] = 16777215;
                          var11 = var11 + sb.field_c * 2;
                          continue L14;
                        }
                      }
                    } else {
                      if (param3 <= -9) {
                        L15: {
                          if (param2 < sb.field_e) {
                            break L15;
                          } else {
                            if (var6 < sb.field_f) {
                              var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                              var12 = 1 + (var9 - var7) >> -702428575;
                              L16: while (true) {
                                var12--;
                                if (var12 < 0) {
                                  break L15;
                                } else {
                                  sb.field_h[var11] = 16777215;
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
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (param3 <= -9) {
                  L17: {
                    if (param2 < sb.field_e) {
                      break L17;
                    } else {
                      if (var6 < sb.field_f) {
                        var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                        var12 = 1 + (var9 - var7) >> -702428575;
                        L18: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L17;
                          } else {
                            sb.field_h[var11] = 16777215;
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
                  return;
                }
              } else {
                sb.field_h[var11] = 16777215;
                var11 = var11 + 2 * sb.field_c;
                continue L4;
              }
            }
          } else {
            if (sb.field_e <= param2) {
              if (var6 < sb.field_f) {
                var11 = var7 + param2 * sb.field_c;
                var12 = var9 + (1 - var7) >> -1456379327;
                L19: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    L20: {
                      if (sb.field_d > var5) {
                        break L20;
                      } else {
                        if (sb.field_b > var5) {
                          var11 = (var8 - -(1 & var5 + -param1)) * sb.field_c - -var5;
                          var12 = -var8 + var10 + 1 >> -586795711;
                          L21: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L20;
                            } else {
                              sb.field_h[var11] = 16777215;
                              var11 = var11 + sb.field_c * 2;
                              continue L21;
                            }
                          }
                        } else {
                          if (param3 <= -9) {
                            L22: {
                              if (param2 < sb.field_e) {
                                break L22;
                              } else {
                                if (var6 < sb.field_f) {
                                  var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                                  var12 = 1 + (var9 - var7) >> -702428575;
                                  L23: while (true) {
                                    var12--;
                                    if (var12 < 0) {
                                      break L22;
                                    } else {
                                      sb.field_h[var11] = 16777215;
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
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    if (param3 <= -9) {
                      L24: {
                        if (param2 < sb.field_e) {
                          break L24;
                        } else {
                          if (var6 < sb.field_f) {
                            var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                            var12 = 1 + (var9 - var7) >> -702428575;
                            L25: while (true) {
                              var12--;
                              if (var12 < 0) {
                                break L24;
                              } else {
                                sb.field_h[var11] = 16777215;
                                var11 += 2;
                                continue L25;
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
                    sb.field_h[var11] = 16777215;
                    var11 += 2;
                    continue L19;
                  }
                }
              } else {
                L26: {
                  if (sb.field_d > var5) {
                    break L26;
                  } else {
                    if (sb.field_b > var5) {
                      var11 = (var8 - -(1 & var5 + -param1)) * sb.field_c - -var5;
                      var12 = -var8 + var10 + 1 >> -586795711;
                      L27: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L26;
                        } else {
                          sb.field_h[var11] = 16777215;
                          var11 = var11 + sb.field_c * 2;
                          continue L27;
                        }
                      }
                    } else {
                      break L26;
                    }
                  }
                }
                if (param3 <= -9) {
                  L28: {
                    if (param2 < sb.field_e) {
                      break L28;
                    } else {
                      if (var6 < sb.field_f) {
                        var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                        var12 = 1 + (var9 - var7) >> -702428575;
                        L29: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L28;
                          } else {
                            sb.field_h[var11] = 16777215;
                            var11 += 2;
                            continue L29;
                          }
                        }
                      } else {
                        break L28;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              L30: {
                if (sb.field_d > var5) {
                  break L30;
                } else {
                  if (sb.field_b > var5) {
                    var11 = (var8 - -(1 & var5 + -param1)) * sb.field_c - -var5;
                    var12 = -var8 + var10 + 1 >> -586795711;
                    L31: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L30;
                      } else {
                        sb.field_h[var11] = 16777215;
                        var11 = var11 + sb.field_c * 2;
                        continue L31;
                      }
                    }
                  } else {
                    break L30;
                  }
                }
              }
              if (param3 > -9) {
                return;
              } else {
                L32: {
                  if (param2 < sb.field_e) {
                    break L32;
                  } else {
                    if (var6 < sb.field_f) {
                      var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                      var12 = 1 + (var9 - var7) >> -702428575;
                      L33: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L32;
                        } else {
                          sb.field_h[var11] = 16777215;
                          var11 += 2;
                          continue L33;
                        }
                      }
                    } else {
                      break L32;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          L34: {
            if (sb.field_e > param2) {
              break L34;
            } else {
              if (var6 < sb.field_f) {
                var11 = var7 + param2 * sb.field_c;
                var12 = var9 + (1 - var7) >> -1456379327;
                L35: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L34;
                  } else {
                    sb.field_h[var11] = 16777215;
                    var11 += 2;
                    continue L35;
                  }
                }
              } else {
                L36: {
                  if (sb.field_d > var5) {
                    break L36;
                  } else {
                    if (sb.field_b > var5) {
                      var11 = (var8 - -(1 & var5 + -param1)) * sb.field_c - -var5;
                      var12 = -var8 + var10 + 1 >> -586795711;
                      L37: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L36;
                        } else {
                          sb.field_h[var11] = 16777215;
                          var11 = var11 + sb.field_c * 2;
                          continue L37;
                        }
                      }
                    } else {
                      break L36;
                    }
                  }
                }
                if (param3 > -9) {
                  return;
                } else {
                  L38: {
                    if (param2 < sb.field_e) {
                      break L38;
                    } else {
                      if (var6 < sb.field_f) {
                        var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                        var12 = 1 + (var9 - var7) >> -702428575;
                        L39: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L38;
                          } else {
                            sb.field_h[var11] = 16777215;
                            var11 += 2;
                            continue L39;
                          }
                        }
                      } else {
                        break L38;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L40: {
            if (sb.field_d > var5) {
              break L40;
            } else {
              if (sb.field_b > var5) {
                var11 = (var8 - -(1 & var5 + -param1)) * sb.field_c - -var5;
                var12 = -var8 + var10 + 1 >> -586795711;
                L41: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L40;
                  } else {
                    sb.field_h[var11] = 16777215;
                    var11 = var11 + sb.field_c * 2;
                    continue L41;
                  }
                }
              } else {
                if (param3 > -9) {
                  return;
                } else {
                  L42: {
                    if (param2 < sb.field_e) {
                      break L42;
                    } else {
                      if (var6 < sb.field_f) {
                        var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                        var12 = 1 + (var9 - var7) >> -702428575;
                        L43: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L42;
                          } else {
                            sb.field_h[var11] = 16777215;
                            var11 += 2;
                            continue L43;
                          }
                        }
                      } else {
                        break L42;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (param3 <= -9) {
            if (param2 >= sb.field_e) {
              if (var6 >= sb.field_f) {
                return;
              } else {
                var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                var12 = 1 + (var9 - var7) >> -702428575;
                L44: while (true) {
                  var12--;
                  if (var12 < 0) {
                    return;
                  } else {
                    sb.field_h[var11] = 16777215;
                    var11 += 2;
                    continue L44;
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

    protected ri() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
