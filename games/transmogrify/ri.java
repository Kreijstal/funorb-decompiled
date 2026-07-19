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
        if (this.field_g == null) {
          return;
        } else {
          if (param0 > -57) {
            return;
          } else {
            this.field_g.field_h = this.field_h;
            this.field_h.field_g = this.field_g;
            this.field_h = null;
            this.field_g = null;
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
        int discarded$1 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        if (param4 >= -117) {
          discarded$1 = ri.a(-105, -75);
          if (param5 < param6) {
            L0: {
              if (param6 >= param3) {
                if (param3 > param5) {
                  ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                  return;
                } else {
                  ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                  if (var9 == 0) {
                    break L0;
                  } else {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  }
                }
              } else {
                ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                if (var9 == 0) {
                  break L0;
                } else {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  }
                }
              }
            }
            return;
          } else {
            if (param3 > param5) {
              ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
              if (var9 != 0) {
                if (param6 >= param3) {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    return;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    if (var9 == 0) {
                      return;
                    } else {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      return;
                    }
                  }
                } else {
                  ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                  if (var9 != 0) {
                    L1: {
                      if (param3 > param5) {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L1;
                      } else {
                        ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L1;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (param6 >= param3) {
                ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                if (var9 != 0) {
                  ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                  if (var9 != 0) {
                    L2: {
                      if (param6 >= param3) {
                        break L2;
                      } else {
                        ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                        break L2;
                      }
                    }
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      return;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 != 0) {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        return;
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
              } else {
                ca.a(param0, param3, param2, param1, param7, true, param6, param5, sb.field_h);
                if (var9 == 0) {
                  return;
                } else {
                  L3: {
                    ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                    ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                    if (param6 >= param3) {
                      break L3;
                    } else {
                      ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                      break L3;
                    }
                  }
                  L4: {
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L4;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 == 0) {
                        break L4;
                      } else {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L4;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          if (param5 < param6) {
            if (param6 >= param3) {
              if (param3 <= param5) {
                ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                if (var9 != 0) {
                  ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                  return;
                } else {
                  return;
                }
              } else {
                ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                return;
              }
            } else {
              ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
              if (var9 != 0) {
                L5: {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    break L5;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    break L5;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            if (param3 > param5) {
              ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
              if (var9 != 0) {
                L6: {
                  if (param6 >= param3) {
                    break L6;
                  } else {
                    ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                    break L6;
                  }
                }
                L7: {
                  if (param3 > param5) {
                    ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                    break L7;
                  } else {
                    ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                    if (var9 == 0) {
                      break L7;
                    } else {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L7;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (param6 >= param3) {
                ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                if (var9 != 0) {
                  L8: {
                    ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                    if (param6 >= param3) {
                      break L8;
                    } else {
                      ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                      break L8;
                    }
                  }
                  L9: {
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L9;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 == 0) {
                        break L9;
                      } else {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L9;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ca.a(param0, param3, param2, param1, param7, true, param6, param5, sb.field_h);
                if (var9 != 0) {
                  L10: {
                    ca.a(param0, param6, param7, param1, param2, true, param3, param5, sb.field_h);
                    ca.a(param2, param5, param0, param1, param7, true, param6, param3, sb.field_h);
                    if (param6 >= param3) {
                      break L10;
                    } else {
                      ca.a(param2, param6, param7, param1, param0, true, param5, param3, sb.field_h);
                      break L10;
                    }
                  }
                  L11: {
                    if (param3 > param5) {
                      ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                      break L11;
                    } else {
                      ca.a(param7, param5, param0, param1, param2, true, param3, param6, sb.field_h);
                      if (var9 == 0) {
                        break L11;
                      } else {
                        ca.a(param7, param3, param2, param1, param0, true, param5, param6, sb.field_h);
                        break L11;
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
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0 + param1;
              var6 = param4 + param2;
              if (sb.field_d >= param1) {
                stackOut_3_0 = sb.field_d;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (sb.field_e >= param2) {
                stackOut_6_0 = sb.field_e;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param2;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (var5_int < sb.field_b) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = sb.field_b;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 < sb.field_f) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = sb.field_f;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              L6: {
                L7: {
                  L8: {
                    var10 = stackIn_13_0;
                    if (param1 < sb.field_d) {
                      break L8;
                    } else {
                      if (sb.field_b > param1) {
                        var11 = param1 + var8 * sb.field_c;
                        var12 = -var8 + (1 - -var10) >> 521415233;
                        L9: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L8;
                          } else {
                            sb.field_h[var11] = 16777215;
                            var11 = var11 + 2 * sb.field_c;
                            if (var13 != 0) {
                              break L7;
                            } else {
                              if (var13 == 0) {
                                continue L9;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (sb.field_e > param2) {
                    break L7;
                  } else {
                    if (var6 < sb.field_f) {
                      var11 = var7 + param2 * sb.field_c;
                      var12 = var9 + (1 - var7) >> -1456379327;
                      L10: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L7;
                        } else {
                          sb.field_h[var11] = 16777215;
                          var11 += 2;
                          if (var13 != 0) {
                            break L6;
                          } else {
                            if (var13 == 0) {
                              continue L10;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                if (sb.field_d > var5_int) {
                  break L6;
                } else {
                  if (sb.field_b > var5_int) {
                    var11 = (var8 - -(1 & var5_int + -param1)) * sb.field_c - -var5_int;
                    var12 = -var8 + var10 + 1 >> -586795711;
                    L11: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L6;
                      } else {
                        sb.field_h[var11] = 16777215;
                        var11 = var11 + sb.field_c * 2;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          if (var13 == 0) {
                            continue L11;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
              if (param3 <= -9) {
                break L5;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L12: {
              if (param2 < sb.field_e) {
                break L12;
              } else {
                if (var6 < sb.field_f) {
                  var11 = var6 * sb.field_c - (-var7 + -(1 & var6 - param2));
                  var12 = 1 + (var9 - var7) >> -702428575;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      sb.field_h[var11] = 16777215;
                      var11 += 2;
                      if (var13 == 0) {
                        continue L13;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var5), "ri.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected ri() {
    }

    static {
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
