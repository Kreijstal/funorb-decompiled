/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends ue {
    private m field_i;
    private boolean field_h;
    private int field_j;
    private boolean field_g;
    private boolean field_e;
    private re field_f;
    static String field_k;

    public static void b(boolean param0) {
        field_k = null;
        if (param0) {
            nc.b(false);
        }
    }

    final void b(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        String var3;
        String var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        L0: {
          this.field_f.b(8);
          var11 = qg.field_o;
          if (pc.field_y == 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {


          if (null == this.field_i) {

            stackIn_6_1 = 0;
            break L1;
          } else {

            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {
          var3 = gm.a(stackIn_3_0 != 0, stackIn_6_1 != 0, true, 12184);
          if (pc.field_y == 0) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {


          if (null == this.field_i) {

            stackIn_12_1 = 0;
            break L3;
          } else {

            stackIn_12_1 = 1;
            break L3;
          }
        }
        L4: {
          var4 = fp.a(stackIn_9_0 != 0, stackIn_12_1 != 0, true, (byte) -69);
          if (pc.field_y == 0) {
            stackIn_15_0 = 0;
            break L4;
          } else {
            stackIn_15_0 = 1;
            break L4;
          }
        }
        L5: {


          stackIn_17_1 = 0;

          stackIn_17_2 = 1;

          if (this.field_i == null) {

            stackIn_18_1 = stackIn_17_1;
            stackIn_18_2 = stackIn_17_2;
            stackIn_18_3 = 0;
            break L5;
          } else {

            stackIn_18_1 = stackIn_17_1;
            stackIn_18_2 = stackIn_17_2;
            stackIn_18_3 = 1;
            break L5;
          }
        }
        L6: {
          var5 = hj.a(stackIn_15_0 != 0, stackIn_18_1, stackIn_18_2 != 0, stackIn_18_3 != 0);
          var6 = go.field_l.a(var11);
          var7 = go.field_l.a(var3);
          if (var7 <= var6) {
            break L6;
          } else {
            var6 = var7;
            break L6;
          }
        }
        L7: {
          var7 = go.field_l.a(var4);
          if (var6 >= var7) {
            break L7;
          } else {
            var6 = var7;
            break L7;
          }
        }
        L8: {
          var7 = go.field_l.a(var5);
          if (var6 < var7) {
            var6 = var7;
            break L8;
          } else {
            break L8;
          }
        }
        var8 = -(var6 / 2) + 290;
        var9 = 640 - var8;
        var10 = var8 + this.field_j * (-var8 + var9) * this.field_j / 400;
        wi.a(var8, jn.field_o, 110, 260, (byte) -71, -var8 + var10);
        kh.d(var8 + param0, 118, var10 - var8 + -16, 244, 0, 192);
        if (0 != this.field_f.field_f) {
          return;
        } else {
          if ((this.field_j ^ -1) != -21) {
            return;
          } else {
            go.field_l.c(var11, 320, 150, 16760896, -1);
            go.field_l.c(var3, 320, 170, 16760896, -1);
            go.field_l.c(var4, 320, 275, 16760896, -1);
            go.field_l.c(var5, 320, 340, 16760896, -1);
            super.b(param0 ^ 0);
            return;
          }
        }
    }

    final boolean a(int param0) {
        if (0 != this.field_b.field_c) {
          if (1 != this.field_b.field_c) {
            if (param0 <= 99) {
              this.a(77);
              return false;
            } else {
              return false;
            }
          } else {
            if (!this.field_b.a(true)) {
              if (param0 <= 99) {
                this.a(77);
                return false;
              } else {
                return false;
              }
            } else {
              this.field_g = true;
              return true;
            }
          }
        } else {
          if (!this.field_b.a(true)) {
            if (1 == this.field_b.field_c) {
              if (this.field_b.a(true)) {
                this.field_g = true;
                return true;
              } else {
                if (param0 > 99) {
                  return false;
                } else {
                  this.a(77);
                  return false;
                }
              }
            } else {
              if (param0 <= 99) {
                this.a(77);
                return false;
              } else {
                return false;
              }
            }
          } else {
            this.field_e = true;
            return true;
          }
        }
    }

    final void a(boolean param0) {
        int var3;
        var3 = CrazyCrystals.field_B;
        if (!this.field_g) {
          if (this.field_e) {
            if (-1 > (this.field_j ^ -1)) {
              this.field_j = this.field_j - 1;
              this.field_f.c(2, 40, 180);
              if ((this.field_f.field_f ^ -1) <= -41) {
                if (!this.field_h) {
                  rk.a(0);
                  this.field_b.a(-1, true, -1);
                  this.field_h = true;
                  return;
                } else {
                  this.field_e = false;
                  this.field_h = false;
                  if (!rc.a(-56)) {
                    bq.a((byte) -12);
                    if (null == this.field_i) {
                      if (-1 == (pc.field_y ^ -1)) {
                        if (null == this.field_i) {
                          if (0 == mo.field_l) {
                            a.field_b = (ue) ((Object) new rb(this.field_f, true));
                            return;
                          } else {
                            a.field_b = (ue) ((Object) this.field_f);
                            this.field_f.a(this.field_b.field_i, -13880);
                            return;
                          }
                        } else {
                          this.field_i.d(136);
                          a.field_b = (ue) ((Object) this.field_i);
                          return;
                        }
                      } else {
                        a.field_b = (ue) ((Object) new vn(this.field_i, this.field_f, true));
                        return;
                      }
                    } else {
                      this.field_i.d(136);
                      if (-1 == (pc.field_y ^ -1)) {
                        if (null == this.field_i) {
                          if (0 != mo.field_l) {
                            a.field_b = (ue) ((Object) this.field_f);
                            this.field_f.a(this.field_b.field_i, -13880);
                            return;
                          } else {
                            a.field_b = (ue) ((Object) new rb(this.field_f, true));
                            return;
                          }
                        } else {
                          this.field_i.d(136);
                          a.field_b = (ue) ((Object) this.field_i);
                          return;
                        }
                      } else {
                        a.field_b = (ue) ((Object) new vn(this.field_i, this.field_f, true));
                        return;
                      }
                    }
                  } else {
                    L0: {
                      if (-21 < (this.field_j ^ -1)) {
                        this.field_j = this.field_j + 1;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    this.field_f.c(-1);
                    super.a(param0);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              this.field_f.c(2, 40, 180);
              if ((this.field_f.field_f ^ -1) <= -41) {
                if (!this.field_h) {
                  rk.a(0);
                  this.field_b.a(-1, true, -1);
                  this.field_h = true;
                  return;
                } else {
                  this.field_e = false;
                  this.field_h = false;
                  if (!rc.a(-56)) {
                    bq.a((byte) -12);
                    if (null == this.field_i) {
                      if (-1 == (pc.field_y ^ -1)) {
                        if (null == this.field_i) {
                          if (0 != mo.field_l) {
                            a.field_b = (ue) ((Object) this.field_f);
                            this.field_f.a(this.field_b.field_i, -13880);
                            return;
                          } else {
                            a.field_b = (ue) ((Object) new rb(this.field_f, true));
                            return;
                          }
                        } else {
                          this.field_i.d(136);
                          a.field_b = (ue) ((Object) this.field_i);
                          return;
                        }
                      } else {
                        a.field_b = (ue) ((Object) new vn(this.field_i, this.field_f, true));
                        return;
                      }
                    } else {
                      this.field_i.d(136);
                      if (-1 == (pc.field_y ^ -1)) {
                        if (null == this.field_i) {
                          if (0 != mo.field_l) {
                            a.field_b = (ue) ((Object) this.field_f);
                            this.field_f.a(this.field_b.field_i, -13880);
                            return;
                          } else {
                            a.field_b = (ue) ((Object) new rb(this.field_f, true));
                            return;
                          }
                        } else {
                          this.field_i.d(136);
                          a.field_b = (ue) ((Object) this.field_i);
                          return;
                        }
                      } else {
                        a.field_b = (ue) ((Object) new vn(this.field_i, this.field_f, true));
                        return;
                      }
                    }
                  } else {
                    L1: {
                      if (-21 < (this.field_j ^ -1)) {
                        this.field_j = this.field_j + 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    this.field_f.c(-1);
                    super.a(param0);
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L2: {
              if (-21 < (this.field_j ^ -1)) {
                this.field_j = this.field_j + 1;
                break L2;
              } else {
                break L2;
              }
            }
            this.field_f.c(-1);
            super.a(param0);
            return;
          }
        } else {
          if (this.field_j <= 0) {
            L3: {
              if (0 == this.field_j) {
                dg.a((byte) -85);
                a.field_b = (ue) ((Object) new rb(this.field_f, this.field_b.field_i));
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              this.field_j = this.field_j - 1;
              if (0 == this.field_j) {
                dg.a((byte) -85);
                a.field_b = (ue) ((Object) new rb(this.field_f, this.field_b.field_i));
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
    }

    nc(m param0, re param1) {
        super(2);
        try {
            this.field_i = param0;
            this.field_f = param1;
            this.field_d = new ik[2];
            this.field_b.field_c = -1;
            this.field_d[0] = (ik) ((Object) new mh(320, 190, si.field_a, 2));
            this.field_d[1] = (ik) ((Object) new mh(320, 295, fk.field_y, 2));
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Resume Game";
    }
}
