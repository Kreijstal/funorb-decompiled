/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedFieldValidator implements FieldValidator {
    private long field_c;
    static ge field_a;
    static IntrusiveDeque field_b;
    static kl[] field_d;

    public final String getValidationMessage(int param0) {
        if (param0 != 26162) {
          return (String) null;
        }
        if (this.hasMissingInput(true)) {
          return null;
        }
        if ((this.field_c + 350L) <= dd.correctedCurrentTimeMillis(101)) {
          return this.evaluateValidationMessage(-128);
        }
        return null;
    }

    public final void recordInputChange(byte param0) {
        this.field_c = dd.correctedCurrentTimeMillis(118);
        int var2 = -69 % ((param0 + 29) / 45);
    }

    public final p getValidationStatus(byte param0) {
        if (this.hasMissingInput(true)) {
          return DualLinkNode.field_g;
        }
        int var2 = -87 / ((param0 + 85) / 36);
        if (!((this.field_c + 350L) <= dd.correctedCurrentTimeMillis(61))) {
          return cg.field_g;
        }
        return this.evaluateValidationStatus(4096);
    }

    final static String c(byte param0) {
        if (param0 <= 47) {
          return (String) null;
        }
        return jk.field_b;
    }

    abstract String evaluateValidationMessage(int param0);

    final static void sleepMillis(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0 < -90) {
          if (0L == param1 % 10L) {
            r.sleepIgnoringInterrupts(18780, param1 - 1L);
            r.sleepIgnoringInterrupts(18780, 1L);
          } else {
            r.sleepIgnoringInterrupts(18780, param1);
          }
          return;
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 1) {
          return;
        }
        field_d = null;
        field_a = null;
        field_b = null;
    }

    abstract p evaluateValidationStatus(int param0);

    final static void d(int param0) {
        if (qb.field_h == -EmailFormatValidator.field_k + 0) {
          if (param0 == 1) {
            qb.field_h = qb.field_h + 1;
            return;
          }
          return;
        }
        if (qb.field_h != 250 - EmailFormatValidator.field_k) {
          if (param0 == 1) {
            qb.field_h = qb.field_h + 1;
            return;
          }
          return;
        }
        if (param0 == 1) {
          qb.field_h = qb.field_h + 1;
          return;
        }
    }

    static {
        field_a = new ge();
        field_b = new IntrusiveDeque();
    }
}
