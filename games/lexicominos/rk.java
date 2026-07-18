/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends tb {
    static ee field_c;
    private int field_e;
    static volatile boolean field_m;
    static int field_g;
    private long field_j;
    private int field_l;
    private long field_h;
    private long[] field_f;
    static aj field_n;
    private long field_i;
    static aj field_d;
    static String field_k;

    final void a(byte param0) {
        ((rk) this).field_i = 0L;
        if (param0 != 50) {
            field_c = null;
        }
        if (((rk) this).field_h >= ((rk) this).field_j) {
            return;
        }
        ((rk) this).field_h = ((rk) this).field_h + (((rk) this).field_j - ((rk) this).field_h);
    }

    public static void a() {
        field_d = null;
        field_k = null;
        field_n = null;
        field_c = null;
    }

    final long b(int param0) {
        L0: {
          if (param0 == 255) {
            break L0;
          } else {
            field_m = true;
            break L0;
          }
        }
        int discarded$2 = 10;
        ((rk) this).field_h = ((rk) this).field_h + this.c();
        if (((rk) this).field_j > ((rk) this).field_h) {
          return (((rk) this).field_j - ((rk) this).field_h) / 1000000L;
        } else {
          return 0L;
        }
    }

    private final long c() {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Lexicominos.field_L ? 1 : 0;
          var2 = System.nanoTime();
          var4 = var2 - ((rk) this).field_i;
          ((rk) this).field_i = var2;
          if (var4 <= -5000000000L) {
            break L0;
          } else {
            if (5000000000L <= var4) {
              break L0;
            } else {
              ((rk) this).field_f[((rk) this).field_e] = var4;
              ((rk) this).field_e = (((rk) this).field_e + 1) % 10;
              if (((rk) this).field_l >= 1) {
                break L0;
              } else {
                ((rk) this).field_l = ((rk) this).field_l + 1;
                break L0;
              }
            }
          }
        }
        var6 = 0L;
        var8 = 1;
        L1: while (true) {
          if (((rk) this).field_l < var8) {
            return var6 / (long)((rk) this).field_l;
          } else {
            var6 = var6 + ((rk) this).field_f[(((rk) this).field_e - (var8 + -10)) % 10];
            var8++;
            continue L1;
          }
        }
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (param1 > 113) {
            break L0;
          } else {
            field_g = -117;
            break L0;
          }
        }
        if (((rk) this).field_h >= ((rk) this).field_j) {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((rk) this).field_j = ((rk) this).field_j + param0;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if (~((rk) this).field_j > ~((rk) this).field_h) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (~((rk) this).field_j > ~((rk) this).field_h) {
                ((rk) this).field_j = ((rk) this).field_h;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        } else {
          ((rk) this).field_i = ((rk) this).field_i + (-((rk) this).field_h + ((rk) this).field_j);
          ((rk) this).field_h = ((rk) this).field_h + (-((rk) this).field_h + ((rk) this).field_j);
          ((rk) this).field_j = ((rk) this).field_j + param0;
          return 1;
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_30_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                stackOut_41_0 = var5;
                stackIn_42_0 = stackOut_41_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (var8 != 0) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4_int = 1;
                        break L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    if (var9 < 97) {
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      return stackIn_26_0 != 0;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (var9 < 10) {
                    L7: {
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10 = var9 + 10 * var6;
                    if (var6 == var10 / 10) {
                      var5 = 1;
                      var6 = var10;
                      break L2;
                    } else {
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      return stackIn_38_0 != 0;
                    }
                  } else {
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0 != 0;
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("rk.A(").append(10).append(',').append(true).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L8;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + true + ')');
        }
        return stackIn_42_0 != 0;
    }

    rk() {
        ((rk) this).field_j = 0L;
        ((rk) this).field_h = 0L;
        ((rk) this).field_f = new long[10];
        ((rk) this).field_e = 0;
        ((rk) this).field_i = 0L;
        ((rk) this).field_l = 1;
        ((rk) this).field_h = System.nanoTime();
        ((rk) this).field_j = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = true;
        field_n = new aj(2, 4, 4, 0);
        field_d = new aj(6, 0, 4, 2);
        field_k = "2 of 4";
    }
}
