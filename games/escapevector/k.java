/*
 * Decompiled by CFR-JS 0.4.0.
 */
class k implements db, ao {
    int field_k;
    int field_h;
    int field_i;
    static ed field_j;
    int field_c;
    int field_g;
    int field_f;
    int field_o;
    int field_n;
    int field_m;
    wl field_l;
    int field_b;
    private int field_e;
    static String field_p;
    static cn field_d;
    private boolean field_a;

    public final int a(byte param0, hm param1, int param2) {
        if (param0 != -113) {
            return -25;
        }
        return this.a(0, param1, -18079, param2);
    }

    public final int a(int param0, int param1, int param2, int param3, int param4, hm param5) {
        if (param4 <= 81) {
            ((k) this).field_e = -116;
            pg discarded$0 = ((k) this).b(param5, 90);
            return param5.field_p.a((byte) 39, param3 - ((k) this).a((byte) -113, param5, param0), param2 - ((k) this).a(param5, param1, -16956));
        }
        pg discarded$1 = ((k) this).b(param5, 90);
        return param5.field_p.a((byte) 39, param3 - ((k) this).a((byte) -113, param5, param0), param2 - ((k) this).a(param5, param1, -16956));
    }

    public final int a(hm param0, int param1, int param2) {
        if (param2 != -16956) {
            Object var5 = null;
            int discarded$0 = ((k) this).a(-8, (hm) null);
            return this.b(param0, 0, 0, param1);
        }
        return this.b(param0, 0, 0, param1);
    }

    private final void a(hm param0, int param1, int param2, int param3) {
        this.a(param1, ((k) this).field_h, ((k) this).field_e, param2, 0, 0, true, param0);
        if (param3 >= -15) {
            Object var6 = null;
            int discarded$0 = ((k) this).a((byte) 102, (hm) null);
        }
    }

    private final int b(hm param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            Object var6 = null;
            int discarded$0 = ((k) this).a(-51, -123, -119, 54, -115, (hm) null);
            return param2 + (param0.field_v + ((k) this).field_f + (param3 + param0.field_j));
        }
        return param2 + (param0.field_v + ((k) this).field_f + (param3 + param0.field_j));
    }

    final static ed a(int param0, byte param1, int param2) {
        rk[] var5 = w.c(false);
        var5 = var5;
        if (var5 == null) {
            return null;
        }
        if (param1 != -39) {
            boolean discarded$0 = k.a(true, '￾');
            return var5[param2].a(false, param0);
        }
        return var5[param2].a(false, param0);
    }

    public void a(int param0, int param1, int param2, hm param3, boolean param4) {
        if (null == ((k) this).field_l) {
            return;
        }
        if (param2 >= -14) {
            Object var7 = null;
            ((k) this).a((hm) null, -75, 106, 104, false);
            this.a(param3, param1, param0, -100);
            return;
        }
        this.a(param3, param1, param0, -100);
    }

    public final int a(hm param0, int param1) {
        if (param1 != -25033) {
            ((k) this).field_g = 7;
            return -((k) this).field_b + -((k) this).field_n + param0.field_g;
        }
        return -((k) this).field_b + -((k) this).field_n + param0.field_g;
    }

    public final void a(int param0, int param1, hm param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        pg var20 = null;
        pg var21 = null;
        vl var22 = null;
        pg var23 = null;
        pg var24 = null;
        vl var25 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = EscapeVector.field_A;
        if (param4 == -613528456) {
          if (param3 != param1) {
            L0: {
              if (param2.h(0)) {
                L1: {
                  var24 = ((k) this).b(param2, 90);
                  var23 = var24;
                  if ((param1 ^ -1) >= (param3 ^ -1)) {
                    var8 = param1;
                    var9 = param3;
                    break L1;
                  } else {
                    var9 = param1;
                    var8 = param3;
                    break L1;
                  }
                }
                var10 = var23.a(var8, 0);
                var11 = var23.a(var9, 0);
                rd.a(param2.field_g + (param2.field_k + param0), param0 + param2.field_k, param2.field_x + (param2.field_j + param5), 19807, param5 - -param2.field_j);
                var12 = var10;
                L2: while (true) {
                  if ((var11 ^ -1) > (var12 ^ -1)) {
                    dl.a((byte) -59);
                    break L0;
                  } else {
                    L3: {
                      var25 = var24.field_a[var12];
                      if ((var12 ^ -1) == (var10 ^ -1)) {
                        stackOut_32_0 = var23.a((byte) 127, var8);
                        stackIn_33_0 = stackOut_32_0;
                        break L3;
                      } else {
                        stackOut_31_0 = var25.field_b[0];
                        stackIn_33_0 = stackOut_31_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_33_0;
                      if (var12 == var11) {
                        stackOut_37_0 = var23.a((byte) -9, var9);
                        stackIn_38_0 = stackOut_37_0;
                        break L4;
                      } else {
                        if (var25 == null) {
                          stackOut_36_0 = 0;
                          stackIn_38_0 = stackOut_36_0;
                          break L4;
                        } else {
                          stackOut_35_0 = var25.field_b[var25.field_b.length + -1];
                          stackIn_38_0 = stackOut_35_0;
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_38_0;
                    mb.field_g.a(var25.field_a, 1, ((k) this).field_i >>> -613528456, var25.field_d + (param5 + param2.field_j) - (-((k) this).field_f - param2.field_v), var15 - var14, ((k) this).field_i, this.a(var14, param2, -18079, param0));
                    var12++;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          var17 = null;
          int discarded$1 = ((k) this).a(-128, 94, 31, -40, 4, (hm) null);
          if (param3 != param1) {
            L5: {
              if (param2.h(0)) {
                L6: {
                  var21 = ((k) this).b(param2, 90);
                  var20 = var21;
                  if ((param1 ^ -1) >= (param3 ^ -1)) {
                    var8 = param1;
                    var9 = param3;
                    break L6;
                  } else {
                    var9 = param1;
                    var8 = param3;
                    break L6;
                  }
                }
                var10 = var20.a(var8, 0);
                var11 = var20.a(var9, 0);
                rd.a(param2.field_g + (param2.field_k + param0), param0 + param2.field_k, param2.field_x + (param2.field_j + param5), 19807, param5 - -param2.field_j);
                var12 = var10;
                L7: while (true) {
                  if ((var11 ^ -1) > (var12 ^ -1)) {
                    dl.a((byte) -59);
                    break L5;
                  } else {
                    L8: {
                      var22 = var21.field_a[var12];
                      if ((var12 ^ -1) == (var10 ^ -1)) {
                        stackOut_12_0 = var20.a((byte) 127, var8);
                        stackIn_13_0 = stackOut_12_0;
                        break L8;
                      } else {
                        stackOut_11_0 = var22.field_b[0];
                        stackIn_13_0 = stackOut_11_0;
                        break L8;
                      }
                    }
                    L9: {
                      var14 = stackIn_13_0;
                      if (var12 == var11) {
                        stackOut_17_0 = var20.a((byte) -9, var9);
                        stackIn_18_0 = stackOut_17_0;
                        break L9;
                      } else {
                        if (var22 == null) {
                          stackOut_16_0 = 0;
                          stackIn_18_0 = stackOut_16_0;
                          break L9;
                        } else {
                          stackOut_15_0 = var22.field_b[var22.field_b.length + -1];
                          stackIn_18_0 = stackOut_15_0;
                          break L9;
                        }
                      }
                    }
                    var15 = stackIn_18_0;
                    mb.field_g.a(var22.field_a, 1, ((k) this).field_i >>> -613528456, var22.field_d + (param5 + param2.field_j) - (-((k) this).field_f - param2.field_v), var15 - var14, ((k) this).field_i, this.a(var14, param2, -18079, param0));
                    var12++;
                    continue L7;
                  }
                }
              } else {
                break L5;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, hm param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = EscapeVector.field_A;
        rd.a(param3 - -param7.field_k + param7.field_g, param3 + param7.field_k, param0 - (-param7.field_j + -param7.field_x), 19807, param7.field_j + param0);
        var9 = ((k) this).a(param7, -25033);
        var10 = this.b(-14072, param7);
        if (((k) this).field_a) {
          int discarded$1 = ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), this.b(param7, 0, param4, param0), var9, var10, param1, param2, ((k) this).field_m, ((k) this).field_c, ((k) this).field_k);
          if (param6) {
            dl.a((byte) 125);
            return;
          } else {
            k.b(85);
            dl.a((byte) 125);
            return;
          }
        } else {
          var12 = ((k) this).field_c;
          if (var12 != 0) {
            if ((var12 ^ -1) == -3) {
              var11 = -((k) this).field_l.field_x + var10;
              var12 = ((k) this).field_m;
              if (0 == var12) {
                ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                if (param6) {
                  dl.a((byte) 125);
                  return;
                } else {
                  k.b(85);
                  dl.a((byte) 125);
                  return;
                }
              } else {
                if (-4 != (var12 ^ -1)) {
                  if ((var12 ^ -1) == -2) {
                    ((k) this).field_l.c(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -(var9 >> -571258943), this.b(param7, 0, param4, param0) + var11, param1, param2);
                    if (param6) {
                      dl.a((byte) 125);
                      return;
                    } else {
                      k.b(85);
                      dl.a((byte) 125);
                      return;
                    }
                  } else {
                    if (2 == var12) {
                      ((k) this).field_l.b(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -var9, var11 + this.b(param7, 0, param4, param0), param1, param2);
                      if (param6) {
                        dl.a((byte) 125);
                        return;
                      } else {
                        k.b(85);
                        dl.a((byte) 125);
                        return;
                      }
                    } else {
                      if (param6) {
                        dl.a((byte) 125);
                        return;
                      } else {
                        k.b(85);
                        dl.a((byte) 125);
                        return;
                      }
                    }
                  }
                } else {
                  ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                  if (param6) {
                    dl.a((byte) 125);
                    return;
                  } else {
                    k.b(85);
                    dl.a((byte) 125);
                    return;
                  }
                }
              }
            } else {
              if (-4 != (var12 ^ -1)) {
                if (-2 != (var12 ^ -1)) {
                  var11 = ((k) this).field_l.field_r - -(var10 + -((k) this).field_l.field_r + -((k) this).field_l.field_x >> -1628178975);
                  var12 = ((k) this).field_m;
                  if (0 == var12) {
                    ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                    if (param6) {
                      dl.a((byte) 125);
                      return;
                    } else {
                      k.b(85);
                      dl.a((byte) 125);
                      return;
                    }
                  } else {
                    if (-4 != (var12 ^ -1)) {
                      if ((var12 ^ -1) == -2) {
                        ((k) this).field_l.c(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -(var9 >> -571258943), this.b(param7, 0, param4, param0) + var11, param1, param2);
                        if (param6) {
                          dl.a((byte) 125);
                          return;
                        } else {
                          k.b(85);
                          dl.a((byte) 125);
                          return;
                        }
                      } else {
                        if (2 == var12) {
                          ((k) this).field_l.b(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -var9, var11 + this.b(param7, 0, param4, param0), param1, param2);
                          if (param6) {
                            dl.a((byte) 125);
                            return;
                          } else {
                            k.b(85);
                            dl.a((byte) 125);
                            return;
                          }
                        } else {
                          if (param6) {
                            dl.a((byte) 125);
                            return;
                          } else {
                            k.b(85);
                            dl.a((byte) 125);
                            return;
                          }
                        }
                      }
                    } else {
                      ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                      if (param6) {
                        dl.a((byte) 125);
                        return;
                      } else {
                        k.b(85);
                        dl.a((byte) 125);
                        return;
                      }
                    }
                  }
                } else {
                  var11 = ((k) this).field_l.field_r - -(var10 + -((k) this).field_l.field_r + -((k) this).field_l.field_x >> -1628178975);
                  var12 = ((k) this).field_m;
                  if (0 == var12) {
                    ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                    if (param6) {
                      dl.a((byte) 125);
                      return;
                    } else {
                      k.b(85);
                      dl.a((byte) 125);
                      return;
                    }
                  } else {
                    if (-4 != (var12 ^ -1)) {
                      if ((var12 ^ -1) == -2) {
                        ((k) this).field_l.c(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -(var9 >> -571258943), this.b(param7, 0, param4, param0) + var11, param1, param2);
                        if (param6) {
                          dl.a((byte) 125);
                          return;
                        } else {
                          k.b(85);
                          dl.a((byte) 125);
                          return;
                        }
                      } else {
                        if (2 == var12) {
                          ((k) this).field_l.b(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -var9, var11 + this.b(param7, 0, param4, param0), param1, param2);
                          if (param6) {
                            dl.a((byte) 125);
                            return;
                          } else {
                            k.b(85);
                            dl.a((byte) 125);
                            return;
                          }
                        } else {
                          if (param6) {
                            dl.a((byte) 125);
                            return;
                          } else {
                            k.b(85);
                            dl.a((byte) 125);
                            return;
                          }
                        }
                      }
                    } else {
                      ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                      if (param6) {
                        dl.a((byte) 125);
                        return;
                      } else {
                        k.b(85);
                        dl.a((byte) 125);
                        return;
                      }
                    }
                  }
                }
              } else {
                var11 = ((k) this).field_l.field_r - -(var10 + -((k) this).field_l.field_r + -((k) this).field_l.field_x >> -1628178975);
                var12 = ((k) this).field_m;
                if (0 == var12) {
                  ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                  if (param6) {
                    dl.a((byte) 125);
                    return;
                  } else {
                    k.b(85);
                    dl.a((byte) 125);
                    return;
                  }
                } else {
                  if (-4 != (var12 ^ -1)) {
                    if ((var12 ^ -1) == -2) {
                      ((k) this).field_l.c(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -(var9 >> -571258943), this.b(param7, 0, param4, param0) + var11, param1, param2);
                      if (param6) {
                        dl.a((byte) 125);
                        return;
                      } else {
                        k.b(85);
                        dl.a((byte) 125);
                        return;
                      }
                    } else {
                      if (2 == var12) {
                        ((k) this).field_l.b(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -var9, var11 + this.b(param7, 0, param4, param0), param1, param2);
                        if (param6) {
                          dl.a((byte) 125);
                          return;
                        } else {
                          k.b(85);
                          dl.a((byte) 125);
                          return;
                        }
                      } else {
                        if (param6) {
                          dl.a((byte) 125);
                          return;
                        } else {
                          k.b(85);
                          dl.a((byte) 125);
                          return;
                        }
                      }
                    }
                  } else {
                    ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                    if (param6) {
                      dl.a((byte) 125);
                      return;
                    } else {
                      k.b(85);
                      dl.a((byte) 125);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            var11 = ((k) this).field_l.field_r;
            var12 = ((k) this).field_m;
            if (0 == var12) {
              ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
              if (param6) {
                dl.a((byte) 125);
                return;
              } else {
                k.b(85);
                dl.a((byte) 125);
                return;
              }
            } else {
              if (-4 != (var12 ^ -1)) {
                if ((var12 ^ -1) == -2) {
                  ((k) this).field_l.c(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -(var9 >> -571258943), this.b(param7, 0, param4, param0) + var11, param1, param2);
                  if (param6) {
                    dl.a((byte) 125);
                    return;
                  } else {
                    k.b(85);
                    dl.a((byte) 125);
                    return;
                  }
                } else {
                  if (2 == var12) {
                    ((k) this).field_l.b(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3) - -var9, var11 + this.b(param7, 0, param4, param0), param1, param2);
                    if (param6) {
                      dl.a((byte) 125);
                      return;
                    } else {
                      k.b(85);
                      dl.a((byte) 125);
                      return;
                    }
                  } else {
                    if (param6) {
                      dl.a((byte) 125);
                      return;
                    } else {
                      k.b(85);
                      dl.a((byte) 125);
                      return;
                    }
                  }
                }
              } else {
                ((k) this).field_l.a(((k) this).b((byte) 39, param7), this.a(param5, param7, -18079, param3), var11 + this.b(param7, 0, param4, param0), param1, param2);
                if (param6) {
                  dl.a((byte) 125);
                  return;
                } else {
                  k.b(85);
                  dl.a((byte) 125);
                  return;
                }
              }
            }
          }
        }
    }

    private final int a(int param0, hm param1, int param2, int param3) {
        if (param2 != -18079) {
            Object var6 = null;
            int discarded$0 = this.a(39, (hm) null, 121, 83);
            return param0 + (((k) this).field_n + param1.field_k) + (param3 + param1.field_n);
        }
        return param0 + (((k) this).field_n + param1.field_k) + (param3 + param1.field_n);
    }

    private final int b(int param0, hm param1) {
        if (param0 != -14072) {
            ((k) this).field_i = 0;
            return -((k) this).field_o + (param1.field_x + -((k) this).field_f);
        }
        return -((k) this).field_o + (param1.field_x + -((k) this).field_f);
    }

    final void a(k param0, int param1) {
        param0.field_f = ((k) this).field_f;
        param0.field_g = ((k) this).field_g;
        param0.field_m = ((k) this).field_m;
        param0.field_e = ((k) this).field_e;
        param0.field_o = ((k) this).field_o;
        param0.field_b = ((k) this).field_b;
        if (param1 <= 56) {
            ((k) this).field_e = 60;
            param0.field_n = ((k) this).field_n;
            param0.field_l = ((k) this).field_l;
            param0.field_k = ((k) this).field_k;
            param0.field_i = ((k) this).field_i;
            param0.field_c = ((k) this).field_c;
            param0.field_a = ((k) this).field_a;
            param0.field_h = ((k) this).field_h;
            return;
        }
        param0.field_n = ((k) this).field_n;
        param0.field_l = ((k) this).field_l;
        param0.field_k = ((k) this).field_k;
        param0.field_i = ((k) this).field_i;
        param0.field_c = ((k) this).field_c;
        param0.field_a = ((k) this).field_a;
        param0.field_h = ((k) this).field_h;
    }

    public final int a(int param0) {
        if (param0 < 96) {
            field_p = null;
            return ((k) this).field_l.field_r + ((k) this).field_l.field_x;
        }
        return ((k) this).field_l.field_r + ((k) this).field_l.field_x;
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != -24239) {
            return;
        }
        field_p = null;
        field_j = null;
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (48 > param1) {
                if (65 > param1) {
                  L2: {
                    if (param1 < 97) {
                      break L2;
                    } else {
                      if (122 < param1) {
                        break L2;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_56_0 = 0;
                  stackIn_57_0 = stackOut_56_0;
                  break L0;
                } else {
                  if (param1 <= 90) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (param1 < 97) {
                          break L4;
                        } else {
                          if (122 < param1) {
                            break L4;
                          } else {
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            break L3;
                          }
                        }
                      }
                      stackOut_50_0 = 0;
                      stackIn_51_0 = stackOut_50_0;
                      break L3;
                    }
                    return stackIn_51_0 != 0;
                  }
                }
              } else {
                if (param1 <= 57) {
                  break L1;
                } else {
                  L5: {
                    if (65 > param1) {
                      L6: {
                        if (param1 < 97) {
                          break L6;
                        } else {
                          if (122 < param1) {
                            break L6;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L5;
                    } else {
                      if (param1 <= 90) {
                        stackOut_42_0 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            if (param1 < 97) {
                              break L8;
                            } else {
                              if (122 < param1) {
                                break L8;
                              } else {
                                stackOut_36_0 = 1;
                                stackIn_38_0 = stackOut_36_0;
                                break L7;
                              }
                            }
                          }
                          stackOut_37_0 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          break L7;
                        }
                        return stackIn_38_0 != 0;
                      }
                    }
                  }
                  return stackIn_44_0 != 0;
                }
              }
            }
            stackOut_55_0 = 1;
            stackIn_57_0 = stackOut_55_0;
            break L0;
          }
          return stackIn_57_0 != 0;
        } else {
          field_j = null;
          if (48 <= param1) {
            if (param1 > 57) {
              L9: {
                if (65 > param1) {
                  L10: {
                    if (param1 < 97) {
                      break L10;
                    } else {
                      if (122 < param1) {
                        break L10;
                      } else {
                        return true;
                      }
                    }
                  }
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  break L9;
                } else {
                  if (param1 <= 90) {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L9;
                  } else {
                    L11: {
                      L12: {
                        if (param1 < 97) {
                          break L12;
                        } else {
                          if (122 < param1) {
                            break L12;
                          } else {
                            stackOut_21_0 = 1;
                            stackIn_23_0 = stackOut_21_0;
                            break L11;
                          }
                        }
                      }
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      break L11;
                    }
                    return stackIn_23_0 != 0;
                  }
                }
              }
              return stackIn_29_0 != 0;
            } else {
              return true;
            }
          } else {
            if (65 > param1) {
              if (param1 >= 97) {
                if (122 >= param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                return true;
              } else {
                L13: {
                  L14: {
                    if (param1 < 97) {
                      break L14;
                    } else {
                      if (122 < param1) {
                        break L14;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L13;
                      }
                    }
                  }
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L13;
                }
                return stackIn_8_0 != 0;
              }
            }
          }
        }
    }

    String b(byte param0, hm param1) {
        if (param0 != 39) {
            field_d = null;
            return param1.field_l;
        }
        return param1.field_l;
    }

    public final void a(hm param0, int param1, int param2, int param3, boolean param4) {
        pg var16 = null;
        pg var15 = null;
        int var7 = 0;
        vl var17 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pg var19 = null;
        pg var18 = null;
        vl var20 = null;
        if (!param4) {
            ((k) this).field_h = 30;
            if (param0.h(0)) {
                var16 = ((k) this).b(param0, 90);
                var15 = var16;
                var7 = var15.a(param1, 0);
                var17 = var16.field_a[var7];
                var9 = var15.a((byte) 122, param1);
                var10 = this.a(var9, param0, -18079, param2);
                var11 = ((k) this).a(param0, param3, -16956) - -Math.max(0, var17.field_d);
                var12 = ((k) this).a(param0, param3, -16956) + Math.min(this.b(-14072, param0), Math.min(var17.field_a, (var7 - -1 ^ -1) > (var15.field_a.length ^ -1) ? var16.field_a[1 + var7].field_d : var17.field_a));
                rd.a(param0.field_g + param2 - -param0.field_k, param0.field_k + param2, param3 + (param0.field_j - -param0.field_x), 19807, param0.field_j + param3);
                mb.field_g.a(var10, var12, -29666, var10, var11, ((k) this).field_g);
                dl.a((byte) 122);
            }
            return;
        }
        if (param0.h(0)) {
            var19 = ((k) this).b(param0, 90);
            var18 = var19;
            var7 = var18.a(param1, 0);
            var20 = var19.field_a[var7];
            var9 = var18.a((byte) 122, param1);
            var10 = this.a(var9, param0, -18079, param2);
            var11 = ((k) this).a(param0, param3, -16956) - -Math.max(0, var20.field_d);
            var12 = ((k) this).a(param0, param3, -16956) + Math.min(this.b(-14072, param0), Math.min(var20.field_a, (var7 - -1 ^ -1) > (var18.field_a.length ^ -1) ? var19.field_a[1 + var7].field_d : var20.field_a));
            rd.a(param0.field_g + param2 - -param0.field_k, param0.field_k + param2, param3 + (param0.field_j - -param0.field_x), 19807, param0.field_j + param3);
            mb.field_g.a(var10, var12, -29666, var10, var11, ((k) this).field_g);
            dl.a((byte) 122);
        }
    }

    k(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected k() {
    }

    public final pg b(hm param0, int param1) {
        Object var4 = null;
        if (!(null != param0.field_p)) {
            param0.field_p = (pg) (Object) new wh();
        }
        if (!((k) this).field_a) {
            this.c(param0, -86);
            if (param1 == 90) {
                return param0.field_p;
            }
            var4 = null;
            int discarded$0 = ((k) this).a((byte) 117, (hm) null, -58);
            return param0.field_p;
        }
        ((wh) (Object) param0.field_p).a(this.b(param1 + -14162, param0), ((k) this).b((byte) 39, param0), ((k) this).field_l, ((k) this).a(param0, param1 + -25123), ((k) this).field_m, ((k) this).field_c, ((k) this).field_k, (byte) -13);
        if (param1 == 90) {
            return param0.field_p;
        }
        var4 = null;
        int discarded$1 = ((k) this).a((byte) 117, (hm) null, -58);
        return param0.field_p;
    }

    private final void c(hm param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        if (null == param0.field_p) {
          param0.field_p = (pg) (Object) new wh();
          var3 = ((k) this).a(param0, -25033);
          if (param1 >= -6) {
            ((k) this).field_c = 29;
            var4 = this.b(-14072, param0);
            var6 = ((k) this).field_c;
            if (var6 != 0) {
              if (2 != var6) {
                L0: {
                  if (var6 != 3) {
                    if ((var6 ^ -1) != -2) {
                      break L0;
                    } else {
                      var5 = ((k) this).field_l.field_r + (-((k) this).field_l.field_r + var4 - ((k) this).field_l.field_x >> -301196447);
                      var6 = ((k) this).field_m;
                      if (-1 != (var6 ^ -1)) {
                        L1: {
                          if (var6 == 3) {
                            if (!(param0.field_p instanceof wh)) {
                              break L1;
                            } else {
                              ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                              return;
                            }
                          } else {
                            if (1 == var6) {
                              if (!(param0.field_p instanceof wh)) {
                                break L1;
                              } else {
                                ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                                return;
                              }
                            } else {
                              if (2 != var6) {
                                break L1;
                              } else {
                                if (param0.field_p instanceof wh) {
                                  ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                                  break L1;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        if (!(param0.field_p instanceof wh)) {
                          return;
                        } else {
                          ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                          return;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
                var5 = ((k) this).field_l.field_r + (-((k) this).field_l.field_r + var4 - ((k) this).field_l.field_x >> -301196447);
                var6 = ((k) this).field_m;
                if (-1 != (var6 ^ -1)) {
                  L2: {
                    if (var6 == 3) {
                      if (!(param0.field_p instanceof wh)) {
                        break L2;
                      } else {
                        ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                        return;
                      }
                    } else {
                      if (1 == var6) {
                        if (!(param0.field_p instanceof wh)) {
                          break L2;
                        } else {
                          ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                          return;
                        }
                      } else {
                        if (2 != var6) {
                          break L2;
                        } else {
                          if (param0.field_p instanceof wh) {
                            ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  if (!(param0.field_p instanceof wh)) {
                    return;
                  } else {
                    ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                    return;
                  }
                }
              } else {
                var5 = var4 - ((k) this).field_l.field_x;
                var6 = ((k) this).field_m;
                if (-1 != (var6 ^ -1)) {
                  L3: {
                    if (var6 == 3) {
                      if (!(param0.field_p instanceof wh)) {
                        break L3;
                      } else {
                        ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                        return;
                      }
                    } else {
                      if (1 == var6) {
                        if (!(param0.field_p instanceof wh)) {
                          break L3;
                        } else {
                          ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                          return;
                        }
                      } else {
                        if (2 == var6) {
                          if (param0.field_p instanceof wh) {
                            ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                            break L3;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L4: {
                    if (!(param0.field_p instanceof wh)) {
                      break L4;
                    } else {
                      ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                      break L4;
                    }
                  }
                  return;
                }
              }
            } else {
              L5: {
                L6: {
                  var5 = ((k) this).field_l.field_r;
                  var6 = ((k) this).field_m;
                  if (-1 != (var6 ^ -1)) {
                    if (var6 == 3) {
                      break L6;
                    } else {
                      if (1 == var6) {
                        if (!(param0.field_p instanceof wh)) {
                          break L5;
                        } else {
                          ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                          break L5;
                        }
                      } else {
                        if (2 != var6) {
                          break L5;
                        } else {
                          if (param0.field_p instanceof wh) {
                            ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                if (!(param0.field_p instanceof wh)) {
                  break L5;
                } else {
                  ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                  break L5;
                }
              }
              return;
            }
          } else {
            var4 = this.b(-14072, param0);
            var6 = ((k) this).field_c;
            if (var6 != 0) {
              if (2 != var6) {
                L7: {
                  if (var6 != 3) {
                    if ((var6 ^ -1) == -2) {
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                var5 = ((k) this).field_l.field_r + (-((k) this).field_l.field_r + var4 - ((k) this).field_l.field_x >> -301196447);
                var6 = ((k) this).field_m;
                if (-1 != (var6 ^ -1)) {
                  L8: {
                    if (var6 == 3) {
                      if (!(param0.field_p instanceof wh)) {
                        break L8;
                      } else {
                        ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                        return;
                      }
                    } else {
                      if (1 == var6) {
                        if (!(param0.field_p instanceof wh)) {
                          break L8;
                        } else {
                          ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                          return;
                        }
                      } else {
                        if (2 != var6) {
                          break L8;
                        } else {
                          if (param0.field_p instanceof wh) {
                            ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L9: {
                    if (!(param0.field_p instanceof wh)) {
                      break L9;
                    } else {
                      ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  L11: {
                    var5 = var4 - ((k) this).field_l.field_x;
                    var6 = ((k) this).field_m;
                    if (-1 != (var6 ^ -1)) {
                      if (var6 == 3) {
                        break L11;
                      } else {
                        if (1 == var6) {
                          if (!(param0.field_p instanceof wh)) {
                            break L10;
                          } else {
                            ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                            break L10;
                          }
                        } else {
                          if (2 != var6) {
                            break L10;
                          } else {
                            if (param0.field_p instanceof wh) {
                              ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (!(param0.field_p instanceof wh)) {
                    break L10;
                  } else {
                    ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                    break L10;
                  }
                }
                return;
              }
            } else {
              L12: {
                L13: {
                  var5 = ((k) this).field_l.field_r;
                  var6 = ((k) this).field_m;
                  if (-1 != (var6 ^ -1)) {
                    if (var6 == 3) {
                      break L13;
                    } else {
                      if (1 == var6) {
                        if (!(param0.field_p instanceof wh)) {
                          break L12;
                        } else {
                          ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                          break L12;
                        }
                      } else {
                        if (2 != var6) {
                          break L12;
                        } else {
                          if (param0.field_p instanceof wh) {
                            ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                  } else {
                    break L13;
                  }
                }
                if (!(param0.field_p instanceof wh)) {
                  break L12;
                } else {
                  ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                  break L12;
                }
              }
              return;
            }
          }
        } else {
          L14: {
            var3 = ((k) this).a(param0, -25033);
            if (param1 < -6) {
              break L14;
            } else {
              ((k) this).field_c = 29;
              break L14;
            }
          }
          var4 = this.b(-14072, param0);
          var6 = ((k) this).field_c;
          if (var6 != 0) {
            if (2 != var6) {
              L15: {
                if (var6 != 3) {
                  if ((var6 ^ -1) == -2) {
                    break L15;
                  } else {
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              var5 = ((k) this).field_l.field_r + (-((k) this).field_l.field_r + var4 - ((k) this).field_l.field_x >> -301196447);
              var6 = ((k) this).field_m;
              if (-1 != (var6 ^ -1)) {
                L16: {
                  if (var6 == 3) {
                    if (!(param0.field_p instanceof wh)) {
                      break L16;
                    } else {
                      ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                      return;
                    }
                  } else {
                    if (1 == var6) {
                      if (!(param0.field_p instanceof wh)) {
                        break L16;
                      } else {
                        ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                        return;
                      }
                    } else {
                      if (2 != var6) {
                        break L16;
                      } else {
                        if (param0.field_p instanceof wh) {
                          ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                          break L16;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L17: {
                  if (!(param0.field_p instanceof wh)) {
                    break L17;
                  } else {
                    ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                    break L17;
                  }
                }
                return;
              }
            } else {
              L18: {
                L19: {
                  var5 = var4 - ((k) this).field_l.field_x;
                  var6 = ((k) this).field_m;
                  if (-1 != (var6 ^ -1)) {
                    if (var6 == 3) {
                      break L19;
                    } else {
                      if (1 == var6) {
                        if (!(param0.field_p instanceof wh)) {
                          break L18;
                        } else {
                          ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                          break L18;
                        }
                      } else {
                        if (2 != var6) {
                          break L18;
                        } else {
                          if (param0.field_p instanceof wh) {
                            ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                if (!(param0.field_p instanceof wh)) {
                  break L18;
                } else {
                  ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                  break L18;
                }
              }
              return;
            }
          } else {
            L20: {
              L21: {
                var5 = ((k) this).field_l.field_r;
                var6 = ((k) this).field_m;
                if (-1 != (var6 ^ -1)) {
                  if (var6 == 3) {
                    break L21;
                  } else {
                    if (1 == var6) {
                      if (!(param0.field_p instanceof wh)) {
                        break L20;
                      } else {
                        ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), var3 >> 1935340193, ((k) this).field_l, var5, true);
                        break L20;
                      }
                    } else {
                      if (2 != var6) {
                        break L20;
                      } else {
                        if (param0.field_p instanceof wh) {
                          ((wh) (Object) param0.field_p).a(((k) this).field_l, ((k) this).b((byte) 39, param0), var3, var5, (byte) 69);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                } else {
                  break L21;
                }
              }
              if (!(param0.field_p instanceof wh)) {
                break L20;
              } else {
                ((wh) (Object) param0.field_p).a(((k) this).b((byte) 39, param0), 0, 0, var5, ((k) this).field_l);
                break L20;
              }
            }
            return;
          }
        }
    }

    k(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((k) this).field_h = param5;
        ((k) this).field_k = param9;
        ((k) this).field_g = param10;
        ((k) this).field_b = param2;
        ((k) this).field_l = param0;
        ((k) this).field_c = param8;
        ((k) this).field_i = param11;
        ((k) this).field_o = param4;
        ((k) this).field_e = param6;
        ((k) this).field_f = param3;
        ((k) this).field_m = param7;
        ((k) this).field_n = param1;
        ((k) this).field_a = param12 ? true : false;
    }

    public final int a(byte param0, hm param1) {
        if (param0 != -46) {
            return -89;
        }
        pg discarded$0 = ((k) this).b(param1, 90);
        return param1.field_p.a((byte) -112) + ((k) this).field_n + ((k) this).field_b;
    }

    public final int a(int param0, hm param1) {
        pg discarded$5 = ((k) this).b(param1, 90);
        if (param0 > -95) {
            Object var4 = null;
            this.a((hm) null, 11, -109, 0);
            return param1.field_p.c(0) + (((k) this).field_f + ((k) this).field_o);
        }
        return param1.field_p.c(0) + (((k) this).field_f + ((k) this).field_o);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Shield: ";
        field_d = new cn();
    }
}
