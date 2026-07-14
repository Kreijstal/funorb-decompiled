/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class beb implements dja {
    static int field_a;

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
        if (param0.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (!param0.equals((Object) (Object) "I")) {
            if (param0.equals((Object) (Object) "S")) {
              return Short.TYPE;
            } else {
              if (param1 == 99) {
                if (!param0.equals((Object) (Object) "J")) {
                  if (param0.equals((Object) (Object) "Z")) {
                    return Boolean.TYPE;
                  } else {
                    if (!param0.equals((Object) (Object) "F")) {
                      if (param0.equals((Object) (Object) "D")) {
                        return Double.TYPE;
                      } else {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    } else {
                      return Float.TYPE;
                    }
                  }
                } else {
                  return Long.TYPE;
                }
              } else {
                return null;
              }
            }
          } else {
            return Integer.TYPE;
          }
        }
    }

    public final tv a(byte param0) {
        int var2 = 66 % ((param0 - -64) / 50);
        return (tv) (Object) new tj();
    }

    final static tv a(byte[] param0, int param1, dja param2) {
        faa var3 = null;
        tv var4 = null;
        if (param0 != null) {
          var3 = new faa(param0);
          if (param1 != 6429) {
            field_a = 26;
            var4 = param2.a((byte) 52);
            var3.p(-23497);
            var4.a(var3, false);
            var3.f((byte) -87);
            return var4;
          } else {
            var4 = param2.a((byte) 52);
            var3.p(-23497);
            var4.a(var3, false);
            var3.f((byte) -87);
            return var4;
          }
        } else {
          return null;
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new tj[param1];
    }

    static {
    }
}
