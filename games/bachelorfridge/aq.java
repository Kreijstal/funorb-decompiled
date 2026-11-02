/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq {
    static int[] field_a;
    static UiComponent field_b;

    final static void a(int param0, byte param1) {
        BitPacketBuffer var2 = null;
        BitPacketBuffer var2Lifetime1;
        if (param1 >= 42) {
          var2 = sja.field_fb;
          var2.writeCipheredByte(param0, (byte) 115);
          var2.writeByte(1, 0);
          var2.writeByte(0, 0);
          return;
        }
        aq.a(121, (byte) 73);
        var2Lifetime1 = sja.field_fb;
        var2Lifetime1.writeCipheredByte(param0, (byte) 115);
        var2Lifetime1.writeByte(1, 0);
        var2Lifetime1.writeByte(0, 0);
    }

    final static void a(int param0, int param1) {
        int var3 = BachelorFridge.field_y;
        AirstrikeEvent.d(param1 ^ 92);
        if (0 != param0) {
          if (param0 == 1) {
            cr.field_c = PcmSampleStream.createWithVolume(wt.field_m[1], 256, 96);
            sla.field_a = PcmSampleStream.createWithVolume(wt.field_m[2], 256, 96);
            cr.field_c.d(-1);
            sla.field_a.d(-1);
            ofa.a(0, cr.field_c);
            ofa.a(0, sla.field_a);
            if (param1 != -1) {
              aq.a(-13, (byte) 0);
              return;
            }
            return;
          }
          if (2 != param0) {
            if (3 != param0) {
              if (param1 != -1) {
                aq.a(-13, (byte) 0);
                return;
              }
              return;
            }
            cr.field_c = PcmSampleStream.createWithVolume(wt.field_m[1], 256, 96);
            sla.field_a = PcmSampleStream.createWithVolume(wt.field_m[5], 256, 96);
            m.field_b = PcmSampleStream.createWithVolume(wt.field_m[4], 256, 96);
            cr.field_c.d(-1);
            sla.field_a.d(-1);
            m.field_b.d(-1);
            ofa.a(0, cr.field_c);
            ofa.a(~param1, sla.field_a);
            ofa.a(0, m.field_b);
            if (param1 == -1) {
              return;
            }
            aq.a(-13, (byte) 0);
            return;
          }
          cr.field_c = PcmSampleStream.createWithVolume(wt.field_m[1], 256, 96);
          sla.field_a = PcmSampleStream.createWithVolume(wt.field_m[3], 256, 96);
          cr.field_c.d(-1);
          sla.field_a.d(-1);
          ofa.a(param1 + 1, cr.field_c);
          ofa.a(0, sla.field_a);
          if (param1 == -1) {
            return;
          }
          aq.a(-13, (byte) 0);
          return;
        }
        cr.field_c = PcmSampleStream.createWithVolume(wt.field_m[0], 256, 96);
        cr.field_c.d(-1);
        ofa.a(0, cr.field_c);
        if (param1 == -1) {
          return;
        }
        aq.a(-13, (byte) 0);
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 >= -123) {
          field_b = (UiComponent) null;
        }
    }

    static {
        field_a = new int[128];
    }
}
