/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends td {
    static String field_t;
    static String field_p;
    static String field_r;
    static int[] field_q;
    static kv field_s;

    mp(int param0, aga param1) {
        super(param0, param1);
    }

    final static boolean a(boolean param0, char param1) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            mp.b(-30);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 160) {
              break L2;
            } else {
              if (param1 == 32) {
                break L2;
              } else {
                if (param1 == 95) {
                  break L2;
                } else {
                  if (45 != param1) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final ii a(op param0, int param1) {
        kh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        aga var9 = null;
        ii stackIn_3_0 = null;
        kh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        aga var7 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var9 = this.field_h.a(39, param0);
            var4 = new kh(this.field_g, new nq(var9));
            if (param1 == 3) {
              var5 = 0;
              L1: while (true) {
                if (param0.field_z <= var5) {
                  stackIn_13_0 = (kh) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0.field_B) {
                      var5++;
                      continue L1;
                    } else {
                      if (null != param0.field_a[var5][var6].field_l) {
                        var7 = param0.field_a[var5][var6].field_l;
                        var4.field_o.a(new iv(new nq(var7), false, 1, 0, 1), true);
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("mp.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_13_0);
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static long a(CharSequence param0, boolean param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        long stackIn_25_0 = 0L;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var4 <= var5) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if ((var6 ^ -1) > -66) {
                        break L4;
                      } else {
                        if (90 < var6) {
                          break L4;
                        } else {
                          var2_long = var2_long + (long)(var6 + -64);
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (var6 > 122) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + var6 - 97);
                          break L3;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (57 >= var6) {
                        var2_long = var2_long + (long)(-21 + var6);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (177917621779460413L > var2_long) {
                    var5++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (0L != var2_long % 37L) {
                    break L7;
                  } else {
                    if (0L == var2_long) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                if (param1) {
                  stackIn_25_0 = var2_long;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_23_0 = 97L;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("mp.B(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          return stackIn_25_0;
        }
    }

    public static void b(int param0) {
        if (param0 != 95) {
            field_q = (int[]) null;
        }
        field_p = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_t = null;
    }

    static {
        field_r = "Password: ";
        field_t = "Options Menu";
        field_q = new int[]{100, 40, 20};
    }
}
