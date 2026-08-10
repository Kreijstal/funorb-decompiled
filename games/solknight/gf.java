/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends ld {
    private int field_ab;
    private wh field_U;
    private int field_db;
    private int field_W;
    private rc field_S;
    private te field_V;
    static int field_T;
    private int field_eb;
    static ef field_Z;
    static String[] field_X;
    private int field_bb;
    static long field_Y;
    static o[] field_fb;
    static s field_cb;

    final boolean e(byte param0) {
        this.e(true);
        if (param0 != 124) {
            return true;
        }
        return super.e((byte) 124);
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -117, param2, param3)) {
              L1: {
                if (null != this.field_V) {
                  L2: {
                    if (param2 != 98) {
                      break L2;
                    } else {
                      this.field_V.a(-1463, param3);
                      break L2;
                    }
                  }
                  if (99 != param2) {
                    break L1;
                  } else {
                    this.field_V.a(-1463, param3);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var5_int = 120 / ((param1 - 31) / 56);
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("gf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    gf(i param0, rc param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 - -param2 - -param1.field_x);
        try {
            this.field_eb = param2;
            this.field_W = param4;
            this.field_db = param3;
            this.field_ab = param3;
            this.b(param1, -16777);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void f(byte param0) {
        int var1 = -116 / ((-50 - param0) / 43);
        field_cb = null;
        field_X = null;
        field_Z = null;
        field_fb = null;
    }

    private final void b(rc param0, int param1) {
        if (!(this.field_V == null)) {
            this.field_V.c(10);
        }
        if (param0 == null) {
            this.field_V = new te();
        } else {
            param0.b(param0.field_x, param0.field_t, 6, 0, this.field_eb + 6);
            this.field_V = new te(param0);
        }
        this.a(this.field_V, param1 + 22188);
        if (param1 != -16777) {
            return;
        }
        try {
            this.field_S = null;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "gf.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(boolean param0) {
        if (this.field_U != null) {
          if (this.field_U == oa.field_j) {
            this.field_V.field_H = 256;
            this.field_U = null;
            super.e(param0);
            return;
          } else {
            this.b(this.field_S.field_t + 12, -2038584927, this.field_eb + 12 - -this.field_S.field_x);
            this.b(this.field_S, -16777);
            this.field_V.field_H = 256;
            this.field_U = null;
            super.e(param0);
            return;
          }
        } else {
          super.e(param0);
          return;
        }
    }

    void c(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -3399) {
                break L1;
              } else {
                field_T = -28;
                break L1;
              }
            }
            this.field_S = param1;
            if (kc.field_I != this.field_U) {
              if (this.field_U == ah.field_j) {
                break L0;
              } else {
                this.field_U = ah.field_j;
                this.field_bb = 0;
                return;
              }
            } else {
              this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
              this.field_bb = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("gf.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void l(int param0) {
        if (ah.field_j == this.field_U) {
          return;
        } else {
          if (param0 != 7107) {
            return;
          } else {
            this.field_U = oa.field_j;
            this.field_bb = 0;
            this.b(this.field_S, param0 ^ -23116);
            this.field_V.field_H = 0;
            this.field_S = null;
            return;
          }
        }
    }

    boolean h(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        rc var4;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 == 1784) {
          if (this.field_U != null) {
            if (this.field_U == ah.field_j) {
              fieldTemp$4 = this.field_bb + 1;
              this.field_bb = this.field_bb + 1;
              if (this.field_ab == fieldTemp$4) {
                this.field_U = kc.field_I;
                this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                this.field_bb = 0;
                this.field_V.field_H = 0;
                return super.h(param0 + 0);
              } else {
                this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                return super.h(param0 + 0);
              }
            } else {
              if (this.field_U == oa.field_j) {
                fieldTemp$5 = this.field_bb + 1;
                this.field_bb = this.field_bb + 1;
                if (fieldTemp$5 != this.field_db) {
                  this.field_V.field_H = (this.field_bb << 88565416) / this.field_db;
                  return super.h(param0 + 0);
                } else {
                  this.field_U = null;
                  this.field_V.field_H = 256;
                  return super.h(param0 + 0);
                }
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            return super.h(param0 + 0);
          }
        } else {
          var4 = (rc) null;
          this.a('ﾴ', (byte) -22, -26, (rc) null);
          if (this.field_U != null) {
            if (this.field_U == ah.field_j) {
              fieldTemp$6 = this.field_bb + 1;
              this.field_bb = this.field_bb + 1;
              if (this.field_ab == fieldTemp$6) {
                this.field_U = kc.field_I;
                this.b(this.field_S.field_x + 12 - -this.field_eb, 0, this.field_W, this.field_S.field_t + 12);
                this.field_bb = 0;
                this.field_V.field_H = 0;
                return super.h(param0 + 0);
              } else {
                this.field_V.field_H = -((this.field_bb << 2029313000) / this.field_ab) + 256;
                return super.h(param0 + 0);
              }
            } else {
              if (this.field_U == oa.field_j) {
                fieldTemp$7 = this.field_bb + 1;
                this.field_bb = this.field_bb + 1;
                if (fieldTemp$7 != this.field_db) {
                  this.field_V.field_H = (this.field_bb << 88565416) / this.field_db;
                  return super.h(param0 + 0);
                } else {
                  this.field_U = null;
                  this.field_V.field_H = 256;
                  return super.h(param0 + 0);
                }
              } else {
                return super.h(param0 + 0);
              }
            }
          } else {
            return super.h(param0 + 0);
          }
        }
    }

    static {
        field_Z = new ef();
        field_X = new String[]{"All scores", "My scores", "Best each"};
    }
}
