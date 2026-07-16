/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    final static eg a(int param0) {
        if (null == kj.field_c) {
            kj.field_c = new eg(sl.field_q, 20, 0, 0, 0, 11579568, -1, 0, 0, sl.field_q.field_I, -1, 2147483647, true);
        }
        if (param0 != 0) {
            return null;
        }
        return kj.field_c;
    }

    final static String a(byte param0, String param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if (0 > var6_int) {
            if (param0 < -70) {
              var6 = new StringBuilder(var4);
              var7 = 0;
              var5 = 0;
              L1: while (true) {
                var8 = param1.indexOf("<%", var5);
                if (-1 < (var8 ^ -1)) {
                  StringBuilder discarded$3 = var6.append(param1.substring(var7));
                  return var6.toString();
                } else {
                  var5 = var8 + 2;
                  L2: while (true) {
                    L3: {
                      if (var5 >= var3) {
                        break L3;
                      } else {
                        if (!g.a(param1.charAt(var5), (byte) -68)) {
                          break L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                    var9 = param1.substring(var8 + 2, var5);
                    if (!oi.a(-19804, (CharSequence) (Object) var9)) {
                      continue L1;
                    } else {
                      if (var5 >= var3) {
                        continue L1;
                      } else {
                        if (param1.charAt(var5) == 62) {
                          var5++;
                          var10 = md.a((CharSequence) (Object) var9, true);
                          StringBuilder discarded$4 = var6.append(param1.substring(var7, var8));
                          var7 = var5;
                          StringBuilder discarded$5 = var6.append(param2[var10]);
                          continue L1;
                        } else {
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var5 = var6_int + 2;
            L4: while (true) {
              L5: {
                if (var3 <= var5) {
                  break L5;
                } else {
                  if (!g.a(param1.charAt(var5), (byte) -68)) {
                    break L5;
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (oi.a(-19804, (CharSequence) (Object) var7_ref_String)) {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param1.charAt(var5) == 62) {
                    var5++;
                    var8 = md.a((CharSequence) (Object) var7_ref_String, true);
                    var4 = var4 + (param2[var8].length() + -var5 + var6_int);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        }
    }

    static {
    }
}
