/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NanoTickClock extends TickClock {
    private long[] intervalSamples;
    private int sampleCount;
    private long currentNanos;
    static String clickText;
    static long field_k;
    private long deadlineNanos;
    private long lastSampleNanos;
    static Random field_d;
    private int sampleIndex;

    final void reset(byte guard) {
        if (this.deadlineNanos > this.currentNanos) {
          this.currentNanos = this.currentNanos + (-this.currentNanos + this.deadlineNanos);
        }
        if (guard != 105) {
          String var3 = (String) null;
          NanoTickClock.startAccountCreation((AccountCreationForm) null, (String) null, true, (String) null, (String) null, -8, -120);
        }
        this.lastSampleNanos = 0L;
    }

    final static boolean startAccountCreation(AccountCreationForm form, String screenName, boolean emailNews, String email, String password, int age, int guard) {
        AccountCreationProgressDialog var7 = null;
        RuntimeException var7_ref = null;
        AccountCreationProgressDialog var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 0) {
            NanoTickClock.releaseStatics(127);
          }
          if (AccountRequestDefaults.IDLE != ProxySocketConnector.accountCreationState) {
            return false;
          }
          var8 = new AccountCreationProgressDialog(RenderPresentationException.field_a, form);
          var7 = var8;
          RenderPresentationException.field_a.pushDialog((byte) 111, var8);
          if (ImageProducerRasterBuffer.hasLegacyStatusFlag(guard ^ -123)) {
            var8.showIneligibleResult(true);
            return true;
          }
          DropDownLabelRenderer.field_b = emailNews;
          ValidationStatusWidget.field_G = screenName;
          FadingWidget.field_C = email;
          ServerIntArrayRequest.field_l = null;
          ProxySocketConnector.accountCreationState = LegacyOpenGlGraphicsHeap.PENDING;
          ArenaBackdropPalettes.field_d = password;
          IntroFinalFrameResources.field_d = age;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_15_0 = var7_ref;
          stackIn_15_1 = new StringBuilder().append("fd.H(");
          if (form == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (screenName == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(emailNews).append(',');
          if (email == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (password == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(age).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        clickText = null;
        int var1 = 121 % ((75 - param0) / 32);
        field_d = null;
    }

    private final long sampleIntervalNanos(int guard) {
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.lastSampleNanos;
        this.lastSampleNanos = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.intervalSamples[this.sampleIndex] = var4;
          this.sampleIndex = (1 + this.sampleIndex) % 10;
          if (this.sampleCount < 1) {
            this.sampleCount = this.sampleCount + 1;
          }
        }
        long var6 = 0L;
        if (guard < 49) {
          this.deadlineNanos = -118L;
        }
        for (var8 = 1; var8 <= this.sampleCount; var8++) {
          var6 = var6 + this.intervalSamples[(10 + (this.sampleIndex - var8)) % 10];
        }
        return var6 / (long)this.sampleCount;
    }

    final static int topDialogY(int guard) {
        if (guard != 3878) {
          return 25;
        }
        if (!BeveledCheckboxRenderer.hasOpenDialogs(false) ||
          null == HardwareTextureSprite.field_e.topOpenDialog((byte) 54)) {
          return -1;
        }
        return HardwareTextureSprite.field_e.topOpenDialog((byte) 54).y;
    }

    final long sleepMillis(byte guard) {
        this.currentNanos = this.currentNanos + this.sampleIntervalNanos(62);
        if (this.currentNanos < this.deadlineNanos) {
          return (this.deadlineNanos - this.currentNanos) / 1000000L;
        }
        int var2 = -94 / ((guard - 42) / 37);
        return 0L;
    }

    final int advanceTicks(int guard, long tickNanos) {
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 0) {
          this.reset((byte) 73);
        }
        if (this.currentNanos < this.deadlineNanos) {
          this.lastSampleNanos = this.lastSampleNanos + (this.deadlineNanos - this.currentNanos);
          this.currentNanos = this.currentNanos + (this.deadlineNanos - this.currentNanos);
          this.deadlineNanos = this.deadlineNanos + tickNanos;
          return 1;
        }
        var4 = 0;
        do {
          this.deadlineNanos = this.deadlineNanos + tickNanos;
          var4++;
        } while (var4 < 10 &&
          this.currentNanos > this.deadlineNanos);
        if (this.currentNanos > this.deadlineNanos) {
          this.deadlineNanos = this.currentNanos;
        }
        return var4;
    }

    NanoTickClock() {
        this.sampleCount = 1;
        this.intervalSamples = new long[10];
        this.currentNanos = 0L;
        this.deadlineNanos = 0L;
        this.lastSampleNanos = 0L;
        this.sampleIndex = 0;
        this.currentNanos = System.nanoTime();
        this.deadlineNanos = System.nanoTime();
    }

    static {
        clickText = "Click";
        field_k = 0L;
        field_d = new Random();
    }
}
