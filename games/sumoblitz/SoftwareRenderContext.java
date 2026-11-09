/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRenderContext {
    private SoftwareGraphicsToolkit toolkit;
    static String field_b;
    static int field_d;
    Runnable thread;
    private int[] scratchIndices;
    SoftwareScanlineOffsets scanlineOffsets;

    final static void initializePunctuationKeyMap(boolean guard) {
        SoftwareTransform3D.field_c[93] = 43;
        SoftwareTransform3D.field_c[44] = 71;
        SoftwareTransform3D.field_c[45] = 26;
        SoftwareTransform3D.field_c[92] = 74;
        SoftwareTransform3D.field_c[59] = 57;
        SoftwareTransform3D.field_c[47] = 73;
        if (!guard) {
          SoftwareTransform3D.field_c[61] = 27;
          SoftwareTransform3D.field_c[222] = 58;
          SoftwareTransform3D.field_c[520] = 59;
          SoftwareTransform3D.field_c[192] = 28;
          SoftwareTransform3D.field_c[46] = 72;
          SoftwareTransform3D.field_c[91] = 42;
          return;
        }
        SoftwareRenderContext.releaseStatics(true);
        SoftwareTransform3D.field_c[61] = 27;
        SoftwareTransform3D.field_c[222] = 58;
        SoftwareTransform3D.field_c[520] = 59;
        SoftwareTransform3D.field_c[192] = 28;
        SoftwareTransform3D.field_c[46] = 72;
        SoftwareTransform3D.field_c[91] = 42;
    }

    public static void releaseStatics(boolean guard) {
        field_b = null;
        if (!guard) {
          SoftwareRenderContext.initializePunctuationKeyMap(false);
        }
    }

    final void setThread(Runnable thread, boolean guard) {
        try {
          if (!guard) {
            SoftwareRenderContext.initializePunctuationKeyMap(true);
          }
          this.thread = thread;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rp.C(" + (thread != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void resetScanlineOffsets(int guard) {
        this.scanlineOffsets = new SoftwareScanlineOffsets(this.toolkit, this);
        if (guard < 124) {
          Runnable var3 = (Runnable) null;
          this.setThread((Runnable) null, true);
        }
    }

    SoftwareRenderContext(SoftwareGraphicsToolkit owner) {
        af discarded$12 = null;
        af discarded$13 = null;
        af discarded$14 = null;
        af discarded$15 = null;
        af discarded$16 = null;
        af discarded$17 = null;
        af discarded$18 = null;
        af discarded$19 = null;
        af discarded$20 = null;
        af discarded$21 = null;
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        SoftwareTransform3D discarded$11 = new SoftwareTransform3D();
        try {
          this.toolkit = owner;
          this.scanlineOffsets = new SoftwareScanlineOffsets(owner, this);
          discarded$12 = new af(this.toolkit);
          discarded$13 = new af(this.toolkit);
          discarded$14 = new af(this.toolkit);
          discarded$15 = new af(this.toolkit);
          discarded$16 = new af(this.toolkit);
          discarded$17 = new af(this.toolkit);
          discarded$18 = new af(this.toolkit);
          discarded$19 = new af(this.toolkit);
          discarded$20 = new af(this.toolkit);
          discarded$21 = new af(this.toolkit);
          this.scratchIndices = new int[af.field_c];
          for (var2_int = 0; af.field_c > var2_int; var2_int++) {
            this.scratchIndices[var2_int] = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rp.<init>(");
          if (owner == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_d = 48;
    }
}
