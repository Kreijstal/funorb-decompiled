/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends bd {
    static at field_u;
    static kl field_w;
    static String field_D;
    static int field_E;
    private int field_t;
    static je field_y;
    static sa field_z;
    private int field_C;
    private int field_G;
    static String field_A;
    static String field_v;
    private int field_B;
    static String field_F;
    static int field_s;
    static int field_x;

    final void a(int param0, ha param1) {
        ((be) this).field_C = param1.a(bw.field_m[((be) this).field_t][1], ((be) this).field_B, ((be) this).field_G, 0, ((be) this).field_m, bw.field_m[((be) this).field_t][2]);
        if (param0 != 64) {
            Object var4 = null;
            String discarded$0 = be.a(-2, (CharSequence) null, false);
        }
        param1.field_l.a((byte) -119, (tc) (Object) new mb(((be) this).field_t, ((be) this).field_G, ((be) this).field_B, ((be) this).field_C, ((be) this).field_m));
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == null) {
          return pu.field_G;
        } else {
          L0: {
            var3 = param1.length();
            if (var3 < 1) {
              break L0;
            } else {
              if (var3 > 12) {
                break L0;
              } else {
                L1: {
                  var4 = k.a(param1, false);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (var4.length() < 1) {
                      break L1;
                    } else {
                      L2: {
                        if (rs.a(var4.charAt(0), (byte) -122)) {
                          break L2;
                        } else {
                          if (!rs.a(var4.charAt(-1 + var4.length()), (byte) -107)) {
                            if (param0 < -22) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if (0 < var5) {
                                    return kd.field_U;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (rs.a((char) var7, (byte) -88)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if ((var5 ^ -1) <= -3) {
                                    if (!param2) {
                                      return ul.field_o;
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
                              return null;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return kd.field_U;
                    }
                  }
                }
                return pu.field_G;
              }
            }
          }
          return pu.field_G;
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_u = null;
        field_w = null;
        field_y = null;
        if (param0 < 61) {
            field_v = null;
        }
        field_F = null;
        field_D = null;
        field_v = null;
        field_z = null;
    }

    be(int param0, int param1, int param2, int param3, int param4) {
        ((be) this).field_B = param1;
        ((be) this).field_G = param0;
        ((be) this).field_t = param2;
        ((be) this).field_m = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Please try again in a few minutes.";
        field_A = "Ongoing Mission";
        field_v = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_E = 0;
        field_z = new sa();
        field_x = 77;
        field_F = "Choose three alignments";
    }
}
