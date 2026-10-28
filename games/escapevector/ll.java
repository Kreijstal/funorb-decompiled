/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends IntrusiveNode {
    int field_g;
    int[] field_j;
    int field_i;
    static String field_h;

    final static void a(int param0, int param1, boolean param2, int param3) {
        param1 = l.a(-8462, param1);
        CheckboxPainter.field_l = new ig(param1, param3);
        mj.field_d = param0;
        SelfDestructEffects.field_q = param1;
        di.field_d = new wc(CheckboxPainter.field_l.field_p);
        int var4 = h.a(param1, (byte) 121);
        di.field_d.a(102, param2, CheckboxPainter.field_l.a(UiContainer.field_y, 12089, dh.field_d), var4);
        gi.a((byte) -70);
    }

    final static void b(boolean param0) {
        ll var1 = (ll) (jl.field_n.first(param0));
        if (var1 != null) {
          CipherPacketBuffer var2 = om.field_g;
          var1.field_j = new int[]{var2.readInt(-5053), var2.readInt(-5053), var2.readInt(-5053), var2.readInt(-5053)};
          var1.unlink((byte) -66);
          return;
        }
        nm.a(16);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = EscapeVector.obfuscationControl;
        if (param3 > 0) {
          if (!(30 <= param3)) {
            ResourceArchive.a(param1, 8, 60 - param3 * 2, ea.field_f, param2 ^ -97);
          } else if (param3 <= 80) {
            ea.field_f.e(8, param1);
          } else if (param3 < 95) {
            ResourceArchive.a(param1, 8, (param3 - 80) * 4, ea.field_f, param2 - 115);
          }
        }
        if (param2 != 8) {
          ll.a(114, -28, -15, 125);
        }
        if (param3 <= 50) {
          return;
        }
        if (80 > param3) {
          ResourceArchive.a(param0, -ArchiveIndex.field_o.fullWidth + 632, 2 * (-param3 + 80), ArchiveIndex.field_o, param2 ^ -112);
          return;
        }
        if (param3 <= 80) {
          ArchiveIndex.field_o.e(632 - ArchiveIndex.field_o.fullWidth, param0);
          return;
        }
        if (95 <= param3) {
          return;
        }
        ResourceArchive.a(param0, -ArchiveIndex.field_o.fullWidth + 632, (param3 - 80) * 4, ArchiveIndex.field_o, param2 ^ -108);
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -77) {
          field_h = (String) null;
        }
    }

    ll() {
    }

    final static void a(boolean param0) {
        ck.field_r = om.field_g.c(!param0 ? true : false);
        if (param0) {
          CharSequence var3 = (CharSequence) ((Object) ck.field_r);
          cc.field_k = sf.a(-101, var3);
          return;
        }
        field_h = (String) null;
        CharSequence var2 = (CharSequence) ((Object) ck.field_r);
        cc.field_k = sf.a(-101, var2);
    }

    final static boolean d(int param0) {
        if (hi.field_r == -1) {
          if (!bo.a(30000, 1)) {
            return false;
          }
          hi.field_r = om.field_g.readUnsignedByte(param0 ^ 10550);
          om.field_g.position = 0;
        }
        if (hi.field_r == -2) {
          if (!bo.a(30000, 2)) {
            return false;
          }
          hi.field_r = om.field_g.readUnsignedShort(1952);
          om.field_g.position = 0;
        }
        if (param0 == 10550) {
          return bo.a(30000, hi.field_r);
        }
        field_h = (String) null;
        return bo.a(30000, hi.field_r);
    }

    static {
        field_h = "ENTER or R or ALT";
    }
}
