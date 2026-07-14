/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends ql {
    static int field_e;
    private oc[] field_m;
    private boolean[] field_A;
    private v field_y;
    private oj[] field_h;
    private boolean field_u;
    private v field_s;
    private v field_i;
    private boolean field_o;
    private boolean field_w;
    private v field_r;
    private oc field_j;
    private v field_k;
    private oc field_f;
    static int field_v;
    private we[] field_p;
    static bd field_l;
    private boolean field_B;
    private boolean field_n;
    private v[] field_x;
    private oc[] field_g;
    private oj field_z;
    private boolean field_q;
    private oj[] field_t;
    private int field_d;

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (((pj) this).field_u) {
            if (((pj) this).field_y.a((byte) -52)) {
              break L0;
            } else {
              ((pj) this).field_u = false;
              ((pj) this).field_y.field_l = -1;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (!((pj) this).field_w) {
            break L1;
          } else {
            if (!((pj) this).field_s.a((byte) -82)) {
              ((pj) this).field_w = false;
              ((pj) this).field_s.field_l = -1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!((pj) this).field_B) {
            break L2;
          } else {
            if (!((pj) this).field_r.a((byte) -75)) {
              ((pj) this).field_r.field_l = -1;
              ((pj) this).field_B = false;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          var2 = 125 / ((param0 - -48) / 38);
          if (((pj) this).field_o) {
            var3 = 0;
            L4: while (true) {
              if (2 <= var3) {
                break L3;
              } else {
                if (-1 >= (((pj) this).field_x[var3].field_l ^ -1)) {
                  if (!((pj) this).field_x[var3].a((byte) -74)) {
                    ((pj) this).field_o = false;
                    ((pj) this).field_x[var3].field_l = -1;
                    var3++;
                    continue L4;
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          } else {
            break L3;
          }
        }
        L5: {
          if (((pj) this).field_n) {
            L6: {
              if (0 != r.field_a) {
                break L6;
              } else {
                if (((pj) this).field_k.a((byte) -125)) {
                  break L6;
                } else {
                  ((pj) this).field_n = false;
                  ((pj) this).field_k.field_l = 0;
                  break L6;
                }
              }
            }
            ((pj) this).field_i.e(-125);
            break L5;
          } else {
            ((pj) this).field_i.e(-125);
            break L5;
          }
        }
    }

    final void d(int param0) {
        int var3 = 0;
        Object var4 = null;
        oj var4_ref = null;
        int var5_int = 0;
        oj[] var5 = null;
        int var6 = 0;
        oj var7 = null;
        int var8 = 0;
        int var9 = 0;
        oc var10 = null;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          if (0 > ((pj) this).field_y.field_l) {
            break L0;
          } else {
            if (!kh.field_Q[4]) {
              break L0;
            } else {
              ((pj) this).field_u = true;
              break L0;
            }
          }
        }
        L1: {
          if (((pj) this).field_r.field_l < 0) {
            break L1;
          } else {
            if (!((pj) this).field_B) {
              if (!((pj) this).field_z.field_n) {
                break L1;
              } else {
                ((pj) this).field_B = true;
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        L2: {
          var10 = mm.field_m[0].field_j;
          if (((pj) this).field_s.field_l < 0) {
            break L2;
          } else {
            if (kh.field_Q[5]) {
              ((pj) this).field_w = true;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param0 < (((pj) this).field_x[0].field_l ^ -1)) {
            break L3;
          } else {
            if (((pj) this).field_o) {
              break L3;
            } else {
              if (r.field_a != 0) {
                var3 = 0;
                L4: while (true) {
                  if (2 <= var3) {
                    break L3;
                  } else {
                    if (((pj) this).field_o) {
                      break L3;
                    } else {
                      if (ih.a(((pj) this).field_g[var3], (byte) -106, var10) <= 2) {
                        ((pj) this).field_o = true;
                        ((pj) this).field_x[1 - var3].field_l = -1;
                        var3++;
                        continue L4;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
          }
        }
        var3 = 0;
        var4 = null;
        var5_int = 0;
        L5: while (true) {
          if (var5_int >= ((pj) this).field_t.length) {
            L6: {
              if (-1 == (r.field_a ^ -1)) {
                if (!((pj) this).field_q) {
                  var9 = 0;
                  var5_int = var9;
                  L7: while (true) {
                    if ((var9 ^ -1) > -3) {
                      if (!((pj) this).field_A[var9]) {
                        if (ih.a(var10, (byte) -93, ((pj) this).field_m[var9]) < 2) {
                          L8: {
                            if (1 == var9) {
                              ca.a((double)((pj) this).field_m[var9].field_e + 1.5, 1, 1.0 + (double)((pj) this).field_m[var9].field_g, true, 192);
                              break L8;
                            } else {
                              ca.a(1.5 + (double)((pj) this).field_m[var9].field_e, 1, (double)(((pj) this).field_m[var9].field_g - -1), true, 192);
                              break L8;
                            }
                          }
                          ((pj) this).field_q = true;
                          var9++;
                          continue L7;
                        } else {
                          var9++;
                          continue L7;
                        }
                      } else {
                        var9++;
                        continue L7;
                      }
                    } else {
                      if (r.field_a != 0) {
                        break L6;
                      } else {
                        if (!((pj) this).field_q) {
                          break L6;
                        } else {
                          if (of.field_d == dn.field_i) {
                            break L6;
                          } else {
                            r.field_a = 1;
                            ((pj) this).field_q = false;
                            kd.a(0, 1);
                            nh.field_E.a((byte) 46, ((pj) this).field_j);
                            break L6;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (r.field_a != 0) {
                    break L6;
                  } else {
                    if (!((pj) this).field_q) {
                      break L6;
                    } else {
                      if (of.field_d == dn.field_i) {
                        break L6;
                      } else {
                        r.field_a = 1;
                        ((pj) this).field_q = false;
                        kd.a(0, 1);
                        nh.field_E.a((byte) 46, ((pj) this).field_j);
                        break L6;
                      }
                    }
                  }
                }
              } else {
                if (r.field_a != 0) {
                  break L6;
                } else {
                  if (!((pj) this).field_q) {
                    break L6;
                  } else {
                    if (of.field_d == dn.field_i) {
                      break L6;
                    } else {
                      r.field_a = 1;
                      ((pj) this).field_q = false;
                      kd.a(0, 1);
                      nh.field_E.a((byte) 46, ((pj) this).field_j);
                      break L6;
                    }
                  }
                }
              }
            }
            L9: {
              if (var3 <= ((pj) this).field_d) {
                break L9;
              } else {
                L10: {
                  ((pj) this).field_d = var3;
                  if (!((pj) this).field_A[2]) {
                    r.field_a = 1;
                    break L10;
                  } else {
                    L11: {
                      r.field_a = 0;
                      kd.a(4, param0 ^ -2);
                      nh.field_E.a(-1, 8360, -1);
                      if (-4 == (var3 ^ -1)) {
                        le.field_D = 5;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var5 = ((pj) this).field_h;
                    var6 = 0;
                    L12: while (true) {
                      if (var5.length <= var6) {
                        break L10;
                      } else {
                        var7 = var5[var6];
                        if (var7 != null) {
                          var7.field_I = 0;
                          var6++;
                          continue L12;
                        } else {
                          var6++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (-1 <= (ln.field_a.field_g[var4_ref.field_j.b(-4)] ^ -1)) {
                    break L13;
                  } else {
                    if (ln.field_a.field_g[var4_ref.field_j.b(-4)] == ln.field_a.field_g[((pj) this).field_z.field_j.b(-4)]) {
                      L14: {
                        if (((pj) this).field_z.field_i == 27) {
                          ((pj) this).field_z.c((byte) 45);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      ((pj) this).field_r.field_l = -1;
                      ((pj) this).field_B = false;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var3 == 2) {
                  L15: {
                    if (var10.field_g >= 40) {
                      if (-49 >= (var10.field_e ^ -1)) {
                        ((pj) this).field_i.field_l = 1776;
                        ((pj) this).field_i.field_d = 2136;
                        break L15;
                      } else {
                        ((pj) this).field_i.field_d = 1536;
                        ((pj) this).field_i.field_l = 360;
                        break L15;
                      }
                    } else {
                      ((pj) this).field_i.field_d = 552;
                      ((pj) this).field_i.field_l = 1968;
                      break L15;
                    }
                  }
                  ((pj) this).field_i.field_a = 1;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L16: {
              if (3 <= var3) {
                break L16;
              } else {
                le.field_D = 0;
                break L16;
              }
            }
            L17: {
              if (((pj) this).field_n) {
                break L17;
              } else {
                if (0 > ((pj) this).field_k.field_l) {
                  break L17;
                } else {
                  if (ha.field_t != -5) {
                    break L17;
                  } else {
                    if (-3 >= ih.a(var10, (byte) -93, ((pj) this).field_j)) {
                      ((pj) this).field_n = true;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
              }
            }
            L18: {
              if (0 == (ng.field_u & 15)) {
                boolean discarded$1 = ((pj) this).a(((pj) this).field_f, param0 ^ 0);
                break L18;
              } else {
                break L18;
              }
            }
            super.d(-1);
            return;
          } else {
            if (((pj) this).field_t[var5_int].field_i == 126) {
              var3++;
              if (!((pj) this).field_A[var5_int]) {
                var4_ref = ((pj) this).field_t[var5_int];
                ((pj) this).field_A[var5_int] = true;
                var5_int++;
                continue L5;
              } else {
                var5_int++;
                continue L5;
              }
            } else {
              var5_int++;
              continue L5;
            }
          }
        }
    }

    final static int a(s param0, s param1, int param2) {
        if (param2 != 29280) {
            pj.c((byte) 120);
        }
        Object var4 = null;
        return lb.a(0, (byte) 125, param1, false, param0, (String) null, 0);
    }

    public static void c(byte param0) {
        field_l = null;
        if (param0 <= 34) {
            field_v = -116;
        }
    }

    final void e(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        oj var5 = null;
        int var6_int = 0;
        oj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          var16 = ln.field_a.field_v;
          var14 = var16;
          var12 = var14;
          var10 = var12;
          var9 = var10;
          var17 = var9;
          kd.a(0, param0 + 1);
          ((pj) this).field_j = new oc(var16[2], var16[3]);
          nh.field_E.a((byte) 46, ((pj) this).field_j);
          ((pj) this).field_y = new v(m.field_k, var16[4] * 24 + -100, 24 * (-5 + var16[5]) + -30, 200);
          if (kh.field_Q[4]) {
            ((pj) this).field_y.field_l = -1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((pj) this).field_s = new v(bn.field_n, 0, var16[7] * 24, 200);
          ((pj) this).field_s.field_l = 24 * (3 + var16[6]);
          if (kh.field_Q[5]) {
            ((pj) this).field_s.field_l = -1;
            break L1;
          } else {
            break L1;
          }
        }
        ((pj) this).field_r = new v(jj.field_f, 0, 24 * (1 + var16[9]), 200);
        ((pj) this).field_r.field_l = var16[8] * 24 - -48;
        var3 = 0;
        L2: while (true) {
          if (-3 >= (var3 ^ -1)) {
            ((pj) this).field_f = new oc();
            var3 = param0;
            L3: while (true) {
              L4: {
                if (ll.field_a <= var3) {
                  break L4;
                } else {
                  if (wh.field_b[var3].field_i == 0) {
                    if ((wh.field_b[var3].field_h ^ -1) == -5) {
                      ((pj) this).field_f.a((byte) 46, wh.field_b[var3].field_j);
                      break L4;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                }
              }
              var3 = 0;
              var4 = 0;
              L5: while (true) {
                if (var4 >= el.field_j) {
                  ((pj) this).field_m[0] = new oc(var17[14], var17[15]);
                  ((pj) this).field_m[1] = new oc(var17[16], var17[17]);
                  ((pj) this).field_p[0] = new we(((pj) this).field_m[0]);
                  ((pj) this).field_p[1] = new we(((pj) this).field_m[1]);
                  var3 = 0;
                  L6: while (true) {
                    if (2 <= var3) {
                      var3 = 0;
                      var4 = 0;
                      L7: while (true) {
                        if (var4 >= el.field_j) {
                          ((pj) this).field_i = new v(e.field_k, 0, 0);
                          ((pj) this).field_k = new v(vf.field_I, 24 * ((pj) this).field_j.field_e, 24 * (-4 + ((pj) this).field_j.field_g), 200);
                          return;
                        } else {
                          var5 = mm.field_m[var4];
                          if (20 == var5.field_i) {
                            var3++;
                            ((pj) this).field_h[var3] = var5;
                            var4++;
                            continue L7;
                          } else {
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var4 = 1000;
                      var5_int = -1;
                      var6_int = var3;
                      L8: while (true) {
                        if ((var6_int ^ -1) <= -4) {
                          if (var5_int != var3) {
                            var6 = ((pj) this).field_t[var3];
                            ((pj) this).field_t[var3] = ((pj) this).field_t[var5_int];
                            ((pj) this).field_t[var5_int] = var6;
                            var3++;
                            continue L6;
                          } else {
                            var3++;
                            continue L6;
                          }
                        } else {
                          var7 = ih.a(((pj) this).field_m[var3], (byte) -76, ((pj) this).field_t[var6_int].field_j);
                          if (var7 < var4) {
                            var5_int = var6_int;
                            var4 = var7;
                            var6_int++;
                            continue L8;
                          } else {
                            var6_int++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (-126 == (mm.field_m[var4].field_i ^ -1)) {
                    var3++;
                    ((pj) this).field_t[var3] = mm.field_m[var4];
                    var4++;
                    continue L5;
                  } else {
                    if (mm.field_m[var4].field_i == 27) {
                      ((pj) this).field_z = mm.field_m[var4];
                      var4++;
                      continue L5;
                    } else {
                      var4++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            ((pj) this).field_g[var3] = new oc(var9[2 * var3 + 10], var9[11 - -(var3 * 2)]);
            ((pj) this).field_x[var3] = new v(bc.field_k, 0, ((pj) this).field_g[var3].field_g * 24, 200);
            ((pj) this).field_x[var3].field_l = ((pj) this).field_g[var3].field_e * 24 - -48;
            var3++;
            continue L2;
          }
        }
    }

    final String a(boolean param0) {
        if (param0) {
            pj.c((byte) 57);
        }
        if (!(4 != ha.field_t)) {
            return q.field_l;
        }
        return tc.field_c;
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (-5 != (ha.field_t ^ -1)) {
          var2 = -72 / ((param0 - 38) / 53);
          return true;
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((pj) this).field_m.length) {
              return false;
            } else {
              if (126 != ((pj) this).field_t[var2].field_i) {
                ((pj) this).field_p[var2].a((byte) -46);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public pj() {
        ((pj) this).field_h = new oj[4];
        ((pj) this).field_A = new boolean[3];
        ((pj) this).field_m = new oc[2];
        ((pj) this).field_p = new we[2];
        ((pj) this).field_g = new oc[2];
        ((pj) this).field_x = new v[2];
        ((pj) this).field_t = new oj[3];
        ((pj) this).field_d = 0;
    }

    static {
    }
}
