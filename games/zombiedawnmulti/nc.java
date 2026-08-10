/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nc {
    static cj field_e;
    int[] field_j;
    hh field_g;
    int field_i;
    private int field_b;
    private boolean field_f;
    static String field_c;
    static int field_h;
    int field_a;
    int field_d;
    int field_k;

    final void c(int param0) {
        int var3;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (this.field_d == 2) {
            this.field_b = this.field_b - ah.field_e.field_C / 2;
            this.field_j = new int[]{1, 12, 13, 34, 47, 4, 50, 3, 7};
            this.field_g = new hh(this.field_j.length);
            break L0;
          } else {
            if (3 == this.field_d) {
              this.field_j = new int[]{48, 5};
              this.field_g = new hh(this.field_j.length);
              break L0;
            } else {
              if ((this.field_d ^ -1) != -6) {
                break L0;
              } else {
                this.field_j = new int[]{5};
                this.field_g = new hh(this.field_j.length);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            nc.a((byte) -25);
            break L1;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int var4 = 0;
        int var3 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (cp.field_K) {
            bi.field_e = true;
            kk.a(-97, 0, 11);
        } else {
            if (df.field_I) {
                var3 = pp.field_n ? 1 : 0;
                wb.l((byte) 124);
                if (var3 == 0) {
                    var4 = param0 ? 1 : 0;
                    bm.a(var4 != 0, 15, 127, sp.field_g);
                } else {
                    var4 = param0 ? 1 : 0;
                    bm.a(var4 != 0, 1, 125, sp.field_g);
                }
            }
        }
        if (param1 != 200) {
            this.field_b = 82;
        }
        var3 = param0 ? 1 : 0;
        bm.a(var3 != 0, -5, 126, sp.field_g);
    }

    public static void b(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_e = null;
    }

    boolean c(int param0, int param1) {
        if (!((this.field_j[param0] ^ -1) != -40)) {
            return false;
        }
        if (-22 == (this.field_j[param0] ^ -1) && fb.field_e.g(param1 + -16777149) == 0) {
            return false;
        }
        if (param1 != 16777215) {
            this.field_a = -71;
            return true;
        }
        return true;
    }

    final static boolean a(byte param0) {
        int var1;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var1 = 91 % ((param0 - 33) / 35);
            if (ki.field_e != null) {
              break L1;
            } else {
              if (!ee.field_b) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 1;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    int a(byte param0, int param1) {
        if (param0 != -118) {
            this.b((byte) -12);
        }
        if (!this.field_f) {
            return this.field_i + this.field_k * param1;
        }
        return this.field_i;
    }

    final void b(int param0) {
        int var3;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            this.field_d = -56;
            break L0;
          }
        }
        L1: {
          if (-2 != (this.field_d ^ -1)) {
            L2: {
              if (this.field_d == 2) {
                break L2;
              } else {
                if (13 != this.field_d) {
                  L3: {
                    if (-4 == (this.field_d ^ -1)) {
                      break L3;
                    } else {
                      if (this.field_d == 5) {
                        break L3;
                      } else {
                        if (6 == this.field_d) {
                          break L3;
                        } else {
                          if (this.field_d == 7) {
                            break L3;
                          } else {
                            if (14 == this.field_d) {
                              break L3;
                            } else {
                              if (8 != this.field_d) {
                                if ((this.field_d ^ -1) == -16) {
                                  oo.e(0, 0, 640, 480, 16777215);
                                  oo.h(0, 0, 640, 5);
                                  dd.field_g.d(0, 0);
                                  oo.h(0, 5, 640, 480);
                                  dd.field_g.d(0, -32);
                                  v.field_e.d(0, 448 - (pi.field_f.field_b + v.field_e.field_b));
                                  oo.h(4, 330, 636, 335);
                                  dd.field_g.d(0, 330);
                                  oo.h(0, 335, 640, 419);
                                  v.field_e.d(0, 300);
                                  oo.c();
                                  pi.field_f.d(0, 480 + -pi.field_f.field_b);
                                  break L1;
                                } else {
                                  if (4 == this.field_d) {
                                    dd.field_g.d(0, 0);
                                    v.field_e.d(0, -v.field_e.field_b + (480 - pi.field_f.field_b));
                                    pi.field_f.d(0, -pi.field_f.field_b + 480);
                                    break L1;
                                  } else {
                                    if (-11 != (this.field_d ^ -1)) {
                                      if (9 == this.field_d) {
                                        of.field_e[4].c(0, 0);
                                        break L1;
                                      } else {
                                        if (-12 == (this.field_d ^ -1)) {
                                          oo.e(0, 0, 640, 480, 65793);
                                          break L1;
                                        } else {
                                          if (this.field_d != 12) {
                                            break L1;
                                          } else {
                                            oo.e(0, 0, 640, 480, 65793);
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      dd.field_g.d(0, 0);
                                      v.field_e.d(0, -v.field_e.field_b + (-pi.field_f.field_b + 480));
                                      pi.field_f.d(0, -pi.field_f.field_b + 480);
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  dd.field_g.d(0, 0);
                  v.field_e.d(0, -v.field_e.field_b + -pi.field_f.field_b + 480);
                  pi.field_f.d(0, 480 + -pi.field_f.field_b);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            of.field_e[0].c(0, 0);
            break L1;
          } else {
            of.field_e[0].c(0, 0);
            break L1;
          }
        }
    }

    final void d(int param0) {
        if (null != ao.field_b[this.field_d]) {
            ao.field_b[this.field_d].g(0, (this.field_d ^ -1) == -16 ? 6 : 13);
        }
        if (param0 != 4) {
            this.field_f = false;
        }
    }

    void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var14;
        int[] var15;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = this.field_j[param2];
          var6 = var4;
          if ((var6 ^ -1) == -41) {
            if (this.field_g.c(-85)) {
              df.field_I = false;
              if (!wc.j(127)) {
                var6 = param1 ? 1 : 0;
                bm.a(var6 != 0, -4, 126, sp.field_g);
                break L0;
              } else {
                rj.a(-4, (byte) -37, af.field_a);
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            if (41 != var6) {
              if ((var6 ^ -1) != -47) {
                if (-46 == (var6 ^ -1)) {
                  if (this.field_g.c(-85)) {
                    this.b((byte) 69);
                    tg.a((byte) 25, false);
                    var6 = param1 ? 1 : 0;
                    bm.a(var6 != 0, -7, 125, sp.field_g);
                    vd.field_d = this.field_d;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (var6 != 1) {
                    if (5 == var6) {
                      if (!this.field_g.c(-85)) {
                        break L0;
                      } else {
                        var6 = param1 ? 1 : 0;
                        bm.a(var6 != 0, 1, 126, sp.field_g);
                        break L0;
                      }
                    } else {
                      if (var6 != 16) {
                        if ((var6 ^ -1) == -15) {
                          if (!this.field_g.c(-85)) {
                            break L0;
                          } else {
                            var6 = param1 ? 1 : 0;
                            bm.a(var6 != 0, 5, 127, sp.field_g);
                            vd.field_d = this.field_d;
                            break L0;
                          }
                        } else {
                          if (var6 != 44) {
                            if (3 == var6) {
                              if (this.field_g.c(-85)) {
                                ((ol) ((Object) mj.field_Hb[4])).e(113);
                                var6 = param1 ? 1 : 0;
                                bm.a(var6 != 0, 4, 125, sp.field_g);
                                vd.field_d = this.field_d;
                                break L0;
                              } else {
                                break L0;
                              }
                            } else {
                              if (6 == var6) {
                                if (!this.field_g.c(-85)) {
                                  break L0;
                                } else {
                                  var6 = vd.field_d;
                                  var7 = param1 ? 1 : 0;
                                  bm.a(var7 != 0, var6, 126, sp.field_g);
                                  break L0;
                                }
                              } else {
                                if (2 == var6) {
                                  if (!this.field_g.c(-85)) {
                                    break L0;
                                  } else {
                                    var6 = param1 ? 1 : 0;
                                    bm.a(var6 != 0, 3, 126, sp.field_g);
                                    break L0;
                                  }
                                } else {
                                  if (12 == var6) {
                                    L1: {
                                      var5 = db.field_c;
                                      if (!this.field_g.g(8)) {
                                        break L1;
                                      } else {
                                        tj.a(3273, 0);
                                        break L1;
                                      }
                                    }
                                    L2: {
                                      if (this.field_g.f(-23954)) {
                                        tj.a(3273, 224);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                    L3: {
                                      if (this.field_g.b(false)) {
                                        var6 = ok.field_l + 137;
                                        var7 = 8 + (-var6 + this.a((byte) -118, param2) - -this.d(-110, param2) >> -238944543) - -ok.field_l;
                                        var8 = -var7 + bd.field_g << -466855071;
                                        var8 = var8 * 224 >> 957894024;
                                        if (0 >= var8) {
                                          tj.a(3273, 0);
                                          break L3;
                                        } else {
                                          if (-225 >= (var8 ^ -1)) {
                                            tj.a(3273, 224);
                                            break L3;
                                          } else {
                                            tj.a(3273, var8);
                                            break L3;
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                    L4: {
                                      if (!this.field_g.e(96)) {
                                        break L4;
                                      } else {
                                        if (db.field_c > 28) {
                                          L5: {
                                            var6 = db.field_c % 28;
                                            if (var6 != 0) {
                                              break L5;
                                            } else {
                                              var6 = 28;
                                              break L5;
                                            }
                                          }
                                          tj.a(3273, -var6 + db.field_c);
                                          break L4;
                                        } else {
                                          tj.a(3273, 0);
                                          break L4;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (this.field_g.a(97)) {
                                        if (-197 < (db.field_c ^ -1)) {
                                          var6 = db.field_c % 28;
                                          tj.a(3273, -var6 + (db.field_c - -28));
                                          break L6;
                                        } else {
                                          tj.a(3273, 224);
                                          break L6;
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                    if (var5 == db.field_c) {
                                      break L0;
                                    } else {
                                      L7: {
                                        if (jq.field_d == null) {
                                          break L7;
                                        } else {
                                          if (!jq.field_d.k()) {
                                            break L0;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      jq.field_d = nm.b(-128, 47);
                                      break L0;
                                    }
                                  } else {
                                    if (-14 == (var6 ^ -1)) {
                                      L8: {
                                        if (this.field_g.g(127)) {
                                          ff.a(0, -127);
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        if (this.field_g.f(-23954)) {
                                          ff.a(200, 92);
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (this.field_g.b(false)) {
                                          var6 = 137 + ok.field_l;
                                          var7 = 8 + (this.a((byte) -118, param2) + this.d(-93, param2) - var6 >> -1385877951) + ok.field_l;
                                          var8 = bd.field_g + -var7 << 71088705;
                                          var8 = var8 * 200 >> 739838728;
                                          if (var8 <= 0) {
                                            ff.a(0, 61);
                                            break L10;
                                          } else {
                                            if (200 <= var8) {
                                              ff.a(200, 24);
                                              break L10;
                                            } else {
                                              ff.a(var8, 81);
                                              break L10;
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (this.field_g.e(96)) {
                                          var6 = uk.field_S;
                                          if (-26 <= (var6 ^ -1)) {
                                            ff.a(0, -88);
                                            break L11;
                                          } else {
                                            L12: {
                                              var7 = var6 % 25;
                                              if (-1 != (var7 ^ -1)) {
                                                break L12;
                                              } else {
                                                var7 = 25;
                                                break L12;
                                              }
                                            }
                                            ff.a(var6 + -var7, -103);
                                            break L11;
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                      if (!this.field_g.a(97)) {
                                        break L0;
                                      } else {
                                        var6 = uk.field_S;
                                        if ((var6 ^ -1) <= -176) {
                                          ff.a(200, -118);
                                          break L0;
                                        } else {
                                          var7 = var6 % 25;
                                          ff.a(-var7 + var6 + 25, -89);
                                          break L0;
                                        }
                                      }
                                    } else {
                                      if (-5 == (var6 ^ -1)) {
                                        if (this.field_g.c(-85)) {
                                          if (rn.field_f != null) {
                                            rn.a(-69);
                                            break L0;
                                          } else {
                                            var6 = param1 ? 1 : 0;
                                            bd.field_f = false;
                                            lp.a((byte) -60, var6 != 0);
                                            break L0;
                                          }
                                        } else {
                                          break L0;
                                        }
                                      } else {
                                        if (var6 != 7) {
                                          if ((var6 ^ -1) != -49) {
                                            if (49 == var6) {
                                              if (this.field_g.c(-85)) {
                                                mj.field_Hb[pl.field_I].field_j[param2] = 48;
                                                sd.field_F = 1;
                                                break L0;
                                              } else {
                                                break L0;
                                              }
                                            } else {
                                              if (var6 != 15) {
                                                if (-18 != (var6 ^ -1)) {
                                                  if (var6 == 18) {
                                                    if (!this.field_g.c(-85)) {
                                                      break L0;
                                                    } else {
                                                      if (!this.c(param2, 16777215)) {
                                                        break L0;
                                                      } else {
                                                        ((ol) ((Object) mj.field_Hb[4])).b(1, param1);
                                                        break L0;
                                                      }
                                                    }
                                                  } else {
                                                    if (11 == var6) {
                                                      if (!this.field_g.c(-85)) {
                                                        break L0;
                                                      } else {
                                                        L13: {
                                                          if (rn.field_f == null) {
                                                            break L13;
                                                          } else {
                                                            rn.a(-128);
                                                            break L13;
                                                          }
                                                        }
                                                        cq.a(jl.b(0), false);
                                                        break L0;
                                                      }
                                                    } else {
                                                      if (var6 == 50) {
                                                        L14: {
                                                          if (!this.field_g.a((byte) -106)) {
                                                            break L14;
                                                          } else {
                                                            ll.field_k.field_k = ll.field_k.field_k - 1;
                                                            break L14;
                                                          }
                                                        }
                                                        L15: {
                                                          if (!this.field_g.b((byte) -66)) {
                                                            break L15;
                                                          } else {
                                                            ll.field_k.field_k = ll.field_k.field_k + 1;
                                                            break L15;
                                                          }
                                                        }
                                                        L16: {
                                                          if (0 > ll.field_k.field_k) {
                                                            ll.field_k.field_k = 2;
                                                            break L16;
                                                          } else {
                                                            break L16;
                                                          }
                                                        }
                                                        if (2 < ll.field_k.field_k) {
                                                          ll.field_k.field_k = 0;
                                                          break L0;
                                                        } else {
                                                          break L0;
                                                        }
                                                      } else {
                                                        if (-35 == (var6 ^ -1)) {
                                                          if (this.field_g.c(-85)) {
                                                            oq.c((byte) 127);
                                                            we.field_g[34] = df.a(-128);
                                                            ll.field_k.field_i = ll.field_k.field_i ^ 2;
                                                            th.b((byte) -61);
                                                            break L0;
                                                          } else {
                                                            break L0;
                                                          }
                                                        } else {
                                                          if (var6 == 47) {
                                                            if (this.field_g.c(-85)) {
                                                              ll.field_k.e(-110);
                                                              th.b((byte) -61);
                                                              break L0;
                                                            } else {
                                                              break L0;
                                                            }
                                                          } else {
                                                            L17: {
                                                              if (35 == var6) {
                                                                break L17;
                                                              } else {
                                                                if (var6 != 36) {
                                                                  if (var6 != 38) {
                                                                    if ((var6 ^ -1) == -40) {
                                                                      break L0;
                                                                    } else {
                                                                      break L0;
                                                                    }
                                                                  } else {
                                                                    break L17;
                                                                  }
                                                                } else {
                                                                  break L17;
                                                                }
                                                              }
                                                            }
                                                            if (!this.field_g.c(-85)) {
                                                              break L0;
                                                            } else {
                                                              this.b((byte) 69);
                                                              this.a(param1, 200);
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (!this.field_g.c(-85)) {
                                                    break L0;
                                                  } else {
                                                    if (!this.c(param2, 16777215)) {
                                                      break L0;
                                                    } else {
                                                      ((ol) ((Object) mj.field_Hb[4])).a(param1, (byte) -119);
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (this.field_g.c(-85)) {
                                                  L18: {
                                                    if (this.field_d == 5) {
                                                      break L18;
                                                    } else {
                                                      if (-4 != (this.field_d ^ -1)) {
                                                        if (this.field_d != 7) {
                                                          break L0;
                                                        } else {
                                                          rj.a(6, (byte) 125, af.field_a);
                                                          break L0;
                                                        }
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  rj.a(this.field_d, (byte) 101, af.field_a);
                                                  break L0;
                                                } else {
                                                  break L0;
                                                }
                                              }
                                            }
                                          } else {
                                            if (!this.field_g.c(-85)) {
                                              break L0;
                                            } else {
                                              mj.field_Hb[pl.field_I].field_j[param2] = 49;
                                              sd.field_F = 0;
                                              break L0;
                                            }
                                          }
                                        } else {
                                          if (this.field_g.c(-85)) {
                                            L19: {
                                              if (2 == this.field_d) {
                                                break L19;
                                              } else {
                                                break L19;
                                              }
                                            }
                                            this.a(param1, 200);
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.field_g.c(-85)) {
                              mj.field_Hb[15].a(0, param1, 0);
                              var6 = param1 ? 1 : 0;
                              bm.a(var6 != 0, 15, 126, sp.field_g);
                              vd.field_d = this.field_d;
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        }
                      } else {
                        if (this.field_g.c(-85)) {
                          var6 = 1;
                          var7 = var6;
                          var8 = param1 ? 1 : 0;
                          bm.a(var8 != 0, var7, 126, sp.field_g);
                          var14 = k.field_n;
                          var8 = 0;
                          L20: while (true) {
                            if (var8 >= 8) {
                              var15 = fc.field_m;
                              var8 = 0;
                              L21: while (true) {
                                if ((var8 ^ -1) <= -9) {
                                  break L0;
                                } else {
                                  var15[var8] = 0;
                                  var8++;
                                  continue L21;
                                }
                              }
                            } else {
                              var14[var8] = 0;
                              var8++;
                              continue L20;
                            }
                          }
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (!this.field_g.c(-85)) {
                      break L0;
                    } else {
                      var6 = param1 ? 1 : 0;
                      bm.a(var6 != 0, -7, 127, sp.field_g);
                      vd.field_d = 1;
                      break L0;
                    }
                  }
                }
              } else {
                if (this.field_g.c(-85)) {
                  tg.a((byte) 27, true);
                  var6 = param1 ? 1 : 0;
                  bm.a(var6 != 0, -7, 127, sp.field_g);
                  vd.field_d = this.field_d;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              if (this.field_g.c(-85)) {
                var6 = param1 ? 1 : 0;
                bm.a(var6 != 0, 14, 127, sp.field_g);
                vd.field_d = this.field_d;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L22: {
          if (param0 < -64) {
            break L22;
          } else {
            this.a(-94);
            break L22;
          }
        }
    }

    private final void b(int param0, int param1) {
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            this.field_a = 104;
            break L0;
          }
        }
        if (-1 < (param1 ^ -1)) {
          return;
        } else {
          if (this.field_j.length <= param1) {
            return;
          } else {
            L1: {
              param1 = this.field_j[param1];
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                L2: {
                  if (12 == param1) {
                    break L2;
                  } else {
                    if ((param1 ^ -1) == -14) {
                      break L2;
                    } else {
                      if (this.field_g.c(-85)) {
                        ib.a((byte) 112, ei.field_a[68]);
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                break L1;
              }
            }
            return;
          }
        }
    }

    int d(int param0, int param1) {
        if (param0 > -65) {
            ug var4 = (ug) null;
            nc.a(true, -108, -32, (ug) null);
        }
        if (!this.field_f) {
            return this.a((byte) -118, param1) + this.field_k;
        }
        return this.field_a;
    }

    final static void a(int param0, boolean param1) {
        tm.a(param1, false);
        br.a(param1, 2);
        int var2 = 31 % ((param0 - -57) / 56);
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_j.length) {
            L1: {
              if (param0 == -6003) {
                break L1;
              } else {
                this.a(13);
                break L1;
              }
            }
            return -1;
          } else {
            var5 = this.a(var4, 23697);
            if (this.c(var4, 16777215)) {
              if (this.a((byte) -118, var4) <= param2) {
                if (this.d(param0 ^ 5912, var4) > param2) {
                  if (var5 <= param1) {
                    if (param1 < var5 - -this.b((byte) 68, var4)) {
                      return var4;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final int b(byte param0, int param1) {
        if ((param1 ^ -1) == (param1 ^ -1)) {
        }
        if (param0 != 68) {
            this.a(-84, -17, true);
        }
        return 38;
    }

    void a(boolean param0) {
        int stackIn_10_0 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (6 != (this.field_d ^ -1)) {
          if (-12 == (this.field_d ^ -1)) {
            return;
          } else {
            L0: {
              if (this.field_d != 7) {
                if (-9 == (this.field_d ^ -1)) {
                  ok.a(true);
                  return;
                } else {
                  if (2 != this.field_d) {
                    break L0;
                  } else {
                    L1: {
                      wp.field_h.b(true, 1);
                      oo.f(0, 0, 640, 480);
                      if (param0) {
                        stackIn_10_0 = 0;
                        break L1;
                      } else {
                        stackIn_10_0 = 1;
                        break L1;
                      }
                    }
                    nn.a(stackIn_10_0 != 0);
                    break L0;
                  }
                }
              } else {
                nn.a(false);
                var2 = 100 - -ah.field_e.field_C;
                var3 = 4 + ah.field_e.field_r + ah.field_e.field_J;
                var4 = 16777215;
                pb.field_e.b(af.field_a, 320, var2, var4, -1);
                pb.field_e.b(jm.a(vh.field_Mb, false, 118, gg.field_k), 320, var3 + var2, var4, -1);
                pb.field_e.b(on.a(true, gg.field_k, vh.field_Mb, false), 320, var2 + (3 * var3 - -38), var4, -1);
                pb.field_e.b(op.a(vh.field_Mb, gg.field_k, 4, false), 320, 76 + (var2 + var3 * 4), var4, -1);
                break L0;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                this.a(-45);
                break L2;
              }
            }
            var6 = 0;
            var2 = var6;
            L3: while (true) {
              if (var6 >= this.field_g.field_c) {
                return;
              } else {
                L4: {
                  if (this.c(var6, 16777215)) {
                    break L4;
                  } else {
                    if (-22 == (this.field_j[var6] ^ -1)) {
                      break L4;
                    } else {
                      var6++;
                      continue L3;
                    }
                  }
                }
                L5: {
                  stackIn_22_0 = this;

                  stackIn_22_1 = var6;

                  if (var6 != this.field_g.field_d) {
                    stackIn_23_0 = this;
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = 0;
                    break L5;
                  } else {
                    stackIn_23_0 = this;
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = 1;
                    break L5;
                  }
                }
                this.a(stackIn_23_1, stackIn_23_2 != 0, (byte) -81);
                var6++;
                continue L3;
              }
            }
          }
        } else {
          wp.field_h.b(true, 1);
          return;
        }
    }

    void c(boolean param0) {
        if (param0) {
            this.field_d = 39;
        }
        if (this.field_f) {
            this.field_g.d(99);
        } else {
            this.field_g.a(0, false);
        }
        if (!(0 <= this.field_g.field_d)) {
            return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        int var6 = 0;
        int var4 = 2 * param1;
        int var5 = param1 < 128 ? 0 : -256 + 2 * param1;
        if (!(!param2)) {
            var6 = var4;
            var4 = var5;
            var5 = var6;
        }
        var6 = this.field_d;
        if (param0 > -104) {
            this.b(81);
        }
        if ((var6 ^ -1) == -3) {
            var6 = -7;
        }
        if (!(-2 != var6)) {
            var6 = 2;
        }
        fn.field_e.a();
        if (!(11 != var6)) {
            var6 = 1;
        }
        if ((var6 ^ -1) != 6) {
            mj.field_Hb[var6].b(0);
        } else {
            wp.field_h.b(true, 1);
            oo.f(0, 0, 640, 480);
            fn.field_e.h();
        }
        dl.field_h.b((byte) 99);
        fn.field_e.a(0, 0, var4, var5);
    }

    void b(byte param0) {
        if (param0 != 69) {
            this.field_k = 57;
        }
    }

    int a(int param0, int param1) {
        if (param1 != 23697) {
            ug var4 = (ug) null;
            nc.a(true, 65, 23, (ug) null);
        }
        if (this.field_f) {
            return this.field_b - -(param0 * this.field_k);
        }
        return this.field_b;
    }

    void a(int param0, boolean param1, int param2) {
        if (!((this.field_g.field_d ^ -1) == param0)) {
            param2 = this.field_g.field_d;
        }
        this.field_g.a(param2, param1, -31458, this.a(param0 + -6003, bo.field_d, bd.field_g));
        if ((this.field_d ^ -1) == -9) {
            fc.a((byte) 124, param1);
        }
    }

    final static void a(boolean param0, int param1, int param2, ug param3) {
        int var4_int = 0;
        Object var5 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (ra.field_m != null) {
                fq.a(param0, 1048576, param3, 124, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var4_int = -64 % ((param2 - 42) / 38);
              if (wd.field_L != null) {
                var5 = rm.field_b;
                synchronized (var5) {
                  L3: {
                    wd.field_L.a(param1, -1, false);
                    if (param3 == bb.field_g) {
                      return;
                    } else {
                      L4: {
                        wd.field_L.g(2);
                        rm.field_b.e();
                        bb.field_g = param3;
                        if (bb.field_g != null) {
                          wd.field_L.a(bb.field_g, param0, 8361407);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      break L3;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("nc.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    void a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        qd stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        qd stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_65_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_g.field_d;
        if ((this.field_d ^ -1) == -12) {
          return;
        } else {
          L0: {
            L1: {
              if (this.field_d == -7) {
                break L1;
              } else {
                if (2 == this.field_d) {
                  break L1;
                } else {
                  if (this.field_d == 8) {
                    L2: {
                      if (cq.a(15000)) {
                        stackIn_8_0 = 0;
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        break L2;
                      }
                    }
                    L3: {
                      var3 = ai.a(stackIn_8_0 != 0, (byte) 110);
                      if (-4 != (var3 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (rn.field_f == null) {
                            break L4;
                          } else {
                            rn.a(-36);
                            break L4;
                          }
                        }
                        uq.a(param0 + 3, jl.b(0));
                        break L3;
                      }
                    }
                    L5: {
                      if ((var3 ^ -1) != -2) {
                        break L5;
                      } else {
                        L6: {
                          if (ec.field_c) {
                            stackIn_16_0 = 15;
                            break L6;
                          } else {
                            stackIn_16_0 = 1;
                            break L6;
                          }
                        }
                        var4 = stackIn_16_0;
                        bm.a(false, var4, param0 ^ 127, sp.field_g);
                        break L5;
                      }
                    }
                    if (-3 != (var3 ^ -1)) {
                      return;
                    } else {
                      L7: {
                        if (!ec.field_c) {
                          stackIn_21_0 = 1;
                          break L7;
                        } else {
                          stackIn_21_0 = 15;
                          break L7;
                        }
                      }
                      var4 = stackIn_21_0;
                      bm.a(true, var4, 126, sp.field_g);
                      return;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
            L8: {
              stackIn_24_0 = wp.field_h;

              stackIn_24_1 = 122;

              if (-3 == (this.field_d ^ -1)) {
                stackIn_25_0 = (qd) ((Object) stackIn_24_0);
                stackIn_25_1 = stackIn_24_1;
                stackIn_25_2 = 0;
                break L8;
              } else {
                stackIn_25_0 = (qd) ((Object) stackIn_24_0);
                stackIn_25_1 = stackIn_24_1;
                stackIn_25_2 = 1;
                break L8;
              }
            }
            ((qd) (Object) stackIn_25_0).a((byte) stackIn_25_1, stackIn_25_2 != 0);
            if (-7 == this.field_d) {
              return;
            } else {
              break L0;
            }
          }
          L9: while (true) {
            if (!ba.c(-1)) {
              L10: {
                var3 = 1;
                if (!am.a(param0 ^ -112)) {
                  break L10;
                } else {
                  if (fb.field_e == null) {
                    break L10;
                  } else {
                    if (!df.field_I) {
                      L11: {
                        if (fb.field_e.a(true, 15978)) {
                          stackIn_65_0 = 0;
                          break L11;
                        } else {
                          stackIn_65_0 = 1;
                          break L11;
                        }
                      }
                      var3 = stackIn_65_0;
                      if (!re.field_b) {
                        break L10;
                      } else {
                        w.a(320, 180, true, 81);
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
              }
              L12: {
                if (param0 != (this.a(-6003, bo.field_d, bd.field_g) ^ -1)) {
                  en.a(-1, 1);
                  break L12;
                } else {
                  en.a(-1, 4);
                  break L12;
                }
              }
              L13: {
                if (var3 == 0) {
                  break L13;
                } else {
                  L14: {
                    this.field_g.a(this.a(-6003, bo.field_d, bd.field_g), 42, this.a(-6003, ka.field_t, vb.field_f));
                    if (this.field_g.field_d == -1) {
                      break L14;
                    } else {
                      this.b(12, this.field_g.field_d);
                      this.b(-74, true, this.field_g.field_d);
                      break L14;
                    }
                  }
                  L15: {
                    if (this.field_g.field_d == var2) {
                      break L15;
                    } else {
                      if (0 != (this.field_g.field_d ^ -1)) {
                        nm.b(-128, 69);
                        break L15;
                      } else {
                        break L13;
                      }
                    }
                  }
                  break L13;
                }
              }
              return;
            } else {
              L16: {
                if (am.a(param0 ^ -118)) {
                  if (!iq.field_f) {
                    if (sj.field_p != 80) {
                      break L16;
                    } else {
                      iq.field_f = true;
                      continue L9;
                    }
                  } else {
                    L17: {
                      L18: {
                        if (!re.field_b) {
                          break L18;
                        } else {
                          if (!hh.field_b) {
                            break L18;
                          } else {
                            if (va.a((byte) -59, 13, 15, 12)) {
                              continue L9;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      if (w.a(13, 15, 12, 18663)) {
                        continue L9;
                      } else {
                        break L17;
                      }
                    }
                    L19: {
                      if (13 == sj.field_p) {
                        break L19;
                      } else {
                        if (sj.field_p == 80) {
                          break L19;
                        } else {
                          continue L9;
                        }
                      }
                    }
                    iq.field_f = false;
                    continue L9;
                  }
                } else {
                  break L16;
                }
              }
              if ((sj.field_p ^ -1) == -14) {
                if (this.field_d == 2) {
                  bm.a(false, -7, param0 ^ 126, sp.field_g);
                  vd.field_d = 1;
                  continue L9;
                } else {
                  if (-11 != (this.field_d ^ -1)) {
                    if ((this.field_d ^ -1) != -8) {
                      if ((this.field_d ^ -1) != -2) {
                        if (this.field_d != 15) {
                          var3 = vd.field_d;
                          bm.a(false, var3, param0 + 125, sp.field_g);
                          continue L9;
                        } else {
                          bm.a(false, 1, param0 ^ 125, sp.field_g);
                          continue L9;
                        }
                      } else {
                        continue L9;
                      }
                    } else {
                      continue L9;
                    }
                  } else {
                    continue L9;
                  }
                }
              } else {
                this.c(false);
                if (-1 == this.field_g.field_d) {
                  continue L9;
                } else {
                  this.b(param0 + 12, this.field_g.field_d);
                  this.b(-96, false, this.field_g.field_d);
                  continue L9;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, boolean param1, byte param2) {
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12_ref_String;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        String var18;
        var17 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.a(param0, 23697);
        var5 = this.a((byte) -118, param0);
        var6 = this.field_j[param0];
        if (var6 == 22) {
          return;
        } else {
          L0: {
            if ((var6 ^ -1) == -24) {
              break L0;
            } else {
              if (-25 == (var6 ^ -1)) {
                break L0;
              } else {
                if (-26 == (var6 ^ -1)) {
                  break L0;
                } else {
                  if ((var6 ^ -1) == -28) {
                    break L0;
                  } else {
                    if (var6 == 28) {
                      break L0;
                    } else {
                      if (var6 == 29) {
                        break L0;
                      } else {
                        if (var6 == 30) {
                          break L0;
                        } else {
                          if (var6 == 31) {
                            break L0;
                          } else {
                            if (32 == var6) {
                              break L0;
                            } else {
                              if (-34 == (var6 ^ -1)) {
                                break L0;
                              } else {
                                if (-27 == (var6 ^ -1)) {
                                  break L0;
                                } else {
                                  L1: {
                                    var18 = we.field_g[var6];
                                    var7 = var18;
                                    var12_ref_String = var7;
                                    var7 = var18;
                                    var7 = var18;
                                    var8 = -var5 + this.d(-69, param0);
                                    var9 = this.b((byte) 68, param0);
                                    if (param1) {
                                      stackIn_17_0 = 1;
                                      break L1;
                                    } else {
                                      stackIn_17_0 = 10;
                                      break L1;
                                    }
                                  }
                                  L2: {
                                    var10 = stackIn_17_0;
                                    if (4 != var6) {
                                      break L2;
                                    } else {
                                      if (rn.field_f != null) {
                                        break L2;
                                      } else {
                                        L3: {
                                          if (0 >= vl.field_h) {
                                            break L3;
                                          } else {
                                            if (pn.a(-9, pl.field_J)) {
                                              break L2;
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                        L4: {
                                          if (param1) {
                                            stackIn_25_0 = 7;
                                            break L4;
                                          } else {
                                            stackIn_25_0 = 6;
                                            break L4;
                                          }
                                        }
                                        var10 = stackIn_25_0;
                                        break L2;
                                      }
                                    }
                                  }
                                  L5: {
                                    if (-41 != (var6 ^ -1)) {
                                      break L5;
                                    } else {
                                      if (!wc.j(127)) {
                                        break L5;
                                      } else {
                                        L6: {
                                          if (!param1) {
                                            stackIn_31_0 = 6;
                                            break L6;
                                          } else {
                                            stackIn_31_0 = 7;
                                            break L6;
                                          }
                                        }
                                        var10 = stackIn_31_0;
                                        break L5;
                                      }
                                    }
                                  }
                                  L7: {
                                    if (null != fb.field_e) {
                                      stackIn_35_0 = fb.field_e.g(-127);
                                      break L7;
                                    } else {
                                      stackIn_35_0 = 0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    var11 = stackIn_35_0;
                                    if (var7 != null) {
                                      if (var6 == 20) {
                                        var7 = vl.a(var18, new String[]{Integer.toString(var11)}, 2);
                                        var12_ref_String = var7;
                                        var12_ref_String = var7;
                                        break L8;
                                      } else {
                                        if (var6 == 21) {
                                          var7 = vl.a(var18, new String[]{Integer.toString(var11)}, 2);
                                          if (-1 != (var11 ^ -1)) {
                                            break L8;
                                          } else {
                                            var10 = 6;
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    } else {
                                      var7 = "ERROR: missing text";
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if ((var6 ^ -1) == -51) {
                                      L10: {
                                        if ((ll.field_k.field_k ^ -1) != -2) {
                                          if (-1 == (ll.field_k.field_k ^ -1)) {
                                            var12_ref_String = jm.field_l;
                                            break L10;
                                          } else {
                                            var12_ref_String = jp.field_a;
                                            break L10;
                                          }
                                        } else {
                                          var12_ref_String = da.field_f;
                                          break L10;
                                        }
                                      }
                                      var7 = var7 + var12_ref_String;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L11: {
                                    if (param2 <= -32) {
                                      break L11;
                                    } else {
                                      this.field_f = false;
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    L13: {
                                      var12 = -ah.field_e.field_r + (-ZombieDawnMulti.field_I[0].field_u + var9) + (-ZombieDawnMulti.field_I[6].field_u + -ah.field_e.field_C);
                                      if (-13 == (var6 ^ -1)) {
                                        break L13;
                                      } else {
                                        if (13 == var6) {
                                          break L13;
                                        } else {
                                          ah.field_e.b(var7, var5 + (var8 >> -160418751), ZombieDawnMulti.field_I[0].field_u + var4 - -ah.field_e.field_C + (var12 >> -1038888159), var10, 0);
                                          break L12;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (-13 != (var6 ^ -1)) {
                                        stackIn_59_0 = 200;
                                        break L14;
                                      } else {
                                        stackIn_59_0 = 224;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      var13 = stackIn_59_0;
                                      var14 = 137 + ok.field_l;
                                      var15 = var5 - -(-var14 + var8 >> 903453857);
                                      ah.field_e.c(var7, var15, (var12 >> 1755571617) + ah.field_e.field_C + var4 + ZombieDawnMulti.field_I[0].field_u, var10, 0);
                                      var15 = var15 + (8 + ok.field_l);
                                      oo.a(var15, var9 / 2 + var4 - 1, 129, 2, var10);
                                      if (12 != var6) {
                                        stackIn_62_0 = uk.field_S;
                                        break L15;
                                      } else {
                                        stackIn_62_0 = db.field_c;
                                        break L15;
                                      }
                                    }
                                    var16 = stackIn_62_0;
                                    var16 = (var16 << -1915660504) / var13;
                                    lm.field_eb.g((var16 >> 2027224065) + (var15 + -1), var4);
                                    break L12;
                                  }
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    nc(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            this.field_k = param5;
            this.field_d = param0;
            this.field_a = param3;
            this.field_j = param6;
            this.field_f = param1 ? true : false;
            this.field_b = param4;
            this.field_i = param2;
            this.field_g = new hh(this.field_j.length);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "nc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Send private message";
    }
}
