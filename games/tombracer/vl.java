/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends IntrusiveNode {
    private int field_f;
    private int field_h;
    private int field_g;

    vl(int param0, Trap param1) {
        try {
          this.field_f = param0;
          this.field_g = param1.getRoom((byte) -72).getCourseIndex(121);
          this.field_h = param1.getGlobalId(31974).id;
          param1.getSimulation(15470);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        return "PlayerItem(" + this.field_f + "," + this.field_g + "," + this.field_h + ")";
    }

    final static Sprite[] a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        Sprite[] var7 = new Sprite[9];
        Sprite[] var4 = var7;
        var7[0] = LoadProfileCommand.createSolidSprite(param1, 121, param3);
        if (param0 <= 111) {
          vl.a((byte) 34, 94, 33, 36);
        }
        for (var5 = 1; var5 < 9; var5++) {
          var7[var5] = var7[0];
        }
        var4[4] = LoadProfileCommand.createSolidSprite(param2, 43, 64);
        return var4;
    }

    static {
    }
}
