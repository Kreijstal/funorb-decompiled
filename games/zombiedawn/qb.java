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
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
            L2: {
              var10 = new char[var2_int];
              var9 = var10;
              var8 = var9;
              var7 = var8;
              var3 = var7;
              if (param0 <= -106) {
                break L2;
              } else {
                field_f = null;
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackOut_23_0 = new String(var10);
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (65 > var5) {
                      break L5;
                    } else {
                      if (90 < var5) {
                        break L5;
                      } else {
                        var3[var4] = (char)(97 + (-65 + var5));
                        var4++;
                        break L4;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (97 > var5) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 > 57) {
                          break L8;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("qb.F(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return stackIn_24_0;
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
            if (!param0) {
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
                          var2 = (hn) (Object) sf.field_n.a(param0);
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2_ref, "qb.E(" + param0 + 44 + param1 + 41);
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != 91) {
          return 18;
        } else {
          return (1044493 & 15 * (param0 & 65280)) >> 4 | 16711935 & 15 * (param0 & 16711935) >> 4;
        }
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
