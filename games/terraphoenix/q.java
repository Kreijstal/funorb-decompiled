/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends g {
    int field_Mb;
    static String field_Nb;
    String field_Lb;
    static boolean field_Gb;
    static int field_Hb;
    String field_Eb;
    static String field_Kb;
    static boolean field_Ib;
    static String field_Fb;
    static int field_Db;
    static int field_Jb;
    static String field_Ob;

    q() {
        super(0L, (g) null);
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_14_0 = Long.TYPE;
            return stackIn_14_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param0 <= 57) {
            q.e(106);
          }
          if (param1.equals("D")) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (!param1.equals("C")) {
            stackIn_30_0 = Class.forName(param1);
            return stackIn_30_0;
          }
          stackIn_28_0 = Character.TYPE;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("q.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 == 0) {
          field_Ob = null;
          field_Kb = null;
          field_Nb = null;
          field_Fb = null;
          return;
        }
        field_Ib = true;
        field_Ob = null;
        field_Kb = null;
        field_Nb = null;
        field_Fb = null;
    }

    static {
        field_Kb = "Passwords must be between 5 and 20 letters and numbers";
        field_Nb = "Loading music";
        field_Fb = "Left click to fire weapon";
        field_Db = 500;
        field_Ob = "Cancel";
    }
}
