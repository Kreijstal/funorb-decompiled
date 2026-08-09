/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji implements Iterable {
    static boolean field_f;
    private nm field_h;
    static Random field_e;
    static String field_g;
    nm[] field_d;
    int field_c;
    static mf field_a;
    static mh field_b;

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        if (param0 != 24968) {
            vm var2 = (vm) null;
            ji.a(-14, true, (vm) null, -51, -100, true);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final nm a(long param0, int param1) {
        nm var4;
        nm var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = this.field_d[(int)((long)(this.field_c - 1) & param0)];
        this.field_h = var4.field_e;
        if (param1 <= 85) {
          this.field_c = -72;
          L0: while (true) {
            if (var4 == this.field_h) {
              this.field_h = null;
              return null;
            } else {
              if (param0 != this.field_h.field_g) {
                this.field_h = this.field_h.field_e;
                continue L0;
              } else {
                var5 = this.field_h;
                this.field_h = this.field_h.field_e;
                return var5;
              }
            }
          }
        } else {
          L1: while (true) {
            if (var4 == this.field_h) {
              this.field_h = null;
              return null;
            } else {
              if (param0 != this.field_h.field_g) {
                this.field_h = this.field_h.field_e;
                continue L1;
              } else {
                var5 = this.field_h;
                this.field_h = this.field_h.field_e;
                return var5;
              }
            }
          }
        }
    }

    final void a(byte param0, long param1, nm param2) {
        nm var5 = null;
        try {
            if (null != param2.field_b) {
                param2.b((byte) 111);
            }
            var5 = this.field_d[(int)(param1 & (long)(-1 + this.field_c))];
            param2.field_b = var5.field_b;
            param2.field_e = var5;
            param2.field_b.field_e = param2;
            param2.field_e.field_b = param2;
            int var6 = -64 % ((param0 - -60) / 52);
            param2.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ji.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ik((ji) (this)));
    }

    final static void a(int param0, boolean param1, vm param2, int param3, int param4, boolean param5) {
        Object var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        Object var6_ref = null;
        RuntimeException var6_ref2 = null;
        try {
          L0: {
            var6_ref = eo.field_f;
            synchronized (var6_ref) {
              L1: {
                L2: {
                  if (param0 == 25459) {
                    break L2;
                  } else {
                    field_g = (String) null;
                    break L2;
                  }
                }
                if (fo.field_a != param2) {
                  L3: {
                    fo.field_a = param2;
                    if (fo.field_a == null) {
                      break L3;
                    } else {
                      m.field_f.a(param4, fo.field_a, param3, param1, param0 + -25460, param5);
                      break L3;
                    }
                  }
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6_ref2);

            stackIn_15_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    ji(int param0) {
        nm dupTemp$1 = null;
        int var2;
        nm var3;
        this.field_d = new nm[param0];
        this.field_c = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$1 = new nm();
            var3 = dupTemp$1;
            this.field_d[var2] = dupTemp$1;
            var3.field_b = var3;
            var3.field_e = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final static lo a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        lo var7 = null;
        int var8 = 0;
        lo stackIn_3_0 = null;
        lo stackIn_7_0 = null;
        lo stackIn_10_0 = null;
        lo stackIn_15_0 = null;
        lo stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 != (var2_int ^ -1)) {
              if (255 < var2_int) {
                stackIn_7_0 = pi.field_r;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = qb.a((byte) -11, param0, '.');
                if (2 <= var3.length) {
                  var4 = var3;
                  var5 = param1;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackIn_18_0 = mf.a((byte) -95, var3[var3.length - 1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = kb.a(param1 ^ 95, var6);
                      if (var7 == null) {
                        var5++;
                        continue L1;
                      } else {
                        stackIn_15_0 = (lo) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = la.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = la.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("ji.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                return stackIn_18_0;
              }
            }
          }
        }
    }

    static {
        field_g = "Friends";
        field_e = new Random();
    }
}
