/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static int field_e;
    static boolean[] field_f;
    int field_a;
    int[] field_b;
    int field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 != -19467) {
            vl.a(42);
        }
    }

    final int b(int param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -117 % ((param0 - 60) / 52);
            if (((vl) this).field_b == null) {
              break L1;
            } else {
              if (((vl) this).field_b.length != 0) {
                stackOut_4_0 = ((vl) this).field_b[-1 + ((vl) this).field_b.length];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0;
    }

    final static int a(int param0, int param1) {
        return bi.field_d[param0 & 2047];
    }

    final static void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        ed[] var3 = null;
        ed[] var4 = null;
        int var5 = 0;
        ed var6 = null;
        int var7 = 0;
        ed[] var8 = null;
        ed var9 = null;
        int var10 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 != 4) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_int = stackIn_4_0;
            if (hb.field_b == null) {
              return;
            } else {
              if (null == qi.field_M) {
                return;
              } else {
                L2: {
                  L3: {
                    if (param1 < 0) {
                      break L3;
                    } else {
                      if (param1 >= 7) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param1 = 0;
                  break L2;
                }
                L4: {
                  L5: {
                    if (param1 == 5) {
                      break L5;
                    } else {
                      if (param1 != 6) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param1 = 0;
                  break L4;
                }
                L6: {
                  var3 = hb.field_b[param1];
                  if (var2_int != 0) {
                    var3 = v.field_a;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var4 = qi.field_M[param1];
                var5 = 0;
                L7: while (true) {
                  if (3 <= var5) {
                    fl.a(-1, param1);
                    break L0;
                  } else {
                    L8: {
                      if (var3 == null) {
                        param1 = 0;
                        var3 = hb.field_b[param1];
                        var4 = qi.field_M[param1];
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      var6 = var3[var5];
                      var7 = var5 + 14;
                      var8 = mb.field_f;
                      if (var2_int == 0) {
                        break L9;
                      } else {
                        var8 = ob.field_b;
                        break L9;
                      }
                    }
                    var8[var7] = var6;
                    var9 = var4[var5];
                    jm.field_K[var7] = var9;
                    var5++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "vl.B(" + 1 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        if (((vl) this).field_b == null) {
          return 0;
        } else {
          if (0 != ((vl) this).field_b.length) {
            L0: {
              var3 = 1;
              if (param0 == 52) {
                break L0;
              } else {
                int discarded$2 = ((vl) this).a((byte) -102, -12);
                break L0;
              }
            }
            L1: while (true) {
              if (((vl) this).field_b.length <= var3) {
                return ((vl) this).field_b.length - 1;
              } else {
                if (((vl) this).field_b[var3] + ((vl) this).field_b[-1 + var3] >> 1 <= param1) {
                  var3++;
                  continue L1;
                } else {
                  return -1 + var3;
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    vl(int param0, int param1, int param2) {
        ((vl) this).field_a = param1;
        ((vl) this).field_d = param0;
        ((vl) this).field_b = new int[1 + param2];
    }

    final static int[] a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param2];
        int[] var4 = var7;
        for (var5 = 0; var5 < param2; var5++) {
            var7[var5] = (var5 + (param1 - -1)) * 10;
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[]{false, false, false, false};
        field_c = new int[]{19, 20};
    }
}
