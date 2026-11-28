/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatusEffectIndicator {
    RgbSprite field_c;
    String field_b;
    int field_a;
    private en field_d;

    final en getTooltip() {
        if (this.field_d == null) {
          this.field_d = (en) ((Object) new jf(this));
        }
        return this.field_d;
    }

    StatusEffectIndicator(String param0, RgbSprite param1, int param2) {
        this.field_b = param0;
        this.field_c = param1;
        this.field_a = param2;
    }
}
