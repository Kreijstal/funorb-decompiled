/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends ue {
    static int field_f;
    private m field_t;
    private int field_j;
    private boolean field_r;
    private boolean field_p;
    private int field_h;
    private boolean field_k;
    private boolean field_n;
    private int field_l;
    private re field_g;
    private int field_q;
    private int field_v;
    private int field_e;
    private boolean field_u;
    private boolean field_s;
    private int field_o;
    static String field_i;
    static String field_m;

    final void b(int param0) {
        int stackIn_5_0 = 0;
        re stackIn_9_0 = null;
        re stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_70_0 = 0;
        String stackIn_73_0 = null;
        ef stackIn_75_0 = null;
        ef stackIn_76_0 = null;
        String stackIn_76_1 = null;
        int stackIn_78_2;
        int stackIn_78_3;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        ef stackIn_81_0 = null;
        ef stackIn_82_0 = null;
        String stackIn_82_1 = null;
        ik stackIn_101_0 = null;
        ik stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_105_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        dl var11;
        int var12;
        String var13;
        int var14;
        int var15;
        int var16;
        L0: {
          var16 = CrazyCrystals.field_B;
          this.field_g.e(41);
          if (param0 == 8) {
            break L0;
          } else {
            this.b(-19);
            break L0;
          }
        }
        L1: {
          var2 = 580 * qb.field_a * qb.field_a / 400 + 30;
          if (!this.field_n) {
            stackIn_5_0 = this.field_v;
            break L1;
          } else {
            stackIn_5_0 = this.field_v + -30;
            break L1;
          }
        }
        var3 = stackIn_5_0;
        var4 = this.field_l;
        wi.a(30, jn.field_o, var3, var4 - var3, (byte) -71, -30 + var2);
        kh.d(38, var3 - -8, -46 + var2, -16 + (var4 - var3), 0, 192);
        if (this.field_g.field_f == 0) {
          L2: {
            stackIn_9_0 = this.field_g;

            if (this.field_u) {
              stackIn_10_0 = (re) ((Object) stackIn_9_0);
              stackIn_10_1 = -1;
              break L2;
            } else {
              stackIn_10_0 = (re) ((Object) stackIn_9_0);
              stackIn_10_1 = 10;
              break L2;
            }
          }
          ((re) (Object) stackIn_10_0).a(stackIn_10_1, false);
          if ((qb.field_a ^ -1) != -21) {
            return;
          } else {
            L3: {
              if (this.field_n) {
                go.field_l.c(rp.field_a, 320, this.field_v - 5, 16777215, -1);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var5 = this.field_o;
              var6 = fk.field_s;
              var7 = this.c((byte) -55);
              var8 = 304 + -(20 * (-1 + var7 / 2));
              if (!this.field_n) {
                break L4;
              } else {
                var6 = pc.field_y;
                var8 = 324 - 20 * mm.a(var6, (byte) -37);
                break L4;
              }
            }
            var9 = this.field_q;
            var10 = 0;
            L5: while (true) {
              if (17 <= var10) {
                L6: {
                  if (0 <= this.field_o) {
                    var5 = this.field_o;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (0 > var5) {
                    L8: {
                      if (!this.field_n) {
                        break L8;
                      } else {
                        if (0 != var6) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    go.field_l.c(cd.field_A, 320, -5 + this.field_h, 8438015, -1);
                    break L7;
                  } else {
                    L9: {
                      if (-1 == (var6 & 1 << var5 ^ -1)) {
                        stackIn_59_0 = 0;
                        break L9;
                      } else {
                        stackIn_59_0 = 1;
                        break L9;
                      }
                    }
                    L10: {
                      var10 = stackIn_59_0;
                      go.field_l.c(jm.field_e[var5], 320, -5 + this.field_h, 16760896, -1);
                      var11 = ro.field_q;
                      if (mo.field_l > 0) {
                        break L10;
                      } else {
                        if ((1 << var5 & 769) != 0) {
                          break L10;
                        } else {
                          var11 = ah.field_b;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var10 == 0) {
                        break L11;
                      } else {
                        var11 = d.field_c[var5];
                        break L11;
                      }
                    }
                    L12: {
                      var8 = 256;
                      var9 = this.field_h;
                      var11.a(var8, var9);
                      if (var10 == 0) {
                        if (-1 != (16 & 1 << var5 ^ -1)) {
                          stackIn_70_0 = 1;
                          break L12;
                        } else {
                          stackIn_70_0 = 0;
                          break L12;
                        }
                      } else {
                        stackIn_70_0 = 0;
                        break L12;
                      }
                    }
                    L13: {
                      var12 = stackIn_70_0;
                      if (var12 != 0) {
                        stackIn_73_0 = vh.field_n;
                        break L13;
                      } else {
                        stackIn_73_0 = an.field_o[var5];
                        break L13;
                      }
                    }
                    L14: {
                      var13 = stackIn_73_0;
                      var14 = 1 + go.field_l.a(var13, 191);
                      var9 = -(var14 * 20 / 2) + (15 + this.field_h) - -64;
                      var9 = var9 + 20 * go.field_l.a(var13, 50, -go.field_l.field_o + var9, 191, 1000, 8438015, -1, 2, 0, 20);
                      stackIn_75_0 = go.field_l;

                      if (var10 == 0) {
                        stackIn_76_0 = (ef) ((Object) stackIn_75_0);
                        stackIn_76_1 = fl.field_l;
                        break L14;
                      } else {
                        stackIn_76_0 = (ef) ((Object) stackIn_75_0);
                        stackIn_76_1 = bm.field_j;
                        break L14;
                      }
                    }
                    L15: {




                      stackIn_78_2 = 241;

                      stackIn_78_3 = var9;

                      if (var10 != 0) {
                        stackIn_76_0 = (ef) ((Object) stackIn_76_0);
                        stackIn_76_1 = (String) ((Object) stackIn_76_1);
                        stackIn_79_2 = stackIn_78_2;
                        stackIn_79_3 = stackIn_78_3;
                        stackIn_79_4 = 16760896;
                        break L15;
                      } else {
                        stackIn_76_0 = (ef) ((Object) stackIn_76_0);
                        stackIn_76_1 = (String) ((Object) stackIn_76_1);
                        stackIn_79_2 = stackIn_78_2;
                        stackIn_79_3 = stackIn_78_3;
                        stackIn_79_4 = 16728064;
                        break L15;
                      }
                    }
                    L16: {
                      ((ef) (Object) stackIn_76_0).b(stackIn_76_1, stackIn_79_2, stackIn_79_3, stackIn_79_4, -1);
                      go.field_l.b(ih.field_d, 510, -5 + (64 + this.field_h), 8438015, -1);
                      stackIn_81_0 = go.field_l;

                      if (var12 == 0) {
                        stackIn_82_0 = (ef) ((Object) stackIn_81_0);
                        stackIn_82_1 = Integer.toString(tm.field_a[var5]);
                        break L16;
                      } else {
                        stackIn_82_0 = (ef) ((Object) stackIn_81_0);
                        stackIn_82_1 = "?";
                        break L16;
                      }
                    }
                    ((ef) (Object) stackIn_82_0).a(stackIn_82_1, 510, -5 + (64 + this.field_h), 16760896, -1);
                    go.field_l.b(lc.field_b, 510, this.field_h + 64 - -15, 8438015, -1);
                    if (var12 == 0) {
                      var15 = 0;
                      L17: while (true) {
                        if (var15 >= eq.field_l[var5]) {
                          break L7;
                        } else {
                          ne.field_i.a(5 * var15 + 510, this.field_h - -64);
                          var15++;
                          continue L17;
                        }
                      }
                    } else {
                      go.field_l.a("?", 510, 15 + this.field_h - -64, 16760896, -1);
                      break L7;
                    }
                  }
                }
                L18: {
                  if ((var6 & 4096) == 0) {
                    break L18;
                  } else {
                    an.field_q.c(pp.field_i, 320, this.field_j, 8438015, -1);
                    break L18;
                  }
                }
                L19: {
                  if (!rc.a(param0 + -110)) {
                    break L19;
                  } else {
                    go.field_l.c(el.field_f, 320, this.field_e, 16760896, -1);
                    break L19;
                  }
                }
                var10 = 0;
                L20: while (true) {
                  if (var10 >= this.field_d.length) {
                    return;
                  } else {
                    if (null != this.field_d[var10]) {
                      L21: {
                        stackIn_101_0 = this.field_d[var10];

                        if (var10 != this.field_b.field_c) {
                          stackIn_102_0 = (ik) ((Object) stackIn_101_0);
                          stackIn_102_1 = 0;
                          break L21;
                        } else {
                          stackIn_102_0 = (ik) ((Object) stackIn_101_0);
                          stackIn_102_1 = 1;
                          break L21;
                        }
                      }
                      L22: {




                        if (this.field_b.field_c == var10) {
                          stackIn_102_0 = (ik) ((Object) stackIn_102_0);

                          stackIn_105_2 = 16777215;
                          break L22;
                        } else {
                          stackIn_102_0 = (ik) ((Object) stackIn_102_0);

                          stackIn_105_2 = 12640511;
                          break L22;
                        }
                      }
                      ((ik) (Object) stackIn_102_0).a(stackIn_102_1 != 0, stackIn_105_2, 1);
                      var10++;
                      continue L20;
                    } else {
                      var10++;
                      continue L20;
                    }
                  }
                }
              } else {
                if (this.a(var10, (byte) -92)) {
                  L23: {
                    if (!this.field_n) {
                      break L23;
                    } else {
                      if (0 != (var6 & 1 << var10)) {
                        break L23;
                      } else {
                        var10++;
                        continue L5;
                      }
                    }
                  }
                  L24: {
                    L25: {
                      if (this.field_o == var10) {
                        break L25;
                      } else {
                        L26: {
                          if (var8 > qh.field_i) {
                            break L26;
                          } else {
                            if (32 + var8 <= qh.field_i) {
                              break L26;
                            } else {
                              if (bm.field_h < var9) {
                                break L26;
                              } else {
                                if (bm.field_h < var9 - -32) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                        }
                        L27: {
                          var11 = oj.field_B;
                          if (-1 > (mo.field_l ^ -1)) {
                            break L27;
                          } else {
                            if ((1 << var10 & 769) != 0) {
                              break L27;
                            } else {
                              var11 = p.field_k;
                              break L27;
                            }
                          }
                        }
                        L28: {
                          if ((1 << var10 & var6) != 0) {
                            var11 = cn.field_c[var10];
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        var11.a(var8, var9);
                        break L24;
                      }
                    }
                    L29: {
                      var11 = ro.field_q;
                      if (mo.field_l > 0) {
                        break L29;
                      } else {
                        if (-1 != (1 << var10 & 769 ^ -1)) {
                          break L29;
                        } else {
                          var11 = ah.field_b;
                          break L29;
                        }
                      }
                    }
                    L30: {
                      if (0 == (var6 & 1 << var10)) {
                        break L30;
                      } else {
                        var11 = d.field_c[var10];
                        break L30;
                      }
                    }
                    if (this.field_o != var10) {
                      var11.d(var8 + -2, -2 + var9, 36, 36);
                      var5 = var10;
                      break L24;
                    } else {
                      var11.d(var8 - 4, -4 + var9, 40, 40);
                      break L24;
                    }
                  }
                  var8 += 40;
                  if (!this.field_n) {
                    if (var10 == var7 / 2 - 1) {
                      var8 = var8 - var7 * 40 / 2;
                      var9 += 40;
                      var10++;
                      continue L5;
                    } else {
                      var10++;
                      continue L5;
                    }
                  } else {
                    var10++;
                    continue L5;
                  }
                } else {
                  var10++;
                  continue L5;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_m = null;
        if (param0 != -100) {
            field_i = (String) null;
        }
    }

    final boolean a(int param0) {
        L0: {
          if (this.field_b.field_c != 0) {
            break L0;
          } else {
            if (!this.field_b.a(true)) {
              break L0;
            } else {
              if (rc.a(-70)) {
                this.field_s = true;
                return true;
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (-2 != (this.field_b.field_c ^ -1)) {
            break L1;
          } else {
            if (!this.field_b.a(true)) {
              break L1;
            } else {
              if (this.field_t == null) {
                break L1;
              } else {
                this.field_p = true;
                return true;
              }
            }
          }
        }
        L2: {
          if (param0 > 99) {
            break L2;
          } else {
            this.field_s = true;
            break L2;
          }
        }
        if ((this.field_b.field_c ^ -1) != -3) {
          return false;
        } else {
          if (this.field_b.a(true)) {
            L3: {
              L4: {
                if (!this.field_n) {
                  break L4;
                } else {
                  if (-1 != (mo.field_l ^ -1)) {
                    break L4;
                  } else {
                    if (dk.field_h < uo.field_o) {
                      this.field_r = true;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              this.field_u = true;
              break L3;
            }
            return true;
          } else {
            return false;
          }
        }
    }

    private final int c(byte param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = CrazyCrystals.field_B;
          var2 = 0;
          if (param0 <= -32) {
            break L0;
          } else {
            this.a(10);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= 17) {
            return var2;
          } else {
            if (this.a(var3, (byte) -92)) {
              var2++;
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          this.field_v = 100;
          var2 = 115;
          this.field_q = var2;
          if (this.field_n) {
            break L0;
          } else {
            var2 += 40;
            break L0;
          }
        }
        L1: {
          var2 += 65;
          this.field_h = var2;
          var2 += 145;
          if (rc.a(-77)) {
            this.field_e = var2;
            var2 += 25;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var3 = fk.field_s;
          if (!this.field_n) {
            break L2;
          } else {
            var3 = pc.field_y;
            break L2;
          }
        }
        L3: {
          if ((4096 & var3) == 0) {
            break L3;
          } else {
            this.field_j = var2;
            var2 += 20;
            break L3;
          }
        }
        L4: {
          this.field_l = -3 + var2;
          var2 += 10;
          var4 = var2;
          if (rc.a(-121)) {
            var2 += 35;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var5 = var2;
          if (this.field_t != null) {
            var2 += 35;
            break L5;
          } else {
            break L5;
          }
        }
        var6 = var2;
        var2 += 20;
        if (!param0) {
          L6: {
            var7 = (-var2 + 480) / 2;
            this.field_h = this.field_h + var7;
            var4 = var4 + var7;
            this.field_v = this.field_v + var7;
            this.field_j = this.field_j + var7;
            this.field_q = this.field_q + var7;
            this.field_e = this.field_e + var7;
            var6 = var6 + var7;
            this.field_l = this.field_l + var7;
            var5 = var5 + var7;
            if (this.field_n) {
              break L6;
            } else {
              var8 = (-110 + this.field_v) / 2;
              this.field_v = 110;
              this.field_e = this.field_e - var8;
              this.field_j = this.field_j - var8;
              this.field_h = this.field_h - var8;
              this.field_q = this.field_q - var8;
              break L6;
            }
          }
          L7: {
            this.field_d = new ik[3];
            if (!rc.a(-29)) {
              break L7;
            } else {
              this.field_d[0] = (ik) ((Object) new mh(200, var4, 240, si.field_a, 2));
              break L7;
            }
          }
          L8: {
            if (null == this.field_t) {
              break L8;
            } else {
              this.field_d[1] = (ik) ((Object) new mh(200, var5, 240, gm.field_b, 2));
              break L8;
            }
          }
          this.field_d[2] = (ik) ((Object) new mh(200, var6, 240, ag.field_a, 2));
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = CrazyCrystals.field_B;
        if (this.field_u) {
          L0: {
            if (qb.field_a <= 0) {
              break L0;
            } else {
              qb.field_a = qb.field_a - 1;
              break L0;
            }
          }
          L1: {
            if (0 == qb.field_a) {
              a.field_b = (ue) ((Object) this.field_g);
              this.field_g.a(this.field_b.field_i, -13880);
              break L1;
            } else {
              break L1;
            }
          }
          this.field_g.a(param0);
          return;
        } else {
          L2: {
            if (!this.field_n) {
              this.field_g.f(-96);
              this.field_g.c((byte) 65);
              this.field_g.a((byte) 20, 10);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            L4: {
              if (this.field_p) {
                break L4;
              } else {
                if (!this.field_r) {
                  L5: {
                    if (this.field_s) {
                      L6: {
                        if (0 < qb.field_a) {
                          qb.field_a = qb.field_a - 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.field_g.c(2, 40, 180);
                      if (-41 < (this.field_g.field_f ^ -1)) {
                        return;
                      } else {
                        if (this.field_k) {
                          this.field_k = false;
                          this.field_s = false;
                          if (!rc.a(-46)) {
                            this.b(false);
                            if (this.field_t != null) {
                              this.field_t.d(136);
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        } else {
                          rk.a(0);
                          this.field_b.a(-1, true, -1);
                          this.field_k = true;
                          return;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (qb.field_a >= 20) {
                      break L7;
                    } else {
                      qb.field_a = qb.field_a + 1;
                      break L7;
                    }
                  }
                  this.field_g.c(-1);
                  if (!param0) {
                    L8: while (true) {
                      if (!ge.b(-26)) {
                        L9: {
                          this.a((byte) 95);
                          if (0 == pj.field_v) {
                            break L9;
                          } else {
                            L10: {
                              var2 = fk.field_s;
                              var3 = this.c((byte) -117);
                              var4 = 304 - var3 / 2 * 20 - -20;
                              if (!this.field_n) {
                                break L10;
                              } else {
                                var2 = pc.field_y;
                                var4 = 324 - 20 * mm.a(var2, (byte) -43);
                                break L10;
                              }
                            }
                            var5 = this.field_q;
                            var6 = 0;
                            L11: while (true) {
                              if (var6 >= 17) {
                                break L9;
                              } else {
                                if (this.a(var6, (byte) -92)) {
                                  L12: {
                                    if (!this.field_n) {
                                      break L12;
                                    } else {
                                      if ((1 << var6 & var2) != 0) {
                                        break L12;
                                      } else {
                                        var6++;
                                        continue L11;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (to.field_a < var4) {
                                      break L13;
                                    } else {
                                      if (to.field_a >= var4 + 32) {
                                        break L13;
                                      } else {
                                        if (var5 > dp.field_h) {
                                          break L13;
                                        } else {
                                          if (dp.field_h < 32 + var5) {
                                            if (var6 != this.field_o) {
                                              this.field_o = var6;
                                              break L13;
                                            } else {
                                              this.field_o = -1;
                                              break L13;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4 += 40;
                                  if (!this.field_n) {
                                    if (var6 == -1 + var3 / 2) {
                                      var5 += 40;
                                      var4 = var4 - 40 * var3 / 2;
                                      var6++;
                                      continue L11;
                                    } else {
                                      var6++;
                                      continue L11;
                                    }
                                  } else {
                                    var6++;
                                    continue L11;
                                  }
                                } else {
                                  var6++;
                                  continue L11;
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        L14: {
                          if (pj.field_q == 98) {
                            L15: while (true) {
                              L16: {
                                if (0 >= this.field_b.field_c) {
                                  this.field_b.field_c = 3;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              this.field_b.field_c = this.field_b.field_c - 1;
                              if (null == this.field_d[this.field_b.field_c]) {
                                continue L15;
                              } else {
                                this.field_b.field_i = false;
                                break L14;
                              }
                            }
                          } else {
                            break L14;
                          }
                        }
                        L17: {
                          if ((pj.field_q ^ -1) == -100) {
                            L18: while (true) {
                              L19: {
                                this.field_b.field_c = this.field_b.field_c + 1;
                                if (3 <= this.field_b.field_c) {
                                  this.field_b.field_c = 0;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              if (this.field_d[this.field_b.field_c] != null) {
                                this.field_b.field_i = false;
                                break L17;
                              } else {
                                continue L18;
                              }
                            }
                          } else {
                            break L17;
                          }
                        }
                        this.field_b.a((byte) -124);
                        if (this.a(112)) {
                          return;
                        } else {
                          L20: {
                            if (-14 == (pj.field_q ^ -1)) {
                              break L20;
                            } else {
                              if (this.field_b.a(true)) {
                                break L20;
                              } else {
                                continue L8;
                              }
                            }
                          }
                          this.field_b.field_i = false;
                          if (null == this.field_t) {
                            L21: {
                              L22: {
                                if (!this.field_n) {
                                  break L22;
                                } else {
                                  if (mo.field_l != 0) {
                                    break L22;
                                  } else {
                                    if (dk.field_h < uo.field_o) {
                                      this.field_r = true;
                                      break L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                              this.field_u = true;
                              break L21;
                            }
                            return;
                          } else {
                            this.field_p = true;
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L4;
                }
              }
            }
            L23: {
              if (qb.field_a <= 0) {
                break L23;
              } else {
                qb.field_a = qb.field_a - 1;
                break L23;
              }
            }
            L24: {
              if (-1 == (qb.field_a ^ -1)) {
                if (this.field_r) {
                  a.field_b = (ue) ((Object) new rb(this.field_g, this.field_b.field_i));
                  break L24;
                } else {
                  a.field_b = (ue) ((Object) this.field_t);
                  this.field_t.a(this.field_b.field_i, -13880);
                  break L3;
                }
              } else {
                break L24;
              }
            }
            return;
          }
          return;
        }
    }

    vn(m param0, re param1, boolean param2) {
        super(3);
        this.field_o = -1;
        try {
            if (!(a.field_b instanceof vn)) {
                qb.field_a = 0;
            }
            this.field_g = param1;
            this.field_n = param2 ? true : false;
            this.field_t = param0;
            this.field_b.field_c = -1;
            this.b(false);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    var3 = 103 % ((-66 - param1) / 56);
                    param0.getAppletContext().showDocument(gh.a(param0, var2, (byte) 67), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("vn.E(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, byte param1) {
        int discarded$0 = 0;
        if (param1 != -92) {
            discarded$0 = this.c((byte) 0);
        }
        if (!(-1 == (fk.field_s & 1 << param0 ^ -1))) {
            return true;
        }
        if (0 == (kf.field_e[param0] ^ -1)) {
            return true;
        }
        if (!ai.a(100, kf.field_e[param0])) {
            return false;
        }
        return true;
    }

    static {
        field_i = "Creating your account";
        field_m = "From Level";
    }
}
