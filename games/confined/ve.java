/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static String field_c;
    static mn field_b;
    static String field_d;
    static String field_e;
    static int field_a;
    static volatile boolean field_f;
    static boolean field_g;
    static int field_h;

    final static int a(byte[] param0, byte param1, CharSequence param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Confined.field_J ? 1 : 0;
        var6 = -param3 + param5;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var7 >= var6) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    var8 = param2.charAt(param3 + var7);
                    if (-1 <= (var8 ^ -1)) {
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
                      if (255 >= var8) {
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
                      param0[var7 + param4] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var8 == 8218) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 == 402) {
                          break L8;
                        } else {
                          L9: {
                            if (var8 == 8222) {
                              break L9;
                            } else {
                              L10: {
                                if (var8 == 8230) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var8 != 8224) {
                                      break L11;
                                    } else {
                                      param0[var7 + param4] = (byte)-122;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var8 == 8225) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (710 != var8) {
                                          break L13;
                                        } else {
                                          param0[param4 - -var7] = (byte)-120;
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
                                              param0[var7 + param4] = (byte)-118;
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
                                              param0[var7 + param4] = (byte)-117;
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
                                                if (var8 == 381) {
                                                  break L18;
                                                } else {
                                                  L19: {
                                                    if (8216 == var8) {
                                                      break L19;
                                                    } else {
                                                      L20: {
                                                        if (var8 == 8217) {
                                                          break L20;
                                                        } else {
                                                          L21: {
                                                            if (8220 == var8) {
                                                              break L21;
                                                            } else {
                                                              L22: {
                                                                if (8221 == var8) {
                                                                  break L22;
                                                                } else {
                                                                  L23: {
                                                                    if (8226 == var8) {
                                                                      break L23;
                                                                    } else {
                                                                      L24: {
                                                                        if (var8 != 8211) {
                                                                          break L24;
                                                                        } else {
                                                                          param0[var7 + param4] = (byte)-106;
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
                                                                          param0[var7 + param4] = (byte)-105;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L25;
                                                                          }
                                                                        }
                                                                      }
                                                                      L26: {
                                                                        if (732 == var8) {
                                                                          break L26;
                                                                        } else {
                                                                          L27: {
                                                                            if (var8 != 8482) {
                                                                              break L27;
                                                                            } else {
                                                                              param0[var7 + param4] = (byte)-103;
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
                                                                                  param0[var7 + param4] = (byte)-101;
                                                                                  if (0 == 0) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    break L29;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L30: {
                                                                                if (var8 == 339) {
                                                                                  break L30;
                                                                                } else {
                                                                                  L31: {
                                                                                    if (382 != var8) {
                                                                                      break L31;
                                                                                    } else {
                                                                                      param0[param4 + var7] = (byte)-98;
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
                                                                                      param0[var7 + param4] = (byte)-97;
                                                                                      if (0 == 0) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        break L32;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  param0[param4 + var7] = (byte)63;
                                                                                  if (0 == 0) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    break L30;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param0[param4 + var7] = (byte)-100;
                                                                              if (0 == 0) {
                                                                                break L2;
                                                                              } else {
                                                                                break L28;
                                                                              }
                                                                            }
                                                                          }
                                                                          param0[param4 - -var7] = (byte)-102;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L26;
                                                                          }
                                                                        }
                                                                      }
                                                                      param0[var7 + param4] = (byte)-104;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L23;
                                                                      }
                                                                    }
                                                                  }
                                                                  param0[var7 + param4] = (byte)-107;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L22;
                                                                  }
                                                                }
                                                              }
                                                              param0[var7 + param4] = (byte)-108;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L21;
                                                              }
                                                            }
                                                          }
                                                          param0[param4 - -var7] = (byte)-109;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      param0[param4 - -var7] = (byte)-110;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  param0[var7 + param4] = (byte)-111;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              param0[param4 + var7] = (byte)-114;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          param0[param4 - -var7] = (byte)-116;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      param0[param4 + var7] = (byte)-119;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  param0[var7 + param4] = (byte)-121;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              param0[var7 + param4] = (byte)-123;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param0[param4 - -var7] = (byte)-124;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param0[var7 + param4] = (byte)-125;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param0[param4 - -var7] = (byte)-126;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                param0[param4 + var7] = (byte)var8;
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
            if (param1 == -116) {
              break L33;
            } else {
              field_b = null;
              break L33;
            }
          }
          return var6;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -340) {
            field_a = 68;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Power-ups awarded when your score crosses a threshold";
        field_d = "<%0> metres to Level <%1>";
        field_a = 0;
        field_e = "\"There's light at the end of the tunnel.\" - Ian T";
        field_b = new mn();
        field_f = true;
    }
}
