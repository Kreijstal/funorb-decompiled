/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends k {
    static String field_l;
    static boolean field_k;
    static boolean field_n;
    static java.awt.Frame field_o;
    static int field_q;
    static String field_p;
    private vb field_m;

    final static void e(byte param0) {
        String var1;
        if (!cg.field_l) {
          throw new IllegalStateException();
        } else {
          if (param0 < -34) {
            if (null != ej.field_I) {
              ej.field_I.m(17);
              var1 = p.a(-123);
              eo.field_k = new hk(var1, (String) null, true, false, false);
              mf.field_f.a(-126, rj.field_c);
              rj.field_c.b((byte) 108, eo.field_k);
              rj.field_c.j(20);
              return;
            } else {
              var1 = p.a(-123);
              eo.field_k = new hk(var1, (String) null, true, false, false);
              mf.field_f.a(-126, rj.field_c);
              rj.field_c.b((byte) 108, eo.field_k);
              rj.field_c.j(20);
              return;
            }
          } else {
            return;
          }
        }
    }

    final String a(int param0, String param1) {
        ia var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(this.field_m instanceof je)) {
                break L1;
              } else {
                var3 = ((je) ((Object) this.field_m)).a(-11011);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.b((byte) -31) != ae.field_c) {
                      break L2;
                    } else {
                      if (!param1.equals(this.field_m.field_A)) {
                        stackIn_6_0 = bh.field_sb;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_8_0 = var3.a(45);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            var3_int = 55 % ((-16 - param0) / 50);
            if (!param1.equals(this.field_m.field_A)) {
              stackIn_12_0 = bh.field_sb;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("cb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void f(int param0) {
        field_o = null;
        int var1 = 55 / ((58 - param0) / 54);
        field_p = null;
        field_l = null;
    }

    final static void b(boolean param0) {
        k.field_h.e(-13413, 9);
        vh.field_L = param0 ? true : false;
    }

    final qh a(String param0, byte param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        qh stackIn_7_0 = null;
        qh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 106) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            L2: {
              if (!(this.field_m instanceof je)) {
                break L2;
              } else {
                var3 = ((je) ((Object) this.field_m)).a(param1 + -11117);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.b((byte) -31) != ae.field_c) {
                    stackIn_7_0 = lp.field_xb;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (param0.equals(this.field_m.field_A)) {
                stackIn_11_0 = ae.field_c;
                break L3;
              } else {
                stackIn_11_0 = lp.field_xb;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("cb.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_11_0;
        }
    }

    cb(vb param0, vb param1) {
        super(param0);
        try {
            this.field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(int param0) {
        if (param0 < -90) {
          if (!ld.field_s) {
            return false;
          } else {
            if (ng.field_b != 0) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            ni.field_Sb = true;
            if (param1 != 9) {
                cb.f(-31);
            }
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            sj.a(param0, (byte) 117, var3, var2, var4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "cb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Searching for an opponent";
        field_k = false;
        field_q = 0;
        field_p = "To Customer Support";
    }
}
