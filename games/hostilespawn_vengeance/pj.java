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
                if (((pj) this).field_x[var3].field_l >= 0) {
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
          if (param0 < ~((pj) this).field_x[0].field_l) {
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
                      L5: {
                        if (ih.a(((pj) this).field_g[var3], (byte) -106, var10) <= 2) {
                          ((pj) this).field_o = true;
                          ((pj) this).field_x[1 - var3].field_l = -1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var3++;
                      continue L4;
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
        L6: while (true) {
          if (~var5_int <= ~((pj) this).field_t.length) {
            L7: {
              if (r.field_a != 0) {
                break L7;
              } else {
                if (!((pj) this).field_q) {
                  var9 = 0;
                  var5_int = var9;
                  L8: while (true) {
                    if (var9 >= 2) {
                      break L7;
                    } else {
                      L9: {
                        if (((pj) this).field_A[var9]) {
                          break L9;
                        } else {
                          if (ih.a(var10, (byte) -93, ((pj) this).field_m[var9]) >= 2) {
                            break L9;
                          } else {
                            L10: {
                              if (1 == var9) {
                                ca.a((double)((pj) this).field_m[var9].field_e + 1.5, 1, 1.0 + (double)((pj) this).field_m[var9].field_g, true, 192);
                                break L10;
                              } else {
                                ca.a(1.5 + (double)((pj) this).field_m[var9].field_e, 1, (double)(((pj) this).field_m[var9].field_g - -1), true, 192);
                                break L10;
                              }
                            }
                            ((pj) this).field_q = true;
                            break L9;
                          }
                        }
                      }
                      var9++;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L11: {
              if (r.field_a != 0) {
                break L11;
              } else {
                if (!((pj) this).field_q) {
                  break L11;
                } else {
                  if (of.field_d == dn.field_i) {
                    break L11;
                  } else {
                    r.field_a = 1;
                    ((pj) this).field_q = false;
                    kd.a(0, 1);
                    nh.field_E.a((byte) 46, ((pj) this).field_j);
                    break L11;
                  }
                }
              }
            }
            L12: {
              if (var3 <= ((pj) this).field_d) {
                break L12;
              } else {
                L13: {
                  ((pj) this).field_d = var3;
                  if (!((pj) this).field_A[2]) {
                    r.field_a = 1;
                    break L13;
                  } else {
                    L14: {
                      r.field_a = 0;
                      kd.a(4, param0 ^ -2);
                      nh.field_E.a(-1, 8360, -1);
                      if (var3 == 3) {
                        le.field_D = 5;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var5 = ((pj) this).field_h;
                    var6 = 0;
                    L15: while (true) {
                      if (~var5.length >= ~var6) {
                        break L13;
                      } else {
                        L16: {
                          var7 = var5[var6];
                          if (var7 != null) {
                            var7.field_I = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var6++;
                        continue L15;
                      }
                    }
                  }
                }
                L17: {
                  if (ln.field_a.field_g[((oj) var4).field_j.b(-4)] <= 0) {
                    break L17;
                  } else {
                    if (~ln.field_a.field_g[((oj) var4).field_j.b(-4)] == ~ln.field_a.field_g[((pj) this).field_z.field_j.b(-4)]) {
                      L18: {
                        if (((pj) this).field_z.field_i == 27) {
                          ((pj) this).field_z.c((byte) 45);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      ((pj) this).field_r.field_l = -1;
                      ((pj) this).field_B = false;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                if (var3 == 2) {
                  L19: {
                    if (var10.field_g >= 40) {
                      if (var10.field_e >= 48) {
                        ((pj) this).field_i.field_l = 1776;
                        ((pj) this).field_i.field_d = 2136;
                        break L19;
                      } else {
                        ((pj) this).field_i.field_d = 1536;
                        ((pj) this).field_i.field_l = 360;
                        break L19;
                      }
                    } else {
                      ((pj) this).field_i.field_d = 552;
                      ((pj) this).field_i.field_l = 1968;
                      break L19;
                    }
                  }
                  ((pj) this).field_i.field_a = 1;
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            L20: {
              if (3 <= var3) {
                break L20;
              } else {
                le.field_D = 0;
                break L20;
              }
            }
            L21: {
              if (((pj) this).field_n) {
                break L21;
              } else {
                if (0 > ((pj) this).field_k.field_l) {
                  break L21;
                } else {
                  if (ha.field_t != 4) {
                    break L21;
                  } else {
                    if (ih.a(var10, (byte) -93, ((pj) this).field_j) <= 2) {
                      ((pj) this).field_n = true;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
            }
            L22: {
              if (0 == (ng.field_u & 15)) {
                boolean discarded$1 = ((pj) this).a(((pj) this).field_f, param0);
                break L22;
              } else {
                break L22;
              }
            }
            super.d(-1);
            return;
          } else {
            L23: {
              if (((pj) this).field_t[var5_int].field_i == 126) {
                var3++;
                if (!((pj) this).field_A[var5_int]) {
                  var4 = (Object) (Object) ((pj) this).field_t[var5_int];
                  ((pj) this).field_A[var5_int] = true;
                  break L23;
                } else {
                  break L23;
                }
              } else {
                break L23;
              }
            }
            var5_int++;
            continue L6;
          }
        }
    }

    final static int a(s param0, s param1, int param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = null;
            stackOut_0_0 = lb.a(0, (byte) 125, param1, false, param0, (String) null, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("pj.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 29280 + ')');
        }
        return stackIn_1_0;
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
          if (var3 >= 2) {
            ((pj) this).field_f = new oc();
            var3 = param0;
            L3: while (true) {
              L4: {
                if (ll.field_a <= var3) {
                  break L4;
                } else {
                  if (wh.field_b[var3].field_i == 0) {
                    if (wh.field_b[var3].field_h == 4) {
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
                            int incrementValue$2 = var3;
                            var3++;
                            ((pj) this).field_h[incrementValue$2] = var5;
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
                        if (var6_int >= 3) {
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
                  if (mm.field_m[var4].field_i == 125) {
                    int incrementValue$3 = var3;
                    var3++;
                    ((pj) this).field_t[incrementValue$3] = mm.field_m[var4];
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
        if (ha.field_t != 4) {
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
