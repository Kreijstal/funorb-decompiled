/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class saa {
    gaa field_s;
    private mk field_q;
    boolean field_p;
    private boolean field_c;
    private int field_e;
    int field_o;
    private int field_g;
    private int field_m;
    ua field_d;
    private int field_l;
    private boolean field_h;
    jfa field_k;
    static String field_u;
    static sna field_f;
    static hn field_a;
    static int field_b;
    private boolean field_j;
    static String field_r;
    private boolean field_t;
    boolean field_i;
    private int field_n;

    private final void c(byte param0) {
        int var2_int = 0;
        jfa var2 = null;
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (mg.field_m != null) {
            ((saa) this).field_d.field_c.field_r = new jfa[50];
            ((saa) this).field_d.field_c.a((byte) 103, mg.field_m.field_e);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 50) {
                var2 = (jfa) (Object) ((saa) this).field_d.field_c.field_m.b((byte) 90);
                L2: while (true) {
                  if (var2 == null) {
                    ((saa) this).field_d.field_c.field_n = mg.field_m.field_c;
                    ((saa) this).field_d.field_c.field_k.a(false, mg.field_m.field_f);
                    break L0;
                  } else {
                    var2.field_g.a((byte) 13, dm.field_f);
                    var2 = (jfa) (Object) ((saa) this).field_d.field_c.field_m.c(0);
                    continue L2;
                  }
                }
              } else {
                if (mg.field_m.field_i[var2_int] != null) {
                  ((saa) this).field_d.field_c.field_r[var2_int] = new jfa(mg.field_m.field_i[var2_int], 0, 0, ((saa) this).field_d.field_c.field_i);
                  ((saa) this).field_d.field_c.field_r[var2_int].field_g.a((byte) -121, dm.field_f);
                  var2_int++;
                  continue L1;
                } else {
                  var2_int++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 13) {
            break L3;
          } else {
            ((saa) this).field_p = true;
            break L3;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        if ((gf.field_k ^ -1) == -14) {
            if (kaa.field_m != 0) {
                if (!(0 == iba.field_s)) {
                    var2 = 1;
                    lg.a(true, var2, false);
                    return;
                }
            }
        }
        var2 = 52 % ((param0 - -13) / 62);
    }

    final void a(int param0) {
        if (param0 >= -43) {
            return;
        }
        mg.field_m.field_c = ((saa) this).field_d.field_c.field_n;
    }

    final void b(int param0) {
        ((saa) this).field_d.field_c.field_k.a(false, mg.field_m.field_f);
        if (param0 != 11) {
            ((saa) this).field_q = null;
        }
        rba.a(mg.field_m, (byte) 58);
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jfa var5 = null;
        jfa var6 = null;
        boolean stackIn_64_0 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_66_0 = false;
        int stackIn_66_1 = 0;
        int stackIn_76_0 = 0;
        Object stackIn_84_0 = null;
        mk stackIn_84_1 = null;
        mk stackIn_84_2 = null;
        jfa stackIn_84_3 = null;
        boolean stackIn_84_4 = false;
        Object stackIn_85_0 = null;
        mk stackIn_85_1 = null;
        mk stackIn_85_2 = null;
        jfa stackIn_85_3 = null;
        boolean stackIn_85_4 = false;
        Object stackIn_86_0 = null;
        mk stackIn_86_1 = null;
        mk stackIn_86_2 = null;
        jfa stackIn_86_3 = null;
        boolean stackIn_86_4 = false;
        int stackIn_86_5 = 0;
        Object stackIn_89_0 = null;
        mk stackIn_89_1 = null;
        mk stackIn_89_2 = null;
        jfa stackIn_89_3 = null;
        boolean stackIn_89_4 = false;
        Object stackIn_90_0 = null;
        mk stackIn_90_1 = null;
        mk stackIn_90_2 = null;
        jfa stackIn_90_3 = null;
        boolean stackIn_90_4 = false;
        Object stackIn_91_0 = null;
        mk stackIn_91_1 = null;
        mk stackIn_91_2 = null;
        jfa stackIn_91_3 = null;
        boolean stackIn_91_4 = false;
        int stackIn_91_5 = 0;
        boolean stackOut_63_0 = false;
        boolean stackOut_65_0 = false;
        int stackOut_65_1 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_64_1 = 0;
        Object stackOut_88_0 = null;
        mk stackOut_88_1 = null;
        mk stackOut_88_2 = null;
        jfa stackOut_88_3 = null;
        boolean stackOut_88_4 = false;
        Object stackOut_90_0 = null;
        mk stackOut_90_1 = null;
        mk stackOut_90_2 = null;
        jfa stackOut_90_3 = null;
        boolean stackOut_90_4 = false;
        int stackOut_90_5 = 0;
        Object stackOut_89_0 = null;
        mk stackOut_89_1 = null;
        mk stackOut_89_2 = null;
        jfa stackOut_89_3 = null;
        boolean stackOut_89_4 = false;
        int stackOut_89_5 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        Object stackOut_83_0 = null;
        mk stackOut_83_1 = null;
        mk stackOut_83_2 = null;
        jfa stackOut_83_3 = null;
        boolean stackOut_83_4 = false;
        Object stackOut_85_0 = null;
        mk stackOut_85_1 = null;
        mk stackOut_85_2 = null;
        jfa stackOut_85_3 = null;
        boolean stackOut_85_4 = false;
        int stackOut_85_5 = 0;
        Object stackOut_84_0 = null;
        mk stackOut_84_1 = null;
        mk stackOut_84_2 = null;
        jfa stackOut_84_3 = null;
        boolean stackOut_84_4 = false;
        int stackOut_84_5 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          kg.field_e.a(19842, true);
          if (((saa) this).field_i) {
            break L0;
          } else {
            if (-2 != (kg.field_e.field_R ^ -1)) {
              break L0;
            } else {
              if (!kg.field_e.field_T) {
                break L0;
              } else {
                if (((saa) this).field_d.field_c.field_k.field_a != 2) {
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        if (param0 <= -31) {
          L1: {
            sn.field_m.a(19842, true);
            d.field_H.a(19842, true);
            if (((saa) this).field_d.field_c.field_k.field_a == 2) {
              L2: {
                if (!sn.field_m.field_T) {
                  break L2;
                } else {
                  if (!af.field_a) {
                    break L2;
                  } else {
                    uca.a(3, (byte) 124);
                    break L2;
                  }
                }
              }
              L3: {
                if (sn.field_m.field_T) {
                  au.field_c = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (!((saa) this).field_i) {
                if (!d.field_H.field_T) {
                  break L1;
                } else {
                  if (!af.field_a) {
                    break L1;
                  } else {
                    uca.a(4, (byte) -41);
                    break L1;
                  }
                }
              } else {
                if (!d.field_H.field_T) {
                  break L1;
                } else {
                  if (!af.field_a) {
                    break L1;
                  } else {
                    uca.a(4, (byte) -41);
                    break L1;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L4: {
            if (null == ((saa) this).field_s) {
              break L4;
            } else {
              var2 = ((saa) this).field_s.b(0);
              if (var2 != -1) {
                L5: {
                  ((saa) this).field_h = false;
                  if (-1 != (var2 ^ -1)) {
                    break L5;
                  } else {
                    if (((saa) this).field_s.field_j) {
                      L6: {
                        if (null == ((saa) this).field_k) {
                          ((saa) this).field_k = null;
                          mg.field_m.field_e.field_j.field_d = true;
                          break L6;
                        } else {
                          qm.a(11, 7758);
                          ag.a(((saa) this).field_k, (byte) -104);
                          ((saa) this).field_n = 12;
                          ((saa) this).field_k.a(false);
                          mg.field_m.field_e.field_j = null;
                          break L6;
                        }
                      }
                      ct.c(0, -114);
                      ((saa) this).field_s = null;
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var2 == 1) {
                  ((saa) this).field_s = null;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
          L7: {
            if (((saa) this).field_j) {
              if ((lf.field_c ^ -1) == -2) {
                var5 = ((saa) this).field_d.field_c.a(mk.field_p, -4456, gd.field_m);
                var6 = var5;
                if (var6 != null) {
                  var3 = ((saa) this).field_d.field_c.field_k.g(50);
                  if ((var3 ^ -1) == 0) {
                    break L7;
                  } else {
                    var6.a(false);
                    ((saa) this).field_d.field_c.field_r[var3] = var5;
                    ik.a(0, var6, -6622, var3);
                    break L7;
                  }
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            } else {
              break L7;
            }
          }
          L8: {
            if (!((saa) this).field_p) {
              break L8;
            } else {
              if ((lf.field_c ^ -1) != -3) {
                break L8;
              } else {
                ((saa) this).field_p = false;
                ct.c(0, -123);
                ((saa) this).field_o = 5;
                ((saa) this).field_t = false;
                break L8;
              }
            }
          }
          L9: {
            if (!((saa) this).field_h) {
              break L9;
            } else {
              if (-3 == lf.field_c) {
                ((saa) this).field_h = false;
                ct.c(0, -124);
                break L9;
              } else {
                break L9;
              }
            }
          }
          L10: {
            if (!((saa) this).field_j) {
              break L10;
            } else {
              if (-3 == lf.field_c) {
                ((saa) this).field_j = false;
                ct.c(0, -127);
                break L10;
              } else {
                break L10;
              }
            }
          }
          L11: {
            if (((saa) this).field_h) {
              break L11;
            } else {
              L12: {
                if (null == ((saa) this).field_d.field_c.a(mk.field_p, -4456, gd.field_m)) {
                  break L12;
                } else {
                  if (0 == (mk.field_p ^ -1)) {
                    break L12;
                  } else {
                    if (-1 == gd.field_m) {
                      break L12;
                    } else {
                      ((saa) this).field_t = false;
                      break L12;
                    }
                  }
                }
              }
              if (!bfa.field_a) {
                break L11;
              } else {
                L13: {
                  if (null != ((saa) this).field_q) {
                    break L13;
                  } else {
                    if (null == ((saa) this).field_d.field_c.a(mk.field_p, -4456, gd.field_m)) {
                      break L13;
                    } else {
                      L14: {
                        stackOut_63_0 = ((saa) this).field_p;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_64_0 = stackOut_63_0;
                        if (lf.field_c != 1) {
                          stackOut_65_0 = stackIn_65_0;
                          stackOut_65_1 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          stackIn_66_1 = stackOut_65_1;
                          break L14;
                        } else {
                          stackOut_64_0 = stackIn_64_0;
                          stackOut_64_1 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          stackIn_66_1 = stackOut_64_1;
                          break L14;
                        }
                      }
                      L15: {
                        if (stackIn_66_0 & stackIn_66_1 != 0) {
                          break L15;
                        } else {
                          if (4 != nd.field_h) {
                            break L13;
                          } else {
                            if (2 == lf.field_c) {
                              break L15;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      ((saa) this).field_t = false;
                      lf.field_c = 0;
                      ((saa) this).field_c = true;
                      if (((saa) this).field_d.field_c.a(mk.field_p, -4456, gd.field_m) == null) {
                        break L11;
                      } else {
                        L16: {
                          ((saa) this).field_i = true;
                          stackOut_88_0 = this;
                          stackOut_88_1 = null;
                          stackOut_88_2 = null;
                          stackOut_88_3 = ((saa) this).field_d.field_c.a(mk.field_p, -4456, gd.field_m);
                          stackOut_88_4 = ((saa) this).field_t;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          stackIn_90_2 = stackOut_88_2;
                          stackIn_90_3 = stackOut_88_3;
                          stackIn_90_4 = stackOut_88_4;
                          stackIn_89_0 = stackOut_88_0;
                          stackIn_89_1 = stackOut_88_1;
                          stackIn_89_2 = stackOut_88_2;
                          stackIn_89_3 = stackOut_88_3;
                          stackIn_89_4 = stackOut_88_4;
                          if (((saa) this).field_t) {
                            stackOut_90_0 = this;
                            stackOut_90_1 = null;
                            stackOut_90_2 = null;
                            stackOut_90_3 = (jfa) (Object) stackIn_90_3;
                            stackOut_90_4 = stackIn_90_4;
                            stackOut_90_5 = ((saa) this).field_l;
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            stackIn_91_2 = stackOut_90_2;
                            stackIn_91_3 = stackOut_90_3;
                            stackIn_91_4 = stackOut_90_4;
                            stackIn_91_5 = stackOut_90_5;
                            break L16;
                          } else {
                            stackOut_89_0 = this;
                            stackOut_89_1 = null;
                            stackOut_89_2 = null;
                            stackOut_89_3 = (jfa) (Object) stackIn_89_3;
                            stackOut_89_4 = stackIn_89_4;
                            stackOut_89_5 = ((saa) this).field_g;
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_91_1 = stackOut_89_1;
                            stackIn_91_2 = stackOut_89_2;
                            stackIn_91_3 = stackOut_89_3;
                            stackIn_91_4 = stackOut_89_4;
                            stackIn_91_5 = stackOut_89_5;
                            break L16;
                          }
                        }
                        new mk((jfa) (Object) stackIn_91_3, stackIn_91_4, stackIn_91_5);
                        ((saa) this).field_q = (mk) (Object) stackIn_91_1;
                        break L11;
                      }
                    }
                  }
                }
                if (((saa) this).field_q != null) {
                  break L11;
                } else {
                  if (!((saa) this).field_d.field_c.field_k.a(-22263)) {
                    break L11;
                  } else {
                    if (((saa) this).field_d.field_c.field_k.field_a != 1) {
                      break L11;
                    } else {
                      L17: {
                        if (1 != lf.field_c) {
                          stackOut_75_0 = 0;
                          stackIn_76_0 = stackOut_75_0;
                          break L17;
                        } else {
                          stackOut_74_0 = 1;
                          stackIn_76_0 = stackOut_74_0;
                          break L17;
                        }
                      }
                      L18: {
                        if (stackIn_76_0 != 0 & ((saa) this).field_p) {
                          break L18;
                        } else {
                          if (nd.field_h != 4) {
                            break L11;
                          } else {
                            if (2 == lf.field_c) {
                              break L18;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      lf.field_c = 0;
                      var2 = ((saa) this).field_d.field_c.field_k.d(false);
                      if (var2 != -1) {
                        ((saa) this).field_l = var2;
                        ((saa) this).field_c = true;
                        ((saa) this).field_t = true;
                        if (((saa) this).field_d.field_c.field_k.b(-97) == null) {
                          break L11;
                        } else {
                          L19: {
                            ((saa) this).field_i = true;
                            stackOut_83_0 = this;
                            stackOut_83_1 = null;
                            stackOut_83_2 = null;
                            stackOut_83_3 = ((saa) this).field_d.field_c.field_k.b(125);
                            stackOut_83_4 = ((saa) this).field_t;
                            stackIn_85_0 = stackOut_83_0;
                            stackIn_85_1 = stackOut_83_1;
                            stackIn_85_2 = stackOut_83_2;
                            stackIn_85_3 = stackOut_83_3;
                            stackIn_85_4 = stackOut_83_4;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            stackIn_84_2 = stackOut_83_2;
                            stackIn_84_3 = stackOut_83_3;
                            stackIn_84_4 = stackOut_83_4;
                            if (!((saa) this).field_t) {
                              stackOut_85_0 = this;
                              stackOut_85_1 = null;
                              stackOut_85_2 = null;
                              stackOut_85_3 = (jfa) (Object) stackIn_85_3;
                              stackOut_85_4 = stackIn_85_4;
                              stackOut_85_5 = ((saa) this).field_g;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              stackIn_86_2 = stackOut_85_2;
                              stackIn_86_3 = stackOut_85_3;
                              stackIn_86_4 = stackOut_85_4;
                              stackIn_86_5 = stackOut_85_5;
                              break L19;
                            } else {
                              stackOut_84_0 = this;
                              stackOut_84_1 = null;
                              stackOut_84_2 = null;
                              stackOut_84_3 = (jfa) (Object) stackIn_84_3;
                              stackOut_84_4 = stackIn_84_4;
                              stackOut_84_5 = ((saa) this).field_l;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_86_1 = stackOut_84_1;
                              stackIn_86_2 = stackOut_84_2;
                              stackIn_86_3 = stackOut_84_3;
                              stackIn_86_4 = stackOut_84_4;
                              stackIn_86_5 = stackOut_84_5;
                              break L19;
                            }
                          }
                          new mk((jfa) (Object) stackIn_86_3, stackIn_86_4, stackIn_86_5);
                          ((saa) this).field_q = (mk) (Object) stackIn_86_1;
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
            }
          }
          L20: {
            if (!((saa) this).field_c) {
              break L20;
            } else {
              if ((lf.field_c ^ -1) == -3) {
                ((saa) this).field_t = false;
                ((saa) this).field_g = -1;
                ((saa) this).field_c = false;
                ((saa) this).field_l = -1;
                break L20;
              } else {
                break L20;
              }
            }
          }
          aq.field_b.a(19842, true);
          cf.field_b.a(19842, true);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean[] param1) {
        if (param0 != 10) {
            ((saa) this).field_o = 115;
        }
    }

    private final boolean b(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (mk.field_p <= d.field_H.field_kb) {
                break L1;
              } else {
                if (gd.field_m <= d.field_H.field_rb) {
                  break L1;
                } else {
                  if (d.field_H.field_kb - -d.field_H.field_sb <= mk.field_p) {
                    break L1;
                  } else {
                    if (gd.field_m >= d.field_H.field_p + d.field_H.field_rb) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public static void d(byte param0) {
        field_r = null;
        field_u = null;
        int var1 = -41 / ((-47 - param0) / 59);
        field_f = null;
        field_a = null;
    }

    final void a(boolean param0, eaa param1) {
        rh.a(param0, param1);
    }

    final void a(eaa param0, int param1) {
        int var5 = BachelorFridge.field_y;
        int[] var6 = new int[param1];
        int[] var3 = var6;
        kha var4 = (kha) (Object) param0.b((byte) 90);
        while (var4 != null) {
            var6[var4.field_h] = var6[var4.field_h] + var4.field_g;
            var4 = (kha) (Object) param0.c(0);
        }
        mg.field_m.field_f = var3;
        ((saa) this).field_d.field_c.field_k.a(false, mg.field_m.field_f);
    }

    private final void a(boolean param0) {
        sna var2 = mka.a(13558251, 13558251, 13558251, (byte) -124, (po) (Object) jha.field_g, 13558251, 16777215, 13558251);
        var2.field_eb = wd.field_w;
        var2.field_A = bla.field_p;
        var2.field_db = op.field_I;
        if (param0) {
            field_a = null;
        }
        kg.field_e = new sna("shopbutton", var2, 433, 87, 195, 42, "");
        sn.field_m = new sna("getmagnify", var2, 420, 32, 80, 62, "");
        d.field_H = new sna("clean", var2, 526, 318, 82, 124, "");
        sna discarded$0 = new sna("freeze", var2, 576, 430, 50, 42, "");
        sna discarded$1 = new sna("throwin", var2, 580, 380, 80, 20, "Throw in");
        aq.field_b = new sna("viewstats", var2, -50, -50, 50, 20, "View");
        aq.field_b.field_L = 10;
        cf.field_b = new sna("close", var2, -50, -50, 50, 20, "Close");
        cf.field_b.field_L = 10;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        jfa var4 = null;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param1) {
            L1: {
              if (af.field_a) {
                ic.a(74);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((saa) this).field_i) {
                break L2;
              } else {
                if (((saa) this).field_s == null) {
                  var3 = 0;
                  var4 = (jfa) (Object) ((saa) this).field_d.field_c.field_m.b((byte) 90);
                  L3: while (true) {
                    if (var4 == null) {
                      L4: {
                        if (((saa) this).field_j) {
                          break L4;
                        } else {
                          if (((saa) this).field_h) {
                            break L4;
                          } else {
                            if (((saa) this).field_p) {
                              break L4;
                            } else {
                              if (((saa) this).field_i) {
                                break L4;
                              } else {
                                ((saa) this).field_d.field_c.a(true);
                                ((saa) this).field_d.field_c.field_k.a(false);
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (-4 > (kr.field_vb ^ -1)) {
                          ct.c(-4 + kr.field_vb, -126);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      L5: {
                        if (!var4.a(gd.field_m, (byte) 116, mk.field_p)) {
                          break L5;
                        } else {
                          var3 = 1;
                          if (kr.field_vb <= 3) {
                            ct.c(4 + kr.field_vb, -113);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4 = (jfa) (Object) ((saa) this).field_d.field_c.field_m.c(0);
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            this.f((byte) -85);
            break L0;
          } else {
            break L0;
          }
        }
        L6: {
          if (((saa) this).field_i) {
            if (((saa) this).field_e == pha.field_g) {
              break L6;
            } else {
              if (vr.field_b % ((saa) this).field_e == 0) {
                ((saa) this).a(-91);
                break L6;
              } else {
                if (((saa) this).field_e == pha.field_g) {
                  break L6;
                } else {
                  if (vr.field_b % ((saa) this).field_e != 0) {
                    break L6;
                  } else {
                    ((saa) this).a(-91);
                    break L6;
                  }
                }
              }
            }
          } else {
            if (((saa) this).field_e == pha.field_g) {
              break L6;
            } else {
              if (vr.field_b % ((saa) this).field_e != 0) {
                break L6;
              } else {
                ((saa) this).a(-91);
                break L6;
              }
            }
          }
        }
        L7: {
          if (((saa) this).field_i) {
            break L7;
          } else {
            ((saa) this).field_l = -1;
            ((saa) this).field_g = -1;
            ((saa) this).field_q = null;
            break L7;
          }
        }
        L8: {
          if (!((saa) this).field_i) {
            break L8;
          } else {
            if (((saa) this).field_q == null) {
              break L8;
            } else {
              if (0 >= ((saa) this).field_o) {
                ((saa) this).field_q.b(true);
                break L8;
              } else {
                break L8;
              }
            }
          }
        }
        L9: {
          if ((((saa) this).field_n ^ -1) >= -1) {
            break L9;
          } else {
            ((saa) this).field_n = ((saa) this).field_n - 1;
            break L9;
          }
        }
        L10: {
          if ((((saa) this).field_o ^ -1) >= -1) {
            break L10;
          } else {
            ((saa) this).field_o = ((saa) this).field_o - 1;
            break L10;
          }
        }
        L11: {
          if (((saa) this).field_m != au.field_c) {
            L12: {
              if (1 != au.field_c) {
                if ((au.field_c ^ -1) == -6) {
                  qm.a(19, 7758);
                  break L12;
                } else {
                  if ((au.field_c ^ -1) == -3) {
                    qm.a(27, 7758);
                    break L12;
                  } else {
                    if (au.field_c != 3) {
                      if (-1 != au.field_c) {
                        break L12;
                      } else {
                        if (((saa) this).field_m == 5) {
                          qm.a(20, 7758);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      qm.a(22, 7758);
                      break L12;
                    }
                  }
                }
              } else {
                qm.a(28, 7758);
                break L12;
              }
            }
            ((saa) this).field_m = au.field_c;
            break L11;
          } else {
            break L11;
          }
        }
        if (!param0) {
          L13: {
            au.field_c = -1;
            if (!param1) {
              ((saa) this).field_d.field_c.field_k.e(-21060);
              break L13;
            } else {
              break L13;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          gla.field_j.c(param1, 0);
          if (!((saa) this).field_p) {
            L1: {
              if (!sn.field_m.field_T) {
                break L1;
              } else {
                if (((saa) this).field_d.field_c.field_k.field_a != 0) {
                  rfa.field_a.e(param1 + 418, 31);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            bh.field_r.e(param1 + 418, 41);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          iea.field_a.a(param1 + 524, 420, 64);
          op.field_u.e(param1 + 540, 424);
          dp.field_n[5].e(524 + param1, 300);
          if ((((saa) this).field_n ^ -1) >= -1) {
            L3: {
              L4: {
                if (d.field_H.field_T) {
                  break L4;
                } else {
                  if (!this.b(true)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((saa) this).field_d.field_c.field_k.field_a == 0) {
                break L3;
              } else {
                if (((saa) this).field_i) {
                  break L3;
                } else {
                  dp.field_n[0].e(param1 + 524, 300);
                  break L2;
                }
              }
            }
            dp.field_n[2].e(param1 + 524, 300);
            break L2;
          } else {
            if (8 >= ((saa) this).field_n) {
              if ((((saa) this).field_n ^ -1) < -5) {
                dp.field_n[4].e(param1 + 524, 300);
                break L2;
              } else {
                if (((saa) this).field_n <= 0) {
                  break L2;
                } else {
                  dp.field_n[0].e(524 + param1, 300);
                  break L2;
                }
              }
            } else {
              dp.field_n[3].e(param1 + 524, 300);
              break L2;
            }
          }
        }
        L5: {
          ((saa) this).field_d.field_c.a(-125, param1);
          if (!((saa) this).field_i) {
            break L5;
          } else {
            if (((saa) this).field_q != null) {
              dg.g(0, 0, 640, 480);
              ((saa) this).field_q.a(param2, 117);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (((saa) this).field_s == null) {
            break L6;
          } else {
            dg.g(0, 0, 640, 480);
            ((saa) this).field_s.e(param0 + -2);
            break L6;
          }
        }
        L7: {
          if (!af.field_a) {
            break L7;
          } else {
            if (param2) {
              kla.b(true);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if (param0 == 2) {
            break L8;
          } else {
            this.f((byte) 60);
            break L8;
          }
        }
    }

    final void a(byte param0) {
        int var2_int = 0;
        jfa var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          mg.field_m.field_e.field_i = ((saa) this).field_d.field_c.field_i;
          var2_int = 0;
          if (param0 >= 29) {
            break L0;
          } else {
            boolean discarded$1 = this.b(false);
            break L0;
          }
        }
        L1: while (true) {
          if (6 <= var2_int) {
            mg.field_m.field_e.field_m = new eaa();
            var2 = (jfa) (Object) ((saa) this).field_d.field_c.field_m.b((byte) 90);
            L2: while (true) {
              if (var2 == null) {
                mg.field_m.field_i = new rk[50];
                var5 = 0;
                var3 = var5;
                L3: while (true) {
                  if (-51 >= (var5 ^ -1)) {
                    mg.field_m.field_c = ((saa) this).field_d.field_c.field_n;
                    mg.field_m.field_f = ((saa) this).field_d.field_c.field_k.field_o;
                    return;
                  } else {
                    if (null != ((saa) this).field_d.field_c.field_r[var5]) {
                      mg.field_m.field_i[var5] = ((saa) this).field_d.field_c.field_r[var5].field_g;
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                mg.field_m.field_e.field_m.a((bw) (Object) var2.field_g, true);
                var2 = (jfa) (Object) ((saa) this).field_d.field_c.field_m.c(0);
                continue L2;
              }
            }
          } else {
            var3 = 0;
            L4: while (true) {
              if (-11 >= (var3 ^ -1)) {
                var2_int++;
                continue L1;
              } else {
                if (mg.field_m.field_e.field_i[var2_int][var3].field_f != null) {
                  mg.field_m.field_e.field_i[var2_int][var3].field_f.a(true);
                  var3++;
                  continue L4;
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final void b(boolean param0, boolean param1) {
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var4 = BachelorFridge.field_y;
        if (!param1) {
          L0: {
            ((saa) this).field_d.field_c.field_k.d(-123);
            ((saa) this).field_q = null;
            ln.e(-122);
            mea.e((byte) 90);
            if (bp.e(-29919)) {
              if (!hs.a(false, nga.field_i)) {
                lg.a(true, 0, param0);
                break L0;
              } else {
                L1: {
                  if (param1) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L1;
                  }
                }
                lg.a(stackIn_16_0 != 0, 9, param0);
                break L0;
              }
            } else {
              if (hs.a(false, nga.field_i)) {
                L2: {
                  if (param1) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                lg.a(stackIn_11_0 != 0, 8, param0);
                break L0;
              } else {
                L3: {
                  if (param1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                lg.a(stackIn_7_0 != 0, 0, param0);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void e(byte param0) {
        if (param0 != 8) {
            field_u = null;
        }
    }

    saa(String param0) {
        int var3 = 0;
        ((saa) this).field_e = ea.field_d;
        ((saa) this).field_d = new ua(param0, mg.field_m);
        ((saa) this).field_d.field_c.a(false, (saa) this);
        this.c((byte) 13);
        nl discarded$0 = new nl(((saa) this).field_d.field_c);
        this.a(false);
        ((saa) this).field_g = -1;
        ((saa) this).field_l = -1;
        int[] var5 = nga.field_i;
        int[] var2 = var5;
        for (var3 = 0; -9 < (var3 ^ -1); var3++) {
            var5[var3] = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
        field_u = "Player names can be up to 12 letters, numbers and underscores";
        field_r = "Disruptive behaviour";
    }
}
