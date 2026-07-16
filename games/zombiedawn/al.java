/*
 * Decompiled by CFR-JS 0.4.0.
 */
class al {
    static String field_c;
    int field_d;
    int[] field_h;
    int field_k;
    static boolean field_e;
    int field_g;
    static dj field_a;
    private int field_j;
    static vn field_f;
    int field_i;
    private boolean field_l;
    jp field_b;

    private final void d(int param0, int param1) {
        L0: {
          if (-1 < (param0 ^ -1)) {
            break L0;
          } else {
            if (((al) this).field_h.length <= param0) {
              break L0;
            } else {
              L1: {
                param0 = ((al) this).field_h[param0];
                if (0 > param0) {
                  break L1;
                } else {
                  if (param0 == 12) {
                    break L1;
                  } else {
                    if (13 == param0) {
                      break L1;
                    } else {
                      if (((al) this).field_b.d(param1 ^ -61)) {
                        hn discarded$4 = wm.a(param1 + 28, vb.field_D[68]);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L2: {
                if (param1 == 68) {
                  break L2;
                } else {
                  int discarded$5 = ((al) this).a(35, 8);
                  break L2;
                }
              }
              return;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_f = null;
        field_c = null;
        field_a = null;
        if (param0 != 2) {
            Object var2 = null;
            boolean discarded$0 = al.a((dj) null, 55, (dj) null, (dj) null);
        }
    }

    void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          if ((bd.field_e ^ -1) != -641) {
            break L0;
          } else {
            if (-481 != (nh.field_P ^ -1)) {
              break L0;
            } else {
              L1: {
                if (param0 > 105) {
                  break L1;
                } else {
                  ((al) this).field_l = false;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var2 = ((al) this).field_d;
                  if ((var2 ^ -1) == -2) {
                    break L3;
                  } else {
                    if (14 != var2) {
                      if ((var2 ^ -1) != -9) {
                        L4: {
                          if (2 == var2) {
                            break L4;
                          } else {
                            if (-4 != (var2 ^ -1)) {
                              if (4 != var2) {
                                if (-6 != (var2 ^ -1)) {
                                  if ((var2 ^ -1) != -7) {
                                    if (7 != var2) {
                                      if ((var2 ^ -1) == -10) {
                                        break L4;
                                      } else {
                                        if ((var2 ^ -1) == -14) {
                                          break L4;
                                        } else {
                                          L5: {
                                            if (11 == var2) {
                                              break L5;
                                            } else {
                                              if (-13 != (var2 ^ -1)) {
                                                break L2;
                                              } else {
                                                break L5;
                                              }
                                            }
                                          }
                                          bi.b(0, 0, 640, 480, 65793);
                                          break L2;
                                        }
                                      }
                                    } else {
                                      qk.field_Hb[4].e(0, 0);
                                      break L2;
                                    }
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        qk.field_Hb[4].e(0, 0);
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                qk.field_Hb[0].e(0, 0);
                break L2;
              }
              return;
            }
          }
        }
        L6: {
          L7: {
            var2 = bd.field_e / 128;
            var3 = nh.field_P / 96;
            var4 = ((al) this).field_d;
            if (1 == var4) {
              break L7;
            } else {
              if ((var4 ^ -1) == -15) {
                break L7;
              } else {
                if (var4 == 8) {
                  break L7;
                } else {
                  L8: {
                    if (2 == var4) {
                      break L8;
                    } else {
                      if (var4 != 3) {
                        if (var4 != 4) {
                          if ((var4 ^ -1) != -6) {
                            if (var4 == 6) {
                              break L8;
                            } else {
                              if (-8 == (var4 ^ -1)) {
                                break L8;
                              } else {
                                if ((var4 ^ -1) == -10) {
                                  break L8;
                                } else {
                                  if (var4 == 13) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (11 == var4) {
                                        break L9;
                                      } else {
                                        if (12 != var4) {
                                          break L6;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    bi.b(0, 0, bd.field_e, nh.field_P, 65793);
                                    break L6;
                                  }
                                }
                              }
                            }
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  qk.field_Hb[4].a(-var2, -var3, bd.field_e - -(var2 * 2), nh.field_P + var3 * 2);
                  of.a(11690);
                  break L6;
                }
              }
            }
          }
          qk.field_Hb[0].a(-var2, -var3, bd.field_e + 2 * var2, nh.field_P - -(2 * var3));
          of.a(11690);
          break L6;
        }
    }

    final void a(int param0, byte param1, boolean param2) {
        int var6 = 0;
        int var4 = 2 * param0;
        int var5 = (param0 ^ -1) <= -129 ? param0 * 2 - 256 : 0;
        if (!(!param2)) {
            var6 = var4;
            var4 = var5;
            var5 = var6;
        }
        var6 = ((al) this).field_d;
        if (0 == var6) {
            var6 = 2;
        }
        if (!(11 != var6)) {
            var6 = 1;
        }
        lf.field_h.a();
        qk.field_Jb[var6].b((byte) 119);
        cn.field_f.b(64);
        int var7 = -57 / ((param1 - -72) / 47);
        lf.field_h.c(0, 0, var4, var5);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    int c(int param0, int param1) {
        if (param1 != 6) {
            ((al) this).field_k = -83;
        }
        if (((al) this).field_l) {
            return vh.field_b + ((al) this).field_g;
        }
        return ((al) this).field_i * param0 + (((al) this).field_g - -vh.field_b);
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
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
        vn var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_73_0 = 0;
        vn stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        vn stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        vn stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        vn stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        vn stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        vn stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        L0: {
          var22 = ZombieDawn.field_J;
          var4 = ((al) this).a(param0, -1);
          var5 = ((al) this).c(param0, 6);
          var6 = ((al) this).field_h[param0];
          if (var6 == 22) {
            break L0;
          } else {
            if ((var6 ^ -1) == -24) {
              break L0;
            } else {
              if (24 == var6) {
                break L0;
              } else {
                if (25 == var6) {
                  break L0;
                } else {
                  if (27 == var6) {
                    break L0;
                  } else {
                    if (-29 == (var6 ^ -1)) {
                      break L0;
                    } else {
                      if (29 == var6) {
                        break L0;
                      } else {
                        if ((var6 ^ -1) == -31) {
                          break L0;
                        } else {
                          if (31 == var6) {
                            break L0;
                          } else {
                            if (var6 == 32) {
                              break L0;
                            } else {
                              if (var6 == 33) {
                                break L0;
                              } else {
                                if ((var6 ^ -1) == -45) {
                                  break L0;
                                } else {
                                  if ((var6 ^ -1) != -27) {
                                    L1: {
                                      var23 = vk.field_b[var6];
                                      var7 = var23;
                                      var8 = ((al) this).a(true, param0) + -var5;
                                      var9 = ((al) this).b(param0, true);
                                      if (!param2) {
                                        stackOut_17_0 = 0;
                                        stackIn_18_0 = stackOut_17_0;
                                        break L1;
                                      } else {
                                        stackOut_16_0 = 2;
                                        stackIn_18_0 = stackOut_16_0;
                                        break L1;
                                      }
                                    }
                                    L2: {
                                      var10 = stackIn_18_0;
                                      if (-5 != (var6 ^ -1)) {
                                        break L2;
                                      } else {
                                        if (cn.field_b != null) {
                                          break L2;
                                        } else {
                                          L3: {
                                            if (be.field_j <= 0) {
                                              break L3;
                                            } else {
                                              if (!nh.a((byte) 77, vh.field_a)) {
                                                break L3;
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                          L4: {
                                            if (!param2) {
                                              stackOut_25_0 = 6;
                                              stackIn_26_0 = stackOut_25_0;
                                              break L4;
                                            } else {
                                              stackOut_24_0 = 7;
                                              stackIn_26_0 = stackOut_24_0;
                                              break L4;
                                            }
                                          }
                                          var10 = stackIn_26_0;
                                          break L2;
                                        }
                                      }
                                    }
                                    L5: {
                                      if ((((al) this).field_d ^ -1) != -4) {
                                        break L5;
                                      } else {
                                        L6: {
                                          L7: {
                                            if (var6 != 8) {
                                              break L7;
                                            } else {
                                              if ((ad.field_e ^ -1) == -1) {
                                                break L6;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          L8: {
                                            if (var6 != 9) {
                                              break L8;
                                            } else {
                                              if (1 == ad.field_e) {
                                                break L6;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          if ((var6 ^ -1) != -11) {
                                            break L5;
                                          } else {
                                            if (ad.field_e == 2) {
                                              break L6;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        L9: {
                                          if (param2) {
                                            stackOut_39_0 = 1;
                                            stackIn_40_0 = stackOut_39_0;
                                            break L9;
                                          } else {
                                            stackOut_38_0 = 10;
                                            stackIn_40_0 = stackOut_38_0;
                                            break L9;
                                          }
                                        }
                                        var10 = stackIn_40_0;
                                        break L5;
                                      }
                                    }
                                    L10: {
                                      if (dj.field_e != null) {
                                        stackOut_43_0 = dj.field_e.j(-5402);
                                        stackIn_44_0 = stackOut_43_0;
                                        break L10;
                                      } else {
                                        stackOut_42_0 = 0;
                                        stackIn_44_0 = stackOut_42_0;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      var11 = stackIn_44_0;
                                      if (var7 != null) {
                                        if (var6 == 20) {
                                          var7 = s.a(1938762664, var23, new String[1]);
                                          break L11;
                                        } else {
                                          if ((var6 ^ -1) == -22) {
                                            L12: {
                                              if (var11 == 0) {
                                                var10 = 6;
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            var7 = s.a(1938762664, var23, new String[1]);
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      } else {
                                        var7 = "ERROR: missing text";
                                        break L11;
                                      }
                                    }
                                    L13: {
                                      var12 = -sg.field_jb.field_x + -sg.field_jb.field_I + -ca.field_b[6].field_q + (-ca.field_b[0].field_q + var9);
                                      if (param1 <= -123) {
                                        break L13;
                                      } else {
                                        field_c = null;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (-13 == (var6 ^ -1)) {
                                          break L15;
                                        } else {
                                          if (var6 != 13) {
                                            sg.field_jb.a(var7, var5 - -(var8 >> 568775841), var4 + (sg.field_jb.field_I - -ca.field_b[0].field_q) - -(var12 >> -749156159), var10, 0);
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (12 == var6) {
                                          stackOut_61_0 = 224;
                                          stackIn_62_0 = stackOut_61_0;
                                          break L16;
                                        } else {
                                          stackOut_60_0 = 288;
                                          stackIn_62_0 = stackOut_60_0;
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        var13 = stackIn_62_0;
                                        var14 = 137 + ff.field_b;
                                        var15 = (var8 + -var14 >> -1499278207) + var5;
                                        sg.field_jb.c(var7, var15, (var12 >> 1574732513) + (ca.field_b[0].field_q + sg.field_jb.field_I + var4), var10, 0);
                                        var15 = var15 + (ff.field_b - -8);
                                        bi.c(var15, var9 / 2 + var4 - 1, 129, 2, var10);
                                        if (var6 == 12) {
                                          stackOut_64_0 = ge.field_c;
                                          stackIn_65_0 = stackOut_64_0;
                                          break L17;
                                        } else {
                                          stackOut_63_0 = ce.field_u;
                                          stackIn_65_0 = stackOut_63_0;
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        var16 = stackIn_65_0;
                                        var16 = (var16 << -125053368) / var13;
                                        if (ad.field_g == null) {
                                          break L18;
                                        } else {
                                          if (ad.field_g[0] == null) {
                                            break L18;
                                          } else {
                                            if (ad.field_g[0][0] != null) {
                                              L19: {
                                                if (-13 == (var6 ^ -1)) {
                                                  stackOut_72_0 = 0;
                                                  stackIn_73_0 = stackOut_72_0;
                                                  break L19;
                                                } else {
                                                  stackOut_71_0 = 1;
                                                  stackIn_73_0 = stackOut_71_0;
                                                  break L19;
                                                }
                                              }
                                              L20: {
                                                var17 = stackIn_73_0;
                                                var18 = (int)((tp.field_p >> 696066179) % 7L) + 7;
                                                if (param2) {
                                                  var18 = (int)((tp.field_p >> -175638525) % 4L) + 14;
                                                  break L20;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                              L21: {
                                                bi.b(var15, var9 / 2 + var4 - 1, 129, 6, 6815744);
                                                bi.b(var15, -1 + var9 / 2 + var4, (var16 >> -1501401599) - -1, 6, 13373713);
                                                bi.c(var15, -1 + (var4 + var9 / 2), 129, 6, var10);
                                                bi.e(var15, var4 + (var9 / 2 + -1), 129, 6, 1, var10);
                                                stackOut_76_0 = ad.field_g[var17][var18];
                                                stackOut_76_1 = 0;
                                                stackOut_76_2 = 339;
                                                stackIn_78_0 = stackOut_76_0;
                                                stackIn_78_1 = stackOut_76_1;
                                                stackIn_78_2 = stackOut_76_2;
                                                stackIn_77_0 = stackOut_76_0;
                                                stackIn_77_1 = stackOut_76_1;
                                                stackIn_77_2 = stackOut_76_2;
                                                if ((var6 ^ -1) != -13) {
                                                  stackOut_78_0 = (vn) (Object) stackIn_78_0;
                                                  stackOut_78_1 = stackIn_78_1;
                                                  stackOut_78_2 = stackIn_78_2;
                                                  stackOut_78_3 = 0;
                                                  stackIn_79_0 = stackOut_78_0;
                                                  stackIn_79_1 = stackOut_78_1;
                                                  stackIn_79_2 = stackOut_78_2;
                                                  stackIn_79_3 = stackOut_78_3;
                                                  break L21;
                                                } else {
                                                  stackOut_77_0 = (vn) (Object) stackIn_77_0;
                                                  stackOut_77_1 = stackIn_77_1;
                                                  stackOut_77_2 = stackIn_77_2;
                                                  stackOut_77_3 = 1;
                                                  stackIn_79_0 = stackOut_77_0;
                                                  stackIn_79_1 = stackOut_77_1;
                                                  stackIn_79_2 = stackOut_77_2;
                                                  stackIn_79_3 = stackOut_77_3;
                                                  break L21;
                                                }
                                              }
                                              var19 = fj.a(stackIn_79_0, stackIn_79_1, stackIn_79_2, stackIn_79_3 != 0);
                                              var20 = 1;
                                              var21 = 1;
                                              var19.h(var15 + (var16 >> 739849633) + (-1 + (-23 - -var20)), var21 + -10 + var4 + 2, 1);
                                              var19.b(var15 + ((var16 >> 1906403553) + -24), 2 + var4 - 10);
                                              break L14;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                      }
                                      bi.b(-1 + (var16 >> 1294430849) + var15, 3 + var4, 3, -6 + var9, 6684672);
                                      bi.c(-1 + (var16 >> 1841016417) + var15, var4 + 3, 3, -6 + var9, 11141120);
                                      break L14;
                                    }
                                    return;
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (((al) this).field_l) {
            ((al) this).field_b.a(21657);
            break L0;
          } else {
            ((al) this).field_b.a(0, param0 ^ 31644);
            break L0;
          }
        }
        if (0 <= ((al) this).field_b.field_d) {
          L1: {
            if (-3 != (((al) this).field_d ^ -1)) {
              break L1;
            } else {
              if (((al) this).field_h[((al) this).field_b.field_d] != 21) {
                break L1;
              } else {
                if (dj.field_e.j(-5402) != 0) {
                  break L1;
                } else {
                  if (-99 == (kg.field_i ^ -1)) {
                    ((al) this).field_b.b(((al) this).field_b.field_d + -1, -69);
                    break L1;
                  } else {
                    if (99 == kg.field_i) {
                      ((al) this).field_b.b(((al) this).field_b.field_d + 1, param0 + 31542);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L2: {
            if (param0 == -31645) {
              break L2;
            } else {
              ((al) this).field_d = -13;
              break L2;
            }
          }
          return;
        } else {
          return;
        }
    }

    void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        var3 = ((al) this).field_b.field_d;
        if ((((al) this).field_d ^ -1) != -12) {
          if (((al) this).field_d != 0) {
            if (((al) this).field_d != 8) {
              L0: {
                if (!param1) {
                  break L0;
                } else {
                  ((al) this).field_b.a((byte) -13, ((al) this).b(true, ha.field_b, ei.field_K), ((al) this).b(true, nc.field_j, hp.field_D));
                  if (-1 == ((al) this).field_b.field_d) {
                    if (ci.field_d == 1) {
                      if (9 != ((al) this).field_d) {
                        if (-14 == (((al) this).field_d ^ -1)) {
                          ((ac) this).b(ha.field_b, 32526, ei.field_K);
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        ((pl) this).a((byte) -114, ei.field_K, ha.field_b);
                        break L0;
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    this.d(((al) this).field_b.field_d, 68);
                    ((al) this).a(true, ((al) this).field_b.field_d, -8512);
                    break L0;
                  }
                }
              }
              L1: {
                var4 = 62 % ((-39 - param0) / 61);
                if ((var3 ^ -1) == (((al) this).field_b.field_d ^ -1)) {
                  break L1;
                } else {
                  if (0 != (((al) this).field_b.field_d ^ -1)) {
                    fn discarded$1 = kh.a(69, false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              L2: {
                var4 = jp.field_c.b(param1, 257);
                if (-4 != (var4 ^ -1)) {
                  break L2;
                } else {
                  ca.a(true, true, 1);
                  break L2;
                }
              }
              L3: {
                if (-2 == (var4 ^ -1)) {
                  ca.a(false, true, 1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var4 != 2) {
                  break L4;
                } else {
                  ca.a(true, true, 1);
                  break L4;
                }
              }
              return;
            }
          } else {
            vl.field_b.a(-1, param1);
            return;
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        L0: {
          var5 = ZombieDawn.field_J;
          if ((((al) this).field_d ^ -1) == -3) {
            ((al) this).field_h = new int[]{1, 12, 13, 34, 4, 3, 21, 7};
            ((al) this).field_k = ((al) this).field_k - sg.field_jb.field_I / 2;
            ((al) this).field_b = new jp(((al) this).field_h.length);
            break L0;
          } else {
            if (((al) this).field_d == 3) {
              ((al) this).field_h = new int[]{44, 44, 8, 9, 10, 5};
              ((al) this).field_b = new jp(((al) this).field_h.length);
              break L0;
            } else {
              if (((al) this).field_d == 5) {
                ((al) this).field_h = new int[]{5};
                ((al) this).field_b = new jp(((al) this).field_h.length);
                break L0;
              } else {
                if (9 == ((al) this).field_d) {
                  if (0 >= be.field_j) {
                    break L0;
                  } else {
                    ((al) this).field_h[0] = 41;
                    ((pl) this).field_o[0] = 41;
                    break L0;
                  }
                } else {
                  if (1 == ((al) this).field_d) {
                    if ((be.field_j ^ -1) >= -1) {
                      break L0;
                    } else {
                      var10 = new int[-1 + ((al) this).field_h.length];
                      var9 = var10;
                      var8 = var9;
                      var7 = var8;
                      var6 = var7;
                      var2 = var6;
                      var3 = 0;
                      var4 = 0;
                      L1: while (true) {
                        if (((al) this).field_h.length <= var4) {
                          ((al) this).field_h = var6;
                          ((al) this).field_b = new jp(((al) this).field_h.length);
                          boolean discarded$1 = la.field_d.b(param0 ^ -20093, 1);
                          break L0;
                        } else {
                          var6[var3] = ((al) this).field_h[var4];
                          if (var10[var3] == 42) {
                            var3--;
                            var4++;
                            var3++;
                            continue L1;
                          } else {
                            var4++;
                            var3++;
                            continue L1;
                          }
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param0 == 24136) {
            break L2;
          } else {
            ((al) this).field_h = null;
            break L2;
          }
        }
    }

    int b(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (param0) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((al) this).field_h.length) {
              return -1;
            } else {
              var5 = ((al) this).a(var4, -1);
              if (((al) this).b(var4, -1)) {
                if (((al) this).c(var4, 6) <= param1) {
                  if (((al) this).a(true, var4) > param1) {
                    if (var5 <= param2) {
                      if (param2 < var5 + ((al) this).b(var4, param0)) {
                        return var4;
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 7;
        }
    }

    boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        if (((al) this).field_d == 0) {
          return vl.field_b.a(param0, param2, -29638);
        } else {
          L0: {
            if ((param0 ^ -1) != -14) {
              if ((((al) this).field_d ^ -1) != -9) {
                ((al) this).a(-31645);
                if (-1 != ((al) this).field_b.field_d) {
                  this.d(((al) this).field_b.field_d, param1 + -65725);
                  ((al) this).a(false, ((al) this).field_b.field_d, param1 ^ -73791);
                  return true;
                } else {
                  break L0;
                }
              } else {
                L1: {
                  var4 = jp.field_c.b(3782);
                  if ((var4 ^ -1) == -4) {
                    ca.a(true, true, 1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if ((var4 ^ -1) == -2) {
                    ca.a(false, true, 1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 == var4) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L3;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L3;
                  }
                }
                return stackIn_25_0 != 0;
              }
            } else {
              if (-3 == (((al) this).field_d ^ -1)) {
                ca.a(false, true, 0);
                df.field_i = 1;
                return true;
              } else {
                if (10 == ((al) this).field_d) {
                  break L0;
                } else {
                  if (-10 != (((al) this).field_d ^ -1)) {
                    if ((((al) this).field_d ^ -1) != -14) {
                      if (-8 != (((al) this).field_d ^ -1)) {
                        if (-2 == (((al) this).field_d ^ -1)) {
                          break L0;
                        } else {
                          ca.a(false, true, df.field_i);
                          return true;
                        }
                      } else {
                        break L0;
                      }
                    } else {
                      ((ac) this).e((byte) 54);
                      return true;
                    }
                  } else {
                    ((pl) this).c(-26931);
                    return true;
                  }
                }
              }
            }
          }
          if (param1 == 65793) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 == -10) {
          L0: {
            if (po.w(param0 + 13306)) {
              ca.a(param1, true, 7);
              break L0;
            } else {
              vl.field_b.c(true);
              vl.field_b.d(false);
              bd.field_m = null;
              if (nk.a(8, kg.field_g)) {
                ca.a(param1, true, 6);
                break L0;
              } else {
                ca.a(param1, true, 3);
                break L0;
              }
            }
          }
          df.field_i = 1;
          return;
        } else {
          return;
        }
    }

    int a(int param0, int param1) {
        if (param1 != -1) {
            return 62;
        }
        if (!((al) this).field_l) {
            return id.field_M + ((al) this).field_k;
        }
        return id.field_M + param0 * ((al) this).field_i + ((al) this).field_k;
    }

    void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var14 = null;
        int[] var15 = null;
        boolean stackIn_53_0 = false;
        int stackIn_53_1 = 0;
        boolean stackIn_54_0 = false;
        int stackIn_54_1 = 0;
        boolean stackIn_55_0 = false;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_172_0 = 0;
        boolean stackOut_52_0 = false;
        int stackOut_52_1 = 0;
        boolean stackOut_54_0 = false;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        boolean stackOut_53_0 = false;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        var9 = ZombieDawn.field_J;
        var4 = ((al) this).field_h[param1];
        if (param2 == -8512) {
          L0: {
            var6 = var4;
            if (-1 == (var6 ^ -1)) {
              if (((al) this).field_b.d(-127)) {
                L1: {
                  wi.field_b = null;
                  bd.field_m = null;
                  stackOut_52_0 = param0;
                  stackOut_52_1 = 1;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  if (0 < be.field_j) {
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = stackIn_54_1;
                    stackOut_54_2 = 13;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    stackIn_55_2 = stackOut_54_2;
                    break L1;
                  } else {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = stackIn_53_1;
                    stackOut_53_2 = 9;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    stackIn_55_2 = stackOut_53_2;
                    break L1;
                  }
                }
                ca.a(stackIn_55_0, stackIn_55_1 != 0, stackIn_55_2);
                df.field_i = 1;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (var6 != 42) {
                if (-2 != (var6 ^ -1)) {
                  if ((var6 ^ -1) != -42) {
                    if (-41 != (var6 ^ -1)) {
                      if (5 == var6) {
                        if (((al) this).field_b.d(-128)) {
                          ca.a(param0, true, 1);
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        if (-17 != (var6 ^ -1)) {
                          if (14 == var6) {
                            if (((al) this).field_b.d(-127)) {
                              ca.a(param0, true, 5);
                              df.field_i = ((al) this).field_d;
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            if (3 != var6) {
                              if (var6 == 6) {
                                if (((al) this).field_b.d(-122)) {
                                  ca.a(param0, true, df.field_i);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              } else {
                                if ((var6 ^ -1) == -44) {
                                  if (((al) this).field_b.d(param2 + 8388)) {
                                    ca.a(param0, true, 14);
                                    df.field_i = ((al) this).field_d;
                                    break L0;
                                  } else {
                                    break L0;
                                  }
                                } else {
                                  if (var6 == 2) {
                                    if (!((al) this).field_b.d(param2 + 8386)) {
                                      break L0;
                                    } else {
                                      ca.a(param0, true, 3);
                                      break L0;
                                    }
                                  } else {
                                    if (-13 == (var6 ^ -1)) {
                                      L2: {
                                        var5 = ge.field_c;
                                        if (((al) this).field_b.b(false)) {
                                          qb.a(false, 0);
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      }
                                      L3: {
                                        if (!((al) this).field_b.f(param2 ^ 8536)) {
                                          break L3;
                                        } else {
                                          qb.a(false, 224);
                                          break L3;
                                        }
                                      }
                                      L4: {
                                        if (!((al) this).field_b.b(-126)) {
                                          break L4;
                                        } else {
                                          var6 = 137 + ff.field_b;
                                          var7 = (((al) this).c(param1, 6) + (((al) this).a(true, param1) - var6) >> -1118510271) + (ff.field_b + 8);
                                          var8 = ha.field_b - var7 << -1469811711;
                                          var8 = var8 * 224 >> 815035624;
                                          if ((var8 ^ -1) < -1) {
                                            if (224 > var8) {
                                              qb.a(false, var8);
                                              break L4;
                                            } else {
                                              qb.a(false, 224);
                                              break L4;
                                            }
                                          } else {
                                            qb.a(false, 0);
                                            break L4;
                                          }
                                        }
                                      }
                                      L5: {
                                        if (!((al) this).field_b.c(-97)) {
                                          break L5;
                                        } else {
                                          if (ge.field_c > 28) {
                                            L6: {
                                              var6 = ge.field_c % 28;
                                              if (0 != var6) {
                                                break L6;
                                              } else {
                                                var6 = 28;
                                                break L6;
                                              }
                                            }
                                            qb.a(false, -var6 + ge.field_c);
                                            break L5;
                                          } else {
                                            qb.a(false, 0);
                                            break L5;
                                          }
                                        }
                                      }
                                      L7: {
                                        if (((al) this).field_b.e(-98)) {
                                          if (-197 < (ge.field_c ^ -1)) {
                                            var6 = ge.field_c % 28;
                                            qb.a(false, 28 + (ge.field_c + -var6));
                                            break L7;
                                          } else {
                                            qb.a(false, 224);
                                            break L7;
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      if ((ge.field_c ^ -1) == (var5 ^ -1)) {
                                        break L0;
                                      } else {
                                        L8: {
                                          if (null == wh.field_e) {
                                            break L8;
                                          } else {
                                            if (wh.field_e.l()) {
                                              break L8;
                                            } else {
                                              break L0;
                                            }
                                          }
                                        }
                                        wh.field_e = kh.a(47, false);
                                        break L0;
                                      }
                                    } else {
                                      if (-14 == (var6 ^ -1)) {
                                        L9: {
                                          if (!((al) this).field_b.b(false)) {
                                            break L9;
                                          } else {
                                            ZombieDawn.b(127, 0);
                                            break L9;
                                          }
                                        }
                                        L10: {
                                          if (!((al) this).field_b.f(-104)) {
                                            break L10;
                                          } else {
                                            ZombieDawn.b(115, 288);
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if (!((al) this).field_b.b(param2 ^ 8491)) {
                                            break L11;
                                          } else {
                                            var6 = ff.field_b + 137;
                                            var7 = 8 + ((((al) this).c(param1, 6) - -((al) this).a(true, param1) - var6 >> 1330627489) + ff.field_b);
                                            var8 = ha.field_b - var7 << 645275713;
                                            var8 = var8 * 288 >> 1004751816;
                                            if (-1 <= (var8 ^ -1)) {
                                              ZombieDawn.b(118, 0);
                                              break L11;
                                            } else {
                                              if (288 > var8) {
                                                ZombieDawn.b(124, var8);
                                                break L11;
                                              } else {
                                                ZombieDawn.b(param2 ^ -8521, 288);
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                        L12: {
                                          if (((al) this).field_b.c(-97)) {
                                            var6 = ce.field_u;
                                            if (36 < var6) {
                                              L13: {
                                                var7 = var6 % 36;
                                                if (-1 == (var7 ^ -1)) {
                                                  var7 = 36;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              ZombieDawn.b(param2 + 8635, var6 - var7);
                                              break L12;
                                            } else {
                                              ZombieDawn.b(124, 0);
                                              break L12;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                        if (((al) this).field_b.e(param2 ^ 8542)) {
                                          var6 = ce.field_u;
                                          if (252 > var6) {
                                            var7 = var6 % 36;
                                            ZombieDawn.b(127, 36 + (var6 - var7));
                                            break L0;
                                          } else {
                                            ZombieDawn.b(119, 288);
                                            break L0;
                                          }
                                        } else {
                                          break L0;
                                        }
                                      } else {
                                        if ((var6 ^ -1) != -5) {
                                          if (7 == var6) {
                                            if (!((al) this).field_b.d(-123)) {
                                              break L0;
                                            } else {
                                              L14: {
                                                if (2 == ((al) this).field_d) {
                                                  tp.a(param2 ^ -8478, false, w.field_a[5]);
                                                  break L14;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                              this.a(-10, param0);
                                              break L0;
                                            }
                                          } else {
                                            if (44 == var6) {
                                              if (!((al) this).field_b.d(-122)) {
                                                break L0;
                                              } else {
                                                ((vj) (Object) jj.c(3, 115)).d((byte) 77);
                                                break L0;
                                              }
                                            } else {
                                              if (-9 != (var6 ^ -1)) {
                                                if (var6 != 9) {
                                                  if (var6 != 10) {
                                                    if (var6 == 15) {
                                                      if (((al) this).field_b.d(-121)) {
                                                        L15: {
                                                          if (-6 == (((al) this).field_d ^ -1)) {
                                                            break L15;
                                                          } else {
                                                            if (3 != ((al) this).field_d) {
                                                              if (7 == ((al) this).field_d) {
                                                                L16: {
                                                                  if (nk.a(param2 + 8520, kg.field_g)) {
                                                                    stackOut_171_0 = 6;
                                                                    stackIn_172_0 = stackOut_171_0;
                                                                    break L16;
                                                                  } else {
                                                                    stackOut_170_0 = 3;
                                                                    stackIn_172_0 = stackOut_170_0;
                                                                    break L16;
                                                                  }
                                                                }
                                                                hd.a(stackIn_172_0, -126, 7);
                                                                break L0;
                                                              } else {
                                                                break L0;
                                                              }
                                                            } else {
                                                              break L15;
                                                            }
                                                          }
                                                        }
                                                        hd.a(((al) this).field_d, param2 ^ 8500, ((al) this).field_d);
                                                        break L0;
                                                      } else {
                                                        break L0;
                                                      }
                                                    } else {
                                                      if (var6 == 17) {
                                                        if (!((al) this).field_b.d(-128)) {
                                                          break L0;
                                                        } else {
                                                          if (!((al) this).b(param1, param2 + 8511)) {
                                                            break L0;
                                                          } else {
                                                            ((fg) (Object) qk.field_Jb[4]).c(20921, param0);
                                                            break L0;
                                                          }
                                                        }
                                                      } else {
                                                        if ((var6 ^ -1) != -19) {
                                                          if (11 == var6) {
                                                            if (((al) this).field_b.d(-126)) {
                                                              L17: {
                                                                if (null != cn.field_b) {
                                                                  re.a((byte) -71);
                                                                  break L17;
                                                                } else {
                                                                  break L17;
                                                                }
                                                              }
                                                              bo.a(-99, hc.a(param2 + 8512));
                                                              break L0;
                                                            } else {
                                                              break L0;
                                                            }
                                                          } else {
                                                            if (var6 == 19) {
                                                              if (!((al) this).field_b.d(-125)) {
                                                                break L0;
                                                              } else {
                                                                if (vl.field_b.g(true)) {
                                                                  ca.a(true, true, 0);
                                                                  break L0;
                                                                } else {
                                                                  this.a(param2 ^ 8502, param0);
                                                                  break L0;
                                                                }
                                                              }
                                                            } else {
                                                              L18: {
                                                                if (20 != var6) {
                                                                  if (-22 == (var6 ^ -1)) {
                                                                    break L18;
                                                                  } else {
                                                                    if ((var6 ^ -1) != -35) {
                                                                      if (37 == var6) {
                                                                        if (!((al) this).field_b.d(-124)) {
                                                                          break L0;
                                                                        } else {
                                                                          if (!vi.field_a) {
                                                                            vk.field_b[37] = wl.field_a[1];
                                                                            vi.field_a = true;
                                                                            break L0;
                                                                          } else {
                                                                            vk.field_b[37] = wl.field_a[0];
                                                                            vi.field_a = false;
                                                                            break L0;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L19: {
                                                                          if ((var6 ^ -1) == -36) {
                                                                            break L19;
                                                                          } else {
                                                                            if (-37 != (var6 ^ -1)) {
                                                                              if ((var6 ^ -1) == -39) {
                                                                                break L19;
                                                                              } else {
                                                                                if ((var6 ^ -1) != -40) {
                                                                                  break L0;
                                                                                } else {
                                                                                  break L0;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              break L19;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (((al) this).field_b.d(param2 ^ 8520)) {
                                                                          this.a(-10, param0);
                                                                          break L0;
                                                                        } else {
                                                                          break L0;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (((al) this).field_b.d(param2 + 8388)) {
                                                                        dc.a((byte) 124);
                                                                        vk.field_b[34] = hc.a(true);
                                                                        break L0;
                                                                      } else {
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L18;
                                                                }
                                                              }
                                                              if (!((al) this).field_b.d(-125)) {
                                                                break L0;
                                                              } else {
                                                                if (vl.field_b.b(-25983)) {
                                                                  vl.field_b.a(param2 + 8398);
                                                                  ca.a(true, true, 0);
                                                                  break L0;
                                                                } else {
                                                                  break L0;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (!((al) this).field_b.d(-124)) {
                                                            break L0;
                                                          } else {
                                                            if (!((al) this).b(param1, param2 + 8511)) {
                                                              break L0;
                                                            } else {
                                                              ((fg) (Object) qk.field_Jb[4]).b(param0, 126);
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (((al) this).field_b.d(-122)) {
                                                      ad.field_e = 2;
                                                      break L0;
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  if (((al) this).field_b.d(-128)) {
                                                    ad.field_e = 1;
                                                    break L0;
                                                  } else {
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                if (((al) this).field_b.d(param2 + 8389)) {
                                                  ad.field_e = 0;
                                                  break L0;
                                                } else {
                                                  break L0;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (((al) this).field_b.d(-123)) {
                                            ra.d((byte) 76);
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (((al) this).field_b.d(-126)) {
                                ((fg) (Object) qk.field_Jb[4]).d((byte) -37);
                                ca.a(param0, true, 4);
                                df.field_i = ((al) this).field_d;
                                break L0;
                              } else {
                                break L0;
                              }
                            }
                          }
                        } else {
                          if (!((al) this).field_b.d(-127)) {
                            break L0;
                          } else {
                            var6 = 1;
                            ca.a(param0, true, var6);
                            var14 = kg.field_g;
                            var8 = 0;
                            L20: while (true) {
                              if (8 <= var8) {
                                var15 = dj.field_i;
                                var8 = 0;
                                L21: while (true) {
                                  if (8 <= var8) {
                                    kk.field_j.b(param2 + 8482);
                                    dn.field_D.b(-63);
                                    to.field_b[0] = 0;
                                    break L0;
                                  } else {
                                    var15[var8] = 0;
                                    var8++;
                                    continue L21;
                                  }
                                }
                              } else {
                                var14[var8] = 0;
                                var8++;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (((al) this).field_b.d(-122)) {
                        ca.a(param0, true, 9);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    if (((al) this).field_b.d(-122)) {
                      ca.a(param0, true, 13);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                } else {
                  if (((al) this).field_b.d(param2 + 8386)) {
                    ca.a(param0, true, 0);
                    df.field_i = 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                if (!((al) this).field_b.d(-128)) {
                  break L0;
                } else {
                  ca.a(param0, true, 8);
                  df.field_i = 1;
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    boolean b(int param0, int param1) {
        L0: {
          if (((al) this).field_h[param0] == 39) {
            break L0;
          } else {
            if (-46 == (((al) this).field_h[param0] ^ -1)) {
              break L0;
            } else {
              if (((al) this).field_h[param0] == 46) {
                break L0;
              } else {
                L1: {
                  if (param1 == -1) {
                    break L1;
                  } else {
                    int discarded$2 = ((al) this).a(71, -63);
                    break L1;
                  }
                }
                if (((al) this).field_h[param0] != 21) {
                  return true;
                } else {
                  if (-1 == (dj.field_e.j(-5402) ^ -1)) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
        }
        return false;
    }

    void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        var5 = ZombieDawn.field_J;
        if ((((al) this).field_d ^ -1) != -1) {
          if ((((al) this).field_d ^ -1) != -12) {
            L0: {
              if (-8 == (((al) this).field_d ^ -1)) {
                li.a(false);
                var2 = 100 - -sg.field_jb.field_I;
                var3 = 4 + sg.field_jb.field_x + sg.field_jb.field_w;
                var4 = 16777215;
                bj.field_q.a(wi.field_d, 320, var2, var4, -1);
                bj.field_q.a(ma.a(rf.field_d, 98, eh.field_z, false), 320, var3 + var2, var4, -1);
                bj.field_q.a(fh.a(false, rf.field_d, 0, eh.field_z), 320, 42 + (var3 * 3 + var2), var4, -1);
                bj.field_q.a(g.a(rf.field_d, -121, false, eh.field_z), 320, var2 + var3 * 4 + 84, var4, -1);
                break L0;
              } else {
                if (((al) this).field_d != 8) {
                  if (2 != ((al) this).field_d) {
                    if (10 != ((al) this).field_d) {
                      break L0;
                    } else {
                      li.a(false);
                      break L0;
                    }
                  } else {
                    li.a(false);
                    break L0;
                  }
                } else {
                  jp.field_c.b((byte) 123);
                  return;
                }
              }
            }
            L1: {
              if (param0 <= -35) {
                break L1;
              } else {
                ((al) this).field_j = -46;
                break L1;
              }
            }
            var6 = 0;
            var2 = var6;
            L2: while (true) {
              if ((((al) this).field_b.field_h ^ -1) >= (var6 ^ -1)) {
                L3: {
                  if (ed.field_b[((al) this).field_d] == null) {
                    break L3;
                  } else {
                    ed.field_b[((al) this).field_d].b(vh.field_b, id.field_M / 2);
                    break L3;
                  }
                }
                return;
              } else {
                L4: {
                  L5: {
                    if (((al) this).b(var6, -1)) {
                      break L5;
                    } else {
                      if (21 == ((al) this).field_h[var6]) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    stackOut_19_0 = this;
                    stackOut_19_1 = var6;
                    stackOut_19_2 = -128;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    stackIn_21_2 = stackOut_19_2;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    if ((((al) this).field_b.field_d ^ -1) != (var6 ^ -1)) {
                      stackOut_21_0 = this;
                      stackOut_21_1 = stackIn_21_1;
                      stackOut_21_2 = stackIn_21_2;
                      stackOut_21_3 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      stackIn_22_2 = stackOut_21_2;
                      stackIn_22_3 = stackOut_21_3;
                      break L6;
                    } else {
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = stackIn_20_2;
                      stackOut_20_3 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_22_3 = stackOut_20_3;
                      break L6;
                    }
                  }
                  this.a(stackIn_22_1, stackIn_22_2, stackIn_22_3 != 0);
                  break L4;
                }
                var6++;
                continue L2;
              }
            }
          } else {
            return;
          }
        } else {
          vl.field_b.e(9844);
          return;
        }
    }

    final static boolean a(dj param0, int param1, dj param2, dj param3) {
        if (!param2.a((byte) 73)) {
          return false;
        } else {
          if (param2.a(-1, "commonui")) {
            L0: {
              if (!param3.a((byte) 73)) {
                break L0;
              } else {
                if (!param3.a(-1, "commonui")) {
                  break L0;
                } else {
                  L1: {
                    if (!param0.a((byte) 73)) {
                      break L1;
                    } else {
                      if (!param0.a(param1 + 31525, "button.gif")) {
                        break L1;
                      } else {
                        if (param1 == -31526) {
                          return true;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    void a(al param0, int param1) {
        if (param1 < 70) {
            ((al) this).field_b = null;
        }
    }

    int b(int param0, boolean param1) {
        if (!param1) {
            ((al) this).field_l = false;
        }
        return 42;
    }

    void a(byte param0, int param1, boolean param2) {
        if (!(0 == (((al) this).field_b.field_d ^ -1))) {
            param1 = ((al) this).field_b.field_d;
        }
        ((al) this).field_b.a(param2, (byte) -107, ((al) this).b(true, ha.field_b, ei.field_K), param1);
        if (param0 <= 65) {
            return;
        }
        if (!(8 != ((al) this).field_d)) {
            jp.field_c.a(param2, 1);
        }
        if (this instanceof pl) {
            ((pl) this).b((byte) 122, true);
        }
    }

    int a(boolean param0, int param1) {
        if (!param0) {
            return -117;
        }
        if (!((al) this).field_l) {
            return ((al) this).c(param1, 6) + ((al) this).field_i;
        }
        return ((al) this).field_j + vh.field_b;
    }

    al(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((al) this).field_i = param5;
        ((al) this).field_k = param4;
        ((al) this).field_j = param3;
        ((al) this).field_h = param6;
        ((al) this).field_g = param2;
        ((al) this).field_l = param1 ? true : false;
        ((al) this).field_d = param0;
        ((al) this).field_b = new jp(((al) this).field_h.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = "Create";
    }
}
