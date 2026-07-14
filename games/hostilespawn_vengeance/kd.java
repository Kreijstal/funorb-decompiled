/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends tj {
    int field_w;
    private boolean field_x;
    private int field_s;
    ji field_B;
    ji field_p;
    ji field_u;
    private int[] field_m;
    w field_C;
    int field_r;
    w field_n;
    w field_F;
    private int[] field_o;
    private int field_z;
    private static long[] field_D;
    boolean field_l;
    static nd field_G;
    static bd field_y;
    static gd field_v;
    static boolean field_t;
    static boolean field_q;
    static String field_E;
    static String field_A;

    final static int a(byte param0, int param1, int param2) {
        int var5 = HostileSpawn.field_I ? 1 : 0;
        int var3 = 0;
        while (-1 > (param1 ^ -1)) {
            var3 = var3 << 268067649 | 1 & param2;
            param2 = param2 >>> 1;
            param1--;
        }
        int var4 = 96 / ((param0 - 53) / 63);
        return var3;
    }

    private final void a(int param0, w param1, w param2) {
        ((kd) this).field_F = param2;
        if (param0 != -9) {
            field_y = null;
        }
        ((kd) this).field_s = 1048576;
        ((kd) this).field_C = param1;
    }

    private final void a(int param0, w param1, byte param2, int param3) {
        param1.a(param0, -1, (byte) -89);
        param1.c(param3, param2 + 89);
        if (param2 != 38) {
            ((kd) this).field_m = null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        oj var6_ref_oj = null;
        qm var7 = null;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (ha.field_t != param0) {
          L0: {
            var2 = ln.field_a.field_d;
            var3 = ln.field_a.field_a;
            if (param1 == 1) {
              break L0;
            } else {
              field_v = null;
              break L0;
            }
          }
          L1: {
            L2: {
              nh.field_E.a(-1, 8360, -1);
              ha.field_t = param0;
              var5 = new oc();
              var6 = ha.field_t;
              if (0 == var6) {
                break L2;
              } else {
                if (-7 == var6) {
                  break L2;
                } else {
                  if (-2 != var6) {
                    if (var6 != 2) {
                      if (-4 == (var6 ^ -1)) {
                        var4 = 0;
                        L3: while (true) {
                          L4: {
                            if (el.field_j <= var4) {
                              break L4;
                            } else {
                              if (-9 != (mm.field_m[var4].field_i ^ -1)) {
                                var4++;
                                continue L3;
                              } else {
                                nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                break L4;
                              }
                            }
                          }
                          if (0 != bm.field_c) {
                            break L1;
                          } else {
                            if (nh.field_E.field_e != -1) {
                              break L1;
                            } else {
                              kd.a(0, param1 ^ 0);
                              eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                              r.field_a = 0;
                              break L1;
                            }
                          }
                        }
                      } else {
                        if (var6 == -6) {
                          nh.field_E.a(40, 8360, 110);
                          break L1;
                        } else {
                          if (9 != var6) {
                            if (-5 != var6) {
                              if (10 == var6) {
                                var6 = 0;
                                var4 = 0;
                                L5: while (true) {
                                  if (var4 >= dk.field_o) {
                                    break L1;
                                  } else {
                                    if (2 <= var6) {
                                      break L1;
                                    } else {
                                      var7 = vj.field_w[var4];
                                      if (var7.field_i >= 49) {
                                        if (var7.field_i <= 52) {
                                          var6++;
                                          nh.field_E.a((byte) 46, var7.field_j);
                                          var4++;
                                          continue L5;
                                        } else {
                                          var4++;
                                          continue L5;
                                        }
                                      } else {
                                        var4++;
                                        continue L5;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (13 != var6) {
                                  if (var6 != 14) {
                                    if (-13 != (var6 ^ -1)) {
                                      break L1;
                                    } else {
                                      var4 = 0;
                                      L6: while (true) {
                                        if (var4 >= ll.field_a) {
                                          if (0 != (nh.field_E.field_e ^ -1)) {
                                            break L1;
                                          } else {
                                            kd.a(0, 1);
                                            eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                                            break L1;
                                          }
                                        } else {
                                          if (wh.field_b[var4].field_i == 2) {
                                            if (11 == wh.field_b[var4].field_h) {
                                              nh.field_E.a((byte) 46, wh.field_b[var4].field_j);
                                              var4++;
                                              continue L6;
                                            } else {
                                              var4++;
                                              continue L6;
                                            }
                                          } else {
                                            var4++;
                                            continue L6;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (0 != bm.field_c) {
                                      break L1;
                                    } else {
                                      var4 = 0;
                                      L7: while (true) {
                                        if (var4 >= el.field_j) {
                                          break L1;
                                        } else {
                                          if ((mm.field_m[var4].field_i ^ -1) == -128) {
                                            nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                                            break L1;
                                          } else {
                                            var4++;
                                            continue L7;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  nh.field_E.a(-1, 8360, -1);
                                  break L1;
                                }
                              }
                            } else {
                              var4 = 0;
                              L8: while (true) {
                                if (var4 >= el.field_j) {
                                  break L1;
                                } else {
                                  var6_ref_oj = mm.field_m[var4];
                                  if ((var6_ref_oj.field_i ^ -1) != -126) {
                                    var4++;
                                    continue L8;
                                  } else {
                                    nh.field_E.a(-5 + var6_ref_oj.field_j.field_e, 8360, var6_ref_oj.field_j.field_g);
                                    break L1;
                                  }
                                }
                              }
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                    } else {
                      var4 = -1 + el.field_j;
                      L9: while (true) {
                        L10: {
                          if (0 > var4) {
                            break L10;
                          } else {
                            if (mm.field_m[var4].field_i == 4) {
                              nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                              break L10;
                            } else {
                              var4--;
                              continue L9;
                            }
                          }
                        }
                        if ((nh.field_E.field_e ^ -1) != 0) {
                          break L1;
                        } else {
                          kd.a(0, param1 ^ 0);
                          eh.field_c.a(lm.field_A[3], 100, wj.field_O);
                          break L1;
                        }
                      }
                    }
                  } else {
                    var4 = 0;
                    L11: while (true) {
                      if (el.field_j <= var4) {
                        break L1;
                      } else {
                        if (125 != mm.field_m[var4].field_i) {
                          var4++;
                          continue L11;
                        } else {
                          nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var5.field_e = 0;
            L12: while (true) {
              if (var2 <= var5.field_e) {
                if (-1 == (bm.field_c ^ -1)) {
                  if (0 != rl.field_c) {
                    if (1 == rl.field_c) {
                      if (!tg.field_a) {
                        break L1;
                      } else {
                        nh.field_E.a(45, 8360, 37);
                        break L1;
                      }
                    } else {
                      if (1 != rl.field_c) {
                        break L1;
                      } else {
                        if (!tg.field_a) {
                          break L1;
                        } else {
                          nh.field_E.a(45, 8360, 37);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (1 == rl.field_c) {
                      if (!tg.field_a) {
                        break L1;
                      } else {
                        nh.field_E.a(45, 8360, 37);
                        break L1;
                      }
                    } else {
                      if (1 != rl.field_c) {
                        break L1;
                      } else {
                        if (!tg.field_a) {
                          break L1;
                        } else {
                          nh.field_E.a(45, 8360, 37);
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                var5.field_g = 0;
                L13: while (true) {
                  if (var3 <= var5.field_g) {
                    var5.field_e = var5.field_e + 1;
                    continue L12;
                  } else {
                    L14: {
                      var6 = ln.field_a.field_y[var5.b(-4)];
                      if (148 != var6) {
                        break L14;
                      } else {
                        nh.field_E.a(-1 + var5.field_e, 8360, -1 + var5.field_g);
                        break L14;
                      }
                    }
                    L15: {
                      if (157 != var6) {
                        break L15;
                      } else {
                        nh.field_E.a(-2 + var5.field_e, 8360, var5.field_g + -2);
                        break L15;
                      }
                    }
                    var5.field_g = var5.field_g + 1;
                    continue L13;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0, byte param1, boolean param2, int param3, ji param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_29_0 = 0;
        w stackIn_38_0 = null;
        w stackIn_39_0 = null;
        w stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        w stackIn_48_0 = null;
        w stackIn_49_0 = null;
        w stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        w stackOut_47_0 = null;
        w stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        w stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        w stackOut_37_0 = null;
        w stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        w stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          if (!((kd) this).field_x) {
            break L0;
          } else {
            if (param2) {
              L1: {
                if (0 < ((kd) this).field_w) {
                  L2: {
                    if (null != ((kd) this).field_p) {
                      ((kd) this).field_F.e(4491);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((kd) this).field_p = param4;
                  if (param4 != null) {
                    ((kd) this).field_F.a(false, (byte) 20, param4);
                    this.a(param3, ((kd) this).field_F, (byte) 38, param5);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (null == ((kd) this).field_u) {
                      break L3;
                    } else {
                      ((kd) this).field_C.e(4491);
                      break L3;
                    }
                  }
                  ((kd) this).field_u = param4;
                  if (param4 != null) {
                    ((kd) this).field_C.a(false, (byte) 28, param4);
                    this.a(param3, ((kd) this).field_C, (byte) 38, param5);
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param2) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L4;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L4;
          }
        }
        ((kd) this).field_x = stackIn_19_1 != 0;
        if (param4 == ((kd) this).field_p) {
          ((kd) this).field_w = param0;
          this.a(param3, ((kd) this).field_F, (byte) 38, param5);
          return;
        } else {
          if (((kd) this).field_u != param4) {
            L5: {
              if (null != ((kd) this).field_p) {
                if (((kd) this).field_u == null) {
                  var7 = 0;
                  break L5;
                } else {
                  L6: {
                    if (524288 <= ((kd) this).field_s) {
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L6;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      break L6;
                    }
                  }
                  var7 = stackIn_29_0;
                  break L5;
                }
              } else {
                var7 = 1;
                break L5;
              }
            }
            L7: {
              if (var7 == 0) {
                L8: {
                  if (((kd) this).field_u != null) {
                    ((kd) this).field_C.e(4491);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((kd) this).field_u = param4;
                  if (param4 != null) {
                    L10: {
                      stackOut_47_0 = ((kd) this).field_C;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_48_0 = stackOut_47_0;
                      if (param2) {
                        stackOut_49_0 = (w) (Object) stackIn_49_0;
                        stackOut_49_1 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        break L10;
                      } else {
                        stackOut_48_0 = (w) (Object) stackIn_48_0;
                        stackOut_48_1 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        break L10;
                      }
                    }
                    ((w) (Object) stackIn_50_0).a(stackIn_50_1 != 0, (byte) 40, param4);
                    this.a(param3, ((kd) this).field_C, (byte) 38, param5);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((kd) this).field_w = -param0;
                break L7;
              } else {
                L11: {
                  if (((kd) this).field_p != null) {
                    ((kd) this).field_F.e(4491);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  ((kd) this).field_p = param4;
                  if (param4 != null) {
                    L13: {
                      stackOut_37_0 = ((kd) this).field_F;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_38_0 = stackOut_37_0;
                      if (param2) {
                        stackOut_39_0 = (w) (Object) stackIn_39_0;
                        stackOut_39_1 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        break L13;
                      } else {
                        stackOut_38_0 = (w) (Object) stackIn_38_0;
                        stackOut_38_1 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        break L13;
                      }
                    }
                    ((w) (Object) stackIn_40_0).a(stackIn_40_1 != 0, (byte) 116, param4);
                    this.a(param3, ((kd) this).field_F, (byte) 38, param5);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                ((kd) this).field_w = param0;
                break L7;
              }
            }
            var8 = -111 / ((param1 - -45) / 34);
            return;
          } else {
            ((kd) this).field_w = -param0;
            this.a(param3, ((kd) this).field_C, (byte) 38, param5);
            return;
          }
        }
    }

    final synchronized void a(int param0, boolean param1) {
        ((kd) this).field_z = param0;
        if (!param1) {
            ((kd) this).field_x = false;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_30_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        if (0 >= ((kd) this).field_z) {
          ((kd) this).c(param2);
          return;
        } else {
          L0: {
            if (!((kd) this).field_x) {
              break L0;
            } else {
              L1: {
                if (((kd) this).field_w >= -1) {
                  break L1;
                } else {
                  if (!((kd) this).field_F.f(323697071)) {
                    ((kd) this).field_w = -((kd) this).field_w;
                    ((kd) this).field_p = null;
                    ((kd) this).field_x = false;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (-1 <= ((kd) this).field_w) {
                break L0;
              } else {
                if (((kd) this).field_C.f(323697071)) {
                  break L0;
                } else {
                  ((kd) this).field_u = null;
                  ((kd) this).field_w = -((kd) this).field_w;
                  ((kd) this).field_x = false;
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = (((kd) this).field_s >> 1190818924) * ((kd) this).field_z / 256;
            var5 = -var4 + ((kd) this).field_z;
            if (((kd) this).field_w != 0) {
              ((kd) this).field_s = ((kd) this).field_s + ((kd) this).field_w * param2;
              if (1048576 > ((kd) this).field_s) {
                if ((((kd) this).field_s ^ -1) >= -1) {
                  ((kd) this).field_s = 0;
                  if (((kd) this).field_x) {
                    break L2;
                  } else {
                    ((kd) this).field_w = 0;
                    if (((kd) this).field_l) {
                      break L2;
                    } else {
                      L3: {
                        if (null == ((kd) this).field_p) {
                          break L3;
                        } else {
                          ((kd) this).field_F.e(4491);
                          break L3;
                        }
                      }
                      ((kd) this).field_p = null;
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                ((kd) this).field_s = 1048576;
                if (((kd) this).field_x) {
                  break L2;
                } else {
                  ((kd) this).field_w = 0;
                  if (!((kd) this).field_l) {
                    L4: {
                      if (null == ((kd) this).field_u) {
                        break L4;
                      } else {
                        ((kd) this).field_C.e(4491);
                        break L4;
                      }
                    }
                    ((kd) this).field_u = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (!ug.field_b) {
              stackOut_29_0 = param2;
              stackIn_30_0 = stackOut_29_0;
              break L5;
            } else {
              stackOut_28_0 = param2 << 1773409153;
              stackIn_30_0 = stackOut_28_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_30_0;
            if (256 <= ((kd) this).field_r) {
              break L6;
            } else {
              L7: {
                if (null != ((kd) this).field_p) {
                  break L7;
                } else {
                  if (null == ((kd) this).field_u) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (-257 != (var4 ^ -1)) {
                if ((var5 ^ -1) != -257) {
                  L8: {
                    L9: {
                      if (null == ((kd) this).field_m) {
                        break L9;
                      } else {
                        if (var6 <= ((kd) this).field_m.length) {
                          kf.a(((kd) this).field_m, 0, var6);
                          kf.a(((kd) this).field_o, 0, var6);
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((kd) this).field_o = new int[var6];
                    ((kd) this).field_m = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((kd) this).field_F.b(((kd) this).field_m, 0, param2);
                    ((kd) this).field_C.b(((kd) this).field_o, 0, param2);
                    if (ug.field_b) {
                      param1 = param1 << 1;
                      stackOut_45_0 = param1 << 1;
                      stackIn_46_0 = stackOut_45_0;
                      break L10;
                    } else {
                      stackOut_44_0 = param1;
                      stackIn_46_0 = stackOut_44_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_46_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= var6) {
                      break L6;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (((kd) this).field_m[var8] * var4 + var5 * ((kd) this).field_o[var8] >> -567037688);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((kd) this).field_C.b(param0, param1, param2);
                  break L6;
                }
              } else {
                ((kd) this).field_F.b(param0, param1, param2);
                break L6;
              }
            }
          }
          L12: {
            if (null == ((kd) this).field_B) {
              break L12;
            } else {
              if (((kd) this).field_r != 0) {
                L13: {
                  L14: {
                    if (null == ((kd) this).field_m) {
                      break L14;
                    } else {
                      if (((kd) this).field_m.length >= var6) {
                        kf.a(((kd) this).field_m, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((kd) this).field_o = new int[var6];
                  ((kd) this).field_m = new int[var6];
                  break L13;
                }
                L15: {
                  ((kd) this).field_n.b(((kd) this).field_m, 0, param2);
                  if (ug.field_b) {
                    param1 = param1 << 1;
                    stackOut_59_0 = param1 << 1;
                    stackIn_60_0 = stackOut_59_0;
                    break L15;
                  } else {
                    stackOut_58_0 = param1;
                    stackIn_60_0 = stackOut_58_0;
                    break L15;
                  }
                }
                var7 = stackIn_60_0;
                var8 = ((kd) this).field_z * ((kd) this).field_r / 256;
                var9 = ((kd) this).field_z - var8;
                var10 = 0;
                L16: while (true) {
                  if (var6 <= var10) {
                    break L12;
                  } else {
                    param0[var7 - -var10] = var9 * param0[var10 + var7] + var8 * ((kd) this).field_m[var10] >> 190320616;
                    var10++;
                    continue L16;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          return;
        }
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -76) {
          L0: {
            L1: {
              if (ie.field_c == null) {
                break L1;
              } else {
                if (!ie.field_c.b(28433)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final tj b() {
        return null;
    }

    final tj d() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final synchronized void c(int param0) {
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (((kd) this).field_s <= 0) {
            break L0;
          } else {
            if (((kd) this).field_p == null) {
              break L0;
            } else {
              ((kd) this).field_F.c(param0);
              break L0;
            }
          }
        }
        L1: {
          if (1048576 <= ((kd) this).field_s) {
            break L1;
          } else {
            if (null != ((kd) this).field_u) {
              ((kd) this).field_C.c(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((kd) this).field_r <= 0) {
            break L2;
          } else {
            if (((kd) this).field_B != null) {
              ((kd) this).field_n.c(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!((kd) this).field_x) {
            break L3;
          } else {
            L4: {
              if (((kd) this).field_w >= -1) {
                break L4;
              } else {
                if (!((kd) this).field_F.f(323697071)) {
                  ((kd) this).field_w = -((kd) this).field_w;
                  ((kd) this).field_x = false;
                  ((kd) this).field_p = null;
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            if (-1 <= ((kd) this).field_w) {
              break L3;
            } else {
              if (!((kd) this).field_C.f(323697071)) {
                ((kd) this).field_x = false;
                ((kd) this).field_u = null;
                ((kd) this).field_w = -((kd) this).field_w;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (0 != ((kd) this).field_w) {
            ((kd) this).field_s = ((kd) this).field_s + ((kd) this).field_w * param0;
            if (1048576 > ((kd) this).field_s) {
              if (0 < ((kd) this).field_s) {
                break L5;
              } else {
                ((kd) this).field_s = 0;
                if (!((kd) this).field_x) {
                  ((kd) this).field_w = 0;
                  if (!((kd) this).field_l) {
                    L6: {
                      if (null == ((kd) this).field_p) {
                        break L6;
                      } else {
                        ((kd) this).field_F.e(4491);
                        break L6;
                      }
                    }
                    ((kd) this).field_p = null;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            } else {
              ((kd) this).field_s = 1048576;
              if (!((kd) this).field_x) {
                ((kd) this).field_w = 0;
                if (!((kd) this).field_l) {
                  L7: {
                    if (null == ((kd) this).field_u) {
                      break L7;
                    } else {
                      ((kd) this).field_C.e(4491);
                      break L7;
                    }
                  }
                  ((kd) this).field_u = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          } else {
            break L5;
          }
        }
    }

    public static void c(byte param0) {
        field_G = null;
        if (param0 != -13) {
            return;
        }
        field_y = null;
        field_E = null;
        field_v = null;
        field_D = null;
        field_A = null;
    }

    final boolean a(ji param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 >= 2) {
            break L0;
          } else {
            field_D = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 == ((kd) this).field_p) {
              break L2;
            } else {
              if (((kd) this).field_u != param0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    kd(w param0, w param1, w param2) {
        ((kd) this).field_r = 0;
        ((kd) this).field_z = 256;
        ((kd) this).field_l = false;
        this.a(-9, param1, param0);
        ((kd) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_D = new long[256];
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            field_G = new nd(7, 0, 1, 1);
            field_t = false;
            field_E = "I need to plant these charges to stop the influx of critters.";
            field_A = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                field_D[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((1L & var0) == 1L) {
                  var0 = -3932672073523589310L ^ var0 >>> 741565185;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
