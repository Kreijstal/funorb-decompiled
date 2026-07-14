/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static String field_i;
    static int field_b;
    static String field_f;
    static sl field_g;
    static int[][][] field_e;
    static r field_h;
    static String field_a;
    static int[] field_d;
    static int[][] field_c;

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = TorChallenge.field_F ? 1 : 0;
        if (param5 <= param3) {
          return;
        } else {
          if (1 + param3 < param6) {
            L0: {
              if (param6 <= param3 + 5) {
                break L0;
              } else {
                if (param4 == param2) {
                  break L0;
                } else {
                  var7 = (param2 >> -1397789087) + ((param4 >> 1902125313) - -(1 & (param2 & param4)));
                  var8 = param3;
                  var9 = param2;
                  var10 = param4;
                  var11 = param3;
                  L1: while (true) {
                    if (var11 >= param6) {
                      wc.a(param0, param1, param2, param3, var9, param5, var8);
                      wc.a(param0, param1, var10, var8, param4, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = hi.field_G[var11];
                        if (param0) {
                          stackOut_21_0 = bg.field_Q[var12];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = bj.field_b[var12];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_22_0;
                      if (var7 < var13) {
                        hi.field_G[var11] = hi.field_G[var8];
                        var8++;
                        hi.field_G[var8] = var12;
                        if (var13 < var9) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var13 > var10) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = param6 - 1;
            L3: while (true) {
              if (var7 <= param3) {
                return;
              } else {
                var8 = param3;
                L4: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = hi.field_G[var8];
                    var10 = hi.field_G[1 + var8];
                    if (nh.a(param0, 0, var9, var10)) {
                      hi.field_G[var8] = var10;
                      hi.field_G[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_g = null;
        field_i = null;
        field_a = null;
        field_h = null;
        field_e = null;
        if (param0 >= -32) {
            return;
        }
        field_f = null;
    }

    final static int a(byte param0, int param1, CharSequence param2, byte[] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        var6 = param4 + -param1;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var6 <= var7) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var8 = param2.charAt(var7 + param1);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 < 160) {
                      break L3;
                    } else {
                      if (255 < var8) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param3[var7 + param5] = (byte)var8;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (8364 != var8) {
                    break L6;
                  } else {
                    param3[var7 + param5] = (byte)-128;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var8 != 8218) {
                    break L7;
                  } else {
                    param3[param5 - -var7] = (byte)-126;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var8 == 402) {
                    break L8;
                  } else {
                    L9: {
                      if (var8 != 8222) {
                        break L9;
                      } else {
                        param3[param5 - -var7] = (byte)-124;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var8 == 8230) {
                        break L10;
                      } else {
                        L11: {
                          if (var8 == 8224) {
                            break L11;
                          } else {
                            L12: {
                              if (var8 != 8225) {
                                break L12;
                              } else {
                                param3[var7 + param5] = (byte)-121;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              if (710 != var8) {
                                break L13;
                              } else {
                                param3[var7 + param5] = (byte)-120;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              if (var8 == 8240) {
                                break L14;
                              } else {
                                L15: {
                                  if (var8 != 352) {
                                    break L15;
                                  } else {
                                    param3[param5 + var7] = (byte)-118;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if (8249 != var8) {
                                    break L16;
                                  } else {
                                    param3[var7 + param5] = (byte)-117;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L17: {
                                  if (var8 == 338) {
                                    break L17;
                                  } else {
                                    L18: {
                                      if (var8 != 381) {
                                        break L18;
                                      } else {
                                        param3[var7 + param5] = (byte)-114;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      if (8216 != var8) {
                                        break L19;
                                      } else {
                                        param3[param5 + var7] = (byte)-111;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (var8 == 8217) {
                                        break L20;
                                      } else {
                                        L21: {
                                          if (8220 == var8) {
                                            break L21;
                                          } else {
                                            L22: {
                                              if (var8 != 8221) {
                                                break L22;
                                              } else {
                                                param3[var7 + param5] = (byte)-108;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            L23: {
                                              if (var8 == 8226) {
                                                break L23;
                                              } else {
                                                L24: {
                                                  if (var8 == 8211) {
                                                    break L24;
                                                  } else {
                                                    L25: {
                                                      if (var8 != 8212) {
                                                        break L25;
                                                      } else {
                                                        param3[param5 - -var7] = (byte)-105;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    L26: {
                                                      if (var8 == 732) {
                                                        break L26;
                                                      } else {
                                                        L27: {
                                                          if (var8 != 8482) {
                                                            break L27;
                                                          } else {
                                                            param3[var7 + param5] = (byte)-103;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        L28: {
                                                          if (var8 == 353) {
                                                            break L28;
                                                          } else {
                                                            L29: {
                                                              if (8250 == var8) {
                                                                break L29;
                                                              } else {
                                                                L30: {
                                                                  if (var8 != 339) {
                                                                    break L30;
                                                                  } else {
                                                                    param3[param5 - -var7] = (byte)-100;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                }
                                                                L31: {
                                                                  if (var8 != 382) {
                                                                    break L31;
                                                                  } else {
                                                                    param3[param5 + var7] = (byte)-98;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L31;
                                                                    }
                                                                  }
                                                                }
                                                                L32: {
                                                                  if (var8 != 376) {
                                                                    break L32;
                                                                  } else {
                                                                    param3[var7 + param5] = (byte)-97;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L32;
                                                                    }
                                                                  }
                                                                }
                                                                param3[param5 + var7] = (byte)63;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            param3[param5 - -var7] = (byte)-101;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        param3[var7 + param5] = (byte)-102;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    param3[param5 + var7] = (byte)-104;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                param3[param5 + var7] = (byte)-106;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                            param3[param5 + var7] = (byte)-107;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        param3[var7 + param5] = (byte)-109;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    param3[param5 - -var7] = (byte)-110;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                param3[var7 + param5] = (byte)-116;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            param3[param5 - -var7] = (byte)-119;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L11;
                            }
                          }
                        }
                        param3[var7 + param5] = (byte)-122;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L10;
                        }
                      }
                    }
                    param3[param5 - -var7] = (byte)-123;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L8;
                    }
                  }
                }
                param3[param5 + var7] = (byte)-125;
                break L2;
              }
              var7++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L33: {
            if (param0 < -1) {
              break L33;
            } else {
              var10 = null;
              int discarded$1 = wc.a((byte) -48, 61, (CharSequence) null, (byte[]) null, -43, 68);
              break L33;
            }
          }
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_a = "Unpacking music";
        field_i = "Player";
        field_c = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_g = new sl();
    }
}
