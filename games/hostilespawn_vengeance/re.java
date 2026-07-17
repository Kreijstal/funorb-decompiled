/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class re {
    private int field_m;
    private int field_t;
    private int field_J;
    private boolean field_u;
    private be field_C;
    static ub field_r;
    private bd field_H;
    private le[] field_b;
    private int field_s;
    private int field_e;
    private pb field_z;
    private le[][] field_w;
    private int field_j;
    static bd[][] field_D;
    private boolean field_c;
    private int field_x;
    private th field_F;
    static boolean field_k;
    int field_p;
    private fj field_h;
    th field_E;
    private int field_y;
    private int field_v;
    static String field_B;
    int field_d;
    int field_f;
    private int field_o;
    private int field_a;
    static oj[] field_n;
    boolean field_K;
    private th field_G;
    private int field_g;
    static java.awt.Color field_A;
    static bl field_i;
    static boolean field_l;
    static String field_I;
    static bd field_q;

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          var5 = 35 / ((param1 - -16) / 62);
          var4 = 54;
          if (18 != param0) {
            break L0;
          } else {
            var4 = -11 + -var4 + 640;
            break L0;
          }
        }
        L1: {
          var5 = 325;
          var6 = 8421376;
          if (((re) this).field_K) {
            break L1;
          } else {
            if (!ka.a(var5, 0, 21, 11, var4)) {
              break L1;
            } else {
              L2: {
                if (param0 != 18) {
                  if (this.c(24834)) {
                    break L2;
                  } else {
                    break L1;
                  }
                } else {
                  if (!this.g((byte) 30)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((re) this).field_t = param2;
              ((re) this).field_u = true;
              var6 = 16776960;
              break L1;
            }
          }
        }
        L3: {
          if (((re) this).field_t != param2) {
            break L3;
          } else {
            if (0 == ((re) this).field_j) {
              var6 = 16776960;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          L5: {
            L6: {
              si.b(var4, var5, 11, 21, 2, var6);
              if (param0 != 18) {
                break L6;
              } else {
                if (!this.g((byte) 30)) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (param0 != 17) {
              break L4;
            } else {
              if (this.c(24834)) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          si.a(var4, var5, 11, 21, 0, 192);
          break L4;
        }
        L7: {
          var5 += 5;
          if (param0 == 18) {
            var4 += 2;
            var7 = 1;
            L8: while (true) {
              if (var7 > 6) {
                var7 = 5;
                L9: while (true) {
                  if (var7 < 1) {
                    break L7;
                  } else {
                    si.a(var4, var5, var7, 0);
                    si.e(var4 + var7, var5, 1, 0, 128);
                    var5++;
                    var7--;
                    continue L9;
                  }
                }
              } else {
                si.a(var4, var5, var7, 0);
                si.e(var7 + var4, var5, 1, 0, 128);
                var5++;
                var7++;
                continue L8;
              }
            }
          } else {
            var4 += 9;
            var7 = 1;
            L10: while (true) {
              if (var7 > 6) {
                var7 = 5;
                L11: while (true) {
                  if (var7 < 1) {
                    break L7;
                  } else {
                    si.a(var4 - var7, var5, var7, 0);
                    si.e(-var7 + var4 + -1, var5, 1, 0, 128);
                    var5++;
                    var7--;
                    continue L11;
                  }
                }
              } else {
                si.a(-var7 + var4, var5, var7, 0);
                si.e(-var7 + (var4 + -1), var5, 1, 0, 128);
                var5++;
                var7++;
                continue L10;
              }
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        bd var5_ref_bd = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_10_0 = 0;
        int[] stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        int[] stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        int[] stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_38_0 = 0;
        int[] stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        int[] stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        int[] stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_49_0 = 0;
        int[] stackIn_49_1 = null;
        int stackIn_50_0 = 0;
        int[] stackIn_50_1 = null;
        int stackIn_51_0 = 0;
        int[] stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_54_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_9_1 = null;
        int stackOut_11_0 = 0;
        int[] stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_37_0 = 0;
        int[] stackOut_37_1 = null;
        int stackOut_39_0 = 0;
        int[] stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_38_0 = 0;
        int[] stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_48_0 = 0;
        int[] stackOut_48_1 = null;
        int stackOut_50_0 = 0;
        int[] stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_49_0 = 0;
        int[] stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            ((re) this).field_C = null;
            break L0;
          }
        }
        L1: {
          this.l(-7);
          this.a((byte) -119, ob.field_E.toUpperCase());
          si.d(0, 0, 640, 400);
          var3 = ib.a((byte) -72) ? 1 : 0;
          if (ta.p(3)) {
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 42) {
                break L1;
              } else {
                if (!hb.a(var4, mc.field_E, false)) {
                  var5_ref_bd = ((re) this).field_b[var4].field_Y;
                  if (var5_ref_bd != null) {
                    L3: {
                      var5_ref_bd.a();
                      si.d();
                      stackOut_9_0 = var4;
                      stackOut_9_1 = uk.field_c;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (param1) {
                        stackOut_11_0 = stackIn_11_0;
                        stackOut_11_1 = (int[]) (Object) stackIn_11_1;
                        stackOut_11_2 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L3;
                      } else {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = (int[]) (Object) stackIn_10_1;
                        stackOut_10_2 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        break L3;
                      }
                    }
                    L4: {
                      if (hb.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 == 0)) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var6 = stackIn_15_0;
                      if (var6 != 0) {
                        fj.field_Kb[var4].b(3, 3);
                        break L5;
                      } else {
                        qc.field_v.c(3, 3);
                        if (var4 == ((re) this).field_J) {
                          break L5;
                        } else {
                          var7_int = 0;
                          L6: while (true) {
                            if (var5_ref_bd.field_D.length <= var7_int) {
                              break L5;
                            } else {
                              var5_ref_bd.field_D[var7_int] = he.c(var5_ref_bd.field_D[var7_int], (byte) -127);
                              var7_int++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    L7: {
                      if (((re) this).field_J == var4) {
                        if (var6 == 0) {
                          break L7;
                        } else {
                          var5_ref_bd.e(16776960);
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        if (((re) this).field_x == var4) {
                          break L9;
                        } else {
                          if (((re) this).field_x >= 0) {
                            break L8;
                          } else {
                            if (((re) this).field_J == var4) {
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      var5_ref_bd.a();
                      this.a(-1 + var5_ref_bd.field_A, 0, 0, -18, -1 + var5_ref_bd.field_z);
                      break L8;
                    }
                    ((re) this).field_b[var4].field_Y = var5_ref_bd;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        L10: {
          o.field_n.b((byte) 108);
          this.a(100, (byte) -55, 286, 72, 496);
          si.d(72, 286, 568, 386);
          ((re) this).field_F.a(103, false);
          si.c();
          if (ta.p(3)) {
            id.field_A.b(u.field_a.toUpperCase(), 320, 199, 8421376, -1);
            break L10;
          } else {
            L11: {
              if (((re) this).field_x != -1) {
                break L11;
              } else {
                if (((re) this).field_J != -1) {
                  break L11;
                } else {
                  id.field_A.b(jd.field_i.toUpperCase(), 320, 177, 8421376, -1);
                  break L10;
                }
              }
            }
            L12: {
              this.a(160, (byte) -55, 92, 58, 160);
              this.a(160, (byte) -55, 92, 244, 340);
              var4 = ((re) this).field_x;
              if (var4 != -1) {
                break L12;
              } else {
                var4 = ((re) this).field_J;
                break L12;
              }
            }
            L13: {
              stackOut_37_0 = var4;
              stackOut_37_1 = uk.field_c;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              if (param1) {
                stackOut_39_0 = stackIn_39_0;
                stackOut_39_1 = (int[]) (Object) stackIn_39_1;
                stackOut_39_2 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                stackIn_40_2 = stackOut_39_2;
                break L13;
              } else {
                stackOut_38_0 = stackIn_38_0;
                stackOut_38_1 = (int[]) (Object) stackIn_38_1;
                stackOut_38_2 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_40_2 = stackOut_38_2;
                break L13;
              }
            }
            L14: {
              var5 = hb.a(stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0) ? 1 : 0;
              wh.field_d.c(il.field_b[var4].toUpperCase(), 260, 121, 16776960, -1);
              if (var5 != 0) {
                fj.field_Kb[var4].e(74, 108);
                break L14;
              } else {
                if (var3 == 0) {
                  if (qa.a(e.field_w, var4, param1)) {
                    qc.field_v.a(74, 108);
                    break L14;
                  } else {
                    de.field_i.e(74, 108);
                    break L14;
                  }
                } else {
                  qc.field_v.a(74, 108);
                  break L14;
                }
              }
            }
            L15: {
              var6 = 0;
              if (var5 != 0) {
                al.field_Z.c(g.field_N.toUpperCase(), 260, 140, 16776960, -1);
                break L15;
              } else {
                L16: {
                  al.field_Z.c(vc.field_j.toUpperCase(), 260, 140, 16776960, -1);
                  stackOut_48_0 = var4;
                  stackOut_48_1 = e.field_g;
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  if (param1) {
                    stackOut_50_0 = stackIn_50_0;
                    stackOut_50_1 = (int[]) (Object) stackIn_50_1;
                    stackOut_50_2 = 0;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    stackIn_51_2 = stackOut_50_2;
                    break L16;
                  } else {
                    stackOut_49_0 = stackIn_49_0;
                    stackOut_49_1 = (int[]) (Object) stackIn_49_1;
                    stackOut_49_2 = 1;
                    stackIn_51_0 = stackOut_49_0;
                    stackIn_51_1 = stackOut_49_1;
                    stackIn_51_2 = stackOut_49_2;
                    break L16;
                  }
                }
                L17: {
                  if (hb.a(stackIn_51_0, stackIn_51_1, stackIn_51_2 == 0)) {
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    break L17;
                  } else {
                    stackOut_52_0 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    break L17;
                  }
                }
                var6 = stackIn_54_0;
                break L15;
              }
            }
            L18: {
              var7 = bh.field_g[var4];
              if (var6 == 0) {
                break L18;
              } else {
                var7 = qc.field_t;
                break L18;
              }
            }
            int discarded$1 = al.field_Z.a(var7.toUpperCase(), 260, 150, 320, 64, 16776960, -1, 0, 0, 16);
            if (var6 != 0) {
              break L10;
            } else {
              al.field_Z.c(ml.field_b.toUpperCase() + j.field_d[var4] * 100, 260, 233, 16776960, -1);
              al.field_Z.c(li.field_v.toUpperCase(), 420, 233, 16776960, -1);
              if (10 == j.field_d[var4]) {
                ob.field_B[1].a(500, 209);
                break L10;
              } else {
                var8 = 0;
                L19: while (true) {
                  if (j.field_d[var4] <= var8) {
                    break L10;
                  } else {
                    ob.field_B[0].a(var8 * 8 + 500, 209);
                    var8++;
                    continue L19;
                  }
                }
              }
            }
          }
        }
    }

    final void k(int param0) {
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (12 != ((re) this).field_f) {
            if (((re) this).field_f != 13) {
              break L0;
            } else {
              L1: {
                qg.field_p = qg.field_p - 32;
                if (0 >= qg.field_p) {
                  qg.field_p = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              qi.b(qg.field_p, (byte) -116);
              break L0;
            }
          } else {
            L2: {
              uh.field_i = uh.field_i - 8;
              if (0 >= uh.field_i) {
                uh.field_i = 0;
                if (1 == uj.field_l) {
                  ((re) this).f((byte) 76);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            ed.a(uh.field_i, (byte) -99);
            break L0;
          }
        }
        L3: {
          if (((re) this).field_d == 16) {
            ((re) this).field_t = 0;
            break L3;
          } else {
            if (((re) this).field_d == 4) {
              if (((re) this).field_C.field_b != 5) {
                ((re) this).field_t = ((re) this).field_t - 1;
                if (((re) this).field_t < 0) {
                  ((re) this).field_t = ((re) this).field_t + ((re) this).field_C.field_b;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                if (((re) this).field_t >= 4) {
                  break L3;
                } else {
                  ((re) this).field_t = ((re) this).field_t - 1;
                  if (((re) this).field_t >= 0) {
                    break L3;
                  } else {
                    ((re) this).field_t = ((re) this).field_t + 4;
                    break L3;
                  }
                }
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (param0 <= -11) {
            break L4;
          } else {
            field_i = null;
            break L4;
          }
        }
        L5: {
          if (((re) this).field_d == 6) {
            if (((re) this).field_C.field_b == 3) {
              ((re) this).field_t = 1;
              break L5;
            } else {
              if (1 < ((re) this).field_C.field_b) {
                ((re) this).field_t = ((re) this).field_t - 1;
                if (0 > ((re) this).field_t) {
                  ((re) this).field_t = ((re) this).field_C.field_b - 1;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (((re) this).field_d == 2) {
            ((re) this).field_t = 1;
            if (3 != ((re) this).field_C.field_b) {
              break L6;
            } else {
              ((re) this).field_t = 1;
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (1 == ((re) this).field_d) {
              break L8;
            } else {
              if (7 != ((re) this).field_d) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          ((re) this).field_t = 0;
          break L7;
        }
        L9: {
          L10: {
            if (((re) this).field_d == 12) {
              break L10;
            } else {
              if (((re) this).field_d == 14) {
                break L10;
              } else {
                if (((re) this).field_d == 15) {
                  break L10;
                } else {
                  if (((re) this).field_d == 13) {
                    break L10;
                  } else {
                    if (((re) this).field_d == 11) {
                      break L10;
                    } else {
                      if (((re) this).field_d == 10) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
            }
          }
          ((re) this).field_t = ((re) this).field_t - 1;
          if (((re) this).field_t >= 0) {
            break L9;
          } else {
            ((re) this).field_t = -1 + ((re) this).field_C.field_b;
            break L9;
          }
        }
        L11: {
          if (((re) this).field_d == 8) {
            ((re) this).field_t = 0;
            break L11;
          } else {
            break L11;
          }
        }
    }

    private final boolean g(byte param0) {
        return (lh.field_b.length + -1) * 500 > -jj.field_g;
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = HostileSpawn.field_I ? 1 : 0;
            if (((re) this).field_d == 16) {
              ((re) this).field_t = 2;
              break L1;
            } else {
              if (((re) this).field_d == 1) {
                break L1;
              } else {
                if (((re) this).field_d != 7) {
                  if (6 == ((re) this).field_d) {
                    if (3 != ((re) this).field_C.field_b) {
                      break L1;
                    } else {
                      ((re) this).field_t = 0;
                      break L1;
                    }
                  } else {
                    if (((re) this).field_d == 4) {
                      if (((re) this).field_C.field_b != 5) {
                        break L1;
                      } else {
                        if (4 == ((re) this).field_t) {
                          ((re) this).field_t = 3;
                          break L1;
                        } else {
                          var2 = 81 / ((77 - param0) / 45);
                          break L0;
                        }
                      }
                    } else {
                      L2: {
                        if (2 != ((re) this).field_d) {
                          break L2;
                        } else {
                          if (this.a((byte) -126) >= 0) {
                            break L2;
                          } else {
                            ((re) this).field_t = 1;
                            break L1;
                          }
                        }
                      }
                      ((re) this).field_t = ((re) this).field_t + 1;
                      if (((re) this).field_t < ((re) this).field_C.field_b) {
                        break L1;
                      } else {
                        ((re) this).field_t = 0;
                        break L1;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          var2 = 81 / ((77 - param0) / 45);
          break L0;
        }
    }

    private final void a(int param0, int param1, int param2, String param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        int var11 = 0;
        String var12 = null;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        nc stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        nc stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        nc stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        String stackIn_12_6 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        nc stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        nc stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        String stackOut_11_6 = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        nc stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        String stackOut_10_6 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                si.a(60, param1 - 14, 520, 18, 16776960, 32);
                break L1;
              }
            }
            L2: {
              var7_int = de.a(19926, 20, param0);
              if (param2 < -114) {
                break L2;
              } else {
                this.a(-24, 74, -79, 78, -101);
                break L2;
              }
            }
            L3: {
              param0 = um.a(20, param0, 10179);
              var8 = de.a(19926, 11, param0);
              var9 = um.a(11, param0, 10179);
              var10 = null;
              var11 = bm.field_c;
              if (var8 >= 10) {
                var10_ref = ae.field_r;
                break L3;
              } else {
                var10_ref = kh.field_fb[var11][var8];
                break L3;
              }
            }
            L4: {
              String dupTemp$1 = var10_ref.toUpperCase();
              var12 = dupTemp$1;
              var10_ref = dupTemp$1;
              if (param5 > 0) {
                L5: {
                  stackOut_9_0 = 8;
                  stackOut_9_1 = param1;
                  stackOut_9_2 = 0;
                  stackOut_9_3 = al.field_Z;
                  stackOut_9_4 = -16 + ce.field_b[0];
                  stackOut_9_5 = 16776960;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  stackIn_11_4 = stackOut_9_4;
                  stackIn_11_5 = stackOut_9_5;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  stackIn_10_4 = stackOut_9_4;
                  stackIn_10_5 = stackOut_9_5;
                  if (param5 >= 10) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = (nc) (Object) stackIn_11_3;
                    stackOut_11_4 = stackIn_11_4;
                    stackOut_11_5 = stackIn_11_5;
                    stackOut_11_6 = "10";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    stackIn_12_5 = stackOut_11_5;
                    stackIn_12_6 = stackOut_11_6;
                    break L5;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = stackIn_10_2;
                    stackOut_10_3 = (nc) (Object) stackIn_10_3;
                    stackOut_10_4 = stackIn_10_4;
                    stackOut_10_5 = stackIn_10_5;
                    stackOut_10_6 = "0" + param5;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_12_5 = stackOut_10_5;
                    stackIn_12_6 = stackOut_10_6;
                    break L5;
                  }
                }
                ec.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0, (vm) (Object) stackIn_12_3, stackIn_12_4, stackIn_12_5, stackIn_12_6);
                break L4;
              } else {
                break L4;
              }
            }
            al.field_Z.c(param3, ce.field_b[0], param1, 16776960, -1);
            al.field_Z.c(t.field_k[var7_int].toUpperCase(), ce.field_b[1], param1, 16776960, -1);
            al.field_Z.c(var12, ce.field_b[2], param1, 16776960, -1);
            ec.a(9, param1, false, (vm) (Object) al.field_Z, ce.field_b[3], 16776960, Integer.toString(var9));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7;
            stackOut_15_1 = new StringBuilder().append("re.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var2 = 108 / ((param0 - 33) / 53);
          var3 = ((re) this).field_d;
          if (var3 != 0) {
            if (var3 != 1) {
              if (var3 == 7) {
                ((re) this).field_f = 6;
                this.a((byte) 117, false);
                break L0;
              } else {
                if (var3 != 2) {
                  if (var3 == 16) {
                    ((re) this).field_f = 5;
                    this.a((byte) -59, false);
                    break L0;
                  } else {
                    L1: {
                      if (var3 == 8) {
                        if (u.field_f[7] != nl.field_f) {
                          break L1;
                        } else {
                          ((re) this).field_f = 7;
                          this.a((byte) -56, false);
                          break L0;
                        }
                      } else {
                        if (var3 == 4) {
                          ((re) this).field_f = 5;
                          this.a((byte) -33, false);
                          break L0;
                        } else {
                          if (var3 != 6) {
                            if (var3 != 5) {
                              if (17 != var3) {
                                break L1;
                              } else {
                                ((re) this).field_f = 5;
                                this.a((byte) 125, false);
                                break L0;
                              }
                            } else {
                              ((re) this).field_f = 1;
                              this.a((byte) 104, false);
                              break L0;
                            }
                          } else {
                            ((re) this).field_f = 5;
                            this.a((byte) 103, false);
                            break L0;
                          }
                        }
                      }
                    }
                    break L0;
                  }
                } else {
                  ((re) this).field_f = 5;
                  this.a((byte) 106, false);
                  break L0;
                }
              }
            } else {
              ((re) this).field_f = 5;
              this.a((byte) -79, false);
              break L0;
            }
          } else {
            break L0;
          }
        }
    }

    private final bd e(byte param0, int param1) {
        if (param0 != -44) {
            this.a(false);
        }
        int var3 = an.field_r[param1];
        bd var4 = new bd(128, 128);
        int[] var5 = new int[4];
        si.b(var5);
        var4.a();
        if (!(param1 < 0)) {
            qa.field_g[param1].e(16, 0);
        }
        if (!(var3 < 0)) {
            hh.field_a[var3].e(32, 48);
        }
        var4.e();
        o.field_n.b((byte) 121);
        si.a(var5);
        return var4;
    }

    private final void a(boolean param0) {
        le var3 = null;
        le var4 = null;
        le var5 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int[] var13 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (null == ((re) this).field_z) {
          var9 = new le(0L, (le) null);
          var3 = new le(0L, (le) null);
          var4 = new le(0L, (le) null);
          var5 = new le(0L, (le) null);
          var9.field_pb = nm.field_f.h();
          var13 = var9.field_pb.field_D;
          var7 = 0;
          L0: while (true) {
            if (var13.length <= var7) {
              L1: {
                if (null == var9.field_Y) {
                  break L1;
                } else {
                  var3.field_Y = var9.field_Y.h();
                  var3.field_Y.f();
                  break L1;
                }
              }
              var3.field_pb = var9.field_pb.h();
              var3.field_pb.f();
              var5.field_nb = oa.field_m;
              var9.field_pb = var9.field_pb.h();
              ((re) this).field_z = new pb(0L, var9, var3, var4, var5, false);
              return;
            } else {
              if ((var13[var7] & 16711680) > 1048576) {
                var13[var7] = 0;
                var7++;
                continue L0;
              } else {
                var13[var7] = 16776960;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == 16777215) {
            break L0;
          } else {
            ((re) this).k(38);
            break L0;
          }
        }
        L1: {
          var3 = ec.a(bm.field_b, (byte) 19);
          if (var3 <= 0) {
            break L1;
          } else {
            var4 = -(16 * var3) + 320;
            var5 = 0;
            L2: while (true) {
              if (il.field_b.length <= var5) {
                break L1;
              } else {
                if (hb.a(var5, bm.field_b, false)) {
                  L3: {
                    if (var4 > j.field_c) {
                      break L3;
                    } else {
                      if (340 > rb.field_m) {
                        break L3;
                      } else {
                        if (var4 - -32 <= j.field_c) {
                          break L3;
                        } else {
                          if (rb.field_m < 372) {
                            fj.field_Kb[var5].a(-6 + var4, 334, 44, 44);
                            al.field_Z.b(il.field_b[var5].toUpperCase(), var4 - -16, 332, 16776960, -1);
                            al.field_Z.b(bh.field_g[var5].toUpperCase(), 320, 390, 16777215, -1);
                            var4 += 32;
                            var5++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  fj.field_Kb[var5].b(var4, 340);
                  var4 += 32;
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void d(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          var3 = 79 % ((-56 - param0) / 44);
          this.a((byte) 114, nl.field_f);
          var4 = -3 + (448 - dd.field_o[((re) this).field_d].length * 30);
          var5 = -10 + (-99 + var4);
          if (var5 == ((re) this).field_E.field_sb) {
            break L0;
          } else {
            ((re) this).field_E.field_sb = var5;
            ((re) this).field_E.a(16, 0, (byte) -101);
            break L0;
          }
        }
        L1: {
          if (!ib.a((byte) -72)) {
            this.a(288, (byte) -55, 74, 57, 240);
            break L1;
          } else {
            this.a(288, (byte) -55, 74, 57, 228);
            this.a(288, (byte) -55, 74, 290, 20);
            break L1;
          }
        }
        L2: {
          if (rl.field_c >= 0) {
            L3: {
              this.a(138, (byte) -55, 74, 324, 235);
              nj.field_d[bm.field_c][rl.field_c].b(327, 77);
              this.a(146, (byte) -55, 216, 324, 235);
              this.a(146, (byte) -55, 216, 567, 20);
              if (null != ((re) this).field_G) {
                ((re) this).field_G.a(106, false);
                break L3;
              } else {
                break L3;
              }
            }
            ul.field_O = false;
            break L2;
          } else {
            if (!ta.p(3)) {
              ul.field_O = false;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L4: {
          if (!ul.field_O) {
            break L4;
          } else {
            this.a(70, (byte) -55, 74, 324, 235);
            int discarded$1 = al.field_Z.a(la.field_i.toUpperCase(), 334, 80, 215, 200, 16776960, -1, 0, 0, 16);
            break L4;
          }
        }
        ((re) this).field_E.a(124, false);
    }

    private final void e(byte param0) {
        if (((re) this).field_d != 2) {
            ul.field_O = false;
            ((re) this).field_E = null;
        } else {
            if (null == ((re) this).field_E) {
                this.h((byte) 33);
            }
        }
    }

    private final int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          L1: {
            var5 = HostileSpawn.field_I ? 1 : 0;
            if (10 != gn.field_k[0]) {
              break L1;
            } else {
              if (null != ((re) this).field_w[0][10]) {
                stackOut_4_0 = 11;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 10;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        var2 = stackIn_5_0;
        var3 = -9 % ((-59 - param0) / 46);
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            L3: {
              if (ib.a((byte) -72)) {
                L4: {
                  L5: {
                    if (gn.field_k[1] != 10) {
                      break L5;
                    } else {
                      if (null != ((re) this).field_w[1][10]) {
                        stackOut_17_0 = 11;
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackOut_16_0 = 10;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
                var2 = stackIn_18_0;
                var6 = 0;
                var3 = var6;
                L6: while (true) {
                  if (var2 <= var6) {
                    break L3;
                  } else {
                    if (((re) this).field_w[1][var6].field_nb == null) {
                      var6++;
                      continue L6;
                    } else {
                      return 32 | var6;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            return -1;
          } else {
            if (((re) this).field_w[0][var4].field_nb != null) {
              return var4;
            } else {
              var4++;
              continue L2;
            }
          }
        }
    }

    private final void e(int param0) {
        le var3 = null;
        le var4 = null;
        le var5 = null;
        le var6 = null;
        le var7 = null;
        le var8 = null;
        le var9 = null;
        le var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17_ref_int__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        le var29 = null;
        int var30 = 0;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        pb var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var40 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var46 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var54 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        L0: {
          var30 = HostileSpawn.field_I ? 1 : 0;
          var5 = new le(0L, (le) null);
          var6 = new le(0L, (le) null);
          var7 = new le(0L, (le) null);
          var8 = new le(0L, (le) null);
          var35 = new pb(0L, var5, var6, var7, var8, false);
          var3 = new le(0L, (le) null);
          var4 = new le(0L, (le) null);
          ((re) this).field_F = new th(0L, var3, var4, var35);
          ((re) this).field_F.field_zb = 299;
          ((re) this).field_F.field_sb = 115;
          ((re) this).field_F.field_qb = 568;
          ((re) this).field_F.field_tb = 36;
          var9 = ((re) this).field_F.field_Kb;
          var9.field_qb = 576;
          var9.field_sb = 128;
          var10 = ((re) this).field_F.field_Ib;
          var11 = 32;
          var12 = 32;
          var13 = 0;
          var14 = ib.a((byte) -72) ? 1 : 0;
          if (hb.a(31, uk.field_c, false)) {
            var56 = e.field_y;
            var48 = var56;
            var42 = var48;
            var36 = var42;
            var15_ref_int__ = var36;
            var15_ref_int__[0] = ua.a(var56[0], -1073741825);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var15 = 48;
          mc.field_E = nf.a(false);
          kf.a(e.field_y, 0, mc.field_E, 0, mc.field_E.length);
          if (var14 != 0) {
            break L1;
          } else {
            var57 = mc.field_E;
            var49 = var57;
            var31 = var49;
            var58 = e.field_w;
            var50 = var58;
            var43 = var50;
            var37 = var43;
            var32 = var37;
            var17_ref_int__ = var32;
            var18 = 0;
            L2: while (true) {
              if (8 <= var18) {
                break L1;
              } else {
                var31[var18] = ll.a(var57[var18], var58[var18]);
                var18++;
                continue L2;
              }
            }
          }
        }
        var59 = mc.field_E;
        var51 = var59;
        var33 = var51;
        var60 = uk.field_c;
        var52 = var60;
        var44 = var52;
        var38 = var44;
        var34 = var38;
        var17_ref_int__ = var34;
        var18 = 0;
        L3: while (true) {
          if (8 <= var18) {
            L4: {
              var16 = var14;
              if (var16 != 0) {
                break L4;
              } else {
                var61 = lh.field_b[1];
                var18 = 0;
                L5: while (true) {
                  if (var18 >= var61.length) {
                    break L4;
                  } else {
                    var19 = var61[var18];
                    if (qa.a(mc.field_E, var19, true)) {
                      var16 = 1;
                      break L4;
                    } else {
                      var18++;
                      continue L5;
                    }
                  }
                }
              }
            }
            var17 = 0;
            var18 = 42 + -ec.a(mc.field_E, (byte) 19);
            var19 = (1 + var18) / 2;
            var10.field_sb = 92;
            var10.field_qb = var15 * var19 + 64;
            var10.field_I = null;
            var11 = 76;
            var20 = 0;
            var12 = var11;
            var21 = 0;
            var22 = lh.field_b.length;
            var23 = 0;
            L6: while (true) {
              if (var23 >= var22) {
                L7: {
                  var10.field_qb = var21 - -64;
                  if (500 >= var21) {
                    break L7;
                  } else {
                    dd.field_o[6] = ak.field_c;
                    if (((re) this).field_d == 6) {
                      ((re) this).field_C.field_b = dd.field_o[((re) this).field_d].length;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                o.field_n.b((byte) 123);
                ((re) this).field_F.a(16, 0, (byte) -105);
                ((re) this).field_F.a(true, true);
                return;
              } else {
                L8: {
                  if (var23 == 1) {
                    var15 = 40;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var62 = lh.field_b[var23];
                var54 = var62;
                var46 = var54;
                var40 = var46;
                var24 = var40;
                var25 = 0;
                var26 = 0;
                L9: while (true) {
                  if (var62.length <= var26) {
                    var13 = 0;
                    var12 = var11;
                    var19 = (1 + var25) / 2;
                    var20 = 0;
                    var63 = var24;
                    var27 = 0;
                    L10: while (true) {
                      if (var63.length <= var27) {
                        var11 += 468;
                        var23++;
                        continue L6;
                      } else {
                        var28 = var63[var27];
                        ((re) this).field_b[var28] = null;
                        if (!hb.a(var28, mc.field_E, false)) {
                          L11: {
                            var29 = new le(0L, (le) null);
                            ((re) this).field_b[var28] = var29;
                            var29.field_Y = new bd(38, 38);
                            var29.field_sb = var29.field_Y.field_z;
                            var29.field_qb = var29.field_Y.field_z;
                            var29.field_zb = var13;
                            var29.field_tb = var12;
                            if (var21 < var12) {
                              var21 = var12;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var10.a(false, var29);
                          var20++;
                          var12 = var12 + var15;
                          if (var19 == var20) {
                            var13 += 40;
                            var12 = var11 + var15 * (var25 & 1) / 2;
                            var27++;
                            continue L10;
                          } else {
                            var27++;
                            continue L10;
                          }
                        } else {
                          var27++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    if (qa.a(mc.field_E, var62[var26], true)) {
                      var25++;
                      var26++;
                      continue L9;
                    } else {
                      var26++;
                      continue L9;
                    }
                  }
                }
              }
            }
          } else {
            var33[var18] = ua.a(var59[var18], ~var60[var18]);
            var18++;
            continue L3;
          }
        }
    }

    private final void j(byte param0) {
        Object var2 = null;
        String var2_ref = null;
        int var3 = 0;
        StringBuilder var4 = null;
        String var5 = null;
        L0: {
          L1: {
            this.a((byte) 121, jf.field_a);
            var2 = null;
            if (!om.field_b) {
              break L1;
            } else {
              if (fg.field_c[bm.field_c] != rl.field_c) {
                break L1;
              } else {
                var2_ref = f.field_a[bm.field_c][10];
                break L0;
              }
            }
          }
          var2_ref = f.field_a[bm.field_c][rl.field_c];
          break L0;
        }
        L2: {
          var3 = 10;
          this.a(275, (byte) -55, 86, 57, 2 * var3 + 270);
          var4 = new StringBuilder(32);
          StringBuilder discarded$7 = var4.append(mc.field_J);
          if (rl.field_c >= 9) {
            break L2;
          } else {
            StringBuilder discarded$8 = var4.append(48);
            break L2;
          }
        }
        L3: {
          StringBuilder discarded$9 = var4.append(rl.field_c - -1);
          StringBuilder discarded$10 = var4.append(" <col=ffffff>");
          StringBuilder discarded$11 = var4.append(kh.field_fb[bm.field_c][rl.field_c].toUpperCase());
          StringBuilder discarded$12 = var4.append("</col>");
          if (param0 == 84) {
            break L3;
          } else {
            this.j((byte) 35);
            break L3;
          }
        }
        L4: {
          wh.field_d.c(var4.toString(), 67, 110, 16776960, -1);
          if (var2_ref == null) {
            break L4;
          } else {
            var5 = var2_ref.toUpperCase();
            int discarded$13 = al.field_Z.a(var5, 67, 120, 270, 210, 16776960, -1, 0, 0, 14);
            break L4;
          }
        }
        this.a(138, (byte) -55, 86, 353, 235);
        nj.field_d[bm.field_c][rl.field_c].b(356, 89);
        this.a(131, (byte) -55, 230, 353, 235);
        this.a(235, 230, (byte) 56, 353, 131);
    }

    private final void c(boolean param0) {
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ic var13 = null;
        ic var14 = null;
        int[] var18 = null;
        int stackIn_17_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        String stackIn_25_4 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        String stackIn_26_4 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        String stackIn_27_4 = null;
        int stackIn_27_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        String stackOut_24_4 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        String stackOut_26_4 = null;
        int stackOut_26_5 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        String stackOut_25_4 = null;
        int stackOut_25_5 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        var2 = null;
        var3 = q.field_m[bm.field_c];
        var4 = var3;
        var4 = var3;
        this.a((byte) -36, var3.toUpperCase());
        if (!ta.p(3)) {
          L0: {
            var4 = null;
            if (null == p.field_m[bm.field_c]) {
              p.field_m[bm.field_c] = pi.a(10, 6413, 3, ka.field_p[bm.field_c], 1);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var13 = p.field_m[bm.field_c];
            var14 = var13;
            if (var14.field_m) {
              if (null != var14.field_l) {
                L2: {
                  var4 = kh.field_X;
                  var5 = var13.field_p[ue.field_e];
                  var18 = var13.field_l[ue.field_e];
                  var7 = fg.a(var14, ue.field_e, false, ch.field_h);
                  var8 = 18;
                  if (null != ch.field_h) {
                    if (var14.field_j == ch.field_h.field_t) {
                      if (var7 < 0) {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L2;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_17_0 = stackOut_14_0;
                        break L2;
                      }
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_17_0 = stackOut_12_0;
                      break L2;
                    }
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_17_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var9 = stackIn_17_0;
                  if (var9 == 0) {
                    var8 += 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var10 = 90;
                this.a(244, (byte) -55, 90, 56, 528);
                var10 += 16;
                al.field_Z.c(ii.field_f[0].toUpperCase(), ce.field_b[0], var10, 16776960, -1);
                al.field_Z.c(ii.field_f[1].toUpperCase(), ce.field_b[1], var10, 16776960, -1);
                al.field_Z.c(ii.field_f[2].toUpperCase(), ce.field_b[2], var10, 16776960, -1);
                al.field_Z.a(ii.field_f[3].toUpperCase(), ce.field_b[3], var10, 16776960, -1);
                var10 += 6;
                var10 += 18;
                var11 = 0;
                L4: while (true) {
                  if (10 <= var11) {
                    if (var9 != 0) {
                      this.a(tf.field_a, 8 + var10, -126, qg.field_r.toUpperCase(), true, -1);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (var5[var11] != null) {
                        L6: {
                          stackOut_24_0 = this;
                          stackOut_24_1 = var18[var11];
                          stackOut_24_2 = var10;
                          stackOut_24_3 = -128;
                          stackOut_24_4 = var5[var11].toUpperCase();
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackIn_26_2 = stackOut_24_2;
                          stackIn_26_3 = stackOut_24_3;
                          stackIn_26_4 = stackOut_24_4;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          stackIn_25_3 = stackOut_24_3;
                          stackIn_25_4 = stackOut_24_4;
                          if (var7 != var11) {
                            stackOut_26_0 = this;
                            stackOut_26_1 = stackIn_26_1;
                            stackOut_26_2 = stackIn_26_2;
                            stackOut_26_3 = stackIn_26_3;
                            stackOut_26_4 = (String) (Object) stackIn_26_4;
                            stackOut_26_5 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            stackIn_27_2 = stackOut_26_2;
                            stackIn_27_3 = stackOut_26_3;
                            stackIn_27_4 = stackOut_26_4;
                            stackIn_27_5 = stackOut_26_5;
                            break L6;
                          } else {
                            stackOut_25_0 = this;
                            stackOut_25_1 = stackIn_25_1;
                            stackOut_25_2 = stackIn_25_2;
                            stackOut_25_3 = stackIn_25_3;
                            stackOut_25_4 = (String) (Object) stackIn_25_4;
                            stackOut_25_5 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            stackIn_27_2 = stackOut_25_2;
                            stackIn_27_3 = stackOut_25_3;
                            stackIn_27_4 = stackOut_25_4;
                            stackIn_27_5 = stackOut_25_5;
                            break L6;
                          }
                        }
                        this.a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5 != 0, var11 - -1);
                        var4 = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var10 = var10 + var8;
                    var11++;
                    continue L4;
                  }
                }
              } else {
                var4 = ci.field_c;
                break L1;
              }
            } else {
              var4 = jf.field_h;
              break L1;
            }
          }
          L7: {
            if (var4 == null) {
              break L7;
            } else {
              if (var4.length() > 0) {
                this.a(26, (byte) -55, 174, 56, 528);
                al.field_Z.b(var4.toUpperCase(), 320, 193, 16776960, -1);
                break L7;
              } else {
                break L7;
              }
            }
          }
          L8: {
            this.a(30, (byte) -55, 360, 56, 528);
            wh.field_d.b(pl.field_a.toUpperCase(), 320, 383, 16776960, -1);
            if (ta.p(3)) {
              break L8;
            } else {
              if (var4 == kh.field_X) {
                break L8;
              } else {
                if (var14 == null) {
                  break L8;
                } else {
                  if (!p.field_m[bm.field_c].field_m) {
                    break L8;
                  } else {
                    if (var14.field_l == null) {
                      break L8;
                    } else {
                      if (var13.field_l[ue.field_e] == null) {
                        break L8;
                      } else {
                        if (var13.field_l[ue.field_e].length != 0) {
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          int discarded$2 = wh.field_d.a(kh.field_X.toUpperCase(), 64, 200, 512, 100, 16776960, -1, 1, 0, wh.field_d.field_y + wh.field_d.field_F);
          int discarded$3 = al.field_Z.a(u.field_a.toUpperCase(), 64, 345, 512, 1000, 16776960, -1, 1, 0, wh.field_d.field_F + wh.field_d.field_y);
          hm.a(576, ul.field_J, false, 30, 353, 32);
          return;
        }
    }

    private final boolean c(int param0) {
        return -jj.field_g > 0;
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        ic[] var3_ref_ic__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_90_0 = 0;
        int stackIn_97_0 = 0;
        int[][] stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int[][] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        int[][] stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int[] stackIn_125_2 = null;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int[][] stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int[][] stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int[] stackOut_124_2 = null;
        int[][] stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        int[] stackOut_123_2 = null;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        if (((re) this).field_j > 0) {
          return;
        } else {
          L0: {
            L1: {
              var4 = ((re) this).field_f;
              if (var4 == 29) {
                ((re) this).field_j = 1;
                dh.field_a.a((byte) -48, true);
                ((re) this).field_s = 3;
                break L1;
              } else {
                L2: {
                  if (var4 == 0) {
                    break L2;
                  } else {
                    if (27 == var4) {
                      break L2;
                    } else {
                      if (var4 == 3) {
                        ((re) this).field_v = 0;
                        ((re) this).field_j = 1;
                        ((re) this).field_s = 1;
                        si.d(0, 0, 0, 0);
                        ((re) this).field_g = this.b((byte) 82, 0);
                        si.c();
                        this.g(12169);
                        if (param1) {
                          break L1;
                        } else {
                          ((re) this).field_t = 0;
                          break L1;
                        }
                      } else {
                        if (var4 != 22) {
                          if (6 == var4) {
                            L3: {
                              if (!param1) {
                                ((re) this).field_t = 0;
                                if (((re) this).field_d == 7) {
                                  ((re) this).field_t = 1;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L3;
                              }
                            }
                            ((re) this).field_j = 1;
                            ((re) this).field_s = 5;
                            break L1;
                          } else {
                            if (2 == var4) {
                              ((re) this).field_j = 1;
                              ((re) this).field_s = 4;
                              if (!ta.p(3)) {
                                ((re) this).field_t = 3;
                                break L1;
                              } else {
                                ((re) this).field_t = 1;
                                break L1;
                              }
                            } else {
                              L4: {
                                if (var4 == 32) {
                                  break L4;
                                } else {
                                  if (var4 != 24) {
                                    if (var4 != 25) {
                                      if (5 != var4) {
                                        if (var4 != 1) {
                                          if (7 != var4) {
                                            if (var4 != 28) {
                                              if (30 == var4) {
                                                if (((re) this).field_d == 4) {
                                                  bm.field_c = 0;
                                                  this.h((byte) 33);
                                                  ((re) this).field_s = 4;
                                                  ((re) this).field_j = 1;
                                                  break L1;
                                                } else {
                                                  bm.field_c = 0;
                                                  this.h((byte) 33);
                                                  ((re) this).field_s = 2;
                                                  ((re) this).field_j = 1;
                                                  break L1;
                                                }
                                              } else {
                                                if (31 == var4) {
                                                  bm.field_c = 1;
                                                  this.h((byte) 33);
                                                  ((re) this).field_j = 1;
                                                  if (((re) this).field_d == 4) {
                                                    ((re) this).field_s = 4;
                                                    break L1;
                                                  } else {
                                                    ((re) this).field_s = 2;
                                                    break L1;
                                                  }
                                                } else {
                                                  if (var4 != 26) {
                                                    if (var4 != 12) {
                                                      if (var4 != 13) {
                                                        if (var4 == 4) {
                                                          ri.field_o = true;
                                                          break L1;
                                                        } else {
                                                          if (var4 != 14) {
                                                            if (var4 == 11) {
                                                              L5: {
                                                                if (wa.field_q != null) {
                                                                  tb.f((byte) -119);
                                                                  break L5;
                                                                } else {
                                                                  break L5;
                                                                }
                                                              }
                                                              dc.a(76, bn.c(-1));
                                                              break L1;
                                                            } else {
                                                              if (var4 != 8) {
                                                                if (var4 != 10) {
                                                                  if (var4 == 9) {
                                                                    ue.field_e = 1;
                                                                    break L1;
                                                                  } else {
                                                                    if (var4 != 15) {
                                                                      if (var4 == 16) {
                                                                        L6: {
                                                                          if (jh.field_ab != 1) {
                                                                            break L6;
                                                                          } else {
                                                                            db.a(true, 256, vg.field_h);
                                                                            break L6;
                                                                          }
                                                                        }
                                                                        qb.field_k = qb.field_k + w.field_r;
                                                                        w.field_r = 0;
                                                                        var18 = bm.field_b;
                                                                        var5 = 0;
                                                                        L7: while (true) {
                                                                          if (var5 >= 8) {
                                                                            var19 = uk.field_c;
                                                                            var5 = 0;
                                                                            L8: while (true) {
                                                                              if (var5 >= 8) {
                                                                                ((re) this).field_j = 1;
                                                                                gn.field_k[0] = 0;
                                                                                ((re) this).field_s = 0;
                                                                                break L1;
                                                                              } else {
                                                                                var19[var5] = 0;
                                                                                var5++;
                                                                                continue L8;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var18[var5] = 0;
                                                                            var5++;
                                                                            continue L7;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (var4 == 33) {
                                                                          ((re) this).field_j = 1;
                                                                          ((re) this).field_s = 17;
                                                                          break L1;
                                                                        } else {
                                                                          if (var4 != 18) {
                                                                            if (var4 != 17) {
                                                                              break L1;
                                                                            } else {
                                                                              if (((re) this).field_d != 6) {
                                                                                break L1;
                                                                              } else {
                                                                                if (this.c(24834)) {
                                                                                  jj.field_g = jj.field_g + 500;
                                                                                  break L1;
                                                                                } else {
                                                                                  break L1;
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (((re) this).field_d != 6) {
                                                                              break L1;
                                                                            } else {
                                                                              if (!this.g((byte) 30)) {
                                                                                break L1;
                                                                              } else {
                                                                                jj.field_g = jj.field_g - 500;
                                                                                break L1;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      mn.c((byte) 67);
                                                                      ((re) this).field_F = null;
                                                                      wl.field_b = true;
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  ue.field_e = 2;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                ue.field_e = 0;
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            ((re) this).field_j = 1;
                                                            ((re) this).field_x = -1;
                                                            ((re) this).field_s = 6;
                                                            if (!param1) {
                                                              if (!ta.p(3)) {
                                                                ((re) this).field_t = 0;
                                                                break L1;
                                                              } else {
                                                                ((re) this).field_t = 1;
                                                                break L1;
                                                              }
                                                            } else {
                                                              var3 = -3 % ((45 - param0) / 55);
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (param1) {
                                                          L9: {
                                                            var4 = ((re) this).field_m * 256 / 160;
                                                            if (var4 >= 0) {
                                                              break L9;
                                                            } else {
                                                              var4 = 0;
                                                              break L9;
                                                            }
                                                          }
                                                          L10: {
                                                            if (256 >= var4) {
                                                              break L10;
                                                            } else {
                                                              var4 = 256;
                                                              break L10;
                                                            }
                                                          }
                                                          qg.field_p = var4;
                                                          qi.b(var4, (byte) -90);
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    } else {
                                                      if (param1) {
                                                        L11: {
                                                          var4 = 64 * ((re) this).field_m / 160;
                                                          if (var4 < 0) {
                                                            var4 = 0;
                                                            break L11;
                                                          } else {
                                                            break L11;
                                                          }
                                                        }
                                                        L12: {
                                                          if (var4 <= 64) {
                                                            break L12;
                                                          } else {
                                                            var4 = 64;
                                                            break L12;
                                                          }
                                                        }
                                                        uh.field_i = var4;
                                                        ed.a(var4, (byte) -49);
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    }
                                                  } else {
                                                    L13: {
                                                      kh.field_ab.a(0);
                                                      ((re) this).field_j = 1;
                                                      ((re) this).field_s = 0;
                                                      if (w.field_r > 0) {
                                                        L14: {
                                                          if (13 != ((re) this).field_d) {
                                                            stackOut_154_0 = rl.field_c;
                                                            stackIn_155_0 = stackOut_154_0;
                                                            break L14;
                                                          } else {
                                                            stackOut_153_0 = 10;
                                                            stackIn_155_0 = stackOut_153_0;
                                                            break L14;
                                                          }
                                                        }
                                                        var4 = stackIn_155_0;
                                                        ib.a(bm.field_c, w.field_r, var4, 102);
                                                        ((re) this).field_s = 4;
                                                        break L13;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                    L15: {
                                                      if (((re) this).field_s != 0) {
                                                        break L15;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                    if (1 == jh.field_ab) {
                                                      ja.a((byte) 103, vg.field_h, true);
                                                      break L1;
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              bm.field_c = 1 - bm.field_c;
                                              this.h((byte) 33);
                                              break L1;
                                            }
                                          } else {
                                            L16: {
                                              ((re) this).field_s = 10;
                                              u.field_f[26] = jh.field_bb;
                                              ((re) this).field_j = 1;
                                              stackOut_122_0 = dd.field_o;
                                              stackOut_122_1 = 10;
                                              stackIn_124_0 = stackOut_122_0;
                                              stackIn_124_1 = stackOut_122_1;
                                              stackIn_123_0 = stackOut_122_0;
                                              stackIn_123_1 = stackOut_122_1;
                                              if (om.field_b) {
                                                stackOut_124_0 = (int[][]) (Object) stackIn_124_0;
                                                stackOut_124_1 = stackIn_124_1;
                                                stackOut_124_2 = nm.field_c;
                                                stackIn_125_0 = stackOut_124_0;
                                                stackIn_125_1 = stackOut_124_1;
                                                stackIn_125_2 = stackOut_124_2;
                                                break L16;
                                              } else {
                                                stackOut_123_0 = (int[][]) (Object) stackIn_123_0;
                                                stackOut_123_1 = stackIn_123_1;
                                                stackOut_123_2 = ja.field_h;
                                                stackIn_125_0 = stackOut_123_0;
                                                stackIn_125_1 = stackOut_123_1;
                                                stackIn_125_2 = stackOut_123_2;
                                                break L16;
                                              }
                                            }
                                            L17: {
                                              stackIn_125_0[stackIn_125_1] = stackIn_125_2;
                                              if (!ta.p(3)) {
                                                break L17;
                                              } else {
                                                L18: {
                                                  if (w.field_r == 0) {
                                                    stackOut_128_0 = 0;
                                                    stackIn_129_0 = stackOut_128_0;
                                                    break L18;
                                                  } else {
                                                    stackOut_127_0 = 1;
                                                    stackIn_129_0 = stackOut_127_0;
                                                    break L18;
                                                  }
                                                }
                                                L19: {
                                                  stackOut_129_0 = stackIn_129_0;
                                                  stackIn_131_0 = stackOut_129_0;
                                                  stackIn_130_0 = stackOut_129_0;
                                                  if (ei.field_q.e(-20049)) {
                                                    stackOut_131_0 = stackIn_131_0;
                                                    stackOut_131_1 = 0;
                                                    stackIn_132_0 = stackOut_131_0;
                                                    stackIn_132_1 = stackOut_131_1;
                                                    break L19;
                                                  } else {
                                                    stackOut_130_0 = stackIn_130_0;
                                                    stackOut_130_1 = 1;
                                                    stackIn_132_0 = stackOut_130_0;
                                                    stackIn_132_1 = stackOut_130_1;
                                                    break L19;
                                                  }
                                                }
                                                if (wb.a(stackIn_132_0 != 0, stackIn_132_1 != 0, false, rg.a((byte) -51)) == null) {
                                                  break L17;
                                                } else {
                                                  ((re) this).field_s = 9;
                                                  break L17;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (!param1) {
                                                ((re) this).field_t = 0;
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              if (rl.field_c != hh.field_d) {
                                                break L21;
                                              } else {
                                                if (((re) this).field_d != 8) {
                                                  break L21;
                                                } else {
                                                  ((re) this).field_s = 2;
                                                  break L21;
                                                }
                                              }
                                            }
                                            if (jh.field_ab != 1) {
                                              break L1;
                                            } else {
                                              if (((re) this).field_s != 10) {
                                                break L1;
                                              } else {
                                                db.a(false, 256, pe.field_ab);
                                                break L1;
                                              }
                                            }
                                          }
                                        } else {
                                          mc.field_I = 1;
                                          of.field_h = null;
                                          hg.field_e = 1;
                                          jf.field_c = 128;
                                          break L1;
                                        }
                                      } else {
                                        L22: {
                                          if (param1) {
                                            break L22;
                                          } else {
                                            L23: {
                                              ((re) this).field_t = 0;
                                              if (((re) this).field_d != 1) {
                                                break L23;
                                              } else {
                                                ((re) this).field_t = 1;
                                                break L23;
                                              }
                                            }
                                            L24: {
                                              if (((re) this).field_d != 4) {
                                                break L24;
                                              } else {
                                                ((re) this).field_t = 5;
                                                break L24;
                                              }
                                            }
                                            if (((re) this).field_d == 6) {
                                              ((re) this).field_t = 6;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        ((re) this).field_j = 1;
                                        ((re) this).field_s = 0;
                                        if (1 != jh.field_ab) {
                                          break L1;
                                        } else {
                                          if (((re) this).field_d != 2) {
                                            break L1;
                                          } else {
                                            db.a(true, 256, vg.field_h);
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      ((re) this).field_s = 8;
                                      ((re) this).field_j = 1;
                                      if (!param1) {
                                        ((re) this).field_t = 0;
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L25: {
                                if (((re) this).field_f == 32) {
                                  var17 = bm.field_b;
                                  var5 = 0;
                                  L26: while (true) {
                                    if (var5 >= 8) {
                                      break L25;
                                    } else {
                                      var17[var5] = 0;
                                      var5++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  break L25;
                                }
                              }
                              L27: {
                                if (((re) this).field_d != 10) {
                                  if (((re) this).field_d != 2) {
                                    break L27;
                                  } else {
                                    L28: {
                                      var4 = 0;
                                      var5 = 0;
                                      var6 = this.a((byte) -110);
                                      if (param1) {
                                        break L28;
                                      } else {
                                        ((re) this).field_t = 0;
                                        break L28;
                                      }
                                    }
                                    L29: {
                                      if (var6 < 0) {
                                        break L29;
                                      } else {
                                        L30: {
                                          if ((31 & var6) != 10) {
                                            stackOut_89_0 = 0;
                                            stackIn_90_0 = stackOut_89_0;
                                            break L30;
                                          } else {
                                            stackOut_88_0 = 1;
                                            stackIn_90_0 = stackOut_88_0;
                                            break L30;
                                          }
                                        }
                                        var5 = stackIn_90_0;
                                        var4 = 1;
                                        break L29;
                                      }
                                    }
                                    if (var4 == 0) {
                                      return;
                                    } else {
                                      L31: {
                                        le.field_D = 0;
                                        if (var5 == 0) {
                                          stackOut_96_0 = 0;
                                          stackIn_97_0 = stackOut_96_0;
                                          break L31;
                                        } else {
                                          stackOut_95_0 = 1;
                                          stackIn_97_0 = stackOut_95_0;
                                          break L31;
                                        }
                                      }
                                      om.field_b = stackIn_97_0 != 0;
                                      u.field_f[7] = nl.field_f;
                                      ((re) this).field_s = 8;
                                      ((re) this).field_j = 1;
                                      ta.a((byte) -126, rl.field_c);
                                      break L27;
                                    }
                                  }
                                } else {
                                  L32: {
                                    if (0 < w.field_r) {
                                      ib.a(bm.field_c, w.field_r, rl.field_c, 109);
                                      cf.field_s = 0;
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  boolean discarded$1 = rg.a((byte) -21);
                                  ta.a((byte) -117, rl.field_c);
                                  break L27;
                                }
                              }
                              L33: {
                                var3_ref_ic__ = p.field_m;
                                p.field_m[1] = null;
                                u.field_f[7] = jh.field_bb;
                                mc.field_I = 1;
                                hg.field_e = 1;
                                if (jh.field_ab == 1) {
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                              L34: {
                                jf.field_c = 128;
                                if (param1) {
                                  break L34;
                                } else {
                                  ((re) this).field_t = 0;
                                  break L34;
                                }
                              }
                              L35: {
                                var3_ref_ic__[0] = null;
                                of.field_h = null;
                                if (1 != bm.field_c) {
                                  break L35;
                                } else {
                                  if (rl.field_c != 0) {
                                    break L35;
                                  } else {
                                    ei.field_o = new eg();
                                    ei.field_o.a(tf.field_e, (byte) 118);
                                    break L35;
                                  }
                                }
                              }
                              if (0 != bm.field_c) {
                                break L1;
                              } else {
                                if (0 != rl.field_c) {
                                  break L1;
                                } else {
                                  ei.field_o = new eg();
                                  ei.field_o.a(il.field_a, (byte) -13);
                                  ei.field_o.field_g = false;
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          ((re) this).field_v = 0;
                          ((re) this).field_s = 7;
                          ((re) this).field_j = 1;
                          si.d(0, 0, 0, 0);
                          ((re) this).field_g = this.b((byte) 82, 0);
                          si.c();
                          this.g(12169);
                          if (!param1) {
                            ((re) this).field_t = 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                ((re) this).field_s = 2;
                hh.field_d = 0;
                ((re) this).field_j = 1;
                vj.field_s = 0;
                n.field_s = 0;
                kh.field_ab.a(0);
                u.field_e = u.field_e - ei.field_l;
                ja.field_d = ja.field_d + 1;
                cf.field_s = 0;
                qb.field_k = qb.field_k + w.field_r;
                w.field_r = 0;
                rl.field_c = -1;
                le.field_D = 0;
                var16 = bm.field_b;
                var5 = 0;
                L36: while (true) {
                  if (var5 >= 8) {
                    L37: {
                      kh.field_ib[2] = 0;
                      kh.field_ib[0] = 600;
                      kh.field_ib[3] = 0;
                      eh.field_g = 64;
                      kh.field_ib[1] = 0;
                      kh.field_U[0] = 1;
                      kh.field_U[1] = 0;
                      jf.field_g = 0;
                      qh.field_k = 0;
                      if (1 != bm.field_c) {
                        break L37;
                      } else {
                        if (hh.field_d == 0) {
                          kh.field_U[0] = 0;
                          kh.field_ib[0] = 0;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                    rf.field_f = 0;
                    gb.field_h = 0;
                    uf.field_h = false;
                    bh.field_d = 0;
                    gf.field_j = 0;
                    wb.field_R = 0;
                    pl.field_l = false;
                    if (jh.field_ab != 1) {
                      break L1;
                    } else {
                      db.a(true, 256, rb.field_s);
                      break L1;
                    }
                  } else {
                    var16[var5] = 0;
                    var5++;
                    continue L36;
                  }
                }
              }
            }
            var3 = -3 % ((45 - param0) / 55);
            break L0;
          }
          return;
        }
    }

    private final int a(bd param0, String param1, int param2, String param3, byte param4, bd param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                break L1;
              } else {
                if (param3 == null) {
                  L2: {
                    var7_int = 100;
                    if (param1 == null) {
                      break L2;
                    } else {
                      param1 = param1.toUpperCase();
                      break L2;
                    }
                  }
                  L3: {
                    var8 = 8;
                    if (param3 != null) {
                      param3 = param3.toUpperCase();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (param4 == 80) {
                    L4: {
                      if (var7_int + param2 < si.field_j) {
                        break L4;
                      } else {
                        if (si.field_a < param2) {
                          break L4;
                        } else {
                          var9 = 13;
                          if (param0 == null) {
                            if (param5 == null) {
                              int discarded$4 = al.field_Z.a(param1, var8 + 64, param2, -(2 * var8) + 481, 128, 16776960, -1, 1, 1, var9);
                              break L4;
                            } else {
                              param5.e(112 - param5.field_z / 2 - param5.field_w, -param5.field_y + (param2 - -64 - param5.field_A / 2));
                              int discarded$5 = al.field_Z.a(param1, var8 + 161, param2, -(var8 * 2) + 384, 128, 16776960, -1, 0, 1, var9);
                              break L4;
                            }
                          } else {
                            param5.e(-param5.field_w + 112 - param5.field_z / 2, -param5.field_y + param2 - (-64 + param5.field_A / 2));
                            int discarded$6 = al.field_Z.a(param1, 161 + var8, param2, 143 - var8 * 2, 128, 16776960, -1, 1, 1, var9);
                            param0.e(-param0.field_w + -(param0.field_z / 2) + 367, -param0.field_y + (param2 + (64 - param0.field_A / 2)));
                            int discarded$7 = al.field_Z.a(param3, var8 + 431, param2, 114 + -(var8 * 2), 128, 16776960, -1, 1, 1, var9);
                            break L4;
                          }
                        }
                      }
                    }
                    param2 = param2 + var7_int;
                    stackOut_21_0 = param2;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_12_0 = 15;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            param2 = this.a((bd) null, param1, param2, (String) null, (byte) 80, param5);
            param2 = this.a((bd) null, param3, param2, (String) null, (byte) 80, param0);
            stackOut_4_0 = param2;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var7;
            stackOut_23_1 = new StringBuilder().append("re.O(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          L6: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          L8: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param4).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_22_0;
    }

    private final void b(byte param0) {
        if (param0 > -119) {
            ((re) this).c((byte) -6);
        }
    }

    final static boolean c(byte param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_9_0 = 0;
            if (param1 > sc.field_g.field_i) {
              if (null == ag.field_t) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = ag.field_t.b((byte) 120);
                    if (var2_int <= 0) {
                      L1: {
                        L2: {
                          if (0 > var2_int) {
                            break L2;
                          } else {
                            if (m.a(true) <= 30000L) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        le.c((byte) 56);
                        break L1;
                      }
                      if (param0 == 33) {
                        break L0;
                      } else {
                        field_r = null;
                        return false;
                      }
                    } else {
                      L3: {
                        if (var2_int <= param1 - sc.field_g.field_i) {
                          break L3;
                        } else {
                          var2_int = -sc.field_g.field_i + param1;
                          break L3;
                        }
                      }
                      ag.field_t.a(-1, sc.field_g.field_n, sc.field_g.field_i, var2_int);
                      bb.field_c = hn.a((byte) 80);
                      sc.field_g.field_i = sc.field_g.field_i + var2_int;
                      if (sc.field_g.field_i >= param1) {
                        sc.field_g.field_i = 0;
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    le.c((byte) 86);
                    break L4;
                  }
                }
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          L1: {
            var9 = HostileSpawn.field_I ? 1 : 0;
            ((re) this).field_E.a(true, true);
            ((re) this).field_E.a((byte) -121, ll.field_c * 50, 30, true);
            if (pf.field_o != 1) {
              break L1;
            } else {
              if (!((re) this).field_E.field_S) {
                break L1;
              } else {
                if (j.field_c < -30 + ((re) this).field_E.field_qb + ((re) this).field_E.field_K) {
                  L2: {
                    var3 = rl.field_c;
                    var4 = bm.field_c;
                    if (!ib.a((byte) -72)) {
                      stackOut_27_0 = 1;
                      stackIn_28_0 = stackOut_27_0;
                      break L2;
                    } else {
                      stackOut_26_0 = 2;
                      stackIn_28_0 = stackOut_26_0;
                      break L2;
                    }
                  }
                  var5 = stackIn_28_0;
                  rl.field_c = -1;
                  var6 = 0;
                  L3: while (true) {
                    if (var5 <= var6) {
                      L4: {
                        if (var3 != rl.field_c) {
                          break L4;
                        } else {
                          if (bm.field_c == var4) {
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (rl.field_c >= 0) {
                        this.i(104);
                        eh.field_c.a(lm.field_A[4], 100, uh.field_i);
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      L5: {
                        L6: {
                          if (gn.field_k[var6] != 10) {
                            break L6;
                          } else {
                            if (((re) this).field_w[var6][10] != null) {
                              stackOut_34_0 = 11;
                              stackIn_35_0 = stackOut_34_0;
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        stackOut_33_0 = 10;
                        stackIn_35_0 = stackOut_33_0;
                        break L5;
                      }
                      var7 = stackIn_35_0;
                      var8 = 0;
                      L7: while (true) {
                        if (var8 >= var7) {
                          var6++;
                          continue L3;
                        } else {
                          if (((re) this).field_w[var6][var8].field_S) {
                            L8: {
                              bm.field_c = var6;
                              ((re) this).field_w[var6][var8].field_nb = fm.field_a;
                              ((re) this).field_w[var6][var8].field_Y = en.field_t;
                              ((re) this).field_w[var6][var8].field_T = 65793;
                              if (var8 != 10) {
                                om.field_b = false;
                                rl.field_c = var8;
                                break L8;
                              } else {
                                rl.field_c = fg.field_c[var6];
                                om.field_b = true;
                                break L8;
                              }
                            }
                            hh.field_d = rl.field_c;
                            kh.field_ab.a(0);
                            var8++;
                            continue L7;
                          } else {
                            L9: {
                              ((re) this).field_w[var6][var8].field_nb = null;
                              if (var8 > gn.field_k[var6]) {
                                break L9;
                              } else {
                                ((re) this).field_w[var6][var8].field_Y = en.field_y;
                                break L9;
                              }
                            }
                            L10: {
                              ((re) this).field_w[var6][var8].field_T = 8421376;
                              if (var8 == 10) {
                                ((re) this).field_w[var6][var8].field_T = ((re) this).field_w[var6][var8].field_T & 16742263;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            if (ta.p(3)) {
                              if (pf.field_o == 1) {
                                if (((re) this).field_w[var6][var8].field_Eb) {
                                  ul.field_O = true;
                                  var8++;
                                  continue L7;
                                } else {
                                  var8++;
                                  continue L7;
                                }
                              } else {
                                var8++;
                                continue L7;
                              }
                            } else {
                              var8++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
          }
          L11: {
            var3 = li.field_s;
            li.field_s = -1;
            if (!ib.a((byte) -72)) {
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L11;
            } else {
              stackOut_5_0 = 2;
              stackIn_7_0 = stackOut_5_0;
              break L11;
            }
          }
          var4 = stackIn_7_0;
          var5 = 0;
          L12: while (true) {
            if (var5 >= var4) {
              if (-1 > li.field_s) {
                break L0;
              } else {
                if (var3 != li.field_s) {
                  eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              L13: {
                L14: {
                  if (gn.field_k[var5] != 10) {
                    break L14;
                  } else {
                    if (((re) this).field_w[var5][10] == null) {
                      break L14;
                    } else {
                      stackOut_11_0 = 11;
                      stackIn_13_0 = stackOut_11_0;
                      break L13;
                    }
                  }
                }
                stackOut_12_0 = 10;
                stackIn_13_0 = stackOut_12_0;
                break L13;
              }
              var6 = stackIn_13_0;
              var7 = 0;
              L15: while (true) {
                if (var6 <= var7) {
                  var5++;
                  continue L12;
                } else {
                  if (((re) this).field_w[var5][var7].field_S) {
                    if (0 != ((re) this).field_w[var5][var7].field_v) {
                      li.field_s = var7;
                      var7++;
                      continue L15;
                    } else {
                      var7++;
                      continue L15;
                    }
                  } else {
                    var7++;
                    continue L15;
                  }
                }
              }
            }
          }
        }
        L16: {
          if (0 <= rl.field_c) {
            ((re) this).field_G.a(true, true);
            ((re) this).field_G.a((byte) -115, ll.field_c * 50, 30, true);
            break L16;
          } else {
            break L16;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        String var16 = null;
        boolean[] var17 = null;
        boolean[] var18 = null;
        boolean[] var19 = null;
        boolean[] var20 = null;
        boolean[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        String stackIn_31_0 = null;
        String stackOut_30_0 = null;
        String stackOut_29_0 = null;
        boolean[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        boolean[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        boolean[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        wh.field_d.c(mb.field_k.toUpperCase(), 10 + param3, 22 + param1, 16776960, -1);
        var6 = 8 + param3;
        var7 = param1 - -30;
        var20 = new boolean[kh.field_ib.length];
        var19 = var20;
        var18 = var19;
        var17 = var18;
        var8 = var17;
        var9 = 0;
        L0: while (true) {
          if (~var9 <= ~kh.field_ib.length) {
            if (param2 == 56) {
              var9 = 0;
              L1: while (true) {
                if (var9 >= 8) {
                  var9 = 0;
                  L2: while (true) {
                    if (~var9 <= ~var20.length) {
                      return;
                    } else {
                      L3: {
                        if (var8[var9]) {
                          L4: {
                            s.a(var9, 65792, var7, var6);
                            var10 = kh.field_ib[var9];
                            if (0 <= var10) {
                              if (1 == var9) {
                                var10 = var10 / 50;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              var10 = 0;
                              break L4;
                            }
                          }
                          L5: {
                            al.field_Z.b(Integer.toString(var10), var6 + 16, 38 + var7, 16776960, -1);
                            if (!ka.a(var7, 0, 40, 40, var6)) {
                              break L5;
                            } else {
                              L6: {
                                var11 = lg.field_n[var9].toUpperCase();
                                var12 = al.field_Z.a(var11);
                                var13 = 16 + var6;
                                if (var12 / 2 + var13 < 640) {
                                  var13 = var13 - var12 / 2;
                                  break L6;
                                } else {
                                  var13 = 639 + -var12;
                                  break L6;
                                }
                              }
                              al.field_Z.c(var11.toUpperCase(), var13, var7 + 6, 16777215, -1);
                              break L5;
                            }
                          }
                          var6 += 58;
                          if (550 > var6) {
                            break L3;
                          } else {
                            var6 = param3 + 8;
                            var7 += 58;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  L7: {
                    if (kh.field_Q[var9]) {
                      L8: {
                        dn.a(-4 + var6, param2 + -169, var9, var7 - 10, 16772608);
                        if (var9 == 0) {
                          of.field_e.a(pc.field_b.charAt(0), var6 + 10, var7 + 27, 16776960);
                          break L8;
                        } else {
                          L9: {
                            var10 = kh.field_ib[an.field_r[var9]];
                            var8[an.field_r[var9]] = false;
                            var11_int = var9;
                            if (var11_int != 3) {
                              if (var11_int != 4) {
                                if (var11_int == 2) {
                                  var10 = var10 / 10;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              } else {
                                var10 = var10 / 5;
                                break L9;
                              }
                            } else {
                              var10 = var10 / 50;
                              break L9;
                            }
                          }
                          L10: {
                            if (var10 >= 0) {
                              break L10;
                            } else {
                              var10 = 0;
                              break L10;
                            }
                          }
                          al.field_Z.b(Integer.toString(var10), var6 - -16, var7 + 38, 16776960, -1);
                          break L8;
                        }
                      }
                      L11: {
                        if (ka.a(var7, 0, 40, 40, var6)) {
                          L12: {
                            if (0 == var9) {
                              stackOut_30_0 = gi.field_m;
                              stackIn_31_0 = stackOut_30_0;
                              break L12;
                            } else {
                              stackOut_29_0 = rf.field_s[var9 - 1];
                              stackIn_31_0 = stackOut_29_0;
                              break L12;
                            }
                          }
                          L13: {
                            var15 = stackIn_31_0;
                            var10_ref_String = var15;
                            var16 = var15.toUpperCase();
                            var11_int = al.field_Z.a(var16);
                            var12 = var6 + 16;
                            if (var12 + var11_int / 2 >= 640) {
                              var12 = -var11_int + 639;
                              break L13;
                            } else {
                              var12 = var12 - var11_int / 2;
                              break L13;
                            }
                          }
                          al.field_Z.c(var16.toUpperCase(), var12, 6 + var7, 16777215, -1);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var6 += 58;
                      if (var6 < 550) {
                        break L7;
                      } else {
                        var7 += 58;
                        var6 = param3 + 8;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            L14: {
              stackOut_2_0 = (boolean[]) var8;
              stackOut_2_1 = var9;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (kh.field_ib[var9] <= 0) {
                stackOut_4_0 = (boolean[]) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L14;
              } else {
                stackOut_3_0 = (boolean[]) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L14;
              }
            }
            stackIn_5_0[stackIn_5_1] = stackIn_5_2 != 0;
            var9++;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 89) {
            field_q = null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (param3 == -18) {
          L0: {
            L1: {
              var6 = ((re) this).field_e;
              if (((re) this).field_s == 17) {
                break L1;
              } else {
                if (((re) this).field_d == 17) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var6 = 256;
            break L0;
          }
          gn.a(param1, param4, param2, var6, param0, (byte) 74);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        L0: {
          u.field_f[26] = jf.field_e;
          mk.field_L.b(tc.field_d, 320, 95, 16777215, -1);
          var3 = 0;
          var4 = wl.b(25685);
          var11 = vg.a(new String[1], 88, bi.field_f);
          var12 = var11;
          var5 = var12;
          var5 = var11;
          var12 = var5;
          var5 = var12;
          var3 = rl.field_c + -hh.field_d;
          if (0 >= w.field_r) {
            break L0;
          } else {
            if (rl.field_c <= hh.field_d) {
              var3 = ad.field_a / 50;
              var14 = var11 + "<br>" + c.field_d + jh.a((byte) -61, var3);
              var5 = var14;
              var5 = var14;
              var3 = ub.field_a[bm.field_c][rl.field_c - 1];
              var5 = var14 + "<br>" + ki.field_d + jh.a((byte) -73, var3);
              break L0;
            } else {
              var12 = var11 + "<br>" + vg.a(new String[1], 77, vc.field_f);
              var5 = var12;
              var5 = var12;
              var3 = ad.field_a / 50;
              var13 = var12 + "<br>" + c.field_d + jh.a((byte) -80, var3);
              var5 = var13;
              var5 = var13;
              var3 = ub.field_a[bm.field_c][rl.field_c - 1];
              var5 = var13 + "<br>" + ki.field_d + jh.a((byte) -67, var3);
              break L0;
            }
          }
        }
        L1: {
          if (w.field_r <= 0) {
            break L1;
          } else {
            var5 = var5 + "<br>" + vg.a(new String[1], 99, hj.field_s);
            break L1;
          }
        }
        L2: {
          if (50 <= sg.field_i) {
            var6_ref_String = sg.d(24);
            var5 = var6_ref_String;
            var5 = var6_ref_String;
            if (var6_ref_String == null) {
              break L2;
            } else {
              var5 = var5 + "<br>" + vg.a(new String[1], 120, ag.field_j);
              break L2;
            }
          } else {
            break L2;
          }
        }
        var6 = 25;
        var7 = 250;
        var8 = (640 - var7) / 2;
        var9 = 130;
        var10 = 180;
        this.a(var10 + 16, (byte) -55, -8 + var9, -8 + var8, 16 + var7);
        int discarded$1 = wh.field_d.a(var5.toUpperCase(), var8, var9, var7, var10, 16776960, -1, 1, 1, var6);
        this.e(16777215, 340);
    }

    private final void j(int param0) {
        int var2 = -113 % ((71 - param0) / 52);
        hm.a(8, ul.field_J, false, 330, 76, 316);
        hm.a(576, ul.field_J, false, 47, 32, 32);
        this.a((byte) -29, il.field_e);
        hm.a(576, ul.field_J, false, 46, 362, 32);
        this.a((byte) 50, 39, hn.field_e, 80);
        this.a((byte) 50, 325, ec.field_c, 80);
    }

    private final void h(byte param0) {
        le var3 = null;
        int var4_int = 0;
        le var4 = null;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        le var12_ref_le = null;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        le var15 = null;
        le stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        le stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        le stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_21_0 = 0;
        le stackIn_22_0 = null;
        le stackIn_23_0 = null;
        le stackIn_24_0 = null;
        String stackIn_24_1 = null;
        le stackIn_28_0 = null;
        le stackIn_29_0 = null;
        le stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        le stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        le stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        le stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        le stackOut_21_0 = null;
        le stackOut_23_0 = null;
        String stackOut_23_1 = null;
        le stackOut_22_0 = null;
        String stackOut_22_1 = null;
        le stackOut_27_0 = null;
        le stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        le stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        var14 = HostileSpawn.field_I ? 1 : 0;
        this.a(false);
        rl.field_c = -1;
        var4_int = 0;
        L0: while (true) {
          if (2 <= var4_int) {
            L1: {
              var15 = new le(0L, (le) null);
              var3 = new le(0L, (le) null);
              ((re) this).field_E = new th(0L, var15, var3, ((re) this).field_z);
              var4 = ((re) this).field_E.field_Kb;
              var4.field_qb = 234;
              var4.field_sb = 270;
              var5 = ((re) this).field_E.field_Ib;
              var5.field_qb = var4.field_qb;
              var5.field_I = null;
              var6 = 0;
              var7 = 3;
              var8 = 10;
              if (gn.field_k[0] == 10) {
                var8++;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = 1;
              if (ib.a((byte) -72)) {
                var9 = 2;
                var8 += 10;
                if (gn.field_k[1] == 10) {
                  var8++;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              stackOut_13_0 = (le) var5;
              stackOut_13_1 = var8 * 25;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (ib.a((byte) -72)) {
                stackOut_15_0 = (le) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 10;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                break L3;
              } else {
                stackOut_14_0 = (le) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 0;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                break L3;
              }
            }
            stackIn_16_0.field_sb = stackIn_16_1 + stackIn_16_2;
            rl.field_c = -1;
            var10 = 0;
            L4: while (true) {
              if (var10 >= var9) {
                o.field_n.b((byte) 107);
                ((re) this).field_E.field_tb = 64;
                ((re) this).field_E.field_qb = var4.field_qb - -10;
                ((re) this).field_E.field_zb = 80;
                ((re) this).field_E.field_sb = 290;
                ((re) this).field_E.a(16, 0, param0);
                ((re) this).field_E.a((byte) -124, 0, 30, true);
                ((re) this).field_E.a(true, true);
                return;
              } else {
                L5: {
                  if (gn.field_k[var10] == 10) {
                    stackOut_20_0 = 11;
                    stackIn_21_0 = stackOut_20_0;
                    break L5;
                  } else {
                    stackOut_19_0 = 10;
                    stackIn_21_0 = stackOut_19_0;
                    break L5;
                  }
                }
                L6: {
                  var11 = stackIn_21_0;
                  var12_ref_le = new le(-1L, (le) null);
                  var12_ref_le.field_L = 22;
                  var12_ref_le.field_R = 20;
                  var12_ref_le.field_G = 2;
                  var12_ref_le.field_ab = (vm) (Object) wh.field_d;
                  stackOut_21_0 = (le) var12_ref_le;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (var10 == 0) {
                    stackOut_23_0 = (le) (Object) stackIn_23_0;
                    stackOut_23_1 = c.field_b;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L6;
                  } else {
                    stackOut_22_0 = (le) (Object) stackIn_22_0;
                    stackOut_22_1 = og.field_e;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L6;
                  }
                }
                stackIn_24_0.field_fb = ((String) (Object) stackIn_24_1).toUpperCase();
                var12_ref_le.field_jb = false;
                var12_ref_le.field_zb = var7 + var10 * 4;
                var12_ref_le.field_sb = 20;
                var12_ref_le.field_nb = qc.field_x;
                var12_ref_le.field_tb = var6;
                var12_ref_le.field_qb = var4.field_qb + -20;
                var12_ref_le.field_T = 0;
                var5.a(false, var12_ref_le);
                var7 = var7 + (2 + (var12_ref_le.field_sb + 4 * var10));
                var12 = 0;
                L7: while (true) {
                  if (var12 >= var11) {
                    var10++;
                    continue L4;
                  } else {
                    L8: {
                      var13 = new le((long)var12, (le) null);
                      var13.field_G = 2;
                      var13.field_J = 4;
                      var13.field_R = 20;
                      var13.field_L = 18;
                      var13.field_ab = (vm) (Object) wh.field_d;
                      if (var12 >= 10) {
                        var13.field_fb = nj.field_e.toUpperCase();
                        var13.field_T = 8388608;
                        var13.field_jb = true;
                        break L8;
                      } else {
                        L9: {
                          var13.field_fb = kh.field_fb[var10][var12].toUpperCase();
                          stackOut_27_0 = (le) var13;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_28_0 = stackOut_27_0;
                          if (gn.field_k[var10] < var12) {
                            stackOut_29_0 = (le) (Object) stackIn_29_0;
                            stackOut_29_1 = 0;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            break L9;
                          } else {
                            stackOut_28_0 = (le) (Object) stackIn_28_0;
                            stackOut_28_1 = 1;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            break L9;
                          }
                        }
                        stackIn_30_0.field_jb = stackIn_30_1 != 0;
                        var13.field_T = 8421376;
                        break L8;
                      }
                    }
                    L10: {
                      var13.field_zb = var7;
                      if (!var13.field_jb) {
                        break L10;
                      } else {
                        var13.field_v = 16776960;
                        var13.field_pb = en.field_q;
                        var13.field_Y = en.field_y;
                        if (var12 != 10) {
                          break L10;
                        } else {
                          var13.field_v = 16742144;
                          break L10;
                        }
                      }
                    }
                    var13.field_tb = var6;
                    var13.field_sb = 20;
                    var13.field_qb = -20 + var4.field_qb;
                    var5.a(false, var13);
                    var7 = var7 + (var13.field_sb - -2);
                    var5.field_sb = var7;
                    ((re) this).field_w[var10][var12] = var13;
                    var12++;
                    continue L7;
                  }
                }
              }
            }
          } else {
            if (gn.field_k[var4_int] == 10) {
              ln.field_b[var4_int] = true;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void i(byte param0) {
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (((re) this).field_d == 16) {
            if (((re) this).field_t == 2) {
              ((re) this).field_t = 0;
              break L0;
            } else {
              break L0;
            }
          } else {
            if (-7 != ((re) this).field_d) {
              if (((re) this).field_d != 4) {
                L1: {
                  if (2 != ((re) this).field_d) {
                    break L1;
                  } else {
                    if (this.a((byte) -119) >= 0) {
                      break L1;
                    } else {
                      ((re) this).field_t = 1;
                      break L0;
                    }
                  }
                }
                ((re) this).field_t = ((re) this).field_t - 1;
                if (((re) this).field_t >= 0) {
                  break L0;
                } else {
                  ((re) this).field_t = -1 + ((re) this).field_C.field_b;
                  break L0;
                }
              } else {
                if (((re) this).field_C.field_b == 5) {
                  ((re) this).field_t = 4;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              if (-4 == ((re) this).field_C.field_b) {
                if (((re) this).field_t > 0) {
                  break L0;
                } else {
                  if (!this.g((byte) 30)) {
                    ((re) this).field_t = 1;
                    break L0;
                  } else {
                    ((re) this).field_t = 2;
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 <= -96) {
            break L2;
          } else {
            ((re) this).field_o = -96;
            break L2;
          }
        }
    }

    private final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var3 = param1;
          var4 = si.field_a;
          this.a(320, (byte) -55, 78, 60, 481);
          if (null != ((re) this).field_h) {
            this.a(10 + ((re) this).field_h.field_sb, (byte) -55, -5 + ((re) this).field_h.field_mb, ((re) this).field_h.field_K + -5, 10 + ((re) this).field_h.field_qb);
            si.f(32, 83, 605, 393);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 += 81;
          var3 = this.a(bj.field_g, 82, var3);
          if (hk.field_q) {
            var3 = this.a(il.field_c[0], df.field_b, var3, df.field_e, (byte) 80, il.field_c[1]);
            break L1;
          } else {
            var3 = this.a(il.field_c[1], df.field_b, var3, df.field_e, (byte) 80, il.field_c[0]);
            break L1;
          }
        }
        L2: {
          var3 = this.a(pl.field_f, wl.field_a, var3, rl.field_a, (byte) 80, qi.field_H);
          if (param0 == 82) {
            break L2;
          } else {
            ((re) this).field_o = 34;
            break L2;
          }
        }
        L3: {
          var3 = this.a(il.field_c[4], field_I, var3, tk.field_f, (byte) 80, il.field_c[3]);
          var3 = this.a(il.field_c[6], u.field_c, var3, of.field_b, (byte) 80, il.field_c[5]);
          var3 = this.a(jf.field_f, param0 + 8, var3);
          var3 = this.a((bd) null, al.field_S, var3, (String) null, (byte) 80, il.field_c[7]);
          var3 = this.a(il.field_c[10], g.field_K, var3, ln.field_p, (byte) 80, il.field_c[8]);
          var3 = this.a((bd) null, kb.field_a, var3, (String) null, (byte) 80, il.field_c[9]);
          var3 = this.a((bd) null, eh.field_h, var3, (String) null, (byte) 80, km.field_A[0]);
          var3 = this.a((bd) null, ga.field_c, var3, (String) null, (byte) 80, pi.field_b);
          var3 = this.a(mb.field_k, param0 ^ 58, var3);
          var3 = this.a((bd) null, w.field_A, var3, (String) null, (byte) 80, this.e((byte) -44, 0));
          var3 = this.a((bd) null, uj.field_q, var3, (String) null, (byte) 80, this.e((byte) -44, 1));
          var3 = this.a((bd) null, h.field_f, var3, (String) null, (byte) 80, this.e((byte) -44, 2));
          var3 = this.a((bd) null, tk.field_b, var3, (String) null, (byte) 80, this.e((byte) -44, 3));
          var3 = this.a((bd) null, vb.field_Hb, var3, (String) null, (byte) 80, this.e((byte) -44, 4));
          var3 = this.a((bd) null, di.field_c, var3, (String) null, (byte) 80, this.e((byte) -44, 5));
          var3 = this.a((bd) null, m.field_r, var3, (String) null, (byte) 80, this.e((byte) -44, 6));
          var3 = this.a((bd) null, od.field_C, var3, (String) null, (byte) 80, this.e((byte) -44, 7));
          var3 = this.a(al.field_O, 87, var3);
          var3 = this.a((bd) null, od.field_B, var3, (String) null, (byte) 80, wk.field_b[1]);
          var3 = this.a((bd) null, mf.field_a, var3, (String) null, (byte) 80, wk.field_b[3]);
          var3 = this.a((bd) null, ha.field_x, var3, (String) null, (byte) 80, wk.field_b[11]);
          si.d(0, 0, 640, var4);
          if (null != ((re) this).field_h) {
            ((re) this).field_h.a(param0 + -177, false);
            break L3;
          } else {
            break L3;
          }
        }
        si.c();
        return var3 + -param1 - 94;
    }

    public static void a(int param0) {
        field_i = null;
        field_B = null;
        field_I = null;
        field_q = null;
        field_D = null;
        field_n = null;
        field_A = null;
        field_r = null;
        int var1 = -7;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var11_ref_String = null;
        int var12_int = 0;
        nc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_258_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_256_0 = 0;
        L0: {
          var19 = HostileSpawn.field_I ? 1 : 0;
          if (0 == li.field_p) {
            li.field_p = Math.max(wh.field_d.a(na.field_q.toUpperCase()), mk.field_L.a(wc.field_s.toUpperCase()));
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == ((re) this).field_d) {
            L2: {
              var4 = param0;
              if (var4 != 10) {
                if (var4 != 9) {
                  L3: {
                    if (12 != var4) {
                      if (var4 == 14) {
                        break L3;
                      } else {
                        if (var4 != 15) {
                          if (var4 != 11) {
                            if (var4 == 13) {
                              this.f(114, param1);
                              break L1;
                            } else {
                              if (var4 != 3) {
                                L4: {
                                  if (var4 == 0) {
                                    break L4;
                                  } else {
                                    if (17 == var4) {
                                      break L4;
                                    } else {
                                      if (var4 != 5) {
                                        if (var4 != 4) {
                                          if (var4 == 2) {
                                            this.d((byte) 28, param1);
                                            break L1;
                                          } else {
                                            if (var4 != 8) {
                                              if (6 != var4) {
                                                L5: {
                                                  if (var4 == 1) {
                                                    break L5;
                                                  } else {
                                                    if (var4 != 7) {
                                                      if (var4 != 16) {
                                                        break L1;
                                                      } else {
                                                        this.j(18);
                                                        break L1;
                                                      }
                                                    } else {
                                                      break L5;
                                                    }
                                                  }
                                                }
                                                this.a((byte) -109, il.field_d.toUpperCase());
                                                ((re) this).field_g = this.b((byte) 82, -((re) this).field_v);
                                                break L1;
                                              } else {
                                                this.a(param1, true);
                                                break L1;
                                              }
                                            } else {
                                              this.j((byte) 84);
                                              break L1;
                                            }
                                          }
                                        } else {
                                          this.c(false);
                                          break L1;
                                        }
                                      } else {
                                        this.g(152, 7 + param1);
                                        break L1;
                                      }
                                    }
                                  }
                                }
                                this.d(-112, param1);
                                break L1;
                              } else {
                                if (dh.field_a != null) {
                                  dh.field_a.a((byte) -67);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          } else {
                            this.a(param1, (byte) 126);
                            break L1;
                          }
                        } else {
                          this.f(117, param1);
                          break L1;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  this.f(117, param1);
                  break L1;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            this.c(-50, param0, param1);
            break L1;
          } else {
            break L1;
          }
        }
        if (((re) this).field_C == null) {
          wh.field_d.b("ERROR! 0", 320, 240, 2158368, -1);
          return;
        } else {
          L6: {
            L7: {
              if (((re) this).field_d != 0) {
                break L7;
              } else {
                if (dd.field_o[((re) this).field_d].length != 9) {
                  break L7;
                } else {
                  stackOut_55_0 = 1;
                  stackIn_57_0 = stackOut_55_0;
                  break L6;
                }
              }
            }
            stackOut_56_0 = 0;
            stackIn_57_0 = stackOut_56_0;
            break L6;
          }
          L8: {
            var4 = stackIn_57_0;
            var5 = param1 - 1;
            stackOut_57_0 = var5;
            stackIn_59_0 = stackOut_57_0;
            stackIn_58_0 = stackOut_57_0;
            if (var4 == 0) {
              stackOut_59_0 = stackIn_59_0;
              stackOut_59_1 = 42;
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              break L8;
            } else {
              stackOut_58_0 = stackIn_58_0;
              stackOut_58_1 = 37;
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              break L8;
            }
          }
          L9: {
            var5 = stackIn_60_0 + stackIn_60_1;
            var6 = 555;
            var7 = ((re) this).field_t;
            if (!((re) this).field_K) {
              ((re) this).field_t = -1;
              ((re) this).field_f = -1;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (param0 != 16) {
              L11: {
                if (var4 == 0) {
                  stackOut_92_0 = 30;
                  stackIn_93_0 = stackOut_92_0;
                  break L11;
                } else {
                  stackOut_91_0 = 26;
                  stackIn_93_0 = stackOut_91_0;
                  break L11;
                }
              }
              L12: {
                L13: {
                  var8 = stackIn_93_0;
                  var9 = 64;
                  var10 = 1;
                  var11 = 0;
                  var12_int = param0;
                  if (var12_int == 0) {
                    break L13;
                  } else {
                    if (17 == var12_int) {
                      break L13;
                    } else {
                      if (var12_int != 4) {
                        if (6 == var12_int) {
                          var11 = 1;
                          var8 = 240;
                          break L12;
                        } else {
                          if (var12_int == 10) {
                            var11 = 1;
                            var8 = 340;
                            break L12;
                          } else {
                            L14: {
                              if (var12_int != 1) {
                                if (var12_int != 7) {
                                  L15: {
                                    if (var12_int != 13) {
                                      if (var12_int == 14) {
                                        break L15;
                                      } else {
                                        if (var12_int != 12) {
                                          if (var12_int != 15) {
                                            if (var12_int != 11) {
                                              if (5 != var12_int) {
                                                if (var12_int == 2) {
                                                  var11 = 0;
                                                  var5 = 394;
                                                  break L12;
                                                } else {
                                                  if (var12_int == 8) {
                                                    var5 = 394;
                                                    var9 = 500;
                                                    var11 = 0;
                                                    if (var5 > rb.field_m) {
                                                      break L12;
                                                    } else {
                                                      if (j.field_c >= -20 + var9) {
                                                        break L12;
                                                      } else {
                                                        var10 = 0;
                                                        break L12;
                                                      }
                                                    }
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              } else {
                                                L16: {
                                                  if (((re) this).field_C.field_b <= 0) {
                                                    break L16;
                                                  } else {
                                                    var8 = 166 / ((re) this).field_C.field_b;
                                                    break L16;
                                                  }
                                                }
                                                L17: {
                                                  var5 = 5 + var8 + 228;
                                                  if (!ka.a(228, 0, 176, 288, 60)) {
                                                    stackOut_147_0 = 0;
                                                    stackIn_148_0 = stackOut_147_0;
                                                    break L17;
                                                  } else {
                                                    stackOut_146_0 = 1;
                                                    stackIn_148_0 = stackOut_146_0;
                                                    break L17;
                                                  }
                                                }
                                                var10 = stackIn_148_0;
                                                var9 = 84;
                                                break L12;
                                              }
                                            } else {
                                              var8 = 200;
                                              var11 = 1;
                                              break L12;
                                            }
                                          } else {
                                            break L15;
                                          }
                                        } else {
                                          break L15;
                                        }
                                      }
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L18: {
                                    var5 = 460;
                                    var8 = 200;
                                    var9 = 460;
                                    if (ta.p(3)) {
                                      var9 = 400;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (ig.field_L == 2) {
                                      break L19;
                                    } else {
                                      if (270 > uk.field_e) {
                                        break L19;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var5 = 1000;
                                  break L12;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                            var8 = 200;
                            var11 = 1;
                            break L12;
                          }
                        }
                      } else {
                        L20: {
                          if (ta.p(3)) {
                            var8 = 240;
                            break L20;
                          } else {
                            var8 = 140;
                            break L20;
                          }
                        }
                        var11 = 1;
                        break L12;
                      }
                    }
                  }
                }
                L21: {
                  var8 = 30;
                  var9 = 312;
                  var5 = 140 - (-var8 - 10);
                  if (param0 != 0) {
                    break L21;
                  } else {
                    if (!ib.a((byte) -72)) {
                      var8 = 26;
                      var5 -= 4;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (param0 == 17) {
                    var5 += 30;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (!ka.a(140, 0, 200, 300, 280)) {
                    stackOut_126_0 = 0;
                    stackIn_127_0 = stackOut_126_0;
                    break L23;
                  } else {
                    stackOut_125_0 = 1;
                    stackIn_127_0 = stackOut_125_0;
                    break L23;
                  }
                }
                var10 = stackIn_127_0;
                break L12;
              }
              L24: {
                if (var11 == 0) {
                  break L24;
                } else {
                  var5 = 430;
                  break L24;
                }
              }
              L25: {
                L26: {
                  var12 = wh.field_d;
                  if (param0 == 0) {
                    break L26;
                  } else {
                    if (17 == param0) {
                      break L26;
                    } else {
                      break L25;
                    }
                  }
                }
                var12 = mk.field_L;
                break L25;
              }
              var13 = 0;
              L27: while (true) {
                if (var13 >= dd.field_o[param0].length) {
                  break L10;
                } else {
                  L28: {
                    L29: {
                      var14 = dd.field_o[param0][var13];
                      if (var14 == 18) {
                        break L29;
                      } else {
                        if (17 == var14) {
                          break L29;
                        } else {
                          L30: {
                            var15 = 8421376;
                            var16 = u.field_f[var14];
                            if (var14 != 28) {
                              break L30;
                            } else {
                              if (param0 == 4) {
                                var9 = 400;
                                var8 = 180;
                                var5 = 70;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (var16 == null) {
                              var16 = "UNKNOWN OPTION (" + var14 + ")";
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (var13 != 2) {
                              break L32;
                            } else {
                              if (param0 != 2) {
                                break L32;
                              } else {
                                var5 = var5 - var8;
                                var9 += 420;
                                break L32;
                              }
                            }
                          }
                          L33: {
                            L34: {
                              if (((re) this).field_d == 12) {
                                break L34;
                              } else {
                                if (((re) this).field_d == 14) {
                                  break L34;
                                } else {
                                  if (15 == ((re) this).field_d) {
                                    break L34;
                                  } else {
                                    if (13 == ((re) this).field_d) {
                                      break L34;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                              }
                            }
                            L35: {
                              if (j.field_c <= 380) {
                                stackOut_182_0 = 0;
                                stackIn_183_0 = stackOut_182_0;
                                break L35;
                              } else {
                                stackOut_181_0 = 1;
                                stackIn_183_0 = stackOut_181_0;
                                break L35;
                              }
                            }
                            var10 = stackIn_183_0;
                            break L33;
                          }
                          L36: {
                            if (~param0 != ~((re) this).field_d) {
                              break L36;
                            } else {
                              if (!jk.a(-23322)) {
                                L37: {
                                  if (2 == param0) {
                                    L38: {
                                      if (var14 != 24) {
                                        break L38;
                                      } else {
                                        if (this.a((byte) 123) < 0) {
                                          break L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    if (((re) this).field_K) {
                                      break L37;
                                    } else {
                                      if (var10 == 0) {
                                        break L37;
                                      } else {
                                        if (j.field_c <= -(var6 / 2) + 320) {
                                          break L37;
                                        } else {
                                          if (j.field_c >= 320 + var6 / 2) {
                                            break L37;
                                          } else {
                                            if (rb.field_m <= 7 + (var5 - mk.field_L.field_y)) {
                                              break L37;
                                            } else {
                                              if (~rb.field_m <= ~(-6 + (var5 - -mk.field_L.field_F))) {
                                                break L37;
                                              } else {
                                                L39: {
                                                  if (0 == var13) {
                                                    break L39;
                                                  } else {
                                                    L40: {
                                                      if (j.field_c >= 320) {
                                                        break L40;
                                                      } else {
                                                        if (var13 == 1) {
                                                          break L39;
                                                        } else {
                                                          break L40;
                                                        }
                                                      }
                                                    }
                                                    if (j.field_c <= 320) {
                                                      break L37;
                                                    } else {
                                                      if (var13 == 2) {
                                                        break L39;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                                ((re) this).field_t = var13;
                                                ((re) this).field_u = true;
                                                break L37;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (var11 != 0) {
                                      L41: {
                                        if (((re) this).field_K) {
                                          break L41;
                                        } else {
                                          if (var10 == 0) {
                                            break L41;
                                          } else {
                                            if (dd.field_o[param0] != ja.field_h) {
                                              break L41;
                                            } else {
                                              if (7 + (-mk.field_L.field_y + var5) > rb.field_m) {
                                                break L37;
                                              } else {
                                                if (~rb.field_m <= ~(30 + (var5 + -mk.field_L.field_y) + 7)) {
                                                  break L37;
                                                } else {
                                                  L42: {
                                                    if (var13 == 0) {
                                                      if (var9 + -32 > j.field_c) {
                                                        break L37;
                                                      } else {
                                                        if (j.field_c >= 320) {
                                                          break L37;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                    } else {
                                                      if (j.field_c < 320) {
                                                        break L37;
                                                      } else {
                                                        if (j.field_c >= 600) {
                                                          break L37;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  ((re) this).field_t = var13;
                                                  ((re) this).field_u = true;
                                                  break L37;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (((re) this).field_K) {
                                        break L37;
                                      } else {
                                        if (var10 == 0) {
                                          break L37;
                                        } else {
                                          if (ka.a(-mk.field_L.field_y + (var5 - -7), 0, 30, var8, -32 + var9)) {
                                            ((re) this).field_t = var13;
                                            ((re) this).field_u = true;
                                            break L37;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                    } else {
                                      if (((re) this).field_K) {
                                        break L37;
                                      } else {
                                        if (var10 == 0) {
                                          break L37;
                                        } else {
                                          if (~(320 + -(var6 / 2)) <= ~j.field_c) {
                                            break L37;
                                          } else {
                                            if (var6 / 2 + 320 <= j.field_c) {
                                              break L37;
                                            } else {
                                              if (~rb.field_m >= ~(7 + (-mk.field_L.field_y + var5))) {
                                                break L37;
                                              } else {
                                                if (~rb.field_m > ~(-6 + mk.field_L.field_F + var5)) {
                                                  ((re) this).field_t = var13;
                                                  ((re) this).field_u = true;
                                                  break L37;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L43: {
                                  if (~((re) this).field_t != ~var13) {
                                    break L43;
                                  } else {
                                    if (0 != ((re) this).field_j) {
                                      break L43;
                                    } else {
                                      var15 = 16776960;
                                      break L43;
                                    }
                                  }
                                }
                                L44: {
                                  if (((re) this).field_d == 12) {
                                    break L44;
                                  } else {
                                    if (14 == ((re) this).field_d) {
                                      break L44;
                                    } else {
                                      if (((re) this).field_d == 15) {
                                        break L44;
                                      } else {
                                        if (((re) this).field_d != 13) {
                                          break L36;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                }
                                L45: {
                                  if (((re) this).field_t != var13) {
                                    break L45;
                                  } else {
                                    if (((re) this).field_j != 0) {
                                      break L45;
                                    } else {
                                      var15 = 16777215;
                                      break L36;
                                    }
                                  }
                                }
                                var15 = 16776960;
                                break L36;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L46: {
                            if (65793 != var15) {
                              break L46;
                            } else {
                              if (((re) this).field_e >= 256) {
                                break L46;
                              } else {
                                var15 = 16776960;
                                break L46;
                              }
                            }
                          }
                          L47: {
                            if (var15 != 65793) {
                              break L47;
                            } else {
                              if (((re) this).field_t != var13) {
                                break L47;
                              } else {
                                if (((re) this).field_j != 0) {
                                  break L47;
                                } else {
                                  si.c(42, -5 + (-wh.field_d.field_y + var5), 555, 24, 16776960);
                                  break L47;
                                }
                              }
                            }
                          }
                          L48: {
                            if (var14 == 24) {
                              L49: {
                                L50: {
                                  if (param0 == 8) {
                                    break L50;
                                  } else {
                                    if (this.a((byte) -108) < 0) {
                                      stackOut_257_0 = 0;
                                      stackIn_258_0 = stackOut_257_0;
                                      break L49;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                stackOut_256_0 = 1;
                                stackIn_258_0 = stackOut_256_0;
                                break L49;
                              }
                              var17 = stackIn_258_0;
                              this.a(26, (byte) -55, 365, 57, 530);
                              if (var17 != 0) {
                                L51: {
                                  if ((ca.field_c & 128) == 0) {
                                    var15 = 16777215;
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                                var18 = -8 + (320 - mk.field_L.a(var16.toUpperCase()) / 2);
                                mk.field_L.a(var16.toUpperCase(), 328, var5 + -5, var15, -1, ((re) this).field_e);
                                si.c(var18, var5 - 17, 8, 8, var15);
                                break L48;
                              } else {
                                break L48;
                              }
                            } else {
                              ((vm) (Object) var12).b(var16.toUpperCase(), var9, var5 + -5, var15, -1, ((re) this).field_e);
                              si.a(-16 + var9, var5 - 17, 8, 8, var15, ((re) this).field_e);
                              break L48;
                            }
                          }
                          L52: {
                            if (var14 == 12) {
                              var17 = -17 + var5;
                              var18 = wj.field_O << 1;
                              this.b(-18902, var18, var9 + li.field_p, var17);
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                          L53: {
                            if (var14 != 13) {
                              break L53;
                            } else {
                              var17 = var5 - 17;
                              var18 = ga.field_b >> 1;
                              this.b(-18902, var18, li.field_p + var9, var17);
                              break L53;
                            }
                          }
                          if (var11 != 0) {
                            var9 = var9 + var8;
                            break L28;
                          } else {
                            var5 = var5 + var8;
                            break L28;
                          }
                        }
                      }
                    }
                    this.b(var14, 89, var13);
                    break L28;
                  }
                  var13++;
                  continue L27;
                }
              }
            } else {
              var8 = 0;
              L54: while (true) {
                if (dd.field_o[param0].length <= var8) {
                  break L10;
                } else {
                  L55: {
                    var9 = dd.field_o[param0][var8];
                    var10 = 16776960;
                    var11_ref_String = u.field_f[var9];
                    if (~param0 != ~((re) this).field_d) {
                      break L55;
                    } else {
                      if (!jk.a(-23322)) {
                        L56: {
                          if (((re) this).field_K) {
                            break L56;
                          } else {
                            if (~e.field_c[var8] <= ~j.field_c) {
                              break L56;
                            } else {
                              if (e.field_c[var8] - -pk.field_e[var8] <= j.field_c) {
                                break L56;
                              } else {
                                if (~rb.field_m >= ~sj.field_h[var8]) {
                                  break L56;
                                } else {
                                  if (~rb.field_m > ~(sj.field_h[var8] + 30)) {
                                    ((re) this).field_u = true;
                                    ((re) this).field_t = var8;
                                    break L56;
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (~((re) this).field_t != ~var8) {
                          break L55;
                        } else {
                          if (0 == ((re) this).field_j) {
                            var10 = 65793;
                            break L55;
                          } else {
                            break L55;
                          }
                        }
                      } else {
                        break L55;
                      }
                    }
                  }
                  L57: {
                    if (var11_ref_String != null) {
                      break L57;
                    } else {
                      var11_ref_String = "ERROR! TEXT NOT FOUND (" + var9 + ")";
                      break L57;
                    }
                  }
                  L58: {
                    if (var10 != 65793) {
                      break L58;
                    } else {
                      if (((re) this).field_e < 256) {
                        var10 = 16776960;
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                  }
                  L59: {
                    if (var10 != 65793) {
                      break L59;
                    } else {
                      if (((re) this).field_j != 0) {
                        break L59;
                      } else {
                        si.c(e.field_c[var8], sj.field_h[var8], pk.field_e[var8], 30, 16776960);
                        break L59;
                      }
                    }
                  }
                  int discarded$1 = wh.field_d.a(var11_ref_String.toUpperCase(), e.field_c[var8], sj.field_h[var8], pk.field_e[var8], 30, var10, -1, ((re) this).field_e, 1, 1, wh.field_d.field_u);
                  var8++;
                  continue L54;
                }
              }
            }
          }
          L60: {
            if (~var7 == ~((re) this).field_t) {
              break L60;
            } else {
              if (0 <= ((re) this).field_t) {
                eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                break L60;
              } else {
                break L60;
              }
            }
          }
          var8 = 0;
          si.c();
          return;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        if (3 != ((re) this).field_d) {
        }
        if (!(!wl.field_b)) {
            ((re) this).f(-112);
        }
        this.l(param0 + -33);
        this.e((byte) -29);
        si.d();
        te.a(true);
        ((re) this).field_e = 256;
        this.a(430, 32, 32, -18, 608);
        if (param0 != 26) {
            return;
        }
        if (((re) this).field_j > 0) {
            var2 = ((re) this).field_j;
            if (var2 > 256) {
                var2 = 512 - var2;
            }
            ((re) this).field_e = 256 - var2;
        }
        this.d(((re) this).field_d, ij.field_F, 67);
        if (-4 == ((re) this).field_d) {
            return;
        }
        if (13 != ((re) this).field_d) {
            if (12 != ((re) this).field_d) {
                if (-15 != ((re) this).field_d) {
                    if (((re) this).field_d != 15) {
                        fb.a(32, 398, 11992, 32, 576);
                        jn.a(100, Math.min(lk.field_H, 30), 0, 0);
                    }
                }
            }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        String var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        StringBuilder stackIn_20_2 = null;
        String[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        StringBuilder stackIn_21_2 = null;
        String[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        StringBuilder stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        String[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        StringBuilder stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        String[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        StringBuilder stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        String[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        StringBuilder stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        String[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        StringBuilder stackIn_26_2 = null;
        String[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        StringBuilder stackIn_27_2 = null;
        String[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        StringBuilder stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        String[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        StringBuilder stackIn_29_2 = null;
        int stackIn_29_3 = 0;
        String[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        StringBuilder stackIn_30_2 = null;
        int stackIn_30_3 = 0;
        String[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        StringBuilder stackIn_31_2 = null;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        String[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        StringBuilder stackOut_19_2 = null;
        String[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        StringBuilder stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        String[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        StringBuilder stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        String[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        StringBuilder stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        String[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        StringBuilder stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        String[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        StringBuilder stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        String[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        StringBuilder stackOut_25_2 = null;
        String[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        StringBuilder stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        String[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        StringBuilder stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        String[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        StringBuilder stackOut_28_2 = null;
        int stackOut_28_3 = 0;
        String[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        StringBuilder stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        String[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        StringBuilder stackOut_29_2 = null;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        L0: {
          u.field_f[26] = jh.field_bb;
          mk.field_L.b(i.field_e.toUpperCase(), 320, 95, 16724736, -1);
          var4 = wl.b(25685);
          var12 = vg.a(new String[1], 74, bi.field_f);
          var5 = var12;
          var5 = var12;
          if (0 >= w.field_r) {
            break L0;
          } else {
            if (hh.field_d < rl.field_c) {
              var13 = var12 + "<br>" + vg.a(new String[1], 50, vc.field_f);
              var4 = sg.field_i / 50;
              var5 = var13 + "<br>" + oa.field_j + jh.a((byte) -128, var4);
              break L0;
            } else {
              var4 = sg.field_i / 50;
              var5 = var12 + "<br>" + oa.field_j + jh.a((byte) -80, var4);
              break L0;
            }
          }
        }
        L1: {
          if (w.field_r > 0) {
            var5 = var5 + "<br>" + vg.a(new String[1], 84, o.field_j);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (sg.field_i < 50) {
            break L2;
          } else {
            var11 = sg.d(24);
            var6_ref_String = var11;
            if (var6_ref_String != null) {
              var5 = var5 + "<br>" + vg.a(new String[1], 95, ag.field_j);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param1 != 9) {
            break L3;
          } else {
            L4: {
              if (w.field_r == 0) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              stackOut_15_0 = stackIn_15_0;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (ei.field_q.e(-20049)) {
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L5;
              } else {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L5;
              }
            }
            if (wb.a(stackIn_18_0 != 0, stackIn_18_1 != 0, false, rg.a((byte) -117)) == null) {
              break L3;
            } else {
              L6: {
                stackOut_19_0 = new String[]{ch.field_d.toLowerCase()};
                stackOut_19_1 = 74;
                stackOut_19_2 = new StringBuilder();
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_21_2 = stackOut_19_2;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                stackIn_20_2 = stackOut_19_2;
                if (w.field_r == 0) {
                  stackOut_21_0 = (String[]) (Object) stackIn_21_0;
                  stackOut_21_1 = stackIn_21_1;
                  stackOut_21_2 = (StringBuilder) (Object) stackIn_21_2;
                  stackOut_21_3 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  stackIn_22_3 = stackOut_21_3;
                  break L6;
                } else {
                  stackOut_20_0 = (String[]) (Object) stackIn_20_0;
                  stackOut_20_1 = stackIn_20_1;
                  stackOut_20_2 = (StringBuilder) (Object) stackIn_20_2;
                  stackOut_20_3 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  stackIn_22_3 = stackOut_20_3;
                  break L6;
                }
              }
              L7: {
                stackOut_22_0 = (String[]) (Object) stackIn_22_0;
                stackOut_22_1 = stackIn_22_1;
                stackOut_22_2 = (StringBuilder) (Object) stackIn_22_2;
                stackOut_22_3 = stackIn_22_3;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                stackIn_24_3 = stackOut_22_3;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                stackIn_23_2 = stackOut_22_2;
                stackIn_23_3 = stackOut_22_3;
                if (ei.field_q.e(-20049)) {
                  stackOut_24_0 = (String[]) (Object) stackIn_24_0;
                  stackOut_24_1 = stackIn_24_1;
                  stackOut_24_2 = (StringBuilder) (Object) stackIn_24_2;
                  stackOut_24_3 = stackIn_24_3;
                  stackOut_24_4 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  stackIn_25_4 = stackOut_24_4;
                  break L7;
                } else {
                  stackOut_23_0 = (String[]) (Object) stackIn_23_0;
                  stackOut_23_1 = stackIn_23_1;
                  stackOut_23_2 = (StringBuilder) (Object) stackIn_23_2;
                  stackOut_23_3 = stackIn_23_3;
                  stackOut_23_4 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  stackIn_25_3 = stackOut_23_3;
                  stackIn_25_4 = stackOut_23_4;
                  break L7;
                }
              }
              L8: {
                stackOut_25_0 = (String[]) (Object) stackIn_25_0;
                stackOut_25_1 = stackIn_25_1;
                stackOut_25_2 = ((StringBuilder) (Object) stackIn_25_2).append(cj.a(wb.a(stackIn_25_3 != 0, stackIn_25_4 != 0, false, rg.a((byte) 121)), -51, '#')[0]).append(" ");
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_27_2 = stackOut_25_2;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                if (0 == w.field_r) {
                  stackOut_27_0 = (String[]) (Object) stackIn_27_0;
                  stackOut_27_1 = stackIn_27_1;
                  stackOut_27_2 = (StringBuilder) (Object) stackIn_27_2;
                  stackOut_27_3 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  stackIn_28_3 = stackOut_27_3;
                  break L8;
                } else {
                  stackOut_26_0 = (String[]) (Object) stackIn_26_0;
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = (StringBuilder) (Object) stackIn_26_2;
                  stackOut_26_3 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_28_3 = stackOut_26_3;
                  break L8;
                }
              }
              L9: {
                stackOut_28_0 = (String[]) (Object) stackIn_28_0;
                stackOut_28_1 = stackIn_28_1;
                stackOut_28_2 = (StringBuilder) (Object) stackIn_28_2;
                stackOut_28_3 = stackIn_28_3;
                stackIn_30_0 = stackOut_28_0;
                stackIn_30_1 = stackOut_28_1;
                stackIn_30_2 = stackOut_28_2;
                stackIn_30_3 = stackOut_28_3;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                stackIn_29_2 = stackOut_28_2;
                stackIn_29_3 = stackOut_28_3;
                if (ei.field_q.e(-20049)) {
                  stackOut_30_0 = (String[]) (Object) stackIn_30_0;
                  stackOut_30_1 = stackIn_30_1;
                  stackOut_30_2 = (StringBuilder) (Object) stackIn_30_2;
                  stackOut_30_3 = stackIn_30_3;
                  stackOut_30_4 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  stackIn_31_3 = stackOut_30_3;
                  stackIn_31_4 = stackOut_30_4;
                  break L9;
                } else {
                  stackOut_29_0 = (String[]) (Object) stackIn_29_0;
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = (StringBuilder) (Object) stackIn_29_2;
                  stackOut_29_3 = stackIn_29_3;
                  stackOut_29_4 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  stackIn_31_2 = stackOut_29_2;
                  stackIn_31_3 = stackOut_29_3;
                  stackIn_31_4 = stackOut_29_4;
                  break L9;
                }
              }
              var14 = vg.a(stackIn_31_0, stackIn_31_1, cj.a(wb.a(stackIn_31_3 != 0, stackIn_31_4 != 0, false, rg.a((byte) 122)), -119, '#')[1]);
              int discarded$2 = al.field_Z.a(var14.toUpperCase(), 70, 165, 500, -8 + (-164 + param2), 16711680, -1, 1, 2, 12);
              break L3;
            }
          }
        }
        if (param0 <= -29) {
          L10: {
            var6 = 25;
            var7 = 260;
            var8 = 120;
            var9 = (-var7 + 640) / 2;
            var10 = 180;
            this.a(var8 + 16, (byte) -55, -8 + var10, var9 - 8, 16 + var7);
            int discarded$3 = wh.field_d.a(var5.toUpperCase(), var9, var10, var7, var8, 16776960, -1, 1, 1, var6);
            if (!ta.p(3)) {
              this.e(16777215, 340);
              break L10;
            } else {
              break L10;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (12 == ((re) this).field_f) {
            L1: {
              if (uj.field_l != 0) {
                break L1;
              } else {
                ((re) this).f((byte) 110);
                break L1;
              }
            }
            L2: {
              uh.field_i = uh.field_i + 8;
              if (64 >= uh.field_i) {
                break L2;
              } else {
                uh.field_i = 64;
                break L2;
              }
            }
            ed.a(uh.field_i, (byte) -108);
            break L0;
          } else {
            if (((re) this).field_f != 13) {
              break L0;
            } else {
              L3: {
                if (jh.field_ab == 0) {
                  ((re) this).f((byte) 121);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                qg.field_p = qg.field_p + 32;
                if (256 >= qg.field_p) {
                  break L4;
                } else {
                  qg.field_p = 256;
                  break L4;
                }
              }
              qi.b(qg.field_p, (byte) -99);
              break L0;
            }
          }
        }
        L5: {
          if (((re) this).field_d == 16) {
            ((re) this).field_t = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (((re) this).field_d != 2) {
            break L6;
          } else {
            L7: {
              if (this.a((byte) -106) < 0) {
                ((re) this).field_t = 1;
                break L7;
              } else {
                ((re) this).field_t = 0;
                break L7;
              }
            }
            if (((re) this).field_C.field_b == 3) {
              ((re) this).field_t = 2;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L8: {
          var2 = -73 / ((param0 - 9) / 63);
          if (((re) this).field_d != 4) {
            break L8;
          } else {
            if (5 == ((re) this).field_C.field_b) {
              if (4 > ((re) this).field_t) {
                ((re) this).field_t = ((re) this).field_t + 1;
                if (((re) this).field_t < 4) {
                  break L8;
                } else {
                  ((re) this).field_t = ((re) this).field_t - 4;
                  break L8;
                }
              } else {
                break L8;
              }
            } else {
              ((re) this).field_t = ((re) this).field_t + 1;
              if (~((re) this).field_C.field_b >= ~((re) this).field_t) {
                ((re) this).field_t = ((re) this).field_t - ((re) this).field_C.field_b;
                break L8;
              } else {
                break L8;
              }
            }
          }
        }
        L9: {
          if (((re) this).field_d != 6) {
            break L9;
          } else {
            if (((re) this).field_C.field_b == 3) {
              ((re) this).field_t = 2;
              break L9;
            } else {
              if (1 >= ((re) this).field_C.field_b) {
                break L9;
              } else {
                ((re) this).field_t = ((re) this).field_t + 1;
                if (((re) this).field_t >= ((re) this).field_C.field_b) {
                  ((re) this).field_t = 0;
                  break L9;
                } else {
                  break L9;
                }
              }
            }
          }
        }
        L10: {
          L11: {
            if (((re) this).field_d == 1) {
              break L11;
            } else {
              if (((re) this).field_d == 7) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          ((re) this).field_t = 0;
          break L10;
        }
        L12: {
          L13: {
            if (((re) this).field_d == 12) {
              break L13;
            } else {
              if (((re) this).field_d == 14) {
                break L13;
              } else {
                if (((re) this).field_d == 15) {
                  break L13;
                } else {
                  if (13 == ((re) this).field_d) {
                    break L13;
                  } else {
                    if (11 == ((re) this).field_d) {
                      break L13;
                    } else {
                      if (((re) this).field_d == 10) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
              }
            }
          }
          ((re) this).field_t = ((re) this).field_t + 1;
          if (((re) this).field_C.field_b <= ((re) this).field_t) {
            ((re) this).field_t = 0;
            break L12;
          } else {
            break L12;
          }
        }
        L14: {
          if (((re) this).field_d != 8) {
            break L14;
          } else {
            ((re) this).field_t = 1;
            break L14;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: {
          if (param1 == -55) {
            break L0;
          } else {
            ((re) this).field_o = 40;
            break L0;
          }
        }
        L1: {
          L2: {
            var6 = ((re) this).field_e;
            if (-18 == ((re) this).field_s) {
              break L2;
            } else {
              if (-18 == ((re) this).field_d) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          var6 = 256;
          break L1;
        }
        si.a(param3, param2, param4, param0, 0, 160 * var6 / 256);
        this.a(-1 + (param0 + param2), param2, param3, -18, -1 + param3 + param4);
    }

    private final void i(int param0, int param1) {
        if (30000 > uk.field_e) {
            uk.field_e = uk.field_e + 1;
        }
    }

    private final void h(int param0, int param1) {
        if (param1 != -4) {
            ((re) this).h(115);
        }
    }

    private final void g(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String stackIn_49_0 = null;
        String stackOut_48_0 = null;
        String stackOut_47_0 = null;
        L0: {
          this.a((byte) -103, ad.field_d);
          var3 = 2;
          if (null == ((re) this).field_H) {
            ((re) this).field_H = new bd(ln.field_a.field_d * var3, var3 * ln.field_a.field_a);
            ((re) this).field_H.a();
            am.field_d.a(4, var3);
            o.field_n.b((byte) 113);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.a(150, (byte) -55, 70, 52, 304);
          this.a(150, (byte) -55, 70, 364, 220);
          this.a(176, (byte) -55, 228, 52, 304);
          this.a(176, (byte) -55, 228, 364, 220);
          si.d(367, 73, 581, 217);
          ((re) this).field_H.e(364 + -mm.field_m[0].field_j.field_e * var3 + 110, -mm.field_m[0].field_j.field_g * var3 + 150);
          if ((ca.field_c & 128) > 0) {
            si.f(var3 / 2 + 152, 1 + (var3 / 2 + 128), 4, 16777215, 128);
            si.f(var3 / 2 + 152, var3 / 2 + 129, 3, 16777215, 128);
            si.f(151 - -(var3 / 2) + 1, 128 + (var3 / 2 - -1), 2, 16777215, 64);
            si.b(152 - -(var3 / 2), 1 + (var3 / 2 + 128), 4, 0);
            break L1;
          } else {
            si.f(var3 / 2 + 152, 128 - (-(var3 / 2) - 1), 4, 65535, 128);
            si.f(var3 / 2 + 152, 128 + (var3 / 2 + 1), 3, 65535, 128);
            si.f(1 + var3 / 2 + 151, 128 + (var3 / 2 - -1), 2, 16777215, 64);
            si.b(152 - -(var3 / 2), var3 / 2 + 129, 4, 0);
            break L1;
          }
        }
        L2: {
          si.c();
          var4 = "Missing text";
          if (bm.field_c != 0) {
            break L2;
          } else {
            L3: {
              if (0 != rl.field_c) {
                break L3;
              } else {
                var4 = pk.field_j;
                break L3;
              }
            }
            L4: {
              if (1 == rl.field_c) {
                var4 = vg.field_b;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (rl.field_c == 2) {
                var4 = wi.field_a;
                if (r.field_a == 1) {
                  break L5;
                } else {
                  var4 = ie.field_a;
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (rl.field_c != 3) {
                break L6;
              } else {
                var4 = cb.field_h;
                break L6;
              }
            }
            L7: {
              if (4 != rl.field_c) {
                break L7;
              } else {
                var4 = jg.field_k;
                if (r.field_a != 1) {
                  var4 = ph.field_B;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (rl.field_c == 5) {
                L9: {
                  var4 = id.field_b;
                  if (kh.field_U[0] == 5) {
                    break L9;
                  } else {
                    if (5 != kh.field_U[1]) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                var4 = od.field_E;
                if (0 < kh.field_ib[2]) {
                  break L8;
                } else {
                  var4 = g.field_O;
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (rl.field_c == 6) {
                var4 = ld.field_q;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (rl.field_c == 7) {
                var4 = rg.field_c;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (rl.field_c == 8) {
                var4 = cn.field_c;
                if (0 != r.field_a) {
                  break L12;
                } else {
                  var4 = kc.field_b;
                  break L12;
                }
              } else {
                break L12;
              }
            }
            if (9 == rl.field_c) {
              var4 = dn.field_g;
              var5 = var4;
              var4 = var5;
              var5 = var4;
              var4 = var5;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L13: {
          if (null == q.field_g) {
            break L13;
          } else {
            var5 = q.field_g.a(false);
            if (var5 != null) {
              var4 = var5;
              break L13;
            } else {
              break L13;
            }
          }
        }
        L14: {
          if (rl.field_c >= 9) {
            stackOut_48_0 = fh.field_d + (rl.field_c - -1);
            stackIn_49_0 = stackOut_48_0;
            break L14;
          } else {
            stackOut_47_0 = fh.field_d + 48 + (1 + rl.field_c);
            stackIn_49_0 = stackOut_47_0;
            break L14;
          }
        }
        var11 = stackIn_49_0;
        var5 = var11;
        String dupTemp$2 = var11.toUpperCase();
        var10 = dupTemp$2;
        var5 = dupTemp$2;
        var6 = var10 + "  <col=ffffff>" + kh.field_fb[bm.field_c][rl.field_c].toUpperCase() + "</col>";
        var7 = 62;
        var7 = var7 + 16 * wh.field_d.a(var6, 60, var7, 288, 146, 16776960, -1, 0, 0, 16);
        var7 += 8;
        var12 = var4.toUpperCase();
        int discarded$3 = al.field_Z.a(var12, 60, var7, 288, 150, 16776960, -1, 0, 0, 12);
        var8 = ng.field_u / 50;
        var9 = 60;
        var7 = 212;
        if (param0 == 152) {
          L15: {
            var13 = c.field_e.toUpperCase() + jh.a((byte) -66, var8);
            wh.field_d.c(var13, var9, var7, 16776960, -1);
            if (rl.field_c < 0) {
              break L15;
            } else {
              if (rl.field_c < ub.field_a[bm.field_c].length) {
                var8 = ub.field_a[bm.field_c][rl.field_c];
                var14 = ki.field_d.toUpperCase() + jh.a((byte) -105, var8);
                var9 = 348;
                wh.field_d.a(var14, var9, var7, 16776960, -1);
                break L15;
              } else {
                break L15;
              }
            }
          }
          this.a(220, 228, (byte) 56, 364, 176);
          return;
        } else {
          return;
        }
    }

    private final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
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
              var4_int = 20;
              if (si.field_j > var4_int + param2) {
                break L1;
              } else {
                if (param2 > si.field_a) {
                  break L1;
                } else {
                  wh.field_d.c(param0.toUpperCase(), 96, 35 + param2, 16776960, -1);
                  break L1;
                }
              }
            }
            L2: {
              param2 = param2 + var4_int;
              if (param1 > 56) {
                break L2;
              } else {
                var5 = null;
                String discarded$2 = re.a((String) null, (String) null, (String) null, 41);
                break L2;
              }
            }
            stackOut_5_0 = param2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("re.W(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_6_0;
    }

    private final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        nc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var16 = HostileSpawn.field_I ? 1 : 0;
          u.field_f[26] = jf.field_e;
          if (bm.field_c != 0) {
            if (ng.field_k) {
              stackOut_4_0 = 2;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_5_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_5_0;
        uf.field_g[var3].b(0, 0);
        if (param0 > 112) {
          L1: {
            if (uk.field_e <= 150) {
              break L1;
            } else {
              if (2 != ig.field_L) {
                var4 = Math.min(480, 4 * (uk.field_e + -150));
                var5 = 355;
                var6 = 274;
                var7 = 10;
                var8 = 460;
                var9 = var5 + var6 / 2;
                var10 = 38 + var7;
                si.a(var5, var7, var6, var8, 0, 160 * var4 / 480);
                si.d(0, 0, 640, var4);
                this.a(1 + var7 - -var8, var7 - 2, var5 - 2, -18, 1 + var5 - -var6);
                mk.field_L.b(dl.field_p, var9, var10, 16777215, -1);
                var10 += 38;
                var12 = wh.field_d;
                var13 = 16776960;
                var18 = vg.a(new String[1], 30, bi.field_f).toUpperCase();
                ((vm) (Object) var12).b(var18, var9, var10, var13, -1);
                var19 = vg.a(new String[1], 28, vc.field_f).toUpperCase();
                var10 += 26;
                ((vm) (Object) var12).b(var19, var9, var10, var13, -1);
                var20 = md.field_m + jh.a((byte) -67, sg.field_i / 50);
                var10 += 26;
                var21 = var20.toUpperCase();
                ((vm) (Object) var12).b(var21, var9, var10, var13, -1);
                var10 += 26;
                var14 = 0;
                var15 = hh.field_d;
                L2: while (true) {
                  if (var15 >= 10) {
                    L3: {
                      var22 = ki.field_d + jh.a((byte) -78, var14);
                      var23 = var22.toUpperCase();
                      ((vm) (Object) var12).b(var23, var9, var10, var13, -1);
                      var24 = vg.a(new String[1], 67, o.field_j.toUpperCase());
                      var10 += 36;
                      mk.field_L.b(var24, var9, var10, var13, -1);
                      var17 = sg.d(24);
                      var11 = var17;
                      var10 += 36;
                      if (var11 != null) {
                        L4: {
                          var25 = vg.a(new String[1], 65, ag.field_j).toUpperCase();
                          if (-4 + var6 >= mk.field_L.a(var25)) {
                            mk.field_L.b(var25, var9, var10 + 8, var13, -1);
                            break L4;
                          } else {
                            int discarded$2 = wh.field_d.a(var25, var5 - -4, var10 + -35, var6 + -8, 100, var13, -1, 1, 0, 18);
                            break L4;
                          }
                        }
                        var10 += 36;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ne.a(24, 280, var9);
                    if (om.field_b) {
                      break L1;
                    } else {
                      if (!ln.field_b[bm.field_c]) {
                        var26 = am.field_a.toUpperCase();
                        int discarded$3 = ((vm) (Object) var12).a(var26, -130 + var9, 340, 260, 80, var13, -1, 1, 0, 24);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    var14 = var14 + ub.field_a[bm.field_c][var15];
                    var15++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          ((re) this).field_F.a(true, true);
          var3 = ((re) this).field_J;
          ((re) this).field_J = -1;
          if (param0 == -125) {
            break L0;
          } else {
            this.h((byte) -70);
            break L0;
          }
        }
        L1: {
          if (jj.field_g <= ((re) this).field_F.field_Ib.field_tb) {
            if (jj.field_g >= ((re) this).field_F.field_Ib.field_tb) {
              break L1;
            } else {
              ((re) this).field_F.field_Ib.field_tb = ((re) this).field_F.field_Ib.field_tb - 8;
              if (jj.field_g > ((re) this).field_F.field_Ib.field_tb) {
                ((re) this).field_F.field_Ib.field_tb = jj.field_g;
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            ((re) this).field_F.field_Ib.field_tb = ((re) this).field_F.field_Ib.field_tb + 8;
            if (jj.field_g >= ((re) this).field_F.field_Ib.field_tb) {
              break L1;
            } else {
              ((re) this).field_F.field_Ib.field_tb = jj.field_g;
              break L1;
            }
          }
        }
        L2: {
          if (ka.a(286, 0, 100, 496, 72)) {
            var4 = 0;
            L3: while (true) {
              if (42 <= var4) {
                break L2;
              } else {
                if (!hb.a(var4, mc.field_E, false)) {
                  if (((re) this).field_b[var4].field_S) {
                    ((re) this).field_J = var4;
                    break L2;
                  } else {
                    var4++;
                    continue L3;
                  }
                } else {
                  var4++;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (1 != pf.field_o) {
            if (((re) this).field_J < 0) {
              break L4;
            } else {
              if (var3 != ((re) this).field_J) {
                eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                break L4;
              } else {
                break L4;
              }
            }
          } else {
            L5: {
              L6: {
                if (((re) this).field_x >= 0) {
                  break L6;
                } else {
                  if (0 <= ((re) this).field_J) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              eh.field_c.a(lm.field_A[4], 100, uh.field_i);
              break L5;
            }
            if (((re) this).field_J == ((re) this).field_x) {
              ((re) this).field_x = -1;
              break L4;
            } else {
              ((re) this).field_x = ((re) this).field_J;
              break L4;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (((re) this).field_C != null) {
          L0: {
            var4 = 0;
            var4 = var4 * 2;
            if (256 < var4) {
              var4 = 256;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param1 <= -6) {
              break L1;
            } else {
              this.h(46, 16);
              break L1;
            }
          }
          L2: {
            var5 = ((re) this).field_t;
            if (((re) this).field_t == var5) {
              break L2;
            } else {
              if (((re) this).field_t < 0) {
                break L2;
              } else {
                eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                break L2;
              }
            }
          }
          L3: {
            if (((re) this).field_d != param0) {
              break L3;
            } else {
              L4: {
                var8 = param0;
                if (var8 == 10) {
                  break L4;
                } else {
                  if (var8 == 9) {
                    break L4;
                  } else {
                    if (var8 != 12) {
                      L5: {
                        if (var8 == 14) {
                          break L5;
                        } else {
                          if (15 == var8) {
                            break L5;
                          } else {
                            if (var8 != 11) {
                              if (var8 != 13) {
                                if (var8 == 3) {
                                  L6: {
                                    if (pf.a(-124)) {
                                      stackOut_43_0 = 0;
                                      stackIn_44_0 = stackOut_43_0;
                                      break L6;
                                    } else {
                                      stackOut_42_0 = 1;
                                      stackIn_44_0 = stackOut_42_0;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    var6 = stackIn_44_0;
                                    var7 = dh.field_a.a(-1, var6 != 0);
                                    if (3 != var7) {
                                      break L7;
                                    } else {
                                      ((re) this).field_s = 0;
                                      ((re) this).field_j = 1;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (var7 == 1) {
                                      ((re) this).field_s = 0;
                                      ((re) this).field_j = 1;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if (var7 == 2) {
                                      ((re) this).field_j = 1;
                                      ((re) this).field_s = 0;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  return;
                                } else {
                                  if (var8 != 0) {
                                    if (5 == var8) {
                                      this.b(param2, -27961);
                                      break L3;
                                    } else {
                                      if (4 != var8) {
                                        if (var8 != 2) {
                                          if (8 == var8) {
                                            this.b((byte) -123);
                                            break L3;
                                          } else {
                                            if (var8 != 6) {
                                              L10: {
                                                if (var8 == 1) {
                                                  break L10;
                                                } else {
                                                  if (var8 != 7) {
                                                    if (var8 != 16) {
                                                      break L10;
                                                    } else {
                                                      this.b(false);
                                                      break L3;
                                                    }
                                                  } else {
                                                    break L3;
                                                  }
                                                }
                                              }
                                              break L3;
                                            } else {
                                              this.a((byte) -125, param2);
                                              break L3;
                                            }
                                          }
                                        } else {
                                          this.c(param2, -10099);
                                          break L3;
                                        }
                                      } else {
                                        this.d(3);
                                        break L3;
                                      }
                                    }
                                  } else {
                                    this.h(param2, -4);
                                    break L3;
                                  }
                                }
                              } else {
                                this.i(param2, 17691);
                                break L3;
                              }
                            } else {
                              this.a(param2, -25345);
                              break L3;
                            }
                          }
                        }
                      }
                      this.i(param2, 17691);
                      break L3;
                    } else {
                      this.i(param2, 17691);
                      break L3;
                    }
                  }
                }
              }
              this.a(89, param0, param2);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, bd param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_int = (int)((double)ch.field_q / 2.0);
                var6 = ((re) this).field_e;
                if (((re) this).field_d == 17) {
                  break L2;
                } else {
                  if (((re) this).field_s != 17) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6 = 256;
              break L1;
            }
            if (param0 == 50) {
              L3: {
                if (var5_int <= 10) {
                  L4: {
                    var7 = var5_int - 5;
                    if (0 <= var7) {
                      var7 = -var7 + 5;
                      break L4;
                    } else {
                      var7 = 5 + var7;
                      break L4;
                    }
                  }
                  var7 = (int)((double)var7 * 1.5);
                  var8 = param2.field_A;
                  var9 = 0;
                  L5: while (true) {
                    if (var8 <= var9) {
                      si.c();
                      break L3;
                    } else {
                      L6: {
                        si.d(0, var9 - -param3, 640, var9 + (param3 + 1));
                        var10 = (int)(Math.random() * (double)var7);
                        if (Math.random() >= 0.5) {
                          break L6;
                        } else {
                          var10 = -var10;
                          break L6;
                        }
                      }
                      param2.b(var10 + param1, param3, var6);
                      param2.c(var10 + param1, param3, (int)(8.0 * (Math.random() * (double)var7) * (double)var6 / 256.0));
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  param2.b(param1, param3, var6);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("re.JB(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param3 + 41);
        }
    }

    private final void i(int param0) {
        Object var2 = null;
        le var2_ref = null;
        le var3 = null;
        if (0 <= rl.field_c) {
          L0: {
            var2 = null;
            if (null != ((re) this).field_G) {
              var2_ref = ((re) this).field_G.field_Ib;
              break L0;
            } else {
              var2_ref = new le(-1L, (le) null);
              break L0;
            }
          }
          L1: {
            var2_ref.field_fb = f.field_a[bm.field_c][rl.field_c];
            if (om.field_b) {
              var2_ref.field_fb = f.field_a[bm.field_c][10];
              break L1;
            } else {
              break L1;
            }
          }
          var2_ref.field_fb = var2_ref.field_fb.toUpperCase();
          var2_ref.field_T = 16776960;
          var2_ref.field_R = 15;
          var2_ref.field_qb = 220;
          var2_ref.field_ab = (vm) (Object) al.field_Z;
          var2_ref.field_L = 4;
          var2_ref.field_sb = Math.max(141, var2_ref.field_ab.b(var2_ref.field_fb, var2_ref.field_qb + -(2 * var2_ref.field_L), var2_ref.field_R));
          this.a(false);
          var3 = new le(-1L, (le) null);
          var3.field_qb = 41 + var2_ref.field_qb;
          var3.field_sb = 140;
          ((re) this).field_G = new th(-1L, var2_ref, var3, ((re) this).field_z);
          ((re) this).field_G.field_qb = var3.field_qb;
          ((re) this).field_G.field_sb = 140;
          ((re) this).field_G.field_zb = 216;
          ((re) this).field_G.field_tb = 324;
          ((re) this).field_G.a(16, 16, (byte) -123);
          ((re) this).field_G.a(true, true);
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        if (param0) {
            this.j(118);
        }
    }

    private final void l(int param0) {
        L0: {
          if (~((re) this).field_d != param0) {
            ((re) this).field_F = null;
            break L0;
          } else {
            if (null == ((re) this).field_F) {
              this.e(-18);
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        si.a(-3 + param2, param3 - 3, 174, 13, 0, ((re) this).field_e);
        si.d(0, 0, param2 - -(160 * param1 / 128), 480);
        si.a(param2, param3, 160, 8, 4210688, ((re) this).field_e);
        ((re) this).field_m = -param2 + (-2 + j.field_c);
        si.c();
        if (param0 != -18902) {
            ((re) this).field_g = -42;
        }
        si.a(param1 * 160 / 128 + param2, param3, 8, 8, 14408449, ((re) this).field_e);
    }

    final void a(int param0, int param1, int param2, int param3) {
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          if ((7 & em.field_c) == 0) {
            L1: {
              boolean discarded$3 = f.a((byte) 119);
              if (0 < ((re) this).field_j) {
                kc.field_c = 0;
                break L1;
              } else {
                kc.field_c = 16;
                break L1;
              }
            }
            L2: {
              if (~kc.field_c < ~lk.field_H) {
                lk.field_H = lk.field_H + 1;
                break L2;
              } else {
                if (~lk.field_H >= ~kc.field_c) {
                  break L2;
                } else {
                  lk.field_H = lk.field_H - 1;
                  break L2;
                }
              }
            }
            L3: {
              boolean discarded$4 = f.a((byte) 119);
              if (null != ec.field_b) {
                eh.field_c.a((tj) (Object) ec.field_b);
                ec.field_b = null;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (null == q.field_i) {
                break L4;
              } else {
                eh.field_c.a((tj) (Object) q.field_i);
                q.field_i = null;
                break L4;
              }
            }
            if (null == e.field_l) {
              break L0;
            } else {
              eh.field_c.a((tj) (Object) e.field_l);
              e.field_l = null;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L5: {
          ag.field_w = 30.0f;
          vb.field_Jb = 0.8999999761581421f;
          qm.field_O = 0.5f;
          ea.field_d = 0.5f;
          vc.field_a = 0.30000001192092896f;
          an.field_n = 0.20000000298023224f;
          var5 = kd.field_v.j();
          if (vc.field_a != var5) {
            kd.field_v.d(ua.a((byte) -67, vc.field_a, var5, 0.07000000029802322f));
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var5 = kd.field_v.h();
          if (var5 == qm.field_O) {
            break L6;
          } else {
            kd.field_v.f(ua.a((byte) -68, qm.field_O, var5, 0.07000000029802322f));
            break L6;
          }
        }
        var5 = kd.field_v.f();
        if (param3 == -99) {
          L7: {
            if (var5 == ea.field_d) {
              break L7;
            } else {
              kd.field_v.b(ua.a((byte) -54, ea.field_d, var5, 0.009999999776482582f));
              break L7;
            }
          }
          L8: {
            var5 = kd.field_v.g();
            if (var5 == ag.field_w) {
              break L8;
            } else {
              kd.field_v.e(ua.a((byte) -40, ag.field_w, var5, 1.0f));
              break L8;
            }
          }
          L9: {
            var5 = kd.field_v.k();
            if (an.field_n == var5) {
              break L9;
            } else {
              kd.field_v.c(ua.a((byte) -108, an.field_n, var5, 0.009999999776482582f));
              break L9;
            }
          }
          L10: {
            var5 = kd.field_v.e();
            if (vb.field_Jb != var5) {
              kd.field_v.a(ua.a((byte) -114, vb.field_Jb, var5, 0.009999999776482582f));
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            int fieldTemp$5 = ch.field_q + 1;
            ch.field_q = ch.field_q + 1;
            if (fieldTemp$5 <= 50) {
              break L11;
            } else {
              if (Math.random() >= 0.005) {
                break L11;
              } else {
                ch.field_q = 0;
                break L11;
              }
            }
          }
          L12: {
            if (!wl.field_b) {
              break L12;
            } else {
              ((re) this).f(param3 ^ 31);
              break L12;
            }
          }
          L13: {
            L14: {
              this.l(-7);
              this.e((byte) -29);
              if (~((re) this).field_a != ~param2) {
                break L14;
              } else {
                if (param1 != ((re) this).field_o) {
                  break L14;
                } else {
                  if (((re) this).field_y != param0) {
                    break L14;
                  } else {
                    if (ll.field_c != 0) {
                      break L14;
                    } else {
                      break L13;
                    }
                  }
                }
              }
            }
            ((re) this).field_K = false;
            ((re) this).field_o = param1;
            ((re) this).field_a = param2;
            ((re) this).field_y = param0;
            break L13;
          }
          L15: {
            L16: {
              this.a(((re) this).field_d, (byte) -86, ij.field_F);
              if (((re) this).field_d != 0) {
                break L16;
              } else {
                if (dd.field_o[((re) this).field_d].length == 9) {
                  stackOut_47_0 = 26;
                  stackIn_48_0 = stackOut_47_0;
                  break L15;
                } else {
                  break L16;
                }
              }
            }
            stackOut_46_0 = 30;
            stackIn_48_0 = stackOut_46_0;
            break L15;
          }
          L17: {
            var6 = stackIn_48_0;
            var7 = 432 - var6 * ((re) this).field_C.field_b;
            if (((re) this).field_d == 3) {
              var7 = 448;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            ij.field_F = var7;
            if (!((re) this).field_c) {
              if (0 < ((re) this).field_p) {
                ((re) this).field_p = ((re) this).field_p - 16;
                break L18;
              } else {
                break L18;
              }
            } else {
              ((re) this).field_p = ((re) this).field_p + 16;
              if (256 < ((re) this).field_p) {
                of.field_h = null;
                mc.field_I = 1;
                hg.field_e = 1;
                jf.field_c = 128;
                le.field_D = 0;
                return;
              } else {
                break L18;
              }
            }
          }
          L19: {
            L20: {
              if (((re) this).field_d == 1) {
                break L20;
              } else {
                if (((re) this).field_d != 7) {
                  break L19;
                } else {
                  break L20;
                }
              }
            }
            L21: {
              L22: {
                ((re) this).field_h.a(true, true);
                if (((re) this).field_h.f(2)) {
                  break L22;
                } else {
                  if (gf.field_i != 98) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              ((re) this).field_v = ((re) this).field_v - 20;
              break L21;
            }
            L23: {
              L24: {
                if (((re) this).field_h.j(0)) {
                  break L24;
                } else {
                  if (gf.field_i != 99) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              ((re) this).field_v = ((re) this).field_v + 20;
              break L23;
            }
            L25: {
              if (ll.field_c == 0) {
                break L25;
              } else {
                ((re) this).field_v = ((re) this).field_v + ll.field_c * 20;
                break L25;
              }
            }
            L26: {
              L27: {
                if (((re) this).field_h.g(-1)) {
                  break L27;
                } else {
                  if (gf.field_i == 102) {
                    break L27;
                  } else {
                    if (104 == gf.field_i) {
                      break L27;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              ((re) this).field_v = ((re) this).field_v - 128;
              break L26;
            }
            L28: {
              L29: {
                if (((re) this).field_h.c(false)) {
                  break L29;
                } else {
                  if (103 == gf.field_i) {
                    break L29;
                  } else {
                    if (gf.field_i == 105) {
                      break L29;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              ((re) this).field_v = ((re) this).field_v + 128;
              break L28;
            }
            L30: {
              if (gf.field_i == 102) {
                ((re) this).field_v = 0;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              if (gf.field_i != 103) {
                break L31;
              } else {
                ((re) this).field_v = ((re) this).field_g;
                break L31;
              }
            }
            L32: {
              if (((re) this).field_g - 304 >= ((re) this).field_v) {
                break L32;
              } else {
                ((re) this).field_v = -304 + ((re) this).field_g;
                break L32;
              }
            }
            L33: {
              if (((re) this).field_v >= 0) {
                break L33;
              } else {
                ((re) this).field_v = 0;
                break L33;
              }
            }
            L34: {
              if (!((re) this).field_h.h(-24467)) {
                break L34;
              } else {
                ((re) this).field_v = ((re) this).field_h.a(((re) this).field_g, (byte) 126, 304);
                break L34;
              }
            }
            gf.field_i = -1;
            ((re) this).field_h.a(((re) this).field_g, 0, 304, ((re) this).field_v);
            break L19;
          }
          L35: {
            if (0 >= ((re) this).field_j) {
              break L35;
            } else {
              L36: {
                ((re) this).field_j = ((re) this).field_j + 16;
                if (((re) this).field_j != 257) {
                  break L36;
                } else {
                  L37: {
                    var8 = ((re) this).field_s;
                    if (((re) this).field_s == 0) {
                      if (ta.p(3)) {
                        break L37;
                      } else {
                        if (0 >= wb.field_S) {
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    ((re) this).field_s = ((re) this).field_d;
                    ((re) this).field_d = var8;
                    if (((re) this).field_d == 0) {
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    ((re) this).field_C.field_b = dd.field_o[((re) this).field_d].length;
                    if (8 != ((re) this).field_d) {
                      break L39;
                    } else {
                      L40: {
                        if (((re) this).field_s == 2) {
                          break L40;
                        } else {
                          if (((re) this).field_s == 0) {
                            break L40;
                          } else {
                            break L39;
                          }
                        }
                      }
                      L41: {
                        if (rl.field_c < 0) {
                          rl.field_c = 0;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      ta.a((byte) 2, rl.field_c);
                      break L39;
                    }
                  }
                  L42: {
                    if (((re) this).field_d == 4) {
                      hg.field_e = 0;
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L43: {
                    if (((re) this).field_d == 6) {
                      hg.field_e = 0;
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                  if (((re) this).field_t >= ((re) this).field_C.field_b) {
                    ((re) this).field_t = -1 + ((re) this).field_C.field_b;
                    break L36;
                  } else {
                    break L36;
                  }
                }
              }
              if (512 <= ((re) this).field_j) {
                ((re) this).field_j = 0;
                break L35;
              } else {
                break L35;
              }
            }
          }
          L44: {
            if (((re) this).field_t < 0) {
              break L44;
            } else {
              if (dd.field_o[((re) this).field_d].length <= ((re) this).field_t) {
                break L44;
              } else {
                ((re) this).field_f = dd.field_o[((re) this).field_d][((re) this).field_t];
                break L44;
              }
            }
          }
          L45: {
            L46: {
              if (param0 != 1) {
                break L46;
              } else {
                if (((re) this).field_f <= -1) {
                  break L46;
                } else {
                  if (!((re) this).field_u) {
                    break L46;
                  } else {
                    L47: {
                      if (uj.field_l == 1) {
                        eh.field_c.a(lm.field_A[4], 100, uh.field_i);
                        break L47;
                      } else {
                        break L47;
                      }
                    }
                    this.a((byte) 111, true);
                    break L45;
                  }
                }
              }
            }
            L48: {
              if (ig.field_L != 1) {
                break L48;
              } else {
                if (((re) this).field_f <= -1) {
                  break L48;
                } else {
                  if (!((re) this).field_u) {
                    break L48;
                  } else {
                    L49: {
                      if (((re) this).field_f == 12) {
                        break L49;
                      } else {
                        if (((re) this).field_f != 13) {
                          break L48;
                        } else {
                          break L49;
                        }
                      }
                    }
                    this.a((byte) 121, true);
                    break L45;
                  }
                }
              }
            }
            break L45;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, vh param1, int param2, int param3, int param4, vh param5) {
        try {
            al.field_N = param1;
            ab.field_b = param2;
            jd.field_l = param4;
            if (param0 != 4) {
                field_D = null;
            }
            tk.field_c = param5;
            cl.field_l = param3;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "re.IB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b(int param0, int param1) {
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var5 = HostileSpawn.field_I ? 1 : 0;
        if (param3 >= -106) {
            field_q = null;
        }
        int var4 = param0.indexOf(param1);
        while (-1 != var4) {
            param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
            var4 = param0.indexOf(param1, param2.length() + var4);
        }
        return param0;
    }

    private final void g(int param0) {
        le var3 = null;
        le var4 = null;
        le var5 = null;
        bd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        le var11 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        var11 = new le(0L, (le) null);
        var3 = new le(0L, (le) null);
        var4 = new le(0L, (le) null);
        var5 = new le(0L, (le) null);
        var6 = new bd(16, 16);
        var6.a();
        var7 = 2;
        var8 = 6;
        var9 = 12;
        L0: while (true) {
          if (var9 <= 0) {
            L1: {
              L2: {
                var11.field_pb = var6;
                o.field_n.b((byte) -47);
                var3.field_pb = var6.h();
                var3.field_pb.f();
                var5.field_Bb = oa.field_m;
                var5.field_nb = oa.field_m;
                o.field_n.b((byte) -31);
                ((re) this).field_h = new fj(0L, var11, var3, var4, var5);
                if (((re) this).field_s == 1) {
                  break L2;
                } else {
                  if (((re) this).field_s != 7) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((re) this).field_h.a(559, 16, ((re) this).field_v, 20, 83, 310, 307, ((re) this).field_g);
              break L1;
            }
            return;
          } else {
            si.a(var7, var8, var9, 16776960);
            var7++;
            var8--;
            var9 -= 2;
            continue L0;
          }
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[][] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[][] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_9_2 = null;
        int[][] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[][] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[][] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_15_2 = null;
        int[][] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[][] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[][] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_19_2 = null;
        int[][] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[][] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_8_2 = null;
        int[][] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_7_2 = null;
        int[][] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[][] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_18_2 = null;
        int[][] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_17_2 = null;
        int[][] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[][] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int[] stackOut_14_2 = null;
        int[][] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_13_2 = null;
        if (!ta.p(3)) {
          L0: {
            if (!ib.a((byte) -72)) {
              break L0;
            } else {
              if (null != gi.field_h) {
                oc.field_h[1][0] = gi.field_h.a("level_01.dat", "", 0);
                oc.field_h[1][1] = gi.field_h.a("level_02.dat", "", 0);
                oc.field_h[1][2] = gi.field_h.a("level_03.dat", "", 0);
                oc.field_h[1][3] = gi.field_h.a("level_04.dat", "", 0);
                oc.field_h[1][4] = gi.field_h.a("level_05.dat", "", 0);
                oc.field_h[1][5] = gi.field_h.a("level_06.dat", "", 0);
                oc.field_h[1][6] = gi.field_h.a("level_07.dat", "", 0);
                oc.field_h[1][7] = gi.field_h.a("level_08.dat", "", 0);
                oc.field_h[1][8] = gi.field_h.a("level_09.dat", "", 0);
                oc.field_h[1][9] = gi.field_h.a("level_10.dat", "", 0);
                gi.field_h = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            dd.field_o[4] = bh.field_j;
            dd.field_o[15] = nm.field_c;
            dd.field_o[13] = nm.field_c;
            dd.field_o[10] = nm.field_c;
            stackOut_6_0 = dd.field_o;
            stackOut_6_1 = 10;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (!om.field_b) {
              stackOut_8_0 = (int[][]) (Object) stackIn_8_0;
              stackOut_8_1 = stackIn_8_1;
              stackOut_8_2 = ja.field_h;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (int[][]) (Object) stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = nm.field_c;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackIn_9_0[stackIn_9_1] = stackIn_9_2;
            var2 = 0;
            if (!ib.a((byte) -72)) {
              L3: {
                stackOut_16_0 = dd.field_o;
                stackOut_16_1 = 2;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (var2 != 0) {
                  stackOut_18_0 = (int[][]) (Object) stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = j.field_b;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L3;
                } else {
                  stackOut_17_0 = (int[][]) (Object) stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = HostileSpawn.field_K;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L3;
                }
              }
              stackIn_19_0[stackIn_19_1] = stackIn_19_2;
              break L2;
            } else {
              L4: {
                if (((re) this).field_d != 2) {
                  break L4;
                } else {
                  this.h((byte) 33);
                  break L4;
                }
              }
              L5: {
                stackOut_12_0 = dd.field_o;
                stackOut_12_1 = 2;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (var2 != 0) {
                  stackOut_14_0 = (int[][]) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = ob.field_e;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_13_0 = (int[][]) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = r.field_d;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L5;
                }
              }
              stackIn_15_0[stackIn_15_1] = stackIn_15_2;
              dd.field_o[0] = wl.field_d;
              dd.field_o[5] = eh.field_f;
              break L2;
            }
          }
          L6: {
            dd.field_o[6] = td.field_d;
            if (!ib.a((byte) -72)) {
              break L6;
            } else {
              dd.field_o[6] = ak.field_c;
              dd.field_o[4] = oj.field_y;
              break L6;
            }
          }
          L7: {
            ((re) this).field_C.field_b = dd.field_o[((re) this).field_d].length;
            sg.field_j = wk.a(4, -2178);
            vf.k(-8255);
            sa.a(5);
            if (9 == ((re) this).field_d) {
              L8: {
                if (rg.a((byte) -95)) {
                  break L8;
                } else {
                  break L8;
                }
              }
              if (((re) this).field_d == 9) {
                ((re) this).field_d = 10;
                break L7;
              } else {
                break L7;
              }
            } else {
              break L7;
            }
          }
          L9: {
            if (((re) this).field_d != 14) {
              break L9;
            } else {
              ((re) this).field_d = 12;
              if (wb.field_S > 0) {
                break L9;
              } else {
                ((re) this).field_d = 15;
                break L9;
              }
            }
          }
          ((re) this).field_C.field_b = dd.field_o[((re) this).field_d].length;
          if (param0 < -100) {
            wl.field_b = false;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(byte param0) {
        if (param0 <= 57) {
            this.b(true);
        }
        if (((re) this).field_f == -1) {
            ((re) this).d((byte) 101);
        } else {
            this.a((byte) 116, false);
            ((re) this).field_t = 0;
        }
    }

    private final void d(int param0) {
        ic var2 = null;
        if (!(ta.p(3))) {
            if (!(null != p.field_m[bm.field_c])) {
                p.field_m[bm.field_c] = pi.a(10, 6413, 3, ka.field_p[bm.field_c], 1);
            }
            var2 = p.field_m[bm.field_c];
            if (var2.field_m) {
                if (!(null == var2.field_p)) {
                    int discarded$0 = fg.a(var2, ue.field_e, false, ch.field_h);
                }
            }
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        this.a(200, (byte) -55, 140, 54, 200);
        this.a((byte) 50, 54 + (200 - hk.field_h.field_z) / 2, hk.field_h, 140 - -((200 + -hk.field_h.field_A) / 2));
        if (param0 < -103) {
          L0: {
            this.a(200, (byte) -55, 140, 280, 300);
            if (((re) this).field_d == 17) {
              this.a((byte) 112, ln.field_h.toUpperCase());
              break L0;
            } else {
              this.a((byte) -126, sa.field_d.toUpperCase());
              break L0;
            }
          }
          L1: {
            if (ib.a((byte) -72)) {
              L2: {
                L3: {
                  var3 = ((re) this).field_e;
                  if (-18 == ((re) this).field_s) {
                    break L3;
                  } else {
                    if (-18 != ((re) this).field_d) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var3 = 256;
                break L2;
              }
              id.field_A.c(eg.field_j.toUpperCase(), 600, 55, 8421376, -1, var3);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = -72 % ((48 - param0) / 59);
              var3_int = (int)((double)ch.field_q / 2.0);
              if (((re) this).field_j < -201) {
                if (-301 > ((re) this).field_j) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_7_0;
              if (var5 == 0) {
                break L2;
              } else {
                if (var3_int <= 10) {
                  break L2;
                } else {
                  var3_int = 16 - -(var3_int % 16);
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (var3_int <= 10) {
                  break L4;
                } else {
                  if (var5 == 0) {
                    mk.field_L.c(param1, 54, 60, 16776960, -1);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var6 = -5 + var3_int;
                if (0 <= var6) {
                  var6 = 5 + -var6;
                  break L5;
                } else {
                  var6 = 5 - -var6;
                  break L5;
                }
              }
              var6 = (int)((double)var6 * 0.8);
              var7 = mk.field_L.field_u;
              var8 = 0;
              L6: while (true) {
                if (var8 >= var7) {
                  si.c();
                  break L3;
                } else {
                  L7: {
                    si.d(0, 60 + -var8, 640, 1 + -var8 + 60);
                    var9 = (int)(Math.random() * (double)var6);
                    if (0.5 > Math.random()) {
                      var9 = -var9;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  mk.field_L.c(param1, 54 + var9, 60, 16776960, -1);
                  var8++;
                  continue L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("re.JA(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    re(boolean param0) {
        L0: {
          ((re) this).field_J = -1;
          ((re) this).field_b = new le[42];
          ((re) this).field_w = new le[2][11];
          ((re) this).field_v = 0;
          ((re) this).field_x = -1;
          ((re) this).field_e = 0;
          ((re) this).field_g = 0;
          ((re) this).field_C = new be();
          ((re) this).field_f = -1;
          if (param0) {
            L1: {
              if (1 != hg.field_e) {
                break L1;
              } else {
                ((re) this).field_p = 256;
                break L1;
              }
            }
            ((re) this).field_d = 0;
            if (hg.field_e != 1) {
              break L0;
            } else {
              ((re) this).field_d = 5;
              ((re) this).field_H = null;
              break L0;
            }
          } else {
            ((re) this).field_p = 256;
            ((re) this).field_d = 4;
            if (!rg.a((byte) -85)) {
              break L0;
            } else {
              ((re) this).field_d = 6;
              break L0;
            }
          }
        }
        ((re) this).field_C.field_b = dd.field_o[((re) this).field_d].length;
        ij.field_F = 448;
    }

    re(int param0) {
        ((re) this).field_J = -1;
        ((re) this).field_b = new le[42];
        ((re) this).field_w = new le[2][11];
        ((re) this).field_v = 0;
        ((re) this).field_x = -1;
        ((re) this).field_e = 0;
        ((re) this).field_g = 0;
        ((re) this).field_C = new be();
        ((re) this).field_d = param0;
        ((re) this).field_f = -1;
        ((re) this).field_p = 256;
        if (5 == ((re) this).field_d) {
            ((re) this).field_H = null;
        }
        ((re) this).field_C.field_b = dd.field_o[((re) this).field_d].length;
        ij.field_F = 448;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ub();
        field_B = "Finally, this pass should unlock all the doors.";
        field_k = false;
        field_A = new java.awt.Color(10040319);
        field_I = "Use the mouse to direct the marine's fire.";
        field_i = new bl(0);
    }
}
