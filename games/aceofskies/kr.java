/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class kr extends bf {
    private boolean[] field_sc;
    boolean field_rc;
    private jagdx.IDirect3DVertexShader field_zc;
    private boolean[] field_Qc;
    boolean field_Dc;
    private jagdx.D3DPRESENT_PARAMETERS field_Pc;
    private int field_Kc;
    private static int[] field_uc;
    private jagdx.IDirect3D field_wc;
    jagdx.D3DCAPS field_Bc;
    jagdx.IDirect3DDevice field_Rc;
    boolean field_Gc;
    private boolean[] field_Lc;
    private cb field_xc;
    private ke[] field_Oc;
    private static float[] field_Sc;
    private boolean[] field_Ac;
    private int[] field_Cc;
    private boolean field_Mc;
    private jagdx.D3DLIGHT field_yc;
    private static int[] field_Jc;
    jagdx.GeometryBuffer field_vc;
    private jagdx.D3DLIGHT field_Nc;
    private jagdx.D3DLIGHT field_Fc;
    jagdx.PixelBuffer field_Ec;
    private int field_Hc;
    jaclib.peer.qt field_Ic;
    private int field_tc;

    final void a(int param0, tl param1, int param2) {
        cj var4 = (cj) ((Object) param1);
        int discarded$0 = this.field_Rc.SetStreamSource(param2, var4.field_f, 0, var4.b(param0));
    }

    final bp a(int param0, int param1, int param2, hd param3, int param4, byte[] param5) {
        if (param1 > -93) {
            this.field_Qc = (boolean[]) null;
        }
        return (bp) ((Object) new nt((kr) (this), param3, param2, param0, param4, param5));
    }

    private final static boolean a(int param0, jagdx.D3DPRESENT_PARAMETERS param1, byte param2, int param3, int param4, jagdx.IDirect3D param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        int var11 = 0;
        int var12 = 0;
        jagdx.D3DDISPLAYMODE var13 = null;
        jagdx.D3DDISPLAYMODE var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        var6 = 0;
        var7 = 0;
        var9 = -92 % ((67 - param2) / 45);
        var8 = 0;
        try {
          L0: {
            var13 = new jagdx.D3DDISPLAYMODE();
            var14 = var13;
            if (jagdx.gf.a(-1, param5.a(param4, var14))) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: while (true) {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    L3: {
                      if (1 == param0) {
                        break L3;
                      } else {
                        var8 = param0 + 0;
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= field_Jc.length) {
                            break L3;
                          } else {
                            L5: {
                              if (0 != param5.CheckDeviceType(param4, param3, var13.Format, field_Jc[var11], true)) {
                                break L5;
                              } else {
                                if (param5.CheckDeviceFormat(param4, param3, var13.Format, 1, 1, field_Jc[var11]) != 0) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (param0 == 0) {
                                      break L6;
                                    } else {
                                      if (0 != param5.CheckDeviceMultiSampleType(param4, param3, field_Jc[var11], true, var8)) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var12 = 0;
                                  L7: while (true) {
                                    if (field_uc.length <= var12) {
                                      break L5;
                                    } else {
                                      L8: {
                                        if (param5.CheckDeviceFormat(param4, param3, var13.Format, 2, 1, field_uc[var12]) == 0) {
                                          if (param5.CheckDepthStencilMatch(param4, param3, var13.Format, field_Jc[var11], field_uc[var12]) != 0) {
                                            break L8;
                                          } else {
                                            L9: {
                                              if (param0 == 0) {
                                                break L9;
                                              } else {
                                                if (-1 == (param5.CheckDeviceMultiSampleType(param4, param3, field_uc[var11], true, var8) ^ -1)) {
                                                  break L9;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            var7 = field_Jc[var11];
                                            var6 = field_uc[var12];
                                            break L2;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var12++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                    param0--;
                    continue L1;
                  }
                }
                L10: {
                  if ((param0 ^ -1) > -1) {
                    break L10;
                  } else {
                    if (var7 == 0) {
                      break L10;
                    } else {
                      if (var6 == 0) {
                        break L10;
                      } else {
                        param1.MultiSampleType = var8;
                        param1.AutoDepthStencilFormat = var6;
                        param1.BackBufferFormat = var7;
                        param1.MultiSampleQuality = 0;
                        stackOut_32_0 = 1;
                        stackIn_33_0 = stackOut_32_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          return false;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0 != 0;
          } else {
            return stackIn_33_0 != 0;
          }
        }
    }

    final void a(int param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = -25 / ((param0 - -55) / 42);
        int discarded$0 = this.field_Rc.SetPixelShader(param1);
    }

    final void I(int param0) {
        int var2 = -74 / ((27 - param0) / 38);
        int discarded$0 = this.field_Rc.SetScissorRect(this.field_Rb - -this.field_R, this.field_Nb + this.field_Ib, this.field_gc, this.field_V);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        boolean discarded$4 = false;
        jagdx.IDirect3DSurface var9 = null;
        int var10 = 0;
        int var11 = 0;
        jagdx.IDirect3DSurface var12 = null;
        L0: {
          var12 = this.field_Rc.c(0);
          var9 = this.field_Rc.a(param2, param3, 21, 0, 0, true);
          if (jagdx.gf.a((byte) 93, var9.LockRect(0, 0, param2, param3, 0, this.field_Ec))) {
            L1: {
              if (param6 != 0) {
                break L1;
              } else {
                param6 = param2;
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = this.field_Ec.getRowPitch();
                if (param6 != param2) {
                  break L3;
                } else {
                  if (var10 != 4 * param2) {
                    break L3;
                  } else {
                    this.field_Ec.a(param4, param5, 0, param2 * param3);
                    break L2;
                  }
                }
              }
              var11 = 0;
              L4: while (true) {
                if (var11 >= param3) {
                  break L2;
                } else {
                  this.field_Ec.a(param4, param6 * var11 + param5, var10 * var11, param2);
                  var11++;
                  continue L4;
                }
              }
            }
            discarded$4 = var9.UnlockRect();
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$5 = this.field_Rc.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
    }

    final void V(int param0) {
        this.field_Nc.SetDirection(-this.field_Jb[0], -this.field_Jb[1], -this.field_Jb[2]);
        this.field_yc.SetDirection(-this.field_Gb[param0], -this.field_Gb[1], -this.field_Gb[2]);
        this.field_Mc = false;
    }

    final Object a(int param0, java.awt.Canvas param1) {
        if (param0 == -15083) {
            return null;
        }
        sk discarded$0 = this.b(26, (byte) 42);
        return null;
    }

    final void a(jagdx.IDirect3DVertexShader param0, int param1) {
        this.field_zc = param0;
        if (param1 != 5243) {
            this.field_vc = (jagdx.GeometryBuffer) null;
        }
        int discarded$0 = this.field_Rc.SetVertexShader(param0);
        this.p(-119);
    }

    final void b(boolean param0) {
        int discarded$4 = 0;
        jagdx.IDirect3DDevice stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        jagdx.IDirect3DDevice stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jagdx.IDirect3DDevice stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        jagdx.IDirect3DDevice stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        jagdx.IDirect3DDevice stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        jagdx.IDirect3DDevice stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        jagdx.IDirect3DDevice stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        jagdx.IDirect3DDevice stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this.field_Rc;
            stackOut_0_1 = 28;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!this.field_I) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!this.field_o) {
                break L1;
              } else {
                stackOut_2_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (-1 < (this.field_p ^ -1)) {
                  break L1;
                } else {
                  stackOut_3_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_3_0);
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_4_0);
          stackOut_4_1 = stackIn_4_1;
          stackOut_4_2 = 0;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          stackIn_5_2 = stackOut_4_2;
          break L0;
        }
        L2: {
          discarded$4 = ((jagdx.IDirect3DDevice) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2 != 0);
          if (!param0) {
            break L2;
          } else {
            this.field_Fc = (jagdx.D3DLIGHT) null;
            break L2;
          }
        }
    }

    final void b(int param0, int param1) throws lp {
        int discarded$23 = 0;
        int fieldTemp$24 = 0;
        boolean discarded$25 = false;
        boolean discarded$26 = false;
        L0: {
          discarded$23 = this.field_Rc.EndScene();
          if (!this.field_xc.a(false)) {
            fieldTemp$24 = this.field_Hc + 1;
            this.field_Hc = this.field_Hc + 1;
            if ((fieldTemp$24 ^ -1) >= -51) {
              discarded$25 = this.h(true);
              break L0;
            } else {
              throw new lp();
            }
          } else {
            this.field_Hc = 0;
            if (jagdx.gf.a(-1, this.field_xc.a(0, -96))) {
              discarded$26 = this.h(true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        int discarded$27 = this.field_Rc.BeginScene();
    }

    final void G(int param0) {
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int discarded$18 = 0;
        int discarded$19 = 0;
        int discarded$20 = 0;
        int discarded$21 = 0;
        int discarded$22 = 0;
        int discarded$23 = 0;
        int discarded$24 = 0;
        int discarded$25 = 0;
        int discarded$26 = 0;
        int discarded$27 = 0;
        int discarded$28 = 0;
        int discarded$29 = 0;
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= this.field_h) {
            discarded$15 = this.field_Rc.SetTextureStageState(0, 6, 1);
            discarded$16 = this.field_Rc.SetRenderState(9, 2);
            discarded$17 = this.field_Rc.SetRenderState(23, 4);
            discarded$18 = this.field_Rc.SetRenderState(25, 5);
            var2 = 39 / ((param0 - -65) / 51);
            discarded$19 = this.field_Rc.SetRenderState(24, 0);
            discarded$20 = this.field_Rc.SetRenderState(22, 2);
            discarded$21 = this.field_Rc.SetRenderState(147, 1);
            discarded$22 = this.field_Rc.SetRenderState(145, 1);
            discarded$23 = this.field_Rc.a(38, 0.949999988079071f);
            discarded$24 = this.field_Rc.SetRenderState(140, 3);
            this.field_Nc.SetType(3);
            this.field_yc.SetType(3);
            this.field_Fc.SetType(1);
            this.field_Mc = false;
            super.G(1);
            return;
          } else {
            discarded$25 = this.field_Rc.SetSamplerState(var2, 7, 0);
            discarded$26 = this.field_Rc.SetSamplerState(var2, 6, 2);
            discarded$27 = this.field_Rc.SetSamplerState(var2, 5, 2);
            discarded$28 = this.field_Rc.SetSamplerState(var2, 1, 1);
            discarded$29 = this.field_Rc.SetSamplerState(var2, 2, 1);
            this.field_Oc[var2] = fg.field_A;
            var3 = this.field_Qc;
            var4 = var2;
            this.field_sc[var2] = true;
            var3[var4] = true;
            this.field_Ac[var2] = false;
            this.field_Cc[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final void a(ib param0, byte param1) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        jagdx.IDirect3DDevice stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        jagdx.IDirect3DDevice stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        jagdx.IDirect3DDevice stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        jagdx.IDirect3DDevice stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        jagdx.IDirect3DDevice stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        jagdx.IDirect3DDevice stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        jagdx.IDirect3DDevice stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        jagdx.IDirect3DDevice stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        jagdx.IDirect3DDevice stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        jagdx.IDirect3DDevice stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        jagdx.IDirect3DDevice stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        jagdx.IDirect3DDevice stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        L0: {
          discarded$5 = this.field_Rc.SetTexture(this.field_F, param0.b(110));
          var3 = -65 % ((param1 - 26) / 32);
          if (this.field_Oc[this.field_F] != param0.field_a) {
            L1: {
              var4 = kr.a(param0.field_a, 2);
              discarded$6 = this.field_Rc.SetSamplerState(this.field_F, 6, var4);
              discarded$7 = this.field_Rc.SetSamplerState(this.field_F, 5, var4);
              this.field_Oc[this.field_F] = param0.field_a;
              if (param0.field_b) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L1;
              }
            }
            L2: {
              stackOut_13_0 = stackIn_13_0;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (this.field_Ac[this.field_F]) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L2;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L2;
              }
            }
            if (stackIn_16_0 == stackIn_16_1) {
              break L0;
            } else {
              L3: {
                stackOut_17_0 = this.field_Rc;
                stackOut_17_1 = this.field_F;
                stackOut_17_2 = 7;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                if (!param0.field_b) {
                  stackOut_19_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_19_0);
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = stackIn_19_2;
                  stackOut_19_3 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  stackIn_20_3 = stackOut_19_3;
                  break L3;
                } else {
                  stackOut_18_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_18_0);
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = stackIn_18_2;
                  stackOut_18_3 = kr.a(param0.field_a, 2);
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_20_3 = stackOut_18_3;
                  break L3;
                }
              }
              discarded$8 = ((jagdx.IDirect3DDevice) (Object) stackIn_20_0).SetSamplerState(stackIn_20_1, stackIn_20_2, stackIn_20_3);
              this.field_Ac[this.field_F] = param0.field_b;
              break L0;
            }
          } else {
            L4: {
              if (this.field_Ac[this.field_F]) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L4;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L4;
              }
            }
            if (stackIn_4_0 == (param0.field_b ? 1 : 0)) {
              L5: {
                stackOut_6_0 = this.field_Rc;
                stackOut_6_1 = this.field_F;
                stackOut_6_2 = 7;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                if (!param0.field_b) {
                  stackOut_8_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_8_0);
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  break L5;
                } else {
                  stackOut_7_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_7_0);
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = kr.a(param0.field_a, 2);
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  break L5;
                }
              }
              discarded$9 = ((jagdx.IDirect3DDevice) (Object) stackIn_9_0).SetSamplerState(stackIn_9_1, stackIn_9_2, stackIn_9_3);
              this.field_Ac[this.field_F] = param0.field_b;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L6: {
          if (!this.field_Lc[this.field_F]) {
            this.field_Lc[this.field_F] = true;
            this.m((byte) -126);
            this.N(0);
            break L6;
          } else {
            break L6;
          }
        }
    }

    final qi a(la param0, int param1, int param2, int param3, hd param4) {
        if (param1 != 8) {
            return (qi) null;
        }
        return (qi) ((Object) new og((kr) (this), param4, param0, param3, param2));
    }

    private final static int a(ke param0, int param1) {
        if (param1 != 2) {
            field_Sc = (float[]) null;
        }
        if (fg.field_A == param0) {
            return 2;
        }
        if (!(param0 != jp.field_a)) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    final void w(int param0) {
        int discarded$4 = 0;
        jagdx.IDirect3DDevice stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        jagdx.IDirect3DDevice stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        jagdx.IDirect3DDevice stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        jagdx.IDirect3DDevice stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        jagdx.IDirect3DDevice stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        jagdx.IDirect3DDevice stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this.field_Rc;
            stackOut_0_1 = 14;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!this.field_mb) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!this.field_Y) {
                break L1;
              } else {
                stackOut_2_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L0;
              }
            }
          }
          stackOut_3_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_3_0);
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          break L0;
        }
        L2: {
          discarded$4 = ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0);
          if (param0 == 0) {
            break L2;
          } else {
            this.field_yc = (jagdx.D3DLIGHT) null;
            break L2;
          }
        }
    }

    final void j(int param0) {
        int discarded$0 = 0;
        boolean discarded$1 = false;
        if (this.field_Lc[this.field_F]) {
            this.field_Lc[this.field_F] = false;
            discarded$0 = this.field_Rc.SetTexture(this.field_F, (jagdx.IDirect3DBaseTexture) null);
            this.m((byte) -128);
            this.N(0);
        }
        if (param0 != 1) {
            discarded$1 = this.d();
        }
    }

    final void g(int param0) {
        if (param0 != 0) {
            this.r(6);
        }
        int discarded$0 = this.field_Rc.SetRenderState(60, this.field_cc);
    }

    final void p(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int var2 = 0;
        L0: {
          L1: {
            if (this.field_zc != null) {
              break L1;
            } else {
              if (mq.field_g != this.field_f[this.field_F]) {
                L2: {
                  if (this.field_f[this.field_F] == tr.field_a) {
                    discarded$5 = this.field_Rc.SetTransform(this.field_F + 16, this.field_L[this.field_F].b(field_Sc, 3911));
                    break L2;
                  } else {
                    discarded$6 = this.field_Rc.SetTransform(this.field_F + 16, this.field_L[this.field_F].a(field_Sc, true));
                    break L2;
                  }
                }
                var2 = kr.a(true, this.field_f[this.field_F]);
                if (var2 == this.field_Cc[this.field_F]) {
                  break L0;
                } else {
                  discarded$7 = this.field_Rc.SetTextureStageState(this.field_F, 24, var2);
                  this.field_Cc[this.field_F] = var2;
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          discarded$8 = this.field_Rc.SetTextureStageState(this.field_F, 24, 0);
          this.field_Cc[this.field_F] = 0;
          break L0;
        }
        L3: {
          if (param0 < -111) {
            break L3;
          } else {
            this.field_tc = 4;
            break L3;
          }
        }
    }

    final void a(boolean param0, int param1, boolean param2, jb param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var7 = 0;
          var8 = param1;
          if (-2 == (var8 ^ -1)) {
            var6 = 3;
            break L0;
          } else {
            if ((var8 ^ -1) == -3) {
              var6 = 26;
              break L0;
            } else {
              var6 = 2;
              break L0;
            }
          }
        }
        L1: {
          if (param2) {
            break L1;
          } else {
            this.p((byte) 127);
            break L1;
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            var7 = var7 | 32;
            break L2;
          }
        }
        L3: {
          if (!param4) {
            break L3;
          } else {
            var7 = var7 | 16;
            break L3;
          }
        }
        int discarded$1 = this.field_Rc.SetTextureStageState(this.field_F, var6, var7 | kr.a(param3, (byte) -68));
    }

    final void a(pa param0, boolean param1) {
    }

    final void u(byte param0) {
        go discarded$8 = null;
        int discarded$7 = this.field_Rc.a(15, this.field_Vb);
        if (param0 > -29) {
            discarded$8 = this.a(-112, -74, false, (int[][]) null);
        }
    }

    final void w(byte param0) {
        if (param0 > -40) {
            field_uc = (int[]) null;
        }
    }

    final void t(byte param0) {
        float var2 = this.field_Ab ? this.field_fb : 0.0f;
        int var3 = 92 % ((param0 - 17) / 37);
        float var4 = this.field_Ab ? -this.field_ub : 0.0f;
        this.field_Nc.SetDiffuse(var2 * this.field_g, this.field_rb * var2, this.field_Hb * var2, 0.0f);
        this.field_yc.SetDiffuse(var4 * this.field_g, var4 * this.field_rb, this.field_Hb * var4, 0.0f);
        this.field_Mc = false;
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final void m(byte param0) {
        if (param0 >= -124) {
            this.field_Rc = (jagdx.IDirect3DDevice) null;
        }
        int var2 = this.field_Lc[this.field_F] ? kr.a(this.field_w[this.field_F], true) : 1;
        int discarded$0 = this.field_Rc.SetTextureStageState(this.field_F, 4, var2);
    }

    final static ha createToolkit(java.awt.Canvas param0, d param1, gk param2, Integer param3) {
        Object var4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jaclib.peer.qt var7 = null;
        Object var8 = null;
        jagdx.IDirect3D var8_ref = null;
        jagdx.D3DCAPS var9 = null;
        Object var10 = null;
        jagdx.D3DPRESENT_PARAMETERS var10_ref = null;
        int var11 = 0;
        jagdx.IDirect3DDevice var12 = null;
        cb var13 = null;
        jagdx.ie var14 = null;
        kr var15 = null;
        kr stackIn_43_0 = null;
        Throwable decompiledCaughtException = null;
        kr stackOut_42_0 = null;
        Object var12_ref = null;
        var4 = null;
        try {
          L0: {
            var5_int = 0;
            var6 = 1;
            var7 = new jaclib.peer.qt();
            var8_ref = jagdx.IDirect3D.a(-2147483616, var7);
            var9 = var8_ref.a(var5_int, var6);
            if ((16777216 & var9.RasterCaps) != 0) {
              if (2 > var9.MaxSimultaneousTextures) {
                throw new RuntimeException("");
              } else {
                if (-1 == (2 & var9.TextureOpCaps ^ -1)) {
                  throw new RuntimeException("");
                } else {
                  if ((var9.TextureOpCaps & 8) == 0) {
                    throw new RuntimeException("");
                  } else {
                    if ((64 & var9.TextureOpCaps) == 0) {
                      throw new RuntimeException("");
                    } else {
                      if (-1 == (var9.TextureOpCaps & 512 ^ -1)) {
                        throw new RuntimeException("");
                      } else {
                        if (0 == (33554432 & var9.TextureOpCaps)) {
                          throw new RuntimeException("");
                        } else {
                          if ((16 & (var9.SrcBlendCaps & var9.DestBlendCaps)) == 0) {
                            throw new RuntimeException("");
                          } else {
                            if ((var9.SrcBlendCaps & var9.DestBlendCaps & 32) == 0) {
                              throw new RuntimeException("");
                            } else {
                              if (-1 != (var9.SrcBlendCaps & var9.DestBlendCaps & 2 ^ -1)) {
                                L1: {
                                  if (var9.MaxActiveLights <= 0) {
                                    break L1;
                                  } else {
                                    if (2 <= var9.MaxActiveLights) {
                                      break L1;
                                    } else {
                                      throw new RuntimeException("");
                                    }
                                  }
                                }
                                if ((var9.MaxStreams ^ -1) <= -6) {
                                  var10_ref = new jagdx.D3DPRESENT_PARAMETERS(param0);
                                  if (kr.a(param3.intValue(), var10_ref, (byte) 124, var6, var5_int, var8_ref)) {
                                    L2: {
                                      var10_ref.PresentationInterval = -2147483648;
                                      var10_ref.EnableAutoDepthStencil = true;
                                      var10_ref.Windowed = true;
                                      var11 = 2;
                                      if ((var9.DevCaps & 1048576) == 0) {
                                        break L2;
                                      } else {
                                        var11 = var11 | 16;
                                        break L2;
                                      }
                                    }
                                    var12_ref = null;
                                    try {
                                      L3: {
                                        var12 = var8_ref.a(var5_int, var6, param0, var11 | 64, var10_ref);
                                        break L3;
                                      }
                                    } catch (jagdx.ie decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L4: {
                                        var14 = (jagdx.ie) (Object) decompiledCaughtException;
                                        var12 = var8_ref.a(var5_int, var6, param0, var11 | 32, var10_ref);
                                        break L4;
                                      }
                                    }
                                    var13 = new cb(var12.b(0), var12.b());
                                    var15 = new kr(var5_int, var6, param0, var7, var8_ref, var12, var13, var10_ref, var9, param1, param2, param3.intValue());
                                    var4 = var15;
                                    var15.f((byte) 101);
                                    stackOut_42_0 = (kr) (var15);
                                    stackIn_43_0 = stackOut_42_0;
                                    break L0;
                                  } else {
                                    throw new RuntimeException("");
                                  }
                                } else {
                                  throw new RuntimeException("");
                                }
                              } else {
                                throw new RuntimeException("");
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            if (var4 != null) {
              ((kr) (var4)).c();
              break L5;
            } else {
              break L5;
            }
          }
          throw var5;
        }
        return (ha) ((Object) stackIn_43_0);
    }

    final void N(int param0) {
        int var2 = this.field_Lc[this.field_F] ? kr.a(this.field_H[this.field_F], true) : 1;
        int discarded$9 = this.field_Rc.SetTextureStageState(this.field_F, 1, var2);
        if (param0 != 0) {
            this.field_Mc = true;
        }
    }

    final void b(byte param0) {
        float[] discarded$0 = null;
        if (this.field_Lb) {
            field_Sc[7] = 0.0f;
            field_Sc[13] = 0.0f;
            field_Sc[14] = 0.0f;
            field_Sc[15] = 1.0f;
            field_Sc[3] = 0.0f;
            field_Sc[9] = 0.0f;
            field_Sc[11] = 0.0f;
            field_Sc[0] = 1.0f;
            field_Sc[4] = 0.0f;
            field_Sc[1] = 0.0f;
            field_Sc[12] = 0.0f;
            field_Sc[6] = 0.0f;
            field_Sc[8] = 0.0f;
            field_Sc[5] = 1.0f;
            field_Sc[2] = 0.0f;
            field_Sc[10] = 1.0f;
        } else {
            discarded$0 = this.field_ec.a(field_Sc, true);
        }
        int discarded$1 = this.field_Rc.SetTransform(256, field_Sc);
        int var2 = 15 / ((9 - param0) / 48);
    }

    final qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7) {
        if (param4 < 73) {
            nf var10 = (nf) null;
            this.a((nf) null, true);
        }
        return (qi) ((Object) new og((kr) (this), param2, param0, param3, param1, param7, param6, param5));
    }

    final void a(fa param0, byte param1) {
        dxVertexLayout var3 = (dxVertexLayout) ((Object) param0);
        if (param1 != 75) {
            return;
        }
        int discarded$0 = this.field_Rc.SetVertexDeclaration(var3.field_d);
    }

    final void e() {
    }

    final void d(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
            hd var3 = (hd) null;
            discarded$0 = this.a((la) null, -42, (hd) null);
        }
        int discarded$1 = this.field_Rc.a(7, this.field_ib);
    }

    final void p(byte param0) {
        boolean discarded$0 = false;
        if (param0 >= -127) {
            jagdx.IDirect3D var3 = (jagdx.IDirect3D) null;
            discarded$0 = kr.a(-104, (jagdx.D3DPRESENT_PARAMETERS) null, (byte) -33, 21, -35, (jagdx.IDirect3D) null);
        }
        int discarded$1 = this.field_Rc.a(27, this.field_Db);
    }

    final sm a(ra param0, gd param1) {
        return null;
    }

    final void b(byte param0, boolean param1) {
        int discarded$6 = this.field_Rc.a(161, param1);
        if (param0 >= -113) {
            this.field_Hc = -52;
        }
    }

    final boolean a(la param0, int param1, hd param2) {
        jagdx.D3DDISPLAYMODE var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var4 = new jagdx.D3DDISPLAYMODE();
          if (param1 == 0) {
            break L0;
          } else {
            this.field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!jagdx.gf.a((byte) 96, this.field_wc.a(this.field_Kc, var4))) {
              break L2;
            } else {
              if (!jagdx.gf.a((byte) 78, this.field_wc.CheckDeviceFormat(this.field_Kc, this.field_tc, var4.Format, 0, 3, kr.a(param2, param0, false)))) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final qi a(float[] param0, int param1, hd param2, boolean param3, int param4, int param5, int param6, boolean param7) {
        if (!param3) {
            return null;
        }
        this.d(false);
        return null;
    }

    final void a(nf param0, boolean param1) {
        int discarded$2 = 0;
        int var3 = 0;
        if (!param1) {
          L0: {
            var3 = 0;
            if (param0 != rg.field_A) {
              if (param0 == ij.field_g) {
                var3 = 131072;
                break L0;
              } else {
                if (param0 != gk.field_g) {
                  break L0;
                } else {
                  var3 = 196608;
                  break L0;
                }
              }
            } else {
              var3 = 65536;
              break L0;
            }
          }
          discarded$2 = this.field_Rc.SetTextureStageState(this.field_F, 11, this.field_F | var3);
          return;
        } else {
          return;
        }
    }

    final boolean d() {
        return false;
    }

    final void v(int param0) {
        float[] discarded$1 = null;
        if (this.field_bb.b((byte) -92)) {
            discarded$1 = this.field_t.a(field_Sc, true);
        } else {
            field_Sc[5] = 1.0f;
            field_Sc[6] = 0.0f;
            field_Sc[8] = 0.0f;
            field_Sc[15] = 1.0f;
            field_Sc[13] = 0.0f;
            field_Sc[2] = 0.0f;
            field_Sc[10] = 1.0f;
            field_Sc[9] = 0.0f;
            field_Sc[12] = 0.0f;
            field_Sc[0] = 1.0f;
            field_Sc[1] = 0.0f;
            field_Sc[14] = 0.0f;
            field_Sc[3] = 0.0f;
            field_Sc[4] = 0.0f;
            field_Sc[11] = 0.0f;
            field_Sc[7] = 0.0f;
        }
        if (param0 != 5) {
            Object var3 = (Object) null;
            this.a(-26, (java.awt.Canvas) null, (Object) null);
        }
        int discarded$2 = this.field_Rc.SetTransform(2, field_Sc);
    }

    final void a(sm param0) {
    }

    final void T(int param0) {
        int discarded$2 = 0;
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jagdx.IDirect3DDevice stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        jagdx.IDirect3DDevice stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        jagdx.IDirect3DDevice stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        jagdx.IDirect3DDevice stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jagdx.IDirect3DDevice stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        jagdx.IDirect3DDevice stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              stackOut_2_0 = this.field_Rc;
              stackOut_2_1 = 137;
              stackIn_5_0 = stackOut_2_0;
              stackIn_5_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (!this.field_ob) {
                break L1;
              } else {
                stackOut_3_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (this.field_pc) {
                  break L1;
                } else {
                  stackOut_4_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_4_0);
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  break L0;
                }
              }
            }
            stackOut_5_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_5_0);
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L0;
          }
          discarded$2 = ((jagdx.IDirect3DDevice) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0);
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0, la param1, hd param2) {
        jagdx.D3DDISPLAYMODE var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -13) {
          L0: {
            L1: {
              var4 = new jagdx.D3DDISPLAYMODE();
              if (!jagdx.gf.a((byte) 122, this.field_wc.a(this.field_Kc, var4))) {
                break L1;
              } else {
                if (!jagdx.gf.a((byte) 112, this.field_wc.CheckDeviceFormat(this.field_Kc, this.field_tc, var4.Format, 0, 4, kr.a(param2, param1, false)))) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(boolean param0, ia param1, int param2, int param3) {
        int discarded$10 = this.field_Rc.DrawPrimitive(kr.a(41, param1), param3, param2);
        if (!param0) {
            this.field_Gc = false;
        }
    }

    final void C(int param0) {
        int discarded$7 = this.field_Rc.SetTransform(3, this.field_N);
        if (param0 > -51) {
            pa var3 = (pa) null;
            this.a((pa) null, true);
        }
    }

    final void k(byte param0) {
        boolean discarded$3 = false;
        int discarded$4 = 0;
        boolean discarded$5 = false;
        int var2 = 0;
        sf var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        pa var7 = null;
        L0: {
          var2 = 0;
          if (param0 >= 123) {
            break L0;
          } else {
            var7 = (pa) null;
            this.a((pa) null, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= this.field_B) {
            L2: while (true) {
              if (this.field_ic <= var2) {
                super.k((byte) 127);
                return;
              } else {
                discarded$3 = this.field_Rc.LightEnable(2 + var2, false);
                var2++;
                continue L2;
              }
            }
          } else {
            var3 = this.field_D[var2];
            var4 = 2 + var2;
            var5 = var3.a(87);
            var6 = var3.a(false) / 255.0f;
            this.field_Fc.SetPosition((float)var3.c((byte) -98), (float)var3.a((byte) -102), (float)var3.e(0));
            this.field_Fc.SetDiffuse(var6 * (float)((16721490 & var5) >> -1061901424), (float)((65478 & var5) >> 1267442952) * var6, (float)(255 & var5) * var6, 0.0f);
            this.field_Fc.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.d(0) * var3.d(0)));
            this.field_Fc.SetRange((float)var3.d(0));
            discarded$4 = this.field_Rc.SetLight(var4, this.field_Fc);
            discarded$5 = this.field_Rc.LightEnable(var4, true);
            var2++;
            continue L1;
          }
        }
    }

    final qi a(int param0, boolean param1, boolean param2, int param3, int param4, int[] param5, int param6) {
        if (!param1) {
            return (qi) null;
        }
        return (qi) ((Object) new og((kr) (this), param6, param3, param2, param5, param0, param4));
    }

    private final static int a(as param0, boolean param1) {
        if (param0 == bd.field_C) {
          return 2;
        } else {
          if (param0 == ru.field_a) {
            return 4;
          } else {
            if (du.field_l != param0) {
              if (param0 != lo.field_j) {
                if (param0 == fs.field_d) {
                  return 10;
                } else {
                  if (param1) {
                    throw new IllegalArgumentException();
                  } else {
                    return 29;
                  }
                }
              } else {
                return 7;
              }
            } else {
              return 26;
            }
          }
        }
    }

    final ti c(boolean param0, int param1) {
        if (param1 != 8762) {
            this.w(-85);
        }
        return (ti) ((Object) new dm((kr) (this), la.field_b, param0));
    }

    final fa a(pl[] param0, int param1) {
        if (param1 > -126) {
            this.w((byte) -105);
        }
        return (fa) ((Object) new dxVertexLayout((kr) (this), param0));
    }

    private final static int a(jb param0, byte param1) {
        int discarded$2 = 0;
        as var3 = null;
        if (param0 == dl.field_p) {
          return 2;
        } else {
          if (param0 == ac.field_b) {
            return 0;
          } else {
            if (un.field_i != param0) {
              if (param0 == bs.field_a) {
                return 3;
              } else {
                L0: {
                  if (param1 == -68) {
                    break L0;
                  } else {
                    var3 = (as) null;
                    discarded$2 = kr.a((as) null, true);
                    break L0;
                  }
                }
                throw new IllegalArgumentException();
              }
            } else {
              return 1;
            }
          }
        }
    }

    final void a() {
    }

    final void c(int param0, byte param1) {
        int discarded$0 = 0;
        if (param1 >= -76) {
            st var4 = (st) null;
            discarded$0 = kr.a(true, (st) null);
        }
        int discarded$1 = this.field_Rc.SetTextureStageState(this.field_F, 11, param0);
    }

    private final boolean h(boolean param0) {
        int var4 = 0;
        if (!param0) {
            return false;
        }
        int var2 = this.field_Rc.TestCooperativeLevel();
        if (0 != var2) {
            if ((var2 ^ -1) != 2005530518) {
                return false;
            }
        }
        cb var3 = (cb) (this.field_Fb);
        this.o(0);
        var3.a((byte) -83);
        this.field_Pc.BackBufferWidth = 0;
        this.field_Pc.BackBufferHeight = 0;
        if (!(!kr.a(this.field_lc, this.field_Pc, (byte) 114, this.field_tc, this.field_Kc, this.field_wc))) {
            var4 = this.field_Rc.Reset(this.field_Pc);
            if (jagdx.gf.a((byte) 78, var4)) {
                var3.a(this.field_Rc.b(), this.field_Rc.b(0), 0);
                this.c((byte) 61);
                this.G(117);
                return true;
            }
        }
        return false;
    }

    final void Q(int param0) {
        if (param0 <= 52) {
            return;
        }
        int discarded$0 = this.field_Rc.SetViewport(this.field_Rb, this.field_Ib, this.field_Z, this.field_jb, 0.0f, 1.0f);
    }

    final synchronized void b(int param0) {
        this.field_Ic.a((byte) 23);
        super.b(param0);
    }

    final sk b(int param0, byte param1) {
        int var3 = 0;
        tl var4 = null;
        L0: {
          if (param1 >= 31) {
            break L0;
          } else {
            var4 = (tl) null;
            this.a(55, (tl) null, -60);
            break L0;
          }
        }
        var3 = param0;
        if (3 == var3) {
          return (sk) ((Object) new jl((kr) (this), this.field_d));
        } else {
          if (4 == var3) {
            return (sk) ((Object) new jh((kr) (this), this.field_d, this.field_Tb));
          } else {
            if ((var3 ^ -1) != -9) {
              return super.b(param0, (byte) 54);
            } else {
              return (sk) ((Object) new qu((kr) (this), this.field_d, this.field_Tb));
            }
          }
        }
    }

    final float o(byte param0) {
        if (param0 != 42) {
            return -0.4905053675174713f;
        }
        return -0.5f;
    }

    final void a(int param0, nt param1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        this.a((ib) (param1), (byte) 95);
        if (!this.field_Qc[this.field_F]) {
            discarded$0 = this.field_Rc.SetSamplerState(this.field_F, 1, 1);
            this.field_Qc[this.field_F] = true;
        }
        if (param0 != 16) {
            this.h((byte) 54);
        }
        if (!this.field_sc[this.field_F]) {
            discarded$1 = this.field_Rc.SetSamplerState(this.field_F, 2, 1);
            this.field_sc[this.field_F] = true;
        }
    }

    final void r(int param0) {
        if (param0 != 0) {
            return;
        }
        int discarded$0 = this.field_Rc.a(174, this.field_Cb);
    }

    final void c() {
        this.field_Ic.b((byte) 57);
        super.c();
    }

    final void a(int param0, java.awt.Canvas param1, Object param2) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.h(true);
        }
    }

    private final static int a(boolean param0, st param1) {
        L0: {
          if (param0) {
            break L0;
          } else {
            field_Sc = (float[]) null;
            break L0;
          }
        }
        if (param1 == gj.field_b) {
          return 1;
        } else {
          if (tr.field_a == param1) {
            return 2;
          } else {
            if (qn.field_a != param1) {
              if (param1 != rl.field_o) {
                if (param1 != td.field_a) {
                  return 0;
                } else {
                  return 256;
                }
              } else {
                return 4;
              }
            } else {
              return 3;
            }
          }
        }
    }

    final void h(byte param0) {
        qi discarded$45 = null;
        this.field_y = (float)(this.field_x + -this.field_q);
        this.field_Xb = (float)(-this.field_p) + this.field_y;
        if (this.field_Xb < (float)this.field_Mb) {
            this.field_Xb = (float)this.field_Mb;
        }
        int discarded$21 = this.field_Rc.a(36, this.field_Xb);
        int discarded$36 = this.field_Rc.a(37, this.field_y);
        int discarded$44 = this.field_Rc.SetRenderState(34, this.field_X);
        if (param0 > -98) {
            byte[] var3 = (byte[]) null;
            discarded$45 = this.a(-42, true, (hd) null, 19, (byte) 125, 4, -18, (byte[]) null);
        }
    }

    final void m(int param0) {
        float discarded$0 = 0.0f;
        this.field_Nc.SetAmbient(this.field_g * this.field_Wb, this.field_Wb * this.field_rb, this.field_Wb * this.field_Hb, 0.0f);
        this.field_Mc = false;
        if (param0 > -108) {
            discarded$0 = this.o((byte) 24);
        }
    }

    final static int a(hd param0, la param1, boolean param2) {
        int discarded$2 = 0;
        ia var4 = null;
        L0: {
          if (!param2) {
            break L0;
          } else {
            var4 = (ia) null;
            discarded$2 = kr.a(-125, (ia) null);
            break L0;
          }
        }
        L1: {
          if (la.field_h != param1) {
            break L1;
          } else {
            if (wo.field_n == param0) {
              return 22;
            } else {
              if (lc.field_g == param0) {
                return 21;
              } else {
                if (ro.field_o == param0) {
                  return 28;
                } else {
                  if (param0 != wf.field_d) {
                    if (param0 != hh.field_c) {
                      if (param0 != aj.field_r) {
                        break L1;
                      } else {
                        return 77;
                      }
                    } else {
                      return 51;
                    }
                  } else {
                    return 50;
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    private final static int a(int param0, ia param1) {
        L0: {
          if (param0 >= 25) {
            break L0;
          } else {
            field_Jc = (int[]) null;
            break L0;
          }
        }
        if (param1 != wt.field_m) {
          if (bm.field_x != param1) {
            if (param1 == vj.field_g) {
              return 1;
            } else {
              if (tm.field_h != param1) {
                if (qp.field_j != param1) {
                  if (param1 != gh.field_i) {
                    throw new IllegalArgumentException("");
                  } else {
                    return 5;
                  }
                } else {
                  return 6;
                }
              } else {
                return 4;
              }
            }
          } else {
            return 3;
          }
        } else {
          return 2;
        }
    }

    final void a(og param0, int param1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        if (param1 <= 84) {
            this.j(91);
        }
        this.a((ib) (param0), (byte) -31);
        if ((!param0.field_j ? 1 : 0) == (this.field_Qc[this.field_F] ? 1 : 0)) {
            discarded$0 = this.field_Rc.SetSamplerState(this.field_F, 1, param0.field_j ? 1 : 3);
            this.field_Qc[this.field_F] = param0.field_j;
        }
        if (!((!this.field_sc[this.field_F] ? 1 : 0) == (!param0.field_g ? 1 : 0))) {
            discarded$1 = this.field_Rc.SetSamplerState(this.field_F, 2, param0.field_g ? 1 : 3);
            this.field_sc[this.field_F] = param0.field_g;
        }
    }

    final tl a(boolean param0, byte param1) {
        if (param1 <= 72) {
            this.m(-115);
        }
        return (tl) ((Object) new cj((kr) (this), param0));
    }

    final void l(byte param0) {
        qi discarded$16 = null;
        int discarded$17 = 0;
        int discarded$18 = 0;
        int discarded$19 = 0;
        int discarded$20 = 0;
        int discarded$21 = 0;
        int discarded$22 = 0;
        hd var3 = null;
        L0: {
          if (param0 > 39) {
            break L0;
          } else {
            var3 = (hd) null;
            discarded$16 = this.a((la) null, 12, 69, 77, (hd) null);
            break L0;
          }
        }
        L1: {
          if (this.field_zb == pi.field_x) {
            discarded$17 = this.field_Rc.SetRenderState(19, 5);
            discarded$18 = this.field_Rc.SetRenderState(20, 6);
            break L1;
          } else {
            if (this.field_zb == ne.field_i) {
              discarded$19 = this.field_Rc.SetRenderState(19, 2);
              discarded$20 = this.field_Rc.SetRenderState(20, 2);
              break L1;
            } else {
              if (this.field_zb == uc.field_l) {
                discarded$21 = this.field_Rc.SetRenderState(19, 9);
                discarded$22 = this.field_Rc.SetRenderState(20, 2);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
    }

    private kr(int param0, int param1, java.awt.Canvas param2, jaclib.peer.qt param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, cb param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, d param9, gk param10, int param11) {
        super(param2, param6, param9, param10, param11, 0);
        jagdx.GeometryBuffer discarded$3 = null;
        int discarded$4 = 0;
        int discarded$5 = 0;
        Throwable var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        this.field_Mc = false;
        this.field_Hc = 0;
        try {
          L0: {
            L1: {
              this.field_Bc = param8;
              this.field_wc = param4;
              this.field_Kc = param0;
              this.field_Ic = param3;
              this.field_tc = param1;
              this.field_xc = param6;
              this.field_Rc = param5;
              this.field_Pc = param7;
              this.field_Nc = new jagdx.D3DLIGHT(this.field_Ic);
              this.field_yc = new jagdx.D3DLIGHT(this.field_Ic);
              this.field_Fc = new jagdx.D3DLIGHT(this.field_Ic);
              this.field_Ec = new jagdx.PixelBuffer(this.field_Ic);
              this.field_vc = new jagdx.GeometryBuffer(this.field_Ic);
              discarded$3 = new jagdx.GeometryBuffer(this.field_Ic);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((this.field_Bc.TextureCaps & 2) != 0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((kr) (this)).field_Dc = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 == (this.field_Bc.TextureCaps & 65536)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((kr) (this)).field_rc = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (0 == (16384 & this.field_Bc.TextureCaps)) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((kr) (this)).field_Gc = stackIn_10_1 != 0;
              this.field_h = this.field_Bc.MaxSimultaneousTextures;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if ((this.field_Bc.TextureCaps & 8192) == 0) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((kr) (this)).field_J = stackIn_13_1 != 0;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if ((this.field_Bc.MaxActiveLights ^ -1) < -1) {
                stackOut_15_0 = this;
                stackOut_15_1 = this.field_Bc.MaxActiveLights;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 8;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            L6: {
              ((kr) (this)).field_fc = stackIn_16_1;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if ((2048 & this.field_Bc.TextureCaps) == 0) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            L7: {
              ((kr) (this)).field_Pb = stackIn_19_1 != 0;
              if ((this.field_lc ^ -1) < -1) {
                break L7;
              } else {
                discarded$4 = this.field_wc.CheckDeviceMultiSampleType(this.field_Kc, this.field_tc, this.field_Pc.BackBufferFormat, true, 2);
                break L7;
              }
            }
            this.field_Oc = new ke[this.field_h];
            this.field_sc = new boolean[this.field_h];
            this.field_Qc = new boolean[this.field_h];
            this.field_Ac = new boolean[this.field_h];
            this.field_Cc = new int[this.field_h];
            this.field_Lc = new boolean[this.field_h];
            discarded$5 = this.field_Rc.BeginScene();
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          this.a(-9);
          throw new RuntimeException("");
        }
    }

    final void l(int param0) {
        this.t((byte) 119);
        if (param0 != -30535) {
            return;
        }
        this.s((byte) -94);
    }

    final void a(jb param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (param3 >= 90) {
            break L0;
          } else {
            this.w((byte) -7);
            break L0;
          }
        }
        L1: {
          var6 = 0;
          var7 = param1;
          if (1 == var7) {
            var5 = 6;
            break L1;
          } else {
            if (2 == var7) {
              var5 = 27;
              break L1;
            } else {
              var5 = 5;
              break L1;
            }
          }
        }
        L2: {
          if (!param2) {
            break L2;
          } else {
            var6 = var6 | 16;
            break L2;
          }
        }
        int discarded$1 = this.field_Rc.SetTextureStageState(this.field_F, var5, var6 | kr.a(param0, (byte) -68));
    }

    final go a(int param0, int param1, boolean param2, int[][] param3) {
        int var5 = -45 / ((param1 - 18) / 51);
        return (go) ((Object) new tc((kr) (this), param0, param2, param3));
    }

    final void s(byte param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int discarded$2 = 0;
        int discarded$3 = 0;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (param0 != -94) {
            jb var3 = (jb) null;
            this.a(true, 113, false, (jb) null, false);
        }
        if (!(this.field_Mc)) {
            discarded$0 = this.field_Rc.LightEnable(0, false);
            discarded$1 = this.field_Rc.LightEnable(1, false);
            discarded$2 = this.field_Rc.SetLight(0, this.field_Nc);
            discarded$3 = this.field_Rc.SetLight(1, this.field_yc);
            discarded$4 = this.field_Rc.LightEnable(0, true);
            discarded$5 = this.field_Rc.LightEnable(1, true);
            this.field_Mc = true;
        }
    }

    static {
        field_uc = new int[]{77, 80};
        field_Sc = new float[16];
        field_Jc = new int[]{22, 23};
    }
}
