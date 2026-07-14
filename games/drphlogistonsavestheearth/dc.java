/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc implements qi {
    static String field_b;
    private long field_d;
    static int field_e;
    static String field_f;
    static volatile long field_c;
    static nh field_a;
    static String field_g;

    final static void a(bl param0, int param1, boolean param2, ug param3, byte param4, java.awt.Component param5) {
        if (param4 > -91) {
          field_b = null;
          id.a(param1, param2, 10);
          el.field_sb = id.a(param0, param5, 0, 22050);
          k.field_J = id.a(param0, param5, 1, 1024);
          ej.field_a = new ec();
          k.field_J.a((ic) (Object) ej.field_a);
          s.field_a = param3;
          param3.a(oa.field_b * 128 / 80, (byte) -13);
          el.field_sb.a((ic) (Object) param3);
          return;
        } else {
          id.a(param1, param2, 10);
          el.field_sb = id.a(param0, param5, 0, 22050);
          k.field_J = id.a(param0, param5, 1, 1024);
          ej.field_a = new ec();
          k.field_J.a((ic) (Object) ej.field_a);
          s.field_a = param3;
          param3.a(oa.field_b * 128 / 80, (byte) -13);
          el.field_sb.a((ic) (Object) param3);
          return;
        }
    }

    abstract vh c(byte param0);

    public final vh a(int param0) {
        if (((dc) this).a(false)) {
            return pi.field_P;
        }
        if (param0 != -12317) {
            field_e = -119;
            if (!(((dc) this).field_d + 350L <= la.a(false))) {
                return ai.field_A;
            }
            return ((dc) this).c((byte) -98);
        }
        if (!(((dc) this).field_d + 350L <= la.a(false))) {
            return ai.field_A;
        }
        return ((dc) this).c((byte) -98);
    }

    public final String b(int param0) {
        if (!((dc) this).a(false)) {
          if (param0 == -16034) {
            if (((dc) this).field_d + 350L > la.a(false)) {
              return null;
            } else {
              return ((dc) this).b((byte) -66);
            }
          } else {
            vh discarded$6 = ((dc) this).a(8);
            if (((dc) this).field_d + 350L > la.a(false)) {
              return null;
            } else {
              return ((dc) this).b((byte) -66);
            }
          }
        } else {
          return null;
        }
    }

    abstract String b(byte param0);

    final static void a(boolean param0, int param1, String param2, rf param3, mi param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var5 = 0;
        var6 = -1;
        if (param0) {
          var10 = null;
          dc.a(false, 13, (String) null, (rf) null, (mi) null);
          var7 = 1;
          L0: while (true) {
            if (param2.length() <= var7) {
              return;
            } else {
              L1: {
                var8 = param2.charAt(var7);
                if (var8 != 60) {
                  break L1;
                } else {
                  var6 = param4.field_a[0] + ((var5 >> -75123224) - -param3.b(param2.substring(0, var7)));
                  break L1;
                }
              }
              L2: {
                if (0 == (var6 ^ -1)) {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param1;
                      break L3;
                    }
                  }
                  param4.field_a[var7] = param4.field_a[0] + (var5 >> 530696776) - (-param3.b(param2.substring(0, 1 + var7)) - -param3.a((char) var8));
                  break L2;
                } else {
                  param4.field_a[var7] = var6;
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                var7++;
                continue L0;
              } else {
                var7++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          L4: {
            var7 = 1;
            if (param2.length() <= var7) {
              break L4;
            } else {
              L5: {
                var8 = param2.charAt(var7);
                if (var8 != 60) {
                  break L5;
                } else {
                  var6 = param4.field_a[0] + ((var5 >> -75123224) - -param3.b(param2.substring(0, var7)));
                  break L5;
                }
              }
              L6: {
                if (0 == (var6 ^ -1)) {
                  L7: {
                    if (var8 != 32) {
                      break L7;
                    } else {
                      var5 = var5 + param1;
                      break L7;
                    }
                  }
                  param4.field_a[var7] = param4.field_a[0] + (var5 >> 530696776) - (-param3.b(param2.substring(0, 1 + var7)) - -param3.a((char) var8));
                  break L6;
                } else {
                  param4.field_a[var7] = var6;
                  break L6;
                }
              }
              L8: {
                if (var8 != 62) {
                  var7++;
                  break L8;
                } else {
                  var6 = -1;
                  var7++;
                  break L8;
                }
              }
              var7++;
              var7++;
              break L4;
            }
          }
          return;
        }
    }

    public static void c(int param0) {
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0 <= 5) {
            Object var2 = null;
            dc.a(false, 91, (String) null, (rf) null, (mi) null);
        }
    }

    public final void a(byte param0) {
        ((dc) this).field_d = la.a(false);
        if (param0 != 87) {
            Object var3 = null;
            dc.a(true, 28, (String) null, (rf) null, (mi) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "OK";
        field_c = 0L;
        field_g = "Updates will sent to the email address you've given";
    }
}
