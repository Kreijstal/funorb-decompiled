/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ie extends o {
    final static boolean a(int param0, int param1, String param2, String param3, rf param4, boolean param5, String param6) {
        RuntimeException var7 = null;
        ig var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qc.field_g != tl.field_h) {
            return false;
          }
          var8 = new ig(bm.field_d, param4);
          bm.field_d.b((byte) 74, (pj) (var8));
          if (param1 != -10031) {
            return false;
          }
          if (fk.a(param1 + 11144)) {
            var8.f((byte) 121);
            return true;
          }
          ae.field_a = param0;
          bh.field_e = param2;
          tl.field_g = null;
          of.field_H = param6;
          qc.field_g = mg.field_m;
          sk.field_G = param3;
          mb.field_c = param5;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("ie.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    ie() {
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        String var3 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("J")) {
            stackIn_12_0 = Long.TYPE;
            return stackIn_12_0;
          }
          if (param1 <= 16) {
            var3 = (String) null;
            ie.a(-70, -101, (String) null, (String) null, (rf) null, true, (String) null);
          }
          if (param0.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param0.equals("F")) {
            stackIn_21_0 = Float.TYPE;
            return stackIn_21_0;
          }
          if (param0.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (!param0.equals("C")) {
            stackIn_29_0 = Class.forName(param0);
            return stackIn_29_0;
          }
          stackIn_27_0 = Character.TYPE;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("ie.F(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
