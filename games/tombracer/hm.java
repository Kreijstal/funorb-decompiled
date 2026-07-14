/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends tfa implements gf {
    static String field_m;
    private int field_l;
    static cn field_n;
    private int field_k;

    public final float a(float param0, byte param1) {
        if (param1 != -33) {
            return -0.828248143196106f;
        }
        return param0 / (float)((hm) this).field_k;
    }

    hm(kda param0, ft param1, una param2, int param3, int param4) {
        super(param0, 3553, param1, param2, param4 * param3, false);
        ((hm) this).field_k = param3;
        ((hm) this).field_l = param4;
        ((hm) this).field_j.a(true, (iva) this);
        jaggl.OpenGL.glTexImage2Dub(((hm) this).field_i, 0, ((hm) this).d(108), param3, param4, 0, waa.a(((hm) this).field_f, 1383), lr.a(((hm) this).field_a, 5126), (byte[]) null, 0);
    }

    final void a(int param0, float[] param1, int param2, int param3, int param4, int param5, int param6, ft param7, boolean param8) {
        ((hm) this).field_j.a(param8, (iva) this);
        jaggl.OpenGL.glPixelStorei(3314, param6);
        jaggl.OpenGL.glTexSubImage2Df(((hm) this).field_i, 0, param0, param2, param3, param4, waa.a(param7, 1383), 5121, param1, param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
    }

    public static void g(byte param0) {
        field_n = null;
        if (param0 != 4) {
            return;
        }
        field_m = null;
    }

    public final void b(byte param0) {
        super.b((byte) 66);
        if (param0 < 32) {
            field_m = null;
        }
    }

    public final int a(byte param0) {
        Object var3 = null;
        if (param0 >= 0) {
          var3 = null;
          ((hm) this).a(-26, (byte) -121, -51, (byte[]) null, 52, 85, (ft) null, -93, 99);
          return ((hm) this).field_l;
        } else {
          return ((hm) this).field_l;
        }
    }

    hm(kda param0, ft param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(param0, 3553, param1, una.field_g, param3 * param2, param4);
        L0: {
          ((hm) this).field_l = param3;
          ((hm) this).field_k = param2;
          ((hm) this).field_j.a(true, (iva) this);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          if (!param4) {
            break L0;
          } else {
            if (param7 != 0) {
              break L0;
            } else {
              if (0 == param6) {
                ((hm) this).a(((hm) this).field_i, param2, param5, -118, param3);
                jaggl.OpenGL.glPixelStorei(3317, 4);
              } else {
                break L0;
              }
            }
          }
        }
        jaggl.OpenGL.glPixelStorei(3314, param7);
        jaggl.OpenGL.glTexImage2Dub(((hm) this).field_i, 0, ((hm) this).d(110), param2, param3, 0, waa.a(((hm) this).field_f, 1383), 5121, param5, param6);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
            return true;
        }
        return true;
    }

    final static void h(byte param0) {
        gg.field_f = null;
        uda.field_r = null;
        uua.field_a = null;
        nm.field_l = null;
        ep.field_n = null;
        int var1 = 60 / ((-20 - param0) / 45);
        mc.field_r = null;
        cb.field_i = null;
        dp.field_d = null;
        tv.field_wb = null;
        sta.field_y = null;
        bm.field_f = null;
        vna.field_c = null;
        wh.field_y = null;
        la.field_j = null;
        lm.field_m = null;
        po.field_l = null;
        pq.field_a = null;
        ik.field_h = null;
        bd.field_i = null;
        uta.field_d = null;
        ng.field_b = null;
        em.field_h = null;
        qf.field_k = null;
        la.field_p = null;
        dn.field_d = null;
        ng.field_k = null;
        ega.field_e = null;
        vua.field_A = null;
        dr.field_a = null;
        ij.field_X = null;
        fa.field_a = null;
        ufa.field_r = null;
        lva.field_m = null;
        tp.field_K = null;
        aq.field_a = null;
        je.field_E = null;
        haa.field_z = null;
        eca.field_c = null;
        fra.field_q = null;
        lh.field_b = null;
        kq.field_a = null;
        eu.field_a = null;
        tka.field_p = null;
        gca.field_a = null;
        bsa.field_i = null;
        nc.field_e = null;
        System.gc();
    }

    hm(kda param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(param0, 3553, gpa.field_a, una.field_g, param1 * param2, param3);
        L0: {
          L1: {
            ((hm) this).field_k = param1;
            ((hm) this).field_l = param2;
            ((hm) this).field_j.a(true, (iva) this);
            if (!param3) {
              break L1;
            } else {
              if (param6 != 0) {
                break L1;
              } else {
                if (-1 == (param5 ^ -1)) {
                  ((hm) this).a((byte) 99, ((hm) this).field_i, param2, param4, param1);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          jaggl.OpenGL.glPixelStorei(3314, param6);
          jaggl.OpenGL.glTexImage2Di(((hm) this).field_i, 0, 6408, ((hm) this).field_k, ((hm) this).field_l, 0, 32993, ((hm) this).field_j.field_od, param4, param5 * 4);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          break L0;
        }
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        Object var5 = null;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          ((hm) this).field_j.a(true, (iva) this);
          stackOut_0_0 = ((hm) this).field_i;
          stackOut_0_1 = 10242;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param1) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 10497;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 33071;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          jaggl.OpenGL.glTexParameteri(stackIn_3_0, stackIn_3_1, stackIn_3_2);
          stackOut_3_0 = ((hm) this).field_i;
          stackOut_3_1 = 10243;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (param2) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 10497;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 33071;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        jaggl.OpenGL.glTexParameteri(stackIn_6_0, stackIn_6_1, stackIn_6_2);
        if (param0 > -60) {
          var5 = null;
          ((hm) this).a(-2, (byte) 55, 95, (byte[]) null, -118, 102, (ft) null, -23, 82);
          return;
        } else {
          return;
        }
    }

    hm(kda param0, ft param1, int param2, int param3, boolean param4, float[] param5, int param6, int param7) {
        super(param0, 3553, param1, una.field_h, param2 * param3, param4);
        L0: {
          ((hm) this).field_l = param3;
          ((hm) this).field_k = param2;
          ((hm) this).field_j.a(true, (iva) this);
          if (param4) {
            jaggl.OpenGL.glPixelStorei(3314, param7);
            jaggl.OpenGL.glTexImage2Df(((hm) this).field_i, 0, ((hm) this).d(44), param2, param3, 0, waa.a(((hm) this).field_f, 1383), 5126, param5, param6 * 4);
            jaggl.OpenGL.glPixelStorei(3314, 0);
            break L0;
          } else {
            if (param7 != 0) {
              jaggl.OpenGL.glPixelStorei(3314, param7);
              jaggl.OpenGL.glTexImage2Df(((hm) this).field_i, 0, ((hm) this).d(44), param2, param3, 0, waa.a(((hm) this).field_f, 1383), 5126, param5, param6 * 4);
              jaggl.OpenGL.glPixelStorei(3314, 0);
              break L0;
            } else {
              if (0 != param6) {
                jaggl.OpenGL.glPixelStorei(3314, param7);
                jaggl.OpenGL.glTexImage2Df(((hm) this).field_i, 0, ((hm) this).d(44), param2, param3, 0, waa.a(((hm) this).field_f, 1383), 5126, param5, param6 * 4);
                jaggl.OpenGL.glPixelStorei(3314, 0);
                break L0;
              } else {
                ((hm) this).a(-1, param5, param3, ((hm) this).field_i, param2);
                break L0;
              }
            }
          }
        }
    }

    final static int a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param8 >= param2) {
          if (param7 >= param9) {
            if (param8 <= param3) {
              if (param7 <= param4) {
                if (param8 >= param2) {
                  if (param8 <= param3) {
                    L0: {
                      if (param9 > param7) {
                        break L0;
                      } else {
                        if (param4 < param7) {
                          break L0;
                        } else {
                          if (param6 < param2) {
                            break L0;
                          } else {
                            if (param6 > param3) {
                              break L0;
                            } else {
                              if (param9 > param0) {
                                break L0;
                              } else {
                                if (param4 >= param0) {
                                  return 1 + (1 << param5);
                                } else {
                                  L1: {
                                    param8 = param8 - param2;
                                    param3 = param3 - param2;
                                    param6 = param6 - param2;
                                    param0 = param0 - param9;
                                    param4 = param4 - param9;
                                    param7 = param7 - param9;
                                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                                    if (0 < var10) {
                                      param8 = param8 >> var10;
                                      param6 = param6 >> var10;
                                      param3 = param3 >> var10;
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  }
                                  L2: {
                                    var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                                    if ((var10 ^ -1) >= -1) {
                                      break L2;
                                    } else {
                                      param7 = param7 >> var10;
                                      param0 = param0 >> var10;
                                      param4 = param4 >> var10;
                                      break L2;
                                    }
                                  }
                                  L3: {
                                    var10 = param0 + -param7;
                                    var11 = -param8 + param6;
                                    var12 = -1;
                                    if (var11 != 0) {
                                      var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                      break L3;
                                    } else {
                                      break L3;
                                    }
                                  }
                                  L4: {
                                    if (-1 != (var10 ^ -1)) {
                                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  param0 = param0 - param4;
                                  param8 = param8 - param3;
                                  param7 = param7 - param4;
                                  if (param1 == -15) {
                                    L5: {
                                      param6 = param6 - param3;
                                      if (-1 != (var11 ^ -1)) {
                                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                        break L5;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (0 == var10) {
                                        break L6;
                                      } else {
                                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                        break L6;
                                      }
                                    }
                                    return var12;
                                  } else {
                                    L7: {
                                      hm.g((byte) 96);
                                      param6 = param6 - param3;
                                      if (-1 != (var11 ^ -1)) {
                                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      if (0 == var10) {
                                        break L8;
                                      } else {
                                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                        break L8;
                                      }
                                    }
                                    return var12;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                      if ((var10 ^ -1) >= -1) {
                        break L10;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L10;
                      }
                    }
                    L11: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (-1 != (var10 ^ -1)) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    if (param1 == -15) {
                      L13: {
                        param6 = param6 - param3;
                        if (-1 != (var11 ^ -1)) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (0 == var10) {
                          break L14;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L14;
                        }
                      }
                      return var12;
                    } else {
                      L15: {
                        hm.g((byte) 96);
                        param6 = param6 - param3;
                        if (-1 != (var11 ^ -1)) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        if (0 == var10) {
                          break L16;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L16;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L17: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                      if ((var10 ^ -1) >= -1) {
                        break L18;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L18;
                      }
                    }
                    L19: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (-1 != (var10 ^ -1)) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    if (param1 == -15) {
                      L21: {
                        param6 = param6 - param3;
                        if (-1 != (var11 ^ -1)) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (0 == var10) {
                          break L22;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L22;
                        }
                      }
                      return var12;
                    } else {
                      L23: {
                        hm.g((byte) 96);
                        param6 = param6 - param3;
                        if (-1 != (var11 ^ -1)) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (0 == var10) {
                          break L24;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L24;
                        }
                      }
                      return var12;
                    }
                  }
                } else {
                  L25: {
                    param8 = param8 - param2;
                    param3 = param3 - param2;
                    param6 = param6 - param2;
                    param0 = param0 - param9;
                    param4 = param4 - param9;
                    param7 = param7 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                    if (0 < var10) {
                      param8 = param8 >> var10;
                      param6 = param6 >> var10;
                      param3 = param3 >> var10;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                    if ((var10 ^ -1) >= -1) {
                      break L26;
                    } else {
                      param7 = param7 >> var10;
                      param0 = param0 >> var10;
                      param4 = param4 >> var10;
                      break L26;
                    }
                  }
                  L27: {
                    var10 = param0 + -param7;
                    var11 = -param8 + param6;
                    var12 = -1;
                    if (var11 != 0) {
                      var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (-1 != (var10 ^ -1)) {
                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  param0 = param0 - param4;
                  param8 = param8 - param3;
                  param7 = param7 - param4;
                  if (param1 == -15) {
                    L29: {
                      param6 = param6 - param3;
                      if (-1 != (var11 ^ -1)) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (0 == var10) {
                        break L30;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L30;
                      }
                    }
                    return var12;
                  } else {
                    L31: {
                      hm.g((byte) 96);
                      param6 = param6 - param3;
                      if (-1 != (var11 ^ -1)) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      if (0 == var10) {
                        break L32;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L32;
                      }
                    }
                    return var12;
                  }
                }
              } else {
                if (param0 <= param4) {
                  if (param8 >= param2) {
                    L33: {
                      if (param8 > param3) {
                        break L33;
                      } else {
                        if (param9 > param7) {
                          break L33;
                        } else {
                          if (param4 < param7) {
                            break L33;
                          } else {
                            if (param6 < param2) {
                              break L33;
                            } else {
                              if (param6 > param3) {
                                break L33;
                              } else {
                                if (param9 > param0) {
                                  break L33;
                                } else {
                                  if (param4 >= param0) {
                                    return 1 + (1 << param5);
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L34: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L35: {
                      var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                      if ((var10 ^ -1) >= -1) {
                        break L35;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L35;
                      }
                    }
                    L36: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    L37: {
                      if (-1 != (var10 ^ -1)) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    L38: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      if (param1 == -15) {
                        break L38;
                      } else {
                        hm.g((byte) 96);
                        break L38;
                      }
                    }
                    L39: {
                      param6 = param6 - param3;
                      if (-1 != (var11 ^ -1)) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    L40: {
                      if (0 == var10) {
                        break L40;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L40;
                      }
                    }
                    return var12;
                  } else {
                    L41: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    L42: {
                      var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                      if ((var10 ^ -1) >= -1) {
                        break L42;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L42;
                      }
                    }
                    L43: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    L44: {
                      if (-1 != (var10 ^ -1)) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    L45: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      if (param1 == -15) {
                        break L45;
                      } else {
                        hm.g((byte) 96);
                        break L45;
                      }
                    }
                    L46: {
                      param6 = param6 - param3;
                      if (-1 != (var11 ^ -1)) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L46;
                      } else {
                        break L46;
                      }
                    }
                    L47: {
                      if (0 == var10) {
                        break L47;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L47;
                      }
                    }
                    return var12;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (param3 >= param6) {
                L48: {
                  if (param7 <= param4) {
                    break L48;
                  } else {
                    if (param0 > param4) {
                      return -1;
                    } else {
                      break L48;
                    }
                  }
                }
                if (param8 >= param2) {
                  if (param8 <= param3) {
                    if (param9 <= param7) {
                      if (param4 >= param7) {
                        if (param6 >= param2) {
                          if (param6 <= param3) {
                            if (param9 <= param0) {
                              if (param4 >= param0) {
                                return 1 + (1 << param5);
                              } else {
                                L49: {
                                  param8 = param8 - param2;
                                  param3 = param3 - param2;
                                  param6 = param6 - param2;
                                  param0 = param0 - param9;
                                  param4 = param4 - param9;
                                  param7 = param7 - param9;
                                  var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                                  if (0 < var10) {
                                    param8 = param8 >> var10;
                                    param6 = param6 >> var10;
                                    param3 = param3 >> var10;
                                    break L49;
                                  } else {
                                    break L49;
                                  }
                                }
                                L50: {
                                  var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                                  if ((var10 ^ -1) >= -1) {
                                    break L50;
                                  } else {
                                    param7 = param7 >> var10;
                                    param0 = param0 >> var10;
                                    param4 = param4 >> var10;
                                    break L50;
                                  }
                                }
                                L51: {
                                  var10 = param0 + -param7;
                                  var11 = -param8 + param6;
                                  var12 = -1;
                                  if (var11 != 0) {
                                    var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                                L52: {
                                  if (-1 != (var10 ^ -1)) {
                                    var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                    break L52;
                                  } else {
                                    break L52;
                                  }
                                }
                                L53: {
                                  param0 = param0 - param4;
                                  param8 = param8 - param3;
                                  param7 = param7 - param4;
                                  if (param1 == -15) {
                                    break L53;
                                  } else {
                                    hm.g((byte) 96);
                                    break L53;
                                  }
                                }
                                L54: {
                                  param6 = param6 - param3;
                                  if (-1 != (var11 ^ -1)) {
                                    var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                                L55: {
                                  if (0 == var10) {
                                    break L55;
                                  } else {
                                    var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                    break L55;
                                  }
                                }
                                return var12;
                              }
                            } else {
                              L56: {
                                param8 = param8 - param2;
                                param3 = param3 - param2;
                                param6 = param6 - param2;
                                param0 = param0 - param9;
                                param4 = param4 - param9;
                                param7 = param7 - param9;
                                var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                                if (0 < var10) {
                                  param8 = param8 >> var10;
                                  param6 = param6 >> var10;
                                  param3 = param3 >> var10;
                                  break L56;
                                } else {
                                  break L56;
                                }
                              }
                              L57: {
                                var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                                if ((var10 ^ -1) >= -1) {
                                  break L57;
                                } else {
                                  param7 = param7 >> var10;
                                  param0 = param0 >> var10;
                                  param4 = param4 >> var10;
                                  break L57;
                                }
                              }
                              L58: {
                                var10 = param0 + -param7;
                                var11 = -param8 + param6;
                                var12 = -1;
                                if (var11 != 0) {
                                  var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                  break L58;
                                } else {
                                  break L58;
                                }
                              }
                              L59: {
                                if (-1 != (var10 ^ -1)) {
                                  var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                  break L59;
                                } else {
                                  break L59;
                                }
                              }
                              L60: {
                                param0 = param0 - param4;
                                param8 = param8 - param3;
                                param7 = param7 - param4;
                                if (param1 == -15) {
                                  break L60;
                                } else {
                                  hm.g((byte) 96);
                                  break L60;
                                }
                              }
                              L61: {
                                param6 = param6 - param3;
                                if (-1 != (var11 ^ -1)) {
                                  var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                  break L61;
                                } else {
                                  break L61;
                                }
                              }
                              L62: {
                                if (0 == var10) {
                                  break L62;
                                } else {
                                  var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                  break L62;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L63: {
                              param8 = param8 - param2;
                              param3 = param3 - param2;
                              param6 = param6 - param2;
                              param0 = param0 - param9;
                              param4 = param4 - param9;
                              param7 = param7 - param9;
                              var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                              if (0 < var10) {
                                param8 = param8 >> var10;
                                param6 = param6 >> var10;
                                param3 = param3 >> var10;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                            L64: {
                              var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                              if ((var10 ^ -1) >= -1) {
                                break L64;
                              } else {
                                param7 = param7 >> var10;
                                param0 = param0 >> var10;
                                param4 = param4 >> var10;
                                break L64;
                              }
                            }
                            L65: {
                              var10 = param0 + -param7;
                              var11 = -param8 + param6;
                              var12 = -1;
                              if (var11 != 0) {
                                var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                break L65;
                              } else {
                                break L65;
                              }
                            }
                            L66: {
                              if (-1 != (var10 ^ -1)) {
                                var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                break L66;
                              } else {
                                break L66;
                              }
                            }
                            L67: {
                              param0 = param0 - param4;
                              param8 = param8 - param3;
                              param7 = param7 - param4;
                              if (param1 == -15) {
                                break L67;
                              } else {
                                hm.g((byte) 96);
                                break L67;
                              }
                            }
                            L68: {
                              param6 = param6 - param3;
                              if (-1 != (var11 ^ -1)) {
                                var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                break L68;
                              } else {
                                break L68;
                              }
                            }
                            L69: {
                              if (0 == var10) {
                                break L69;
                              } else {
                                var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                break L69;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L70: {
                            param8 = param8 - param2;
                            param3 = param3 - param2;
                            param6 = param6 - param2;
                            param0 = param0 - param9;
                            param4 = param4 - param9;
                            param7 = param7 - param9;
                            var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                            if (0 < var10) {
                              param8 = param8 >> var10;
                              param6 = param6 >> var10;
                              param3 = param3 >> var10;
                              break L70;
                            } else {
                              break L70;
                            }
                          }
                          L71: {
                            var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                            if ((var10 ^ -1) >= -1) {
                              break L71;
                            } else {
                              param7 = param7 >> var10;
                              param0 = param0 >> var10;
                              param4 = param4 >> var10;
                              break L71;
                            }
                          }
                          L72: {
                            var10 = param0 + -param7;
                            var11 = -param8 + param6;
                            var12 = -1;
                            if (var11 != 0) {
                              var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                              break L72;
                            } else {
                              break L72;
                            }
                          }
                          L73: {
                            if (-1 != (var10 ^ -1)) {
                              var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                              break L73;
                            } else {
                              break L73;
                            }
                          }
                          L74: {
                            param0 = param0 - param4;
                            param8 = param8 - param3;
                            param7 = param7 - param4;
                            if (param1 == -15) {
                              break L74;
                            } else {
                              hm.g((byte) 96);
                              break L74;
                            }
                          }
                          L75: {
                            param6 = param6 - param3;
                            if (-1 != (var11 ^ -1)) {
                              var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                              break L75;
                            } else {
                              break L75;
                            }
                          }
                          L76: {
                            if (0 == var10) {
                              break L76;
                            } else {
                              var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                              break L76;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L77: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                        L78: {
                          var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                          if ((var10 ^ -1) >= -1) {
                            break L78;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L78;
                          }
                        }
                        L79: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                            break L79;
                          } else {
                            break L79;
                          }
                        }
                        L80: {
                          if (-1 != (var10 ^ -1)) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L80;
                          } else {
                            break L80;
                          }
                        }
                        L81: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          if (param1 == -15) {
                            break L81;
                          } else {
                            hm.g((byte) 96);
                            break L81;
                          }
                        }
                        L82: {
                          param6 = param6 - param3;
                          if (-1 != (var11 ^ -1)) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L82;
                          } else {
                            break L82;
                          }
                        }
                        L83: {
                          if (0 == var10) {
                            break L83;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L83;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L84: {
                        param8 = param8 - param2;
                        param3 = param3 - param2;
                        param6 = param6 - param2;
                        param0 = param0 - param9;
                        param4 = param4 - param9;
                        param7 = param7 - param9;
                        var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                        if (0 < var10) {
                          param8 = param8 >> var10;
                          param6 = param6 >> var10;
                          param3 = param3 >> var10;
                          break L84;
                        } else {
                          break L84;
                        }
                      }
                      L85: {
                        var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                        if ((var10 ^ -1) >= -1) {
                          break L85;
                        } else {
                          param7 = param7 >> var10;
                          param0 = param0 >> var10;
                          param4 = param4 >> var10;
                          break L85;
                        }
                      }
                      L86: {
                        var10 = param0 + -param7;
                        var11 = -param8 + param6;
                        var12 = -1;
                        if (var11 != 0) {
                          var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                          break L86;
                        } else {
                          break L86;
                        }
                      }
                      L87: {
                        if (-1 != (var10 ^ -1)) {
                          var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                          break L87;
                        } else {
                          break L87;
                        }
                      }
                      L88: {
                        param0 = param0 - param4;
                        param8 = param8 - param3;
                        param7 = param7 - param4;
                        if (param1 == -15) {
                          break L88;
                        } else {
                          hm.g((byte) 96);
                          break L88;
                        }
                      }
                      L89: {
                        param6 = param6 - param3;
                        if (-1 != (var11 ^ -1)) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L89;
                        } else {
                          break L89;
                        }
                      }
                      L90: {
                        if (0 == var10) {
                          break L90;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L90;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L91: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L91;
                      } else {
                        break L91;
                      }
                    }
                    L92: {
                      var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                      if ((var10 ^ -1) >= -1) {
                        break L92;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L92;
                      }
                    }
                    L93: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                        break L93;
                      } else {
                        break L93;
                      }
                    }
                    L94: {
                      if (-1 != (var10 ^ -1)) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L94;
                      } else {
                        break L94;
                      }
                    }
                    L95: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      if (param1 == -15) {
                        break L95;
                      } else {
                        hm.g((byte) 96);
                        break L95;
                      }
                    }
                    L96: {
                      param6 = param6 - param3;
                      if (-1 != (var11 ^ -1)) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L96;
                      } else {
                        break L96;
                      }
                    }
                    L97: {
                      if (0 == var10) {
                        break L97;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L97;
                      }
                    }
                    return var12;
                  }
                } else {
                  L98: {
                    param8 = param8 - param2;
                    param3 = param3 - param2;
                    param6 = param6 - param2;
                    param0 = param0 - param9;
                    param4 = param4 - param9;
                    param7 = param7 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                    if (0 < var10) {
                      param8 = param8 >> var10;
                      param6 = param6 >> var10;
                      param3 = param3 >> var10;
                      break L98;
                    } else {
                      break L98;
                    }
                  }
                  L99: {
                    var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                    if ((var10 ^ -1) >= -1) {
                      break L99;
                    } else {
                      param7 = param7 >> var10;
                      param0 = param0 >> var10;
                      param4 = param4 >> var10;
                      break L99;
                    }
                  }
                  L100: {
                    var10 = param0 + -param7;
                    var11 = -param8 + param6;
                    var12 = -1;
                    if (var11 != 0) {
                      var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                      break L100;
                    } else {
                      break L100;
                    }
                  }
                  L101: {
                    if (-1 != (var10 ^ -1)) {
                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                      break L101;
                    } else {
                      break L101;
                    }
                  }
                  L102: {
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    if (param1 == -15) {
                      break L102;
                    } else {
                      hm.g((byte) 96);
                      break L102;
                    }
                  }
                  L103: {
                    param6 = param6 - param3;
                    if (-1 != (var11 ^ -1)) {
                      var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                      break L103;
                    } else {
                      break L103;
                    }
                  }
                  L104: {
                    if (0 == var10) {
                      break L104;
                    } else {
                      var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                      break L104;
                    }
                  }
                  return var12;
                }
              } else {
                return -1;
              }
            }
          } else {
            if (param0 >= param9) {
              L105: {
                L106: {
                  if (param8 <= param3) {
                    break L106;
                  } else {
                    if (param3 < param6) {
                      break L105;
                    } else {
                      break L106;
                    }
                  }
                }
                L107: {
                  if (param7 <= param4) {
                    break L107;
                  } else {
                    if (param0 > param4) {
                      break L105;
                    } else {
                      break L107;
                    }
                  }
                }
                if (param8 >= param2) {
                  if (param8 <= param3) {
                    if (param9 <= param7) {
                      if (param4 >= param7) {
                        if (param6 >= param2) {
                          if (param6 <= param3) {
                            if (param9 <= param0) {
                              if (param4 >= param0) {
                                return 1 + (1 << param5);
                              } else {
                                L108: {
                                  param8 = param8 - param2;
                                  param3 = param3 - param2;
                                  param6 = param6 - param2;
                                  param0 = param0 - param9;
                                  param4 = param4 - param9;
                                  param7 = param7 - param9;
                                  var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                                  if (0 < var10) {
                                    param8 = param8 >> var10;
                                    param6 = param6 >> var10;
                                    param3 = param3 >> var10;
                                    break L108;
                                  } else {
                                    break L108;
                                  }
                                }
                                L109: {
                                  var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                                  if ((var10 ^ -1) >= -1) {
                                    break L109;
                                  } else {
                                    param7 = param7 >> var10;
                                    param0 = param0 >> var10;
                                    param4 = param4 >> var10;
                                    break L109;
                                  }
                                }
                                L110: {
                                  var10 = param0 + -param7;
                                  var11 = -param8 + param6;
                                  var12 = -1;
                                  if (var11 != 0) {
                                    var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                    break L110;
                                  } else {
                                    break L110;
                                  }
                                }
                                L111: {
                                  if (-1 != (var10 ^ -1)) {
                                    var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                    break L111;
                                  } else {
                                    break L111;
                                  }
                                }
                                L112: {
                                  param0 = param0 - param4;
                                  param8 = param8 - param3;
                                  param7 = param7 - param4;
                                  if (param1 == -15) {
                                    break L112;
                                  } else {
                                    hm.g((byte) 96);
                                    break L112;
                                  }
                                }
                                L113: {
                                  param6 = param6 - param3;
                                  if (-1 != (var11 ^ -1)) {
                                    var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                    break L113;
                                  } else {
                                    break L113;
                                  }
                                }
                                L114: {
                                  if (0 == var10) {
                                    break L114;
                                  } else {
                                    var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                    break L114;
                                  }
                                }
                                return var12;
                              }
                            } else {
                              L115: {
                                param8 = param8 - param2;
                                param3 = param3 - param2;
                                param6 = param6 - param2;
                                param0 = param0 - param9;
                                param4 = param4 - param9;
                                param7 = param7 - param9;
                                var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                                if (0 < var10) {
                                  param8 = param8 >> var10;
                                  param6 = param6 >> var10;
                                  param3 = param3 >> var10;
                                  break L115;
                                } else {
                                  break L115;
                                }
                              }
                              L116: {
                                var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                                if ((var10 ^ -1) >= -1) {
                                  break L116;
                                } else {
                                  param7 = param7 >> var10;
                                  param0 = param0 >> var10;
                                  param4 = param4 >> var10;
                                  break L116;
                                }
                              }
                              L117: {
                                var10 = param0 + -param7;
                                var11 = -param8 + param6;
                                var12 = -1;
                                if (var11 != 0) {
                                  var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                  break L117;
                                } else {
                                  break L117;
                                }
                              }
                              L118: {
                                if (-1 != (var10 ^ -1)) {
                                  var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                  break L118;
                                } else {
                                  break L118;
                                }
                              }
                              L119: {
                                param0 = param0 - param4;
                                param8 = param8 - param3;
                                param7 = param7 - param4;
                                if (param1 == -15) {
                                  break L119;
                                } else {
                                  hm.g((byte) 96);
                                  break L119;
                                }
                              }
                              L120: {
                                param6 = param6 - param3;
                                if (-1 != (var11 ^ -1)) {
                                  var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                  break L120;
                                } else {
                                  break L120;
                                }
                              }
                              L121: {
                                if (0 == var10) {
                                  break L121;
                                } else {
                                  var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                  break L121;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L122: {
                              param8 = param8 - param2;
                              param3 = param3 - param2;
                              param6 = param6 - param2;
                              param0 = param0 - param9;
                              param4 = param4 - param9;
                              param7 = param7 - param9;
                              var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                              if (0 < var10) {
                                param8 = param8 >> var10;
                                param6 = param6 >> var10;
                                param3 = param3 >> var10;
                                break L122;
                              } else {
                                break L122;
                              }
                            }
                            L123: {
                              var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                              if ((var10 ^ -1) >= -1) {
                                break L123;
                              } else {
                                param7 = param7 >> var10;
                                param0 = param0 >> var10;
                                param4 = param4 >> var10;
                                break L123;
                              }
                            }
                            L124: {
                              var10 = param0 + -param7;
                              var11 = -param8 + param6;
                              var12 = -1;
                              if (var11 != 0) {
                                var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                break L124;
                              } else {
                                break L124;
                              }
                            }
                            L125: {
                              if (-1 != (var10 ^ -1)) {
                                var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                break L125;
                              } else {
                                break L125;
                              }
                            }
                            L126: {
                              param0 = param0 - param4;
                              param8 = param8 - param3;
                              param7 = param7 - param4;
                              if (param1 == -15) {
                                break L126;
                              } else {
                                hm.g((byte) 96);
                                break L126;
                              }
                            }
                            L127: {
                              param6 = param6 - param3;
                              if (-1 != (var11 ^ -1)) {
                                var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                break L127;
                              } else {
                                break L127;
                              }
                            }
                            L128: {
                              if (0 == var10) {
                                break L128;
                              } else {
                                var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                break L128;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L129: {
                            param8 = param8 - param2;
                            param3 = param3 - param2;
                            param6 = param6 - param2;
                            param0 = param0 - param9;
                            param4 = param4 - param9;
                            param7 = param7 - param9;
                            var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                            if (0 < var10) {
                              param8 = param8 >> var10;
                              param6 = param6 >> var10;
                              param3 = param3 >> var10;
                              break L129;
                            } else {
                              break L129;
                            }
                          }
                          L130: {
                            var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                            if ((var10 ^ -1) >= -1) {
                              break L130;
                            } else {
                              param7 = param7 >> var10;
                              param0 = param0 >> var10;
                              param4 = param4 >> var10;
                              break L130;
                            }
                          }
                          L131: {
                            var10 = param0 + -param7;
                            var11 = -param8 + param6;
                            var12 = -1;
                            if (var11 != 0) {
                              var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                              break L131;
                            } else {
                              break L131;
                            }
                          }
                          L132: {
                            if (-1 != (var10 ^ -1)) {
                              var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                              break L132;
                            } else {
                              break L132;
                            }
                          }
                          L133: {
                            param0 = param0 - param4;
                            param8 = param8 - param3;
                            param7 = param7 - param4;
                            if (param1 == -15) {
                              break L133;
                            } else {
                              hm.g((byte) 96);
                              break L133;
                            }
                          }
                          L134: {
                            param6 = param6 - param3;
                            if (-1 != (var11 ^ -1)) {
                              var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                              break L134;
                            } else {
                              break L134;
                            }
                          }
                          L135: {
                            if (0 == var10) {
                              break L135;
                            } else {
                              var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                              break L135;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L136: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L136;
                          } else {
                            break L136;
                          }
                        }
                        L137: {
                          var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                          if ((var10 ^ -1) >= -1) {
                            break L137;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L137;
                          }
                        }
                        L138: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                            break L138;
                          } else {
                            break L138;
                          }
                        }
                        L139: {
                          if (-1 != (var10 ^ -1)) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L139;
                          } else {
                            break L139;
                          }
                        }
                        L140: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          if (param1 == -15) {
                            break L140;
                          } else {
                            hm.g((byte) 96);
                            break L140;
                          }
                        }
                        L141: {
                          param6 = param6 - param3;
                          if (-1 != (var11 ^ -1)) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L141;
                          } else {
                            break L141;
                          }
                        }
                        L142: {
                          if (0 == var10) {
                            break L142;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L142;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L143: {
                        param8 = param8 - param2;
                        param3 = param3 - param2;
                        param6 = param6 - param2;
                        param0 = param0 - param9;
                        param4 = param4 - param9;
                        param7 = param7 - param9;
                        var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                        if (0 < var10) {
                          param8 = param8 >> var10;
                          param6 = param6 >> var10;
                          param3 = param3 >> var10;
                          break L143;
                        } else {
                          break L143;
                        }
                      }
                      L144: {
                        var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                        if ((var10 ^ -1) >= -1) {
                          break L144;
                        } else {
                          param7 = param7 >> var10;
                          param0 = param0 >> var10;
                          param4 = param4 >> var10;
                          break L144;
                        }
                      }
                      L145: {
                        var10 = param0 + -param7;
                        var11 = -param8 + param6;
                        var12 = -1;
                        if (var11 != 0) {
                          var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                          break L145;
                        } else {
                          break L145;
                        }
                      }
                      L146: {
                        if (-1 != (var10 ^ -1)) {
                          var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                          break L146;
                        } else {
                          break L146;
                        }
                      }
                      L147: {
                        param0 = param0 - param4;
                        param8 = param8 - param3;
                        param7 = param7 - param4;
                        if (param1 == -15) {
                          break L147;
                        } else {
                          hm.g((byte) 96);
                          break L147;
                        }
                      }
                      L148: {
                        param6 = param6 - param3;
                        if (-1 != (var11 ^ -1)) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L148;
                        } else {
                          break L148;
                        }
                      }
                      L149: {
                        if (0 == var10) {
                          break L149;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L149;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L150: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L150;
                      } else {
                        break L150;
                      }
                    }
                    L151: {
                      var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                      if ((var10 ^ -1) >= -1) {
                        break L151;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L151;
                      }
                    }
                    L152: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                        break L152;
                      } else {
                        break L152;
                      }
                    }
                    L153: {
                      if (-1 != (var10 ^ -1)) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L153;
                      } else {
                        break L153;
                      }
                    }
                    L154: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      if (param1 == -15) {
                        break L154;
                      } else {
                        hm.g((byte) 96);
                        break L154;
                      }
                    }
                    L155: {
                      param6 = param6 - param3;
                      if (-1 != (var11 ^ -1)) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L155;
                      } else {
                        break L155;
                      }
                    }
                    L156: {
                      if (0 == var10) {
                        break L156;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L156;
                      }
                    }
                    return var12;
                  }
                } else {
                  L157: {
                    param8 = param8 - param2;
                    param3 = param3 - param2;
                    param6 = param6 - param2;
                    param0 = param0 - param9;
                    param4 = param4 - param9;
                    param7 = param7 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                    if (0 < var10) {
                      param8 = param8 >> var10;
                      param6 = param6 >> var10;
                      param3 = param3 >> var10;
                      break L157;
                    } else {
                      break L157;
                    }
                  }
                  L158: {
                    var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                    if ((var10 ^ -1) >= -1) {
                      break L158;
                    } else {
                      param7 = param7 >> var10;
                      param0 = param0 >> var10;
                      param4 = param4 >> var10;
                      break L158;
                    }
                  }
                  L159: {
                    var10 = param0 + -param7;
                    var11 = -param8 + param6;
                    var12 = -1;
                    if (var11 != 0) {
                      var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                      break L159;
                    } else {
                      break L159;
                    }
                  }
                  L160: {
                    if (-1 != (var10 ^ -1)) {
                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                      break L160;
                    } else {
                      break L160;
                    }
                  }
                  L161: {
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    if (param1 == -15) {
                      break L161;
                    } else {
                      hm.g((byte) 96);
                      break L161;
                    }
                  }
                  L162: {
                    param6 = param6 - param3;
                    if (-1 != (var11 ^ -1)) {
                      var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                      break L162;
                    } else {
                      break L162;
                    }
                  }
                  L163: {
                    if (0 == var10) {
                      break L163;
                    } else {
                      var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                      break L163;
                    }
                  }
                  return var12;
                }
              }
              return -1;
            } else {
              return -1;
            }
          }
        } else {
          if (param6 >= param2) {
            L164: {
              L165: {
                if (param7 >= param9) {
                  break L165;
                } else {
                  if (param0 < param9) {
                    break L164;
                  } else {
                    break L165;
                  }
                }
              }
              L166: {
                if (param8 <= param3) {
                  break L166;
                } else {
                  if (param3 < param6) {
                    break L164;
                  } else {
                    break L166;
                  }
                }
              }
              L167: {
                if (param7 <= param4) {
                  break L167;
                } else {
                  if (param0 > param4) {
                    break L164;
                  } else {
                    break L167;
                  }
                }
              }
              if (param8 >= param2) {
                if (param8 <= param3) {
                  if (param9 <= param7) {
                    if (param4 >= param7) {
                      if (param6 >= param2) {
                        if (param6 <= param3) {
                          if (param9 <= param0) {
                            if (param4 >= param0) {
                              return 1 + (1 << param5);
                            } else {
                              L168: {
                                param8 = param8 - param2;
                                param3 = param3 - param2;
                                param6 = param6 - param2;
                                param0 = param0 - param9;
                                param4 = param4 - param9;
                                param7 = param7 - param9;
                                var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                                if (0 < var10) {
                                  param8 = param8 >> var10;
                                  param6 = param6 >> var10;
                                  param3 = param3 >> var10;
                                  break L168;
                                } else {
                                  break L168;
                                }
                              }
                              L169: {
                                var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                                if ((var10 ^ -1) >= -1) {
                                  break L169;
                                } else {
                                  param7 = param7 >> var10;
                                  param0 = param0 >> var10;
                                  param4 = param4 >> var10;
                                  break L169;
                                }
                              }
                              L170: {
                                var10 = param0 + -param7;
                                var11 = -param8 + param6;
                                var12 = -1;
                                if (var11 != 0) {
                                  var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                  break L170;
                                } else {
                                  break L170;
                                }
                              }
                              L171: {
                                if (-1 != (var10 ^ -1)) {
                                  var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                  break L171;
                                } else {
                                  break L171;
                                }
                              }
                              L172: {
                                param0 = param0 - param4;
                                param8 = param8 - param3;
                                param7 = param7 - param4;
                                if (param1 == -15) {
                                  break L172;
                                } else {
                                  hm.g((byte) 96);
                                  break L172;
                                }
                              }
                              L173: {
                                param6 = param6 - param3;
                                if (-1 != (var11 ^ -1)) {
                                  var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                  break L173;
                                } else {
                                  break L173;
                                }
                              }
                              L174: {
                                if (0 == var10) {
                                  break L174;
                                } else {
                                  var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                  break L174;
                                }
                              }
                              return var12;
                            }
                          } else {
                            L175: {
                              param8 = param8 - param2;
                              param3 = param3 - param2;
                              param6 = param6 - param2;
                              param0 = param0 - param9;
                              param4 = param4 - param9;
                              param7 = param7 - param9;
                              var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                              if (0 < var10) {
                                param8 = param8 >> var10;
                                param6 = param6 >> var10;
                                param3 = param3 >> var10;
                                break L175;
                              } else {
                                break L175;
                              }
                            }
                            L176: {
                              var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                              if ((var10 ^ -1) >= -1) {
                                break L176;
                              } else {
                                param7 = param7 >> var10;
                                param0 = param0 >> var10;
                                param4 = param4 >> var10;
                                break L176;
                              }
                            }
                            L177: {
                              var10 = param0 + -param7;
                              var11 = -param8 + param6;
                              var12 = -1;
                              if (var11 != 0) {
                                var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                                break L177;
                              } else {
                                break L177;
                              }
                            }
                            L178: {
                              if (-1 != (var10 ^ -1)) {
                                var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                                break L178;
                              } else {
                                break L178;
                              }
                            }
                            L179: {
                              param0 = param0 - param4;
                              param8 = param8 - param3;
                              param7 = param7 - param4;
                              if (param1 == -15) {
                                break L179;
                              } else {
                                hm.g((byte) 96);
                                break L179;
                              }
                            }
                            L180: {
                              param6 = param6 - param3;
                              if (-1 != (var11 ^ -1)) {
                                var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                                break L180;
                              } else {
                                break L180;
                              }
                            }
                            L181: {
                              if (0 == var10) {
                                break L181;
                              } else {
                                var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                                break L181;
                              }
                            }
                            return var12;
                          }
                        } else {
                          L182: {
                            param8 = param8 - param2;
                            param3 = param3 - param2;
                            param6 = param6 - param2;
                            param0 = param0 - param9;
                            param4 = param4 - param9;
                            param7 = param7 - param9;
                            var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                            if (0 < var10) {
                              param8 = param8 >> var10;
                              param6 = param6 >> var10;
                              param3 = param3 >> var10;
                              break L182;
                            } else {
                              break L182;
                            }
                          }
                          L183: {
                            var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                            if ((var10 ^ -1) >= -1) {
                              break L183;
                            } else {
                              param7 = param7 >> var10;
                              param0 = param0 >> var10;
                              param4 = param4 >> var10;
                              break L183;
                            }
                          }
                          L184: {
                            var10 = param0 + -param7;
                            var11 = -param8 + param6;
                            var12 = -1;
                            if (var11 != 0) {
                              var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                              break L184;
                            } else {
                              break L184;
                            }
                          }
                          L185: {
                            if (-1 != (var10 ^ -1)) {
                              var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                              break L185;
                            } else {
                              break L185;
                            }
                          }
                          L186: {
                            param0 = param0 - param4;
                            param8 = param8 - param3;
                            param7 = param7 - param4;
                            if (param1 == -15) {
                              break L186;
                            } else {
                              hm.g((byte) 96);
                              break L186;
                            }
                          }
                          L187: {
                            param6 = param6 - param3;
                            if (-1 != (var11 ^ -1)) {
                              var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                              break L187;
                            } else {
                              break L187;
                            }
                          }
                          L188: {
                            if (0 == var10) {
                              break L188;
                            } else {
                              var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                              break L188;
                            }
                          }
                          return var12;
                        }
                      } else {
                        L189: {
                          param8 = param8 - param2;
                          param3 = param3 - param2;
                          param6 = param6 - param2;
                          param0 = param0 - param9;
                          param4 = param4 - param9;
                          param7 = param7 - param9;
                          var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                          if (0 < var10) {
                            param8 = param8 >> var10;
                            param6 = param6 >> var10;
                            param3 = param3 >> var10;
                            break L189;
                          } else {
                            break L189;
                          }
                        }
                        L190: {
                          var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                          if ((var10 ^ -1) >= -1) {
                            break L190;
                          } else {
                            param7 = param7 >> var10;
                            param0 = param0 >> var10;
                            param4 = param4 >> var10;
                            break L190;
                          }
                        }
                        L191: {
                          var10 = param0 + -param7;
                          var11 = -param8 + param6;
                          var12 = -1;
                          if (var11 != 0) {
                            var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                            break L191;
                          } else {
                            break L191;
                          }
                        }
                        L192: {
                          if (-1 != (var10 ^ -1)) {
                            var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                            break L192;
                          } else {
                            break L192;
                          }
                        }
                        L193: {
                          param0 = param0 - param4;
                          param8 = param8 - param3;
                          param7 = param7 - param4;
                          if (param1 == -15) {
                            break L193;
                          } else {
                            hm.g((byte) 96);
                            break L193;
                          }
                        }
                        L194: {
                          param6 = param6 - param3;
                          if (-1 != (var11 ^ -1)) {
                            var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                            break L194;
                          } else {
                            break L194;
                          }
                        }
                        L195: {
                          if (0 == var10) {
                            break L195;
                          } else {
                            var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                            break L195;
                          }
                        }
                        return var12;
                      }
                    } else {
                      L196: {
                        param8 = param8 - param2;
                        param3 = param3 - param2;
                        param6 = param6 - param2;
                        param0 = param0 - param9;
                        param4 = param4 - param9;
                        param7 = param7 - param9;
                        var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                        if (0 < var10) {
                          param8 = param8 >> var10;
                          param6 = param6 >> var10;
                          param3 = param3 >> var10;
                          break L196;
                        } else {
                          break L196;
                        }
                      }
                      L197: {
                        var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                        if ((var10 ^ -1) >= -1) {
                          break L197;
                        } else {
                          param7 = param7 >> var10;
                          param0 = param0 >> var10;
                          param4 = param4 >> var10;
                          break L197;
                        }
                      }
                      L198: {
                        var10 = param0 + -param7;
                        var11 = -param8 + param6;
                        var12 = -1;
                        if (var11 != 0) {
                          var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                          break L198;
                        } else {
                          break L198;
                        }
                      }
                      L199: {
                        if (-1 != (var10 ^ -1)) {
                          var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                          break L199;
                        } else {
                          break L199;
                        }
                      }
                      L200: {
                        param0 = param0 - param4;
                        param8 = param8 - param3;
                        param7 = param7 - param4;
                        if (param1 == -15) {
                          break L200;
                        } else {
                          hm.g((byte) 96);
                          break L200;
                        }
                      }
                      L201: {
                        param6 = param6 - param3;
                        if (-1 != (var11 ^ -1)) {
                          var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                          break L201;
                        } else {
                          break L201;
                        }
                      }
                      L202: {
                        if (0 == var10) {
                          break L202;
                        } else {
                          var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                          break L202;
                        }
                      }
                      return var12;
                    }
                  } else {
                    L203: {
                      param8 = param8 - param2;
                      param3 = param3 - param2;
                      param6 = param6 - param2;
                      param0 = param0 - param9;
                      param4 = param4 - param9;
                      param7 = param7 - param9;
                      var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                      if (0 < var10) {
                        param8 = param8 >> var10;
                        param6 = param6 >> var10;
                        param3 = param3 >> var10;
                        break L203;
                      } else {
                        break L203;
                      }
                    }
                    L204: {
                      var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                      if ((var10 ^ -1) >= -1) {
                        break L204;
                      } else {
                        param7 = param7 >> var10;
                        param0 = param0 >> var10;
                        param4 = param4 >> var10;
                        break L204;
                      }
                    }
                    L205: {
                      var10 = param0 + -param7;
                      var11 = -param8 + param6;
                      var12 = -1;
                      if (var11 != 0) {
                        var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                        break L205;
                      } else {
                        break L205;
                      }
                    }
                    L206: {
                      if (-1 != (var10 ^ -1)) {
                        var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                        break L206;
                      } else {
                        break L206;
                      }
                    }
                    L207: {
                      param0 = param0 - param4;
                      param8 = param8 - param3;
                      param7 = param7 - param4;
                      if (param1 == -15) {
                        break L207;
                      } else {
                        hm.g((byte) 96);
                        break L207;
                      }
                    }
                    L208: {
                      param6 = param6 - param3;
                      if (-1 != (var11 ^ -1)) {
                        var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                        break L208;
                      } else {
                        break L208;
                      }
                    }
                    L209: {
                      if (0 == var10) {
                        break L209;
                      } else {
                        var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                        break L209;
                      }
                    }
                    return var12;
                  }
                } else {
                  L210: {
                    param8 = param8 - param2;
                    param3 = param3 - param2;
                    param6 = param6 - param2;
                    param0 = param0 - param9;
                    param4 = param4 - param9;
                    param7 = param7 - param9;
                    var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                    if (0 < var10) {
                      param8 = param8 >> var10;
                      param6 = param6 >> var10;
                      param3 = param3 >> var10;
                      break L210;
                    } else {
                      break L210;
                    }
                  }
                  L211: {
                    var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                    if ((var10 ^ -1) >= -1) {
                      break L211;
                    } else {
                      param7 = param7 >> var10;
                      param0 = param0 >> var10;
                      param4 = param4 >> var10;
                      break L211;
                    }
                  }
                  L212: {
                    var10 = param0 + -param7;
                    var11 = -param8 + param6;
                    var12 = -1;
                    if (var11 != 0) {
                      var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                      break L212;
                    } else {
                      break L212;
                    }
                  }
                  L213: {
                    if (-1 != (var10 ^ -1)) {
                      var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                      break L213;
                    } else {
                      break L213;
                    }
                  }
                  L214: {
                    param0 = param0 - param4;
                    param8 = param8 - param3;
                    param7 = param7 - param4;
                    if (param1 == -15) {
                      break L214;
                    } else {
                      hm.g((byte) 96);
                      break L214;
                    }
                  }
                  L215: {
                    param6 = param6 - param3;
                    if (-1 != (var11 ^ -1)) {
                      var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                      break L215;
                    } else {
                      break L215;
                    }
                  }
                  L216: {
                    if (0 == var10) {
                      break L216;
                    } else {
                      var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                      break L216;
                    }
                  }
                  return var12;
                }
              } else {
                L217: {
                  param8 = param8 - param2;
                  param3 = param3 - param2;
                  param6 = param6 - param2;
                  param0 = param0 - param9;
                  param4 = param4 - param9;
                  param7 = param7 - param9;
                  var10 = -14 + Math.max(Math.max(vd.b(1, param8), vd.b(param1 + 16, param6)), vd.b(1, param3));
                  if (0 < var10) {
                    param8 = param8 >> var10;
                    param6 = param6 >> var10;
                    param3 = param3 >> var10;
                    break L217;
                  } else {
                    break L217;
                  }
                }
                L218: {
                  var10 = -14 + Math.max(Math.max(vd.b(param1 ^ -16, param7), vd.b(1, param0)), vd.b(1, param4));
                  if ((var10 ^ -1) >= -1) {
                    break L218;
                  } else {
                    param7 = param7 >> var10;
                    param0 = param0 >> var10;
                    param4 = param4 >> var10;
                    break L218;
                  }
                }
                L219: {
                  var10 = param0 + -param7;
                  var11 = -param8 + param6;
                  var12 = -1;
                  if (var11 != 0) {
                    var12 = gv.a(0, param5, param8, param0, var12, param1 ^ -15, param7, var10, var11, param4);
                    break L219;
                  } else {
                    break L219;
                  }
                }
                L220: {
                  if (-1 != (var10 ^ -1)) {
                    var12 = gv.a(0, param5, param7, param6, var12, 0, param8, var11, var10, param3);
                    break L220;
                  } else {
                    break L220;
                  }
                }
                L221: {
                  param0 = param0 - param4;
                  param8 = param8 - param3;
                  param7 = param7 - param4;
                  if (param1 == -15) {
                    break L221;
                  } else {
                    hm.g((byte) 96);
                    break L221;
                  }
                }
                L222: {
                  param6 = param6 - param3;
                  if (-1 != (var11 ^ -1)) {
                    var12 = gv.a(-param4, param5, param8, param0, var12, 0, param7, var10, var11, 0);
                    break L222;
                  } else {
                    break L222;
                  }
                }
                L223: {
                  if (0 == var10) {
                    break L223;
                  } else {
                    var12 = gv.a(-param3, param5, param7, param6, var12, 0, param8, var11, var10, 0);
                    break L223;
                  }
                }
                return var12;
              }
            }
            return -1;
          } else {
            return -1;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        ((hm) this).field_j.a(true, (iva) this);
        if (param3 < 101) {
          field_n = null;
          jaggl.OpenGL.glPixelStorei(3314, param2);
          jaggl.OpenGL.glTexSubImage2Di(((hm) this).field_i, 0, param7, param4, param6, param1, 32993, ((hm) this).field_j.field_od, param5, param0);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        } else {
          jaggl.OpenGL.glPixelStorei(3314, param2);
          jaggl.OpenGL.glTexSubImage2Di(((hm) this).field_i, 0, param7, param4, param6, param1, 32993, ((hm) this).field_j.field_od, param5, param0);
          jaggl.OpenGL.glPixelStorei(3314, 0);
          return;
        }
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
            hm.g((byte) -22);
            return param1 / (float)((hm) this).field_l;
        }
        return param1 / (float)((hm) this).field_l;
    }

    final void a(int param0, byte param1, int param2, byte[] param3, int param4, int param5, ft param6, int param7, int param8) {
        ((hm) this).field_j.a(true, (iva) this);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glPixelStorei(3314, param4);
        jaggl.OpenGL.glTexSubImage2Dub(((hm) this).field_i, 0, param0, param8, param7, param2, waa.a(param6, 1383), 5121, param3, param5);
        jaggl.OpenGL.glPixelStorei(3314, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
        int var10 = -48 % ((-62 - param1) / 60);
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
    }

    public final int b(int param0) {
        Object var3 = null;
        if (param0 != -7070) {
          var3 = null;
          ((hm) this).a(-114, 19, 79, 107, -106, (int[]) null, -103, 40);
          return ((hm) this).field_k;
        } else {
          return ((hm) this).field_k;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Off";
    }
}
