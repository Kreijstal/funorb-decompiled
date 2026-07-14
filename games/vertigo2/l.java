/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    boolean field_e;
    int field_g;
    int field_f;
    int field_c;
    static ee field_a;
    boolean field_i;
    boolean field_d;
    int field_j;
    static int[] field_h;
    static long[] field_b;

    final static int a(int param0, byte[] param1, CharSequence param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          var6 = -param4 + param3;
          if (param0 > 80) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var7 >= var6) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    var8 = param2.charAt(param4 + var7);
                    if (-1 <= (var8 ^ -1)) {
                      break L5;
                    } else {
                      if (var8 < 128) {
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
                      if (var8 <= 255) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var8 == 8364) {
                      break L7;
                    } else {
                      L8: {
                        if (8218 != var8) {
                          break L8;
                        } else {
                          param1[var7 + param5] = (byte)-126;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var8 != 402) {
                          break L9;
                        } else {
                          param1[param5 + var7] = (byte)-125;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var8 != 8222) {
                          break L10;
                        } else {
                          param1[var7 + param5] = (byte)-124;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var8 != 8230) {
                          break L11;
                        } else {
                          param1[param5 + var7] = (byte)-123;
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
                            if (var8 != 8225) {
                              break L13;
                            } else {
                              param1[param5 - -var7] = (byte)-121;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (710 == var8) {
                              break L14;
                            } else {
                              L15: {
                                if (8240 != var8) {
                                  break L15;
                                } else {
                                  param1[var7 + param5] = (byte)-119;
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
                                  param1[param5 + var7] = (byte)-118;
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
                                  param1[param5 - -var7] = (byte)-117;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (338 != var8) {
                                  break L18;
                                } else {
                                  param1[param5 - -var7] = (byte)-116;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                if (var8 == 381) {
                                  break L19;
                                } else {
                                  L20: {
                                    if (var8 == 8216) {
                                      break L20;
                                    } else {
                                      L21: {
                                        if (8217 == var8) {
                                          break L21;
                                        } else {
                                          L22: {
                                            if (var8 == 8220) {
                                              break L22;
                                            } else {
                                              L23: {
                                                if (var8 == 8221) {
                                                  break L23;
                                                } else {
                                                  L24: {
                                                    if (8226 == var8) {
                                                      break L24;
                                                    } else {
                                                      L25: {
                                                        if (var8 != 8211) {
                                                          break L25;
                                                        } else {
                                                          param1[var7 + param5] = (byte)-106;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      L26: {
                                                        if (var8 == 8212) {
                                                          break L26;
                                                        } else {
                                                          L27: {
                                                            if (var8 != 732) {
                                                              break L27;
                                                            } else {
                                                              param1[param5 + var7] = (byte)-104;
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
                                                                if (353 != var8) {
                                                                  break L29;
                                                                } else {
                                                                  param1[var7 + param5] = (byte)-102;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              L30: {
                                                                if (var8 != 8250) {
                                                                  break L30;
                                                                } else {
                                                                  param1[param5 + var7] = (byte)-101;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              L31: {
                                                                if (339 != var8) {
                                                                  break L31;
                                                                } else {
                                                                  param1[var7 + param5] = (byte)-100;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                              }
                                                              L32: {
                                                                if (382 != var8) {
                                                                  break L32;
                                                                } else {
                                                                  param1[var7 + param5] = (byte)-98;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L32;
                                                                  }
                                                                }
                                                              }
                                                              L33: {
                                                                if (376 == var8) {
                                                                  break L33;
                                                                } else {
                                                                  param1[param5 - -var7] = (byte)63;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L33;
                                                                  }
                                                                }
                                                              }
                                                              param1[param5 - -var7] = (byte)-97;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          param1[var7 + param5] = (byte)-103;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      param1[var7 + param5] = (byte)-105;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                  param1[param5 - -var7] = (byte)-107;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              param1[var7 + param5] = (byte)-108;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          param1[var7 + param5] = (byte)-109;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      param1[param5 - -var7] = (byte)-110;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  param1[param5 + var7] = (byte)-111;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              param1[var7 + param5] = (byte)-114;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L14;
                              }
                            }
                          }
                          param1[param5 - -var7] = (byte)-120;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L12;
                          }
                        }
                      }
                      param1[var7 + param5] = (byte)-122;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param1[var7 + param5] = (byte)-128;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                param1[var7 + param5] = (byte)var8;
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

    public static void a(boolean param0) {
        if (param0) {
            field_a = null;
        }
        field_a = null;
        field_b = null;
        field_h = null;
    }

    final static void a(int param0) {
        mi var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 < 109) {
          return;
        } else {
          var1 = uh.field_Wb;
          L0: while (true) {
            if (!kd.l(7)) {
              return;
            } else {
              var1.j(8, 118);
              var1.field_u = var1.field_u + 1;
              var2 = var1.field_u + 1;
              ml.a(var1, (byte) -25);
              uh.field_Wb.b((byte) 15, var1.field_u - var2);
              continue L0;
            }
          }
        }
    }

    l() {
        ((l) this).field_e = false;
        ((l) this).field_d = true;
        ((l) this).field_i = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ee();
        field_h = new int[4];
        field_b = new long[32];
    }
}
