/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rqa extends fh {
    String field_l;
    String field_k;
    Class[] field_n;
    static int[] field_m;

    public static void a(boolean param0) {
        field_m = null;
        if (!param0) {
            field_m = null;
        }
    }

    public final String toString() {
        return ((rqa) this).field_l;
    }

    final boolean a(boolean param0, String param1, nc[] param2) {
        int var4 = 0;
        Class var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (!((rqa) this).field_k.equals((Object) (Object) param1)) {
          return false;
        } else {
          if (param2.length == ((rqa) this).field_n.length) {
            L0: {
              if (param0) {
                break L0;
              } else {
                field_m = null;
                break L0;
              }
            }
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((rqa) this).field_n.length) {
                return true;
              } else {
                if (param2[var4].field_a) {
                  L2: {
                    var5 = sna.a(param2[var4].field_b, (byte) 124);
                    if (var5 != Boolean.TYPE) {
                      break L2;
                    } else {
                      if (((rqa) this).field_n[var4] != Boolean.TYPE) {
                        return false;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (var5 != Character.TYPE) {
                      break L3;
                    } else {
                      if (((rqa) this).field_n[var4] == Character.TYPE) {
                        break L3;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (ke.a(var5, 24145)) {
                    if (!ke.a(((rqa) this).field_n[var4], 24145)) {
                      return false;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  if (!((rqa) this).field_n[var4].isInstance(param2[var4].field_b)) {
                    return false;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    rqa(String param0, Class[] param1, String param2) {
        int var5 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        ((rqa) this).field_k = param0;
        ((rqa) this).field_n = param1;
        var7 = new StringBuilder(((rqa) this).field_k).append(40);
        var8 = var7;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((rqa) this).field_n.length) {
            L1: {
              StringBuilder discarded$74 = var8.append(41);
              if (param2 == null) {
                break L1;
              } else {
                StringBuilder discarded$75 = var8.append("     <col=ffaaff>" + param2 + "</col>");
                break L1;
              }
            }
            ((rqa) this).field_l = var8.toString();
          } else {
            StringBuilder discarded$76 = var7.append(wp.a(((rqa) this).field_n[var5], false));
            if (var5 < -1 + ((rqa) this).field_n.length) {
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

    abstract nc a(nc[] param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[5];
    }
}
