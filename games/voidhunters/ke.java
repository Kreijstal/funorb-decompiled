/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends rqa {
    ke(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(Class param0, int param1) {
        Object var3 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        if (param1 == 24145) {
          if (param0 != Integer.TYPE) {
            if (param0 != Short.TYPE) {
              if (param0 != Long.TYPE) {
                if (Byte.TYPE != param0) {
                  if (Float.TYPE != param0) {
                    if (Double.TYPE == param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var3 = null;
          boolean discarded$5 = ke.a((Class) null, -113);
          if (param0 != Integer.TYPE) {
            if (param0 != Short.TYPE) {
              if (param0 != Long.TYPE) {
                if (Byte.TYPE != param0) {
                  if (Float.TYPE != param0) {
                    if (Double.TYPE == param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(99, 126));
    }

    static {
    }
}
