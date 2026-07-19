/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends wi {
    private int field_N;
    static boolean field_w;
    private int field_K;
    private int field_t;
    private int field_q;
    int field_G;
    private int field_D;
    private int field_O;
    static int[] field_s;
    static int field_L;
    private int field_E;
    private int field_M;
    private int field_u;
    private String field_v;
    int field_H;
    int field_z;
    int field_J;
    private int field_F;
    static bd field_x;
    private int field_r;
    private fa field_I;
    static String field_B;
    int field_C;
    private boolean field_A;
    static dd field_y;

    final boolean a(byte param0) {
        if (param0 >= 67) {
          if (this.field_C <= ag.field_f) {
            if (this.field_H <= kc.field_b) {
              if (ag.field_f <= this.field_C - -this.field_G) {
                if (this.field_H + this.field_z < kc.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.c(-58);
          if (this.field_C <= ag.field_f) {
            if (this.field_H <= kc.field_b) {
              if (ag.field_f <= this.field_C - -this.field_G) {
                if (this.field_H + this.field_z < kc.field_b) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void d(int param0) {
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_79_0 = null;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        if (!this.field_k) {
          this.field_c = false;
          this.field_J = 0;
          return;
        } else {
          L0: {
            if (!this.a((byte) 70)) {
              break L0;
            } else {
              if (!this.field_A) {
                L1: {
                  stackOut_51_0 = this;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_52_0 = stackOut_51_0;
                  if (this.field_J >= 0) {
                    stackOut_53_0 = this;
                    stackOut_53_1 = this.field_J;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    break L1;
                  } else {
                    stackOut_52_0 = this;
                    stackOut_52_1 = -50;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    break L1;
                  }
                }
                ((ok) (this)).field_J = stackIn_54_1;
                break L0;
              } else {
                if (this.field_A) {
                  if (!this.a((byte) 71)) {
                    L2: {
                      stackOut_35_0 = this;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (-51 <= (this.field_J ^ -1)) {
                        stackOut_37_0 = this;
                        stackOut_37_1 = this.field_J;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L2;
                      } else {
                        stackOut_36_0 = this;
                        stackOut_36_1 = 50;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L2;
                      }
                    }
                    ((ok) (this)).field_J = stackIn_38_1;
                    if (!this.a((byte) 77)) {
                      this.field_J = this.field_J - 1;
                      if (param0 < 63) {
                        return;
                      } else {
                        this.field_A = this.a((byte) 112);
                        return;
                      }
                    } else {
                      this.field_J = this.field_J + 1;
                      if (!fleas.field_A) {
                        if (param0 >= 63) {
                          this.field_A = this.a((byte) 112);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.field_J = this.field_J - 1;
                        if (param0 < 63) {
                          return;
                        } else {
                          this.field_A = this.a((byte) 112);
                          return;
                        }
                      }
                    }
                  } else {
                    if (!this.a((byte) 77)) {
                      this.field_J = this.field_J - 1;
                      if (param0 < 63) {
                        return;
                      } else {
                        this.field_A = this.a((byte) 112);
                        return;
                      }
                    } else {
                      this.field_J = this.field_J + 1;
                      if (!fleas.field_A) {
                        if (param0 < 63) {
                          return;
                        } else {
                          this.field_A = this.a((byte) 112);
                          return;
                        }
                      } else {
                        this.field_J = this.field_J - 1;
                        if (param0 < 63) {
                          return;
                        } else {
                          this.field_A = this.a((byte) 112);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  if (!this.a((byte) 77)) {
                    this.field_J = this.field_J - 1;
                    if (param0 < 63) {
                      return;
                    } else {
                      this.field_A = this.a((byte) 112);
                      return;
                    }
                  } else {
                    this.field_J = this.field_J + 1;
                    if (!fleas.field_A) {
                      if (param0 < 63) {
                        return;
                      } else {
                        this.field_A = this.a((byte) 112);
                        return;
                      }
                    } else {
                      this.field_J = this.field_J - 1;
                      if (param0 < 63) {
                        return;
                      } else {
                        this.field_A = this.a((byte) 112);
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
          if (this.field_A) {
            if (!this.a((byte) 71)) {
              L3: {
                stackOut_79_0 = this;
                stackIn_81_0 = stackOut_79_0;
                stackIn_80_0 = stackOut_79_0;
                if (-51 <= (this.field_J ^ -1)) {
                  stackOut_81_0 = this;
                  stackOut_81_1 = this.field_J;
                  stackIn_82_0 = stackOut_81_0;
                  stackIn_82_1 = stackOut_81_1;
                  break L3;
                } else {
                  stackOut_80_0 = this;
                  stackOut_80_1 = 50;
                  stackIn_82_0 = stackOut_80_0;
                  stackIn_82_1 = stackOut_80_1;
                  break L3;
                }
              }
              ((ok) (this)).field_J = stackIn_82_1;
              if (!this.a((byte) 77)) {
                this.field_J = this.field_J - 1;
                if (param0 >= 63) {
                  this.field_A = this.a((byte) 112);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_J = this.field_J + 1;
                if (!fleas.field_A) {
                  if (param0 >= 63) {
                    this.field_A = this.a((byte) 112);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_J = this.field_J - 1;
                  if (param0 >= 63) {
                    this.field_A = this.a((byte) 112);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (!this.a((byte) 77)) {
                this.field_J = this.field_J - 1;
                if (param0 >= 63) {
                  this.field_A = this.a((byte) 112);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_J = this.field_J + 1;
                if (!fleas.field_A) {
                  if (param0 >= 63) {
                    this.field_A = this.a((byte) 112);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_J = this.field_J - 1;
                  if (param0 >= 63) {
                    this.field_A = this.a((byte) 112);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            if (!this.a((byte) 77)) {
              this.field_J = this.field_J - 1;
              if (param0 >= 63) {
                this.field_A = this.a((byte) 112);
                return;
              } else {
                return;
              }
            } else {
              this.field_J = this.field_J + 1;
              if (!fleas.field_A) {
                if (param0 >= 63) {
                  this.field_A = this.a((byte) 112);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_J = this.field_J - 1;
                if (param0 >= 63) {
                  this.field_A = this.a((byte) 112);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_y = null;
        field_s = null;
        field_B = null;
        if (param0) {
            return;
        }
        field_x = null;
    }

    final void c(int param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 5 * this.field_J;
          var3 = 123 % ((-41 - param0) / 48);
          if (var2 >= 0) {
            break L0;
          } else {
            var2 = 0;
            break L0;
          }
        }
        L1: {
          if (255 < var2) {
            var2 = 255;
            break L1;
          } else {
            break L1;
          }
        }
        if (0 == var2) {
          return;
        } else {
          gb.a(ia.field_q);
          gb.a(this.field_l, this.field_a, this.field_l + this.field_n, this.field_a + this.field_d);
          gb.g(1 + this.field_l, 1 + this.field_a, -2 + this.field_n, -2 + this.field_d, k.field_a & this.field_E, (this.field_E >>> ii.field_b) * var2 >>> -68548696);
          discarded$1 = this.field_I.a(this.field_v, this.field_l + this.field_O, 1 + this.field_a - -this.field_t, -this.field_O + (-this.field_q + this.field_n), -2 + this.field_d, this.field_N & k.field_a, this.field_r & k.field_a, (this.field_N >>> ii.field_b) * var2 >>> -1001241976, this.field_u, this.field_K, this.field_D);
          gb.e(this.field_l, this.field_a, this.field_n, this.field_d, this.field_F & k.field_a, (this.field_F >>> ii.field_b) * var2 >>> 1253381256);
          gb.b(ia.field_q);
          gb.g(this.field_l, this.field_a - -this.field_d, this.field_n, k.field_a & this.field_M, (this.field_M >>> ii.field_b) * var2 >>> 1881556424);
          gb.c(this.field_l + this.field_n, this.field_a, this.field_d - 1, k.field_a & this.field_M, (this.field_M >>> ii.field_b) * var2 >>> -1916087416);
          return;
        }
    }

    ok(int param0, int param1, String param2, fa param3) {
        RuntimeException var5 = null;
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
        this.field_K = 0;
        this.field_N = -16777216;
        this.field_O = 5;
        this.field_E = -63;
        this.field_u = 0;
        this.field_M = -2147483648;
        this.field_t = 0;
        this.field_J = 0;
        this.field_F = -16777216;
        this.field_r = -1;
        this.field_q = 5;
        try {
          L0: {
            this.field_I = param3;
            this.field_a = param1;
            this.field_v = param2;
            this.field_l = param0;
            this.field_n = this.field_q - (-this.field_O + (-(this.field_I.b(this.field_v) / 3) - 5));
            this.field_D = this.field_I.field_N;
            this.field_d = (int)((double)this.field_I.field_N * ((double)this.field_I.a(this.field_v, -this.field_O + -this.field_q + this.field_n) + 0.5));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var5);
            stackOut_3_1 = new StringBuilder().append("ok.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    static {
        field_s = new int[150];
        field_w = false;
        field_B = "Connection timed out. Please try using a different server.";
    }
}
