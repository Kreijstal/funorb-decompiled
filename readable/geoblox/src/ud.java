/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static String loadingSoundEffectsText;
    static String createDisplayNameTooltipText;

    final static void a(byte param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        p var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          var4 = (p) ((Object) ResourceArchive.field_a.firstForIteration(0));
          while (var4 != null) {
            ol.a(param1, var4, 30175);
            var4 = (p) ((Object) ResourceArchive.field_a.nextForIteration(1));
          }
          var2 = k.field_e.firstForIteration(0);
          if (param0 > -123) {
            createDisplayNameTooltipText = (String) null;
          }
          while (var2 != null) {
            re.b(-101, param1);
            var2 = k.field_e.nextForIteration(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2_ref), "ud.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static j a(int param0, String param1) {
        String var2 = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        j stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          if (null == ug.field_a) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = ResizableDialog.a(var7, 12);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (j) ((Object) ug.field_a.a((long)var2.hashCode(), -1));
          if (param0 != 0) {
            var6 = (String) null;
            ud.a(55, (String) null);
          }
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_hb);
            var4 = ResizableDialog.a(var8, 12);
            if (var4 == null) {
              var4 = var3.field_hb;
            }
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (j) ((Object) ug.field_a.a(param0 ^ -29925));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("ud.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        createDisplayNameTooltipText = null;
        loadingSoundEffectsText = null;
        if (param0 != 0) {
            createDisplayNameTooltipText = (String) null;
        }
    }

    final static void b(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        PacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        p var11 = null;
        PacketBuffer var12 = null;
        int[] var13 = null;
        qi var14 = null;
        qi var15 = null;
        int[] var16 = null;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          var12 = eh.field_d;
          var2 = var12.readUnsignedByte((byte) 34);
          if (0 == var2) {
            var10 = wf.j(89);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((ByteArrayBuffer) ((Object) var5)).readUnsignedByte((byte) 34);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((ByteArrayBuffer) ((Object) var5)).readIntBE((byte) -97);
            }
            var14 = (qi) ((Object) k.field_e.firstForIteration(0));
            if (var14 == null) {
              Bzip2DecoderState.a((byte) -117);
              return;
            }
            var14.field_g = var3;
            var14.field_f = true;
            var14.field_j = var16[0];
            var14.unlinkNode(false);
          } else {
            if (var2 == 1) {
              var11 = (p) ((Object) ResourceArchive.field_a.firstForIteration(0));
              if (var11 == null) {
                Bzip2DecoderState.a((byte) -120);
                return;
              }
              var11.unlinkNode(false);
            } else {
              if (var2 == 2) {
                var15 = (qi) ((Object) k.field_e.firstForIteration(0));
                if (var15 == null) {
                  Bzip2DecoderState.a((byte) -115);
                  return;
                }
                var15.field_g = wf.j(86);
                var15.field_j = var15.field_g[0];
                var15.field_f = true;
                var15.unlinkNode(false);
              } else {
                gi.a((Throwable) null, "A1: " + og.e(55), (byte) 125);
                Bzip2DecoderState.a((byte) -116);
              }
            }
          }
          if (param0 <= 85) {
            ud.a(-63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ud.D(" + param0 + ')');
        }
    }

    static {
        createDisplayNameTooltipText = "Enter the name you'd prefer. This is the name displayed to other players.";
        loadingSoundEffectsText = "Loading sound effects";
    }
}
