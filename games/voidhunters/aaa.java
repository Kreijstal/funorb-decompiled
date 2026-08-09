/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aaa {
    static String field_a;
    static vka field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 35) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, mm param1, String param2, boolean param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hqb var7 = null;
        String var8 = null;
        hqb var9 = null;
        String var10 = null;
        hqb var11 = null;
        String var12 = null;
        hqb var13 = null;
        try {
          L0: {
            L1: {
              pea.a(0L, param1, -1, (int[]) null, (String) null, rgb.field_f, (String) null, (byte) 50, param1.f((byte) -13));
              if (!param1.field_fc) {
                break L1;
              } else {
                L2: {
                  if ((param1.field_Bb ^ -1) == -3) {
                    break L2;
                  } else {
                    if ((go.field_p ^ -1) > -3) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = cka.field_o;
                var8 = isa.a(hmb.field_o, new String[]{param2}, 113);
                var7.field_i.a(var8, (byte) -53, 10);
                break L1;
              }
            }
            L3: {
              cka.field_o.a(true);
              if (!param3) {
                break L3;
              } else {
                if (cka.field_o.field_h != paa.field_q) {
                  var11 = cka.field_o;
                  var12 = isa.a(nga.field_a, new String[]{param2}, param0 ^ 57);
                  var11.field_i.a(var12, (byte) -53, 15);
                  break L3;
                } else {
                  var9 = cka.field_o;
                  var10 = isa.a(ot.field_c, new String[]{param2}, 120);
                  var9.field_i.a(var10, (byte) -53, 16);
                  break L3;
                }
              }
            }
            L4: {
              var13 = cka.field_o;
              var5 = oq.field_H;
              var6 = qs.field_a;
              if (param0 == 112) {
                break L4;
              } else {
                field_a = (String) null;
                break L4;
              }
            }
            var13.field_i.b(var5, -29060, var6, 0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("aaa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
