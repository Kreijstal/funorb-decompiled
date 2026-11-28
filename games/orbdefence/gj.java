/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends IntrusiveNode {
    static java.awt.Image field_f;
    long[][] field_p;
    int field_o;
    boolean field_h;
    static pf field_g;
    String[][] field_i;
    static boolean field_k;
    static String[] field_j;
    int field_n;
    int field_m;
    int[][] field_l;

    public static void c(boolean param0) {
        field_g = null;
        field_j = null;
        if (!param0) {
          field_f = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        gj.a((ResourceArchive) null, (byte) -123, (ResourceArchive) null, true, (ResourceArchive) null);
        field_f = null;
    }

    final static boolean c(int param0) {
        if (param0 != 1024) {
          return false;
        }
        return null != od.field_f ? true : false;
    }

    final static void a(ResourceArchive param0, byte param1, ResourceArchive param2, boolean param3, ResourceArchive param4) {
        try {
          bd.field_u = hg.a("", (byte) 113);
          bd.field_u.a(false, (byte) -114);
          int var5_int = -57 / ((-43 - param1) / 60);
          BufferedRandomAccessFile.a(param2, (byte) 122, param4, param0);
          sd.a(125);
          tg.field_c = tl.field_h;
          qc.field_g = tl.field_h;
        } catch (RuntimeException runtimeException) {
          throw dd.wrapClientException((Throwable) ((Object) runtimeException), "gj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, MidiPcmStream param1, boolean param2, int param3, java.awt.Component param4, PlatformTaskDispatcher param5) {
        try {
          fg.a(param0, param3, param0, param4, param5, true, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw dd.wrapClientException((Throwable) ((Object) runtimeException), "gj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    gj() {
    }

    static {
        field_k = false;
        field_j = new String[]{"Noobo", "Swarmo", "Zoomo", "Tougho", "Bombo", "Flybo", "Chompo", "Irono", "Awesomeo", "Fast Blaster", "Chain Shooter", "Big Blammer", "Beam Burner", "Boss Splorber", "Boss Blorber", "Boss Annihorber", "Playing with Fire", "Orb Evasion", "Shock Horror", "On the Fence", "Sneako", "Splitto", "Orb Defender", "Ghost-free Zone"};
    }
}
