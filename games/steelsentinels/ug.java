/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ug extends lh implements lm {
    static int field_Q;
    static String field_K;
    lh field_J;
    static int[] field_H;
    static String field_N;
    static pn field_M;
    static java.applet.Applet field_O;
    static wk field_P;
    static String field_L;
    static int field_I;

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        gh var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        na var9 = null;
        var7 = SteelSentinels.field_G;
        if (an.field_h <= wa.field_p) {
          L0: {
            if (sb.field_bb.field_i != jn.field_c) {
              va.field_b = va.field_b + (-jn.field_c + sb.field_bb.field_i);
              jn.field_c = sb.field_bb.field_i;
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 <= (wa.field_p ^ -1)) {
            return;
          } else {
            nn.a(false);
            qc.field_V.a((byte) 115, param1);
            if (null == ve.field_b) {
              var4 = 0;
              L1: while (true) {
                if (5 <= var4) {
                  if (fm.field_b.field_Eb == 0) {
                    var9 = ea.a(param3, da.field_g, 85, db.field_b);
                    if (var9 == null) {
                      L2: {
                        var8 = lj.a(param0 ^ -2);
                        if (var8 != null) {
                          ll.field_i = var8;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L3: {
                        ph.a(var9, -1);
                        var8 = lj.a(param0 ^ -2);
                        if (var8 != null) {
                          ll.field_i = var8;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return;
                    }
                  } else {
                    n.field_x = new td(fm.field_b.field_Rb, fm.field_b.field_cb, fm.field_b.field_zb, fm.field_b.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, (String) null, 0L);
                    var9 = ea.a(param3, da.field_g, 85, db.field_b);
                    if (var9 == null) {
                      L4: {
                        var8 = lj.a(param0 ^ -2);
                        if (var8 != null) {
                          ll.field_i = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return;
                    } else {
                      L5: {
                        ph.a(var9, -1);
                        var8 = lj.a(param0 ^ -2);
                        if (var8 != null) {
                          ll.field_i = var8;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var5 = ah.field_Yb[var4];
                  if (var5 != null) {
                    L6: {
                      if (-1 == (var5.field_Eb ^ -1)) {
                        break L6;
                      } else {
                        bl.a(12, var4, var5);
                        break L6;
                      }
                    }
                    var6 = ei.a(var4, 1);
                    jk.field_a[var4].field_Pb = dh.field_y[var6];
                    gb.field_f[var4].field_S = ec.field_e[var6];
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (fj.field_e) {
                boolean discarded$2 = ve.field_b.a((byte) 108, param1, qc.field_V.field_cb, qc.field_V.field_Rb);
                var4 = 0;
                L7: while (true) {
                  if (5 <= var4) {
                    if (fm.field_b.field_Eb == 0) {
                      var9 = ea.a(param3, da.field_g, 85, db.field_b);
                      if (var9 == null) {
                        L8: {
                          var8 = lj.a(param0 ^ -2);
                          if (var8 != null) {
                            ll.field_i = var8;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        return;
                      } else {
                        L9: {
                          ph.a(var9, -1);
                          var8 = lj.a(param0 ^ -2);
                          if (var8 != null) {
                            ll.field_i = var8;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      }
                    } else {
                      n.field_x = new td(fm.field_b.field_Rb, fm.field_b.field_cb, fm.field_b.field_zb, fm.field_b.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, (String) null, 0L);
                      var9 = ea.a(param3, da.field_g, 85, db.field_b);
                      if (var9 != null) {
                        L10: {
                          ph.a(var9, -1);
                          var8 = lj.a(param0 ^ -2);
                          if (var8 != null) {
                            ll.field_i = var8;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        return;
                      } else {
                        L11: {
                          var8 = lj.a(param0 ^ -2);
                          if (var8 != null) {
                            ll.field_i = var8;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    var5 = ah.field_Yb[var4];
                    if (var5 != null) {
                      L12: {
                        if (-1 == (var5.field_Eb ^ -1)) {
                          break L12;
                        } else {
                          bl.a(12, var4, var5);
                          break L12;
                        }
                      }
                      var6 = ei.a(var4, 1);
                      jk.field_a[var4].field_Pb = dh.field_y[var6];
                      gb.field_f[var4].field_S = ec.field_e[var6];
                      var4++;
                      continue L7;
                    } else {
                      var4++;
                      continue L7;
                    }
                  }
                }
              } else {
                ve.field_b = null;
                var4 = 0;
                L13: while (true) {
                  if (5 <= var4) {
                    if (fm.field_b.field_Eb == 0) {
                      var9 = ea.a(param3, da.field_g, 85, db.field_b);
                      if (var9 != null) {
                        L14: {
                          ph.a(var9, -1);
                          var8 = lj.a(param0 ^ -2);
                          if (var8 != null) {
                            ll.field_i = var8;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          var8 = lj.a(param0 ^ -2);
                          if (var8 != null) {
                            ll.field_i = var8;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        return;
                      }
                    } else {
                      L16: {
                        n.field_x = new td(fm.field_b.field_Rb, fm.field_b.field_cb, fm.field_b.field_zb, fm.field_b.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, (String) null, 0L);
                        var9 = ea.a(param3, da.field_g, 85, db.field_b);
                        if (var9 == null) {
                          break L16;
                        } else {
                          ph.a(var9, -1);
                          break L16;
                        }
                      }
                      L17: {
                        var8 = lj.a(param0 ^ -2);
                        if (var8 != null) {
                          ll.field_i = var8;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      return;
                    }
                  } else {
                    var5 = ah.field_Yb[var4];
                    if (var5 != null) {
                      L18: {
                        if (-1 == (var5.field_Eb ^ -1)) {
                          break L18;
                        } else {
                          bl.a(12, var4, var5);
                          break L18;
                        }
                      }
                      var6 = ei.a(var4, 1);
                      jk.field_a[var4].field_Pb = dh.field_y[var6];
                      gb.field_f[var4].field_S = ec.field_e[var6];
                      var4++;
                      continue L13;
                    } else {
                      var4++;
                      continue L13;
                    }
                  }
                }
              }
            }
          }
        } else {
          L19: {
            wa.field_p = wa.field_p + 1;
            if (sb.field_bb.field_i != jn.field_c) {
              va.field_b = va.field_b + (-jn.field_c + sb.field_bb.field_i);
              jn.field_c = sb.field_bb.field_i;
              break L19;
            } else {
              break L19;
            }
          }
          if (param0 <= (wa.field_p ^ -1)) {
            return;
          } else {
            nn.a(false);
            qc.field_V.a((byte) 115, param1);
            if (null != ve.field_b) {
              L20: {
                if (fj.field_e) {
                  boolean discarded$3 = ve.field_b.a((byte) 108, param1, qc.field_V.field_cb, qc.field_V.field_Rb);
                  break L20;
                } else {
                  ve.field_b = null;
                  break L20;
                }
              }
              var4 = 0;
              L21: while (true) {
                if (5 <= var4) {
                  if (fm.field_b.field_Eb != 0) {
                    n.field_x = new td(fm.field_b.field_Rb, fm.field_b.field_cb, fm.field_b.field_zb, fm.field_b.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, (String) null, 0L);
                    var9 = ea.a(param3, da.field_g, 85, db.field_b);
                    if (var9 != null) {
                      L22: {
                        ph.a(var9, -1);
                        var8 = lj.a(param0 ^ -2);
                        if (var8 != null) {
                          ll.field_i = var8;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      return;
                    } else {
                      L23: {
                        var8 = lj.a(param0 ^ -2);
                        if (var8 != null) {
                          ll.field_i = var8;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      return;
                    }
                  } else {
                    L24: {
                      var9 = ea.a(param3, da.field_g, 85, db.field_b);
                      if (var9 == null) {
                        break L24;
                      } else {
                        ph.a(var9, -1);
                        break L24;
                      }
                    }
                    L25: {
                      var8 = lj.a(param0 ^ -2);
                      if (var8 != null) {
                        ll.field_i = var8;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    return;
                  }
                } else {
                  var5 = ah.field_Yb[var4];
                  if (var5 != null) {
                    L26: {
                      if (-1 == (var5.field_Eb ^ -1)) {
                        break L26;
                      } else {
                        bl.a(12, var4, var5);
                        break L26;
                      }
                    }
                    var6 = ei.a(var4, 1);
                    jk.field_a[var4].field_Pb = dh.field_y[var6];
                    gb.field_f[var4].field_S = ec.field_e[var6];
                    var4++;
                    continue L21;
                  } else {
                    var4++;
                    continue L21;
                  }
                }
              }
            } else {
              L27: {
                var4 = 0;
                if (5 <= var4) {
                  break L27;
                } else {
                  L28: {
                    var5 = ah.field_Yb[var4];
                    if (var5 != null) {
                      L29: {
                        if (-1 == (var5.field_Eb ^ -1)) {
                          break L29;
                        } else {
                          bl.a(12, var4, var5);
                          break L29;
                        }
                      }
                      var6 = ei.a(var4, 1);
                      jk.field_a[var4].field_Pb = dh.field_y[var6];
                      gb.field_f[var4].field_S = ec.field_e[var6];
                      break L28;
                    } else {
                      var4++;
                      break L28;
                    }
                  }
                  var4++;
                  var4++;
                  var4++;
                  break L27;
                }
              }
              L30: {
                if (fm.field_b.field_Eb == 0) {
                  break L30;
                } else {
                  n.field_x = new td(fm.field_b.field_Rb, fm.field_b.field_cb, fm.field_b.field_zb, fm.field_b.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, (String) null, 0L);
                  break L30;
                }
              }
              L31: {
                var9 = ea.a(param3, da.field_g, 85, db.field_b);
                if (var9 == null) {
                  break L31;
                } else {
                  ph.a(var9, -1);
                  break L31;
                }
              }
              L32: {
                var8 = lj.a(param0 ^ -2);
                if (var8 != null) {
                  ll.field_i = var8;
                  break L32;
                } else {
                  break L32;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -77, param2, param3, param4);
        ((ug) this).f(-127);
        if (param1 < -71) {
            return;
        }
        field_L = null;
    }

    private final boolean c(int param0, lh param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -1) {
          if (null != ((ug) this).field_J) {
            if (((ug) this).field_J.d(0)) {
              return false;
            } else {
              L0: {
                if (!((ug) this).field_J.a(1, param1)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void g(int param0) {
        field_O = null;
        field_N = null;
        field_L = null;
        field_K = null;
        field_M = null;
        field_H = null;
        field_P = null;
        if (param0 == 475) {
          return;
        } else {
          field_K = null;
          return;
        }
    }

    final void d(byte param0) {
        if (param0 != -45) {
          L0: {
            field_Q = 16;
            if (null != ((ug) this).field_J) {
              ((ug) this).field_J.d((byte) -45);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((ug) this).field_J) {
              ((ug) this).field_J.d((byte) -45);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -34) {
          if (((ug) this).field_J != null) {
            if (!((ug) this).field_J.d(0)) {
              return false;
            } else {
              L0: {
                if (!((ug) this).field_J.a((byte) -106, param1, param2, param3, param4, param5, param6)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private final boolean b(int param0, lh param1) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 4) {
          if (null != ((ug) this).field_J) {
            if (((ug) this).field_J.d(param0 + -4)) {
              return false;
            } else {
              L0: {
                if (!((ug) this).field_J.a(1, param1)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_P = null;
          if (null != ((ug) this).field_J) {
            if (((ug) this).field_J.d(param0 + -4)) {
              return false;
            } else {
              L1: {
                if (!((ug) this).field_J.a(1, param1)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    void f(int param0) {
        if (param0 >= -120) {
            return;
        }
        if (!(null == ((ug) this).field_J)) {
            ((ug) this).field_J.e((byte) 60);
        }
    }

    final int b(boolean param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            var3 = null;
            boolean discarded$4 = this.c(-20, (lh) null);
            if (((ug) this).field_J != null) {
              stackOut_7_0 = ((ug) this).field_J.b(true);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 0;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((ug) this).field_J != null) {
              stackOut_3_0 = ((ug) this).field_J.b(true);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final boolean a(int param0, lh param1) {
        if (param0 == 1) {
          if (((ug) this).field_J != null) {
            if (!((ug) this).field_J.a(param0 + 0, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_O = null;
          if (((ug) this).field_J != null) {
            if (!((ug) this).field_J.a(param0 + 0, param1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        if (param5) {
          if (((ug) this).field_J != null) {
            if (!((ug) this).field_J.a(param0, param1, ((ug) this).field_o + param2, param3, param4 - -((ug) this).field_z, true, param6)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    ug(int param0, int param1, int param2, int param3, qk param4, tn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        int var7 = 0;
        if (((ug) this).field_J != null) {
          ((ug) this).field_J.a((byte) -58, param1, ((ug) this).field_z + param2, param3 + ((ug) this).field_o, param4, param5);
          var7 = -82 / ((param0 - 36) / 32);
          return;
        } else {
          var7 = -82 / ((param0 - 36) / 32);
          return;
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        L0: {
          super.a(param0, 122, param2, param3);
          if (((ug) this).field_J != null) {
            ((ug) this).field_J.a(param0 + ((ug) this).field_o, 58, param2, ((ug) this).field_z + param3);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= 56) {
          return;
        } else {
          ((ug) this).field_J = null;
          return;
        }
    }

    String e(int param0) {
        String var2 = null;
        String var3 = null;
        var2 = super.e(param0);
        if (null != ((ug) this).field_J) {
          var3 = ((ug) this).field_J.e(param0 ^ 0);
          if (var3 == null) {
            return var2;
          } else {
            return var3;
          }
        } else {
          return var2;
        }
    }

    final boolean d(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = null;
            StringBuilder discarded$10 = ((ug) this).a((Hashtable) null, (StringBuilder) null, (byte) -32, 125);
            if (((ug) this).a((byte) -2) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ug) this).a((byte) -2) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        StringBuilder discarded$9 = param3.append(10);
        var5 = 0;
        if (param1 > 53) {
          L0: while (true) {
            if (param2 < var5) {
              if (((ug) this).field_J != null) {
                StringBuilder discarded$10 = ((ug) this).field_J.a(param0, param3, (byte) -119, 1 + param2);
                return;
              } else {
                StringBuilder discarded$11 = param3.append("null");
                return;
              }
            } else {
              StringBuilder discarded$12 = param3.append(32);
              var5++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        Object var6 = null;
        if (0 == param3) {
          if (null != ((ug) this).field_p) {
            ((ug) this).field_p.a(param2, (lh) this, (byte) -30, true, param0);
            if (param1 < -99) {
              if (null == ((ug) this).field_J) {
                return;
              } else {
                ((ug) this).field_J.a(((ug) this).field_z + param0, (byte) -127, ((ug) this).field_o + param2, param3);
                return;
              }
            } else {
              var6 = null;
              ((ug) this).a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
              if (null == ((ug) this).field_J) {
                return;
              } else {
                ((ug) this).field_J.a(((ug) this).field_z + param0, (byte) -127, ((ug) this).field_o + param2, param3);
                return;
              }
            }
          } else {
            if (param1 < -99) {
              if (null == ((ug) this).field_J) {
                return;
              } else {
                ((ug) this).field_J.a(((ug) this).field_z + param0, (byte) -127, ((ug) this).field_o + param2, param3);
                return;
              }
            } else {
              var6 = null;
              ((ug) this).a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
              if (null == ((ug) this).field_J) {
                return;
              } else {
                ((ug) this).field_J.a(((ug) this).field_z + param0, (byte) -127, ((ug) this).field_o + param2, param3);
                return;
              }
            }
          }
        } else {
          if (param1 < -99) {
            if (null == ((ug) this).field_J) {
              return;
            } else {
              ((ug) this).field_J.a(((ug) this).field_z + param0, (byte) -127, ((ug) this).field_o + param2, param3);
              return;
            }
          } else {
            var6 = null;
            ((ug) this).a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
            if (null == ((ug) this).field_J) {
              return;
            } else {
              ((ug) this).field_J.a(((ug) this).field_z + param0, (byte) -127, ((ug) this).field_o + param2, param3);
              return;
            }
          }
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackOut_25_0 = false;
        boolean stackOut_24_0 = false;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        boolean stackOut_4_0 = false;
        boolean stackOut_3_0 = false;
        if (((ug) this).field_J != null) {
          if (((ug) this).field_J.d(0)) {
            if (!((ug) this).field_J.a(param0 + 0, param1, param2, param3)) {
              var5 = param1;
              if (-81 != (var5 ^ -1)) {
                if (param0 != 30373) {
                  field_O = null;
                  return false;
                } else {
                  return false;
                }
              } else {
                L0: {
                  if (fc.field_e[81]) {
                    stackOut_25_0 = this.b(4, param3);
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    stackOut_24_0 = this.c(-1, param3);
                    stackIn_26_0 = stackOut_24_0;
                    break L0;
                  }
                }
                return stackIn_26_0;
              }
            } else {
              return true;
            }
          } else {
            var5 = param1;
            if (-81 != (var5 ^ -1)) {
              if (param0 != 30373) {
                field_O = null;
                return false;
              } else {
                return false;
              }
            } else {
              L1: {
                if (fc.field_e[81]) {
                  stackOut_14_0 = this.b(4, param3);
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                } else {
                  stackOut_13_0 = this.c(-1, param3);
                  stackIn_15_0 = stackOut_13_0;
                  break L1;
                }
              }
              return stackIn_15_0;
            }
          }
        } else {
          var5 = param1;
          if (-81 != (var5 ^ -1)) {
            if (param0 != 30373) {
              field_O = null;
              return false;
            } else {
              return false;
            }
          } else {
            L2: {
              if (fc.field_e[81]) {
                stackOut_4_0 = this.b(4, param3);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = this.c(-1, param3);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    lh a(byte param0) {
        lh var2 = null;
        if (param0 == -2) {
          var2 = ((ug) this).field_J;
          if (var2 != null) {
            if (!var2.d(param0 ^ -2)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        } else {
          field_M = null;
          var2 = ((ug) this).field_J;
          if (var2 != null) {
            if (!var2.d(param0 ^ -2)) {
              return null;
            } else {
              return var2;
            }
          } else {
            return null;
          }
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        if (param2 <= -104) {
          if (((ug) this).a(param1, (byte) -91, param3, param0)) {
            ((ug) this).a(param3, param0, false, param1);
            ((ug) this).a(param0, (byte) 98, param3, param1);
            return param1;
          } else {
            return param1;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[]{4, -1, -1, 8};
        field_K = "Updates will sent to the email address you've given";
        field_N = "Unable to delete friend - system busy";
        field_L = "Send private message";
    }
}
