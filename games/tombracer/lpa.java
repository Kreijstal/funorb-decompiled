/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lpa extends nv {
    private int field_t;
    private int field_u;
    private int field_q;
    private boolean field_r;
    static Random field_p;
    static il field_s;
    private int field_n;
    static int field_v;
    static boolean field_w;
    static int field_o;

    lpa(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = -1;
        try {
            this.field_q = 50;
            this.field_n = 50;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lpa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7;
        if (!this.field_r) {
          if (param3 == 1) {
            var7 = 0;
            if (param4 < 79) {
              this.field_q = -65;
              return foa.a(param1, param5, this.field_g.e(9648), param2, -var7 + this.field_g.c(-62), (byte) 75, param0, this.field_g.a((byte) 55) + -var7, 16, this.field_g.d(3));
            } else {
              return foa.a(param1, param5, this.field_g.e(9648), param2, -var7 + this.field_g.c(-62), (byte) 75, param0, this.field_g.a((byte) 55) + -var7, 16, this.field_g.d(3));
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final boolean g(byte param0) {
        fsa var3;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 63) {
          L0: {
            var3 = (fsa) null;
            this.a(false, (fsa) null);
            if (-1 > (this.field_u ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 > (this.field_u ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 39;
        }
        param0 = fs.a((byte) 71, param0, this.field_u);
        return param0;
    }

    final void a(boolean param0, fsa param1) {
        try {
            super.a(param0, param1);
            param1.b((byte) 91, 3);
            param1.a(true, (byte) -119, 1);
            param1.a((byte) -112, true, 2);
            param1.b((byte) 17, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lpa.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_n = param1;
        if (param0 != -5) {
            this.a(3, -95, -50, 37, (byte) -23, 92);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.a(-87, -106);
            return 9;
        }
        return 9;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 36, this.field_n, 8);
            param1.a((byte) 87, this.field_q, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lpa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(boolean param0) {
        if (param0) {
            return true;
        }
        return (this.field_u ^ -1) != 0 ? true : false;
    }

    lpa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_u = -1;
        try {
            this.field_n = param1.b((byte) 44, 8);
            this.field_q = param1.b((byte) 44, 8);
            if ((param0.field_E ^ -1) <= -5 && 19 >= param0.field_E) {
                param1.b((byte) 44, 1);
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lpa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static float[] a(int param0, int param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 50) {
                break L1;
              } else {
                field_o = 116;
                break L1;
              }
            }
            var4 = new float[param0];
            var3 = var4;
            lua.a(param2, 0, var4, 0, param0);
            stackIn_3_0 = (float[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("lpa.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1) {
        int var3 = -16 % ((16 - param1) / 44);
        this.field_q = param0;
    }

    public final void m(int param0) {
        int var2 = -46 % ((28 - param0) / 49);
        if (this.field_k) {
            return;
        }
        super.m(117);
    }

    final void k(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == 5418) {
          if (!this.d(false)) {
            if ((this.field_n ^ -1) < -1) {
              if (this.field_n > this.field_t) {
                this.field_t = 0;
                return;
              } else {
                this.field_u = this.field_q;
                return;
              }
            } else {
              this.field_t = 0;
              return;
            }
          } else {
            this.field_u = this.field_u - 1;
            if (-1 > (this.field_u ^ -1)) {
              return;
            } else {
              this.field_r = true;
              this.field_g.i(true);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(ffa param0, byte param1, gma param2, int param3) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            super.a(param0, (byte) 101, param2, param3);
            if (this.field_r) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 >= 18) {
                  break L1;
                } else {
                  this.g((byte) -126);
                  break L1;
                }
              }
              if ((param3 ^ -1) == -3) {
                L2: {
                  if (this.field_g != param0) {
                    break L2;
                  } else {
                    var5_int = this.field_g.d(3) + -this.field_g.I(-16423);
                    var6 = this.field_g.e(9648) + -this.field_g.y((byte) -91);
                    if (var5_int != 0) {
                      param2.a(125, true, 1, var6, var5_int, 0);
                      break L2;
                    } else {
                      if (var6 == 0) {
                        break L2;
                      } else {
                        param2.a(125, true, 1, var6, var5_int, 0);
                        break L2;
                      }
                    }
                  }
                }
                if (this.field_u != -1) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  this.field_t = this.field_t + param2.b(-89);
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("lpa.SB(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
            field_p = (Random) null;
            field_s = null;
            field_p = null;
            return;
        }
        field_s = null;
        field_p = null;
    }

    static {
        field_p = new Random();
        field_v = 0;
        field_o = 0;
    }
}
