/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pn extends ei {
    private int field_Q;
    private int field_S;
    private int field_P;
    private int field_O;
    static String[] field_R;
    private int field_L;
    private int field_N;
    static String field_M;

    void l(int param0) {
        if (param0 != -7476) {
            pn.k(10);
        }
    }

    boolean e(byte param0) {
        ((pn) this).f((byte) -45);
        if (param0 != 28) {
            field_R = null;
            return super.e((byte) 28);
        }
        return super.e((byte) 28);
    }

    void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        var16 = ZombieDawn.field_J;
        bi.f(6 + param0, param1 + 35, -12 + ((pn) this).field_i, ((pn) this).field_n - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var4 <= var7) {
            L1: {
              if (param2 <= -111) {
                break L1;
              } else {
                ((pn) this).a(-128, -39, (byte) -12);
                break L1;
              }
            }
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = param1 + 35;
            L2: while (true) {
              if (var4 <= var7) {
                we.field_Tb.b(((pn) this).field_i + param0 + -90, 10 + param1);
                ke.a(65, param0 + 5, ad.field_f, -10 + ((pn) this).field_i, param1 - -35);
                ke.a(79, param0, dp.field_b, ((pn) this).field_i, param1 - -((pn) this).field_n + -22);
                var6 = 127;
                var5 = 169;
                var4 = -79 + ((pn) this).field_n;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 - -(var7 * (var6 - var5) / var4);
                    var9 = var9 | (var9 << 1118479592 | var9 << -279127888);
                    bi.b(param0, var8, 6, var9);
                    bi.b(((pn) this).field_i + (param0 - 6), var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + (-var5 + var6) * var7 / var4;
                var9 = var9 | (var9 << -877822640 | var9 << -1941046328);
                bi.b(param0, var8, 6, var9);
                bi.b(param0 + ((pn) this).field_i - 6, var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (var8 >= bi.field_l) {
              if (var8 < bi.field_d) {
                L4: {
                  var9 = var7 * (var6 - var5) / var4 + var5;
                  var10 = 0;
                  var11 = ((pn) this).field_i;
                  if (20 < var7) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (-21 > (var10 ^ -1)) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                        if (var12 <= 462) {
                          if (-421 < (var12 ^ -1)) {
                            break L4;
                          } else {
                            var13 = var9 * (462 + -var12) / 42;
                            var13 = var13 | (var13 << 59491088 | var13 << -2000922872);
                            bi.field_c[param0 + var8 * bi.field_f + var10] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 < var7) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var13 ^ -1) < -21) {
                          break L8;
                        } else {
                          var14 = (20 - var7) * (-var7 + 20) - -(var13 * var13);
                          if ((var14 ^ -1) < -463) {
                            break L8;
                          } else {
                            if (var14 >= 420) {
                              var15 = var9 * (-var14 + 462) / 42;
                              var15 = var15 | (var15 << 189923984 | var15 << -1535391544);
                              bi.field_c[var8 * bi.field_f + param0 - -var11] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var12 = var11 + 1;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << 907569456 | var9 << 530995592);
                bi.b(param0 + var10, var8, var11 + -var10, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        Object var4 = null;
        if (param1 >= -32) {
          pn.k(-15);
          var4 = null;
          gl.a(-753, (String) null, param0, param2);
          return;
        } else {
          var4 = null;
          gl.a(-753, (String) null, param0, param2);
          return;
        }
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 == 2634) {
          if (-1 > (((pn) this).field_Q ^ -1)) {
            var2 = ((pn) this).field_N;
            var3 = ((pn) this).field_O;
            ((pn) this).field_L = ((pn) this).field_L + 1;
            if (((pn) this).field_L + 1 < ((pn) this).field_Q) {
              var4 = (((pn) this).field_Q * 2 + -((pn) this).field_L) * ((pn) this).field_L;
              var5 = ((pn) this).field_Q * ((pn) this).field_Q;
              var3 = ((pn) this).field_S - -(var4 * (((pn) this).field_O + -((pn) this).field_S) / var5);
              var2 = (-((pn) this).field_P + ((pn) this).field_N) * var4 / var5 + ((pn) this).field_P;
              ((pn) this).a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            } else {
              ((pn) this).field_Q = 0;
              ((pn) this).l(param0 + -10110);
              ((pn) this).a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        } else {
          ((pn) this).f((byte) -55);
          if (-1 > (((pn) this).field_Q ^ -1)) {
            var2 = ((pn) this).field_N;
            var3 = ((pn) this).field_O;
            ((pn) this).field_L = ((pn) this).field_L + 1;
            if (((pn) this).field_L + 1 >= ((pn) this).field_Q) {
              ((pn) this).field_Q = 0;
              ((pn) this).l(param0 + -10110);
              ((pn) this).a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            } else {
              var4 = (((pn) this).field_Q * 2 + -((pn) this).field_L) * ((pn) this).field_L;
              var5 = ((pn) this).field_Q * ((pn) this).field_Q;
              var3 = ((pn) this).field_S - -(var4 * (((pn) this).field_O + -((pn) this).field_S) / var5);
              var2 = (-((pn) this).field_P + ((pn) this).field_N) * var4 / var5 + ((pn) this).field_P;
              ((pn) this).a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        }
    }

    void f(byte param0) {
        if (!(((pn) this).field_Q > 0)) {
            return;
        }
        ((pn) this).a((byte) 90, ((pn) this).field_O, ((pn) this).field_N);
        int var2 = 97 % ((22 - param0) / 59);
        ((pn) this).field_Q = 0;
        ((pn) this).l(-7476);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (0 < param3) {
          ((pn) this).field_S = ((pn) this).field_n;
          ((pn) this).field_L = 0;
          if (param0) {
            ((pn) this).field_L = 20;
            ((pn) this).field_O = param1;
            ((pn) this).field_N = param2;
            ((pn) this).field_Q = param3;
            ((pn) this).field_P = ((pn) this).field_i;
            return;
          } else {
            ((pn) this).field_O = param1;
            ((pn) this).field_N = param2;
            ((pn) this).field_Q = param3;
            ((pn) this).field_P = ((pn) this).field_i;
            return;
          }
        } else {
          ((pn) this).a((byte) 98, param1, param2);
          return;
        }
    }

    final static void a(wk param0, int param1, ub param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        if (ac.field_m >= -1563) {
          var3 = 11;
          if (param1 != 152) {
            field_R = null;
            var4 = ac.field_m % var3;
            if (-1 == (ac.field_m % var3 ^ -1)) {
              L0: {
                lg.a(2 + var4 % (2 * var3) / var3 * 2, (byte) -90);
                if (-1.0f != oc.field_c) {
                  break L0;
                } else {
                  oc.field_c = (float)param0.field_c;
                  break L0;
                }
              }
              L1: {
                if (240.0f >= oc.field_c) {
                  break L1;
                } else {
                  oc.field_c = oc.field_c - i.field_V;
                  param0.field_c = (int)oc.field_c;
                  break L1;
                }
              }
              if (-1563 == (ac.field_m ^ -1)) {
                L2: {
                  if (null == qj.field_f) {
                    break L2;
                  } else {
                    if (!qj.field_f.l()) {
                      pc.a((byte) 13, qj.field_f);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                ch.b(124);
                hm.a(9);
                ZombieDawn.b(116, wi.field_a);
                qb.a(false, wc.field_Rb);
                wo.field_wb = true;
                return;
              } else {
                L3: {
                  if (ac.field_m >= -991) {
                    if (990 == ac.field_m) {
                      wi.field_a = ce.field_u;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    L4: {
                      var5 = 256 + (-ac.field_m + 990);
                      if (-1 > var5) {
                        var5 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ZombieDawn.b(param1 + -30, wi.field_a * var5 >> -1067918552);
                    qb.a(false, var5 * wc.field_Rb >> 920776456);
                    vf.field_c.h(wc.field_Rb);
                    if (ac.field_m % 2 != 0) {
                      break L3;
                    } else {
                      param2.i(16777215);
                      if (100 == (ac.field_m - 990) / 2) {
                        hp.field_A.r((byte) -84);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (ac.field_m == -801) {
                  og.field_A = true;
                  fn discarded$3 = kh.a(64, false);
                  vf.field_c = kh.a(150, false);
                  dj.field_e.field_R.a(0, (le) (Object) ne.field_c);
                  var5 = 0;
                  L5: while (true) {
                    if (pl.field_t.length <= var5) {
                      L6: {
                        dj.field_e.field_R.a(0, (le) (Object) new jj(370, 550));
                        if ((ac.field_m ^ -1) < -141) {
                          L7: {
                            if (0.0f >= i.field_V) {
                              break L7;
                            } else {
                              if (0 == ac.field_m % 20) {
                                i.field_V = i.field_V - 0.4000000059604645f;
                                break L7;
                              } else {
                                L8: {
                                  if (i.field_V < 0.0f) {
                                    i.field_V = 0.0f;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                return;
                              }
                            }
                          }
                          if (i.field_V < 0.0f) {
                            i.field_V = 0.0f;
                            break L6;
                          } else {
                            return;
                          }
                        } else {
                          if (ac.field_m > 30) {
                            if (ac.field_m % 20 != 0) {
                              break L6;
                            } else {
                              if (1.7 > (double)i.field_V) {
                                i.field_V = i.field_V + 0.30000001192092896f;
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      dj.field_e.field_R.a(0, (le) (Object) pl.field_t[var5]);
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  if (-951 != ac.field_m) {
                    if (ac.field_m != 700) {
                      if (-701 >= (ac.field_m ^ -1)) {
                        if ((ac.field_m ^ -1) > -991) {
                          L9: {
                            var5 = 256 * (-700 + ac.field_m) / 50;
                            if ((var5 ^ -1) < -257) {
                              var5 = 256;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            nc.field_r.h(wc.field_Rb * var5 >> 1680868296);
                            if ((ac.field_m ^ -1) < -141) {
                              L11: {
                                if (0.0f >= i.field_V) {
                                  break L11;
                                } else {
                                  if (0 == ac.field_m % 20) {
                                    i.field_V = i.field_V - 0.4000000059604645f;
                                    break L11;
                                  } else {
                                    L12: {
                                      if (i.field_V < 0.0f) {
                                        i.field_V = 0.0f;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                              if (i.field_V < 0.0f) {
                                i.field_V = 0.0f;
                                break L10;
                              } else {
                                return;
                              }
                            } else {
                              if (ac.field_m > 30) {
                                if (ac.field_m % 20 != 0) {
                                  break L10;
                                } else {
                                  if (1.7 > (double)i.field_V) {
                                    i.field_V = i.field_V + 0.30000001192092896f;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          L13: {
                            if ((ac.field_m ^ -1) < -141) {
                              L14: {
                                if (0.0f >= i.field_V) {
                                  break L14;
                                } else {
                                  if (0 == ac.field_m % 20) {
                                    i.field_V = i.field_V - 0.4000000059604645f;
                                    break L14;
                                  } else {
                                    L15: {
                                      if (i.field_V < 0.0f) {
                                        i.field_V = 0.0f;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    return;
                                  }
                                }
                              }
                              if (i.field_V < 0.0f) {
                                i.field_V = 0.0f;
                                break L13;
                              } else {
                                return;
                              }
                            } else {
                              if (ac.field_m > 30) {
                                if (ac.field_m % 20 != 0) {
                                  break L13;
                                } else {
                                  if (1.7 > (double)i.field_V) {
                                    i.field_V = i.field_V + 0.30000001192092896f;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                          }
                          return;
                        }
                      } else {
                        L16: {
                          if ((ac.field_m ^ -1) < -141) {
                            L17: {
                              if (0.0f >= i.field_V) {
                                break L17;
                              } else {
                                if (0 == ac.field_m % 20) {
                                  i.field_V = i.field_V - 0.4000000059604645f;
                                  break L17;
                                } else {
                                  L18: {
                                    if (i.field_V < 0.0f) {
                                      i.field_V = 0.0f;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                            if (i.field_V < 0.0f) {
                              i.field_V = 0.0f;
                              break L16;
                            } else {
                              return;
                            }
                          } else {
                            if (ac.field_m > 30) {
                              if (ac.field_m % 20 != 0) {
                                break L16;
                              } else {
                                if (1.7 > (double)i.field_V) {
                                  i.field_V = i.field_V + 0.30000001192092896f;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      nc.field_r = jp.a((byte) 125, 152);
                      nc.field_r.h(0);
                      wc.field_Rb = ge.field_c;
                      if ((ac.field_m ^ -1) < -141) {
                        L19: {
                          if (0.0f >= i.field_V) {
                            break L19;
                          } else {
                            if (0 == ac.field_m % 20) {
                              i.field_V = i.field_V - 0.4000000059604645f;
                              break L19;
                            } else {
                              L20: {
                                if (i.field_V < 0.0f) {
                                  i.field_V = 0.0f;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              return;
                            }
                          }
                        }
                        if (i.field_V >= 0.0f) {
                          return;
                        } else {
                          i.field_V = 0.0f;
                          return;
                        }
                      } else {
                        if (ac.field_m > 30) {
                          if (ac.field_m % 20 == 0) {
                            if (1.7 > (double)i.field_V) {
                              i.field_V = i.field_V + 0.30000001192092896f;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    hp.field_A.q((byte) 111);
                    if ((ac.field_m ^ -1) < -141) {
                      L21: {
                        if (0.0f >= i.field_V) {
                          break L21;
                        } else {
                          if (0 == ac.field_m % 20) {
                            i.field_V = i.field_V - 0.4000000059604645f;
                            break L21;
                          } else {
                            L22: {
                              if (i.field_V < 0.0f) {
                                i.field_V = 0.0f;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (i.field_V < 0.0f) {
                        i.field_V = 0.0f;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (ac.field_m > 30) {
                        if (ac.field_m % 20 == 0) {
                          if (1.7 <= (double)i.field_V) {
                            return;
                          } else {
                            i.field_V = i.field_V + 0.30000001192092896f;
                            return;
                          }
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
            } else {
              L23: {
                if (-1.0f != oc.field_c) {
                  break L23;
                } else {
                  oc.field_c = (float)param0.field_c;
                  break L23;
                }
              }
              L24: {
                if (240.0f >= oc.field_c) {
                  break L24;
                } else {
                  oc.field_c = oc.field_c - i.field_V;
                  param0.field_c = (int)oc.field_c;
                  break L24;
                }
              }
              if (-1563 == (ac.field_m ^ -1)) {
                L25: {
                  if (null == qj.field_f) {
                    break L25;
                  } else {
                    if (!qj.field_f.l()) {
                      pc.a((byte) 13, qj.field_f);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
                ch.b(124);
                hm.a(9);
                ZombieDawn.b(116, wi.field_a);
                qb.a(false, wc.field_Rb);
                wo.field_wb = true;
                return;
              } else {
                L26: {
                  if (ac.field_m >= -991) {
                    if (990 == ac.field_m) {
                      wi.field_a = ce.field_u;
                      break L26;
                    } else {
                      break L26;
                    }
                  } else {
                    L27: {
                      var5 = 256 + (-ac.field_m + 990);
                      if (-1 > var5) {
                        var5 = 0;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    ZombieDawn.b(param1 + -30, wi.field_a * var5 >> -1067918552);
                    qb.a(false, var5 * wc.field_Rb >> 920776456);
                    vf.field_c.h(wc.field_Rb);
                    if (ac.field_m % 2 != 0) {
                      break L26;
                    } else {
                      param2.i(16777215);
                      if (100 == (ac.field_m - 990) / 2) {
                        hp.field_A.r((byte) -84);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                L28: {
                  if (ac.field_m == -801) {
                    og.field_A = true;
                    fn discarded$4 = kh.a(64, false);
                    vf.field_c = kh.a(150, false);
                    dj.field_e.field_R.a(0, (le) (Object) ne.field_c);
                    var5 = 0;
                    L29: while (true) {
                      if (pl.field_t.length <= var5) {
                        dj.field_e.field_R.a(0, (le) (Object) new jj(370, 550));
                        break L28;
                      } else {
                        dj.field_e.field_R.a(0, (le) (Object) pl.field_t[var5]);
                        var5++;
                        continue L29;
                      }
                    }
                  } else {
                    if (-951 != ac.field_m) {
                      if (ac.field_m != 700) {
                        if (-701 < (ac.field_m ^ -1)) {
                          break L28;
                        } else {
                          if ((ac.field_m ^ -1) > -991) {
                            L30: {
                              var5 = 256 * (-700 + ac.field_m) / 50;
                              if ((var5 ^ -1) < -257) {
                                var5 = 256;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            L31: {
                              nc.field_r.h(wc.field_Rb * var5 >> 1680868296);
                              if ((ac.field_m ^ -1) < -141) {
                                L32: {
                                  if (0.0f >= i.field_V) {
                                    break L32;
                                  } else {
                                    if (0 == ac.field_m % 20) {
                                      i.field_V = i.field_V - 0.4000000059604645f;
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                                if (i.field_V < 0.0f) {
                                  i.field_V = 0.0f;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              } else {
                                if (ac.field_m > 30) {
                                  if (ac.field_m % 20 != 0) {
                                    break L31;
                                  } else {
                                    if (1.7 > (double)i.field_V) {
                                      i.field_V = i.field_V + 0.30000001192092896f;
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                } else {
                                  break L31;
                                }
                              }
                            }
                            return;
                          } else {
                            break L28;
                          }
                        }
                      } else {
                        nc.field_r = jp.a((byte) 125, 152);
                        nc.field_r.h(0);
                        wc.field_Rb = ge.field_c;
                        break L28;
                      }
                    } else {
                      hp.field_A.q((byte) 111);
                      break L28;
                    }
                  }
                }
                if ((ac.field_m ^ -1) < -141) {
                  L33: {
                    if (0.0f >= i.field_V) {
                      break L33;
                    } else {
                      if (0 == ac.field_m % 20) {
                        i.field_V = i.field_V - 0.4000000059604645f;
                        break L33;
                      } else {
                        L34: {
                          if (i.field_V < 0.0f) {
                            i.field_V = 0.0f;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (i.field_V >= 0.0f) {
                    return;
                  } else {
                    i.field_V = 0.0f;
                    return;
                  }
                } else {
                  if (ac.field_m > 30) {
                    if (ac.field_m % 20 == 0) {
                      if (1.7 <= (double)i.field_V) {
                        return;
                      } else {
                        i.field_V = i.field_V + 0.30000001192092896f;
                        return;
                      }
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
            L35: {
              var4 = ac.field_m % var3;
              if (-1 != ac.field_m % var3) {
                break L35;
              } else {
                lg.a(2 + var4 % (2 * var3) / var3 * 2, (byte) -90);
                break L35;
              }
            }
            L36: {
              if (-1.0f != oc.field_c) {
                break L36;
              } else {
                oc.field_c = (float)param0.field_c;
                break L36;
              }
            }
            L37: {
              if (240.0f >= oc.field_c) {
                break L37;
              } else {
                oc.field_c = oc.field_c - i.field_V;
                param0.field_c = (int)oc.field_c;
                break L37;
              }
            }
            if (-1563 == (ac.field_m ^ -1)) {
              L38: {
                if (null == qj.field_f) {
                  break L38;
                } else {
                  if (!qj.field_f.l()) {
                    pc.a((byte) 13, qj.field_f);
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              ch.b(124);
              hm.a(9);
              ZombieDawn.b(116, wi.field_a);
              qb.a(false, wc.field_Rb);
              wo.field_wb = true;
              return;
            } else {
              L39: {
                if (ac.field_m >= -991) {
                  if (990 == ac.field_m) {
                    wi.field_a = ce.field_u;
                    break L39;
                  } else {
                    break L39;
                  }
                } else {
                  L40: {
                    var5 = 256 + (-ac.field_m + 990);
                    if (-1 > var5) {
                      var5 = 0;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  ZombieDawn.b(param1 + -30, wi.field_a * var5 >> -1067918552);
                  qb.a(false, var5 * wc.field_Rb >> 920776456);
                  vf.field_c.h(wc.field_Rb);
                  if (ac.field_m % 2 != 0) {
                    break L39;
                  } else {
                    param2.i(16777215);
                    if (100 == (ac.field_m - 990) / 2) {
                      hp.field_A.r((byte) -84);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
              }
              L41: {
                if (ac.field_m == -801) {
                  og.field_A = true;
                  fn discarded$5 = kh.a(64, false);
                  vf.field_c = kh.a(150, false);
                  dj.field_e.field_R.a(0, (le) (Object) ne.field_c);
                  var5 = 0;
                  L42: while (true) {
                    if (pl.field_t.length <= var5) {
                      dj.field_e.field_R.a(0, (le) (Object) new jj(370, 550));
                      break L41;
                    } else {
                      dj.field_e.field_R.a(0, (le) (Object) pl.field_t[var5]);
                      var5++;
                      continue L42;
                    }
                  }
                } else {
                  if (-951 != ac.field_m) {
                    if (ac.field_m != 700) {
                      if (-701 < (ac.field_m ^ -1)) {
                        break L41;
                      } else {
                        if ((ac.field_m ^ -1) > -991) {
                          L43: {
                            var5 = 256 * (-700 + ac.field_m) / 50;
                            if ((var5 ^ -1) < -257) {
                              var5 = 256;
                              break L43;
                            } else {
                              break L43;
                            }
                          }
                          L44: {
                            nc.field_r.h(wc.field_Rb * var5 >> 1680868296);
                            if ((ac.field_m ^ -1) < -141) {
                              L45: {
                                if (0.0f >= i.field_V) {
                                  break L45;
                                } else {
                                  if (0 == ac.field_m % 20) {
                                    i.field_V = i.field_V - 0.4000000059604645f;
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              if (i.field_V < 0.0f) {
                                i.field_V = 0.0f;
                                break L44;
                              } else {
                                break L44;
                              }
                            } else {
                              if (ac.field_m > 30) {
                                if (ac.field_m % 20 != 0) {
                                  break L44;
                                } else {
                                  if (1.7 > (double)i.field_V) {
                                    i.field_V = i.field_V + 0.30000001192092896f;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              } else {
                                break L44;
                              }
                            }
                          }
                          return;
                        } else {
                          break L41;
                        }
                      }
                    } else {
                      nc.field_r = jp.a((byte) 125, 152);
                      nc.field_r.h(0);
                      wc.field_Rb = ge.field_c;
                      break L41;
                    }
                  } else {
                    hp.field_A.q((byte) 111);
                    break L41;
                  }
                }
              }
              if ((ac.field_m ^ -1) < -141) {
                L46: {
                  if (0.0f >= i.field_V) {
                    break L46;
                  } else {
                    if (0 == ac.field_m % 20) {
                      i.field_V = i.field_V - 0.4000000059604645f;
                      break L46;
                    } else {
                      L47: {
                        if (i.field_V < 0.0f) {
                          i.field_V = 0.0f;
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      return;
                    }
                  }
                }
                if (i.field_V >= 0.0f) {
                  return;
                } else {
                  i.field_V = 0.0f;
                  return;
                }
              } else {
                if (ac.field_m > 30) {
                  if (ac.field_m % 20 == 0) {
                    if (1.7 <= (double)i.field_V) {
                      return;
                    } else {
                      i.field_V = i.field_V + 0.30000001192092896f;
                      return;
                    }
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
          return;
        }
    }

    public static void k(int param0) {
        field_R = null;
        int var1 = 47 % ((param0 - 29) / 37);
        field_M = null;
    }

    pn(dn param0, int param1, int param2) {
        super(param0, param1, param2);
        ((pn) this).field_Q = 0;
        ((pn) this).field_L = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "You have 1 unread message!";
    }
}
