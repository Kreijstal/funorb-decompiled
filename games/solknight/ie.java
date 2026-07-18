/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class ie {
    static long[] field_g;
    private sf field_f;
    private int field_e;
    static long[][] field_c;
    private int field_b;
    private int field_d;
    private int field_a;

    private final int a(byte param0, int param1) {
        if (param0 >= -100) {
            ((ie) this).c(11);
        }
        return 37;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (ab.field_s[((ie) this).field_d].length <= var4) {
            return -1;
          } else {
            var5 = this.b(-114, var4);
            if (this.b((byte) -4, var4)) {
              if (this.a(var4, -3) <= param0) {
                if (param0 < this.a(var4, (byte) 55)) {
                  if (param2 >= var5) {
                    if (this.a((byte) -113, var4) + var5 > param2) {
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

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_146_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          var4 = ab.field_s[((ie) this).field_d][param2];
          var5 = var4;
          if (var5 != 0) {
            if (var5 != 1) {
              if (var5 != 5) {
                if (var5 == 16) {
                  if (((ie) this).field_f.f(0)) {
                    gb.a(param0, 9, -128);
                    mb.a(true, 14, 256);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  L1: {
                    if (var5 != 14) {
                      if (var5 != 3) {
                        if (6 == var5) {
                          if (!((ie) this).field_f.f(0)) {
                            break L1;
                          } else {
                            gb.a(param0, fb.field_c, -128);
                            mb.a(true, 14, 256);
                            break L0;
                          }
                        } else {
                          if (var5 == 2) {
                            if (((ie) this).field_f.f(0)) {
                              gb.a(param0, 2, -127);
                              mb.a(true, 14, 256);
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            if (17 == var5) {
                              if (((ie) this).field_f.f(0)) {
                                L2: {
                                  if (pg.field_e) {
                                    break L2;
                                  } else {
                                    pl.field_a = pl.field_a + oa.field_m * 100;
                                    break L2;
                                  }
                                }
                                L3: {
                                  kb.field_b = kb.field_b + 1;
                                  lk.field_b = ud.field_k;
                                  wc.field_c = 0;
                                  if (kb.field_b == 4) {
                                    pk.a((byte) -96, 2, true);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                L4: {
                                  if (kb.field_b != 7) {
                                    break L4;
                                  } else {
                                    pk.a((byte) -96, 3, true);
                                    break L4;
                                  }
                                }
                                f.field_d = 0;
                                oa.field_m = 0;
                                jg.field_b = 10;
                                mf.field_A = 0;
                                ib.field_h = 0;
                                kf.field_G = new rb[10];
                                fg.field_a = 0;
                                pg.field_e = false;
                                lk.field_f = 0;
                                vk.field_p = 0;
                                bi.field_h = 0;
                                var5 = 0;
                                L5: while (true) {
                                  if (~var5 <= ~nf.field_W.length) {
                                    gb.a(param0, -1, -128);
                                    mb.a(true, 14, 256);
                                    break L0;
                                  } else {
                                    nf.field_W[var5] = bk.a(1280, jb.field_g, (byte) -116) + -640;
                                    nf.field_W[var5 + 1] = bk.a(720, jb.field_g, (byte) 83);
                                    var5 += 2;
                                    continue L5;
                                  }
                                }
                              } else {
                                break L0;
                              }
                            } else {
                              if (var5 != 18) {
                                if (var5 != 12) {
                                  if (var5 == 13) {
                                    L6: {
                                      if (((ie) this).field_f.c((byte) 11)) {
                                        gg.a(0, 10);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (((ie) this).field_f.e(12542)) {
                                        gg.a(256, 10);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      if (!((ie) this).field_f.a(93)) {
                                        break L8;
                                      } else {
                                        var5 = 64 + (wb.field_a + 9);
                                        var6 = (this.a(param2, -3) + (this.a(param2, (byte) 55) + -var5) >> 1) - -wb.field_a + 8;
                                        var7 = gb.field_j + -var6 << 2;
                                        if (var7 <= 0) {
                                          gg.a(0, 10);
                                          break L8;
                                        } else {
                                          if (var7 < 256) {
                                            gg.a(var7, 10);
                                            break L8;
                                          } else {
                                            gg.a(256, 10);
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (!((ie) this).field_f.c(0)) {
                                        break L9;
                                      } else {
                                        if (td.field_l > 32) {
                                          L10: {
                                            var5 = td.field_l % 32;
                                            if (var5 == 0) {
                                              var5 = 32;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                          gg.a(td.field_l - var5, 10);
                                          break L9;
                                        } else {
                                          gg.a(0, 10);
                                          break L9;
                                        }
                                      }
                                    }
                                    if (((ie) this).field_f.e((byte) -72)) {
                                      if (td.field_l >= 224) {
                                        gg.a(256, 10);
                                        break L0;
                                      } else {
                                        var5 = td.field_l % 32;
                                        gg.a(32 + (td.field_l + -var5), 10);
                                        break L0;
                                      }
                                    } else {
                                      break L0;
                                    }
                                  } else {
                                    if (4 == var5) {
                                      if (((ie) this).field_f.d((byte) -107)) {
                                        L11: {
                                          if (dj.field_k != null) {
                                            qk.d(14995);
                                            break L11;
                                          } else {
                                            var5 = param0 ? 1 : 0;
                                            ta.a(false, 320, w.field_b, 2, ug.field_g.field_F - -ug.field_g.field_s, (mg) (Object) ug.field_g, 8, ad.field_b.field_F - -ad.field_b.field_s, ad.field_b.field_F, w.field_b, 8, 240, (mg) (Object) ad.field_b, ug.field_g.field_F, var5 != 0);
                                            break L11;
                                          }
                                        }
                                        mb.a(true, 14, 256);
                                        break L0;
                                      } else {
                                        break L0;
                                      }
                                    } else {
                                      if (var5 != 7) {
                                        if (8 != var5) {
                                          if (var5 == 9) {
                                            if (!((ie) this).field_f.d((byte) -17)) {
                                              break L1;
                                            } else {
                                              rg.field_c = 1;
                                              mb.a(true, 14, 256);
                                              break L0;
                                            }
                                          } else {
                                            if (var5 != 10) {
                                              if (var5 != 15) {
                                                if (var5 != 19) {
                                                  if (var5 != 11) {
                                                    break L0;
                                                  } else {
                                                    if (((ie) this).field_f.f(0)) {
                                                      L12: {
                                                        if (dj.field_k != null) {
                                                          qk.d(14995);
                                                          break L12;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                      he.a(-1, ia.g(-81));
                                                      mb.a(true, 14, 256);
                                                      break L1;
                                                    } else {
                                                      break L0;
                                                    }
                                                  }
                                                } else {
                                                  if (!((ie) this).field_f.f(0)) {
                                                    break L1;
                                                  } else {
                                                    L13: {
                                                      if (null == dj.field_k) {
                                                        break L13;
                                                      } else {
                                                        qk.d(14995);
                                                        break L13;
                                                      }
                                                    }
                                                    fh.a(25, ia.g(-55));
                                                    mb.a(true, 14, 256);
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                if (((ie) this).field_f.d((byte) -58)) {
                                                  L14: {
                                                    L15: {
                                                      if (((ie) this).field_d == 3) {
                                                        break L15;
                                                      } else {
                                                        if (2 != ((ie) this).field_d) {
                                                          if (8 != ((ie) this).field_d) {
                                                            break L14;
                                                          } else {
                                                            bb.a((byte) -14, 7, 8);
                                                            break L14;
                                                          }
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    bb.a((byte) -14, ((ie) this).field_d, ((ie) this).field_d);
                                                    break L14;
                                                  }
                                                  mb.a(true, 14, 256);
                                                  break L0;
                                                } else {
                                                  break L0;
                                                }
                                              }
                                            } else {
                                              if (!((ie) this).field_f.d((byte) -42)) {
                                                break L1;
                                              } else {
                                                rg.field_c = 2;
                                                mb.a(true, 14, 256);
                                                break L0;
                                              }
                                            }
                                          }
                                        } else {
                                          if (((ie) this).field_f.d((byte) -94)) {
                                            rg.field_c = 0;
                                            mb.a(true, 14, 256);
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        }
                                      } else {
                                        if (((ie) this).field_f.d((byte) -49)) {
                                          L16: {
                                            if (!il.b(507)) {
                                              L17: {
                                                if (!il.b(507)) {
                                                  ah.b(true);
                                                  break L17;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                              kh.field_c = null;
                                              if (0 == jl.field_d) {
                                                gb.a(param0, 2, -128);
                                                break L16;
                                              } else {
                                                gb.a(param0, 7, -127);
                                                break L16;
                                              }
                                            } else {
                                              if (lk.field_e != 0) {
                                                gb.a(param0, 8, -128);
                                                break L16;
                                              } else {
                                                gb.a(param0, 0, -127);
                                                break L16;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (0 < ob.field_l) {
                                              stackOut_145_0 = 0;
                                              stackIn_146_0 = stackOut_145_0;
                                              break L18;
                                            } else {
                                              stackOut_144_0 = 9;
                                              stackIn_146_0 = stackOut_144_0;
                                              break L18;
                                            }
                                          }
                                          fb.field_c = stackIn_146_0;
                                          mb.a(true, 14, 256);
                                          pk.a((byte) -96, 0, true);
                                          break L0;
                                        } else {
                                          break L0;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L19: {
                                    if (((ie) this).field_f.c((byte) 11)) {
                                      ah.a((byte) -88, 0);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((ie) this).field_f.e(12542)) {
                                      ah.a((byte) -52, 256);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (!((ie) this).field_f.a(65)) {
                                      break L21;
                                    } else {
                                      var5 = 64 + (wb.field_a + 9);
                                      var6 = 8 + (-var5 + (this.a(param2, -3) - -this.a(param2, (byte) 55)) >> 1) - -wb.field_a;
                                      var7 = -var6 + gb.field_j << 2;
                                      if (0 >= var7) {
                                        ah.a((byte) -86, 0);
                                        break L21;
                                      } else {
                                        if (256 <= var7) {
                                          ah.a((byte) -82, 256);
                                          break L21;
                                        } else {
                                          ah.a((byte) -97, var7);
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                  L22: {
                                    if (!((ie) this).field_f.c(0)) {
                                      break L22;
                                    } else {
                                      pc.a(121);
                                      break L22;
                                    }
                                  }
                                  if (!((ie) this).field_f.e((byte) -57)) {
                                    break L1;
                                  } else {
                                    cb.b((byte) -39);
                                    break L0;
                                  }
                                }
                              } else {
                                if (((ie) this).field_f.f(0)) {
                                  L23: {
                                    f.field_d = 0;
                                    ve.field_b = 0;
                                    kh.field_d = 255;
                                    pg.field_e = true;
                                    uf.field_p = -1;
                                    if (!il.b(507)) {
                                      ah.b(true);
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    kh.field_c = null;
                                    if (!il.b(507)) {
                                      if (jl.field_d != 0) {
                                        gb.a(param0, 7, -127);
                                        break L24;
                                      } else {
                                        gb.a(param0, 2, -127);
                                        break L24;
                                      }
                                    } else {
                                      gb.a(param0, 8, -128);
                                      break L24;
                                    }
                                  }
                                  mb.a(true, 14, 256);
                                  break L0;
                                } else {
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (((ie) this).field_f.f(0)) {
                          gb.a(param0, 4, -127);
                          fb.field_c = ((ie) this).field_d;
                          mb.a(true, 14, 256);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      if (!((ie) this).field_f.f(0)) {
                        break L1;
                      } else {
                        gb.a(param0, 3, -128);
                        fb.field_c = ((ie) this).field_d;
                        mb.a(true, 14, 256);
                        break L0;
                      }
                    }
                  }
                  break L0;
                }
              } else {
                if (((ie) this).field_f.f(0)) {
                  gb.a(param0, 0, -128);
                  mb.a(true, 14, 256);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              if (((ie) this).field_f.f(0)) {
                L25: {
                  gb.a(param0, -1, -128);
                  if (ob.field_l > 0) {
                    stackOut_43_0 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    break L25;
                  } else {
                    stackOut_42_0 = 9;
                    stackIn_44_0 = stackOut_42_0;
                    break L25;
                  }
                }
                fb.field_c = stackIn_44_0;
                mb.a(true, 14, 256);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            if (((ie) this).field_f.f(0)) {
              L26: {
                oa.field_n = false;
                ve.field_b = -1;
                ic.field_t = ic.field_t + lc.field_p;
                bi.field_b = null;
                kh.field_c = null;
                wc.field_c = 0;
                jl.field_d = 0;
                lc.field_p = 0;
                lc.field_h = lc.field_h - fa.field_f;
                oa.field_m = 0;
                k.field_c = 0;
                ic.field_t = ic.field_t - (bi.field_i >>> 11) * fa.field_f;
                uf.field_p = 2;
                jg.field_b = 10;
                kb.field_b = 0;
                pg.field_e = false;
                fg.field_a = 0;
                fa.field_f = 0;
                bi.field_h = 0;
                pl.field_a = 0;
                ic.field_t = ic.field_t + lk.field_e;
                ic.field_t = ic.field_t - (lc.field_h >>> 17) * ud.field_k;
                bi.field_i = bi.field_i - ud.field_k;
                ib.field_h = 0;
                mf.field_A = 0;
                cb.field_a = 0;
                lk.field_b = 0;
                lk.field_e = 0;
                vk.field_p = 0;
                ci.field_ib = 0;
                ob.field_j = 0;
                ia.field_hb = 0;
                lk.field_f = 0;
                ud.field_k = 0;
                kf.field_G = null;
                pk.a((byte) -96, 1, true);
                gb.a(param0, -1, -128);
                if (ob.field_l > 0) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L26;
                } else {
                  stackOut_36_0 = 9;
                  stackIn_38_0 = stackOut_36_0;
                  break L26;
                }
              }
              fb.field_c = stackIn_38_0;
              mb.a(true, 14, 256);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final void e(int param0) {
        int var3 = 0;
        L0: {
          var3 = SolKnight.field_L ? 1 : 0;
          if (((ie) this).field_d != 2) {
            break L0;
          } else {
            if (!il.b(507)) {
              L1: {
                if (el.field_n == 96) {
                  if (((ie) this).field_f.field_f > 0) {
                    if (3 != ((ie) this).field_f.field_f) {
                      ((ie) this).field_f.a((byte) 111, ((ie) this).field_f.field_f - 1);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((ie) this).field_f.a((byte) 111, 2);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (97 == el.field_n) {
                  if (2 > ((ie) this).field_f.field_f) {
                    ((ie) this).field_f.a((byte) 111, 1 + ((ie) this).field_f.field_f);
                    break L2;
                  } else {
                    if (2 == ((ie) this).field_f.field_f) {
                      ((ie) this).field_f.a((byte) 111, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (el.field_n != 99) {
                  break L3;
                } else {
                  L4: {
                    if (((ie) this).field_f.field_f < 0) {
                      break L4;
                    } else {
                      if (((ie) this).field_f.field_f <= 2) {
                        ((ie) this).field_f.a((byte) 111, 3);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((ie) this).field_f.a((byte) 111, rg.field_c);
                  break L3;
                }
              }
              L5: {
                if (el.field_n == 98) {
                  if (((ie) this).field_f.field_f == 3) {
                    ((ie) this).field_f.a((byte) 111, rg.field_c);
                    break L5;
                  } else {
                    ((ie) this).field_f.a((byte) 111, 3);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              ((ie) this).field_f.b((byte) 108);
              return;
            } else {
              break L0;
            }
          }
        }
        if (9 == ((ie) this).field_d) {
          ((ie) this).field_f.a(0, false);
          return;
        } else {
          ((ie) this).field_f.a(true);
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        if (2 == ((ie) this).field_d) {
            if (!(il.b(507))) {
                return 180 + this.a(param0, -3);
            }
        }
        if (!(gg.field_f[((ie) this).field_d])) {
            var3 = ab.field_s[((ie) this).field_d][param0];
            var4 = te.field_I[var3];
            if (!(var4 != null)) {
                return jb.field_a[((ie) this).field_d];
            }
            var5 = ad.field_b.b(var4) + 20;
            return bb.field_P[((ie) this).field_d] + (jb.field_a[((ie) this).field_d] - -var5) >> 1;
        }
        return bb.field_P[((ie) this).field_d];
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hd var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var4 = this.b(123, param2);
          var5 = this.a(param2, -3);
          var6 = ab.field_s[((ie) this).field_d][param2];
          var7 = te.field_I[var6];
          if (var7 != null) {
            break L0;
          } else {
            var7 = "ERROR: missing text";
            break L0;
          }
        }
        L1: {
          if (!param1) {
            stackOut_4_0 = 1134591;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 16777215;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_5_0;
          if (!param1) {
            stackOut_7_0 = 8421504;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1134591;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_8_0;
          var10 = -var5 + this.a(param2, (byte) 55);
          var11 = this.a((byte) -125, param2);
          if (8 > var6) {
            break L3;
          } else {
            if (var6 > 10) {
              break L3;
            } else {
              if (rg.field_c == param2) {
                var8 = 16776960;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L4: {
          if (!gg.field_f[((ie) this).field_d]) {
            uj.a(var10, var11, var5, w.field_b, var4, 2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          L6: {
            var12 = ad.field_b;
            var13 = -w.field_b[0].field_r + var11 + (-w.field_b[6].field_r + (-var12.field_F + -var12.field_s));
            if (12 == var6) {
              break L6;
            } else {
              if (var6 == 13) {
                break L6;
              } else {
                var12.a(var7, var5 + (var10 >> 1), (var13 >> 1) + (var12.field_F + (var4 - -w.field_b[0].field_r)), var8, var9);
                break L5;
              }
            }
          }
          L7: {
            var14 = 9 + (wb.field_a - -64);
            var15 = var5 - -(-var14 + var10 >> 1);
            var12.c(var7, var15, (var13 >> 1) + var4 - (-var12.field_F + -w.field_b[0].field_r), var8, var9);
            var15 = var15 + (wb.field_a - -8);
            if (12 == var6) {
              stackOut_21_0 = wc.field_a;
              stackIn_22_0 = stackOut_21_0;
              break L7;
            } else {
              stackOut_20_0 = td.field_l;
              stackIn_22_0 = stackOut_20_0;
              break L7;
            }
          }
          var16 = stackIn_22_0;
          mi.b(var15 - -1, var4 + (var11 >> 1), 65, 4, var9);
          mi.b(var15 - -(var16 >> 2), 2 + ((var11 - 20 >> 1) + var4), 3, 20, var9);
          mi.b(var15, -1 + var4 - -(var11 >> 1), 65, 4, var8);
          mi.b(var15 + (var16 >> 2) + -1, 1 + (-20 + var11 >> 1) + var4, 3, 20, var8);
          break L5;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 < 20) {
            field_c = null;
        }
        mi.g(param0, param1, 8, 16711680);
        mi.b(param0 - 8, param1, 4, 16711680);
        mi.b(param0 + 4, param1, 4, 16711680);
        mi.h(param0, -8 + param1, 4, 16711680);
        mi.h(param0, -4 + param1 - -8, 4, 16711680);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (ve.field_b > 240) {
          L0: {
            if (hg.field_F != 0) {
              break L0;
            } else {
              if (fh.field_d[83]) {
                break L0;
              } else {
                if (!fh.field_d[84]) {
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
          ve.field_b = 240;
          return;
        } else {
          L1: {
            L2: {
              if (9 != ((ie) this).field_d) {
                break L2;
              } else {
                L3: {
                  var2 = ke.a(true, true);
                  if (var2 != 3) {
                    break L3;
                  } else {
                    fh.a(62, ia.g(param0 ^ -89));
                    break L3;
                  }
                }
                L4: {
                  if (var2 != 1) {
                    break L4;
                  } else {
                    gb.a(false, 0, -128);
                    ((ie) this).field_f.field_f = 0;
                    break L4;
                  }
                }
                if (2 != var2) {
                  break L2;
                } else {
                  gb.a(true, 0, param0 ^ -128);
                  break L1;
                }
              }
            }
            break L1;
          }
          L5: while (true) {
            if (!wk.a((byte) -56)) {
              L6: {
                ((ie) this).field_f.a(param0 + -125, this.a(gb.field_j, (byte) 111, ad.field_m), this.a(db.field_o, (byte) 111, s.field_gb));
                if (-1 != ((ie) this).field_f.field_f) {
                  this.a(true, 2647, ((ie) this).field_f.field_f);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param0 != hg.field_F) {
                  ((ie) this).field_b = s.field_gb;
                  ((ie) this).field_a = db.field_o;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            } else {
              L8: {
                if (13 != el.field_n) {
                  break L8;
                } else {
                  if (5 == ((ie) this).field_d) {
                    break L8;
                  } else {
                    if (((ie) this).field_d != 1) {
                      if (8 == ((ie) this).field_d) {
                        continue L5;
                      } else {
                        gb.a(false, fb.field_c, -127);
                        continue L5;
                      }
                    } else {
                      L9: {
                        gb.a(false, -1, param0 ^ -127);
                        if (ob.field_l > 0) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          break L9;
                        } else {
                          stackOut_21_0 = 9;
                          stackIn_23_0 = stackOut_21_0;
                          break L9;
                        }
                      }
                      fb.field_c = stackIn_23_0;
                      continue L5;
                    }
                  }
                }
              }
              this.e(-257);
              if (((ie) this).field_f.field_f != -1) {
                this.a(false, 2647, ((ie) this).field_f.field_f);
                continue L5;
              } else {
                continue L5;
              }
            }
          }
        }
    }

    private final int b(int param0, int param1) {
        if (2 == ((ie) this).field_d) {
            if (!il.b(507)) {
                if (!(3 <= param1)) {
                    return ah.field_i[((ie) this).field_d];
                }
                return ah.field_i[((ie) this).field_d] + si.field_F[((ie) this).field_d];
            }
        }
        int var3 = 121 % ((45 - param0) / 60);
        return ah.field_i[((ie) this).field_d] - -(si.field_F[((ie) this).field_d] * param1);
    }

    private final boolean b(byte param0, int param1) {
        return true;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        if (-3 == ((ie) this).field_d) {
            if (!(il.b(507))) {
                if (!(-4 <= param0)) {
                    return 200 * param0 + jb.field_a[((ie) this).field_d];
                }
                return 200 + jb.field_a[((ie) this).field_d];
            }
        }
        if (!(gg.field_f[((ie) this).field_d])) {
            var3 = ab.field_s[((ie) this).field_d][param0];
            var4 = te.field_I[var3];
            if (var4 == null) {
                return jb.field_a[((ie) this).field_d];
            }
            var5 = 20 + ad.field_b.b(var4);
            return jb.field_a[((ie) this).field_d] + (bb.field_P[((ie) this).field_d] - var5) >> 1;
        }
        return jb.field_a[((ie) this).field_d];
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        hd stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        hd stackIn_5_2 = null;
        int stackIn_5_3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        hd stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        hd stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        hd stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        hd stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_10_0 = 0;
        hd stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        hd stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        hd stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        hd stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        hd stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        hd stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_16_0 = 0;
        hd stackIn_16_1 = null;
        int stackIn_17_0 = 0;
        hd stackIn_17_1 = null;
        int stackIn_18_0 = 0;
        hd stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_19_0 = 0;
        hd stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_20_0 = 0;
        hd stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackIn_21_0 = 0;
        hd stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        hd stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        hd stackOut_5_2 = null;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        hd stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        hd stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        hd stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        hd stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_9_0 = 0;
        hd stackOut_9_1 = null;
        int stackOut_11_0 = 0;
        hd stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_10_0 = 0;
        hd stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_12_0 = 0;
        hd stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_14_0 = 0;
        hd stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_13_0 = 0;
        hd stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_15_0 = 0;
        hd stackOut_15_1 = null;
        int stackOut_17_0 = 0;
        hd stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_16_0 = 0;
        hd stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_18_0 = 0;
        hd stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        int stackOut_20_0 = 0;
        hd stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_19_0 = 0;
        hd stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        if (param1 == 3367) {
          L0: {
            if (((ie) this).field_d != 8) {
              break L0;
            } else {
              L1: {
                var3 = 4 + ad.field_b.field_s + ad.field_b.field_m;
                var4 = var3 * ad.field_b.b(ba.field_r, 600);
                stackOut_3_0 = var4;
                stackOut_3_1 = var3;
                stackOut_3_2 = ad.field_b;
                stackOut_3_3 = 71;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                if (lk.field_e == 0) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = (hd) (Object) stackIn_5_2;
                  stackOut_5_3 = stackIn_5_3;
                  stackOut_5_4 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  stackIn_6_4 = stackOut_5_4;
                  break L1;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = (hd) (Object) stackIn_4_2;
                  stackOut_4_3 = stackIn_4_3;
                  stackOut_4_4 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  stackIn_6_4 = stackOut_4_4;
                  break L1;
                }
              }
              L2: {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = (hd) (Object) stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                if (jl.field_d == 0) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = (hd) (Object) stackIn_8_2;
                  stackOut_8_3 = stackIn_8_3;
                  stackOut_8_4 = stackIn_8_4;
                  stackOut_8_5 = stackIn_8_5;
                  stackOut_8_6 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  stackIn_9_4 = stackOut_8_4;
                  stackIn_9_5 = stackOut_8_5;
                  stackIn_9_6 = stackOut_8_6;
                  break L2;
                } else {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = (hd) (Object) stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = stackIn_7_4;
                  stackOut_7_5 = stackIn_7_5;
                  stackOut_7_6 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
                  stackIn_9_5 = stackOut_7_5;
                  stackIn_9_6 = stackOut_7_6;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_9_0 + stackIn_9_1 * ((hd) (Object) stackIn_9_2).b(ai.a((byte) stackIn_9_3, stackIn_9_4 != 0, stackIn_9_5 != 0, stackIn_9_6 != 0), 600);
                ah.field_i[((ie) this).field_d] = var4 + 2;
                var4 = var4 + (var3 + 41);
                stackOut_9_0 = var4;
                stackOut_9_1 = ad.field_b;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (jl.field_d == 0) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = (hd) (Object) stackIn_11_1;
                  stackOut_11_2 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = (hd) (Object) stackIn_10_1;
                  stackOut_10_2 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = stackIn_12_0;
                stackOut_12_1 = (hd) (Object) stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                if (lk.field_e == 0) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = (hd) (Object) stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  break L4;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = (hd) (Object) stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  break L4;
                }
              }
              L5: {
                var4 = stackIn_15_0 + ((hd) (Object) stackIn_15_1).b(qh.a(stackIn_15_2 != 0, stackIn_15_3 != 0, false, (byte) 8), 600) * var3;
                si.field_F[((ie) this).field_d] = var4 - -2 + -ah.field_i[((ie) this).field_d];
                var4 += 41;
                stackOut_15_0 = var4;
                stackOut_15_1 = ad.field_b;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (lk.field_e == 0) {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = (hd) (Object) stackIn_17_1;
                  stackOut_17_2 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = stackIn_16_0;
                  stackOut_16_1 = (hd) (Object) stackIn_16_1;
                  stackOut_16_2 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              L6: {
                stackOut_18_0 = stackIn_18_0;
                stackOut_18_1 = (hd) (Object) stackIn_18_1;
                stackOut_18_2 = stackIn_18_2;
                stackOut_18_3 = param1 + -3451;
                stackOut_18_4 = 0;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_20_2 = stackOut_18_2;
                stackIn_20_3 = stackOut_18_3;
                stackIn_20_4 = stackOut_18_4;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                stackIn_19_3 = stackOut_18_3;
                stackIn_19_4 = stackOut_18_4;
                if (jl.field_d == 0) {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = (hd) (Object) stackIn_20_1;
                  stackOut_20_2 = stackIn_20_2;
                  stackOut_20_3 = stackIn_20_3;
                  stackOut_20_4 = stackIn_20_4;
                  stackOut_20_5 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  stackIn_21_3 = stackOut_20_3;
                  stackIn_21_4 = stackOut_20_4;
                  stackIn_21_5 = stackOut_20_5;
                  break L6;
                } else {
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = (hd) (Object) stackIn_19_1;
                  stackOut_19_2 = stackIn_19_2;
                  stackOut_19_3 = stackIn_19_3;
                  stackOut_19_4 = stackIn_19_4;
                  stackOut_19_5 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  stackIn_21_3 = stackOut_19_3;
                  stackIn_21_4 = stackOut_19_4;
                  stackIn_21_5 = stackOut_19_5;
                  break L6;
                }
              }
              var4 = stackIn_21_0 + ((hd) (Object) stackIn_21_1).b(jl.a(stackIn_21_2 != 0, stackIn_21_3, stackIn_21_4 != 0, stackIn_21_5 != 0), 600) * var3;
              dd.field_b = 480 - var4 >> 1;
              ah.field_i[((ie) this).field_d] = ah.field_i[((ie) this).field_d] + dd.field_b;
              break L0;
            }
          }
          L7: {
            if (((ie) this).field_d == 9) {
              df.a(0, true);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var3 = 0;
            if (9 == ((ie) this).field_d) {
              var3 = -1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (((ie) this).field_d != 0) {
              break L9;
            } else {
              if (((ie) this).field_f.field_f != -1) {
                var3 = ((ie) this).field_f.field_f;
                break L9;
              } else {
                break L9;
              }
            }
          }
          L10: {
            if (((ie) this).field_d != 1) {
              break L10;
            } else {
              if (-1 == ((ie) this).field_f.field_f) {
                break L10;
              } else {
                if (-1 == kd.field_a) {
                  break L10;
                } else {
                  var3 = ((ie) this).field_f.field_f;
                  break L10;
                }
              }
            }
          }
          ((ie) this).field_f.a(param0, var3, this.a(gb.field_j, (byte) 111, ad.field_m), 127);
          ((ie) this).field_e = -1;
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_58_0 = 0;
        hd stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_59_0 = 0;
        hd stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_60_0 = 0;
        hd stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_61_0 = 0;
        hd stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        int stackIn_61_4 = 0;
        int stackIn_62_0 = 0;
        hd stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_62_4 = 0;
        int stackIn_63_0 = 0;
        hd stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        int stackIn_63_5 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        hd stackIn_64_2 = null;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        hd stackIn_65_2 = null;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        hd stackIn_66_2 = null;
        int stackIn_66_3 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        hd stackIn_67_2 = null;
        int stackIn_67_3 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        hd stackIn_68_2 = null;
        int stackIn_68_3 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        hd stackIn_69_2 = null;
        int stackIn_69_3 = 0;
        int stackIn_69_4 = 0;
        int stackIn_70_0 = 0;
        hd stackIn_70_1 = null;
        int stackIn_71_0 = 0;
        hd stackIn_71_1 = null;
        int stackIn_72_0 = 0;
        hd stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int stackIn_73_0 = 0;
        hd stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        int stackIn_73_4 = 0;
        int stackIn_74_0 = 0;
        hd stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        int stackIn_74_4 = 0;
        int stackIn_75_0 = 0;
        hd stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int stackIn_75_4 = 0;
        int stackIn_75_5 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackOut_57_0 = 0;
        hd stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_59_0 = 0;
        hd stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_58_0 = 0;
        hd stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_60_0 = 0;
        hd stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        int stackOut_60_4 = 0;
        int stackOut_62_0 = 0;
        hd stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        int stackOut_61_0 = 0;
        hd stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        int stackOut_61_4 = 0;
        int stackOut_61_5 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        hd stackOut_63_2 = null;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        hd stackOut_65_2 = null;
        int stackOut_65_3 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        hd stackOut_64_2 = null;
        int stackOut_64_3 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        hd stackOut_66_2 = null;
        int stackOut_66_3 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        hd stackOut_68_2 = null;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        hd stackOut_67_2 = null;
        int stackOut_67_3 = 0;
        int stackOut_67_4 = 0;
        int stackOut_69_0 = 0;
        hd stackOut_69_1 = null;
        int stackOut_71_0 = 0;
        hd stackOut_71_1 = null;
        int stackOut_71_2 = 0;
        int stackOut_70_0 = 0;
        hd stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        int stackOut_72_0 = 0;
        hd stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        int stackOut_72_4 = 0;
        int stackOut_74_0 = 0;
        hd stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        int stackOut_74_5 = 0;
        int stackOut_73_0 = 0;
        hd stackOut_73_1 = null;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        int stackOut_73_5 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        var16 = SolKnight.field_L ? 1 : 0;
        if (9 == ((ie) this).field_d) {
          we.a(true);
          return;
        } else {
          L0: {
            L1: {
              if (((ie) this).field_d == 0) {
                break L1;
              } else {
                if (((ie) this).field_d == 1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            ah.a(false, param0 ^ 577);
            je.a(-75, -128, gb.field_j);
            break L0;
          }
          L2: {
            if (pg.field_e) {
              break L2;
            } else {
              if (gb.field_j != -1) {
                ie.a(gb.field_j, ad.field_m, param0 ^ 520);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (400 <= ve.field_b) {
              var2 = (-ve.field_b + 500) * 96 / 100;
              mi.a(320, 240, var2, 16711680, 128);
              mi.a(320, 240, var2 * 62 / 64, 16776960, 128);
              mi.a(320, 240, 60 * var2 / 64, 16776960, 128);
              mi.a(320, 240, var2 * 58 / 64, 16777215, 128);
              mi.a(320, 240, var2 * 57 / 64, 16777215, 128);
              mi.a(320, 240, 56 * var2 / 64, 16777215, 128);
              mi.a(320, 240, 55 * var2 / 64, 16777215, 128);
              mi.a(320, 240, var2 * 54 / 64, 16777215, 128);
              break L3;
            } else {
              if (ve.field_b >= 350) {
                var2 = 96;
                var3 = -(440 * (ve.field_b - 350) / 50) + 440;
                mi.a(320, 240, var2, 16711680, 128);
                mi.a(320, 240, 62 * var2 / 64, 16776960, 128);
                mi.a(320, 240, 60 * var2 / 64, 16776960, 128);
                mi.a(320, 240, 58 * var2 / 64, 16777215, 128);
                mi.a(320, 240, 57 * var2 / 64, 16777215, 128);
                mi.a(320, 240, var2 * 56 / 64, 16777215, 128);
                mi.a(320, 240, 55 * var2 / 64, 16777215, 128);
                mi.a(320, 240, 54 * var2 / 64, 16777215, 128);
                hj.field_n.c(320 - hj.field_n.field_q * 200 / hj.field_n.field_r, -440 + var3, hj.field_n.field_q * 400 / hj.field_n.field_r, 400);
                break L3;
              } else {
                if (ve.field_b >= 250) {
                  hj.field_n.c(320 + -(250 * hj.field_n.field_q / hj.field_n.field_r), -10, 500 * hj.field_n.field_q / hj.field_n.field_r, 500);
                  hj.field_p.d(320 - hj.field_p.field_q / 2, 3 * (480 - hj.field_p.field_r) / 5);
                  if (330 > ve.field_b) {
                    break L3;
                  } else {
                    mi.a(0, 0, 640, 480, 16777215, -3944 + 12 * ve.field_b);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
          }
          if (ve.field_b < 250) {
            L4: {
              qd.field_f[((ie) this).field_d].d(10, 11);
              var2 = 224;
              var3 = 416;
              var4 = ah.field_i[((ie) this).field_d];
              var5 = si.field_F[((ie) this).field_d] * ((ie) this).field_f.field_g + var4;
              if (((ie) this).field_d != 5) {
                break L4;
              } else {
                var2 = 100;
                var4 = 40;
                var3 = -var2 + 640;
                break L4;
              }
            }
            L5: {
              var6 = -var2 + var3 >> 1;
              var7 = -var4 + var5;
              if (!gg.field_f[((ie) this).field_d]) {
                break L5;
              } else {
                var3 = bb.field_P[((ie) this).field_d];
                var2 = jb.field_a[((ie) this).field_d];
                var6 = -var2 + var3 >> 1;
                uj.a((var6 << 1) - -40, var7 + 50, -20 + var2, h.field_d, var4 + -20, 2);
                break L5;
              }
            }
            L6: {
              if (((ie) this).field_d == 0) {
                ug.field_g.a(uc.field_h[kb.field_b], 480, 95, 16776960, 1);
                var8 = 28;
                var9 = 110;
                var10 = 316;
                var11 = h.field_b.field_q * var10 / h.field_b.field_r;
                h.field_b.c(var8, var9, var11, var10);
                h.field_b.c(-var11 + (640 - var8), var9, var11, var10);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (2 == ((ie) this).field_d) {
                this.a(-56);
                break L7;
              } else {
                if (4 != ((ie) this).field_d) {
                  L8: {
                    if (((ie) this).field_d == 3) {
                      break L8;
                    } else {
                      if (7 != ((ie) this).field_d) {
                        if (8 == ((ie) this).field_d) {
                          L9: {
                            var8 = dd.field_b;
                            var9 = 4 + (ad.field_b.field_m - -ad.field_b.field_s);
                            var8 = var8 + var9 * ad.field_b.a(ba.field_r, 20, var8, 600, 1000, 16777215, -1, 1, 0, var9);
                            stackOut_57_0 = var8;
                            stackOut_57_1 = ad.field_b;
                            stackOut_57_2 = 71;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            stackIn_59_2 = stackOut_57_2;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            stackIn_58_2 = stackOut_57_2;
                            if (lk.field_e == 0) {
                              stackOut_59_0 = stackIn_59_0;
                              stackOut_59_1 = (hd) (Object) stackIn_59_1;
                              stackOut_59_2 = stackIn_59_2;
                              stackOut_59_3 = 0;
                              stackIn_60_0 = stackOut_59_0;
                              stackIn_60_1 = stackOut_59_1;
                              stackIn_60_2 = stackOut_59_2;
                              stackIn_60_3 = stackOut_59_3;
                              break L9;
                            } else {
                              stackOut_58_0 = stackIn_58_0;
                              stackOut_58_1 = (hd) (Object) stackIn_58_1;
                              stackOut_58_2 = stackIn_58_2;
                              stackOut_58_3 = 1;
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_60_1 = stackOut_58_1;
                              stackIn_60_2 = stackOut_58_2;
                              stackIn_60_3 = stackOut_58_3;
                              break L9;
                            }
                          }
                          L10: {
                            stackOut_60_0 = stackIn_60_0;
                            stackOut_60_1 = (hd) (Object) stackIn_60_1;
                            stackOut_60_2 = stackIn_60_2;
                            stackOut_60_3 = stackIn_60_3;
                            stackOut_60_4 = 0;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_62_1 = stackOut_60_1;
                            stackIn_62_2 = stackOut_60_2;
                            stackIn_62_3 = stackOut_60_3;
                            stackIn_62_4 = stackOut_60_4;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            stackIn_61_2 = stackOut_60_2;
                            stackIn_61_3 = stackOut_60_3;
                            stackIn_61_4 = stackOut_60_4;
                            if (jl.field_d == 0) {
                              stackOut_62_0 = stackIn_62_0;
                              stackOut_62_1 = (hd) (Object) stackIn_62_1;
                              stackOut_62_2 = stackIn_62_2;
                              stackOut_62_3 = stackIn_62_3;
                              stackOut_62_4 = stackIn_62_4;
                              stackOut_62_5 = 0;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              stackIn_63_2 = stackOut_62_2;
                              stackIn_63_3 = stackOut_62_3;
                              stackIn_63_4 = stackOut_62_4;
                              stackIn_63_5 = stackOut_62_5;
                              break L10;
                            } else {
                              stackOut_61_0 = stackIn_61_0;
                              stackOut_61_1 = (hd) (Object) stackIn_61_1;
                              stackOut_61_2 = stackIn_61_2;
                              stackOut_61_3 = stackIn_61_3;
                              stackOut_61_4 = stackIn_61_4;
                              stackOut_61_5 = 1;
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              stackIn_63_2 = stackOut_61_2;
                              stackIn_63_3 = stackOut_61_3;
                              stackIn_63_4 = stackOut_61_4;
                              stackIn_63_5 = stackOut_61_5;
                              break L10;
                            }
                          }
                          L11: {
                            var8 = stackIn_63_0 + ((hd) (Object) stackIn_63_1).a(ai.a((byte) stackIn_63_2, stackIn_63_3 != 0, stackIn_63_4 != 0, stackIn_63_5 != 0), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9) * var9;
                            var8 = var8 + (41 + var9);
                            stackOut_63_0 = var8;
                            stackOut_63_1 = var9;
                            stackOut_63_2 = ad.field_b;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_65_1 = stackOut_63_1;
                            stackIn_65_2 = stackOut_63_2;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            stackIn_64_2 = stackOut_63_2;
                            if (jl.field_d == 0) {
                              stackOut_65_0 = stackIn_65_0;
                              stackOut_65_1 = stackIn_65_1;
                              stackOut_65_2 = (hd) (Object) stackIn_65_2;
                              stackOut_65_3 = 0;
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              stackIn_66_2 = stackOut_65_2;
                              stackIn_66_3 = stackOut_65_3;
                              break L11;
                            } else {
                              stackOut_64_0 = stackIn_64_0;
                              stackOut_64_1 = stackIn_64_1;
                              stackOut_64_2 = (hd) (Object) stackIn_64_2;
                              stackOut_64_3 = 1;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1;
                              stackIn_66_2 = stackOut_64_2;
                              stackIn_66_3 = stackOut_64_3;
                              break L11;
                            }
                          }
                          L12: {
                            stackOut_66_0 = stackIn_66_0;
                            stackOut_66_1 = stackIn_66_1;
                            stackOut_66_2 = (hd) (Object) stackIn_66_2;
                            stackOut_66_3 = stackIn_66_3;
                            stackIn_68_0 = stackOut_66_0;
                            stackIn_68_1 = stackOut_66_1;
                            stackIn_68_2 = stackOut_66_2;
                            stackIn_68_3 = stackOut_66_3;
                            stackIn_67_0 = stackOut_66_0;
                            stackIn_67_1 = stackOut_66_1;
                            stackIn_67_2 = stackOut_66_2;
                            stackIn_67_3 = stackOut_66_3;
                            if (lk.field_e == 0) {
                              stackOut_68_0 = stackIn_68_0;
                              stackOut_68_1 = stackIn_68_1;
                              stackOut_68_2 = (hd) (Object) stackIn_68_2;
                              stackOut_68_3 = stackIn_68_3;
                              stackOut_68_4 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              stackIn_69_1 = stackOut_68_1;
                              stackIn_69_2 = stackOut_68_2;
                              stackIn_69_3 = stackOut_68_3;
                              stackIn_69_4 = stackOut_68_4;
                              break L12;
                            } else {
                              stackOut_67_0 = stackIn_67_0;
                              stackOut_67_1 = stackIn_67_1;
                              stackOut_67_2 = (hd) (Object) stackIn_67_2;
                              stackOut_67_3 = stackIn_67_3;
                              stackOut_67_4 = 1;
                              stackIn_69_0 = stackOut_67_0;
                              stackIn_69_1 = stackOut_67_1;
                              stackIn_69_2 = stackOut_67_2;
                              stackIn_69_3 = stackOut_67_3;
                              stackIn_69_4 = stackOut_67_4;
                              break L12;
                            }
                          }
                          L13: {
                            var8 = stackIn_69_0 + stackIn_69_1 * ((hd) (Object) stackIn_69_2).a(qh.a(stackIn_69_3 != 0, stackIn_69_4 != 0, false, (byte) 8), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9);
                            var8 += 41;
                            stackOut_69_0 = var8;
                            stackOut_69_1 = ad.field_b;
                            stackIn_71_0 = stackOut_69_0;
                            stackIn_71_1 = stackOut_69_1;
                            stackIn_70_0 = stackOut_69_0;
                            stackIn_70_1 = stackOut_69_1;
                            if (0 == lk.field_e) {
                              stackOut_71_0 = stackIn_71_0;
                              stackOut_71_1 = (hd) (Object) stackIn_71_1;
                              stackOut_71_2 = 0;
                              stackIn_72_0 = stackOut_71_0;
                              stackIn_72_1 = stackOut_71_1;
                              stackIn_72_2 = stackOut_71_2;
                              break L13;
                            } else {
                              stackOut_70_0 = stackIn_70_0;
                              stackOut_70_1 = (hd) (Object) stackIn_70_1;
                              stackOut_70_2 = 1;
                              stackIn_72_0 = stackOut_70_0;
                              stackIn_72_1 = stackOut_70_1;
                              stackIn_72_2 = stackOut_70_2;
                              break L13;
                            }
                          }
                          L14: {
                            stackOut_72_0 = stackIn_72_0;
                            stackOut_72_1 = (hd) (Object) stackIn_72_1;
                            stackOut_72_2 = stackIn_72_2;
                            stackOut_72_3 = -116;
                            stackOut_72_4 = 0;
                            stackIn_74_0 = stackOut_72_0;
                            stackIn_74_1 = stackOut_72_1;
                            stackIn_74_2 = stackOut_72_2;
                            stackIn_74_3 = stackOut_72_3;
                            stackIn_74_4 = stackOut_72_4;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            stackIn_73_2 = stackOut_72_2;
                            stackIn_73_3 = stackOut_72_3;
                            stackIn_73_4 = stackOut_72_4;
                            if (jl.field_d == 0) {
                              stackOut_74_0 = stackIn_74_0;
                              stackOut_74_1 = (hd) (Object) stackIn_74_1;
                              stackOut_74_2 = stackIn_74_2;
                              stackOut_74_3 = stackIn_74_3;
                              stackOut_74_4 = stackIn_74_4;
                              stackOut_74_5 = 0;
                              stackIn_75_0 = stackOut_74_0;
                              stackIn_75_1 = stackOut_74_1;
                              stackIn_75_2 = stackOut_74_2;
                              stackIn_75_3 = stackOut_74_3;
                              stackIn_75_4 = stackOut_74_4;
                              stackIn_75_5 = stackOut_74_5;
                              break L14;
                            } else {
                              stackOut_73_0 = stackIn_73_0;
                              stackOut_73_1 = (hd) (Object) stackIn_73_1;
                              stackOut_73_2 = stackIn_73_2;
                              stackOut_73_3 = stackIn_73_3;
                              stackOut_73_4 = stackIn_73_4;
                              stackOut_73_5 = 1;
                              stackIn_75_0 = stackOut_73_0;
                              stackIn_75_1 = stackOut_73_1;
                              stackIn_75_2 = stackOut_73_2;
                              stackIn_75_3 = stackOut_73_3;
                              stackIn_75_4 = stackOut_73_4;
                              stackIn_75_5 = stackOut_73_5;
                              break L14;
                            }
                          }
                          var8 = stackIn_75_0 + ((hd) (Object) stackIn_75_1).a(jl.a(stackIn_75_2 != 0, stackIn_75_3, stackIn_75_4 != 0, stackIn_75_5 != 0), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9) * var9;
                          break L7;
                        } else {
                          if (((ie) this).field_d == 9) {
                            int discarded$8 = ad.field_b.a(ua.field_E, 30, 80, 580, 300, 0, -1, 0, 0, 0);
                            break L7;
                          } else {
                            if (((ie) this).field_d == 5) {
                              L15: {
                                var8 = kb.field_b;
                                if (kd.field_a != ((ie) this).field_d) {
                                  break L15;
                                } else {
                                  if (((ie) this).field_d == ri.field_f) {
                                    break L15;
                                  } else {
                                    var8--;
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                var9 = ad.field_b.b(rf.field_N[var8], 564);
                                var10 = 220 - -(var9 * 28);
                                var11 = 118;
                                var12 = -10 + var11 >> 1;
                                var13 = -37 + (480 + (-var10 + var12)) >> 1;
                                fi.a(var11, true, 1, 230, 638, var10, var13);
                                int discarded$9 = ad.field_b.a(bb.a(he.field_e, new String[1], -63), 222, -32 + var13, 194, 82, 16776960, 16777215, 1, 1, ad.field_b.field_F + ad.field_b.field_s);
                                ad.field_b.a(Integer.toString(oa.field_m * 100), 112, var13 + 52, 16777215, -1);
                                int discarded$10 = ug.field_g.a(qb.field_X, 112, var13 + 57, 0, 0, 16777215, -1, 1, 0, ug.field_g.field_s + ug.field_g.field_F);
                                ad.field_b.a(Integer.toString(oa.field_m * 100 + lk.field_e), 528, 52 + var13, 16777215, -1);
                                int discarded$11 = ug.field_g.a(dc.field_m, 528, -103 + (160 - -var13), 0, 0, 16777215, -1, 1, 0, ug.field_g.field_s + ug.field_g.field_F);
                                ad.field_b.a(gd.field_b, 320, 229 - -var13 - 103, 16776960, -1);
                                var14 = var8 - -1 << 3;
                                if (var8 == 0) {
                                  var14 = 16;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              L17: {
                                if (var8 == 1) {
                                  var14 = 8;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              td.field_e[var14 - -hg.field_y].d(83, 248 + var13 + -103);
                              td.field_e[hg.field_y + var14].d(526, var13 + 145);
                              ad.field_b.a(mf.field_y[var8], 320, -103 + (var13 + 277), 16727871, -1);
                              int discarded$12 = ad.field_b.a(rf.field_N[var8], 38, var13 + 193, 564, 480, 16777215, -1, 1, 0, 28);
                              ah.field_i[((ie) this).field_d] = var13 - -var10;
                              break L7;
                            } else {
                              if (6 != ((ie) this).field_d) {
                                break L7;
                              } else {
                                L18: {
                                  var8 = 220;
                                  var9 = 118;
                                  var10 = var9 + -10 >> 1;
                                  var11 = -37 + (-var8 + 480) - -var10 >> 1;
                                  fi.a(var9, true, 1, 230, 638, var8, var11);
                                  ad.field_b.a(Integer.toString(100 * oa.field_m), 112, -103 + (var11 + 155), 16777215, -1);
                                  int discarded$13 = ug.field_g.a(qb.field_X, 112, 57 - -var11, 0, 0, 16777215, -1, 1, 0, ug.field_g.field_F - -ug.field_g.field_s);
                                  if (ob.field_l > 0) {
                                    var15 = 5000;
                                    var13_ref_String = w.field_d;
                                    var12_ref_String = kh.field_e;
                                    var14_ref_String = bb.a(jj.field_I, new String[1], -63);
                                    break L18;
                                  } else {
                                    var12_ref_String = bb.a(he.field_e, new String[1], -63);
                                    var15 = oa.field_m * 100 + lk.field_e;
                                    var13_ref_String = ud.field_j;
                                    var14_ref_String = ai.field_d;
                                    break L18;
                                  }
                                }
                                int discarded$14 = ad.field_b.a(var12_ref_String, 222, -103 + (71 - -var11), 194, 82, 16776960, 16777215, 1, 1, ad.field_b.field_s + ad.field_b.field_F);
                                ad.field_b.a(Integer.toString(var15), 528, var11 + 52, 16777215, -1);
                                int discarded$15 = ug.field_g.a(var13_ref_String, 528, -103 + (160 - -var11), 0, 0, 16777215, -1, 1, 0, ug.field_g.field_F + ug.field_g.field_s);
                                ad.field_b.a(var14_ref_String, 320, var11 + 126, 16776960, -1);
                                h.field_b.c(45, var11 + 97, 100 * h.field_b.field_q / h.field_b.field_r, 100);
                                h.field_b.c(-(100 * h.field_b.field_q / h.field_b.field_r) + 595, -103 + (var11 + 200), h.field_b.field_q * 100 / h.field_b.field_r, 100);
                                ad.field_b.a(ti.field_a, 320, 277 - (-var11 + 103), 16727871, -1);
                                ah.field_i[((ie) this).field_d] = var8 + var11;
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L19: {
                    fi.a(118, true, 1, 398, 638, 277, 129);
                    stackOut_34_0 = this;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (7 != ((ie) this).field_d) {
                      stackOut_36_0 = this;
                      stackOut_36_1 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L19;
                    } else {
                      stackOut_35_0 = this;
                      stackOut_35_1 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L19;
                    }
                  }
                  this.a(stackIn_37_1 != 0, param0 + -590);
                  break L7;
                } else {
                  this.b((byte) 101);
                  break L7;
                }
              }
            }
            if (param0 == 582) {
              var8 = 0;
              L20: while (true) {
                if (var8 >= ((ie) this).field_f.field_g) {
                  return;
                } else {
                  L21: {
                    if (!this.b((byte) -4, var8)) {
                      break L21;
                    } else {
                      L22: {
                        stackOut_82_0 = this;
                        stackOut_82_1 = 0;
                        stackIn_84_0 = stackOut_82_0;
                        stackIn_84_1 = stackOut_82_1;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        if (~var8 != ~((ie) this).field_f.field_f) {
                          stackOut_84_0 = this;
                          stackOut_84_1 = stackIn_84_1;
                          stackOut_84_2 = 0;
                          stackIn_85_0 = stackOut_84_0;
                          stackIn_85_1 = stackOut_84_1;
                          stackIn_85_2 = stackOut_84_2;
                          break L22;
                        } else {
                          stackOut_83_0 = this;
                          stackOut_83_1 = stackIn_83_1;
                          stackOut_83_2 = 1;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_85_1 = stackOut_83_1;
                          stackIn_85_2 = stackOut_83_2;
                          break L22;
                        }
                      }
                      this.a(stackIn_85_1 != 0, stackIn_85_2 != 0, var8);
                      break L21;
                    }
                  }
                  var8++;
                  continue L20;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void b(byte param0) {
        int var2 = ug.field_g.field_F + ug.field_g.field_s;
        int var3 = ug.field_g.b(c.field_E, 600);
        int var4 = (4 + var3) * var2 + 60;
        int var5 = -var4 + 574 >> 1;
        ah.field_i[((ie) this).field_d] = -30 + var5 + var4;
        uj.a(638, var4, 1, h.field_d, var5 + -30, 2);
        var5 = var5 + ug.field_g.a(c.field_E, 20, var5, 600, 640, 16777215, -1, 1, 0, var2) * var2;
        var5 = var5 + (var2 << 1);
        ug.field_g.a(ii.field_i, 320, var5, 16776960, -1);
        var5 = var5 + var2;
        ug.field_g.a(pg.field_c, 320, var5, 16776960, -1);
        var5 = var5 + var2;
        ug.field_g.a(h.field_c, 320, var5, 16776960, -1);
    }

    private final void a(int param0) {
        String var2 = null;
        hd var3 = null;
        sd var4_ref_sd = null;
        int var4 = 0;
        String[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int[] var17 = null;
        String stackIn_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        L0: {
          var13 = SolKnight.field_L ? 1 : 0;
          var3 = ug.field_g;
          uj.a(638, 313, 1, h.field_d, 86, 2);
          if (!il.b(507)) {
            L1: {
              if (kh.field_c != null) {
                break L1;
              } else {
                kh.field_c = mb.a(15, 1, (byte) 123, 10, 3);
                break L1;
              }
            }
            var4_ref_sd = kh.field_c;
            if (!var4_ref_sd.field_h) {
              var2 = qf.field_g;
              break L0;
            } else {
              if (null == var4_ref_sd.field_n) {
                var2 = lk.field_a;
                break L0;
              } else {
                var2 = og.field_k;
                var5 = var4_ref_sd.field_n[rg.field_c];
                var17 = var4_ref_sd.field_i[rg.field_c];
                var7 = ti.a(bi.field_b, rg.field_c, var4_ref_sd, 0);
                var8 = var3.field_F + 127;
                var9 = 0;
                L2: while (true) {
                  if (10 <= var9) {
                    L3: {
                      if (bi.field_b == null) {
                        break L3;
                      } else {
                        if (var7 == -1) {
                          var3.c(ne.field_g, 73, var8, 16776960, -1);
                          var3.b(bb.a("<%0>%", new String[1], -63), 380, var8, 16776960, -1);
                          var3.b(Integer.toString(bi.field_b.field_r[0] / 101), 582, var8, 16776960, -1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var2.length() == 0) {
                      var8 = 106 - -var3.field_F;
                      var3.b(ne.field_a, 380, var8, 1134591, -1);
                      var3.b(mf.field_K, 582, var8, 1134591, -1);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    if (var5[var9] != null) {
                      L4: {
                        var10 = 16777215;
                        var11 = var17[var9];
                        var12 = var5[var9];
                        if (var7 != var9) {
                          break L4;
                        } else {
                          var10 = 16776960;
                          break L4;
                        }
                      }
                      var3.b(var9 - -1 + ". ", 73, var8, var10, -1);
                      var3.c(var12, 73, var8, var10, -1);
                      var3.b(bb.a("<%0>%", new String[1], -63), 380, var8, var10, -1);
                      var2 = "";
                      var3.b(Integer.toString(var11 / 101), 582, var8, var10, -1);
                      var8 += 21;
                      var9++;
                      continue L2;
                    } else {
                      var8 += 21;
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            var2 = og.field_k;
            break L0;
          }
        }
        L5: {
          var4 = 105 + (106 + var3.field_F);
          var3.a(var2, 327, var4, 1134591, -1);
          if (il.b(507)) {
            stackOut_24_0 = mf.field_n;
            stackIn_25_0 = stackOut_24_0;
            break L5;
          } else {
            stackOut_23_0 = ad.field_o;
            stackIn_25_0 = stackOut_23_0;
            break L5;
          }
        }
        var2 = stackIn_25_0;
        var3.a(var2, 320, 106 + var3.field_F - -252, 1134591, -1);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        L0: {
          var15 = SolKnight.field_L ? 1 : 0;
          var3 = 144;
          if (param1 == -8) {
            break L0;
          } else {
            ((ie) this).field_d = -81;
            break L0;
          }
        }
        L1: {
          var4 = 103;
          if (param0) {
            stackOut_4_0 = jl.field_d;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = ah.field_f;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var5 = stackIn_5_0;
        var6 = 0;
        var7 = -1;
        var8 = 0;
        L2: while (true) {
          if (var8 >= hb.field_m.length) {
            L3: {
              if (-1 > ((ie) this).field_e) {
                break L3;
              } else {
                var7 = ((ie) this).field_e;
                break L3;
              }
            }
            L4: {
              if (var7 == -1) {
                if (il.b(param1 ^ -509)) {
                  int discarded$3 = ad.field_b.a(kg.field_b, 25, -ad.field_b.field_F + 241, 590, 1000, 16776960, -1, 1, 0, ad.field_b.field_s + ad.field_b.field_F);
                  int discarded$4 = ad.field_b.a(mf.field_n, 25, 2 * ad.field_b.field_F + 241, 590, 1000, 16776960, -1, 1, 0, ad.field_b.field_s + ad.field_b.field_F);
                  break L4;
                } else {
                  ad.field_b.a(kg.field_b, 320, 296, 16776960, -1);
                  break L4;
                }
              } else {
                L5: {
                  var8 = ad.field_b.field_s + ad.field_b.field_m;
                  ad.field_b.a(hb.field_m[var7], 320, 226, 16776960, -1);
                  var9 = var8;
                  var10 = 226 + ad.field_b.field_F - -ad.field_b.field_s;
                  if ((var5 & 1 << var7) == 0) {
                    stackOut_41_0 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    break L5;
                  } else {
                    stackOut_40_0 = 1;
                    stackIn_42_0 = stackOut_40_0;
                    break L5;
                  }
                }
                L6: {
                  var11 = stackIn_42_0;
                  if (var11 == 0) {
                    ad.field_b.a(lf.field_b, 320, var10, 16727871, -1);
                    break L6;
                  } else {
                    ad.field_b.a(hc.field_f, 320, var10, 16777215, -1);
                    break L6;
                  }
                }
                L7: {
                  if (var11 == 0) {
                    if (ob.field_l <= 0) {
                      if ((1 << var7 & 28032) == 0) {
                        jc.field_b.d(36, 226);
                        break L7;
                      } else {
                        nb.field_a.d(36, 226);
                        break L7;
                      }
                    } else {
                      jc.field_b.d(36, 226);
                      break L7;
                    }
                  } else {
                    ii.field_f[var7].d(36, 226);
                    break L7;
                  }
                }
                var10 = var10 + (ad.field_b.field_F + ad.field_b.field_s);
                var12 = new String[16];
                var13 = ad.field_b.a(kk.field_a[var7], new int[1], var12);
                var14 = 0;
                L8: while (true) {
                  if (var13 <= var14) {
                    var10 += 5;
                    ad.field_b.c(ff.field_d + 100 * fc.field_n[var7], 190, var10, 16777215, -1);
                    var10 = var10 + var9;
                    var3 = 190;
                    ad.field_b.c(cf.field_b, var3, var10, 16777215, -1);
                    var3 = var3 + ad.field_b.b(cf.field_b);
                    var14 = 0;
                    L9: while (true) {
                      if (var14 >= fc.field_n[var7]) {
                        break L4;
                      } else {
                        pg.field_a.d(var3, -ad.field_b.field_m + var10);
                        var3 = var3 + pg.field_a.field_p / 3;
                        var14++;
                        continue L9;
                      }
                    }
                  } else {
                    ad.field_b.c(var12[var14], 190, var10, 16777215, -1);
                    var10 = var10 + var9;
                    var14++;
                    continue L8;
                  }
                }
              }
            }
            return;
          } else {
            L10: {
              if ((var5 & 1 << var8) != 0) {
                ii.field_f[var8].e(var3, var4);
                break L10;
              } else {
                if (!param0) {
                  if (ob.field_l >= -1) {
                    if (-1 != (1 << var8 & 28032)) {
                      nb.field_a.e(var3, var4);
                      break L10;
                    } else {
                      jc.field_b.e(var3, var4);
                      break L10;
                    }
                  } else {
                    jc.field_b.e(var3, var4);
                    break L10;
                  }
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
            L11: {
              if (var3 > gb.field_j) {
                break L11;
              } else {
                if (gb.field_j > 32 + var3) {
                  break L11;
                } else {
                  if (var4 > ad.field_m) {
                    break L11;
                  } else {
                    if (ad.field_m <= 32 + var4) {
                      var7 = var8;
                      mi.b(-2 + var3, var4 - 2, 36, 36, 6, 1134591);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (((ie) this).field_a < var3) {
                break L12;
              } else {
                if (var3 + 32 < ((ie) this).field_a) {
                  break L12;
                } else {
                  if (var4 > ((ie) this).field_b) {
                    break L12;
                  } else {
                    if (32 + var4 < ((ie) this).field_b) {
                      break L12;
                    } else {
                      L13: {
                        if (((ie) this).field_e != var8) {
                          ((ie) this).field_e = var8;
                          break L13;
                        } else {
                          ((ie) this).field_e = -1;
                          break L13;
                        }
                      }
                      ((ie) this).field_a = -1;
                      break L12;
                    }
                  }
                }
              }
            }
            L14: {
              if (var8 != ((ie) this).field_e) {
                break L14;
              } else {
                mi.b(var3 + -2, var4 - 2, 36, 36, 6, 16776960);
                break L14;
              }
            }
            int incrementValue$5 = var6;
            var6++;
            if (incrementValue$5 == -9) {
              var4 += 40;
              var3 = 144;
              var3 += 40;
              var8++;
              continue L2;
            } else {
              var3 += 40;
              var8++;
              continue L2;
            }
          }
        }
    }

    ie(int param0) {
        ((ie) this).field_e = -1;
        ((ie) this).field_a = -1;
        ((ie) this).field_d = param0;
        ((ie) this).field_f = new sf(ab.field_s[param0].length);
    }

    final static void b(int param0) {
        Object var2 = null;
        le.a(-88, ug.field_d, (String) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_c = new long[8][256];
        field_g = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_g[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (var15 > 10) {
                return;
              } else {
                var1 = 8 * (-1 + var15);
                field_g[var15] = ke.a(ke.a(tk.a(field_c[6][6 + var1], 65280L), ke.a(ke.a(ke.a(tk.a(1095216660480L, field_c[3][3 + var1]), ke.a(ke.a(tk.a(-72057594037927936L, field_c[0][var1]), tk.a(71776119061217280L, field_c[1][1 + var1])), tk.a(280375465082880L, field_c[2][var1 - -2]))), tk.a(field_c[4][4 + var1], 4278190080L)), tk.a(field_c[5][5 + var1], 16711680L))), tk.a(255L, field_c[7][var1 + 7]));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (256L > var4) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 1;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_c[0][var0] = td.a(td.a(var4 << 8, td.a(var8 << 16, td.a(td.a(td.a(var6 << 40, td.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24))), var12);
            var14 = 1;
            L6: while (true) {
              if (8 <= var14) {
                var0++;
                continue L0;
              } else {
                field_c[var14][var0] = td.a(field_c[var14 - 1][var0] << 56, field_c[-1 + var14][var0] >>> 8);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
