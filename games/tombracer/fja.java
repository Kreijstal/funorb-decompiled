/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fja extends qra {
    private boolean field_p;
    private qa[] field_n;
    private boolean field_o;
    private int field_q;
    private boolean field_m;

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == 80) {
            break L0;
          } else {
            fja.a(59, 38, (byte) -62, 36, 61, 1);
            break L0;
          }
        }
        L1: {
          var3 = ((fja) this).field_h.l(115);
          if (!((fja) this).field_o) {
            break L1;
          } else {
            if (!((fja) this).field_c.g(0)) {
              break L1;
            } else {
              this.g(param0 + -208);
              break L1;
            }
          }
        }
        L2: {
          if (((fja) this).field_q > 0) {
            ((fja) this).field_q = ((fja) this).field_q - 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((fja) this).field_h.field_D) {
            break L3;
          } else {
            if (((fja) this).field_h.e(118)) {
              return;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (((fja) this).field_c.e(2) != -1) {
            break L4;
          } else {
            ((fja) this).field_h.h(110);
            break L4;
          }
        }
        var4 = 0;
        L5: while (true) {
          if (((fja) this).field_n.length <= var4) {
            L6: {
              if (((fja) this).field_h.d((byte) 95)) {
                if (!((fja) this).field_h.g(0, 0)) {
                  if (!((fja) this).field_h.g(param0 + -80, 1)) {
                    break L6;
                  } else {
                    ((fja) this).field_h.e(1, 17219);
                    break L6;
                  }
                } else {
                  ((fja) this).field_h.e(-1, 17219);
                  break L6;
                }
              } else {
                if (!((fja) this).field_c.b((byte) 90, var3)) {
                  break L6;
                } else {
                  if (((fja) this).field_m) {
                    break L6;
                  } else {
                    ((fja) this).field_m = true;
                    if (((fja) this).field_h.c(false)) {
                      ((fja) this).field_h.a((me) (Object) new ova(((fja) this).field_h), 680);
                      break L6;
                    } else {
                      ((fja) this).field_h.a((me) (Object) new gi(((fja) this).field_h), param0 + 600);
                      break L6;
                    }
                  }
                }
              }
            }
            this.b((byte) 101);
            var6 = 0;
            var4 = var6;
            L7: while (true) {
              if (var6 >= ((fja) this).field_n.length) {
                L8: {
                  if (!((fja) this).field_h.field_D) {
                    int discarded$1 = 0;
                    this.i();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              } else {
                ((fja) this).field_n[var6].a((byte) 111);
                var6++;
                continue L7;
              }
            }
          } else {
            if (!((fja) this).field_n[var4].c(1727002282)) {
              if (((fja) this).field_c.f((byte) -127, var4)) {
                ((fja) this).field_n[var4].a(60, true);
                ((fja) this).field_n[var4].a(0, (byte) 108, 2 * aaa.a(false));
                var4++;
                continue L5;
              } else {
                var4++;
                continue L5;
              }
            } else {
              var4++;
              continue L5;
            }
          }
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5_int = 0;
        la var5 = null;
        int var6 = 0;
        int[][] var6_ref_int____ = null;
        int var7_int = 0;
        g var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[][] var15 = null;
        hca var16 = null;
        String var17 = null;
        String var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          var3 = ((fja) this).field_h.l(81);
          ((fja) this).field_n[var3].b(23479);
          if (!((fja) this).field_h.f((byte) 33)) {
            var4_int = 0;
            var5_int = 0;
            L1: while (true) {
              if (((fja) this).field_c.field_c.field_e.length <= var5_int) {
                var5_int = 0;
                var6 = 0;
                L2: while (true) {
                  if (var6 >= ((fja) this).field_c.field_H.length) {
                    if (var5_int == 2) {
                      var6 = 0;
                      var7_int = 0;
                      L3: while (true) {
                        if (((fja) this).field_c.field_H.length <= var7_int) {
                          ((fja) this).field_n[var6].a(0, qu.field_e, -20186);
                          ((fja) this).field_n[var6].b(23479);
                          break L0;
                        } else {
                          if (!((fja) this).field_c.f((byte) -85, var7_int)) {
                            if (var3 != var7_int) {
                              var6 = var7_int;
                              var7_int++;
                              continue L3;
                            } else {
                              var7_int++;
                              continue L3;
                            }
                          } else {
                            var7_int++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      if (var5_int <= 2) {
                        break L0;
                      } else {
                        L4: {
                          var21 = new int[var5_int][2];
                          var20 = var21;
                          var19 = var20;
                          var15 = var19;
                          var6_ref_int____ = var15;
                          var6_ref_int____[1] = new int[2];
                          if (var5_int == 4) {
                            var6_ref_int____[2] = new int[2];
                            var6_ref_int____[3] = new int[2];
                            break L4;
                          } else {
                            var6_ref_int____[2] = new int[2];
                            break L4;
                          }
                        }
                        var6_ref_int____[0] = new int[2];
                        var7_int = 0;
                        L5: while (true) {
                          if (var21[var4_int].length <= var7_int) {
                            break L0;
                          } else {
                            var8 = ((fja) this).field_c.field_c.field_e[var21[var4_int][var7_int]];
                            if (var8 != -1) {
                              if (var3 != var8) {
                                ((fja) this).field_n[var8].a(var7_int, mma.field_c, -20186);
                                ((fja) this).field_n[var8].b(23479);
                                var7_int++;
                                continue L5;
                              } else {
                                var7_int++;
                                continue L5;
                              }
                            } else {
                              var7_int++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (!((fja) this).field_c.f((byte) -81, var6)) {
                      var5_int++;
                      var6++;
                      continue L2;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((fja) this).field_c.field_c.field_e[var5_int] == var3) {
                  var4_int = var5_int;
                  var5_int++;
                  continue L1;
                } else {
                  var5_int++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L6: {
          if (((fja) this).field_h.f((byte) 33)) {
            break L6;
          } else {
            if (((fja) this).field_h.field_A) {
              break L6;
            } else {
              L7: {
                if (((fja) this).field_h.d((byte) 78)) {
                  var4_int = 16;
                  var5_int = 16;
                  var6 = 256;
                  var7_int = 64;
                  qa.a(var7_int, var6, (byte) 109, var4_int, aq.field_a, var5_int);
                  int discarded$4 = be.a(dpa.field_c, 0, qr.field_v, 11903361, 40, var7_int, 1, var5_int, var4_int, 0, (byte) 60, var6);
                  int discarded$5 = be.a(voa.field_q + ": " + ((fja) this).field_h.j(var3, 9), 2, eda.field_f, 11903361, 40, var7_int, 1, var5_int, var4_int, 1, (byte) 60, var6);
                  var5_int = var5_int + (var7_int - -16);
                  var7_int = 32;
                  qa.a(var7_int, var6, (byte) 80, var4_int, aq.field_a, var5_int);
                  int discarded$6 = kn.field_p.a((aa) null, var6, 40, 0, var5_int - -2, fm.a(false, 0), wca.field_l, 1, fm.a(false, 11903361), tp.field_J, (byte) 116, var7_int, 0, id.field_h, var4_int, 1);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (!param1) {
                return;
              } else {
                L8: {
                  if (param0 < -50) {
                    break L8;
                  } else {
                    ((fja) this).field_o = true;
                    break L8;
                  }
                }
                L9: {
                  if (((fja) this).field_q > 0) {
                    L10: {
                      if (50 >= ((fja) this).field_q) {
                        var4 = jh.field_J;
                        break L10;
                      } else {
                        var4 = hua.field_b.toUpperCase();
                        break L10;
                      }
                    }
                    var5_int = 40 + ds.field_n.a(var4, (byte) 41);
                    var6 = aaa.a(false) / 2;
                    var7_int = koa.b(0) / 2;
                    qa.a(64, var5_int, (byte) 74, -(var5_int / 2) + var6, aq.field_a, -ds.field_n.field_d + (var7_int + -32));
                    if (((fja) this).field_q > 50) {
                      if (0 != ((fja) this).field_c.field_K) {
                        oka.a(var4, 16777215, eda.field_f, -1, var7_int, var6, 0);
                        break L9;
                      } else {
                        oka.a(uqa.field_z + " " + (1 + ((fja) this).field_c.field_A), 16777215, eda.field_f, -1, 225, var6, 0);
                        oka.a(var4, 16777215, eda.field_f, -1, 255, var6, 0);
                        break L9;
                      }
                    } else {
                      oka.a(var4, 16777215, eda.field_f, -1, var7_int, var6, 0);
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (((fja) this).field_p) {
                    L12: {
                      ua.a(4, kn.field_p, "Debug", 565, 0, 48, 16777215);
                      ua.a(4, kn.field_p, "FPS: " + oea.field_f, 565, 0, 64, 16777215);
                      if (((fja) this).field_h.field_D) {
                        ((fja) this).field_f.c(16);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    if (var3 < 0) {
                      break L11;
                    } else {
                      if (((fja) this).field_h.f(-12963, var3)) {
                        L13: {
                          var16 = ((fja) this).field_h.field_k.field_H[var3];
                          var5 = var16.f((byte) 87);
                          var6 = var5.q((byte) -82);
                          if (-4 != ((fja) this).field_c.field_K) {
                            if (0 != ((fja) this).field_c.i(0)) {
                              var7 = doa.b(var6, 0, ((fja) this).field_c.i(0));
                              break L13;
                            } else {
                              if (var5.j(0)) {
                                var7 = mna.a(0, var6);
                                break L13;
                              } else {
                                var7 = kq.a(-111, var6);
                                break L13;
                              }
                            }
                          } else {
                            int discarded$7 = 64;
                            var7 = doa.b(var6, 0, pl.a());
                            break L13;
                          }
                        }
                        L14: {
                          var8 = 64;
                          var9 = -64 + koa.b(0);
                          var10 = var5.p((byte) 69);
                          var11 = 16777215;
                          ts.a(0, -34, -16 + var9, "Par Time: " + dea.a(var7.field_h, (byte) -8), var8, kn.field_p, 16777215);
                          var17 = "Room total: " + dea.a(var10, (byte) -8);
                          var12 = var17;
                          var12 = var17;
                          if (9000 < var10) {
                            var12 = var17 + " !!! :(";
                            var11 = 16711680;
                            break L14;
                          } else {
                            if (var10 > 3000) {
                              var12 = var17 + " :(";
                              var11 = 16776960;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          ts.a(0, -73, var9, var12, var8, kn.field_p, var11);
                          var12 = "Member Only: " + kq.a(-112, var5.q((byte) -82)).field_d;
                          ts.a(0, -80, 16 + var9, var12, var8, kn.field_p, 16777215);
                          var13 = var16.L(2158);
                          if (var13 <= 0) {
                            break L15;
                          } else {
                            L16: {
                              var11 = 16777215;
                              var18 = "Last room total: " + dea.a(var13, (byte) -8);
                              var12 = var18;
                              var12 = var18;
                              if (var13 <= 9000) {
                                if (var13 > 3000) {
                                  var11 = 16776960;
                                  var12 = var18 + " :(";
                                  break L16;
                                } else {
                                  break L16;
                                }
                              } else {
                                var12 = var18 + " !!! :(";
                                var11 = 16711680;
                                break L16;
                              }
                            }
                            ts.a(0, -62, var9 + 32, var12, var8, kn.field_p, var11);
                            break L15;
                          }
                        }
                        ts.a(0, -96, var9 + 46, "Room: " + var7.field_b + " (multi " + var7.field_a + ") (single  " + var6 + ")", var8, kn.field_p, 16777215);
                        ts.a(0, -33, var9 - -62, "Group: " + var7.field_g, var8, kn.field_p, 16777215);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final boolean a(char param0, int param1, int param2) {
        dl var5 = null;
        dt var6 = null;
        int stackIn_14_0 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          if (!rda.d(20125)) {
            break L0;
          } else {
            if (param2 != 28) {
              if (param2 == 16) {
                this.a(0, (byte) -109);
                return true;
              } else {
                if (param2 != 17) {
                  if (18 == param2) {
                    this.a(2, (byte) -109);
                    return true;
                  } else {
                    if (19 == param2) {
                      this.a(3, (byte) -109);
                      return true;
                    } else {
                      if (param2 == 20) {
                        this.a(4, (byte) -109);
                        return true;
                      } else {
                        if (param2 == 21) {
                          L1: {
                            if (ica.field_a) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L1;
                            } else {
                              stackOut_12_0 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              break L1;
                            }
                          }
                          ica.field_a = stackIn_14_0 != 0;
                          return true;
                        } else {
                          if (param2 != 40) {
                            if (!((fja) this).field_h.field_D) {
                              var6 = ((fja) this).field_c.f(((fja) this).field_h.field_x, param1 + -25);
                              if (param2 == 25) {
                                var6.a((byte) -114).b(7, true);
                                return true;
                              } else {
                                L2: {
                                  if (param2 == 24) {
                                    if (((fja) this).field_h.d(0)) {
                                      break L2;
                                    } else {
                                      var5 = new dl(((fja) this).field_h, (ms) null);
                                      var5.a("TITLE!", "Lalala here is some text to test with", "Press fire to continue. Or not.", (byte) 125);
                                      ((fja) this).field_h.a((me) (Object) var5, param1 + 655);
                                      return true;
                                    }
                                  } else {
                                    if (param2 == 22) {
                                      var6.field_g.a(1, (byte) 113);
                                      ((fja) this).field_h.l((byte) -38);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                if (param2 == 41) {
                                  var6.b((byte) 114);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              return false;
                            }
                          } else {
                            L3: {
                              stackOut_20_0 = this;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_21_0 = stackOut_20_0;
                              if (((fja) this).field_p) {
                                stackOut_22_0 = this;
                                stackOut_22_1 = 0;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                break L3;
                              } else {
                                stackOut_21_0 = this;
                                stackOut_21_1 = 1;
                                stackIn_23_0 = stackOut_21_0;
                                stackIn_23_1 = stackOut_21_1;
                                break L3;
                              }
                            }
                            ((fja) this).field_p = stackIn_23_1 != 0;
                            return true;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.a(1, (byte) -109);
                  return true;
                }
              }
            } else {
              this.a(-1, (byte) -109);
              ica.field_a = true;
              return true;
            }
          }
        }
        if (param1 == 25) {
          return false;
        } else {
          ((fja) this).field_m = true;
          return false;
        }
    }

    private final void f() {
        ((fja) this).field_o = false;
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return true;
        }
        return true;
    }

    private final void a(int param0, int param1) {
        ((fja) this).field_h.i(param1, 62);
    }

    private final void b(byte param0) {
        int var2 = ((fja) this).field_h.l(89);
        if (((fja) this).field_c.field_P <= 1) {
            ((fja) this).field_n[var2].a(0, mf.field_d, -20186);
        } else {
            ((fja) this).field_n[var2].a(0, dp.field_j, -20186);
        }
        if (param0 < 52) {
            ((fja) this).field_p = false;
        }
    }

    private final void g(int param0) {
        ((fja) this).field_o = false;
        ((fja) this).field_q = 75;
        if (param0 >= -67) {
            ((fja) this).field_m = true;
        }
    }

    private final void i() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var7 = null;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (((fja) this).field_h.c(false)) {
            break L0;
          } else {
            if (!((fja) this).field_c.b(0)) {
              break L0;
            } else {
              if (((fja) this).field_c.field_G[0].e(-31170)) {
                this.a(0, -2);
                break L0;
              } else {
                if (((fja) this).field_c.field_L > 1) {
                  var7 = new int[((fja) this).field_c.field_k][3];
                  var3 = 0;
                  L1: while (true) {
                    if (var3 >= ((fja) this).field_c.field_k) {
                      ((fja) this).field_h.a((byte) 101, var7, ((fja) this).field_h.field_x);
                      break L0;
                    } else {
                      var4 = 0;
                      L2: while (true) {
                        if (3 <= var4) {
                          var3++;
                          continue L1;
                        } else {
                          var7[var3][var4] = ((fja) this).field_c.field_H[var3].c(196608, var4);
                          var4++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  this.a(0, ((fja) this).field_h.field_x);
                  break L0;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (4 > param0) {
            break L0;
          } else {
            ((fja) this).field_h.field_A = true;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((fja) this).field_n.length) {
            return;
          } else {
            L2: {
              if (((fja) this).field_h.l(112) == var3) {
                break L2;
              } else {
                if (((fja) this).field_h.d((byte) 102)) {
                  break L2;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
            ((fja) this).field_n[var3].a((byte) -115, param0);
            var3++;
            continue L1;
          }
        }
    }

    final static boolean h(int param0) {
        if (param0 <= 83) {
            fja.a(-107, -110, (byte) -67, -77, -33, 57);
        }
        fpa.field_c = true;
        oga.field_f = 15000L + bva.b((byte) -107);
        return gda.field_c == 11 ? true : false;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param2 < 122) {
            return;
        }
        tga.field_a.za(param0, param5, param4, jg.a(param3, (byte) -115, param1), 2);
    }

    final static int a(goa param0, String param1, boolean param2, int param3, goa param4, int param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        uia stackIn_13_0 = null;
        uia stackIn_14_0 = null;
        uia stackIn_15_0 = null;
        String stackIn_15_1 = null;
        uia stackIn_16_0 = null;
        uia stackIn_17_0 = null;
        uia stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        uia stackOut_12_0 = null;
        uia stackOut_14_0 = null;
        String stackOut_14_1 = null;
        uia stackOut_13_0 = null;
        String stackOut_13_1 = null;
        uia stackOut_15_0 = null;
        uia stackOut_17_0 = null;
        String stackOut_17_1 = null;
        uia stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param5 >= 77) {
              L1: {
                var14 = param4.a(-12851);
                var11_ref_String = var14;
                var11_ref_String = var14;
                var8 = param0.a(-12851);
                var11_ref_String = var8;
                var11_ref_String = var8;
                if (oba.field_e != null) {
                  break L1;
                } else {
                  if (!joa.a(false, (byte) -58)) {
                    stackOut_7_0 = -1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (km.field_p == sua.field_G) {
                  L3: {
                    ql.field_k.field_h = 0;
                    kia.field_b = null;
                    if (param1 != null) {
                      L4: {
                        var9 = 0;
                        jg.field_a.field_h = 0;
                        if (!param2) {
                          break L4;
                        } else {
                          var9 = var9 | 1;
                          break L4;
                        }
                      }
                      L5: {
                        jg.field_a.a(lpa.field_p.nextInt(), (byte) 91);
                        jg.field_a.a(lpa.field_p.nextInt(), (byte) 92);
                        jg.field_a.a(var14, (byte) 0);
                        jg.field_a.a(var8, (byte) 0);
                        var15 = (CharSequence) (Object) param1;
                        jg.field_a.a(fl.a((byte) 126, var15), (byte) 0);
                        jg.field_a.f(-1477662136, param6);
                        jg.field_a.i(param3, 0);
                        jg.field_a.i(var9, 0);
                        ql.field_k.i(18, 0);
                        ql.field_k.field_h = ql.field_k.field_h + 2;
                        var10 = ql.field_k.field_h;
                        var11_ref_String = qla.a(0, di.a(62));
                        if (var11_ref_String != null) {
                          break L5;
                        } else {
                          var11_ref_String = "";
                          break L5;
                        }
                      }
                      ql.field_k.a(var11_ref_String, false);
                      bna.a(oca.field_a, false, c.field_f, (uia) (Object) ql.field_k, jg.field_a);
                      ql.field_k.b(ql.field_k.field_h + -var10, (byte) -35);
                      break L3;
                    } else {
                      L6: {
                        jg.field_a.field_h = 0;
                        jg.field_a.a(lpa.field_p.nextInt(), (byte) -106);
                        jg.field_a.a(lpa.field_p.nextInt(), (byte) 92);
                        stackOut_12_0 = jg.field_a;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (!param4.a((byte) 29)) {
                          stackOut_14_0 = (uia) (Object) stackIn_14_0;
                          stackOut_14_1 = "";
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          break L6;
                        } else {
                          stackOut_13_0 = (uia) (Object) stackIn_13_0;
                          stackOut_13_1 = (String) var14;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          break L6;
                        }
                      }
                      L7: {
                        ((uia) (Object) stackIn_15_0).a(stackIn_15_1, (byte) 0);
                        stackOut_15_0 = jg.field_a;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (param0.a((byte) 29)) {
                          stackOut_17_0 = (uia) (Object) stackIn_17_0;
                          stackOut_17_1 = (String) var8;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          break L7;
                        } else {
                          stackOut_16_0 = (uia) (Object) stackIn_16_0;
                          stackOut_16_1 = "";
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_18_1 = stackOut_16_1;
                          break L7;
                        }
                      }
                      ((uia) (Object) stackIn_18_0).a(stackIn_18_1, (byte) 0);
                      ql.field_k.i(16, 0);
                      ql.field_k.field_h = ql.field_k.field_h + 1;
                      var9 = ql.field_k.field_h;
                      bna.a(oca.field_a, false, c.field_f, (uia) (Object) ql.field_k, jg.field_a);
                      ql.field_k.d(ql.field_k.field_h - var9, (byte) -115);
                      break L3;
                    }
                  }
                  bl.a(-1, -1);
                  km.field_p = hca.field_p;
                  break L2;
                } else {
                  break L2;
                }
              }
              L8: {
                if (hca.field_p == km.field_p) {
                  if (!ama.a(1, -1)) {
                    break L8;
                  } else {
                    L9: {
                      var9 = vc.field_q.h(255);
                      vc.field_q.field_h = 0;
                      if (var9 < 100) {
                        break L9;
                      } else {
                        if (var9 <= 105) {
                          km.field_p = ne.field_c;
                          dja.field_s = new String[-100 + var9];
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var9 != 248) {
                      if (99 == var9) {
                        boolean discarded$9 = ama.a(bha.f(1), -1);
                        int discarded$10 = 107;
                        kia.field_b = new Boolean(di.a((uia) (Object) vc.field_q));
                        vc.field_q.field_h = 0;
                        break L8;
                      } else {
                        oka.field_z = var9;
                        km.field_p = pe.field_m;
                        uca.field_d = -1;
                        break L8;
                      }
                    } else {
                      int discarded$11 = 255;
                      pu.a(di.a(21));
                      io.field_b = qda.field_f;
                      int discarded$12 = 60;
                      dea.a();
                      uc.field_L = false;
                      stackOut_32_0 = var9;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0;
                    }
                  }
                } else {
                  break L8;
                }
              }
              L10: {
                if (km.field_p == ne.field_c) {
                  var9 = 2;
                  if (!ama.a(var9, -1)) {
                    break L10;
                  } else {
                    var10 = vc.field_q.d(124);
                    vc.field_q.field_h = 0;
                    if (!ama.a(var10, -1)) {
                      break L10;
                    } else {
                      var11 = dja.field_s.length;
                      var12 = 0;
                      L11: while (true) {
                        if (var11 <= var12) {
                          int discarded$13 = 60;
                          dea.a();
                          uc.field_L = false;
                          stackOut_45_0 = var11 + 100;
                          stackIn_46_0 = stackOut_45_0;
                          return stackIn_46_0;
                        } else {
                          dja.field_s[var12] = vc.field_q.f(121);
                          var12++;
                          continue L11;
                        }
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
              L12: {
                if (pe.field_m == km.field_p) {
                  int discarded$14 = 0;
                  if (cla.g()) {
                    L13: {
                      if (oka.field_z == 255) {
                        var9_ref_String = vc.field_q.c(-28690);
                        if (var9_ref_String != null) {
                          int discarded$15 = -21407;
                          mp.a(var9_ref_String, di.a(82));
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        io.field_b = vc.field_q.e((byte) -76);
                        break L13;
                      }
                    }
                    int discarded$16 = 60;
                    dea.a();
                    uc.field_L = false;
                    stackOut_56_0 = oka.field_z;
                    stackIn_57_0 = stackOut_56_0;
                    return stackIn_57_0;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L14: {
                if (null == oba.field_e) {
                  if (!uc.field_L) {
                    var9 = nn.field_b;
                    nn.field_b = uq.field_a;
                    uq.field_a = var9;
                    uc.field_L = true;
                    break L14;
                  } else {
                    L15: {
                      int discarded$17 = -121;
                      if (rf.b() > 30000L) {
                        io.field_b = hb.field_u;
                        break L15;
                      } else {
                        io.field_b = sq.field_x;
                        break L15;
                      }
                    }
                    uc.field_L = false;
                    stackOut_64_0 = 249;
                    stackIn_65_0 = stackOut_64_0;
                    return stackIn_65_0;
                  }
                } else {
                  break L14;
                }
              }
              stackOut_67_0 = -1;
              stackIn_68_0 = stackOut_67_0;
              break L0;
            } else {
              stackOut_2_0 = 113;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("fja.S(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L16;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L16;
            }
          }
          L17: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param1 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L17;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L17;
            }
          }
          L18: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param4 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L18;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_68_0;
    }

    final static byte[] a(int param0, byte[] param1, int param2) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        vh var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= 0) {
                var4 = param1;
                break L1;
              } else {
                var8 = new byte[param0];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param0) {
                    break L1;
                  } else {
                    var8[var5_int] = param1[param2 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = new vh();
            var5.b((byte) -6);
            var5.a(var4, (long)(8 * param0), (byte) -59);
            var6 = new byte[64];
            var5.a(0, 32, var6);
            stackOut_6_0 = (byte[]) var6;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("fja.R(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + 8 + ')');
        }
        return stackIn_7_0;
    }

    fja(qh param0, v param1) {
        super(param0, param1);
        int var3_int = 0;
        int var4 = 0;
        ((fja) this).field_p = false;
        ((fja) this).field_o = true;
        ((fja) this).field_m = false;
        try {
            var3_int = ((fja) this).field_h.field_k.field_H.length;
            ((fja) this).field_n = new qa[var3_int];
            for (var4 = 0; var4 < var3_int; var4++) {
                ((fja) this).field_n[var4] = new qa(((fja) this).field_h, var4);
            }
            if (!((fja) this).field_h.f((byte) 33)) {
                if (((fja) this).field_h.c(false)) {
                    int discarded$0 = 16;
                    this.f();
                }
                if (((fja) this).field_h.field_D) {
                    ((fja) this).field_h.a((me) (Object) new dua(((fja) this).field_h), 680);
                }
                er.b(1, 1);
            }
            ((fja) this).field_h.field_r = -1;
            this.b((byte) 122);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
