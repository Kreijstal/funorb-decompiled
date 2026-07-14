/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ela extends od {
    String field_l;
    String field_k;
    Class[] field_n;
    static String field_m;

    public final String toString() {
        return ((ela) this).field_k;
    }

    public static void a(int param0) {
        field_m = null;
        int var1 = 6 / ((param0 - 56) / 60);
    }

    final boolean a(int param0, String param1, bfa[] param2) {
        int var4 = 0;
        Class var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!((ela) this).field_l.equals((Object) (Object) param1)) {
          return false;
        } else {
          if (((ela) this).field_n.length == param2.length) {
            var4 = 0;
            L0: while (true) {
              if (((ela) this).field_n.length <= var4) {
                if (param0 > -49) {
                  var7 = null;
                  boolean discarded$1 = ((ela) this).a(-67, (String) null, (bfa[]) null);
                  return true;
                } else {
                  return true;
                }
              } else {
                if (param2[var4].field_a) {
                  L1: {
                    var5 = jd.a(param2[var4].field_d, 0);
                    if (Boolean.TYPE != var5) {
                      break L1;
                    } else {
                      if (((ela) this).field_n[var4] == Boolean.TYPE) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  L2: {
                    if (Character.TYPE != var5) {
                      break L2;
                    } else {
                      if (((ela) this).field_n[var4] == Character.TYPE) {
                        break L2;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (hs.a((byte) -88, var5)) {
                    if (hs.a((byte) -70, ((ela) this).field_n[var4])) {
                      var4++;
                      continue L0;
                    } else {
                      return false;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  if (!((ela) this).field_n[var4].isInstance(param2[var4].field_d)) {
                    return false;
                  } else {
                    var4++;
                    var4++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    abstract bfa a(bfa[] param0, int param1);

    ela(String param0, Class[] param1, String param2) {
        int var5 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        ((ela) this).field_n = param1;
        ((ela) this).field_l = param0;
        var7 = new StringBuilder(((ela) this).field_l).append(40);
        var8 = var7;
        var5 = 0;
        L0: while (true) {
          if (((ela) this).field_n.length <= var5) {
            L1: {
              StringBuilder discarded$74 = var8.append(41);
              if (param2 == null) {
                break L1;
              } else {
                StringBuilder discarded$75 = var8.append("     <col=ffaaff>" + param2 + "</col>");
                break L1;
              }
            }
            ((ela) this).field_k = var8.toString();
          } else {
            StringBuilder discarded$76 = var7.append(rva.a(((ela) this).field_n[var5], (byte) -102));
            if (var5 < -1 + ((ela) this).field_n.length) {
              StringBuilder discarded$77 = var8.append(", ");
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Welcome to your DOOM!";
    }
}
