/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends IntrusiveNode {
    static Sprite[] field_o;
    int field_l;
    int field_m;
    int field_k;
    ql field_h;
    int field_i;
    static IntrusiveDeque field_p;
    int field_j;
    static nq field_n;
    static volatile int field_q;

    final static void a(byte param0, String[] param1) {
        sq stackIn_17_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        sq var3 = null;
        int var4 = 0;
        String var5 = null;
        sq var6 = null;
        int var7 = 0;
        int var8 = 0;
        ObjectList var9 = null;
        int var4Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          vc.field_c = param1;
          if (param0 != 50) {
            return;
          }
          if (0 == vc.field_c.length) {
            EmailValidator.field_q = null;
            return;
          }
          PlayerStats.field_k = 0;
          SliderPainter.b((byte) 93);
          var9 = new ObjectList();
          var3 = nd.a((byte) -106);
          while (var3 != null) {
            var9.add(false, var3);
            var3 = nd.a((byte) 118);
          }
          EmailValidator.field_q = new sq[var9.field_g];
          for (var4 = 0; var4 < var9.field_g; var4++) {
            EmailValidator.field_q[var4] = (sq) (var9.field_b[var4]);
          }
          var8 = 0;
          var4Lifetime1 = var8;
          while (var9.field_g - 1 > var8) {
            var5 = EmailValidator.field_q[var8].field_d;
            if (var5 == null) {
              stackIn_17_0 = null;
            } else {
              stackIn_17_0 = n.a(var5, -21502);
            }
            var6 = stackIn_17_0;
            if (var6 == null &&
              !EmailValidator.field_q[var8].field_r) {
              var6 = EmailValidator.field_q[var8 + 1];
            }
            EmailValidator.field_q[var8].field_l = var6;
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ql.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        SoundPlayback var1 = null;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        SoundPlayback var1Lifetime1;
        try {
          aj.field_e.service();
          IsolationistAi.field_q.service();
          if (param0 != -26848) {
            ql.clearStatics((byte) 108);
          }
          QuickChatCategoryDefinition.field_u = QuickChatCategoryDefinition.field_u - 1;
          if (QuickChatCategoryDefinition.field_u == 0) {
            QuickChatCategoryDefinition.field_u = 200;
            var1 = (SoundPlayback) (eo.field_ab.startForward(param0 ^ -26848));
            while (var1 != null) {
              if (!var1.field_n.isLinked(2048)) {
                var1.unlink((byte) -108);
              }
              var1 = (SoundPlayback) (eo.field_ab.nextForward((byte) -71));
            }
            if (CandidateLink.field_v != null) {
              var1Lifetime1 = (SoundPlayback) (CandidateLink.field_v.startForward(0));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_n.isLinked(2048)) {
                  var1Lifetime1.unlink((byte) -84);
                }
                var1Lifetime1 = (SoundPlayback) (CandidateLink.field_v.nextForward((byte) -71));
              }
            }
          }
          if (ToggleButton.field_B != null &&
            ToggleButton.field_B.isPlaying(5309)) {
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ql.A(" + param0 + ')');
        }
    }

    final static void a(java.awt.Frame param0, int param1, PlatformTaskDispatcher param2) {
        PlatformTask var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          while (true) {
            var3 = param2.requestFrame(param0, (byte) 127);
            while (var3.field_d == 0) {
              jb.sleep((byte) -94, 10L);
            }
            if (var3.field_d != 1) {
              jb.sleep((byte) -93, 100L);
              continue;
            }
            break;
          }
          if (param1 != 0) {
            return;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ql.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void clearStatics(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 > -46) {
          field_o = (Sprite[]) null;
        }
        field_n = null;
    }

    ql(int param0, int param1, int param2, int param3, int param4) {
        this.field_m = param2;
        this.field_j = param3;
        this.field_l = param4;
        this.field_i = param0;
        this.field_k = param1;
    }

    static {
        field_p = new IntrusiveDeque();
        field_q = 0;
    }
}
