/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik {
    int field_a;
    int field_b;
    static int field_e;
    int field_c;
    static wj[] field_g;
    int field_d;
    static String field_f;

    final static String[] a(String param0, byte param1, char param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var11 = (CharSequence) ((Object) param0);
            var3_int = lp.a(var11, (byte) -40, param2);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3_int) {
                L2: {
                  if (param1 == -76) {
                    break L2;
                  } else {
                    var10 = (String) null;
                    ik.a((String) null, (byte) 127, 'ﾸ');
                    break L2;
                  }
                }
                var4[var3_int] = param0.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2 == param0.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param0.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ik.G(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (qh.field_i < this.field_a) {
                break L1;
              } else {
                if (qh.field_i >= this.field_a + this.field_b) {
                  break L1;
                } else {
                  if (bm.field_h < this.field_d) {
                    break L1;
                  } else {
                    if (bm.field_h >= this.field_c + this.field_d) {
                      break L1;
                    } else {
                      stackIn_8_0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = 0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    final boolean a(int param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 < -59) {
            break L0;
          } else {
            this.a(false, -29, -81);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_a > to.field_a) {
              break L2;
            } else {
              if (to.field_a >= this.field_b + this.field_a) {
                break L2;
              } else {
                if (dp.field_h < this.field_d) {
                  break L2;
                } else {
                  if (this.field_d + this.field_c <= dp.field_h) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    abstract void a(boolean param0, int param1, int param2);

    public static void a(byte param0) {
        if (param0 <= 99) {
            field_e = -126;
        }
        field_f = null;
        field_g = null;
    }

    static {
        field_f = "To server list";
    }
}
