/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends IntrusiveNode {
    PcmSampleStream field_g;
    int field_i;
    static KeyboardInputListener keyboardListener;
    IntrusiveNode field_f;
    static BufferedRandomAccessFile[] field_h;

    final static void c(byte param0) {
        p var1 = null;
        int var2 = Geoblox.clientControlFlowFlag;
        try {
            if ((!hj.field_c && null != MouseWheelInput.field_b) &&
                (!(!MouseWheelInput.field_b.field_f))) {
                ra.field_d = MouseWheelInput.field_b.field_j;
                hj.field_c = true;
                ug.field_c = ug.field_c & ~ra.field_d;
                InstrumentPatch.field_p = InstrumentPatch.field_p | ra.field_d;
            }
            if (param0 >= -119) {
                keyboardListener = (KeyboardInputListener) null;
            }
            if (!fh.c(-91)) {
                while (true) {
                    var1 = (p) ((Object) GameplayEntity.field_A.removeFirst((byte) -118));
                    if (var1 == null) {
                        break;
                    }
                    sj.a(var1, -56, 4);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "je.C(" + param0 + ')');
        }
    }

    final static ResourceArchive a(int param0, boolean param1, boolean param2, boolean param3, byte param4) {
        int var5 = 55 / ((param4 + 65) / 46);
        return IntKeyLookup.createResourceArchive(-128, param0, param2, !param1 ? 0 : 1, param3, false);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            int var2_int = 0;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              try {
                var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                param1.getAppletContext().showDocument(wf.a(var2, -84, param1), "_top");
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
              }
              var2_int = 91 % ((50 - param0) / 49);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_7_0 = var2_ref2;
              stackIn_7_1 = new StringBuilder().append("je.D(").append(param0).append(',');
              if (param1 == null) {
                stackIn_8_2 = "null";
              } else {
                stackIn_8_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        keyboardListener = null;
        if (param0 <= 49) {
            je.c((byte) -123);
            field_h = null;
            return;
        }
        field_h = null;
    }

    je(PcmSampleStream param0, IntrusiveNode param1) {
        try {
            this.field_g = param0;
            this.field_i = param0.i();
            this.field_f = param1;
            this.field_g.f(this.field_i * j.field_gb / 80);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        keyboardListener = new KeyboardInputListener();
    }
}
