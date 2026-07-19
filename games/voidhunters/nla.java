/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class nla extends pf {
    private boolean[] field_Vc;
    private jagdx.IDirect3DVertexShader field_Tc;
    private jagdx.D3DLIGHT field_Fc;
    private int field_Oc;
    private boolean[] field_Rc;
    private jagdx.D3DPRESENT_PARAMETERS field_Yc;
    private jagdx.D3DLIGHT field_Ac;
    private static float[] field_Bc;
    boolean field_Zc;
    private jagdx.IDirect3D field_Ic;
    jagdx.D3DCAPS field_Hc;
    private jagdx.D3DLIGHT field_Dc;
    jaclib.peer.tqb field_Sc;
    jagdx.PixelBuffer field_zc;
    boolean field_Nc;
    private boolean[] field_Lc;
    private int[] field_Cc;
    private int field_Ec;
    private tu[] field_Wc;
    boolean field_Jc;
    private static int[] field_Pc;
    jagdx.IDirect3DDevice field_Mc;
    private static int[] field_Xc;
    private boolean field_Qc;
    private gma field_Uc;
    private boolean[] field_yc;
    jagdx.GeometryBuffer field_Kc;
    private int field_Gc;

    private final static int a(int param0, tu param1) {
        if (param0 == 31365) {
          if (param1 == cs.field_a) {
            return 2;
          } else {
            if (jd.field_o == param1) {
              return 1;
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          return -23;
        }
    }

    final void w(int param0) {
        jagdx.IDirect3DDevice stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        jagdx.IDirect3DDevice stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jagdx.IDirect3DDevice stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        jagdx.IDirect3DDevice stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        jagdx.IDirect3DDevice stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        jagdx.IDirect3DDevice stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        jagdx.IDirect3DDevice stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jagdx.IDirect3DDevice stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        jagdx.IDirect3DDevice stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        jagdx.IDirect3DDevice stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            this.F(-116);
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = this.field_Mc;
            stackOut_2_1 = 28;
            stackIn_6_0 = stackOut_2_0;
            stackIn_6_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (!this.field_cc) {
              break L2;
            } else {
              stackOut_3_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_3_0);
              stackOut_3_1 = stackIn_3_1;
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (!this.field_ub) {
                break L2;
              } else {
                stackOut_4_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_4_0);
                stackOut_4_1 = stackIn_4_1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (0 > this.field_j) {
                  break L2;
                } else {
                  stackOut_5_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_5_0);
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_6_0);
          stackOut_6_1 = stackIn_6_1;
          stackOut_6_2 = 0;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          stackIn_7_2 = stackOut_6_2;
          break L1;
        }
        int discarded$2 = ((jagdx.IDirect3DDevice) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2 != 0);
    }

    private final static int a(kba param0, byte param1) {
        L0: {
          if (param1 > 87) {
            break L0;
          } else {
            field_Xc = (int[]) null;
            break L0;
          }
        }
        if (param0 == ida.field_x) {
          return 1;
        } else {
          if (param0 == vf.field_a) {
            return 2;
          } else {
            if (wda.field_o != param0) {
              if (gcb.field_q != param0) {
                if (ql.field_p != param0) {
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

    final void p(byte param0) {
        float[] discarded$1 = null;
        if (param0 < 84) {
            this.a(2.017637014389038f, 0.023083189502358437f, 1.1957261562347412f);
        }
        if (!this.field_ec) {
            discarded$1 = this.field_O.b(field_Bc, (byte) 114);
        } else {
            field_Bc[12] = 0.0f;
            field_Bc[3] = 0.0f;
            field_Bc[8] = 0.0f;
            field_Bc[9] = 0.0f;
            field_Bc[15] = 1.0f;
            field_Bc[4] = 0.0f;
            field_Bc[13] = 0.0f;
            field_Bc[1] = 0.0f;
            field_Bc[7] = 0.0f;
            field_Bc[2] = 0.0f;
            field_Bc[0] = 1.0f;
            field_Bc[11] = 0.0f;
            field_Bc[6] = 0.0f;
            field_Bc[14] = 0.0f;
            field_Bc[10] = 1.0f;
            field_Bc[5] = 1.0f;
        }
        int discarded$2 = this.field_Mc.SetTransform(256, field_Bc);
    }

    final void e(boolean param0) {
        this.G((byte) 28);
        this.i((byte) -114);
        if (param0) {
            this.field_Hc = (jagdx.D3DCAPS) null;
        }
    }

    private final static boolean a(jagdx.D3DPRESENT_PARAMETERS param0, int param1, byte param2, int param3, jagdx.IDirect3D param4, int param5) {
        int discarded$1 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Throwable var9 = null;
        int var10 = 0;
        int var11 = 0;
        jra var12 = null;
        jagdx.D3DDISPLAYMODE var13 = null;
        jagdx.D3DDISPLAYMODE var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param2 == -111) {
            break L0;
          } else {
            var12 = (jra) null;
            discarded$1 = nla.a((jra) null, 37);
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        var8 = 0;
        try {
          L1: {
            var13 = new jagdx.D3DDISPLAYMODE();
            var14 = var13;
            if (!jagdx.hea.a(param4.a(param3, var14), (byte) 118)) {
              L2: while (true) {
                L3: {
                  if (-1 < (param1 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (-2 == (param1 ^ -1)) {
                        break L4;
                      } else {
                        var8 = 0 - -param1;
                        var10 = 0;
                        L5: while (true) {
                          if (field_Xc.length <= var10) {
                            break L4;
                          } else {
                            L6: {
                              if (param4.CheckDeviceType(param3, param5, var13.Format, field_Xc[var10], true) == 0) {
                                if (param4.CheckDeviceFormat(param3, param5, var13.Format, 1, 1, field_Xc[var10]) != 0) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (0 == param1) {
                                      break L7;
                                    } else {
                                      if (0 == param4.CheckDeviceMultiSampleType(param3, param5, field_Xc[var10], true, var8)) {
                                        break L7;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var11 = 0;
                                  L8: while (true) {
                                    if (field_Pc.length <= var11) {
                                      break L6;
                                    } else {
                                      L9: {
                                        if (param4.CheckDeviceFormat(param3, param5, var13.Format, 2, 1, field_Pc[var11]) != 0) {
                                          break L9;
                                        } else {
                                          if (-1 == (param4.CheckDepthStencilMatch(param3, param5, var13.Format, field_Xc[var10], field_Pc[var11]) ^ -1)) {
                                            L10: {
                                              if (param1 == 0) {
                                                break L10;
                                              } else {
                                                if (param4.CheckDeviceMultiSampleType(param3, param5, field_Pc[var10], true, var8) != 0) {
                                                  break L9;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            var6 = field_Pc[var11];
                                            var7 = field_Xc[var10];
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
                              } else {
                                break L6;
                              }
                            }
                            var10++;
                            continue L5;
                          }
                        }
                      }
                    }
                    param1--;
                    continue L2;
                  }
                }
                L11: {
                  if (-1 < (param1 ^ -1)) {
                    break L11;
                  } else {
                    if (var7 == 0) {
                      break L11;
                    } else {
                      if (0 == var6) {
                        break L11;
                      } else {
                        param0.MultiSampleQuality = 0;
                        param0.BackBufferFormat = var7;
                        param0.MultiSampleType = var8;
                        param0.AutoDepthStencilFormat = var6;
                        stackOut_34_0 = 1;
                        stackIn_35_0 = stackOut_34_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
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
            return stackIn_33_0 != 0;
          } else {
            return stackIn_35_0 != 0;
          }
        }
    }

    final void a(jra param0, int param1, int param2, int param3) {
        int var5 = 31 % ((param3 - -4) / 32);
        int discarded$0 = this.field_Mc.DrawPrimitive(nla.a(param0, 1), param1, param2);
    }

    final void a(int param0, jagdx.IDirect3DVertexShader param1) {
        this.field_Tc = param1;
        int discarded$0 = this.field_Mc.SetVertexShader(param1);
        this.C(param0);
    }

    final void h(boolean param0) {
        this.field_Fc.SetAmbient(this.field_Sb * this.field_Rb, this.field_u * this.field_Rb, this.field_x * this.field_Rb, 0.0f);
        this.field_Qc = false;
        if (!param0) {
            this.field_Kc = (jagdx.GeometryBuffer) null;
        }
    }

    final void a(int param0, jagdx.IDirect3DPixelShader param1) {
        if (param0 >= -58) {
            this.a(-40, -73, -126, -53);
        }
        int discarded$0 = this.field_Mc.SetPixelShader(param1);
    }

    final void r(int param0) {
        int discarded$0 = 0;
        if (!(!this.field_yc[this.field_ab])) {
            this.field_yc[this.field_ab] = false;
            discarded$0 = this.field_Mc.SetTexture(this.field_ab, (jagdx.IDirect3DBaseTexture) null);
            this.l((byte) 114);
            this.o(-90);
        }
        if (param0 != 3) {
            this.field_yc = (boolean[]) null;
        }
    }

    private final static int a(boolean param0, aba param1) {
        ha discarded$2 = null;
        Integer var3 = null;
        if (param1 == et.field_c) {
          return 2;
        } else {
          if (asa.field_a == param1) {
            return 4;
          } else {
            if (param1 != df.field_o) {
              if (param1 != je.field_c) {
                if (param1 != feb.field_a) {
                  L0: {
                    if (!param0) {
                      break L0;
                    } else {
                      var3 = (Integer) null;
                      discarded$2 = nla.createToolkit((java.awt.Canvas) null, (d) null, (asb) null, (Integer) null);
                      break L0;
                    }
                  }
                  throw new IllegalArgumentException();
                } else {
                  return 10;
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

    final eb a(int param0, int param1, int param2, kb param3, mj param4) {
        if (param0 < 115) {
            this.field_zc = (jagdx.PixelBuffer) null;
        }
        return (eb) ((Object) new sb((nla) (this), param3, param4, param1, param2));
    }

    final void a(cpb param0, int param1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        this.a(94, param0);
        if (!this.field_Vc[this.field_ab]) {
            discarded$0 = this.field_Mc.SetSamplerState(this.field_ab, 1, 1);
            this.field_Vc[this.field_ab] = true;
        }
        if (!(this.field_Lc[this.field_ab])) {
            discarded$1 = this.field_Mc.SetSamplerState(this.field_ab, 2, 1);
            this.field_Lc[this.field_ab] = true;
        }
        if (param1 != -7913) {
            this.field_Hc = (jagdx.D3DCAPS) null;
        }
    }

    final void a(boolean param0, byte param1, slb param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hf var8 = null;
        L0: {
          var7 = param3;
          if (var7 == 1) {
            var5 = 6;
            break L0;
          } else {
            if (2 == var7) {
              var5 = 27;
              break L0;
            } else {
              var5 = 5;
              break L0;
            }
          }
        }
        L1: {
          var6 = 0;
          if (param1 == 94) {
            break L1;
          } else {
            var8 = (hf) null;
            this.a((hf) null);
            break L1;
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            var6 = var6 | 16;
            break L2;
          }
        }
        int discarded$1 = this.field_Mc.SetTextureStageState(this.field_ab, var5, var6 | nla.a(param2, (byte) -70));
    }

    final void A(byte param0) {
        int var2 = -16 / ((-6 - param0) / 45);
        int discarded$0 = this.field_Mc.SetScissorRect(this.field_H + this.field_Y, this.field_Cb - -this.field_xc, this.field_F, this.field_Bb);
    }

    final void j(int param0) {
        this.field_r = (float)(-this.field_Qb + this.field_Wb);
        this.field_p = (float)(-this.field_j) + this.field_r;
        if (param0 != 8) {
            this.field_Jc = false;
        }
        if (this.field_p < (float)this.field_h) {
            this.field_p = (float)this.field_h;
        }
        int discarded$0 = this.field_Mc.a(36, this.field_p);
        int discarded$1 = this.field_Mc.a(37, this.field_r);
        int discarded$2 = this.field_Mc.SetRenderState(34, this.field_lc);
    }

    final void a(int param0, boolean param1) {
        if (param0 > -14) {
            this.field_Kc = (jagdx.GeometryBuffer) null;
        }
        int discarded$0 = this.field_Mc.a(161, param1);
    }

    final void a(float param0, float param1, float param2) {
    }

    final void j(byte param0) {
        boolean discarded$9 = false;
        int discarded$8 = this.field_Mc.a(27, this.field_zb);
        if (param0 != -56) {
            discarded$9 = this.b();
        }
    }

    final void C(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int var2 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (null != this.field_Tc) {
                break L1;
              } else {
                if (fsa.field_o != this.field_A[this.field_ab]) {
                  L2: {
                    if (vf.field_a != this.field_A[this.field_ab]) {
                      discarded$5 = this.field_Mc.SetTransform(this.field_ab + 16, this.field_Eb[this.field_ab].b(field_Bc, (byte) 114));
                      break L2;
                    } else {
                      discarded$6 = this.field_Mc.SetTransform(this.field_ab + 16, this.field_Eb[this.field_ab].c(field_Bc, (byte) -80));
                      break L2;
                    }
                  }
                  var2 = nla.a(this.field_A[this.field_ab], (byte) 123);
                  if (this.field_Cc[this.field_ab] != var2) {
                    discarded$7 = this.field_Mc.SetTextureStageState(this.field_ab, 24, var2);
                    this.field_Cc[this.field_ab] = var2;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            discarded$8 = this.field_Mc.SetTextureStageState(this.field_ab, 24, 0);
            this.field_Cc[this.field_ab] = 0;
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void m(int param0) {
        this.field_Fc.SetDirection(-this.field_wc[0], -this.field_wc[1], -this.field_wc[2]);
        this.field_Dc.SetDirection(-this.field_cb[0], -this.field_cb[1], -this.field_cb[2]);
        if (param0 != 3) {
            this.v((byte) 31);
        }
        this.field_Qc = false;
    }

    private nla(int param0, int param1, java.awt.Canvas param2, jaclib.peer.tqb param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, gma param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, d param9, asb param10, int param11) {
        super(param2, param6, param9, param10, param11, 0);
        jagdx.GeometryBuffer discarded$2 = null;
        int discarded$3 = 0;
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
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
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
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        this.field_Qc = false;
        this.field_Gc = 0;
        try {
          L0: {
            L1: {
              this.field_Hc = param8;
              this.field_Yc = param7;
              this.field_Uc = param6;
              this.field_Ec = param1;
              this.field_Sc = param3;
              this.field_Oc = param0;
              this.field_Ic = param4;
              this.field_Mc = param5;
              this.field_Fc = new jagdx.D3DLIGHT(this.field_Sc);
              this.field_Dc = new jagdx.D3DLIGHT(this.field_Sc);
              this.field_Ac = new jagdx.D3DLIGHT(this.field_Sc);
              this.field_zc = new jagdx.PixelBuffer(this.field_Sc);
              this.field_Kc = new jagdx.GeometryBuffer(this.field_Sc);
              discarded$2 = new jagdx.GeometryBuffer(this.field_Sc);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (-1 > (this.field_Hc.MaxActiveLights ^ -1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = this.field_Hc.MaxActiveLights;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 8;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((nla) (this)).field_qb = stackIn_4_1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (-1 == (2048 & this.field_Hc.TextureCaps ^ -1)) {
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
              ((nla) (this)).field_vb = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-1 != (2 & this.field_Hc.TextureCaps ^ -1)) {
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
              ((nla) (this)).field_Nc = stackIn_10_1 != 0;
              this.field_L = this.field_Hc.MaxSimultaneousTextures;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (-1 == (16384 & this.field_Hc.TextureCaps ^ -1)) {
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
              ((nla) (this)).field_Zc = stackIn_13_1 != 0;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if ((8192 & this.field_Hc.TextureCaps) == 0) {
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
              ((nla) (this)).field_uc = stackIn_16_1 != 0;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if ((this.field_Hc.TextureCaps & 65536) == 0) {
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
              L8: {
                ((nla) (this)).field_Jc = stackIn_19_1 != 0;
                stackOut_19_0 = this;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (0 < this.field_rc) {
                  break L8;
                } else {
                  stackOut_20_0 = this;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (0 != this.field_Ic.CheckDeviceMultiSampleType(this.field_Oc, this.field_Ec, this.field_Yc.BackBufferFormat, true, 2)) {
                    stackOut_22_0 = this;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              stackOut_21_0 = this;
              stackOut_21_1 = 1;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              break L7;
            }
            ((nla) (this)).field_sc = stackIn_23_1 != 0;
            this.field_Wc = new tu[this.field_L];
            this.field_Lc = new boolean[this.field_L];
            this.field_yc = new boolean[this.field_L];
            this.field_Cc = new int[this.field_L];
            this.field_Rc = new boolean[this.field_L];
            this.field_Vc = new boolean[this.field_L];
            discarded$3 = this.field_Mc.BeginScene();
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          this.a((byte) 30);
          throw new RuntimeException("");
        }
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        if (param2 != 0) {
            slb var5 = (slb) null;
            this.a(false, (byte) 113, (slb) null, 67);
        }
    }

    final void B(int param0) {
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
            stackOut_0_0 = this.field_Mc;
            stackOut_0_1 = 137;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!this.field_Xb) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (this.field_Hb) {
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
          if (param0 < -15) {
            break L2;
          } else {
            this.field_Qc = true;
            break L2;
          }
        }
    }

    final boolean a(mj param0, kb param1, int param2) {
        int var4 = 0;
        jagdx.D3DDISPLAYMODE var5 = null;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = -73 % ((-32 - param2) / 50);
            var5 = new jagdx.D3DDISPLAYMODE();
            if (!jagdx.hea.b(this.field_Ic.a(this.field_Oc, var5), (byte) 21)) {
              break L1;
            } else {
              if (!jagdx.hea.b(this.field_Ic.CheckDeviceFormat(this.field_Oc, this.field_Ec, var5.Format, 0, 4, nla.a(param1, param0, -97)), (byte) 62)) {
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

    final void G(byte param0) {
        float var2 = !this.field_g ? 0.0f : this.field_oc;
        if (param0 < 4) {
            this.j(105);
        }
        float var3 = this.field_g ? -this.field_tc : 0.0f;
        this.field_Fc.SetDiffuse(var2 * this.field_Sb, this.field_u * var2, this.field_x * var2, 0.0f);
        this.field_Dc.SetDiffuse(this.field_Sb * var3, var3 * this.field_u, this.field_x * var3, 0.0f);
        this.field_Qc = false;
    }

    private final static int a(jra param0, int param1) {
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            field_Pc = (int[]) null;
            break L0;
          }
        }
        if (param0 == tu.field_b) {
          return 2;
        } else {
          if (param0 == era.field_o) {
            return 3;
          } else {
            if (mwa.field_p == param0) {
              return 1;
            } else {
              if (di.field_i != param0) {
                if (bk.field_v == param0) {
                  return 6;
                } else {
                  if (param0 != fu.field_o) {
                    throw new IllegalArgumentException("");
                  } else {
                    return 5;
                  }
                }
              } else {
                return 4;
              }
            }
          }
        }
    }

    private final boolean K(int param0) {
        int var4 = 0;
        int var2 = this.field_Mc.TestCooperativeLevel();
        if (param0 != 60) {
            field_Pc = (int[]) null;
        }
        if (var2 != 0) {
            if (var2 != -2005530519) {
                return false;
            }
        }
        gma var3 = (gma) (this.field_qc);
        this.n((byte) -79);
        var3.a(-106);
        this.field_Yc.BackBufferWidth = 0;
        this.field_Yc.BackBufferHeight = 0;
        if (nla.a(this.field_Yc, this.field_rc, (byte) -111, this.field_Oc, this.field_Ic, this.field_Ec)) {
            var4 = this.field_Mc.Reset(this.field_Yc);
            if (!(!jagdx.hea.b(var4, (byte) 82))) {
                var3.a(0, this.field_Mc.b(0), this.field_Mc.b());
                this.i(0);
                this.n(109);
                return true;
            }
        }
        return false;
    }

    final void a(byte param0, mkb param1, int param2) {
        mga var4 = (mga) ((Object) param1);
        if (param0 != -6) {
            return;
        }
        int discarded$0 = this.field_Mc.SetStreamSource(param2, var4.field_f, 0, var4.a((byte) -33));
    }

    final void v() {
    }

    final void a(int param0, int param1) throws jkb {
        int discarded$19 = 0;
        int fieldTemp$20 = 0;
        boolean discarded$21 = false;
        boolean discarded$22 = false;
        L0: {
          discarded$19 = this.field_Mc.EndScene();
          if (!this.field_Uc.a((byte) -72)) {
            fieldTemp$20 = this.field_Gc + 1;
            this.field_Gc = this.field_Gc + 1;
            if (fieldTemp$20 > 50) {
              throw new jkb();
            } else {
              discarded$21 = this.K(60);
              break L0;
            }
          } else {
            this.field_Gc = 0;
            if (!jagdx.hea.a(this.field_Uc.a(false, 0), (byte) 54)) {
              break L0;
            } else {
              discarded$22 = this.K(60);
              break L0;
            }
          }
        }
        int discarded$23 = this.field_Mc.BeginScene();
    }

    final hdb a(boolean param0, int param1, int[][] param2, int param3) {
        if (param1 != -5210) {
            field_Pc = (int[]) null;
        }
        return (hdb) ((Object) new jf((nla) (this), param3, param0, param2));
    }

    final void ya() {
        this.b((byte) -74, true);
        int discarded$0 = this.field_Mc.Clear(2, 0, 1.0f, 0);
    }

    final void o() {
        this.field_Sc.a((byte) 101);
        super.o();
    }

    final void u() {
    }

    final void f(int param0) {
        fsb var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int discarded$0 = 0;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        int var2 = 0;
        if (param0 < 66) {
            return;
        }
        for (var2 = 0; var2 < this.field_Kb; var2++) {
            var3 = this.field_Lb[var2];
            var4 = var2 + 2;
            var5 = var3.a(-99);
            var6 = var3.d(-392138175) / 255.0f;
            this.field_Ac.SetPosition((float)var3.c((byte) -79), (float)var3.a(true), (float)var3.d((byte) 121));
            this.field_Ac.SetDiffuse((float)(var5 >> -1572111760 & 255) * var6, (float)((65477 & var5) >> -1316945688) * var6, var6 * (float)(255 & var5), 0.0f);
            this.field_Ac.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.c(16777215) * var3.c(16777215)));
            this.field_Ac.SetRange((float)var3.c(16777215));
            discarded$0 = this.field_Mc.SetLight(var4, this.field_Ac);
            discarded$1 = this.field_Mc.LightEnable(var4, true);
        }
        while (var2 < this.field_bb) {
            discarded$2 = this.field_Mc.LightEnable(2 + var2, false);
            var2++;
        }
        super.f(123);
    }

    final void i(byte param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int discarded$2 = 0;
        int discarded$3 = 0;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (!this.field_Qc) {
            discarded$0 = this.field_Mc.LightEnable(0, false);
            discarded$1 = this.field_Mc.LightEnable(1, false);
            discarded$2 = this.field_Mc.SetLight(0, this.field_Fc);
            discarded$3 = this.field_Mc.SetLight(1, this.field_Dc);
            discarded$4 = this.field_Mc.LightEnable(0, true);
            discarded$5 = this.field_Mc.LightEnable(1, true);
            this.field_Qc = true;
        }
        int var2 = -75 % ((param0 - -45) / 51);
    }

    final void m(byte param0) {
        int discarded$0 = this.field_Mc.SetViewport(this.field_Y, this.field_Cb, this.field_db, this.field_i, 0.0f, 1.0f);
        int var2 = -124 % ((-40 - param0) / 57);
    }

    final eb a(int param0, byte[] param1, kb param2, int param3, int param4, int param5, boolean param6, int param7) {
        wib discarded$0 = null;
        if (param7 != 11) {
            discarded$0 = this.b(-44, 57);
        }
        return (eb) ((Object) new sb((nla) (this), param2, param4, param5, param6, param1, param0, param3));
    }

    final void a(int param0, sb param1) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        if (param0 <= 122) {
            return;
        }
        this.a(116, (ora) (param1));
        if (param1.field_f != this.field_Vc[this.field_ab]) {
            discarded$0 = this.field_Mc.SetSamplerState(this.field_ab, 1, param1.field_f ? 1 : 3);
            this.field_Vc[this.field_ab] = param1.field_f;
        }
        if ((!param1.field_g ? 1 : 0) != (!this.field_Lc[this.field_ab] ? 1 : 0)) {
            discarded$1 = this.field_Mc.SetSamplerState(this.field_ab, 2, !param1.field_g ? 3 : 1);
            this.field_Lc[this.field_ab] = param1.field_g;
        }
    }

    final eb a(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6) {
        if (!param5) {
            return (eb) null;
        }
        return (eb) ((Object) new sb((nla) (this), param0, param3, param1, param2, param6, param4));
    }

    final void t(int param0) {
        if (param0 != 12) {
            this.n(-20);
        }
    }

    final vca a(byte param0, boolean param1) {
        if (param0 != -19) {
            this.y((byte) -63);
        }
        return (vca) ((Object) new okb((nla) (this), mj.field_e, param1));
    }

    final boolean s() {
        return false;
    }

    final mkb a(boolean param0, int param1) {
        vca discarded$0 = null;
        if (param1 != 3) {
            discarded$0 = this.a((byte) 82, true);
        }
        return (mkb) ((Object) new mga((nla) (this), param0));
    }

    final void o(byte param0) {
        int discarded$0 = 0;
        if (param0 != 81) {
            kba var3 = (kba) null;
            discarded$0 = nla.a((kba) null, (byte) -103);
        }
        int discarded$1 = this.field_Mc.a(174, this.field_ac);
    }

    final float f(byte param0) {
        int discarded$0 = 0;
        if (param0 > -90) {
            slb var3 = (slb) null;
            discarded$0 = nla.a((slb) null, (byte) 118);
        }
        return -0.5f;
    }

    final boolean b() {
        return false;
    }

    final void G(int param0) {
        float[] discarded$0 = null;
        if (!this.field_pb.a(-12178)) {
            field_Bc[6] = 0.0f;
            field_Bc[3] = 0.0f;
            field_Bc[2] = 0.0f;
            field_Bc[1] = 0.0f;
            field_Bc[0] = 1.0f;
            field_Bc[11] = 0.0f;
            field_Bc[8] = 0.0f;
            field_Bc[9] = 0.0f;
            field_Bc[12] = 0.0f;
            field_Bc[10] = 1.0f;
            field_Bc[4] = 0.0f;
            field_Bc[7] = 0.0f;
            field_Bc[5] = 1.0f;
            field_Bc[14] = 0.0f;
            field_Bc[15] = 1.0f;
            field_Bc[13] = 0.0f;
        } else {
            discarded$0 = this.field_gb.b(field_Bc, (byte) 114);
        }
        if (param0 != 17891) {
            this.field_Gc = 99;
        }
        int discarded$1 = this.field_Mc.SetTransform(2, field_Bc);
    }

    final void n(int param0) {
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
          if (var2 >= this.field_L) {
            L1: {
              discarded$15 = this.field_Mc.SetTextureStageState(0, 6, 1);
              discarded$16 = this.field_Mc.SetRenderState(9, 2);
              discarded$17 = this.field_Mc.SetRenderState(23, 4);
              discarded$18 = this.field_Mc.SetRenderState(25, 5);
              discarded$19 = this.field_Mc.SetRenderState(24, 0);
              discarded$20 = this.field_Mc.SetRenderState(22, 2);
              discarded$21 = this.field_Mc.SetRenderState(147, 1);
              discarded$22 = this.field_Mc.SetRenderState(145, 1);
              discarded$23 = this.field_Mc.a(38, 0.949999988079071f);
              if (param0 > 106) {
                break L1;
              } else {
                this.field_Kc = (jagdx.GeometryBuffer) null;
                break L1;
              }
            }
            discarded$24 = this.field_Mc.SetRenderState(140, 3);
            this.field_Fc.SetType(3);
            this.field_Dc.SetType(3);
            this.field_Ac.SetType(1);
            this.field_Qc = false;
            super.n(116);
            return;
          } else {
            discarded$25 = this.field_Mc.SetSamplerState(var2, 7, 0);
            discarded$26 = this.field_Mc.SetSamplerState(var2, 6, 2);
            discarded$27 = this.field_Mc.SetSamplerState(var2, 5, 2);
            discarded$28 = this.field_Mc.SetSamplerState(var2, 1, 1);
            discarded$29 = this.field_Mc.SetSamplerState(var2, 2, 1);
            this.field_Wc[var2] = cs.field_a;
            var3 = this.field_Vc;
            var4 = var2;
            this.field_Lc[var2] = true;
            var3[var4] = true;
            this.field_Rc[var2] = false;
            this.field_Cc[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static ha createToolkit(java.awt.Canvas param0, d param1, asb param2, Integer param3) {
        Object var4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jaclib.peer.tqb var7 = null;
        Object var8 = null;
        jagdx.IDirect3D var8_ref = null;
        jagdx.D3DCAPS var9 = null;
        Object var10 = null;
        jagdx.D3DPRESENT_PARAMETERS var10_ref = null;
        int var11 = 0;
        jagdx.IDirect3DDevice var12 = null;
        jagdx.nba var13 = null;
        gma var13_ref = null;
        nla var14 = null;
        nla stackIn_41_0 = null;
        Throwable decompiledCaughtException = null;
        nla stackOut_40_0 = null;
        Object var12_ref = null;
        var4 = null;
        try {
          L0: {
            var5_int = 0;
            var6 = 1;
            var7 = new jaclib.peer.tqb();
            var8_ref = jagdx.IDirect3D.a(-2147483616, var7);
            var9 = var8_ref.a(var5_int, var6);
            if (-1 == (var9.RasterCaps & 16777216 ^ -1)) {
              throw new RuntimeException("");
            } else {
              if (2 <= var9.MaxSimultaneousTextures) {
                if ((2 & var9.TextureOpCaps) != 0) {
                  if (-1 != (8 & var9.TextureOpCaps ^ -1)) {
                    if (0 != (var9.TextureOpCaps & 64)) {
                      if (0 == (var9.TextureOpCaps & 512)) {
                        throw new RuntimeException("");
                      } else {
                        if (0 != (33554432 & var9.TextureOpCaps)) {
                          if ((16 & (var9.DestBlendCaps & var9.SrcBlendCaps)) == 0) {
                            throw new RuntimeException("");
                          } else {
                            if (-1 != (var9.SrcBlendCaps & var9.DestBlendCaps & 32 ^ -1)) {
                              if (-1 == (2 & (var9.SrcBlendCaps & var9.DestBlendCaps) ^ -1)) {
                                throw new RuntimeException("");
                              } else {
                                L1: {
                                  if (var9.MaxActiveLights <= 0) {
                                    break L1;
                                  } else {
                                    if (-3 >= (var9.MaxActiveLights ^ -1)) {
                                      break L1;
                                    } else {
                                      throw new RuntimeException("");
                                    }
                                  }
                                }
                                if (var9.MaxStreams >= 5) {
                                  var10_ref = new jagdx.D3DPRESENT_PARAMETERS(param0);
                                  if (!nla.a(var10_ref, param3.intValue(), (byte) -111, var5_int, var8_ref, var6)) {
                                    throw new RuntimeException("");
                                  } else {
                                    L2: {
                                      var10_ref.PresentationInterval = -2147483648;
                                      var10_ref.EnableAutoDepthStencil = true;
                                      var10_ref.Windowed = true;
                                      var11 = 2;
                                      if (-1 != (1048576 & var9.DevCaps ^ -1)) {
                                        var11 = var11 | 16;
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                    var12_ref = null;
                                    try {
                                      L3: {
                                        var12 = var8_ref.a(var5_int, var6, param0, var11 | 64, var10_ref);
                                        break L3;
                                      }
                                    } catch (jagdx.nba decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L4: {
                                        var13 = (jagdx.nba) (Object) decompiledCaughtException;
                                        var12 = var8_ref.a(var5_int, var6, param0, 32 | var11, var10_ref);
                                        break L4;
                                      }
                                    }
                                    var13_ref = new gma(var12.b(0), var12.b());
                                    var14 = new nla(var5_int, var6, param0, var7, var8_ref, var12, var13_ref, var10_ref, var9, param1, param2, param3.intValue());
                                    var4 = var14;
                                    var14.z(-31089);
                                    stackOut_40_0 = (nla) (var14);
                                    stackIn_41_0 = stackOut_40_0;
                                    break L0;
                                  }
                                } else {
                                  throw new RuntimeException("");
                                }
                              }
                            } else {
                              throw new RuntimeException("");
                            }
                          }
                        } else {
                          throw new RuntimeException("");
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
              } else {
                throw new RuntimeException("");
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            if (var4 == null) {
              break L5;
            } else {
              ((nla) (var4)).o();
              break L5;
            }
          }
          throw var5;
        }
        return (ha) ((Object) stackIn_41_0);
    }

    final void a(boolean param0, int param1, boolean param2, slb param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          if (param1 == -21115) {
            break L0;
          } else {
            this.field_Vc = (boolean[]) null;
            break L0;
          }
        }
        L1: {
          var7 = 0;
          var8 = param4;
          if ((var8 ^ -1) == -2) {
            var6 = 3;
            break L1;
          } else {
            if (var8 == 2) {
              var6 = 26;
              break L1;
            } else {
              var6 = 2;
              break L1;
            }
          }
        }
        L2: {
          if (param0) {
            var7 = var7 | 32;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!param2) {
            break L3;
          } else {
            var7 = var7 | 16;
            break L3;
          }
        }
        int discarded$1 = this.field_Mc.SetTextureStageState(this.field_ab, var6, nla.a(param3, (byte) 100) | var7);
    }

    final void s(byte param0) {
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int discarded$18 = 0;
        int discarded$19 = 0;
        L0: {
          if (param0 == -39) {
            break L0;
          } else {
            this.ya();
            break L0;
          }
        }
        L1: {
          if (this.field_fc == to.field_o) {
            discarded$14 = this.field_Mc.SetRenderState(19, 5);
            discarded$15 = this.field_Mc.SetRenderState(20, 6);
            break L1;
          } else {
            if (this.field_fc == oj.field_b) {
              discarded$16 = this.field_Mc.SetRenderState(19, 2);
              discarded$17 = this.field_Mc.SetRenderState(20, 2);
              break L1;
            } else {
              if (this.field_fc == ub.field_e) {
                discarded$18 = this.field_Mc.SetRenderState(19, 9);
                discarded$19 = this.field_Mc.SetRenderState(20, 2);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
    }

    final static int a(kb param0, mj param1, int param2) {
        L0: {
          if (param1 != mj.field_f) {
            break L0;
          } else {
            if (ep.field_o != param0) {
              if (param0 != qua.field_d) {
                if (param0 == nw.field_p) {
                  return 28;
                } else {
                  if (param0 != gka.field_p) {
                    if (param0 != wh.field_o) {
                      if (param0 != qf.field_o) {
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
            } else {
              return 22;
            }
          }
        }
        L1: {
          if (param2 <= -77) {
            break L1;
          } else {
            field_Pc = (int[]) null;
            break L1;
          }
        }
        throw new IllegalArgumentException("");
    }

    final void d(int param0, int param1) {
        int var3 = -40 % ((36 - param0) / 33);
        int discarded$0 = this.field_Mc.SetTextureStageState(this.field_ab, 11, param1);
    }

    final synchronized void c(int param0) {
        this.field_Sc.a(false);
        super.c(param0);
    }

    final gf a(int param0, int param1, byte[] param2, kb param3, int param4, int param5) {
        if (param5 != -16539) {
            this.field_Mc = (jagdx.IDirect3DDevice) null;
        }
        return (gf) ((Object) new cpb((nla) (this), param3, param4, param0, param1, param2));
    }

    final void v(byte param0) {
        eb discarded$0 = null;
        if (param0 != -109) {
            kb var3 = (kb) null;
            discarded$0 = this.a(-96, (byte[]) null, (kb) null, -82, 72, 41, false, 39);
        }
        int discarded$1 = this.field_Mc.SetRenderState(60, this.field_jb);
    }

    final eb a(kb param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7) {
        if (param6) {
            return null;
        }
        this.field_Jc = false;
        return null;
    }

    final void o(int param0) {
        int discarded$0 = 0;
        int var2 = this.field_yc[this.field_ab] ? nla.a(false, this.field_z[this.field_ab]) : 1;
        if (param0 > -64) {
            mj var3 = (mj) null;
            discarded$0 = nla.a((kb) null, (mj) null, 107);
        }
        int discarded$1 = this.field_Mc.SetTextureStageState(this.field_ab, 1, var2);
    }

    final vmb a(int param0, qma[] param1) {
        if (param0 != 10) {
            this.field_Ic = (jagdx.IDirect3D) null;
        }
        return (vmb) ((Object) new dxVertexLayout((nla) (this), param1));
    }

    final void a(aja param0, boolean param1) {
    }

    private final static int a(slb param0, byte param1) {
        int var2 = 0;
        if (param0 != qcb.field_q) {
          if (param0 == tma.field_q) {
            return 0;
          } else {
            if (pja.field_l != param0) {
              if (param0 == pea.field_d) {
                return 3;
              } else {
                var2 = -14 / ((param1 - 31) / 56);
                throw new IllegalArgumentException();
              }
            } else {
              return 1;
            }
          }
        } else {
          return 2;
        }
    }

    final int[] na(int param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        Object var5 = null;
        jagdx.IDirect3DSurface var6 = null;
        jagdx.IDirect3DSurface var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        L0: {
          var5 = null;
          var6 = this.field_Mc.a(0);
          var7 = this.field_Mc.a(param2, param3, 21, 0, 0, true);
          if (!jagdx.hea.b(this.field_Mc.StretchRect(var6, param0, param1, param2, param3, var7, 0, 0, param2, param3, 0), (byte) 125)) {
            break L0;
          } else {
            if (jagdx.hea.b(var7.LockRect(0, 0, param2, param3, 16, this.field_zc), (byte) 49)) {
              L1: {
                var12 = new int[param2 * param3];
                var11 = var12;
                var10 = var11;
                var5 = var10;
                var8 = this.field_zc.getRowPitch();
                if (var8 == param2 * 4) {
                  this.field_zc.b(var12, 0, 0, param3 * param2);
                  break L1;
                } else {
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= param3) {
                      break L1;
                    } else {
                      this.field_zc.b(var12, var9 * param2, var8 * var9, param2);
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
              discarded$1 = var7.UnlockRect();
              break L0;
            } else {
              break L0;
            }
          }
        }
        return (int[]) (var5);
    }

    final void a(int param0, vmb param1) {
        dxVertexLayout var3 = (dxVertexLayout) ((Object) param1);
        int var4 = 80 % ((param0 - 55) / 44);
        int discarded$0 = this.field_Mc.SetVertexDeclaration(var3.field_b);
    }

    final hf a(ekb param0, wib param1) {
        return null;
    }

    final void j() {
    }

    final uda a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var3 = 33 % ((param0 - -34) / 63);
        var4 = param1;
        if (3 == var4) {
          return (uda) ((Object) new fta((nla) (this), this.field_Ab));
        } else {
          if (4 == var4) {
            return (uda) ((Object) new wcb((nla) (this), this.field_Ab, this.field_Mb));
          } else {
            if ((var4 ^ -1) != -9) {
              return super.a((byte) 99, param1);
            } else {
              return (uda) ((Object) new hl((nla) (this), this.field_Ab, this.field_Mb));
            }
          }
        }
    }

    final void I(int param0) {
        if (param0 != 17634) {
            return;
        }
        int discarded$0 = this.field_Mc.a(15, this.field_eb);
    }

    final boolean a(int param0, kb param1, mj param2) {
        jagdx.D3DDISPLAYMODE var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = new jagdx.D3DDISPLAYMODE();
            var5 = -100 % ((-77 - param0) / 49);
            if (!jagdx.hea.b(this.field_Ic.a(this.field_Oc, var4), (byte) 62)) {
              break L1;
            } else {
              if (!jagdx.hea.b(this.field_Ic.CheckDeviceFormat(this.field_Oc, this.field_Ec, var4.Format, 0, 3, nla.a(param1, param2, -106)), (byte) 98)) {
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

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        boolean discarded$2 = false;
        jagdx.IDirect3DSurface var9 = null;
        int var10 = 0;
        int var11 = 0;
        jagdx.IDirect3DSurface var12 = null;
        L0: {
          var12 = this.field_Mc.a(0);
          var9 = this.field_Mc.a(param2, param3, 21, 0, 0, true);
          if (jagdx.hea.b(var9.LockRect(0, 0, param2, param3, 0, this.field_zc), (byte) 47)) {
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
                var10 = this.field_zc.getRowPitch();
                if (param6 != param2) {
                  break L3;
                } else {
                  if (4 * param2 == var10) {
                    this.field_zc.a(param4, param5, 0, param3 * param2);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var11 = 0;
              L4: while (true) {
                if (var11 >= param3) {
                  break L2;
                } else {
                  this.field_zc.a(param4, param6 * var11 + param5, var10 * var11, param2);
                  var11++;
                  continue L4;
                }
              }
            }
            discarded$2 = var9.UnlockRect();
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$3 = this.field_Mc.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
    }

    final void GA(int param0) {
        int discarded$0 = this.field_Mc.Clear(1, param0, 0.0f, 0);
    }

    final void y(int param0) {
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
            stackOut_0_0 = this.field_Mc;
            stackOut_0_1 = 14;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!this.field_M) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_1_0);
              stackOut_1_1 = stackIn_1_1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!this.field_X) {
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
          if (param0 < -41) {
            break L2;
          } else {
            this.field_Wc = (tu[]) null;
            break L2;
          }
        }
    }

    final void F(int param0) {
        int discarded$8 = this.field_Mc.a(7, this.field_nc);
        if (param0 != 12614) {
            this.field_Hc = (jagdx.D3DCAPS) null;
        }
    }

    final void a(hf param0) {
    }

    final void a(byte param0, uja param1) {
        int discarded$1 = 0;
        int var3 = 0;
        L0: {
          var3 = 0;
          if (tea.field_d == param1) {
            var3 = 65536;
            break L0;
          } else {
            if (rpa.field_c != param1) {
              if (param1 != tma.field_p) {
                break L0;
              } else {
                var3 = 196608;
                break L0;
              }
            } else {
              var3 = 131072;
              break L0;
            }
          }
        }
        L1: {
          discarded$1 = this.field_Mc.SetTextureStageState(this.field_ab, 11, var3 | this.field_ab);
          if (param0 == -111) {
            break L1;
          } else {
            this.field_Zc = true;
            break L1;
          }
        }
    }

    final wib b(int param0, int param1) {
        return null;
    }

    final Object a(byte param0, java.awt.Canvas param1) {
        if (param0 <= -21) {
            return null;
        }
        return (Object) null;
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final void y(byte param0) {
        if (param0 >= -17) {
            this.field_Nc = false;
        }
        int discarded$0 = this.field_Mc.SetTransform(3, this.field_Fb);
    }

    final void a(int param0, ora param1) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        jagdx.IDirect3DDevice stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        jagdx.IDirect3DDevice stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        jagdx.IDirect3DDevice stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_14_0 = 0;
        jagdx.IDirect3DDevice stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        jagdx.IDirect3DDevice stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        jagdx.IDirect3DDevice stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        jagdx.IDirect3DDevice stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        jagdx.IDirect3DDevice stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        jagdx.IDirect3DDevice stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        jagdx.IDirect3DDevice stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        jagdx.IDirect3DDevice stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        jagdx.IDirect3DDevice stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int discarded$5 = this.field_Mc.SetTexture(this.field_ab, param1.c(24971));
        if (param0 >= 4) {
          L0: {
            if (this.field_Wc[this.field_ab] == param1.field_e) {
              L1: {
                if (this.field_Rc[this.field_ab]) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              if (stackIn_14_0 == (param1.field_b ? 1 : 0)) {
                L2: {
                  stackOut_16_0 = this.field_Mc;
                  stackOut_16_1 = this.field_ab;
                  stackOut_16_2 = 7;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (!param1.field_b) {
                    stackOut_18_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_18_0);
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L2;
                  } else {
                    stackOut_17_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_17_0);
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = nla.a(31365, param1.field_e);
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L2;
                  }
                }
                discarded$6 = ((jagdx.IDirect3DDevice) (Object) stackIn_19_0).SetSamplerState(stackIn_19_1, stackIn_19_2, stackIn_19_3);
                this.field_Rc[this.field_ab] = param1.field_b;
                break L0;
              } else {
                break L0;
              }
            } else {
              L3: {
                var3 = nla.a(31365, param1.field_e);
                discarded$7 = this.field_Mc.SetSamplerState(this.field_ab, 6, var3);
                discarded$8 = this.field_Mc.SetSamplerState(this.field_ab, 5, var3);
                this.field_Wc[this.field_ab] = param1.field_e;
                stackOut_3_0 = this.field_Rc[this.field_ab];
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param1.field_b) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              if ((stackIn_6_0 ? 1 : 0) != stackIn_6_1) {
                break L0;
              } else {
                L4: {
                  stackOut_7_0 = this.field_Mc;
                  stackOut_7_1 = this.field_ab;
                  stackOut_7_2 = 7;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  if (param1.field_b) {
                    stackOut_9_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_9_0);
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = stackIn_9_2;
                    stackOut_9_3 = nla.a(31365, param1.field_e);
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    break L4;
                  } else {
                    stackOut_8_0 = (jagdx.IDirect3DDevice) ((Object) stackIn_8_0);
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = stackIn_8_2;
                    stackOut_8_3 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_10_3 = stackOut_8_3;
                    break L4;
                  }
                }
                discarded$9 = ((jagdx.IDirect3DDevice) (Object) stackIn_10_0).SetSamplerState(stackIn_10_1, stackIn_10_2, stackIn_10_3);
                this.field_Rc[this.field_ab] = param1.field_b;
                break L0;
              }
            }
          }
          L5: {
            if (this.field_yc[this.field_ab]) {
              break L5;
            } else {
              this.field_yc[this.field_ab] = true;
              this.l((byte) 125);
              this.o(-92);
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void l(byte param0) {
        int var2 = this.field_yc[this.field_ab] ? nla.a(false, this.field_U[this.field_ab]) : 1;
        if (param0 <= 109) {
            this.n(69);
        }
        int discarded$0 = this.field_Mc.SetTextureStageState(this.field_ab, 4, var2);
    }

    static {
        field_Bc = new float[16];
        field_Pc = new int[]{77, 80};
        field_Xc = new int[]{22, 23};
    }
}
