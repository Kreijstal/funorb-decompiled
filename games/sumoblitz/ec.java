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
        super(null, null, null, false, param3 * param2);
        Object stackIn_3_0;
        ir stackIn_3_1;
        iw stackIn_3_2;
        io stackIn_3_3;
        Object stackIn_4_0 = null;
        ir stackIn_4_1 = null;
        iw stackIn_4_2 = null;
        io stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int var10;
        int var11;
        int var12;
        jagdx.PixelBuffer var13;
        L0: {
          L1: {
            stackIn_3_0 = this;

            stackIn_3_1 = (ir) (param0);

            stackIn_3_2 = (iw) (param1);

            stackIn_3_3 = io.field_g;

            if (!param4) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (ir) ((Object) stackIn_3_1);

              stackIn_3_2 = (iw) ((Object) stackIn_3_2);

              stackIn_3_3 = (io) ((Object) stackIn_3_3);

              if (!param0.field_Sc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (ir) ((Object) stackIn_3_1);
                stackIn_4_2 = (iw) ((Object) stackIn_3_2);
                stackIn_4_3 = (io) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (ir) ((Object) stackIn_3_1);
          stackIn_4_2 = (iw) ((Object) stackIn_3_2);
          stackIn_4_3 = (io) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
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
            this.field_f.UnlockRect(0);
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
        super(null, null, null, false, param1 * param2);
        Object stackIn_3_0;
        ir stackIn_3_1;
        iw stackIn_3_2;
        io stackIn_3_3;
        Object stackIn_4_0 = null;
        ir stackIn_4_1 = null;
        iw stackIn_4_2 = null;
        io stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        int var11;
        jagdx.PixelBuffer var12;
        L0: {
          L1: {
            stackIn_3_0 = this;

            stackIn_3_1 = (ir) (param0);

            stackIn_3_2 = nl.field_p;

            stackIn_3_3 = io.field_g;

            if (!param3) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (ir) ((Object) stackIn_3_1);

              stackIn_3_2 = (iw) ((Object) stackIn_3_2);

              stackIn_3_3 = (io) ((Object) stackIn_3_3);

              if (!param0.field_Sc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (ir) ((Object) stackIn_3_1);
                stackIn_4_2 = (iw) ((Object) stackIn_3_2);
                stackIn_4_3 = (io) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (ir) ((Object) stackIn_3_1);
          stackIn_4_2 = (iw) ((Object) stackIn_3_2);
          stackIn_4_3 = (io) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
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
            this.field_f.UnlockRect(0);
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
        if (param0 != -16625) {
            this.b(-1.7616260051727295f, 87);
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
