/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends vo {
    private String field_f;
    static RenderSprite[][] gaugeSprites;
    static String[] field_e;
    private uu field_h;
    static dk field_m;
    private boolean field_i;
    static rk field_j;
    static String field_l;
    static String field_g;

    ii(bm param0, bm param1) {
        super(param0);
        this.field_f = "";
        this.field_i = false;
        try {
          this.field_h = new uu(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_m = null;
        field_l = null;
        gaugeSprites = (RenderSprite[][]) null;
        field_j = null;
        if (param0 == -22) {
          field_e = null;
          field_g = null;
          return;
        }
        field_g = (String) null;
        field_e = null;
        field_g = null;
    }

    final static int a(byte param0, jb param1) {
        String stackIn_19_2 = null;
        try {
          if (param1 == CipherPacketBuffer.field_p) {
            int stackIn_12_0 = 5890;
            return stackIn_12_0;
          }
          if (ac.field_b == param1) {
            int stackIn_3_0 = 34167;
            return stackIn_3_0;
          }
          if (un.field_i == param1) {
            int stackIn_6_0 = 34168;
            return stackIn_6_0;
          }
          if (param1 == bs.field_a) {
            int stackIn_10_0 = 34166;
            return stackIn_10_0;
          }
          if (param0 < 63) {
            field_e = (String[]) null;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var2;
          StringBuilder stackIn_18_1 = new StringBuilder().append("ii.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String a(String param0, byte param1) {
        String stackIn_13_2 = null;
        try {
          if (this.field_h.a(param0, 8192) == bt.field_a) {
            String stackIn_2_0 = this.field_h.a(param0, (byte) 72);
            return stackIn_2_0;
          }
          if (param1 != 72) {
            this.field_i = true;
          }
          if (this.a(param0, 8192) != bt.field_a) {
            String stackIn_9_0 = gh.field_o;
            return stackIn_9_0;
          }
          String stackIn_7_0 = dk.field_i;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("ii.EA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final pt a(String param0, int param1) {
        pt stackIn_13_0 = null;
        String stackIn_17_2 = null;
        try {
          if (this.field_h.a(param0, param1 ^ 0) == bt.field_a) {
            pt stackIn_2_0 = bt.field_a;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_f)) {
            id var3 = rq.a(-111, param0);
            if (!var3.a(false)) {
              pt stackIn_6_0 = ce.field_t;
              return stackIn_6_0;
            }
            this.field_f = param0;
            this.field_i = var3.a(param1 - 10107);
          }
          if (param1 != 8192) {
            String var4 = (String) null;
            this.a((String) null, (byte) 79);
          }
          if (this.field_i) {
            stackIn_13_0 = fd.field_a;
          } else {
            stackIn_13_0 = bt.field_a;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var3_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ii.DA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = new String[]{"Press 1 for speed increase", "Press 2 for improved fire rate", "Press 3 for improved manoeuvrability", "Press 4 for extra armour", "Press 5 for extra life", "Press 6 for extra wingmen", "Press 7 for score multiplier"};
        field_l = "settings";
        ek.a((byte) 116, 1600);
        field_g = "Passwords can only contain letters and numbers";
    }
}
