/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

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
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = wizardrun.field_H;
              if (param0 == 1) {
                break L0;
              } else {
                var4 = null;
                java.net.URL discarded$2 = jl.a(74, (java.net.URL) null, (java.applet.Applet) null);
                break L0;
              }
            }
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
                try {
                  L4: {
                    ld.field_e.a(-1);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (sl.field_o != null) {
                var1 = 0;
                L7: while (true) {
                  if (var1 >= sl.field_o.length) {
                    break L6;
                  } else {
                    if (null != sl.field_o[var1]) {
                      try {
                        L8: {
                          sl.field_o[var1].a(-1);
                          var1++;
                          break L8;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          var1++;
                          break L9;
                        }
                      }
                      continue L7;
                    } else {
                      var1++;
                      continue L7;
                    }
                  }
                }
              } else {
                break L6;
              }
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
        if (null != pa.field_f) {
            if (!(pa.field_f.equals((Object) (Object) param2.getParameter("settings")))) {
                var3 = (Object) (Object) pa.field_f;
                var4 = var3;
                var4 = var3;
            }
        }
        if (null != nk.field_M) {
            if (!(nk.field_M.equals((Object) (Object) param2.getParameter("session")))) {
                var4 = (Object) (Object) nk.field_M;
            }
        }
        if (param0 > -60) {
            jl.d(-41);
        }
        return da.a(121, -1, (String) var4, param1, (String) var3);
    }

    final static void a(int param0, int param1, int param2, qj param3, qj param4, int param5) {
        og.field_N = param4;
        if (param0 > -104) {
            Object var7 = null;
            java.net.URL discarded$0 = jl.a(4, (java.net.URL) null, (java.applet.Applet) null);
        }
        e.field_d = param2;
        na.field_e = param1;
        vl.field_h = param5;
        og.field_S = param3;
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          if (!param2.field_v) {
            if (param2.d((byte) 53)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_6_0;
          if (param3) {
            break L1;
          } else {
            var9 = null;
            java.net.URL discarded$3 = jl.a(83, (java.net.URL) null, (java.applet.Applet) null);
            break L1;
          }
        }
        L2: {
          if (!(param2 instanceof pl)) {
            break L2;
          } else {
            param4 = param4 & ((pl) (Object) param2).field_B;
            break L2;
          }
        }
        L3: {
          if (!param4) {
            stackOut_14_0 = ((jl) this).field_t;
            stackIn_15_0 = stackOut_14_0;
            break L3;
          } else {
            if (var6 == 0) {
              stackOut_13_0 = ((jl) this).field_p;
              stackIn_15_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = ((jl) this).field_q;
              stackIn_15_0 = stackOut_12_0;
              break L3;
            }
          }
        }
        L4: {
          var7 = stackIn_15_0;
          if (param4) {
            stackOut_17_0 = 16777215;
            stackIn_18_0 = stackOut_17_0;
            break L4;
          } else {
            stackOut_16_0 = 7105644;
            stackIn_18_0 = stackOut_16_0;
            break L4;
          }
        }
        var8 = stackIn_18_0;
        e.a(((jl) this).field_x, (param2.field_n + -((jl) this).field_x[0].field_s >> 1646345857) + (param2.field_l + param1), var7, (byte) 118, param0 + param2.field_o, param2.field_r);
        int discarded$4 = ((jl) this).field_k.a(param2.field_k, param0 + param2.field_o, -2 + param2.field_l + param1, param2.field_r, param2.field_n, var8, -1, 1, 1, ((jl) this).field_k.field_M);
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
        if (param0 != 4) {
            field_w = null;
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
