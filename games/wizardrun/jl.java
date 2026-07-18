/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;

final class jl extends ll {
    static kl field_u;
    static int field_r;
    static int field_s;
    private o[] field_x;
    static o field_w;
    private int field_p;
    private int field_t;
    private int field_q;
    static String field_v;

    final static void b(int param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  if (null != ii.field_f) {
                    ii.field_f.a((byte) -96);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null == ig.field_q) {
                    break L2;
                  } else {
                    ig.field_q.a((byte) 79);
                    break L2;
                  }
                }
                L3: {
                  if (null != ld.field_e) {
                    {
                      L4: {
                        ld.field_e.a(-1);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (sl.field_o != null) {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= sl.field_o.length) {
                        break L6;
                      } else {
                        L8: {
                          if (null == sl.field_o[var1_int]) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw bd.a((Throwable) (Object) var1, "jl.V(" + 1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == pa.field_f) {
                break L1;
              } else {
                if (!pa.field_f.equals((Object) (Object) param2.getParameter("settings"))) {
                  var3 = (Object) (Object) pa.field_f;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == nk.field_M) {
                break L2;
              } else {
                if (!nk.field_M.equals((Object) (Object) param2.getParameter("session"))) {
                  var4 = (Object) (Object) nk.field_M;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 <= -60) {
                break L3;
              } else {
                jl.d(-41);
                break L3;
              }
            }
            stackOut_10_0 = da.a(121, -1, (String) var4, param1, (String) var3);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("jl.BA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, int param1, int param2, qj param3, qj param4, int param5) {
        try {
            og.field_N = param4;
            e.field_d = 12;
            na.field_e = 12;
            vl.field_h = 12;
            og.field_S = param3;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "jl.AA(" + -122 + ',' + 12 + ',' + 12 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + 12 + ')');
        }
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param2.field_v) {
                if (param2.d((byte) 53)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param3) {
                break L2;
              } else {
                var9 = null;
                java.net.URL discarded$2 = jl.a(83, (java.net.URL) null, (java.applet.Applet) null);
                break L2;
              }
            }
            L3: {
              if (!(param2 instanceof pl)) {
                break L3;
              } else {
                param4 = param4 & ((pl) (Object) param2).field_B;
                break L3;
              }
            }
            L4: {
              if (!param4) {
                stackOut_14_0 = ((jl) this).field_t;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                if (var6_int == 0) {
                  stackOut_13_0 = ((jl) this).field_p;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = ((jl) this).field_q;
                  stackIn_15_0 = stackOut_12_0;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_15_0;
              if (param4) {
                stackOut_17_0 = 16777215;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = 7105644;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            var8 = stackIn_18_0;
            e.a(((jl) this).field_x, (param2.field_n + -((jl) this).field_x[0].field_s >> 1) + (param2.field_l + param1), var7, (byte) 118, param0 + param2.field_o, param2.field_r);
            int discarded$3 = ((jl) this).field_k.a(param2.field_k, param0 + param2.field_o, -2 + param2.field_l + param1, param2.field_r, param2.field_n, var8, -1, 1, 1, ((jl) this).field_k.field_M);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("jl.B(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static od c(int param0) {
        if (s.field_b == null) {
            s.field_b = new od();
            s.field_b.a(gh.field_b, -120);
            s.field_b.field_e = 7697781;
            s.field_b.field_g = e.field_b;
            s.field_b.field_h = 4;
            s.field_b.field_t = 14;
            s.field_b.field_p = 2763306;
            s.field_b.field_l = 6;
            s.field_b.field_i = 5;
            s.field_b.field_r = 0;
        }
        return s.field_b;
    }

    public static void d(int param0) {
        if (param0 != 2763306) {
            field_w = null;
        }
        field_w = null;
        field_u = null;
        field_v = null;
    }

    private jl(int param0, int param1, int param2) {
        ((jl) this).field_k = va.field_i;
        ((jl) this).field_t = param2;
        ((jl) this).field_p = param0;
        ((jl) this).field_q = param1;
        ((jl) this).field_x = vf.field_j;
    }

    public jl() {
        this(2188450, 2591221, 9543);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 20;
        field_v = "Account created successfully!";
    }
}
