/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
            this.c(11);
        }
        return 37;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = SolKnight.field_L ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (ab.field_s[this.field_d].length <= var4) {
            L1: {
              if (param1 == 111) {
                break L1;
              } else {
                this.a(113);
                break L1;
              }
            }
            return -1;
          } else {
            var5 = this.b(param1 + -225, var4);
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
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_151_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          if (param1 == 2647) {
            break L0;
          } else {
            this.field_b = -116;
            break L0;
          }
        }
        L1: {
          var4 = ab.field_s[this.field_d][param2];
          var5 = var4;
          if (-1 != (var5 ^ -1)) {
            if (-2 != (var5 ^ -1)) {
              if ((var5 ^ -1) != -6) {
                if ((var5 ^ -1) == -17) {
                  if (this.field_f.f(0)) {
                    gb.a(param0, 9, -128);
                    mb.a(true, 14, 256);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (-15 != (var5 ^ -1)) {
                    if ((var5 ^ -1) != -4) {
                      if (6 == var5) {
                        if (!this.field_f.f(0)) {
                          break L1;
                        } else {
                          gb.a(param0, fb.field_c, param1 + -2775);
                          mb.a(true, 14, 256);
                          break L1;
                        }
                      } else {
                        if ((var5 ^ -1) == -3) {
                          if (this.field_f.f(0)) {
                            gb.a(param0, 2, -127);
                            mb.a(true, 14, 256);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          if (17 == var5) {
                            if (this.field_f.f(param1 ^ 2647)) {
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
                                if ((kb.field_b ^ -1) == -5) {
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
                                if (var5 >= nf.field_W.length) {
                                  gb.a(param0, -1, -128);
                                  mb.a(true, 14, 256);
                                  break L1;
                                } else {
                                  nf.field_W[var5] = bk.a(1280, jb.field_g, (byte) -116) + -640;
                                  nf.field_W[var5 + 1] = bk.a(720, jb.field_g, (byte) 83);
                                  var5 += 2;
                                  continue L5;
                                }
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            if ((var5 ^ -1) != -19) {
                              if ((var5 ^ -1) != -13) {
                                if ((var5 ^ -1) == -14) {
                                  L6: {
                                    if (this.field_f.c((byte) 11)) {
                                      gg.a(0, 10);
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (this.field_f.e(12542)) {
                                      gg.a(256, 10);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (!this.field_f.a(param1 ^ 2570)) {
                                      break L8;
                                    } else {
                                      var5 = 64 + (wb.field_a + 9);
                                      var6 = (this.a(param2, -3) + (this.a(param2, (byte) 55) + -var5) >> 1363945569) - -wb.field_a + 8;
                                      var7 = gb.field_j + -var6 << 1957030082;
                                      if ((var7 ^ -1) >= -1) {
                                        gg.a(0, 10);
                                        break L8;
                                      } else {
                                        if ((var7 ^ -1) > -257) {
                                          gg.a(var7, param1 + -2637);
                                          break L8;
                                        } else {
                                          gg.a(256, 10);
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    if (!this.field_f.c(0)) {
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
                                        gg.a(0, param1 + -2637);
                                        break L9;
                                      }
                                    }
                                  }
                                  if (this.field_f.e((byte) -72)) {
                                    if (-225 >= (td.field_l ^ -1)) {
                                      gg.a(256, param1 ^ 2653);
                                      break L1;
                                    } else {
                                      var5 = td.field_l % 32;
                                      gg.a(32 + (td.field_l + -var5), 10);
                                      break L1;
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (4 == var5) {
                                    if (this.field_f.d((byte) -107)) {
                                      if (dj.field_k != null) {
                                        qk.d(14995);
                                        mb.a(true, 14, 256);
                                        break L1;
                                      } else {
                                        var5 = param0 ? 1 : 0;
                                        ta.a(false, 320, w.field_b, 2, ug.field_g.field_F - -ug.field_g.field_s, ug.field_g, 8, ad.field_b.field_F - -ad.field_b.field_s, ad.field_b.field_F, w.field_b, 8, 240, ad.field_b, ug.field_g.field_F, var5 != 0);
                                        mb.a(true, 14, 256);
                                        break L1;
                                      }
                                    } else {
                                      break L1;
                                    }
                                  } else {
                                    if (var5 != 7) {
                                      if (8 != var5) {
                                        if ((var5 ^ -1) == -10) {
                                          if (!this.field_f.d((byte) -17)) {
                                            break L1;
                                          } else {
                                            rg.field_c = 1;
                                            mb.a(true, 14, 256);
                                            break L1;
                                          }
                                        } else {
                                          if (-11 != (var5 ^ -1)) {
                                            if (var5 != 15) {
                                              if (var5 != 19) {
                                                if ((var5 ^ -1) != -12) {
                                                  break L1;
                                                } else {
                                                  if (this.field_f.f(0)) {
                                                    L11: {
                                                      if (dj.field_k != null) {
                                                        qk.d(14995);
                                                        break L11;
                                                      } else {
                                                        break L11;
                                                      }
                                                    }
                                                    he.a(-1, ia.g(-81));
                                                    mb.a(true, 14, 256);
                                                    break L1;
                                                  } else {
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                if (!this.field_f.f(0)) {
                                                  break L1;
                                                } else {
                                                  L12: {
                                                    if (null == dj.field_k) {
                                                      break L12;
                                                    } else {
                                                      qk.d(14995);
                                                      break L12;
                                                    }
                                                  }
                                                  fh.a(25, ia.g(-55));
                                                  mb.a(true, 14, 256);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              if (this.field_f.d((byte) -58)) {
                                                L13: {
                                                  if (-4 == (this.field_d ^ -1)) {
                                                    break L13;
                                                  } else {
                                                    if (2 != this.field_d) {
                                                      if (8 != this.field_d) {
                                                        mb.a(true, 14, 256);
                                                        break L1;
                                                      } else {
                                                        bb.a((byte) -14, 7, 8);
                                                        mb.a(true, 14, 256);
                                                        break L1;
                                                      }
                                                    } else {
                                                      break L13;
                                                    }
                                                  }
                                                }
                                                bb.a((byte) -14, this.field_d, this.field_d);
                                                mb.a(true, 14, 256);
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            if (!this.field_f.d((byte) -42)) {
                                              break L1;
                                            } else {
                                              rg.field_c = 2;
                                              mb.a(true, 14, 256);
                                              break L1;
                                            }
                                          }
                                        }
                                      } else {
                                        if (this.field_f.d((byte) -94)) {
                                          rg.field_c = 0;
                                          mb.a(true, 14, 256);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    } else {
                                      if (this.field_f.d((byte) -49)) {
                                        L14: {
                                          if (!il.b(507)) {
                                            L15: {
                                              if (!il.b(507)) {
                                                ah.b(true);
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                            kh.field_c = null;
                                            if (0 == jl.field_d) {
                                              gb.a(param0, 2, -128);
                                              break L14;
                                            } else {
                                              gb.a(param0, 7, -127);
                                              break L14;
                                            }
                                          } else {
                                            if (-1 != (lk.field_e ^ -1)) {
                                              gb.a(param0, 8, -128);
                                              break L14;
                                            } else {
                                              gb.a(param0, 0, -127);
                                              break L14;
                                            }
                                          }
                                        }
                                        L16: {
                                          if (0 < ob.field_l) {
                                            stackIn_151_0 = 0;
                                            break L16;
                                          } else {
                                            stackIn_151_0 = 9;
                                            break L16;
                                          }
                                        }
                                        fb.field_c = stackIn_151_0;
                                        mb.a(true, 14, 256);
                                        pk.a((byte) -96, 0, true);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L17: {
                                  if (this.field_f.c((byte) 11)) {
                                    ah.a((byte) -88, 0);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (this.field_f.e(12542)) {
                                    ah.a((byte) -52, 256);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                L19: {
                                  if (!this.field_f.a(65)) {
                                    break L19;
                                  } else {
                                    var5 = 64 + (wb.field_a + 9);
                                    var6 = 8 + (-var5 + (this.a(param2, -3) - -this.a(param2, (byte) 55)) >> 771424897) - -wb.field_a;
                                    var7 = -var6 + gb.field_j << 1574934210;
                                    if (0 >= var7) {
                                      ah.a((byte) -86, 0);
                                      break L19;
                                    } else {
                                      if (256 <= var7) {
                                        ah.a((byte) -82, 256);
                                        break L19;
                                      } else {
                                        ah.a((byte) -97, var7);
                                        break L19;
                                      }
                                    }
                                  }
                                }
                                L20: {
                                  if (!this.field_f.c(0)) {
                                    break L20;
                                  } else {
                                    pc.a(121);
                                    break L20;
                                  }
                                }
                                if (!this.field_f.e((byte) -57)) {
                                  break L1;
                                } else {
                                  cb.b((byte) -39);
                                  break L1;
                                }
                              }
                            } else {
                              if (this.field_f.f(0)) {
                                L21: {
                                  f.field_d = 0;
                                  ve.field_b = 0;
                                  kh.field_d = 255;
                                  pg.field_e = true;
                                  uf.field_p = -1;
                                  if (!il.b(param1 ^ 2988)) {
                                    ah.b(true);
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                kh.field_c = null;
                                if (!il.b(507)) {
                                  if (jl.field_d != 0) {
                                    gb.a(param0, 7, -127);
                                    mb.a(true, 14, 256);
                                    break L1;
                                  } else {
                                    gb.a(param0, 2, -127);
                                    mb.a(true, 14, 256);
                                    break L1;
                                  }
                                } else {
                                  gb.a(param0, 8, -128);
                                  break L1;
                                }
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (this.field_f.f(0)) {
                        gb.a(param0, 4, param1 + -2774);
                        fb.field_c = this.field_d;
                        mb.a(true, 14, 256);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    if (!this.field_f.f(param1 + -2647)) {
                      break L1;
                    } else {
                      gb.a(param0, 3, -128);
                      fb.field_c = this.field_d;
                      mb.a(true, 14, 256);
                      break L1;
                    }
                  }
                }
              } else {
                if (this.field_f.f(0)) {
                  gb.a(param0, 0, -128);
                  mb.a(true, 14, 256);
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              if (this.field_f.f(0)) {
                L22: {
                  gb.a(param0, -1, -128);
                  if (ob.field_l > 0) {
                    stackIn_46_0 = 0;
                    break L22;
                  } else {
                    stackIn_46_0 = 9;
                    break L22;
                  }
                }
                fb.field_c = stackIn_46_0;
                mb.a(true, 14, 256);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            if (this.field_f.f(0)) {
              L23: {
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
                ic.field_t = ic.field_t - (bi.field_i >>> 829888363) * fa.field_f;
                uf.field_p = 2;
                jg.field_b = 10;
                kb.field_b = 0;
                pg.field_e = false;
                fg.field_a = 0;
                fa.field_f = 0;
                bi.field_h = 0;
                pl.field_a = 0;
                ic.field_t = ic.field_t + lk.field_e;
                ic.field_t = ic.field_t - (lc.field_h >>> 1300961297) * ud.field_k;
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
                gb.a(param0, -1, param1 ^ -2601);
                if (-1 > (ob.field_l ^ -1)) {
                  stackIn_40_0 = 0;
                  break L23;
                } else {
                  stackIn_40_0 = 9;
                  break L23;
                }
              }
              fb.field_c = stackIn_40_0;
              mb.a(true, 14, 256);
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    private final void e(int param0) {
        int var3;
        L0: {
          var3 = SolKnight.field_L ? 1 : 0;
          if (this.field_d != 2) {
            break L0;
          } else {
            if (!il.b(507)) {
              L1: {
                if (-97 == (el.field_n ^ -1)) {
                  if (this.field_f.field_f > 0) {
                    if (3 != this.field_f.field_f) {
                      this.field_f.a((byte) 111, this.field_f.field_f - 1);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_f.a((byte) 111, 2);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (97 == el.field_n) {
                  if (2 > this.field_f.field_f) {
                    this.field_f.a((byte) 111, 1 + this.field_f.field_f);
                    break L2;
                  } else {
                    if (2 == this.field_f.field_f) {
                      this.field_f.a((byte) 111, 0);
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
                if ((el.field_n ^ -1) != -100) {
                  break L3;
                } else {
                  L4: {
                    if ((this.field_f.field_f ^ -1) > -1) {
                      break L4;
                    } else {
                      if (-3 <= (this.field_f.field_f ^ -1)) {
                        this.field_f.a((byte) 111, 3);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_f.a((byte) 111, rg.field_c);
                  break L3;
                }
              }
              L5: {
                if ((el.field_n ^ -1) == -99) {
                  if ((this.field_f.field_f ^ -1) == -4) {
                    this.field_f.a((byte) 111, rg.field_c);
                    break L5;
                  } else {
                    this.field_f.a((byte) 111, 3);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              this.field_f.b((byte) 108);
              return;
            } else {
              break L0;
            }
          }
        }
        L6: {
          if (param0 == -257) {
            break L6;
          } else {
            ie.a(49, -110, -117);
            break L6;
          }
        }
        if (9 == this.field_d) {
          this.field_f.a(0, false);
          return;
        } else {
          this.field_f.a(true);
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int discarded$0 = 0;
        if (2 == this.field_d) {
            if (!(il.b(507))) {
                return 180 + this.a(param0, param1 ^ -54);
            }
        }
        if (!(gg.field_f[this.field_d])) {
            var3 = ab.field_s[this.field_d][param0];
            var4 = te.field_I[var3];
            if (!(var4 != null)) {
                return jb.field_a[this.field_d];
            }
            var5 = ad.field_b.b(var4) + 20;
            return bb.field_P[this.field_d] + (jb.field_a[this.field_d] - -var5) >> -1016921343;
        }
        if (param1 != 55) {
            discarded$0 = this.a((byte) -96, -95);
        }
        return bb.field_P[this.field_d];
    }

    public static void a(byte param0) {
        field_c = (long[][]) null;
        if (param0 != 101) {
            field_c = (long[][]) null;
        }
        field_g = null;
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        hd var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var4 = this.b(123, param2);
        var5 = this.a(param2, -3);
        var6 = ab.field_s[this.field_d][param2];
        var7 = te.field_I[var6];
        if (!param0) {
          L0: {
            if (var7 != null) {
              break L0;
            } else {
              var7 = "ERROR: missing text";
              break L0;
            }
          }
          L1: {
            if (!param1) {
              stackIn_7_0 = 1134591;
              break L1;
            } else {
              stackIn_7_0 = 16777215;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_7_0;
            if (!param1) {
              stackIn_10_0 = 8421504;
              break L2;
            } else {
              stackIn_10_0 = 1134591;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_10_0;
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
            if (!gg.field_f[this.field_d]) {
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
                if ((var6 ^ -1) == -14) {
                  break L6;
                } else {
                  var12.a(var7, var5 + (var10 >> -1382141247), (var13 >> 1542271457) + (var12.field_F + (var4 - -w.field_b[0].field_r)), var8, var9);
                  break L5;
                }
              }
            }
            L7: {
              var14 = 9 + (wb.field_a - -64);
              var15 = var5 - -(-var14 + var10 >> -1992895135);
              var12.c(var7, var15, (var13 >> 403642081) + var4 - (-var12.field_F + -w.field_b[0].field_r), var8, var9);
              var15 = var15 + (wb.field_a - -8);
              if (12 == var6) {
                stackIn_24_0 = wc.field_a;
                break L7;
              } else {
                stackIn_24_0 = td.field_l;
                break L7;
              }
            }
            var16 = stackIn_24_0;
            mi.b(var15 - -1, var4 + (var11 >> -796015167), 65, 4, var9);
            mi.b(var15 - -(var16 >> -849794430), 2 + ((var11 - 20 >> -2055745887) + var4), 3, 20, var9);
            mi.b(var15, -1 + var4 - -(var11 >> 1870319873), 65, 4, var8);
            mi.b(var15 + (var16 >> -1318791902) + -1, 1 + (-20 + var11 >> 969367425) + var4, 3, 20, var8);
            break L5;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 < 20) {
            field_c = (long[][]) null;
        }
        mi.g(param0, param1, 8, 16711680);
        mi.b(param0 - 8, param1, 4, 16711680);
        mi.b(param0 + 8 + -4, param1, 4, 16711680);
        mi.h(param0, -8 + param1, 4, 16711680);
        mi.h(param0, -4 + param1 - -8, 4, 16711680);
    }

    final void c(int param0) {
        int stackIn_23_0 = 0;
        int var2;
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if ((ve.field_b ^ -1) < -241) {
          L0: {
            if (-1 != (hg.field_F ^ -1)) {
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
            if (9 != this.field_d) {
              break L1;
            } else {
              L2: {
                var2 = ke.a(true, true);
                if (-4 != (var2 ^ -1)) {
                  break L2;
                } else {
                  fh.a(62, ia.g(param0 ^ -89));
                  break L2;
                }
              }
              L3: {
                if (-2 != (var2 ^ -1)) {
                  break L3;
                } else {
                  gb.a(false, 0, -128);
                  this.field_f.field_f = 0;
                  break L3;
                }
              }
              if (2 != var2) {
                break L1;
              } else {
                gb.a(true, 0, param0 ^ -128);
                break L1;
              }
            }
          }
          L4: while (true) {
            if (!wk.a((byte) -56)) {
              L5: {
                this.field_f.a(param0 + -125, this.a(gb.field_j, (byte) 111, ad.field_m), this.a(db.field_o, (byte) 111, s.field_gb));
                if (-1 != this.field_f.field_f) {
                  this.a(true, 2647, this.field_f.field_f);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param0 != hg.field_F) {
                  this.field_b = s.field_gb;
                  this.field_a = db.field_o;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                if (13 != el.field_n) {
                  break L7;
                } else {
                  if (5 == this.field_d) {
                    break L7;
                  } else {
                    if (-2 != (this.field_d ^ -1)) {
                      if (8 == this.field_d) {
                        continue L4;
                      } else {
                        gb.a(false, fb.field_c, -127);
                        continue L4;
                      }
                    } else {
                      L8: {
                        gb.a(false, -1, param0 ^ -127);
                        if (-1 > (ob.field_l ^ -1)) {
                          stackIn_23_0 = 0;
                          break L8;
                        } else {
                          stackIn_23_0 = 9;
                          break L8;
                        }
                      }
                      fb.field_c = stackIn_23_0;
                      continue L4;
                    }
                  }
                }
              }
              this.e(-257);
              if ((this.field_f.field_f ^ -1) != 0) {
                this.a(false, 2647, this.field_f.field_f);
                continue L4;
              } else {
                continue L4;
              }
            }
          }
        }
    }

    private final int b(int param0, int param1) {
        if (2 == this.field_d && !il.b(507)) {
            if (!(3 <= param1)) {
                return ah.field_i[this.field_d];
            }
            return ah.field_i[this.field_d] + si.field_F[this.field_d];
        }
        int var3 = 121 % ((45 - param0) / 60);
        return ah.field_i[this.field_d] - -(si.field_F[this.field_d] * param1);
    }

    private final boolean b(byte param0, int param1) {
        if (param0 != -4) {
            this.field_b = -115;
            return true;
        }
        return true;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        if (param1 == (this.field_d ^ -1)) {
            if (!(il.b(param1 + 510))) {
                if (!(-4 >= (param0 ^ -1))) {
                    return 200 * param0 + jb.field_a[this.field_d];
                }
                return 200 + jb.field_a[this.field_d];
            }
        }
        if (!(gg.field_f[this.field_d])) {
            var3 = ab.field_s[this.field_d][param0];
            var4 = te.field_I[var3];
            if (var4 == null) {
                return jb.field_a[this.field_d];
            }
            var5 = 20 + ad.field_b.b(var4);
            return jb.field_a[this.field_d] + (bb.field_P[this.field_d] - var5) >> -885577631;
        }
        return jb.field_a[this.field_d];
    }

    final void b(boolean param0, int param1) {
        int stackIn_5_0;
        int stackIn_5_1;
        hd stackIn_5_2;
        int stackIn_5_3;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        hd stackIn_6_2 = null;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_8_5;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_11_0 = 0;
        hd stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        hd stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_17_0 = 0;
        hd stackIn_17_1 = null;
        int stackIn_18_0 = 0;
        hd stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_3;
        int stackIn_20_4;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        int var3;
        int var4;
        if (param1 == 3367) {
          L0: {
            if (-9 != (this.field_d ^ -1)) {
              break L0;
            } else {
              L1: {
                var3 = 4 + ad.field_b.field_s + ad.field_b.field_m;
                var4 = var3 * ad.field_b.b(ba.field_r, 600);
                stackIn_5_0 = var4;

                stackIn_5_1 = var3;

                stackIn_5_2 = ad.field_b;

                stackIn_5_3 = 71;

                if (lk.field_e == 0) {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = (hd) ((Object) stackIn_5_2);
                  stackIn_6_3 = stackIn_5_3;
                  stackIn_6_4 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = (hd) ((Object) stackIn_5_2);
                  stackIn_6_3 = stackIn_5_3;
                  stackIn_6_4 = 1;
                  break L1;
                }
              }
              L2: {










                stackIn_8_5 = 0;

                if (-1 == (jl.field_d ^ -1)) {


                  stackIn_6_2 = (hd) ((Object) stackIn_6_2);


                  stackIn_9_5 = stackIn_8_5;
                  stackIn_9_6 = 0;
                  break L2;
                } else {


                  stackIn_6_2 = (hd) ((Object) stackIn_6_2);


                  stackIn_9_5 = stackIn_8_5;
                  stackIn_9_6 = 1;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_6_0 + stackIn_6_1 * ((hd) (Object) stackIn_6_2).b(ai.a((byte) stackIn_6_3, stackIn_6_4 != 0, stackIn_9_5 != 0, stackIn_9_6 != 0), 600);
                ah.field_i[this.field_d] = var4 + 2;
                var4 = var4 + (var3 + 41);
                stackIn_11_0 = var4;

                stackIn_11_1 = ad.field_b;

                if (jl.field_d == 0) {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = (hd) ((Object) stackIn_11_1);
                  stackIn_12_2 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = stackIn_11_0;
                  stackIn_12_1 = (hd) ((Object) stackIn_11_1);
                  stackIn_12_2 = 1;
                  break L3;
                }
              }
              L4: {






                if (lk.field_e == 0) {

                  stackIn_12_1 = (hd) ((Object) stackIn_12_1);

                  stackIn_15_3 = 0;
                  break L4;
                } else {

                  stackIn_12_1 = (hd) ((Object) stackIn_12_1);

                  stackIn_15_3 = 1;
                  break L4;
                }
              }
              L5: {
                var4 = stackIn_12_0 + ((hd) (Object) stackIn_12_1).b(qh.a(stackIn_12_2 != 0, stackIn_15_3 != 0, false, (byte) 8), 600) * var3;
                si.field_F[this.field_d] = var4 - -2 + -ah.field_i[this.field_d];
                var4 += 41;
                stackIn_17_0 = var4;

                stackIn_17_1 = ad.field_b;

                if (-1 == (lk.field_e ^ -1)) {
                  stackIn_18_0 = stackIn_17_0;
                  stackIn_18_1 = (hd) ((Object) stackIn_17_1);
                  stackIn_18_2 = 0;
                  break L5;
                } else {
                  stackIn_18_0 = stackIn_17_0;
                  stackIn_18_1 = (hd) ((Object) stackIn_17_1);
                  stackIn_18_2 = 1;
                  break L5;
                }
              }
              L6: {






                stackIn_20_3 = param1 + -3451;

                stackIn_20_4 = 0;

                if (-1 == (jl.field_d ^ -1)) {

                  stackIn_18_1 = (hd) ((Object) stackIn_18_1);

                  stackIn_21_3 = stackIn_20_3;
                  stackIn_21_4 = stackIn_20_4;
                  stackIn_21_5 = 0;
                  break L6;
                } else {

                  stackIn_18_1 = (hd) ((Object) stackIn_18_1);

                  stackIn_21_3 = stackIn_20_3;
                  stackIn_21_4 = stackIn_20_4;
                  stackIn_21_5 = 1;
                  break L6;
                }
              }
              var4 = stackIn_18_0 + ((hd) (Object) stackIn_18_1).b(jl.a(stackIn_18_2 != 0, stackIn_21_3, stackIn_21_4 != 0, stackIn_21_5 != 0), 600) * var3;
              dd.field_b = 480 - var4 >> 1451518337;
              ah.field_i[this.field_d] = ah.field_i[this.field_d] + dd.field_b;
              break L0;
            }
          }
          L7: {
            if (-10 == (this.field_d ^ -1)) {
              df.a(0, true);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var3 = 0;
            if (9 == this.field_d) {
              var3 = -1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (this.field_d != 0) {
              break L9;
            } else {
              if (0 != (this.field_f.field_f ^ -1)) {
                var3 = this.field_f.field_f;
                break L9;
              } else {
                break L9;
              }
            }
          }
          L10: {
            if ((this.field_d ^ -1) != -2) {
              break L10;
            } else {
              if (-1 == this.field_f.field_f) {
                break L10;
              } else {
                if (-1 == kd.field_a) {
                  break L10;
                } else {
                  var3 = this.field_f.field_f;
                  break L10;
                }
              }
            }
          }
          this.field_f.a(param0, var3, this.a(gb.field_j, (byte) 111, ad.field_m), 127);
          this.field_e = -1;
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_59_0 = 0;
        hd stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_60_0 = 0;
        hd stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_62_4;
        int stackIn_63_4 = 0;
        int stackIn_63_5 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        hd stackIn_65_2 = null;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        hd stackIn_66_2 = null;
        int stackIn_66_3 = 0;
        int stackIn_69_4 = 0;
        int stackIn_71_0 = 0;
        hd stackIn_71_1 = null;
        int stackIn_72_0 = 0;
        hd stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int stackIn_74_3;
        int stackIn_74_4;
        int stackIn_75_3;
        int stackIn_75_4;
        int stackIn_75_5;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        String var12_ref_String;
        int var13;
        String var13_ref_String;
        int var14;
        String var14_ref_String;
        int var15;
        int var16;
        var16 = SolKnight.field_L ? 1 : 0;
        if (9 == this.field_d) {
          we.a(true);
          return;
        } else {
          L0: {
            L1: {
              if (this.field_d == 0) {
                break L1;
              } else {
                if ((this.field_d ^ -1) == -2) {
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
              if (-351 >= (ve.field_b ^ -1)) {
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
                if (-251 >= (ve.field_b ^ -1)) {
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
          if (-251 < (ve.field_b ^ -1)) {
            L4: {
              qd.field_f[this.field_d].d(10, 11);
              var2 = 224;
              var3 = 416;
              var4 = ah.field_i[this.field_d];
              var5 = si.field_F[this.field_d] * this.field_f.field_g + var4;
              if (-6 != (this.field_d ^ -1)) {
                break L4;
              } else {
                var2 = 100;
                var4 = 40;
                var3 = -var2 + 640;
                break L4;
              }
            }
            L5: {
              var6 = -var2 + var3 >> -464391071;
              var7 = -var4 + var5;
              if (!gg.field_f[this.field_d]) {
                break L5;
              } else {
                var3 = bb.field_P[this.field_d];
                var2 = jb.field_a[this.field_d];
                var6 = -var2 + var3 >> -2061957855;
                uj.a((var6 << 145668353) - -40, var7 + 50, -20 + var2, h.field_d, var4 + -20, 2);
                break L5;
              }
            }
            L6: {
              if (this.field_d == 0) {
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
              if (2 == this.field_d) {
                this.a(-56);
                break L7;
              } else {
                if (4 != this.field_d) {
                  L8: {
                    if (this.field_d == 3) {
                      break L8;
                    } else {
                      if (7 != this.field_d) {
                        if (8 == this.field_d) {
                          L9: {
                            var8 = dd.field_b;
                            var9 = 4 + (ad.field_b.field_m - -ad.field_b.field_s);
                            var8 = var8 + var9 * ad.field_b.a(ba.field_r, 20, var8, 600, 1000, 16777215, -1, 1, 0, var9);
                            stackIn_59_0 = var8;

                            stackIn_59_1 = ad.field_b;

                            stackIn_59_2 = 71;

                            if (-1 == (lk.field_e ^ -1)) {
                              stackIn_60_0 = stackIn_59_0;
                              stackIn_60_1 = (hd) ((Object) stackIn_59_1);
                              stackIn_60_2 = stackIn_59_2;
                              stackIn_60_3 = 0;
                              break L9;
                            } else {
                              stackIn_60_0 = stackIn_59_0;
                              stackIn_60_1 = (hd) ((Object) stackIn_59_1);
                              stackIn_60_2 = stackIn_59_2;
                              stackIn_60_3 = 1;
                              break L9;
                            }
                          }
                          L10: {








                            stackIn_62_4 = 0;

                            if (jl.field_d == 0) {

                              stackIn_60_1 = (hd) ((Object) stackIn_60_1);


                              stackIn_63_4 = stackIn_62_4;
                              stackIn_63_5 = 0;
                              break L10;
                            } else {

                              stackIn_60_1 = (hd) ((Object) stackIn_60_1);


                              stackIn_63_4 = stackIn_62_4;
                              stackIn_63_5 = 1;
                              break L10;
                            }
                          }
                          L11: {
                            var8 = stackIn_60_0 + ((hd) (Object) stackIn_60_1).a(ai.a((byte) stackIn_60_2, stackIn_60_3 != 0, stackIn_63_4 != 0, stackIn_63_5 != 0), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9) * var9;
                            var8 = var8 + (41 + var9);
                            stackIn_65_0 = var8;

                            stackIn_65_1 = var9;

                            stackIn_65_2 = ad.field_b;

                            if (jl.field_d == 0) {
                              stackIn_66_0 = stackIn_65_0;
                              stackIn_66_1 = stackIn_65_1;
                              stackIn_66_2 = (hd) ((Object) stackIn_65_2);
                              stackIn_66_3 = 0;
                              break L11;
                            } else {
                              stackIn_66_0 = stackIn_65_0;
                              stackIn_66_1 = stackIn_65_1;
                              stackIn_66_2 = (hd) ((Object) stackIn_65_2);
                              stackIn_66_3 = 1;
                              break L11;
                            }
                          }
                          L12: {








                            if (-1 == (lk.field_e ^ -1)) {


                              stackIn_66_2 = (hd) ((Object) stackIn_66_2);

                              stackIn_69_4 = 0;
                              break L12;
                            } else {


                              stackIn_66_2 = (hd) ((Object) stackIn_66_2);

                              stackIn_69_4 = 1;
                              break L12;
                            }
                          }
                          L13: {
                            var8 = stackIn_66_0 + stackIn_66_1 * ((hd) (Object) stackIn_66_2).a(qh.a(stackIn_66_3 != 0, stackIn_69_4 != 0, false, (byte) 8), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9);
                            var8 += 41;
                            stackIn_71_0 = var8;

                            stackIn_71_1 = ad.field_b;

                            if (0 == lk.field_e) {
                              stackIn_72_0 = stackIn_71_0;
                              stackIn_72_1 = (hd) ((Object) stackIn_71_1);
                              stackIn_72_2 = 0;
                              break L13;
                            } else {
                              stackIn_72_0 = stackIn_71_0;
                              stackIn_72_1 = (hd) ((Object) stackIn_71_1);
                              stackIn_72_2 = 1;
                              break L13;
                            }
                          }
                          L14: {






                            stackIn_74_3 = -116;

                            stackIn_74_4 = 0;

                            if (jl.field_d == 0) {

                              stackIn_72_1 = (hd) ((Object) stackIn_72_1);

                              stackIn_75_3 = stackIn_74_3;
                              stackIn_75_4 = stackIn_74_4;
                              stackIn_75_5 = 0;
                              break L14;
                            } else {

                              stackIn_72_1 = (hd) ((Object) stackIn_72_1);

                              stackIn_75_3 = stackIn_74_3;
                              stackIn_75_4 = stackIn_74_4;
                              stackIn_75_5 = 1;
                              break L14;
                            }
                          }
                          var8 = stackIn_72_0 + ((hd) (Object) stackIn_72_1).a(jl.a(stackIn_72_2 != 0, stackIn_75_3, stackIn_75_4 != 0, stackIn_75_5 != 0), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9) * var9;
                          break L7;
                        } else {
                          if ((this.field_d ^ -1) == -10) {
                            ad.field_b.a(ua.field_E, 30, 80, 580, 300, 0, -1, 0, 0, 0);
                            break L7;
                          } else {
                            if (-6 == (this.field_d ^ -1)) {
                              L15: {
                                var8 = kb.field_b;
                                if (kd.field_a != this.field_d) {
                                  break L15;
                                } else {
                                  if (this.field_d == ri.field_f) {
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
                                var12 = -10 + var11 >> 1389877921;
                                var13 = -37 + (480 + (-var10 + var12)) >> 1407118401;
                                fi.a(var11, true, 1, 230, 638, var10, var13);
                                ad.field_b.a(bb.a(he.field_e, new String[]{Integer.toString(1 + var8)}, -63), 222, -32 + var13, 194, 82, 16776960, 16777215, 1, 1, ad.field_b.field_F + ad.field_b.field_s);
                                ad.field_b.a(Integer.toString(oa.field_m * 100), 112, var13 + 52, 16777215, -1);
                                ug.field_g.a(qb.field_X, 112, var13 + 57, 0, 0, 16777215, -1, 1, 0, ug.field_g.field_s + ug.field_g.field_F);
                                ad.field_b.a(Integer.toString(oa.field_m * 100 + lk.field_e), 528, 52 + var13, 16777215, -1);
                                ug.field_g.a(dc.field_m, 528, -103 + (160 - -var13), 0, 0, 16777215, -1, 1, 0, ug.field_g.field_s + ug.field_g.field_F);
                                ad.field_b.a(gd.field_b, 320, 229 - -var13 - 103, 16776960, -1);
                                var14 = var8 - -1 << -1490645981;
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
                              ad.field_b.a(rf.field_N[var8], 38, var13 + 193, 564, 480, 16777215, -1, 1, 0, 28);
                              ah.field_i[this.field_d] = var13 - -var10;
                              break L7;
                            } else {
                              if (6 != this.field_d) {
                                break L7;
                              } else {
                                L18: {
                                  var8 = 220;
                                  var9 = 118;
                                  var10 = var9 + -10 >> -1473433215;
                                  var11 = -37 + (-var8 + 480) - -var10 >> -1226585375;
                                  fi.a(var9, true, 1, 230, 638, var8, var11);
                                  ad.field_b.a(Integer.toString(100 * oa.field_m), 112, -103 + (var11 + 155), 16777215, -1);
                                  ug.field_g.a(qb.field_X, 112, 57 - -var11, 0, 0, 16777215, -1, 1, 0, ug.field_g.field_F - -ug.field_g.field_s);
                                  if ((ob.field_l ^ -1) < -1) {
                                    var15 = 5000;
                                    var13_ref_String = w.field_d;
                                    var12_ref_String = kh.field_e;
                                    var14_ref_String = bb.a(jj.field_I, new String[]{Integer.toString(lk.field_e)}, -63);
                                    break L18;
                                  } else {
                                    var12_ref_String = bb.a(he.field_e, new String[]{Integer.toString(kb.field_b - -1)}, -63);
                                    var15 = oa.field_m * 100 + lk.field_e;
                                    var13_ref_String = ud.field_j;
                                    var14_ref_String = ai.field_d;
                                    break L18;
                                  }
                                }
                                ad.field_b.a(var12_ref_String, 222, -103 + (71 - -var11), 194, 82, 16776960, 16777215, 1, 1, ad.field_b.field_s + ad.field_b.field_F);
                                ad.field_b.a(Integer.toString(var15), 528, var11 + 155 - 103, 16777215, -1);
                                ug.field_g.a(var13_ref_String, 528, -103 + (160 - -var11), 0, 0, 16777215, -1, 1, 0, ug.field_g.field_F + ug.field_g.field_s);
                                ad.field_b.a(var14_ref_String, 320, var11 + 229 - 103, 16776960, -1);
                                h.field_b.c(45, var11 + 200 - 103, 100 * h.field_b.field_q / h.field_b.field_r, 100);
                                h.field_b.c(-(100 * h.field_b.field_q / h.field_b.field_r) + 595, -103 + (var11 + 200), h.field_b.field_q * 100 / h.field_b.field_r, 100);
                                ad.field_b.a(ti.field_a, 320, 277 - (-var11 + 103), 16727871, -1);
                                ah.field_i[this.field_d] = var8 + var11;
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
                    stackIn_36_0 = this;

                    if (7 != this.field_d) {
                      stackIn_37_0 = this;
                      stackIn_37_1 = 0;
                      break L19;
                    } else {
                      stackIn_37_0 = this;
                      stackIn_37_1 = 1;
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
                if (var8 >= this.field_f.field_g) {
                  return;
                } else {
                  if (this.b((byte) -4, var8)) {
                    L21: {
                      stackIn_85_0 = this;

                      stackIn_85_1 = 0;

                      if (var8 != this.field_f.field_f) {
                        stackIn_86_0 = this;
                        stackIn_86_1 = stackIn_85_1;
                        stackIn_86_2 = 0;
                        break L21;
                      } else {
                        stackIn_86_0 = this;
                        stackIn_86_1 = stackIn_85_1;
                        stackIn_86_2 = 1;
                        break L21;
                      }
                    }
                    this.a(stackIn_86_1 != 0, stackIn_86_2 != 0, var8);
                    var8++;
                    continue L20;
                  } else {
                    var8++;
                    continue L20;
                  }
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
        int var5 = -var4 + 574 >> 645161569;
        ah.field_i[this.field_d] = -30 + var5 + var4;
        uj.a(638, var4, 1, h.field_d, var5 + -30, 2);
        if (param0 <= 39) {
            field_c = (long[][]) null;
        }
        var5 = var5 + ug.field_g.a(c.field_E, 20, var5, 600, 640, 16777215, -1, 1, 0, var2) * var2;
        var5 = var5 + (var2 << -1164106655);
        ug.field_g.a(ii.field_i, 320, var5, 16776960, -1);
        var5 = var5 + var2;
        ug.field_g.a(pg.field_c, 320, var5, 16776960, -1);
        var5 = var5 + var2;
        ug.field_g.a(h.field_c, 320, var5, 16776960, -1);
    }

    private final void a(int param0) {
        String stackIn_27_0 = null;
        String var2;
        hd var3;
        sd var4_ref_sd;
        int var4;
        String[] var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        int var13;
        int[] var17;
        L0: {
          var13 = SolKnight.field_L ? 1 : 0;
          if (param0 <= -22) {
            break L0;
          } else {
            this.field_e = -45;
            break L0;
          }
        }
        L1: {
          var3 = ug.field_g;
          uj.a(638, 313, 1, h.field_d, 86, 2);
          if (!il.b(507)) {
            L2: {
              if (kh.field_c != null) {
                break L2;
              } else {
                kh.field_c = mb.a(15, 1, (byte) 123, 10, 3);
                break L2;
              }
            }
            var4_ref_sd = kh.field_c;
            if (!var4_ref_sd.field_h) {
              var2 = qf.field_g;
              break L1;
            } else {
              if (null == var4_ref_sd.field_n) {
                var2 = lk.field_a;
                break L1;
              } else {
                var2 = og.field_k;
                var5 = var4_ref_sd.field_n[rg.field_c];
                var17 = var4_ref_sd.field_i[rg.field_c];
                var7 = ti.a(bi.field_b, rg.field_c, var4_ref_sd, 0);
                var8 = var3.field_F + 127;
                var9 = 0;
                L3: while (true) {
                  if (10 <= var9) {
                    L4: {
                      if (bi.field_b == null) {
                        break L4;
                      } else {
                        if ((var7 ^ -1) == 0) {
                          var3.c(ne.field_g, 73, var8, 16776960, -1);
                          var3.b(bb.a("<%0>%", new String[]{Integer.toString(bi.field_b.field_r[0] % 101)}, -63), 380, var8, 16776960, -1);
                          var3.b(Integer.toString(bi.field_b.field_r[0] / 101), 582, var8, 16776960, -1);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (-1 == (var2.length() ^ -1)) {
                      var8 = 106 - -var3.field_F;
                      var3.b(ne.field_a, 380, var8, 1134591, -1);
                      var3.b(mf.field_K, 582, var8, 1134591, -1);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    if (var5[var9] != null) {
                      L5: {
                        var10 = 16777215;
                        var11 = var17[var9];
                        var12 = var5[var9];
                        if (var7 != var9) {
                          break L5;
                        } else {
                          var10 = 16776960;
                          break L5;
                        }
                      }
                      var3.b(var9 - -1 + ". ", 73, var8, var10, -1);
                      var3.c(var12, 73, var8, var10, -1);
                      var3.b(bb.a("<%0>%", new String[]{Integer.toString(var11 % 101)}, -63), 380, var8, var10, -1);
                      var2 = "";
                      var3.b(Integer.toString(var11 / 101), 582, var8, var10, -1);
                      var8 += 21;
                      var9++;
                      continue L3;
                    } else {
                      var8 += 21;
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var2 = og.field_k;
            break L1;
          }
        }
        L6: {
          var4 = 105 + (106 + var3.field_F);
          var3.a(var2, 327, var4, 1134591, -1);
          if (il.b(507)) {
            stackIn_27_0 = mf.field_n;
            break L6;
          } else {
            stackIn_27_0 = ad.field_o;
            break L6;
          }
        }
        var2 = stackIn_27_0;
        var3.a(var2, 320, 106 + var3.field_F - -252, 1134591, -1);
    }

    private final void a(boolean param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_42_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String[] var12;
        int var13;
        int var14;
        int var15;
        L0: {
          var15 = SolKnight.field_L ? 1 : 0;
          var3 = 144;
          if (param1 == -8) {
            break L0;
          } else {
            this.field_d = -81;
            break L0;
          }
        }
        L1: {
          var4 = 103;
          if (param0) {
            stackIn_5_0 = jl.field_d;
            break L1;
          } else {
            stackIn_5_0 = ah.field_f;
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
              if (-1 < (this.field_e ^ -1)) {
                break L3;
              } else {
                var7 = this.field_e;
                break L3;
              }
            }
            L4: {
              if (0 == (var7 ^ -1)) {
                if (il.b(param1 ^ -509)) {
                  ad.field_b.a(kg.field_b, 25, -ad.field_b.field_F + 241, 590, 1000, 16776960, -1, 1, 0, ad.field_b.field_s + ad.field_b.field_F);
                  ad.field_b.a(mf.field_n, 25, 2 * ad.field_b.field_F + 241, 590, 1000, 16776960, -1, 1, 0, ad.field_b.field_s + ad.field_b.field_F);
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
                    stackIn_42_0 = 0;
                    break L5;
                  } else {
                    stackIn_42_0 = 1;
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
                      if (-1 == (1 << var7 & 28032 ^ -1)) {
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
                var13 = ad.field_b.a(kk.field_a[var7], new int[]{410}, var12);
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
              if (-1 != (var5 & 1 << var8 ^ -1)) {
                ii.field_f[var8].e(var3, var4);
                break L10;
              } else {
                if (!param0) {
                  if ((ob.field_l ^ -1) >= -1) {
                    if (-1 != (1 << var8 & 28032 ^ -1)) {
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
              if (this.field_a < var3) {
                break L12;
              } else {
                if (var3 + 32 < this.field_a) {
                  break L12;
                } else {
                  if (var4 > this.field_b) {
                    break L12;
                  } else {
                    if (32 + var4 < this.field_b) {
                      break L12;
                    } else {
                      L13: {
                        if (this.field_e != var8) {
                          this.field_e = var8;
                          break L13;
                        } else {
                          this.field_e = -1;
                          break L13;
                        }
                      }
                      this.field_a = -1;
                      break L12;
                    }
                  }
                }
              }
            }
            L14: {
              if (var8 != this.field_e) {
                break L14;
              } else {
                mi.b(var3 + -2, var4 - 2, 36, 36, 6, 16776960);
                break L14;
              }
            }
            incrementValue$0 = var6;
            var6++;
            if ((incrementValue$0 ^ -1) == -9) {
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
        this.field_e = -1;
        this.field_a = -1;
        this.field_d = param0;
        this.field_f = new sf(ab.field_s[param0].length);
    }

    final static void b(int param0) {
        le.a(-88, ug.field_d, (String) null);
        if (param0 > -98) {
            ie.a(-121, 32, 65);
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_c = new long[8][256];
        field_g = new long[11];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = -1 != (var0 & 1 ^ -1) ? (long)(var1 & 255) : (long)(var1 >>> 1818574472);
            var4 = var2 << -632353535;
            if (256L <= var4) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << -706786495;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 330987521;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_c[0][var0] = td.a(td.a(var4 << -1342340216, td.a(var8 << -1827584048, td.a(td.a(td.a(var6 << 2019428456, td.a(var2 << -1676149576, var2 << 1866524336)), var2 << 1852996448), var10 << 1503010456))), var12);
            for (var14 = 1; 8 > var14; var14++) {
                field_c[var14][var0] = td.a(field_c[var14 - 1][var0] << -822493896, field_c[-1 + var14][var0] >>> 1875895048);
            }
        }
        field_g[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (-11 <= (var15 ^ -1)) {
            var1 = 8 * (-1 + var15);
            field_g[var15] = ke.a(ke.a(tk.a(field_c[6][6 + var1], 65280L), ke.a(ke.a(ke.a(tk.a(1095216660480L, field_c[3][3 + var1]), ke.a(ke.a(tk.a(-72057594037927936L, field_c[0][var1]), tk.a(71776119061217280L, field_c[1][1 + var1])), tk.a(280375465082880L, field_c[2][var1 - -2]))), tk.a(field_c[4][4 + var1], 4278190080L)), tk.a(field_c[5][5 + var1], 16711680L))), tk.a(255L, field_c[7][var1 + 7]));
            var15++;
        }
    }
}
