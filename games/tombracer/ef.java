/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends pd {
    private roa field_t;
    static float field_s;

    final void g(byte param0) {
        ((ef) this).field_t = ((ef) this).field_t.e(-1);
        if (param0 != 3) {
            Object var3 = null;
            ((ef) this).a((roa) null, 81);
        }
    }

    final boolean a(int param0, hca param1) {
        Object var4 = null;
        param1.g(62, 106);
        param1.a(((ef) this).field_t, true);
        if (param0 >= -114) {
          var4 = null;
          boolean discarded$2 = ((ef) this).a(66, (hca) null);
          return true;
        } else {
          return true;
        }
    }

    ef(la param0, boolean param1) {
        super(param0, param1);
        ((ef) this).field_t = ci.a(4, -1);
    }

    final void a(boolean param0, kh param1) {
        if (param0) {
          field_s = 2.416393518447876f;
          super.a(param0, param1);
          ((ef) this).field_t.a(param1, (byte) 7);
          return;
        } else {
          super.a(param0, param1);
          ((ef) this).field_t.a(param1, (byte) 7);
          return;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_s = 0.07193703204393387f;
            return 5;
        }
        return 5;
    }

    final void a(roa param0, int param1) {
        if (param1 != 5) {
            return;
        }
        ((ef) this).field_t = param0;
    }

    ef(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((ef) this).field_t = jl.a(param0, true, param1);
    }

    static {
    }
}
