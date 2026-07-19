/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends fb {
    static String field_g;
    private int[] field_o;
    private int field_j;
    private boolean field_n;
    static int field_i;
    private int field_h;
    static volatile boolean field_f;
    static dl field_m;
    private boolean field_l;
    private int[] field_k;

    public static void b(int param0) {
        field_g = null;
        field_m = null;
        if (param0 != -25) {
            em.b(122);
        }
    }

    final static void a(byte param0, dl param1) {
        try {
            if (param0 != 38) {
                em.b(5);
            }
            hd.a(false);
            kh.a(param1.field_w, param1.field_n, param1.field_o);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "em.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        var8 = this.field_k[this.field_j];
        if (-3 != (this.field_j ^ -1)) {
          L0: {
            if ((this.field_h ^ -1) > -5) {
              var8 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          if ((param1 ^ -1) == -25) {
            if (24 != param2) {
              if (!this.field_n) {
                ro.field_u[var8].b(param5, param6 - param2 * 2, param1 * 2, 4 * param2, 8421631);
                if (this.field_l) {
                  mj.field_f[var8].b(param5, param6 + -param2, param1 * 2, 3 * param2);
                  if (param3 > -59) {
                    field_m = (dl) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
                  if (param3 > -59) {
                    field_m = (dl) null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ro.field_u[var8].b(param5, param6 + -(param2 * 2), 2 * param1, param2 * 4);
                if (this.field_l) {
                  mj.field_f[var8].b(param5, param6 + -param2, param1 * 2, 3 * param2);
                  if (param3 <= -59) {
                    return;
                  } else {
                    field_m = (dl) null;
                    return;
                  }
                } else {
                  fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
                  if (param3 > -59) {
                    field_m = (dl) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L1: {
                if (this.field_n) {
                  ro.field_u[var8].a(param5, -(2 * param2) + param6);
                  break L1;
                } else {
                  ro.field_u[var8].c(param5, param6 - 2 * param2, 8421631);
                  break L1;
                }
              }
              if (!this.field_l) {
                fm.field_s[var8].c(param5, param6 - param2, ek.field_f[this.field_a.field_u]);
                if (param3 <= -59) {
                  return;
                } else {
                  field_m = (dl) null;
                  return;
                }
              } else {
                mj.field_f[var8].a(param5, -param2 + param6);
                if (param3 <= -59) {
                  return;
                } else {
                  field_m = (dl) null;
                  return;
                }
              }
            }
          } else {
            if (this.field_n) {
              L2: {
                ro.field_u[var8].b(param5, param6 + -(param2 * 2), 2 * param1, param2 * 4);
                if (this.field_l) {
                  mj.field_f[var8].b(param5, param6 + -param2, param1 * 2, 3 * param2);
                  break L2;
                } else {
                  fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
                  break L2;
                }
              }
              L3: {
                if (param3 <= -59) {
                  break L3;
                } else {
                  field_m = (dl) null;
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                ro.field_u[var8].b(param5, param6 - param2 * 2, param1 * 2, 4 * param2, 8421631);
                if (this.field_l) {
                  mj.field_f[var8].b(param5, param6 + -param2, param1 * 2, 3 * param2);
                  break L4;
                } else {
                  fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
                  break L4;
                }
              }
              L5: {
                if (param3 <= -59) {
                  break L5;
                } else {
                  field_m = (dl) null;
                  break L5;
                }
              }
              return;
            }
          }
        } else {
          L6: {
            if ((param1 ^ -1) != -25) {
              break L6;
            } else {
              if (24 != param2) {
                break L6;
              } else {
                L7: {
                  if (this.field_n) {
                    ro.field_u[var8].a(param5, -(2 * param2) + param6);
                    break L7;
                  } else {
                    ro.field_u[var8].c(param5, param6 - 2 * param2, 8421631);
                    break L7;
                  }
                }
                if (!this.field_l) {
                  L8: {
                    fm.field_s[var8].c(param5, param6 - param2, ek.field_f[this.field_a.field_u]);
                    if (param3 <= -59) {
                      break L8;
                    } else {
                      field_m = (dl) null;
                      break L8;
                    }
                  }
                  return;
                } else {
                  mj.field_f[var8].a(param5, -param2 + param6);
                  if (param3 > -59) {
                    field_m = (dl) null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (this.field_n) {
            L9: {
              ro.field_u[var8].b(param5, param6 + -(param2 * 2), 2 * param1, param2 * 4);
              if (this.field_l) {
                mj.field_f[var8].b(param5, param6 + -param2, param1 * 2, 3 * param2);
                break L9;
              } else {
                fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
                break L9;
              }
            }
            L10: {
              if (param3 <= -59) {
                break L10;
              } else {
                field_m = (dl) null;
                break L10;
              }
            }
            return;
          } else {
            L11: {
              ro.field_u[var8].b(param5, param6 - param2 * 2, param1 * 2, 4 * param2, 8421631);
              if (this.field_l) {
                mj.field_f[var8].b(param5, param6 + -param2, param1 * 2, 3 * param2);
                break L11;
              } else {
                fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
                break L11;
              }
            }
            L12: {
              if (param3 <= -59) {
                break L12;
              } else {
                field_m = (dl) null;
                break L12;
              }
            }
            return;
          }
        }
    }

    final fb a(int param0) {
        int var2 = 0;
        this.field_h = this.field_h - 1;
        if (this.field_h != 0) {
            var2 = 18 / ((param0 - 36) / 62);
            this.field_l = 0.5 <= Math.random() ? true : false;
            this.field_n = 0.5 <= Math.random() ? true : false;
            return (fb) (this);
        }
        this.field_j = this.field_j + 1;
        if (!(this.field_j < 3)) {
            io.field_M.a(128, this.field_a.field_o * this.field_a.field_m + 12 * this.field_a.field_A, this.field_a.field_s * this.field_a.field_m + this.field_a.field_t * 12, 0, (byte) -111);
            return (fb) ((Object) new jk(this.field_a));
        }
        this.field_h = this.field_o[this.field_j];
        var2 = 18 / ((param0 - 36) / 62);
        this.field_l = 0.5 <= Math.random() ? true : false;
        this.field_n = 0.5 <= Math.random() ? true : false;
        return (fb) (this);
    }

    em(fq param0) {
        super(param0);
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        this.field_o = new int[3];
        this.field_j = 0;
        this.field_k = new int[3];
        this.field_n = false;
        this.field_l = false;
        try {
          L0: {
            L1: {
              this.field_k[0] = (int)(Math.random() * 2.99) + 1;
              this.field_k[1] = (int)(Math.random() * 1.99) + 1;
              if (this.field_k[0] > this.field_k[1]) {
                break L1;
              } else {
                this.field_k[1] = this.field_k[1] + 1;
                break L1;
              }
            }
            this.field_k[2] = this.field_k[0];
            this.field_o[0] = (int)(30.0 * Math.random()) + 10;
            this.field_o[1] = 10 - -(int)(Math.random() * (double)(-this.field_o[0] + 30));
            this.field_h = this.field_o[0];
            this.field_o[2] = -this.field_o[1] + (60 + -this.field_o[0]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("em.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    static {
        field_f = false;
    }
}
