/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ph extends dm {
    private long field_i;
    private String field_e;
    static rk field_l;
    static Random field_d;
    static boolean field_k;
    static jd field_g;
    static String field_m;
    static vj field_j;
    static int field_h;
    static km field_f;

    final void a(p param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param0.a(param1 ^ -7, this.field_i);
              param0.a(this.field_e, false);
              if (param1 == 123) {
                break L1;
              } else {
                field_j = (vj) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ph.D(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_f = null;
        field_d = null;
        field_l = null;
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_j = null;
    }

    ug b(byte param0) {
        if (param0 <= 27) {
            return (ug) null;
        }
        return kn.field_H;
    }

    final static boolean a(int param0, byte param1, String param2, long param3, int[] param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -43) {
                break L1;
              } else {
                field_j = (vj) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 == null) {
                  break L3;
                } else {
                  L4: {
                    if (-3 != (param0 ^ -1)) {
                      break L4;
                    } else {
                      if (!kn.a(param2, param3, 29712)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("ph.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            if (-11 < (il.field_a ^ -1)) {
              L2: {
                var3_int = 0;
                if (!od.field_W) {
                  break L2;
                } else {
                  od.field_W = false;
                  var3_int = 1;
                  break L2;
                }
              }
              wc.a(bb.field_e, var3_int != 0, jd.b(false), lf.i(120), false);
              break L0;
            } else {
              if (mk.b((byte) 109)) {
                if (rm.field_Q == 0) {
                  cf.a(84, false, param2);
                  kf.a(0, (byte) 98, param0, 0);
                  return;
                } else {
                  cg.a(-12, param0);
                  return;
                }
              } else {
                wb.b();
                jc.a(240, (byte) -117, 320);
                kf.a(0, (byte) 98, param0, 0);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("ph.M(");

            if (param0 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 0 % ((-40 - param0) / 41);
            if (null != gi.field_g) {
              L1: {
                if ((param1.toLowerCase().indexOf(gi.field_g.toLowerCase()) ^ -1) > -1) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("ph.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    ph(long param0, String param1) {
        try {
            this.field_i = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ph.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var2;
        String var3;
        var2 = Chess.field_G;
        if (param0 == -7125) {
          if (qk.field_h != 0) {
            if (rn.field_b != 2) {
              nh.field_m = true;
              return;
            } else {
              nh.field_m = false;
              return;
            }
          } else {
            nh.field_m = true;
            return;
          }
        } else {
          var3 = (String) null;
          ph.a((byte) -38, (String) null);
          if (qk.field_h != 0) {
            if (rn.field_b != 2) {
              nh.field_m = true;
              return;
            } else {
              nh.field_m = false;
              return;
            }
          } else {
            nh.field_m = true;
            return;
          }
        }
    }

    static {
        field_d = new Random();
        field_h = 0;
        field_m = "Members";
        field_g = new jd("email");
    }
}
