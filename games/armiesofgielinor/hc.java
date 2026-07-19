/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hc {
    private tu field_l;
    private int field_h;
    static int[][] field_o;
    static String field_d;
    private int field_a;
    static int field_b;
    private String[] field_k;
    private int[] field_j;
    static int field_e;
    static String field_w;
    private int field_g;
    private r field_p;
    static boolean field_i;
    private ia field_n;
    private int field_r;
    private wk[] field_c;
    private wk[] field_v;
    static int field_q;
    private int field_t;
    private r field_x;
    private int field_s;
    private ia field_u;
    private String[] field_m;
    private sh field_f;

    private final void e(byte param0) {
        L0: {
          if (!this.field_p.g(260)) {
            if (this.field_x.g(260)) {
              this.field_p.f((byte) -53);
              this.field_x.f((byte) 1);
              break L0;
            } else {
              if (param0 != -25) {
                this.field_s = 40;
                return;
              } else {
                return;
              }
            }
          } else {
            this.field_x.f((byte) 126);
            this.field_p.f((byte) 127);
            if (!ArmiesOfGielinor.field_M) {
              break L0;
            } else {
              L1: {
                if (this.field_x.g(260)) {
                  this.field_p.f((byte) -53);
                  this.field_x.f((byte) 1);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0 != -25) {
                this.field_s = 40;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (param0 != -25) {
          this.field_s = 40;
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_a = param0;
        this.field_p.b(0, this.field_a);
        this.field_f.a(0, this.field_a);
        this.field_f.a(true);
        this.field_m = new String[pt.field_W.length - -1];
        var3 = 0;
        if (param1 != 39) {
          discarded$1 = this.a(-92, 45);
          L0: while (true) {
            if (pt.field_W.length > var3) {
              this.field_m[var3] = pt.field_W[var3];
              var3++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_m[pt.field_W.length] = "special";
              this.field_x.a(this.field_m, -29799);
              this.a(false, 0);
              return;
            }
          }
        } else {
          L1: while (true) {
            if (pt.field_W.length > var3) {
              this.field_m[var3] = pt.field_W[var3];
              var3++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              this.field_m[pt.field_W.length] = "special";
              this.field_x.a(this.field_m, -29799);
              this.a(false, 0);
              return;
            }
          }
        }
    }

    private final void c(int param0) {
        if (param0 <= 116) {
          L0: {
            this.e((byte) -94);
            if (br.field_f[96]) {
              this.field_t = this.field_t + 5;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (br.field_f[97]) {
              this.field_t = this.field_t - 5;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (br.field_f[98]) {
              this.field_r = this.field_r + 2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (br.field_f[99]) {
              this.field_r = this.field_r - 2;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (br.field_f[96]) {
              this.field_t = this.field_t + 5;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (br.field_f[97]) {
              this.field_t = this.field_t - 5;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (br.field_f[98]) {
              this.field_r = this.field_r + 2;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (br.field_f[99]) {
              this.field_r = this.field_r - 2;
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        var2 = this.field_p.h(5);
        if (var2 != this.field_a) {
          this.a(var2, (byte) 39);
          if (param0 != 111) {
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param0) {
          this.field_v = (wk[]) null;
          var2 = so.field_b.field_a >> -1260475487;
          var3 = -this.field_l.field_H + (so.field_b.field_g + -(this.field_l.field_L << -296222751));
          var4 = this.field_j[0];
          this.field_l.c("Press Esc to return to the main menu", var2, var3, var4, -1);
          return;
        } else {
          var2 = so.field_b.field_a >> -1260475487;
          var3 = -this.field_l.field_H + (so.field_b.field_g + -(this.field_l.field_L << -296222751));
          var4 = this.field_j[0];
          this.field_l.c("Press Esc to return to the main menu", var2, var3, var4, -1);
          return;
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 == -47) {
          if (param1 == 0) {
            return this.field_n.a((byte) -50);
          } else {
            if (-2 == (param1 ^ -1)) {
              return this.field_p.e(true);
            } else {
              if ((param1 ^ -1) == -3) {
                return this.field_u.a((byte) -11);
              } else {
                if ((param1 ^ -1) == -4) {
                  return this.field_x.e(true);
                } else {
                  return 0;
                }
              }
            }
          }
        } else {
          this.field_s = 67;
          if (param1 == 0) {
            return this.field_n.a((byte) -50);
          } else {
            if (-2 == (param1 ^ -1)) {
              return this.field_p.e(true);
            } else {
              if ((param1 ^ -1) == -3) {
                return this.field_u.a((byte) -11);
              } else {
                if ((param1 ^ -1) == -4) {
                  return this.field_x.e(true);
                } else {
                  return 0;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        this.a(param2 ^ 9, param3, param4);
        if (param2 == 8) {
          if (!this.field_p.g(param2 ^ 268)) {
            if (!this.field_x.g(260)) {
              if (!this.field_p.a((byte) 111)) {
                if (this.field_x.a((byte) 74)) {
                  this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                  return;
                } else {
                  return;
                }
              } else {
                this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                return;
              }
            } else {
              this.field_x.a(param0, param2 ^ -18604, param3, param4, param1, param5);
              if (!this.field_p.a((byte) 111)) {
                if (!this.field_x.a((byte) 74)) {
                  return;
                } else {
                  this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                  return;
                }
              } else {
                this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                return;
              }
            }
          } else {
            this.field_p.a(param0, -18596, param3, param4, param1, param5);
            if (!this.field_x.g(260)) {
              if (!this.field_p.a((byte) 111)) {
                if (this.field_x.a((byte) 74)) {
                  this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                  return;
                } else {
                  return;
                }
              } else {
                this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                return;
              }
            } else {
              this.field_x.a(param0, param2 ^ -18604, param3, param4, param1, param5);
              if (!this.field_p.a((byte) 111)) {
                if (this.field_x.a((byte) 74)) {
                  this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                  return;
                } else {
                  return;
                }
              } else {
                this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                return;
              }
            }
          }
        } else {
          this.field_g = 40;
          if (this.field_p.g(param2 ^ 268)) {
            this.field_p.a(param0, -18596, param3, param4, param1, param5);
            if (this.field_x.g(260)) {
              this.field_x.a(param0, param2 ^ -18604, param3, param4, param1, param5);
              if (!this.field_p.a((byte) 111)) {
                if (this.field_x.a((byte) 74)) {
                  this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                  return;
                } else {
                  return;
                }
              } else {
                this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                return;
              }
            } else {
              if (!this.field_p.a((byte) 111)) {
                if (this.field_x.a((byte) 74)) {
                  this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                  return;
                } else {
                  return;
                }
              } else {
                this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                return;
              }
            }
          } else {
            L0: {
              if (!this.field_x.g(260)) {
                break L0;
              } else {
                this.field_x.a(param0, param2 ^ -18604, param3, param4, param1, param5);
                break L0;
              }
            }
            if (!this.field_p.a((byte) 111)) {
              if (this.field_x.a((byte) 74)) {
                this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
                return;
              } else {
                return;
              }
            } else {
              this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
              return;
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        if (param1 == 0) {
          return this.field_n.c(-29408);
        } else {
          if (1 == param1) {
            return this.field_p.n(-18332);
          } else {
            if (-3 == (param1 ^ -1)) {
              return this.field_u.c(-29408);
            } else {
              var3 = 19 % ((39 - param0) / 62);
              if ((param1 ^ -1) != -4) {
                return 0;
              } else {
                return this.field_x.n(-18332);
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        this.a(param2, param1, 8, param4, param3, param5);
        if (param0 <= 66) {
          this.a(true);
          this.b((byte) 111);
          this.a(125);
          this.a((byte) -95);
          return;
        } else {
          this.b((byte) 111);
          this.a(125);
          this.a((byte) -95);
          return;
        }
    }

    final static char a(int param0, char param1) {
        char discarded$2 = 0;
        if (param1 != 181) {
          if (param1 != 402) {
            if (param0 != 98) {
              discarded$2 = hc.a(39, 'ﾫ');
              return Character.toTitleCase(param1);
            } else {
              return Character.toTitleCase(param1);
            }
          } else {
            return param1;
          }
        } else {
          return param1;
        }
    }

    public static void b(int param0) {
        field_o = (int[][]) null;
        field_w = null;
        field_d = null;
        if (param0 == 1017) {
            return;
        }
        hc.b(44);
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ne var3 = null;
        jd var4 = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                hc.a(-115, false);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= vs.field_e.length) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var3 = vs.field_e[var2_int];
                var4 = var3.field_c;
                if (var5 == 0) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (param0 != var4.field_O) {
                        break L3;
                      } else {
                        kl.field_a.a((byte) 53, var2_int);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var2_int++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "hc.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        qn.b();
        this.field_n.a(71);
        this.field_u.a(45);
        this.field_l.c("shift: " + nh.field_D[this.field_a], 480, 230, 16777215, -1);
        this.field_l.c("model ID: " + sf.field_P[this.field_a], 480, 242, 16777215, -1);
        this.a(false);
        this.e((byte) -25);
        this.field_f.e((byte) 109);
        if (param0 > -52) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0) {
        this.c(127);
        if (param0 >= -30) {
          hc.a(-57, true);
          this.field_f.a(this.field_r, 1, this.field_h, -29001, this.field_t, this.field_s);
          this.field_f.b(-19812);
          return;
        } else {
          this.field_f.a(this.field_r, 1, this.field_h, -29001, this.field_t, this.field_s);
          this.field_f.b(-19812);
          return;
        }
    }

    private final int b(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = aw.field_j[this.field_a][param0];
        var3 = var9;
        var4 = var3[ns.a(false, var9.length, new Random())];
        if (0 <= var4) {
          return var4;
        } else {
          var5 = var3;
          var6 = 0;
          L0: while (true) {
            L1: {
              if (var5.length <= var6) {
                break L1;
              } else {
                var7 = var5[var6];
                var11 = -1;
                var10 = var7 ^ -1;
                if (var8 != 0) {
                  if (var10 != var11) {
                    this.d((byte) -91);
                    return aw.field_j[this.field_a][0][0];
                  } else {
                    return aw.field_j[this.field_a][0][0];
                  }
                } else {
                  if (var10 > var11) {
                    var6++;
                    if (var8 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  } else {
                    return var7;
                  }
                }
              }
            }
            if (param1 != -6892) {
              this.d((byte) -91);
              return aw.field_j[this.field_a][0][0];
            } else {
              return aw.field_j[this.field_a][0][0];
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_p.g((byte) 97)) {
          if (this.field_p.c(param1, param0 + -1, param2)) {
            this.field_p.j(0);
            this.field_x.e(32);
            if (param0 == 1) {
              return;
            } else {
              this.a(-69, (byte) 100);
              return;
            }
          } else {
            if (this.field_x.g((byte) 97)) {
              L0: {
                if (this.field_x.c(param1, param0 + -1, param2)) {
                  this.field_x.j(0);
                  this.field_p.e(32);
                  if (var5 == 0) {
                    break L0;
                  } else {
                    this.field_p.j(0);
                    this.field_x.e(32);
                    if (param0 == 1) {
                      return;
                    } else {
                      this.a(-69, (byte) 100);
                      return;
                    }
                  }
                } else {
                  if (!this.field_p.a(param2, param0 + 106, param1)) {
                    if (this.field_x.a(param2, 81, param1)) {
                      this.field_x.j(param0 + -1);
                      this.field_p.e(32);
                      if (var5 == 0) {
                        break L0;
                      } else {
                        this.field_x.j(0);
                        this.field_p.e(32);
                        this.field_p.j(0);
                        this.field_x.e(32);
                        if (param0 == 1) {
                          return;
                        } else {
                          this.a(-69, (byte) 100);
                          return;
                        }
                      }
                    } else {
                      if (!this.field_p.g((byte) 97)) {
                        if (!this.field_x.g((byte) 97)) {
                          this.field_p.j(0);
                          this.field_x.e(32);
                          if (var5 == 0) {
                            break L0;
                          } else {
                            this.field_x.j(param0 + -1);
                            this.field_p.e(32);
                            this.field_x.j(0);
                            this.field_p.e(32);
                            this.field_p.j(0);
                            this.field_x.e(32);
                            if (param0 == 1) {
                              return;
                            } else {
                              this.a(-69, (byte) 100);
                              return;
                            }
                          }
                        } else {
                          this.field_x.j(0);
                          this.field_p.e(32);
                          if (var5 == 0) {
                            break L0;
                          } else {
                            this.field_p.j(0);
                            this.field_x.e(32);
                            this.field_x.j(param0 + -1);
                            this.field_p.e(32);
                            this.field_x.j(0);
                            this.field_p.e(32);
                            this.field_p.j(0);
                            this.field_x.e(32);
                            if (param0 == 1) {
                              return;
                            } else {
                              this.a(-69, (byte) 100);
                              return;
                            }
                          }
                        }
                      } else {
                        this.field_p.j(0);
                        this.field_x.e(32);
                        if (var5 != 0) {
                          if (!this.field_x.g((byte) 97)) {
                            this.field_p.j(0);
                            this.field_x.e(32);
                            if (var5 != 0) {
                              this.field_x.j(param0 + -1);
                              this.field_p.e(32);
                              if (var5 == 0) {
                                if (param0 == 1) {
                                  return;
                                } else {
                                  this.a(-69, (byte) 100);
                                  return;
                                }
                              } else {
                                this.field_x.j(0);
                                this.field_p.e(32);
                                this.field_p.j(0);
                                this.field_x.e(32);
                                if (param0 == 1) {
                                  return;
                                } else {
                                  this.a(-69, (byte) 100);
                                  return;
                                }
                              }
                            } else {
                              if (param0 == 1) {
                                return;
                              } else {
                                this.a(-69, (byte) 100);
                                return;
                              }
                            }
                          } else {
                            this.field_x.j(0);
                            this.field_p.e(32);
                            if (var5 != 0) {
                              L1: {
                                this.field_p.j(0);
                                this.field_x.e(32);
                                if (var5 == 0) {
                                  break L1;
                                } else {
                                  this.field_x.j(param0 + -1);
                                  this.field_p.e(32);
                                  this.field_x.j(0);
                                  this.field_p.e(32);
                                  this.field_p.j(0);
                                  this.field_x.e(32);
                                  break L1;
                                }
                              }
                              if (param0 == 1) {
                                return;
                              } else {
                                this.a(-69, (byte) 100);
                                return;
                              }
                            } else {
                              if (param0 == 1) {
                                return;
                              } else {
                                this.a(-69, (byte) 100);
                                return;
                              }
                            }
                          }
                        } else {
                          if (param0 == 1) {
                            return;
                          } else {
                            this.a(-69, (byte) 100);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_p.j(param0 ^ 1);
                    this.field_x.e(32);
                    if (var5 != 0) {
                      L2: {
                        if (this.field_x.a(param2, 81, param1)) {
                          this.field_x.j(param0 + -1);
                          this.field_p.e(32);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            this.field_x.j(0);
                            this.field_p.e(32);
                            this.field_p.j(0);
                            this.field_x.e(32);
                            if (param0 == 1) {
                              return;
                            } else {
                              this.a(-69, (byte) 100);
                              return;
                            }
                          }
                        } else {
                          if (!this.field_p.g((byte) 97)) {
                            if (!this.field_x.g((byte) 97)) {
                              this.field_p.j(0);
                              this.field_x.e(32);
                              if (var5 == 0) {
                                break L2;
                              } else {
                                this.field_x.j(param0 + -1);
                                this.field_p.e(32);
                                this.field_x.j(0);
                                this.field_p.e(32);
                                this.field_p.j(0);
                                this.field_x.e(32);
                                if (param0 == 1) {
                                  return;
                                } else {
                                  this.a(-69, (byte) 100);
                                  return;
                                }
                              }
                            } else {
                              this.field_x.j(0);
                              this.field_p.e(32);
                              if (var5 == 0) {
                                break L2;
                              } else {
                                this.field_p.j(0);
                                this.field_x.e(32);
                                this.field_x.j(param0 + -1);
                                this.field_p.e(32);
                                this.field_x.j(0);
                                this.field_p.e(32);
                                this.field_p.j(0);
                                this.field_x.e(32);
                                if (param0 == 1) {
                                  return;
                                } else {
                                  this.a(-69, (byte) 100);
                                  return;
                                }
                              }
                            }
                          } else {
                            this.field_p.j(0);
                            this.field_x.e(32);
                            if (var5 == 0) {
                              break L2;
                            } else {
                              L3: {
                                if (!this.field_x.g((byte) 97)) {
                                  break L3;
                                } else {
                                  this.field_x.j(0);
                                  this.field_p.e(32);
                                  break L3;
                                }
                              }
                              L4: {
                                this.field_p.j(0);
                                this.field_x.e(32);
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  this.field_x.j(param0 + -1);
                                  this.field_p.e(32);
                                  this.field_x.j(0);
                                  this.field_p.e(32);
                                  this.field_p.j(0);
                                  this.field_x.e(32);
                                  break L4;
                                }
                              }
                              if (param0 == 1) {
                                return;
                              } else {
                                this.a(-69, (byte) 100);
                                return;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == 1) {
                        return;
                      } else {
                        this.a(-69, (byte) 100);
                        return;
                      }
                    } else {
                      if (param0 == 1) {
                        return;
                      } else {
                        this.a(-69, (byte) 100);
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 1) {
                return;
              } else {
                this.a(-69, (byte) 100);
                return;
              }
            } else {
              L5: {
                L6: {
                  if (!this.field_p.a(param2, param0 + 106, param1)) {
                    break L6;
                  } else {
                    this.field_p.j(param0 ^ 1);
                    this.field_x.e(32);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (this.field_x.a(param2, 81, param1)) {
                  this.field_x.j(param0 + -1);
                  this.field_p.e(32);
                  if (var5 == 0) {
                    break L5;
                  } else {
                    this.field_x.j(0);
                    this.field_p.e(32);
                    this.field_p.j(0);
                    this.field_x.e(32);
                    if (param0 == 1) {
                      return;
                    } else {
                      this.a(-69, (byte) 100);
                      return;
                    }
                  }
                } else {
                  if (!this.field_p.g((byte) 97)) {
                    if (!this.field_x.g((byte) 97)) {
                      this.field_p.j(0);
                      this.field_x.e(32);
                      if (var5 == 0) {
                        break L5;
                      } else {
                        this.field_x.j(param0 + -1);
                        this.field_p.e(32);
                        this.field_x.j(0);
                        this.field_p.e(32);
                        this.field_p.j(0);
                        this.field_x.e(32);
                        if (param0 == 1) {
                          return;
                        } else {
                          this.a(-69, (byte) 100);
                          return;
                        }
                      }
                    } else {
                      this.field_x.j(0);
                      this.field_p.e(32);
                      if (var5 == 0) {
                        break L5;
                      } else {
                        this.field_p.j(0);
                        this.field_x.e(32);
                        this.field_x.j(param0 + -1);
                        this.field_p.e(32);
                        this.field_x.j(0);
                        this.field_p.e(32);
                        this.field_p.j(0);
                        this.field_x.e(32);
                        if (param0 != 1) {
                          this.a(-69, (byte) 100);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    this.field_p.j(0);
                    this.field_x.e(32);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      L7: {
                        if (!this.field_x.g((byte) 97)) {
                          break L7;
                        } else {
                          this.field_x.j(0);
                          this.field_p.e(32);
                          break L7;
                        }
                      }
                      L8: {
                        this.field_p.j(0);
                        this.field_x.e(32);
                        if (var5 == 0) {
                          break L8;
                        } else {
                          this.field_x.j(param0 + -1);
                          this.field_p.e(32);
                          this.field_x.j(0);
                          this.field_p.e(32);
                          this.field_p.j(0);
                          this.field_x.e(32);
                          break L8;
                        }
                      }
                      if (param0 != 1) {
                        this.a(-69, (byte) 100);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == 1) {
                return;
              } else {
                this.a(-69, (byte) 100);
                return;
              }
            }
          }
        } else {
          L9: {
            L10: {
              if (!this.field_x.g((byte) 97)) {
                break L10;
              } else {
                if (this.field_x.c(param1, param0 + -1, param2)) {
                  this.field_x.j(0);
                  this.field_p.e(32);
                  if (var5 == 0) {
                    break L9;
                  } else {
                    this.field_p.j(0);
                    this.field_x.e(32);
                    if (param0 != 1) {
                      this.a(-69, (byte) 100);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (!this.field_p.a(param2, param0 + 106, param1)) {
                break L11;
              } else {
                this.field_p.j(param0 ^ 1);
                this.field_x.e(32);
                if (var5 == 0) {
                  break L9;
                } else {
                  break L11;
                }
              }
            }
            if (this.field_x.a(param2, 81, param1)) {
              this.field_x.j(param0 + -1);
              this.field_p.e(32);
              if (var5 == 0) {
                break L9;
              } else {
                this.field_x.j(0);
                this.field_p.e(32);
                this.field_p.j(0);
                this.field_x.e(32);
                if (param0 != 1) {
                  this.a(-69, (byte) 100);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!this.field_p.g((byte) 97)) {
                if (!this.field_x.g((byte) 97)) {
                  this.field_p.j(0);
                  this.field_x.e(32);
                  if (var5 == 0) {
                    break L9;
                  } else {
                    this.field_x.j(param0 + -1);
                    this.field_p.e(32);
                    this.field_x.j(0);
                    this.field_p.e(32);
                    this.field_p.j(0);
                    this.field_x.e(32);
                    if (param0 != 1) {
                      this.a(-69, (byte) 100);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  this.field_x.j(0);
                  this.field_p.e(32);
                  if (var5 == 0) {
                    break L9;
                  } else {
                    this.field_p.j(0);
                    this.field_x.e(32);
                    this.field_x.j(param0 + -1);
                    this.field_p.e(32);
                    this.field_x.j(0);
                    this.field_p.e(32);
                    this.field_p.j(0);
                    this.field_x.e(32);
                    if (param0 != 1) {
                      this.a(-69, (byte) 100);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                this.field_p.j(0);
                this.field_x.e(32);
                if (var5 == 0) {
                  break L9;
                } else {
                  L12: {
                    if (!this.field_x.g((byte) 97)) {
                      break L12;
                    } else {
                      this.field_x.j(0);
                      this.field_p.e(32);
                      break L12;
                    }
                  }
                  L13: {
                    this.field_p.j(0);
                    this.field_x.e(32);
                    if (var5 == 0) {
                      break L13;
                    } else {
                      this.field_x.j(param0 + -1);
                      this.field_p.e(32);
                      this.field_x.j(0);
                      this.field_p.e(32);
                      this.field_p.j(0);
                      this.field_x.e(32);
                      break L13;
                    }
                  }
                  if (param0 != 1) {
                    this.a(-69, (byte) 100);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (param0 != 1) {
            this.a(-69, (byte) 100);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0) {
        int var2 = this.field_x.h(5);
        if (!(var2 != this.field_g)) {
            return;
        }
        int var3 = -5 % ((param0 - 58) / 50);
        this.a(false, var2);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        this.field_g = param1;
        this.field_x.b(0, this.field_g);
        this.field_f.a(115);
        var3 = this.b(this.field_g, -6892);
        if (param0) {
          return;
        } else {
          this.field_f.a(var3, this.field_g, (byte) 63);
          this.field_f.a(true);
          return;
        }
    }

    private final void d(int param0) {
        this.field_h = param0 * (so.field_b.field_g >> -1842926078);
        this.field_t = 0;
        this.field_s = so.field_b.field_a / 3;
        this.field_f = new sh();
    }

    private final void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (param2 == 0) {
            this.field_n.a(param0, (byte) 67, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if ((param2 ^ -1) != -2) {
          if (param3 > 18) {
            if (-3 == (param2 ^ -1)) {
              L1: {
                this.field_u.a(param0, (byte) 53, param1);
                if (param2 == 3) {
                  this.field_x.e(68, param1, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                if (param2 == 3) {
                  this.field_x.e(68, param1, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_p.e(105, param1, param0);
          if (param3 > 18) {
            if (-3 != (param2 ^ -1)) {
              L3: {
                if (param2 == 3) {
                  this.field_x.e(68, param1, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                this.field_u.a(param0, (byte) 53, param1);
                if (param2 == 3) {
                  this.field_x.e(68, param1, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void d(byte param0) {
        this.field_n = new ia(this.field_v, this.field_l, this.field_j, "Model", 0, 0);
        this.field_u = new ia(this.field_v, this.field_l, this.field_j, "Animation", 0, 0);
        this.field_k = hf.field_d;
        this.field_p = new r(this.field_v, this.field_c, this.field_l, this.field_j, this.field_k, 0, 0);
        if (param0 >= -122) {
          field_b = 61;
          this.field_x = new r(this.field_v, this.field_c, this.field_l, this.field_j, this.field_m, 0, 0);
          return;
        } else {
          this.field_x = new r(this.field_v, this.field_c, this.field_l, this.field_j, this.field_m, 0, 0);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = param3 / 3;
        var7 = param0;
        L0: while (true) {
          if ((var7 ^ -1) > -5) {
            L1: {
              L2: {
                var8 = this.a(param0 + -100, var7);
                var9 = param2 + (-var8 + param1 >> 1031828769);
                if (2 > var7) {
                  break L2;
                } else {
                  L3: {
                    var11 = param4 - -param3 + -var6;
                    var10 = var11;
                    if (-3 == (var7 ^ -1)) {
                      var12 = this.a((byte) -47, var7);
                      var10 = -var12 + var10;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var11 = var6 + param4;
              var10 = var11;
              if (0 != var7) {
                break L1;
              } else {
                var12 = this.a((byte) -47, var7);
                var10 = var10 - var12;
                break L1;
              }
            }
            this.a(var10, var9, var7, 35);
            var7++;
            if (var13 == 0) {
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    hc(wk[] param0, wk[] param1, tu param2, int[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            this.field_c = param1;
            this.field_j = param3;
            this.field_l = param2;
            this.field_m = pt.field_W;
            this.field_v = param0;
            this.d((byte) -127);
            this.d(3);
            this.a(param4, (byte) 39);
            this.a(0, so.field_b.field_a >> 207970785, so.field_b.field_a >> -1422973343, so.field_b.field_g, 0);
            qt.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var7);
            stackOut_3_1 = new StringBuilder().append("hc.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_w = "Benefits";
        field_d = "Computer players: ";
        field_o = new int[][]{new int[]{-1, 3, 1, 0}, new int[]{-1, 4, 1, 0}, new int[]{-1, 5, 1, 0}, new int[]{-1, 6, 1, 0}, new int[]{-1, 7, 1, 0}, new int[]{-1, 8, 1, 0}, new int[]{-1, 5, 1, 1}, new int[]{-1, 6, 1, 1}, new int[]{-1, 7, 1, 1}, new int[]{-1, 8, 1, 1}, new int[]{-1, 7, 1, 2}, new int[]{-1, 8, 1, 2}, new int[]{-1, 2, 1, 3}, new int[]{-1, 2, 4, 1}, new int[]{-1, 3, 4, 1}, new int[]{-1, 5, 4, 1}, new int[]{-1, 7, 4, 1}};
        field_q = 0;
    }
}
