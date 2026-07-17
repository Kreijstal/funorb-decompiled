/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class StarCannon extends ag {
    private int field_D;
    static int[] field_y;
    static String field_C;
    static int field_z;
    private int field_B;
    static char field_E;
    public static int field_A;

    private final void t(int param0) {
        if (!(null == fb.field_g)) {
            vb.a(fb.field_g, 30962);
            fb.field_g = null;
            tc.j(param0 ^ -23491);
        }
        lj.field_h = b.a(false, 1);
        nd.field_p = b.a(false, 2);
        if (param0 != -23523) {
            return;
        }
        se.field_l = b.a(false, 3);
        jg.field_F = b.a(false, 4);
        cb.field_c = b.a(false, 5);
        ej.a(fi.field_f, lf.field_eb, param0 + 23396);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        id[] var10_ref_id__ = null;
        String var10_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        id[] var14 = null;
        bf var15 = null;
        String var16 = null;
        String var17 = null;
        int[] var21 = null;
        Object stackIn_44_0 = null;
        d stackIn_44_1 = null;
        Object stackOut_43_0 = null;
        d stackOut_43_1 = null;
        var13 = field_A;
        var3 = 0;
        L0: while (true) {
          if (var3 >= 4000) {
            L1: {
              param0 = 100 + -param0 >> 2;
              if (qc.field_d < 1) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 4000) {
                    break L1;
                  } else {
                    L3: {
                      if (qc.field_c[var3] == null) {
                        break L3;
                      } else {
                        if (qc.field_c[var3].field_h == 3) {
                          qc.field_c[var3].a(320 + -fi.field_e.field_f, -91);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                fh.field_q.d(0, vd.field_j, 640, 480, 128);
                fh.field_q.d(0, -480 + vd.field_j, 640, 480, 128);
                break L1;
              }
            }
            if (param1 == 7306) {
              var15 = (bf) (Object) kh.field_y.c(-3905);
              L4: while (true) {
                if (var15 == null) {
                  var3 = 0;
                  L5: while (true) {
                    if (var3 >= 4000) {
                      var3 = 0;
                      L6: while (true) {
                        if (var3 >= 4000) {
                          L7: {
                            if (qc.field_d == 2) {
                              gi.a(param1 + -7302);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var3 = 0;
                          L8: while (true) {
                            if (var3 >= 4000) {
                              L9: {
                                if (gj.field_c > -1) {
                                  L10: {
                                    var3 = af.field_y.a(vk.field_w);
                                    ba.a(24, gb.field_v, (byte) -127, -var3 + 587, 17 + var3, 455 + param0);
                                    nb.a(param0 + 455, (byte) 122, var3 - -17, ma.field_e, -17 + -var3 + 604, 128, 24);
                                    af.field_y.c(vk.field_w, 596, 472 + param0, 16777215, -1);
                                    ba.a(24, ma.field_a, (byte) 21, 604, 35, 455 - -param0);
                                    nb.a(455 - -param0, (byte) 122, 35, ha.field_a, 604, 128, 24);
                                    vb.field_l.e(609, param0 + 460);
                                    af.field_y.a(Integer.toString(gj.field_c), 626, 472 - -param0, 16777215, -1);
                                    var4_ref_String = be.field_b;
                                    var5 = 65535;
                                    var6 = 32896;
                                    if (qb.field_e != 1) {
                                      break L10;
                                    } else {
                                      var5 = 65280;
                                      var6 = 32768;
                                      var4_ref_String = b.field_d;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (qb.field_e == 2) {
                                      var4_ref_String = ve.field_g;
                                      var5 = 16776960;
                                      var6 = 16711680;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    var7 = 6;
                                    if (rj.field_h != 1) {
                                      break L12;
                                    } else {
                                      var7 = 10;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (rj.field_h == 2) {
                                      var7 = 16;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (3 == rj.field_h) {
                                      var7 = 17;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var3 = af.field_y.a(var4_ref_String);
                                  ba.a(24, gb.field_v, (byte) -122, 1, var3 - -17, 455 - -param0);
                                  nb.a(param0 + 455, (byte) 122, var3 + 17, ma.field_e, 1, 128, 24);
                                  af.field_y.a(var4_ref_String, 10, 472 - -param0, 16777215, -1);
                                  var8 = 23 + var3;
                                  ba.a(24, ma.field_a, (byte) -115, var8 - 5, 10 + var7 * 5, param0 + 455);
                                  nb.a(param0 + 455, (byte) 122, 10 + var7 * 5, ha.field_a, var8 + -5, 128, 24);
                                  var9 = 0;
                                  L15: while (true) {
                                    if (var7 <= var9) {
                                      L16: {
                                        if (ie.field_C <= 0) {
                                          break L16;
                                        } else {
                                          var9 = -(af.field_y.field_p / 2) + af.field_w[16 + qb.field_e].field_e + -16;
                                          af.field_w[qb.field_e + 16].field_f = af.field_w[qb.field_e + 16].field_f + var9;
                                          var16 = p.field_e;
                                          var14 = new id[1];
                                          var10_ref_id__ = var14;
                                          var14[0] = af.field_w[16 + qb.field_e];
                                          af.field_y.a((ne[]) (Object) var10_ref_id__, (int[]) null);
                                          af.field_y.a(var16, 319, 48, var6, -1, 256 - param0 * 10);
                                          af.field_y.a(var16, 321, 48, var5, -1, -(param0 * 10) + 256);
                                          af.field_y.a(var16, 320, 47, var5, -1, -(10 * param0) + 256);
                                          af.field_y.a(var16, 320, 49, var6, -1, -(param0 * 10) + 256);
                                          af.field_y.a(var16, 320, 48, 16777215, -1, -(param0 * 10) + 256);
                                          af.field_w[qb.field_e + 16].field_f = af.field_w[qb.field_e + 16].field_f - var9;
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        var9 = 10 * ia.field_k;
                                        if (nf.field_l == 0) {
                                          var9 = var9 >> 2;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        if (nf.field_l == 2) {
                                          var9 = var9 << 1;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        if (!a.field_a) {
                                          L20: {
                                            var3 = af.field_y.a(rd.field_o);
                                            ba.a(24, gb.field_v, (byte) -118, -var3 + 311, 17 + var3, -param0 + 1);
                                            nb.a(1 + -param0, (byte) 122, var3 + 17, ma.field_e, 311 - var3, 128, 24);
                                            af.field_y.c(rd.field_o, 320, -param0 + 18, 16777215, -1);
                                            var17 = Integer.toString(var9);
                                            var3 = 11 + af.field_y.a(var17);
                                            var11 = 5 - var3 % 5;
                                            if (var11 < 5) {
                                              var3 = var3 + var11;
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          ba.a(24, ma.field_a, (byte) -113, 328, var3, -param0 + 1);
                                          nb.a(-param0 + 1, (byte) 122, var3, ha.field_a, 328, 128, 24);
                                          af.field_y.a(var17, 333, -param0 + 18, 16777215, -1);
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                      if (ua.field_c >= -2) {
                                        break L9;
                                      } else {
                                        L21: {
                                          if (gj.field_c != 0) {
                                            break L21;
                                          } else {
                                            if (fi.field_e.field_k != 0) {
                                              break L21;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        L22: {
                                          var10_ref_String = "";
                                          if (rj.field_h == 0) {
                                            var10_ref_String = eg.field_i;
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        }
                                        L23: {
                                          if (rj.field_h == 1) {
                                            var10_ref_String = ig.field_c;
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                        L24: {
                                          if (2 == rj.field_h) {
                                            var10_ref_String = qc.field_a;
                                            break L24;
                                          } else {
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          if (3 != rj.field_h) {
                                            break L25;
                                          } else {
                                            if (nf.field_l != 2) {
                                              break L25;
                                            } else {
                                              var10_ref_String = vf.field_a;
                                              break L25;
                                            }
                                          }
                                        }
                                        L26: {
                                          if (rj.field_h != 4) {
                                            break L26;
                                          } else {
                                            if (u.field_d <= 0) {
                                              var10_ref_String = bc.field_l + var9 + sb.field_o;
                                              break L26;
                                            } else {
                                              if (nf.field_l == 0) {
                                                var10_ref_String = d.field_n + var9 + jf.field_b;
                                                break L26;
                                              } else {
                                                if (1 == nf.field_l) {
                                                  var10_ref_String = d.field_n + var9 + eh.field_c;
                                                  break L26;
                                                } else {
                                                  var10_ref_String = jg.field_I + var9;
                                                  break L26;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        int discarded$1 = af.field_y.a(var10_ref_String, 0, 0, 640, 480, 16777215, -1, -(10 * param0) + 256, 1, 1, af.field_y.field_p);
                                        break L9;
                                      }
                                    } else {
                                      L27: {
                                        if (~var9 <= ~sd.field_c) {
                                          ki.d(var8, 465 + param0, 4, 4, var5);
                                          break L27;
                                        } else {
                                          ki.d(var8, 460 - -param0, 4, 14, var5);
                                          break L27;
                                        }
                                      }
                                      var8 += 5;
                                      var9++;
                                      continue L15;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              L28: {
                                if (tj.field_C > 0) {
                                  L29: {
                                    var3 = 255 * dl.field_a / tj.field_C;
                                    var4 = 0;
                                    var5 = 0;
                                    var6 = 0;
                                    if (var3 >= 128) {
                                      var5 = 255;
                                      var4 = -(var3 * 2) + 511;
                                      break L29;
                                    } else {
                                      var4 = 255;
                                      var5 = var3 * 2;
                                      break L29;
                                    }
                                  }
                                  var6 = (var4 << 16) - -(var5 << 8);
                                  var7 = 0;
                                  L30: while (true) {
                                    if (var7 >= var3) {
                                      af.field_y.a(s.field_h, 319, 38, 0, -1, var3);
                                      af.field_y.a(s.field_h, 321, 38, 0, -1, var3);
                                      af.field_y.a(s.field_h, 320, 37, 0, -1, var3);
                                      af.field_y.a(s.field_h, 320, 39, 0, -1, var3);
                                      af.field_y.a(s.field_h, 320, 38, 16777215, -1, var3);
                                      break L28;
                                    } else {
                                      L31: {
                                        L32: {
                                          if (var7 < 10) {
                                            break L32;
                                          } else {
                                            if (var7 > -10 + var3) {
                                              break L32;
                                            } else {
                                              if (10 != var7) {
                                                break L31;
                                              } else {
                                                ki.d(-(var3 >> 1) + (320 - -var7) - 5, 27, 10 + (var3 - 20), 11, var6);
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                        ki.c(320 + (var7 - (var3 >> 1)), 32, 5, var6, 255 - Math.abs(var7 + -(var3 >> 1)));
                                        break L31;
                                      }
                                      var7++;
                                      continue L30;
                                    }
                                  }
                                } else {
                                  break L28;
                                }
                              }
                              L33: {
                                if (0 != fi.field_e.field_k) {
                                  break L33;
                                } else {
                                  L34: {
                                    if (gj.field_c != 0) {
                                      break L34;
                                    } else {
                                      L35: {
                                        if (fi.field_e.field_r >= 25) {
                                          if (165 >= fi.field_e.field_r) {
                                            var3 = 100;
                                            break L35;
                                          } else {
                                            var3 = 190 + -fi.field_e.field_r << 2;
                                            break L35;
                                          }
                                        } else {
                                          var3 = fi.field_e.field_r << 2;
                                          break L35;
                                        }
                                      }
                                      var4 = a.field_b.a(ne.field_i);
                                      var5 = -60 + (-var4 + 640) >> 1;
                                      var6 = -var5 + 640;
                                      var7 = var6 + -var5;
                                      var8 = 210;
                                      var9 = 270;
                                      var10 = var9 + var8 >> 1;
                                      var9 = (var10 * (-var3 + 100) - -(var3 * var9)) / 100;
                                      var8 = (var8 * var3 + var10 * (100 - var3)) / 100;
                                      var11 = var9 + (-var8 + 5);
                                      if (var11 <= 0) {
                                        break L34;
                                      } else {
                                        var21 = new int[4];
                                        ki.a(var21);
                                        ki.c(var5, var8, var5 + var7, var8 - -var11);
                                        ki.b(var5 - -19, 14 + var8, var7 - 38, -28 + var11, 0, 128);
                                        ba.a(var11, rd.field_p, (byte) 115, var5, var7, var8);
                                        sb.a(true, var7, 10596798, 0, var8, 16711680, var5, var11 >> 1);
                                        sb.a(true, var7, 0, 10596798, (var11 >> 1) + var8, 16711680, var5, -(var11 >> 1) + var11);
                                        ki.c(var5 + 19, var8 + 14, var7 + (var5 + -19), -14 + (var11 + var8));
                                        a.field_b.b(ne.field_i, 320, (a.field_b.field_p + -a.field_b.field_q >> 1) + 240, 16777215, -1);
                                        ki.b(var21);
                                        break L34;
                                      }
                                    }
                                  }
                                  break L33;
                                }
                              }
                              return;
                            } else {
                              stackOut_43_0 = null;
                              stackOut_43_1 = qc.field_c[var3];
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              L36: {
                                if (stackIn_44_0 == (Object) (Object) stackIn_44_1) {
                                  break L36;
                                } else {
                                  if (2 == qc.field_c[var3].field_h) {
                                    qc.field_c[var3].b(-fi.field_e.field_f + 320, param1 ^ 7178);
                                    qc.field_c[var3].a(320 - fi.field_e.field_f, -56);
                                    break L36;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              var3++;
                              continue L8;
                            }
                          }
                        } else {
                          L37: {
                            if (qc.field_c[var3] == null) {
                              break L37;
                            } else {
                              if (qc.field_c[var3].field_h == 2) {
                                qc.field_c[var3].b(-fi.field_e.field_f + 320, 128);
                                qc.field_c[var3].a(-fi.field_e.field_f + 320, param1 ^ 7322);
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                          }
                          var3++;
                          continue L6;
                        }
                      }
                    } else {
                      L38: {
                        if (null == qc.field_c[var3]) {
                          break L38;
                        } else {
                          if (qc.field_c[var3].field_h == 2) {
                            break L38;
                          } else {
                            if (qc.field_c[var3].field_h == 3) {
                              break L38;
                            } else {
                              if (qc.field_c[var3].field_h != 4) {
                                qc.field_c[var3].a(-fi.field_e.field_f + 320, 54);
                                break L38;
                              } else {
                                break L38;
                              }
                            }
                          }
                        }
                      }
                      var3++;
                      continue L5;
                    }
                  }
                } else {
                  var15.a(65535, 320 - fi.field_e.field_f);
                  var15 = (bf) (Object) kh.field_y.a(-16913);
                  continue L4;
                }
              }
            } else {
              return;
            }
          } else {
            L39: {
              if (qc.field_c[var3] == null) {
                break L39;
              } else {
                if (qc.field_c[var3].field_h == 4) {
                  qc.field_c[var3].a(320 + -fi.field_e.field_f, 123);
                  break L39;
                } else {
                  break L39;
                }
              }
            }
            var3++;
            continue L0;
          }
        }
    }

    final void c(boolean param0) {
        L0: {
          gj.field_c = gj.field_c + 1;
          dg.field_l = 0;
          mj.a(96, 12, 0, 23, 100);
          mj.a(255, 12, 1200, 45, 100);
          if (param0) {
            break L0;
          } else {
            ((StarCannon) this).q(-66);
            break L0;
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (!(!param3)) {
            var4 += 2;
        }
        if (param0) {
            field_E = 'B';
        }
        if (param2) {
            var4++;
        }
        return el.field_A[var4];
    }

    final void n(int param0) {
        int var3 = 0;
        L0: {
          var3 = field_A;
          if (ha.field_c != 0) {
            if (ha.field_c == 1) {
              pf.field_d = pf.field_d + 1;
              dg.field_l = 0;
              ha.field_c = 2;
              mj.a(96, 12, 0, 31, 100);
              mj.a(255, 12, 1200, 36, 100);
              break L0;
            } else {
              if (1 < ha.field_c) {
                L1: {
                  ha.field_c = ha.field_c + 1;
                  pf.field_d = pf.field_d + 1;
                  if (ha.field_c != 5) {
                    break L1;
                  } else {
                    li.a(-115, new bf(0, -128, -40, 14));
                    li.a(-126, new bf(0, -128, 40, 14));
                    if (hh.field_c == 1) {
                      ph.a(249, false, 6);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                dg.field_l = 0;
                mj.a(96, param0 + 12, 0, 31, 100);
                mj.a(255, 12, 1200, 36, 100);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            pf.field_d = pf.field_d + 1;
            ha.field_c = 1;
            li.a(-119, new bf(0, -128, -24, 6));
            li.a(param0 ^ -124, new bf(0, -128, 24, 6));
            dg.field_l = 0;
            mj.a(96, 12, 0, 31, 100);
            mj.a(255, 12, 1200, 36, 100);
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            field_E = 'ﾌ';
            break L2;
          }
        }
    }

    final void q(int param0) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = field_A;
          if (param0 == -19049) {
            break L0;
          } else {
            var4 = null;
            StarCannon.a((ue) null, false, 0, (ue) null, (ue) null);
            break L0;
          }
        }
        L1: {
          if (bf.field_w != 0) {
            if (bf.field_w != 1) {
              if (bf.field_w >= 4) {
                if (hh.field_c == 0) {
                  hh.field_c = 1;
                  li.a(param0 ^ 18960, new bf(0, -128, 0, 13));
                  dg.field_l = 0;
                  mj.a(96, 12, 0, 46, 100);
                  mj.a(255, param0 ^ -19045, 1200, 38, 100);
                  if (ha.field_c != 5) {
                    break L1;
                  } else {
                    ph.a(249, false, 6);
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                bf.field_w = bf.field_w + 1;
                dg.field_l = 0;
                pf.field_d = pf.field_d + 1;
                mj.a(96, 12, 0, 29, 100);
                mj.a(255, 12, 1200, 40, 100);
                break L1;
              }
            } else {
              bf.field_w = 2;
              dg.field_l = 0;
              pf.field_d = pf.field_d + 1;
              mj.a(96, 12, 0, 29, 100);
              mj.a(255, 12, 1200, 40, 100);
              break L1;
            }
          } else {
            bf.field_w = 1;
            pf.field_d = pf.field_d + 1;
            li.a(-121, new bf(0, -128, 0, 8));
            dg.field_l = 0;
            mj.a(96, 12, 0, 29, 100);
            mj.a(255, param0 ^ -19045, 1200, 40, 100);
            break L1;
          }
        }
    }

    public final void init() {
        ((StarCannon) this).a(-15028, 10, "starcannon");
    }

    private final void p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        bf var6 = null;
        int var7 = 0;
        bf var7_ref_bf = null;
        bf var8 = null;
        int var9 = 0;
        bf stackIn_41_0 = null;
        bf stackIn_42_0 = null;
        bf stackIn_43_0 = null;
        bf stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        bf stackIn_51_0 = null;
        bf stackIn_52_0 = null;
        bf stackIn_53_0 = null;
        bf stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        bf stackIn_61_0 = null;
        bf stackIn_62_0 = null;
        bf stackIn_63_0 = null;
        bf stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        bf stackIn_69_0 = null;
        bf stackIn_70_0 = null;
        bf stackIn_71_0 = null;
        bf stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        bf stackOut_68_0 = null;
        bf stackOut_69_0 = null;
        bf stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        bf stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        bf stackOut_60_0 = null;
        bf stackOut_61_0 = null;
        bf stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        bf stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        bf stackOut_50_0 = null;
        bf stackOut_51_0 = null;
        bf stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        bf stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        bf stackOut_40_0 = null;
        bf stackOut_41_0 = null;
        bf stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        bf stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        L0: {
          var9 = field_A;
          var2 = ua.field_c - -5;
          if (~(5 + ue.field_c[rj.field_h]) <= ~var2) {
            break L0;
          } else {
            if (~ue.field_c[rj.field_h] > ~ua.field_c) {
              break L0;
            } else {
              var2 = 5 + ue.field_c[rj.field_h];
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var3 = sh.b(-126, 640);
            var4 = -64 + fi.field_e.field_f - -sh.b(38, 128);
            var5 = null;
            var7 = var2;
            if (var7 == 1) {
              break L2;
            } else {
              if (var7 == 2) {
                break L2;
              } else {
                if (var7 == 3) {
                  break L2;
                } else {
                  if (4 != var7) {
                    L3: {
                      if (var7 != 5) {
                        L4: {
                          if (9 != var7) {
                            if (11 != var7) {
                              if (var7 != 6) {
                                if (var7 == 10) {
                                  nf.field_e = nf.field_e + 250;
                                  var7_ref_bf = new bf(320, -256, var4, 15);
                                  kh.field_y.b(69, (rf) (Object) var7_ref_bf);
                                  dg.field_l = 0;
                                  ua.field_c = 6;
                                  mj.a(255, 12, 0, 41, 100);
                                  ti.field_f.a((oa) (Object) kc.field_P);
                                  kc.field_P.f();
                                  kc.field_P = fl.field_h;
                                  ti.field_f.b((oa) (Object) kc.field_P);
                                  kc.field_P.a(mc.field_b);
                                  break L1;
                                } else {
                                  if (7 != var7) {
                                    L5: {
                                      if (var7 != 8) {
                                        if (var7 != 13) {
                                          L6: {
                                            if (var7 == 12) {
                                              break L6;
                                            } else {
                                              if (14 == var7) {
                                                break L6;
                                              } else {
                                                if (var7 != 15) {
                                                  break L1;
                                                } else {
                                                  var6 = new bf(320, -256, var4, 16);
                                                  kh.field_y.b(97, (rf) (Object) var6);
                                                  tj.field_C = var6.field_k;
                                                  ua.field_c = 1 + ue.field_c[rj.field_h];
                                                  dg.field_l = 0;
                                                  pf.field_d = pf.field_d + 1;
                                                  mj.a(255, 12, 0, 41, 100);
                                                  ti.field_f.a((oa) (Object) kc.field_P);
                                                  kc.field_P.f();
                                                  kc.field_P = fl.field_h;
                                                  ti.field_f.b((oa) (Object) kc.field_P);
                                                  kc.field_P.a(mc.field_b);
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                          nf.field_e = 175;
                                          kh.field_y.b(82, (rf) (Object) new bf(var3, -64, var4, 4));
                                          break L1;
                                        } else {
                                          break L5;
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                    nf.field_e = 0;
                                    var4 = sh.b(-128, 128) + (var3 + -64);
                                    var7 = 0;
                                    L7: while (true) {
                                      if (5 <= var7) {
                                        break L3;
                                      } else {
                                        L8: {
                                          L9: {
                                            var8 = new bf(var3, 64 * -var7 + -64, var4, 2);
                                            stackOut_68_0 = (bf) var8;
                                            stackIn_71_0 = stackOut_68_0;
                                            stackIn_69_0 = stackOut_68_0;
                                            if (1 == var7) {
                                              break L9;
                                            } else {
                                              stackOut_69_0 = (bf) (Object) stackIn_69_0;
                                              stackIn_71_0 = stackOut_69_0;
                                              stackIn_70_0 = stackOut_69_0;
                                              if (var7 == 4) {
                                                break L9;
                                              } else {
                                                stackOut_70_0 = (bf) (Object) stackIn_70_0;
                                                stackOut_70_1 = 1;
                                                stackIn_72_0 = stackOut_70_0;
                                                stackIn_72_1 = stackOut_70_1;
                                                break L8;
                                              }
                                            }
                                          }
                                          stackOut_71_0 = (bf) (Object) stackIn_71_0;
                                          stackOut_71_1 = 0;
                                          stackIn_72_0 = stackOut_71_0;
                                          stackIn_72_1 = stackOut_71_1;
                                          break L8;
                                        }
                                        L10: {
                                          stackIn_72_0.field_p = stackIn_72_1 != 0;
                                          var8.field_h = (bf) var5;
                                          if (var7 != 0) {
                                            break L10;
                                          } else {
                                            var5 = (Object) (Object) var8;
                                            break L10;
                                          }
                                        }
                                        kh.field_y.b(111, (rf) (Object) var8);
                                        var7++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    nf.field_e = 0;
                                    var7 = 0;
                                    L11: while (true) {
                                      if (var7 >= 5) {
                                        break L1;
                                      } else {
                                        L12: {
                                          L13: {
                                            var8 = new bf(var3, 64 * -var7 + -64, var4, 1);
                                            stackOut_60_0 = (bf) var8;
                                            stackIn_63_0 = stackOut_60_0;
                                            stackIn_61_0 = stackOut_60_0;
                                            if (var7 == 1) {
                                              break L13;
                                            } else {
                                              stackOut_61_0 = (bf) (Object) stackIn_61_0;
                                              stackIn_63_0 = stackOut_61_0;
                                              stackIn_62_0 = stackOut_61_0;
                                              if (var7 == 4) {
                                                break L13;
                                              } else {
                                                stackOut_62_0 = (bf) (Object) stackIn_62_0;
                                                stackOut_62_1 = 1;
                                                stackIn_64_0 = stackOut_62_0;
                                                stackIn_64_1 = stackOut_62_1;
                                                break L12;
                                              }
                                            }
                                          }
                                          stackOut_63_0 = (bf) (Object) stackIn_63_0;
                                          stackOut_63_1 = 0;
                                          stackIn_64_0 = stackOut_63_0;
                                          stackIn_64_1 = stackOut_63_1;
                                          break L12;
                                        }
                                        stackIn_64_0.field_p = stackIn_64_1 != 0;
                                        kh.field_y.b(101, (rf) (Object) var8);
                                        var7++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              } else {
                                nf.field_e = nf.field_e + 250;
                                var7_ref_bf = new bf(320, -256, var4, 11);
                                kh.field_y.b(86, (rf) (Object) var7_ref_bf);
                                dg.field_l = 0;
                                ua.field_c = 2;
                                mj.a(255, 12, 0, 41, 100);
                                ti.field_f.a((oa) (Object) kc.field_P);
                                kc.field_P.f();
                                kc.field_P = fl.field_h;
                                ti.field_f.b((oa) (Object) kc.field_P);
                                kc.field_P.a(mc.field_b);
                                break L1;
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        nf.field_e = 0;
                        var7 = -8;
                        L14: while (true) {
                          if (var7 >= 8) {
                            break L1;
                          } else {
                            L15: {
                              L16: {
                                var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                                stackOut_50_0 = (bf) var8;
                                stackIn_53_0 = stackOut_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                if (1 == var7) {
                                  break L16;
                                } else {
                                  stackOut_51_0 = (bf) (Object) stackIn_51_0;
                                  stackIn_53_0 = stackOut_51_0;
                                  stackIn_52_0 = stackOut_51_0;
                                  if (var7 == 4) {
                                    break L16;
                                  } else {
                                    stackOut_52_0 = (bf) (Object) stackIn_52_0;
                                    stackOut_52_1 = 1;
                                    stackIn_54_0 = stackOut_52_0;
                                    stackIn_54_1 = stackOut_52_1;
                                    break L15;
                                  }
                                }
                              }
                              stackOut_53_0 = (bf) (Object) stackIn_53_0;
                              stackOut_53_1 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              stackIn_54_1 = stackOut_53_1;
                              break L15;
                            }
                            stackIn_54_0.field_p = stackIn_54_1 != 0;
                            kh.field_y.b(123, (rf) (Object) var8);
                            var7++;
                            continue L14;
                          }
                        }
                      } else {
                        nf.field_e = 0;
                        var4 = sh.b(-127, 128) + (var3 + -64);
                        var7 = 0;
                        L17: while (true) {
                          if (var7 >= 5) {
                            break L3;
                          } else {
                            L18: {
                              L19: {
                                var8 = new bf(var3, 64 * -var7 - 64, var4, 2);
                                var8.field_h = (bf) var5;
                                stackOut_40_0 = (bf) var8;
                                stackIn_43_0 = stackOut_40_0;
                                stackIn_41_0 = stackOut_40_0;
                                if (var7 == 1) {
                                  break L19;
                                } else {
                                  stackOut_41_0 = (bf) (Object) stackIn_41_0;
                                  stackIn_43_0 = stackOut_41_0;
                                  stackIn_42_0 = stackOut_41_0;
                                  if (var7 == 4) {
                                    break L19;
                                  } else {
                                    stackOut_42_0 = (bf) (Object) stackIn_42_0;
                                    stackOut_42_1 = 1;
                                    stackIn_44_0 = stackOut_42_0;
                                    stackIn_44_1 = stackOut_42_1;
                                    break L18;
                                  }
                                }
                              }
                              stackOut_43_0 = (bf) (Object) stackIn_43_0;
                              stackOut_43_1 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              break L18;
                            }
                            L20: {
                              stackIn_44_0.field_p = stackIn_44_1 != 0;
                              if (var7 != 0) {
                                break L20;
                              } else {
                                var5 = (Object) (Object) var8;
                                break L20;
                              }
                            }
                            kh.field_y.b(118, (rf) (Object) var8);
                            var7++;
                            continue L17;
                          }
                        }
                      }
                    }
                    break L1;
                  } else {
                    nf.field_e = var2 * 25 + 75;
                    kh.field_y.b(122, (rf) (Object) new bf(var3, -64, var4, 4));
                    break L1;
                  }
                }
              }
            }
          }
          nf.field_e = var2 * 25 + 75;
          kh.field_y.b(122, (rf) (Object) new bf(var3, -64, var4, 4));
          break L1;
        }
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        bf var6 = null;
        int var7 = 0;
        Object var7_ref = null;
        int var8_int = 0;
        bf var8 = null;
        bf var9 = null;
        int var10 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        L0: {
          var10 = field_A;
          var2 = sh.b(-128, 3) + ua.field_c;
          if (ue.field_c[rj.field_h] >= var2) {
            break L0;
          } else {
            if (ue.field_c[rj.field_h] < ua.field_c) {
              break L0;
            } else {
              var2 = ue.field_c[rj.field_h];
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            field_C = null;
            break L1;
          }
        }
        L2: {
          var3 = sh.b(-126, 640);
          var4 = -64 + (fi.field_e.field_f - -sh.b(91, 128));
          if (var2 != 6) {
            break L2;
          } else {
            if (!gi.field_g) {
              break L2;
            } else {
              var2 = 12;
              break L2;
            }
          }
        }
        L3: {
          L4: {
            var7 = var2;
            if (0 == var7) {
              var4 = var3;
              break L4;
            } else {
              if (var7 == 1) {
                break L4;
              } else {
                L5: {
                  L6: {
                    if (var7 == 2) {
                      break L6;
                    } else {
                      if (var7 == 5) {
                        break L6;
                      } else {
                        L7: {
                          if (var7 == 3) {
                            break L7;
                          } else {
                            if (var7 == 9) {
                              break L7;
                            } else {
                              if (var7 != 11) {
                                L8: {
                                  if (4 == var7) {
                                    break L8;
                                  } else {
                                    if (10 != var7) {
                                      if (var7 != 6) {
                                        if (var7 != 7) {
                                          L9: {
                                            if (var7 != 8) {
                                              if (var7 != 13) {
                                                L10: {
                                                  if (var7 != 12) {
                                                    if (var7 != 14) {
                                                      if (var7 == 15) {
                                                        var6 = new bf(320, -256, var4, 11);
                                                        kh.field_y.b(101, (rf) (Object) var6);
                                                        tj.field_C = var6.field_k;
                                                        ua.field_c = 1 + ue.field_c[rj.field_h];
                                                        pf.field_d = pf.field_d + 1;
                                                        dg.field_l = 0;
                                                        mj.a(255, 12, 0, 41, 100);
                                                        ti.field_f.a((oa) (Object) kc.field_P);
                                                        kc.field_P.f();
                                                        kc.field_P = fl.field_h;
                                                        ti.field_f.b((oa) (Object) kc.field_P);
                                                        kc.field_P.a(mc.field_b);
                                                        break L3;
                                                      } else {
                                                        break L3;
                                                      }
                                                    } else {
                                                      break L10;
                                                    }
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                nf.field_e = 175;
                                                kh.field_y.b(77, (rf) (Object) new bf(var3, -64, var4, 4));
                                                break L3;
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                          var5 = null;
                                          nf.field_e = 0;
                                          var4 = -64 + var3 - -sh.b(-127, 128);
                                          var7 = 0;
                                          L11: while (true) {
                                            L12: {
                                              stackOut_80_0 = ~var7;
                                              stackIn_82_0 = stackOut_80_0;
                                              stackIn_81_0 = stackOut_80_0;
                                              if (2 == nf.field_l) {
                                                stackOut_82_0 = stackIn_82_0;
                                                stackOut_82_1 = 10;
                                                stackIn_83_0 = stackOut_82_0;
                                                stackIn_83_1 = stackOut_82_1;
                                                break L12;
                                              } else {
                                                stackOut_81_0 = stackIn_81_0;
                                                stackOut_81_1 = 5;
                                                stackIn_83_0 = stackOut_81_0;
                                                stackIn_83_1 = stackOut_81_1;
                                                break L12;
                                              }
                                            }
                                            if (stackIn_83_0 <= ~stackIn_83_1) {
                                              break L3;
                                            } else {
                                              L13: {
                                                var8 = new bf(var3, -var7 * 64 - 64, var4, 2);
                                                var8.field_h = (bf) var5;
                                                if (var7 == 0) {
                                                  var5 = (Object) (Object) var8;
                                                  break L13;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                              kh.field_y.b(param0 + 69, (rf) (Object) var8);
                                              var7++;
                                              continue L11;
                                            }
                                          }
                                        } else {
                                          nf.field_e = 0;
                                          var7 = 0;
                                          L14: while (true) {
                                            if (var7 >= 5) {
                                              break L3;
                                            } else {
                                              kh.field_y.b(126, (rf) (Object) new bf(var3, -64 + 64 * -var7, var4, 1));
                                              var7++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      } else {
                                        nf.field_e = 100;
                                        var7_ref = null;
                                        var8_int = 0;
                                        L15: while (true) {
                                          L16: {
                                            stackOut_68_0 = var8_int;
                                            stackIn_70_0 = stackOut_68_0;
                                            stackIn_69_0 = stackOut_68_0;
                                            if (nf.field_l == 2) {
                                              stackOut_70_0 = stackIn_70_0;
                                              stackOut_70_1 = 2;
                                              stackIn_71_0 = stackOut_70_0;
                                              stackIn_71_1 = stackOut_70_1;
                                              break L16;
                                            } else {
                                              stackOut_69_0 = stackIn_69_0;
                                              stackOut_69_1 = 1;
                                              stackIn_71_0 = stackOut_69_0;
                                              stackIn_71_1 = stackOut_69_1;
                                              break L16;
                                            }
                                          }
                                          if (stackIn_71_0 >= stackIn_71_1) {
                                            break L5;
                                          } else {
                                            var9 = new bf(var3, -var8_int * 64 + -64, sh.b(param0 + 76, 128) - 64, 5);
                                            var9.field_h = (bf) var7_ref;
                                            var9.field_p = true;
                                            kh.field_y.b(125, (rf) (Object) var9);
                                            var7_ref = (Object) (Object) var9;
                                            var8_int++;
                                            continue L15;
                                          }
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                nf.field_e = 0;
                                var7 = 0;
                                L17: while (true) {
                                  if (var7 >= 5) {
                                    break L3;
                                  } else {
                                    kh.field_y.b(param0 ^ 74, (rf) (Object) new bf(var3, -var7 * 64 - 64, var3, 1));
                                    var7++;
                                    continue L17;
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        nf.field_e = 0;
                        var7 = -8;
                        L18: while (true) {
                          if (var7 >= 8) {
                            break L3;
                          } else {
                            var8 = new bf(var7 * 24 + 320, -Math.abs(-64 + var7 * 64), 320 - -(var7 * 24), 1);
                            var8.field_p = true;
                            kh.field_y.b(107, (rf) (Object) var8);
                            var7++;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                  nf.field_e = 0;
                  var7_ref = null;
                  var8_int = 0;
                  L19: while (true) {
                    L20: {
                      stackOut_48_0 = ~var8_int;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_49_0 = stackOut_48_0;
                      if (nf.field_l == 2) {
                        stackOut_50_0 = stackIn_50_0;
                        stackOut_50_1 = 10;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        break L20;
                      } else {
                        stackOut_49_0 = stackIn_49_0;
                        stackOut_49_1 = 5;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        break L20;
                      }
                    }
                    if (stackIn_51_0 <= ~stackIn_51_1) {
                      break L5;
                    } else {
                      L21: {
                        var9 = new bf(var3, -var8_int * 64 + -64, var4, 2);
                        var9.field_h = (bf) var7_ref;
                        var9.field_p = true;
                        kh.field_y.b(param0 ^ 102, (rf) (Object) var9);
                        if (var8_int == 0) {
                          var7_ref = (Object) (Object) var9;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var8_int++;
                      continue L19;
                    }
                  }
                }
                break L3;
              }
            }
          }
          nf.field_e = 0;
          var7 = 0;
          L22: while (true) {
            if (var7 >= 5) {
              break L3;
            } else {
              var8 = new bf(var3, -64 + 64 * -var7, var4, 1);
              var8.field_p = true;
              kh.field_y.b(65, (rf) (Object) var8);
              var7++;
              continue L22;
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        hb var5_ref = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          var5 = null;
          var4 = field_A;
          nb.field_f.d();
          ea.field_d.d();
          if (null == n.field_a) {
            break L0;
          } else {
            if (!n.field_a.field_b) {
              break L0;
            } else {
              re.a(0);
              le.b(-36);
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (n.field_a == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((StarCannon) this).b(stackIn_6_1 != 0, -1);
          if (param0 == 320) {
            break L2;
          } else {
            ((StarCannon) this).a(-100);
            break L2;
          }
        }
        L3: {
          if (fa.field_E) {
            this.t(-23523);
            fa.field_E = false;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!le.c(4)) {
            break L4;
          } else {
            ((StarCannon) this).f((byte) -90);
            if (le.c(4)) {
              if (!ai.a((byte) -78)) {
                return;
              } else {
                this.c(false, -1444);
                return;
              }
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (!ld.field_ib) {
            this.c(true, param0 ^ -1252);
            break L5;
          } else {
            if (null != oh.field_a) {
              if (oh.field_a.field_n) {
                eb.field_c = eb.field_c | oh.field_a.field_k;
                jg.field_H = jg.field_H & ~oh.field_a.field_k;
                oh.field_a = null;
                jj.i(122);
                cf.e((byte) -117);
                if (field_z != 5) {
                  break L5;
                } else {
                  if (jg.field_H != 0) {
                    break L5;
                  } else {
                    field_z = 2;
                    od.a(param0 ^ -312, 2, false);
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            } else {
              if (!gh.f(-23093)) {
                if (cb.a(false)) {
                  L6: {
                    stackOut_36_0 = this;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_37_0 = stackOut_36_0;
                    if (null == n.field_a) {
                      stackOut_38_0 = this;
                      stackOut_38_1 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      break L6;
                    } else {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      break L6;
                    }
                  }
                  L7: {
                    var2 = u.a((ag) this, stackIn_39_1 != 0, (byte) 112);
                    if (var2 == 1) {
                      re.a(0);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var2 != 2) {
                      break L8;
                    } else {
                      L9: {
                        if (null != n.field_a) {
                          re.a(0);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      nh.a(ll.b(72), 337033697);
                      break L8;
                    }
                  }
                  if (2364824 == var2) {
                    ie.g(-1);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  this.b(true);
                  break L5;
                }
              } else {
                if (nh.field_e != 0) {
                  this.b(true);
                  break L5;
                } else {
                  L10: {
                    var2 = bd.b(31380);
                    if (var2 != 2) {
                      break L10;
                    } else {
                      re.a(0);
                      break L10;
                    }
                  }
                  L11: {
                    if (var2 != 3) {
                      break L11;
                    } else {
                      hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, (qe) (Object) a.field_b, param0 + -331, 12, true);
                      break L11;
                    }
                  }
                  L12: {
                    if (var2 == 4) {
                      vc.a(0, (byte) 60, 0);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  if (gh.f(param0 + -23413)) {
                    break L5;
                  } else {
                    fg.field_a[field_z].b(true, 0);
                    break L5;
                  }
                }
              }
            }
          }
        }
        L13: {
          if (!wk.a(34)) {
            L14: while (true) {
              var5_ref = (hb) (Object) bh.field_e.a((byte) 39);
              if (var5_ref != null) {
                sb.a(4, (byte) -41, var5_ref);
                continue L14;
              } else {
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        nf.a(0, (byte) 95);
        L15: while (true) {
          if (!ll.a(s.field_k, (byte) -99)) {
            L16: {
              var2 = 0;
              if (!se.b((byte) -91)) {
                break L16;
              } else {
                var3 = ((StarCannon) this).h((byte) 58);
                if (var3 == 2) {
                  var2 = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (var2 != 0) {
                ai.a(10, (hl[]) null, 240, af.field_y.field_r, (hl[]) null, a.field_b.field_q + a.field_b.field_r, (qe) (Object) a.field_b, 10, (qe) (Object) af.field_y, 320, 10, af.field_y.field_q + af.field_y.field_r, 25574, a.field_b.field_r);
                break L17;
              } else {
                break L17;
              }
            }
            return;
          } else {
            ((StarCannon) this).a(true);
            continue L15;
          }
        }
    }

    private final void c(boolean param0, int param1) {
        Object var3_ref = null;
        ja var3 = null;
        int var4_int = 0;
        id[] var4 = null;
        hl[] var4_array = null;
        Object var5 = null;
        int var5_int = 0;
        hl var5_ref = null;
        int var6 = 0;
        hl var6_ref_hl = null;
        int var7 = 0;
        hl var7_ref_hl = null;
        int var8 = 0;
        hl var8_ref_hl = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        hl[] var15 = null;
        hl[] var16 = null;
        hl var17 = null;
        hl[] var18 = null;
        int[] var19 = null;
        hl[] var20 = null;
        hl var21 = null;
        hl[] var22 = null;
        hl var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var3_ref = null;
        L0: {
          var12 = field_A;
          if (param1 == -1444) {
            break L0;
          } else {
            ((StarCannon) this).b(66);
            break L0;
          }
        }
        L1: {
          o.a(false);
          if (param0) {
            ne.b(lh.field_I, 150);
            break L1;
          } else {
            break L1;
          }
        }
        if (null != gf.field_c) {
          if (null == se.field_l) {
            if (fl.field_f == null) {
              ma.a(sj.field_C, -13923, 80.0f);
              ((StarCannon) this).d((byte) 22);
              gg.field_f = ob.a("smlships", 126, "", jg.field_F);
              nd.field_j = ob.a("destroyer", -121, "", jg.field_F);
              qc.field_e = ob.a("cruiser", param1 ^ -1484, "", jg.field_F);
              gf.field_a = ob.a("cannoneer", 116, "", jg.field_F);
              dl.field_c = ob.a("playership", param1 + 1407, "", jg.field_F);
              vc.field_m = ob.a("addons", 126, "", jg.field_F);
              hl[] discarded$7 = ob.a("glows", 118, "", jg.field_F);
              sj.field_E = ob.a("boss", -36, "", jg.field_F);
              fg.field_c = ob.a("boss2", param1 ^ 1474, "", jg.field_F);
              v.field_d = ob.a("boss3", 95, "", jg.field_F);
              af.field_w = fg.a(jg.field_F, "powerorbs", "", false);
              var15 = ob.a("shots", -75, "", jg.field_F);
              var4_int = 0;
              L2: while (true) {
                if (5 <= var4_int) {
                  var16 = ob.a("shots2", -120, "", jg.field_F);
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= 5) {
                      var3_ref = null;
                      ie.field_B = ob.a("explosion", 120, "", jg.field_F);
                      ad.field_z = ob.a("explosionb", -63, "", jg.field_F);
                      oh.field_d = ob.a("explosionc", -105, "", jg.field_F);
                      el.field_H = new hl[5];
                      var4_int = 0;
                      L4: while (true) {
                        if (var4_int >= 5) {
                          hg.field_y.b(param1 + 1333);
                          fl.field_f = ob.a("debris", 96, "", jg.field_F);
                          var4_array = new hl[40];
                          var5_int = 0;
                          L5: while (true) {
                            if (var5_int >= 4) {
                              var13 = 0;
                              var5_int = var13;
                              L6: while (true) {
                                if (var13 >= 12) {
                                  fl.field_f = var4_array;
                                  ma.field_e = ob.a("fr_thin_sqr_in", -49, "", jg.field_F);
                                  gb.field_v = ob.a("fr_thin_sqr_ex", 119, "", jg.field_F);
                                  ha.field_a = ob.a("fr_grid_sql_in", 119, "", jg.field_F);
                                  ma.field_a = ob.a("fr_grid_sql_ex", 119, "", jg.field_F);
                                  var5_ref = ma.field_a[6];
                                  var6_ref_hl = ma.field_a[7];
                                  ma.field_a[8].field_q = 4;
                                  var6_ref_hl.field_q = 4;
                                  var5_ref.field_q = 4;
                                  var7_ref_hl = ha.field_a[6];
                                  ha.field_a[8].field_q = 4;
                                  var8_ref_hl = ha.field_a[7];
                                  var8_ref_hl.field_q = 4;
                                  var7_ref_hl.field_q = 4;
                                  vb.field_l = vk.a("", param1 ^ -1534, "life_icon", jg.field_F);
                                  pk.field_e = vk.a("", 41, "main_border", jg.field_F);
                                  hf.field_i = vk.a("", 45, "main_inner", jg.field_F);
                                  rd.field_p = ob.a("menu_border", param1 ^ -1532, "", jg.field_F);
                                  jk.field_f = ob.a("menu_innerborder", 98, "", jg.field_F);
                                  var18 = ob.a("headers", 117, "", jg.field_F);
                                  fh.field_r[0] = var18[0];
                                  fh.field_r[3] = var18[3];
                                  fh.field_r[4] = var18[4];
                                  fh.field_r[2] = var18[2];
                                  fh.field_r[1] = var18[1];
                                  fh.field_r[5] = var18[5];
                                  var26 = new int[256];
                                  var25 = var26;
                                  var24 = var25;
                                  var19 = var24;
                                  var10 = var19;
                                  var11 = 0;
                                  L7: while (true) {
                                    if (256 <= var11) {
                                      var14 = 0;
                                      var11 = var14;
                                      L8: while (true) {
                                        if (var14 >= 8) {
                                          tc.j(param1 + 1476);
                                          return;
                                        } else {
                                          if (fh.field_r[var14] != null) {
                                            rh.field_f[var14] = cl.a(5, fh.field_r[var14], true, false, var26, 255);
                                            var14++;
                                            continue L8;
                                          } else {
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    } else {
                                      var10[var11] = w.a(var11 << 7, 65303) + var11;
                                      var11++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var4_array[var13] = fl.field_f[var13];
                                  var4_array[12 + var13] = fl.field_f[var13].c();
                                  var4_array[12 + var13].a();
                                  var4_array[24 + var13] = fl.field_f[var13].c();
                                  var4_array[24 + var13].b();
                                  var13++;
                                  continue L6;
                                }
                              }
                            } else {
                              var4_array[36 + var5_int] = fl.field_f[var5_int - -12];
                              var5_int++;
                              continue L5;
                            }
                          }
                        } else {
                          hl dupTemp$8 = new hl(32, 32);
                          el.field_H[var4_int] = dupTemp$8;
                          var17 = dupTemp$8;
                          var17.e();
                          gg.field_f[-var4_int + 24].b(0, 0);
                          var17.d();
                          var4_int++;
                          continue L4;
                        }
                      }
                    } else {
                      jg.field_C[var4_int + 5] = var16[var4_int];
                      var4_int++;
                      continue L3;
                    }
                  }
                } else {
                  jg.field_C[var4_int] = var15[var4_int];
                  var4_int++;
                  continue L2;
                }
              }
            } else {
              if (null == kj.field_y[3]) {
                ma.a(sj.field_C, -13923, 90.0f);
                ((StarCannon) this).d((byte) 22);
                hl discarded$9 = vk.a("", 93, "mainmenubar", jg.field_F);
                ie.field_A = ob.a("zenon", 102, "", jg.field_F);
                hl discarded$10 = vk.a("", 120, "moon", jg.field_F);
                hl discarded$11 = vk.a("", param1 ^ -1487, "stars", jg.field_F);
                fh.field_q = vk.a("", param1 + 1531, "nebula", jg.field_F);
                gj.field_e = vk.a("", 125, "titlepic", jg.field_F);
                gb.field_r = vk.a("", 91, "title2", jg.field_F);
                ea.field_b[0] = vk.a("", 54, "sp0", jg.field_F);
                ea.field_b[1] = vk.a("", 116, "sp1", jg.field_F);
                ea.field_b[2] = vk.a("", 52, "sp2", jg.field_F);
                ea.field_b[3] = vk.a("", param1 + 1531, "sp3", jg.field_F);
                ea.field_b[4] = vk.a("", 43, "sp4", jg.field_F);
                ea.field_b[5] = vk.a("", 44, "sp5", jg.field_F);
                ea.field_b[6] = vk.a("", 93, "sp6", jg.field_F);
                ea.field_b[7] = vk.a("", param1 + 1497, "sp7", jg.field_F);
                ea.field_b[8] = vk.a("", 36, "sp8", jg.field_F);
                eb.field_b[0] = vk.a("", 47, "s0", jg.field_F);
                eb.field_b[1] = vk.a("", 107, "s1", jg.field_F);
                eb.field_b[2] = vk.a("", 86, "s2", jg.field_F);
                eb.field_b[3] = vk.a("", 23, "s3", jg.field_F);
                eb.field_b[4] = vk.a("", 20, "s4", jg.field_F);
                eb.field_b[5] = vk.a("", 82, "s5", jg.field_F);
                eb.field_b[6] = vk.a("", dg.a(param1, -1506), "s6", jg.field_F);
                eb.field_b[7] = vk.a("", dg.a(param1, -1419), "s7", jg.field_F);
                eb.field_b[8] = vk.a("", dg.a(param1, -1423), "s8", jg.field_F);
                eb.field_b[9] = vk.a("", 124, "s9", jg.field_F);
                eb.field_b[10] = vk.a("", param1 + 1532, "s10", jg.field_F);
                eb.field_b[11] = vk.a("", 21, "s11", jg.field_F);
                eb.field_b[12] = vk.a("", dg.a(param1, -1478), "s12", jg.field_F);
                eb.field_b[13] = vk.a("", param1 + 1523, "s13", jg.field_F);
                kj.field_y[0] = vk.a("", 76, "ap0", jg.field_F);
                kj.field_y[1] = vk.a("", 69, "ap1", jg.field_F);
                kj.field_y[2] = vk.a("", dg.a(param1, -1497), "ap2", jg.field_F);
                kj.field_y[3] = vk.a("", 100, "ap3", jg.field_F);
                tc.j(32);
                return;
              } else {
                ma.a(sj.field_C, -13923, 95.0f);
                ((StarCannon) this).d((byte) 22);
                af.field_y = od.a("", jg.field_F, "b12", param1 + 1443, cb.field_c);
                a.field_b = od.a("", jg.field_F, "font", -1, cb.field_c);
                var20 = ob.a("screenshots", -105, "", jg.field_F);
                kk.a(vk.a("", 59, "mbfg", jg.field_F), -60, wc.field_g);
                ta.a(vk.a("", param1 ^ -1510, "mb_logo", jg.field_F), param1 + 1319);
                ed.a(0, 125, 123, (qe) (Object) a.field_b, 1500, -52, 9, 9, 16777215, 0, vk.a("", 60, "mbpb", jg.field_F));
                te.a(126, var20);
                lf.field_eb = null;
                var4 = new id[1];
                var4[0] = af.field_w[16 - -qb.field_e];
                af.field_y.a((ne[]) (Object) var4, (int[]) null);
                lf.field_V = vk.a("basic", 111, "unachieved", fi.field_f);
                li.a(lf.field_V, (byte) -100);
                sc.field_a = vk.a("basic", param1 ^ -1517, "locked", fi.field_f);
                li.a(sc.field_a, (byte) -100);
                var21 = vk.a("basic", 104, "orbcoin", fi.field_f);
                var6 = a.field_b.field_p - -a.field_b.field_q;
                el.field_J = new hl(var6, var6);
                el.field_J.e();
                var21.d(0, 0, var6, var6);
                j.field_c = ob.a("achievements_lrg", param1 + 1366, "", jg.field_F);
                var5_ref = null;
                var22 = j.field_c;
                var8 = 0;
                L9: while (true) {
                  if (var8 >= var22.length) {
                    hg.field_y.b(-83);
                    jl.field_j = 5;
                    fi.field_f = null;
                    ia.field_k = 0;
                    jg.field_F = null;
                    tg.field_y = 10;
                    tj.field_G = 0;
                    pf.field_d = 1;
                    bf.field_w = 0;
                    ha.field_c = 0;
                    gj.field_c = -1;
                    jk.field_j = 0;
                    eg.field_l = 128;
                    ua.field_c = -2;
                    ha.field_d = 0;
                    vb.field_m = 1;
                    cg.field_e = 0;
                    ui.field_p = 0;
                    kd.field_C = -1;
                    fi.field_e = new bf(256, 256, 256, 0);
                    fi.field_e.field_r = 256;
                    fi.field_e.field_k = 0;
                    kh.field_y.a(-71, (rf) (Object) fi.field_e);
                    u.field_b = 0;
                    ed.field_n = 0;
                    ig.field_h = 0;
                    hc.field_c = 0;
                    nf.field_e = 0;
                    eg.field_f = new wd(fb.field_t);
                    gd.field_a = new wd(qf.field_i);
                    fl.field_h = new wd(r.field_b);
                    kc.field_P = eg.field_f;
                    kc.field_P.a(mc.field_b);
                    ti.field_f.b((oa) (Object) kc.field_P);
                    ne.a(50, 39);
                    qd.a(1, 50);
                    fg.field_a = new jl[8];
                    pc.a(-5695);
                    var7 = 0;
                    L10: while (true) {
                      if (var7 >= 8) {
                        L11: {
                          if (!wk.a(45)) {
                            oh.field_a = og.a(4, (byte) 113);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        ld.field_ib = true;
                        tc.j(param1 + 1476);
                        return;
                      } else {
                        fg.field_a[var7] = new jl(var7);
                        var7++;
                        continue L10;
                      }
                    }
                  } else {
                    var23 = var22[var8];
                    li.a(var23, (byte) -100);
                    var8++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            ma.a(nc.field_d, -13923, 75.0f);
            ((StarCannon) this).d((byte) 22);
            var3 = new ja(lj.field_h, nd.field_p);
            fb.field_t = dl.a(var3, (byte) 84, "music/star cannon level 1 final", "", se.field_l);
            qf.field_i = dl.a(var3, (byte) 66, "music/star cannon level 2 final", "", se.field_l);
            r.field_b = dl.a(var3, (byte) -82, "music/star cannon boss final", "", se.field_l);
            nd.field_p = null;
            se.field_l = null;
            lj.field_h = null;
            tc.j(32);
            return;
          }
        } else {
          L12: {
            if (!lj.field_h.b((byte) 118)) {
              break L12;
            } else {
              if (!lj.field_h.a(param1 + 31185)) {
                break L12;
              } else {
                L13: {
                  if (!nd.field_p.b((byte) 95)) {
                    break L13;
                  } else {
                    if (nd.field_p.a(29741)) {
                      L14: {
                        if (!se.field_l.b((byte) 109)) {
                          break L14;
                        } else {
                          if (se.field_l.a(29741)) {
                            L15: {
                              if (!jg.field_F.b((byte) 119)) {
                                break L15;
                              } else {
                                if (jg.field_F.a(29741)) {
                                  L16: {
                                    if (!cb.field_c.b((byte) 127)) {
                                      break L16;
                                    } else {
                                      if (!cb.field_c.a(29741)) {
                                        break L16;
                                      } else {
                                        L17: {
                                          if (!fi.field_f.b((byte) 103)) {
                                            break L17;
                                          } else {
                                            if (fi.field_f.a("basic", -9883)) {
                                              ma.a(fa.field_z, -13923, 70.0f);
                                              ((StarCannon) this).d((byte) 22);
                                              if (!param0) {
                                                return;
                                              } else {
                                                jj.i(param1 ^ -1478);
                                                gf.field_c = new ud[48];
                                                gf.field_c[0] = aj.a(lj.field_h, "", "SC_bossdamage").a();
                                                gf.field_c[1] = aj.a(lj.field_h, "", "SC_bossdestroy").a();
                                                gf.field_c[2] = aj.a(lj.field_h, "", "SC_collect1").a();
                                                gf.field_c[7] = aj.a(lj.field_h, "", "SC_enemydamage2").a();
                                                gf.field_c[8] = aj.a(lj.field_h, "", "SC_enemydamage3").a();
                                                gf.field_c[9] = aj.a(lj.field_h, "", "SC_enemydestroy3").a();
                                                gf.field_c[10] = aj.a(lj.field_h, "", "SC_enemydestroy4").a();
                                                gf.field_c[3] = aj.a(lj.field_h, "", "SC_enemyfire1").a();
                                                gf.field_c[4] = aj.a(lj.field_h, "", "SC_enemyfire2").a();
                                                gf.field_c[5] = aj.a(lj.field_h, "", "SC_enemyfire3").a();
                                                gf.field_c[6] = aj.a(lj.field_h, "", "SC_enemyfire4").a();
                                                gf.field_c[19] = aj.a(lj.field_h, "", "SC_playerdestroy").a();
                                                gf.field_c[20] = aj.a(lj.field_h, "", "SC_backcannon").a();
                                                gf.field_c[21] = aj.a(lj.field_h, "", "SC_FOLLOWERFIRE").a();
                                                gf.field_c[11] = aj.a(lj.field_h, "", "SC_playerfire1").a();
                                                gf.field_c[12] = aj.a(lj.field_h, "", "SC_playerfire2").a();
                                                gf.field_c[13] = aj.a(lj.field_h, "", "SC_helix_1").a();
                                                gf.field_c[14] = aj.a(lj.field_h, "", "SC_helix_2").a();
                                                gf.field_c[15] = aj.a(lj.field_h, "", "SC_helix_3").a();
                                                gf.field_c[16] = aj.a(lj.field_h, "", "SC_lance_1").a();
                                                gf.field_c[17] = aj.a(lj.field_h, "", "SC_lance_2").a();
                                                gf.field_c[18] = aj.a(lj.field_h, "", "SC_lance_3").a();
                                                gf.field_c[22] = aj.a(lj.field_h, "", "SC_rewind_activated_part1").a();
                                                gf.field_c[23] = aj.a(lj.field_h, "", "SC_rewind_installed").a();
                                                gf.field_c[24] = aj.a(lj.field_h, "", "SC_seekermine_explode").a();
                                                gf.field_c[25] = aj.a(lj.field_h, "", "SC_shield_discharged").a();
                                                gf.field_c[26] = aj.a(lj.field_h, "", "SC_shield_rearm").a();
                                                gf.field_c[27] = aj.a(lj.field_h, "", "SC_shieldburst").a();
                                                gf.field_c[28] = aj.a(lj.field_h, "", "SC_thruster_upgrade").a();
                                                gf.field_c[29] = aj.a(lj.field_h, "", "SC_rearcannon_upgrade").a();
                                                gf.field_c[30] = aj.a(lj.field_h, "", "SC_shield_upgraded").a();
                                                gf.field_c[31] = aj.a(lj.field_h, "", "SC_sidecannons_upgrade").a();
                                                gf.field_c[46] = aj.a(lj.field_h, "", "SC_xenon_operational").a();
                                                gf.field_c[47] = aj.a(lj.field_h, "", "SC_xenonbeamshot").a();
                                                gf.field_c[32] = nj.a(nd.field_p, "", "SC_systems malfunction").c();
                                                gf.field_c[39] = nj.a(nd.field_p, "", "SC_VOC_54321").c();
                                                gf.field_c[40] = nj.a(nd.field_p, "", "SC_VOC_back cannons upgraded").c();
                                                gf.field_c[41] = nj.a(nd.field_p, "", "SC_VOC_hostile mothership approaching").c();
                                                gf.field_c[42] = nj.a(nd.field_p, "", "SC_VOC_powerup collected").c();
                                                gf.field_c[43] = nj.a(nd.field_p, "", "SC_VOC_returning to normal space").c();
                                                gf.field_c[44] = nj.a(nd.field_p, "", "SC_VOC_rewind module activated").c();
                                                gf.field_c[45] = nj.a(nd.field_p, "", "SC_VOC_rewind module installed").c();
                                                gf.field_c[33] = nj.a(nd.field_p, "", "SC_VOC_shield discharged").c();
                                                gf.field_c[34] = nj.a(nd.field_p, "", "SC_VOC_shield rearmed").c();
                                                gf.field_c[35] = nj.a(nd.field_p, "", "SC_VOC_shields upgraded").c();
                                                gf.field_c[36] = nj.a(nd.field_p, "", "SC_VOC_side cannons upgraded").c();
                                                gf.field_c[37] = nj.a(nd.field_p, "", "SC_VOC_thrusters upgraded").c();
                                                gf.field_c[38] = nj.a(nd.field_p, "", "SC_VOC_zenon beam operational").c();
                                                nd.a(272, -3763, 3278, 39);
                                                nd.a(0, -3763, 300, 11);
                                                nd.a(0, -3763, 300, 12);
                                                nd.a(50, -3763, 300, 16);
                                                nd.a(0, param1 + -2319, 100, 17);
                                                nd.a(0, param1 ^ 2833, 100, 18);
                                                tc.j(param1 ^ -1412);
                                                return;
                                              }
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        ma.a(bh.a(n.field_f, fi.field_f, (byte) -38, ae.field_a, "basic"), -13923, 60.0f);
                                        return;
                                      }
                                    }
                                  }
                                  ma.a(bh.a(s.field_g, cb.field_c, (byte) -38, sj.field_D, ""), -13923, 50.0f);
                                  return;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            ma.a(bh.a(n.field_f, jg.field_F, (byte) -38, ae.field_a, ""), param1 + -12479, 40.0f);
                            return;
                          } else {
                            break L14;
                          }
                        }
                      }
                      ma.a(bh.a(kc.field_U, se.field_l, (byte) -38, ia.field_l, ""), -13923, 30.0f);
                      return;
                    } else {
                      break L13;
                    }
                  }
                }
                ma.a(bh.a(lc.field_ib, nd.field_p, (byte) -38, bd.field_g, ""), -13923, 20.0f);
                return;
              }
            }
          }
          ma.a(bh.a(lc.field_ib, lj.field_h, (byte) -38, bd.field_g, ""), param1 ^ 13249, 10.0f);
          return;
        }
    }

    private final void m(byte param0) {
        int var2 = 0;
        bf var2_ref_bf = null;
        int var3 = 0;
        bf var3_ref_bf = null;
        int var4 = 0;
        bf var4_ref_bf = null;
        int var5_int = 0;
        bf var5 = null;
        int var6_int = 0;
        bf var6 = null;
        int var7 = 0;
        int var8 = 0;
        bf var9 = null;
        bf var10 = null;
        bf var11 = null;
        ud var12 = null;
        fj var13 = null;
        bf var14 = null;
        bf var15 = null;
        bf var37 = null;
        int[] var80 = null;
        int[] var81 = null;
        int[] var82 = null;
        int[] var83 = null;
        int[] var84 = null;
        int[] var85 = null;
        int[] var86 = null;
        int[] var87 = null;
        int[] var88 = null;
        int[] var89 = null;
        int[] var90 = null;
        int[] var91 = null;
        int[] var92 = null;
        int[] var93 = null;
        int[] var94 = null;
        int[] var95 = null;
        int[] var96 = null;
        int[] var97 = null;
        int[] var98 = null;
        int[] var99 = null;
        int[] var100 = null;
        int stackIn_148_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_450_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_449_0 = 0;
        int stackOut_448_0 = 0;
        L0: {
          var8 = field_A;
          if (ie.field_C > 0) {
            ie.field_C = ie.field_C - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (gj.field_c == -1) {
            L2: {
              var2 = 0;
              if (0 != ia.field_k) {
                break L2;
              } else {
                if (0 != jg.field_H) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (!wk.a(86)) {
                if (0 >= jg.field_H) {
                  if (0 < kd.field_C) {
                    var2 = 2;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var2 = 5;
                  break L3;
                }
              } else {
                L4: {
                  if (ia.field_k > 0) {
                    break L4;
                  } else {
                    if (jg.field_H > 0) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                var2 = 6;
                break L3;
              }
            }
            od.a(-126, var2, false);
            break L1;
          } else {
            break L1;
          }
        }
        L5: {
          if (tj.field_G <= 0) {
            break L5;
          } else {
            fi.field_e.field_k = 1;
            ha.field_d = 0;
            ui.field_p = eg.field_l + -32;
            tj.field_G = tj.field_G - 1;
            if (0 >= tj.field_G) {
              ui.field_p = 0;
              mj.a(255, 12, 0, 43, 100);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (fi.field_e.field_k <= 0) {
            if (gj.field_c >= 0) {
              break L6;
            } else {
              var2 = 0;
              L7: while (true) {
                if (var2 >= 4000) {
                  var9 = (bf) (Object) kh.field_y.c(-3905);
                  L8: while (true) {
                    if (var9 == null) {
                      break L6;
                    } else {
                      L9: {
                        if (fi.field_e == var9) {
                          break L9;
                        } else {
                          var9.b(4);
                          break L9;
                        }
                      }
                      var9 = (bf) (Object) kh.field_y.a(-16913);
                      continue L8;
                    }
                  }
                } else {
                  qc.field_c[var2] = null;
                  var2++;
                  continue L7;
                }
              }
            }
          } else {
            L10: {
              if (!gi.field_g) {
                break L10;
              } else {
                if (2 > ua.field_c) {
                  break L10;
                } else {
                  if (rj.field_h == 0) {
                    ia.field_k = ia.field_k + 1;
                    fc.field_e = fc.field_e + 2;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
            if (ui.field_p <= 0) {
              if (ha.field_d > 0) {
                L11: {
                  var2 = vb.field_m + 1;
                  if (4 == vb.field_m) {
                    var2++;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (vb.field_m == 5) {
                    var2 += 2;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  ha.field_d = ha.field_d - var2;
                  if (null != ah.field_a) {
                    break L13;
                  } else {
                    if (vb.field_m < 4) {
                      L14: {
                        var3 = 0;
                        if (vb.field_m == 2) {
                          var3 = 28665;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (3 == vb.field_m) {
                          var3 = 42997;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var12 = gf.field_c[39];
                      fj dupTemp$6 = fj.a(var12, 100, 255 * nb.field_g / 100);
                      var13 = dupTemp$6;
                      ah.field_a = dupTemp$6;
                      var13.d(var3);
                      var6_int = (var2 + ha.field_d + -1) / var2;
                      var7 = -300 + (var6_int * 20 + -((var12.field_i.length + -var3) * 1000 / var12.field_j));
                      if (var7 > 0) {
                        ok.field_tb = eg.a(29723, var7, (c) (Object) ah.field_a);
                        jk.field_k.b((c) (Object) ok.field_tb);
                        break L13;
                      } else {
                        jk.field_k.b((c) (Object) ah.field_a);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                if (ha.field_d <= 0) {
                  ha.field_d = 0;
                  dg.field_l = 0;
                  mj.a(255, 12, 0, 34, 100);
                  mj.a(96, 12, 0, 26, 100);
                  ok.field_tb = null;
                  ah.field_a = null;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            } else {
              L16: {
                ui.field_p = ui.field_p + 8;
                if (~ui.field_p >= ~eg.field_l) {
                  break L16;
                } else {
                  dg.field_l = 0;
                  ui.field_p = 0;
                  mj.a(96, 12, 0, 25, 100);
                  mj.a(255, 12, 0, 33, 100);
                  break L16;
                }
              }
              var2 = 0;
              L17: while (true) {
                if (var2 >= 4000) {
                  var2_ref_bf = (bf) (Object) kh.field_y.c(-3905);
                  L18: while (true) {
                    if (var2_ref_bf == null) {
                      break L6;
                    } else {
                      L19: {
                        if (fi.field_e == var2_ref_bf) {
                          break L19;
                        } else {
                          var3 = var2_ref_bf.field_f + -fi.field_e.field_f;
                          var4 = -fi.field_e.field_u + var2_ref_bf.field_u;
                          var5_int = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
                          var6_int = 0;
                          L20: while (true) {
                            if (~ui.field_p >= ~var6_int) {
                              break L19;
                            } else {
                              L21: {
                                if (var6_int <= var5_int) {
                                  break L21;
                                } else {
                                  if (var2_ref_bf.field_q != 10) {
                                    L22: {
                                      if (var2_ref_bf.field_q != 22) {
                                        break L22;
                                      } else {
                                        if (var2_ref_bf.field_l < 36) {
                                          break L22;
                                        } else {
                                          if (39 < var2_ref_bf.field_l) {
                                            break L22;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    L23: {
                                      if (var3 < 0) {
                                        var2_ref_bf.field_f = var2_ref_bf.field_f - 1;
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    }
                                    L24: {
                                      if (0 >= var3) {
                                        break L24;
                                      } else {
                                        var2_ref_bf.field_f = var2_ref_bf.field_f + 1;
                                        break L24;
                                      }
                                    }
                                    L25: {
                                      if (var4 < 0) {
                                        var2_ref_bf.field_u = var2_ref_bf.field_u - 1;
                                        break L25;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    if (0 >= var4) {
                                      break L21;
                                    } else {
                                      var2_ref_bf.field_u = var2_ref_bf.field_u + 1;
                                      break L21;
                                    }
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              var6_int++;
                              continue L20;
                            }
                          }
                        }
                      }
                      var2_ref_bf = (bf) (Object) kh.field_y.a(-16913);
                      continue L18;
                    }
                  }
                } else {
                  L26: {
                    if (qc.field_c[var2] == null) {
                      break L26;
                    } else {
                      if (qc.field_c[var2].field_h != 2) {
                        break L26;
                      } else {
                        var3 = qc.field_c[var2].field_d + -fi.field_e.field_f;
                        var4 = qc.field_c[var2].field_q + -fi.field_e.field_u;
                        var5_int = (int)Math.sqrt((double)(var4 * var4 + var3 * var3));
                        if (~var5_int > ~ui.field_p) {
                          qc.field_c[var2].field_h = 0;
                          qc.field_c[var2].field_p = 64;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                  var2++;
                  continue L17;
                }
              }
            }
          }
        }
        L27: {
          var14 = fi.field_e;
          if (10 < u.field_b) {
            u.field_b = 0;
            var14.field_k = var14.field_k + 1;
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          if (0 > var14.field_f) {
            var14.field_f = 0;
            var14.field_n = 50;
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          if (u.field_b < -100) {
            u.field_b = -100;
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          if (var14.field_f > 640) {
            var14.field_f = 640;
            var14.field_n = -50;
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          if (var14.field_u >= 0) {
            break L31;
          } else {
            var14.field_z = 50;
            var14.field_u = 0;
            break L31;
          }
        }
        L32: {
          if (var14.field_u > 448) {
            var14.field_z = -50;
            var14.field_u = 448;
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          if (ig.field_h <= 8) {
            break L33;
          } else {
            ig.field_h = sh.b(-6, 4);
            break L33;
          }
        }
        L34: {
          L35: {
            vd.field_j = vd.field_j + 3;
            hc.field_c = hc.field_c + 1;
            ed.field_n = ed.field_n + 1;
            if (ge.field_c[0] == 2) {
              break L35;
            } else {
              if (ge.field_c[0] == 7) {
                break L35;
              } else {
                if (ge.field_c[0] == 12) {
                  break L35;
                } else {
                  if (ua.field_c < -2) {
                    break L35;
                  } else {
                    break L34;
                  }
                }
              }
            }
          }
          vd.field_j = vd.field_j + 9;
          hc.field_c = hc.field_c + 3;
          if (ua.field_c < -2) {
            hc.field_c = hc.field_c + 3;
            ed.field_n = ed.field_n + 2;
            vd.field_j = vd.field_j + 9;
            break L34;
          } else {
            break L34;
          }
        }
        L36: {
          if (ed.field_n <= 1028) {
            break L36;
          } else {
            L37: {
              if (ua.field_c < ue.field_c[rj.field_h]) {
                L38: {
                  ua.field_c = ua.field_c + 1;
                  if (ua.field_c == 9) {
                    var3_ref_bf = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                    var3_ref_bf.field_l = 5;
                    kh.field_y.b(97, (rf) (Object) var3_ref_bf);
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if (rj.field_h != 0) {
                    break L39;
                  } else {
                    L40: {
                      nf.field_e = -50;
                      if (10 == ua.field_c) {
                        break L40;
                      } else {
                        if (ua.field_c != 12) {
                          break L39;
                        } else {
                          break L40;
                        }
                      }
                    }
                    var3 = sh.b(113, 640);
                    var4 = -64 + (fi.field_e.field_f + sh.b(-126, 128));
                    var5_int = 0;
                    L41: while (true) {
                      if (var5_int >= 5) {
                        break L39;
                      } else {
                        var6 = new bf(var3, -var5_int * 64 + -64, var4, 17);
                        var6.field_o = sh.b(-127, 32);
                        kh.field_y.b(114, (rf) (Object) var6);
                        var5_int++;
                        continue L41;
                      }
                    }
                  }
                }
                L42: {
                  if (rj.field_h == 1) {
                    L43: {
                      if (ua.field_c != 4) {
                        break L43;
                      } else {
                        var3 = 36;
                        L44: while (true) {
                          if (var3 >= 40) {
                            break L43;
                          } else {
                            L45: {
                              if ((1 & var3) != 0) {
                                stackOut_147_0 = 424;
                                stackIn_148_0 = stackOut_147_0;
                                break L45;
                              } else {
                                stackOut_146_0 = 296;
                                stackIn_148_0 = stackOut_146_0;
                                break L45;
                              }
                            }
                            L46: {
                              var4 = stackIn_148_0;
                              if (var3 >= 38) {
                                stackOut_150_0 = -128;
                                stackIn_151_0 = stackOut_150_0;
                                break L46;
                              } else {
                                stackOut_149_0 = -256;
                                stackIn_151_0 = stackOut_149_0;
                                break L46;
                              }
                            }
                            var5_int = stackIn_151_0;
                            var15 = new bf(var4, var5_int, var4, 22);
                            li.a(-126, var15);
                            var15.field_l = var3;
                            var15.field_n = 0;
                            var15.field_z = 32;
                            var3++;
                            continue L44;
                          }
                        }
                      }
                    }
                    L47: {
                      L48: {
                        if (5 == ua.field_c) {
                          break L48;
                        } else {
                          if (ua.field_c == 15) {
                            break L48;
                          } else {
                            break L47;
                          }
                        }
                      }
                      nf.field_e = -250;
                      var3 = 0;
                      L49: while (true) {
                        if (25 <= var3) {
                          break L47;
                        } else {
                          kh.field_y.b(99, (rf) (Object) new bf(sh.b(-128, 640), -var3 * 25 + -128, sh.b(60, 128) + fi.field_e.field_f - 64, 18));
                          var3++;
                          continue L49;
                        }
                      }
                    }
                    L50: {
                      if (4 == ua.field_c) {
                        break L50;
                      } else {
                        if (ua.field_c == 6) {
                          break L50;
                        } else {
                          if (ua.field_c == 8) {
                            break L50;
                          } else {
                            if (ua.field_c == 10) {
                              break L50;
                            } else {
                              if (ua.field_c == 12) {
                                break L50;
                              } else {
                                if (ua.field_c == 14) {
                                  break L50;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var3 = -300 + (900 * sh.b(45, 2) + 320);
                    var4 = 0;
                    L51: while (true) {
                      if (var4 >= 5) {
                        break L42;
                      } else {
                        var5 = new bf(var3, 64 * -var4 - 64, var3, 17);
                        var5.field_o = sh.b(-127, 32);
                        kh.field_y.b(121, (rf) (Object) var5);
                        var4++;
                        continue L51;
                      }
                    }
                  } else {
                    break L42;
                  }
                }
                L52: {
                  if (2 != rj.field_h) {
                    break L52;
                  } else {
                    L53: {
                      L54: {
                        if (ua.field_c == 5) {
                          break L54;
                        } else {
                          if (10 == ua.field_c) {
                            break L54;
                          } else {
                            if (ua.field_c == 15) {
                              break L54;
                            } else {
                              break L53;
                            }
                          }
                        }
                      }
                      nf.field_e = -150;
                      var3 = 0;
                      L55: while (true) {
                        if (25 <= var3) {
                          break L53;
                        } else {
                          kh.field_y.b(119, (rf) (Object) new bf(sh.b(76, 640), -128 + -var3 * 25, -64 + sh.b(-30, 128) + fi.field_e.field_f, 18));
                          var3++;
                          continue L55;
                        }
                      }
                    }
                    L56: {
                      if (ua.field_c != 16) {
                        break L56;
                      } else {
                        var3 = 48;
                        L57: while (true) {
                          if (var3 >= 640) {
                            break L56;
                          } else {
                            var4_ref_bf = new bf(var3, -64 - Math.abs(-320 + var3), var3, 21);
                            var4_ref_bf.field_o = sh.b(-127, 32);
                            kh.field_y.b(57, (rf) (Object) var4_ref_bf);
                            var3 += 96;
                            continue L57;
                          }
                        }
                      }
                    }
                    if (ua.field_c < 4) {
                      break L52;
                    } else {
                      if (ua.field_c > 14) {
                        break L52;
                      } else {
                        if (0 == (ua.field_c & 1)) {
                          var3 = sh.b(-128, 2) * 900 + 20;
                          var4 = 0;
                          L58: while (true) {
                            if (var4 >= 5) {
                              break L52;
                            } else {
                              var5 = new bf(var3, -var4 * 64 - 64, var3, 17);
                              var5.field_o = sh.b(-126, 32);
                              kh.field_y.b(89, (rf) (Object) var5);
                              var4++;
                              continue L58;
                            }
                          }
                        } else {
                          break L52;
                        }
                      }
                    }
                  }
                }
                L59: {
                  if (3 == rj.field_h) {
                    L60: {
                      if (ua.field_c == 5) {
                        break L60;
                      } else {
                        if (ua.field_c == 10) {
                          break L60;
                        } else {
                          break L59;
                        }
                      }
                    }
                    var3 = 0;
                    L61: while (true) {
                      if (var3 >= 25) {
                        break L59;
                      } else {
                        kh.field_y.b(115, (rf) (Object) new bf(sh.b(-126, 640), -128 + 25 * -var3, sh.b(8, 128) - (-fi.field_e.field_f + 64), 18));
                        var3++;
                        continue L61;
                      }
                    }
                  } else {
                    break L59;
                  }
                }
                if (ua.field_c != -2) {
                  break L37;
                } else {
                  if (rj.field_h > 0) {
                    dg.field_l = 0;
                    mj.a(255, 12, 0, 43, 100);
                    break L37;
                  } else {
                    break L37;
                  }
                }
              } else {
                break L37;
              }
            }
            L62: {
              L63: {
                ed.field_n = sh.b(64, 640);
                if (0 == rj.field_h) {
                  break L63;
                } else {
                  if (rj.field_h != 3) {
                    break L62;
                  } else {
                    break L63;
                  }
                }
              }
              L64: {
                if (ua.field_c <= 0) {
                  L65: {
                    if (2 != ge.field_c[0]) {
                      break L65;
                    } else {
                      var80 = ge.field_c;
                      ge.field_c[1] = 1;
                      var80[0] = 1;
                      break L65;
                    }
                  }
                  L66: {
                    if (ge.field_c[0] != 7) {
                      break L66;
                    } else {
                      ge.field_c[1] = 6;
                      var81 = ge.field_c;
                      var81[0] = 6;
                      break L66;
                    }
                  }
                  if (12 == ge.field_c[0]) {
                    ge.field_c[1] = 11;
                    var82 = ge.field_c;
                    var82[0] = 11;
                    break L64;
                  } else {
                    break L64;
                  }
                } else {
                  break L64;
                }
              }
              L67: {
                if (0 > ua.field_c) {
                  break L67;
                } else {
                  if (ua.field_c > 12) {
                    break L67;
                  } else {
                    if ((1 & ua.field_c) == 0) {
                      gd.field_d = (ua.field_c >> 1) + 2;
                      boolean discarded$7 = v.a(new d(sh.b(-127, 640), -156, 0, 128 + sh.b(-127, 256), 16777215, 4), -4001);
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                }
              }
              L68: {
                if (ua.field_c == 12) {
                  ge.field_c[1] = 3;
                  var83 = ge.field_c;
                  var83[0] = 3;
                  break L68;
                } else {
                  break L68;
                }
              }
              if (13 != ua.field_c) {
                break L62;
              } else {
                ge.field_c[1] = 1;
                var84 = ge.field_c;
                var84[0] = 1;
                break L62;
              }
            }
            L69: {
              if (rj.field_h == 1) {
                L70: {
                  if (ua.field_c <= 0) {
                    L71: {
                      if (ge.field_c[0] == 2) {
                        var85 = ge.field_c;
                        ge.field_c[1] = 1;
                        var85[0] = 1;
                        break L71;
                      } else {
                        break L71;
                      }
                    }
                    L72: {
                      if (ge.field_c[0] == 7) {
                        ge.field_c[1] = 6;
                        var86 = ge.field_c;
                        var86[0] = 6;
                        break L72;
                      } else {
                        break L72;
                      }
                    }
                    if (ge.field_c[0] == 12) {
                      var87 = ge.field_c;
                      ge.field_c[1] = 11;
                      var87[0] = 11;
                      break L70;
                    } else {
                      break L70;
                    }
                  } else {
                    break L70;
                  }
                }
                L73: {
                  if (1 != ua.field_c) {
                    break L73;
                  } else {
                    ge.field_c[0] = 4;
                    break L73;
                  }
                }
                L74: {
                  if (3 == ua.field_c) {
                    var88 = ge.field_c;
                    ge.field_c[1] = 3;
                    var88[0] = 3;
                    break L74;
                  } else {
                    break L74;
                  }
                }
                L75: {
                  if (ua.field_c != 6) {
                    break L75;
                  } else {
                    ge.field_c[1] = 1;
                    var89 = ge.field_c;
                    var89[0] = 1;
                    break L75;
                  }
                }
                L76: {
                  if (ua.field_c == 8) {
                    ge.field_c[1] = 5;
                    break L76;
                  } else {
                    break L76;
                  }
                }
                L77: {
                  if (9 != ua.field_c) {
                    break L77;
                  } else {
                    var90 = ge.field_c;
                    ge.field_c[1] = 13;
                    var90[0] = 13;
                    break L77;
                  }
                }
                L78: {
                  if (ua.field_c == 12) {
                    ge.field_c[1] = 11;
                    var91 = ge.field_c;
                    var91[0] = 11;
                    break L78;
                  } else {
                    break L78;
                  }
                }
                L79: {
                  if (ua.field_c == 14) {
                    ge.field_c[1] = 9;
                    break L79;
                  } else {
                    break L79;
                  }
                }
                L80: {
                  if (ua.field_c == 15) {
                    ge.field_c[1] = 8;
                    var92 = ge.field_c;
                    var92[0] = 8;
                    break L80;
                  } else {
                    break L80;
                  }
                }
                L81: {
                  if (ua.field_c == 18) {
                    ge.field_c[1] = 6;
                    var93 = ge.field_c;
                    var93[0] = 6;
                    break L81;
                  } else {
                    break L81;
                  }
                }
                if (ua.field_c != 20) {
                  break L69;
                } else {
                  ge.field_c[0] = 10;
                  break L69;
                }
              } else {
                break L69;
              }
            }
            if (rj.field_h != 2) {
              break L36;
            } else {
              L82: {
                if (0 >= ua.field_c) {
                  L83: {
                    if (2 != ge.field_c[0]) {
                      break L83;
                    } else {
                      ge.field_c[1] = 1;
                      var94 = ge.field_c;
                      var94[0] = 1;
                      break L83;
                    }
                  }
                  L84: {
                    if (7 == ge.field_c[0]) {
                      var95 = ge.field_c;
                      ge.field_c[1] = 6;
                      var95[0] = 6;
                      break L84;
                    } else {
                      break L84;
                    }
                  }
                  if (ge.field_c[0] != 12) {
                    break L82;
                  } else {
                    ge.field_c[1] = 11;
                    var96 = ge.field_c;
                    var96[0] = 11;
                    break L82;
                  }
                } else {
                  break L82;
                }
              }
              L85: {
                if (4 == ua.field_c) {
                  gd.field_d = 9;
                  boolean discarded$8 = v.a(new d(sh.b(-128, 640), -156, 0, sh.b(107, 256) - -128, 16777215, 4), -4001);
                  break L85;
                } else {
                  break L85;
                }
              }
              L86: {
                if (ua.field_c != 5) {
                  break L86;
                } else {
                  ge.field_c[1] = 8;
                  var97 = ge.field_c;
                  var97[0] = 8;
                  break L86;
                }
              }
              L87: {
                if (ua.field_c != 9) {
                  break L87;
                } else {
                  var98 = ge.field_c;
                  ge.field_c[1] = 6;
                  var98[0] = 6;
                  break L87;
                }
              }
              L88: {
                if (ua.field_c == 10) {
                  gd.field_d = 10;
                  boolean discarded$9 = v.a(new d(sh.b(8, 640), -156, 0, sh.b(-128, 256) - -128, 16777215, 4), -4001);
                  break L88;
                } else {
                  break L88;
                }
              }
              L89: {
                if (ua.field_c != 11) {
                  break L89;
                } else {
                  var99 = ge.field_c;
                  ge.field_c[1] = 13;
                  var99[0] = 13;
                  break L89;
                }
              }
              L90: {
                if (ua.field_c != 15) {
                  break L90;
                } else {
                  var100 = ge.field_c;
                  ge.field_c[1] = 11;
                  var100[0] = 11;
                  break L90;
                }
              }
              L91: {
                if (ua.field_c != 16) {
                  break L91;
                } else {
                  gd.field_d = 11;
                  boolean discarded$10 = v.a(new d(sh.b(-8, 640), -156, 0, sh.b(118, 256) + 128, 16777215, 4), -4001);
                  break L91;
                }
              }
              if (19 == ua.field_c) {
                gd.field_d = 12;
                boolean discarded$11 = v.a(new d(sh.b(-128, 640), -156, 0, 128 + sh.b(2, 256), 16777215, 4), -4001);
                break L36;
              } else {
                break L36;
              }
            }
          }
        }
        L92: {
          if (gf.field_b <= 0) {
            break L92;
          } else {
            if (rj.field_h < 3) {
              kk.field_d = kk.field_d - 1;
              if (kk.field_d > 0) {
                break L92;
              } else {
                L93: {
                  kk.field_d = 50;
                  gf.field_b = gf.field_b - 1;
                  var3_ref_bf = new bf(fi.field_e.field_f, -32, fi.field_e.field_f, 10);
                  if (gf.field_b == 0) {
                    var3_ref_bf.field_l = 4;
                    break L93;
                  } else {
                    break L93;
                  }
                }
                L94: {
                  if (gf.field_b != 1) {
                    break L94;
                  } else {
                    var3_ref_bf.field_l = 0;
                    break L94;
                  }
                }
                kh.field_y.b(69, (rf) (Object) var3_ref_bf);
                break L92;
              }
            } else {
              break L92;
            }
          }
        }
        L95: {
          if (ia.field_k >= tg.field_y) {
            L96: {
              if (tg.field_y < 1000) {
                if (tg.field_y <= 0) {
                  var3 = tg.field_y - -10;
                  break L96;
                } else {
                  var3 = tg.field_y + (tg.field_y << 1) / 3;
                  break L96;
                }
              } else {
                var3 = 500 + tg.field_y;
                break L96;
              }
            }
            var4 = sh.b(-128, 640);
            tg.field_y = var3;
            kh.field_y.b(60, (rf) (Object) new bf(var4, -32, var4, 10));
            break L95;
          } else {
            break L95;
          }
        }
        L97: {
          L98: {
            if (rj.field_h == 2) {
              break L98;
            } else {
              if (rj.field_h != 3) {
                break L97;
              } else {
                break L98;
              }
            }
          }
          if (0 >= u.field_d) {
            il.field_i = il.field_i + (rj.field_h - 4);
            rj.field_h = 4;
            break L97;
          } else {
            break L97;
          }
        }
        L99: {
          if (rj.field_h != 3) {
            break L99;
          } else {
            if (nf.field_l < 2) {
              il.field_i = il.field_i + (-4 + rj.field_h);
              rj.field_h = 4;
              break L99;
            } else {
              break L99;
            }
          }
        }
        L100: {
          if (~ua.field_c < ~ue.field_c[rj.field_h]) {
            break L100;
          } else {
            if (fi.field_e.field_k <= 0) {
              break L100;
            } else {
              nf.field_e = nf.field_e + 2;
              break L100;
            }
          }
        }
        L101: {
          if (nf.field_e > 200) {
            L102: {
              if (rj.field_h != 0) {
                break L102;
              } else {
                this.o(0);
                break L102;
              }
            }
            L103: {
              if (rj.field_h != 1) {
                break L103;
              } else {
                this.l((byte) 91);
                break L103;
              }
            }
            L104: {
              if (2 != rj.field_h) {
                break L104;
              } else {
                this.k((byte) 104);
                break L104;
              }
            }
            if (rj.field_h != 3) {
              break L101;
            } else {
              this.p(-256);
              break L101;
            }
          } else {
            break L101;
          }
        }
        L105: {
          if (dg.field_l >= 96) {
            break L105;
          } else {
            dg.field_l = dg.field_l + 1;
            break L105;
          }
        }
        dl.field_a = 0;
        var3 = -64 / ((38 - param0) / 48);
        var10 = (bf) (Object) kh.field_y.c(-3905);
        L106: while (true) {
          if (var10 == null) {
            L107: {
              if (tj.field_G > 0) {
                fi.field_e.field_k = 1;
                break L107;
              } else {
                break L107;
              }
            }
            var3 = 0;
            L108: while (true) {
              if (4000 <= var3) {
                L109: {
                  if (vb.field_m <= 0) {
                    break L109;
                  } else {
                    var37 = fi.field_e;
                    if (rj.field_h < 4) {
                      if (fi.field_e.field_k > 0) {
                        L110: {
                          if (!wc.field_c[96]) {
                            break L110;
                          } else {
                            L111: {
                              var37.field_n = var37.field_n - (jl.field_j - -3);
                              if (var37.field_n >= -250) {
                                break L111;
                              } else {
                                var37.field_n = -250;
                                break L111;
                              }
                            }
                            if (var37.field_n > 0) {
                              var37.field_n = var37.field_n * 95 / 100;
                              break L110;
                            } else {
                              break L110;
                            }
                          }
                        }
                        L112: {
                          if (wc.field_c[98]) {
                            L113: {
                              var37.field_z = var37.field_z - (jl.field_j - -3);
                              if (var37.field_z < -250) {
                                var37.field_z = -250;
                                break L113;
                              } else {
                                break L113;
                              }
                            }
                            if (0 >= var37.field_z) {
                              break L112;
                            } else {
                              var37.field_z = -(var37.field_z * 95) / 100;
                              break L112;
                            }
                          } else {
                            break L112;
                          }
                        }
                        L114: {
                          if (wc.field_c[97]) {
                            L115: {
                              var37.field_n = var37.field_n + (3 + jl.field_j);
                              if (var37.field_n <= 250) {
                                break L115;
                              } else {
                                var37.field_n = 250;
                                break L115;
                              }
                            }
                            if (var37.field_n >= 0) {
                              break L114;
                            } else {
                              var37.field_n = 95 * var37.field_n / 100;
                              break L114;
                            }
                          } else {
                            break L114;
                          }
                        }
                        L116: {
                          if (wc.field_c[96]) {
                            break L116;
                          } else {
                            if (!wc.field_c[97]) {
                              var37.field_n = 90 * var37.field_n / 100;
                              break L116;
                            } else {
                              break L116;
                            }
                          }
                        }
                        L117: {
                          if (!wc.field_c[99]) {
                            break L117;
                          } else {
                            L118: {
                              var37.field_z = var37.field_z + (3 + jl.field_j);
                              if (var37.field_z <= 120) {
                                break L118;
                              } else {
                                var37.field_z = 120;
                                break L118;
                              }
                            }
                            if (0 <= var37.field_z) {
                              break L117;
                            } else {
                              var37.field_z = 95 * var37.field_z / 100;
                              break L117;
                            }
                          }
                        }
                        L119: {
                          L120: {
                            if (wc.field_c[82]) {
                              break L120;
                            } else {
                              if (!wc.field_c[83]) {
                                break L119;
                              } else {
                                break L120;
                              }
                            }
                          }
                          if (var37.field_j == 0) {
                            gi.field_g = false;
                            u.field_b = u.field_b - 2;
                            var37.field_j = 1;
                            break L119;
                          } else {
                            break L119;
                          }
                        }
                        if (wc.field_c[98]) {
                          break L109;
                        } else {
                          if (!wc.field_c[99]) {
                            var37.field_z = var37.field_z * 90 / 100;
                            break L109;
                          } else {
                            break L109;
                          }
                        }
                      } else {
                        break L109;
                      }
                    } else {
                      L121: {
                        var37.field_z = var37.field_z - (jl.field_j - -3);
                        if (var37.field_z >= -250) {
                          break L121;
                        } else {
                          var37.field_z = -250;
                          break L121;
                        }
                      }
                      L122: {
                        var37.field_f = (9 * var37.field_f - -320) / 10;
                        if (var37.field_z <= 0) {
                          break L122;
                        } else {
                          var37.field_z = -(95 * var37.field_z) / 100;
                          break L122;
                        }
                      }
                      L123: {
                        if (((StarCannon) this).field_D >= 250) {
                          break L123;
                        } else {
                          ((StarCannon) this).field_D = ((StarCannon) this).field_D + 1;
                          var37.field_u = (320 + var37.field_u * 9) / 10;
                          var37.field_z = 0;
                          break L123;
                        }
                      }
                      if (((StarCannon) this).field_D < 250) {
                        break L109;
                      } else {
                        if (64 <= var37.field_u) {
                          break L109;
                        } else {
                          tj.field_G = 0;
                          gj.field_c = -1;
                          il.field_i = il.field_i + rj.field_h;
                          var37.field_k = -1;
                          ((StarCannon) this).field_D = 0;
                          rj.field_h = 0;
                          if (field_z != -1) {
                            break L109;
                          } else {
                            var3 = 0;
                            L124: while (true) {
                              if (var3 >= 4000) {
                                var11 = (bf) (Object) kh.field_y.c(-3905);
                                L125: while (true) {
                                  if (var11 == null) {
                                    L126: {
                                      if (kd.field_C != 0) {
                                        break L126;
                                      } else {
                                        if (jg.field_H == 0) {
                                          break L126;
                                        } else {
                                          break L126;
                                        }
                                      }
                                    }
                                    L127: {
                                      hh.field_c = 0;
                                      bf.field_w = 0;
                                      ha.field_c = 0;
                                      jl.field_j = 5;
                                      vb.field_m = 2;
                                      var3 = 0;
                                      if (wk.a(108)) {
                                        L128: {
                                          if (kd.field_C > 0) {
                                            break L128;
                                          } else {
                                            if (0 >= jg.field_H) {
                                              break L127;
                                            } else {
                                              break L128;
                                            }
                                          }
                                        }
                                        var3 = 6;
                                        break L127;
                                      } else {
                                        pg.a(true, (byte) -121);
                                        sa.a(nf.field_l + na.field_a * 3, 23820);
                                        fc.field_e = fc.field_e - (ia.field_k << 1);
                                        ia.field_k = 0;
                                        if (jg.field_H <= 0) {
                                          if (kd.field_C <= 0) {
                                            break L127;
                                          } else {
                                            var3 = 2;
                                            break L127;
                                          }
                                        } else {
                                          var3 = 5;
                                          break L127;
                                        }
                                      }
                                    }
                                    od.a(-106, var3, false);
                                    break L109;
                                  } else {
                                    L129: {
                                      if (fi.field_e != var11) {
                                        var11.b(4);
                                        break L129;
                                      } else {
                                        break L129;
                                      }
                                    }
                                    var11 = (bf) (Object) kh.field_y.a(-16913);
                                    continue L125;
                                  }
                                }
                              } else {
                                qc.field_c[var3] = null;
                                var3++;
                                continue L124;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L130: {
                  L131: {
                    L132: {
                      L133: {
                        if (tj.field_G <= 1000) {
                          break L133;
                        } else {
                          if (se.field_m > 2) {
                            break L132;
                          } else {
                            break L133;
                          }
                        }
                      }
                      if (2 != se.field_m) {
                        break L131;
                      } else {
                        if (ua.field_c == 20) {
                          break L132;
                        } else {
                          break L130;
                        }
                      }
                    }
                    tj.field_G = 0;
                    hc.field_e = "hahahah";
                    break L131;
                  }
                  break L130;
                }
                L134: while (true) {
                  if (!ad.e((byte) 103)) {
                    L135: {
                      hc.field_c = hc.field_c + 1;
                      vd.field_j = vd.field_j + 3;
                      if (2 > ad.field_y) {
                        break L135;
                      } else {
                        if (cg.field_e != 7) {
                          break L135;
                        } else {
                          jl.field_j = 20;
                          il.field_i = il.field_i + 1;
                          fc.field_e = fc.field_e + 1;
                          vb.field_m = 20;
                          a.field_a = true;
                          break L135;
                        }
                      }
                    }
                    L136: {
                      if (hc.field_c > 240) {
                        qd.field_E[2] = qd.field_E[1];
                        hc.field_c = hc.field_c - 240;
                        qd.field_E[1] = qd.field_E[0];
                        qd.field_E[0] = ge.field_c[0];
                        qd.field_E[5] = qd.field_E[4];
                        qd.field_E[4] = qd.field_E[3];
                        qd.field_E[3] = ge.field_c[1];
                        var3 = 0;
                        L137: while (true) {
                          if (var3 >= 2) {
                            break L136;
                          } else {
                            L138: {
                              if (ge.field_c[var3] == 1) {
                                ge.field_c[var3] = 0;
                                break L138;
                              } else {
                                break L138;
                              }
                            }
                            L139: {
                              if (ge.field_c[var3] != 3) {
                                break L139;
                              } else {
                                ge.field_c[var3] = 2;
                                break L139;
                              }
                            }
                            L140: {
                              if (ge.field_c[var3] == 4) {
                                ge.field_c[var3] = 0;
                                break L140;
                              } else {
                                break L140;
                              }
                            }
                            L141: {
                              if (ge.field_c[var3] == 5) {
                                ge.field_c[var3] = 0;
                                break L141;
                              } else {
                                break L141;
                              }
                            }
                            L142: {
                              if (ge.field_c[var3] == 6) {
                                ge.field_c[var3] = 0;
                                break L142;
                              } else {
                                break L142;
                              }
                            }
                            L143: {
                              if (8 != ge.field_c[var3]) {
                                break L143;
                              } else {
                                ge.field_c[var3] = 7;
                                break L143;
                              }
                            }
                            L144: {
                              if (ge.field_c[var3] == 9) {
                                ge.field_c[var3] = 0;
                                break L144;
                              } else {
                                break L144;
                              }
                            }
                            L145: {
                              if (10 != ge.field_c[var3]) {
                                break L145;
                              } else {
                                ge.field_c[var3] = 0;
                                break L145;
                              }
                            }
                            L146: {
                              if (ge.field_c[var3] == 11) {
                                ge.field_c[var3] = 0;
                                break L146;
                              } else {
                                break L146;
                              }
                            }
                            L147: {
                              if (ge.field_c[var3] != 13) {
                                break L147;
                              } else {
                                ge.field_c[var3] = 12;
                                break L147;
                              }
                            }
                            var3++;
                            continue L137;
                          }
                        }
                      } else {
                        break L136;
                      }
                    }
                    L148: {
                      if (vd.field_j <= 480) {
                        break L148;
                      } else {
                        vd.field_j = vd.field_j - 480;
                        break L148;
                      }
                    }
                    L149: {
                      if (0 > gj.field_c) {
                        if (!bi.field_b) {
                          lc.field_gb = lc.field_gb + 1;
                          if (1280 >= lc.field_gb) {
                            break L149;
                          } else {
                            lc.field_gb = -640;
                            break L149;
                          }
                        } else {
                          break L149;
                        }
                      } else {
                        break L149;
                      }
                    }
                    pg.a(true, (byte) -104);
                    return;
                  } else {
                    L150: {
                      if (field_E <= 0) {
                        break L150;
                      } else {
                        L151: {
                          hc.field_e = hc.field_e.substring(1) + field_E;
                          if (se.field_m < 2) {
                            break L151;
                          } else {
                            if (ua.field_c >= 20) {
                              break L150;
                            } else {
                              if (2 == se.field_m) {
                                break L151;
                              } else {
                                break L150;
                              }
                            }
                          }
                        }
                        if (2 <= ad.field_y) {
                          L152: {
                            if (!a.field_a) {
                              stackOut_449_0 = 0;
                              stackIn_450_0 = stackOut_449_0;
                              break L152;
                            } else {
                              stackOut_448_0 = 1;
                              stackIn_450_0 = stackOut_448_0;
                              break L152;
                            }
                          }
                          L153: {
                            var3 = stackIn_450_0;
                            if (!hc.field_e.equalsIgnoreCase("thunder")) {
                              break L153;
                            } else {
                              cg.field_e = 7;
                              a.field_a = true;
                              break L153;
                            }
                          }
                          L154: {
                            if (!hc.field_e.equalsIgnoreCase("beeswax")) {
                              break L154;
                            } else {
                              tj.field_G = 10000;
                              a.field_a = true;
                              break L154;
                            }
                          }
                          L155: {
                            if (hc.field_e.equalsIgnoreCase("diewell")) {
                              ua.field_c = -1 + ue.field_c[rj.field_h];
                              a.field_a = true;
                              hc.field_e = "hahahah";
                              break L155;
                            } else {
                              break L155;
                            }
                          }
                          L156: {
                            if (hc.field_e.equalsIgnoreCase("donefor")) {
                              pf.field_d = 1000;
                              a.field_a = true;
                              jk.field_j = 0;
                              break L156;
                            } else {
                              break L156;
                            }
                          }
                          L157: {
                            if (!hc.field_e.equalsIgnoreCase("xebeams")) {
                              break L157;
                            } else {
                              hh.field_c = 1;
                              kh.field_y.b(70, (rf) (Object) new bf(0, -128, 0, 13));
                              a.field_a = true;
                              break L157;
                            }
                          }
                          L158: {
                            if (!hc.field_e.equalsIgnoreCase("levskip")) {
                              break L158;
                            } else {
                              il.field_i = il.field_i + (rj.field_h - 2);
                              u.field_d = 1;
                              rj.field_h = 2;
                              a.field_a = true;
                              hc.field_e = "hahahah";
                              break L158;
                            }
                          }
                          if (!a.field_a) {
                            break L150;
                          } else {
                            if (var3 != 0) {
                              break L150;
                            } else {
                              fc.field_e = fc.field_e + 1;
                              il.field_i = il.field_i + 1;
                              break L150;
                            }
                          }
                        } else {
                          break L150;
                        }
                      }
                    }
                    L159: {
                      if (13 != lb.field_B) {
                        break L159;
                      } else {
                        if (rj.field_h != 4) {
                          L160: {
                            L161: {
                              if (fi.field_e.field_k != 0) {
                                break L161;
                              } else {
                                if (gj.field_c != 0) {
                                  break L161;
                                } else {
                                  if (25 <= fi.field_e.field_r) {
                                    if (fi.field_e.field_r < 167) {
                                      fi.field_e.field_r = 167;
                                      break L160;
                                    } else {
                                      break L160;
                                    }
                                  } else {
                                    fi.field_e.field_r = -fi.field_e.field_r + 192;
                                    break L160;
                                  }
                                }
                              }
                            }
                            od.a(-99, 1, false);
                            break L160;
                          }
                          pg.a(true, (byte) -87);
                          return;
                        } else {
                          fi.field_e.field_u = 32;
                          break L159;
                        }
                      }
                    }
                    L162: {
                      if (ad.field_y < 2) {
                        break L162;
                      } else {
                        L163: {
                          if (lb.field_B == 32) {
                            if (qb.field_e != 0) {
                              sd.field_c = 0;
                              qb.field_e = 0;
                              break L163;
                            } else {
                              sd.field_c = sd.field_c + 1;
                              break L163;
                            }
                          } else {
                            break L163;
                          }
                        }
                        L164: {
                          if (lb.field_B != 33) {
                            break L164;
                          } else {
                            if (qb.field_e != 1) {
                              sd.field_c = 0;
                              qb.field_e = 1;
                              break L164;
                            } else {
                              sd.field_c = sd.field_c + 1;
                              break L164;
                            }
                          }
                        }
                        if (lb.field_B == 34) {
                          if (2 == qb.field_e) {
                            sd.field_c = sd.field_c + 1;
                            break L162;
                          } else {
                            sd.field_c = 0;
                            qb.field_e = 2;
                            break L162;
                          }
                        } else {
                          break L162;
                        }
                      }
                    }
                    if (gj.field_c == -1) {
                      hc.field_e = "hahahah";
                      cg.field_e = 0;
                      continue L134;
                    } else {
                      continue L134;
                    }
                  }
                }
              } else {
                L165: {
                  if (null == qc.field_c[var3]) {
                    break L165;
                  } else {
                    if (null == qc.field_c[var3].a((byte) 108)) {
                      qc.field_c[var3] = null;
                      if (~var3 > ~fi.field_d) {
                        fi.field_d = var3;
                        break L165;
                      } else {
                        break L165;
                      }
                    } else {
                      break L165;
                    }
                  }
                }
                var3++;
                continue L108;
              }
            }
          } else {
            L166: {
              if (!var10.a(qc.field_c, (StarCannon) this, 114)) {
                var10.b(4);
                break L166;
              } else {
                break L166;
              }
            }
            var10 = (bf) (Object) kh.field_y.a(-16913);
            continue L106;
          }
        }
    }

    final void s(int param0) {
        jl.field_j = jl.field_j + 5;
        dg.field_l = 0;
        mj.a(96, 12, 0, 28, 100);
        if (param0 != -9) {
            return;
        }
        mj.a(255, 12, 1200, 37, 100);
    }

    final void u(int param0) {
        vb.field_m = vb.field_m + 1;
        dg.field_l = 0;
        mj.a(96, param0 + -88, 0, 30, 100);
        mj.a(255, param0 ^ 104, 1200, 35, param0);
    }

    private final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bf var9 = null;
        int var10 = 0;
        int var11_int = 0;
        bf var11 = null;
        int var12 = 0;
        bf var13 = null;
        bf var14 = null;
        bf var15 = null;
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        bf stackIn_64_0 = null;
        bf stackIn_65_0 = null;
        bf stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        bf stackIn_81_0 = null;
        bf stackIn_82_0 = null;
        bf stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        bf stackOut_80_0 = null;
        bf stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        bf stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        bf stackOut_63_0 = null;
        bf stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        bf stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        L0: {
          var12 = field_A;
          var2 = sh.b(param0 + -31, 3) - -ua.field_c;
          if (~var2 >= ~ue.field_c[rj.field_h]) {
            break L0;
          } else {
            if (~ua.field_c < ~ue.field_c[rj.field_h]) {
              break L0;
            } else {
              var2 = ue.field_c[rj.field_h];
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 91) {
            break L1;
          } else {
            this.l((byte) 51);
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = sh.b(35, 640);
            var4 = -64 + fi.field_e.field_f + sh.b(param0 ^ -39, 128);
            var5 = null;
            var10 = var2;
            if (var10 != 0) {
              if (1 == var10) {
                break L3;
              } else {
                if (var10 != 4) {
                  if (var10 != 5) {
                    L4: {
                      L5: {
                        if (2 == var10) {
                          break L5;
                        } else {
                          if (var10 == 6) {
                            break L5;
                          } else {
                            if (var10 == 11) {
                              break L5;
                            } else {
                              if (var10 != 13) {
                                L6: {
                                  if (var10 == 3) {
                                    break L6;
                                  } else {
                                    if (var10 == 16) {
                                      break L6;
                                    } else {
                                      if (var10 == 8) {
                                        nf.field_e = 0;
                                        var10 = -8;
                                        L7: while (true) {
                                          if (var10 > 8) {
                                            break L2;
                                          } else {
                                            kh.field_y.b(86, (rf) (Object) new bf(320 + var10 * 24, -Math.abs(-64 + 64 * var10), 320 - -(24 * var10), 1));
                                            var10++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var10 == 18) {
                                          L8: {
                                            var6 = -64;
                                            nf.field_e = 0;
                                            if (sh.b(param0 + 31, 2) == 0) {
                                              var8 = 24;
                                              var7 = 80;
                                              break L8;
                                            } else {
                                              var7 = 560;
                                              var8 = -24;
                                              break L8;
                                            }
                                          }
                                          var10 = -10;
                                          L9: while (true) {
                                            if (var10 > 10) {
                                              break L2;
                                            } else {
                                              var11 = new bf(var7, var6, 640 + -var7, 17);
                                              var11.field_p = true;
                                              var7 = var7 + var8;
                                              var6 -= 16;
                                              kh.field_y.b(param0 ^ 29, (rf) (Object) var11);
                                              var10++;
                                              continue L9;
                                            }
                                          }
                                        } else {
                                          L10: {
                                            if (7 != var10) {
                                              if (var10 != 15) {
                                                if (var10 != 19) {
                                                  L11: {
                                                    if (var10 != 9) {
                                                      if (var10 == 14) {
                                                        break L11;
                                                      } else {
                                                        if (10 == var10) {
                                                          nf.field_e = 50;
                                                          var10 = 0;
                                                          L12: while (true) {
                                                            L13: {
                                                              stackOut_104_0 = var10;
                                                              stackIn_106_0 = stackOut_104_0;
                                                              stackIn_105_0 = stackOut_104_0;
                                                              if (nf.field_l == 2) {
                                                                stackOut_106_0 = stackIn_106_0;
                                                                stackOut_106_1 = 10;
                                                                stackIn_107_0 = stackOut_106_0;
                                                                stackIn_107_1 = stackOut_106_1;
                                                                break L13;
                                                              } else {
                                                                stackOut_105_0 = stackIn_105_0;
                                                                stackOut_105_1 = 5;
                                                                stackIn_107_0 = stackOut_105_0;
                                                                stackIn_107_1 = stackOut_105_1;
                                                                break L13;
                                                              }
                                                            }
                                                            if (stackIn_107_0 >= stackIn_107_1) {
                                                              break L2;
                                                            } else {
                                                              kh.field_y.b(70, (rf) (Object) new bf(var3, -64 + -var10 * 64, var4, 4));
                                                              var10++;
                                                              continue L12;
                                                            }
                                                          }
                                                        } else {
                                                          if (var10 == 12) {
                                                            nf.field_e = -50;
                                                            kh.field_y.b(78, (rf) (Object) new bf(var3, -64, var3, 12));
                                                            break L2;
                                                          } else {
                                                            if (var10 == 17) {
                                                              nf.field_e = -50;
                                                              kh.field_y.b(61, (rf) (Object) new bf(32, -64, 32, 12));
                                                              kh.field_y.b(84, (rf) (Object) new bf(608, -64, 608, 12));
                                                              break L2;
                                                            } else {
                                                              if (20 == var10) {
                                                                var9 = new bf(320, -256, var4, 15);
                                                                kh.field_y.b(param0 + -7, (rf) (Object) var9);
                                                                tj.field_C = var9.field_k;
                                                                ua.field_c = ue.field_c[rj.field_h] + 1;
                                                                pf.field_d = pf.field_d + 1;
                                                                dg.field_l = 0;
                                                                mj.a(255, 12, 0, 41, 100);
                                                                ti.field_f.a((oa) (Object) kc.field_P);
                                                                kc.field_P.f();
                                                                kc.field_P = fl.field_h;
                                                                ti.field_f.b((oa) (Object) kc.field_P);
                                                                kc.field_P.a(mc.field_b);
                                                                break L2;
                                                              } else {
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                  nf.field_e = 0;
                                                  var10 = 0;
                                                  L14: while (true) {
                                                    if (var10 >= 5) {
                                                      break L2;
                                                    } else {
                                                      kh.field_y.b(95, (rf) (Object) new bf(var3, -64 + -var10 * 64, var4, 1));
                                                      kh.field_y.b(94, (rf) (Object) new bf(-var3 + 640, 64 * -var10 - 64, -var4 + 640, 1));
                                                      var10++;
                                                      continue L14;
                                                    }
                                                  }
                                                } else {
                                                  break L10;
                                                }
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          nf.field_e = 150;
                                          kh.field_y.b(81, (rf) (Object) new bf(var3, -64, var4, 3));
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                                nf.field_e = 100;
                                var10 = 0;
                                L15: while (true) {
                                  L16: {
                                    stackOut_75_0 = ~var10;
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_76_0 = stackOut_75_0;
                                    if (2 == nf.field_l) {
                                      stackOut_77_0 = stackIn_77_0;
                                      stackOut_77_1 = 2;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      break L16;
                                    } else {
                                      stackOut_76_0 = stackIn_76_0;
                                      stackOut_76_1 = 1;
                                      stackIn_78_0 = stackOut_76_0;
                                      stackIn_78_1 = stackOut_76_1;
                                      break L16;
                                    }
                                  }
                                  if (stackIn_78_0 <= ~stackIn_78_1) {
                                    break L4;
                                  } else {
                                    L17: {
                                      var11 = new bf(var3, -64 + -var10 * 64, sh.b(77, 128) - 64, 5);
                                      var11.field_h = (bf) var5;
                                      if (3 != var2) {
                                        break L17;
                                      } else {
                                        L18: {
                                          stackOut_80_0 = (bf) var11;
                                          stackIn_82_0 = stackOut_80_0;
                                          stackIn_81_0 = stackOut_80_0;
                                          if (nf.field_l == 2) {
                                            stackOut_82_0 = (bf) (Object) stackIn_82_0;
                                            stackOut_82_1 = 0;
                                            stackIn_83_0 = stackOut_82_0;
                                            stackIn_83_1 = stackOut_82_1;
                                            break L18;
                                          } else {
                                            stackOut_81_0 = (bf) (Object) stackIn_81_0;
                                            stackOut_81_1 = 1;
                                            stackIn_83_0 = stackOut_81_0;
                                            stackIn_83_1 = stackOut_81_1;
                                            break L18;
                                          }
                                        }
                                        stackIn_83_0.field_p = stackIn_83_1 != 0;
                                        break L17;
                                      }
                                    }
                                    var5 = (Object) (Object) var11;
                                    kh.field_y.b(59, (rf) (Object) var11);
                                    var10++;
                                    continue L15;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      nf.field_e = 0;
                      var10 = 0;
                      L19: while (true) {
                        L20: {
                          if (2 == nf.field_l) {
                            stackOut_59_0 = 10;
                            stackIn_60_0 = stackOut_59_0;
                            break L20;
                          } else {
                            stackOut_58_0 = 5;
                            stackIn_60_0 = stackOut_58_0;
                            break L20;
                          }
                        }
                        if (stackIn_60_0 <= var10) {
                          break L4;
                        } else {
                          L21: {
                            var15 = new bf(var3, -64 + -var10 * 64, var4, 2);
                            if (2 == var2) {
                              L22: {
                                stackOut_63_0 = (bf) var15;
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_64_0 = stackOut_63_0;
                                if (nf.field_l == 2) {
                                  stackOut_65_0 = (bf) (Object) stackIn_65_0;
                                  stackOut_65_1 = 0;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  break L22;
                                } else {
                                  stackOut_64_0 = (bf) (Object) stackIn_64_0;
                                  stackOut_64_1 = 1;
                                  stackIn_66_0 = stackOut_64_0;
                                  stackIn_66_1 = stackOut_64_1;
                                  break L22;
                                }
                              }
                              stackIn_66_0.field_p = stackIn_66_1 != 0;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            var15.field_h = (bf) var5;
                            if (var10 != 0) {
                              break L23;
                            } else {
                              var5 = (Object) (Object) var15;
                              break L23;
                            }
                          }
                          L24: {
                            if (!var15.field_p) {
                              var15.field_i = -64 + (var3 - -sh.b(-127, 128));
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          kh.field_y.b(param0 ^ 22, (rf) (Object) var15);
                          var10++;
                          continue L19;
                        }
                      }
                    }
                    break L2;
                  } else {
                    nf.field_e = 0;
                    var10 = 0;
                    L25: while (true) {
                      if (var10 >= 5) {
                        break L2;
                      } else {
                        kh.field_y.b(108, (rf) (Object) new bf(var3, 64 * -var10 + -64, var4, 1));
                        var10++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          if (ua.field_c >= 4) {
            nf.field_e = 0;
            var10 = -3;
            L26: while (true) {
              if (var10 >= 4) {
                break L2;
              } else {
                kh.field_y.b(param0 ^ 5, (rf) (Object) new bf(24 * var10 + 320, -Math.abs(var10 * 64 + -64), var10 * 7680, 1));
                var10++;
                continue L26;
              }
            }
          } else {
            L27: {
              var13 = new bf(var3, -64, var4, 22);
              li.a(param0 + -207, var13);
              var13.field_n = sh.b(-128, 16) + -8;
              var13.field_z = sh.b(-127, 64) + 32;
              var13.field_l = sh.b(param0 + -219, 36);
              if (sh.b(26, 2) != 0) {
                stackOut_46_0 = 640 - sh.b(-128, 128);
                stackIn_47_0 = stackOut_46_0;
                break L27;
              } else {
                stackOut_45_0 = sh.b(param0 + -217, 128);
                stackIn_47_0 = stackOut_45_0;
                break L27;
              }
            }
            var11_int = stackIn_47_0;
            var14 = new bf(var11_int, -128, var4, 22);
            li.a(-120, var14);
            var14.field_n = sh.b(51, 16) + -8;
            var14.field_z = sh.b(-126, 64) + 32;
            var14.field_l = sh.b(-126, 36);
            nf.field_e = var2 * 30 - (-25 - 50 * nf.field_l);
            kh.field_y.b(param0 + 3, (rf) (Object) new bf(128 + sh.b(11, 384), -128, fi.field_e.field_f, 1));
            break L2;
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        StarCannon.r(122);
        bj.a(-1);
        eb.a(true);
        pb.a(91);
        rd.e(-29826);
        bg.a(-115);
        lj.b(87);
        pc.b(-76);
        ag.j((byte) 39);
        ii.b((byte) 70);
        th.c(1719);
        gg.b((byte) 121);
        wk.a(true);
        gj.a(15686);
        ki.a();
        ue.b(0);
        qe.a();
        oh.a(-1);
        ec.a(82);
        rb.g((byte) -59);
        dd.a(-121);
        qa.a(-5504);
        mf.a(23675);
        kg.a((byte) 103);
        r.a(-76);
        ce.a(30518);
        j.a(-3);
        ri.a(-15552);
        fb.a(-113);
        nb.a(572996488);
        pk.a(4);
        qi.b(0);
        vf.a(false);
        fi.a(0);
        tk.a(-124);
        cg.a(89);
        qc.a(-1);
        bb.b(2);
        bf.a(15415);
        d.a(32);
        jl.a(0);
        m.b(-98);
        lh.a((byte) -113);
        wd.c();
        df.a();
        eh.g((byte) 101);
        ef.a((byte) 27);
        td.c(-12539);
        sb.b(105);
        ed.b((byte) -61);
        rf.b(false);
        ui.d((byte) -80);
        uh.b((byte) -115);
        md.a(-27240);
        var2 = 82 / ((param0 - -63) / 62);
        n.f(0);
        gi.b(640);
        wc.c(-1);
        bi.b(0);
        ck.a(false);
        gf.a((byte) -126);
        sd.a(false);
        sc.a(0);
        wg.a((byte) -117);
        be.a(20342);
        tc.g(-14528);
        ok.i((byte) -90);
        lf.e(false);
        lc.m(-11147);
        ph.m(-1);
        kh.h((byte) 126);
        db.a(-117);
        rg.k(-128);
        hg.a(false);
        ma.a((byte) 67);
        sg.a(false);
        g.b(-12837);
        ak.a((byte) 94);
        nc.b((byte) 59);
        ti.a((byte) 13);
        je.a();
        nj.a();
        l.a();
        ja.a((byte) 80);
        ih.b((byte) -125);
        jf.a(true);
        ua.a(128);
        ne.a(-109);
        ia.k(36);
        fc.a(20811);
        u.a(2);
        hc.a(false);
        sa.a(30334);
        v.a((byte) -63);
        s.a((byte) -104);
        hh.a((byte) -22);
        vh.h((byte) -98);
        jh.b(126);
        ra.d((byte) 108);
        tg.h(-64);
        t.c((byte) 113);
        cb.b(0);
        la.a((byte) 1);
        ik.d(0);
        jb.a(-730625660);
        pd.a((byte) 98);
        vj.e(true);
        fg.a((byte) 6);
        hd.a((byte) 125);
        gl.a();
        fd.a(-12241);
        kl.a(21367);
        lb.a((byte) -49);
        ll.a(-1);
        ee.a((byte) 79);
        wi.b(64);
        bl.a(-29584);
        ac.a((byte) -77);
        a.a(-1);
        pe.a((byte) 93);
        ca.a(true);
        ai.a(0);
        hi.a((byte) 56);
        te.a(-1);
        dl.a(true);
        kk.a((byte) 63);
        nk.a();
        fk.a(-4918);
        va.b((byte) 80);
        mc.a((byte) 40);
        ea.a((byte) 48);
        ni.a(-81);
        w.b(3);
        eg.a((byte) -118);
        ci.a(-124);
        bd.a((byte) -74);
        uj.c((byte) -44);
        dk.a(-115);
        kf.a(0);
        kc.a(false);
        qd.h((byte) -37);
        vk.e((byte) 73);
        ba.c(125);
        dh.a((byte) -107);
        na.a(426388817);
        ff.f(-75);
        rc.a((byte) -14);
        ta.a(-32769);
        gd.a((byte) 123);
        ha.a((byte) -62);
        b.a(true);
        ic.a((byte) -120);
        wj.a(false);
        oe.b(12);
        le.a(-11434);
        hf.b(-22720);
        mg.c(0);
        jk.a(-124);
        nf.b(-109);
        ad.f((byte) -95);
        fe.f((byte) 73);
        qj.l(-102);
        fa.a(1851621384);
        kd.a(-16);
        ab.e((byte) 119);
        jg.e(934716193);
        pa.f(-200);
        gh.e(13329);
        qf.d((byte) 100);
        vg.b(-117);
        jj.a(0);
        el.e((byte) 115);
        sj.f((byte) 126);
        h.a();
        li.b(-23);
        se.c((byte) -2);
        ij.b(20756);
        ve.a(32729);
        tj.g(-123);
        af.g(9392);
        o.a(4432);
        ek.a(false);
        bh.a(-110);
        mi.d(1);
        ej.f(99);
        fl.e(115);
        cd.a(8192);
        wh.a(true);
        ob.d(-18147);
        rh.a(false);
        gb.b(122);
        fh.b((byte) -46);
        sh.b(4);
        tf.a(18172);
        ie.h(24288);
        vc.b((byte) 35);
        re.d(0);
        hj.a((byte) -45);
        ld.g(8240);
        oj.d(-113);
        ah.a(-91);
        rj.a(-1);
        hb.a(9681);
        pf.a(true);
        ig.a(-1);
        qb.a(-115);
        ge.a(45);
        q.b((byte) 119);
        kj.a(0);
        mj.a(true);
        od.a(83);
        cl.d((byte) 121);
        vd.a(32);
        ae.a((byte) 64);
        bc.b((byte) -128);
        we.b((byte) 95);
        dg.d(124);
        of.a(true);
        il.b(2147483647);
        nh.a(false);
        nd.g(0);
        cc.e((byte) -98);
        cf.f(1);
        di.f(24979);
        vb.e((byte) 114);
        og.a((byte) 92);
        oi.a(false);
        p.a(11);
        uc.e(1);
        sk.a(false);
        ((StarCannon) this).field_u = null;
    }

    final void d(byte param0) {
        Object var2 = null;
        int var3_int = 0;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        Object stackIn_6_1 = null;
        int stackIn_7_0 = 0;
        Object stackIn_7_1 = null;
        int stackIn_8_0 = 0;
        Object stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_88_0 = 0;
        qc stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        int stackOut_5_0 = 0;
        Object stackOut_5_1 = null;
        int stackOut_7_0 = 0;
        Object stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        Object stackOut_6_1 = null;
        boolean stackOut_6_2 = false;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        L0: {
          var6 = field_A;
          if (n.field_a != null) {
            stackOut_2_0 = n.field_a;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = kj.field_E;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (le.c(4)) {
          L1: {
            stackOut_5_0 = 320;
            stackOut_5_1 = var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (n.field_a != null) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = dl.field_d;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2 ? 1 : 0;
              break L1;
            }
          }
          ee.a(stackIn_8_0, (java.awt.Canvas) (Object) stackIn_8_1, stackIn_8_2 != 0);
          return;
        } else {
          L2: {
            if (param0 == 22) {
              break L2;
            } else {
              this.l((byte) -102);
              break L2;
            }
          }
          if (ld.field_ib) {
            if (oh.field_a != null) {
              ma.a(q.field_i, -13923, 100.0f);
              oi.a((java.awt.Canvas) var2, (byte) 72);
              return;
            } else {
              L3: {
                if (qc.field_d == 0) {
                  ki.b();
                  break L3;
                } else {
                  var3_int = (320 + -fi.field_e.field_f) / 48;
                  eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                  var3_int += 320;
                  eb.field_b[qd.field_E[5]].a(var3_int, hc.field_c + 240, 320, 240);
                  eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                  var3_int += 320;
                  eb.field_b[qd.field_E[2]].a(var3_int, 240 + hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[1]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[0]].a(var3_int, -240 + hc.field_c, 320, 240);
                  var3_int -= 960;
                  eb.field_b[qd.field_E[5]].a(var3_int, 240 + hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[4]].a(var3_int, hc.field_c, 320, 240);
                  eb.field_b[qd.field_E[3]].a(var3_int, -240 + hc.field_c, 320, 240);
                  break L3;
                }
              }
              L4: {
                if (gj.field_c != -1) {
                  break L4;
                } else {
                  if (50 <= cd.field_c) {
                    gb.field_r.d(-gb.field_r.field_x + 640 >> 1, 0);
                    break L4;
                  } else {
                    L5: {
                      gj.field_e.d(-gj.field_e.field_x + 640 >> 1, 0);
                      if (25 < cd.field_c) {
                        break L5;
                      } else {
                        if (field_z == -2) {
                          break L5;
                        } else {
                          gb.field_r.e(640 - gb.field_r.field_x >> 1, 0, -(cd.field_c * 10) + 250);
                          break L5;
                        }
                      }
                    }
                    if (cd.field_c > 25) {
                      gb.field_r.e(-gb.field_r.field_x + 640 >> 1, 0, -250 + 10 * cd.field_c);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L6: {
                if (pa.field_L != field_z) {
                  L7: {
                    if (cd.field_c <= 25) {
                      L8: {
                        var3_int = -cd.field_c + 25 << 2;
                        if (-1 != field_z) {
                          break L8;
                        } else {
                          this.b(var3_int, 7306);
                          break L8;
                        }
                      }
                      L9: {
                        if (pa.field_L == -1) {
                          this.b(-var3_int + 100, 7306);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (3 != pa.field_L) {
                          break L10;
                        } else {
                          if (1 != field_z) {
                            break L10;
                          } else {
                            this.b(0, 7306);
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (pa.field_L != 1) {
                          break L11;
                        } else {
                          if (field_z == 3) {
                            this.b(0, param0 + 7284);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (field_z < 0) {
                        break L7;
                      } else {
                        fg.field_a[field_z].a(320, var3_int);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  if (cd.field_c <= 25) {
                    break L6;
                  } else {
                    if (pa.field_L < 0) {
                      break L6;
                    } else {
                      L12: {
                        var3_int = -25 + cd.field_c << 2;
                        if (pa.field_L != -1) {
                          break L12;
                        } else {
                          this.b(var3_int, 7306);
                          break L12;
                        }
                      }
                      L13: {
                        if (field_z != -1) {
                          break L13;
                        } else {
                          this.b(-var3_int + 100, 7306);
                          break L13;
                        }
                      }
                      L14: {
                        if (pa.field_L != 3) {
                          break L14;
                        } else {
                          if (field_z != 1) {
                            break L14;
                          } else {
                            this.b(0, 7306);
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (1 != pa.field_L) {
                          break L15;
                        } else {
                          if (3 == field_z) {
                            this.b(0, 7306);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      fg.field_a[pa.field_L].a(320, var3_int);
                      break L6;
                    }
                  }
                } else {
                  if (field_z == -1) {
                    this.b(100, 7306);
                    break L6;
                  } else {
                    L16: {
                      if (field_z != 1) {
                        break L16;
                      } else {
                        this.b(0, 7306);
                        break L16;
                      }
                    }
                    L17: {
                      if (3 != field_z) {
                        break L17;
                      } else {
                        if (lf.field_cb != 1) {
                          break L17;
                        } else {
                          this.b(0, 7306);
                          break L17;
                        }
                      }
                    }
                    fg.field_a[field_z].a(320, 100);
                    break L6;
                  }
                }
              }
              L18: {
                var3 = (wf) (Object) pk.field_a.c(-3905);
                if (var3 == null) {
                  break L18;
                } else {
                  L19: {
                    var5 = ((StarCannon) this).field_B;
                    if (80 <= var5) {
                      if (230 <= var5) {
                        var4 = -(var5 / 2) + 123;
                        break L19;
                      } else {
                        var4 = 8;
                        break L19;
                      }
                    } else {
                      var4 = var5 / 2 + -32;
                      break L19;
                    }
                  }
                  j.field_c[var3.field_g].c(8, var4);
                  af.field_y.a(di.field_j[var3.field_g], 48, var4 - -af.field_y.field_p, 65535, -1);
                  break L18;
                }
              }
              L20: {
                if (nh.field_e != 0) {
                  var4 = 256 * jb.field_e / 50;
                  if (0 < var4) {
                    ki.b(0, 0, ki.field_j, ki.field_f, 0, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                } else {
                  break L20;
                }
              }
              L21: {
                if (!gh.f(-23093)) {
                  break L21;
                } else {
                  ki.b(0, 0, 640, 480, 0, 128);
                  ki.d(-12 + (-(ii.a(6940) / 2) + 320), -12 + -(wc.d(20) / 2) + 240, 24 - -ii.a(6940), 24 - -wc.d(20), 0);
                  fg.a(32513, jk.field_f, 12, 12);
                  break L21;
                }
              }
              L22: {
                L23: {
                  if (!cb.a(false)) {
                    break L23;
                  } else {
                    if (!gh.f(param0 ^ -23075)) {
                      L24: {
                        if (n.field_a != null) {
                          stackOut_87_0 = 1;
                          stackIn_88_0 = stackOut_87_0;
                          break L24;
                        } else {
                          stackOut_86_0 = 0;
                          stackIn_88_0 = stackOut_86_0;
                          break L24;
                        }
                      }
                      jf.a(stackIn_88_0 != 0, param0 ^ 106);
                      break L23;
                    } else {
                      dd.a((java.awt.Canvas) var2, 0, 0, -23466);
                      break L22;
                    }
                  }
                }
                dd.a((java.awt.Canvas) var2, 0, 0, -23466);
                break L22;
              }
              return;
            }
          } else {
            oi.a((java.awt.Canvas) var2, (byte) -128);
            return;
          }
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = field_A;
        ((StarCannon) this).a(9, 9, 0, 8, true, 6, false, 7);
        hh.field_b = new hl[9];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 9) {
            var2 = 60 % ((param0 - -23) / 47);
            sb.field_m = 33023;
            hh.field_b[4] = null;
            ig.field_b = 16777215;
            sd.field_a = 33023;
            df.a(22050, false, 10);
            nb.field_f = df.a(nb.field_e, (java.awt.Component) (Object) kj.field_E, 0, 512);
            ea.field_d = df.a(nb.field_e, (java.awt.Component) (Object) kj.field_E, 1, 22050);
            jk.field_k = new vi();
            ti.field_f = new vi();
            nb.field_f.a((c) (Object) jk.field_k);
            ea.field_d.a((c) (Object) ti.field_f);
            se.field_m = 0;
            bi.field_b = false;
            mc.field_b = 128;
            dg.field_l = 0;
            nb.field_g = 64;
            lc.field_gb = -2048;
            nf.field_l = 0;
            ua.field_c = -2;
            qc.field_d = 2;
            ((StarCannon) this).a(false, false, false, true, -752);
            wa.a(0, -75, 16777215, 0, rj.field_l, (java.applet.Applet) this);
            return;
          } else {
            hh.field_b[var2] = new hl(1, 1);
            hh.field_b[var2].field_B[0] = 65535;
            var2++;
            continue L0;
          }
        }
    }

    final void a(int param0) {
        L0: {
          if (n.field_a == null) {
            break L0;
          } else {
            re.a(param0 ^ -25109);
            break L0;
          }
        }
        L1: {
          if (null != nb.field_f) {
            nb.field_f.b();
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (null == ea.field_d) {
            break L2;
          } else {
            ea.field_d.b();
            break L2;
          }
        }
        L3: {
          la.a(2);
          if (param0 == -25109) {
            break L3;
          } else {
            this.m((byte) 25);
            break L3;
          }
        }
    }

    public static void r(int param0) {
        field_C = null;
        if (param0 <= 121) {
            return;
        }
        field_y = null;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = field_A;
          oe.field_a = oe.field_a - 1;
          ja.field_d = ja.field_d + 1;
          if (kg.field_a != 0) {
            na.field_d = na.field_d + fc.field_e;
            il.field_i = il.field_i + 2;
            oe.field_a = oe.field_a + 1;
            ja.field_d = ja.field_d + 1;
            fc.field_e = fc.field_e - jl.field_d * fc.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (wc.field_c[98]) {
            jl.field_d = jl.field_d + pe.field_d;
            ja.field_d = ja.field_d + 5;
            oe.field_a = oe.field_a + 5;
            il.field_i = il.field_i + 10;
            fc.field_e = fc.field_e - pe.field_d * na.field_d;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (wc.field_c[99]) {
            oe.field_a = oe.field_a + 3;
            na.field_d = na.field_d - kc.field_Q;
            fc.field_e = fc.field_e + jl.field_d * kc.field_Q;
            ja.field_d = ja.field_d + 7;
            il.field_i = il.field_i + 10;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!wc.field_c[84]) {
            break L3;
          } else {
            fc.field_e = fc.field_e - na.field_d;
            jl.field_d = jl.field_d + 1;
            oe.field_a = oe.field_a + 10;
            ja.field_d = ja.field_d - 10;
            break L3;
          }
        }
        L4: {
          va.field_f = va.field_f + 1;
          se.field_u = 256;
          if (5 >= va.field_f) {
            break L4;
          } else {
            va.field_f = va.field_f - 5;
            pd.field_a = pd.field_a + 1;
            if (pd.field_a >= 5) {
              pd.field_a = pd.field_a - 5;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (null == pk.field_a.c(-3905)) {
            break L5;
          } else {
            int fieldTemp$2 = ((StarCannon) this).field_B + 1;
            ((StarCannon) this).field_B = ((StarCannon) this).field_B + 1;
            if (fieldTemp$2 == 335) {
              ((StarCannon) this).field_B = 0;
              rf discarded$3 = pk.field_a.a((byte) 39);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (nh.field_e != 0) {
            if (1 == nh.field_e) {
              jb.field_e = jb.field_e + 1;
              if (jb.field_e == 50) {
                L7: {
                  if (!gh.f(-23093)) {
                    pk.b(0);
                    break L7;
                  } else {
                    mf.a((byte) -58);
                    break L7;
                  }
                }
                nh.field_e = 2;
                break L6;
              } else {
                break L6;
              }
            } else {
              if (nh.field_e != 2) {
                jb.field_e = jb.field_e - 1;
                if (jb.field_e == 0) {
                  nh.field_e = 0;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                L8: {
                  if (wk.a(77)) {
                    field_z = vj.field_ab;
                    break L8;
                  } else {
                    oh.field_a = og.a(4, (byte) 113);
                    sa.a(nf.field_l + na.field_a * 3, 23820);
                    field_z = ff.field_o;
                    break L8;
                  }
                }
                L9: {
                  if (gh.f(-23093)) {
                    hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, (qe) (Object) a.field_b, -11, 12, false);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                nh.field_e = 3;
                pa.field_L = field_z;
                break L6;
              }
            }
          } else {
            if (pa.field_L == field_z) {
              if (field_z != -1) {
                fg.field_a[field_z].b(0);
                break L6;
              } else {
                this.m((byte) 110);
                break L6;
              }
            } else {
              L10: {
                cd.field_c = cd.field_c + 1;
                if (25 > cd.field_c) {
                  break L10;
                } else {
                  if (-1 == pa.field_L) {
                    cd.field_c = 50;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              if (cd.field_c >= 50) {
                field_z = pa.field_L;
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
    }

    public StarCannon() {
        ((StarCannon) this).field_D = 0;
        ((StarCannon) this).field_B = 0;
    }

    final static void a(ue param0, boolean param1, int param2, ue param3, ue param4) {
        try {
            qa.field_a = uf.a("", 15);
            if (param2 != -20169) {
                field_E = 's';
            }
            qa.field_a.a(false, false);
            fc.a(param0, param4, (byte) 95, param3);
            td.b(30000);
            ie.field_x = cl.field_k;
            uh.field_k = cl.field_k;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "StarCannon.V(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final void k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        bf var6 = null;
        int var7 = 0;
        int var8 = 0;
        bf var8_ref_bf = null;
        int var9 = 0;
        int var10 = 0;
        bf var11 = null;
        int var12 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        L0: {
          var12 = field_A;
          var2 = sh.b(-127, 3) + ua.field_c;
          if (ue.field_c[rj.field_h] >= var2) {
            break L0;
          } else {
            if (ua.field_c <= ue.field_c[rj.field_h]) {
              var2 = ue.field_c[rj.field_h];
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var3 = sh.b(-126, 640);
            var4 = -64 + fi.field_e.field_f + sh.b(-127, 128);
            var5 = null;
            var7 = var2;
            if (var7 == 0) {
              break L2;
            } else {
              if (3 != var7) {
                if (var7 != 10) {
                  L3: {
                    if (var7 != 1) {
                      if (11 == var7) {
                        break L3;
                      } else {
                        if (var7 != 5) {
                          L4: {
                            if (2 != var7) {
                              if (var7 != 9) {
                                L5: {
                                  if (var7 == 4) {
                                    break L5;
                                  } else {
                                    if (var7 != 15) {
                                      L6: {
                                        if (var7 != 6) {
                                          if (19 == var7) {
                                            break L6;
                                          } else {
                                            if (7 == var7) {
                                              nf.field_e = 0;
                                              kh.field_y.b(73, (rf) (Object) new bf(var3, -64, var4, 3));
                                              kh.field_y.b(64, (rf) (Object) new bf(640 + -var3, -64, 640 + -var3, 21));
                                              break L1;
                                            } else {
                                              L7: {
                                                if (var7 == 8) {
                                                  break L7;
                                                } else {
                                                  if (var7 == 14) {
                                                    break L7;
                                                  } else {
                                                    L8: {
                                                      if (var7 == 12) {
                                                        break L8;
                                                      } else {
                                                        if (var7 != 16) {
                                                          if (13 == var7) {
                                                            nf.field_e = -50;
                                                            var7 = sh.b(-126, 180) + 32;
                                                            kh.field_y.b(74, (rf) (Object) new bf(var7, -64, var7, 12));
                                                            var7 = 608 + -sh.b(-128, 180);
                                                            kh.field_y.b(56, (rf) (Object) new bf(var7, -64, var7, 12));
                                                            break L1;
                                                          } else {
                                                            if (var7 == 17) {
                                                              L9: {
                                                                nf.field_e = -50;
                                                                kh.field_y.b(82, (rf) (Object) new bf(32, -64, 32, 21));
                                                                if (sh.b(34, 2) == 0) {
                                                                  kh.field_y.b(91, (rf) (Object) new bf(320, -32, 320, 18));
                                                                  kh.field_y.b(67, (rf) (Object) new bf(320, -96, 320, 18));
                                                                  kh.field_y.b(79, (rf) (Object) new bf(320, -160, 320, 18));
                                                                  break L9;
                                                                } else {
                                                                  kh.field_y.b(69, (rf) (Object) new bf(320, -96, 320, 21));
                                                                  break L9;
                                                                }
                                                              }
                                                              kh.field_y.b(106, (rf) (Object) new bf(608, -64, 608, 21));
                                                              break L1;
                                                            } else {
                                                              if (18 == var7) {
                                                                nf.field_e = 150;
                                                                kh.field_y.b(76, (rf) (Object) new bf(var3, -64, var4, 3));
                                                                var7 = 0;
                                                                L10: while (true) {
                                                                  L11: {
                                                                    if (2 == nf.field_l) {
                                                                      stackOut_103_0 = 2;
                                                                      stackIn_104_0 = stackOut_103_0;
                                                                      break L11;
                                                                    } else {
                                                                      stackOut_102_0 = 1;
                                                                      stackIn_104_0 = stackOut_102_0;
                                                                      break L11;
                                                                    }
                                                                  }
                                                                  if (stackIn_104_0 <= var7) {
                                                                    kh.field_y.b(107, (rf) (Object) new bf(-var3 + 640, -64, 640 - var4, 3));
                                                                    break L1;
                                                                  } else {
                                                                    kh.field_y.b(112, (rf) (Object) new bf(320, 64 * -var7 - 128, 320, 3));
                                                                    var7++;
                                                                    continue L10;
                                                                  }
                                                                }
                                                              } else {
                                                                if (20 == var7) {
                                                                  var6 = new bf(320, -256, var4, 16);
                                                                  kh.field_y.b(88, (rf) (Object) var6);
                                                                  tj.field_C = var6.field_k;
                                                                  ua.field_c = 1 + ue.field_c[rj.field_h];
                                                                  pf.field_d = pf.field_d + 1;
                                                                  dg.field_l = 0;
                                                                  mj.a(255, 12, 0, 41, 100);
                                                                  ti.field_f.a((oa) (Object) kc.field_P);
                                                                  kc.field_P.f();
                                                                  kc.field_P = fl.field_h;
                                                                  ti.field_f.b((oa) (Object) kc.field_P);
                                                                  kc.field_P.a(mc.field_b);
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                    nf.field_e = 100;
                                                    kh.field_y.b(75, (rf) (Object) new bf(var3, -64, -64 + sh.b(-1, 128), 5));
                                                    break L1;
                                                  }
                                                }
                                              }
                                              L12: {
                                                nf.field_e = 0;
                                                var7 = 0;
                                                if (sh.b(62, 2) != 0) {
                                                  var9 = -24;
                                                  var8 = 560;
                                                  break L12;
                                                } else {
                                                  var8 = 80;
                                                  var9 = 24;
                                                  break L12;
                                                }
                                              }
                                              var10 = -10;
                                              L13: while (true) {
                                                if (var10 > 10) {
                                                  var8 = 64 + sh.b(100, 512);
                                                  kh.field_y.b(95, (rf) (Object) new bf(var8, -96, var8, 21));
                                                  break L1;
                                                } else {
                                                  var11 = new bf(var8, var7, 640 + -var8, 17);
                                                  var7 -= 16;
                                                  var11.field_p = true;
                                                  var8 = var8 + var9;
                                                  kh.field_y.b(100, (rf) (Object) var11);
                                                  var10++;
                                                  continue L13;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L6;
                                        }
                                      }
                                      nf.field_e = 0;
                                      var7 = 0;
                                      L14: while (true) {
                                        if (5 <= var7) {
                                          kh.field_y.b(122, (rf) (Object) new bf(-var3 + 640, -64, -var3 + 640, 21));
                                          break L1;
                                        } else {
                                          kh.field_y.b(117, (rf) (Object) new bf(var3, -64 + -var7 * 64, var4, 1));
                                          var7++;
                                          continue L14;
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                nf.field_e = 0;
                                var7 = 0;
                                L15: while (true) {
                                  if (5 <= var7) {
                                    kh.field_y.b(57, (rf) (Object) new bf(640 - var3, -64, -var4 + 640, 3));
                                    break L1;
                                  } else {
                                    kh.field_y.b(81, (rf) (Object) new bf(var3, -64 + -var7 * 64, var4, 1));
                                    var7++;
                                    continue L15;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          nf.field_e = 175;
                          var7 = 0;
                          L16: while (true) {
                            L17: {
                              stackOut_65_0 = var7;
                              stackIn_67_0 = stackOut_65_0;
                              stackIn_66_0 = stackOut_65_0;
                              if (2 != nf.field_l) {
                                stackOut_67_0 = stackIn_67_0;
                                stackOut_67_1 = 5;
                                stackIn_68_0 = stackOut_67_0;
                                stackIn_68_1 = stackOut_67_1;
                                break L17;
                              } else {
                                stackOut_66_0 = stackIn_66_0;
                                stackOut_66_1 = 10;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_68_1 = stackOut_66_1;
                                break L17;
                              }
                            }
                            if (stackIn_68_0 >= stackIn_68_1) {
                              break L1;
                            } else {
                              kh.field_y.b(63, (rf) (Object) new bf(var3, -64 + 64 * -var7, var4, 4));
                              var7++;
                              continue L16;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  nf.field_e = 0;
                  var4 = var3 - -sh.b(-24, 128) - 64;
                  var7 = 0;
                  L18: while (true) {
                    L19: {
                      stackOut_56_0 = ~var7;
                      stackIn_58_0 = stackOut_56_0;
                      stackIn_57_0 = stackOut_56_0;
                      if (nf.field_l == 2) {
                        stackOut_58_0 = stackIn_58_0;
                        stackOut_58_1 = 10;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        break L19;
                      } else {
                        stackOut_57_0 = stackIn_57_0;
                        stackOut_57_1 = 5;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        break L19;
                      }
                    }
                    if (stackIn_59_0 <= ~stackIn_59_1) {
                      break L1;
                    } else {
                      L20: {
                        var8_ref_bf = new bf(var3, -64 + 64 * -var7, var4, 2);
                        var8_ref_bf.field_h = (bf) var5;
                        kh.field_y.b(115, (rf) (Object) var8_ref_bf);
                        if (var7 != 0) {
                          break L20;
                        } else {
                          var5 = (Object) (Object) var8_ref_bf;
                          break L20;
                        }
                      }
                      var7++;
                      continue L18;
                    }
                  }
                } else {
                  L21: {
                    nf.field_e = 0;
                    var7 = -64;
                    if (sh.b(-126, 2) == 0) {
                      var8 = 80;
                      var9 = 24;
                      break L21;
                    } else {
                      var9 = -24;
                      var8 = 560;
                      break L21;
                    }
                  }
                  var10 = -10;
                  L22: while (true) {
                    if (10 < var10) {
                      break L1;
                    } else {
                      var11 = new bf(var8, var7, 640 - var8, 17);
                      var7 -= 16;
                      var11.field_p = true;
                      var8 = var8 + var9;
                      kh.field_y.b(107, (rf) (Object) var11);
                      var10++;
                      continue L22;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
          }
          nf.field_e = 0;
          var7 = -8;
          L23: while (true) {
            if (var7 >= 8) {
              break L1;
            } else {
              kh.field_y.b(88, (rf) (Object) new bf(320 - -(var7 * 24), -Math.abs(-64 + var7 * 64), 24 * var7 + 320, 1));
              var7++;
              continue L23;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[8192];
        field_C = "Menu";
        field_z = -2;
    }
}
