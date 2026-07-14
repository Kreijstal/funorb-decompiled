/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends wb implements qk {
    private ph field_gb;
    static int field_db;
    static bd field_cb;
    static int field_ab;
    static String field_bb;
    static bd[][] field_eb;
    static int field_fb;

    final static void b(int param0, int param1) {
        int var3 = HostileSpawn.field_I ? 1 : 0;
        cl var5 = (cl) (Object) ne.field_q.g(-101);
        while (var5 != null) {
            dk.a(var5, param0, 10);
            var5 = (cl) (Object) ne.field_q.a(12684);
        }
        if (param1 >= -82) {
            Object var4 = null;
            jh.a(116, (byte[]) null);
        }
    }

    final static void a(int param0, int param1, hm param2) {
        ih.field_x.a((am) (Object) param2, 98);
        int var3 = -116 / ((param0 - 59) / 53);
        ci.a(param1, 2, param2);
    }

    final static boolean a(int param0, gb param1) {
        int var2 = 107 % ((param0 - -6) / 59);
        return param1.e(0);
    }

    public static void g(byte param0) {
        field_cb = null;
        if (param0 > -100) {
            jh.b(-41, -92);
        }
        field_eb = null;
        field_bb = null;
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        if (((jh) this).field_gb == param3) {
            this.f((byte) -86);
        }
        int var6 = 64 % ((-63 - param4) / 52);
    }

    final static void a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        vi var17 = null;
        vi var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        L0: {
          var15 = HostileSpawn.field_I ? 1 : 0;
          var17 = new vi(param1);
          var18 = var17;
          var18.field_i = param1.length + -2;
          sc.field_c = var18.e(8);
          vh.field_a = new byte[sc.field_c][];
          ja.field_e = new byte[sc.field_c][];
          th.field_Jb = new int[sc.field_c];
          hd.field_r = new int[sc.field_c];
          sf.field_X = new int[sc.field_c];
          if (param0 == -26869) {
            break L0;
          } else {
            var16 = null;
            boolean discarded$1 = jh.a(-126, (gb) null);
            break L0;
          }
        }
        nh.field_O = new int[sc.field_c];
        qj.field_k = new boolean[sc.field_c];
        var18.field_i = -(sc.field_c * 8) + (-7 + param1.length);
        ra.field_a = var18.e(param0 + 26877);
        vc.field_e = var18.e(8);
        var3 = 1 + (255 & var18.l(32270));
        var4 = 0;
        L1: while (true) {
          L2: {
            if (sc.field_c <= var4) {
              break L2;
            } else {
              th.field_Jb[var4] = var17.e(bm.a(param0, -26877));
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (var4 >= sc.field_c) {
                break L4;
              } else {
                nh.field_O[var4] = var17.e(8);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (var4 >= sc.field_c) {
                  break L6;
                } else {
                  sf.field_X[var4] = var17.e(bm.a(param0, -26877));
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (var4 >= sc.field_c) {
                    break L8;
                  } else {
                    hd.field_r[var4] = var17.e(8);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var18.field_i = 3 + -(var3 * 3) + param1.length - (7 - -(8 * sc.field_c));
                bf.field_d = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        bf.field_d[var4] = var17.h(92);
                        if (0 != bf.field_d[var4]) {
                          break L11;
                        } else {
                          bf.field_d[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var18.field_i = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= sc.field_c) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = sf.field_X[var4];
                            var6 = hd.field_r[var4];
                            var7 = var5 * var6;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var8 = var19;
                            ja.field_e[var4] = var25;
                            var26 = new byte[var7];
                            var24 = var26;
                            var22 = var24;
                            var20 = var22;
                            var9 = var20;
                            vh.field_a[var4] = var26;
                            var10 = 0;
                            var11 = var18.l(32270);
                            if ((1 & var11) == 0) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var5 <= var12) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var13 >= var6) {
                                          break L19;
                                        } else {
                                          var8[var5 * var13 + var12] = var17.j(0);
                                          var13++;
                                          if (0 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                if (-1 == (2 & var11 ^ -1)) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var5 <= var12) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var6 <= var13) {
                                              break L23;
                                            } else {
                                              L24: {
                                                var9[var5 * var13 + var12] = var17.j(0);
                                                var14 = var17.j(0);
                                                stackOut_38_0 = var10;
                                                stackIn_40_0 = stackOut_38_0;
                                                stackIn_39_0 = stackOut_38_0;
                                                if (0 == (var14 ^ -1)) {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 0;
                                                  stackIn_41_0 = stackOut_40_0;
                                                  stackIn_41_1 = stackOut_40_1;
                                                  break L24;
                                                } else {
                                                  stackOut_39_0 = stackIn_39_0;
                                                  stackOut_39_1 = 1;
                                                  stackIn_41_0 = stackOut_39_0;
                                                  stackIn_41_1 = stackOut_39_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_41_0 | stackIn_41_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L25: while (true) {
                            L26: {
                              if (var7 <= var12) {
                                break L26;
                              } else {
                                var8[var12] = var17.j(0);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (-1 != (2 & var11 ^ -1)) {
                              var12 = 0;
                              L27: while (true) {
                                if (var7 <= var12) {
                                  break L14;
                                } else {
                                  L28: {
                                    var9[var12] = var17.j(0);
                                    var13 = var17.j(0);
                                    stackOut_52_0 = var10;
                                    stackIn_54_0 = stackOut_52_0;
                                    stackIn_53_0 = stackOut_52_0;
                                    if ((var13 ^ -1) == 0) {
                                      stackOut_54_0 = stackIn_54_0;
                                      stackOut_54_1 = 0;
                                      stackIn_55_0 = stackOut_54_0;
                                      stackIn_55_1 = stackOut_54_1;
                                      break L28;
                                    } else {
                                      stackOut_53_0 = stackIn_53_0;
                                      stackOut_53_1 = 1;
                                      stackIn_55_0 = stackOut_53_0;
                                      stackIn_55_1 = stackOut_53_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_55_0 | stackIn_55_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L27;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        qj.field_k[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final void f(byte param0) {
        if (!((jh) this).field_F) {
            return;
        }
        if (param0 != -86) {
            return;
        }
        ((jh) this).field_F = false;
    }

    final static void a(int param0, byte param1, int param2, jb[] param3, int param4) {
        if (!(-2 != (uj.field_l ^ -1))) {
            if (!(param4 <= 1)) {
                param2 = param2 + (int)(Math.random() * (double)param4);
            }
            if (param3 == jc.field_c) {
                if (-2 >= (param2 ^ -1)) {
                    if ((param2 ^ -1) > -10) {
                        param0 = param0 * 2;
                    }
                }
            }
            eh.field_c.a(param3[param2], 100, param0);
        }
        if (param1 <= 28) {
            field_ab = 106;
        }
    }

    private final ph a(mh param0, String param1, byte param2) {
        ph var4 = new ph(param1, param0);
        var4.field_h = (nn) (Object) new ke();
        int var5 = ((jh) this).field_x - 6;
        ((jh) this).field_x = ((jh) this).field_x + 38;
        var4.a(-30 + ((jh) this).field_s, var5, 0, 15, 30);
        if (param2 != 50) {
            Object var6 = null;
            jh.a(113, (byte) 58, 125, (jb[]) null, 37);
        }
        ((jh) this).a(param2 + 51398, (ag) (Object) var4);
        ((jh) this).c(0);
        return var4;
    }

    jh(gg param0, jf param1) {
        super(param0, 200, 150);
        String var3 = null;
        ag var4 = null;
        L0: {
          var3 = null;
          if (param1 == id.field_s) {
            var3 = he.field_z;
            break L0;
          } else {
            if (hf.field_g != param1) {
              if (param1 != g.field_M) {
                break L0;
              } else {
                var3 = ph.field_y;
                ((jh) this).field_x = ((jh) this).field_x + 30;
                break L0;
              }
            } else {
              ((jh) this).field_x = ((jh) this).field_x + 10;
              var3 = ha.field_y;
              if (!kd.a((byte) -114)) {
                break L0;
              } else {
                ((jh) this).field_x = ((jh) this).field_x + 20;
                var3 = nj.field_b;
                break L0;
              }
            }
          }
        }
        var4 = new ag(var3, (mh) null);
        var4.field_s = ((jh) this).field_s;
        var4.field_x = 80;
        var4.field_v = 0;
        var4.field_m = 50;
        var4.field_h = (nn) (Object) new cn(jn.field_G, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((jh) this).a(51448, var4);
        ((jh) this).field_gb = this.a((mh) this, gi.field_n, (byte) 50);
    }

    final static bd[] a(bd[] param0, int param1, int param2) {
        bd[] var3 = null;
        if (param0.length != param2) {
          if (param1 != 150) {
            return null;
          } else {
            var3 = new bd[param2];
            kf.a((Object[]) (Object) param0, 0, (Object[]) (Object) var3, 0, param2);
            return var3;
          }
        } else {
          return param0;
        }
    }

    final static String a(byte param0, int param1) {
        StringBuilder var2 = new StringBuilder(5);
        if (!((param1 ^ -1) <= -1)) {
            param1 = -param1;
            StringBuilder discarded$0 = var2.append(45);
        }
        StringBuilder discarded$1 = var2.append(param1 / 60);
        param1 = param1 % 60;
        if (param0 >= -60) {
            field_eb = null;
        }
        StringBuilder discarded$6 = var2.append(58);
        if ((param1 ^ -1) > -11) {
            StringBuilder discarded$7 = var2.append(48);
        }
        StringBuilder discarded$8 = var2.append(param1);
        return var2.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "End game";
        field_db = 0;
        field_ab = 1;
    }
}
