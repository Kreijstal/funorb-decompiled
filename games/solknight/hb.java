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
        this.field_e = param0;
    }

    final void d(boolean param0) throws IOException {
        if (param0) {
            return;
        }
        this.b(83);
        this.field_o.a((byte) 7);
    }

    final void b(byte[] param0, int param1, int param2, int param3) throws IOException {
        int incrementValue$1 = 0;
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
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (param0.length < param3 + param2) {
                  throw new ArrayIndexOutOfBoundsException(param2 - -param3 - param0.length);
                } else {
                  L2: {
                    if ((this.field_d ^ -1L) == 0L) {
                      break L2;
                    } else {
                      if ((this.field_e ^ -1L) > (this.field_d ^ -1L)) {
                        break L2;
                      } else {
                        if (this.field_d - -(long)this.field_c >= (long)param3 + this.field_e) {
                          fk.a(this.field_g, (int)(-this.field_d + this.field_e), param0, param2, param3);
                          this.field_e = this.field_e + (long)param3;
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    var5_long = this.field_e;
                    var7 = param2;
                    var8 = param3;
                    if (this.field_e < this.field_f) {
                      break L3;
                    } else {
                      if (this.field_e < (long)this.field_h + this.field_f) {
                        L4: {
                          var9_int = (int)((long)this.field_h + (this.field_f + -this.field_e));
                          if (param3 >= var9_int) {
                            break L4;
                          } else {
                            var9_int = param3;
                            break L4;
                          }
                        }
                        fk.a(this.field_k, (int)(this.field_e - this.field_f), param0, param2, var9_int);
                        param3 = param3 - var9_int;
                        this.field_e = this.field_e + (long)var9_int;
                        param2 = param2 + var9_int;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (param3 > this.field_k.length) {
                      this.field_o.a(this.field_e, (byte) 101);
                      this.field_a = this.field_e;
                      L6: while (true) {
                        if (-1 <= (param3 ^ -1)) {
                          break L5;
                        } else {
                          var9_int = this.field_o.a(-1, param2, param3, param0);
                          if (0 != (var9_int ^ -1)) {
                            this.field_e = this.field_e + (long)var9_int;
                            param3 = param3 - var9_int;
                            param2 = param2 + var9_int;
                            this.field_a = this.field_a + (long)var9_int;
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    } else {
                      if (0 < param3) {
                        L7: {
                          this.c(true);
                          var9_int = param3;
                          if (this.field_h < var9_int) {
                            var9_int = this.field_h;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        fk.a(this.field_k, 0, param0, param2, var9_int);
                        param2 = param2 + var9_int;
                        this.field_e = this.field_e + (long)var9_int;
                        param3 = param3 - var9_int;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    if (-1L == this.field_d) {
                      break L8;
                    } else {
                      L9: {
                        if ((this.field_e ^ -1L) <= (this.field_d ^ -1L)) {
                          break L9;
                        } else {
                          if ((param3 ^ -1) < -1) {
                            L10: {
                              var9_int = param2 + (int)(-this.field_e + this.field_d);
                              if (param3 + param2 >= var9_int) {
                                break L10;
                              } else {
                                var9_int = param2 - -param3;
                                break L10;
                              }
                            }
                            L11: while (true) {
                              if (param2 >= var9_int) {
                                break L9;
                              } else {
                                param3--;
                                incrementValue$1 = param2;
                                param2++;
                                param0[incrementValue$1] = (byte) 0;
                                this.field_e = this.field_e + 1L;
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
                          if (this.field_d < var5_long) {
                            break L13;
                          } else {
                            if ((this.field_d ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
                              var9 = this.field_d;
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (var5_long < this.field_d) {
                          break L12;
                        } else {
                          if ((this.field_d + (long)this.field_c ^ -1L) < (var5_long ^ -1L)) {
                            var9 = var5_long;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if ((long)this.field_c + this.field_d <= var5_long) {
                            break L15;
                          } else {
                            if (var5_long - -(long)var8 < this.field_d + (long)this.field_c) {
                              break L15;
                            } else {
                              var11 = (long)this.field_c + this.field_d;
                              break L14;
                            }
                          }
                        }
                        if ((var5_long - -(long)var8 ^ -1L) >= (this.field_d ^ -1L)) {
                          break L14;
                        } else {
                          if ((this.field_d - -(long)this.field_c ^ -1L) > (var5_long - -(long)var8 ^ -1L)) {
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
                          fk.a(this.field_g, (int)(-this.field_d + var9), param0, var7 - -(int)(var9 + -var5_long), var13);
                          if ((this.field_e ^ -1L) <= (var11 ^ -1L)) {
                            break L8;
                          } else {
                            param3 = (int)((long)param3 - (var11 + -this.field_e));
                            this.field_e = var11;
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_a = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              L16: {
                if (param1 < -63) {
                  break L16;
                } else {
                  this.field_d = -60L;
                  break L16;
                }
              }
              if (param3 <= 0) {
                decompiledRegionSelector1 = 0;
                break L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L17: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) (var5_ref);
            stackOut_62_1 = new StringBuilder().append("hb.I(");
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param0 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L17;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L17;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        this.field_h = 0;
        if ((this.field_a ^ -1L) != (this.field_e ^ -1L)) {
            this.field_o.a(this.field_e, (byte) 91);
            this.field_a = this.field_e;
        }
        this.field_f = this.field_e;
        if (!param0) {
            return;
        }
        while (this.field_h < this.field_k.length) {
            var2 = this.field_k.length - this.field_h;
            if (-200000001 > (var2 ^ -1)) {
                var2 = 200000000;
            }
            var3 = this.field_o.a(-1, this.field_h, var2, this.field_k);
            if (-1 == var3) {
                break;
            }
            this.field_h = this.field_h + var3;
            this.field_a = this.field_a + (long)var3;
        }
    }

    final static void a(boolean param0) {
        rb discarded$2 = null;
        rb discarded$3 = null;
        RuntimeException var1 = null;
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
        int stackIn_142_0 = 0;
        int stackIn_219_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_217_0 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-11 < (vk.field_p ^ -1)) {
                break L1;
              } else {
                if (0 == (1 << kb.field_b & fa.field_f)) {
                  L2: {
                    ic.field_t = ic.field_t + (bi.field_i >>> 2085217675 << kb.field_b);
                    fa.field_f = fa.field_f | 1 << kb.field_b;
                    lc.field_h = lc.field_h | 1 << kb.field_b;
                    var1_int = ii.a(fa.field_f & 255, 126);
                    vk.a(246, (byte) 89, 9);
                    if (var1_int != 4) {
                      break L2;
                    } else {
                      vk.a(245, (byte) 89, 10);
                      break L2;
                    }
                  }
                  if (8 != var1_int) {
                    break L1;
                  } else {
                    vk.a(244, (byte) 89, 11);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (25 > vk.field_p) {
                break L3;
              } else {
                if (0 == (1 << 8 + kb.field_b & fa.field_f)) {
                  L4: {
                    ic.field_t = ic.field_t + (bi.field_i >>> 1251658219 << kb.field_b + 8);
                    fa.field_f = fa.field_f | 1 << kb.field_b + 8;
                    lc.field_h = lc.field_h | 1 << kb.field_b + 8;
                    var1_int = ii.a(fa.field_f & 65280, 127);
                    vk.a(243, (byte) 89, 12);
                    if ((var1_int ^ -1) == -5) {
                      vk.a(242, (byte) 89, 13);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (-9 != (var1_int ^ -1)) {
                    break L3;
                  } else {
                    vk.a(241, (byte) 89, 14);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (-51 < (vk.field_p ^ -1)) {
                break L5;
              } else {
                if ((fa.field_f & 65536) != 0) {
                  break L5;
                } else {
                  lc.field_h = lc.field_h | 65536;
                  fa.field_f = fa.field_f | 65536;
                  ic.field_t = ic.field_t + (bi.field_i >>> -953749301 << -440625296);
                  vk.a(240, (byte) 89, 15);
                  break L5;
                }
              }
            }
            L6: {
              if (vk.field_p <= oa.field_m) {
                break L6;
              } else {
                oa.field_m = vk.field_p;
                break L6;
              }
            }
            L7: {
              var1_int = 0;
              if (kf.field_G != null) {
                var2 = 0;
                L8: while (true) {
                  if (kf.field_G.length <= var2) {
                    break L7;
                  } else {
                    L9: {
                      var3_ref_rb = kf.field_G[var2];
                      if (var3_ref_rb == null) {
                        break L9;
                      } else {
                        if (var3_ref_rb.field_j < 25) {
                          break L9;
                        } else {
                          if (var3_ref_rb.field_j <= 30) {
                            var1_int = 1;
                            break L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var2++;
                    continue L8;
                  }
                }
              } else {
                break L7;
              }
            }
            L10: {
              L11: {
                if (pg.field_e) {
                  break L11;
                } else {
                  if (lk.field_b < qh.field_a[kb.field_b]) {
                    break L11;
                  } else {
                    if (var1_int != 0) {
                      break L11;
                    } else {
                      if ((kd.field_a ^ -1) != 0) {
                        break L11;
                      } else {
                        if (uf.field_p >= 0) {
                          L12: {
                            jg.field_b = jg.field_b + 1;
                            if (jg.field_b > 50) {
                              break L12;
                            } else {
                              if (kb.field_b == 7) {
                                break L12;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L13: {
                            L14: {
                              jg.field_b = 0;
                              kh.field_d = 255;
                              if ((kb.field_b ^ -1) == -8) {
                                break L14;
                              } else {
                                L15: {
                                  if ((kb.field_b ^ -1) != -3) {
                                    break L15;
                                  } else {
                                    if ((ob.field_l ^ -1) < -1) {
                                      break L15;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                gb.a(true, 5, -128);
                                break L13;
                              }
                            }
                            L16: {
                              lk.field_e = lk.field_e + oa.field_m * 100;
                              ic.field_t = ic.field_t - 100 * oa.field_m;
                              if (-8 != (kb.field_b ^ -1)) {
                                break L16;
                              } else {
                                lk.field_e = lk.field_e + 5000;
                                ic.field_t = ic.field_t - 5000;
                                break L16;
                              }
                            }
                            me.a(false);
                            gb.a(true, 6, -128);
                            pk.a((byte) -96, 5, false);
                            break L13;
                          }
                          vk.field_p = 0;
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                }
              }
              if (jg.field_b > 0) {
                jg.field_b = jg.field_b - 1;
                break L10;
              } else {
                break L10;
              }
            }
            L17: {
              if (param0) {
                break L17;
              } else {
                field_j = (String) null;
                break L17;
              }
            }
            L18: {
              cb.field_a = 15 * cb.field_a / 16 + -1;
              if (0 >= ia.field_hb) {
                break L18;
              } else {
                if (0 == (kd.field_a ^ -1)) {
                  L19: {
                    L20: {
                      ia.field_hb = ia.field_hb + 1;
                      if (50 >= ia.field_hb) {
                        break L20;
                      } else {
                        if (7 > kb.field_b) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (-101 <= (ia.field_hb ^ -1)) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                  ia.field_hb = 0;
                  vk.field_p = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L21: {
              if (cb.field_a >= 0) {
                break L21;
              } else {
                cb.field_a = 0;
                break L21;
              }
            }
            L22: {
              if (0 <= ve.field_b) {
                pl.field_a = 0;
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              if ((cb.field_a ^ -1) <= -129) {
                break L23;
              } else {
                if (0 >= vk.field_p) {
                  break L23;
                } else {
                  cb.field_a = 128;
                  break L23;
                }
              }
            }
            L24: {
              if (-1 > (pl.field_a ^ -1)) {
                ci.field_ib = 256;
                ic.field_t = ic.field_t - pl.field_a;
                lk.field_e = lk.field_e + pl.field_a;
                pl.field_a = 0;
                me.a(false);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              ci.field_ib = 15 * ci.field_ib / 16 - 1;
              if (-1 >= (ci.field_ib ^ -1)) {
                break L25;
              } else {
                ci.field_ib = 0;
                break L25;
              }
            }
            L26: {
              if (0 >= fg.field_a) {
                break L26;
              } else {
                fg.field_a = fg.field_a - 1;
                if (0 >= fg.field_a) {
                  bi.field_h = bi.field_h - 1;
                  if ((bi.field_h ^ -1) < -1) {
                    fg.field_a = 500;
                    break L26;
                  } else {
                    break L26;
                  }
                } else {
                  break L26;
                }
              }
            }
            L27: {
              if (ci.field_ib < 128) {
                ci.field_ib = 128;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (vk.field_p < 25) {
                break L28;
              } else {
                if ((bi.field_h ^ -1) > -3) {
                  fg.field_a = 500;
                  bi.field_h = 2;
                  mb.a(param0, 1, 256);
                  break L28;
                } else {
                  break L28;
                }
              }
            }
            L29: {
              if (-11 >= (vk.field_p ^ -1)) {
                fg.field_a = 500;
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (vk.field_p < 10) {
                break L30;
              } else {
                if ((bi.field_h ^ -1) > -2) {
                  fg.field_a = 1500;
                  bi.field_h = 1;
                  mb.a(param0, 0, 256);
                  break L30;
                } else {
                  break L30;
                }
              }
            }
            L31: {
              if (pg.field_e) {
                vk.field_p = 0;
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              L33: {
                L34: {
                  if (!pg.field_e) {
                    break L34;
                  } else {
                    if ((kd.field_a ^ -1) != 0) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                }
                if (0 > ve.field_b) {
                  break L32;
                } else {
                  break L33;
                }
              }
              lk.field_b = 0;
              break L32;
            }
            L35: {
              if (qh.field_a[kb.field_b] <= lk.field_b) {
                break L35;
              } else {
                L36: {
                  if (kd.field_a == -1) {
                    break L36;
                  } else {
                    if (!pg.field_e) {
                      break L35;
                    } else {
                      break L36;
                    }
                  }
                }
                mf.field_A = mf.field_A + 1;
                break L35;
              }
            }
            L37: {
              if (uf.field_p <= 0) {
                break L37;
              } else {
                if (200 <= wc.field_c) {
                  break L37;
                } else {
                  wc.field_c = wc.field_c + 1;
                  break L37;
                }
              }
            }
            L38: {
              if (!pg.field_e) {
                break L38;
              } else {
                if (-1 == kd.field_a) {
                  L39: {
                    if (ve.field_b >= 0) {
                      break L39;
                    } else {
                      if (of.field_g > 50) {
                        k.field_c = k.field_c + 1;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                  }
                  L40: {
                    of.field_g = of.field_g + 1;
                    if (-51 <= (of.field_g ^ -1)) {
                      discarded$2 = m.a(10, -ea.field_p[kb.field_b] + (720 + bk.a(128, jb.field_g, (byte) 47)) - 64 << 1226965956, bk.a(128, jb.field_g, (byte) -46) + -64 << -2060847036, (byte) -6, 0, 0);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    if (50 >= of.field_g) {
                      break L41;
                    } else {
                      L42: {
                        if (-2 == (hg.field_F ^ -1)) {
                          break L42;
                        } else {
                          if (fh.field_d[84]) {
                            break L42;
                          } else {
                            if (fh.field_d[83]) {
                              break L42;
                            } else {
                              break L41;
                            }
                          }
                        }
                      }
                      of.field_g = 501;
                      break L41;
                    }
                  }
                  if (of.field_g > 500) {
                    L43: {
                      uf.field_p = uf.field_p - 1;
                      if ((kb.field_b ^ -1) == -8) {
                        break L43;
                      } else {
                        if (0 > uf.field_p) {
                          break L43;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L44: {
                      kh.field_d = 255;
                      if (il.b(507)) {
                        gb.a(true, 8, -128);
                        break L44;
                      } else {
                        ah.b(true);
                        kh.field_c = null;
                        if (jl.field_d != 0) {
                          gb.a(true, 7, -127);
                          break L44;
                        } else {
                          gb.a(true, 2, -128);
                          break L44;
                        }
                      }
                    }
                    L45: {
                      if ((ob.field_l ^ -1) >= -1) {
                        stackOut_141_0 = 9;
                        stackIn_142_0 = stackOut_141_0;
                        break L45;
                      } else {
                        stackOut_140_0 = 0;
                        stackIn_142_0 = stackOut_140_0;
                        break L45;
                      }
                    }
                    fb.field_c = stackIn_142_0;
                    var2 = 0;
                    L46: while (true) {
                      if (var2 >= kf.field_G.length) {
                        ve.field_b = 240;
                        pk.a((byte) -96, 4, false);
                        break L38;
                      } else {
                        kf.field_G[var2] = null;
                        var2++;
                        continue L46;
                      }
                    }
                  } else {
                    break L38;
                  }
                } else {
                  break L38;
                }
              }
            }
            L47: {
              if (ve.field_b < 0) {
                break L47;
              } else {
                lk.field_b = 0;
                break L47;
              }
            }
            L48: {
              if (!pg.field_e) {
                of.field_g = 0;
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              L50: {
                if (0 == (kd.field_a ^ -1)) {
                  break L50;
                } else {
                  if (pg.field_e) {
                    break L50;
                  } else {
                    if (-1 >= (ve.field_b ^ -1)) {
                      break L50;
                    } else {
                      break L49;
                    }
                  }
                }
              }
              L51: {
                if (100 >= mf.field_A) {
                  break L51;
                } else {
                  L52: {
                    if (!pg.field_e) {
                      break L52;
                    } else {
                      L53: {
                        if (-1 == kd.field_a) {
                          break L53;
                        } else {
                          if (pg.field_e) {
                            break L52;
                          } else {
                            break L53;
                          }
                        }
                      }
                      if (ve.field_b >= 0) {
                        break L52;
                      } else {
                        break L51;
                      }
                    }
                  }
                  L54: {
                    var2 = bk.a(5, jb.field_g, (byte) -52);
                    if (-1 != (kb.field_b ^ -1)) {
                      break L54;
                    } else {
                      if (-1 == (var2 ^ -1)) {
                        var2 = 1;
                        break L54;
                      } else {
                        break L54;
                      }
                    }
                  }
                  L55: {
                    if (0 != kb.field_b) {
                      break L55;
                    } else {
                      if ((var2 ^ -1) <= -4) {
                        var2 = 1;
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                  }
                  L56: {
                    if (kb.field_b != 1) {
                      break L56;
                    } else {
                      if (var2 < 4) {
                        break L56;
                      } else {
                        var2 = 2;
                        break L56;
                      }
                    }
                  }
                  L57: {
                    if (ib.field_h >= kb.field_b) {
                      break L57;
                    } else {
                      if (bk.a(2, jb.field_g, (byte) 76) != 0) {
                        break L57;
                      } else {
                        if (qh.field_a[kb.field_b] - 50 >= lk.field_b) {
                          break L57;
                        } else {
                          if (0 >= kb.field_b) {
                            break L57;
                          } else {
                            var2 = 5;
                            break L57;
                          }
                        }
                      }
                    }
                  }
                  L58: {
                    if (-1 + (qh.field_a[kb.field_b] + -lk.field_b) >= var2) {
                      break L58;
                    } else {
                      var2 = -1 + -lk.field_b + qh.field_a[kb.field_b];
                      break L58;
                    }
                  }
                  L59: {
                    if (var2 >= 0) {
                      break L59;
                    } else {
                      var2 = 0;
                      break L59;
                    }
                  }
                  L60: {
                    var3 = 1;
                    if (0 != var2) {
                      break L60;
                    } else {
                      L61: {
                        if (!pg.field_e) {
                          lk.field_b = lk.field_b + 1;
                          break L61;
                        } else {
                          break L61;
                        }
                      }
                      mf.field_A = mf.field_A - (25 + kb.field_b);
                      var3 = 64;
                      break L60;
                    }
                  }
                  L62: {
                    if (var2 == 1) {
                      var3 = 32;
                      mf.field_A = mf.field_A - (30 - -(2 * kb.field_b));
                      if (!pg.field_e) {
                        lk.field_b = lk.field_b + 2;
                        break L62;
                      } else {
                        break L62;
                      }
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    if (var2 != 2) {
                      break L63;
                    } else {
                      var3 = 24;
                      mf.field_A = mf.field_A - (kb.field_b * 3 + 35);
                      if (!pg.field_e) {
                        lk.field_b = lk.field_b + 3;
                        break L63;
                      } else {
                        break L63;
                      }
                    }
                  }
                  L64: {
                    if (3 != var2) {
                      break L64;
                    } else {
                      L65: {
                        var3 = 16;
                        if (pg.field_e) {
                          break L65;
                        } else {
                          lk.field_b = lk.field_b + 4;
                          break L65;
                        }
                      }
                      mf.field_A = mf.field_A - (40 + 4 * kb.field_b);
                      break L64;
                    }
                  }
                  L66: {
                    if (4 == var2) {
                      L67: {
                        var3 = 8;
                        if (pg.field_e) {
                          break L67;
                        } else {
                          lk.field_b = lk.field_b + 5;
                          break L67;
                        }
                      }
                      mf.field_A = mf.field_A - (45 - -(5 * kb.field_b));
                      break L66;
                    } else {
                      break L66;
                    }
                  }
                  L68: {
                    if ((var2 ^ -1) == -6) {
                      ib.field_h = ib.field_h + 1;
                      mf.field_A = mf.field_A - (kb.field_b * 5 + 50);
                      var3 = 8;
                      if (pg.field_e) {
                        break L68;
                      } else {
                        lk.field_b = lk.field_b + 6;
                        break L68;
                      }
                    } else {
                      break L68;
                    }
                  }
                  L69: {
                    if (kb.field_b == 0) {
                      var3 -= 8;
                      break L69;
                    } else {
                      break L69;
                    }
                  }
                  L70: {
                    var3 = var3 + kb.field_b;
                    var4 = -640 + bk.a(1280, jb.field_g, (byte) 91) << 1816205508;
                    var5 = -2048;
                    var6 = (bk.a(1280, jb.field_g, (byte) 51) - 640 << 1219100612) * (-kb.field_b + 7) / 7;
                    if ((var2 ^ -1) == -6) {
                      var6 = 0;
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                  L71: {
                    if (-1 < (ve.field_b ^ -1)) {
                      break L71;
                    } else {
                      L72: {
                        if (var4 >= 0) {
                          stackOut_218_0 = var6 / 5 - 5120;
                          stackIn_219_0 = stackOut_218_0;
                          break L72;
                        } else {
                          stackOut_217_0 = -5120 + var6 / 3;
                          stackIn_219_0 = stackOut_217_0;
                          break L72;
                        }
                      }
                      var6 = stackIn_219_0;
                      break L71;
                    }
                  }
                  var7 = 11520;
                  var8 = var6 + -var4;
                  var9 = var7 - var5;
                  var10 = (int)Math.sqrt((double)(var8 * var8 - -(var9 * var9)));
                  discarded$3 = m.a(var2 + 25, var5, var4, (byte) -6, var9 * var3 / var10, var3 * var8 / var10);
                  break L51;
                }
              }
              L73: {
                if (-1 <= (f.field_d ^ -1)) {
                  break L73;
                } else {
                  f.field_d = f.field_d - 1;
                  break L73;
                }
              }
              L74: {
                vk.b((byte) -126);
                if (!pg.field_e) {
                  break L74;
                } else {
                  if ((f.field_d ^ -1) < -1) {
                    pg.field_e = false;
                    break L74;
                  } else {
                    break L74;
                  }
                }
              }
              if (!pg.field_e) {
                break L49;
              } else {
                if (0 < uf.field_p) {
                  f.field_d = 250;
                  uf.field_p = uf.field_p - 1;
                  pg.field_e = false;
                  break L49;
                } else {
                  break L49;
                }
              }
            }
            L75: {
              L76: {
                if (pg.field_e) {
                  break L76;
                } else {
                  if (-1 != kd.field_a) {
                    break L76;
                  } else {
                    break L75;
                  }
                }
              }
              si.field_E = (si.field_E * 9 - -240) / 10;
              wd.field_c = 9 * wd.field_c / 10;
              break L75;
            }
            L77: {
              L78: {
                L79: {
                  if (pg.field_e) {
                    break L79;
                  } else {
                    if ((kd.field_a ^ -1) == 0) {
                      break L78;
                    } else {
                      break L79;
                    }
                  }
                }
                if (ve.field_b < 0) {
                  break L77;
                } else {
                  break L78;
                }
              }
              L80: {
                var2 = gb.field_j;
                if (-1 >= (var2 ^ -1)) {
                  break L80;
                } else {
                  var2 = 0;
                  break L80;
                }
              }
              L81: {
                var3 = ad.field_m;
                if (640 <= var2) {
                  var2 = 639;
                  break L81;
                } else {
                  break L81;
                }
              }
              L82: {
                if (var3 < 0) {
                  var3 = 0;
                  break L82;
                } else {
                  break L82;
                }
              }
              L83: {
                if (-481 >= (var3 ^ -1)) {
                  var3 = 479;
                  break L83;
                } else {
                  break L83;
                }
              }
              L84: {
                if (kd.field_a != -1) {
                  break L84;
                } else {
                  L85: {
                    if (0 > (gb.field_j ^ -1)) {
                      break L85;
                    } else {
                      if (0 == wb.field_c) {
                        break L84;
                      } else {
                        break L85;
                      }
                    }
                  }
                  si.field_E = (var3 / 2 + 9 * si.field_E) / 10;
                  wd.field_c = (9 * wd.field_c + (var2 + -320)) / 10;
                  break L84;
                }
              }
              be.c(false);
              break L77;
            }
            L86: {
              if (kd.field_a != -1) {
                break L86;
              } else {
                L87: while (true) {
                  if (!wk.a((byte) -56)) {
                    break L86;
                  } else {
                    if (13 == el.field_n) {
                      if (pg.field_e) {
                        f.field_d = 0;
                        of.field_g = 500;
                        continue L87;
                      } else {
                        gb.a(true, 1, -128);
                        continue L87;
                      }
                    } else {
                      continue L87;
                    }
                  }
                }
              }
            }
            L88: {
              if (!fh.field_d[82]) {
                break L88;
              } else {
                if (el.field_n != 80) {
                  break L88;
                } else {
                  if (pg.field_e) {
                    break L88;
                  } else {
                    if (-1 != kd.field_a) {
                      break L88;
                    } else {
                      if ((lh.field_s ^ -1) > -3) {
                        break L88;
                      } else {
                        L89: {
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
                            break L89;
                          } else {
                            L90: {
                              lk.field_e = lk.field_e + oa.field_m * 100;
                              ic.field_t = ic.field_t - (oa.field_m * 100 + 5000);
                              lk.field_e = lk.field_e + 5000;
                              me.a(false);
                              if (!il.b(507)) {
                                ah.b(param0);
                                kh.field_c = null;
                                break L90;
                              } else {
                                break L90;
                              }
                            }
                            gb.a(true, 6, -127);
                            pk.a((byte) -96, 5, false);
                            break L89;
                          }
                        }
                        lk.field_f = 0;
                        break L88;
                      }
                    }
                  }
                }
              }
            }
            L91: {
              if (2 > lh.field_s) {
                break L91;
              } else {
                if (fh.field_d[32]) {
                  ic.field_t = ic.field_t - 1;
                  fg.field_a = 500;
                  lc.field_p = lc.field_p + 1;
                  oa.field_n = true;
                  bi.field_h = 1;
                  break L91;
                } else {
                  break L91;
                }
              }
            }
            L92: {
              if ((lh.field_s ^ -1) > -3) {
                break L92;
              } else {
                if (!fh.field_d[33]) {
                  break L92;
                } else {
                  bi.field_h = 2;
                  oa.field_n = true;
                  fg.field_a = 500;
                  ic.field_t = ic.field_t - 1;
                  lc.field_p = lc.field_p + 1;
                  break L92;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "hb.J(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        field_j = null;
        field_m = null;
        field_l = null;
        if (!param0) {
            field_l = (String) null;
        }
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
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
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
            try {
              L1: {
                L2: {
                  if ((this.field_e + (long)param2 ^ -1L) >= (this.field_i ^ -1L)) {
                    break L2;
                  } else {
                    this.field_i = (long)param2 + this.field_e;
                    break L2;
                  }
                }
                L3: {
                  if (this.field_d == -1L) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_e ^ -1L) > (this.field_d ^ -1L)) {
                        break L4;
                      } else {
                        if ((this.field_d - -(long)this.field_c ^ -1L) <= (this.field_e ^ -1L)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.b(param1 ^ -20344);
                    break L3;
                  }
                }
                L5: {
                  if ((this.field_d ^ -1L) == 0L) {
                    break L5;
                  } else {
                    if (this.field_d - -(long)this.field_g.length < (long)param2 + this.field_e) {
                      var5_int = (int)((long)this.field_g.length + (this.field_d + -this.field_e));
                      fk.a(param0, param3, this.field_g, (int)(this.field_e - this.field_d), var5_int);
                      param2 = param2 - var5_int;
                      this.field_e = this.field_e + (long)var5_int;
                      param3 = param3 + var5_int;
                      this.field_c = this.field_g.length;
                      this.b(116);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (this.field_g.length < param2) {
                  L6: {
                    if ((this.field_e ^ -1L) == (this.field_a ^ -1L)) {
                      break L6;
                    } else {
                      this.field_o.a(this.field_e, (byte) 116);
                      this.field_a = this.field_e;
                      break L6;
                    }
                  }
                  L7: {
                    this.field_o.a(param2, param0, -1, param3);
                    this.field_a = this.field_a + (long)param2;
                    if ((this.field_b ^ -1L) <= (this.field_a ^ -1L)) {
                      break L7;
                    } else {
                      this.field_b = this.field_a;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var5_long = -1L;
                      var7 = -1L;
                      if ((this.field_f ^ -1L) < (this.field_e ^ -1L)) {
                        break L9;
                      } else {
                        if ((long)this.field_h + this.field_f > this.field_e) {
                          var5_long = this.field_e;
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((this.field_f ^ -1L) > (this.field_e ^ -1L)) {
                      break L8;
                    } else {
                      if (this.field_e + (long)param2 <= this.field_f) {
                        break L8;
                      } else {
                        var5_long = this.field_f;
                        break L8;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (this.field_f >= (long)param2 + this.field_e) {
                        break L11;
                      } else {
                        if ((this.field_f - -(long)this.field_h ^ -1L) > (this.field_e - -(long)param2 ^ -1L)) {
                          break L11;
                        } else {
                          var7 = (long)param2 + this.field_e;
                          break L10;
                        }
                      }
                    }
                    if (this.field_e >= (long)this.field_h + this.field_f) {
                      break L10;
                    } else {
                      if (this.field_f - -(long)this.field_h > (long)param2 + this.field_e) {
                        break L10;
                      } else {
                        var7 = this.field_f + (long)this.field_h;
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if ((var5_long ^ -1L) >= 0L) {
                      break L12;
                    } else {
                      if ((var7 ^ -1L) >= (var5_long ^ -1L)) {
                        break L12;
                      } else {
                        var9 = (int)(-var5_long + var7);
                        fk.a(param0, (int)(-this.field_e + (var5_long + (long)param3)), this.field_k, (int)(-this.field_f + var5_long), var9);
                        break L12;
                      }
                    }
                  }
                  this.field_e = this.field_e + (long)param2;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L13: {
                    if (param1 == -20291) {
                      break L13;
                    } else {
                      this.field_k = (byte[]) null;
                      break L13;
                    }
                  }
                  if (param2 <= 0) {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  } else {
                    L14: {
                      if ((this.field_d ^ -1L) == 0L) {
                        this.field_d = this.field_e;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      fk.a(param0, param3, this.field_g, (int)(-this.field_d + this.field_e), param2);
                      this.field_e = this.field_e + (long)param2;
                      if (-this.field_d + this.field_e > (long)this.field_c) {
                        this.field_c = (int)(this.field_e + -this.field_d);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (IOException) (Object) decompiledCaughtException;
              this.field_a = -1L;
              throw var5;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var5_ref);
            stackOut_49_1 = new StringBuilder().append("hb.F(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L16;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L16;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
            if (param0 <= 3) {
            }
            this.b(param1, -90, 0, param1.length);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "hb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) {
        if (param0 != 33) {
            this.field_c = 27;
        }
        return this.field_i;
    }

    private final void b(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          if ((this.field_d ^ -1L) == 0L) {
            break L0;
          } else {
            L1: {
              if ((this.field_d ^ -1L) == (this.field_a ^ -1L)) {
                break L1;
              } else {
                this.field_o.a(this.field_d, (byte) 72);
                this.field_a = this.field_d;
                break L1;
              }
            }
            L2: {
              this.field_o.a(this.field_c, this.field_g, -1, 0);
              this.field_a = this.field_a + (long)this.field_c;
              if ((this.field_b ^ -1L) > (this.field_a ^ -1L)) {
                this.field_b = this.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if ((this.field_f ^ -1L) < (this.field_d ^ -1L)) {
                  break L4;
                } else {
                  if (((long)this.field_h + this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
                    break L4;
                  } else {
                    var2 = this.field_d;
                    break L3;
                  }
                }
              }
              if ((this.field_f ^ -1L) > (this.field_d ^ -1L)) {
                break L3;
              } else {
                if (this.field_d - -(long)this.field_c > this.field_f) {
                  var2 = this.field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (((long)this.field_c + this.field_d ^ -1L) >= (this.field_f ^ -1L)) {
                  break L6;
                } else {
                  if ((long)this.field_h + this.field_f < this.field_d + (long)this.field_c) {
                    break L6;
                  } else {
                    var4 = this.field_d + (long)this.field_c;
                    break L5;
                  }
                }
              }
              if (((long)this.field_h + this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
                break L5;
              } else {
                if (((long)this.field_h + this.field_f ^ -1L) < (this.field_d + (long)this.field_c ^ -1L)) {
                  break L5;
                } else {
                  var4 = (long)this.field_h + this.field_f;
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
                  fk.a(this.field_g, (int)(var2 - this.field_d), this.field_k, (int)(var2 + -this.field_f), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            this.field_c = 0;
            this.field_d = -1L;
            break L0;
          }
        }
        L8: {
          if (param0 > 31) {
            break L8;
          } else {
            this.field_a = -125L;
            break L8;
          }
        }
    }

    hb(sg param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_d = -1L;
        this.field_f = -1L;
        this.field_c = 0;
        try {
            this.field_o = param0;
            dupTemp$0 = param0.a(-1);
            this.field_b = dupTemp$0;
            this.field_i = dupTemp$0;
            this.field_e = 0L;
            this.field_g = new byte[param2];
            this.field_k = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "achievements to collect";
        field_m = new String[]{"Order of the Moon", "Order of the Planet", "Order of the System", "Order of the Galaxy", "Order of the Universe", "Solar Squire", "Solar Knight", "Solar Prince", "Solar King", "Combo Bonus", "Combo Collector", "Combo Champion", "Mega Bonus", "Mega Collector", "Mega Champion", "Ultimate Bonus"};
        field_j = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_n = 0.0;
    }
}
