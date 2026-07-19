/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ir extends aw {
    jaclib.peer.pf field_Wc;
    private jagdx.IDirect3DVertexShader field_Vc;
    private static int[] field_Zc;
    jagdx.GeometryBuffer field_Yc;
    private boolean field_Tc;
    private jagdx.D3DLIGHT field_Rc;
    private int field_Lc;
    private static float[] field_Mc;
    jagdx.IDirect3DDevice field_Cc;
    private jagdx.D3DLIGHT field_Nc;
    private jagdx.D3DPRESENT_PARAMETERS field_Pc;
    private boolean[] field_ad;
    private int field_zc;
    private ji[] field_Dc;
    boolean field_Sc;
    private jagdx.IDirect3D field_Xc;
    private jagdx.D3DLIGHT field_Ac;
    private boolean[] field_Ec;
    private static int[] field_Fc;
    private int[] field_Gc;
    private kg field_Hc;
    boolean field_Qc;
    private boolean[] field_Uc;
    jagdx.PixelBuffer field_Jc;
    boolean field_Oc;
    private int field_Ic;
    jagdx.D3DCAPS field_Kc;
    private boolean[] field_Bc;

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        boolean discarded$4 = false;
        jagdx.IDirect3DSurface var9 = null;
        int var10 = 0;
        int var11 = 0;
        jagdx.IDirect3DSurface var12 = null;
        L0: {
          var12 = this.field_Cc.c(0);
          var9 = this.field_Cc.a(param2, param3, 21, 0, 0, true);
          if (!jagdx.gv.b(var9.LockRect(0, 0, param2, param3, 0, this.field_Jc), -74)) {
            break L0;
          } else {
            L1: {
              if (0 == param6) {
                param6 = param2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var10 = this.field_Jc.getRowPitch();
                if (param6 != param2) {
                  break L3;
                } else {
                  if (var10 != 4 * param2) {
                    break L3;
                  } else {
                    this.field_Jc.a(param4, param5, 0, param2 * param3);
                    break L2;
                  }
                }
              }
              var11 = 0;
              L4: while (true) {
                if (var11 >= param3) {
                  break L2;
                } else {
                  this.field_Jc.a(param4, param5 - -(var11 * param6), var10 * var11, param2);
                  var11++;
                  continue L4;
                }
              }
            }
            discarded$4 = var9.UnlockRect();
            break L0;
          }
        }
        int discarded$5 = this.field_Cc.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
    }

    final void F(int param0) {
        boolean discarded$0 = false;
        if (param0 != 4) {
            discarded$0 = this.a();
        }
        int discarded$1 = this.field_Cc.SetScissorRect(this.field_r - -this.field_v, this.field_y - -this.field_vb, this.field_F, this.field_yc);
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        if (param2 != 0) {
            this.field_Cc = (jagdx.IDirect3DDevice) null;
        }
    }

    final cr e(int param0, boolean param1) {
        if (param0 != 3) {
            return (cr) null;
        }
        return (cr) ((Object) new co((ir) (this), io.field_k, param1));
    }

    final void l(byte param0) {
        int discarded$0 = 0;
        if (param0 != 9) {
            this.field_Ac = (jagdx.D3DLIGHT) null;
        }
        if (!(!this.field_Ec[this.field_mc])) {
            this.field_Ec[this.field_mc] = false;
            discarded$0 = this.field_Cc.SetTexture(this.field_mc, (jagdx.IDirect3DBaseTexture) null);
            this.X(-109);
            this.q((byte) -93);
        }
    }

    final ru a(io param0, iw param1, int param2, int param3, byte param4) {
        if (param4 > -99) {
            this.V(-14);
        }
        return (ru) ((Object) new ec((ir) (this), param1, param0, param3, param2));
    }

    final void a(int param0, hq param1) {
        int var3 = 121 % ((71 - param0) / 45);
        dxVertexLayout var4 = (dxVertexLayout) ((Object) param1);
        int discarded$0 = this.field_Cc.SetVertexDeclaration(var4.field_d);
    }

    final void a(int param0, qs param1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        this.a((fj) (param1), 1);
        if (!this.field_Uc[this.field_mc]) {
            discarded$0 = this.field_Cc.SetSamplerState(this.field_mc, 1, 1);
            this.field_Uc[this.field_mc] = true;
        }
        if (!(this.field_Bc[this.field_mc])) {
            discarded$1 = this.field_Cc.SetSamplerState(this.field_mc, 2, 1);
            this.field_Bc[this.field_mc] = true;
        }
        if (param0 != 2) {
            field_Zc = (int[]) null;
        }
    }

    final ef a(int param0, byte param1, int[][] param2, boolean param3) {
        int var5 = -93 / ((param1 - -23) / 48);
        return (ef) ((Object) new fp((ir) (this), param0, param3, param2));
    }

    private final static boolean a(jagdx.IDirect3D param0, int param1, int param2, int param3, int param4, jagdx.D3DPRESENT_PARAMETERS param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Throwable var9 = null;
        int var10 = 0;
        int var11 = 0;
        jagdx.D3DDISPLAYMODE var12 = null;
        jagdx.D3DDISPLAYMODE var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var6 = 0;
          var7 = 0;
          if (param4 == 6) {
            break L0;
          } else {
            field_Zc = (int[]) null;
            break L0;
          }
        }
        var8 = 0;
        try {
          L1: {
            var12 = new jagdx.D3DDISPLAYMODE();
            var13 = var12;
            if (!jagdx.gv.a(param0.a(param2, var13), -1)) {
              L2: while (true) {
                L3: {
                  if (param3 < 0) {
                    break L3;
                  } else {
                    L4: {
                      if ((param3 ^ -1) == -2) {
                        break L4;
                      } else {
                        var8 = 0 + param3;
                        var10 = 0;
                        L5: while (true) {
                          if (field_Fc.length <= var10) {
                            break L4;
                          } else {
                            L6: {
                              if (param0.CheckDeviceType(param2, param1, var12.Format, field_Fc[var10], true) != 0) {
                                break L6;
                              } else {
                                if (-1 != (param0.CheckDeviceFormat(param2, param1, var12.Format, 1, 1, field_Fc[var10]) ^ -1)) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (param3 == 0) {
                                      break L7;
                                    } else {
                                      if (0 == param0.CheckDeviceMultiSampleType(param2, param1, field_Fc[var10], true, var8)) {
                                        break L7;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var11 = 0;
                                  L8: while (true) {
                                    if (var11 >= field_Zc.length) {
                                      break L6;
                                    } else {
                                      L9: {
                                        if (param0.CheckDeviceFormat(param2, param1, var12.Format, 2, 1, field_Zc[var11]) != 0) {
                                          break L9;
                                        } else {
                                          if (0 == param0.CheckDepthStencilMatch(param2, param1, var12.Format, field_Fc[var10], field_Zc[var11])) {
                                            L10: {
                                              if (param3 == 0) {
                                                break L10;
                                              } else {
                                                if (param0.CheckDeviceMultiSampleType(param2, param1, field_Zc[var10], true, var8) == 0) {
                                                  break L10;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var7 = field_Fc[var10];
                                            var6 = field_Zc[var11];
                                            break L3;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var11++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L5;
                          }
                        }
                      }
                    }
                    param3--;
                    continue L2;
                  }
                }
                L11: {
                  if (0 > param3) {
                    break L11;
                  } else {
                    if (0 == var7) {
                      break L11;
                    } else {
                      if (var6 != 0) {
                        param5.BackBufferFormat = var7;
                        param5.MultiSampleQuality = 0;
                        param5.AutoDepthStencilFormat = var6;
                        param5.MultiSampleType = var8;
                        stackOut_33_0 = 1;
                        stackIn_34_0 = stackOut_33_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L1;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          return false;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            return stackIn_34_0 != 0;
          }
        }
    }

    final void a(vc param0) {
    }

    final void V(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int var2 = 0;
        L0: {
          if (param0 == 26803) {
            break L0;
          } else {
            this.field_Rc = (jagdx.D3DLIGHT) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_Vc != null) {
              break L2;
            } else {
              if (ar.field_L != this.field_wb[this.field_mc]) {
                L3: {
                  if (this.field_wb[this.field_mc] != rs.field_c) {
                    discarded$5 = this.field_Cc.SetTransform(this.field_mc + 16, this.field_V[this.field_mc].b(-68, field_Mc));
                    break L3;
                  } else {
                    discarded$6 = this.field_Cc.SetTransform(this.field_mc + 16, this.field_V[this.field_mc].a(field_Mc, 111));
                    break L3;
                  }
                }
                var2 = ir.b(this.field_wb[this.field_mc], param0 + -23700);
                if (var2 != this.field_Gc[this.field_mc]) {
                  discarded$7 = this.field_Cc.SetTextureStageState(this.field_mc, 24, var2);
                  this.field_Gc[this.field_mc] = var2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          discarded$8 = this.field_Cc.SetTextureStageState(this.field_mc, 24, 0);
          this.field_Gc[this.field_mc] = 0;
          break L1;
        }
    }

    final void cb(int param0) {
        if (param0 > -7) {
            this.field_Jc = (jagdx.PixelBuffer) null;
        }
    }

    final vc a(bu param0, nr param1) {
        return null;
    }

    final void q(byte param0) {
        if (param0 > -74) {
            return;
        }
        int var2 = !this.field_Ec[this.field_mc] ? 1 : ir.a(this.field_K[this.field_mc], -124);
        int discarded$0 = this.field_Cc.SetTextureStageState(this.field_mc, 1, var2);
    }

    final void a(int param0, boolean param1) {
        if (param0 != 1) {
            this.f(true);
        }
        int discarded$0 = this.field_Cc.a(161, param1);
    }

    private final static int b(tf param0, int param1) {
        int discarded$2 = 0;
        ji var3 = null;
        if (param0 != he.field_m) {
          if (rs.field_c == param0) {
            return 2;
          } else {
            if (param0 == ip.field_y) {
              return 3;
            } else {
              if (param0 != kr.field_a) {
                if (aw.field_t == param0) {
                  return 256;
                } else {
                  if (param1 == 3103) {
                    return 0;
                  } else {
                    var3 = (ji) null;
                    discarded$2 = ir.a((ji) null, false);
                    return 0;
                  }
                }
              } else {
                return 4;
              }
            }
          }
        } else {
          return 1;
        }
    }

    final void Y(int param0) {
        boolean discarded$3 = false;
        int discarded$4 = 0;
        boolean discarded$5 = false;
        int var2 = 0;
        ko var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        var2 = 0;
        L0: while (true) {
          if (this.field_ub <= var2) {
            L1: while (true) {
              if (this.field_Ab <= var2) {
                L2: {
                  if (param0 <= -83) {
                    break L2;
                  } else {
                    this.field_zc = -101;
                    break L2;
                  }
                }
                super.Y(-100);
                return;
              } else {
                discarded$3 = this.field_Cc.LightEnable(2 + var2, false);
                var2++;
                continue L1;
              }
            }
          } else {
            var3 = this.field_pb[var2];
            var4 = var2 - -2;
            var5 = var3.c((byte) 50);
            var6 = var3.a(0) / 255.0f;
            this.field_Ac.SetPosition((float)var3.a((byte) 117), (float)var3.d((byte) 109), (float)var3.c(true));
            this.field_Ac.SetDiffuse((float)((var5 & 16740345) >> -1610158448) * var6, (float)((var5 & 65514) >> -873934744) * var6, var6 * (float)(var5 & 255), 0.0f);
            this.field_Ac.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.c(0) * var3.c(0)));
            this.field_Ac.SetRange((float)var3.c(0));
            discarded$4 = this.field_Cc.SetLight(var4, this.field_Ac);
            discarded$5 = this.field_Cc.LightEnable(var4, true);
            var2++;
            continue L0;
          }
        }
    }

    final void q(int param0) {
        int discarded$7 = this.field_Cc.a(7, this.field_p);
        if (param0 <= 19) {
            this.A(30);
        }
    }

    final hq a(hu[] param0, byte param1) {
        if (param1 <= 6) {
            return (hq) null;
        }
        return (hq) ((Object) new dxVertexLayout((ir) (this), param0));
    }

    final void r(int param0) {
        int discarded$8 = this.field_Cc.SetRenderState(60, this.field_Ub);
        if (param0 != 1) {
            this.field_Dc = (ji[]) null;
        }
    }

    final synchronized void f(int param0) {
        this.field_Wc.b(12575);
        super.f(param0);
    }

    final void a(fj param0, int param1) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var3 = 0;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        jagdx.IDirect3DDevice stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        jagdx.IDirect3DDevice stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        jagdx.IDirect3DDevice stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        jagdx.IDirect3DDevice stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        jagdx.IDirect3DDevice stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        jagdx.IDirect3DDevice stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        jagdx.IDirect3DDevice stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        jagdx.IDirect3DDevice stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        jagdx.IDirect3DDevice stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        jagdx.IDirect3DDevice stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        jagdx.IDirect3DDevice stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        jagdx.IDirect3DDevice stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        L0: {
          discarded$5 = this.field_Cc.SetTexture(this.field_mc, param0.d(-22689));
          if (this.field_Dc[this.field_mc] != param0.field_a) {
            L1: {
              var3 = ir.a(param0.field_a, false);
              discarded$6 = this.field_Cc.SetSamplerState(this.field_mc, 6, var3);
              discarded$7 = this.field_Cc.SetSamplerState(this.field_mc, 5, var3);
              this.field_Dc[this.field_mc] = param0.field_a;
              stackOut_9_0 = this.field_ad[this.field_mc];
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (param0.field_e) {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L1;
              } else {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L1;
              }
            }
            if ((stackIn_12_0 ? 1 : 0) != stackIn_12_1) {
              break L0;
            } else {
              L2: {
                stackOut_13_0 = this.field_Cc;
                stackOut_13_1 = this.field_mc;
                stackOut_13_2 = 7;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                if (!param0.field_e) {
                  stackOut_15_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_15_0);
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  stackIn_16_3 = stackOut_15_3;
                  break L2;
                } else {
                  stackOut_14_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_14_0);
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = ir.a(param0.field_a, false);
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_16_3 = stackOut_14_3;
                  break L2;
                }
              }
              discarded$8 = ((jagdx.IDirect3DDevice) (Object) stackIn_16_0).SetSamplerState(stackIn_16_1, stackIn_16_2, stackIn_16_3);
              this.field_ad[this.field_mc] = param0.field_e;
              break L0;
            }
          } else {
            L3: {
              stackOut_1_0 = this.field_ad[this.field_mc];
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param0.field_e) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L3;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L3;
              }
            }
            if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
              break L0;
            } else {
              L4: {
                stackOut_5_0 = this.field_Cc;
                stackOut_5_1 = this.field_mc;
                stackOut_5_2 = 7;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                if (param0.field_e) {
                  stackOut_7_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_7_0);
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = ir.a(param0.field_a, false);
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  break L4;
                } else {
                  stackOut_6_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_6_0);
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = 0;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  break L4;
                }
              }
              discarded$9 = ((jagdx.IDirect3DDevice) (Object) stackIn_8_0).SetSamplerState(stackIn_8_1, stackIn_8_2, stackIn_8_3);
              this.field_ad[this.field_mc] = param0.field_e;
              break L0;
            }
          }
        }
        L5: {
          if (!this.field_Ec[this.field_mc]) {
            this.field_Ec[this.field_mc] = true;
            this.X(-115);
            this.q((byte) -113);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param1 == 1) {
            break L6;
          } else {
            this.field_Oc = false;
            break L6;
          }
        }
    }

    final void GA(int param0) {
        int discarded$0 = this.field_Cc.Clear(1, param0, 0.0f, 0);
    }

    private final boolean h(boolean param0) {
        int var2 = 0;
        kg var3 = null;
        int var4 = 0;
        L0: {
          L1: {
            var2 = this.field_Cc.TestCooperativeLevel();
            if (var2 == 0) {
              break L1;
            } else {
              if ((var2 ^ -1) != 2005530518) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = (kg) (this.field_Ib);
          this.s((byte) 81);
          var3.a((byte) 71);
          this.field_Pc.BackBufferWidth = 0;
          this.field_Pc.BackBufferHeight = 0;
          if (ir.a(this.field_Xc, this.field_Ic, this.field_zc, this.field_Y, 6, this.field_Pc)) {
            var4 = this.field_Cc.Reset(this.field_Pc);
            if (!jagdx.gv.b(var4, -72)) {
              break L0;
            } else {
              var3.a(false, this.field_Cc.b(), this.field_Cc.b(0));
              this.P(-100);
              this.D(1);
              return true;
            }
          } else {
            break L0;
          }
        }
        if (param0) {
          return false;
        } else {
          this.field_Sc = true;
          return false;
        }
    }

    private final static int a(tg param0, int param1) {
        L0: {
          if (param1 < -23) {
            break L0;
          } else {
            field_Zc = (int[]) null;
            break L0;
          }
        }
        if (lf.field_e == param0) {
          return 2;
        } else {
          if (vi.field_v == param0) {
            return 4;
          } else {
            if (param0 != ua.field_n) {
              if (param0 == cv.field_F) {
                return 7;
              } else {
                if (bj.field_c == param0) {
                  return 10;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              return 26;
            }
          }
        }
    }

    private final static int a(mi param0, int param1) {
        if (param1 == 21) {
          if (jq.field_a != param0) {
            if (fv.field_y == param0) {
              return 0;
            } else {
              if (param0 == ta.field_a) {
                return 1;
              } else {
                if (param0 != mm.field_h) {
                  throw new IllegalArgumentException();
                } else {
                  return 3;
                }
              }
            }
          } else {
            return 2;
          }
        } else {
          return 11;
        }
    }

    final void c(int param0, int param1) {
        nh discarded$0 = null;
        if (param1 < 83) {
            byte[] var4 = (byte[]) null;
            discarded$0 = this.a(true, (iw) null, -117, -19, (byte[]) null, 96);
        }
        int discarded$1 = this.field_Cc.SetTextureStageState(this.field_mc, 11, param0);
    }

    final boolean a(io param0, iw param1, int param2) {
        jagdx.D3DDISPLAYMODE var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 6) {
            break L0;
          } else {
            this.db(-77);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = new jagdx.D3DDISPLAYMODE();
            if (!jagdx.gv.b(this.field_Xc.a(this.field_zc, var4), -41)) {
              break L2;
            } else {
              if (!jagdx.gv.b(this.field_Xc.CheckDeviceFormat(this.field_zc, this.field_Ic, var4.Format, 0, 3, ir.a(param1, -55, param0)), -63)) {
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

    final void a(int param0, int param1, pv param2) {
        if (param1 < 62) {
            this.A(70);
        }
        ap var4 = (ap) ((Object) param2);
        int discarded$0 = this.field_Cc.SetStreamSource(param0, var4.field_b, 0, var4.c(98));
    }

    final void ab(int param0) {
        this.field_Nc.SetAmbient(this.field_J * this.field_T, this.field_T * this.field_jb, this.field_T * this.field_Xb, 0.0f);
        if (param0 != 7) {
            return;
        }
        this.field_Tc = false;
    }

    final boolean a() {
        return false;
    }

    final void s(int param0) {
        int discarded$0 = this.field_Cc.a(15, this.field_u);
        int var2 = 111 % ((param0 - -6) / 54);
    }

    final Object a(java.awt.Canvas param0, int param1) {
        if (param1 == 3) {
            return null;
        }
        this.X(-60);
        return null;
    }

    private final static int a(ck param0, byte param1) {
        int discarded$2 = 0;
        ji var3 = null;
        L0: {
          if (param1 == -121) {
            break L0;
          } else {
            var3 = (ji) null;
            discarded$2 = ir.a((ji) null, true);
            break L0;
          }
        }
        if (param0 != tc.field_g) {
          if (param0 == rv.field_b) {
            return 3;
          } else {
            if (cc.field_i == param0) {
              return 1;
            } else {
              if (np.field_h != param0) {
                if (param0 == an.field_d) {
                  return 6;
                } else {
                  if (param0 == fq.field_d) {
                    return 5;
                  } else {
                    throw new IllegalArgumentException("");
                  }
                }
              } else {
                return 4;
              }
            }
          }
        } else {
          return 2;
        }
    }

    final void N(int param0) {
        float[] discarded$0 = null;
        if (param0 != -26911) {
            this.field_Hc = (kg) null;
        }
        if (!this.field_s.a(param0 ^ 10036)) {
            field_Mc[10] = 1.0f;
            field_Mc[8] = 0.0f;
            field_Mc[1] = 0.0f;
            field_Mc[2] = 0.0f;
            field_Mc[13] = 0.0f;
            field_Mc[0] = 1.0f;
            field_Mc[3] = 0.0f;
            field_Mc[11] = 0.0f;
            field_Mc[4] = 0.0f;
            field_Mc[7] = 0.0f;
            field_Mc[15] = 1.0f;
            field_Mc[12] = 0.0f;
            field_Mc[14] = 0.0f;
            field_Mc[9] = 0.0f;
            field_Mc[6] = 0.0f;
            field_Mc[5] = 1.0f;
        } else {
            discarded$0 = this.field_Gb.b(-110, field_Mc);
        }
        int discarded$1 = this.field_Cc.SetTransform(2, field_Mc);
    }

    final void f(boolean param0) {
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
        if (!param0) {
          L0: {
            L1: {
              stackOut_2_0 = this.field_Cc;
              stackOut_2_1 = 137;
              stackIn_5_0 = stackOut_2_0;
              stackIn_5_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (!this.field_I) {
                break L1;
              } else {
                stackOut_3_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                if (this.field_tb) {
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

    final void a(int param0, ec param1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        if (param0 != 1) {
            mp var4 = (mp) null;
            this.a(94, (mp) null);
        }
        this.a((fj) (param1), param0 ^ 0);
        if (this.field_Uc[this.field_mc] != param1.field_g) {
            discarded$0 = this.field_Cc.SetSamplerState(this.field_mc, 1, !param1.field_g ? 3 : 1);
            this.field_Uc[this.field_mc] = param1.field_g;
        }
        if (param1.field_h != this.field_Bc[this.field_mc]) {
            discarded$1 = this.field_Cc.SetSamplerState(this.field_mc, 2, !param1.field_h ? 3 : 1);
            this.field_Bc[this.field_mc] = param1.field_h;
        }
    }

    final void a(int param0, jagdx.IDirect3DVertexShader param1) {
        cr discarded$0 = null;
        this.field_Vc = param1;
        if (param0 >= -29) {
            discarded$0 = this.e(-57, false);
        }
        int discarded$1 = this.field_Cc.SetVertexShader(param1);
        this.V(26803);
    }

    final void a(int param0, boolean param1, byte param2, mi param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = -118 / ((1 - param2) / 45);
          var7 = 0;
          var8 = param0;
          if ((var8 ^ -1) == -2) {
            var6 = 6;
            break L0;
          } else {
            if (var8 == 2) {
              var6 = 27;
              break L0;
            } else {
              var6 = 5;
              break L0;
            }
          }
        }
        L1: {
          if (!param1) {
            break L1;
          } else {
            var7 = var7 | 16;
            break L1;
          }
        }
        int discarded$1 = this.field_Cc.SetTextureStageState(this.field_mc, var6, ir.a(param3, 21) | var7);
    }

    final void b(boolean param0) {
        this.field_Tb = (float)(this.field_Yb - this.field_Nb);
        this.field_E = this.field_Tb - (float)this.field_Kb;
        if (!param0) {
            return;
        }
        if ((float)this.field_oc > this.field_E) {
            this.field_E = (float)this.field_oc;
        }
        int discarded$0 = this.field_Cc.a(36, this.field_E);
        int discarded$1 = this.field_Cc.a(37, this.field_Tb);
        int discarded$2 = this.field_Cc.SetRenderState(34, this.field_C);
    }

    final void bb(int param0) {
        int discarded$132 = 0;
        int discarded$133 = 0;
        int discarded$134 = 0;
        int discarded$135 = 0;
        int discarded$136 = 0;
        int discarded$137 = 0;
        L0: {
          if (sr.field_a == this.field_l) {
            discarded$132 = this.field_Cc.SetRenderState(19, 5);
            discarded$133 = this.field_Cc.SetRenderState(20, 6);
            break L0;
          } else {
            if (lh.field_n != this.field_l) {
              if (this.field_l != gb.field_t) {
                break L0;
              } else {
                discarded$134 = this.field_Cc.SetRenderState(19, 9);
                discarded$135 = this.field_Cc.SetRenderState(20, 2);
                break L0;
              }
            } else {
              discarded$136 = this.field_Cc.SetRenderState(19, 2);
              discarded$137 = this.field_Cc.SetRenderState(20, 2);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -19519) {
            break L1;
          } else {
            this.field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
            break L1;
          }
        }
    }

    final void i(int param0) {
        int discarded$0 = this.field_Cc.SetViewport(this.field_r, this.field_y, this.field_rb, this.field_Sb, (float)param0, 1.0f);
    }

    final ru a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        if (param4 >= -41) {
            field_Zc = (int[]) null;
        }
        return (ru) ((Object) new ec((ir) (this), param3, param6, param0, param2, param5, param1));
    }

    private final static int a(ji param0, boolean param1) {
        if (param1) {
            return -35;
        }
        if (param0 == ao.field_y) {
            return 2;
        }
        if (!(lh.field_l != param0)) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    final void x(int param0) {
        float[] discarded$1 = null;
        if (!this.field_Db) {
            discarded$1 = this.field_Lb.b(param0 + -79, field_Mc);
        } else {
            field_Mc[3] = 0.0f;
            field_Mc[10] = 1.0f;
            field_Mc[5] = 1.0f;
            field_Mc[9] = 0.0f;
            field_Mc[2] = 0.0f;
            field_Mc[14] = 0.0f;
            field_Mc[1] = 0.0f;
            field_Mc[4] = 0.0f;
            field_Mc[6] = 0.0f;
            field_Mc[13] = 0.0f;
            field_Mc[0] = 1.0f;
            field_Mc[11] = 0.0f;
            field_Mc[7] = 0.0f;
            field_Mc[15] = 1.0f;
            field_Mc[12] = 0.0f;
            field_Mc[8] = 0.0f;
        }
        if (param0 != 0) {
            mi var3 = (mi) null;
            this.a((byte) -44, 8, true, false, (mi) null);
        }
        int discarded$2 = this.field_Cc.SetTransform(256, field_Mc);
    }

    final void X(int param0) {
        if (param0 > -80) {
            this.field_Cc = (jagdx.IDirect3DDevice) null;
        }
        int var2 = !this.field_Ec[this.field_mc] ? 1 : ir.a(this.field_B[this.field_mc], -34);
        int discarded$0 = this.field_Cc.SetTextureStageState(this.field_mc, 4, var2);
    }

    final void eb(int param0) {
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
            stackOut_0_0 = this.field_Cc;
            stackOut_0_1 = 14;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!this.field_db) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!this.field_i) {
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
          if (param0 >= 113) {
            break L2;
          } else {
            this.f(false);
            break L2;
          }
        }
    }

    final void J(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int discarded$2 = 0;
        int discarded$3 = 0;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (param0 != 0) {
            return;
        }
        if (!(this.field_Tc)) {
            discarded$0 = this.field_Cc.LightEnable(0, false);
            discarded$1 = this.field_Cc.LightEnable(1, false);
            discarded$2 = this.field_Cc.SetLight(0, this.field_Nc);
            discarded$3 = this.field_Cc.SetLight(1, this.field_Rc);
            discarded$4 = this.field_Cc.LightEnable(0, true);
            discarded$5 = this.field_Cc.LightEnable(1, true);
            this.field_Tc = true;
        }
    }

    final void I(int param0) {
        this.db(0);
        this.J(param0 + param0);
    }

    final rq d(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.f(-24);
            break L0;
          }
        }
        var3 = param1;
        if (3 == var3) {
          return (rq) ((Object) new ol((ir) (this), this.field_ab));
        } else {
          if (4 != var3) {
            if (var3 == 8) {
              return (rq) ((Object) new tb((ir) (this), this.field_ab, this.field_Mb));
            } else {
              return super.d(0, param1);
            }
          } else {
            return (rq) ((Object) new vh((ir) (this), this.field_ab, this.field_Mb));
          }
        }
    }

    final nr a(int param0, int param1) {
        return null;
    }

    final boolean a(byte param0, io param1, iw param2) {
        jagdx.D3DDISPLAYMODE var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var5 = -33 / ((70 - param0) / 42);
            var4 = new jagdx.D3DDISPLAYMODE();
            if (!jagdx.gv.b(this.field_Xc.a(this.field_zc, var4), -85)) {
              break L1;
            } else {
              if (!jagdx.gv.b(this.field_Xc.CheckDeviceFormat(this.field_zc, this.field_Ic, var4.Format, 0, 4, ir.a(param2, 68, param1)), -108)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final float b(byte param0) {
        if (param0 < 125) {
            this.field_Uc = (boolean[]) null;
        }
        return -0.5f;
    }

    final ru a(iw param0, int param1, int param2, int param3, byte[] param4, byte param5, int param6, boolean param7) {
        int var9 = -61 % ((param5 - 50) / 44);
        return (ru) ((Object) new ec((ir) (this), param0, param1, param2, param7, param4, param6, param3));
    }

    final void D(int param0) {
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
          if (var2 >= this.field_cc) {
            discarded$15 = this.field_Cc.SetTextureStageState(0, 6, param0);
            discarded$16 = this.field_Cc.SetRenderState(9, 2);
            discarded$17 = this.field_Cc.SetRenderState(23, 4);
            discarded$18 = this.field_Cc.SetRenderState(25, 5);
            discarded$19 = this.field_Cc.SetRenderState(24, 0);
            discarded$20 = this.field_Cc.SetRenderState(22, 2);
            discarded$21 = this.field_Cc.SetRenderState(147, 1);
            discarded$22 = this.field_Cc.SetRenderState(145, 1);
            discarded$23 = this.field_Cc.a(38, 0.949999988079071f);
            discarded$24 = this.field_Cc.SetRenderState(140, 3);
            this.field_Nc.SetType(3);
            this.field_Rc.SetType(3);
            this.field_Ac.SetType(1);
            this.field_Tc = false;
            super.D(1);
            return;
          } else {
            discarded$25 = this.field_Cc.SetSamplerState(var2, 7, 0);
            discarded$26 = this.field_Cc.SetSamplerState(var2, 6, 2);
            discarded$27 = this.field_Cc.SetSamplerState(var2, 5, 2);
            discarded$28 = this.field_Cc.SetSamplerState(var2, 1, 1);
            discarded$29 = this.field_Cc.SetSamplerState(var2, 2, 1);
            this.field_Dc[var2] = ao.field_y;
            var3 = this.field_Uc;
            var4 = var2;
            this.field_Bc[var2] = true;
            var3[var4] = true;
            this.field_ad[var2] = false;
            this.field_Gc[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final nh a(boolean param0, iw param1, int param2, int param3, byte[] param4, int param5) {
        if (!param0) {
            this.field_Ic = 63;
        }
        return (nh) ((Object) new qs((ir) (this), param1, param5, param3, param2, param4));
    }

    final void i(byte param0) {
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
            stackOut_0_0 = this.field_Cc;
            stackOut_0_1 = 28;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!this.field_Rb) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!this.field_Bb) {
                break L1;
              } else {
                stackOut_2_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (0 > this.field_Kb) {
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
          if (param0 == -119) {
            break L2;
          } else {
            this.field_Pc = (jagdx.D3DPRESENT_PARAMETERS) null;
            break L2;
          }
        }
    }

    final ru a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, iw param7) {
        if (param6 < -61) {
            return null;
        }
        return (ru) null;
    }

    final static int a(iw param0, int param1, io param2) {
        int var3 = 0;
        L0: {
          if (param2 == io.field_g) {
            if (m.field_X == param0) {
              return 22;
            } else {
              if (param0 != nl.field_p) {
                if (param0 == te.field_f) {
                  return 28;
                } else {
                  if (param0 != kd.field_b) {
                    if (param0 != ps.field_c) {
                      if (rg.field_A != param0) {
                        break L0;
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
              } else {
                return 21;
              }
            }
          } else {
            break L0;
          }
        }
        var3 = -123 % ((param1 - 17) / 48);
        throw new IllegalArgumentException("");
    }

    final void p(byte param0) {
        if (param0 != -4) {
            this.F(-23);
        }
        int discarded$0 = this.field_Cc.a(27, this.field_ob);
    }

    final void e() {
    }

    final void a(byte param0, int param1, boolean param2, boolean param3, mi param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var7 = 0;
          var8 = 57 % ((16 - param0) / 56);
          var9 = param1;
          if (var9 == 1) {
            var6 = 3;
            break L0;
          } else {
            if ((var9 ^ -1) == -3) {
              var6 = 26;
              break L0;
            } else {
              var6 = 2;
              break L0;
            }
          }
        }
        L1: {
          if (!param2) {
            break L1;
          } else {
            var7 = var7 | 32;
            break L1;
          }
        }
        L2: {
          if (!param3) {
            break L2;
          } else {
            var7 = var7 | 16;
            break L2;
          }
        }
        int discarded$1 = this.field_Cc.SetTextureStageState(this.field_mc, var6, ir.a(param4, 21) | var7);
    }

    final void a(byte param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = 106 / ((param0 - -30) / 33);
        int discarded$0 = this.field_Cc.SetPixelShader(param1);
    }

    final void a(int param0, int param1, int param2, ck param3) {
        ha discarded$0 = null;
        if (param1 != 0) {
            Integer var6 = (Integer) null;
            discarded$0 = ir.createToolkit((java.awt.Canvas) null, (d) null, (ki) null, (Integer) null);
        }
        int discarded$1 = this.field_Cc.DrawPrimitive(ir.a(param3, (byte) -121), param0, param2);
    }

    final void A(int param0) {
        int var2 = -106 % ((param0 - 0) / 55);
        int discarded$0 = this.field_Cc.a(174, this.field_wc);
    }

    final void a(hr param0, boolean param1) {
    }

    final void o(int param0) {
        int discarded$8 = this.field_Cc.SetTransform(3, this.field_A);
        if (param0 != -2) {
            field_Fc = (int[]) null;
        }
    }

    final void d() {
        this.field_Wc.a(-25924);
        super.d();
    }

    private ir(int param0, int param1, java.awt.Canvas param2, jaclib.peer.pf param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, kg param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, d param9, ki param10, int param11) {
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
        this.field_Tc = false;
        this.field_Lc = 0;
        try {
          L0: {
            L1: {
              this.field_Kc = param8;
              this.field_Pc = param7;
              this.field_Wc = param3;
              this.field_Ic = param1;
              this.field_Hc = param6;
              this.field_Cc = param5;
              this.field_zc = param0;
              this.field_Xc = param4;
              this.field_Nc = new jagdx.D3DLIGHT(this.field_Wc);
              this.field_Rc = new jagdx.D3DLIGHT(this.field_Wc);
              this.field_Ac = new jagdx.D3DLIGHT(this.field_Wc);
              this.field_Jc = new jagdx.PixelBuffer(this.field_Wc);
              this.field_Yc = new jagdx.GeometryBuffer(this.field_Wc);
              discarded$3 = new jagdx.GeometryBuffer(this.field_Wc);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 == (2048 & this.field_Kc.TextureCaps)) {
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
              ((ir) (this)).field_W = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 != (this.field_Kc.TextureCaps & 2)) {
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
              ((ir) (this)).field_Oc = stackIn_7_1 != 0;
              this.field_cc = this.field_Kc.MaxSimultaneousTextures;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (this.field_Kc.MaxActiveLights > 0) {
                stackOut_9_0 = this;
                stackOut_9_1 = this.field_Kc.MaxActiveLights;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 8;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ir) (this)).field_bc = stackIn_10_1;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if ((16384 & this.field_Kc.TextureCaps) == 0) {
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
              ((ir) (this)).field_Sc = stackIn_13_1 != 0;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (0 == (8192 & this.field_Kc.TextureCaps)) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            L6: {
              ((ir) (this)).field_Eb = stackIn_16_1 != 0;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if ((65536 & this.field_Kc.TextureCaps) == 0) {
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
              ((ir) (this)).field_Qc = stackIn_19_1 != 0;
              if ((this.field_Y ^ -1) < -1) {
                break L7;
              } else {
                discarded$4 = this.field_Xc.CheckDeviceMultiSampleType(this.field_zc, this.field_Ic, this.field_Pc.BackBufferFormat, true, 2);
                break L7;
              }
            }
            this.field_Uc = new boolean[this.field_cc];
            this.field_Bc = new boolean[this.field_cc];
            this.field_ad = new boolean[this.field_cc];
            this.field_Ec = new boolean[this.field_cc];
            this.field_Gc = new int[this.field_cc];
            this.field_Dc = new ji[this.field_cc];
            discarded$5 = this.field_Cc.BeginScene();
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          this.a((byte) -13);
          throw new RuntimeException("");
        }
    }

    final pv a(byte param0, boolean param1) {
        if (param0 != 51) {
            return (pv) null;
        }
        return (pv) ((Object) new ap((ir) (this), param1));
    }

    final void b() {
    }

    final void db(int param0) {
        float var2 = this.field_Z ? this.field_S : 0.0f;
        float var3 = this.field_Z ? -this.field_hb : 0.0f;
        this.field_Nc.SetDiffuse(this.field_J * var2, this.field_jb * var2, this.field_Xb * var2, 0.0f);
        this.field_Rc.SetDiffuse(this.field_J * var3, var3 * this.field_jb, var3 * this.field_Xb, (float)param0);
        this.field_Tc = false;
    }

    final void a(int param0, mp param1) {
        int var3 = 0;
        L0: {
          var3 = 0;
          if (param0 == 13754) {
            break L0;
          } else {
            this.r(-14);
            break L0;
          }
        }
        L1: {
          if (nl.field_n == param1) {
            var3 = 65536;
            break L1;
          } else {
            if (param1 != wn.field_b) {
              if (rt.field_C != param1) {
                break L1;
              } else {
                var3 = 196608;
                break L1;
              }
            } else {
              var3 = 131072;
              break L1;
            }
          }
        }
        int discarded$1 = this.field_Cc.SetTextureStageState(this.field_mc, 11, this.field_mc | var3);
    }

    final void b(int param0, int param1) throws rf {
        int fieldTemp$10 = 0;
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        int discarded$8 = this.field_Cc.EndScene();
        if (!this.field_Hc.a(-22169)) {
            fieldTemp$10 = this.field_Lc + 1;
            this.field_Lc = this.field_Lc + 1;
            if (!(fieldTemp$10 <= 50)) {
                throw new rf();
            }
            discarded$11 = this.h(true);
        } else {
            this.field_Lc = 0;
            if (!(!jagdx.gv.a(this.field_Hc.a(0, -95), -1))) {
                discarded$12 = this.h(true);
            }
        }
        int discarded$13 = this.field_Cc.BeginScene();
    }

    final static ha createToolkit(java.awt.Canvas param0, d param1, ki param2, Integer param3) {
        Object var4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jaclib.peer.pf var7 = null;
        Object var8 = null;
        jagdx.IDirect3D var8_ref = null;
        jagdx.D3DCAPS var9 = null;
        Object var10 = null;
        jagdx.D3DPRESENT_PARAMETERS var10_ref = null;
        int var11 = 0;
        jagdx.IDirect3DDevice var12 = null;
        kg var13 = null;
        jagdx.fg var14 = null;
        ir var15 = null;
        ir stackIn_42_0 = null;
        Throwable decompiledCaughtException = null;
        ir stackOut_41_0 = null;
        Object var12_ref = null;
        var4 = null;
        try {
          L0: {
            var5_int = 0;
            var6 = 1;
            var7 = new jaclib.peer.pf();
            var8_ref = jagdx.IDirect3D.a(-2147483616, var7);
            var9 = var8_ref.a(var5_int, var6);
            if ((16777216 & var9.RasterCaps) == 0) {
              throw new RuntimeException("");
            } else {
              if ((var9.MaxSimultaneousTextures ^ -1) > -3) {
                throw new RuntimeException("");
              } else {
                if ((2 & var9.TextureOpCaps) == 0) {
                  throw new RuntimeException("");
                } else {
                  if (-1 == (8 & var9.TextureOpCaps ^ -1)) {
                    throw new RuntimeException("");
                  } else {
                    if ((64 & var9.TextureOpCaps) != 0) {
                      if ((512 & var9.TextureOpCaps) != 0) {
                        if (0 != (var9.TextureOpCaps & 33554432)) {
                          if (-1 == (16 & (var9.DestBlendCaps & var9.SrcBlendCaps) ^ -1)) {
                            throw new RuntimeException("");
                          } else {
                            if ((32 & (var9.DestBlendCaps & var9.SrcBlendCaps)) == 0) {
                              throw new RuntimeException("");
                            } else {
                              if (0 != (2 & (var9.DestBlendCaps & var9.SrcBlendCaps))) {
                                L1: {
                                  if (var9.MaxActiveLights <= 0) {
                                    break L1;
                                  } else {
                                    if ((var9.MaxActiveLights ^ -1) <= -3) {
                                      break L1;
                                    } else {
                                      throw new RuntimeException("");
                                    }
                                  }
                                }
                                if (-6 >= (var9.MaxStreams ^ -1)) {
                                  var10_ref = new jagdx.D3DPRESENT_PARAMETERS(param0);
                                  if (ir.a(var8_ref, var6, var5_int, param3.intValue(), 6, var10_ref)) {
                                    L2: {
                                      var10_ref.PresentationInterval = -2147483648;
                                      var10_ref.Windowed = true;
                                      var10_ref.EnableAutoDepthStencil = true;
                                      var11 = 2;
                                      if ((var9.DevCaps & 1048576) != 0) {
                                        var11 = var11 | 16;
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                    var12_ref = null;
                                    try {
                                      L3: {
                                        var12 = var8_ref.a(var5_int, var6, param0, 64 | var11, var10_ref);
                                        break L3;
                                      }
                                    } catch (jagdx.fg decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L4: {
                                        var14 = (jagdx.fg) (Object) decompiledCaughtException;
                                        var12 = var8_ref.a(var5_int, var6, param0, 32 | var11, var10_ref);
                                        break L4;
                                      }
                                    }
                                    var13 = new kg(var12.b(0), var12.b());
                                    var15 = new ir(var5_int, var6, param0, var7, var8_ref, var12, var13, var10_ref, var9, param1, param2, param3.intValue());
                                    var4 = var15;
                                    var15.e(false);
                                    stackOut_41_0 = (ir) (var15);
                                    stackIn_42_0 = stackOut_41_0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            if (var4 != null) {
              ((ir) (var4)).d();
              break L5;
            } else {
              break L5;
            }
          }
          throw var5;
        }
        return (ha) ((Object) stackIn_42_0);
    }

    final void E(int param0) {
        this.field_Nc.SetDirection(-this.field_G[0], -this.field_G[1], -this.field_G[2]);
        this.field_Rc.SetDirection(-this.field_U[0], -this.field_U[1], -this.field_U[2]);
        this.field_Tc = false;
        if (param0 > -47) {
            this.field_zc = 11;
        }
    }

    static {
        field_Mc = new float[16];
        field_Zc = new int[]{77, 80};
        field_Fc = new int[]{22, 23};
    }
}
