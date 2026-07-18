/*
 * Decompiled by CFR-JS 0.4.0.
 */
class df extends oh {
    static int[] field_k;
    long field_l;
    df field_j;
    static bc field_n;
    static String field_m;
    df field_h;
    static String field_i;

    final static void c(boolean param0) {
        int var1 = 0;
        if (tf.field_p > 32) {
            var1 = tf.field_p % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            js.a(tf.field_p - var1, 197126152);
        } else {
            js.a(0, 197126152);
        }
    }

    final static byte[] a(int param0, boolean param1, sl param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param2.b((byte) 105, 16);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.b((byte) 103, 3);
                var6 = (byte)param2.b((byte) 115, 8);
                if (0 < var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param3[var7] = (byte)(var6 + param2.b((byte) 112, var5));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_16_0 = (byte[]) param3;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("df.KA(").append(16).append(',').append(false).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    final boolean a(byte param0) {
        if (param0 < 94) {
            field_n = null;
        }
        if (null == ((df) this).field_j) {
            return false;
        }
        return true;
    }

    final long d(byte param0) {
        int var2 = -87 % ((54 - param0) / 41);
        return ((df) this).field_l;
    }

    final void a(int param0) {
        if (null == ((df) this).field_j) {
            return;
        }
        ((df) this).field_j.field_h = ((df) this).field_h;
        ((df) this).field_h.field_j = ((df) this).field_j;
        if (param0 != 16) {
            ((df) this).field_j = null;
        }
        ((df) this).field_j = null;
        ((df) this).field_h = null;
    }

    final static bi a(int param0, int param1) {
        bi var2 = vh.field_a[param0];
        if (var2 == null) {
            bi dupTemp$0 = new bi(64, 64);
            var2 = dupTemp$0;
            vh.field_a[param0] = dupTemp$0;
            bs.a(var2, 125);
            oi.a(param0, (byte) 66).f(16, 16);
            gf.b(3, 3, 0, 0, 64, 64);
            cg.i(0);
        }
        return var2;
    }

    final void a(int param0, long param1) {
        if (null != ((df) this).field_j) {
            throw new RuntimeException();
        }
        ((df) this).field_l = param1;
        if (param0 != 16) {
            field_i = null;
        }
    }

    public static void d(int param0) {
        field_n = null;
        field_k = null;
        field_i = null;
        field_m = null;
    }

    protected df() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[]{9768448, 38221, 10901, 8519829, 11114240, 31637, 8339263, 4161343, 4145023};
        field_i = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_m = "The <%highlight>Classic Ruleset</col> adds some additional complexity to the game, and is only recommended for experienced players.<br><br><%glossary>GARRISON</col> - For each <%glossary>system</col>, at least one fleet per <%glossary>wormhole</col> link to a hostile or neutral territory needs to be garrisoned there, to maintain order. If the <%glossary>garrison</col> level falls below this, you may lose control of the system. Systems at risk of collapse are overlaid with <%highlight>yellow or red crosshatching</col>.<br><br><%glossary>PRODUCTION</col> - As with the normal rules, construction of one fleet requires one unit of each resource. If two regions that you control become disconnected, however, they are separated into distinct <%glossary>territories</col>, and they produce fleets independently using the resources they contain. Fleets produced by a territory can only be placed within that territory.";
    }
}
