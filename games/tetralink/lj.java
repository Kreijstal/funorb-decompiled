/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj implements Iterator {
    private mc field_d;
    private mc field_f;
    private ea field_e;
    static int[] field_a;
    static ah field_c;
    private int field_g;
    static int[] field_b;

    final static id a(int param0, bc param1) {
        id stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          L0: {
            var2_int = param1.e(8, (byte) -112);
            if (-1 > (var2_int ^ -1)) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = bc.a(91, param1) ? 1 : 0;
                var4 = bc.a(77, param1) ? 1 : 0;
                var5 = new id();
                var5.field_q = (short)param1.e(16, (byte) -112);
                var5.field_D = cc.a(var5.field_D, param1, 16, 0);
                var5.field_i = cc.a(var5.field_i, param1, 16, param0 ^ param0);
                var5.field_R = cc.a(var5.field_R, param1, 16, param0 ^ -16483);
                var5.field_s = (short)param1.e(16, (byte) -112);
                var5.field_K = cc.a(var5.field_K, param1, 16, 0);
                var5.field_I = cc.a(var5.field_I, param1, 16, param0 ^ -16483);
                var5.field_e = cc.a(var5.field_e, param1, 16, 0);
                if (var3 != 0) {
                  var5.field_O = (short)param1.e(16, (byte) -112);
                  var5.field_l = cc.a(var5.field_l, param1, 16, 0);
                  var5.field_d = cc.a(var5.field_d, param1, 16, 0);
                  var5.field_y = cc.a(var5.field_y, param1, 16, 0);
                  var5.field_t = cc.a(var5.field_t, param1, 16, param0 + 16483);
                  var5.field_b = cc.a(var5.field_b, param1, 16, 0);
                  var5.field_N = cc.a(var5.field_N, param1, 16, param0 + 16483);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  param1.e(16, (byte) -112);
                  var5.field_k = cc.a(var5.field_k, param1, 16, param0 ^ -16483);
                  var5.field_p = cc.a(var5.field_p, param1, 16, 0);
                  var5.field_A = cc.a(var5.field_A, param1, 16, 0);
                  var5.field_o = cc.a(var5.field_o, param1, 16, 0);
                  var5.field_g = cc.a(var5.field_g, param1, 16, 0);
                  break L2;
                }
              }
              L3: {
                if (bc.a(126, param1)) {
                  var5.field_v = cc.a(var5.field_v, param1, 16, 0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (bc.a(64, param1)) {
                  var5.field_u = fi.a(16, var5.field_u, param1, (byte) 119);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_u.length) {
                      if (0 != var6) {
                        var5.field_Q = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_u = null;
                        break L4;
                      }
                    } else {
                      if ((var5.field_u[var7] & 255 ^ -1) < (var6 ^ -1)) {
                        var6 = 255 & var5.field_u[var7];
                        var7++;
                        continue L5;
                      } else {
                        var7++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackIn_24_0 = (id) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("lj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        mc var1;
        int var2;
        var2 = TetraLink.field_J;
        if (this.field_e.field_d[-1 + this.field_g] != this.field_f) {
          var1 = this.field_f;
          this.field_f = var1.field_j;
          this.field_d = var1;
          return var1;
        } else {
          L0: while (true) {
            if (this.field_g < this.field_e.field_i) {
              fieldTemp$1 = this.field_g;
              this.field_g = this.field_g + 1;
              var1 = this.field_e.field_d[fieldTemp$1].field_j;
              if (this.field_e.field_d[this.field_g - 1] != var1) {
                this.field_f = var1.field_j;
                this.field_d = var1;
                return var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    public final boolean hasNext() {
        int fieldTemp$2 = 0;
        int var2;
        var2 = TetraLink.field_J;
        if (this.field_e.field_d[this.field_g + -1] != this.field_f) {
          return true;
        } else {
          L0: while (true) {
            if (this.field_e.field_i <= this.field_g) {
              return false;
            } else {
              fieldTemp$2 = this.field_g;
              this.field_g = this.field_g + 1;
              if (this.field_e.field_d[fieldTemp$2].field_j != this.field_e.field_d[-1 + this.field_g]) {
                this.field_f = this.field_e.field_d[this.field_g + -1].field_j;
                return true;
              } else {
                this.field_f = this.field_e.field_d[-1 + this.field_g];
                continue L0;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 116) {
            field_b = (int[]) null;
        }
        field_a = null;
    }

    private final void a(int param0) {
        this.field_f = this.field_e.field_d[0].field_j;
        this.field_g = 1;
        this.field_d = null;
        if (param0 != -1) {
            field_c = (ah) null;
        }
    }

    public final void remove() {
        if (null == this.field_d) {
            throw new IllegalStateException();
        }
        this.field_d.b(false);
        this.field_d = null;
    }

    final static void a(byte param0) {
        int var1 = (cf.field_n - 640) / 2;
        int var2 = ma.field_f * ma.field_f;
        int var3 = -(qd.field_ab * qd.field_ab) + var2;
        if (param0 >= -21) {
            bc var4 = (bc) null;
            lj.a((bc) null, -52);
        }
        hn.field_P.a((byte) -92, 199, 90, -120 + ra.field_e + -94, var1 - var3 * 199 / var2);
        qe.field_c.a((byte) -124, 438, 0, -4 + ra.field_e - 120, 438 * var3 / var2 + (202 + var1));
    }

    final static rm[] a(bc param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        rm[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        rm var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        rm[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            var2_int = param0.e(8, (byte) -112);
            if (param1 >= var2_int) {
              var3 = param0.e(12, (byte) -112);
              var4 = new rm[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackIn_11_0 = (rm[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (bc.a(100, param0)) {
                      var6 = new rm();
                      param0.e(24, (byte) -112);
                      param0.e(24, (byte) -112);
                      var6.field_j = param0.e(24, (byte) -112);
                      param0.e(9, (byte) -112);
                      param0.e(12, (byte) -112);
                      param0.e(12, (byte) -112);
                      param0.e(12, (byte) -112);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param0.e(rn.a((byte) -127, -1 + var5), (byte) -112);
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("lj.C(");

            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (rm[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_11_0;
        }
    }

    lj(ea param0) {
        this.field_d = null;
        try {
            this.field_e = param0;
            this.a(-1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[4];
        field_b = new int[8192];
    }
}
