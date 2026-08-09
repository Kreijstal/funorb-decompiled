/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends bo implements Cloneable {
    private int field_r;
    static int field_q;
    static dl field_p;

    final void c(boolean param0, boolean param1) {
        int var3;
        int var4;
        if (param0) {
          var3 = -1 + s.field_o.length;
          var4 = (int)(3.0 * ((double)var3 * Math.random()));
          if (var4 >= 0) {
            if (var4 >= var3) {
              return;
            } else {
              this.field_r = 1 - -var4;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    protected final Object clone() {
        kn var1 = (kn) (super.clone());
        var1.field_r = this.field_r;
        return var1;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                this.a(-78, (ea) null, 7, -88, (byte) 87, 74, (f[][]) null);
                break L1;
              }
            }
            stackIn_3_0 = ng.a(dq.field_H, param1, new kn(new kp(-1)), (byte) -83, wi.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kn.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        RuntimeException var8 = null;
        fq var9 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fn.field_j = fn.field_j - 3;
              if (param4 <= -87) {
                break L1;
              } else {
                this.a(-12, (ea) null, -116, -77, (byte) 28, -29, (f[][]) null);
                break L1;
              }
            }
            mb.field_g = mb.field_g - 3;
            wd.field_j = wd.field_j - 1;
            mb.field_g = mb.field_g - ob.field_l;
            tm.field_f.a(32, (param5 + param2) * 12, (param3 - -param0) * 12, 60, (byte) -111);
            var9 = (fq) ((Object) param1);
            this.field_l.a(1 << var9.field_u, true, tm.field_e);
            stackIn_3_0 = this.field_l.a(param0, param1, param2, param3, (byte) -98, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("kn.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -21) {
              stackIn_3_0 = 1;
              break L0;
            } else {
              field_q = -71;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("kn.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        dl[] stackIn_3_0 = null;
        dl[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        dl[] stackIn_8_0 = null;
        dl[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        dl[] stackIn_12_0 = null;
        dl[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        var7 = 122 % ((param0 - 74) / 41);
        if (param1 == 24) {
          if (-25 != (param2 ^ -1)) {
            L0: {
              stackIn_12_0 = s.field_o;

              if (!jm.field_j) {
                stackIn_13_0 = (dl[]) ((Object) stackIn_12_0);
                stackIn_13_1 = 0;
                break L0;
              } else {
                stackIn_13_0 = (dl[]) ((Object) stackIn_12_0);
                stackIn_13_1 = this.field_r;
                break L0;
              }
            }
            ((dl) (Object) stackIn_13_0[stackIn_13_1]).b(param4, param5 + -param2, param1 * 2, param2 * 3);
            return;
          } else {
            L1: {
              stackIn_8_0 = s.field_o;

              if (jm.field_j) {
                stackIn_9_0 = (dl[]) ((Object) stackIn_8_0);
                stackIn_9_1 = this.field_r;
                break L1;
              } else {
                stackIn_9_0 = (dl[]) ((Object) stackIn_8_0);
                stackIn_9_1 = 0;
                break L1;
              }
            }
            ((dl) (Object) stackIn_9_0[stackIn_9_1]).a(param4, param5 + -param2);
            return;
          }
        } else {
          L2: {
            stackIn_3_0 = s.field_o;

            if (!jm.field_j) {
              stackIn_4_0 = (dl[]) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L2;
            } else {
              stackIn_4_0 = (dl[]) ((Object) stackIn_3_0);
              stackIn_4_1 = this.field_r;
              break L2;
            }
          }
          ((dl) (Object) stackIn_4_0[stackIn_4_1]).b(param4, param5 + -param2, param1 * 2, param2 * 3);
          return;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            field_q = 34;
            return 0;
        }
        return 0;
    }

    kn(f param0) {
        super(param0);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        ig stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param5 == -87) {
                break L1;
              } else {
                this.field_r = 127;
                break L1;
              }
            }
            je.field_j = je.field_j + 64;
            b.field_a = b.field_a + 64;
            we.field_h = we.field_h + 128;
            fp.field_a = fp.field_a + 128;
            cn.field_e.a(64, param2 * 12, 12 * param1, 0, (byte) -111);
            this.field_l.a((byte) 108, param0);
            stackIn_3_0 = new ig(param0, bd.field_n, this.field_l, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("kn.H(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return (f) ((Object) stackIn_3_0);
    }

    public static void g(int param0) {
        int var1 = -57 % ((-51 - param0) / 48);
        field_p = null;
    }

    static {
    }
}
