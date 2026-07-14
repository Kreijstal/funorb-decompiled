/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_h;
    static wo field_g;
    static int[] field_f;
    static int field_j;
    static int[] field_e;
    static int field_a;
    static String field_i;
    static int field_d;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_i = null;
        if (param0 != 938035464) {
            tf discarded$0 = cl.a(107, -93, (byte) 122);
        }
        field_h = null;
        field_f = null;
        field_g = null;
        field_e = null;
    }

    final static void b(int param0) {
        if (param0 != 8231) {
            return;
        }
        ln.field_q = false;
        lh.field_g = 0 == vi.field_o.f(255) ? true : false;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        var6 = param2 - param4;
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
                      var8 = param3.charAt(param4 + var7);
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
                      if (var8 > 255) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param1[var7 + param0] = (byte)var8;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (var8 == 8364) {
                    break L6;
                  } else {
                    L7: {
                      if (var8 != 8218) {
                        break L7;
                      } else {
                        param1[var7 + param0] = (byte)-126;
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
                            param1[var7 + param0] = (byte)-124;
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
                                  if (8225 == var8) {
                                    break L12;
                                  } else {
                                    L13: {
                                      if (710 != var8) {
                                        break L13;
                                      } else {
                                        param1[param0 - -var7] = (byte)-120;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (var8 != 8240) {
                                        break L14;
                                      } else {
                                        param1[param0 + var7] = (byte)-119;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (352 == var8) {
                                        break L15;
                                      } else {
                                        L16: {
                                          if (8249 == var8) {
                                            break L16;
                                          } else {
                                            L17: {
                                              if (var8 != 338) {
                                                break L17;
                                              } else {
                                                param1[var7 + param0] = (byte)-116;
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
                                                param1[var7 + param0] = (byte)-114;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            L19: {
                                              if (var8 != 8216) {
                                                break L19;
                                              } else {
                                                param1[var7 + param0] = (byte)-111;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (var8 != 8217) {
                                                break L20;
                                              } else {
                                                param1[var7 + param0] = (byte)-110;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            L21: {
                                              if (8220 != var8) {
                                                break L21;
                                              } else {
                                                param1[var7 + param0] = (byte)-109;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            L22: {
                                              if (var8 != 8221) {
                                                break L22;
                                              } else {
                                                param1[var7 + param0] = (byte)-108;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            L23: {
                                              if (var8 != 8226) {
                                                break L23;
                                              } else {
                                                param1[var7 + param0] = (byte)-107;
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
                                                    param1[var7 + param0] = (byte)-105;
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
                                                    param1[param0 + var7] = (byte)-104;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                }
                                                L27: {
                                                  if (8482 != var8) {
                                                    break L27;
                                                  } else {
                                                    param1[var7 + param0] = (byte)-103;
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
                                                      if (var8 == 8250) {
                                                        break L29;
                                                      } else {
                                                        L30: {
                                                          if (var8 == 339) {
                                                            break L30;
                                                          } else {
                                                            L31: {
                                                              if (382 != var8) {
                                                                break L31;
                                                              } else {
                                                                param1[var7 + param0] = (byte)-98;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                            L32: {
                                                              if (var8 == 376) {
                                                                break L32;
                                                              } else {
                                                                param1[param0 - -var7] = (byte)63;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L32;
                                                                }
                                                              }
                                                            }
                                                            param1[param0 - -var7] = (byte)-97;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        param1[var7 + param0] = (byte)-100;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                    param1[param0 - -var7] = (byte)-101;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L28;
                                                    }
                                                  }
                                                }
                                                param1[var7 + param0] = (byte)-102;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                            param1[var7 + param0] = (byte)-106;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        param1[param0 - -var7] = (byte)-117;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    param1[var7 + param0] = (byte)-118;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                param1[var7 + param0] = (byte)-121;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            param1[var7 + param0] = (byte)-122;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                        }
                        param1[param0 + var7] = (byte)-123;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param1[param0 + var7] = (byte)-125;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                param1[param0 + var7] = (byte)-128;
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
            if (param5 == -21809) {
              break L33;
            } else {
              tf discarded$1 = cl.a(19, 73, (byte) -104);
              break L33;
            }
          }
          return var6;
        }
    }

    final static tf a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (param2 >= -40) {
            return null;
        }
        tf var6 = new tf(param0, param0);
        tf var3 = var6;
        for (var4 = 0; var4 < var3.field_G.length; var4++) {
            var6.field_G[var4] = param1;
        }
        return var3;
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 >>> -918627519;
        var2 = var2 | var2 >>> -1027587327;
        var2 = var2 | var2 >>> -1743811166;
        if (param0 > -97) {
            int discarded$0 = cl.a((byte) -91, -19);
        }
        var2 = var2 | var2 >>> 140792772;
        var2 = var2 | var2 >>> 938035464;
        var2 = var2 | var2 >>> 947827344;
        return param1 & (var2 ^ -1);
    }

    final static void a(byte param0, boolean param1) {
        int var2 = -93 / ((-55 - param0) / 55);
        if (!(null == up.field_o)) {
            dp.a(up.field_o, -2);
        }
        if (!(null == eg.field_n)) {
            eg.field_n.a(param1, (byte) 20);
        }
        de.a((byte) 28, param1);
        if (!(hc.field_M == null)) {
            hc.field_M.a(param1, 0);
        }
        kd.c(param1, -24721);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{2};
        field_j = 4;
        field_e = new int[]{5, 10, 20};
        field_a = 5;
        field_i = "Show game chat from my friends";
        field_b = "Friends";
        field_c = "Quit";
    }
}
