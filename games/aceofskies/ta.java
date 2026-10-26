/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends sk {
    static boolean field_h;
    private boolean field_g;
    static String field_f;

    final void a(int param0, int param1, jj param2) {
        this.field_b.a(param2, -9135);
        if (param1 < 66) {
          return;
        }
        try {
          this.field_b.b(param0, false);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ta.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ta(bf param0) {
        super(param0);
        this.field_g = false;
    }

    final void a(boolean param0, byte param1) {
        if (param1 <= 2) {
          return;
        }
        go var3 = this.field_b.O(29190);
        if (var3 == null) {
          this.field_b.a(ac.field_b, 0, 0);
          return;
        }
        if (!param0) {
          this.field_b.a(ac.field_b, 0, 0);
          return;
        }
        this.field_b.a(1, (byte) 47);
        this.field_b.a(var3, -9135);
        this.field_b.a(ResourceArchive.field_g, false);
        this.field_b.a(1, (byte) 120);
        this.field_b.a(du.field_l, true, bd.field_C);
        this.field_b.a(true, 2, true, un.field_i, false);
        this.field_b.a(ac.field_b, 0, 0);
        ec var4 = this.field_b.d(12343);
        var4.a(this.field_b.f(false), (byte) -121);
        this.field_b.a(qn.field_a, (byte) 117);
        this.field_b.a(0, (byte) 64);
        this.field_g = true;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 >= 21) {
          return (2048 & param0) != 0 ? true : false;
        }
        ta.a(88, -119, (byte) -114);
        return (2048 & param0) != 0 ? true : false;
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          field_h = true;
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 1786747298) {
          this.a(true, (byte) -20);
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_b.a(ru.field_a, !param0 ? true : false, bd.field_C);
        if (!param0) {
          return;
        }
        jj var4 = (jj) null;
        this.a(-60, 36, (jj) null);
    }

    final void a(boolean param0) {
        if (!this.field_g) {
          this.field_b.a(CipherPacketBuffer.field_p, 0, 0);
        } else {
          this.field_b.a(1, (byte) 78);
          this.field_b.a(b.field_b, false);
          this.field_b.a(ru.field_a, true, ru.field_a);
          this.field_b.a((byte) 124, 2, bs.field_a);
          this.field_b.a(CipherPacketBuffer.field_p, 0, 0);
          this.field_b.f(-21041);
          this.field_b.a((jj) null, -9135);
          this.field_b.a(0, (byte) 83);
          this.field_g = false;
        }
        this.field_b.a(ru.field_a, param0, ru.field_a);
    }

    public static void b(boolean param0) {
        if (!param0) {
          ta.b(false);
          field_f = null;
          return;
        }
        field_f = null;
    }

    static {
        field_h = true;
        field_f = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
