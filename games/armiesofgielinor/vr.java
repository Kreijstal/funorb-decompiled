/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    static int[] field_a;

    final static void a(kl param0, int param1) {
        wk[][] array$0 = null;
        wk[] array$1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            gv.field_a = new wk[es.field_c.length][][];
            var9 = "basic";
            var2 = var9;
            var3 = 0;
            if (param1 == 18) {
              L1: while (true) {
                if (es.field_c.length <= var3) {
                  bj.field_p = new wk[4];
                  var10 = 0;
                  var3 = var10;
                  L2: while (true) {
                    if (bj.field_p.length <= var10) {
                      td.field_f.a(0, param1 + -18);
                      so.field_b.a(5605);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      bj.field_p[var10] = new wk(100, 110);
                      bj.field_p[var10].b();
                      qn.b();
                      td.field_f.a(var10, 0);
                      ds.a(10, 50, va.field_G[0], 27066, false, var10, true, va.field_G[3]);
                      ds.a(10, 50, va.field_G[0], 27066, false, var10, false, va.field_G[3]);
                      vu.a(true, false, 10, 50, var10, 1, 1);
                      vu.a(false, false, 10, 50, var10, 1, 1);
                      var10++;
                      continue L2;
                    }
                  }
                } else {
                  L3: {
                    if (es.field_c[var3] == null) {
                      break L3;
                    } else {
                      array$0 = new wk[es.field_c[var3].length][];
                      gv.field_a[var3] = array$0;
                      var4 = 0;
                      L4: while (true) {
                        if (es.field_c[var3].length <= var4) {
                          break L3;
                        } else {
                          L5: {
                            var5 = es.field_c[var3][var4];
                            if (var5 == null) {
                              break L5;
                            } else {
                              array$1 = new wk[var5.length];
                              gv.field_a[var3][var4] = array$1;
                              var6 = 0;
                              L6: while (true) {
                                if (var5.length <= var6) {
                                  if (-15 != (var3 ^ -1)) {
                                    break L5;
                                  } else {
                                    if (var4 == 0) {
                                      hw.a((byte) 29, var3, var4);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                } else {
                                  L7: {
                                    var7 = var5[var6];
                                    if (var7 == null) {
                                      break L7;
                                    } else {
                                      gv.field_a[var3][var4][var6] = ic.a(var7, (byte) 51, var9, param0);
                                      break L7;
                                    }
                                  }
                                  var6++;
                                  continue L6;
                                }
                              }
                            }
                          }
                          var4++;
                          continue L4;
                        }
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2_ref);

            stackIn_29_1 = new StringBuilder().append("vr.A(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -37) {
            field_a = (int[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 11987) {
                break L1;
              } else {
                field_a = (int[]) null;
                break L1;
              }
            }
            L2: {
              var5 = (CharSequence) ((Object) param1);
              var3 = k.a(var5, false);
              var6 = (CharSequence) ((Object) param2);
              var4 = k.a(var6, false);
              if (var3 != null) {
                break L2;
              } else {
                if (var4 != null) {
                  break L2;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (var3 == null) {
              stackIn_10_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (var4 != null) {
                stackIn_12_0 = var3.equals(var4);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("vr.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    static {
        field_a = new int[]{0, 4, 9, 13, 22, 18, 8, 17};
    }
}
