/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspotRange extends IntrusiveNode {
    TextHotspotRange nextLine;
    static String field_r;
    int y;
    static String field_o;
    static String[] field_i;
    static String field_m;
    int height;
    int id;
    int width;
    static String field_q;
    int x;

    public static void clearSharedReferences(int param0) {
        if (param0 > 22) {
          field_q = null;
          field_o = null;
          field_i = null;
          field_m = null;
          field_r = null;
          return;
        }
        TextHotspotRange.a(true);
        field_q = null;
        field_o = null;
        field_i = null;
        field_m = null;
        field_r = null;
    }

    final static TickClock a(boolean param0) {
        if (param0) {
          TextHotspotRange.clearSharedReferences(-87);
          return (TickClock) ((Object) new NanoTickClock());
        }
        return (TickClock) ((Object) new NanoTickClock());
    }

    TextHotspotRange(int param0, int param1, int param2, int param3, int param4) {
        this.y = param2;
        this.height = param4;
        this.width = param3;
        this.x = param1;
        this.id = param0;
    }

    static {
        field_r = "Names can only contain letters, numbers, spaces and underscores";
        field_i = new String[]{"The Championship", "The Championship II", "Power-ups", "Power-ups II", "Power-ups III", "Two-player", "Other modes"};
        field_o = "Passwords must be between 5 and 20 letters and numbers";
        field_q = "OFF";
        field_m = "Name is available";
    }
}
