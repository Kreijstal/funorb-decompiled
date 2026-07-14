/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private kv field_a;
    private kv field_r;
    static sna field_h;
    private int field_x;
    private kv field_g;
    private boolean field_l;
    private int[] field_k;
    private int field_t;
    private sna field_u;
    static qia field_o;
    private mj field_m;
    private int field_e;
    private int[] field_d;
    private int[] field_n;
    private kv field_c;
    static int field_p;
    private int[] field_w;
    private kv field_q;
    private kv field_i;
    static String field_y;
    static String field_f;
    private lna field_s;
    private kv field_b;
    private String field_v;
    private kv field_j;

    private final boolean a(int[] param0, int param1, int[] param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (param0.length != param2.length) {
            return false;
        }
        for (var4 = param1; var4 < param0.length; var4++) {
            if (!(param0[var4] == param2[var4])) {
                return false;
            }
        }
        return true;
    }

    private final boolean a(int param0, int[] param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        if (param2 >= -120) {
            return true;
        }
        int[] var8 = param1;
        int[] var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (!(param0 != var6)) {
                return true;
            }
        }
        return false;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          ((mk) this).field_s.c(11);
          ((mk) this).field_u.a(19842, param0);
          if (-2 != (((mk) this).field_u.field_R ^ -1)) {
            break L0;
          } else {
            if (gi.field_a) {
              if (this.a(true)) {
                L1: {
                  qm.a(14, 7758);
                  if (!this.a(((mk) this).field_k, 0, rn.field_s.field_g.field_m)) {
                    ep.a((byte) 42, rn.field_s, ((mk) this).field_l, ((mk) this).field_e, rn.field_s.field_g.field_m);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (((mk) this).field_l) {
                    rn.field_s.field_v.a(false, 0, 0, true, -1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                rn.field_s.field_g.field_i = 0;
                gs.field_f.field_i = false;
                gs.field_f.field_p = false;
                uca.a(18, (byte) -19);
                break L0;
              } else {
                ((mk) this).field_m = new mj(100, 150, 440, 160, wja.field_n);
                return;
              }
            } else {
              break L0;
            }
          }
        }
        if (((mk) this).field_m == null) {
          L3: {
            ((mk) this).field_x = -1;
            var2 = bf.field_g.length;
            if ((dm.field_f ^ -1) >= -1) {
              var2 = 6;
              break L3;
            } else {
              break L3;
            }
          }
          var3 = 0;
          L4: while (true) {
            if (var2 <= var3) {
              ((mk) this).field_t = -1;
              var7 = 0;
              var3 = var7;
              L5: while (true) {
                if (var7 >= hha.field_w.length) {
                  return;
                } else {
                  hha.field_w[var7].a(19842, true);
                  if (hha.field_w[var7].field_T) {
                    ((mk) this).field_t = var7;
                    if ((hha.field_w[var7].field_R ^ -1) == -2) {
                      qm.a(9, 7758);
                      rn.field_s.field_g.field_m[((mk) this).field_t] = -1;
                      var7++;
                      continue L5;
                    } else {
                      var7++;
                      continue L5;
                    }
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              bf.field_g[var3].a(19842, true);
              if (bf.field_g[var3].field_T) {
                L6: {
                  L7: {
                    if (2 > var3) {
                      break L7;
                    } else {
                      if (rn.field_s.field_g.field_g[-2 + var3]) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ((mk) this).field_x = var3;
                  break L6;
                }
                if (-2 == (bf.field_g[var3].field_R ^ -1)) {
                  L8: {
                    if (this.a(((mk) this).field_x, rn.field_s.field_g.field_m, -125)) {
                      break L8;
                    } else {
                      L9: {
                        if (((mk) this).field_x < 2) {
                          break L9;
                        } else {
                          if (rn.field_s.field_g.field_g[-2 + ((mk) this).field_x]) {
                            break L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var6 = 0;
                      var4 = var6;
                      L10: while (true) {
                        if (var6 < rn.field_s.field_g.field_m.length) {
                          if (-1 != rn.field_s.field_g.field_m[var6]) {
                            var6++;
                            continue L10;
                          } else {
                            qm.a(8, 7758);
                            uca.a(17, (byte) 105);
                            rn.field_s.field_g.field_m[var6] = ((mk) this).field_x;
                            var3++;
                            continue L4;
                          }
                        } else {
                          var3++;
                          continue L4;
                        }
                      }
                    }
                  }
                  if (-1 != ((mk) this).field_x) {
                    if (this.a(((mk) this).field_x, rn.field_s.field_g.field_m, -126)) {
                      L11: {
                        if (-3 < (((mk) this).field_x ^ -1)) {
                          break L11;
                        } else {
                          if (rn.field_s.field_g.field_g[-2 + ((mk) this).field_x]) {
                            break L11;
                          } else {
                            var3++;
                            continue L4;
                          }
                        }
                      }
                      qm.a(9, 7758);
                      var4 = this.a(rn.field_s.field_g.field_m, 0, ((mk) this).field_x);
                      if ((var4 ^ -1) != 0) {
                        rn.field_s.field_g.field_m[var4] = -1;
                        var3++;
                        continue L4;
                      } else {
                        var3++;
                        continue L4;
                      }
                    } else {
                      var3++;
                      continue L4;
                    }
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              } else {
                var3++;
                continue L4;
              }
            }
          }
        } else {
          L12: {
            if (-1 == (((mk) this).field_m.b(0) ^ -1)) {
              ((mk) this).field_m = null;
              break L12;
            } else {
              break L12;
            }
          }
          return;
        }
    }

    private final boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oha var6 = null;
        int var7 = 0;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        var3 = 0;
        var4 = param0 ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= rn.field_s.field_g.field_m.length) {
            L1: {
              L2: {
                if (var3 == 0) {
                  break L2;
                } else {
                  if (var2 == 0) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      break L2;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L1;
            }
            return stackIn_18_0 != 0;
          } else {
            if (0 != rn.field_s.field_g.field_m[var5]) {
              L3: {
                if (-1 < dm.field_f) {
                  break L3;
                } else {
                  if ((rn.field_s.field_g.field_m[var5] ^ -1) < -7) {
                    var4 = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var6 = ur.field_e[ko.field_f.field_b[rn.field_s.field_g.field_m[var5]]];
                if (!(var6 instanceof t)) {
                  break L4;
                } else {
                  var3 = 1;
                  break L4;
                }
              }
              if (var6 instanceof tv) {
                var2 = 1;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int var4 = -1;
        for (var5 = param1; var5 < param3; var5++) {
            var4 = var4 >>> 1036397736 ^ uca.field_d[(param0[var5] ^ var4) & 255];
        }
        if (param2 > -110) {
            field_y = null;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        ho var4 = null;
        int var5 = 0;
        int var6_int = 0;
        oha var6 = null;
        int var7 = 0;
        oha var8_ref_oha = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fea stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        fea stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        fea stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_40_0 = 0;
        fea stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        fea stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        fea stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          wq.field_k.e(0, 0);
          j.a(((mk) this).field_v, 34, 16762880, true, 444, false);
          int discarded$1 = wt.field_k.a(rn.field_s.field_g.field_o.field_a, 350, 40, 240, 100, 16777215, -1, 0, 1, 14);
          jha.field_g.a(hl.field_G[2], 414, 178, 15204352, -1);
          hfa.field_z.a(hl.field_G[2], 414, 178, 65793, -1);
          jha.field_g.a(hl.field_G[3], 412, 206, 818659, -1);
          hfa.field_z.a(hl.field_G[3], 412, 206, 65793, -1);
          jha.field_g.a(hl.field_G[0], 414, 232, 16769792, -1);
          hfa.field_z.a(hl.field_G[0], 414, 232, 65793, -1);
          var3 = 11 / ((65 - param1) / 50);
          jha.field_g.a(hl.field_G[1], 408, 259, 51233, -1);
          hfa.field_z.a(hl.field_G[1], 408, 259, 65793, -1);
          jha.field_g.a(hr.field_a, 180, 428, 16776960, -1);
          hfa.field_z.a(hr.field_a, 180, 428, 65793, -1);
          jha.field_g.a(ida.field_o, 180, 32, 16776960, -1);
          hfa.field_z.a(ida.field_o, 180, 32, 65793, -1);
          if (((mk) this).field_s.field_A) {
            break L0;
          } else {
            ((mk) this).field_s.a(8);
            break L0;
          }
        }
        ((mk) this).field_s.a(false, false, 2048, 2048, 0, -60, 256, 110, 100);
        var4 = (ho) (Object) rn.field_s.field_g.field_h.b((byte) 90);
        L1: while (true) {
          if (var4 == null) {
            L2: {
              this.a((byte) 21, ((mk) this).field_d[2], dt.field_a, 154, 472, 2);
              this.a((byte) 21, ((mk) this).field_d[3], in.field_b, 184, 472, 3);
              this.a((byte) 21, ((mk) this).field_d[0], fk.field_s, 216, 472, 0);
              this.a((byte) 21, ((mk) this).field_d[1], vaa.field_b, 243, 472, 1);
              this.c(false);
              pw.field_y.e(470, 320);
              stackOut_5_0 = jha.field_g;
              stackOut_5_1 = di.field_l;
              stackOut_5_2 = 522;
              stackOut_5_3 = 342;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              if (!((mk) this).field_u.field_T) {
                stackOut_7_0 = (fea) (Object) stackIn_7_0;
                stackOut_7_1 = (String) (Object) stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = 16777215;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                break L2;
              } else {
                stackOut_6_0 = (fea) (Object) stackIn_6_0;
                stackOut_6_1 = (String) (Object) stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = 16776960;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                break L2;
              }
            }
            ((fea) (Object) stackIn_8_0).a((String) (Object) stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, -1);
            hfa.field_z.a(di.field_l, 522, 342, 65793, -1);
            var5 = 0;
            L3: while (true) {
              if (var5 >= rn.field_s.field_g.field_m.length) {
                L4: {
                  L5: {
                    if (-1 != ((mk) this).field_x) {
                      break L5;
                    } else {
                      if (0 == ((mk) this).field_t) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (0 == ((mk) this).field_x) {
                      stackOut_39_0 = rn.field_s.field_g.field_m[((mk) this).field_t];
                      stackIn_40_0 = stackOut_39_0;
                      break L6;
                    } else {
                      stackOut_38_0 = ((mk) this).field_x;
                      stackIn_40_0 = stackOut_38_0;
                      break L6;
                    }
                  }
                  var5 = stackIn_40_0;
                  if (-1 != var5) {
                    L7: {
                      var6 = al.a(-111, ko.field_f.field_b[var5]);
                      if (0 != (((mk) this).field_x ^ -1)) {
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var7 = 640;
                    var8 = 480;
                    var9 = field_p + 4;
                    var10 = 4 + gd.field_m;
                    if (!param0) {
                      break L4;
                    } else {
                      sd.a(rn.field_s.field_g.a(var6, -5313), var9, var6, (byte) 74, var10, var7, var8);
                      break L4;
                    }
                  } else {
                    return;
                  }
                }
                L8: {
                  if (((mk) this).field_m == null) {
                    break L8;
                  } else {
                    dg.g(0, 0, 640, 480);
                    ((mk) this).field_m.a((byte) 85);
                    break L8;
                  }
                }
                return;
              } else {
                if (0 != (rn.field_s.field_g.field_m[var5] ^ -1)) {
                  L9: {
                    var6_int = od.field_A[var5][0];
                    var7 = od.field_A[var5][1];
                    gq.field_E.a(0, var7, var6_int, -1049413117, 4096);
                    var8_ref_oha = ur.field_e[ko.field_f.field_b[rn.field_s.field_g.field_m[var5]]];
                    if (!(var8_ref_oha instanceof tv)) {
                      if (var8_ref_oha instanceof hd) {
                        nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1744058145) + -1 + var6_int, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 276917793) + -1 + var7, 14971949);
                        break L9;
                      } else {
                        if (var8_ref_oha instanceof a) {
                          if (var8_ref_oha.field_b == 3) {
                            nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> -1484801599) + (-1 + var6_int), -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1096302113) + -1 + var7, 16769792);
                            break L9;
                          } else {
                            if ((var8_ref_oha.field_b ^ -1) != -5) {
                              if (2 == var8_ref_oha.field_b) {
                                nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> -992767167) + (var6_int + -1), -1 + (var7 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1462926049)), 15204352);
                                break L9;
                              } else {
                                if (-2 != (var8_ref_oha.field_b ^ -1)) {
                                  break L9;
                                } else {
                                  nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> -1593657087) + var6_int + -1, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1488673889) + var7 + -1, 818659);
                                  break L9;
                                }
                              }
                            } else {
                              nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 813739969) + -1 + var6_int, -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> -1098436767) + (var7 + -1), 51233);
                              break L9;
                            }
                          }
                        } else {
                          if (!(var8_ref_oha instanceof t)) {
                            break L9;
                          } else {
                            L10: {
                              if ((((t) (Object) var8_ref_oha).field_p ^ -1) == -2) {
                                break L10;
                              } else {
                                if (((t) (Object) var8_ref_oha).field_p != 2) {
                                  if (-5 == (((t) (Object) var8_ref_oha).field_p ^ -1)) {
                                    nia.field_l[var8_ref_oha.field_b].e(-1 + var6_int - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1031770241), -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> -1032956127) + (-1 + var7), 16769792);
                                    break L9;
                                  } else {
                                    nia.field_l[var8_ref_oha.field_b].e(-1 + (var6_int + -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 392522497)), var7 - (1 - -(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 1934495969)), 15204352);
                                    break L9;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                            }
                            nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 1746464257) + (var6_int + -1), var7 + -1 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> 561767585), 818659);
                            break L9;
                          }
                        }
                      }
                    } else {
                      nia.field_l[var8_ref_oha.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_q >> 2132324929) + (-1 + var6_int), var7 - 1 - (nia.field_l[ur.field_e[bf.field_g[var5].field_vb].field_b].field_p >> -2012111487), 51233);
                      break L9;
                    }
                  }
                  wca.a(true, -15 + od.field_A[var5][1], -15 + od.field_A[var5][0], ko.field_f.field_b[rn.field_s.field_g.field_m[var5]], 78);
                  var5++;
                  continue L3;
                } else {
                  var5++;
                  continue L3;
                }
              }
            }
          } else {
            var4 = (ho) (Object) rn.field_s.field_g.field_h.c(0);
            continue L1;
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oha var7 = null;
        int var8 = 0;
        oha var9 = null;
        oha var10 = null;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (!param0) {
            break L0;
          } else {
            ((mk) this).field_i = null;
            break L0;
          }
        }
        L1: {
          var2 = 15;
          if (dm.field_f > 0) {
            break L1;
          } else {
            var2 = 6;
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (15 <= var3) {
            return;
          } else {
            L3: {
              var4 = ica.field_r[var3][0];
              var5 = ica.field_r[var3][1];
              if (var2 <= var3) {
                break L3;
              } else {
                L4: {
                  if ((var3 ^ -1) > -4) {
                    break L4;
                  } else {
                    if (!rn.field_s.field_g.b(8, var3 / 3)) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var3 != rn.field_s.field_g.field_i) {
                    break L5;
                  } else {
                    if (-1 != (rn.field_s.field_g.field_i ^ -1)) {
                      ((mk) this).field_r.d(-13 + var4, var5 + -13, 255);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((var3 ^ -1) <= -3) {
                    if (rn.field_s.field_g.field_g[var3 - 2]) {
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L6;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_20_0 = stackOut_17_0;
                      break L6;
                    }
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_20_0 = stackOut_15_0;
                    break L6;
                  }
                }
                var6 = stackIn_20_0;
                if (var6 != 0) {
                  L7: {
                    var10 = ur.field_e[bf.field_g[var3].field_vb];
                    var7 = var10;
                    if (!rn.field_s.field_g.a(bf.field_g[var3].field_vb, 9)) {
                      break L7;
                    } else {
                      a.field_o.a(a.field_o.field_n << 238198563, a.field_o.field_o << -107833085, (1 + var4) * 16, 16 * var5 + 16, 0, 4096);
                      break L7;
                    }
                  }
                  L8: {
                    gq.field_E.a(0, var5, var4, -1049413117, 4096);
                    if (!(var7 instanceof tv)) {
                      if (!(var7 instanceof hd)) {
                        if (!(var7 instanceof a)) {
                          if (!(var7 instanceof t)) {
                            break L8;
                          } else {
                            L9: {
                              if (((t) (Object) var10).field_p == 1) {
                                break L9;
                              } else {
                                if (-3 == ((t) (Object) var10).field_p) {
                                  break L9;
                                } else {
                                  if (-5 == ((t) (Object) var10).field_p) {
                                    nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(var4 + -1 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1818153281), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -1530911711) + var5 - 1, 16769792);
                                    break L8;
                                  } else {
                                    nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -465790943)), -1 + (var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -428814399)), 15204352);
                                    break L8;
                                  }
                                }
                              }
                            }
                            nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1723632449) + var4 + -1, -1 + var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -898128895), 818659);
                            break L8;
                          }
                        } else {
                          if (-4 == var10.field_b) {
                            nia.field_l[var10.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 882221825) + (var4 - 1), -1 + var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -472820191), 16769792);
                            break L8;
                          } else {
                            if (-5 == var10.field_b) {
                              nia.field_l[var10.field_b].e(-1 + var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -206446431), var5 - (1 + (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1976208353)), 51233);
                              break L8;
                            } else {
                              if ((var10.field_b ^ -1) != -3) {
                                if (1 != var10.field_b) {
                                  break L8;
                                } else {
                                  nia.field_l[var10.field_b].e(-1 + (var4 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 121073473)), var5 - (1 - -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 826697569)), 818659);
                                  break L8;
                                }
                              } else {
                                nia.field_l[var10.field_b].e(var4 - 1 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 576621537), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -1017118975) + -1 + var5, 15204352);
                                break L8;
                              }
                            }
                          }
                        }
                      } else {
                        nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-1 + (var4 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -1843744639)), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 287991169) + -1 + var5, 14971949);
                        break L8;
                      }
                    } else {
                      nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -21207871) + var4 - 1, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -1190197983) + var5 + -1, 51233);
                      break L8;
                    }
                  }
                  wca.a(true, bf.field_g[var3].field_rb, bf.field_g[var3].field_kb + 1, bf.field_g[var3].field_vb, 106);
                  var3++;
                  continue L2;
                } else {
                  L10: {
                    if (var3 < var2) {
                      break L10;
                    } else {
                      L11: {
                        if (2 > var3) {
                          break L11;
                        } else {
                          if (rn.field_s.field_g.field_g[var3 - 2]) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L12: {
                        var9 = ur.field_e[bf.field_g[var3].field_vb];
                        var7 = var9;
                        if (!rn.field_s.field_g.a(bf.field_g[var3].field_vb, 9)) {
                          break L12;
                        } else {
                          a.field_o.a(a.field_o.field_n << -197060125, a.field_o.field_o << 1296535107, var4 * 16 + 16, (1 + var5) * 16, 0, 4096);
                          break L12;
                        }
                      }
                      L13: {
                        gq.field_E.a(0, var5, var4, -1049413117, 4096);
                        if (var7 instanceof tv) {
                          nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(var4 - (1 + (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -51195295)), -1 + (var5 - (nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 579761249)), 51233);
                          break L13;
                        } else {
                          if (!(var7 instanceof hd)) {
                            if (var7 instanceof a) {
                              if ((var9.field_b ^ -1) != -4) {
                                if (4 != var9.field_b) {
                                  if (-3 == (var9.field_b ^ -1)) {
                                    nia.field_l[var9.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -1097441343) + -1 + var4, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -2076669983) + var5 - 1, 15204352);
                                    break L13;
                                  } else {
                                    if (var9.field_b != 1) {
                                      break L13;
                                    } else {
                                      nia.field_l[var9.field_b].e(-1 + (var4 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 546722209)), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> -1834168511) + (var5 - 1), 818659);
                                      break L13;
                                    }
                                  }
                                } else {
                                  nia.field_l[var9.field_b].e(-1 + var4 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 2108847969), -1 + var5 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 878498049), 51233);
                                  break L13;
                                }
                              } else {
                                nia.field_l[var9.field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -596655455) + (var4 - 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 717659361) + (var5 + -1), 16769792);
                                break L13;
                              }
                            } else {
                              if (!(var7 instanceof t)) {
                                break L13;
                              } else {
                                L14: {
                                  if (((t) (Object) var9).field_p == 1) {
                                    break L14;
                                  } else {
                                    if (2 != ((t) (Object) var9).field_p) {
                                      if ((((t) (Object) var9).field_p ^ -1) == -5) {
                                        nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -1010955807) + (var4 - 1), var5 - 1 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 1328768353), 16769792);
                                        break L13;
                                      } else {
                                        nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -181589919) + (var4 - 1), -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 892160161) + (var5 + -1), 15204352);
                                        break L13;
                                      }
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> 1458952481) + -1 + var4, var5 + (-1 + -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 113694081)), 818659);
                                break L13;
                              }
                            }
                          } else {
                            nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].e(-(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_q >> -897828895) + var4 + -1, -(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_p >> 849816545) + (var5 - 1), 14971949);
                            break L13;
                          }
                        }
                      }
                      wca.a(true, bf.field_g[var3].field_rb, 1 + bf.field_g[var3].field_kb, bf.field_g[var3].field_vb, 106);
                      nma.field_v.a(nma.field_v.field_n << 1787093443, nma.field_v.field_o << -1976809693, 16 * var4, var5 * 16, 0, 4096);
                      var3++;
                      continue L2;
                    }
                  }
                  hp.field_b[ur.field_e[bf.field_g[var3].field_vb].field_b].a(nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_n << -1201319453, nia.field_l[ur.field_e[bf.field_g[var3].field_vb].field_b].field_o << 454106755, 16 * var4, 16 * var5, 0, 4096);
                  var3++;
                  continue L2;
                }
              }
            }
            nma.field_v.a(nma.field_v.field_n << 56246083, nma.field_v.field_o << 39878883, 16 * var4, var5 * 16, 0, 4096);
            var3++;
            continue L2;
          }
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = BachelorFridge.field_y;
        me.field_t = new js(16);
        for (var1 = 0; var1 < gb.field_f.length; var1++) {
            me.field_t.a((long)gb.field_f[var1].toLowerCase().hashCode(), (byte) 78, (bw) (Object) new ji(var1));
        }
        if (param0 != -43) {
            field_f = null;
        }
    }

    private final void a(byte param0, int param1, kv param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param5 != 0) {
            if (1 != param5) {
              break L0;
            } else {
              if (!rn.field_s.field_g.a(85, 0, rn.field_s.field_g.field_m)) {
                break L0;
              } else {
                param1++;
                break L0;
              }
            }
          } else {
            if (1 != param5) {
              break L0;
            } else {
              if (!rn.field_s.field_g.a(85, 0, rn.field_s.field_g.field_m)) {
                break L0;
              } else {
                param1++;
                break L0;
              }
            }
          }
        }
        L1: {
          if (-3 != (param5 ^ -1)) {
            if ((param5 ^ -1) != -4) {
              break L1;
            } else {
              if (!rn.field_s.field_g.a(87, 0, rn.field_s.field_g.field_m)) {
                break L1;
              } else {
                param1++;
                break L1;
              }
            }
          } else {
            if ((param5 ^ -1) != -4) {
              break L1;
            } else {
              if (!rn.field_s.field_g.a(87, 0, rn.field_s.field_g.field_m)) {
                break L1;
              } else {
                param1++;
                break L1;
              }
            }
          }
        }
        L2: {
          var7 = 0;
          if (param0 == 21) {
            break L2;
          } else {
            boolean discarded$1 = this.a(true);
            break L2;
          }
        }
        var8 = 0;
        L3: while (true) {
          if (param1 <= var8) {
            dg.a(param4, param3, param4 + var7, 28 + param3);
            param2.e(param4, param3);
            dg.c();
            return;
          } else {
            var7 = var7 + ad.field_m[var8];
            var8++;
            continue L3;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 >= -71) {
            field_p = 32;
        }
        if (!(0 != (param0 ^ -1))) {
            return;
        }
        be var2 = jga.field_y[param0];
        if (!(var2 == null)) {
            cq discarded$0 = ol.a(var2, true);
        }
    }

    private final int a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        for (var4 = param1; var4 < param0.length; var4++) {
            if (param0[var4] == param2) {
                return var4;
            }
        }
        return -1;
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 1) {
            return;
        }
        field_o = null;
        field_f = null;
        field_y = null;
    }

    mk(jfa param0, boolean param1, int param2) {
        int var5 = 0;
        if (param0 == null) {
        }
        ((mk) this).field_l = param1 ? true : false;
        ((mk) this).field_e = param2;
        rn.field_s = param0;
        ko.field_f = rn.field_s.field_g.field_o.field_g;
        ((mk) this).field_v = rn.field_s.field_g.field_n;
        ((mk) this).field_k = new int[rn.field_s.field_g.field_m.length];
        bl.a(rn.field_s.field_g.field_m, 0, ((mk) this).field_k, 0, ((mk) this).field_k.length);
        ((mk) this).field_d = rn.field_s.field_g.field_k;
        ((mk) this).field_s = rn.field_s.field_g.e((byte) -121);
        rn.field_v = mka.a(13558251, 13558251, 13558251, (byte) -123, (po) (Object) jha.field_g, 13558251, 16777215, 13558251);
        rn.field_v.field_eb = wd.field_w;
        rn.field_v.field_A = bla.field_p;
        rn.field_v.field_db = op.field_I;
        rn.field_v.field_N = 1;
        ((mk) this).field_u = new sna("confirm", rn.field_v, 470, 320, jha.field_g.a(di.field_l) - -40, 40, di.field_l);
        hha.field_w = new hw[5];
        bf.field_g = new hw[15];
        uma.n(1);
        kv var8 = new kv(350, 80);
        var8.b();
        dg.c(0, 0, 330, 30, 5667119);
        hp.a(330, 0, (byte) -65, 30, de.field_A, 0);
        ((mk) this).field_i = new kv(340, 60);
        ((mk) this).field_i.b();
        var8.d(180, 60, 100, 4096);
        kv var9 = new kv(112, 30);
        var9.b();
        dg.d();
        dg.c(0, 0, 112, 30, 6127926);
        hp.a(112, 0, (byte) -42, 30, de.field_A, 0);
        ((mk) this).field_j = new kv(120, 60);
        ((mk) this).field_j.b();
        var9.d(60, 30, 0, 4096);
        ((mk) this).field_b = new kv(120, 60);
        ((mk) this).field_b.b();
        var9.d(60, 30, -100, 4096);
        kv var10 = new kv(120, 30);
        var10.b();
        dg.d();
        dg.c(0, 0, 100, 30, 6127926);
        hp.a(100, 0, (byte) 106, 30, de.field_A, 0);
        ((mk) this).field_c = new kv(120, 60);
        ((mk) this).field_c.b();
        var10.d(60, 30, 200, 4096);
        ((mk) this).field_a = new kv(120, 60);
        ((mk) this).field_a.b();
        var10.d(60, 30, -200, 4096);
        kv var11 = new kv(180, 30);
        var11.b();
        dg.c(0, 0, 180, 30, 6127926);
        hp.a(180, 0, (byte) -23, 30, de.field_A, 0);
        ((mk) this).field_g = new kv(200, 60);
        ((mk) this).field_g.b();
        var11.d(100, 30, 200, 4096);
        hga.field_U.a((byte) 21);
        ((mk) this).field_n = new int[256];
        for (var5 = 0; -257 < (var5 ^ -1); var5++) {
            ((mk) this).field_n[var5] = var5 * 65793;
        }
        ((mk) this).field_w = new int[256];
        int var7 = 0;
        var5 = var7;
        while (-257 < (var7 ^ -1)) {
            ((mk) this).field_w[var7] = 257 * var7;
            var7++;
        }
        ((mk) this).field_q = new kv(25, 25);
        ((mk) this).field_q.b();
        dg.a(208, 208, 192, 255, ((mk) this).field_n);
        ((mk) this).field_r = new kv(25, 25);
        ((mk) this).field_r.b();
        dg.a(208, 208, 192, 255, ((mk) this).field_w);
        hga.field_U.a((byte) 125);
        ((mk) this).field_s.a((byte) 65, rn.field_s.field_g.field_o.field_b, 0);
        rn.field_s.field_g.field_f = -1;
        qm.a(13, 7758);
        ct.c(0, -121);
        int[] discarded$0 = a.a(15843842, 32, 16763049, 16435458);
        uca.a(16, (byte) -61);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new qia();
        field_y = "(<%0> players want to join)";
        field_f = "Invalid name";
        field_p = 0;
    }
}
