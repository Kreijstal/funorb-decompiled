/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    final static boolean a(byte param0) {
        if (param0 >= -91) {
          cc.a((byte) 35);
          return VolumeRampingMidiPcmStream.field_eb != null ? true : false;
        }
        return VolumeRampingMidiPcmStream.field_eb != null ? true : false;
    }

    final static String a(int param0) {
        if (param0 <= 29) {
          return (String) null;
        }
        if (!(pb.field_Kb >= 2)) {
          return MouseWheelInput.field_b;
        }
        if (GameCanvas.field_d != null) {
          if (GameCanvas.field_d.ensureIndexLoaded(-15879)) {
            return ad.field_b;
          }
          return u.field_j;
        }
        if (!im.field_c.ensureIndexLoaded(-15879)) {
          return cl.field_h;
        }
        if (!im.field_c.a(-8088, "commonui")) {
          return lj.field_r + " - " + im.field_c.getGroupLoadPercentByName(123, "commonui") + "%";
        }
        if (!mb.field_m.ensureIndexLoaded(-15879)) {
          return cf.field_r;
        }
        if (!mb.field_m.a(-8088, "commonui")) {
          return FrameTimer.field_a + " - " + mb.field_m.getGroupLoadPercentByName(119, "commonui") + "%";
        }
        if (!ll.field_b.ensureIndexLoaded(-15879)) {
          return dg.field_qb;
        }
        if (!ll.field_b.tryLoadAllGroups(0)) {
          return qg.field_j + " - " + ll.field_b.c(0) + "%";
        }
        return jf.field_h;
    }

    static {
    }
}
