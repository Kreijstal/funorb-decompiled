/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private lj field_g;
    private je field_e;
    static int[] field_b;
    private lj field_f;
    static int field_c;
    static lj field_a;
    static ka[][][] field_d;

    final lh a(int param0, byte param1) {
        lh var3 = null;
        byte[] var4 = null;
        var3 = (lh) ((sf) this).field_e.a((long)param0, 0);
        if (var3 == null) {
          L0: {
            if (param0 >= 32768) {
              var4 = ((sf) this).field_g.c(1, param0 & 32767, 0);
              break L0;
            } else {
              var4 = ((sf) this).field_f.c(1, param0, 0);
              break L0;
            }
          }
          var3 = new lh();
          if (var4 == null) {
            L1: {
              if (param0 >= 32768) {
                var3.d(0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 > -8) {
              return null;
            } else {
              ((sf) this).field_e.a((Object) (Object) var3, (byte) 96, (long)param0);
              return var3;
            }
          } else {
            L2: {
              var3.a(new uf(var4), (byte) -113);
              if (param0 >= 32768) {
                var3.d(0);
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 > -8) {
              return null;
            } else {
              ((sf) this).field_e.a((Object) (Object) var3, (byte) 96, (long)param0);
              return var3;
            }
          }
        } else {
          return var3;
        }
    }

    final static void a(ka param0, ka[] param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var7_int = param4 + (param5 - 1);
            var8 = -1 + (param3 + param2);
            var9 = param1[0].field_q;
            var10 = param1[0].field_v;
            param0.d();
            param1[0].g(param4, param2);
            param1[2].g(-var9 + var7_int, param2);
            param1[6].g(param4, var8 + -var10);
            param1[8].g(var7_int + -var9, -var10 + var8);
            param1[1].d(var9 + param4, param2, -(2 * var9) + param5, var10);
            param1[7].d(param4 + var9, var8 - var10, param5 - var9 * 2, var10);
            param1[3].d(param4, param2 + var10, var9, param3 - var10 * 2);
            param1[5].d(var7_int + -var9, param2 - -var10, var9, param3 - var10 * 2);
            param1[4].d(param4 - -var9, param2 + var10, -(var9 * 2) + param5, -(2 * var10) + param3);
            la.field_f.a(-47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("sf.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + -55 + 41);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TorChallenge.field_F ? 1 : 0;
          var2 = 99 / ((72 - param0) / 41);
          var1 = -1;
          var3 = rj.field_g;
          var4 = cj.field_b ? 1 : 0;
          if (pg.field_q > 0) {
            pg.field_q = pg.field_q - 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (bc.field_o != 1) {
          if (bc.field_o == 3) {
            L1: {
              if (!ad.field_j) {
                L2: {
                  if (bc.field_o != -1) {
                    break L2;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (ea.field_e < 0) {
                        break L2;
                      } else {
                        if (wb.field_p == null) {
                          break L2;
                        } else {
                          if (gl.field_k <= 0) {
                            break L2;
                          } else {
                            if (0 != ea.field_e) {
                              if (ea.field_e == 1) {
                                var1 = 1;
                                if (~ag.field_d != ~var1) {
                                  int discarded$22 = 1;
                                  bd.d();
                                  if (var1 == -1) {
                                    ag.field_d = var1;
                                    return;
                                  } else {
                                    pg.field_q = 10;
                                    ag.field_d = var1;
                                    return;
                                  }
                                } else {
                                  L3: {
                                    if (pg.field_q != 0) {
                                      break L3;
                                    } else {
                                      pg.field_q = -1;
                                      if (ag.field_d == -1) {
                                        break L3;
                                      } else {
                                        var5 = dd.field_n[var1] ? 1 : 0;
                                        lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                        return;
                                      }
                                    }
                                  }
                                  return;
                                }
                              } else {
                                if (ea.field_e != 2) {
                                  if (ea.field_e != 3) {
                                    if (ea.field_e == 4) {
                                      var1 = 4;
                                      if (~ag.field_d != ~var1) {
                                        int discarded$23 = 1;
                                        bd.d();
                                        if (var1 == -1) {
                                          ag.field_d = var1;
                                          return;
                                        } else {
                                          pg.field_q = 10;
                                          ag.field_d = var1;
                                          return;
                                        }
                                      } else {
                                        L4: {
                                          if (pg.field_q != 0) {
                                            break L4;
                                          } else {
                                            pg.field_q = -1;
                                            if (ag.field_d == -1) {
                                              break L4;
                                            } else {
                                              var5 = dd.field_n[var1] ? 1 : 0;
                                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                              return;
                                            }
                                          }
                                        }
                                        return;
                                      }
                                    } else {
                                      if (ea.field_e == 5) {
                                        var1 = 5;
                                        break L1;
                                      } else {
                                        if (ea.field_e != 6) {
                                          if (ea.field_e == 7) {
                                            var1 = 6;
                                            break L1;
                                          } else {
                                            if (8 == ea.field_e) {
                                              var1 = 6;
                                              break L1;
                                            } else {
                                              if (~ag.field_d != ~var1) {
                                                int discarded$24 = 1;
                                                bd.d();
                                                if (var1 == -1) {
                                                  ag.field_d = var1;
                                                  return;
                                                } else {
                                                  pg.field_q = 10;
                                                  ag.field_d = var1;
                                                  return;
                                                }
                                              } else {
                                                L5: {
                                                  if (pg.field_q != 0) {
                                                    break L5;
                                                  } else {
                                                    pg.field_q = -1;
                                                    if (ag.field_d == -1) {
                                                      break L5;
                                                    } else {
                                                      var5 = dd.field_n[var1] ? 1 : 0;
                                                      lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                                      return;
                                                    }
                                                  }
                                                }
                                                return;
                                              }
                                            }
                                          }
                                        } else {
                                          var1 = 6;
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    var1 = 3;
                                    break L1;
                                  }
                                } else {
                                  var1 = 2;
                                  break L1;
                                }
                              }
                            } else {
                              var1 = 0;
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (13 != bc.field_o) {
                    break L6;
                  } else {
                    L7: {
                      if (var3 == 2) {
                        break L7;
                      } else {
                        if (var3 == 1) {
                          break L7;
                        } else {
                          if (3 != var3) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var1 = 9;
                    if (~ag.field_d != ~var1) {
                      int discarded$25 = 1;
                      bd.d();
                      if (var1 == -1) {
                        ag.field_d = var1;
                        return;
                      } else {
                        pg.field_q = 10;
                        ag.field_d = var1;
                        return;
                      }
                    } else {
                      L8: {
                        if (pg.field_q != 0) {
                          break L8;
                        } else {
                          pg.field_q = -1;
                          if (ag.field_d == -1) {
                            break L8;
                          } else {
                            var5 = dd.field_n[var1] ? 1 : 0;
                            lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L9: {
                  if (bc.field_o != 13) {
                    break L9;
                  } else {
                    if (var3 != 4) {
                      break L9;
                    } else {
                      var1 = -1;
                      if (~ag.field_d != ~var1) {
                        int discarded$26 = 1;
                        bd.d();
                        if (var1 == -1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L10: {
                          if (pg.field_q != 0) {
                            break L10;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L10;
                            } else {
                              var5 = dd.field_n[var1] ? 1 : 0;
                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L11: {
                  if (13 != bc.field_o) {
                    break L11;
                  } else {
                    if (var3 != 5) {
                      break L11;
                    } else {
                      if (gh.field_x) {
                        var1 = 11;
                        if (~ag.field_d != ~var1) {
                          int discarded$27 = 1;
                          bd.d();
                          if (var1 == -1) {
                            ag.field_d = var1;
                            return;
                          } else {
                            pg.field_q = 10;
                            ag.field_d = var1;
                            return;
                          }
                        } else {
                          L12: {
                            if (pg.field_q != 0) {
                              break L12;
                            } else {
                              pg.field_q = -1;
                              if (ag.field_d == -1) {
                                break L12;
                              } else {
                                var5 = dd.field_n[var1] ? 1 : 0;
                                lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                return;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        var1 = 10;
                        if (~ag.field_d != ~var1) {
                          int discarded$28 = 1;
                          bd.d();
                          if (var1 == -1) {
                            ag.field_d = var1;
                            return;
                          } else {
                            pg.field_q = 10;
                            ag.field_d = var1;
                            return;
                          }
                        } else {
                          L13: {
                            if (pg.field_q != 0) {
                              break L13;
                            } else {
                              pg.field_q = -1;
                              if (ag.field_d == -1) {
                                break L13;
                              } else {
                                var5 = dd.field_n[var1] ? 1 : 0;
                                lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                return;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
                L14: {
                  if (13 != bc.field_o) {
                    break L14;
                  } else {
                    if (var3 != 7) {
                      break L14;
                    } else {
                      var1 = 13;
                      if (~ag.field_d != ~var1) {
                        int discarded$29 = 1;
                        bd.d();
                        if (var1 == -1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L15: {
                          if (pg.field_q != 0) {
                            break L15;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L15;
                            } else {
                              var5 = dd.field_n[var1] ? 1 : 0;
                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (bc.field_o == 15) {
                  var1 = 13;
                  break L1;
                } else {
                  if (13 != bc.field_o) {
                    L16: {
                      if (bc.field_o == 0) {
                        break L16;
                      } else {
                        if (12 == bc.field_o) {
                          break L16;
                        } else {
                          if (3 == bc.field_o) {
                            break L16;
                          } else {
                            if (2 == bc.field_o) {
                              break L16;
                            } else {
                              if (bc.field_o != 4) {
                                if (-1 == bc.field_o) {
                                  break L1;
                                } else {
                                  var1 = 8;
                                  if (~ag.field_d != ~var1) {
                                    int discarded$30 = 1;
                                    bd.d();
                                    if (var1 == -1) {
                                      ag.field_d = var1;
                                      return;
                                    } else {
                                      pg.field_q = 10;
                                      ag.field_d = var1;
                                      return;
                                    }
                                  } else {
                                    L17: {
                                      if (pg.field_q != 0) {
                                        break L17;
                                      } else {
                                        pg.field_q = -1;
                                        if (ag.field_d == -1) {
                                          break L17;
                                        } else {
                                          var5 = dd.field_n[var1] ? 1 : 0;
                                          lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                          return;
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              } else {
                                var1 = 7;
                                if (~ag.field_d != ~var1) {
                                  int discarded$31 = 1;
                                  bd.d();
                                  if (var1 == -1) {
                                    ag.field_d = var1;
                                    return;
                                  } else {
                                    pg.field_q = 10;
                                    ag.field_d = var1;
                                    return;
                                  }
                                } else {
                                  L18: {
                                    if (pg.field_q != 0) {
                                      break L18;
                                    } else {
                                      pg.field_q = -1;
                                      if (ag.field_d == -1) {
                                        break L18;
                                      } else {
                                        var5 = dd.field_n[var1] ? 1 : 0;
                                        lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                        return;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var1 = 7;
                    if (~ag.field_d != ~var1) {
                      int discarded$32 = 1;
                      bd.d();
                      if (var1 == -1) {
                        ag.field_d = var1;
                        return;
                      } else {
                        pg.field_q = 10;
                        ag.field_d = var1;
                        return;
                      }
                    } else {
                      L19: {
                        if (pg.field_q != 0) {
                          break L19;
                        } else {
                          pg.field_q = -1;
                          if (ag.field_d == -1) {
                            break L19;
                          } else {
                            var5 = dd.field_n[var1] ? 1 : 0;
                            lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (6 == var3) {
                      var1 = 12;
                      if (~ag.field_d != ~var1) {
                        int discarded$33 = 1;
                        bd.d();
                        if (var1 == -1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L20: {
                          if (pg.field_q != 0) {
                            break L20;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L20;
                            } else {
                              var5 = dd.field_n[var1] ? 1 : 0;
                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                              return;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L21: {
                        L22: {
                          if (bc.field_o == 0) {
                            break L22;
                          } else {
                            if (12 == bc.field_o) {
                              break L22;
                            } else {
                              if (3 == bc.field_o) {
                                break L22;
                              } else {
                                if (2 == bc.field_o) {
                                  break L22;
                                } else {
                                  if (bc.field_o != 4) {
                                    if (-1 == bc.field_o) {
                                      break L21;
                                    } else {
                                      var1 = 8;
                                      if (~ag.field_d != ~var1) {
                                        int discarded$34 = 1;
                                        bd.d();
                                        if (var1 == -1) {
                                          ag.field_d = var1;
                                          return;
                                        } else {
                                          pg.field_q = 10;
                                          ag.field_d = var1;
                                          return;
                                        }
                                      } else {
                                        L23: {
                                          if (pg.field_q != 0) {
                                            break L23;
                                          } else {
                                            pg.field_q = -1;
                                            if (ag.field_d == -1) {
                                              break L23;
                                            } else {
                                              var5 = dd.field_n[var1] ? 1 : 0;
                                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                              break L23;
                                            }
                                          }
                                        }
                                        return;
                                      }
                                    }
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var1 = 7;
                        break L21;
                      }
                      if (~ag.field_d != ~var1) {
                        int discarded$35 = 1;
                        bd.d();
                        if (var1 == -1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L24: {
                          if (pg.field_q != 0) {
                            break L24;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L24;
                            } else {
                              var5 = dd.field_n[var1] ? 1 : 0;
                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              } else {
                var1 = ag.field_d;
                break L1;
              }
            }
            if (~ag.field_d != ~var1) {
              int discarded$36 = 1;
              bd.d();
              if (var1 == -1) {
                ag.field_d = var1;
                return;
              } else {
                pg.field_q = 10;
                ag.field_d = var1;
                return;
              }
            } else {
              L25: {
                if (pg.field_q != 0) {
                  break L25;
                } else {
                  pg.field_q = -1;
                  if (ag.field_d == -1) {
                    break L25;
                  } else {
                    var5 = dd.field_n[var1] ? 1 : 0;
                    lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            L26: {
              L27: {
                if (bc.field_o != -1) {
                  break L27;
                } else {
                  if (var4 != 0) {
                    break L27;
                  } else {
                    if (ea.field_e < 0) {
                      break L27;
                    } else {
                      if (wb.field_p == null) {
                        break L27;
                      } else {
                        if (gl.field_k <= 0) {
                          break L27;
                        } else {
                          if (0 != ea.field_e) {
                            if (ea.field_e == 1) {
                              var1 = 1;
                              break L26;
                            } else {
                              if (ea.field_e != 2) {
                                if (ea.field_e != 3) {
                                  if (ea.field_e == 4) {
                                    var1 = 4;
                                    break L26;
                                  } else {
                                    if (ea.field_e == 5) {
                                      var1 = 5;
                                      break L26;
                                    } else {
                                      if (ea.field_e != 6) {
                                        if (ea.field_e == 7) {
                                          var1 = 6;
                                          break L26;
                                        } else {
                                          if (8 != ea.field_e) {
                                            break L26;
                                          } else {
                                            var1 = 6;
                                            break L26;
                                          }
                                        }
                                      } else {
                                        var1 = 6;
                                        break L26;
                                      }
                                    }
                                  }
                                } else {
                                  var1 = 3;
                                  break L26;
                                }
                              } else {
                                var1 = 2;
                                break L26;
                              }
                            }
                          } else {
                            var1 = 0;
                            break L26;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L28: {
                if (13 != bc.field_o) {
                  break L28;
                } else {
                  L29: {
                    if (var3 == 2) {
                      break L29;
                    } else {
                      if (var3 == 1) {
                        break L29;
                      } else {
                        if (3 != var3) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                  }
                  var1 = 9;
                  break L26;
                }
              }
              L30: {
                if (bc.field_o != 13) {
                  break L30;
                } else {
                  if (var3 != 4) {
                    break L30;
                  } else {
                    var1 = -1;
                    break L26;
                  }
                }
              }
              L31: {
                if (13 != bc.field_o) {
                  break L31;
                } else {
                  if (var3 != 5) {
                    break L31;
                  } else {
                    if (gh.field_x) {
                      var1 = 11;
                      break L26;
                    } else {
                      var1 = 10;
                      break L26;
                    }
                  }
                }
              }
              L32: {
                L33: {
                  if (13 != bc.field_o) {
                    break L33;
                  } else {
                    if (var3 == 7) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                if (bc.field_o == 15) {
                  break L32;
                } else {
                  if (13 != bc.field_o) {
                    L34: {
                      if (bc.field_o == 0) {
                        break L34;
                      } else {
                        if (12 == bc.field_o) {
                          break L34;
                        } else {
                          if (3 == bc.field_o) {
                            break L34;
                          } else {
                            if (2 == bc.field_o) {
                              break L34;
                            } else {
                              if (bc.field_o != 4) {
                                if (-1 == bc.field_o) {
                                  break L26;
                                } else {
                                  var1 = 8;
                                  if (~ag.field_d != ~var1) {
                                    int discarded$37 = 1;
                                    bd.d();
                                    if (var1 == -1) {
                                      ag.field_d = var1;
                                      return;
                                    } else {
                                      pg.field_q = 10;
                                      ag.field_d = var1;
                                      return;
                                    }
                                  } else {
                                    L35: {
                                      if (pg.field_q != 0) {
                                        break L35;
                                      } else {
                                        pg.field_q = -1;
                                        if (ag.field_d == -1) {
                                          break L35;
                                        } else {
                                          var5 = dd.field_n[var1] ? 1 : 0;
                                          lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                          break L35;
                                        }
                                      }
                                    }
                                    return;
                                  }
                                }
                              } else {
                                var1 = 7;
                                if (~ag.field_d != ~var1) {
                                  int discarded$38 = 1;
                                  bd.d();
                                  if (var1 == -1) {
                                    ag.field_d = var1;
                                    return;
                                  } else {
                                    pg.field_q = 10;
                                    ag.field_d = var1;
                                    return;
                                  }
                                } else {
                                  L36: {
                                    if (pg.field_q != 0) {
                                      break L36;
                                    } else {
                                      pg.field_q = -1;
                                      if (ag.field_d == -1) {
                                        break L36;
                                      } else {
                                        var5 = dd.field_n[var1] ? 1 : 0;
                                        lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                        break L36;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var1 = 7;
                    if (~ag.field_d != ~var1) {
                      int discarded$39 = 1;
                      bd.d();
                      if (var1 == -1) {
                        ag.field_d = var1;
                        return;
                      } else {
                        pg.field_q = 10;
                        ag.field_d = var1;
                        return;
                      }
                    } else {
                      L37: {
                        if (pg.field_q != 0) {
                          break L37;
                        } else {
                          pg.field_q = -1;
                          if (ag.field_d == -1) {
                            break L37;
                          } else {
                            var5 = dd.field_n[var1] ? 1 : 0;
                            lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                            break L37;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (6 == var3) {
                      var1 = 12;
                      if (~ag.field_d != ~var1) {
                        int discarded$40 = 1;
                        bd.d();
                        if (var1 == -1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L38: {
                          if (pg.field_q != 0) {
                            break L38;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L38;
                            } else {
                              var5 = dd.field_n[var1] ? 1 : 0;
                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                              break L38;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L39: {
                        L40: {
                          if (bc.field_o == 0) {
                            break L40;
                          } else {
                            if (12 == bc.field_o) {
                              break L40;
                            } else {
                              if (3 == bc.field_o) {
                                break L40;
                              } else {
                                if (2 == bc.field_o) {
                                  break L40;
                                } else {
                                  if (bc.field_o != 4) {
                                    if (-1 == bc.field_o) {
                                      break L39;
                                    } else {
                                      var1 = 8;
                                      break L39;
                                    }
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var1 = 7;
                        break L39;
                      }
                      if (~ag.field_d != ~var1) {
                        int discarded$41 = 1;
                        bd.d();
                        if (var1 == -1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L41: {
                          if (pg.field_q != 0) {
                            break L41;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L41;
                            } else {
                              var5 = dd.field_n[var1] ? 1 : 0;
                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                              break L41;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              var1 = 13;
              break L26;
            }
            if (~ag.field_d != ~var1) {
              int discarded$42 = 1;
              bd.d();
              if (var1 == -1) {
                ag.field_d = var1;
                return;
              } else {
                pg.field_q = 10;
                ag.field_d = var1;
                return;
              }
            } else {
              L42: {
                if (pg.field_q != 0) {
                  break L42;
                } else {
                  pg.field_q = -1;
                  if (ag.field_d == -1) {
                    break L42;
                  } else {
                    var5 = dd.field_n[var1] ? 1 : 0;
                    lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                    return;
                  }
                }
              }
              return;
            }
          }
        } else {
          var1 = ag.field_d;
          if (~ag.field_d != ~var1) {
            int discarded$43 = 1;
            bd.d();
            if (var1 == -1) {
              ag.field_d = var1;
              return;
            } else {
              pg.field_q = 10;
              ag.field_d = var1;
              return;
            }
          } else {
            L43: {
              if (pg.field_q != 0) {
                break L43;
              } else {
                pg.field_q = -1;
                if (ag.field_d == -1) {
                  break L43;
                } else {
                  var5 = dd.field_n[var1] ? 1 : 0;
                  lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                  return;
                }
              }
            }
            return;
          }
        }
    }

    public static void a() {
        field_d = null;
        field_b = null;
        field_a = null;
    }

    private sf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = new int[12];
        field_d = new ka[4][2][2];
    }
}
