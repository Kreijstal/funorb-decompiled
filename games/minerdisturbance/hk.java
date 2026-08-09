/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    private int field_f;
    static ec field_i;
    private int field_b;
    private sd field_g;
    private qc field_h;
    static ea[] field_a;
    static String field_d;
    static int field_e;
    static String field_c;

    private final void a(int param0, bl param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -47) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  param1.b(34);
                  param1.a((byte) -120);
                  this.field_b = this.field_b + param1.field_y;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("hk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void d(int param0) {
        field_c = null;
        int var1 = -41 / ((param0 - 63) / 61);
        field_d = null;
        field_a = null;
        field_i = null;
    }

    final static int[] b(int param0) {
        if (param0 != 0) {
            return (int[]) null;
        }
        return new int[8];
    }

    final static boolean a(int param0) {
        Object var1;
        int var2;
        tm var3;
        tm var4;
        tm var5;
        if (param0 == 27) {
          var1 = null;
          var2 = 0;
          if (ec.field_c.e((byte) 123)) {
            L0: {
              if (ok.field_b.e((byte) 123)) {
                break L0;
              } else {
                L1: {
                  var4 = (tm) ((Object) ok.field_b.b(120));
                  if (var4.a(param0 + -19)) {
                    ok.field_b.e(63854);
                    var2 = 1;
                    vc.a(109, cm.field_o, var4.field_s);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var1 = (tm) ((Object) ok.field_b.b(96));
                break L0;
              }
            }
            L2: {
              if (var1 == null) {
                break L2;
              } else {
                if (var2 != 0) {
                  ((tm) (var1)).a(false);
                  break L2;
                } else {
                  if (fm.a((byte) 95)) {
                    fn.a(27, 228, 3);
                    return ak.a(-92);
                  } else {
                    return ak.a(-92);
                  }
                }
              }
            }
            if (fm.a((byte) 95)) {
              fn.a(27, 228, 3);
              return ak.a(-92);
            } else {
              return ak.a(-92);
            }
          } else {
            L3: {
              var3 = (tm) ((Object) ec.field_c.b(81));
              if (var3.a(param0 ^ 19)) {
                ec.field_c.e(63854);
                vc.a(-8, cm.field_o, var3.field_s);
                var2 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = (tm) ((Object) ec.field_c.b(param0 + 92));
            if (var5 != null) {
              L4: {
                if (var2 != 0) {
                  var5.a(false);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (!fm.a((byte) 95)) {
                return ak.a(-92);
              } else {
                fn.a(27, 228, 3);
                return ak.a(-92);
              }
            } else {
              if (fm.a((byte) 95)) {
                fn.a(27, 228, 3);
                return ak.a(-92);
              } else {
                return ak.a(-92);
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0) {
        nb.field_i[oj.field_J].c(-1, mc.field_w);
        if (param0 >= -117) {
            field_e = 125;
        }
    }

    final Object a(long param0, byte param1) {
        oh var6;
        bl var7;
        Object var8;
        Object var9;
        var7 = (bl) ((Object) this.field_g.a(-94, param0));
        if (var7 != null) {
          if (param1 >= 56) {
            var9 = var7.f(-47);
            if (var9 != null) {
              if (var7.h(0)) {
                var6 = new oh(var9, var7.field_y);
                this.field_g.a(var7.field_d, true, var6);
                this.field_h.a((byte) -37, var6);
                ((bl) ((Object) var6)).field_p = 0L;
                var7.b(34);
                var7.a((byte) -121);
                return var9;
              } else {
                this.field_h.a((byte) -37, var7);
                var7.field_p = 0L;
                return var9;
              }
            } else {
              var7.b(34);
              var7.a((byte) -95);
              this.field_b = this.field_b + var7.field_y;
              return null;
            }
          } else {
            field_c = (String) null;
            var8 = var7.f(-47);
            if (var8 != null) {
              if (var7.h(0)) {
                var6 = new oh(var8, var7.field_y);
                this.field_g.a(var7.field_d, true, var6);
                this.field_h.a((byte) -37, var6);
                ((bl) ((Object) var6)).field_p = 0L;
                var7.b(34);
                var7.a((byte) -121);
                return var8;
              } else {
                this.field_h.a((byte) -37, var7);
                var7.field_p = 0L;
                return var8;
              }
            } else {
              var7.b(34);
              var7.a((byte) -95);
              this.field_b = this.field_b + var7.field_y;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(Object param0, int param1, int param2, long param3) {
        bl var6 = null;
        oh var6_ref = null;
        int var7 = MinerDisturbance.field_ab;
        try {
            if (this.field_f < param1) {
                throw new IllegalStateException();
            }
            this.a(-4924, param3);
            this.field_b = this.field_b - param1;
            while (-1 < (this.field_b ^ -1)) {
                var6 = (bl) ((Object) this.field_h.a(609));
                this.a(-127, var6);
            }
            var6_ref = new oh(param0, param1);
            this.field_g.a(param3, true, var6_ref);
            this.field_h.a((byte) -37, var6_ref);
            ((bl) ((Object) var6_ref)).field_p = (long)param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "hk.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, long param1) {
        Object var4;
        bl var5;
        var4 = null;
        if (param0 != -4924) {
          hk.b(34);
          var5 = (bl) ((Object) this.field_g.a(param0 + 4856, param1));
          this.a(param0 + 4846, var5);
          return;
        } else {
          var5 = (bl) ((Object) this.field_g.a(param0 + 4856, param1));
          this.a(param0 + 4846, var5);
          return;
        }
    }

    final static void c(int param0) {
        if (param0 > -94) {
          field_c = (String) null;
          de.field_a.a((byte) -116, (fe) (new qd()));
          return;
        } else {
          de.field_a.a((byte) -116, (fe) (new qd()));
          return;
        }
    }

    private hk() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, Object param2) {
        if (param0 != 6565) {
            return;
        }
        try {
            this.a(param2, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "hk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new ec(3);
        field_c = "Go Back";
        field_e = 0;
        field_d = "Back";
    }
}
