/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    short[] field_M;
    short[] field_s;
    static String field_o;
    static dd field_C;
    short field_w;
    short[] field_t;
    int field_m;
    short[] field_F;
    int field_b;
    short[] field_P;
    short[] field_Q;
    int[] field_d;
    int[] field_G;
    short[] field_n;
    short[] field_q;
    int[] field_v;
    short[] field_D;
    int[] field_O;
    static vg field_y;
    short[] field_i;
    private boolean field_a;
    int[] field_z;
    int field_k;
    short field_p;
    short[] field_K;
    byte field_h;
    int[] field_g;
    short[] field_f;
    static int[] field_R;
    int[] field_c;
    short[] field_l;
    int[] field_L;
    int field_A;
    int[] field_I;
    int field_B;
    short[] field_N;
    short[] field_E;
    short[] field_u;
    short[] field_x;
    int field_e;
    short field_j;
    byte[] field_J;
    static String field_H;
    short[] field_r;

    public static void c(int param0) {
        int var1 = 55 % ((param0 - 9) / 40);
        field_H = null;
        field_C = null;
        field_R = null;
        field_o = null;
        field_y = null;
    }

    final void b(int param0) {
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
        var12 = fleas.field_A ? 1 : 0;
        if (((si) this).field_a) {
          return;
        } else {
          ((si) this).field_a = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((si) this).field_w) {
              L1: {
                if (param0 == -23443) {
                  break L1;
                } else {
                  ((si) this).field_K = null;
                  break L1;
                }
              }
              ((si) this).field_A = var4;
              ((si) this).field_e = var3;
              ((si) this).field_k = var6;
              ((si) this).field_B = var5;
              ((si) this).field_b = var7;
              ((si) this).field_m = var2;
              return;
            } else {
              L2: {
                var9 = ((si) this).field_n[var8];
                var10 = ((si) this).field_f[var8];
                if (var5 >= var9) {
                  break L2;
                } else {
                  var5 = var9;
                  break L2;
                }
              }
              L3: {
                if (var10 >= var3) {
                  break L3;
                } else {
                  var3 = var10;
                  break L3;
                }
              }
              L4: {
                if (var6 >= var10) {
                  break L4;
                } else {
                  var6 = var10;
                  break L4;
                }
              }
              L5: {
                if (var2 <= var9) {
                  break L5;
                } else {
                  var2 = var9;
                  break L5;
                }
              }
              L6: {
                var11 = ((si) this).field_P[var8];
                if (var11 > var7) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = fleas.field_A ? 1 : 0;
        for (var6 = param4; var6 < ((si) this).field_w; var6++) {
            ((si) this).field_n[var6] = (short)(((si) this).field_n[var6] * param0 / param1);
            ((si) this).field_f[var6] = (short)(param3 * ((si) this).field_f[var6] / param1);
            ((si) this).field_P[var6] = (short)(((si) this).field_P[var6] * param2 / param1);
        }
        this.a(78);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var7 = fleas.field_A ? 1 : 0;
        int var5 = 0;
        int var6 = 15 % ((param3 - -11) / 63);
        while (var5 < ((si) this).field_w) {
            ((si) this).field_n[var5] = (short)(((si) this).field_n[var5] + param1);
            ((si) this).field_f[var5] = (short)(((si) this).field_f[var5] + param0);
            ((si) this).field_P[var5] = (short)(((si) this).field_P[var5] + param2);
            var5++;
        }
        this.a(87);
    }

    private final void a(int param0) {
        if (param0 <= 27) {
            ((si) this).field_q = null;
        }
        ((si) this).field_a = false;
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        ib.field_g = ib.field_g + 65536;
        L0: while (true) {
          if (a.a(hd.field_b, ib.field_g, (byte) -17) < 65536) {
            L1: {
              var2 = -1;
              if (wa.field_k == null) {
                if (of.field_h == null) {
                  break L1;
                } else {
                  var2 = of.field_h.length;
                  break L1;
                }
              } else {
                var2 = wa.field_k.length;
                break L1;
              }
            }
            L2: {
              if (0 != (var2 ^ -1)) {
                L3: {
                  if (td.field_i >= hd.field_g) {
                    break L3;
                  } else {
                    L4: {
                      td.field_i = td.field_i + 1;
                      if (td.field_i <= hd.field_c) {
                        break L4;
                      } else {
                        if (null != wa.field_k) {
                          if (null != wa.field_k[ql.field_o]) {
                            break L4;
                          } else {
                            td.field_i = td.field_i - 1;
                            break L3;
                          }
                        } else {
                          td.field_i = td.field_i - 1;
                          break L3;
                        }
                      }
                    }
                    if (td.field_i < hd.field_g) {
                      break L3;
                    } else {
                      if (null == wa.field_k[(1 + ql.field_o) % var2]) {
                        td.field_i = td.field_i - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (td.field_i >= hd.field_g) {
                    L6: {
                      t.field_a = ql.field_o;
                      if (rc.field_i) {
                        ql.field_o = ql.field_o + 1;
                        if (var2 <= ql.field_o) {
                          ql.field_o = ql.field_o - var2;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        ql.field_o = ql.field_o - 1;
                        if ((ql.field_o ^ -1) <= -1) {
                          break L6;
                        } else {
                          ql.field_o = ql.field_o + var2;
                          break L6;
                        }
                      }
                    }
                    td.field_i = td.field_i - hd.field_g;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (td.field_i > hd.field_c) {
                  rc.field_i = true;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (null != jg.field_f) {
                L8: {
                  var3 = -(jg.field_f.field_r / 2) + 357;
                  var4 = 0;
                  if (-1 == (jk.field_r ^ -1)) {
                    break L8;
                  } else {
                    if (var3 >= ob.field_e) {
                      break L8;
                    } else {
                      if (var3 + jg.field_f.field_t > ob.field_e) {
                        L9: {
                          if (269 + -jg.field_f.field_w >= pb.field_d) {
                            break L9;
                          } else {
                            if (-270 < (pb.field_d ^ -1)) {
                              td.field_i = hd.field_g;
                              var4 = 1;
                              rc.field_i = false;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if ((pb.field_d ^ -1) >= -587) {
                          break L8;
                        } else {
                          if (pb.field_d < jg.field_f.field_w + 586) {
                            rc.field_i = true;
                            var4 = 1;
                            td.field_i = hd.field_g;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L7;
                } else {
                  if (hd.field_c >= td.field_i) {
                    break L7;
                  } else {
                    if (var3 >= kc.field_b) {
                      break L7;
                    } else {
                      if (kc.field_b < jg.field_f.field_t + var3) {
                        if (ag.field_f <= 269 + -jg.field_f.field_w) {
                          if ((ag.field_f ^ -1) < -587) {
                            if (ag.field_f >= jg.field_f.field_w + 586) {
                              break L7;
                            } else {
                              td.field_i = hd.field_c;
                              break L7;
                            }
                          } else {
                            if ((ag.field_f ^ -1) >= -587) {
                              break L7;
                            } else {
                              if (ag.field_f >= jg.field_f.field_w + 586) {
                                break L7;
                              } else {
                                td.field_i = hd.field_c;
                                break L7;
                              }
                            }
                          }
                        } else {
                          if ((ag.field_f ^ -1) >= -587) {
                            break L7;
                          } else {
                            if (ag.field_f >= jg.field_f.field_w + 586) {
                              break L7;
                            } else {
                              td.field_i = hd.field_c;
                              break L7;
                            }
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            if (param0 > 3) {
              L10: {
                if (!param1) {
                  break L10;
                } else {
                  L11: {
                    ul.field_G.b(109, em.a(ob.field_e, false, pb.field_d), em.a(kc.field_b, false, ag.field_f));
                    if (!ul.field_G.b(-78)) {
                      break L11;
                    } else {
                      if (ul.field_G.field_k != 0) {
                        if (1 != ul.field_G.field_k) {
                          break L11;
                        } else {
                          return 2;
                        }
                      } else {
                        return 3;
                      }
                    }
                  }
                  L12: while (true) {
                    if (!wf.b(-97)) {
                      break L10;
                    } else {
                      L13: {
                        ul.field_G.a(0, true);
                        if (!ul.field_G.b(107)) {
                          break L13;
                        } else {
                          if (ul.field_G.field_k != 0) {
                            if ((ul.field_G.field_k ^ -1) != -2) {
                              break L13;
                            } else {
                              return 1;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      if (ji.field_a != 13) {
                        continue L12;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
              return 0;
            } else {
              return 107;
            }
          } else {
            ib.field_g = ib.field_g - hd.field_b;
            bf.field_b = bf.field_b + 1;
            continue L0;
          }
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var5 = fleas.field_A ? 1 : 0;
        int var4 = -14 / ((param1 - 2) / 51);
        int var3 = 0;
        while (0 < param0) {
            var3 = 1 & param2 | var3 << 590365569;
            param0--;
            param2 = param2 >>> 1;
        }
        return var3;
    }

    si() {
        ((si) this).field_a = false;
        ((si) this).field_h = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[4];
        field_H = "<%0>Spring:<%1> Fleas standing on these are bounced up until they hit something.";
        field_o = "<%0>Blocks:<%1> fleas can walk on these, but can't climb up the sides.";
    }
}
