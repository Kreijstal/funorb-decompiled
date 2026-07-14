/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static int field_g;
    static byte[] field_f;
    static String field_c;
    static int field_e;
    static String field_a;
    static int field_b;
    static String field_d;

    final static void a(sq param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lm var9 = null;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        String[] var13 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        te.field_c = 0;
        if (param0 != null) {
          L0: {
            var2 = rs.field_Cb.field_J + rs.field_Cb.field_q;
            var3 = -6 + param0.field_j + -20;
            var4 = uq.field_m.a(5607, param0.field_c);
            var12 = vi.a((nq) (Object) rs.field_Cb, (byte) 109, var4, new int[1]);
            var6 = var12.length;
            ra.a(-106);
            if (0 >= var6) {
              eh.field_L = null;
              break L0;
            } else {
              eh.field_L = new bi[var6];
              eh.field_L[0] = new bi(var3, var2);
              eh.field_L[0].e();
              rs.field_Cb.d(var12[0], 0, rs.field_Cb.field_J, 16777215, -1);
              var7 = 1;
              L1: while (true) {
                if (var7 >= var6) {
                  break L0;
                } else {
                  eh.field_L[var7] = new bi(var3, var2);
                  eh.field_L[var7].e();
                  rs.field_Cb.d(var12[var7], 0, rs.field_Cb.field_J, 16777215, -1);
                  var7++;
                  continue L1;
                }
              }
            }
          }
          if (param1 == -1) {
            L2: {
              if (param0.field_f == null) {
                rg.field_f = null;
                oi.field_i = null;
                sp.field_m = null;
                break L2;
              } else {
                var7 = param0.field_f.length;
                rg.field_f = new int[var7];
                sp.field_m = new bi[var7][];
                oi.field_i = new bi[var7][];
                var8 = 0;
                L3: while (true) {
                  if (var7 <= var8) {
                    break L2;
                  } else {
                    var9 = param0.field_f[var8];
                    var4 = uq.field_m.a(5607, var9.field_b);
                    var13 = vi.a((nq) (Object) rs.field_Cb, (byte) 121, var4, new int[1]);
                    var6 = var13.length;
                    oi.field_i[var8] = new bi[var6];
                    sp.field_m[var8] = new bi[var6];
                    var10 = 0;
                    L4: while (true) {
                      if (var10 >= var6) {
                        var8++;
                        continue L3;
                      } else {
                        oi.field_i[var8][var10] = new bi(var3, var2);
                        oi.field_i[var8][var10].e();
                        rs.field_Cb.d(var13[var10], 0, rs.field_Cb.field_J, 16777215, -1);
                        sp.field_m[var8][var10] = oi.field_i[var8][var10].g();
                        sp.field_m[var8][var10].e();
                        gf.b(1, 1, 0, 0, var3, var2);
                        var10++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            cg.i(0);
            return;
          } else {
            return;
          }
        } else {
          sp.field_m = null;
          eh.field_L = null;
          oi.field_i = null;
          rg.field_f = null;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -20) {
            qj.a((byte) 115);
        }
        field_d = null;
        field_a = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(boolean param0, CharSequence param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = param2.length();
        var4 = param1.length();
        if (var4 <= var3) {
          L0: {
            var5 = 0;
            if (param0) {
              break L0;
            } else {
              var9 = null;
              boolean discarded$2 = qj.a(true, (CharSequence) null, (CharSequence) null);
              break L0;
            }
          }
          L1: while (true) {
            if (var5 >= var4) {
              return true;
            } else {
              var6 = param2.charAt(var5);
              var7 = param1.charAt(var5);
              if (var7 != var6) {
                if (Character.toLowerCase((char) var6) != Character.toLowerCase((char) var7)) {
                  if (Character.toUpperCase((char) var6) != Character.toUpperCase((char) var7)) {
                    return false;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void b(byte param0) {
        int var1 = -31 / ((param0 - -8) / 53);
    }

    final static void a(byte param0, int param1) {
        if (param0 != -127) {
            return;
        }
        cr.field_b = param1;
    }

    final static qa a(byte param0, dc param1, ob param2) {
        if (param0 >= -63) {
            qj.a((byte) 55);
        }
        ln var3 = mg.a(param1, param2, 20);
        int var4 = param2.f(-20976);
        return new qa(var3, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_c = "Click or press F10 to open Quick Chat";
        field_a = "Encouraging rule breaking";
        field_d = "Our territory is currently short of <%0>, so to build more fleets we should concentrate on acquiring ";
    }
}
