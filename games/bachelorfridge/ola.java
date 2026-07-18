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
              if (((ola) this).field_h) {
                break L1;
              } else {
                if (((ola) this).a((byte) -77)) {
                  break L1;
                } else {
                  if (this.a(mk.field_p, gd.field_m, false)) {
                    var5 = ((ola) this).a(mk.field_p, -4456, gd.field_m);
                    if (var5 != null) {
                      int discarded$3 = this.b(-1, gd.field_m);
                      var5.a(false);
                      var5.g(0);
                      ((ola) this).field_j = new ula(mk.field_p, gd.field_m, var5, var5.field_u, var5.field_l);
                      ((ola) this).field_h = true;
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
            if (!((ola) this).field_h) {
              break L0;
            } else {
              if (((ola) this).field_j != null) {
                L2: {
                  L3: {
                    var2 = ((ola) this).field_k.g(50);
                    if (!this.e(-103)) {
                      break L3;
                    } else {
                      if (var2 == -1) {
                        break L3;
                      } else {
                        if (null == ((ola) this).field_r[var2]) {
                          qm.a(3, 7758);
                          ((ola) this).field_r[var2] = ((ola) this).field_j.field_c;
                          ik.a(((ola) this).field_j.field_g, ((ola) this).field_j.field_c, -6622, var2);
                          ((ola) this).field_j.field_c.field_v.a(false, 0, 0, true, -1);
                          ((ola) this).field_j = null;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (((ola) this).a(((ola) this).field_j.field_c, gd.field_m, -19906, mk.field_p)) {
                    qm.a(2, 7758);
                    ((ola) this).field_m.a((bw) (Object) ((ola) this).field_j.field_c, param0);
                    ((ola) this).field_j = null;
                    break L2;
                  } else {
                    if (this.d(74)) {
                      if (((ola) this).field_c.field_s != null) {
                        break L2;
                      } else {
                        if (((ola) this).field_c.field_o > 0) {
                          break L2;
                        } else {
                          ((ola) this).field_c.field_k = ((ola) this).field_j.field_c;
                          int discarded$4 = 83;
                          ((ola) this).field_c.field_s = new gaa(100, 150, 440, 160, this.f(), ((ola) this).field_c.field_k);
                          break L2;
                        }
                      }
                    } else {
                      if (null != ((ola) this).field_c.field_s) {
                        break L2;
                      } else {
                        ((ola) this).field_j.field_d = true;
                        break L2;
                      }
                    }
                  }
                }
                ((ola) this).field_h = false;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L4: {
          if (((ola) this).field_j != null) {
            ((ola) this).field_j.a((byte) 125);
            if (((ola) this).field_h) {
              ((ola) this).field_j.field_a = (float)gd.field_m;
              ((ola) this).field_j.field_i = (float)mk.field_p;
              break L4;
            } else {
              if (((ola) this).field_j.field_d) {
                break L4;
              } else {
                ((ola) this).field_m.a((bw) (Object) ((ola) this).field_j.field_c, true);
                ((ola) this).field_j = null;
                break L4;
              }
            }
          } else {
            break L4;
          }
        }
        int discarded$5 = -11;
        this.a();
        if (null != dc.field_y) {
          L5: {
            var2 = 0;
            if (param0) {
              break L5;
            } else {
              ((ola) this).field_s = null;
              break L5;
            }
          }
          L6: while (true) {
            if (var2 >= ((ola) this).field_i.length) {
              return;
            } else {
              var3 = 0;
              L7: while (true) {
                if (var3 >= ((ola) this).field_i.length) {
                  var2++;
                  continue L6;
                } else {
                  if (null != ((ola) this).field_i[var2][var3].field_f) {
                    if (dc.field_y[((ola) this).field_i[var2][var3].field_e].a(((ola) this).field_i[var2][var3].field_f.field_p, ((ola) this).field_i[var2][var3].field_f.field_j, mk.field_p, gd.field_m)) {
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
        sna var2 = mka.a(13558251, 13558251, 13558251, (byte) -119, (po) (Object) jha.field_g, 13558251, 1118481, 13558251);
        if (param0 <= 40) {
            return;
        }
        var2.field_A = bla.field_p;
        var2.field_db = op.field_I;
        var2.field_eb = wd.field_w;
        ((ola) this).field_s = new sna("shop", var2, 515, 8, 72, 70, "");
        ((ola) this).field_a = new sna("arena", var2, 43, 333, 90, 80, "");
    }

    private final boolean e(int param0) {
        int var2 = 0;
        if (!iaa.field_a) {
          return false;
        } else {
          L0: {
            L1: {
              var2 = 30 % ((param0 - 6) / 58);
              if (mk.field_p < ((ola) this).field_k.field_l.field_kb) {
                break L1;
              } else {
                if (((ola) this).field_k.field_l.field_kb + ((ola) this).field_k.field_l.field_sb < mk.field_p) {
                  break L1;
                } else {
                  if (gd.field_m < ((ola) this).field_k.field_l.field_rb) {
                    break L1;
                  } else {
                    if (((ola) this).field_k.field_l.field_p + ((ola) this).field_k.field_l.field_rb >= gd.field_m) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            if (mk.field_p <= 376) {
              return false;
            } else {
              if (1 == ((ola) this).field_k.field_a) {
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
        var8 = (es) (Object) ((ola) this).field_q.b((byte) 90);
        L0: while (true) {
          if (var8 == null) {
            L1: {
              gba.field_xb.e(10 - -param1, 75);
              ln.field_v.e(param1 + 14, 79);
              stackOut_3_0 = pja.field_b;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (-1 + ((ola) this).field_m.g(0) == -1) {
                stackOut_5_0 = (kv[]) (Object) stackIn_5_0;
                stackOut_5_1 = 9;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = (kv[]) (Object) stackIn_4_0;
                stackOut_4_1 = -1 + ((ola) this).field_m.g(0);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            L2: {
              ((kv) (Object) stackIn_6_0[stackIn_6_1]).e(28 + param1, 79);
              if (!((ola) this).field_a.field_T) {
                L3: {
                  if (8 < ((ola) this).field_o) {
                    ve.field_l[0].e(param1 + 35, 358);
                    break L3;
                  } else {
                    if (((ola) this).field_o <= 6) {
                      if (((ola) this).field_o > 4) {
                        ve.field_l[2].e(35 + param1, 358);
                        break L3;
                      } else {
                        if (((ola) this).field_o <= 2) {
                          if (((ola) this).field_o > 0) {
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
                ((ola) this).field_o = ((ola) this).field_o - 1;
                if (((ola) this).field_o >= 0) {
                  break L2;
                } else {
                  ((ola) this).field_o = 0;
                  break L2;
                }
              } else {
                L4: {
                  if (2 <= ((ola) this).field_o) {
                    if (4 <= ((ola) this).field_o) {
                      if (((ola) this).field_o >= 6) {
                        if (((ola) this).field_o < 8) {
                          ve.field_l[0].e(param1 + 35, 358);
                          break L4;
                        } else {
                          if (10 <= ((ola) this).field_o) {
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
                ((ola) this).field_o = ((ola) this).field_o + 1;
                if (((ola) this).field_o <= 10) {
                  break L2;
                } else {
                  ((ola) this).field_o = 10;
                  break L2;
                }
              }
            }
            L5: {
              L6: {
                if (vr.field_b % 200 == 1) {
                  break L6;
                } else {
                  if (vr.field_b % 200 == 4) {
                    break L6;
                  } else {
                    if (!((ola) this).field_a.field_T) {
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
                var4 = (jfa) (Object) ((ola) this).field_m.b((byte) 90);
                L8: while (true) {
                  if (var4 == null) {
                    var5 = 0;
                    L9: while (true) {
                      if (var5 >= 6) {
                        L10: {
                          ((ola) this).field_k.a(param1, 8687);
                          if (((ola) this).field_j != null) {
                            L11: {
                              if (this.e(-122)) {
                                L12: {
                                  kaa.field_l[0].e(param1, 6);
                                  if (((ola) this).field_l < 2) {
                                    kaa.field_l[1].e(0 - -param1, 72);
                                    break L12;
                                  } else {
                                    if (((ola) this).field_l >= 4) {
                                      if (((ola) this).field_l < 6) {
                                        kaa.field_l[2].e(0 - -param1, 72);
                                        break L12;
                                      } else {
                                        if (8 <= ((ola) this).field_l) {
                                          kaa.field_l[1].e(0 - -param1, 72);
                                          break L12;
                                        } else {
                                          kaa.field_l[3].e(param1, 72);
                                          break L12;
                                        }
                                      }
                                    } else {
                                      kaa.field_l[3].e(param1, 72);
                                      break L12;
                                    }
                                  }
                                }
                                ((ola) this).field_l = ((ola) this).field_l + 1;
                                break L11;
                              } else {
                                ((ola) this).field_l = 0;
                                break L11;
                              }
                            }
                            ((ola) this).field_j.b(-17613);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L13: {
                          if (null != ((ola) this).field_f) {
                            dg.g(0, 0, 640, 480);
                            ((ola) this).field_f.a((byte) -115);
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
                          if (var6 >= 10) {
                            var5++;
                            continue L9;
                          } else {
                            L16: {
                              if (((ola) this).field_i[var5][var6].field_f == null) {
                                break L16;
                              } else {
                                if (((ola) this).field_i[var5][var6].field_f.field_n <= 0) {
                                  break L16;
                                } else {
                                  oo.field_q[-((ola) this).field_i[var5][var6].field_f.field_n + 24].e(param1 + (-6 + ((ola) this).field_i[var5][var6].field_f.field_p), -32 + ((ola) this).field_i[var5][var6].field_f.field_j);
                                  break L16;
                                }
                              }
                            }
                            var6++;
                            continue L15;
                          }
                        }
                      }
                    }
                  } else {
                    nk.a(qa.field_k, param1 + (var4.field_n - -22), 9 + var4.field_k, 28, 18);
                    var4.a((byte) 83, param1);
                    var4 = (jfa) (Object) ((ola) this).field_m.c(0);
                    continue L8;
                  }
                }
              } else {
                var5 = 0;
                L17: while (true) {
                  if (var5 >= 10) {
                    var4_int++;
                    continue L7;
                  } else {
                    L18: {
                      if (((ola) this).field_i[var4_int][var5].field_f == null) {
                        break L18;
                      } else {
                        ((ola) this).field_i[var4_int][var5].field_f.a(false, param1);
                        break L18;
                      }
                    }
                    var5++;
                    continue L17;
                  }
                }
              }
            }
          } else {
            var8.a(128, param1);
            var8 = (es) (Object) ((ola) this).field_q.c(0);
            continue L0;
          }
        }
    }

    final static void c() {
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
        RuntimeException decompiledCaughtException = null;
        var26 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var28 = ig.field_m;
              var2 = var28.b(16711935);
              if (var2 != 0) {
                if (var2 != 1) {
                  cv.a(1, "HS1: " + nia.d((byte) -108), (Throwable) null);
                  vc.a((byte) -76);
                  break L1;
                } else {
                  var3 = var28.e((byte) 46);
                  var4_ref = (nc) (Object) tb.field_c.b((byte) 90);
                  L2: while (true) {
                    L3: {
                      if (var4_ref == null) {
                        break L3;
                      } else {
                        if (var4_ref.field_j == var3) {
                          break L3;
                        } else {
                          var4_ref = (nc) (Object) tb.field_c.c(0);
                          continue L2;
                        }
                      }
                    }
                    if (var4_ref != null) {
                      var4_ref.a(false);
                      break L1;
                    } else {
                      vc.a((byte) -99);
                      return;
                    }
                  }
                }
              } else {
                var3 = var28.e((byte) 70);
                var4 = (mha) (Object) wba.field_g.b((byte) 90);
                L4: while (true) {
                  L5: {
                    if (var4 == null) {
                      break L5;
                    } else {
                      if (var4.field_f == var3) {
                        break L5;
                      } else {
                        var4 = (mha) (Object) wba.field_g.c(0);
                        continue L4;
                      }
                    }
                  }
                  if (var4 == null) {
                    vc.a((byte) -73);
                    return;
                  } else {
                    var5 = var28.b(16711935);
                    if (0 != var5) {
                      var6 = var4.field_h;
                      mi.field_l[0].field_e = cha.field_l;
                      mi.field_l[0].field_b = null;
                      var7 = var4.field_i;
                      mi.field_l[0].field_c = false;
                      var8_int = 1;
                      L6: while (true) {
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
                          if (var18 > 0) {
                            var19 = 0;
                            L7: while (true) {
                              if (var19 < var18) {
                                L8: {
                                  var20 = var28.b(16711935);
                                  var21 = mi.field_l[var20].field_e;
                                  var22 = var28.c(-117);
                                  var24 = var28.field_g;
                                  if (var6 <= var19) {
                                    break L8;
                                  } else {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = mi.field_l[var20].field_b;
                                    var35[0][var12] = var22;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        var12++;
                                        break L8;
                                      } else {
                                        int incrementValue$3 = var15;
                                        var15++;
                                        var36[0][incrementValue$3] = var28.f(81);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if (var21 == null) {
                                    break L10;
                                  } else {
                                    if (wb.a((byte) 52, var21)) {
                                      var8[1][var13] = cha.field_l;
                                      var9[1][var13] = null;
                                      var35[1][var13] = var22;
                                      var28.field_g = var24;
                                      var13++;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var7 <= var25) {
                                          break L10;
                                        } else {
                                          int incrementValue$4 = var16;
                                          var16++;
                                          var36[1][incrementValue$4] = var28.f(-101);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                L12: {
                                  if (var6 <= var14) {
                                    break L12;
                                  } else {
                                    if (mi.field_l[var20].field_c) {
                                      break L12;
                                    } else {
                                      mi.field_l[var20].field_c = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = mi.field_l[var20].field_b;
                                      var35[2][var14] = var22;
                                      var14++;
                                      var28.field_g = var24;
                                      var25 = 0;
                                      L13: while (true) {
                                        if (var25 >= var7) {
                                          break L12;
                                        } else {
                                          int incrementValue$5 = var17;
                                          var17++;
                                          var36[2][incrementValue$5] = var28.f(-127);
                                          var25++;
                                          continue L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                var19++;
                                continue L7;
                              } else {
                                var4.a(false);
                                break L1;
                              }
                            }
                          } else {
                            var4.a(false);
                            break L1;
                          }
                        } else {
                          L14: {
                            mi.field_l[var8_int].field_e = var28.g(-82);
                            mi.field_l[var8_int].field_c = false;
                            if (var28.b(16711935) == 1) {
                              mi.field_l[var8_int].field_b = var28.g(-60);
                              break L14;
                            } else {
                              mi.field_l[var8_int].field_b = null;
                              break L14;
                            }
                          }
                          var8_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var4.a(false);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "ola.H(" + -60 + ')');
        }
    }

    private final void b(int param0) {
        ((ola) this).field_b = String.valueOf(50);
        ((ola) this).field_b = ((ola) this).field_b + ":: ";
        if (((ola) this).field_d < jha.field_g.a(((ola) this).field_b)) {
            ((ola) this).field_d = ((ola) this).field_d + 1;
        } else {
            ((ola) this).field_d = -jha.field_g.a(((ola) this).field_b);
        }
    }

    final static void b() {
        ep.a(17, 8192);
    }

    final void e(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jfa var6 = null;
        var5 = BachelorFridge.field_y;
        if (null != ((ola) this).field_f) {
          L0: {
            if (((ola) this).field_f.b(0) == 0) {
              ((ola) this).field_f = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          var6 = (jfa) (Object) ((ola) this).field_m.b((byte) 90);
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
                      ((ola) this).field_k = null;
                      break L3;
                    }
                  }
                  return;
                } else {
                  var4 = 0;
                  L4: while (true) {
                    if (var4 >= 10) {
                      var3++;
                      continue L2;
                    } else {
                      if (null != ((ola) this).field_i[var3][var4].field_f) {
                        if (((ola) this).field_i[var3][var4].field_f.field_g) {
                          ((ola) this).field_i[var3][var4].field_f.field_a = false;
                          var4++;
                          continue L4;
                        } else {
                          L5: {
                            ((ola) this).field_i[var3][var4].field_f.b(24981);
                            if (-13 > ((ola) this).field_i[var3][var4].field_f.field_b) {
                              break L5;
                            } else {
                              if (!((ola) this).field_i[var3][var4].field_f.field_a) {
                                break L5;
                              } else {
                                L6: {
                                  L7: {
                                    if (-8 <= ((ola) this).field_m.g(0)) {
                                      break L7;
                                    } else {
                                      if (((ola) this).field_j != null) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  if (((ola) this).field_m.g(0) >= 8) {
                                    break L5;
                                  } else {
                                    if (null != ((ola) this).field_j) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L8: {
                                  if (((ola) this).field_i[var3][var4].field_f.field_f) {
                                    break L8;
                                  } else {
                                    ((ola) this).field_i[var3][var4].field_f.field_n = 24;
                                    break L8;
                                  }
                                }
                                ((ola) this).field_i[var3][var4].field_f.field_f = true;
                                break L5;
                              }
                            }
                          }
                          if (0 >= ((ola) this).field_i[var3][var4].field_f.field_b) {
                            if (((ola) this).field_i[var3][var4].field_f.field_n >= -13) {
                              if (((ola) this).field_i[var3][var4].field_f.field_a) {
                                L9: {
                                  L10: {
                                    if (-8 <= ((ola) this).field_m.g(0)) {
                                      break L10;
                                    } else {
                                      if (null != ((ola) this).field_j) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  if (((ola) this).field_m.g(0) < 8) {
                                    if (((ola) this).field_j == null) {
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
                                ((ola) this).field_m.a((bw) (Object) new jfa(new rk(gfa.field_a[((ola) this).field_i[var3][var4].field_f.field_e]), var3, var4, ((ola) this).field_i), true);
                                wf.a(3909, var3, ((ola) this).field_i[var3][var4].field_f.field_e, (jfa) (Object) ((ola) this).field_m.a(6), var4);
                                uca.a(9, (byte) 99);
                                ((ola) this).field_q.a((bw) (Object) new es(((ola) this).field_i[var3][var4].field_f.field_p, ((ola) this).field_i[var3][var4].field_f.field_j, kla.a(6, m.field_a, -2147483648)), true);
                                ((ola) this).field_i[var3][var4].field_f.field_a = false;
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
              var6 = (jfa) (Object) ((ola) this).field_m.c(0);
              continue L1;
            }
          }
        }
    }

    private final boolean d(int param0) {
        if (!(mka.field_j)) {
            return false;
        }
        int var2 = -12;
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

    private final void a() {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          ((ola) this).field_s.a(19842, true);
          ((ola) this).field_a.a(19842, true);
          if (!((ola) this).field_a.field_T) {
            break L0;
          } else {
            L1: {
              if (af.field_a) {
                uca.a(6, (byte) -35);
                break L1;
              } else {
                break L1;
              }
            }
            au.field_c = 5;
            break L0;
          }
        }
        L2: {
          if (1 != ((ola) this).field_a.field_R) {
            break L2;
          } else {
            if (gla.field_k) {
              L3: {
                L4: {
                  if (((ola) this).field_m.e(12917)) {
                    break L4;
                  } else {
                    L5: {
                      if (!bp.e(-29919)) {
                        break L5;
                      } else {
                        if (af.field_a) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    int discarded$1 = 123;
                    qa.d();
                    break L3;
                  }
                }
                L6: {
                  if (!bp.e(-29919)) {
                    break L6;
                  } else {
                    if (!af.field_a) {
                      ((ola) this).field_f = new mj(100, 150, 440, 160, iv.field_i);
                      break L3;
                    } else {
                      break L6;
                    }
                  }
                }
                ((ola) this).field_f = new mj(100, 150, 440, 160, vu.field_o);
                break L3;
              }
              uca.a(37, (byte) -115);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L7: {
          if (((ola) this).field_s.field_T) {
            L8: {
              if (!af.field_a) {
                break L8;
              } else {
                uca.a(1, (byte) 127);
                break L8;
              }
            }
            au.field_c = 2;
            break L7;
          } else {
            break L7;
          }
        }
        L9: {
          if (((ola) this).field_s.field_R != 1) {
            break L9;
          } else {
            if (((ola) this).field_k.field_a != 2) {
              break L9;
            } else {
              if (pka.field_f) {
                uca.a(30, (byte) -35);
                lla.a(true, (byte) 99, 0);
                iu.d(37);
                rs.a(true);
                sia.field_h = false;
                lg.a(true, 12, true);
                break L9;
              } else {
                break L9;
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1, boolean param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (param0 <= 20) {
              break L1;
            } else {
              if (param0 >= 355) {
                break L1;
              } else {
                if (param1 <= 0) {
                  break L1;
                } else {
                  if (param1 >= 480) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final int b(int param0, int param1) {
        if (param0 == ~((ola) this).field_n) {
            if (0 < param1) {
                if (!(param1 >= 146)) {
                    return 0;
                }
            }
            if (param1 > 152) {
                if (!(param1 >= 242)) {
                    return 1;
                }
            }
            if (param1 > 234) {
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
                    ((ola) this).field_m = new eaa();
                    if (param0 <= -115) {
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4) {
                          break L0;
                        } else {
                          int discarded$5 = 255;
                          var6 = gka.a(param1);
                          ((ola) this).field_m.a((bw) (Object) var6, true);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var5_ref_it = new it(param1);
                    ((ola) this).field_i[var5_ref_it.field_h][var5_ref_it.field_m].field_f = var5_ref_it;
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
                    ((ola) this).field_i[var3_int][var4] = new wda(param1);
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
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ola.T(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final boolean a(byte param0) {
        if (((ola) this).field_j != null) {
            if (!(!((ola) this).field_j.field_d)) {
                return true;
            }
        }
        if (param0 >= -72) {
            return true;
        }
        if (((ola) this).field_k.field_h != null) {
            if (!(!((ola) this).field_k.field_h.field_d)) {
                return true;
            }
        }
        if (((ola) this).field_k.field_p != null) {
            if (((ola) this).field_k.field_p.field_e) {
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
            ((ola) this).field_c = param1;
            ((ola) this).field_k = new jt((ola) this);
            this.c(59);
            qa.field_k = new kv(49, 49);
            var6 = new int[256];
            var3 = var6;
            if (param0) {
                field_g = null;
            }
            for (var4 = 0; 256 > var4; var4++) {
                var6[var4] = var4 * 65793;
            }
            qa.field_k.b();
            dg.a(400, 400, 384, 77, var3);
            hga.field_U.a((byte) 122);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ola.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(jfa param0, int param1, int param2, int param3) {
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
            if (((ola) this).field_m.g(0) == 8) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5_int = (param3 + -10) / 56;
              var6 = (-84 + param1) / 39;
              if (var5_int >= 0) {
                if (var5_int >= 6) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  if (var6 < 0) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    if (var6 >= 10) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    } else {
                      L1: {
                        param0.field_o = null;
                        param0.field_l = var6;
                        param0.field_u = var5_int;
                        param0.field_n = param0.c((byte) -116);
                        if (param2 == -19906) {
                          break L1;
                        } else {
                          int discarded$2 = this.b(70, -107);
                          break L1;
                        }
                      }
                      param0.field_k = param0.b(true);
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("ola.N(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_21_0 != 0;
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
            ((ola) this).field_i = param1.field_i;
            var3_int = 0;
            if (param0 >= 74) {
              L1: while (true) {
                if (6 <= var3_int) {
                  ((ola) this).field_m = new eaa();
                  var3 = (rk) (Object) param1.field_m.b((byte) 90);
                  L2: while (true) {
                    if (var3 == null) {
                      break L0;
                    } else {
                      ((ola) this).field_m.a((bw) (Object) new jfa(var3, kla.a(6, var3.field_p, -2147483648), kla.a(10, var3.field_p, -2147483648), ((ola) this).field_i), true);
                      var3 = (rk) (Object) param1.field_m.c(0);
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
                        if (((ola) this).field_i[var3_int][var4].field_f != null) {
                          ((ola) this).field_i[var3_int][var4].field_f.a((byte) -51);
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
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("ola.U(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    public static void d() {
        field_p = null;
        field_e = null;
        field_g = null;
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        it var7 = null;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          var5 = (param2 + -10) / 56;
          var6 = (-84 + param1) / 39;
          if (var5 < 0) {
            break L0;
          } else {
            if (var5 >= 6) {
              break L0;
            } else {
              if (var6 >= 0) {
                if (var6 < 10) {
                  L1: {
                    if (((ola) this).field_i[var5][var6].field_e == 1) {
                      break L1;
                    } else {
                      if (((ola) this).field_i[var5][var6].field_e == 2) {
                        break L1;
                      } else {
                        L2: while (true) {
                          if (var6 >= 10) {
                            break L1;
                          } else {
                            if (((ola) this).field_i[var5][var6].field_e == 1) {
                              break L1;
                            } else {
                              if (2 == ((ola) this).field_i[var5][var6].field_e) {
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
                      var9 = null;
                      ((ola) this).a(true, (saa) null);
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (((ola) this).field_i[var5][var6].field_f == null) {
                        break L5;
                      } else {
                        if (((ola) this).field_i[var5][var6].field_f.field_a) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    sm.a(false, param3, var5, var6);
                    break L4;
                  }
                  return ((ola) this).field_i[var5][var6].a(false, var7);
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
        jfa var4 = (jfa) (Object) ((ola) this).field_m.b((byte) 90);
        while (var4 != null) {
            if (!(!var4.a(jc.field_r, (byte) 119, nfa.field_a))) {
                return var4;
            }
            var4 = (jfa) (Object) ((ola) this).field_m.c(0);
        }
        if (param1 == -4456) {
            return null;
        }
        jfa discarded$0 = ((ola) this).a(-48, -94, 71);
        return null;
    }

    private final boolean f() {
        int var2 = ((ola) this).field_m.g(0) - (-((ola) this).field_k.f(62) - 1);
        int var3 = 0;
        return var2 > 4 ? true : false;
    }

    public ola() {
        ((ola) this).field_n = 0;
        ((ola) this).field_r = new jfa[50];
        ((ola) this).field_i = fs.a(1);
        ((ola) this).field_m = new eaa();
        ((ola) this).field_q = new eaa();
    }

    static {
    }
}
