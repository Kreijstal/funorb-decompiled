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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_132_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_113_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_2_0 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              ((w) this).field_o = ((w) this).field_o + 65536;
              L1: while (true) {
                L2: {
                  if (dm.a(fo.field_c, -1, ((w) this).field_o) < 65536) {
                    break L2;
                  } else {
                    ((w) this).field_i = ((w) this).field_i + 1;
                    ((w) this).field_o = ((w) this).field_o - fo.field_c;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var3_int = -1;
                  if (null != ((w) this).field_q) {
                    var3_int = ((w) this).field_q.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var3_int == -1) {
                    break L4;
                  } else {
                    L5: {
                      if (~fo.field_f < ~((w) this).field_j) {
                        L6: {
                          ((w) this).field_j = ((w) this).field_j + 1;
                          if (~fo.field_n <= ~((w) this).field_j) {
                            break L6;
                          } else {
                            L7: {
                              if (null == ((w) this).field_q) {
                                break L7;
                              } else {
                                if (((w) this).field_q[((w) this).field_h] != null) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            ((w) this).field_j = ((w) this).field_j - 1;
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (fo.field_f > ((w) this).field_j) {
                          break L5;
                        } else {
                          if (null != ((w) this).field_q[(((w) this).field_h + 1) % var3_int]) {
                            break L5;
                          } else {
                            ((w) this).field_j = ((w) this).field_j - 1;
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L8: {
                      if (~fo.field_f < ~((w) this).field_j) {
                        break L8;
                      } else {
                        L9: {
                          ((w) this).field_b = ((w) this).field_h;
                          ((w) this).field_j = ((w) this).field_j - fo.field_f;
                          if (!((w) this).field_a) {
                            break L9;
                          } else {
                            ((w) this).field_h = ((w) this).field_h + 1;
                            if (var3_int > ((w) this).field_h) {
                              break L8;
                            } else {
                              ((w) this).field_h = ((w) this).field_h - var3_int;
                              if (var6 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        ((w) this).field_h = ((w) this).field_h - 1;
                        if (((w) this).field_h < 0) {
                          ((w) this).field_h = ((w) this).field_h + var3_int;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (fo.field_n < ((w) this).field_j) {
                      ((w) this).field_a = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (ll.field_c != null) {
                    L11: {
                      var4 = 0;
                      if (ki.field_e == 0) {
                        break L11;
                      } else {
                        if (qo.field_O <= 257) {
                          break L11;
                        } else {
                          if (290 > qo.field_O) {
                            L12: {
                              if (tb.field_fb <= 9) {
                                break L12;
                              } else {
                                if (tb.field_fb < 82) {
                                  ((w) this).field_a = false;
                                  ((w) this).field_j = fo.field_f;
                                  var4 = 1;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (tb.field_fb <= 558) {
                              break L11;
                            } else {
                              if (tb.field_fb >= 631) {
                                break L11;
                              } else {
                                ((w) this).field_j = fo.field_f;
                                var4 = 1;
                                ((w) this).field_a = true;
                                break L11;
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (~fo.field_n <= ~((w) this).field_j) {
                        break L10;
                      } else {
                        if (qo.field_O <= 257) {
                          break L10;
                        } else {
                          if (qo.field_O >= 290) {
                            break L10;
                          } else {
                            L13: {
                              if (pq.field_k <= 9) {
                                break L13;
                              } else {
                                if (pq.field_k < 82) {
                                  ((w) this).field_j = fo.field_n;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (pq.field_k <= 558) {
                              break L10;
                            } else {
                              if (pq.field_k >= 631) {
                                break L10;
                              } else {
                                ((w) this).field_j = fo.field_n;
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                L14: {
                  if (!param1) {
                    break L14;
                  } else {
                    L15: {
                      ((w) this).field_g.a(this.a(po.field_a, -636, pq.field_k), 27479, this.a(qo.field_O, -636, tb.field_fb));
                      var4 = 0;
                      if (((w) this).field_g.a((byte) 113)) {
                        L16: {
                          if (((w) this).field_g.field_j == 0) {
                            var4 = 1;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (((w) this).field_g.field_j != 1) {
                          break L15;
                        } else {
                          stackOut_113_0 = 2;
                          stackIn_114_0 = stackOut_113_0;
                          return stackIn_114_0;
                        }
                      } else {
                        break L15;
                      }
                    }
                    L17: {
                      L18: {
                        if (ea.field_a) {
                          L19: while (true) {
                            if (!jl.a((byte) 5)) {
                              break L18;
                            } else {
                              var5 = ((w) this).a((byte) -120);
                              stackOut_119_0 = -1;
                              stackIn_127_0 = stackOut_119_0;
                              stackIn_120_0 = stackOut_119_0;
                              if (var6 != 0) {
                                break L17;
                              } else {
                                if (stackIn_120_0 == ~var5) {
                                  if (var6 == 0) {
                                    continue L19;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  stackOut_123_0 = var5;
                                  stackIn_124_0 = stackOut_123_0;
                                  return stackIn_124_0;
                                }
                              }
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      stackOut_126_0 = var4;
                      stackIn_127_0 = stackOut_126_0;
                      break L17;
                    }
                    if (stackIn_127_0 != 0) {
                      this.b((byte) 9);
                      stackOut_129_0 = 3;
                      stackIn_130_0 = stackOut_129_0;
                      return stackIn_130_0;
                    } else {
                      break L14;
                    }
                  }
                }
                stackOut_131_0 = 0;
                stackIn_132_0 = stackOut_131_0;
                break L0;
              }
            } else {
              stackOut_2_0 = -9;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "w.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_132_0;
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        tp var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (((w) this).field_q == null) {
              L1: {
                if (null == ch.field_c) {
                  break L1;
                } else {
                  int discarded$2 = ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                L3: {
                  var2_ref = ((w) this).field_q[((w) this).field_h];
                  if (null != var2_ref) {
                    break L3;
                  } else {
                    if (null == ch.field_c) {
                      break L2;
                    } else {
                      int discarded$3 = ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_ref.a(9, 58);
                break L2;
              }
              L4: {
                if (~((w) this).field_j > ~fo.field_n) {
                  var2_ref = ((w) this).field_q[((w) this).field_b];
                  if (null != var2_ref) {
                    L5: {
                      var3 = (60 + var2_ref.field_f) * ((w) this).field_j / fo.field_n;
                      var4 = var3 - 30;
                      if (((w) this).field_a) {
                        break L5;
                      } else {
                        ml.a(256 * (-var4 + var2_ref.field_f) / 30, var2_ref, (byte) 106, 58, 9, -256 * var4 / 30);
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ml.a(-256 * var4 / 30, var2_ref, (byte) 101, 58, 9, (-var4 + var2_ref.field_f) * 256 / 30);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (param0) {
                  break L6;
                } else {
                  field_k = -125;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "w.B(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        jp var5 = null;
        String var6 = null;
        String var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((w) this).field_l != null) {
                break L1;
              } else {
                if (null == co.field_j) {
                  break L1;
                } else {
                  ((w) this).field_l = new jp(622, 47);
                  fc.a(-49, ((w) this).field_l);
                  lb.g(0, 0, 622, 47, 4540749, 65793);
                  var2_int = 16448250;
                  var3 = 10068666;
                  var4 = lk.a(param0 + -580, var2_int, var3);
                  this.a(47, 0, ((w) this).field_f, var4, (dh) (Object) co.field_j, 622, 0, 0);
                  sc.b(param0 + -592);
                  ((w) this).field_e = new jp(param0, 24);
                  this.a((dh) (Object) co.field_j, -4, 0.75f, (byte) 124, 475, va.field_c, var4, 24, ((w) this).field_e, 0);
                  var4 = lk.a(-124, 526344, 526344);
                  var5 = new jp(121, 122);
                  fc.a(param0 ^ -388, var5);
                  lb.g(0, 0, var5.field_D, var5.field_C / 2, 16180917, 16306250);
                  lb.g(0, var5.field_C / 2, var5.field_D, var5.field_C, 16306250, 15568919);
                  var6 = tl.field_a;
                  var7 = ko.field_q;
                  this.a((dh) (Object) co.field_j, -16, 0.5f, (byte) 118, var5.field_D, var6, var4, var5.field_C, var5, 0);
                  this.a((dh) (Object) co.field_j, 20, 0.5f, (byte) 105, var5.field_D, var7, var4, var5.field_C, var5, 0);
                  this.a((dh) (Object) co.field_j, -co.field_j.field_F + (var5.field_C / 2 + 12), 0.699999988079071f, (byte) 62, var5.field_D, uo.field_e[((w) this).field_c], var4, var5.field_C / 3, var5, 0);
                  sc.b(-119);
                  ((w) this).field_p = new jp(121, 122);
                  fc.a(-115, ((w) this).field_p);
                  var5.e(((w) this).field_p.field_D / 2, ((w) this).field_p.field_C / 2, -2048, 4096);
                  sc.b(-108);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "w.I(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            lb.g(9, 9, 622, 47, 4540749, 65793);
            lb.g(9, 257, 622, 33, 2585);
            lb.g(9, 265, 622, 11, 2585, 1515566);
            var2_int = 0;
            var3 = 14;
            L1: while (true) {
              L2: {
                L3: {
                  if (4 <= var2_int) {
                    break L3;
                  } else {
                    lb.g(var3, 331, 117, 90, 460551, 3881787);
                    var2_int++;
                    var3 += 121;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 <= -6) {
                    break L4;
                  } else {
                    this.a(111);
                    break L4;
                  }
                }
                var2_int = 0;
                break L2;
              }
              var3 = 299;
              L5: while (true) {
                L6: {
                  L7: {
                    if (2 <= var2_int) {
                      break L7;
                    } else {
                      lb.g(508, var3, 127, 42, 1130115, 3365268);
                      lb.g(508, 42 + var3, 127, 42, 12410);
                      var3 += 91;
                      var2_int++;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.a(true);
                  break L6;
                }
                L8: {
                  if (jg.field_d == null) {
                    break L8;
                  } else {
                    if (!jg.field_d.a((byte) -127)) {
                      break L8;
                    } else {
                      if (!jg.field_d.a("members_expansion_screen", -28138)) {
                        break L8;
                      } else {
                        if (!jg.field_d.a("arialish12", -28138)) {
                          break L8;
                        } else {
                          if (!jg.field_d.a("pump32", -28138)) {
                            break L8;
                          } else {
                            if (fe.field_jb == null) {
                              break L8;
                            } else {
                              if (!fe.field_jb.a((byte) -127)) {
                                break L8;
                              } else {
                                if (!fe.field_jb.a("arialish12", -28138)) {
                                  break L8;
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
                                    break L8;
                                  } else {
                                    break L8;
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
                  L9: {
                    ((w) this).field_p.c(376, 339);
                    ((w) this).field_l.c(9, 9);
                    bl.field_J.a(0, 0);
                    if (null != ll.field_c) {
                      ll.field_c.c(9, 257);
                      ll.field_c.f(558, 257);
                      if (po.field_a <= 257) {
                        break L9;
                      } else {
                        if (po.field_a < 290) {
                          var2_int = 40 - -(di.a((byte) 124, ((w) this).field_i << 790494148) * 40 >> -314792144);
                          if (0 >= var2_int) {
                            break L9;
                          } else {
                            L10: {
                              if (9 >= pq.field_k) {
                                break L10;
                              } else {
                                if (pq.field_k >= 82) {
                                  break L10;
                                } else {
                                  ll.field_c.f(8, 256, var2_int);
                                  ll.field_c.f(10, 256, var2_int);
                                  ll.field_c.f(8, 258, var2_int);
                                  ll.field_c.f(10, 258, var2_int);
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            if (558 >= pq.field_k) {
                              break L9;
                            } else {
                              if (pq.field_k < 631) {
                                ll.field_c.a();
                                ll.field_c.f(557, 256, var2_int);
                                ll.field_c.f(559, 256, var2_int);
                                ll.field_c.f(557, 258, var2_int);
                                ll.field_c.f(559, 258, var2_int);
                                ll.field_c.a();
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  L11: {
                    L12: {
                      ((w) this).field_e.c(16, 302);
                      int discarded$4 = ch.field_c.a(((w) this).field_d[((w) this).field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
                      rp.field_u.c(30, 330);
                      int discarded$5 = ch.field_c.a(ab.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      int discarded$6 = ch.field_c.a(ab.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      int discarded$7 = ch.field_c.a(ab.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
                      nc.field_e.c((-nc.field_e.field_x + 127) / 2 + 508, 315);
                      if (0 == ((w) this).field_g.field_j) {
                        break L12;
                      } else {
                        if (((w) this).field_g.field_j == 1) {
                          sf.field_V[1].c(508, 387);
                          if (var4 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    sf.field_V[0].c(508, 299);
                    break L11;
                  }
                  break L0;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "w.M(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int var2_int = 0;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        Throwable decompiledCaughtException = null;
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
          throw qb.a((Throwable) (Object) var2_ref, "w.K(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            L1: {
              ((w) this).field_g.d(-1);
              if (((w) this).field_g.a((byte) 113)) {
                if (((w) this).field_g.field_j != 0) {
                  if (((w) this).field_g.field_j == 1) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                } else {
                  this.b((byte) 125);
                  stackOut_4_0 = 3;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              } else {
                break L1;
              }
            }
            var2_int = 83 % ((param0 - -17) / 51);
            if (13 != dc.field_b) {
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "w.L(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    private final void a(dh param0, int param1, float param2, byte param3, int param4, String param5, int[] param6, int param7, jp param8, int param9) {
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        jp var13 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var11_int = (int)((float)param4 / param2);
              if (param3 >= 56) {
                break L1;
              } else {
                ((w) this).field_o = -54;
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
            stackOut_5_0 = (RuntimeException) var11;
            stackOut_5_1 = new StringBuilder().append("w.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param6 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param7).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param8 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param9 + ')');
        }
    }

    private final void a(String param0, boolean param1, boolean param2, tp[] param3, String[] param4, java.applet.Applet param5) {
        RuntimeException runtimeException = null;
        String var7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var7 = param5.getParameter("currency");
                  if (null == var7) {
                    break L3;
                  } else {
                    if (dc.a((CharSequence) (Object) var7, -53)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ((w) this).field_c = 2;
                if (!BrickABrac.field_J) {
                  break L1;
                } else {
                  break L2;
                }
              }
              ((w) this).field_c = fl.a((CharSequence) (Object) var7, -28734);
              break L1;
            }
            L4: {
              ((w) this).field_f = param0;
              ((w) this).field_g = new re(2);
              ((w) this).field_q = param3;
              ((w) this).field_d = param4;
              if (((w) this).field_q == null) {
                break L4;
              } else {
                if (3 > ((w) this).field_q.length) {
                  break L4;
                } else {
                  if (!param1) {
                    ea.field_a = param2;
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) runtimeException;
            stackOut_20_1 = new StringBuilder().append("w.G(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L7;
            }
          }
          L8: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L8;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
            stackOut_3_0 = (var4 * var6 >> -2062548824) + (var3_int * param1 + var5 * var4);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "w.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_r = null;
              field_m = null;
              if (param0 >= 82) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            field_n = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "w.C(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fk.field_h = null;
              if (param0 == 3) {
                break L1;
              } else {
                field_k = -112;
                break L1;
              }
            }
            h.field_F = null;
            ik.field_j = false;
            rg.field_k = null;
            ik.field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "w.N(" + param0 + ')');
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 > 4) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (~var2_int >= ~var4) {
                  break L3;
                } else {
                  var3[-1 + (var2_int + -var4)] = param1.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = new String(var3);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("w.J(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_8_0;
    }

    private final void a(int param0, int param1, String param2, int[] param3, dh param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            jf.d(-99);
            if (param7 == 0) {
              var9_int = param6;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~param0 >= ~var9_int) {
                      break L3;
                    } else {
                      lb.e(param1, var9_int, param5, 1 + var9_int);
                      var10 = var9_int * param3.length / param0;
                      var11 = param3[param3.length - (var10 + 1)];
                      int discarded$3 = param4.a(param2, param1, param6, param5, param0, var11, -1, 1, 1, 0);
                      var9_int++;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        if (var12 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  sc.b(-102);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("w.E(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            if (null == bl.field_J) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param2 < 508) {
                  break L1;
                } else {
                  if (param2 >= 635) {
                    break L1;
                  } else {
                    if (299 > param0) {
                      break L1;
                    } else {
                      if (param0 >= 386) {
                        break L1;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
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
                    if (param2 >= 635) {
                      break L2;
                    } else {
                      if (param0 < 390) {
                        break L2;
                      } else {
                        if (param0 < 475) {
                          stackOut_32_0 = 1;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_34_0 = -1;
                stackIn_35_0 = stackOut_34_0;
                break L0;
              } else {
                stackOut_18_0 = -75;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "w.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_35_0;
    }

    w(java.applet.Applet param0, String param1, tp[] param2, boolean param3, String[] param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((w) this).field_a = true;
        ((w) this).field_i = 0;
        ((w) this).field_o = 0;
        try {
          L0: {
            this.a(param1, false, param3, param2, param4, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("w.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "If you are not, please change your password to something more obscure!";
    }
}
