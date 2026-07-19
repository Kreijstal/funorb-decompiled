/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends fj implements ru {
    boolean field_h;
    private int field_i;
    private int field_j;
    private jagdx.IDirect3DTexture field_f;
    boolean field_g;

    public final int a(byte param0) {
        int var2 = 10 / ((-39 - param0) / 40);
        return this.field_i;
    }

    ec(ir param0, iw param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, param1, io.field_g, false, param3 * param2);
        boolean discarded$1 = false;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jagdx.PixelBuffer var13 = null;
        Object stackIn_1_0 = null;
        ir stackIn_1_1 = null;
        iw stackIn_1_2 = null;
        io stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        ir stackIn_2_1 = null;
        iw stackIn_2_2 = null;
        io stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        ir stackIn_3_1 = null;
        iw stackIn_3_2 = null;
        io stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        ir stackIn_4_1 = null;
        iw stackIn_4_2 = null;
        io stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_0_0 = null;
        ir stackOut_0_1 = null;
        iw stackOut_0_2 = null;
        io stackOut_0_3 = null;
        Object stackOut_1_0 = null;
        ir stackOut_1_1 = null;
        iw stackOut_1_2 = null;
        io stackOut_1_3 = null;
        Object stackOut_2_0 = null;
        ir stackOut_2_1 = null;
        iw stackOut_2_2 = null;
        io stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_3_0 = null;
        ir stackOut_3_1 = null;
        iw stackOut_3_2 = null;
        io stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this;
            stackOut_0_1 = (ir) (param0);
            stackOut_0_2 = (iw) (param1);
            stackOut_0_3 = io.field_g;
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
              stackOut_1_1 = (ir) ((Object) stackIn_1_1);
              stackOut_1_2 = (iw) ((Object) stackIn_1_2);
              stackOut_1_3 = (io) ((Object) stackIn_1_3);
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
                stackOut_2_1 = (ir) ((Object) stackIn_2_1);
                stackOut_2_2 = (iw) ((Object) stackIn_2_2);
                stackOut_2_3 = (io) ((Object) stackIn_2_3);
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
          stackOut_3_1 = (ir) ((Object) stackIn_3_1);
          stackOut_3_2 = (iw) ((Object) stackIn_3_2);
          stackOut_3_3 = (io) ((Object) stackIn_3_3);
          stackOut_3_4 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          break L0;
        }
        L2: {
          if (!this.field_b.field_Oc) {
            this.field_j = hn.a(false, param2);
            this.field_i = hn.a(false, param3);
            break L2;
          } else {
            this.field_j = param2;
            this.field_i = param3;
            break L2;
          }
        }
        L3: {
          if (param4) {
            this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 0, 1024, ir.a(this.field_d, 126, io.field_g), 1);
            break L3;
          } else {
            this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 1, 0, ir.a(this.field_d, -88, io.field_g), 1);
            break L3;
          }
        }
        L4: {
          var13 = this.field_b.field_Jc;
          var10 = this.field_f.LockRect(0, 0, 0, param2, param3, 0, var13);
          if (!jagdx.gv.b(var10, -111)) {
            break L4;
          } else {
            L5: {
              if (-1 != (param7 ^ -1)) {
                break L5;
              } else {
                param7 = param2;
                break L5;
              }
            }
            L6: {
              L7: {
                param7 = param7 * this.field_d.field_c;
                param2 = param2 * this.field_d.field_c;
                var11 = var13.getRowPitch();
                if (var11 != param2) {
                  break L7;
                } else {
                  if (param2 != param7) {
                    break L7;
                  } else {
                    var13.a(param5, param6, 0, param3 * param2);
                    break L6;
                  }
                }
              }
              var12 = 0;
              L8: while (true) {
                if (param3 <= var12) {
                  break L6;
                } else {
                  var13.a(param5, var12 * param7 + param6, var11 * var12, param2);
                  var12++;
                  continue L8;
                }
              }
            }
            discarded$1 = this.field_f.UnlockRect(0);
            break L4;
          }
        }
    }

    public final void a(boolean param0, boolean param1, boolean param2) {
        this.field_g = param1 ? true : false;
        this.field_h = param0 ? true : false;
        if (!param2) {
            this.field_g = true;
        }
    }

    ec(ir param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, nl.field_p, io.field_g, false, param1 * param2);
        boolean discarded$1 = false;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jagdx.PixelBuffer var12 = null;
        Object stackIn_1_0 = null;
        ir stackIn_1_1 = null;
        iw stackIn_1_2 = null;
        io stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        ir stackIn_2_1 = null;
        iw stackIn_2_2 = null;
        io stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        ir stackIn_3_1 = null;
        iw stackIn_3_2 = null;
        io stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        ir stackIn_4_1 = null;
        iw stackIn_4_2 = null;
        io stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_0_0 = null;
        ir stackOut_0_1 = null;
        iw stackOut_0_2 = null;
        io stackOut_0_3 = null;
        Object stackOut_1_0 = null;
        ir stackOut_1_1 = null;
        iw stackOut_1_2 = null;
        io stackOut_1_3 = null;
        Object stackOut_2_0 = null;
        ir stackOut_2_1 = null;
        iw stackOut_2_2 = null;
        io stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_3_0 = null;
        ir stackOut_3_1 = null;
        iw stackOut_3_2 = null;
        io stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this;
            stackOut_0_1 = (ir) (param0);
            stackOut_0_2 = nl.field_p;
            stackOut_0_3 = io.field_g;
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
              stackOut_1_1 = (ir) ((Object) stackIn_1_1);
              stackOut_1_2 = (iw) ((Object) stackIn_1_2);
              stackOut_1_3 = (io) ((Object) stackIn_1_3);
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
                stackOut_2_1 = (ir) ((Object) stackIn_2_1);
                stackOut_2_2 = (iw) ((Object) stackIn_2_2);
                stackOut_2_3 = (io) ((Object) stackIn_2_3);
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
          stackOut_3_1 = (ir) ((Object) stackIn_3_1);
          stackOut_3_2 = (iw) ((Object) stackIn_3_2);
          stackOut_3_3 = (io) ((Object) stackIn_3_3);
          stackOut_3_4 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          break L0;
        }
        L2: {
          if (!this.field_b.field_Oc) {
            this.field_j = hn.a(false, param1);
            this.field_i = hn.a(false, param2);
            break L2;
          } else {
            this.field_j = param1;
            this.field_i = param2;
            break L2;
          }
        }
        L3: {
          if (!param3) {
            this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 1, 0, 21, 1);
            break L3;
          } else {
            this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 0, 1024, 21, 1);
            break L3;
          }
        }
        L4: {
          var12 = this.field_b.field_Jc;
          var9 = this.field_f.LockRect(0, 0, 0, param1, param2, 0, var12);
          if (!jagdx.gv.b(var9, -45)) {
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
              var10 = var12.getRowPitch();
              if (var10 != param1 * 4) {
                var11 = 0;
                L7: while (true) {
                  if (var11 >= param2) {
                    break L6;
                  } else {
                    var12.a(param4, param5 - -(param6 * var11), var10 * var11, param1);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                if (param6 == param1) {
                  var12.a(param4, param5, 0, param2 * param1);
                  break L6;
                } else {
                  var11 = 0;
                  L8: while (true) {
                    if (var11 >= param2) {
                      break L6;
                    } else {
                      var12.a(param4, param5 - -(param6 * var11), var10 * var11, param1);
                      var11++;
                      continue L8;
                    }
                  }
                }
              }
            }
            discarded$1 = this.field_f.UnlockRect(0);
            break L4;
          }
        }
    }

    public final boolean c(int param0) {
        if (param0 != -24722) {
            return true;
        }
        return true;
    }

    public final void a(ji param0, int param1) {
        super.a(param0, param1);
    }

    public final int b(int param0) {
        float discarded$0 = 0.0f;
        if (param0 != -16625) {
            discarded$0 = this.b(-1.7616260051727295f, 87);
        }
        return this.field_j;
    }

    ec(ir param0, iw param1, io param2, int param3, int param4) {
        super(param0, param1, param2, false, param4 * param3);
        if (!this.field_b.field_Oc) {
            this.field_j = hn.a(false, param3);
            this.field_i = hn.a(false, param4);
        } else {
            this.field_j = param3;
            this.field_i = param4;
        }
        this.field_f = this.field_b.field_Cc.a(param3, param4, 1, 0, ir.a(this.field_d, -120, this.field_c), 1);
    }

    public final void a(int param0) {
        if (param0 != 8905) {
            return;
        }
        this.field_b.a(param0 ^ 8904, (ec) (this));
    }

    public final float a(float param0, int param1) {
        if (param1 > -10) {
            return 0.4205271005630493f;
        }
        return param0 / (float)this.field_j;
    }

    final jagdx.IDirect3DBaseTexture d(int param0) {
        if (param0 != -22689) {
            return (jagdx.IDirect3DBaseTexture) null;
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }

    public final float b(float param0, int param1) {
        if (param1 != -19230) {
            ji var4 = (ji) null;
            this.a((ji) null, 47);
        }
        return param0 / (float)this.field_i;
    }
}
