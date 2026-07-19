/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_c;
    static vc field_e;
    static String field_a;
    static int field_b;
    static int[] field_d;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ih var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        hi var11 = null;
        ih var12 = null;
        ia var13 = null;
        int[] var14 = null;
        ia var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = ae.field_a;
              if (param0 == -36) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = var12.e(false);
                if (var2 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (-2 != (var2 ^ -1)) {
                      break L4;
                    } else {
                      var11 = (hi) ((Object) bf.field_e.c((byte) 47));
                      if (var11 != null) {
                        var11.c(-1);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        k.c(param0 ^ 28386);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L5: {
                    if (-3 != (var2 ^ -1)) {
                      break L5;
                    } else {
                      var13 = (ia) ((Object) rj.field_i.c((byte) 47));
                      if (var13 == null) {
                        k.c(-28354);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var13.field_i = h.a((byte) -121);
                        var13.field_n = true;
                        var13.field_k = var13.field_i[0];
                        var13.c(-1);
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  ud.a("A1: " + ak.a(true), (Throwable) null, 0);
                  k.c(-28354);
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var16 = h.a((byte) -112);
              var14 = var16;
              var3 = var14;
              var10 = var3;
              var4 = var10;
              var5 = var12;
              var6 = ((ni) ((Object) var5)).e(false);
              var7 = 0;
              L6: while (true) {
                if (var6 <= var7) {
                  var15 = (ia) ((Object) rj.field_i.c((byte) 47));
                  if (var15 == null) {
                    k.c(-28354);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var15.field_n = true;
                    var15.field_k = var16[0];
                    var15.field_i = var3;
                    var15.c(-1);
                    break L2;
                  }
                } else {
                  var10[var7] = ((ni) ((Object) var5)).c((byte) -114);
                  var7++;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L6;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "cl.A(" + param0 + ')');
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

    public static void a(int param0) {
        if (param0 != -2) {
          cl.a((byte) -43);
          field_d = null;
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        field_c = "They cannot be directly removed, so be careful where you put them!";
        field_d = new int[40];
        field_b = -1;
    }
}
