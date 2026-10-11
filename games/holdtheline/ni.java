/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_b;
    static ql field_a;

    final static String a(char param0, byte param1, int param2) {
        int var5 = HoldTheLine.field_D;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        int var4 = 0;
        if (param1 != -125) {
          return (String) null;
        }
        while (var4 < param2) {
          var6[var4] = param0;
          var4++;
        }
        return new String(var6);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          ni.a(87);
        }
        field_a = null;
    }

    final static int a(byte param0) {
        if (param0 >= -54) {
          ni.a((byte) -3);
        }
        if (pf.field_d < 2) {
          return 0;
        }
        if (v.field_C != 0) {
          if (null != ml.field_a) {
            if (!ml.field_a.b((byte) -107)) {
              return 14;
            }
            if (!ml.field_a.a("", true)) {
              return 29;
            }
            if (!ml.field_a.b("", 93)) {
              return 29;
            }
          }
          if (!ah.field_d.b((byte) -92)) {
            return 43;
          }
          if (!ah.field_d.b("commonui", 104)) {
            return 57;
          }
          if (!am.field_d.b((byte) -104)) {
            return 71;
          }
          if (!am.field_d.b("commonui", 59)) {
            return 80;
          }
          if (!ca.field_p.b((byte) -76)) {
            return 82;
          }
          if (!ca.field_p.a((byte) 77)) {
            return 86;
          }
        } else {
          if (!ah.field_d.b((byte) -92)) {
            return 20;
          }
          if (!ah.field_d.b("commonui", -91)) {
            return 40;
          }
          if (!am.field_d.b((byte) -66)) {
            return 50;
          }
          if (!am.field_d.b("commonui", 110)) {
            return 60;
          }
          if (!ca.field_p.b((byte) -122)) {
            return 70;
          }
          if (!ca.field_p.a((byte) -93)) {
            return 80;
          }
        }
        return 100;
    }

    static {
    }
}
