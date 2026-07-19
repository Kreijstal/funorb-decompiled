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
        me discarded$1 = null;
        me var3 = null;
        byte[] var4 = null;
        me var5 = null;
        var3 = (me) (this.field_g.a((long)param1, 0));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            L1: {
              if (32768 > param1) {
                break L1;
              } else {
                var4 = this.field_b.a(1, param0 ^ -48, 32767 & param1);
                if (!Lexicominos.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_d.a(1, -27493, param1);
            break L0;
          }
          var5 = new me();
          if (param0 == 27467) {
            if (var4 != null) {
              L2: {
                var5.a(new wf(var4), 0);
                if ((param1 ^ -1) <= -32769) {
                  var5.d((byte) -80);
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_g.a(var5, -25253, (long)param1);
              return var5;
            } else {
              L3: {
                if ((param1 ^ -1) <= -32769) {
                  var5.d((byte) -80);
                  break L3;
                } else {
                  break L3;
                }
              }
              this.field_g.a(var5, -25253, (long)param1);
              return var5;
            }
          } else {
            discarded$1 = this.a(-98, 88);
            if (var4 == null) {
              L4: {
                if ((param1 ^ -1) <= -32769) {
                  var5.d((byte) -80);
                  break L4;
                } else {
                  break L4;
                }
              }
              this.field_g.a(var5, -25253, (long)param1);
              return var5;
            } else {
              L5: {
                var5.a(new wf(var4), 0);
                if ((param1 ^ -1) <= -32769) {
                  var5.d((byte) -80);
                  break L5;
                } else {
                  break L5;
                }
              }
              this.field_g.a(var5, -25253, (long)param1);
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
        field_c = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_a = new tf();
        field_e = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
