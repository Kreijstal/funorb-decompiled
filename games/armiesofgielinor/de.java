/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static String field_c;
    static String field_d;
    static String field_b;
    static boolean field_a;

    final static String a(byte param0, int param1, ha param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7_int = 0;
        jd var7 = null;
        int var8 = 0;
        int var9 = 0;
        ne var10 = null;
        ne var11 = null;
        int stackIn_214_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_217_1 = 0;
        int stackOut_212_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_216_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_215_1 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (~param5 != ~param2.field_gb) {
          return sj.field_g;
        } else {
          if (0 < param2.e(20, param5, param4)) {
            return fo.a(4800, kv.field_I, new String[1]);
          } else {
            if (uc.field_d[param4][3] == 4) {
              if (uc.field_d[param4][5] == 1) {
                if (0 == param2.field_E[param5][uc.field_d[param4][6]]) {
                  return fo.a(4800, a.field_n, new String[1]);
                } else {
                  if (param2.field_E[param5][uc.field_d[param4][6]] >= 5) {
                    return fo.a(4800, rr.field_b, new String[1]);
                  } else {
                    return null;
                  }
                }
              } else {
                if (uc.field_d[param4][5] == 2) {
                  if (!param2.field_Bb) {
                    return ij.field_B;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L0: {
                if (0 > param3) {
                  break L0;
                } else {
                  if (param1 >= 0) {
                    L1: {
                      if (param2.field_v <= param3) {
                        break L1;
                      } else {
                        if (~param2.field_db >= ~param1) {
                          break L1;
                        } else {
                          var6_int = 98 % ((param0 - 5) / 61);
                          var7_int = -uc.field_d[param4][7] + param3;
                          L2: while (true) {
                            if (~var7_int < ~(uc.field_d[param4][7] + param3)) {
                              var10 = param2.field_Eb[param3 + param2.field_v * param1];
                              var11 = var10;
                              var7 = var10.field_c;
                              var8 = uc.field_d[param4][3];
                              if (var8 == 0) {
                                if (var7 == null) {
                                  return ai.field_N;
                                } else {
                                  if (!param2.c(var7.field_O, -16985, param5)) {
                                    return gp.field_a;
                                  } else {
                                    L3: {
                                      var8 = param4;
                                      if (115 != var8) {
                                        if (var8 == 119) {
                                          if (var7.field_N != 43) {
                                            return fg.field_n;
                                          } else {
                                            if (var7.field_F) {
                                              return fo.a(4800, ti.field_b, new String[1]);
                                            } else {
                                              break L3;
                                            }
                                          }
                                        } else {
                                          if (var8 != 118) {
                                            if (var8 == 116) {
                                              if (var7.field_N == 58) {
                                                if (!var7.field_F) {
                                                  break L3;
                                                } else {
                                                  return fo.a(4800, ti.field_b, new String[1]);
                                                }
                                              } else {
                                                return al.field_i;
                                              }
                                            } else {
                                              if (var8 != 117) {
                                                if (var8 != 120) {
                                                  if (var8 == 46) {
                                                    L4: {
                                                      if (34 != var7.field_N) {
                                                        break L4;
                                                      } else {
                                                        if (!var7.field_W) {
                                                          break L4;
                                                        } else {
                                                          if (var7.field_B > 0) {
                                                            return eq.field_g;
                                                          } else {
                                                            break L4;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var7.field_s) {
                                                      break L3;
                                                    } else {
                                                      return eq.field_g;
                                                    }
                                                  } else {
                                                    break L3;
                                                  }
                                                } else {
                                                  if (!var7.field_C) {
                                                    break L3;
                                                  } else {
                                                    return fo.a(4800, ti.field_b, new String[1]);
                                                  }
                                                }
                                              } else {
                                                if (53 != var7.field_N) {
                                                  return cs.field_X;
                                                } else {
                                                  if (!var7.field_F) {
                                                    break L3;
                                                  } else {
                                                    return fo.a(4800, ti.field_b, new String[1]);
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (var7.field_N == 59) {
                                              if (var7.field_F) {
                                                return fo.a(4800, ti.field_b, new String[1]);
                                              } else {
                                                break L3;
                                              }
                                            } else {
                                              return pj.field_A;
                                            }
                                          }
                                        }
                                      } else {
                                        if (var7.field_N != 63) {
                                          return eq.field_k;
                                        } else {
                                          if (!var7.field_F) {
                                            break L3;
                                          } else {
                                            return fo.a(4800, ti.field_b, new String[1]);
                                          }
                                        }
                                      }
                                    }
                                    L5: {
                                      if (uc.field_d[param4][4] == 5) {
                                        if (~param5 != ~var7.field_O) {
                                          return ji.field_a;
                                        } else {
                                          if (!var7.field_s) {
                                            if (param4 != 109) {
                                              break L5;
                                            } else {
                                              L6: {
                                                if (var7.field_N == 39) {
                                                  break L6;
                                                } else {
                                                  if (51 != var7.field_N) {
                                                    break L5;
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                              }
                                              return sc.field_i;
                                            }
                                          } else {
                                            return vg.field_o;
                                          }
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                    L7: {
                                      if (uc.field_d[param4][4] != 2) {
                                        break L7;
                                      } else {
                                        if (19 == uc.field_d[param4][5]) {
                                          if (~uc.field_d[param4][6] > ~bw.field_m[var7.field_N][2]) {
                                            return fo.a(4800, sq.field_s, new String[2]);
                                          } else {
                                            if (var7.field_bb) {
                                              return lb.field_b;
                                            } else {
                                              L8: {
                                                if (var7.field_s) {
                                                  break L8;
                                                } else {
                                                  if (8 != var7.field_P) {
                                                    if (var7.field_N == 39) {
                                                      return oi.field_b;
                                                    } else {
                                                      break L7;
                                                    }
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              return sd.field_l;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (uc.field_d[param4][4] != 1) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (~var7.c((byte) 81) != ~uc.field_d[param4][6]) {
                                            break L10;
                                          } else {
                                            if (~var7.j(20640) != ~uc.field_d[param4][5]) {
                                              break L10;
                                            } else {
                                              return fo.a(4800, ti.field_b, new String[1]);
                                            }
                                          }
                                        }
                                        L11: {
                                          if (uc.field_d[param4][5] != 0) {
                                            break L11;
                                          } else {
                                            if (4 == var7.g(0)) {
                                              return ah.field_c;
                                            } else {
                                              if (var7.g(0) != 3) {
                                                if (var7.field_N != 34) {
                                                  break L11;
                                                } else {
                                                  if (var7.field_W) {
                                                    return fc.field_c;
                                                  } else {
                                                    break L11;
                                                  }
                                                }
                                              } else {
                                                return qa.field_E;
                                              }
                                            }
                                          }
                                        }
                                        L12: {
                                          if (uc.field_d[param4][5] != 1) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (var7.field_N != 34) {
                                                break L13;
                                              } else {
                                                if (!var7.field_W) {
                                                  break L13;
                                                } else {
                                                  return fc.field_c;
                                                }
                                              }
                                            }
                                            if (2 == var7.g(0)) {
                                              break L12;
                                            } else {
                                              if (var7.field_N == 18) {
                                                break L12;
                                              } else {
                                                if (var7.field_N == 28) {
                                                  break L12;
                                                } else {
                                                  return wn.field_bb;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L14: {
                                          if (2 != uc.field_d[param4][5]) {
                                            break L14;
                                          } else {
                                            L15: {
                                              if (34 != var7.field_N) {
                                                break L15;
                                              } else {
                                                if (!var7.field_W) {
                                                  break L15;
                                                } else {
                                                  return fc.field_c;
                                                }
                                              }
                                            }
                                            if (3 != var7.g(0)) {
                                              return hv.field_O;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L16: {
                                          if (uc.field_d[param4][5] != 4) {
                                            break L16;
                                          } else {
                                            L17: {
                                              if (var7.field_N != 34) {
                                                break L17;
                                              } else {
                                                if (!var7.field_W) {
                                                  break L17;
                                                } else {
                                                  return fc.field_c;
                                                }
                                              }
                                            }
                                            if (var7.g(0) == 4) {
                                              break L16;
                                            } else {
                                              return bc.field_h;
                                            }
                                          }
                                        }
                                        L18: {
                                          if (3 != uc.field_d[param4][5]) {
                                            break L18;
                                          } else {
                                            if (var7.field_N == 81) {
                                              break L18;
                                            } else {
                                              if (var7.field_N == 4) {
                                                break L18;
                                              } else {
                                                if (74 == var7.field_N) {
                                                  break L18;
                                                } else {
                                                  if (var7.field_N == 34) {
                                                    break L18;
                                                  } else {
                                                    return sd.field_r;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (uc.field_d[param4][6] != 6) {
                                          break L9;
                                        } else {
                                          if ((64 & bw.field_m[var7.field_N][10]) != 0) {
                                            return iu.field_r;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L19: {
                                      if (uc.field_d[param4][4] == 0) {
                                        if (~uc.field_d[param4][6] != ~var7.field_o) {
                                          break L19;
                                        } else {
                                          if (var7.field_P != uc.field_d[param4][5]) {
                                            break L19;
                                          } else {
                                            return fo.a(4800, ti.field_b, new String[1]);
                                          }
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (uc.field_d[param4][4] == 3) {
                                        if (uc.field_d[param4][5] == var7.field_ab) {
                                          return fo.a(4800, ti.field_b, new String[1]);
                                        } else {
                                          L21: {
                                            if (3 != uc.field_d[param4][5]) {
                                              break L21;
                                            } else {
                                              L22: {
                                                if (4 == var7.g(0)) {
                                                  break L22;
                                                } else {
                                                  if (var7.r((byte) 115)) {
                                                    break L22;
                                                  } else {
                                                    if (var7.o((byte) 98)) {
                                                      break L22;
                                                    } else {
                                                      if (var7.field_N == 39) {
                                                        break L22;
                                                      } else {
                                                        if (var7.field_N == 51) {
                                                          break L22;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              return sp.field_d;
                                            }
                                          }
                                          L23: {
                                            if (uc.field_d[param4][5] != 4) {
                                              break L23;
                                            } else {
                                              L24: {
                                                if (var7.g(0) == 4) {
                                                  break L24;
                                                } else {
                                                  if (var7.o((byte) 98)) {
                                                    break L24;
                                                  } else {
                                                    if (var7.field_N == 39) {
                                                      break L24;
                                                    } else {
                                                      if (var7.field_N == 51) {
                                                        break L24;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              return sp.field_d;
                                            }
                                          }
                                          L25: {
                                            if (2 != uc.field_d[param4][5]) {
                                              break L25;
                                            } else {
                                              L26: {
                                                if (var7.g(0) == 4) {
                                                  break L26;
                                                } else {
                                                  if (var7.j((byte) -83)) {
                                                    break L26;
                                                  } else {
                                                    if (bw.field_m[var7.field_N][7] > 1) {
                                                      break L26;
                                                    } else {
                                                      L27: {
                                                        L28: {
                                                          if (var7.field_N != 34) {
                                                            break L28;
                                                          } else {
                                                            if (!var7.field_W) {
                                                              break L28;
                                                            } else {
                                                              stackOut_212_0 = 1;
                                                              stackIn_214_0 = stackOut_212_0;
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        stackOut_213_0 = 0;
                                                        stackIn_214_0 = stackOut_213_0;
                                                        break L27;
                                                      }
                                                      L29: {
                                                        stackOut_214_0 = stackIn_214_0;
                                                        stackIn_216_0 = stackOut_214_0;
                                                        stackIn_215_0 = stackOut_214_0;
                                                        if (var7.field_N != 51) {
                                                          stackOut_216_0 = stackIn_216_0;
                                                          stackOut_216_1 = 0;
                                                          stackIn_217_0 = stackOut_216_0;
                                                          stackIn_217_1 = stackOut_216_1;
                                                          break L29;
                                                        } else {
                                                          stackOut_215_0 = stackIn_215_0;
                                                          stackOut_215_1 = 1;
                                                          stackIn_217_0 = stackOut_215_0;
                                                          stackIn_217_1 = stackOut_215_1;
                                                          break L29;
                                                        }
                                                      }
                                                      if ((stackIn_217_0 | stackIn_217_1) == 0) {
                                                        break L25;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              return sp.field_d;
                                            }
                                          }
                                          L30: {
                                            if (uc.field_d[param4][5] != 1) {
                                              break L30;
                                            } else {
                                              if (!var7.i(-21428)) {
                                                break L30;
                                              } else {
                                                return sp.field_d;
                                              }
                                            }
                                          }
                                          if (uc.field_d[param4][5] != 5) {
                                            break L20;
                                          } else {
                                            if (var7.c(false)) {
                                              return cl.field_w;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      } else {
                                        break L20;
                                      }
                                    }
                                    if (var7.field_D) {
                                      return po.field_a;
                                    } else {
                                      return null;
                                    }
                                  }
                                }
                              } else {
                                if (var8 != 1) {
                                  if (var8 != 2) {
                                    L31: {
                                      if (var8 != 8) {
                                        if (var8 == 6) {
                                          if (-1 == param2.a(param1, 2056, param3)) {
                                            return qt.field_d;
                                          } else {
                                            break L31;
                                          }
                                        } else {
                                          if (var8 == 5) {
                                            if (8 == var11.field_h) {
                                              if (!param2.c(var11.field_a, -16985, param5)) {
                                                return ra.field_k;
                                              } else {
                                                return null;
                                              }
                                            } else {
                                              return mt.field_g;
                                            }
                                          } else {
                                            if (var8 == 7) {
                                              L32: {
                                                if (var11.field_h == 8) {
                                                  break L32;
                                                } else {
                                                  if (9 != var11.field_h) {
                                                    return tv.field_d;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                              if (!param2.c(var11.field_a, -16985, param5)) {
                                                if (var11.field_a == -1) {
                                                  return uc.field_c;
                                                } else {
                                                  break L31;
                                                }
                                              } else {
                                                return uc.field_c;
                                              }
                                            } else {
                                              break L31;
                                            }
                                          }
                                        }
                                      } else {
                                        if (var7 == null) {
                                          return ai.field_N;
                                        } else {
                                          if (~param5 == ~var7.field_O) {
                                            return na.field_N;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                    }
                                    return null;
                                  } else {
                                    if (var7 == null) {
                                      return ai.field_N;
                                    } else {
                                      return null;
                                    }
                                  }
                                } else {
                                  if (var7 != null) {
                                    if (!param2.c(var7.field_O, -16985, param5)) {
                                      if (param4 == 68) {
                                        if (var7.field_I) {
                                          return jd.field_T;
                                        } else {
                                          return null;
                                        }
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      return qv.field_r;
                                    }
                                  } else {
                                    return ai.field_N;
                                  }
                                }
                              }
                            } else {
                              var8 = -uc.field_d[param4][7] + param1;
                              L33: while (true) {
                                L34: {
                                  if (uc.field_d[param4][7] + param1 < var8) {
                                    break L34;
                                  } else {
                                    if (var7_int < 0) {
                                      break L34;
                                    } else {
                                      if (0 <= var8) {
                                        if (param2.field_v <= var7_int) {
                                          break L34;
                                        } else {
                                          if (~param2.field_db < ~var8) {
                                            L35: {
                                              if (param2.field_Eb[param2.field_v * var8 + var7_int].field_h == 7) {
                                                break L35;
                                              } else {
                                                if (param2.field_Eb[param2.field_v * var8 + var7_int].field_h != 11) {
                                                  var8++;
                                                  continue L33;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                            return kp.field_c;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                var7_int++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    return ld.field_G;
                  } else {
                    break L0;
                  }
                }
              }
              return ld.field_G;
            }
          }
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static int a(int param0, bv param1) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 < -86) {
              stackOut_3_0 = sj.a(536870912, 524288, (byte) -65, 30, 20, 8192, 8, 14, 4, param1);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 41;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("de.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 4 + ',' + 14 + ',' + 30 + ',' + 20 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This password contains your Player Name, and would be easy to guess";
        field_d = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = "Spiritual barrier - Deploys a single spiritual barrier at the current map tile, which protects friendly units within";
    }
}
