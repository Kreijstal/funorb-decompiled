/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fb {
    gk field_o;
    int field_p;
    static pj field_s;
    byte field_q;
    static int field_r;

    public static void f(int param0) {
        if (param0 != 8364) {
            field_s = null;
        }
        field_s = null;
    }

    final static void b(byte param0) {
        if (null != tj.field_d) {
          if (!tj.field_d.h()) {
            return;
          } else {
            L0: {
              if (param0 == -19) {
                break L0;
              } else {
                ob.f(119);
                break L0;
              }
            }
            tj.field_d = li.a(ke.field_h[7], 100, 96);
            na.a((byte) 85, tj.field_d);
            return;
          }
        } else {
          L1: {
            if (param0 == -19) {
              break L1;
            } else {
              ob.f(119);
              break L1;
            }
          }
          tj.field_d = li.a(ke.field_h[7], 100, 96);
          na.a((byte) 85, tj.field_d);
          return;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -73;
        }
        if (!(null != ((ob) this).field_o)) {
            return 0;
        }
        return ((ob) this).field_o.field_h * 100 / (-((ob) this).field_q + ((ob) this).field_o.field_g.length);
    }

    ob() {
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          var6 = param5 + -param3;
          if (param0 < -71) {
            break L0;
          } else {
            var10 = null;
            int discarded$1 = ob.a(-46, (CharSequence) null, (byte[]) null, 83, 110, -101);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var6 <= var7) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    var8 = param1.charAt(param3 + var7);
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
                  L6: {
                    if (var8 < 160) {
                      break L6;
                    } else {
                      if (255 >= var8) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var8 != 8364) {
                      break L7;
                    } else {
                      param2[param4 - -var7] = (byte)-128;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var8 == 8218) {
                      break L8;
                    } else {
                      L9: {
                        if (var8 == 402) {
                          break L9;
                        } else {
                          L10: {
                            if (var8 == 8222) {
                              break L10;
                            } else {
                              L11: {
                                if (var8 != 8230) {
                                  break L11;
                                } else {
                                  param2[var7 + param4] = (byte)-123;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var8 == 8224) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (8225 != var8) {
                                      break L13;
                                    } else {
                                      param2[param4 + var7] = (byte)-121;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var8 != 710) {
                                      break L14;
                                    } else {
                                      param2[param4 + var7] = (byte)-120;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (8240 != var8) {
                                      break L15;
                                    } else {
                                      param2[param4 - -var7] = (byte)-119;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  L16: {
                                    if (352 != var8) {
                                      break L16;
                                    } else {
                                      param2[param4 - -var7] = (byte)-118;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  L17: {
                                    if (var8 != 8249) {
                                      break L17;
                                    } else {
                                      param2[param4 + var7] = (byte)-117;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  L18: {
                                    if (338 == var8) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (var8 != 381) {
                                          break L19;
                                        } else {
                                          param2[var7 + param4] = (byte)-114;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      L20: {
                                        if (var8 == 8216) {
                                          break L20;
                                        } else {
                                          L21: {
                                            if (var8 != 8217) {
                                              break L21;
                                            } else {
                                              param2[var7 + param4] = (byte)-110;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          L22: {
                                            if (var8 != 8220) {
                                              break L22;
                                            } else {
                                              param2[var7 + param4] = (byte)-109;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if (var8 != 8221) {
                                              break L23;
                                            } else {
                                              param2[var7 + param4] = (byte)-108;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          L24: {
                                            if (var8 != 8226) {
                                              break L24;
                                            } else {
                                              param2[var7 + param4] = (byte)-107;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                          L25: {
                                            if (8211 == var8) {
                                              break L25;
                                            } else {
                                              L26: {
                                                if (8212 == var8) {
                                                  break L26;
                                                } else {
                                                  L27: {
                                                    if (var8 != 732) {
                                                      break L27;
                                                    } else {
                                                      param2[param4 + var7] = (byte)-104;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  L28: {
                                                    if (var8 == 8482) {
                                                      break L28;
                                                    } else {
                                                      L29: {
                                                        if (var8 == 353) {
                                                          break L29;
                                                        } else {
                                                          L30: {
                                                            if (var8 == 8250) {
                                                              break L30;
                                                            } else {
                                                              L31: {
                                                                if (var8 == 339) {
                                                                  break L31;
                                                                } else {
                                                                  L32: {
                                                                    if (var8 == 382) {
                                                                      break L32;
                                                                    } else {
                                                                      L33: {
                                                                        if (var8 == 376) {
                                                                          break L33;
                                                                        } else {
                                                                          param2[var7 + param4] = (byte)63;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L33;
                                                                          }
                                                                        }
                                                                      }
                                                                      param2[var7 + param4] = (byte)-97;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                  param2[param4 - -var7] = (byte)-98;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                              }
                                                              param2[param4 - -var7] = (byte)-100;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L30;
                                                              }
                                                            }
                                                          }
                                                          param2[var7 + param4] = (byte)-101;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                      param2[param4 + var7] = (byte)-102;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L28;
                                                      }
                                                    }
                                                  }
                                                  param2[var7 + param4] = (byte)-103;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                              param2[var7 + param4] = (byte)-105;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                          param2[var7 + param4] = (byte)-106;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      param2[param4 - -var7] = (byte)-111;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  param2[param4 - -var7] = (byte)-116;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              param2[param4 - -var7] = (byte)-122;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2[var7 + param4] = (byte)-124;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L9;
                          }
                        }
                      }
                      param2[param4 + var7] = (byte)-125;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param2[param4 - -var7] = (byte)-126;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                param2[param4 + var7] = (byte)var8;
                break L3;
              }
              var7++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var6;
        }
    }

    final byte[] e(int param0) {
        int var2 = 0;
        if (!((ob) this).field_j) {
          if (((ob) this).field_o.field_h < -((ob) this).field_q + ((ob) this).field_o.field_g.length) {
            throw new RuntimeException();
          } else {
            var2 = 38 % ((25 - param0) / 41);
            return ((ob) this).field_o.field_g;
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new pj();
        field_r = 0;
    }
}
