/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta {
    static rc field_c;
    static String field_d;
    static int field_a;
    static String field_e;
    static o field_b;
    static String field_f;

    final static boolean a(byte param0) {
        boolean stackIn_9_0 = false;
        if (param0 != 60) {
          field_f = (String) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (ri.field_a >= 20 &&
          ph.a((byte) 71) && (!(0 < ei.field_t) ||
          hd.g((byte) 80))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    public static void b(int param0) {
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 != -1) {
          field_c = (rc) null;
        }
        field_e = null;
        field_b = null;
    }

    abstract void a(java.awt.Component param0, int param1);

    abstract void b(java.awt.Component param0, int param1);

    abstract int a(int param0);

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = wizardrun.field_H;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param1.length();
          while (var2_int < var3) {
            if (d.a(true, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (d.a(true, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (param0 > -48) {
            field_b = (o) null;
          }
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (fg.a((char) var7, 0)) {
              var8 = sf.a(-1514, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("ta.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    static {
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_e = "Members";
        field_f = "take you to the top.  Beware of the rats doing this.";
        field_c = new rc();
    }
}
