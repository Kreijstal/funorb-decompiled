/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class laa extends pv {
    static Random field_n;
    private int field_o;
    static int field_j;
    static int field_m;
    private int field_k;
    private double field_l;

    public static void d() {
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            if (param6 < param0) {
              if (1 + param6 < param2) {
                L1: {
                  if (param6 + 5 >= param2) {
                    break L1;
                  } else {
                    if (param1 == param4) {
                      break L1;
                    } else {
                      var7_int = (1 & (param4 & param1)) + ((param4 >> 1) - -(param1 >> 1));
                      var8 = param6;
                      var9 = param1;
                      var10 = param4;
                      var11 = param6;
                      L2: while (true) {
                        if (param2 <= var11) {
                          laa.a(param0, param1, var8, param3, var9, 6374, param6);
                          laa.a(param0, var10, param2, param3, param4, param5, var8);
                          break L0;
                        } else {
                          L3: {
                            var12 = fn.field_k[var11];
                            if (!param3) {
                              stackOut_22_0 = uc.field_k[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = gk.field_a[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_23_0;
                          if (var7_int >= var13) {
                            L4: {
                              if (var10 >= var13) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              fn.field_k[var11] = fn.field_k[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              fn.field_k[incrementValue$1] = var12;
                              if (var13 >= var9) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                var7_int = param2 + -1;
                L6: while (true) {
                  if (param6 >= var7_int) {
                    return;
                  } else {
                    var8 = param6;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = fn.field_k[var8];
                          var10 = fn.field_k[1 + var8];
                          if (un.a(param3, var10, -17596, var9)) {
                            fn.field_k[var8] = var10;
                            fn.field_k[var8 + 1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var7, "laa.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final int c(boolean param0) {
        if (!param0) {
            int discarded$0 = this.c(false);
        }
        return (int)((double)((laa) this).field_g * ((laa) this).field_l) + ((laa) this).field_k;
    }

    final boolean b(boolean param0) {
        L0: {
          int fieldTemp$4 = ((laa) this).field_g + 1;
          ((laa) this).field_g = ((laa) this).field_g + 1;
          if (fieldTemp$4 > this.c((byte) 68)) {
            break L0;
          } else {
            if (((laa) this).field_o == 0) {
              break L0;
            } else {
              L1: {
                if (((laa) this).field_g != 1) {
                  break L1;
                } else {
                  ((laa) this).field_f.field_l = ((laa) this).field_f.field_l + ((laa) this).field_o / 39;
                  ((laa) this).field_f.field_v.a((byte) 108, ((laa) this).field_f.field_g.field_o.field_b, -1);
                  break L1;
                }
              }
              L2: {
                if (param0) {
                  break L2;
                } else {
                  field_n = null;
                  break L2;
                }
              }
              ((laa) this).field_f.field_k = this.c(param0);
              return false;
            }
          }
        }
        int discarded$5 = 39;
        this.c();
        return true;
    }

    private final void c() {
        ((laa) this).field_f.field_n = ((laa) this).field_f.c((byte) -120);
        ((laa) this).field_f.field_k = ((laa) this).field_f.b(true);
    }

    final static void a(int param0, byte param1, int param2, int param3, String param4) {
        try {
            param2 = param2 - (hfa.field_z.a(param4) >> 1);
            if (param1 > -44) {
                laa.a(123, -54, -39, true, -63, -89, -61);
            }
            hfa.field_z.c(param4, param2, param0, 65793, -1);
            jha.field_g.c(param4, param2, param0, param3, -1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "laa.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + 65793 + ')');
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          eea.field_b = false;
          var1 = 92 / ((0 - param0) / 52);
          at.field_i = null;
          if (gfa.field_i) {
            oq.field_b.o(2113632);
            break L0;
          } else {
            var2 = rja.field_o;
            if (0 >= var2) {
              oq.field_b.p(-97);
              int discarded$75 = 2;
              bi.o();
              break L0;
            } else {
              if (var2 != 1) {
                at.field_i = lga.a(true, new String[1], ra.field_j);
                at.field_i = rca.a(0, new CharSequence[3]);
                oq.field_b.p(-97);
                int discarded$76 = 2;
                bi.o();
                break L0;
              } else {
                at.field_i = qw.field_a;
                at.field_i = rca.a(0, new CharSequence[3]);
                oq.field_b.p(-97);
                int discarded$77 = 2;
                bi.o();
                break L0;
              }
            }
          }
        }
    }

    private final int c(byte param0) {
        int var2 = -128 / ((-37 - param0) / 58);
        return (int)((double)Math.abs(((laa) this).field_o) * 20.0) / 39;
    }

    laa(jfa param0, int param1) {
        try {
            ((laa) this).field_o = param1;
            ((laa) this).field_f = param0;
            ((laa) this).field_k = ((laa) this).field_f.field_k;
            ((laa) this).field_l = (double)((laa) this).field_o / (double)this.c((byte) 107);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "laa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new Random(3L);
    }
}
