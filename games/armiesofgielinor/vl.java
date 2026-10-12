/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends mk {
    static wd field_k;
    static int field_j;
    static String field_o;
    static CipherPacketBuffer outgoingPacket;
    static String field_l;
    static String field_p;
    static String[] field_m;

    final static String a(ResourceArchive param0, int param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!param0.ensureIndex((byte) 82)) {
            stackIn_6_0 = (String) (param4);
            return stackIn_6_0;
          }
          stackIn_8_0 = param2 + " - " + param0.getGroupProgressByName(param3, (byte) 87) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("vl.P(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final gu a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        gu stackIn_7_0 = null;
        gu stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3137) {
            field_l = (String) null;
          }
          stackIn_5_0 = (null != gt.b(param1, (byte) -24)) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            stackIn_9_0 = oo.field_g;
            return stackIn_9_0;
          }
          stackIn_7_0 = rn.field_e;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vl.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        outgoingPacket = null;
        field_m = null;
        field_p = null;
        field_o = null;
        field_l = null;
        field_k = null;
    }

    vl(fn param0) {
        super(param0);
    }

    final static void c(byte param0) {
        if (param0 == 91) {
          ro.field_vb = c.field_d + " <b>" + DualNodeDeque.field_e + "</b> " + od.field_e + " <b>" + WeightedScoreStrategy.field_m + "</b> " + ts.field_f + "<br>" + "<br>" + ls.field_d;
          return;
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 89) {
            vl.c((byte) -118);
          }
          if (this.a(-3137, param1) != rn.field_e) {
            stackIn_6_0 = CampaignRewardPreview.field_a;
            return stackIn_6_0;
          }
          stackIn_4_0 = ArmiesOfGielinor.field_H;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vl.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_j = 0;
        field_o = "Show all lobby chat";
        field_l = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4> (<%5>-<%6>)</col>  Cost:<nbsp><col=ff0000><%7></col>";
    }
}
