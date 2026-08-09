/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends oh implements ag {
    ln field_k;
    static String field_i;
    static String field_j;
    static String field_h;
    private int field_l;
    static String field_m;

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (3 == param0) {
              stackIn_3_0 = uo.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 6) {
                stackIn_7_0 = vi.field_m;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (7 == param0) {
                  stackIn_11_0 = dc.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (8 != param0) {
                    if (9 != param0) {
                      if ((param0 ^ -1) != param1) {
                        if ((param0 ^ -1) == -12) {
                          stackIn_24_0 = gl.field_b;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if ((param0 ^ -1) == -15) {
                            stackIn_28_0 = re.a(tl.field_o, 4371, new String[]{param2});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackIn_20_0 = l.field_d;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_17_0 = vs.field_e;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_14_0 = jg.field_g;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("fi.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L1;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return stackIn_28_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_j = null;
        if (param0 < 20) {
            return;
        }
        field_m = null;
        field_h = null;
    }

    final static nk a(byte param0, nk param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nk var4 = null;
        nk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 70 / ((param0 - -38) / 36);
            var4 = new nk(0, 0, 0);
            var4.field_g = param1.field_g;
            var4.field_i = param1.field_i;
            var4.field_k = param2;
            var4.field_c = param1.field_c;
            var4.field_b = param1.field_b;
            var4.field_a = param1.field_a;
            var4.field_j = param1.field_j;
            var4.field_d = param1.field_d;
            stackIn_1_0 = (nk) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("fi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    fi(ln param0, ln param1) {
        try {
            this.field_k = param1;
            this.field_l = (int)(0.5 + Math.sqrt((double)((-param0.field_A + param1.field_A) * (-param0.field_A + param1.field_A) + (param1.field_S + -param0.field_S) * (-param0.field_S + param1.field_S))));
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(ag param0, int param1) {
        RuntimeException var3 = null;
        ag var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -87) {
                break L1;
              } else {
                var4 = (ag) null;
                this.a((ag) null, 77);
                break L1;
              }
            }
            stackIn_3_0 = -this.field_l + ((fi) ((Object) param0)).field_l;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fi.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_i = "Animations play automatically at the start of the turn. Click to disable.";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_h = "System HUD frame";
        field_m = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
