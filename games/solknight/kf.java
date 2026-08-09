/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kf extends ki {
    private int field_I;
    static String field_D;
    static rb[] field_G;
    private i field_E;
    static String field_F;
    boolean field_J;
    static String field_H;

    kf(i param0, int param1, int param2) {
        super(-param1 + og.field_f >> 1600490529, -param2 + wc.field_e >> -753274303, param1, param2, (j) null);
        try {
            this.field_J = false;
            this.field_I = 0;
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean e(byte param0) {
        if (param0 == 124) {
          this.field_I = this.a((byte) 11);
          if (-1 == (this.field_I ^ -1)) {
            if (this.field_J) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_H = (String) null;
          this.field_I = this.a((byte) 11);
          if (-1 == (this.field_I ^ -1)) {
            if (this.field_J) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        fl.b((byte) 91);
        if (param0 != 97) {
          field_G = (rb[]) null;
          mi.d(param1, param2, param3, param4);
          return;
        } else {
          mi.d(param1, param2, param3, param4);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        this.b(param2, param0, og.field_f - param0 >> -2038584927, 0, -param2 + wc.field_e >> -984831359);
        if (param1 != -2038584927) {
            String[] var5 = (String[]) null;
            kf.a(-72, (String[]) null);
        }
    }

    abstract void a(int param0, byte param1, int param2);

    boolean h(int param0) {
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int var2;
        int var3;
        if (param0 == 1784) {
          L0: {
            var2 = this.a((byte) -104);
            var3 = -this.field_I + var2;
            if (var3 > 0) {
              this.field_I = this.field_I + (8 + var3 - 1) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          if (0 > var3) {
            L1: {
              L2: {
                this.field_I = this.field_I + (-16 + var3 + 1) / 16;
                if (this.field_I != 0) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (this.field_J) {
                      break L2;
                    } else {
                      stackIn_38_0 = 1;
                      break L1;
                    }
                  }
                }
              }
              stackIn_38_0 = 0;
              break L1;
            }
            return stackIn_38_0 != 0;
          } else {
            L3: {
              L4: {
                if (this.field_I != 0) {
                  break L4;
                } else {
                  if (var2 != 0) {
                    break L4;
                  } else {
                    if (this.field_J) {
                      break L4;
                    } else {
                      stackIn_32_0 = 1;
                      break L3;
                    }
                  }
                }
              }
              stackIn_32_0 = 0;
              break L3;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          L5: {
            kf.a((byte) -47, 114, 13, 107, 118);
            var2 = this.a((byte) -104);
            var3 = -this.field_I + var2;
            if (var3 > 0) {
              this.field_I = this.field_I + (8 + var3 - 1) / 8;
              break L5;
            } else {
              break L5;
            }
          }
          if (0 > var3) {
            this.field_I = this.field_I + (-16 + var3 + 1) / 16;
            if (this.field_I == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L6: {
                  if (this.field_J) {
                    stackIn_20_0 = 0;
                    break L6;
                  } else {
                    stackIn_20_0 = 1;
                    break L6;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (this.field_I == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (this.field_J) {
                    stackIn_11_0 = 0;
                    break L7;
                  } else {
                    stackIn_11_0 = 1;
                    break L7;
                  }
                }
                return stackIn_11_0 != 0;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                if (k.field_d != null) {
                  k.field_d.field_G.a(20870, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (null == sj.field_d) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                sj.field_d.field_F.a(20870, param1);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("kf.WB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(byte param0) {
        int var2 = 98 / ((-50 - param0) / 54);
        return !this.field_J ? 0 : this.field_E.d((byte) 109) == this ? 256 : 0;
    }

    final rc d(byte param0) {
        rc var2 = super.d(param0);
        if (var2 != null) {
            return var2;
        }
        return (rc) (this);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (this.field_I ^ -1)) {
          if (256 <= this.field_I) {
            if (param1 != 0) {
              return;
            } else {
              this.a(this.field_m + param2, (byte) 55, this.field_j + param0);
              super.a(param0, param1, param2, param3 ^ 0);
              return;
            }
          } else {
            if (jj.field_x != null) {
              if (jj.field_x.field_p >= this.field_t) {
                if (jj.field_x.field_t >= this.field_x) {
                  cl.a(-100, jj.field_x);
                  mi.a();
                  this.a(param3, (byte) 94, 0);
                  super.a(-this.field_j + -param0, param1, -this.field_m + -param2, 0);
                  mf.e(4096);
                  jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
                  return;
                } else {
                  jj.field_x = new o(this.field_t, this.field_x);
                  cl.a(-100, jj.field_x);
                  mi.a();
                  this.a(param3, (byte) 94, 0);
                  super.a(-this.field_j + -param0, param1, -this.field_m + -param2, 0);
                  mf.e(4096);
                  jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
                  return;
                }
              } else {
                jj.field_x = new o(this.field_t, this.field_x);
                cl.a(-100, jj.field_x);
                mi.a();
                this.a(param3, (byte) 94, 0);
                super.a(-this.field_j + -param0, param1, -this.field_m + -param2, 0);
                mf.e(4096);
                jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
                return;
              }
            } else {
              jj.field_x = new o(this.field_t, this.field_x);
              cl.a(-100, jj.field_x);
              mi.a();
              this.a(param3, (byte) 94, 0);
              super.a(-this.field_j + -param0, param1, -this.field_m + -param2, 0);
              mf.e(4096);
              jj.field_x.c(this.field_m + param2, this.field_j + param0, this.field_I);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_G = null;
        field_F = null;
        if (param0 < 16) {
          field_D = (String) null;
          field_H = null;
          field_D = null;
          return;
        } else {
          field_H = null;
          field_D = null;
          return;
        }
    }

    static {
        field_H = "Username: ";
        field_F = "Return to game";
    }
}
