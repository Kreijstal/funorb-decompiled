/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn {
    int field_o;
    int field_e;
    String field_q;
    int[] field_d;
    int field_p;
    int field_h;
    UiComponent field_u;
    boolean field_g;
    String field_n;
    static String[] field_i;
    String field_f;
    static String ballsetPlasmaGroup0Nocolour;
    long field_b;
    int field_m;
    static String statusConcluded;
    String field_j;
    static hj field_k;
    static String loginUsernameTooltip;
    static Sprite field_l;
    static int field_s;
    static int[] field_r;

    public static void releaseStatics(int param0) {
        field_k = null;
        field_l = null;
        if (param0 == 0) {
          statusConcluded = null;
          loginUsernameTooltip = null;
          ballsetPlasmaGroup0Nocolour = null;
          field_r = null;
          field_i = null;
          return;
        }
        String var2 = (String) null;
        pn.a((byte) -13, (String) null);
        statusConcluded = null;
        loginUsernameTooltip = null;
        ballsetPlasmaGroup0Nocolour = null;
        field_r = null;
        field_i = null;
    }

    final static IndexedSprite[] loadIndexedSprites(int param0, ResourceArchive param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!TextLineLayout.a(param2, param1, param0, (byte) 121)) {
            stackIn_2_0 = null;
            return (IndexedSprite[]) (stackIn_2_0);
          }
          if (param3 != 120) {
            field_i = (String[]) null;
          }
          stackIn_6_0 = EmailAvailabilityValidator.h(0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("pn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(int param0) {
        if (this.field_g) {
          return 2;
        }
        if (this.field_p != 2) {
          if (~BitmapTextLayout.field_m == ~this.field_b) {
            return 1;
          }
          if (param0 != 14842) {
            this.field_o = -18;
          }
        } else {
          if (0 < this.field_h) {
            return 2;
          }
          if (~BitmapTextLayout.field_m == ~this.field_b) {
            return 1;
          }
          if (param0 == 14842) {
            if (th.field_a != 2) {
              return 0;
            }
            if (DialogLayer.a(this.field_q, -1)) {
              return 1;
            }
            return 0;
          }
          this.field_o = -18;
        }
        if (th.field_a != 2) {
          return 0;
        }
        if (!DialogLayer.a(this.field_q, -1)) {
          return 0;
        }
        return 1;
    }

    final static void a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        LoginPayloadKind.field_d = true;
        t.field_b.text = param1;
        int var2_int = OpacityWidget.field_P.width;
        if (param0 != 75) {
          return;
        }
        try {
          var3 = OpacityWidget.field_P.height;
          var4 = t.field_b.font.measureWrappedHeight(param1, 272, t.field_b.lineSpacing);
          var5 = -(var4 / 2) + var3 / 2 - 103;
          ln.field_q.setBounds(var5, param0 ^ 2147483572, (-320 + var2_int) / 2, 320, -(var5 * 2) - 120 + var3);
          ln.field_q.frameSprites = rp.buildNineSliceFrameSprites(32450, 3, 2105376, ln.field_q.height, 11579568, 8421504);
          t.field_b.setBounds(16, param0 + 2147483572, 24, -24 + (ln.field_q.width - 24), ln.field_q.height - 44);
          sb.field_a.setBounds(-20 + ln.field_q.height - 24, param0 ^ 2147483572, 120, 80, 24);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pn(boolean param0) {
        this.field_n = tp.field_g;
        this.field_p = um.field_d;
        if (!param0) {
          this.field_d = null;
        } else {
          this.field_d = DebugTuningSlider.field_p;
        }
        this.field_f = SectorCacheStore.field_a;
        this.field_j = LabeledChildWidget.field_S;
        this.field_g = qg.field_d;
        this.field_q = ArchiveProvider.field_f;
        this.field_h = AimTarget.field_e;
        this.field_e = m.field_e;
        this.field_o = pp.field_b;
        this.field_m = wq.field_a;
        this.field_b = qg.field_c;
    }

    pn(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_f = param4;
          this.field_j = param1;
          this.field_o = param2;
          this.field_q = param1;
          this.field_e = 0;
          this.field_m = 0;
          this.field_d = null;
          this.field_b = 0L;
          this.field_n = param3;
          this.field_g = true;
          this.field_p = param0;
          this.field_h = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        statusConcluded = "Concluded";
        ballsetPlasmaGroup0Nocolour = "Reds";
        field_k = new hj(15, 0, 1, 0);
        loginUsernameTooltip = "The account name you use to access RuneScape and other Jagex.com games";
        field_r = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
    }
}
