/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_a;

    final static ms a(boolean param0, String param1, String param2, int param3, long param4) {
        if ((param4 ^ -1L) != -1L) {
          if (param0) {
            return (ms) (Object) new jm(param4, param1);
          } else {
            if (param3 != 4684) {
              return null;
            } else {
              return (ms) (Object) new kp(param4, param1);
            }
          }
        } else {
          if (param2 == null) {
            if (param0) {
              return (ms) (Object) new jm(param4, param1);
            } else {
              if (param3 != 4684) {
                return null;
              } else {
                return (ms) (Object) new kp(param4, param1);
              }
            }
          } else {
            return (ms) (Object) new ee(param2, param1);
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -14279) {
            return;
        }
        field_a = null;
    }

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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_81_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = param3 - -param2;
          var6 = param0 + param4;
          if (param3 <= gf.field_i) {
            stackOut_2_0 = gf.field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (gf.field_a >= param4) {
            stackOut_5_0 = gf.field_a;
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
          if (gf.field_l <= var5) {
            stackOut_8_0 = gf.field_l;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        var9 = stackIn_9_0;
        if (param1 == 1) {
          L3: {
            if (gf.field_f > var6) {
              stackOut_80_0 = var6;
              stackIn_81_0 = stackOut_80_0;
              break L3;
            } else {
              stackOut_79_0 = gf.field_f;
              stackIn_81_0 = stackOut_79_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_81_0;
            if (gf.field_i > param3) {
              break L4;
            } else {
              if (gf.field_l > param3) {
                var11 = gf.field_b * var8 + param3;
                var12 = var10 + 1 + -var8 >> 632687489;
                L5: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L4;
                  } else {
                    gf.field_h[var11] = 16777215;
                    var11 = var11 + gf.field_b * 2;
                    continue L5;
                  }
                }
              } else {
                if (param4 >= gf.field_a) {
                  if (gf.field_f <= var6) {
                    L6: {
                      if (gf.field_i > var5) {
                        break L6;
                      } else {
                        if (var5 >= gf.field_l) {
                          break L6;
                        } else {
                          var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                          var12 = 1 - (-var10 + var8) >> 279857089;
                          L7: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L6;
                            } else {
                              gf.field_h[var11] = 16777215;
                              var11 = var11 + gf.field_b * 2;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (param4 < gf.field_a) {
                        break L8;
                      } else {
                        if (gf.field_f <= var6) {
                          break L8;
                        } else {
                          var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                          var12 = -var7 + (1 - -var9) >> 1568068993;
                          L9: while (true) {
                            var12--;
                            if (0 > var12) {
                              break L8;
                            } else {
                              gf.field_h[var11] = 16777215;
                              var11 += 2;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    var11 = var7 + param4 * gf.field_b;
                    var12 = -var7 + (1 - -var9) >> -552467103;
                    L10: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        L11: {
                          if (gf.field_i > var5) {
                            break L11;
                          } else {
                            if (var5 >= gf.field_l) {
                              break L11;
                            } else {
                              var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                              var12 = 1 - (-var10 + var8) >> 279857089;
                              L12: while (true) {
                                var12--;
                                if ((var12 ^ -1) > -1) {
                                  break L11;
                                } else {
                                  gf.field_h[var11] = 16777215;
                                  var11 = var11 + gf.field_b * 2;
                                  continue L12;
                                }
                              }
                            }
                          }
                        }
                        L13: {
                          if (param4 < gf.field_a) {
                            break L13;
                          } else {
                            if (gf.field_f <= var6) {
                              break L13;
                            } else {
                              var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                              var12 = -var7 + (1 - -var9) >> 1568068993;
                              L14: while (true) {
                                var12--;
                                if (0 > var12) {
                                  break L13;
                                } else {
                                  gf.field_h[var11] = 16777215;
                                  var11 += 2;
                                  continue L14;
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        gf.field_h[var11] = 16777215;
                        var11 += 2;
                        continue L10;
                      }
                    }
                  }
                } else {
                  L15: {
                    if (gf.field_i > var5) {
                      break L15;
                    } else {
                      if (var5 >= gf.field_l) {
                        break L15;
                      } else {
                        var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                        var12 = 1 - (-var10 + var8) >> 279857089;
                        L16: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L15;
                          } else {
                            gf.field_h[var11] = 16777215;
                            var11 = var11 + gf.field_b * 2;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                  L17: {
                    if (param4 < gf.field_a) {
                      break L17;
                    } else {
                      if (gf.field_f <= var6) {
                        break L17;
                      } else {
                        var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                        var12 = -var7 + (1 - -var9) >> 1568068993;
                        L18: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L17;
                          } else {
                            gf.field_h[var11] = 16777215;
                            var11 += 2;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (param4 >= gf.field_a) {
            if (gf.field_f > var6) {
              var11 = var7 + param4 * gf.field_b;
              var12 = -var7 + (1 - -var9) >> -552467103;
              L19: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  L20: {
                    if (gf.field_i > var5) {
                      break L20;
                    } else {
                      if (var5 >= gf.field_l) {
                        break L20;
                      } else {
                        var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                        var12 = 1 - (-var10 + var8) >> 279857089;
                        L21: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L20;
                          } else {
                            gf.field_h[var11] = 16777215;
                            var11 = var11 + gf.field_b * 2;
                            continue L21;
                          }
                        }
                      }
                    }
                  }
                  L22: {
                    if (param4 < gf.field_a) {
                      break L22;
                    } else {
                      if (gf.field_f <= var6) {
                        break L22;
                      } else {
                        var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                        var12 = -var7 + (1 - -var9) >> 1568068993;
                        L23: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L22;
                          } else {
                            gf.field_h[var11] = 16777215;
                            var11 += 2;
                            continue L23;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  gf.field_h[var11] = 16777215;
                  var11 += 2;
                  continue L19;
                }
              }
            } else {
              L24: {
                if (gf.field_i > var5) {
                  break L24;
                } else {
                  if (var5 >= gf.field_l) {
                    break L24;
                  } else {
                    var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                    var12 = 1 - (-var10 + var8) >> 279857089;
                    L25: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L24;
                      } else {
                        gf.field_h[var11] = 16777215;
                        var11 = var11 + gf.field_b * 2;
                        continue L25;
                      }
                    }
                  }
                }
              }
              L26: {
                if (param4 < gf.field_a) {
                  break L26;
                } else {
                  if (gf.field_f <= var6) {
                    break L26;
                  } else {
                    var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                    var12 = -var7 + (1 - -var9) >> 1568068993;
                    L27: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L26;
                      } else {
                        gf.field_h[var11] = 16777215;
                        var11 += 2;
                        continue L27;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L28: {
              if (gf.field_i > var5) {
                break L28;
              } else {
                if (var5 >= gf.field_l) {
                  break L28;
                } else {
                  var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                  var12 = 1 - (-var10 + var8) >> 279857089;
                  L29: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L28;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 = var11 + gf.field_b * 2;
                      continue L29;
                    }
                  }
                }
              }
            }
            L30: {
              if (param4 < gf.field_a) {
                break L30;
              } else {
                if (gf.field_f <= var6) {
                  break L30;
                } else {
                  var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                  var12 = -var7 + (1 - -var9) >> 1568068993;
                  L31: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L30;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 += 2;
                      continue L31;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          L32: {
            dd.a(-10);
            if (gf.field_f > var6) {
              stackOut_12_0 = var6;
              stackIn_13_0 = stackOut_12_0;
              break L32;
            } else {
              stackOut_11_0 = gf.field_f;
              stackIn_13_0 = stackOut_11_0;
              break L32;
            }
          }
          L33: {
            var10 = stackIn_13_0;
            if (gf.field_i > param3) {
              break L33;
            } else {
              if (gf.field_l > param3) {
                var11 = gf.field_b * var8 + param3;
                var12 = var10 + 1 + -var8 >> 632687489;
                L34: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    break L33;
                  } else {
                    gf.field_h[var11] = 16777215;
                    var11 = var11 + gf.field_b * 2;
                    continue L34;
                  }
                }
              } else {
                L35: {
                  if (param4 < gf.field_a) {
                    break L35;
                  } else {
                    if (gf.field_f > var6) {
                      var11 = var7 + param4 * gf.field_b;
                      var12 = -var7 + (1 - -var9) >> -552467103;
                      L36: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L35;
                        } else {
                          gf.field_h[var11] = 16777215;
                          var11 += 2;
                          continue L36;
                        }
                      }
                    } else {
                      break L35;
                    }
                  }
                }
                L37: {
                  if (gf.field_i > var5) {
                    break L37;
                  } else {
                    if (var5 >= gf.field_l) {
                      break L37;
                    } else {
                      var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                      var12 = 1 - (-var10 + var8) >> 279857089;
                      L38: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L37;
                        } else {
                          gf.field_h[var11] = 16777215;
                          var11 = var11 + gf.field_b * 2;
                          continue L38;
                        }
                      }
                    }
                  }
                }
                L39: {
                  if (param4 < gf.field_a) {
                    break L39;
                  } else {
                    if (gf.field_f <= var6) {
                      break L39;
                    } else {
                      var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                      var12 = -var7 + (1 - -var9) >> 1568068993;
                      L40: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L39;
                        } else {
                          gf.field_h[var11] = 16777215;
                          var11 += 2;
                          continue L40;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          if (param4 >= gf.field_a) {
            if (gf.field_f > var6) {
              var11 = var7 + param4 * gf.field_b;
              var12 = -var7 + (1 - -var9) >> -552467103;
              L41: while (true) {
                var12--;
                if (-1 >= (var12 ^ -1)) {
                  gf.field_h[var11] = 16777215;
                  var11 += 2;
                  continue L41;
                } else {
                  L42: {
                    if (gf.field_i > var5) {
                      break L42;
                    } else {
                      if (var5 >= gf.field_l) {
                        break L42;
                      } else {
                        var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                        var12 = 1 - (-var10 + var8) >> 279857089;
                        L43: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L42;
                          } else {
                            gf.field_h[var11] = 16777215;
                            var11 = var11 + gf.field_b * 2;
                            continue L43;
                          }
                        }
                      }
                    }
                  }
                  L44: {
                    if (param4 < gf.field_a) {
                      break L44;
                    } else {
                      if (gf.field_f <= var6) {
                        break L44;
                      } else {
                        var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                        var12 = -var7 + (1 - -var9) >> 1568068993;
                        L45: while (true) {
                          var12--;
                          if (0 > var12) {
                            break L44;
                          } else {
                            gf.field_h[var11] = 16777215;
                            var11 += 2;
                            continue L45;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              L46: {
                if (gf.field_i > var5) {
                  break L46;
                } else {
                  if (var5 >= gf.field_l) {
                    break L46;
                  } else {
                    var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                    var12 = 1 - (-var10 + var8) >> 279857089;
                    L47: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L46;
                      } else {
                        gf.field_h[var11] = 16777215;
                        var11 = var11 + gf.field_b * 2;
                        continue L47;
                      }
                    }
                  }
                }
              }
              L48: {
                if (param4 < gf.field_a) {
                  break L48;
                } else {
                  if (gf.field_f <= var6) {
                    break L48;
                  } else {
                    var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                    var12 = -var7 + (1 - -var9) >> 1568068993;
                    L49: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L48;
                      } else {
                        gf.field_h[var11] = 16777215;
                        var11 += 2;
                        continue L49;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L50: {
              if (gf.field_i > var5) {
                break L50;
              } else {
                if (var5 >= gf.field_l) {
                  break L50;
                } else {
                  var11 = gf.field_b * ((1 & var5 + -param3) + var8) + var5;
                  var12 = 1 - (-var10 + var8) >> 279857089;
                  L51: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L50;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 = var11 + gf.field_b * 2;
                      continue L51;
                    }
                  }
                }
              }
            }
            L52: {
              if (param4 < gf.field_a) {
                break L52;
              } else {
                if (gf.field_f <= var6) {
                  break L52;
                } else {
                  var11 = (1 & var6 + -param4) + (var6 * gf.field_b - -var7);
                  var12 = -var7 + (1 - -var9) >> 1568068993;
                  L53: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L52;
                    } else {
                      gf.field_h[var11] = 16777215;
                      var11 += 2;
                      continue L53;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        fb var4 = null;
        sl var5 = null;
        int var3 = -27 % ((12 - param2) / 47);
        if (param0 != kf.field_g) {
            var4 = (fb) (Object) ea.field_b.a(65280, (long)kf.field_g);
            kf.field_g = param0;
            if (!(var4 == null)) {
                var4.field_jc = null;
            }
            var5 = js.field_f;
            var5.h(param1, 255);
            var5.c(3, (byte) -92);
            var5.c(11, (byte) -69);
            var5.d(param0, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel";
    }
}
