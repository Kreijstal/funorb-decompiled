/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ra implements dm {
    private long field_a;
    static mn field_c;
    static mn field_d;
    static String field_b;

    public static void b(boolean param0) {
        if (!param0) {
            field_c = null;
        }
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final fi a(int param0) {
        if (!(!((ra) this).a(true))) {
            return gi.field_bb;
        }
        if (!((((ra) this).field_a + 350L ^ -1L) >= (ri.a(-3) ^ -1L))) {
            return ab.field_b;
        }
        if (param0 != -3621) {
            String discarded$0 = ((ra) this).b((byte) 22);
        }
        return ((ra) this).c(true);
    }

    public final String a(byte param0) {
        if (param0 < 65) {
            ((ra) this).field_a = -60L;
        }
        if (((ra) this).a(true)) {
            return null;
        }
        if ((ri.a(-3) ^ -1L) > (350L + ((ra) this).field_a ^ -1L)) {
            return null;
        }
        return ((ra) this).b((byte) 126);
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          var2 = 0L;
          var4 = param0.length();
          var5 = 0;
          if (param1 >= 115) {
            break L0;
          } else {
            var8 = null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (65 > var6) {
                    break L4;
                  } else {
                    if (var6 > 90) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(var6 + -64);
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (var6 <= 122) {
                      var2 = var2 + (long)(-97 + var6 + 1);
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(-21 - -var6);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (var2 >= 177917621779460413L) {
                break L2;
              } else {
                var5++;
                continue L1;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (0L != var2 % 37L) {
                break L7;
              } else {
                if (0L == var2) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    public final void b(int param0) {
        if (param0 > -46) {
            ((ra) this).field_a = -58L;
        }
        ((ra) this).field_a = ri.a(-3);
    }

    abstract fi c(boolean param0);

    abstract String b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new mn();
        field_d = new mn();
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
