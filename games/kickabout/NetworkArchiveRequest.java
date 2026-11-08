/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkArchiveRequest extends ArchiveRequest {
    static boolean field_y;
    byte field_x;
    static ReceivedAuctionItem[] field_w;
    static boolean field_t;
    PacketBuffer field_v;
    int field_u;

    final static void a(String param0, byte param1, String param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != rk.field_f) {
            rk.field_f.closeDialog(-123);
          }
          IsSixCommand.field_E = new LoginForm(param0, param2, false, true, true);
          we.field_a.a((byte) -122, (UiWidget) (IsSixCommand.field_E));
          if (param1 != 111) {
            field_y = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ui.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static EntityAfterimage g(int param0) {
        int var3 = 0;
        int var1;
        int var2;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var1 = 2147483647;
        var2 = 0;
        for (var3 = param0; var3 < SplashScreen.field_n.length; var3++) {
          var4 = SplashScreen.field_n[var3].field_a;
          if (var1 > var4) {
            var1 = var4;
            var2 = var3;
          }
        }
        return SplashScreen.field_n[var2];
    }

    public static void a(boolean param0) {
        field_w = null;
        if (!param0) {
          String var2 = (String) null;
          NetworkArchiveRequest.a((String) null, (byte) 7, (String) null);
        }
    }

    final static void h(int param0) {
        GameOverView.field_R = true;
        if (param0 != -15396) {
          field_w = (ReceivedAuctionItem[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param3 != 2147483647) {
          String var5 = (String) null;
          NetworkArchiveRequest.a((String) null, (byte) 63, (String) null);
        }
        ContentTransitionDialog.a(bw.field_a[param1], true, param0, ad.field_d[param1], param2, true);
    }

    final int progress(int param0) {
        if (param0 != 0) {
          return 103;
        }
        if (this.field_v == null) {
          return 0;
        }
        return this.field_v.field_n * 100 / (-this.field_x + this.field_v.field_f.length);
    }

    final byte[] getBytes(int param0) {
        if (!this.pending &&
          this.field_v.field_n >= -this.field_x + this.field_v.field_f.length) {
          if (param0 != 12802) {
            NetworkArchiveRequest.g(64);
          }
          return this.field_v.field_f;
        }
        throw new RuntimeException();
    }

    NetworkArchiveRequest() {
    }

    static {
        field_t = true;
        field_y = false;
    }
}
