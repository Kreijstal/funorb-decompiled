/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterable {
    static String field_a;
    static String field_c;
    static o[] field_g;
    private gg field_d;
    gg[] field_b;
    static o[] field_f;
    static int field_h;
    int field_e;
    static String field_i;

    public static void a(int param0) {
        if (param0 != 7903) {
            return;
        }
        field_f = null;
        field_g = null;
        field_i = null;
        field_c = null;
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new n((ii) this);
    }

    final gg a(long param0, int param1) {
        gg var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        gg var4 = ((ii) this).field_b[(int)((long)(((ii) this).field_e + -1) & param0)];
        ((ii) this).field_d = var4.field_d;
        if (param1 >= -83) {
            ii.a(-1);
        }
        while (var4 != ((ii) this).field_d) {
            if (!(~((ii) this).field_d.field_g != ~param0)) {
                var5 = ((ii) this).field_d;
                ((ii) this).field_d = ((ii) this).field_d.field_d;
                return var5;
            }
            ((ii) this).field_d = ((ii) this).field_d.field_d;
        }
        ((ii) this).field_d = null;
        return null;
    }

    final static int a(int param0, int param1) {
        if (param1 <= 125) {
            field_f = null;
        }
        param0 = (param0 & 1431655765) + ((-1431655766 & param0) >>> 1);
        param0 = (858993459 & param0) + ((-858993458 & param0) >>> 2);
        param0 = 252645135 & (param0 >>> 4) + param0;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return 255 & param0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        int var12 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < mi.field_b) {
                param4 = param4 - (mi.field_b + -param1);
                param1 = mi.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (~mi.field_k > ~(param4 + param1)) {
                param4 = mi.field_k + -param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~mi.field_l < ~param2) {
                param0 = param0 - (-param2 + mi.field_l);
                param2 = mi.field_l;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~mi.field_e <= ~(param2 + param0)) {
                break L4;
              } else {
                param0 = -param2 + mi.field_e;
                break L4;
              }
            }
            L5: {
              if (param4 <= 0) {
                break L5;
              } else {
                if (param0 <= 0) {
                  break L5;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var6, "ii.A(" + param0 + ',' + param1 + ',' + param2 + ',' + 64 + ',' + param4 + ',' + true + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, gg param2) {
        gg var5 = null;
        try {
            if (null != param2.field_a) {
                param2.c(10);
            }
            var5 = ((ii) this).field_b[(int)(param1 & (long)(-1 + ((ii) this).field_e))];
            param2.field_d = var5;
            param2.field_a = var5.field_a;
            param2.field_a.field_d = param2;
            param2.field_g = param1;
            if (param0 != -858993458) {
                field_g = null;
            }
            param2.field_d.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ii.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(boolean param0, int param1, dl param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        uj[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        uj[] var10 = null;
        nj var11 = null;
        Object stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_22_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param2.b((byte) 98)) {
              L1: {
                if (param4 != 0) {
                  break L1;
                } else {
                  var10 = dc.a((byte) 124, param2);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        L3: {
                          if (param5 != var10[var8].field_c) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              var11 = param2.a(param5, param3, param4, (byte) -106, 0);
              L4: while (true) {
                if (0 != var11.field_c) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (var7 != null) {
                    if (var11.field_c == 2) {
                      de.a(param2, var7, (byte) 119);
                      stackOut_26_0 = null;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_22_0 = null;
                    stackIn_23_0 = stackOut_22_0;
                    return (java.awt.Frame) (Object) stackIn_23_0;
                  }
                } else {
                  i.a((byte) 89, 10L);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("ii.F(").append(true).append(',').append(0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (java.awt.Frame) (Object) stackIn_27_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Mega Power";
        field_c = "This entry doesn't match";
        field_i = "Aiming: Mouse";
    }
}
