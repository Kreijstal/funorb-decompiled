/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends ua implements sh, ql {
    private t field_z;
    static String field_E;
    cm field_H;
    static pj field_C;
    private qc field_G;
    static cc field_A;
    private t field_D;

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        if (param3 == 7) {
          L0: {
            if (((eb) this).field_z == param4) {
              je.a(53);
              break L0;
            } else {
              if (param4 == ((eb) this).field_D) {
                this.b(true);
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean l(int param0) {
        if (!this.a(0, (ag) (Object) ((eb) this).field_G)) {
            return false;
        }
        if (param0 > -34) {
            return false;
        }
        return true;
    }

    private final boolean a(int param0, ag param1) {
        kf var3 = param1.a(param0 + 7);
        if (!(var3 != null)) {
            return true;
        }
        if (param0 != 0) {
            return false;
        }
        na var4 = var3.b(false);
        return wj.field_i == var4 ? true : false;
    }

    final void a(we param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -15);
        if (param3 > -13) {
            Object var6 = null;
            ((eb) this).a((we) null, -102, 77, (byte) -19);
        }
        ((eb) this).field_D.field_w = this.l(-110);
    }

    public final void a(String param0, int param1) {
        qc var3 = ((eb) this).field_G;
        if (param1 > -50) {
            eb.m(-107);
        }
        String var4 = param0;
        ((rj) (Object) var3).a(false, -5905, var4);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        ge.a(param0, param4, param3 + 1, 10000536);
        ge.a(param0, param4 - -param2, param3 + 1, 12105912);
        if (param1 != 0) {
            field_E = null;
        }
        int var5 = 1;
        if (!(param4 - -var5 >= ge.field_f)) {
            var5 = -param4 + ge.field_f;
        }
        int var6 = param2;
        if (!(var6 + param4 <= ge.field_k)) {
            var6 = ge.field_k + -param4;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 - -(48 * var7 / param2);
            var9 = var8 | (var8 << -14392048 | var8 << -1179334136);
            ge.field_i[ge.field_h * (param4 - -var7) - -param0] = var9;
            ge.field_i[(param4 - -var7) * ge.field_h - (-param0 + -param3)] = var9;
        }
    }

    final static void d(byte param0) {
        ki var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var9 = MonkeyPuzzle2.field_F ? 1 : 0;
          var1 = (ki) (Object) ok.field_a.a((byte) -117);
          if (param0 == -93) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var1 == null) {
            return;
          } else {
            L2: {
              if (var1.field_F <= 1) {
                break L2;
              } else {
                var1.field_t = hd.field_u;
                var2 = 0;
                L3: while (true) {
                  if (var2 >= var1.field_m) {
                    break L2;
                  } else {
                    L4: {
                      var3 = var1.field_o[var2].field_l;
                      if (var1.field_l != var3) {
                        if (var1.field_p == var3) {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L4;
                        } else {
                          stackOut_9_0 = 0;
                          stackIn_12_0 = stackOut_9_0;
                          break L4;
                        }
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_12_0 = stackOut_7_0;
                        break L4;
                      }
                    }
                    var4 = stackIn_12_0;
                    if (var4 != 0) {
                      var5 = var2 - -1;
                      L5: while (true) {
                        if (var1.field_m > var5) {
                          L6: {
                            var6 = var1.field_o[var5].field_l;
                            if (var6 != var1.field_l) {
                              if (var6 == var1.field_p) {
                                stackOut_21_0 = 1;
                                stackIn_23_0 = stackOut_21_0;
                                break L6;
                              } else {
                                stackOut_20_0 = 0;
                                stackIn_23_0 = stackOut_20_0;
                                break L6;
                              }
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_23_0 = stackOut_18_0;
                              break L6;
                            }
                          }
                          L7: {
                            var7 = stackIn_23_0;
                            if (var4 != 0) {
                              if (var4 != 0) {
                                if (var7 == 0) {
                                  stackOut_29_0 = 0;
                                  stackIn_31_0 = stackOut_29_0;
                                  break L7;
                                } else {
                                  stackOut_28_0 = 1;
                                  stackIn_31_0 = stackOut_28_0;
                                  break L7;
                                }
                              } else {
                                stackOut_26_0 = 0;
                                stackIn_31_0 = stackOut_26_0;
                                break L7;
                              }
                            } else {
                              stackOut_24_0 = 0;
                              stackIn_31_0 = stackOut_24_0;
                              break L7;
                            }
                          }
                          var8 = stackIn_31_0;
                          if (var8 != 0) {
                            var1.field_o[var2].field_t = hd.field_u;
                            var1.field_o[var5].field_t = hd.field_u;
                            var5++;
                            continue L5;
                          } else {
                            var5++;
                            continue L5;
                          }
                        } else {
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var2++;
                      continue L3;
                    }
                  }
                }
              }
            }
            var1 = (ki) (Object) ok.field_a.d((byte) 63);
            continue L1;
          }
        }
    }

    public eb() {
        super(0, 0, 496, 0, (ml) null);
        ((eb) this).field_G = new qc("", (of) null, 12);
        a var1 = new a(pf.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
        we var2 = new we(vh.field_K, (ml) (Object) var1, (of) null);
        ((eb) this).field_D = new t(wi.field_a, (of) null);
        ((eb) this).field_z = new t(af.field_b, (of) null);
        ((eb) this).field_G.field_m = oa.field_E;
        ((eb) this).field_G.a((kf) (Object) new hh((rj) (Object) ((eb) this).field_G), true);
        ((eb) this).field_D.field_w = false;
        ((eb) this).field_D.field_h = (ml) (Object) new hd();
        ((eb) this).field_z.field_h = (ml) (Object) new lc();
        ((eb) this).field_G.field_h = (ml) (Object) new mg(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 13361, 20, 270, var3);
        var3 += 50;
        ((eb) this).b((byte) -26, var2);
        var3 = var3 + (this.a(wj.field_l, (we) (Object) ((eb) this).field_G, var3, ke.field_e, 35, 170) + 5);
        ((eb) this).field_D.a(40, 13361, 496 - var5 >> 909351489, var5, var3);
        ((eb) this).field_z.a(40, 13361, var4 + 3, 60, 15 + var3);
        ((eb) this).field_z.field_o = (of) this;
        ((eb) this).field_D.field_o = (of) this;
        ((eb) this).b((byte) -102, (we) (Object) ((eb) this).field_D);
        ((eb) this).b((byte) -27, (we) (Object) ((eb) this).field_z);
        ((eb) this).field_H = new cm((sh) this);
        ((eb) this).field_H.a(150, 13361, 60 + (((eb) this).field_G.field_l + ((eb) this).field_G.field_r), -60 + (-((eb) this).field_G.field_l + ((eb) this).field_l) - ((eb) this).field_G.field_r, 20);
        ((eb) this).b((byte) -56, (we) (Object) ((eb) this).field_H);
        ((eb) this).a(var4 + (55 + var3), 13361, 0, 496, 0);
    }

    final static void m(int param0) {
        ki var1_ref_ki = null;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        ki var4 = null;
        int var5_int = 0;
        il var5 = null;
        dl var6 = null;
        dl var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki var10 = null;
        ki var10_ref = null;
        int var11_int = 0;
        ki var11 = null;
        int var12 = 0;
        int var13_int = 0;
        ki var13 = null;
        ki var14 = null;
        ki var15 = null;
        int var16 = 0;
        Object var17 = null;
        ki var17_ref = null;
        ki var18 = null;
        Object var19 = null;
        ki var19_ref = null;
        Object var20 = null;
        ki var20_ref = null;
        int stackIn_51_0 = 0;
        int stackIn_63_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        var17 = null;
        var19 = null;
        var20 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1_ref_ki = (ki) (Object) hd.field_u.a((byte) -117);
        L0: while (true) {
          if (var1_ref_ki == null) {
            var1 = 0;
            var2 = 0;
            if (param0 > 55) {
              var3 = 0;
              var4 = (ki) (Object) ok.field_a.a((byte) -117);
              L1: while (true) {
                if (var4 == null) {
                  L2: {
                    if (var1 == 0) {
                      if (!ub.field_a) {
                        break L2;
                      } else {
                        dc.field_e = 0;
                        break L2;
                      }
                    } else {
                      L3: {
                        ke.field_c = var3;
                        if (var2 == 0) {
                          dc.field_e = 0;
                          ek.field_b = ek.field_b + 1;
                          if (var3 >= 30) {
                            e.a(253, (byte) 40, 2);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          L4: {
                            dc.field_e = dc.field_e + 1;
                            ek.field_b = 0;
                            if (-11 <= (var3 ^ -1)) {
                              break L4;
                            } else {
                              e.a(248, (byte) 40, 7);
                              break L4;
                            }
                          }
                          L5: {
                            if (15 >= var3) {
                              break L5;
                            } else {
                              e.a(247, (byte) 40, 8);
                              break L5;
                            }
                          }
                          if (var3 <= 20) {
                            break L3;
                          } else {
                            e.a(246, (byte) 40, 9);
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (4 > dc.field_e) {
                          break L6;
                        } else {
                          e.a(252, (byte) 40, 3);
                          break L6;
                        }
                      }
                      L7: {
                        if (-6 < dc.field_e) {
                          break L7;
                        } else {
                          e.a(251, (byte) 40, 4);
                          break L7;
                        }
                      }
                      L8: {
                        if (-7 <= dc.field_e) {
                          e.a(250, (byte) 40, 5);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if ((ek.field_b ^ -1) <= -51) {
                        e.a(249, (byte) 40, 6);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  L9: {
                    if (var4.field_t != null) {
                      L10: {
                        var4.c(-19822);
                        var4.a(7847);
                        var4.g(120);
                        if (var4.field_t == hd.field_u) {
                          L11: {
                            var1 = 1;
                            if (var4.field_A) {
                              break L11;
                            } else {
                              var3++;
                              var4.field_A = true;
                              break L11;
                            }
                          }
                          L12: {
                            if (-1 != (var4.field_w ^ -1)) {
                              break L12;
                            } else {
                              var2 = 1;
                              break L12;
                            }
                          }
                          L13: {
                            if (5 == var4.field_w) {
                              var5_int = 0;
                              L14: while (true) {
                                if (var4.field_m <= var5_int) {
                                  break L13;
                                } else {
                                  if (var4.field_o[var5_int].field_w == 4) {
                                    var4.field_o[var5_int].field_t = hd.field_u;
                                    lc.field_f = true;
                                    if (!var4.field_o[var5_int].field_A) {
                                      var4.field_o[var5_int].field_A = true;
                                      var3++;
                                      var5_int++;
                                      continue L14;
                                    } else {
                                      var5_int++;
                                      continue L14;
                                    }
                                  } else {
                                    var5_int++;
                                    continue L14;
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                          L15: {
                            if (var4.field_w == 4) {
                              var5_int = 0;
                              L16: while (true) {
                                if (var5_int >= var4.field_m) {
                                  break L15;
                                } else {
                                  L17: {
                                    if (1 == var4.field_o[var5_int].field_w) {
                                      break L17;
                                    } else {
                                      if (6 == var4.field_o[var5_int].field_w) {
                                        break L17;
                                      } else {
                                        var5_int++;
                                        continue L16;
                                      }
                                    }
                                  }
                                  var4.field_o[var5_int].field_t = hd.field_u;
                                  lc.field_f = true;
                                  if (!var4.field_o[var5_int].field_A) {
                                    var4.field_o[var5_int].field_A = true;
                                    var3++;
                                    var5_int++;
                                    continue L16;
                                  } else {
                                    var5_int++;
                                    continue L16;
                                  }
                                }
                              }
                            } else {
                              break L15;
                            }
                          }
                          var5_int = 0;
                          L18: while (true) {
                            if (var5_int >= var4.field_m) {
                              var5_int = 0;
                              L19: while (true) {
                                if (var4.field_m <= var5_int) {
                                  var5 = (il) (Object) rf.field_a.a((byte) -117);
                                  L20: while (true) {
                                    if (var5 == null) {
                                      L21: {
                                        var4.field_E = true;
                                        var4.field_m = 0;
                                        hd.field_u.a(-8212, (ug) (Object) var4);
                                        var4.field_v = -1.0f + (float)(2.0 * Math.random());
                                        if (0.009999999776482582f <= Math.abs(var4.field_v)) {
                                          break L21;
                                        } else {
                                          var4.field_v = -1.0f;
                                          break L21;
                                        }
                                      }
                                      var4.field_D = 10.0f;
                                      if (var4.field_w == 0) {
                                        var4.field_n = 1;
                                        gb.field_o = gb.field_o - 1;
                                        ob.b((byte) -19);
                                        break L10;
                                      } else {
                                        ua.i(83);
                                        break L10;
                                      }
                                    } else {
                                      L22: {
                                        L23: {
                                          if (var5.field_j == var4) {
                                            break L23;
                                          } else {
                                            if (var4 != var5.field_i) {
                                              break L22;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        var5.c(-19822);
                                        aj.field_b.a(-8212, (ug) (Object) var5);
                                        break L22;
                                      }
                                      var5 = (il) (Object) rf.field_a.d((byte) 63);
                                      continue L20;
                                    }
                                  }
                                } else {
                                  var4.field_o[var5_int].a(true, var4);
                                  var5_int++;
                                  continue L19;
                                }
                              }
                            } else {
                              var6 = new dl();
                              var7 = new dl();
                              var6.a(-106, (bf) (Object) var4.field_o[var5_int]);
                              var8 = 1;
                              var9 = 1;
                              L24: while (true) {
                                L25: {
                                  var17_ref = (ki) (Object) var6.a((byte) -120);
                                  if (var17_ref != null) {
                                    L26: {
                                      if (var17_ref.field_q <= var4.field_q) {
                                        if (var17_ref.field_w != -5) {
                                          stackOut_49_0 = 1;
                                          stackIn_51_0 = stackOut_49_0;
                                          break L26;
                                        } else {
                                          stackOut_48_0 = 0;
                                          stackIn_51_0 = stackOut_48_0;
                                          break L26;
                                        }
                                      } else {
                                        stackOut_46_0 = 0;
                                        stackIn_51_0 = stackOut_46_0;
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      L28: {
                                        var11_int = stackIn_51_0;
                                        if (-1 != var17_ref.field_w) {
                                          break L28;
                                        } else {
                                          if (hd.field_u == var17_ref.field_t) {
                                            break L28;
                                          } else {
                                            stackOut_53_0 = 1;
                                            stackIn_63_0 = stackOut_53_0;
                                            break L27;
                                          }
                                        }
                                      }
                                      if ((var17_ref.field_w ^ -1) != -6) {
                                        if (4 == var17_ref.field_w) {
                                          if (var4.field_w != 5) {
                                            stackOut_61_0 = 1;
                                            stackIn_63_0 = stackOut_61_0;
                                            break L27;
                                          } else {
                                            stackOut_60_0 = 0;
                                            stackIn_63_0 = stackOut_60_0;
                                            break L27;
                                          }
                                        } else {
                                          stackOut_58_0 = 0;
                                          stackIn_63_0 = stackOut_58_0;
                                          break L27;
                                        }
                                      } else {
                                        stackOut_56_0 = 1;
                                        stackIn_63_0 = stackOut_56_0;
                                        break L27;
                                      }
                                    }
                                    L29: {
                                      var12 = stackIn_63_0;
                                      if (var11_int != 0) {
                                        break L29;
                                      } else {
                                        if (var12 != 0) {
                                          break L29;
                                        } else {
                                          L30: {
                                            if (1 == var17_ref.field_w) {
                                              break L30;
                                            } else {
                                              if (var17_ref.field_w == 6) {
                                                break L30;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          var7.a(-122, (bf) (Object) var17_ref);
                                          var13_int = 0;
                                          L31: while (true) {
                                            if (var13_int >= var17_ref.field_m) {
                                              continue L24;
                                            } else {
                                              var18 = var17_ref.field_o[var13_int];
                                              if (hd.field_u != var18.field_t) {
                                                var15 = (ki) (Object) var7.a(true);
                                                L32: while (true) {
                                                  if (var15 == null) {
                                                    var15 = (ki) (Object) var6.a(true);
                                                    L33: while (true) {
                                                      if (var15 == null) {
                                                        var6.a(-122, (bf) (Object) var18);
                                                        var13_int++;
                                                        continue L31;
                                                      } else {
                                                        if (var18 != var15) {
                                                          var15 = (ki) (Object) var6.c((byte) -75);
                                                          continue L33;
                                                        } else {
                                                          var13_int++;
                                                          continue L31;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (var18 != var15) {
                                                      var15 = (ki) (Object) var7.c((byte) -75);
                                                      continue L32;
                                                    } else {
                                                      var13_int++;
                                                      continue L31;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var13_int++;
                                                continue L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var8 = 0;
                                    if (var9 != 0) {
                                      if (var12 != 0) {
                                        var9 = 0;
                                        break L25;
                                      } else {
                                        var9 = 1;
                                        break L25;
                                      }
                                    } else {
                                      var9 = 0;
                                      break L25;
                                    }
                                  } else {
                                    break L25;
                                  }
                                }
                                L34: {
                                  if (var8 != 0) {
                                    var10 = (ki) (Object) var7.a((byte) -120);
                                    L35: while (true) {
                                      if (var10 == null) {
                                        if (var9 != 0) {
                                          var7.c(32);
                                          var6.a(-124, (bf) (Object) var4.field_o[var5_int]);
                                          var10 = var4.field_o[var5_int];
                                          L36: while (true) {
                                            var20_ref = (ki) (Object) var6.a((byte) -120);
                                            var11 = var20_ref;
                                            if (var20_ref != null) {
                                              L37: {
                                                var7.a(-119, (bf) (Object) var20_ref);
                                                if (var10.field_q > var20_ref.field_q) {
                                                  var10_ref = var20_ref;
                                                  break L37;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                              var12 = 0;
                                              L38: while (true) {
                                                if (var12 >= var11.field_m) {
                                                  continue L36;
                                                } else {
                                                  var13 = var11.field_o[var12];
                                                  if (var13 == null) {
                                                    gl.a((Object[]) (Object) var11.field_o, var12 - -1, (Object[]) (Object) var11.field_o, var12, -var12 + var11.field_m);
                                                    var12--;
                                                    var11.field_m = var11.field_m - 1;
                                                    var12++;
                                                    continue L38;
                                                  } else {
                                                    if (hd.field_u != var13.field_t) {
                                                      var14 = (ki) (Object) var7.a(true);
                                                      L39: while (true) {
                                                        if (var14 == null) {
                                                          var14 = (ki) (Object) var6.a(true);
                                                          L40: while (true) {
                                                            if (var14 == null) {
                                                              var6.a(-107, (bf) (Object) var13);
                                                              var12++;
                                                              continue L38;
                                                            } else {
                                                              if (var13 != var14) {
                                                                var14 = (ki) (Object) var6.c((byte) -75);
                                                                continue L40;
                                                              } else {
                                                                var12++;
                                                                continue L38;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (var14 != var13) {
                                                            var14 = (ki) (Object) var7.c((byte) -75);
                                                            continue L39;
                                                          } else {
                                                            var12++;
                                                            continue L38;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var12++;
                                                      continue L38;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L34;
                                            }
                                          }
                                        } else {
                                          var5_int++;
                                          continue L18;
                                        }
                                      } else {
                                        L41: {
                                          if (var10.field_A) {
                                            break L41;
                                          } else {
                                            var3++;
                                            var10.field_A = true;
                                            break L41;
                                          }
                                        }
                                        var10.field_t = hd.field_u;
                                        var10 = (ki) (Object) var7.a((byte) -120);
                                        continue L35;
                                      }
                                    }
                                  } else {
                                    if (var9 != 0) {
                                      var7.c(32);
                                      var6.a(-124, (bf) (Object) var4.field_o[var5_int]);
                                      var10 = var4.field_o[var5_int];
                                      L42: while (true) {
                                        var19_ref = (ki) (Object) var6.a((byte) -120);
                                        if (var19_ref != null) {
                                          L43: {
                                            var7.a(-119, (bf) (Object) var19_ref);
                                            if (var10.field_q > var19_ref.field_q) {
                                              var10_ref = var19_ref;
                                              break L43;
                                            } else {
                                              break L43;
                                            }
                                          }
                                          var12 = 0;
                                          L44: while (true) {
                                            if (var12 >= var19_ref.field_m) {
                                              continue L42;
                                            } else {
                                              var13 = var19_ref.field_o[var12];
                                              if (var13 == null) {
                                                gl.a((Object[]) (Object) var19_ref.field_o, var12 - -1, (Object[]) (Object) var19_ref.field_o, var12, -var12 + var19_ref.field_m);
                                                var12--;
                                                var19_ref.field_m = var19_ref.field_m - 1;
                                                var12++;
                                                continue L44;
                                              } else {
                                                if (hd.field_u != var13.field_t) {
                                                  var14 = (ki) (Object) var7.a(true);
                                                  L45: while (true) {
                                                    if (var14 == null) {
                                                      var14 = (ki) (Object) var6.a(true);
                                                      L46: while (true) {
                                                        if (var14 == null) {
                                                          var6.a(-107, (bf) (Object) var13);
                                                          var12++;
                                                          continue L44;
                                                        } else {
                                                          if (var13 != var14) {
                                                            var14 = (ki) (Object) var6.c((byte) -75);
                                                            continue L46;
                                                          } else {
                                                            var12++;
                                                            continue L44;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      if (var14 != var13) {
                                                        var14 = (ki) (Object) var7.c((byte) -75);
                                                        continue L45;
                                                      } else {
                                                        var12++;
                                                        continue L44;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var12++;
                                                  continue L44;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L34;
                                        }
                                      }
                                    } else {
                                      var5_int++;
                                      continue L18;
                                    }
                                  }
                                }
                                var10_ref.field_x = true;
                                var5_int++;
                                continue L18;
                              }
                            }
                          }
                        } else {
                          if (ri.field_b != var4.field_t) {
                            break L10;
                          } else {
                            ri.field_b.a(-8212, (ug) (Object) var4);
                            break L10;
                          }
                        }
                      }
                      var4.field_t = null;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var4 = (ki) (Object) ok.field_a.d((byte) 63);
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            L47: {
              if (var1_ref_ki.field_t == ok.field_a) {
                var1_ref_ki.c((byte) -94);
                var1_ref_ki.field_D = 0.0f;
                var1_ref_ki.field_v = 0.0f;
                var1_ref_ki.c(-19822);
                var1_ref_ki.a(7847);
                ok.field_a.a(-8212, (ug) (Object) var1_ref_ki);
                break L47;
              } else {
                if (ri.field_b == var1_ref_ki.field_t) {
                  var1_ref_ki.c(-19822);
                  var1_ref_ki.a(7847);
                  ri.field_b.a(-8212, (ug) (Object) var1_ref_ki);
                  break L47;
                } else {
                  break L47;
                }
              }
            }
            var1_ref_ki.field_t = null;
            var1_ref_ki = (ki) (Object) hd.field_u.d((byte) 63);
            continue L0;
          }
        }
    }

    private final void b(boolean param0) {
        if (!this.l(-60)) {
            return;
        }
        sg.a(((eb) this).field_G.field_s, (byte) -120);
        if (!param0) {
            field_A = null;
        }
    }

    public static void k(int param0) {
        field_A = null;
        field_C = null;
        field_E = null;
        if (param0 > -42) {
            field_C = null;
        }
    }

    private final int a(String param0, we param1, int param2, String param3, int param4, int param5) {
        if (param4 != 35) {
            ((eb) this).field_D = null;
        }
        return this.a(param1, param0, 35, param5, 120, param3, param2);
    }

    private final int a(we param0, String param1, int param2, int param3, int param4, String param5, int param6) {
        mh var10 = new mh(20, param6, param4 + param3, 25, param0, false, 120, 3, t.field_z, 16777215, param5);
        ((eb) this).b((byte) -111, (we) (Object) var10);
        vg var9 = new vg(((ag) (Object) param0).a(param4 ^ 88), param1, 126, var10.field_p + param6, 25 + param3, param2);
        var9.field_o = (of) this;
        ((eb) this).b((byte) -95, (we) (Object) var9);
        return var9.field_p + var10.field_p;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        if (!(!super.a(param0, param1, param2, 110))) {
            return true;
        }
        if (!(param2 != 98)) {
            return ((eb) this).a((byte) 85, param0);
        }
        if (!(param2 != 99)) {
            return ((eb) this).b(param0, false);
        }
        int var5 = -120 % ((37 - param3) / 50);
        return false;
    }

    public final void a(int param0) {
        ((hh) (Object) ((eb) this).field_G.a(-125)).f((byte) -88);
        if (param0 != 200) {
            eb.m(63);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "This password contains repeated characters, and would be easy to guess";
        field_C = new pj();
    }
}
