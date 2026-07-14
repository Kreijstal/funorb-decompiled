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
        Object var13 = null;
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
          if ((((tr) this).field_B ^ -1) <= -1) {
            L1: {
              if (!((tr) this).field_o) {
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
              var4 = ((tr) this).field_D.field_l[((tr) this).field_B].field_W;
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
                        if (var5 != -4) {
                          if (-5 == var5) {
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
                            if (var5 == -6) {
                              hj.field_c = hj.field_c + df.field_k;
                              ca.field_g = ca.field_g + 1;
                              break L6;
                            } else {
                              if (-7 == var5) {
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
                                if (((tr) this).field_D.field_r.h(9979) != -1) {
                                  break L0;
                                } else {
                                  if (-101 <= ((tr) this).field_D.field_r.field_n) {
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
            if (((tr) this).field_D.field_r.h(9979) != -1) {
              break L0;
            } else {
              if (-101 <= ((tr) this).field_D.field_r.field_n) {
                break L0;
              } else {
                bm.a(rf.field_o, false, 4);
                break L0;
              }
            }
          } else {
            if (((tr) this).field_D.field_r.h(9979) != -1) {
              break L0;
            } else {
              if (-101 <= ((tr) this).field_D.field_r.field_n) {
                break L0;
              } else {
                bm.a(rf.field_o, false, 4);
                break L0;
              }
            }
          }
        }
        L7: {
          var3 = ((tr) this).field_D.b(-6133);
          if (null != fo.field_e) {
            break L7;
          } else {
            if (-2 == (((tr) this).field_D.field_r.h(9979) ^ -1)) {
              bm.a(up.field_B[var3 % up.field_B.length], false, 4);
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
                if ((((tr) this).field_z.c(true) ^ -1) >= -1) {
                  break L11;
                } else {
                  if (var4 >= 10) {
                    this.a((pp) (Object) ((tr) this).field_z.b((byte) -43), (byte) 11);
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
                  if ((((tr) this).field_z.c(true) ^ -1) >= -4) {
                    break L10;
                  } else {
                    this.a((pp) (Object) ((tr) this).field_z.b((byte) -43), (byte) 11);
                    continue L12;
                  }
                }
              }
            }
            L13: {
              var5_long = gk.a(100);
              var7_long = var5_long - ((tr) this).field_j;
              var9 = (long)(-400 + 20 * var4);
              if ((var9 ^ -1L) <= (var7_long ^ -1L)) {
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
                  if (-1 >= (((tr) this).field_B ^ -1)) {
                    L20: {
                      if (!((tr) this).field_o) {
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
                          if (var7 == -2) {
                            gi.field_u = gi.field_u + c.field_h;
                            aj.field_e = aj.field_e - 1;
                            break L22;
                          } else {
                            if (-3 == var7) {
                              c.field_h = c.field_h + 1;
                              gi.field_u = gi.field_u - aj.field_e;
                              break L22;
                            } else {
                              if (var7 != 3) {
                                if ((var7 ^ -1) != -5) {
                                  if (var7 == -6) {
                                    pn.field_R = pn.field_R + c.field_h;
                                    aj.field_e = aj.field_e + 1;
                                    break L22;
                                  } else {
                                    if (-7 != var7) {
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
                          if (-2 == var7) {
                            ki.field_c = ki.field_c + 1;
                            sk.field_b = sk.field_b + re.field_j;
                            break L23;
                          } else {
                            if (-3 != var7) {
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
                          if (var7 == -2) {
                            ca.field_g = ca.field_g - 1;
                            f.field_B = f.field_B - df.field_k;
                            break L24;
                          } else {
                            if (-3 != var7) {
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
            var4 = ((tr) this).field_C | var5 << 911385730;
            break L17;
          }
        }
        L34: {
          L35: {
            stackOut_211_0 = ((tr) this).field_G;
            stackOut_211_1 = ((tr) this).field_m;
            stackOut_211_2 = -120;
            stackIn_215_0 = stackOut_211_0;
            stackIn_215_1 = stackOut_211_1;
            stackIn_215_2 = stackOut_211_2;
            stackIn_212_0 = stackOut_211_0;
            stackIn_212_1 = stackOut_211_1;
            stackIn_212_2 = stackOut_211_2;
            if (!((tr) this).field_o) {
              break L35;
            } else {
              L36: {
                stackOut_212_0 = (am) (Object) stackIn_212_0;
                stackOut_212_1 = (bh) (Object) stackIn_212_1;
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
                  stackOut_213_0 = (am) (Object) stackIn_213_0;
                  stackOut_213_1 = (bh) (Object) stackIn_213_1;
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
                    stackOut_214_0 = (am) (Object) stackIn_214_0;
                    stackOut_214_1 = (bh) (Object) stackIn_214_1;
                    stackOut_214_2 = stackIn_214_2;
                    stackIn_215_0 = stackOut_214_0;
                    stackIn_215_1 = stackOut_214_1;
                    stackIn_215_2 = stackOut_214_2;
                    break L35;
                  }
                }
              }
              stackOut_216_0 = (am) (Object) stackIn_216_0;
              stackOut_216_1 = (bh) (Object) stackIn_216_1;
              stackOut_216_2 = stackIn_216_2;
              stackOut_216_3 = 0;
              stackIn_217_0 = stackOut_216_0;
              stackIn_217_1 = stackOut_216_1;
              stackIn_217_2 = stackOut_216_2;
              stackIn_217_3 = stackOut_216_3;
              break L34;
            }
          }
          stackOut_215_0 = (am) (Object) stackIn_215_0;
          stackOut_215_1 = (bh) (Object) stackIn_215_1;
          stackOut_215_2 = stackIn_215_2;
          stackOut_215_3 = 1;
          stackIn_217_0 = stackOut_215_0;
          stackIn_217_1 = stackOut_215_1;
          stackIn_217_2 = stackOut_215_2;
          stackIn_217_3 = stackOut_215_3;
          break L34;
        }
        L37: {
          ((am) (Object) stackIn_217_0).a(stackIn_217_1, (byte) stackIn_217_2, stackIn_217_3 != 0, ((tr) this).field_n);
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
              if ((((tr) this).field_B ^ -1) > -1) {
                break L39;
              } else {
                L40: {
                  stackOut_250_0 = ((tr) this).field_a;
                  stackIn_252_0 = stackOut_250_0;
                  stackIn_251_0 = stackOut_250_0;
                  if (param1) {
                    stackOut_252_0 = (hd) (Object) stackIn_252_0;
                    stackOut_252_1 = 0;
                    stackIn_253_0 = stackOut_252_0;
                    stackIn_253_1 = stackOut_252_1;
                    break L40;
                  } else {
                    stackOut_251_0 = (hd) (Object) stackIn_251_0;
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
                if (jq.a((byte) 29) <= -11) {
                  break L43;
                } else {
                  if (-101 >= ((tr) this).field_D.field_r.field_n) {
                    break L43;
                  } else {
                    if ((((tr) this).field_D.field_r.h(9979) ^ -1) == -2) {
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
                if (-11 < (var3 ^ -1)) {
                  ((tr) this).field_w = true;
                  kh.a(var3, (byte) -84);
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
                if (var3 != -51) {
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
              if (-4 == ((tr) this).field_D.field_j) {
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
                  if ((wg.field_g ^ -1) != -2) {
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
          if (!((tr) this).field_o) {
            break L52;
          } else {
            break L52;
          }
        }
        hj.field_g = false;
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
                  if (-101 < (((tr) this).field_D.field_r.field_n ^ -1)) {
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
              if (-2 == (((tr) this).field_D.field_r.h(9979) ^ -1)) {
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

    private final void d(int param0) {
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
        if (param0 != 0) {
            ((tr) this).field_a = null;
        }
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (10 < ((tr) this).field_H) {
            ((tr) this).field_H = 0;
            ((tr) this).field_x = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 11) {
          var3 = 0;
          L1: while (true) {
            if (-11 >= (var3 ^ -1)) {
              L2: {
                ((tr) this).field_H = ((tr) this).field_H + 1;
                if (0 > ((tr) this).field_B) {
                  ((tr) this).field_j = gk.a(param1 + 83);
                  ((tr) this).field_M = ((tr) this).field_M + 10;
                  break L2;
                } else {
                  if (!param0.b(false, ((tr) this).field_B)) {
                    ((tr) this).field_M = ((tr) this).field_M + (param0.a((byte) 76, ((tr) this).field_B) - 1);
                    break L2;
                  } else {
                    ((tr) this).field_k = ((tr) this).field_a.a((byte) -17, param0.b(((tr) this).field_B, -96));
                    ((tr) this).field_M = 10 + ((tr) this).field_k + (param0.a((byte) 76, ((tr) this).field_B) - 1);
                    ((tr) this).field_j = gk.a(param1 ^ 52);
                    break L2;
                  }
                }
              }
              ((tr) this).field_t = 0;
              ((tr) this).field_g = true;
              return;
            } else {
              boolean discarded$1 = param0.a(((tr) this).field_F, ((tr) this).field_L, 32);
              ((tr) this).field_r = ((tr) this).field_r - 1;
              if (((tr) this).field_r - 1 < 0) {
                L3: {
                  if (!((tr) this).field_g) {
                    if (((tr) this).field_B < 0) {
                      break L3;
                    } else {
                      if (!((tr) this).field_F[((tr) this).field_B]) {
                        break L3;
                      } else {
                        ((tr) this).field_x = ((tr) this).field_x + 1;
                        break L3;
                      }
                    }
                  } else {
                    if (((tr) this).field_B < 0) {
                      break L3;
                    } else {
                      if (!((tr) this).field_F[((tr) this).field_B]) {
                        break L3;
                      } else {
                        ((tr) this).field_x = ((tr) this).field_x + 1;
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  ((tr) this).field_D.a(((tr) this).field_L, param1 ^ 31, ((tr) this).field_F);
                  if (((tr) this).field_B < 0) {
                    break L4;
                  } else {
                    if (-2 != (((tr) this).field_D.field_j ^ -1)) {
                      break L4;
                    } else {
                      if (15 > ((tr) this).field_D.b(-6133) + -(((tr) this).field_D.field_i ^ 4012)) {
                        break L4;
                      } else {
                        this.a(param1 ^ 1231, 10, 245);
                        break L4;
                      }
                    }
                  }
                }
                var4 = 0;
                L5: while (true) {
                  if (((tr) this).field_D.field_l.length > var4) {
                    ((tr) this).field_K[var3][var4].a(((tr) this).field_D.field_r.field_f[var4], 16777215);
                    var4++;
                    continue L5;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, mp param2, int param3) {
        if (param3 != -25220) {
            field_O = null;
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
          if (-1 >= (((tr) this).field_B ^ -1)) {
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
                if (-1 == (var4 ^ -1)) {
                  c.field_h = c.field_h - 1;
                  gi.field_u = gi.field_u + aj.field_e;
                  break L3;
                } else {
                  if (var4 == -2) {
                    gi.field_u = gi.field_u + c.field_h;
                    aj.field_e = aj.field_e - 1;
                    break L3;
                  } else {
                    if (-3 != var4) {
                      if ((var4 ^ -1) == -4) {
                        aj.field_e = aj.field_e + 1;
                        gi.field_u = gi.field_u - c.field_h;
                        break L3;
                      } else {
                        if (var4 == -5) {
                          pn.field_R = pn.field_R + aj.field_e;
                          c.field_h = c.field_h + 1;
                          break L3;
                        } else {
                          if (-6 == var4) {
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
                if (-1 == var4) {
                  qr.field_j = qr.field_j | ki.field_c + sk.field_b << 1872859729;
                  break L4;
                } else {
                  if (1 != var4) {
                    if (-3 != var4) {
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
                          if (-6 == var4) {
                            ca.field_g = ca.field_g + 1;
                            hj.field_c = hj.field_c + df.field_k;
                            break L5;
                          } else {
                            if (6 != var4) {
                              if (-8 == var4) {
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
              if (-1 == var4) {
                mc.field_e = mc.field_e - ci.field_b;
                sl.field_l = sl.field_l - 1;
                break L0;
              } else {
                if (-2 != var4) {
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
                    if (-1 >= (((tr) this).field_B ^ -1)) {
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
                if (((tr) this).field_o) {
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
          if (-1 >= (((tr) this).field_B ^ -1)) {
            break L17;
          } else {
            if (1 != ((tr) this).field_D.field_r.h(9979)) {
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
                  if (!((tr) this).field_G.a(true)) {
                    L22: {
                      var2 = ((tr) this).field_n;
                      ((tr) this).field_n = ((tr) this).field_n + 1;
                      if (((tr) this).field_n >= ((tr) this).field_D.field_l.length) {
                        ((tr) this).field_n = 0;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    ((tr) this).field_G.a((byte) -17, var2, ((tr) this).field_n);
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L18;
                }
              }
              if (((tr) this).field_G.a(true)) {
                break L17;
              } else {
                L23: {
                  var2 = ((tr) this).field_n;
                  ((tr) this).field_n = ((tr) this).field_n - 1;
                  if (-1 < (((tr) this).field_n ^ -1)) {
                    ((tr) this).field_n = -1 + ((tr) this).field_D.field_l.length;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                ((tr) this).field_G.a((byte) -17, var2, ((tr) this).field_n);
                break L17;
              }
            }
          }
        }
        L24: {
          L25: {
            if (!((tr) this).field_o) {
              break L25;
            } else {
              L26: {
                if (eo.field_o) {
                  break L26;
                } else {
                  if (0 > ((tr) this).field_B) {
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              if (0 > ((tr) this).field_B) {
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
            ((tr) this).field_G.a(15481);
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
          ((tr) this).field_G.b((byte) 119);
          break L24;
        }
        L30: {
          if (!((tr) this).field_o) {
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
            ((tr) this).field_C = ((tr) this).field_C | 2;
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
            ((tr) this).field_C = ((tr) this).field_C | 1;
            break L33;
          }
          L35: {
            if (de.field_f == ga.field_fb) {
              ((tr) this).field_D.e(-4);
              break L35;
            } else {
              break L35;
            }
          }
          L36: {
            if (!((tr) this).field_A) {
              break L36;
            } else {
              if (de.field_f != 59) {
                break L36;
              } else {
                if ((((tr) this).field_D.field_j ^ -1) != -4) {
                  break L36;
                } else {
                  ci.field_b = 0;
                  mc.field_e = 0;
                  lj.field_k = 0;
                  sl.field_l = 0;
                  dh.a(((tr) this).field_D.field_e, ((tr) this).field_D.field_l[0].field_H, true);
                  gj.a((byte) -66, false, am.field_n, 20);
                  break L36;
                }
              }
            }
          }
          L37: {
            if (((tr) this).field_A) {
              var2 = lp.h(param0 + -114);
              var3 = var2;
              if (0 != var3) {
                if (1 == var3) {
                  if (!((tr) this).field_o) {
                    ((tr) this).field_D.field_l[((tr) this).field_B].l((byte) -89);
                    break L37;
                  } else {
                    break L37;
                  }
                } else {
                  if (var3 != -3) {
                    if (-4 != var3) {
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
                      if (!((tr) this).field_o) {
                        ((tr) this).field_D.field_l[((tr) this).field_B].field_g = ((tr) this).field_D.field_l[((tr) this).field_B].field_g + 1;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                  } else {
                    if (!((tr) this).field_o) {
                      ((tr) this).field_D.field_l[((tr) this).field_B].d((byte) 4);
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                }
              } else {
                ((tr) this).field_D.a(30113, false);
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
        ((tr) this).field_D.a(param0, (byte) 102);
        if (param1 < 99) {
            ((tr) this).b(-118, -59);
        }
        ((tr) this).field_g = false;
    }

    final void a(int param0, pp param1) {
        if (param0 <= -((tr) this).field_M + ((tr) this).field_u) {
            // ifeq L28
        } else {
            ((tr) this).field_z.a((li) (Object) param1, false);
            return;
        }
        this.a(param1, (byte) 11);
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
        String var8_ref = null;
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
            ((tr) this).field_m.a(false, ((tr) this).field_D.field_r);
            break L0;
          }
        }
        L1: {
          if (!mf.a((byte) 126, 64)) {
            var3 = 0;
            L2: while (true) {
              if (var3 >= ((tr) this).field_q.length) {
                var3 = ((tr) this).field_M;
                L3: while (true) {
                  if (((tr) this).field_u <= var3) {
                    break L1;
                  } else {
                    if (mf.a((byte) 126, 512)) {
                      break L1;
                    } else {
                      L4: {
                        if (((tr) this).field_B > -1) {
                          break L4;
                        } else {
                          L5: {
                            var4_int = ((tr) this).field_a.a(true, var3);
                            if (0 != var4_int) {
                              break L5;
                            } else {
                              if ((((tr) this).field_B ^ -1) > -1) {
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
                        if (((tr) this).field_v >= var3) {
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
                if ((var3 ^ -1) > -11) {
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
                stackOut_42_0 = kn.field_h[((tr) this).field_D.field_j].length;
                stackIn_43_0 = stackOut_42_0;
                break L10;
              } else {
                stackOut_41_0 = ((tr) this).field_D.field_e + ((tr) this).field_D.field_c;
                stackIn_43_0 = stackOut_41_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_43_0;
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
                  if (((tr) this).field_D.field_z <= var7_int) {
                    break L14;
                  } else {
                    L16: {
                      if (var7_int == ((tr) this).field_B) {
                        if (-1 == (1 << var7_int & ((tr) this).field_D.field_t ^ -1)) {
                          if (0 != (1 << var7_int & ((tr) this).field_D.field_u)) {
                            var8_ref = cd.field_c;
                            break L16;
                          } else {
                            if (!((tr) this).field_D.field_a) {
                              if (0 != (((tr) this).field_D.field_d & 1 << var7_int)) {
                                var8_ref = rb.field_b;
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
                          if (!((tr) this).field_i) {
                            var8_ref = bm.field_A;
                            break L16;
                          } else {
                            var8_ref = ue.field_H;
                            break L16;
                          }
                        }
                      } else {
                        var15 = ((tr) this).field_D.field_w[var7_int];
                        var8_ref = var15;
                        var8_ref = var15;
                        var8_ref = var15;
                        if (0 == (1 << var7_int & ((tr) this).field_h)) {
                          if (0 != (1 << var7_int & ((tr) this).field_D.field_t)) {
                            if (!((tr) this).field_i) {
                              var8_ref = Vertigo2.a(new String[1], gn.field_e, 9);
                              break L16;
                            } else {
                              var8_ref = Vertigo2.a(new String[1], me.field_d, param1 ^ 19);
                              break L16;
                            }
                          } else {
                            if ((1 << var7_int & ((tr) this).field_D.field_u) == 0) {
                              if (!((tr) this).field_D.field_a) {
                                if (0 != (((tr) this).field_D.field_d & 1 << var7_int)) {
                                  var8_ref = Vertigo2.a(new String[1], mo.field_c, -120);
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
                              var8_ref = Vertigo2.a(new String[1], ca.field_e, param1 ^ -109);
                              break L16;
                            }
                          }
                        } else {
                          if ((1 << var7_int & ((tr) this).field_D.field_u) == 0) {
                            var8_ref = Vertigo2.a(new String[1], mn.field_p, -115);
                            break L16;
                          } else {
                            var8_ref = Vertigo2.a(new String[1], kd.field_m, 121);
                            break L16;
                          }
                        }
                      }
                    }
                    va.field_s.a(616, param1 ^ 65, 16777215, var7_int * 14 + 140, -1, var8_ref);
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
              if (!((tr) this).field_o) {
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
              var7 = ((tr) this).field_D.field_l[((tr) this).field_n];
              if (null == va.field_s) {
                break L22;
              } else {
                if (0 > ((tr) this).field_n) {
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
                          tk.field_c.a("Predicitons per frame: " + (((tr) this).field_u + -((tr) this).field_M), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          tk.field_c.a("Keys Out Packets: " + ((tr) this).field_a.a(16777215), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          if (((tr) this).field_J <= 0) {
                            break L28;
                          } else {
                            tk.field_c.a("Auth Updates/Sec: " + ((tr) this).field_y / ((tr) this).field_J, var10, var8, 65280, -1);
                            break L28;
                          }
                        }
                        L29: {
                          var8 = var8 + var9;
                          if (0 < ((tr) this).field_z.c(true)) {
                            tk.field_c.a("Auth Packets delayed: " + ((tr) this).field_z.c(true), var10, var8, 65280, -1);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          var8 = var8 + var9;
                          tk.field_c.a("Gameupdates per tic: " + (int)(0.5f + ((tr) this).field_E), var10, var8, 65280, -1);
                          var8 = var8 + var9;
                          if ((((tr) this).field_H ^ -1) < -1) {
                            tk.field_c.a("Avg Dont updates: " + ((tr) this).field_x / ((tr) this).field_H, var10, var8, 65280, -1);
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
                      int discarded$3 = ((tr) this).field_a.a(((tr) this).field_M, 20, (byte) 51, var8, 30);
                      break L22;
                    }
                  }
                }
              }
            }
            va.b(127);
            return;
          } else {
            if (var5 != ((tr) this).field_B) {
              var6_ref_wo = ((tr) this).field_D.field_l[var5];
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
                          ((tr) this).field_m.field_f[var5].field_E = var11_int + var10_ref_rn.field_l;
                          ((tr) this).field_m.field_f[var5].field_y = var12 + var10_ref_rn.field_g;
                          ((tr) this).field_m.field_f[var5].field_k = var10_ref_rn.field_s + var13;
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
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        wo[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        wo stackIn_22_2 = null;
        wo stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        boolean stackIn_22_7 = false;
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
        int stackIn_24_8 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        wo[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        wo stackOut_21_2 = null;
        wo stackOut_21_3 = null;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        int stackOut_21_6 = 0;
        boolean stackOut_21_7 = false;
        wo[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        wo stackOut_23_2 = null;
        wo stackOut_23_3 = null;
        int stackOut_23_4 = 0;
        int stackOut_23_5 = 0;
        int stackOut_23_6 = 0;
        boolean stackOut_23_7 = false;
        int stackOut_23_8 = 0;
        wo[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        wo stackOut_22_2 = null;
        wo stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        boolean stackOut_22_7 = false;
        int stackOut_22_8 = 0;
        L0: {
          ((tr) this).field_I = 0.0f;
          ((tr) this).field_c = false;
          ((tr) this).field_E = 1.0f;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((tr) this).field_o = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
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
          ((tr) this).field_i = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (2 > fn.field_z) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((tr) this).field_A = stackIn_9_1 != 0;
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
          var9 = t.field_l;
          t.field_l = 0;
          var10 = var9;
          var11 = rg.field_f % 4;
          var12 = (-t.field_l + var10) * 4;
          t.field_l = var10;
          if (var11 == 0) {
            var13 = var12 / 2;
            hj.field_c = hj.field_c + (var12 - var13);
            f.field_B = f.field_B + var13;
            break L3;
          } else {
            if (1 != var11) {
              if (-3 == (var11 ^ -1)) {
                f.field_B = f.field_B + var12;
                break L3;
              } else {
                if (var11 != 3) {
                  break L3;
                } else {
                  hj.field_c = hj.field_c + var12;
                  break L3;
                }
              }
            } else {
              var13 = var12 / 3;
              hj.field_c = hj.field_c + var13;
              f.field_B = f.field_B + (var12 + -var13);
              break L3;
            }
          }
        }
        ((tr) this).field_D = new lj(param1, ((tr) this).field_B, param4, param5, param6, param7, false, param3);
        ((tr) this).field_m = ((tr) this).field_D.c((byte) -116);
        ((tr) this).field_G = new am(param4, ((tr) this).field_D.field_l.length, param1);
        var9 = param1.length;
        ((tr) this).field_a = new hd(((tr) this).field_B, var9);
        ((tr) this).field_K = new wo[10][var9];
        ((tr) this).field_p = new boolean[var9];
        ((tr) this).field_q = new int[var9];
        ((tr) this).field_F = new boolean[var9];
        ((tr) this).field_L = new int[var9];
        var10 = 0;
        L4: while (true) {
          if (var10 >= var9) {
            L5: {
              if (-1 > ((tr) this).field_B) {
                break L5;
              } else {
                ((tr) this).field_n = ((tr) this).field_B;
                break L5;
              }
            }
            L6: {
              ((tr) this).field_s = 50;
              if (param4 != 0) {
                break L6;
              } else {
                if ((param6 ^ -1) <= -11) {
                  break L6;
                } else {
                  ((tr) this).field_w = true;
                  kh.a(param6, (byte) -84);
                  break L6;
                }
              }
            }
            ((tr) this).field_z = new nj();
            ((tr) this).field_g = true;
          } else {
            var15 = 0;
            var11 = var15;
            L7: while (true) {
              if (10 <= var15) {
                var10++;
                continue L4;
              } else {
                L8: {
                  stackOut_21_0 = ((tr) this).field_K[var15];
                  stackOut_21_1 = var10;
                  stackOut_21_2 = null;
                  stackOut_21_3 = null;
                  stackOut_21_4 = ((tr) this).field_D.field_l[var10].field_l;
                  stackOut_21_5 = 0;
                  stackOut_21_6 = var10;
                  stackOut_21_7 = ((tr) this).field_o;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  stackIn_23_4 = stackOut_21_4;
                  stackIn_23_5 = stackOut_21_5;
                  stackIn_23_6 = stackOut_21_6;
                  stackIn_23_7 = stackOut_21_7;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  stackIn_22_4 = stackOut_21_4;
                  stackIn_22_5 = stackOut_21_5;
                  stackIn_22_6 = stackOut_21_6;
                  stackIn_22_7 = stackOut_21_7;
                  if (-3 != param4) {
                    stackOut_23_0 = (wo[]) (Object) stackIn_23_0;
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = null;
                    stackOut_23_3 = null;
                    stackOut_23_4 = stackIn_23_4;
                    stackOut_23_5 = stackIn_23_5;
                    stackOut_23_6 = stackIn_23_6;
                    stackOut_23_7 = stackIn_23_7;
                    stackOut_23_8 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    stackIn_24_4 = stackOut_23_4;
                    stackIn_24_5 = stackOut_23_5;
                    stackIn_24_6 = stackOut_23_6;
                    stackIn_24_7 = stackOut_23_7;
                    stackIn_24_8 = stackOut_23_8;
                    break L8;
                  } else {
                    stackOut_22_0 = (wo[]) (Object) stackIn_22_0;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = null;
                    stackOut_22_3 = null;
                    stackOut_22_4 = stackIn_22_4;
                    stackOut_22_5 = stackIn_22_5;
                    stackOut_22_6 = stackIn_22_6;
                    stackOut_22_7 = stackIn_22_7;
                    stackOut_22_8 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    stackIn_24_4 = stackOut_22_4;
                    stackIn_24_5 = stackOut_22_5;
                    stackIn_24_6 = stackOut_22_6;
                    stackIn_24_7 = stackOut_22_7;
                    stackIn_24_8 = stackOut_22_8;
                    break L8;
                  }
                }
                new wo(stackIn_24_4, stackIn_24_5 != 0, stackIn_24_6, stackIn_24_7, stackIn_24_8 != 0, true);
                stackIn_24_0[stackIn_24_1] = stackIn_24_2;
                var15++;
                continue L7;
              }
            }
          }
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
