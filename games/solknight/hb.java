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
        if (!(param0 >= 0L)) {
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
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0.length < param3 + param2) {
              throw new ArrayIndexOutOfBoundsException(param2 - -param3 - param0.length);
            } else {
              L1: {
                if (((hb) this).field_d == -1L) {
                  break L1;
                } else {
                  if (~((hb) this).field_e > ~((hb) this).field_d) {
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
                if (~param3 < ~((hb) this).field_k.length) {
                  ((hb) this).field_o.a(((hb) this).field_e, (byte) 101);
                  ((hb) this).field_a = ((hb) this).field_e;
                  L5: while (true) {
                    if (param3 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((hb) this).field_o.a(-1, param2, param3, param0);
                      if (var9_int != -1) {
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
                      if (~((hb) this).field_e <= ~((hb) this).field_d) {
                        break L9;
                      } else {
                        if (param3 > 0) {
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
                            if (~param2 <= ~var9_int) {
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
                          if (~((hb) this).field_d > ~(var5_long - -(long)var8)) {
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
                        if (~(((hb) this).field_d + (long)((hb) this).field_c) < ~var5_long) {
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
                      if (~(var5_long - -(long)var8) >= ~((hb) this).field_d) {
                        break L14;
                      } else {
                        if (~(((hb) this).field_d - -(long)((hb) this).field_c) > ~(var5_long - -(long)var8)) {
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
                        if (~((hb) this).field_e <= ~var11) {
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
              L16: {
                if (param1 < -63) {
                  break L16;
                } else {
                  ((hb) this).field_d = -60L;
                  break L16;
                }
              }
              if (param3 <= 0) {
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((hb) this).field_a = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var5_ref;
            stackOut_63_1 = new StringBuilder().append("hb.I(");
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param0 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L17;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L17;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        ((hb) this).field_h = 0;
        if (~((hb) this).field_a != ~((hb) this).field_e) {
            ((hb) this).field_o.a(((hb) this).field_e, (byte) 91);
            ((hb) this).field_a = ((hb) this).field_e;
        }
        ((hb) this).field_f = ((hb) this).field_e;
        while (((hb) this).field_h < ((hb) this).field_k.length) {
            var2 = ((hb) this).field_k.length - ((hb) this).field_h;
            if (var2 > 200000000) {
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
        int var1_int = 0;
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
        int stackIn_139_0 = 0;
        int stackIn_216_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_214_0 = 0;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          if (vk.field_p < 10) {
            break L0;
          } else {
            if (0 == (1 << kb.field_b & fa.field_f)) {
              L1: {
                ic.field_t = ic.field_t + (bi.field_i >>> 11 << kb.field_b);
                fa.field_f = fa.field_f | 1 << kb.field_b;
                lc.field_h = lc.field_h | 1 << kb.field_b;
                var1_int = ii.a(fa.field_f & 255, 126);
                vk.a(246, (byte) 89, 9);
                if (var1_int != 4) {
                  break L1;
                } else {
                  vk.a(245, (byte) 89, 10);
                  break L1;
                }
              }
              if (8 != var1_int) {
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
                ic.field_t = ic.field_t + (bi.field_i >>> 11 << kb.field_b + 8);
                fa.field_f = fa.field_f | 1 << kb.field_b + 8;
                lc.field_h = lc.field_h | 1 << kb.field_b + 8;
                var1_int = ii.a(fa.field_f & 65280, 127);
                vk.a(243, (byte) 89, 12);
                if (var1_int == 4) {
                  vk.a(242, (byte) 89, 13);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (var1_int != 8) {
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
          if (vk.field_p < 50) {
            break L4;
          } else {
            if ((fa.field_f & 65536) != 0) {
              break L4;
            } else {
              lc.field_h = lc.field_h | 65536;
              fa.field_f = fa.field_f | 65536;
              ic.field_t = ic.field_t + (bi.field_i >>> 11 << 16);
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
          var1_int = 0;
          if (kf.field_G != null) {
            var2 = 0;
            L7: while (true) {
              if (~kf.field_G.length >= ~var2) {
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
                        var1_int = 1;
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
                if (var1_int != 0) {
                  break L10;
                } else {
                  if (kd.field_a != -1) {
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
                          if (kb.field_b == 7) {
                            break L13;
                          } else {
                            L14: {
                              if (kb.field_b != 2) {
                                break L14;
                              } else {
                                if (ob.field_l > 0) {
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
                          if (kb.field_b != 7) {
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
          cb.field_a = 15 * cb.field_a / 16 + -1;
          if (0 >= ia.field_hb) {
            break L16;
          } else {
            if (kd.field_a == -1) {
              L17: {
                L18: {
                  ia.field_hb = ia.field_hb + 1;
                  if (50 >= ia.field_hb) {
                    break L18;
                  } else {
                    if (7 > kb.field_b) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                if (ia.field_hb <= 100) {
                  break L16;
                } else {
                  break L17;
                }
              }
              ia.field_hb = 0;
              vk.field_p = 0;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L19: {
          if (cb.field_a >= 0) {
            break L19;
          } else {
            cb.field_a = 0;
            break L19;
          }
        }
        L20: {
          if (0 <= ve.field_b) {
            pl.field_a = 0;
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (cb.field_a >= 128) {
            break L21;
          } else {
            if (0 >= vk.field_p) {
              break L21;
            } else {
              cb.field_a = 128;
              break L21;
            }
          }
        }
        L22: {
          if (pl.field_a > 0) {
            ci.field_ib = 256;
            ic.field_t = ic.field_t - pl.field_a;
            lk.field_e = lk.field_e + pl.field_a;
            pl.field_a = 0;
            me.a(false);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          ci.field_ib = 15 * ci.field_ib / 16 - 1;
          if (ci.field_ib >= 0) {
            break L23;
          } else {
            ci.field_ib = 0;
            break L23;
          }
        }
        L24: {
          if (0 >= fg.field_a) {
            break L24;
          } else {
            fg.field_a = fg.field_a - 1;
            if (0 >= fg.field_a) {
              bi.field_h = bi.field_h - 1;
              if (bi.field_h > 0) {
                fg.field_a = 500;
                break L24;
              } else {
                break L24;
              }
            } else {
              break L24;
            }
          }
        }
        L25: {
          if (ci.field_ib < 128) {
            ci.field_ib = 128;
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          if (vk.field_p < 25) {
            break L26;
          } else {
            if (bi.field_h < 2) {
              fg.field_a = 500;
              bi.field_h = 2;
              mb.a(true, 1, 256);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L27: {
          if (vk.field_p >= 10) {
            fg.field_a = 500;
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          if (vk.field_p < 10) {
            break L28;
          } else {
            if (bi.field_h < 1) {
              fg.field_a = 1500;
              bi.field_h = 1;
              mb.a(true, 0, 256);
              break L28;
            } else {
              break L28;
            }
          }
        }
        L29: {
          if (pg.field_e) {
            vk.field_p = 0;
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          L31: {
            L32: {
              if (!pg.field_e) {
                break L32;
              } else {
                if (kd.field_a != -1) {
                  break L31;
                } else {
                  break L32;
                }
              }
            }
            if (0 > ve.field_b) {
              break L30;
            } else {
              break L31;
            }
          }
          lk.field_b = 0;
          break L30;
        }
        L33: {
          if (~qh.field_a[kb.field_b] >= ~lk.field_b) {
            break L33;
          } else {
            L34: {
              if (kd.field_a == -1) {
                break L34;
              } else {
                if (!pg.field_e) {
                  break L33;
                } else {
                  break L34;
                }
              }
            }
            mf.field_A = mf.field_A + 1;
            break L33;
          }
        }
        L35: {
          if (uf.field_p <= 0) {
            break L35;
          } else {
            if (200 <= wc.field_c) {
              break L35;
            } else {
              wc.field_c = wc.field_c + 1;
              break L35;
            }
          }
        }
        L36: {
          if (!pg.field_e) {
            break L36;
          } else {
            if (-1 == kd.field_a) {
              L37: {
                if (ve.field_b >= 0) {
                  break L37;
                } else {
                  if (of.field_g > 50) {
                    k.field_c = k.field_c + 1;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
              L38: {
                of.field_g = of.field_g + 1;
                if (of.field_g <= 50) {
                  rb discarded$2 = m.a(10, -ea.field_p[kb.field_b] + (720 + bk.a(128, jb.field_g, (byte) 47)) - 64 << 4, bk.a(128, jb.field_g, (byte) -46) + -64 << 4, (byte) -6, 0, 0);
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                if (50 >= of.field_g) {
                  break L39;
                } else {
                  L40: {
                    if (hg.field_F == 1) {
                      break L40;
                    } else {
                      if (fh.field_d[84]) {
                        break L40;
                      } else {
                        if (fh.field_d[83]) {
                          break L40;
                        } else {
                          break L39;
                        }
                      }
                    }
                  }
                  of.field_g = 501;
                  break L39;
                }
              }
              if (of.field_g > 500) {
                L41: {
                  uf.field_p = uf.field_p - 1;
                  if (kb.field_b == 7) {
                    break L41;
                  } else {
                    if (0 > uf.field_p) {
                      break L41;
                    } else {
                      break L36;
                    }
                  }
                }
                L42: {
                  kh.field_d = 255;
                  if (il.b(507)) {
                    gb.a(true, 8, -128);
                    break L42;
                  } else {
                    ah.b(true);
                    kh.field_c = null;
                    if (jl.field_d != 0) {
                      gb.a(true, 7, -127);
                      break L42;
                    } else {
                      gb.a(true, 2, -128);
                      break L42;
                    }
                  }
                }
                L43: {
                  if (ob.field_l <= 0) {
                    stackOut_138_0 = 9;
                    stackIn_139_0 = stackOut_138_0;
                    break L43;
                  } else {
                    stackOut_137_0 = 0;
                    stackIn_139_0 = stackOut_137_0;
                    break L43;
                  }
                }
                fb.field_c = stackIn_139_0;
                var2 = 0;
                L44: while (true) {
                  if (~var2 <= ~kf.field_G.length) {
                    ve.field_b = 240;
                    pk.a((byte) -96, 4, false);
                    break L36;
                  } else {
                    kf.field_G[var2] = null;
                    var2++;
                    continue L44;
                  }
                }
              } else {
                break L36;
              }
            } else {
              break L36;
            }
          }
        }
        L45: {
          if (ve.field_b < 0) {
            break L45;
          } else {
            lk.field_b = 0;
            break L45;
          }
        }
        L46: {
          if (!pg.field_e) {
            of.field_g = 0;
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          L48: {
            if (kd.field_a == -1) {
              break L48;
            } else {
              if (pg.field_e) {
                break L48;
              } else {
                if (ve.field_b >= 0) {
                  break L48;
                } else {
                  break L47;
                }
              }
            }
          }
          L49: {
            if (100 >= mf.field_A) {
              break L49;
            } else {
              L50: {
                if (!pg.field_e) {
                  break L50;
                } else {
                  L51: {
                    if (-1 == kd.field_a) {
                      break L51;
                    } else {
                      if (pg.field_e) {
                        break L50;
                      } else {
                        break L51;
                      }
                    }
                  }
                  if (ve.field_b >= 0) {
                    break L50;
                  } else {
                    break L49;
                  }
                }
              }
              L52: {
                var2 = bk.a(5, jb.field_g, (byte) -52);
                if (kb.field_b != 0) {
                  break L52;
                } else {
                  if (var2 == 0) {
                    var2 = 1;
                    break L52;
                  } else {
                    break L52;
                  }
                }
              }
              L53: {
                if (0 != kb.field_b) {
                  break L53;
                } else {
                  if (var2 >= 3) {
                    var2 = 1;
                    break L53;
                  } else {
                    break L53;
                  }
                }
              }
              L54: {
                if (kb.field_b != 1) {
                  break L54;
                } else {
                  if (var2 < 4) {
                    break L54;
                  } else {
                    var2 = 2;
                    break L54;
                  }
                }
              }
              L55: {
                if (ib.field_h >= kb.field_b) {
                  break L55;
                } else {
                  if (bk.a(2, jb.field_g, (byte) 76) != 0) {
                    break L55;
                  } else {
                    if (qh.field_a[kb.field_b] - 50 >= lk.field_b) {
                      break L55;
                    } else {
                      if (0 >= kb.field_b) {
                        break L55;
                      } else {
                        var2 = 5;
                        break L55;
                      }
                    }
                  }
                }
              }
              L56: {
                if (-1 + (qh.field_a[kb.field_b] + -lk.field_b) >= var2) {
                  break L56;
                } else {
                  var2 = -1 + -lk.field_b + qh.field_a[kb.field_b];
                  break L56;
                }
              }
              L57: {
                if (var2 >= 0) {
                  break L57;
                } else {
                  var2 = 0;
                  break L57;
                }
              }
              L58: {
                var3 = 1;
                if (0 != var2) {
                  break L58;
                } else {
                  L59: {
                    if (!pg.field_e) {
                      lk.field_b = lk.field_b + 1;
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  mf.field_A = mf.field_A - (25 + kb.field_b);
                  var3 = 64;
                  break L58;
                }
              }
              L60: {
                if (var2 == 1) {
                  var3 = 32;
                  mf.field_A = mf.field_A - (30 - -(2 * kb.field_b));
                  if (!pg.field_e) {
                    lk.field_b = lk.field_b + 2;
                    break L60;
                  } else {
                    break L60;
                  }
                } else {
                  break L60;
                }
              }
              L61: {
                if (var2 != 2) {
                  break L61;
                } else {
                  var3 = 24;
                  mf.field_A = mf.field_A - (kb.field_b * 3 + 35);
                  if (!pg.field_e) {
                    lk.field_b = lk.field_b + 3;
                    break L61;
                  } else {
                    break L61;
                  }
                }
              }
              L62: {
                if (3 != var2) {
                  break L62;
                } else {
                  L63: {
                    var3 = 16;
                    if (pg.field_e) {
                      break L63;
                    } else {
                      lk.field_b = lk.field_b + 4;
                      break L63;
                    }
                  }
                  mf.field_A = mf.field_A - (40 + 4 * kb.field_b);
                  break L62;
                }
              }
              L64: {
                if (4 == var2) {
                  L65: {
                    var3 = 8;
                    if (pg.field_e) {
                      break L65;
                    } else {
                      lk.field_b = lk.field_b + 5;
                      break L65;
                    }
                  }
                  mf.field_A = mf.field_A - (45 - -(5 * kb.field_b));
                  break L64;
                } else {
                  break L64;
                }
              }
              L66: {
                if (var2 == 5) {
                  ib.field_h = ib.field_h + 1;
                  mf.field_A = mf.field_A - (kb.field_b * 5 + 50);
                  var3 = 8;
                  if (pg.field_e) {
                    break L66;
                  } else {
                    lk.field_b = lk.field_b + 6;
                    break L66;
                  }
                } else {
                  break L66;
                }
              }
              L67: {
                if (kb.field_b == 0) {
                  var3 -= 8;
                  break L67;
                } else {
                  break L67;
                }
              }
              L68: {
                var3 = var3 + kb.field_b;
                var4 = -640 + bk.a(1280, jb.field_g, (byte) 91) << 4;
                var5 = -2048;
                var6 = (bk.a(1280, jb.field_g, (byte) 51) - 640 << 4) * (-kb.field_b + 7) / 7;
                if (var2 == 5) {
                  var6 = 0;
                  break L68;
                } else {
                  break L68;
                }
              }
              L69: {
                if (ve.field_b < 0) {
                  break L69;
                } else {
                  L70: {
                    if (var4 >= 0) {
                      stackOut_215_0 = var6 / 5 - 5120;
                      stackIn_216_0 = stackOut_215_0;
                      break L70;
                    } else {
                      stackOut_214_0 = -5120 + var6 / 3;
                      stackIn_216_0 = stackOut_214_0;
                      break L70;
                    }
                  }
                  var6 = stackIn_216_0;
                  break L69;
                }
              }
              var7 = 11520;
              var8 = var6 + -var4;
              var9 = var7 - var5;
              var10 = (int)Math.sqrt((double)(var8 * var8 - -(var9 * var9)));
              rb discarded$3 = m.a(var2 + 25, var5, var4, (byte) -6, var9 * var3 / var10, var3 * var8 / var10);
              break L49;
            }
          }
          L71: {
            if (f.field_d <= 0) {
              break L71;
            } else {
              f.field_d = f.field_d - 1;
              break L71;
            }
          }
          L72: {
            vk.b((byte) -126);
            if (!pg.field_e) {
              break L72;
            } else {
              if (f.field_d > 0) {
                pg.field_e = false;
                break L72;
              } else {
                break L72;
              }
            }
          }
          if (!pg.field_e) {
            break L47;
          } else {
            if (0 < uf.field_p) {
              f.field_d = 250;
              uf.field_p = uf.field_p - 1;
              pg.field_e = false;
              break L47;
            } else {
              break L47;
            }
          }
        }
        L73: {
          L74: {
            if (pg.field_e) {
              break L74;
            } else {
              if (-1 != kd.field_a) {
                break L74;
              } else {
                break L73;
              }
            }
          }
          si.field_E = (si.field_E * 9 - -240) / 10;
          wd.field_c = 9 * wd.field_c / 10;
          break L73;
        }
        L75: {
          L76: {
            L77: {
              if (pg.field_e) {
                break L77;
              } else {
                if (kd.field_a == -1) {
                  break L76;
                } else {
                  break L77;
                }
              }
            }
            if (ve.field_b < 0) {
              break L75;
            } else {
              break L76;
            }
          }
          L78: {
            var2 = gb.field_j;
            if (var2 >= 0) {
              break L78;
            } else {
              var2 = 0;
              break L78;
            }
          }
          L79: {
            var3 = ad.field_m;
            if (640 <= var2) {
              var2 = 639;
              break L79;
            } else {
              break L79;
            }
          }
          L80: {
            if (var3 < 0) {
              var3 = 0;
              break L80;
            } else {
              break L80;
            }
          }
          L81: {
            if (var3 >= 480) {
              var3 = 479;
              break L81;
            } else {
              break L81;
            }
          }
          L82: {
            if (kd.field_a != -1) {
              break L82;
            } else {
              L83: {
                if (gb.field_j > -1) {
                  break L83;
                } else {
                  if (0 == wb.field_c) {
                    break L82;
                  } else {
                    break L83;
                  }
                }
              }
              si.field_E = (var3 / 2 + 9 * si.field_E) / 10;
              wd.field_c = (9 * wd.field_c + (var2 + -320)) / 10;
              break L82;
            }
          }
          be.c(false);
          break L75;
        }
        L84: {
          if (kd.field_a != -1) {
            break L84;
          } else {
            L85: while (true) {
              if (!wk.a((byte) -56)) {
                break L84;
              } else {
                if (13 == el.field_n) {
                  if (pg.field_e) {
                    f.field_d = 0;
                    of.field_g = 500;
                    continue L85;
                  } else {
                    gb.a(true, 1, -128);
                    continue L85;
                  }
                } else {
                  continue L85;
                }
              }
            }
          }
        }
        L86: {
          if (!fh.field_d[82]) {
            break L86;
          } else {
            if (el.field_n != 80) {
              break L86;
            } else {
              if (pg.field_e) {
                break L86;
              } else {
                if (-1 != kd.field_a) {
                  break L86;
                } else {
                  if (lh.field_s < 2) {
                    break L86;
                  } else {
                    L87: {
                      kh.field_d = 255;
                      gb.a(false, 5, -127);
                      lc.field_p = lc.field_p + 1;
                      ic.field_t = ic.field_t - 1;
                      vk.field_p = 0;
                      oa.field_n = true;
                      if (1 + kb.field_b < 8) {
                        lk.field_b = qh.field_a[kb.field_b];
                        var2 = -ud.field_k + (-100 + qh.field_a[1 + kb.field_b]);
                        bi.field_i = bi.field_i + var2;
                        lc.field_p = lc.field_p + var2 * (lc.field_h >>> 17);
                        ud.field_k = qh.field_a[1 + kb.field_b] + -100;
                        break L87;
                      } else {
                        L88: {
                          lk.field_e = lk.field_e + oa.field_m * 100;
                          ic.field_t = ic.field_t - (oa.field_m * 100 + 5000);
                          lk.field_e = lk.field_e + 5000;
                          me.a(false);
                          if (!il.b(507)) {
                            ah.b(true);
                            kh.field_c = null;
                            break L88;
                          } else {
                            break L88;
                          }
                        }
                        gb.a(true, 6, -127);
                        pk.a((byte) -96, 5, false);
                        break L87;
                      }
                    }
                    lk.field_f = 0;
                    break L86;
                  }
                }
              }
            }
          }
        }
        L89: {
          if (2 > lh.field_s) {
            break L89;
          } else {
            if (fh.field_d[32]) {
              ic.field_t = ic.field_t - 1;
              fg.field_a = 500;
              lc.field_p = lc.field_p + 1;
              oa.field_n = true;
              bi.field_h = 1;
              break L89;
            } else {
              break L89;
            }
          }
        }
        L90: {
          L91: {
            if (lh.field_s < 2) {
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
                break L90;
              }
            }
          }
          break L90;
        }
    }

    public static void b(boolean param0) {
        field_j = null;
        field_m = null;
        field_l = null;
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~(((hb) this).field_e + (long)param2) >= ~((hb) this).field_i) {
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
                  if (~((hb) this).field_e > ~((hb) this).field_d) {
                    break L3;
                  } else {
                    if (~(((hb) this).field_d - -(long)((hb) this).field_c) <= ~((hb) this).field_e) {
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
              if (((hb) this).field_d == -1L) {
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
                if (~((hb) this).field_e == ~((hb) this).field_a) {
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
                if (~((hb) this).field_b <= ~((hb) this).field_a) {
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
                  if (~((hb) this).field_f < ~((hb) this).field_e) {
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
                if (~((hb) this).field_f > ~((hb) this).field_e) {
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
                    if (~(((hb) this).field_f - -(long)((hb) this).field_h) > ~(((hb) this).field_e - -(long)param2)) {
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
                if (var5_long <= -1L) {
                  break L11;
                } else {
                  if (~var7 >= ~var5_long) {
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
                break L0;
              } else {
                L13: {
                  if (((hb) this).field_d == -1L) {
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
                return;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((hb) this).field_a = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5_ref;
            stackOut_49_1 = new StringBuilder().append("hb.F(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L15;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            if (param0 <= 3) {
            }
            ((hb) this).b(param1, -90, 0, param1.length);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "hb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
          if (((hb) this).field_d == -1L) {
            break L0;
          } else {
            L1: {
              if (~((hb) this).field_d == ~((hb) this).field_a) {
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
              if (~((hb) this).field_b > ~((hb) this).field_a) {
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
                if (~((hb) this).field_f < ~((hb) this).field_d) {
                  break L4;
                } else {
                  if (~((long)((hb) this).field_h + ((hb) this).field_f) >= ~((hb) this).field_d) {
                    break L4;
                  } else {
                    var2 = ((hb) this).field_d;
                    break L3;
                  }
                }
              }
              if (~((hb) this).field_f > ~((hb) this).field_d) {
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
                if (~((long)((hb) this).field_c + ((hb) this).field_d) >= ~((hb) this).field_f) {
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
              if (~((long)((hb) this).field_h + ((hb) this).field_f) >= ~((hb) this).field_d) {
                break L5;
              } else {
                if (~((long)((hb) this).field_h + ((hb) this).field_f) < ~(((hb) this).field_d + (long)((hb) this).field_c)) {
                  break L5;
                } else {
                  var4 = (long)((hb) this).field_h + ((hb) this).field_f;
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
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
        try {
            ((hb) this).field_o = param0;
            long dupTemp$0 = param0.a(-1);
            ((hb) this).field_b = dupTemp$0;
            ((hb) this).field_i = dupTemp$0;
            ((hb) this).field_e = 0L;
            ((hb) this).field_g = new byte[param2];
            ((hb) this).field_k = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
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
