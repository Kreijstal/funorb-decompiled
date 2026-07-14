/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rg {
    int field_b;
    String field_a;

    abstract java.net.Socket b(int param0) throws IOException;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != -5942) {
            return null;
        }
        return new java.net.Socket(((rg) this).field_a, ((rg) this).field_b);
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (param1 == null) {
          return ei.field_a;
        } else {
          L0: {
            var3 = param1.length();
            if (-2 < (var3 ^ -1)) {
              break L0;
            } else {
              if (var3 <= 12) {
                L1: {
                  var4 = ua.a(param2 ^ -47, param1);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (var4.length() >= 1) {
                      L2: {
                        if (sk.a(var4.charAt(0), -46)) {
                          break L2;
                        } else {
                          if (!sk.a(var4.charAt(-1 + var4.length()), -46)) {
                            var5 = param2;
                            var6 = 0;
                            L3: while (true) {
                              if (var6 >= param1.length()) {
                                if ((var5 ^ -1) < -1) {
                                  return rl.field_c;
                                } else {
                                  return null;
                                }
                              } else {
                                L4: {
                                  var7 = param1.charAt(var6);
                                  if (sk.a((char) var7, -46)) {
                                    var5++;
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                                if (var5 >= 2) {
                                  if (!param0) {
                                    return im.field_b;
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return rl.field_c;
                    } else {
                      break L1;
                    }
                  }
                }
                return ei.field_a;
              } else {
                break L0;
              }
            }
          }
          return ei.field_a;
        }
    }

    static {
    }
}
