/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a extends bi {
    private int field_X;
    private wk field_W;
    private qg field_V;
    static al field_S;
    private int field_ab;
    static int[] field_T;
    private int field_P;
    static int field_Q;
    private int field_U;
    private gl field_Z;
    static boolean field_bb;
    static ti field_R;
    private int field_Y;

    boolean m(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_W) {
          if (this.field_W == uh.field_r) {
            fieldTemp$2 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$2 == this.field_P) {
              this.field_W = ij.field_d;
              this.a(0, 12 - -this.field_V.field_l, this.field_V.field_h + 12 + this.field_U, this.field_Y);
              this.field_ab = 0;
              this.field_Z.field_A = 0;
              if (param0 != 0) {
                this.p(-97);
                return super.m(0);
              } else {
                return super.m(0);
              }
            } else {
              this.field_Z.field_A = -((this.field_ab << 607758824) / this.field_P) + 256;
              if (param0 != 0) {
                this.p(-97);
                return super.m(0);
              } else {
                return super.m(0);
              }
            }
          } else {
            if (this.field_W != hg.field_b) {
              if (param0 != 0) {
                this.p(-97);
                return super.m(0);
              } else {
                return super.m(0);
              }
            } else {
              fieldTemp$3 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (this.field_X != fieldTemp$3) {
                this.field_Z.field_A = (this.field_ab << -1241675192) / this.field_X;
                if (param0 != 0) {
                  this.p(-97);
                  return super.m(0);
                } else {
                  return super.m(0);
                }
              } else {
                this.field_Z.field_A = 256;
                this.field_W = null;
                if (param0 == 0) {
                  return super.m(0);
                } else {
                  this.p(-97);
                  return super.m(0);
                }
              }
            }
          }
        } else {
          if (param0 == 0) {
            return super.m(0);
          } else {
            this.p(-97);
            return super.m(0);
          }
        }
    }

    a(da param0, qg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_h + 12 - -param2);
        try {
            this.field_U = param2;
            this.field_X = param3;
            this.field_P = param3;
            this.field_Y = param4;
            this.a((byte) 97, param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, qg param1) {
        if (!(null == this.field_Z)) {
            this.field_Z.c(5);
        }
        if (param0 < 68) {
            return;
        }
        try {
            if (param1 != null) {
                param1.a(28, 6 + this.field_U, 6, param1.field_l, param1.field_h);
                this.field_Z = new gl(param1);
            } else {
                this.field_Z = new gl();
            }
            this.a((qg) (this.field_Z), (byte) -88);
            this.field_V = null;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "a.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(byte param0) {
        if (!(this.field_W != uh.field_r)) {
            return;
        }
        this.field_ab = 0;
        this.field_W = hg.field_b;
        this.a((byte) 101, this.field_V);
        this.field_Z.field_A = 0;
        this.field_V = null;
        if (param0 != -2) {
            qg var3 = (qg) null;
            this.b(-120, (qg) null);
        }
    }

    final void p(int param0) {
        L0: {
          if (this.field_W == null) {
            break L0;
          } else {
            L1: {
              if (hg.field_b != this.field_W) {
                this.a(12 - -this.field_V.field_l, 12 - -this.field_U - -this.field_V.field_h, false);
                this.a((byte) 93, this.field_V);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_W = null;
            this.field_Z.field_A = 256;
            break L0;
          }
        }
        if (param0 != 27830) {
          this.d((byte) 73);
          super.p(param0 + 0);
          return;
        } else {
          super.p(param0 + 0);
          return;
        }
    }

    final boolean a(byte param0) {
        this.p(param0 + 27927);
        if (param0 != -97) {
            return true;
        }
        return super.a((byte) -97);
    }

    void b(int param0, qg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_V = param1;
            var3_int = 115 % ((param0 - 34) / 54);
            if (ij.field_d != this.field_W) {
              if (uh.field_r == this.field_W) {
                break L0;
              } else {
                this.field_ab = 0;
                this.field_W = uh.field_r;
                return;
              }
            } else {
              this.a(0, 12 - -this.field_V.field_l, this.field_U + (12 + this.field_V.field_h), this.field_Y);
              this.field_ab = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("a.RB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(el.field_n);
            param1.removeFocusListener(el.field_n);
            j.field_b = -1;
            if (param0 < 36) {
                field_S = (al) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "a.UB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_T = null;
        field_S = null;
        field_R = null;
        if (param0 != -13) {
            field_T = (int[]) null;
        }
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
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
            if (!super.a(param0, param1, (byte) 122, param3)) {
              L1: {
                if (null == this.field_Z) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param0) {
                      break L2;
                    } else {
                      this.field_Z.a(param1, -90);
                      break L2;
                    }
                  }
                  if (param0 == 99) {
                    this.field_Z.a(param1, -24);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var5_int = -38 % ((param2 - 65) / 55);
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

            stackIn_13_1 = new StringBuilder().append("a.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
        field_Q = 20;
        field_S = new al(2);
    }
}
