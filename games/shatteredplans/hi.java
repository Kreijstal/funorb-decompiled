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

    private final void d() {
        int var2 = 0;
        co var3 = null;
        int var4 = 0;
        int var5 = 0;
        sd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = (co) (Object) ((hi) this).field_l.d(0);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            var4 = 0;
            var5 = 0;
            var6 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (var6 != var3.field_n.field_R) {
                    var4++;
                    var6 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                    continue L1;
                  } else {
                    var5 = 1;
                    break L2;
                  }
                }
              }
              if (var5 != 0) {
                L3: {
                  if (((hi) this).field_y[var4]) {
                    break L3;
                  } else {
                    var2 = var3.field_i + -var3.field_n.field_x;
                    if (0 < var2) {
                      q.field_Ab[var3.field_n.field_p] = 0;
                      if (var3.field_n.field_x > var3.field_n.field_N) {
                        ((hi) this).field_n[var4] = ((hi) this).field_n[var4] - (var3.field_n.field_x - var3.field_n.field_N);
                        if (0 <= ((hi) this).field_n[var4]) {
                          if (var2 > ((hi) this).field_i[var4]) {
                            L4: {
                              var3.field_n.field_J = var3.field_n.field_J + ((hi) this).field_i[var4];
                              var2 = var2 - ((hi) this).field_i[var4];
                              bk.field_a.a((byte) -113, (oh) (Object) new qa(var3.field_n, ((hi) this).field_i[var4]));
                              if (((hi) this).field_m.field_o.field_i) {
                                var9 = 0;
                                var7 = var9;
                                L5: while (true) {
                                  if (var9 >= ((hi) this).field_i.length) {
                                    break L4;
                                  } else {
                                    ((hi) this).field_i[var9] = 0;
                                    var9++;
                                    continue L5;
                                  }
                                }
                              } else {
                                ((hi) this).field_i[var4] = 0;
                                break L4;
                              }
                            }
                            if (var2 <= ((hi) this).field_n[var4]) {
                              ((hi) this).field_n[var4] = ((hi) this).field_n[var4] - var2;
                              kq.field_c[var3.field_n.field_p] = kq.field_c[var3.field_n.field_p] + var2;
                              break L3;
                            } else {
                              this.a(var4, 71, var6);
                              break L3;
                            }
                          } else {
                            L6: {
                              if (((hi) this).field_m.field_o.field_i) {
                                var7 = 0;
                                L7: while (true) {
                                  if (((hi) this).field_i.length <= var7) {
                                    break L6;
                                  } else {
                                    ((hi) this).field_i[var7] = ((hi) this).field_i[var7] - var2;
                                    var7++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((hi) this).field_i[var4] = ((hi) this).field_i[var4] - var2;
                                break L6;
                              }
                            }
                            var3.field_n.field_J = var3.field_n.field_J + var2;
                            bk.field_a.a((byte) -113, (oh) (Object) new qa(var3.field_n, var2));
                            break L3;
                          }
                        } else {
                          this.a(var4, 100, var6);
                          break L3;
                        }
                      } else {
                        L8: {
                          if (var2 > ((hi) this).field_i[var4]) {
                            L9: {
                              var3.field_n.field_J = var3.field_n.field_J + ((hi) this).field_i[var4];
                              var2 = var2 - ((hi) this).field_i[var4];
                              bk.field_a.a((byte) -113, (oh) (Object) new qa(var3.field_n, ((hi) this).field_i[var4]));
                              if (((hi) this).field_m.field_o.field_i) {
                                var9 = 0;
                                var7 = var9;
                                L10: while (true) {
                                  if (var9 >= ((hi) this).field_i.length) {
                                    break L9;
                                  } else {
                                    ((hi) this).field_i[var9] = 0;
                                    var9++;
                                    continue L10;
                                  }
                                }
                              } else {
                                ((hi) this).field_i[var4] = 0;
                                break L9;
                              }
                            }
                            if (var2 <= ((hi) this).field_n[var4]) {
                              ((hi) this).field_n[var4] = ((hi) this).field_n[var4] - var2;
                              kq.field_c[var3.field_n.field_p] = kq.field_c[var3.field_n.field_p] + var2;
                              break L8;
                            } else {
                              this.a(var4, 71, var6);
                              break L8;
                            }
                          } else {
                            L11: {
                              if (((hi) this).field_m.field_o.field_i) {
                                var7 = 0;
                                L12: while (true) {
                                  if (((hi) this).field_i.length <= var7) {
                                    break L11;
                                  } else {
                                    ((hi) this).field_i[var7] = ((hi) this).field_i[var7] - var2;
                                    var7++;
                                    continue L12;
                                  }
                                }
                              } else {
                                ((hi) this).field_i[var4] = ((hi) this).field_i[var4] - var2;
                                break L11;
                              }
                            }
                            var3.field_n.field_J = var3.field_n.field_J + var2;
                            bk.field_a.a((byte) -113, (oh) (Object) new qa(var3.field_n, var2));
                            break L8;
                          }
                        }
                        var3 = (co) (Object) ((hi) this).field_l.a((byte) -71);
                        continue L0;
                      }
                    } else {
                      q.field_Ab[var3.field_n.field_p] = var3.field_n.field_x + -var3.field_i;
                      ((hi) this).field_n[var4] = ((hi) this).field_n[var4] - (-var3.field_n.field_N + var3.field_i);
                      if (((hi) this).field_n[var4] >= 0) {
                        break L3;
                      } else {
                        this.a(var4, -52, var6);
                        break L3;
                      }
                    }
                  }
                }
                var3 = (co) (Object) ((hi) this).field_l.a((byte) -71);
                continue L0;
              } else {
                throw new RuntimeException("Star to be garrisoned (" + var3.field_n.field_I + ") doesn't appear to be in any of the AI's territories.");
              }
            }
          }
        }
    }

    private final void j() {
        int var2 = 0;
        Object var3 = null;
        sd var3_ref = null;
        ln[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        var3 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        ((hi) this).field_n = new int[((hi) this).field_w.field_i.e(0)];
        ((hi) this).field_i = new int[((hi) this).field_w.field_i.e(0)];
        ((hi) this).field_y = new boolean[((hi) this).field_w.field_i.e(0)];
        var4 = ((hi) this).field_m.field_g.field_e;
        var5 = -2;
        var6 = 0;
        L0: while (true) {
          if (var4.length <= var6) {
            L1: {
              if (((hi) this).field_m.field_o.field_i) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= ((hi) this).field_i.length) {
                    break L1;
                  } else {
                    ((hi) this).field_i[var2] = ((hi) this).field_w.field_m.field_x;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var3_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                var2 = 0;
                L3: while (true) {
                  if (var2 >= ((hi) this).field_i.length) {
                    break L1;
                  } else {
                    ((hi) this).field_i[var2] = var3_ref.field_x;
                    var3_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
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
              if (var7.field_y != ((hi) this).field_w) {
                break L4;
              } else {
                if (var7.field_x <= var7.field_N) {
                  break L4;
                } else {
                  q.field_Ab[var7.field_p] = var7.field_x - var7.field_N;
                  if (var7.field_J < q.field_Ab[var7.field_p]) {
                    throw new RuntimeException(var7.field_I + ": available=" + q.field_Ab[var7.field_p] + ", garrison_next=" + var7.field_J);
                  } else {
                    var3_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                    var8 = 0;
                    var2 = 0;
                    L5: while (true) {
                      L6: {
                        if (var2 >= ((hi) this).field_n.length) {
                          break L6;
                        } else {
                          if (var7.field_R != var3_ref) {
                            var3_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                            var2++;
                            continue L5;
                          } else {
                            var8 = 1;
                            ((hi) this).field_n[var2] = ((hi) this).field_n[var2] + q.field_Ab[var7.field_p];
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        throw new RuntimeException("Star owned by " + ((hi) this).field_w.field_t + " is not in any of its Territories: " + var7.field_I);
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

    private final void b() {
        int var2 = 0;
        wf[] var3_ref_wf__ = null;
        int var3 = 0;
        int var4_int = 0;
        wf[] var4 = null;
        int var5 = 0;
        wf var5_ref_wf = null;
        wf var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var3_ref_wf__ = ((hi) this).field_e;
        var4_int = 0;
        L0: while (true) {
          if (var3_ref_wf__.length <= var4_int) {
            var4 = ((hi) this).field_e;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                return;
              } else {
                var6 = var4[var5];
                if (var6 instanceof ac) {
                  var3 = 0;
                  var2 = var6.field_n.field_p;
                  var7 = 0;
                  L2: while (true) {
                    if (2 <= var7) {
                      if (kq.field_c[var2] > 0) {
                        throw new RuntimeException(((hi) this).field_w.field_t + " has run out of available fleets, but has not yet met its defender allocation at " + var6.field_n.field_I + ".");
                      } else {
                        var5++;
                        continue L1;
                      }
                    } else {
                      var8 = var6.field_n.field_R.j(18229);
                      L3: while (true) {
                        if (var8 == null) {
                          var3 = 1;
                          var7++;
                          continue L2;
                        } else {
                          L4: {
                            if (var6.field_n == var8) {
                              break L4;
                            } else {
                              if (0 == q.field_Ab[var8.field_p]) {
                                break L4;
                              } else {
                                L5: {
                                  if (var3 != 0) {
                                    break L5;
                                  } else {
                                    if (no.field_f[var8.field_p]) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                if (kq.field_c[var2] >= q.field_Ab[var8.field_p]) {
                                  this.a(q.field_Ab[var8.field_p], (byte) 114, var6.field_n, var8);
                                  kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var8.field_p];
                                  q.field_Ab[var8.field_p] = 0;
                                  break L4;
                                } else {
                                  this.a(kq.field_c[var2], (byte) 102, var6.field_n, var8);
                                  q.field_Ab[var8.field_p] = q.field_Ab[var8.field_p] - kq.field_c[var2];
                                  kq.field_c[var2] = 0;
                                  var5++;
                                  continue L1;
                                }
                              }
                            }
                          }
                          var8 = var6.field_n.field_R.h(-23410);
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var5++;
                  continue L1;
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
                continue L0;
              } else {
                kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var2];
                q.field_Ab[var2] = 0;
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    private final void h() {
        ln var3 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        ((hi) this).field_l.a(0);
        sd var2 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
        while (var2 != null) {
            var3 = var2.j(18229);
            while (var3 != null) {
                ((hi) this).field_l.a((byte) -113, (oh) (Object) new co(var3, ((hi) this).field_m.field_o.field_l, no.field_f));
                var3 = var2.h(-23410);
            }
            var2 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
        }
    }

    public final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sd var6_ref_sd = null;
        int var6 = 0;
        int var7 = 0;
        ac var8 = null;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((hi) this).field_w.field_i.g(-74)) {
          bk.field_a.a(0);
          ed.field_g.a(0);
          vj.field_E.a(0);
          km.field_u = null;
          no.field_b = false;
          mr.field_f = false;
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((hi) this).field_x) {
              int discarded$9 = 114;
              this.j();
              this.i(15401);
              this.d(114);
              int discarded$10 = 100;
              this.h();
              int discarded$11 = 0;
              this.e();
              int discarded$12 = -30426;
              this.c();
              this.g(115);
              int discarded$13 = 46;
              this.d();
              int discarded$14 = -70;
              this.g();
              this.b(true, 0);
              var2 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 >= ((hi) this).field_n.length) {
                  var3 = 0;
                  var3 = var2;
                  L2: while (true) {
                    if (0 >= var2) {
                      L3: {
                        int discarded$15 = 7270;
                        this.b();
                        int discarded$16 = 127;
                        this.f();
                        if (param0 <= -3) {
                          break L3;
                        } else {
                          ((hi) this).b((byte) 56);
                          break L3;
                        }
                      }
                      L4: {
                        this.e((byte) -44);
                        if (((hi) this).field_m.a(ed.field_g, ((hi) this).field_w, -6, bk.field_a, vj.field_E)) {
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((hi) this).field_m.a(ed.field_g, 0, bk.field_a, vj.field_E);
                      return;
                    } else {
                      this.b(false, 0);
                      var2 = 0;
                      var4 = 0;
                      L5: while (true) {
                        if (var4 >= ((hi) this).field_n.length) {
                          if (var3 != var2) {
                            var3 = var2;
                            continue L2;
                          } else {
                            var4 = 1;
                            var5 = 0;
                            var6_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                            L6: while (true) {
                              if (var6_ref_sd == null) {
                                L7: {
                                  var2 = 0;
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    if (((hi) this).field_m.field_o.field_i) {
                                      this.c((byte) 35);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var6 = 0;
                                L8: while (true) {
                                  if (((hi) this).field_n.length <= var6) {
                                    if (var2 > 0) {
                                      throw new RuntimeException(((hi) this).field_w.field_t + " hasn't allocated any more idle fleets this loop, even though there are DefendTasks.");
                                    } else {
                                      continue L2;
                                    }
                                  } else {
                                    var2 = var2 + ((hi) this).field_n[var6];
                                    var2 = var2 + ((hi) this).field_i[var6];
                                    var6++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var7 = 0;
                                var8 = (ac) (Object) ((hi) this).field_u.d(0);
                                L9: while (true) {
                                  if (var8 == null) {
                                    L10: {
                                      if (var7 <= 0) {
                                        int discarded$17 = -122;
                                        this.a(var6_ref_sd, var5);
                                        break L10;
                                      } else {
                                        var4 = 0;
                                        break L10;
                                      }
                                    }
                                    var5++;
                                    var6_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
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
                                    var8 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                                    continue L9;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var2 = var2 + ((hi) this).field_n[var4];
                          var2 = var2 + ((hi) this).field_i[var4];
                          var4++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  var2 = var2 + ((hi) this).field_n[var4];
                  var2 = var2 + ((hi) this).field_i[var4];
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
        int var2 = 0;
        ln[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ln var5_ref_ln = null;
        ln[] var5_ref_ln__ = null;
        int var5 = 0;
        int var6 = 0;
        ln[] var6_ref_ln__ = null;
        int var7_int = 0;
        ln var7 = null;
        ln var8 = null;
        ln[] var8_array = null;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        int var12 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((hi) this).field_m.field_o.field_i) {
          return;
        } else {
          L0: {
            var2 = 0;
            var3 = ((hi) this).field_m.field_g.field_e;
            if (param0 > 4) {
              break L0;
            } else {
              this.i(15);
              break L0;
            }
          }
          var4 = 0;
          L1: while (true) {
            if (var3.length <= var4) {
              L2: {
                if (0 != var2) {
                  var3 = new ln[var2];
                  var4 = 0;
                  var5_ref_ln__ = ((hi) this).field_m.field_g.field_e;
                  var6 = 0;
                  L3: while (true) {
                    if (var6 >= var5_ref_ln__.length) {
                      L4: while (true) {
                        if (0 >= ((hi) this).field_i[0]) {
                          var5 = 0;
                          L5: while (true) {
                            if (var5 >= ((hi) this).field_i.length) {
                              break L2;
                            } else {
                              ((hi) this).field_i[var5] = 0;
                              var5++;
                              continue L5;
                            }
                          }
                        } else {
                          var5_ref_ln__ = var3;
                          var12 = 0;
                          var6 = var12;
                          L6: while (true) {
                            if (var12 >= var5_ref_ln__.length) {
                              continue L4;
                            } else {
                              var7 = var5_ref_ln__[var12];
                              this.a(-1, var7, 1);
                              ((hi) this).field_i[0] = ((hi) this).field_i[0] - 1;
                              if (((hi) this).field_i[0] == 0) {
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
                      var7 = var5_ref_ln__[var6];
                      if (((hi) this).field_w == var7.field_y) {
                        var8_array = var7.field_D;
                        var9 = 0;
                        L7: while (true) {
                          if (var9 < var8_array.length) {
                            var10 = var8_array[var9];
                            if (var10.field_y != ((hi) this).field_w) {
                              var3[var4] = var7;
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
                  this.a(-1, ((hi) this).field_w.field_m.field_q, ((hi) this).field_i[0]);
                  var3_int = 0;
                  L8: while (true) {
                    if (((hi) this).field_i.length <= var3_int) {
                      break L2;
                    } else {
                      ((hi) this).field_i[var3_int] = 0;
                      var3_int++;
                      continue L8;
                    }
                  }
                }
              }
              return;
            } else {
              var5_ref_ln = var3[var4];
              if (((hi) this).field_w == var5_ref_ln.field_y) {
                var6_ref_ln__ = var5_ref_ln.field_D;
                var7_int = 0;
                L9: while (true) {
                  if (var7_int < var6_ref_ln__.length) {
                    var8 = var6_ref_ln__[var7_int];
                    if (((hi) this).field_w != var8.field_y) {
                      var2++;
                      var4++;
                      continue L1;
                    } else {
                      var7_int++;
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
        RuntimeException var4 = null;
        sd var4_ref = null;
        sd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln[] var10_ref_ln__ = null;
        int var10 = 0;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        ln[] var14 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = param0.field_n.field_R;
            var6 = 0;
            var7 = 0;
            var8 = 99 % ((param2 - 37) / 48);
            var4_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
            L1: while (true) {
              L2: {
                if (var4_ref == null) {
                  break L2;
                } else {
                  if (var4_ref == var5) {
                    var7 = 1;
                    break L2;
                  } else {
                    var6++;
                    var4_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                    continue L1;
                  }
                }
              }
              if (var7 == 0) {
                throw new RuntimeException("DefendTask's star does not appear to be in AI's territory: " + param0.field_n.field_I + ".");
              } else {
                L3: {
                  var9 = (-((hi) this).field_t + 50) * param0.field_i / 250 + param0.field_i;
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
                              var12 = var14[var11];
                              if (var12 != km.field_u) {
                                break L6;
                              } else {
                                if (var12.field_y != null) {
                                  L7: {
                                    param0.field_i = param0.field_i - var12.field_x;
                                    if (param0.field_i < 0) {
                                      param0.field_i = 0;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var9 = param0.field_i + (50 + -((hi) this).field_t) * param0.field_i / 250;
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
                      if (((hi) this).field_w.field_u[2] < 5) {
                        break L8;
                      } else {
                        if (mr.field_f) {
                          break L8;
                        } else {
                          var10_ref_ln__ = param0.field_n.field_D;
                          var11 = 0;
                          L9: while (true) {
                            if (var10_ref_ln__.length <= var11) {
                              break L8;
                            } else {
                              L10: {
                                var12 = var10_ref_ln__[var11];
                                if (var12.field_y == null) {
                                  break L10;
                                } else {
                                  if (((hi) this).field_w != var12.field_y) {
                                    if (~(int)((double)var9 * 0.8) < ~var12.field_x) {
                                      break L10;
                                    } else {
                                      if (var12.field_x > 10) {
                                        L11: {
                                          this.a((byte) -82, var12);
                                          param0.field_i = param0.field_i - var12.field_x;
                                          if (param0.field_i < 0) {
                                            param0.field_i = 0;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        var9 = (50 - ((hi) this).field_t) * param0.field_i / 250 + param0.field_i;
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
                    if (5 > ((hi) this).field_w.field_u[0]) {
                      break L3;
                    } else {
                      if (!no.field_b) {
                        if (param0.field_n.field_u) {
                          break L3;
                        } else {
                          L12: {
                            if (~var9 < ~((hi) this).field_n[var6]) {
                              break L12;
                            } else {
                              if (var9 > 20) {
                                break L12;
                              } else {
                                break L3;
                              }
                            }
                          }
                          int discarded$1 = 31308;
                          this.a(param0.field_n);
                          if (param0.field_i > 1) {
                            param0.field_i = param0.field_i / 2;
                            var9 = param0.field_i - -(param0.field_i * (-((hi) this).field_t + 50) / 250);
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
                    if (~var9 >= ~((hi) this).field_n[var6]) {
                      ((hi) this).field_n[var6] = ((hi) this).field_n[var6] - var9;
                      kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + var9;
                      var9 = 0;
                      break L14;
                    } else {
                      L15: {
                        if (((hi) this).field_n[var6] <= 0) {
                          break L15;
                        } else {
                          var9 = var9 - ((hi) this).field_n[var6];
                          kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + ((hi) this).field_n[var6];
                          ((hi) this).field_n[var6] = 0;
                          break L15;
                        }
                      }
                      L16: {
                        if (~((hi) this).field_i[var6] <= ~var9) {
                          var10 = var9;
                          if (((hi) this).field_m.field_o.field_i) {
                            var11 = 0;
                            L17: while (true) {
                              if (((hi) this).field_i.length <= var11) {
                                break L16;
                              } else {
                                ((hi) this).field_i[var11] = ((hi) this).field_i[var11] - var9;
                                var11++;
                                continue L17;
                              }
                            }
                          } else {
                            ((hi) this).field_i[var6] = ((hi) this).field_i[var6] - var9;
                            break L16;
                          }
                        } else {
                          var9 = var9 - ((hi) this).field_i[var6];
                          var10 = ((hi) this).field_i[var6];
                          if (((hi) this).field_m.field_o.field_i) {
                            var11 = 0;
                            L18: while (true) {
                              if (((hi) this).field_i.length <= var11) {
                                break L16;
                              } else {
                                ((hi) this).field_i[var11] = 0;
                                var11++;
                                continue L18;
                              }
                            }
                          } else {
                            ((hi) this).field_i[var6] = 0;
                            break L16;
                          }
                        }
                      }
                      if (var10 > 0) {
                        this.a(-1, param0.field_n, var10);
                        og.field_c[param0.field_n.field_p] = og.field_c[param0.field_n.field_p] + var10;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  break L0;
                } else {
                  param0.b((byte) -62);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var4;
            stackOut_73_1 = new StringBuilder().append("hi.AA(");
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L19;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L19;
            }
          }
          throw r.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void a(fs param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!((hi) this).field_p) {
              return;
            } else {
              L1: {
                var3_int = ((hi) this).field_q[param0.field_x];
                if (param1 == 7686) {
                  break L1;
                } else {
                  ((hi) this).field_w = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var7 = var3_int;
                  if (var7 == 1) {
                    break L3;
                  } else {
                    if (var7 != 6) {
                      L4: {
                        if (var7 == 2) {
                          break L4;
                        } else {
                          if (7 == var7) {
                            break L4;
                          } else {
                            if (3 != var7) {
                              if (var7 == 4) {
                                var4 = 3;
                                break L2;
                              } else {
                                if (5 != var7) {
                                  if (var7 != -1) {
                                    if (var7 == -2) {
                                      var4 = 5;
                                      break L2;
                                    } else {
                                      if (var7 != -3) {
                                        var4 = -1;
                                        break L2;
                                      } else {
                                        var4 = 6;
                                        var6 = ((hi) this).field_m.field_m[((hi) this).field_m.field_r - 2];
                                        var5 = ((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r];
                                        if (~((hi) this).field_w.field_x == ~var5) {
                                          break L2;
                                        } else {
                                          if (param0.field_x == var5) {
                                            break L2;
                                          } else {
                                            if (~(3 * ((hi) this).field_m.field_D[var6]) <= ~(2 * ((hi) this).field_m.field_D[var5])) {
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
                  ((hi) this).field_c.a(0, (byte) -125, param0, ((hi) this).field_w, var4);
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (((hi) this).field_w.field_h[param0.field_x]) {
                    break L7;
                  } else {
                    if (0 <= var3_int) {
                      break L7;
                    } else {
                      ((hi) this).field_c.a((byte) -63, ((hi) this).field_w, param0);
                      this.b(true);
                      break L6;
                    }
                  }
                }
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var3;
            stackOut_39_1 = new StringBuilder().append("hi.SA(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + param1 + 41);
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        ac var3 = null;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var3 = (ac) (Object) ((hi) this).field_u.d(0);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            var3.field_l = (var3.field_j << 16) * (-((hi) this).field_j + 100) / (var3.field_i * 100);
            var2++;
            var3 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
            continue L0;
          }
        }
    }

    private final void d(int param0) {
        sd var2_ref_sd = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          ((hi) this).field_s = new int[((hi) this).field_w.field_i.e(0)][4];
          if (((hi) this).field_m.field_o.field_i) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 4) {
                break L0;
              } else {
                var3 = 1 + -((hi) this).field_w.field_m.field_u[var2] - -((hi) this).field_w.field_m.field_u[((hi) this).field_w.field_m.field_w[0]];
                var6 = 0;
                var4 = var6;
                L2: while (true) {
                  if (var6 >= ((hi) this).field_s.length) {
                    var2++;
                    continue L1;
                  } else {
                    ((hi) this).field_s[var6][var2] = var3;
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var2_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.d(0);
            var3 = 0;
            L3: while (true) {
              if (((hi) this).field_s.length <= var3) {
                break L0;
              } else {
                var4 = 0;
                L4: while (true) {
                  if (var4 >= 4) {
                    var2_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                    var3++;
                    continue L3;
                  } else {
                    ((hi) this).field_s[var3][var4] = -var2_ref_sd.field_u[var4] + 1 + var2_ref_sd.field_u[var2_ref_sd.field_w[0]];
                    var4++;
                    continue L4;
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
            field_a = null;
        }
        field_d = null;
        field_o = null;
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        qr stackIn_4_0 = null;
        qr stackIn_5_0 = null;
        qr stackIn_6_0 = null;
        qr stackIn_7_0 = null;
        qr stackIn_8_0 = null;
        qr stackIn_9_0 = null;
        qr stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        qr stackIn_11_0 = null;
        qr stackIn_12_0 = null;
        qr stackIn_13_0 = null;
        qr stackIn_14_0 = null;
        qr stackIn_15_0 = null;
        qr stackIn_16_0 = null;
        qr stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qr stackIn_18_0 = null;
        qr stackIn_19_0 = null;
        qr stackIn_20_0 = null;
        qr stackIn_21_0 = null;
        qr stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        qr stackOut_3_0 = null;
        qr stackOut_4_0 = null;
        qr stackOut_5_0 = null;
        qr stackOut_6_0 = null;
        qr stackOut_7_0 = null;
        qr stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        qr stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        qr stackOut_10_0 = null;
        qr stackOut_11_0 = null;
        qr stackOut_12_0 = null;
        qr stackOut_13_0 = null;
        qr stackOut_14_0 = null;
        qr stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qr stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qr stackOut_17_0 = null;
        qr stackOut_18_0 = null;
        qr stackOut_19_0 = null;
        qr stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        qr stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          int discarded$4 = 438;
          nj.a();
          if (0 <= a.field_j) {
            nm.field_c.field_z = re.a(vn.field_A, 4371, new String[1]);
            break L0;
          } else {
            nm.field_c.field_z = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_3_0 = ia.field_j;
            stackIn_9_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param0) {
              break L2;
            } else {
              stackOut_4_0 = (qr) (Object) stackIn_4_0;
              stackIn_9_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param2) {
                break L2;
              } else {
                stackOut_5_0 = (qr) (Object) stackIn_5_0;
                stackIn_9_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (on.field_b) {
                  break L2;
                } else {
                  stackOut_6_0 = (qr) (Object) stackIn_6_0;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (np.field_a != null) {
                    break L2;
                  } else {
                    stackOut_7_0 = (qr) (Object) stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (he.field_p != null) {
                      break L2;
                    } else {
                      stackOut_8_0 = (qr) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = (qr) (Object) stackIn_9_0;
          stackOut_9_1 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L1;
        }
        L3: {
          L4: {
            ((qr) (Object) stackIn_10_0).a(stackIn_10_1 != 0, -20429);
            stackOut_10_0 = se.field_i;
            stackIn_16_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (!param0) {
              break L4;
            } else {
              stackOut_11_0 = (qr) (Object) stackIn_11_0;
              stackIn_16_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (param2) {
                break L4;
              } else {
                stackOut_12_0 = (qr) (Object) stackIn_12_0;
                stackIn_16_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (on.field_b) {
                  break L4;
                } else {
                  stackOut_13_0 = (qr) (Object) stackIn_13_0;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (null != np.field_a) {
                    break L4;
                  } else {
                    stackOut_14_0 = (qr) (Object) stackIn_14_0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (null != he.field_p) {
                      break L4;
                    } else {
                      stackOut_15_0 = (qr) (Object) stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = (qr) (Object) stackIn_16_0;
          stackOut_16_1 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          break L3;
        }
        L5: {
          L6: {
            ((qr) (Object) stackIn_17_0).a(stackIn_17_1 != 0, -20429);
            stackOut_17_0 = so.field_v;
            stackIn_21_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param0) {
              break L6;
            } else {
              stackOut_18_0 = (qr) (Object) stackIn_18_0;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (param2) {
                break L6;
              } else {
                stackOut_19_0 = (qr) (Object) stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (!on.field_b) {
                  break L6;
                } else {
                  stackOut_20_0 = (qr) (Object) stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L5;
                }
              }
            }
          }
          stackOut_21_0 = (qr) (Object) stackIn_21_0;
          stackOut_21_1 = 0;
          stackIn_22_0 = stackOut_21_0;
          stackIn_22_1 = stackOut_21_1;
          break L5;
        }
        L7: {
          ((qr) (Object) stackIn_22_0).a(stackIn_22_1 != 0, -20429);
          bc.field_g.field_d.f(false);
          if (0 == vm.field_Ab.field_rb) {
            break L7;
          } else {
            s.field_d = true;
            break L7;
          }
        }
        L8: {
          if (gb.field_m.field_rb == 0) {
            break L8;
          } else {
            L9: {
              if (hm.field_o) {
                break L9;
              } else {
                if (0 < es.field_m) {
                  break L9;
                } else {
                  L10: {
                    if (bs.field_b < 2) {
                      break L10;
                    } else {
                      if (di.field_p[12]) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  uc.field_B = true;
                  break L8;
                }
              }
            }
            gd.a(param3, 1);
            break L8;
          }
        }
        L11: {
          if (rq.field_b.field_rb == 0) {
            break L11;
          } else {
            L12: {
              if (1 != nl.field_a.length) {
                break L12;
              } else {
                if (nl.field_a[0] == qk.field_x) {
                  break L12;
                } else {
                  qk.field_x = nl.field_a[0];
                  break L12;
                }
              }
            }
            int discarded$5 = 0;
            int discarded$6 = 0;
            int discarded$7 = 1;
            ei.a(param3, qk.field_x, mk.field_d);
            break L11;
          }
        }
        L13: {
          if (li.field_d.field_rb != 0) {
            on.field_b = false;
            break L13;
          } else {
            break L13;
          }
        }
    }

    private final void c() {
        ln[] var2 = null;
        int var3 = 0;
        ln var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        ((hi) this).field_k.a(0);
        var2 = ((hi) this).field_m.field_g.field_e;
        var3 = 0;
        L0: while (true) {
          if (var2.length <= var3) {
            return;
          } else {
            var4 = var2[var3];
            if (var4.field_y != ((hi) this).field_w) {
              L1: {
                if (var4.field_y == null) {
                  break L1;
                } else {
                  if (!((hi) this).field_w.field_h[var4.field_y.field_x]) {
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
                  if (var7.field_y != ((hi) this).field_w) {
                    var6++;
                    continue L2;
                  } else {
                    ((hi) this).field_k.a((byte) -113, (oh) (Object) new kl(var4, ((hi) this).field_w.field_i, ((hi) this).field_s, ((hi) this).field_w, ((hi) this).field_m.field_x, ((hi) this).field_g, ((hi) this).field_m));
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
    }

    private final void b(boolean param0, int param1) {
        wf[] var3 = null;
        int var4 = 0;
        wf var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = ((hi) this).field_e;
        var4 = param1;
        L0: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (!(var5 instanceof ac)) {
              if (var5 instanceof kl) {
                this.a((byte) -124, (kl) (Object) var5, param0);
                var4++;
                continue L0;
              } else {
                throw new RuntimeException("prioritizedTasks contains invalid task for Star " + var5.field_n.field_I + ".");
              }
            } else {
              this.a((ac) (Object) var5, param0, 95);
              var4++;
              continue L0;
            }
          }
        }
    }

    public final int a(boolean param0) {
        if (param0) {
            ((hi) this).field_c = null;
        }
        return 8;
    }

    private final void a(int param0, byte param1, ln param2, ln param3) {
        RuntimeException var5 = null;
        mg var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param2 != null) {
                  if (param0 == 0) {
                    return;
                  } else {
                    if (param0 < 0) {
                      throw new RuntimeException();
                    } else {
                      if (((hi) this).field_w == param3.field_y) {
                        L2: {
                          if (param2.field_R == param3.field_R) {
                            break L2;
                          } else {
                            if (param3.b(param2, (byte) 10)) {
                              break L2;
                            } else {
                              throw new RuntimeException(((hi) this).field_w.field_t + " is attempting an invalid move from " + param3.field_I + " to " + param2.field_I + ".");
                            }
                          }
                        }
                        var5_ref = (mg) (Object) param3.field_s.c(-128);
                        L3: while (true) {
                          L4: {
                            if (var5_ref == null) {
                              break L4;
                            } else {
                              L5: {
                                if (var5_ref.field_G != ((hi) this).field_w) {
                                  break L5;
                                } else {
                                  if (param2 != var5_ref.field_y) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var5_ref = (mg) (Object) param3.field_s.b(32);
                              continue L3;
                            }
                          }
                          L6: {
                            if (var5_ref == null) {
                              break L6;
                            } else {
                              if (var5_ref.field_z > param0) {
                                var5_ref.field_z = var5_ref.field_z - param0;
                                var5_ref.field_y.field_J = var5_ref.field_y.field_J + param0;
                                return;
                              } else {
                                var5_ref.b((byte) -82);
                                var5_ref.a(16);
                                var5_ref.d(true);
                                var5_ref.field_y.field_J = var5_ref.field_y.field_J + var5_ref.field_z;
                                param0 = param0 - var5_ref.field_z;
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
                              var5_ref = (mg) (Object) ed.field_g.d(0);
                              L8: while (true) {
                                L9: {
                                  if (var5_ref == null) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (((hi) this).field_w != var5_ref.field_G) {
                                        break L10;
                                      } else {
                                        if (var5_ref.field_y != param3) {
                                          break L10;
                                        } else {
                                          if (param2 != var5_ref.field_B) {
                                            break L10;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    var5_ref = (mg) (Object) ed.field_g.a((byte) -71);
                                    continue L8;
                                  }
                                }
                                if (var5_ref != null) {
                                  var5_ref.field_z = var5_ref.field_z + param0;
                                  return;
                                } else {
                                  var5_ref = new mg(param3, param2, param0);
                                  ed.field_g.a((byte) -113, (oh) (Object) var5_ref);
                                  break L0;
                                }
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        throw new RuntimeException(((hi) this).field_w.field_t + " is attempting to move fleets from a system it does not own: " + param3.field_I + ".");
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
            var5 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var5;
            stackOut_47_1 = new StringBuilder().append("hi.B(").append(param0).append(44).append(param1).append(44);
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          L12: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L12;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    private final int a(boolean param0, ln[] param1, ln param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_47_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            var11 = 0;
            L1: while (true) {
              L2: {
                if (~var11 <= ~param1.length) {
                  break L2;
                } else {
                  L3: {
                    if (param1[var11].field_y != ((hi) this).field_w) {
                      break L3;
                    } else {
                      if (q.field_Ab[param1[var11].field_p] != 0) {
                        L4: {
                          var7 = 0;
                          if (param0) {
                            var12 = param1[var11].field_D;
                            var13 = 0;
                            L5: while (true) {
                              if (~var12.length >= ~var13) {
                                L6: {
                                  if (!param0) {
                                    break L6;
                                  } else {
                                    if (var7 == 1) {
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
                                var10_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                                L8: while (true) {
                                  if (var10_ref == null) {
                                    break L4;
                                  } else {
                                    if (var10_ref != param1[var11].field_R) {
                                      var9++;
                                      var10_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                      continue L8;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              } else {
                                L9: {
                                  var14 = var12[var13];
                                  if (((hi) this).field_w == var14.field_y) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (var14.field_y == null) {
                                        break L10;
                                      } else {
                                        if (!((hi) this).field_w.field_h[var14.field_y.field_x]) {
                                          break L10;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    var7++;
                                    break L9;
                                  }
                                }
                                var13++;
                                continue L5;
                              }
                            }
                          } else {
                            L11: {
                              if (!param0) {
                                break L11;
                              } else {
                                if (var7 == 1) {
                                  break L11;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L12: {
                              var8 = q.field_Ab[param1[var11].field_p];
                              var10_ref = null;
                              if (var8 > param4) {
                                var8 = param4;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var9 = 0;
                            var10_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                            L13: while (true) {
                              if (var10_ref == null) {
                                break L4;
                              } else {
                                if (var10_ref != param1[var11].field_R) {
                                  var9++;
                                  var10_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                  continue L13;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        if (var10_ref == null) {
                          throw new RuntimeException("Cannot find territory of star " + ((hi) this).field_w.field_t + " wants to attack from: " + param1[var11].field_I + ".");
                        } else {
                          L14: {
                            if (((hi) this).field_n[var9] >= var8) {
                              break L14;
                            } else {
                              var8 = ((hi) this).field_n[var9];
                              break L14;
                            }
                          }
                          this.a(var8, (byte) 115, param2, param1[var11]);
                          q.field_Ab[param1[var11].field_p] = q.field_Ab[param1[var11].field_p] - var8;
                          var6_int = var6_int + var8;
                          ((hi) this).field_n[var9] = ((hi) this).field_n[var9] - var8;
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
                  field_a = null;
                  break L15;
                }
              }
              stackOut_47_0 = var6_int;
              stackIn_48_0 = stackOut_47_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var6;
            stackOut_49_1 = new StringBuilder().append("hi.E(").append(param0).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L16;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L16;
            }
          }
          L17: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw r.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_48_0;
    }

    public final void a(fs param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ((hi) this).field_q[param0.field_x];
              var7 = var3_int;
              if (-1 == var7) {
                var4 = 10;
                break L1;
              } else {
                if (var7 != -2) {
                  if (var7 == -3) {
                    var4 = 12;
                    var6 = ((hi) this).field_m.field_m[-2 + ((hi) this).field_m.field_r];
                    var5 = ((hi) this).field_m.field_m[((hi) this).field_m.field_r + -1];
                    if (var5 == ((hi) this).field_w.field_x) {
                      break L1;
                    } else {
                      if (var5 == ((hi) this).field_r) {
                        break L1;
                      } else {
                        if (((hi) this).field_m.field_D[var5] * 2 > ((hi) this).field_m.field_D[var6] * 3) {
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
              if (var4 != -1) {
                ((hi) this).field_c.a(0, (byte) -109, param0, ((hi) this).field_w, var4);
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
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("hi.LA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    private final void a(ln param0) {
        Object var3 = null;
        qm var4 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (((hi) this).field_w.field_u[0] >= 5) {
              if (!no.field_b) {
                if (((hi) this).field_w == param0.field_y) {
                  if (!param0.field_u) {
                    vj.field_E.a((byte) -113, (oh) (Object) new qm(0, ((hi) this).field_w, param0));
                    no.field_b = true;
                    qo.field_e = param0;
                    break L0;
                  } else {
                    throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net in a system that already has one: " + param0.field_I);
                  }
                } else {
                  throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net in a system it doesn't own: " + param0.field_I);
                }
              } else {
                var3 = null;
                var4 = (qm) (Object) vj.field_E.d(0);
                L1: while (true) {
                  L2: {
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var4.field_o == 0) {
                        var3 = (Object) (Object) var4;
                        break L2;
                      } else {
                        var4 = (qm) (Object) vj.field_E.a((byte) -71);
                        continue L1;
                      }
                    }
                  }
                  if (var3 != null) {
                    throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net it has already used." + " Already deployed at star " + ((qm) var3).field_q.field_I + ", now trying to deploy ot " + param0.field_I);
                  } else {
                    throw new RuntimeException(((hi) this).field_w.field_t + "'s deployedDefensiveNet variable incorrectly set to true.");
                  }
                }
              }
            } else {
              throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net it doesn't have at star " + param0.field_I);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_18_0 = var3;
            stackOut_18_1 = new StringBuilder().append("hi.H(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 31308 + 41);
        }
    }

    private final int a(int param0, fs param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fs var5 = null;
        fs var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        ln var11_ref_ln = null;
        int var11 = 0;
        int var12 = 0;
        int var16 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.field_x;
              if (((hi) this).field_w == param1) {
                break L1;
              } else {
                if (((hi) this).field_w.field_h[var4_int]) {
                  break L1;
                } else {
                  if (0 == (((hi) this).field_m.field_w & 1 << var4_int)) {
                    if (((hi) this).field_g == var4_int) {
                      stackOut_11_0 = 6;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      L2: {
                        var5 = ((hi) this).field_m.field_v[((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r]];
                        var6 = ((hi) this).field_m.field_v[((hi) this).field_m.field_m[-2 + ((hi) this).field_m.field_r]];
                        if (((hi) this).field_g != -1) {
                          break L2;
                        } else {
                          if (param1 == var5) {
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var7 = 0;
                      var8 = 0;
                      var9_ref_ln__ = ((hi) this).field_m.field_g.field_e;
                      var10_int = 0;
                      L3: while (true) {
                        if (var9_ref_ln__.length <= var10_int) {
                          var7 = var7 - -(var7 * (50 + -((hi) this).field_j) / 250);
                          if (var7 <= var8 * 2) {
                            L4: {
                              if (((hi) this).field_g == -1) {
                                break L4;
                              } else {
                                if (param1.field_h[((hi) this).field_g]) {
                                  stackOut_29_0 = 7;
                                  stackIn_30_0 = stackOut_29_0;
                                  return stackIn_30_0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              if (((hi) this).field_g != -1) {
                                break L5;
                              } else {
                                if (!var5.field_h[var4_int]) {
                                  break L5;
                                } else {
                                  stackOut_33_0 = 2;
                                  stackIn_34_0 = stackOut_33_0;
                                  return stackIn_34_0;
                                }
                              }
                            }
                            L6: {
                              if (-1 == ((hi) this).field_g) {
                                break L6;
                              } else {
                                if (var5 != param1) {
                                  break L6;
                                } else {
                                  if (((hi) this).field_g == var5.field_x) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (((hi) this).field_w.field_x != ((hi) this).field_g) {
                                        stackOut_40_0 = -2;
                                        stackIn_41_0 = stackOut_40_0;
                                        break L7;
                                      } else {
                                        stackOut_39_0 = -3;
                                        stackIn_41_0 = stackOut_39_0;
                                        break L7;
                                      }
                                    }
                                    return stackIn_41_0;
                                  }
                                }
                              }
                            }
                            L8: {
                              if (((hi) this).field_g != -1) {
                                break L8;
                              } else {
                                if (var6 != param1) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (var5 == ((hi) this).field_w) {
                                      stackOut_46_0 = -3;
                                      stackIn_47_0 = stackOut_46_0;
                                      break L9;
                                    } else {
                                      stackOut_45_0 = -2;
                                      stackIn_47_0 = stackOut_45_0;
                                      break L9;
                                    }
                                  }
                                  return stackIn_47_0;
                                }
                              }
                            }
                            L10: {
                              var9 = ((hi) this).field_m.field_D[var4_int];
                              var9 = var9 + var9 * (50 + -((hi) this).field_j) / 250;
                              if (var7 >= var8) {
                                break L10;
                              } else {
                                if (((hi) this).field_m.field_D[((hi) this).field_w.field_x] * 2 <= 3 * var9) {
                                  break L10;
                                } else {
                                  stackOut_50_0 = 3;
                                  stackIn_51_0 = stackOut_50_0;
                                  return stackIn_51_0;
                                }
                              }
                            }
                            var10 = oe.field_g[((hi) this).field_w.field_x];
                            var11 = param0;
                            var12 = 0;
                            L11: while (true) {
                              if (((hi) this).field_m.field_g.field_e.length <= var12) {
                                L12: {
                                  if (var11 >= 5) {
                                    break L12;
                                  } else {
                                    if (var11 >= param0) {
                                      break L12;
                                    } else {
                                      stackOut_61_0 = 4;
                                      stackIn_62_0 = stackOut_61_0;
                                      return stackIn_62_0;
                                    }
                                  }
                                }
                                stackOut_63_0 = -3;
                                stackIn_64_0 = stackOut_63_0;
                                break L0;
                              } else {
                                L13: {
                                  if (!jf.field_e[var12]) {
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var12++;
                                continue L11;
                              }
                            }
                          } else {
                            stackOut_24_0 = -1;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          }
                        } else {
                          L14: {
                            var11_ref_ln = var9_ref_ln__[var10_int];
                            if (((hi) this).field_w != var11_ref_ln.field_y) {
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var10_int++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var4;
            stackOut_65_1 = new StringBuilder().append("hi.GA(").append(param0).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L15;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L15;
            }
          }
          throw r.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + 44 + 3 + 41);
        }
        return stackIn_64_0;
    }

    private final void a(int param0, int param1, sd param2) {
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        qa var6 = null;
        ln var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        Object stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = null;
            var5 = 0;
            var6_int = 57 / ((26 - param1) / 33);
            var7 = param2.j(18229);
            L1: while (true) {
              if (var7 == null) {
                var6 = (qa) (Object) bk.field_a.d(0);
                L2: while (true) {
                  if (var6 == null) {
                    var6_ref = param2.j(18229);
                    L3: while (true) {
                      if (var6_ref == null) {
                        this.a(-1, (ln) var4, param2.field_x);
                        ((hi) this).field_i[param0] = 0;
                        ((hi) this).field_n[param0] = 0;
                        ((hi) this).field_y[param0] = true;
                        break L0;
                      } else {
                        L4: {
                          if ((Object) (Object) var6_ref == var4) {
                            break L4;
                          } else {
                            this.a(var6_ref.field_x, (byte) 110, (ln) var4, var6_ref);
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
                    var6 = (qa) (Object) bk.field_a.a((byte) -71);
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
                  if (var9 >= 4) {
                    L7: {
                      if (var5 >= var8) {
                        break L7;
                      } else {
                        var4 = (Object) (Object) var7;
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
            var4 = (Object) (Object) decompiledCaughtException;
            stackOut_22_0 = var4;
            stackOut_22_1 = new StringBuilder().append("hi.G(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    private final void a(int param0, ln param1, int param2) {
        qa var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 != 0) {
              param1.field_J = param1.field_J + param2;
              var4 = (qa) (Object) bk.field_a.d(0);
              L1: while (true) {
                if (var4 == null) {
                  bk.field_a.a((byte) -113, (oh) (Object) new qa(param1, param2));
                  break L0;
                } else {
                  if (var4.field_u != param1) {
                    var4 = (qa) (Object) bk.field_a.a((byte) -71);
                    continue L1;
                  } else {
                    var4.field_v = var4.field_v + param2;
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4_ref;
            stackOut_11_1 = new StringBuilder().append("hi.M(").append(-1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
    }

    public final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        fs[] var4 = null;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!((hi) this).field_w.field_i.g(param0 ^ 82)) {
            break L0;
          } else {
            ((hi) this).field_p = false;
            break L0;
          }
        }
        if (!((hi) this).field_p) {
          return;
        } else {
          if (((hi) this).field_m.field_o.field_j) {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                var11 = null;
                this.a((ac) null, false, -5);
                break L1;
              }
            }
            ((hi) this).field_r = -1;
            var2 = ((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r];
            var3 = ((hi) this).field_m.field_D[var2];
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= ((hi) this).field_m.field_r) {
                L3: {
                  var4 = ((hi) this).field_m.field_x.b(0);
                  if (1 != var4.length) {
                    ((hi) this).field_g = -1;
                    break L3;
                  } else {
                    ((hi) this).field_g = var4[0].field_x;
                    break L3;
                  }
                }
                L4: {
                  this.b(true);
                  if (-1 == ((hi) this).field_r) {
                    break L4;
                  } else {
                    L5: {
                      var5 = ((hi) this).field_m.field_v[((hi) this).field_r];
                      if (((hi) this).field_f[((hi) this).field_r] > 0) {
                        break L5;
                      } else {
                        L6: {
                          var9 = ((hi) this).field_q[((hi) this).field_r];
                          if (var9 != -1) {
                            if (-2 == var9) {
                              var6 = 8;
                              break L6;
                            } else {
                              if (var9 != -3) {
                                var6 = -1;
                                break L6;
                              } else {
                                var6 = 9;
                                var7 = ((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r];
                                var8 = ((hi) this).field_m.field_m[((hi) this).field_m.field_r + -2];
                                if (var7 == ((hi) this).field_w.field_x) {
                                  break L6;
                                } else {
                                  if (((hi) this).field_r != var7) {
                                    if (((hi) this).field_m.field_D[var8] * 3 < ((hi) this).field_m.field_D[var7] * 2) {
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
                        if (var6 != -1) {
                          ((hi) this).field_c.a(0, (byte) -109, var5, ((hi) this).field_w, var6);
                          ((hi) this).field_f[((hi) this).field_r] = rg.a(6, 3, (byte) 104);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((hi) this).field_c.a((byte) -63, ((hi) this).field_w, var5);
                    break L4;
                  }
                }
                return;
              } else {
                if (var2 == var4_int) {
                  ((hi) this).field_v[var4_int] = 3;
                  var4_int++;
                  continue L2;
                } else {
                  if (2 * ((hi) this).field_m.field_D[var4_int] >= var3) {
                    ((hi) this).field_v[var4_int] = ((hi) this).field_v[var4_int] - 1;
                    var4_int++;
                    continue L2;
                  } else {
                    ((hi) this).field_v[var4_int] = 0;
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

    final static int a(int param0, Random param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 > 0) {
              if (!eo.a(param0, 7433)) {
                var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
                L1: while (true) {
                  var4 = param1.nextInt();
                  if (var4 >= var3_int) {
                    continue L1;
                  } else {
                    int discarded$2 = -102;
                    stackOut_8_0 = jf.a(param0, var4);
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  }
                }
              } else {
                stackOut_4_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> 32);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("hi.T(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + -11 + 41);
        }
        return stackIn_9_0;
    }

    private final int[] b(fs param0) {
        RuntimeException var3 = null;
        int[] var3_array = null;
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
        int stackIn_6_0 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_21_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var15 = new int[((hi) this).field_x];
            var3_array = var15;
            var4 = new boolean[((hi) this).field_x];
            var5 = ((hi) this).field_m.field_g.field_e;
            var6 = 0;
            L1: while (true) {
              if (var6 >= ((hi) this).field_x) {
                var6 = 1;
                L2: while (true) {
                  if (var6 == 0) {
                    stackOut_21_0 = (int[]) var15;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    var6 = 0;
                    var7 = 0;
                    L3: while (true) {
                      if (((hi) this).field_x <= var7) {
                        continue L2;
                      } else {
                        L4: {
                          if (!var4[var7]) {
                            break L4;
                          } else {
                            var4[var7] = false;
                            var8 = var5[var7];
                            var9 = 1 + var15[var7];
                            var10 = var8.field_D;
                            var11 = 0;
                            L5: while (true) {
                              if (var11 >= var10.length) {
                                break L4;
                              } else {
                                L6: {
                                  var12 = var10[var11];
                                  var13 = var12.field_p;
                                  if (var9 >= var15[var13]) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L7: {
                  if (var5[var6].field_y != param0) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L7;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L7;
                  }
                }
                L8: {
                  var7 = stackIn_6_0;
                  var4[var6] = var7 != 0;
                  stackOut_6_0 = (int[]) var15;
                  stackOut_6_1 = var6;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var7 == 0) {
                    stackOut_8_0 = (int[]) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 2147483647;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L8;
                  } else {
                    stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L8;
                  }
                }
                stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("hi.N(");
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
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + -97 + 41);
        }
        return stackIn_22_0;
    }

    public final void a(int param0) {
        int var2 = 0;
        fs[] var3 = null;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 63 % ((-36 - param0) / 38);
        var3 = ((hi) this).field_m.field_v;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (((hi) this).field_w != var5) {
              var6 = vc.a((byte) -39, 2) + 14;
              ((hi) this).field_c.a(0, (byte) -27, var5, ((hi) this).field_w, var6);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void f() {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        ac var6_ref = null;
        ln[] var6_array = null;
        qm var6_ref2 = null;
        int var7 = 0;
        ln var7_ref_ln = null;
        lo var8 = null;
        ln var8_ref = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var6 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (5 > ((hi) this).field_w.field_u[1]) {
          return;
        } else {
          L0: {
            var2 = null;
            var4 = 92;
            var3 = 2147483647;
            var5 = 2147483647;
            if (!((hi) this).field_m.field_o.field_i) {
              var6_ref = (ac) (Object) ((hi) this).field_u.d(0);
              L1: while (true) {
                if (var6_ref == null) {
                  break L0;
                } else {
                  L2: {
                    var7_ref_ln = var6_ref.field_n;
                    if (var7_ref_ln.field_L != 0) {
                      break L2;
                    } else {
                      var8_int = 0;
                      var9 = 0;
                      var10 = 0;
                      L3: while (true) {
                        L4: {
                          if (var10 >= 4) {
                            break L4;
                          } else {
                            var9 = var9 + var7_ref_ln.field_G[var10];
                            if (var7_ref_ln.field_R.field_u[var10] >= var7_ref_ln.field_G[var10]) {
                              var10++;
                              continue L3;
                            } else {
                              var8_int = 1;
                              break L4;
                            }
                          }
                        }
                        if (var8_int == 0) {
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
                          var2 = (Object) (Object) var7_ref_ln;
                          var3 = var9;
                          break L2;
                        } else {
                          var6_ref = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                          continue L1;
                        }
                      }
                    }
                  }
                  var6_ref = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                  continue L1;
                }
              }
            } else {
              var6_ref = (ac) (Object) ((hi) this).field_u.d(0);
              var8 = ((hi) this).field_w.field_m;
              L6: while (true) {
                if (var6_ref == null) {
                  break L0;
                } else {
                  L7: {
                    var7_ref_ln = var6_ref.field_n;
                    if (var7_ref_ln.field_L != 0) {
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
                            var10 = var10 + var7_ref_ln.field_G[var11];
                            if (var8.field_u[var11] < var7_ref_ln.field_G[var11]) {
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
                          var2 = (Object) (Object) var7_ref_ln;
                          break L7;
                        }
                      }
                    }
                  }
                  var6_ref = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                  continue L6;
                }
              }
            }
          }
          var6_array = ((hi) this).field_m.field_g.field_e;
          var7 = 0;
          L11: while (true) {
            if (var6_array.length <= var7) {
              L12: {
                if (var2 == null) {
                  break L12;
                } else {
                  var6_ref2 = new qm(1, ((hi) this).field_w, (ln) var2);
                  vj.field_E.a((byte) -113, (oh) (Object) var6_ref2);
                  break L12;
                }
              }
              return;
            } else {
              var8_ref = var6_array[var7];
              var2 = (Object) (Object) var8_ref;
              if (var8_ref.field_y == ((hi) this).field_w) {
                if (!no.field_f[var8_ref.field_p]) {
                  if (var8_ref.field_L == 0) {
                    L13: {
                      var9 = 0;
                      var10 = 0;
                      if (((hi) this).field_m.field_o.field_i) {
                        var11 = 0;
                        L14: while (true) {
                          if (var11 >= 4) {
                            break L13;
                          } else {
                            var10 = var10 + var8_ref.field_G[var11];
                            if (var8_ref.field_G[var11] > ((hi) this).field_w.field_m.field_u[var11]) {
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
                          if (var11 >= 4) {
                            break L13;
                          } else {
                            var10 = var10 + var8_ref.field_G[var11];
                            if (var8_ref.field_G[var11] > var8_ref.field_R.field_u[var11]) {
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
                              if (var5 > 0) {
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
                      var2 = (Object) (Object) var8_ref;
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

    private final void e() {
        ln var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        ((hi) this).field_u.a(0);
        sd var6 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
        int var3 = 0;
        while (var6 != null) {
            var4 = var6.j(18229);
            while (var4 != null) {
                if (!(!no.field_f[var4.field_p])) {
                    ((hi) this).field_u.a((byte) -113, (oh) (Object) new ac(var4, ((hi) this).field_s[var3], ((hi) this).field_w.field_h, ((hi) this).field_m.field_x));
                }
                var4 = var6.h(-23410);
            }
            var3++;
            var6 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
        }
    }

    private final void a(sd param0, int param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ln var5 = null;
        ln[] var5_array = null;
        ln[] var6_ref_ln__ = null;
        int var6 = 0;
        int var7 = 0;
        ln var7_ref_ln = null;
        ln var8_ref_ln = null;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        int stackIn_32_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = param0.j(18229);
            L1: while (true) {
              if (var5 == null) {
                if (var4_int == 0) {
                  L2: {
                    ((hi) this).field_n[param1] = 0;
                    if (!((hi) this).field_m.field_o.field_i) {
                      this.a(-1, param0.field_q, ((hi) this).field_i[param1]);
                      ((hi) this).field_i[param1] = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  var5_array = new ln[var4_int];
                  var6 = 0;
                  var7_ref_ln = param0.j(18229);
                  L3: while (true) {
                    if (var7_ref_ln == null) {
                      var7 = ((hi) this).field_n[param1] / var4_int;
                      ((hi) this).field_e = new wf[var4_int];
                      var9 = 0;
                      L4: while (true) {
                        if (var9 >= var5_array.length) {
                          L5: {
                            int discarded$1 = 7270;
                            this.b();
                            if (!((hi) this).field_m.field_o.field_i) {
                              var4_int = var5_array.length;
                              var7 = ((hi) this).field_i[param1] / var4_int;
                              var9 = 0;
                              L6: while (true) {
                                if (var9 >= var5_array.length) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (((hi) this).field_i[param1] % var4_int != 0) {
                                      stackOut_39_0 = 1;
                                      stackIn_40_0 = stackOut_39_0;
                                      break L7;
                                    } else {
                                      stackOut_38_0 = 0;
                                      stackIn_40_0 = stackOut_38_0;
                                      break L7;
                                    }
                                  }
                                  var8 = stackIn_40_0;
                                  this.a(-1, var5_array[var9], var8 + var7);
                                  ((hi) this).field_i[param1] = ((hi) this).field_i[param1] - (var7 - -var8);
                                  var4_int--;
                                  var9++;
                                  continue L6;
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          ((hi) this).field_e = new wf[]{};
                          break L0;
                        } else {
                          L8: {
                            ((hi) this).field_e[var9] = (wf) (Object) new ac(var5_array[var9], new int[4], ((hi) this).field_w.field_h, ((hi) this).field_m.field_x);
                            if (((hi) this).field_n[param1] % var4_int == 0) {
                              stackOut_31_0 = 0;
                              stackIn_32_0 = stackOut_31_0;
                              break L8;
                            } else {
                              stackOut_30_0 = 1;
                              stackIn_32_0 = stackOut_30_0;
                              break L8;
                            }
                          }
                          var8 = stackIn_32_0;
                          kq.field_c[var5_array[var9].field_p] = var7 - -var8;
                          ((hi) this).field_n[param1] = ((hi) this).field_n[param1] - (var8 + var7);
                          var4_int--;
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      var12 = var7_ref_ln.field_D;
                      var8_ref_ln__ = var7_ref_ln.field_D;
                      var9 = 0;
                      L9: while (true) {
                        L10: {
                          if (var9 >= var12.length) {
                            break L10;
                          } else {
                            var10 = var12[var9];
                            if (var10.field_y != ((hi) this).field_w) {
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
                      var8_ref_ln = var6_ref_ln__[var7];
                      if (((hi) this).field_w != var8_ref_ln.field_y) {
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
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("hi.A(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 44 + -122 + 41);
        }
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        oe.field_g = new int[((hi) this).field_m.field_r][];
        ((hi) this).field_r = -1;
        jf.field_e = new boolean[((hi) this).field_m.field_g.field_e.length];
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= oe.field_g.length) {
            var2 = oe.field_g[((hi) this).field_w.field_x];
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((hi) this).field_m.field_g.field_e.length) {
                var4 = 0;
                L2: while (true) {
                  if (((hi) this).field_m.field_r <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ((hi) this).field_m.field_r) {
                        return;
                      } else {
                        var5 = ((hi) this).field_m.field_m[var4];
                        if (((hi) this).field_q[var5] < 0) {
                          ((hi) this).field_r = var5;
                          var4++;
                          continue L3;
                        } else {
                          var4++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    int discarded$2 = 3;
                    ((hi) this).field_q[var4] = this.a(var3, ((hi) this).field_m.field_v[var4]);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                if (((hi) this).field_m.field_g.field_e[var4].field_y != ((hi) this).field_w) {
                  var5 = 1;
                  var6 = 0;
                  L4: while (true) {
                    L5: {
                      if (var6 >= ((hi) this).field_m.field_r) {
                        break L5;
                      } else {
                        if (((hi) this).field_w.field_x != var6) {
                          if (((hi) this).field_w.field_h[var6]) {
                            if (oe.field_g[var6][var4] <= var2[var4]) {
                              var5 = 0;
                              break L5;
                            } else {
                              var6++;
                              continue L4;
                            }
                          } else {
                            var6++;
                            continue L4;
                          }
                        } else {
                          var6++;
                          continue L4;
                        }
                      }
                    }
                    jf.field_e[var4] = var5 != 0;
                    if (var5 != 0) {
                      var3++;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  jf.field_e[var4] = false;
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            int discarded$3 = -97;
            oe.field_g[var2_int] = this.b(((hi) this).field_m.field_v[var2_int]);
            var2_int++;
            continue L0;
          }
        }
    }

    final static bi[] a(int param0, byte param1) {
        bi[] var3 = new bi[9];
        bi[] var2 = var3;
        var3[4] = gr.a((byte) -52, param0, 64);
        return var2;
    }

    private final void i(int param0) {
        ln[] var2 = null;
        int var3 = 0;
        ln var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = ((hi) this).field_m.field_g.field_e;
        var3 = 0;
        L0: while (true) {
          if (var2.length <= var3) {
            L1: {
              if (param0 == 15401) {
                break L1;
              } else {
                ((hi) this).field_c = null;
                break L1;
              }
            }
            return;
          } else {
            var4 = var2[var3];
            no.field_f[var4.field_p] = false;
            if (var4.field_y == ((hi) this).field_w) {
              var5 = var4.field_D;
              var6 = 0;
              L2: while (true) {
                if (var5.length > var6) {
                  var7 = var5[var6];
                  if (null != var7.field_y) {
                    if (var7.field_y != ((hi) this).field_w) {
                      if (!((hi) this).field_w.field_h[var7.field_y.field_x]) {
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
        ((hi) this).field_p = param0 ? true : false;
        if (param1 != -6861) {
            this.c((byte) 46);
        }
    }

    private final void g() {
        int var2 = 0;
        co var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = (co) (Object) ((hi) this).field_l.d(0);
        L0: while (true) {
          if (var3 == null) {
            var3 = (co) (Object) ((hi) this).field_l.d(0);
            L1: while (true) {
              if (var3 == null) {
                var4 = 0;
                L2: while (true) {
                  if (kq.field_c.length <= var4) {
                    return;
                  } else {
                    kq.field_c[var4] = 0;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                var2 = var3.field_n.field_p;
                var4 = 0;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var5 >= 2) {
                      break L4;
                    } else {
                      var6 = var3.field_n.field_R.j(18229);
                      L5: while (true) {
                        if (var6 == null) {
                          var4 = 1;
                          var5++;
                          continue L3;
                        } else {
                          L6: {
                            if (var6 == var3.field_n) {
                              break L6;
                            } else {
                              if (q.field_Ab[var6.field_p] == 0) {
                                break L6;
                              } else {
                                L7: {
                                  if (var4 != 0) {
                                    break L7;
                                  } else {
                                    if (!no.field_f[var6.field_p]) {
                                      break L7;
                                    } else {
                                      var6 = var3.field_n.field_R.h(-23410);
                                      continue L5;
                                    }
                                  }
                                }
                                if (q.field_Ab[var6.field_p] < kq.field_c[var2]) {
                                  this.a(q.field_Ab[var6.field_p], (byte) 103, var3.field_n, var6);
                                  kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var6.field_p];
                                  q.field_Ab[var6.field_p] = 0;
                                  break L6;
                                } else {
                                  this.a(kq.field_c[var2], (byte) 102, var3.field_n, var6);
                                  q.field_Ab[var6.field_p] = q.field_Ab[var6.field_p] - kq.field_c[var2];
                                  kq.field_c[var2] = 0;
                                  break L4;
                                }
                              }
                            }
                          }
                          var6 = var3.field_n.field_R.h(-23410);
                          continue L5;
                        }
                      }
                    }
                  }
                  var3 = (co) (Object) ((hi) this).field_l.a((byte) -71);
                  continue L1;
                }
              }
            }
          } else {
            var2 = var3.field_n.field_p;
            if (0 <= kq.field_c[var2]) {
              L8: {
                if (kq.field_c[var2] < q.field_Ab[var2]) {
                  q.field_Ab[var2] = q.field_Ab[var2] - kq.field_c[var2];
                  kq.field_c[var2] = 0;
                  break L8;
                } else {
                  kq.field_c[var2] = kq.field_c[var2] - q.field_Ab[var2];
                  q.field_Ab[var2] = 0;
                  break L8;
                }
              }
              var3 = (co) (Object) ((hi) this).field_l.a((byte) -71);
              continue L0;
            } else {
              throw new RuntimeException(((hi) this).field_m.field_g.field_e[var2].field_I + " has " + kq.field_c[var2] + " fleets assigned to garrison it!");
            }
          }
        }
    }

    private final void e(byte param0) {
        sd var2 = null;
        sd var3 = null;
        sd var4_ref_sd = null;
        int var4 = 0;
        int var5 = 0;
        Object var5_ref = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        ln[] var9 = null;
        int var9_int = 0;
        int var10 = 0;
        ln var10_ref_ln = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        ln[] var14_ref_ln__ = null;
        int var14 = 0;
        int var15 = 0;
        ln var16_ref_ln = null;
        int var16 = 0;
        ln[] var16_ref_ln__ = null;
        int var17 = 0;
        ln var18 = null;
        int var19 = 0;
        ln[] var20 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((hi) this).field_w.field_u[3] < 5) {
          return;
        } else {
          L0: {
            if (50 <= ((hi) this).field_t) {
              break L0;
            } else {
              if (((hi) this).field_j >= 50) {
                break L0;
              } else {
                if (((hi) this).field_w.field_i.e(0) > 1) {
                  L1: {
                    var3 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                    var4_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                    if (var4_ref_sd.g(-98) > var3.g(107)) {
                      var2 = var3;
                      var3 = var4_ref_sd;
                      break L1;
                    } else {
                      var2 = var4_ref_sd;
                      break L1;
                    }
                  }
                  var4_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
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
                                  var7 = (Object) (Object) var10_ref_ln;
                                  var9_int = var8;
                                  break L7;
                                }
                              }
                              var10_ref_ln = var3.h(-23410);
                              continue L3;
                            } else {
                              var5_ref = (Object) (Object) var10_ref_ln;
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
                                    var7 = (Object) (Object) var10_ref_ln;
                                    var9_int = var8;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var10_ref_ln = var2.h(-23410);
                                continue L9;
                              } else {
                                var6 = (Object) (Object) var10_ref_ln;
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
                                vj.field_E.a((byte) -113, (oh) (Object) new qm(3, ((hi) this).field_w, (ln) var5_ref, (ln) var6));
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
                      var4_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                      continue L2;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          var2 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
          var3 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
          L17: while (true) {
            if (var3 == null) {
              var5 = 0;
              var6 = null;
              var7 = (Object) (Object) var2.j(18229);
              L18: while (true) {
                if (var7 == null) {
                  if (var6 == null) {
                    throw new RuntimeException("TaskAI can't find any stars in territory from which to launch a Tannhauser");
                  } else {
                    var7 = null;
                    var8 = 0;
                    var9 = ((hi) this).field_m.field_g.field_e;
                    var10 = -10 / ((param0 - 13) / 50);
                    var11 = 0;
                    L19: while (true) {
                      if (var11 >= var9.length) {
                        L20: {
                          if (var7 != null) {
                            vj.field_E.a((byte) -113, (oh) (Object) new qm(3, ((hi) this).field_w, (ln) var6, (ln) var7));
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        return;
                      } else {
                        var12 = var9[var11];
                        var7 = (Object) (Object) var12;
                        if (var12.field_R != ((ln) var6).field_R) {
                          L21: {
                            if (var12.field_y == ((hi) this).field_w) {
                              break L21;
                            } else {
                              if (null == var12.field_y) {
                                break L21;
                              } else {
                                if (!((hi) this).field_w.field_h[var12.field_y.field_x]) {
                                  break L21;
                                } else {
                                  var11++;
                                  continue L19;
                                }
                              }
                            }
                          }
                          L22: {
                            if (var12.field_y != ((hi) this).field_w) {
                              break L22;
                            } else {
                              if (((hi) this).field_j < 90) {
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
                                var16_ref_ln = var14_ref_ln__[var15];
                                var7 = (Object) (Object) var16_ref_ln;
                                if (((ln) var6).field_R != var16_ref_ln.field_R) {
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
                                if (var16 >= 4) {
                                  L26: {
                                    if (!((hi) this).field_b) {
                                      break L26;
                                    } else {
                                      if (36 == var12.field_p) {
                                        var14 = var14 + ((hi) this).field_j / 2;
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                  L27: {
                                    var15 = var12.field_x;
                                    if (!((hi) this).field_h) {
                                      break L27;
                                    } else {
                                      if (var12.field_L == 2) {
                                        L28: {
                                          if (!((hi) this).field_m.field_o.field_i) {
                                            var16 = ((ln) var6).field_R.field_r;
                                            break L28;
                                          } else {
                                            var16 = ((hi) this).field_w.field_m.field_r;
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
                                          if (var12.field_y.field_x == ((hi) this).field_g) {
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
                                  var16_ref_ln__ = var12.field_D;
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
                                      var16 = (var14 << 16) / var15;
                                      if (var8 < var16) {
                                        var7 = (Object) (Object) var12;
                                        var8 = var16;
                                        var11++;
                                        continue L19;
                                      } else {
                                        var11++;
                                        continue L19;
                                      }
                                    } else {
                                      var18 = var20[var17];
                                      if (var18.field_y != ((hi) this).field_w) {
                                        if (var18.field_y != null) {
                                          var15 = var15 + var18.field_x;
                                          if (!((hi) this).field_m.field_o.field_l) {
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
                      var4 = ((ln) var7).field_x;
                      if (((ln) var7).field_u) {
                        break L34;
                      } else {
                        if ((Object) (Object) qo.field_e == var7) {
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
                  var7 = (Object) (Object) var2.h(-23410);
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
              var3 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
              continue L17;
            }
          }
        }
    }

    private final void a(byte param0, ln param1) {
        Object var3 = null;
        qm var4 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        Object stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (5 > ((hi) this).field_w.field_u[2]) {
              throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Stellar Bomb it doesn't have at star " + param1.field_I);
            } else {
              if (mr.field_f) {
                var3 = null;
                var4 = (qm) (Object) vj.field_E.d(0);
                L1: while (true) {
                  L2: {
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (2 == var4.field_o) {
                        var3 = (Object) (Object) var4;
                        break L2;
                      } else {
                        var4 = (qm) (Object) vj.field_E.a((byte) -71);
                        continue L1;
                      }
                    }
                  }
                  if (var3 == null) {
                    throw new RuntimeException(((hi) this).field_w.field_t + "'s deployedStellarBomb variable incorrectly set to true.");
                  } else {
                    if (((qm) var3).field_q == km.field_u) {
                      throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Stellar Bomb it has already used." + " Already deployed at star " + ((qm) var3).field_q.field_I + ", now trying to deploy at " + param1.field_I);
                    } else {
                      throw new RuntimeException(((hi) this).field_w.field_t + ": TaskAI.deployStellarBomb: targetStellarBomb is not the star the ProjectUse points at." + " targetStellarBomb: " + km.field_u.field_I + ", bomb.s1: " + ((qm) var3).field_q);
                    }
                  }
                }
              } else {
                if (((hi) this).field_w != param1.field_y) {
                  vj.field_E.a((byte) -113, (oh) (Object) new qm(2, ((hi) this).field_w, param1));
                  mr.field_f = true;
                  km.field_u = param1;
                  break L0;
                } else {
                  throw new RuntimeException(((hi) this).field_w.field_t + " is trying to Stellar Bomb itself at star " + param1.field_I);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_21_0 = var3;
            stackOut_21_1 = new StringBuilder().append("hi.CA(").append(-82).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    private final void a(byte param0, kl param1, boolean param2) {
        ln[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        sd var9_ref_sd = null;
        int var10 = 0;
        int var11 = 0;
        ln[] var11_ref_ln__ = null;
        ln[] var12 = null;
        int var12_int = 0;
        int var13 = 0;
        ln var13_ref_ln = null;
        ln var14 = null;
        ln[] var14_array = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        ln var16_ref_ln = null;
        ln[] var17 = null;
        int var18 = 0;
        ln var19 = null;
        int var20 = 0;
        Object var21 = null;
        sd var21_ref = null;
        int var22 = 0;
        int stackIn_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        var21 = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = param1.field_n.field_D;
        var5 = new int[var4.length];
        var6 = 0;
        var7 = 0;
        var8_int = 0;
        L0: while (true) {
          if (var4.length <= var8_int) {
            var8 = new int[((hi) this).field_w.field_i.e(0)];
            var9 = 0;
            L1: while (true) {
              if (~var9 <= ~var4.length) {
                var9 = 0;
                var11 = 0;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var8.length) {
                    L3: {
                      if (!((hi) this).field_m.field_o.field_i) {
                        var10 = 0;
                        L4: while (true) {
                          if (~var8.length >= ~var10) {
                            break L3;
                          } else {
                            L5: {
                              if (var8[var10] <= 0) {
                                break L5;
                              } else {
                                var9 = var9 + ((hi) this).field_i[var10];
                                break L5;
                              }
                            }
                            var10++;
                            continue L4;
                          }
                        }
                      } else {
                        var9 = var9 + ((hi) this).field_i[0];
                        break L3;
                      }
                    }
                    L6: {
                      var10 = param1.field_i * (-((hi) this).field_t + 50) / 250 + param1.field_i;
                      if (!param2) {
                        break L6;
                      } else {
                        L7: {
                          if (param1.field_n == km.field_u) {
                            L8: {
                              param1.field_i = param1.field_n.field_x / 2;
                              if (null != param1.field_n.field_y) {
                                var11_ref_ln__ = var4;
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
                          var10 = param1.field_i - -(param1.field_i * (-((hi) this).field_t + 50) / 250);
                          if (var9 < var10) {
                            stackOut_45_0 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            break L11;
                          } else {
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            break L11;
                          }
                        }
                        L12: {
                          var11 = stackIn_46_0;
                          if (var11 != 0) {
                            break L12;
                          } else {
                            if (mr.field_f) {
                              break L12;
                            } else {
                              if (((hi) this).field_w.field_u[2] < 5) {
                                break L12;
                              } else {
                                if (param1.field_n.field_x >= 5) {
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
                                  var13 = var12_int - -(var12_int * (50 + -((hi) this).field_t) / 250);
                                  if (var13 <= var9) {
                                    L15: {
                                      this.a((byte) -82, param1.field_n);
                                      var11 = 1;
                                      param1.field_i = param1.field_n.field_x / 2;
                                      if (null == param1.field_n.field_y) {
                                        break L15;
                                      } else {
                                        var14_array = var4;
                                        var15 = 0;
                                        L16: while (true) {
                                          if (var14_array.length <= var15) {
                                            break L15;
                                          } else {
                                            L17: {
                                              var16_ref_ln = var14_array[var15];
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
                                    var10 = param1.field_i + param1.field_i * (50 - ((hi) this).field_t) / 250;
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
                              if (((hi) this).field_w.field_u[2] < 5) {
                                break L19;
                              } else {
                                if (param1.field_n.field_x >= 25) {
                                  L20: {
                                    this.a((byte) -82, param1.field_n);
                                    param1.field_i = param1.field_n.field_x / 2;
                                    if (null == param1.field_n.field_y) {
                                      break L20;
                                    } else {
                                      var12 = var4;
                                      var13 = 0;
                                      L21: while (true) {
                                        if (var12.length <= var13) {
                                          break L20;
                                        } else {
                                          L22: {
                                            var14 = var12[var13];
                                            var19 = var14;
                                            if (param1.field_n.field_y != var14.field_y) {
                                              break L22;
                                            } else {
                                              param1.field_i = param1.field_i + var14.field_x;
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
                                  var10 = (-((hi) this).field_t + 50) * param1.field_i / 250 + param1.field_i;
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
                            if (var9 == 0) {
                              return;
                            } else {
                              var10 = var10 * 3 / 10;
                              if (var10 != 0) {
                                break L25;
                              } else {
                                var10 = 1;
                                break L25;
                              }
                            }
                          }
                        }
                        var11 = 0;
                        var12 = (ln[]) var4.clone();
                        var13 = 1;
                        L26: while (true) {
                          if (var13 == 0) {
                            L27: {
                              var11 = this.a(true, var12, param1.field_n, 102, var10);
                              if (~var10 >= ~var11) {
                                break L27;
                              } else {
                                var11 = var11 + this.a(false, var12, param1.field_n, 84, -var11 + var10);
                                break L27;
                              }
                            }
                            L28: {
                              var10 = var10 - var11;
                              if (var10 > 0) {
                                if (((hi) this).field_m.field_o.field_i) {
                                  L29: {
                                    if (~var10 >= ~((hi) this).field_i[0]) {
                                      break L29;
                                    } else {
                                      if (param2) {
                                        throw new RuntimeException(((hi) this).field_w.field_t + " has decided to attack a system, but appears not to have sufficient fleets to carry through.");
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                  L30: {
                                    var15 = var10;
                                    if (~var10 >= ~((hi) this).field_i[0]) {
                                      break L30;
                                    } else {
                                      var15 = ((hi) this).field_i[0];
                                      break L30;
                                    }
                                  }
                                  var16 = 0;
                                  L31: while (true) {
                                    L32: {
                                      if (~var12.length >= ~var16) {
                                        break L32;
                                      } else {
                                        if (var12[var16].field_y == ((hi) this).field_w) {
                                          this.a(-1, var12[var16], var15);
                                          this.a(var15, (byte) 93, param1.field_n, var12[var16]);
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
                                      if (((hi) this).field_i.length <= var16) {
                                        var11 = var11 + var15;
                                        break L28;
                                      } else {
                                        ((hi) this).field_i[var16] = ((hi) this).field_i[var16] - var15;
                                        var16++;
                                        continue L33;
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_int__ = new int[((hi) this).field_i.length];
                                  var16 = 0;
                                  L34: while (true) {
                                    if (var15_ref_int__.length <= var16) {
                                      int discarded$1 = 47;
                                      nm.a(var15_ref_int__, (int[]) ((hi) this).field_i.clone());
                                      var16 = 0;
                                      L35: while (true) {
                                        L36: {
                                          if (var16 >= ((hi) this).field_i.length) {
                                            break L36;
                                          } else {
                                            L37: {
                                              if (((hi) this).field_i[var15_ref_int__[var16]] == 0) {
                                                break L37;
                                              } else {
                                                var17 = var4;
                                                var18 = 0;
                                                L38: while (true) {
                                                  L39: {
                                                    if (~var18 <= ~var17.length) {
                                                      break L39;
                                                    } else {
                                                      L40: {
                                                        var19 = var17[var18];
                                                        if (((hi) this).field_w != var19.field_y) {
                                                          break L40;
                                                        } else {
                                                          var20 = 0;
                                                          var21_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                                                          L41: while (true) {
                                                            L42: {
                                                              if (var21_ref == null) {
                                                                break L42;
                                                              } else {
                                                                if (var21_ref == var19.field_R) {
                                                                  break L42;
                                                                } else {
                                                                  var20++;
                                                                  var21_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                                                  continue L41;
                                                                }
                                                              }
                                                            }
                                                            if (var21_ref == null) {
                                                              throw new RuntimeException("Cannot find Territory that " + ((hi) this).field_w.field_t + "'s star belongs to: " + var19.field_I);
                                                            } else {
                                                              if (~var20 == ~var15_ref_int__[var16]) {
                                                                if (~((hi) this).field_i[var20] >= ~var10) {
                                                                  this.a(-1, var19, ((hi) this).field_i[var20]);
                                                                  this.a(((hi) this).field_i[var20], (byte) 100, param1.field_n, var19);
                                                                  var10 = var10 - ((hi) this).field_i[var20];
                                                                  ((hi) this).field_i[var20] = 0;
                                                                  break L39;
                                                                } else {
                                                                  this.a(-1, var19, var10);
                                                                  this.a(var10, (byte) 116, param1.field_n, var19);
                                                                  ((hi) this).field_i[var20] = ((hi) this).field_i[var20] - var10;
                                                                  var10 = 0;
                                                                  break L39;
                                                                }
                                                              } else {
                                                                break L40;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var18++;
                                                      continue L38;
                                                    }
                                                  }
                                                  if (0 == var10) {
                                                    break L36;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            continue L35;
                                          }
                                        }
                                        break L28;
                                      }
                                    } else {
                                      var15_ref_int__[var16] = var16;
                                      var16++;
                                      continue L34;
                                    }
                                  }
                                }
                              } else {
                                break L28;
                              }
                            }
                            L43: {
                              if (var10 <= 0) {
                                break L43;
                              } else {
                                if (!param2) {
                                  break L43;
                                } else {
                                  throw new RuntimeException("After full attack movement, " + ((hi) this).field_w.field_t + " still hasn't sent enough fleets to " + param1.field_n.field_I);
                                }
                              }
                            }
                            break L24;
                          } else {
                            var13 = 0;
                            var15 = 0;
                            L44: while (true) {
                              if (~var15 <= ~(-1 + var12.length)) {
                                continue L26;
                              } else {
                                L45: {
                                  if (q.field_Ab[var12[var15].field_p] > q.field_Ab[var12[var15 + 1].field_p]) {
                                    var14 = var12[var15];
                                    var19 = var14;
                                    var12[var15] = var12[var15 + 1];
                                    var13 = 1;
                                    var12[1 + var15] = var14;
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                                var15++;
                                continue L44;
                              }
                            }
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                    return;
                  } else {
                    L46: {
                      if (~((hi) this).field_n[var10] <= ~var8[var10]) {
                        break L46;
                      } else {
                        var8[var10] = ((hi) this).field_n[var10];
                        break L46;
                      }
                    }
                    var9 = var9 + var8[var10];
                    var10++;
                    continue L2;
                  }
                }
              } else {
                L47: {
                  if (var5[var9] == -1) {
                    break L47;
                  } else {
                    var8[var5[var9]] = var8[var5[var9]] + q.field_Ab[var4[var9].field_p];
                    break L47;
                  }
                }
                var9++;
                continue L1;
              }
            }
          } else {
            L48: {
              if (var4[var8_int].field_y == ((hi) this).field_w) {
                var7 = 0;
                var6 = 0;
                var9_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                L49: while (true) {
                  L50: {
                    if (var9_ref_sd == null) {
                      break L50;
                    } else {
                      if (var4[var8_int].field_R != var9_ref_sd) {
                        var6++;
                        var9_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                        continue L49;
                      } else {
                        var7 = 1;
                        break L50;
                      }
                    }
                  }
                  if (var7 == 0) {
                    throw new RuntimeException("Can't find the Territory of a star owned by the AI: " + var4[var8_int].field_I);
                  } else {
                    var5[var8_int] = var6;
                    break L48;
                  }
                }
              } else {
                var5[var8_int] = -1;
                break L48;
              }
            }
            var8_int++;
            continue L0;
          }
        }
    }

    hi(fs param0, dc param1, mn param2) {
        RuntimeException var4 = null;
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
        ((hi) this).field_l = new pf();
        ((hi) this).field_u = new pf();
        ((hi) this).field_k = new pf();
        ((hi) this).field_h = false;
        ((hi) this).field_b = false;
        try {
          L0: {
            L1: {
              ((hi) this).field_c = param2;
              ((hi) this).field_m = param1;
              ((hi) this).field_w = param0;
              ((hi) this).field_x = ((hi) this).field_m.field_g.field_e.length;
              sf.a((byte) 124, ((hi) this).field_x);
              ((hi) this).field_p = true;
              ((hi) this).field_j = vc.a((byte) -39, 75) - -25;
              ((hi) this).field_t = vc.a((byte) -39, 75) - -25;
              ((hi) this).field_v = new int[((hi) this).field_m.field_r];
              ((hi) this).field_q = new int[((hi) this).field_m.field_r];
              ((hi) this).field_f = new int[((hi) this).field_m.field_r];
              if (!(((hi) this).field_m.field_x instanceof ui)) {
                break L1;
              } else {
                ((hi) this).field_b = true;
                break L1;
              }
            }
            L2: {
              if (!(((hi) this).field_m.field_x instanceof hp)) {
                break L2;
              } else {
                ((hi) this).field_h = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("hi.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Click to show the Victory window.";
        field_a = new vr(true, true, true, true, false, true, true, 0);
    }
}
