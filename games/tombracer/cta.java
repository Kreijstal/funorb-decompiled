/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jagdx.IDirect3DDevice;

public final class cta extends eo {
    private int field_Xc;
    private gua field_kd;
    jagdx.PixelBuffer field_Nc;
    private boolean[] field_Yc;
    jagdx.IDirect3DDevice field_jd;
    private jagdx.D3DLIGHT field_Zc;
    private static float[] field_hd;
    private jagdx.D3DLIGHT field_cd;
    boolean field_nd;
    private int field_ed;
    private int field_id;
    private static int[] field_md;
    private boolean field_Pc;
    boolean field_Tc;
    private boolean[] field_Qc;
    jaclib.peer.sha field_Mc;
    private hs[] field_Rc;
    private boolean[] field_Uc;
    private int[] field_gd;
    boolean field_Sc;
    private jagdx.IDirect3D field_dd;
    private jagdx.D3DPRESENT_PARAMETERS field_ad;
    private jagdx.IDirect3DVertexShader field_Vc;
    private static int[] field_fd;
    jagdx.D3DCAPS field_ld;
    private boolean[] field_bd;
    jagdx.GeometryBuffer field_Oc;
    private jagdx.D3DLIGHT field_Wc;

    final mw b(int param0, int param1) {
        return null;
    }

    final void a(dn param0, byte param1) {
        int var3 = 0;
        L0: {
          var3 = 0;
          if (gd.field_H == param0) {
            var3 = 65536;
            break L0;
          } else {
            if (lsa.field_c == param0) {
              var3 = 131072;
              break L0;
            } else {
              if (gq.field_u != param0) {
                break L0;
              } else {
                var3 = 196608;
                break L0;
              }
            }
          }
        }
        L1: {
          int discarded$1 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, 11, var3 | ((cta) this).field_Cc);
          if (param1 == 0) {
            break L1;
          } else {
            ((cta) this).field_gd = null;
            break L1;
          }
        }
    }

    final void r(int param0) {
        ((cta) this).field_Zc.SetAmbient(((cta) this).field_sc * ((cta) this).field_fc, ((cta) this).field_fc * ((cta) this).field_yb, ((cta) this).field_Kb * ((cta) this).field_fc, (float)param0);
        ((cta) this).field_Pc = false;
    }

    private final static int a(int param0, iw param1) {
        L0: {
          if (param0 >= 105) {
            break L0;
          } else {
            field_fd = null;
            break L0;
          }
        }
        if (io.field_c != param1) {
          if (param1 != di.field_d) {
            if (param1 != nj.field_r) {
              if (param1 != fma.field_f) {
                if (vs.field_T == param1) {
                  return 6;
                } else {
                  if (nb.field_b != param1) {
                    throw new IllegalArgumentException("");
                  } else {
                    return 5;
                  }
                }
              } else {
                return 4;
              }
            } else {
              return 1;
            }
          } else {
            return 3;
          }
        } else {
          return 2;
        }
    }

    private cta(int param0, int param1, java.awt.Canvas param2, jaclib.peer.sha param3, jagdx.IDirect3D param4, jagdx.IDirect3DDevice param5, gua param6, jagdx.D3DPRESENT_PARAMETERS param7, jagdx.D3DCAPS param8, d param9, cn param10, int param11) {
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
        ((cta) this).field_Pc = false;
        ((cta) this).field_ed = 0;
        try {
          L0: {
            L1: {
              ((cta) this).field_Xc = param0;
              ((cta) this).field_Mc = param3;
              ((cta) this).field_ad = param7;
              ((cta) this).field_id = param1;
              ((cta) this).field_jd = param5;
              ((cta) this).field_dd = param4;
              ((cta) this).field_ld = param8;
              ((cta) this).field_kd = param6;
              ((cta) this).field_Zc = new jagdx.D3DLIGHT(((cta) this).field_Mc);
              ((cta) this).field_cd = new jagdx.D3DLIGHT(((cta) this).field_Mc);
              ((cta) this).field_Wc = new jagdx.D3DLIGHT(((cta) this).field_Mc);
              ((cta) this).field_Nc = new jagdx.PixelBuffer(((cta) this).field_Mc);
              ((cta) this).field_Oc = new jagdx.GeometryBuffer(((cta) this).field_Mc);
              jagdx.GeometryBuffer discarded$3 = new jagdx.GeometryBuffer(((cta) this).field_Mc);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 == (65536 & ((cta) this).field_ld.TextureCaps)) {
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
              ((cta) this).field_nd = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if ((((cta) this).field_ld.TextureCaps & 2048) == -1) {
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
              ((cta) this).field_Ob = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (-1 != (2 & ((cta) this).field_ld.TextureCaps)) {
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
              ((cta) this).field_Tc = stackIn_10_1 != 0;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (((cta) this).field_ld.MaxActiveLights > 0) {
                stackOut_12_0 = this;
                stackOut_12_1 = ((cta) this).field_ld.MaxActiveLights;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 8;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((cta) this).field_e = stackIn_13_1;
              ((cta) this).field_Vb = ((cta) this).field_ld.MaxSimultaneousTextures;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if ((16384 & ((cta) this).field_ld.TextureCaps) == 0) {
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
              ((cta) this).field_Sc = stackIn_16_1 != 0;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if ((8192 & ((cta) this).field_ld.TextureCaps) == 0) {
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
              ((cta) this).field_x = stackIn_19_1 != 0;
              if (0 < ((cta) this).field_Gc) {
                break L7;
              } else {
                int discarded$4 = ((cta) this).field_dd.CheckDeviceMultiSampleType(((cta) this).field_Xc, ((cta) this).field_id, ((cta) this).field_ad.BackBufferFormat, true, 2);
                break L7;
              }
            }
            ((cta) this).field_Rc = new hs[((cta) this).field_Vb];
            ((cta) this).field_bd = new boolean[((cta) this).field_Vb];
            ((cta) this).field_Yc = new boolean[((cta) this).field_Vb];
            ((cta) this).field_gd = new int[((cta) this).field_Vb];
            ((cta) this).field_Uc = new boolean[((cta) this).field_Vb];
            ((cta) this).field_Qc = new boolean[((cta) this).field_Vb];
            int discarded$5 = ((cta) this).field_jd.BeginScene();
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          var13.printStackTrace();
          ((cta) this).a(true);
          throw new RuntimeException("");
        }
    }

    final static int a(ft param0, int param1, una param2) {
        L0: {
          if (param1 < -127) {
            break L0;
          } else {
            field_md = null;
            break L0;
          }
        }
        L1: {
          if (param2 == una.field_g) {
            if (it.field_b == param0) {
              return 22;
            } else {
              if (param0 == gpa.field_a) {
                return 21;
              } else {
                if (param0 != rp.field_g) {
                  if (param0 != qr.field_w) {
                    if (param0 != wo.field_i) {
                      if (js.field_g != param0) {
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
                } else {
                  return 28;
                }
              }
            }
          } else {
            break L1;
          }
        }
        throw new IllegalArgumentException("");
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final boolean a(boolean param0, una param1, ft param2) {
        jagdx.D3DDISPLAYMODE var4 = null;
        Object var5 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = ((cta) this).a(true, (una) null, (ft) null);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = new jagdx.D3DDISPLAYMODE();
            if (!jagdx.ah.a(((cta) this).field_dd.a(((cta) this).field_Xc, var4), (byte) -82)) {
              break L2;
            } else {
              if (!jagdx.ah.a(((cta) this).field_dd.CheckDeviceFormat(((cta) this).field_Xc, ((cta) this).field_id, var4.Format, 0, 3, cta.a(param2, -128, param1)), (byte) -103)) {
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

    private final static boolean a(int param0, jagdx.IDirect3D param1, int param2, int param3, jagdx.D3DPRESENT_PARAMETERS param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Throwable var9 = null;
        int var9_int = 0;
        jagdx.D3DDISPLAYMODE var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        try {
          L0: {
            var9_int = 108 / ((param0 - 28) / 50);
            var10 = new jagdx.D3DDISPLAYMODE();
            if (jagdx.ah.a(param1.a(param5, var10), 10643)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: while (true) {
                L2: {
                  if (param2 < 0) {
                    break L2;
                  } else {
                    L3: {
                      if (param2 != 1) {
                        var8 = 0 - -param2;
                        var11 = 0;
                        L4: while (true) {
                          if (field_md.length <= var11) {
                            break L3;
                          } else {
                            L5: {
                              if (0 != param1.CheckDeviceType(param5, param3, var10.Format, field_md[var11], true)) {
                                break L5;
                              } else {
                                if (param1.CheckDeviceFormat(param5, param3, var10.Format, 1, 1, field_md[var11]) != 0) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (param2 == 0) {
                                      break L6;
                                    } else {
                                      if (param1.CheckDeviceMultiSampleType(param5, param3, field_md[var11], true, var8) != 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var12 = 0;
                                  L7: while (true) {
                                    if (~var12 <= ~field_fd.length) {
                                      break L5;
                                    } else {
                                      L8: {
                                        if (0 != param1.CheckDeviceFormat(param5, param3, var10.Format, 2, 1, field_fd[var12])) {
                                          break L8;
                                        } else {
                                          if (0 != param1.CheckDepthStencilMatch(param5, param3, var10.Format, field_md[var11], field_fd[var12])) {
                                            break L8;
                                          } else {
                                            L9: {
                                              if (param2 == 0) {
                                                break L9;
                                              } else {
                                                if (param1.CheckDeviceMultiSampleType(param5, param3, field_fd[var11], true, var8) == 0) {
                                                  break L9;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            var7 = field_md[var11];
                                            var6 = field_fd[var12];
                                            break L2;
                                          }
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
                      } else {
                        break L3;
                      }
                    }
                    param2--;
                    continue L1;
                  }
                }
                L10: {
                  if (param2 < 0) {
                    break L10;
                  } else {
                    if (0 == var7) {
                      break L10;
                    } else {
                      if (var6 == 0) {
                        break L10;
                      } else {
                        param4.AutoDepthStencilFormat = var6;
                        param4.MultiSampleQuality = 0;
                        param4.MultiSampleType = var8;
                        param4.BackBufferFormat = var7;
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
          var9 = decompiledCaughtException;
          return false;
        }
        return stackIn_33_0 != 0;
    }

    private final static int a(ica param0, int param1) {
        if (ln.field_F == param0) {
          return 2;
        } else {
          if (iw.field_c == param0) {
            return 4;
          } else {
            if (r.field_m == param0) {
              return 26;
            } else {
              if (param0 != jv.field_m) {
                if (gq.field_w == param0) {
                  return 10;
                } else {
                  L0: {
                    if (param1 == 0) {
                      break L0;
                    } else {
                      field_md = null;
                      break L0;
                    }
                  }
                  throw new IllegalArgumentException();
                }
              } else {
                return 7;
              }
            }
          }
        }
    }

    final void c() {
    }

    final void a(mna param0, int param1) {
        if (param1 != -32) {
            ((cta) this).field_Wc = null;
        }
        dxVertexLayout var3 = (dxVertexLayout) (Object) param0;
        int discarded$0 = ((cta) this).field_jd.SetVertexDeclaration(var3.field_e);
    }

    final void B(byte param0) {
        int discarded$15 = ((cta) this).field_jd.SetViewport(((cta) this).field_i, ((cta) this).field_Kc, ((cta) this).field_Hb, ((cta) this).field_jc, 0.0f, 1.0f);
        if (param0 != -116) {
            ((cta) this).field_ed = -47;
        }
    }

    final void h(boolean param0) {
        if (param0) {
            return;
        }
        if (((cta) this).field_r.a(-122)) {
            float[] discarded$1 = ((cta) this).field_Qb.a(field_hd, (byte) -37);
        } else {
            field_hd[13] = 0.0f;
            field_hd[11] = 0.0f;
            field_hd[1] = 0.0f;
            field_hd[14] = 0.0f;
            field_hd[8] = 0.0f;
            field_hd[6] = 0.0f;
            field_hd[7] = 0.0f;
            field_hd[2] = 0.0f;
            field_hd[10] = 1.0f;
            field_hd[5] = 1.0f;
            field_hd[0] = 1.0f;
            field_hd[4] = 0.0f;
            field_hd[12] = 0.0f;
            field_hd[15] = 1.0f;
            field_hd[9] = 0.0f;
            field_hd[3] = 0.0f;
        }
        int discarded$2 = ((cta) this).field_jd.SetTransform(2, field_hd);
    }

    final void a(eja param0, int param1, int param2, int param3, iw param4, int param5, int param6) {
        int discarded$16 = ((cta) this).field_jd.SetIndices(((dm) (Object) param0).field_d);
        int discarded$30 = ((cta) this).field_jd.DrawIndexedPrimitive(cta.a(109, param4), 0, param2, param5, param3, param6);
        if (param1 != -19394) {
            ((cta) this).field_jd = null;
        }
    }

    final void a(jca param0) {
    }

    final void a(nh param0, boolean param1) {
    }

    final void N(int param0) {
        if (param0 >= -10) {
            ((cta) this).b(-92, false);
        }
        int discarded$0 = ((cta) this).field_jd.SetRenderState(60, ((cta) this).field_bc);
    }

    final void e(byte param0) {
        int discarded$7 = ((cta) this).field_jd.SetTransform(3, ((cta) this).field_T);
        if (param0 <= 26) {
            Object var3 = null;
            ((cta) this).a((dn) null, (byte) -5);
        }
    }

    final boolean a(una param0, int param1, ft param2) {
        jagdx.D3DDISPLAYMODE var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == -1) {
          L0: {
            L1: {
              var4 = new jagdx.D3DDISPLAYMODE();
              if (!jagdx.ah.a(((cta) this).field_dd.a(((cta) this).field_Xc, var4), (byte) -125)) {
                break L1;
              } else {
                if (!jagdx.ah.a(((cta) this).field_dd.CheckDeviceFormat(((cta) this).field_Xc, ((cta) this).field_id, var4.Format, 0, 4, cta.a(param2, param1 + -127, param0)), (byte) -92)) {
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

    final void a(byte param0, ek param1) {
        ((cta) this).a((byte) -126, (nqa) (Object) param1);
        if (!((cta) this).field_bd[((cta) this).field_Cc]) {
            int discarded$0 = ((cta) this).field_jd.SetSamplerState(((cta) this).field_Cc, 1, 1);
            ((cta) this).field_bd[((cta) this).field_Cc] = true;
        }
        if (!(((cta) this).field_Uc[((cta) this).field_Cc])) {
            int discarded$1 = ((cta) this).field_jd.SetSamplerState(((cta) this).field_Cc, 2, 1);
            ((cta) this).field_Uc[((cta) this).field_Cc] = true;
        }
        if (param0 >= -123) {
            ((cta) this).field_Xc = 60;
        }
    }

    final void b(boolean param0) {
        L0: {
          if (dfa.field_b == ((cta) this).field_lb) {
            int discarded$100 = ((cta) this).field_jd.SetRenderState(19, 5);
            int discarded$101 = ((cta) this).field_jd.SetRenderState(20, 6);
            break L0;
          } else {
            if (mp.field_a != ((cta) this).field_lb) {
              if (bma.field_w != ((cta) this).field_lb) {
                break L0;
              } else {
                int discarded$102 = ((cta) this).field_jd.SetRenderState(19, 9);
                int discarded$103 = ((cta) this).field_jd.SetRenderState(20, 2);
                break L0;
              }
            } else {
              int discarded$104 = ((cta) this).field_jd.SetRenderState(19, 2);
              int discarded$105 = ((cta) this).field_jd.SetRenderState(20, 2);
              break L0;
            }
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            ((cta) this).field_Sc = true;
            break L1;
          }
        }
    }

    final void ya() {
        ((cta) this).b(true, (byte) 81);
        int discarded$0 = ((cta) this).field_jd.Clear(2, 0, 1.0f, 0);
    }

    final void a() {
    }

    final void b(int param0, boolean param1) {
        int discarded$7 = ((cta) this).field_jd.a(161, param1);
        if (param0 != 1) {
            ((cta) this).field_Oc = null;
        }
    }

    final void a(int param0, jagdx.IDirect3DPixelShader param1) {
        int var3 = 67 % ((1 - param0) / 55);
        int discarded$0 = ((cta) this).field_jd.SetPixelShader(param1);
    }

    final boolean h() {
        return false;
    }

    final gf a(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7) {
        if (param2 == 0) {
            return null;
        }
        ((cta) this).field_Pc = false;
        return null;
    }

    final void M(int param0) {
        if (param0 != -27581) {
            ((cta) this).v(73);
        }
        int discarded$0 = ((cta) this).field_jd.a(27, ((cta) this).field_Yb);
    }

    final void w(byte param0) {
        ((cta) this).v(53);
        if (param0 != -21) {
            ((cta) this).field_Sc = false;
        }
        ((cta) this).q((byte) -78);
    }

    final gf a(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, ft param6, int param7) {
        if (param4 != 1) {
            return null;
        }
        return (gf) (Object) new pia((cta) this, param6, param7, param3, param0, param1, param2, param5);
    }

    final boolean f() {
        return false;
    }

    final void g(byte param0) {
        int var2 = 0;
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        for (var2 = 0; var2 < ((cta) this).field_Bc; var2++) {
            var3 = ((cta) this).field_ib[var2];
            var4 = var2 + 2;
            var5 = var3.c(-120);
            var6 = var3.b(0) / 255.0f;
            ((cta) this).field_Wc.SetPosition((float)var3.d(13437), (float)var3.a(19848), (float)var3.b((byte) 11));
            ((cta) this).field_Wc.SetDiffuse(var6 * (float)(255 & var5 >> 16), (float)(var5 >> 8 & 255) * var6, var6 * (float)(255 & var5), 0.0f);
            ((cta) this).field_Wc.SetAttenuation(0.0f, 0.0f, 1.0f / (float)(var3.a((byte) 109) * var3.a((byte) 102)));
            ((cta) this).field_Wc.SetRange((float)var3.a((byte) -113));
            int discarded$0 = ((cta) this).field_jd.SetLight(var4, ((cta) this).field_Wc);
            boolean discarded$1 = ((cta) this).field_jd.LightEnable(var4, true);
        }
        while (var2 < ((cta) this).field_S) {
            boolean discarded$2 = ((cta) this).field_jd.LightEnable(2 + var2, false);
            var2++;
        }
        super.g(param0);
    }

    final void d() {
    }

    final void d(byte param0) {
        int var2 = -34 % ((69 - param0) / 50);
        int discarded$0 = ((cta) this).field_jd.a(174, ((cta) this).field_Wb);
    }

    final void h(int param0) {
        int var2 = 0;
        boolean[] var3 = null;
        int var4 = 0;
        var2 = 0;
        L0: while (true) {
          if (((cta) this).field_Vb <= var2) {
            int discarded$15 = ((cta) this).field_jd.SetTextureStageState(0, 6, 1);
            int discarded$16 = ((cta) this).field_jd.SetRenderState(9, 2);
            int discarded$17 = ((cta) this).field_jd.SetRenderState(23, 4);
            int discarded$18 = ((cta) this).field_jd.SetRenderState(25, 5);
            int discarded$19 = ((cta) this).field_jd.SetRenderState(24, 0);
            if (param0 == -29040) {
              int discarded$20 = ((cta) this).field_jd.SetRenderState(22, 2);
              int discarded$21 = ((cta) this).field_jd.SetRenderState(147, 1);
              int discarded$22 = ((cta) this).field_jd.SetRenderState(145, 1);
              int discarded$23 = ((cta) this).field_jd.a(38, 0.949999988079071f);
              int discarded$24 = ((cta) this).field_jd.SetRenderState(140, 3);
              ((cta) this).field_Zc.SetType(3);
              ((cta) this).field_cd.SetType(3);
              ((cta) this).field_Wc.SetType(1);
              ((cta) this).field_Pc = false;
              super.h(param0);
              return;
            } else {
              return;
            }
          } else {
            int discarded$25 = ((cta) this).field_jd.SetSamplerState(var2, 7, 0);
            int discarded$26 = ((cta) this).field_jd.SetSamplerState(var2, 6, 2);
            int discarded$27 = ((cta) this).field_jd.SetSamplerState(var2, 5, 2);
            int discarded$28 = ((cta) this).field_jd.SetSamplerState(var2, 1, 1);
            int discarded$29 = ((cta) this).field_jd.SetSamplerState(var2, 2, 1);
            ((cta) this).field_Rc[var2] = aw.field_G;
            var3 = ((cta) this).field_bd;
            var4 = var2;
            ((cta) this).field_Uc[var2] = true;
            var3[var4] = true;
            ((cta) this).field_Yc[var2] = false;
            ((cta) this).field_gd[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final gf a(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8 = -36 / ((param6 - 13) / 46);
        return (gf) (Object) new pia((cta) this, param3, param5, param2, param0, param1, param4);
    }

    final vw e(int param0, int param1) {
        int var3 = 0;
        if (param1 > 37) {
          var3 = param0;
          if (var3 == 3) {
            return (vw) (Object) new cqa((cta) this, ((cta) this).field_I);
          } else {
            if (4 == var3) {
              return (vw) (Object) new usa((cta) this, ((cta) this).field_I, ((cta) this).field_Mb);
            } else {
              if (var3 == 8) {
                return (vw) (Object) new oja((cta) this, ((cta) this).field_I, ((cta) this).field_Mb);
              } else {
                return super.e(param0, 106);
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(fp param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (param1 == 15802) {
            break L0;
          } else {
            ((cta) this).field_Pc = false;
            break L0;
          }
        }
        L1: {
          var7 = param3;
          if (var7 != 1) {
            if (var7 == 2) {
              var5 = 27;
              break L1;
            } else {
              var5 = 5;
              break L1;
            }
          } else {
            var5 = 6;
            break L1;
          }
        }
        L2: {
          var6 = 0;
          if (param2) {
            var6 = var6 | 16;
            break L2;
          } else {
            break L2;
          }
        }
        int discarded$1 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, var5, cta.a(param0, 117) | var6);
    }

    final eja a(int param0, boolean param1) {
        if (param0 != 26) {
            ((cta) this).field_kd = null;
        }
        return (eja) (Object) new dm((cta) this, una.field_f, param1);
    }

    final void a(fp param0, int param1, int param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = param1;
          if (var8 == 1) {
            var6 = 3;
            break L0;
          } else {
            if (var8 != 2) {
              var6 = 2;
              break L0;
            } else {
              var6 = 26;
              break L0;
            }
          }
        }
        L1: {
          if (param2 == -6219) {
            break L1;
          } else {
            ((cta) this).field_Xc = -67;
            break L1;
          }
        }
        L2: {
          var7 = 0;
          if (!param3) {
            break L2;
          } else {
            var7 = var7 | 32;
            break L2;
          }
        }
        L3: {
          if (param4) {
            var7 = var7 | 16;
            break L3;
          } else {
            break L3;
          }
        }
        int discarded$1 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, var6, var7 | cta.a(param0, 121));
    }

    final void i(int param0) {
        ((cta) this).field_Zc.SetDirection(-((cta) this).field_Gb[0], -((cta) this).field_Gb[1], -((cta) this).field_Gb[2]);
        int var2 = 35 / ((param0 - -11) / 56);
        ((cta) this).field_cd.SetDirection(-((cta) this).field_M[0], -((cta) this).field_M[1], -((cta) this).field_M[2]);
        ((cta) this).field_Pc = false;
    }

    private final static int a(boolean param0, hs param1) {
        if (param1 == aw.field_G) {
            return 2;
        }
        if (param1 == ue.field_v) {
            return 1;
        }
        if (!param0) {
            Object var3 = null;
            boolean discarded$0 = cta.a(-16, (jagdx.IDirect3D) null, -7, 73, (jagdx.D3DPRESENT_PARAMETERS) null, -9);
        }
        throw new IllegalArgumentException();
    }

    final static ha createToolkit(java.awt.Canvas param0, d param1, cn param2, Integer param3) {
        Object var12_ref = null;
        Object var4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        jaclib.peer.sha var7 = null;
        Object var8 = null;
        jagdx.IDirect3D var8_ref = null;
        jagdx.D3DCAPS var9 = null;
        Object var10 = null;
        jagdx.D3DPRESENT_PARAMETERS var10_ref = null;
        int var11 = 0;
        jagdx.IDirect3DDevice var12 = null;
        gua var13 = null;
        jagdx.eva var14 = null;
        cta var15 = null;
        cta stackIn_37_0 = null;
        Throwable decompiledCaughtException = null;
        cta stackOut_36_0 = null;
        var12_ref = null;
        var4 = null;
        try {
          L0: {
            var5_int = 0;
            var6 = 1;
            var7 = new jaclib.peer.sha();
            var8_ref = jagdx.IDirect3D.a(-2147483616, var7);
            var9 = var8_ref.a(var5_int, var6);
            if ((16777216 & var9.RasterCaps) != -1) {
              if (-3 <= var9.MaxSimultaneousTextures) {
                if (-1 != (var9.TextureOpCaps & 2)) {
                  if (-1 != (8 & var9.TextureOpCaps)) {
                    if (0 != (64 & var9.TextureOpCaps)) {
                      if ((512 & var9.TextureOpCaps) == -1) {
                        throw new RuntimeException("");
                      } else {
                        if (-1 != (var9.TextureOpCaps & 33554432)) {
                          if ((16 & (var9.DestBlendCaps & var9.SrcBlendCaps)) == 0) {
                            throw new RuntimeException("");
                          } else {
                            if (0 != (var9.DestBlendCaps & var9.SrcBlendCaps & 32)) {
                              if ((2 & (var9.SrcBlendCaps & var9.DestBlendCaps)) != 0) {
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
                                  if (cta.a(-30, var8_ref, param3.intValue(), var6, var10_ref, var5_int)) {
                                    L2: {
                                      var10_ref.PresentationInterval = -2147483648;
                                      var10_ref.Windowed = true;
                                      var10_ref.EnableAutoDepthStencil = true;
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
                                        var14 = (jagdx.eva) (Object) decompiledCaughtException;
                                        var12 = var8_ref.a(var5_int, var6, param0, 32 | var11, var10_ref);
                                        break L4;
                                      }
                                    }
                                    var13 = new gua(var12.b(0), var12.b());
                                    var15 = new cta(var5_int, var6, param0, var7, var8_ref, var12, var13, var10_ref, var9, param1, param2, param3.intValue());
                                    var4 = (Object) (Object) var15;
                                    var15.K(-107);
                                    stackOut_36_0 = (cta) var15;
                                    stackIn_37_0 = stackOut_36_0;
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
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            if (var4 == null) {
              break L5;
            } else {
              ((cta) var4).k();
              break L5;
            }
          }
          throw var5;
        }
        return (ha) (Object) stackIn_37_0;
    }

    private final boolean T(int param0) {
        int var4 = 0;
        int var2 = ((cta) this).field_jd.TestCooperativeLevel();
        if (var2 != 0) {
            if (-2005530519 != var2) {
                return false;
            }
        }
        gua var3 = (gua) ((cta) this).field_Ub;
        ((cta) this).m(6);
        var3.a(true);
        ((cta) this).field_ad.BackBufferWidth = 0;
        ((cta) this).field_ad.BackBufferHeight = 0;
        if (cta.a(88, ((cta) this).field_dd, ((cta) this).field_Gc, ((cta) this).field_id, ((cta) this).field_ad, ((cta) this).field_Xc)) {
            var4 = ((cta) this).field_jd.Reset(((cta) this).field_ad);
            if (!(!jagdx.ah.a(var4, (byte) 123))) {
                var3.a((byte) -17, ((cta) this).field_jd.b(0), ((cta) this).field_jd.b());
                ((cta) this).s((byte) 6);
                ((cta) this).h(-29040);
                return true;
            }
        }
        return false;
    }

    final void a(int param0, int param1) throws qva {
        L0: {
          int discarded$23 = ((cta) this).field_jd.EndScene();
          if (!((cta) this).field_kd.a((byte) 75)) {
            int fieldTemp$24 = ((cta) this).field_ed + 1;
            ((cta) this).field_ed = ((cta) this).field_ed + 1;
            if (fieldTemp$24 <= 50) {
              boolean discarded$25 = this.T(-2005530519);
              break L0;
            } else {
              throw new qva();
            }
          } else {
            ((cta) this).field_ed = 0;
            if (jagdx.ah.a(((cta) this).field_kd.a(0, 0), 10643)) {
              boolean discarded$26 = this.T(-2005530519);
              break L0;
            } else {
              break L0;
            }
          }
        }
        int discarded$27 = ((cta) this).field_jd.BeginScene();
    }

    final void f(int param0) {
        if (param0 != -3485) {
            ((cta) this).f(-69);
        }
        int var2 = ((cta) this).field_Qc[((cta) this).field_Cc] ? cta.a(((cta) this).field_mc[((cta) this).field_Cc], 0) : 1;
        int discarded$0 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, 1, var2);
    }

    final void I(int param0) {
        ((cta) this).field_Hc = (float)(-((cta) this).field_Ac + ((cta) this).field_k);
        ((cta) this).field_B = (float)(-((cta) this).field_J) + ((cta) this).field_Hc;
        if ((float)((cta) this).field_D > ((cta) this).field_B) {
            ((cta) this).field_B = (float)((cta) this).field_D;
        }
        int discarded$16 = ((cta) this).field_jd.a(36, ((cta) this).field_B);
        int discarded$25 = ((cta) this).field_jd.a(37, ((cta) this).field_Hc);
        if (param0 != 1) {
            ((cta) this).field_Yc = null;
        }
        int discarded$26 = ((cta) this).field_jd.SetRenderState(34, ((cta) this).field_g);
    }

    final qm c(int param0, boolean param1) {
        if (param0 != 6) {
            field_hd = null;
        }
        return (qm) (Object) new lia((cta) this, param1);
    }

    final void a(float param0, float param1, float param2) {
    }

    private final static int a(int param0, ura param1) {
        Object var3 = null;
        if (param1 == jja.field_d) {
          return 1;
        } else {
          if (pfa.field_i == param1) {
            return 2;
          } else {
            if (param1 != cva.field_b) {
              if (param1 != hqa.field_j) {
                if (ada.field_z != param1) {
                  if (param0 <= -46) {
                    return 0;
                  } else {
                    var3 = null;
                    int discarded$2 = cta.a(22, (ura) null);
                    return 0;
                  }
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

    final void b(byte param0) {
        int var2 = 0;
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
            var2 = -16 / ((param0 - -67) / 53);
            stackOut_0_0 = ((cta) this).field_jd;
            stackOut_0_1 = 14;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!((cta) this).field_Nb) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) (Object) stackIn_1_0;
              stackOut_1_1 = stackIn_1_1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!((cta) this).field_qc) {
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
        int discarded$2 = ((jagdx.IDirect3DDevice) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0);
    }

    final void a(Object param0, boolean param1, java.awt.Canvas param2) {
        if (param1) {
            ((cta) this).u((byte) 126);
        }
    }

    final void S(int param0) {
        int discarded$19 = ((cta) this).field_jd.SetScissorRect(((cta) this).field_i + ((cta) this).field_A, ((cta) this).field_K + ((cta) this).field_Kc, ((cta) this).field_C, ((cta) this).field_jb);
        if (param0 != -3335) {
            ((cta) this).field_Qc = null;
        }
    }

    final void GA(int param0) {
        int discarded$0 = ((cta) this).field_jd.Clear(1, param0, 0.0f, 0);
    }

    final void a(int param0, byte param1) {
        int discarded$8 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, 11, param0);
        if (param1 <= 27) {
            ((cta) this).field_jd = null;
        }
    }

    final void a(pia param0, boolean param1) {
        ((cta) this).a((byte) -127, (nqa) (Object) param0);
        if (!(param0.field_g == ((cta) this).field_bd[((cta) this).field_Cc])) {
            int discarded$0 = ((cta) this).field_jd.SetSamplerState(((cta) this).field_Cc, 1, !param0.field_g ? 3 : 1);
            ((cta) this).field_bd[((cta) this).field_Cc] = param0.field_g;
        }
        if ((!param0.field_j ? 1 : 0) != (!((cta) this).field_Uc[((cta) this).field_Cc] ? 1 : 0)) {
            int discarded$1 = ((cta) this).field_jd.SetSamplerState(((cta) this).field_Cc, 2, !param0.field_j ? 3 : 1);
            ((cta) this).field_Uc[((cta) this).field_Cc] = param0.field_j;
        }
        if (!param1) {
            ((cta) this).field_Rc = null;
        }
    }

    final void q(byte param0) {
        if (param0 != -78) {
            ((cta) this).field_cd = null;
        }
        if (!(((cta) this).field_Pc)) {
            boolean discarded$0 = ((cta) this).field_jd.LightEnable(0, false);
            boolean discarded$1 = ((cta) this).field_jd.LightEnable(1, false);
            int discarded$2 = ((cta) this).field_jd.SetLight(0, ((cta) this).field_Zc);
            int discarded$3 = ((cta) this).field_jd.SetLight(1, ((cta) this).field_cd);
            boolean discarded$4 = ((cta) this).field_jd.LightEnable(0, true);
            boolean discarded$5 = ((cta) this).field_jd.LightEnable(1, true);
            ((cta) this).field_Pc = true;
        }
    }

    final void e(boolean param0) {
        if (param0) {
            mw discarded$0 = ((cta) this).b(-126, 70);
        }
    }

    final void D(int param0) {
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
            stackOut_0_0 = ((cta) this).field_jd;
            stackOut_0_1 = 28;
            stackIn_4_0 = stackOut_0_0;
            stackIn_4_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!((cta) this).field_U) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) (Object) stackIn_1_0;
              stackOut_1_1 = stackIn_1_1;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!((cta) this).field_Bb) {
                break L1;
              } else {
                stackOut_2_0 = (jagdx.IDirect3DDevice) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (((cta) this).field_J < 0) {
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
          if (param0 == 2) {
            break L2;
          } else {
            ((cta) this).field_Rc = null;
            break L2;
          }
        }
    }

    final float c(byte param0) {
        if (param0 >= -39) {
            Object var3 = null;
            jca discarded$0 = ((cta) this).a((nha) null, (mw) null);
        }
        return -0.5f;
    }

    final void v(int param0) {
        if (param0 <= 19) {
            ((cta) this).field_Yc = null;
        }
        float var2 = ((cta) this).field_Zb ? ((cta) this).field_j : 0.0f;
        float var3 = ((cta) this).field_Zb ? -((cta) this).field_pc : 0.0f;
        ((cta) this).field_Zc.SetDiffuse(var2 * ((cta) this).field_sc, ((cta) this).field_yb * var2, ((cta) this).field_Kb * var2, 0.0f);
        ((cta) this).field_cd.SetDiffuse(((cta) this).field_sc * var3, var3 * ((cta) this).field_yb, var3 * ((cta) this).field_Kb, 0.0f);
        ((cta) this).field_Pc = false;
    }

    final void f(byte param0) {
        if (param0 != -69) {
            ((cta) this).field_ad = null;
        }
        int discarded$0 = ((cta) this).field_jd.a(7, ((cta) this).field_wc);
    }

    final void d(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            ((cta) this).a((nh) null, false);
        }
        if (((cta) this).field_Qc[((cta) this).field_Cc]) {
            ((cta) this).field_Qc[((cta) this).field_Cc] = false;
            int discarded$0 = ((cta) this).field_jd.SetTexture(((cta) this).field_Cc, (jagdx.IDirect3DBaseTexture) null);
            ((cta) this).u((byte) -23);
            ((cta) this).f(param0 ^ -3486);
        }
    }

    final synchronized void c(int param0) {
        ((cta) this).field_Mc.c(-24122);
        super.c(param0);
    }

    final void k() {
        ((cta) this).field_Mc.b(14203);
        super.k();
    }

    final lv a(byte[] param0, ft param1, byte param2, int param3, int param4, int param5) {
        if (param2 >= -1) {
            Object var8 = null;
            ((cta) this).a(-23, (jagdx.IDirect3DPixelShader) null);
        }
        return (lv) (Object) new ek((cta) this, param1, param4, param3, param5, param0);
    }

    final mna a(ne[] param0, int param1) {
        if (param1 != 0) {
            ((cta) this).field_dd = null;
        }
        return (mna) (Object) new dxVertexLayout((cta) this, param0);
    }

    final na a(byte param0, int[][] param1, boolean param2, int param3) {
        if (param0 <= 7) {
            ((cta) this).field_Uc = null;
        }
        return (na) (Object) new ul((cta) this, param3, param2, param1);
    }

    final void a(int param0, iw param1, int param2, int param3) {
        if (param3 != 0) {
            return;
        }
        int discarded$0 = ((cta) this).field_jd.DrawPrimitive(cta.a(113, param1), param2, param0);
    }

    final void a(byte param0, nqa param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        jagdx.IDirect3DDevice stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        jagdx.IDirect3DDevice stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        jagdx.IDirect3DDevice stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        jagdx.IDirect3DDevice stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        jagdx.IDirect3DDevice stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        jagdx.IDirect3DDevice stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        jagdx.IDirect3DDevice stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        jagdx.IDirect3DDevice stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        jagdx.IDirect3DDevice stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        jagdx.IDirect3DDevice stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        jagdx.IDirect3DDevice stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        jagdx.IDirect3DDevice stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        L0: {
          var3 = -26 % ((param0 - -77) / 49);
          int discarded$5 = ((cta) this).field_jd.SetTexture(((cta) this).field_Cc, param1.c(-51));
          if (param1.field_a == ((cta) this).field_Rc[((cta) this).field_Cc]) {
            if (((cta) this).field_Yc[((cta) this).field_Cc] == param1.field_c) {
              break L0;
            } else {
              L1: {
                stackOut_14_0 = ((cta) this).field_jd;
                stackOut_14_1 = ((cta) this).field_Cc;
                stackOut_14_2 = 7;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                if (param1.field_c) {
                  stackOut_16_0 = (jagdx.IDirect3DDevice) (Object) stackIn_16_0;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = cta.a(true, param1.field_a);
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  break L1;
                } else {
                  stackOut_15_0 = (jagdx.IDirect3DDevice) (Object) stackIn_15_0;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_17_3 = stackOut_15_3;
                  break L1;
                }
              }
              int discarded$6 = ((jagdx.IDirect3DDevice) (Object) stackIn_17_0).SetSamplerState(stackIn_17_1, stackIn_17_2, stackIn_17_3);
              ((cta) this).field_Yc[((cta) this).field_Cc] = param1.field_c;
              break L0;
            }
          } else {
            L2: {
              var4 = cta.a(true, param1.field_a);
              int discarded$7 = ((cta) this).field_jd.SetSamplerState(((cta) this).field_Cc, 6, var4);
              int discarded$8 = ((cta) this).field_jd.SetSamplerState(((cta) this).field_Cc, 5, var4);
              ((cta) this).field_Rc[((cta) this).field_Cc] = param1.field_a;
              if (((cta) this).field_Yc[((cta) this).field_Cc]) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L2;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L2;
              }
            }
            L3: {
              stackOut_4_0 = stackIn_4_0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param1.field_c) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            if (stackIn_7_0 != stackIn_7_1) {
              L4: {
                stackOut_9_0 = ((cta) this).field_jd;
                stackOut_9_1 = ((cta) this).field_Cc;
                stackOut_9_2 = 7;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                if (!param1.field_c) {
                  stackOut_11_0 = (jagdx.IDirect3DDevice) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  stackIn_12_3 = stackOut_11_3;
                  break L4;
                } else {
                  stackOut_10_0 = (jagdx.IDirect3DDevice) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = cta.a(true, param1.field_a);
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  break L4;
                }
              }
              int discarded$9 = ((jagdx.IDirect3DDevice) (Object) stackIn_12_0).SetSamplerState(stackIn_12_1, stackIn_12_2, stackIn_12_3);
              ((cta) this).field_Yc[((cta) this).field_Cc] = param1.field_c;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L5: {
          if (!((cta) this).field_Qc[((cta) this).field_Cc]) {
            ((cta) this).field_Qc[((cta) this).field_Cc] = true;
            ((cta) this).u((byte) -23);
            ((cta) this).f(-3485);
            break L5;
          } else {
            break L5;
          }
        }
    }

    final void z(byte param0) {
        if (param0 != -73) {
            field_hd = null;
        }
        if (((cta) this).field_gb) {
            field_hd[15] = 1.0f;
            field_hd[8] = 0.0f;
            field_hd[4] = 0.0f;
            field_hd[10] = 1.0f;
            field_hd[3] = 0.0f;
            field_hd[6] = 0.0f;
            field_hd[1] = 0.0f;
            field_hd[7] = 0.0f;
            field_hd[0] = 1.0f;
            field_hd[9] = 0.0f;
            field_hd[2] = 0.0f;
            field_hd[12] = 0.0f;
            field_hd[11] = 0.0f;
            field_hd[13] = 0.0f;
            field_hd[14] = 0.0f;
            field_hd[5] = 1.0f;
        } else {
            float[] discarded$0 = ((cta) this).field_q.a(field_hd, (byte) -37);
        }
        int discarded$1 = ((cta) this).field_jd.SetTransform(256, field_hd);
    }

    final jca a(nha param0, mw param1) {
        return null;
    }

    final void z(int param0) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          L1: {
            if (null != ((cta) this).field_Vc) {
              break L1;
            } else {
              if (od.field_h != ((cta) this).field_v[((cta) this).field_Cc]) {
                L2: {
                  if (pfa.field_i == ((cta) this).field_v[((cta) this).field_Cc]) {
                    int discarded$6 = ((cta) this).field_jd.SetTransform(16 + ((cta) this).field_Cc, ((cta) this).field_hc[((cta) this).field_Cc].a((byte) -114, field_hd));
                    break L2;
                  } else {
                    int discarded$7 = ((cta) this).field_jd.SetTransform(16 + ((cta) this).field_Cc, ((cta) this).field_hc[((cta) this).field_Cc].a(field_hd, (byte) -37));
                    break L2;
                  }
                }
                var2 = cta.a(-51, ((cta) this).field_v[((cta) this).field_Cc]);
                if (((cta) this).field_gd[((cta) this).field_Cc] != var2) {
                  int discarded$8 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, 24, var2);
                  ((cta) this).field_gd[((cta) this).field_Cc] = var2;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          int discarded$9 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, 24, 0);
          ((cta) this).field_gd[((cta) this).field_Cc] = 0;
          break L0;
        }
        L3: {
          if (param0 == 0) {
            break L3;
          } else {
            var3 = null;
            int discarded$10 = cta.a((ica) null, -59);
            break L3;
          }
        }
    }

    final gf a(int param0, int param1, ft param2, byte param3, una param4) {
        if (param3 != -63) {
            Object var7 = null;
            ((cta) this).a((jagdx.IDirect3DVertexShader) null, 105);
        }
        return (gf) (Object) new pia((cta) this, param2, param4, param0, param1);
    }

    final void a(jagdx.IDirect3DVertexShader param0, int param1) {
        ((cta) this).field_Vc = param0;
        int discarded$6 = ((cta) this).field_jd.SetVertexShader(param0);
        if (param1 != -1) {
            ((cta) this).field_nd = true;
        }
        ((cta) this).z(param1 + 1);
    }

    final void u(byte param0) {
        int var2 = ((cta) this).field_Qc[((cta) this).field_Cc] ? cta.a(((cta) this).field_db[((cta) this).field_Cc], param0 ^ -23) : 1;
        if (param0 != -23) {
            return;
        }
        int discarded$0 = ((cta) this).field_jd.SetTextureStageState(((cta) this).field_Cc, 4, var2);
    }

    final void h(byte param0) {
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
            stackOut_0_0 = ((cta) this).field_jd;
            stackOut_0_1 = 137;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            if (!((cta) this).field_l) {
              break L1;
            } else {
              stackOut_1_0 = (jagdx.IDirect3DDevice) (Object) stackIn_1_0;
              stackOut_1_1 = stackIn_1_1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (((cta) this).field_yc) {
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
          if (param0 == -102) {
            break L2;
          } else {
            field_hd = null;
            break L2;
          }
        }
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        jagdx.IDirect3DSurface var9 = null;
        int var10 = 0;
        int var11 = 0;
        jagdx.IDirect3DSurface var12 = null;
        L0: {
          var12 = ((cta) this).field_jd.a(0);
          var9 = ((cta) this).field_jd.a(param2, param3, 21, 0, 0, true);
          if (jagdx.ah.a(var9.LockRect(0, 0, param2, param3, 0, ((cta) this).field_Nc), (byte) -114)) {
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
                var10 = ((cta) this).field_Nc.getRowPitch();
                if (param6 != param2) {
                  break L3;
                } else {
                  if (var10 == 4 * param2) {
                    ((cta) this).field_Nc.a(param4, param5, 0, param2 * param3);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var11 = 0;
              L4: while (true) {
                if (param3 <= var11) {
                  break L2;
                } else {
                  ((cta) this).field_Nc.a(param4, var11 * param6 + param5, var11 * var10, param2);
                  var11++;
                  continue L4;
                }
              }
            }
            boolean discarded$2 = var9.UnlockRect();
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$3 = ((cta) this).field_jd.StretchRect(var9, 0, 0, param2, param3, var12, param0, param1, param2, param3, 0);
    }

    final Object a(boolean param0, java.awt.Canvas param1) {
        if (!param0) {
            return null;
        }
        return null;
    }

    private final static int a(fp param0, int param1) {
        if (param1 >= 112) {
          if (ej.field_c == param0) {
            return 2;
          } else {
            if (tla.field_c == param0) {
              return 0;
            } else {
              if (param0 == lja.field_j) {
                return 1;
              } else {
                if (pea.field_c != param0) {
                  throw new IllegalArgumentException();
                } else {
                  return 3;
                }
              }
            }
          }
        } else {
          return 109;
        }
    }

    final void w(int param0) {
        int discarded$7 = ((cta) this).field_jd.a(15, ((cta) this).field_m);
        if (param0 > -30) {
            Object var3 = null;
            gf discarded$8 = ((cta) this).a((ft) null, -49, -36, false, 110, -64, (float[]) null, -7);
        }
    }

    final void a(int param0, int param1, qm param2) {
        lia var4 = (lia) (Object) param2;
        if (param0 > -124) {
            ((cta) this).field_ld = null;
        }
        int discarded$0 = ((cta) this).field_jd.SetStreamSource(param1, var4.field_e, 0, var4.b(-7339));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hd = new float[16];
        field_md = new int[]{22, 23};
        field_fd = new int[]{77, 80};
    }
}
