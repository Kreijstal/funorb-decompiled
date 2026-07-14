/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends sh {
    static String field_v;
    static int field_t;
    private Object field_u;

    final Object e(byte param0) {
        if (param0 != 97) {
            vk.g(24);
        }
        return ((vk) this).field_u;
    }

    public static void g(int param0) {
        int var1 = 93 % ((param0 - -35) / 38);
        field_v = null;
    }

    final static char a(byte param0, int param1, ih param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          var4 = 119;
          var5 = param2.a((char) var4);
          var6 = param1;
          if (param0 <= -47) {
            break L0;
          } else {
            vk.g(-66);
            break L0;
          }
        }
        L1: while (true) {
          if (param3 < var6) {
            return (char) var4;
          } else {
            if (ml.a((char)var6, 21654)) {
              var7 = param2.a((char)var6);
              if (var5 < var7) {
                var4 = (char)var6;
                var5 = var7;
                var6++;
                continue L1;
              } else {
                var6++;
                continue L1;
              }
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    vk(Object param0, int param1) {
        super(param1);
        ((vk) this).field_u = param0;
    }

    final static tk a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        var2 = param0.length();
        if (var2 == 0) {
          return mf.field_d;
        } else {
          if ((var2 ^ -1) >= -64) {
            if (param1 < -8) {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2) {
                  var4 = param0.charAt(var3);
                  if (45 != var4) {
                    if (0 == (jd.field_b.indexOf(var4) ^ -1)) {
                      return wh.field_p;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    L1: {
                      if (0 == var3) {
                        break L1;
                      } else {
                        if (var3 == -1 + var2) {
                          break L1;
                        } else {
                          var3++;
                          continue L0;
                        }
                      }
                    }
                    return wh.field_p;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return d.field_c;
          }
        }
    }

    final boolean d(byte param0) {
        if (param0 != 120) {
            field_v = null;
            return false;
        }
        return false;
    }

    static {
    }
}
