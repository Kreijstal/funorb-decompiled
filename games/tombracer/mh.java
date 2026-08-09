/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends kna {
    private int field_J;
    static String[] field_L;
    static String field_G;
    static oc[] field_K;
    static int field_I;
    private int field_H;
    static ka[] field_F;

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    mh(la param0, int param1) {
        super(param0, param1);
    }

    public static void A(int param0) {
        field_F = null;
        field_K = null;
        field_L = null;
        field_G = null;
        int var1 = -58 % ((param0 - -22) / 62);
    }

    final fsa a(boolean param0, int param1, la param2) {
        int var6_int = 0;
        Object var17 = null;
        Object var18 = null;
        int var19 = 0;
        fsa var20 = null;
        Object var21 = null;
        fsa stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        mfa var6 = null;
        fsa var7_ref_fsa = null;
        int var7 = 0;
        eq var8 = null;
        ro var9 = null;
        ro var10 = null;
        fsa var11 = null;
        eq var12 = null;
        ro var13 = null;
        ro var14 = null;
        int var15 = 0;
        int var16 = 0;
        lfa var17_ref = null;
        lfa var18_ref = null;
        lfa var21_ref = null;
        var17 = null;
        var18 = null;
        var21 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var20 = new fsa(param2, param0);
                var20.b((byte) -11, this.field_k, this.field_l);
                var6_int = this.field_m;
                if ((var6_int ^ -1) != -45) {
                  if ((var6_int ^ -1) == -46) {
                    break L2;
                  } else {
                    L3: {
                      if ((var6_int ^ -1) != -21) {
                        if (var6_int == 21) {
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    this.field_J = 1;
                    var5 = 1;
                    this.field_H = 4;
                    break L1;
                  }
                } else {
                  break L2;
                }
              }
              var5 = 0;
              break L1;
            }
            L4: {
              var6 = rm.field_a;
              if (var5 != 0) {
                L5: {
                  var7_ref_fsa = new fsa(param2, param0);
                  var7_ref_fsa.b((byte) -11, this.field_k / 3, this.field_l / 2);
                  var7_ref_fsa.b(437453352, -327680, -this.field_l / 4);
                  var7_ref_fsa.h(3, 0);
                  var8 = new eq(param2, param0);
                  var7_ref_fsa.a((byte) 83, (nv) (var8));
                  var9 = new ro(param2, param0);
                  var9.a(param1 ^ 40, new gea(new int[][]{new int[]{0, 0}}));
                  var7_ref_fsa.a(var9, 0);
                  var10 = new ro(param2, param0);
                  var10.a(param1 ^ 14, new gea(new int[][]{new int[]{262144 + -this.field_l / 2, 0}}));
                  var10.a(true, false);
                  var7_ref_fsa.a(var10, 0);
                  var11 = new fsa(param2, param0);
                  var11.b((byte) -11, this.field_k / 3, this.field_l / 2);
                  var11.b(437453352, -327680, this.field_l / 4);
                  var11.h(3, 0);
                  var12 = new eq(param2, param0);
                  var11.a((byte) 83, (nv) (var12));
                  var13 = new ro(param2, param0);
                  var13.a(87, new gea(new int[][]{new int[]{0, 0}}));
                  var11.a(var13, param1 ^ 3);
                  var14 = new ro(param2, param0);
                  var14.a(66, new gea(new int[][]{new int[]{-262144 + this.field_l / 2, 0}}));
                  var14.a(true, false);
                  var11.a(var14, 0);
                  var20.a(-72, var7_ref_fsa);
                  var20.a(-42, var11);
                  if ((this.field_H ^ -1) == -4) {
                    var15 = 0;
                    break L5;
                  } else {
                    var15 = 3;
                    break L5;
                  }
                }
                L6: {
                  if ((this.field_H ^ -1) != -4) {
                    var16 = 4;
                    break L6;
                  } else {
                    var16 = 1;
                    break L6;
                  }
                }
                var17_ref = (lfa) ((Object) var6.a(6, 87));
                var17_ref.a(var15, true);
                var7_ref_fsa.a((gr) null, (byte) 124, var17_ref);
                var7_ref_fsa.f(param1 + 7, 1048576);
                var18_ref = (lfa) ((Object) var6.a(6, 101));
                var18_ref.a(var16, true);
                var11.a((gr) null, (byte) 124, var18_ref);
                var11.f(param1 + 7, 1048576);
                break L4;
              } else {
                break L4;
              }
            }
            L7: {
              if (this.field_H != param1) {
                var7 = 5;
                break L7;
              } else {
                var7 = 2;
                break L7;
              }
            }
            var21_ref = (lfa) ((Object) var6.a(6, 126));
            var21_ref.a(var7, true);
            var20.a((gr) null, (byte) 124, var21_ref);
            stackIn_23_0 = (fsa) (var20);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var4);

            stackIn_26_1 = new StringBuilder().append("mh.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_23_0;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        int var2;
        super.q(param0);
        var2 = this.field_m;
        if (20 != var2) {
          if (-45 != (var2 ^ -1)) {
            if (-22 != (var2 ^ -1)) {
              if (45 == var2) {
                this.field_H = 4;
                this.field_J = 1;
                this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
                return;
              } else {
                this.field_H = 4;
                this.field_J = 1;
                this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
                return;
              }
            } else {
              this.field_H = 4;
              this.field_J = 1;
              this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
              return;
            }
          } else {
            this.field_J = 1;
            this.field_H = 3;
            this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
            return;
          }
        } else {
          this.field_J = 1;
          this.field_H = 3;
          this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
          return;
        }
    }

    mh(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            this.v(-73);
            return 7;
        }
        return 7;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mh.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final static jea r(byte param0) {
        if (param0 != 107) {
            return (jea) null;
        }
        return tn.field_n.field_tb;
    }

    static {
        field_G = "Game options";
        field_I = 0;
    }
}
