/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static PcmSample field_a;
    static String[] field_b;
    static int field_d;
    static int[] field_c;
    static int[] field_f;
    static String field_g;
    static ResourceArchive field_e;

    public static void releaseStatics(boolean guard) {
        if (guard) {
          field_f = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        pc.a(-125, (CharSequence) null);
        field_f = null;
        field_g = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static String a(int param0, CharSequence param1) {
        String stackIn_10_2 = null;
        try {
          if (param0 != 0) {
            field_a = (PcmSample) null;
          }
          String var2 = jb.a(RasterBuffer.a((byte) 122, param1), (byte) 29);
          if (var2 == null) {
            var2 = "";
          }
          String stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("pc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (param1 < 0) {
          return 0;
        }
        if (fh.field_c.length <= param1) {
          return 0;
        }
        if (param0 == 2513) {
          int var2 = fh.field_c[param1].length;
          return var2;
        }
        field_c = (int[]) null;
        int var2Lifetime1 = fh.field_c[param1].length;
        return var2Lifetime1;
    }

    static {
        field_b = new String[]{"Superbly done so far, commander. Your mission remit has again been extended and now takes you to the ice moon. The aliens are busy perfecting cold fusion drive technology for their armada.", "Search for and destroy the drive components."};
        field_f = new int[]{0, 0, 0, 1};
        field_g = "Create a free Account";
    }
}
