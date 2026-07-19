/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends hl {
    private int field_r;
    private int field_p;
    static de field_l;
    private float field_x;
    private int field_z;
    static boolean field_v;
    private int field_o;
    private int field_m;
    int field_i;
    static int field_t;
    private int field_A;
    private int field_y;
    static md field_j;
    static String field_u;
    private int field_n;
    private int field_k;
    int field_B;
    static int field_w;
    private int field_q;
    private int field_s;

    private final void a(int param0, byte param1, int param2) {
        this.field_B = param0;
        this.field_i = param2;
        this.field_r = this.field_i << 589895856;
        this.field_p = this.field_B << 1648814320;
        if (param1 != 44) {
          return;
        } else {
          this.a(true, 0);
          this.field_z = kj.b(param1 + -42, 500);
          return;
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != -99) {
          L0: {
            field_l = (de) null;
            var3 = this.field_m;
            if (3 == var3) {
              va.field_d[this.field_k][7 + this.field_s].a(this.field_x, param0 ^ -27887).a(this.field_B, this.field_i);
              break L0;
            } else {
              L1: {
                if (-7 >= (this.field_s ^ -1)) {
                  stackOut_14_0 = 11 + -this.field_s;
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                } else {
                  stackOut_13_0 = this.field_s;
                  stackIn_15_0 = stackOut_13_0;
                  break L1;
                }
              }
              var2 = stackIn_15_0;
              va.field_d[this.field_k][var2].a(this.field_x, 27788).a(this.field_B, this.field_i);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            var3 = this.field_m;
            if (3 == var3) {
              va.field_d[this.field_k][7 + this.field_s].a(this.field_x, param0 ^ -27887).a(this.field_B, this.field_i);
              break L2;
            } else {
              L3: {
                if (-7 >= (this.field_s ^ -1)) {
                  stackOut_6_0 = 11 + -this.field_s;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = this.field_s;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              var2 = stackIn_7_0;
              va.field_d[this.field_k][var2].a(this.field_x, 27788).a(this.field_B, this.field_i);
              break L2;
            }
          }
          return;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        var2 = kj.b(2, 2240);
        if (param0 <= -58) {
          if (var2 < 640) {
            this.a(var2, (byte) 44, -50);
            this.field_k = kj.b(2, 4);
            return;
          } else {
            var2 -= 640;
            if ((var2 ^ -1) <= -481) {
              var2 -= 480;
              if ((var2 ^ -1) <= -641) {
                this.a(640, (byte) 44, var2 - 640);
                this.field_k = kj.b(2, 4);
                return;
              } else {
                this.a(var2, (byte) 44, 480);
                this.field_k = kj.b(2, 4);
                return;
              }
            } else {
              this.a(-50, (byte) 44, var2);
              this.field_k = kj.b(2, 4);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void g(int param0) {
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var3 = HoldTheLine.field_D;
        int fieldTemp$8 = this.field_A - 1;
        this.field_A = this.field_A - 1;
        if (0 <= fieldTemp$8) {
          L0: {
            var2 = this.field_m;
            if (0 == var2) {
              fieldTemp$9 = this.field_z - 1;
              this.field_z = this.field_z - 1;
              if (0 < fieldTemp$9) {
                break L0;
              } else {
                this.a((byte) 50);
                this.field_i = this.field_r >> -1444941392;
                if (param0 == -19895) {
                  this.field_B = this.field_p >> 1266419312;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L1: {
                if (-3 == (var2 ^ -1)) {
                  break L1;
                } else {
                  if (1 == var2) {
                    break L1;
                  } else {
                    if (-4 == (var2 ^ -1)) {
                      this.field_r = this.field_r + this.field_o;
                      this.field_p = this.field_p + this.field_n;
                      fieldTemp$10 = this.field_z - 1;
                      this.field_z = this.field_z - 1;
                      if ((fieldTemp$10 ^ -1) < -1) {
                        break L0;
                      } else {
                        this.a(25500);
                        this.b((byte) -65);
                        this.field_i = this.field_r >> -1444941392;
                        if (param0 == -19895) {
                          this.field_B = this.field_p >> 1266419312;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      this.field_i = this.field_r >> -1444941392;
                      if (param0 == -19895) {
                        this.field_B = this.field_p >> 1266419312;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (!this.a(false)) {
                break L0;
              } else {
                this.a((byte) 62);
                this.field_i = this.field_r >> -1444941392;
                if (param0 == -19895) {
                  this.field_B = this.field_p >> 1266419312;
                  return;
                } else {
                  return;
                }
              }
            }
          }
          this.field_i = this.field_r >> -1444941392;
          if (param0 == -19895) {
            this.field_B = this.field_p >> 1266419312;
            return;
          } else {
            return;
          }
        } else {
          L2: {
            if ((this.field_m ^ -1) == -4) {
              stackOut_3_0 = 7;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = 11;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          var2 = stackIn_4_0;
          fieldTemp$11 = this.field_s + 1;
          this.field_s = this.field_s + 1;
          if (fieldTemp$11 < var2) {
            L3: {
              this.field_A = this.e(5);
              var2 = this.field_m;
              if (0 == var2) {
                fieldTemp$12 = this.field_z - 1;
                this.field_z = this.field_z - 1;
                if (0 < fieldTemp$12) {
                  break L3;
                } else {
                  this.a((byte) 50);
                  this.field_i = this.field_r >> -1444941392;
                  if (param0 != -19895) {
                    return;
                  } else {
                    this.field_B = this.field_p >> 1266419312;
                    return;
                  }
                }
              } else {
                if (-3 != (var2 ^ -1)) {
                  if (1 != var2) {
                    if (-4 == (var2 ^ -1)) {
                      this.field_r = this.field_r + this.field_o;
                      this.field_p = this.field_p + this.field_n;
                      fieldTemp$13 = this.field_z - 1;
                      this.field_z = this.field_z - 1;
                      if ((fieldTemp$13 ^ -1) < -1) {
                        break L3;
                      } else {
                        this.a(25500);
                        this.b((byte) -65);
                        this.field_i = this.field_r >> -1444941392;
                        if (param0 != -19895) {
                          return;
                        } else {
                          this.field_B = this.field_p >> 1266419312;
                          return;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    L4: {
                      if (!this.a(false)) {
                        break L4;
                      } else {
                        this.a((byte) 62);
                        break L4;
                      }
                    }
                    this.field_i = this.field_r >> -1444941392;
                    if (param0 != -19895) {
                      return;
                    } else {
                      this.field_B = this.field_p >> 1266419312;
                      return;
                    }
                  }
                } else {
                  L5: {
                    if (!this.a(false)) {
                      break L5;
                    } else {
                      this.a((byte) 62);
                      break L5;
                    }
                  }
                  this.field_i = this.field_r >> -1444941392;
                  if (param0 != -19895) {
                    return;
                  } else {
                    this.field_B = this.field_p >> 1266419312;
                    return;
                  }
                }
              }
            }
            this.field_i = this.field_r >> -1444941392;
            if (param0 != -19895) {
              return;
            } else {
              this.field_B = this.field_p >> 1266419312;
              return;
            }
          } else {
            this.field_s = 0;
            this.field_A = this.e(5);
            var2 = this.field_m;
            if (0 == var2) {
              fieldTemp$14 = this.field_z - 1;
              this.field_z = this.field_z - 1;
              if (0 >= fieldTemp$14) {
                this.a((byte) 50);
                this.field_i = this.field_r >> -1444941392;
                if (param0 != -19895) {
                  return;
                } else {
                  this.field_B = this.field_p >> 1266419312;
                  return;
                }
              } else {
                this.field_i = this.field_r >> -1444941392;
                if (param0 != -19895) {
                  return;
                } else {
                  this.field_B = this.field_p >> 1266419312;
                  return;
                }
              }
            } else {
              L6: {
                if (-3 == (var2 ^ -1)) {
                  break L6;
                } else {
                  if (1 == var2) {
                    break L6;
                  } else {
                    if (-4 == (var2 ^ -1)) {
                      this.field_r = this.field_r + this.field_o;
                      this.field_p = this.field_p + this.field_n;
                      fieldTemp$15 = this.field_z - 1;
                      this.field_z = this.field_z - 1;
                      if ((fieldTemp$15 ^ -1) < -1) {
                        this.field_i = this.field_r >> -1444941392;
                        if (param0 == -19895) {
                          this.field_B = this.field_p >> 1266419312;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.a(25500);
                        this.b((byte) -65);
                        this.field_i = this.field_r >> -1444941392;
                        if (param0 == -19895) {
                          this.field_B = this.field_p >> 1266419312;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      this.field_i = this.field_r >> -1444941392;
                      if (param0 != -19895) {
                        return;
                      } else {
                        this.field_B = this.field_p >> 1266419312;
                        return;
                      }
                    }
                  }
                }
              }
              if (this.a(false)) {
                this.a((byte) 62);
                this.field_i = this.field_r >> -1444941392;
                if (param0 == -19895) {
                  this.field_B = this.field_p >> 1266419312;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_i = this.field_r >> -1444941392;
                if (param0 == -19895) {
                  this.field_B = this.field_p >> 1266419312;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(int param0) {
        if (param0 != 25500) {
          this.a(-70);
          vb.a(param0 + -25551, bl.field_r.field_qb);
          p.a((byte) -61, this.field_B, this.field_i);
          p.a((byte) -61, this.field_B + 6, this.field_i);
          p.a((byte) -61, this.field_B - 6, this.field_i);
          p.a((byte) -61, this.field_B, this.field_i + 6);
          p.a((byte) -61, this.field_B, this.field_i + -6);
          ug.b(param0 + -25501);
          return;
        } else {
          vb.a(param0 + -25551, bl.field_r.field_qb);
          p.a((byte) -61, this.field_B, this.field_i);
          p.a((byte) -61, this.field_B + 6, this.field_i);
          p.a((byte) -61, this.field_B - 6, this.field_i);
          p.a((byte) -61, this.field_B, this.field_i + 6);
          p.a((byte) -61, this.field_B, this.field_i + -6);
          ug.b(param0 + -25501);
          return;
        }
    }

    public static void f(int param0) {
        field_l = null;
        if (param0 < 20) {
            vf.f(-50);
            field_u = null;
            return;
        }
        field_u = null;
    }

    private final void a(boolean param0, int param1) {
        this.field_m = param1;
        this.field_s = 0;
        this.field_A = this.e(5);
        if (!param0) {
            this.field_p = 114;
        }
    }

    final void a(ja param0, int param1, byte param2, int param3) {
        boolean discarded$0 = false;
        if (!((this.field_m ^ -1) != -4)) {
            return;
        }
        try {
            if (param2 < 6) {
                discarded$0 = this.c((byte) 80);
            }
            if (param0 != null) {
                param0.field_Sb = param0.field_Sb + 1;
            }
            this.a(true, 3);
            this.field_z = 4 * this.e(5);
            this.field_n = param1;
            this.field_o = param3;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "vf.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -109) {
          L0: {
            this.b((byte) 70);
            if (this.field_m == 3) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_m == 3) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private final int e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 5) {
          L0: {
            field_t = -26;
            if ((this.field_m ^ -1) != -4) {
              stackOut_7_0 = 5;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 2;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((this.field_m ^ -1) != -4) {
              stackOut_3_0 = 5;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 2;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    private final boolean a(boolean param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if ((this.field_m ^ -1) == -2) {
            stackOut_2_0 = 16384;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 4096;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        var3 = -(this.field_p >> -2028860408) + (this.field_q << -853447352);
        var4 = (this.field_y << -1970082872) + -(this.field_r >> 1918326984);
        var5 = pg.b(var4, 4805, var3);
        if (var5 < var2 >> -1387433848) {
          return true;
        } else {
          if (param0) {
            discarded$1 = this.e(-93);
            var4 = var4 * var2 / var5;
            var3 = var3 * var2 / var5;
            this.field_r = this.field_r + var4;
            this.field_p = this.field_p + var3;
            return false;
          } else {
            var4 = var4 * var2 / var5;
            var3 = var3 * var2 / var5;
            this.field_r = this.field_r + var4;
            this.field_p = this.field_p + var3;
            return false;
          }
        }
    }

    private final void a(byte param0) {
        int var3 = HoldTheLine.field_D;
        int var2 = 56 % ((param0 - 9) / 40);
        do {
            this.field_q = kj.b(2, 640);
            this.field_y = kj.b(2, 480);
        } while (!bl.field_r.a(0, this.field_y, true, this.field_q));
        this.a(true, 1);
        this.field_x = (float)Math.atan2((double)(this.field_i + -this.field_y), (double)(-this.field_B + this.field_q));
    }

    vf() {
        this.b((byte) -79);
    }

    static {
        field_u = "Kills";
        field_j = null;
    }
}
