/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static String arcadeGameText;
    static String applyText;

    public static void releaseStatics(int param0) {
        if (param0 != -3) {
          return;
        }
        applyText = null;
        arcadeGameText = null;
    }

    final static String b(int param0) {
        if (mp.field_a < 2) {
          return pi.field_b;
        }
        if (null != hd.field_H) {
          if (!hd.field_H.b((byte) 127)) {
            return ek.field_k;
          }
          return mm.field_c;
        }
        if (!wd.field_j.b((byte) 127)) {
          return m.waitingForGraphicsText;
        }
        if (!wd.field_j.a("commonui", 100)) {
          return es.loadingGraphicsText + " - " + wd.field_j.a("commonui", (byte) 33) + "%";
        }
        if (param0 <= 90) {
          dn.b(-125);
        }
        if (!eb.field_f.b((byte) 127)) {
          return ce.waitingForFontsText;
        }
        if (!eb.field_f.a("commonui", 100)) {
          return ow.loadingFontsText + " - " + eb.field_f.a("commonui", (byte) 33) + "%";
        }
        if (!hw.field_a.b((byte) 127)) {
          return fl.waitingForExtraDataText;
        }
        if (!hw.field_a.a(true)) {
          return rd.loadingExtraDataText + " - " + hw.field_a.a(0) + "%";
        }
        return mm.pleaseWaitText;
    }

    static {
        arcadeGameText = "arcade game";
        applyText = "Apply";
    }
}
