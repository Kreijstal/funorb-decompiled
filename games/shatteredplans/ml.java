/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ml extends da implements od {
    static String field_k;
    static int field_j;
    static String field_m;
    static qr field_l;
    private go field_i;

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 16647) {
          if (null != ((ml) this).field_i.field_s) {
            if (((ml) this).field_i.field_s.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_l = null;
          if (null == ((ml) this).field_i.field_s) {
            return true;
          } else {
            L0: {
              if (((ml) this).field_i.field_s.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final u a(boolean param0) {
        if (param0) {
          field_m = null;
          return ((ml) this).b(-11196, ((ml) this).field_i.field_s);
        } else {
          return ((ml) this).b(-11196, ((ml) this).field_i.field_s);
        }
    }

    abstract u b(int param0, String param1);

    abstract String a(boolean param0, String param1);

    final static void a(int param0, int param1, int param2, int param3, bi param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        param5 = param5 - param4.field_t;
        param2 = param2 - param4.field_x;
        if (param6 != 16403) {
          field_k = null;
          var7 = param5 + param4.field_z * param2;
          var8 = param3 + param0 * gf.field_b;
          L0: while (true) {
            param1--;
            if ((param1 ^ -1) > -1) {
              return;
            } else {
              var7++;
              var9 = param4.field_B[var7];
              var10 = gf.field_h[var8];
              var11 = var9 + var10;
              var9 = (var9 & 16711935) + (var10 & 16711935);
              var10 = (var9 & 16777472) - -(-var9 + var11 & 65536);
              var8++;
              gf.field_h[var8] = ee.a(-(var10 >>> -629182872) + var10, var11 - var10);
              continue L0;
            }
          }
        } else {
          var7 = param5 + param4.field_z * param2;
          var8 = param3 + param0 * gf.field_b;
          L1: while (true) {
            param1--;
            if ((param1 ^ -1) > -1) {
              return;
            } else {
              var7++;
              var9 = param4.field_B[var7];
              var10 = gf.field_h[var8];
              var11 = var9 + var10;
              var9 = (var9 & 16711935) + (var10 & 16711935);
              var10 = (var9 & 16777472) - -(-var9 + var11 & 65536);
              var8++;
              gf.field_h[var8] = ee.a(-(var10 >>> -629182872) + var10, var11 - var10);
              continue L1;
            }
          }
        }
    }

    public final void a(int param0, go param1) {
        if (param0 != 4340) {
            Object var4 = null;
            ((ml) this).a(27, (go) null);
        }
    }

    public final void a(go param0, int param1) {
        ((ml) this).b(-85);
        if (param1 != 95) {
            String discarded$0 = ((ml) this).c((byte) -44);
        }
    }

    final static void a(byte param0, boolean param1) {
        eh var2 = null;
        if (param0 >= 96) {
          tg.field_c.b(param1, -43);
          var2 = wi.field_c;
          if (var2 != null) {
            var2.a(tg.field_c.field_N, tg.field_c.field_B, (byte) -66);
            return;
          } else {
            return;
          }
        } else {
          field_l = null;
          tg.field_c.b(param1, -43);
          var2 = wi.field_c;
          if (var2 == null) {
            return;
          } else {
            var2.a(tg.field_c.field_N, tg.field_c.field_B, (byte) -66);
            return;
          }
        }
    }

    public static void d(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 != -65) {
            return;
        }
        field_k = null;
    }

    final String c(byte param0) {
        if (param0 <= 61) {
          field_k = null;
          return ((ml) this).a(false, ((ml) this).field_i.field_s);
        } else {
          return ((ml) this).a(false, ((ml) this).field_i.field_s);
        }
    }

    ml(go param0) {
        ((ml) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 4;
        field_k = "Select a system to anchor the other end of the Tannhäuser wormhole, or right click to cancel this project.";
        field_m = "Report <%0> for abuse";
    }
}
