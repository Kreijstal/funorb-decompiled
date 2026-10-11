/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends ne {
    pn[] field_s;
    static String field_p;
    static ph field_m;
    byte[][][] field_k;
    static int field_i;
    pn[] field_o;
    int[] field_n;
    int field_q;
    int[] field_r;
    int field_j;
    int[] field_l;

    final static void a(byte param0, boolean param1, java.applet.Applet param2, String param3) {
        try {
          RuntimeException var4 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4_ref = null;
          try {
            if (qg.field_n.startsWith("win") &&
              ji.a(param3, -38)) {
              return;
            }
            try {
              param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              sm.a((Throwable) null, 1, "MGR1: " + param3);
            }
            if (param0 > 112) {
              return;
            }
            field_m = (ph) null;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4;
            stackIn_12_1 = new StringBuilder().append("oe.C(").append(param0).append(',').append(param1).append(',');
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
            throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_p = null;
        if (param0 != 0) {
          field_p = (String) null;
        }
    }

    oe() {
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          java.applet.Applet var4 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 <= 47) {
              var4 = (java.applet.Applet) null;
              oe.a((String) null, (java.applet.Applet) null, (byte) 72);
            }
            try {
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              var3 = j.a((byte) 95, var3, param1);
              oe.a((byte) 126, true, param1, var3.toString());
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("oe.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_i = 0;
        field_p = "Employed by the human cities to thin out the population of orcs and goblins in the wilderness, rangers have a well-rounded set of skills and are deadly with a bow.";
    }
}
