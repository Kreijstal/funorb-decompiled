/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends java.awt.Canvas implements java.awt.event.FocusListener {
    static char[] field_f;
    java.awt.Frame field_e;
    static String field_d;
    static int[] field_c;
    static String field_b;
    volatile boolean field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_a = true;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "h.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (mi.a(param0 + 5826, param1, param2)) {
              if (param0 == -4623) {
                var3_int = 0;
                L1: while (true) {
                  if (param2.length() <= var3_int) {
                    stackIn_15_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!ad.a(param2.charAt(var3_int), 15232)) {
                      stackIn_12_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3_int++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("h.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          field_f = (char[]) null;
          field_f = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final void a(int param0, pd param1) {
        try {
            ah.a((byte) 31, param1, this.field_e);
            if (param0 != 109) {
                field_f = (char[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "h.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    h() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_d = "You have resigned.";
        field_c = new int[]{100, 100, 100, 300, 200, 100, 100, 200, 500, 100};
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
