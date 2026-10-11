/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ak field_f;
    static boolean field_b;
    static boolean[] field_g;
    static gh field_d;
    static String[] field_e;
    static kg field_a;
    static int field_h;
    static java.awt.Frame field_c;

    final static fh a(cm param0, String param1, cm param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        fh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.a(param1, 45);
          if (param3 != -1) {
            vd.a((byte) 19);
          }
          var6 = param2.a(var5_int, -32759, param4);
          stackIn_3_0 = dh.a(var5_int, var6, param2, (byte) 126, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vd.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var2;
        var2 = SteelSentinels.field_G;
        boolean decompiledFrameRemainder0 = true;
        if (je.field_t > 0) {
          je.field_t = je.field_t - 1;
        } else {
          if (bd.field_c > 0) {
            bd.field_c = bd.field_c - 1;
            if (je.field_t <= 0) {
              if (0 < bd.field_c) {
                vb.$cfr$intArgs$a$e9dea5688aa5(112, bd.field_c);
              }
              if (0 < fj.field_f) {
                vb.$cfr$intArgs$a$e9dea5688aa5(84, fj.field_f);
              }
            } else {
              bh.a(0);
              if (0 < bd.field_c) {
                vb.$cfr$intArgs$a$e9dea5688aa5(112, bd.field_c);
              }
              decompiledFrameRemainder0 = !(0 >= fj.field_f);
              if (decompiledFrameRemainder0) {
                vb.$cfr$intArgs$a$e9dea5688aa5(84, fj.field_f);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != 63) {
                vd.b((byte) 112);
              }
              return;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (fj.field_f > 0)) {
            fj.field_f = fj.field_f - 1;
            if (je.field_t > 0) {
              bh.a(0);
              if (0 < bd.field_c) {
                vb.$cfr$intArgs$a$e9dea5688aa5(112, bd.field_c);
              }
              if (0 < fj.field_f) {
                vb.$cfr$intArgs$a$e9dea5688aa5(84, fj.field_f);
              }
            } else {
              if (0 < bd.field_c) {
                vb.$cfr$intArgs$a$e9dea5688aa5(112, bd.field_c);
              }
              decompiledFrameRemainder0 = !(0 >= fj.field_f);
              if (decompiledFrameRemainder0) {
                vb.$cfr$intArgs$a$e9dea5688aa5(84, fj.field_f);
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != 63) {
                vd.b((byte) 112);
              }
              return;
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (je.field_t > 0) {
            bh.a(0);
          }
          if (0 < bd.field_c) {
            vb.$cfr$intArgs$a$e9dea5688aa5(112, bd.field_c);
          }
          if (0 < fj.field_f) {
            vb.$cfr$intArgs$a$e9dea5688aa5(84, fj.field_f);
          }
        }
        if (param0 == 63) {
          return;
        }
        vd.b((byte) 112);
    }

    public static void b(byte param0) {
        if (param0 != 56) {
          return;
        }
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_e = new String[]{"Everyone is your enemy.", "Destroy the enemies, but don't attack your own team.", "Destroy as many waves of enemies as you can.", "Cooperate with your ally to destroy as many waves of enemies as you can."};
        field_b = false;
        field_a = null;
    }
}
