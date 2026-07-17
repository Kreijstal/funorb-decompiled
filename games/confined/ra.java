/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ra implements dm {
    private long field_a;
    static mn field_c;
    static mn field_d;
    static String field_b;

    public static void b(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final fi a(int param0) {
        if (!(!((ra) this).a(true))) {
            return gi.field_bb;
        }
        if (!(~(((ra) this).field_a + 350L) >= ~ri.a(-3))) {
            return ab.field_b;
        }
        if (param0 != -3621) {
            String discarded$0 = ((ra) this).b((byte) 22);
        }
        return ((ra) this).c(true);
    }

    public final String a(byte param0) {
        if (param0 < 65) {
            ((ra) this).field_a = -60L;
        }
        if (((ra) this).a(true)) {
            return null;
        }
        if (~ri.a(-3) > ~(350L + ((ra) this).field_a)) {
            return null;
        }
        return ((ra) this).b((byte) 126);
    }

    final static long a(CharSequence param0, int param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_21_0 = 0L;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param0.length();
              var5 = 0;
              if (param1 >= 115) {
                break L1;
              } else {
                var8 = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (65 > var6) {
                        break L5;
                      } else {
                        if (var6 > 90) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(var6 + -64);
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          var2_long = var2_long + (long)(-97 + var6 + 1);
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(-21 - -var6);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (0L != var2_long % 37L) {
                    break L8;
                  } else {
                    if (0L == var2_long) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_21_0 = var2_long;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("ra.K(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
        return stackIn_22_0;
    }

    public final void b(int param0) {
        if (param0 > -46) {
            ((ra) this).field_a = -58L;
        }
        ((ra) this).field_a = ri.a(-3);
    }

    abstract fi c(boolean param0);

    abstract String b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new mn();
        field_d = new mn();
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
