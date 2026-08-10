/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ah {
    static int field_r;
    static int field_o;
    static String field_n;
    static ff field_s;
    static int[] field_p;
    static int field_q;

    final static void a(int param0, byte param1, String param2) {
        int var3_int = 0;
        try {
            if (param1 != 83) {
                field_q = -5;
            }
            ei.field_i = false;
            ni.field_F = false;
            if (be.field_b != null) {
                if (!be.field_b.field_G) {
                    return;
                }
                var3_int = 1;
                if (8 != param0) {
                } else {
                    param0 = 2;
                    if (!eb.field_H) {
                        param2 = fd.field_a;
                    } else {
                        param2 = fi.field_c;
                    }
                    dd.field_d.a(vk.field_v, (byte) 106);
                }
                if (param0 == 10) {
                    ui.a(90);
                    var3_int = 0;
                }
                if (var3_int != 0) {
                    if (ni.field_F) {
                        param2 = r.a(si.field_y, param1 + -146, new String[]{param2});
                    }
                    if (!(!ha.field_a)) {
                        param2 = jl.field_l;
                    }
                    be.field_b.a(param2, -1, param0);
                }
                if (256 != param0) {
                    if ((param0 ^ -1) == -11) {
                        return;
                    }
                    if (!eb.field_H) {
                        dd.field_d.h((byte) -128);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hi.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static uf c(boolean param0) {
        if (sl.field_d != null) {
          if (param0) {
            return (uf) null;
          } else {
            return sl.field_d;
          }
        } else {
          sl.field_d = new uf();
          sl.field_d.a(-31476, sb.field_a);
          sl.field_d.field_h = 7697781;
          sl.field_d.field_d = ke.field_c;
          sl.field_d.field_j = 5;
          sl.field_d.field_q = 14;
          sl.field_d.field_a = 2763306;
          sl.field_d.field_f = 6;
          sl.field_d.field_l = 0;
          sl.field_d.field_r = 4;
          if (param0) {
            return (uf) null;
          } else {
            return sl.field_d;
          }
        }
    }

    public static void g(int param0) {
        field_s = null;
        field_n = null;
        field_p = null;
        if (param0 != 14) {
            hi.c(false);
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(-1, param1) == ob.field_a) {
              stackIn_3_0 = eo.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -127 % ((param0 - 10) / 51);
              stackIn_5_0 = ec.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hi.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final static boolean a(int param0, int param1) {
        if ((param0 ^ -1) == -1) {
            return true;
        }
        if ((param0 ^ -1) != param1) {
            return false;
        }
        return true;
    }

    final static void d(boolean param0) {
        if (bk.field_r != null) {
            bk.field_r.a((byte) -126);
            if (!param0) {
                return;
            }
            field_q = -4;
            return;
        }
        if (param0) {
            field_q = -4;
            return;
        }
    }

    hi(ul param0) {
        super(param0);
    }

    final rf a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        rf stackIn_6_0 = null;
        rf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != cd.a(param0 ^ 0, param1)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (var3_int == 0) {
              stackIn_6_0 = ob.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == -1) {
                  break L2;
                } else {
                  field_n = (String) null;
                  break L2;
                }
              }
              stackIn_10_0 = df.field_h;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("hi.G(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    static {
        field_p = new int[8192];
        field_n = "Container destroyed - save your ship";
    }
}
