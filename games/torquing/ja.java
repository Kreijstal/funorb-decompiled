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
        if (!this.a((byte) 73)) {
            field_t.a((byte) 54, (q) (this));
        }
    }

    final static ja a(ec param0, int param1) {
        long var2;
        ja var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var10;
        ja var11;
        int[] var12;
        int[] var13;
        int stackIn_6_0 = 0;
        q stackIn_9_0 = null;
        var2 = (long)param1;
        var4 = (ja) ((Object) field_r.a(var2, 4604));
        if (var4 == null) {
          var13 = param0.a(param1, be.field_d);
          var12 = var13;
          var5 = var12;
          var6 = pj.a(param0.b(param1), 64);
          if (var5 == null) {
            return ja.a(new long[64], var6);
          } else {
            L0: {
              if (!param0.a(param1)) {
                stackIn_6_0 = 128;
                break L0;
              } else {
                stackIn_6_0 = 64;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_6_0;
              var8 = var7 * var7;
              if (var7 != 64) {
                stackIn_9_0 = field_u.a((byte) 122);
                break L1;
              } else {
                stackIn_9_0 = field_t.a((byte) -119);
                break L1;
              }
            }
            L2: {
              var11 = (ja) ((Object) stackIn_9_0);
              var4 = var11;
              if (var11 != null) {
                var11.field_q = var6;
                break L2;
              } else {
                var4 = new ja(var6, new int[var8]);
                break L2;
              }
            }
            var9 = var4.field_s;
            var10 = var8 - 1;
            L3: while (true) {
              if (var10 < 0) {
                field_r.a(var2, var4, 0);
                return var4;
              } else {
                var9[var10] = ja.i(var13[var10]);
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
        int var2 = be.field_a[param1];
        ja var3 = (ja) ((Object) field_t.a((byte) -114));
        if (var3 == null) {
            var3 = new ja(var2, new int[4096]);
        } else {
            var3.field_q = var2;
        }
        int var4 = be.field_a[pj.a(param1, 64)];
        int[] var5 = var3.field_s;
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
        return var3;
    }

    public final int c(int param0) {
        return 0;
    }

    public final boolean a(int param0) {
        return this.field_s.length == 4096;
    }

    public final int[] a(int param0, float param1) {
        return this.field_s;
    }

    final static ja a(long[] param0, ec param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int stackIn_5_0 = 0;
        q stackIn_8_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int[] var3;
        int var4;
        int var5;
        ja var6;
        int[] var7;
        int var8;
        int var9;
        long var10;
        int var12;
        int var13;
        int[] var14;
        int[] var15;
        var15 = param1.a(param2, be.field_d);
        var14 = var15;
        var3 = var14;
        if (var3 != null) {
          L0: {
            if (!param1.a(param2)) {
              stackIn_5_0 = 128;
              break L0;
            } else {
              stackIn_5_0 = 64;
              break L0;
            }
          }
          L1: {
            var4 = stackIn_5_0;
            var5 = var4 * var4;
            if (var4 != 64) {
              stackIn_8_0 = field_u.a((byte) -98);
              break L1;
            } else {
              stackIn_8_0 = field_t.a((byte) -123);
              break L1;
            }
          }
          L2: {
            var6 = (ja) ((Object) stackIn_8_0);
            if (var6 != null) {
              var6.field_q = param1.b(param2);
              break L2;
            } else {
              var6 = new ja(param1.b(param2), new int[var5]);
              break L2;
            }
          }
          var7 = var6.field_s;
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
                            incrementValue$0 = var9;
                            var9--;
                            var7[incrementValue$0] = var15[var9];
                            incrementValue$1 = var9;
                            var9--;
                            var7[incrementValue$1] = var15[var9];
                            break L6;
                          } else {
                            incrementValue$2 = var9;
                            var9--;
                            var7[incrementValue$2] = ja.i(var15[var9]);
                            incrementValue$3 = var9;
                            var9--;
                            var7[incrementValue$3] = ja.i(var15[var9]);
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
                        incrementValue$4 = var9;
                        var9--;
                        var7[incrementValue$4] = var15[var9];
                        incrementValue$5 = var9;
                        var9--;
                        var7[incrementValue$5] = var15[var9];
                        break L7;
                      } else {
                        incrementValue$6 = var9;
                        var9--;
                        var7[incrementValue$6] = ja.i(var15[var9]);
                        incrementValue$7 = var9;
                        var9--;
                        var7[incrementValue$7] = ja.i(var15[var9]);
                        break L7;
                      }
                    }
                    var10 = var10 >> 1;
                    var12--;
                    continue L4;
                  }
                }
              } else {
                return var6;
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
                      var13 = var15[var9];
                      incrementValue$8 = var9;
                      var9--;
                      stackIn_19_0 = (int[]) (var7);

                      stackIn_19_1 = incrementValue$8;

                      if (var10 % 2L == 0L) {
                        stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = var13;
                        break L10;
                      } else {
                        stackIn_20_0 = (int[]) ((Object) stackIn_19_0);
                        stackIn_20_1 = stackIn_19_1;
                        stackIn_20_2 = ja.i(var13);
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
                return var6;
              }
            }
          }
        } else {
          return ja.a(param0, param1.b(param2));
        }
    }

    private ja(int param0, int[] param1) {
        this.field_q = param0;
        this.field_s = param1;
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
        return this.field_q;
    }

    static {
        field_r = new cf(16);
        field_t = new ei();
        field_u = new ei();
    }
}
