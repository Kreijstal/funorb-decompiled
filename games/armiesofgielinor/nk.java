/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nk {
    int field_f;
    static String field_t;
    int[][] field_r;
    byte[] field_v;
    byte[] field_n;
    byte[][] field_c;
    int[] field_B;
    byte[] field_e;
    int field_I;
    boolean[] field_l;
    byte[] field_d;
    int[] field_y;
    static byte[] field_C;
    int field_i;
    int field_j;
    static int field_m;
    byte[] field_o;
    int field_b;
    int field_q;
    int field_L;
    int[] field_u;
    int field_g;
    int field_z;
    int field_E;
    int field_a;
    int[] field_h;
    byte field_K;
    int field_x;
    byte[] field_s;
    int[][] field_k;
    int[][] field_H;
    int field_w;
    int field_J;
    int field_F;
    boolean[] field_p;

    public static void b() {
        field_t = null;
        field_C = null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            cq.field_u = new int[vs.field_e.length];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= vs.field_e.length) {
                L2: {
                  if (param0 > 79) {
                    break L2;
                  } else {
                    nk.a((byte) 84);
                    break L2;
                  }
                }
                var1_int = 0;
                L3: while (true) {
                  if (var1_int >= ef.field_c) {
                    break L0;
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (ks.field_y <= var2) {
                        var1_int++;
                        continue L3;
                      } else {
                        L5: {
                          var3 = cq.field_u[var1_int * ks.field_y + var2];
                          if (1 == var3) {
                            L6: {
                              var3 = 7;
                              if (!ta.field_L) {
                                break L6;
                              } else {
                                var3 = 4;
                                break L6;
                              }
                            }
                            L7: {
                              L8: {
                                if (0 == var2) {
                                  break L8;
                                } else {
                                  if (cq.field_u[-1 + (var2 + var1_int * ks.field_y)] == 1) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var3 = 1;
                              break L7;
                            }
                            L9: {
                              L10: {
                                if (-1 + ks.field_y == var2) {
                                  break L10;
                                } else {
                                  if (1 == cq.field_u[1 + var2 + var1_int * ks.field_y]) {
                                    break L10;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var3 = 1;
                              break L9;
                            }
                            L11: {
                              L12: {
                                if (var1_int == 0) {
                                  break L12;
                                } else {
                                  if (cq.field_u[var2 + ks.field_y * (var1_int - 1)] != 1) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var3 = 1;
                              break L11;
                            }
                            L13: {
                              L14: {
                                if (-1 + ef.field_c == var1_int) {
                                  break L14;
                                } else {
                                  if (cq.field_u[(var1_int - -1) * ks.field_y + var2] == 1) {
                                    break L14;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var3 = 1;
                              break L13;
                            }
                            cq.field_u[var1_int * ks.field_y + var2] = var3;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                cq.field_u[var1_int] = va.field_G[vs.field_e[var1_int].field_h];
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "nk.C(" + param0 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          int discarded$2 = 0;
          var3 = be.a(-127, param1);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var4 = 0;
            L0: while (true) {
              if (var4 < param1.length()) {
                if (wg.a(param1.charAt(var4), -3904)) {
                  var4++;
                  continue L0;
                } else {
                  stackOut_9_0 = od.field_h;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("nk.B(").append(false).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + -95 + ')');
        }
    }

    final static wk[] a(int param0, byte param1, int param2, kl param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          if (kp.a(false, param0, param3, param2)) {
            int discarded$2 = 32;
            return se.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("nk.D(").append(param0).append(',').append(28).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    nk() {
        ((nk) this).field_l = new boolean[16];
        ((nk) this).field_c = new byte[6][258];
        ((nk) this).field_o = new byte[4096];
        ((nk) this).field_y = new int[6];
        ((nk) this).field_u = new int[256];
        ((nk) this).field_i = 0;
        ((nk) this).field_n = new byte[256];
        ((nk) this).field_H = new int[6][258];
        ((nk) this).field_d = new byte[18002];
        ((nk) this).field_s = new byte[18002];
        ((nk) this).field_r = new int[6][258];
        ((nk) this).field_B = new int[257];
        ((nk) this).field_h = new int[16];
        ((nk) this).field_q = 0;
        ((nk) this).field_k = new int[6][258];
        ((nk) this).field_p = new boolean[256];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "TAB - hide chat temporarily";
    }
}
