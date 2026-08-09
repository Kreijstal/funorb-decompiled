/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends bj implements qb {
    private hc field_J;
    static int field_H;
    private hc field_G;
    private hc field_I;

    public l() {
        super(0, 0, 476, 225, (db) null);
        this.field_I = new hc(pc.field_g, (wn) null);
        this.field_G = new hc(c.field_p, (wn) null);
        this.field_J = new hc(cj.field_c, (wn) null);
        ck var1 = new ck();
        this.field_I.field_s = (db) ((Object) var1);
        this.field_G.field_s = (db) ((Object) var1);
        this.field_J.field_s = (db) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -977047807;
        this.field_G.a(var4, this.field_x - (48 - -var2), -var3 + this.field_g >> 1555371649, true, 30);
        this.field_J.a(var4, -48 + (this.field_x - var2), (this.field_g + -var3 >> -1699240159) + (var4 - -var2), true, 30);
        this.field_I.a(var3, -78 + (this.field_x + -(2 * var2)), -var3 + this.field_g >> -2127206143, true, 30);
        this.field_G.field_q = (wn) (this);
        this.field_I.field_q = (wn) (this);
        this.field_J.field_q = (wn) (this);
        this.field_I.field_i = mm.field_c;
        this.field_J.field_i = lf.field_G;
        this.b(this.field_G, false);
        this.b(this.field_I, false);
        this.b(this.field_J, false);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        if (param1 <= 85) {
          this.field_J = (hc) null;
          var5 = this.field_k - -param3;
          var6 = param0 + this.field_j;
          sb.field_a.a(q.field_F, var5 + 20, var6 + 20, this.field_g + -40, this.field_x + -50, 16777215, -1, 1, 0, sb.field_a.field_r);
          super.a(param0, (byte) 99, param2, param3);
          return;
        } else {
          var5 = this.field_k - -param3;
          var6 = param0 + this.field_j;
          sb.field_a.a(q.field_F, var5 + 20, var6 + 20, this.field_g + -40, this.field_x + -50, 16777215, -1, 1, 0, sb.field_a.field_r);
          super.a(param0, (byte) 99, param2, param3);
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 < -30) {
          if (!aj.b(-127)) {
            if (mg.field_b < 2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_H = -87;
          if (!aj.b(-127)) {
            if (mg.field_b < 2) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (this.field_G != param0) {
                if (this.field_I == param0) {
                  fe.a((byte) -83);
                  break L1;
                } else {
                  if (this.field_J == param0) {
                    bm.a(4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                eh.b(-74);
                break L1;
              }
            }
            if (param3 == 1) {
              break L0;
            } else {
              l.a((byte) -64);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("l.K(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 71)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != 98) {
                if (param3 >= 0) {
                  if ((param2 ^ -1) == -100) {
                    stackIn_13_0 = this.a(param0, true);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a((byte) 22, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("l.G(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != -8462) {
            return -107;
        }
        if (!qd.a(param1, -99)) {
            return -1;
        }
        return param1;
    }

    static {
        field_H = 4;
    }
}
