/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rl extends ee implements bn {
    static int field_o;
    static int[] field_h;
    static boolean[][] field_p;
    private rn field_k;
    static int field_m;
    static String field_i;
    static String field_n;
    static String field_j;
    static long[] field_l;

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 < -72) {
          if (((rl) this).field_k.field_g != null) {
            if (((rl) this).field_k.field_g.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    public final void b(rn param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 73) {
                break L1;
              } else {
                field_o = 48;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rl.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((rl) this).a(((rl) this).field_k.field_g, (byte) -120);
    }

    final static boolean d(boolean param0) {
        return 250 < gi.field_a;
    }

    public static void c() {
        field_h = null;
        field_j = null;
        field_n = null;
        field_p = null;
        field_i = null;
        field_l = null;
    }

    public final void a(rn param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((rl) this).b(-17444);
              if (param1 == -20626) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rl.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    abstract String a(String param0, byte param1);

    final static int a(int param0, int param1, int param2) {
        if (param2 > -70) {
            field_l = null;
            return -1;
        }
        return -1;
    }

    rl(rn param0) {
        try {
            ((rl) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "rl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(long param0) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > 0L) {
          if (param0 < 6582952005840035281L) {
            if (param0 % 37L != 0L) {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (0L == param0) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = qa.field_h[(int)(var7 + -(param0 * 37L))];
                        if (var9 == 95) {
                          var10 = var6.length() + -1;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          var9 = 160;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract eh a(String param0, int param1);

    final eh b(byte param0) {
        if (param0 != -66) {
            return null;
        }
        return ((rl) this).a(((rl) this).field_k.field_g, -108);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_h = new int[]{17, 18, 8};
        field_i = "Play Rated games to win wands.<br>Wands can be used to buy more spells.";
        field_o = -1;
        field_m = -1;
        field_n = "<%0> wants to join";
        field_l = new long[32];
    }
}
