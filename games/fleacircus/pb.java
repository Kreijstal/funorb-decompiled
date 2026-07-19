/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static vc field_f;
    static String field_b;
    static String field_h;
    static fa field_e;
    static rh field_a;
    static int field_i;
    static int field_d;
    static dd field_g;
    static dd field_c;

    final static void a(int param0, int param1) {
        bh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ll var4 = null;
        bh stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_5_0 = null;
        lh stackOut_7_0 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var2 = (bh) ((Object) wi.field_j.c((byte) 47));
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    s.a(param1 ^ -4471, param0, var2);
                    stackOut_5_0 = (bh) ((Object) wi.field_j.b((byte) -105));
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      var2 = stackIn_6_0;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_7_0 = jj.field_S.c((byte) 47);
                stackIn_8_0 = stackOut_7_0;
                break L3;
              }
              var4 = (ll) ((Object) stackIn_8_0);
              L5: while (true) {
                if (var4 == null) {
                  break L0;
                } else {
                  ak.a(-14722, var4, param0);
                  var4 = (ll) ((Object) jj.field_S.b((byte) -105));
                  if (var3 == 0) {
                    continue L5;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "pb.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = ed.field_c[0];
            if (param0 > 42) {
              var2 = 1;
              L1: while (true) {
                if (ed.field_c.length <= var2) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = ed.field_c[var2];
                  dm.a(pk.field_J, var2 << 800311396, pk.field_J, var1_int, var3);
                  var1_int = var1_int + var3;
                  var2++;
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "pb.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        field_h = null;
        field_g = null;
        field_e = null;
        field_c = null;
        if (param0 >= -80) {
            field_c = (dd) null;
        }
    }

    static {
        field_b = "Creating your account";
        field_d = 0;
        field_h = "Tiles you can place";
        field_i = 100;
        field_f = new vc();
    }
}
