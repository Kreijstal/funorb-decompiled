/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf {
    private int field_B;
    private ag field_q;
    private he[] field_F;
    private nh field_f;
    private int field_G;
    int field_m;
    private ck[] field_L;
    private boolean field_C;
    private int field_E;
    private static int[] field_S;
    private int field_u;
    static he[] field_v;
    int field_O;
    int field_p;
    int field_I;
    double field_N;
    private int field_V;
    boolean field_s;
    static String field_x;
    int field_t;
    int field_d;
    private int field_K;
    private Random field_T;
    private int field_g;
    private he[] field_n;
    static bg field_h;
    private int field_M;
    private int field_c;
    double field_o;
    int field_w;
    double field_l;
    private he[] field_y;
    he field_D;
    private int field_U;
    private he[] field_r;
    private int field_R;
    private int field_e;
    private int field_z;
    private int field_a;
    int field_J;
    private gf field_b;
    private boolean field_A;
    private hi[] field_i;
    int field_k;
    private int field_P;
    int field_H;
    int field_W;
    int field_Q;
    double field_j;

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        bf var6 = null;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((bf) this).field_o < (double)param0) {
          return;
        } else {
          ((bf) this).field_a = ((bf) this).field_a - 1;
          if (((bf) this).field_a > 0) {
            L0: {
              var2 = -1;
              var3 = -1;
              var4 = (int)(((bf) this).field_o + (double)((bf) this).field_I);
              var5 = (int)(((bf) this).field_N + (double)((bf) this).field_t);
              var6_int = ((bf) this).field_Q;
              if (var6_int == 5) {
                L1: {
                  var2 = 23;
                  if (1 == ((bf) this).field_J) {
                    var2 = -1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (((bf) this).field_J != 2) {
                    break L2;
                  } else {
                    var3 = 3;
                    break L2;
                  }
                }
                if (((bf) this).field_J == 3) {
                  var3 = 4;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                if (var6_int != 7) {
                  if (var6_int != 11) {
                    if (var6_int == 17) {
                      L3: {
                        if (((bf) this).field_J == 1) {
                          var3 = 15;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2 = 58;
                      if (((bf) this).field_J != 2) {
                        break L0;
                      } else {
                        var3 = 16;
                        break L0;
                      }
                    } else {
                      if (18 != var6_int) {
                        if (var6_int != 61) {
                          return;
                        } else {
                          var2 = 64;
                          var3 = 15;
                          break L0;
                        }
                      } else {
                        var2 = 64;
                        var3 = 16;
                        break L0;
                      }
                    }
                  } else {
                    L4: {
                      L5: {
                        if (((bf) this).field_J == 1) {
                          break L5;
                        } else {
                          if (((bf) this).field_J != 3) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 = 37;
                      var6_int = 0;
                      L6: while (true) {
                        if (var6_int >= 3) {
                          if (var2 != -1) {
                            th.a(-27610, 32, e.a(param0 + 115, (int)((bf) this).field_o), nl.field_r[var2]);
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          bf discarded$1 = sd.field_a.a(hi.a(32, 4, ((bf) this).field_T) + (var5 + -16), true, var3, hi.a(64, param0 + 4, ((bf) this).field_T) + (var4 - 32), 0, true);
                          var6_int++;
                          continue L6;
                        }
                      }
                    }
                    var2 = 36;
                    break L0;
                  }
                } else {
                  L7: {
                    var4 -= 5;
                    if (((bf) this).field_J == 2) {
                      var3 = 37;
                      break L7;
                    } else {
                      var3 = 6;
                      break L7;
                    }
                  }
                  var5 -= 16;
                  break L0;
                }
              }
            }
            L8: {
              if (var3 == -1) {
                break L8;
              } else {
                var6 = sd.field_a.a(var5, true, var3, var4, 0, true);
                if (61 == ((bf) this).field_Q) {
                  var6.field_o = var6.field_o - (double)var6.field_I;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (var2 != -1) {
                th.a(-27610, 32, e.a(116, (int)((bf) this).field_o), nl.field_r[var2]);
                break L9;
              } else {
                break L9;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public static void c() {
        field_v = null;
        field_S = null;
        field_h = null;
        field_x = null;
    }

    final boolean d(byte param0) {
        he[] var2 = null;
        int var3 = 0;
        he var3_ref_he = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((bf) this).field_e != 0) {
            break L0;
          } else {
            if (((bf) this).field_q == null) {
              break L0;
            } else {
              od.a(-1630758008, ((bf) this).field_q);
              break L0;
            }
          }
        }
        L1: {
          if (param0 >= 35) {
            break L1;
          } else {
            ((bf) this).field_y = null;
            break L1;
          }
        }
        L2: {
          ((bf) this).field_V = ((bf) this).field_V + 1;
          ((bf) this).field_e = ((bf) this).field_e + 1;
          if (!((bf) this).field_s) {
            var2 = ((bf) this).field_F;
            break L2;
          } else {
            var2 = ((bf) this).field_n;
            ((bf) this).field_z = ((bf) this).field_z + 1;
            break L2;
          }
        }
        L3: {
          if (((bf) this).field_V % qa.field_T[((bf) this).field_Q] != 0) {
            break L3;
          } else {
            int fieldTemp$1 = ((bf) this).field_E + 1;
            ((bf) this).field_E = ((bf) this).field_E + 1;
            if (fieldTemp$1 != var2.length) {
              break L3;
            } else {
              ((bf) this).field_E = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((bf) this).field_r == null) {
            break L4;
          } else {
            L5: {
              if (((bf) this).field_u <= 0) {
                if (((bf) this).field_u < 0) {
                  ((bf) this).field_R = -(-((bf) this).field_u / qa.field_T[((bf) this).field_Q]) + (-1 + ((bf) this).field_r.length);
                  break L5;
                } else {
                  ((bf) this).field_u = ((bf) this).field_r.length - 1;
                  break L5;
                }
              } else {
                ((bf) this).field_R = -(((bf) this).field_u / qa.field_T[((bf) this).field_Q]) + -1 + ((bf) this).field_r.length;
                break L5;
              }
            }
            L6: {
              if (-1 + ((bf) this).field_r.length >= ((bf) this).field_R) {
                break L6;
              } else {
                ((bf) this).field_R = ((bf) this).field_r.length - 1;
                break L6;
              }
            }
            if (((bf) this).field_R >= 0) {
              break L4;
            } else {
              ((bf) this).field_R = 0;
              break L4;
            }
          }
        }
        L7: {
          if (null != ((bf) this).field_y) {
            ((bf) this).field_K = (((bf) this).field_y.length - 1) * (((bf) this).field_V % this.b((byte) -121, ((bf) this).field_Q)) / this.b((byte) -123, ((bf) this).field_Q);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            ((bf) this).field_A = false;
            var5 = ((bf) this).field_Q;
            if (var5 != 5) {
              if (var5 != 11) {
                if (var5 == 17) {
                  break L9;
                } else {
                  if (var5 != 18) {
                    if (var5 == 40) {
                      if (430.0 >= (double)((bf) this).field_t + ((bf) this).field_N) {
                        break L8;
                      } else {
                        this.e(63);
                        return true;
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    break L9;
                  }
                }
              } else {
                var3 = 1 + ((bf) this).field_V % this.b((byte) -125, ((bf) this).field_Q) / 20;
                var4 = 2097152;
                var7 = 0;
                var5 = var7;
                L10: while (true) {
                  if (~((bf) this).field_L.length >= ~var7) {
                    break L8;
                  } else {
                    var4 += 256;
                    ((bf) this).field_L[var7].a(-var3 + (int)((bf) this).field_N + ((bf) this).field_t - -hi.a(var3 * 2, 4, ((bf) this).field_T), var3 / 2, var4, 112, 1, (int)((bf) this).field_o - -hi.a(2 * var3, 4, ((bf) this).field_T) + -var3);
                    var7++;
                    continue L10;
                  }
                }
              }
            } else {
              break L9;
            }
          }
          var3 = 1 + ((bf) this).field_V % this.b((byte) -125, ((bf) this).field_Q) / 20;
          var4 = 2097152;
          var7 = 0;
          var5 = var7;
          L11: while (true) {
            if (~((bf) this).field_L.length >= ~var7) {
              break L8;
            } else {
              var4 += 256;
              ((bf) this).field_L[var7].a(-var3 + (int)((bf) this).field_N + ((bf) this).field_t - -hi.a(var3 * 2, 4, ((bf) this).field_T), var3 / 2, var4, 112, 1, (int)((bf) this).field_o - -hi.a(2 * var3, 4, ((bf) this).field_T) + -var3);
              var7++;
              continue L11;
            }
          }
        }
        L12: {
          L13: {
            if (8 == ((bf) this).field_Q) {
              break L13;
            } else {
              if (((bf) this).field_Q == 9) {
                break L13;
              } else {
                if (((bf) this).field_Q == 10) {
                  break L13;
                } else {
                  L14: {
                    if (cj.field_c[((bf) this).field_Q]) {
                      break L14;
                    } else {
                      if (6 == ((bf) this).field_Q) {
                        break L14;
                      } else {
                        if (((bf) this).field_Q == 0) {
                          break L14;
                        } else {
                          if (((bf) this).field_Q != 35) {
                            this.a((byte) -123);
                            this.f(-46);
                            ((bf) this).field_N = ((bf) this).field_N + ((bf) this).field_j;
                            ((bf) this).field_o = ((bf) this).field_o + ((bf) this).field_l;
                            break L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  ((bf) this).field_N = ((bf) this).field_N + ((bf) this).field_j;
                  ((bf) this).field_o = ((bf) this).field_o + ((bf) this).field_l;
                  this.f(-46);
                  break L12;
                }
              }
            }
          }
          ((bf) this).field_N = ((bf) this).field_N + ((bf) this).field_j;
          ((bf) this).field_o = ((bf) this).field_o + ((bf) this).field_l;
          break L12;
        }
        L15: {
          if (2 != hc.field_G) {
            break L15;
          } else {
            L16: {
              if (5 == ((bf) this).field_Q) {
                break L16;
              } else {
                if (((bf) this).field_Q == 11) {
                  break L16;
                } else {
                  if (((bf) this).field_Q == 17) {
                    break L16;
                  } else {
                    if (18 != ((bf) this).field_Q) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
              }
            }
            var3_ref_he = ((bf) this).b((byte) 55);
            if (((bf) this).field_o >= 0.0) {
              if (((bf) this).field_o > (double)((var3_ref_he.field_d + 640) / 2)) {
                ((bf) this).field_C = false;
                break L15;
              } else {
                break L15;
              }
            } else {
              ((bf) this).field_C = true;
              ((bf) this).field_g = (640 + var3_ref_he.field_d) / 2;
              break L15;
            }
          }
        }
        L17: {
          if (((bf) this).field_q == null) {
            break L17;
          } else {
            ((bf) this).field_q.l(e.a(124, (int)((bf) this).field_o));
            break L17;
          }
        }
        if (((bf) this).field_o >= (double)(-(100 + ((bf) this).field_m))) {
          L18: {
            if (38 == ((bf) this).field_Q) {
              break L18;
            } else {
              if (((bf) this).field_o > 740.0) {
                return true;
              } else {
                break L18;
              }
            }
          }
          L19: {
            if ((((bf) this).field_V & 1) != 0) {
              break L19;
            } else {
              if (vg.field_r[((bf) this).field_Q] == -1) {
                break L19;
              } else {
                var8 = 0;
                var3 = var8;
                L20: while (true) {
                  if (((bf) this).field_i.length <= var8) {
                    break L19;
                  } else {
                    ((bf) this).field_i[var8].a(lb.field_B[((bf) this).field_Q], 30, (double)vg.field_r[((bf) this).field_Q], (double)(int)((double)dd.field_h[((bf) this).field_Q] + ((bf) this).field_N), 0, -1.0, 1.0, (double)(int)((double)nc.field_L[((bf) this).field_Q] + ((bf) this).field_o), 64);
                    var8++;
                    continue L20;
                  }
                }
              }
            }
          }
          this.l(-39);
          return false;
        } else {
          return true;
        }
    }

    private final void a(byte param0, he param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 33) {
                break L1;
              } else {
                ((bf) this).a(47);
                break L1;
              }
            }
            L2: {
              if (((bf) this).field_A) {
                L3: {
                  param1.c((int)((bf) this).field_o, (int)((bf) this).field_N, 128, qk.field_b[((bf) this).field_Q]);
                  if (((bf) this).field_y == null) {
                    break L3;
                  } else {
                    ((bf) this).field_y[((bf) this).field_K].c((int)((bf) this).field_o, (int)((bf) this).field_N, 128, qk.field_b[((bf) this).field_Q]);
                    break L3;
                  }
                }
                if (null != ((bf) this).field_r) {
                  ((bf) this).field_r[((bf) this).field_R].c((int)((bf) this).field_o, (int)((bf) this).field_N, 128, qk.field_b[((bf) this).field_Q]);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                L4: {
                  param1.a((int)((double)(-param1.field_a) + ((bf) this).field_o) + ((bf) this).field_F[((bf) this).field_E].field_a, ((bf) this).field_F[((bf) this).field_E].field_f + (int)((double)(-param1.field_f) + ((bf) this).field_N));
                  if (((bf) this).field_y == null) {
                    break L4;
                  } else {
                    ((bf) this).field_y[((bf) this).field_K].a((int)((bf) this).field_o, (int)((bf) this).field_N);
                    break L4;
                  }
                }
                if (null != ((bf) this).field_r) {
                  ((bf) this).field_r[((bf) this).field_R].a((int)((bf) this).field_o, (int)((bf) this).field_N);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L5: {
              if (((bf) this).field_f == null) {
                break L5;
              } else {
                if (2 != sd.field_e) {
                  break L5;
                } else {
                  if (0 >= g.field_s[((bf) this).field_Q]) {
                    break L5;
                  } else {
                    L6: {
                      if (0 == (1 & ((bf) this).field_e)) {
                        int discarded$1 = 1;
                        ((bf) this).field_f = gm.a(((bf) this).field_f, fb.field_c[((bf) this).field_Q], g.field_s[((bf) this).field_Q], ff.field_Q[((bf) this).field_Q][((bf) this).field_E], fk.field_t[((bf) this).field_Q]);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (((bf) this).field_f != null) {
                      ((bf) this).field_f.a((int)((bf) this).field_o, (int)((bf) this).field_N, 382);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("bf.CA(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final boolean m(int param0) {
        if (param0 >= -94) {
            return false;
        }
        if (!((bf) this).field_s) {
            return true;
        }
        if (((bf) this).field_s) {
            if (!th.field_d[((bf) this).field_Q]) {
                return false;
            }
            return true;
        }
        return false;
    }

    final boolean a(boolean param0) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((bf) this).field_e = -20;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (((bf) this).field_Q < 19) {
                break L3;
              } else {
                if (30 >= ((bf) this).field_Q) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (((bf) this).field_Q < 65) {
                break L4;
              } else {
                if (((bf) this).field_Q > 76) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final int e(byte param0) {
        int var2 = -(int)((bf) this).field_N + 430;
        double var3 = (double)(((bf) this).field_e % k.field_M[((bf) this).field_Q]) / (0.5 * (double)k.field_M[((bf) this).field_Q]);
        int var5 = 126 % ((param0 - 26) / 63);
        return (int)((-var3 + 1.0) * (double)var2);
    }

    private final void l(int param0) {
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = ((bf) this).field_Q;
        if (40 != var2) {
            if (var2 != 41) {
                if (var2 != 8) {
                    if (9 != var2) {
                        if (!(var2 == 10)) {
                            if (!(var2 == 15)) {
                                if (16 != var2) {
                                    if (0.0 > ((bf) this).field_N) {
                                        if (!(cj.field_c[((bf) this).field_Q])) {
                                            ((bf) this).field_j = 0.0;
                                            ((bf) this).field_N = 0.0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (param0 != -39) {
            ((bf) this).field_i = null;
        }
    }

    private final int f(byte param0) {
        ek.field_n = (ek.field_n + 1) % 5;
        if (param0 < 56) {
            ((bf) this).field_T = null;
        }
        return ek.field_n;
    }

    private final boolean g(byte param0) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 < -34) {
          if (null != sd.field_a) {
            L0: {
              if (((bf) this).field_Q == 45) {
                break L0;
              } else {
                if (44 != ((bf) this).field_Q) {
                  return true;
                } else {
                  break L0;
                }
              }
            }
            L1: {
              if (200.0 <= dl.a(true, -sd.field_a.field_N + ((bf) this).field_o, -sd.field_a.field_D + ((bf) this).field_N)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = 33 / ((-20 - param0) / 37);
            if (((bf) this).field_Q == 5) {
              break L1;
            } else {
              if (((bf) this).field_Q == 11) {
                break L1;
              } else {
                if (((bf) this).field_Q == 17) {
                  break L1;
                } else {
                  if (18 != ((bf) this).field_Q) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 <= ((bf) this).field_H) {
          L0: {
            L1: {
              var4 = ((bf) this).field_Q;
              if (0 != var4) {
                if (var4 == 35) {
                  break L1;
                } else {
                  if (1 != var4) {
                    L2: {
                      if (2 == var4) {
                        break L2;
                      } else {
                        if (var4 != 47) {
                          L3: {
                            if (4 == var4) {
                              L4: {
                                if (Math.random() >= 0.01) {
                                  break L4;
                                } else {
                                  if (0 > ((bf) this).field_c) {
                                    ((bf) this).field_c = this.b((byte) -124, ((bf) this).field_Q);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              ((bf) this).field_c = ((bf) this).field_c - 1;
                              if (((bf) this).field_c != 0) {
                                break L3;
                              } else {
                                this.e(63);
                                break L3;
                              }
                            } else {
                              if (3 == var4) {
                                break L3;
                              } else {
                                if (var4 == 46) {
                                  ((bf) this).field_l = -oi.field_b[((bf) this).field_Q];
                                  break L0;
                                } else {
                                  if (var4 == 5) {
                                    L5: {
                                      if (0 == ((bf) this).field_V % 150) {
                                        this.d(param0 + 46);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (((bf) this).field_V % this.b((byte) -120, ((bf) this).field_Q) == 0) {
                                        this.e(63);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    if (((bf) this).field_V % 50 != 0) {
                                      break L0;
                                    } else {
                                      this.k(0);
                                      break L0;
                                    }
                                  } else {
                                    if (var4 != 7) {
                                      if (var4 == 12) {
                                        if (40 <= ((bf) this).field_V % k.field_M[((bf) this).field_Q]) {
                                          break L0;
                                        } else {
                                          if ((3 & (int)((bf) this).field_o) != 0) {
                                            break L0;
                                          } else {
                                            this.e(63);
                                            break L0;
                                          }
                                        }
                                      } else {
                                        if (var4 == 11) {
                                          L7: {
                                            if (((bf) this).field_u >= 0) {
                                              break L7;
                                            } else {
                                              if (((bf) this).field_V % 125 == 0) {
                                                ((bf) this).field_u = this.b((byte) -128, ((bf) this).field_Q);
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                          L8: {
                                            if (((bf) this).field_V % this.b((byte) -119, ((bf) this).field_Q) != 0) {
                                              break L8;
                                            } else {
                                              this.e(param0 ^ -19);
                                              break L8;
                                            }
                                          }
                                          L9: {
                                            ((bf) this).field_u = ((bf) this).field_u - 1;
                                            if (((bf) this).field_u == 0) {
                                              L10: {
                                                if (3 != ((bf) this).field_J) {
                                                  this.d(0);
                                                  this.g(param0 + -31);
                                                  break L10;
                                                } else {
                                                  if (0.5 <= Math.random()) {
                                                    this.g(param0 ^ 119);
                                                    break L10;
                                                  } else {
                                                    this.d(0);
                                                    break L10;
                                                  }
                                                }
                                              }
                                              ((bf) this).field_u = -1;
                                              break L9;
                                            } else {
                                              break L9;
                                            }
                                          }
                                          if (((bf) this).field_V % 62 < 10) {
                                            this.k(0);
                                            break L0;
                                          } else {
                                            break L0;
                                          }
                                        } else {
                                          L11: {
                                            if (var4 == 13) {
                                              break L11;
                                            } else {
                                              if (var4 != 14) {
                                                if (16 != var4) {
                                                  if (var4 != 38) {
                                                    if (var4 == 39) {
                                                      break L11;
                                                    } else {
                                                      if (var4 == 62) {
                                                        break L11;
                                                      } else {
                                                        if (var4 == 63) {
                                                          break L11;
                                                        } else {
                                                          if (var4 == 42) {
                                                            if (3 != ((bf) this).field_J) {
                                                              break L0;
                                                            } else {
                                                              if (((bf) this).field_V % this.b((byte) -125, ((bf) this).field_Q) != 0) {
                                                                break L0;
                                                              } else {
                                                                if (((bf) this).field_o >= 635.0) {
                                                                  break L0;
                                                                } else {
                                                                  this.e(param0 ^ -19);
                                                                  break L0;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            L12: {
                                                              if (var4 != 15) {
                                                                if (17 != var4) {
                                                                  if (var4 == 18) {
                                                                    L13: {
                                                                      if (((bf) this).field_V % 300 == 0) {
                                                                        if (Math.random() >= 0.5) {
                                                                          this.g(param0 ^ 13);
                                                                          break L13;
                                                                        } else {
                                                                          this.d(0);
                                                                          break L13;
                                                                        }
                                                                      } else {
                                                                        break L13;
                                                                      }
                                                                    }
                                                                    L14: {
                                                                      if (((bf) this).field_V % this.b((byte) -123, ((bf) this).field_Q) <= 100) {
                                                                        this.e(param0 ^ -19);
                                                                        break L14;
                                                                      } else {
                                                                        break L14;
                                                                      }
                                                                    }
                                                                    if ((((bf) this).field_V & 11) != 0) {
                                                                      break L0;
                                                                    } else {
                                                                      if (0 == (1 & ((bf) this).field_V >> 6)) {
                                                                        this.k(0);
                                                                        break L0;
                                                                      } else {
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (var4 != 61) {
                                                                      L15: {
                                                                        if (var4 != 45) {
                                                                          if (44 != var4) {
                                                                            break L0;
                                                                          } else {
                                                                            break L15;
                                                                          }
                                                                        } else {
                                                                          break L15;
                                                                        }
                                                                      }
                                                                      if (!this.g((byte) -125)) {
                                                                        break L0;
                                                                      } else {
                                                                        if (0 != (1 & ((bf) this).field_V)) {
                                                                          break L0;
                                                                        } else {
                                                                          this.e(param0 + 109);
                                                                          break L0;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (((bf) this).field_V % 120 == 0) {
                                                                        this.d(0);
                                                                        break L0;
                                                                      } else {
                                                                        break L0;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L12;
                                                                }
                                                              } else {
                                                                if ((double)(((bf) this).field_V % this.b((byte) -118, ((bf) this).field_Q)) > 10.0 * cd.a((byte) 106)) {
                                                                  break L12;
                                                                } else {
                                                                  this.e(63);
                                                                  break L12;
                                                                }
                                                              }
                                                            }
                                                            L16: {
                                                              if (((bf) this).field_V % 300 != 0) {
                                                                break L16;
                                                              } else {
                                                                this.d(0);
                                                                break L16;
                                                              }
                                                            }
                                                            L17: {
                                                              if (0 == ((bf) this).field_V % this.b((byte) -127, ((bf) this).field_Q)) {
                                                                this.e(param0 + 109);
                                                                break L17;
                                                              } else {
                                                                break L17;
                                                              }
                                                            }
                                                            this.k(0);
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L11;
                                                  }
                                                } else {
                                                  break L11;
                                                }
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          if (((bf) this).field_V % this.b((byte) -121, ((bf) this).field_Q) != 0) {
                                            break L0;
                                          } else {
                                            if (635.0 > ((bf) this).field_o) {
                                              this.e(63);
                                              break L0;
                                            } else {
                                              break L0;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L18: {
                                        var2 = (int)(-sd.field_a.field_N + ((bf) this).field_o);
                                        var3 = (int)(((bf) this).field_N - sd.field_a.field_D);
                                        if (0 <= ((bf) this).field_u) {
                                          break L18;
                                        } else {
                                          if (var2 * var2 + var3 * var3 > 5625) {
                                            ((bf) this).field_u = this.b((byte) -119, ((bf) this).field_Q);
                                            if (((bf) this).field_J != 2) {
                                              break L18;
                                            } else {
                                              ((bf) this).field_u = ((bf) this).field_u * 2;
                                              break L18;
                                            }
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      ((bf) this).field_u = ((bf) this).field_u - 1;
                                      if (((bf) this).field_u != 0) {
                                        break L0;
                                      } else {
                                        this.d(param0 ^ -46);
                                        ((bf) this).field_u = -1;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ((bf) this).field_g = (int)((bf) this).field_o;
                          ((bf) this).field_l = -oi.field_b[((bf) this).field_Q];
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L19: {
                      if (((bf) this).field_c >= 0) {
                        break L19;
                      } else {
                        if (0 < ((bf) this).field_U) {
                          break L19;
                        } else {
                          if (Math.random() < (double)(sd.field_a.field_q + 1) / 100.0) {
                            ((bf) this).field_c = this.b((byte) -127, ((bf) this).field_Q);
                            ((bf) this).field_U = sd.field_a.field_q + 1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                    L20: {
                      ((bf) this).field_c = ((bf) this).field_c - 1;
                      if (0 <= ((bf) this).field_c) {
                        break L20;
                      } else {
                        if (0 >= ((bf) this).field_U) {
                          break L20;
                        } else {
                          if (0 == ((bf) this).field_V % (10 + -sd.field_a.field_q)) {
                            ((bf) this).field_U = ((bf) this).field_U - 1;
                            this.e(63);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    ((bf) this).field_g = (int)((bf) this).field_o;
                    ((bf) this).field_l = -oi.field_b[((bf) this).field_Q];
                    if (((bf) this).field_Q != 47) {
                      break L0;
                    } else {
                      ((bf) this).field_l = ((bf) this).field_l * -1.0;
                      ((bf) this).field_j = ((bf) this).field_j - vh.field_a[((bf) this).field_Q] * ji.a(65535, (double)((bf) this).field_e / 50.0);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
            L21: {
              if (((bf) this).field_c > 0) {
                break L21;
              } else {
                if (((bf) this).field_U > 0) {
                  break L21;
                } else {
                  if (Math.random() >= (double)(sd.field_a.field_q + 1) / 100.0) {
                    break L21;
                  } else {
                    ((bf) this).field_c = this.b((byte) -119, ((bf) this).field_Q);
                    ((bf) this).field_U = 5 + hi.a(8, 4, ((bf) this).field_T);
                    break L21;
                  }
                }
              }
            }
            L22: {
              ((bf) this).field_c = ((bf) this).field_c - 1;
              if (0 <= ((bf) this).field_c) {
                break L22;
              } else {
                if (0 >= ((bf) this).field_U) {
                  break L22;
                } else {
                  if ((1 & ((bf) this).field_V) != 0) {
                    break L22;
                  } else {
                    ((bf) this).field_U = ((bf) this).field_U - 1;
                    this.e(param0 ^ -19);
                    break L22;
                  }
                }
              }
            }
            L23: {
              if (((bf) this).field_V % this.a((byte) 79, ((bf) this).field_Q) == 0) {
                this.k(0);
                break L23;
              } else {
                break L23;
              }
            }
            ((bf) this).field_l = -oi.field_b[((bf) this).field_Q];
            break L0;
          }
          L24: {
            if (param0 == -46) {
              break L24;
            } else {
              ((bf) this).field_J = 51;
              break L24;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void j(int param0) {
        int var2 = 0;
        int var3_int = 0;
        double var3 = 0.0;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        int var6_int = 0;
        Random var6 = null;
        double var7_double = 0.0;
        int var7 = 0;
        int var8_int = 0;
        he[] var8 = null;
        double var9_double = 0.0;
        int var9_int = 0;
        he var9 = null;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        he var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        he stackIn_28_1 = null;
        int stackIn_80_0 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        he stackOut_27_1 = null;
        Object stackOut_26_0 = null;
        he stackOut_26_1 = null;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        L0: {
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (sd.field_e == 0) {
            break L0;
          } else {
            if (((bf) this).field_s) {
              break L0;
            } else {
              if (ta.field_j[((bf) this).field_Q] < 0) {
                break L0;
              } else {
                var2 = 0;
                L1: while (true) {
                  if (((bf) this).field_i.length <= var2) {
                    break L0;
                  } else {
                    ((bf) this).field_i[var2].a(param0 ^ 30217);
                    var2++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        if (param0 == 30325) {
          L2: {
            var14 = ((bf) this).b((byte) 55);
            if (((bf) this).field_Q != 42) {
              L3: {
                if (((bf) this).field_s) {
                  break L3;
                } else {
                  L4: {
                    if (((bf) this).field_Q == 62) {
                      break L4;
                    } else {
                      if (((bf) this).field_Q != 63) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var3_int = (int)sd.field_a.field_N - -am.field_p;
                    var4 = (int)sd.field_a.field_D - -ri.field_q;
                    var5 = (int)(-((bf) this).field_o - (double)((bf) this).field_I + (double)var3_int);
                    var6_int = (int)((double)var4 - ((double)((bf) this).field_t + ((bf) this).field_N));
                    var7_double = Math.atan2((double)var5, (double)var6_int) + 3.141592653589793;
                    var9_double = var7_double - 1.5707963267948966;
                    var11 = (int)(32.0 * (0.5 + var7_double / 6.283185307179586));
                    if (0 == ((bf) this).field_J) {
                      if (3.141592653589793 <= var9_double) {
                        break L5;
                      } else {
                        if (0.0 < var9_double) {
                          var11 = 16;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      if (1 == ((bf) this).field_J) {
                        L6: {
                          if (3.141592653589793 < var9_double) {
                            break L6;
                          } else {
                            if (0.0 > var9_double) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var11 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L7: {
                    var11 = (12 + var11) % 32;
                    stackOut_25_0 = this;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (((bf) this).field_Q == 62) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = lc.field_i[var11];
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      break L7;
                    } else {
                      stackOut_26_0 = this;
                      stackOut_26_1 = jk.field_I[var11];
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      break L7;
                    }
                  }
                  ((bf) this).field_D = stackIn_28_1;
                  ((bf) this).field_p = -((bf) this).field_t + (int)((bf) this).field_N;
                  ((bf) this).field_d = 20 + ((int)((bf) this).field_o + -((bf) this).field_I);
                  ((bf) this).field_D.a(((bf) this).field_d, ((bf) this).field_p);
                  break L3;
                }
              }
              this.a((byte) 58, var14);
              break L2;
            } else {
              break L2;
            }
          }
          L8: {
            L9: {
              if (((bf) this).field_Q == 45) {
                break L9;
              } else {
                if (((bf) this).field_Q != 44) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            if (((bf) this).field_s) {
              break L8;
            } else {
              var3 = 1.1764705882352942;
              var5_double = var3 * 255.0 / this.i(param0 + -30232);
              if (0.0 < var5_double) {
                L10: {
                  if (var5_double > 1.0) {
                    var5_double = 1.0;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                var7 = (int)(var5_double * 128.0);
                var8_int = (int)(64.0 * var5_double);
                var9_int = (int)(255.0 * var5_double);
                var18 = new int[128];
                var17 = var18;
                var16 = var17;
                var15 = var16;
                var10_ref_int__ = var15;
                var11 = 0;
                L11: while (true) {
                  if (var11 >= 128) {
                    L12: {
                      if (45 == ((bf) this).field_Q) {
                        wj.a((int)((bf) this).field_o - -((bf) this).field_I << 4, (int)((bf) this).field_N - -41 << 4, 1920, 126, var18);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    if (((bf) this).field_Q != 44) {
                      break L8;
                    } else {
                      wj.a(41 + (int)((bf) this).field_o << 4, ((bf) this).field_t + (int)((bf) this).field_N << 4, 1920, 126, var18);
                      break L8;
                    }
                  } else {
                    var12 = (int)(Math.pow((double)var11, 1.5) / 8.0);
                    var10_ref_int__[var11] = li.a(li.a(var8_int * var12 >> 8 << 8, var7 * var12 >> 8 << 16), var9_int * var12 >> 8);
                    var11++;
                    continue L11;
                  }
                }
              } else {
                break L8;
              }
            }
          }
          L13: {
            if (this.b((byte) -123, ((bf) this).field_Q) <= 0) {
              break L13;
            } else {
              L14: {
                var3_int = this.b((byte) -121, ((bf) this).field_Q) + -(((bf) this).field_V % this.b((byte) -123, ((bf) this).field_Q));
                var4 = -(255 * var3_int / this.b((byte) -122, ((bf) this).field_Q)) + 255;
                var6_int = ((bf) this).field_Q;
                if (var6_int == 5) {
                  break L14;
                } else {
                  if (11 != var6_int) {
                    if (17 != var6_int) {
                      if (var6_int == 18) {
                        break L14;
                      } else {
                        if (var6_int != 4) {
                          if (42 != var6_int) {
                            break L13;
                          } else {
                            L15: {
                              var5 = ((bf) this).e((byte) 116);
                              if (var5 > 0) {
                                L16: {
                                  var6 = new Random((long)(((bf) this).field_V / this.b((byte) -120, ((bf) this).field_Q)));
                                  var7 = hi.a(3, 4, var6);
                                  if (var7 != 0) {
                                    if (var7 != 1) {
                                      var8 = cc.field_y;
                                      break L16;
                                    } else {
                                      var8 = oi.field_a;
                                      break L16;
                                    }
                                  } else {
                                    var8 = og.field_e;
                                    break L16;
                                  }
                                }
                                var9 = var8[((bf) this).field_V / 5 % var8.length];
                                var10 = ((bf) this).field_I + ((int)((bf) this).field_o - 5);
                                var11 = ((bf) this).field_t + (int)((bf) this).field_N;
                                wj.e(var10, var11, 10, -var11 + 430, 61568, 0);
                                var9.a(var10, var11 + var5);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            this.a((byte) 34, var14);
                            break L13;
                          }
                        } else {
                          if (0 < ((bf) this).field_c) {
                            var3_int = ((bf) this).field_c;
                            var4 = 255 - var3_int * 255 / this.b((byte) -128, ((bf) this).field_Q);
                            wj.c((int)((bf) this).field_o - -((bf) this).field_I, ((bf) this).field_t + (int)((bf) this).field_N, var3_int, 16777215, var4);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    } else {
                      var6_int = 0;
                      L17: while (true) {
                        if (var6_int >= ((bf) this).field_L.length) {
                          break L13;
                        } else {
                          ((bf) this).field_L[var6_int].c(-1);
                          var6_int++;
                          continue L17;
                        }
                      }
                    }
                  } else {
                    break L14;
                  }
                }
              }
              var6_int = 0;
              L18: while (true) {
                if (var6_int >= ((bf) this).field_L.length) {
                  break L13;
                } else {
                  ((bf) this).field_L[var6_int].c(-1);
                  var6_int++;
                  continue L18;
                }
              }
            }
          }
          L19: {
            if (!((bf) this).h(-76)) {
              break L19;
            } else {
              if (((bf) this).field_s) {
                break L19;
              } else {
                L20: {
                  var3 = (double)((bf) this).field_H / (double)ql.field_b[((bf) this).field_Q];
                  if (((bf) this).field_Q == 18) {
                    stackOut_79_0 = 30;
                    stackIn_80_0 = stackOut_79_0;
                    break L20;
                  } else {
                    stackOut_78_0 = 10;
                    stackIn_80_0 = stackOut_78_0;
                    break L20;
                  }
                }
                var5 = stackIn_80_0;
                if (2 == sd.field_e) {
                  wj.a(160, var5, 320, 10, 16763951, 127);
                  wj.d(161, 1 + var5, 318, 8, 16711680, 127);
                  wj.d(161, var5 + 1, (int)(var3 * 318.0), 8, 65280, 127);
                  break L19;
                } else {
                  wj.d(160, var5, 320, 10, 16763951);
                  wj.f(161, 1 + var5, 318, 8, 16711680);
                  wj.f(161, 1 + var5, (int)(318.0 * var3), 8, 65280);
                  break L19;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        if (param0 != 7769) {
            return;
        }
        if (!(((bf) this).field_q == null)) {
            gi.a(((bf) this).field_q, 3408);
            ((bf) this).field_q.i(-1);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    L2: {
                      var2 = param1.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (var3 >= 0) {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var5 = new java.net.URL(param1.getCodeBase(), var4);
                    int discarded$2 = 4767999;
                    param1.getAppletContext().showDocument(kk.a(var5, param1), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("bf.K(").append(63).append(44);
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
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == 5) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((bf) this).field_Q;
          if (var3 == 1) {
            var2 = (int)(250.0 / cd.a((byte) 103));
            if (var2 > ((bf) this).field_V) {
              ((bf) this).field_g = ((bf) this).field_m + hi.a(-(((bf) this).field_m * 4) + 640, 4, ((bf) this).field_T);
              ((bf) this).field_M = hi.a(-((bf) this).field_O + 425, param0 + -1, ((bf) this).field_T) + 5;
              break L1;
            } else {
              ((bf) this).field_g = (int)sd.field_a.field_N;
              ((bf) this).field_M = (int)sd.field_a.field_D;
              ((bf) this).field_P = 25;
              break L1;
            }
          } else {
            L2: {
              if (var3 != 5) {
                if (var3 == 11) {
                  break L2;
                } else {
                  if (var3 == 17) {
                    break L2;
                  } else {
                    if (var3 != 18) {
                      L3: {
                        if (var3 == 15) {
                          break L3;
                        } else {
                          if (var3 == 16) {
                            break L3;
                          } else {
                            if (var3 == 7) {
                              break L3;
                            } else {
                              if (var3 == 42) {
                                ((bf) this).field_g = hi.a(640 - ((bf) this).field_m, 4, ((bf) this).field_T);
                                ((bf) this).field_M = 5 - -hi.a(-((bf) this).field_O + 210, 4, ((bf) this).field_T);
                                break L1;
                              } else {
                                L4: {
                                  if (8 != var3) {
                                    if (var3 != 9) {
                                      if (var3 == 10) {
                                        break L4;
                                      } else {
                                        if (var3 != 2) {
                                          L5: {
                                            if (3 == var3) {
                                              break L5;
                                            } else {
                                              if (var3 != 4) {
                                                if (var3 != 0) {
                                                  L6: {
                                                    if (35 == var3) {
                                                      break L6;
                                                    } else {
                                                      if (var3 == 13) {
                                                        break L6;
                                                      } else {
                                                        if (var3 == 14) {
                                                          break L6;
                                                        } else {
                                                          if (var3 == 46) {
                                                            break L6;
                                                          } else {
                                                            if (var3 != 37) {
                                                              if (var3 == 6) {
                                                                break L1;
                                                              } else {
                                                                if (var3 != 12) {
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              ((bf) this).field_M = (int)sd.field_a.field_D;
                                                              ((bf) this).field_g = (int)sd.field_a.field_N;
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  ((bf) this).field_M = (int)((bf) this).field_N;
                                                  ((bf) this).field_g = -((bf) this).field_m;
                                                  ((bf) this).field_j = 0.0;
                                                  break L1;
                                                } else {
                                                  ((bf) this).field_M = (int)((bf) this).field_N;
                                                  ((bf) this).field_g = -((bf) this).field_m;
                                                  ((bf) this).field_j = 0.0;
                                                  break L1;
                                                }
                                              } else {
                                                break L5;
                                              }
                                            }
                                          }
                                          ((bf) this).field_M = (int)sd.field_a.field_D;
                                          break L1;
                                        } else {
                                          if (~hc.field_G >= ~hi.a(3, 4, ((bf) this).field_T)) {
                                            ((bf) this).field_M = hi.a(-((bf) this).field_O + 425, 4, ((bf) this).field_T) + 5;
                                            break L1;
                                          } else {
                                            ((bf) this).field_M = (int)sd.field_a.field_D + ri.field_q;
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                                ((bf) this).field_g = 0;
                                ((bf) this).field_M = hi.a(430 - ((bf) this).field_O, 4, ((bf) this).field_T);
                                if (hc.field_G != 2) {
                                  break L1;
                                } else {
                                  ((bf) this).field_M = (int)sd.field_a.field_D;
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (((bf) this).field_V < 0) {
                        ((bf) this).field_g = (int)((bf) this).field_o - (50 + -hi.a(100, 4, ((bf) this).field_T));
                        ((bf) this).field_M = 200;
                        break L1;
                      } else {
                        ((bf) this).field_g = hi.a(-((bf) this).field_m + 640, 4, ((bf) this).field_T);
                        ((bf) this).field_M = 5 - -hi.a(425 - ((bf) this).field_O, param0 + -1, ((bf) this).field_T);
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            ((bf) this).field_g = hi.a(-((bf) this).field_m + 640, 4, ((bf) this).field_T);
            ((bf) this).field_M = hi.a(-((bf) this).field_O + 425, 4, ((bf) this).field_T) + 5;
            if (!((bf) this).field_C) {
              break L1;
            } else {
              if (((bf) this).field_Q == 18) {
                ((bf) this).field_g = (-((bf) this).field_m + 640) / 2;
                break L1;
              } else {
                ((bf) this).field_g = (640 + ((bf) this).field_m) / 2;
                break L1;
              }
            }
          }
        }
    }

    private final void k(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var24 = 0;
        L0: {
          var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = (double)(int)(((bf) this).field_o + (double)((bf) this).field_I);
          var4 = (double)(int)(((bf) this).field_N + (double)((bf) this).field_t);
          var6 = -10.0;
          var8 = (double)((int)((bf) this).field_j / 4);
          var14 = 22.0;
          var16 = -1;
          if (param0 == 0) {
            break L0;
          } else {
            ((bf) this).field_I = -61;
            break L0;
          }
        }
        L1: {
          L2: {
            var23 = ((bf) this).field_Q;
            if (var23 != 0) {
              if (var23 == 35) {
                break L2;
              } else {
                if (var23 != 5) {
                  if (11 != var23) {
                    if (var23 != 17) {
                      if (var23 == 18) {
                        var16 = 18;
                        var6 = -var2 + ((double)am.field_p + sd.field_a.field_N);
                        var4 = (double)(int)(((bf) this).field_N + 127.0);
                        var8 = -var4 + (sd.field_a.field_D + (double)ri.field_q);
                        var21 = Math.sqrt(var6 * var6 + var8 * var8);
                        var6 = var6 / var21;
                        var8 = var8 / var21;
                        var8 = var8 * 22.0;
                        var6 = var6 * 22.0;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      var16 = 18;
                      var10 = (double)((bf) this).field_V / 100.0;
                      var12 = var10 + 3.141592653589793;
                      var10 = var10 + (double)hi.a(10, 4, ((bf) this).field_T) / 30.0;
                      var12 = var12 + (double)hi.a(10, param0 ^ 4, ((bf) this).field_T) / 30.0;
                      sd.field_a.a(24, new gf(var16, -60.0 + var2, var4, ji.a(param0 ^ 65535, var10) * var14, var14 * pj.a(var10, 32768), -10.0, ((bf) this).field_N));
                      sd.field_a.a(24, new gf(var16, 60.0 + var2, var4, var14 * ji.a(65535, var12), var14 * pj.a(var12, param0 ^ 32768), -10.0, ((bf) this).field_N));
                      sd.field_a.a(24, new gf(var16, var2 - 60.0, var4, ji.a(65535, var10) * -var14, pj.a(var10, 32768) * var14, -10.0, ((bf) this).field_N));
                      sd.field_a.a(24, new gf(var16, 60.0 + var2, var4, ji.a(65535, var12) * -var14, pj.a(var12, 32768) * var14, -10.0, ((bf) this).field_N));
                      return;
                    }
                  } else {
                    var10 = (double)((bf) this).field_V / 10.0;
                    var16 = 18;
                    var10 = var10 + 1.5707963267948966;
                    sd.field_a.a(24, new gf(var16, var2 - 60.0, var4, var14 * ji.a(65535, var10), pj.a(var10, 32768) * var14, -10.0, ((bf) this).field_N));
                    sd.field_a.a(24, new gf(var16, 60.0 + var2, var4, ji.a(65535, -var10) * var14, pj.a(-var10, 32768) * var14, -10.0, ((bf) this).field_N));
                    return;
                  }
                } else {
                  var16 = 6;
                  var6 = -1.0;
                  var8 = 0.0;
                  break L1;
                }
              }
            } else {
              break L2;
            }
          }
          var16 = 12;
          var17 = (int)sd.field_a.field_N + am.field_p;
          var18 = ri.field_q + (int)sd.field_a.field_D;
          var8 = (double)(int)((double)var18 - ((double)((bf) this).field_t + ((bf) this).field_N));
          var6 = (double)(int)((double)var17 - (((bf) this).field_o + (double)((bf) this).field_I));
          var19 = Math.sqrt(var6 * var6 + var8 * var8);
          var8 = var8 / var19;
          var6 = var6 / var19;
          var6 = var6 * 5.0;
          var8 = var8 * 5.0;
          var2 = var2 + 5.0;
          var4 = var4 - 80.0;
          var8 = var8 - 2.0;
          break L1;
        }
        L3: {
          if (var16 == -1) {
            break L3;
          } else {
            sd.field_a.a(24, new gf(var16, var2, var4, var6, var8, -10.0, ((bf) this).field_N));
            break L3;
          }
        }
    }

    private final int a(byte param0, int param1) {
        return (int)(100.0 / cd.a((byte) 72));
    }

    private final void e(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var24 = 0;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 <= ((bf) this).field_V) {
          L0: {
            var4 = (double)((bf) this).field_I + ((bf) this).field_o;
            if (param0 == 63) {
              break L0;
            } else {
              this.k(45);
              break L0;
            }
          }
          L1: {
            var6 = (double)((bf) this).field_t + ((bf) this).field_N;
            var8 = -10.0;
            var10 = ((bf) this).field_j / 4.0;
            var12 = bb.field_h[((bf) this).field_Q];
            var13 = (int)sd.field_a.field_N + am.field_p;
            var14 = (int)sd.field_a.field_D - -ri.field_q;
            var15 = Math.atan2((double)var14 - var6, (double)var13 - var4);
            var23 = ((bf) this).field_Q;
            if (var23 == 47) {
              var8 = var8 * -1.0;
              break L1;
            } else {
              if (var23 == 0) {
                var8 = (Math.random() + 2.0) * -2.0;
                var10 = (Math.random() + 1.0) * 2.0;
                var6 = var6 - 23.0;
                var4 = var4 - 39.0;
                break L1;
              } else {
                if (var23 == 35) {
                  var8 = 2.0 * (2.0 + Math.random());
                  var4 = var4 + 39.0;
                  var10 = (1.0 + Math.random()) * 2.0;
                  var6 = var6 - 23.0;
                  break L1;
                } else {
                  if (var23 == 12) {
                    var8 = -1.0 + (-0.5 + Math.random());
                    var10 = Math.random() - 0.5 + -5.0;
                    break L1;
                  } else {
                    L2: {
                      if (var23 == 5) {
                        break L2;
                      } else {
                        if (var23 == 11) {
                          break L2;
                        } else {
                          if (var23 == 17) {
                            break L2;
                          } else {
                            if (var23 != 18) {
                              L3: {
                                L4: {
                                  if (var23 == 43) {
                                    break L4;
                                  } else {
                                    if (var23 == 62) {
                                      break L4;
                                    } else {
                                      if (var23 == 13) {
                                        break L3;
                                      } else {
                                        if (var23 != 14) {
                                          if (16 != var23) {
                                            if (var23 != 42) {
                                              if (var23 == 63) {
                                                L5: {
                                                  if (0 != ((bf) this).field_J) {
                                                    break L5;
                                                  } else {
                                                    if (var15 >= 3.141592653589793) {
                                                      break L5;
                                                    } else {
                                                      if (var15 > 0.0) {
                                                        return;
                                                      } else {
                                                        break L5;
                                                      }
                                                    }
                                                  }
                                                }
                                                L6: {
                                                  if (((bf) this).field_J != 1) {
                                                    break L6;
                                                  } else {
                                                    L7: {
                                                      if (var15 > 3.141592653589793) {
                                                        break L7;
                                                      } else {
                                                        if (0.0 <= var15) {
                                                          break L6;
                                                        } else {
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    return;
                                                  }
                                                }
                                                var10 = (double)(int)((double)var14 - ((double)((bf) this).field_t + ((bf) this).field_N));
                                                var8 = (double)(int)(-((bf) this).field_o - (double)((bf) this).field_I + (double)var13);
                                                var2 = Math.sqrt(var8 * var8 + var10 * var10);
                                                var10 = var10 / var2;
                                                var8 = var8 / var2;
                                                var10 = var10 * 5.0;
                                                var8 = var8 * 5.0;
                                                var4 = var4 + 7.0 * var8;
                                                var17 = var10 * 3.0;
                                                var6 = var6 + 7.0 * var10;
                                                var19 = -3.0 * var8;
                                                var4 = var4 - var17 / 2.0;
                                                var6 = var6 - var19 / 2.0;
                                                sd.field_a.a(24, new gf(var12, var4, var6, var8, var10, -10.0, var6, 2));
                                                sd.field_a.a(param0 ^ 39, new gf(var12, var4 + var17, var6 + var19, var8, var10, -10.0, var6, 2));
                                                sd.field_a.a(param0 + -39, new gf(var12, -var17 + var4, var6 - var19, var8, var10, -10.0, var6, 2));
                                                return;
                                              } else {
                                                L8: {
                                                  if (var23 == 15) {
                                                    break L8;
                                                  } else {
                                                    if (var23 != 38) {
                                                      if (var23 == 40) {
                                                        var10 = 0.0;
                                                        var8 = 0.0;
                                                        ((bf) this).field_b = new gf(var12, var4, var6, 0.0, 0.0, (double)am.field_p + sd.field_a.field_N, sd.field_a.field_D + (double)ri.field_q);
                                                        sd.field_a.a(24, ((bf) this).field_b);
                                                        break L1;
                                                      } else {
                                                        L9: {
                                                          if (45 == var23) {
                                                            break L9;
                                                          } else {
                                                            if (var23 == 44) {
                                                              break L9;
                                                            } else {
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                        L10: {
                                                          if (sd.field_a.field_fb < 0) {
                                                            L11: {
                                                              if (45 != ((bf) this).field_Q) {
                                                                if (44 == ((bf) this).field_Q) {
                                                                  var4 = 41.0 + ((bf) this).field_o;
                                                                  break L11;
                                                                } else {
                                                                  break L11;
                                                                }
                                                              } else {
                                                                var6 = 41.0 + ((bf) this).field_N;
                                                                break L11;
                                                              }
                                                            }
                                                            ((bf) this).field_b = new gf(var12, var4, var6, 0.0, 0.0, sd.field_a.field_N + (double)am.field_p, sd.field_a.field_D + (double)ri.field_q);
                                                            ((bf) this).field_b.field_l = ((bf) this).field_V;
                                                            sd.field_a.a(-2 + sd.field_a.field_gb, param0 + -63);
                                                            sd.field_a.a(24, ((bf) this).field_b);
                                                            break L10;
                                                          } else {
                                                            break L10;
                                                          }
                                                        }
                                                        return;
                                                      }
                                                    } else {
                                                      break L8;
                                                    }
                                                  }
                                                }
                                                var8 = sd.field_a.field_N - ((bf) this).field_o;
                                                var10 = sd.field_a.field_D - ((bf) this).field_N;
                                                var21 = Math.atan2(var8, var10);
                                                var21 = var21 + (Math.random() - 0.5) / 32.0;
                                                var8 = ji.a(65535, var21) * 15.0;
                                                var10 = pj.a(var21, param0 ^ 32831) * 15.0;
                                                break L1;
                                              }
                                            } else {
                                              break L3;
                                            }
                                          } else {
                                            break L3;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                }
                                L12: {
                                  if (0 != ((bf) this).field_J) {
                                    break L12;
                                  } else {
                                    if (var15 >= 3.141592653589793) {
                                      break L12;
                                    } else {
                                      if (0.0 < var15) {
                                        return;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                if (((bf) this).field_J != 1) {
                                  break L3;
                                } else {
                                  L13: {
                                    if (var15 > 3.141592653589793) {
                                      break L13;
                                    } else {
                                      if (var15 < 0.0) {
                                        break L13;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  return;
                                }
                              }
                              var10 = (double)(int)((double)var14 - ((double)((bf) this).field_t + ((bf) this).field_N));
                              var8 = (double)(int)((double)var13 - ((double)((bf) this).field_I + ((bf) this).field_o));
                              var2 = Math.sqrt(var8 * var8 + var10 * var10);
                              var8 = var8 / var2;
                              var10 = var10 / var2;
                              var8 = var8 * 5.0;
                              var10 = var10 * 5.0;
                              if (((bf) this).field_Q == 13) {
                                var10 = var10 - 2.0;
                                break L1;
                              } else {
                                if (((bf) this).field_Q != 62) {
                                  break L1;
                                } else {
                                  var4 = var4 + 12.0 * var8;
                                  var4 = var4 + 15.0;
                                  var6 = var6 + 12.0 * var10;
                                  break L1;
                                }
                              }
                            } else {
                              var8 = (double)(-(15 - -hi.a(5, 4, ((bf) this).field_T)));
                              var10 = (double)(hi.a(40, 4, ((bf) this).field_T) + -20);
                              var4 = var4 + (double)(hi.a(100, 4, ((bf) this).field_T) + -50);
                              ((bf) this).field_G = (int)(aa.field_c[((bf) this).field_Q] - 128.0);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (((bf) this).field_Q == 5) {
                        ((bf) this).field_j = 0.0;
                        ((bf) this).field_M = (int)((bf) this).field_N;
                        ((bf) this).field_g = (int)((bf) this).field_o;
                        ((bf) this).field_l = -1.0;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var8 = 0.0;
                    var10 = 0.0;
                    ((bf) this).field_G = (int)(aa.field_c[((bf) this).field_Q] - 128.0);
                    break L1;
                  }
                }
              }
            }
          }
          sd.field_a.a(24, new gf(var12, var4, var6, var8, var10, -10.0, var6));
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        bf var4 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!wh.field_v[((bf) this).field_Q]) {
          L0: {
            if (param1 == 10) {
              break L0;
            } else {
              int discarded$1 = this.f((byte) -7);
              break L0;
            }
          }
          L1: {
            if (sd.field_a.field_fb <= 0) {
              break L1;
            } else {
              if (((bf) this).h(-78)) {
                return false;
              } else {
                break L1;
              }
            }
          }
          L2: {
            ((bf) this).field_A = true;
            ((bf) this).field_H = ((bf) this).field_H - param0;
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (((bf) this).field_H >= 0) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L2;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L2;
            }
          }
          L3: {
            ((bf) this).field_s = stackIn_11_1 != 0;
            if (((bf) this).field_s) {
              L4: {
                if (ga.field_j[((bf) this).field_Q] != -1) {
                  var3 = e.a(param1 + 104, ((bf) this).field_I + (int)((bf) this).field_o);
                  if (-70 != ga.field_j[((bf) this).field_Q]) {
                    th.a(-27610, 48, var3, nl.field_r[ga.field_j[((bf) this).field_Q]]);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (-10 != ((bf) this).field_Q) {
                  if (((bf) this).field_Q != 10) {
                    break L5;
                  } else {
                    var3 = 0;
                    L6: while (true) {
                      if (var3 >= 2) {
                        break L5;
                      } else {
                        var4 = sd.field_a.a((int)(((bf) this).field_N + (double)(((bf) this).field_t / 2)), true, 9, (int)(((bf) this).field_o + (double)(((bf) this).field_I / 2)), 0, true);
                        var5 = (1.0 + Math.random()) / 2.0;
                        var7 = Math.random() * 6.283185307179586;
                        var4.field_l = ((bf) this).field_l + var5 * ji.a(param1 + 65525, var7);
                        var4.field_j = ((bf) this).field_j + pj.a(var7, 32768) * var5;
                        var3++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  L7: while (true) {
                    if (var3 >= 4) {
                      break L5;
                    } else {
                      var4 = sd.field_a.a((int)(((bf) this).field_N + (double)(((bf) this).field_t / 2)), true, 8, (int)(((bf) this).field_o + (double)(((bf) this).field_I / 2)), 0, true);
                      var5 = (1.0 + Math.random()) / 2.0;
                      var7 = Math.random() * 6.283185307179586;
                      var4.field_l = ((bf) this).field_l + var5 * ji.a(65535, var7);
                      var4.field_j = ((bf) this).field_j + var5 * pj.a(var7, 32768);
                      var3++;
                      continue L7;
                    }
                  }
                }
              }
              L8: {
                if (th.field_d[((bf) this).field_Q]) {
                  ((bf) this).field_f = ((bf) this).b((byte) 55).b();
                  break L8;
                } else {
                  break L8;
                }
              }
              ((bf) this).field_l = -1.0;
              break L3;
            } else {
              break L3;
            }
          }
          return ((bf) this).field_s;
        } else {
          return false;
        }
    }

    final static String a(long param0) {
        ae.field_ib.setTime(new Date(param0));
        int var3 = ae.field_ib.get(7);
        int var4 = ae.field_ib.get(5);
        int var5 = ae.field_ib.get(2);
        int var6 = ae.field_ib.get(1);
        int var7 = ae.field_ib.get(11);
        int var8 = ae.field_ib.get(12);
        int var9 = ae.field_ib.get(13);
        return nf.field_q[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + ka.field_j[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final he b(byte param0) {
        int var2 = 0;
        L0: {
          if (param0 == 55) {
            break L0;
          } else {
            ((bf) this).field_V = -10;
            break L0;
          }
        }
        L1: {
          var2 = ((bf) this).field_Q;
          if (48 == var2) {
            break L1;
          } else {
            if (var2 == 49) {
              break L1;
            } else {
              if (var2 != 50) {
                if (51 == var2) {
                  break L1;
                } else {
                  if (52 == var2) {
                    break L1;
                  } else {
                    if (53 == var2) {
                      break L1;
                    } else {
                      L2: {
                        if (var2 == 45) {
                          break L2;
                        } else {
                          if (var2 == 44) {
                            break L2;
                          } else {
                            L3: {
                              if (!((bf) this).field_s) {
                                break L3;
                              } else {
                                L4: {
                                  if (((bf) this).field_z > 25) {
                                    break L4;
                                  } else {
                                    if (sd.field_e != 2) {
                                      break L4;
                                    } else {
                                      if (1 <= g.field_s[((bf) this).field_Q]) {
                                        break L3;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                }
                                return ((bf) this).field_n[((bf) this).field_E % ((bf) this).field_n.length];
                              }
                            }
                            L5: {
                              if (((bf) this).field_Q != 12) {
                                break L5;
                              } else {
                                if (2 == ((bf) this).field_J) {
                                  return ib.field_j[((bf) this).field_E % ib.field_j.length];
                                } else {
                                  break L5;
                                }
                              }
                            }
                            return ((bf) this).field_F[((bf) this).field_E % ((bf) this).field_F.length];
                          }
                        }
                      }
                      if (!((bf) this).field_s) {
                        if (!this.g((byte) -78)) {
                          return sh.field_c[((bf) this).field_Q][0];
                        } else {
                          return sh.field_c[((bf) this).field_Q][1];
                        }
                      } else {
                        return ((bf) this).field_n[0];
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
        if (!((bf) this).field_s) {
          return ((bf) this).field_F[((bf) this).field_J % ((bf) this).field_F.length];
        } else {
          return ((bf) this).field_n[((bf) this).field_J % ((bf) this).field_n.length];
        }
    }

    private final int b(byte param0, int param1) {
        if (param0 > -117) {
            return -23;
        }
        return (int)((double)k.field_M[param1] / cd.a((byte) 116));
    }

    private final double i(int param0) {
        int var2 = -32 / ((28 - param0) / 32);
        if (sd.field_a != null) {
            return dl.a(true, ((bf) this).field_o - sd.field_a.field_N, -sd.field_a.field_D + ((bf) this).field_N);
        }
        return -1.0;
    }

    final static void b(int param0) {
        if (param0 != 128) {
            field_h = null;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0.0 > ((bf) this).field_o) {
          return;
        } else {
          ((bf) this).field_a = ((bf) this).field_a - 1;
          if (((bf) this).field_a > 0) {
            L0: {
              if (param0 < -20) {
                break L0;
              } else {
                ((bf) this).field_W = -93;
                break L0;
              }
            }
            L1: {
              var2 = -1;
              var3 = ((bf) this).field_Q;
              if (var3 != 11) {
                if (var3 == 18) {
                  var2 = 64;
                  bf discarded$2 = sd.field_a.a((int)((double)((bf) this).field_t + ((bf) this).field_N), true, 4, (int)((double)((bf) this).field_I + ((bf) this).field_o), 0, true);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                L2: {
                  L3: {
                    if (((bf) this).field_J == 2) {
                      break L3;
                    } else {
                      if (((bf) this).field_J != 3) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  bf discarded$3 = sd.field_a.a((int)(((bf) this).field_N + (double)((bf) this).field_t), true, 9, (int)((double)((bf) this).field_I + ((bf) this).field_o), 0, true);
                  break L2;
                }
                var2 = 36;
                break L1;
              }
            }
            L4: {
              if (var2 == -1) {
                break L4;
              } else {
                th.a(-27610, 32, e.a(112, (int)((bf) this).field_o), nl.field_r[var2]);
                break L4;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = 15 % ((param0 - -90) / 33);
          if (!((bf) this).field_C) {
            var7 = oi.field_b[((bf) this).field_Q];
            var5 = ff.field_N[((bf) this).field_Q];
            var3 = vh.field_a[((bf) this).field_Q];
            break L0;
          } else {
            var7 = 4.0 * oi.field_b[((bf) this).field_Q];
            var5 = 4.0 * ff.field_N[((bf) this).field_Q];
            var3 = 3.0 * vh.field_a[((bf) this).field_Q];
            break L0;
          }
        }
        var11 = ((bf) this).field_Q;
        if (var11 == 1) {
          ((bf) this).field_l = 0.0;
          ((bf) this).field_j = 0.0;
          ((bf) this).field_o = -(0.5 * (double)((bf) this).field_e * oi.field_b[((bf) this).field_Q]) + (double)(640 + ((bf) this).field_m);
          ((bf) this).field_N = 100.0 + 75.0 * ji.a(65535, (double)((bf) this).field_e / 18.0);
          return;
        } else {
          if (var11 == 38) {
            ((bf) this).field_j = 0.0;
            ((bf) this).field_l = 0.0;
            ((bf) this).field_o = (double)(-(((bf) this).field_e / 2) + ((bf) this).field_m + 800) - 150.0 * ji.a(65535, (double)((bf) this).field_e / 60.0);
            ((bf) this).field_N = 100.0 + ji.a(65535, (double)((bf) this).field_e / 18.0) * 75.0;
            return;
          } else {
            L1: {
              if (var11 != 42) {
                if (var11 != 39) {
                  if (40 == var11) {
                    L2: {
                      if (((bf) this).field_e == 1) {
                        ((bf) this).field_N = (double)(-((bf) this).field_O);
                        ((bf) this).field_o = (double)(-(this.f((byte) 118) * 100) + 570);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((bf) this).field_l = 0.0;
                    ((bf) this).field_j = var5;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((bf) this).field_j = 0.0;
                  ((bf) this).field_o = -(var7 * (double)((bf) this).field_e) + (double)(((bf) this).field_m - -640);
                  ((bf) this).field_l = 0.0;
                  ((bf) this).field_N = ji.a(65535, (double)((bf) this).field_e / 24.0) * 75.0 + 100.0;
                  return;
                }
              } else {
                L3: {
                  if (0 == ((bf) this).field_V % this.b((byte) -125, ((bf) this).field_Q)) {
                    ((bf) this).field_j = 0.0;
                    ((bf) this).field_G = 0;
                    ((bf) this).field_l = -1.0;
                    ((bf) this).field_g = (int)((bf) this).field_o;
                    ((bf) this).field_M = (int)((bf) this).field_N;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var9 = (double)(((bf) this).field_V % this.b((byte) -124, ((bf) this).field_Q)) / ((double)this.b((byte) -123, ((bf) this).field_Q) * 0.5);
                if (0.0 < -var9 + 1.0) {
                  ((bf) this).field_l = 0.0;
                  ((bf) this).field_o = ((bf) this).field_o - 1.0;
                  break L1;
                } else {
                  if ((double)((bf) this).field_P <= -((bf) this).field_o + (double)((bf) this).field_g) {
                    break L1;
                  } else {
                    if ((double)((bf) this).field_M - ((bf) this).field_N < (double)((bf) this).field_P) {
                      ((bf) this).c(5);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            ((bf) this).field_l = ((bf) this).field_l - ((bf) this).field_l / 10.0;
            ((bf) this).field_j = ((bf) this).field_j - ((bf) this).field_j / 10.0;
            if (((bf) this).field_s) {
              ((bf) this).field_j = ((bf) this).field_j + var3;
              return;
            } else {
              L4: {
                L5: {
                  if (Math.abs((double)(-((bf) this).field_g) + ((bf) this).field_o) >= (double)((bf) this).field_P) {
                    break L5;
                  } else {
                    if (Math.abs(((bf) this).field_N - (double)((bf) this).field_M) >= (double)((bf) this).field_P) {
                      break L5;
                    } else {
                      if (aa.field_c[((bf) this).field_Q] > (double)((bf) this).field_G) {
                        ((bf) this).field_G = ((bf) this).field_G + 1;
                        break L4;
                      } else {
                        ((bf) this).field_G = 0;
                        ((bf) this).field_l = -1.0;
                        ((bf) this).field_j = 0.0;
                        ((bf) this).c(5);
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  if ((double)((bf) this).field_g >= ((bf) this).field_o) {
                    L7: {
                      if (var7 > ((bf) this).field_l) {
                        ((bf) this).field_l = ((bf) this).field_l + var3;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (((bf) this).field_l <= var7) {
                      break L6;
                    } else {
                      ((bf) this).field_l = var7;
                      break L6;
                    }
                  } else {
                    L8: {
                      if (-var7 < ((bf) this).field_l) {
                        ((bf) this).field_l = ((bf) this).field_l - var3;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (((bf) this).field_l < -var7) {
                      ((bf) this).field_l = -var7;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if ((double)((bf) this).field_M >= ((bf) this).field_N) {
                  L9: {
                    if (var5 > ((bf) this).field_j) {
                      ((bf) this).field_j = ((bf) this).field_j + var3;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  if (var5 < ((bf) this).field_j) {
                    ((bf) this).field_j = var5;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  L10: {
                    if (((bf) this).field_j <= -var5) {
                      break L10;
                    } else {
                      ((bf) this).field_j = ((bf) this).field_j - var3;
                      break L10;
                    }
                  }
                  if (-var5 <= ((bf) this).field_j) {
                    break L4;
                  } else {
                    ((bf) this).field_j = -var5;
                    break L4;
                  }
                }
              }
              return;
            }
          }
        }
    }

    bf(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        double var8 = 0.0;
        int var10 = 0;
        he var12 = null;
        L0: {
          L1: {
            ((bf) this).field_s = false;
            ((bf) this).field_L = new ck[4];
            ((bf) this).field_a = 200;
            ((bf) this).field_A = false;
            ((bf) this).field_u = -1;
            ((bf) this).field_R = 0;
            ((bf) this).field_c = 0;
            ((bf) this).field_i = new hi[1];
            ((bf) this).field_D = null;
            ((bf) this).field_K = 0;
            ((bf) this).field_U = 0;
            ((bf) this).field_z = 0;
            ((bf) this).field_f = null;
            ((bf) this).field_E = 0;
            ((bf) this).field_B = param2;
            ((bf) this).field_T = new Random((long)((bf) this).field_B);
            ((bf) this).field_J = param1;
            ((bf) this).field_k = param3;
            ((bf) this).field_W = param4;
            ((bf) this).field_Q = param0;
            ((bf) this).field_Q = param0;
            ((bf) this).field_H = ql.field_b[((bf) this).field_Q];
            ((bf) this).field_w = o.field_k[((bf) this).field_Q];
            if (((bf) this).field_Q != 12) {
              break L1;
            } else {
              if (0.333 <= Math.random()) {
                break L1;
              } else {
                ((bf) this).field_V = 0;
                break L0;
              }
            }
          }
          if (k.field_M[((bf) this).field_Q] != 0) {
            ((bf) this).field_V = hi.a(k.field_M[((bf) this).field_Q], 4, ((bf) this).field_T);
            break L0;
          } else {
            ((bf) this).field_V = 0;
            break L0;
          }
        }
        L2: {
          var7 = ((bf) this).field_Q;
          if (64 == var7) {
            if (Math.random() > 0.5) {
              ((bf) this).field_F = sh.field_c[((bf) this).field_Q];
              ((bf) this).field_n = vj.field_g[((bf) this).field_Q];
              break L2;
            } else {
              ((bf) this).field_n = bh.field_e;
              ((bf) this).field_F = ad.field_v;
              break L2;
            }
          } else {
            if (var7 == 62) {
              if (((bf) this).field_J != 0) {
                ((bf) this).field_F = bh.field_b;
                ((bf) this).field_n = tl.field_I;
                break L2;
              } else {
                ((bf) this).field_F = sh.field_c[((bf) this).field_Q];
                ((bf) this).field_n = vj.field_g[((bf) this).field_Q];
                break L2;
              }
            } else {
              ((bf) this).field_F = sh.field_c[((bf) this).field_Q];
              ((bf) this).field_n = vj.field_g[((bf) this).field_Q];
              break L2;
            }
          }
        }
        L3: {
          L4: {
            var12 = ((bf) this).b((byte) 55);
            ((bf) this).field_t = var12.field_k / 2 - -var12.field_f;
            ((bf) this).field_I = var12.field_d / 2 - -var12.field_a;
            ((bf) this).field_O = var12.field_c;
            ((bf) this).field_m = var12.field_h;
            if (4 == ((bf) this).field_Q) {
              break L4;
            } else {
              if (((bf) this).field_Q == 3) {
                break L4;
              } else {
                ((bf) this).field_P = field_S[((bf) this).field_Q];
                break L3;
              }
            }
          }
          ((bf) this).field_P = (int)((double)field_S[((bf) this).field_Q] / cd.a((byte) 121));
          break L3;
        }
        L5: {
          if (!cj.field_c[((bf) this).field_Q]) {
            break L5;
          } else {
            ((bf) this).field_l = -oi.field_b[((bf) this).field_Q];
            break L5;
          }
        }
        L6: {
          if (ac.field_j[((bf) this).field_Q] == -1) {
            break L6;
          } else {
            if (nl.field_r[ac.field_j[((bf) this).field_Q]] == null) {
              break L6;
            } else {
              ((bf) this).field_q = ag.a(nl.field_r[ac.field_j[((bf) this).field_Q]], 256, 64);
              ((bf) this).field_q.f(-1);
              ((bf) this).field_q.c(0, nl.field_r[ac.field_j[((bf) this).field_Q]].field_i.length);
              break L6;
            }
          }
        }
        L7: {
          L8: {
            ((bf) this).field_i[0] = new hi(ta.field_j[((bf) this).field_Q]);
            ((bf) this).field_o = 640.0;
            ((bf) this).field_e = 0;
            ((bf) this).field_N = (double)param4;
            var10 = ((bf) this).field_Q;
            if (var10 == 0) {
              break L8;
            } else {
              if (var10 == 35) {
                break L8;
              } else {
                if (var10 == 47) {
                  ((bf) this).field_o = (double)(-((bf) this).field_m + 5);
                  break L7;
                } else {
                  if (var10 == 7) {
                    ((bf) this).field_r = vd.field_g;
                    break L7;
                  } else {
                    if (11 == var10) {
                      ((bf) this).field_r = mi.field_i;
                      ((bf) this).field_y = ib.field_r;
                      var10 = 0;
                      L9: while (true) {
                        if (~((bf) this).field_L.length >= ~var10) {
                          break L7;
                        } else {
                          ((bf) this).field_L[var10] = new ck();
                          var10++;
                          continue L9;
                        }
                      }
                    } else {
                      L10: {
                        if (8 == var10) {
                          break L10;
                        } else {
                          if (9 == var10) {
                            break L10;
                          } else {
                            if (var10 == 10) {
                              break L10;
                            } else {
                              if (var10 == 12) {
                                if (0 == hi.a(2, 4, ((bf) this).field_T)) {
                                  ((bf) this).field_J = 2;
                                  break L7;
                                } else {
                                  ((bf) this).field_J = 0;
                                  break L7;
                                }
                              } else {
                                L11: {
                                  if (var10 == 15) {
                                    break L11;
                                  } else {
                                    if (var10 == 16) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var10 == 5) {
                                          break L12;
                                        } else {
                                          if (17 == var10) {
                                            break L12;
                                          } else {
                                            if (var10 == 18) {
                                              break L12;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      var10 = 0;
                                      L13: while (true) {
                                        if (~var10 <= ~((bf) this).field_L.length) {
                                          break L7;
                                        } else {
                                          ((bf) this).field_L[var10] = new ck();
                                          var10++;
                                          continue L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (param5) {
                                  break L7;
                                } else {
                                  ((bf) this).field_o = (double)(50 + hi.a(-100 - (((bf) this).field_m - 640), 4, ((bf) this).field_T));
                                  ((bf) this).field_N = (double)(5 + -((bf) this).field_O);
                                  ((bf) this).field_j = 2.0 * -ff.field_N[((bf) this).field_Q];
                                  ((bf) this).field_l = 0.0;
                                  break L7;
                                }
                              }
                            }
                          }
                        }
                      }
                      ((bf) this).c(5);
                      ((bf) this).field_l = (-((bf) this).field_o + (double)((bf) this).field_g) / 640.0 * oi.field_b[((bf) this).field_Q];
                      ((bf) this).field_j = oi.field_b[((bf) this).field_Q] * (((double)((bf) this).field_M - ((bf) this).field_N) / 480.0);
                      var8 = Math.random();
                      ((bf) this).field_l = ((bf) this).field_l * (0.25 + 0.75 * var8);
                      ((bf) this).field_j = ((bf) this).field_j * (0.75 * var8 + 0.25);
                      break L7;
                    }
                  }
                }
              }
            }
          }
          ((bf) this).field_M = (int)((bf) this).field_N;
          break L7;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "The account name you use to access RuneScape and other Jagex.com games";
        field_S = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
        field_h = null;
    }
}
