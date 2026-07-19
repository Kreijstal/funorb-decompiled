/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends am {
    int field_v;
    static mb field_n;
    up[] field_s;
    byte field_o;
    int field_u;
    int field_r;
    static ut field_q;
    gr field_t;
    byte field_p;

    final static int a(int param0, byte param1, int param2) {
        if (param1 > -24) {
            field_n = (mb) null;
        }
        if (param2 >= 2) {
            return 2;
        }
        if (5 > param0) {
            return 0;
        }
        return 1;
    }

    final static String g(byte param0) {
        if (!(hl.field_d >= 2)) {
            return sr.field_c;
        }
        if (!(null == qq.field_H)) {
            if (!(qq.field_H.d(-42))) {
                return ks.field_g;
            }
            return ep.field_e;
        }
        int var1 = 27 % ((param0 - -48) / 56);
        if (!bw.field_b.d(-78)) {
            return nu.field_M;
        }
        if (!(bw.field_b.a(false, "commonui"))) {
            return bh.field_q + " - " + bw.field_b.a("commonui", -16248) + "%";
        }
        if (!gs.field_c.d(-122)) {
            return te.field_b;
        }
        if (!gs.field_c.a(false, "commonui")) {
            return lj.field_l + " - " + gs.field_c.a("commonui", -16248) + "%";
        }
        if (!up.field_k.d(-96)) {
            return oe.field_l;
        }
        if (!up.field_k.a(false)) {
            return hm.field_H + " - " + up.field_k.e(-8185) + "%";
        }
        return uf.field_a;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_q = null;
    }

    final static void a(boolean param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        wd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ml var15 = null;
        wd stackIn_34_0 = null;
        wd stackIn_35_0 = null;
        wd stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_33_0 = null;
        wd stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        wd stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        var12 = Kickabout.field_G;
        try {
          L0: {
            var15 = un.field_e;
            var2 = var15.h((byte) -109);
            var3 = (wd) ((Object) ak.field_i.g(24009));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_k) {
                    var3 = (wd) ((Object) ak.field_i.c(33));
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var15.h((byte) -127);
                  if (0 != var4) {
                    sc.field_B[0] = ow.field_e;
                    var5 = var3.field_p;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        n.a(-20669, var4, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            kf.a(var5, (byte) 63);
                            dupTemp$2 = new String[2][var5];
                            var3.field_i = dupTemp$2;
                            var6 = dupTemp$2;
                            dupTemp$3 = new int[2][4 * var5];
                            var3.field_o = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = wf.field_O;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var13 >= var8) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = pf.field_d[var5 + var13];
                                      var6[1][var14] = sc.field_B[var11];
                                      var7[1][4 * var14] = bl.field_m[var11];
                                      var7[1][1 + var14 * 4] = qp.field_G[var11];
                                      var7[1][var14 * 4 - -2] = fo.field_j[var11];
                                      var7[1][4 * var14 + 3] = ln.field_B[var11];
                                      if (hm.a((byte) 52, sc.field_B[var11])) {
                                        if (-1 != (qp.field_G[var11] + fo.field_j[var11] + ln.field_B[var11] ^ -1)) {
                                          break L8;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var13++;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = pf.field_d[var9];
                                  var6[0][var10] = sc.field_B[var11];
                                  var7[0][4 * var10] = bl.field_m[var11];
                                  var7[0][1 + var10 * 4] = qp.field_G[var11];
                                  var7[0][2 + var10 * 4] = fo.field_j[var11];
                                  var7[0][3 + 4 * var10] = ln.field_B[var11];
                                  if (!hm.a((byte) -89, sc.field_B[var11])) {
                                    break L9;
                                  } else {
                                    if (-1 != (ln.field_B[var11] + qp.field_G[var11] + fo.field_j[var11] ^ -1)) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              pf.a(var15, 542439655);
                              if (var6_int == 0) {
                                var3.field_f = lr.field_r;
                                var3.field_m = pl.field_d;
                                var3.field_j = io.field_j;
                                var3.field_h = df.field_E;
                                su.a(df.field_E, (byte) -106, io.field_j, var6_int, lr.field_r, pl.field_d);
                                break L10;
                              } else {
                                su.a(df.field_E, (byte) -106, io.field_j, var6_int, lr.field_r, pl.field_d);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        sc.field_B[var6_int] = var15.a(124);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L11: {
                  stackOut_33_0 = (wd) (var3);
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_34_0 = stackOut_33_0;
                  if (!param0) {
                    stackOut_35_0 = (wd) ((Object) stackIn_35_0);
                    stackOut_35_1 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L11;
                  } else {
                    stackOut_34_0 = (wd) ((Object) stackIn_34_0);
                    stackOut_34_1 = 1;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    break L11;
                  }
                }
                stackIn_36_0.field_e = stackIn_36_1 != 0;
                var3.c((byte) -109);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                lr.b((byte) -116);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "ki.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(iw param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param0.h((byte) -121);
              var4 = 4 % ((param1 - 15) / 62);
              if (-2 != (var2_int ^ -1)) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ki.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    ki(int param0, int param1, int param2, byte param3, byte param4) {
        this.field_r = param0;
        this.field_v = param2;
        this.field_u = param1;
        this.field_o = param3;
        this.field_p = param4;
    }

    public final String toString() {
        Object var1 = null;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          var1 = null;
          if (-1 == (this.field_r ^ -1)) {
            var1 = "Keyheld";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = " " + this.field_v;
          if ((this.field_r ^ -1) != -3) {
            break L1;
          } else {
            var1 = "Mouse";
            var2 = "Click(" + this.field_o + "," + this.field_p + ") ";
            break L1;
          }
        }
        L2: {
          if (this.field_r != 1) {
            break L2;
          } else {
            var1 = "Keypress";
            var3 = this.field_v;
            if (0 == var3) {
              var2 = " DASH";
              break L2;
            } else {
              if (var3 == 1) {
                var2 = " SELECT0";
                break L2;
              } else {
                if (2 != var3) {
                  if ((var3 ^ -1) != -4) {
                    if (var3 != 4) {
                      if (5 != var3) {
                        if ((var3 ^ -1) == -7) {
                          var2 = " CHARGE_KICK_LEFT";
                          break L2;
                        } else {
                          if (var3 == 7) {
                            var2 = " CHARGE_KICK_RIGHT";
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        var2 = " SELECT4";
                        break L2;
                      }
                    } else {
                      var2 = " SELECT3";
                      break L2;
                    }
                  } else {
                    var2 = " SELECT2";
                    break L2;
                  }
                } else {
                  var2 = " SELECT1";
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          if (4 != this.field_r) {
            break L3;
          } else {
            L4: {
              var1 = "Team";
              var3 = this.field_v;
              if (0 == var3) {
                var2 = " Left";
                break L4;
              } else {
                if (var3 == 1) {
                  var2 = " Right";
                  break L4;
                } else {
                  if (var3 == 2) {
                    var2 = " Ready";
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            var2 = " data=" + this.field_v;
            break L3;
          }
        }
        L5: {
          if (5 != this.field_r) {
            break L5;
          } else {
            var2 = " data=" + this.field_v;
            var1 = "LineUp";
            break L5;
          }
        }
        L6: {
          if (-8 != (this.field_r ^ -1)) {
            break L6;
          } else {
            var1 = "Cheat";
            var2 = " data=" + this.field_v;
            break L6;
          }
        }
        L7: {
          if (6 == this.field_r) {
            L8: {
              var3 = this.field_v;
              if (var3 != 0) {
                if (var3 != 1) {
                  if (2 != var3) {
                    if (var3 == 3) {
                      var2 = " OfferRematch";
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    var2 = " OfferDraw";
                    break L8;
                  }
                } else {
                  var2 = " Resign";
                  break L8;
                }
              } else {
                var2 = " Depart";
                break L8;
              }
            }
            var1 = "meta";
            var2 = (String) (var1);
            var2 = (String) (var1);
            break L7;
          } else {
            break L7;
          }
        }
        L9: {
          if (this.field_r != 3) {
            break L9;
          } else {
            L10: {
              var3 = this.field_v;
              if (var3 != 0) {
                if ((var3 ^ -1) == -2) {
                  var2 = " Right";
                  break L10;
                } else {
                  if (-3 != (var3 ^ -1)) {
                    break L10;
                  } else {
                    var2 = " OK";
                    break L10;
                  }
                }
              } else {
                var2 = " Left";
                break L10;
              }
            }
            var1 = "formation";
            break L9;
          }
        }
        return new String("{Move" + (String) (var1) + var2 + "}");
    }

    static {
    }
}
