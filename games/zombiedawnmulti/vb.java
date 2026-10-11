/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static ja field_b;
    static String field_e;
    static int field_f;
    static String field_g;
    static cj field_c;
    static byte[][] field_a;
    static String field_d;

    final static cj a(int param0) {
        if (da.field_a > 0) {
          return dl.field_a;
        }
        if (sq.field_Q > 0) {
          return dl.field_a;
        }
        if (param0 != 21262) {
          field_f = -119;
          return null;
        }
        return null;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = (byte[][]) null;
        field_e = null;
        field_g = null;
        field_d = null;
        if (!param0) {
          field_b = null;
          return;
        }
        vb.a(false);
        field_b = null;
    }

    final static void a(int param0, String[][] param1, String[] param2, String[] param3, boolean param4, String[][] param5, int[] param6, String[] param7, byte[] param8, ul param9, int[] param10, int param11, ja[][] param12, int param13, ul param14, boolean param15, ja[][] param16, ul param17, byte[] param18, ri[] param19) {
        String[] stackIn_4_0;
        int stackIn_4_1;
        int[] stackIn_4_2;
        ul stackIn_4_3;
        String[] stackIn_4_4;
        ja[][] stackIn_4_5;
        ja[][] stackIn_4_6;
        String[][] stackIn_4_7;
        byte[] stackIn_4_8;
        int stackIn_4_9;
        boolean stackIn_5_10;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          lc.a(-12035, param14, param10, param19, param9);
          if (param15) {
            return;
          }
          km.a(param14, (byte) -125);
          stackIn_4_0 = (String[]) (param7);
          stackIn_4_1 = param13;
          stackIn_4_2 = (int[]) (param6);
          stackIn_4_3 = (ul) (param14);
          stackIn_4_4 = (String[]) (param2);
          stackIn_4_5 = (ja[][]) (param12);
          stackIn_4_6 = (ja[][]) (param16);
          stackIn_4_7 = (String[][]) (param1);
          stackIn_4_8 = (byte[]) (param8);
          stackIn_4_9 = param0;
          stackIn_5_10 = !(param15);
          md.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6, stackIn_4_7, stackIn_4_8, stackIn_4_9, stackIn_5_10, param18, param3, param11, param5);
          t.a(param17, param14, 0, param4);
          po.a(2);
          wf.a(6835);
          hb.b(41);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_9_0 = var20;
          stackIn_9_1 = new StringBuilder().append("vb.C(").append(param0).append(',');
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param8 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param9 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param10 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param17 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param18 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param19 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    static {
        field_b = new ja(54, 54);
        field_f = 0;
        field_e = "You do not have a suitable number of players for the current options.";
        field_g = "Invite only";
        field_d = "Game options";
        field_a = new byte[250][];
    }
}
