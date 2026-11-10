/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RewardChoiceSlot {
    int field_c;
    private RewardChoicePhase phase;
    static int field_a;
    int field_i;
    static int field_e;
    int field_j;
    static String[] loadingQuipsAlternate;
    int field_f;
    int field_g;
    static String field_b;

    final static void a(byte param0, int param1, long param2) {
        BitPacketBuffer var4 = ql.field_k;
        var4.writeCipheredOpcode(param1, -2988);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(6, 0);
        var4.writeLong(1736565456, param2);
        int var6 = -3 % ((param0 - 18) / 52);
        var4.backpatchByteLength(-var5 + var4.position, (byte) -111);
    }

    final void a(int param0) {
        int var3 = 0;
        ToolkitSprite var4 = null;
        int var2 = this.phase.b((byte) -75).a(param0 ^ 28, this.field_f);
        GraphicsToolkit var3_ref_ha = tga.field_a;
        int var4_int = this.field_g;
        int var5 = this.field_c;
        int var6 = this.field_j;
        int var7 = this.field_i;
        ToolkitSprite[] var8 = ArchiveSource.field_a;
        TextInputWidget.a(1, var8, (byte) -51, var4_int, var3_ref_ha, var6, param0, var7, var5, 0);
        if (var2 != -1) {
          var3 = OpenGlUnderwaterEffect.field_n[var2];
          var4 = eca.field_c[var3];
          var4.a((this.field_j >> 1) + this.field_g - (var4.width() >> 1), (this.field_i >> 1) + (this.field_c - (var4.height() >> 1)));
        }
        if (0 <= var2) {
          GridWidgetContainer.field_y[OpenGlUnderwaterEffect.field_f[var2]].a(-20 + (this.field_g + (this.field_j >> 1)), (this.field_i >> 1) + this.field_c - 10);
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        if (param1) {
          return true;
        }
        if (this.field_g > param2) {
          return false;
        }
        if (param0 < this.field_c) {
          return false;
        }
        if (this.field_j + this.field_g <= param2) {
          return false;
        }
        if (param0 < this.field_i + this.field_c) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        loadingQuipsAlternate = null;
        field_b = null;
        int var1 = 28 / ((param0 - 3) / 37);
    }

    RewardChoiceSlot(RewardChoicePhase param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_f = param1;
          this.field_j = param4;
          this.field_c = param3;
          this.field_g = param2;
          this.field_i = param5;
          this.phase = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_e = 0;
        loadingQuipsAlternate = new String[]{"Looking for drums...", "Loading pistol", "Compressing orchestra", "Writing music score", "Decyphering cryptic maps", "Looking for Dad's journal", "Lost the Ark", "Evading evil forces", "Masterminding evil schemes", "Decoding hieroglyphs...", "Building ziggurats", "Digging pits", "Digging pits", "Cursing Tomb Libs", "Loading dart shooters", "Conducting historical research", "Hollowing out volcano", "Raising dead", "Buying precious idols"};
        field_b = "Precarious platforms";
    }
}
