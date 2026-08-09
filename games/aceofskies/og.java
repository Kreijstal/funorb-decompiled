/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ib implements qi {
    boolean field_g;
    private int field_h;
    boolean field_j;
    private int field_f;
    private jagdx.IDirect3DTexture field_i;

    public final void a(ke param0, int param1) {
        super.a(param0, param1);
    }

    public final void a(byte param0) {
        this.field_c.a((og) (this), 87);
        if (param0 != -50) {
            this.b((byte) -21);
        }
    }

    og(kr param0, hd param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param2 * param3);
        Object stackIn_3_0;
        kr stackIn_3_1;
        hd stackIn_3_2;
        la stackIn_3_3;
        Object stackIn_4_0 = null;
        kr stackIn_4_1 = null;
        hd stackIn_4_2 = null;
        la stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int var10;
        int var11;
        int var12;
        jagdx.PixelBuffer var13;
        L0: {
          L1: {
            stackIn_3_0 = this;

            stackIn_3_1 = (kr) (param0);

            stackIn_3_2 = (hd) (param1);

            stackIn_3_3 = la.field_h;

            if (!param4) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (kr) ((Object) stackIn_3_1);

              stackIn_3_2 = (hd) ((Object) stackIn_3_2);

              stackIn_3_3 = (la) ((Object) stackIn_3_3);

              if (!param0.field_Gc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (kr) ((Object) stackIn_3_1);
                stackIn_4_2 = (hd) ((Object) stackIn_3_2);
                stackIn_4_3 = (la) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (kr) ((Object) stackIn_3_1);
          stackIn_4_2 = (hd) ((Object) stackIn_3_2);
          stackIn_4_3 = (la) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
          break L0;
        }
        L2: {
          if (!this.field_c.field_Dc) {
            this.field_f = fk.a(param2, 63);
            this.field_h = fk.a(param3, 69);
            break L2;
          } else {
            this.field_h = param3;
            this.field_f = param2;
            break L2;
          }
        }
        L3: {
          if (!param4) {
            this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 1, 0, kr.a(this.field_e, la.field_h, false), 1);
            break L3;
          } else {
            this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 0, 1024, kr.a(this.field_e, la.field_h, false), 1);
            break L3;
          }
        }
        L4: {
          var13 = this.field_c.field_Ec;
          var10 = this.field_i.LockRect(0, 0, 0, param2, param3, 0, var13);
          if (!jagdx.gf.a((byte) 111, var10)) {
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
            param2 = param2 * this.field_e.field_b;
            param7 = param7 * this.field_e.field_b;
            var11 = var13.getRowPitch();
            if (var11 != param2) {
              var12 = 0;
              L6: while (true) {
                if (param3 <= var12) {
                  this.field_i.UnlockRect(0);
                  return;
                } else {
                  var13.a(param5, param6 + param7 * var12, var11 * var12, param2);
                  var12++;
                  continue L6;
                }
              }
            } else {
              if (param2 == param7) {
                var13.a(param5, param6, 0, param2 * param3);
                this.field_i.UnlockRect(0);
                break L4;
              } else {
                var12 = 0;
                L7: while (true) {
                  if (param3 <= var12) {
                    this.field_i.UnlockRect(0);
                    return;
                  } else {
                    var13.a(param5, param6 + param7 * var12, var11 * var12, param2);
                    var12++;
                    continue L7;
                  }
                }
              }
            }
          }
        }
    }

    public final boolean c(byte param0) {
        if (param0 > -104) {
            return false;
        }
        return true;
    }

    public final int a(int param0) {
        if (param0 < 56) {
            return -84;
        }
        return this.field_f;
    }

    public final int b(byte param0) {
        if (param0 < 2) {
            return -101;
        }
        return this.field_h;
    }

    final jagdx.IDirect3DBaseTexture b(int param0) {
        if (param0 < 87) {
            this.field_j = false;
            return (jagdx.IDirect3DBaseTexture) ((Object) this.field_i);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_i);
    }

    public final float a(float param0, byte param1) {
        if (param1 != -32) {
          this.field_i = (jagdx.IDirect3DTexture) null;
          return param0 / (float)this.field_h;
        } else {
          return param0 / (float)this.field_h;
        }
    }

    public final float a(int param0, float param1) {
        if (param0 < 65) {
            this.field_g = true;
            return param1 / (float)this.field_f;
        }
        return param1 / (float)this.field_f;
    }

    og(kr param0, hd param1, la param2, int param3, int param4) {
        super(param0, param1, param2, false, param3 * param4);
        if (!this.field_c.field_Dc) {
            this.field_f = fk.a(param3, 118);
            this.field_h = fk.a(param4, 61);
        } else {
            this.field_f = param3;
            this.field_h = param4;
        }
        this.field_i = this.field_c.field_Rc.a(param3, param4, 1, 0, kr.a(this.field_e, this.field_d, false), 1);
    }

    og(kr param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param1 * param2);
        Object stackIn_3_0;
        kr stackIn_3_1;
        hd stackIn_3_2;
        la stackIn_3_3;
        Object stackIn_4_0 = null;
        kr stackIn_4_1 = null;
        hd stackIn_4_2 = null;
        la stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        int var11;
        jagdx.PixelBuffer var12;
        L0: {
          L1: {
            stackIn_3_0 = this;

            stackIn_3_1 = (kr) (param0);

            stackIn_3_2 = lc.field_g;

            stackIn_3_3 = la.field_h;

            if (!param3) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (kr) ((Object) stackIn_3_1);

              stackIn_3_2 = (hd) ((Object) stackIn_3_2);

              stackIn_3_3 = (la) ((Object) stackIn_3_3);

              if (!param0.field_Gc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (kr) ((Object) stackIn_3_1);
                stackIn_4_2 = (hd) ((Object) stackIn_3_2);
                stackIn_4_3 = (la) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (kr) ((Object) stackIn_3_1);
          stackIn_4_2 = (hd) ((Object) stackIn_3_2);
          stackIn_4_3 = (la) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
          break L0;
        }
        L2: {
          if (this.field_c.field_Dc) {
            this.field_f = param1;
            this.field_h = param2;
            break L2;
          } else {
            this.field_f = fk.a(param1, 91);
            this.field_h = fk.a(param2, 22);
            break L2;
          }
        }
        L3: {
          if (!param3) {
            this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 1, 0, 21, 1);
            break L3;
          } else {
            this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 0, 1024, 21, 1);
            break L3;
          }
        }
        var12 = this.field_c.field_Ec;
        var9 = this.field_i.LockRect(0, 0, 0, param1, param2, 0, var12);
        if (!jagdx.gf.a((byte) 104, var9)) {
          return;
        } else {
          L4: {
            if (0 != param6) {
              break L4;
            } else {
              param6 = param1;
              break L4;
            }
          }
          var10 = var12.getRowPitch();
          if (4 * param1 == var10) {
            if (param1 == param6) {
              var12.a(param4, param5, 0, param2 * param1);
              this.field_i.UnlockRect(0);
              return;
            } else {
              var11 = 0;
              L5: while (true) {
                if (param2 <= var11) {
                  this.field_i.UnlockRect(0);
                  return;
                } else {
                  var12.a(param4, param6 * var11 + param5, var10 * var11, param1);
                  var11++;
                  continue L5;
                }
              }
            }
          } else {
            var11 = 0;
            L6: while (true) {
              if (param2 <= var11) {
                this.field_i.UnlockRect(0);
                return;
              } else {
                var12.a(param4, param6 * var11 + param5, var10 * var11, param1);
                var11++;
                continue L6;
              }
            }
          }
        }
    }

    public final void a(boolean param0, boolean param1, byte param2) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param0) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((og) (this)).field_g = stackIn_3_1 != 0;
        if (param2 != -127) {
          L1: {
            this.c((byte) -41);
            stackIn_10_0 = this;

            if (!param1) {
              stackIn_11_0 = this;
              stackIn_11_1 = 0;
              break L1;
            } else {
              stackIn_11_0 = this;
              stackIn_11_1 = 1;
              break L1;
            }
          }
          ((og) (this)).field_j = stackIn_11_1 != 0;
          return;
        } else {
          L2: {
            stackIn_6_0 = this;

            if (!param1) {
              stackIn_7_0 = this;
              stackIn_7_1 = 0;
              break L2;
            } else {
              stackIn_7_0 = this;
              stackIn_7_1 = 1;
              break L2;
            }
          }
          ((og) (this)).field_j = stackIn_7_1 != 0;
          return;
        }
    }
}
