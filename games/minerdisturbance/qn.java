/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends hc {
    private jm field_I;
    private int field_L;
    static int field_K;
    static ea field_J;

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = MinerDisturbance.field_ab;
        var4 = -1;
        if (param0 != -1648911295) {
          var7 = null;
          int discarded$1 = qn.a(74, 37, -101, (byte[]) null);
          var5 = param1;
          L0: while (true) {
            if (param2 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = ei.field_J[(var4 ^ param3[var5]) & 255] ^ var4 >>> 878015496;
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = param1;
          L1: while (true) {
            if (param2 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = ei.field_J[(var4 ^ param3[var5]) & 255] ^ var4 >>> 878015496;
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_J = null;
        int var1 = -113 / ((param0 - 5) / 34);
    }

    final String h(int param0) {
        if (param0 != -27867) {
            qn.a((byte) -1);
            if (!(!((qn) this).field_x)) {
                return ((qn) this).field_I.a(7320);
            }
            return null;
        }
        if (!(!((qn) this).field_x)) {
            return ((qn) this).field_I.a(7320);
        }
        return null;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        ((qn) this).field_L = ((qn) this).field_L + 1;
        if (param2 <= 49) {
          field_K = 44;
          super.a(param0, param1, (byte) 104, param3);
          return;
        } else {
          super.a(param0, param1, (byte) 104, param3);
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        ag var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ea var12 = null;
        ea var13 = null;
        ea var15 = null;
        ea var16 = null;
        var11 = MinerDisturbance.field_ab;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = (((qn) this).field_v >> -1082502463) + ((qn) this).field_u + param1;
          var6 = (((qn) this).field_q >> -1012669151) + (((qn) this).field_t + param2);
          var8 = ((qn) this).field_I.b(24595);
          if (nn.field_f != var8) {
            if (bm.field_o != var8) {
              if (var8 != fg.field_d) {
                if (var8 == sc.field_a) {
                  var12 = ed.field_g[1];
                  var12.g(-(var12.field_y >> 1754774945) + var5, var6 - (var12.field_C >> -442726015), 256);
                  return;
                } else {
                  return;
                }
              } else {
                var13 = ed.field_g[2];
                var13.g(-(var13.field_y >> -1648911295) + var5, -(var13.field_C >> -771876831) + var6, 256);
                return;
              }
            } else {
              var16 = ed.field_g[0];
              var9 = var16.field_x << -1475718015;
              var10 = var16.field_A << 1814602241;
              if (ha.field_d != null) {
                if (ha.field_d.field_y >= var9) {
                  if (ha.field_d.field_C < var10) {
                    ha.field_d = new ea(var9, var10);
                    vb.a(ha.field_d, 127);
                    var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
                    tk.b(true);
                    ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                    return;
                  } else {
                    vb.a(ha.field_d, 125);
                    eh.d();
                    var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
                    tk.b(true);
                    ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                    return;
                  }
                } else {
                  ha.field_d = new ea(var9, var10);
                  vb.a(ha.field_d, 127);
                  var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
                  tk.b(true);
                  ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                  return;
                }
              } else {
                ha.field_d = new ea(var9, var10);
                vb.a(ha.field_d, 127);
                var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
                tk.b(true);
                ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                return;
              }
            }
          } else {
            var15 = ed.field_g[0];
            var9 = var15.field_x << -1475718015;
            var10 = var15.field_A << 1814602241;
            if (ha.field_d != null) {
              if (ha.field_d.field_y >= var9) {
                if (ha.field_d.field_C < var10) {
                  ha.field_d = new ea(var9, var10);
                  vb.a(ha.field_d, 127);
                  var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
                  tk.b(true);
                  ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
                  return;
                } else {
                  vb.a(ha.field_d, 125);
                  eh.d();
                  var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
                  tk.b(true);
                  ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
                  return;
                }
              } else {
                ha.field_d = new ea(var9, var10);
                vb.a(ha.field_d, 127);
                var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
                tk.b(true);
                ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
                return;
              }
            } else {
              ha.field_d = new ea(var9, var10);
              vb.a(ha.field_d, 127);
              var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -((qn) this).field_L << 590995114, 4096);
              tk.b(true);
              ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
              return;
            }
          }
        }
    }

    qn(jm param0) {
        ((qn) this).field_I = param0;
    }

    final boolean a(fe param0, int param1) {
        if (param1 <= 119) {
            Object var4 = null;
            boolean discarded$0 = ((qn) this).a((fe) null, -111);
            return false;
        }
        return false;
    }

    final static String a(String param0, String param1, boolean param2, bj param3) {
        if (!param2) {
          if (!param3.a((byte) 126)) {
            return param0;
          } else {
            return param1 + " - " + param3.c(-14858) + "%";
          }
        } else {
          field_K = 78;
          if (!param3.a((byte) 126)) {
            return param0;
          } else {
            return param1 + " - " + param3.c(-14858) + "%";
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 250;
    }
}
