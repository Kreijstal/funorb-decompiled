/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class s extends le {
    int field_i;
    fb field_h;
    static vn field_j;

    final static void a(long param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9, ec param10, String param11, int param12, int param13) {
        try {
            int var15 = 0;
            IOException var16 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              fj.field_g = new am(param1);
              dp.field_e = new am(param7);
              h.field_b = param5;
              var15 = 112 / ((56 - param12) / 57);
              jm.field_B = param10;
              cn.field_j = param13;
              if (!param4) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              ni.field_a = stackIn_3_0 != 0;
              tm.field_o = param11;
              ci.field_c = param8;
              kg.field_k = param9;
              if (!param2) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            ih.field_S = stackIn_6_0 != 0;
            ba.field_b = param3;
            le.field_g = param6;
            lg.field_u = param0;
            if (null != jm.field_B.field_b) {
              try {
                ce.field_t = new sf(jm.field_B.field_b, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, wk param1, ub param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        kd var9 = null;
        qh var10 = null;
        kd var11 = null;
        qh var12 = null;
        kd var13 = null;
        qh var14 = null;
        var8 = ZombieDawn.field_J;
        var3 = 83 % ((param0 - -39) / 39);
        if (ac.field_m <= 1428) {
          if (0 == ac.field_m % 35) {
            lg.a(2, (byte) 100);
            if (-1.0f == oc.field_c) {
              L0: {
                oc.field_c = (float)param1.field_c;
                if (oc.field_c > 240.0f) {
                  oc.field_c = oc.field_c - i.field_V;
                  param1.field_c = (int)oc.field_c;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-1429 != (ac.field_m ^ -1)) {
                L1: {
                  if (ac.field_m <= 1172) {
                    if (1172 == ac.field_m) {
                      L2: {
                        wc.field_Rb = ge.field_c;
                        ha.field_d.w(0);
                        wi.field_e = ha.field_d.field_Pb;
                        if (ac.field_m <= 620) {
                          if (150 < ac.field_m) {
                            if (-1 != (ac.field_m % 20 ^ -1)) {
                              break L2;
                            } else {
                              if (0.7 > (double)i.field_V) {
                                i.field_V = i.field_V + 0.10000000149011612f;
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          } else {
                            break L2;
                          }
                        } else {
                          L3: {
                            if (i.field_V <= 0.0f) {
                              break L3;
                            } else {
                              if (-1 != (ac.field_m % 20 ^ -1)) {
                                break L3;
                              } else {
                                i.field_V = i.field_V - 0.10000000149011612f;
                                break L3;
                              }
                            }
                          }
                          if (0.0f > i.field_V) {
                            i.field_V = 0.0f;
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      if (850 >= ac.field_m) {
                        if (850 != ac.field_m) {
                          break L1;
                        } else {
                          L4: {
                            wi.field_a = ce.field_u;
                            if (ac.field_m <= 620) {
                              if (150 < ac.field_m) {
                                if (-1 != (ac.field_m % 20 ^ -1)) {
                                  break L4;
                                } else {
                                  if (0.7 > (double)i.field_V) {
                                    i.field_V = i.field_V + 0.10000000149011612f;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              L5: {
                                if (i.field_V <= 0.0f) {
                                  break L5;
                                } else {
                                  if (-1 != (ac.field_m % 20 ^ -1)) {
                                    break L5;
                                  } else {
                                    i.field_V = i.field_V - 0.10000000149011612f;
                                    break L5;
                                  }
                                }
                              }
                              if (0.0f > i.field_V) {
                                i.field_V = 0.0f;
                                break L4;
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L6: {
                          var4 = -ac.field_m - -1106;
                          if (-1 < (var4 ^ -1)) {
                            var4 = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ZombieDawn.b(126, var4 * wi.field_a >> 779680712);
                        if (ac.field_m % 2 == 0) {
                          param2.i(16777215);
                          if ((ac.field_m + -850) / 2 == 100) {
                            ha.field_d.field_x = -50 + ha.field_d.f(237239984) << -1170422704;
                            var5 = 0;
                            L7: while (true) {
                              if (-6 >= (var5 ^ -1)) {
                                break L1;
                              } else {
                                var13 = dj.field_e.a(10, (byte) 124, 90, 340, 380);
                                var14 = new qh();
                                var14.a(0, (le) (Object) new kk(var13.a(true), var13.f(237239984) + -100));
                                var13.a(var14, true);
                                var5++;
                                continue L7;
                              }
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    L8: {
                      var4 = 1428 + -ac.field_m;
                      if (-1 < (var4 ^ -1)) {
                        var4 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    qb.a(false, var4 * wc.field_Rb >> 1938762664);
                    wi.field_e = wi.field_e - 1;
                    if (0 >= wi.field_e) {
                      qj.field_f = kh.a(63, false);
                      wi.field_e = 20;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                if (ac.field_m <= 620) {
                  if (150 < ac.field_m) {
                    L9: {
                      if (-1 != (ac.field_m % 20 ^ -1)) {
                        break L9;
                      } else {
                        if (0.7 > (double)i.field_V) {
                          i.field_V = i.field_V + 0.10000000149011612f;
                          break L9;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L10: {
                    if (i.field_V <= 0.0f) {
                      break L10;
                    } else {
                      if (-1 != (ac.field_m % 20 ^ -1)) {
                        break L10;
                      } else {
                        i.field_V = i.field_V - 0.10000000149011612f;
                        if (0.0f > i.field_V) {
                          i.field_V = 0.0f;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (0.0f > i.field_V) {
                    i.field_V = 0.0f;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if (qj.field_f == null) {
                    break L11;
                  } else {
                    if (qj.field_f.l()) {
                      break L11;
                    } else {
                      pc.a((byte) 13, qj.field_f);
                      break L11;
                    }
                  }
                }
                ch.b(73);
                ZombieDawn.b(114, wi.field_a);
                qb.a(false, wc.field_Rb);
                wo.field_wb = true;
                return;
              }
            } else {
              L12: {
                if (oc.field_c > 240.0f) {
                  oc.field_c = oc.field_c - i.field_V;
                  param1.field_c = (int)oc.field_c;
                  break L12;
                } else {
                  break L12;
                }
              }
              if (-1429 != (ac.field_m ^ -1)) {
                L13: {
                  if (ac.field_m <= 1172) {
                    if (1172 == ac.field_m) {
                      wc.field_Rb = ge.field_c;
                      ha.field_d.w(0);
                      wi.field_e = ha.field_d.field_Pb;
                      if (ac.field_m > 620) {
                        L14: {
                          if (i.field_V <= 0.0f) {
                            break L14;
                          } else {
                            if (-1 != (ac.field_m % 20 ^ -1)) {
                              break L14;
                            } else {
                              i.field_V = i.field_V - 0.10000000149011612f;
                              break L14;
                            }
                          }
                        }
                        if (0.0f <= i.field_V) {
                          return;
                        } else {
                          i.field_V = 0.0f;
                          return;
                        }
                      } else {
                        L15: {
                          if (150 < ac.field_m) {
                            if (-1 != (ac.field_m % 20 ^ -1)) {
                              break L15;
                            } else {
                              if (0.7 > (double)i.field_V) {
                                i.field_V = i.field_V + 0.10000000149011612f;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                        return;
                      }
                    } else {
                      if (850 >= ac.field_m) {
                        if (850 != ac.field_m) {
                          break L13;
                        } else {
                          wi.field_a = ce.field_u;
                          if (ac.field_m > 620) {
                            L16: {
                              if (i.field_V <= 0.0f) {
                                break L16;
                              } else {
                                if (-1 != (ac.field_m % 20 ^ -1)) {
                                  break L16;
                                } else {
                                  i.field_V = i.field_V - 0.10000000149011612f;
                                  break L16;
                                }
                              }
                            }
                            if (0.0f > i.field_V) {
                              i.field_V = 0.0f;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            L17: {
                              if (150 < ac.field_m) {
                                if (-1 != (ac.field_m % 20 ^ -1)) {
                                  break L17;
                                } else {
                                  if (0.7 > (double)i.field_V) {
                                    i.field_V = i.field_V + 0.10000000149011612f;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        L18: {
                          var4 = -ac.field_m - -1106;
                          if (-1 < (var4 ^ -1)) {
                            var4 = 0;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        ZombieDawn.b(126, var4 * wi.field_a >> 779680712);
                        if (ac.field_m % 2 == 0) {
                          param2.i(16777215);
                          if ((ac.field_m + -850) / 2 == 100) {
                            ha.field_d.field_x = -50 + ha.field_d.f(237239984) << -1170422704;
                            var5 = 0;
                            L19: while (true) {
                              if (-6 >= (var5 ^ -1)) {
                                break L13;
                              } else {
                                var11 = dj.field_e.a(10, (byte) 124, 90, 340, 380);
                                var12 = new qh();
                                var12.a(0, (le) (Object) new kk(var11.a(true), var11.f(237239984) + -100));
                                var11.a(var12, true);
                                var5++;
                                continue L19;
                              }
                            }
                          } else {
                            break L13;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  } else {
                    L20: {
                      var4 = 1428 + -ac.field_m;
                      if (-1 < (var4 ^ -1)) {
                        var4 = 0;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    qb.a(false, var4 * wc.field_Rb >> 1938762664);
                    wi.field_e = wi.field_e - 1;
                    if (0 >= wi.field_e) {
                      qj.field_f = kh.a(63, false);
                      wi.field_e = 20;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                if (ac.field_m <= 620) {
                  if (150 < ac.field_m) {
                    L21: {
                      if (-1 != (ac.field_m % 20 ^ -1)) {
                        break L21;
                      } else {
                        if (0.7 > (double)i.field_V) {
                          i.field_V = i.field_V + 0.10000000149011612f;
                          break L21;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L22: {
                    if (i.field_V <= 0.0f) {
                      break L22;
                    } else {
                      if (-1 != (ac.field_m % 20 ^ -1)) {
                        break L22;
                      } else {
                        i.field_V = i.field_V - 0.10000000149011612f;
                        if (0.0f <= i.field_V) {
                          return;
                        } else {
                          i.field_V = 0.0f;
                          return;
                        }
                      }
                    }
                  }
                  if (0.0f > i.field_V) {
                    i.field_V = 0.0f;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L23: {
                  if (qj.field_f == null) {
                    break L23;
                  } else {
                    if (qj.field_f.l()) {
                      break L23;
                    } else {
                      pc.a((byte) 13, qj.field_f);
                      break L23;
                    }
                  }
                }
                ch.b(73);
                ZombieDawn.b(114, wi.field_a);
                qb.a(false, wc.field_Rb);
                wo.field_wb = true;
                return;
              }
            }
          } else {
            L24: {
              if (-1.0f != oc.field_c) {
                break L24;
              } else {
                oc.field_c = (float)param1.field_c;
                break L24;
              }
            }
            L25: {
              if (oc.field_c > 240.0f) {
                oc.field_c = oc.field_c - i.field_V;
                param1.field_c = (int)oc.field_c;
                break L25;
              } else {
                break L25;
              }
            }
            if (-1429 != (ac.field_m ^ -1)) {
              L26: {
                if (ac.field_m <= 1172) {
                  if (1172 == ac.field_m) {
                    wc.field_Rb = ge.field_c;
                    ha.field_d.w(0);
                    wi.field_e = ha.field_d.field_Pb;
                    if (ac.field_m > 620) {
                      L27: {
                        if (i.field_V <= 0.0f) {
                          break L27;
                        } else {
                          if (-1 != (ac.field_m % 20 ^ -1)) {
                            break L27;
                          } else {
                            i.field_V = i.field_V - 0.10000000149011612f;
                            break L27;
                          }
                        }
                      }
                      if (0.0f <= i.field_V) {
                        return;
                      } else {
                        i.field_V = 0.0f;
                        return;
                      }
                    } else {
                      L28: {
                        if (150 < ac.field_m) {
                          if (-1 != (ac.field_m % 20 ^ -1)) {
                            break L28;
                          } else {
                            if (0.7 > (double)i.field_V) {
                              i.field_V = i.field_V + 0.10000000149011612f;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        } else {
                          break L28;
                        }
                      }
                      return;
                    }
                  } else {
                    if (850 >= ac.field_m) {
                      if (850 != ac.field_m) {
                        break L26;
                      } else {
                        wi.field_a = ce.field_u;
                        if (ac.field_m > 620) {
                          L29: {
                            if (i.field_V <= 0.0f) {
                              break L29;
                            } else {
                              if (-1 != (ac.field_m % 20 ^ -1)) {
                                break L29;
                              } else {
                                i.field_V = i.field_V - 0.10000000149011612f;
                                break L29;
                              }
                            }
                          }
                          if (0.0f <= i.field_V) {
                            return;
                          } else {
                            i.field_V = 0.0f;
                            return;
                          }
                        } else {
                          L30: {
                            if (150 < ac.field_m) {
                              if (-1 != (ac.field_m % 20 ^ -1)) {
                                break L30;
                              } else {
                                if (0.7 > (double)i.field_V) {
                                  i.field_V = i.field_V + 0.10000000149011612f;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                            } else {
                              break L30;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L31: {
                        var4 = -ac.field_m - -1106;
                        if (-1 < (var4 ^ -1)) {
                          var4 = 0;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      ZombieDawn.b(126, var4 * wi.field_a >> 779680712);
                      if (ac.field_m % 2 == 0) {
                        param2.i(16777215);
                        if ((ac.field_m + -850) / 2 == 100) {
                          ha.field_d.field_x = -50 + ha.field_d.f(237239984) << -1170422704;
                          var5 = 0;
                          L32: while (true) {
                            if (-6 >= (var5 ^ -1)) {
                              break L26;
                            } else {
                              var9 = dj.field_e.a(10, (byte) 124, 90, 340, 380);
                              var10 = new qh();
                              var10.a(0, (le) (Object) new kk(var9.a(true), var9.f(237239984) + -100));
                              var9.a(var10, true);
                              var5++;
                              continue L32;
                            }
                          }
                        } else {
                          break L26;
                        }
                      } else {
                        break L26;
                      }
                    }
                  }
                } else {
                  L33: {
                    var4 = 1428 + -ac.field_m;
                    if (-1 < (var4 ^ -1)) {
                      var4 = 0;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  qb.a(false, var4 * wc.field_Rb >> 1938762664);
                  wi.field_e = wi.field_e - 1;
                  if (0 >= wi.field_e) {
                    qj.field_f = kh.a(63, false);
                    wi.field_e = 20;
                    break L26;
                  } else {
                    break L26;
                  }
                }
              }
              if (ac.field_m <= 620) {
                if (150 < ac.field_m) {
                  if (-1 == (ac.field_m % 20 ^ -1)) {
                    if (0.7 <= (double)i.field_V) {
                      return;
                    } else {
                      i.field_V = i.field_V + 0.10000000149011612f;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L34: {
                  if (i.field_V <= 0.0f) {
                    break L34;
                  } else {
                    if (-1 != (ac.field_m % 20 ^ -1)) {
                      break L34;
                    } else {
                      i.field_V = i.field_V - 0.10000000149011612f;
                      if (0.0f <= i.field_V) {
                        return;
                      } else {
                        i.field_V = 0.0f;
                        return;
                      }
                    }
                  }
                }
                if (0.0f <= i.field_V) {
                  return;
                } else {
                  i.field_V = 0.0f;
                  return;
                }
              }
            } else {
              L35: {
                if (qj.field_f == null) {
                  break L35;
                } else {
                  if (qj.field_f.l()) {
                    break L35;
                  } else {
                    pc.a((byte) 13, qj.field_f);
                    break L35;
                  }
                }
              }
              ch.b(73);
              ZombieDawn.b(114, wi.field_a);
              qb.a(false, wc.field_Rb);
              wo.field_wb = true;
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_j = null;
        if (param0 <= -111) {
            return;
        }
        field_j = null;
    }

    final static String a(int param0, String param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if ((var6_int ^ -1) <= -1) {
            var5 = var6_int - -2;
            L1: while (true) {
              L2: {
                if (var3 <= var5) {
                  break L2;
                } else {
                  if (!bj.a(param1.charAt(var5), 78)) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param1.substring(var6_int - -2, var5);
              if (sj.a((byte) 126, (CharSequence) (Object) var7_ref)) {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param1.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = ra.a((CharSequence) (Object) var7_ref, 122);
                    var4 = var4 + (param2[var8].length() + (-var5 + var6_int));
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          } else {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            if (param0 == 1938762664) {
              L3: while (true) {
                var8 = param1.indexOf("<%", var5);
                if (var8 < 0) {
                  StringBuilder discarded$3 = var6.append(param1.substring(var7));
                  return var6.toString();
                } else {
                  var5 = 2 + var8;
                  L4: while (true) {
                    L5: {
                      if (var3 <= var5) {
                        break L5;
                      } else {
                        if (!bj.a(param1.charAt(var5), param0 + -1938762567)) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    var9 = param1.substring(var8 - -2, var5);
                    if (sj.a((byte) 59, (CharSequence) (Object) var9)) {
                      if (var3 <= var5) {
                        continue L3;
                      } else {
                        if (param1.charAt(var5) != 62) {
                          continue L3;
                        } else {
                          var5++;
                          var10 = ra.a((CharSequence) (Object) var9, param0 ^ 1938762718);
                          StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                          StringBuilder discarded$5 = var6.append(param2[var10]);
                          var7 = var5;
                          continue L3;
                        }
                      }
                    } else {
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    s(fb param0, int param1) {
        ((s) this).field_i = param1;
        ((s) this).field_h = param0;
    }

    static {
    }
}
