/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static hh field_a;
    static String[] field_b;
    static int field_d;
    static int[] field_c;
    static int[] field_f;
    static String field_g;
    static mf field_e;

    public static void a(boolean param0) {
        CharSequence var2;
        if (!param0) {
          var2 = (CharSequence) null;
          pc.a(-125, (CharSequence) null);
          field_f = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_a = (hh) null;
                break L1;
              }
            }
            L2: {
              var2 = jb.a(vn.a((byte) 122, param1), (byte) 29);
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("pc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static int a(int param0, int param1) {
        int var2;
        if ((param1 ^ -1) <= -1) {
          if (fh.field_c.length > param1) {
            if (param0 != 2513) {
              field_c = (int[]) null;
              var2 = fh.field_c[param1].length;
              return var2;
            } else {
              var2 = fh.field_c[param1].length;
              return var2;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    static {
        field_b = new String[]{"Superbly done so far, commander. Your mission remit has again been extended and now takes you to the ice moon. The aliens are busy perfecting cold fusion drive technology for their armada.", "Search for and destroy the drive components."};
        field_f = new int[]{0, 0, 0, 1};
        field_g = "Create a free Account";
    }
}
