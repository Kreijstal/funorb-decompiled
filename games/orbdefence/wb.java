/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb implements ga {
    static String field_c;
    static int field_d;
    static ki field_b;
    private long field_a;

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          var2 = param0.length();
          if (20 < var2) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            if (param1 != 122) {
              field_b = null;
              return new String(var8);
            } else {
              return new String(var8);
            }
          } else {
            L2: {
              var5 = param0.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (var5 > 90) {
                  break L2;
                } else {
                  var3[var4] = (char)(32 + var5);
                  var4++;
                  var4++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (122 >= var5) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var5 < 48) {
                  break L5;
                } else {
                  if (var5 > 57) {
                    break L5;
                  } else {
                    break L3;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            var4++;
            continue L1;
          }
        }
    }

    abstract qd a(byte param0);

    final static String a(CharSequence[] param0, byte param1) {
        if (param1 != -123) {
            return null;
        }
        return vi.a(param0, 0, param0.length, 0);
    }

    public static void f(int param0) {
        field_c = null;
        if (param0 != 7312) {
            return;
        }
        field_b = null;
    }

    public final String a(int param0) {
        if (!((wb) this).c(25296)) {
          if ((350L + ((wb) this).field_a ^ -1L) >= (ji.b(123) ^ -1L)) {
            if (param0 <= 121) {
              field_c = null;
              return ((wb) this).e(-45);
            } else {
              return ((wb) this).e(-45);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String e(int param0);

    public final qd d(int param0) {
        if (((wb) this).c(25296)) {
          return fm.field_a;
        } else {
          if ((350L + ((wb) this).field_a ^ -1L) >= (ji.b(-84) ^ -1L)) {
            if (param0 != -7847) {
              return null;
            } else {
              return ((wb) this).a((byte) 75);
            }
          } else {
            return ml.field_a;
          }
        }
    }

    public final void b(int param0) {
        ((wb) this).field_a = ji.b(param0 + 21066);
        if (param0 != -20959) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email is valid";
    }
}
