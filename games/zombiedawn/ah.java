/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ah extends g {
    int[] field_gb;
    private int field_lb;
    private boolean field_nb;
    private boolean field_hb;
    static int field_eb;
    int field_ub;
    fb field_sb;
    static String field_bb;
    private int field_rb;
    private nc field_cb;
    private int field_vb;
    int field_pb;
    int[] field_jb;
    boolean field_kb;
    int field_db;
    int field_mb;
    boolean field_ib;
    boolean field_fb;
    boolean field_ob;
    private int field_qb;
    static vn field_tb;

    final boolean p(int param0) {
        int var2 = -44 / ((-76 - param0) / 44);
        if ((this.field_t ^ -1) == -29) {
            return false;
        }
        this.i((byte) -71);
        int var3 = this.j((byte) -123);
        if (-1 == var3) {
            return false;
        }
        this.field_nb = false;
        this.field_qb = 5;
        this.field_Y = this.field_jb[var3];
        this.field_X = this.field_gb[var3];
        ho.a(this.f(237239984), (byte) 54, this.a(true));
        pi.a(this.field_X, this.field_Y, (byte) 101);
        this.c(0, this.field_D);
        this.e(1, -6904);
        return true;
    }

    void c(int param0, int param1, int param2) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int var4;
        int var5;
        int var6;
        double var7;
        int var9;
        int var10;
        int var11;
        var11 = ZombieDawn.field_J;
        if ((this.field_F ^ -1) == -19) {
          return;
        } else {
          if (this.field_F != 20) {
            L0: {
              var4 = 200;
              var5 = param0 - this.a(true);
              if (param1 > 24) {
                break L0;
              } else {
                this.field_hb = false;
                break L0;
              }
            }
            L1: {
              var6 = -this.f(237239984) + param2;
              var7 = (double)var4 / (double)so.b(var6 * var6 + var5 * var5);
              this.field_Y = this.a(true) - (int)((double)var5 * var7);
              this.field_X = -(int)((double)var6 * var7) + this.f(237239984);
              this.c(0, 401408);
              this.e(2, -6904);
              this.field_rb = 1;
              stackIn_7_0 = this;

              if (this.field_S != 3) {
                stackIn_8_0 = this;
                stackIn_8_1 = 3;
                break L1;
              } else {
                stackIn_8_0 = this;
                stackIn_8_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ah) (this)).field_S = stackIn_8_1;
              ho.a(this.f(237239984), (byte) 54, this.a(true));
              var9 = -1;
              var10 = pb.a(so.field_a, 128, 1);
              if ((var10 ^ -1) < -111) {
                var9 = this.field_db;
                break L2;
              } else {
                if (var10 > 50) {
                  if (this.t(10)) {
                    var9 = pb.a(so.field_a, 4, 1) + 40;
                    break L2;
                  } else {
                    var9 = pb.a(so.field_a, 3, 1) + 37;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var9 == -1) {
                break L3;
              } else {
                dc.a((byte) 18, var9);
                break L3;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2) {
        fb var4;
        kd var5;
        int var6;
        fb stackIn_7_0 = null;
        int stackIn_22_0 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          this.field_sb = null;
          this.field_fb = false;
          if (param0 <= -28) {
            break L0;
          } else {
            this.field_fb = true;
            break L0;
          }
        }
        var4 = this.a((byte) -74, param1, 10);
        L1: while (true) {
          if (var4 == null) {
            L2: {
              if (null == this.field_sb) {
                stackIn_22_0 = 0;
                break L2;
              } else {
                stackIn_22_0 = 1;
                break L2;
              }
            }
            return stackIn_22_0 != 0;
          } else {
            L3: {
              if (var4 instanceof kd) {
                stackIn_7_0 = (fb) (var4);
                break L3;
              } else {
                stackIn_7_0 = null;
                break L3;
              }
            }
            L4: {
              L5: {
                var5 = (kd) ((Object) stackIn_7_0);
                if (var5 == null) {
                  break L5;
                } else {
                  if (var5.x(79)) {
                    break L5;
                  } else {
                    if (!(this instanceof we)) {
                      break L4;
                    } else {
                      if (var5.field_F != 9) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L6: {
                if (param2) {
                  break L6;
                } else {
                  if (this.a(72, var4)) {
                    break L6;
                  } else {
                    var4 = this.e((byte) 32);
                    continue L1;
                  }
                }
              }
              this.field_sb = var4;
              this.field_mb = this.field_s;
              if (var5 == null) {
                break L4;
              } else {
                if ((var5.field_bb ^ -1) >= -1) {
                  break L4;
                } else {
                  this.field_fb = true;
                  return true;
                }
              }
            }
            var4 = this.e((byte) 32);
            continue L1;
          }
        }
    }

    final int s(int param0) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        var2 = this.field_t;
        if (0 != var2) {
          if (-2 != (var2 ^ -1)) {
            if (var2 != 2) {
              if (3 != var2) {
                if (4 == var2) {
                  return uo.field_j;
                } else {
                  if (var2 == 5) {
                    return lc.field_j;
                  } else {
                    if (-7 != (var2 ^ -1)) {
                      if (7 != var2) {
                        if (var2 != 8) {
                          if ((var2 ^ -1) == -10) {
                            return gg.field_b;
                          } else {
                            if (10 != var2) {
                              if (-12 != (var2 ^ -1)) {
                                if (-13 == (var2 ^ -1)) {
                                  return da.field_h;
                                } else {
                                  if (var2 == 13) {
                                    return pa.field_B;
                                  } else {
                                    if (-15 == (var2 ^ -1)) {
                                      return pa.field_B;
                                    } else {
                                      if ((var2 ^ -1) == -16) {
                                        return gn.field_b;
                                      } else {
                                        if (-24 == (var2 ^ -1)) {
                                          return qc.field_a;
                                        } else {
                                          if (var2 != 16) {
                                            if (-29 != (var2 ^ -1)) {
                                              if ((var2 ^ -1) == -19) {
                                                return ke.field_h;
                                              } else {
                                                if (-20 == (var2 ^ -1)) {
                                                  return jc.field_h;
                                                } else {
                                                  if (var2 == 29) {
                                                    return h.field_a;
                                                  } else {
                                                    if ((var2 ^ -1) != -27) {
                                                      if ((var2 ^ -1) == -25) {
                                                        return h.field_a;
                                                      } else {
                                                        if (-26 == (var2 ^ -1)) {
                                                          return h.field_a;
                                                        } else {
                                                          if (22 == var2) {
                                                            return h.field_a;
                                                          } else {
                                                            if ((var2 ^ -1) != -22) {
                                                              if (var2 != 30) {
                                                                if (param0 == 24478) {
                                                                  return 0;
                                                                } else {
                                                                  this.field_db = -10;
                                                                  return 0;
                                                                }
                                                              } else {
                                                                return da.field_n;
                                                              }
                                                            } else {
                                                              return h.field_a;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      return h.field_a;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              return ke.field_h;
                                            }
                                          } else {
                                            return qc.field_a;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                return da.field_h;
                              }
                            } else {
                              return gg.field_b;
                            }
                          }
                        } else {
                          return h.field_a;
                        }
                      } else {
                        return h.field_a;
                      }
                    } else {
                      return da.field_n;
                    }
                  }
                }
              } else {
                return lc.field_j;
              }
            } else {
              return uo.field_j;
            }
          } else {
            return lc.field_j;
          }
        } else {
          return lc.field_j;
        }
    }

    private final String k(byte param0) {
        int var2;
        int var3;
        var3 = ZombieDawn.field_J;
        if (param0 == -34) {
          var2 = this.field_F;
          if (var2 == 0) {
            return "IDLE";
          } else {
            if (1 != var2) {
              if ((var2 ^ -1) == -4) {
                return "COWERING";
              } else {
                if (16 == var2) {
                  return "SCREECHCOWER";
                } else {
                  if ((var2 ^ -1) == -12) {
                    return "AIMING";
                  } else {
                    if (-11 != (var2 ^ -1)) {
                      if ((var2 ^ -1) != -3) {
                        return "ILLEGAL";
                      } else {
                        return "KNOCKBACK";
                      }
                    } else {
                      return "SHOOTING";
                    }
                  }
                }
              }
            } else {
              return "RUNNING";
            }
          }
        } else {
          return (String) null;
        }
    }

    final void a(int param0, byte param1, int param2) {
        kk var7 = null;
        kk var6 = null;
        int var4 = -5 % ((43 - param1) / 57);
        qh var5 = dj.field_e.field_H.a(true, this.a(true), param2, param0, this.f(237239984));
        if (var5 != null) {
            var7 = (kk) ((Object) var5.b((byte) 26));
            var6 = var7;
            if (this.a(true) == var7.field_l && this.f(237239984) == var7.field_h) {
                var6 = (kk) ((Object) var5.a(false));
            }
            if (!(var6 != null)) {
                return;
            }
            this.field_Y = var6.field_l;
            this.field_X = var6.field_h;
            this.c(0, this.field_D);
            this.e(1, -6904);
        }
    }

    final void n(int param0) {
        int stackIn_8_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        fb var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = ZombieDawn.field_J;
        var3 = -110 % ((param0 - 24) / 52);
        var2 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= this.field_ub) {
            L1: {
              if (var2 != 0) {
                var4 = 0;
                L2: while (true) {
                  if (this.field_ub <= var4) {
                    break L1;
                  } else {
                    L3: {
                      if (-1 > (h.field_e[var4] ^ -1)) {
                        h.field_e[var4] = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if ((h.field_e[var4] ^ -1) > 0) {
                      h.field_e[var4] = -h.field_e[var4] + 1000000;
                      var4++;
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            return;
          } else {
            L4: {
              h.field_e[var4] = 0;
              if (0 >= this.field_z) {
                if (mf.a(this.field_gb[var4], this.field_jb[var4], 0)) {
                  stackIn_8_0 = 1;
                  break L4;
                } else {
                  stackIn_8_0 = 0;
                  break L4;
                }
              } else {
                stackIn_8_0 = 1;
                break L4;
              }
            }
            L5: {
              var5 = stackIn_8_0;
              if (-1 + this.field_ub == var4) {
                break L5;
              } else {
                L6: {
                  if (var5 == 0) {
                    break L6;
                  } else {
                    if (-1 != dj.field_e.field_H.a(this.field_gb[var4], this.f(237239984), this.field_jb[var4], this.a(true), 124)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                h.field_e[var4] = -1;
                var4++;
                continue L0;
              }
            }
            var6 = this.b(250, 16);
            L7: while (true) {
              if (var6 != null) {
                L8: {
                  L9: {
                    L10: {
                      if (!(var6 instanceof kd)) {
                        break L10;
                      } else {
                        if (((kd) ((Object) var6)).x(53)) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (var6 instanceof vb) {
                      break L9;
                    } else {
                      if (0 == this.field_z) {
                        break L8;
                      } else {
                        if (!(var6 instanceof id)) {
                          break L8;
                        } else {
                          if (this.field_z == var6.field_z) {
                            var7 = this.field_jb[var4] - var6.a(true);
                            var8 = this.field_gb[var4] + -var6.f(237239984);
                            var9 = var8 * var8 + var7 * var7;
                            if (var9 < 625) {
                              var2 = 1;
                              h.field_e[var4] = -1 + -var9;
                              var6 = this.e((byte) 32);
                              continue L7;
                            } else {
                              var6 = this.e((byte) 32);
                              continue L7;
                            }
                          } else {
                            var6 = this.e((byte) 32);
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    var7 = this.field_jb[var4] + -var6.a(true);
                    var8 = this.field_gb[var4] + -var6.f(237239984);
                    var9 = var7 * var7 + var8 * var8;
                    if (0 == h.field_e[var4]) {
                      break L11;
                    } else {
                      if (h.field_e[var4] > var9) {
                        break L11;
                      } else {
                        var6 = this.e((byte) 32);
                        continue L7;
                      }
                    }
                  }
                  h.field_e[var4] = var9;
                  break L8;
                }
                var6 = this.e((byte) 32);
                continue L7;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    void a(byte param0, wk param1) {
        vn stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        vn stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_67_0;
        int stackIn_67_1;
        int stackIn_67_2;
        int stackIn_67_3;
        int stackIn_68_0;
        int stackIn_68_1;
        int stackIn_68_2;
        int stackIn_68_3;
        int stackIn_68_4;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (20 == this.field_F) {
                break L1;
              } else {
                if (!this.field_J) {
                  L2: {
                    var3_int = -24 + param1.a(this.a(true), (byte) -81);
                    var4 = param1.a(this.f(237239984), 0) + -48;
                    if (null == this.field_U) {
                      break L2;
                    } else {
                      if (this.field_U.l()) {
                        this.field_U = null;
                        break L2;
                      } else {
                        this.field_U.h(pj.a(var4, 84, var3_int));
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (b.field_h) {
                      bj.field_q.c(this.k((byte) -34), var3_int, var4, 16777215, 0);
                      this.a(param1, 5060);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var3_int < -48) {
                      break L4;
                    } else {
                      if (var4 < -48) {
                        break L4;
                      } else {
                        if (qj.field_d < var3_int) {
                          break L4;
                        } else {
                          if (var4 > me.field_Bb) {
                            break L4;
                          } else {
                            L5: {
                              if (-18 == (this.field_F ^ -1)) {
                                break L5;
                              } else {
                                L6: {
                                  stackIn_20_0 = nb.field_k[1];

                                  stackIn_20_1 = 12;

                                  if (this.field_S == 3) {
                                    stackIn_21_0 = (vn) ((Object) stackIn_20_0);
                                    stackIn_21_1 = stackIn_20_1;
                                    stackIn_21_2 = -2 + var3_int;
                                    break L6;
                                  } else {
                                    stackIn_21_0 = (vn) ((Object) stackIn_20_0);
                                    stackIn_21_1 = stackIn_20_1;
                                    stackIn_21_2 = -3 + var3_int;
                                    break L6;
                                  }
                                }
                                so.a(stackIn_21_0, stackIn_21_1 + stackIn_21_2, 43 + var4);
                                break L5;
                              }
                            }
                            L7: {
                              if ((this.field_z ^ -1) < -1) {
                                Math.abs(ip.field_p[0].field_w * fb.a(1311979239, (int)tp.field_p << -852457050) >> -12998352);
                                var5 = 6 * fb.a(1311979239, (int)tp.field_p << -877369338) >> -7036432;
                                var6 = rd.a(true, (int)tp.field_p << -1330099737) * 3 >> -1598446800;
                                ip.field_p[0].g(var5 + 24 + (var3_int + -7), 2 + (var4 - -var6), bb.field_e[-1 + this.field_z]);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              L9: {
                                var5 = cg.field_d[this.field_F] - -this.field_G;
                                var6 = var3_int;
                                var7 = var4;
                                if (-1 > (this.field_Z ^ -1)) {
                                  break L9;
                                } else {
                                  if (!ng.field_e) {
                                    break L8;
                                  } else {
                                    L10: {
                                      if (this.field_ib) {
                                        break L10;
                                      } else {
                                        if (!this.field_C) {
                                          break L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (!bo.field_p[86]) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              ki.a((byte) -114, dn.field_E);
                              var4 = 0;
                              bi.d();
                              var3_int = 0;
                              break L8;
                            }
                            L11: {
                              if (param0 <= -76) {
                                break L11;
                              } else {
                                this.n(-60);
                                break L11;
                              }
                            }
                            L12: {
                              L13: {
                                if ((this.field_F ^ -1) == -11) {
                                  break L13;
                                } else {
                                  if (-12 == (this.field_F ^ -1)) {
                                    break L13;
                                  } else {
                                    L14: {
                                      if (3 == this.field_S) {
                                        break L14;
                                      } else {
                                        if (-3 == (this.field_S ^ -1)) {
                                          break L14;
                                        } else {
                                          ld.field_l[this.field_t][var5].c(var3_int, var4);
                                          break L12;
                                        }
                                      }
                                    }
                                    ld.field_l[this.field_t][var5].b(var3_int, var4);
                                    break L12;
                                  }
                                }
                              }
                              if ((this.field_S ^ -1) == -3) {
                                ld.field_l[this.field_t][var5 + 2].b(var3_int, var4);
                                break L12;
                              } else {
                                if (this.field_S == 0) {
                                  ld.field_l[this.field_t][var5 + 4].b(var3_int, var4);
                                  break L12;
                                } else {
                                  if ((this.field_S ^ -1) == -4) {
                                    ld.field_l[this.field_t][var5].b(var3_int, var4);
                                    break L12;
                                  } else {
                                    if (-2 == (this.field_S ^ -1)) {
                                      ld.field_l[this.field_t][var5].c(var3_int, var4);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            L15: {
                              L16: {
                                if (0 < this.field_Z) {
                                  break L16;
                                } else {
                                  if (!ng.field_e) {
                                    break L15;
                                  } else {
                                    L17: {
                                      if (this.field_ib) {
                                        break L17;
                                      } else {
                                        if (!this.field_C) {
                                          break L15;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    if (bo.field_p[86]) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              L18: {
                                if (!ng.field_e) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (this.field_ib) {
                                      break L19;
                                    } else {
                                      if (this.field_C) {
                                        break L19;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L20: {
                                    stackIn_64_0 = 0;

                                    stackIn_64_1 = 0;

                                    stackIn_64_2 = dn.field_E.field_w;

                                    stackIn_64_3 = dn.field_E.field_t;

                                    if (this.field_C) {
                                      stackIn_65_0 = stackIn_64_0;
                                      stackIn_65_1 = stackIn_64_1;
                                      stackIn_65_2 = stackIn_64_2;
                                      stackIn_65_3 = stackIn_64_3;
                                      stackIn_65_4 = 8921617;
                                      break L20;
                                    } else {
                                      stackIn_65_0 = stackIn_64_0;
                                      stackIn_65_1 = stackIn_64_1;
                                      stackIn_65_2 = stackIn_64_2;
                                      stackIn_65_3 = stackIn_64_3;
                                      stackIn_65_4 = 43775;
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    so.a(stackIn_65_0, stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_65_4);
                                    stackIn_67_0 = 0;

                                    stackIn_67_1 = 0;

                                    stackIn_67_2 = dn.field_E.field_w;

                                    stackIn_67_3 = dn.field_E.field_t;

                                    if (this.field_C) {
                                      stackIn_68_0 = stackIn_67_0;
                                      stackIn_68_1 = stackIn_67_1;
                                      stackIn_68_2 = stackIn_67_2;
                                      stackIn_68_3 = stackIn_67_3;
                                      stackIn_68_4 = 16711680;
                                      break L21;
                                    } else {
                                      stackIn_68_0 = stackIn_67_0;
                                      stackIn_68_1 = stackIn_67_1;
                                      stackIn_68_2 = stackIn_67_2;
                                      stackIn_68_3 = stackIn_67_3;
                                      stackIn_68_4 = 255;
                                      break L21;
                                    }
                                  }
                                  so.a(stackIn_68_0, stackIn_68_1, stackIn_68_2, stackIn_68_3, stackIn_68_4);
                                  pa.a(-21189);
                                  var4 = var7;
                                  var3_int = var6;
                                  dn.field_E.b(var3_int, var4);
                                  break L15;
                                }
                              }
                              pa.a(-21189);
                              var4 = var7;
                              var3_int = var6;
                              dn.field_E.d(var3_int, var4, 142);
                              break L15;
                            }
                            L22: {
                              if (kc.field_Q) {
                                pc.field_k.a(s.a(1938762664, "<%0>,<%1>", new String[]{Integer.toString(this.field_B), Integer.toString(this.field_u)}), 24 + var3_int, -5 + var4, 16777215, 0);
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            L23: {
                              if (this.field_ob) {
                                nb.field_k[0].b(var3_int, var4, 128, 16711680);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var3);

            stackIn_78_1 = new StringBuilder().append("ah.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L24;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L24;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void j(int param0) {
        super.j(124);
        this.e(3, -6904);
        if (param0 < 66) {
            this.n(53);
        }
    }

    int j(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ZombieDawn.field_J;
        this.n(87);
        var2 = -1;
        var3 = 0;
        if (param0 < -42) {
          L0: while (true) {
            if (this.field_ub <= var3) {
              L1: {
                if (-1 + this.field_ub != var2) {
                  break L1;
                } else {
                  var2 = -1;
                  break L1;
                }
              }
              return var2;
            } else {
              if (-1 != h.field_e[var3]) {
                L2: {
                  if (-1 == var2) {
                    break L2;
                  } else {
                    if (h.field_e[var3] >= h.field_e[var2]) {
                      break L2;
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                }
                var2 = var3;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return -120;
        }
    }

    final boolean a(int param0, fb param1) {
        ej var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wk var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = dj.field_e.field_H;
              if (param0 > 52) {
                break L1;
              } else {
                var8 = (wk) null;
                this.a((byte) -36, (wk) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var4 = this.field_y >> 1972312944;
                var5 = this.field_x >> -577246032;
                var6 = param1.field_y >> 551406032;
                var7 = param1.field_x >> -2052826832;
                if (0 != (var3.a(var7, var4, var5, (byte) -111, false, var6) ^ -1)) {
                  break L3;
                } else {
                  if (var3.a(-48 + var7 - -10, var4, 10 + (-48 + var5), (byte) -123, false, var6) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ah.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int var2;
        le var3;
        int var4;
        L0: {
          var4 = ZombieDawn.field_J;
          if (400 - -this.field_t <= dj.field_e.field_r) {
            break L0;
          } else {
            if ((dj.field_e.field_r ^ -1) < -201) {
              if (-1 != (pb.a(so.field_a, 25, 1) ^ -1)) {
                break L0;
              } else {
                this.c(this.a(true) + pb.a(so.field_a, 1000, 1) - 500, 78, this.f(237239984) - (-pb.a(so.field_a, 1000, 1) + 500));
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 >= 95) {
            break L1;
          } else {
            this.field_gb = (int[]) null;
            break L1;
          }
        }
        this.m(-67);
        this.d(this.field_F, -26109);
        if (!this.field_V) {
          L2: {
            L3: {
              if (-1 == (this.field_F ^ -1)) {
                L4: {
                  fieldTemp$0 = this.field_vb + 1;
                  this.field_vb = this.field_vb + 1;
                  if (this.field_lb >= fieldTemp$0) {
                    break L4;
                  } else {
                    L5: {
                      stackIn_91_0 = this;

                      if (this.field_hb) {
                        stackIn_92_0 = this;
                        stackIn_92_1 = 0;
                        break L5;
                      } else {
                        stackIn_92_0 = this;
                        stackIn_92_1 = 1;
                        break L5;
                      }
                    }
                    ((ah) (this)).field_hb = stackIn_92_1 != 0;
                    this.field_vb = 0;
                    if (this.field_hb) {
                      this.field_lb = 53;
                      break L4;
                    } else {
                      L6: {
                        stackIn_95_0 = this;

                        if (!this.field_hb) {
                          stackIn_96_0 = this;
                          stackIn_96_1 = pb.a(so.field_a, 200, 1) + 20;
                          break L6;
                        } else {
                          stackIn_96_0 = this;
                          stackIn_96_1 = 65;
                          break L6;
                        }
                      }
                      ((ah) (this)).field_lb = stackIn_96_1;
                      break L4;
                    }
                  }
                }
                L7: {
                  if (!this.field_hb) {
                    this.field_G = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                fieldTemp$1 = this.field_qb;
                this.field_qb = this.field_qb + 1;
                if ((fieldTemp$1 ^ -1) <= -6) {
                  this.field_qb = 0;
                  this.l((byte) 52);
                  break L3;
                } else {
                  break L2;
                }
              } else {
                if (2 == this.field_F) {
                  L8: {
                    L9: {
                      if (0 != this.field_O) {
                        break L9;
                      } else {
                        if (this.field_T != 0) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.g((byte) -113);
                    if (dj.field_e.field_H.a(false, this.field_T + this.field_x >> -1523126096, this.field_y + this.field_O >> -1060854128, true)) {
                      break L8;
                    } else {
                      L10: {
                        this.field_x = this.field_x - this.field_T;
                        this.field_y = this.field_y - this.field_O;
                        if (this.field_O == 0) {
                          break L10;
                        } else {
                          if (!dj.field_e.field_H.a(false, this.f(237239984), this.field_O + this.field_y >> 1639600464, true)) {
                            break L10;
                          } else {
                            this.field_T = 0;
                            this.field_y = this.field_y + this.field_O;
                            this.field_X = this.field_x >> 1870696816;
                            break L8;
                          }
                        }
                      }
                      L11: {
                        if (-1 == (this.field_T ^ -1)) {
                          break L11;
                        } else {
                          if (!dj.field_e.field_H.a(false, this.field_x + this.field_T >> 1427798000, this.field_y >> 1431623312, true)) {
                            break L11;
                          } else {
                            this.field_O = 0;
                            this.field_Y = this.field_y >> 1060555120;
                            this.field_x = this.field_x + this.field_T;
                            break L8;
                          }
                        }
                      }
                      this.field_O = 0;
                      this.field_T = 0;
                      break L8;
                    }
                  }
                  if (-5 >= (this.field_G ^ -1)) {
                    if (this.field_G != 4) {
                      if (6 == this.field_G) {
                        this.e(0, -6904);
                        pi.a(this.f(237239984), this.a(true), (byte) 101);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L12: {
                        this.field_N = 0;
                        fieldTemp$2 = this.field_rb;
                        this.field_rb = this.field_rb + 1;
                        if (-401 >= (fieldTemp$2 ^ -1)) {
                          this.field_G = this.field_G + 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      this.field_T = 0;
                      this.field_O = 0;
                      break L2;
                    }
                  } else {
                    this.field_N = this.field_N + 1;
                    break L2;
                  }
                } else {
                  if ((this.field_F ^ -1) != -2) {
                    if (23 != this.field_F) {
                      if (-4 != (this.field_F ^ -1)) {
                        if ((this.field_F ^ -1) != -17) {
                          if (-21 != (this.field_F ^ -1)) {
                            break L3;
                          } else {
                            break L2;
                          }
                        } else {
                          fieldTemp$3 = this.field_qb;
                          this.field_qb = this.field_qb + 1;
                          if (-6 >= (fieldTemp$3 ^ -1)) {
                            L13: {
                              this.field_qb = 0;
                              if (this.field_cb == null) {
                                break L13;
                              } else {
                                if (!this.field_cb.c(111)) {
                                  break L3;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            this.field_cb = null;
                            this.e(0, -6904);
                            this.l((byte) 52);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        fieldTemp$4 = this.field_qb;
                        this.field_qb = this.field_qb + 1;
                        if (fieldTemp$4 < 5) {
                          break L3;
                        } else {
                          this.field_qb = 0;
                          this.l((byte) 52);
                          break L2;
                        }
                      }
                    } else {
                      L14: {
                        fieldTemp$5 = this.field_qb;
                        this.field_qb = this.field_qb + 1;
                        if (5 <= fieldTemp$5) {
                          this.field_qb = 0;
                          var2 = 0;
                          var3 = dj.field_e.field_lb.b((byte) 26);
                          L15: while (true) {
                            if (!(var3 instanceof mm)) {
                              L16: {
                                L17: {
                                  if (this.field_nb) {
                                    break L17;
                                  } else {
                                    if (var2 != 0) {
                                      this.c(0, this.field_D >> -734620190);
                                      break L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (!this.field_nb) {
                                  break L16;
                                } else {
                                  if (var2 == 0) {
                                    this.c(0, this.field_D);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L18: {
                                stackIn_50_0 = this;

                                if (var2 == 0) {
                                  stackIn_51_0 = this;
                                  stackIn_51_1 = 0;
                                  break L18;
                                } else {
                                  stackIn_51_0 = this;
                                  stackIn_51_1 = 1;
                                  break L18;
                                }
                              }
                              ((ah) (this)).field_nb = stackIn_51_1 != 0;
                              this.l((byte) 52);
                              break L14;
                            } else {
                              var2 = var2 != 0 | ((mm) ((Object) var3)).a((ah) (this), (byte) 79) ? 1 : 0;
                              var3 = var3.field_b;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      this.g((byte) -104);
                      if (this.h((byte) -127)) {
                        this.e(0, -6904);
                        this.l((byte) 52);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    L19: {
                      fieldTemp$6 = this.field_qb;
                      this.field_qb = this.field_qb + 1;
                      if (fieldTemp$6 >= 5) {
                        this.field_qb = 0;
                        var2 = 0;
                        var3 = dj.field_e.field_lb.b((byte) 26);
                        L20: while (true) {
                          if (!(var3 instanceof mm)) {
                            L21: {
                              L22: {
                                if (this.field_nb) {
                                  break L22;
                                } else {
                                  if (var2 == 0) {
                                    break L22;
                                  } else {
                                    this.c(0, this.field_D >> -1028351582);
                                    break L21;
                                  }
                                }
                              }
                              if (!this.field_nb) {
                                break L21;
                              } else {
                                if (var2 == 0) {
                                  this.c(0, this.field_D);
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            L23: {
                              stackIn_29_0 = this;

                              if (var2 == 0) {
                                stackIn_30_0 = this;
                                stackIn_30_1 = 0;
                                break L23;
                              } else {
                                stackIn_30_0 = this;
                                stackIn_30_1 = 1;
                                break L23;
                              }
                            }
                            ((ah) (this)).field_nb = stackIn_30_1 != 0;
                            break L19;
                          } else {
                            var2 = var2 != 0 | ((mm) ((Object) var3)).a((ah) (this), (byte) 108) ? 1 : 0;
                            var3 = var3.field_b;
                            continue L20;
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                    this.g((byte) 113);
                    if (this.h((byte) 126)) {
                      this.e(0, -6904);
                      this.l((byte) 52);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L2;
          }
          return;
        } else {
          if ((this.field_F ^ -1) != -3) {
            return;
          } else {
            L24: {
              if (-3 + cg.field_h[2] != this.field_G) {
                break L24;
              } else {
                this.field_N = 0;
                break L24;
              }
            }
            return;
          }
        }
    }

    final void k(int param0) {
        if (param0 != 0) {
            return;
        }
        this.o(-6253);
    }

    ah(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        this.field_nb = false;
        this.field_ub = 61;
        this.field_cb = null;
        this.field_lb = 0;
        this.field_rb = 0;
        this.field_kb = false;
        this.field_ib = false;
        this.field_hb = false;
        this.field_ob = false;
        this.field_vb = 0;
        vn discarded$0 = new vn(48, 48);
        this.field_lb = pb.a(so.field_a, 200, 1);
        this.field_jb = new int[61];
        this.field_gb = new int[61];
        this.i((byte) 79);
        this.field_qb = pb.a(so.field_a, 5, 1);
        if (this.t(10)) {
            this.field_db = 49 - -pb.a(so.field_a, 4, 1);
        } else {
            this.field_db = pb.a(so.field_a, 3, 1) + 26;
        }
    }

    final void f(byte param0) {
        if (param0 != -85) {
            this.k(76);
        }
        this.field_J = true;
        this.e(2, param0 + -6819);
        this.field_G = 2;
    }

    final boolean a(boolean param0, boolean param1, int param2, int param3) {
        fb var5;
        kd var6;
        int var7;
        L0: {
          var7 = ZombieDawn.field_J;
          if (param2 < -83) {
            break L0;
          } else {
            this.field_hb = true;
            break L0;
          }
        }
        var5 = this.a((byte) -74, param3, 10);
        L1: while (true) {
          if (var5 == null) {
            return false;
          } else {
            L2: {
              if (!(var5 instanceof kd)) {
                break L2;
              } else {
                var6 = (kd) ((Object) var5);
                if (var6 == null) {
                  break L2;
                } else {
                  L3: {
                    if (param0) {
                      break L3;
                    } else {
                      if ((var6.field_F ^ -1) == -9) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6.x(87)) {
                      break L4;
                    } else {
                      if (!(this instanceof we)) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!var6.field_hb) {
                    L5: {
                      if (param1) {
                        break L5;
                      } else {
                        if (0 != (dj.field_e.field_H.a(var6.f(237239984), this.a(true), this.f(237239984), (byte) -91, false, var6.a(true)) ^ -1)) {
                          break L5;
                        } else {
                          if (0 != (dj.field_e.field_H.a(var6.f(237239984) + -48, this.a(true), -48 + this.f(237239984), (byte) -109, false, var6.a(true)) ^ -1)) {
                            break L5;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    return true;
                  } else {
                    var5 = this.e((byte) 32);
                    continue L1;
                  }
                }
              }
            }
            var5 = this.e((byte) 32);
            continue L1;
          }
        }
    }

    final void a(nc param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = param0.field_m + -this.a(true);
            var4 = param0.field_q + -this.f(param1 ^ -237213750);
            if (param1 == -26246) {
              L1: {
                if (-102401 >= (var4 * var4 + var3_int * var3_int ^ -1)) {
                  stackIn_5_0 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  break L1;
                }
              }
              L2: {
                var5 = stackIn_5_0;
                if (this.field_cb == param0) {
                  if (var5 != 0) {
                    break L2;
                  } else {
                    this.field_cb = null;
                    this.e(0, param1 ^ 31858);
                    this.l((byte) 52);
                    break L2;
                  }
                } else {
                  if (this.field_cb == null) {
                    if (var5 != 0) {
                      this.a(param0, (byte) -124);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ah.W(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void q(int param0) {
        if (param0 <= 5) {
            this.c(22, 55, 42);
        }
        this.e(0, -6904);
    }

    abstract void l(byte param0);

    void o(int param0) {
        if (param0 != -6253) {
            return;
        }
        this.e(18, -6904);
        this.b(-27598);
        this.d(0);
        if (!(0 >= this.field_z)) {
            dj.field_e.field_J[-1 + this.field_z] = dj.field_e.field_J[-1 + this.field_z] - 1;
        }
    }

    public static void u(int param0) {
        field_tb = null;
        field_bb = null;
        if (param0 < 21) {
            field_bb = (String) null;
        }
    }

    private final void i(byte param0) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = 99 % ((param0 - 0) / 50);
        int var3 = this.a(true);
        int var4 = this.f(237239984);
        for (var5 = 0; var5 < this.field_ub + -1; var5++) {
            this.field_jb[var5] = qd.field_a[var5] + var3;
            this.field_gb[var5] = var4 + qd.field_f[var5];
        }
        this.field_jb[this.field_ub - 1] = var3;
        this.field_gb[-1 + this.field_ub] = var4;
    }

    final boolean t(int param0) {
        int stackIn_35_0 = 0;
        int var2;
        int var3;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 == 10) {
            break L0;
          } else {
            this.r(4);
            break L0;
          }
        }
        var2 = this.field_t;
        if (var2 != 0) {
          L1: {
            L2: {
              if ((var2 ^ -1) == -2) {
                break L2;
              } else {
                if (var2 == 2) {
                  break L2;
                } else {
                  L3: {
                    if ((var2 ^ -1) == -4) {
                      break L3;
                    } else {
                      if (-5 == (var2 ^ -1)) {
                        break L3;
                      } else {
                        if (5 == var2) {
                          break L3;
                        } else {
                          if (6 == var2) {
                            return true;
                          } else {
                            if (7 != var2) {
                              if (8 == var2) {
                                return true;
                              } else {
                                if (var2 == 9) {
                                  return false;
                                } else {
                                  if (10 != var2) {
                                    if (-12 == (var2 ^ -1)) {
                                      return false;
                                    } else {
                                      L4: {
                                        if ((var2 ^ -1) == -13) {
                                          break L4;
                                        } else {
                                          if ((var2 ^ -1) != -14) {
                                            if (var2 != 14) {
                                              if ((var2 ^ -1) == -16) {
                                                return true;
                                              } else {
                                                if (var2 == 16) {
                                                  return true;
                                                } else {
                                                  if ((var2 ^ -1) == -19) {
                                                    return true;
                                                  } else {
                                                    if ((var2 ^ -1) == -20) {
                                                      return true;
                                                    } else {
                                                      if (20 != var2) {
                                                        L5: {
                                                          if ((var2 ^ -1) != -22) {
                                                            if (-28 == (var2 ^ -1)) {
                                                              break L5;
                                                            } else {
                                                              if (-31 == (var2 ^ -1)) {
                                                                break L5;
                                                              } else {
                                                                if (29 != var2) {
                                                                  return true;
                                                                } else {
                                                                  stackIn_35_0 = 0;
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            break L5;
                                                          }
                                                        }
                                                        return false;
                                                      } else {
                                                        return true;
                                                      }
                                                    }
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
                                      }
                                      return true;
                                    }
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                    }
                  }
                  return true;
                }
              }
            }
            stackIn_35_0 = 0;
            break L1;
          }
          return stackIn_35_0 != 0;
        } else {
          return false;
        }
    }

    abstract void a(wk param0, int param1);

    void a(nc param0, byte param1) {
        if (-19 == (this.field_F ^ -1) || 20 == this.field_F || this.field_F == 16 || (this.field_F ^ -1) == -3) {
            return;
        }
        try {
            this.e(16, -6904);
            this.field_cb = param0;
            int var3_int = -89 % ((param1 - -53) / 54);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ah.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void r(int param0) {
        this.e(param0, param0 ^ -6884);
    }

    static {
        field_bb = "PHANTOM";
    }
}
