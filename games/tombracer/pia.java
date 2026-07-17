/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pia extends nqa implements gf {
    boolean field_g;
    private jagdx.IDirect3DTexture field_f;
    private int field_h;
    boolean field_j;
    private int field_i;

    pia(cta param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, gpa.field_a, una.field_g, false, param2 * param1);
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jagdx.PixelBuffer var12 = null;
        Object stackIn_1_0 = null;
        cta stackIn_1_1 = null;
        ft stackIn_1_2 = null;
        una stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        cta stackIn_2_1 = null;
        ft stackIn_2_2 = null;
        una stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        cta stackIn_3_1 = null;
        ft stackIn_3_2 = null;
        una stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        cta stackIn_4_1 = null;
        ft stackIn_4_2 = null;
        una stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_0_0 = null;
        cta stackOut_0_1 = null;
        ft stackOut_0_2 = null;
        una stackOut_0_3 = null;
        Object stackOut_1_0 = null;
        cta stackOut_1_1 = null;
        ft stackOut_1_2 = null;
        una stackOut_1_3 = null;
        Object stackOut_2_0 = null;
        cta stackOut_2_1 = null;
        ft stackOut_2_2 = null;
        una stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_3_0 = null;
        cta stackOut_3_1 = null;
        ft stackOut_3_2 = null;
        una stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this;
            stackOut_0_1 = (cta) param0;
            stackOut_0_2 = gpa.field_a;
            stackOut_0_3 = una.field_g;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_3_2 = stackOut_0_2;
            stackIn_3_3 = stackOut_0_3;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            stackIn_1_2 = stackOut_0_2;
            stackIn_1_3 = stackOut_0_3;
            if (!param3) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackOut_1_1 = (cta) (Object) stackIn_1_1;
              stackOut_1_2 = (ft) (Object) stackIn_1_2;
              stackOut_1_3 = (una) (Object) stackIn_1_3;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (!param0.field_Sc) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = (cta) (Object) stackIn_2_1;
                stackOut_2_2 = (ft) (Object) stackIn_2_2;
                stackOut_2_3 = (una) (Object) stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L0;
              }
            }
          }
          stackOut_3_0 = this;
          stackOut_3_1 = (cta) (Object) stackIn_3_1;
          stackOut_3_2 = (ft) (Object) stackIn_3_2;
          stackOut_3_3 = (una) (Object) stackIn_3_3;
          stackOut_3_4 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          break L0;
        }
        L2: {
          if (((pia) this).field_d.field_Tc) {
            ((pia) this).field_i = param2;
            ((pia) this).field_h = param1;
            break L2;
          } else {
            ((pia) this).field_h = lla.a(false, param1);
            ((pia) this).field_i = lla.a(false, param2);
            break L2;
          }
        }
        L3: {
          if (param3) {
            ((pia) this).field_f = ((pia) this).field_d.field_jd.a(((pia) this).field_h, ((pia) this).field_i, 0, 1024, 21, 1);
            break L3;
          } else {
            ((pia) this).field_f = ((pia) this).field_d.field_jd.a(((pia) this).field_h, ((pia) this).field_i, 1, 0, 21, 1);
            break L3;
          }
        }
        L4: {
          var12 = ((pia) this).field_d.field_Nc;
          var9 = ((pia) this).field_f.LockRect(0, 0, 0, param1, param2, 0, var12);
          if (!jagdx.ah.a(var9, (byte) -117)) {
            break L4;
          } else {
            L5: {
              if (param6 != 0) {
                break L5;
              } else {
                param6 = param1;
                break L5;
              }
            }
            L6: {
              L7: {
                var10 = var12.getRowPitch();
                if (4 * param1 != var10) {
                  break L7;
                } else {
                  if (param6 != param1) {
                    break L7;
                  } else {
                    var12.a(param4, param5, 0, param2 * param1);
                    break L6;
                  }
                }
              }
              var11 = 0;
              L8: while (true) {
                if (param2 <= var11) {
                  break L6;
                } else {
                  var12.a(param4, param5 - -(var11 * param6), var11 * var10, param1);
                  var11++;
                  continue L8;
                }
              }
            }
            boolean discarded$1 = ((pia) this).field_f.UnlockRect(0);
            break L4;
          }
        }
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
            float discarded$0 = ((pia) this).a(-0.6146475672721863f, (byte) -85);
        }
        return param1 / (float)((pia) this).field_i;
    }

    public final float a(float param0, byte param1) {
        if (param1 != -33) {
            return -0.45543020963668823f;
        }
        return param0 / (float)((pia) this).field_h;
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
            int discarded$0 = ((pia) this).b(22);
            return true;
        }
        return true;
    }

    public final int b(int param0) {
        if (param0 != -7070) {
            ((pia) this).field_h = -30;
        }
        return ((pia) this).field_h;
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
    }

    pia(cta param0, ft param1, una param2, int param3, int param4) {
        super(param0, param1, param2, false, param4 * param3);
        if (!((pia) this).field_d.field_Tc) {
            ((pia) this).field_h = lla.a(false, param3);
            ((pia) this).field_i = lla.a(false, param4);
        } else {
            ((pia) this).field_h = param3;
            ((pia) this).field_i = param4;
        }
        ((pia) this).field_f = ((pia) this).field_d.field_jd.a(param3, param4, 1, 0, cta.a(((pia) this).field_e, -128, ((pia) this).field_b), 1);
    }

    pia(cta param0, ft param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, param1, una.field_g, false, param2 * param3);
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jagdx.PixelBuffer var13 = null;
        Object stackIn_1_0 = null;
        cta stackIn_1_1 = null;
        ft stackIn_1_2 = null;
        una stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        cta stackIn_2_1 = null;
        ft stackIn_2_2 = null;
        una stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        cta stackIn_3_1 = null;
        ft stackIn_3_2 = null;
        una stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        cta stackIn_4_1 = null;
        ft stackIn_4_2 = null;
        una stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_0_0 = null;
        cta stackOut_0_1 = null;
        ft stackOut_0_2 = null;
        una stackOut_0_3 = null;
        Object stackOut_1_0 = null;
        cta stackOut_1_1 = null;
        ft stackOut_1_2 = null;
        una stackOut_1_3 = null;
        Object stackOut_2_0 = null;
        cta stackOut_2_1 = null;
        ft stackOut_2_2 = null;
        una stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_3_0 = null;
        cta stackOut_3_1 = null;
        ft stackOut_3_2 = null;
        una stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this;
            stackOut_0_1 = (cta) param0;
            stackOut_0_2 = (ft) param1;
            stackOut_0_3 = una.field_g;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_3_2 = stackOut_0_2;
            stackIn_3_3 = stackOut_0_3;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            stackIn_1_2 = stackOut_0_2;
            stackIn_1_3 = stackOut_0_3;
            if (!param4) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackOut_1_1 = (cta) (Object) stackIn_1_1;
              stackOut_1_2 = (ft) (Object) stackIn_1_2;
              stackOut_1_3 = (una) (Object) stackIn_1_3;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (!param0.field_Sc) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = (cta) (Object) stackIn_2_1;
                stackOut_2_2 = (ft) (Object) stackIn_2_2;
                stackOut_2_3 = (una) (Object) stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L0;
              }
            }
          }
          stackOut_3_0 = this;
          stackOut_3_1 = (cta) (Object) stackIn_3_1;
          stackOut_3_2 = (ft) (Object) stackIn_3_2;
          stackOut_3_3 = (una) (Object) stackIn_3_3;
          stackOut_3_4 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          break L0;
        }
        L2: {
          if (!((pia) this).field_d.field_Tc) {
            ((pia) this).field_h = lla.a(false, param2);
            ((pia) this).field_i = lla.a(false, param3);
            break L2;
          } else {
            ((pia) this).field_i = param3;
            ((pia) this).field_h = param2;
            break L2;
          }
        }
        L3: {
          if (param4) {
            ((pia) this).field_f = ((pia) this).field_d.field_jd.a(((pia) this).field_h, ((pia) this).field_i, 0, 1024, cta.a(((pia) this).field_e, -128, una.field_g), 1);
            break L3;
          } else {
            ((pia) this).field_f = ((pia) this).field_d.field_jd.a(((pia) this).field_h, ((pia) this).field_i, 1, 0, cta.a(((pia) this).field_e, -128, una.field_g), 1);
            break L3;
          }
        }
        L4: {
          var13 = ((pia) this).field_d.field_Nc;
          var10 = ((pia) this).field_f.LockRect(0, 0, 0, param2, param3, 0, var13);
          if (!jagdx.ah.a(var10, (byte) -100)) {
            break L4;
          } else {
            L5: {
              if (param7 != 0) {
                break L5;
              } else {
                param7 = param2;
                break L5;
              }
            }
            L6: {
              param2 = param2 * ((pia) this).field_e.field_b;
              param7 = param7 * ((pia) this).field_e.field_b;
              var11 = var13.getRowPitch();
              if (var11 != param2) {
                var12 = 0;
                L7: while (true) {
                  if (var12 >= param3) {
                    break L6;
                  } else {
                    var13.a(param5, param6 - -(param7 * var12), var12 * var11, param2);
                    var12++;
                    continue L7;
                  }
                }
              } else {
                if (param7 == param2) {
                  var13.a(param5, param6, 0, param2 * param3);
                  break L6;
                } else {
                  var12 = 0;
                  L8: while (true) {
                    if (var12 >= param3) {
                      break L6;
                    } else {
                      var13.a(param5, param6 - -(param7 * var12), var12 * var11, param2);
                      var12++;
                      continue L8;
                    }
                  }
                }
              }
            }
            boolean discarded$1 = ((pia) this).field_f.UnlockRect(0);
            break L4;
          }
        }
    }

    final jagdx.IDirect3DBaseTexture c(int param0) {
        int var2 = 9 % ((48 - param0) / 45);
        return (jagdx.IDirect3DBaseTexture) (Object) ((pia) this).field_f;
    }

    public final int a(byte param0) {
        if (param0 > 0) {
            ((pia) this).field_h = 121;
        }
        return ((pia) this).field_i;
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        ((pia) this).field_j = param2 ? true : false;
        if (param0 > -60) {
            ((pia) this).field_h = -74;
        }
        ((pia) this).field_g = param1 ? true : false;
    }

    public final void b(byte param0) {
        ((pia) this).field_d.a((pia) this, true);
        if (param0 <= 32) {
            ((pia) this).a((byte) 121, true, false);
        }
    }
}
