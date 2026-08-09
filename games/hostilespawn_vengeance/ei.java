/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends am {
    static bd field_p;
    static bd field_m;
    static vl field_q;
    static int field_l;
    static boolean field_i;
    static bd field_n;
    byte[] field_r;
    long field_j;
    int field_s;
    static String field_k;
    static vl field_h;
    static eg field_o;
    static boolean field_t;

    final static void a(int param0, int param1, oc param2, boolean param3, og param4, oc param5, int param6, int param7, boolean param8, oj param9, int param10, int param11, int param12, int param13, int param14, int param15, oc param16) {
        int fieldTemp$0 = 0;
        og dupTemp$1 = null;
        og dupTemp$2 = null;
        og dupTemp$3 = null;
        oc dupTemp$4 = null;
        og dupTemp$5 = null;
        oc dupTemp$6 = null;
        int fieldTemp$7 = 0;
        int stackIn_15_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_261_0 = 0;
        RuntimeException stackIn_474_0 = null;
        StringBuilder stackIn_474_1 = null;
        RuntimeException stackIn_475_0 = null;
        StringBuilder stackIn_475_1 = null;
        String stackIn_475_2 = null;
        StringBuilder stackIn_477_1 = null;
        StringBuilder stackIn_478_1 = null;
        String stackIn_478_2 = null;
        StringBuilder stackIn_480_1 = null;
        StringBuilder stackIn_481_1 = null;
        String stackIn_481_2 = null;
        StringBuilder stackIn_483_1 = null;
        StringBuilder stackIn_484_1 = null;
        String stackIn_484_2 = null;
        StringBuilder stackIn_486_1 = null;
        StringBuilder stackIn_487_1 = null;
        String stackIn_487_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        oj var17 = null;
        RuntimeException var17_ref = null;
        double var18 = 0.0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        bd[][] var22_ref_bd____ = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        var40 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param9.field_G = 2;
              var17 = mm.field_m[0];
              var18 = nh.a(-12149, param9, var17);
              if (var18 >= 0.0) {
                break L1;
              } else {
                var18 = var18 + 256.0;
                break L1;
              }
            }
            L2: {
              if (param3) {
                if (param11 < param1) {
                  if (param15 <= param1) {
                    if (-param1 < param11) {
                      if (param15 <= -param1) {
                        stackIn_15_0 = 0;
                        break L2;
                      } else {
                        stackIn_15_0 = 1;
                        break L2;
                      }
                    } else {
                      stackIn_15_0 = 0;
                      break L2;
                    }
                  } else {
                    stackIn_15_0 = 0;
                    break L2;
                  }
                } else {
                  stackIn_15_0 = 0;
                  break L2;
                }
              } else {
                stackIn_15_0 = 0;
                break L2;
              }
            }
            L3: {
              var20 = stackIn_15_0;
              if (19 != param9.field_i) {
                break L3;
              } else {
                if (param9.field_w != 4) {
                  break L3;
                } else {
                  if (var20 != 0) {
                    break L3;
                  } else {
                    if (param8) {
                      param9.field_w = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            L4: {
              if (param3) {
                if (param11 < param0) {
                  if (param0 > param15) {
                    if (param11 > -param0) {
                      if (param15 <= -param0) {
                        stackIn_33_0 = 0;
                        break L4;
                      } else {
                        stackIn_33_0 = 1;
                        break L4;
                      }
                    } else {
                      stackIn_33_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_33_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_33_0 = 0;
                  break L4;
                }
              } else {
                stackIn_33_0 = 0;
                break L4;
              }
            }
            L5: {
              var21 = stackIn_33_0;
              if (19 != param9.field_i) {
                break L5;
              } else {
                L6: {
                  if (!param8) {
                    break L6;
                  } else {
                    if (var20 != 0) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (!lm.a(var17, param9, -62)) {
                    stackIn_40_0 = 0;
                    break L7;
                  } else {
                    stackIn_40_0 = 1;
                    break L7;
                  }
                }
                var20 = stackIn_40_0;
                if (var20 != 0) {
                  break L5;
                } else {
                  if (param9.field_w == 4) {
                    param9.field_w = 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L8: {
              if (-28 != (param9.field_i ^ -1)) {
                break L8;
              } else {
                if (param9.field_s) {
                  break L8;
                } else {
                  if (var21 != 0) {
                    break L8;
                  } else {
                    if (-1 == (param9.field_w ^ -1)) {
                      break L8;
                    } else {
                      param9.field_w = 0;
                      param9.field_z = 0;
                      break L8;
                    }
                  }
                }
              }
            }
            L9: {
              if ((param9.field_B ^ -1) < 99) {
                param9.field_B = param9.field_B - 1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              fieldTemp$0 = param9.field_p + 1;
              param9.field_p = param9.field_p + 1;
              if (param9.field_C > fieldTemp$0) {
                break L10;
              } else {
                param9.field_z = param9.field_z + 1;
                param9.field_p = 0;
                break L10;
              }
            }
            L11: {
              if (0 >= param9.field_B) {
                break L11;
              } else {
                if ((param9.field_w ^ -1) != -2) {
                  param9.field_B = 0;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              var22 = param9.field_w;
              if (var22 != 0) {
                if (-2 != (var22 ^ -1)) {
                  if (var22 != 2) {
                    if (var22 == 3) {
                      param9.a(225, -64.0 + param9.field_c, param7);
                      if (param9.field_c % 64.0 < 4.0) {
                        param9.field_w = 1;
                        param9.field_c = Math.floor(param9.field_c / 64.0) * 64.0;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      if ((var22 ^ -1) == -5) {
                        L13: {
                          param9.field_p = param9.field_p + 2;
                          if (param8) {
                            break L13;
                          } else {
                            if (param9.field_i == 19) {
                              break L13;
                            } else {
                              param9.field_w = 1;
                              break L12;
                            }
                          }
                        }
                        if (var21 == 0) {
                          L14: {
                            if (var20 != 0) {
                              break L14;
                            } else {
                              if (!param8) {
                                break L14;
                              } else {
                                param9.field_w = 1;
                                break L12;
                              }
                            }
                          }
                          if (19 == param9.field_i) {
                            L15: {
                              var22 = param9.field_z % lb.field_a[4].length;
                              if ((var22 ^ -1) != -5) {
                                break L15;
                              } else {
                                if ((param9.field_p ^ -1) != -3) {
                                  break L15;
                                } else {
                                  L16: {
                                    param9.field_e = 50;
                                    tk.a(3, jc.field_c, 62, true);
                                    jn.field_F[ib.field_c].field_c = param9.field_c;
                                    jn.field_F[ib.field_c].field_j.a((byte) 46, param2);
                                    jn.field_F[ib.field_c].field_l.a(param4, -28860);
                                    dupTemp$1 = jn.field_F[ib.field_c].field_l;
                                    dupTemp$1.field_f = dupTemp$1.field_f - 0.5;
                                    dupTemp$2 = jn.field_F[ib.field_c].field_l;
                                    dupTemp$2.field_a = dupTemp$2.field_a - 0.5;
                                    if (0.0 <= jn.field_F[ib.field_c].field_l.field_f) {
                                      break L16;
                                    } else {
                                      dupTemp$3 = jn.field_F[ib.field_c].field_l;
                                      dupTemp$3.field_f = dupTemp$3.field_f + 1.0;
                                      dupTemp$4 = jn.field_F[ib.field_c].field_j;
                                      dupTemp$4.field_e = dupTemp$4.field_e - 1;
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (jn.field_F[ib.field_c].field_l.field_a < 0.0) {
                                      dupTemp$5 = jn.field_F[ib.field_c].field_l;
                                      dupTemp$5.field_a = dupTemp$5.field_a + 1.0;
                                      dupTemp$6 = jn.field_F[ib.field_c].field_j;
                                      dupTemp$6.field_g = dupTemp$6.field_g - 1;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  jn.field_F[ib.field_c].field_e = 0;
                                  jn.field_F[ib.field_c].field_h = 0;
                                  jn.field_F[ib.field_c].field_i = 13;
                                  jn.field_F[ib.field_c].field_l.a(20, (byte) 94, jn.field_F[ib.field_c].field_c);
                                  ib.field_c = ib.field_c + 1;
                                  if (Math.random() < 0.5) {
                                    param9.field_c = param9.field_c + 64.0;
                                    param9.b(-27757, (int)(Math.random() * 10.0), ln.field_a);
                                    param9.field_c = param9.field_c - 64.0;
                                    break L15;
                                  } else {
                                    param9.field_c = param9.field_c - 64.0;
                                    param9.b(-27757, (int)(Math.random() * 10.0), ln.field_a);
                                    param9.field_c = param9.field_c + 64.0;
                                    break L15;
                                  }
                                }
                              }
                            }
                            param5.a((byte) 46, param16);
                            param5.b(param2, 24161);
                            var18 = param5.a(25124);
                            param9.a(225, var18, 5);
                            break L12;
                          } else {
                            if (-28 != (param9.field_i ^ -1)) {
                              L18: {
                                if ((3 & param9.field_e) != 0) {
                                  break L18;
                                } else {
                                  if ((eh.field_g ^ -1) >= -1) {
                                    break L18;
                                  } else {
                                    if ((Math.abs(param11) ^ -1) < -49) {
                                      break L18;
                                    } else {
                                      if (-49 > (Math.abs(param15) ^ -1)) {
                                        break L18;
                                      } else {
                                        ci.a(1, 45);
                                        if ((uj.field_l ^ -1) != -2) {
                                          break L18;
                                        } else {
                                          if (0 < param9.field_e) {
                                            break L18;
                                          } else {
                                            L19: {
                                              param9.field_e = 30;
                                              var22 = param9.field_i;
                                              if (var22 == 1) {
                                                break L19;
                                              } else {
                                                if ((var22 ^ -1) == -26) {
                                                  break L19;
                                                } else {
                                                  if (var22 != 24) {
                                                    if (18 != var22) {
                                                      if (27 == var22) {
                                                        break L18;
                                                      } else {
                                                        if ((var22 ^ -1) != -27) {
                                                          if (19 == var22) {
                                                            break L18;
                                                          } else {
                                                            if (var22 != 23) {
                                                              if (-9 == (var22 ^ -1)) {
                                                                param9.field_e = 60;
                                                                tk.a(5, jc.field_c, 35, true);
                                                                break L18;
                                                              } else {
                                                                break L18;
                                                              }
                                                            } else {
                                                              break L18;
                                                            }
                                                          }
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                    } else {
                                                      break L19;
                                                    }
                                                  } else {
                                                    tk.a(1, jc.field_c, 0, true);
                                                    break L18;
                                                  }
                                                }
                                              }
                                            }
                                            tk.a(1, jc.field_c, 0, true);
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L20: {
                                if ((param9.field_e ^ -1) >= -1) {
                                  break L20;
                                } else {
                                  param9.field_e = param9.field_e - 1;
                                  break L20;
                                }
                              }
                              param5.a((byte) 46, param16);
                              param5.b(param2, 24161);
                              var18 = param5.a(25124);
                              param9.a(225, var18, 5);
                              break L12;
                            } else {
                              L21: {
                                var22 = param9.field_z % pa.field_i[4].length;
                                if (var22 < 14) {
                                  break L21;
                                } else {
                                  if (17 < var22) {
                                    break L21;
                                  } else {
                                    if ((eh.field_g ^ -1) >= -1) {
                                      break L21;
                                    } else {
                                      if (Math.abs(param11) > 48) {
                                        break L21;
                                      } else {
                                        if (48 >= Math.abs(param15)) {
                                          L22: {
                                            ci.a(3, 126);
                                            if (1 != uj.field_l) {
                                              break L22;
                                            } else {
                                              if (param9.field_e <= 0) {
                                                break L22;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          if (param9.field_e <= 0) {
                                            break L21;
                                          } else {
                                            param9.field_e = param9.field_e - 1;
                                            break L21;
                                          }
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              param5.a((byte) 46, param16);
                              param5.b(param2, 24161);
                              var18 = param5.a(25124);
                              param9.a(225, var18, 5);
                              break L12;
                            }
                          }
                        } else {
                          param9.field_J = true;
                          param9.field_w = 1;
                          break L12;
                        }
                      } else {
                        if ((var22 ^ -1) == -6) {
                          L23: {
                            param9.field_l.a(25302, true, param9.field_K, param9.field_t, ln.field_a, 1, param9.field_j);
                            param9.b((byte) 117);
                            var22_ref_bd____ = param9.e(127);
                            var23 = 3;
                            if (var22_ref_bd____ == null) {
                              break L23;
                            } else {
                              if (var22_ref_bd____[5] == null) {
                                break L23;
                              } else {
                                var23 = var22_ref_bd____[5].length;
                                break L23;
                              }
                            }
                          }
                          if (param9.field_z >= var23) {
                            L24: {
                              if (3 == ha.field_t) {
                                if (-9 != (param9.field_i ^ -1)) {
                                  break L24;
                                } else {
                                  if (0 == bm.field_c) {
                                    kd.a(0, 1);
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                              } else {
                                break L24;
                              }
                            }
                            L25: {
                              if (-24 == (param9.field_i ^ -1)) {
                                jj.a(16, param9);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            L26: {
                              if (-9 != (param9.field_i ^ -1)) {
                                break L26;
                              } else {
                                var24 = 0;
                                L27: while (true) {
                                  if (var24 >= 10) {
                                    break L26;
                                  } else {
                                    mm.field_m[el.field_j] = new oj(param9.field_j, 3, rl.field_c);
                                    el.field_j = el.field_j + 1;
                                    var24++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                            param9.c((byte) -123);
                            bn.a(3, param9);
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                  } else {
                    param9.a(225, param9.field_c + 64.0, param7);
                    if (4.0 <= param9.field_c % 64.0) {
                      break L12;
                    } else {
                      param9.field_w = 1;
                      param9.field_c = 64.0 * Math.floor(param9.field_c / 64.0);
                      break L12;
                    }
                  }
                } else {
                  L28: {
                    if (-28 != (param9.field_i ^ -1)) {
                      break L28;
                    } else {
                      L29: {
                        if ((ln.field_a.field_c[param12] ^ -1) == -7) {
                          ln.field_a.field_c[param12] = 5;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        if ((ln.field_a.field_c[-1 + param12] ^ -1) == -7) {
                          ln.field_a.field_c[-1 + param12] = 0;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (6 != ln.field_a.field_c[param12 + -ln.field_a.field_d]) {
                          break L31;
                        } else {
                          ln.field_a.field_c[param12 - ln.field_a.field_d] = 0;
                          break L31;
                        }
                      }
                      if (ln.field_a.field_c[param12 + (-ln.field_a.field_d - 1)] == 6) {
                        ln.field_a.field_c[-1 + (param12 + -ln.field_a.field_d)] = 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L32: {
                    if (param8) {
                      L33: {
                        if (var20 == 0) {
                          break L33;
                        } else {
                          if (var21 != 0) {
                            break L33;
                          } else {
                            param9.field_w = 4;
                            break L32;
                          }
                        }
                      }
                      L34: {
                        if (var21 == 0) {
                          param9.field_J = false;
                          break L34;
                        } else {
                          param9.field_w = 1;
                          param9.field_J = true;
                          if (param9.field_B <= 0) {
                            break L34;
                          } else {
                            param9.field_B = 0;
                            break L34;
                          }
                        }
                      }
                      L35: {
                        var22 = cm.field_c[param12];
                        var23 = param12 - param10;
                        var24 = param12 + param10;
                        var25 = param12 + 1;
                        var26 = -1 + param12;
                        if (3 == param9.field_i) {
                          stackIn_123_0 = 0;
                          break L35;
                        } else {
                          stackIn_123_0 = 1;
                          break L35;
                        }
                      }
                      L36: {
                        var27 = stackIn_123_0;
                        if (1 >= ln.field_a.b(var27, 5857, var23)) {
                          stackIn_126_0 = 0;
                          break L36;
                        } else {
                          stackIn_126_0 = 1;
                          break L36;
                        }
                      }
                      L37: {
                        var28 = stackIn_126_0;
                        if (1 >= ln.field_a.b(var27, 5857, var24)) {
                          stackIn_129_0 = 0;
                          break L37;
                        } else {
                          stackIn_129_0 = 1;
                          break L37;
                        }
                      }
                      L38: {
                        var29 = stackIn_129_0;
                        if (ln.field_a.b(var27, 5857, var25) <= 1) {
                          stackIn_132_0 = 0;
                          break L38;
                        } else {
                          stackIn_132_0 = 1;
                          break L38;
                        }
                      }
                      L39: {
                        var30 = stackIn_132_0;
                        if (-2 <= (ln.field_a.b(var27, 5857, var26) ^ -1)) {
                          stackIn_135_0 = 0;
                          break L39;
                        } else {
                          stackIn_135_0 = 1;
                          break L39;
                        }
                      }
                      L40: {
                        L41: {
                          var31 = stackIn_135_0;
                          if (var28 != 0) {
                            break L41;
                          } else {
                            if (var29 != 0) {
                              break L41;
                            } else {
                              if (var30 != 0) {
                                break L41;
                              } else {
                                if (var31 == 0) {
                                  stackIn_142_0 = 0;
                                  break L40;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                        }
                        stackIn_142_0 = 1;
                        break L40;
                      }
                      L42: {
                        var32 = stackIn_142_0;
                        if (var32 == 0) {
                          L43: {
                            if (1 < ln.field_a.b(var27, 5857, -1 + var23)) {
                              break L43;
                            } else {
                              if (ln.field_a.b(var27, 5857, 1 + var23) > 1) {
                                break L43;
                              } else {
                                if (-2 > (ln.field_a.b(var27, 5857, var24 + -1) ^ -1)) {
                                  break L43;
                                } else {
                                  if (ln.field_a.b(var27, 5857, var24 + 1) > 1) {
                                    break L43;
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                            }
                          }
                          var32 = 1;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L44: {
                        var33 = 0;
                        if (var32 != 0) {
                          var33 = 1;
                          break L44;
                        } else {
                          L45: {
                            if (!param9.field_J) {
                              L46: {
                                L47: {
                                  if (var22 > cm.field_c[var23]) {
                                    break L47;
                                  } else {
                                    if (var28 != 0) {
                                      break L47;
                                    } else {
                                      stackIn_173_0 = 1;
                                      break L46;
                                    }
                                  }
                                }
                                stackIn_173_0 = 0;
                                break L46;
                              }
                              L48: {
                                L49: {
                                  var34 = stackIn_173_0;
                                  if (var22 > cm.field_c[var26]) {
                                    break L49;
                                  } else {
                                    if (var31 != 0) {
                                      break L49;
                                    } else {
                                      stackIn_177_0 = 1;
                                      break L48;
                                    }
                                  }
                                }
                                stackIn_177_0 = 0;
                                break L48;
                              }
                              L50: {
                                L51: {
                                  var37 = stackIn_177_0;
                                  if (cm.field_c[var24] < var22) {
                                    break L51;
                                  } else {
                                    if (var29 != 0) {
                                      break L51;
                                    } else {
                                      stackIn_181_0 = 1;
                                      break L50;
                                    }
                                  }
                                }
                                stackIn_181_0 = 0;
                                break L50;
                              }
                              L52: {
                                L53: {
                                  var35 = stackIn_181_0;
                                  if (cm.field_c[var25] < var22) {
                                    break L53;
                                  } else {
                                    if (var30 != 0) {
                                      break L53;
                                    } else {
                                      stackIn_185_0 = 1;
                                      break L52;
                                    }
                                  }
                                }
                                stackIn_185_0 = 0;
                                break L52;
                              }
                              var36 = stackIn_185_0;
                              break L45;
                            } else {
                              L54: {
                                L55: {
                                  if (cm.field_c[var24] > var22) {
                                    break L55;
                                  } else {
                                    if (var29 != 0) {
                                      break L55;
                                    } else {
                                      stackIn_156_0 = 1;
                                      break L54;
                                    }
                                  }
                                }
                                stackIn_156_0 = 0;
                                break L54;
                              }
                              L56: {
                                L57: {
                                  var34 = stackIn_156_0;
                                  if (var22 < cm.field_c[var26]) {
                                    break L57;
                                  } else {
                                    if (var31 != 0) {
                                      break L57;
                                    } else {
                                      stackIn_160_0 = 1;
                                      break L56;
                                    }
                                  }
                                }
                                stackIn_160_0 = 0;
                                break L56;
                              }
                              L58: {
                                L59: {
                                  var36 = stackIn_160_0;
                                  if (var22 < cm.field_c[var23]) {
                                    break L59;
                                  } else {
                                    if (var28 != 0) {
                                      break L59;
                                    } else {
                                      stackIn_164_0 = 1;
                                      break L58;
                                    }
                                  }
                                }
                                stackIn_164_0 = 0;
                                break L58;
                              }
                              L60: {
                                L61: {
                                  var35 = stackIn_164_0;
                                  if (var22 < cm.field_c[var25]) {
                                    break L61;
                                  } else {
                                    if (var30 != 0) {
                                      break L61;
                                    } else {
                                      stackIn_168_0 = 1;
                                      break L60;
                                    }
                                  }
                                }
                                stackIn_168_0 = 0;
                                break L60;
                              }
                              var37 = stackIn_168_0;
                              break L45;
                            }
                          }
                          L62: {
                            L63: {
                              if (var18 >= 224.0) {
                                break L63;
                              } else {
                                if (var18 >= 32.0) {
                                  break L62;
                                } else {
                                  break L63;
                                }
                              }
                            }
                            if (var34 != 0) {
                              break L62;
                            } else {
                              var33 = 1;
                              break L44;
                            }
                          }
                          L64: {
                            if (32.0 > var18) {
                              break L64;
                            } else {
                              if (96.0 <= var18) {
                                break L64;
                              } else {
                                if (var37 != 0) {
                                  break L64;
                                } else {
                                  var33 = 1;
                                  break L44;
                                }
                              }
                            }
                          }
                          L65: {
                            if (96.0 > var18) {
                              break L65;
                            } else {
                              if (var18 >= 160.0) {
                                break L65;
                              } else {
                                if (var35 == 0) {
                                  var33 = 1;
                                  break L44;
                                } else {
                                  break L65;
                                }
                              }
                            }
                          }
                          if (var18 < 160.0) {
                            break L44;
                          } else {
                            if (224.0 <= var18) {
                              break L44;
                            } else {
                              if (var36 == 0) {
                                var33 = 1;
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                      }
                      if (var33 == 0) {
                        L66: {
                          if (1 != param9.field_i) {
                            break L66;
                          } else {
                            if (!param9.field_J) {
                              if (0 < tm.field_q) {
                                L67: {
                                  if (-25 < param9.field_B) {
                                    break L67;
                                  } else {
                                    param9.field_B = (int)((0.5 * Math.random() + 0.5) * 100.0);
                                    break L67;
                                  }
                                }
                                if (of.field_a != 0) {
                                  break L66;
                                } else {
                                  if (Math.random() >= 0.4) {
                                    break L66;
                                  } else {
                                    L68: {
                                      L69: {
                                        var38 = uh.field_i;
                                        if (-5 >= (param11 ^ -1)) {
                                          break L69;
                                        } else {
                                          if (-5 >= (param15 ^ -1)) {
                                            break L69;
                                          } else {
                                            break L68;
                                          }
                                        }
                                      }
                                      var38 = var38 / 2;
                                      break L68;
                                    }
                                    jh.a(var38, (byte) 49, 12, jc.field_c, 6);
                                    of.field_a = 20 - -(int)(50.0 * Math.random());
                                    break L66;
                                  }
                                }
                              } else {
                                L70: {
                                  if ((param9.field_B ^ -1) < 99) {
                                    break L70;
                                  } else {
                                    if (Math.random() < 0.04) {
                                      param9.field_B = (int)((0.5 + Math.random() * 0.5) * 100.0);
                                      break L70;
                                    } else {
                                      break L70;
                                    }
                                  }
                                }
                                if (of.field_a != 0) {
                                  break L66;
                                } else {
                                  if (Math.random() >= 0.4) {
                                    break L66;
                                  } else {
                                    L71: {
                                      L72: {
                                        var38 = uh.field_i;
                                        if (param11 >= 4) {
                                          break L72;
                                        } else {
                                          if (4 > param15) {
                                            break L71;
                                          } else {
                                            break L72;
                                          }
                                        }
                                      }
                                      var38 = var38 / 2;
                                      break L71;
                                    }
                                    jh.a(var38, (byte) 40, 12, jc.field_c, 6);
                                    of.field_a = (int)(50.0 * Math.random()) + 20;
                                    break L66;
                                  }
                                }
                              }
                            } else {
                              break L66;
                            }
                          }
                        }
                        L73: {
                          if (0 >= param9.field_B) {
                            break L73;
                          } else {
                            param6 = param6 * 3;
                            param9.field_p = param9.field_p + 2;
                            if (param9.field_p >= param9.field_C) {
                              param9.field_p = 0;
                              param9.field_z = param9.field_z + 1;
                              break L73;
                            } else {
                              break L73;
                            }
                          }
                        }
                        L74: {
                          param9.a(225, var18, 3);
                          li.field_r = param9.a(ln.field_a, 128, param6);
                          if (li.field_r[0]) {
                            break L74;
                          } else {
                            if (!li.field_r[1]) {
                              break L32;
                            } else {
                              break L74;
                            }
                          }
                        }
                        param9.field_D = 50;
                        param9.field_w = 0;
                        break L32;
                      } else {
                        L75: {
                          if (1 != param9.field_i) {
                            break L75;
                          } else {
                            if (param9.field_J) {
                              break L75;
                            } else {
                              if (tm.field_q > 0) {
                                if ((param9.field_B ^ -1) >= 24) {
                                  param9.field_B = (int)((Math.random() + 0.5) * 100.0);
                                  break L75;
                                } else {
                                  break L75;
                                }
                              } else {
                                if (99 > (param9.field_B ^ -1)) {
                                  break L75;
                                } else {
                                  if (Math.random() >= 0.02) {
                                    break L75;
                                  } else {
                                    param9.field_B = (int)(100.0 * (Math.random() + 0.5));
                                    break L75;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L76: {
                          if (param9.field_B <= 0) {
                            break L76;
                          } else {
                            param6 = param6 * 3;
                            param9.field_p = param9.field_p + 2;
                            if (param9.field_p >= param9.field_C) {
                              param9.field_p = 0;
                              param9.field_z = param9.field_z + 1;
                              break L76;
                            } else {
                              break L76;
                            }
                          }
                        }
                        L77: {
                          if (!param9.field_J) {
                            L78: {
                              L79: {
                                if (var22 > cm.field_c[var26]) {
                                  break L79;
                                } else {
                                  if (var31 != 0) {
                                    break L79;
                                  } else {
                                    stackIn_249_0 = 1;
                                    break L78;
                                  }
                                }
                              }
                              stackIn_249_0 = 0;
                              break L78;
                            }
                            L80: {
                              L81: {
                                var37 = stackIn_249_0;
                                if (cm.field_c[var25] < var22) {
                                  break L81;
                                } else {
                                  if (var30 != 0) {
                                    break L81;
                                  } else {
                                    stackIn_253_0 = 1;
                                    break L80;
                                  }
                                }
                              }
                              stackIn_253_0 = 0;
                              break L80;
                            }
                            L82: {
                              L83: {
                                var36 = stackIn_253_0;
                                if (var22 > cm.field_c[var24]) {
                                  break L83;
                                } else {
                                  if (var29 != 0) {
                                    break L83;
                                  } else {
                                    stackIn_257_0 = 1;
                                    break L82;
                                  }
                                }
                              }
                              stackIn_257_0 = 0;
                              break L82;
                            }
                            L84: {
                              L85: {
                                var35 = stackIn_257_0;
                                if (var22 > cm.field_c[var23]) {
                                  break L85;
                                } else {
                                  if (var28 != 0) {
                                    break L85;
                                  } else {
                                    stackIn_261_0 = 1;
                                    break L84;
                                  }
                                }
                              }
                              stackIn_261_0 = 0;
                              break L84;
                            }
                            var34 = stackIn_261_0;
                            if (var34 != 0) {
                              break L77;
                            } else {
                              if (var35 != 0) {
                                break L77;
                              } else {
                                if (var36 != 0) {
                                  break L77;
                                } else {
                                  if (var37 == 0) {
                                    if (var30 == 0) {
                                      var36 = 1;
                                      break L77;
                                    } else {
                                      if (var28 == 0) {
                                        var34 = 1;
                                        break L77;
                                      } else {
                                        break L77;
                                      }
                                    }
                                  } else {
                                    break L77;
                                  }
                                }
                              }
                            }
                          } else {
                            L86: {
                              L87: {
                                if (cm.field_c[var24] > var22) {
                                  break L87;
                                } else {
                                  if (var29 != 0) {
                                    break L87;
                                  } else {
                                    stackIn_225_0 = 1;
                                    break L86;
                                  }
                                }
                              }
                              stackIn_225_0 = 0;
                              break L86;
                            }
                            L88: {
                              L89: {
                                var34 = stackIn_225_0;
                                if (var22 < cm.field_c[var26]) {
                                  break L89;
                                } else {
                                  if (var31 != 0) {
                                    break L89;
                                  } else {
                                    stackIn_229_0 = 1;
                                    break L88;
                                  }
                                }
                              }
                              stackIn_229_0 = 0;
                              break L88;
                            }
                            L90: {
                              L91: {
                                var36 = stackIn_229_0;
                                if (var22 < cm.field_c[var23]) {
                                  break L91;
                                } else {
                                  if (var28 != 0) {
                                    break L91;
                                  } else {
                                    stackIn_233_0 = 1;
                                    break L90;
                                  }
                                }
                              }
                              stackIn_233_0 = 0;
                              break L90;
                            }
                            L92: {
                              L93: {
                                var35 = stackIn_233_0;
                                if (cm.field_c[var25] > var22) {
                                  break L93;
                                } else {
                                  if (var30 != 0) {
                                    break L93;
                                  } else {
                                    stackIn_237_0 = 1;
                                    break L92;
                                  }
                                }
                              }
                              stackIn_237_0 = 0;
                              break L92;
                            }
                            var37 = stackIn_237_0;
                            if (var34 != 0) {
                              break L77;
                            } else {
                              if (var35 != 0) {
                                break L77;
                              } else {
                                if (var36 != 0) {
                                  break L77;
                                } else {
                                  if (var37 != 0) {
                                    break L77;
                                  } else {
                                    if (var30 == 0) {
                                      var37 = 1;
                                      break L77;
                                    } else {
                                      if (var28 != 0) {
                                        break L77;
                                      } else {
                                        var35 = 1;
                                        break L77;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L94: {
                          if (var34 != 0) {
                            var18 = 0.0;
                            break L94;
                          } else {
                            break L94;
                          }
                        }
                        L95: {
                          if (var35 != 0) {
                            var18 = 128.0;
                            break L95;
                          } else {
                            break L95;
                          }
                        }
                        L96: {
                          if (var36 != 0) {
                            var18 = 192.0;
                            break L96;
                          } else {
                            break L96;
                          }
                        }
                        L97: {
                          if (var37 == 0) {
                            break L97;
                          } else {
                            var18 = 64.0;
                            break L97;
                          }
                        }
                        L98: {
                          L99: {
                            param9.a(225, var18, 3);
                            if (64.0 == var18) {
                              break L99;
                            } else {
                              if (192.0 != var18) {
                                break L98;
                              } else {
                                break L99;
                              }
                            }
                          }
                          L100: {
                            if (0.5 > param4.field_a) {
                              param4.field_a = param4.field_a + 0.01;
                              break L100;
                            } else {
                              break L100;
                            }
                          }
                          if (0.5 < param4.field_a) {
                            param4.field_a = param4.field_a - 0.01;
                            break L98;
                          } else {
                            break L98;
                          }
                        }
                        L101: {
                          L102: {
                            if (0.0 == var18) {
                              break L102;
                            } else {
                              if (var18 == 128.0) {
                                break L102;
                              } else {
                                break L101;
                              }
                            }
                          }
                          L103: {
                            if (0.5 > param4.field_f) {
                              param4.field_f = param4.field_f + 0.01;
                              break L103;
                            } else {
                              break L103;
                            }
                          }
                          if (param4.field_f > 0.5) {
                            param4.field_f = param4.field_f - 0.01;
                            break L101;
                          } else {
                            break L101;
                          }
                        }
                        L104: {
                          L105: {
                            var38 = param6;
                            var39 = var38 / 2;
                            var38 = var38 - var39;
                            li.field_r = param9.a(ln.field_a, 128, var39);
                            if (li.field_r[0]) {
                              break L105;
                            } else {
                              if (li.field_r[1]) {
                                break L105;
                              } else {
                                break L104;
                              }
                            }
                          }
                          if ((param9.field_i ^ -1) != -28) {
                            break L104;
                          } else {
                            if (!param9.field_s) {
                              param9.field_I = param9.field_x;
                              param9.field_L = 100;
                              param9.field_s = true;
                              break L104;
                            } else {
                              break L104;
                            }
                          }
                        }
                        L106: {
                          var39 = var38 / 2;
                          param9.a(225, var18, 1);
                          li.field_r = param9.a(ln.field_a, 128, var39);
                          var38 = var38 - var39;
                          if (li.field_r[0]) {
                            break L106;
                          } else {
                            if (!li.field_r[1]) {
                              break L106;
                            } else {
                              break L106;
                            }
                          }
                        }
                        param9.a(225, var18, 1);
                        li.field_r = param9.a(ln.field_a, 128, var38);
                        if (li.field_r[0]) {
                          break L32;
                        } else {
                          if (!li.field_r[1]) {
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                      }
                    } else {
                      L107: {
                        if (0 >= param9.field_B) {
                          break L107;
                        } else {
                          param9.field_B = 0;
                          break L107;
                        }
                      }
                      L108: {
                        if (0 <= param9.field_I) {
                          param9.field_t = param6;
                          param9.field_K = param9.field_c;
                          break L108;
                        } else {
                          break L108;
                        }
                      }
                      L109: {
                        li.field_r = param9.a(param6, 3, ln.field_a);
                        if (li.field_r[0]) {
                          break L109;
                        } else {
                          if (li.field_r[1]) {
                            break L109;
                          } else {
                            if (0.01 > Math.random()) {
                              param9.field_D = 50;
                              param9.field_w = 0;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                        }
                      }
                      param9.field_w = 0;
                      param9.field_D = 50;
                      break L32;
                    }
                  }
                  if (param9.field_i != 27) {
                    break L12;
                  } else {
                    L110: {
                      ln.field_a.field_c[param12] = 6;
                      if (0 == ln.field_a.field_c[-1 + param12]) {
                        ln.field_a.field_c[-1 + param12] = 6;
                        break L110;
                      } else {
                        break L110;
                      }
                    }
                    L111: {
                      if (0 == ln.field_a.field_c[-1 + -ln.field_a.field_d + param12]) {
                        ln.field_a.field_c[-ln.field_a.field_d + (param12 - 1)] = 6;
                        break L111;
                      } else {
                        break L111;
                      }
                    }
                    if (ln.field_a.field_c[-ln.field_a.field_d + param12] == 0) {
                      ln.field_a.field_c[param12 + -ln.field_a.field_d] = 6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
              } else {
                L112: {
                  if ((param9.field_i ^ -1) != -28) {
                    break L112;
                  } else {
                    if (param9.field_s) {
                      break L112;
                    } else {
                      if (var21 != 0) {
                        break L112;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                if (param8) {
                  if (var21 == 0) {
                    param9.field_J = false;
                    if (var20 == 0) {
                      param9.field_w = 1;
                      param9.a(225, var18, param14);
                      break L12;
                    } else {
                      param9.field_w = 4;
                      param9.field_c = var18;
                      break L12;
                    }
                  } else {
                    param9.field_w = 1;
                    param9.field_J = true;
                    break L12;
                  }
                } else {
                  fieldTemp$7 = param9.field_D - 1;
                  param9.field_D = param9.field_D - 1;
                  if ((fieldTemp$7 ^ -1) > -1) {
                    var22 = (int)(Math.random() * 3.0);
                    if (-1 != (var22 ^ -1)) {
                      if (-2 != (var22 ^ -1)) {
                        if (var22 == 2) {
                          param9.field_w = 3;
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        param9.field_w = 2;
                        break L12;
                      }
                    } else {
                      param9.field_w = 1;
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            L113: {
              if (-6 == (param9.field_w ^ -1)) {
                break L113;
              } else {
                L114: {
                  if (var21 == 0) {
                    break L114;
                  } else {
                    param9.field_J = true;
                    param9.field_w = 1;
                    break L114;
                  }
                }
                L115: {
                  if (param11 > param1) {
                    break L115;
                  } else {
                    if (param1 < param15) {
                      break L115;
                    } else {
                      if (-param1 > param11) {
                        break L115;
                      } else {
                        if (-param1 > param15) {
                          break L115;
                        } else {
                          if (-20 != (param9.field_i ^ -1)) {
                            if (param9.field_J) {
                              break L113;
                            } else {
                              param9.field_w = 4;
                              break L113;
                            }
                          } else {
                            break L113;
                          }
                        }
                      }
                    }
                  }
                }
                param9.field_J = false;
                break L113;
              }
            }
            L116: {
              if (param9.field_I <= 0) {
                tm.field_q = 2;
                if (param9.field_i == 27) {
                  break L116;
                } else {
                  if ((param9.field_w ^ -1) != -6) {
                    param9.field_z = 0;
                    param9.field_w = 5;
                    param9.e((byte) -49);
                    if (8 != param9.field_i) {
                      break L116;
                    } else {
                      param9.field_C = 16;
                      break L116;
                    }
                  } else {
                    break L116;
                  }
                }
              } else {
                break L116;
              }
            }
            ak.field_f = ak.field_f + 1;
            if (param13 >= 12) {
              L117: {
                if (!param8) {
                  break L117;
                } else {
                  ak.field_f = ak.field_f + 50;
                  break L117;
                }
              }
              L118: {
                if (-5 != (param9.field_w ^ -1)) {
                  break L118;
                } else {
                  ak.field_f = ak.field_f + 450;
                  break L118;
                }
              }
              L119: {
                L120: {
                  if ((param9.field_i ^ -1) != -28) {
                    break L120;
                  } else {
                    L121: {
                      if (4 != param9.field_w) {
                        var22 = cm.field_c[param9.field_j.b(-4)];
                        if (0 >= var22) {
                          break L121;
                        } else {
                          lj.field_q = lj.field_q + var22 * 50;
                          break L121;
                        }
                      } else {
                        lj.field_q = 256;
                        break L121;
                      }
                    }
                    if (lj.field_q < 20) {
                      lj.field_q = 20;
                      break L120;
                    } else {
                      break L119;
                    }
                  }
                }
                break L119;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L122: {
            var17_ref = decompiledCaughtException;
            stackIn_474_0 = (RuntimeException) (var17_ref);

            stackIn_474_1 = new StringBuilder().append("ei.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_474_0);
              stackIn_475_1 = (StringBuilder) ((Object) stackIn_474_1);
              stackIn_475_2 = "null";
              break L122;
            } else {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_474_0);
              stackIn_475_1 = (StringBuilder) ((Object) stackIn_474_1);
              stackIn_475_2 = "{...}";
              break L122;
            }
          }
          L123: {


            stackIn_477_1 = ((StringBuilder) (Object) stackIn_475_1).append(stackIn_475_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_478_1 = (StringBuilder) ((Object) stackIn_477_1);
              stackIn_478_2 = "null";
              break L123;
            } else {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_478_1 = (StringBuilder) ((Object) stackIn_477_1);
              stackIn_478_2 = "{...}";
              break L123;
            }
          }
          L124: {


            stackIn_480_1 = ((StringBuilder) (Object) stackIn_478_1).append(stackIn_478_2).append(',');

            if (param5 == null) {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_481_1 = (StringBuilder) ((Object) stackIn_480_1);
              stackIn_481_2 = "null";
              break L124;
            } else {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_481_1 = (StringBuilder) ((Object) stackIn_480_1);
              stackIn_481_2 = "{...}";
              break L124;
            }
          }
          L125: {


            stackIn_483_1 = ((StringBuilder) (Object) stackIn_481_1).append(stackIn_481_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_484_1 = (StringBuilder) ((Object) stackIn_483_1);
              stackIn_484_2 = "null";
              break L125;
            } else {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_484_1 = (StringBuilder) ((Object) stackIn_483_1);
              stackIn_484_2 = "{...}";
              break L125;
            }
          }
          L126: {


            stackIn_486_1 = ((StringBuilder) (Object) stackIn_484_1).append(stackIn_484_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');

            if (param16 == null) {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_487_1 = (StringBuilder) ((Object) stackIn_486_1);
              stackIn_487_2 = "null";
              break L126;
            } else {
              stackIn_475_0 = (RuntimeException) ((Object) stackIn_475_0);
              stackIn_487_1 = (StringBuilder) ((Object) stackIn_486_1);
              stackIn_487_2 = "{...}";
              break L126;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_475_0), stackIn_487_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static bd[] a(int param0, int param1, int param2, int param3, int param4) {
        bd[] var6 = new bd[9];
        bd[] var5 = var6;
        bd dupTemp$0 = el.a(-7, param1, param3);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        if (param4 <= 101) {
            field_o = (eg) null;
        }
        bd dupTemp$1 = el.a(-122, param1, param0);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (-1 != (param2 ^ -1)) {
            var6[4] = el.a(-115, 64, param2);
        }
        return var5;
    }

    final static void d(int param0) {
        int stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (-51 < (jf.field_d ^ -1)) {
            L1: {
              stackIn_4_0 = 0;

              stackIn_4_1 = 0;

              stackIn_4_2 = 640;

              stackIn_4_3 = 480;

              stackIn_4_4 = 0;

              if (-26 < (jf.field_d ^ -1)) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = 0;
                break L1;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = stackIn_4_4;
                stackIn_5_5 = -50 + 2 * jf.field_d;
                break L1;
              }
            }
            si.a(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, -(stackIn_5_5 * 5) + 250);
            var1 = -72 + mm.field_m[0].field_j.field_e * 24 - uj.field_p.field_e;
            var2 = -48 + 24 * mm.field_m[0].field_j.field_g - uj.field_p.field_g;
            if (dl.field_n == null) {
              break L0;
            } else {
              L2: {
                var3 = 0;
                var4 = 1;
                if (bm.field_c == 0) {
                  L3: {
                    if (rl.field_c == 0) {
                      var4 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if ((rl.field_c ^ -1) == -2) {
                    var3 = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L4: {
                    if ((rl.field_c ^ -1) >= -5) {
                      var3 = 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (0 != rl.field_c) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (-9 != (rl.field_c ^ -1)) {
                      break L6;
                    } else {
                      var4 = 0;
                      break L6;
                    }
                  }
                  if (rl.field_c != 9) {
                    break L2;
                  } else {
                    var4 = 0;
                    break L2;
                  }
                }
              }
              if (var4 == 0) {
                break L0;
              } else {
                vj.field_e[0].a(true, 128, 192, var1 + dl.field_n.field_z / 2, dl.field_n.field_z / 2 + var2);
                if (var3 == 0) {
                  if (jf.field_d >= 40) {
                    dl.field_n.c(-((50 - jf.field_d) / 2) + var1, -((-jf.field_d + 50) / 2) + var2, -jf.field_d + dl.field_n.field_u - -50, 50 + dl.field_n.field_r - jf.field_d, -(25 * jf.field_d) + 1250);
                    break L0;
                  } else {
                    dl.field_n.a(var1 - (-jf.field_d + 50) / 2, var2 + -((50 - jf.field_d) / 2), 50 + (dl.field_n.field_u - jf.field_d), 50 + (dl.field_n.field_r + -jf.field_d));
                    si.a(-((-jf.field_d + 50) / 2) + var1, -((-jf.field_d + 50) / 2) + var2, dl.field_n.field_u + 50 - jf.field_d, 50 + dl.field_n.field_r + -jf.field_d, 0, (10200 - 255 * jf.field_d) / 40);
                    break L0;
                  }
                } else {
                  if ((jf.field_d ^ -1) > -41) {
                    dl.field_n.b(var1 + dl.field_n.field_z / 2, var2 + dl.field_n.field_z / 2, 0, jf.field_d + 78 << -931948667);
                    break L0;
                  } else {
                    dl.field_n.c((50 + -jf.field_d) / 4 + var1, var2 - -((-jf.field_d + 50) / 4), -((-jf.field_d + 50) / 2) + dl.field_n.field_u, dl.field_n.field_r + -((50 - jf.field_d) / 2), -(25 * jf.field_d) + 1250);
                    break L0;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L7: {
          if (param0 <= -8) {
            break L7;
          } else {
            ei.d(-29);
            break L7;
          }
        }
    }

    final static void a(p param0, byte param1, int[] param2, int param3, int[] param4, int[] param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        oc var7 = null;
        og var8 = null;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.a(param1 ^ -8463);
              param0.field_e = 0;
              if (param1 == -116) {
                break L1;
              } else {
                ei.d(49);
                break L1;
              }
            }
            var6_int = 0;
            var7 = param0.field_j;
            var8 = param0.field_l;
            var9 = param0.field_c;
            param4[param3] = 0;
            var11 = ln.field_a.field_r[param3] ? 1 : 0;
            L2: while (true) {
              L3: {
                if (-1 != (param0.field_e ^ -1)) {
                  break L3;
                } else {
                  if (var6_int >= 104) {
                    break L3;
                  } else {
                    L4: {
                      var8.a(5, (byte) 94, var9);
                      var6_int++;
                      param0.a(param1 + 8689);
                      var12 = var7.b(-4);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (wb.field_Z) {
                          break L4;
                        } else {
                          if (!ln.field_a.field_r[var12]) {
                            break L4;
                          } else {
                            param0.field_e = 1;
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      var11 = ln.field_a.field_r[var12] ? 1 : 0;
                      if (param2[var12] == 1) {
                        if (4 <= var6_int) {
                          param0.field_e = 1;
                          break L5;
                        } else {
                          tg.a(var12, param1 + 30543);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if ((param4[var12] ^ -1) == -3) {
                        param0.field_e = 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var13 = 26 + -(var6_int >> 982722818);
                    if (param5[var12] >= var13) {
                      continue L2;
                    } else {
                      param5[var12] = var13;
                      continue L2;
                    }
                  }
                }
              }
              param4[param3] = 3;
              param0.field_i = -1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var6);

            stackIn_24_1 = new StringBuilder().append("ei.D(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L10;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ')');
        }
    }

    public static void c(int param0) {
        field_p = null;
        field_m = null;
        field_k = null;
        field_o = null;
        field_h = null;
        field_n = null;
        if (param0 != 3) {
            String var2 = (String) null;
            ei.a((gb) null, 102, (String) null, (String) null);
        }
        field_q = null;
    }

    final static bd[] a(gb param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        oc var6 = null;
        bd[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a((byte) -2, param2);
              if (param1 >= 88) {
                break L1;
              } else {
                var6 = (oc) null;
                ei.a(36, -95, (oc) null, true, (og) null, (oc) null, 63, -21, false, (oj) null, -5, 22, 60, 105, 79, 88, (oc) null);
                break L1;
              }
            }
            var5 = param0.a(var4_int, param3, -1);
            stackIn_3_0 = ne.a(44, param0, var5, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ei.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    ei(long param0, int param1, byte[] param2) {
        try {
            this.field_r = param2;
            this.field_j = param0;
            this.field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ei.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = false;
        field_l = 0;
        field_k = "Passwords must be between 5 and 20 characters long";
        field_q = new vl();
        field_t = true;
        field_h = new vl();
    }
}
