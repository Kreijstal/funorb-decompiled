/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static bi field_d;
    static String field_e;
    pf field_a;
    static boolean field_b;
    static fg field_h;
    static byte[] field_c;
    static String[] field_j;
    static char[] field_f;
    static boolean field_i;
    static int[] field_g;

    final void a(int param0, ln param1, ln param2, fs param3) {
        ((k) this).field_a.a((byte) -113, (oh) (Object) new qm(3, param3, param1, param2));
        int var5 = -23 / ((param0 - -43) / 44);
    }

    final void a(ln param0, fs param1, byte param2, boolean param3, int param4, ln param5) {
        int var8 = -65 % ((-22 - param2) / 40);
        mg var7 = new mg(param5, param0, param1, param4);
        ((k) this).field_a.a((byte) -113, (oh) (Object) var7);
    }

    final void a(int param0, fs param1, fs param2) {
        ((k) this).field_a.a((byte) -113, (oh) (Object) new rf(param1, param2));
        if (param0 != 255) {
            field_d = null;
        }
    }

    final void a(ln param0, int param1, int[] param2, ln[] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        ln[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = 0;
          var6 = 0;
          if (param1 >= 64) {
            break L0;
          } else {
            var11 = null;
            ((k) this).a((ln) null, -107, (int[]) null, (ln[]) null);
            break L0;
          }
        }
        var7_int = 0;
        L1: while (true) {
          if (var7_int >= param2.length) {
            L2: {
              if (var6 > 0) {
                var7 = new ln[var6];
                var16 = new int[var6];
                var15 = var16;
                var14 = var15;
                var13 = var14;
                var8 = var13;
                var12 = 0;
                var6 = var12;
                var9 = 0;
                L3: while (true) {
                  if (param2.length <= var9) {
                    ((k) this).field_a.a((byte) -113, (oh) (Object) new nr(param0, var16, var7));
                    break L2;
                  } else {
                    if (0 != param2[var9]) {
                      var7[var12] = param3[var9];
                      var8[var12] = param2[var9];
                      var12++;
                      var9++;
                      continue L3;
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                ((k) this).field_a.a((byte) -113, (oh) (Object) new nr(param0, var5));
                break L2;
              }
            }
            return;
          } else {
            L4: {
              if (-1 == (param2[var7_int] ^ -1)) {
                break L4;
              } else {
                var6++;
                break L4;
              }
            }
            var5 = var5 + param2[var7_int];
            var7_int++;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_j = null;
        field_d = null;
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
            field_e = null;
        }
    }

    final void a(int param0, ln param1, boolean param2) {
        ((k) this).field_a.a((byte) -113, (oh) (Object) new nr(param1, param0));
        if (!param2) {
            ((k) this).field_a = null;
        }
    }

    final void a(int param0, ln param1, fs param2) {
        ((k) this).field_a.a((byte) -113, (oh) (Object) new qm(param0, param2, param1));
    }

    public k() {
        ((k) this).field_a = new pf();
    }

    final void a(int param0, ln param1, fs param2, int param3) {
        int var5 = 48 / ((param3 - -6) / 60);
        ((k) this).field_a.a((byte) -113, (oh) (Object) new qi(param1, param2, param0));
    }

    final eg a(int[] param0, ln param1, int param2, fs[] param3) {
        if (param2 != 0) {
            Object var6 = null;
            k.a((byte[]) null, (byte) 21);
        }
        eg var5 = new eg(param1, param3, param0);
        ((k) this).field_a.a((byte) -113, (oh) (Object) var5);
        return var5;
    }

    final void a(fs param0, boolean param1) {
        ((k) this).field_a.a((byte) -113, (oh) (Object) new ca(param0));
        if (param1) {
            Object var4 = null;
            ((k) this).a(-87, (ln) null, -32);
        }
    }

    final static void a(byte[] param0, byte param1) {
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
        ob var16 = null;
        ob var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        var16 = new ob(param0);
        var17 = var16;
        var17.field_j = param0.length - 2;
        en.field_c = var17.f(-20976);
        cm.field_g = new int[en.field_c];
        kc.field_l = new byte[en.field_c][];
        ua.field_h = new boolean[en.field_c];
        hd.field_q = new byte[en.field_c][];
        mc.field_s = new int[en.field_c];
        cf.field_H = new int[en.field_c];
        sj.field_a = new int[en.field_c];
        var17.field_j = param0.length + (-7 + -(en.field_c * 8));
        tk.field_y = var17.f(-20976);
        eg.field_t = var17.f(-20976);
        var3 = (var17.j(-70) & 255) + 1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (en.field_c <= var4) {
              break L1;
            } else {
              cf.field_H[var4] = var16.f(-20976);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= en.field_c) {
                break L3;
              } else {
                sj.field_a[var4] = var16.f(-20976);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (var4 >= en.field_c) {
                  break L5;
                } else {
                  mc.field_s[var4] = var16.f(-20976);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var5 = -25 % ((-23 - param1) / 52);
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (en.field_c <= var4) {
                    break L7;
                  } else {
                    cm.field_g[var4] = var16.f(-20976);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_j = -(3 * (var3 + -1)) + -(en.field_c * 8) + (param0.length - 7);
                eo.field_fb = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var4 >= var3) {
                      break L9;
                    } else {
                      L10: {
                        eo.field_fb[var4] = var16.k(255);
                        if (eo.field_fb[var4] == 0) {
                          eo.field_fb[var4] = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17.field_j = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= en.field_c) {
                        break L12;
                      } else {
                        var5 = mc.field_s[var4];
                        var6 = cm.field_g[var4];
                        var7 = var6 * var5;
                        var24 = new byte[var7];
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var8 = var18;
                        hd.field_q[var4] = var24;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var9 = var19;
                        kc.field_l[var4] = var25;
                        var10 = 0;
                        var11 = var17.j(-74);
                        stackOut_24_0 = -1;
                        stackOut_24_1 = var11 & 1 ^ -1;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        L13: {
                          L14: {
                            if (stackIn_26_0 == stackIn_26_1) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var5 <= var12) {
                                    break L16;
                                  } else {
                                    var13 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var13 >= var6) {
                                          break L18;
                                        } else {
                                          var8[var12 - -(var5 * var13)] = var16.g(-2852);
                                          var13++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                if (0 != (var11 & 2)) {
                                  var12 = 0;
                                  L19: while (true) {
                                    L20: {
                                      if (var5 <= var12) {
                                        break L20;
                                      } else {
                                        var13 = 0;
                                        L21: while (true) {
                                          L22: {
                                            if (var6 <= var13) {
                                              break L22;
                                            } else {
                                              L23: {
                                                var9[var12 + var5 * var13] = var16.g(-2852);
                                                var14 = var16.g(-2852);
                                                stackOut_40_0 = var10;
                                                stackIn_42_0 = stackOut_40_0;
                                                stackIn_41_0 = stackOut_40_0;
                                                if ((var14 ^ -1) == 0) {
                                                  stackOut_42_0 = stackIn_42_0;
                                                  stackOut_42_1 = 0;
                                                  stackIn_43_0 = stackOut_42_0;
                                                  stackIn_43_1 = stackOut_42_1;
                                                  break L23;
                                                } else {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 1;
                                                  stackIn_43_0 = stackOut_41_0;
                                                  stackIn_43_1 = stackOut_41_1;
                                                  break L23;
                                                }
                                              }
                                              var10 = stackIn_43_0 | stackIn_43_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L24: while (true) {
                            L25: {
                              if (var7 <= var12) {
                                break L25;
                              } else {
                                var8[var12] = var16.g(-2852);
                                var12++;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            if ((var11 & 2) != 0) {
                              var12 = 0;
                              L26: while (true) {
                                if (var12 >= var7) {
                                  break L13;
                                } else {
                                  L27: {
                                    var9[var12] = var16.g(-2852);
                                    var13 = var16.g(-2852);
                                    stackOut_54_0 = var10;
                                    stackIn_56_0 = stackOut_54_0;
                                    stackIn_55_0 = stackOut_54_0;
                                    if (var13 == -1) {
                                      stackOut_56_0 = stackIn_56_0;
                                      stackOut_56_1 = 0;
                                      stackIn_57_0 = stackOut_56_0;
                                      stackIn_57_1 = stackOut_56_1;
                                      break L27;
                                    } else {
                                      stackOut_55_0 = stackIn_55_0;
                                      stackOut_55_1 = 1;
                                      stackIn_57_0 = stackOut_55_0;
                                      stackIn_57_1 = stackOut_55_1;
                                      break L27;
                                    }
                                  }
                                  var10 = stackIn_57_0 | stackIn_57_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L26;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        ua.field_h[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L11;
                        } else {
                          break L12;
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

    final void a(fs param0, ln param1, byte param2) {
        ((k) this).field_a.a((byte) -113, (oh) (Object) new qm(1, param0, param1));
        int var4 = 21 % ((-27 - param2) / 52);
    }

    final void a(int param0, ln param1, int param2) {
        if (param2 != -4900) {
            ((k) this).field_a = null;
        }
        ((k) this).field_a.a((byte) -113, (oh) (Object) new hj(param1.field_y, param1, param0));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading sound effects";
        field_b = false;
        field_h = new fg();
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = new int[8192];
    }
}
