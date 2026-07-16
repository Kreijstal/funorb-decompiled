/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends wl {
    static int[] field_r;
    private int field_l;
    private int field_m;
    static boolean field_q;
    static int field_j;
    private int field_i;
    private int field_p;
    private int field_o;
    static int field_n;
    private int field_k;

    final static int d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!ae.a(-121)) {
            L1: {
              ga.field_d.a(rb.a(-578629823, field_n, fi.field_B), 83, rb.a(-578629823, tf.field_e, dh.field_b));
              if (!ga.field_d.b(param0 + 47)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = 0;
                if (var1 == 0) {
                  break L3;
                } else {
                  if ((ga.field_d.field_g ^ -1) > -1) {
                    break L3;
                  } else {
                    L4: {
                      var3 = h.field_s[ga.field_d.field_g];
                      if ((var3 ^ -1) == -3) {
                        break L4;
                      } else {
                        if (var3 == 5) {
                          break L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                    sg.a((byte) 64);
                    break L2;
                  }
                }
              }
              if (var2 == 0) {
                break L2;
              } else {
                if ((oc.field_d ^ -1) != -3) {
                  sg.a((byte) 64);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param0 != -48) {
              return -11;
            } else {
              L5: {
                if (var3 != 0) {
                  break L5;
                } else {
                  if (oc.field_d != 2) {
                    break L5;
                  } else {
                    var4 = -kh.field_g + d.a((byte) 115);
                    var6 = (int)((10999L + -var4) / 1000L);
                    if (0 < var6) {
                      break L5;
                    } else {
                      var3 = 2;
                      le.a(true, 5, 15991);
                      break L5;
                    }
                  }
                }
              }
              return var3;
            }
          } else {
            L6: {
              ga.field_d.a(46);
              if (ga.field_d.b(-1)) {
                var1 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            if (-14 == (vk.field_r ^ -1)) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final static void a(long param0, int param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              Thread.sleep(param0);
              if (param1 == 2) {
                break L1;
              } else {
                field_n = -55;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = wizardrun.field_H;
        var6 = param5 + -param2;
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
                      var8 = param3.charAt(param2 + var7);
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
                  param1[var7 + param4] = (byte)var8;
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
                      if (var8 == 8218) {
                        break L7;
                      } else {
                        L8: {
                          if (var8 != 402) {
                            break L8;
                          } else {
                            param1[param4 + var7] = (byte)-125;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var8 == 8222) {
                            break L9;
                          } else {
                            L10: {
                              if (var8 != 8230) {
                                break L10;
                              } else {
                                param1[var7 + param4] = (byte)-123;
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
                                  if (var8 != 8225) {
                                    break L12;
                                  } else {
                                    param1[var7 + param4] = (byte)-121;
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
                                    param1[var7 + param4] = (byte)-120;
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
                                    param1[param4 + var7] = (byte)-119;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                L15: {
                                  if (352 != var8) {
                                    break L15;
                                  } else {
                                    param1[param4 - -var7] = (byte)-118;
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
                                    param1[param4 - -var7] = (byte)-117;
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
                                    param1[var7 + param4] = (byte)-116;
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
                                        param1[var7 + param4] = (byte)-111;
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
                                                param1[var7 + param4] = (byte)-108;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            L23: {
                                              if (8226 == var8) {
                                                break L23;
                                              } else {
                                                L24: {
                                                  if (var8 == 8211) {
                                                    break L24;
                                                  } else {
                                                    L25: {
                                                      if (8212 != var8) {
                                                        break L25;
                                                      } else {
                                                        param1[var7 + param4] = (byte)-105;
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
                                                        param1[param4 - -var7] = (byte)-104;
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
                                                            param1[var7 + param4] = (byte)-102;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        L29: {
                                                          if (var8 != 8250) {
                                                            break L29;
                                                          } else {
                                                            param1[param4 + var7] = (byte)-101;
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
                                                            param1[param4 + var7] = (byte)-100;
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
                                                            param1[var7 + param4] = (byte)-98;
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
                                                            param1[var7 + param4] = (byte)63;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                        }
                                                        param1[param4 + var7] = (byte)-97;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    param1[param4 + var7] = (byte)-103;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                param1[var7 + param4] = (byte)-106;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                            }
                                            param1[var7 + param4] = (byte)-107;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        param1[param4 + var7] = (byte)-109;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    param1[param4 - -var7] = (byte)-110;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                param1[param4 - -var7] = (byte)-114;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            param1[var7 + param4] = (byte)-122;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param1[var7 + param4] = (byte)-124;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    param1[param4 - -var7] = (byte)-126;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                param1[param4 - -var7] = (byte)-128;
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
            if (param0 == 8220) {
              break L33;
            } else {
              field_n = -99;
              break L33;
            }
          }
          return var6;
        }
    }

    final static void a(int param0) {
        hg.field_b = null;
        mh.field_ob = null;
        if (param0 != -382) {
            field_j = 3;
        }
    }

    public static void e(byte param0) {
        field_r = null;
        if (param0 != -73) {
            pg.a((byte) -55);
        }
    }

    final static void a(int param0, boolean param1, pg param2) {
        if (!param1) {
            pg.a(122L, 90);
        }
        mg var5 = n.field_b;
        var5.c((byte) 92, param0);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        var5.b((byte) 11, 1);
        var5.b((byte) 11, param2.field_o);
        var5.b((byte) 11, param2.field_m);
        var5.f(param2.field_l, 613003928);
        var5.f(param2.field_i, 613003928);
        var5.f(param2.field_p, 613003928);
        var5.f(param2.field_k, 613003928);
        int discarded$0 = var5.e(var4, -1182887024);
        var5.a(-var4 + var5.field_m, -117);
    }

    final static void a(byte param0) {
        if (param0 != -97) {
            field_q = false;
        }
        td.field_f.c((ub) (Object) new ki(), -123);
    }

    pg(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((pg) this).field_k = param5;
        ((pg) this).field_l = param2;
        ((pg) this).field_i = param3;
        ((pg) this).field_m = param1;
        ((pg) this).field_o = param0;
        ((pg) this).field_p = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new int[8192];
        field_n = 0;
    }
}
