/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Spell {
    int spellId;
    static hk field_d;
    static String field_a;
    static i field_b;

    abstract void applyEffect(int castingPlayer, Battlefield battlefield, int obfuscationGuard);

    abstract int getPayloadSize(int obfuscationGuard);

    final static void a(String param0, byte param1) {
        try {
          if (param1 < 33) {
            Spell.b(-9);
          }
          if (null != rd.field_j) {
            rd.field_j.field_pc.b(87);
          }
          if (null != bc.field_a) {
            bc.field_a.field_pc.b(93);
          }
          Throwable var3 = (Throwable) null;
          af.a((Throwable) null, -63, param0);
          dj.a((byte) -124);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ik.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract void finishEffect(Battlefield battlefield, int obfuscationGuard);

    abstract void prepareEffect(byte obfuscationGuard, Battlefield battlefield);

    public static void b(int param0) {
        field_b = null;
        if (param0 != -1700635440) {
          Spell.b(-53);
          field_d = null;
          field_a = null;
          return;
        }
        field_d = null;
        field_a = null;
    }

    Spell(int spellId) {
        this.spellId = spellId;
    }

    abstract void writePayload(int obfuscationGuard, PacketBuffer packet);

    final static int a(long param0, long param1, int param2) {
        if (param2 != -1700635440) {
          return 126;
        }
        return (int)(param0 * param1 >> 16);
    }

    static {
        field_a = "<%0> has withdrawn the request to join.";
    }
}
