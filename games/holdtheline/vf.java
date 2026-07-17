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
        ((vf) this).field_B = param0;
        ((vf) this).field_i = param2;
        ((vf) this).field_r = ((vf) this).field_i << 16;
        ((vf) this).field_p = ((vf) this).field_B << 16;
        if (param1 != 44) {
          return;
        } else {
          this.a(true, 0);
          ((vf) this).field_z = kj.b(param1 + -42, 500);
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
            field_l = null;
            var3 = ((vf) this).field_m;
            if (3 == var3) {
              va.field_d[((vf) this).field_k][7 + ((vf) this).field_s].a(((vf) this).field_x, param0 ^ -27887).a(((vf) this).field_B, ((vf) this).field_i);
              break L0;
            } else {
              L1: {
                if (((vf) this).field_s >= 6) {
                  stackOut_14_0 = 11 + -((vf) this).field_s;
                  stackIn_15_0 = stackOut_14_0;
                  break L1;
                } else {
                  stackOut_13_0 = ((vf) this).field_s;
                  stackIn_15_0 = stackOut_13_0;
                  break L1;
                }
              }
              var2 = stackIn_15_0;
              va.field_d[((vf) this).field_k][var2].a(((vf) this).field_x, 27788).a(((vf) this).field_B, ((vf) this).field_i);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            var3 = ((vf) this).field_m;
            if (3 == var3) {
              va.field_d[((vf) this).field_k][7 + ((vf) this).field_s].a(((vf) this).field_x, param0 ^ -27887).a(((vf) this).field_B, ((vf) this).field_i);
              break L2;
            } else {
              L3: {
                if (((vf) this).field_s >= 6) {
                  stackOut_6_0 = 11 + -((vf) this).field_s;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = ((vf) this).field_s;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              var2 = stackIn_7_0;
              va.field_d[((vf) this).field_k][var2].a(((vf) this).field_x, 27788).a(((vf) this).field_B, ((vf) this).field_i);
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
            ((vf) this).field_k = kj.b(2, 4);
            return;
          } else {
            var2 -= 640;
            if (var2 >= 480) {
              var2 -= 480;
              if (var2 >= 640) {
                this.a(640, (byte) 44, var2 - 640);
                ((vf) this).field_k = kj.b(2, 4);
                return;
              } else {
                this.a(var2, (byte) 44, 480);
                ((vf) this).field_k = kj.b(2, 4);
                return;
              }
            } else {
              this.a(-50, (byte) 44, var2);
              ((vf) this).field_k = kj.b(2, 4);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var3 = HoldTheLine.field_D;
        int fieldTemp$14 = ((vf) this).field_A - 1;
        ((vf) this).field_A = ((vf) this).field_A - 1;
        if (0 <= fieldTemp$14) {
          L0: {
            var2 = ((vf) this).field_m;
            if (0 == var2) {
              int fieldTemp$15 = ((vf) this).field_z - 1;
              ((vf) this).field_z = ((vf) this).field_z - 1;
              if (0 < fieldTemp$15) {
                break L0;
              } else {
                this.a((byte) 50);
                ((vf) this).field_i = ((vf) this).field_r >> 16;
                if (param0 == -19895) {
                  ((vf) this).field_B = ((vf) this).field_p >> 16;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L1: {
                if (var2 == 2) {
                  break L1;
                } else {
                  if (1 == var2) {
                    break L1;
                  } else {
                    if (var2 == 3) {
                      ((vf) this).field_r = ((vf) this).field_r + ((vf) this).field_o;
                      ((vf) this).field_p = ((vf) this).field_p + ((vf) this).field_n;
                      int fieldTemp$16 = ((vf) this).field_z - 1;
                      ((vf) this).field_z = ((vf) this).field_z - 1;
                      if (fieldTemp$16 > 0) {
                        break L0;
                      } else {
                        this.a(25500);
                        this.b((byte) -65);
                        ((vf) this).field_i = ((vf) this).field_r >> 16;
                        if (param0 == -19895) {
                          ((vf) this).field_B = ((vf) this).field_p >> 16;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      ((vf) this).field_i = ((vf) this).field_r >> 16;
                      if (param0 == -19895) {
                        ((vf) this).field_B = ((vf) this).field_p >> 16;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              int discarded$17 = 0;
              if (!this.a()) {
                break L0;
              } else {
                this.a((byte) 62);
                ((vf) this).field_i = ((vf) this).field_r >> 16;
                if (param0 == -19895) {
                  ((vf) this).field_B = ((vf) this).field_p >> 16;
                  return;
                } else {
                  return;
                }
              }
            }
          }
          ((vf) this).field_i = ((vf) this).field_r >> 16;
          if (param0 == -19895) {
            ((vf) this).field_B = ((vf) this).field_p >> 16;
            return;
          } else {
            return;
          }
        } else {
          L2: {
            if (((vf) this).field_m == 3) {
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
          int fieldTemp$18 = ((vf) this).field_s + 1;
          ((vf) this).field_s = ((vf) this).field_s + 1;
          if (~fieldTemp$18 > ~var2) {
            L3: {
              int discarded$19 = 5;
              ((vf) this).field_A = this.e();
              var2 = ((vf) this).field_m;
              if (0 == var2) {
                int fieldTemp$20 = ((vf) this).field_z - 1;
                ((vf) this).field_z = ((vf) this).field_z - 1;
                if (0 < fieldTemp$20) {
                  break L3;
                } else {
                  this.a((byte) 50);
                  ((vf) this).field_i = ((vf) this).field_r >> 16;
                  if (param0 == -19895) {
                    ((vf) this).field_B = ((vf) this).field_p >> 16;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (var2 != 2) {
                  if (1 != var2) {
                    if (var2 == 3) {
                      ((vf) this).field_r = ((vf) this).field_r + ((vf) this).field_o;
                      ((vf) this).field_p = ((vf) this).field_p + ((vf) this).field_n;
                      int fieldTemp$21 = ((vf) this).field_z - 1;
                      ((vf) this).field_z = ((vf) this).field_z - 1;
                      if (fieldTemp$21 > 0) {
                        break L3;
                      } else {
                        this.a(25500);
                        this.b((byte) -65);
                        ((vf) this).field_i = ((vf) this).field_r >> 16;
                        if (param0 == -19895) {
                          ((vf) this).field_B = ((vf) this).field_p >> 16;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    L4: {
                      int discarded$22 = 0;
                      if (!this.a()) {
                        break L4;
                      } else {
                        this.a((byte) 62);
                        break L4;
                      }
                    }
                    ((vf) this).field_i = ((vf) this).field_r >> 16;
                    if (param0 == -19895) {
                      ((vf) this).field_B = ((vf) this).field_p >> 16;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L5: {
                    int discarded$23 = 0;
                    if (!this.a()) {
                      break L5;
                    } else {
                      this.a((byte) 62);
                      break L5;
                    }
                  }
                  ((vf) this).field_i = ((vf) this).field_r >> 16;
                  if (param0 == -19895) {
                    ((vf) this).field_B = ((vf) this).field_p >> 16;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            ((vf) this).field_i = ((vf) this).field_r >> 16;
            if (param0 == -19895) {
              ((vf) this).field_B = ((vf) this).field_p >> 16;
              return;
            } else {
              return;
            }
          } else {
            ((vf) this).field_s = 0;
            int discarded$24 = 5;
            ((vf) this).field_A = this.e();
            var2 = ((vf) this).field_m;
            if (0 == var2) {
              int fieldTemp$25 = ((vf) this).field_z - 1;
              ((vf) this).field_z = ((vf) this).field_z - 1;
              if (0 >= fieldTemp$25) {
                this.a((byte) 50);
                ((vf) this).field_i = ((vf) this).field_r >> 16;
                if (param0 == -19895) {
                  ((vf) this).field_B = ((vf) this).field_p >> 16;
                  return;
                } else {
                  return;
                }
              } else {
                ((vf) this).field_i = ((vf) this).field_r >> 16;
                if (param0 == -19895) {
                  ((vf) this).field_B = ((vf) this).field_p >> 16;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L6: {
                if (var2 == 2) {
                  break L6;
                } else {
                  if (1 == var2) {
                    break L6;
                  } else {
                    if (var2 == 3) {
                      ((vf) this).field_r = ((vf) this).field_r + ((vf) this).field_o;
                      ((vf) this).field_p = ((vf) this).field_p + ((vf) this).field_n;
                      int fieldTemp$26 = ((vf) this).field_z - 1;
                      ((vf) this).field_z = ((vf) this).field_z - 1;
                      if (fieldTemp$26 > 0) {
                        ((vf) this).field_i = ((vf) this).field_r >> 16;
                        if (param0 == -19895) {
                          ((vf) this).field_B = ((vf) this).field_p >> 16;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.a(25500);
                        this.b((byte) -65);
                        ((vf) this).field_i = ((vf) this).field_r >> 16;
                        if (param0 == -19895) {
                          ((vf) this).field_B = ((vf) this).field_p >> 16;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      ((vf) this).field_i = ((vf) this).field_r >> 16;
                      if (param0 == -19895) {
                        ((vf) this).field_B = ((vf) this).field_p >> 16;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              int discarded$27 = 0;
              if (this.a()) {
                this.a((byte) 62);
                ((vf) this).field_i = ((vf) this).field_r >> 16;
                if (param0 == -19895) {
                  ((vf) this).field_B = ((vf) this).field_p >> 16;
                  return;
                } else {
                  return;
                }
              } else {
                ((vf) this).field_i = ((vf) this).field_r >> 16;
                if (param0 == -19895) {
                  ((vf) this).field_B = ((vf) this).field_p >> 16;
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
          p.a((byte) -61, ((vf) this).field_B, ((vf) this).field_i);
          p.a((byte) -61, ((vf) this).field_B + 6, ((vf) this).field_i);
          p.a((byte) -61, ((vf) this).field_B - 6, ((vf) this).field_i);
          p.a((byte) -61, ((vf) this).field_B, ((vf) this).field_i + 6);
          p.a((byte) -61, ((vf) this).field_B, ((vf) this).field_i + -6);
          ug.b(param0 + -25501);
          return;
        } else {
          vb.a(param0 + -25551, bl.field_r.field_qb);
          p.a((byte) -61, ((vf) this).field_B, ((vf) this).field_i);
          p.a((byte) -61, ((vf) this).field_B + 6, ((vf) this).field_i);
          p.a((byte) -61, ((vf) this).field_B - 6, ((vf) this).field_i);
          p.a((byte) -61, ((vf) this).field_B, ((vf) this).field_i + 6);
          p.a((byte) -61, ((vf) this).field_B, ((vf) this).field_i + -6);
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
        ((vf) this).field_m = param1;
        ((vf) this).field_s = 0;
        int discarded$0 = 5;
        ((vf) this).field_A = this.e();
    }

    final void a(ja param0, int param1, byte param2, int param3) {
        if (!(((vf) this).field_m != 3)) {
            return;
        }
        try {
            if (param2 < 6) {
                boolean discarded$0 = ((vf) this).c((byte) 80);
            }
            if (param0 != null) {
                param0.field_Sb = param0.field_Sb + 1;
            }
            this.a(true, 3);
            int discarded$1 = 5;
            ((vf) this).field_z = 4 * this.e();
            ((vf) this).field_n = param1;
            ((vf) this).field_o = param3;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vf.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
            if (((vf) this).field_m == 3) {
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
            if (((vf) this).field_m == 3) {
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

    private final int e() {
        return ((vf) this).field_m == 3 ? 2 : 5;
    }

    private final boolean a() {
        int var2 = ((vf) this).field_m != 1 ? 4096 : 16384;
        int var3 = -(((vf) this).field_p >> 8) + (((vf) this).field_q << 8);
        int var4 = (((vf) this).field_y << 8) + -(((vf) this).field_r >> 8);
        int var5 = pg.b(var4, 4805, var3);
        if (!(var5 >= var2 >> 8)) {
            return true;
        }
        int discarded$0 = -93;
        int discarded$1 = this.e();
        var4 = var4 * var2 / var5;
        var3 = var3 * var2 / var5;
        ((vf) this).field_r = ((vf) this).field_r + var4;
        ((vf) this).field_p = ((vf) this).field_p + var3;
        return false;
    }

    private final void a(byte param0) {
        int var3 = HoldTheLine.field_D;
        int var2 = 56 % ((param0 - 9) / 40);
        do {
            ((vf) this).field_q = kj.b(2, 640);
            ((vf) this).field_y = kj.b(2, 480);
        } while (!bl.field_r.a(0, ((vf) this).field_y, true, ((vf) this).field_q));
        this.a(true, 1);
        ((vf) this).field_x = (float)Math.atan2((double)(((vf) this).field_i + -((vf) this).field_y), (double)(-((vf) this).field_B + ((vf) this).field_q));
    }

    vf() {
        this.b((byte) -79);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Kills";
        field_j = null;
    }
}
