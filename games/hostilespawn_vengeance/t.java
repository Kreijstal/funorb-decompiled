/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends am {
    static bd field_l;
    static ca field_i;
    int field_h;
    static bd field_j;
    static String[] field_k;

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = 34 / ((-75 - param0) / 51);
        if (kh.field_U[param1] != param2) {
          if (kh.field_Q[param2]) {
            L0: {
              if ((kh.field_U[param1] ^ -1) != -4) {
                break L0;
              } else {
                if (!f.a((byte) 119)) {
                  break L0;
                } else {
                  eh.field_c.a(sf.field_V[36], 100, uh.field_i);
                  break L0;
                }
              }
            }
            L1: {
              if ((d.field_u ^ -1) >= -1) {
                break L1;
              } else {
                ci.field_a[param1] = th.field_Fb[param2];
                break L1;
              }
            }
            L2: {
              var4 = -param1 + 1;
              if (param2 == 0) {
                kh.field_U[param1] = param2;
                if (-2 == uj.field_l) {
                  if (null == sf.field_V[15 + param2]) {
                    break L2;
                  } else {
                    eh.field_c.a(sf.field_V[param2 + 15], 100, uh.field_i);
                    break L2;
                  }
                } else {
                  kh.field_U[param1] = param2;
                  if (-2 != uj.field_l) {
                    break L2;
                  } else {
                    if (null == sf.field_V[15 + param2]) {
                      break L2;
                    } else {
                      eh.field_c.a(sf.field_V[param2 + 15], 100, uh.field_i);
                      break L2;
                    }
                  }
                }
              } else {
                kh.field_U[param1] = param2;
                if (-2 != (uj.field_l ^ -1)) {
                  break L2;
                } else {
                  if (null == sf.field_V[15 + param2]) {
                    break L2;
                  } else {
                    eh.field_c.a(sf.field_V[param2 + 15], 100, uh.field_i);
                    break L2;
                  }
                }
              }
            }
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_l = null;
        if (param0 != -15154) {
            return;
        }
        field_j = null;
        field_i = null;
    }

    final static void a(byte param0) {
        qg.field_r = sc.field_g.o(32);
        if (param0 <= 113) {
            field_k = null;
        }
        CharSequence var2 = (CharSequence) (Object) qg.field_r;
        se.field_c = mf.a(false, var2);
    }

    final static void c(int param0) {
        double var1 = 0.0;
        double var3 = 0.0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        var18 = HostileSpawn.field_I ? 1 : 0;
        pc.field_c = -1 + vi.field_p.length;
        var1 = (double)vi.field_p[0].field_j.field_e + vi.field_p[0].field_l.field_f - 1.0;
        var3 = -1.0 + (vi.field_p[0].field_l.field_a + (double)vi.field_p[0].field_j.field_g);
        if (param0 == -19706) {
          var5 = 1;
          L0: while (true) {
            L1: {
              if (var5 >= vi.field_p.length) {
                break L1;
              } else {
                L2: {
                  if (vi.field_p[var5] == null) {
                    break L2;
                  } else {
                    if (231 == vi.field_p[var5].field_i) {
                      L3: {
                        var6 = vi.field_p[var5].field_l.field_f + (double)vi.field_p[var5].field_j.field_e;
                        var8 = vi.field_p[var5].field_l.field_a + (double)vi.field_p[var5].field_j.field_g;
                        var10 = -var1 + var6;
                        var12 = var8 - var3;
                        var14 = Math.sqrt(var10 * var10 + var12 * var12);
                        if (var14 > 1.0) {
                          var16 = el.a(var6, var1, 16, var8, var3);
                          vi.field_p[var5].a(param0 + 19931, var16, 1);
                          vi.field_p[var5].field_l.b(-1.0 + var14, var16, 106);
                          vi.field_p[var5].b((byte) 117);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var1 = var6;
                      var3 = var8;
                      var5++;
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                pc.field_c = var5 - 1;
                break L1;
              }
            }
            L4: {
              if (null == vi.field_p[0]) {
                break L4;
              } else {
                if (-6 == (vi.field_p[0].field_w ^ -1)) {
                  break L4;
                } else {
                  vi.field_p[0].field_o = (vi.field_p.length + -pc.field_c) / 4 + 1;
                  vi.field_p[0].field_C = 16 / vi.field_p[0].field_o;
                  break L4;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = HostileSpawn.field_I ? 1 : 0;
          if (param3 < 0) {
            break L0;
          } else {
            if (ge.field_f > param5) {
              L1: {
                if (param8 >= 0) {
                  break L1;
                } else {
                  if (param7 >= 0) {
                    break L1;
                  } else {
                    if (param4 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param8 < ge.field_h) {
                  break L2;
                } else {
                  if (param7 < ge.field_h) {
                    break L2;
                  } else {
                    if (param4 < ge.field_h) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var14 = param3 + -param5;
                  if (param6 == param5) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        var10 = param8 << -1764778608;
                        var9 = param8 << -1764778608;
                        var15 = -param5 + param6;
                        var11 = (param7 + -param8 << 1439162672) / var15;
                        var12 = (-param8 + param4 << 152051856) / var14;
                        if (var12 > var11) {
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var13 = 0;
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (param5 < 0) {
                          L9: {
                            if (param6 >= 0) {
                              break L9;
                            } else {
                              param5 = param6 + -param5;
                              var10 = var10 + var12 * param5;
                              var9 = var9 + var11 * param5;
                              param5 = param6;
                              if (0 == 0) {
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param5 = -param5;
                          var9 = var9 + var11 * param5;
                          var10 = var10 + var12 * param5;
                          param5 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var16 = ge.field_e[param5];
                      L10: while (true) {
                        if (param5 >= param6) {
                          break L7;
                        } else {
                          L11: {
                            var17 = var9 >> 1758855440;
                            if (ge.field_h <= var17) {
                              break L11;
                            } else {
                              L12: {
                                var18 = -(var9 >> -1526947344) + (var10 >> -1817791504);
                                if (var18 != 0) {
                                  break L12;
                                } else {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (ge.field_h <= var17) {
                                      break L11;
                                    } else {
                                      jn.a(param0, var18, -1, param2, var17 - -var16);
                                      if (0 == 0) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                              L13: {
                                if (ge.field_h > var17 + var18) {
                                  break L13;
                                } else {
                                  var18 = -1 + ge.field_h + -var17;
                                  break L13;
                                }
                              }
                              L14: {
                                if (0 <= var17) {
                                  break L14;
                                } else {
                                  jn.a(param0, var18 + var17, -1, param2, var16);
                                  if (0 == 0) {
                                    break L11;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              jn.a(param0, var18, -1, param2, var16 + var17);
                              break L11;
                            }
                          }
                          param5++;
                          if (ge.field_f <= param5) {
                            return;
                          } else {
                            var9 = var9 + var11;
                            var10 = var10 + var12;
                            var16 = var16 + si.field_e;
                            if (0 == 0) {
                              continue L10;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      L16: {
                        var16 = param3 - param6;
                        if (var16 == 0) {
                          break L16;
                        } else {
                          L17: {
                            L18: {
                              if (var13 == 0) {
                                break L18;
                              } else {
                                var10 = param7 << 1453261968;
                                if (0 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var9 = param7 << 365110096;
                            break L17;
                          }
                          var17 = param4 << -959575216;
                          var12 = (var17 + -var10) / var16;
                          var11 = (var17 - var9) / var16;
                          if (0 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      var11 = 0;
                      var12 = 0;
                      break L15;
                    }
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L19: {
                  L20: {
                    if (param3 == param5) {
                      break L20;
                    } else {
                      L21: {
                        L22: {
                          var15 = param3 - param6;
                          if (param8 < param7) {
                            break L22;
                          } else {
                            var10 = param8 << -1871817072;
                            var9 = param7 << 1291966128;
                            var12 = (param4 - param8 << -1205364592) / var14;
                            var11 = (-param7 + param4 << 1875191664) / var15;
                            if (0 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        var10 = param7 << 1740532240;
                        var12 = (-param7 + param4 << 142517456) / var15;
                        var9 = param8 << 2140761712;
                        var11 = (param4 - param8 << 1683115312) / var14;
                        break L21;
                      }
                      if (0 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  var10 = param7 << -1735231184;
                  var9 = param8 << -1964114128;
                  var11 = 0;
                  var12 = 0;
                  break L19;
                }
                L23: {
                  if (param5 >= 0) {
                    break L23;
                  } else {
                    param5 = Math.min(-param5, param6 + -param5);
                    var9 = var9 + param5 * var11;
                    var10 = var10 + var12 * param5;
                    param5 = 0;
                    break L23;
                  }
                }
                var13 = 0;
                break L3;
              }
              L24: {
                if (param5 >= 0) {
                  break L24;
                } else {
                  param5 = -param5;
                  var9 = var9 + var11 * param5;
                  var10 = var10 + param5 * var12;
                  param5 = 0;
                  break L24;
                }
              }
              L25: {
                if (!param1) {
                  break L25;
                } else {
                  t.c(14);
                  break L25;
                }
              }
              L26: {
                var15 = ge.field_e[param5];
                if (param5 >= param3) {
                  break L26;
                } else {
                  L27: {
                    var16 = var9 >> -213714960;
                    if (ge.field_h <= var16) {
                      break L27;
                    } else {
                      L28: {
                        var17 = -(var9 >> 2063205680) + (var10 >> -1222432400);
                        if (var17 != 0) {
                          break L28;
                        } else {
                          if (var16 < 0) {
                            break L27;
                          } else {
                            if (var16 < ge.field_h) {
                              jn.a(param0, var17, -1, param2, var16 - -var15);
                              if (0 == 0) {
                                break L27;
                              } else {
                                break L28;
                              }
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                      L29: {
                        if (ge.field_h <= var17 + var16) {
                          var17 = -var16 + (ge.field_h + -1);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        if (var16 < 0) {
                          break L30;
                        } else {
                          jn.a(param0, var17, -1, param2, var15 + var16);
                          if (0 == 0) {
                            break L27;
                          } else {
                            break L30;
                          }
                        }
                      }
                      jn.a(param0, var17 - -var16, -1, param2, var15);
                      break L27;
                    }
                  }
                  param5++;
                  if (ge.field_f <= param5) {
                    return;
                  } else {
                    var15 = var15 + si.field_e;
                    var10 = var10 + var12;
                    var9 = var9 + var11;
                    break L26;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    t(int param0) {
        ((t) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = null;
        field_k = new String[]{"Civilian", "Draftee", "Rookie", "Techie", "Squaddie", "Engineer", "Sergeant", "Marine", "Commando", "Elite Soldier", "Lone Wolf", "Elite Wolf", "Hero", "Elite Hero", "Slayer", "Slayer Elite", "Scourge", "Scourge Elite", "Spirit", "Vengeance"};
    }
}
