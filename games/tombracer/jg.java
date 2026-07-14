/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jg {
    static uia field_a;

    final static boolean a(int param0, String param1, String param2) {
        Object var4 = null;
        if (!qda.a((byte) -72, param2)) {
          if (!eba.a(param2, 6912)) {
            if (ld.a(false, param2)) {
              return false;
            } else {
              if (param1.length() == 0) {
                return true;
              } else {
                if (ne.a(true, param2, param1)) {
                  return false;
                } else {
                  if (!kv.a((byte) 36, param2, param1)) {
                    if (!jea.a(true, param2, param1)) {
                      if (param0 >= -69) {
                        var4 = null;
                        boolean discarded$2 = jg.a(104, (String) null, (String) null);
                        return true;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if ((param2 ^ -1) <= -1) {
          if (0 != param0) {
            if (param1 >= -41) {
              jg.b((byte) 86);
              return param2 + (param0 << 2102277240);
            } else {
              return param2 + (param0 << 2102277240);
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    abstract void a(float param0, float param1, float param2, int param3, float[] param4, float param5, int param6, int param7, int param8, int param9, int param10);

    final static int a(byte param0) {
        int var1 = 16 / ((73 - param0) / 52);
        return ff.field_w;
    }

    public static void b(byte param0) {
        if (param0 < 125) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new uia(256);
    }
}
