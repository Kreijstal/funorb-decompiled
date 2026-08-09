/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends ora implements eb {
    private int field_i;
    private int field_j;
    boolean field_f;
    boolean field_g;
    private jagdx.IDirect3DTexture field_h;

    public final boolean a(int param0) {
        int var2 = 80 % ((-92 - param0) / 34);
        return true;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        jagdx.PixelBuffer var9;
        int var10;
        int var11;
        int var12;
        L0: {
          if (param7 < -78) {
            break L0;
          } else {
            this.field_j = -127;
            break L0;
          }
        }
        L1: {
          if (this.field_c != qua.field_d) {
            break L1;
          } else {
            if (mj.field_f != this.field_a) {
              break L1;
            } else {
              L2: {
                var9 = this.field_d.field_zc;
                var10 = this.field_h.LockRect(0, param6, param0, param2, param1, 0, var9);
                if (!jagdx.hea.b(var10, (byte) 58)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var11 = var9.getRowPitch();
                      if (var11 != param2 * 4) {
                        break L4;
                      } else {
                        if (param4 == param2) {
                          var9.a(param5, param3, 0, param1 * param2);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var12 = 0;
                    L5: while (true) {
                      if (param1 <= var12) {
                        break L3;
                      } else {
                        var9.a(param5, var12 * param4 + param3, var12 * var11, param2);
                        var12++;
                        continue L5;
                      }
                    }
                  }
                  this.field_h.UnlockRect(0);
                  break L2;
                }
              }
              return;
            }
          }
        }
        throw new RuntimeException();
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    sb(nla param0, kb param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param2 * param3);
        Object stackIn_3_0;
        nla stackIn_3_1;
        kb stackIn_3_2;
        mj stackIn_3_3;
        Object stackIn_4_0 = null;
        nla stackIn_4_1 = null;
        kb stackIn_4_2 = null;
        mj stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int var10;
        int var11;
        int var12;
        jagdx.PixelBuffer var13;
        L0: {
          L1: {
            stackIn_3_0 = this;

            stackIn_3_1 = (nla) (param0);

            stackIn_3_2 = (kb) (param1);

            stackIn_3_3 = mj.field_f;

            if (!param4) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (nla) ((Object) stackIn_3_1);

              stackIn_3_2 = (kb) ((Object) stackIn_3_2);

              stackIn_3_3 = (mj) ((Object) stackIn_3_3);

              if (!param0.field_Zc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (nla) ((Object) stackIn_3_1);
                stackIn_4_2 = (kb) ((Object) stackIn_3_2);
                stackIn_4_3 = (mj) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (nla) ((Object) stackIn_3_1);
          stackIn_4_2 = (kb) ((Object) stackIn_3_2);
          stackIn_4_3 = (mj) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
          break L0;
        }
        L2: {
          if (this.field_d.field_Nc) {
            this.field_i = param2;
            this.field_j = param3;
            break L2;
          } else {
            this.field_i = hj.a(param2, (byte) -127);
            this.field_j = hj.a(param3, (byte) -99);
            break L2;
          }
        }
        L3: {
          if (!param4) {
            this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 1, 0, nla.a(this.field_c, mj.field_f, -122), 1);
            break L3;
          } else {
            this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 0, 1024, nla.a(this.field_c, mj.field_f, -95), 1);
            break L3;
          }
        }
        L4: {
          var13 = this.field_d.field_zc;
          var10 = this.field_h.LockRect(0, 0, 0, param2, param3, 0, var13);
          if (!jagdx.hea.b(var10, (byte) 100)) {
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
                param2 = param2 * this.field_c.field_a;
                param7 = param7 * this.field_c.field_a;
                var11 = var13.getRowPitch();
                if (param2 != var11) {
                  break L7;
                } else {
                  if (param7 != param2) {
                    break L7;
                  } else {
                    var13.a(param5, param6, 0, param2 * param3);
                    break L6;
                  }
                }
              }
              var12 = 0;
              L8: while (true) {
                if (param3 <= var12) {
                  break L6;
                } else {
                  var13.a(param5, param6 + param7 * var12, var12 * var11, param2);
                  var12++;
                  continue L8;
                }
              }
            }
            this.field_h.UnlockRect(0);
            break L4;
          }
        }
    }

    sb(nla param0, kb param1, mj param2, int param3, int param4) {
        super(param0, param1, param2, false, param3 * param4);
        if (this.field_d.field_Nc) {
            this.field_j = param4;
            this.field_i = param3;
        } else {
            this.field_i = hj.a(param3, (byte) -113);
            this.field_j = hj.a(param4, (byte) -97);
        }
        this.field_h = this.field_d.field_Mc.a(param3, param4, 1, 0, nla.a(this.field_c, this.field_a, -122), 1);
    }

    final jagdx.IDirect3DBaseTexture c(int param0) {
        if (param0 != 24971) {
            this.b(-52);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_h);
    }

    public final int b(byte param0) {
        if (param0 != 113) {
            this.field_j = -121;
        }
        return this.field_i;
    }

    public final void b(int param0) {
        if (param0 != -27445) {
            this.field_j = -11;
        }
        this.field_d.a(param0 ^ -27467, (sb) (this));
    }

    public final void a(boolean param0, byte param1, boolean param2) {
        this.field_g = param2 ? true : false;
        if (param1 != -98) {
            this.field_g = true;
        }
        this.field_f = param0 ? true : false;
    }

    public final float b(float param0, int param1) {
        if (param1 < 58) {
            return 1.741902470588684f;
        }
        return param0 / (float)this.field_j;
    }

    public final int a(byte param0) {
        if (param0 > -40) {
            int[] var3 = (int[]) null;
            this.a(15, 27, 32, 18, 4, (int[]) null, -70, (byte) 46);
        }
        return this.field_j;
    }

    sb(nla param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param2 * param1);
        Object stackIn_3_0;
        nla stackIn_3_1;
        kb stackIn_3_2;
        mj stackIn_3_3;
        Object stackIn_4_0 = null;
        nla stackIn_4_1 = null;
        kb stackIn_4_2 = null;
        mj stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        int var11;
        jagdx.PixelBuffer var12;
        L0: {
          L1: {
            stackIn_3_0 = this;

            stackIn_3_1 = (nla) (param0);

            stackIn_3_2 = qua.field_d;

            stackIn_3_3 = mj.field_f;

            if (!param3) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (nla) ((Object) stackIn_3_1);

              stackIn_3_2 = (kb) ((Object) stackIn_3_2);

              stackIn_3_3 = (mj) ((Object) stackIn_3_3);

              if (!param0.field_Zc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (nla) ((Object) stackIn_3_1);
                stackIn_4_2 = (kb) ((Object) stackIn_3_2);
                stackIn_4_3 = (mj) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (nla) ((Object) stackIn_3_1);
          stackIn_4_2 = (kb) ((Object) stackIn_3_2);
          stackIn_4_3 = (mj) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
          break L0;
        }
        L2: {
          if (!this.field_d.field_Nc) {
            this.field_i = hj.a(param1, (byte) -119);
            this.field_j = hj.a(param2, (byte) -97);
            break L2;
          } else {
            this.field_i = param1;
            this.field_j = param2;
            break L2;
          }
        }
        L3: {
          if (!param3) {
            this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 1, 0, 21, 1);
            break L3;
          } else {
            this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 0, 1024, 21, 1);
            break L3;
          }
        }
        L4: {
          var12 = this.field_d.field_zc;
          var9 = this.field_h.LockRect(0, 0, 0, param1, param2, 0, var12);
          if (!jagdx.hea.b(var9, (byte) 118)) {
            break L4;
          } else {
            L5: {
              if (0 != param6) {
                break L5;
              } else {
                param6 = param1;
                break L5;
              }
            }
            L6: {
              L7: {
                var10 = var12.getRowPitch();
                if (var10 != param1 * 4) {
                  break L7;
                } else {
                  if (param1 != param6) {
                    break L7;
                  } else {
                    var12.a(param4, param5, 0, param2 * param1);
                    break L6;
                  }
                }
              }
              var11 = 0;
              L8: while (true) {
                if (var11 >= param2) {
                  break L6;
                } else {
                  var12.a(param4, param5 + var11 * param6, var10 * var11, param1);
                  var11++;
                  continue L8;
                }
              }
            }
            this.field_h.UnlockRect(0);
            break L4;
          }
        }
    }

    public final float a(float param0, int param1) {
        if (param1 != -1080) {
            this.a((byte) -126);
        }
        return param0 / (float)this.field_i;
    }
}
