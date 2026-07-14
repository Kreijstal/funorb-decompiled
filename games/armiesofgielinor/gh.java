/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends tj implements he {
    static String field_P;
    private int field_J;
    String field_I;
    private boolean field_F;
    static wk field_M;
    ka field_K;
    private fw field_E;
    boolean field_H;
    pp field_O;
    private fw field_N;
    private int field_G;
    ai field_Q;

    public static void a(int param0) {
        field_M = null;
        if (param0 != -11835) {
            return;
        }
        field_P = null;
    }

    private final void a(boolean param0, String param1) {
        if (!(null != ((gh) this).field_O.field_W)) {
            return;
        }
        int var3 = this.a(0, param1.toLowerCase());
        if (!(var3 != -1)) {
            return;
        }
        ((gh) this).field_O.field_T = var3;
        if (!param0) {
            ((gh) this).field_F = true;
        }
        this.n(107805154);
        ((gh) this).field_I = param1;
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((gh) this).field_J = -22;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((gh) this).field_F) {
              break L2;
            } else {
              if (!this.a(false)) {
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

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.a(param3, param4, param1, 8192, param0);
        int var6 = 2 % ((-8 - param2) / 44);
        ((gh) this).field_E.a(0, param4 + -20, 0, 8192, ((gh) this).field_J);
        ((gh) this).field_N.a(param4 - 20, 20, 0, 8192, ((gh) this).field_J);
        if (((gh) this).field_H) {
            ((gh) this).field_Q.a(0, param4, ((gh) this).field_J, 8192, param0 + -((gh) this).field_J);
        }
    }

    final boolean a(int param0, kb param1) {
        param1.f(1);
        if (param0 != 11) {
            return true;
        }
        ((gh) this).field_I = "";
        ((gh) this).field_F = true;
        if (null != ((gh) this).field_x) {
            if (((gh) this).field_x instanceof ie) {
                ((ie) (Object) ((gh) this).field_x).a((kb) this, ((gh) this).field_F, (byte) -41);
            }
        }
        return true;
    }

    final void g(byte param0) {
        if (!(!(((gh) this).field_x instanceof rp))) {
            ((rp) (Object) ((gh) this).field_x).a(-109, (gh) this);
        }
        if (param0 <= 4) {
            gh.a(-40);
        }
    }

    final boolean l(int param0) {
        if (param0 != 11180) {
            Object var3 = null;
            ((gh) this).a(-2, 83, 58, (kb) null);
        }
        return ((gh) this).field_H;
    }

    gh(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (kh) null);
        ((gh) this).field_I = "";
        ((gh) this).field_K = ArmiesOfGielinor.field_J;
        ((gh) this).field_O = new pp((gh) this, ((gh) this).field_K, param0, param1);
        ((gh) this).field_H = false;
        ((gh) this).field_O.field_x = (qo) this;
        ((gh) this).field_G = param2;
        ((gh) this).field_E = new fw("", (kh) (Object) new fk((gh) this), (qo) this);
        ((gh) this).field_N = new fw();
        ((gh) this).field_N.field_k = (kh) (Object) new gs();
        ((gh) this).field_N.field_x = (qo) this;
        ((gh) this).a((byte) 10, (kb) (Object) ((gh) this).field_E);
        ((gh) this).a((byte) 10, (kb) (Object) ((gh) this).field_N);
    }

    private final void k(int param0) {
        if (!(((gh) this).l(11180))) {
            return;
        }
        this.a(((gh) this).field_J, ((gh) this).field_p, (byte) -97, ((gh) this).field_B, ((gh) this).field_l);
        if (param0 >= -66) {
            Object var3 = null;
            int discarded$0 = this.a(-114, (String) null);
        }
        ((gh) this).field_H = false;
        ((gh) this).field_Q.d(124);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (param1 != 11) {
            ((gh) this).field_K = null;
        }
        if (!((gh) this).l(11180)) {
            this.m(param1 + -11);
        } else {
            this.k(-128);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        this.a(param0, param1, param2, param3);
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        if (param3 <= 103) {
            ((gh) this).f(-3);
        }
        return this.a(param0, param1, param2, 107, param4, param5, param6);
    }

    final static void f(byte param0) {
        int[] var1_ref_int__ = null;
        int var1 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          L1: {
            var4 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!as.field_B) {
              L2: {
                if (null == gu.field_b) {
                  gu.field_b = jc.b(-1, 4);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (gu.field_b.field_m) {
                  var18 = ei.field_e;
                  var14 = var18;
                  var12 = var14;
                  var10 = var12;
                  var5 = var10;
                  var1_ref_int__ = var5;
                  var19 = gu.field_b.field_l;
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= 8) {
                      var20 = i.field_Nb;
                      var16 = var20;
                      var13 = var16;
                      var11 = var13;
                      var7 = var11;
                      var1_ref_int__ = var7;
                      var21 = gu.field_b.field_l;
                      var9 = 0;
                      var3 = var9;
                      L5: while (true) {
                        if ((var9 ^ -1) <= -9) {
                          gu.field_b = null;
                          as.field_B = true;
                          jd.m(77);
                          if (rb.a(0, ei.field_e, 1)) {
                            rt.d((byte) 125);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          var7[var9] = rn.a(var20[var9], var21[var9] ^ -1);
                          var9++;
                          continue L5;
                        }
                      }
                    } else {
                      var5[var3] = oe.c(var18[var3], var19[var3]);
                      var3++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              if (as.field_B) {
                qj.h(-78);
                ws.b(true);
                if (-10 == (tg.field_a ^ -1)) {
                  if (!io.a(i.field_Nb, (byte) 116)) {
                    tg.field_a = 0;
                    break L1;
                  } else {
                    if (im.field_w) {
                      break L0;
                    } else {
                      if (de.field_a) {
                        break L0;
                      } else {
                        vl.field_n.h(32161, 69);
                        de.field_a = true;
                        break L0;
                      }
                    }
                  }
                } else {
                  if (im.field_w) {
                    break L0;
                  } else {
                    if (de.field_a) {
                      break L0;
                    } else {
                      vl.field_n.h(32161, 69);
                      de.field_a = true;
                      break L0;
                    }
                  }
                }
              } else {
                if (im.field_w) {
                  break L0;
                } else {
                  if (de.field_a) {
                    break L0;
                  } else {
                    vl.field_n.h(32161, 69);
                    de.field_a = true;
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (im.field_w) {
            break L0;
          } else {
            if (de.field_a) {
              break L0;
            } else {
              vl.field_n.h(32161, 69);
              de.field_a = true;
              break L0;
            }
          }
        }
        L6: {
          if (ve.field_b) {
            break L6;
          } else {
            if (af.field_c) {
              break L6;
            } else {
              vl.field_n.h(32161, 75);
              af.field_c = true;
              break L6;
            }
          }
        }
        L7: {
          var1 = -118 / ((16 - param0) / 35);
          if (sh.field_h) {
            break L7;
          } else {
            L8: {
              if (null != jr.field_f) {
                break L8;
              } else {
                jr.field_f = fq.a(14663, 6);
                break L8;
              }
            }
            if (!jr.field_f.field_n) {
              break L7;
            } else {
              L9: {
                if (null == jr.field_f.field_s) {
                  break L9;
                } else {
                  oe.a(jr.field_f.field_s, 1);
                  break L9;
                }
              }
              L10: {
                if (ps.field_v) {
                  rj.a(1);
                  break L10;
                } else {
                  L11: {
                    ek.field_d = wp.field_E >> 74681154 & 3;
                    if ((wp.field_E & 1) == 0) {
                      stackOut_44_0 = 0;
                      stackIn_45_0 = stackOut_44_0;
                      break L11;
                    } else {
                      stackOut_43_0 = 1;
                      stackIn_45_0 = stackOut_43_0;
                      break L11;
                    }
                  }
                  L12: {
                    cu.field_a = stackIn_45_0 != 0;
                    if (-1 == (2 & wp.field_E ^ -1)) {
                      stackOut_47_0 = 0;
                      stackIn_48_0 = stackOut_47_0;
                      break L12;
                    } else {
                      stackOut_46_0 = 1;
                      stackIn_48_0 = stackOut_46_0;
                      break L12;
                    }
                  }
                  uc.field_a = stackIn_48_0 != 0;
                  if (3 > ek.field_d) {
                    break L10;
                  } else {
                    ek.field_d = 0;
                    break L10;
                  }
                }
              }
              sh.field_h = true;
              break L7;
            }
          }
        }
    }

    final int a(byte param0) {
        if (param0 != 71) {
            return -94;
        }
        return ((gh) this).field_O.field_T;
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (!((gh) this).l(11180)) {
            break L0;
          } else {
            if (0 == (((gh) this).field_O.field_T ^ -1)) {
              break L0;
            } else {
              if (null == ((gh) this).field_O.field_W) {
                break L0;
              } else {
                if (null != ((gh) this).field_Q.field_K) {
                  var2 = ((gh) this).field_Q.field_S.field_w;
                  var3 = ((gh) this).field_O.field_Z;
                  var4 = ((gh) this).field_O.field_w + -var2;
                  if ((var4 ^ -1) >= -1) {
                    return;
                  } else {
                    var5 = var3 * ((gh) this).field_O.field_T;
                    var6 = var5 + ((gh) this).field_Q.field_S.field_E.field_p;
                    var7 = var2 >> 107805154;
                    if (param0 == 107805154) {
                      L1: {
                        if (var6 >= var7) {
                          break L1;
                        } else {
                          L2: {
                            var8 = -(-var5 + var7 << 1756314736) / var4;
                            if ((var8 ^ -1) <= -1) {
                              break L2;
                            } else {
                              var8 = 0;
                              break L2;
                            }
                          }
                          ((gh) this).field_Q.field_K.field_W = var8;
                          break L1;
                        }
                      }
                      L3: {
                        var7 = -var3 + (3 * var2 >> -46585790);
                        if (var7 < var6) {
                          L4: {
                            var8 = -(var7 - var5 << 364100752) / var4;
                            if ((var8 ^ -1) < -65537) {
                              var8 = 65536;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((gh) this).field_Q.field_K.field_W = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    } else {
                      return;
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

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        Object var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!((gh) this).a(false)) {
          return false;
        } else {
          L0: {
            if (((gh) this).field_O.field_W != null) {
              L1: {
                var5 = ((gh) this).field_O.field_W.length;
                if (-100 == (param1 ^ -1)) {
                  break L1;
                } else {
                  if (param1 == -99) {
                    break L1;
                  } else {
                    L2: {
                      if (param1 == 105) {
                        break L2;
                      } else {
                        if (param1 == 104) {
                          break L2;
                        } else {
                          if (param1 != 84) {
                            if (param1 != 85) {
                              if (32 > param2) {
                                break L0;
                              } else {
                                if (param2 >= 128) {
                                  break L0;
                                } else {
                                  var6 = ((gh) this).field_I + param2;
                                  this.a(true, var6);
                                  return true;
                                }
                              }
                            } else {
                              var6_int = ((gh) this).field_I.length();
                              if (var6_int <= 0) {
                                return true;
                              } else {
                                ((gh) this).field_I = ((gh) this).field_I.substring(0, var6_int - 1);
                                return true;
                              }
                            }
                          } else {
                            L3: {
                              if (!((gh) this).field_H) {
                                this.m(0);
                                break L3;
                              } else {
                                this.k(-116);
                                break L3;
                              }
                            }
                            return true;
                          }
                        }
                      }
                    }
                    L4: {
                      if (((gh) this).l(param3 + 23395)) {
                        break L4;
                      } else {
                        this.m(0);
                        break L4;
                      }
                    }
                    L5: {
                      var6_int = ((gh) this).field_Q.field_S.field_w / ((gh) this).field_O.field_Z;
                      if (105 != param1) {
                        ((gh) this).field_O.field_T = ((gh) this).field_O.field_T - var6_int;
                        break L5;
                      } else {
                        ((gh) this).field_O.field_T = ((gh) this).field_O.field_T + var6_int;
                        break L5;
                      }
                    }
                    L6: {
                      if (0 > ((gh) this).field_O.field_T) {
                        ((gh) this).field_O.field_T = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 > ((gh) this).field_O.field_T) {
                        break L7;
                      } else {
                        ((gh) this).field_O.field_T = -1 + var5;
                        break L7;
                      }
                    }
                    this.n(param3 ^ -107796053);
                    return true;
                  }
                }
              }
              L8: {
                if (((gh) this).l(11180)) {
                  break L8;
                } else {
                  this.m(0);
                  break L8;
                }
              }
              L9: {
                if (-100 != param1) {
                  ((gh) this).field_O.field_T = ((gh) this).field_O.field_T - 1;
                  break L9;
                } else {
                  ((gh) this).field_O.field_T = ((gh) this).field_O.field_T + 1;
                  break L9;
                }
              }
              L10: {
                if ((((gh) this).field_O.field_T ^ -1) > -1) {
                  ((gh) this).field_O.field_T = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (((gh) this).field_O.field_T >= var5) {
                  ((gh) this).field_O.field_T = var5 - 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              this.n(107805154);
              return true;
            } else {
              break L0;
            }
          }
          L12: {
            if (param3 == -12215) {
              break L12;
            } else {
              var8 = null;
              boolean discarded$1 = ((gh) this).a((kb) null, -8, 'd', 65);
              break L12;
            }
          }
          if (-81 == (param1 ^ -1)) {
            this.k(param3 + 12094);
            return false;
          } else {
            return this.a(param0, param1, param2, -12215);
          }
        }
    }

    private final int a(int param0, String param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        param1 = param1.toLowerCase();
        for (var3 = param0; ((gh) this).field_O.field_W.length > var3; var3++) {
            var4 = ((gh) this).field_O.field_W[var3].toString().toLowerCase();
            if (!(!var4.startsWith(param1))) {
                return var3;
            }
        }
        return -1;
    }

    final String h(int param0) {
        if (((gh) this).field_t) {
          if (param0 == 21384) {
            L0: {
              if (!((gh) this).l(11180)) {
                break L0;
              } else {
                if (!((gh) this).field_Q.field_t) {
                  break L0;
                } else {
                  if (-1 != ((gh) this).field_O.field_O) {
                    return ((gh) this).field_O.field_W[((gh) this).field_O.field_O].toString();
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (((gh) this).field_O.j(-6508) != null) {
              return ((gh) this).field_O.j(-6508).toString();
            } else {
              return this.h(param0 + 0);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, nr param12, int param13, nr param14, int param15, int param16, int param17, nr param18, ka param19) {
        uk.field_s = param4;
        ej.field_G = param19;
        kq.a(param3, param17, (byte) 87, param10, param2);
        cv.a((byte) 123, param18, param5, param16);
        if (param11 != -99) {
            return;
        }
        op.a(param7, param1, param12, param14, -3, param6);
        g.a((byte) -85, param15, param9);
        mi.a(param8, param0, param13, 3815);
    }

    private final void m(int param0) {
        int var2 = ((gh) this).field_O.a((byte) -126);
        int var3 = var2;
        int var4 = 0;
        if (((gh) this).field_G < var3) {
            var3 = ((gh) this).field_G;
            var4 = 1;
        }
        this.a(var3 + ((gh) this).field_J, ((gh) this).field_p, (byte) 50, ((gh) this).field_B, ((gh) this).field_l);
        ((gh) this).field_O.a(0, ((gh) this).field_l, param0, param0 ^ 8192, var2);
        ((gh) this).field_Q = new ai(0, 0, 0, 0, (kh) (Object) new fc(), (kb) (Object) ((gh) this).field_O, (kh) null);
        if (var4 != 0) {
            ((gh) this).field_Q.a((byte) 118, true, lw.n(param0 ^ 0));
        }
        ((gh) this).field_Q.a(0, ((gh) this).field_l, ((gh) this).field_J, param0 + 8192, ((gh) this).field_w - ((gh) this).field_J);
        ((gh) this).field_H = true;
        ((gh) this).a((byte) 10, (kb) (Object) ((gh) this).field_Q);
        this.n(107805154);
    }

    final void f(int param0) {
        ((gh) this).field_F = false;
        this.f(param0 + 0);
        if (param0 != 1) {
            ((gh) this).field_G = -4;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((gh) this).field_J = param4;
        if (param3 != 8192) {
            Object var7 = null;
            int discarded$0 = this.a(20, (String) null);
        }
        this.a(param4, param2, (byte) 107, param0, param1);
    }

    static {
    }
}
