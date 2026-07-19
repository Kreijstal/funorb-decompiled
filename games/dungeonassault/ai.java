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
        if (param0 != 106) {
          field_d = (String) null;
          field_b = null;
          field_k = null;
          return;
        } else {
          field_b = null;
          field_k = null;
          return;
        }
    }

    final static hb a(ec param0, int param1, int param2, int param3) {
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        hb var5 = null;
        hb stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        hb stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hb stackOut_12_0 = null;
        Object stackOut_7_0 = null;
        hb stackOut_1_0 = null;
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
                stackOut_12_0 = (hb) (var5);
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L2: {
                  discarded$16 = param0.h(param2 + -94);
                  if (-12 >= (param3 ^ -1)) {
                    discarded$17 = param0.c(true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (hb) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ai.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (hb) ((Object) stackIn_8_0);
          } else {
            return stackIn_13_0;
          }
        }
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
              param2.a(param0 ^ -14, this.field_a);
              param2.a(param0 + 18, this.field_p);
              param2.a(6, this.field_g);
              param2.a(6, this.field_r);
              param2.a(6, this.field_q);
              if (param0 == -12) {
                break L1;
              } else {
                field_n = -63;
                break L1;
              }
            }
            if (!param1) {
              param2.a(6, this.field_j);
              param2.a(6, this.field_l);
              param2.a(param0 + 18, this.field_s);
              param2.a(6, this.field_o);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("ai.D(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        vh var3 = null;
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
              pd.field_E = param0;
              if (param1 == 14) {
                break L1;
              } else {
                var3 = (vh) null;
                ai.a(38, (vh) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ai.B(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, vh param1) {
        boolean discarded$0 = false;
        try {
            discarded$0 = ek.field_b.field_A.a(false, ha.field_k, tl.field_k, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ai.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ai(int param0) {
        this.field_a = param0;
        this.field_h = gh.field_i[this.field_a];
        if (null != this.field_h) {
            this.field_m = this.field_h.field_C;
            this.field_o = this.field_h.field_r;
            this.field_q = this.field_h.field_r;
            this.field_j = this.field_h.field_A;
            this.field_p = this.field_h.field_A;
            this.field_s = this.field_h.field_y;
            this.field_r = this.field_h.field_y;
            this.field_l = this.field_h.field_k;
            this.field_g = this.field_h.field_k;
            this.field_i = this.field_h.field_b;
        }
    }

    static {
        field_b = "<col=FF0000>Lethal</col>. <%0> gains <%col_attack>+1 Attack</col>, <%col_defence>+1 Defence</col> if it wins in combat.";
        field_e = "Select a dragon from the table and click 'Raid' to start a raid.";
        field_k = "From simple pickpockets and highwaymen and up through a variety of brigands, the human cities of the west are full of thieves. This is one of the more competant examples - he is, after all, still alive.";
        field_d = "Order your raider to disarm the trap. <br><br>The trap may be disarmed, the raider may trigger the trap but avoid its effects, or the raider may become trapped.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
    }
}
