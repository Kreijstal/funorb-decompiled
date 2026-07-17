/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mf extends al {
    static pk field_s;
    static Calendar field_t;
    static int field_u;
    static oh[] field_q;
    static ah field_v;
    static String field_r;
    static ob field_w;

    final static boolean a(byte param0, String param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -36 % ((param0 - 89) / 33);
                param1 = um.a(param1, '_', false, "");
                var4 = dj.a(116, param2);
                if (param1.indexOf(param2) != -1) {
                  break L2;
                } else {
                  if (param1.indexOf(var4) == -1) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("mf.K(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    mf(jb param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_N, -1, 2147483647, false);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TetraLink.field_J;
        try {
          L0: {
            if (hl.a(true)) {
              boolean discarded$15 = pj.field_i.a(aa.field_Vb, true, p.field_m, false);
              pj.field_i.j(param0 ^ param0);
              L1: while (true) {
                if (!nj.b((byte) 28)) {
                  break L0;
                } else {
                  boolean discarded$16 = pj.field_i.a(dg.field_e, tb.field_m, param0 ^ -81);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == hd.field_u) {
                  break L2;
                } else {
                  if (!hd.field_u.field_c) {
                    break L2;
                  } else {
                    qa.b((byte) 59);
                    pj.field_i.a((na) (Object) new qc(pj.field_i, wg.field_d), false);
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "mf.I(" + param0 + 41);
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        try {
            if (!(!param4)) {
                in.a(param1 - -param0.field_t, param0.field_w + param2, (byte) -110, param0.field_F, param0.field_u);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "mf.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        field_q = null;
        field_t = null;
        field_r = null;
        field_v = null;
        field_w = null;
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          var1_int = 0;
          var2 = 0;
          L0: while (true) {
            if (!nj.b((byte) 28)) {
              L1: {
                gm.field_h.a(gd.a(aa.field_Nb, a.field_a, 8395), gd.a(ci.field_B, li.field_o, 8395), (byte) 92);
                if (!gm.field_h.b(83)) {
                  break L1;
                } else {
                  var1_int = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var3 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (gm.field_h.field_b >= 0) {
                      var3 = io.field_g[gm.field_h.field_b];
                      if (var3 == 2) {
                        ka.c(88);
                        break L2;
                      } else {
                        if (var3 != 5) {
                          break L2;
                        } else {
                          ka.c(88);
                          break L2;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (var2 == 0) {
                  break L2;
                } else {
                  if (f.field_z == 2) {
                    break L2;
                  } else {
                    ka.c(84);
                    break L2;
                  }
                }
              }
              L4: {
                if (var3 != 0) {
                  break L4;
                } else {
                  if (2 == f.field_z) {
                    var4 = -tg.field_a + k.a(0);
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (var6 <= 0) {
                      var3 = 2;
                      om.a(true, 10, 5);
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              return var3;
            } else {
              L5: {
                gm.field_h.a(93);
                if (!gm.field_h.b(83)) {
                  break L5;
                } else {
                  var1_int = 1;
                  break L5;
                }
              }
              if (dg.field_e != 13) {
                continue L0;
              } else {
                var2 = 1;
                continue L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "mf.M(" + 1000 + 41);
        }
    }

    mf(int param0) {
        this(od.field_S, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_r = "Unpacking music";
    }
}
