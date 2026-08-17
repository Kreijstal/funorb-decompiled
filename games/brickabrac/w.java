/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    private int field_h;
    private tp[] field_q;
    private jp field_p;
    static jp field_r;
    private int field_b;
    private String field_f;
    private boolean field_a;
    private String[] field_d;
    static int field_k;
    static String field_m;
    private jp field_e;
    static int[] field_n;
    private int field_c;
    private int field_j;
    private re field_g;
    private int field_o;
    private int field_i;
    private jp field_l;

    final int a(boolean param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              this.field_o = this.field_o + 65536;
              L1: while (true) {
                if ((dm.a(fo.field_c, -1, this.field_o) ^ -1) > -65537) {
                  L2: {
                    var3_int = -1;
                    if (null != this.field_q) {
                      var3_int = this.field_q.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if ((var3_int ^ -1) == 0) {
                      break L3;
                    } else {
                      L4: {
                        if (fo.field_f > this.field_j) {
                          L5: {
                            this.field_j = this.field_j + 1;
                            if (fo.field_n >= this.field_j) {
                              break L5;
                            } else {
                              L6: {
                                if (null == this.field_q) {
                                  break L6;
                                } else {
                                  if (this.field_q[this.field_h] != null) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              this.field_j = this.field_j - 1;
                              break L4;
                            }
                          }
                          if (fo.field_f > this.field_j) {
                            break L4;
                          } else {
                            if (null != this.field_q[(this.field_h + 1) % var3_int]) {
                              break L4;
                            } else {
                              this.field_j = this.field_j - 1;
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      L7: {
                        if (fo.field_f > this.field_j) {
                          break L7;
                        } else {
                          this.field_b = this.field_h;
                          this.field_j = this.field_j - fo.field_f;
                          if (!this.field_a) {
                            this.field_h = this.field_h - 1;
                            if (-1 < (this.field_h ^ -1)) {
                              this.field_h = this.field_h + var3_int;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            this.field_h = this.field_h + 1;
                            if (var3_int > this.field_h) {
                              break L7;
                            } else {
                              this.field_h = this.field_h - var3_int;
                              break L7;
                            }
                          }
                        }
                      }
                      if (fo.field_n < this.field_j) {
                        this.field_a = true;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if (ll.field_c != null) {
                      L9: {
                        var4 = 0;
                        if (ki.field_e == 0) {
                          break L9;
                        } else {
                          if ((qo.field_O ^ -1) >= -258) {
                            break L9;
                          } else {
                            if (290 > qo.field_O) {
                              L10: {
                                if (-10 <= (tb.field_fb ^ -1)) {
                                  break L10;
                                } else {
                                  if (-83 < (tb.field_fb ^ -1)) {
                                    this.field_a = false;
                                    this.field_j = fo.field_f;
                                    var4 = 1;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if ((tb.field_fb ^ -1) >= -559) {
                                break L9;
                              } else {
                                if ((tb.field_fb ^ -1) <= -632) {
                                  break L9;
                                } else {
                                  this.field_j = fo.field_f;
                                  var4 = 1;
                                  this.field_a = true;
                                  break L9;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L8;
                      } else {
                        if (fo.field_n >= this.field_j) {
                          break L8;
                        } else {
                          if ((qo.field_O ^ -1) >= -258) {
                            break L8;
                          } else {
                            if (qo.field_O >= 290) {
                              break L8;
                            } else {
                              L11: {
                                if (-10 <= (pq.field_k ^ -1)) {
                                  break L11;
                                } else {
                                  if (-83 < (pq.field_k ^ -1)) {
                                    this.field_j = fo.field_n;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (-559 <= (pq.field_k ^ -1)) {
                                break L8;
                              } else {
                                if ((pq.field_k ^ -1) <= -632) {
                                  break L8;
                                } else {
                                  this.field_j = fo.field_n;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (!param1) {
                    stackIn_89_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L12: {
                      this.field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                      var4 = 0;
                      if (this.field_g.a((byte) 113)) {
                        L13: {
                          if (this.field_g.field_j == 0) {
                            var4 = 1;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        if (-2 != (this.field_g.field_j ^ -1)) {
                          break L12;
                        } else {
                          stackIn_75_0 = 2;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        break L12;
                      }
                    }
                    L14: {
                      if (ea.field_a) {
                        L15: while (true) {
                          if (!jl.a((byte) 5)) {
                            break L14;
                          } else {
                            var5 = this.a((byte) -120);
                            if (-1 == (var5 ^ -1)) {
                              continue L15;
                            } else {
                              stackIn_82_0 = var5;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    if (var4 != 0) {
                      this.b((byte) 9);
                      stackIn_87_0 = 3;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return 0;
                    }
                  }
                } else {
                  this.field_i = this.field_i + 1;
                  this.field_o = this.field_o - fo.field_c;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -9;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "w.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_75_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_82_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_87_0;
              } else {
                return stackIn_89_0;
              }
            }
          }
        }
    }

    private final void a(boolean param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tp var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        tp var6 = null;
        tp var7 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (this.field_q == null) {
              L1: {
                if (null == ch.field_c) {
                  break L1;
                } else {
                  ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var6 = this.field_q[this.field_h];
                var2 = var6;
                if (var2 == null) {
                  if (null == ch.field_c) {
                    break L2;
                  } else {
                    ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                    break L2;
                  }
                } else {
                  var6.a(9, 58);
                  break L2;
                }
              }
              L3: {
                if (this.field_j < fo.field_n) {
                  var7 = this.field_q[this.field_b];
                  var2 = var7;
                  if (var2 != null) {
                    var3 = (60 + var7.field_f) * this.field_j / fo.field_n;
                    var4 = var3 - 30;
                    if (this.field_a) {
                      ml.a(-256 * var4 / 30, var2, (byte) 101, 58, 9, (-var4 + var7.field_f) * 256 / 30);
                      break L3;
                    } else {
                      ml.a(256 * (-var4 + var7.field_f) / 30, var7, (byte) 106, 58, 9, -256 * var4 / 30);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (param0) {
                  break L4;
                } else {
                  field_k = -125;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "w.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        jp var5 = null;
        String var6 = null;
        String var7 = null;
        int[] var16 = null;
        int[] var17 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_l != null) {
                break L1;
              } else {
                if (null == co.field_j) {
                  break L1;
                } else {
                  this.field_l = new jp(622, 47);
                  fc.a(-49, this.field_l);
                  lb.g(0, 0, 622, 47, 4540749, 65793);
                  var2_int = 16448250;
                  var3 = 10068666;
                  var16 = lk.a(param0 + -580, var2_int, var3);
                  this.a(47, 0, this.field_f, var16, co.field_j, 622, 0, 0);
                  sc.b(param0 + -592);
                  this.field_e = new jp(param0, 24);
                  this.a(co.field_j, -4, 0.75f, (byte) 124, 475, va.field_c, var16, 24, this.field_e, 0);
                  var17 = lk.a(-124, 526344, 526344);
                  var5 = new jp(121, 122);
                  fc.a(param0 ^ -388, var5);
                  lb.g(0, 0, var5.field_D, var5.field_C / 2, 16180917, 16306250);
                  lb.g(0, var5.field_C / 2, var5.field_D, var5.field_C, 16306250, 15568919);
                  var6 = tl.field_a;
                  var7 = ko.field_q;
                  this.a(co.field_j, -16, 0.5f, (byte) 118, var5.field_D, var6, var17, var5.field_C, var5, 0);
                  this.a(co.field_j, 20, 0.5f, (byte) 105, var5.field_D, var7, var17, var5.field_C, var5, 0);
                  this.a(co.field_j, -co.field_j.field_F + (var5.field_C / 2 + 12), 0.699999988079071f, (byte) 62, var5.field_D, uo.field_e[this.field_c], var17, var5.field_C / 3, var5, 0);
                  sc.b(-119);
                  this.field_p = new jp(121, 122);
                  fc.a(-115, this.field_p);
                  var5.e(this.field_p.field_D / 2, this.field_p.field_C / 2, -2048, 4096);
                  sc.b(-108);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "w.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            lb.g(9, 9, 622, 47, 4540749, 65793);
            lb.g(9, 257, 622, 33, 2585);
            lb.g(9, 265, 622, 11, 2585, 1515566);
            var2_int = 0;
            var3 = 14;
            L1: while (true) {
              if (4 <= var2_int) {
                L2: {
                  if (param0 <= -6) {
                    break L2;
                  } else {
                    this.a(111);
                    break L2;
                  }
                }
                var2_int = 0;
                var3 = 299;
                L3: while (true) {
                  if (2 <= var2_int) {
                    L4: {
                      this.a(true);
                      if (jg.field_d == null) {
                        break L4;
                      } else {
                        if (!jg.field_d.a((byte) -127)) {
                          break L4;
                        } else {
                          if (!jg.field_d.a("members_expansion_screen", -28138)) {
                            break L4;
                          } else {
                            if (!jg.field_d.a("arialish12", -28138)) {
                              break L4;
                            } else {
                              if (!jg.field_d.a("pump32", -28138)) {
                                break L4;
                              } else {
                                if (fe.field_jb == null) {
                                  break L4;
                                } else {
                                  if (!fe.field_jb.a((byte) -127)) {
                                    break L4;
                                  } else {
                                    if (!fe.field_jb.a("arialish12", -28138)) {
                                      break L4;
                                    } else {
                                      if (fe.field_jb.a("pump32", -28138)) {
                                        bl.field_J = uo.a((byte) 29, jg.field_d, "frame", "members_expansion_screen");
                                        ll.field_c = pl.a("members_expansion_screen", "arrow", (byte) 111, jg.field_d);
                                        ch.field_c = nq.a((byte) -37, "arialish12", jg.field_d, fe.field_jb, "");
                                        co.field_j = si.a((byte) -107, "pump32", "", jg.field_d, fe.field_jb);
                                        rp.field_u = um.a("members_expansion_screen", "benefit_orbs", 1593955777, jg.field_d);
                                        nc.field_e = um.a("members_expansion_screen", "button_text", 1593955777, jg.field_d);
                                        sf.field_V = bd.a("members_expansion_screen", "button_highlights", jg.field_d, (byte) -8);
                                        fe.field_jb = null;
                                        jg.field_d = null;
                                        break L4;
                                      } else {
                                        break L4;
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
                    this.a(475);
                    if (null != bl.field_J) {
                      L5: {
                        this.field_p.c(376, 339);
                        this.field_l.c(9, 9);
                        bl.field_J.a(0, 0);
                        if (null != ll.field_c) {
                          ll.field_c.c(9, 257);
                          ll.field_c.f(558, 257);
                          if ((po.field_a ^ -1) >= -258) {
                            break L5;
                          } else {
                            if (-291 < (po.field_a ^ -1)) {
                              var2_int = 40 - -(di.a((byte) 124, this.field_i << 790494148) * 40 >> -314792144);
                              if (0 >= var2_int) {
                                break L5;
                              } else {
                                L6: {
                                  if (9 >= pq.field_k) {
                                    break L6;
                                  } else {
                                    if (pq.field_k >= 82) {
                                      break L6;
                                    } else {
                                      ll.field_c.f(8, 256, var2_int);
                                      ll.field_c.f(10, 256, var2_int);
                                      ll.field_c.f(8, 258, var2_int);
                                      ll.field_c.f(10, 258, var2_int);
                                      break L5;
                                    }
                                  }
                                }
                                if (558 >= pq.field_k) {
                                  break L5;
                                } else {
                                  if (pq.field_k < 631) {
                                    ll.field_c.a();
                                    ll.field_c.f(557, 256, var2_int);
                                    ll.field_c.f(559, 256, var2_int);
                                    ll.field_c.f(557, 258, var2_int);
                                    ll.field_c.f(559, 258, var2_int);
                                    ll.field_c.a();
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      L7: {
                        this.field_e.c(16, 302);
                        ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                        rp.field_u.c(30, 330);
                        ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                        nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                        if (0 == this.field_g.field_j) {
                          sf.field_V[0].c(508, 299);
                          break L7;
                        } else {
                          if (-2 == (this.field_g.field_j ^ -1)) {
                            sf.field_V[1].c(508, 387);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    lb.g(508, var3, 127, 42, 1130115, 3365268);
                    lb.g(508, 42 + var3, 127, 42, 12410);
                    var3 += 91;
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                lb.g(var3, 331, 117, 90, 460551, 3881787);
                var2_int++;
                var3 += 121;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "w.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        int var2_int = 0;
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            try {
              L1: {
                oo.a(uc.e((byte) -86), 0);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                var2.printStackTrace();
                break L2;
              }
            }
            var2_int = 82 % ((param0 - 72) / 51);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "w.K(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_g.d(-1);
              if (this.field_g.a((byte) 113)) {
                if (this.field_g.field_j != 0) {
                  if ((this.field_g.field_j ^ -1) == -2) {
                    stackIn_10_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  this.b((byte) 125);
                  stackIn_5_0 = 3;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L1;
              }
            }
            var2_int = 83 % ((param0 - -17) / 51);
            if (13 != dc.field_b) {
              stackIn_15_0 = 0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_13_0 = 1;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "w.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    private final void a(dh param0, int param1, float param2, byte param3, int param4, String param5, int[] param6, int param7, jp param8, int param9) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        jp var13 = null;
        try {
          L0: {
            L1: {
              var11_int = (int)((float)param4 / param2);
              if (param3 >= 56) {
                break L1;
              } else {
                this.field_o = -54;
                break L1;
              }
            }
            var12 = (int)((float)param7 / param2);
            var13 = new jp(var11_int, var12);
            fc.a(-116, var13);
            param8.a((int)((float)(-param9) / param2), (int)((float)(-param1) / param2), (int)((float)param8.field_D / param2), (int)((float)param8.field_C / param2));
            this.a(var12, 0, param5, param6, param0, var11_int, 0, 0);
            sc.b(-104);
            fc.a(-126, param8);
            var13.c(param9, param1, param4, param7);
            sc.b(-93);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var11);

            stackIn_7_1 = new StringBuilder().append("w.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_8_0);

            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);

            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);

            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param9 + ')');
        }
    }

    private final void a(String param0, boolean param1, boolean param2, tp[] param3, String[] param4, java.applet.Applet param5) {
        String var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var7 = param5.getParameter("currency");
                if (var7 == null) {
                  break L2;
                } else {
                  if (dc.a((CharSequence) ((Object) var7), -53)) {
                    this.field_c = fl.a((CharSequence) ((Object) var7), -28734);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_c = 2;
              break L1;
            }
            L3: {
              this.field_f = param0;
              this.field_g = new re(2);
              this.field_q = param3;
              this.field_d = param4;
              if (this.field_q == null) {
                break L3;
              } else {
                if (3 > this.field_q.length) {
                  break L3;
                } else {
                  if (!param1) {
                    ea.field_a = param2;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7_ref);

            stackIn_18_1 = new StringBuilder().append("w.G(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {
            stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);

            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          L6: {
            stackIn_26_0 = (RuntimeException) ((Object) stackIn_23_0);

            stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {
            stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);

            stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param5 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param0 >> -1206002808;
              var4 = 255 & param0;
              if (param2 > 90) {
                break L1;
              } else {
                field_k = 6;
                break L1;
              }
            }
            var5 = param1 >> -652453464;
            var6 = 255 & param1;
            stackIn_3_0 = (var4 * var6 >> -2062548824) + (var3_int * param1 + var5 * var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "w.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(byte param0) {
        try {
            field_r = null;
            field_m = null;
            if (param0 < 82) {
                field_r = (jp) null;
            }
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "w.C(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        try {
            fk.field_h = null;
            if (param0 != 3) {
                field_k = -112;
            }
            h.field_F = null;
            ik.field_j = false;
            rg.field_k = null;
            ik.field_b = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "w.N(" + param0 + ')');
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 > 4) {
                break L1;
              } else {
                field_r = (jp) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[-1 + (var2_int + -var4)] = param1.charAt(var4);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("w.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, String param2, int[] param3, dh param4, int param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            jf.d(-99);
            if (param7 == 0) {
              var9_int = param6;
              L1: while (true) {
                if (param0 <= var9_int) {
                  sc.b(-102);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  lb.e(param1, var9_int, param5, 1 + var9_int);
                  var10 = var9_int * param3.length / param0;
                  var11 = param3[param3.length - (var10 + 1)];
                  param4.a(param2, param1, param6, param5, param0, var11, -1, 1, 1, 0);
                  var9_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var9);

            stackIn_12_1 = new StringBuilder().append("w.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_13_0);

            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);

            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (null == bl.field_J) {
              stackIn_4_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-509 < (param2 ^ -1)) {
                  break L1;
                } else {
                  if ((param2 ^ -1) <= -636) {
                    break L1;
                  } else {
                    if (299 > param0) {
                      break L1;
                    } else {
                      if (-387 >= (param0 ^ -1)) {
                        break L1;
                      } else {
                        return 0;
                      }
                    }
                  }
                }
              }
              if (param1 == -636) {
                L2: {
                  if (508 > param2) {
                    break L2;
                  } else {
                    if (-636 >= (param2 ^ -1)) {
                      break L2;
                    } else {
                      if (param0 < 390) {
                        break L2;
                      } else {
                        if (param0 < 475) {
                          stackIn_22_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackIn_24_0 = -1;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_14_0 = -75;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var4), "w.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0;
            } else {
              return stackIn_24_0;
            }
          }
        }
    }

    w(java.applet.Applet param0, String param1, tp[] param2, boolean param3, String[] param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = true;
        this.field_i = 0;
        this.field_o = 0;
        try {
          L0: {
            this.a(param1, false, param3, param2, param4, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("w.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);

            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_15_0);

            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
        field_m = "If you are not, please change your password to something more obscure!";
    }
}
