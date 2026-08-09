/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh {
    static boolean field_c;
    static int field_d;
    static int field_b;
    static int[] field_e;
    private java.util.zip.Inflater field_a;

    final static void a(boolean param0, byte param1, mf param2, mf param3, mf param4) {
        try {
            di.field_g = vn.a((byte) 41, "");
            di.field_g.a((byte) -128, false);
            wc.a(83, param2, param3, param4);
            kn.a((byte) -96);
            dn.field_q = vn.field_g;
            if (param1 > -111) {
                dh.a(13, (byte) 34);
            }
            ui.field_b = vn.field_g;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "dh.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static ja[] a(int param0, lk param1) {
        ja[] stackIn_4_0 = null;
        ja[] stackIn_10_0 = null;
        ja[] stackIn_13_0 = null;
        ja[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ja[] var4 = null;
        int var5 = 0;
        ja var6 = null;
        int var7 = 0;
        la var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (!param1.c(0)) {
              stackIn_4_0 = new ja[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param1.a(5);
              L1: while (true) {
                if (var8.field_f != 0) {
                  if (-3 != (var8.field_f ^ -1)) {
                    if (param0 == 6629) {
                      var10 = (int[]) (var8.field_b);
                      var9 = var10;
                      var3 = var9;
                      var4 = new ja[var10.length >> -1233688350];
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          stackIn_18_0 = (ja[]) (var4);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new ja();
                          var4[var5] = var6;
                          var6.field_c = var3[var5 << -501898174];
                          var6.field_g = var3[1 + (var5 << -875913246)];
                          var6.field_d = var3[(var5 << -21383230) + 2];
                          var6.field_f = var3[3 + (var5 << -358555454)];
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_13_0 = (ja[]) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = new ja[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  en.a((byte) 101, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("dh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    public dh() {
        this(-1, 1000000, 1000000);
    }

    final static boolean a(int param0, byte param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = jb.field_m;
              var3 = 0;
              if (param1 >= 26) {
                break L1;
              } else {
                dh.a((byte) -79);
                break L1;
              }
            }
            L2: while (true) {
              if (var3 >= var2.length) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = var2[var3];
                if (param0 == var4) {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "dh.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 61 % ((46 - param0) / 49);
    }

    final void a(int param0, byte[] param1, n param2) {
        try {
            try {
                if (param2.field_g[param2.field_m] != 31 || (param2.field_g[1 + param2.field_m] ^ -1) != 116) {
                    throw new RuntimeException("");
                }
                if (null == this.field_a) {
                    this.field_a = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_a.setInput(param2.field_g, param2.field_m - -10, param2.field_g.length + (-10 + -param2.field_m) - 8);
                    this.field_a.inflate(param1);
                } catch (Exception exception) {
                    this.field_a.reset();
                    throw new RuntimeException("");
                }
                this.field_a.reset();
                int var4_int = -73 % ((13 - param0) / 58);
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) ((Object) runtimeException), "dh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private dh(int param0, int param1, int param2) {
    }

    static {
        field_e = new int[]{1, 1, 2, 2};
        field_c = false;
        field_d = 0;
        field_b = 1;
    }
}
