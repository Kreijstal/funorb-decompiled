/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l implements cg, va {
    int field_b;
    private int field_i;
    int field_k;
    int field_a;
    static he[][] field_f;
    int field_m;
    static int field_q;
    int field_d;
    int field_o;
    private boolean field_r;
    static int[][] field_n;
    int field_j;
    int field_l;
    static String field_h;
    int field_c;
    static String[] field_e;
    int field_p;
    static String field_s;
    rf field_g;

    private final int a(int param0, int param1, vg param2, int param3) {
        if (param3 < 54) {
            ((l) this).field_a = 17;
            return param2.field_t + ((l) this).field_j + (param2.field_o + param0 - -param1);
        }
        return param2.field_t + ((l) this).field_j + (param2.field_o + param0 - -param1);
    }

    private final void a(int param0, int param1, int param2, vg param3) {
        this.a(((l) this).field_o, param0, 0, param2, (byte) -128, ((l) this).field_i, param1, param3);
    }

    l(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, int param1, int param2, vg param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        em var17 = null;
        em var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 <= -50) {
          if ((param0 ^ -1) != (param5 ^ -1)) {
            L0: {
              if (!param3.a(true)) {
                break L0;
              } else {
                L1: {
                  var17 = ((l) this).a(param3, true);
                  var18 = var17;
                  if ((param0 ^ -1) >= (param5 ^ -1)) {
                    var8 = param0;
                    var9 = param5;
                    break L1;
                  } else {
                    var8 = param5;
                    var9 = param0;
                    break L1;
                  }
                }
                var10 = var18.b(var8, -12280);
                var11 = var18.b(var9, -12280);
                ib.a(param1 - -param3.field_m, param3.field_k + (param1 - -param3.field_m), (byte) 118, param3.field_w + (param3.field_o + param4), param4 - -param3.field_o);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    cl.d((byte) -68);
                    break L0;
                  } else {
                    L3: {
                      var13 = var17.field_a[var12];
                      if ((var12 ^ -1) != (var10 ^ -1)) {
                        stackOut_12_0 = var13.field_a[0];
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = var18.a(89, var8);
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_13_0;
                      if (var11 == var12) {
                        stackOut_17_0 = var18.a(-76, var9);
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        if (var13 != null) {
                          stackOut_16_0 = var13.field_a[var13.field_a.length - 1];
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
                    ja.field_Q.a(false, ((l) this).field_b, -var14 + var15, ((l) this).field_b >>> -984700872, param3.field_q + ((l) this).field_d + (param3.field_m + param1) - -var13.field_e, var13.field_b, this.a(param4, var14, param3, 123));
                    var12++;
                    continue L2;
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final int a(byte param0) {
        if (param0 > -114) {
            Object var3 = null;
            int discarded$0 = this.a(65, (vg) null, -54, (byte) -62);
            return ((l) this).field_g.field_x - -((l) this).field_g.field_S;
        }
        return ((l) this).field_g.field_x - -((l) this).field_g.field_S;
    }

    public final int a(int param0, vg param1) {
        em discarded$6 = ((l) this).a(param1, true);
        if (param0 != 170) {
            return 20;
        }
        return param1.field_s.b(param0 + 19941) + (((l) this).field_d - -((l) this).field_m);
    }

    public final int a(vg param0, int param1, int param2, int param3, int param4, int param5) {
        em discarded$6 = ((l) this).a(param0, true);
        if (param4 != 3) {
            ((l) this).field_r = true;
            return param0.field_s.a(-((l) this).a(param0, 1540021377, param1) + param5, param4 + -3, param3 - ((l) this).a(param0, param2, (byte) 60));
        }
        return param0.field_s.a(-((l) this).a(param0, 1540021377, param1) + param5, param4 + -3, param3 - ((l) this).a(param0, param2, (byte) 60));
    }

    private final int a(int param0, vg param1, int param2, byte param3) {
        int var5 = -58 % ((57 - param3) / 54);
        return param1.field_q + (((l) this).field_d + param2 - (-param1.field_m - param0));
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
            l.a(-83);
            if (null == pi.field_V) {
                return false;
            }
            if (!pi.field_V.a(-30292)) {
                return false;
            }
            return true;
        }
        if (null == pi.field_V) {
            return false;
        }
        if (!pi.field_V.a(-30292)) {
            return false;
        }
        return true;
    }

    public void a(boolean param0, int param1, vg param2, int param3, int param4) {
        if (param1 < 94) {
            return;
        }
        if (!(((l) this).field_g != null)) {
            return;
        }
        this.a(param3, 0, param4, param2);
    }

    public final int a(vg param0, int param1) {
        int var3 = -21 / ((-35 - param1) / 48);
        return -((l) this).field_k + (-((l) this).field_j + param0.field_w);
    }

    public final int a(byte param0, vg param1) {
        if (param0 != 48) {
            Object var4 = null;
            this.a(76, -76, 54, -23, (byte) -66, 2, -19, (vg) null);
            em discarded$0 = ((l) this).a(param1, true);
            return param1.field_s.a(param0 ^ -17335) + (((l) this).field_j + ((l) this).field_k);
        }
        em discarded$1 = ((l) this).a(param1, true);
        return param1.field_s.a(param0 ^ -17335) + (((l) this).field_j + ((l) this).field_k);
    }

    public final em a(vg param0, boolean param1) {
        if (!(null != param0.field_s)) {
            param0.field_s = (em) (Object) new o();
        }
        if (((l) this).field_r) {
            ((o) (Object) param0.field_s).a(((l) this).field_g, ((l) this).a(param0, -83), ((l) this).field_p, -3, ((l) this).field_a, ((l) this).b(-121, param0), ((l) this).field_c, this.b((byte) -127, param0));
            if (param1) {
                return param0.field_s;
            }
            boolean discarded$0 = l.b(13);
            return param0.field_s;
        }
        this.b(param0, -2);
        if (param1) {
            return param0.field_s;
        }
        boolean discarded$1 = l.b(13);
        return param0.field_s;
    }

    private final void b(vg param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != -2) {
          L0: {
            var8 = null;
            this.a(95, -105, 14, 89, (byte) -60, 25, -3, (vg) null);
            if (null == param0.field_s) {
              param0.field_s = (em) (Object) new o();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var3 = ((l) this).a(param0, -117);
            var4 = this.b((byte) -128, param0);
            var6 = ((l) this).field_c;
            if (0 != var6) {
              if (2 != var6) {
                if (var6 != 3) {
                  if ((var6 ^ -1) != -2) {
                    L2: {
                      var5 = (-((l) this).field_g.field_S + var4 + -((l) this).field_g.field_x >> -761187679) + ((l) this).field_g.field_x;
                      var6 = ((l) this).field_p;
                      if ((var6 ^ -1) == -1) {
                        break L2;
                      } else {
                        if (var6 == 3) {
                          break L2;
                        } else {
                          L3: {
                            if (-2 == (var6 ^ -1)) {
                              if (!(param0.field_s instanceof o)) {
                                break L3;
                              } else {
                                ((o) (Object) param0.field_s).a(((l) this).field_g, var3 >> 1540021377, var5, ((l) this).b(-116, param0), false);
                                return;
                              }
                            } else {
                              if (var6 == 2) {
                                if (param0.field_s instanceof o) {
                                  ((o) (Object) param0.field_s).a(((l) this).field_g, var3, false, var5, ((l) this).b(-108, param0));
                                  break L3;
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (param0.field_s instanceof o) {
                      ((o) (Object) param0.field_s).a(((l) this).field_g, ((l) this).b(-120, param0), 0, var5, param1 ^ -2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L4: {
                      var5 = (-((l) this).field_g.field_S + var4 + -((l) this).field_g.field_x >> -761187679) + ((l) this).field_g.field_x;
                      var6 = ((l) this).field_p;
                      if ((var6 ^ -1) == -1) {
                        break L4;
                      } else {
                        if (var6 == 3) {
                          break L4;
                        } else {
                          L5: {
                            if (-2 == (var6 ^ -1)) {
                              if (!(param0.field_s instanceof o)) {
                                break L5;
                              } else {
                                ((o) (Object) param0.field_s).a(((l) this).field_g, var3 >> 1540021377, var5, ((l) this).b(-116, param0), false);
                                return;
                              }
                            } else {
                              if (var6 == 2) {
                                if (param0.field_s instanceof o) {
                                  ((o) (Object) param0.field_s).a(((l) this).field_g, var3, false, var5, ((l) this).b(-108, param0));
                                  break L5;
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (param0.field_s instanceof o) {
                      ((o) (Object) param0.field_s).a(((l) this).field_g, ((l) this).b(-120, param0), 0, var5, param1 ^ -2);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  var5 = (-((l) this).field_g.field_S + var4 + -((l) this).field_g.field_x >> -761187679) + ((l) this).field_g.field_x;
                  break L1;
                }
              } else {
                L6: {
                  var5 = -((l) this).field_g.field_S + var4;
                  var6 = ((l) this).field_p;
                  if ((var6 ^ -1) == -1) {
                    break L6;
                  } else {
                    if (var6 == 3) {
                      break L6;
                    } else {
                      L7: {
                        if (-2 == (var6 ^ -1)) {
                          if (!(param0.field_s instanceof o)) {
                            break L7;
                          } else {
                            ((o) (Object) param0.field_s).a(((l) this).field_g, var3 >> 1540021377, var5, ((l) this).b(-116, param0), false);
                            return;
                          }
                        } else {
                          if (var6 == 2) {
                            if (param0.field_s instanceof o) {
                              ((o) (Object) param0.field_s).a(((l) this).field_g, var3, false, var5, ((l) this).b(-108, param0));
                              break L7;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0.field_s instanceof o) {
                  ((o) (Object) param0.field_s).a(((l) this).field_g, ((l) this).b(-120, param0), 0, var5, param1 ^ -2);
                  return;
                } else {
                  return;
                }
              }
            } else {
              var5 = ((l) this).field_g.field_x;
              break L1;
            }
          }
          L8: {
            var6 = ((l) this).field_p;
            if ((var6 ^ -1) == -1) {
              break L8;
            } else {
              if (var6 == 3) {
                break L8;
              } else {
                L9: {
                  if (-2 == (var6 ^ -1)) {
                    if (!(param0.field_s instanceof o)) {
                      break L9;
                    } else {
                      ((o) (Object) param0.field_s).a(((l) this).field_g, var3 >> 1540021377, var5, ((l) this).b(-116, param0), false);
                      return;
                    }
                  } else {
                    if (var6 == 2) {
                      if (param0.field_s instanceof o) {
                        ((o) (Object) param0.field_s).a(((l) this).field_g, var3, false, var5, ((l) this).b(-108, param0));
                        break L9;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          if (param0.field_s instanceof o) {
            ((o) (Object) param0.field_s).a(((l) this).field_g, ((l) this).b(-120, param0), 0, var5, param1 ^ -2);
            return;
          } else {
            return;
          }
        } else {
          L10: {
            if (null == param0.field_s) {
              param0.field_s = (em) (Object) new o();
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            var3 = ((l) this).a(param0, -117);
            var4 = this.b((byte) -128, param0);
            var6 = ((l) this).field_c;
            if (0 != var6) {
              if (2 != var6) {
                L12: {
                  if (var6 != 3) {
                    if ((var6 ^ -1) != -2) {
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                var5 = (-((l) this).field_g.field_S + var4 + -((l) this).field_g.field_x >> -761187679) + ((l) this).field_g.field_x;
                break L11;
              } else {
                L13: {
                  L14: {
                    var5 = -((l) this).field_g.field_S + var4;
                    var6 = ((l) this).field_p;
                    if ((var6 ^ -1) == -1) {
                      break L14;
                    } else {
                      if (var6 == 3) {
                        break L14;
                      } else {
                        if (-2 == (var6 ^ -1)) {
                          if (!(param0.field_s instanceof o)) {
                            break L13;
                          } else {
                            ((o) (Object) param0.field_s).a(((l) this).field_g, var3 >> 1540021377, var5, ((l) this).b(-116, param0), false);
                            break L13;
                          }
                        } else {
                          if (var6 == 2) {
                            if (param0.field_s instanceof o) {
                              ((o) (Object) param0.field_s).a(((l) this).field_g, var3, false, var5, ((l) this).b(-108, param0));
                              break L13;
                            } else {
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  if (param0.field_s instanceof o) {
                    ((o) (Object) param0.field_s).a(((l) this).field_g, ((l) this).b(-120, param0), 0, var5, param1 ^ -2);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              }
            } else {
              var5 = ((l) this).field_g.field_x;
              break L11;
            }
          }
          L15: {
            var6 = ((l) this).field_p;
            if ((var6 ^ -1) == -1) {
              break L15;
            } else {
              if (var6 == 3) {
                break L15;
              } else {
                L16: {
                  if (-2 == (var6 ^ -1)) {
                    if (!(param0.field_s instanceof o)) {
                      break L16;
                    } else {
                      ((o) (Object) param0.field_s).a(((l) this).field_g, var3 >> 1540021377, var5, ((l) this).b(-116, param0), false);
                      return;
                    }
                  } else {
                    if (var6 == 2) {
                      if (param0.field_s instanceof o) {
                        ((o) (Object) param0.field_s).a(((l) this).field_g, var3, false, var5, ((l) this).b(-108, param0));
                        break L16;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          if (param0.field_s instanceof o) {
            ((o) (Object) param0.field_s).a(((l) this).field_g, ((l) this).b(-120, param0), 0, var5, param1 ^ -2);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, vg param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ib.a(param1 - -param7.field_m, param7.field_m + param1 + param7.field_k, (byte) 29, param3 + param7.field_o - -param7.field_w, param7.field_o + param3);
        var9 = ((l) this).a(param7, 56);
        if (param4 == -128) {
          var10 = this.b((byte) -116, param7);
          if (!((l) this).field_r) {
            var12 = ((l) this).field_c;
            if ((var12 ^ -1) != -1) {
              if (var12 != 2) {
                if (3 != var12) {
                  if (var12 == 1) {
                    var11 = ((l) this).field_g.field_x + (-((l) this).field_g.field_S + (var10 + -((l) this).field_g.field_x) >> 210942369);
                    var12 = ((l) this).field_p;
                    if (0 != var12) {
                      if (3 != var12) {
                        if (var12 != 1) {
                          if ((var12 ^ -1) != -3) {
                            cl.d((byte) -80);
                            return;
                          } else {
                            ((l) this).field_g.a(((l) this).b(-115, param7), this.a(param3, param6, param7, 84) + var9, this.a(param2, param7, param1, (byte) -118) + var11, param0, param5);
                            cl.d((byte) -80);
                            return;
                          }
                        } else {
                          ((l) this).field_g.b(((l) this).b(param4 + 5, param7), (var9 >> -629822335) + this.a(param3, param6, param7, 75), var11 + this.a(param2, param7, param1, (byte) 121), param0, param5);
                          cl.d((byte) -80);
                          return;
                        }
                      } else {
                        ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                        cl.d((byte) -80);
                        return;
                      }
                    } else {
                      ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                      cl.d((byte) -80);
                      return;
                    }
                  } else {
                    var11 = ((l) this).field_g.field_x + (-((l) this).field_g.field_S + (var10 + -((l) this).field_g.field_x) >> 210942369);
                    var12 = ((l) this).field_p;
                    if (0 != var12) {
                      if (3 != var12) {
                        if (var12 != 1) {
                          if ((var12 ^ -1) != -3) {
                            cl.d((byte) -80);
                            return;
                          } else {
                            ((l) this).field_g.a(((l) this).b(-115, param7), this.a(param3, param6, param7, 84) + var9, this.a(param2, param7, param1, (byte) -118) + var11, param0, param5);
                            cl.d((byte) -80);
                            return;
                          }
                        } else {
                          ((l) this).field_g.b(((l) this).b(param4 + 5, param7), (var9 >> -629822335) + this.a(param3, param6, param7, 75), var11 + this.a(param2, param7, param1, (byte) 121), param0, param5);
                          cl.d((byte) -80);
                          return;
                        }
                      } else {
                        ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                        cl.d((byte) -80);
                        return;
                      }
                    } else {
                      ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                      cl.d((byte) -80);
                      return;
                    }
                  }
                } else {
                  L0: {
                    var11 = ((l) this).field_g.field_x + (-((l) this).field_g.field_S + (var10 + -((l) this).field_g.field_x) >> 210942369);
                    var12 = ((l) this).field_p;
                    if (0 != var12) {
                      if (3 != var12) {
                        if (var12 != 1) {
                          if ((var12 ^ -1) != -3) {
                            cl.d((byte) -80);
                            return;
                          } else {
                            ((l) this).field_g.a(((l) this).b(-115, param7), this.a(param3, param6, param7, 84) + var9, this.a(param2, param7, param1, (byte) -118) + var11, param0, param5);
                            cl.d((byte) -80);
                            return;
                          }
                        } else {
                          ((l) this).field_g.b(((l) this).b(param4 + 5, param7), (var9 >> -629822335) + this.a(param3, param6, param7, 75), var11 + this.a(param2, param7, param1, (byte) 121), param0, param5);
                          cl.d((byte) -80);
                          return;
                        }
                      } else {
                        break L0;
                      }
                    } else {
                      break L0;
                    }
                  }
                  ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                  cl.d((byte) -80);
                  return;
                }
              } else {
                var11 = -((l) this).field_g.field_S + var10;
                var12 = ((l) this).field_p;
                if (0 != var12) {
                  if (3 != var12) {
                    if (var12 != 1) {
                      if ((var12 ^ -1) != -3) {
                        cl.d((byte) -80);
                        return;
                      } else {
                        ((l) this).field_g.a(((l) this).b(-115, param7), this.a(param3, param6, param7, 84) + var9, this.a(param2, param7, param1, (byte) -118) + var11, param0, param5);
                        cl.d((byte) -80);
                        return;
                      }
                    } else {
                      ((l) this).field_g.b(((l) this).b(param4 + 5, param7), (var9 >> -629822335) + this.a(param3, param6, param7, 75), var11 + this.a(param2, param7, param1, (byte) 121), param0, param5);
                      cl.d((byte) -80);
                      return;
                    }
                  } else {
                    ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                    cl.d((byte) -80);
                    return;
                  }
                } else {
                  ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                  cl.d((byte) -80);
                  return;
                }
              }
            } else {
              var11 = ((l) this).field_g.field_x;
              var12 = ((l) this).field_p;
              if (0 != var12) {
                if (3 != var12) {
                  if (var12 != 1) {
                    if ((var12 ^ -1) != -3) {
                      cl.d((byte) -80);
                      return;
                    } else {
                      ((l) this).field_g.a(((l) this).b(-115, param7), this.a(param3, param6, param7, 84) + var9, this.a(param2, param7, param1, (byte) -118) + var11, param0, param5);
                      cl.d((byte) -80);
                      return;
                    }
                  } else {
                    ((l) this).field_g.b(((l) this).b(param4 + 5, param7), (var9 >> -629822335) + this.a(param3, param6, param7, 75), var11 + this.a(param2, param7, param1, (byte) 121), param0, param5);
                    cl.d((byte) -80);
                    return;
                  }
                } else {
                  ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                  cl.d((byte) -80);
                  return;
                }
              } else {
                ((l) this).field_g.c(((l) this).b(param4 ^ 22, param7), this.a(param3, param6, param7, 87), this.a(param2, param7, param1, (byte) 125) - -var11, param0, param5);
                cl.d((byte) -80);
                return;
              }
            }
          } else {
            int discarded$1 = ((l) this).field_g.a(((l) this).b(-114, param7), this.a(param3, param6, param7, 99), this.a(param2, param7, param1, (byte) -81), var9, var10, param0, param5, ((l) this).field_p, ((l) this).field_c, ((l) this).field_a);
            cl.d((byte) -80);
            return;
          }
        } else {
          return;
        }
    }

    public final int a(vg param0, int param1, byte param2) {
        int var4 = 59 % ((-5 - param2) / 61);
        return this.a(0, param0, param1, (byte) -36);
    }

    private final int b(byte param0, vg param1) {
        if (param0 >= -114) {
            Object var4 = null;
            ((l) this).a(-12, -1, (vg) null, -112, (byte) -125);
            return -((l) this).field_d + param1.field_k - ((l) this).field_m;
        }
        return -((l) this).field_d + param1.field_k - ((l) this).field_m;
    }

    final void a(l param0, int param1) {
        int var3 = 124 % ((15 - param1) / 39);
        param0.field_l = ((l) this).field_l;
        param0.field_d = ((l) this).field_d;
        param0.field_b = ((l) this).field_b;
        param0.field_i = ((l) this).field_i;
        param0.field_m = ((l) this).field_m;
        param0.field_r = ((l) this).field_r;
        param0.field_p = ((l) this).field_p;
        param0.field_a = ((l) this).field_a;
        param0.field_j = ((l) this).field_j;
        param0.field_g = ((l) this).field_g;
        param0.field_o = ((l) this).field_o;
        param0.field_c = ((l) this).field_c;
        param0.field_k = ((l) this).field_k;
    }

    public static void a(int param0) {
        field_s = null;
        field_f = null;
        field_h = null;
        field_n = null;
        field_e = null;
        if (param0 != 0) {
            field_n = null;
        }
    }

    protected l() {
    }

    public final int a(vg param0, int param1, int param2) {
        if (param1 != 1540021377) {
            ((l) this).field_d = -102;
            return this.a(param2, 0, param0, 117);
        }
        return this.a(param2, 0, param0, 117);
    }

    l(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((l) this).field_d = param3;
        ((l) this).field_j = param1;
        ((l) this).field_a = param9;
        ((l) this).field_c = param8;
        ((l) this).field_k = param2;
        ((l) this).field_i = param6;
        ((l) this).field_l = param10;
        ((l) this).field_m = param4;
        ((l) this).field_p = param7;
        ((l) this).field_g = param0;
        ((l) this).field_b = param11;
        ((l) this).field_o = param5;
        ((l) this).field_r = param12 ? true : false;
    }

    public final void a(int param0, int param1, vg param2, int param3, byte param4) {
        em var13 = null;
        em var14 = null;
        int var7 = 0;
        mi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param2.a(true))) {
            var13 = ((l) this).a(param2, true);
            var14 = var13;
            var7 = var14.b(param3, -12280);
            var8 = var13.field_a[var7];
            var9 = var14.a(-98, param3);
            var10 = this.a(param1, var9, param2, 107);
            var11 = ((l) this).a(param2, param0, (byte) -101) - -Math.max(0, var8.field_e);
            var12 = ((l) this).a(param2, param0, (byte) 63) + Math.min(this.b((byte) -116, param2), Math.min(var8.field_b, var14.field_a.length <= var7 + 1 ? var8.field_b : var13.field_a[var7 - -1].field_e));
            ib.a(param0 - -param2.field_m, param0 - -param2.field_m + param2.field_k, (byte) 71, param2.field_w + param1 - -param2.field_o, param2.field_o + param1);
            ja.field_Q.a((byte) 95, var12, var10, var10, ((l) this).field_l, var11);
            cl.d((byte) -116);
        }
        if (param4 != -90) {
            field_f = null;
            return;
        }
    }

    String b(int param0, vg param1) {
        if (param0 >= -101) {
            return null;
        }
        return param1.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = -1;
        field_e = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_f = new he[9][2];
        field_h = " buildings): ";
        field_n = new int[][]{new int[8], new int[1], new int[1], new int[3], new int[1], new int[1], new int[3], new int[1], new int[1]};
        field_s = "Waiting for levels";
    }
}
