/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends rn implements el {
    static int field_I;
    private int field_V;
    private pd field_T;
    static kc field_U;
    static String field_W;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            nb.a(true, ao.field_g, -24595, 0, je.field_b, param1, tm.field_g);
            var2_int = 0;
            L1: while (true) {
              if (je.field_b <= var2_int) {
                nb.a(false, ld.field_m, -24595, param1, param1 + je.field_b, param1 + param1, qa.field_m);
                if (param1 >= je.field_b) {
                  break L0;
                } else {
                  je.field_b = param1;
                  return;
                }
              } else {
                ki.field_r[var2_int - -param1] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "bi.H(" + -113 + ',' + param1 + ')');
        }
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        wi var3 = null;
        RuntimeException var3_ref = null;
        wi stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_5_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (136 < param2.length) {
                var3 = new wi();
                ((bg) (Object) var3).a(110, param2);
                stackOut_5_0 = (wi) var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) dd.a(param2, 0);
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("bi.I(").append(false).append(',').append(0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return (Object) (Object) stackIn_6_0;
    }

    final String b(boolean param0) {
        if (!param0) {
          if (((bi) this).field_w) {
            if (((bi) this).field_q == null) {
              return null;
            } else {
              ih.a(((bi) this).field_v - (((bi) this).field_V - an.field_g), me.field_I, (byte) 69);
              return ((bi) this).field_q;
            }
          } else {
            return null;
          }
        } else {
          field_U = null;
          if (((bi) this).field_w) {
            if (((bi) this).field_q == null) {
              return null;
            } else {
              ih.a(((bi) this).field_v - (((bi) this).field_V - an.field_g), me.field_I, (byte) 69);
              return ((bi) this).field_q;
            }
          } else {
            return null;
          }
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((bi) this).field_V = an.field_g - (((bi) this).field_n + param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final pd a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((bi) this).field_T;
    }

    final void l(int param0) {
        super.l(param0);
        if (!(null == ((bi) this).field_T)) {
            ((bi) this).field_T.b(-17444);
        }
    }

    final void a(pd param0, byte param1) {
        try {
            ((bi) this).field_T = param0;
            int var3_int = -16 / ((-87 - param1) / 37);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "bi.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bi(String param0, wc param1, int param2) {
        super(param0, param1, param2);
    }

    public static void o(int param0) {
        field_W = null;
        field_U = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
