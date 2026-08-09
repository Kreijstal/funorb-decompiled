/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb extends gn {
    private int field_k;
    static String field_h;
    private int field_p;
    static String field_f;
    private ko field_j;
    private int field_q;
    private int field_r;
    private int field_e;
    hd[] field_i;
    private ut field_l;
    int field_n;
    static java.security.SecureRandom field_g;
    private String[] field_o;
    private int field_m;

    abstract void a(byte param0, int param1, int param2);

    final void b(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int stackIn_22_0 = 0;
        hd stackIn_25_0 = null;
        hd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        if (param0 == -16536) {
          L0: {
            this.a(3, param1);
            this.field_j.a(param0 ^ 4642, this.a(true, us.field_j, wt.field_x), this.a(true, kf.field_Eb, dn.field_yb));
            if (this.field_n != 0) {
              break L0;
            } else {
              if (0 != this.field_m) {
                break L0;
              } else {
                sp.c(this.a(false), -104);
                break L0;
              }
            }
          }
          L1: {
            if (this.field_n != 0) {
              if (this.field_n == 1) {
                var3 = 0;
                L2: while (true) {
                  if (this.field_i.length <= var3) {
                    this.field_q = 4096;
                    break L1;
                  } else {
                    L3: {
                      if (var3 != this.field_j.field_e) {
                        stackIn_22_0 = 0;
                        break L3;
                      } else {
                        stackIn_22_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        var4 = stackIn_22_0;
                        this.field_i[var3].b(0, param1);
                        stackIn_25_0 = this.field_i[var3];

                        if (!this.field_i[var3].field_lb) {
                          break L5;
                        } else {
                          stackIn_25_0 = (hd) ((Object) stackIn_25_0);

                          if (var4 == 0) {
                            break L5;
                          } else {
                            stackIn_26_0 = (hd) ((Object) stackIn_25_0);
                            stackIn_26_1 = 1;
                            break L4;
                          }
                        }
                      }
                      stackIn_26_0 = (hd) ((Object) stackIn_25_0);
                      stackIn_26_1 = 0;
                      break L4;
                    }
                    L6: {
                      stackIn_26_0.field_gb = stackIn_26_1 != 0;
                      if (1 != this.field_i[var3].field_sb) {
                        break L6;
                      } else {
                        this.a(118, var3);
                        this.e(param0 ^ -3410);
                        break L6;
                      }
                    }
                    if (null != this.field_o) {
                      if (null != this.field_o[var3]) {
                        if (this.field_i[var3].field_gb) {
                          qd.a((byte) -67, this.field_o[var3]);
                          var3++;
                          continue L2;
                        } else {
                          var3++;
                          continue L2;
                        }
                      } else {
                        var3++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (2 == this.field_n) {
                  L7: {
                    this.field_j.field_e = -1;
                    if (this.field_m > 0) {
                      this.field_m = this.field_m - 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_q = (this.field_m << 1827437548) / kh.field_q.length;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              L8: {
                fieldTemp$0 = this.field_m + 1;
                this.field_m = this.field_m + 1;
                if (fieldTemp$0 >= kh.field_q.length + -1) {
                  this.field_n = 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              this.field_q = kh.field_q[this.field_m];
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0, int param1);

    public static void c(boolean param0) {
        if (param0) {
            field_g = (java.security.SecureRandom) null;
        }
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final void b(boolean param0) {
        int var2;
        int var3;
        hd var4;
        int var4_int;
        int var5;
        int var6;
        int var7;
        hd var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var11 = Kickabout.field_G;
          var2 = this.field_m << -1379118556;
          if (-101 > (var2 ^ -1)) {
            var2 = 100;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            this.field_r = 11;
            break L1;
          }
        }
        L2: {
          on.a(0, 0, 640, 480, 0, var2);
          if (this.field_q == 4096) {
            this.a(32, this.field_p, this.field_k);
            var12 = 0;
            var3 = var12;
            L3: while (true) {
              if (this.field_i.length <= var12) {
                break L2;
              } else {
                var4 = this.field_i[var12];
                var4.a(100, false);
                var12++;
                continue L3;
              }
            }
          } else {
            var3 = this.field_e * this.field_q >> -495378324;
            var4_int = this.field_r * this.field_q >> 1054928844;
            var5 = -var3 + 640 >> 263412481;
            iw.a(73, this.field_l);
            var6 = -var4_int + 480 >> -102734239;
            this.a(32, 0, 0);
            var7 = 0;
            L4: while (true) {
              if (var7 >= this.field_i.length) {
                L5: {
                  ta.e(119);
                  var7 = (this.field_m << 1665782282) / kh.field_q.length;
                  if (var7 > 256) {
                    var7 = 256;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_l.d(var5, var6, var3, var4_int, var7);
                break L2;
              } else {
                var8 = this.field_i[var7];
                var9 = var8.field_s;
                var8.field_s = var8.field_s - this.field_p;
                var10 = var8.field_J;
                var8.field_J = var8.field_J - this.field_k;
                var8.b(0, false);
                var8.a(74, false);
                var8.field_J = var10;
                var8.field_s = var9;
                var7++;
                continue L4;
              }
            }
          }
        }
    }

    abstract void a(int param0, boolean param1);

    abstract int a(byte param0);

    final void a(String[] param0, byte param1) {
        try {
            this.field_o = param0;
            if (param1 != 90) {
                this.field_p = -12;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jb.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, byte param1, char param2) {
        int var5;
        var5 = Kickabout.field_G;
        if (1 == this.field_n) {
          L0: {
            if (-14 == (param0 ^ -1)) {
              this.e(19910);
              break L0;
            } else {
              L1: {
                this.field_j.a(0, true);
                if ((this.field_j.field_e ^ -1) != 0) {
                  L2: while (true) {
                    if (this.field_i[this.field_j.field_e].field_lb) {
                      break L1;
                    } else {
                      this.field_j.field_e = (this.field_j.field_e + 1) % this.field_j.field_a;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (this.field_j.field_e < 0) {
                break L0;
              } else {
                if (this.field_j.c(-1)) {
                  this.a(114, this.field_j.field_e);
                  this.e(19910);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L3: {
            if (param1 == -21) {
              break L3;
            } else {
              this.b(45, true);
              break L3;
            }
          }
          return true;
        } else {
          return true;
        }
    }

    abstract int a(boolean param0);

    private final int a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Kickabout.field_G;
        var4 = 0;
        if (param0) {
          L0: while (true) {
            if (this.field_i.length <= var4) {
              return -1;
            } else {
              var5 = this.field_i[var4].field_q;
              var6 = this.field_i[var4].field_mb;
              var7 = this.field_i[var4].field_F;
              var8 = this.field_i[var4].field_T;
              if (param2 >= var7) {
                if (var7 - -var5 > param2) {
                  if (param1 >= var8) {
                    if (param1 < var8 + var6) {
                      return var4;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return -67;
        }
    }

    abstract int b(int param0);

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -31268) {
            break L0;
          } else {
            this.field_q = 38;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_n != 2) {
              break L2;
            } else {
              if (this.field_m > 0) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void e(int param0) {
        this.field_n = 2;
        if (param0 != 19910) {
            this.field_m = 118;
        }
    }

    final void a(int param0, String[] param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        try {
            this.field_n = 0;
            if (param2 != 1054928844) {
                this.a(46, true);
            }
            this.field_q = 0;
            this.field_e = this.b(-1379118556);
            this.field_r = this.a((byte) 115);
            this.field_k = 480 + -this.field_r >> 1655863937;
            this.field_p = -this.field_e + 640 >> 5157505;
            this.field_l = new ut(this.field_e, this.field_r);
            this.field_i = new hd[param1.length];
            var4_int = this.field_i.length;
            var5 = -(95 * var4_int) - 5 * (var4_int + -1) + 640 >> -926467135;
            for (var6 = 0; this.field_i.length > var6; var6++) {
                param1[var6] = param1[var6].toLowerCase();
                this.field_i[var6] = eo.a(param1[var6], 7126504, un.field_d, 90, false);
                var7 = this.field_k + this.field_r + (-this.field_i[var6].field_mb + -10);
                this.field_i[var6].field_s = 100 * var6 + var5;
                this.field_i[var6].field_J = var7;
            }
            this.field_j = new ko(this.field_i.length);
            this.field_j.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jb.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        pt.a(param1 + this.field_e, param0 + -22946, param1, param2 + this.field_r, param2);
        for (var4 = 0; this.field_e > var4; var4++) {
            mk.field_a.d(var4 + param1, param2 - -this.field_r - 480);
        }
        cq.field_j.e(param1 - 10, 15 + param2, cq.field_j.field_o * 2 / 3, 2 * cq.field_j.field_v / 3, param0);
        this.a((byte) -29, param1, param2);
        on.c(param1, param2, this.field_e, this.field_r, 2, 65793);
        ta.e(124);
    }

    jb() {
        this.field_q = 0;
        this.field_m = 0;
    }

    static {
        field_f = "(<%0> players want to join)";
        field_h = "Kickabout is also availible as an application on <col=ffff00>Facebook</col>.";
    }
}
