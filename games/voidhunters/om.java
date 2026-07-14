/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends wm implements ntb {
    private int field_d;
    static int field_e;
    static pr field_c;

    public final void b(byte param0, tv param1) {
        if (param0 <= 54) {
            String discarded$0 = ((om) this).a(-77);
        }
        super.b((byte) 57, param1);
        om var5 = (om) (Object) param1;
        om var6 = var5;
        var6.field_d = var5.field_d;
    }

    public final boolean a(byte param0, tv param1) {
        om var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var3 = (om) (Object) param1;
            var4 = 20 % ((22 - param0) / 59);
            if (super.a((byte) 90, param1)) {
              break L1;
            } else {
              if (var3.field_d == ((om) this).field_d) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final void a(pe param0, int param1, int param2, int param3) {
        ((om) this).field_d = (param3 + so.field_b) % so.field_b;
        if (param1 != -2) {
            field_e = 117;
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -115);
        if (param1 >= -109) {
            Object var4 = null;
            boolean discarded$0 = ((om) this).a((byte) -98, (tv) null);
        }
        param0.a(-632, ((om) this).field_d, 32);
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            ((om) this).field_d = 93;
        }
        return ((om) this).field_d;
    }

    final ucb[] a(pe param0, int param1) {
        if (param1 == -20605) {
            return null;
        }
        Object var4 = null;
        ((om) this).b((faa) null, -57);
        return null;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        rba[] var4 = null;
        int var5 = 0;
        rba var6 = null;
        int var7 = 0;
        rba[] var8 = null;
        var7 = VoidHunters.field_G;
        var8 = param2.i(1);
        var4 = var8;
        if (var4 == null) {
          return false;
        } else {
          var5 = param0;
          L0: while (true) {
            if (var5 >= var8.length) {
              return false;
            } else {
              var6 = var8[var5];
              if (var6 != null) {
                if (((om) this).field_d == var6.field_d) {
                  return true;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return "Any node on team " + ((om) this).field_d;
    }

    final static int a(byte[] param0, int param1, int param2, byte[][] param3, boolean param4, byte[][] param5, int[] param6, int[] param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        L0: {
          var21 = VoidHunters.field_G;
          var8 = param7[param2];
          var9 = var8 - -param6[param2];
          var10 = param7[param1];
          var11 = param6[param1] + var10;
          var12 = var8;
          if (!param4) {
            break L0;
          } else {
            var22 = null;
            int discarded$2 = om.a((byte[]) null, -54, -70, (byte[][]) null, true, (byte[][]) null, (int[]) null, (int[]) null);
            break L0;
          }
        }
        L1: {
          if (var10 <= var8) {
            break L1;
          } else {
            var12 = var10;
            break L1;
          }
        }
        L2: {
          var13 = var9;
          if (var11 < var9) {
            var13 = var11;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var14 = 255 & param0[param2];
          if (var14 <= (param0[param1] & 255)) {
            break L3;
          } else {
            var14 = param0[param1] & 255;
            break L3;
          }
        }
        var15 = param5[param2];
        var16 = param3[param1];
        var17 = var12 + -var8;
        var18 = -var10 + var12;
        var19 = var12;
        L4: while (true) {
          if (var13 <= var19) {
            return -var14;
          } else {
            var18++;
            var17++;
            var20 = var16[var18] + var15[var17];
            if (var14 > var20) {
              var14 = var20;
              var19++;
              continue L4;
            } else {
              var19++;
              continue L4;
            }
          }
        }
    }

    final int[] a(pe param0, int param1, int[] param2) {
        rba[] var4 = null;
        int var5 = 0;
        rba var6 = null;
        int var7 = 0;
        Object var8 = null;
        var7 = VoidHunters.field_G;
        var4 = param0.i(1);
        if (var4 != null) {
          L0: {
            var5 = 0;
            if (param1 >= 16) {
              break L0;
            } else {
              var8 = null;
              boolean discarded$2 = ((om) this).a((byte) -88, (tv) null);
              break L0;
            }
          }
          L1: while (true) {
            if (var4.length <= var5) {
              return param2;
            } else {
              var6 = var4[var5];
              if (var6 != null) {
                if (((om) this).field_d == var6.field_d) {
                  param2 = qi.a(var5, true, param2, (byte) -14);
                  var5++;
                  continue L1;
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
          return param2;
        }
    }

    om() {
    }

    public final void a(tv param0, int param1) {
        if (param1 >= -19) {
            return;
        }
        super.a(param0, -98);
        om var3 = (om) (Object) param0;
        int var4 = 0;
        if (!(var3.field_d == var3.field_d)) {
            System.out.println("int team_id has changed. before=" + var3.field_d + ", now=" + var3.field_d);
            var4 = 1;
        }
        if (var4 != 0) {
            System.out.println("This instance of MissionConditionNodeOnTeam has changed");
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        if (param1) {
            Object var4 = null;
            boolean discarded$0 = ((om) this).a((byte) 42, (tv) null);
        }
        ((om) this).field_d = param0.i(0, 32);
    }

    om(int param0) {
        ((om) this).field_d = param0;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != -2684) {
            field_c = null;
        }
    }

    static {
    }
}
