/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedValidator implements TextValidator {
    private long field_b;
    static int field_a;

    final static NameCheckRequest getOrCreateNameCheck(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        NameCheckRequest stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (FocusDelegatingButton.field_E.isComplete(90) &&
            !param1.equals(FocusDelegatingButton.field_E.getName(0))) {
            FocusDelegatingButton.field_E = ObstacleFactory.createNameCheckRequest(param1, -100);
          }
          if (param0 != 110) {
            var3 = (String) null;
            DebouncedValidator.getOrCreateNameCheck((byte) -101, (String) null);
          }
          stackIn_6_0 = FocusDelegatingButton.field_E;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("um.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void restartDebounce(int param0) {
        this.field_b = MonotonicClock.monotonicTimeMillis(-22826);
        if (param0 != -7674) {
          this.field_b = -52L;
        }
    }

    public final String getValidationMessage(byte param0) {
        if (this.isEmpty(110)) {
          return null;
        }
        if (MonotonicClock.monotonicTimeMillis(-22826) >= 350L + this.field_b) {
          int var2 = -9 / ((-33 - param0) / 57);
          return this.computeMessage(-111);
        }
        return null;
    }

    abstract ValidationState computeState(byte param0);

    abstract String computeMessage(int param0);

    public final ValidationState getValidationState(byte param0) {
        if (param0 > -71) {
          this.field_b = 85L;
          if (this.isEmpty(121)) {
            return AccountWelcomePanel.field_L;
          }
          if (!(MonotonicClock.monotonicTimeMillis(-22826) >= this.field_b + 350L)) {
            return ProxySocketConnector.field_l;
          }
          return this.computeState((byte) -7);
        }
        if (this.isEmpty(121)) {
          return AccountWelcomePanel.field_L;
        }
        if (!(MonotonicClock.monotonicTimeMillis(-22826) >= this.field_b + 350L)) {
          return ProxySocketConnector.field_l;
        }
        return this.computeState((byte) -7);
    }

    static {
    }
}
