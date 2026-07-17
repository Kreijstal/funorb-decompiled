/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ada implements dja {
    static int[] field_a;
    static pia field_b;

    public static void a() {
        field_b = null;
        field_a = null;
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
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (nwa.field_c.field_k) {
              if (jma.field_q.containsKey((Object) (Object) param0)) {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var10 = mib.a((byte) -33, param0);
                if (var10 != null) {
                  var3 = oea.field_p + var10;
                  if (!tba.field_q.a((byte) -107, "", var3)) {
                    stackOut_13_0 = -1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (tba.field_q.a(32171, var3)) {
                      var18 = tba.field_q.a("", true, var3);
                      var16 = var18;
                      var14 = var16;
                      var11 = var14;
                      var4 = var11;
                      var5 = null;
                      try {
                        L1: {
                          var13 = lfb.a(var10, (byte) 34);
                          break L1;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackOut_21_0 = -1;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      }
                      L2: {
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var13 != null) {
                            L3: {
                              L4: {
                                var6 = 1;
                                int discarded$2 = 48;
                                var19 = ana.a(var13);
                                var17 = var19;
                                var15 = var17;
                                var12 = var15;
                                var7 = var12;
                                if (var7 == null) {
                                  break L4;
                                } else {
                                  if (var18.length != var19.length) {
                                    break L4;
                                  } else {
                                    var8_int = 0;
                                    L5: while (true) {
                                      if (var8_int >= var19.length) {
                                        break L3;
                                      } else {
                                        if (var18[var8_int] == var19[var8_int]) {
                                          var8_int++;
                                          continue L5;
                                        } else {
                                          var6 = 0;
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var6 = 0;
                              break L3;
                            }
                            try {
                              L6: {
                                L7: {
                                  if (var6 == 0) {
                                    boolean discarded$3 = nwa.field_c.a(var18, (byte) 110, var13);
                                    break L7;
                                  } else {
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
                            td.a((byte) 123, param0, var13);
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
                      stackOut_16_0 = tba.field_q.a(var3, -2118);
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                } else {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var2;
            stackOut_44_1 = new StringBuilder().append("ada.C(");
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
          throw rta.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + 1 + 41);
        }
        return stackIn_43_0;
    }

    public final tv a(byte param0) {
        int var2 = 61 % ((param0 - -64) / 50);
        return (tv) (Object) new cda();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new cda[param1];
    }

    final static int a(rsb param0, lbb param1, boolean param2, rna[] param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rna var6 = null;
        int var8 = 0;
        et var9 = null;
        int var10 = 0;
        int var11 = 0;
        ika var12 = null;
        uoa var13 = null;
        lrb var14 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = -1;
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= param3.length) {
                  break L2;
                } else {
                  var6 = param3[var5];
                  if (var6 instanceof lrb) {
                    var14 = (lrb) (Object) var6;
                    var8 = var14.a(1, -116);
                    if (param0.a(var8, 0, -1)) {
                      var4_int = var8;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    if (!(var6 instanceof ika)) {
                      if (!(var6 instanceof uoa)) {
                        var5++;
                        continue L1;
                      } else {
                        var13 = (uoa) (Object) var6;
                        var8 = var13.a(0, -103);
                        var9 = param1.a(-31634, var8);
                        if (var9 == null) {
                          break L2;
                        } else {
                          var10 = var9.field_b;
                          var4_int = fq.field_o[var10];
                          if (var13.a(1, -126) < 0) {
                            var4_int = mjb.b(21957, var4_int);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    } else {
                      var12 = (ika) (Object) var6;
                      var4_int = var12.a(0, -117);
                      break L2;
                    }
                  }
                }
              }
              stackOut_15_0 = var4_int;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ada.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          L5: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[100];
    }
}
