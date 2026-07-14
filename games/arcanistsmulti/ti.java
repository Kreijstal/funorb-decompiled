/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends df implements vb {
    private int field_K;
    mb field_P;
    String field_D;
    static String field_F;
    private ag field_O;
    static int field_N;
    dj field_Q;
    private ag field_E;
    static String field_C;
    boolean field_G;
    private int field_R;
    static ll[] field_I;
    static String field_M;
    sl field_H;
    private boolean field_J;

    ti(Object[] param0, int param1, int param2) {
        super(0, 0, 0, 0, (pf) null);
        ((ti) this).field_D = "";
        ((ti) this).field_Q = ia.field_c;
        ((ti) this).field_P = new mb((ti) this, ((ti) this).field_Q, param0, param1);
        ((ti) this).field_G = false;
        ((ti) this).field_P.field_o = (wc) this;
        ((ti) this).field_R = param2;
        ((ti) this).field_O = new ag("", (pf) (Object) new j((ti) this), (wc) this);
        ((ti) this).field_E = new ag();
        ((ti) this).field_E.field_r = (pf) (Object) new va();
        ((ti) this).field_E.field_o = (wc) this;
        ((ti) this).c(-83, (qm) (Object) ((ti) this).field_O);
        ((ti) this).c(-74, (qm) (Object) ((ti) this).field_E);
    }

    final boolean d(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -2116) {
          if (!((ti) this).field_J) {
            if (this.d(-2116)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          this.g(69);
          if (((ti) this).field_J) {
            return true;
          } else {
            L0: {
              if (!this.d(-2116)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    private final void i(int param0) {
        Object var3 = null;
        if (((ti) this).j(param0 + 2)) {
          this.b(((ti) this).field_n, ((ti) this).field_v, ((ti) this).field_K, ((ti) this).field_j, 65);
          if (param0 != 0) {
            var3 = null;
            ((ti) this).a((qm) null, -14, -32, 91);
            ((ti) this).field_G = false;
            ((ti) this).field_H.a(true);
            return;
          } else {
            ((ti) this).field_G = false;
            ((ti) this).field_H.a(true);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
          ((ti) this).field_E = null;
          ((ti) this).field_K = param0;
          this.b(param3, param2, param0, param1, 107);
          return;
        } else {
          ((ti) this).field_K = param0;
          this.b(param3, param2, param0, param1, 107);
          return;
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (((ti) this).d(-2116)) {
          if (null != ((ti) this).field_P.field_W) {
            L0: {
              var5 = ((ti) this).field_P.field_W.length;
              if (param3 == -100) {
                break L0;
              } else {
                if (98 != param3) {
                  L1: {
                    if (-106 == param3) {
                      break L1;
                    } else {
                      if (-105 != param3) {
                        if (-85 != (param3 ^ -1)) {
                          if ((param3 ^ -1) == -86) {
                            var6_int = ((ti) this).field_D.length();
                            if (var6_int <= 0) {
                              return true;
                            } else {
                              ((ti) this).field_D = ((ti) this).field_D.substring(0, var6_int + -1);
                              return true;
                            }
                          } else {
                            L2: {
                              if (param2 < 32) {
                                break L2;
                              } else {
                                if (param2 >= 128) {
                                  break L2;
                                } else {
                                  var6 = ((ti) this).field_D + param2;
                                  this.a(var6, -86);
                                  return true;
                                }
                              }
                            }
                            if (param1 <= -120) {
                              if (param3 == 80) {
                                this.i(0);
                                return false;
                              } else {
                                return this.a(param0, (byte) -125, param2, param3);
                              }
                            } else {
                              boolean discarded$2 = ((ti) this).d(59);
                              if (param3 == 80) {
                                this.i(0);
                                return false;
                              } else {
                                return this.a(param0, (byte) -125, param2, param3);
                              }
                            }
                          }
                        } else {
                          if (((ti) this).field_G) {
                            this.i(0);
                            return true;
                          } else {
                            this.g(-83);
                            return true;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (((ti) this).j(2)) {
                      break L3;
                    } else {
                      this.g(-62);
                      break L3;
                    }
                  }
                  var6_int = ((ti) this).field_H.field_P.field_k / ((ti) this).field_P.field_T;
                  if ((param3 ^ -1) != -106) {
                    L4: {
                      ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y - var6_int;
                      if ((((ti) this).field_P.field_Y ^ -1) <= -1) {
                        break L4;
                      } else {
                        ((ti) this).field_P.field_Y = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 > ((ti) this).field_P.field_Y) {
                        break L5;
                      } else {
                        ((ti) this).field_P.field_Y = -1 + var5;
                        break L5;
                      }
                    }
                    this.h(11149);
                    return true;
                  } else {
                    ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y + var6_int;
                    if ((((ti) this).field_P.field_Y ^ -1) <= -1) {
                      if (var5 <= ((ti) this).field_P.field_Y) {
                        ((ti) this).field_P.field_Y = -1 + var5;
                        this.h(11149);
                        return true;
                      } else {
                        this.h(11149);
                        return true;
                      }
                    } else {
                      ((ti) this).field_P.field_Y = 0;
                      if (var5 <= ((ti) this).field_P.field_Y) {
                        ((ti) this).field_P.field_Y = -1 + var5;
                        this.h(11149);
                        return true;
                      } else {
                        this.h(11149);
                        return true;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L6: {
              if (((ti) this).j(2)) {
                break L6;
              } else {
                this.g(-114);
                break L6;
              }
            }
            L7: {
              if (-100 == param3) {
                ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y + 1;
                break L7;
              } else {
                ((ti) this).field_P.field_Y = ((ti) this).field_P.field_Y - 1;
                break L7;
              }
            }
            L8: {
              if (0 <= ((ti) this).field_P.field_Y) {
                break L8;
              } else {
                ((ti) this).field_P.field_Y = 0;
                break L8;
              }
            }
            L9: {
              if (var5 <= ((ti) this).field_P.field_Y) {
                ((ti) this).field_P.field_Y = -1 + var5;
                break L9;
              } else {
                break L9;
              }
            }
            this.h(11149);
            return true;
          } else {
            if (param1 <= -120) {
              if (param3 == 80) {
                this.i(0);
                return false;
              } else {
                return this.a(param0, (byte) -125, param2, param3);
              }
            } else {
              boolean discarded$3 = ((ti) this).d(59);
              if (param3 == 80) {
                this.i(0);
                return false;
              } else {
                return this.a(param0, (byte) -125, param2, param3);
              }
            }
          }
        } else {
          return false;
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        Object var7 = null;
        if (param0) {
          if (((ti) this).j(2)) {
            this.i(0);
            return;
          } else {
            this.g(-107);
            return;
          }
        } else {
          var7 = null;
          boolean discarded$4 = ((ti) this).a(-2, (qm) null);
          if (((ti) this).j(2)) {
            this.i(0);
            return;
          } else {
            this.g(-107);
            return;
          }
        }
    }

    final static boolean a(int param0, int param1, boolean param2, qb param3, ll param4, nf param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var30 = null;
        byte[] var31 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        param6 = param6 + param3.field_x;
        param0 = param0 + param3.field_o;
        param1 = param1 + param3.field_o;
        var7 = param3.field_q;
        var8 = param3.field_y;
        if (param6 < param5.field_y) {
          if (param6 > -var7) {
            if (!param2) {
              L0: {
                if (param0 >= param5.field_H) {
                  break L0;
                } else {
                  if (param0 <= -var8) {
                    break L0;
                  } else {
                    L1: {
                      if (0 < param6) {
                        stackOut_13_0 = param6;
                        stackIn_14_0 = stackOut_13_0;
                        break L1;
                      } else {
                        stackOut_12_0 = 0;
                        stackIn_14_0 = stackOut_12_0;
                        break L1;
                      }
                    }
                    L2: {
                      var9 = stackIn_14_0;
                      var10 = param6 - -var7;
                      if (param5.field_y >= var10) {
                        break L2;
                      } else {
                        var10 = param5.field_y;
                        break L2;
                      }
                    }
                    L3: {
                      if (param0 <= 0) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L3;
                      } else {
                        stackOut_17_0 = param0;
                        stackIn_19_0 = stackOut_17_0;
                        break L3;
                      }
                    }
                    L4: {
                      var11 = stackIn_19_0;
                      var12 = param0 - -var8;
                      var10 = var10 - var9;
                      if (var12 <= param5.field_y) {
                        break L4;
                      } else {
                        var12 = param5.field_y;
                        break L4;
                      }
                    }
                    var12 = var12 - var11;
                    if ((1 & var10) <= 0) {
                      if ((1 & var12) <= 0) {
                        var13 = param5.field_hb * (var11 >> 1187429857) + (var9 >> 1098198273);
                        var14 = param5.field_hb - (var10 >> 1532577857);
                        var15 = (var11 + -param0) * param3.field_q - (-var9 - -param6);
                        var16 = var7 + -var10;
                        var17 = var9 - (param6 - (-param1 + var11) * param3.field_q);
                        var16 = var16 + var7;
                        var31 = param4.field_m;
                        var30 = param3.field_A;
                        var28 = var30;
                        var26 = var28;
                        var24 = var26;
                        var19 = var24;
                        var20 = var30.length;
                        var21 = var12;
                        L5: while (true) {
                          if (var21 > 0) {
                            var22 = var10;
                            L6: while (true) {
                              if (-1 <= var22) {
                                var17 = var17 + var16;
                                var13 = var13 + var14;
                                var15 = var15 + var16;
                                if (param4.field_m.length <= var13) {
                                  return false;
                                } else {
                                  var21 -= 2;
                                  continue L5;
                                }
                              } else {
                                L7: {
                                  if (-1 == var31[var13]) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (1 + var7 + (var17 + var7) >= var20) {
                                        break L8;
                                      } else {
                                        if (0 != var19[var7 + var17]) {
                                          break L7;
                                        } else {
                                          if (-1 != (var19[1 + (var7 + var17)] ^ -1)) {
                                            break L7;
                                          } else {
                                            if (var19[var17 - -var7 + var7] != 0) {
                                              break L7;
                                            } else {
                                              if (var19[var17 - (-var7 - var7) + 1] == 0) {
                                                break L8;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var30[var15] != 0) {
                                      return true;
                                    } else {
                                      if (var19[1 + var15] != -1) {
                                        return true;
                                      } else {
                                        if (-1 != var19[var7 + var15]) {
                                          return true;
                                        } else {
                                          if (var19[var7 + var15 - -1] == 0) {
                                            break L7;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var13++;
                                var15 += 2;
                                var17 += 2;
                                var22 -= 2;
                                continue L6;
                              }
                            }
                          } else {
                            return false;
                          }
                        }
                      } else {
                        var12--;
                        var13 = param5.field_hb * (var11 >> 1187429857) + (var9 >> 1098198273);
                        var14 = param5.field_hb - (var10 >> 1532577857);
                        var15 = (var11 + -param0) * param3.field_q - (-var9 - -param6);
                        var16 = var7 + -var10;
                        var17 = var9 - (param6 - (-param1 + var11) * param3.field_q);
                        var16 = var16 + var7;
                        var31 = param4.field_m;
                        var30 = param3.field_A;
                        var28 = var30;
                        var26 = var28;
                        var24 = var26;
                        var19 = var24;
                        var20 = var30.length;
                        var21 = var12;
                        L9: while (true) {
                          if (var21 > 0) {
                            var22 = var10;
                            L10: while (true) {
                              if (-1 <= var22) {
                                var17 = var17 + var16;
                                var13 = var13 + var14;
                                var15 = var15 + var16;
                                if (param4.field_m.length <= var13) {
                                  return false;
                                } else {
                                  var21 -= 2;
                                  continue L9;
                                }
                              } else {
                                L11: {
                                  if (-1 == var31[var13]) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (1 + var7 + (var17 + var7) >= var20) {
                                        break L12;
                                      } else {
                                        if (0 != var19[var7 + var17]) {
                                          break L11;
                                        } else {
                                          if (-1 != (var19[1 + (var7 + var17)] ^ -1)) {
                                            break L11;
                                          } else {
                                            if (var19[var17 - -var7 + var7] != 0) {
                                              break L11;
                                            } else {
                                              if (var19[var17 - (-var7 - var7) + 1] == 0) {
                                                break L12;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var30[var15] != 0) {
                                      return true;
                                    } else {
                                      if (var19[1 + var15] != -1) {
                                        return true;
                                      } else {
                                        if (-1 != var19[var7 + var15]) {
                                          return true;
                                        } else {
                                          if (var19[var7 + var15 - -1] == 0) {
                                            break L11;
                                          } else {
                                            return true;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var13++;
                                var15 += 2;
                                var17 += 2;
                                var22 -= 2;
                                continue L10;
                              }
                            }
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      L13: {
                        var10--;
                        if ((1 & var12) <= 0) {
                          break L13;
                        } else {
                          var12--;
                          break L13;
                        }
                      }
                      var13 = param5.field_hb * (var11 >> 1187429857) + (var9 >> 1098198273);
                      var14 = param5.field_hb - (var10 >> 1532577857);
                      var15 = (var11 + -param0) * param3.field_q - (-var9 - -param6);
                      var16 = var7 + -var10;
                      var17 = var9 - (param6 - (-param1 + var11) * param3.field_q);
                      var16 = var16 + var7;
                      var31 = param4.field_m;
                      var30 = param3.field_A;
                      var28 = var30;
                      var26 = var28;
                      var24 = var26;
                      var19 = var24;
                      var20 = var30.length;
                      var21 = var12;
                      L14: while (true) {
                        if (var21 > 0) {
                          var22 = var10;
                          L15: while (true) {
                            if (-1 <= var22) {
                              var17 = var17 + var16;
                              var13 = var13 + var14;
                              var15 = var15 + var16;
                              if (param4.field_m.length <= var13) {
                                return false;
                              } else {
                                var21 -= 2;
                                continue L14;
                              }
                            } else {
                              L16: {
                                if (-1 == var31[var13]) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (1 + var7 + (var17 + var7) >= var20) {
                                      break L17;
                                    } else {
                                      if (0 != var19[var7 + var17]) {
                                        break L16;
                                      } else {
                                        if (-1 != (var19[1 + (var7 + var17)] ^ -1)) {
                                          break L16;
                                        } else {
                                          if (var19[var17 - -var7 + var7] != 0) {
                                            break L16;
                                          } else {
                                            if (var19[var17 - (-var7 - var7) + 1] == 0) {
                                              break L17;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var30[var15] != 0) {
                                    return true;
                                  } else {
                                    if (var19[1 + var15] != -1) {
                                      return true;
                                    } else {
                                      if (-1 != var19[var7 + var15]) {
                                        return true;
                                      } else {
                                        if (var19[var7 + var15 - -1] == 0) {
                                          break L16;
                                        } else {
                                          return true;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var13++;
                              var15 += 2;
                              var17 += 2;
                              var22 -= 2;
                              continue L15;
                            }
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        this.a(param0, param1, param2, param3);
    }

    private final void a(String param0, int param1) {
        int var3 = 0;
        if (((ti) this).field_P.field_W == null) {
            return;
        }
        if (param1 >= -39) {
            ((ti) this).a(-126);
            var3 = this.a((byte) 78, param0.toLowerCase());
            if (!(0 != (var3 ^ -1))) {
                return;
            }
            ((ti) this).field_P.field_Y = var3;
            this.h(11149);
            ((ti) this).field_D = param0;
            return;
        }
        var3 = this.a((byte) 78, param0.toLowerCase());
        if (!(0 != (var3 ^ -1))) {
            return;
        }
        ((ti) this).field_P.field_Y = var3;
        this.h(11149);
        ((ti) this).field_D = param0;
    }

    final static void a(byte param0) {
        Object var2 = null;
        if (ce.field_g != null) {
          return;
        } else {
          ce.field_g = new String[31];
          ce.field_g[14] = jk.field_j;
          ce.field_g[0] = nj.field_g;
          ce.field_g[23] = ArcanistsMulti.field_H;
          ce.field_g[19] = tm.field_f;
          ce.field_g[21] = th.field_i;
          ce.field_g[6] = mb.field_Z;
          ce.field_g[20] = sd.field_g;
          ce.field_g[18] = mj.field_y;
          if (param0 == -90) {
            ce.field_g[2] = r.field_e;
            ce.field_g[26] = mn.field_w;
            ce.field_g[17] = ui.field_q;
            ce.field_g[28] = ji.field_l;
            ce.field_g[9] = ed.field_xb;
            ce.field_g[7] = se.field_J;
            ce.field_g[4] = da.field_a;
            ce.field_g[5] = he.field_b;
            ce.field_g[11] = eg.field_d;
            ce.field_g[1] = ol.field_a;
            ce.field_g[30] = mo.field_d;
            ce.field_g[29] = me.field_Q;
            ce.field_g[8] = null;
            ce.field_g[27] = ie.field_Lb;
            ce.field_g[22] = he.field_g;
            ce.field_g[15] = be.field_i;
            ce.field_g[24] = lh.field_a;
            ce.field_g[13] = gb.field_a;
            ce.field_g[25] = ab.field_q;
            return;
          } else {
            var2 = null;
            fk discarded$1 = ti.a((byte) 106, 40, (wf) null);
            ce.field_g[2] = r.field_e;
            ce.field_g[26] = mn.field_w;
            ce.field_g[17] = ui.field_q;
            ce.field_g[28] = ji.field_l;
            ce.field_g[9] = ed.field_xb;
            ce.field_g[7] = se.field_J;
            ce.field_g[4] = da.field_a;
            ce.field_g[5] = he.field_b;
            ce.field_g[11] = eg.field_d;
            ce.field_g[1] = ol.field_a;
            ce.field_g[30] = mo.field_d;
            ce.field_g[29] = me.field_Q;
            ce.field_g[8] = null;
            ce.field_g[27] = ie.field_Lb;
            ce.field_g[22] = he.field_g;
            ce.field_g[15] = be.field_i;
            ce.field_g[24] = lh.field_a;
            ce.field_g[13] = gb.field_a;
            ce.field_g[25] = ab.field_q;
            return;
          }
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((ti) this).j(2)) {
          if (0 != (((ti) this).field_P.field_Y ^ -1)) {
            if (((ti) this).field_P.field_W != null) {
              if (null != ((ti) this).field_H.field_O) {
                if (param0 == 11149) {
                  var2 = ((ti) this).field_H.field_P.field_k;
                  var3 = ((ti) this).field_P.field_T;
                  var4 = ((ti) this).field_P.field_k - var2;
                  if (0 >= var4) {
                    return;
                  } else {
                    L0: {
                      var5 = var3 * ((ti) this).field_P.field_Y;
                      var6 = ((ti) this).field_H.field_P.field_B.field_j + var5;
                      var7 = var2 >> 2028815234;
                      if (var7 <= var6) {
                        break L0;
                      } else {
                        L1: {
                          var8 = -(-var5 + var7 << -1059167856) / var4;
                          if (var8 >= 0) {
                            break L1;
                          } else {
                            var8 = 0;
                            break L1;
                          }
                        }
                        ((ti) this).field_H.field_O.field_L = var8;
                        break L0;
                      }
                    }
                    L2: {
                      var7 = (var2 * 3 >> 1435257826) - var3;
                      if (var7 >= var6) {
                        break L2;
                      } else {
                        L3: {
                          var8 = -(var7 + -var5 << 1431509104) / var4;
                          if (-65537 <= (var8 ^ -1)) {
                            break L3;
                          } else {
                            var8 = 65536;
                            break L3;
                          }
                        }
                        ((ti) this).field_H.field_O.field_L = var8;
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  ((ti) this).field_P = null;
                  var2 = ((ti) this).field_H.field_P.field_k;
                  var3 = ((ti) this).field_P.field_T;
                  var4 = ((ti) this).field_P.field_k - var2;
                  if (0 >= var4) {
                    return;
                  } else {
                    L4: {
                      var5 = var3 * ((ti) this).field_P.field_Y;
                      var6 = ((ti) this).field_H.field_P.field_B.field_j + var5;
                      var7 = var2 >> 2028815234;
                      if (var7 <= var6) {
                        break L4;
                      } else {
                        L5: {
                          var8 = -(-var5 + var7 << -1059167856) / var4;
                          if (var8 >= 0) {
                            break L5;
                          } else {
                            var8 = 0;
                            break L5;
                          }
                        }
                        ((ti) this).field_H.field_O.field_L = var8;
                        break L4;
                      }
                    }
                    L6: {
                      var7 = (var2 * 3 >> 1435257826) - var3;
                      if (var7 >= var6) {
                        break L6;
                      } else {
                        L7: {
                          var8 = -(var7 + -var5 << 1431509104) / var4;
                          if (-65537 <= (var8 ^ -1)) {
                            break L7;
                          } else {
                            var8 = 65536;
                            break L7;
                          }
                        }
                        ((ti) this).field_H.field_O.field_L = var8;
                        break L6;
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, qm param1) {
        if (param0 == 0) {
          param1.d((byte) 29);
          ((ti) this).field_D = "";
          ((ti) this).field_J = true;
          if (null != ((ti) this).field_o) {
            if (!(((ti) this).field_o instanceof wb)) {
              return true;
            } else {
              ((wb) (Object) ((ti) this).field_o).a(false, ((ti) this).field_J, (qm) this);
              return true;
            }
          } else {
            return true;
          }
        } else {
          ((ti) this).field_Q = null;
          param1.d((byte) 29);
          ((ti) this).field_D = "";
          ((ti) this).field_J = true;
          if (null != ((ti) this).field_o) {
            if (!(((ti) this).field_o instanceof wb)) {
              return true;
            } else {
              ((wb) (Object) ((ti) this).field_o).a(false, ((ti) this).field_J, (qm) this);
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0) {
        if (param0 == 0) {
          if (((ti) this).field_o instanceof ak) {
            ((ak) (Object) ((ti) this).field_o).a((ti) this, -6509);
            return;
          } else {
            return;
          }
        } else {
          ((ti) this).field_P = null;
          if (!(((ti) this).field_o instanceof ak)) {
            return;
          } else {
            ((ak) (Object) ((ti) this).field_o).a((ti) this, -6509);
            return;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        L0: {
          this.a(param2, param3, param1, param0, -76);
          ((ti) this).field_O.a(((ti) this).field_K, 0, param1 - 20, 0, -89);
          ((ti) this).field_E.a(((ti) this).field_K, 0, 20, param1 + -20, -73);
          if (((ti) this).field_G) {
            ((ti) this).field_H.a(-((ti) this).field_K + param2, ((ti) this).field_K, param1, 0, -110);
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 < 27) {
          String discarded$2 = ((ti) this).b(false);
          return;
        } else {
          return;
        }
    }

    final static fk a(byte param0, int param1, wf param2) {
        if (param0 != -30) {
          field_I = null;
          return sc.a(kd.a(param2, 100, param1), (byte) 68);
        } else {
          return sc.a(kd.a(param2, 100, param1), (byte) 68);
        }
    }

    final String b(boolean param0) {
        Object var3 = null;
        if (((ti) this).field_w) {
          if (!param0) {
            if (((ti) this).j(2)) {
              if (((ti) this).field_H.field_w) {
                if (-1 == ((ti) this).field_P.field_Q) {
                  if (((ti) this).field_P.g(126) != null) {
                    return ((ti) this).field_P.g(127).toString();
                  } else {
                    return this.b(false);
                  }
                } else {
                  return ((ti) this).field_P.field_W[((ti) this).field_P.field_Q].toString();
                }
              } else {
                if (((ti) this).field_P.g(126) != null) {
                  return ((ti) this).field_P.g(127).toString();
                } else {
                  return this.b(false);
                }
              }
            } else {
              if (((ti) this).field_P.g(126) != null) {
                return ((ti) this).field_P.g(127).toString();
              } else {
                return this.b(false);
              }
            }
          } else {
            var3 = null;
            int discarded$1 = this.a((byte) -128, (String) null);
            if (((ti) this).j(2)) {
              if (((ti) this).field_H.field_w) {
                if (-1 == ((ti) this).field_P.field_Q) {
                  if (((ti) this).field_P.g(126) != null) {
                    return ((ti) this).field_P.g(127).toString();
                  } else {
                    return this.b(false);
                  }
                } else {
                  return ((ti) this).field_P.field_W[((ti) this).field_P.field_Q].toString();
                }
              } else {
                if (((ti) this).field_P.g(126) != null) {
                  return ((ti) this).field_P.g(127).toString();
                } else {
                  return this.b(false);
                }
              }
            } else {
              if (((ti) this).field_P.g(126) != null) {
                return ((ti) this).field_P.g(127).toString();
              } else {
                return this.b(false);
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = ((ti) this).field_P.f(27825);
          var3 = var2;
          var4 = 0;
          if (var3 > ((ti) this).field_R) {
            var4 = 1;
            var3 = ((ti) this).field_R;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.b(((ti) this).field_n, ((ti) this).field_v, var3 + ((ti) this).field_K, ((ti) this).field_j, 55);
          ((ti) this).field_P.a(var2, 0, ((ti) this).field_v, 0, -50);
          ((ti) this).field_H = new sl(0, 0, 0, 0, (pf) (Object) new eb(), (qm) (Object) ((ti) this).field_P, (pf) null);
          if (var4 != 0) {
            ((ti) this).field_H.a(true, 1, rd.b(-15438));
            break L1;
          } else {
            break L1;
          }
        }
        ((ti) this).field_H.a(((ti) this).field_k - ((ti) this).field_K, ((ti) this).field_K, ((ti) this).field_v, 0, -114);
        ((ti) this).field_G = true;
        ((ti) this).c(-90, (qm) (Object) ((ti) this).field_H);
        this.h(11149);
        if (param0 >= -38) {
          ((ti) this).field_D = null;
          return;
        } else {
          return;
        }
    }

    private final int a(byte param0, String param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        param1 = param1.toLowerCase();
        var3 = 0;
        L0: while (true) {
          if (((ti) this).field_P.field_W.length <= var3) {
            if (param0 < 35) {
              boolean discarded$2 = ((ti) this).j(5);
              return -1;
            } else {
              return -1;
            }
          } else {
            var4 = ((ti) this).field_P.field_W[var3].toString().toLowerCase();
            if (!var4.startsWith(param1)) {
              var3++;
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    final void d(byte param0) {
        ((ti) this).field_J = false;
        this.d(param0);
    }

    final int g(byte param0) {
        if (param0 != 37) {
            ((ti) this).field_O = null;
            return ((ti) this).field_P.field_Y;
        }
        return ((ti) this).field_P.field_Y;
    }

    final boolean j(int param0) {
        if (param0 != 2) {
            Object var3 = null;
            int discarded$0 = this.a((byte) -123, (String) null);
            return ((ti) this).field_G;
        }
        return ((ti) this).field_G;
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8 = -94 / ((-42 - param4) / 35);
        return this.a(param0, param1, param2, param3, -105, param5, param6);
    }

    public static void k(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          boolean discarded$2 = ti.a(64, -6, true, (qb) null, (ll) null, (nf) null, 111);
          field_F = null;
          field_M = null;
          field_I = null;
          field_C = null;
          return;
        } else {
          field_F = null;
          field_M = null;
          field_I = null;
          field_C = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "You have earned as many wands as you are currently able to, and can now trade in all of your spells to purchase a prestige hat, which will appear within the game.<br>Be warned that, with every prestige hat you acquire, it will become increasingly harder to earn wands.";
        field_C = "Private";
        field_M = "Return to Main Menu";
    }
}
