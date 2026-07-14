/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class isa extends rqa {
    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        jj.field_p = param0[0].d(0);
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((isa) this).a((nc[]) null, -2);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static String a(String param0, String[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (0 <= var6_int) {
            var5 = var6_int + 2;
            L1: while (true) {
              L2: {
                if (var3 <= var5) {
                  break L2;
                } else {
                  if (!haa.a(param0.charAt(var5), true)) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param0.substring(2 + var6_int, var5);
              if (!hwa.a((CharSequence) (Object) var7_ref, 10)) {
                continue L0;
              } else {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = lob.a(24, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (param1[var8].length() + -var5 - -var6_int);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            }
          } else {
            if (param2 <= 71) {
              return null;
            } else {
              var6 = new StringBuilder(var4);
              var7 = 0;
              var5 = 0;
              L3: while (true) {
                var8 = param0.indexOf("<%", var5);
                if (var8 >= 0) {
                  var5 = var8 + 2;
                  L4: while (true) {
                    L5: {
                      if (var3 <= var5) {
                        break L5;
                      } else {
                        if (!haa.a(param0.charAt(var5), true)) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    var9 = param0.substring(var8 - -2, var5);
                    if (!hwa.a((CharSequence) (Object) var9, 10)) {
                      continue L3;
                    } else {
                      if (var3 <= var5) {
                        continue L3;
                      } else {
                        if (62 == param0.charAt(var5)) {
                          var5++;
                          var10 = lob.a(-88, (CharSequence) (Object) var9);
                          StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                          var7 = var5;
                          StringBuilder discarded$4 = var6.append(param1[var10]);
                          continue L3;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  StringBuilder discarded$5 = var6.append(param0.substring(var7));
                  return var6.toString();
                }
              }
            }
          }
        }
    }

    isa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
