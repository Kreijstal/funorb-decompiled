/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends ff {
    private String field_d;
    static int field_h;
    static bk field_e;
    private String field_f;
    static long field_c;
    static de field_g;

    public static void c(byte param0) {
        field_e = null;
        if (param0 < 123) {
            return;
        }
        field_g = null;
    }

    final void a(int param0, pb param1) {
        if (param0 != -1) {
            field_e = null;
        }
        param1.a(744825352, ((jl) this).field_f);
        param1.b(((jl) this).field_d, 15045);
    }

    final static void b(byte param0) {
        if (param0 != 22) {
            return;
        }
        if (null != wd.field_e) {
            wd.field_e.c();
        }
        if (!(null == cb.field_g)) {
            cb.field_g.c();
        }
    }

    final fe a(byte param0) {
        if (param0 != -24) {
            ((jl) this).field_d = null;
        }
        return tf.field_o;
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Main.field_T;
        if (param1 != null) {
          L0: {
            var3 = param1.length();
            if (1 > var3) {
              break L0;
            } else {
              if (12 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = ff.a((byte) 116, param1);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (-2 >= (var4.length() ^ -1)) {
                      L2: {
                        if (tg.a((byte) -63, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (tg.a((byte) -63, var4.charAt(var4.length() + -1))) {
                            break L2;
                          } else {
                            L3: {
                              var5 = 0;
                              if (!param0) {
                                break L3;
                              } else {
                                jl.c((byte) 94);
                                break L3;
                              }
                            }
                            var6 = 0;
                            L4: while (true) {
                              if (var6 >= param1.length()) {
                                if (0 < var5) {
                                  return kl.field_P;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param1.charAt(var6);
                                  if (!tg.a((byte) -63, (char) var7)) {
                                    var5 = 0;
                                    break L5;
                                  } else {
                                    var5++;
                                    break L5;
                                  }
                                }
                                if (2 <= var5) {
                                  if (!param2) {
                                    return g.field_B;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return kl.field_P;
                    } else {
                      break L1;
                    }
                  }
                }
                return ke.field_b;
              }
            }
          }
          return ke.field_b;
        } else {
          return ke.field_b;
        }
    }

    jl(String param0, String param1) {
        ((jl) this).field_d = param1;
        ((jl) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20971555;
        field_g = new de(15, 0, 1, 0);
    }
}
