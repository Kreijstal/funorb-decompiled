/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends kl {
    private cn field_m;
    private cn field_u;
    private cn field_n;
    private pp field_p;
    private int field_t;
    static tb field_v;
    static String field_s;
    private int field_q;
    private pp field_o;
    static String field_r;
    private String field_w;

    final void a(lb param0, int param1) {
        int var3 = 0;
        hb var4 = null;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param1 == 83) {
          var3 = 0;
          L0: while (true) {
            if (-9 >= (var3 ^ -1)) {
              ((fk) this).b((byte) 37);
              return;
            } else {
              L1: {
                L2: {
                  var4 = gm.field_d.field_a[var3];
                  if (var4 == null) {
                    break L2;
                  } else {
                    if (255 == var4.field_p) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (null != qd.field_c) {
                  if (!qd.field_c[var3]) {
                    break L1;
                  } else {
                    qd.field_c[var3] = false;
                    sd.field_J = sd.field_J - 1;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (var4 != null) {
                if ((var4.field_p ^ -1) != -256) {
                  var4.field_b = new wd(var4.field_n.field_e);
                  var3++;
                  continue L0;
                } else {
                  var4.field_b = new wd(k.field_c);
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (param0 > -104) {
            ((fk) this).field_u = null;
        }
        for (var2 = 0; -3 < (var2 ^ -1); var2++) {
            for (var3 = 0; var3 < 4; var3++) {
                var4 = 199 + 83 * var3;
                var5 = 57 + var2 * 86;
                gf.b(var4, var5, 72, 72, 65793);
                rp.a(4, 64, (byte) 108, 4 + var4, 64, kc.field_V, var5 - -4);
            }
        }
        for (var2 = 0; 4 > var2; var2++) {
            var3 = var2 * 130 + 37;
            var4 = 227;
            gf.b(var3, var4, 96, 96, 65793);
            rp.a(4, 88, (byte) 108, 4 + var3, 88, kc.field_S, var4 + 4);
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_v = null;
        field_r = null;
        if (param0 <= 53) {
            field_r = null;
        }
    }

    final static void a(byte param0, wh param1) {
        if (param1 == null) {
            lo.a(param0 ^ 13, true, (vh) null, 64, 0);
            return;
        }
        if (param0 != 121) {
            field_s = null;
        }
        lo.a(85, true, param1.field_b, 64, param1.field_f);
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int var5_int = 0;
        hb var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var7 = DungeonAssault.field_K;
        var2 = 20;
        var3 = 1;
        var4 = -hf.field_Ab.field_v + var2;
        L0: while (true) {
          if (-hf.field_Ab.field_v >= var4) {
            L1: {
              gf.e(0, 0, 640, am.field_a.field_G + var2 - 12);
              am.field_a.h(-(am.field_a.field_E / 2) + 320, var2);
              gf.b();
              lf.field_n.c(321 + -(lf.field_n.field_E / 2), 60 + var2);
              lf.field_x.h(320 - lf.field_x.field_E / 2, am.field_a.field_G + (var2 - 28));
              var4 = -51 / ((41 - param0) / 63);
              gf.b(37 + ((fk) this).field_k, 57 + ((fk) this).field_j, 155, 158, 65793, 64);
              super.b(-64);
              this.e(-64);
              var5 = null;
              if (-1 == ((fk) this).field_q) {
                break L1;
              } else {
                var5_ref = gm.field_d.field_a[((fk) this).field_q];
                break L1;
              }
            }
            L2: {
              qe.a(50 + ((fk) this).field_k, ((fk) this).field_j - -136, var5_ref, 0);
              if (var5_ref == null) {
                break L2;
              } else {
                int discarded$1 = db.field_v.a(var5_ref.field_n.field_F.toUpperCase(), 45 + ((fk) this).field_k, ((fk) this).field_j + 62, 139, 58, 16777215, -1, 1, 1, db.field_v.field_H);
                break L2;
              }
            }
            return;
          } else {
            L3: {
              var5_int = 70;
              var6 = 545;
              if (var3 == 0) {
                hf.field_Ab.g(var5_int, var4);
                hf.field_Ab.g(var6, var4);
                break L3;
              } else {
                hf.field_Ab.h(var5_int, var4);
                hf.field_Ab.h(var6, var4);
                break L3;
              }
            }
            L4: {
              if (var3 != 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L4;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L4;
              }
            }
            var3 = stackIn_8_0;
            var4 = var4 - hf.field_Ab.field_v;
            continue L0;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        hb[] var2_ref_hb__ = null;
        hb var3 = null;
        int var3_int = 0;
        hb var4 = null;
        int var5 = 0;
        hb[] var6 = null;
        String stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        pp stackIn_33_0 = null;
        pp stackIn_34_0 = null;
        pp stackIn_35_0 = null;
        pp stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        pp stackOut_32_0 = null;
        pp stackOut_33_0 = null;
        pp stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        pp stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        String stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        String stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        L0: {
          var5 = DungeonAssault.field_K;
          ((fk) this).field_q = -1;
          super.a(param0);
          ((fk) this).field_q = this.b(hj.field_S, 27403, eh.field_h);
          if ((Object) (Object) hh.field_s == (Object) (Object) ((fk) this).field_p) {
            this.a(true, (byte) 22);
            break L0;
          } else {
            if ((Object) (Object) hh.field_s != (Object) (Object) ((fk) this).field_o) {
              if (no.field_d != 0) {
                L1: {
                  var2 = this.b(lc.field_c, 27403, hm.field_k);
                  if (-1 != var2) {
                    var3 = gm.field_d.field_a[var2];
                    if (var3 == null) {
                      break L1;
                    } else {
                      if (255 == var3.field_p) {
                        break L1;
                      } else {
                        if (!qd.field_c[var2]) {
                          if (-5 < (sd.field_J ^ -1)) {
                            sd.field_J = sd.field_J + 1;
                            qd.field_c[var2] = true;
                            if (var3.field_b.field_n == var3.field_b.field_i) {
                              var3.field_b.a(62, var3.field_n.field_u);
                              if (var3.field_n.field_p != null) {
                                o discarded$2 = gd.a(64, var3.field_n.field_p);
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          sd.field_J = sd.field_J - 1;
                          qd.field_c[var2] = false;
                          var3.field_b.a(107, var3.field_n.field_v);
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    stackOut_32_0 = ((fk) this).field_o;
                    stackIn_35_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (-1 <= (sd.field_J ^ -1)) {
                      break L3;
                    } else {
                      stackOut_33_0 = (pp) (Object) stackIn_33_0;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (4 < sd.field_J) {
                        break L3;
                      } else {
                        stackOut_34_0 = (pp) (Object) stackIn_34_0;
                        stackOut_34_1 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        break L2;
                      }
                    }
                  }
                  stackOut_35_0 = (pp) (Object) stackIn_35_0;
                  stackOut_35_1 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  break L2;
                }
                stackIn_36_0.field_w = stackIn_36_1 != 0;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (0 >= sd.field_J) {
                break L0;
              } else {
                if (sd.field_J > 4) {
                  break L0;
                } else {
                  var6 = gm.field_d.field_a;
                  var2_ref_hb__ = var6;
                  var3_int = 0;
                  L4: while (true) {
                    if (var6.length <= var3_int) {
                      L5: {
                        stackOut_13_0 = ((fk) this).field_w;
                        stackOut_13_1 = ((fk) this).field_t;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0) {
                          stackOut_15_0 = (String) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L5;
                        } else {
                          stackOut_14_0 = (String) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L5;
                        }
                      }
                      mc.a(stackIn_16_0, stackIn_16_1, stackIn_16_2 != 0, qd.field_c);
                      break L0;
                    } else {
                      var4 = var6[var3_int];
                      if (var4 != null) {
                        if (qd.field_c[var4.field_j]) {
                          var4.field_b.a(62, var4.field_n.field_t);
                          if (var4.field_n.field_p != null) {
                            o discarded$3 = gd.a(64, var4.field_n.field_p);
                            var3_int++;
                            continue L4;
                          } else {
                            var3_int++;
                            continue L4;
                          }
                        } else {
                          var3_int++;
                          continue L4;
                        }
                      } else {
                        var3_int++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
            return;
        }
        if (mm.field_t == 13) {
            this.a(false, (byte) 22);
        } else {
            super.b(param0);
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          var4 = 0;
          var5 = 0;
          if (param1 == 27403) {
            break L0;
          } else {
            this.d((byte) -91);
            break L0;
          }
        }
        L1: while (true) {
          if (-3 >= var5) {
            var5 = ((fk) this).field_k + 37;
            var6 = 227 + ((fk) this).field_j;
            var10 = 0;
            var7 = var10;
            L2: while (true) {
              if (-9 >= (var10 ^ -1)) {
                return -1;
              } else {
                if (qd.field_c[var10]) {
                  L3: {
                    if (param0 < var5) {
                      break L3;
                    } else {
                      if (param2 < var6) {
                        break L3;
                      } else {
                        if (96 + var5 <= param0) {
                          break L3;
                        } else {
                          if (param2 < var6 + 96) {
                            return var10;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  // wide iinc 5 130
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          } else {
            var6 = 0;
            L4: while (true) {
              if (-5 > var6) {
                L5: {
                  var7 = 199 + ((fk) this).field_k + 83 * var6;
                  var8 = 86 * var5 + (57 + ((fk) this).field_j);
                  if (var7 > param0) {
                    break L5;
                  } else {
                    if (var8 > param2) {
                      break L5;
                    } else {
                      if (var7 + 72 <= param0) {
                        break L5;
                      } else {
                        if (param2 >= 72 + var8) {
                          break L5;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                if (var4 != 7) {
                  var6++;
                  var4++;
                  continue L4;
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            try {
                if (param0 != 84) {
                    field_s = null;
                }
                var2 = param1.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!(-1 < (var3 ^ -1))) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(j.a((byte) 94, var5, param1), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          if (param0 <= -57) {
            break L0;
          } else {
            this.a(false, (byte) -23);
            break L0;
          }
        }
        var2 = 0;
        var3 = 0;
        L1: while (true) {
          if (var3 >= 2) {
            var3 = ((fk) this).field_k - -37;
            var4 = 227 + ((fk) this).field_j;
            var9 = 0;
            var5 = var9;
            L2: while (true) {
              if ((var9 ^ -1) <= -9) {
                return;
              } else {
                if (qd.field_c[var9]) {
                  if (null != gm.field_d.field_a[var9]) {
                    gm.field_d.field_a[var9].field_b.a(84, 6 + var4, (byte) 102, 6 + var3, 84);
                    qe.a(var3 + 96 + -4, var4 - -96 + -4, 3, gm.field_d.field_a[var9], 0);
                    // wide iinc 3 130
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            var4 = 0;
            L3: while (true) {
              if ((var4 ^ -1) <= -5) {
                var3++;
                continue L1;
              } else {
                var5 = 83 * var4 + ((fk) this).field_k - -199;
                var6 = 86 * var3 + (((fk) this).field_j - -57);
                if (gm.field_d.field_a[var2] != null) {
                  L4: {
                    gm.field_d.field_a[var2].field_b.a(60, var6 + 6, (byte) 102, var5 - -6, 60);
                    qe.a(72 + (var5 + -4), -4 + (var6 + 72), 3, gm.field_d.field_a[var2], 0);
                    var7 = (int)(64.0 * (te.c(mo.field_a, 10273 * var2, 0.015625) + 2.0));
                    if ((var7 ^ -1) <= -1) {
                      break L4;
                    } else {
                      var7 = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (qd.field_c[var2]) {
                      ((fk) this).field_u.b(var5, var6, var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (((fk) this).field_q == var2) {
                    ((fk) this).field_m.b(var5, var6, 64);
                    ((fk) this).field_n.b(var5, var6, var7);
                    var4++;
                    var2++;
                    continue L3;
                  } else {
                    var4++;
                    var2++;
                    continue L3;
                  }
                } else {
                  var4++;
                  var2++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        hb[] var3 = null;
        int var4 = 0;
        hb var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        super.c((byte) 44);
        var2 = -25 % ((-34 - param0) / 57);
        var3 = gm.field_d.field_a;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_b.a((byte) 109, 20);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != 22) {
            ((fk) this).b(true);
        }
        ((fk) this).field_d = true;
    }

    final void b(byte param0) {
        int var3_int = 0;
        int var5 = DungeonAssault.field_K;
        int[] var6 = new int[64];
        int[] var2 = var6;
        for (var3_int = 0; -65 < (var3_int ^ -1); var3_int++) {
            var6[var3_int] = mp.a(-2147483648, (var3_int + 24) * 65793);
        }
        cn var3 = new cn(((fk) this).field_a, ((fk) this).field_i);
        cn var4 = new cn(((fk) this).field_a, ((fk) this).field_i);
        ((fk) this).field_l = new ph(var3, var4);
        jh.a(((fk) this).field_l);
        if (param0 != 37) {
            return;
        }
        da.a(pi.field_i, cm.field_M, ((fk) this).field_a >> -1238092287, 1917623617, (ne.field_c.field_H + 36 >> 568864545) + 7, (se) (Object) ne.field_c);
        this.d((byte) -123);
        gf.b(44, 64, 141, 53, 65793);
        rp.a(4, 133, (byte) 108, 48, 45, kc.field_S, 68);
        jh.b();
    }

    fk(String param0, int param1) {
        super(40, 40, 560, 380);
        ((fk) this).field_t = param1;
        ((fk) this).field_w = param0;
        ((fk) this).field_p = tn.a(140, -20 + (-jm.field_i.field_v + ((fk) this).field_j) - -((fk) this).field_i, (se) (Object) ne.field_c, jm.field_i, -112, be.field_r.toUpperCase());
        ((fk) this).field_o = tn.a(-jm.field_i.field_y + 500, -jm.field_i.field_v + ((fk) this).field_j + (((fk) this).field_i - 20), (se) (Object) ne.field_c, jm.field_i, -73, lk.field_P);
        ((fk) this).field_f.a((ne) (Object) ((fk) this).field_p, false);
        ((fk) this).field_f.a((ne) (Object) ((fk) this).field_o, false);
        ((fk) this).a((lb) null, 83);
        ((fk) this).field_m = mf.a(10449103, 72, 6, 72, (byte) -102);
        ((fk) this).field_n = mf.a(255, 72, 12, 72, (byte) 71);
        ((fk) this).field_u = mf.a(16711680, 72, 12, 72, (byte) -83);
        qd.field_c = new boolean[8];
        ((fk) this).field_o.field_w = false;
        sd.field_J = 0;
        rh discarded$0 = new rh(58, 394, 80, 160, 16711680, 768, 249);
        rh discarded$1 = new rh(580, 394, 80, 160, 16711680, 768, 249);
        qh.a(-13716, (rj) (Object) ((fk) this).field_o, 24);
    }

    final static cn a(byte param0, cn param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = DungeonAssault.field_K;
        if (param0 != 36) {
            return null;
        }
        cn var12 = param1.d();
        cn var13 = var12;
        int var5 = param3 & 16711935;
        int var6 = 65280 & param3;
        for (var7 = 0; var13.field_B.length > var7; var7++) {
            var8 = var12.field_B[var7];
            var9 = (63 & var8 >> 104076258) + (var8 >> -1065233838 & 63) - -(127 & var8 >> 1425172809);
            var10 = 16711680 & var6 * var9 | -16711936 & var9 * var5;
            if (0 == var10) {
                if (var8 != 0) {
                    var10 = 65793;
                }
            }
            var12.field_B[var7] = var10 >>> -70403576;
        }
        jh.a(var13);
        param1.d(-param1.field_w, -param1.field_A, -param2 + 256);
        jh.b();
        return var13;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_r = "Password: ";
    }
}
