/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sja extends qma {
    static int[] field_h;
    static g[] field_i;

    public static void b(byte param0) {
        field_i = null;
        field_h = null;
        if (param0 > -96) {
          field_h = (int[]) null;
        }
    }

    final static int b(int param0, int param1) {
        if (param1 == 20934) {
          if (param0 != 6407 &&
            34843 != param0 &&
            34837 != param0) {
            if (param0 != 6408 &&
              param0 != 34842 &&
              param0 != 34836) {
              if (param0 == 6406) {
                return 6406;
              }
              if (param0 == 34844) {
                return 6406;
              }
              if (param0 == 6409) {
                return 6409;
              }
              if (param0 == 34846) {
                return 6409;
              }
              if (param0 == 6410) {
                return 6410;
              }
              if (param0 == 34847) {
                return 6410;
              }
              if (param0 != 6402) {
                throw new IllegalArgumentException("");
              }
              return 6402;
            }
            return 6408;
          }
          return 6407;
        }
        field_i = (g[]) null;
        if (param0 == 6407) {
          return 6407;
        }
        if (34843 == param0) {
          return 6407;
        }
        if (34837 == param0) {
          return 6407;
        }
        if (param0 == 6408) {
          return 6408;
        }
        if (param0 == 34842) {
          return 6408;
        }
        if (param0 == 34836) {
          return 6408;
        }
        if (param0 == 6406) {
          return 6406;
        }
        if (param0 == 34844) {
          return 6406;
        }
        if (param0 == 6409) {
          return 6409;
        }
        if (param0 == 34846) {
          return 6409;
        }
        if (param0 == 6410) {
          return 6410;
        }
        if (param0 == 34847) {
          return 6410;
        }
        if (param0 != 6402) {
          throw new IllegalArgumentException("");
        }
        return 6402;
    }

    sja(cn param0, cn param1, cn param2) {
        super(param0, param1, param2);
    }

    public final boolean a(int param0, byte param1) {
        if (param1 < 10) {
          field_i = (g[]) null;
          if (((lqa) (baa.field_d.field_i.field_b)).field_j) {
            return super.a(param0, (byte) 79);
          }
          if (ad.a(-13545, param0)) {
            return super.a(param0, (byte) 79);
          }
          return false;
        }
        if (((lqa) (baa.field_d.field_i.field_b)).field_j) {
          return super.a(param0, (byte) 79);
        }
        if (ad.a(-13545, param0)) {
          return super.a(param0, (byte) 79);
        }
        return false;
    }

    static {
        field_h = new int[]{15, 12, 7, 18, 33};
    }
}
