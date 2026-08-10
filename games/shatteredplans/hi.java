/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi implements uj {
    private fs field_w;
    static String field_d;
    static qr field_o;
    private int field_x;
    private int field_j;
    private pf field_l;
    private dc field_m;
    private int field_t;
    private mn field_c;
    static vr field_a;
    private pf field_u;
    private pf field_k;
    private int field_r;
    private int[] field_f;
    private wf[] field_e;
    private int[] field_q;
    private int[] field_n;
    private int[] field_i;
    private boolean field_h;
    private boolean field_p;
    private int[] field_v;
    private int[][] field_s;
    private boolean field_b;
    private boolean[] field_y;
    private int field_g;

    private final void d(byte param0) {
        int var2;
        co var3;
        int var4;
        int var5;
        sd var6;
        int var7;
        int var8;
        fs var9;
        int var10;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 > 26) {
            break L0;
          } else {
            var9 = (fs) null;
            this.a((fs) null, (byte) 115);
            break L0;
          }
        }
        var3 = (co) ((Object) this.field_l.d(0));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            var4 = 0;
            var5 = 0;
            var6 = (sd) ((Object) this.field_w.field_i.d(0));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (var6 != var3.field_n.field_R) {
                    var4++;
                    var6 = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                    continue L2;
                  } else {
                    var5 = 1;
                    break L3;
                  }
                }
              }
              if (var5 != 0) {
                L4: {
                  if (this.field_y[var4]) {
                    break L4;
                  } else {
                    var2 = var3.field_i + -var3.field_n.field_x;
                    if (0 < var2) {
                      q.field_Ab[var3.field_n.field_p] = 0;
                      if (var3.field_n.field_x > var3.field_n.field_N) {
                        this.field_n[var4] = this.field_n[var4] - (var3.field_n.field_x - var3.field_n.field_N);
                        if (0 <= this.field_n[var4]) {
                          if (var2 > this.field_i[var4]) {
                            L5: {
                              var3.field_n.field_J = var3.field_n.field_J + this.field_i[var4];
                              var2 = var2 - this.field_i[var4];
                              bk.field_a.a((byte) -113, new qa(var3.field_n, this.field_i[var4]));
                              if (this.field_m.field_o.field_i) {
                                var10 = 0;
                                var7 = var10;
                                L6: while (true) {
                                  if (var10 >= this.field_i.length) {
                                    break L5;
                                  } else {
                                    this.field_i[var10] = 0;
                                    var10++;
                                    continue L6;
                                  }
                                }
                              } else {
                                this.field_i[var4] = 0;
                                break L5;
                              }
                            }
                            if (var2 <= this.field_n[var4]) {
                              this.field_n[var4] = this.field_n[var4] - var2;
                              kq.field_c[var3.field_n.field_p] = kq.field_c[var3.field_n.field_p] + var2;
                              break L4;
                            } else {
                              this.a(var4, 71, var6);
                              break L4;
                            }
                          } else {
                            L7: {
                              if (this.field_m.field_o.field_i) {
                                var7 = 0;
                                L8: while (true) {
                                  if (this.field_i.length <= var7) {
                                    break L7;
                                  } else {
                                    this.field_i[var7] = this.field_i[var7] - var2;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_i[var4] = this.field_i[var4] - var2;
                                break L7;
                              }
                            }
                            var3.field_n.field_J = var3.field_n.field_J + var2;
                            bk.field_a.a((byte) -113, new qa(var3.field_n, var2));
                            break L4;
                          }
                        } else {
                          this.a(var4, 100, var6);
                          break L4;
                        }
                      } else {
                        L9: {
                          if (var2 > this.field_i[var4]) {
                            L10: {
                              var3.field_n.field_J = var3.field_n.field_J + this.field_i[var4];
                              var2 = var2 - this.field_i[var4];
                              bk.field_a.a((byte) -113, new qa(var3.field_n, this.field_i[var4]));
                              if (this.field_m.field_o.field_i) {
                                var10 = 0;
                                var7 = var10;
                                L11: while (true) {
                                  if (var10 >= this.field_i.length) {
                                    break L10;
                                  } else {
                                    this.field_i[var10] = 0;
                                    var10++;
                                    continue L11;
                                  }
                                }
                              } else {
                                this.field_i[var4] = 0;
                                break L10;
                              }
                            }
                            if (var2 <= this.field_n[var4]) {
                              this.field_n[var4] = this.field_n[var4] - var2;
                              kq.field_c[var3.field_n.field_p] = kq.field_c[var3.field_n.field_p] + var2;
                              break L9;
                            } else {
                              this.a(var4, 71, var6);
                              break L9;
                            }
                          } else {
                            L12: {
                              if (this.field_m.field_o.field_i) {
                                var7 = 0;
                                L13: while (true) {
                                  if (this.field_i.length <= var7) {
                                    break L12;
                                  } else {
                                    this.field_i[var7] = this.field_i[var7] - var2;
                                    var7++;
                                    continue L13;
                                  }
                                }
                              } else {
                                this.field_i[var4] = this.field_i[var4] - var2;
                                break L12;
                              }
                            }
                            var3.field_n.field_J = var3.field_n.field_J + var2;
                            bk.field_a.a((byte) -113, new qa(var3.field_n, var2));
                            break L9;
                          }
                        }
                        var3 = (co) ((Object) this.field_l.a((byte) -71));
                        continue L1;
                      }
                    } else {
                      q.field_Ab[var3.field_n.field_p] = var3.field_n.field_x + -var3.field_i;
                      this.field_n[var4] = this.field_n[var4] - (-var3.field_n.field_N + var3.field_i);
                      if (this.field_n[var4] >= 0) {
                        break L4;
                      } else {
                        this.a(var4, -52, var6);
                        break L4;
                      }
                    }
                  }
                }
                var3 = (co) ((Object) this.field_l.a((byte) -71));
                continue L1;
              } else {
                throw new RuntimeException("Star to be garrisoned (" + var3.field_n.field_I + ") doesn't appear to be in any of the AI's territories.");
              }
            }
          }
        }
    }

    private final void j(int param0) {
        int var2;
        Object var3;
        sd var3_ref;
        ln[] var4;
        int var5;
        int var6;
        ln var7;
        int var8;
        int var9;
        var3 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_n = new int[this.field_w.field_i.e(0)];
        this.field_i = new int[this.field_w.field_i.e(0)];
        this.field_y = new boolean[this.field_w.field_i.e(0)];
        var4 = this.field_m.field_g.field_e;
        var5 = -23 % ((-64 - param0) / 50);
        var6 = 0;
        L0: while (true) {
          if (var4.length <= var6) {
            L1: {
              if (this.field_m.field_o.field_i) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= this.field_i.length) {
                    break L1;
                  } else {
                    this.field_i[var2] = this.field_w.field_m.field_x;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var3_ref = (sd) ((Object) this.field_w.field_i.d(0));
                var2 = 0;
                L3: while (true) {
                  if (var2 >= this.field_i.length) {
                    break L1;
                  } else {
                    this.field_i[var2] = var3_ref.field_x;
                    var3_ref = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            return;
          } else {
            L4: {
              var7 = var4[var6];
              if (var7.field_y != this.field_w) {
                break L4;
              } else {
                if (var7.field_x <= var7.field_N) {
                  break L4;
                } else {
                  q.field_Ab[var7.field_p] = var7.field_x - var7.field_N;
                  if (var7.field_J < q.field_Ab[var7.field_p]) {
                    throw new RuntimeException(var7.field_I + ": available=" + q.field_Ab[var7.field_p] + ", garrison_next=" + var7.field_J);
                  } else {
                    var3_ref = (sd) ((Object) this.field_w.field_i.d(0));
                    var8 = 0;
                    var2 = 0;
                    L5: while (true) {
                      L6: {
                        if (var2 >= this.field_n.length) {
                          break L6;
                        } else {
                          if (var7.field_R != var3_ref) {
                            var3_ref = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                            var2++;
                            continue L5;
                          } else {
                            var8 = 1;
                            this.field_n[var2] = this.field_n[var2] + q.field_Ab[var7.field_p];
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        throw new RuntimeException("Star owned by " + this.field_w.field_t + " is not in any of its Territories: " + var7.field_I);
                      } else {
                        var6++;
                        continue L0;
                      }
                    }
                  }
                }
              }
            }
            q.field_Ab[var7.field_p] = 0;
            var6++;
            continue L0;
          }
        }
    }

    private final void b(int param0) {
        int var2;
        wf[] var3_ref_wf__;
        int var3;
        int var4_int;
        wf[] var4;
        int var5;
        wf var5_ref_wf;
        wf var6;
        int var7;
        ln var8;
        int var9;
        sd var10;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 7270) {
            break L0;
          } else {
            var10 = (sd) null;
            this.a((sd) null, -28, (byte) 100);
            break L0;
          }
        }
        var3_ref_wf__ = this.field_e;
        var4_int = 0;
        L1: while (true) {
          if (var3_ref_wf__.length <= var4_int) {
            var4 = this.field_e;
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4.length) {
                return;
              } else {
                var6 = var4[var5];
                if (var6 instanceof ac) {
                  var3 = 0;
                  var2 = var6.field_n.field_p;
                  var7 = 0;
                  L3: while (true) {
                    if (2 <= var7) {
                      if (-1 > (kq.field_c[var2] ^ -1)) {
                        throw new RuntimeException(this.field_w.field_t + " has run out of available fleets, but has not yet met its defender allocation at " + var6.field_n.field_I + ".");
                      } else {
                        var5++;
                        continue L2;
                      }
                    } else {
                      var8 = var6.field_n.field_R.j(param0 ^ 23379);
                      L4: while (true) {
                        if (var8 == null) {
                          var3 = 1;
                          var7++;
                          continue L3;
                        } else {
                          L5: {
                            if (var6.field_n == var8) {
                              break L5;
                            } else {
                              if (0 == q.field_Ab[var8.field_p]) {
                                break L5;
                              } else {
                                L6: {
                                  if (var3 != 0) {
                                    break L6;
                                  } else {
                                    if (no.field_f[var8.field_p]) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (kq.field_c[var2] >= q.field_Ab[var8.field_p]) {
                                  this.a(q.field_Ab[var8.field_p], (byte) 114, var6.field_n, var8);
                                  kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var8.field_p];
                                  q.field_Ab[var8.field_p] = 0;
                                  break L5;
                                } else {
                                  this.a(kq.field_c[var2], (byte) 102, var6.field_n, var8);
                                  q.field_Ab[var8.field_p] = q.field_Ab[var8.field_p] - kq.field_c[var2];
                                  kq.field_c[var2] = 0;
                                  var5++;
                                  continue L2;
                                }
                              }
                            }
                          }
                          var8 = var6.field_n.field_R.h(-23410);
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          } else {
            var5_ref_wf = var3_ref_wf__[var4_int];
            if (var5_ref_wf instanceof ac) {
              var2 = var5_ref_wf.field_n.field_p;
              if (kq.field_c[var2] < q.field_Ab[var2]) {
                q.field_Ab[var2] = q.field_Ab[var2] - kq.field_c[var2];
                kq.field_c[var2] = 0;
                var4_int++;
                continue L1;
              } else {
                kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var2];
                q.field_Ab[var2] = 0;
                var4_int++;
                continue L1;
              }
            } else {
              var4_int++;
              continue L1;
            }
          }
        }
    }

    private final void h(int param0) {
        ln var3 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_l.a(0);
        if (param0 != 100) {
            this.a(62);
        }
        sd var2 = (sd) ((Object) this.field_w.field_i.d(0));
        while (var2 != null) {
            var3 = var2.j(param0 ^ 18257);
            while (var3 != null) {
                this.field_l.a((byte) -113, new co(var3, this.field_m.field_o.field_l, no.field_f));
                var3 = var2.h(-23410);
            }
            var2 = (sd) ((Object) this.field_w.field_i.a((byte) -71));
        }
    }

    public final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        sd var6_ref_sd;
        int var6;
        int var7;
        ac var8;
        int var9;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_w.field_i.g(-74)) {
          bk.field_a.a(0);
          ed.field_g.a(0);
          vj.field_E.a(0);
          km.field_u = null;
          no.field_b = false;
          mr.field_f = false;
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_x) {
              this.j(114);
              this.i(15401);
              this.d(114);
              this.h(100);
              this.e(0);
              this.c(-30426);
              this.g(115);
              this.d((byte) 46);
              this.g((byte) -70);
              this.b(true, 0);
              var2 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 >= this.field_n.length) {
                  var3 = 0;
                  var3 = var2;
                  L2: while (true) {
                    if (0 >= var2) {
                      L3: {
                        this.b(7270);
                        this.f((byte) 127);
                        if (param0 <= -3) {
                          break L3;
                        } else {
                          this.b((byte) 56);
                          break L3;
                        }
                      }
                      L4: {
                        this.e((byte) -44);
                        if (this.field_m.a(ed.field_g, this.field_w, -6, bk.field_a, vj.field_E)) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      this.field_m.a(ed.field_g, 0, bk.field_a, vj.field_E);
                      return;
                    } else {
                      this.b(false, 0);
                      var2 = 0;
                      var4 = 0;
                      L5: while (true) {
                        if (var4 >= this.field_n.length) {
                          if (var3 != var2) {
                            var3 = var2;
                            continue L2;
                          } else {
                            var4 = 1;
                            var5 = 0;
                            var6_ref_sd = (sd) ((Object) this.field_w.field_i.d(0));
                            L6: while (true) {
                              if (var6_ref_sd == null) {
                                L7: {
                                  var2 = 0;
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    if (this.field_m.field_o.field_i) {
                                      this.c((byte) 35);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var6 = 0;
                                L8: while (true) {
                                  if (this.field_n.length <= var6) {
                                    if (-1 > (var2 ^ -1)) {
                                      throw new RuntimeException(this.field_w.field_t + " hasn't allocated any more idle fleets this loop, even though there are DefendTasks.");
                                    } else {
                                      continue L2;
                                    }
                                  } else {
                                    var2 = var2 + this.field_n[var6];
                                    var2 = var2 + this.field_i[var6];
                                    var6++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var7 = 0;
                                var8 = (ac) ((Object) this.field_u.d(0));
                                L9: while (true) {
                                  if (var8 == null) {
                                    L10: {
                                      if (-1 <= (var7 ^ -1)) {
                                        this.a(var6_ref_sd, var5, (byte) -122);
                                        break L10;
                                      } else {
                                        var4 = 0;
                                        break L10;
                                      }
                                    }
                                    var5++;
                                    var6_ref_sd = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                                    continue L6;
                                  } else {
                                    L11: {
                                      if (var6_ref_sd == var8.field_n.field_R) {
                                        var7++;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var8 = (ac) ((Object) this.field_u.a((byte) -71));
                                    continue L9;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var2 = var2 + this.field_n[var4];
                          var2 = var2 + this.field_i[var4];
                          var4++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  var2 = var2 + this.field_n[var4];
                  var2 = var2 + this.field_i[var4];
                  var4++;
                  continue L1;
                }
              }
            } else {
              no.field_f[var2] = false;
              q.field_Ab[var2] = 0;
              kq.field_c[var2] = 0;
              og.field_c[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void c(byte param0) {
        fs stackIn_8_0 = null;
        fs stackIn_8_1 = null;
        fs stackIn_25_0 = null;
        fs stackIn_25_1 = null;
        int var2;
        ln[] var3;
        int var3_int;
        int var4;
        int var5;
        int var6;
        ln[] var6_ref_ln__;
        int var7;
        int var9;
        ln var10;
        int var11;
        int var12;
        ln[] var13;
        ln var14;
        ln var15;
        ln[] var16;
        ln var17;
        ln[] var18;
        ln[] var19;
        ln var20;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_m.field_o.field_i) {
          return;
        } else {
          L0: {
            var2 = 0;
            var13 = this.field_m.field_g.field_e;
            if (param0 > 4) {
              break L0;
            } else {
              this.i(15);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var13.length <= var4) {
              L2: {
                if (0 != var2) {
                  var3 = new ln[var2];
                  var4 = 0;
                  var16 = this.field_m.field_g.field_e;
                  var6 = 0;
                  L3: while (true) {
                    if (var6 >= var16.length) {
                      L4: while (true) {
                        if (0 >= this.field_i[0]) {
                          var5 = 0;
                          L5: while (true) {
                            if (var5 >= this.field_i.length) {
                              break L2;
                            } else {
                              this.field_i[var5] = 0;
                              var5++;
                              continue L5;
                            }
                          }
                        } else {
                          var19 = var3;
                          var12 = 0;
                          var6 = var12;
                          L6: while (true) {
                            if (var12 >= var19.length) {
                              continue L4;
                            } else {
                              var20 = var19[var12];
                              this.a(-1, var20, 1);
                              this.field_i[0] = this.field_i[0] - 1;
                              if (this.field_i[0] == 0) {
                                continue L4;
                              } else {
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var17 = var16[var6];
                      stackIn_25_0 = this.field_w;
                      stackIn_25_1 = var17.field_y;
                      if (stackIn_25_0 == stackIn_25_1) {
                        var18 = var17.field_D;
                        var9 = 0;
                        L7: while (true) {
                          if (var9 < var18.length) {
                            var10 = var18[var9];
                            if (var10.field_y != this.field_w) {
                              var3[var4] = var17;
                              var4++;
                              var6++;
                              continue L3;
                            } else {
                              var9++;
                              continue L7;
                            }
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  this.a(-1, this.field_w.field_m.field_q, this.field_i[0]);
                  var3_int = 0;
                  L8: while (true) {
                    if (this.field_i.length <= var3_int) {
                      break L2;
                    } else {
                      this.field_i[var3_int] = 0;
                      var3_int++;
                      continue L8;
                    }
                  }
                }
              }
              return;
            } else {
              var14 = var13[var4];
              stackIn_8_0 = this.field_w;
              stackIn_8_1 = var14.field_y;
              if (stackIn_8_0 == stackIn_8_1) {
                var6_ref_ln__ = var14.field_D;
                var7 = 0;
                L9: while (true) {
                  if (var7 < var6_ref_ln__.length) {
                    var15 = var6_ref_ln__[var7];
                    if (this.field_w != var15.field_y) {
                      var2++;
                      var4++;
                      continue L1;
                    } else {
                      var7++;
                      continue L9;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(ac param0, boolean param1, int param2) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sd var4 = null;
        RuntimeException var4_ref = null;
        sd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln[] var10_ref_ln__ = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        ln[] var14 = null;
        ln var15 = null;
        ln[] var16 = null;
        ln var17 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = param0.field_n.field_R;
            var6 = 0;
            var7 = 0;
            var8 = 99 % ((param2 - 37) / 48);
            var4 = (sd) ((Object) this.field_w.field_i.d(0));
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var4 == var5) {
                    var7 = 1;
                    break L2;
                  } else {
                    var6++;
                    var4 = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                    continue L1;
                  }
                }
              }
              if (var7 == 0) {
                throw new RuntimeException("DefendTask's star does not appear to be in AI's territory: " + param0.field_n.field_I + ".");
              } else {
                L3: {
                  var9 = (-this.field_t + 50) * param0.field_i / 250 + param0.field_i;
                  if (!param1) {
                    break L3;
                  } else {
                    L4: {
                      if (mr.field_f) {
                        var14 = param0.field_n.field_D;
                        var10_ref_ln__ = var14;
                        var11 = 0;
                        L5: while (true) {
                          if (var14.length <= var11) {
                            break L4;
                          } else {
                            L6: {
                              var15 = var14[var11];
                              var17 = var15;
                              var17 = var15;
                              if (var15 != km.field_u) {
                                break L6;
                              } else {
                                if (var15.field_y != null) {
                                  L7: {
                                    param0.field_i = param0.field_i - var15.field_x;
                                    if (-1 < (param0.field_i ^ -1)) {
                                      param0.field_i = 0;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var9 = param0.field_i + (50 + -this.field_t) * param0.field_i / 250;
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var11++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L8: {
                      if ((this.field_w.field_u[2] ^ -1) > -6) {
                        break L8;
                      } else {
                        if (mr.field_f) {
                          break L8;
                        } else {
                          var16 = param0.field_n.field_D;
                          var11 = 0;
                          L9: while (true) {
                            if (var16.length <= var11) {
                              break L8;
                            } else {
                              L10: {
                                var17 = var16[var11];
                                if (var17.field_y == null) {
                                  break L10;
                                } else {
                                  if (this.field_w != var17.field_y) {
                                    if ((int)((double)var9 * 0.8) > var17.field_x) {
                                      break L10;
                                    } else {
                                      if (-11 > (var17.field_x ^ -1)) {
                                        L11: {
                                          this.a((byte) -82, var17);
                                          param0.field_i = param0.field_i - var17.field_x;
                                          if (-1 < (param0.field_i ^ -1)) {
                                            param0.field_i = 0;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        var9 = (50 - this.field_t) * param0.field_i / 250 + param0.field_i;
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var11++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    if (5 > this.field_w.field_u[0]) {
                      break L3;
                    } else {
                      if (!no.field_b) {
                        if (param0.field_n.field_u) {
                          break L3;
                        } else {
                          L12: {
                            if (var9 > this.field_n[var6]) {
                              break L12;
                            } else {
                              if (-21 > (var9 ^ -1)) {
                                break L12;
                              } else {
                                break L3;
                              }
                            }
                          }
                          this.a(param0.field_n, 31308);
                          if (-2 > (param0.field_i ^ -1)) {
                            param0.field_i = param0.field_i / 2;
                            var9 = param0.field_i - -(param0.field_i * (-this.field_t + 50) / 250);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (0 != var9) {
                  L13: {
                    if (param1) {
                      break L13;
                    } else {
                      var9 = var9 * 3 / 10;
                      if (var9 != 0) {
                        break L13;
                      } else {
                        var9 = 1;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var9 <= this.field_n[var6]) {
                      this.field_n[var6] = this.field_n[var6] - var9;
                      kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + var9;
                      var9 = 0;
                      break L14;
                    } else {
                      L15: {
                        if ((this.field_n[var6] ^ -1) >= -1) {
                          break L15;
                        } else {
                          var9 = var9 - this.field_n[var6];
                          kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + this.field_n[var6];
                          this.field_n[var6] = 0;
                          break L15;
                        }
                      }
                      L16: {
                        if (this.field_i[var6] >= var9) {
                          var10 = var9;
                          if (this.field_m.field_o.field_i) {
                            var11 = 0;
                            L17: while (true) {
                              if (this.field_i.length <= var11) {
                                break L16;
                              } else {
                                this.field_i[var11] = this.field_i[var11] - var9;
                                var11++;
                                continue L17;
                              }
                            }
                          } else {
                            this.field_i[var6] = this.field_i[var6] - var9;
                            break L16;
                          }
                        } else {
                          var9 = var9 - this.field_i[var6];
                          var10 = this.field_i[var6];
                          if (this.field_m.field_o.field_i) {
                            var11 = 0;
                            L18: while (true) {
                              if (this.field_i.length <= var11) {
                                break L16;
                              } else {
                                this.field_i[var11] = 0;
                                var11++;
                                continue L18;
                              }
                            }
                          } else {
                            this.field_i[var6] = 0;
                            break L16;
                          }
                        }
                      }
                      if ((var10 ^ -1) < -1) {
                        this.a(-1, param0.field_n, var10);
                        og.field_c[param0.field_n.field_p] = og.field_c[param0.field_n.field_p] + var10;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param0.b((byte) -62);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4_ref = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var4_ref);

            stackIn_75_1 = new StringBuilder().append("hi.AA(");

            if (param0 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L19;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L19;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(fs param0, int param1) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.field_p) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = this.field_q[param0.field_x];
                if (param1 == 7686) {
                  break L1;
                } else {
                  this.field_w = (fs) null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var7 = var3_int;
                  if (var7 == 1) {
                    break L3;
                  } else {
                    if (-7 != (var7 ^ -1)) {
                      L4: {
                        if ((var7 ^ -1) == -3) {
                          break L4;
                        } else {
                          if (7 == var7) {
                            break L4;
                          } else {
                            if (3 != var7) {
                              if ((var7 ^ -1) == -5) {
                                var4 = 3;
                                break L2;
                              } else {
                                if (5 != var7) {
                                  if (0 != (var7 ^ -1)) {
                                    if (1 == (var7 ^ -1)) {
                                      var4 = 5;
                                      break L2;
                                    } else {
                                      if (2 != (var7 ^ -1)) {
                                        var4 = -1;
                                        break L2;
                                      } else {
                                        var4 = 6;
                                        var6 = this.field_m.field_m[this.field_m.field_r - 2];
                                        var5 = this.field_m.field_m[-1 + this.field_m.field_r];
                                        if ((this.field_w.field_x ^ -1) == (var5 ^ -1)) {
                                          break L2;
                                        } else {
                                          if (param0.field_x == var5) {
                                            break L2;
                                          } else {
                                            if ((3 * this.field_m.field_D[var6] ^ -1) <= (2 * this.field_m.field_D[var5] ^ -1)) {
                                              break L2;
                                            } else {
                                              var4 = 5;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var4 = 4;
                                    break L2;
                                  }
                                } else {
                                  var4 = 13;
                                  break L2;
                                }
                              }
                            } else {
                              var4 = 2;
                              break L2;
                            }
                          }
                        }
                      }
                      var4 = 1;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4 = 0;
                break L2;
              }
              L5: {
                if (var4 == -1) {
                  break L5;
                } else {
                  this.field_c.a(0, (byte) -125, param0, this.field_w, var4);
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (this.field_w.field_h[param0.field_x]) {
                    break L7;
                  } else {
                    if (0 <= var3_int) {
                      break L7;
                    } else {
                      this.field_c.a((byte) -63, this.field_w, param0);
                      this.b(true);
                      break L6;
                    }
                  }
                }
                break L6;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var3);

            stackIn_41_1 = new StringBuilder().append("hi.SA(");

            if (param0 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L8;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(int param0) {
        int var2;
        ac var3;
        kl var3_ref;
        ac var4;
        kl var4_ref;
        int var5;
        int[] var6;
        int[] var10;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var3 = (ac) ((Object) this.field_u.d(0));
        L0: while (true) {
          if (var3 == null) {
            if (param0 >= 93) {
              var3_ref = (kl) ((Object) this.field_k.d(0));
              L1: while (true) {
                if (var3_ref == null) {
                  this.field_e = new wf[var2];
                  var6 = new int[var2];
                  var10 = var6;
                  var2 = 0;
                  var4 = (ac) ((Object) this.field_u.d(0));
                  L2: while (true) {
                    if (var4 == null) {
                      var4_ref = (kl) ((Object) this.field_k.d(0));
                      L3: while (true) {
                        if (var4_ref == null) {
                          ak.a(var10, -43, this.field_e);
                          return;
                        } else {
                          this.field_e[var2] = (wf) ((Object) var4_ref);
                          var6[var2] = var4_ref.field_l;
                          var2++;
                          var4_ref = (kl) ((Object) this.field_k.a((byte) -71));
                          continue L3;
                        }
                      }
                    } else {
                      this.field_e[var2] = (wf) ((Object) var4);
                      var6[var2] = var4.field_l;
                      var2++;
                      var4 = (ac) ((Object) this.field_u.a((byte) -71));
                      continue L2;
                    }
                  }
                } else {
                  var3_ref.field_l = (var3_ref.field_j << 1381374448) * this.field_j / (var3_ref.field_i * 100);
                  var2++;
                  var3_ref = (kl) ((Object) this.field_k.a((byte) -71));
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            var3.field_l = (var3.field_j << -318601488) * (-this.field_j + 100) / (var3.field_i * 100);
            var2++;
            var3 = (ac) ((Object) this.field_u.a((byte) -71));
            continue L0;
          }
        }
    }

    private final void d(int param0) {
        sd var2_ref_sd;
        int var3;
        int var4;
        int var5;
        int var2;
        int var6;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          this.field_s = new int[this.field_w.field_i.e(0)][4];
          if (param0 >= 104) {
            break L0;
          } else {
            this.field_w = (fs) null;
            break L0;
          }
        }
        L1: {
          if (this.field_m.field_o.field_i) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 4) {
                break L1;
              } else {
                var3 = 1 + -this.field_w.field_m.field_u[var2] - -this.field_w.field_m.field_u[this.field_w.field_m.field_w[0]];
                var6 = 0;
                var4 = var6;
                L3: while (true) {
                  if (var6 >= this.field_s.length) {
                    var2++;
                    continue L2;
                  } else {
                    this.field_s[var6][var2] = var3;
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var2_ref_sd = (sd) ((Object) this.field_w.field_i.d(0));
            var3 = 0;
            L4: while (true) {
              if (this.field_s.length <= var3) {
                break L1;
              } else {
                var4 = 0;
                L5: while (true) {
                  if (var4 >= 4) {
                    var2_ref_sd = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                    var3++;
                    continue L4;
                  } else {
                    this.field_s[var3][var4] = -var2_ref_sd.field_u[var4] + 1 + var2_ref_sd.field_u[var2_ref_sd.field_w[0]];
                    var4++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_a = null;
        if (param0 > -42) {
            field_a = (vr) null;
        }
        field_d = null;
        field_o = null;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        qr stackIn_11_0 = null;
        qr stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qr stackIn_18_0 = null;
        qr stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        qr stackIn_23_0 = null;
        qr stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int var5;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          nj.a(param1 ^ -27033);
          if (param1 == -26671) {
            break L0;
          } else {
            field_d = (String) null;
            break L0;
          }
        }
        L1: {
          if (0 <= a.field_j) {
            nm.field_c.field_z = re.a(vn.field_A, 4371, new String[]{Integer.toString(a.field_j)});
            break L1;
          } else {
            nm.field_c.field_z = null;
            break L1;
          }
        }
        L2: {
          L3: {
            stackIn_11_0 = ia.field_j;

            if (!param0) {
              break L3;
            } else {
              stackIn_11_0 = (qr) ((Object) stackIn_11_0);

              if (param2) {
                break L3;
              } else {
                stackIn_11_0 = (qr) ((Object) stackIn_11_0);

                if (on.field_b) {
                  break L3;
                } else {
                  stackIn_11_0 = (qr) ((Object) stackIn_11_0);

                  if (np.field_a != null) {
                    break L3;
                  } else {
                    stackIn_11_0 = (qr) ((Object) stackIn_11_0);

                    if (he.field_p != null) {
                      break L3;
                    } else {
                      stackIn_12_0 = (qr) ((Object) stackIn_11_0);
                      stackIn_12_1 = 1;
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackIn_12_0 = (qr) ((Object) stackIn_11_0);
          stackIn_12_1 = 0;
          break L2;
        }
        L4: {
          L5: {
            ((qr) (Object) stackIn_12_0).a(stackIn_12_1 != 0, -20429);
            stackIn_18_0 = se.field_i;

            if (!param0) {
              break L5;
            } else {
              stackIn_18_0 = (qr) ((Object) stackIn_18_0);

              if (param2) {
                break L5;
              } else {
                stackIn_18_0 = (qr) ((Object) stackIn_18_0);

                if (on.field_b) {
                  break L5;
                } else {
                  stackIn_18_0 = (qr) ((Object) stackIn_18_0);

                  if (null != np.field_a) {
                    break L5;
                  } else {
                    stackIn_18_0 = (qr) ((Object) stackIn_18_0);

                    if (null != he.field_p) {
                      break L5;
                    } else {
                      stackIn_19_0 = (qr) ((Object) stackIn_18_0);
                      stackIn_19_1 = 1;
                      break L4;
                    }
                  }
                }
              }
            }
          }
          stackIn_19_0 = (qr) ((Object) stackIn_18_0);
          stackIn_19_1 = 0;
          break L4;
        }
        L6: {
          L7: {
            ((qr) (Object) stackIn_19_0).a(stackIn_19_1 != 0, -20429);
            stackIn_23_0 = so.field_v;

            if (!param0) {
              break L7;
            } else {
              stackIn_23_0 = (qr) ((Object) stackIn_23_0);

              if (param2) {
                break L7;
              } else {
                stackIn_23_0 = (qr) ((Object) stackIn_23_0);

                if (!on.field_b) {
                  break L7;
                } else {
                  stackIn_24_0 = (qr) ((Object) stackIn_23_0);
                  stackIn_24_1 = 1;
                  break L6;
                }
              }
            }
          }
          stackIn_24_0 = (qr) ((Object) stackIn_23_0);
          stackIn_24_1 = 0;
          break L6;
        }
        L8: {
          ((qr) (Object) stackIn_24_0).a(stackIn_24_1 != 0, param1 ^ 10210);
          bc.field_g.field_d.f(false);
          if (0 == vm.field_Ab.field_rb) {
            break L8;
          } else {
            s.field_d = true;
            break L8;
          }
        }
        L9: {
          if (gb.field_m.field_rb == 0) {
            break L9;
          } else {
            L10: {
              if (hm.field_o) {
                break L10;
              } else {
                if (0 < es.field_m) {
                  break L10;
                } else {
                  L11: {
                    if ((bs.field_b ^ -1) > -3) {
                      break L11;
                    } else {
                      if (di.field_p[12]) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  uc.field_B = true;
                  break L9;
                }
              }
            }
            gd.a(param3, 1);
            break L9;
          }
        }
        L12: {
          if (rq.field_b.field_rb == 0) {
            break L12;
          } else {
            L13: {
              if (1 != nl.field_a.length) {
                break L13;
              } else {
                if (nl.field_a[0] == qk.field_x) {
                  break L13;
                } else {
                  qk.field_x = nl.field_a[0];
                  break L13;
                }
              }
            }
            ei.a(param3, qk.field_x, mk.field_d, true, false, 0);
            break L12;
          }
        }
        L14: {
          if (li.field_d.field_rb != 0) {
            on.field_b = false;
            break L14;
          } else {
            break L14;
          }
        }
    }

    private final void c(int param0) {
        int var3;
        ln var4;
        int var8;
        ln[] var9;
        fs stackIn_5_0 = null;
        fs stackIn_5_1 = null;
        ln[] var5;
        int var6;
        ln var7;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_k.a(0);
        if (param0 == -30426) {
          var9 = this.field_m.field_g.field_e;
          var3 = 0;
          L0: while (true) {
            if (var9.length <= var3) {
              return;
            } else {
              var4 = var9[var3];
              stackIn_5_0 = var4.field_y;
              stackIn_5_1 = this.field_w;
              if (stackIn_5_0 != stackIn_5_1) {
                L1: {
                  if (var4.field_y == null) {
                    break L1;
                  } else {
                    if (!this.field_w.field_h[var4.field_y.field_x]) {
                      break L1;
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                }
                var5 = var4.field_D;
                var6 = 0;
                L2: while (true) {
                  if (var6 < var5.length) {
                    var7 = var5[var6];
                    if (var7.field_y != this.field_w) {
                      var6++;
                      continue L2;
                    } else {
                      this.field_k.a((byte) -113, new kl(var4, this.field_w.field_i, this.field_s, this.field_w, this.field_m.field_x, this.field_g, this.field_m));
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void b(boolean param0, int param1) {
        wf[] var3;
        int var4;
        wf var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = this.field_e;
        var4 = param1;
        L0: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (!(var5 instanceof ac)) {
              if (var5 instanceof kl) {
                this.a((byte) -124, (kl) ((Object) var5), param0);
                var4++;
                continue L0;
              } else {
                throw new RuntimeException("prioritizedTasks contains invalid task for Star " + var5.field_n.field_I + ".");
              }
            } else {
              this.a((ac) ((Object) var5), param0, 95);
              var4++;
              continue L0;
            }
          }
        }
    }

    public final int a(boolean param0) {
        if (param0) {
            this.field_c = (mn) null;
        }
        return 8;
    }

    private final void a(int param0, byte param1, ln param2, ln param3) {
        fs stackIn_37_0 = null;
        fs stackIn_37_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param2 != null) {
                  if (param0 == 0) {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    if (-1 < (param0 ^ -1)) {
                      throw new RuntimeException();
                    } else {
                      if (this.field_w == param3.field_y) {
                        L2: {
                          if (param2.field_R == param3.field_R) {
                            break L2;
                          } else {
                            if (param3.b(param2, (byte) 10)) {
                              break L2;
                            } else {
                              throw new RuntimeException(this.field_w.field_t + " is attempting an invalid move from " + param3.field_I + " to " + param2.field_I + ".");
                            }
                          }
                        }
                        var5 = (mg) ((Object) param3.field_s.c(-128));
                        L3: while (true) {
                          L4: {
                            if (var5 == null) {
                              break L4;
                            } else {
                              L5: {
                                if (var5.field_G != this.field_w) {
                                  break L5;
                                } else {
                                  if (param2 != var5.field_y) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var5 = (mg) ((Object) param3.field_s.b(32));
                              continue L3;
                            }
                          }
                          L6: {
                            if (var5 == null) {
                              break L6;
                            } else {
                              if (var5.field_z > param0) {
                                var5.field_z = var5.field_z - param0;
                                var5.field_y.field_J = var5.field_y.field_J + param0;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                var5.b((byte) -82);
                                var5.a(16);
                                var5.d(true);
                                var5.field_y.field_J = var5.field_y.field_J + var5.field_z;
                                param0 = param0 - var5.field_z;
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (param1 >= 86) {
                              break L7;
                            } else {
                              this.b(true, 49);
                              break L7;
                            }
                          }
                          if (param0 != 0) {
                            if (param3.field_J < param0) {
                              throw new RuntimeException("Trying to move " + param0 + " fleets from " + param3.field_I + " to " + param2.field_I + " but garrison_next is only " + param3.field_J + ".");
                            } else {
                              param3.field_J = param3.field_J - param0;
                              var5 = (mg) ((Object) ed.field_g.d(0));
                              L8: while (true) {
                                L9: {
                                  if (var5 == null) {
                                    break L9;
                                  } else {
                                    stackIn_37_0 = this.field_w;
                                    stackIn_37_1 = var5.field_G;
                                    L10: {
                                      if (stackIn_37_0 != stackIn_37_1) {
                                        break L10;
                                      } else {
                                        if (var5.field_y != param3) {
                                          break L10;
                                        } else {
                                          if (param2 != var5.field_B) {
                                            break L10;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    var5 = (mg) ((Object) ed.field_g.a((byte) -71));
                                    continue L8;
                                  }
                                }
                                if (var5 != null) {
                                  var5.field_z = var5.field_z + param0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  var5 = new mg(param3, param2, param0);
                                  ed.field_g.a((byte) -113, var5);
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      } else {
                        throw new RuntimeException(this.field_w.field_t + " is attempting to move fleets from a system it does not own: " + param3.field_I + ".");
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5_ref = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var5_ref);

            stackIn_50_1 = new StringBuilder().append("hi.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L11;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

            if (param3 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L12;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L12;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_51_0), stackIn_54_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    private final int a(boolean param0, ln[] param1, ln param2, int param3, int param4) {
        int dupTemp$0 = 0;
        fs stackIn_4_0 = null;
        fs stackIn_4_1 = null;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        sd var10_ref = null;
        int var11 = 0;
        ln[] var12 = null;
        int var13 = 0;
        ln var14 = null;
        int var15 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            var11 = 0;
            L1: while (true) {
              L2: {
                if (var11 >= param1.length) {
                  break L2;
                } else {
                  stackIn_4_0 = param1[var11].field_y;
                  stackIn_4_1 = this.field_w;
                  L3: {
                    if (stackIn_4_0 != stackIn_4_1) {
                      break L3;
                    } else {
                      if (-1 != (q.field_Ab[param1[var11].field_p] ^ -1)) {
                        L4: {
                          var7 = 0;
                          if (param0) {
                            var12 = param1[var11].field_D;
                            var13 = 0;
                            L5: while (true) {
                              if (var12.length <= var13) {
                                L6: {
                                  if (!param0) {
                                    break L6;
                                  } else {
                                    if (-2 == (var7 ^ -1)) {
                                      break L6;
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                                L7: {
                                  var8 = q.field_Ab[param1[var11].field_p];
                                  var10 = null;
                                  if (var8 > param4) {
                                    var8 = param4;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var9 = 0;
                                var10_ref = (sd) ((Object) this.field_w.field_i.d(0));
                                L8: while (true) {
                                  if (var10_ref == null) {
                                    break L4;
                                  } else {
                                    if (var10_ref != param1[var11].field_R) {
                                      var9++;
                                      var10_ref = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                                      continue L8;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              } else {
                                var14 = var12[var13];
                                if (this.field_w != var14.field_y) {
                                  L9: {
                                    L10: {
                                      if (var14.field_y == null) {
                                        break L10;
                                      } else {
                                        if (!this.field_w.field_h[var14.field_y.field_x]) {
                                          break L10;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var7++;
                                    break L9;
                                  }
                                  var13++;
                                  continue L5;
                                } else {
                                  var13++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            L11: {
                              if (!param0) {
                                break L11;
                              } else {
                                if (-2 == (var7 ^ -1)) {
                                  break L11;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L12: {
                              var8 = q.field_Ab[param1[var11].field_p];
                              var10 = null;
                              if (var8 > param4) {
                                var8 = param4;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var9 = 0;
                            var10_ref = (sd) ((Object) this.field_w.field_i.d(0));
                            L13: while (true) {
                              if (var10_ref == null) {
                                break L4;
                              } else {
                                if (var10_ref != param1[var11].field_R) {
                                  var9++;
                                  var10_ref = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                                  continue L13;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        if (var10_ref == null) {
                          throw new RuntimeException("Cannot find territory of star " + this.field_w.field_t + " wants to attack from: " + param1[var11].field_I + ".");
                        } else {
                          L14: {
                            if (this.field_n[var9] >= var8) {
                              break L14;
                            } else {
                              var8 = this.field_n[var9];
                              break L14;
                            }
                          }
                          this.a(var8, (byte) 115, param2, param1[var11]);
                          dupTemp$0 = param1[var11].field_p;
                          q.field_Ab[dupTemp$0] = q.field_Ab[dupTemp$0] - var8;
                          var6_int = var6_int + var8;
                          this.field_n[var9] = this.field_n[var9] - var8;
                          if (var6_int != param4) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var11++;
                  continue L1;
                }
              }
              L15: {
                if (param3 > 64) {
                  break L15;
                } else {
                  field_a = (vr) null;
                  break L15;
                }
              }
              stackIn_50_0 = var6_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var6);

            stackIn_53_1 = new StringBuilder().append("hi.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L16;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_56_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');

            if (param2 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L17;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L17;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_54_0), stackIn_57_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_50_0;
    }

    public final void a(fs param0, byte param1) {
        int var3_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = this.field_q[param0.field_x];
              var7 = var3_int;
              if (-1 == var7) {
                var4 = 10;
                break L1;
              } else {
                if (var7 != -2) {
                  if ((var7 ^ -1) == 2) {
                    var4 = 12;
                    var6 = this.field_m.field_m[-2 + this.field_m.field_r];
                    var5 = this.field_m.field_m[this.field_m.field_r + -1];
                    if (var5 == this.field_w.field_x) {
                      break L1;
                    } else {
                      if (var5 == this.field_r) {
                        break L1;
                      } else {
                        if (this.field_m.field_D[var5] * 2 > this.field_m.field_D[var6] * 3) {
                          var4 = 11;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    var4 = -1;
                    break L1;
                  }
                } else {
                  var4 = 11;
                  break L1;
                }
              }
            }
            L2: {
              if ((var4 ^ -1) != 0) {
                this.field_c.a(0, (byte) -109, param0, this.field_w, var4);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == -42) {
                break L3;
              } else {
                this.e((byte) -14);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("hi.LA(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
    }

    private final void a(ln param0, int param1) {
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        qm var4 = null;
        try {
          L0: {
            if (this.field_w.field_u[0] >= 5) {
              if (!no.field_b) {
                if (this.field_w == param0.field_y) {
                  if (!param0.field_u) {
                    L1: {
                      vj.field_E.a((byte) -113, new qm(0, this.field_w, param0));
                      no.field_b = true;
                      qo.field_e = param0;
                      if (param1 == 31308) {
                        break L1;
                      } else {
                        this.field_t = -21;
                        break L1;
                      }
                    }
                    break L0;
                  } else {
                    throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net in a system that already has one: " + param0.field_I);
                  }
                } else {
                  throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net in a system it doesn't own: " + param0.field_I);
                }
              } else {
                var3 = null;
                var4 = (qm) ((Object) vj.field_E.d(0));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_o == 0) {
                        var3 = var4;
                        break L3;
                      } else {
                        var4 = (qm) ((Object) vj.field_E.a((byte) -71));
                        continue L2;
                      }
                    }
                  }
                  if (var3 != null) {
                    throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net it has already used." + " Already deployed at star " + ((qm) (var3)).field_q.field_I + ", now trying to deploy ot " + param0.field_I);
                  } else {
                    throw new RuntimeException(this.field_w.field_t + "'s deployedDefensiveNet variable incorrectly set to true.");
                  }
                }
              }
            } else {
              throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Defensive Net it doesn't have at star " + param0.field_I);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = var3;

            stackIn_21_1 = new StringBuilder().append("hi.H(");

            if (param0 == null) {
              stackIn_22_0 = stackIn_21_0;
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = stackIn_21_0;
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, fs param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        fs stackIn_52_0 = null;
        fs stackIn_52_1 = null;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        fs var5 = null;
        fs var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        int var11 = 0;
        ln var11_ref_ln = null;
        int var12 = 0;
        ln[] var13 = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.field_x;
              if (this.field_w == param1) {
                break L1;
              } else {
                if (this.field_w.field_h[var4_int]) {
                  break L1;
                } else {
                  if (0 == (this.field_m.field_w & 1 << var4_int)) {
                    if (this.field_g == var4_int) {
                      stackIn_12_0 = 6;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L2: {
                        var5 = this.field_m.field_v[this.field_m.field_m[-1 + this.field_m.field_r]];
                        var6 = this.field_m.field_v[this.field_m.field_m[-2 + this.field_m.field_r]];
                        if (0 != (this.field_g ^ -1)) {
                          break L2;
                        } else {
                          if (param1 == var5) {
                            stackIn_17_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var7 = 0;
                      var8 = 0;
                      var9_ref_ln__ = this.field_m.field_g.field_e;
                      var10_int = 0;
                      L3: while (true) {
                        if (var9_ref_ln__.length <= var10_int) {
                          var7 = var7 - -(var7 * (50 + -this.field_j) / 250);
                          if (var7 <= var8 * 2) {
                            L4: {
                              if (0 == (this.field_g ^ -1)) {
                                break L4;
                              } else {
                                if (param1.field_h[this.field_g]) {
                                  stackIn_38_0 = 7;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              if ((this.field_g ^ -1) != 0) {
                                break L5;
                              } else {
                                if (!var5.field_h[var4_int]) {
                                  break L5;
                                } else {
                                  stackIn_42_0 = 2;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                }
                              }
                            }
                            L6: {
                              if (-1 == this.field_g) {
                                break L6;
                              } else {
                                if (var5 != param1) {
                                  break L6;
                                } else {
                                  if (this.field_g == var5.field_x) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (this.field_w.field_x != this.field_g) {
                                        stackIn_49_0 = -2;
                                        break L7;
                                      } else {
                                        stackIn_49_0 = -3;
                                        break L7;
                                      }
                                    }
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  }
                                }
                              }
                            }
                            L8: {
                              if ((this.field_g ^ -1) != 0) {
                                break L8;
                              } else {
                                stackIn_52_0 = (fs) (var6);
                                stackIn_52_1 = (fs) (param1);
                                if (stackIn_52_0 != stackIn_52_1) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (var5 == this.field_w) {
                                      stackIn_56_0 = -3;
                                      break L9;
                                    } else {
                                      stackIn_56_0 = -2;
                                      break L9;
                                    }
                                  }
                                  decompiledRegionSelector0 = 8;
                                  break L0;
                                }
                              }
                            }
                            L10: {
                              var9 = this.field_m.field_D[var4_int];
                              var9 = var9 + var9 * (50 + -this.field_j) / 250;
                              if (var7 >= var8) {
                                break L10;
                              } else {
                                if (this.field_m.field_D[this.field_w.field_x] * 2 <= 3 * var9) {
                                  break L10;
                                } else {
                                  stackIn_60_0 = 3;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                }
                              }
                            }
                            var10 = oe.field_g[this.field_w.field_x];
                            var11 = param0;
                            if (param2 == 3) {
                              var12 = 0;
                              L11: while (true) {
                                if (this.field_m.field_g.field_e.length <= var12) {
                                  L12: {
                                    if ((var11 ^ -1) <= -6) {
                                      break L12;
                                    } else {
                                      if (var11 >= param0) {
                                        break L12;
                                      } else {
                                        stackIn_75_0 = 4;
                                        decompiledRegionSelector0 = 11;
                                        break L0;
                                      }
                                    }
                                  }
                                  stackIn_77_0 = -3;
                                  decompiledRegionSelector0 = 12;
                                  break L0;
                                } else {
                                  if (jf.field_e[var12]) {
                                    L13: {
                                      if (oe.field_g[var4_int][var12] <= var10[var12]) {
                                        var11--;
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    var12++;
                                    continue L11;
                                  } else {
                                    var12++;
                                    continue L11;
                                  }
                                }
                              }
                            } else {
                              stackIn_63_0 = 120;
                              decompiledRegionSelector0 = 10;
                              break L0;
                            }
                          } else {
                            stackIn_33_0 = -1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          }
                        } else {
                          var11_ref_ln = var9_ref_ln__[var10_int];
                          if (this.field_w == var11_ref_ln.field_y) {
                            var12 = 0;
                            var13 = var11_ref_ln.field_D;
                            var14 = 0;
                            L14: while (true) {
                              if (var14 >= var13.length) {
                                L15: {
                                  if (var12 != 0) {
                                    var8 = var8 + var11_ref_ln.field_x;
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                var10_int++;
                                continue L3;
                              } else {
                                var15 = var13[var14];
                                if (var15.field_y == param1) {
                                  var12 = 1;
                                  var7 = var7 + var15.field_x;
                                  var14++;
                                  continue L14;
                                } else {
                                  var14++;
                                  continue L14;
                                }
                              }
                            }
                          } else {
                            var10_int++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    stackIn_8_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_5_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var4);

            stackIn_80_1 = new StringBuilder().append("hi.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L16;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L16;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_38_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_49_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_56_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_60_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_63_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_75_0;
                              } else {
                                return stackIn_77_0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, sd param2) {
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        qa var6 = null;
        ln var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = null;
            var5 = 0;
            var6_int = 57 / ((26 - param1) / 33);
            var7 = param2.j(18229);
            L1: while (true) {
              if (var7 == null) {
                var6 = (qa) ((Object) bk.field_a.d(0));
                L2: while (true) {
                  if (var6 == null) {
                    var6_ref = param2.j(18229);
                    L3: while (true) {
                      if (var6_ref == null) {
                        this.a(-1, (ln) (var4), param2.field_x);
                        this.field_i[param0] = 0;
                        this.field_n[param0] = 0;
                        this.field_y[param0] = true;
                        break L0;
                      } else {
                        L4: {
                          if (var6_ref == var4) {
                            break L4;
                          } else {
                            this.a(var6_ref.field_x, (byte) 110, (ln) (var4), var6_ref);
                            break L4;
                          }
                        }
                        var6_ref = param2.h(-23410);
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (param2 == var6.field_u.field_R) {
                        var6.b((byte) -79);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var6 = (qa) ((Object) bk.field_a.a((byte) -71));
                    continue L2;
                  }
                }
              } else {
                kq.field_c[var7.field_p] = 0;
                q.field_Ab[var7.field_p] = 0;
                var7.field_J = var7.field_x;
                var8 = 0;
                var9 = 0;
                L6: while (true) {
                  if ((var9 ^ -1) <= -5) {
                    L7: {
                      if (var5 >= var8) {
                        break L7;
                      } else {
                        var4 = var7;
                        var5 = var8;
                        break L7;
                      }
                    }
                    var7 = param2.h(-23410);
                    continue L1;
                  } else {
                    var8 = var8 + var7.field_G[var9];
                    var9++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = var4;

            stackIn_24_1 = new StringBuilder().append("hi.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = stackIn_24_0;
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = stackIn_24_0;
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    private final void a(int param0, ln param1, int param2) {
        qa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if ((param2 ^ -1) != param0) {
              param1.field_J = param1.field_J + param2;
              var4 = (qa) ((Object) bk.field_a.d(0));
              L1: while (true) {
                if (var4 == null) {
                  bk.field_a.a((byte) -113, new qa(param1, param2));
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4.field_u != param1) {
                    var4 = (qa) ((Object) bk.field_a.a((byte) -71));
                    continue L1;
                  } else {
                    var4.field_v = var4.field_v + param2;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("hi.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
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

    public final void a(byte param0) {
        int var2;
        int var3;
        int var4_int;
        fs[] var4;
        fs var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        ac var11;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!this.field_w.field_i.g(param0 ^ 82)) {
            break L0;
          } else {
            this.field_p = false;
            break L0;
          }
        }
        if (!this.field_p) {
          return;
        } else {
          if (this.field_m.field_o.field_j) {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                var11 = (ac) null;
                this.a((ac) null, false, -5);
                break L1;
              }
            }
            this.field_r = -1;
            var2 = this.field_m.field_m[-1 + this.field_m.field_r];
            var3 = this.field_m.field_D[var2];
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= this.field_m.field_r) {
                L3: {
                  var4 = this.field_m.field_x.b(0);
                  if (1 != var4.length) {
                    this.field_g = -1;
                    break L3;
                  } else {
                    this.field_g = var4[0].field_x;
                    break L3;
                  }
                }
                L4: {
                  this.b(true);
                  if (-1 == this.field_r) {
                    break L4;
                  } else {
                    L5: {
                      var5 = this.field_m.field_v[this.field_r];
                      if (-1 > (this.field_f[this.field_r] ^ -1)) {
                        break L5;
                      } else {
                        L6: {
                          var9 = this.field_q[this.field_r];
                          if ((var9 ^ -1) != 0) {
                            if (-2 == var9) {
                              var6 = 8;
                              break L6;
                            } else {
                              if (var9 != -3) {
                                var6 = -1;
                                break L6;
                              } else {
                                var6 = 9;
                                var7 = this.field_m.field_m[-1 + this.field_m.field_r];
                                var8 = this.field_m.field_m[this.field_m.field_r + -2];
                                if (var7 == this.field_w.field_x) {
                                  break L6;
                                } else {
                                  if (this.field_r != var7) {
                                    if (this.field_m.field_D[var8] * 3 < this.field_m.field_D[var7] * 2) {
                                      var6 = 8;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          } else {
                            var6 = 7;
                            break L6;
                          }
                        }
                        if ((var6 ^ -1) != 0) {
                          this.field_c.a(0, (byte) -109, var5, this.field_w, var6);
                          this.field_f[this.field_r] = rg.a(6, 3, (byte) 104);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_c.a((byte) -63, this.field_w, var5);
                    break L4;
                  }
                }
                return;
              } else {
                if (var2 == var4_int) {
                  this.field_v[var4_int] = 3;
                  var4_int++;
                  continue L2;
                } else {
                  if (2 * this.field_m.field_D[var4_int] >= var3) {
                    this.field_v[var4_int] = this.field_v[var4_int] - 1;
                    var4_int++;
                    continue L2;
                  } else {
                    this.field_v[var4_int] = 0;
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (-1 > (param0 ^ -1)) {
              if (!eo.a(param0, 7433)) {
                L1: {
                  if (param2 == -11) {
                    break L1;
                  } else {
                    field_d = (String) null;
                    break L1;
                  }
                }
                var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
                L2: while (true) {
                  var4 = param1.nextInt();
                  if (var4 >= var3_int) {
                    continue L2;
                  } else {
                    stackIn_11_0 = jf.a(param0, var4, -102);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> -1847283936);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("hi.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_11_0;
        }
    }

    private final int[] b(fs param0, int param1) {
        int stackIn_8_0 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        boolean[] var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -91) {
                break L1;
              } else {
                this.field_e = (wf[]) null;
                break L1;
              }
            }
            var17 = new int[this.field_x];
            var16 = var17;
            var15 = var16;
            var3 = var15;
            var4 = new boolean[this.field_x];
            var5 = this.field_m.field_g.field_e;
            var6 = 0;
            L2: while (true) {
              if (var6 >= this.field_x) {
                var6 = 1;
                L3: while (true) {
                  if (var6 == 0) {
                    stackIn_24_0 = (int[]) (var15);
                    break L0;
                  } else {
                    var6 = 0;
                    var7 = 0;
                    L4: while (true) {
                      if (this.field_x <= var7) {
                        continue L3;
                      } else {
                        L5: {
                          if (!var4[var7]) {
                            break L5;
                          } else {
                            var4[var7] = false;
                            var8 = var5[var7];
                            var9 = 1 + var17[var7];
                            var10 = var8.field_D;
                            var11 = 0;
                            L6: while (true) {
                              if (var11 >= var10.length) {
                                break L5;
                              } else {
                                var12 = var10[var11];
                                var13 = var12.field_p;
                                if (var9 < var17[var13]) {
                                  var17[var13] = var9;
                                  var6 = 1;
                                  var4[var13] = true;
                                  var11++;
                                  continue L6;
                                } else {
                                  var11++;
                                  continue L6;
                                }
                              }
                            }
                          }
                        }
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                L7: {
                  if (var5[var6].field_y != param0) {
                    stackIn_8_0 = 0;
                    break L7;
                  } else {
                    stackIn_8_0 = 1;
                    break L7;
                  }
                }
                L8: {
                  var7 = stackIn_8_0;
                  var4[var6] = var7 != 0;
                  stackIn_10_0 = (int[]) (var15);

                  stackIn_10_1 = var6;

                  if (var7 == 0) {
                    stackIn_11_0 = (int[]) ((Object) stackIn_10_0);
                    stackIn_11_1 = stackIn_10_1;
                    stackIn_11_2 = 2147483647;
                    break L8;
                  } else {
                    stackIn_11_0 = (int[]) ((Object) stackIn_10_0);
                    stackIn_11_1 = stackIn_10_1;
                    stackIn_11_2 = 0;
                    break L8;
                  }
                }
                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3_ref);

            stackIn_27_1 = new StringBuilder().append("hi.N(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    public final void a(int param0) {
        int var2;
        fs[] var3;
        int var4;
        fs var5;
        int var7;
        int var6;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 63 % ((-36 - param0) / 38);
        var3 = this.field_m.field_v;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (this.field_w != var5) {
              var6 = vc.a((byte) -39, 2) + 14;
              this.field_c.a(0, (byte) -27, var5, this.field_w, var6);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void f(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object var2;
        int var3;
        int var4;
        int var5;
        Object var6;
        ac var6_ref;
        qm var6_ref2;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ln var13;
        lo var14;
        ln var15;
        ln[] var16;
        ln var17;
        var6 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (5 > this.field_w.field_u[1]) {
          return;
        } else {
          L0: {
            var2 = null;
            var4 = -92 / ((82 - param0) / 44);
            var3 = 2147483647;
            var5 = 2147483647;
            if (!this.field_m.field_o.field_i) {
              var6_ref = (ac) ((Object) this.field_u.d(0));
              L1: while (true) {
                if (var6_ref == null) {
                  break L0;
                } else {
                  L2: {
                    var15 = var6_ref.field_n;
                    if (var15.field_L != 0) {
                      break L2;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      var10 = 0;
                      L3: while (true) {
                        L4: {
                          if (var10 >= 4) {
                            break L4;
                          } else {
                            var9 = var9 + var15.field_G[var10];
                            if (var15.field_R.field_u[var10] >= var15.field_G[var10]) {
                              var10++;
                              continue L3;
                            } else {
                              var8 = 1;
                              break L4;
                            }
                          }
                        }
                        if (var8 == 0) {
                          L5: {
                            if (var2 == null) {
                              break L5;
                            } else {
                              if (var9 < var3) {
                                break L5;
                              } else {
                                if (var3 != var9) {
                                  break L2;
                                } else {
                                  if (var6_ref.field_i >= var5) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          var5 = var6_ref.field_i;
                          var2 = var15;
                          var3 = var9;
                          break L2;
                        } else {
                          var6_ref = (ac) ((Object) this.field_u.a((byte) -71));
                          continue L1;
                        }
                      }
                    }
                  }
                  var6_ref = (ac) ((Object) this.field_u.a((byte) -71));
                  continue L1;
                }
              }
            } else {
              var6_ref = (ac) ((Object) this.field_u.d(0));
              var14 = this.field_w.field_m;
              L6: while (true) {
                if (var6_ref == null) {
                  break L0;
                } else {
                  var13 = var6_ref.field_n;
                  stackIn_7_0 = var13.field_L ^ -1;
                  stackIn_7_1 = -1;
                  L7: {
                    if (stackIn_7_0 != stackIn_7_1) {
                      break L7;
                    } else {
                      var9 = 0;
                      var10 = 0;
                      var11 = 0;
                      L8: while (true) {
                        L9: {
                          if (var11 >= 4) {
                            break L9;
                          } else {
                            var10 = var10 + var13.field_G[var11];
                            if ((var14.field_u[var11] ^ -1) > (var13.field_G[var11] ^ -1)) {
                              var9 = 1;
                              break L9;
                            } else {
                              var11++;
                              continue L8;
                            }
                          }
                        }
                        if (var9 != 0) {
                          break L7;
                        } else {
                          L10: {
                            if (var2 == null) {
                              break L10;
                            } else {
                              if (var10 < var3) {
                                break L10;
                              } else {
                                if (var10 != var3) {
                                  break L7;
                                } else {
                                  if (var5 > var6_ref.field_i) {
                                    break L10;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var3 = var10;
                          var5 = var6_ref.field_i;
                          var2 = var13;
                          break L7;
                        }
                      }
                    }
                  }
                  var6_ref = (ac) ((Object) this.field_u.a((byte) -71));
                  continue L6;
                }
              }
            }
          }
          var16 = this.field_m.field_g.field_e;
          var7 = 0;
          L11: while (true) {
            if (var16.length <= var7) {
              L12: {
                if (var2 == null) {
                  break L12;
                } else {
                  var6_ref2 = new qm(1, this.field_w, (ln) (var2));
                  vj.field_E.a((byte) -113, var6_ref2);
                  break L12;
                }
              }
              return;
            } else {
              var17 = var16[var7];
              var2 = var17;
              var2 = var17;
              if (var17.field_y == this.field_w) {
                if (!no.field_f[var17.field_p]) {
                  if (var17.field_L == 0) {
                    L13: {
                      var9 = 0;
                      var10 = 0;
                      if (this.field_m.field_o.field_i) {
                        var11 = 0;
                        L14: while (true) {
                          if ((var11 ^ -1) <= -5) {
                            break L13;
                          } else {
                            var10 = var10 + var17.field_G[var11];
                            if ((var17.field_G[var11] ^ -1) < (this.field_w.field_m.field_u[var11] ^ -1)) {
                              var9 = 1;
                              break L13;
                            } else {
                              var11++;
                              continue L14;
                            }
                          }
                        }
                      } else {
                        var11 = 0;
                        L15: while (true) {
                          if ((var11 ^ -1) <= -5) {
                            break L13;
                          } else {
                            var10 = var10 + var17.field_G[var11];
                            if (var17.field_G[var11] > var17.field_R.field_u[var11]) {
                              var9 = 1;
                              break L13;
                            } else {
                              var11++;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    if (var9 == 0) {
                      L16: {
                        if (var2 == null) {
                          break L16;
                        } else {
                          if (var3 > var10) {
                            break L16;
                          } else {
                            if (var10 == var3) {
                              if ((var5 ^ -1) < -1) {
                                break L16;
                              } else {
                                var7++;
                                continue L11;
                              }
                            } else {
                              var7++;
                              continue L11;
                            }
                          }
                        }
                      }
                      var5 = 0;
                      var3 = var10;
                      var2 = var17;
                      var7++;
                      continue L11;
                    } else {
                      var7++;
                      continue L11;
                    }
                  } else {
                    var7++;
                    continue L11;
                  }
                } else {
                  var7++;
                  continue L11;
                }
              } else {
                var7++;
                continue L11;
              }
            }
          }
        }
    }

    private final void e(int param0) {
        ln var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_u.a(param0 + 0);
        sd var6 = (sd) ((Object) this.field_w.field_i.d(0));
        int var3 = param0;
        while (var6 != null) {
            var4 = var6.j(18229);
            while (var4 != null) {
                if (!(!no.field_f[var4.field_p])) {
                    this.field_u.a((byte) -113, new ac(var4, this.field_s[var3], this.field_w.field_h, this.field_m.field_x));
                }
                var4 = var6.h(-23410);
            }
            var3++;
            var6 = (sd) ((Object) this.field_w.field_i.a((byte) -71));
        }
    }

    private final void a(sd param0, int param1, byte param2) {
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ln var5 = null;
        ln[] var5_array = null;
        int var6 = 0;
        ln[] var6_ref_ln__ = null;
        ln var7_ref_ln = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        ln var13 = null;
        ln[] var14 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = param0.j(18229);
            L1: while (true) {
              if (var5 == null) {
                if (-1 == (var4_int ^ -1)) {
                  L2: {
                    this.field_n[param1] = 0;
                    if (!this.field_m.field_o.field_i) {
                      this.a(-1, param0.field_q, this.field_i[param1]);
                      this.field_i[param1] = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var14 = new ln[var4_int];
                  var5_array = var14;
                  var6 = 0;
                  var7_ref_ln = param0.j(18229);
                  L3: while (true) {
                    if (var7_ref_ln == null) {
                      var7 = this.field_n[param1] / var4_int;
                      this.field_e = new wf[var4_int];
                      if (param2 <= -111) {
                        var9 = 0;
                        L4: while (true) {
                          if (var9 >= var14.length) {
                            L5: {
                              this.b(7270);
                              if (!this.field_m.field_o.field_i) {
                                var4_int = var14.length;
                                var7 = this.field_i[param1] / var4_int;
                                var9 = 0;
                                L6: while (true) {
                                  if (var9 >= var14.length) {
                                    break L5;
                                  } else {
                                    L7: {
                                      if (this.field_i[param1] % var4_int != 0) {
                                        stackIn_40_0 = 1;
                                        break L7;
                                      } else {
                                        stackIn_40_0 = 0;
                                        break L7;
                                      }
                                    }
                                    var8 = stackIn_40_0;
                                    this.a(-1, var14[var9], var8 + var7);
                                    this.field_i[param1] = this.field_i[param1] - (var7 - -var8);
                                    var4_int--;
                                    var9++;
                                    continue L6;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                            this.field_e = new wf[]{};
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L8: {
                              this.field_e[var9] = (wf) ((Object) new ac(var14[var9], new int[4], this.field_w.field_h, this.field_m.field_x));
                              if ((this.field_n[param1] % var4_int ^ -1) == -1) {
                                stackIn_32_0 = 0;
                                break L8;
                              } else {
                                stackIn_32_0 = 1;
                                break L8;
                              }
                            }
                            var8 = stackIn_32_0;
                            kq.field_c[var14[var9].field_p] = var7 - -var8;
                            this.field_n[param1] = this.field_n[param1] - (var8 + var7);
                            var4_int--;
                            var9++;
                            continue L4;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      var12 = var7_ref_ln.field_D;
                      var9 = 0;
                      L9: while (true) {
                        L10: {
                          if (var9 >= var12.length) {
                            break L10;
                          } else {
                            var10 = var12[var9];
                            if (var10.field_y != this.field_w) {
                              var5_array[var6] = var7_ref_ln;
                              var6++;
                              break L10;
                            } else {
                              var9++;
                              continue L9;
                            }
                          }
                        }
                        var7_ref_ln = param0.h(-23410);
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var6_ref_ln__ = var5.field_D;
                var7 = 0;
                L11: while (true) {
                  L12: {
                    if (var7 >= var6_ref_ln__.length) {
                      break L12;
                    } else {
                      var13 = var6_ref_ln__[var7];
                      if (this.field_w != var13.field_y) {
                        var4_int++;
                        break L12;
                      } else {
                        var7++;
                        continue L11;
                      }
                    }
                  }
                  var5 = param0.h(-23410);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("hi.A(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L13;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L13;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ',' + param2 + ')');
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

    private final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        kl var8;
        int[] var9;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          oe.field_g = new int[this.field_m.field_r][];
          this.field_r = -1;
          if (param0) {
            break L0;
          } else {
            var8 = (kl) null;
            this.a((byte) 68, (kl) null, false);
            break L0;
          }
        }
        jf.field_e = new boolean[this.field_m.field_g.field_e.length];
        var2 = 0;
        L1: while (true) {
          if (var2 >= oe.field_g.length) {
            var9 = oe.field_g[this.field_w.field_x];
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= this.field_m.field_g.field_e.length) {
                var4 = 0;
                L3: while (true) {
                  if (this.field_m.field_r <= var4) {
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= this.field_m.field_r) {
                        return;
                      } else {
                        var5 = this.field_m.field_m[var4];
                        if ((this.field_q[var5] ^ -1) > -1) {
                          this.field_r = var5;
                          var4++;
                          continue L4;
                        } else {
                          var4++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    this.field_q[var4] = this.a(var3, this.field_m.field_v[var4], 3);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                if (this.field_m.field_g.field_e[var4].field_y != this.field_w) {
                  var5 = 1;
                  var6 = 0;
                  L5: while (true) {
                    L6: {
                      if (var6 >= this.field_m.field_r) {
                        break L6;
                      } else {
                        if ((this.field_w.field_x ^ -1) != (var6 ^ -1)) {
                          if (this.field_w.field_h[var6]) {
                            if (oe.field_g[var6][var4] <= var9[var4]) {
                              var5 = 0;
                              break L6;
                            } else {
                              var6++;
                              continue L5;
                            }
                          } else {
                            var6++;
                            continue L5;
                          }
                        } else {
                          var6++;
                          continue L5;
                        }
                      }
                    }
                    jf.field_e[var4] = var5 != 0;
                    if (var5 != 0) {
                      var3++;
                      var4++;
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  jf.field_e[var4] = false;
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            oe.field_g[var2] = this.b(this.field_m.field_v[var2], -97);
            var2++;
            continue L1;
          }
        }
    }

    final static bi[] a(int param0, byte param1) {
        bi[] var3 = new bi[9];
        bi[] var2 = var3;
        if (param1 != -16) {
            return (bi[]) null;
        }
        var3[4] = gr.a((byte) -52, param0, 64);
        return var2;
    }

    private final void i(int param0) {
        int var3;
        ln var4;
        int var8;
        ln[] var9;
        ln[] var5;
        int var6;
        ln var7;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = this.field_m.field_g.field_e;
        var3 = 0;
        L0: while (true) {
          if (var9.length <= var3) {
            L1: {
              if (param0 == 15401) {
                break L1;
              } else {
                this.field_c = (mn) null;
                break L1;
              }
            }
            return;
          } else {
            var4 = var9[var3];
            no.field_f[var4.field_p] = false;
            if (var4.field_y == this.field_w) {
              var5 = var4.field_D;
              var6 = 0;
              L2: while (true) {
                if (var5.length > var6) {
                  var7 = var5[var6];
                  if (null != var7.field_y) {
                    if (var7.field_y != this.field_w) {
                      if (!this.field_w.field_h[var7.field_y.field_x]) {
                        no.field_f[var4.field_p] = true;
                        var3++;
                        continue L0;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    public final void a(boolean param0, int param1) {
        this.field_p = param0 ? true : false;
        if (param1 != -6861) {
            this.c((byte) 46);
        }
    }

    private final void g(byte param0) {
        int var2;
        co var3;
        int var4;
        int var5;
        ln var6;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = (co) ((Object) this.field_l.d(0));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0 < -40) {
                break L1;
              } else {
                this.field_i = (int[]) null;
                break L1;
              }
            }
            var3 = (co) ((Object) this.field_l.d(0));
            L2: while (true) {
              if (var3 == null) {
                var4 = 0;
                L3: while (true) {
                  if (kq.field_c.length <= var4) {
                    return;
                  } else {
                    kq.field_c[var4] = 0;
                    var4++;
                    continue L3;
                  }
                }
              } else {
                var2 = var3.field_n.field_p;
                var4 = 0;
                var5 = 0;
                L4: while (true) {
                  L5: {
                    if (-3 >= (var5 ^ -1)) {
                      break L5;
                    } else {
                      var6 = var3.field_n.field_R.j(18229);
                      L6: while (true) {
                        if (var6 == null) {
                          var4 = 1;
                          var5++;
                          continue L4;
                        } else {
                          L7: {
                            if (var6 == var3.field_n) {
                              break L7;
                            } else {
                              if (q.field_Ab[var6.field_p] == 0) {
                                break L7;
                              } else {
                                L8: {
                                  if (var4 != 0) {
                                    break L8;
                                  } else {
                                    if (!no.field_f[var6.field_p]) {
                                      break L8;
                                    } else {
                                      var6 = var3.field_n.field_R.h(-23410);
                                      continue L6;
                                    }
                                  }
                                }
                                if (q.field_Ab[var6.field_p] < kq.field_c[var2]) {
                                  this.a(q.field_Ab[var6.field_p], (byte) 103, var3.field_n, var6);
                                  kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var6.field_p];
                                  q.field_Ab[var6.field_p] = 0;
                                  break L7;
                                } else {
                                  this.a(kq.field_c[var2], (byte) 102, var3.field_n, var6);
                                  q.field_Ab[var6.field_p] = q.field_Ab[var6.field_p] - kq.field_c[var2];
                                  kq.field_c[var2] = 0;
                                  break L5;
                                }
                              }
                            }
                          }
                          var6 = var3.field_n.field_R.h(-23410);
                          continue L6;
                        }
                      }
                    }
                  }
                  var3 = (co) ((Object) this.field_l.a((byte) -71));
                  continue L2;
                }
              }
            }
          } else {
            var2 = var3.field_n.field_p;
            if (0 <= kq.field_c[var2]) {
              L9: {
                if (kq.field_c[var2] < q.field_Ab[var2]) {
                  q.field_Ab[var2] = q.field_Ab[var2] - kq.field_c[var2];
                  kq.field_c[var2] = 0;
                  break L9;
                } else {
                  kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var2];
                  q.field_Ab[var2] = 0;
                  break L9;
                }
              }
              var3 = (co) ((Object) this.field_l.a((byte) -71));
              continue L0;
            } else {
              throw new RuntimeException(this.field_m.field_g.field_e[var2].field_I + " has " + kq.field_c[var2] + " fleets assigned to garrison it!");
            }
          }
        }
    }

    private final void e(byte param0) {
        sd stackIn_68_0 = null;
        sd stackIn_68_1 = null;
        sd var2;
        sd var3;
        sd var4_ref_sd;
        int var4;
        Object var5_ref;
        int var5;
        Object var6;
        Object var7;
        int var8;
        int var9_int;
        ln[] var9;
        ln var10_ref_ln;
        int var10;
        int var11;
        ln var12;
        int var13;
        ln[] var14_ref_ln__;
        int var14;
        int var15;
        int var16;
        int var17;
        ln var18;
        int var19;
        ln[] var20;
        Object var21;
        sd var21_ref;
        Object var22;
        sd var22_ref;
        ln var23;
        var22 = null;
        var21 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        if ((this.field_w.field_u[3] ^ -1) > -6) {
          return;
        } else {
          L0: {
            if (50 <= this.field_t) {
              break L0;
            } else {
              if (this.field_j >= 50) {
                break L0;
              } else {
                if (-2 > (this.field_w.field_i.e(0) ^ -1)) {
                  L1: {
                    var22_ref = (sd) ((Object) this.field_w.field_i.d(0));
                    var3 = var22_ref;
                    var21_ref = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                    if (var21_ref.g(-98) > var22_ref.g(107)) {
                      var2 = var22_ref;
                      var3 = var21_ref;
                      break L1;
                    } else {
                      var2 = var21_ref;
                      break L1;
                    }
                  }
                  var4_ref_sd = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                  L2: while (true) {
                    if (var4_ref_sd == null) {
                      var5_ref = null;
                      var6 = null;
                      var7 = null;
                      var9_int = 0;
                      var10_ref_ln = var3.j(18229);
                      L3: while (true) {
                        L4: {
                          if (var10_ref_ln == null) {
                            break L4;
                          } else {
                            if (no.field_f[var10_ref_ln.field_p]) {
                              L5: {
                                L6: {
                                  var8 = var10_ref_ln.field_J;
                                  if (var10_ref_ln.field_u) {
                                    break L6;
                                  } else {
                                    if (var10_ref_ln == qo.field_e) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var8 = var8 * 2;
                                break L5;
                              }
                              L7: {
                                if (var9_int >= var8) {
                                  break L7;
                                } else {
                                  var7 = var10_ref_ln;
                                  var9_int = var8;
                                  break L7;
                                }
                              }
                              var10_ref_ln = var3.h(-23410);
                              continue L3;
                            } else {
                              var5_ref = var10_ref_ln;
                              break L4;
                            }
                          }
                        }
                        L8: {
                          if (var5_ref != null) {
                            break L8;
                          } else {
                            var5_ref = var7;
                            break L8;
                          }
                        }
                        var9_int = -1;
                        var10_ref_ln = var2.j(18229);
                        L9: while (true) {
                          L10: {
                            if (var10_ref_ln == null) {
                              break L10;
                            } else {
                              if (no.field_f[var10_ref_ln.field_p]) {
                                L11: {
                                  L12: {
                                    var8 = var10_ref_ln.field_J;
                                    if (var10_ref_ln.field_u) {
                                      break L12;
                                    } else {
                                      if (qo.field_e != var10_ref_ln) {
                                        break L11;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var8 = var8 * 2;
                                  break L11;
                                }
                                L13: {
                                  if (var8 > var9_int) {
                                    var7 = var10_ref_ln;
                                    var9_int = var8;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var10_ref_ln = var2.h(-23410);
                                continue L9;
                              } else {
                                var6 = var10_ref_ln;
                                break L10;
                              }
                            }
                          }
                          L14: {
                            if (var6 == null) {
                              var6 = var7;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if (var5_ref == null) {
                              break L15;
                            } else {
                              if (var6 == null) {
                                break L15;
                              } else {
                                vj.field_E.a((byte) -113, new qm(3, this.field_w, (ln) (var5_ref), (ln) (var6)));
                                return;
                              }
                            }
                          }
                          throw new RuntimeException("TaskAI has more than one territory but can't find a star in each to link with a Tannhauser");
                        }
                      }
                    } else {
                      L16: {
                        if (var4_ref_sd.g(-115) <= var3.g(-111)) {
                          break L16;
                        } else {
                          var2 = var3;
                          var3 = var4_ref_sd;
                          break L16;
                        }
                      }
                      var4_ref_sd = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                      continue L2;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          var2 = (sd) ((Object) this.field_w.field_i.d(0));
          var3 = (sd) ((Object) this.field_w.field_i.a((byte) -71));
          L17: while (true) {
            if (var3 == null) {
              var5 = 0;
              var6 = null;
              var7 = var2.j(18229);
              L18: while (true) {
                if (var7 == null) {
                  if (var6 == null) {
                    throw new RuntimeException("TaskAI can't find any stars in territory from which to launch a Tannhauser");
                  } else {
                    var7 = null;
                    var8 = 0;
                    var9 = this.field_m.field_g.field_e;
                    var10 = -10 / ((param0 - 13) / 50);
                    var11 = 0;
                    L19: while (true) {
                      if (var11 >= var9.length) {
                        L20: {
                          if (var7 != null) {
                            vj.field_E.a((byte) -113, new qm(3, this.field_w, (ln) (var6), (ln) (var7)));
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        return;
                      } else {
                        var12 = var9[var11];
                        stackIn_68_0 = var12.field_R;
                        stackIn_68_1 = ((ln) (var6)).field_R;
                        if (stackIn_68_0 != stackIn_68_1) {
                          L21: {
                            if (var12.field_y == this.field_w) {
                              break L21;
                            } else {
                              if (null == var12.field_y) {
                                break L21;
                              } else {
                                if (!this.field_w.field_h[var12.field_y.field_x]) {
                                  break L21;
                                } else {
                                  var11++;
                                  continue L19;
                                }
                              }
                            }
                          }
                          L22: {
                            if (var12.field_y != this.field_w) {
                              break L22;
                            } else {
                              if (-91 < (this.field_j ^ -1)) {
                                break L22;
                              } else {
                                var11++;
                                continue L19;
                              }
                            }
                          }
                          var13 = 0;
                          var14_ref_ln__ = var12.field_D;
                          var15 = 0;
                          L23: while (true) {
                            L24: {
                              if (var15 >= var14_ref_ln__.length) {
                                break L24;
                              } else {
                                var23 = var14_ref_ln__[var15];
                                var7 = var23;
                                var7 = var23;
                                if (((ln) (var6)).field_R != var23.field_R) {
                                  var15++;
                                  continue L23;
                                } else {
                                  var13 = 1;
                                  break L24;
                                }
                              }
                            }
                            if (var13 == 0) {
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              L25: while (true) {
                                if (-5 >= (var16 ^ -1)) {
                                  L26: {
                                    if (!this.field_b) {
                                      break L26;
                                    } else {
                                      if (36 == var12.field_p) {
                                        var14 = var14 + this.field_j / 2;
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  L27: {
                                    var15 = var12.field_x;
                                    if (!this.field_h) {
                                      break L27;
                                    } else {
                                      if (var12.field_L == 2) {
                                        L28: {
                                          if (!this.field_m.field_o.field_i) {
                                            var16 = ((ln) (var6)).field_R.field_r;
                                            break L28;
                                          } else {
                                            var16 = this.field_w.field_m.field_r;
                                            break L28;
                                          }
                                        }
                                        L29: {
                                          if (-5 * var12.field_G[0] <= var16) {
                                            break L29;
                                          } else {
                                            var14 -= 100;
                                            break L29;
                                          }
                                        }
                                        if (var12.field_y == null) {
                                          break L27;
                                        } else {
                                          if (var12.field_y.field_x == this.field_g) {
                                            var14 += 100;
                                            break L27;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  L30: {
                                    if (!var12.field_u) {
                                      break L30;
                                    } else {
                                      var15 = var15 * 2;
                                      break L30;
                                    }
                                  }
                                  var20 = var12.field_D;
                                  var17 = 0;
                                  L31: while (true) {
                                    if (var20.length <= var17) {
                                      L32: {
                                        if (1 <= var15) {
                                          break L32;
                                        } else {
                                          var15 = 1;
                                          break L32;
                                        }
                                      }
                                      var16 = (var14 << -1855936592) / var15;
                                      if (var8 < var16) {
                                        var7 = var12;
                                        var8 = var16;
                                        var11++;
                                        continue L19;
                                      } else {
                                        var11++;
                                        continue L19;
                                      }
                                    } else {
                                      var18 = var20[var17];
                                      var7 = var18;
                                      var7 = var18;
                                      if (var18.field_y != this.field_w) {
                                        if (var18.field_y != null) {
                                          var15 = var15 + var18.field_x;
                                          if (!this.field_m.field_o.field_l) {
                                            var15++;
                                            var17++;
                                            continue L31;
                                          } else {
                                            var17++;
                                            continue L31;
                                          }
                                        } else {
                                          var17++;
                                          continue L31;
                                        }
                                      } else {
                                        var17++;
                                        continue L31;
                                      }
                                    }
                                  }
                                } else {
                                  var14 = var14 + (-var2.field_u[var16] + var2.field_u[var2.field_w[0]] + 1) * var12.field_G[var16];
                                  var16++;
                                  continue L25;
                                }
                              }
                            } else {
                              var11++;
                              continue L19;
                            }
                          }
                        } else {
                          var11++;
                          continue L19;
                        }
                      }
                    }
                  }
                } else {
                  L33: {
                    L34: {
                      var4 = ((ln) (var7)).field_x;
                      if (((ln) (var7)).field_u) {
                        break L34;
                      } else {
                        if (qo.field_e == var7) {
                          break L34;
                        } else {
                          break L33;
                        }
                      }
                    }
                    var4 = var4 * 2;
                    break L33;
                  }
                  L35: {
                    if (var4 <= var5) {
                      break L35;
                    } else {
                      var6 = var7;
                      var5 = var4;
                      break L35;
                    }
                  }
                  var7 = var2.h(-23410);
                  continue L18;
                }
              }
            } else {
              L36: {
                if (var3.g(-48) <= var2.g(84)) {
                  break L36;
                } else {
                  var2 = var3;
                  break L36;
                }
              }
              var3 = (sd) ((Object) this.field_w.field_i.a((byte) -71));
              continue L17;
            }
          }
        }
    }

    private final void a(byte param0, ln param1) {
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        qm var4 = null;
        try {
          L0: {
            if (5 > this.field_w.field_u[2]) {
              throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Stellar Bomb it doesn't have at star " + param1.field_I);
            } else {
              if (mr.field_f) {
                var3 = null;
                var4 = (qm) ((Object) vj.field_E.d(param0 ^ -82));
                L1: while (true) {
                  L2: {
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (2 == var4.field_o) {
                        var3 = var4;
                        break L2;
                      } else {
                        var4 = (qm) ((Object) vj.field_E.a((byte) -71));
                        continue L1;
                      }
                    }
                  }
                  if (var3 == null) {
                    throw new RuntimeException(this.field_w.field_t + "'s deployedStellarBomb variable incorrectly set to true.");
                  } else {
                    if (((qm) (var3)).field_q == km.field_u) {
                      throw new RuntimeException(this.field_w.field_t + " is trying to deploy a Stellar Bomb it has already used." + " Already deployed at star " + ((qm) (var3)).field_q.field_I + ", now trying to deploy at " + param1.field_I);
                    } else {
                      throw new RuntimeException(this.field_w.field_t + ": TaskAI.deployStellarBomb: targetStellarBomb is not the star the ProjectUse points at." + " targetStellarBomb: " + km.field_u.field_I + ", bomb.s1: " + ((qm) (var3)).field_q);
                    }
                  }
                }
              } else {
                if (this.field_w != param1.field_y) {
                  if (param0 == -82) {
                    vj.field_E.a((byte) -113, new qm(2, this.field_w, param1));
                    mr.field_f = true;
                    km.field_u = param1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  throw new RuntimeException(this.field_w.field_t + " is trying to Stellar Bomb itself at star " + param1.field_I);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = var3;

            stackIn_24_1 = new StringBuilder().append("hi.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = stackIn_24_0;
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = stackIn_24_0;
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, kl param1, boolean param2) {
        int dupTemp$0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_155_0 = null;
        StringBuilder stackIn_155_1 = null;
        RuntimeException stackIn_156_0 = null;
        StringBuilder stackIn_156_1 = null;
        String stackIn_156_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ln[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        sd var9_ref_sd = null;
        int var10 = 0;
        int var11 = 0;
        ln[] var11_ref_ln__ = null;
        int var12_int = 0;
        ln[] var12 = null;
        ln var13_ref_ln = null;
        int var13 = 0;
        ln var14 = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        ln var16_ref_ln = null;
        int var16 = 0;
        ln[] var17 = null;
        int var18 = 0;
        ln var19 = null;
        int var20 = 0;
        Object var21 = null;
        sd var21_ref = null;
        int var22 = 0;
        ln[] var23 = null;
        int[] var25 = null;
        ln[] var26 = null;
        ln[] var27 = null;
        ln var28 = null;
        ln[] var29 = null;
        int[] var30 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var35 = null;
        var21 = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var23 = param1.field_n.field_D;
            var4 = var23;
            var35 = new int[var23.length];
            var6 = 0;
            var7 = 0;
            var8_int = 0;
            L1: while (true) {
              if (var23.length <= var8_int) {
                var32 = new int[this.field_w.field_i.e(0)];
                var25 = var32;
                var8 = var25;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var23.length) {
                    var9 = 0;
                    var11 = 100 % ((-53 - param0) / 41);
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= var32.length) {
                        L4: {
                          if (!this.field_m.field_o.field_i) {
                            var10 = 0;
                            L5: while (true) {
                              if (var32.length <= var10) {
                                break L4;
                              } else {
                                if (-1 > (var32[var10] ^ -1)) {
                                  var9 = var9 + this.field_i[var10];
                                  var10++;
                                  continue L5;
                                } else {
                                  var10++;
                                  continue L5;
                                }
                              }
                            }
                          } else {
                            var9 = var9 + this.field_i[0];
                            break L4;
                          }
                        }
                        L6: {
                          var10 = param1.field_i * (-this.field_t + 50) / 250 + param1.field_i;
                          if (!param2) {
                            break L6;
                          } else {
                            L7: {
                              if (param1.field_n == km.field_u) {
                                L8: {
                                  param1.field_i = param1.field_n.field_x / 2;
                                  if (null != param1.field_n.field_y) {
                                    var11_ref_ln__ = var23;
                                    var12_int = 0;
                                    L9: while (true) {
                                      if (var11_ref_ln__.length <= var12_int) {
                                        break L8;
                                      } else {
                                        L10: {
                                          var13_ref_ln = var11_ref_ln__[var12_int];
                                          if (var13_ref_ln.field_y != param1.field_n.field_y) {
                                            break L10;
                                          } else {
                                            param1.field_i = param1.field_i + var13_ref_ln.field_x;
                                            break L10;
                                          }
                                        }
                                        var12_int++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                                if (!param1.field_n.field_u) {
                                  break L7;
                                } else {
                                  param1.field_i = 2 * param1.field_i;
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            L11: {
                              var10 = param1.field_i - -(param1.field_i * (-this.field_t + 50) / 250);
                              if (var9 < var10) {
                                stackIn_47_0 = 0;
                                break L11;
                              } else {
                                stackIn_47_0 = 1;
                                break L11;
                              }
                            }
                            L12: {
                              var11 = stackIn_47_0;
                              if (var11 != 0) {
                                break L12;
                              } else {
                                if (mr.field_f) {
                                  break L12;
                                } else {
                                  if (this.field_w.field_u[2] < 5) {
                                    break L12;
                                  } else {
                                    if ((param1.field_n.field_x ^ -1) <= -6) {
                                      L13: {
                                        var12_int = param1.field_i;
                                        if (param1.field_n.field_u) {
                                          var12_int = var12_int / 2;
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        var12_int = var12_int - param1.field_n.field_x / 2;
                                        if (param1.field_n.field_u) {
                                          var12_int = var12_int * 2;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      var13 = var12_int - -(var12_int * (50 + -this.field_t) / 250);
                                      if (var13 <= var9) {
                                        L15: {
                                          this.a((byte) -82, param1.field_n);
                                          var11 = 1;
                                          param1.field_i = param1.field_n.field_x / 2;
                                          if (null == param1.field_n.field_y) {
                                            break L15;
                                          } else {
                                            var26 = var23;
                                            var15 = 0;
                                            L16: while (true) {
                                              if (var26.length <= var15) {
                                                break L15;
                                              } else {
                                                L17: {
                                                  var16_ref_ln = var26[var15];
                                                  if (param1.field_n.field_y != var16_ref_ln.field_y) {
                                                    break L17;
                                                  } else {
                                                    param1.field_i = param1.field_i + var16_ref_ln.field_x;
                                                    break L17;
                                                  }
                                                }
                                                var15++;
                                                continue L16;
                                              }
                                            }
                                          }
                                        }
                                        L18: {
                                          if (param1.field_n.field_u) {
                                            param1.field_i = 2 * param1.field_i;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var10 = param1.field_i + param1.field_i * (50 - this.field_t) / 250;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            L19: {
                              if (var11 == 0) {
                                break L19;
                              } else {
                                if (mr.field_f) {
                                  break L19;
                                } else {
                                  if ((this.field_w.field_u[2] ^ -1) > -6) {
                                    break L19;
                                  } else {
                                    if (param1.field_n.field_x >= 25) {
                                      L20: {
                                        this.a((byte) -82, param1.field_n);
                                        param1.field_i = param1.field_n.field_x / 2;
                                        if (null == param1.field_n.field_y) {
                                          break L20;
                                        } else {
                                          var27 = var23;
                                          var13 = 0;
                                          L21: while (true) {
                                            if (var27.length <= var13) {
                                              break L20;
                                            } else {
                                              L22: {
                                                var28 = var27[var13];
                                                var19 = var28;
                                                var19 = var28;
                                                if (param1.field_n.field_y != var28.field_y) {
                                                  break L22;
                                                } else {
                                                  param1.field_i = param1.field_i + var28.field_x;
                                                  break L22;
                                                }
                                              }
                                              var13++;
                                              continue L21;
                                            }
                                          }
                                        }
                                      }
                                      L23: {
                                        if (!param1.field_n.field_u) {
                                          break L23;
                                        } else {
                                          param1.field_i = param1.field_i * 2;
                                          break L23;
                                        }
                                      }
                                      var10 = (-this.field_t + 50) * param1.field_i / 250 + param1.field_i;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L6;
                            } else {
                              param1.field_p = true;
                              break L6;
                            }
                          }
                        }
                        L24: {
                          if (param1.field_p) {
                            L25: {
                              if (param2) {
                                break L25;
                              } else {
                                if (-1 == (var9 ^ -1)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  var10 = var10 * 3 / 10;
                                  if (-1 != (var10 ^ -1)) {
                                    break L25;
                                  } else {
                                    var10 = 1;
                                    break L25;
                                  }
                                }
                              }
                            }
                            var11 = 0;
                            var29 = (ln[]) ((Object) var4.clone());
                            var12 = var29;
                            var13 = 1;
                            L26: while (true) {
                              if (var13 == 0) {
                                L27: {
                                  var11 = this.a(true, var29, param1.field_n, 102, var10);
                                  if (var10 <= var11) {
                                    break L27;
                                  } else {
                                    var11 = var11 + this.a(false, var12, param1.field_n, 84, -var11 + var10);
                                    break L27;
                                  }
                                }
                                L28: {
                                  var10 = var10 - var11;
                                  if ((var10 ^ -1) < -1) {
                                    if (this.field_m.field_o.field_i) {
                                      L29: {
                                        if (var10 <= this.field_i[0]) {
                                          break L29;
                                        } else {
                                          if (param2) {
                                            throw new RuntimeException(this.field_w.field_t + " has decided to attack a system, but appears not to have sufficient fleets to carry through.");
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        var15 = var10;
                                        if (var10 <= this.field_i[0]) {
                                          break L30;
                                        } else {
                                          var15 = this.field_i[0];
                                          break L30;
                                        }
                                      }
                                      var16 = 0;
                                      L31: while (true) {
                                        L32: {
                                          if (var29.length <= var16) {
                                            break L32;
                                          } else {
                                            if (var29[var16].field_y == this.field_w) {
                                              this.a(-1, var29[var16], var15);
                                              this.a(var15, (byte) 93, param1.field_n, var29[var16]);
                                              break L32;
                                            } else {
                                              var16++;
                                              continue L31;
                                            }
                                          }
                                        }
                                        var10 = var10 - var15;
                                        var16 = 0;
                                        L33: while (true) {
                                          if (this.field_i.length <= var16) {
                                            var11 = var11 + var15;
                                            break L28;
                                          } else {
                                            this.field_i[var16] = this.field_i[var16] - var15;
                                            var16++;
                                            continue L33;
                                          }
                                        }
                                      }
                                    } else {
                                      var33 = new int[this.field_i.length];
                                      var30 = var33;
                                      var15_ref_int__ = var30;
                                      var16 = 0;
                                      L34: while (true) {
                                        if (var33.length <= var16) {
                                          nm.a(var15_ref_int__, (int[]) ((Object) this.field_i.clone()), (byte) 47);
                                          var16 = 0;
                                          L35: while (true) {
                                            if (var16 >= this.field_i.length) {
                                              break L28;
                                            } else {
                                              if (this.field_i[var33[var16]] != 0) {
                                                var17 = var23;
                                                var18 = 0;
                                                L36: while (true) {
                                                  L37: {
                                                    if (var18 >= var17.length) {
                                                      break L37;
                                                    } else {
                                                      L38: {
                                                        var19 = var17[var18];
                                                        if (this.field_w != var19.field_y) {
                                                          break L38;
                                                        } else {
                                                          var20 = 0;
                                                          var21_ref = (sd) ((Object) this.field_w.field_i.d(0));
                                                          L39: while (true) {
                                                            L40: {
                                                              if (var21_ref == null) {
                                                                break L40;
                                                              } else {
                                                                if (var21_ref == var19.field_R) {
                                                                  break L40;
                                                                } else {
                                                                  var20++;
                                                                  var21_ref = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                                                                  continue L39;
                                                                }
                                                              }
                                                            }
                                                            if (var21_ref == null) {
                                                              throw new RuntimeException("Cannot find Territory that " + this.field_w.field_t + "'s star belongs to: " + var19.field_I);
                                                            } else {
                                                              if (var20 == var33[var16]) {
                                                                if (this.field_i[var20] <= var10) {
                                                                  this.a(-1, var19, this.field_i[var20]);
                                                                  this.a(this.field_i[var20], (byte) 100, param1.field_n, var19);
                                                                  var10 = var10 - this.field_i[var20];
                                                                  this.field_i[var20] = 0;
                                                                  break L37;
                                                                } else {
                                                                  this.a(-1, var19, var10);
                                                                  this.a(var10, (byte) 116, param1.field_n, var19);
                                                                  this.field_i[var20] = this.field_i[var20] - var10;
                                                                  var10 = 0;
                                                                  break L37;
                                                                }
                                                              } else {
                                                                break L38;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var18++;
                                                      continue L36;
                                                    }
                                                  }
                                                  if (0 == var10) {
                                                    break L28;
                                                  } else {
                                                    var16++;
                                                    continue L35;
                                                  }
                                                }
                                              } else {
                                                var16++;
                                                continue L35;
                                              }
                                            }
                                          }
                                        } else {
                                          var33[var16] = var16;
                                          var16++;
                                          continue L34;
                                        }
                                      }
                                    }
                                  } else {
                                    break L28;
                                  }
                                }
                                L41: {
                                  if ((var10 ^ -1) >= -1) {
                                    break L41;
                                  } else {
                                    if (!param2) {
                                      break L41;
                                    } else {
                                      throw new RuntimeException("After full attack movement, " + this.field_w.field_t + " still hasn't sent enough fleets to " + param1.field_n.field_I);
                                    }
                                  }
                                }
                                break L24;
                              } else {
                                var13 = 0;
                                var15 = 0;
                                L42: while (true) {
                                  if (var15 >= -1 + var29.length) {
                                    continue L26;
                                  } else {
                                    L43: {
                                      if (q.field_Ab[var29[var15].field_p] > q.field_Ab[var12[var15 + 1].field_p]) {
                                        var14 = var29[var15];
                                        var19 = var14;
                                        var19 = var14;
                                        var12[var15] = var12[var15 + 1];
                                        var13 = 1;
                                        var12[1 + var15] = var14;
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    var15++;
                                    continue L42;
                                  }
                                }
                              }
                            }
                          } else {
                            break L24;
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L44: {
                          if ((this.field_n[var10] ^ -1) <= (var32[var10] ^ -1)) {
                            break L44;
                          } else {
                            var8[var10] = this.field_n[var10];
                            break L44;
                          }
                        }
                        var9 = var9 + var32[var10];
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    L45: {
                      if (0 == (var35[var9] ^ -1)) {
                        break L45;
                      } else {
                        dupTemp$0 = var35[var9];
                        var8[dupTemp$0] = var8[dupTemp$0] + q.field_Ab[var23[var9].field_p];
                        break L45;
                      }
                    }
                    var9++;
                    continue L2;
                  }
                }
              } else {
                L46: {
                  if (var23[var8_int].field_y == this.field_w) {
                    var7 = 0;
                    var6 = 0;
                    var9_ref_sd = (sd) ((Object) this.field_w.field_i.d(0));
                    L47: while (true) {
                      L48: {
                        if (var9_ref_sd == null) {
                          break L48;
                        } else {
                          if (var23[var8_int].field_R != var9_ref_sd) {
                            var6++;
                            var9_ref_sd = (sd) ((Object) this.field_w.field_i.a((byte) -71));
                            continue L47;
                          } else {
                            var7 = 1;
                            break L48;
                          }
                        }
                      }
                      if (var7 == 0) {
                        throw new RuntimeException("Can't find the Territory of a star owned by the AI: " + var23[var8_int].field_I);
                      } else {
                        var35[var8_int] = var6;
                        break L46;
                      }
                    }
                  } else {
                    var35[var8_int] = -1;
                    break L46;
                  }
                }
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L49: {
            var4_ref = decompiledCaughtException;
            stackIn_155_0 = (RuntimeException) (var4_ref);

            stackIn_155_1 = new StringBuilder().append("hi.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_156_0 = (RuntimeException) ((Object) stackIn_155_0);
              stackIn_156_1 = (StringBuilder) ((Object) stackIn_155_1);
              stackIn_156_2 = "null";
              break L49;
            } else {
              stackIn_156_0 = (RuntimeException) ((Object) stackIn_155_0);
              stackIn_156_1 = (StringBuilder) ((Object) stackIn_155_1);
              stackIn_156_2 = "{...}";
              break L49;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_156_0), stackIn_156_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    hi(fs param0, dc param1, mn param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_l = new pf();
        this.field_u = new pf();
        this.field_k = new pf();
        this.field_h = false;
        this.field_b = false;
        try {
          L0: {
            L1: {
              this.field_c = param2;
              this.field_m = param1;
              this.field_w = param0;
              this.field_x = this.field_m.field_g.field_e.length;
              sf.a((byte) 124, this.field_x);
              this.field_p = true;
              this.field_j = vc.a((byte) -39, 75) - -25;
              this.field_t = vc.a((byte) -39, 75) - -25;
              this.field_v = new int[this.field_m.field_r];
              this.field_q = new int[this.field_m.field_r];
              this.field_f = new int[this.field_m.field_r];
              if (!(this.field_m.field_x instanceof ui)) {
                break L1;
              } else {
                this.field_b = true;
                break L1;
              }
            }
            L2: {
              if (!(this.field_m.field_x instanceof hp)) {
                break L2;
              } else {
                this.field_h = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("hi.<init>(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_d = "Click to show the Victory window.";
        field_a = new vr(true, true, true, true, false, true, true, 0);
    }
}
