/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialTransition {
    static String field_f;
    private int field_c;
    int field_d;
    TutorialCondition[] field_a;
    static int field_e;
    String targetPage;

    public static void clearSharedReferences(boolean param0) {
        field_f = null;
        if (param0) {
          field_f = (String) null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6126) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var2 = EntitySound.a(true, ko.a(param0, -13820));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ok.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void addCondition(TutorialCondition param0, int param1) {
        TutorialCondition[] var4 = null;
        int var5 = 0;
        int fieldTemp$0 = 0;
        int var3_int = 0;
        int var6 = HoldTheLine.field_D;
        int var3_intLifetime1;
        try {
          if (this.field_c < this.field_d + 1) {
            var3_int = 1 + this.field_c;
            var4 = new TutorialCondition[var3_int];
            for (var5 = 0; var5 < this.field_d; var5++) {
              var4[var5] = this.field_a[var5];
            }
            this.field_c = var3_int;
            this.field_a = var4;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          this.field_a[fieldTemp$0] = param0;
          var3_intLifetime1 = -24 % ((param1 + 5) / 37);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ok.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    TutorialTransition() {
        this.field_a = null;
        this.field_d = 0;
        this.targetPage = null;
        this.field_c = 0;
    }

    final static void a(int param0) {
        tn.field_h[MidiPcmStream.field_F] = SoftwareRasterizer.field_b;
        OutlinedRoadStripRenderer.field_q[MidiPcmStream.field_F] = SoftwareRasterizer.field_d;
        dm.field_b[MidiPcmStream.field_F] = SoftwareRasterizer.field_e;
        m.field_c[MidiPcmStream.field_F] = SoftwareRasterizer.field_a;
        NanoTickClock.field_n[MidiPcmStream.field_F] = SoftwareRasterizer.field_i;
        TextFieldValidator.field_c[MidiPcmStream.field_F] = SoftwareRasterizer.field_j;
        ValidationHelpWidget.field_V[MidiPcmStream.field_F] = SoftwareRasterizer.field_c;
        MidiPcmStream.field_F = MidiPcmStream.field_F + 1;
        if (param0 != 32381) {
          field_e = 50;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 55) {
          TutorialTransition.a((byte) 60);
        }
        if (ad.field_c == -1) {
          if (!hi.b(1, (byte) 40)) {
            return false;
          }
          ad.field_c = RoadStripRenderer.field_e.readUnsignedByte((byte) -72);
          RoadStripRenderer.field_e.position = 0;
        }
        if (ad.field_c == -2) {
          if (!hi.b(2, (byte) 40)) {
            return false;
          }
          ad.field_c = RoadStripRenderer.field_e.readUnsignedShort(62);
          RoadStripRenderer.field_e.position = 0;
        }
        return hi.b(ad.field_c, (byte) 40);
    }

    static {
    }
}
