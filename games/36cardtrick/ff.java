/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static int field_b;
    static long field_a;

    abstract void a(int param0, pb param1);

    abstract fe a(byte param0);

    final static qa[] a(int param0) {
        if (param0 != -21739) {
            field_a = 28L;
        }
        return new qa[]{ke.field_c, oj.field_e, bf.field_c};
    }

    final static void b(int param0) {
        if (param0 > -76) {
            field_b = -43;
        }
        String var2 = (String) null;
        uk.a(lh.field_c, -23804, (String) null);
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        if (param1 != null) {
          var2 = 0;
          var3 = ((CharSequence) param1).length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!tg.a((byte) -63, ((CharSequence) param1).charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!tg.a((byte) -63, ((CharSequence) param1).charAt(var3 - 1))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              L4: {
                if (param0 == 116) {
                  break L4;
                } else {
                  ff.b(-19);
                  break L4;
                }
              }
              var4 = -var2 + var3;
              if (var4 >= 1) {
                if (12 >= var4) {
                  var5 = new StringBuilder(var4);
                  var6 = var2;
                  L5: while (true) {
                    if (var6 >= var3) {
                      if (var5.length() != 0) {
                        return var5.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var7 = ((CharSequence) param1).charAt(var6);
                      if (rf.a((char) var7, 0)) {
                        var8 = r.a(-219, (char) var7);
                        if (var8 != 0) {
                          StringBuilder discarded$1 = var5.append(var8);
                          var6++;
                          continue L5;
                        } else {
                          var6++;
                          continue L5;
                        }
                      } else {
                        var6++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
