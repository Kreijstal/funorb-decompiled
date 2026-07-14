/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static int[] field_e;
    static boolean[] field_w;
    wm field_v;
    static int field_x;
    String field_f;
    static gk field_c;
    static String field_n;
    static int field_a;
    static int field_r;
    ai[] field_h;
    wm field_p;
    static volatile long field_z;
    wm field_j;
    private wm field_d;
    int field_i;
    int field_B;
    int field_g;
    int field_y;
    int field_t;
    hb field_u;
    int field_k;
    hb[] field_A;
    private int field_s;
    int field_q;
    int field_l;
    int field_o;
    private wm field_b;
    wm field_m;

    pj(ec param0, boolean param1) {
        this();
        this.a(111, param1, param0);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        Object var12 = null;
        ai var13 = null;
        ai var14 = null;
        ai var15 = null;
        ai var16 = null;
        ai var17 = null;
        ai var18 = null;
        ai var19 = null;
        ai var20 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var11 = DungeonAssault.field_K;
        if (param1 < -1) {
          L0: {
            if (-7 >= param2) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var4 = stackIn_5_0;
            if (param0 == -3) {
              break L1;
            } else {
              var12 = null;
              mo discarded$1 = this.a(-113, (ai) null, (byte) -64, true);
              break L1;
            }
          }
          L2: {
            if (param2 >= 42) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L2;
            }
          }
          L3: {
            var5 = stackIn_10_0;
            if (param2 % 7 == 0) {
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L3;
            } else {
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          L4: {
            var6 = stackIn_13_0;
            if ((param2 % 7 ^ -1) == -7) {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L4;
            } else {
              stackOut_14_0 = 1;
              stackIn_16_0 = stackOut_14_0;
              break L4;
            }
          }
          L5: {
            var7 = stackIn_16_0;
            if (var4 == 0) {
              break L5;
            } else {
              if (var6 != 0) {
                var8 = param2 - 8;
                var9 = param1;
                if (!((pj) this).field_j.a(var8, (byte) 79)) {
                  var13 = ((pj) this).field_h[var8];
                  if (var13.field_h == null) {
                    break L5;
                  } else {
                    if (2 != var13.field_h.field_g) {
                      break L5;
                    } else {
                      var13.field_q = var13.field_q + var9;
                      break L5;
                    }
                  }
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (var4 == 0) {
              break L6;
            } else {
              var8 = param2 + -7;
              var9 = param1;
              if (!((pj) this).field_j.a(var8, (byte) 78)) {
                var14 = ((pj) this).field_h[var8];
                if (null == var14.field_h) {
                  break L6;
                } else {
                  if (-3 == (var14.field_h.field_g ^ -1)) {
                    var14.field_q = var14.field_q + var9;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              } else {
                break L6;
              }
            }
          }
          L7: {
            if (var4 == 0) {
              break L7;
            } else {
              if (var7 == 0) {
                break L7;
              } else {
                var8 = -6 + param2;
                var9 = param1;
                if (((pj) this).field_j.a(var8, (byte) 90)) {
                  break L7;
                } else {
                  var15 = ((pj) this).field_h[var8];
                  if (var15.field_h == null) {
                    break L7;
                  } else {
                    if (2 == var15.field_h.field_g) {
                      var15.field_q = var15.field_q + var9;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
          }
          L8: {
            if (var6 != 0) {
              var8 = param2 + -1;
              var9 = param1;
              if (((pj) this).field_j.a(var8, (byte) 110)) {
                break L8;
              } else {
                var16 = ((pj) this).field_h[var8];
                if (var16.field_h == null) {
                  break L8;
                } else {
                  if ((var16.field_h.field_g ^ -1) == -3) {
                    var16.field_q = var16.field_q + var9;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            } else {
              break L8;
            }
          }
          L9: {
            if (var7 == 0) {
              break L9;
            } else {
              var8 = param2 + 1;
              var9 = param1;
              if (!((pj) this).field_j.a(var8, (byte) 124)) {
                var17 = ((pj) this).field_h[var8];
                if (null == var17.field_h) {
                  break L9;
                } else {
                  if (2 == var17.field_h.field_g) {
                    var17.field_q = var17.field_q + var9;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          L10: {
            if (var5 == 0) {
              break L10;
            } else {
              if (var6 != 0) {
                var8 = param2 - -6;
                var9 = param1;
                if (!((pj) this).field_j.a(var8, (byte) 82)) {
                  var18 = ((pj) this).field_h[var8];
                  if (null == var18.field_h) {
                    break L10;
                  } else {
                    if (var18.field_h.field_g != 2) {
                      break L10;
                    } else {
                      var18.field_q = var18.field_q + var9;
                      break L10;
                    }
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
          }
          L11: {
            if (var5 == 0) {
              break L11;
            } else {
              var8 = 7 + param2;
              var9 = param1;
              if (!((pj) this).field_j.a(var8, (byte) 117)) {
                var19 = ((pj) this).field_h[var8];
                if (var19.field_h == null) {
                  break L11;
                } else {
                  if ((var19.field_h.field_g ^ -1) != -3) {
                    break L11;
                  } else {
                    var19.field_q = var19.field_q + var9;
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
          }
          L12: {
            if (var5 == 0) {
              break L12;
            } else {
              if (var7 == 0) {
                break L12;
              } else {
                var8 = 8 + param2;
                var9 = param1;
                if (!((pj) this).field_j.a(var8, (byte) 115)) {
                  var20 = ((pj) this).field_h[var8];
                  if (var20.field_h == null) {
                    break L12;
                  } else {
                    if (2 == var20.field_h.field_g) {
                      var20.field_q = var20.field_q + var9;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1) {
        hb[] var3 = null;
        int var4 = 0;
        hb var5 = null;
        int var6 = 0;
        hb[] var7 = null;
        L0: {
          var6 = DungeonAssault.field_K;
          ((pj) this).a(false, 128);
          if (param0 == 32768) {
            break L0;
          } else {
            field_r = -77;
            break L0;
          }
        }
        L1: {
          ((pj) this).field_g = param1;
          if (-2 != (((pj) this).field_g ^ -1)) {
            var7 = ((pj) this).field_A;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L1;
              } else {
                var5 = var7[var4];
                if (var5 != null) {
                  if (var5.field_n.a(ob.field_ec, param0 ^ 32863)) {
                    var5.a(false);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    final mo b(byte param0, int param1) {
        ai var3 = null;
        ac var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ai var9 = null;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        if (null != ((pj) this).field_u) {
          if (0 == (2 & ((pj) this).field_u.field_o)) {
            if ((((pj) this).field_u.field_o & 4) == 0) {
              L0: {
                var9 = ((pj) this).field_h[((pj) this).field_B];
                var3 = var9;
                var4 = var9.field_h;
                var6 = 70 % ((param0 - -23) / 40);
                var5 = ((pj) this).field_u.field_k;
                if (-1 != (2 & ((pj) this).field_u.field_d ^ -1)) {
                  var5 = var5 << 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                var5 = var5 - ((pj) this).field_i;
                if (0 <= var5) {
                  break L1;
                } else {
                  var5 = 0;
                  break L1;
                }
              }
              L2: {
                if (!var4.a((byte) -59, 13)) {
                  break L2;
                } else {
                  ((pj) this).a(false);
                  break L2;
                }
              }
              L3: {
                if (var4.a((byte) -77, 14)) {
                  var3.field_i = this.a(var9.field_p, (byte) 124, ((pj) this).field_u.field_g);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (1 != var9.field_h.field_g) {
                if (var9.field_h.field_g != 2) {
                  if ((var9.field_h.field_g ^ -1) != -4) {
                    throw new IllegalStateException("Can't enter combat in special room");
                  } else {
                    if (var4.a((byte) -53, 10)) {
                      if (this.a(var9.field_r, (byte) 124, ((pj) this).field_u.field_f)) {
                        ((pj) this).a(false);
                        return new mo(66, 36864);
                      } else {
                        ((pj) this).a(true, 116, ((pj) this).field_B);
                        ((pj) this).d(27);
                        return new mo(66, 0);
                      }
                    } else {
                      if (!this.a(var9.field_q, (byte) 125, var5)) {
                        ((pj) this).a(((pj) this).field_B, true, -12331);
                        ((pj) this).d(105);
                        return new mo(66, 0);
                      } else {
                        ((pj) this).a(false);
                        return new mo(66, 36864);
                      }
                    }
                  }
                } else {
                  L4: {
                    if (!this.a(var5, (byte) 126, var9.field_q)) {
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      break L4;
                    } else {
                      stackOut_32_0 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_34_0;
                    if (var7 != 0) {
                      ((pj) this).a(((pj) this).field_B, true, -12331);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (!var4.a((byte) -125, 3)) {
                      break L6;
                    } else {
                      if (var7 != 0) {
                        break L6;
                      } else {
                        L7: {
                          if (!this.a(var9.field_r, (byte) 126, ((pj) this).field_u.field_f)) {
                            L8: {
                              ((pj) this).d(2);
                              if (0 != (4 & ((pj) this).field_u.field_o)) {
                                stackOut_43_0 = 2048;
                                stackIn_44_0 = stackOut_43_0;
                                break L8;
                              } else {
                                stackOut_42_0 = 0;
                                stackIn_44_0 = stackOut_42_0;
                                break L8;
                              }
                            }
                            var8 = stackIn_44_0;
                            break L7;
                          } else {
                            ((pj) this).a(false);
                            var8 = 4096;
                            break L7;
                          }
                        }
                        L9: {
                          if (var7 != 0) {
                            var8 = var8 | 16384;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return new mo(66, var8);
                      }
                    }
                  }
                  L10: {
                    if (!var4.a((byte) -44, 15)) {
                      break L10;
                    } else {
                      if (var7 != 0) {
                        break L10;
                      } else {
                        ((pj) this).b(-111);
                        ((pj) this).a(false, 32);
                        ((pj) this).a(false, 8);
                        return new mo(66, 0);
                      }
                    }
                  }
                  return this.a(var7 != 0, var9, param1, (byte) 98);
                }
              } else {
                L11: {
                  if (!((pj) this).field_u.field_n.a(ob.field_hc, -67)) {
                    break L11;
                  } else {
                    if (var4.a((byte) -68, 11)) {
                      ((pj) this).a(false);
                      return new mo(66, 36864);
                    } else {
                      break L11;
                    }
                  }
                }
                if (this.a(var9.field_q, (byte) 126, var5)) {
                  ((pj) this).a(false);
                  return new mo(66, 36864);
                } else {
                  ((pj) this).a(((pj) this).field_B, true, -12331);
                  if (this.a(var9.field_r, (byte) 126, ((pj) this).field_u.field_f)) {
                    ((pj) this).a(false);
                    return new mo(66, 20480);
                  } else {
                    ((pj) this).d(116);
                    var7 = 0;
                    if (0 != (((pj) this).field_u.field_o & 4)) {
                      return new mo(66, 2048 | var7);
                    } else {
                      return new mo(66, 0 | var7);
                    }
                  }
                }
              }
            } else {
              throw new IllegalStateException("Combat raider is dead.");
            }
          } else {
            throw new IllegalStateException("Combat raider is incapacitated.");
          }
        } else {
          throw new IllegalStateException("Combat raider is null");
        }
    }

    private final void a(wm param0, ec param1, int param2) {
        param0.field_f[0] = param1.f(param2 + 22957);
        param0.field_f[1] = param1.k(0);
        int var4 = param1.c(true);
        param0.field_f[1] = mp.a(param0.field_f[1], nb.a(var4 << -2030817616, 65536));
        param0.field_f[0] = mp.a(param0.field_f[0], nb.a(254, var4) << 1731463288);
        if (param2 != -23082) {
            ((pj) this).field_t = -3;
        }
    }

    private final void a(hb param0, int param1) {
        int var3 = 0;
        hb[] var4 = null;
        int var5 = 0;
        hb var6 = null;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          if (((pj) this).field_k != 128) {
            var3 = 0;
            var4 = ((pj) this).field_A;
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var4.length <= var5) {
                  break L2;
                } else {
                  var6 = var4[var5];
                  if (var6 != null) {
                    if (0 == (6 & var6.field_o)) {
                      var3 = 1;
                      break L2;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              if (var3 == 0) {
                ((pj) this).a(32768, 4);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param1 == 6) {
            break L3;
          } else {
            boolean discarded$1 = this.a(67, (byte) -109, -29);
            break L3;
          }
        }
    }

    private final void a(int param0, boolean param1, ec param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        hb stackIn_22_1 = null;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        hb stackOut_21_1 = null;
        Object stackOut_20_0 = null;
        Object stackOut_20_1 = null;
        var5 = DungeonAssault.field_K;
        this.a(105, param2, ((pj) this).field_v);
        ((pj) this).field_h[48] = new ai(3);
        ((pj) this).field_h[42] = new ai(3);
        ((pj) this).field_h[6] = new ai(3);
        ((pj) this).field_h[0] = new ai(3);
        ((pj) this).field_h[24] = new ai(2);
        var4 = 0;
        L0: while (true) {
          if (49 <= var4) {
            this.a(((pj) this).field_p, param2, -23082);
            this.a(((pj) this).field_j, param2, -23082);
            ((pj) this).field_q = param2.a((byte) 2);
            ((pj) this).field_B = param2.a((byte) 2);
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -5) {
                L2: {
                  if (param0 >= 57) {
                    break L2;
                  } else {
                    ((pj) this).field_y = 110;
                    break L2;
                  }
                }
                L3: {
                  var4 = param2.c(true);
                  stackOut_19_0 = this;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (4 > var4) {
                    stackOut_21_0 = this;
                    stackOut_21_1 = ((pj) this).field_A[var4];
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L3;
                  } else {
                    stackOut_20_0 = this;
                    stackOut_20_1 = null;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = (hb) (Object) stackOut_20_1;
                    break L3;
                  }
                }
                L4: {
                  ((pj) this).field_u = stackIn_22_1;
                  ((pj) this).field_g = param2.c(true);
                  ((pj) this).a(false, param2.c(true));
                  ((pj) this).field_t = param2.c(true);
                  ((pj) this).field_s = param2.c(true);
                  if (param1) {
                    ((pj) this).field_f = param2.a(-21030);
                    break L4;
                  } else {
                    ((pj) this).field_o = param2.f(-110);
                    ((pj) this).field_y = param2.f(-94);
                    ((pj) this).field_l = param2.f(-107);
                    this.a(((pj) this).field_d, param2, -23082);
                    break L4;
                  }
                }
                L5: {
                  if (((pj) this).field_q == -1) {
                    break L5;
                  } else {
                    this.a(((pj) this).field_q, (byte) 107);
                    break L5;
                  }
                }
                return;
              } else {
                ((pj) this).field_A[var4] = ep.a(var4, -1, param2);
                var4++;
                continue L1;
              }
            }
          } else {
            if (0 != var4) {
              if (var4 != 6) {
                if (var4 != 24) {
                  if ((var4 ^ -1) != -43) {
                    if (var4 != 48) {
                      ((pj) this).field_h[var4] = bl.a(param1, param2, false);
                      var4++;
                      continue L0;
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
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 >= 123) {
          if (param2 != 0) {
            if (0 != param0) {
              var4 = param2 + -param0;
              if (9 >= var4) {
                if (0 <= var4) {
                  if (var4 <= 10) {
                    L0: {
                      var4 = 1 << var4;
                      if (oi.b(0, 1 + var4) == 0) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L0;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        break L0;
                      }
                    }
                    return stackIn_22_0 != 0;
                  } else {
                    return true;
                  }
                } else {
                  L1: {
                    var4 = 1 << -var4;
                    if (-1 != oi.b(0, 1 + var4)) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L1;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L1;
                    }
                  }
                  return stackIn_16_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            L2: {
              L3: {
                if (param0 != 0) {
                  break L3;
                } else {
                  if (oi.b(0, 2) != 0) {
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            return stackIn_7_0 != 0;
          }
        } else {
          return false;
        }
    }

    private final mo a(boolean param0, ai param1, int param2, byte param3) {
        int var5 = 0;
        h var6 = null;
        int var7 = 0;
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
        Object var19 = null;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var18 = DungeonAssault.field_K;
          if (param0) {
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
          var5 = stackIn_3_0;
          var6 = ((pj) this).field_u.field_n;
          if (!var6.a(ob.field_Ob, param3 + -223)) {
            break L1;
          } else {
            var5 = 1;
            break L1;
          }
        }
        L2: {
          if ((param2 ^ -1) == -3) {
            var5 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var7 = 0;
          var8 = param1.field_h.a(0, 17);
          var9 = ((pj) this).field_u.field_g;
          if (param3 == 98) {
            break L3;
          } else {
            var19 = null;
            this.a((hb) null, -125);
            break L3;
          }
        }
        L4: {
          var10 = ((pj) this).field_u.field_e;
          var11 = param1.field_p;
          var12 = param1.field_g;
          if (-1 == (1 & ((pj) this).field_u.field_d ^ -1)) {
            break L4;
          } else {
            var9 = var9 << 1;
            break L4;
          }
        }
        L5: {
          if ((1 & ((pj) this).field_t) == 0) {
            if (-1 != (((pj) this).field_u.field_d & 4 ^ -1)) {
              stackOut_16_0 = 1;
              stackIn_18_0 = stackOut_16_0;
              break L5;
            } else {
              stackOut_15_0 = 0;
              stackIn_18_0 = stackOut_15_0;
              break L5;
            }
          } else {
            stackOut_13_0 = 1;
            stackIn_18_0 = stackOut_13_0;
            break L5;
          }
        }
        L6: {
          var13 = stackIn_18_0;
          stackOut_18_0 = var13;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if ((param1.field_h.field_g ^ -1) != -3) {
            stackOut_20_0 = stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L6;
          } else {
            stackOut_19_0 = stackIn_19_0;
            stackOut_19_1 = 1;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L6;
          }
        }
        L7: {
          var13 = stackIn_21_0 & stackIn_21_1;
          if (var13 != 0) {
            var12 = var12 + 1 >> 1358032929;
            var11 = var11 - -1 >> 1632763265;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var11 = var11 - ((pj) this).field_i;
          if (var11 >= 0) {
            break L8;
          } else {
            var11 = 0;
            break L8;
          }
        }
        L9: {
          if (!param1.field_h.a((byte) -115, 7)) {
            break L9;
          } else {
            if (var9 << -262363711 > var11) {
              break L9;
            } else {
              ((pj) this).a(param3 + 32670, 3);
              return new mo(66, 32768);
            }
          }
        }
        L10: {
          if (!param0) {
            stackOut_31_0 = 0;
            stackIn_32_0 = stackOut_31_0;
            break L10;
          } else {
            stackOut_30_0 = 16384;
            stackIn_32_0 = stackOut_30_0;
            break L10;
          }
        }
        L11: {
          var14 = stackIn_32_0;
          if (var5 != 0) {
            var14 = var14 | 8192;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (2 != param2) {
            break L12;
          } else {
            var14 = var14 | 32768;
            break L12;
          }
        }
        L13: {
          if (-2 != param2) {
            break L13;
          } else {
            var10++;
            var9--;
            break L13;
          }
        }
        var15 = 0;
        L14: while (true) {
          L15: {
            L16: {
              var15++;
              if (var5 != 0) {
                L17: {
                  if (-3 != param2) {
                    stackOut_44_0 = var10;
                    stackIn_45_0 = stackOut_44_0;
                    break L17;
                  } else {
                    stackOut_43_0 = ((pj) this).field_u.field_f;
                    stackIn_45_0 = stackOut_43_0;
                    break L17;
                  }
                }
                L18: {
                  var16 = stackIn_45_0;
                  if (param2 != 2) {
                    stackOut_47_0 = var12;
                    stackIn_48_0 = stackOut_47_0;
                    break L18;
                  } else {
                    stackOut_46_0 = param1.field_r;
                    stackIn_48_0 = stackOut_46_0;
                    break L18;
                  }
                }
                L19: {
                  var17 = stackIn_48_0;
                  if (param2 != 2) {
                    if (!var6.a(ob.field_jc, 87)) {
                      break L19;
                    } else {
                      if (var7 == 0) {
                        var16 = var16 << 1;
                        var14 = var14 | 1024;
                        var7 = 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                L20: {
                  L21: {
                    if (this.a(var17, (byte) 124, var16)) {
                      break L21;
                    } else {
                      if (-101 > (var15 ^ -1)) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (2 != param2) {
                    if (0 < var8) {
                      var14 = var14 | 512;
                      var8--;
                      break L20;
                    } else {
                      ((pj) this).a(false);
                      var14 = var14 | 4096;
                      break L15;
                    }
                  } else {
                    ((pj) this).a(-8);
                    var14 = var14 | 4096;
                    break L15;
                  }
                }
                L22: {
                  L23: {
                    if (0 != var16) {
                      break L23;
                    } else {
                      if (var17 != -1) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  if (var17 <= 10 + var16) {
                    break L16;
                  } else {
                    break L22;
                  }
                }
                L24: {
                  L25: {
                    if (-1 != param1.field_p) {
                      break L25;
                    } else {
                      if (0 != ((pj) this).field_u.field_g) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  if (10 + param1.field_p >= ((pj) this).field_u.field_g) {
                    break L16;
                  } else {
                    break L24;
                  }
                }
                L26: {
                  var14 = var14 | 4096;
                  if (2 == param2) {
                    ((pj) this).a(-8);
                    break L26;
                  } else {
                    ((pj) this).a(false);
                    break L26;
                  }
                }
                var15 = 5;
                break L15;
              } else {
                break L16;
              }
            }
            var5 = 1;
            if (!this.a(var9, (byte) 127, var11)) {
              continue L14;
            } else {
              L27: {
                if (!var6.a(ob.field_kc, 87)) {
                  break L27;
                } else {
                  if (((pj) this).field_u.field_o != 0) {
                    break L27;
                  } else {
                    ((pj) this).field_u.field_o = ((pj) this).field_u.field_o | 1;
                    continue L14;
                  }
                }
              }
              L28: {
                if (!var6.a(ob.field_mc, 119)) {
                  break L28;
                } else {
                  if (var7 == 0) {
                    var14 = var14 | 1024;
                    var7 = 1;
                    continue L14;
                  } else {
                    break L28;
                  }
                }
              }
              ((pj) this).d(param3 + -183);
              if ((4 & ((pj) this).field_u.field_o) != 0) {
                var14 = var14 | 2048;
                break L15;
              } else {
                L29: {
                  if (-6 <= (var15 ^ -1)) {
                    break L29;
                  } else {
                    var15 = 5;
                    break L29;
                  }
                }
                return new mo(66, var14 | var15);
              }
            }
          }
          L30: {
            if (-6 <= (var15 ^ -1)) {
              break L30;
            } else {
              var15 = 5;
              break L30;
            }
          }
          return new mo(66, var14 | var15);
        }
    }

    public static void e(int param0) {
        field_c = null;
        field_e = null;
        field_n = null;
        field_w = null;
        if (param0 < 111) {
            pj.a(43, 127L);
        }
    }

    final double b(int param0, int param1, int param2) {
        if (param2 <= 45) {
            return -0.5947890367550314;
        }
        return this.c(param0, ((pj) this).field_y, param1, 2, ((pj) this).field_o);
    }

    final void a(int param0, boolean param1, int param2) {
        ai var4 = ((pj) this).field_h[param0];
        ac var5 = var4.field_h;
        this.e(var5.a(param2 ^ param2, 9), param2 ^ -21561);
        this.a(-3, var5.a(0, 5), param0);
    }

    final void a(boolean param0, int param1) {
        hb[] var3 = null;
        int var4 = 0;
        hb var5 = null;
        int var6 = 0;
        hb[] var7 = null;
        hb[] var8 = null;
        int var9 = 0;
        hb var10 = null;
        L0: {
          var6 = DungeonAssault.field_K;
          ((pj) this).field_k = param1;
          if (32 == ((pj) this).field_k) {
            var7 = ((pj) this).field_A;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                ((pj) this).field_t = 0;
                break L0;
              } else {
                var5 = var7[var4];
                if (var5 != null) {
                  var5.field_d = 0;
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        ((pj) this).field_i = 0;
        if (!param0) {
          var8 = ((pj) this).field_A;
          var3 = var8;
          var9 = 0;
          var4 = var9;
          L2: while (true) {
            if (var9 >= var8.length) {
              return;
            } else {
              var10 = var8[var9];
              if (var10 != null) {
                if (var10.field_n.a(ob.field_gc, -91)) {
                  if (0 == (var10.field_o & 6)) {
                    ((pj) this).field_i = ((pj) this).field_i + 1;
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              } else {
                var9++;
                continue L2;
              }
            }
          }
        } else {
          return;
        }
    }

    final mo b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 18833) {
            ((pj) this).field_t = 19;
        }
        ec var6 = new ec(3);
        var6.i(param3, -128);
        if (this.a(param4, param3, param2 + 18031, param1, param0)) {
            var6.a(6, 16 | this.a((byte) 47));
            ((pj) this).a(32768, 2);
        } else {
            var6.a(6, 0);
            ((pj) this).a(32768, 1);
        }
        return new mo(68, var6);
    }

    final void a(int param0, hb param1) {
        int var3 = 1;
        h var4 = param1.field_n;
        if (var4.a(ob.field_kc, -92)) {
            if (0 == (param1.field_o & 1)) {
                return;
            }
        }
        if (var4.a(ob.field_Vb, 101)) {
            var3 = 0;
        }
        if (var4.a(ob.field_Sb, -88)) {
            if (!((param1.field_g ^ -1) >= -2)) {
                param1.field_g = param1.field_g - 1;
                var3 = 0;
            }
        }
        if (var3 == 0) {
            param1.a(3);
        } else {
            param1.a(false);
        }
        param1.field_o = param1.field_o | 8;
        if (param0 <= 97) {
            ((pj) this).field_g = 87;
        }
        this.a(param1, 6);
    }

    private final int a(int param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        int[] var8 = ((pj) this).a((byte) -107, param0);
        int[] var3 = var8;
        int[] var4 = var8;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (((pj) this).field_q == var6) {
                return ((pj) this).field_q;
            }
        }
        var4 = var8;
        int var9 = 0;
        var5 = var9;
        while (var9 < var4.length) {
            var6 = var4[var9];
            if (((pj) this).field_m.a(var6, (byte) 70)) {
                return var6;
            }
            var9++;
        }
        if (!param1) {
            field_w = null;
        }
        return -1;
    }

    final boolean b(int param0, hb param1) {
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var8 = 0;
        hb[] var9 = null;
        hb var10 = null;
        hb[] var11 = null;
        hb var12 = null;
        hb[] var13 = null;
        hb var14 = null;
        hb[] var15 = null;
        hb var16 = null;
        var8 = DungeonAssault.field_K;
        if (param1 == null) {
          return false;
        } else {
          var3 = param1.field_o;
          var4 = param1.field_n.field_s;
          if ((var4 ^ -1) == 0) {
            return false;
          } else {
            if (param0 == (var3 & 1)) {
              L0: {
                if (0 == (var3 & 6)) {
                  break L0;
                } else {
                  L1: {
                    if (var4 == ob.field_nc) {
                      break L1;
                    } else {
                      if (var4 != ob.field_Ib) {
                        return false;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if ((param1.field_g ^ -1) < -1) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
              if (((pj) this).field_k != 128) {
                L2: {
                  if (((pj) this).field_k != -33) {
                    break L2;
                  } else {
                    if (((pj) this).field_u == param1) {
                      break L2;
                    } else {
                      return false;
                    }
                  }
                }
                if (-1 == (((pj) this).field_k & ob.field_cc[var4])) {
                  return false;
                } else {
                  L3: {
                    if (((pj) this).field_u == param1) {
                      break L3;
                    } else {
                      if (var4 == ob.field_Wb) {
                        return false;
                      } else {
                        if (ob.field_nc == var4) {
                          return false;
                        } else {
                          if (var4 != ob.field_Ib) {
                            if (var4 == ob.field_lc) {
                              return false;
                            } else {
                              if (var4 == ob.field_Gb) {
                                return false;
                              } else {
                                if (ob.field_Ub != var4) {
                                  if (ob.field_Zb == var4) {
                                    return false;
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  return false;
                                }
                              }
                            }
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  if (ob.field_Mb == var4) {
                    var13 = ((pj) this).field_A;
                    var6 = 0;
                    L4: while (true) {
                      if (var13.length <= var6) {
                        return false;
                      } else {
                        var14 = var13[var6];
                        if (var14 != null) {
                          if ((4 & var14.field_o) != 0) {
                            if ((var14.field_g ^ -1) < -1) {
                              return true;
                            } else {
                              var6++;
                              continue L4;
                            }
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (ob.field_lc != var4) {
                        break L5;
                      } else {
                        if (((pj) this).field_h[((pj) this).field_B].field_h.field_g != 1) {
                          break L5;
                        } else {
                          return false;
                        }
                      }
                    }
                    L6: {
                      if (var4 == ob.field_nc) {
                        break L6;
                      } else {
                        if (var4 == ob.field_Ib) {
                          break L6;
                        } else {
                          return true;
                        }
                      }
                    }
                    var15 = ((pj) this).field_A;
                    var6 = 0;
                    L7: while (true) {
                      if (var6 >= var15.length) {
                        return false;
                      } else {
                        var16 = var15[var6];
                        if (var16 != null) {
                          if (-1 == (6 & var16.field_o ^ -1)) {
                            if (var16.field_n.field_z == 0) {
                              return true;
                            } else {
                              if (var4 == ob.field_Ib) {
                                if ((var16.field_n.field_z ^ -1) == -2) {
                                  return true;
                                } else {
                                  var6++;
                                  continue L7;
                                }
                              } else {
                                var6++;
                                continue L7;
                              }
                            }
                          } else {
                            var6++;
                            continue L7;
                          }
                        } else {
                          var6++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                L8: {
                  L9: {
                    if (var4 == ob.field_nc) {
                      break L9;
                    } else {
                      if (ob.field_Ib != var4) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var3 != 12) {
                    break L8;
                  } else {
                    var9 = ((pj) this).field_A;
                    var6 = 0;
                    L10: while (true) {
                      if (var6 >= var9.length) {
                        break L8;
                      } else {
                        var10 = var9[var6];
                        if (var10 != null) {
                          if (-1 == (var10.field_o & 6 ^ -1)) {
                            if (var10.field_n.field_z != 0) {
                              if (var4 == ob.field_Ib) {
                                if (1 == var10.field_n.field_z) {
                                  return true;
                                } else {
                                  var6++;
                                  continue L10;
                                }
                              } else {
                                var6++;
                                continue L10;
                              }
                            } else {
                              return true;
                            }
                          } else {
                            var6++;
                            continue L10;
                          }
                        } else {
                          var6++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (ob.field_Mb != var4) {
                    break L11;
                  } else {
                    if (var3 == 0) {
                      var11 = ((pj) this).field_A;
                      var6 = 0;
                      L12: while (true) {
                        if (var6 >= var11.length) {
                          break L11;
                        } else {
                          var12 = var11[var6];
                          if (var12 != null) {
                            if ((4 & var12.field_o) != 0) {
                              if (var12.field_g > 0) {
                                return true;
                              } else {
                                var6++;
                                continue L12;
                              }
                            } else {
                              var6++;
                              continue L12;
                            }
                          } else {
                            var6++;
                            continue L12;
                          }
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                }
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 36864) {
            break L0;
          } else {
            this.a((byte) 20, -103, true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 < param1) {
              break L2;
            } else {
              if (ha.a((byte) -21) >= this.c(param3, param0, param1, 2, param4)) {
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

    final wm b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        wm var10 = null;
        L0: {
          var8 = DungeonAssault.field_K;
          var10 = new wm(84);
          var3 = 0;
          if (param0 <= -1) {
            break L0;
          } else {
            var9 = null;
            this.a((md) null, -59, -23, 96, true);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= 7) {
            var4 = 0;
            L2: while (true) {
              if (var4 <= -7) {
                return var10;
              } else {
                var5 = 0;
                L3: while (true) {
                  if (-8 <= var5) {
                    var4++;
                    continue L2;
                  } else {
                    var6 = var5 + 7 * var4;
                    var7 = 7 + var6;
                    if (!((pj) this).field_p.a(var6, (byte) 90)) {
                      if (((pj) this).field_p.a(var7, (byte) 80)) {
                        var10.a(var3, -79);
                        var3++;
                        var5++;
                        continue L3;
                      } else {
                        var3++;
                        var5++;
                        continue L3;
                      }
                    } else {
                      var10.a(var3, -79);
                      var3++;
                      var5++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L4: while (true) {
              if (6 <= var5) {
                var4++;
                continue L1;
              } else {
                var6 = var4 * 7 + var5;
                var7 = var6 - -1;
                if (!((pj) this).field_p.a(var6, (byte) 84)) {
                  if (((pj) this).field_p.a(var7, (byte) 120)) {
                    var10.a(var3, -94);
                    var3++;
                    var5++;
                    continue L4;
                  } else {
                    var3++;
                    var5++;
                    continue L4;
                  }
                } else {
                  var10.a(var3, -94);
                  var3++;
                  var5++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ai var6 = null;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        if (param0 > 0) {
          L0: {
            if (param1 == 25618) {
              break L0;
            } else {
              mo discarded$2 = ((pj) this).b(-100, 90, 70, -104, 105);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= 49) {
              return;
            } else {
              var4 = var3;
              var5 = param0;
              if (!((pj) this).field_j.a(var4, (byte) 104)) {
                var6 = ((pj) this).field_h[var4];
                if (null != var6.field_h) {
                  if (-3 == (var6.field_h.field_g ^ -1)) {
                    var6.field_q = var6.field_q + var5;
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final mo c(int param0, int param1) {
        ac var4 = null;
        int var5 = 0;
        int var6 = 0;
        ai var7 = null;
        if (((pj) this).field_u != null) {
          if (0 == (2 & ((pj) this).field_u.field_o)) {
            if ((4 & ((pj) this).field_u.field_o) != 0) {
              throw new IllegalStateException("Combat raider is dead.");
            } else {
              L0: {
                var7 = ((pj) this).field_h[((pj) this).field_B];
                var4 = var7.field_h;
                var5 = ((pj) this).field_u.field_k;
                if ((2 & ((pj) this).field_u.field_d) != 0) {
                  var5 = var5 << 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                var5 = var5 - ((pj) this).field_i;
                if (0 <= var5) {
                  break L1;
                } else {
                  var5 = 0;
                  break L1;
                }
              }
              L2: {
                if (param0 < -86) {
                  break L2;
                } else {
                  field_e = null;
                  break L2;
                }
              }
              if (var7.field_h.field_g != 1) {
                if ((var7.field_h.field_g ^ -1) != -3) {
                  if ((var7.field_h.field_g ^ -1) == -4) {
                    if (!var4.a((byte) -65, 10)) {
                      if (!this.a(var7.field_q, (byte) 127, var5)) {
                        ((pj) this).a(((pj) this).field_B, true, -12331);
                        ((pj) this).d(113);
                        return new mo(66, 0);
                      } else {
                        ((pj) this).a(false);
                        return new mo(66, 36864);
                      }
                    } else {
                      if (!this.a(var7.field_r, (byte) 124, ((pj) this).field_u.field_f)) {
                        ((pj) this).a(true, 123, ((pj) this).field_B);
                        ((pj) this).d(124);
                        return new mo(66, 0);
                      } else {
                        ((pj) this).a(false);
                        return new mo(66, 36864);
                      }
                    }
                  } else {
                    throw new IllegalStateException("Can't enter combat in special room");
                  }
                } else {
                  L3: {
                    var6 = this.a(var5, (byte) 126, var7.field_q) ? 1 : 0;
                    if (var6 != 0) {
                      ((pj) this).a(((pj) this).field_B, true, -12331);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return this.a(param1, var7, (byte) 26, var6 != 0);
                }
              } else {
                L4: {
                  if (!((pj) this).field_u.field_n.a(ob.field_hc, 72)) {
                    break L4;
                  } else {
                    if (!var4.a((byte) -49, 11)) {
                      break L4;
                    } else {
                      ((pj) this).a(false);
                      return new mo(66, 36864);
                    }
                  }
                }
                if (!this.a(((pj) this).field_u.field_f, (byte) 127, var5)) {
                  ((pj) this).a(((pj) this).field_B, true, -12331);
                  ((pj) this).a(false);
                  return new mo(66, 20480);
                } else {
                  ((pj) this).a(false);
                  return new mo(66, 36864);
                }
              }
            }
          } else {
            throw new IllegalStateException("Combat raider is incapacitated.");
          }
        } else {
          throw new IllegalStateException("Combat raider is null");
        }
    }

    final void a(hb param0, boolean param1, int param2) {
        ((pj) this).field_B = this.a(param2, param1);
        if (((pj) this).field_B != -1) {
            ((pj) this).b(-92);
        }
        ((pj) this).field_p.a(param2, -118);
        ((pj) this).field_B = param2;
        ai var5 = ((pj) this).field_h[param2];
        if (0 != var5.field_a) {
            // if_icmpeq L80
        } else {
            ((pj) this).field_j.a(param2, -113);
            ((pj) this).field_d.a(param2, -77);
        }
        if (2 != var5.field_a) {
            // ifne L148
            ((pj) this).a(!param1 ? true : false, 16);
            ((pj) this).field_u = param0;
        } else {
            ((pj) this).b(-113);
            ((pj) this).a(!param1 ? true : false, 8);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        ai var4 = ((pj) this).field_h[param2];
        ac var5 = var4.field_h;
        if (param1 < 112) {
            return;
        }
        this.e(var5.a(0, 8), 25618);
        this.a(-3, var5.a(0, 4), param2);
    }

    final int[] b(int param0, byte param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          var3 = 0;
          if (param0 % 7 != 0) {
            if (((pj) this).field_v.a(param0 + -1 + -(param0 / 7), (byte) 116)) {
              var3++;
              ia.field_S[var3] = param0 + -1 + -(param0 / 7);
              if (param0 % 7 == 6) {
                break L0;
              } else {
                if (!((pj) this).field_v.a(param0 - param0 / 7, (byte) 125)) {
                  break L0;
                } else {
                  var3++;
                  ia.field_S[var3] = -(param0 / 7) + param0;
                  break L0;
                }
              }
            } else {
              if (param0 % 7 == 6) {
                break L0;
              } else {
                if (!((pj) this).field_v.a(param0 - param0 / 7, (byte) 125)) {
                  break L0;
                } else {
                  var3++;
                  ia.field_S[var3] = -(param0 / 7) + param0;
                  break L0;
                }
              }
            }
          } else {
            if (param0 % 7 == 6) {
              break L0;
            } else {
              if (!((pj) this).field_v.a(param0 - param0 / 7, (byte) 125)) {
                break L0;
              } else {
                var3++;
                ia.field_S[var3] = -(param0 / 7) + param0;
                break L0;
              }
            }
          }
        }
        L1: {
          if (6 >= param0) {
            break L1;
          } else {
            if (((pj) this).field_v.a(35 + param0, (byte) 88)) {
              var3++;
              ia.field_S[var3] = 35 + param0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (-43 >= (param0 ^ -1)) {
            break L2;
          } else {
            if (((pj) this).field_v.a(param0 + 42, (byte) 77)) {
              var3++;
              ia.field_S[var3] = param0 + 42;
              break L2;
            } else {
              break L2;
            }
          }
        }
        var4 = new int[var3];
        var5 = 111 % ((param1 - 29) / 45);
        var6 = 0;
        L3: while (true) {
          if (var6 >= var3) {
            return var4;
          } else {
            var4[var6] = ia.field_S[var6];
            var6++;
            continue L3;
          }
        }
    }

    final int c(int param0) {
        int var2 = 0;
        hb[] var3_ref_hb__ = null;
        int var3 = 0;
        int var4 = 0;
        hb var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var2 = 0;
        var3_ref_hb__ = ((pj) this).field_A;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3_ref_hb__.length) {
            L1: {
              if (param0 <= -77) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            L2: {
              var3 = 100 * var2;
              if (var3 > 50000) {
                var3 = 50000;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((pj) this).field_o < var3) {
                var3 = ((pj) this).field_o;
                break L3;
              } else {
                break L3;
              }
            }
            return var3;
          } else {
            var5 = var3_ref_hb__[var4];
            if (var5 != null) {
              if (-1 == (var5.field_o & 6 ^ -1)) {
                var2 = var2 + (var5.field_k + var5.field_e - (-var5.field_g - var5.field_f));
                var4++;
                continue L0;
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
    }

    final int[] a(byte param0, int param1) {
        int var3 = -77 % ((param0 - 41) / 40);
        return nf.a(((pj) this).field_v, param1, (byte) 123);
    }

    private final void a(byte param0, int param1, boolean param2) {
        ac var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        hb[] var9 = null;
        int var10 = 0;
        hb var11 = null;
        int var12 = 0;
        ai var13 = null;
        L0: {
          var12 = DungeonAssault.field_K;
          var13 = ((pj) this).field_h[param1];
          if (param0 == -52) {
            break L0;
          } else {
            pj.e(-22);
            break L0;
          }
        }
        L1: {
          var5 = var13.field_h;
          if (!param2) {
            break L1;
          } else {
            L2: {
              var6 = var5.a(param0 ^ -52, 0);
              var7 = var5.a(0, 1);
              this.a(var7, var6, ((pj) this).field_u, -110);
              if (var5.a((byte) -88, 6)) {
                L3: {
                  if (var13.field_h.field_k << -680996863 <= var13.field_l) {
                    break L3;
                  } else {
                    var13.field_g = var13.field_g + 1;
                    var13.field_l = var13.field_l + 1;
                    break L3;
                  }
                }
                if (var13.field_h.field_A << 553528481 <= var13.field_j) {
                  break L2;
                } else {
                  var13.field_p = var13.field_p + 1;
                  var13.field_j = var13.field_j + 1;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var8 = var5.a(0, 16);
            if ((var8 ^ -1) >= -1) {
              break L1;
            } else {
              var9 = ((pj) this).field_A;
              var10 = 0;
              L4: while (true) {
                if (var10 >= var9.length) {
                  break L1;
                } else {
                  var11 = var9[var10];
                  if (var11 != null) {
                    if (0 == (6 & var11.field_o)) {
                      this.a(var8, var8, var11, param0 ^ 124);
                      var10++;
                      continue L4;
                    } else {
                      var10++;
                      continue L4;
                    }
                  } else {
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        if (-1 != ((pj) this).field_q) {
            if (((pj) this).field_h[((pj) this).field_q].field_h.a((byte) -64, 2)) {
                ((pj) this).field_j.b(((pj) this).field_q, 31);
            }
        }
        if (param0 > -83) {
            return;
        }
        ((pj) this).field_q = ((pj) this).field_B;
        this.a(((pj) this).field_q, (byte) -90);
    }

    final static void a(int param0, long param1) {
        if ((long)param0 >= param1) {
            return;
        }
        if (param1 % 10L != 0L) {
            ln.a(param1, (byte) -113);
        } else {
            ln.a(param1 - 1L, (byte) -107);
            ln.a(1L, (byte) -73);
        }
    }

    final void a(boolean param0) {
        ((pj) this).field_j.a(((pj) this).field_B, -108);
        ((pj) this).field_d.a(((pj) this).field_B, -72);
        ai var3 = ((pj) this).field_h[((pj) this).field_B];
        ai var2 = var3;
        if (var3.field_l > var3.field_h.field_k) {
            var2.field_l = var3.field_h.field_k;
        }
        if (var3.field_h.field_y < var3.field_s) {
            var2.field_s = var3.field_h.field_y;
        }
        if (var3.field_o > var3.field_h.field_r) {
            var2.field_o = var3.field_h.field_r;
        }
        if (var3.field_h.field_A < var3.field_j) {
            var2.field_j = var3.field_h.field_A;
        }
        ((pj) this).b(-111);
        ((pj) this).a(false, 32);
        ((pj) this).a(param0, 8);
    }

    final void d(int param0) {
        ac var3 = null;
        int var4 = 0;
        h var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        hb[] var9 = null;
        int var10 = 0;
        hb var11 = null;
        int var12 = 0;
        ai var13 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var12 = DungeonAssault.field_K;
        var13 = ((pj) this).field_h[((pj) this).field_B];
        var3 = var13.field_h;
        var4 = var3.field_g;
        var5 = ((pj) this).field_u.field_n;
        if (-4 == (var4 ^ -1)) {
          ((pj) this).b(-106);
          ((pj) this).field_j.a(((pj) this).field_B, -77);
          ((pj) this).field_d.a(((pj) this).field_B, -104);
          ((pj) this).a(false, 32);
          ((pj) this).a(false, 8);
          return;
        } else {
          L0: {
            if (!var13.field_i) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            }
          }
          L1: {
            var6 = stackIn_6_0;
            if (var6 == 0) {
              break L1;
            } else {
              if (var3.a((byte) -77, 12)) {
                break L1;
              } else {
                L2: {
                  if (!var5.a(ob.field_Vb, -100)) {
                    break L2;
                  } else {
                    var6 = 0;
                    break L2;
                  }
                }
                L3: {
                  if (!var5.a(ob.field_kc, -69)) {
                    break L3;
                  } else {
                    if (!var13.field_m) {
                      break L3;
                    } else {
                      if (((pj) this).field_u.field_o == 0) {
                        ((pj) this).field_u.field_o = ((pj) this).field_u.field_o | 1;
                        ((pj) this).a(false);
                        return;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!var5.a(ob.field_Sb, 88)) {
                  break L1;
                } else {
                  if (((pj) this).field_u.field_g > 1) {
                    var6 = 0;
                    ((pj) this).field_u.field_g = ((pj) this).field_u.field_g - 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L4: {
            if (!var5.a(ob.field_Qb, 89)) {
              break L4;
            } else {
              var6 = 1;
              break L4;
            }
          }
          L5: {
            if (var6 == 0) {
              ((pj) this).field_u.a(3);
              break L5;
            } else {
              ((pj) this).field_u.a(false);
              break L5;
            }
          }
          this.a((byte) -52, ((pj) this).field_B, true);
          ((pj) this).field_B = ((pj) this).field_q;
          ((pj) this).a(false, 32);
          var7 = 0;
          var8 = -43 % ((62 - param0) / 32);
          var9 = ((pj) this).field_A;
          var10 = 0;
          L6: while (true) {
            L7: {
              if (var9.length <= var10) {
                break L7;
              } else {
                var11 = var9[var10];
                if (((pj) this).b(0, var11)) {
                  var7 = 1;
                  break L7;
                } else {
                  var10++;
                  continue L6;
                }
              }
            }
            L8: {
              if (var7 == 0) {
                ((pj) this).a(false, 8);
                break L8;
              } else {
                break L8;
              }
            }
            this.a(((pj) this).field_u, 6);
            return;
          }
        }
    }

    final static String a(byte param0, int param1, String param2) {
        if (param0 != 66) {
            Object var4 = null;
            String discarded$0 = pj.a((byte) -8, -92, (String) null);
        }
        param2 = param2 != null ? param2 : ng.field_K;
        if (!mh.a(125, param1)) {
            return param2;
        }
        return ln.a(param1, param2, 255);
    }

    private final mo a(int param0, ai param1, byte param2, boolean param3) {
        int var5 = 0;
        h var6 = null;
        int var7 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var18 = DungeonAssault.field_K;
          if (param3) {
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
          var5 = stackIn_3_0;
          var6 = ((pj) this).field_u.field_n;
          if (!var6.a(ob.field_Ob, 70)) {
            break L1;
          } else {
            var5 = 1;
            break L1;
          }
        }
        L2: {
          if (-3 != (param0 ^ -1)) {
            break L2;
          } else {
            var5 = 0;
            break L2;
          }
        }
        L3: {
          var7 = 0;
          var8 = param1.field_h.a(0, 17);
          var9 = ((pj) this).field_u.field_g;
          var10 = ((pj) this).field_u.field_e;
          var11 = param1.field_p;
          if (param2 >= 16) {
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var12 = param1.field_g;
          if ((1 & ((pj) this).field_u.field_d) == 0) {
            break L4;
          } else {
            var9 = var9 << 1;
            break L4;
          }
        }
        L5: {
          if ((1 & ((pj) this).field_t) == 0) {
            if (-1 != (((pj) this).field_u.field_d & 4 ^ -1)) {
              stackOut_15_0 = 1;
              stackIn_17_0 = stackOut_15_0;
              break L5;
            } else {
              stackOut_14_0 = 0;
              stackIn_17_0 = stackOut_14_0;
              break L5;
            }
          } else {
            stackOut_12_0 = 1;
            stackIn_17_0 = stackOut_12_0;
            break L5;
          }
        }
        L6: {
          var13 = stackIn_17_0;
          stackOut_17_0 = var13;
          stackIn_19_0 = stackOut_17_0;
          stackIn_18_0 = stackOut_17_0;
          if (param1.field_h.field_g != 2) {
            stackOut_19_0 = stackIn_19_0;
            stackOut_19_1 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            break L6;
          } else {
            stackOut_18_0 = stackIn_18_0;
            stackOut_18_1 = 1;
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            break L6;
          }
        }
        L7: {
          var13 = stackIn_20_0 & stackIn_20_1;
          if (var13 == 0) {
            break L7;
          } else {
            var11 = 1 + var11 >> 1220771969;
            var12 = 1 + var12 >> -1734428511;
            break L7;
          }
        }
        L8: {
          var11 = var11 - ((pj) this).field_i;
          if (-1 < (var11 ^ -1)) {
            var11 = 0;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (!param1.field_h.a((byte) -78, 7)) {
            break L9;
          } else {
            if (var9 << -1704265471 <= var11) {
              ((pj) this).a(32768, 3);
              return new mo(66, 32768);
            } else {
              break L9;
            }
          }
        }
        L10: {
          if (param3) {
            stackOut_31_0 = 16384;
            stackIn_32_0 = stackOut_31_0;
            break L10;
          } else {
            stackOut_30_0 = 0;
            stackIn_32_0 = stackOut_30_0;
            break L10;
          }
        }
        L11: {
          var14 = stackIn_32_0;
          if (var5 == 0) {
            break L11;
          } else {
            var14 = var14 | 8192;
            break L11;
          }
        }
        L12: {
          if (param0 == 2) {
            var14 = var14 | 32768;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (param0 != 1) {
            break L13;
          } else {
            var10++;
            var9--;
            break L13;
          }
        }
        var15 = 0;
        L14: while (true) {
          L15: {
            var15++;
            if (var5 != 0) {
              L16: {
                if (param0 != 2) {
                  stackOut_44_0 = var10;
                  stackIn_45_0 = stackOut_44_0;
                  break L16;
                } else {
                  stackOut_43_0 = ((pj) this).field_u.field_f;
                  stackIn_45_0 = stackOut_43_0;
                  break L16;
                }
              }
              L17: {
                var16 = stackIn_45_0;
                if (param0 != 2) {
                  stackOut_47_0 = var12;
                  stackIn_48_0 = stackOut_47_0;
                  break L17;
                } else {
                  stackOut_46_0 = param1.field_r;
                  stackIn_48_0 = stackOut_46_0;
                  break L17;
                }
              }
              L18: {
                var17 = stackIn_48_0;
                if ((param0 ^ -1) != -3) {
                  if (!var6.a(ob.field_jc, 76)) {
                    break L18;
                  } else {
                    if (var7 == 0) {
                      var7 = 1;
                      var16 = var16 << 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                } else {
                  break L18;
                }
              }
              L19: {
                L20: {
                  if (this.a(var17, (byte) 127, var16)) {
                    if (var8 <= 0) {
                      L21: {
                        if ((param0 ^ -1) == -3) {
                          ((pj) this).a(-8);
                          break L21;
                        } else {
                          ((pj) this).a(false);
                          break L21;
                        }
                      }
                      var14 = var14 | 4096;
                      break L19;
                    } else {
                      var8--;
                      break L20;
                    }
                  } else {
                    break L20;
                  }
                }
                if (var17 <= var16 + 5) {
                  break L15;
                } else {
                  L22: {
                    if ((param0 ^ -1) != -3) {
                      ((pj) this).a(false);
                      break L22;
                    } else {
                      ((pj) this).a(-8);
                      break L22;
                    }
                  }
                  var14 = var14 | 4096;
                  var15 = 5;
                  break L19;
                }
              }
              L23: {
                if (var15 <= 5) {
                  break L23;
                } else {
                  var15 = 5;
                  break L23;
                }
              }
              return new mo(66, var14 | var15);
            } else {
              break L15;
            }
          }
          var5 = 1;
          continue L14;
        }
    }

    private final void a(int param0, int param1, hb param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = DungeonAssault.field_K;
          if (param2.field_n.a(ob.field_Ub, 53)) {
            L1: {
              if (param1 <= param2.field_e) {
                param2.field_e = param2.field_e - param1;
                break L1;
              } else {
                param1 = param1 - param2.field_e;
                param0 = param0 + param1;
                param2.field_e = 0;
                break L1;
              }
            }
            if (param2.field_g + -1 < param0) {
              param0 = param0 - (param2.field_g + -1);
              param2.field_g = 1;
              if (param2.field_e >= param0) {
                param2.field_e = param2.field_e - param0;
                break L0;
              } else {
                param2.a(false);
                break L0;
              }
            } else {
              param2.field_g = param2.field_g - param0;
              break L0;
            }
          } else {
            L2: {
              if (param1 < param2.field_e) {
                param2.field_e = param2.field_e - param1;
                break L2;
              } else {
                param2.field_e = 0;
                break L2;
              }
            }
            if (param2.field_g > param0) {
              param2.field_g = param2.field_g - param0;
              break L0;
            } else {
              param2.a(false);
              break L0;
            }
          }
        }
        L3: {
          if (param3 <= -68) {
            break L3;
          } else {
            var7 = null;
            ((pj) this).a((hb) null, false, -72);
            break L3;
          }
        }
    }

    private final void a(int param0, ec param1, wm param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        if (param0 < 96) {
            return;
        }
        for (var4 = 0; param2.field_f.length > var4; var4++) {
            param2.field_f[var4] = param1.h(-50);
        }
    }

    final void a(int param0) {
        ((pj) this).field_B = ((pj) this).field_q;
        ((pj) this).a(false, 32);
        if (param0 != -8) {
            ((pj) this).field_l = 36;
        }
        ((pj) this).a(false, 8);
    }

    final boolean b(int param0, int param1) {
        if (0 == (param0 ^ -1)) {
            return false;
        }
        ai var3 = ((pj) this).field_h[param0];
        if (param1 != 27747) {
            ((pj) this).b(-54);
        }
        if (((pj) this).field_k == 4) {
            return -4 == (var3.field_a ^ -1) ? true : false;
        }
        if (8 != ((pj) this).field_k) {
            if ((((pj) this).field_k ^ -1) != -33) {
                return false;
            }
        }
        return ((pj) this).field_m.a(param0, (byte) 113);
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0 == 47) {
            break L0;
          } else {
            ((pj) this).a(74, -22);
            break L0;
          }
        }
        var2 = 0;
        var3 = 0;
        L1: while (true) {
          if (-5 >= var3) {
            return var2;
          } else {
            if (((pj) this).field_A[var3] != null) {
              if (-1 == (6 & ((pj) this).field_A[var3].field_o)) {
                if (0 == oi.b(0, 3)) {
                  if (!((pj) this).field_A[var3].field_n.a(ob.field_bc, -85)) {
                    ((pj) this).a(param0 + 60, ((pj) this).field_A[var3]);
                    var2 = var2 | 1 << var3;
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        ((pj) this).field_m.a(1);
        ((pj) this).field_b.a(1);
        co.field_I.b(-4);
        co.field_I.a((ne) (Object) new a(param0), false);
        ((pj) this).field_m.a(param0, -63);
        var3 = 116 / ((10 - param1) / 60);
        L0: while (true) {
          if (co.field_I.a((byte) -69)) {
            return;
          } else {
            L1: {
              var4 = ((a) (Object) co.field_I.b((byte) -124)).field_j;
              if (-1 <= (var4 % 7 ^ -1)) {
                break L1;
              } else {
                this.a(co.field_I, 49, var4 + -1, var4 + -1 + -(var4 / 7), true);
                break L1;
              }
            }
            L2: {
              if (6 <= var4 % 7) {
                break L2;
              } else {
                this.a(co.field_I, 49, 1 + var4, -(var4 / 7) + var4, false);
                break L2;
              }
            }
            L3: {
              if (var4 > 6) {
                this.a(co.field_I, 49, var4 - 7, var4 + -7 - -42, false);
                break L3;
              } else {
                break L3;
              }
            }
            if ((var4 ^ -1) > -43) {
              this.a(co.field_I, 49, 7 + var4, var4 + 42, true);
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final int d(int param0, int param1) {
        if (param1 != 30813) {
            int discarded$0 = ((pj) this).d(-124, -104);
        }
        int var3 = 0;
        if (param0 % 7 != 0) {
            if (!(!((pj) this).field_v.a(-(param0 / 7) + -1 + param0, (byte) 75))) {
                var3 = var3 | 1;
            }
        }
        if (-7 != (param0 % 7 ^ -1)) {
            if (((pj) this).field_v.a(param0 - param0 / 7, (byte) 110)) {
                var3 = var3 | 2;
            }
        }
        if (param0 < -7) {
            if (((pj) this).field_v.a(param0 - -35, (byte) 122)) {
                var3 = var3 | 4;
            }
        }
        if (-43 > param0) {
            if (((pj) this).field_v.a(42 + param0, (byte) 102)) {
                var3 = var3 | 8;
            }
        }
        return var3;
    }

    private final double c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        hb var8 = null;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if ((var7 ^ -1) <= -5) {
            L1: {
              if (param3 == 2) {
                break L1;
              } else {
                pj.a(-70, 33L);
                break L1;
              }
            }
            return rm.a((byte) 96, var6, param4, ek.a(((pj) this).field_s, (byte) -127, param0, param1), param2);
          } else {
            var8 = ((pj) this).field_A[var7];
            if (var8 != null) {
              if ((6 & var8.field_o) == 0) {
                if (var8.field_n.a(ob.field_Hb, 75)) {
                  var6++;
                  var7++;
                  continue L0;
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final mo a(hb param0, ec param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        ec var10 = null;
        ec var11 = null;
        hb var12 = null;
        ec var13 = null;
        ec var14 = null;
        hb var15 = null;
        ec var16 = null;
        hb var17 = null;
        ec var18 = null;
        ec var19 = null;
        ec var20 = null;
        ec var21 = null;
        ec var22 = null;
        hb var23 = null;
        ec var25 = null;
        ec var26 = null;
        ec var27 = null;
        L0: {
          var8 = DungeonAssault.field_K;
          if (param2 > 70) {
            break L0;
          } else {
            ((pj) this).field_B = 63;
            break L0;
          }
        }
        param0.field_o = param0.field_o | 1;
        var4 = param0.field_n.field_s;
        if (ob.field_Mb == var4) {
          L1: {
            var12 = ((pj) this).field_A[param1.c(true)];
            var12.field_o = var12.field_o & -5;
            var12.a(3);
            if (128 != ((pj) this).field_k) {
              ((pj) this).a(false, 8);
              break L1;
            } else {
              ((pj) this).a(false, 128);
              break L1;
            }
          }
          var13 = new ec(3);
          var13.a(6, 2);
          var13.a(6, param0.field_j);
          var13.a(6, var12.field_j);
          return new mo(65, var13);
        } else {
          L2: {
            if (ob.field_dc == var4) {
              break L2;
            } else {
              if (var4 == ob.field_Nb) {
                break L2;
              } else {
                L3: {
                  if (var4 == ob.field_nc) {
                    break L3;
                  } else {
                    if (var4 == ob.field_Ib) {
                      break L3;
                    } else {
                      if (var4 == ob.field_Zb) {
                        var17 = ((pj) this).field_A[param1.c(true)];
                        var17.a(false);
                        param0.field_o = param0.field_o & -2;
                        ((pj) this).a(false);
                        var18 = new ec(3);
                        var18.a(6, 2);
                        var18.a(6, param0.field_j);
                        var18.a(6, var17.field_j);
                        return new mo(65, var18);
                      } else {
                        L4: {
                          if (var4 == ob.field_lc) {
                            break L4;
                          } else {
                            if (ob.field_Gb != var4) {
                              if (ob.field_Wb != var4) {
                                if (var4 == ob.field_Lb) {
                                  var5 = param1.c(true);
                                  var6 = param1.c(true);
                                  ((pj) this).field_p.a(var5, -88);
                                  ((pj) this).field_p.a(var6, -119);
                                  ((pj) this).a(false, ((pj) this).field_k);
                                  var10 = new ec(16);
                                  var21 = var10;
                                  var21.a(6, 15);
                                  var21.a(6, param0.field_j);
                                  var21.a(6, var5);
                                  var10.a(6, var6);
                                  ((pj) this).field_h[var5].a(-12, true, var21);
                                  var21.a(6, ((pj) this).d(var5, 30813));
                                  ((pj) this).field_h[var6].a(-12, true, var21);
                                  var21.a(6, ((pj) this).d(var6, 30813));
                                  return new mo(65, var21);
                                } else {
                                  if (var4 == ob.field_Pb) {
                                    ((pj) this).field_t = ((pj) this).field_t | 1;
                                    ((pj) this).a(false, ((pj) this).field_k);
                                    var22 = new ec(2);
                                    var22.a(6, 1);
                                    var22.a(6, param0.field_j);
                                    return new mo(65, var22);
                                  } else {
                                    L5: {
                                      if (var4 == ob.field_fc) {
                                        break L5;
                                      } else {
                                        if (ob.field_Jb == var4) {
                                          break L5;
                                        } else {
                                          if (var4 != ob.field_pc) {
                                            if (var4 != ob.field_Ub) {
                                              throw new IllegalStateException("Invalid ability use!");
                                            } else {
                                              var5 = param1.c(true);
                                              var6 = param1.c(true);
                                              param0.field_e = var5;
                                              param0.field_g = var6;
                                              var25 = new ec(4);
                                              var25.a(6, 3);
                                              var25.a(6, param0.field_j);
                                              var25.a(6, var5);
                                              var25.a(6, var6);
                                              return new mo(65, var25);
                                            }
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    L6: {
                                      var23 = ((pj) this).field_A[param1.c(true)];
                                      if (var4 == ob.field_fc) {
                                        var23.field_d = var23.field_d | 1;
                                        break L6;
                                      } else {
                                        if (var4 != ob.field_Jb) {
                                          if (var4 == ob.field_pc) {
                                            var23.field_d = var23.field_d | 4;
                                            break L6;
                                          } else {
                                            ((pj) this).a(false, ((pj) this).field_k);
                                            var26 = new ec(3);
                                            var26.a(6, 2);
                                            var26.a(6, param0.field_j);
                                            var26.a(6, var23.field_j);
                                            return new mo(65, var26);
                                          }
                                        } else {
                                          var23.field_d = var23.field_d | 2;
                                          break L6;
                                        }
                                      }
                                    }
                                    ((pj) this).a(false, ((pj) this).field_k);
                                    var27 = new ec(3);
                                    var27.a(6, 2);
                                    var27.a(6, param0.field_j);
                                    var27.a(6, var23.field_j);
                                    return new mo(65, var27);
                                  }
                                }
                              } else {
                                ((pj) this).field_B = ((pj) this).field_q;
                                ((pj) this).a(false, 8);
                                var20 = new ec(2);
                                var20.a(6, 1);
                                var20.a(6, param0.field_j);
                                return new mo(65, var20);
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        ((pj) this).a(false);
                        var19 = new ec(2);
                        var19.a(6, 1);
                        var19.a(6, param0.field_j);
                        return new mo(65, var19);
                      }
                    }
                  }
                }
                var15 = ((pj) this).field_A[param1.c(true)];
                var15.a(false);
                param0.field_o = param0.field_o & -7;
                param0.field_o = param0.field_o & -2;
                ((pj) this).a(false, 8);
                var16 = new ec(3);
                var16.a(6, 2);
                var16.a(6, param0.field_j);
                var16.a(6, var15.field_j);
                return new mo(65, var16);
              }
            }
          }
          L7: {
            var5 = param1.c(true);
            ((pj) this).field_p.a(var5, -128);
            if (ob.field_Nb != var4) {
              break L7;
            } else {
              ((pj) this).a(var5, false, -12331);
              ((pj) this).a(false, 115, var5);
              this.a((byte) -52, var5, false);
              break L7;
            }
          }
          ((pj) this).a(false, ((pj) this).field_k);
          var11 = new ec(9);
          var14 = var11;
          var14.a(6, 8);
          var14.a(6, param0.field_j);
          var14.a(6, var5);
          ((pj) this).field_h[var5].a(-12, true, var14);
          var14.a(6, ((pj) this).d(var5, 30813));
          return new mo(65, var14);
        }
    }

    private final void a(md param0, int param1, int param2, int param3, boolean param4) {
        Object var7 = null;
        L0: {
          if (!((pj) this).field_v.a(param3, (byte) 92)) {
            break L0;
          } else {
            if (!((pj) this).field_m.a(param2, (byte) 92)) {
              L1: {
                ((pj) this).field_m.a(param2, -92);
                if (param1 == 49) {
                  break L1;
                } else {
                  var7 = null;
                  String discarded$2 = pj.a((byte) 106, -25, (String) null);
                  break L1;
                }
              }
              L2: {
                if (!((pj) this).field_j.a(param2, (byte) 109)) {
                  L3: {
                    if (param4) {
                      param3 += 84;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((pj) this).field_b.a(param3, param1 + -175);
                  break L2;
                } else {
                  param0.a((ne) (Object) new a(param2), false);
                  break L2;
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    pj() {
        int var1 = 0;
        ((pj) this).field_v = new wm(84);
        ((pj) this).field_h = new ai[49];
        ((pj) this).field_p = new wm(49);
        ((pj) this).field_j = new wm(49);
        ((pj) this).field_d = new wm(49);
        ((pj) this).field_g = 0;
        ((pj) this).field_A = new hb[4];
        ((pj) this).field_B = -1;
        ((pj) this).field_u = null;
        ((pj) this).field_q = -1;
        ((pj) this).field_k = 1;
        ((pj) this).field_l = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= 49) {
            ((pj) this).field_h[48] = new ai(3);
            ((pj) this).field_h[42] = new ai(3);
            ((pj) this).field_h[6] = new ai(3);
            ((pj) this).field_h[0] = new ai(3);
            ((pj) this).field_h[24] = new ai(2);
            ((pj) this).field_p.a(0, -66);
            ((pj) this).field_p.a(6, -80);
            ((pj) this).field_p.a(42, -85);
            ((pj) this).field_p.a(48, -84);
            ((pj) this).field_b = new wm(168);
            ((pj) this).field_m = new wm(49);
            ((pj) this).field_m.a(0, -119);
            ((pj) this).field_m.a(6, -76);
            ((pj) this).field_m.a(42, -114);
            ((pj) this).field_m.a(48, -90);
          } else {
            ((pj) this).field_h[var1] = new ai(0);
            var1++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new boolean[64];
        field_n = "Email address is unavailable";
        field_x = 0;
        field_z = 0L;
    }
}
