/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends hfa {
    static fea field_H;
    static kv[] field_D;
    static pia field_C;
    static String[] field_G;
    static String field_E;
    static boolean field_I;
    int field_F;

    final static pia a(int param0, byte param1, ee[] param2, int param3, byte[] param4) {
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        byte[][] var10 = null;
        int var11_int = 0;
        pia var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        byte[] var22 = null;
        int var23 = 0;
        byte[] var24 = null;
        int var25 = 0;
        byte[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        Object var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        byte[][] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        byte[][] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        byte[][] var49 = null;
        L0: {
          var28 = BachelorFridge.field_y;
          if (param1 == 107) {
            break L0;
          } else {
            var29 = null;
            pia discarded$1 = hl.a(120, (byte) -3, (ee[]) null, 68, (byte[]) null);
            break L0;
          }
        }
        if (param2.length == 256) {
          var47 = new int[256];
          var42 = var47;
          var37 = var42;
          var32 = var37;
          var5 = var32;
          var48 = new int[256];
          var43 = var48;
          var38 = var43;
          var33 = var38;
          var6 = var33;
          var45 = new int[256];
          var40 = var45;
          var35 = var40;
          var30 = var35;
          var7 = var30;
          var46 = new int[256];
          var41 = var46;
          var36 = var41;
          var31 = var36;
          var8 = var31;
          var9 = new int[]{0, param0, param3};
          var49 = new byte[256][];
          var44 = var49;
          var39 = var44;
          var34 = var39;
          var10 = var34;
          var11_int = 0;
          L1: while (true) {
            if ((var11_int ^ -1) <= -257) {
              var11 = new pia(param4, var47, var48, var45, var46, var9, var49);
              var11.field_B = var11.field_B - 1;
              var11.field_v = var11.field_v - 1;
              var11.field_u = var11.field_u - 1;
              return var11;
            } else {
              var5[var11_int] = -1 + param2[var11_int].field_f;
              var6[var11_int] = -1 + param2[var11_int].field_c;
              var7[var11_int] = param2[var11_int].field_d + 2;
              var8[var11_int] = param2[var11_int].field_e - -2;
              var10[var11_int] = new byte[var45[var11_int] * var46[var11_int]];
              var12 = new byte[var45[var11_int] * var46[var11_int]];
              var13 = param2[var11_int].field_g;
              var14 = param2[var11_int].field_d;
              var15 = param2[var11_int].field_e;
              var16 = var45[var11_int];
              var17 = var16 - var14;
              var18 = 0;
              var19 = var45[var11_int] + 1;
              var20 = 0;
              L2: while (true) {
                if (var20 >= var15) {
                  var18 = 0;
                  var19 = var45[var11_int] - -1;
                  var20 = 0;
                  L3: while (true) {
                    if (var20 < var15) {
                      var21 = 0;
                      L4: while (true) {
                        if (var14 <= var21) {
                          var19 = var19 + var17;
                          var20++;
                          continue L3;
                        } else {
                          var18++;
                          if (-1 == (var13[var18] ^ -1)) {
                            var19++;
                            var21++;
                            continue L4;
                          } else {
                            var19++;
                            var12[var19] = (byte) 1;
                            var21++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var11_int++;
                      continue L1;
                    }
                  }
                } else {
                  var21 = 0;
                  L5: while (true) {
                    if (var14 <= var21) {
                      var19 = var19 + var17;
                      var20++;
                      continue L2;
                    } else {
                      var18++;
                      if (var13[var18] != 0) {
                        var22 = var12;
                        var23 = -var16 + var19;
                        var24 = var12;
                        var25 = -1 + var19;
                        var26 = var12;
                        var27 = var19 + 1;
                        var12[var19 - -var16] = (byte) 2;
                        var26[var27] = (byte) 2;
                        var24[var25] = (byte) 2;
                        var22[var23] = (byte) 2;
                        var19++;
                        var21++;
                        continue L5;
                      } else {
                        var19++;
                        var21++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final static boolean a(byte param0, int param1) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var2 = 84 / ((param0 - 27) / 55);
            if ((param1 ^ -1) == -2) {
              break L1;
            } else {
              if (param1 == 2) {
                break L1;
              } else {
                if ((param1 ^ -1) != -4) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    hl(wj param0) {
        super(param0.field_s, param0.field_v, param0.field_p, param0.field_q, (qda) null, (pl) null);
        param0.a(0, ((hl) this).field_q, (byte) 59, ((hl) this).field_p, 0);
        ((hl) this).field_F = 256;
        ((hl) this).field_A = param0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        if (!(((hl) this).field_A != null)) {
            return;
        }
        if (((hl) this).field_F == 0) {
            return;
        }
        if (!((((hl) this).field_F ^ -1) != -257)) {
            ((hl) this).field_A.a((byte) 93, ((hl) this).field_v + param1, param2, param3 - -((hl) this).field_s);
            return;
        }
        kv var7 = new kv(((hl) this).field_A.field_p, ((hl) this).field_A.field_q);
        int var6 = 59 % ((param0 - -20) / 54);
        bu.a(0, var7);
        ((hl) this).field_A.a((byte) -85, 0, param2, 0);
        db.b(111);
        var7.a(param3 - -((hl) this).field_s, param1 + ((hl) this).field_v, ((hl) this).field_F);
    }

    public hl() {
        super(0, 0, 0, 0, (qda) null, (pl) null);
        ((hl) this).field_F = 256;
    }

    final static void a(int param0, boolean param1) {
        i.field_a.a(param1, 7802);
        if (param0 != 0) {
            return;
        }
        d var2 = ao.field_d;
        if (var2 != null) {
            var2.a(i.field_a.field_D, i.field_a.field_M, 20077);
        }
    }

    public static void h(int param0) {
        field_H = null;
        field_E = null;
        field_C = null;
        field_G = null;
        if (param0 != 2) {
            boolean discarded$0 = hl.a((byte) 76, 20);
        }
        field_D = null;
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) vv.field_e);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) vv.field_e);
        gfa.field_c = -1;
        if (param0 > -46) {
            field_D = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = true;
        field_E = "Waiting for savegame";
    }
}
