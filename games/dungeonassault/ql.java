/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends java.awt.Canvas {
    static String field_k;
    static cn field_c;
    private java.awt.Component field_i;
    static String field_l;
    static String field_a;
    static String field_h;
    static af field_f;
    static String field_g;
    static int field_d;
    static Object[] field_e;
    static int field_j;
    static int field_b;

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_i.update(param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ql.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        nh var2;
        field_g = null;
        field_a = null;
        field_k = null;
        if (param0 != 20) {
          var2 = (nh) null;
          ql.a((nh) null, (nh) null, (byte) 30, (nh) null);
          field_f = null;
          field_c = null;
          field_e = null;
          field_l = null;
          field_h = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          field_e = null;
          field_l = null;
          field_h = null;
          return;
        }
    }

    final static boolean a(nh param0, nh param1, byte param2, nh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param3.a(-14354)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3.a(false, "commonui")) {
                L1: {
                  var4_int = 62 / ((-27 - param2) / 59);
                  if (!param0.a(-14354)) {
                    break L1;
                  } else {
                    if (param0.a(false, "commonui")) {
                      L2: {
                        if (!param1.a(-14354)) {
                          break L2;
                        } else {
                          if (!param1.a(false, "button.gif")) {
                            break L2;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("ql.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != -105) {
            field_g = (String) (field_e[6]);
        }
    }

    ql(java.awt.Component param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_i.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "ql.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_h = "Mouse over an icon for details";
        field_g = "STANDARD";
        field_l = "A knight in ornate black armour, adorned with evil-looking sigils. He has a grim look about him, likely from seeing so many enemies fall before his sword.";
        field_f = new af();
        field_j = 0;
        field_d = 256;
        field_e = new Object[1];
        field_b = 0;
    }
}
