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
        int var4 = 1 << param1;
        if ((ml.field_z & var4) != 0) {
            return;
        }
        ml.field_z = ml.field_z | var4;
        int var5 = param1;
        if (ln.field_d != null) {
            if (ln.field_d.field_B >= 0) {
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
        bg.field_b.a((li) (Object) new fa(param1), false);
        if (!(((tr) this).field_c)) {
            fg.field_eb.a((li) (Object) new nf(param1, param2, qr.field_j, sk.field_b, re.field_j, ki.field_c), false);
        }
    }

    final void b(int param0, int param1) {
        uh.field_Wb.j(64, 122);
        uh.field_Wb.f(22, 119);
        uh.field_Wb.f(1, -98);
        uh.field_Wb.f(param0, param1 + 24174);
        uh.field_Wb.e(((tr) this).field_D.field_l[((tr) this).field_B].field_H, param1 ^ param1);
        uh.field_Wb.e(mc.field_e, param1 ^ -24066);
        uh.field_Wb.e(sl.field_l, param1 + 24066);
        uh.field_Wb.e(ci.field_b, param1 ^ -24066);
        uh.field_Wb.e(lj.field_k, 0);
    }

    final void b(int param0) {
        if (param0 != -27588) {
            ((tr) this).e(-118);
        }
        if (!(((tr) this).field_o)) {
            throw new IllegalStateException();
        }
        uh.field_Wb.j(61, param0 + 27710);
    }

    final void b(boolean param0) {
        if (!((tr) this).field_o) {
            throw new IllegalStateException();
        }
        uh.field_Wb.j(60, 123);
        if (!param0) {
            ((tr) this).e(113);
        }
    }

    public static void a() {
        field_l = null;
        field_O = null;
        field_d = null;
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
        Object var13 = null;
        int stackIn_4_0 = 0;
        int stackIn_122_0 = 0;
        am stackIn_206_0 = null;
        bh stackIn_206_1 = null;
        int stackIn_206_2 = 0;
        am stackIn_207_0 = null;
        bh stackIn_207_1 = null;
        int stackIn_207_2 = 0;
        am stackIn_208_0 = null;
        bh stackIn_208_1 = null;
        int stackIn_208_2 = 0;
        am stackIn_209_0 = null;
        bh stackIn_209_1 = null;
        int stackIn_209_2 = 0;
        am stackIn_210_0 = null;
        bh stackIn_210_1 = null;
        int stackIn_210_2 = 0;
        am stackIn_211_0 = null;
        bh stackIn_211_1 = null;
        int stackIn_211_2 = 0;
        int stackIn_211_3 = 0;
        hd stackIn_245_0 = null;
        hd stackIn_246_0 = null;
        hd stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        int stackIn_281_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        am stackOut_205_0 = null;
        bh stackOut_205_1 = null;
        int stackOut_205_2 = 0;
        am stackOut_206_0 = null;
        bh stackOut_206_1 = null;
        int stackOut_206_2 = 0;
        am stackOut_207_0 = null;
        bh stackOut_207_1 = null;
        int stackOut_207_2 = 0;
        am stackOut_208_0 = null;
        bh stackOut_208_1 = null;
        int stackOut_208_2 = 0;
        am stackOut_210_0 = null;
        bh stackOut_210_1 = null;
        int stackOut_210_2 = 0;
        int stackOut_210_3 = 0;
        am stackOut_209_0 = null;
        bh stackOut_209_1 = null;
        int stackOut_209_2 = 0;
        int stackOut_209_3 = 0;
        hd stackOut_244_0 = null;
        hd stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        hd stackOut_245_0 = null;
        int stackOut_245_1 = 0;
        int stackOut_280_0 = 0;
        int stackOut_279_0 = 0;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          if (((tr) this).field_B < 0) {
            break L0;
          } else {
            L1: {
              if (!((tr) this).field_o) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_4_0;
              var4 = ((tr) this).field_D.field_l[((tr) this).field_B].field_W;
              if (var3 != 0) {
                var4 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            if (!ln.field_d.field_c) {
              L3: {
                var5 = (de.field_f ^ ln.field_d.field_s) % 8;
                if (0 != var5) {
                  if (1 != var5) {
                    if (var5 == 2) {
                      gi.field_u = gi.field_u - aj.field_e;
                      c.field_h = c.field_h + 1;
                      break L3;
                    } else {
                      if (var5 != 3) {
                        if (var5 == 4) {
                          c.field_h = c.field_h + 1;
                          pn.field_R = pn.field_R + aj.field_e;
                          break L3;
                        } else {
                          if (var5 == 5) {
                            pn.field_R = pn.field_R + c.field_h;
                            aj.field_e = aj.field_e + 1;
                            break L3;
                          } else {
                            if (var5 != 6) {
                              if (7 == var5) {
                                pn.field_R = pn.field_R - c.field_h;
                                aj.field_e = aj.field_e - 1;
                                break L3;
                              } else {
                                break L3;
                              }
                            } else {
                              pn.field_R = pn.field_R - aj.field_e;
                              c.field_h = c.field_h - 1;
                              break L3;
                            }
                          }
                        }
                      } else {
                        gi.field_u = gi.field_u - c.field_h;
                        aj.field_e = aj.field_e + 1;
                        break L3;
                      }
                    }
                  } else {
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    break L3;
                  }
                } else {
                  c.field_h = c.field_h - 1;
                  gi.field_u = gi.field_u + aj.field_e;
                  break L3;
                }
              }
              L4: {
                var5 = (ln.field_d.field_s ^ de.field_f - -var4) % 5;
                if (0 == var5) {
                  qr.field_j = qr.field_j | ki.field_c + sk.field_b << 17;
                  break L4;
                } else {
                  if (1 == var5) {
                    sk.field_b = sk.field_b + re.field_j;
                    ki.field_c = ki.field_c + 1;
                    break L4;
                  } else {
                    if (2 == var5) {
                      ki.field_c = ki.field_c - 1;
                      sk.field_b = sk.field_b - re.field_j;
                      break L4;
                    } else {
                      if (var5 == 3) {
                        re.field_j = re.field_j + 1;
                        sk.field_b = sk.field_b + ki.field_c;
                        break L4;
                      } else {
                        if (var5 != 4) {
                          break L4;
                        } else {
                          re.field_j = re.field_j - 1;
                          sk.field_b = sk.field_b - ki.field_c;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              L5: {
                var5 = (gi.field_u - -(de.field_f * aj.field_e)) % 8;
                if (0 == var5) {
                  df.field_k = df.field_k - 1;
                  f.field_B = f.field_B - ca.field_g;
                  break L5;
                } else {
                  if (var5 == 1) {
                    f.field_B = f.field_B - df.field_k;
                    ca.field_g = ca.field_g - 1;
                    break L5;
                  } else {
                    if (var5 != 2) {
                      if (3 != var5) {
                        if (var5 != 4) {
                          if (var5 == 5) {
                            hj.field_c = hj.field_c + df.field_k;
                            ca.field_g = ca.field_g + 1;
                            break L5;
                          } else {
                            if (var5 == 6) {
                              df.field_k = df.field_k - 1;
                              hj.field_c = hj.field_c - ca.field_g;
                              break L5;
                            } else {
                              if (var5 == 7) {
                                ca.field_g = ca.field_g - 1;
                                hj.field_c = hj.field_c - df.field_k;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        } else {
                          df.field_k = df.field_k + 1;
                          hj.field_c = hj.field_c + ca.field_g;
                          break L5;
                        }
                      } else {
                        ca.field_g = ca.field_g + 1;
                        f.field_B = f.field_B + df.field_k;
                        break L5;
                      }
                    } else {
                      f.field_B = f.field_B + ca.field_g;
                      df.field_k = df.field_k + 1;
                      break L5;
                    }
                  }
                }
              }
              if (0 == var5) {
                mc.field_e = mc.field_e - ci.field_b;
                sl.field_l = sl.field_l - 1;
                break L0;
              } else {
                if (1 != var5) {
                  if (var5 != 2) {
                    if (var5 != 3) {
                      if (var5 == 4) {
                        lj.field_k = lj.field_k + ci.field_b;
                        sl.field_l = sl.field_l + 1;
                        break L0;
                      } else {
                        if (var5 != 5) {
                          if (var5 == 6) {
                            lj.field_k = lj.field_k - ci.field_b;
                            sl.field_l = sl.field_l - 1;
                            break L0;
                          } else {
                            if (var5 != 7) {
                              break L0;
                            } else {
                              lj.field_k = lj.field_k - sl.field_l;
                              ci.field_b = ci.field_b - 1;
                              break L0;
                            }
                          }
                        } else {
                          ci.field_b = ci.field_b + 1;
                          lj.field_k = lj.field_k + sl.field_l;
                          break L0;
                        }
                      }
                    } else {
                      ci.field_b = ci.field_b + 1;
                      mc.field_e = mc.field_e + sl.field_l;
                      break L0;
                    }
                  } else {
                    mc.field_e = mc.field_e + ci.field_b;
                    sl.field_l = sl.field_l + 1;
                    break L0;
                  }
                } else {
                  mc.field_e = mc.field_e - sl.field_l;
                  ci.field_b = ci.field_b - 1;
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L6: {
          if (((tr) this).field_D.field_r.h(9979) != 0) {
            break L6;
          } else {
            if (((tr) this).field_D.field_r.field_n >= 100) {
              break L6;
            } else {
              int discarded$5 = 4;
              bm.a(rf.field_o, false);
              break L6;
            }
          }
        }
        L7: {
          var3 = ((tr) this).field_D.b(-6133);
          if (null != fo.field_e) {
            break L7;
          } else {
            if (((tr) this).field_D.field_r.h(9979) == 1) {
              int discarded$6 = 4;
              bm.a(up.field_B[var3 % up.field_B.length], false);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          ((tr) this).field_s = ((tr) this).field_s - 1;
          if (((tr) this).field_s == 0) {
            ((tr) this).field_y = ((tr) this).field_y + (((tr) this).field_D.field_q + -((tr) this).field_N);
            ((tr) this).field_s = 50;
            ((tr) this).field_J = ((tr) this).field_J + 1;
            ((tr) this).field_N = ((tr) this).field_D.field_q;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (!((tr) this).field_o) {
            ((tr) this).field_E = 1.0f;
            break L9;
          } else {
            L10: {
              L11: {
                var4 = -((tr) this).field_M + ((tr) this).field_u;
                if (((tr) this).field_z.c(true) <= 0) {
                  break L11;
                } else {
                  if (var4 >= 10) {
                    int discarded$7 = 11;
                    this.a((pp) (Object) ((tr) this).field_z.b((byte) -43));
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              if (3 >= ((tr) this).field_z.c(true)) {
                break L10;
              } else {
                L12: while (true) {
                  if (((tr) this).field_z.c(true) <= 3) {
                    break L10;
                  } else {
                    int discarded$8 = 11;
                    this.a((pp) (Object) ((tr) this).field_z.b((byte) -43));
                    continue L12;
                  }
                }
              }
            }
            L13: {
              var5_long = gk.a(100);
              var7_long = var5_long - ((tr) this).field_j;
              var9 = (long)(-400 + 20 * var4);
              if (~var9 <= ~var7_long) {
                if (var9 > var7_long) {
                  ((tr) this).field_E = ((tr) this).field_E - 0.009999999776482582f;
                  break L13;
                } else {
                  if (((tr) this).field_E >= 1.0f) {
                    if (((tr) this).field_E > 1.0f) {
                      ((tr) this).field_E = ((tr) this).field_E - 0.009999999776482582f;
                      break L13;
                    } else {
                      break L13;
                    }
                  } else {
                    ((tr) this).field_E = ((tr) this).field_E + 0.009999999776482582f;
                    break L13;
                  }
                }
              } else {
                ((tr) this).field_E = ((tr) this).field_E + 0.009999999776482582f;
                break L13;
              }
            }
            L14: {
              var11 = -1.0f + ((tr) this).field_E;
              if (var11 * var11 <= 0.00009999999747378752f) {
                ((tr) this).field_E = 1.0f;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (((tr) this).field_E > 5.0f) {
                ((tr) this).field_E = 5.0f;
                break L15;
              } else {
                break L15;
              }
            }
            if (((tr) this).field_E < 0.009999999776482582f) {
              ((tr) this).field_E = 0.009999999776482582f;
              break L9;
            } else {
              break L9;
            }
          }
        }
        L16: {
          ((tr) this).field_I = ((tr) this).field_I + ((tr) this).field_E;
          var4 = 0;
          if (param1) {
            break L16;
          } else {
            var13 = null;
            ((tr) this).a((mi) null, 48);
            break L16;
          }
        }
        L17: {
          if (!param0) {
            break L17;
          } else {
            L18: {
              if (!((tr) this).field_o) {
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
                  if (((tr) this).field_B >= 0) {
                    L20: {
                      if (!((tr) this).field_o) {
                        stackOut_121_0 = 0;
                        stackIn_122_0 = stackOut_121_0;
                        break L20;
                      } else {
                        stackOut_120_0 = 1;
                        stackIn_122_0 = stackOut_120_0;
                        break L20;
                      }
                    }
                    L21: {
                      var5 = stackIn_122_0;
                      var6 = ((tr) this).field_D.field_l[((tr) this).field_B].field_W;
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
                          if (var7 == 1) {
                            gi.field_u = gi.field_u + c.field_h;
                            aj.field_e = aj.field_e - 1;
                            break L22;
                          } else {
                            if (var7 == 2) {
                              c.field_h = c.field_h + 1;
                              gi.field_u = gi.field_u - aj.field_e;
                              break L22;
                            } else {
                              if (var7 != 3) {
                                if (var7 != 4) {
                                  if (var7 == 5) {
                                    pn.field_R = pn.field_R + c.field_h;
                                    aj.field_e = aj.field_e + 1;
                                    break L22;
                                  } else {
                                    if (var7 != 6) {
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
                          if (var7 == 1) {
                            ki.field_c = ki.field_c + 1;
                            sk.field_b = sk.field_b + re.field_j;
                            break L23;
                          } else {
                            if (var7 != 2) {
                              if (3 != var7) {
                                if (var7 != 4) {
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
                          qr.field_j = qr.field_j | sk.field_b - -ki.field_c << 17;
                          break L23;
                        }
                      }
                      L24: {
                        var7 = (gi.field_u - -(de.field_f * aj.field_e)) % 8;
                        if (var7 == 0) {
                          f.field_B = f.field_B - ca.field_g;
                          df.field_k = df.field_k - 1;
                          break L24;
                        } else {
                          if (var7 == 1) {
                            ca.field_g = ca.field_g - 1;
                            f.field_B = f.field_B - df.field_k;
                            break L24;
                          } else {
                            if (var7 != 2) {
                              if (var7 != 3) {
                                if (var7 == 4) {
                                  df.field_k = df.field_k + 1;
                                  hj.field_c = hj.field_c + ca.field_g;
                                  break L24;
                                } else {
                                  if (var7 != 5) {
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
                            if (var7 == 3) {
                              ci.field_b = ci.field_b + 1;
                              mc.field_e = mc.field_e + sl.field_l;
                              break L19;
                            } else {
                              if (var7 == 4) {
                                lj.field_k = lj.field_k + ci.field_b;
                                sl.field_l = sl.field_l + 1;
                                break L19;
                              } else {
                                if (5 != var7) {
                                  if (var7 != 6) {
                                    if (var7 != 7) {
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
                if (!((tr) this).field_o) {
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
                  var6 = ((tr) this).field_G.a((byte) -126);
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
                var5 = var5 | lp.field_B[var6 % 4];
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
            var4 = ((tr) this).field_C | var5 << 2;
            break L17;
          }
        }
        L34: {
          L35: {
            stackOut_205_0 = ((tr) this).field_G;
            stackOut_205_1 = ((tr) this).field_m;
            stackOut_205_2 = -120;
            stackIn_209_0 = stackOut_205_0;
            stackIn_209_1 = stackOut_205_1;
            stackIn_209_2 = stackOut_205_2;
            stackIn_206_0 = stackOut_205_0;
            stackIn_206_1 = stackOut_205_1;
            stackIn_206_2 = stackOut_205_2;
            if (!((tr) this).field_o) {
              break L35;
            } else {
              L36: {
                stackOut_206_0 = (am) (Object) stackIn_206_0;
                stackOut_206_1 = (bh) (Object) stackIn_206_1;
                stackOut_206_2 = stackIn_206_2;
                stackIn_210_0 = stackOut_206_0;
                stackIn_210_1 = stackOut_206_1;
                stackIn_210_2 = stackOut_206_2;
                stackIn_207_0 = stackOut_206_0;
                stackIn_207_1 = stackOut_206_1;
                stackIn_207_2 = stackOut_206_2;
                if (il.field_a) {
                  break L36;
                } else {
                  stackOut_207_0 = (am) (Object) stackIn_207_0;
                  stackOut_207_1 = (bh) (Object) stackIn_207_1;
                  stackOut_207_2 = stackIn_207_2;
                  stackIn_210_0 = stackOut_207_0;
                  stackIn_210_1 = stackOut_207_1;
                  stackIn_210_2 = stackOut_207_2;
                  stackIn_208_0 = stackOut_207_0;
                  stackIn_208_1 = stackOut_207_1;
                  stackIn_208_2 = stackOut_207_2;
                  if (tf.a((byte) 65)) {
                    break L36;
                  } else {
                    stackOut_208_0 = (am) (Object) stackIn_208_0;
                    stackOut_208_1 = (bh) (Object) stackIn_208_1;
                    stackOut_208_2 = stackIn_208_2;
                    stackIn_209_0 = stackOut_208_0;
                    stackIn_209_1 = stackOut_208_1;
                    stackIn_209_2 = stackOut_208_2;
                    break L35;
                  }
                }
              }
              stackOut_210_0 = (am) (Object) stackIn_210_0;
              stackOut_210_1 = (bh) (Object) stackIn_210_1;
              stackOut_210_2 = stackIn_210_2;
              stackOut_210_3 = 0;
              stackIn_211_0 = stackOut_210_0;
              stackIn_211_1 = stackOut_210_1;
              stackIn_211_2 = stackOut_210_2;
              stackIn_211_3 = stackOut_210_3;
              break L34;
            }
          }
          stackOut_209_0 = (am) (Object) stackIn_209_0;
          stackOut_209_1 = (bh) (Object) stackIn_209_1;
          stackOut_209_2 = stackIn_209_2;
          stackOut_209_3 = 1;
          stackIn_211_0 = stackOut_209_0;
          stackIn_211_1 = stackOut_209_1;
          stackIn_211_2 = stackOut_209_2;
          stackIn_211_3 = stackOut_209_3;
          break L34;
        }
        L37: {
          ((am) (Object) stackIn_211_0).a(stackIn_211_1, (byte) stackIn_211_2, stackIn_211_3 != 0, ((tr) this).field_n);
          if (!((tr) this).field_D.field_r.f(17940)) {
            var4 = 0;
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          if (((tr) this).field_o) {
            L39: {
              if (((tr) this).field_B < 0) {
                break L39;
              } else {
                L40: {
                  stackOut_244_0 = ((tr) this).field_a;
                  stackIn_246_0 = stackOut_244_0;
                  stackIn_245_0 = stackOut_244_0;
                  if (param1) {
                    stackOut_246_0 = (hd) (Object) stackIn_246_0;
                    stackOut_246_1 = 0;
                    stackIn_247_0 = stackOut_246_0;
                    stackIn_247_1 = stackOut_246_1;
                    break L40;
                  } else {
                    stackOut_245_0 = (hd) (Object) stackIn_245_0;
                    stackOut_245_1 = 1;
                    stackIn_247_0 = stackOut_245_0;
                    stackIn_247_1 = stackOut_245_1;
                    break L40;
                  }
                }
                ((hd) (Object) stackIn_247_0).a(stackIn_247_1 != 0);
                break L39;
              }
            }
            L41: while (true) {
              if (((tr) this).field_I < 1.0f) {
                L42: {
                  if (((tr) this).field_B >= 0) {
                    ((tr) this).field_a.a(((tr) this).field_u, var4, 7829367);
                    break L42;
                  } else {
                    break L42;
                  }
                }
                ((tr) this).field_C = 0;
                break L38;
              } else {
                ((tr) this).field_u = ((tr) this).field_u + 1;
                ((tr) this).field_I = ((tr) this).field_I - 1.0f;
                continue L41;
              }
            }
          } else {
            L43: {
              ((tr) this).field_C = 0;
              if (!((tr) this).field_w) {
                break L43;
              } else {
                if (jq.a((byte) 29) >= 10) {
                  break L43;
                } else {
                  if (((tr) this).field_D.field_r.field_n <= 100) {
                    break L43;
                  } else {
                    if (((tr) this).field_D.field_r.h(9979) == 1) {
                      ((tr) this).field_w = false;
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                }
              }
            }
            L44: {
              ((tr) this).field_L[((tr) this).field_B] = var4;
              var5 = var3;
              ((tr) this).field_D.a(((tr) this).field_L, 20, ((tr) this).field_F);
              var3 = ((tr) this).field_D.b(-6133);
              if (var5 == var3) {
                break L44;
              } else {
                if (var3 < 10) {
                  ((tr) this).field_w = true;
                  int discarded$9 = -84;
                  kh.a(var3);
                  break L44;
                } else {
                  break L44;
                }
              }
            }
            L45: {
              if (((tr) this).field_D.field_j == 0) {
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
                if (var3 != 50) {
                  break L45;
                } else {
                  this.a(1220, 8, 247);
                  break L45;
                }
              } else {
                break L45;
              }
            }
            if (!((tr) this).field_D.c(-3317)) {
              break L38;
            } else {
              if (((tr) this).field_D.field_j == 3) {
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
          if (!((tr) this).field_o) {
            break L50;
          } else {
            L51: {
              j.field_p = ol.field_D;
              if (eo.field_o) {
                break L51;
              } else {
                if (1 >= wg.field_g) {
                  if (wg.field_g != 1) {
                    j.field_p = bl.field_q;
                    break L51;
                  } else {
                    j.field_p = ci.field_c;
                    break L51;
                  }
                } else {
                  j.field_p = Vertigo2.a(new String[1], ao.field_P, -127);
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
          L53: {
            if (!((tr) this).field_o) {
              break L53;
            } else {
              if (!param0) {
                break L53;
              } else {
                if (tf.a((byte) 86)) {
                  break L53;
                } else {
                  L54: {
                    if (!il.field_a) {
                      break L54;
                    } else {
                      if (0 > ((tr) this).field_B) {
                        break L54;
                      } else {
                        break L53;
                      }
                    }
                  }
                  L55: {
                    hj.field_g = false;
                    var5 = qe.field_W.field_t;
                    if (ed.field_n < 0) {
                      break L55;
                    } else {
                      if ((float)ed.field_n >= np.field_Nb * 2.0f) {
                        break L55;
                      } else {
                        if (~gb.field_d > ~(-4 + -var5 + td.field_c.field_C)) {
                          break L55;
                        } else {
                          if (gb.field_d < -4 + td.field_c.field_C) {
                            hj.field_g = true;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                      }
                    }
                  }
                  L56: {
                    if (1 != kf.field_c) {
                      break L56;
                    } else {
                      if (!hj.field_g) {
                        break L56;
                      } else {
                        L57: {
                          if (eo.field_o) {
                            stackOut_280_0 = 0;
                            stackIn_281_0 = stackOut_280_0;
                            break L57;
                          } else {
                            stackOut_279_0 = 1;
                            stackIn_281_0 = stackOut_279_0;
                            break L57;
                          }
                        }
                        eo.field_o = stackIn_281_0 != 0;
                        if (eo.field_o) {
                          wg.field_g = 0;
                          break L56;
                        } else {
                          break L52;
                        }
                      }
                    }
                  }
                  break L52;
                }
              }
            }
          }
          hj.field_g = false;
          break L52;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var2 = ((tr) this).field_D.b(-6133);
          if (qe.field_U.length <= var2) {
            break L0;
          } else {
            if (((tr) this).field_D.field_j != 0) {
              break L0;
            } else {
              L1: {
                if (((tr) this).field_w) {
                  var3 = qe.field_U[var2];
                  var4 = 320;
                  var5 = tk.field_c.a(var3, var4, 0);
                  var6 = 20;
                  var7 = 20;
                  var8 = 170;
                  rq.a(30 + var5 + 2 * var7, var4 - -(var6 * 2), var8 - var7, -(var4 / 2) + 320 - var6, -62, 150);
                  int discarded$1 = tk.field_c.a(var3, 320 + -(var4 / 2), var8, var4, var5, 16777215, -1, 1, 1, 0);
                  var8 = var8 + (var7 / 2 + var5);
                  bi.b(320 - (var4 + -30) / 2, var8, var4 + -30, 5921370);
                  if (((tr) this).field_D.field_r.field_n < 100) {
                    break L1;
                  } else {
                    if (1 == ((tr) this).field_D.field_r.h(9979)) {
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
              if (((tr) this).field_D.field_r.h(9979) == 1) {
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
            ((tr) this).field_c = true;
            break L2;
          }
        }
    }

    final void a(int param0) {
        if (!((tr) this).field_o) {
            throw new IllegalStateException();
        }
        uh.field_Wb.j(59, 119);
        int var2 = -114 / ((45 - param0) / 43);
    }

    final void e(int param0) {
        ((tr) this).field_G.c((byte) 122);
        if (param0 > -62) {
            ((tr) this).field_C = 108;
        }
    }

    private final void d() {
        if (uh.field_Xb == null) {
            if (((tr) this).field_D.field_l[((tr) this).field_B].field_W > 0) {
                if (!((tr) this).field_c) {
                    uh.field_Xb = new vi(0, 65535, gi.field_u, pn.field_R, aj.field_e, c.field_h, new int[1]);
                    if (!ag.b(49)) {
                        nr.a(3, -22754, uh.field_Xb);
                    }
                }
            }
        }
        ((tr) this).field_a = null;
    }

    final void a(int param0, int param1) {
        if (param0 != 16) {
            return;
        }
        ((tr) this).field_r = param1;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 == 2) {
          L0: {
            if (((tr) this).field_o) {
              break L0;
            } else {
              L1: {
                if (((tr) this).field_D.field_j != 0) {
                  break L1;
                } else {
                  int discarded$5 = 0;
                  this.d();
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

    private final void a(pp param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (10 < ((tr) this).field_H) {
                ((tr) this).field_H = 0;
                ((tr) this).field_x = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= 10) {
                L3: {
                  ((tr) this).field_H = ((tr) this).field_H + 1;
                  if (0 > ((tr) this).field_B) {
                    ((tr) this).field_j = gk.a(94);
                    ((tr) this).field_M = ((tr) this).field_M + 10;
                    break L3;
                  } else {
                    if (!param0.b(false, ((tr) this).field_B)) {
                      ((tr) this).field_M = ((tr) this).field_M + (param0.a((byte) 76, ((tr) this).field_B) - 1);
                      break L3;
                    } else {
                      ((tr) this).field_k = ((tr) this).field_a.a((byte) -17, param0.b(((tr) this).field_B, -96));
                      ((tr) this).field_M = 10 + ((tr) this).field_k + (param0.a((byte) 76, ((tr) this).field_B) - 1);
                      ((tr) this).field_j = gk.a(63);
                      break L3;
                    }
                  }
                }
                ((tr) this).field_t = 0;
                ((tr) this).field_g = true;
                break L0;
              } else {
                L4: {
                  boolean discarded$2 = param0.a(((tr) this).field_F, ((tr) this).field_L, 32);
                  int fieldTemp$3 = ((tr) this).field_r - 1;
                  ((tr) this).field_r = ((tr) this).field_r - 1;
                  if (fieldTemp$3 >= 0) {
                    break L4;
                  } else {
                    L5: {
                      if (!((tr) this).field_g) {
                        break L5;
                      } else {
                        if (var3_int != 9) {
                          break L5;
                        } else {
                          if (param0.field_z == ((tr) this).field_D.field_r.g(127)) {
                            break L5;
                          } else {
                            lf.d(88, 0);
                            rm.b((byte) -79);
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (((tr) this).field_B < 0) {
                        break L6;
                      } else {
                        if (!((tr) this).field_F[((tr) this).field_B]) {
                          break L6;
                        } else {
                          ((tr) this).field_x = ((tr) this).field_x + 1;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      ((tr) this).field_D.a(((tr) this).field_L, 20, ((tr) this).field_F);
                      if (((tr) this).field_B < 0) {
                        break L7;
                      } else {
                        if (((tr) this).field_D.field_j != 1) {
                          break L7;
                        } else {
                          if (15 > ((tr) this).field_D.b(-6133) + -(((tr) this).field_D.field_i ^ 4012)) {
                            break L7;
                          } else {
                            this.a(1220, 10, 245);
                            break L7;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    L8: while (true) {
                      if (((tr) this).field_D.field_l.length <= var4) {
                        break L4;
                      } else {
                        ((tr) this).field_K[var3_int][var4].a(((tr) this).field_D.field_r.field_f[var4], 16777215);
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("tr.C(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + 11 + ')');
        }
    }

    final static void a(int param0, int param1, mp param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("tr.R(").append(0).append(',').append(0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -25220 + ')');
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
          if (((tr) this).field_B >= 0) {
            L1: {
              if (!((tr) this).field_o) {
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
              var3 = ((tr) this).field_D.field_l[((tr) this).field_B].field_W;
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
                if (var4 == 0) {
                  c.field_h = c.field_h - 1;
                  gi.field_u = gi.field_u + aj.field_e;
                  break L3;
                } else {
                  if (var4 == 1) {
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    break L3;
                  } else {
                    if (var4 != 2) {
                      if (var4 == 3) {
                        aj.field_e = aj.field_e + 1;
                        gi.field_u = gi.field_u - c.field_h;
                        break L3;
                      } else {
                        if (var4 == 4) {
                          pn.field_R = pn.field_R + aj.field_e;
                          c.field_h = c.field_h + 1;
                          break L3;
                        } else {
                          if (var4 == 5) {
                            aj.field_e = aj.field_e + 1;
                            pn.field_R = pn.field_R + c.field_h;
                            break L3;
                          } else {
                            if (var4 == 6) {
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
                if (var4 == 0) {
                  qr.field_j = qr.field_j | ki.field_c + sk.field_b << 17;
                  break L4;
                } else {
                  if (1 != var4) {
                    if (var4 != 2) {
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
                    if (var4 != 2) {
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
                          if (var4 == 5) {
                            ca.field_g = ca.field_g + 1;
                            hj.field_c = hj.field_c + df.field_k;
                            break L5;
                          } else {
                            if (6 != var4) {
                              if (var4 == 7) {
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
              if (var4 == 0) {
                mc.field_e = mc.field_e - ci.field_b;
                sl.field_l = sl.field_l - 1;
                break L0;
              } else {
                if (var4 != 1) {
                  if (var4 != 2) {
                    if (var4 != 3) {
                      if (var4 != 4) {
                        if (var4 != 5) {
                          if (var4 == 6) {
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
              if (de.field_f == 13) {
                L9: {
                  var2 = 1;
                  if (((tr) this).field_D.field_r.field_w == 0) {
                    L10: {
                      if (((tr) this).field_D.field_r.h(9979) == 3) {
                        break L10;
                      } else {
                        if (4 == ((tr) this).field_D.field_r.h(param0 ^ 9864)) {
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
                  if (!((tr) this).field_o) {
                    break L11;
                  } else {
                    if (((tr) this).field_B >= 0) {
                      if (!((tr) this).field_D.field_a) {
                        if (1 != ((tr) this).field_D.field_j) {
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
                  if (((tr) this).field_o) {
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
                            if (~oo.field_c.length >= ~var3) {
                              break L8;
                            } else {
                              L14: {
                                var4 = (oo.field_c[var3] & 16711680) >> 16;
                                var5 = (65280 & oo.field_c[var3]) >> 8;
                                var6 = oo.field_c[var3] & 255;
                                var7 = (var5 + (var6 + var4)) / 3;
                                if (var7 >= 79) {
                                  if (var7 >= 90) {
                                    oo.field_c[var3] = 16777215;
                                    break L14;
                                  } else {
                                    oo.field_c[var3] = om.a(var7, om.a(var7 << 8, var7 << 16));
                                    break L14;
                                  }
                                } else {
                                  oo.field_c[var3] = 0;
                                  break L14;
                                }
                              }
                              var3++;
                              continue L13;
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
                if (((tr) this).field_o) {
                  break L6;
                } else {
                  if (ji.field_r <= 0) {
                    break L6;
                  } else {
                    cp.field_b = cp.field_b.substring(1) + ji.field_r;
                    if (cp.field_b.equalsIgnoreCase("noir")) {
                      L15: {
                        if (gi.field_r) {
                          stackOut_109_0 = 0;
                          stackIn_110_0 = stackOut_109_0;
                          break L15;
                        } else {
                          stackOut_108_0 = 1;
                          stackIn_110_0 = stackOut_108_0;
                          break L15;
                        }
                      }
                      gi.field_r = stackIn_110_0 != 0;
                      var2_float = 1.399999976158142f;
                      oo.b(var2_float);
                      if (!gi.field_r) {
                        break L7;
                      } else {
                        var3 = 0;
                        L16: while (true) {
                          if (~oo.field_c.length >= ~var3) {
                            break L8;
                          } else {
                            L17: {
                              var4 = (oo.field_c[var3] & 16711680) >> 16;
                              var5 = (65280 & oo.field_c[var3]) >> 8;
                              var6 = oo.field_c[var3] & 255;
                              var7 = (var5 + (var6 + var4)) / 3;
                              if (var7 >= 79) {
                                if (var7 >= 90) {
                                  oo.field_c[var3] = 16777215;
                                  break L17;
                                } else {
                                  oo.field_c[var3] = om.a(var7, om.a(var7 << 8, var7 << 16));
                                  break L17;
                                }
                              } else {
                                oo.field_c[var3] = 0;
                                break L17;
                              }
                            }
                            var3++;
                            continue L16;
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
            L18: while (true) {
              if (~var3 <= ~Vertigo2.field_J.length) {
                break L6;
              } else {
                qq.a(oo.field_c, 0, Vertigo2.field_J[var3], 0, oo.field_c.length);
                var3++;
                continue L18;
              }
            }
          }
          mn.a(false);
          break L6;
        }
        L19: {
          if (((tr) this).field_B >= 0) {
            break L19;
          } else {
            if (1 != ((tr) this).field_D.field_r.h(9979)) {
              break L19;
            } else {
              L20: {
                L21: {
                  if (s.field_y != de.field_f) {
                    break L21;
                  } else {
                    if (!eo.field_o) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                if (am.field_t != de.field_f) {
                  L22: {
                    L23: {
                      if (ga.field_gb != de.field_f) {
                        break L23;
                      } else {
                        if (!eo.field_o) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    if (de.field_f == od.field_Mb) {
                      break L22;
                    } else {
                      break L19;
                    }
                  }
                  if (!((tr) this).field_G.a(true)) {
                    L24: {
                      var2 = ((tr) this).field_n;
                      ((tr) this).field_n = ((tr) this).field_n + 1;
                      if (((tr) this).field_n >= ((tr) this).field_D.field_l.length) {
                        ((tr) this).field_n = 0;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    ((tr) this).field_G.a((byte) -17, var2, ((tr) this).field_n);
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  break L20;
                }
              }
              if (((tr) this).field_G.a(true)) {
                break L19;
              } else {
                L25: {
                  var2 = ((tr) this).field_n;
                  ((tr) this).field_n = ((tr) this).field_n - 1;
                  if (((tr) this).field_n < 0) {
                    ((tr) this).field_n = -1 + ((tr) this).field_D.field_l.length;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                ((tr) this).field_G.a((byte) -17, var2, ((tr) this).field_n);
                break L19;
              }
            }
          }
        }
        L26: {
          L27: {
            if (!((tr) this).field_o) {
              break L27;
            } else {
              L28: {
                if (eo.field_o) {
                  break L28;
                } else {
                  if (0 > ((tr) this).field_B) {
                    break L27;
                  } else {
                    break L28;
                  }
                }
              }
              if (0 > ((tr) this).field_B) {
                break L26;
              } else {
                if (il.field_a) {
                  break L26;
                } else {
                  if (tf.a((byte) 123)) {
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
            }
          }
          L29: {
            L30: {
              if (~tn.field_c == ~de.field_f) {
                break L30;
              } else {
                if (bc.field_b != de.field_f) {
                  break L29;
                } else {
                  break L30;
                }
              }
            }
            ((tr) this).field_G.a(15481);
            break L29;
          }
          L31: {
            if (ve.field_a == de.field_f) {
              break L31;
            } else {
              if (~jb.field_y == ~de.field_f) {
                break L31;
              } else {
                break L26;
              }
            }
          }
          ((tr) this).field_G.b((byte) 119);
          break L26;
        }
        L32: {
          if (!((tr) this).field_o) {
            break L32;
          } else {
            if (il.field_a) {
              return;
            } else {
              if (!tf.a((byte) 96)) {
                break L32;
              } else {
                return;
              }
            }
          }
        }
        if (param0 == 115) {
          L33: {
            L34: {
              if (ch.field_k == de.field_f) {
                break L34;
              } else {
                if (~na.field_n != ~de.field_f) {
                  break L33;
                } else {
                  break L34;
                }
              }
            }
            ((tr) this).field_C = ((tr) this).field_C | 2;
            break L33;
          }
          L35: {
            L36: {
              if (de.field_f == ro.field_i) {
                break L36;
              } else {
                if (~om.field_B != ~de.field_f) {
                  break L35;
                } else {
                  break L36;
                }
              }
            }
            ((tr) this).field_C = ((tr) this).field_C | 1;
            break L35;
          }
          L37: {
            if (~de.field_f == ~ga.field_fb) {
              ((tr) this).field_D.e(-4);
              break L37;
            } else {
              break L37;
            }
          }
          L38: {
            if (!((tr) this).field_A) {
              break L38;
            } else {
              if (de.field_f != 59) {
                break L38;
              } else {
                if (((tr) this).field_D.field_j != 3) {
                  break L38;
                } else {
                  ci.field_b = 0;
                  mc.field_e = 0;
                  lj.field_k = 0;
                  sl.field_l = 0;
                  int discarded$2 = 1;
                  dh.a(((tr) this).field_D.field_e, ((tr) this).field_D.field_l[0].field_H);
                  gj.a((byte) -66, false, am.field_n, 20);
                  break L38;
                }
              }
            }
          }
          L39: {
            if (((tr) this).field_A) {
              var2 = lp.h(param0 + -114);
              var3 = var2;
              if (0 != var3) {
                if (1 == var3) {
                  if (!((tr) this).field_o) {
                    ((tr) this).field_D.field_l[((tr) this).field_B].l((byte) -89);
                    break L39;
                  } else {
                    break L39;
                  }
                } else {
                  if (var3 != 2) {
                    if (var3 != 3) {
                      if (var3 != 4) {
                        if (var3 != 5) {
                          if (var3 == 6) {
                            m.d(param0 + 5, 20, 300);
                            break L39;
                          } else {
                            if (var3 == 7) {
                              tk.a(param0 ^ -116, 0, 0, il.field_e, wo.field_S);
                              break L39;
                            } else {
                              if (var3 == 8) {
                                va.a(20, (byte) 125);
                                break L39;
                              } else {
                                if (9 == var3) {
                                  va.a(50, (byte) 124);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                            }
                          }
                        } else {
                          kq.a((byte) -40);
                          break L39;
                        }
                      } else {
                        int discarded$3 = -68;
                        mr.a();
                        break L39;
                      }
                    } else {
                      if (!((tr) this).field_o) {
                        ((tr) this).field_D.field_l[((tr) this).field_B].field_g = ((tr) this).field_D.field_l[((tr) this).field_B].field_g + 1;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                  } else {
                    if (!((tr) this).field_o) {
                      ((tr) this).field_D.field_l[((tr) this).field_B].d((byte) 4);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
              } else {
                ((tr) this).field_D.a(30113, false);
                break L39;
              }
            } else {
              break L39;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(mi param0, int param1) {
        try {
            ((tr) this).field_D.a(param0, (byte) 102);
            if (param1 < 99) {
                ((tr) this).b(-118, -59);
            }
            ((tr) this).field_g = false;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tr.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
              if (param0 > -((tr) this).field_M + ((tr) this).field_u) {
                break L1;
              } else {
                if (!((tr) this).field_z.a(false)) {
                  break L1;
                } else {
                  int discarded$2 = 11;
                  this.a(param1);
                  break L0;
                }
              }
            }
            ((tr) this).field_z.a((li) (Object) param1, false);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("tr.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
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
        int stackIn_41_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_92_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        L0: {
          var14 = Vertigo2.field_L ? 1 : 0;
          if (mf.a((byte) 126, 512)) {
            break L0;
          } else {
            ((tr) this).field_m.a(false, ((tr) this).field_D.field_r);
            break L0;
          }
        }
        L1: {
          if (!mf.a((byte) 126, 64)) {
            var3 = 0;
            L2: while (true) {
              if (~var3 <= ~((tr) this).field_q.length) {
                var3 = ((tr) this).field_M;
                L3: while (true) {
                  if (((tr) this).field_u <= var3) {
                    break L1;
                  } else {
                    if (mf.a((byte) 126, 512)) {
                      break L1;
                    } else {
                      L4: {
                        if (((tr) this).field_B < 0) {
                          break L4;
                        } else {
                          L5: {
                            var4_int = ((tr) this).field_a.a(true, var3);
                            if (var4_int != -1) {
                              break L5;
                            } else {
                              if (((tr) this).field_B < 0) {
                                break L5;
                              } else {
                                break L1;
                              }
                            }
                          }
                          ((tr) this).field_q[((tr) this).field_B] = var4_int;
                          break L4;
                        }
                      }
                      L6: {
                        var4_int = 0;
                        if (~((tr) this).field_v <= ~var3) {
                          break L6;
                        } else {
                          ((tr) this).field_v = var3;
                          var4_int = 1;
                          break L6;
                        }
                      }
                      boolean discarded$2 = ((tr) this).field_m.a(false, ((tr) this).field_p, 128, ((tr) this).field_q, var4_int != 0);
                      var3++;
                      continue L3;
                    }
                  }
                }
              } else {
                ((tr) this).field_q[var3] = 0;
                var3++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        L7: {
          if (!((tr) this).field_o) {
            break L7;
          } else {
            if (1 != ((tr) this).field_m.h(param1 ^ -9953)) {
              break L7;
            } else {
              L8: {
                var3 = ((tr) this).field_t;
                if (var3 < 10) {
                  break L8;
                } else {
                  var3 = 9;
                  break L8;
                }
              }
              ((tr) this).field_m.a(((tr) this).field_K[var3], ((tr) this).field_B, param1 + -22719);
              break L7;
            }
          }
        }
        var16 = ((tr) this).field_D.field_r.m(9384);
        var4 = ((tr) this).field_m.m(param1 ^ -9396);
        var5 = 0;
        L9: while (true) {
          if (((tr) this).field_D.field_l.length <= var5) {
            L10: {
              if (kn.field_h[((tr) this).field_D.field_j].length <= ((tr) this).field_D.field_e - -((tr) this).field_D.field_c) {
                stackOut_40_0 = kn.field_h[((tr) this).field_D.field_j].length;
                stackIn_41_0 = stackOut_40_0;
                break L10;
              } else {
                stackOut_39_0 = ((tr) this).field_D.field_e + ((tr) this).field_D.field_c;
                stackIn_41_0 = stackOut_39_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_41_0;
              var6 = ((tr) this).field_D.b(-6133);
              ((tr) this).field_G.a(((tr) this).field_B, -((tr) this).field_D.field_e + var5, 1 + (-((tr) this).field_D.field_e + var6), true, ((tr) this).field_m, ((tr) this).field_D.field_f, ((tr) this).field_D.field_g, var6, ((tr) this).field_n);
              ((tr) this).field_t = ((tr) this).field_t + 1;
              if (param1 == -28) {
                break L11;
              } else {
                ((tr) this).field_J = -79;
                break L11;
              }
            }
            L12: {
              if (mf.a((byte) 126, 128)) {
                L13: {
                  if (((tr) this).field_b != null) {
                    break L13;
                  } else {
                    ((tr) this).field_b = new er(640, 480);
                    break L13;
                  }
                }
                ((tr) this).field_b.d();
                ((tr) this).field_G.a(((tr) this).field_B, -((tr) this).field_D.field_e + var5, 1 + (var6 - ((tr) this).field_D.field_e), true, ((tr) this).field_D.field_r, ((tr) this).field_D.field_f, ((tr) this).field_D.field_g, var6, ((tr) this).field_n);
                ro.field_g.a(-125);
                ((tr) this).field_b.d(0, 0, 128);
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              if (!((tr) this).field_o) {
                break L14;
              } else {
                var7_int = 0;
                L15: while (true) {
                  if (~((tr) this).field_D.field_z >= ~var7_int) {
                    break L14;
                  } else {
                    L16: {
                      L17: {
                        if (~var7_int == ~((tr) this).field_B) {
                          if ((1 << var7_int & ((tr) this).field_D.field_t) == 0) {
                            if (0 != (1 << var7_int & ((tr) this).field_D.field_u)) {
                              var8_ref_String = cd.field_c;
                              break L17;
                            } else {
                              if (((tr) this).field_D.field_a) {
                                break L16;
                              } else {
                                if (0 != (((tr) this).field_D.field_d & 1 << var7_int)) {
                                  var8_ref_String = rb.field_b;
                                  break L17;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          } else {
                            if (!((tr) this).field_i) {
                              var8_ref_String = bm.field_A;
                              break L17;
                            } else {
                              var8_ref_String = ue.field_H;
                              break L17;
                            }
                          }
                        } else {
                          var15 = ((tr) this).field_D.field_w[var7_int];
                          var8_ref_String = var15;
                          var8_ref_String = var15;
                          var8_ref_String = var15;
                          if (0 == (1 << var7_int & ((tr) this).field_h)) {
                            if (0 != (1 << var7_int & ((tr) this).field_D.field_t)) {
                              if (!((tr) this).field_i) {
                                var8_ref_String = Vertigo2.a(new String[1], gn.field_e, 9);
                                break L17;
                              } else {
                                var8_ref_String = Vertigo2.a(new String[1], me.field_d, param1 ^ 19);
                                break L17;
                              }
                            } else {
                              if ((1 << var7_int & ((tr) this).field_D.field_u) == 0) {
                                if (((tr) this).field_D.field_a) {
                                  break L16;
                                } else {
                                  if (0 != (((tr) this).field_D.field_d & 1 << var7_int)) {
                                    var8_ref_String = Vertigo2.a(new String[1], mo.field_c, -120);
                                    break L17;
                                  } else {
                                    break L16;
                                  }
                                }
                              } else {
                                var8_ref_String = Vertigo2.a(new String[1], ca.field_e, param1 ^ -109);
                                break L17;
                              }
                            }
                          } else {
                            if ((1 << var7_int & ((tr) this).field_D.field_u) == 0) {
                              var8_ref_String = Vertigo2.a(new String[1], mn.field_p, -115);
                              break L17;
                            } else {
                              var8_ref_String = Vertigo2.a(new String[1], kd.field_m, 121);
                              break L17;
                            }
                          }
                        }
                      }
                      va.field_s.a(616, param1 ^ 65, 16777215, var7_int * 14 + 140, -1, var8_ref_String);
                      break L16;
                    }
                    var7_int++;
                    continue L15;
                  }
                }
              }
            }
            L18: {
              if (param0) {
                this.c(param1 ^ -112);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (!((tr) this).field_o) {
                break L19;
              } else {
                L20: {
                  L21: {
                    L22: {
                      if (!hj.field_g) {
                        break L22;
                      } else {
                        if (param0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (wg.field_g <= 0) {
                        break L23;
                      } else {
                        if (rg.field_f % 40 >= 20) {
                          break L23;
                        } else {
                          break L21;
                        }
                      }
                    }
                    stackOut_88_0 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    break L20;
                  }
                  stackOut_87_0 = 1;
                  stackIn_89_0 = stackOut_87_0;
                  break L20;
                }
                L24: {
                  var7_int = stackIn_89_0;
                  var8 = 15;
                  var9 = var8 * 2 + (int)np.field_Nb;
                  var10 = var8 * 2 + tk.field_c.field_z;
                  va.field_s.b(93);
                  qi.a(false, 25, var9, 3 + td.field_c.field_C + -var10);
                  if (var7_int != 0) {
                    stackOut_91_0 = 14586368;
                    stackIn_92_0 = stackOut_91_0;
                    break L24;
                  } else {
                    stackOut_90_0 = 16777215;
                    stackIn_92_0 = stackOut_90_0;
                    break L24;
                  }
                }
                var11_int = stackIn_92_0;
                va.field_s.a(j.field_p, var11_int, -1, var8 + ((int)np.field_Nb / 2 + 25), td.field_c.field_C - var8, 2);
                break L19;
              }
            }
            L25: {
              var7 = ((tr) this).field_D.field_l[((tr) this).field_n];
              if (null == va.field_s) {
                break L25;
              } else {
                if (0 > ((tr) this).field_n) {
                  break L25;
                } else {
                  if (var7 == null) {
                    break L25;
                  } else {
                    L26: {
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
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (mf.a((byte) 126, 2)) {
                        tk.field_c.a("Current Cell:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_E / 128), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_y / 128), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(var7.field_k / 240), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (!mf.a((byte) 126, 4)) {
                        break L28;
                      } else {
                        tk.field_c.a("FPS:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a(Integer.toString(li.field_d), var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        break L28;
                      }
                    }
                    L29: {
                      if (mf.a((byte) 126, 8)) {
                        tk.field_c.a("Memory:", var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        var11 = Runtime.getRuntime();
                        tk.field_c.a("Total: " + var11.totalMemory() / 1000L, var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        tk.field_c.a("Used: " + var11.freeMemory() / 1000L, var10, var8, 16777215, -1);
                        var8 = var8 + var9;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (mf.a((byte) 126, 16)) {
                        L31: {
                          tk.field_c.a("Predictions:", var10, var8, 16777215, -1);
                          var8 = var8 + var9;
                          tk.field_c.a("Predicitons per frame: " + (((tr) this).field_u + -((tr) this).field_M), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          tk.field_c.a("Keys Out Packets: " + ((tr) this).field_a.a(16777215), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          if (((tr) this).field_J <= 0) {
                            break L31;
                          } else {
                            tk.field_c.a("Auth Updates/Sec: " + ((tr) this).field_y / ((tr) this).field_J, var10, var8, 65280, -1);
                            break L31;
                          }
                        }
                        L32: {
                          var8 = var8 + var9;
                          if (0 < ((tr) this).field_z.c(true)) {
                            tk.field_c.a("Auth Packets delayed: " + ((tr) this).field_z.c(true), var10, var8, 65280, -1);
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          var8 = var8 + var9;
                          tk.field_c.a("Gameupdates per tic: " + (int)(0.5f + ((tr) this).field_E), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          if (((tr) this).field_H > 0) {
                            tk.field_c.a("Avg Dont updates: " + ((tr) this).field_x / ((tr) this).field_H, var10, var8, 65280, -1);
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        var8 = var8 + var9;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L34: {
                      if (!mf.a((byte) 126, 256)) {
                        break L34;
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
                        break L34;
                      }
                    }
                    var8 = 480;
                    if (!mf.a((byte) 126, 32)) {
                      break L25;
                    } else {
                      int discarded$3 = ((tr) this).field_a.a(((tr) this).field_M, 20, (byte) 51, var8, 30);
                      break L25;
                    }
                  }
                }
              }
            }
            va.b(127);
            return;
          } else {
            L35: {
              if (~var5 != ~((tr) this).field_B) {
                var6_ref_wo = ((tr) this).field_D.field_l[var5];
                var7_int = 0;
                L36: while (true) {
                  if (var7_int >= 9) {
                    break L35;
                  } else {
                    L37: {
                      var8 = var6_ref_wo.field_P[var7_int];
                      if (var8 < 0) {
                        break L37;
                      } else {
                        if (var8 < var4.length) {
                          var9_ref_rn = var16[var8];
                          if (var9_ref_rn != null) {
                            var10_ref_rn = var4[var8];
                            if (var10_ref_rn == null) {
                              break L37;
                            } else {
                              var11_int = -var9_ref_rn.field_l + var6_ref_wo.field_E;
                              var12 = -var9_ref_rn.field_g + var6_ref_wo.field_y;
                              var13 = -var9_ref_rn.field_s + var6_ref_wo.field_k;
                              ((tr) this).field_m.field_f[var5].field_E = var11_int + var10_ref_rn.field_l;
                              ((tr) this).field_m.field_f[var5].field_y = var12 + var10_ref_rn.field_g;
                              ((tr) this).field_m.field_f[var5].field_k = var10_ref_rn.field_s + var13;
                              break L35;
                            }
                          } else {
                            break L37;
                          }
                        } else {
                          break L37;
                        }
                      }
                    }
                    var7_int++;
                    continue L36;
                  }
                }
              } else {
                break L35;
              }
            }
            var5++;
            continue L9;
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
        ((tr) this).field_I = 0.0f;
        ((tr) this).field_c = false;
        ((tr) this).field_E = 1.0f;
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
              ((tr) this).field_o = stackIn_4_1 != 0;
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
              ((tr) this).field_i = stackIn_7_1 != 0;
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
              ((tr) this).field_A = stackIn_10_1 != 0;
              ((tr) this).field_B = param2;
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
                  if (var11 == 2) {
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
            ((tr) this).field_D = new lj(param1, ((tr) this).field_B, param4, param5, param6, param7, false, param3);
            ((tr) this).field_m = ((tr) this).field_D.c((byte) -116);
            ((tr) this).field_G = new am(param4, ((tr) this).field_D.field_l.length, param1);
            var9_int = param1.length;
            ((tr) this).field_a = new hd(((tr) this).field_B, var9_int);
            ((tr) this).field_K = new wo[10][var9_int];
            ((tr) this).field_p = new boolean[var9_int];
            ((tr) this).field_q = new int[var9_int];
            ((tr) this).field_F = new boolean[var9_int];
            ((tr) this).field_L = new int[var9_int];
            var10 = 0;
            L5: while (true) {
              if (~var10 <= ~var9_int) {
                L6: {
                  if (((tr) this).field_B < 0) {
                    break L6;
                  } else {
                    ((tr) this).field_n = ((tr) this).field_B;
                    break L6;
                  }
                }
                L7: {
                  ((tr) this).field_s = 50;
                  if (param4 != 0) {
                    break L7;
                  } else {
                    if (param6 >= 10) {
                      break L7;
                    } else {
                      ((tr) this).field_w = true;
                      int discarded$1 = -84;
                      kh.a(param6);
                      break L7;
                    }
                  }
                }
                ((tr) this).field_z = new nj();
                ((tr) this).field_g = true;
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
                      stackOut_22_0 = ((tr) this).field_K[var15];
                      stackOut_22_1 = var10;
                      stackOut_22_2 = null;
                      stackOut_22_3 = null;
                      stackOut_22_4 = ((tr) this).field_D.field_l[var10].field_l;
                      stackOut_22_5 = 0;
                      stackOut_22_6 = var10;
                      stackOut_22_7 = ((tr) this).field_o;
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
                      if (param4 != 2) {
                        stackOut_24_0 = (wo[]) (Object) stackIn_24_0;
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
                        stackOut_23_0 = (wo[]) (Object) stackIn_23_0;
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
            stackOut_34_0 = (RuntimeException) var9;
            stackOut_34_1 = new StringBuilder().append("tr.<init>(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<col=DE9200>Compete</col>";
        field_d = "This game option is only available to members.";
        field_O = "Friends can be added in multiplayer<nbsp>games";
    }
}
