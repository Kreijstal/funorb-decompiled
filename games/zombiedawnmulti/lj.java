/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends IntrusiveNode {
    static int field_n;
    private int field_w;
    static String[] field_t;
    static String field_q;
    static String field_m;
    private PcmSampleStream field_g;
    private PcmSampleStream field_i;
    static UiComponent field_v;
    static String field_k;
    private int field_j;
    static String field_p;
    private um[] field_u;
    static String[] field_h;
    private int field_r;
    static String field_f;
    private boolean field_o;
    private int field_l;
    static String field_s;

    final void a(int param0) {
        int var3 = 0;
        um var4 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -20587) {
          field_p = (String) null;
        }
        um[] var6 = this.field_u;
        um[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.a(this.field_w, this.field_l, (byte) -125);
        }
        if (this.field_i != null &&
          this.field_i.isSamplePositionOutOfRange()) {
          this.field_i = null;
        }
        this.field_r = this.field_r + 6;
        if (this.field_j < this.field_r) {
          if (this.field_o) {
            PowerupButton.field_e.navigation.level.a((byte) 127);
            PowerupButton.field_e.navigation.a(48);
          }
          this.unlink(true);
        }
    }

    final void a(byte param0, Camera param1) {
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = param1.worldToScreenX(this.field_l, -20126);
          var4 = param1.worldToScreenY(this.field_w, 122);
          if (this.field_g == null &&
            this.field_i == null) {
            stackIn_5_0 = 0;
          } else {
            stackIn_5_0 = sd.b(126, var4, var3_int);
          }
          var5 = stackIn_5_0;
          if (this.field_g != null) {
            if (this.field_g.isSamplePositionOutOfRange()) {
              this.field_g = null;
            } else {
              this.field_g.setVolume(var5);
            }
          }
          if (this.field_i != null) {
            if (this.field_i.isSamplePositionOutOfRange()) {
              this.field_i = null;
            } else {
              this.field_i.setVolume(var5);
            }
          }
          var6 = (int)(15.0f * (float)this.field_r / (float)this.field_j);
          var7 = (int)((float)this.field_r * 128.0f / (float)this.field_j);
          var9 = 18 / ((-61 - param0) / 36);
          if (var7 > 96) {
            stackIn_17_0 = 288 + (-(3 * var7) + 96);
          } else {
            stackIn_17_0 = var7;
          }
          var8 = stackIn_17_0;
          var10 = 128 - var7 >> 1;
          if (var10 > 32) {
            var10 = 32;
          }
          for (var11 = 0; this.field_u.length / 2 > var11; var11++) {
            this.field_u[var11].a(var4, (byte) 33, td.field_c[var6], var10 / 2, var8 / 2, var3_int);
          }
          var13 = this.field_u.length / 2;
          var11Lifetime1 = var13;
          while (this.field_u.length > var13) {
            this.field_u[var13].a(var4, (byte) 33, td.field_c[var6], var10, var8, var3_int);
            var13++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("lj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_m = null;
        int var1 = -50 / ((-24 - param0) / 43);
        field_p = null;
        field_h = null;
        field_f = null;
        field_q = null;
        field_t = null;
        field_s = null;
        field_v = null;
    }

    final static void a(BitmapFont param0, int param1, BitmapFont param2, int param3) {
        try {
          m.field_C = param0;
          int var4_int = 43 / ((12 - param3) / 47);
          ib.field_b = param1;
          uq.field_f = param2;
          AttackEvent.a(SoftwareRasterizer.height / 2, SoftwareRasterizer.width / 2, 1633);
          SimEntity.a(param0.field_J, param2.maxDescent + param2.field_J, 1829947600, param2.field_J, param0.maxDescent + param0.field_J);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    lj(int param0, int param1, boolean param2) {
        int stackIn_11_1 = 0;
        int var4;
        int var4Lifetime1;
        this.field_g = null;
        this.field_o = false;
        this.field_i = null;
        if (!PowerupButton.field_e.navigation.isPositionWalkable(-113, param1, param0)) {
          param1 = param1 - (param1 % 24 - 4);
        }
        this.field_w = param1;
        this.field_u = new um[150];
        this.field_r = 0;
        this.field_l = param0;
        for (var4 = 0; this.field_u.length / 2 > var4; var4++) {
          this.field_u[var4] = new um(FightEvent.field_n[var4] * 6.0f, FightEvent.field_k[var4] * 6.0f);
        }
        for (var4Lifetime1 = this.field_u.length / 2; this.field_u.length > var4Lifetime1; var4Lifetime1++) {
          this.field_u[var4Lifetime1] = new um(FightEvent.field_n[var4Lifetime1 % FightEvent.field_n.length] * 6.0f / 2.0f, FightEvent.field_k[var4Lifetime1 % FightEvent.field_k.length] * 6.0f / 2.0f);
        }
        IntrusiveDeque discarded$0 = new IntrusiveDeque();
        if (!param2) {
          stackIn_11_1 = 180;
        } else {
          stackIn_11_1 = 90;
        }
        this.field_j = stackIn_11_1;
        this.field_g = Camera.b(-127, 0);
    }

    static {
        field_p = "Breaking real-world laws";
        field_q = "Make your zombies hunger for human flesh. They will lunge faster and from further away.";
        field_h = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_t = new String[16];
        field_m = "Tutorial";
        field_f = "Username: ";
        field_k = "Invite more players, or alternatively try changing the following settings:  ";
        field_s = "You must be a member to play with the current options.";
    }
}
