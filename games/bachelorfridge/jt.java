/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt {
    int[] field_o;
    private sna field_n;
    private ola field_c;
    static jg field_f;
    private int field_b;
    static kv field_g;
    sna field_l;
    private sna field_t;
    private sna field_s;
    private gba field_m;
    private sna field_k;
    private wl field_q;
    lha field_p;
    private int field_d;
    private sna field_r;
    int field_a;
    private int field_i;
    private int field_j;
    ula field_h;
    private sna field_e;

    private final void h() {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        cc.field_b.field_z = null;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((jt) this).field_o.length) {
            return;
          } else {
            if (((jt) this).field_o[var2] != 0) {
              cc.field_b.a(-1, (sna) (Object) new ona(var2, kka.field_i[var2], new kna(var2, ((jt) this).field_o[var2])));
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jfa var6_ref_jfa = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jfa var8_ref_jfa = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kv stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        kv stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        kv stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        kv stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        kv stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        kv stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        L0: {
          L1: {
            var11 = BachelorFridge.field_y;
            if (!ku.field_q) {
              break L1;
            } else {
              if (!((jt) this).field_s.field_T) {
                break L1;
              } else {
                if (cc.field_b.field_z != null) {
                  break L1;
                } else {
                  ng.field_a.e(param0 + 410, 138);
                  break L0;
                }
              }
            }
          }
          L2: {
            if (!ku.field_q) {
              break L2;
            } else {
              if (null != cc.field_b.field_z) {
                L3: {
                  if (!((jt) this).field_s.field_T) {
                    break L3;
                  } else {
                    if (cc.field_b.field_z != null) {
                      kga.field_d.e(param0 + 410, 138);
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                gca.field_g.e(410 - -param0, 148);
                break L0;
              } else {
                break L2;
              }
            }
          }
          cba.field_a.e(410 + param0, 148);
          break L0;
        }
        L4: {
          L5: {
            if (!((jt) this).field_c.field_s.field_T) {
              break L5;
            } else {
              if (((jt) this).field_a != 0) {
                tl.field_s.e(525 + param0, 11);
                break L4;
              } else {
                break L5;
              }
            }
          }
          ska.field_k.e(param0 + 519, 11);
          break L4;
        }
        L6: {
          L7: {
            if (((jt) this).field_a == 0) {
              break L7;
            } else {
              if (((jt) this).field_i <= 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          this.c(true);
          dg.c();
          if (((jt) this).field_p == null) {
            break L6;
          } else {
            ((jt) this).field_p.a(true);
            break L6;
          }
        }
        L8: {
          if (param1 == 8687) {
            break L8;
          } else {
            ((jt) this).field_n = null;
            break L8;
          }
        }
        L9: {
          L10: {
            if (((jt) this).field_a == 1) {
              break L10;
            } else {
              if (((jt) this).field_b <= 0) {
                ((jt) this).field_d = 0;
                break L9;
              } else {
                break L10;
              }
            }
          }
          L11: {
            kaa.field_l[0].e(param0, 6);
            if (2 > ((jt) this).field_d) {
              kaa.field_l[1].e(param0, 72);
              break L11;
            } else {
              if (((jt) this).field_d >= 4) {
                if (((jt) this).field_d < 6) {
                  kaa.field_l[2].e(param0, 72);
                  break L11;
                } else {
                  if (((jt) this).field_d >= 8) {
                    kaa.field_l[1].e(param0, 72);
                    break L11;
                  } else {
                    kaa.field_l[3].e(param0, 72);
                    break L11;
                  }
                }
              } else {
                kaa.field_l[3].e(param0, 72);
                break L11;
              }
            }
          }
          ((jt) this).field_d = ((jt) this).field_d + 1;
          cga.field_r.a(param0 + (640 + -((jt) this).field_b), 0);
          vl.field_c.a(-((jt) this).field_b + (656 - -param0), 56);
          var3 = 0;
          L12: while (true) {
            if (var3 >= 8) {
              L13: {
                an.field_r.a(param0 + -((jt) this).field_b + 656, 398);
                stackOut_40_0 = qt.field_m;
                stackOut_40_1 = -((jt) this).field_b + (875 + param0);
                stackOut_40_2 = 10;
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_42_2 = stackOut_40_2;
                stackIn_41_0 = stackOut_40_0;
                stackIn_41_1 = stackOut_40_1;
                stackIn_41_2 = stackOut_40_2;
                if (!((jt) this).field_k.field_T) {
                  stackOut_42_0 = (kv) (Object) stackIn_42_0;
                  stackOut_42_1 = stackIn_42_1;
                  stackOut_42_2 = stackIn_42_2;
                  stackOut_42_3 = 16764160;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  stackIn_43_3 = stackOut_42_3;
                  break L13;
                } else {
                  stackOut_41_0 = (kv) (Object) stackIn_41_0;
                  stackOut_41_1 = stackIn_41_1;
                  stackOut_41_2 = stackIn_41_2;
                  stackOut_41_3 = 16777215;
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_43_1 = stackOut_41_1;
                  stackIn_43_2 = stackOut_41_2;
                  stackIn_43_3 = stackOut_41_3;
                  break L13;
                }
              }
              ((kv) (Object) stackIn_43_0).e(stackIn_43_1, stackIn_43_2, stackIn_43_3);
              var3 = 0;
              var4 = 0;
              var5 = 0;
              L14: while (true) {
                if (~var5 <= ~((jt) this).field_c.field_r.length) {
                  L15: {
                    if (dm.field_f > 0) {
                      break L15;
                    } else {
                      var5 = 5;
                      L16: while (true) {
                        if (var5 >= ((jt) this).field_c.field_r.length) {
                          break L15;
                        } else {
                          var6 = var5 % 5;
                          var7 = var5 / 5;
                          gg.field_a.e(-24 + (696 + (-((jt) this).field_b + var6 * 45) + param0), -65 + var7 * 35 + 154);
                          var5++;
                          continue L16;
                        }
                      }
                    }
                  }
                  if (((jt) this).field_h != null) {
                    ((jt) this).field_h.b(param1 + -26300);
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  L17: {
                    L18: {
                      if (0 < dm.field_f) {
                        break L18;
                      } else {
                        if (var5 < 5) {
                          break L18;
                        } else {
                          var6 = var5 % 5;
                          var7 = var5 / 5;
                          kja.field_e.e(param0 + 696 - ((jt) this).field_b + (45 * var6 + -34), 150 - (-(var7 * 35) - -65));
                          if (null != ((jt) this).field_c.field_r[var5]) {
                            var8_ref_jfa = ((jt) this).field_c.field_r[var5];
                            var9 = (var4 + 5) % 5;
                            var10 = (5 + var4) / 5;
                            dg.a(45 * var9 + 696 + (-((jt) this).field_b - (34 + -param0)), 87 + var10 * 35, 45 * var9 + (-((jt) this).field_b + 696) - (34 + (-param0 + -42)), 30 + (-65 + (var10 * 35 + 150)));
                            var8_ref_jfa.field_v.a(2048, 34 * var10 + 39, 128, 8, 2048, param0 + -34 + var9 * 45 + (-((jt) this).field_b + 642));
                            dg.c();
                            var4++;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    if (((jt) this).field_c.field_r[var5] == null) {
                      break L17;
                    } else {
                      var6_ref_jfa = ((jt) this).field_c.field_r[var5];
                      var7 = var3 % 5;
                      var8 = var3 / 5;
                      kja.field_e.e(-((jt) this).field_b + (696 - -(45 * var7)) - 34 - -param0, 150 - -(var8 * 35) + -65);
                      dg.a(param0 + 662 + (-((jt) this).field_b - -(45 * var7)), -63 + (35 * var8 + 150), -((jt) this).field_b + (696 - -(var7 * 45) - (34 + -param0) - -42), -65 + 35 * var8 + 180);
                      var6_ref_jfa.field_v.a(2048, 104 + (34 * var8 - 65), 192, 8, 2048, -((jt) this).field_b + 642 - -(var7 * 45) + (-34 + param0));
                      var3++;
                      dg.c();
                      break L17;
                    }
                  }
                  var5++;
                  continue L14;
                }
              }
            } else {
              jla.field_d.a(param0 + -((jt) this).field_b + 656, jla.field_d.field_e * var3 + 118);
              var3++;
              continue L12;
            }
          }
        }
    }

    private final int a() {
        Object var2 = null;
        Object var3 = null;
        int var3_int = 0;
        ona var3_ref = null;
        int var4_int = 0;
        ona var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var3 = null;
            var8 = BachelorFridge.field_y;
            var2 = null;
            if (((jt) this).field_a != 0) {
              break L1;
            } else {
              if (256 <= ((jt) this).field_i) {
                L2: {
                  L3: {
                    if (fia.field_t != 1) {
                      break L3;
                    } else {
                      if (((jt) this).field_c.field_h) {
                        break L3;
                      } else {
                        if (((jt) this).field_c.a((byte) -96)) {
                          break L3;
                        } else {
                          if (null != cc.field_b.field_z) {
                            L4: {
                              if (((jt) this).a(-22263)) {
                                var3_ref = (ona) (Object) cc.field_b.field_z.b((byte) 90);
                                L5: while (true) {
                                  if (var3_ref == null) {
                                    break L4;
                                  } else {
                                    if (var3_ref.field_R != 1) {
                                      var3_ref = (ona) (Object) cc.field_b.field_z.c(0);
                                      continue L5;
                                    } else {
                                      L6: {
                                        if (fw.field_h[var3_ref.field_wb].field_e) {
                                          break L6;
                                        } else {
                                          if (dm.field_f <= 0) {
                                            break L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var2 = (Object) (Object) var3_ref;
                                      break L4;
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                            if (var2 == null) {
                              break L2;
                            } else {
                              L7: {
                                ((jt) this).field_c.field_h = true;
                                ((jt) this).field_p = new lha(nfa.field_a, jc.field_r, ((ona) var2).field_wb);
                                ((jt) this).field_o[((ona) var2).field_wb] = ((jt) this).field_o[((ona) var2).field_wb] - 1;
                                ((ona) var2).field_zb.c((byte) -126);
                                if (((ona) var2).field_zb.field_f == 0) {
                                  ((ona) var2).a(false);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              int discarded$4 = -1;
                              this.h();
                              break L2;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (fia.field_t > 0) {
                    break L2;
                  } else {
                    if (!((jt) this).field_c.field_h) {
                      break L2;
                    } else {
                      if (((jt) this).field_p == null) {
                        break L2;
                      } else {
                        L8: {
                          if (((jt) this).field_c.a((byte) -89, (int)((jt) this).field_p.field_d, (int)((jt) this).field_p.field_f, ((jt) this).field_p.field_g)) {
                            uca.a(12, (byte) -112);
                            ((jt) this).field_p = null;
                            break L8;
                          } else {
                            this.c(-67, ((jt) this).field_p.field_g);
                            ((jt) this).field_p.field_e = true;
                            break L8;
                          }
                        }
                        ((jt) this).field_c.field_h = false;
                        break L2;
                      }
                    }
                  }
                }
                if (((jt) this).field_p != null) {
                  ((jt) this).field_p.c((byte) 50);
                  if (((jt) this).field_c.field_h) {
                    ((jt) this).field_p.field_d = (float)gd.field_m;
                    ((jt) this).field_p.field_f = (float)mk.field_p;
                    break L0;
                  } else {
                    if (!((jt) this).field_p.field_e) {
                      L9: {
                        ((jt) this).field_o[((jt) this).field_p.field_g] = ((jt) this).field_o[((jt) this).field_p.field_g] + 1;
                        var3_ref = null;
                        if (cc.field_b.field_z != null) {
                          var4 = (ona) (Object) cc.field_b.field_z.b((byte) 90);
                          L10: while (true) {
                            if (var4 == null) {
                              break L9;
                            } else {
                              L11: {
                                if (var4.field_wb == ((jt) this).field_p.field_g) {
                                  var3_ref = var4;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var4 = (ona) (Object) cc.field_b.field_z.c(0);
                              continue L10;
                            }
                          }
                        } else {
                          break L9;
                        }
                      }
                      if (var3_ref != null) {
                        var3_ref.field_zb.b(true);
                        ((jt) this).field_p = null;
                        int discarded$5 = -1;
                        this.h();
                        break L0;
                      } else {
                        cc.field_b.a(-1, (sna) (Object) new ona(((jt) this).field_p.field_g, kka.field_i[((jt) this).field_p.field_g], new kna(((jt) this).field_p.field_g, ((jt) this).field_o[((jt) this).field_p.field_g])));
                        ((jt) this).field_p = null;
                        int discarded$6 = -1;
                        this.h();
                        break L0;
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          if (((jt) this).field_a == 1) {
            L12: {
              L13: {
                if (!((jt) this).a(-22263)) {
                  break L13;
                } else {
                  if (fia.field_t != 1) {
                    break L13;
                  } else {
                    if (((jt) this).field_c.field_h) {
                      break L13;
                    } else {
                      if (!((jt) this).field_c.a((byte) -121)) {
                        var3_int = (mk.field_p - 385) / 47;
                        var4_int = (gd.field_m - 85) / 35;
                        var5 = var3_int + var4_int * 5;
                        var6 = 0;
                        var7 = 0;
                        L14: while (true) {
                          if (var7 >= ((jt) this).field_c.field_r.length) {
                            break L12;
                          } else {
                            L15: {
                              if (dm.field_f > 0) {
                                break L15;
                              } else {
                                if (var7 < 5) {
                                  break L15;
                                } else {
                                  var7++;
                                  continue L14;
                                }
                              }
                            }
                            if (((jt) this).field_c.field_r[var7] != null) {
                              if (var5 == var6) {
                                ((jt) this).field_c.field_h = true;
                                ((jt) this).field_h = new ula(mk.field_p, gd.field_m, ((jt) this).field_c.field_r[var7], var7, 0);
                                ((jt) this).field_c.field_r[var7] = null;
                                break L12;
                              } else {
                                var6++;
                                var7++;
                                continue L14;
                              }
                            } else {
                              var7++;
                              continue L14;
                            }
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
              if (fia.field_t > 0) {
                break L12;
              } else {
                if (!((jt) this).field_c.field_h) {
                  break L12;
                } else {
                  if (null != ((jt) this).field_h) {
                    L16: {
                      var3_int = ((jt) this).g(50);
                      if (!((jt) this).field_c.a(((jt) this).field_h.field_c, (int)((jt) this).field_h.field_a, -19906, (int)((jt) this).field_h.field_i)) {
                        L17: {
                          if (!((jt) this).a(-22263)) {
                            break L17;
                          } else {
                            if (var3_int == -1) {
                              break L17;
                            } else {
                              ((jt) this).field_c.field_r[((jt) this).field_h.field_g] = ((jt) this).field_h.field_c;
                              ((jt) this).field_h = null;
                              break L16;
                            }
                          }
                        }
                        ((jt) this).field_h.field_d = true;
                        break L16;
                      } else {
                        ((jt) this).field_c.field_m.a((bw) (Object) ((jt) this).field_h.field_c, true);
                        int discarded$7 = -63;
                        tw.a(((jt) this).field_h.field_g, ((jt) this).field_h.field_c);
                        ((jt) this).field_h = null;
                        break L16;
                      }
                    }
                    ((jt) this).field_c.field_h = false;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
            }
            if (((jt) this).field_h != null) {
              ((jt) this).field_h.a((byte) 125);
              if (((jt) this).field_c.field_h) {
                ((jt) this).field_h.field_i = (float)mk.field_p;
                ((jt) this).field_h.field_a = (float)gd.field_m;
                break L0;
              } else {
                if (((jt) this).field_h.field_d) {
                  break L0;
                } else {
                  if (((jt) this).field_c.a((byte) -104)) {
                    break L0;
                  } else {
                    ((jt) this).field_c.field_r[((jt) this).field_h.field_g] = ((jt) this).field_h.field_c;
                    ((jt) this).field_h = null;
                    break L0;
                  }
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (var2 != null) {
          return ((ona) var2).field_wb;
        } else {
          return -1;
        }
    }

    private final void c(boolean param0) {
        ona var2 = null;
        int var3 = 0;
        kv stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        kv stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        kv stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        kv stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        kv stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        kv stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (param0) {
            break L0;
          } else {
            this.c(false);
            break L0;
          }
        }
        L1: {
          dg.g(374, 0, 266, 480);
          pea.field_k.e(-((jt) this).field_i + 640, 50);
          if (((jt) this).field_i >= 256) {
            L2: {
              ((jt) this).field_q.a(true, 7802);
              if (!((jt) this).field_q.field_vb.field_T) {
                lma.field_y.a(594, 160);
                break L2;
              } else {
                ada.field_l.a(594, 160);
                break L2;
              }
            }
            L3: {
              if (((jt) this).field_q.field_vb.field_T) {
                oaa.field_a.a(594, 403);
                break L3;
              } else {
                gha.field_b.a(594, 403);
                break L3;
              }
            }
            L4: {
              stackOut_10_0 = qt.field_m;
              stackOut_10_1 = 590;
              stackOut_10_2 = 132;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              if (((jt) this).field_k.field_T) {
                stackOut_12_0 = (kv) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = 16777215;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                break L4;
              } else {
                stackOut_11_0 = (kv) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 16764160;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_13_3 = stackOut_11_3;
                break L4;
              }
            }
            ((kv) (Object) stackIn_13_0).e(stackIn_13_1, stackIn_13_2, stackIn_13_3);
            if (cc.field_b.field_z != null) {
              dg.a(((jt) this).field_q.field_kb, ((jt) this).field_q.field_rb, ((jt) this).field_q.field_kb + ((jt) this).field_q.field_sb, ((jt) this).field_q.field_rb - -((jt) this).field_q.field_p);
              var2 = (ona) (Object) cc.field_b.field_z.b((byte) 90);
              L5: while (true) {
                if (var2 == null) {
                  dg.c();
                  break L1;
                } else {
                  jha.field_g.c(Integer.toString(var2.field_zb.field_f), ((jt) this).field_q.field_kb - -var2.field_kb - -28, cc.field_b.field_rb + (32 + var2.field_rb + ((jt) this).field_q.field_rb), 16777215, -1);
                  hfa.field_z.c(Integer.toString(var2.field_zb.field_f), ((jt) this).field_q.field_kb + (var2.field_kb - -28), cc.field_b.field_rb + (32 + var2.field_rb + ((jt) this).field_q.field_rb), 65793, -1);
                  var2 = (ona) (Object) cc.field_b.field_z.c(0);
                  continue L5;
                }
              }
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
    }

    private final void b(int param0, int param1) {
        sna var3_ref_sna = null;
        int var4 = BachelorFridge.field_y;
        if (param1 == 0) {
            ((jt) this).field_k.field_rb = 128;
            ((jt) this).field_k.field_kb = 587;
            var3_ref_sna = ((jt) this).field_k;
            ((jt) this).field_k.field_p = 20;
            var3_ref_sna.field_sb = 20;
        } else {
            if (param1 != 1) {
                ((jt) this).field_k.field_rb = -100;
                ((jt) this).field_k.field_kb = -100;
                var3_ref_sna = ((jt) this).field_k;
                ((jt) this).field_k.field_p = 20;
                var3_ref_sna.field_sb = 20;
            } else {
                ((jt) this).field_k.field_kb = 601;
                ((jt) this).field_k.field_rb = 8;
                var3_ref_sna = ((jt) this).field_k;
                ((jt) this).field_k.field_p = 20;
                var3_ref_sna.field_sb = 20;
            }
        }
        int var3 = -71 / ((1 - param0) / 43);
    }

    final int d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        var2 = -1;
        if (!param0) {
          L0: {
            var3 = (mk.field_p - 385) / 48;
            var4 = (gd.field_m + -85) / 36;
            if (var3 < 0) {
              break L0;
            } else {
              if (var3 >= 5) {
                break L0;
              } else {
                if (0 > var4) {
                  break L0;
                } else {
                  if (10 > var4) {
                    var2 = 5 * var4 + var3;
                    var5 = 0;
                    var6 = 0;
                    L1: while (true) {
                      if (((jt) this).field_c.field_r.length <= var6) {
                        return -1;
                      } else {
                        if (null != ((jt) this).field_c.field_r[var6]) {
                          if (var5 != var2) {
                            var5++;
                            var6++;
                            continue L1;
                          } else {
                            return var6;
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          return -1;
        } else {
          return 7;
        }
    }

    private final void c() {
        sna var3 = mka.a(13558251, 13558251, 13558251, (byte) -119, (po) (Object) jha.field_g, 13558251, 1118481, 13558251);
        var3.field_eb = wd.field_w;
        var3.field_A = bla.field_p;
        var3.field_db = op.field_I;
        ((jt) this).field_s = new sna("food", var3, 410, 138, 130, 140, "");
        ((jt) this).field_l = new sna("freezerbox", var3, 8, 6, 350, 74, "");
        ((jt) this).field_r = new sna("up", var3, 441, 159, 179, 16, "");
        ((jt) this).field_t = new sna("down", var3, 441, 371, 179, 16, "");
        ((jt) this).field_k = new sna();
        ((jt) this).field_k.a(var3, 116);
        ((jt) this).field_n = mka.a(12688481, 12688481, 12688481, (byte) -119, (po) (Object) jha.field_g, 12688481, 16777215, 12688481);
        ((jt) this).field_e = mka.a(12688481, 12688481, 12688481, (byte) -123, (po) (Object) jha.field_g, 12688481, 12688481, 12688481);
        ((jt) this).field_e.field_db = og.field_b;
        ((jt) this).field_e.field_A = og.field_b;
        ((jt) this).field_e.field_N = 1;
        ((jt) this).field_e.field_eb = og.field_b;
        ((jt) this).field_m = new gba("scrollbar", ((jt) this).field_e, new kv(8, 8), new kv(8, 8), ((jt) this).field_n, ((jt) this).field_e, true);
        cc.field_b = new sna();
        cc.field_b.a(506, 31407, 170, 442, 161);
        ((jt) this).field_q = new wl("basket", cc.field_b, ((jt) this).field_n, ((jt) this).field_m);
        ((jt) this).field_q.a(0, 154, false, 19, 261, 410, 198);
    }

    final int f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (0 < dm.field_f) {
            stackOut_2_0 = 50;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 5;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            var4 = -57 / ((param0 - -55) / 51);
            return var3;
          } else {
            if (null != ((jt) this).field_c.field_r[var4]) {
              var3++;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          ((jt) this).field_s.a(19842, true);
          if (((jt) this).field_s.field_T) {
            L1: {
              if (!af.field_a) {
                break L1;
              } else {
                uca.a(2, (byte) -57);
                break L1;
              }
            }
            au.field_c = 3;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          ((jt) this).field_l.a(19842, true);
          if (!af.field_a) {
            break L2;
          } else {
            if (((jt) this).field_l.field_T) {
              uca.a(5, (byte) 1);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          ((jt) this).field_k.a(19842, true);
          ((jt) this).field_q.a(19842, true);
          ((jt) this).field_q.a(vc.field_a * 32, param0, 32, 120);
          if (((jt) this).field_a != 1) {
            break L3;
          } else {
            if (((jt) this).field_b >= 260) {
              break L3;
            } else {
              ((jt) this).field_b = ((jt) this).field_b + 16;
              if (((jt) this).field_b >= 260) {
                uca.a(13, (byte) 2);
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L4: {
          if (((jt) this).field_a != 2) {
            break L4;
          } else {
            if (((jt) this).field_b <= 0) {
              break L4;
            } else {
              ((jt) this).field_b = ((jt) this).field_b - 16;
              if (0 >= ((jt) this).field_b) {
                uca.a(14, (byte) 110);
                break L4;
              } else {
                break L4;
              }
            }
          }
        }
        L5: {
          if (((jt) this).field_a != 0) {
            break L5;
          } else {
            if (((jt) this).field_i >= 256) {
              break L5;
            } else {
              ((jt) this).field_i = ((jt) this).field_i + 16;
              if (((jt) this).field_i >= 256) {
                uca.a(10, (byte) 102);
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L6: {
          if (2 != ((jt) this).field_a) {
            break L6;
          } else {
            if (((jt) this).field_i > 0) {
              ((jt) this).field_i = ((jt) this).field_i - 16;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          L8: {
            if (lf.field_c != 1) {
              break L8;
            } else {
              L9: {
                if (null == ((jt) this).field_h) {
                  break L9;
                } else {
                  if (((jt) this).field_h.field_d) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (null == ((jt) this).field_p) {
                  break L10;
                } else {
                  if (((jt) this).field_p.field_e) {
                    break L8;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                L12: {
                  if (((jt) this).field_a != 2) {
                    break L12;
                  } else {
                    if (((jt) this).field_s.field_R != 1) {
                      break L12;
                    } else {
                      if (ku.field_q) {
                        ((jt) this).field_a = 0;
                        qm.a(23, 7758);
                        this.b(90, ((jt) this).field_a);
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                L13: {
                  if (((jt) this).field_a != 1) {
                    break L13;
                  } else {
                    if (((jt) this).field_l.field_R != 1) {
                      break L13;
                    } else {
                      ((jt) this).field_a = 2;
                      qm.a(25, 7758);
                      this.b(62, ((jt) this).field_a);
                      break L11;
                    }
                  }
                }
                L14: {
                  if (((jt) this).field_l.field_R != 1) {
                    break L14;
                  } else {
                    if (iaa.field_a) {
                      ((jt) this).field_a = 1;
                      qm.a(26, 7758);
                      this.b(88, ((jt) this).field_a);
                      break L11;
                    } else {
                      break L14;
                    }
                  }
                }
                if (((jt) this).field_k.field_R != 1) {
                  break L11;
                } else {
                  if (sh.field_I) {
                    L15: {
                      if (((jt) this).field_a == 0) {
                        uca.a(11, (byte) -103);
                        qm.a(21, 7758);
                        break L15;
                      } else {
                        qm.a(25, 7758);
                        break L15;
                      }
                    }
                    ((jt) this).field_a = 2;
                    this.b(-43, ((jt) this).field_a);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              if (((jt) this).field_a == 0) {
                if (((jt) this).field_r.field_R != 1) {
                  if (((jt) this).field_t.field_R != 1) {
                    break L8;
                  } else {
                    ((jt) this).field_j = ((jt) this).field_j + 4;
                    if (((jt) this).field_j > 50) {
                      ((jt) this).field_j = 48;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                } else {
                  ((jt) this).field_j = ((jt) this).field_j - 4;
                  if (0 > ((jt) this).field_j) {
                    ((jt) this).field_j = 0;
                    break L8;
                  } else {
                    int discarded$4 = -23;
                    int discarded$5 = this.a();
                    break L7;
                  }
                }
              } else {
                break L8;
              }
            }
          }
          int discarded$6 = -23;
          int discarded$7 = this.a();
          break L7;
        }
    }

    public static void b() {
        field_g = null;
        field_f = null;
    }

    final void e(int param0) {
        if (param0 != -21060) {
            ((jt) this).field_j = 6;
        }
        if (((jt) this).field_a == 2) {
            if (((jt) this).field_b > 0) {
                ((jt) this).field_b = ((jt) this).field_b - 16;
                if (!(((jt) this).field_b > 0)) {
                    uca.a(14, (byte) -17);
                }
            }
        }
        if (2 == ((jt) this).field_a) {
            if (!(((jt) this).field_i <= 0)) {
                ((jt) this).field_i = ((jt) this).field_i - 16;
            }
        }
    }

    final void a(boolean param0, int[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (!param0) {
              cc.field_b.field_z = null;
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= ((jt) this).field_o.length) {
                  break L0;
                } else {
                  L2: {
                    ((jt) this).field_o[var3_int] = ((jt) this).field_o[var3_int] + param1[var3_int];
                    if (((jt) this).field_o[var3_int] == 0) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("jt.Q(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final int g(int param0) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        int var2 = dm.field_f <= 0 ? 5 : 50;
        if (param0 != 50) {
            ((jt) this).field_r = null;
        }
        for (var3 = 0; var2 > var3; var3++) {
            if (((jt) this).field_c.field_r[var3] == null) {
                return var3;
            }
        }
        return -1;
    }

    final boolean a(int param0) {
        if (mk.field_p > 372) {
            if (mk.field_p < 640) {
                return true;
            }
        }
        if (param0 != -22263) {
            return true;
        }
        return false;
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var3 = ((jt) this).field_j;
        L0: while (true) {
          if (var3 >= ((jt) this).field_o.length) {
            return;
          } else {
            if (param1 == var3) {
              var4 = var3 % 4;
              ((jt) this).field_p.field_c = 46 * var4 + (((jt) this).field_q.field_kb + cc.field_b.field_kb);
              var5 = var3 / 4;
              ((jt) this).field_p.field_a = 40 * var5 + (cc.field_b.field_rb + ((jt) this).field_q.field_rb);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void d(int param0) {
        ((jt) this).field_a = 2;
        this.b(-45, 2);
        if (param0 > -107) {
            ((jt) this).field_i = 64;
        }
    }

    final jfa b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        var2 = -1;
        var3 = (-385 + mk.field_p) / 46;
        var4 = (gd.field_m - 85) / 36;
        if (var3 >= 0) {
          if (5 >= var3) {
            var2 = var3 + 5 * var4;
            var6 = -77 % ((param0 - 42) / 63);
            var5 = 0;
            var7 = 0;
            L0: while (true) {
              if (var7 < ((jt) this).field_c.field_r.length) {
                if (((jt) this).field_c.field_r[var7] != null) {
                  if (var5 != var2) {
                    var5++;
                    var7++;
                    continue L0;
                  } else {
                    return ((jt) this).field_c.field_r[var7];
                  }
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    jt(ola param0) {
        ((jt) this).field_a = 2;
        try {
            ((jt) this).field_c = param0;
            ((jt) this).field_o = new int[50];
            int discarded$0 = 12716;
            this.c();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jt.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new jg();
    }
}
