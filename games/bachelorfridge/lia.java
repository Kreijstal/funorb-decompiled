/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lia extends pp {
    int field_k;
    static lm field_j;
    static boolean field_i;

    final void a(aga param0, op param1, int param2) {
        aga var6 = ((lia) this).field_h.a(29, param1);
        aga var7 = var6;
        if (!(!var7.g(param2 + 83, ((lia) this).field_f))) {
            return;
        }
        if (!(-1 == ((lia) this).field_k)) {
            var7.b((byte) 117, ((lia) this).field_k);
        }
        if (!(!od.field_w[param1.field_a[var6.field_x][var6.field_J].field_n].field_b)) {
            param1.field_a[var6.field_x][var6.field_J].field_m = false;
            param1.field_a[var6.field_x][var6.field_J].field_j = 5;
        }
        if (param2 != 12) {
            Object var5 = null;
            rga discarded$0 = lia.a(1, (String) null);
        }
    }

    lia(nq param0, int param1, int param2) {
        ((lia) this).field_h = param0;
        ((lia) this).field_k = param2;
        ((lia) this).field_f = param1;
    }

    public static void d(byte param0) {
        if (param0 <= 22) {
            return;
        }
        field_j = null;
    }

    final static qh a(int param0) {
        if (param0 != 5) {
            field_j = null;
        }
        if (null == go.field_s) {
            go.field_s = new qh();
            go.field_s.a(jca.field_a, true);
            go.field_s.field_k = 0;
            go.field_s.field_f = 2763306;
            go.field_s.field_n = 14;
            go.field_s.field_d = 4;
            go.field_s.field_p = 6;
            go.field_s.field_e = 7697781;
            go.field_s.field_m = oc.field_l;
            go.field_s.field_c = 5;
        }
        return go.field_s;
    }

    final void a(lu param0, byte param1) {
        er.a(((lia) this).field_h, 125, param0);
        param0.b(((lia) this).field_f, -113);
        param0.d(((lia) this).field_k, 0);
        int var3 = 126 % ((param1 - 34) / 58);
    }

    final static rga a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        int var2 = param1.length();
        if (param0 != -58) {
            qh discarded$0 = lia.a(114);
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return cha.field_m;
    }

    static {
    }
}
