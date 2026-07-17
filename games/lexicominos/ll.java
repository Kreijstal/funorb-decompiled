/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    private sh field_d;
    private bf field_g;
    static tf field_a;
    static int field_f;
    private sh field_b;
    static String[] field_c;
    static String[] field_e;

    final me a(int param0, int param1) {
        me var3 = null;
        byte[] var4 = null;
        me var5 = null;
        var3 = (me) ((ll) this).field_g.a((long)param1, 0);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (32768 > param1) {
              var4 = ((ll) this).field_d.a(1, -27493, param1);
              break L0;
            } else {
              var4 = ((ll) this).field_b.a(1, param0 ^ -48, 32767 & param1);
              break L0;
            }
          }
          var5 = new me();
          if (param0 == 27467) {
            if (var4 != null) {
              L1: {
                var5.a(new wf(var4), 0);
                if (param1 >= 32768) {
                  var5.d((byte) -80);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ll) this).field_g.a((Object) (Object) var5, -25253, (long)param1);
              return var5;
            } else {
              L2: {
                if (param1 >= 32768) {
                  var5.d((byte) -80);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((ll) this).field_g.a((Object) (Object) var5, -25253, (long)param1);
              return var5;
            }
          } else {
            me discarded$1 = ((ll) this).a(-98, 88);
            if (var4 == null) {
              L3: {
                if (param1 >= 32768) {
                  var5.d((byte) -80);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((ll) this).field_g.a((Object) (Object) var5, -25253, (long)param1);
              return var5;
            } else {
              L4: {
                var5.a(new wf(var4), 0);
                if (param1 >= 32768) {
                  var5.d((byte) -80);
                  break L4;
                } else {
                  break L4;
                }
              }
              ((ll) this).field_g.a((Object) (Object) var5, -25253, (long)param1);
              return var5;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 114) {
            ll.a((byte) -124);
            field_c = null;
            field_e = null;
            return;
        }
        field_c = null;
        field_e = null;
    }

    private ll() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_a = new tf();
        field_e = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
