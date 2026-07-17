/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends oe {
    private int field_cb;
    static String field_eb;
    private int field_X;
    private int field_Y;
    static int field_fb;
    static int[][] field_ab;
    private int field_Z;
    private int field_db;
    static String field_W;
    private int field_bb;

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((tj) this).field_db > 0) {
            var2 = ((tj) this).field_bb;
            var3 = ((tj) this).field_X;
            int fieldTemp$0 = ((tj) this).field_Z + 1;
            ((tj) this).field_Z = ((tj) this).field_Z + 1;
            if (fieldTemp$0 >= ((tj) this).field_db) {
                ((tj) this).field_db = 0;
                ((tj) this).j(50);
            } else {
                var4 = ((tj) this).field_Z * (((tj) this).field_db * 2 - ((tj) this).field_Z);
                var5 = ((tj) this).field_db * ((tj) this).field_db;
                var2 = (-((tj) this).field_Y + ((tj) this).field_bb) * var4 / var5 + ((tj) this).field_Y;
                var3 = (((tj) this).field_X - ((tj) this).field_cb) * var4 / var5 + ((tj) this).field_cb;
            }
            ((tj) this).b(var3, 31936, var2);
        }
        return super.g((byte) -20);
    }

    boolean a(boolean param0) {
        ((tj) this).b(param0);
        return super.a(param0);
    }

    final static int c(int param0, int param1, int param2) {
        if (param2 != 4096) {
            return 124;
        }
        if (param0 == 0) {
            if (0 != param1) {
                if (param1 < 0) {
                    return -2048;
                }
                return 2048;
            }
            return 0;
        }
        if (0 <= param0) {
            if (!(param1 != 0)) {
                return 0;
            }
            if (param1 < 0) {
                return -jd.a(param0, 1164778608, -param1);
            }
            return jd.a(param0, 1164778608, param1);
        }
        if (0 == param1) {
            return 4096;
        }
        if (param1 >= 0) {
            return -jd.a(-param0, 1164778608, param1) + 4096;
        }
        return -4096 + jd.a(-param0, 1164778608, -param1);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(param3 > 0)) {
            ((tj) this).b(param1, 31936, param2);
            return;
        }
        ((tj) this).field_Z = 0;
        ((tj) this).field_Y = ((tj) this).field_l;
        int var5 = 77 / ((param0 - 44) / 34);
        ((tj) this).field_X = param1;
        ((tj) this).field_bb = param2;
        ((tj) this).field_db = param3;
        ((tj) this).field_cb = ((tj) this).field_y;
    }

    final static int i(int param0) {
        if (sf.field_y >= 2) {
          L0: {
            if (0 != gj.field_S) {
              L1: {
                if (null != wh.field_a) {
                  if (!wh.field_a.d(-103)) {
                    return 14;
                  } else {
                    if (wh.field_a.a((byte) 114, "")) {
                      if (!wh.field_a.a("", 0)) {
                        return 29;
                      } else {
                        break L1;
                      }
                    } else {
                      return 29;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (!uj.field_d.d(84)) {
                return 43;
              } else {
                if (uj.field_d.a("commonui", param0 + -19535)) {
                  if (vf.field_nb.d(-96)) {
                    if (vf.field_nb.a("commonui", 0)) {
                      if (rg.field_r.d(47)) {
                        if (!rg.field_r.c(-63)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              }
            } else {
              if (uj.field_d.d(param0 + -19430)) {
                if (!uj.field_d.a("commonui", 0)) {
                  return 40;
                } else {
                  if (vf.field_nb.d(104)) {
                    if (vf.field_nb.a("commonui", param0 ^ 19535)) {
                      if (rg.field_r.d(114)) {
                        if (rg.field_r.c(-63)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            }
          }
          L2: {
            if (param0 == 19535) {
              break L2;
            } else {
              int discarded$1 = tj.i(-99);
              break L2;
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    public static void h(byte param0) {
        field_ab = null;
        field_W = null;
        field_eb = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var7 = 101 / ((69 - param1) / 51);
            if (param0 < param6) {
              break L1;
            } else {
              if (param0 >= param4 + param6) {
                break L1;
              } else {
                if (param5 > param3) {
                  break L1;
                } else {
                  if (param3 >= param5 + param2) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    void j(int param0) {
        if (param0 != 50) {
            boolean discarded$0 = ((tj) this).a(true);
        }
    }

    tj(lq param0, int param1, int param2) {
        super(param0, param1, param2);
        ((tj) this).field_db = 0;
        ((tj) this).field_Z = 0;
    }

    void a(int param0, int param1, int param2) {
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
        var16 = Pool.field_O;
        qh.d(6 + param0, param1 - -35, ((tj) this).field_l + -12, ((tj) this).field_y - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        if (param2 == 260) {
          var7 = 0;
          var8 = param1;
          L0: while (true) {
            if (var7 >= var4) {
              var6 = 169;
              var5 = 194;
              var4 = 22;
              var7 = 0;
              var8 = 35 + param1;
              L1: while (true) {
                if (var7 >= var4) {
                  me.field_p.c(((tj) this).field_l + param0 + -90, 10 + param1);
                  int discarded$2 = 23;
                  id.a(param1 - -35, ((tj) this).field_l - 10, gr.field_I, param0 - -5);
                  int discarded$3 = 23;
                  id.a(-22 + (param1 - -((tj) this).field_y), ((tj) this).field_l, rb.field_d, param0);
                  var6 = 127;
                  var5 = 169;
                  var4 = -79 + ((tj) this).field_y;
                  var7 = 0;
                  var8 = param1 - -57;
                  L2: while (true) {
                    if (var4 <= var7) {
                      return;
                    } else {
                      var9 = var7 * (var6 + -var5) / var4 + var5;
                      var9 = var9 | (var9 << 16 | var9 << 8);
                      qh.f(param0, var8, 6, var9);
                      qh.f(param0 - (-((tj) this).field_l + 6), var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  qh.f(param0, var8, 6, var9);
                  qh.f(((tj) this).field_l + param0 - 6, var8, 6, var9);
                  var7++;
                  var8++;
                  continue L1;
                }
              }
            } else {
              L3: {
                if (~var8 > ~qh.field_c) {
                  break L3;
                } else {
                  if (~var8 > ~qh.field_g) {
                    L4: {
                      var9 = var7 * (var6 - var5) / var4 + var5;
                      var10 = 0;
                      var11 = ((tj) this).field_l;
                      if (var7 <= 20) {
                        L5: while (true) {
                          if (var10 > 20) {
                            break L4;
                          } else {
                            L6: {
                              var12 = (20 - var10) * (20 + -var10) + (20 + -var7) * (20 - var7);
                              if (var12 > 462) {
                                break L6;
                              } else {
                                if (var12 < 420) {
                                  break L4;
                                } else {
                                  var13 = var9 * (-var12 + 462) / 42;
                                  var13 = var13 | (var13 << 16 | var13 << 8);
                                  qh.field_d[var10 + qh.field_l * var8 + param0] = var13;
                                  break L6;
                                }
                              }
                            }
                            var10++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      if (var7 <= 20) {
                        var12 = var11;
                        var11 -= 21;
                        var13 = 0;
                        L8: while (true) {
                          L9: {
                            if (var13 > 20) {
                              break L9;
                            } else {
                              var14 = var13 * var13 + (-var7 + 20) * (-var7 + 20);
                              if (462 >= var14) {
                                L10: {
                                  if (var14 < 420) {
                                    var12 = var11 + 1;
                                    break L10;
                                  } else {
                                    var15 = var9 * (-var14 + 462) / 42;
                                    var15 = var15 | (var15 << 8 | var15 << 16);
                                    qh.field_d[param0 + (qh.field_l * var8 - -var11)] = var15;
                                    break L10;
                                  }
                                }
                                var13++;
                                var11++;
                                continue L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var11 = var12;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    qh.f(var10 + param0, var8, -var10 + var11, var9);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var7++;
              var8++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    void b(boolean param0) {
        if (0 >= ((tj) this).field_db) {
            return;
        }
        ((tj) this).b(((tj) this).field_X, 31936, ((tj) this).field_bb);
        if (param0) {
            boolean discarded$0 = ((tj) this).a(true);
        }
        ((tj) this).field_db = 0;
        ((tj) this).j(50);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Players: ";
        field_eb = "To <u=ffffff>zoom</u> in and out: Use the <img=1> <col=99ff99>mouse wheel</col>, or hold <img=11>+<img=0> left mouse button and drag.";
    }
}
