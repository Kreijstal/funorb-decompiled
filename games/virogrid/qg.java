/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends l {
    static String field_s;
    int[] field_p;
    int field_q;
    static wg field_l;
    int field_k;
    int field_v;
    static String field_m;
    int field_t;
    static ul field_r;
    int field_i;
    static mg[] field_j;
    int field_o;
    static int field_n;
    static mg field_u;
    static il field_h;
    static int field_w;
    static int field_g;

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        CharSequence var31 = null;
        var16 = null;
        var17 = null;
        var18 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        if (he.field_Xb != null) {
          var3 = he.field_Xb.b(param1, param0 ^ -29471);
          if (0 != var3) {
            L0: {
              if (var3 != 2) {
                break L0;
              } else {
                if (he.field_Xb.field_V == null) {
                  break L0;
                } else {
                  if (!he.field_Xb.field_V.equals((Object) (Object) "")) {
                    L1: {
                      if (he.field_Xb.field_V.charAt(0) != 91) {
                        var31 = (CharSequence) (Object) he.field_Xb.field_V;
                        var4 = c.a(var31, true);
                        break L1;
                      } else {
                        var4 = he.field_Xb.field_V;
                        break L1;
                      }
                    }
                    L2: {
                      var5 = null;
                      if (0 == ge.field_d) {
                        var5 = (Object) (Object) ab.a((byte) 73, var4, param2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (ge.field_d == 1) {
                        var5 = (Object) (Object) og.a(var4, true, param2);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (ge.field_d == 2) {
                        var5 = (Object) (Object) g.a(var4, -128, param2);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (ge.field_d != 3) {
                        break L5;
                      } else {
                        var5 = (Object) (Object) og.a(var4, param2, (byte) 60, var4);
                        break L5;
                      }
                    }
                    if (var5 == null) {
                      break L0;
                    } else {
                      var6 = null;
                      gf.a(var4, 0, false, (String) var5, 2, (String) null);
                      he.field_Xb = null;
                      ge.field_d = -1;
                      if (param0 == 7377) {
                        return;
                      } else {
                        qg.a(119);
                        return;
                      }
                    }
                  } else {
                    he.field_Xb = null;
                    ge.field_d = -1;
                    if (param0 == 7377) {
                      return;
                    } else {
                      qg.a(119);
                      return;
                    }
                  }
                }
              }
            }
            he.field_Xb = null;
            ge.field_d = -1;
            if (param0 == 7377) {
              return;
            } else {
              qg.a(119);
              return;
            }
          } else {
            if (param0 != 7377) {
              qg.a(119);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 7377) {
            qg.a(119);
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_u = null;
        field_s = null;
        field_l = null;
        field_j = null;
        field_m = null;
        if (param0 < 104) {
          field_j = null;
          field_r = null;
          return;
        } else {
          field_r = null;
          return;
        }
    }

    qg() {
    }

    final void a(int[] param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        try {
            ((qg) this).field_q = param4;
            ((qg) this).field_p = param0;
            ((qg) this).field_v = param5;
            ((qg) this).field_o = param1;
            ((qg) this).field_i = param2;
            ((qg) this).field_t = param7;
            if (param3 != -45) {
                ((qg) this).field_k = 79;
            }
            ((qg) this).field_k = param6;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qg.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Orb points: ";
        field_s = "No players";
        field_r = new ul(3);
    }
}
