/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends wia {
    boolean field_o;

    bq(int param0) {
        super(param0);
    }

    final static boolean a(String param0, int param1, String param2) {
        if (kaa.a(param0, (byte) 63)) {
          return false;
        } else {
          if (tfa.a(41, param0)) {
            return false;
          } else {
            if (eha.a(15, param0)) {
              return false;
            } else {
              if (param1 == 20133) {
                if (-1 == (param2.length() ^ -1)) {
                  return true;
                } else {
                  if (vs.a(param1 + -20165, param2, param0)) {
                    return false;
                  } else {
                    if (cw.a(param0, param2, true)) {
                      return false;
                    } else {
                      if (db.a(param2, param0, false)) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    static {
    }
}
