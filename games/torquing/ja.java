/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ta implements ec {
    private int[] field_s;
    private int field_q;
    private static cf field_r;
    private static ei field_t;
    private static ei field_u;

    final void b() {
        if (!((ja) this).a((byte) 73)) {
            field_t.a((byte) 54, (q) this);
        }
    }

    final static ja a(ec param0, int param1) {
        long var2 = 0L;
        ja var4 = null;
        ja var4_ref = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        ja var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int stackIn_6_0 = 0;
        q stackIn_9_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        q stackOut_8_0 = null;
        q stackOut_7_0 = null;
        var2 = (long)param1;
        var4 = (ja) (Object) field_r.a(var2, 4604);
        if (var4 == null) {
          var15 = param0.a(param1, be.field_d);
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var5 = var12;
          var6 = pj.a(param0.b(param1), 64);
          if (var5 == null) {
            return ja.a(new long[64], var6);
          } else {
            L0: {
              if (!param0.a(param1)) {
                stackOut_5_0 = 128;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 64;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_6_0;
              var8 = var7 * var7;
              if (var7 != 64) {
                stackOut_8_0 = field_u.a((byte) 122);
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = field_t.a((byte) -119);
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            L2: {
              var11 = (ja) (Object) stackIn_9_0;
              if (var11 != null) {
                var11.field_q = var6;
                break L2;
              } else {
                var4_ref = new ja(var6, new int[var8]);
                break L2;
              }
            }
            var9 = var4_ref.field_s;
            var10 = var8 - 1;
            L3: while (true) {
              if (var10 < 0) {
                field_r.a(var2, (ta) (Object) var4_ref, 0);
                return var4_ref;
              } else {
                var9[var10] = ja.i(var15[var10]);
                var10--;
                continue L3;
              }
            }
          }
        } else {
          return var4;
        }
    }

    final static ja a(long[] param0, int param1) {
        long var8 = 0L;
        int var10 = 0;
        ja var3_ref = null;
        int var2 = be.field_a[param1];
        ja var3 = (ja) (Object) field_t.a((byte) -114);
        if (var3 == null) {
            var3_ref = new ja(var2, new int[4096]);
        } else {
            var3_ref.field_q = var2;
        }
        int var4 = be.field_a[pj.a(param1, 64)];
        int[] var5 = var3_ref.field_s;
        int var6 = 63;
        int var7 = 4096;
        while (var6 >= 0) {
            var8 = param0[var6];
            for (var10 = 63; var10 >= 0; var10--) {
                var7--;
                var5[var7] = var8 % 2L == 0L ? var2 : var4;
                var8 = var8 >> 1;
            }
            var6--;
        }
        return var3_ref;
    }

    public final int c(int param0) {
        return 0;
    }

    public final boolean a(int param0) {
        return ((ja) this).field_s.length == 4096;
    }

    public final int[] a(int param0, float param1) {
        return ((ja) this).field_s;
    }

    final static ja a(long[] param0, ec param1, int param2) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ja var6 = null;
        ja var6_ref = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int stackIn_5_0 = 0;
        q stackIn_8_0 = null;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        q stackOut_7_0 = null;
        q stackOut_6_0 = null;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        var17 = param1.a(param2, be.field_d);
        var16 = var17;
        var15 = var16;
        var14 = var15;
        var3 = var14;
        if (var3 != null) {
          L0: {
            if (!param1.a(param2)) {
              stackOut_4_0 = 128;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 64;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var4 = stackIn_5_0;
            var5 = var4 * var4;
            if (var4 != 64) {
              stackOut_7_0 = field_u.a((byte) -98);
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = field_t.a((byte) -123);
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = (ja) (Object) stackIn_8_0;
            if (var6 != null) {
              var6_ref.field_q = param1.b(param2);
              break L2;
            } else {
              var6_ref = new ja(param1.b(param2), new int[var5]);
              break L2;
            }
          }
          var7 = var6_ref.field_s;
          if (var4 != 64) {
            var8 = 63;
            var9 = var5 - 1;
            L3: while (true) {
              if (var8 >= 0) {
                var10 = param0[var8];
                var12 = 63;
                L4: while (true) {
                  if (var12 < 0) {
                    var10 = param0[var8];
                    var12 = 63;
                    L5: while (true) {
                      if (var12 < 0) {
                        var8--;
                        continue L3;
                      } else {
                        L6: {
                          if (var10 % 2L == 0L) {
                            var9--;
                            var7[var9] = var17[var9];
                            var9--;
                            var7[var9] = var17[var9];
                            break L6;
                          } else {
                            var9--;
                            var7[var9] = ja.i(var17[var9]);
                            var9--;
                            var7[var9] = ja.i(var17[var9]);
                            break L6;
                          }
                        }
                        var10 = var10 >> 1;
                        var12--;
                        continue L5;
                      }
                    }
                  } else {
                    L7: {
                      if (var10 % 2L == 0L) {
                        var9--;
                        var7[var9] = var17[var9];
                        var9--;
                        var7[var9] = var17[var9];
                        break L7;
                      } else {
                        var9--;
                        var7[var9] = ja.i(var17[var9]);
                        var9--;
                        var7[var9] = ja.i(var17[var9]);
                        break L7;
                      }
                    }
                    var10 = var10 >> 1;
                    var12--;
                    continue L4;
                  }
                }
              } else {
                return var6_ref;
              }
            }
          } else {
            var8 = 63;
            var9 = var5 - 1;
            L8: while (true) {
              if (var8 >= 0) {
                var10 = param0[var8];
                var12 = 63;
                L9: while (true) {
                  if (var12 < 0) {
                    var8--;
                    continue L8;
                  } else {
                    L10: {
                      var13 = var17[var9];
                      var9--;
                      stackOut_17_0 = (int[]) var7;
                      stackOut_17_1 = var9;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (var10 % 2L == 0L) {
                        stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = var13;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        break L10;
                      } else {
                        stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = ja.i(var13);
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L10;
                      }
                    }
                    stackIn_20_0[stackIn_20_1] = stackIn_20_2;
                    var10 = var10 >> 1;
                    var12--;
                    continue L9;
                  }
                }
              } else {
                return var6_ref;
              }
            }
          }
        } else {
          return ja.a(param0, param1.b(param2));
        }
    }

    private ja(int param0, int[] param1) {
        ((ja) this).field_q = param0;
        ((ja) this).field_s = param1;
    }

    private final static int i(int param0) {
        return param0 - (8355711 & param0 >> 1);
    }

    public static void a() {
        field_r = null;
        field_t = null;
        field_u = null;
    }

    public final boolean d(int param0) {
        return true;
    }

    public final int b(int param0) {
        return ((ja) this).field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new cf(16);
        field_t = new ei();
        field_u = new ei();
    }
}
