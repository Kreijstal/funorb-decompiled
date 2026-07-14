/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends si {
    byte[] field_w;
    static String field_x;
    int field_A;
    static String field_y;
    dl field_z;

    public static void f(byte param0) {
        field_x = null;
        field_y = null;
        if (param0 != -12) {
            Object var2 = null;
            String discarded$0 = fj.a((CharSequence) null, 26, true);
        }
    }

    final static void a(int param0, mc param1, boolean param2) {
        th var3 = null;
        var3 = ed.field_q;
        var3.h(param0, 0);
        var3.c(2, -1);
        if (param2) {
          return;
        } else {
          var3.c(0, -1);
          var3.c(param1.field_j, -1);
          return;
        }
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (param0 != null) {
          var3 = param0.length();
          if (param1 == 100) {
            if ((var3 ^ -1) <= -2) {
              if ((var3 ^ -1) >= -13) {
                L0: {
                  var4 = ck.a(param0, (byte) -48);
                  if (var4 == null) {
                    break L0;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L0;
                    } else {
                      if (cf.a(var4.charAt(0), (byte) 78)) {
                        return ac.field_a;
                      } else {
                        if (!cf.a(var4.charAt(-1 + var4.length()), (byte) 78)) {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param0.length() <= var6) {
                              if (-1 < var5) {
                                return ac.field_a;
                              } else {
                                return null;
                              }
                            } else {
                              L2: {
                                var7 = param0.charAt(var6);
                                if (!cf.a((char) var7, (byte) 78)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if (-3 < var5) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param2) {
                                  return rg.field_a;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        } else {
                          return ac.field_a;
                        }
                      }
                    }
                  }
                }
                return wh.field_a;
              } else {
                return wh.field_a;
              }
            } else {
              return wh.field_a;
            }
          } else {
            return null;
          }
        } else {
          return wh.field_a;
        }
    }

    final byte[] d(byte param0) {
        int var2 = -4 % ((2 - param0) / 38);
        if (!(!((fj) this).field_v)) {
            throw new RuntimeException();
        }
        return ((fj) this).field_w;
    }

    final int c(byte param0) {
        if (param0 != 16) {
            fj.f((byte) 77);
            if (!(!((fj) this).field_v)) {
                return 0;
            }
            return 100;
        }
        if (!(!((fj) this).field_v)) {
            return 0;
        }
        return 100;
    }

    final static kb a(String param0, String param1, boolean param2, int param3) {
        CharSequence var8 = null;
        long var4 = 0L;
        int var7 = -46 / ((26 - param3) / 36);
        String var6 = null;
        if ((param1.indexOf('@') ^ -1) != 0) {
            var6 = param1;
        } else {
            var8 = (CharSequence) (Object) param1;
            var4 = fd.a((byte) -58, var8);
        }
        return ef.a(var4, -27981, var6, param2, param0);
    }

    fj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Email is valid";
        field_y = "Waiting for music";
    }
}
