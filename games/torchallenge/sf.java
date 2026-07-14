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
        lh var3_ref = null;
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
          var3_ref = new lh();
          if (var4 == null) {
            L1: {
              if (param0 >= 32768) {
                var3_ref.d(0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 > -8) {
              return null;
            } else {
              ((sf) this).field_e.a((Object) (Object) var3_ref, (byte) 96, (long)param0);
              return var3_ref;
            }
          } else {
            L2: {
              var3_ref.a(new uf(var4), (byte) -113);
              if (param0 >= 32768) {
                var3_ref.d(0);
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 > -8) {
              return null;
            } else {
              ((sf) this).field_e.a((Object) (Object) var3_ref, (byte) 96, (long)param0);
              return var3_ref;
            }
          }
        } else {
          return var3;
        }
    }

    final static void a(ka param0, ka[] param1, int param2, int param3, int param4, int param5, byte param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var7 = param4 + (param5 - 1);
        var8 = -1 + (param3 + param2);
        var9 = param1[0].field_q;
        var10 = param1[0].field_v;
        param0.d();
        param1[0].g(param4, param2);
        param1[2].g(-var9 + var7, param2);
        param1[6].g(param4, var8 + -var10);
        param1[8].g(var7 + -var9, -var10 + var8);
        param1[1].d(var9 + param4, param2, -(2 * var9) + param5, var10);
        param1[7].d(param4 + var9, var8 - var10, param5 - var9 * 2, var10);
        param1[3].d(param4, param2 + var10, var9, param3 - var10 * 2);
        if (param6 != -55) {
          field_a = null;
          param1[5].d(var7 + -var9, param2 - -var10, var9, param3 - var10 * 2);
          param1[4].d(param4 - -var9, param2 + var10, -(var9 * 2) + param5, -(2 * var10) + param3);
          la.field_f.a(-47);
          return;
        } else {
          param1[5].d(var7 + -var9, param2 - -var10, var9, param3 - var10 * 2);
          param1[4].d(param4 - -var9, param2 + var10, -(var9 * 2) + param5, -(2 * var10) + param3);
          la.field_f.a(-47);
          return;
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
          if (pg.field_q < -1) {
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
                  if ((bc.field_o ^ -1) != 0) {
                    break L2;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if ((ea.field_e ^ -1) > -1) {
                        break L2;
                      } else {
                        if (wb.field_p == null) {
                          break L2;
                        } else {
                          if (gl.field_k >= -1) {
                            break L2;
                          } else {
                            if (0 != ea.field_e) {
                              if (-2 == ea.field_e) {
                                var1 = 1;
                                if (ag.field_d != var1) {
                                  bd.d(1);
                                  if (0 == var1) {
                                    ag.field_d = var1;
                                    return;
                                  } else {
                                    pg.field_q = 10;
                                    ag.field_d = var1;
                                    return;
                                  }
                                } else {
                                  if (-1 == (pg.field_q ^ -1)) {
                                    pg.field_q = -1;
                                    if (ag.field_d != -1) {
                                      var5 = dd.field_n[var1] ? 1 : 0;
                                      lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                      return;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                if ((ea.field_e ^ -1) != -3) {
                                  if (ea.field_e != -4) {
                                    if (-5 == ea.field_e) {
                                      var1 = 4;
                                      if (ag.field_d != var1) {
                                        bd.d(1);
                                        if (0 == (var1 ^ -1)) {
                                          ag.field_d = var1;
                                          return;
                                        } else {
                                          pg.field_q = 10;
                                          ag.field_d = var1;
                                          return;
                                        }
                                      } else {
                                        if (-1 == (pg.field_q ^ -1)) {
                                          pg.field_q = -1;
                                          if (ag.field_d != -1) {
                                            var5 = dd.field_n[var1] ? 1 : 0;
                                            lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                            return;
                                          } else {
                                            return;
                                          }
                                        } else {
                                          return;
                                        }
                                      }
                                    } else {
                                      if (ea.field_e == -6) {
                                        var1 = 5;
                                        break L1;
                                      } else {
                                        if (-7 != ea.field_e) {
                                          if (-8 == ea.field_e) {
                                            var1 = 6;
                                            break L1;
                                          } else {
                                            if (8 == ea.field_e) {
                                              var1 = 6;
                                              break L1;
                                            } else {
                                              if (ag.field_d != var1) {
                                                bd.d(1);
                                                if (0 == (var1 ^ -1)) {
                                                  ag.field_d = var1;
                                                  return;
                                                } else {
                                                  pg.field_q = 10;
                                                  ag.field_d = var1;
                                                  return;
                                                }
                                              } else {
                                                if (-1 == pg.field_q) {
                                                  pg.field_q = -1;
                                                  if (ag.field_d != -1) {
                                                    var5 = dd.field_n[var1] ? 1 : 0;
                                                    lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                                    return;
                                                  } else {
                                                    return;
                                                  }
                                                } else {
                                                  return;
                                                }
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
                L3: {
                  if (13 != bc.field_o) {
                    break L3;
                  } else {
                    L4: {
                      if (-3 == var3) {
                        break L4;
                      } else {
                        if (var3 == -2) {
                          break L4;
                        } else {
                          if (3 != var3) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var1 = 9;
                    if (ag.field_d != var1) {
                      bd.d(1);
                      if (0 == (var1 ^ -1)) {
                        ag.field_d = var1;
                        return;
                      } else {
                        pg.field_q = 10;
                        ag.field_d = var1;
                        return;
                      }
                    } else {
                      if (-1 == pg.field_q) {
                        pg.field_q = -1;
                        if (ag.field_d == -1) {
                          return;
                        } else {
                          var5 = dd.field_n[var1] ? 1 : 0;
                          lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L5: {
                  if (bc.field_o != -14) {
                    break L5;
                  } else {
                    if (var3 != 4) {
                      break L5;
                    } else {
                      var1 = -1;
                      if (ag.field_d != var1) {
                        bd.d(1);
                        if (0 == var1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L6: {
                          if (-1 != pg.field_q) {
                            break L6;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L6;
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
                L7: {
                  if (13 != bc.field_o) {
                    break L7;
                  } else {
                    if (-6 != var3) {
                      break L7;
                    } else {
                      if (gh.field_x) {
                        var1 = 11;
                        if (ag.field_d != var1) {
                          bd.d(1);
                          if (0 == (var1 ^ -1)) {
                            ag.field_d = var1;
                            return;
                          } else {
                            pg.field_q = 10;
                            ag.field_d = var1;
                            return;
                          }
                        } else {
                          L8: {
                            if (-1 != (pg.field_q ^ -1)) {
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
                      } else {
                        var1 = 10;
                        if (ag.field_d != var1) {
                          bd.d(1);
                          if (0 == (var1 ^ -1)) {
                            ag.field_d = var1;
                            return;
                          } else {
                            pg.field_q = 10;
                            ag.field_d = var1;
                            return;
                          }
                        } else {
                          L9: {
                            if (-1 != (pg.field_q ^ -1)) {
                              break L9;
                            } else {
                              pg.field_q = -1;
                              if (ag.field_d == -1) {
                                break L9;
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
                L10: {
                  if (13 != bc.field_o) {
                    break L10;
                  } else {
                    if (var3 != -8) {
                      break L10;
                    } else {
                      var1 = 13;
                      if (ag.field_d != var1) {
                        bd.d(1);
                        if (0 == var1) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L11: {
                          if (-1 != pg.field_q) {
                            break L11;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L11;
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
                if (-16 == bc.field_o) {
                  var1 = 13;
                  break L1;
                } else {
                  if (13 != bc.field_o) {
                    L12: {
                      if (bc.field_o == 0) {
                        break L12;
                      } else {
                        if (12 == bc.field_o) {
                          break L12;
                        } else {
                          if (3 == bc.field_o) {
                            break L12;
                          } else {
                            if (2 == bc.field_o) {
                              break L12;
                            } else {
                              if (bc.field_o != -5) {
                                if (-1 == bc.field_o) {
                                  break L1;
                                } else {
                                  var1 = 8;
                                  if (ag.field_d != var1) {
                                    bd.d(1);
                                    if (0 == (var1 ^ -1)) {
                                      ag.field_d = var1;
                                      return;
                                    } else {
                                      pg.field_q = 10;
                                      ag.field_d = var1;
                                      return;
                                    }
                                  } else {
                                    L13: {
                                      if (-1 != (pg.field_q ^ -1)) {
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
                              } else {
                                var1 = 7;
                                if (ag.field_d != var1) {
                                  bd.d(1);
                                  if (0 == (var1 ^ -1)) {
                                    ag.field_d = var1;
                                    return;
                                  } else {
                                    pg.field_q = 10;
                                    ag.field_d = var1;
                                    return;
                                  }
                                } else {
                                  L14: {
                                    if (-1 != pg.field_q) {
                                      break L14;
                                    } else {
                                      pg.field_q = -1;
                                      if (ag.field_d == -1) {
                                        break L14;
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
                    if (ag.field_d != var1) {
                      bd.d(1);
                      if (0 == (var1 ^ -1)) {
                        ag.field_d = var1;
                        return;
                      } else {
                        pg.field_q = 10;
                        ag.field_d = var1;
                        return;
                      }
                    } else {
                      L15: {
                        if (-1 != (pg.field_q ^ -1)) {
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
                  } else {
                    if (6 == var3) {
                      var1 = 12;
                      if (ag.field_d != var1) {
                        bd.d(1);
                        if (0 == (var1 ^ -1)) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L16: {
                          if (-1 != (pg.field_q ^ -1)) {
                            break L16;
                          } else {
                            pg.field_q = -1;
                            if (ag.field_d == -1) {
                              break L16;
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
                      L17: {
                        L18: {
                          if (bc.field_o == 0) {
                            break L18;
                          } else {
                            if (12 == bc.field_o) {
                              break L18;
                            } else {
                              if (3 == bc.field_o) {
                                break L18;
                              } else {
                                if (2 == bc.field_o) {
                                  break L18;
                                } else {
                                  if (bc.field_o != -5) {
                                    if (-1 == bc.field_o) {
                                      break L17;
                                    } else {
                                      var1 = 8;
                                      if (ag.field_d != var1) {
                                        bd.d(1);
                                        if (0 == var1) {
                                          ag.field_d = var1;
                                          return;
                                        } else {
                                          pg.field_q = 10;
                                          ag.field_d = var1;
                                          return;
                                        }
                                      } else {
                                        L19: {
                                          if (-1 != pg.field_q) {
                                            break L19;
                                          } else {
                                            pg.field_q = -1;
                                            if (ag.field_d == -1) {
                                              break L19;
                                            } else {
                                              var5 = dd.field_n[var1] ? 1 : 0;
                                              lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                              break L19;
                                            }
                                          }
                                        }
                                        return;
                                      }
                                    }
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var1 = 7;
                        break L17;
                      }
                      if (ag.field_d != var1) {
                        bd.d(1);
                        if (0 == (var1 ^ -1)) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        L20: {
                          if (-1 != pg.field_q) {
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
                    }
                  }
                }
              } else {
                var1 = ag.field_d;
                break L1;
              }
            }
            if (ag.field_d != var1) {
              bd.d(1);
              if (0 == (var1 ^ -1)) {
                ag.field_d = var1;
                return;
              } else {
                pg.field_q = 10;
                ag.field_d = var1;
                return;
              }
            } else {
              L21: {
                if (-1 != (pg.field_q ^ -1)) {
                  break L21;
                } else {
                  pg.field_q = -1;
                  if (ag.field_d == -1) {
                    break L21;
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
            L22: {
              L23: {
                if ((bc.field_o ^ -1) != 0) {
                  break L23;
                } else {
                  if (var4 != 0) {
                    break L23;
                  } else {
                    if ((ea.field_e ^ -1) > -1) {
                      break L23;
                    } else {
                      if (wb.field_p == null) {
                        break L23;
                      } else {
                        if (gl.field_k >= -1) {
                          break L23;
                        } else {
                          if (0 != ea.field_e) {
                            if (-2 == ea.field_e) {
                              var1 = 1;
                              break L22;
                            } else {
                              if ((ea.field_e ^ -1) != -3) {
                                if (ea.field_e != -4) {
                                  if (-5 == ea.field_e) {
                                    var1 = 4;
                                    break L22;
                                  } else {
                                    if (ea.field_e == -6) {
                                      var1 = 5;
                                      break L22;
                                    } else {
                                      if (-7 != ea.field_e) {
                                        if (-8 == (ea.field_e ^ -1)) {
                                          var1 = 6;
                                          break L22;
                                        } else {
                                          if (8 != ea.field_e) {
                                            break L22;
                                          } else {
                                            var1 = 6;
                                            break L22;
                                          }
                                        }
                                      } else {
                                        var1 = 6;
                                        break L22;
                                      }
                                    }
                                  }
                                } else {
                                  var1 = 3;
                                  break L22;
                                }
                              } else {
                                var1 = 2;
                                break L22;
                              }
                            }
                          } else {
                            var1 = 0;
                            break L22;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L24: {
                if (13 != bc.field_o) {
                  break L24;
                } else {
                  L25: {
                    if (-3 == (var3 ^ -1)) {
                      break L25;
                    } else {
                      if ((var3 ^ -1) == -2) {
                        break L25;
                      } else {
                        if (3 != var3) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                  }
                  var1 = 9;
                  break L22;
                }
              }
              L26: {
                if (bc.field_o != -14) {
                  break L26;
                } else {
                  if (var3 != 4) {
                    break L26;
                  } else {
                    var1 = -1;
                    break L22;
                  }
                }
              }
              L27: {
                if (13 != bc.field_o) {
                  break L27;
                } else {
                  if (-6 != var3) {
                    break L27;
                  } else {
                    if (gh.field_x) {
                      var1 = 11;
                      break L22;
                    } else {
                      var1 = 10;
                      break L22;
                    }
                  }
                }
              }
              L28: {
                L29: {
                  if (13 != bc.field_o) {
                    break L29;
                  } else {
                    if (var3 == -8) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                if (-16 == bc.field_o) {
                  break L28;
                } else {
                  if (13 != bc.field_o) {
                    L30: {
                      if (bc.field_o == 0) {
                        break L30;
                      } else {
                        if (12 == bc.field_o) {
                          break L30;
                        } else {
                          if (3 == bc.field_o) {
                            break L30;
                          } else {
                            if (2 == bc.field_o) {
                              break L30;
                            } else {
                              if (bc.field_o != -5) {
                                if (-1 == bc.field_o) {
                                  break L22;
                                } else {
                                  var1 = 8;
                                  if (ag.field_d != var1) {
                                    bd.d(1);
                                    if (0 == (var1 ^ -1)) {
                                      ag.field_d = var1;
                                      return;
                                    } else {
                                      pg.field_q = 10;
                                      ag.field_d = var1;
                                      return;
                                    }
                                  } else {
                                    if (-1 == (pg.field_q ^ -1)) {
                                      pg.field_q = -1;
                                      if (ag.field_d != -1) {
                                        var5 = dd.field_n[var1] ? 1 : 0;
                                        lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                        return;
                                      } else {
                                        return;
                                      }
                                    } else {
                                      return;
                                    }
                                  }
                                }
                              } else {
                                var1 = 7;
                                if (ag.field_d != var1) {
                                  bd.d(1);
                                  if (0 == (var1 ^ -1)) {
                                    ag.field_d = var1;
                                    return;
                                  } else {
                                    pg.field_q = 10;
                                    ag.field_d = var1;
                                    return;
                                  }
                                } else {
                                  if (-1 == pg.field_q) {
                                    pg.field_q = -1;
                                    if (ag.field_d != -1) {
                                      var5 = dd.field_n[var1] ? 1 : 0;
                                      lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                                      return;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var1 = 7;
                    if (ag.field_d != var1) {
                      bd.d(1);
                      if (0 == (var1 ^ -1)) {
                        ag.field_d = var1;
                        return;
                      } else {
                        pg.field_q = 10;
                        ag.field_d = var1;
                        return;
                      }
                    } else {
                      if (-1 == (pg.field_q ^ -1)) {
                        pg.field_q = -1;
                        if (ag.field_d != -1) {
                          var5 = dd.field_n[var1] ? 1 : 0;
                          lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (6 == var3) {
                      var1 = 12;
                      if (ag.field_d != var1) {
                        bd.d(1);
                        if (0 == (var1 ^ -1)) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        if (-1 == (pg.field_q ^ -1)) {
                          pg.field_q = -1;
                          if (ag.field_d != -1) {
                            var5 = dd.field_n[var1] ? 1 : 0;
                            lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      L31: {
                        L32: {
                          if (bc.field_o == 0) {
                            break L32;
                          } else {
                            if (12 == bc.field_o) {
                              break L32;
                            } else {
                              if (3 == bc.field_o) {
                                break L32;
                              } else {
                                if (2 == bc.field_o) {
                                  break L32;
                                } else {
                                  if (bc.field_o != -5) {
                                    if (-1 == bc.field_o) {
                                      break L31;
                                    } else {
                                      var1 = 8;
                                      break L31;
                                    }
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var1 = 7;
                        break L31;
                      }
                      if (ag.field_d != var1) {
                        bd.d(1);
                        if (0 == (var1 ^ -1)) {
                          ag.field_d = var1;
                          return;
                        } else {
                          pg.field_q = 10;
                          ag.field_d = var1;
                          return;
                        }
                      } else {
                        if (-1 == pg.field_q) {
                          pg.field_q = -1;
                          if (ag.field_d != -1) {
                            var5 = dd.field_n[var1] ? 1 : 0;
                            lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              var1 = 13;
              break L22;
            }
            if (ag.field_d != var1) {
              bd.d(1);
              if (0 == (var1 ^ -1)) {
                ag.field_d = var1;
                return;
              } else {
                pg.field_q = 10;
                ag.field_d = var1;
                return;
              }
            } else {
              if (-1 == (pg.field_q ^ -1)) {
                pg.field_q = -1;
                if (ag.field_d == -1) {
                  return;
                } else {
                  var5 = dd.field_n[var1] ? 1 : 0;
                  lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          var1 = ag.field_d;
          if (ag.field_d != var1) {
            bd.d(1);
            if (0 == (var1 ^ -1)) {
              ag.field_d = var1;
              return;
            } else {
              pg.field_q = 10;
              ag.field_d = var1;
              return;
            }
          } else {
            if (-1 == pg.field_q) {
              pg.field_q = -1;
              if (ag.field_d != -1) {
                var5 = dd.field_n[var1] ? 1 : 0;
                lg.a(var5 != 0, (byte) -79, al.field_x[var1]);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_c = 84;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
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
