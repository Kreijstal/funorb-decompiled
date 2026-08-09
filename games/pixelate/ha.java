/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static String field_j;
    static String field_f;
    int[] field_e;
    int field_i;
    static int field_h;
    java.awt.Image field_d;
    static tf[] field_g;
    int field_a;
    static String field_k;
    static tf field_b;
    static String[] field_c;

    abstract void a(java.awt.Graphics param0, boolean param1, int param2, int param3);

    final static boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 12742) {
          if (ri.field_f == null) {
            if (un.field_l) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          ha.b(-110);
          if (ri.field_f != null) {
            return true;
          } else {
            L0: {
              if (!un.field_l) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 37) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            L2: {
              if (re.a(param0, -1) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("ha.I(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0) {
        if (param0 != 19692) {
            return;
        }
        t.a(this.field_e, this.field_a, this.field_i);
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_c = null;
        field_k = null;
        field_j = null;
        field_f = null;
        field_g = null;
        field_b = null;
    }

    abstract void a(int param0, java.awt.Component param1, int param2, byte param3);

    static {
        field_k = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_f = "Waiting for fonts";
    }
}
