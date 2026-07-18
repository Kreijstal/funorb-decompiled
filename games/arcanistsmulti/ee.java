/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ee implements pd {
    static String field_c;
    static String field_a;
    static ll[] field_b;
    static dn field_g;
    private long field_e;
    static int[] field_d;
    static String field_f;

    abstract String a(boolean param0);

    public static void c(boolean param0) {
        field_c = null;
        field_a = null;
        field_g = null;
        field_d = null;
        field_b = null;
        field_f = null;
    }

    final static boolean a(ll param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        byte[] var21 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            param2 = param2 >> 1;
            param1 = param1 >> 1;
            param2 += 0;
            var4_int = param2;
            var5 = param0.field_h;
            if (param0.field_h > var4_int) {
              var7 = var4_int;
              var6 = 1;
              if (var7 > -1) {
                L1: {
                  param1 += 0;
                  var7 = param1;
                  var8 = param0.field_c;
                  if (param0.field_c > var7) {
                    var10 = var7;
                    var9 = 1;
                    if (-1 >= var10) {
                      break L1;
                    } else {
                      L2: {
                        if (var4_int <= 0) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          break L2;
                        } else {
                          stackOut_12_0 = var4_int;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        }
                      }
                      L3: {
                        var10 = stackIn_14_0;
                        var11 = var4_int + var6;
                        if (var5 < var11) {
                          var11 = var5;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (var7 <= 0) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L4;
                        } else {
                          stackOut_18_0 = var7;
                          stackIn_20_0 = stackOut_18_0;
                          break L4;
                        }
                      }
                      L5: {
                        var12 = stackIn_20_0;
                        var13 = var7 + var9;
                        var11 = var11 - var10;
                        if (var13 > var8) {
                          var13 = var8;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var13 = var13 - var12;
                      if (param3 >= 32) {
                        var14 = var5 * var12 + var10;
                        var21 = param0.field_m;
                        var16 = var13;
                        var17 = var11;
                        if (0 != var21[var14]) {
                          L6: {
                            di.field_m = di.field_m + (var10 - (-var11 - -var17) << 1);
                            ce.field_k = ce.field_k + (-var16 + var12 + var13 << 1);
                            if (var21[var14] == -1) {
                              jo.field_b = true;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          stackOut_31_0 = 1;
                          stackIn_32_0 = stackOut_31_0;
                          break L0;
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0 != 0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var4;
            stackOut_33_1 = new StringBuilder().append("ee.N(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_32_0 != 0;
    }

    public final String c(int param0) {
        if (param0 == 26146) {
          if (!((ee) this).a((byte) -90)) {
            if (qj.b(-26572) < 350L + ((ee) this).field_e) {
              return null;
            } else {
              return ((ee) this).a(true);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void b(int param0) {
        if (param0 != -17444) {
            ee.b(false);
            ((ee) this).field_e = qj.b(-26572);
            return;
        }
        ((ee) this).field_e = qj.b(-26572);
    }

    final static void b(boolean param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Object var5 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                        wl.field_K = (int)(var3.longValue() / 1048576L) - -1;
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      if (param0) {
                        return;
                      } else {
                        var5 = null;
                        boolean discarded$2 = ee.a((ll) null, 125, 14, -99);
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            if (!param0) {
              var5 = null;
              boolean discarded$3 = ee.a((ll) null, 125, 14, -99);
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -29;
            int discarded$4 = 0;
            int discarded$5 = 59;
            stackOut_0_0 = hd.a(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ee.J(").append(127).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    abstract eh b(byte param0);

    final static void a(int param0, byte param1) {
        if (param1 != 30) {
            ee.a(-79, (byte) -26);
            qg.field_c = param0;
            return;
        }
        qg.field_c = param0;
    }

    public final eh a(int param0) {
        if (((ee) this).a((byte) -82)) {
            return cg.field_Wb;
        }
        if (param0 > -65) {
            ((ee) this).b(-88);
            if (!(((ee) this).field_e + 350L <= qj.b(-26572))) {
                return da.field_f;
            }
            return ((ee) this).b((byte) -66);
        }
        if (!(((ee) this).field_e + 350L <= qj.b(-26572))) {
            return da.field_f;
        }
        return ((ee) this).b((byte) -66);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Arcane Book";
        field_d = new int[4];
        field_a = "Unpacking explosives";
        field_f = "Reload game";
    }
}
