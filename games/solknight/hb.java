/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class hb {
    private long field_i;
    private long field_e;
    private byte[] field_k;
    private long field_d;
    static double field_n;
    static String field_l;
    private byte[] field_g;
    private long field_a;
    static String[] field_m;
    private sg field_o;
    private int field_h;
    private long field_f;
    private int field_c;
    private long field_b;
    static String field_j;

    final void a(long param0, byte param1) throws IOException {
        if (param1 != 45) {
            return;
        }
        if (!(-1L >= (param0 ^ -1L))) {
            throw new IOException();
        }
        ((hb) this).field_e = param0;
    }

    final void d(boolean param0) throws IOException {
        if (param0) {
            return;
        }
        this.b(83);
        ((hb) this).field_o.a((byte) 7);
    }

    final void b(byte[] param0, int param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Throwable decompiledCaughtException = null;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0.length < param3 + param2) {
              throw new ArrayIndexOutOfBoundsException(param2 - -param3 - param0.length);
            } else {
              L1: {
                if ((((hb) this).field_d ^ -1L) == 0L) {
                  break L1;
                } else {
                  if ((((hb) this).field_e ^ -1L) > (((hb) this).field_d ^ -1L)) {
                    break L1;
                  } else {
                    if (((hb) this).field_d - -(long)((hb) this).field_c >= (long)param3 + ((hb) this).field_e) {
                      fk.a(((hb) this).field_g, (int)(-((hb) this).field_d + ((hb) this).field_e), param0, param2, param3);
                      ((hb) this).field_e = ((hb) this).field_e + (long)param3;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((hb) this).field_e;
                var7 = param2;
                var8 = param3;
                if (((hb) this).field_e < ((hb) this).field_f) {
                  break L2;
                } else {
                  if (((hb) this).field_e < (long)((hb) this).field_h + ((hb) this).field_f) {
                    L3: {
                      var9_int = (int)((long)((hb) this).field_h + (((hb) this).field_f + -((hb) this).field_e));
                      if (param3 >= var9_int) {
                        break L3;
                      } else {
                        var9_int = param3;
                        break L3;
                      }
                    }
                    fk.a(((hb) this).field_k, (int)(((hb) this).field_e - ((hb) this).field_f), param0, param2, var9_int);
                    param3 = param3 - var9_int;
                    ((hb) this).field_e = ((hb) this).field_e + (long)var9_int;
                    param2 = param2 + var9_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if ((param3 ^ -1) < (((hb) this).field_k.length ^ -1)) {
                  ((hb) this).field_o.a(((hb) this).field_e, (byte) 101);
                  ((hb) this).field_a = ((hb) this).field_e;
                  L5: while (true) {
                    if (-1 <= (param3 ^ -1)) {
                      break L4;
                    } else {
                      var9_int = ((hb) this).field_o.a(-1, param2, param3, param0);
                      if (0 != (var9_int ^ -1)) {
                        ((hb) this).field_e = ((hb) this).field_e + (long)var9_int;
                        param3 = param3 - var9_int;
                        param2 = param2 + var9_int;
                        ((hb) this).field_a = ((hb) this).field_a + (long)var9_int;
                        continue L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  if (0 < param3) {
                    L6: {
                      this.c(true);
                      var9_int = param3;
                      if (((hb) this).field_h < var9_int) {
                        var9_int = ((hb) this).field_h;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    fk.a(((hb) this).field_k, 0, param0, param2, var9_int);
                    param2 = param2 + var9_int;
                    ((hb) this).field_e = ((hb) this).field_e + (long)var9_int;
                    param3 = param3 - var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                L8: {
                  if (-1L == ((hb) this).field_d) {
                    break L8;
                  } else {
                    L9: {
                      if ((((hb) this).field_e ^ -1L) <= (((hb) this).field_d ^ -1L)) {
                        break L9;
                      } else {
                        if ((param3 ^ -1) < -1) {
                          L10: {
                            var9_int = param2 + (int)(-((hb) this).field_e + ((hb) this).field_d);
                            if (param3 + param2 >= var9_int) {
                              break L10;
                            } else {
                              var9_int = param2 - -param3;
                              break L10;
                            }
                          }
                          L11: while (true) {
                            if ((param2 ^ -1) <= (var9_int ^ -1)) {
                              break L9;
                            } else {
                              param3--;
                              int incrementValue$1 = param2;
                              param2++;
                              param0[incrementValue$1] = (byte) 0;
                              ((hb) this).field_e = ((hb) this).field_e + 1L;
                              continue L11;
                            }
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    L12: {
                      L13: {
                        var9 = -1L;
                        var11 = -1L;
                        if (((hb) this).field_d < var5_long) {
                          break L13;
                        } else {
                          if ((((hb) this).field_d ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                            var9 = ((hb) this).field_d;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (var5_long < ((hb) this).field_d) {
                        break L12;
                      } else {
                        if ((((hb) this).field_d + (long)((hb) this).field_c ^ -1L) < (var5_long ^ -1L)) {
                          var9 = var5_long;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      L15: {
                        if ((long)((hb) this).field_c + ((hb) this).field_d <= var5_long) {
                          break L15;
                        } else {
                          if (var5_long - -(long)var8 < ((hb) this).field_d + (long)((hb) this).field_c) {
                            break L15;
                          } else {
                            var11 = (long)((hb) this).field_c + ((hb) this).field_d;
                            break L14;
                          }
                        }
                      }
                      if ((var5_long - -(long)var8 ^ -1L) >= (((hb) this).field_d ^ -1L)) {
                        break L14;
                      } else {
                        if ((((hb) this).field_d - -(long)((hb) this).field_c ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                          break L14;
                        } else {
                          var11 = (long)var8 + var5_long;
                          break L14;
                        }
                      }
                    }
                    if (var9 <= -1L) {
                      break L8;
                    } else {
                      if (var9 < var11) {
                        var13 = (int)(-var9 + var11);
                        fk.a(((hb) this).field_g, (int)(-((hb) this).field_d + var9), param0, var7 - -(int)(var9 + -var5_long), var13);
                        if ((((hb) this).field_e ^ -1L) <= (var11 ^ -1L)) {
                          break L8;
                        } else {
                          param3 = (int)((long)param3 - (var11 + -((hb) this).field_e));
                          ((hb) this).field_e = var11;
                          break L8;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                break L7;
              }
              break L0;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((hb) this).field_a = -1L;
          throw var5;
        }
        L16: {
          if (param1 < -63) {
            break L16;
          } else {
            ((hb) this).field_d = -60L;
            break L16;
          }
        }
        if (param3 <= 0) {
          return;
        } else {
          throw new EOFException();
        }
    }

    private final void c(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        ((hb) this).field_h = 0;
        if ((((hb) this).field_a ^ -1L) != (((hb) this).field_e ^ -1L)) {
            ((hb) this).field_o.a(((hb) this).field_e, (byte) 91);
            ((hb) this).field_a = ((hb) this).field_e;
        }
        ((hb) this).field_f = ((hb) this).field_e;
        if (!param0) {
            return;
        }
        while (((hb) this).field_h < ((hb) this).field_k.length) {
            var2 = ((hb) this).field_k.length - ((hb) this).field_h;
            if (-200000001 > (var2 ^ -1)) {
                var2 = 200000000;
            }
            var3 = ((hb) this).field_o.a(-1, ((hb) this).field_h, var2, ((hb) this).field_k);
            if (-1 == var3) {
                break;
            }
            ((hb) this).field_h = ((hb) this).field_h + var3;
            ((hb) this).field_a = ((hb) this).field_a + (long)var3;
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        rb var3_ref_rb = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_141_0 = 0;
        int stackIn_218_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          if (-11 < (vk.field_p ^ -1)) {
            break L0;
          } else {
            if (0 == (1 << kb.field_b & fa.field_f)) {
              L1: {
                ic.field_t = ic.field_t + (bi.field_i >>> 2085217675 << kb.field_b);
                fa.field_f = fa.field_f | 1 << kb.field_b;
                lc.field_h = lc.field_h | 1 << kb.field_b;
                var1 = ii.a(fa.field_f & 255, 126);
                vk.a(246, (byte) 89, 9);
                if (var1 != 4) {
                  break L1;
                } else {
                  vk.a(245, (byte) 89, 10);
                  break L1;
                }
              }
              if (8 != var1) {
                break L0;
              } else {
                vk.a(244, (byte) 89, 11);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (25 > vk.field_p) {
            break L2;
          } else {
            if (0 == (1 << 8 + kb.field_b & fa.field_f)) {
              L3: {
                ic.field_t = ic.field_t + (bi.field_i >>> 1251658219 << kb.field_b + 8);
                fa.field_f = fa.field_f | 1 << kb.field_b + 8;
                lc.field_h = lc.field_h | 1 << kb.field_b + 8;
                var1 = ii.a(fa.field_f & 65280, 127);
                vk.a(243, (byte) 89, 12);
                if ((var1 ^ -1) == -5) {
                  vk.a(242, (byte) 89, 13);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-9 != (var1 ^ -1)) {
                break L2;
              } else {
                vk.a(241, (byte) 89, 14);
                break L2;
              }
            } else {
              break L2;
            }
          }
        }
        L4: {
          if (-51 < (vk.field_p ^ -1)) {
            break L4;
          } else {
            if ((fa.field_f & 65536 ^ -1) != -1) {
              break L4;
            } else {
              lc.field_h = lc.field_h | 65536;
              fa.field_f = fa.field_f | 65536;
              ic.field_t = ic.field_t + (bi.field_i >>> -953749301 << -440625296);
              vk.a(240, (byte) 89, 15);
              break L4;
            }
          }
        }
        L5: {
          if (vk.field_p <= oa.field_m) {
            break L5;
          } else {
            oa.field_m = vk.field_p;
            break L5;
          }
        }
        L6: {
          var1 = 0;
          if (kf.field_G != null) {
            var2 = 0;
            L7: while (true) {
              if ((kf.field_G.length ^ -1) >= (var2 ^ -1)) {
                break L6;
              } else {
                L8: {
                  var3_ref_rb = kf.field_G[var2];
                  if (var3_ref_rb == null) {
                    break L8;
                  } else {
                    if (var3_ref_rb.field_j < 25) {
                      break L8;
                    } else {
                      if (var3_ref_rb.field_j <= 30) {
                        var1 = 1;
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                var2++;
                continue L7;
              }
            }
          } else {
            break L6;
          }
        }
        L9: {
          L10: {
            if (pg.field_e) {
              break L10;
            } else {
              if (lk.field_b < qh.field_a[kb.field_b]) {
                break L10;
              } else {
                if (var1 != 0) {
                  break L10;
                } else {
                  if ((kd.field_a ^ -1) != 0) {
                    break L10;
                  } else {
                    if (uf.field_p >= 0) {
                      L11: {
                        jg.field_b = jg.field_b + 1;
                        if (jg.field_b > 50) {
                          break L11;
                        } else {
                          if (kb.field_b == 7) {
                            break L11;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L12: {
                        L13: {
                          jg.field_b = 0;
                          kh.field_d = 255;
                          if ((kb.field_b ^ -1) == -8) {
                            break L13;
                          } else {
                            L14: {
                              if ((kb.field_b ^ -1) != -3) {
                                break L14;
                              } else {
                                if ((ob.field_l ^ -1) < -1) {
                                  break L14;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            gb.a(true, 5, -128);
                            break L12;
                          }
                        }
                        L15: {
                          lk.field_e = lk.field_e + oa.field_m * 100;
                          ic.field_t = ic.field_t - 100 * oa.field_m;
                          if (-8 != (kb.field_b ^ -1)) {
                            break L15;
                          } else {
                            lk.field_e = lk.field_e + 5000;
                            ic.field_t = ic.field_t - 5000;
                            break L15;
                          }
                        }
                        me.a(false);
                        gb.a(true, 6, -128);
                        pk.a((byte) -96, 5, false);
                        break L12;
                      }
                      vk.field_p = 0;
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
              }
            }
          }
          if (jg.field_b > 0) {
            jg.field_b = jg.field_b - 1;
            break L9;
          } else {
            break L9;
          }
        }
        L16: {
          if (param0) {
            break L16;
          } else {
            field_j = null;
            break L16;
          }
        }
        L17: {
          cb.field_a = 15 * cb.field_a / 16 + -1;
          if (0 >= ia.field_hb) {
            break L17;
          } else {
            if (0 == (kd.field_a ^ -1)) {
              L18: {
                L19: {
                  ia.field_hb = ia.field_hb + 1;
                  if (50 >= ia.field_hb) {
                    break L19;
                  } else {
                    if (7 > kb.field_b) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                if (-101 <= (ia.field_hb ^ -1)) {
                  break L17;
                } else {
                  break L18;
                }
              }
              ia.field_hb = 0;
              vk.field_p = 0;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L20: {
          if (cb.field_a >= 0) {
            break L20;
          } else {
            cb.field_a = 0;
            break L20;
          }
        }
        L21: {
          if (0 <= ve.field_b) {
            pl.field_a = 0;
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          if ((cb.field_a ^ -1) <= -129) {
            break L22;
          } else {
            if (0 >= vk.field_p) {
              break L22;
            } else {
              cb.field_a = 128;
              break L22;
            }
          }
        }
        L23: {
          if (-1 > (pl.field_a ^ -1)) {
            ci.field_ib = 256;
            ic.field_t = ic.field_t - pl.field_a;
            lk.field_e = lk.field_e + pl.field_a;
            pl.field_a = 0;
            me.a(false);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          ci.field_ib = 15 * ci.field_ib / 16 - 1;
          if (-1 >= (ci.field_ib ^ -1)) {
            break L24;
          } else {
            ci.field_ib = 0;
            break L24;
          }
        }
        L25: {
          if (0 >= fg.field_a) {
            break L25;
          } else {
            fg.field_a = fg.field_a - 1;
            if (0 >= fg.field_a) {
              bi.field_h = bi.field_h - 1;
              if ((bi.field_h ^ -1) < -1) {
                fg.field_a = 500;
                break L25;
              } else {
                break L25;
              }
            } else {
              break L25;
            }
          }
        }
        L26: {
          if (ci.field_ib < 128) {
            ci.field_ib = 128;
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          if (vk.field_p < 25) {
            break L27;
          } else {
            if ((bi.field_h ^ -1) > -3) {
              fg.field_a = 500;
              bi.field_h = 2;
              mb.a(param0, 1, 256);
              break L27;
            } else {
              break L27;
            }
          }
        }
        L28: {
          if (-11 >= (vk.field_p ^ -1)) {
            fg.field_a = 500;
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          if (vk.field_p < 10) {
            break L29;
          } else {
            if ((bi.field_h ^ -1) > -2) {
              fg.field_a = 1500;
              bi.field_h = 1;
              mb.a(param0, 0, 256);
              break L29;
            } else {
              break L29;
            }
          }
        }
        L30: {
          if (pg.field_e) {
            vk.field_p = 0;
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          L32: {
            L33: {
              if (!pg.field_e) {
                break L33;
              } else {
                if ((kd.field_a ^ -1) != 0) {
                  break L32;
                } else {
                  break L33;
                }
              }
            }
            if (0 > ve.field_b) {
              break L31;
            } else {
              break L32;
            }
          }
          lk.field_b = 0;
          break L31;
        }
        L34: {
          if ((qh.field_a[kb.field_b] ^ -1) >= (lk.field_b ^ -1)) {
            break L34;
          } else {
            L35: {
              if (kd.field_a == -1) {
                break L35;
              } else {
                if (!pg.field_e) {
                  break L34;
                } else {
                  break L35;
                }
              }
            }
            mf.field_A = mf.field_A + 1;
            break L34;
          }
        }
        L36: {
          if (uf.field_p <= 0) {
            break L36;
          } else {
            if (200 <= wc.field_c) {
              break L36;
            } else {
              wc.field_c = wc.field_c + 1;
              break L36;
            }
          }
        }
        L37: {
          if (!pg.field_e) {
            break L37;
          } else {
            if (-1 == kd.field_a) {
              L38: {
                if (ve.field_b >= 0) {
                  break L38;
                } else {
                  if (of.field_g > 50) {
                    k.field_c = k.field_c + 1;
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              L39: {
                of.field_g = of.field_g + 1;
                if (-51 <= (of.field_g ^ -1)) {
                  rb discarded$2 = m.a(10, -ea.field_p[kb.field_b] + (720 + bk.a(128, jb.field_g, (byte) 47)) - 64 << 1226965956, bk.a(128, jb.field_g, (byte) -46) + -64 << -2060847036, (byte) -6, 0, 0);
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (50 >= of.field_g) {
                  break L40;
                } else {
                  L41: {
                    if (-2 == (hg.field_F ^ -1)) {
                      break L41;
                    } else {
                      if (fh.field_d[84]) {
                        break L41;
                      } else {
                        if (fh.field_d[83]) {
                          break L41;
                        } else {
                          break L40;
                        }
                      }
                    }
                  }
                  of.field_g = 501;
                  break L40;
                }
              }
              if (of.field_g > 500) {
                L42: {
                  uf.field_p = uf.field_p - 1;
                  if ((kb.field_b ^ -1) == -8) {
                    break L42;
                  } else {
                    if (0 > uf.field_p) {
                      break L42;
                    } else {
                      break L37;
                    }
                  }
                }
                L43: {
                  kh.field_d = 255;
                  if (il.b(507)) {
                    gb.a(true, 8, -128);
                    break L43;
                  } else {
                    ah.b(true);
                    kh.field_c = null;
                    if ((jl.field_d ^ -1) != -1) {
                      gb.a(true, 7, -127);
                      break L43;
                    } else {
                      gb.a(true, 2, -128);
                      break L43;
                    }
                  }
                }
                L44: {
                  if ((ob.field_l ^ -1) >= -1) {
                    stackOut_140_0 = 9;
                    stackIn_141_0 = stackOut_140_0;
                    break L44;
                  } else {
                    stackOut_139_0 = 0;
                    stackIn_141_0 = stackOut_139_0;
                    break L44;
                  }
                }
                fb.field_c = stackIn_141_0;
                var2 = 0;
                L45: while (true) {
                  if ((var2 ^ -1) <= (kf.field_G.length ^ -1)) {
                    ve.field_b = 240;
                    pk.a((byte) -96, 4, false);
                    break L37;
                  } else {
                    kf.field_G[var2] = null;
                    var2++;
                    continue L45;
                  }
                }
              } else {
                break L37;
              }
            } else {
              break L37;
            }
          }
        }
        L46: {
          if (ve.field_b < 0) {
            break L46;
          } else {
            lk.field_b = 0;
            break L46;
          }
        }
        L47: {
          if (!pg.field_e) {
            of.field_g = 0;
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          L49: {
            if (0 == (kd.field_a ^ -1)) {
              break L49;
            } else {
              if (pg.field_e) {
                break L49;
              } else {
                if (-1 >= (ve.field_b ^ -1)) {
                  break L49;
                } else {
                  break L48;
                }
              }
            }
          }
          L50: {
            if (100 >= mf.field_A) {
              break L50;
            } else {
              L51: {
                if (!pg.field_e) {
                  break L51;
                } else {
                  L52: {
                    if (-1 == kd.field_a) {
                      break L52;
                    } else {
                      if (pg.field_e) {
                        break L51;
                      } else {
                        break L52;
                      }
                    }
                  }
                  if (ve.field_b >= 0) {
                    break L51;
                  } else {
                    break L50;
                  }
                }
              }
              L53: {
                var2 = bk.a(5, jb.field_g, (byte) -52);
                if (-1 != (kb.field_b ^ -1)) {
                  break L53;
                } else {
                  if (-1 == (var2 ^ -1)) {
                    var2 = 1;
                    break L53;
                  } else {
                    break L53;
                  }
                }
              }
              L54: {
                if (0 != kb.field_b) {
                  break L54;
                } else {
                  if ((var2 ^ -1) <= -4) {
                    var2 = 1;
                    break L54;
                  } else {
                    break L54;
                  }
                }
              }
              L55: {
                if (kb.field_b != 1) {
                  break L55;
                } else {
                  if (var2 < 4) {
                    break L55;
                  } else {
                    var2 = 2;
                    break L55;
                  }
                }
              }
              L56: {
                if (ib.field_h >= kb.field_b) {
                  break L56;
                } else {
                  if ((bk.a(2, jb.field_g, (byte) 76) ^ -1) != -1) {
                    break L56;
                  } else {
                    if (qh.field_a[kb.field_b] - 50 >= lk.field_b) {
                      break L56;
                    } else {
                      if (0 >= kb.field_b) {
                        break L56;
                      } else {
                        var2 = 5;
                        break L56;
                      }
                    }
                  }
                }
              }
              L57: {
                if (-1 + (qh.field_a[kb.field_b] + -lk.field_b) >= var2) {
                  break L57;
                } else {
                  var2 = -1 + -lk.field_b + qh.field_a[kb.field_b];
                  break L57;
                }
              }
              L58: {
                if (var2 >= 0) {
                  break L58;
                } else {
                  var2 = 0;
                  break L58;
                }
              }
              L59: {
                var3 = 1;
                if (0 != var2) {
                  break L59;
                } else {
                  L60: {
                    if (!pg.field_e) {
                      lk.field_b = lk.field_b + 1;
                      break L60;
                    } else {
                      break L60;
                    }
                  }
                  mf.field_A = mf.field_A - (25 + kb.field_b);
                  var3 = 64;
                  break L59;
                }
              }
              L61: {
                if (var2 == 1) {
                  var3 = 32;
                  mf.field_A = mf.field_A - (30 - -(2 * kb.field_b));
                  if (!pg.field_e) {
                    lk.field_b = lk.field_b + 2;
                    break L61;
                  } else {
                    break L61;
                  }
                } else {
                  break L61;
                }
              }
              L62: {
                if (var2 != 2) {
                  break L62;
                } else {
                  var3 = 24;
                  mf.field_A = mf.field_A - (kb.field_b * 3 + 35);
                  if (!pg.field_e) {
                    lk.field_b = lk.field_b + 3;
                    break L62;
                  } else {
                    break L62;
                  }
                }
              }
              L63: {
                if (3 != var2) {
                  break L63;
                } else {
                  L64: {
                    var3 = 16;
                    if (pg.field_e) {
                      break L64;
                    } else {
                      lk.field_b = lk.field_b + 4;
                      break L64;
                    }
                  }
                  mf.field_A = mf.field_A - (40 + 4 * kb.field_b);
                  break L63;
                }
              }
              L65: {
                if (4 == var2) {
                  L66: {
                    var3 = 8;
                    if (pg.field_e) {
                      break L66;
                    } else {
                      lk.field_b = lk.field_b + 5;
                      break L66;
                    }
                  }
                  mf.field_A = mf.field_A - (45 - -(5 * kb.field_b));
                  break L65;
                } else {
                  break L65;
                }
              }
              L67: {
                if ((var2 ^ -1) == -6) {
                  ib.field_h = ib.field_h + 1;
                  mf.field_A = mf.field_A - (kb.field_b * 5 + 50);
                  var3 = 8;
                  if (pg.field_e) {
                    break L67;
                  } else {
                    lk.field_b = lk.field_b + 6;
                    break L67;
                  }
                } else {
                  break L67;
                }
              }
              L68: {
                if ((kb.field_b ^ -1) == -1) {
                  var3 -= 8;
                  break L68;
                } else {
                  break L68;
                }
              }
              L69: {
                var3 = var3 + kb.field_b;
                var4 = -640 + bk.a(1280, jb.field_g, (byte) 91) << 1816205508;
                var5 = -2048;
                var6 = (bk.a(1280, jb.field_g, (byte) 51) - 640 << 1219100612) * (-kb.field_b + 7) / 7;
                if ((var2 ^ -1) == -6) {
                  var6 = 0;
                  break L69;
                } else {
                  break L69;
                }
              }
              L70: {
                if (-1 < (ve.field_b ^ -1)) {
                  break L70;
                } else {
                  L71: {
                    if (var4 >= 0) {
                      stackOut_217_0 = var6 / 5 - 5120;
                      stackIn_218_0 = stackOut_217_0;
                      break L71;
                    } else {
                      stackOut_216_0 = -5120 + var6 / 3;
                      stackIn_218_0 = stackOut_216_0;
                      break L71;
                    }
                  }
                  var6 = stackIn_218_0;
                  break L70;
                }
              }
              var7 = 11520;
              var8 = var6 + -var4;
              var9 = var7 - var5;
              var10 = (int)Math.sqrt((double)(var8 * var8 - -(var9 * var9)));
              rb discarded$3 = m.a(var2 + 25, var5, var4, (byte) -6, var9 * var3 / var10, var3 * var8 / var10);
              break L50;
            }
          }
          L72: {
            if (-1 <= (f.field_d ^ -1)) {
              break L72;
            } else {
              f.field_d = f.field_d - 1;
              break L72;
            }
          }
          L73: {
            vk.b((byte) -126);
            if (!pg.field_e) {
              break L73;
            } else {
              if ((f.field_d ^ -1) < -1) {
                pg.field_e = false;
                break L73;
              } else {
                break L73;
              }
            }
          }
          if (!pg.field_e) {
            break L48;
          } else {
            if (0 < uf.field_p) {
              f.field_d = 250;
              uf.field_p = uf.field_p - 1;
              pg.field_e = false;
              break L48;
            } else {
              break L48;
            }
          }
        }
        L74: {
          L75: {
            if (pg.field_e) {
              break L75;
            } else {
              if (-1 != kd.field_a) {
                break L75;
              } else {
                break L74;
              }
            }
          }
          si.field_E = (si.field_E * 9 - -240) / 10;
          wd.field_c = 9 * wd.field_c / 10;
          break L74;
        }
        L76: {
          L77: {
            L78: {
              if (pg.field_e) {
                break L78;
              } else {
                if ((kd.field_a ^ -1) == 0) {
                  break L77;
                } else {
                  break L78;
                }
              }
            }
            if (ve.field_b < 0) {
              break L76;
            } else {
              break L77;
            }
          }
          L79: {
            var2 = gb.field_j;
            if (-1 >= (var2 ^ -1)) {
              break L79;
            } else {
              var2 = 0;
              break L79;
            }
          }
          L80: {
            var3 = ad.field_m;
            if (640 <= var2) {
              var2 = 639;
              break L80;
            } else {
              break L80;
            }
          }
          L81: {
            if (var3 < 0) {
              var3 = 0;
              break L81;
            } else {
              break L81;
            }
          }
          L82: {
            if (-481 >= (var3 ^ -1)) {
              var3 = 479;
              break L82;
            } else {
              break L82;
            }
          }
          L83: {
            if (kd.field_a != -1) {
              break L83;
            } else {
              L84: {
                if (0 > (gb.field_j ^ -1)) {
                  break L84;
                } else {
                  if (0 == wb.field_c) {
                    break L83;
                  } else {
                    break L84;
                  }
                }
              }
              si.field_E = (var3 / 2 + 9 * si.field_E) / 10;
              wd.field_c = (9 * wd.field_c + (var2 + -320)) / 10;
              break L83;
            }
          }
          be.c(false);
          break L76;
        }
        L85: {
          if (kd.field_a != -1) {
            break L85;
          } else {
            L86: while (true) {
              if (!wk.a((byte) -56)) {
                break L85;
              } else {
                if (13 == el.field_n) {
                  if (pg.field_e) {
                    f.field_d = 0;
                    of.field_g = 500;
                    continue L86;
                  } else {
                    gb.a(true, 1, -128);
                    continue L86;
                  }
                } else {
                  continue L86;
                }
              }
            }
          }
        }
        L87: {
          if (!fh.field_d[82]) {
            break L87;
          } else {
            if (el.field_n != 80) {
              break L87;
            } else {
              if (pg.field_e) {
                break L87;
              } else {
                if (-1 != kd.field_a) {
                  break L87;
                } else {
                  if ((lh.field_s ^ -1) > -3) {
                    break L87;
                  } else {
                    L88: {
                      kh.field_d = 255;
                      gb.a(false, 5, -127);
                      lc.field_p = lc.field_p + 1;
                      ic.field_t = ic.field_t - 1;
                      vk.field_p = 0;
                      oa.field_n = true;
                      if ((1 + kb.field_b ^ -1) > -9) {
                        lk.field_b = qh.field_a[kb.field_b];
                        var2 = -ud.field_k + (-100 + qh.field_a[1 + kb.field_b]);
                        bi.field_i = bi.field_i + var2;
                        lc.field_p = lc.field_p + var2 * (lc.field_h >>> 1245842065);
                        ud.field_k = qh.field_a[1 + kb.field_b] + -100;
                        break L88;
                      } else {
                        L89: {
                          lk.field_e = lk.field_e + oa.field_m * 100;
                          ic.field_t = ic.field_t - (oa.field_m * 100 + 5000);
                          lk.field_e = lk.field_e + 5000;
                          me.a(false);
                          if (!il.b(507)) {
                            ah.b(param0);
                            kh.field_c = null;
                            break L89;
                          } else {
                            break L89;
                          }
                        }
                        gb.a(true, 6, -127);
                        pk.a((byte) -96, 5, false);
                        break L88;
                      }
                    }
                    lk.field_f = 0;
                    break L87;
                  }
                }
              }
            }
          }
        }
        L90: {
          if (2 > lh.field_s) {
            break L90;
          } else {
            if (fh.field_d[32]) {
              ic.field_t = ic.field_t - 1;
              fg.field_a = 500;
              lc.field_p = lc.field_p + 1;
              oa.field_n = true;
              bi.field_h = 1;
              break L90;
            } else {
              break L90;
            }
          }
        }
        L91: {
          if ((lh.field_s ^ -1) > -3) {
            break L91;
          } else {
            if (!fh.field_d[33]) {
              break L91;
            } else {
              bi.field_h = 2;
              oa.field_n = true;
              fg.field_a = 500;
              ic.field_t = ic.field_t - 1;
              lc.field_p = lc.field_p + 1;
              break L91;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_j = null;
        field_m = null;
        field_l = null;
        if (!param0) {
            field_l = null;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((((hb) this).field_e + (long)param2 ^ -1L) >= (((hb) this).field_i ^ -1L)) {
                break L1;
              } else {
                ((hb) this).field_i = (long)param2 + ((hb) this).field_e;
                break L1;
              }
            }
            L2: {
              if (((hb) this).field_d == -1L) {
                break L2;
              } else {
                L3: {
                  if ((((hb) this).field_e ^ -1L) > (((hb) this).field_d ^ -1L)) {
                    break L3;
                  } else {
                    if ((((hb) this).field_d - -(long)((hb) this).field_c ^ -1L) <= (((hb) this).field_e ^ -1L)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                this.b(param1 ^ -20344);
                break L2;
              }
            }
            L4: {
              if ((((hb) this).field_d ^ -1L) == 0L) {
                break L4;
              } else {
                if (((hb) this).field_d - -(long)((hb) this).field_g.length < (long)param2 + ((hb) this).field_e) {
                  var5_int = (int)((long)((hb) this).field_g.length + (((hb) this).field_d + -((hb) this).field_e));
                  fk.a(param0, param3, ((hb) this).field_g, (int)(((hb) this).field_e - ((hb) this).field_d), var5_int);
                  param2 = param2 - var5_int;
                  ((hb) this).field_e = ((hb) this).field_e + (long)var5_int;
                  param3 = param3 + var5_int;
                  ((hb) this).field_c = ((hb) this).field_g.length;
                  this.b(116);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (((hb) this).field_g.length < param2) {
              L5: {
                if ((((hb) this).field_e ^ -1L) == (((hb) this).field_a ^ -1L)) {
                  break L5;
                } else {
                  ((hb) this).field_o.a(((hb) this).field_e, (byte) 116);
                  ((hb) this).field_a = ((hb) this).field_e;
                  break L5;
                }
              }
              L6: {
                ((hb) this).field_o.a(param2, param0, -1, param3);
                ((hb) this).field_a = ((hb) this).field_a + (long)param2;
                if ((((hb) this).field_b ^ -1L) <= (((hb) this).field_a ^ -1L)) {
                  break L6;
                } else {
                  ((hb) this).field_b = ((hb) this).field_a;
                  break L6;
                }
              }
              L7: {
                L8: {
                  var5_long = -1L;
                  var7 = -1L;
                  if ((((hb) this).field_f ^ -1L) < (((hb) this).field_e ^ -1L)) {
                    break L8;
                  } else {
                    if ((long)((hb) this).field_h + ((hb) this).field_f > ((hb) this).field_e) {
                      var5_long = ((hb) this).field_e;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if ((((hb) this).field_f ^ -1L) > (((hb) this).field_e ^ -1L)) {
                  break L7;
                } else {
                  if (((hb) this).field_e + (long)param2 <= ((hb) this).field_f) {
                    break L7;
                  } else {
                    var5_long = ((hb) this).field_f;
                    break L7;
                  }
                }
              }
              L9: {
                L10: {
                  if (((hb) this).field_f >= (long)param2 + ((hb) this).field_e) {
                    break L10;
                  } else {
                    if ((((hb) this).field_f - -(long)((hb) this).field_h ^ -1L) > (((hb) this).field_e - -(long)param2 ^ -1L)) {
                      break L10;
                    } else {
                      var7 = (long)param2 + ((hb) this).field_e;
                      break L9;
                    }
                  }
                }
                if (((hb) this).field_e >= (long)((hb) this).field_h + ((hb) this).field_f) {
                  break L9;
                } else {
                  if (((hb) this).field_f - -(long)((hb) this).field_h > (long)param2 + ((hb) this).field_e) {
                    break L9;
                  } else {
                    var7 = ((hb) this).field_f + (long)((hb) this).field_h;
                    break L9;
                  }
                }
              }
              L11: {
                if ((var5_long ^ -1L) >= 0L) {
                  break L11;
                } else {
                  if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                    break L11;
                  } else {
                    var9 = (int)(-var5_long + var7);
                    fk.a(param0, (int)(-((hb) this).field_e + (var5_long + (long)param3)), ((hb) this).field_k, (int)(-((hb) this).field_f + var5_long), var9);
                    break L11;
                  }
                }
              }
              ((hb) this).field_e = ((hb) this).field_e + (long)param2;
              return;
            } else {
              L12: {
                if (param1 == -20291) {
                  break L12;
                } else {
                  ((hb) this).field_k = null;
                  break L12;
                }
              }
              if (param2 <= 0) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L13: {
                  if ((((hb) this).field_d ^ -1L) == 0L) {
                    ((hb) this).field_d = ((hb) this).field_e;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  fk.a(param0, param3, ((hb) this).field_g, (int)(-((hb) this).field_d + ((hb) this).field_e), param2);
                  ((hb) this).field_e = ((hb) this).field_e + (long)param2;
                  if (-((hb) this).field_d + ((hb) this).field_e > (long)((hb) this).field_c) {
                    ((hb) this).field_c = (int)(((hb) this).field_e + -((hb) this).field_d);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((hb) this).field_a = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        if (param0 <= 3) {
        }
        ((hb) this).b(param1, -90, 0, param1.length);
    }

    final long a(int param0) {
        if (param0 != 33) {
            ((hb) this).field_c = 27;
        }
        return ((hb) this).field_i;
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          if ((((hb) this).field_d ^ -1L) == 0L) {
            break L0;
          } else {
            L1: {
              if ((((hb) this).field_d ^ -1L) == (((hb) this).field_a ^ -1L)) {
                break L1;
              } else {
                ((hb) this).field_o.a(((hb) this).field_d, (byte) 72);
                ((hb) this).field_a = ((hb) this).field_d;
                break L1;
              }
            }
            L2: {
              ((hb) this).field_o.a(((hb) this).field_c, ((hb) this).field_g, -1, 0);
              ((hb) this).field_a = ((hb) this).field_a + (long)((hb) this).field_c;
              if ((((hb) this).field_b ^ -1L) > (((hb) this).field_a ^ -1L)) {
                ((hb) this).field_b = ((hb) this).field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((((hb) this).field_f ^ -1L) < (((hb) this).field_d ^ -1L)) {
                  break L4;
                } else {
                  if (((long)((hb) this).field_h + ((hb) this).field_f ^ -1L) >= (((hb) this).field_d ^ -1L)) {
                    break L4;
                  } else {
                    var2 = ((hb) this).field_d;
                    break L3;
                  }
                }
              }
              if ((((hb) this).field_f ^ -1L) > (((hb) this).field_d ^ -1L)) {
                break L3;
              } else {
                if (((hb) this).field_d - -(long)((hb) this).field_c > ((hb) this).field_f) {
                  var2 = ((hb) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((long)((hb) this).field_c + ((hb) this).field_d ^ -1L) >= (((hb) this).field_f ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((hb) this).field_h + ((hb) this).field_f < ((hb) this).field_d + (long)((hb) this).field_c) {
                    break L6;
                  } else {
                    var4 = ((hb) this).field_d + (long)((hb) this).field_c;
                    break L5;
                  }
                }
              }
              if (((long)((hb) this).field_h + ((hb) this).field_f ^ -1L) >= (((hb) this).field_d ^ -1L)) {
                break L5;
              } else {
                if (((long)((hb) this).field_h + ((hb) this).field_f ^ -1L) < (((hb) this).field_d + (long)((hb) this).field_c ^ -1L)) {
                  break L5;
                } else {
                  var4 = (long)((hb) this).field_h + ((hb) this).field_f;
                  break L5;
                }
              }
            }
            L7: {
              if ((var2 ^ -1L) >= 0L) {
                break L7;
              } else {
                if (var2 < var4) {
                  var6 = (int)(-var2 + var4);
                  fk.a(((hb) this).field_g, (int)(var2 - ((hb) this).field_d), ((hb) this).field_k, (int)(var2 + -((hb) this).field_f), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((hb) this).field_c = 0;
            ((hb) this).field_d = -1L;
            break L0;
          }
        }
        L8: {
          if (param0 > 31) {
            break L8;
          } else {
            ((hb) this).field_a = -125L;
            break L8;
          }
        }
    }

    hb(sg param0, int param1, int param2) throws IOException {
        ((hb) this).field_d = -1L;
        ((hb) this).field_f = -1L;
        ((hb) this).field_c = 0;
        ((hb) this).field_o = param0;
        long dupTemp$0 = param0.a(-1);
        ((hb) this).field_b = dupTemp$0;
        ((hb) this).field_i = dupTemp$0;
        ((hb) this).field_e = 0L;
        ((hb) this).field_g = new byte[param2];
        ((hb) this).field_k = new byte[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "achievements to collect";
        field_m = new String[]{"Order of the Moon", "Order of the Planet", "Order of the System", "Order of the Galaxy", "Order of the Universe", "Solar Squire", "Solar Knight", "Solar Prince", "Solar King", "Combo Bonus", "Combo Collector", "Combo Champion", "Mega Bonus", "Mega Collector", "Mega Champion", "Ultimate Bonus"};
        field_j = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_n = 0.0;
    }
}
