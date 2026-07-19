/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static th field_d;
    static String field_a;
    static r field_f;
    static String field_b;
    static String field_c;
    static String field_e;

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -42) {
          field_d = (th) null;
          field_c = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_a = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0) {
        vi.b((byte) -45);
        if (param0 != 468713154) {
            le.a(-53);
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        be var4 = null;
        int var4_int = 0;
        ub var5_ref_ub = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        mi var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 < -80) {
              var9 = id.field_f;
              var2 = var9.h(-11);
              var3 = var9.h(-11);
              if (-1 == (var2 ^ -1)) {
                var4 = (be) ((Object) mb.field_v.a((byte) 100));
                if (var4 == null) {
                  rm.b((byte) -79);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    var5 = -var9.field_u + ca.field_b;
                    var11 = var4.field_o;
                    var10 = var11;
                    var6 = var10;
                    if (var11.length << -1390211198 >= var5) {
                      break L1;
                    } else {
                      var5 = var11.length << 1422332130;
                      break L1;
                    }
                  }
                  var7 = 0;
                  L2: while (true) {
                    if (var5 <= var7) {
                      var4.field_p = true;
                      var4.c(2);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var6[var7 >> 468713154] = var6[var7 >> 468713154] + (var9.h(-11) << b.a(768, var7 << -1580328664));
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                if ((var2 ^ -1) == -2) {
                  var4_int = var9.j(-3084);
                  var5_ref_ub = (ub) ((Object) ob.field_Q.a((byte) 100));
                  L3: while (true) {
                    L4: {
                      if (var5_ref_ub == null) {
                        break L4;
                      } else {
                        L5: {
                          if (var5_ref_ub.field_u != var3) {
                            break L5;
                          } else {
                            if (var4_int == var5_ref_ub.field_q) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_ub = (ub) ((Object) ob.field_Q.b(82));
                        continue L3;
                      }
                    }
                    if (var5_ref_ub == null) {
                      rm.b((byte) 83);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5_ref_ub.c(2);
                      return;
                    }
                  }
                } else {
                  ke.a((Throwable) null, "LR1: " + or.a(119), 0);
                  rm.b((byte) -30);
                  return;
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
          throw wn.a((Throwable) ((Object) var1), "le.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_a = "Target level:";
        field_c = "Email (Login):";
        field_b = "This game option is not available in rated games.";
        field_e = "Walk over the jetpack to pick it up. Press jump twice in quick succession to use it to fly high into the air! At the top of this level are some gluey blocks. While standing on these, you can't jump unless you use the second jetpack.";
    }
}
