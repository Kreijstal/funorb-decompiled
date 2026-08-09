/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc extends ofa {
    private sla field_M;
    static int[] field_N;
    private int field_R;
    private int field_O;
    private int field_Q;
    static String field_L;
    private rg field_P;
    private int field_S;
    private ae field_T;
    private int field_U;

    private final void a(boolean param0, ae param1) {
        RuntimeException var3 = null;
        ae var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != this.field_P) {
                this.field_P.p(83);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                this.field_P = new rg();
                break L2;
              } else {
                param1.a((byte) -31, param1.field_m, param1.field_p, 6, this.field_S + 6);
                this.field_P = new rg(param1);
                break L2;
              }
            }
            this.a(this.field_P, -1);
            this.field_T = null;
            if (!param0) {
              break L0;
            } else {
              var4 = (ae) null;
              this.a('￁', (ae) null, 57, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("lc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final void c(boolean param0) {
        if (this.field_M != null) {
          if (this.field_M == nr.field_a) {
            this.field_P.field_y = 256;
            this.field_M = null;
            super.c(param0);
            return;
          } else {
            this.c(-11560, this.field_T.field_p + (this.field_S + 12), 12 + this.field_T.field_m);
            this.a(false, this.field_T);
            this.field_P.field_y = 256;
            this.field_M = null;
            super.c(param0);
            return;
          }
        } else {
          super.c(param0);
          return;
        }
    }

    void a(int param0, ae param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_T = param1;
              if (this.field_M != us.field_e) {
                if (bj.field_p != this.field_M) {
                  this.field_M = bj.field_p;
                  this.field_R = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.a(this.field_Q, this.field_T.field_m + 12, this.field_T.field_p + this.field_S + 12, (byte) -105);
                this.field_R = 0;
                break L1;
              }
            }
            if (param0 > 67) {
              break L0;
            } else {
              this.field_R = -128;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lc.F(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    boolean a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_M) {
          if (this.field_M != bj.field_p) {
            if (nr.field_a == this.field_M) {
              fieldTemp$2 = this.field_R + 1;
              this.field_R = this.field_R + 1;
              if (this.field_U != fieldTemp$2) {
                this.field_P.field_y = (this.field_R << 446193096) / this.field_U;
                if (param0 <= 126) {
                  this.field_T = (ae) null;
                  return super.a(127);
                } else {
                  return super.a(127);
                }
              } else {
                this.field_M = null;
                this.field_P.field_y = 256;
                if (param0 <= 126) {
                  this.field_T = (ae) null;
                  return super.a(127);
                } else {
                  return super.a(127);
                }
              }
            } else {
              if (param0 <= 126) {
                this.field_T = (ae) null;
                return super.a(127);
              } else {
                return super.a(127);
              }
            }
          } else {
            fieldTemp$3 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (fieldTemp$3 == this.field_O) {
              this.field_M = us.field_e;
              this.a(this.field_Q, this.field_T.field_m + 12, this.field_T.field_p + (this.field_S + 12), (byte) -103);
              this.field_R = 0;
              this.field_P.field_y = 0;
              if (param0 > 126) {
                return super.a(127);
              } else {
                this.field_T = (ae) null;
                return super.a(127);
              }
            } else {
              this.field_P.field_y = 256 + -((this.field_R << 1909569320) / this.field_O);
              if (param0 > 126) {
                return super.a(127);
              } else {
                this.field_T = (ae) null;
                return super.a(127);
              }
            }
          }
        } else {
          if (param0 <= 126) {
            this.field_T = (ae) null;
            return super.a(127);
          } else {
            return super.a(127);
          }
        }
    }

    public static void e(boolean param0) {
        field_N = null;
        if (param0) {
            lc.e(false);
            field_L = null;
            return;
        }
        field_L = null;
    }

    final void d(int param0) {
        if (this.field_M != bj.field_p) {
          this.field_M = nr.field_a;
          if (param0 > -20) {
            this.field_R = 19;
            this.field_R = 0;
            this.a(false, this.field_T);
            this.field_P.field_y = 0;
            this.field_T = null;
            return;
          } else {
            this.field_R = 0;
            this.a(false, this.field_T);
            this.field_P.field_y = 0;
            this.field_T = null;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (null != this.field_P) {
                L1: {
                  if (param2 != 98) {
                    break L1;
                  } else {
                    this.field_P.a(param1, false);
                    break L1;
                  }
                }
                L2: {
                  if ((param2 ^ -1) == -100) {
                    this.field_P.a(param1, false);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("lc.P(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    lc(jta param0, ae param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param1.field_p + param2 + 12);
        try {
            this.field_U = param3;
            this.field_O = param3;
            this.field_Q = param4;
            this.field_S = param2;
            this.a(false, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0) {
        if (param0 > -53) {
            return false;
        }
        this.c(true);
        return super.a((byte) -120);
    }

    static {
        field_N = new int[1];
        field_L = "Score";
    }
}
