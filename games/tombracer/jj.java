/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends Exception {
    int field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != -32842) {
            return true;
        }
        return (param1 & 33) != 0 ? true : false;
    }

    final static int a(int param0, byte param1) {
        boolean discarded$7 = false;
        if (param1 < -56) {
          if (6406 != param0) {
            if (param0 != 6409) {
              if ((param0 ^ -1) != -32842) {
                if (6410 != param0) {
                  if (-6408 != (param0 ^ -1)) {
                    if (6408 == param0) {
                      return 4;
                    } else {
                      throw new IllegalArgumentException("");
                    }
                  } else {
                    return 3;
                  }
                } else {
                  return 2;
                }
              } else {
                return 1;
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        } else {
          discarded$7 = jj.a(-126, -76, -57);
          if (6406 != param0) {
            if (param0 != 6409) {
              if ((param0 ^ -1) != -32842) {
                if (6410 != param0) {
                  if (-6408 != (param0 ^ -1)) {
                    if (6408 == param0) {
                      return 4;
                    } else {
                      throw new IllegalArgumentException("");
                    }
                  } else {
                    return 3;
                  }
                } else {
                  return 2;
                }
              } else {
                return 1;
              }
            } else {
              return 1;
            }
          } else {
            return 1;
          }
        }
    }

    jj(int param0) {
        this.field_a = param0;
    }

    static {
    }
}
