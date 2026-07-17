/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dd {
    String field_k;
    private String field_a;
    private int field_f;
    private int[] field_i;
    int field_g;
    static int field_d;
    static gh field_b;
    static volatile boolean field_e;
    static String field_l;
    private long field_h;
    dn field_j;
    gh field_c;

    final static String a(int param0, byte param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        kj var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_9_0 = null;
        String stackOut_15_0 = null;
        String stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        String stackOut_18_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param2;
            if (fa.a(true, var6)) {
              if (wl.a(86, param2)) {
                stackOut_5_0 = o.field_f;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (qc.field_P != 2) {
                  stackOut_9_0 = nc.field_p;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  L1: {
                    if (param1 == 55) {
                      break L1;
                    } else {
                      field_l = null;
                      break L1;
                    }
                  }
                  if (o.a(-42, param2)) {
                    stackOut_15_0 = db.a(sn.field_s, param1 + -78, new String[1]);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    if (cc.field_gc < 100) {
                      if (pf.a(param2, -112)) {
                        stackOut_22_0 = db.a(mg.field_ic, -12, new String[1]);
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      } else {
                        var5 = mm.field_g;
                        var5.a(param0, (byte) -117);
                        var5.field_p = var5.field_p + 1;
                        var4 = var5.field_p;
                        var5.a((byte) 111, 2);
                        var5.a(param2, -93);
                        var5.b((byte) -28, var5.field_p + -var4);
                        stackOut_24_0 = null;
                        stackIn_25_0 = stackOut_24_0;
                        break L0;
                      }
                    } else {
                      stackOut_18_0 = jc.field_g;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = en.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("dd.A(").append(param0).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L2;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return (String) (Object) stackIn_25_0;
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        if (param0 != 0) {
            Object var2 = null;
            ld discarded$0 = dd.a((cm) null, (cm) null, false, (String) null, (String) null);
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (17 == param0) {
          n.field_x = new td(((dd) this).field_c.field_Rb, ((dd) this).field_c.field_cb, ((dd) this).field_c.field_zb, ((dd) this).field_c.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, ((dd) this).field_k, ((dd) this).field_h);
          return true;
        } else {
          if (param1 <= 115) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        String var2 = null;
        String var3 = null;
        if (param0 > -1) {
          L0: {
            field_l = null;
            if (((dd) this).field_k == null) {
              break L0;
            } else {
              if (((dd) this).field_h == nb.field_G) {
                break L0;
              } else {
                var3 = this.b(2);
                var2 = var3;
                ((dd) this).field_j.a(2, 17, db.a(gd.field_ob, -40, new String[1]));
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            if (((dd) this).field_k == null) {
              break L1;
            } else {
              if (((dd) this).field_h == nb.field_G) {
                break L1;
              } else {
                var3 = this.b(2);
                var2 = var3;
                ((dd) this).field_j.a(2, 17, db.a(gd.field_ob, -40, new String[1]));
                break L1;
              }
            }
          }
          return;
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (0 == param1) {
          ik.a(((dd) this).field_h, param0, false);
          var4 = 14;
          return true;
        } else {
          if (param1 == 1) {
            ec.a(param0, false, ((dd) this).field_h);
            var4 = 14;
            return true;
          } else {
            if (param1 != 2) {
              if (3 == param1) {
                na.a((byte) -40, param0, ((dd) this).field_g);
                var4 = 14;
                return true;
              } else {
                if (param1 != 10) {
                  if (param1 != 15) {
                    if (param1 != 16) {
                      return false;
                    } else {
                      nl.a(0, param0, 5);
                      var4 = 14;
                      return true;
                    }
                  } else {
                    nl.a(((dd) this).field_g, param0, 5);
                    var4 = 14;
                    return true;
                  }
                } else {
                  ei.a(((dd) this).field_g, (byte) -23, param0);
                  var4 = 14;
                  return true;
                }
              }
            } else {
              jg.a(((dd) this).field_g, (byte) 112, param0);
              var4 = 14;
              return true;
            }
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 > 66) {
          if (null != ((dd) this).field_j) {
            if (!((dd) this).field_j.j(-108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((dd) this).field_g = -63;
          if (null != ((dd) this).field_j) {
            if (!((dd) this).field_j.j(-108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, na param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (!param1.field_g) {
              L1: {
                ((dd) this).field_f = param1.field_k;
                if (0 != param1.field_k) {
                  break L1;
                } else {
                  L2: {
                    if (0 == sg.field_c) {
                      ((dd) this).field_j.a(param0 + 2, 12, jh.field_f);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((dd) this).field_j.a(param0 ^ 2, 13, lk.field_V);
                  break L1;
                }
              }
              L3: {
                if (param1.field_k != 1) {
                  break L3;
                } else {
                  L4: {
                    if (0 != pm.field_Z) {
                      break L4;
                    } else {
                      ((dd) this).field_j.a(2, 12, ne.field_H);
                      break L4;
                    }
                  }
                  ((dd) this).field_j.a(2, 13, og.field_a);
                  break L3;
                }
              }
              L5: {
                if (param1.field_k != 2) {
                  break L5;
                } else {
                  L6: {
                    if (fi.field_y != 0) {
                      break L6;
                    } else {
                      ((dd) this).field_j.a(2, 12, fj.field_c);
                      break L6;
                    }
                  }
                  ((dd) this).field_j.a(2, 13, he.field_f);
                  break L5;
                }
              }
              if (param0 == 0) {
                break L0;
              } else {
                field_d = -60;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("dd.M(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != 2) {
          L0: {
            ((dd) this).field_i = null;
            if (((dd) this).field_a != null) {
              var2 = ((dd) this).field_a;
              break L0;
            } else {
              var2 = ((dd) this).field_k;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (((dd) this).field_a != null) {
              var2 = ((dd) this).field_a;
              break L1;
            } else {
              var2 = ((dd) this).field_k;
              break L1;
            }
          }
          return var2;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = ((dd) this).field_j.a(param0, true);
        var7 = -12 % ((-56 - param1) / 50);
        if (-2 == var6) {
          return false;
        } else {
          boolean discarded$8 = this.a(param4, var6, (byte) 109);
          boolean discarded$9 = this.b(var6, -7, param3);
          boolean discarded$10 = this.a(false, param3, var6);
          boolean discarded$11 = this.a(var6, 120, param2);
          return true;
        }
    }

    final void b(boolean param0, byte param1) {
        ((dd) this).field_j.a(param0, (byte) 126);
        int var3 = -36 % ((param1 - 65) / 48);
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ah var5 = null;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((dd) this).field_k) {
                break L1;
              } else {
                L2: {
                  if (~nb.field_G != ~((dd) this).field_h) {
                    break L2;
                  } else {
                    if (2 != param2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (qc.field_P == 2) {
                  L3: {
                    var7 = this.b(param1 + 4);
                    var4_ref = var7;
                    var5 = wi.a(((dd) this).field_k, (byte) 114);
                    var6 = o.a(-128, ((dd) this).field_k) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        ((dd) this).field_j.a(param1 ^ -4, 4, db.a(ti.field_r, param1 + -121, new String[1]));
                        ((dd) this).field_j.a(2, 6, db.a(g.field_g, param1 + -30, new String[1]));
                        if (param0 == null) {
                          break L3;
                        } else {
                          if (param2 == 2) {
                            break L3;
                          } else {
                            if (!fj.field_e) {
                              ((dd) this).field_i = param0;
                              ((dd) this).field_j.a(2, 19, db.a(lj.field_f, -75, new String[1]));
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        if (ob.a((byte) -38, ((dd) this).field_k)) {
                          break L5;
                        } else {
                          if (!fj.field_e) {
                            L6: {
                              if (!uc.field_g) {
                                ((dd) this).field_j.a(2, 8, db.a(rj.field_c, -108, new String[1]));
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((dd) this).field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[1]));
                            if (param0 != null) {
                              ((dd) this).field_i = param0;
                              ((dd) this).field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[1]));
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                      break L4;
                    }
                  }
                  if (var6 == 0) {
                    break L1;
                  } else {
                    ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            if (param1 == -2) {
              break L0;
            } else {
              int discarded$1 = dd.a(45, 110);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("dd.N(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(boolean param0, byte param1) {
        cc var4 = null;
        String var5 = null;
        int var6 = 0;
        cc var7 = null;
        var6 = SteelSentinels.field_G;
        if (null != ((dd) this).field_k) {
          if (nb.field_G != ((dd) this).field_h) {
            if (null != nf.field_b) {
              if (kk.a(-28548)) {
                var7 = ri.a(((dd) this).field_h, false);
                var4 = kh.a(false, ((dd) this).field_h);
                var5 = this.b(2);
                if (var4 == null) {
                  L0: {
                    if (var7 == null) {
                      break L0;
                    } else {
                      if (!nf.field_b.field_dc) {
                        break L0;
                      } else {
                        if (nf.field_b.field_wc < nf.field_b.field_Ub) {
                          if (var7.field_Zb) {
                            ((dd) this).field_j.a(2, 1, db.a(va.field_a, -118, new String[1]));
                            if (param1 < -73) {
                              return;
                            } else {
                              String discarded$12 = this.b(96);
                              return;
                            }
                          } else {
                            L1: {
                              if (!param0) {
                                break L1;
                              } else {
                                if (!var7.field_kc) {
                                  break L1;
                                } else {
                                  ((dd) this).field_j.a(2, 0, db.a(nk.field_P, -104, new String[1]));
                                  ((dd) this).field_j.a(2, 1, db.a(bh.field_o, -54, new String[1]));
                                  if (param1 < -73) {
                                    return;
                                  } else {
                                    String discarded$13 = this.b(96);
                                    return;
                                  }
                                }
                              }
                            }
                            ((dd) this).field_j.a(2, 0, db.a(t.field_j, -18, new String[1]));
                            if (param1 < -73) {
                              return;
                            } else {
                              String discarded$14 = this.b(96);
                              return;
                            }
                          }
                        } else {
                          if (param1 >= -73) {
                            String discarded$15 = this.b(96);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  if (param1 < -73) {
                    return;
                  } else {
                    String discarded$16 = this.b(96);
                    return;
                  }
                } else {
                  if (!nf.field_b.field_rc) {
                    ((dd) this).field_j.a(2, 1, db.a(bg.field_E, -88, new String[1]));
                    if (param1 >= -73) {
                      String discarded$17 = this.b(96);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (nf.field_b.field_Mc >= 0) {
                      ((dd) this).field_j.a(2, 1, db.a(bg.field_E, -88, new String[1]));
                      if (param1 >= -73) {
                        String discarded$18 = this.b(96);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param1 >= -73) {
                        String discarded$19 = this.b(96);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                if (param1 >= -73) {
                  String discarded$20 = this.b(96);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 >= -73) {
                String discarded$21 = this.b(96);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 >= -73) {
              String discarded$22 = this.b(96);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 >= -73) {
            String discarded$23 = this.b(96);
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        String var3 = null;
        int var4 = 0;
        hk var5 = null;
        var4 = SteelSentinels.field_G;
        if (null == nf.field_b) {
          var5 = en.a(((dd) this).field_g, 28858);
          if (var5 != null) {
            var3 = var5.field_Xb;
            if (var5.field_vc) {
              ((dd) this).field_j.a(2, 2, db.a(ah.field_Xb, -31, new String[1]));
              ((dd) this).field_j.a(param0 ^ 66, 3, db.a(vi.field_Z, -38, new String[1]));
              if (param0 == 64) {
                return;
              } else {
                ((dd) this).field_a = null;
                return;
              }
            } else {
              if (var5.field_cc) {
                ((dd) this).field_j.a(param0 ^ 66, 2, db.a(cl.field_a, -126, new String[1]));
                if (!var5.field_bc) {
                  if (param0 == 64) {
                    return;
                  } else {
                    ((dd) this).field_a = null;
                    return;
                  }
                } else {
                  ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                  if (param0 == 64) {
                    return;
                  } else {
                    ((dd) this).field_a = null;
                    return;
                  }
                }
              } else {
                if (!var5.field_bc) {
                  if (var5.field_dc) {
                    if (!var5.field_rc) {
                      ((dd) this).field_j.a(2, 2, db.a(cd.field_f, -70, new String[1]));
                      if (!var5.field_bc) {
                        if (param0 == 64) {
                          return;
                        } else {
                          ((dd) this).field_a = null;
                          return;
                        }
                      } else {
                        ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                        if (param0 == 64) {
                          return;
                        } else {
                          ((dd) this).field_a = null;
                          return;
                        }
                      }
                    } else {
                      if (!var5.field_cc) {
                        if (!var5.field_bc) {
                          if (param0 == 64) {
                            return;
                          } else {
                            ((dd) this).field_a = null;
                            return;
                          }
                        } else {
                          ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                          if (param0 == 64) {
                            return;
                          } else {
                            ((dd) this).field_a = null;
                            return;
                          }
                        }
                      } else {
                        ((dd) this).field_j.a(2, 2, db.a(cd.field_f, -70, new String[1]));
                        if (!var5.field_bc) {
                          if (param0 != 64) {
                            ((dd) this).field_a = null;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                          if (param0 != 64) {
                            ((dd) this).field_a = null;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (!var5.field_bc) {
                      if (param0 != 64) {
                        ((dd) this).field_a = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                      if (param0 != 64) {
                        ((dd) this).field_a = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (!var5.field_bc) {
                    if (param0 != 64) {
                      ((dd) this).field_a = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                    if (param0 != 64) {
                      ((dd) this).field_a = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param0 != 64) {
              ((dd) this).field_a = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 64) {
            ((dd) this).field_a = null;
            return;
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1) {
        Object var3 = null;
        if (param0 != 20612) {
          var3 = null;
          String discarded$2 = dd.a(120, (byte) -58, (String) null);
          return lf.field_e[2047 & param1];
        } else {
          return lf.field_e[2047 & param1];
        }
    }

    final static ld a(cm param0, cm param1, boolean param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ld stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                dd.a(18);
                break L1;
              }
            }
            var5_int = param0.a(param3, 46);
            var6 = param0.a(var5_int, -32759, param4);
            stackOut_2_0 = in.a(param1, 112, var6, param0, var5_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("dd.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (param0) {
          dd.a(-11);
          if (param2 != 8) {
            if (param2 == 18) {
              ic.a(-23543, ((dd) this).field_h, ((dd) this).field_k);
              return true;
            } else {
              if (param2 == 11) {
                il.a(0, ((dd) this).field_f, param1, -18853);
                return true;
              } else {
                if (param2 != 12) {
                  if (param2 != 13) {
                    if (param2 != 14) {
                      if (param2 == 20) {
                        pd.j(13171);
                        return true;
                      } else {
                        if (param2 != 19) {
                          return false;
                        } else {
                          boolean discarded$2 = dl.a(((dd) this).field_h, ((dd) this).field_i, -116, ((dd) this).field_f, ((dd) this).field_k);
                          return true;
                        }
                      }
                    } else {
                      lk.g(0);
                      return true;
                    }
                  } else {
                    il.a(2, ((dd) this).field_f, param1, -18853);
                    return true;
                  }
                } else {
                  il.a(1, ((dd) this).field_f, param1, -18853);
                  return true;
                }
              }
            }
          } else {
            bc.a(((dd) this).field_h, ((dd) this).field_k, 2);
            return true;
          }
        } else {
          if (param2 != 8) {
            if (param2 == 18) {
              ic.a(-23543, ((dd) this).field_h, ((dd) this).field_k);
              return true;
            } else {
              if (param2 == 11) {
                il.a(0, ((dd) this).field_f, param1, -18853);
                return true;
              } else {
                if (param2 != 12) {
                  if (param2 != 13) {
                    if (param2 != 14) {
                      if (param2 == 20) {
                        pd.j(13171);
                        return true;
                      } else {
                        if (param2 != 19) {
                          return false;
                        } else {
                          boolean discarded$3 = dl.a(((dd) this).field_h, ((dd) this).field_i, -116, ((dd) this).field_f, ((dd) this).field_k);
                          return true;
                        }
                      }
                    } else {
                      lk.g(0);
                      return true;
                    }
                  } else {
                    il.a(2, ((dd) this).field_f, param1, -18853);
                    return true;
                  }
                } else {
                  il.a(1, ((dd) this).field_f, param1, -18853);
                  return true;
                }
              }
            }
          } else {
            bc.a(((dd) this).field_h, ((dd) this).field_k, 2);
            return true;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        String var5 = null;
        String var6 = null;
        String var7 = null;
        if (param1 != -7) {
            return false;
        }
        Object var4 = null;
        if (4 != param0) {
            if (param0 == 5) {
                var5 = nl.a(((dd) this).field_k, param2, true);
                if (var5 == null) {
                    return true;
                }
                sj.a((String) null, var5, 0, (byte) 21, ((dd) this).field_k, 2);
                return true;
            }
            if (param0 != 6) {
                if (param0 == 7) {
                    var6 = rn.a(((dd) this).field_a, param2, ((dd) this).field_k, true);
                    if (var6 == null) {
                        return true;
                    }
                    sj.a((String) null, var6, 0, (byte) 21, ((dd) this).field_k, 2);
                    return true;
                }
                return false;
            }
            var7 = dd.a(param2, (byte) 55, ((dd) this).field_k);
            if (var7 != null) {
                sj.a((String) null, var7, 0, (byte) 21, ((dd) this).field_k, 2);
                return true;
            }
            return true;
        }
        String var8 = lj.a(((dd) this).field_k, (byte) -79, param2);
        if (var8 != null) {
            sj.a((String) null, var8, 0, (byte) 21, ((dd) this).field_k, 2);
            return true;
        }
        return true;
    }

    dd(gh param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((dd) this).field_j = new dn(jn.field_h);
            ((dd) this).field_k = param2;
            ((dd) this).field_i = param6;
            ((dd) this).field_g = param4;
            ((dd) this).field_h = param1;
            ((dd) this).field_f = param5;
            ((dd) this).field_a = param3;
            ((dd) this).field_c = param0;
            param0.field_G = true;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "dd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_l = "(Including <%0>)";
    }
}
