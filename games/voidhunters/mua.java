/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mua extends eka implements ntb {
    private boolean field_c;
    static int field_d;
    private int field_e;
    private int field_f;

    final void a(boolean param0, int param1, anb param2, int[] param3, pe param4, int param5, int param6, int param7) {
        Object var9 = null;
        uwa var10 = null;
        int var11 = 0;
        int var12 = 0;
        sg var13 = null;
        var9 = null;
        if (param2 instanceof sg) {
          var13 = (sg) (Object) param2;
          if (param6 > 74) {
            if (!param0) {
              if (!var13.n(31390)) {
                L0: {
                  if (((mua) this).field_c) {
                    ((mua) this).field_c = false;
                    param2.d((byte) 113);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                L1: {
                  var13.t((byte) -112);
                  if (!var13.n(31390)) {
                    break L1;
                  } else {
                    L2: {
                      var10 = ccb.field_a.a(0);
                      var11 = 0;
                      var12 = 0;
                      if (((mua) this).field_c) {
                        var11 = -((mua) this).field_e + param7;
                        var12 = -((mua) this).field_f + param1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var10.a(eha.field_q, param1, param7, rjb.field_u, 0, var11, (byte) 38, param2, param5, var12);
                    ((mua) this).field_c = true;
                    ((mua) this).field_f = param1;
                    ((mua) this).field_e = param7;
                    param2.d((byte) 80);
                    break L1;
                  }
                }
                return;
              }
            } else {
              L3: {
                if (((mua) this).field_c) {
                  ((mua) this).field_c = false;
                  param2.d((byte) 113);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          L4: {
            if (((mua) this).field_c) {
              ((mua) this).field_c = false;
              param2.d((byte) 59);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final void a(anb param0, int[] param1, int param2, int param3, int param4, int param5, int param6, pe param7, int param8, int param9, int param10) {
        sg var13 = null;
        Object var12 = null;
        if (param0 instanceof sg) {
            var13 = (sg) (Object) param0;
            var13.m(-13539);
        } else {
            return;
        }
        if (param2 != -9151) {
            field_d = 75;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        mua var6 = null;
        mua var7 = null;
        mua var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 <= -19) {
          L0: {
            var8 = (mua) (Object) param0;
            super.a(param0, -50);
            var4 = 0;
            if (var8.field_c) {
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              stackOut_18_0 = 1;
              stackIn_20_0 = stackOut_18_0;
              break L0;
            }
          }
          L1: {
            if (stackIn_20_0 == (((mua) this).field_c ? 1 : 0)) {
              var4 = 1;
              System.out.println("boolean operational_last_frame has changed. before=" + var8.field_c + ", now=" + ((mua) this).field_c);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((mua) this).field_e != var8.field_e) {
              System.out.println("int previous_shield_x has changed. before=" + var8.field_e + ", now=" + ((mua) this).field_e);
              var4 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var8.field_f != ((mua) this).field_f) {
              System.out.println("int previous_shield_y has changed. before=" + var8.field_f + ", now=" + ((mua) this).field_f);
              var4 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of ShieldBehaviour has changed");
            return;
          } else {
            return;
          }
        } else {
          L4: {
            var5 = null;
            boolean discarded$1 = ((mua) this).a((byte) 121, (tv) null);
            var7 = (mua) (Object) param0;
            var6 = var7;
            super.a(param0, -50);
            var4 = 0;
            if (var7.field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L4;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L4;
            }
          }
          L5: {
            if (stackIn_4_0 == (((mua) this).field_c ? 1 : 0)) {
              var4 = 1;
              System.out.println("boolean operational_last_frame has changed. before=" + var7.field_c + ", now=" + ((mua) this).field_c);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (((mua) this).field_e != var7.field_e) {
              System.out.println("int previous_shield_x has changed. before=" + var7.field_e + ", now=" + ((mua) this).field_e);
              var4 = 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (var7.field_f != ((mua) this).field_f) {
              System.out.println("int previous_shield_y has changed. before=" + var7.field_f + ", now=" + ((mua) this).field_f);
              var4 = 1;
              break L7;
            } else {
              break L7;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of ShieldBehaviour has changed");
            return;
          } else {
            return;
          }
        }
    }

    public final void b(byte param0, tv param1) {
        Object var4 = null;
        mua var6 = null;
        mua var6_ref = null;
        mua var7 = null;
        mua var9 = null;
        mua var12 = null;
        var6 = null;
        if (param0 <= 54) {
          var4 = null;
          ((mua) this).a((anb) null, (int[]) null, -13, 109, 122, -45, -75, (pe) null, -117, 73, 98);
          super.b((byte) 85, param1);
          var6_ref = (mua) (Object) param1;
          var7 = var6_ref;
          var6 = var7;
          var7.field_c = var6.field_c;
          var7.field_f = var6.field_f;
          var7.field_e = var6.field_e;
          return;
        } else {
          super.b((byte) 85, param1);
          var12 = (mua) (Object) param1;
          var6 = var12;
          var9 = var12;
          var9.field_c = var12.field_c;
          var9.field_f = var12.field_f;
          var9.field_e = var12.field_e;
          return;
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -120);
        boolean discarded$8 = vq.a(param0, 120, ((mua) this).field_c);
        param0.a(-632, ((mua) this).field_e, 32);
        if (param1 >= -109) {
          ((mua) this).field_c = false;
          param0.a(-632, ((mua) this).field_f, 32);
          return;
        } else {
          param0.a(-632, ((mua) this).field_f, 32);
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, false);
        ((mua) this).field_c = kv.a(param1, param0);
        ((mua) this).field_e = param0.i(0, 32);
        ((mua) this).field_f = param0.i(0, 32);
    }

    public final boolean a(byte param0, tv param1) {
        mua var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        var3 = (mua) (Object) param1;
        var4 = -29 % ((22 - param0) / 59);
        if (!super.a((byte) 93, param1)) {
          L0: {
            if (((mua) this).field_c) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          if (stackIn_5_0 != (var3.field_c ? 1 : 0)) {
            if (((mua) this).field_e == var3.field_e) {
              if (((mua) this).field_f != var3.field_f) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              return stackIn_10_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final int a(int param0, sg param1) {
        if (param0 <= 73) {
            ((mua) this).field_f = 89;
            return param1.l(-465);
        }
        return param1.l(-465);
    }

    public mua() {
    }

    static {
    }
}
