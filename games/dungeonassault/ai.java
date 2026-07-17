/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    int field_l;
    boolean field_m;
    int field_q;
    boolean field_i;
    int field_o;
    int field_j;
    wb[] field_f;
    wd field_c;
    static int field_n;
    int field_g;
    int field_r;
    static String field_b;
    ac field_h;
    static String field_e;
    static String field_k;
    static String field_d;
    int field_p;
    int field_s;
    int field_a;

    final static void a(int param0) {
        int var1 = 0;
        qi.field_b = ne.field_c.b(ll.field_m[13]);
        var1 = ne.field_c.b(ll.field_m[14]);
        if (param0 > -74) {
          return;
        } else {
          L0: {
            if (var1 <= qi.field_b) {
              break L0;
            } else {
              qi.field_b = var1;
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        field_k = null;
    }

    final static hb a(ec param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        hb var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        hb stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_12_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param2 == -12) {
              var4_int = param0.c(true);
              if (0 != var4_int) {
                L1: {
                  var5 = new hb(param1, var4_int);
                  var5.field_e = param0.c(true);
                  var5.field_g = param0.c(true);
                  var5.field_f = param0.c(true);
                  var5.field_k = param0.c(true);
                  if (11 <= param3) {
                    var5.field_p = param0.c(true);
                    break L1;
                  } else {
                    var5.field_p = 0;
                    break L1;
                  }
                }
                stackOut_12_0 = (hb) var5;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L2: {
                  int discarded$16 = param0.h(param2 + -94);
                  if (param3 >= 11) {
                    int discarded$17 = param0.c(true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (hb) (Object) stackIn_8_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ai.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_13_0;
    }

    final void a(int param0, boolean param1, ec param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              param2.a(param0 ^ -14, ((ai) this).field_a);
              param2.a(param0 + 18, ((ai) this).field_p);
              param2.a(6, ((ai) this).field_g);
              param2.a(6, ((ai) this).field_r);
              param2.a(6, ((ai) this).field_q);
              if (param0 == -12) {
                break L1;
              } else {
                field_n = -63;
                break L1;
              }
            }
            if (!param1) {
              param2.a(6, ((ai) this).field_j);
              param2.a(6, ((ai) this).field_l);
              param2.a(param0 + 18, ((ai) this).field_s);
              param2.a(6, ((ai) this).field_o);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ai.D(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          pd.field_E = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ai.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 14 + 41);
        }
    }

    final static void a(int param0, vh param1) {
        try {
            boolean discarded$0 = ek.field_b.field_A.a(false, ha.field_k, tl.field_k, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "ai.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ai(int param0) {
        ((ai) this).field_a = param0;
        ((ai) this).field_h = gh.field_i[((ai) this).field_a];
        if (null != ((ai) this).field_h) {
            ((ai) this).field_m = ((ai) this).field_h.field_C;
            ((ai) this).field_o = ((ai) this).field_h.field_r;
            ((ai) this).field_q = ((ai) this).field_h.field_r;
            ((ai) this).field_j = ((ai) this).field_h.field_A;
            ((ai) this).field_p = ((ai) this).field_h.field_A;
            ((ai) this).field_s = ((ai) this).field_h.field_y;
            ((ai) this).field_r = ((ai) this).field_h.field_y;
            ((ai) this).field_l = ((ai) this).field_h.field_k;
            ((ai) this).field_g = ((ai) this).field_h.field_k;
            ((ai) this).field_i = ((ai) this).field_h.field_b;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=FF0000>Lethal</col>. <%0> gains <%col_attack>+1 Attack</col>, <%col_defence>+1 Defence</col> if it wins in combat.";
        field_e = "Select a dragon from the table and click 'Raid' to start a raid.";
        field_k = "From simple pickpockets and highwaymen and up through a variety of brigands, the human cities of the west are full of thieves. This is one of the more competant examples - he is, after all, still alive.";
        field_d = "Order your raider to disarm the trap. <br><br>The trap may be disarmed, the raider may trigger the trap but avoid its effects, or the raider may become trapped.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
    }
}
