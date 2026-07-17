/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jagdx.IDirect3DDevice;

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
        cj var4 = (cj) (Object) param1;
        int discarded$0 = ((kr) this).field_Rc.SetStreamSource(param2, var4.field_f, 0, var4.b(param0));
    }

    final bp a(int param0, int param1, int param2, hd param3, int param4, byte[] param5) {
        if (param1 > -93) {
            ((kr) this).field_Qc = null;
        }
        return (bp) (Object) new nt((kr) this, param3, param2, param0, param4, param5);
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
              return stackIn_4_0 != 0;
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
                        var8 = param0;
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
                                          if (param5.CheckDepthStencilMatch(param4, param3, var13.Format, field_Jc[var11], field_uc[var12]) != -1) {
                                            break L8;
                                          } else {
                                            L9: {
                                              if (param0 == 0) {
                                                break L9;
                                              } else {
                                                if (-1 == param5.CheckDeviceMultiSampleType(param4, param3, field_uc[var11], true, var8)) {
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
                  if (param0 < 0) {
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
                        break L0;
                      }
                    }
                  }
                }
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                return stackIn_31_0 != 0;
              }
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          return false;
        }
        return stackIn_33_0 != 0;
    }

    final void a(int param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = -25 / ((param0 - -55) / 42);
        int discarded$0 = ((kr) this).field_Rc.SetPixelShader(param1);
    }

    final void I(int param0) {
        int var2 = -74 / ((27 - param0) / 38);
        int discarded$0 = ((kr) this).field_Rc.SetScissorRect(((kr) this).field_Rb - -((kr) this).field_R, ((kr) this).field_Nb + ((kr) this).field_Ib, ((kr) this).field_gc, ((kr) this).field_V);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        jagdx.IDirect3DSurface var9 = null;
        int var10 = 0;
        int var11 = 0;
        jagdx.IDirect3DSurface var12 = null;
        L0: {
          var12 = ((kr) this).field_Rc.c(0);
          var9 = ((kr) this).field_Rc.a(param2, param3, 21, 0, 0, true);
          if (jagdx.gf.a((byte) 93, var9.LockRect(0, 0, param2, param3, 0, ((kr) this).field_Ec))) {
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
                var10 = ((kr) this).field_Ec.getRowPitch();
                if (param6 != param2) {
                  break L3;
                } else {
                  if (var10 != 4 * param2) {
                    break L3;
                  } else {
                    ((kr) this).field_Ec.a(param4, param5, 0, param2 * param3);
                    break L2;
                  }
                }
              }
              var11 = 0;
              L4: while (true) {
                if (var11 >= param3) {
                  break L2;
                } else {
                  ((kr) this).field_Ec.a(param4, param6 * var11 + param5, var10 * var11, param2);
                  var11++;
                  continue L4;
                }
              }
            }
            boolean discarded$4 = var9.UnlockRect();
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$5 = ((kr) this).field_Rc.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
    }

    final void V(int param0) {
        ((kr) this).field_Nc.SetDirection(-((kr) this).field_Jb[0], -((kr) this).field_Jb[1], -((kr) this).field_Jb[2]);
        ((kr) this).field_yc.SetDirection(-((kr) this).field_Gb[param0], -((kr) this).field_Gb[1], -((kr) this).field_Gb[2]);
        ((kr) this).field_Mc = false;
    }

    final Object a(int param0, java.awt.Canvas param1) {
        if (param0 == -15083) {
            return null;
        }
        sk discarded$0 = ((kr) this).b(26, (byte) 42);
        return null;
    }

    final void a(jagdx.IDirect3DVertexShader param0, int param1) {
        ((kr) this).field_zc = param0;
        if (param1 != 5243) {
            ((kr) this).field_vc = null;
        }
        int discarded$0 = ((kr) this).field_Rc.SetVertexShader(param0);
        ((kr) this).p(-119);
    }

    final void b(boolean param0) {
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
            stackOut_0_0 = ((kr) this).field_Rc;
            stackOut_0_1 = 28;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!((kr) this).field_I) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) (Object) stackIn_1_0;
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!((kr) this).field_o) {
                break L1;
              } else {
                stackOut_2_0 = (jagdx.IDirect3DDevice) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (((kr) this).field_p < 0) {
                  break L1;
                } else {
                  stackOut_3_0 = (jagdx.IDirect3DDevice) (Object) stackIn_3_0;
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
          stackOut_4_0 = (jagdx.IDirect3DDevice) (Object) stackIn_4_0;
          stackOut_4_1 = stackIn_4_1;
          stackOut_4_2 = 0;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          stackIn_5_2 = stackOut_4_2;
          break L0;
        }
        L2: {
          int discarded$4 = ((jagdx.IDirect3DDevice) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2 != 0);
          if (!param0) {
            break L2;
          } else {
            ((kr) this).field_Fc = null;
            break L2;
          }
        }
    }

    final void b(int param0, int param1) throws lp {
        L0: {
          int discarded$23 = ((kr) this).field_Rc.EndScene();
          if (!((kr) this).field_xc.a(false)) {
            int fieldTemp$24 = ((kr) this).field_Hc + 1;
            ((kr) this).field_Hc = ((kr) this).field_Hc + 1;
            if (fieldTemp$24 <= 50) {
              boolean discarded$25 = this.h(true);
              break L0;
            } else {
              throw new lp();
            }
          } else {
            ((kr) this).field_Hc = 0;
            if (jagdx.gf.a(-1, ((kr) this).field_xc.a(0, -96))) {
              boolean discarded$26 = this.h(true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        int discarded$27 = ((kr) this).field_Rc.BeginScene();
    }

    final void G(int param0) {
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((kr) this).field_h) {
            int discarded$15 = ((kr) this).field_Rc.SetTextureStageState(0, 6, 1);
            int discarded$16 = ((kr) this).field_Rc.SetRenderState(9, 2);
            int discarded$17 = ((kr) this).field_Rc.SetRenderState(23, 4);
            int discarded$18 = ((kr) this).field_Rc.SetRenderState(25, 5);
            var2 = 39 / ((param0 - -65) / 51);
            int discarded$19 = ((kr) this).field_Rc.SetRenderState(24, 0);
            int discarded$20 = ((kr) this).field_Rc.SetRenderState(22, 2);
            int discarded$21 = ((kr) this).field_Rc.SetRenderState(147, 1);
            int discarded$22 = ((kr) this).field_Rc.SetRenderState(145, 1);
            int discarded$23 = ((kr) this).field_Rc.a(38, 0.949999988079071f);
            int discarded$24 = ((kr) this).field_Rc.SetRenderState(140, 3);
            ((kr) this).field_Nc.SetType(3);
            ((kr) this).field_yc.SetType(3);
            ((kr) this).field_Fc.SetType(1);
            ((kr) this).field_Mc = false;
            super.G(1);
            return;
          } else {
            int discarded$25 = ((kr) this).field_Rc.SetSamplerState(var2, 7, 0);
            int discarded$26 = ((kr) this).field_Rc.SetSamplerState(var2, 6, 2);
            int discarded$27 = ((kr) this).field_Rc.SetSamplerState(var2, 5, 2);
            int discarded$28 = ((kr) this).field_Rc.SetSamplerState(var2, 1, 1);
            int discarded$29 = ((kr) this).field_Rc.SetSamplerState(var2, 2, 1);
            ((kr) this).field_Oc[var2] = fg.field_A;
            var3 = ((kr) this).field_Qc;
            var4 = var2;
            ((kr) this).field_sc[var2] = true;
            var3[var4] = true;
            ((kr) this).field_Ac[var2] = false;
            ((kr) this).field_Cc[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final void a(ib param0, byte param1) {
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
          int discarded$5 = ((kr) this).field_Rc.SetTexture(((kr) this).field_F, param0.b(110));
          var3 = -65 % ((param1 - 26) / 32);
          if (((kr) this).field_Oc[((kr) this).field_F] != param0.field_a) {
            L1: {
              var4 = kr.a(param0.field_a, 2);
              int discarded$6 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 6, var4);
              int discarded$7 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 5, var4);
              ((kr) this).field_Oc[((kr) this).field_F] = param0.field_a;
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
              if (((kr) this).field_Ac[((kr) this).field_F]) {
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
                stackOut_17_0 = ((kr) this).field_Rc;
                stackOut_17_1 = ((kr) this).field_F;
                stackOut_17_2 = 7;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                if (!param0.field_b) {
                  stackOut_19_0 = (jagdx.IDirect3DDevice) (Object) stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = stackIn_19_2;
                  stackOut_19_3 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  stackIn_20_3 = stackOut_19_3;
                  break L3;
                } else {
                  stackOut_18_0 = (jagdx.IDirect3DDevice) (Object) stackIn_18_0;
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
              int discarded$8 = ((jagdx.IDirect3DDevice) (Object) stackIn_20_0).SetSamplerState(stackIn_20_1, stackIn_20_2, stackIn_20_3);
              ((kr) this).field_Ac[((kr) this).field_F] = param0.field_b;
              break L0;
            }
          } else {
            L4: {
              if (((kr) this).field_Ac[((kr) this).field_F]) {
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
                stackOut_6_0 = ((kr) this).field_Rc;
                stackOut_6_1 = ((kr) this).field_F;
                stackOut_6_2 = 7;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                if (!param0.field_b) {
                  stackOut_8_0 = (jagdx.IDirect3DDevice) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = stackIn_8_2;
                  stackOut_8_3 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  break L5;
                } else {
                  stackOut_7_0 = (jagdx.IDirect3DDevice) (Object) stackIn_7_0;
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
              int discarded$9 = ((jagdx.IDirect3DDevice) (Object) stackIn_9_0).SetSamplerState(stackIn_9_1, stackIn_9_2, stackIn_9_3);
              ((kr) this).field_Ac[((kr) this).field_F] = param0.field_b;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L6: {
          if (!((kr) this).field_Lc[((kr) this).field_F]) {
            ((kr) this).field_Lc[((kr) this).field_F] = true;
            ((kr) this).m((byte) -126);
            ((kr) this).N(0);
            break L6;
          } else {
            break L6;
          }
        }
    }

    final qi a(la param0, int param1, int param2, int param3, hd param4) {
        if (param1 != 8) {
            return null;
        }
        return (qi) (Object) new og((kr) this, param4, param0, param3, param2);
    }

    private final static int a(ke param0, int param1) {
        if (fg.field_A == param0) {
            return 2;
        }
        if (!(param0 != jp.field_a)) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    final void w(int param0) {
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
            stackOut_0_0 = ((kr) this).field_Rc;
            stackOut_0_1 = 14;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!((kr) this).field_mb) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) (Object) stackIn_1_0;
              stackOut_1_1 = stackIn_1_1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!((kr) this).field_Y) {
                break L1;
              } else {
                stackOut_2_0 = (jagdx.IDirect3DDevice) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L0;
              }
            }
          }
          stackOut_3_0 = (jagdx.IDirect3DDevice) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          break L0;
        }
        L2: {
          int discarded$4 = ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0);
          if (param0 == 0) {
            break L2;
          } else {
            ((kr) this).field_yc = null;
            break L2;
          }
        }
    }

    final void j(int param0) {
        if (((kr) this).field_Lc[((kr) this).field_F]) {
            ((kr) this).field_Lc[((kr) this).field_F] = false;
            int discarded$0 = ((kr) this).field_Rc.SetTexture(((kr) this).field_F, (jagdx.IDirect3DBaseTexture) null);
            ((kr) this).m((byte) -128);
            ((kr) this).N(0);
        }
        if (param0 != 1) {
            boolean discarded$1 = ((kr) this).d();
        }
    }

    final void g(int param0) {
        if (param0 != 0) {
            ((kr) this).r(6);
        }
        int discarded$0 = ((kr) this).field_Rc.SetRenderState(60, ((kr) this).field_cc);
    }

    final void p(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (((kr) this).field_zc != null) {
              break L1;
            } else {
              if (mq.field_g != ((kr) this).field_f[((kr) this).field_F]) {
                L2: {
                  if (((kr) this).field_f[((kr) this).field_F] == tr.field_a) {
                    int discarded$5 = ((kr) this).field_Rc.SetTransform(((kr) this).field_F + 16, ((kr) this).field_L[((kr) this).field_F].b(field_Sc, 3911));
                    break L2;
                  } else {
                    int discarded$6 = ((kr) this).field_Rc.SetTransform(((kr) this).field_F + 16, ((kr) this).field_L[((kr) this).field_F].a(field_Sc, true));
                    break L2;
                  }
                }
                var2 = kr.a(true, ((kr) this).field_f[((kr) this).field_F]);
                if (var2 == ((kr) this).field_Cc[((kr) this).field_F]) {
                  break L0;
                } else {
                  int discarded$7 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 24, var2);
                  ((kr) this).field_Cc[((kr) this).field_F] = var2;
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          int discarded$8 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 24, 0);
          ((kr) this).field_Cc[((kr) this).field_F] = 0;
          break L0;
        }
        L3: {
          if (param0 < -111) {
            break L3;
          } else {
            ((kr) this).field_tc = 4;
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
          if (var8 == 1) {
            var6 = 3;
            break L0;
          } else {
            if (var8 == 2) {
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
            ((kr) this).p((byte) 127);
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
        int discarded$1 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, var6, var7 | kr.a(param3, (byte) -68));
    }

    final void a(pa param0, boolean param1) {
    }

    final void u(byte param0) {
        int discarded$7 = ((kr) this).field_Rc.a(15, ((kr) this).field_Vb);
        if (param0 > -29) {
            go discarded$8 = ((kr) this).a(-112, -74, false, (int[][]) null);
        }
    }

    final void w(byte param0) {
        if (param0 > -40) {
            field_uc = null;
        }
    }

    final void t(byte param0) {
        float var2 = ((kr) this).field_Ab ? ((kr) this).field_fb : 0.0f;
        int var3 = 92 % ((param0 - 17) / 37);
        float var4 = ((kr) this).field_Ab ? -((kr) this).field_ub : 0.0f;
        ((kr) this).field_Nc.SetDiffuse(var2 * ((kr) this).field_g, ((kr) this).field_rb * var2, ((kr) this).field_Hb * var2, 0.0f);
        ((kr) this).field_yc.SetDiffuse(var4 * ((kr) this).field_g, var4 * ((kr) this).field_rb, ((kr) this).field_Hb * var4, 0.0f);
        ((kr) this).field_Mc = false;
    }

    final gd a(int param0, int param1) {
        return null;
    }

    final void m(byte param0) {
        if (param0 >= -124) {
            ((kr) this).field_Rc = null;
        }
        int var2 = ((kr) this).field_Lc[((kr) this).field_F] ? kr.a(((kr) this).field_w[((kr) this).field_F], true) : 1;
        int discarded$0 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 4, var2);
    }

    final static ha createToolkit(java.awt.Canvas param0, d param1, gk param2, Integer param3) {
        Object var12_ref = null;
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
        var12_ref = null;
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
                if ((2 & var9.TextureOpCaps) == 0) {
                  throw new RuntimeException("");
                } else {
                  if ((var9.TextureOpCaps & 8) == 0) {
                    throw new RuntimeException("");
                  } else {
                    if ((64 & var9.TextureOpCaps) == 0) {
                      throw new RuntimeException("");
                    } else {
                      if ((var9.TextureOpCaps & 512) == 0) {
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
                              if ((var9.SrcBlendCaps & var9.DestBlendCaps & 2) != 0) {
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
                                if (var9.MaxStreams >= 5) {
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
                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L4: {
                                        var14 = (jagdx.ie) (Object) decompiledCaughtException;
                                        var12 = var8_ref.a(var5_int, var6, param0, var11 | 32, var10_ref);
                                        break L4;
                                      }
                                    }
                                    var13 = new cb(var12.b(0), var12.b());
                                    var15 = new kr(var5_int, var6, param0, var7, var8_ref, var12, var13, var10_ref, var9, param1, param2, param3.intValue());
                                    var4 = (Object) (Object) var15;
                                    var15.f((byte) 101);
                                    stackOut_42_0 = (kr) var15;
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
              ((kr) var4).c();
              break L5;
            } else {
              break L5;
            }
          }
          throw var5;
        }
        return (ha) (Object) stackIn_43_0;
    }

    final void N(int param0) {
        int var2 = ((kr) this).field_Lc[((kr) this).field_F] ? kr.a(((kr) this).field_H[((kr) this).field_F], true) : 1;
        int discarded$9 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 1, var2);
        if (param0 != 0) {
            ((kr) this).field_Mc = true;
        }
    }

    final void b(byte param0) {
        if (((kr) this).field_Lb) {
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
            float[] discarded$0 = ((kr) this).field_ec.a(field_Sc, true);
        }
        int discarded$1 = ((kr) this).field_Rc.SetTransform(256, field_Sc);
        int var2 = 15 / ((9 - param0) / 48);
    }

    final qi a(int param0, boolean param1, hd param2, int param3, byte param4, int param5, int param6, byte[] param7) {
        if (param4 < 73) {
            Object var10 = null;
            ((kr) this).a((nf) null, true);
        }
        return (qi) (Object) new og((kr) this, param2, param0, param3, param1, param7, param6, param5);
    }

    final void a(fa param0, byte param1) {
        dxVertexLayout var3 = (dxVertexLayout) (Object) param0;
        if (param1 != 75) {
            return;
        }
        int discarded$0 = ((kr) this).field_Rc.SetVertexDeclaration(var3.field_d);
    }

    final void e() {
    }

    final void d(boolean param0) {
        if (param0) {
            Object var3 = null;
            boolean discarded$0 = ((kr) this).a((la) null, -42, (hd) null);
        }
        int discarded$1 = ((kr) this).field_Rc.a(7, ((kr) this).field_ib);
    }

    final void p(byte param0) {
        if (param0 >= -127) {
            Object var3 = null;
            boolean discarded$0 = kr.a(-104, (jagdx.D3DPRESENT_PARAMETERS) null, (byte) -33, 21, -35, (jagdx.IDirect3D) null);
        }
        int discarded$1 = ((kr) this).field_Rc.a(27, ((kr) this).field_Db);
    }

    final sm a(ra param0, gd param1) {
        return null;
    }

    final void b(byte param0, boolean param1) {
        int discarded$6 = ((kr) this).field_Rc.a(161, param1);
        if (param0 >= -113) {
            ((kr) this).field_Hc = -52;
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
            ((kr) this).field_Pc = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!jagdx.gf.a((byte) 96, ((kr) this).field_wc.a(((kr) this).field_Kc, var4))) {
              break L2;
            } else {
              if (!jagdx.gf.a((byte) 78, ((kr) this).field_wc.CheckDeviceFormat(((kr) this).field_Kc, ((kr) this).field_tc, var4.Format, 0, 3, kr.a(param2, param0, false)))) {
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
        ((kr) this).d(false);
        return null;
    }

    final void a(nf param0, boolean param1) {
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
          int discarded$2 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 11, ((kr) this).field_F | var3);
          return;
        } else {
          return;
        }
    }

    final boolean d() {
        return false;
    }

    final void v(int param0) {
        if (((kr) this).field_bb.b((byte) -92)) {
            float[] discarded$1 = ((kr) this).field_t.a(field_Sc, true);
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
            Object var3 = null;
            ((kr) this).a(-26, (java.awt.Canvas) null, (Object) null);
        }
        int discarded$2 = ((kr) this).field_Rc.SetTransform(2, field_Sc);
    }

    final void a(sm param0) {
    }

    final void T(int param0) {
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
              stackOut_2_0 = ((kr) this).field_Rc;
              stackOut_2_1 = 137;
              stackIn_5_0 = stackOut_2_0;
              stackIn_5_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (!((kr) this).field_ob) {
                break L1;
              } else {
                stackOut_3_0 = (jagdx.IDirect3DDevice) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (((kr) this).field_pc) {
                  break L1;
                } else {
                  stackOut_4_0 = (jagdx.IDirect3DDevice) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  break L0;
                }
              }
            }
            stackOut_5_0 = (jagdx.IDirect3DDevice) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L0;
          }
          int discarded$2 = ((jagdx.IDirect3DDevice) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0);
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
              if (!jagdx.gf.a((byte) 122, ((kr) this).field_wc.a(((kr) this).field_Kc, var4))) {
                break L1;
              } else {
                if (!jagdx.gf.a((byte) 112, ((kr) this).field_wc.CheckDeviceFormat(((kr) this).field_Kc, ((kr) this).field_tc, var4.Format, 0, 4, kr.a(param2, param1, false)))) {
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
        int discarded$10 = ((kr) this).field_Rc.DrawPrimitive(kr.a(41, param1), param3, param2);
        if (!param0) {
            ((kr) this).field_Gc = false;
        }
    }

    final void C(int param0) {
        int discarded$7 = ((kr) this).field_Rc.SetTransform(3, ((kr) this).field_N);
        if (param0 > -51) {
            Object var3 = null;
            ((kr) this).a((pa) null, true);
        }
    }

    final void k(byte param0) {
        int var2 = 0;
        sf var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        Object var7 = null;
        L0: {
          var2 = 0;
          if (param0 >= 123) {
            break L0;
          } else {
            var7 = null;
            ((kr) this).a((pa) null, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ((kr) this).field_B) {
            L2: while (true) {
              if (((kr) this).field_ic <= var2) {
                super.k((byte) 127);
                return;
              } else {
                boolean discarded$3 = ((kr) this).field_Rc.LightEnable(2 + var2, false);
                var2++;
                continue L2;
              }
            }
          } else {
            var3 = ((kr) this).field_D[var2];
            var4 = 2 + var2;
            var5 = var3.a(87);
            var6 = var3.a(false) / 255.0f;
            ((kr) this).field_Fc.SetPosition((float)var3.c((byte) -98), (float)var3.a((byte) -102), (float)var3.e(0));
            ((kr) this).field_Fc.SetDiffuse(var6 * (float)((16721490 & var5) >> 16), (float)((65478 & var5) >> 8) * var6, (float)(255 & var5) * var6, 0.0f);
            ((kr) this).field_Fc.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.d(0) * var3.d(0)));
            ((kr) this).field_Fc.SetRange((float)var3.d(0));
            int discarded$4 = ((kr) this).field_Rc.SetLight(var4, ((kr) this).field_Fc);
            boolean discarded$5 = ((kr) this).field_Rc.LightEnable(var4, true);
            var2++;
            continue L1;
          }
        }
    }

    final qi a(int param0, boolean param1, boolean param2, int param3, int param4, int[] param5, int param6) {
        if (!param1) {
            return null;
        }
        return (qi) (Object) new og((kr) this, param6, param3, param2, param5, param0, param4);
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
                  throw new IllegalArgumentException();
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
            ((kr) this).w(-85);
        }
        return (ti) (Object) new dm((kr) this, la.field_b, param0);
    }

    final fa a(pl[] param0, int param1) {
        if (param1 > -126) {
            ((kr) this).w((byte) -105);
        }
        return (fa) (Object) new dxVertexLayout((kr) this, param0);
    }

    private final static int a(jb param0, byte param1) {
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
        if (param1 >= -76) {
            Object var4 = null;
            int discarded$0 = kr.a(true, (st) null);
        }
        int discarded$1 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 11, param0);
    }

    private final boolean h(boolean param0) {
        int var4 = 0;
        int var2 = ((kr) this).field_Rc.TestCooperativeLevel();
        if (0 != var2) {
            if (var2 != -2005530519) {
                return false;
            }
        }
        cb var3 = (cb) ((kr) this).field_Fb;
        ((kr) this).o(0);
        var3.a((byte) -83);
        ((kr) this).field_Pc.BackBufferWidth = 0;
        ((kr) this).field_Pc.BackBufferHeight = 0;
        if (!(!kr.a(((kr) this).field_lc, ((kr) this).field_Pc, (byte) 114, ((kr) this).field_tc, ((kr) this).field_Kc, ((kr) this).field_wc))) {
            var4 = ((kr) this).field_Rc.Reset(((kr) this).field_Pc);
            if (jagdx.gf.a((byte) 78, var4)) {
                var3.a(((kr) this).field_Rc.b(), ((kr) this).field_Rc.b(0), 0);
                ((kr) this).c((byte) 61);
                ((kr) this).G(117);
                return true;
            }
        }
        return false;
    }

    final void Q(int param0) {
        if (param0 <= 52) {
            return;
        }
        int discarded$0 = ((kr) this).field_Rc.SetViewport(((kr) this).field_Rb, ((kr) this).field_Ib, ((kr) this).field_Z, ((kr) this).field_jb, 0.0f, 1.0f);
    }

    final synchronized void b(int param0) {
        ((kr) this).field_Ic.a((byte) 23);
        super.b(param0);
    }

    final sk b(int param0, byte param1) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          if (param1 >= 31) {
            break L0;
          } else {
            var4 = null;
            ((kr) this).a(55, (tl) null, -60);
            break L0;
          }
        }
        var3 = param0;
        if (3 == var3) {
          return (sk) (Object) new jl((kr) this, ((kr) this).field_d);
        } else {
          if (4 == var3) {
            return (sk) (Object) new jh((kr) this, ((kr) this).field_d, ((kr) this).field_Tb);
          } else {
            if (var3 != 8) {
              return super.b(param0, (byte) 54);
            } else {
              return (sk) (Object) new qu((kr) this, ((kr) this).field_d, ((kr) this).field_Tb);
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
        ((kr) this).a((ib) (Object) param1, (byte) 95);
        if (!((kr) this).field_Qc[((kr) this).field_F]) {
            int discarded$0 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 1, 1);
            ((kr) this).field_Qc[((kr) this).field_F] = true;
        }
        if (param0 != 16) {
            ((kr) this).h((byte) 54);
        }
        if (!((kr) this).field_sc[((kr) this).field_F]) {
            int discarded$1 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 2, 1);
            ((kr) this).field_sc[((kr) this).field_F] = true;
        }
    }

    final void r(int param0) {
        if (param0 != 0) {
            return;
        }
        int discarded$0 = ((kr) this).field_Rc.a(174, ((kr) this).field_Cb);
    }

    final void c() {
        ((kr) this).field_Ic.b((byte) 57);
        super.c();
    }

    final void a(int param0, java.awt.Canvas param1, Object param2) {
        if (param0 != 0) {
            boolean discarded$0 = this.h(true);
        }
    }

    private final static int a(boolean param0, st param1) {
        L0: {
          if (param0) {
            break L0;
          } else {
            field_Sc = null;
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
        ((kr) this).field_y = (float)(((kr) this).field_x + -((kr) this).field_q);
        ((kr) this).field_Xb = (float)(-((kr) this).field_p) + ((kr) this).field_y;
        if (((kr) this).field_Xb < (float)((kr) this).field_Mb) {
            ((kr) this).field_Xb = (float)((kr) this).field_Mb;
        }
        int discarded$21 = ((kr) this).field_Rc.a(36, ((kr) this).field_Xb);
        int discarded$36 = ((kr) this).field_Rc.a(37, ((kr) this).field_y);
        int discarded$44 = ((kr) this).field_Rc.SetRenderState(34, ((kr) this).field_X);
        if (param0 > -98) {
            Object var3 = null;
            qi discarded$45 = ((kr) this).a(-42, true, (hd) null, 19, (byte) 125, 4, -18, (byte[]) null);
        }
    }

    final void m(int param0) {
        ((kr) this).field_Nc.SetAmbient(((kr) this).field_g * ((kr) this).field_Wb, ((kr) this).field_Wb * ((kr) this).field_rb, ((kr) this).field_Wb * ((kr) this).field_Hb, 0.0f);
        ((kr) this).field_Mc = false;
        if (param0 > -108) {
            float discarded$0 = ((kr) this).o((byte) 24);
        }
    }

    final static int a(hd param0, la param1, boolean param2) {
        Object var4 = null;
        L0: {
          if (!param2) {
            break L0;
          } else {
            var4 = null;
            int discarded$2 = kr.a(-125, (ia) null);
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
            field_Jc = null;
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
        if (param1 <= 84) {
            ((kr) this).j(91);
        }
        ((kr) this).a((ib) (Object) param0, (byte) -31);
        if ((!param0.field_j ? 1 : 0) == (((kr) this).field_Qc[((kr) this).field_F] ? 1 : 0)) {
            int discarded$0 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 1, param0.field_j ? 1 : 3);
            ((kr) this).field_Qc[((kr) this).field_F] = param0.field_j;
        }
        if (!((!((kr) this).field_sc[((kr) this).field_F] ? 1 : 0) == (!param0.field_g ? 1 : 0))) {
            int discarded$1 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 2, param0.field_g ? 1 : 3);
            ((kr) this).field_sc[((kr) this).field_F] = param0.field_g;
        }
    }

    final tl a(boolean param0, byte param1) {
        if (param1 <= 72) {
            ((kr) this).m(-115);
        }
        return (tl) (Object) new cj((kr) this, param0);
    }

    final void l(byte param0) {
        Object var3 = null;
        L0: {
          if (param0 > 39) {
            break L0;
          } else {
            var3 = null;
            qi discarded$16 = ((kr) this).a((la) null, 12, 69, 77, (hd) null);
            break L0;
          }
        }
        L1: {
          if (((kr) this).field_zb == pi.field_x) {
            int discarded$17 = ((kr) this).field_Rc.SetRenderState(19, 5);
            int discarded$18 = ((kr) this).field_Rc.SetRenderState(20, 6);
            break L1;
          } else {
            if (((kr) this).field_zb == ne.field_i) {
              int discarded$19 = ((kr) this).field_Rc.SetRenderState(19, 2);
              int discarded$20 = ((kr) this).field_Rc.SetRenderState(20, 2);
              break L1;
            } else {
              if (((kr) this).field_zb == uc.field_l) {
                int discarded$21 = ((kr) this).field_Rc.SetRenderState(19, 9);
                int discarded$22 = ((kr) this).field_Rc.SetRenderState(20, 2);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
    }

    private kr(int param0, int param1, java.awt.Canvas param2, jaclib.peer.qt param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, cb param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, d param9, gk param10, int param11) {
        super(param2, (Object) (Object) param6, param9, param10, param11, 0);
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
        ((kr) this).field_Mc = false;
        ((kr) this).field_Hc = 0;
        try {
          L0: {
            L1: {
              ((kr) this).field_Bc = param8;
              ((kr) this).field_wc = param4;
              ((kr) this).field_Kc = param0;
              ((kr) this).field_Ic = param3;
              ((kr) this).field_tc = param1;
              ((kr) this).field_xc = param6;
              ((kr) this).field_Rc = param5;
              ((kr) this).field_Pc = param7;
              ((kr) this).field_Nc = new jagdx.D3DLIGHT(((kr) this).field_Ic);
              ((kr) this).field_yc = new jagdx.D3DLIGHT(((kr) this).field_Ic);
              ((kr) this).field_Fc = new jagdx.D3DLIGHT(((kr) this).field_Ic);
              ((kr) this).field_Ec = new jagdx.PixelBuffer(((kr) this).field_Ic);
              ((kr) this).field_vc = new jagdx.GeometryBuffer(((kr) this).field_Ic);
              jagdx.GeometryBuffer discarded$3 = new jagdx.GeometryBuffer(((kr) this).field_Ic);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((((kr) this).field_Bc.TextureCaps & 2) != 0) {
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
              ((kr) this).field_Dc = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 == (((kr) this).field_Bc.TextureCaps & 65536)) {
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
              ((kr) this).field_rc = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (0 == (16384 & ((kr) this).field_Bc.TextureCaps)) {
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
              ((kr) this).field_Gc = stackIn_10_1 != 0;
              ((kr) this).field_h = ((kr) this).field_Bc.MaxSimultaneousTextures;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if ((((kr) this).field_Bc.TextureCaps & 8192) == 0) {
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
              ((kr) this).field_J = stackIn_13_1 != 0;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (((kr) this).field_Bc.MaxActiveLights > 0) {
                stackOut_15_0 = this;
                stackOut_15_1 = ((kr) this).field_Bc.MaxActiveLights;
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
              ((kr) this).field_fc = stackIn_16_1;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if ((2048 & ((kr) this).field_Bc.TextureCaps) == 0) {
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
              ((kr) this).field_Pb = stackIn_19_1 != 0;
              if (((kr) this).field_lc > 0) {
                break L7;
              } else {
                int discarded$4 = ((kr) this).field_wc.CheckDeviceMultiSampleType(((kr) this).field_Kc, ((kr) this).field_tc, ((kr) this).field_Pc.BackBufferFormat, true, 2);
                break L7;
              }
            }
            ((kr) this).field_Oc = new ke[((kr) this).field_h];
            ((kr) this).field_sc = new boolean[((kr) this).field_h];
            ((kr) this).field_Qc = new boolean[((kr) this).field_h];
            ((kr) this).field_Ac = new boolean[((kr) this).field_h];
            ((kr) this).field_Cc = new int[((kr) this).field_h];
            ((kr) this).field_Lc = new boolean[((kr) this).field_h];
            int discarded$5 = ((kr) this).field_Rc.BeginScene();
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          ((kr) this).a(-9);
          throw new RuntimeException("");
        }
    }

    final void l(int param0) {
        ((kr) this).t((byte) 119);
        if (param0 != -30535) {
            return;
        }
        ((kr) this).s((byte) -94);
    }

    final void a(jb param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (param3 >= 90) {
            break L0;
          } else {
            ((kr) this).w((byte) -7);
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
        int discarded$1 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, var5, var6 | kr.a(param0, (byte) -68));
    }

    final go a(int param0, int param1, boolean param2, int[][] param3) {
        int var5 = -45 / ((param1 - 18) / 51);
        return (go) (Object) new tc((kr) this, param0, param2, param3);
    }

    final void s(byte param0) {
        if (param0 != -94) {
            Object var3 = null;
            ((kr) this).a(true, 113, false, (jb) null, false);
        }
        if (!(((kr) this).field_Mc)) {
            boolean discarded$0 = ((kr) this).field_Rc.LightEnable(0, false);
            boolean discarded$1 = ((kr) this).field_Rc.LightEnable(1, false);
            int discarded$2 = ((kr) this).field_Rc.SetLight(0, ((kr) this).field_Nc);
            int discarded$3 = ((kr) this).field_Rc.SetLight(1, ((kr) this).field_yc);
            boolean discarded$4 = ((kr) this).field_Rc.LightEnable(0, true);
            boolean discarded$5 = ((kr) this).field_Rc.LightEnable(1, true);
            ((kr) this).field_Mc = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_uc = new int[]{77, 80};
        field_Sc = new float[16];
        field_Jc = new int[]{22, 23};
    }
}
