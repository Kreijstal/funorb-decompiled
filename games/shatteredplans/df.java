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
        if (-33 > (tf.field_p ^ -1)) {
            var1 = tf.field_p % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            js.a(tf.field_p - var1, 197126152);
        } else {
            js.a(0, 197126152);
        }
        if (!param0) {
            df.d(101);
        }
    }

    final static byte[] a(int param0, boolean param1, sl param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param2.b((byte) 105, param0);
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
              if (!param1) {
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
                stackIn_19_0 = (byte[]) (param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_10_0 = (byte[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("df.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_19_0;
        }
    }

    final boolean a(byte param0) {
        if (param0 < 94) {
            field_n = (bc) null;
        }
        if (null == this.field_j) {
            return false;
        }
        return true;
    }

    final long d(byte param0) {
        int var2 = -87 % ((54 - param0) / 41);
        return this.field_l;
    }

    final void a(int param0) {
        if (null == this.field_j) {
            return;
        }
        this.field_j.field_h = this.field_h;
        this.field_h.field_j = this.field_j;
        if (param0 != 16) {
            this.field_j = (df) null;
        }
        this.field_j = null;
        this.field_h = null;
    }

    final static bi a(int param0, int param1) {
        bi dupTemp$0 = null;
        if (param1 != 32) {
            field_k = (int[]) null;
        }
        bi var2 = vh.field_a[param0];
        if (var2 == null) {
            dupTemp$0 = new bi(64, 64);
            var2 = dupTemp$0;
            vh.field_a[param0] = dupTemp$0;
            bs.a(var2, param1 ^ 93);
            oi.a(param0, (byte) 66).f(16, 16);
            gf.b(3, 3, 0, 0, 64, 64);
            cg.i(0);
        }
        return var2;
    }

    final void a(int param0, long param1) {
        if (null != this.field_j) {
            throw new RuntimeException();
        }
        this.field_l = param1;
        if (param0 != 16) {
            field_i = (String) null;
        }
    }

    public static void d(int param0) {
        field_n = null;
        if (param0 != 9768448) {
            field_i = (String) null;
        }
        field_k = null;
        field_i = null;
        field_m = null;
    }

    protected df() {
    }

    static {
        field_k = new int[]{9768448, 38221, 10901, 8519829, 11114240, 31637, 8339263, 4161343, 4145023};
        field_i = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_m = "The <%highlight>Classic Ruleset</col> adds some additional complexity to the game, and is only recommended for experienced players.<br><br><%glossary>GARRISON</col> - For each <%glossary>system</col>, at least one fleet per <%glossary>wormhole</col> link to a hostile or neutral territory needs to be garrisoned there, to maintain order. If the <%glossary>garrison</col> level falls below this, you may lose control of the system. Systems at risk of collapse are overlaid with <%highlight>yellow or red crosshatching</col>.<br><br><%glossary>PRODUCTION</col> - As with the normal rules, construction of one fleet requires one unit of each resource. If two regions that you control become disconnected, however, they are separated into distinct <%glossary>territories</col>, and they produce fleets independently using the resources they contain. Fleets produced by a territory can only be placed within that territory.";
    }
}
