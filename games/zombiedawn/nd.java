/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_e;
    static String field_d;
    static int field_a;
    static volatile boolean field_b;
    static int[] field_c;

    final static int a(boolean param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        var6 = -param4 + param3;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var6 <= var7) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    var8 = param1.charAt(param4 + var7);
                    if (var8 <= 0) {
                      break L4;
                    } else {
                      if (var8 < 128) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var8 < 160) {
                      break L5;
                    } else {
                      if (var8 <= 255) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var8 != 8364) {
                      break L6;
                    } else {
                      param2[var7 + param5] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (8218 == var8) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 != 402) {
                          break L8;
                        } else {
                          param2[var7 + param5] = (byte)-125;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var8 != 8222) {
                          break L9;
                        } else {
                          param2[var7 + param5] = (byte)-124;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var8 != 8230) {
                          break L10;
                        } else {
                          param2[var7 + param5] = (byte)-123;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var8 == 8224) {
                          break L11;
                        } else {
                          L12: {
                            if (8225 == var8) {
                              break L12;
                            } else {
                              L13: {
                                if (var8 == 710) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var8 != 8240) {
                                      break L14;
                                    } else {
                                      param2[var7 + param5] = (byte)-119;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (var8 != 352) {
                                      break L15;
                                    } else {
                                      param2[var7 + param5] = (byte)-118;
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
                                      param2[param5 + var7] = (byte)-117;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  L17: {
                                    if (338 != var8) {
                                      break L17;
                                    } else {
                                      param2[param5 - -var7] = (byte)-116;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (var8 == 381) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (var8 != 8216) {
                                          break L19;
                                        } else {
                                          param2[param5 - -var7] = (byte)-111;
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
                                            if (var8 != 8220) {
                                              break L21;
                                            } else {
                                              param2[param5 - -var7] = (byte)-109;
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
                                                  param2[var7 + param5] = (byte)-107;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              L24: {
                                                if (var8 != 8211) {
                                                  break L24;
                                                } else {
                                                  param2[param5 - -var7] = (byte)-106;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                              L25: {
                                                if (var8 != 8212) {
                                                  break L25;
                                                } else {
                                                  param2[param5 + var7] = (byte)-105;
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
                                                  param2[param5 - -var7] = (byte)-104;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                              L27: {
                                                if (8482 == var8) {
                                                  break L27;
                                                } else {
                                                  L28: {
                                                    if (var8 != 353) {
                                                      break L28;
                                                    } else {
                                                      param2[var7 + param5] = (byte)-102;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L28;
                                                      }
                                                    }
                                                  }
                                                  L29: {
                                                    if (var8 == 8250) {
                                                      break L29;
                                                    } else {
                                                      L30: {
                                                        if (339 == var8) {
                                                          break L30;
                                                        } else {
                                                          L31: {
                                                            if (var8 != 382) {
                                                              break L31;
                                                            } else {
                                                              param2[param5 - -var7] = (byte)-98;
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
                                                              param2[param5 + var7] = (byte)63;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L32;
                                                              }
                                                            }
                                                          }
                                                          param2[param5 - -var7] = (byte)-97;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                      param2[var7 + param5] = (byte)-100;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L29;
                                                      }
                                                    }
                                                  }
                                                  param2[param5 - -var7] = (byte)-101;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                              param2[param5 - -var7] = (byte)-103;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          param2[param5 - -var7] = (byte)-108;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      param2[var7 + param5] = (byte)-110;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  param2[param5 - -var7] = (byte)-114;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              param2[param5 + var7] = (byte)-120;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L12;
                              }
                            }
                          }
                          param2[var7 + param5] = (byte)-121;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L11;
                          }
                        }
                      }
                      param2[param5 + var7] = (byte)-122;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param2[param5 + var7] = (byte)-126;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                param2[param5 + var7] = (byte)var8;
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
          if (param0) {
            return -59;
          } else {
            return var6;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 31336) {
            field_c = null;
        }
        int var3 = param2 + -1 & param1 >> 1159192543;
        return (param1 + (param1 >>> 2036253983)) % param2 - -var3;
    }

    final static rc a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
        rc var9 = null;
        if (param4 != 1159192543) {
          return null;
        } else {
          var9 = new rc(param2, param8, param7, param0, param1, param6, param3);
          hk.field_F.a(0, (le) (Object) var9);
          rm.a((byte) -108, param5, var9);
          return var9;
        }
    }

    final static void a(int param0, int param1, wg param2) {
        am var5 = dp.field_e;
        var5.j(param1 ^ 10, param0);
        var5.field_j = var5.field_j + 1;
        int var4 = var5.field_j;
        var5.i(param1, 35);
        var5.i(param2.field_i, -96);
        var5.a(17087, param2.field_r);
        var5.h(param1 ^ -126, param2.field_q);
        var5.h(param1 ^ -110, param2.field_k);
        var5.h(param1 ^ -113, param2.field_m);
        var5.h(param1 ^ 87, param2.field_h);
        int discarded$0 = var5.e(-126, var4);
        var5.d(75, -var4 + var5.field_j);
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 >= -124) {
            int discarded$0 = nd.a(-84, -33, 91);
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Connection lost. <%0>";
        field_d = "Waiting for fonts";
        field_c = new int[128];
        field_b = true;
    }
}
