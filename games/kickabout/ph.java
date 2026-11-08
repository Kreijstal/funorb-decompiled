/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static Sprite field_b;
    static UiLayoutNode field_f;
    static String field_c;
    static String field_d;
    static int field_a;
    static IndexedSprite[][] field_e;

    final static boolean a(boolean param0) {
        if (!param0) {
          field_c = (String) null;
          return !WriteIntegersCommand.field_C ? true : false;
        }
        return !WriteIntegersCommand.field_C ? true : false;
    }

    final static void b(boolean param0) {
        int var1 = IntTripleCommand.h((byte) -118);
        int var2 = EmailSyntaxValidator.e((byte) 18);
        if (param0) {
          IntValueNode.field_g.drawPanel(GameSoundEffect.field_k - is.field_d, var2 + (DelayedServerPacket.field_e << 1), SumIntegersCommand.field_I - DelayedServerPacket.field_e, var1 + (is.field_d << 1), 3);
          VerticalScrollbar.k(0);
          return;
        }
        field_c = (String) null;
        IntValueNode.field_g.drawPanel(GameSoundEffect.field_k - is.field_d, var2 + (DelayedServerPacket.field_e << 1), SumIntegersCommand.field_I - DelayedServerPacket.field_e, var1 + (is.field_d << 1), 3);
        VerticalScrollbar.k(0);
    }

    final static void a(int param0) {
        if (null != cb.field_d) {
          cb.field_d.c();
          if (null == pg.field_d) {
            if (param0 == 4) {
              return;
            }
            field_a = -35;
            return;
          }
          pg.field_d.c();
          if (param0 != 4) {
            field_a = -35;
            return;
          }
          return;
        }
        if (null != pg.field_d) {
          pg.field_d.c();
          if (param0 == 4) {
            return;
          }
          field_a = -35;
          return;
        }
        if (param0 == 4) {
          return;
        }
        field_a = -35;
    }

    public static void releaseStatics(int param0) {
        field_e = (IndexedSprite[][]) null;
        field_f = null;
        field_b = null;
        field_c = null;
        if (param0 == 1114366657) {
          field_d = null;
          return;
        }
        ph.releaseStatics(-52);
        field_d = null;
    }

    final static void a(byte param0) {
        if (!ServerTextTemplate.a(-4)) {
          return;
        }
        TrinketCountSortCriterion.a(false, 6, 4);
        int var1 = -31 / ((param0 - 88) / 33);
    }

    static {
        field_c = "Create";
        field_d = "Playing";
        field_a = 0;
        field_b = new Sprite(50, 20);
    }
}
