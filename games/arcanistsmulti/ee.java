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
        ll var2;
        field_c = null;
        field_a = null;
        field_g = null;
        if (!param0) {
          var2 = (ll) null;
          ee.a((ll) null, -106, -125, 14);
          field_d = null;
          field_b = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_f = null;
          return;
        }
    }

    final static boolean a(ll param0, int param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              if ((var7 ^ -1) < 0) {
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
                          stackIn_14_0 = 0;
                          break L2;
                        } else {
                          stackIn_14_0 = var4_int;
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
                          stackIn_20_0 = 0;
                          break L4;
                        } else {
                          stackIn_20_0 = var7;
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
                            di.field_m = di.field_m + (var10 - (-var11 - -var17) << 497052513);
                            ce.field_k = ce.field_k + (-var16 + var12 + var13 << 1048514305);
                            if (0 == (var21[var14] ^ -1)) {
                              jo.field_b = true;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          stackIn_32_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          return false;
                        }
                      } else {
                        stackIn_25_0 = 1;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_4_0 = 0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var4);

            stackIn_35_1 = new StringBuilder().append("ee.N(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              return stackIn_32_0 != 0;
            }
          }
        }
    }

    public final String c(int param0) {
        if (param0 == 26146) {
          if (!this.a((byte) -90)) {
            if (qj.b(-26572) < 350L + this.field_e) {
              return null;
            } else {
              return this.a(true);
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    public final void b(int param0) {
        if (param0 != -17444) {
            ee.b(false);
            this.field_e = qj.b(-26572);
            return;
        }
        this.field_e = qj.b(-26572);
    }

    final static void b(boolean param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            ll var5 = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        wl.field_K = (int)(var3.longValue() / 1048576L) - -1;
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2_ref = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      if (param0) {
                        return;
                      } else {
                        var5 = (ll) null;
                        ee.a((ll) null, 125, 14, -99);
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
              var5 = (ll) null;
              ee.a((ll) null, 125, 14, -99);
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 88 / ((-13 - param0) / 38);
            stackIn_1_0 = hd.a(param1, (byte) 59, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("ee.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
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
        if (this.a((byte) -82)) {
            return cg.field_Wb;
        }
        if (param0 > -65) {
            this.b(-88);
            if (!(this.field_e + 350L <= qj.b(-26572))) {
                return da.field_f;
            }
            return this.b((byte) -66);
        }
        if (!(this.field_e + 350L <= qj.b(-26572))) {
            return da.field_f;
        }
        return this.b((byte) -66);
    }

    static {
        field_c = "Arcane Book";
        field_d = new int[4];
        field_a = "Unpacking explosives";
        field_f = "Reload game";
    }
}
