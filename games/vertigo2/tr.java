/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    private int field_N;
    private nj field_z;
    private wo[][] field_K;
    boolean field_i;
    static cr field_l;
    private boolean[] field_p;
    private long field_j;
    private int field_x;
    private bh field_m;
    int field_s;
    private int field_k;
    private int[] field_q;
    private boolean field_A;
    private int[] field_L;
    private int field_v;
    private int field_y;
    static String field_O;
    private int field_M;
    static String field_d;
    private er field_b;
    static String field_e;
    private boolean field_g;
    private am field_G;
    lj field_D;
    private int field_u;
    private int field_t;
    private boolean field_o;
    private float field_I;
    private int field_C;
    static int field_f;
    private float field_E;
    private hd field_a;
    private boolean field_w;
    private int field_r;
    int field_h;
    private boolean[] field_F;
    int field_B;
    private int field_J;
    private boolean field_c;
    private int field_n;
    private int field_H;

    private final void a(int param0, int param1, int param2) {
        int var6 = 0;
        if (param0 != 1220) {
            return;
        }
        int var4 = 1 << param1;
        if ((ml.field_z & var4) != 0) {
            return;
        }
        ml.field_z = ml.field_z | var4;
        int var5 = param1;
        if (ln.field_d != null) {
            if ((ln.field_d.field_B ^ -1) <= -1) {
                if (null == oe.field_pb) {
                    var6 = (1 << var5 & qr.field_j) != 0 ? 1 : 0;
                    if (var6 == 0) {
                        qr.field_j = qr.field_j | 1 << var5;
                        sk.field_b = sk.field_b - (1 << var5);
                    }
                }
            }
        }
        jq.field_e = jq.field_e | var4;
        bg.field_b.a(new fa(param1), false);
        if (!(this.field_c)) {
            fg.field_eb.a(new nf(param1, param2, qr.field_j, sk.field_b, re.field_j, ki.field_c), false);
        }
    }

    final void b(int param0, int param1) {
        uh.field_Wb.j(64, 122);
        uh.field_Wb.f(22, 119);
        uh.field_Wb.f(1, -98);
        uh.field_Wb.f(param0, param1 + 24174);
        uh.field_Wb.e(this.field_D.field_l[this.field_B].field_H, param1 ^ param1);
        uh.field_Wb.e(mc.field_e, param1 ^ -24066);
        uh.field_Wb.e(sl.field_l, param1 + 24066);
        uh.field_Wb.e(ci.field_b, param1 ^ -24066);
        uh.field_Wb.e(lj.field_k, 0);
    }

    final void b(int param0) {
        if (param0 != -27588) {
            this.e(-118);
        }
        if (!(this.field_o)) {
            throw new IllegalStateException();
        }
        uh.field_Wb.j(61, param0 + 27710);
    }

    final void b(boolean param0) {
        if (!this.field_o) {
            throw new IllegalStateException();
        }
        uh.field_Wb.j(60, 123);
        if (!param0) {
            this.e(113);
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_O = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_e = null;
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        long var5_long = 0L;
        int var6 = 0;
        long var7_long = 0L;
        int var7 = 0;
        long var9 = 0L;
        float var11 = 0.0f;
        int var12 = 0;
        mi var13 = null;
        int stackIn_7_0 = 0;
        int stackIn_128_0 = 0;
        am stackIn_212_0 = null;
        bh stackIn_212_1 = null;
        int stackIn_212_2 = 0;
        am stackIn_213_0 = null;
        bh stackIn_213_1 = null;
        int stackIn_213_2 = 0;
        am stackIn_214_0 = null;
        bh stackIn_214_1 = null;
        int stackIn_214_2 = 0;
        am stackIn_215_0 = null;
        bh stackIn_215_1 = null;
        int stackIn_215_2 = 0;
        am stackIn_216_0 = null;
        bh stackIn_216_1 = null;
        int stackIn_216_2 = 0;
        am stackIn_217_0 = null;
        bh stackIn_217_1 = null;
        int stackIn_217_2 = 0;
        int stackIn_217_3 = 0;
        hd stackIn_251_0 = null;
        hd stackIn_252_0 = null;
        hd stackIn_253_0 = null;
        int stackIn_253_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        am stackOut_211_0 = null;
        bh stackOut_211_1 = null;
        int stackOut_211_2 = 0;
        am stackOut_212_0 = null;
        bh stackOut_212_1 = null;
        int stackOut_212_2 = 0;
        am stackOut_213_0 = null;
        bh stackOut_213_1 = null;
        int stackOut_213_2 = 0;
        am stackOut_214_0 = null;
        bh stackOut_214_1 = null;
        int stackOut_214_2 = 0;
        am stackOut_216_0 = null;
        bh stackOut_216_1 = null;
        int stackOut_216_2 = 0;
        int stackOut_216_3 = 0;
        am stackOut_215_0 = null;
        bh stackOut_215_1 = null;
        int stackOut_215_2 = 0;
        int stackOut_215_3 = 0;
        hd stackOut_250_0 = null;
        hd stackOut_252_0 = null;
        int stackOut_252_1 = 0;
        hd stackOut_251_0 = null;
        int stackOut_251_1 = 0;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          if ((this.field_B ^ -1) <= -1) {
            L1: {
              if (!this.field_o) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_7_0;
              var4 = this.field_D.field_l[this.field_B].field_W;
              if (var3 != 0) {
                var4 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!ln.field_d.field_c) {
                L4: {
                  var5 = (de.field_f ^ ln.field_d.field_s) % 8;
                  if (0 != var5) {
                    if (1 != var5) {
                      if (-3 == (var5 ^ -1)) {
                        gi.field_u = gi.field_u - aj.field_e;
                        c.field_h = c.field_h + 1;
                        break L4;
                      } else {
                        if ((var5 ^ -1) != -4) {
                          if (-5 == (var5 ^ -1)) {
                            c.field_h = c.field_h + 1;
                            pn.field_R = pn.field_R + aj.field_e;
                            break L4;
                          } else {
                            if ((var5 ^ -1) == -6) {
                              pn.field_R = pn.field_R + c.field_h;
                              aj.field_e = aj.field_e + 1;
                              break L4;
                            } else {
                              if (var5 != 6) {
                                if (7 == var5) {
                                  pn.field_R = pn.field_R - c.field_h;
                                  aj.field_e = aj.field_e - 1;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                pn.field_R = pn.field_R - aj.field_e;
                                c.field_h = c.field_h - 1;
                                break L4;
                              }
                            }
                          }
                        } else {
                          gi.field_u = gi.field_u - c.field_h;
                          aj.field_e = aj.field_e + 1;
                          break L4;
                        }
                      }
                    } else {
                      gi.field_u = gi.field_u + c.field_h;
                      aj.field_e = aj.field_e - 1;
                      break L4;
                    }
                  } else {
                    c.field_h = c.field_h - 1;
                    gi.field_u = gi.field_u + aj.field_e;
                    break L4;
                  }
                }
                L5: {
                  var5 = (ln.field_d.field_s ^ de.field_f - -var4) % 5;
                  if (0 == var5) {
                    qr.field_j = qr.field_j | ki.field_c + sk.field_b << 1159385713;
                    break L5;
                  } else {
                    if (1 == var5) {
                      sk.field_b = sk.field_b + re.field_j;
                      ki.field_c = ki.field_c + 1;
                      break L5;
                    } else {
                      if (2 == var5) {
                        ki.field_c = ki.field_c - 1;
                        sk.field_b = sk.field_b - re.field_j;
                        break L5;
                      } else {
                        if (-4 == (var5 ^ -1)) {
                          re.field_j = re.field_j + 1;
                          sk.field_b = sk.field_b + ki.field_c;
                          break L5;
                        } else {
                          if ((var5 ^ -1) != -5) {
                            break L5;
                          } else {
                            re.field_j = re.field_j - 1;
                            sk.field_b = sk.field_b - ki.field_c;
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  var5 = (gi.field_u - -(de.field_f * aj.field_e)) % 8;
                  if (0 == var5) {
                    df.field_k = df.field_k - 1;
                    f.field_B = f.field_B - ca.field_g;
                    break L6;
                  } else {
                    if (var5 == 1) {
                      f.field_B = f.field_B - df.field_k;
                      ca.field_g = ca.field_g - 1;
                      break L6;
                    } else {
                      if (var5 != 2) {
                        if (3 != var5) {
                          if (var5 != 4) {
                            if ((var5 ^ -1) == -6) {
                              hj.field_c = hj.field_c + df.field_k;
                              ca.field_g = ca.field_g + 1;
                              break L6;
                            } else {
                              if (-7 == (var5 ^ -1)) {
                                df.field_k = df.field_k - 1;
                                hj.field_c = hj.field_c - ca.field_g;
                                break L6;
                              } else {
                                if (-8 == (var5 ^ -1)) {
                                  ca.field_g = ca.field_g - 1;
                                  hj.field_c = hj.field_c - df.field_k;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          } else {
                            df.field_k = df.field_k + 1;
                            hj.field_c = hj.field_c + ca.field_g;
                            break L6;
                          }
                        } else {
                          ca.field_g = ca.field_g + 1;
                          f.field_B = f.field_B + df.field_k;
                          break L6;
                        }
                      } else {
                        f.field_B = f.field_B + ca.field_g;
                        df.field_k = df.field_k + 1;
                        break L6;
                      }
                    }
                  }
                }
                if (0 == var5) {
                  mc.field_e = mc.field_e - ci.field_b;
                  sl.field_l = sl.field_l - 1;
                  break L3;
                } else {
                  if (1 != var5) {
                    if (var5 != 2) {
                      if (-4 != (var5 ^ -1)) {
                        if (var5 == 4) {
                          lj.field_k = lj.field_k + ci.field_b;
                          sl.field_l = sl.field_l + 1;
                          break L3;
                        } else {
                          if ((var5 ^ -1) != -6) {
                            if ((var5 ^ -1) == -7) {
                              lj.field_k = lj.field_k - ci.field_b;
                              sl.field_l = sl.field_l - 1;
                              break L3;
                            } else {
                              if ((var5 ^ -1) == -8) {
                                lj.field_k = lj.field_k - sl.field_l;
                                ci.field_b = ci.field_b - 1;
                                break L3;
                              } else {
                                if (this.field_D.field_r.h(9979) != 0) {
                                  break L0;
                                } else {
                                  if (-101 >= (this.field_D.field_r.field_n ^ -1)) {
                                    break L0;
                                  } else {
                                    bm.a(rf.field_o, false, 4);
                                    break L0;
                                  }
                                }
                              }
                            }
                          } else {
                            ci.field_b = ci.field_b + 1;
                            lj.field_k = lj.field_k + sl.field_l;
                            break L3;
                          }
                        }
                      } else {
                        ci.field_b = ci.field_b + 1;
                        mc.field_e = mc.field_e + sl.field_l;
                        break L3;
                      }
                    } else {
                      mc.field_e = mc.field_e + ci.field_b;
                      sl.field_l = sl.field_l + 1;
                      break L3;
                    }
                  } else {
                    mc.field_e = mc.field_e - sl.field_l;
                    ci.field_b = ci.field_b - 1;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            if (this.field_D.field_r.h(9979) != 0) {
              break L0;
            } else {
              if (-101 >= (this.field_D.field_r.field_n ^ -1)) {
                break L0;
              } else {
                bm.a(rf.field_o, false, 4);
                break L0;
              }
            }
          } else {
            if (this.field_D.field_r.h(9979) != 0) {
              break L0;
            } else {
              if (-101 >= (this.field_D.field_r.field_n ^ -1)) {
                break L0;
              } else {
                bm.a(rf.field_o, false, 4);
                break L0;
              }
            }
          }
        }
        L7: {
          var3 = this.field_D.b(-6133);
          if (null != fo.field_e) {
            break L7;
          } else {
            if (-2 == (this.field_D.field_r.h(9979) ^ -1)) {
              bm.a(up.field_B[var3 % up.field_B.length], false, 4);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          this.field_s = this.field_s - 1;
          if (this.field_s == 0) {
            this.field_y = this.field_y + (this.field_D.field_q + -this.field_N);
            this.field_s = 50;
            this.field_J = this.field_J + 1;
            this.field_N = this.field_D.field_q;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (!this.field_o) {
            this.field_E = 1.0f;
            break L9;
          } else {
            L10: {
              L11: {
                var4 = -this.field_M + this.field_u;
                if ((this.field_z.c(true) ^ -1) >= -1) {
                  break L11;
                } else {
                  if (var4 >= 10) {
                    this.a((pp) ((Object) this.field_z.b((byte) -43)), (byte) 11);
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              if (3 >= this.field_z.c(true)) {
                break L10;
              } else {
                L12: while (true) {
                  if ((this.field_z.c(true) ^ -1) >= -4) {
                    break L10;
                  } else {
                    this.a((pp) ((Object) this.field_z.b((byte) -43)), (byte) 11);
                    continue L12;
                  }
                }
              }
            }
            L13: {
              var5_long = gk.a(100);
              var7_long = var5_long - this.field_j;
              var9 = (long)(-400 + 20 * var4);
              if ((var9 ^ -1L) <= (var7_long ^ -1L)) {
                if (var9 > var7_long) {
                  this.field_E = this.field_E - 0.009999999776482582f;
                  break L13;
                } else {
                  if (this.field_E >= 1.0f) {
                    if (this.field_E > 1.0f) {
                      this.field_E = this.field_E - 0.009999999776482582f;
                      break L13;
                    } else {
                      break L13;
                    }
                  } else {
                    this.field_E = this.field_E + 0.009999999776482582f;
                    break L13;
                  }
                }
              } else {
                this.field_E = this.field_E + 0.009999999776482582f;
                break L13;
              }
            }
            L14: {
              var11 = -1.0f + this.field_E;
              if (var11 * var11 <= 0.00009999999747378752f) {
                this.field_E = 1.0f;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (this.field_E > 5.0f) {
                this.field_E = 5.0f;
                break L15;
              } else {
                break L15;
              }
            }
            if (this.field_E < 0.009999999776482582f) {
              this.field_E = 0.009999999776482582f;
              break L9;
            } else {
              break L9;
            }
          }
        }
        L16: {
          this.field_I = this.field_I + this.field_E;
          var4 = 0;
          if (param1) {
            break L16;
          } else {
            var13 = (mi) null;
            this.a((mi) null, 48);
            break L16;
          }
        }
        L17: {
          if (!param0) {
            break L17;
          } else {
            L18: {
              if (!this.field_o) {
                break L18;
              } else {
                if (il.field_a) {
                  break L18;
                } else {
                  break L18;
                }
              }
            }
            L19: {
              if (!tf.a((byte) 43)) {
                if (kf.field_c == 1) {
                  if (-1 >= (this.field_B ^ -1)) {
                    L20: {
                      if (!this.field_o) {
                        stackOut_127_0 = 0;
                        stackIn_128_0 = stackOut_127_0;
                        break L20;
                      } else {
                        stackOut_126_0 = 1;
                        stackIn_128_0 = stackOut_126_0;
                        break L20;
                      }
                    }
                    L21: {
                      var5 = stackIn_128_0;
                      var6 = this.field_D.field_l[this.field_B].field_W;
                      if (var5 != 0) {
                        var6 = 0;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    if (ln.field_d.field_c) {
                      break L19;
                    } else {
                      L22: {
                        var7 = (ln.field_d.field_s ^ de.field_f) % 8;
                        if (0 == var7) {
                          c.field_h = c.field_h - 1;
                          gi.field_u = gi.field_u + aj.field_e;
                          break L22;
                        } else {
                          if ((var7 ^ -1) == -2) {
                            gi.field_u = gi.field_u + c.field_h;
                            aj.field_e = aj.field_e - 1;
                            break L22;
                          } else {
                            if (-3 == (var7 ^ -1)) {
                              c.field_h = c.field_h + 1;
                              gi.field_u = gi.field_u - aj.field_e;
                              break L22;
                            } else {
                              if (var7 != 3) {
                                if ((var7 ^ -1) != -5) {
                                  if ((var7 ^ -1) == -6) {
                                    pn.field_R = pn.field_R + c.field_h;
                                    aj.field_e = aj.field_e + 1;
                                    break L22;
                                  } else {
                                    if (-7 != (var7 ^ -1)) {
                                      if (7 != var7) {
                                        break L22;
                                      } else {
                                        pn.field_R = pn.field_R - c.field_h;
                                        aj.field_e = aj.field_e - 1;
                                        break L22;
                                      }
                                    } else {
                                      pn.field_R = pn.field_R - aj.field_e;
                                      c.field_h = c.field_h - 1;
                                      break L22;
                                    }
                                  }
                                } else {
                                  c.field_h = c.field_h + 1;
                                  pn.field_R = pn.field_R + aj.field_e;
                                  break L22;
                                }
                              } else {
                                gi.field_u = gi.field_u - c.field_h;
                                aj.field_e = aj.field_e + 1;
                                break L22;
                              }
                            }
                          }
                        }
                      }
                      L23: {
                        var7 = (ln.field_d.field_s ^ var6 + de.field_f) % 5;
                        if (var7 != 0) {
                          if (-2 == (var7 ^ -1)) {
                            ki.field_c = ki.field_c + 1;
                            sk.field_b = sk.field_b + re.field_j;
                            break L23;
                          } else {
                            if (-3 != (var7 ^ -1)) {
                              if (3 != var7) {
                                if ((var7 ^ -1) != -5) {
                                  break L23;
                                } else {
                                  sk.field_b = sk.field_b - ki.field_c;
                                  re.field_j = re.field_j - 1;
                                  break L23;
                                }
                              } else {
                                sk.field_b = sk.field_b + ki.field_c;
                                re.field_j = re.field_j + 1;
                                break L23;
                              }
                            } else {
                              sk.field_b = sk.field_b - re.field_j;
                              ki.field_c = ki.field_c - 1;
                              break L23;
                            }
                          }
                        } else {
                          qr.field_j = qr.field_j | sk.field_b - -ki.field_c << -693906703;
                          break L23;
                        }
                      }
                      L24: {
                        var7 = (gi.field_u - -(de.field_f * aj.field_e)) % 8;
                        if (-1 == (var7 ^ -1)) {
                          f.field_B = f.field_B - ca.field_g;
                          df.field_k = df.field_k - 1;
                          break L24;
                        } else {
                          if ((var7 ^ -1) == -2) {
                            ca.field_g = ca.field_g - 1;
                            f.field_B = f.field_B - df.field_k;
                            break L24;
                          } else {
                            if (-3 != (var7 ^ -1)) {
                              if (var7 != 3) {
                                if (var7 == 4) {
                                  df.field_k = df.field_k + 1;
                                  hj.field_c = hj.field_c + ca.field_g;
                                  break L24;
                                } else {
                                  if (-6 != (var7 ^ -1)) {
                                    if (var7 != 6) {
                                      if (7 != var7) {
                                        break L24;
                                      } else {
                                        ca.field_g = ca.field_g - 1;
                                        hj.field_c = hj.field_c - df.field_k;
                                        break L24;
                                      }
                                    } else {
                                      df.field_k = df.field_k - 1;
                                      hj.field_c = hj.field_c - ca.field_g;
                                      break L24;
                                    }
                                  } else {
                                    ca.field_g = ca.field_g + 1;
                                    hj.field_c = hj.field_c + df.field_k;
                                    break L24;
                                  }
                                }
                              } else {
                                ca.field_g = ca.field_g + 1;
                                f.field_B = f.field_B + df.field_k;
                                break L24;
                              }
                            } else {
                              df.field_k = df.field_k + 1;
                              f.field_B = f.field_B + ca.field_g;
                              break L24;
                            }
                          }
                        }
                      }
                      if (0 != var7) {
                        if (1 == var7) {
                          ci.field_b = ci.field_b - 1;
                          mc.field_e = mc.field_e - sl.field_l;
                          break L19;
                        } else {
                          if (var7 == 2) {
                            sl.field_l = sl.field_l + 1;
                            mc.field_e = mc.field_e + ci.field_b;
                            break L19;
                          } else {
                            if ((var7 ^ -1) == -4) {
                              ci.field_b = ci.field_b + 1;
                              mc.field_e = mc.field_e + sl.field_l;
                              break L19;
                            } else {
                              if ((var7 ^ -1) == -5) {
                                lj.field_k = lj.field_k + ci.field_b;
                                sl.field_l = sl.field_l + 1;
                                break L19;
                              } else {
                                if (5 != var7) {
                                  if (var7 != 6) {
                                    if ((var7 ^ -1) != -8) {
                                      break L19;
                                    } else {
                                      lj.field_k = lj.field_k - sl.field_l;
                                      ci.field_b = ci.field_b - 1;
                                      break L19;
                                    }
                                  } else {
                                    sl.field_l = sl.field_l - 1;
                                    lj.field_k = lj.field_k - ci.field_b;
                                    break L19;
                                  }
                                } else {
                                  ci.field_b = ci.field_b + 1;
                                  lj.field_k = lj.field_k + sl.field_l;
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        mc.field_e = mc.field_e - ci.field_b;
                        sl.field_l = sl.field_l - 1;
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              } else {
                break L19;
              }
            }
            L25: {
              L26: {
                var5 = 0;
                if (!this.field_o) {
                  break L26;
                } else {
                  if (il.field_a) {
                    break L25;
                  } else {
                    if (tf.a((byte) 49)) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              L27: {
                L28: {
                  var6 = this.field_G.a((byte) -126);
                  if (cr.field_eb[s.field_y]) {
                    break L28;
                  } else {
                    if (cr.field_eb[am.field_t]) {
                      break L28;
                    } else {
                      break L27;
                    }
                  }
                }
                var5 = var5 | lp.field_B[(var6 + 0) % 4];
                break L27;
              }
              L29: {
                L30: {
                  if (cr.field_eb[ga.field_gb]) {
                    break L30;
                  } else {
                    if (cr.field_eb[od.field_Mb]) {
                      break L30;
                    } else {
                      break L29;
                    }
                  }
                }
                var5 = var5 | lp.field_B[(var6 + 2) % 4];
                break L29;
              }
              L31: {
                L32: {
                  if (cr.field_eb[q.field_u]) {
                    break L32;
                  } else {
                    if (!cr.field_eb[pn.field_O]) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                var5 = var5 | lp.field_B[(5 + var6) % 4];
                break L31;
              }
              L33: {
                if (cr.field_eb[t.field_g]) {
                  break L33;
                } else {
                  if (cr.field_eb[ii.field_E]) {
                    break L33;
                  } else {
                    break L25;
                  }
                }
              }
              var5 = var5 | lp.field_B[(var6 + 3) % 4];
              break L25;
            }
            var4 = this.field_C | var5 << 911385730;
            break L17;
          }
        }
        L34: {
          L35: {
            stackOut_211_0 = this.field_G;
            stackOut_211_1 = this.field_m;
            stackOut_211_2 = -120;
            stackIn_215_0 = stackOut_211_0;
            stackIn_215_1 = stackOut_211_1;
            stackIn_215_2 = stackOut_211_2;
            stackIn_212_0 = stackOut_211_0;
            stackIn_212_1 = stackOut_211_1;
            stackIn_212_2 = stackOut_211_2;
            if (!this.field_o) {
              break L35;
            } else {
              L36: {
                stackOut_212_0 = (am) ((Object) stackIn_212_0);
                stackOut_212_1 = (bh) ((Object) stackIn_212_1);
                stackOut_212_2 = stackIn_212_2;
                stackIn_216_0 = stackOut_212_0;
                stackIn_216_1 = stackOut_212_1;
                stackIn_216_2 = stackOut_212_2;
                stackIn_213_0 = stackOut_212_0;
                stackIn_213_1 = stackOut_212_1;
                stackIn_213_2 = stackOut_212_2;
                if (il.field_a) {
                  break L36;
                } else {
                  stackOut_213_0 = (am) ((Object) stackIn_213_0);
                  stackOut_213_1 = (bh) ((Object) stackIn_213_1);
                  stackOut_213_2 = stackIn_213_2;
                  stackIn_216_0 = stackOut_213_0;
                  stackIn_216_1 = stackOut_213_1;
                  stackIn_216_2 = stackOut_213_2;
                  stackIn_214_0 = stackOut_213_0;
                  stackIn_214_1 = stackOut_213_1;
                  stackIn_214_2 = stackOut_213_2;
                  if (tf.a((byte) 65)) {
                    break L36;
                  } else {
                    stackOut_214_0 = (am) ((Object) stackIn_214_0);
                    stackOut_214_1 = (bh) ((Object) stackIn_214_1);
                    stackOut_214_2 = stackIn_214_2;
                    stackIn_215_0 = stackOut_214_0;
                    stackIn_215_1 = stackOut_214_1;
                    stackIn_215_2 = stackOut_214_2;
                    break L35;
                  }
                }
              }
              stackOut_216_0 = (am) ((Object) stackIn_216_0);
              stackOut_216_1 = (bh) ((Object) stackIn_216_1);
              stackOut_216_2 = stackIn_216_2;
              stackOut_216_3 = 0;
              stackIn_217_0 = stackOut_216_0;
              stackIn_217_1 = stackOut_216_1;
              stackIn_217_2 = stackOut_216_2;
              stackIn_217_3 = stackOut_216_3;
              break L34;
            }
          }
          stackOut_215_0 = (am) ((Object) stackIn_215_0);
          stackOut_215_1 = (bh) ((Object) stackIn_215_1);
          stackOut_215_2 = stackIn_215_2;
          stackOut_215_3 = 1;
          stackIn_217_0 = stackOut_215_0;
          stackIn_217_1 = stackOut_215_1;
          stackIn_217_2 = stackOut_215_2;
          stackIn_217_3 = stackOut_215_3;
          break L34;
        }
        L37: {
          ((am) (Object) stackIn_217_0).a(stackIn_217_1, (byte) stackIn_217_2, stackIn_217_3 != 0, this.field_n);
          if (!this.field_D.field_r.f(17940)) {
            var4 = 0;
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          if (this.field_o) {
            L39: {
              if ((this.field_B ^ -1) > -1) {
                break L39;
              } else {
                L40: {
                  stackOut_250_0 = this.field_a;
                  stackIn_252_0 = stackOut_250_0;
                  stackIn_251_0 = stackOut_250_0;
                  if (param1) {
                    stackOut_252_0 = (hd) ((Object) stackIn_252_0);
                    stackOut_252_1 = 0;
                    stackIn_253_0 = stackOut_252_0;
                    stackIn_253_1 = stackOut_252_1;
                    break L40;
                  } else {
                    stackOut_251_0 = (hd) ((Object) stackIn_251_0);
                    stackOut_251_1 = 1;
                    stackIn_253_0 = stackOut_251_0;
                    stackIn_253_1 = stackOut_251_1;
                    break L40;
                  }
                }
                ((hd) (Object) stackIn_253_0).a(stackIn_253_1 != 0);
                break L39;
              }
            }
            L41: while (true) {
              if (this.field_I < 1.0f) {
                L42: {
                  if (this.field_B >= 0) {
                    this.field_a.a(this.field_u, var4, 7829367);
                    break L42;
                  } else {
                    break L42;
                  }
                }
                this.field_C = 0;
                break L38;
              } else {
                this.field_u = this.field_u + 1;
                this.field_I = this.field_I - 1.0f;
                continue L41;
              }
            }
          } else {
            L43: {
              this.field_C = 0;
              if (!this.field_w) {
                break L43;
              } else {
                if ((jq.a((byte) 29) ^ -1) <= -11) {
                  break L43;
                } else {
                  if (-101 <= (this.field_D.field_r.field_n ^ -1)) {
                    break L43;
                  } else {
                    if ((this.field_D.field_r.h(9979) ^ -1) == -2) {
                      this.field_w = false;
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                }
              }
            }
            L44: {
              this.field_L[this.field_B] = var4;
              var5 = var3;
              this.field_D.a(this.field_L, 20, this.field_F);
              var3 = this.field_D.b(-6133);
              if (var5 == var3) {
                break L44;
              } else {
                if (-11 < (var3 ^ -1)) {
                  this.field_w = true;
                  kh.a(var3, (byte) -84);
                  break L44;
                } else {
                  break L44;
                }
              }
            }
            L45: {
              if (this.field_D.field_j == 0) {
                L46: {
                  if (10 == var3) {
                    this.a(1220, 0, 255);
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (var3 == 20) {
                    this.a(1220, 2, 253);
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (var3 != 30) {
                    break L48;
                  } else {
                    this.a(1220, 4, 251);
                    break L48;
                  }
                }
                L49: {
                  if (var3 != 40) {
                    break L49;
                  } else {
                    this.a(1220, 6, 249);
                    break L49;
                  }
                }
                if ((var3 ^ -1) != -51) {
                  break L45;
                } else {
                  this.a(1220, 8, 247);
                  break L45;
                }
              } else {
                break L45;
              }
            }
            if (!this.field_D.c(-3317)) {
              break L38;
            } else {
              if (-4 == (this.field_D.field_j ^ -1)) {
                gj.a((byte) -78, true, am.field_n, 20);
                break L38;
              } else {
                ln.field_d.a(2, false);
                lc.field_d = false;
                an.field_c = true;
                break L38;
              }
            }
          }
        }
        L50: {
          if (!this.field_o) {
            break L50;
          } else {
            L51: {
              j.field_p = ol.field_D;
              if (eo.field_o) {
                break L51;
              } else {
                if (1 >= wg.field_g) {
                  if ((wg.field_g ^ -1) != -2) {
                    j.field_p = bl.field_q;
                    break L51;
                  } else {
                    j.field_p = ci.field_c;
                    break L51;
                  }
                } else {
                  j.field_p = Vertigo2.a(new String[]{Integer.toString(wg.field_g)}, ao.field_P, -127);
                  break L51;
                }
              }
            }
            var5 = tk.field_c.c(j.field_p);
            np.field_Nb = np.field_Nb + ((float)var5 - np.field_Nb) * 0.05000000074505806f;
            break L50;
          }
        }
        L52: {
          if (!this.field_o) {
            break L52;
          } else {
            break L52;
          }
        }
        hj.field_g = false;
    }

    private final void c(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var2 = this.field_D.b(-6133);
          if (qe.field_U.length <= var2) {
            break L0;
          } else {
            if (this.field_D.field_j != 0) {
              break L0;
            } else {
              L1: {
                if (this.field_w) {
                  var3 = qe.field_U[var2];
                  var4 = 320;
                  var5 = tk.field_c.a(var3, var4, 0);
                  var6 = 20;
                  var7 = 20;
                  var8 = 170;
                  rq.a(30 + var5 + 2 * var7, var4 - -(var6 * 2), var8 - var7, -(var4 / 2) + 320 - var6, -62, 150);
                  discarded$1 = tk.field_c.a(var3, 320 + -(var4 / 2), var8, var4, var5, 16777215, -1, 1, 1, 0);
                  var8 = var8 + (var7 / 2 + var5);
                  bi.b(320 - (var4 + -30) / 2, var8, var4 + -30, 5921370);
                  if (-101 < (this.field_D.field_r.field_n ^ -1)) {
                    break L1;
                  } else {
                    if (1 == this.field_D.field_r.h(9979)) {
                      var8 += 5;
                      var4 = va.field_s.a(1, bg.field_a);
                      va.field_s.a(bg.field_a, 16777215, -1, 320, var8 + va.field_s.field_k, 2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (-2 == (this.field_D.field_r.h(9979) ^ -1)) {
                mo.a(true);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 > 45) {
            break L2;
          } else {
            this.field_c = true;
            break L2;
          }
        }
    }

    final void a(int param0) {
        if (!this.field_o) {
            throw new IllegalStateException();
        }
        uh.field_Wb.j(59, 119);
        int var2 = -114 / ((45 - param0) / 43);
    }

    final void e(int param0) {
        this.field_G.c((byte) 122);
        if (param0 > -62) {
            this.field_C = 108;
        }
    }

    private final void d(int param0) {
        if (uh.field_Xb == null) {
            if (this.field_D.field_l[this.field_B].field_W > 0) {
                if (!this.field_c) {
                    uh.field_Xb = new vi(0, 65535, gi.field_u, pn.field_R, aj.field_e, c.field_h, new int[]{this.field_D.field_l[this.field_B].field_W});
                    if (!ag.b(49)) {
                        nr.a(3, -22754, uh.field_Xb);
                    }
                }
            }
        }
        if (param0 != 0) {
            this.field_a = (hd) null;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 16) {
            return;
        }
        this.field_r = param1;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 2) {
          L0: {
            if (this.field_o) {
              break L0;
            } else {
              L1: {
                if (this.field_D.field_j != 0) {
                  break L1;
                } else {
                  this.d(0);
                  break L1;
                }
              }
              if (ag.b(49)) {
                L2: {
                  if (jq.field_e != 0) {
                    break L2;
                  } else {
                    if (uh.field_Xb != null) {
                      break L2;
                    } else {
                      if (mb.field_y != null) {
                        break L2;
                      } else {
                        if (null == j.field_n) {
                          var3 = param1 ? 1 : 0;
                          gj.a((byte) 121, var3 != 0, am.field_n, 0);
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var3 = param1 ? 1 : 0;
                gj.a((byte) 100, var3 != 0, am.field_n, 10);
                break L0;
              } else {
                if (jq.field_e != 0) {
                  var3 = param1 ? 1 : 0;
                  gj.a((byte) -53, var3 != 0, am.field_n, 9);
                  break L0;
                } else {
                  if (uh.field_Xb == null) {
                    if (j.field_n != null) {
                      var3 = param1 ? 1 : 0;
                      gj.a((byte) -100, var3 != 0, am.field_n, 19);
                      break L0;
                    } else {
                      var3 = param1 ? 1 : 0;
                      gj.a((byte) -85, var3 != 0, am.field_n, 0);
                      break L0;
                    }
                  } else {
                    var3 = param1 ? 1 : 0;
                    gj.a((byte) -113, var3 != 0, am.field_n, 5);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(pp param0, byte param1) {
        boolean discarded$2 = false;
        int fieldTemp$3 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (10 < this.field_H) {
                this.field_H = 0;
                this.field_x = 0;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == 11) {
              var3_int = 0;
              L2: while (true) {
                if (-11 >= (var3_int ^ -1)) {
                  L3: {
                    this.field_H = this.field_H + 1;
                    if (0 > this.field_B) {
                      this.field_j = gk.a(param1 + 83);
                      this.field_M = this.field_M + 10;
                      break L3;
                    } else {
                      if (!param0.b(false, this.field_B)) {
                        this.field_M = this.field_M + (param0.a((byte) 76, this.field_B) - 1);
                        break L3;
                      } else {
                        this.field_k = this.field_a.a((byte) -17, param0.b(this.field_B, -96));
                        this.field_M = 10 + this.field_k + (param0.a((byte) 76, this.field_B) - 1);
                        this.field_j = gk.a(param1 ^ 52);
                        break L3;
                      }
                    }
                  }
                  this.field_t = 0;
                  this.field_g = true;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    discarded$2 = param0.a(this.field_F, this.field_L, 32);
                    fieldTemp$3 = this.field_r - 1;
                    this.field_r = this.field_r - 1;
                    if (fieldTemp$3 >= 0) {
                      break L4;
                    } else {
                      L5: {
                        if (!this.field_g) {
                          break L5;
                        } else {
                          if ((var3_int ^ -1) != -10) {
                            break L5;
                          } else {
                            if (param0.field_z == this.field_D.field_r.g(param1 ^ 116)) {
                              break L5;
                            } else {
                              lf.d(param1 + 77, 0);
                              rm.b((byte) -79);
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        if (this.field_B < 0) {
                          break L6;
                        } else {
                          if (!this.field_F[this.field_B]) {
                            break L6;
                          } else {
                            this.field_x = this.field_x + 1;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        this.field_D.a(this.field_L, param1 ^ 31, this.field_F);
                        if (this.field_B < 0) {
                          break L7;
                        } else {
                          if (-2 != (this.field_D.field_j ^ -1)) {
                            break L7;
                          } else {
                            if (15 > this.field_D.b(-6133) + -(this.field_D.field_i ^ 4012)) {
                              break L7;
                            } else {
                              this.a(param1 ^ 1231, 10, 245);
                              break L7;
                            }
                          }
                        }
                      }
                      var4 = 0;
                      L8: while (true) {
                        if (this.field_D.field_l.length <= var4) {
                          break L4;
                        } else {
                          this.field_K[var3_int][var4].a(this.field_D.field_r.field_f[var4], 16777215);
                          var4++;
                          continue L8;
                        }
                      }
                    }
                  }
                  var3_int++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("tr.C(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, mp param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -25220) {
                break L1;
              } else {
                field_O = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("tr.R(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        float var2_float = 0.0f;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_110_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          if (-1 >= (this.field_B ^ -1)) {
            L1: {
              if (!this.field_o) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_5_0;
              var3 = this.field_D.field_l[this.field_B].field_W;
              if (var2 == 0) {
                break L2;
              } else {
                var3 = 0;
                break L2;
              }
            }
            if (ln.field_d.field_c) {
              break L0;
            } else {
              L3: {
                var4 = (ln.field_d.field_s ^ de.field_f) % 8;
                if (-1 == (var4 ^ -1)) {
                  c.field_h = c.field_h - 1;
                  gi.field_u = gi.field_u + aj.field_e;
                  break L3;
                } else {
                  if ((var4 ^ -1) == -2) {
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    break L3;
                  } else {
                    if (-3 != (var4 ^ -1)) {
                      if ((var4 ^ -1) == -4) {
                        aj.field_e = aj.field_e + 1;
                        gi.field_u = gi.field_u - c.field_h;
                        break L3;
                      } else {
                        if ((var4 ^ -1) == -5) {
                          pn.field_R = pn.field_R + aj.field_e;
                          c.field_h = c.field_h + 1;
                          break L3;
                        } else {
                          if (-6 == (var4 ^ -1)) {
                            aj.field_e = aj.field_e + 1;
                            pn.field_R = pn.field_R + c.field_h;
                            break L3;
                          } else {
                            if ((var4 ^ -1) == -7) {
                              pn.field_R = pn.field_R - aj.field_e;
                              c.field_h = c.field_h - 1;
                              break L3;
                            } else {
                              if (var4 != 7) {
                                break L3;
                              } else {
                                aj.field_e = aj.field_e - 1;
                                pn.field_R = pn.field_R - c.field_h;
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      gi.field_u = gi.field_u - aj.field_e;
                      c.field_h = c.field_h + 1;
                      break L3;
                    }
                  }
                }
              }
              L4: {
                var4 = (ln.field_d.field_s ^ de.field_f + var3) % 5;
                if (-1 == (var4 ^ -1)) {
                  qr.field_j = qr.field_j | ki.field_c + sk.field_b << 1872859729;
                  break L4;
                } else {
                  if (1 != var4) {
                    if (-3 != (var4 ^ -1)) {
                      if (3 != var4) {
                        if (4 == var4) {
                          re.field_j = re.field_j - 1;
                          sk.field_b = sk.field_b - ki.field_c;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        sk.field_b = sk.field_b + ki.field_c;
                        re.field_j = re.field_j + 1;
                        break L4;
                      }
                    } else {
                      sk.field_b = sk.field_b - re.field_j;
                      ki.field_c = ki.field_c - 1;
                      break L4;
                    }
                  } else {
                    sk.field_b = sk.field_b + re.field_j;
                    ki.field_c = ki.field_c + 1;
                    break L4;
                  }
                }
              }
              L5: {
                var4 = (gi.field_u + aj.field_e * de.field_f) % 8;
                if (0 == var4) {
                  df.field_k = df.field_k - 1;
                  f.field_B = f.field_B - ca.field_g;
                  break L5;
                } else {
                  if (var4 == 1) {
                    f.field_B = f.field_B - df.field_k;
                    ca.field_g = ca.field_g - 1;
                    break L5;
                  } else {
                    if (-3 != (var4 ^ -1)) {
                      if (3 == var4) {
                        f.field_B = f.field_B + df.field_k;
                        ca.field_g = ca.field_g + 1;
                        break L5;
                      } else {
                        if (4 == var4) {
                          df.field_k = df.field_k + 1;
                          hj.field_c = hj.field_c + ca.field_g;
                          break L5;
                        } else {
                          if (-6 == (var4 ^ -1)) {
                            ca.field_g = ca.field_g + 1;
                            hj.field_c = hj.field_c + df.field_k;
                            break L5;
                          } else {
                            if (6 != var4) {
                              if (-8 == (var4 ^ -1)) {
                                ca.field_g = ca.field_g - 1;
                                hj.field_c = hj.field_c - df.field_k;
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              df.field_k = df.field_k - 1;
                              hj.field_c = hj.field_c - ca.field_g;
                              break L5;
                            }
                          }
                        }
                      }
                    } else {
                      df.field_k = df.field_k + 1;
                      f.field_B = f.field_B + ca.field_g;
                      break L5;
                    }
                  }
                }
              }
              if (-1 == (var4 ^ -1)) {
                mc.field_e = mc.field_e - ci.field_b;
                sl.field_l = sl.field_l - 1;
                break L0;
              } else {
                if (-2 != (var4 ^ -1)) {
                  if (-3 != (var4 ^ -1)) {
                    if (var4 != 3) {
                      if (var4 != 4) {
                        if (var4 != 5) {
                          if (-7 == (var4 ^ -1)) {
                            sl.field_l = sl.field_l - 1;
                            lj.field_k = lj.field_k - ci.field_b;
                            break L0;
                          } else {
                            if (var4 == 7) {
                              lj.field_k = lj.field_k - sl.field_l;
                              ci.field_b = ci.field_b - 1;
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        } else {
                          ci.field_b = ci.field_b + 1;
                          lj.field_k = lj.field_k + sl.field_l;
                          break L0;
                        }
                      } else {
                        sl.field_l = sl.field_l + 1;
                        lj.field_k = lj.field_k + ci.field_b;
                        break L0;
                      }
                    } else {
                      ci.field_b = ci.field_b + 1;
                      mc.field_e = mc.field_e + sl.field_l;
                      break L0;
                    }
                  } else {
                    sl.field_l = sl.field_l + 1;
                    mc.field_e = mc.field_e + ci.field_b;
                    break L0;
                  }
                } else {
                  mc.field_e = mc.field_e - sl.field_l;
                  ci.field_b = ci.field_b - 1;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L6: {
          L7: {
            L8: {
              if (-14 == (de.field_f ^ -1)) {
                L9: {
                  var2 = 1;
                  if (this.field_D.field_r.field_w == 0) {
                    L10: {
                      if (this.field_D.field_r.h(9979) == 3) {
                        break L10;
                      } else {
                        if (4 == this.field_D.field_r.h(param0 ^ 9864)) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var2 = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L11: {
                  var3 = 1;
                  if (!this.field_o) {
                    break L11;
                  } else {
                    if (-1 >= (this.field_B ^ -1)) {
                      if (!this.field_D.field_a) {
                        if (1 != this.field_D.field_j) {
                          var3 = 2;
                          break L11;
                        } else {
                          var3 = 22;
                          break L11;
                        }
                      } else {
                        var3 = 3;
                        break L11;
                      }
                    } else {
                      var3 = 4;
                      break L11;
                    }
                  }
                }
                if (var2 != 0) {
                  var4 = var3;
                  gj.a((byte) 36, false, am.field_n, var4);
                  return;
                } else {
                  if (this.field_o) {
                    break L6;
                  } else {
                    if (ji.field_r <= 0) {
                      break L6;
                    } else {
                      cp.field_b = cp.field_b.substring(1) + ji.field_r;
                      if (cp.field_b.equalsIgnoreCase("noir")) {
                        L12: {
                          if (gi.field_r) {
                            stackOut_92_0 = 0;
                            stackIn_93_0 = stackOut_92_0;
                            break L12;
                          } else {
                            stackOut_91_0 = 1;
                            stackIn_93_0 = stackOut_91_0;
                            break L12;
                          }
                        }
                        gi.field_r = stackIn_93_0 != 0;
                        var2_float = 1.399999976158142f;
                        oo.b(var2_float);
                        if (!gi.field_r) {
                          break L7;
                        } else {
                          var3 = 0;
                          L13: while (true) {
                            if (oo.field_c.length <= var3) {
                              break L8;
                            } else {
                              var4 = (oo.field_c[var3] & 16711680) >> -277804496;
                              var5 = (65280 & oo.field_c[var3]) >> -889245144;
                              var6 = oo.field_c[var3] & 255;
                              var7 = (var5 + (var6 + var4)) / 3;
                              if (var7 >= 79) {
                                if (-91 >= (var7 ^ -1)) {
                                  oo.field_c[var3] = 16777215;
                                  var3++;
                                  continue L13;
                                } else {
                                  oo.field_c[var3] = om.a(var7, om.a(var7 << 166569640, var7 << -1292079856));
                                  var3++;
                                  continue L13;
                                }
                              } else {
                                oo.field_c[var3] = 0;
                                var3++;
                                continue L13;
                              }
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              } else {
                if (this.field_o) {
                  break L6;
                } else {
                  if (ji.field_r <= 0) {
                    break L6;
                  } else {
                    cp.field_b = cp.field_b.substring(1) + ji.field_r;
                    if (cp.field_b.equalsIgnoreCase("noir")) {
                      L14: {
                        if (gi.field_r) {
                          stackOut_109_0 = 0;
                          stackIn_110_0 = stackOut_109_0;
                          break L14;
                        } else {
                          stackOut_108_0 = 1;
                          stackIn_110_0 = stackOut_108_0;
                          break L14;
                        }
                      }
                      gi.field_r = stackIn_110_0 != 0;
                      var2_float = 1.399999976158142f;
                      oo.b(var2_float);
                      if (!gi.field_r) {
                        break L7;
                      } else {
                        var3 = 0;
                        L15: while (true) {
                          if (oo.field_c.length <= var3) {
                            break L8;
                          } else {
                            var4 = (oo.field_c[var3] & 16711680) >> -277804496;
                            var5 = (65280 & oo.field_c[var3]) >> -889245144;
                            var6 = oo.field_c[var3] & 255;
                            var7 = (var5 + (var6 + var4)) / 3;
                            if (var7 >= 79) {
                              if (-91 >= (var7 ^ -1)) {
                                oo.field_c[var3] = 16777215;
                                var3++;
                                continue L15;
                              } else {
                                oo.field_c[var3] = om.a(var7, om.a(var7 << 166569640, var7 << -1292079856));
                                var3++;
                                continue L15;
                              }
                            } else {
                              oo.field_c[var3] = 0;
                              var3++;
                              continue L15;
                            }
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
            var3 = 0;
            L16: while (true) {
              if (var3 >= Vertigo2.field_J.length) {
                break L6;
              } else {
                qq.a(oo.field_c, 0, Vertigo2.field_J[var3], 0, oo.field_c.length);
                var3++;
                continue L16;
              }
            }
          }
          mn.a(false);
          break L6;
        }
        L17: {
          if (-1 >= (this.field_B ^ -1)) {
            break L17;
          } else {
            if (1 != this.field_D.field_r.h(9979)) {
              break L17;
            } else {
              L18: {
                L19: {
                  if (s.field_y != de.field_f) {
                    break L19;
                  } else {
                    if (!eo.field_o) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                if (am.field_t != de.field_f) {
                  L20: {
                    L21: {
                      if (ga.field_gb != de.field_f) {
                        break L21;
                      } else {
                        if (!eo.field_o) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    if (de.field_f == od.field_Mb) {
                      break L20;
                    } else {
                      break L17;
                    }
                  }
                  if (!this.field_G.a(true)) {
                    L22: {
                      var2 = this.field_n;
                      this.field_n = this.field_n + 1;
                      if (this.field_n >= this.field_D.field_l.length) {
                        this.field_n = 0;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    this.field_G.a((byte) -17, var2, this.field_n);
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L18;
                }
              }
              if (this.field_G.a(true)) {
                break L17;
              } else {
                L23: {
                  var2 = this.field_n;
                  this.field_n = this.field_n - 1;
                  if (-1 < (this.field_n ^ -1)) {
                    this.field_n = -1 + this.field_D.field_l.length;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                this.field_G.a((byte) -17, var2, this.field_n);
                break L17;
              }
            }
          }
        }
        L24: {
          L25: {
            if (!this.field_o) {
              break L25;
            } else {
              L26: {
                if (eo.field_o) {
                  break L26;
                } else {
                  if (0 > this.field_B) {
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              if (0 > this.field_B) {
                break L24;
              } else {
                if (il.field_a) {
                  break L24;
                } else {
                  if (tf.a((byte) 123)) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
            }
          }
          L27: {
            L28: {
              if (tn.field_c == de.field_f) {
                break L28;
              } else {
                if (bc.field_b != de.field_f) {
                  break L27;
                } else {
                  break L28;
                }
              }
            }
            this.field_G.a(15481);
            break L27;
          }
          L29: {
            if (ve.field_a == de.field_f) {
              break L29;
            } else {
              if (jb.field_y == de.field_f) {
                break L29;
              } else {
                break L24;
              }
            }
          }
          this.field_G.b((byte) 119);
          break L24;
        }
        L30: {
          if (!this.field_o) {
            break L30;
          } else {
            if (il.field_a) {
              return;
            } else {
              if (!tf.a((byte) 96)) {
                break L30;
              } else {
                return;
              }
            }
          }
        }
        if (param0 == 115) {
          L31: {
            L32: {
              if (ch.field_k == de.field_f) {
                break L32;
              } else {
                if (na.field_n != de.field_f) {
                  break L31;
                } else {
                  break L32;
                }
              }
            }
            this.field_C = this.field_C | 2;
            break L31;
          }
          L33: {
            L34: {
              if (de.field_f == ro.field_i) {
                break L34;
              } else {
                if (om.field_B != de.field_f) {
                  break L33;
                } else {
                  break L34;
                }
              }
            }
            this.field_C = this.field_C | 1;
            break L33;
          }
          L35: {
            if (de.field_f == ga.field_fb) {
              this.field_D.e(-4);
              break L35;
            } else {
              break L35;
            }
          }
          L36: {
            if (!this.field_A) {
              break L36;
            } else {
              if (de.field_f != 59) {
                break L36;
              } else {
                if ((this.field_D.field_j ^ -1) != -4) {
                  break L36;
                } else {
                  ci.field_b = 0;
                  mc.field_e = 0;
                  lj.field_k = 0;
                  sl.field_l = 0;
                  dh.a(this.field_D.field_e, this.field_D.field_l[0].field_H, true);
                  gj.a((byte) -66, false, am.field_n, 20);
                  break L36;
                }
              }
            }
          }
          L37: {
            if (this.field_A) {
              var2 = lp.h(param0 + -114);
              var3 = var2;
              if (0 != var3) {
                if (1 == var3) {
                  if (!this.field_o) {
                    this.field_D.field_l[this.field_B].l((byte) -89);
                    break L37;
                  } else {
                    break L37;
                  }
                } else {
                  if ((var3 ^ -1) != -3) {
                    if (-4 != (var3 ^ -1)) {
                      if ((var3 ^ -1) != -5) {
                        if (var3 != 5) {
                          if (var3 == 6) {
                            m.d(param0 + 5, 20, 300);
                            break L37;
                          } else {
                            if ((var3 ^ -1) == -8) {
                              tk.a(param0 ^ -116, 0, 0, il.field_e, wo.field_S);
                              break L37;
                            } else {
                              if (var3 == 8) {
                                va.a(20, (byte) 125);
                                break L37;
                              } else {
                                if (9 == var3) {
                                  va.a(50, (byte) 124);
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                            }
                          }
                        } else {
                          kq.a((byte) -40);
                          break L37;
                        }
                      } else {
                        mr.a((byte) -68);
                        break L37;
                      }
                    } else {
                      if (!this.field_o) {
                        this.field_D.field_l[this.field_B].field_g = this.field_D.field_l[this.field_B].field_g + 1;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                  } else {
                    if (!this.field_o) {
                      this.field_D.field_l[this.field_B].d((byte) 4);
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                }
              } else {
                this.field_D.a(30113, false);
                break L37;
              }
            } else {
              break L37;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(mi param0, int param1) {
        try {
            this.field_D.a(param0, (byte) 102);
            if (param1 < 99) {
                this.b(-118, -59);
            }
            this.field_g = false;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "tr.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, pp param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > -this.field_M + this.field_u) {
                break L1;
              } else {
                if (!this.field_z.a(false)) {
                  break L1;
                } else {
                  this.a(param1, (byte) 11);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            this.field_z.a(param1, false);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("tr.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        boolean discarded$2 = false;
        int discarded$3 = 0;
        int var3 = 0;
        rn[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        wo var6_ref_wo = null;
        int var6 = 0;
        int var7_int = 0;
        wo var7 = null;
        int var8 = 0;
        String var8_ref_String = null;
        rn var9_ref_rn = null;
        int var9 = 0;
        rn var10_ref_rn = null;
        int var10 = 0;
        int var11_int = 0;
        Runtime var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        rn[] var16 = null;
        int stackIn_43_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        L0: {
          var14 = Vertigo2.field_L ? 1 : 0;
          if (mf.a((byte) 126, 512)) {
            break L0;
          } else {
            this.field_m.a(false, this.field_D.field_r);
            break L0;
          }
        }
        L1: {
          if (!mf.a((byte) 126, 64)) {
            var3 = 0;
            L2: while (true) {
              if (var3 >= this.field_q.length) {
                var3 = this.field_M;
                L3: while (true) {
                  if (this.field_u <= var3) {
                    break L1;
                  } else {
                    if (mf.a((byte) 126, 512)) {
                      break L1;
                    } else {
                      L4: {
                        if ((this.field_B ^ -1) > -1) {
                          break L4;
                        } else {
                          L5: {
                            var4_int = this.field_a.a(true, var3);
                            if (0 != (var4_int ^ -1)) {
                              break L5;
                            } else {
                              if ((this.field_B ^ -1) > -1) {
                                break L5;
                              } else {
                                break L1;
                              }
                            }
                          }
                          this.field_q[this.field_B] = var4_int;
                          break L4;
                        }
                      }
                      L6: {
                        var4_int = 0;
                        if (this.field_v >= var3) {
                          break L6;
                        } else {
                          this.field_v = var3;
                          var4_int = 1;
                          break L6;
                        }
                      }
                      discarded$2 = this.field_m.a(false, this.field_p, 128, this.field_q, var4_int != 0);
                      var3++;
                      continue L3;
                    }
                  }
                }
              } else {
                this.field_q[var3] = 0;
                var3++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L7: {
          if (!this.field_o) {
            break L7;
          } else {
            if (1 != this.field_m.h(param1 ^ -9953)) {
              break L7;
            } else {
              L8: {
                var3 = this.field_t;
                if ((var3 ^ -1) > -11) {
                  break L8;
                } else {
                  var3 = 9;
                  break L8;
                }
              }
              this.field_m.a(this.field_K[var3], this.field_B, param1 + -22719);
              break L7;
            }
          }
        }
        var16 = this.field_D.field_r.m(9384);
        var4 = this.field_m.m(param1 ^ -9396);
        var5 = 0;
        L9: while (true) {
          if (this.field_D.field_l.length <= var5) {
            L10: {
              if (kn.field_h[this.field_D.field_j].length <= this.field_D.field_e - -this.field_D.field_c) {
                stackOut_42_0 = kn.field_h[this.field_D.field_j].length;
                stackIn_43_0 = stackOut_42_0;
                break L10;
              } else {
                stackOut_41_0 = this.field_D.field_e + this.field_D.field_c;
                stackIn_43_0 = stackOut_41_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_43_0;
              var6 = this.field_D.b(-6133);
              this.field_G.a(this.field_B, -this.field_D.field_e + var5, 1 + (-this.field_D.field_e + var6), true, this.field_m, this.field_D.field_f, this.field_D.field_g, var6, this.field_n);
              this.field_t = this.field_t + 1;
              if (param1 == -28) {
                break L11;
              } else {
                this.field_J = -79;
                break L11;
              }
            }
            L12: {
              if (mf.a((byte) 126, 128)) {
                L13: {
                  if (this.field_b != null) {
                    break L13;
                  } else {
                    this.field_b = new er(640, 480);
                    break L13;
                  }
                }
                this.field_b.d();
                this.field_G.a(this.field_B, -this.field_D.field_e + var5, 1 + (var6 - this.field_D.field_e), true, this.field_D.field_r, this.field_D.field_f, this.field_D.field_g, var6, this.field_n);
                ro.field_g.a(-125);
                this.field_b.d(0, 0, 128);
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              if (!this.field_o) {
                break L14;
              } else {
                var7_int = 0;
                L15: while (true) {
                  if (this.field_D.field_z <= var7_int) {
                    break L14;
                  } else {
                    L16: {
                      if (var7_int == this.field_B) {
                        if (-1 == (1 << var7_int & this.field_D.field_t ^ -1)) {
                          if (0 != (1 << var7_int & this.field_D.field_u)) {
                            var8_ref_String = cd.field_c;
                            break L16;
                          } else {
                            if (!this.field_D.field_a) {
                              if (0 != (this.field_D.field_d & 1 << var7_int)) {
                                var8_ref_String = rb.field_b;
                                break L16;
                              } else {
                                var7_int++;
                                continue L15;
                              }
                            } else {
                              var7_int++;
                              continue L15;
                            }
                          }
                        } else {
                          if (!this.field_i) {
                            var8_ref_String = bm.field_A;
                            break L16;
                          } else {
                            var8_ref_String = ue.field_H;
                            break L16;
                          }
                        }
                      } else {
                        var15 = this.field_D.field_w[var7_int];
                        var8_ref_String = var15;
                        var8_ref_String = var15;
                        var8_ref_String = var15;
                        if (0 == (1 << var7_int & this.field_h)) {
                          if (0 != (1 << var7_int & this.field_D.field_t)) {
                            if (!this.field_i) {
                              var8_ref_String = Vertigo2.a(new String[]{var15}, gn.field_e, 9);
                              break L16;
                            } else {
                              var8_ref_String = Vertigo2.a(new String[]{var15}, me.field_d, param1 ^ 19);
                              break L16;
                            }
                          } else {
                            if ((1 << var7_int & this.field_D.field_u) == 0) {
                              if (!this.field_D.field_a) {
                                if (0 != (this.field_D.field_d & 1 << var7_int)) {
                                  var8_ref_String = Vertigo2.a(new String[]{var8_ref_String}, mo.field_c, -120);
                                  break L16;
                                } else {
                                  var7_int++;
                                  continue L15;
                                }
                              } else {
                                var7_int++;
                                continue L15;
                              }
                            } else {
                              var8_ref_String = Vertigo2.a(new String[]{var15}, ca.field_e, param1 ^ -109);
                              break L16;
                            }
                          }
                        } else {
                          if ((1 << var7_int & this.field_D.field_u) == 0) {
                            var8_ref_String = Vertigo2.a(new String[]{var15}, mn.field_p, -115);
                            break L16;
                          } else {
                            var8_ref_String = Vertigo2.a(new String[]{var15}, kd.field_m, 121);
                            break L16;
                          }
                        }
                      }
                    }
                    va.field_s.a(616, param1 ^ 65, 16777215, var7_int * 14 + 140, -1, var8_ref_String);
                    var7_int++;
                    continue L15;
                  }
                }
              }
            }
            L17: {
              if (param0) {
                this.c(param1 ^ -112);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (!this.field_o) {
                break L18;
              } else {
                L19: {
                  L20: {
                    if (!hj.field_g) {
                      break L20;
                    } else {
                      if (!param0) {
                        break L20;
                      } else {
                        stackOut_87_0 = 1;
                        stackIn_95_0 = stackOut_87_0;
                        break L19;
                      }
                    }
                  }
                  if (wg.field_g > 0) {
                    if ((rg.field_f % 40 ^ -1) > -21) {
                      stackOut_93_0 = 1;
                      stackIn_95_0 = stackOut_93_0;
                      break L19;
                    } else {
                      stackOut_92_0 = 0;
                      stackIn_95_0 = stackOut_92_0;
                      break L19;
                    }
                  } else {
                    stackOut_90_0 = 0;
                    stackIn_95_0 = stackOut_90_0;
                    break L19;
                  }
                }
                L21: {
                  var7_int = stackIn_95_0;
                  var8 = 15;
                  var9 = var8 * 2 + (int)np.field_Nb;
                  var10 = var8 * 2 + tk.field_c.field_z;
                  va.field_s.b(93);
                  qi.a(false, 25, var9, 3 + td.field_c.field_C + -var10);
                  if (var7_int != 0) {
                    stackOut_97_0 = 14586368;
                    stackIn_98_0 = stackOut_97_0;
                    break L21;
                  } else {
                    stackOut_96_0 = 16777215;
                    stackIn_98_0 = stackOut_96_0;
                    break L21;
                  }
                }
                var11_int = stackIn_98_0;
                va.field_s.a(j.field_p, var11_int, -1, var8 + ((int)np.field_Nb / 2 + 25), td.field_c.field_C - var8, 2);
                break L18;
              }
            }
            L22: {
              var7 = this.field_D.field_l[this.field_n];
              if (null == va.field_s) {
                break L22;
              } else {
                if (0 > this.field_n) {
                  break L22;
                } else {
                  if (var7 == null) {
                    break L22;
                  } else {
                    L23: {
                      var8 = 20;
                      var9 = 16;
                      var10 = 440;
                      if (mf.a((byte) 126, 1)) {
                        tk.field_c.a("Position:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_E), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_y), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_k), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (mf.a((byte) 126, 2)) {
                        tk.field_c.a("Current Cell:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_E / 128), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_y / 128), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_k / 240), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (!mf.a((byte) 126, 4)) {
                        break L25;
                      } else {
                        tk.field_c.a("FPS:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(li.field_d), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        break L25;
                      }
                    }
                    L26: {
                      if (mf.a((byte) 126, 8)) {
                        tk.field_c.a("Memory:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        var11 = Runtime.getRuntime();
                        tk.field_c.a("Total: " + var11.totalMemory() / 1000L, var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a("Used: " + var11.freeMemory() / 1000L, var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (mf.a((byte) 126, 16)) {
                        L28: {
                          tk.field_c.a("Predictions:", var10, var8, 16777215, -1);
                          var8 = var8 + var9;
                          tk.field_c.a("Predicitons per frame: " + (this.field_u + -this.field_M), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          tk.field_c.a("Keys Out Packets: " + this.field_a.a(16777215), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          if (this.field_J <= 0) {
                            break L28;
                          } else {
                            tk.field_c.a("Auth Updates/Sec: " + this.field_y / this.field_J, var10, var8, 65280, -1);
                            break L28;
                          }
                        }
                        L29: {
                          var8 = var8 + var9;
                          if (0 < this.field_z.c(true)) {
                            tk.field_c.a("Auth Packets delayed: " + this.field_z.c(true), var10, var8, 65280, -1);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          var8 = var8 + var9;
                          tk.field_c.a("Gameupdates per tic: " + (int)(0.5f + this.field_E), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          if ((this.field_H ^ -1) < -1) {
                            tk.field_c.a("Avg Dont updates: " + this.field_x / this.field_H, var10, var8, 65280, -1);
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        var8 = var8 + var9;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L31: {
                      if (!mf.a((byte) 126, 256)) {
                        break L31;
                      } else {
                        tk.field_c.a("Player Details:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a("Fall: " + var7.c((byte) -128), var10, var8, 65280, -1);
                        var8 = var8 + var9;
                        tk.field_c.a("vx: " + var7.field_c, var10, var8, 65280, -1);
                        var8 = var8 + var9;
                        tk.field_c.a("vx: " + var7.field_O, var10, var8, 65280, -1);
                        var8 = var8 + var9;
                        tk.field_c.a("On Block: " + var7.field_z, var10, var8, 65280, -1);
                        var8 = var8 + var9;
                        tk.field_c.a("Stuck: " + var7.field_N, var10, var8, 65280, -1);
                        var8 = var8 + var9;
                        break L31;
                      }
                    }
                    var8 = 480;
                    if (!mf.a((byte) 126, 32)) {
                      break L22;
                    } else {
                      discarded$3 = this.field_a.a(this.field_M, 20, (byte) 51, var8, 30);
                      break L22;
                    }
                  }
                }
              }
            }
            va.b(127);
            return;
          } else {
            if (var5 != this.field_B) {
              var6_ref_wo = this.field_D.field_l[var5];
              var7_int = 0;
              L32: while (true) {
                if ((var7_int ^ -1) > -10) {
                  var8 = var6_ref_wo.field_P[var7_int];
                  if ((var8 ^ -1) <= -1) {
                    if (var8 < var4.length) {
                      var9_ref_rn = var16[var8];
                      if (var9_ref_rn != null) {
                        var10_ref_rn = var4[var8];
                        if (var10_ref_rn != null) {
                          var11_int = -var9_ref_rn.field_l + var6_ref_wo.field_E;
                          var12 = -var9_ref_rn.field_g + var6_ref_wo.field_y;
                          var13 = -var9_ref_rn.field_s + var6_ref_wo.field_k;
                          this.field_m.field_f[var5].field_E = var11_int + var10_ref_rn.field_l;
                          this.field_m.field_f[var5].field_y = var12 + var10_ref_rn.field_g;
                          this.field_m.field_f[var5].field_k = var10_ref_rn.field_s + var13;
                          var5++;
                          continue L9;
                        } else {
                          var7_int++;
                          continue L32;
                        }
                      } else {
                        var7_int++;
                        continue L32;
                      }
                    } else {
                      var7_int++;
                      continue L32;
                    }
                  } else {
                    var7_int++;
                    continue L32;
                  }
                } else {
                  var5++;
                  continue L9;
                }
              }
            } else {
              var5++;
              continue L9;
            }
          }
        }
    }

    tr(boolean param0, String[] param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wo[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        wo stackIn_23_2 = null;
        wo stackIn_23_3 = null;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        int stackIn_23_6 = 0;
        boolean stackIn_23_7 = false;
        wo[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        wo stackIn_24_2 = null;
        wo stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        boolean stackIn_24_7 = false;
        wo[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        wo stackIn_25_2 = null;
        wo stackIn_25_3 = null;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        boolean stackIn_25_7 = false;
        int stackIn_25_8 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        wo[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        wo stackOut_22_2 = null;
        wo stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        boolean stackOut_22_7 = false;
        wo[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        wo stackOut_24_2 = null;
        wo stackOut_24_3 = null;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        boolean stackOut_24_7 = false;
        int stackOut_24_8 = 0;
        wo[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        wo stackOut_23_2 = null;
        wo stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        boolean stackOut_23_7 = false;
        int stackOut_23_8 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        this.field_I = 0.0f;
        this.field_c = false;
        this.field_E = 1.0f;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((tr) (this)).field_o = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((tr) (this)).field_i = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (2 > fn.field_z) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((tr) (this)).field_A = stackIn_10_1 != 0;
              this.field_B = param2;
              jq.field_e = 0;
              qr.field_j = 0;
              hj.field_c = 2035;
              f.field_B = 43310;
              ki.field_c = 126;
              re.field_j = 8522;
              sk.field_b = 42354;
              lj.field_k = 1986;
              mc.field_e = 1951;
              sl.field_l = 1954;
              ci.field_b = 1982;
              aj.field_e = 5180;
              pn.field_R = 617;
              c.field_h = 9170;
              gi.field_u = 8768;
              df.field_k = 2127;
              ca.field_g = 1220;
              var9_int = t.field_l;
              t.field_l = 0;
              var10 = var9_int;
              var11 = rg.field_f % 4;
              var12 = (-t.field_l + var10) * 4;
              t.field_l = var10;
              if (var11 == 0) {
                var13 = var12 / 2;
                hj.field_c = hj.field_c + (var12 - var13);
                f.field_B = f.field_B + var13;
                break L4;
              } else {
                if (1 != var11) {
                  if (-3 == (var11 ^ -1)) {
                    f.field_B = f.field_B + var12;
                    break L4;
                  } else {
                    if (var11 != 3) {
                      break L4;
                    } else {
                      hj.field_c = hj.field_c + var12;
                      break L4;
                    }
                  }
                } else {
                  var13 = var12 / 3;
                  hj.field_c = hj.field_c + var13;
                  f.field_B = f.field_B + (var12 + -var13);
                  break L4;
                }
              }
            }
            this.field_D = new lj(param1, this.field_B, param4, param5, param6, param7, false, param3);
            this.field_m = this.field_D.c((byte) -116);
            this.field_G = new am(param4, this.field_D.field_l.length, param1);
            var9_int = param1.length;
            this.field_a = new hd(this.field_B, var9_int);
            this.field_K = new wo[10][var9_int];
            this.field_p = new boolean[var9_int];
            this.field_q = new int[var9_int];
            this.field_F = new boolean[var9_int];
            this.field_L = new int[var9_int];
            var10 = 0;
            L5: while (true) {
              if (var10 >= var9_int) {
                L6: {
                  if (-1 < (this.field_B ^ -1)) {
                    break L6;
                  } else {
                    this.field_n = this.field_B;
                    break L6;
                  }
                }
                L7: {
                  this.field_s = 50;
                  if (param4 != 0) {
                    break L7;
                  } else {
                    if ((param6 ^ -1) <= -11) {
                      break L7;
                    } else {
                      this.field_w = true;
                      kh.a(param6, (byte) -84);
                      break L7;
                    }
                  }
                }
                this.field_z = new nj();
                this.field_g = true;
                break L0;
              } else {
                var15 = 0;
                var11 = var15;
                L8: while (true) {
                  if (10 <= var15) {
                    var10++;
                    continue L5;
                  } else {
                    L9: {
                      stackOut_22_0 = this.field_K[var15];
                      stackOut_22_1 = var10;
                      stackOut_22_2 = null;
                      stackOut_22_3 = null;
                      stackOut_22_4 = this.field_D.field_l[var10].field_l;
                      stackOut_22_5 = 0;
                      stackOut_22_6 = var10;
                      stackOut_22_7 = this.field_o;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackIn_24_3 = stackOut_22_3;
                      stackIn_24_4 = stackOut_22_4;
                      stackIn_24_5 = stackOut_22_5;
                      stackIn_24_6 = stackOut_22_6;
                      stackIn_24_7 = stackOut_22_7;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      stackIn_23_4 = stackOut_22_4;
                      stackIn_23_5 = stackOut_22_5;
                      stackIn_23_6 = stackOut_22_6;
                      stackIn_23_7 = stackOut_22_7;
                      if (-3 != (param4 ^ -1)) {
                        stackOut_24_0 = (wo[]) ((Object) stackIn_24_0);
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = null;
                        stackOut_24_3 = null;
                        stackOut_24_4 = stackIn_24_4;
                        stackOut_24_5 = stackIn_24_5;
                        stackOut_24_6 = stackIn_24_6;
                        stackOut_24_7 = stackIn_24_7;
                        stackOut_24_8 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        stackIn_25_4 = stackOut_24_4;
                        stackIn_25_5 = stackOut_24_5;
                        stackIn_25_6 = stackOut_24_6;
                        stackIn_25_7 = stackOut_24_7;
                        stackIn_25_8 = stackOut_24_8;
                        break L9;
                      } else {
                        stackOut_23_0 = (wo[]) ((Object) stackIn_23_0);
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = null;
                        stackOut_23_3 = null;
                        stackOut_23_4 = stackIn_23_4;
                        stackOut_23_5 = stackIn_23_5;
                        stackOut_23_6 = stackIn_23_6;
                        stackOut_23_7 = stackIn_23_7;
                        stackOut_23_8 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        stackIn_25_4 = stackOut_23_4;
                        stackIn_25_5 = stackOut_23_5;
                        stackIn_25_6 = stackOut_23_6;
                        stackIn_25_7 = stackOut_23_7;
                        stackIn_25_8 = stackOut_23_8;
                        break L9;
                      }
                    }
                    stackIn_25_0[stackIn_25_1] = new wo(stackIn_25_4, stackIn_25_5 != 0, stackIn_25_6, stackIn_25_7, stackIn_25_8 != 0, true);
                    var15++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var9);
            stackOut_34_1 = new StringBuilder().append("tr.<init>(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_e = "<col=DE9200>Compete</col>";
        field_d = "This game option is only available to members.";
        field_O = "Friends can be added in multiplayer<nbsp>games";
    }
}
