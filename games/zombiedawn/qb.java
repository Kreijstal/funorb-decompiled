/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qb {
    static int field_b;
    int field_d;
    int field_g;
    int field_a;
    static int field_i;
    int field_h;
    static String field_f;
    int field_j;
    static int[] field_c;
    int field_e;

    abstract void a(int param0, int param1, int param2);

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_21_0 = new String(var10);
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (65 > var5) {
                      break L4;
                    } else {
                      if (90 < var5) {
                        break L4;
                      } else {
                        var3[var4] = (char)(97 + (-65 + var5));
                        var4++;
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (97 > var5) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 > 57) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("qb.F(").append(-122).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_22_0;
    }

    abstract void a(int param0, int param1);

    final static void a(boolean param0, int param1) {
        hn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            ge.field_c = param1;
            var2 = (hn) (Object) fj.field_i.b((byte) 26);
            L1: while (true) {
              if (var2 == null) {
                L2: {
                  if (sf.field_n == null) {
                    break L2;
                  } else {
                    var2 = (hn) (Object) sf.field_n.b((byte) 26);
                    L3: while (true) {
                      if (var2 == null) {
                        break L2;
                      } else {
                        L4: {
                          if (!var2.field_k.a((byte) 73)) {
                            var2.b(-27598);
                            break L4;
                          } else {
                            var2.field_n.g(128 + ge.field_c * var2.field_i >> 8);
                            break L4;
                          }
                        }
                        var2 = (hn) (Object) sf.field_n.a(false);
                        continue L3;
                      }
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  if (var2.field_k.a((byte) 73)) {
                    var2.field_n.g(ge.field_c * var2.field_i + 128 >> 8);
                    break L5;
                  } else {
                    var2.b(-27598);
                    break L5;
                  }
                }
                var2 = (hn) (Object) fj.field_i.a(false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2_ref, "qb.E(" + false + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        return (1044493 & 15 * (param0 & 65280)) >> 4 | 16711935 & 15 * (param0 & 16711935) >> 4;
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_c = new int[8192];
    }
}
