/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends rl {
    private int field_l;
    static long field_j;
    private int field_k;

    final PuzzleTile a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        CrystalTile stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_k = -21;
          }
          this.field_k = this.field_k + param3;
          this.field_l = this.field_l + 1;
          stackIn_3_0 = new CrystalTile(IsaacRandom.field_g, 0);
          return (PuzzleTile) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("tc.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
          this.field_l = 101;
          return (pb) ((Object) new sh());
        }
        return (pb) ((Object) new sh());
    }

    final void a(byte param0) {
        int var2 = -78 / ((29 - param0) / 42);
        TextLayout.field_d.playSampleWithPan(re.field_h, 100, this.field_l * (48 * gi.field_m), this.field_k / this.field_l);
        this.field_k = 0;
        this.field_l = 0;
    }

    tc() {
        this.field_k = 0;
        this.field_l = 0;
    }

    static {
        field_j = 0L;
    }
}
