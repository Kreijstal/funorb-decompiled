/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sd extends cn {
    static String field_v;
    static int field_s;
    static bd field_w;
    static bd field_t;
    static boolean field_u;

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            L0: {
              if (param1 == 0) {
                break L0;
              } else {
                field_v = (String) null;
                break L0;
              }
            }
            try {
              L1: {
                a.a(bn.c(param1 + -1), new Object[]{new Integer(param0)}, "resizing", -13730);
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_v = null;
        if (param0 != -822203935) {
            java.awt.Frame var2 = (java.awt.Frame) null;
            sd.a((fd) null, -34, (java.awt.Frame) null);
        }
        field_t = null;
        field_w = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_u = true;
                break L1;
              }
            }
            var3_int = 0;
            var4 = s.field_g;
            L2: while (true) {
              if (var3_int >= hf.field_d.length) {
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = jf.field_b[var3_int];
                  if (0 <= var5) {
                    var6 = wb.a(111, true, hf.field_d[var3_int]);
                    var7 = -(var6 >> 701548513) + wk.field_c;
                    var4 = var4 + cl.field_l;
                    if (uk.a(-jd.field_l + var7, param2, var6 + (jd.field_l << 159747617), var4, 124, param1, (ab.field_b << -1673181791) + eh.field_d)) {
                      stackIn_10_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (eh.field_d + cl.field_l + (ab.field_b << -822203935));
                      break L3;
                    }
                  } else {
                    var4 = var4 + kb.field_d;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "sd.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    sd(int param0) {
        this(jd.field_s, param0);
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        try {
            if (param4) {
                ij.a(param3.field_x, param3.field_s, param3.field_m + param0, param3.field_v + param1, false);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "sd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    sd(vm param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_y, -1, 2147483647, false);
    }

    final static void a(fd param0, int param1, java.awt.Frame param2) {
        kk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        java.awt.Frame var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(7, param2);
              L2: while (true) {
                if (var3.field_f != 0) {
                  if ((var3.field_f ^ -1) == -2) {
                    L3: {
                      param2.setVisible(false);
                      param2.dispose();
                      if (param1 < -98) {
                        break L3;
                      } else {
                        var5 = (java.awt.Frame) null;
                        sd.a((fd) null, 120, (java.awt.Frame) null);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    vj.a(100L, (byte) -49);
                    continue L1;
                  }
                } else {
                  vj.a(10L, (byte) -49);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("sd.GA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_v = "Loading sound effects";
    }
}
