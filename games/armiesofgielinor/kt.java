/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends mk {
    static AntialiasedBitmapFont field_n;
    private String field_k;
    static String field_m;
    static boolean field_l;
    static RgbSprite[] field_o;
    private di field_q;
    static int field_p;
    private boolean field_j;

    final gu a(int param0, String param1) {
        fo var3 = null;
        RuntimeException var3_ref = null;
        gu stackIn_2_0 = null;
        gu stackIn_7_0 = null;
        gu stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q.a(param0 ^ 0, param1) == rn.field_e) {
            stackIn_2_0 = rn.field_e;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_k)) {
            var3 = dh.a(param1, (byte) 67);
            if (!var3.a((byte) -74)) {
              stackIn_7_0 = so.field_e;
              return stackIn_7_0;
            }
            this.field_k = param1;
            this.field_j = var3.a(17);
          }
          if (param0 != -3137) {
            this.field_q = (di) null;
          }
          if (this.field_j) {
            stackIn_14_0 = oo.field_g;
          } else {
            stackIn_14_0 = rn.field_e;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("kt.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 89) {
            field_n = (AntialiasedBitmapFont) null;
          }
          if (this.field_q.a(-3137, param1) == rn.field_e) {
            stackIn_5_0 = this.field_q.a((byte) 126, param1);
            return stackIn_5_0;
          }
          if (this.a(-3137, param1) != rn.field_e) {
            stackIn_10_0 = CampaignRewardPreview.field_a;
            return stackIn_10_0;
          }
          stackIn_8_0 = QuickChatHelpDialog.field_Ib;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kt.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_n = null;
        if (param0 < 91) {
          field_n = (AntialiasedBitmapFont) null;
          field_o = null;
          field_m = null;
          return;
        }
        field_o = null;
        field_m = null;
    }

    kt(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        this.field_k = "";
        this.field_j = false;
        try {
          this.field_q = new di(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Auto-respond to <%0>";
        field_l = false;
    }
}
