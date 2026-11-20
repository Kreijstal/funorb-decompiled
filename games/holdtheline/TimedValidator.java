/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TimedValidator implements Validator {
    private long field_a;
    static IntrusiveDeque field_b;

    abstract String evaluateValidationMessage(int param0);

    final static String getPendingEmail(byte param0) {
        if (BoundaryLoopTracer.field_a == ImageProducerRasterBuffer.field_n) {
          return ChatMessage.field_k;
        }
        if (!WidgetStyleNode.field_o.isComplete(250)) {
          return WidgetStyleNode.field_o.getText((byte) 66);
        }
        if (NineSliceSpriteFactory.field_b != ImageProducerRasterBuffer.field_n) {
          int var1 = -82 / ((-21 - param0) / 40);
          return RaceSetupMenu.field_v;
        }
        return WidgetStyleNode.field_o.getText((byte) 66);
    }

    public final String getValidationMessage(byte param0) {
        if (param0 != -59) {
          return (String) null;
        }
        if (this.isEmpty((byte) -41)) {
          return null;
        }
        if (BoundaryLoopTracer.monotonicTimeMillis(-1) >= (350L + this.field_a)) {
          return this.evaluateValidationMessage(97);
        }
        return null;
    }

    public final ValidationState getValidationState(int param0) {
        if (this.isEmpty((byte) -114)) {
          return SpriteState.field_q;
        }
        if (BoundaryLoopTracer.monotonicTimeMillis(-1) < (this.field_a + 350L)) {
          return HoverTargetState.field_d;
        }
        if (param0 == -7447) {
          return this.evaluateValidation((byte) -92);
        }
        TimedValidator.getPendingEmail((byte) -36);
        return this.evaluateValidation((byte) -92);
    }

    public final void invalidate(int param0) {
        if (param0 != 21871) {
          field_b = (IntrusiveDeque) null;
          this.field_a = BoundaryLoopTracer.monotonicTimeMillis(-1);
          return;
        }
        this.field_a = BoundaryLoopTracer.monotonicTimeMillis(-1);
    }

    public static void clearSharedReferences(int param0) {
        field_b = null;
        if (param0 != -24581) {
          TimedValidator.getPendingEmail((byte) 45);
        }
    }

    abstract ValidationState evaluateValidation(byte param0);

    static {
        field_b = null;
    }
}
