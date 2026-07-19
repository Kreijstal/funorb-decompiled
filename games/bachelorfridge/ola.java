/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ola {
    wda[][] field_i;
    private mj field_f;
    private saa field_c;
    private eaa field_q;
    jfa[] field_r;
    static af field_p;
    private int field_d;
    ula field_j;
    int field_n;
    boolean field_h;
    private sna field_a;
    static wma field_g;
    jt field_k;
    sna field_s;
    eaa field_m;
    private int field_o;
    private int field_l;
    static ph field_e;
    private String field_b;

    final void a(boolean param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jfa var5 = null;
        L0: {
          L1: {
            var4 = BachelorFridge.field_y;
            if (1 != lf.field_c) {
              break L1;
            } else {
              if (this.field_h) {
                break L1;
              } else {
                if (this.a((byte) -77)) {
                  break L1;
                } else {
                  if (this.a(mk.field_p, gd.field_m, false)) {
                    var5 = this.a(mk.field_p, -4456, gd.field_m);
                    if (var5 != null) {
                      discarded$1 = this.b(-1, gd.field_m);
                      var5.a(false);
                      var5.g(0);
                      this.field_j = new ula(mk.field_p, gd.field_m, var5, var5.field_u, var5.field_l);
                      this.field_h = true;
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (0 != fia.field_t) {
            break L0;
          } else {
            if (!this.field_h) {
              break L0;
            } else {
              if (this.field_j != null) {
                L2: {
                  L3: {
                    var2 = this.field_k.g(50);
                    if (!this.e(-103)) {
                      break L3;
                    } else {
                      if ((var2 ^ -1) == 0) {
                        break L3;
                      } else {
                        if (null == this.field_r[var2]) {
                          qm.a(3, 7758);
                          this.field_r[var2] = this.field_j.field_c;
                          ik.a(this.field_j.field_g, this.field_j.field_c, -6622, var2);
                          this.field_j.field_c.field_v.a(false, 0, 0, true, -1);
                          this.field_j = null;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (this.a(this.field_j.field_c, gd.field_m, -19906, mk.field_p)) {
                    qm.a(2, 7758);
                    this.field_m.a(this.field_j.field_c, param0);
                    this.field_j = null;
                    break L2;
                  } else {
                    if (this.d(74)) {
                      if (this.field_c.field_s != null) {
                        break L2;
                      } else {
                        if (this.field_c.field_o > 0) {
                          break L2;
                        } else {
                          this.field_c.field_k = this.field_j.field_c;
                          this.field_c.field_s = new gaa(100, 150, 440, 160, this.f(83), this.field_c.field_k);
                          break L2;
                        }
                      }
                    } else {
                      if (null != this.field_c.field_s) {
                        break L2;
                      } else {
                        this.field_j.field_d = true;
                        break L2;
                      }
                    }
                  }
                }
                this.field_h = false;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L4: {
          if (this.field_j != null) {
            this.field_j.a((byte) 125);
            if (this.field_h) {
              this.field_j.field_a = (float)gd.field_m;
              this.field_j.field_i = (float)mk.field_p;
              break L4;
            } else {
              if (this.field_j.field_d) {
                break L4;
              } else {
                this.field_m.a(this.field_j.field_c, true);
                this.field_j = null;
                break L4;
              }
            }
          } else {
            break L4;
          }
        }
        this.a(-11);
        if (null != dc.field_y) {
          L5: {
            var2 = 0;
            if (param0) {
              break L5;
            } else {
              this.field_s = (sna) null;
              break L5;
            }
          }
          L6: while (true) {
            if (var2 >= this.field_i.length) {
              return;
            } else {
              var3 = 0;
              L7: while (true) {
                if (var3 >= this.field_i.length) {
                  var2++;
                  continue L6;
                } else {
                  if (null != this.field_i[var2][var3].field_f) {
                    if (dc.field_y[this.field_i[var2][var3].field_e].a(this.field_i[var2][var3].field_f.field_p, this.field_i[var2][var3].field_f.field_j, mk.field_p, gd.field_m)) {
                      uca.a(7, (byte) 119);
                      var3++;
                      continue L7;
                    } else {
                      var3++;
                      continue L7;
                    }
                  } else {
                    var3++;
                    continue L7;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void c(int param0) {
        sna var2 = mka.a(13558251, 13558251, 13558251, (byte) -119, jha.field_g, 13558251, 1118481, 13558251);
        if (param0 <= 40) {
            return;
        }
        var2.field_A = bla.field_p;
        var2.field_db = op.field_I;
        var2.field_eb = wd.field_w;
        this.field_s = new sna("shop", var2, 515, 8, 72, 70, "");
        this.field_a = new sna("arena", var2, 43, 333, 90, 80, "");
    }

    private final boolean e(int param0) {
        int var2 = 0;
        if (!iaa.field_a) {
          return false;
        } else {
          L0: {
            L1: {
              var2 = 30 % ((param0 - 6) / 58);
              if (mk.field_p < this.field_k.field_l.field_kb) {
                break L1;
              } else {
                if (this.field_k.field_l.field_kb + this.field_k.field_l.field_sb < mk.field_p) {
                  break L1;
                } else {
                  if (gd.field_m < this.field_k.field_l.field_rb) {
                    break L1;
                  } else {
                    if (this.field_k.field_l.field_p + this.field_k.field_l.field_rb >= gd.field_m) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (-377 <= (mk.field_p ^ -1)) {
              return false;
            } else {
              if (1 == this.field_k.field_a) {
                break L0;
              } else {
                return false;
              }
            }
          }
          return true;
        }
    }

    final void a(int param0, int param1) {
        int var4_int = 0;
        jfa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        es var8 = null;
        kv[] stackIn_4_0 = null;
        kv[] stackIn_5_0 = null;
        kv[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kv[] stackOut_3_0 = null;
        kv[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kv[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var7 = BachelorFridge.field_y;
        var8 = (es) ((Object) this.field_q.b((byte) 90));
        L0: while (true) {
          if (var8 == null) {
            L1: {
              gba.field_xb.e(10 - -param1, 75);
              ln.field_v.e(param1 + 14, 79);
              stackOut_3_0 = pja.field_b;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if ((-1 + this.field_m.g(0) ^ -1) == 0) {
                stackOut_5_0 = (kv[]) ((Object) stackIn_5_0);
                stackOut_5_1 = 9;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = (kv[]) ((Object) stackIn_4_0);
                stackOut_4_1 = -1 + this.field_m.g(0);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            L2: {
              ((kv) (Object) stackIn_6_0[stackIn_6_1]).e(28 + param1, 79);
              if (!this.field_a.field_T) {
                L3: {
                  if (8 < this.field_o) {
                    ve.field_l[0].e(param1 + 35, 358);
                    break L3;
                  } else {
                    if ((this.field_o ^ -1) >= -7) {
                      if ((this.field_o ^ -1) < -5) {
                        ve.field_l[2].e(35 + param1, 358);
                        break L3;
                      } else {
                        if (-3 <= (this.field_o ^ -1)) {
                          if (-1 > (this.field_o ^ -1)) {
                            ve.field_l[3].e(param1 + 35, 358);
                            break L3;
                          } else {
                            ve.field_l[4].e(param1 + 35, 358);
                            break L3;
                          }
                        } else {
                          ve.field_l[3].e(35 - -param1, 358);
                          break L3;
                        }
                      }
                    } else {
                      ve.field_l[1].e(35 - -param1, 358);
                      break L3;
                    }
                  }
                }
                this.field_o = this.field_o - 1;
                if ((this.field_o ^ -1) <= -1) {
                  break L2;
                } else {
                  this.field_o = 0;
                  break L2;
                }
              } else {
                L4: {
                  if (2 <= this.field_o) {
                    if (4 <= this.field_o) {
                      if ((this.field_o ^ -1) <= -7) {
                        if (this.field_o < 8) {
                          ve.field_l[0].e(param1 + 35, 358);
                          break L4;
                        } else {
                          if (10 <= this.field_o) {
                            ve.field_l[0].e(param1 + 35, 358);
                            break L4;
                          } else {
                            ve.field_l[1].e(param1 + 35, 358);
                            break L4;
                          }
                        }
                      } else {
                        ve.field_l[1].e(35 - -param1, 358);
                        break L4;
                      }
                    } else {
                      ve.field_l[2].e(param1 + 35, 358);
                      break L4;
                    }
                  } else {
                    ve.field_l[3].e(param1 + 35, 358);
                    break L4;
                  }
                }
                this.field_o = this.field_o + 1;
                if (this.field_o <= 10) {
                  break L2;
                } else {
                  this.field_o = 10;
                  break L2;
                }
              }
            }
            L5: {
              L6: {
                if (-2 == (vr.field_b % 200 ^ -1)) {
                  break L6;
                } else {
                  if (vr.field_b % 200 == 4) {
                    break L6;
                  } else {
                    if (!this.field_a.field_T) {
                      break L6;
                    } else {
                      ot.field_e.e(param1 + 48, 330);
                      break L5;
                    }
                  }
                }
              }
              rea.field_k.e(48 + param1, 330);
              break L5;
            }
            var4_int = 0;
            L7: while (true) {
              if (var4_int >= 6) {
                var4 = (jfa) ((Object) this.field_m.b((byte) 90));
                L8: while (true) {
                  if (var4 == null) {
                    var5 = 0;
                    L9: while (true) {
                      if (-7 >= (var5 ^ -1)) {
                        L10: {
                          this.field_k.a(param1, 8687);
                          if (this.field_j != null) {
                            L11: {
                              if (this.e(-122)) {
                                L12: {
                                  kaa.field_l[0].e(param1 + 0, 6);
                                  if (this.field_l < 2) {
                                    kaa.field_l[1].e(0 - -param1, 72);
                                    break L12;
                                  } else {
                                    if ((this.field_l ^ -1) <= -5) {
                                      if (-7 < (this.field_l ^ -1)) {
                                        kaa.field_l[2].e(0 - -param1, 72);
                                        break L12;
                                      } else {
                                        if (8 <= this.field_l) {
                                          kaa.field_l[1].e(0 - -param1, 72);
                                          break L12;
                                        } else {
                                          kaa.field_l[3].e(param1 + 0, 72);
                                          break L12;
                                        }
                                      }
                                    } else {
                                      kaa.field_l[3].e(param1 + 0, 72);
                                      break L12;
                                    }
                                  }
                                }
                                this.field_l = this.field_l + 1;
                                break L11;
                              } else {
                                this.field_l = 0;
                                break L11;
                              }
                            }
                            this.field_j.b(-17613);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L13: {
                          if (null != this.field_f) {
                            dg.g(0, 0, 640, 480);
                            this.field_f.a((byte) -115);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (param0 <= -123) {
                            break L14;
                          } else {
                            this.c(97);
                            break L14;
                          }
                        }
                        return;
                      } else {
                        var6 = 0;
                        L15: while (true) {
                          if ((var6 ^ -1) <= -11) {
                            var5++;
                            continue L9;
                          } else {
                            if (this.field_i[var5][var6].field_f != null) {
                              if ((this.field_i[var5][var6].field_f.field_n ^ -1) < -1) {
                                oo.field_q[-this.field_i[var5][var6].field_f.field_n + 24].e(param1 + (-6 + this.field_i[var5][var6].field_f.field_p), -32 + this.field_i[var5][var6].field_f.field_j);
                                var6++;
                                continue L15;
                              } else {
                                var6++;
                                continue L15;
                              }
                            } else {
                              var6++;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    nk.a(qa.field_k, param1 + (var4.field_n - -22), 9 + var4.field_k, 28, 18);
                    var4.a((byte) 83, param1);
                    var4 = (jfa) ((Object) this.field_m.c(0));
                    continue L8;
                  }
                }
              } else {
                var5 = 0;
                L16: while (true) {
                  if (-11 >= (var5 ^ -1)) {
                    var4_int++;
                    continue L7;
                  } else {
                    if (this.field_i[var4_int][var5].field_f != null) {
                      this.field_i[var4_int][var5].field_f.a(false, param1);
                      var5++;
                      continue L16;
                    } else {
                      var5++;
                      continue L16;
                    }
                  }
                }
              }
            }
          } else {
            var8.a(128, param1);
            var8 = (es) ((Object) this.field_q.c(0));
            continue L0;
          }
        }
    }

    final static void c(byte param0) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        mha var4 = null;
        nc var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        pf var28 = null;
        long[][] var35 = null;
        int[][] var36 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 <= -45) {
                break L1;
              } else {
                field_p = (af) null;
                break L1;
              }
            }
            L2: {
              var28 = ig.field_m;
              var2 = var28.b(16711935);
              if (var2 != 0) {
                if ((var2 ^ -1) != -2) {
                  cv.a(1, "HS1: " + nia.d((byte) -108), (Throwable) null);
                  vc.a((byte) -76);
                  break L2;
                } else {
                  var3 = var28.e((byte) 46);
                  var4_ref = (nc) ((Object) tb.field_c.b((byte) 90));
                  L3: while (true) {
                    L4: {
                      if (var4_ref == null) {
                        break L4;
                      } else {
                        if (var4_ref.field_j == var3) {
                          break L4;
                        } else {
                          var4_ref = (nc) ((Object) tb.field_c.c(0));
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref != null) {
                      var4_ref.a(false);
                      break L2;
                    } else {
                      vc.a((byte) -99);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                var3 = var28.e((byte) 70);
                var4 = (mha) ((Object) wba.field_g.b((byte) 90));
                L5: while (true) {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      if (var4.field_f == var3) {
                        break L6;
                      } else {
                        var4 = (mha) ((Object) wba.field_g.c(0));
                        continue L5;
                      }
                    }
                  }
                  if (var4 == null) {
                    vc.a((byte) -73);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    var5 = var28.b(16711935);
                    if (0 != var5) {
                      var6 = var4.field_h;
                      mi.field_l[0].field_e = cha.field_l;
                      mi.field_l[0].field_b = null;
                      var7 = var4.field_i;
                      mi.field_l[0].field_c = false;
                      var8_int = 1;
                      L7: while (true) {
                        if (var8_int >= var5) {
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var35 = new long[3][var6];
                          var36 = new int[3][var6 * var7];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var28.b(16711935);
                          if ((var18 ^ -1) < -1) {
                            var19 = 0;
                            L8: while (true) {
                              if (var19 < var18) {
                                L9: {
                                  var20 = var28.b(16711935);
                                  var21 = mi.field_l[var20].field_e;
                                  var22 = var28.c(-117);
                                  var24 = var28.field_g;
                                  if (var6 <= var19) {
                                    break L9;
                                  } else {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = mi.field_l[var20].field_b;
                                    var35[0][var12] = var22;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var25 >= var7) {
                                        var12++;
                                        break L9;
                                      } else {
                                        incrementValue$3 = var15;
                                        var15++;
                                        var36[0][incrementValue$3] = var28.f(81);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                                L11: {
                                  if (var21 == null) {
                                    break L11;
                                  } else {
                                    if (wb.a((byte) 52, var21)) {
                                      var8[1][var13] = cha.field_l;
                                      var9[1][var13] = null;
                                      var35[1][var13] = var22;
                                      var28.field_g = var24;
                                      var13++;
                                      var25 = 0;
                                      L12: while (true) {
                                        if (var7 <= var25) {
                                          break L11;
                                        } else {
                                          incrementValue$4 = var16;
                                          var16++;
                                          var36[1][incrementValue$4] = var28.f(-101);
                                          var25++;
                                          continue L12;
                                        }
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L13: {
                                  if (var6 <= var14) {
                                    break L13;
                                  } else {
                                    if (mi.field_l[var20].field_c) {
                                      break L13;
                                    } else {
                                      mi.field_l[var20].field_c = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = mi.field_l[var20].field_b;
                                      var35[2][var14] = var22;
                                      var14++;
                                      var28.field_g = var24;
                                      var25 = 0;
                                      L14: while (true) {
                                        if (var25 >= var7) {
                                          break L13;
                                        } else {
                                          incrementValue$5 = var17;
                                          var17++;
                                          var36[2][incrementValue$5] = var28.f(-127);
                                          var25++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                }
                                var19++;
                                continue L8;
                              } else {
                                var4.a(false);
                                break L2;
                              }
                            }
                          } else {
                            var4.a(false);
                            break L2;
                          }
                        } else {
                          L15: {
                            mi.field_l[var8_int].field_e = var28.g(-82);
                            mi.field_l[var8_int].field_c = false;
                            if (-2 == (var28.b(16711935) ^ -1)) {
                              mi.field_l[var8_int].field_b = var28.g(-60);
                              break L15;
                            } else {
                              mi.field_l[var8_int].field_b = null;
                              break L15;
                            }
                          }
                          var8_int++;
                          continue L7;
                        }
                      }
                    } else {
                      var4.a(false);
                      break L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ola.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void b(int param0) {
        if (param0 >= -45) {
            this.field_l = 124;
        }
        this.field_b = String.valueOf(50);
        this.field_b = this.field_b + ":: ";
        if (this.field_d < jha.field_g.a(this.field_b)) {
            this.field_d = this.field_d + 1;
        } else {
            this.field_d = -jha.field_g.a(this.field_b);
        }
    }

    final static void b(byte param0) {
        ep.a(17, 8192);
        if (param0 > 0) {
            field_g = (wma) null;
        }
    }

    final void e(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jfa var6 = null;
        var5 = BachelorFridge.field_y;
        if (null != this.field_f) {
          L0: {
            if (this.field_f.b(0) == 0) {
              this.field_f = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          var6 = (jfa) ((Object) this.field_m.b((byte) 90));
          L1: while (true) {
            if (var6 == null) {
              var3 = 0;
              L2: while (true) {
                if (6 <= var3) {
                  L3: {
                    this.b(-116);
                    if (param0 > 29) {
                      break L3;
                    } else {
                      this.field_k = (jt) null;
                      break L3;
                    }
                  }
                  return;
                } else {
                  var4 = 0;
                  L4: while (true) {
                    if ((var4 ^ -1) <= -11) {
                      var3++;
                      continue L2;
                    } else {
                      if (null != this.field_i[var3][var4].field_f) {
                        if (this.field_i[var3][var4].field_f.field_g) {
                          this.field_i[var3][var4].field_f.field_a = false;
                          var4++;
                          continue L4;
                        } else {
                          L5: {
                            this.field_i[var3][var4].field_f.b(24981);
                            if (-13 > (this.field_i[var3][var4].field_f.field_b ^ -1)) {
                              break L5;
                            } else {
                              if (!this.field_i[var3][var4].field_f.field_a) {
                                break L5;
                              } else {
                                L6: {
                                  L7: {
                                    if (-8 >= (this.field_m.g(0) ^ -1)) {
                                      break L7;
                                    } else {
                                      if (this.field_j != null) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  if (-9 >= (this.field_m.g(0) ^ -1)) {
                                    break L5;
                                  } else {
                                    if (null != this.field_j) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L8: {
                                  if (this.field_i[var3][var4].field_f.field_f) {
                                    break L8;
                                  } else {
                                    this.field_i[var3][var4].field_f.field_n = 24;
                                    break L8;
                                  }
                                }
                                this.field_i[var3][var4].field_f.field_f = true;
                                break L5;
                              }
                            }
                          }
                          if (0 >= this.field_i[var3][var4].field_f.field_b) {
                            if ((this.field_i[var3][var4].field_f.field_n ^ -1) >= -13) {
                              if (this.field_i[var3][var4].field_f.field_a) {
                                L9: {
                                  L10: {
                                    if (-8 >= (this.field_m.g(0) ^ -1)) {
                                      break L10;
                                    } else {
                                      if (null != this.field_j) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  if ((this.field_m.g(0) ^ -1) > -9) {
                                    if (this.field_j == null) {
                                      break L9;
                                    } else {
                                      var4++;
                                      continue L4;
                                    }
                                  } else {
                                    var4++;
                                    continue L4;
                                  }
                                }
                                qm.a(0, 7758);
                                this.field_m.a(new jfa(new rk(gfa.field_a[this.field_i[var3][var4].field_f.field_e]), var3, var4, this.field_i), true);
                                wf.a(3909, var3, this.field_i[var3][var4].field_f.field_e, (jfa) ((Object) this.field_m.a(6)), var4);
                                uca.a(9, (byte) 99);
                                this.field_q.a(new es(this.field_i[var3][var4].field_f.field_p, this.field_i[var3][var4].field_f.field_j, kla.a(6, m.field_a, -2147483648)), true);
                                this.field_i[var3][var4].field_f.field_a = false;
                                var4++;
                                continue L4;
                              } else {
                                var4++;
                                continue L4;
                              }
                            } else {
                              var4++;
                              continue L4;
                            }
                          } else {
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        var4++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } else {
              var6.d(108);
              var6 = (jfa) ((Object) this.field_m.c(0));
              continue L1;
            }
          }
        }
    }

    private final boolean d(int param0) {
        if (!(mka.field_j)) {
            return false;
        }
        int var2 = -24 / ((param0 - -54) / 43);
        if (d.field_H.field_kb <= mk.field_p) {
            if (d.field_H.field_sb + d.field_H.field_kb >= mk.field_p) {
                if (d.field_H.field_rb <= gd.field_m) {
                    if (gd.field_m <= d.field_H.field_p + d.field_H.field_rb) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          this.field_s.a(param0 ^ -19849, true);
          if (param0 == -11) {
            break L0;
          } else {
            this.field_h = true;
            break L0;
          }
        }
        L1: {
          this.field_a.a(19842, true);
          if (!this.field_a.field_T) {
            break L1;
          } else {
            L2: {
              if (af.field_a) {
                uca.a(6, (byte) -35);
                break L2;
              } else {
                break L2;
              }
            }
            au.field_c = 5;
            break L1;
          }
        }
        L3: {
          if (1 != this.field_a.field_R) {
            break L3;
          } else {
            if (gla.field_k) {
              L4: {
                L5: {
                  if (this.field_m.e(12917)) {
                    break L5;
                  } else {
                    L6: {
                      if (!bp.e(-29919)) {
                        break L6;
                      } else {
                        if (af.field_a) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    qa.d(123);
                    break L4;
                  }
                }
                L7: {
                  if (!bp.e(param0 + -29908)) {
                    break L7;
                  } else {
                    if (!af.field_a) {
                      this.field_f = new mj(100, 150, 440, 160, iv.field_i);
                      break L4;
                    } else {
                      break L7;
                    }
                  }
                }
                this.field_f = new mj(100, 150, 440, 160, vu.field_o);
                break L4;
              }
              uca.a(37, (byte) -115);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L8: {
          if (this.field_s.field_T) {
            L9: {
              if (!af.field_a) {
                break L9;
              } else {
                uca.a(1, (byte) 127);
                break L9;
              }
            }
            au.field_c = 2;
            break L8;
          } else {
            break L8;
          }
        }
        L10: {
          if (-2 != (this.field_s.field_R ^ -1)) {
            break L10;
          } else {
            if (this.field_k.field_a != 2) {
              break L10;
            } else {
              if (pka.field_f) {
                uca.a(30, (byte) -35);
                lla.a(true, (byte) 99, 0);
                iu.d(37);
                rs.a(true);
                sia.field_h = false;
                lg.a(true, 12, true);
                break L10;
              } else {
                break L10;
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, boolean param2) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (!param2) {
            break L0;
          } else {
            this.field_s = (sna) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-21 <= (param0 ^ -1)) {
              break L2;
            } else {
              if (param0 >= 355) {
                break L2;
              } else {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 >= 480) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    private final int b(int param0, int param1) {
        if (param0 == (this.field_n ^ -1)) {
            if (0 < param1) {
                if (!(-147 >= (param1 ^ -1))) {
                    return 0;
                }
            }
            if (-153 > (param1 ^ -1)) {
                if (!(-243 >= (param1 ^ -1))) {
                    return 1;
                }
            }
            if ((param1 ^ -1) < -235) {
                if (param1 < 334) {
                    return 2;
                }
            }
            if (param1 > 330) {
                if (!(430 <= param1)) {
                    return 3;
                }
            }
        }
        return -1;
    }

    final void a(byte param0, lu param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        it var5_ref_it = null;
        int var5 = 0;
        rk var6 = null;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (6 <= var3_int) {
                var3_int = param1.b(16711935);
                var4 = 0;
                L2: while (true) {
                  if (var3_int <= var4) {
                    var4 = param1.b(16711935);
                    this.field_m = new eaa();
                    if (param0 <= -115) {
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var6 = gka.a(param1, 255);
                          this.field_m.a(var6, true);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var5_ref_it = new it(param1);
                    this.field_i[var5_ref_it.field_h][var5_ref_it.field_m].field_f = var5_ref_it;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                var4 = 0;
                L4: while (true) {
                  if (var4 >= 10) {
                    var3_int++;
                    continue L1;
                  } else {
                    this.field_i[var3_int][var4] = new wda(param1);
                    var4++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("ola.T(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        if (this.field_j != null) {
            if (!(!this.field_j.field_d)) {
                return true;
            }
        }
        if (param0 >= -72) {
            return true;
        }
        if (this.field_k.field_h != null) {
            if (!(!this.field_k.field_h.field_d)) {
                return true;
            }
        }
        if (this.field_k.field_p != null) {
            if (this.field_k.field_p.field_e) {
                return true;
            }
        }
        return false;
    }

    final void a(boolean param0, saa param1) {
        int[] var6 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        try {
            this.field_c = param1;
            this.field_k = new jt((ola) (this));
            this.c(59);
            qa.field_k = new kv(49, 49);
            var6 = new int[256];
            var3 = var6;
            if (param0) {
                field_g = (wma) null;
            }
            for (var4 = 0; 256 > var4; var4++) {
                var6[var4] = var4 * 65793;
            }
            qa.field_k.b();
            dg.a(400, 400, 384, 77, var3);
            hga.field_U.a((byte) 122);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ola.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(jfa param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if ((this.field_m.g(0) ^ -1) == -9) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = (param3 + -10) / 56;
              var6 = (-84 + param1) / 39;
              if ((var5_int ^ -1) <= -1) {
                if (-7 >= (var5_int ^ -1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var6 < 0) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if ((var6 ^ -1) <= -11) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L1: {
                        param0.field_o = null;
                        param0.field_l = var6;
                        param0.field_u = var5_int;
                        param0.field_n = param0.c((byte) -116);
                        if (param2 == -19906) {
                          break L1;
                        } else {
                          discarded$2 = this.b(70, -107);
                          break L1;
                        }
                      }
                      param0.field_k = param0.b(true);
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("ola.N(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  return stackIn_21_0 != 0;
                }
              }
            }
          }
        }
    }

    final void a(byte param0, ola param1) {
        int var3_int = 0;
        rk var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            this.field_i = param1.field_i;
            var3_int = 0;
            if (param0 >= 74) {
              L1: while (true) {
                if (6 <= var3_int) {
                  this.field_m = new eaa();
                  var3 = (rk) ((Object) param1.field_m.b((byte) 90));
                  L2: while (true) {
                    if (var3 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      this.field_m.a(new jfa(var3, kla.a(6, var3.field_p, -2147483648), kla.a(10, var3.field_p, -2147483648), this.field_i), true);
                      var3 = (rk) ((Object) param1.field_m.c(0));
                      continue L2;
                    }
                  }
                } else {
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= 10) {
                      var3_int++;
                      continue L1;
                    } else {
                      L4: {
                        if (this.field_i[var3_int][var4].field_f != null) {
                          this.field_i[var3_int][var4].field_f.a((byte) -51);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("ola.U(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void d(byte param0) {
        field_p = null;
        if (param0 != -120) {
            return;
        }
        field_e = null;
        field_g = null;
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        it var7 = null;
        int var8 = 0;
        saa var9 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          var5 = (param2 + -10) / 56;
          var6 = (-84 + param1) / 39;
          if (-1 < (var5 ^ -1)) {
            break L0;
          } else {
            if (-7 >= (var5 ^ -1)) {
              break L0;
            } else {
              if (-1 >= (var6 ^ -1)) {
                if (-11 < (var6 ^ -1)) {
                  L1: {
                    if ((this.field_i[var5][var6].field_e ^ -1) == -2) {
                      break L1;
                    } else {
                      if ((this.field_i[var5][var6].field_e ^ -1) == -3) {
                        break L1;
                      } else {
                        L2: while (true) {
                          if (-11 >= (var6 ^ -1)) {
                            break L1;
                          } else {
                            if (this.field_i[var5][var6].field_e == 1) {
                              break L1;
                            } else {
                              if (2 == this.field_i[var5][var6].field_e) {
                                break L1;
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L3: {
                    var7 = new it(var5, var6, param3);
                    if (param0 == -89) {
                      break L3;
                    } else {
                      var9 = (saa) null;
                      this.a(true, (saa) null);
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (this.field_i[var5][var6].field_f == null) {
                        break L5;
                      } else {
                        if (this.field_i[var5][var6].field_f.field_a) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    sm.a(false, param3, var5, var6);
                    break L4;
                  }
                  return this.field_i[var5][var6].a(false, var7);
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    final jfa a(int param0, int param1, int param2) {
        int var5 = BachelorFridge.field_y;
        jfa var4 = (jfa) ((Object) this.field_m.b((byte) 90));
        while (var4 != null) {
            if (!(!var4.a(jc.field_r, (byte) 119, nfa.field_a))) {
                return var4;
            }
            var4 = (jfa) ((Object) this.field_m.c(0));
        }
        if (param1 == -4456) {
            return null;
        }
        jfa discarded$0 = this.a(-48, -94, 71);
        return null;
    }

    private final boolean f(int param0) {
        int var2 = this.field_m.g(0) - (-this.field_k.f(62) - 1);
        int var3 = -54 % ((-16 - param0) / 41);
        return (var2 ^ -1) < -5 ? true : false;
    }

    public ola() {
        this.field_n = 0;
        this.field_r = new jfa[50];
        this.field_i = fs.a(1);
        this.field_m = new eaa();
        this.field_q = new eaa();
    }

    static {
    }
}
