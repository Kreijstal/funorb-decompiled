/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sma {
    static String field_d;
    static joa field_e;
    int[] field_b;
    static en field_c;
    private int[] field_f;
    private ff field_a;

    private final void a() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        ((sma) this).field_f = new int[((sma) this).field_a.field_P];
        ((sma) this).field_b = new int[((sma) this).field_a.field_P];
        for (var2 = 0; var2 < ((sma) this).field_b.length; var2++) {
            ((sma) this).field_b[var2] = var2;
            ((sma) this).field_f[var2] = var2;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 67;
        field_d = null;
    }

    final static int a(String param0) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var8_int = 0;
        int var9 = 0;
        String var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        File var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!hna.field_a.field_c) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!gj.field_d.containsKey((Object) (Object) param0)) {
                var10 = eba.a((byte) 38, param0);
                if (var10 != null) {
                  var3 = aqa.field_c + var10;
                  if (af.field_b.a(var3, "", 0)) {
                    if (af.field_b.c(var3, -122)) {
                      var19 = af.field_b.a(var3, (byte) 117, "");
                      var17 = var19;
                      var15 = var17;
                      var12 = var15;
                      var4 = var12;
                      var5 = null;
                      try {
                        L1: {
                          var13 = iba.a(var10, (byte) -94);
                          break L1;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackOut_20_0 = -1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      }
                      L2: {
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var13 != null) {
                            L3: {
                              L4: {
                                var6 = 1;
                                int discarded$3 = -86;
                                var18 = vj.a(var13);
                                var16 = var18;
                                var14 = var16;
                                var11 = var14;
                                var7 = var11;
                                if (var7 == null) {
                                  break L4;
                                } else {
                                  if (var18.length == var19.length) {
                                    var8_int = 0;
                                    L5: while (true) {
                                      if (var18.length <= var8_int) {
                                        break L3;
                                      } else {
                                        if (var19[var8_int] != var18[var8_int]) {
                                          var6 = 0;
                                          break L3;
                                        } else {
                                          var8_int++;
                                          continue L5;
                                        }
                                      }
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var6 = 0;
                              break L3;
                            }
                            try {
                              L6: {
                                L7: {
                                  if (var6 != 0) {
                                    break L7;
                                  } else {
                                    boolean discarded$4 = hna.field_a.a(var19, var13, true);
                                    break L7;
                                  }
                                }
                                break L6;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var8 = decompiledCaughtException;
                              stackOut_38_0 = -1;
                              stackIn_39_0 = stackOut_38_0;
                              return stackIn_39_0;
                            }
                            int discarded$5 = 1;
                            mj.a(param0, var13);
                            stackOut_40_0 = 100;
                            stackIn_41_0 = stackOut_40_0;
                            return stackIn_41_0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_42_0 = -1;
                      stackIn_43_0 = stackOut_42_0;
                      break L0;
                    } else {
                      stackOut_15_0 = af.field_b.a(var3, true);
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = -1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var2;
            stackOut_44_1 = new StringBuilder().append("sma.A(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L8;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + 28893 + ')');
        }
        return stackIn_43_0;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hca[] var5 = null;
        int var6 = 0;
        hca var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        ((sma) this).field_b = new int[((sma) this).field_a.field_H.length];
        ((sma) this).field_f = new int[((sma) this).field_a.field_H.length];
        var2 = 0;
        L0: while (true) {
          if (((sma) this).field_a.field_H.length <= var2) {
            if (!param0) {
              var2 = 0;
              L1: while (true) {
                if (((sma) this).field_f.length <= var2) {
                  return;
                } else {
                  var3 = -1;
                  var4 = 0;
                  var5 = ((sma) this).field_a.field_H;
                  var6 = 0;
                  L2: while (true) {
                    L3: {
                      if (var5.length <= var6) {
                        break L3;
                      } else {
                        var7 = var5[var6];
                        if (!((sma) this).field_a.f((byte) -83, var7.A(0))) {
                          if (-1 == ((sma) this).field_f[var7.A(0)]) {
                            L4: {
                              L5: {
                                var8 = var7.e(false) + var7.j(false);
                                if (var3 == -1) {
                                  var4 = var8;
                                  var3 = var7.A(0);
                                  var6++;
                                  break L5;
                                } else {
                                  if (var4 < var8) {
                                    var4 = var8;
                                    var3 = var7.A(0);
                                    break L5;
                                  } else {
                                    if (var4 == var8) {
                                      if (((sma) this).field_a.field_c.field_b[var7.A(0)] < ((sma) this).field_a.field_c.field_b[var3]) {
                                        var4 = var8;
                                        var3 = var7.A(0);
                                        break L4;
                                      } else {
                                        var6++;
                                        continue L2;
                                      }
                                    } else {
                                      var6++;
                                      continue L2;
                                    }
                                  }
                                }
                              }
                              var6++;
                              break L4;
                            }
                            var6++;
                            var6++;
                            break L3;
                          } else {
                            var6++;
                            continue L2;
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    }
                    if (-1 != var3) {
                      ((sma) this).field_b[var2] = var3;
                      ((sma) this).field_f[var3] = var2;
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            ((sma) this).field_b[var2] = -1;
            ((sma) this).field_f[var2] = -1;
            var2++;
            continue L0;
          }
        }
    }

    sma(ff param0) {
        try {
            ((sma) this).field_a = param0;
            int discarded$0 = -54;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sma.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Exploiting a bug";
        field_e = new joa();
    }
}
