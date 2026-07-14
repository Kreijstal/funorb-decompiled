/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends am {
    static int[] field_t;
    private int field_x;
    private int field_y;
    static String field_u;
    private int[] field_w;
    static int[] field_s;
    private int field_v;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        super.a(param0, param1, param2);
        if (((od) this).field_x >= 0) {
            if (!(null == ue.field_g)) {
                var4 = ue.field_g.a(((od) this).field_x, (byte) 98).field_h ? 64 : 128;
                ((od) this).field_w = ue.field_g.a((byte) -6, var4, false, 1.0f, ((od) this).field_x, var4);
                ((od) this).field_y = var4;
                ((od) this).field_v = var4;
            }
        }
    }

    final int f(byte param0) {
        if (param0 < 22) {
            od.b(-68);
        }
        return ((od) this).field_x;
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, int param5, String param6) {
        da var7 = new da(param6);
        int var8 = -40 / ((param1 - 43) / 58);
        da var9 = new da(param3);
        return na.a(var9, param2, -25978, var7, param5, param0, param4);
    }

    final static void c(int param0) {
        if (param0 != -8431868) {
            od.b(-101, -66);
        }
        of.field_u = null;
        vb.field_d = null;
    }

    public od() {
        super(0, false);
        ((od) this).field_x = -1;
    }

    final void d(byte param0) {
        super.d((byte) -126);
        int var2 = 49 / ((param0 - -63) / 62);
        ((od) this).field_w = null;
    }

    final void a(fj param0, int param1, int param2) {
        if (param1 != 35) {
            int discarded$0 = ((od) this).f((byte) -99);
        }
        if (!(param2 != 0)) {
            ((od) this).field_x = param0.i(7088);
        }
    }

    public static void b(int param0) {
        field_t = null;
        if (param0 != 11860) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    final static void b(int param0, int param1) {
        if (param0 != 128) {
            od.b(-33, 86);
        }
        om.field_h = param1;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var11 = Torquing.field_u;
          var16 = ((od) this).field_r.a(param0 ^ -19102, param1);
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (param0 == -29116) {
            break L0;
          } else {
            ((od) this).field_y = -89;
            break L0;
          }
        }
        L1: {
          if (!((od) this).field_r.field_b) {
            break L1;
          } else {
            L2: {
              stackOut_3_0 = ((od) this).field_y;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((od) this).field_v != um.field_o) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = ((od) this).field_v * param1 / um.field_o;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = param1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            var4 = stackIn_6_0 * stackIn_6_1;
            var5 = var16[0];
            var6 = var16[1];
            var7 = var16[2];
            if (ci.field_c == ((od) this).field_y) {
              var8 = 0;
              L3: while (true) {
                if (ci.field_c <= var8) {
                  break L1;
                } else {
                  var4++;
                  var9 = ((od) this).field_w[var4];
                  var7[var8] = ie.a(4080, var9 << -970631804);
                  var6[var8] = ie.a(4080, var9 >> 95010468);
                  var5[var8] = ie.a(var9 >> -577818644, 4080);
                  var8++;
                  continue L3;
                }
              }
            } else {
              var8 = 0;
              L4: while (true) {
                if (var8 >= ci.field_c) {
                  break L1;
                } else {
                  var9 = ((od) this).field_y * var8 / ci.field_c;
                  var10 = ((od) this).field_w[var4 + var9];
                  var7[var8] = ie.a(var10 << 152665252, 4080);
                  var6[var8] = ie.a(65280, var10) >> -8431868;
                  var5[var8] = ie.a(16711680, var10) >> 944853164;
                  var8++;
                  continue L4;
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[12];
        field_u = "Unfortunately we are unable to create an account for you at this time.";
        field_s = new int[4];
    }
}
