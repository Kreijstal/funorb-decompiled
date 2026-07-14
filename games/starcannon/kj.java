/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends vk implements ga {
    private int field_B;
    static hl[] field_y;
    private qe field_F;
    private String field_D;
    private ph field_C;
    private dk[] field_A;
    static java.awt.Canvas field_E;
    private int[] field_z;

    final dk a(byte param0, qg param1, String param2) {
        dk var4 = new dk(param2, param1);
        var4.field_o = (de) (Object) new gb();
        int var5 = ((kj) this).field_f + -2;
        ((kj) this).a(0, ((kj) this).field_i, (byte) 124, 34 + ((kj) this).field_f, 0);
        if (param0 < 87) {
            return null;
        }
        var4.a(7, ((kj) this).field_i + -14, (byte) 116, 30, var5);
        ((kj) this).a(true, (uj) (Object) var4);
        return var4;
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 != 0) {
            return;
        }
        field_y = null;
    }

    kj(ph param0, qe param1, String param2) {
        super(0, 0, 288, 0, (de) null);
        ((kj) this).field_B = 0;
        ((kj) this).field_D = param2;
        ((kj) this).field_C = param0;
        ((kj) this).field_F = param1;
        int var4 = null == ((kj) this).field_D ? 0 : ((kj) this).field_F.a(((kj) this).field_D, 260, ((kj) this).field_F.field_p);
        ((kj) this).a(0, 288, (byte) 126, 22 + var4, 0);
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = StarCannon.field_A;
        for (var6 = 0; var6 < ((kj) this).field_B; var6++) {
            if (!(param0 != ((kj) this).field_A[var6])) {
                var7 = ((kj) this).field_z[var6];
                if (var7 == -1) {
                    ((kj) this).field_C.n(-122);
                    break;
                }
                fd.a(((kj) this).field_z[var6], 0);
                break;
            }
        }
        if (param2) {
            ((kj) this).field_F = null;
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((kj) this).field_B;
        this.a(1 + var4, param1 + -13759);
        if (param1 != 13759) {
            Object var5 = null;
            dk discarded$0 = ((kj) this).a((byte) -124, (qg) null, (String) null);
        }
        ((kj) this).field_A[var4] = ((kj) this).a((byte) 120, (qg) this, param0);
        ((kj) this).field_z[var4] = param2;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((kj) this).field_F.a(((kj) this).field_D, param1 + ((kj) this).field_s + 14, ((kj) this).field_j + (param3 - -10), -28 + ((kj) this).field_i, ((kj) this).field_f, 16777215, -1, 0, 0, ((kj) this).field_F.field_p);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        if (((kj) this).field_B >= param0) {
            return;
        }
        dk[] var6 = new dk[param0];
        dk[] var7 = var6;
        dk[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; var5 < ((kj) this).field_B; var5++) {
            var6[var5] = ((kj) this).field_A[var5];
            var4[var5] = ((kj) this).field_z[var5];
        }
        ((kj) this).field_A = var7;
        ((kj) this).field_z = var4;
        ((kj) this).field_B = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new hl[4];
    }
}
