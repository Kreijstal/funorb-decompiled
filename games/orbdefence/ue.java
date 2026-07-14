/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends s {
    private int field_K;
    int field_L;
    static ba field_G;
    int field_I;
    private tj field_N;
    static int[] field_H;
    static String field_J;

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        L0: {
          var14 = OrbDefence.field_D ? 1 : 0;
          if (param0 < -115) {
            break L0;
          } else {
            var15 = null;
            boolean discarded$1 = ((ue) this).a((byte) -22, (pj) null, -98, 37, 41, 57, 122);
            break L0;
          }
        }
        if (!super.a((byte) -125, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L1: {
            var8 = -((ue) this).field_I + -param3 + param5;
            var9 = -(2 * ((ue) this).field_I) + ((ue) this).field_m;
            if (var8 <= var9) {
              break L1;
            } else {
              var8 = var9;
              break L1;
            }
          }
          L2: {
            if ((var8 ^ -1) <= -1) {
              break L2;
            } else {
              var8 = 0;
              break L2;
            }
          }
          L3: {
            var8 = ((ue) this).field_K * var8 / var9;
            if (1 == param2) {
              ((ue) this).field_N.b(1, var8);
              break L3;
            } else {
              if (2 == param2) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L4: while (true) {
                  if (var12 >= ((ue) this).field_N.b(1)) {
                    if (-1 < (var11 ^ -1)) {
                      break L3;
                    } else {
                      ((ue) this).field_N.a(var11, -3344);
                      break L3;
                    }
                  } else {
                    var13 = ((ue) this).field_N.a(true, var12) - var8;
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var10 = var13;
                      var11 = var12;
                      var12++;
                      continue L4;
                    } else {
                      var12++;
                      continue L4;
                    }
                  }
                }
              } else {
                return true;
              }
            }
          }
          return true;
        }
    }

    public static void c(byte param0) {
        field_J = null;
        if (param0 != -13) {
            return;
        }
        field_G = null;
        field_H = null;
    }

    final int j(int param0) {
        if (param0 != 1) {
            return 9;
        }
        return ((ue) this).field_K;
    }

    final static int b(byte param0) {
        if (param0 < 104) {
            field_G = null;
            return 1;
        }
        return 1;
    }

    final static int a(int param0, CharSequence param1, byte param2, int param3, byte[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = OrbDefence.field_D ? 1 : 0;
        var6 = -param3 + param0;
        if (param2 == -86) {
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
                        var8 = param1.charAt(var7 + param3);
                        if (0 >= var8) {
                          break L5;
                        } else {
                          if (128 > var8) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (160 > var8) {
                        break L3;
                      } else {
                        if (var8 > 255) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param4[param5 - -var7] = (byte)var8;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (var8 != 8364) {
                      break L6;
                    } else {
                      param4[param5 - -var7] = (byte)-128;
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
                      param4[param5 + var7] = (byte)-126;
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
                        if (8222 == var8) {
                          break L9;
                        } else {
                          L10: {
                            if (var8 == 8230) {
                              break L10;
                            } else {
                              L11: {
                                if (8224 != var8) {
                                  break L11;
                                } else {
                                  param4[var7 + param5] = (byte)-122;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (8225 == var8) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (var8 != 710) {
                                      break L13;
                                    } else {
                                      param4[param5 - -var7] = (byte)-120;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (8240 == var8) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (352 != var8) {
                                          break L15;
                                        } else {
                                          param4[var7 + param5] = (byte)-118;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var8 != 8249) {
                                          break L16;
                                        } else {
                                          param4[var7 + param5] = (byte)-117;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (var8 != 338) {
                                          break L17;
                                        } else {
                                          param4[param5 - -var7] = (byte)-116;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      L18: {
                                        if (var8 != 381) {
                                          break L18;
                                        } else {
                                          param4[var7 + param5] = (byte)-114;
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
                                          param4[var7 + param5] = (byte)-111;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      L20: {
                                        if (8217 == var8) {
                                          break L20;
                                        } else {
                                          L21: {
                                            if (8220 != var8) {
                                              break L21;
                                            } else {
                                              param4[var7 + param5] = (byte)-109;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          L22: {
                                            if (var8 == 8221) {
                                              break L22;
                                            } else {
                                              L23: {
                                                if (var8 != 8226) {
                                                  break L23;
                                                } else {
                                                  param4[var7 + param5] = (byte)-107;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              L24: {
                                                if (var8 == 8211) {
                                                  break L24;
                                                } else {
                                                  L25: {
                                                    if (var8 != 8212) {
                                                      break L25;
                                                    } else {
                                                      param4[param5 + var7] = (byte)-105;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  L26: {
                                                    if (var8 != 732) {
                                                      break L26;
                                                    } else {
                                                      param4[var7 + param5] = (byte)-104;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                  L27: {
                                                    if (var8 != 8482) {
                                                      break L27;
                                                    } else {
                                                      param4[var7 + param5] = (byte)-103;
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
                                                        if (var8 != 8250) {
                                                          break L29;
                                                        } else {
                                                          param4[var7 + param5] = (byte)-101;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                      L30: {
                                                        if (var8 != 339) {
                                                          break L30;
                                                        } else {
                                                          param4[var7 + param5] = (byte)-100;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                      L31: {
                                                        if (382 != var8) {
                                                          break L31;
                                                        } else {
                                                          param4[param5 - -var7] = (byte)-98;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                      L32: {
                                                        if (376 == var8) {
                                                          break L32;
                                                        } else {
                                                          param4[param5 - -var7] = (byte)63;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                      param4[var7 + param5] = (byte)-97;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L28;
                                                      }
                                                    }
                                                  }
                                                  param4[param5 + var7] = (byte)-102;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              param4[param5 - -var7] = (byte)-106;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          param4[var7 + param5] = (byte)-108;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      param4[param5 - -var7] = (byte)-110;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  param4[param5 + var7] = (byte)-119;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              param4[param5 - -var7] = (byte)-121;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param4[param5 - -var7] = (byte)-123;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      param4[var7 + param5] = (byte)-124;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param4[param5 - -var7] = (byte)-125;
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
            return var6;
          }
        } else {
          return 75;
        }
    }

    final int a(byte param0) {
        if (param0 > -71) {
            ((ue) this).field_N = null;
        }
        return ((ue) this).field_N.b(1);
    }

    private ue() throws Throwable {
        throw new Error();
    }

    final int a(int param0, int param1) {
        if (param0 >= (param1 ^ -1)) {
            // if_icmple L22
        } else {
            return -1;
        }
        return ((ue) this).field_N.a(true, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new ba(13, 0, 1, 0);
        field_H = new int[8192];
        field_J = "You can only place barriers next to a path";
    }
}
