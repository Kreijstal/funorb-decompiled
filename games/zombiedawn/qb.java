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
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (-21 <= (var2_int ^ -1)) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            L2: {
              var8 = new char[var2_int];
              var7 = var8;
              var3 = var7;
              if (param0 <= -106) {
                break L2;
              } else {
                field_f = (String) null;
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var2_int <= var4) {
                stackOut_20_0 = new String(var8);
                stackIn_21_0 = stackOut_20_0;
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
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
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
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("qb.F(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    abstract void a(int param0, int param1);

    final static void a(boolean param0, int param1) {
        hn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            ge.field_c = param1;
            if (!param0) {
              var2 = (hn) ((Object) fj.field_i.b((byte) 26));
              L1: while (true) {
                if (var2 == null) {
                  L2: {
                    if (sf.field_n == null) {
                      break L2;
                    } else {
                      var2 = (hn) ((Object) sf.field_n.b((byte) 26));
                      L3: while (true) {
                        if (var2 == null) {
                          break L2;
                        } else {
                          L4: {
                            if (!var2.field_k.a((byte) 73)) {
                              var2.b(-27598);
                              break L4;
                            } else {
                              var2.field_n.g(128 + ge.field_c * var2.field_i >> -756288440);
                              break L4;
                            }
                          }
                          var2 = (hn) ((Object) sf.field_n.a(param0));
                          continue L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L5: {
                    if (var2.field_k.a((byte) 73)) {
                      var2.field_n.g(ge.field_c * var2.field_i + 128 >> 44158888);
                      break L5;
                    } else {
                      var2.b(-27598);
                      break L5;
                    }
                  }
                  var2 = (hn) ((Object) fj.field_i.a(false));
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
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "qb.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != 91) {
          return 18;
        } else {
          return (1044493 & 15 * (param0 & 65280)) >> -559000476 | 16711935 & 15 * (param0 & 16711935) >> -601205116;
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_c = null;
        if (param0 != -6633) {
            discarded$0 = qb.a(62, (byte) -7);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        field_f = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_c = new int[8192];
    }
}
