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
        cj var4 = (cj) param1;
        int discarded$0 = ((kr) this).field_Rc.SetStreamSource(param2, ((cj) var4).field_f, 0, var4.b(param0));
    }

    final bp a(int param0, int param1, int param2, hd param3, int param4, byte[] param5) {
        if (param1 > -93) {
            ((kr) this).field_Qc = (boolean[]) null;
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
        int stackOut_3_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = 0;
                    var7 = 0;
                    var9 = -92 % ((67 - param2) / 45);
                    var8 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var13 = new jagdx.D3DDISPLAYMODE();
                        var14 = var13;
                        if (jagdx.gf.a(-1, param5.a(param4, var14))) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (0 > param0) {
                            statePc = 26;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (1 == param0) {
                            statePc = 25;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = param0 + 0;
                        var11 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var11 >= field_Jc.length) {
                            statePc = 25;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (0 != param5.CheckDeviceType(param4, param3, ((jagdx.D3DDISPLAYMODE) var13).Format, field_Jc[var11], true)) {
                            statePc = 24;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param5.CheckDeviceFormat(param4, param3, ((jagdx.D3DDISPLAYMODE) var13).Format, 1, 1, field_Jc[var11]) != 0) {
                            statePc = 24;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 != param5.CheckDeviceMultiSampleType(param4, param3, field_Jc[var11], true, var8)) {
                            statePc = 24;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (field_uc.length <= var12) {
                            statePc = 24;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param5.CheckDeviceFormat(param4, param3, ((jagdx.D3DDISPLAYMODE) var13).Format, 2, 1, field_uc[var12]) == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param5.CheckDepthStencilMatch(param4, param3, ((jagdx.D3DDISPLAYMODE) var13).Format, field_Jc[var11], field_uc[var12]) != -1) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param0 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-1 == param5.CheckDeviceMultiSampleType(param4, param3, field_uc[var11], true, var8)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = field_Jc[var11];
                        var6 = field_uc[var12];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12++;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        param0--;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((param0 ^ -1) > -1) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var7 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var6 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    try {
                        param1.MultiSampleType = var8;
                        param1.AutoDepthStencilFormat = var6;
                        param1.BackBufferFormat = var7;
                        param1.MultiSampleQuality = 0;
                        stackOut_32_0 = 1;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    var10 = caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
        int var10 = 0;
        int var11 = 0;
        jagdx.IDirect3DSurface var12 = ((kr) this).field_Rc.c(0);
        jagdx.IDirect3DSurface var9 = ((kr) this).field_Rc.a(param2, param3, 21, 0, 0, true);
        if (!jagdx.gf.a((byte) 93, var9.LockRect(0, 0, param2, param3, 0, ((kr) this).field_Ec))) {
        } else {
            if (param6 == 0) {
                param6 = param2;
            }
            var10 = ((kr) this).field_Ec.getRowPitch();
            if (param6 == param2) {
                // if_icmpne L103
                ((kr) this).field_Ec.a(param4, param5, 0, param2 * param3);
            } else {
                for (var11 = 0; var11 < param3; var11++) {
                    ((kr) this).field_Ec.a(param4, param6 * var11 + param5, var10 * var11, param2);
                }
            }
            boolean discarded$0 = var9.UnlockRect();
        }
        int discarded$1 = ((kr) this).field_Rc.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
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
            ((kr) this).field_vc = (jagdx.GeometryBuffer) null;
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
                if (-1 < (((kr) this).field_p ^ -1)) {
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
            ((kr) this).field_Fc = (jagdx.D3DLIGHT) null;
            break L2;
          }
        }
    }

    final void b(int param0, int param1) throws lp {
        L0: {
          int discarded$22 = ((kr) this).field_Rc.EndScene();
          if (!((kr) this).field_xc.a(false)) {
            ((kr) this).field_Hc = ((kr) this).field_Hc + 1;
            if ((((kr) this).field_Hc + 1 ^ -1) >= -51) {
              boolean discarded$23 = this.h(true);
              break L0;
            } else {
              throw new lp();
            }
          } else {
            ((kr) this).field_Hc = 0;
            if (jagdx.gf.a(-1, ((kr) this).field_xc.a(0, -96))) {
              boolean discarded$24 = this.h(true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        int discarded$25 = ((kr) this).field_Rc.BeginScene();
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
            this.G(1);
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
          if (((kr) this).field_Oc[((kr) this).field_F] != ((ib) param0).field_a) {
            L1: {
              var4 = kr.a(((ib) param0).field_a, 2);
              int discarded$6 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 6, var4);
              int discarded$7 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 5, var4);
              ((kr) this).field_Oc[((kr) this).field_F] = ((ib) param0).field_a;
              if (((ib) param0).field_b) {
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
                if (!((ib) param0).field_b) {
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
                  stackOut_18_3 = kr.a(((ib) param0).field_a, 2);
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  stackIn_20_3 = stackOut_18_3;
                  break L3;
                }
              }
              int discarded$8 = ((jagdx.IDirect3DDevice) (Object) stackIn_20_0).SetSamplerState(stackIn_20_1, stackIn_20_2, stackIn_20_3);
              ((kr) this).field_Ac[((kr) this).field_F] = ((ib) param0).field_b;
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
            if (stackIn_4_0 == (((ib) param0).field_b ? 1 : 0)) {
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
                if (!((ib) param0).field_b) {
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
                  stackOut_7_3 = kr.a(((ib) param0).field_a, 2);
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  break L5;
                }
              }
              int discarded$9 = ((jagdx.IDirect3DDevice) (Object) stackIn_9_0).SetSamplerState(stackIn_9_1, stackIn_9_2, stackIn_9_3);
              ((kr) this).field_Ac[((kr) this).field_F] = ((ib) param0).field_b;
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
            return (qi) null;
        }
        return (qi) (Object) new og((kr) this, param4, param0, param3, param2);
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
            ((kr) this).field_yc = (jagdx.D3DLIGHT) null;
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
            go discarded$8 = ((kr) this).a(-112, -74, false, (int[][]) (int[][]) null);
        }
    }

    final void w(byte param0) {
        if (param0 > -40) {
            field_uc = (int[]) null;
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
            ((kr) this).field_Rc = (jagdx.IDirect3DDevice) null;
        }
        int var2 = ((kr) this).field_Lc[((kr) this).field_F] ? kr.a(((kr) this).field_w[((kr) this).field_F], true) : 1;
        int discarded$0 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 4, var2);
    }

    final static ha createToolkit(java.awt.Canvas param0, d param1, gk param2, Integer param3) {
        kr var4 = null;
        int var5 = 0;
        int var6 = 0;
        jaclib.peer.qt var7 = null;
        jagdx.IDirect3D var8 = null;
        jagdx.D3DCAPS var9 = null;
        jagdx.D3DPRESENT_PARAMETERS var10 = null;
        int var11 = 0;
        jagdx.IDirect3DDevice var12 = null;
        cb var13 = null;
        jagdx.ie var14 = null;
        kr var15 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = null;
                    var5 = 0;
                    var6 = 1;
                    var7 = new jaclib.peer.qt();
                    var8 = jagdx.IDirect3D.a(-2147483616, var7);
                    var9 = var8.a(var5, var6);
                    if ((16777216 & ((jagdx.D3DCAPS) var9).RasterCaps) != 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    throw new RuntimeException("");
                }
                case 2: {
                    if (2 > ((jagdx.D3DCAPS) var9).MaxSimultaneousTextures) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    throw new RuntimeException("");
                }
                case 5: {
                    if (-1 == (2 & ((jagdx.D3DCAPS) var9).TextureOpCaps ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    throw new RuntimeException("");
                }
                case 8: {
                    if ((((jagdx.D3DCAPS) var9).TextureOpCaps & 8) == 0) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    throw new RuntimeException("");
                }
                case 11: {
                    if ((64 & ((jagdx.D3DCAPS) var9).TextureOpCaps) == 0) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException("");
                }
                case 14: {
                    if (-1 == (((jagdx.D3DCAPS) var9).TextureOpCaps & 512 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    throw new RuntimeException("");
                }
                case 17: {
                    if (0 == (33554432 & ((jagdx.D3DCAPS) var9).TextureOpCaps)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    throw new RuntimeException("");
                }
                case 20: {
                    if ((16 & (((jagdx.D3DCAPS) var9).SrcBlendCaps & ((jagdx.D3DCAPS) var9).DestBlendCaps)) == 0) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    throw new RuntimeException("");
                }
                case 23: {
                    if ((((jagdx.D3DCAPS) var9).SrcBlendCaps & ((jagdx.D3DCAPS) var9).DestBlendCaps & 32) == 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    throw new RuntimeException("");
                }
                case 26: {
                    if (-1 != (((jagdx.D3DCAPS) var9).SrcBlendCaps & ((jagdx.D3DCAPS) var9).DestBlendCaps & 2 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    throw new RuntimeException("");
                }
                case 28: {
                    if (((jagdx.D3DCAPS) var9).MaxActiveLights <= 0) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (2 <= ((jagdx.D3DCAPS) var9).MaxActiveLights) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    throw new RuntimeException("");
                }
                case 31: {
                    if ((((jagdx.D3DCAPS) var9).MaxStreams ^ -1) <= -6) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    throw new RuntimeException("");
                }
                case 33: {
                    var10 = new jagdx.D3DPRESENT_PARAMETERS(param0);
                    if (kr.a(param3.intValue(), var10, (byte) 124, var6, var5, var8)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    throw new RuntimeException("");
                }
                case 35: {
                    var10.PresentationInterval = -2147483648;
                    var10.EnableAutoDepthStencil = true;
                    var10.Windowed = true;
                    var11 = 2;
                    if ((((jagdx.D3DCAPS) var9).DevCaps & 1048576) == 0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var11 = var11 | 16;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var12 = null;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    try {
                        var12 = var8.a(var5, var6, param0, var11 | 64, var10);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    var14 = (jagdx.ie) (Object) caughtException;
                    var12 = var8.a(var5, var6, param0, var11 | 32, var10);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var13 = new cb(var12.b(0), var12.b());
                    var15 = new kr(var5, var6, param0, var7, var8, var12, var13, var10, var9, param1, param2, param3.intValue());
                    var4 = var15;
                    var15.f((byte) 101);
                    return (ha) (Object) var15;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
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
            nf var10 = (nf) null;
            ((kr) this).a((nf) null, true);
        }
        return (qi) (Object) new og((kr) this, param2, param0, param3, param1, param7, param6, param5);
    }

    final void a(fa param0, byte param1) {
        dxVertexLayout var3 = (dxVertexLayout) param0;
        if (param1 != 75) {
            return;
        }
        int discarded$0 = ((kr) this).field_Rc.SetVertexDeclaration(((dxVertexLayout) var3).field_d);
    }

    final void e() {
    }

    final void d(boolean param0) {
        if (param0) {
            hd var3 = (hd) null;
            boolean discarded$0 = ((kr) this).a((la) null, -42, (hd) null);
        }
        int discarded$1 = ((kr) this).field_Rc.a(7, ((kr) this).field_ib);
    }

    final void p(byte param0) {
        if (param0 >= -127) {
            jagdx.IDirect3D var3 = (jagdx.IDirect3D) null;
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
            ((kr) this).field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!jagdx.gf.a((byte) 96, ((kr) this).field_wc.a(((kr) this).field_Kc, var4))) {
              break L2;
            } else {
              if (!jagdx.gf.a((byte) 78, ((kr) this).field_wc.CheckDeviceFormat(((kr) this).field_Kc, ((kr) this).field_tc, ((jagdx.D3DDISPLAYMODE) var4).Format, 0, 3, kr.a(param2, param0, false)))) {
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
        if (param1) {
            return;
        }
        int var3 = 0;
        if (param0 == rg.field_A) {
            var3 = 65536;
        } else {
            if (param0 != ij.field_g) {
                // if_acmpne L46
                var3 = 196608;
            } else {
                var3 = 131072;
            }
        }
        int discarded$0 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 11, ((kr) this).field_F | var3);
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
            Object var3 = (Object) null;
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
                if (!jagdx.gf.a((byte) 112, ((kr) this).field_wc.CheckDeviceFormat(((kr) this).field_Kc, ((kr) this).field_tc, ((jagdx.D3DDISPLAYMODE) var4).Format, 0, 4, kr.a(param2, param1, false)))) {
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
            pa var3 = (pa) null;
            ((kr) this).a((pa) null, true);
        }
    }

    final void k(byte param0) {
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
            ((kr) this).a((pa) null, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ((kr) this).field_B) {
            L2: while (true) {
              if (((kr) this).field_ic <= var2) {
                this.k((byte) 127);
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
            ((kr) this).field_Fc.SetDiffuse(var6 * (float)((16721490 & var5) >> -1061901424), (float)((65478 & var5) >> 1267442952) * var6, (float)(255 & var5) * var6, 0.0f);
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
            return (qi) null;
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
                    int discarded$2 = kr.a((as) null, true);
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
        if (param1 >= -76) {
            st var4 = (st) null;
            int discarded$0 = kr.a(true, (st) null);
        }
        int discarded$1 = ((kr) this).field_Rc.SetTextureStageState(((kr) this).field_F, 11, param0);
    }

    private final boolean h(boolean param0) {
        int var4 = 0;
        if (!param0) {
            return false;
        }
        int var2 = ((kr) this).field_Rc.TestCooperativeLevel();
        if (0 != var2) {
            if ((var2 ^ -1) != 2005530518) {
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
        this.b(param0);
    }

    final sk b(int param0, byte param1) {
        int var3 = 0;
        tl var4 = null;
        L0: {
          if (param1 >= 31) {
            break L0;
          } else {
            var4 = (tl) null;
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
            if ((var3 ^ -1) != -9) {
              return this.b(param0, (byte) 54);
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
        this.c();
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
        ((kr) this).field_y = (float)(((kr) this).field_x + -((kr) this).field_q);
        ((kr) this).field_Xb = (float)(-((kr) this).field_p) + ((kr) this).field_y;
        if (((kr) this).field_Xb < (float)((kr) this).field_Mb) {
            ((kr) this).field_Xb = (float)((kr) this).field_Mb;
        }
        int discarded$21 = ((kr) this).field_Rc.a(36, ((kr) this).field_Xb);
        int discarded$36 = ((kr) this).field_Rc.a(37, ((kr) this).field_y);
        int discarded$44 = ((kr) this).field_Rc.SetRenderState(34, ((kr) this).field_X);
        if (param0 > -98) {
            byte[] var3 = (byte[]) null;
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
        if (param2) {
            ia var4 = (ia) null;
            int discarded$0 = kr.a(-125, (ia) null);
        }
        if (la.field_h == param1) {
            if (wo.field_n != param0) {
                if (lc.field_g != param0) {
                    if (ro.field_o != param0) {
                        if (param0 == wf.field_d) {
                            return 50;
                        }
                        if (param0 == hh.field_c) {
                            return 51;
                        }
                        // if_acmpne L87
                        return 77;
                    }
                    return 28;
                }
                return 21;
            }
            return 22;
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
        if (param1 <= 84) {
            ((kr) this).j(91);
        }
        ((kr) this).a((ib) (Object) param0, (byte) -31);
        if ((!((og) param0).field_j ? 1 : 0) == (((kr) this).field_Qc[((kr) this).field_F] ? 1 : 0)) {
            int discarded$0 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 1, ((og) param0).field_j ? 1 : 3);
            ((kr) this).field_Qc[((kr) this).field_F] = ((og) param0).field_j;
        }
        if (!((!((kr) this).field_sc[((kr) this).field_F] ? 1 : 0) == (!((og) param0).field_g ? 1 : 0))) {
            int discarded$1 = ((kr) this).field_Rc.SetSamplerState(((kr) this).field_F, 2, ((og) param0).field_g ? 1 : 3);
            ((kr) this).field_sc[((kr) this).field_F] = ((og) param0).field_g;
        }
    }

    final tl a(boolean param0, byte param1) {
        if (param1 <= 72) {
            ((kr) this).m(-115);
        }
        return (tl) (Object) new cj((kr) this, param0);
    }

    final void l(byte param0) {
        hd var3 = null;
        L0: {
          if (param0 > 39) {
            break L0;
          } else {
            var3 = (hd) null;
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
        Object stackOut_1_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((kr) this).field_Mc = false;
                    ((kr) this).field_Hc = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
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
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = this;
                        stackOut_2_1 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        stackIn_4_1 = stackOut_2_1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackOut_3_1 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((kr) this).field_Dc = stackIn_4_1 != 0;
                        stackOut_4_0 = this;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (0 == (((kr) this).field_Bc.TextureCaps & 65536)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackOut_5_1 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((kr) this).field_rc = stackIn_7_1 != 0;
                        stackOut_7_0 = this;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (0 == (16384 & ((kr) this).field_Bc.TextureCaps)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackOut_8_1 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((kr) this).field_Gc = stackIn_10_1 != 0;
                        ((kr) this).field_h = ((kr) this).field_Bc.MaxSimultaneousTextures;
                        stackOut_10_0 = this;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if ((((kr) this).field_Bc.TextureCaps & 8192) == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = this;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((kr) this).field_J = stackIn_13_1 != 0;
                        stackOut_13_0 = this;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if ((((kr) this).field_Bc.MaxActiveLights ^ -1) < -1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = this;
                        stackOut_14_1 = 8;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = this;
                        stackOut_15_1 = ((kr) this).field_Bc.MaxActiveLights;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((kr) this).field_fc = stackIn_16_1;
                        stackOut_16_0 = this;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if ((2048 & ((kr) this).field_Bc.TextureCaps) == 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = this;
                        stackOut_17_1 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = this;
                        stackOut_18_1 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((kr) this).field_Pb = stackIn_19_1 != 0;
                        if ((((kr) this).field_lc ^ -1) < -1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        int discarded$4 = ((kr) this).field_wc.CheckDeviceMultiSampleType(((kr) this).field_Kc, ((kr) this).field_tc, ((kr) this).field_Pc.BackBufferFormat, true, 2);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((kr) this).field_Oc = new ke[((kr) this).field_h];
                        ((kr) this).field_sc = new boolean[((kr) this).field_h];
                        ((kr) this).field_Qc = new boolean[((kr) this).field_h];
                        ((kr) this).field_Ac = new boolean[((kr) this).field_h];
                        ((kr) this).field_Cc = new int[((kr) this).field_h];
                        ((kr) this).field_Lc = new boolean[((kr) this).field_h];
                        int discarded$5 = ((kr) this).field_Rc.BeginScene();
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var13 = caughtException;
                    var13.printStackTrace();
                    ((kr) this).a(-9);
                    throw new RuntimeException("");
                }
                case 24: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
            jb var3 = (jb) null;
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
