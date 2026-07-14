/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o implements iq, pj {
    int field_p;
    int field_j;
    int field_i;
    int field_r;
    private int field_h;
    int field_o;
    int field_b;
    int field_g;
    static String field_q;
    private boolean field_d;
    static int field_s;
    static String field_a;
    static bi field_k;
    static String field_m;
    static int field_n;
    int field_f;
    int field_e;
    nq field_c;
    int field_l;

    public final int a(byte param0, vg param1) {
        qo discarded$7 = ((o) this).a(param1, true);
        if (param0 != -52) {
          field_q = null;
          return param1.field_j.c(param0 ^ 83) - (-((o) this).field_o - ((o) this).field_g);
        } else {
          return param1.field_j.c(param0 ^ 83) - (-((o) this).field_o - ((o) this).field_g);
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        pl.a(param0, (byte) -26);
        tr.a(param3, param0, param2, param1);
    }

    public final void a(int param0, int param1, int param2, int param3, vg param4) {
        int var7 = 0;
        ha var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qo var13 = null;
        qo var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        if (param2 >= -54) {
          return;
        } else {
          L0: {
            if (!param4.f(1)) {
              break L0;
            } else {
              L1: {
                var13 = ((o) this).a(param4, true);
                var14 = var13;
                var7 = var14.a((byte) 81, param0);
                var8 = var13.field_d[var7];
                var9 = var14.a(true, param0);
                var10 = this.b((byte) -14, param4, var9, param1);
                var11 = ((o) this).a(param3, param4, 68) - -Math.max(0, var8.field_e);
                stackOut_2_0 = ((o) this).a(param3, param4, -122);
                stackOut_2_1 = this.a(param4, 0);
                stackOut_2_2 = var8.field_c;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                if (var14.field_d.length <= 1 + var7) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = var8.field_c;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  break L1;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = stackIn_3_2;
                  stackOut_3_3 = var13.field_d[1 + var7].field_e;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  break L1;
                }
              }
              var12 = stackIn_5_0 + Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
              ke.a(-6187, param4.field_x + (param1 - -param4.field_m), param4.field_n + (param4.field_q + param3), param4.field_q + param3, param1 - -param4.field_m);
              qq.field_I.a(var10, -110, var10, ((o) this).field_i, var11, var12);
              ln.f((byte) -122);
              break L0;
            }
          }
          return;
        }
    }

    public final qo a(vg param0, boolean param1) {
        if (param1) {
          L0: {
            if (param0.field_j == null) {
              param0.field_j = (qo) (Object) new la();
              break L0;
            } else {
              break L0;
            }
          }
          if (!((o) this).field_d) {
            this.b((byte) 104, param0);
            return param0.field_j;
          } else {
            ((la) (Object) param0.field_j).a(((o) this).b(true, param0), 0, ((o) this).field_r, ((o) this).field_l, ((o) this).a(124, param0), this.a(param0, 0), ((o) this).field_c, ((o) this).field_j);
            return param0.field_j;
          }
        } else {
          return null;
        }
    }

    public final int a(int param0, int param1, int param2, vg param3, boolean param4, int param5) {
        Object var8 = null;
        qo discarded$1 = ((o) this).a(param3, param4);
        if (!param4) {
          var8 = null;
          ((o) this).a(67, 67, -1, 15, (vg) null);
          return param3.field_j.a(-((o) this).b(0, param3, param0) + param1, 3357, param5 + -((o) this).a(param2, param3, -78));
        } else {
          return param3.field_j.a(-((o) this).b(0, param3, param0) + param1, 3357, param5 + -((o) this).a(param2, param3, -78));
        }
    }

    private final int a(byte param0, vg param1, int param2, int param3) {
        int var5 = 65 % ((16 - param0) / 52);
        return param1.field_l + ((o) this).field_b + (param1.field_q + (param3 - -param2));
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ha var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        qo var18 = null;
        qo var19 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == param3) {
          return;
        } else {
          L0: {
            if (param5.f(1)) {
              L1: {
                var18 = ((o) this).a(param5, true);
                var19 = var18;
                if (param0 < param3) {
                  var8 = param0;
                  var9 = param3;
                  break L1;
                } else {
                  var9 = param0;
                  var8 = param3;
                  break L1;
                }
              }
              var10 = var19.a((byte) 120, var8);
              var11 = var19.a((byte) 100, var9);
              ke.a(param4 + -6187, param2 - -param5.field_m + param5.field_x, param1 + param5.field_q - -param5.field_n, param1 + param5.field_q, param2 - -param5.field_m);
              var12 = var10;
              L2: while (true) {
                if (var11 < var12) {
                  ln.f((byte) -49);
                  break L0;
                } else {
                  L3: {
                    var13 = var18.field_d[var12];
                    if (var12 != var10) {
                      stackOut_12_0 = var13.field_b[0];
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var19.a(true, var8);
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_13_0;
                    if (var12 == var11) {
                      stackOut_17_0 = var19.a(true, var9);
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      if (var13 != null) {
                        stackOut_16_0 = var13.field_b[var13.field_b.length - 1];
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_18_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                  }
                  var15 = stackIn_18_0;
                  qq.field_I.a(var15 + -var14, ((o) this).field_e >>> 1588399096, ((o) this).field_e, this.b((byte) -14, param5, var14, param2), var13.field_c, param4 ^ -107, var13.field_e + (param1 - -param5.field_q) + (((o) this).field_b - -param5.field_l));
                  var12++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          if (param4 != 0) {
            var17 = null;
            ((o) this).a((o) null, (byte) -38);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, vg param1, int param2, int param3) {
        this.a(param2, param3, ((o) this).field_p, 2, param1, ((o) this).field_h, 0, 0);
        int var5 = 20 / ((param0 - 54) / 41);
    }

    public final int a(int param0, vg param1, int param2) {
        int var4 = -86 % ((param2 - -15) / 62);
        return this.a((byte) 97, param1, 0, param0);
    }

    final static void a(int param0) {
        if (param0 != 0) {
            o.a((byte) 47);
            qj.a((byte) -127, 17);
            return;
        }
        qj.a((byte) -127, 17);
    }

    public final int b(int param0, vg param1, int param2) {
        Object var5 = null;
        if (param0 != 0) {
          var5 = null;
          ((o) this).a(123, 88, -66, 47, (vg) null);
          return this.b((byte) -14, param1, 0, param2);
        } else {
          return this.b((byte) -14, param1, 0, param2);
        }
    }

    String b(boolean param0, vg param1) {
        if (!param0) {
            return null;
        }
        return param1.field_s;
    }

    public final int a(int param0, vg param1) {
        if (param0 <= 114) {
            return -52;
        }
        return param1.field_x - ((o) this).field_o - ((o) this).field_g;
    }

    final static String a(byte param0, int param1, String param2) {
        int var5 = 0;
        int var6 = 0;
        ve var7 = null;
        ve var8 = null;
        sl var9 = null;
        CharSequence var10 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var10 = (CharSequence) (Object) param2;
        if (gb.a((byte) -67, var10)) {
          if (2 == po.field_b) {
            var8 = hb.a((byte) -90, param2);
            if (var8 != null) {
              oh discarded$1 = vd.field_j.b((oh) (Object) var8, -9189);
              L0: while (true) {
                var7 = (ve) (Object) vd.field_j.a((byte) -71);
                if (var7 == null) {
                  var8.b((byte) -76);
                  var8.a(16);
                  r.field_c = r.field_c - 1;
                  var9 = js.field_f;
                  var9.h(param1, 255);
                  var9.field_j = var9.field_j + 1;
                  if (param0 > -71) {
                    o.a((byte) 60);
                    var5 = var9.field_j;
                    var9.c(1, (byte) -91);
                    var9.a(param2, (byte) 0);
                    var9.b(var9.field_j + -var5, (byte) 122);
                    return null;
                  } else {
                    var5 = var9.field_j;
                    var9.c(1, (byte) -91);
                    var9.a(param2, (byte) 0);
                    var9.b(var9.field_j + -var5, (byte) 122);
                    return null;
                  }
                } else {
                  var7.field_zb = var7.field_zb - 1;
                  continue L0;
                }
              }
            } else {
              return re.a(us.field_e, 4371, new String[1]);
            }
          } else {
            return ka.field_f;
          }
        } else {
          return tm.field_j;
        }
    }

    o(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(boolean param0, vg param1) {
        qo discarded$0 = ((o) this).a(param1, param0);
        return param1.field_j.b(438) + (((o) this).field_b - -((o) this).field_f);
    }

    private final void b(byte param0, vg param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 49) {
          L0: {
            ((o) this).field_p = -125;
            if (param1.field_j == null) {
              param1.field_j = (qo) (Object) new la();
              break L0;
            } else {
              break L0;
            }
          }
          var3 = ((o) this).a(120, param1);
          var4 = this.a(param1, 0);
          var6 = ((o) this).field_l;
          if (0 != var6) {
            if ((var6 ^ -1) != -3) {
              if (var6 != 3) {
                if ((var6 ^ -1) != -2) {
                  var5 = (-((o) this).field_c.field_q + (var4 + -((o) this).field_c.field_J) >> -1567593279) + ((o) this).field_c.field_J;
                  var6 = ((o) this).field_r;
                  if (-1 != (var6 ^ -1)) {
                    if (-4 != (var6 ^ -1)) {
                      if (var6 != 1) {
                        if ((var6 ^ -1) == -3) {
                          if (param1.field_j instanceof la) {
                            ((la) (Object) param1.field_j).a(108, var5, ((o) this).field_c, ((o) this).b(true, param1), var3);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (param1.field_j instanceof la) {
                          ((la) (Object) param1.field_j).a(var5, ((o) this).b(true, param1), 0, ((o) this).field_c, var3 >> 1538326273);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1.field_j instanceof la) {
                        ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L1: {
                      if (!(param1.field_j instanceof la)) {
                        break L1;
                      } else {
                        ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                        break L1;
                      }
                    }
                    return;
                  }
                } else {
                  var5 = (-((o) this).field_c.field_q + (var4 + -((o) this).field_c.field_J) >> -1567593279) + ((o) this).field_c.field_J;
                  var6 = ((o) this).field_r;
                  if (-1 != (var6 ^ -1)) {
                    if (-4 != (var6 ^ -1)) {
                      if (var6 != 1) {
                        if ((var6 ^ -1) == -3) {
                          if (!(param1.field_j instanceof la)) {
                            return;
                          } else {
                            ((la) (Object) param1.field_j).a(108, var5, ((o) this).field_c, ((o) this).b(true, param1), var3);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (param1.field_j instanceof la) {
                          ((la) (Object) param1.field_j).a(var5, ((o) this).b(true, param1), 0, ((o) this).field_c, var3 >> 1538326273);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1.field_j instanceof la) {
                        ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1.field_j instanceof la) {
                      ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                var5 = (-((o) this).field_c.field_q + (var4 + -((o) this).field_c.field_J) >> -1567593279) + ((o) this).field_c.field_J;
                var6 = ((o) this).field_r;
                if (-1 != (var6 ^ -1)) {
                  if (-4 != (var6 ^ -1)) {
                    L2: {
                      if (var6 != 1) {
                        if ((var6 ^ -1) == -3) {
                          if (param1.field_j instanceof la) {
                            ((la) (Object) param1.field_j).a(108, var5, ((o) this).field_c, ((o) this).b(true, param1), var3);
                            break L2;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (!(param1.field_j instanceof la)) {
                          break L2;
                        } else {
                          ((la) (Object) param1.field_j).a(var5, ((o) this).b(true, param1), 0, ((o) this).field_c, var3 >> 1538326273);
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (!(param1.field_j instanceof la)) {
                      return;
                    } else {
                      ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                      return;
                    }
                  }
                } else {
                  if (!(param1.field_j instanceof la)) {
                    return;
                  } else {
                    ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                    return;
                  }
                }
              }
            } else {
              var5 = var4 - ((o) this).field_c.field_q;
              var6 = ((o) this).field_r;
              if (-1 != (var6 ^ -1)) {
                if (-4 != (var6 ^ -1)) {
                  L3: {
                    if (var6 != 1) {
                      if ((var6 ^ -1) == -3) {
                        if (param1.field_j instanceof la) {
                          ((la) (Object) param1.field_j).a(108, var5, ((o) this).field_c, ((o) this).b(true, param1), var3);
                          break L3;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!(param1.field_j instanceof la)) {
                        break L3;
                      } else {
                        ((la) (Object) param1.field_j).a(var5, ((o) this).b(true, param1), 0, ((o) this).field_c, var3 >> 1538326273);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L4: {
                    if (!(param1.field_j instanceof la)) {
                      break L4;
                    } else {
                      ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                L5: {
                  if (!(param1.field_j instanceof la)) {
                    break L5;
                  } else {
                    ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                    break L5;
                  }
                }
                return;
              }
            }
          } else {
            var5 = ((o) this).field_c.field_J;
            var6 = ((o) this).field_r;
            if (-1 != (var6 ^ -1)) {
              if (-4 != (var6 ^ -1)) {
                L6: {
                  if (var6 != 1) {
                    if ((var6 ^ -1) == -3) {
                      if (param1.field_j instanceof la) {
                        ((la) (Object) param1.field_j).a(108, var5, ((o) this).field_c, ((o) this).b(true, param1), var3);
                        break L6;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (!(param1.field_j instanceof la)) {
                      break L6;
                    } else {
                      ((la) (Object) param1.field_j).a(var5, ((o) this).b(true, param1), 0, ((o) this).field_c, var3 >> 1538326273);
                      return;
                    }
                  }
                }
                return;
              } else {
                if (param1.field_j instanceof la) {
                  ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L7: {
                if (!(param1.field_j instanceof la)) {
                  break L7;
                } else {
                  ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          L8: {
            if (param1.field_j == null) {
              param1.field_j = (qo) (Object) new la();
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var3 = ((o) this).a(120, param1);
            var4 = this.a(param1, 0);
            var6 = ((o) this).field_l;
            if (0 != var6) {
              if ((var6 ^ -1) != -3) {
                L10: {
                  if (var6 != 3) {
                    if ((var6 ^ -1) != -2) {
                      break L10;
                    } else {
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                var5 = (-((o) this).field_c.field_q + (var4 + -((o) this).field_c.field_J) >> -1567593279) + ((o) this).field_c.field_J;
                break L9;
              } else {
                var5 = var4 - ((o) this).field_c.field_q;
                break L9;
              }
            } else {
              var5 = ((o) this).field_c.field_J;
              break L9;
            }
          }
          var6 = ((o) this).field_r;
          if (-1 != (var6 ^ -1)) {
            if (-4 != (var6 ^ -1)) {
              if (var6 != 1) {
                if ((var6 ^ -1) == -3) {
                  if (!(param1.field_j instanceof la)) {
                    return;
                  } else {
                    ((la) (Object) param1.field_j).a(108, var5, ((o) this).field_c, ((o) this).b(true, param1), var3);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (param1.field_j instanceof la) {
                  ((la) (Object) param1.field_j).a(var5, ((o) this).b(true, param1), 0, ((o) this).field_c, var3 >> 1538326273);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L11: {
                if (!(param1.field_j instanceof la)) {
                  break L11;
                } else {
                  ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                  break L11;
                }
              }
              return;
            }
          } else {
            L12: {
              if (!(param1.field_j instanceof la)) {
                break L12;
              } else {
                ((la) (Object) param1.field_j).a(((o) this).field_c, var5, -4, ((o) this).b(true, param1), 0);
                break L12;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, vg param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param3 == 2) {
            break L0;
          } else {
            field_s = 115;
            break L0;
          }
        }
        ke.a(-6187, param4.field_m + (param0 - -param4.field_x), param4.field_q + (param1 + param4.field_n), param4.field_q + param1, param0 + param4.field_m);
        var9 = ((o) this).a(123, param4);
        var10 = this.a(param4, 0);
        if (!((o) this).field_d) {
          var12 = ((o) this).field_l;
          if (-1 != var12) {
            if (var12 == 2) {
              L1: {
                var11 = -((o) this).field_c.field_q + var10;
                var12 = ((o) this).field_r;
                if (-1 == (var12 ^ -1)) {
                  break L1;
                } else {
                  if (var12 == -4) {
                    break L1;
                  } else {
                    if (-2 != var12) {
                      if (2 == var12) {
                        ((o) this).field_c.b(((o) this).b(true, param4), var9 + this.b((byte) -14, param4, param7, param0), this.a((byte) 75, param4, param6, param1) - -var11, param2, param5);
                        ln.f((byte) -104);
                        return;
                      } else {
                        ln.f((byte) -104);
                        return;
                      }
                    } else {
                      ((o) this).field_c.c(((o) this).b(true, param4), (var9 >> 1878908385) + this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 121, param4, param6, param1), param2, param5);
                      ln.f((byte) -104);
                      return;
                    }
                  }
                }
              }
              ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
              ln.f((byte) -104);
              return;
            } else {
              if (-4 != var12) {
                if ((var12 ^ -1) != -2) {
                  var11 = (-((o) this).field_c.field_q + -((o) this).field_c.field_J + var10 >> -324287487) + ((o) this).field_c.field_J;
                  var12 = ((o) this).field_r;
                  if (-1 != (var12 ^ -1)) {
                    if (var12 != -4) {
                      if (-2 != var12) {
                        if (2 == var12) {
                          ((o) this).field_c.b(((o) this).b(true, param4), var9 + this.b((byte) -14, param4, param7, param0), this.a((byte) 75, param4, param6, param1) - -var11, param2, param5);
                          ln.f((byte) -104);
                          return;
                        } else {
                          ln.f((byte) -104);
                          return;
                        }
                      } else {
                        ((o) this).field_c.c(((o) this).b(true, param4), (var9 >> 1878908385) + this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 121, param4, param6, param1), param2, param5);
                        ln.f((byte) -104);
                        return;
                      }
                    } else {
                      ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
                      ln.f((byte) -104);
                      return;
                    }
                  } else {
                    ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
                    ln.f((byte) -104);
                    return;
                  }
                } else {
                  L2: {
                    L3: {
                      var11 = (-((o) this).field_c.field_q + -((o) this).field_c.field_J + var10 >> -324287487) + ((o) this).field_c.field_J;
                      var12 = ((o) this).field_r;
                      if (-1 == (var12 ^ -1)) {
                        break L3;
                      } else {
                        if (var12 == -4) {
                          break L3;
                        } else {
                          if (-2 == var12) {
                            ((o) this).field_c.c(((o) this).b(true, param4), (var9 >> 1878908385) + this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 121, param4, param6, param1), param2, param5);
                            break L2;
                          } else {
                            if (2 != var12) {
                              break L2;
                            } else {
                              ((o) this).field_c.b(((o) this).b(true, param4), var9 + this.b((byte) -14, param4, param7, param0), this.a((byte) 75, param4, param6, param1) - -var11, param2, param5);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
                    break L2;
                  }
                  ln.f((byte) -104);
                  return;
                }
              } else {
                var11 = (-((o) this).field_c.field_q + -((o) this).field_c.field_J + var10 >> -324287487) + ((o) this).field_c.field_J;
                var12 = ((o) this).field_r;
                if (-1 != (var12 ^ -1)) {
                  if (var12 != -4) {
                    if (-2 != var12) {
                      if (2 == var12) {
                        ((o) this).field_c.b(((o) this).b(true, param4), var9 + this.b((byte) -14, param4, param7, param0), this.a((byte) 75, param4, param6, param1) - -var11, param2, param5);
                        ln.f((byte) -104);
                        return;
                      } else {
                        ln.f((byte) -104);
                        return;
                      }
                    } else {
                      ((o) this).field_c.c(((o) this).b(true, param4), (var9 >> 1878908385) + this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 121, param4, param6, param1), param2, param5);
                      ln.f((byte) -104);
                      return;
                    }
                  } else {
                    ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
                    ln.f((byte) -104);
                    return;
                  }
                } else {
                  ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
                  ln.f((byte) -104);
                  return;
                }
              }
            }
          } else {
            var11 = ((o) this).field_c.field_J;
            var12 = ((o) this).field_r;
            if (-1 != (var12 ^ -1)) {
              if (var12 != -4) {
                if (-2 != var12) {
                  if (2 != var12) {
                    ln.f((byte) -104);
                    return;
                  } else {
                    ((o) this).field_c.b(((o) this).b(true, param4), var9 + this.b((byte) -14, param4, param7, param0), this.a((byte) 75, param4, param6, param1) - -var11, param2, param5);
                    ln.f((byte) -104);
                    return;
                  }
                } else {
                  ((o) this).field_c.c(((o) this).b(true, param4), (var9 >> 1878908385) + this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 121, param4, param6, param1), param2, param5);
                  ln.f((byte) -104);
                  return;
                }
              } else {
                ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
                ln.f((byte) -104);
                return;
              }
            } else {
              ((o) this).field_c.d(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
              ln.f((byte) -104);
              return;
            }
          }
        } else {
          int discarded$1 = ((o) this).field_c.a(((o) this).b(true, param4), this.b((byte) -14, param4, param7, param0), this.a((byte) -43, param4, param6, param1), var9, var10, param2, param5, ((o) this).field_r, ((o) this).field_l, ((o) this).field_j);
          ln.f((byte) -104);
          return;
        }
    }

    private final int b(byte param0, vg param1, int param2, int param3) {
        if (param0 != -14) {
          return -35;
        } else {
          return param2 + (((o) this).field_o + param1.field_m) + (param3 - -param1.field_h);
        }
    }

    public final int a(boolean param0) {
        Object var3 = null;
        if (param0) {
          var3 = null;
          int discarded$2 = ((o) this).a(6, 90, 120, (vg) null, false, -78);
          return ((o) this).field_c.field_q + ((o) this).field_c.field_J;
        } else {
          return ((o) this).field_c.field_q + ((o) this).field_c.field_J;
        }
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 >= -62) {
            return;
        }
        field_a = null;
        field_k = null;
        field_m = null;
    }

    private final int a(vg param0, int param1) {
        Object var4 = null;
        if (param1 != 0) {
          var4 = null;
          int discarded$2 = ((o) this).a(-5, (vg) null);
          return -((o) this).field_f + param0.field_n - ((o) this).field_b;
        } else {
          return -((o) this).field_f + param0.field_n - ((o) this).field_b;
        }
    }

    public void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        if (null != ((o) this).field_c) {
          if (param4 != 12) {
            ((o) this).field_o = 64;
            this.a(102, param0, param1, param3);
            return;
          } else {
            this.a(102, param0, param1, param3);
            return;
          }
        } else {
          return;
        }
    }

    final void a(o param0, byte param1) {
        param0.field_o = ((o) this).field_o;
        param0.field_c = ((o) this).field_c;
        param0.field_e = ((o) this).field_e;
        param0.field_l = ((o) this).field_l;
        param0.field_r = ((o) this).field_r;
        param0.field_b = ((o) this).field_b;
        param0.field_f = ((o) this).field_f;
        param0.field_g = ((o) this).field_g;
        param0.field_d = ((o) this).field_d;
        param0.field_h = ((o) this).field_h;
        param0.field_j = ((o) this).field_j;
        param0.field_i = ((o) this).field_i;
        param0.field_p = ((o) this).field_p;
        if (param1 != 42) {
            Object var4 = null;
            ((o) this).a(107, -23, -128, -77, 34, (vg) null);
        }
    }

    protected o() {
    }

    o(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((o) this).field_b = param3;
        ((o) this).field_l = param8;
        ((o) this).field_f = param4;
        ((o) this).field_o = param1;
        ((o) this).field_c = param0;
        ((o) this).field_h = param6;
        ((o) this).field_p = param5;
        ((o) this).field_d = param12 ? true : false;
        ((o) this).field_j = param9;
        ((o) this).field_e = param11;
        ((o) this).field_r = param7;
        ((o) this).field_g = param2;
        ((o) this).field_i = param10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Accept";
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_n = 3;
        field_q = "Inviting <%0>";
    }
}
