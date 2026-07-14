/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends wda {
    private int field_q;
    static String field_p;
    static iu field_s;
    private boolean field_u;
    private int field_v;
    static int field_t;
    private boolean field_r;
    private ir field_o;

    final void b(byte param0) {
        int var3 = 0;
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
        hca var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var3 = -93 % ((param0 - -69) / 42);
        var14 = ((bg) this).field_n.H(-122);
        if (var14.u(-25561)) {
          return;
        } else {
          ((bg) this).field_o.field_f = var14.d(3);
          ((bg) this).field_o.field_d = var14.e(9648);
          ((bg) this).field_n.a(((bg) this).field_o, 30);
          var4 = ((bg) this).field_o.field_f - ((bg) this).field_n.s(25745);
          var5 = ((bg) this).field_o.field_d + -((bg) this).field_n.e(false);
          var6 = ((bg) this).field_q >> -450006160;
          var6 = var6 * var6;
          var7 = (var4 >> -1643954256) * (var4 >> 348233296) + (var5 >> -1774965552) * (var5 >> 38151056);
          if (var7 <= var6) {
            return;
          } else {
            if (var4 != 0) {
              L0: {
                if (((bg) this).field_u) {
                  var8 = ua.a(var4, -106);
                  var9 = ua.a(var5, -115);
                  var10 = 0;
                  var11 = 0;
                  if (!((bg) this).field_r) {
                    L1: {
                      if (((bg) this).field_r) {
                        break L1;
                      } else {
                        if (var9 * 4 >= 3 * var8) {
                          break L1;
                        } else {
                          L2: {
                            ((bg) this).field_r = true;
                            if (-1 > (var4 ^ -1)) {
                              var10 = ((bg) this).field_v;
                              break L2;
                            } else {
                              var10 = -((bg) this).field_v;
                              break L2;
                            }
                          }
                          if (var8 >= ua.a(var10, -103)) {
                            ((bg) this).field_n.a((byte) -120, var10, var11);
                            return;
                          } else {
                            var10 = var4;
                            ((bg) this).field_n.a((byte) -120, var10, var11);
                            return;
                          }
                        }
                      }
                    }
                    L3: {
                      ((bg) this).field_r = false;
                      if ((var5 ^ -1) < -1) {
                        var11 = ((bg) this).field_v;
                        break L3;
                      } else {
                        var11 = -((bg) this).field_v;
                        break L3;
                      }
                    }
                    if (var9 < ua.a(var11, 60)) {
                      var11 = var5;
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      break L0;
                    } else {
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    if (var8 * 4 >= var9 * 3) {
                      L4: {
                        ((bg) this).field_r = true;
                        if (-1 > (var4 ^ -1)) {
                          var10 = ((bg) this).field_v;
                          break L4;
                        } else {
                          var10 = -((bg) this).field_v;
                          break L4;
                        }
                      }
                      if (var8 < ua.a(var10, -103)) {
                        var10 = var4;
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      } else {
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    } else {
                      L5: {
                        if (((bg) this).field_r) {
                          break L5;
                        } else {
                          if (var9 * 4 >= 3 * var8) {
                            break L5;
                          } else {
                            L6: {
                              ((bg) this).field_r = true;
                              if (-1 > (var4 ^ -1)) {
                                var10 = ((bg) this).field_v;
                                break L6;
                              } else {
                                var10 = -((bg) this).field_v;
                                break L6;
                              }
                            }
                            if (var8 < ua.a(var10, -103)) {
                              var10 = var4;
                              ((bg) this).field_n.a((byte) -120, var10, var11);
                              return;
                            } else {
                              ((bg) this).field_n.a((byte) -120, var10, var11);
                              return;
                            }
                          }
                        }
                      }
                      L7: {
                        ((bg) this).field_r = false;
                        if ((var5 ^ -1) < -1) {
                          var11 = ((bg) this).field_v;
                          break L7;
                        } else {
                          var11 = -((bg) this).field_v;
                          break L7;
                        }
                      }
                      if (var9 < ua.a(var11, 60)) {
                        var11 = var5;
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      } else {
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    }
                  }
                } else {
                  L8: {
                    if (0 != var4) {
                      break L8;
                    } else {
                      if (var5 == 0) {
                        var5 = 1;
                        break L8;
                      } else {
                        var8 = qva.a((byte) -73, var5, var4);
                        var9 = hua.a((byte) 107, var8 >> -316068894);
                        var10 = bua.a(0, var8 >> 554838914);
                        var11 = doa.a(2, ((bg) this).field_v, var9);
                        var12 = doa.a(2, ((bg) this).field_v, var10);
                        ((bg) this).field_n.a((byte) -113, var11, var12);
                        return;
                      }
                    }
                  }
                  var8 = qva.a((byte) -73, var5, var4);
                  var9 = hua.a((byte) 107, var8 >> -316068894);
                  var10 = bua.a(0, var8 >> 554838914);
                  var11 = doa.a(2, ((bg) this).field_v, var9);
                  var12 = doa.a(2, ((bg) this).field_v, var10);
                  ((bg) this).field_n.a((byte) -113, var11, var12);
                  break L0;
                }
              }
              return;
            } else {
              if (var5 != 0) {
                L9: {
                  if (((bg) this).field_u) {
                    L10: {
                      L11: {
                        var8 = ua.a(var4, -106);
                        var9 = ua.a(var5, -115);
                        var10 = 0;
                        var11 = 0;
                        if (!((bg) this).field_r) {
                          break L11;
                        } else {
                          if (var8 * 4 >= var9 * 3) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (((bg) this).field_r) {
                          break L12;
                        } else {
                          if (var9 * 4 >= 3 * var8) {
                            break L12;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L13: {
                        ((bg) this).field_r = false;
                        if ((var5 ^ -1) < -1) {
                          var11 = ((bg) this).field_v;
                          break L13;
                        } else {
                          var11 = -((bg) this).field_v;
                          break L13;
                        }
                      }
                      if (var9 < ua.a(var11, 60)) {
                        var11 = var5;
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        break L9;
                      } else {
                        ((bg) this).field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    }
                    L14: {
                      ((bg) this).field_r = true;
                      if (-1 > (var4 ^ -1)) {
                        var10 = ((bg) this).field_v;
                        break L14;
                      } else {
                        var10 = -((bg) this).field_v;
                        break L14;
                      }
                    }
                    if (var8 < ua.a(var10, -103)) {
                      var10 = var4;
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      return;
                    } else {
                      ((bg) this).field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    L15: {
                      if (0 != var4) {
                        break L15;
                      } else {
                        if (var5 == 0) {
                          var5 = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var8 = qva.a((byte) -73, var5, var4);
                    var9 = hua.a((byte) 107, var8 >> -316068894);
                    var10 = bua.a(0, var8 >> 554838914);
                    var11 = doa.a(2, ((bg) this).field_v, var9);
                    var12 = doa.a(2, ((bg) this).field_v, var10);
                    ((bg) this).field_n.a((byte) -113, var11, var12);
                    break L9;
                  }
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        ((bg) this).field_q = param1;
        int var3 = 108 / ((param0 - -57) / 33);
    }

    final void a(kh param0, byte param1) {
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        if (param1 >= -78) {
          return;
        } else {
          L0: {
            super.a(param0, (byte) -83);
            param0.a((byte) -128, ((bg) this).field_q >> 1657486128, 10);
            param0.a((byte) -25, ((bg) this).b(0, ((bg) this).field_v), 8);
            stackOut_1_0 = (kh) param0;
            stackOut_1_1 = -128;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (!((bg) this).field_u) {
              stackOut_3_0 = (kh) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L0;
            } else {
              stackOut_2_0 = (kh) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L0;
            }
          }
          ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
          return;
        }
    }

    bg(la param0, boolean param1) {
        super(param0, param1);
        ((bg) this).field_r = true;
        ((bg) this).field_o = new ir();
        ((bg) this).field_q = 1048576;
        ((bg) this).field_v = 131072;
    }

    bg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((bg) this).field_r = true;
        ((bg) this).field_o = new ir();
        ((bg) this).field_q = param1.b((byte) 44, 10) << 1507414544;
        if (7 >= param0.field_E) {
            ((bg) this).field_v = param1.b((byte) 44, 4) << -1552938064;
        } else {
            ((bg) this).field_v = ((bg) this).a(param1.b((byte) 44, 8), false);
        }
        if (((bg) this).c(true).field_E >= 3) {
            ((bg) this).field_u = 1 != param1.b((byte) 44, 1) ? false : true;
        } else {
            ((bg) this).field_u = false;
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            ((bg) this).field_q = 125;
        }
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 75, param1, ((bg) this).field_v);
        if (param0 != 0) {
            int discarded$0 = ((bg) this).a(-97, -102);
            return param1;
        }
        return param1;
    }

    final void a(boolean param0, int param1) {
        ((bg) this).field_v = param1;
        if (param0) {
            field_p = null;
        }
    }

    public static void e(byte param0) {
        if (param0 != 67) {
            return;
        }
        field_s = null;
        field_p = null;
    }

    final void a(int param0, fsa param1) {
        super.a(66, param1);
        if (param0 <= 35) {
            ((bg) this).c(65, 104);
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            ((bg) this).b((byte) -128);
            return 1;
        }
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Play free version";
    }
}
